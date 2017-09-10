package codility.media17;

public class Q3 {

    public static void main(String[] args) {
        Q3 q3 = new Q3();

        System.out.println(q3.solution());
    }

    public boolean solution() {
        int[] A = {1, 2, 3};
        int K = 3;

        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
            if (A[i] + 1 < A[i + 1])
                return false;
        }
        if (A[0] != 1 || A[n - 1] != K)
            return false;
        else
            return true;
    }

}
