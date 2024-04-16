//arduino

int pin[] = {2, 3, 4};
int note[] = {262, 294, 330};

void    setup()
{
    for (int i = 0; i < 3; i++)
    {
        pinMode(pin[i], 0);
    }
    pinMode(8, 1);
}

void    loop()
{
    for (int i = 0; i < 3; i++)
    {
        if (digitalRead(pin[i]) == 1)
        {
            Tone(8, note[i], 100)
            delay(100);
            noTone(8);
        }
    }
}
