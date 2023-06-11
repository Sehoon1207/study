library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

entity not_gate is
    port(   a : in std_logic;
            x : out std_logic);
end not_gate;

architecture Behavioral of not_gate is

begin

    b <= not a;

end Behavioral;