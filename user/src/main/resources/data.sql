insert into user (email,name, password) values('luan','luan@gmail.com','luan123');
insert into user (email,name, password) values('manu','manu@gmail.com','manu123');

insert into role (role_Name) values('role_operator');
insert into role (role_Name) values('role_admin');



insert into user_role(user_id, role_id) values(1,1);