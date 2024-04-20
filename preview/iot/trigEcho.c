//arduino

#define TRIG 2
#define ECHO 3

void    setup()
{
    pinMode(TRIG, 0);
    pinMode(ECHO, 1);
    Serial.begin(9600);
}

void    loop()
{
    long    duration;

    digitalWrite(TRIG, 1);
    delayMicroseconds(10);
    digitalWrite(TRIG, 0);
    duration = pulseIn(ECHO, 1);
    duration /= 58.2;
    if (duration == 0)
        return ;
    Serial.print("distance : ");
    Serial.print(duration);
    Serial.println("cm");
    delay(100);
}
