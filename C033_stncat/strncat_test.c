#include <stdio.h>
#include <string.h>

int main() 
{
	char s1[14] = "Hello, ";
	char s2[7] = "world!";

	printf("s1: \"%s\"\n", s1);  //s1: "Hello, "
	printf("s2: \"%s\"\n", s2);  //s2: "world!"
	printf("%s\n", strncat(s1, s2, 2));  //Hello, wo
	printf("%s\n", s1);  //Hello, wo
	return 0;
}
