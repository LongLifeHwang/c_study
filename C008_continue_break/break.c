#include <stdio.h>

int main()
{
	//break 반복문 종료
	while (1)  //while 무한 루프
	{
		num1++;
		printf("%d\n", num1);
		if (num1 == 5)
			break;  //반복문을 끝냄
	}
	return 0;
}
