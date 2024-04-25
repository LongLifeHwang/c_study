package TEST;

import java.util.Scanner;

public class selectSort
{
    static void sort(int[] x, int N)
    {

    }

    public static void  main(String[] args)
    {
        int     N;
        int[]   x;
        Scanner stdIn = new Scanner(System.in);
    
        System.out.printf("N : ");
        N = stdIn.nextInt();
        x = new int[N];
        for (int i = 0; i < N; i++)
        {
            System.out.printf("x[%d] : ", i);
            x[i] = stdIn.nextInt();
        }
        sort(x, N);
        System.out.printf("오름차순으로 정렬했습니다. \n");
        for (int i = 0; i < N; i++)
            System.out.printf("x[%d] : %d\n", i, x[i]);
    }
}
