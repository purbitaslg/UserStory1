package com.pp.main;

import java.util.Scanner;

import com.pp.dao.Database;
import com.pp.service.CustomerService;

public class CustomerUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int menu;
		CustomerService service = new CustomerService();
		
		do {
	        System.out.println("Hello Customer!!");
	        System.out.println("press 1 for launching a new complaint \n"
	                +"press 2 for searching the customer's name by Customer Id \n"
	                + "press 3 for checking all complaints lodged by the same customer\n");
	        
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the the option of menu: ");
	        menu=sc.nextInt();
	        System.out.println("your chosen option is: "+menu);
		
		while(menu<1||menu>3)
        {
            System.out.println("please select a valid option");
            System.out.println("press 1 for launching a new complaint \n"
                    +"press 2 for searching the customer's name by Customer Id \n"
                    + "press 3 for checking all complaints lodged by the same customer\n");
            menu=sc.nextInt();
            System.out.println("you have entered" +menu);
        }
        switch(menu)
        {
            case 1:
            
                System.out.println("you want to launch a new complaint");
                System.out.println("Choose an option from the list below");
                Database db=new Database();
                db.chooseComplaint();
                service.launchComplaint();
                break;
            
            case 2:
            
                System.out.println("you want to search the customer's name by customer id");
                service.showNames();
                break;
            
            case 3:
            
                System.out.println("you want to check all your complaints");
                service.showAllComplaints();
                break;
            
            default:
                System.exit(menu);
                return;
            
            }
            
        }
        while(true);
    }

}
