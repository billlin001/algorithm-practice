package leetcode;

import java.util.*;

/**
 * Created by bill33 on 2016/8/14.
 */
public class TopKFrequentElements {
    private static class ItemWithCount{
        private Integer num;
        private Integer count;

        public ItemWithCount(Integer num, Integer count) {
            this.num = num;
            this.count = count;
        }

        public Integer getNum() {
            return num;
        }

        public void setNum(Integer num) {
            this.num = num;
        }

        public Integer getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }
    }

    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numsCountMap = new HashMap<>();
        for (int item : nums) {
            Integer count = numsCountMap.get(item);
            if(count == null) numsCountMap.put(item, 1);
            else numsCountMap.put(item, ++count);
        }

        PriorityQueue<ItemWithCount> priorityQueue = new PriorityQueue<>((itemA, itemB) -> itemB.getCount() - itemA.getCount());
        for(Map.Entry<Integer, Integer> item : numsCountMap.entrySet()) {
            priorityQueue.offer(new ItemWithCount(item.getKey(), item.getValue()));
        }

        List<Integer> results = new ArrayList<>();
        for(int i=0; i<k; i++) {
            if(priorityQueue.isEmpty()) break;
            results.add(priorityQueue.poll().getNum());
        }
        return results;
    }
}
