import java.util.List;

public interface Splittable2<T> {

     // return an array, each element containing a split of
     // the original Object.
     List<List<T>> split();
}
