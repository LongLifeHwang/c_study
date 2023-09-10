#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>  
#include <stdbool.h>  //bool, true, false 함수가 정의된 헤더 파일

int one()
{
	return 1;
}

float realNumber()
{
	return 1.234567f;
}

bool truth()
{
	return true;
}

int main()
{
	int num1;
	float num2;
	bool b1;

	num1 = one();  //int형을 반환했으므로 int형 변수에 저장합니다. 
	num2 = realNumber();  //float형을 반환했으므로 float형 변수에 저장합니다. 
	b1 = truth();  //bool형을 반환했으므로 bool형 변수에 저장합니다. 
	printf("%d\n", num1);
	printf("%d\n", one());  //one 함수의 반환값을 바로 사용합니다.
	printf("%f\n", num2);
	printf("%f\n", realNumber());
	printf("%d\n", b1);
	return 0;
}
