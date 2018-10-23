-- 创建基本数据库脚本

create tablespace Basic_Database
logging
datafile 'D:\app\zhaols\oradata\orcl\Basic.dbf'
size 100m
autoextend on
next 100m maxsize 30G
extent management local;
创建用户
create user basic_user identified by basic_password default tablespace Basic_Database TEMPORARY TABLESPACE TEMP;

给用户赋予权限
grant create session, connect,resource to basic_user;
grant create  database link to basic_user; 
grant CREATE TABLE,CREATE SYNONYM, CREATE PUBLIC SYNONYM,CREATE VIEW ,CREATE SEQUENCE,CREATE PROCEDURE,CREATE TRIGGER,
CREATE MATERIALIZED VIEW,CREATE JOB to basic_user;
grant dba to basic_user;
grant unlimited tablespace to basic_user;
grant EXECUTE ANY PROCEDURE,EXECUTE ANY TYPE to basic_user;
GRANT debug any procedure, debug connect session TO basic_user;



导出数据库时 需要创建文件夹路径，并且给用户赋予读写权限
		创建逻辑目录
			create directory Dump as 'F:\dump';
				Oracle不关心目录是否存在，所以需要手动创建该路径
					select * from dba_directories; //查看管理员目录
		赋予权限
			grant read,write on directory Dump to basic_user;
			
			
			expdp basic_user/basic_password@orcl directory=directory dumpfile=Basic_20180822.dmp logfile=Basic_20180822.log OWNER=basic_user; 
			exp basic_user/basic_password@orcl owner=basic_user file='文件存储路径.dmp'
			
			impdp Order_data/Order_data@orcl directory=plat_bak dumpfile=Order_0801.dmp logfile=Order_0801.log fromuser=Order_data touser=Order