# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table login (
  id                        varchar(255) not null,
  name                      varchar(255),
  constraint pk_login primary key (id))
;

create sequence login_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists login;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists login_seq;

