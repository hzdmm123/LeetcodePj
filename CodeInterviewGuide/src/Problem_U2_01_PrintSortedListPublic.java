/**
 * Created by hzdmm on 2016/10/16.
 */
public class Problem_U2_01_PrintSortedListPublic {

    public static class Node{
        public int value;
        public Node next;
        public Node(int data){
            this.value = data;
        }

    }//创建node数据结构

    public static void PrintCommonPart(Node head1,Node head2){

        System.out.println("Common part:");

        while(head1 != null && head2 !=null){//排除列表为空的情况
            if (head1.value < head2.value){
                head1 = head1.next;
            }else if (head1.value > head2.value) {
                head2 = head2.next;//不相等都走下一个
            }else{
                System.out.print(head1.value+"");
                head1 = head1.next;
                head2 = head2.next;//正常情况下的走势
            }

        }
        System.out.println();
    }

      public static void main(String[] args){
        Node node1 = new Node(2);
        node1.next = new Node(3);
        node1.next.next = new Node(5);
        node1.next.next.next = new Node(6);
        //建立列表
        Node node2 = new Node(1);
        node2.next = new Node(2);
        node2.next.next = new Node(5);
        node2.next.next.next = new Node(7);
        node2.next.next.next.next = new Node(8);

        PrintCommonPart(node1, node2);//使用函数进行比对




    }
}
