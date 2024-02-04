package binarytree;

public class HardCodedBinaryTree {

	public static void main(String[] args) {
		Node root=null;
		
		root=new Node(10);
		root.left=new Node(20);
		root.right=new Node(30);
		root.left.left= new Node(40);
		root.left.right=new Node(50);
		root.right.left= new Node(60);
		root.right.right= new Node(70);
		
//		TreeTraversals traversals=new TreeTraversals();
//		System.out.print("Inorder :");
//		traversals.inOrder(root);
//		System.out.println("");
//		System.out.print("Preorder :");
//		traversals.preOrder(root);
//		System.out.println("");
//		System.out.print("Postorder :");
//		traversals.postOrder(root);
		LeastCommonAncestor lca=new LeastCommonAncestor();
		System.out.println("Least Common Ancestor (40,50) :" + lca.ancestor(root,50,60));

	}

}
