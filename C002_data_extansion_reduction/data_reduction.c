#include <stdio.h>

int main()
{
    float num2 = 4.4f;
    float num3 = 11.0f;
    int num4 = num3 / num2;

    //자료형 축소
    printf("num3 / num2: %d\n", num4);  //2: 정수형으로 저장되어야만 정확히 출력된다.
    return 0;
}
