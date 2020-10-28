package com.company;

public class stringclassdemo {

    public static void main(String[] args) {
	// write your code here

// String : its one of the perbuilt class in java
        // Question is what are the ways to define a string
        /*1.String Literal
        2.by creating object of string*/

//        A String variable contains a collection of characters surrounded by double quotes:
        //A string is created and stored in the variable 'a'.
        String a = "  Aisha/Hlatshwayo"; // String Literal
        String ab = new String("Aisha"); //String is with a class

//Finding a Character in a String
//        This is how you can abstract characters and index with the help of the string method, This is also used to manipulate
        System.out.println(a.charAt(2));
//        The indexOf() method returns the index (the position) of the first occurrence of a specified text in a string (including whitespace):
        System.out.println(a.indexOf("i"));
        System.out.println(a.subSequence(3,6));
        System.out.println(a.substring(7));
//String Concatenation
        //The + operator can be used between strings to combine them. This is called concatenation:
        System.out.println(a.concat(" is learning Java with selenium"));
//String Length
        //A String in Java is actually an object, which contain methods that can perform certain operations on strings. For example, the length of a string can be found with the length() method:
        System.out.println("The length of the txt string is: " + a.length());
        //Removing white spaces
        System.out.println(a.trim());
//        There are many string methods available, for example toUpperCase() and toLowerCase():
        System.out.println(a.toUpperCase());   // Outputs "AISHAHLATSHWAYO"
        System.out.println(a.toLowerCase());   // Outputs "aishahlatshwayo"
//        Split
        String arr[] = a.split("/");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
//        Replacing a string
        System.out.println(a.replace("i","ye"));

    }
}
