-- Criação das tabelas:

CREATE TABLE IF NOT EXISTS supplier(
id int auto_increment not null,
name varchar(255) not null,
date_creation date not null,
date_update date not null,
primary key(id)
);

CREATE TABLE IF NOT EXISTS product(
id int auto_increment not null,
name varchar(255) not null,
quant_stock int not null,
unit_price numeric(12,2),
supplier_id int not null,
date_creation date not null,
date_update date not null,
primary key(id),
foreign key(supplier_id) references product(id)
);


-- Inserção de dados na tabela supplier:

INSERT INTO supplier(date_creation, date_update, name) VALUES(now(), now(), "Tech");
INSERT INTO supplier(date_creation, date_update, name) VALUES(now(),now(), "Gerencial");
INSERT INTO supplier(date_creation, date_update, name) VALUES(now(), now(), "Principal");