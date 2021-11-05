import java.util.Scanner;

public class Traps
{
    public static int digitSum(int x)
    {
        int sum =0;
        while(x!=0)
        {
            int d= x%10;
            sum= sum+d;
            x=x/10;
        }
        return sum;
    }
    public static boolean traps(int x, int y)
    {
        boolean to_return=false;

        if(x==y|| x%y==0|| y%x==0)
        {
            to_return= true;
        }
        return to_return;
    }
    public static void main(String[] args)
    {
        int n1,n2,y,z,temp=0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        n1= scan.nextInt();
        n2= scan.nextInt();
        y= scan.nextInt();

        for(int x= n1;x<=n2;x++)
        {
            temp=x;
            boolean traps=false;

            while(digitSum(x)!=temp)
            {
                z= digitSum(temp);
                if(traps(z,y))
                {
                    traps=true;
                    break;
                }
                temp=z;
            }
            if(traps|| traps(x,y))
            {
                System.out.print(x+" ");
                y=y+2;

            }
            else
            {

                y=y-1;

            }
            if(y<3) //resetting y to 3
            {
                y=3;

            }


        }


    }


}