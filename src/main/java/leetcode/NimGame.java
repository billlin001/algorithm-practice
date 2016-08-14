package leetcode;

/**
 * Created by bill33 on 2016/7/11.
 */
public class NimGame {
    public boolean solution1(int n) {
//        if(n <= 3) return true;
//        if(n == 4) return false;

        if(n % 4 == 0) return false;
        else return true;

    }
}
