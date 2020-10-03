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
			System.out.println("Enter A Valid Email Id: ");
			String emailId = sc.nextLine();
			String pattern = "^[a-zA-Z0-9]+([_+-.]{1}[a-zA-Z0-9]+)?@[a-zA-Z0-9]+[.]{1}[a-zA-Z]{2,}([_+-.]{1}[a-zA-Z]{2,})?";
			if(emailId.matches(pattern)) 
			{
				System.out.println("Valid Email Id");
				flag = false;
			}
			else
				System.out.println("Invalid Email Id");
		}
	}
}
