#include <stdio.h>

void hello(int count)
{
	if (count <= 0)  //탈출 조건을 만듦. count가 0이하면
		return;  //다시 hello 함수를 호출하지 않고 끝냄
	printf("Hello, world! %d\n", count);
	hello(--count);  //hello 함수 안에서 hello 함수 호출 
}

int main()
{
	hello(5);
	return 0;
}
