public class preOrderBT {
    class Node{
        int data;
        Node left, right;
        public Node(int data){
            this.data = data;
            left = right = null;
        }
    }

    public class BinaryTree{
        Node root = null;

        public BinaryTree(){
            this.root = null;
        }

        public void insert(int value){
            root =  insertRec(root, value);
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

        public void preOrder(){
            preOrderRec(root);
        }

        private void preOrderRec(Node root){
            if(root != null){
                System.out.print(root.data + " ");
                preOrderRec(root.left);
                preOrderRec(root.right);
            }
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new preOrderBT().new BinaryTree();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(70);
        System.out.println("Pre-Order traversal of binary tree is: ");
        tree.preOrder();
    }


    

    
}
