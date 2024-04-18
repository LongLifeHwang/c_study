package FIVE;

import java.util.Scanner;

public class hanoi
{
    static void han(int N, int x, int y)
    {
        if (N > 1)
            han(N - 1, x, 6 - x -y);
        System.out.printf("%d원반을 %d에서 %d로 옮김\n", N, x, y);
        if (N > 1)
            han(N - 1, 6 - x - y, y);
    }
    public static void  main(String[] args)
    {
        int N;
        Scanner stdIn = new Scanner(System.in);

        System.out.printf("N : ");
        N = stdIn.nextInt();
        han(N, 1, 3);
    }
}
