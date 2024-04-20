//arduino

#define RED 9
#define GREEN 10
#define BLUE 11

void    setup()
{
    randomseed(analogRead(A0));
}

void    loop()
{
    analogWrite(RED, random(256));
    analogWrite(GREEN, random(256));
    analogWrite(BLUE, random(256));
    delay(1000);
}