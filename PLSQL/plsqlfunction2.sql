use virtusa;
delimiter $$
CREATE FUNCTION fun1(marks int)
returns varchar(50) 
deterministic
begin
declare grade varchar(50);
if (marks>=90) then set grade='VERYGOOD';
elseif (marks>=50) and (marks<=89) then set grade='GOOD';
elseif (marks<50) then set grade='NOTGOOD';
end if;
return(grade);
end$$;
delimiter ;

select id,name,fun1(marks) from student;
