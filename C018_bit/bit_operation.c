#include <stdio.h>

int main()
{
	unsigned char num1 = 1;
	unsigned char num2 = 3;
	unsigned char num3 = 162;  //162: 1010 0010
	unsigned char num4;
	unsigned char num5 = 24;
	unsigned char num6 = 4;
	unsigned char num7 = 4;
	unsigned char num8 = 4;
	unsigned char num9 = 4;
	unsigned char num10 = 4;

	printf("%d\n", num1 & num2);  //01과 03을 비트 AND하면 01이 됨
	printf("%d\n", num1 | num2);  //01과 03을 비트 OR하면 11이 됨
	printf("%d\n", num1 ^ num2);  //01과 03을 비트 XOR하면 10이 됨
	num4 = ~num3;
	printf("%u\n", num4);  //93: 0101 1101
	printf("%u\n", num2 << 3);  //24: 0001 1000: num1의 비트 값을 왼쪽으로 3번 이동
	printf("%u\n", num5 >> 2);  //6: 0000 0110: num2의 비트 값을 오른쪽으로 2번 이동 
	num6 &= 5;  //5(0000 0101) AND 연산 후 할당
	num7 |= 2;  //2(0000 0010) OR 연산 후 할당
	num8 ^= 3;  //3(0000 0011) XOR 연산 후 할당
	num9 <<= 2;  //비트를 왼쪽으로 2번 이동한 후 할당
	num10 <<= 2;  //비트를 오른쪽으로 2번 이동한 후 할당
	printf("%u\n", num6);  //1: 0000 0001
	printf("%u\n", num7);  //6: 0000 0110
	printf("%u\n", num8);  //248: 1111 1000
	printf("%u\n", num9);  //16: 0001 0000
	printf("%u\n", num10); //1: 0000 0001
	return 0;
}
