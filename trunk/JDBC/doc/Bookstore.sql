--Login as system and execute the following statements
create user bookstore identified by password
grant all privileges to bookstore

--Now, login as bookstore and execute the following

create table book(book_id int, title varchar2(30), author varchar2(30), number_of_pages int, isbn varchar2(10), pub_date date);

