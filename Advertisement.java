package Assignment1;

public class Advertisement { //1.3 User Define Class
	
	//1.2 Pre-Define Class
	String racialOrganization;
	String socialMedia, url;
	
	public Advertisement() { //1.4 Constructor without argument
		eventWebsite();
		donationWebsite();
	}
	
	public Advertisement (String racialOrganization) { //1.4 Constructor with 1 argument
		this.racialOrganization = racialOrganization;
		SumWithUs();
	}
	
	public Advertisement(String racialOrganization, String socialMedia, String url){ //1.4 Constructor with 3 arguments
		this.racialOrganization = racialOrganization;
		this.socialMedia = socialMedia;
		this.url = url;
		onlineAd();
	}
	
	void SumWithUs() {
		System.out.println();
		System.out.println("For further information about Sum With Us, please visit the following website: ");
		System.out.println(this.racialOrganization + " Website: https://www.sumwithus.org/en" );
 	}

 	void eventWebsite() {
 		System.out.println("Event 1 Website: https://www.sumwithus.org/en/articles/events/2021/June/without-us-without-country");   
 		System.out.println("Event 2 Website: https://www.sumwithus.org/en/articles/events/2021/July/everyone-is-same");
 		System.out.println("Event 3 Website: https://www.sumwithus.org/en/articles/events/2021/June/try-hear-other-voice");  
 	}
 	
 	void donationWebsite() {
 		System.out.println("Donation Website: https://www.sumwithus.org/en/blog/donation");   
 	}
 	
 	void onlineAd() {
		//Instagram: https://www.instagram.com/sumwithus_NgoRacialOrganization	
 		System.out.println("\nBefore you exit, we have a good news to you!");
 		System.out.println("Posted on " + this.racialOrganization + this.socialMedia + ": \n" + this.url);	
		System.out.println("\nHi, there! Our community is going to organize a LUCKY DRAW in our coming soon event!");
		System.out.println("How to join it? Follow these 3 steps:");
		System.out.println("Step 1: Go to our webpage done the registration & donation and join our event!");
		System.out.println("Step 2: Like & share out this event post in public condition.");
		System.out.println("Step 3: Tag 5 friends and invite them join together.");
		System.out.println("We will welcome to anyone join with us! Let's raise the awareness about racial injustice and prohibit it.");	
 	}

}//end class of Advertisement
