CREATE TABLE IF NOT EXISTS streets
(
    id     BIGSERIAL PRIMARY KEY NOT NULL,
    number INTEGER               NOT NULL,
    name   VARCHAR(100)          NOT NULL
);