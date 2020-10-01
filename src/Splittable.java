import java.util.List;

public interface Splittable<T> {

     // return an array, each element containing a split of
     // the original Object.
     List<T>[] split();
}
