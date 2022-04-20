/*
Array is collection of similar type of data
an Array is a collection of variables of the same type.
It's followes zero indexing
Array are are dynamically allocated since it's a object in java 


Decalration of an Array
  dataType[] arrayVar; // preferred way. 
  or
  dataType arrayVar[]; // works but not preferred way.
 
  dataType[] arrayVar = new dataType[arraySize];

*/

/*
 Multidimensional Arrays ::
 => Multidimensional Arrays can be defined in simple words as array of arrays. 
 => Data in multidimensional arrays are stored in tabular form (in row major order).

data_type[1st dimension][2nd dimension][]..[Nth dimension] array_name = new data_type[size1][size2]….[sizeN];

example of 2D array
   Method 1: indirect methoid of declaring
   data_type[][] array_name = new data_type[row][column];
        For example: int[][] arr = new int[10][20];

   Method 2: Direct Method of Declaration:
        Syntax:

        data_type[][] array_name = {
                             {valueR1C1, valueR1C2, ....}, 
                             {valueR2C1, valueR2C2, ....}
                           };

        For example: int[][] arr = {{1, 2}, {3, 4}};


 */

public class a9_arrays {
    public static void main(String[] args) {
        // Ways of Create an Array

        // way 1 :
        // It's used when you know a size of array
        // Declaration + Memory Allocation
        // int[] marks = new int[44];

        // way 2 :
        // int student[]; //Declaration
        // student = new int[5]; //Memory Allocation

        // way 3 :
        // Declaraton + Initialization
        // It's used when you doesn't know a size of array
        // int[] roll = {1003, 1005, 1010, 1009, 10155};

        // you can access a elements like as follows

        int no[] = { 12, 26, 56, 78, 95 };

        // System.out.println("The elements of Array is : ");
        // System.out.print(no[0]+" ");
        // System.out.print(no[1]+" ");
        // System.out.print(no[2]+" ");
        // System.out.print(no[3]+" ");
        // System.out.print(no[4]+" ");

        // int l = no.length; // gives a length of Array here 5
        // for (int i = 0; i < l; i++) {
        // System.out.print(no[i]+" ");
        // }

        // You can use a For Each loop Syntax
        // it gives you a sequencial element
        // for( datatypearr elementvar : ArrVar){ }

        // for (int ele : no) {
        // System.out.println(ele);
        // }

        int[] a, b; // here borth a and b is array
        int study[], doc; // Here study is Array and doc is normal var
        // It's Give us a Error
        // doc = new int[5];
        // doc[0] = 46;
        // doc[1] = 79;
        // doc[2] = 102;
        // doc[3] = 123;
        // doc[4] = 154;

        // for (int r:b) {
        // System.out.println(r+" ");
        // }

        // String arr[]={"roshan","dhara","" +"Chhotubhai","meenaben"};
        // System.out.println(arr[2]);

        char c[] = { 'A', 'B', 'C', 'D', 'E', '\0' };
        System.out.println("The Fifth value is : "+c[4]);
   

    }
}
