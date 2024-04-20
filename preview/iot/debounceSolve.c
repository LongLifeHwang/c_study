//arduino

#define PIN 5
#define LED 13

int pre = 0;
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
    if (pre == 0 && temp == 1)
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

void    loop()
{
    int cur = debounce0();
    if (pre == 0 && cur == 1)
        value = !value;
    digitalWrite(LED, value);
    pre = cur;
}
