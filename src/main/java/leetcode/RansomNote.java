package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 *  Given  an  arbitrary  ransom  note  string  and  another  string  containing  letters from  all  the  magazines,  write  a  function  that  will  return  true  if  the  
 * ransom   note  can  be  constructed  from  the  magazines ;  otherwise,  it  will  return  false.   
 * Each  letter  in  the  magazine  string  can  only  be  used  once  in  your  ransom  note.
 *
 * Note:
 * You may assume that both strings contain only lowercase letters.
 *
 * canConstruct("a", "b") -> false
 * canConstruct("aa", "ab") -> false
 * canConstruct("aa", "aab") -> true
 *
 * @url https://leetcode.com/problems/ransom-note/
 * Created by bill33 on 2016/8/14.
 */
public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] ransomNoteChars = ransomNote.toCharArray();
        char[] magzineChars = magazine.toCharArray();

        Map<Character, Integer> magazineCharCountMap = new HashMap<>();
        for (char item : magzineChars) {
            Integer count = magazineCharCountMap.get(item);
            if(count == null) magazineCharCountMap.put(item, 1);
            else magazineCharCountMap.put(item, ++count);
        }

        for (char item : ransomNoteChars) {
            Integer count = magazineCharCountMap.get(item);
            if(count == null || count == 0) return false;
            else magazineCharCountMap.put(item, --count);
        }


        return true;
    }
}
