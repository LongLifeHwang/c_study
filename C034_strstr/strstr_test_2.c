#include <stdio.h>
#include <string.h>

int main() 
{
	char s1[14] = "Hello, World!";
	char* ptr = strstr(s1, "world");
	
	printf("%s\n", ptr);  //
	return 0;
}
