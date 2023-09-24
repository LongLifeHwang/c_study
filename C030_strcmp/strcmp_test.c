#include <stdio.h>
#include <string.h>

int main()
{
	printf("%d\n", strcmp("abc", "ab"));  //1
	printf("%d\n", strcmp("abc", "abv"));  //-1
	printf("%d\n", strcmp("abc", "abc"));  //0
	return 0;
}
