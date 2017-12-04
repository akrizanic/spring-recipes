CREATE DATABASE db_dev;
CREATE DATABASE db_prod;

CREATE USER 'dev_user'@'localhost' IDENTIFIED BY 'cba321';
CREATE USER 'prod_user'@'localhost' IDENTIFIED BY 'cba321';
CREATE USER 'dev_user'@'%' IDENTIFIED BY 'cba321';
CREATE USER 'prod_user'@'%' IDENTIFIED BY 'cba321';

GRANT SELECT ON db_dev.* to 'dev_user'@'localhost';
GRANT INSERT ON db_dev.* to 'dev_user'@'localhost';
GRANT DELETE ON db_dev.* to 'dev_user'@'localhost';
GRANT UPDATE ON db_dev.* to 'dev_user'@'localhost';
GRANT SELECT ON db_prod.* to 'prod_user'@'localhost';
GRANT INSERT ON db_prod.* to 'prod_user'@'localhost';
GRANT DELETE ON db_prod.* to 'prod_user'@'localhost';
GRANT UPDATE ON db_prod.* to 'prod_user'@'localhost';
GRANT SELECT ON db_dev.* to 'dev_user'@'%';
GRANT INSERT ON db_dev.* to 'dev_user'@'%';
GRANT DELETE ON db_dev.* to 'dev_user'@'%';
GRANT UPDATE ON db_dev.* to 'dev_user'@'%';
GRANT SELECT ON db_prod.* to 'prod_user'@'%';
GRANT INSERT ON db_prod.* to 'prod_user'@'%';
GRANT DELETE ON db_prod.* to 'prod_user'@'%';
GRANT UPDATE ON db_prod.* to 'prod_user'@'%';
