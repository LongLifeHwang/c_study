#include <stdio.h>

void printNumber(int args, ...)
{
	printf("%d ", args);
}

int main()
{
	printNumber(1, 10);
	printNumber(2, 10, 20);
	printNumber(3, 10, 20, 30);
	printNumber(4, 10, 20, 30, 40);
	printf("\n");
	return 0;
}
