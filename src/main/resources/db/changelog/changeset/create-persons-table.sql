CREATE TABLE IF NOT EXISTS persons
(
    id          BIGSERIAL PRIMARY KEY NOT NULL,
    gender      VARCHAR(10)           NOT NULL CHECK (gender IN ('male', 'female', 'other')),
    phone       VARCHAR(20),
    id_name     BIGINT                NOT NULL,
    id_location BIGINT                NOT NULL
);

ALTER TABLE persons
    ADD FOREIGN KEY (id_name) REFERENCES names (id),
    ADD FOREIGN KEY (id_location) REFERENCES locations (id);



