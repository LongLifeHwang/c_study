#include <stdio.h>

int main()
{
	char buffer[20];

	FILE* fp = fopen("hello.txt", "w");
	fputs("Hello 100!", fp);  //파일에 문자열 저장 
	fclose(fp);
	FILE* fp1 = fopen("hello.txt", "r");  //hello.txt 파일을 읽기 모드로 열기
	fgets(buffer, sizeof(buffer), fp1);
	printf("%s\n", buffer);
	fclose(fp1);
	return 0;
}
