#define _CRT_SECURE_NO_WARNING 
#include <stdio.h>

int main()
{
	int count;

	scanf("%d", &count);
	for (; count > 0; count--)
	//초기값 없이 scanf에서 사용한 변수를 감소시켜서 반복함 
	{
		printf("Hello, world! %d\n", count);
	}
	return 0;
}
