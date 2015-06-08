
public class Main {

	public static void main(String[] args) {
		TreeNode<String> root = new TreeNode<String>("1");
		{
			TreeNode<String> node1 = root.addChild("2");
			TreeNode<String> node2 = root.addChild("9");
		    {
		    	TreeNode<String> node20 = node1.addChild("3");
		    	TreeNode<String> node21 = node1.addChild("4");
		        {
		        	TreeNode<String> node22 = node2.addChild("10");
		        	TreeNode<String> node23 = node2.addChild("12");
		        }
		    }
		}
		root.print(root , 0);

	}

}
