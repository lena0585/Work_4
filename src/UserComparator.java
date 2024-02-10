import java.util.Comparator;

public class UserComparator<T extends User> implements Comparator<T> {

    @Override
    public int compare(T arg0, T arg1) {
        String name0 = arg0.getSurname() + arg0.getFirstname() + arg0.getMidllename();
        String name1 = arg1.getSurname() + arg1.getFirstname() + arg1.getMidllename();
        return name0.compareToIgnoreCase(name1);
    }

}