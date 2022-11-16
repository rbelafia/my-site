INSERT into author (id, firstname, lastname) VALUES (nextval('hibernate_sequence'), 'Alice', 'A');
INSERT into author (id, firstname, lastname) VALUES (nextval('hibernate_sequence'), 'Bob', 'B');
INSERT into author (id, firstname, lastname) VALUES (nextval('hibernate_sequence'), 'Cyril', 'C');
INSERT into author (id, firstname, lastname) VALUES (nextval('hibernate_sequence'), 'Damien', 'D');

INSERT INTO article (id, name, description, year) VALUES (1, 'Title', 'Desc', 2020);

INSERT INTO article_author (article_id, authors_id) VALUES (1, 1), (1, 2), (1, 3), (1, 4);