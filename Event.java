package Assignment1;

public class Event { //1.3 User Define Class
	//1.2 Pre-Define Class
	String name = "Without Us, Without Country";
	String description = "\nA peace country is made from integration between different race. If the "
			   + "\nrelationship broke up between different race or one of them facing the "
			   + "\nracial injustice problem. The country will not count as country again. "
			   + "\nWe will encourage more participant and volunteer to join us to support this program."; //About Event
	String dateOfEvent, timeOfEvent, location; //Event description
	double eventFees;
	int numOfParticipant;
	
	public Event(){ //1.4 Constructor without argument
		System.out.println("Coming Soon Event: " + name); 
		System.out.println("About Event: " + description);
	}
	
	public Event(String name, String aboutEvent){ //1.4 Constructor with 2 arguments
		this.name= name;
		this.description = aboutEvent;
		System.out.println("\nEvent 1: " + this.name);    
		System.out.println("About Event: " + this.description);
	}
	
	public Event(String date, String time, String l, double eventF){ //1.4 Constructor with 4 arguments
		this.dateOfEvent = date;
		this.timeOfEvent = time;
		this.location = l;
		this.eventFees = eventF;
		
		System.out.println("\nDate     : " + this.dateOfEvent);   
 		System.out.println("Time     : " + this.timeOfEvent);   
 		System.out.println("Location : " + this.location);   
 		System.out.println("Fee      : RM " + Math.round(this.eventFees));   
	}
	
 	void setDate(String dateOfEvent) {
 		this.dateOfEvent = dateOfEvent;
 	}
 	void setTime(String timeOfEvent) {
 		this.timeOfEvent = timeOfEvent;
 	}
 	void setLocation(String location) {
 		this.location= location;
 	}
 	void setEventFees(double eventFees) {
 		this.eventFees = eventFees;
 	}
 	
 	public String getDate() {
 		 return this.dateOfEvent;
 	}
 	public String getTime() {
 		 return this.timeOfEvent;
 	}
 	public String getLocation() {
 		 return this.location;
 	}
 	public double getEventFees() {
 		return this.eventFees;
 	}
 	
 	void printEventDescription() { //getEventInfo
 		System.out.println("\nDate     : " + getDate());   
 		System.out.println("Time     : " + getTime());   
 		System.out.println("Location : " + getLocation());   
 		System.out.println("Fee      : RM " + Math.round(getEventFees()));   
 		System.out.println("Click to View More Campaigns!");   	
 		System.out.println("Recent Campaigns: 1. Try Hear Other Voice");	
 	}

}//end class of Event
