/*
Program: WAP to implement enhanced switch case
@author: Ajay kumar garai
@Date: 26 Oct 2022  
*/


import java.util.Scanner;

public class AttendanceStudent {

public static void main(String args[]){
     try (Scanner in = new Scanner(System.in)) {
     int ch, cw;
	 char m;
	 float p;
	 
   
	String rs;
	System.out.print("Enter Number of Classes Held: ");
	ch = in.nextInt();
	System.out.print("Enter Number of Classes Attended: ");
	cw = in.nextInt();
	p = (((float)cw / (float)ch)*100);

	if(p >= 75)
	 {
	  rs = "You are allow to sit in exam";
		}
	    else 
		{
	   rs = "Not allowed to attend the exam";

			}
		System.out.println("Attendence: "+p+"\nResult: "+rs);
		}
	}
}

