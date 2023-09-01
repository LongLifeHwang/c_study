#include <stdio.h>

int main()
{
	int i = 0;

	do  //처음 한 번은 아래 코드가 실행됨
	{
		printf("Hello, world! %d\n", i);
		i++;
	} while (i < 100); //조건에 성립될 때에만 반복 진행
	return 0;
}
