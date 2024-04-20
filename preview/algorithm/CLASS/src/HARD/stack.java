package HARD;

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

    int[]   x;
    int     size;
    int     idx;

    public stack(int S) throws Empty
    {
        size = S;
        idx = 0;
        try {
            x = new int[S];
        }
        catch (OutOfMemoryError e){
            throw new Empty();
        }
    }

    public void push(int n) throws Over
    {
        if (idx >= size)
            throw new Over();
        x[idx++] = n;
    }

    public void pop() throws Empty
    {
        if (idx == 0)
            throw new Empty();
        idx--;
    }

    public void peek() throws Empty
    {
        if (idx == 0)
            throw new Empty();
        for (int i = 0; i < idx; i++)
            System.out.printf("%d ", x[i]);
        System.out.printf("\n");
    }

    public int  getSize()
    {
        return (size);
    }

    public int  getIdx()
    {
        return (idx);
    }
}
