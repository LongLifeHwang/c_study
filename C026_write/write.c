#include <unistd.h>

int main(void)
{
	write(1, "abcd", 4);
	return (0);
}
