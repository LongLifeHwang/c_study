//arduino
//led control 0 ~ 255
//pwm은 핀 번호만 알맞게 설정을 하면 setup에 pinMode를 선언할 필요가 없음
//led를 서서히 밝게 했다가 끄고 다시 밝게 하는 것을 반복함

void    setup()
{
}

void    loop()
{
    for (int i = 0; i < 256; i++)
    {
        analogWrite(9, i);
        delay(10);
    }
}