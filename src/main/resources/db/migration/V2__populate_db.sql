INSERT INTO client (name)
VALUES ('Bohdan Kovalenko'),
       ('Iryna Ivanova'),
       ('Maksym Petrov'),
       ('Kateryna Sydorova'),
       ('Mykola Shevchenko'),
       ('Olena Vasylenko'),
       ('Yuriy Hordiychuk'),
       ('Daryna Kozak'),
       ('Artem Klymenko'),
       ('Viktoriya Tymoshenko');

INSERT INTO planet (id, name)
VALUES ('EARTH', 'Earth'),
       ('MARS', 'Mars'),
       ('VENUS', 'Venus'),
       ('JUPITER', 'Jupiter'),
       ('SATURN', 'Saturn');

INSERT INTO ticket (client_id, from_planet_id, to_planet_id)
VALUES (1, 'EARTH', 'MARS'),
       (2, 'MARS', 'VENUS'),
       (3, 'VENUS', 'EARTH'),
       (4, 'JUPITER', 'SATURN'),
       (5, 'SATURN', 'EARTH'),
       (6, 'EARTH', 'JUPITER'),
       (7, 'MARS', 'SATURN'),
       (8, 'VENUS', 'JUPITER'),
       (9, 'JUPITER', 'EARTH'),
       (10, 'SATURN', 'MARS');

