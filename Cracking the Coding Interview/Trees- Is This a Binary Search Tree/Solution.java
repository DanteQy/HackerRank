/* Hidden stub code will pass a root argument to the function below. 
Complete the function to solve the challenge.

The Node class is defined as follows:
    class Node {
        int data;
        Node left;
        Node right;
     }
*/
    //root is the MAX in the left sub-tree and the MIN in the right one
    public boolean checkBST(Node root) {
        return visit(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
 
    private boolean visit(Node root, int low, int high) {
        if(root == null) {
            return true;
        }
        if(root.data <= low || root.data >= high) {
            return false;
        }
        return visit(root.left, low, root.data) &&
               visit(root.right, root.data, high);
    }


