package Formula1DataExplorer;

import java.io.BufferedReader; //reads text line by line efficiently.
import java.io.FileReader; //connects Java to a file.
import java.io.IOException; //handles file errors.
import java.util.LinkedList; //your data structure to store champions.



public class ChampionDataReader {

	
	public static LinkedList<Champion> loadChampions(String fileName)
	{
		LinkedList<Champion> champions = new LinkedList<>(); //Creates an empty list that will store all the Champion objects as you read them from the file.
		
		try(BufferedReader br= new BufferedReader(new FileReader(fileName))){
			//BufferedReader reads the file line by line (efficiently, even for large files). 
		    //FileReader points to your champions.txt.
     		//try (...) = try to do this and automatically close the file when done.

			
			
			String line;// Declares a variable line to hold each line of text from the file while reading.
		
		while((line=br.readLine())!= null) {
			//br.readLine() reads 1 line
			//if its null it means the file has ended
			if(line.trim().isEmpty()) continue;//skips empty lines 
			
			String[] parts= line.split(",");//splits line into parts
			
			//ensure correct number of columns
			 System.out.println("Raw parts: " + String.join(" | ", parts));
			if(parts.length<6) continue;//safety check
			
			int year= Integer.parseInt(parts[0].trim()); //parseInt is used to turn strings into integers
			String driveName=parts[1].trim();
			String team= parts[2].trim();
			String nationality= parts[3].trim();
			double totalPoints= Double.parseDouble(parts[4]);
			int wins=Integer.parseInt(parts[5].trim());
			
			Champion champ= new Champion(year,driveName,team,nationality,totalPoints,wins); //calling the champion constructor i already wrote before
			champions.add(champ); //adds the created champion into the linkedlist
		  }
		}
	
		catch (IOException e) {
            System.out.println("Error reading champions.txt! ❌");
        }
			
		
		return champions;
		//returns the full linkedlist with all the champions loaded from the file 
		
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
