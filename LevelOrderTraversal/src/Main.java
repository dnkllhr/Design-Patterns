
public class Main {
	
	public static void main(String[] args){
		
		Node node = new Node(1);
		node.left = new Node(2);
		node.right = new Node(3);
		node.left.left = new Node(4);
		node.left.right = new Node(5);
		node.right.left = new Node(6);
		node.right.right = new Node(7);

		System.out.println("Using the recursive strategy");
		LevelOrderTraversal levelOrderTraversal = new LevelOrderTraversal(new LevelOrderRecStrat());
		levelOrderTraversal.levelOrderTraverse(node);
		
		System.out.println();
		
		System.out.println("Using the Queue strategy");
		levelOrderTraversal.setLevelOrderStrat(new LevelOrderQStrat());
		levelOrderTraversal.levelOrderTraverse(node);
		
	}

}
