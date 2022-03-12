//package com.company;
//
//// https://leetcode.com/problems/top-k-frequent-elements/
//
//import java.util.*;
//
//public class TopKFrequentElements {
//
//        class FrequencyObj implements Comparable<FrequencyObj>{
//            public Integer num;
//            public Integer frequency;
//
//            public int compareTo(FrequencyObj fo){
//                return this.frequency - fo.frequency;
//            }
//
//            public FrequencyObj(Integer num, Integer frequency){
//                this.num = num;
//                this.frequency = frequency;
//            }
//
//        }
//
//        public int[] topKFrequent(int[] nums, int k) {
//
//            Map<Integer, Integer> frequencyMapOfNums = new HashMap<>();
//
//            for(int i = 0;i < nums.length; i++){
//                if(!frequencyMapOfNums.containsKey(nums[i])){
//                    frequencyMapOfNums.put(nums[i], 1);
//                }else{
//                    frequencyMapOfNums.put(nums[i], frequencyMapOfNums.get(nums[i])++);
//                }
//            }
//
//            Queue<FrequencyObj> frequencyPQ = new PriorityQueue<>();
//
//            for(Map.Entry<Integer, Integer> entrySet : frequencyMapOfNums.entrySet()){
//                frequencyPQ.add(new FrequencyObj(entrySet.getKey(), entrySet.getValue()));
//            }
//
//            List<Integer> output = new ArrayList<>();
//
//            while(k > 0 && !frequencyPQ.isEmpty()){
//                output.add(frequencyPQ.remove().num);
//            }
//
//            return output.stream().mapToInt(i->i).toArray();
//        }
//
//
//
//
//
//    }
