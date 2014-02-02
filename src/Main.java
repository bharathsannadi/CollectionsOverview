import java.util.*;

import static java.util.Arrays.asList;

public class Main {

    public static void main(String[] args) {
        StringCollection stringCollection = new StringCollection(new ArrayList<String>(), "String One", "String Two", "String One");
        stringCollection.print();

        System.out.println();

        List<String> stringList = new ArrayList(asList("String One", "String Two", "String One"));
        System.out.println(stringList.get(1));

        System.out.println();

        StringCollection stringSet = new StringCollection(new HashSet<String>(), "String One", "String Two");
        stringSet.print();
    }
}
