package Formula1DataExplorer;

public class ChampionsNode {

	private Champion data;
	private ChampionsNode left;
	private ChampionsNode right;
	
	
	public ChampionsNode(Champion data) {
		
		this.data=data;
		this.left=null;
		this.right=null;
		
	}


	
	public Champion getData() {
		return data;
		
	}
	
	
	
	public ChampionsNode getLeft() {
		return left;
	}


	public void setLeft(ChampionsNode left) {
		this.left = left;
	}


	public ChampionsNode getRight() {
		return right;
	}


	public void setRight(ChampionsNode right) {
		this.right = right;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
