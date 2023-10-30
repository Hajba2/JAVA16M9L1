package LinkedList;

public class OwnLL<T> {

    private Node<T> firstNode;
    private Node<T> lastNode;

    public void add(T val) {
        if (firstNode == null) {
            firstNode = new Node<>(null, null, val);
        } else if (lastNode == null) {
            lastNode = new Node<>(firstNode, null, val);
            firstNode.setNextNode(lastNode);
        } else {
            Node<T> newLastNode = new Node<>(lastNode, null, val);
            lastNode.setNextNode(newLastNode);
            lastNode = newLastNode;
        }
    }

    public T get(int index) {
        Node<T> currentNode = firstNode;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNextNode();
        }
        return currentNode.getValue();
    }

    public static void main(String[] args) {
        OwnLL<String> ll = new OwnLL<>();

        ll.add("asd1");
        ll.add("asd2");
        ll.add("asd3");
        ll.add("asd4");

        System.out.println("ll.get(2) = " + ll.get(2));

    }
}
