import java.util.Comparator;

public class name implements Comparator<student> {
    
    @Override
    public int compare(student a, student b) {
        return  a.getName().compareTo(b.getName());
    }
}
