import java.util.HashMap;

/**
 * Created by hzdmm on 2017/10/18.
 */
public class LRUCache {
    public class Node{
        int key;
        int value;
        Node pre;
        Node next;

        public Node(int key,int value){
            this.key=key;
            this.value=value;
        }
    }

    public class LRU{
        int capacity;
        HashMap<Integer,Node> map = new HashMap<>();
        Node head = null;
        Node end = null;
        public LRU(int capacity){
            this.capacity=capacity;
        }

        public int get(int key){
            if (map.containsKey(key)){
                Node n =map.get(key);
                remove(n);
                setHead(n);
                return n.value;
            }
            return -1;
        }

        private void setHead(Node n) {
            n.next =head;
            n.pre = null;
            if (head!=null){
                head.pre=n;
            }

            head = n;

            if (end==null){
                end = head;
            }
        }

        private void remove(Node n) {
            if (n.pre!=null){
                n.pre.next=n.next;
            }else {
                head=n.next;
            }

            if (n.next!=null){
                n.next.pre=n.pre;
            }else {
                end=n.pre;
            }
        }

        public void set(int key,int value){
            if (map.containsKey(key)){
                Node old = map.get(key);
                old.value = value;
                remove(old);
                setHead(old);
            }else {
                Node created = new Node(key,value);
                if (map.size()>=capacity){
                    map.remove(end.key);
                    remove(end);
                    setHead(created);
                }else {
                    setHead(created);
                }
                map.put(key,created);
            }
        }

    }
}
