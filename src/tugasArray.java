import java.util.Arrays;

public class tugasArray {
    public static String highLow(String numbers){
        String[] NUMBERS = numbers.split(" ");
        int[] myNumber = new int[NUMBERS.length];
        for (int index = 0; index < NUMBERS.length; index++){
            myNumber[index] = Integer.parseInt(NUMBERS[index]);
        }
        Arrays.sort(myNumber);

        String max = String.valueOf(Arrays.stream(myNumber).max());
        String min = String.valueOf(Arrays.stream(myNumber).min());

        return max + " " + min;

//        Syntax kedua
//        public static String highLow(String numbers){
//            var stat = Stream(str.split(" ")).mapToInt(Integer::parseInt).Summarystatistic();
//            return stat.getMax+" "+ stat.getMin;
//        }

    }

    public static void main(String[] args) {
        System.out.println(highLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }
}
