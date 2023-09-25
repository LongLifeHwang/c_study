#include <stdio.h>
#include <string.h>

int main()
{
	printf("%d\n", strncmp("abc", "ab", 2));  //0
	printf("%d\n", strncmp("abc", "abv", 3));  //-19
	printf("%d\n", strncmp("abcf", "abcd", 4));  //2
	return 0;
}
