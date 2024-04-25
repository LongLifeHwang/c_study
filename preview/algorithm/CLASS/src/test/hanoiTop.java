package TEST;

import java.util.Scanner;

public class hanoiTop
{
    static void hanoi(int index, int x, int y)
    {
        if (index > 1)
            hanoi(index - 1, x, 6 - x - y);
        System.out.printf("%d번째 원반을 %d에서 %d로 옮김\n", index, x, y);
        if (index > 1)
            hanoi(index - 1, 6 - x - y, y);
    }

    public static void  main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        int     N;
    
        System.out.printf("N : ");
        N = stdIn.nextInt();
        hanoi(N, 1, 3);
    }
}
