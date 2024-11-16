CREATE TABLE client
(
    id   SERIAL PRIMARY KEY,
    name VARCHAR(200) NOT NULL CHECK (LENGTH(name) BETWEEN 3 AND 200)
);

CREATE TABLE planet
(
    id   VARCHAR(50) PRIMARY KEY CHECK (id ~ '^[A-Z0-9]+$'),
    name VARCHAR(500) NOT NULL CHECK (LENGTH(name) >= 1)
);

CREATE TABLE ticket
(
    id             SERIAL PRIMARY KEY,
    created_at     TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    client_id      INT REFERENCES client (id) ON DELETE CASCADE,
    from_planet_id VARCHAR(50) REFERENCES planet (id) ON DELETE CASCADE,
    to_planet_id   VARCHAR(50) REFERENCES planet (id) ON DELETE CASCADE
);

