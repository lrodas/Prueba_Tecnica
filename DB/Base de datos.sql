create database pruebaTecnica;
use pruebaTecnica;
create table cliente (
	codigo_cliente INT NOT NULL PRIMARY KEY auto_increment,
	DPI varchar(15) NOT NULL,
    nombre_completo VARCHAR(150) NOT NULL,
    fecha_nacimiento DATE NOT NULL,
    telefono VARCHAR(10),
    estado_civil VARCHAR(10),
    departamento VARCHAR(50),
    municipio VARCHAR(50),
    fecha_registro DATE
)engine=INNODB;

CREATE TABLE prestamo (
	codigo_prestamo INT NOT NULL PRIMARY KEY auto_increment,
    codigo_cliente INT NOT NULL,
    cantidad_cuotas INT NOT NULL,
    fecha_ingreso DATE NOT NULL,
    CONSTRAINT fk_cliente FOREIGN KEY (codigo_cliente) REFERENCES cliente (codigo_cliente) ON DELETE CASCADE ON UPDATE CASCADE
)engine=INNODB;