#include <stdio.h>

int main()
{
	int num1;
	char s1[10];

	FILE* fp = fopen("hello.txt", "w");
	//파일 포인터를 반환 
	fprintf(fp, "%s %d\n", "Hello", 100);
	fclose(fp);
	FILE* fp1 = fopen("hello.txt", "r");  //hello.txt 파일을 읽기 모드(r)로 열기, 파일 포인터를 반환
	fscanf(fp1, "%s %d", s1, &num1);  //서식을 지정하여 파일에서 문자열 읽기
	printf("%s %d\n", s1, num1);  //파일에서 읽은 값을 출력
	fclose(fp1);  //파일 포인터 닫기
	return 0;
}
