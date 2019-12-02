import java.util.Arrays;

public class ArrayLec {
    public static void main(String[] args) {
//        String[] cheese = new String[4];
//        cheese[0] = "Muenster";
//        cheese[1] = "Swiss";
//        cheese[2] = "Spray";
//        cheese[3] = "Kraft American Singles";
//
//        for(String single : cheese){
//            System.out.println(single);
//        }

        int[] nums = new int[6];





//this below just fills the array with 17;
        Arrays.fill(nums, 17);
//      below with fill the index spot of 3 with the number 9;
        nums[3] = 9;

        for(int n : nums){
            System.out.println(n);
        }

        System.out.println("~~~~~~~~~~~");

        int[] nums2 = {17,17,17,9,17,17};


        for(int n : nums2){
            System.out.println(n);
        }

//        below will sort the array in ascending order;
//        sort will also sort in alphabetical order as well but must be declared before printing out the array.
        Arrays.sort(nums);

//        below prints out a string formatted array;
        System.out.println(Arrays.toString(nums));

//        this method below compares the first nums array with nums2 array with value and length.
//        System.out.println(Arrays.equals(nums,nums2));


        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for (int[] row : matrix) {
            System.out.println("+---+---+---+");

            System.out.print("| ");

            for (int n : row) {
                System.out.print(n + " | ");
            }

            System.out.println();
        }

        System.out.println("+---+---+---+");
    }
}
