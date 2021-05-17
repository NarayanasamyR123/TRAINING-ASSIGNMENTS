    USE virtusa;
DELIMITER &&  
CREATE PROCEDURE b4 (IN ID int,OUT total varchar(50))  
BEGIN 
declare a int; 
    SELECT COUNT(CUSTOMER_ID) INTO a FROM BANK WHERE CUSTOMER_ID>ID;
    if a>3 then set total='matched';
    else set total='not matched';
    end if;
END &&  
DELIMITER ;
 
call b4(1009,@total);
select @total;


