CREATE TABLE IF NOT EXISTS locations
(
    id        BIGSERIAL PRIMARY KEY NOT NULL,
    id_street BIGINT                NOT NULL,
    city      VARCHAR(100)          NOT NULL,
    country   VARCHAR(100)          NOT NULL,
    postCode  INTEGER
);

ALTER TABLE locations
    ADD FOREIGN KEY (id_street) REFERENCES streets (id);