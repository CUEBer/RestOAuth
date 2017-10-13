INSERT INTO school (name)
VALUES
    ("信息学院");
INSERT INTO discipline (id,name,master,doctor,key_Discipline,school_id)
VALUES
    ("1201","管理科学与工程",true,false,false,1);
INSERT INTO role (name)
VALUES
    ("ADMIN");
INSERT INTO role (name)
VALUES
    ("UNIVERSITY");
INSERT INTO role (name)
VALUES
    ("SCHOOL");
INSERT INTO role (name)
VALUES
    ("DISCIPLINE");
INSERT INTO account (id,name,password,discipline_id,scholl_id)
VALUES
    ("2362","张军","2362","1201",1);
INSERT INTO account_roles (account_id,roles_name)
VALUES
    ("2362","ADMIN");
INSERT INTO account_roles (account_id,roles_name)
VALUES
    ("2362","SCHOOL");
INSERT INTO account_roles (account_id,roles_name)
VALUES
    ("2362","DISCIPLINE");
INSERT INTO role_users (role_name,users_id)
VALUES
    ("ADMIN","2362");
INSERT INTO role_users (role_name,users_id)
VALUES
    ("UNIVERSITY","2362");
INSERT INTO role_users (role_name,users_id)
VALUES
    ("SCHOOL","2362");
INSERT INTO role_users (role_name,users_id)
VALUES
    ("DISCIPLINE","2362");
