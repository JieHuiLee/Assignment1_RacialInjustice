package Assignment1;

import java.util.Scanner; 
import java.text.DecimalFormat;

public class Participant { //1.3 User Define Class
	DecimalFormat df2 = new DecimalFormat("0.00");
	
	//1.2 Pre-Define Class
	String name, email; 
	int age, race, state, contactNo;
	char gender; //(F/M)
	boolean malaysian , haveAcc = true;
	double donateAmount, donationFee;
	char donateTimes;
	int donateMethod;
	int securityCode,bankName, bankAccNo;
	String cardType,creditCardNo,expires,tacNo;

	String stateOfMalaysia[] = {"Johor","Kedah", "Kelantan", "Melaka","Negeri Sembilan", "Pahang", 
            			    "Perak", "Perlis","Penang", "Selangor","Terengganu","Sabah", "Sarawak"};
	String bankNameList [] = {"Maybank","CIMB", "Public Bank Bhd", "RHB Bank", "Hong Leong Bank",
            			  "AmBank", "UOB Bank", "Bank Rakyat","OCBC Bank","HSBC Bank Malaysia"};
	Scanner scan = new Scanner(System.in);
	
	public Participant() { //1.4 Constructor without argument
		System.out.println("Please provide your information to complete registration!");
	}
	
 	public Participant(String registration){  //1.4 Constructor with 1 argument
 		System.out.print("Enter name: ");
 		name= scan.nextLine();
 		System.out.print("Enter age: ");
 		age= scan.nextInt();
 		System.out.print("Enter gender(F/M): ");
 		gender= scan.next().charAt(0);
 		System.out.println("\nSelect race: \n1. Chinese \n2. Indian"
 						+ "\n3. Malay   \n4. Others");
 		System.out.print("Enter your race(1/2/3/4): ");
 		race = scan.nextInt();
 		
 		System.out.print("Are you Malaysian(true/false)? ");
 		malaysian = scan.nextBoolean(); 
 		//If user enter false, that mean the participant is foreigner, not need to fill which state
 		if (malaysian ==  true) {
 			System.out.println("\nSelect state: ");
 			//Print the list of 13 states in Malaysia by using for loop
 				for(int n = 0; n < stateOfMalaysia.length; n++) {
 					System.out.println((n+1) +". "+ stateOfMalaysia [n] );
 				}
 			System.out.print("Choose your state(1 to 13): ");
 			state = scan.nextInt();
 		}
 		System.out.print("\nEnter email: ");
 		email= scan.next();
 		System.out.print("Enter contactNo(without'-'): ");
 		contactNo= scan.nextInt();	
 	}
 	
 	public Participant(int currentParticipant, int justRegisteredParticipant, String participateEvent){  //1.4 Constructor with 3 arguments
 		int calCurrentParticipant= justRegisteredParticipant + currentParticipant; 
 		System.out.println("The Number of Volunteer We Have Now: " +  calCurrentParticipant + " person registered"); 
 		System.out.println("\nRegistration for \""+ participateEvent+ "\" Event");
 	}
 	
 	void printInfo() {
 		System.out.println("Name      : " + name);
		System.out.println("Age       : " + age);
		if(gender == 'F'||gender == 'f')
			System.out.println("Gender    : Female");
		else 
			System.out.println("Gender    : Male");
		
		switch (race) {
		case 1:
			System.out.println("Race      : Chinese");
			break;
		case 2:
			System.out.println("Race      : Indian");
			break;
		case 3:
			System.out.println("Race      : Malay");
			break;
		default:
			System.out.println("Race      : Others");
			break;
		}
		if (malaysian ==  true) 
			System.out.println("State     : " + stateOfMalaysia[state-1]);
		System.out.println("Email     : " + email);
		System.out.println("Contact No: " + contactNo); 
 	}
 	
 	void calDonationFee() {
 		System.out.print("Enter donate amount: RM/USD ");
		donateAmount= scan.nextDouble();
		System.out.println("\nSelect Donate Times: A Give Once  B Monthly");
		System.out.print("Enter donateTimes(A/B): ");
		donateTimes= scan.next().charAt(0);
		
		if(donateTimes == 'B'||donateTimes == 'b') {
			System.out.print("How many month would you like to donate? ");
			int donateMonth = scan.nextInt();
			donationFee = this.donateAmount * donateMonth;
		}
		else
			donationFee = this.donateAmount;
		
		if(haveAcc == false)
			getDonateMethod();
 	}
 	
 	void getDonateMethod() { //int
 		System.out.println("\nSelect Donate Method: \n1.Cash  2.Credit/Debit  3.Account  4. Online Banking");
		System.out.print("Enter donateMethod(1/2/3/4): ");
		donateMethod= scan.nextInt();
		
		switch (donateMethod) {
		case 1: //Cash
			System.out.println();
			break;
		case 2: //Credit/Debit
			System.out.println("Enter card type: "); //Exp: MasterCard, Visa
			cardType = scan.next();
			System.out.println("Please enter the credit card number: ");
			creditCardNo = scan.next();
			System.out.println("Expires: "); //Write Month & Year
			expires = scan.next();
			System.out.println("Security Code: ");
			securityCode = scan.nextInt();
			break;
		case 3: //Account
			System.out.println("Have an PayPal account? Sign in to give faster.(true/false) ");
			haveAcc = scan.nextBoolean();
			if (haveAcc ==  true) 
				System.out.println("Yes. Please click to complete donation!");
			else
				calDonationFee();
		   	 break;
		case 4: //Online Banking
			System.out.println("\nBank Name:");
			for(int i = 0; i < bankNameList.length; i++) {
				System.out.println((i+1) +". "+ bankNameList[i] );
			}
			System.out.print("Choose bank name: "); //Exp: Use Array to store bankname
			bankName = scan.nextInt();			
			System.out.println("Select Bank Name: " + bankNameList[bankName-1]);
			System.out.println("Please enter the bank account no: ");
			bankAccNo = scan.nextInt();
			System.out.print("Please Key in Tac No: ");
			tacNo = scan.next(); 
			do{
			if (!tacNo.equals("520947")) {
				System.out.println("Incorrect!Please Request TacNo and Key In Again!");
				System.out.print("Please Key in Tac No: ");
				tacNo = scan.next(); 
			}
			}while(!tacNo.equals("520947"));
			break;
		}		
		System.out.println("Congratulation! You have succesfully done the registration!");
 	}
 	
 	void getDonationFee() { //(double) after calTotalDonationFee(double donateAmount, char donateTimes)
 		if(malaysian == false) //If the participant is Foreigner
 			System.out.println(" ");
 		else 
 			System.out.println("\nDonation Fee: RM " + df2.format(donationFee));
 	}
 	
	void donateChange(){ //double
 		if(malaysian == false){ //If the participant is Foreigner
 			System.out.println("1 USD= RM 4.13"); // USD Dollar > MalaysiaDollar
 			double donateChange = donationFee * 4.13; 	
 			System.out.println(df2.format(donationFee)+ " USD = Donation Fee: RM " + df2.format(donateChange)); 
 		}
 	}
}//end class of Participant
