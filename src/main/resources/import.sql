INSERT INTO regiones (id, nombre) VALUES (1, 'Sudamérica')
INSERT INTO regiones (id, nombre) VALUES (2, 'Centroamérica')
INSERT INTO regiones (id, nombre) VALUES (3, 'Europa')
INSERT INTO regiones (id, nombre) VALUES (4, 'Asia')
INSERT INTO regiones (id, nombre) VALUES (5, 'Africa')


INSERT INTO clientes (nombre, apellido, email, create_at, region_id) VALUES('Nain', 'Acero', 'nain.acero24@gmail.com', '2020-08-24', 1)
INSERT INTO clientes (nombre, apellido, email, create_at, region_id) VALUES('Juan', 'Acero', 'juan.2020@gmail.com', '2020-08-24', 3)
INSERT INTO clientes (nombre, apellido, email, create_at, region_id) VALUES('Victor', 'Prueba', 'victor.2020@gmail.com', '2020-08-24',2)
INSERT INTO clientes (nombre, apellido, email, create_at, region_id) VALUES('Geovana', 'Acero', 'geovana.2020@gmail.com', '2020-08-24', 2)

INSERT INTO `usuarios` (username, password, enabled, nombre, apellido) VALUES ('user', '$2a$10$mkrS5EILzxEcjV23xj69peckzgBVRM4lRRiLSTiIKmE23QlZpj4WO', 1, 'Nain', 'Acero Mamani');
INSERT INTO `usuarios` (username, password, enabled, nombre, apellido) VALUES ('admin', '$2a$10$mkrS5EILzxEcjV23xj69peckzgBVRM4lRRiLSTiIKmE23QlZpj4WO', 1, 'Administrador', 'Administrador');

INSERT INTO `roles` (nombre) VALUES ('ROLE_USER');
INSERT INTO `roles` (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (1,1);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (2,2);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (2,1);

INSERT INTO productos (nombre, precio, create_at) VALUES('Panasonic Pantalla LCD', 259990, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Sony Camara digital DSC-W320B', 123490, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Apple iPod shuffle', 1499990, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Sony Notebook Z110', 37990, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Hewlett Packard Multifuncional F2280', 69990, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Bianchi Bicicleta Aro 26', 69990, NOW());
INSERT INTO productos (nombre, precio, create_at) VALUES('Mica Comoda 5 Cajones', 299990, NOW());

/* Creamos algunas facturas */
INSERT INTO facturas (descripcion, observacion, cliente_id, create_at) VALUES('Factura equipos de oficina', null, 1, NOW());

INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(1, 1, 1);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(2, 1, 4);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(1, 1, 5);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(1, 1, 7);

INSERT INTO facturas (descripcion, observacion, cliente_id, create_at) VALUES('Factura Bicicleta', 'Alguna nota importante!', 1, NOW());
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(3, 2, 6);
