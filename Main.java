package Formula1DataExplorer;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		
		 LinkedList<Champion> champions = ChampionDataReader.loadChampions("champions.txt");

	     ChampionManager manager= new ChampionManager(champions);
		
		
	     Scanner scanner= new Scanner(System.in);
	     
	     while(true) {
	    	 
	    	 
	    	 System.out.println("\nFormula 1 Champions Explorer");
	    	 System.out.println("1. List all champions ");
	    	 System.out.println("2. Find champions by year");
	    	 System.out.println("3. Find champions by nationality");
	    	 System.out.println("4. Compare champions by wins");
	    	 System.out.println("5. List champions sorted by year (BST)");
	    	 System.out.println("6. Ask Gemini (AI Chat about F1)");
	    	 System.out.println("0. Exit");
	    	 
	    	 int choice= scanner.nextInt();
	    	 
	    	 scanner.nextLine();//consume newline
	    	 
	    	 
	    	 switch(choice) {
	    	 
	    	 
	    	 case 1:
	    		 manager.listAllchampions();
	    		 break;
	    		 
	    	
	    	 case 2:
	    		System.out.println("Enter year");
	    		int year= scanner.nextInt();
	    		
	    		Champion found= manager.findChampionByYear(year);
	    		
	    		if(found != null) {
	    			
	    			System.out.println(found);
	    		}
	    		
	    		else {
	    			System.out.println("no champion found for that year");
	    		}
	    	 
	    	    break;
	    	 
	    	    
	    	    
	    	 case 3:
	    		 System.out.println("Enter a nationality");
	    	    
	    		 String nationality= scanner.nextLine();
	    	    
	    	    List<Champion> champs= manager.findChampionsByNationality(nationality);
	    	    
	    	    if(!champs.isEmpty()) {
	    	    	
	    	    	for(Champion champ: champs) {
	    	    		System.out.println(champ);
	    	    	
	    	    	
	    	    }
	    	    
	    	    }
	    	    
	    	    else {
	    	    		
	    	    		System.out.println("No champion found with that nationality");
	    	    		
	    	    	}
	    	    break;
	    	 
	    	    
	    	    
	    	 case 4:
	    		 
	    		System.out.println("Enter the first driver name");
	    	    String driver1= scanner.nextLine();
	    	    
	    	    System.out.println("Enter the second driver name");
	    	    String driver2= scanner.nextLine();
	    	    
	    	    Champion winner= manager.compareWins(driver1, driver2);

	    		 if(winner!= null) {
	    			 
	    			 System.out.println("Champion with the more wins is  " + winner.getDriverName());
	    		 }
	    	    
	    		 else {
	    			 System.out.println("Comparison failed!!");
	    		 }
	    	    break;
	    	    
	    	 
	    		 
	    	
	    	
	    	 case 5:
	    		 List<Champion> sortedChampions= manager.getChampionsSortedByYear();
	    	 
	    
	    		 for(Champion c: sortedChampions) {
	    			 System.out.println(c);
	    			 
	    		 }
	    	 
	    		 break;
	    		
	    		 
	    	 case 6:
	    		 System.out.print("Ask your Gemini question: ");
                 String query = scanner.nextLine();
                 try {
                     String response = GeminiAPIHelper.askGemini(query);
                     System.out.println("Gemini says: " + response);
                 } catch (Exception e) {
                     System.out.println("Error communicating with Gemini: " + e.getMessage());
                 }
                 break;
	    		 
	    		 
	    		 
	    		 
	    	 case 0:
	    		 
	    		 System.out.println("Youre exiting... GOODBYE!");
	    		 scanner.close();
	    		 return;	 
	    		 
	    	 default:
	    		System.out.println("Invalid choice please try again");
	    	    
	    	    
	    	    
	    	    
	    	    
	    	    
	    	    
	    	    
	    	    
	    	    
	    	    
	    	 }
	    	 	 
	    	 
	     }
	  	}

}
