package TWO;

import java.util.Scanner;

public class MaxOfArray
{
    private static int  MaxOf(int []a)
    {
        int len;
        int max;

        len = a.length;
        max = a[0];
        for (int i = 1; i < len; i++)
        {
            if (max < a[i])
                max = a[i];
        }
        return (max);
    }
    public static void  main(String[] args)
    {
        int N;
        int []a;
        Scanner stdIn = new Scanner(System.in);

        System.out.printf("키의 최댓값을 구합니다.\n사람의 수 : ");
        N = stdIn.nextInt();
        a = new int[N];
        for (int i = 0; i < N; i++)
        {
            System.out.printf("height[%d] : ", i);
            a[i] = stdIn.nextInt();
        }
        System.out.printf("최댓값은 %d입니다.\n", MaxOf(a));
    }
}