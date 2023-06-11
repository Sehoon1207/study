library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

entity nand_gate is
    port(   nand_in0, nand_in1 : in std_logic;
            nand_out : out std_logic);
end nand_gate;

architecture Behavioral of nand_gate is

signal nand_s : std_logic;

begin

    process(nand_in0, nand_in1)
    begin
        if (nand_in0 = '1' and nand_in1 = '1') then
            nand_s <= '1';
        else
            nand_s <= '0';
        end if;
    end process;

    nand_out <= not nand_s;

    --드모르간의 법칙
    --not (a and b) = (not a) or (not b)
    --not (a or b) = (not a) and (not b)
    
    -- nand_out <= nand_in0 nand nand_in1;

end Behavioral;