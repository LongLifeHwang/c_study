#include <stdio.h>
#include <stdlib.h>  //malloc, free 함수가 선언된 헤더 파일

int	main(void)
{
	char *str1;
 
	str1 = malloc(sizeof(char) * 14);
	str1 = "Hello, world!";
	printf("%s\n", str1);
	free(str1);
	return (0);
}
