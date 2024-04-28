/**
 * The Main class is the entry point of the program.
 * It demonstrates the usage of the MyArrayList class.
 */
public class Main {

    /**
     * The main method is the entry point of the program.
     * It creates an instance of MyArrayList and demonstrates its functionality.
     *
     * @param args The command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Create an instance of MyArrayList
        MyArrayList myArrayList =  new MyArrayList();

        // Add elements to the list
        myArrayList.add(11.5);
        myArrayList.add(10);
        myArrayList.add(9);
        myArrayList.add(8.7);
        myArrayList.add(7);
        myArrayList.add(6);

        // Display the value of an element at a specific index
        System.out.println("Value of element by index 3: " + myArrayList.get(3));

        // Add a new value at a specific index
        myArrayList.add(3,20);
        System.out.println("Value of element by index 3 after adding new value: " + myArrayList.get(3));

        // Display the size of the list
        System.out.println("Size of myArrayList: " + myArrayList.size());

        // Remove an element at a specific index
        myArrayList.remove(3);
        System.out.println("Size of myArrayList after removing: " + myArrayList.size());
        System.out.println("Value of index 3 after removing: " + myArrayList.get(3));

        // Clear the list
        myArrayList.clear();
        System.out.println("Size of myArrayList after clear: " + myArrayList.size());
    }
}
