public class FirstAndLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        if (number<0){
            return -1;
        }
        int sum = number%10;
        while(number>=10){
            number/=10;
            System.out.println(sum);
        }
        return sum+number;
    }
}
