library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

entity three_in_and is
    port(   a, b, c : in std_logic;
            x, y : out std_logic);
end three_in_and;

architecture Behavioral of three_in_and is

    --signal s: std_logic;

begin

    process(a,b,c)
    begin
        if (a='1' and b = '1' and c = '1') then
            x <= '1';
        else 
            x <='0';
        end if;
    end process;

    y <= a or b or c;
    --s <= a and b;
    --x <= s and c;

end Behavioral;