//visualizar los puertos seriales
SerialPort.devices;
//abrir puerto serial
~port =SerialPort.new("/dev/cu.usbmodem1101",9600);
//convertir ascii a enteros
(
~charArray=[];
~getValues=Routine({
var ascii;
{
ascii = ~port.read.asAscii;
if(ascii.isDecDigit,
{~charArray = ~charArray.add(ascii)});
if (ascii == $a ,{
~luz= ~charArray.collect(_.digit).convertDigits;
~charArray = [];
});
if (ascii == $b ,{
~hum= ~charArray.collect(_.digit).convertDigits;
~charArray = [];
});
}.loop;
}).play;
)
//vizualizar la data
(
Routine({
{
~luz.postln;
~hum.postln;
		0.1.wait;
	}.loop;
}).play
)