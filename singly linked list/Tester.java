package com.acts;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		SinglyLinkedList sll = new SinglyLinkedList();
		int choice = 0;
		do {
			System.out.println("1. Add at Start");
			System.out.println("2. Display");
			System.out.println("3. Delete At Start");
			System.out.println("4. add at end");
			System.out.println("5. search a element");
			System.out.println("0. Exit");
			
			System.out.println("Enter Choice");
			choice = sc.nextInt();
			System.out.println("Enter Choice again for the tester branch");
			
			System.out.println("Enter Choice again for the tester branch to merge");
			switch (choice) {
			
			case 1 : {
			System.out.println("Enter Number");
			int num = sc.nextInt();
			sll.addAtStart(num);
			}break;
			
			case 2 : {
				sll.traverse();
			}break ;
			
			case 3 : {
				sll.deleteAtStart();
			}break;
			
			case 4:
				System.out.println("Enter number");
				int num=sc.nextInt();
				sll.addAtEnd(num);
				break;
				
			case 5:
				System.out.println("Enter number to search");
				num=sc.nextInt();
				int index=sll.search(num);
				if (index==-1)
				{
					System.out.println("Element not available");
				}
				else
				{
					System.out.println("index is: "+index);
				}
				break;
				
			case 0 : {
				System.exit(0);
			}break;
			
			default :
				System.out.println("Invalid Choice");
			}
		}while (choice != 0);
		sc.close();
	}
}
