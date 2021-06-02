package Assignment1;

import java.text.DecimalFormat;

public class Finance { //1.3 User Define Class
	
	DecimalFormat df2 = new DecimalFormat("0.00");
	//1.2 Pre-Define Class
	double sponsorFees;
	double eventFees; 
	int totalNumParticipant;
	double totalDonation, netIncome,adExpenses, extraExpenses;
	
	public Finance() {  //1.4 Constructor without argument
		System.out.println("========Finance========");
		System.out.println("Sum With Us Income Statement");
		
	}
	
	public Finance(double sponsorFees) {  //1.4 Constructor with 1 argument
		this.sponsorFees = sponsorFees;
		System.out.println("Total sponsor    : RM " + df2.format(this.sponsorFees));
	}
	
	public Finance(double eventFees, int totalNumParticipant) {  //1.4 Constructor with 2 arguments
		this.eventFees = eventFees;
		this.totalNumParticipant = totalNumParticipant;
		System.out.println("The Number of Partipant We Have Now: " + totalNumParticipant + " person registered");   
		System.out.println("\nTotal Event Fees : RM " + df2.format(calTotalEventFees()));
	}
	//Calculation 
 	public double calTotalExpenses(){
 		return this.adExpenses + this.extraExpenses;
 	}
 	
 	public double calTotalEventFees(){
 		return this.eventFees * this.totalNumParticipant;
 	}
 	
 	public double calSuccessOtherEvent() { //NetIncome
 		return netIncome = totalDonation + sponsorFees + calTotalEventFees() - calTotalExpenses();
 	}
 	
 	public void setTotalDonation(double totalDonation) {
 		this.totalDonation = totalDonation;
 	}
 	
 	public void setAdExpenses(double adExpenses) {
 		this.adExpenses = adExpenses;
 	}
 	
 	public void setExtraExpenses(double extraExpenses) {
 		this.extraExpenses = extraExpenses;
 	}
 	
 	public double getTotalDonation(){
 		return this.totalDonation;
 	}
 	
 	public double getAdExpenses() {
 		return this.adExpenses;
 	}
 	
 	public double getExtraExpenses() {
 		return this.extraExpenses;
 	}
 	
}//end class of Finance
