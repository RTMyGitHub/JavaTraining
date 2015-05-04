drop table order_details;
drop table orders;
drop table products;
drop table customers;

drop sequence order_details_seq;
drop sequence orders_seq;
drop sequence products_seq;
drop sequence customers_seq;

CREATE TABLE customers
 (
 customer_id number(8) primary key,
 first_name varchar2(30),
 last_name varchar2(30),
 address varchar2(30),
 city varchar2(20),
 state varchar2(20),
 zip char(5)
 ); 
 
 create sequence customers_seq start with 1 increment by 1;
 
 CREATE TABLE orders
 (
 order_id number(8) primary key,
 customer_id number(8) references customers(customer_id),
 order_number varchar2(10),
 order_date date,
 order_amount number(10,2)
 );
 
 create sequence orders_seq start with 1 increment by 1;
 
 create table products
 (
 product_id number(8) primary key,
 product_type varchar2(20),
 product_name varchar2(30),
 price number(10,2)
 );
 
 create sequence products_seq start with 1 increment by 1;
 
 create table order_details
 (
  order_details_id number(8) primary key,
  order_id references orders(order_id),
  product_id references products(product_id)
 );
 
create sequence order_details_seq start with 1 increment by 1;

 insert into products values(products_seq.nextval, 'Books', 'Gone with the wind', '26.72');
 insert into products values(products_seq.nextval, 'Books', 'Spring in Action', '32.29');
 insert into products values(products_seq.nextval, 'Electronics', 'Apple Watch Sports model', '499.00');
 insert into products values(products_seq.nextval, 'Electronics', 'Apple Watch Gold', '7500.00');
 insert into products values(products_seq.nextval, 'Electronics', 'iPhone 6 plus', '799.99');
 
 commit;
