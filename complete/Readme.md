use orhp_book_library;

CREATE TABLE `orhp_book_library`.`author` (
`Id` INT NOT NULL AUTO_INCREMENT,
`Name` NVARCHAR(100) NULL,
PRIMARY KEY (`Id`));

CREATE TABLE `orhp_book_library`.`book` (
`id` INT NOT NULL AUTO_INCREMENT,
`name` NVARCHAR(100) NULL,author_id INT,
PRIMARY KEY (`id`), FOREIGN KEY fk_author(author_id) REFERENCES author(id));


INSERT INTO `orhp_book_library`.`author` (id, name) VALUES (1,'Albert Einstein'); #The World As I See it
INSERT INTO `orhp_book_library`.`author` (id, name) VALUES (2,'Hunter Biden'); #Beautiful Things
INSERT INTO `orhp_book_library`.`author` (id, name) VALUES (3,'Mary Kom'); #Unbreakable
INSERT INTO `orhp_book_library`.`author` (id, name) VALUES (4,'Henry Miller'); #The World As I See it
INSERT INTO `orhp_book_library`.`author` (id, name) VALUES (5,'Test Me'); #The World As I See it

commit;

INSERT INTO `orhp_book_library`.`book`
SET name = 'The World As I See it',
author_id = (
SELECT id
FROM author
WHERE name = 'Albert Einstein');

INSERT INTO `orhp_book_library`.`book`
SET name = 'Relativity',
author_id = (
SELECT id
FROM author
WHERE name = 'Albert Einstein');

INSERT INTO `orhp_book_library`.`book`
SET name = 'Why Socialism',
author_id = (
SELECT id
FROM author
WHERE name = 'Albert Einstein');

INSERT INTO `orhp_book_library`.`book`
SET name = 'Evolution of Physics',
author_id = (
SELECT id
FROM author
WHERE name = 'Albert Einstein');

INSERT INTO `orhp_book_library`.`book`
SET name = 'Out of my later years',
author_id = (
SELECT id
FROM author
WHERE name = 'Albert Einstein');


INSERT INTO `orhp_book_library`.`book`
SET name = 'Beautiful Things',
author_id = (
SELECT id
FROM author
WHERE name = 'Hunter Biden');

INSERT INTO `orhp_book_library`.`book`
SET name = 'Unbreakable',
author_id = (
SELECT id
FROM author
WHERE name = 'Mary Kom');

INSERT INTO `orhp_book_library`.`book`
SET name = 'Miller Book1',
author_id = (
SELECT id
FROM author
WHERE name = 'Henry Miller');

INSERT INTO `orhp_book_library`.`book`
SET name = 'Working on React',
author_id = (
SELECT id
FROM author
WHERE name = 'Test Me');

INSERT INTO `orhp_book_library`.`book`
SET name = 'Real Democracy',
author_id = (
SELECT id
FROM author
WHERE name = 'Hunter Biden');

select * from book;

select * from author;       