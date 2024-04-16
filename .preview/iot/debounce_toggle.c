//arduino
//debounce : 채터링을 없애는 것
//채터링 : 접점이 붙거나 떨어질 때 기계적 진동에 의해 매우 짧은 시간 동안 접점이 붙었다가 떨어지는 것을 반복하는 현상
//debounce : 짧은 시간 동안의 버튼 상태 변화를 무시하여 진동 잡음을 해결, 바운싱을 제거하여 정상적인 스위치 동작 기능을 구현

#define BUTTON 2
#define LED 9

int value = 0;
int last = 0;

void    setup()
{
    pinMode(BUTTON, 0);
    pinMode(LED, 1);
}

int debounce_toggle(int temp)
{
    int cur;

    cur = digitalRead(BUTTON);
    if (temp == 0 && cur == 1)
    {
        delay(100);
        cur = digitalRead(BUTTON);
    }
    return (cur);
}

void    loop()
{
    int cur;

    cur = debounce_toggle(last);
    if (last == 0 && cur == 1)
        value = !value;
    digitalWrite(LED, value);
    last = cur;
}


