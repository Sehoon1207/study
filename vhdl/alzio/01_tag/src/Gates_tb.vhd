library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

entity Gates_tb is
end Gates_tb;

architecture Behavioral of Gates_tb is

    component Gate_st
    Port (  in0     : in std_logic; 
            in1     : in std_logic;
            in2     : in std_logic;
            in3     : in std_logic;
            out0    : out std_logic);
    end component;

    -- inputs --
    signal in0 : std_logic := '0';
    signal in1 : std_logic := '0';
    signal in2 : std_logic := '0';
    signal in3 : std_logic := '0';
    
    -- outputs --
    signal out0 : std_logic;

begin

    uut: Gate_st port map(
        in0 => in0,
        in1 => in1,
        in2 => in2,
        in3 => in3,
        out0 => out0
    );

    stim_proc: process
    begin
        wait for 100 ns;
        in0 <=  '0',                -- 처음에 0으로 시작
                '1' after 10 ns,    -- 10ns후에 1을 넣는다.  
                '0' after 20 ns,
                '1' after 30 ns;

        in1 <=  '0',                
                '1' after 5 ns,    
                '0' after 10 ns,
                '1' after 15 ns;

        in2 <=  '0',                
                '1' after 10 ns,    
                '0' after 20 ns,
                '1' after 30 ns;

        in3 <=  '0',                
                '1' after 5 ns,    
                '0' after 10 ns,
                '1' after 15 ns;

    end process;
    
        
end;
