//package com.company;
//
//public class longestCommonPrefix  {
//    public String longestCommonPrefix(String[] strs) {
//        String ans = "";
//
//        //["flower","flow","flight"]
//        boolean allEmpty = false;
//        for(int index = 0; ; index++){
//
//            char prev = '\0';
//            boolean ansNotPossibleAfterThisIndex = false;
//
//            for(int currentStr = 0; currentStr < strs.length; currentStr++){
//                if(strs[currentStr].length() > index){
//                    ansNotPossibleAfterThisIndex = true;
//                    break;
//                }
//
//                if(prev == '\0'){
//                    prev = strs[currentStr].charAt(index);
//                }else if(prev != strs[currentStr].charAt(index)){
//                    ansNotPossibleAfterThisIndex = true;
//                    break;
//                }
//
//            }
//            if(ansNotPossibleAfterThisIndex == false){
//                ans = ans + prev;
//            }else {
//                break;
//            }
//
//        }
//
//
//}