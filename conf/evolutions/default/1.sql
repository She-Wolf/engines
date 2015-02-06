# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table accessory (
  id                        bigint not null,
  name                      varchar(255) not null,
  sku                       varchar(255) not null,
  url                       varchar(255) not null,
  constraint pk_accessory primary key (id))
;

create table category (
  id                        integer not null,
  cat                       varchar(255) not null,
  name                      varchar(255) not null,
  constraint pk_category primary key (id))
;

create table engine (
  id                        bigint not null,
  category_id               integer not null,
  name                      varchar(255) not null,
  power                     varchar(255) not null,
  rpm                       integer not null,
  weight                    integer not null,
  dimensions                varchar(255) not null,
  displacement              varchar(255) not null,
  imglink                   varchar(255) not null,
  constraint pk_engine primary key (id))
;

create table matcher (
  id                        bigint not null,
  acc_id                    bigint not null,
  engine_id                 bigint not null,
  constraint pk_matcher primary key (id))
;

create sequence accessory_seq;

create sequence category_seq;

create sequence engine_seq;

create sequence matcher_seq;

alter table engine add constraint fk_engine_category_1 foreign key (category_id) references category (id) on delete restrict on update restrict;
create index ix_engine_category_1 on engine (category_id);
alter table matcher add constraint fk_matcher_acc_2 foreign key (acc_id) references accessory (id) on delete restrict on update restrict;
create index ix_matcher_acc_2 on matcher (acc_id);
alter table matcher add constraint fk_matcher_engine_3 foreign key (engine_id) references engine (id) on delete restrict on update restrict;
create index ix_matcher_engine_3 on matcher (engine_id);



# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists accessory;

drop table if exists category;

drop table if exists engine;

drop table if exists matcher;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists accessory_seq;

drop sequence if exists category_seq;

drop sequence if exists engine_seq;

drop sequence if exists matcher_seq;

