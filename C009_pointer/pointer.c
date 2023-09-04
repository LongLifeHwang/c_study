#include <stdio.h>

int main()
{
	int* numPtr;
	int num1 = 10;
    
	printf("%p\n", &num1);
	numPtr = &num1;
	//numPtr = num1;은 numPtr은 int 포인터형이고 num1은 int형이라 자료형이 일치하지 않음
	printf("%p\n", numPtr);
	printf("%d\n", *numPtr);  //역참조 연산자로 num1의 메모리 주소에 접근하여 값을 가져옴
	//numPtr앞에 *를 붙이면 numPtr에 저장된 메모리 주소로 가서 값을 가져옴
	return 0;
}

