import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Person implements Comparable<Person> {

    public String firstName, lastName;
    public Integer age;

    public Person( String firstName, String lastName, Integer age ) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int compareTo( Person p ) {
        return this.firstName.compareTo(p.firstName);
    }

    public String toString() {
        return firstName + " " + lastName;
    }

    public static void main (String [] args) {
        List<Person> personList = new LinkedList<>();
        personList.add(new Person("Eduardo", "Lima", 39));
        personList.add(new Person("Angelina", "Lima", 0));
        personList.add(new Person("Alberto", "Lima", 74));

        System.out.println(personList);
        Collections.sort(personList);
        System.out.println(personList);

    }

}
