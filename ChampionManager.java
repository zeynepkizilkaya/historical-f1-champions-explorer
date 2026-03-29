package Formula1DataExplorer;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;


public class ChampionManager {

	private LinkedList<Champion> champions;
	private ChampionBtree championbtree= new ChampionBtree();
	
	//constructor
	
	public ChampionManager(LinkedList<Champion> champions)
	{
		this.champions= champions;
		this.championbtree= new ChampionBtree();
		
		  for (Champion c : champions) {
	            championbtree.insert(c);
		
		  }
		
		}
	
	
	//METHOD1 LIST ALL CHAMPIONS
	
	public void listAllchampions() {
		
		for(Champion champ: champions)
			System.out.println(champ);// uses toString from champion class
		
	}
	
	
	//method 2 find champions by year
	
	public Champion findChampionByYear (int year) {
		
		for(Champion champ:champions) {
		
			if(champ.getYear()==year) {
				return champ;
		
	}
	
			}
		return null;//not found
	}
	
	
	public List<Champion> findChampionsByNationality(String nationality){
		List<Champion> result= new ArrayList<>();
		for (Champion champ:champions) {
			if(champ.getNationality().equalsIgnoreCase(nationality)) {
				
				result.add(champ);
				
			}
				
			
			
		}
		
		return result;
		
	}
	
	
	public Champion compareWins(String driver1, String driver2) {
		
		Champion champ1=null;
		Champion champ2=null;
		
		for (Champion champ: champions) {
			
			if(champ.getDriverName().equalsIgnoreCase(driver1)) {
				
				champ1=champ;//Because you want to put the FOUND champion into your storage variable, NOT the other way around
			}
			
			
			else if (champ.getDriverName().equalsIgnoreCase(driver2)) {
				
				champ2=champ;
				
			}
			}
		
		if (champ1 == null || champ2 == null) {
		    return null; // one or both drivers not found
		}

			
		if (champ1.getWins() > champ2.getWins()) {
		    return champ1;
		} else {
		    return champ2;
		}
	}
		
		
		public ChampionManager(List<Champion> champions) {
		    this.champions = (LinkedList<Champion>) champions;
		    this.championbtree = new ChampionBtree();

		    for (Champion champ : champions) {
		        championbtree.insert(champ); // insert each into BST
		    }
		

		
	}
	
	
	
		public List<Champion> getChampionsSortedByYear() {
		   
			System.out.println("Retrieving champions sorted by year...");
			return championbtree.getChampionsInOrder();
		}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
