package Assignment1;

public class SumWithUs { //Racial Organization Name as superclass //1.3 User Define Class
	//1.2 Pre-Define Class 
	String name = "Sum With Us";
	String aboutUs = "\nSum With Us congregations use their financial resources to invest in programs and"
			       + "\ninitiatives that build better relationship between different race in community and"
			       + "\nalleviation of discrimination.They help to avoid the perpetuate racial injustice.";
	
	String mission = "\nThe Sum With Us community stands up for prohibition of racial injustice and fair."
		           + "\nHere are some of our current campaigns we're very proud to share with you.";
	
	String contactNo = "04-981 4652";
	String location = "Sum With Us NGO Organization, Jalan Ru 1, Changlun, 06050 Bukit Kayu Hitam.";
	
	//getName () : String
	public void getName(){
		System.out.println("Welcome to Our Community: "+ name);
	}
 	
	public void printInfo () {
 		System.out.println("\nAbout Us: " + aboutUs);
 		System.out.println("\nOur Mission: "+ mission);
 		System.out.println("\nContact No: " + contactNo);
 		System.out.println("\nLocation: " + location);
 	}
}//end class of SumWithUs
 	
 	

