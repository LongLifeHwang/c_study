#include <stdio.h>

void helloNumber(int num1)
{
	printf("%d\n", num1);
}

void helloWorld(char *s1)
{
	printf("%s\n", s1);
}

int add(int a, int b)
{
	return a + b;
}

int main()
{
	int num1;

	helloNumber(10);
	helloWorld("hello, world!!");
	num1 = add(10, 20);  //함수를 호출할 때 10과 20을 전달 10과 20을 더한 값인 30이 반환
	printf("%d\n", num1);
	return 0;
}
