use ese4;

call sqrcube(2);

DELIMITER // 
CREATE procedure sqrcube(n int)
	begin
    DECLARE sqr INT unsigned DEFAULT 1;  
	DECLARE cubee INT unsigned DEFAULT 1;  
    set sqr := n*n;
    set cubee := n*n*n;
    select sqr;
    select cubee;
END;
//
DELIMITER ;

DELIMITER // 
//
