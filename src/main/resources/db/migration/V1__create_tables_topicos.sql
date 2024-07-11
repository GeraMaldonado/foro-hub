CREATE TABLE topicos(
    id BIGINT NOT NULL AUTO_INCREMENT,
    titulo VARCHAR(100) NOT NULL,
    mensaje TEXT NOT NULL,
    fecha_de_creacion DATETIME NOT NULL,
    status VARCHAR(100) NOT NULL,
    autor VARCHAR(100) NOT NULL,
    curso VARCHAR(100) NOT NULL,
    PRIMARY KEY(id)
);