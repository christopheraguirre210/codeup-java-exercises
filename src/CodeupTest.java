public class CodeupTest {
    public static void main(String[] args) {
//        created an Array of information to pass to my constructor
        String[] student1 = {"Chris", "A", "Deimos", "Macbook Air"};

        CodeupStudent chris = new CodeupStudent(student1, true);

        chris.greeting();;
        chris.study();
        System.out.println(chris.giveBusinessCards());


    }
}

