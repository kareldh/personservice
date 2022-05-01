CREATE SCHEMA if not exists person;

CREATE TABLE if not exists person.person (
    id uuid PRIMARY KEY DEFAULT gen_random_uuid(),
    firstName varchar(128),
    lastName varchar(128),
    contractStartDate date,
    contractEndDate date
);