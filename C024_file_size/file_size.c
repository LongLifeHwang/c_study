#include <stdio.h>

int main()
{
	int size;
	char *s1 = "Hello 100!";

	FILE* fp = fopen("hello.txt", "w");
	fprintf(fp, "%s", s1);
	fclose(fp);
	FILE* fp1 = fopen("hello.txt", "r");  //hello.txt 파일을 읽기 모드(r)로 열기, 파일 포인터 반환 
	fseek(fp1, 0, SEEK_END);  //파일 포인터를 끝으로 이동시킴 
	size = ftell(fp1);  //파일 포인터의 현재 위치를 얻음, 파일의 크기를 알 수 있음
	printf("%d\n", size);
	fclose(fp);
	return 0;
}
