use virtusa;
delimiter $$
create function funnew8(FEES int)
returns varchar(50)
deterministic
begin
declare result varchar(50);
case 
when FEES<1000 then set result="less fees";
when FEES>1000 then set result="normal fess";
ELSE
begin
end;
end case;
return (result);
end$$

select PATIENT_ID,DOCTOR_NAME,funnew6(FEES) from issue;
