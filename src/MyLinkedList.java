import java.util.Collections;

public class MyLinkedList<E> {

    Node<E> lastElement;

    public void add ( E element ) {
        if (lastElement == null) {
            lastElement = new Node<E>(element, null);
        }

        else {
            Node<E> newNode = new Node<E>(element, lastElement);
            lastElement = newNode;
        }
    }

    public void remove (E element) {
        Node<E> previous = null;
        for (Node<E> current = lastElement; current != null; current = current.next) {
            if (current.object.equals(element)) {
                if (previous != null) {
                    previous.next = current.next;
                    break;
                }
            }
            previous = current;
        }
    }

    public String find(E element) {
        String resultsString = "";

        for (Node<E> current = lastElement; current != null; current =
                current.next) {
            if (current.object.equals(element)) {
                resultsString += current.toString() + "\n";
                break;
            }

        }

        return resultsString;
    }

    public String toString() {
        String listString = "";

        for (Node<E> current = lastElement; current != null; current =
                current.next) {
            listString += current.toString() + "\n";
        }

        return listString;
    }

    public static void main(String [] args) {
        MyLinkedList<Person> personList = new MyLinkedList<Person>();

        Person p1 = new Person("Eduardo", "Lima", 39 );
        Person p2 = new Person("Angelina", "Lima", 0);
        Person p3 = new Person("Alberto", "Lima", 74);

        personList.add( p1 );
        personList.add( p2 );
        personList.add( p3 );
        System.out.println( personList );


        personList.remove( p2 );
        System.out.println( personList );

        String who = personList.find( p1 );
        System.out.println( who );

    }

}
