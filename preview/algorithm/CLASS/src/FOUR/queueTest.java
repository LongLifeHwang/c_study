package FOUR;

import FOUR.Queue;
import java.util.Scanner;

public class queueTest
{
    public static void  main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        int     size;
        Queue   test;
        int     num;
        int     data;

        System.out.printf("queue size : ");
        size = stdIn.nextInt();
        test = new Queue(size);
        while (true)
        {
            System.out.printf("stack %d / %d\n", test.getIdx(), test.getSize());
            System.out.printf("(1) inqueue  (2)dequeue  (3)peek  (4)exit: ");
            num = stdIn.nextInt();
            if (num == 4)
                break ;
            else if (num == 1)
            {
                try {
                    System.out.printf("Queue data : ");
                    data = stdIn.nextInt();
                    test.inqueue(data);
                    System.out.printf("inqueue sucess\n");
                }
                catch (Queue.Over e)
                {
                    System.out.printf("queue over\n");
                }
            }
            else if (num == 2)
            {
                try {
                    test.dequeue();
                    System.out.printf("dequeue sucess\n");
                }
                catch (Queue.Empty e)
                {
                    System.out.printf("queue empty\n");
                }
            }
            else if (num == 3)
            {
                try {
                    test.peek();
                    System.out.printf("peek sucess\n");
                }
                catch (Queue.Empty e)
                {
                    System.out.printf("queue empty\n");
                }
            }
        }
    }
}