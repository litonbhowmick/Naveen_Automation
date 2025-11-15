package test;
public class ArmstrongNumber {

    public static void main(String[] args) {

        int num = 153;
        int expected =  num;
        int power = String.valueOf(num).length();
        double result=0;
        double sum = 0;
        while(num>0){
            result = num % 10;
            sum = sum + Math.pow(result,power);
            num = num / 10;
        }

        int actual = (int)sum;
        System.out.println(actual == expected ? "armstrong": "Not armstrong");

    }
}
