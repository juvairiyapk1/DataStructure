package Tree;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
    }
}
public class BinarySearchTree {

    Node root;


    public BinarySearchTree() {
        this.root = null;
    }

    public void insert(int data){
        root=insertRecursive(root,data);
    }

    private Node insertRecursive(Node root, int data) {
        if (root == null){
            root = new Node(data);
            return root;
        }
        if (data < root.data){
            root.left = insertRecursive(root.left,data);
        }else if(data > root.data) {
            root.right = insertRecursive(root.right,data);
        }
        return root;
    }

    public void remove(int data){
        root = removeRec(root,data);
    }

    private Node removeRec(Node root, int data) {
        if (root == null){
            return root;
        }
        if (data < root.data){
            root.left=removeRec(root.left,data);
        } else if (data > root.data) {
            root.right=removeRec(root.right,data);
        }else {
            if (root.left == null){
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            root.data=minValue(root.right);
            root.right=removeRec(root.right,root.data);
        }
        return root;
    }

    private int minValue(Node root){
        int minValue=root.data;
        while (root.left != null){
            minValue=root.left.data;
            root=root.left;
        }
        return minValue;
    }

    void inOrder(){
        inOrderRec(root);
        System.out.println();
    }

    private void inOrderRec(Node root) {
        if(root != null){

            inOrderRec(root.left);
            System.out.print(root.data+" ");
            inOrderRec(root.right);
        }
    }
    void preOrder(){
        preOrderRec(root);
        System.out.println();
    }

    private void preOrderRec(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }
     void postOrder(){
        postOrderRec(root);
         System.out.println();
     }

    private void postOrderRec(Node root) {
        if (root !=null){
            postOrderRec(root.left);
            postOrderRec(root.right);
            System.out.print(root.data + " ");

        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst=new BinarySearchTree();
        bst.insert(10);
        bst.insert(11);
        bst.insert(8);
        bst.insert(9);
        bst.insert(5);
        bst.insert(12);


        bst.inOrder();
        bst.remove(12);
        bst.preOrder();
        bst.postOrder();
    }
}
