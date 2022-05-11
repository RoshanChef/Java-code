public class student implements Comparable<student> {
    private int id;
    private String name;
    private int roll;

    public student(int id, String name, int roll) {
        this.id = id;
        this.name = name;
        this.roll = roll;
    }

    public int getRoll() {
        return roll;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    //By using this we can only apply a single logic of sorting 

    @Override
    public int compareTo(student o) {
        return this.roll - o.roll;
    }

    @Override
    public String toString() {
        return "\nId : "+this.id+" Roll : "+this.roll+" Name : "+this.name;
    }



}
