#include <stdio.h>

void hello()
{
	printf("Hello, world!\n");
}

int main()
{
	void (*fp)();  //반환값과 매개변수가 없는 함수 포인터 fp 선언 

	hello();  //함수 이름으로 함수를 직접 호출 
	fp = hello;  //hello 함수의 메모리 주소를 함수 포인터 fp에 저장
	fp();  //함수 포인터로 hello 함수 호출
	return (0);
}
