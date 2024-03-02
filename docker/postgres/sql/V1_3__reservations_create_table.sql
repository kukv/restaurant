drop table if exists reservations.restaurant_application_linkage;
drop table if exists reservations.already_guided_reservation;
drop table if exists reservations.cancel_fee_collected;
drop table if exists reservations.cancel_fee;
drop table if exists reservations.cancel_policy;
drop table if exists reservations.cancel_reservation_reason;
drop table if exists reservations.canceled_reservation;
drop table if exists reservations.reservation_holder_contact;
drop table if exists reservations.reservation_holder_profile;
drop table if exists reservations.reservation_course;
drop table if exists reservations.reservation;
drop table if exists reservations.reservation_type;

create table reservations.reservation_type(
    type varchar(50) not null primary key
);
comment on table  reservations.reservation_type      is '予約種別';
comment on column reservations.reservation_type.type is '種別';
insert into reservations.reservation_type(type)
values ('席のみ予約'),
       ('コース予約');

create table reservations.reservation(
    id                  uuid                        not null primary key,
    reservation_type    varchar(50)                 not null,
    reservation_date    date                        not null,
    reservation_time    time(4)                     not null,
    created_at          timestamp without time zone not null default current_timestamp,

    foreign key (reservation_type) references reservations.reservation_type (type)
);
comment on table  reservations.reservation                  is '予約';
comment on column reservations.reservation.id               is '予約ID';
comment on column reservations.reservation.reservation_type is '予約種別';
comment on column reservations.reservation.reservation_date is '予約日';
comment on column reservations.reservation.reservation_time is '予約時間';
comment on column reservations.reservation.created_at       is '作成日時';

create table reservations.reservation_course(
    id              serial                      not null primary key,
    reservation_id  uuid                        not null,
    course_name     varchar(100)                not null,
    created_at      timestamp without time zone not null default current_timestamp,

    foreign key (reservation_id) references reservations.reservation (id)
);
comment on table  reservations.reservation_course                  is '予約コース';
comment on column reservations.reservation_course.id               is '予約コースID';
comment on column reservations.reservation_course.reservation_id   is '予約ID';
comment on column reservations.reservation_course.course_name      is '予約コース名';
comment on column reservations.reservation_course.created_at       is '作成日時';

create table reservations.reservation_holder_profile(
    id              serial                      not null primary key,
    reservation_id  uuid                        not null,
    name            varchar(50)                 not null,
    birth_date      date                        not null,
    created_at      timestamp without time zone not null default current_timestamp,

    foreign key (reservation_id) references reservations.reservation (id)
);
comment on table  reservations.reservation_holder_profile                  is '予約者プロフィール';
comment on column reservations.reservation_holder_profile.id               is '予約者プロフィールID';
comment on column reservations.reservation_holder_profile.reservation_id   is '予約ID';
comment on column reservations.reservation_holder_profile.name             is '予約者氏名';
comment on column reservations.reservation_holder_profile.birth_date       is '予約者生年月日';
comment on column reservations.reservation_holder_profile.created_at       is '作成日時';

create table reservations.reservation_holder_contact(
    id              serial                      not null primary key,
    reservation_id  uuid                        not null,
    phone_number    varchar(13)                 not null,
    created_at      timestamp without time zone not null default current_timestamp,

    foreign key (reservation_id) references reservations.reservation (id)
);
comment on table  reservations.reservation_holder_contact                  is '予約者連絡先';
comment on column reservations.reservation_holder_contact.id               is '予約者連絡先ID';
comment on column reservations.reservation_holder_contact.reservation_id   is '予約ID';
comment on column reservations.reservation_holder_contact.phone_number     is '予約者電話番号';
comment on column reservations.reservation_holder_contact.created_at       is '作成日時';

create table reservations.canceled_reservation(
    id              serial                      not null primary key,
    reservation_id  uuid                        not null,
    canceled_at     timestamp without time zone not null default current_timestamp,

    foreign key (reservation_id) references reservations.reservation (id),
    constraint country_canceled_reservation_reservation_id_unique unique (reservation_id)
);
comment on table  reservations.canceled_reservation                  is 'キャンセル済みの予約';
comment on column reservations.canceled_reservation.id               is 'キャンセルID';
comment on column reservations.canceled_reservation.reservation_id   is '予約ID';
comment on column reservations.canceled_reservation.canceled_at      is 'キャンセル日時';

create table reservations.cancel_reservation_reason(
    canceled_reservation_id integer                     not null primary key,
    reason                  text                        not null,

    foreign key (canceled_reservation_id) references reservations.canceled_reservation (id)
);
comment on table  reservations.cancel_reservation_reason                           is '予約キャンセル理由';
comment on column reservations.cancel_reservation_reason.canceled_reservation_id   is 'キャンセル済みの予約ID';
comment on column reservations.cancel_reservation_reason.reason                    is '理由';

create table reservations.cancel_policy(
    id                  serial      not null primary key,
    reservation_type    varchar(50) not null,
    interval_days       varchar(12) not null,
    fee_rate            decimal(3, 2) not null,

    foreign key (reservation_type) references reservations.reservation_type (type),

    constraint country_cancel_policy_reservation_type_interval_days_unique unique (reservation_type, interval_days)
);
comment on table  reservations.cancel_policy                          is 'キャンセルポリシー';
comment on column reservations.cancel_policy.id                       is 'キャンセルポリシーID';
comment on column reservations.cancel_policy.reservation_type         is '予約種別';
comment on column reservations.cancel_policy.interval_days            is '予約日からキャンセル日までの間隔';
comment on column reservations.cancel_policy.fee_rate                 is 'キャンセル料(パーセンテージ)';
insert into reservations.cancel_policy(reservation_type, interval_days, fee_rate)
values  ('席のみ予約', '予約日当日', 0),
        ('席のみ予約', '予約日前日', 0),
        ('席のみ予約', '予約日前日の2日前以前', 0),
        ('コース予約', '予約日当日', 1.0),
        ('コース予約', '予約日前日', 0.5),
        ('コース予約', '予約日前日の2日前以前', 0);

create table reservations.cancel_fee(
    id                      serial      not null primary key,
    canceled_reservation_id integer     not null,
    cancel_policy_id        integer     not null,
    fee                     integer     not null,

    foreign key (canceled_reservation_id) references reservations.canceled_reservation (id),
    foreign key (cancel_policy_id)        references reservations.cancel_policy (id),

    constraint country_course_cancel_fee_canceled_reservation_id_unique unique (canceled_reservation_id)
);
comment on table  reservations.cancel_fee                            is 'キャンセル料';
comment on column reservations.cancel_fee.id                         is 'キャンセル料ID';
comment on column reservations.cancel_fee.canceled_reservation_id    is 'キャンセル済みの予約ID';
comment on column reservations.cancel_fee.cancel_policy_id           is 'キャンセルポリシー';
comment on column reservations.cancel_fee.fee                        is 'キャンセル料(円)';

create table reservations.cancel_fee_collected(
    cancel_fee_id    integer                     not null primary key,
    collected_at     timestamp without time zone not null default current_timestamp,

    foreign key (cancel_fee_id) references reservations.cancel_fee (id)
);
comment on table  reservations.cancel_fee_collected                is 'キャンセル料徴収済み';
comment on column reservations.cancel_fee_collected.cancel_fee_id  is 'キャンセル料ID';
comment on column reservations.cancel_fee_collected.collected_at   is '徴収日時';

create table reservations.already_guided_reservation(
    id              serial                      not null primary key,
    reservation_id  uuid                        not null,
    guided_at       timestamp without time zone not null default current_timestamp,

    foreign key (reservation_id) references reservations.reservation (id),
    constraint country_already_guided_reservation_reservation_id_unique unique (reservation_id)
);
comment on table  reservations.already_guided_reservation                  is '案内済みの予約';
comment on column reservations.already_guided_reservation.id               is '案内済みの予約ID';
comment on column reservations.already_guided_reservation.reservation_id   is '予約ID';
comment on column reservations.already_guided_reservation.guided_at        is '案内日時';

create table reservations.restaurant_application_linkage(
    reservation_id  uuid    not null primary key,
    diner_id        integer not null,

    foreign key (reservation_id) references reservations.reservation (id)
);
comment on table  reservations.restaurant_application_linkage                 is 'レストランアプリとの連携';
comment on column reservations.restaurant_application_linkage.reservation_id  is '予約ID';
comment on column reservations.restaurant_application_linkage.diner_id        is 'ディナー客ID';
