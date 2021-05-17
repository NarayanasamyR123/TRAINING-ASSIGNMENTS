    use virtusa;
DELIMITER $$
create procedure process_employees ()
begin
    DECLARE v_ename varchar(100);
    DECLARE v_salary int;
    declare v_finished integer default 0;
    DECLARE c1 CURSOR for select emp_name , slary from employess;
    declare continue handler for NOT FOUND set v_finished=1;
    open c1;
    get_emp: LOOP
        fetch c1 into v_ename, v_salary;
        if v_finished = 1 then leave get_emp;
        end if;
        select concat(v_ename,v_salary);
        END LOOP get_emp;
    close c1;
end $$



call process_employees();
$$



