~n1 = NetAddr.new("192.168.100.35", 9001);

(
Routine({
	{
		~n1.sendMsg('\luz',~luz);
		~n1.sendMsg('\tierra',~hum);
		0.1.wait;
	}.loop;
}).play
)