package Formula1DataExplorer;

public class Champion {
	
	
	private int year;
	private String driverName;
	private String team;
	private String nationality;
	private double totalPoints;
	private int wins;
	
	

 public Champion next; // creates the pointer
 
 

 
 
 	public Champion (int year, String driverName, String team,String nationality, double totalpoints, int wins) {
		
	this.year=year;
	this.driverName=driverName;
	this.team=team;
	this.nationality=nationality;
	this.totalPoints=totalpoints;
	this.wins=wins;
	this.next=null;		// pointer should start with null
	
	
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public String getDriverName() {
		return driverName;
	}


	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		this.team = team;
	}


	public String getNationality() {
		return nationality;
	}


	public void setNationality(String nationality) {
		this.nationality = nationality;
	}


	public double getTotalPoints() {
		return totalPoints;
	}


	public void setTotalPoints(int totalPoints) {
		this.totalPoints = totalPoints;
	}


	public int getWins() {
		return wins;
	}


	public void setWins(int wins) {
		this.wins = wins;
	}
	
	public String toString() {
	    return year + " - " + driverName + " (" + team + ", " + nationality + ") | " +
	           "Wins: " + getWins() + " | Points: " + getTotalPoints();
	}
	
	
	
	public int compareTo(Champion other) {
	    return Integer.compare(this.getYear(), other.getYear()); // or compare by name, wins, etc.
	}


	

	
	
	
	
	
	
	
	
	
	

}
