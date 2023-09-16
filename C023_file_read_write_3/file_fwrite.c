#include <stdio.h>
#include <string.h>  //strlen 함수가 선언된 헤더 파일 

int main()
{
	char *s1 = "Hello 100!";

	FILE* fp = fopen("hello.txt", "w");
	fwrite(s1, strlen(s1), 1, fp);
	fclose(fp);
	return 0;
}
