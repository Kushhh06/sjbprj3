package sjb.mca.tree;


public class BST {
    TreeNode root;

    void insert(int value) {
        root = insertNode(root, value);
    }

    TreeNode insertNode(TreeNode node, int value) {
        if (node == null) {
            return new TreeNode(value);
        }
        if (value < node.data) {
            node.left = insertNode(node.left, value);
        } else if (value > node.data) {
            node.right = insertNode(node.right, value);
        }
        return node;
    }

    void inorder() {
        System.out.print("Inorder: ");
        inorderNode(root);
        System.out.println();
    }

    void inorderNode(TreeNode node) {
        if (node != null) {
            inorderNode(node.left);
            System.out.print(node.data + " ");
            inorderNode(node.right);
        }
    }

    void preorder() {
        System.out.print("Preorder: ");
        preorderNode(root);
        System.out.println();
    }

    void preorderNode(TreeNode node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorderNode(node.left);
            preorderNode(node.right);
        }
    }

    void postorder() {
        System.out.print("Postorder: ");
        postorderNode(root);
        System.out.println();
    }

    void postorderNode(TreeNode node) {
        if (node != null) {
            postorderNode(node.left);
            postorderNode(node.right);
            System.out.print(node.data + " ");
        }
    }

    public static void main(String[] args) {
        BST b = new BST();
        b.insert(40);
        b.insert(20);
        b.insert(60);
        b.insert(10);
        b.insert(30);
        b.insert(50);
        b.insert(70);

        b.inorder();    
        b.preorder();   
        b.postorder();  
    }
}
