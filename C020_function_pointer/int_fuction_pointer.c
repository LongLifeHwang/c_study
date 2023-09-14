#include <stdio.h>

int add(int a, int b)
{
	return a + b;
}

int mul(int a, int b)
{
	return a * b;
}

int main()
{
	int (*fp)(int, int);  //int형 반환값, int형 매개변수 두 개가 있는 함수 포인터 fp 선언

	fp = add;  //add 함수의 메모리 주소를 함수 포인터 fp에 저장
	printf("%d\n", fp(10, 20));
	fp = mul;  //mul 함수의 메모리 주소를 함수 포인터 fp에 저장
	printf("%d\n", fp(10, 20));
	return (0);
}
