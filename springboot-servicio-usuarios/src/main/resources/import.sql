insert into usuarios (username,password,enabled,nombre,apellido,email) values ('gabi','$2a$10$kIfTEhM4dE8A4c8lWZDSqOMqGUCgtkeMpC1DBPP76JqGfjzUKEU2y',1,'gabi','casas','gabicasas@gmail.com');
insert into usuarios (username,password,enabled,nombre,apellido,email) values ('gabriel','$2a$10$VhDBkyRk/Ur98T.nEZHBDOEw.NZo45wNDo4MNjr0qUlWmOBN7T3ne',1,'gabi','casas','gabicasasss@gmail.com')

insert into roles (nombre) values ('ROLE_ADMIN');
insert into roles (nombre) values ('ROLE_USER');


insert into usuarios_roles (usuario_id,roles_id) values (1,1);
insert into usuarios_roles (usuario_id,roles_id) values (2,2);