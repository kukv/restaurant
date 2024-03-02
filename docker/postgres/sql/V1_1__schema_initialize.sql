drop schema if exists sandbox cascade;
create schema sandbox;
comment on schema sandbox is 'sandboxスキーマ';

drop schema if exists reservations cascade;
create schema reservations;
comment on schema reservations is '予約情報を管理するスキーマ';
