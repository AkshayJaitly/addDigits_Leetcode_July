/**
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
 * @author akshayjaitly
 * @created 7/26/20
 * O(1) runtime
 */
class addDigits {
    //Used divisility by 9 to caclulate compute logic

    public static int addDigits(int num) {
        if (num == 0) {
            System.out.println("The output is" + 9);
            return 0;
        }

        if (num % 9 == 0) {
            System.out.println("The output is " + 9);
            return 9;
        }
        System.out.println("The output is " + num%9);
        return num % 9;
    }

    public static void main(String[] args){
        addDigits(38);
    }
}



