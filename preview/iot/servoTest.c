//arduino
#include <Servo.h>

#define PIN 8

Servo servo;

void    setup()
{
    servo.attach(PIN);
}

void    loop()
{
    servo.write(0);
    delay(1000);
    for (int i = 0; i < 90; i += 10)
    {
        servo.write(i);
        delay(200);
    }
}

