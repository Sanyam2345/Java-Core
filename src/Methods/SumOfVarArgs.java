package Methods;

public class SumOfVarArgs {
    static int sumOfVarArgs(int ...A) {
        if(A.length==0) return 0;
        int sum = 0;
        for (int i = 1; i <= A.length; i++) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        int sum = sumOfVarArgs(1,2,3,4,5);
        System.out.println("Sum of varargs is: " + sum);
    }
}
