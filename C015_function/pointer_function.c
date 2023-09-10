#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>  
#include <stdbool.h>  //bool, true, false 함수가 정의된 헤더 파일 
#include <stdlib.h>  //malloc, free 함수가 선언된 헤더 파일 
#include <string.h>

int* one()
{
	int* numPtr = malloc(sizeof(int));  //int 크기만큼 동적 메모리 할당합니다. 
	*numPtr = 10;  //역참조로 10저장합니다. 
	return numPtr;  //포인터 반환하고 malloc으로 메모리를 할당하면 함수가 끝나도 사라지지 않습니다. 
}

float* realNumber()
{
	float* realnumber = malloc(sizeof(float));
	*realnumber = 1.234567f;
	return realnumber;
}

bool* truth()
{
	bool* truth = malloc(sizeof(bool));
	*truth = true;
	return truth;
}

char* helloLiteral()  //char 포인터르 반환하는 helloLiteral 함수 정의
{
	char* s1 = "Hello, world!";
	return s1;  //문자열 Hello, world!는 메모리에 저장되어 있으므로 사라지지 않습니다. 문자열 포인터 리턴해줍니다. 
}

char* helloDynamicMemory()  //char 포인터를 반환하는 helloDynamicMemory 함수 정의
{
	char* s1 = malloc(sizeof(char) * 20);  //char 20개 크기만큼 동적 메모리 할당합니다. 
	strcpy(s1, "Hello, world!");  //"Hello, world!"를 s1에 복사해줍니다. 
	return s1;  //문자열 포인터 리턴합니다. 
}

//자료형에 상관없이 값을 꺼내오고 싶다면?
void* allocMemory()  //void 포인터를 반환하는 allocMemory 함수 정의 
{
	void* ptr = malloc(100);  //100바이트만큼 동적 메모리 할당합니다. 
	return ptr;  //void 포인터 반환합니다. 
	//return malloc(100);
}

int main()
{
	int* num1;
	float* num2;
	bool* b1;
	char* s1;
	char* s2;
	char* s3;
	int* numPtr1;

	num1 = one();  //int형 포이터를 반환했으므로 int형 포인터 변수에 저장합니다. 
	num2 = realNumber();  //float형 포인터를 반환했으므로 float형 포인터 변수에 저장합니다. 
	b1 = truth();  //bool형을 포인터를 반환했으므로 bool형 포이인터 변수에 저장합니다. 
	s1 = helloLiteral();
	s2 = helloDynamicMemory();
	s3 = allocMemory();  //void 포인터를 char 포인터에 넣어서 문자열처럼 사용합니다.
	strcpy(s3, "Hello, world!");
	numPtr1 = allocMemory();  //void 포인터를 int 포인터에 넣어서 정수 배열 처럼 사용합니다. 
	numPtr1[0] = 10;
	numPtr1[1] = 20;

	printf("%d\n", *num1);
	printf("%d\n", *one());
	printf("%f\n", *num2);
	printf("%f\n", *realNumber());
	printf("%d\n", *b1);
	printf("%d\n", *truth());
	printf("%s\n", s1);
	printf("%s\n", s2);
	printf("%s\n", s3);
	printf("%d %d\n", numPtr1[0], numPtr1[1]);
	//동적 메모리는 함수를 벗어나도 계속 유지되므로 메모리를 해제하지 않으며 그대로 메모리 누수가 발생하게 됩니다. 
	free(s2);
	free(s3);
	free(numPtr1);
	return 0;
}
