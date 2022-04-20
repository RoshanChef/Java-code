/*
Strings are immutable and can not be changed
        String name=new String("Happy");

        String is a class but can be used as data type
        Here following name is a reference varible
        String name="Happy";

        String Method:

        It can operate a java String. Like find a length,Convert into Upper,lower case
        It's followes zero base indexing
        It's a return a changed string
*/
public class a8_string {
    public static void main(String[] args) {
        // String name=new String("Happy");
        String name = "Happy pop song";
        System.out.print("Orignal String : " + name + "\nNew String : ");

        //// Method are followes zero base indexing
        // here we use camel case name convertion
        //// Chages are case sensetive ..

        // // System.out.println("The length : " + name.length());
        //
        // System.out.println(name.toLowerCase()); // return new string which converted
        // into lowwer case chara.
        // System.out.println(name.toUpperCase()); // return new string which converted
        // into lowwer case chara.
        //
        // System.out.println(name.trim());//Return new String removing after space "
        // Before Happy After"
        // System.out.println(name.substring(5));//substring(int start) Return new
        // String starting from given index

        // System.out.println(name.substring(6,12));
        // //Return a New substring from start to End index
        // //Start index is included but End index is excluded substring(start,end)

        // System.out.println(name.replace('p','r'));
        // Return a New String with replce .. old ch >> new ch
        // you can also change the string

        // System.out.println(name.replace("Happy", "Sad"));
        // System.out.println(name.startsWith("ha")); //return Boolean >> String is
        // required
        // System.out.println(name.endsWith(" pop song"));
        // System.out.println(name.indexOf('p')); //Return a index of char. pn agad thi
        // System.out.println(name.indexOf('o',8));
        // Return a index of char. start finding from Given index indexOf(ch,start)
        // System.out.println(name.indexOf("po",3));
        // System.out.println(name.indexOf("ppy"));

        // System.out.println(name.lastIndexOf('o'));//pachhad thi index return kere
        // System.out.println(name.lastIndexOf("op"));
        // start finding from starting

        // System.out.println(name.equals("happy pop song"));
        // System.out.println(name.equalsIgnoreCase("happy pop SONG"));
   
    }
}
