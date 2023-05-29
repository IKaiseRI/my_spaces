create table users(
	id bigserial primary key,
	name varchar(100),
	email varchar(100),
	password varchar(100)
);

insert into users (name,email,password) values ('John','john@example.com','1234');
insert into users (name,email,password) values ('test1','test1@example.com','test1');
insert into users (name,email,password) values ('test2','test2@example.com','test2');
insert into users (name,email,password) values ('test3','test3@example.com','test3');
insert into users (name,email,password) values ('test4','test4@example.com','test4');
insert into users (name,email,password) values ('test5','test5@example.com','test5');

update users set name = 'Jane' where id = 1;

delete from users where email = 'john@example.com'

create table orders(
	id bigserial primary key,
	user_id BIGINT,
	product_name varchar(200),
	price numeric,
	constraint  user_fk foreign key(user_id) references users(id)
);


insert into orders (user_id, product_name,price) values(7,'food',50);
insert into orders (user_id, product_name,price) values(7,'laptop',1000);
insert into orders (user_id, product_name,price) values(2,'stuff',10);
insert into orders (user_id, product_name,price) values(2,'stuff',10);
insert into orders (user_id, product_name,price) values(2,'stuff',10);
insert into orders (user_id, product_name,price) values(3,'stuff',10);
insert into orders (user_id, product_name,price) values(3,'stuff',10);
insert into orders (user_id, product_name,price) values(3,'stuff',10);
insert into orders (user_id, product_name,price) values(4,'stuff',10);
insert into orders (user_id, product_name,price) values(4,'stuff',10);
insert into orders (user_id, product_name,price) values(4,'stuff',10);
insert into orders (user_id, product_name,price) values(4,'stuff',10);
insert into orders (user_id, product_name,price) values(4,'stuff',10);
insert into orders (user_id, product_name,price) values(4,'stuff',10);
insert into orders (user_id, product_name,price) values(5,'stuff',10);
insert into orders (user_id, product_name,price) values(5,'stuff',10);
insert into orders (user_id, product_name,price) values(5,'stuff',10);
insert into orders (user_id, product_name,price) values(5,'stuff',10);
insert into orders (user_id, product_name,price) values(5,'stuff',10);


select * from orders where id = (select id from users where name = 'Jane');

select * from users where id in (select user_id from orders where price > 100);

select users.name, sum(orders.price) from users join orders on users.id = orders.user_id 
group by users.name order by sum(orders.price) DESC;

select users.name, count(orders.id) from users join orders on users.id = orders.user_id
group by users.name order by count(orders.id);
