
public class LevelOrderRecStrat implements LevelOrderStrat{

	
	public int height(Node root){
		
		if(root == null)
			return 0;
		
		int height = Math.max(height(root.left), height(root.right));
		
		return height + 1;
		
	}
	
	public void recLevelOrder(Node root, int level){
		
		if(level == 0)
			return;
		
		if(level == 1)
			System.out.println(root.data);
		
		recLevelOrder(root.left, level - 1);
		recLevelOrder(root.right, level - 1);
	}
	
	@Override
	public void levelOrderTraverse(Node root) {
		
		int height = height(root);
				
		for(int i = 1; i <= height; i++){
			recLevelOrder(root, i);
		}
	}
	
}
