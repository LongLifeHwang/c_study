#include <stdio.h>

int main()
{
	int numArr1[10] = { 11, 22, 33, 44, 55, 66, 77, 88, 99, 110 };
	int* numPtr1 = numArr1;  //포인터에 int형 배열을 할당
	int binary[20] = { 0, };

	printf("%d\n", numArr1[0]);
	printf("%d\n", numArr1[-1]);  //인덱스가 범위를 벗어난다면 쓰레기 값을 출력함
	printf("%d\n", sizeof(numArr1));  //4바이트 크기의 요소가 10개이므로 40바이트
	printf("%d\n", sizeof(numArr1) / sizeof(int));  //배열의 크기를 구할 때에는 전체 공간의 크기를 요소의 크기로 나누어줌
	printf("%d\n", *numPtr1);  //배열의 주소가 들어있는 포인터를 역참조하면 배열의 첫 번째 요소에 접근
	printf("%d\n", *numArr1);  //배열 자체를 역참조해도 배열의 첫 번째 요소에 접근
	printf("%d\n", numPtr1[5]);  //배열의 주소가 들어있는 포인터는 인덱스로 접근할 수 있음
	printf("%d\n", sizeof(numArr1));  //sizeof로 배열의 크기를 구하면 배열이 메모리에 차지하는 공간이 출력됨
	printf("%d\n", sizeof(numPtr1));  //sizeof로 배열의 주소가 들어있는 포인터의 크기르 구하면 포인터의 크기가 출력됨 int형의 크기 출력됨
	return 0;
}
