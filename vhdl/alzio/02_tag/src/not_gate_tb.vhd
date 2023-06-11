LIBRARY ieee;
USE ieee.std_logic_1164.ALL;

ENTITY not_gate_tb IS
END not_gate_tb;
 
ARCHITECTURE behavior OF not_gate_tb IS 
 

    COMPONENT nand_gate
    PORT(
         nand_in0 : IN  std_logic;
         nand_in1 : IN  std_logic;
         nand_out : OUT  std_logic
        );
    END COMPONENT;
    

   --Inputs
   signal nand_in0 : std_logic := '0';
   signal nand_in1 : std_logic := '0';

 	--Outputs
   signal nand_out : std_logic;
 
BEGIN
 
	-- Instantiate the Unit Under Test (UUT)
   uut: nand_gate PORT MAP (
          nand_in0 => nand_in0,
          nand_in1 => nand_in1,
          nand_out => nand_out
        );
 

   -- Stimulus process
   stim_proc: process
   begin		
      wait for 100 ns;	

		nand_in0 <= '0', 
                    '1' after 40 ns,
			        '0' after 80 ns;
		nand_in1 <= '0', 
                    '1' after 20 ns,
			        '0' after 40 ns, 
                    '1' after 60 ns,
			        '0' after 80 ns;
		
   end process;

END;