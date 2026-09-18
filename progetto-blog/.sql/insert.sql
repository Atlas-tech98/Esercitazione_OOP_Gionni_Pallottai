INSERT INTO authors (firstname, lastname, email)
value ("Mario", "Rossi", "RossiM@test.it");

INSERT INTO authors (firstname, lastname, email)
value ("Giuseppe", "Verdi", "GiuseppeV@test.it");

INSERT INTO posts(title, body, publish_date, author_id)
SELECT 'ciao....Questo è un articolo', 'saluti', null, id
FROM authors
where firstname = 'Mario'
and lastname = 'Rossi';

INSERT INTO posts(title, body, publish_date, author_id)
SELECT 'ciao....Questo è un non è un articolo', 'no ti saluto', null, id
FROM authors
where firstname = 'Mario'
and lastname = 'Rossi';

INSERT INTO comments(email, body, date, post_id)
value ("crimson@mail.it", "Lorem ipsum...", "20260918", 1),
        ("crimson@mail.it", "Lorem ipsum...", "20260918", 2);