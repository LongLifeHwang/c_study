#include <stdio.h>

int main()
{
	//continue 일부 코드를 실행하지 않고 건너뛰기
	for (int i = 1; i <= 10; i++)
	{
		if (i % 2 == 0)
			continue;  //아래의 실행 코드를 실행하지 않고 건너뛰기
		printf("%d\n", i);
	}
	return 0;
}
