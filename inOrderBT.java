public class inOrderBT {
    class Node{
        int data;
        Node left;
            Node right;
            public Node(int value){
                data = value;
                left = right = null;
            }
        }
    
     public class BinaryTreeClass{
        Node root;
        public BinaryTreeClass(){
            this.root = null;
        }
    
        public void insert(int value){
            root = insertRec(root,value);
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
    
        public void inorder(){
            inorderRec(root);
        }
    
        private void inorderRec(Node root){
            if(root != null){
                inorderRec(root.left);
                System.out.print(root.data + " ");
                inorderRec(root.right);
            }
        }
    }
    
        public static void main(String[] args) {
            BinaryTreeClass tree = new inOrderBT().new BinaryTreeClass();
            tree.insert(50);
            tree.insert(30);
            tree.insert(20);
            tree.insert(40);
            tree.insert(60);
            tree.insert(70);
            System.out.println("In-Order traversal of binary tree is: ");
            tree.inorder();
        }
        
    }
    

