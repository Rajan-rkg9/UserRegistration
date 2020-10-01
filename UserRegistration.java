package com.Capgemini.Registration;
import java.util.*;
import java.io.*;
public class UserRegistration {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while(flag)
		{
			System.out.println("Enter A Valid Mobile Number : ");
			String phoneNumber = sc.nextLine();
			String pattern = "(91) [0-9]{10}";
			if(phoneNumber.matches(pattern)) 
			{
				System.out.println("Valid Phone Number");
				flag = false;
			}
			else
				System.out.println("Invalid Phone Number");
		}
	}
}
