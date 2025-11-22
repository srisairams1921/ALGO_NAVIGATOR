package logicverse;

import java.util.Scanner;

public class HOME_PAGE {
	static Scanner sc= new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		boolean flag=true;
		iop_Login user = new iop_Login();	
				
		do {
			System.out.println("WELCOME TO OUR SITE ");
			System.out.println("======================");
			System.out.println("THE CHOICES ARE :  ");
			Thread.sleep(1000);
			System.out.println("1. SIGN-UP\n2. LOGIN IN\n3. FORGOT CREDENTIALS\n4. EXIT");
			System.out.print("ENTER YOUR CHOICE :");
			int us = sc.nextInt();
			switch(us) {
			case 1 : 
				{Thread.sleep(1000);
				user.Sign_Up();
				break;
				}
				
			case 2 : 
			{
				Thread.sleep(1000);
				user.Login();
				break;
			}
			case 3 : 
			{
				Thread.sleep(1000);
				user.Forgot();
				break;
			}
			case 4: 
			{
				Thread.sleep(1000);
				System.out.println("EXIT SUCCESSFULLY !");
				System.out.println("=======================");
				flag=false; 
				
				
			}
			default:
				System.out.println("THANKS FOR USING US 🤗🤗🤗");
			
			}
			
		}
		while(flag);
	}

}
/*
 * © 2025 SRI SAI RAM S. All rights reserved.
 *
 * This code is licensed for personal and educational use only.
 * Unauthorized copying, modification, or distribution is prohibited.
 */