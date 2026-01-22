Delimiter $$
create procedure traffic_signal (in Input varchar(10))
begin
case Input
when 'Red' then select 'stop' as result;
when 'yellow' then select 'wait' as result;
when 'green' then select 'go' as result;
else select 'Invalid' as result;
end case;
end $$
Delimiter ;


call traffic_signal ('Red');