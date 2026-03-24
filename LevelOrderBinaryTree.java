import java.util.*;
class tree{
    int data;
    tree left;
    tree right;
    tree(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
    static void preorder(tree root){
        if(root!=null){
            System.out.println(root.data);
            preorder(root.left);
            preorder(root.right);
        }
        // return root;
    }
}
class LevelOrderBinaryTree {
    public static void main(String[] args) {
        tree root=new tree(1);
        root.left=new tree(2);
        root.right=new tree(3);
        root.left.left=new tree(4);
        root.left.right=new tree(5);
        root.left.right.left=new tree(8);
        root.right.left=new tree(6);
        root.right.right=new tree(7);
        root.right.right.left=new tree(9);
        root.right.right.right=new tree(10);
        tree.preorder(root);
        
        
        Queue<tree> q=new LinkedList<tree>();
        List<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
        if(root==null) System.out.print("-->"+list);
    
        q.offer(root);
        while(!q.isEmpty()){
            int l=q.size();
            ArrayList<Integer> sub=new ArrayList<Integer>();
            for(int i =0;i<l;i++){
                if(q.peek().left!=null) q.offer(q.peek().left);
                if(q.peek().right!=null) q.offer(q.peek().right);
                sub.add(q.poll().data);
            }
            list.add(sub);
        }
        System.out.println(list);
    }
    
}