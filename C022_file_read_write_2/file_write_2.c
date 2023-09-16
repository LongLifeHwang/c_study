#include <stdio.h>

int main()
{
	FILE* fp = fopen("hello.txt", "w");
	fputs("Hello 100!", fp);  //파일에 문자열 저장 
	fclose(fp);
	return 0;
}
