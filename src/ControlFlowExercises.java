public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15) {
//            System.out.println("i is " + i);
//            i++;
//        }

//        long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i < 1000000);

//        for (int i = 5; i <= 15; i++) {
//            System.out.println("i is " + i);
//        }

        for(long i = 2; i < 1000000; i*=i) {
            System.out.println(i);
        }
    }
}
