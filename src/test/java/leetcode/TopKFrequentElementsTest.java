package leetcode;

import org.hamcrest.Matchers;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;


/**
 * Created by bill33 on 2016/8/14.
 */
public class TopKFrequentElementsTest {

    @Test
    public void testTopKFrequent() throws Exception {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;

        TopKFrequentElements target = new TopKFrequentElements();
        List<Integer> actuals = target.topKFrequent(nums, k);
        List<Integer> expectes = new ArrayList<>(Arrays.asList(1, 2));

        System.out.println(actuals);
        System.out.println(expectes);
        assertEquals(expectes.size(), actuals.size());
        assertThat(actuals, is(containsInAnyOrder(1, 2)));
    }
}