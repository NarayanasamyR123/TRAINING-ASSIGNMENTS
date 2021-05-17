use virtusa;
delimiter $$
create procedure pro_empnew22()
begin
declare v_id int;
declare v_name varchar(50);
declare v_marks int;
declare state int default 0;
declare cur cursor for select id,name,marks from student;
declare continue handler for NOT found set state=1;
open cur;
get_stu:loop
fetch cur into v_id,v_name,v_marks;
if state=1 then leave get_stu;
end if;
select concat(v_id,' ',v_name,' ',v_marks);
end loop get_stu;
close cur;
end $$

call pro_empnew22();
