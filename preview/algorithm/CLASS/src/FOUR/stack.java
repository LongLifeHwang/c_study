package FOUR;

public class stack
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
    int     index;
    int[]   x;

    public stack(int S)
    {
        size = S;
        x = new int[S];
        index = 0;
    }

    public int  push(int n) throws Over
    {
        if (index >= size)
            throw new Over();
        x[index++] = n;
        return (n);
    }

    public int  pop() throws Empty
    {
        if (index < 1)
            throw new Empty();
        return (x[--index]);
    }

    public int  getCount()
    {
        return (index);
    }

    public int  getSize()
    {
        return (size);
    }

    public void  peek() throws Empty
    {
        if (index < 1)
            throw new Empty();
        for (int i = 0; i < index; i++)
            System.out.printf("%d ", x[i]);
        System.out.printf("\n");
    }
}
