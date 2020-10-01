import java.util.List;
import java.util.Vector;

public class SplittableListSolution<T> extends Vector<T> {
    public List<T>[] split(){
        Vector<T>[] list = new Vector[2];
        list[0] = new Vector<>();
        list[1] = new Vector<>();

        int half = size()/2;
        for (int i = 0; i < size() ; i++) {
            if (i<half) {
                list[0].add(get(i));
            }
            else {
                list[1].add(get(i));
            }
        }
        return list;
    }

    static public void main (String[] args) {
        SplittableListSolution<Integer> list = new SplittableListSolution<>();

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
