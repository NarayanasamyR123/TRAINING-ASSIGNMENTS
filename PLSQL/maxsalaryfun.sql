use virtusa;
delimiter &&
create function max_fun5()
returns int 
deterministic
begin
declare a int;
select max(slary) into a from employess;
return a;
end &&
delimiter ;

select max_fun5();

