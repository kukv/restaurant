drop table if exists reservations.cancel_commission_collect;
drop table if exists reservations.cancel_commission;
drop table if exists reservations.reservation_cancel;
drop table if exists reservations.already_guided_reservation;
drop table if exists reservations.cuisine;
drop table if exists reservations.course;
drop table if exists reservations.course_type;
drop table if exists reservations.contact;
drop table if exists reservations.profile;
drop table if exists reservations.visit;
drop table if exists reservations.receipt;
drop sequence reservations.receipt_serial_number;

create sequence reservations.receipt_serial_number cycle;

create table reservations.receipt(
    receipt_number varchar(50)                  not null primary key,
    created_at     timestamp without time zone  not null default current_timestamp
);
comment on table  reservations.receipt                is '予約受付';
comment on column reservations.receipt.receipt_number is '予約受付番号';
comment on column reservations.receipt.created_at     is '作成日時';

create table reservations.visit(
    id                  serial                      not null primary key,
    receipt_number      varchar(50)                 not null,
    visit_date          date                        not null,
    visit_time          time                        not null,
    number_of_visitors  integer                     not null,
    created_at          timestamp without time zone not null default current_timestamp,

    foreign key (receipt_number) references reservations.receipt (receipt_number)
);
comment on table  reservations.visit                    is '来店予定';
comment on column reservations.visit.id                 is '来店予定ID';
comment on column reservations.visit.receipt_number     is '予約受付番号';
comment on column reservations.visit.visit_date         is '来店予定日';
comment on column reservations.visit.visit_time         is '来店予定時刻';
comment on column reservations.visit.number_of_visitors is '来店人数';
comment on column reservations.visit.created_at         is '作成日時';

create table reservations.profile(
    id                  serial                      not null primary key,
    receipt_number      varchar(50)                 not null,
    name                varchar(30)                 not null,
    birthdate           date                        not null,
    created_at          timestamp without time zone not null default current_timestamp,

    foreign key (receipt_number) references reservations.receipt (receipt_number)
);
comment on table  reservations.profile                    is '予約者プロフィール';
comment on column reservations.profile.id                 is '予約者プロフィールID';
comment on column reservations.profile.receipt_number     is '予約受付番号';
comment on column reservations.profile.name               is '予約者氏名';
comment on column reservations.profile.birthdate          is '生年月日';
comment on column reservations.profile.created_at         is '作成日時';

create table reservations.contact(
    id                  serial                      not null primary key,
    receipt_number      varchar(50)                 not null,
    phone_number        varchar(11)                 not null,
    mail_address        varchar(128)                not null,
    created_at          timestamp without time zone not null default current_timestamp,

    foreign key (receipt_number) references reservations.receipt (receipt_number)
);
comment on table  reservations.contact                    is '予約者連絡先';
comment on column reservations.contact.id                 is '予約者連絡先ID';
comment on column reservations.contact.receipt_number     is '予約受付番号';
comment on column reservations.contact.phone_number       is '電話番号';
comment on column reservations.contact.mail_address       is 'メールアドレス';
comment on column reservations.contact.created_at         is '作成日時';

create table reservations.course_type(
    type varchar(5) not null primary key
);
comment on table  reservations.course_type      is '予約コース種別';
comment on column reservations.course_type.type is '種別';

create table reservations.course(
    id                  serial                      not null primary key,
    receipt_number      varchar(50)                 not null,
    course_type         varchar(5)                  not null,
    created_at          timestamp without time zone not null default current_timestamp,

    foreign key (receipt_number) references reservations.receipt (receipt_number),
    foreign key (course_type) references reservations.course_type (type)
);
comment on table  reservations.course                   is '予約コース';
comment on column reservations.course.id                is '予約コースID';
comment on column reservations.course.receipt_number    is '予約受付番号';
comment on column reservations.course.course_type       is '予約コース種別';
comment on column reservations.course.created_at        is '作成日時';

create table reservations.cuisine(
    course_id       integer                     not null primary key,
    cuisine_number  integer                     not null,
    amount          integer                     not null,

    foreign key (course_id) references reservations.course (id)
);
comment on table  reservations.cuisine                   is '予約コース料理';
comment on column reservations.cuisine.course_id         is '予約コースID';
comment on column reservations.cuisine.cuisine_number    is '予約コース料理番号';
comment on column reservations.cuisine.amount            is '予約コース料理金額';

create table reservations.already_guided_reservation(
    id                  serial                      not null primary key,
    receipt_number      varchar(50)                 not null,
    guided_at           timestamp without time zone not null,
    created_at          timestamp without time zone not null default current_timestamp,

    foreign key (receipt_number) references reservations.receipt (receipt_number),
    constraint country_already_guided_receipt_number_unique unique (receipt_number)
);
comment on table  reservations.already_guided_reservation                   is '案内済みの予約';
comment on column reservations.already_guided_reservation.id                is '案内済みの予約ID';
comment on column reservations.already_guided_reservation.receipt_number    is '予約受付番号';
comment on column reservations.already_guided_reservation.guided_at         is '案内日時';
comment on column reservations.already_guided_reservation.created_at        is '作成日時';

create table reservations.reservation_cancel(
    id                  serial                      not null primary key,
    receipt_number      varchar(50)                 not null,
    reason              varchar(100)                not null,
    canceled_at         timestamp without time zone not null,
    created_at          timestamp without time zone not null default current_timestamp,

    foreign key (receipt_number) references reservations.receipt (receipt_number),
    constraint country_reservation_cancel_receipt_number_unique unique (receipt_number)
);
comment on table  reservations.reservation_cancel                   is '予約キャンセル';
comment on column reservations.reservation_cancel.id                is '予約キャンセルID';
comment on column reservations.reservation_cancel.receipt_number    is '予約受付番号';
comment on column reservations.reservation_cancel.reason            is '理由';
comment on column reservations.reservation_cancel.canceled_at       is '予約キャンセル日時';
comment on column reservations.reservation_cancel.created_at        is '作成日時';

create table reservations.cancel_commission(
    id                      serial                      not null primary key,
    reservation_cancel_id   integer                     not null,
    amount                  integer                     not null,
    charge_at               timestamp without time zone not null,
    created_at              timestamp without time zone not null default current_timestamp,

    foreign key (reservation_cancel_id) references reservations.reservation_cancel (id)
);
comment on table  reservations.cancel_commission                        is '予約キャンセル手数料';
comment on column reservations.cancel_commission.id                     is '予約キャンセル手数料ID';
comment on column reservations.cancel_commission.reservation_cancel_id  is '予約受付番号';
comment on column reservations.cancel_commission.amount                 is 'キャンセル手数料';
comment on column reservations.cancel_commission.charge_at              is '予約キャンセル手数料請求日時';
comment on column reservations.cancel_commission.created_at             is '作成日時';

create table reservations.cancel_commission_collect(
    cancel_commission_id    integer                     not null primary key,
    collected_at            timestamp without time zone not null,
    created_at              timestamp without time zone not null default current_timestamp,

    foreign key (cancel_commission_id) references reservations.cancel_commission (id)
);
comment on table  reservations.cancel_commission_collect                        is '予約キャンセル手数料徴収';
comment on column reservations.cancel_commission_collect.cancel_commission_id   is '予約キャンセル手数料ID';
comment on column reservations.cancel_commission_collect.collected_at           is '予約キャンセル手数料徴収日時';
comment on column reservations.cancel_commission_collect.created_at             is '作成日時';
