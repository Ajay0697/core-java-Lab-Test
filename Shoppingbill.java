import java.util.*;
//declaration
class ShopingBill
{
	//main started
	public static void main(String args[])
	{
	Scanner sc= new Scanner(System.in);

	  //declaring variables
	   char IDName;
	   int qty,amount;
	   float discount,ds;

	   System.out.println("Enter username :");
	   IDName=sc.next().charAt(0);
	   System.out.println("Enter quntity :");
	   qty=sc.nextInt();

	  //calculate variables
	  amount= 540*qty;
	  ds=(amount/10);
	  discount=amount-ds;

	   //cheaking variables
		 if(discount>=2000)
			 System.out.println("you get 10% and your amount is  :"+discount);

	       else
		     System.out.println("your total ammount is :"+amount);

	   	   //end of outer ifelse

	}//end of main
}//end of class