create table if not exists movie
(
    name varchar(255) null,
    genre varchar(255) null,
    url_stream varchar(255) null
);

insert into movie(name, genre, url_stream) values('IT', 'terror', 'what');
insert into movie(name, genre, url_stream) values('La masacre de texas', 'terror', 'what');
insert into movie(name, genre, url_stream) values('Jack el destripador', 'terror', 'what');
insert into movie(name, genre, url_stream) values('Anabelle', 'terror', 'what');
insert into movie(name, genre, url_stream) values('Fast and Furious', 'acción', 'what');
insert into movie(name, genre, url_stream) values('shadow', 'acción', 'what');
insert into movie(name, genre, url_stream) values('Orgullo y prejuicio', 'romance', 'what');
insert into movie(name, genre, url_stream) values('The notebook', 'romance', 'what');