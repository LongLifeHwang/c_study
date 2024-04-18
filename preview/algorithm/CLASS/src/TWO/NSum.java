package TWO;

import java.util.Scanner;

public class NSum
{
    public static void  main(String[] args)
    {
        int N, sum;
        Scanner stdIn = new Scanner(System.in);

        System.out.printf("정수를 입력하세요. \n");
        System.out.printf("N : ");
        N = stdIn.nextInt();
        sum = 0;
        for (int i = 1; i <= N; i++)
        {
            sum += i;
        }
        System.out.printf("1부터 %d까지의 합은 %d입니다. \n", N, sum);
    }
}
