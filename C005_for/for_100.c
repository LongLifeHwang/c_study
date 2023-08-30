#include <stdio.h>

int main()
{
	for (int i = 0; i < 100; i++)
	//for문 초기식에서 변수를 선언하면 for문 외부에서 변수 i를 사용할 수 없다. 외부에서 사용할려면 외부에서 i를 선언해야 함.
	{
		printf("Hello, world %d\n", i);
	}
	return 0;
}
