package logicverse;

import java.util.*;
public class iop_Login {
	int uid;
	long contact;
	String pass;
     boolean account_exists=false;
	
	static Scanner sc = new Scanner(System.in);
	
	

	/////////////////////////////////////////////////sign up/////////////////////////////////////////////////////////////////////
	public  void Sign_Up() {
		
//new account creation.		
		if(!account_exists) {
			System.out.println("==============================================");
			System.out.println("\t\t\tSIGN UP");
			System.out.println("==============================================");
			System.out.print("CREATE YOUR ID : ");
			 uid= sc.nextInt();
			 pause(1000);
			System.out.println("THE ID HAS BEEN CREATED !!");
			System.out.println();
			System.out.print("ENTER YOUR  MOBILE NO : ");
			long contact= sc.nextLong();
			 int count = 0;

		        while(contact > 0) {
		            contact /= 10;
		            count++;
		        }

		        if(count == 10) {
		        	 pause(1000);
		        	System.out.println("THE CONTACT IS SAVED !!");
		        }
		        else {
		        	 pause(1000);
		        	System.out.println("CHECK THE CONTACT !!");
		        	return;
		        	 
		        }
		      
			System.out.println();
			System.out.print("CREATE YOUR PASSWORD : ");
			pass= sc.next();
			 pause(1000);
			System.out.println("THE PASSWORD HAS BEEN CREATED !!");
			System.out.println();
			System.out.println("\t\t\t WELCOME !!");
			System.out.println("=================================================");
			account_exists=true;
			
			
		}
		else {
			 pause(1000);
			System.out.println("CREATE A NEW ACCOUNT !!");
		}
	}
		

	public void Login() {

	    if (!account_exists) {
	        pause(1000);
	        System.out.println("CREATE A NEW ACCOUNT FIRST !!");
	        return;
	    }

	    System.out.println("==============================================");
	    System.out.println("\t\t\tLOGIN");
	    System.out.println("==============================================");

	    System.out.print("ENTER YOUR ID : ");
	    int idCheck = sc.nextInt();
////////check id;
	    if (idCheck != uid) {
	        pause(1000);
	        System.out.println("WRONG ID !!");
	        return;
	    }

	    System.out.println("THE ID IS CORRECT !!");
	    System.out.println();
	    System.out.print("ENTER YOUR PASSWORD : ");
	    String passCheck = sc.next();
////////check password
	    if (!passCheck.equals(pass)) {
	        pause(1000);
	        System.out.println("WRONG PASSWORD !!");
	        return;
	    }

	    pause(1000);
	    System.out.println();
	    System.out.println("THE PASSWORD IS CORRECT !!");
	    pause(1000);
	    System.out.println("\t\t\t WELCOME BACK !!");
	    System.out.println("=================================================");
////////program showing
	    System.out.println("WHICH PART DO YOU WANT ?");
	    System.out.println("1. ARRAY PROGRAMMING");
	    System.out.println("2. STRING PROGRAMMING");
	    System.out.print("ENTER YOUR CHOICE : ");
	    int choice = sc.nextInt();

	    switch (choice) {
// array programming      
	        case 1:
	        {  pause(1000);
	            System.out.println("============ ARRAY PROGRAMMING ============");
	            System.out.println("THE ARRAY PROGRAMS ARE : ");
	            System.out.println("1. REVERSE AN ARRAY");
	            System.out.println("2. REMOVE DUPLICATES");
	            System.out.println("3. SHIFT ALL 1's TO ONE END");
	            System.out.println("4. ARRAY ROTATION");
	            System.out.println("5. NTH LARGEST");
	            System.out.println("6. COUNT TOTAL PRIME");
	            System.out.println("7. SUB-ARRAY ENUMERATION");
	            System.out.println("8. EXIT");
	            System.out.print("ENTER YOUR CHOICE : ");

	            int achoice = sc.nextInt();

	            switch (achoice) {

	                case 1:
	                {
	                    System.out.print("Enter the array size : ");
	                    int size = sc.nextInt();

	                    int[] array = new int[size];

	                    System.out.print("Enter the elements : ");
	                    for (int i = 0; i < size; i++)
	                        array[i] = sc.nextInt();

	                    ARRAY_PRO.reverse(array);
	                    break;
	                }

	                case 2:
	                {
	                    System.out.print("Enter the array size : ");
	                    int size = sc.nextInt();

	                    int[] array = new int[size];

	                    System.out.print("Enter the elements : ");
	                    for (int i = 0; i < size; i++)
	                        array[i] = sc.nextInt();

	                    ARRAY_PRO.removeDuplicates(array);
	                    break;
	                }

	                case 3:
	                {
	                    System.out.print("Enter the array size : ");
	                    int size = sc.nextInt();

	                    int[] array = new int[size];

	                    System.out.print("Enter the elements : ");
	                    for (int i = 0; i < size; i++)
	                        array[i] = sc.nextInt();

	                    ARRAY_PRO.shift(array);
	                    break;
	                }

	                case 4:
	                {
	                    System.out.println("WHICH ROTATION DO YOU WANT?");
	                    System.out.println("1. RIGHT ROTATION");
	                    System.out.println("2. LEFT ROTATION");
	                    int rchoice = sc.nextInt();

	                    System.out.print("Enter the array size : ");
	                    int size = sc.nextInt();

	                    int[] array = new int[size];

	                    System.out.print("Enter the elements : ");
	                    for (int i = 0; i < size; i++)
	                        array[i] = sc.nextInt();

	                    System.out.print("Enter how many rotations : ");
	                    int n = sc.nextInt();

	                    if (rchoice == 1)
	                        ARRAY_PRO.rr(array, n);
	                    else
	                        ARRAY_PRO.llr(array, n);

	                    break;
	                }

	                case 5:
	                {
	                    System.out.print("Enter the array size : ");
	                    int size = sc.nextInt();

	                    int[] array = new int[size];

	                    System.out.println("Enter the elements : ");
	                    for (int i = 0; i < size; i++)
	                        array[i] = sc.nextInt();

	                    System.out.print("Enter N (Nth largest) : ");
	                    int n = sc.nextInt();

	                    ARRAY_PRO.nthLargest(array, n);
	                    break;
	                }

	                case 6:
	                {
	                    System.out.print("Enter the array size : ");
	                    int size = sc.nextInt();

	                    int[] array = new int[size];

	                    System.out.print("Enter the elements : ");
	                    for (int i = 0; i < size; i++)
	                        array[i] = sc.nextInt();

	                    ARRAY_PRO.countPrimes(array);
	                    break;
	                }

	                case 7:
	                {
	                    System.out.print("Enter the array size : ");
	                    int size = sc.nextInt();

	                    int[] array = new int[size];

	                    System.out.print("Enter the elements : ");
	                    for (int i = 0; i < size; i++)
	                        array[i] = sc.nextInt();

	                    ARRAY_PRO.sae(array);
	                    break;
	                }

	                case 8:
	                {
	                    System.out.println("THANK YOU FOR USING 🤗");
	                    break;
	                }

	                default:
	                    System.out.println("INVALID CHOICE ❌");
	            }

	            break;
	        }

///string programming	        
	        case 2:
	        { pause(1000);
	            System.out.println("============ STRING PROGRAMMING ============");
	            System.out.println("1. ANAGRAM");
	            System.out.println("2. PANGRAM");
	            System.out.println("3. COUNT OCCURRENCE");
	            System.out.println("4. PALINDROME");
	            System.out.println("5. DUPLICATE CHARACTERS");
	            System.out.println("6. EXIT");
	            System.out.print("ENTER YOUR CHOICE : ");

	            int schoice = sc.nextInt();
	            sc.nextLine(); // clear buffer

	            switch (schoice) {

	                case 1:
	                {
	                    System.out.print("Enter first string  : ");
	                    String s1 = sc.nextLine();

	                    System.out.print("Enter second string : ");
	                    String s2 = sc.nextLine();

	                    STRING_PRO.ana(s1, s2);
	                    break;
	                }

	                case 2:
	                {
	                    System.out.print("Enter a string : ");
	                    String s = sc.nextLine();

	                    STRING_PRO.pana(s);
	                    break;
	                }

	                case 3:
	                {
	                    System.out.print("Enter a string : ");
	                    String s = sc.nextLine();

	                    System.out.print("Enter character : ");
	                    char ch = sc.next().charAt(0);

	                    STRING_PRO.coun(s, ch);
	                    break;
	                }

	                case 4:
	                {
	                    System.out.print("Enter a string : ");
	                    String s = sc.nextLine();

	                    STRING_PRO.pali(s);
	                    break;
	                }

	                case 5:
	                {
	                    System.out.print("Enter a string : ");
	                    String s = sc.nextLine();

	                    STRING_PRO.duplicate(s);
	                    break;
	                }

	                case 6:
	                {
	                    System.out.println("EXITING STRING PROGRAMMING 😊");
	                    break;
	                }

	                default:
	                    System.out.println("INVALID CHOICE ❌");
	            }
	            break;
	        }
	    }
	}


	////////////////////////////////////FORGOT////////////////////////////////////////////////////			
				public  void Forgot() {
					verify();
				}
				
	//////////////////////////////////////////VERIFY////////////////////////////////////////////////	
				
				public void verify() {

				    if (!account_exists) {
				        pause(1000);
				        System.out.println("CREATE A ACCOUNT FIRST !!");
				        return;   
				    }
				    System.out.print("ENTER YOUR MOBILE NO : ");
				    contact = sc.nextLong();
				    pause(1000);
				    System.out.println("OTP SENT TO THIS NUMBER !");
				    pause(1000);
				    int otp = (int)(Math.random() * 8999 + 1000);  
				    System.out.println("OTP SENT : " + otp);
				    pause(1000);
				    System.out.print("ENTER THE OTP : ");
				    int user = sc.nextInt();
				    if (user == otp) {
				        System.out.print("CREATE YOUR PASSWORD : ");
				        pass = sc.next();
				        pause(1000);
				        System.out.println("THE PASSWORD HAS BEEN CHANGED !!");
				        System.out.println();
				        pause(1000);
				        System.out.println("VERIFICATION PROCESS IS DONE !");
				        return;
				    }
				    else {

				        pause(1000);
				        System.out.println("WRONG OTP !! VERIFICATION FAILED ");
				        return;    
				    }
				}

				
				
////thread.sleep			
				public static void pause(int ms) {
				    try {
				        Thread.sleep(ms);
				    } catch (InterruptedException e) {}
				}


			
	     
	
	

}
/*
 * © 2025 SRI SAI RAM S. All rights reserved.
 *
 * This code is licensed for personal and educational use only.
 * Unauthorized copying, modification, or distribution is prohibited.
 */