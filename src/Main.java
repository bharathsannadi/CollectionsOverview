import java.util.*;

public class Main {

    public static void main(String[] args) {
        Collection<String> stringsInACollection = new ArrayList<String>();
        stringsInACollection.add("String One");
        stringsInACollection.add("String Two");
        stringsInACollection.add("String One");
        for (String aString : stringsInACollection){
            System.out.println(aString);
        }

        System.out.println();

        List<String> stringsInAList = new ArrayList<String>();
        stringsInAList.add("String One");
        stringsInAList.add("String Two");
        stringsInAList.add("String One");
        System.out.println(stringsInAList.get(1));

        System.out.println();

        Collection<String> otherStrings = new HashSet<String>();
        otherStrings.add("String One");
        otherStrings.add("String Two");
        for (String aString : otherStrings){
            System.out.println(aString);
        }
    }
}
