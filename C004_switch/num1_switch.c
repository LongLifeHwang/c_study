#define _CRT_SECURE_NO_WARNING
#include <stdio.h>

int main()
{
	int num1;

	scanf("%d", &num1);
	switch (num1)
	{
	case 1:
		printf("1입니다. \n");
		break;  //break가 없다면 아래의 case문도 실행함
	case 2:
		printf("2입니다. \n");
		break;
	default:
		printf("default\n");
		break;
	}
	return 0;
}
