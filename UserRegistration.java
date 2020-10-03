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
			System.out.println("Enter A Valid Password : ");
			String password = sc.nextLine();
			String pattern = ".*[A-Z].*";
			if(password.matches(pattern) && password.length()>=8) 
			{
				System.out.println("Valid Password");
				flag = false;
			}
			else
				System.out.println("Invalid Password");
		}
	}
}
