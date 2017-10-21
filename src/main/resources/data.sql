INSERT INTO school (name)
VALUES
    ("Information School");
INSERT INTO discipline (id,name,master,doctor,key_Discipline,school_id)
VALUES
    ("1201","software",true,false,false,1);
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
    ("123","admin","123","1201",1);
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
    INSERT INTO `structure` (`id`, `above61`, `between36to45`, `between46to55`, `between56to60`, `duty`, `totalnumber`, `under35`, `discipline_id`) VALUES ('1', '2', '3', '2', '3', '1', '1', '3', '1201');

