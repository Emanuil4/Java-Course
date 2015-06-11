package treeNode;
public class Main {

	public static void main(String[] args) {
		TreeNode<String> root = new TreeNode<String>("1");
		TreeNode<String> root1 = new TreeNode<String>("88");
		{
			TreeNode<String> node1 = root.addChild("2");
			TreeNode<String> node2 = root.addChild("9");
		    {
		    	TreeNode<String> node20 = node1.addChild("3");
		    	TreeNode<String> node21 = node1.addChild("4");
		        {
		        	TreeNode<String> node22 = root1.addChild("77");
		        	TreeNode<String> node23 = root1.addChild("99");
		        }
		    }
		}
		root.print(root , 0);
		root.print(root1, 0);

	}

}