#include <stdio.h>
#include <string.h>  //strlen 함수가 선언된 헤더 파일 

int main()
{
	char *s1 = "Hello 100!";
	char buffer1[20] = { 0, };  //파일을 읽을 때 사용할 임시 공간, 미리 0으로 전부 초기화 

	FILE* fp = fopen("hello.txt", "w");
	fwrite(s1, strlen(s1), 1, fp);
	fclose(fp);
	FILE* fp1 = fopen("hello.txt", "r");
	fread(buffer1, sizeof(buffer1), 1, fp1);
	printf("%s\n", buffer1);
	fclose(fp1);
	return 0;
}
