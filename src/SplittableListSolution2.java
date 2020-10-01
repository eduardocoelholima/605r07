// replaced array of lists with a list of lists

import java.util.List;
import java.util.Vector;

public class SplittableListSolution2<T> extends Vector<T> {
    public List<List<T>> split(){
        List<List<T>> lists = new Vector<>();
        Vector<T> list0 = new Vector<>();
        Vector<T> list1 = new Vector<>();
        lists.add(list0);
        lists.add(list1);

        int half = size()/2;
        for (int i = 0; i < size() ; i++) {
            if (i<half) {
                list0.add(get(i));
            }
            else {
                list1.add(get(i));
            }
        }
        return lists;
    }

    static public void main (String[] args) {
        SplittableListSolution2<Integer> list = new SplittableListSolution2<>();

        list.add(1);
        list.add(4);
        list.add(3);
        list.add(2);

        System.out.println("list: " + list);

        List<List<Integer>> lists = list.split();

        System.out.println("1st split: " + lists.get(0));
        System.out.println("2nd split: " + lists.get(1));
    }
}
