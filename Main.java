package Assignment1;

import java.text.DecimalFormat;
import java.util.Scanner; 

public class Main {
	public static void main(String[] args) {
		DecimalFormat df2 = new DecimalFormat("0.00");
		
		SumWithUs orgz= new SumWithUs(); 
		SumWithUs organization= new SumWithUs("\nThe Sum With Us community stands up for prohibition of racial injustice and fair.");
		SumWithUs o= new SumWithUs("04-981 4652","Sum With Us-NGO, Jalan Ru 1, Changlun, 06050 Bukit Kayu Hitam."); 
	 	
	 	Event event= new Event(); //Coming Soon Event
	 	Event eventInfo = new Event("8 June to 12 June 2021","9am to 4pm","Online",30.00);
	 	Event e= new Event("Everyone Is Same", "This event is to avoid the racial injustice.");	//NextMonthEvent1
	 	e.setDate("1 July to 5 July 2021");
	 	e.setTime("11am to 2pm");
	 	e.setLocation("Online Platform");
	 	e.setEventFees(20.00);
	 	e.printEventDescription();
	 	
	 	Scanner read = new Scanner(System.in);
	 	int optionCode;
	 	do {
	 	System.out.println("\nSelect option: \n1. Registration(Participant)"
	 					  + "\n2. Finance(Admin)"
	 					  + "\n3. Exit Website");
	 	System.out.print("\nEnter your option(1/2/3): ");
	 	optionCode = read.nextInt();
	 	
	 	if (optionCode == 1) { //Registration 
	 		Participant r= new Participant();
	 		Participant registration = new Participant("");
	 		Participant regis = new Participant(15,5,"Without Us, Without Country");
			System.out.println("\nPlease check with your information!");
			registration.printInfo(); 
			registration.calDonationFee();
			registration.getDonateMethod ();
			registration.getDonationFee();
			registration.donateChange();
			System.out.println("\n\t Finish Registration!"
					+ "\n========Thank you for joining us!========");
	 	}
	 	else if (optionCode == 2) { //Finance
	 		Finance f = new Finance();
	 		Finance fin = new Finance(500.00);
	 		Finance finance = new Finance(30.00,80);
	 		finance.calTotalEventFees();
	 		finance.setTotalDonation(3000.00);
	 		finance.setAdExpenses(500.00);
	 		finance.setExtraExpenses(100.00);
	 		System.out.println("Total donation   : RM " + df2.format(finance.getTotalDonation()));
	 		System.out.println("Total expenses   : RM " + df2.format(finance.calTotalExpenses()));
	 		System.out.println("\n===============================");
	 		System.out.println("Net Income       : RM " + df2.format(finance.calSuccessOtherEvent()));
	 	}
	 	else if(optionCode ==3){//Exit Website
	 		Advertisement ad = new Advertisement("Sum With Us");
	 		Advertisement advertise = new Advertisement();
	 		Advertisement advertisement = new Advertisement("Sum With Us","Facebook", "https://www.facebook.com/sumwithus_NgoRacialOrganization");
			System.out.println("\n========Thank you for visiting Sum With Us!========");
			System.exit(0);
	 	}
	 	} while(optionCode<=3); //It will repeat again the optionCode until the user choose 3, the program will end by advertise the organization!!!
	}
}//end main class
