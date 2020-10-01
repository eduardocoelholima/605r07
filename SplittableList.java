import java.util.Vector;
import java.util.List;

public class SplittableList<T> extends Vector<T> {
    public List<T>[] split(){
        ...
    }

    static public void main (String[] args) {
        SplittableList<Integer> list = new SplittableList<>();

        list.add(1);
        list.add(4);
        list.add(3);
        list.add(2);

        System.out.println("list: " + list);

        List<Integer>[] lists = list.split();

        System.out.println("1st split: " + lists[0]);
        System.out.println("2nd split: " + lists[1]);
    }
}
