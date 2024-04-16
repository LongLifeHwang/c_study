//arduino
//3색 led를 랜덤하게 조절하기


void    setup()
{
    randomSeed(analogRead(A0));
    //randomSeed는 인자값을 통하여서 random을 돌릴 때의 기준 값을 정합니다. 
}

void    loop()
{
    //random는 인자값의 범위 내에서 하나를 뱉읍니다. 
    analogWrite(11, random(256));
    analogWrite(10, random(256));
    analogWrite(9, random(256));
    delay(100);
}

