/**
 * Author: Vaibhav Diwan
 * User: Vaibhav Diwan
 * Date: 8/21/2024
 * Time: 7:44 PM
 */

public class CreateProcessArray {
    public static void main(String[] args) {
        // creating array
        //syntax
        /*
        declaration
        datatype[] arrayName;
        int[] marks;

        initialization
        syntax
        arrayName = new datatype[int size];
        size cannot be negative
        size can be maximum of integer range
        example:
        marks = new int[10];

        declaration and initialization
        datatype[] arrayName = new datatype[int size];
        int[] numbers = new int[10];
         */
        int[] marks;
        marks = new int[5];
        int[] numbers = new int[5];

        //arrayName[index]
        // marks[0] -> will give access to first element of the array
        // want to print first element
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        // want to put some random values on array indexes
        marks[0] = 100;
        marks[3] = 300;
        marks[4] = 500;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        // agar me array ko print kar dun using the name of the array toh kya hoga?
        System.out.println(marks);
        double[] temp = new double[5];
        System.out.println(temp);
        char[] alphabets = new char[5];
        System.out.println(alphabets);


        // how to know the sixe of an array
        // length is property in array, which stores the size or number of elements in the array
        // how to access length property -> arrayName.length
        int size = marks.length;
        // printing array using for loop
        for (int index = 0; index < marks.length; index++) {
            //updating
            marks[index] = index;
            System.out.println(marks[index]);
        }

    }
}
