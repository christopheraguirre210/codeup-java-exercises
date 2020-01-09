package util;

public class PracticeQuestions {


//    adds every number before the passed number and returns the total
    public static int SimpleAdding(int num){
        int bucket = 0;
        for(int i = 1; i <= num; i++){
            bucket += i;
        }
        return bucket;
    }

    public static void main(String[] args) {

    }
}
