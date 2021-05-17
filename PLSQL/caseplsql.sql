use virtusa;
delimiter &&
create procedure b8()
begin
declare a int default 10;
case a
when 10 then select 'not euqal';
when 5 then select 'equal';
else
begin
end;
end case;
end &&;
delimiter ;

call b8(); 
