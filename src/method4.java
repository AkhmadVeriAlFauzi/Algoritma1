public class method4 {
    // non void, parameter
    public static String[] inputData(int a, double[] v){
        String[] Kode = new String[]{"AB","CG","JK"};
        return Kode;
    }

    public static void main(String[] args) {
        double[] parameterKedua = new double[]{5.6,7.9};
        String[] t = inputData(2,parameterKedua);
        for(String s:t){
            System.out.println(s);
        }
    }
}
