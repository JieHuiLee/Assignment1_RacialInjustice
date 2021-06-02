package Assignment1;

import java.util.Scanner; 

public class Main {
	public static void main(String[] args) {
		SumWithUs orgz= new SumWithUs();
		orgz.getName(); //Organization Name
	 	orgz.printInfo(); //About Us, Our Mission, Contact No, Location
	 	
	 	Event event= new Event();	
	 	event.setDate("8 June to 12 June 2021");
	 	event.setTime("9am to 4pm");
	 	event.setLocation("Online Platform");
	 	event.setEventFees(30.00);
	 	event.printEventDescription();
	 	/*
	 	event.printTotalNumParticipant();
	 	event.printTotalDonationFee();*/
	 	
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
	 		Participant regis = new Participant(15,5);
			System.out.println("\nPlease check with your information!");
			registration.printInfo(); 
			registration.calDonationFee();
			registration.getDonateMethod ();
			registration.getDonationFee();
			registration.donateChange();
			//registration.calTotalNumParticipant();
			System.out.println("\n\t Finish Registration!"
					+ "\n========Thank you for joining us!========");
	 	}
	 	else if (optionCode == 2) {
	 		Finance f = new Finance();
	 		Finance fin = new Finance(500.00);
	 		Finance finance = new Finance(30.00,80);
	 		finance.calTotalExpenses();
	 		finance.calTotalEventFees();
	 		finance.calSuccessOtherEvent();
	 		finance.setTotalDonation(3000.00);
	 		finance.setAdExpenses(500.00);
	 		finance.setExtraExpenses(100.00);
	 		System.out.println("Total donation   : RM " + finance.getTotalDonation());
	 		System.out.println("Total expenses   : RM " + finance.calTotalExpenses());
	 		System.out.println("Net Income       : RM " + finance.calSuccessOtherEvent());
	 	}
	 	else if(optionCode ==3){//Exit Website
	 		Advertisement ad = new Advertisement("Sum With Us");
	 		Advertisement advertisement = new Advertisement("Sum With Us","Facebook", "https://www.facebook.com/sumwithus_NgoRacialOrganization");
			System.out.println("\n========Thank you for visiting Sum With Us!========");
			System.exit(0);
	 	}
	 	} while(optionCode<=3);
	}
}//end main class
