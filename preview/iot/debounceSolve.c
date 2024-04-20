//arduino

#include <util/delay.h>

#define PIN 5
#define LED 13

int pre = 0;
unsigned long   preTime = 0;
volatile int value = 0;

void    setup()
{
    pinMode(LED, 1);
    attachInterrupt(digitalPinToInterrupt(PIN), debounce1, RISING);
}

int debounce0()
{
    int temp;

    temp = digitalRead(PIN);
    if (pre != temp)
    {
        delay(10);
        temp = digitalRead(PIN);
    }
    return (temp);
}

void    debounce1()
{
    _delay_ms(10);
    if (digitalRead(PIN) == 1)
        value = !value;
}

int debounce2()
{
    unsigned long   curTime;
    int             cur;

    curTime = millis();
    cur = digitalRead();
    if (pre != cur)
    {
        if (curTime - preTime > 300)
        {
            preTime = cur;
            return (cur);
        }
    }
    return (pre);
}

void    loop()
{
    int cur = debounce2();

    if (pre == 0 && cur == 1)
        value = !value;
    digitalWrite(LED, value);
    pre = cur;
}
