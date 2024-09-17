//Define a testing class with a main() method where you:
//create an HashSet with all the days of the week and print the content of the HashSet
//create another implementation of Set that preserves the insertion order of the days of the week and print it
//print the new Set
//print the answer to the question Is the first Set equal to the second one?
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TestDaysOfWeeks {
    public static void main(String[] args) {
        Set<String> daysHashSet = new HashSet<>();
        daysHashSet.add("Monday");
        daysHashSet.add("Tuesday");
        daysHashSet.add("Wednesday");
        daysHashSet.add("Thursday");
        daysHashSet.add("Friday");
        daysHashSet.add("Saturday");
        daysHashSet.add("Sunday");
        System.out.println("HashSet Days of Weeks: "+ daysHashSet);
        Set<String> daysLinkedHashSet = new LinkedHashSet<>();
        daysLinkedHashSet.add("Monday");
        daysLinkedHashSet.add("Tuesday");
        daysLinkedHashSet.add("Wednesday");
        daysLinkedHashSet.add("Thursday");
        daysLinkedHashSet.add("Friday");
        daysLinkedHashSet.add("Saturday");
        daysLinkedHashSet.add("Sunday");
        System.out.println("LinkedHashSet Days of Weeks: "+ daysLinkedHashSet);
        boolean isEqual= daysHashSet.equals(daysLinkedHashSet);
        System.out.println("Is the daysHashSet is Equal to daysLinkedHashSet? "+isEqual);
    }
}
