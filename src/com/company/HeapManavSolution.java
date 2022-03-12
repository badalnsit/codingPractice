package com.company;

import java.util.*;

public class HeapManavSolution {

        public int[] topKFrequent(int[] nums, int k) {

            Map<Integer,Integer> map= new HashMap<>();
            for (int num: nums){
                map.put(num, map.getOrDefault(num,0)+1);
            }

            PriorityQueue<Map.Entry<Integer,Integer>> maxHeap =new  PriorityQueue<>((a, b)-> (b.getValue() - a.getValue()));

            for (Map.Entry<Integer,Integer> entry: map.entrySet()){
                maxHeap.add(entry);
            }


            List<Integer> result= new ArrayList<>();

            while (k>0 && !maxHeap.isEmpty()) {

                result.add(maxHeap.poll().getKey());
                k--;
            }

            return result.stream().mapToInt(i->i).toArray();


        }

    public static void main(String[] args) {

    }


}
