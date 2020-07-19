class Solution {
    public List<Integer> preorder(Node root) {
	    LinkedList<Node> node_list = new LinkedList<>();
	    LindedList<Integer> output = new LinkedList<>();
	    if (root == null) return output;
	    node_list.add(root);
	    while(!node_list.isEmpty())	{
		    Node node = node_list.pollLast();
		    output.add(node.val);
		    Collection.reverse(node.children);
		    for (Node node:node.children){
			    node_list.add(item);
		    }
	    }
	    return output;	    
    }
}
