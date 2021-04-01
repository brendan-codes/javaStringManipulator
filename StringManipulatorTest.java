public class StringManipulatorTest {
    public static void main(String[] args) {
        // create a new instance of the String Manipulator and make the following tests pass
        // finish the method stubs inside of StringManipulator
        StringManipulator manipulator = new StringManipulator();

        String trimmed = manipulator.trimAndConcat("    Hello     ","     World    ");
        System.out.println(trimmed); // HelloWorld

        char letter = 'o';
        Integer index1 = manipulator.getIndexOrNull("Coding", letter);
        Integer index2 = manipulator.getIndexOrNull("Hello World", letter);
        Integer index3 = manipulator.getIndexOrNull("Hi", letter);
        System.out.println(index1); // 1
        System.out.println(index2); // 4
        System.out.println(index3); // null

        String word = "Hello";
        String subString = "llo";
        String notSubString = "world";
        Integer output1 = manipulator.getIndexOrNull(word, subString);
        Integer output2 = manipulator.getIndexOrNull(word, notSubString);
        System.out.println(output1); // 2
        System.out.println(output2); // null

        String concat = manipulator.concatSubstring("Hello", 1, 2, "world");
        System.out.println(concat); // eworld
    }
}