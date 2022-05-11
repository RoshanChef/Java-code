import java.util.Comparator;

class roll implements Comparator<student> {

    @Override
    public int compare(student o1, student o2) {
        return o1.getRoll()-o2.getRoll();
    }
    
}