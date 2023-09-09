#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>  


#pragma pack(push, 1)  //1바이트 크기로 정렬 
struct PacketHeader {
	char flags;
	int seq;
};
#pragma pack(pop)  
//정렬 설정을 이전 상태(기본값)로 되돌림

struct PacketHeader2 {
	char flags;
	int seq;
};

int main()
{
	struct PacketHeader header;
	struct PacketHeader2 header2;

	//PackHeader
	printf("%d\n", sizeof(header.flags));  //char은 1바이트
	printf("%d\n", sizeof(header.seq));  //int는 4바이트
	printf("%d\n", sizeof(header));  //구조체 전체 크기는 5바이트
	printf("%d\n", sizeof(struct PacketHeader));  //구조체 이름으로 구조체 전체 크기를 구해 5바이트
	//PackHeader2
	printf("%d\n", sizeof(header2.flags));  //char은 1바이트
	printf("%d\n", sizeof(header2.seq));  //int는 4바이트
	printf("%d\n", sizeof(header2));  //구조체 전체 크기는 8바이트
	printf("%d\n", sizeof(struct PacketHeader2));  //구조체 이름으로 구조체 전체 크기를 구해 8바이트
	return 0;
}
