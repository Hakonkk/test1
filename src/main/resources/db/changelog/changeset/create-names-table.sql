CREATE TABLE IF NOT EXISTS names
(
    id    BIGSERIAL PRIMARY KEY NOT NULL,
    title VARCHAR(10)           NOT NULL,
    first VARCHAR(50)           NOT NULL,
    last  VARCHAR(50)           NOT NULL
);