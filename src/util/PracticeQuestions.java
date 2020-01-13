package util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PracticeQuestions {


//    adds every number before the passed number and returns the total
    public static int SimpleAdding(int num){
        int bucket = 0;
        for(int i = 1; i <= num; i++){
            bucket += i;
        }
        return bucket;
    }

    public static ArrayList<Integer> CombineList(ArrayList<Integer> ListOne, ArrayList<Integer> ListTwo){
        ArrayList<Integer> ListThree = new ArrayList<>();
        for(int i = 0; i < ListOne.size(); i++){
            ListThree.add(ListOne.get(i));
            Collections.sort(ListThree);
        }
        for(int j = 0; j < ListTwo.size(); j++){
            ListThree.add(ListTwo.get(j));
            Collections.sort(ListThree);
        }
        return ListThree;
    }

    public static void main(String[] args) {

        System.out.println(SimpleAdding(4));

    }
}
