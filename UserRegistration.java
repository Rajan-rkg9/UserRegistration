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
			System.out.println("Enter A Valid Last Name: ");
			String lastName = sc.nextLine();
			String pattern = "Cap[a-zA-Z\\s]{3,}";
			if(lastName.matches(pattern)) 
			{
				System.out.println("Valid Last Name");
				flag = false;
			}
			else
				System.out.println("Invalid Last Name");
		}
	}
}
