//bounded types - you can create the objects of a generic class to have
//data of specific derived types
//Example: Number

public class GenericClass <T /*extends Number*/, V> {

    T n;
    V m;

    GenericClass(T n, V m) {
        this.n = n;
        this.m = m;
    }

    public V getValue() {
        return m;
    }
}
