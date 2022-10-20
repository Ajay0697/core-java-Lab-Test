//find oldest and youngest among them
import java.util.*;

//declaring a class
class YoungOld
{
public static void main(String []args)
	{
	//declaring variables
		
		int a,b,c;
		Scanner s= new Scanner(System.in);
		System.out.println("enter the number:");
		a= s.nextInt();
		b= s.nextInt();
		c= s.nextInt();

	//condition 
		
	if ((a > b) && (a > c))
    {
        if (b>c)
        {
          System.out.println( "a oldest and c is youngest");
        }
        else
        {
          System.out.println ("a is oldest and b is youngest");
        }
    }
    else if ((b>c) && (b>a))
    {
        if (c>a)
        {
          System.out.println ( "b is oldest and a is youngest");
        }
        else
        {
           System.out.println("b is oldest and c is youngest");
        }
    }
    else
    {
        if (a>b)
        {
          System.out.println ("c is oldest and b is youngest");
        }
        else
        {
          System.out.println ( "c is oldest and a is youngest");
        }
    }

    

		}

	
}