package binarytree;

import java.util.Scanner;

public class UserDefinedBinaryTree {				  //10
public static void main(String[] args) {		//20	    //30
	Node root=null;							//40     50    60     70
	root=createUserDefinedBinaryTree(); //-1  -1
	
	TreeTraversals traversals=new TreeTraversals();
	System.out.print("Inorder :");
	traversals.inOrder(root);
	System.out.println("");
	System.out.print("Preorder :");
	traversals.preOrder(root);
	System.out.println("");
	System.out.print("Postorder :");
	traversals.postOrder(root);

	
}

private static Node createUserDefinedBinaryTree() {
	Node root;
	Scanner sc=new Scanner(System.in);		//10
	System.out.println("Enter data");   // 20	 30
	int data=sc.nextInt();
	if(data==-1)
		return null;
	root=new Node(data);
	System.out.println("Enter data for left of "+data);
	root.left=createUserDefinedBinaryTree();
	System.out.println("Enter data for right of "+data);
	root.right=createUserDefinedBinaryTree();
	
	
	return root;
}
}

