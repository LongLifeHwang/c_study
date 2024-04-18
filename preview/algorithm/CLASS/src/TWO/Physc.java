package TWO;

public class Physc
{
    static class PhysData
    {
        String  name;
        int     height;
        double  vision;

        PhysData(String Name, int Height, double Vision)
        {
            this.name = Name;
            this.height = Height;
            this.vision = Vision;
        }
    }
    public static void  main(String[] args)
    {
        double sum;

        PhysData x[] = {
            new PhysData("김민하", 162, 0.3), 
            new PhysData("김진우", 173, 0.7), 
            new PhysData("박준서", 175, 2.0), 
            new PhysData("유시범", 171, 1.5), 
            new PhysData("이수연", 168, 0.4), 
            new PhysData("장경오", 174, 1.2),
            new PhysData("황지안", 169, 0.8),  
        };
        System.out.printf("신체 검사 리스트\n");
        sum = 0;
        for (int i = 0; i < x.length; i++)
        {
            System.out.printf("%-6s %3d %4.1f\n", x[i].name, x[i].height, x[i].vision);
            sum += x[i].height;
        }
        System.out.printf("평균 키 : %.1fcm\n", sum / x.length);
    }
}
