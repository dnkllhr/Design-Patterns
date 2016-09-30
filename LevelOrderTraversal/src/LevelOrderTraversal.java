
public class LevelOrderTraversal {

	private LevelOrderStrat levelOrderStrat;
	
	public LevelOrderTraversal(LevelOrderStrat levelOrderStrat){
		this.levelOrderStrat = levelOrderStrat;
	}
	
	public void levelOrderTraverse(Node root){
		levelOrderStrat.levelOrderTraverse(root);
	}
	
	public void setLevelOrderStrat(LevelOrderStrat levelOrderStrat){
		this.levelOrderStrat = levelOrderStrat;
	}
	
}
