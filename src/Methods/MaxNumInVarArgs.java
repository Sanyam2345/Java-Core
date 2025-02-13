package Methods;

public class MaxNumInVarArgs {
    static int max(int ...A) {
        if (A.length == 0) return Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < A.length; i++) {
            if (A[i] > max) max = A[i];
        }
        return max;
    }
    public static void main(String[] args) {
       int m =  max(2,3,5,6,1,8,9,12,78,56,1000);
        System.out.println("Max num in varargs is " + m);
    }
}
