library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

entity xor_gate is
    Port (  g, h: in std_logic; 
            i   : out std_logic);
end xor_gate;

architecture Dataflow of xor_gate is

begin
    i <= g xor h;
end Dataflow;
