
create table student(
  id int not null auto_increment,
  name VARCHAR (20) NOT NULL ,
  age int NOT NULL ,
  PRIMARY KEY (id)
);

insert into student (name,age) VALUES ("zhang",20);
insert into student (name,age) VALUES ("li",20);
insert into student (name,age) VALUES ("wang",20);