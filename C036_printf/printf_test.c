#include <stdio.h>

int main(void)
{
	printf("%7d\n", 123);  //	123
	printf("%7d\n", 1234);  //   1234
	printf("%7d\n", 123456);  // 123456
	printf("%20s\n", "OdOp");  //				OdOp
	printf("%20s\n", "Hello, world!");  //	   Hello, world!
	printf("%8.2f\n", 0.2345678f);  //   0.23
	return 0;
}
