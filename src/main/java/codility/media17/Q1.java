package codility.media17;

import java.util.*;

public class Q1 {

    public int solution(String S) {
        String[] sentenses = S.split("[.|?|!]+");

        int maxWordSize = 0;
        for(String sentense : sentenses) {
            int wordSize = getWordSize(sentense.split(" +"));
            if(maxWordSize < wordSize) {
                maxWordSize = wordSize;
            }
        }

        return maxWordSize;
    }

    private static int getWordSize(String[] words) {
        List<String> ans = new ArrayList<String>();
        for(String item : words) {
            if(item.length() > 0) {
                ans.add(item);
            }
        }

        return ans.size();
    }
}
