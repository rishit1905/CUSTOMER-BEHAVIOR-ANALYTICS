
create database cba_;
use cba_;

create database cba;
use cba;


show tables;
drop database cba_;

CREATE TABLE customer (
    cid INT PRIMARY KEY,
    cat VARCHAR(5) NOT NULL,
    cname VARCHAR(300) NOT NULL
);

INSERT INTO customer VALUES(101,'Harsha','harsha123@gmail.com','9739955954','Banglore');
INSERT INTO customer VALUES(102,'Shwetha','shweta12@gmail.com','8095119686','Mysore');
INSERT INTO customer VALUES(103,'Sangamesh','sangu123@gmail.com','9093118019','Manglore');
INSERT INTO customer VALUES(104,'Swathi','swathi123@gmail.com','9739956612','Chennai');
INSERT INTO customer VALUES(105,'Manasa','manasa123@gmail.com','9900562341','Pune');
INSERT INTO customer VALUES(106,'Sampritha','sampritha123@gmail.com','9900539906','Banglore');
INSERT INTO customer VALUES(107,'Raghu','raghu45@gmail.com','9743591454','Kolar');
INSERT INTO customer VALUES(108,'Reshma','reshma123@gmail.com','7010020143','Mumbai');
INSERT INTO customer VALUES(109,'Adya','adya123@gmail.com','9008071864','Chikkamangaluru');
INSERT INTO customer VALUES(110,'Adarsh','adarsh123@gmail.com','8317563358','Banglore');
INSERT INTO customer VALUES(111,'Chaithra','chaithra123@gmail.com','9986137694','Mysore');
INSERT INTO customer VALUES(112,'Induja','indu123@gmail.com','9741006581','Pune');
INSERT INTO customer VALUES(113,'Srikanth','srikanth123@gmail.com','9880981773','Tumkur');
INSERT INTO customer VALUES(114,'Samhitha','sampritha123@gmail.com','8686607257','Banglore');
INSERT INTO customer VALUES(115,'Pruthvi','pruthvi123@gmail.com','9590859051','Mysore');

select * from customer;

CREATE TABLE product (
    pid INT PRIMARY KEY,
    pname VARCHAR(500) NOT NULL,
    category VARCHAR(100) NOT NULL,
    brand VARCHAR(500) NOT NULL,
    descr VARCHAR(2000),
    price DOUBLE NOT NULL,
    stock INT NOT NULL
);

INSERT INTO product VALUES(1111,'Coffee powder','Food & Beverages','Nescafe','Good',74.69,50,1);
INSERT INTO product VALUES(1112,'Shirt','Home & LifeStyle','Mayur Fashions','Good',46.33,5,2);
INSERT INTO product VALUES(1113,'Tea Powder','Food & Beverages','TajMahal','Good',58.22,10,3);
INSERT INTO product VALUES(1114,'Fareness Cream','Health & Beauty','Lakme','Good',86.31,30,4);
INSERT INTO product VALUES(1115,'Shoes','Home & LifeStyle','Bata','Average',85.39,5,1);
INSERT INTO product VALUES(1116,'Watch','Accessories','Sonata','Good',68.84,50,2);
INSERT INTO product VALUES(1117,'Watch','Accessories','Titan','Average',73.56,10,3);
INSERT INTO product VALUES(1118,'pen','Home & LifeStyle','fusion','Good',36.26,5,4);
INSERT INTO product VALUES(1119,'Salt','Food & Beverages','Tata','Good',54.84,50,1);
INSERT INTO product VALUES(1120,'Necklace','Accessories','STL accessories','Good',25.51,5,2);
INSERT INTO product VALUES(1121,'Shoes','Home & LifeStyle','Paragan','Average',46.95,50,3);
INSERT INTO product VALUES(1122,'Coffee Powder','Food & Beverages','Bru','Good',71.38,20,4);
INSERT INTO product VALUES(1123,'Coffee Powder','Food & Beverages','Cothas','Average',93.72,5,1);
INSERT INTO product VALUES(1124,'oil','Food & Beverages','SunPure','Good',68.93,50,2);
INSERT INTO product VALUES(1125,'pen','Home & LifeStyle','Pavithra brite','Average',72.61,5,4);

select * from product;
drop table product;

CREATE TABLE invoice (
    iid INT PRIMARY KEY,
    idate DATETIME NOT NULL,
    cid INT REFERENCES customer (cid),
    tax DOUBLE NOT NULL,
    tprice DOUBLE NOT NULL,
    paymode VARCHAR(50) NOT NULL
);

INSERT INTO invoice VALUES(201,'2019-07-02 10:25:00',101,1111,7,26.1415,548.9715,'Debitcard');
INSERT INTO invoice VALUES(202,'2019-03-03 13:23:00',115,1112,7,16.2155,340.5255,'Cash');
INSERT INTO invoice VALUES(203,'2019-01-27 20:33:00',101,1113,8,23.288,489.048,'Creditcard');
INSERT INTO invoice VALUES(204,'2019-02-08 10:37:00',101,1114,7,30.2085,634.3785,'Debitcard');
INSERT INTO invoice VALUES(205,'2019-03-25 18:30:00',107,1115,7,29.8865,627.6165,'Cash');
INSERT INTO invoice VALUES(206,'2019-02-25 14:36:00',112,1116,6,20.652,433.692,'Debitcard');
INSERT INTO invoice VALUES(207,'2019-07-24 11:38:00',111,1117,10,36.78,772.38,'Creditcard');
INSERT INTO invoice VALUES(208,'2019-01-10 17:15:00',109,1118,2,3.626,76.146,'Debitcard');
INSERT INTO invoice VALUES(209,'2019-02-20 13:27:00',109,1119,3,8.226,172.746,'Cash');
INSERT INTO invoice VALUES(210,'2019-03-09 17:03:00',112,1120,4,5.102,107.142,'Debitcard');
INSERT INTO invoice VALUES(211,'2019-07-12 10:25:00',109,1121,5,11.7375,246.4875,'Debitcard');
INSERT INTO invoice VALUES(212,'2019-07-02 16:48:00',103,1122,10,21.595,453.495,'Creditcard');
INSERT INTO invoice VALUES(213,'2019-03-29 19:21:00',104,1123,10,35.69,749.49,'Debitcard');
INSERT INTO invoice VALUES(214,'2019-01-15 16:19:00',105,1124,6,28.116,590.436,'Creditcard');
INSERT INTO invoice VALUES(215,'2019-05-20 11:03:00',106,1125,7,24.1255,506.6355,'Cash');

select * from invoice;
drop table invoice;

CREATE TABLE invoice_product (
    iid INT NOT NULL REFERENCES invoice (iid),
    pid INT NOT NULL REFERENCES product (pid),
    PRIMARY KEY (iid , pid),
    qty INT NOT NULL
);


select * from invoice_product;

CREATE TABLE discount (
    did INT PRIMARY KEY,
    dname VARCHAR(50) NOT NULL,
    descr VARCHAR(2000),
    dprice DOUBLE NOT NULL
);

CREATE TABLE product_discount (
    pid INT NOT NULL REFERENCES product (pid),
    did INT NOT NULL REFERENCES discount (did),
    PRIMARY KEY (pid , did)
);

select * from product_discount;

INSERT INTO discount VALUES(1,'No Discount','Zero perc discount',0);
INSERT INTO discount VALUES(2,'Super 20perc','20 perc discount',0.20);
INSERT INTO discount VALUES(3,'Super 30perc','30 perc discount',0.30);
INSERT INTO discount VALUES(4,'Super 40perc','50 perc discount',0.50);

select * from discount;