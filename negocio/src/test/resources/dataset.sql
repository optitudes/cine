insert into admin_teatro values (1, "4587", "admin1@gmail.com");
insert into admin_teatro values (2, "7854", "admin2@gmail.com");
insert into admin_teatro values (3, "6941", "admin3@gmail.com");
insert into admin_teatro values (4, "2151", "admin4@gmail.com");
insert into admin_teatro values (5, "6341", "admin5@gmail.com");


insert into administrador values (1, "7567", "administrador1@gmail.com");
insert into administrador values (2, "6544", "administrador2@gmail.com");
insert into administrador values (3, "5651", "administrador3@gmail.com");
insert into administrador values (4, "5641", "administrador4@gmail.com");
insert into administrador values (5, "5331", "administrador5@gmail.com");

insert into Ciudad values (1, "Armenia");
insert into Ciudad values (2, "Pereira");
insert into Ciudad values (3, "Manizales");
insert into Ciudad values (4, "Cali");
insert into Ciudad values (5, "Cali");

insert into tarjeta (id_tarjeta,tipo_tarjeta)values (1,1);
insert into tarjeta (id_tarjeta,tipo_tarjeta)values (2,1);
insert into tarjeta (id_tarjeta,tipo_tarjeta)values (3,2);
insert into tarjeta (id_tarjeta,tipo_tarjeta)values (4,1);
insert into tarjeta (id_tarjeta,tipo_tarjeta)values (5,2);

insert into Cliente (cedula, contrasenia, email, img_perfil, nombre_completo, estado) values (1, "1234", "jhon@gmail.com", "ruta1", "Jhon", 1,1,1);
insert into Cliente (cedula, contrasenia, email, img_perfil, nombre_completo, estado) values (2, "1235", "luis@gmail.com", "ruta2", "Luis", 0,2,2);
insert into Cliente (cedula, contrasenia, email, img_perfil, nombre_completo, estado) values (3, "1236", "luisa@gmail.com", "ruta3", "Luisa", 1,3,3);
insert into Cliente (cedula, contrasenia, email, img_perfil, nombre_completo, estado) values (4, "1237", "carlos@gmail.com", "ruta4", "Carlos", 1,4,4);
insert into Cliente (cedula, contrasenia, email, img_perfil, nombre_completo, estado) values (5, "1238", "david@gmail.com", "ruta5", "David", 1,1,5);


insert into cliente_telefonos values (1, "123456");
insert into cliente_telefonos values (2, "564746");
insert into cliente_telefonos values (3, "5654523");
insert into cliente_telefonos values (4, "2235678");
insert into cliente_telefonos values (5, "3455678");

insert into confiteria values(1,"url","galletas",2000);
insert into confiteria values(2,"url","papitas picantes",6000);
insert into confiteria values(3,"url","yupi",3000);
insert into confiteria values(4,"url","perro caliente",12000);
insert into confiteria values(5,"url","hamburguesa",23000);

insert into horario(1,"2022-10-10");
insert into horario(2,"2022-10-13");
insert into horario(3,"2022-10-14");
insert into horario(4,"2022-10-16");
insert into horario(5,"2022-09-20");

insert into pelicula(1,1,"url","la llorona","carlos y juan","una niña que llora mucho","terror","url");
insert into pelicula(2,1,"url","la happy","laura y novio","una pareja muy feliz","diversion","url");
insert into pelicula(3,0,"url","la tusa","frank y edison","una pareja gay con tusa","amor","url");
insert into pelicula(4,1,"url","los jovenes que sacan 5","edison, frank, murcia y sebas","unos jovenes que sacan 5 en programacion","terror","url");
insert into pelicula(5,0,"url","la tesis","jarol y angui","un paseo por la inversidad","terror","url");

insert into cliente_merchandising values(1,1,2);
insert into cliente_merchandising values(2,2,3);
insert into cliente_merchandising values(3,3,4);
insert into cliente_merchandising values(4,4,5);
insert into cliente_merchandising values(5,5,2);
insert into cliente_merchandising values(6,6,3);

insert into factura(1,1);
insert into factura(2,2);
insert into factura(3,3);
insert into factura(4,4);
insert into factura(5,5);
insert into factura(6,6);

insert into teatro values (1, "calle 20 # 2", "SAO local 101", 1, 1);
insert into teatro values (2, "carrera 11 # 6", "Unicentro local 201", 1, 1);
insert into teatro values (3, "calle 15 # 10", "Parque Arboleda", 3, 2);
insert into teatro values (4, "carrera 10 # 22", "Parque Lleras", 2, 3);
insert into teatro values (5, "carrera 10 # 22", "Parque Lleras", 2, 3);

insert  into sala values (1,1);
insert  into sala values (2,1);
insert  into sala values (3,2);
insert  into sala values (4,3);
insert  into sala values (5,4);
insert  into sala values (6,5);

insert into silla values (1,1);
insert into silla values (2,1);
insert into silla values (3,1);
insert into silla values (4,1);
insert into silla values (5,2);
insert into silla values (6,2);
insert into silla values (7,3);
insert into silla values (8,3);
insert into silla values (9,4);
insert into silla values (10,4);
insert into silla values (11,5);
insert into silla values (12,5);
insert into silla values (13,6);
insert into silla values (14,6);


insert into confiteria_cliente values(1,2000,1);
insert into confiteria_cliente values(2,2000,1);
insert into confiteria_cliente values(3,6000,2);
insert into confiteria_cliente values(4,6000,2);
insert into confiteria_cliente values(5,3000,3);
insert into confiteria_cliente values(6,3000,3);
insert into confiteria_cliente values(7,12000,4);
insert into confiteria_cliente values(8,12000,4);


insert into cupon values (1,"fidelidad",0,"2022-10-02",1000,1,6);
insert into cupon values (2,"fidelidad",1,"2022-10-10",1000,2,5);
insert into cupon values (3,"fidelidad",1,"2022-10-20",7000,3,4);
insert into cupon values (4,"fidelidad",0,"2022-10-10",4000,4,3);
insert into cupon values (5,"fidelidad",1,"2022-10-11",3000,5,2);
insert into cupon values (6,"fidelidad",0,"2022-10-05",2000,6,1);

insert into entrada values (1,2,1,1,1,1,1);
insert into entrada values (2,3,2,1,1,1,2);
insert into entrada values (3,2,3,1,1,4,3);
insert into entrada values (4,2,4,1,1,2,4);
insert into entrada values (5,1,5,1,1,1,5);

insert into funcion values (1,1,1,1);
insert into funcion values (2,2,2,2);
insert into funcion values (3,3,3,3);
insert into funcion values (4,4,4,4);
insert into funcion values (5,5,5,5);

insert into mechandising values (1,"url","juguete",20000);
insert into mechandising values (2,"url","juguete2",30000);
insert into mechandising values (3,"url","juguete3",60000);
insert into mechandising values (4,"url","juguete4",40000);
insert into mechandising values (5,"url","juguete5",20000);

insert into ubica_silla values (1,13)
    insert into ubica_silla values (1,12);
insert into ubica_silla values (1,11);
insert into ubica_silla values (1,10);
insert into ubica_silla values (1,1);
insert into ubica_silla values (1,2);
insert into ubica_silla values (1,3);
insert into ubica_silla values (1,4);
insert into ubica_silla values (1,5);
insert into ubica_silla values (1,6);
insert into ubica_silla values (1,9);
insert into ubica_silla values (1,8);
insert into ubica_silla values (1,7);