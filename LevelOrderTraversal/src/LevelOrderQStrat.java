import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderQStrat implements LevelOrderStrat {

	@Override
	public void levelOrderTraverse(Node root) {

		Queue<Node> queue = new LinkedList<Node>();
		
		queue.add(root);
		
		while(!queue.isEmpty()){
			Node node = queue.peek();
			System.out.println(node.data);
			queue.remove();
			if(node.left != null)
				queue.add(node.left);
			if(node.right != null)
				queue.add(node.right);
		}
		
	}
	
}
