use virtusa;
delimiter &&
create procedure pro_emp2(out a int)
begin
declare a int;
select max(slary) into a from employess;
end &&
delimiter ;

call pro_emp2(@a);
select @a;
  