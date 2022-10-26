/*
Program: enhanced switch case
@author: Ajay kumar garai
@Date: 26 oct 2022  
*/

//import packages 

import java.util.Scanner;
//declaring a class
class EnhancedSwitch
{
 //method to print full form of abbreviation
 static void printAbbr(String abbr)
  {
  switch(abbr)
	{
	//expression level
	 case "akb" ->System.out.println("Apno Ka Bank");		               
     case "ctw" ->System.out.println("Change the world");		              		
     case "asap"-> System.out.println("As soon as possible");	
		   
       default-> System.out.println("Wrong input");						
	 } 

	}	


  //main started
	
  public static void main(String args[])
	{
      // switch case with string
	   String inputAbbr;

	    //declaring the object of scanner
		Scanner sc = new Scanner(System.in);

		System.out.println("enter an abbreviation(akb,asap,ctw):");
		inputAbbr= sc.next().toLowerCase();// converting the input to lowercase

	   //calling method
	  printAbbr(inputAbbr);



	}

	// end of main
}
// end of class 
