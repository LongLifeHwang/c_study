//arduino
//digitalPinToInterrupt()함수를 사용해서 채터링을 극복할 것임
//digitalPinToInterrupt(digitalRead(sw), 실행 함수, RISING 혹은 FALLING 혹은 CHANGE);
//단점이 있는디 delay()호출 불가함, _delay_ms()를 호출해야 함

#define LED 9
#define SW 2

#include <util/delay.h>

//volatile는 캐시를 거치지 않고 메모리에 직접 저장을 해줌 무조건 volatile를 사용해야함
volatile int    value = 0;

void    setup()
{
    pinMode(LED, OUTPUT);
    digitalPinToInterrupt(digitalRead(SW), interrupt, RISING);
}

void    loop()
{
    digitalWrite(LED, value);
}

//RISING되었을 때에만 이함수에 들어오게됨
void    interrupt(void)
{
    _delay_ms(100);
    if (digitalRead(SW) == LOW)
        return;
    value = !value;
}

