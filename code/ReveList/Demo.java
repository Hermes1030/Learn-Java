package ReveList;

public class Demo {
    public static void main(String[] args) {

        Node n6 = new Node(6,null);
        Node n5 = new Node(5,n6);
        Node n4 = new Node(4,n5);
        Node n3 = new Node(3,n4);
        Node n2 = new Node(2,n3);
        Node n1 = new Node(1,n2);

        Node i = impre(n1);

    }

    public static class Node{
        private int value;
        private Node next;

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
    public static Node impre(Node head){
        Node prev = null,temp;
        Node cure = head;

        while (cure != null){
            temp = cure.next;
            cure.next = prev;
            prev = cure;
            cure = temp;
        }
        return prev;
    }

}
