package codility.media17;

//monotonic
public class Q2 {

    public static void main(String[] args) {
        System.out.println(test());
    }

    public static int test() {
        int[] A = {1, 2, 4, 7, 6, 6, 6, 2, 0};

        int result= 0;
        int len = 1;
        for(int i = 1; i < A.length; i++) {
            if(A[i-1] < A[i]) {
                result += len;
                len += 1;
            } else {
                len = 1;
            }

            if(result > 1000000000) return -1;
        }

        len = 1;
        for(int i = 1; i < A.length; i++) {
            if(A[i-1] > A[i]) {
                result += len;
                len += 1;
            } else {
                len = 1;
            }
        }

        len = 1;
        for(int i = 1; i < A.length; i++) {
            if(A[i-1] == A[i]) {
                result += len;
                len += 1;
            } else {
                len = 1;
            }
        }

        return result;

    }

    public int solution(int[] A) {
        int result= 0;
        int len = 1;
        for(int i = 1; i < A.length; i++) {
            if(A[i-1] < A[i]) {
                result += len;
                len += 1;
            } else {
                len = 1;
            }
            if(result > 1000000000) return -1;
        }

        len = 1;
        for(int i = 1; i < A.length; i++) {
            if(A[i-1] > A[i]) {
                result += len;
                len += 1;
            } else {
                len = 1;
            }
            if(result > 1000000000) return -1;
        }

        len = 1;
        for(int i = 1; i < A.length; i++) {
            if(A[i-1] == A[i]) {
                result += len;
                len += 1;
            } else {
                len = 1;
            }
            if(result > 1000000000) return -1;
        }

        return result;
    }
}
