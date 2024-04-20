//arduino

#define PIN 5
#define LED 13

int pre = 0;
int value = 0;

void    setup()
{
    pinMode(PIN, 0);
    pinMode(LED, 1);
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

void    loop()
{
    int cur = debounce0();
    if (pre == 0 && cur == 1)
        value = !value;
    digitalWrite(LED, value);
    pre = cur;
}
