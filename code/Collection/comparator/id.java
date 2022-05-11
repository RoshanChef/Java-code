import java.util.Comparator;

public class id implements Comparator<student> {
    @Override
    public int compare(student o1, student o2) {
        return o1.getId()-o2.getId();
    }
}
