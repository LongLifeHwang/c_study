#include <stdio.h>
#include <stdarg.h>  //va_list, va_start, va_arg, va_end가 정의된 헤더 파일

void printValues(char types[], ...)
{  //가변 인자의 자료형을 받음, ...으로 가변 인자 설정
	va_list ap;  //가변 인자 목록 
	int i = 0;
	va_start(ap, types);  //types 문자열에서 문자 개수를 구해서 가변 인자 포인터 설정
	while (types[i] != '\0')
		//"\0"로하면 오류 발생 '\0'로 할것 
	{  //가변 인자 자료형이 없을 때까지 반복 
		switch (types[i])
		{  //가변 인자 자료형으로 분기
		case 'i':  //int형일 때
			printf("%d ", va_arg(ap, int));  //int 크기만큼 값을 가져옴, ap를 int 크기만큼 순방향으로 이동
			break;
		case 'd':  //double형일 때
			printf("%f ", va_arg(ap, double));  //double 크기만큼 값을 가져옴, ap를 double 크기만큼 순방향으로 이동
			break;
		case 'c':  //char형 문자일 떄
			printf("%c ", (char)va_arg(ap, int));  //char 크기만큼 값을 가져옴, ap를 char 크기만큼 순방향으로 이동
			break;
		case 's':  //char *형 문자열일 때 
			printf("%s ", va_arg(ap, char*));  //char * 크기만큼 값을 가져옴, ap를 char * 크기만큼 순방으로 이동
			break;
		default:
			break;
		}
		i++;
	}
	va_end(ap);  //가변 인자 포인터를 NULL로 초기화 
	printf("\n");
}

int main()
{
	printValues("i", 10);  //정수
	printValues("ci", 'a', 10);  //문자, 정수
	printValues("dci", 1.234567, 'a', 10);  //실수, 문자, 정수
	printValues("sdci", "Hello, world!", 1.234567, 'a', 10);  //문자열, 실수, 문자, 정수
	return 0;
}
