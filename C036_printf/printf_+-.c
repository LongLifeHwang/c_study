#include <stdio.h>

int main()
{
	printf("%+07d\n", 123);  //+000123
	printf("%+07d\n", -123);  //-000123
	return 0;
}
