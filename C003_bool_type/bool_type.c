#include <stdio.h>
#include <stdbool.h>  // bool, true, false가 정의된 헤더 파일 

int main()
{
    bool b1 = true;

    if (b1 == true)
    {
        printf("참\n");
    }
    else
    {
        printf("거짓\n");
    }
    printf("bool의 크기: %d\n", sizeof(bool));  //bool의 크기: 1: bool의 크기느 1바이트
    printf("%s\n", b1 ? "true" : "false");
    if (true)
    {
        printf("참\n");
    }
    else
    {
        printf("거짓\n");
    }
    if (false)
    {
        printf("참\n");
    }
    else
    {
        printf("거짓\n");
    }
    return 0;
}
