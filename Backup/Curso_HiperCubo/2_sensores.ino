int luz = A0;
int luminosidad = 0;
int tierra = A1;
int humedad = 0;

void setup() {
  //enciende el puerto serial
   Serial.begin(9600);
}

void loop() {
   luminosidad = analogRead(A0);
   humedad = analogRead(A1);
   Serial.println(luminosidad);
   Serial.println(humedad);
   delay(100);
}
