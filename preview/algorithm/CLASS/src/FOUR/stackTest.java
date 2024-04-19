package FOUR;

import FOUR.stack;
import java.util.Scanner;

public class stackTest
{
    public static void  main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        int     num;
        int     data;
        int     N;
        stack   test;
    
        System.out.printf("stack size : ");
        N = stdIn.nextInt();
        test = new stack(N);
        while (true)
        {
            System.out.printf("stack %d / %d\n", test.getCount(), test.getSize());
            System.out.printf("(1) pop  (2)push  (3)peek  (4)exit: ");
            num = stdIn.nextInt();
            if (num == 4)
                break ;
            else if (num == 1)
            {
                try{
                    test.pop();
                    System.out.printf("pop success\n");
                }
                catch (stack.Empty e)
                {
                    System.out.printf("stack empty\n");
                }
            }
            else if (num == 2)
            {
                try{
                    System.out.printf("push data : ");
                    data = stdIn.nextInt();
                    test.push(data);
                    System.out.printf("push success\n");
                }
                catch (stack.Over e)
                {
                    System.out.printf("stack over\n");
                }
            }
            else if (num == 3)
            {
                try{
                    test.peek();
                    System.out.printf("peek success\n");
                }
                catch (stack.Empty e)
                {
                    System.out.printf("stack empty\n");
                }
            }
        }
    }
}
