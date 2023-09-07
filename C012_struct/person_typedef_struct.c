#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>  
#include <string.h>  //strcpy 함수가 선언된 헤더 파일

typedef struct _Person {
	char name[20];
	int age;
	char address[100];
} Person;

int main()
{
	Person p1;  //구조체 별칭 Person으로 변수 선언

	strcpy(p1.name, "홍길동");
	p1.age = 20;
	strcpy(p1.address, "서울시 용산구 한남동");
	//점으로 구 조체 멤버에 접근하여 값 출력
	printf("이름: %s\n", p1.name);
	printf("나이: %d\n", p1.age);
	printf("주소: %s\n", p1.address);
	return 0;
}
