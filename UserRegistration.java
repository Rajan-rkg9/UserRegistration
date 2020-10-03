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
			System.out.println("Enter A Valid First Name: ");
			String firstName = sc.nextLine();
			String pattern = "[A-Z]{1}[a-zA-Z\\s]{2,}";
			if(firstName.matches(pattern)) 
			{
				System.out.println("Valid First Name");
				flag = false;
			}
			else
				System.out.println("Invalid First Name");
		}
	}
}
