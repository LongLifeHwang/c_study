#include <stdio.h>
#include <stdarg.h>  //va_list, va_start, va_arg, va_end가 정의된 헤더 파일

void printNumbers(int args, ...)
{
	va_list ap;  //가변 인자 목록 포인터
	va_start(ap, args);  //가변 인자 목록 포인터 설정
	for (int i = 0; i < args; i++)
	{
		printf("%d ",va_arg(ap, int));  //int 크기만큼 가변 인자 목록 포인터에서 값을 가져옴, ap를 int 크기만큼 순방향으로 이동
	}
	va_end(ap);  //가변 인자 목록 포인터를 NULL로 초기화 
	printf("\n");
}

int main()
{
	printNumbers(1, 10);
	printNumbers(2, 10, 20);
	printNumbers(3, 10, 20, 30);
	printNumbers(4, 10, 20, 30, 40);
	return 0;
}
