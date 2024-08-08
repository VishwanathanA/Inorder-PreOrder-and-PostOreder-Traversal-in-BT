

class TreeNode{
    int val;
    TreeNode left,right;
    TreeNode(int val){
        this.val=val;
        left=right=null;
    }
}
public class OrderTreaversal{
    public static void inOrder(TreeNode root){
        if(root==null)
        {
            return;
        }
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
}
public static void preOrder(TreeNode root){
    if(root==null)
    {
        return;
    }
    System.out.print(root.val+" ");
    preOrder(root.left);
    preOrder(root.right);
}
public static void postOrder(TreeNode root){
    if(root==null)
    {
        return;
    }
    postOrder(root.left);
    postOrder(root.right);
    System.out.print(root.val+" ");
}
public static void main(String[] args)
{
    TreeNode root=new TreeNode(1);
    root.left=new TreeNode(2);
    root.right=new TreeNode(3);
    root.left.left=new TreeNode(4);
    root.left.right=new TreeNode(5);
    root.left.right.left=new TreeNode(8);
    root.right.left=new TreeNode(6);
    root.right.right=new TreeNode(7);
    root.right.right.left=new TreeNode(9);
    root.right.right.right=new TreeNode(10);
    OrderTreaversal tree=new OrderTreaversal();
    System.out.print("Inorder Traversal : ");
    tree.inOrder(root);
    System.out.print("\npreorder Traversal : ");
    tree.preOrder(root);
    System.out.print("\npostorder Traversal : ");
    tree.postOrder(root);
}
}