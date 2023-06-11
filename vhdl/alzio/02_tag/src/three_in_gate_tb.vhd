LIBRARY ieee;
USE ieee.std_logic_1164.ALL;

ENTITY three_in_gate_tb IS
END three_in_gate_tb;

ARCHITECTURE behavior OF three_in_gate_tb IS 

    COMPONENT three_in_and
    PORT(
         a : IN  std_logic;
         b : IN  std_logic;
         c : IN  std_logic;
         x,y : OUT  std_logic
        );
    END COMPONENT;

   --Inputs
   signal a : std_logic := '0';
   signal b : std_logic := '0';
   signal c : std_logic := '0';

 	--Outputs
   signal x,y : std_logic;

BEGIN

   uut: three_in_and PORT MAP (
          a => a,
          b => b,
          c => c,
          x => x,
		  y => y
        );

   stim_proc: process
   begin		

      wait for 100 ns;
		
		a <=    '0', 
                '1' after 40 ns,
			    '0' after 80 ns;
		b <=    '0', 
                '1' after 20 ns,
			    '0' after 40 ns, 
                '1' after 60 ns,
			    '0' after 80 ns;
		c <=    '0', 
                '1' after 10 ns,
			    '0' after 20 ns, 
                '1' after 30 ns,
			    '0' after 40 ns, 
                '1' after 50 ns,
			    '0' after 60 ns, 
                '1' after 70 ns,
			    '0' after 80 ns;
        --wait; --wait로 종료시 계속 반복하게 된다.
   end process;

END;
