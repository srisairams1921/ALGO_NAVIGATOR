package logicverse;

import java.util.Arrays;
import java.util.Scanner;

public class ARRAY_PRO {
	static Scanner sc = new Scanner(System.in);
	
   public static  void reverse(int [] array) {
	   System.out.println("BEFORE REVERSING : " + Arrays.toString(array));
	   int l=0;
	   int r= array.length-1;
	   while(l<r) {
		   int temp=array[l];
		   array[l]=array[r];
		   array[r]=temp;
		   l++;
		   r--;
		   
	   }
	   
	   System.out.println("AFTER  REVERSING : " + Arrays.toString(array));
	   System.out.println();
	   System.out.println("DO YOU WANT TO SHOW THE PROGROM FOR REFERENCE ");
	   System.out.println("\n1. YES\n2. NO");
	   System.out.print("ENTER THE CHOICE : ");
	   int choice = sc.nextInt();
	   switch(choice) {
	   case 1: 
		   {   System.out.println("REVERSE AN ARRAY ");
		       System.out.println("===========================================================================");
			   System.out.println("System.out.println(\"BEFORE REVERSING : \" + Arrays.toString(array));\r\n"
		   		+ "	   int l=0;\r\n"
		   		+ "	   int r= array.length-1;\r\n"
		   		+ "	   while(l<r) {\r\n"
		   		+ "		   int temp=array[l];\r\n"
		   		+ "		   array[l]=array[r];\r\n"
		   		+ "		   array[r]=temp;\r\n"
		   		+ "		   l++;\r\n"
		   		+ "		   r--;\r\n"
		   		+ "		   \r\n"
		   		+ "	   }\r\n"
		   		+ "	   \r\n"
		   		+ "	   System.out.println(\"AFTER  REVERSING : \" + Arrays.toString(array));");
			   System.out.println("===========================================================================");
		   break;}
		   
	   case 2:{
		   System.out.println("THANK YOU FOR USING 😊");
		   break;
	   }
	   }   
   }
   
   
   
   public static void removeDuplicates(int [] arr) {
		System.out.println("BEFORE REMOVING DUPLICATES : " + Arrays.toString(arr));
		  
		
		int count=0;
		
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==Integer.MIN_VALUE)continue;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					arr[j]=Integer.MIN_VALUE;
				}
			}
		}
		
		
		
		int [] res= new int[arr.length-count];
		int x=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=Integer.MIN_VALUE)
			        res[x++]=arr[i];
		}
		System.out.println("AFTER REMOVING DUPLICATES : " + Arrays.toString(res));
		
		System.out.println("DO YOU WANT TO SHOW THE PROGROM FOR REFERENCE ");
		   System.out.println("\n1. YES\n2. NO");
		   int choice = sc.nextInt();
		   switch(choice) {
		   case 1: 
			   {   System.out.println("REMOVE THE DUPLICATES FROM AN  ARRAY ");
			       System.out.println("===========================================================================");
				  System.out.println("System.out.println(\"BEFORE REMOVING DUPLICATES : \" + Arrays.toString(arr));\r\n"
				  		+ "		  \r\n"
				  		+ "		\r\n"
				  		+ "		int count=0;\r\n"
				  		+ "		\r\n"
				  		+ "		// remove duplicates\r\n"
				  		+ "		for(int i=0;i<arr.length;i++) {\r\n"
				  		+ "			if(arr[i]==Integer.MIN_VALUE)continue;\r\n"
				  		+ "			for(int j=i+1;j<arr.length;j++) {\r\n"
				  		+ "				if(arr[i]==arr[j]) {\r\n"
				  		+ "					count++;\r\n"
				  		+ "					arr[j]=Integer.MIN_VALUE;\r\n"
				  		+ "				}\r\n"
				  		+ "			}\r\n"
				  		+ "		}\r\n"
				  		+ "		\r\n"
				  		+ "		// print it\r\n"
				  		+ "		\r\n"
				  		+ "		int [] res= new int[arr.length-count];\r\n"
				  		+ "		int x=0;\r\n"
				  		+ "		for(int i=0;i<arr.length;i++) {\r\n"
				  		+ "			if(arr[i]!=Integer.MIN_VALUE)\r\n"
				  		+ "			        res[x++]=arr[i];\r\n"
				  		+ "		}\r\n"
				  		+ "		System.out.println(\"AFTER REMOVING DUPLICATES : \" + Arrays.toString(res));\r\n"
				  		+ "		\r\n"
				  		+ "");
				   System.out.println("===========================================================================");
			   break;}
			   
		   case 2:{
			   System.out.println("THANK YOU FOR USING 😊");
			   break;
		   }
		   }
 
	   }
   
   
   
   
   
   public static void shift(int[] x) {

	    System.out.println("BEFORE SHIFTING : " + Arrays.toString(x));
	    
	    int l = 0, r = x.length - 1;

	    while (l < r) {

	        while (l < r && x[l] == 0) l++;
	        while (l < r && x[r] == 1) r--;

	        if (l < r) {
	            int temp = x[l];
	            x[l] = x[r];
	            x[r] = temp;
	            l++;
	            r--;
	        }
	    }

	    System.out.println("AFTER SHIFTING : " + Arrays.toString(x));

	    System.out.println("DO YOU WANT TO SHOW THE PROGRAM FOR REFERENCE?");
	    System.out.println("\n1. YES\n2. NO");

	    int choice = sc.nextInt();
	    switch(choice) {
	        case 1:
	            System.out.println("SHIFT ALL 1'S TO ONE SIDE");
	            System.out.println("===========================================================================");
	            System.out.println(
	                "int l = 0, r = x.length - 1;\n" +
	                "while (l < r) {\n" +
	                "    while (l < r && x[l] == 0) l++;\n" +
	                "    while (l < r && x[r] == 1) r--;\n" +
	                "    if (l < r) {\n" +
	                "        int temp = x[l];\n" +
	                "        x[l] = x[r];\n" +
	                "        x[r] = temp;\n" +
	                "        l++;\n" +
	                "        r--;\n" +
	                "    }\n" +
	                "}"
	            );
	            System.out.println("===========================================================================");
	            break;

	        case 2:
	            System.out.println("THANK YOU FOR USING 😊");
	            break;
	    }
	}

   
   
   public static void llr(int[] x, int n) {
	    System.out.println("BEFORE ROTATION : " + Arrays.toString(x));

	    n = n % x.length; 

	    for (int i = 0; i < n; i++) {
	        int first = x[0];
	        for (int j = 0; j < x.length - 1; j++) {
	            x[j] = x[j + 1];
	        }
	        x[x.length - 1] = first;
	    }

	    System.out.println("AFTER ROTATION  : " + Arrays.toString(x));

	   
	    System.out.println("\nDO YOU WANT TO SEE THE PROGRAM FOR REFERENCE?");
	    System.out.println("1. YES\n2. NO");

	    int choice = sc.nextInt();
	    switch (choice) {
	        case 1:
	            System.out.println("LEFT ROTATION (LLR) PROGRAM");
	            System.out.println("====================================================================");
	            System.out.println(
	                "n = n % x.length;\n" +
	                "for(int i = 0; i < n; i++) {\n" +
	                "    int first = x[0];\n" +
	                "    for(int j = 0; j < x.length - 1; j++) {\n" +
	                "        x[j] = x[j + 1];\n" +
	                "    }\n" +
	                "    x[x.length - 1] = first;\n" +
	                "}"
	            );
	            System.out.println("====================================================================");
	            break;

	        case 2:
	            System.out.println("THANK YOU FOR USING 😊");
	            break;
	    }
	}
   
   
   
   public static void rr(int[] ar, int n) {
	    System.out.println("BEFORE RIGHT ROTATION : " + Arrays.toString(ar));

	    n = n % ar.length; 

	    for (int i = 0; i < n; i++) {

	        int last = ar[ar.length - 1];     
	        for (int j = ar.length - 1; j > 0; j--) {
	            ar[j] = ar[j - 1];           
	        }

	        ar[0] = last;                     
	    }

	    System.out.println("AFTER RIGHT ROTATION  : " + Arrays.toString(ar));


	    
	    System.out.println("\nDO YOU WANT TO SEE THE PROGRAM FOR REFERENCE?");
	    System.out.println("1. YES\n2. NO");
	    int choice = sc.nextInt();

	    switch (choice) {
	        case 1:
	            System.out.println("RIGHT ROTATION PROGRAM");
	            System.out.println("===============================================================");
	            System.out.println(
	                "n = n % ar.length;\n" +
	                "for (int i = 0; i < n; i++) {\n" +
	                "    int last = ar[ar.length - 1];\n" +
	                "    for (int j = ar.length - 1; j > 0; j--) {\n" +
	                "        ar[j] = ar[j - 1];\n" +
	                "    }\n" +
	                "    ar[0] = last;\n" +
	                "}"
	            );
	            System.out.println("===============================================================");
	            break;

	        case 2:
	            System.out.println("THANK YOU FOR USING 😊");
	            break;
	    }
	}

   
   
   
   public static void sae(int[] a) {

	    System.out.println("ALL POSSIBLE SUBARRAYS : ");
	    System.out.println("==============================================");

	    for (int i = 0; i < a.length; i++) {
	        String num = "";
	        for (int j = i; j < a.length; j++) {
	            num = num + a[j];
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }

	    System.out.println("==============================================");
	    System.out.println("\nDO YOU WANT TO SEE THE PROGRAM FOR REFERENCE?");
	    System.out.println("1. YES\n2. NO");

	    int choice = sc.nextInt();

	    switch (choice) {
	        case 1:
	            System.out.println("SUBARRAY  PROGRAM");
	            System.out.println("===============================================================");
	            System.out.println(
	                "for (int i = 0; i < a.length; i++) {\n" +
	                "    String num = \"\";\n" +
	                "    for (int j = i; j < a.length; j++) {\n" +
	                "        num = num + a[j];\n" +
	                "        System.out.print(num + \" \");\n" +
	                "    }\n" +
	                "    System.out.println();\n" +
	                "}"
	            );
	            System.out.println("===============================================================");
	            break;

	        case 2:
	            System.out.println("THANK YOU FOR USING 😊");
	            break;
	    }
	}

   
   public static void nthLargest(int[] a, int n) {

	    System.out.println("THE ARRAY YOU ENTERED : " + Arrays.toString(a));

	   
	    for (int i = 0; i < a.length; i++) {
	        for (int j = i + 1; j < a.length; j++) {
	            if (a[i] < a[j]) {
	                int temp = a[i];
	                a[i] = a[j];
	                a[j] = temp;
	            }
	        }
	    }

	    
	    if (n < 1 || n > a.length) {
	        System.out.println("INVALID NTH VALUE ");
	        return;
	    }

	    System.out.println("SORTED (DESCENDING) : " + Arrays.toString(a));
	    System.out.println(n + "th LARGEST ELEMENT : " + a[n - 1]);

	   
	    System.out.println("\nDO YOU WANT TO SEE THE PROGRAM FOR REFERENCE?");
	    System.out.println("1. YES\n2. NO");

	    int choice = sc.nextInt();
	    switch (choice) {
	        case 1:
	            System.out.println("NTH LARGEST ELEMENT PROGRAM");
	            System.out.println("===============================================================");
	            System.out.println(
	                "for (int i = 0; i < a.length; i++) {\n" +
	                "    for (int j = i + 1; j < a.length; j++) {\n" +
	                "        if (a[i] < a[j]) {\n" +
	                "            int temp = a[i];\n" +
	                "            a[i] = a[j];\n" +
	                "            a[j] = temp;\n" +
	                "        }\n" +
	                "    }\n" +
	                "}\n" +
	                "return a[n - 1];"
	            );
	            System.out.println("===============================================================");
	            break;

	        case 2:
	            System.out.println("THANK YOU FOR USING 😊");
	            break;
	    }
	}

   
   
   
   
   public static void countPrimes(int[] a) {

	    System.out.println("THE ARRAY YOU ENTERED : " + Arrays.toString(a));

	    int count = 0;

	   
	    for (int num : a) {

	        if (num < 2) continue;  

	        boolean prime = true;

	        for (int i = 2; i * i <= num; i++) {
	            if (num % i == 0) {
	                prime = false;
	                break;
	            }
	        }

	        if (prime) count++;
	    }

	    System.out.println("TOTAL PRIME NUMBERS : " + count);

	    
	    System.out.println("\nDO YOU WANT TO SEE THE PROGRAM FOR REFERENCE?");
	    System.out.println("1. YES\n2. NO");

	    int choice = sc.nextInt();

	    switch (choice) {

	        case 1:
	            System.out.println("COUNT TOTAL PRIME ELEMENTS PROGRAM");
	            System.out.println("===============================================================");
	            System.out.println(
	                "int count = 0;\n" +
	                "for (int num : a) {\n" +
	                "    if (num < 2) continue;\n" +
	                "    boolean prime = true;\n" +
	                "    for (int i = 2; i * i <= num; i++) {\n" +
	                "        if (num % i == 0) {\n" +
	                "            prime = false;\n" +
	                "            break;\n" +
	                "        }\n" +
	                "    }\n" +
	                "    if (prime) count++;\n" +
	                "}\n" +
	                "System.out.println(\"TOTAL PRIME NUMBERS : \" + count);"
	            );
	            System.out.println("===============================================================");
	            break;

	        case 2:
	            System.out.println("THANK YOU FOR USING 😊");
	            break;
	    }
	}

   
   
   
  }
 /*
 * © 2025 SRI SAI RAM S. All rights reserved.
 *
 * This code is licensed for personal and educational use only.
 * Unauthorized copying, modification, or distribution is prohibited.
 */
  
