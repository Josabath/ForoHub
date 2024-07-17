create table topicos (

    id bigint not null auto_increment,
    titulo varchar(200) not null,
    mensaje varchar(500) not null,
    fechaCreacion datetime not null,
    estadoActivo tinyint not null,
    autor varchar(100) not null,
    nombreCurso varchar(100) not null,

    primary key(id)

);