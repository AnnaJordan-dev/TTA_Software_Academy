
create database ANNA;
use ANNA;

create table ITEM (
ITEMID VARCHAR(100),
DISH VARCHAR(100),
PRICE DOUBLE,
CATEGORY VARCHAR(100),
PRIMARY KEY(`ITEMID`)
);

create table MANAGER (
NAME VARCHAR(100),
SHIFT VARCHAR(100),
SALARY DOUBLE, 
MID INT PRIMARY KEY
);

create table CORDER (
ORDERID INT PRIMARY KEY AUTO_INCREMENT,
CNAME VARCHAR(100),
PHONE VARCHAR(100),
ADDRESS VARCHAR(100),
ITEMID VARCHAR(100),
QTY INT,
TOTAL DOUBLE,
DATE VARCHAR(100),
FOREIGN KEY(`ITEMID`)REFERENCES ITEM(ITEMID)
);

insert into MANAGER (name, shift, salary, mid)
values('Blunt', 1, 10000, 101);

insert into MANAGER (name, shift, salary, mid)
values('Crow', 1, 12000, 102);

insert into MANAGER (name, shift, salary, mid)
values('Downing', 2, 20000, 103);

insert into MANAGER (name, shift, salary, mid)
values('Ealing', 3, 10000, 104);

insert into MANAGER (name, shift, salary, mid)
values('French', 4, 19000, 105);

insert into MANAGER (name, shift, salary, mid)
values('Grey', 2, 19000, 106);

insert into MANAGER (name, shift, salary, mid)
values('Harris', 3, 10000, 107);

insert into MANAGER (name, shift, salary, mid)
values('Iceland', 3, 10500, 108);

insert into MANAGER (name, shift, salary, mid)
values('Jones', 4, 15000, 109);

insert into MANAGER (name, shift, salary, mid)
values('Kellog', 3, 19000, 110);

insert into MANAGER (name, shift, salary, mid)
values('Lemming', 1, 15000, 111);

insert into CORDER (cname, phone, address, qty, total, date)
values('Apple', 0770123123, 'Adam Street', 12, 12, 010120);

insert into CORDER (cname, phone, address, qty, total, date)
values('Printer', 0880123123, 'Burnham Street', 1, 1, 010119);

insert into CORDER (cname, phone, address, qty, total, date)
values('Banana', 0780123123, 'Private Street', 2, 2, 010320);

insert into CORDER (cname, phone, address, qty, total, date)
values('Snowflake', 0880123123, 'Brown Street', 4, 4, 031018);

insert into CORDER (cname, phone, address, qty, total, date)
values('Stack', 0430123123, 'Smithly Street', 1, 1, 010120);

insert into CORDER (cname, phone, address, qty, total, date)
values('Pickle', 0220123123, 'Table Street', 3, 21, 010120);

insert into CORDER (cname, phone, address, qty, total, date)
values('Pineapple', 0120123123, 'Eve Street', 2, 32, 090120);

insert into CORDER (cname, phone, address, qty, total, date)
values('Tulip', 0490123123, 'Poppy Street', 12, 52, 010120);

insert into CORDER (cname, phone, address, qty, total, date)
values('Ardvaark', 0170123123, 'Melon Street', 5, 45, 010910);

insert into CORDER (cname, phone, address, qty, total, date)
values('Sage', 0990123123, 'Smart Street', 44, 88, 010120);

insert into item (itemid, dish, price, category)
values('A1', 'pasta', 12, 'italian');

insert into item (itemid, dish, price, category)
values('A2', 'pizza', 11, 'italian');

insert into item (itemid, dish, price, category)
values('B1', 'korma', 15, 'indian');

insert into item (itemid, dish, price, category)
values('C1', 'katsu', 21, 'japanese');

insert into item (itemid, dish, price, category)
values('C2', 'gyoza', 14, 'japanese');

insert into item(itemid, dish, price, category)
values('D1', 'tapas', 23, 'spanish');

insert into item (itemid, dish, price, category)
values('D2', 'paella', 31, 'spanish');

insert into item (itemid, dish, price, category)
values('D3', 'gaspacho', 10, 'spanish');

insert into item (itemid, dish, price, category)
values('D4', 'fish stew', 41, 'spanish');

insert into item (itemid, dish, price, category)
values('E1', 'singapore crab', 58, 'singaporean');

select avg(salary) from manager;
select * from corder where date='10120';
select sum(total) from corder; 
select count(itemid) from item;
SELECT COUNT(ITEMID), DISH
FROM ITEM
GROUP BY DISH, CATEGORY;
