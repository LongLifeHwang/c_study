#include <stdio.h>
#include <string.h>

int main()
{
	char src[10] = "Hello!";
	char dest[10];

	strcpy(dest, src);
	printf("%s\n", dest);
	return 0;
}
