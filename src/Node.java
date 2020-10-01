public class Node<F> {

    public F object;
    public Node<F> next;

    public Node( F object, Node<F> next ) {
        this.object = object;
        this.next = next;
    }

    public String toString() {
        return object.toString();
    }
}
