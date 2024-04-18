package TWO;

import java.util.Scanner;

public class MaxInt
{
    public static void  main(String[] args)
    {
        int a, b, c, max;
        Scanner stdIn = new Scanner(System.in);
    
        System.out.printf("세 정수를 입력하세요.\n");
        System.out.printf("a : ");
        a = stdIn.nextInt();
        System.out.printf("b : ");
        b = stdIn.nextInt();
        System.out.printf("c : ");
        c = stdIn.nextInt();
        max = a;
        if (max < b)
            max = b;
        if (max < c)
            max = c;
        System.out.printf("세 정수 중에 최대값은 %d입니다. \n", max);
    }
}
