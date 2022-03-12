package leet;


class Node {
    int key;
    Node left, right;

    Node(int item)
    {
        key = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;
 
    // returns true if trees
    //  with roots as root1 and root2are mirror
    boolean isMirror(Node node1, Node node2)
    {
        if ( node1 == null & node2 == null)
            return true;
/*        if (node1!=null && node2!=null && node1.key == node2.key && node1.left == null  &&  node2.right == null )
            return true;*/

        if ( node1 != null && node2!= null && node1.key == node2.key)
            return isMirror(node1.left, node2.right) && isMirror(node1.right,node2.left);;

        return false;
    }
 
    // returns true if the tree is symmetric i.e
    // mirror image of itself
    boolean isSymmetric()
    {
        // check if tree is mirror of itself
        return isMirror(root, root);
    }
 
    // Driver code
    public static void main(String args[])
    {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.left.left = new Node(5);

        tree.root.left.right = new Node(4);
        tree.root.right.left = new Node(4);
        tree.root.right.right = new Node(3);
        tree.root.right.right.right = new Node(5);

        boolean output = tree.isSymmetric();
        if (output == true)
            System.out.println("Symmetric");
        else
            System.out.println("Not symmetric");
    }
}