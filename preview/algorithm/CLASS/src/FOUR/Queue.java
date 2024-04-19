package FOUR;

public class Queue
{
    public class Empty extends RuntimeException
    {
        public Empty() {};
    }

    public class Over extends RuntimeException
    {
        public Over() {};
    }

    int     size;
    int     idx;
    int[]   x;

    public Queue(int S)
    {
        size = S;
        idx = 0;
        x = new int[S];
    }

    public void inqueue(int n) throws Over
    {
        if (idx > size - 1)
            throw new Over();
        x[idx++] = n;
    }

    public void dequeue() throws Empty
    {
        if (idx == 0)
            throw new Empty();
        for (int i = 1; i < idx; i++)
        {
            x[i - 1] = x[i];
        }
        idx--;
    }

    public int  getIdx()
    {
        return (idx);
    }

    public int  getSize()
    {
        return (size);
    }

    public void peek() throws Empty
    {
        if (idx == 0)
            throw new Empty();
        for (int i = 0; i < idx; i++)
        {
            System.out.printf("%d ", x[i]);
        }
        System.out.printf("\n");
    }
}
