package TEST;

import java.util.Scanner;

public class hanoiTest
{
    static void hanoi(int N, int x, int y)
    {
        if (N > 1)
            hanoi(N - 1, x, 6 - x - y);  //1번 기둥에서 2번 기둥으로 옮기기
        System.out.printf("%d번쨰 원반을 %d에서 %d로 옮김\n", N, x, y);
        if (N > 1)
            hanoi(N -1, 6 - x - y, y); //2번 기둥에서 3번 기둥으로 옮기기
    }

    public static void  main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        int     N;

        System.out.printf("원반의 개수 :");
        N = stdIn.nextInt();
        hanoi(N, 1, 3);
    }
}
