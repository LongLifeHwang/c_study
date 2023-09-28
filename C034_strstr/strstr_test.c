#include <stdio.h>
#include <string.h>

int main() 
{
	char s1[14] = "Hello, World!";
	char* ptr1 = strstr(s1, "World");
	char* ptr2 = strstr(s1, "o,");

	printf("%s\n", ptr1);  //World!
	printf("%s\n", ptr2);  //o, World!
	return 0;
}
