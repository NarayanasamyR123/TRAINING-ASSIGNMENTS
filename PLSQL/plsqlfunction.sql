use virtusa;
CREATE function F1(VAL char(50))
returns char(50) deterministic
return concat('hello ',val,'!');
select F1('naveen');
