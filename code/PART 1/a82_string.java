/**
 
stringBuffer here we can change a entire string 
 
 it has some methods like ..
  append
  setCharAt
  setLength




 */

public class a82_string {

    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("JAVA programmig skills are important skill in the world !!");
        // a.append(" roshan programmer");
        // a.append(" Nothing happens with Me ");

        // a.setCharAt(0, 'R');

        // a.setLength(40);
        // a.replace(1, 3, "roshan"); // like insert a string b/w 1 - 3

        // a.delete(0, 6);
        a.reverse();


        System.out.println(a);
        
    }
}