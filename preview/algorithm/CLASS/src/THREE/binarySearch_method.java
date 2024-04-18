package THREE;

import java.util.Scanner;
import java.util.Arrays;

public class binarySearch_method
{
    public static void  main(String args[])
    {
        int     N;
        int     search;
        int[]   x;
        Scanner stdIn = new Scanner(System.in);

        System.out.printf("요솟수: ");
        N = stdIn.nextInt();
        System.out.printf("오름차순으로 입력하세요.\n");
        x = new int[N];
        System.out.printf("x[0] : ");
        x[0] = stdIn.nextInt();
        for (int i = 1; i < N; i++)
        {
            do {
                System.out.printf("x[%d] : ", i);
                x[i] = stdIn.nextInt();
            } while (x[i] < x[i - 1]);
        }
        System.out.printf("검색할 값: ");
        search = stdIn.nextInt();
        System.out.printf("검색 값은 x[%d]에 있습니다. \n", Arrays.binarySearch(x, search));
    }    
}
