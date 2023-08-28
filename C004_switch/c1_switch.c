#define _CRT_SECURE_NO_WARNING
#include <stdio.h>

int main()
{
	char c1;

	scanf("%c", &c1);
	switch (c1)  //문자는 가능하나 문자열, 실수 자료형은 불가능하다.
	{
	case 'a':
		printf("a입니다. \n");
		break;
	case 'b':
		printf("b입니다. \n");
		break;
	default:
		printf("default\n");
		break;
	}
	return 0;
}
