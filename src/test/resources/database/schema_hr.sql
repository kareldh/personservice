CREATE SCHEMA if not exists hr;

CREATE TABLE if not exists hr.person (
    id uuid PRIMARY KEY DEFAULT gen_random_uuid(),
    firstName varchar(128),
    lastName varchar(128),
    contractStartDate date,
    contractEndDate date
);