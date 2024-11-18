public class postOrderBT {
    class Node{
        int data;
        Node left, right;
        public Node(int data){
            this.data = data;
            left = right = null;
        }
    }

    class BinaryTree{
        Node root;
        public BinaryTree(){
            this.root = null;
        }

        public void insert(int value){
            root = insertRec(root, value);
        }

        private Node insertRec(Node root, int value){
            if(root == null){
                root = new Node(value);
                return root;
            }

            if(value < root.data){
                root.left = insertRec(root.left, value);
            }

            if(value > root.data){
                root.right = insertRec(root.right, value);
            }
            
            return root;
        }

        public void postOrder(){
            postOrderRec(root);
        }

        private void postOrderRec(Node root){
            if(root != null){
                postOrderRec(root.left);
                postOrderRec(root.right);
                System.out.print(root.data + " ");
            }
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new postOrderBT().new BinaryTree();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(70);
        System.out.println("Post-Order traversal of binary tree is: ");
        tree.postOrder();
    }


    
}
