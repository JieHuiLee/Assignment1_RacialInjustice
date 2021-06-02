package Assignment1;

public class SumWithUs { //Racial Organization Name as superclass //1.3 User Define Class
	//1.2 Pre-Define Class 
	String name;
	String aboutUs = "\nSum With Us congregations use their financial resources to invest in programs and"
		       + "\ninitiatives that build better relationship between different race in community and"
		       + "\nalleviation of discrimination.They help to avoid the perpetuate racial injustice.";
	String mission;
	String contactNo;
	String location;
	
	public SumWithUs() { //1.4 Constructor without argument
		name = "Sum With Us";
		getName();
	}
	
	public SumWithUs(String mission) { //1.4 Constructor with 1 argument
		this.mission = mission;
		printInfo();
 		System.out.println("\nOur Mission: "+ this.mission);
 		System.out.println("Here are some of our current campaigns we're very proud to share with you.");
	}
	
	public SumWithUs(String contactNum, String location) { //1.4 Constructor with 2 arguments
		this.contactNo = contactNum;
		this.location = location;
		System.out.println("\nContact No: " + this.contactNo);
 		System.out.println("Location  : " + this.location);
 		System.out.println("\n===========================================================================");
	}
	
	public void getName(){
		System.out.println("Welcome to Our Community: "+ name);
	}
 	
	public void printInfo () {
 		System.out.println("\nAbout Us: " + aboutUs);
 	}
}//end class of SumWithUs
