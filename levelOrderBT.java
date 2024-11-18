import java.util.Queue;
import java.util.LinkedList;

public class levelOrderBT {
    class Node{
        int data;
        Node right, left;
        public Node(int data){
            this.data = data;
            left = right = null;
        }
    }

    public class BinaryTree{
        Node root;
        public BinaryTree(){
            root = null;
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

        public void levelOrder(){
            System.out.print("Level-Order traversal of Binary Tree is: ");
            if(root == null) return;

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            while(!q.isEmpty()){
                Node current = q.poll();
                System.out.print(current.data + " ");

                if(current.left != null){
                    q.add(current.left);
                }

                if(current.right != null){
                    q.add(current.right);
                }
            }
            System.out.println();
        }
    }

        public static void main(String[] args) {
            BinaryTree tree = new levelOrderBT().new BinaryTree();
            tree.insert(50);
            tree.insert(30);
            tree.insert(20);
            tree.insert(40);
            tree.insert(60);
            tree.insert(70);
            

            tree.levelOrder();
        }

    }

