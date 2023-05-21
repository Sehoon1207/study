library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

entity or_gate is
    Port (  d   : in std_logic;
            e   : in std_logic;
            f   : out std_logic);
end or_gate;

architecture Behavioral of or_gate is

begin
    process(d,e)
    begin
        if d = '1' or e ='1' then
            f <='1';
        else
            f <='0';
        end if;
    end process;
end Behavioral;
