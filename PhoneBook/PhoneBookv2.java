package phonebook;

import java.util.Scanner;

public class PhoneBookv2 {

	static Scanner in = new Scanner(System.in);     // doesn't matter where is located because it's static
	
	public static void showMenu()                   //Display main menu
	{
		System.out.println("Choose..");
		System.out.println("1. Add data");
		System.out.println("2. Exit");
		System.out.print("Enter : ");
	}
			
	public static void addData()
	{
		System.out.print("Name : ");
		String name = in.next();
		System.out.print("PhoneNumber : ");
		String pNumber = in.next();
		System.out.print("Birthday : ");
		String birthday = in.next();
		PhoneInfo person = new PhoneInfo(name, pNumber, birthday);
		person.showPhoneInfo();
	}
	
	public static void main(String[] args) {
		
		int n = 0;		               //choose menu
		
		while(true)
		{
			showMenu();
			n = in.nextInt();
			in.nextLine();       // Enter
			
			switch(n)
			{
			case 1: 
				addData();      //choose "1" which add data
				break;		    // keyword "break" which menas escape this switch method
			case 2:
				System.out.println("Program is done");
				return;
			}
			
		}
		
		
		
	/*	while (n != 2) {
			System.out.println("Choose..");
			System.out.println("1. Add data");
			System.out.println("2. Exit");
			System.out.print("Enter : ");
			n = in.nextInt();

			if (n == 1) {
				System.out.print("Name : ");
				String name = in.next();
				System.out.print("PhoneNumber : ");
				String pNumber = in.next();
				System.out.print("Birthday : ");
				String birthday = in.next();
				PhoneInfo person = new PhoneInfo(name, pNumber, birthday);
				person.showPhoneInfo();
			}

		}*/
	}

}
