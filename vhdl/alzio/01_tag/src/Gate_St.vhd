library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

entity Gate_st is
    Port (  in0     : in std_logic; 
            in1     : in std_logic;
            in2     : in std_logic;
            in3     : in std_logic;
            out0    : out std_logic);
end Gate_st;

architecture Behavioral of Gate_st is

    component and_gate
        Port (  a, b: in std_logic; 
                c   : out std_logic);
    end component;

    component or_gate
        Port (  d   : in std_logic;
                e   : in std_logic;
                f   : out std_logic);
    end component;

    component xor_gate
        Port (  g, h: in std_logic; 
                i   : out std_logic);
    end component;

    signal s1, s2 : std_logic;

begin
    and_gate_connect    : and_gate port map (in0, in1, s1);
    or_gate_connect     : or_gate port map  (in2, in3, s2);
    xor_gate_connect    : xor_gate port map (s1, s2, out0);
    
end Behavioral;
