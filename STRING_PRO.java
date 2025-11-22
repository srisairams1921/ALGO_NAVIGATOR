package logicverse;


import java.util.*;
public class STRING_PRO {
	static Scanner sc = new Scanner(System.in);
	
	
	
	public static void ana(String name, String name1) {

	    System.out.println("WORD 1 : " + name);
	    System.out.println("WORD 2 : " + name1);

	  
	    name = name.toLowerCase();
	    name1 = name1.toLowerCase();

	    if (name.length() != name1.length()) {
	        System.out.println("RESULT : NOT AN ANAGRAM ❌");
	        return;
	    }

	    // Convert to char arrays
	    char[] c  = name.toCharArray();
	    char[] c1 = name1.toCharArray();

	    // Sort
	    Arrays.sort(c);
	    Arrays.sort(c1);

	    if (Arrays.equals(c, c1)) {
	        System.out.println("RESULT : ANAGRAM ✔️");
	    } else {
	        System.out.println("RESULT : NOT AN ANAGRAM ❌");
	    }
        System.out.println();
	    System.out.println("\nDO YOU WANT TO SEE THE PROGRAM FOR REFERENCE?");
	    System.out.println("1. YES\n2. NO");
	    System.out.print("ENTER THE CHOICE : ");
	    int choice = sc.nextInt();

	    switch(choice) {
	        case 1:
	            System.out.println("ANAGRAM CHECK PROGRAM");
	            System.out.println("===============================================================");
	            System.out.println(
	                "name = name.toLowerCase();\n" +
	                "name1 = name1.toLowerCase();\n" +
	                "if (name.length() != name1.length()) return false;\n" +
	                "char[] c  = name.toCharArray();\n" +
	                "char[] c1 = name1.toCharArray();\n" +
	                "Arrays.sort(c);\n" +
	                "Arrays.sort(c1);\n" +
	                "return Arrays.equals(c, c1);"
	            );
	            System.out.println("===============================================================");
	            break;

	        case 2:
	            System.out.println("THANK YOU FOR USING 😊");
	            break;
	    }
	}
///////////////////////////////////////////////////////////////////////////////////
	public static void pana(String name) {

	    System.out.println("THE STRING YOU ENTERED : " + name);

	    name = name.toLowerCase();
	    char[] c = name.toCharArray();

	    boolean[] seen = new boolean[26];

	    // Mark letters present
	    for (int i = 0; i < c.length; i++) {
	        if (c[i] >= 'a' && c[i] <= 'z') {
	            seen[c[i] - 'a'] = true;
	        }
	    }

	    // check if all 26 alphabets are present
	    boolean pangram = true;
	    for (boolean present : seen) {
	        if (!present) {
	            pangram = false;
	            break;
	        }
	    }

	    if (pangram)
	        System.out.println("RESULT : THE STRING IS A PANGRAM ✔️");
	    else
	        System.out.println("RESULT : NOT A PANGRAM ❌");

	   
	    System.out.println("\nDO YOU WANT TO SEE THE PROGRAM FOR REFERENCE?");
	    System.out.println("1. YES\n2. NO");

	    int choice = sc.nextInt();

	    switch (choice) {
	        case 1:
	            System.out.println("PANGRAM CHECKER PROGRAM");
	            System.out.println("===============================================================");
	            System.out.println(
	                "name = name.toLowerCase();\n" +
	                "boolean[] seen = new boolean[26];\n" +
	                "for (char ch : name.toCharArray()) {\n" +
	                "    if (ch >= 'a' && ch <= 'z') {\n" +
	                "        seen[ch - 'a'] = true;\n" +
	                "    }\n" +
	                "}\n" +
	                "for (boolean present : seen) {\n" +
	                "    if (!present) return false;\n" +
	                "}\n" +
	                "return true;"
	            );
	            System.out.println("===============================================================");
	            break;

	        case 2:
	            System.out.println("THANK YOU FOR USING 😊");
	            break;
	    }
	}

	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static void coun(String name, char n) {

	    System.out.println("THE STRING YOU ENTERED : " + name);
	    System.out.println("CHARACTER TO COUNT     : " + n);

	    char[] c = name.toCharArray();
	    boolean[] visited = new boolean[c.length];

	    int totalCount = 0;

	    for (int i = 0; i < c.length; i++) {
	        if (visited[i]) continue;

	        int count = 1;

	        for (int j = i + 1; j < c.length; j++) {
	            if (c[i] == c[j]) {
	                count++;
	                visited[j] = true;
	            }
	        }

	        if (c[i] == n) {
	            totalCount = count;
	        }
	    }

	    System.out.println("COUNT OF '" + n + "' : " + totalCount);

	  
	    System.out.println("\nDO YOU WANT TO SEE THE PROGRAM FOR REFERENCE?");
	    System.out.println("1. YES\n2. NO");

	    int choice = sc.nextInt();

	    switch (choice) {

	        case 1:
	            System.out.println("CHARACTER COUNT PROGRAM");
	            System.out.println("===============================================================");
	            System.out.println(
	                "char[] c = name.toCharArray();\n" +
	                "boolean[] visited = new boolean[c.length];\n" +
	                "int totalCount = 0;\n" +
	                "for (int i = 0; i < c.length; i++) {\n" +
	                "    if (visited[i]) continue;\n" +
	                "    int count = 1;\n" +
	                "    for (int j = i + 1; j < c.length; j++) {\n" +
	                "        if (c[i] == c[j]) {\n" +
	                "            count++;\n" +
	                "            visited[j] = true;\n" +
	                "        }\n" +
	                "    }\n" +
	                "    if (c[i] == n) totalCount = count;\n" +
	                "}\n" +
	                "System.out.println(\"COUNT OF '\"+n+\"' : \" + totalCount);"
	            );
	            System.out.println("===============================================================");
	            break;

	        case 2:
	            System.out.println("THANK YOU FOR USING 😊");
	            break;
	    }
	}

	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static void duplicate(String name) {

	    System.out.println("THE STRING YOU ENTERED : " + name);

	    char[] c = name.toCharArray();
	    String res = "";

	    for (int i = 0; i < c.length; i++) {

	        if (c[i] != ' ') {               
	            int count = 1;

	            for (int j = i + 1; j < c.length; j++) {
	                if (c[i] == c[j]) {
	                    count++;
	                    c[j] = ' ';
	                }
	            }

	            if (count > 1) {
	                res = res + c[i] + " ";
	            }
	        }
	    }

	    System.out.println("DUPLICATE CHARACTERS : " + (res.isEmpty() ? "NONE" : res));

	   
	    System.out.println("\nDO YOU WANT TO SEE THE PROGRAM FOR REFERENCE?");
	    System.out.println("1. YES\n2. NO");

	    int choice = sc.nextInt();

	    switch (choice) {

	        case 1:
	            System.out.println("FIND DUPLICATE CHARACTERS PROGRAM");
	            System.out.println("===============================================================");
	            System.out.println(
	                "char[] c = name.toCharArray();\n" +
	                "String res = \"\";\n" +
	                "for (int i = 0; i < c.length; i++) {\n" +
	                "    if (c[i] != ' ') {\n" +
	                "        int count = 1;\n" +
	                "        for (int j = i + 1; j < c.length; j++) {\n" +
	                "            if (c[i] == c[j]) {\n" +
	                "                count++;\n" +
	                "                c[j] = ' ';\n" +
	                "            }\n" +
	                "        }\n" +
	                "        if (count > 1) res = res + c[i] + \" \";\n" +
	                "    }\n" +
	                "}\n" +
	                "System.out.println(res);"
	            );
	            System.out.println("===============================================================");
	            break;

	        case 2:
	            System.out.println("THANK YOU FOR USING 😊");
	            break;
	    }
	}

	
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////
	public static void pali(String name) {

	    System.out.println("THE STRING YOU ENTERED : " + name);

	    String original = name;
	    char[] n = name.toCharArray();

	    int l = 0, r = n.length - 1;

	    // reverse using two-pointer
	    while (l < r) {
	        char temp = n[l];
	        n[l] = n[r];
	        n[r] = temp;
	        l++;
	        r--;
	    }

	    String reversed = new String(n);

	    if (original.equals(reversed)) {
	        System.out.println("RESULT : PALINDROME ✔️");
	    } else {
	        System.out.println("RESULT : NOT A PALINDROME ❌");
	    }

	    // Reference Program
	    System.out.println("\nDO YOU WANT TO SEE THE PROGRAM FOR REFERENCE?");
	    System.out.println("1. YES\n2. NO");

	    int choice = sc.nextInt();

	    switch (choice) {
	        case 1:
	            System.out.println("PALINDROME CHECK PROGRAM");
	            System.out.println("===============================================================");
	            System.out.println(
	                "String original = name;\n" +
	                "char[] n = name.toCharArray();\n" +
	                "int l = 0, r = n.length - 1;\n" +
	                "while (l < r) {\n" +
	                "    char temp = n[l];\n" +
	                "    n[l] = n[r];\n" +
	                "    n[r] = temp;\n" +
	                "    l++;\n" +
	                "    r--;\n" +
	                "}\n" +
	                "String reversed = new String(n);\n" +
	                "return original.equals(reversed);"
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