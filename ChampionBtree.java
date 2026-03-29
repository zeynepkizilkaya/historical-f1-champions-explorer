package Formula1DataExplorer;

import java.util.ArrayList;
import java.util.List;

public class ChampionBtree {

	
	private ChampionsNode root;
	private int size;
	
	
	public ChampionBtree() {
		
		this.root=null;
		this.size=0;
		
	}
	//helper method to create a new node from a champion object
	private ChampionsNode createNewNode(Champion champion) {
		
		
		return new ChampionsNode(champion);//wraps champion object in a node
		
	}
	
	
	public int getSize() {
		return size;
		
	}
	
	
	
	// inserts new champion into the tree
	public boolean insert(Champion champion) {
		
		ChampionsNode newNode=createNewNode(champion);
		
		
		if(root==null) {
			
			root=newNode;
			size++;
			return true;
			
			
		}
		
		ChampionsNode parent=null;
		ChampionsNode current= root;
		
		
		while(current!=null) {
			
			parent=current;
			
			//champion is "less than" current node (e.g., earlier year), go left
			if(champion.compareTo(current.getData())<0) {
				
				
				current=current.getLeft();
				}
			 // champion is "greater than" current node, go right
			if(champion.compareTo(current.getData())>0) {
				
				
				current=current.getRight();
				
			}
			else {
				
				return false;
			}
			
		}
		  // Attach the new node to the correct side of the parent
		if(champion.compareTo(parent.getData())<0) {
			
		
			parent.setLeft(newNode);
			
		}
		if(champion.compareTo(parent.getData())>0) {
			
			
			parent.setRight(newNode);
		}
		
		
		size++;
		return true;
	}
		
		
		 // Recursive in-order traversal (Left → Root → Right)
		private void inOrderTraversal(ChampionsNode node, List<Champion> result) {
			
			if(node!= null) {
				
				inOrderTraversal(node.getLeft(), result);
				result.add(node.getData());
				inOrderTraversal(node.getRight(),result);
				
				
				
			}
			
			 }
			
		 public List<Champion> getChampionsInOrder() {
		        List<Champion> result = new ArrayList<>();
		        inOrderTraversal(root, result);
		        return result;
		 }
		
		 
		 
		 
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

