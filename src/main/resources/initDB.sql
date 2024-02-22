CREATE TABLE IF NOT EXISTS persons
(
    id    BIGSERIAL PRIMARY KEY NOT NULL,
    gender VARCHAR(10) NOT NULL CHECK (gender IN ('male', 'female', 'other')),
    phone VARCHAR(20),
    id_name BIGINT NOT NULL REFERENCES names(id),
    id_location BIGINT NOT NULL REFERENCES locations(id)
);

CREATE TABLE IF NOT EXISTS names
(
    id    BIGSERIAL PRIMARY KEY NOT NULL,
    title VARCHAR(10) NOT NULL,
    first VARCHAR(50) NOT NULL,
    last VARCHAR(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS locations
(
    id    BIGSERIAL PRIMARY KEY NOT NULL,
    id_street BIGINT NOT NULL REFERENCES streets(id),
    city VARCHAR(100) NOT NULL,
    country VARCHAR(100) NOT NULL,
    postCode INTEGER
);

CREATE TABLE IF NOT EXISTS streets
(
    id    BIGSERIAL PRIMARY KEY NOT NULL,
    number INTEGER NOT NULL,
    name VARCHAR(100) NOT NULL
);