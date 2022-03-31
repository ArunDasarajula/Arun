package Javaproject;
import java.util.*;
public class TravelManagementSystem {

	public static void main(String args[])
	{
		
	System.err.println("*******************************************************");
	System.err.println("**********Welcome To Travel Management System**********");
	System.err.println("*******************************************************");
	
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Please Enter Your Details");
	System.out.println("Enter your name:");
	String name=sc.next();
	
	System.out.println("Enter your Phone Number:");
	int i=sc.nextInt();
	 
	System.out.println("Enter your Current Location:");
	String cl=sc.next();
	System.out.println(" ");
	System.out.println("Name :"+name);
	System.out.println("Phone Number :"+i);
	System.out.println("Current Location :"+cl);
	System.out.println(" ");
	
	System.out.println("***************************************");
	System.out.println("***************************************");
	System.out.println("** [1] List of Destinations          **");
	System.out.println("** [2] Destination Selection         **");
	System.out.println("** [3] List of Packages              **");
	System.out.println("** [4] Package and Price Selection   **");
	System.out.println("** [5] Exit                          **");
	System.out.println("***************************************");
	System.out.println("***************************************");
	System.out.println(" ");

	List<String> list = new ArrayList<>();
	System.out.println("[1].List of Destinations:");
    list.add("Mumbai");
    list.add("Pune");
    list.add("Banglore");
    list.add("Chennai");
    list.add("Kolkata");
    list.add("Delhi");
    System.out.println(list);
    System.out.println(" ");
	System.out.println("[2].Enter your Destination Location:");
	Scanner sc1=new Scanner(System.in);
	String s1 = sc1.nextLine();
	if(list.contains(s1))
	{
		System.out.println("Great!List Contains "+s1);
	}
	else if(list!=null)
	{
		System.out.println("Please Select Valid Option");
		return ;
	}
	else
	{
		System.out.println("Great!List Contains "+s1);
	}
	
	int location;
    Scanner sc2 = new Scanner(System.in);
    System.out.println("  ");
    System.out.println("[3].List of Packages: ");

    System.out.println("1.Hyderabad to Mumbai "
    		+ "2.Hyderabad to Pune "+
    		"3.Hyderabad to Banglore "+
    		"4.Hyderabad to Chennai "+
    		"5.Hyderabad to Kolkata "+
    		"6.Hyderabad to Delhi");
    System.out.println(" ");
    System.out.println("[4].Select one of the Package from the list: ");
    location = sc2.nextInt();
    
    switch (location)
    {
    case 1 :
       System.out.println(" ");
       System.out.println("From Hyderabad to Mumbai Ticket Price is Rs:1000/-");
       
       break;

    case 2 :
       System.out.println(" ");
       System.out.println("From Hyderabad to Pune Ticket Price is Rs:800/-");

       break;

    case 3 :
       System.out.println(" ");
       System.out.println("From Hyderabad to Banglore Ticket Price is Rs:900/-");

       break;

    case 4 :
       System.out.println(" ");
       System.out.println("From Hyderabad to Chennai Ticket Price is Rs:700/-");

       break;

    case 5 :
       System.out.println(" ");
       System.out.println("From Hyderabad to Kolkata Ticket Price is Rs:1500/-");

       break;

    case 6 :
       System.out.println(" ");
       System.out.println("From Hyderabad to Delhi Ticket Price is Rs:1400/-");

       break;

    default :
       System.out.println(" ");
       System.out.println("Please Select Valid Input");
       
       
    }
    
    
    Scanner sc3 = new Scanner(System.in);
    System.out.println(" ");
    System.out.println("Booking Confirmation:");

    System.out.println("1.Confirm Booking  " + "2.Exit ");
    System.out.println(" ");
    System.out.println("Please select one of the option: ");
    int confirm= sc3.nextInt();

    switch (confirm)
    {
    
    case 1 :
       System.out.println("Congratulations,Your Booking is Confirmed:::Happy Journey!!!:)");
       Date timenow=new Date();
       System.out.println("Date: "+timenow.toString());
       break;

    case 2 :
       System.out.println(" ");
       break;
    
    default :
        System.out.println("Please Select Valid Input");
        
	}
  }
}

		





