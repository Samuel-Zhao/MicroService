DROP table if EXISTS user;
create table user(
  id int not null AUTO_INCREMENT,
  username varchar(40),
  name VARCHAR(20),
  age INT(3),
  balance FLOAT(10,2),
  PRIMARY KEY (id)
)ENGINE =INNODB DEFAULT CHARSET= UTF8;