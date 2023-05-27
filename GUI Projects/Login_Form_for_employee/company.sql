#create database company; 
#create table Department(dept_id int auto_increment primary key,dept_name varchar(30) not null ,dept_location varchar(10));
#create table Empolyee(emp_id int primary key auto_increment ,emp_name varchar(30),salary double ,dept_id int  references department(dept_id));
#insert into department(department.dept_name,department.dept_location) values ("IT","Cairo");
#insert into department(department.dept_name,department.dept_location) values ("SD","benha");
#insert into empolyee values (125,"Adham",1000,1);
#insert into empolyee values (126,"mohamed",2000,2);
#insert into empolyee values (127,"Ahmed",3000,3);
#select *from empolyee;
#alter table empolyee add column(gender varchar(30));
#insert into empolyee (empolyee.gender)values("male","female","female","male");
select *from empolyee;
#select emp_id,emp_name,salary,gender,dept_name from empolyee, department where empolyee.dept_id=department.dept_id
