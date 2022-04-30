CREATE SCHEMA if not exists hr;

CREATE TABLE if not exists hr.person (
    id uuid PRIMARY KEY DEFAULT gen_random_uuid(),
    contractStartDate date,
    contractEndDate date
);