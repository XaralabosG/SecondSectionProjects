public class NumberPalindrome {
    public static boolean isPalindrome(int number){

        int copyNumber = number;
        int tempHold = 0;

        while(copyNumber!=0){
            tempHold *= 10;
            tempHold += copyNumber%10;
            copyNumber /= 10;
            System.out.println(tempHold);
        }

        return (tempHold == number);

    }
}

