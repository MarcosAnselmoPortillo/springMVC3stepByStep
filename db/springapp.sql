CREATE DATABASE springapp;

GRANT ALL ON springapp.* TO springappuser@'%' IDENTIFIED BY 'pspringappuser';
GRANT ALL ON springapp.* TO springappuser@localhost IDENTIFIED BY 'pspringappuser';

USE springapp;

CREATE TABLE productos (
  id INTEGER PRIMARY KEY,
  descripcion varchar(255),
  precio decimal(15,2)
);
CREATE INDEX descripcion_productos ON productos(descripcion);