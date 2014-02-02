import java.util.Arrays;
import java.util.Collection;

public class StringCollection {
    private Collection<String> collection;

    public StringCollection(Collection<String> collection, String... strings) {
        this.collection = collection;
        this.collection.addAll(Arrays.asList(strings));
    }

    public void print() {
        for (String aString : collection) {
            System.out.println(aString);
        }
    }
}