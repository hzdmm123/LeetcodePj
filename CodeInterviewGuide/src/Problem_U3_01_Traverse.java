import java.util.Stack;

/**
 * Created by hzdmm on 2016/12/13.
 */
public class Problem_U3_01_Traverse {
    public static class Node{
        public int value;
        public Node left;
        public Node right;

        public Node(int data){
            this.value = data;
        }
    }

    public static void preOrderTracerse(Node head){
        if (head==null){
            return;
        }
        System.out.println(head.value);
        preOrderTracerse(head.left);
        preOrderTracerse(head.right);
        //递归的先序遍历
    }

    public static void middleOrderTracerse(Node head){
        if (head==null){
            return;
        }

        preOrderTracerse(head.left);
        System.out.println(head.value);
        preOrderTracerse(head.right);
}

    public static void backOrderTracerse(Node head){
        if (head==null){
            return;
        }

        backOrderTracerse(head.left);
        backOrderTracerse(head.right);
        System.out.println(head.value);

    }

    public static void preOrderNoTracerse(Node head){
        //前序遍历的非递归算法
        System.out.println("preOder is");
        if(head!=null){
            Stack<Node> s = new Stack<Node>();
            s.push(head);
            while (!s.empty()){
                head =s.pop();
                System.out.println("value is"+head.value);
                if (head.right!=null){
                    s.push(head.right);
                }

                if (head.left!=null){
                    s.push(head.left);
                }

            }
        }

    }

    public static void middleOrderNoTracerse(Node head){
        //中序遍历的非递归算法
        System.out.println("In order is");
        if (head!=null){
            Stack<Node> s = new Stack<Node>();
            while (!s.empty()||head!=null){
                if (head!=null){
                    s.push(head);
                    head = head.left;
                }else{
                    head = s.pop();
                    System.out.println("value is"+head.value);
                    head = head.right;
                }
            }
        }

    }

    public static void backOrderNoTraerse(Node head){
        System.out.println("Back order is...");
        if (head!=null){
            Stack<Node> s1 = new Stack<Node>();
            Stack<Node> s2 = new Stack<Node>();
            s1.push(head);
            while (!s1.empty()){
                head= s1.pop();
                s2.push(head);
                if (head.left!=null){
                    s1.push(head.left);
                }
                if (head.right!=null){
                    s1.push(head.right);
                }
            }
            while(!s2.empty()){
                System.out.println(s2.pop().value+" ");
            }
        }
    }

    public static void levelTraveser(Node head){
        //层次遍历

    }

    public static void main(String[] args) {
        Node root1 = new Node(1);
        Node roo2 = new Node(2);
        Node roo3 = new Node(3);
        Node roo4 = new Node(4);
        Node roo5 = new Node(5);
        Node roo6 = new Node(6);
        Node roo7 = new Node(7);
        root1.left=roo2;
        root1.right=roo3;
        roo2.left=roo4;
        roo2.right=roo5;
        roo3.left=roo6;
        roo3.right=roo7;
        middleOrderNoTracerse(root1);



    }
}
