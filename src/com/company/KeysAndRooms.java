package com.company;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import jdk.internal.util.xml.impl.Pair;

import java.lang.reflect.Array;
import java.util.*;

public class KeysAndRooms  {
    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {

        Stack<Integer> keys = new Stack<>();
        keys.push(0);

        int numberOfRooms = rooms.size();
        Boolean[] visited =  new Boolean[numberOfRooms];
        Arrays.fill(visited, Boolean.FALSE);

        while(!keys.isEmpty() ){
            Integer currentKey = keys.peek();
            if(visited[currentKey]){
                keys.pop();
                continue;
            }


            List<Integer> insideKeys = rooms.get(currentKey);

            for(Integer insideKey: insideKeys){
                keys.push(insideKey);
            }
            visited[currentKey] = true;
            keys.pop();
        }

        //visited.stream().filter(x-> x == false).

        return !Arrays.stream(visited).filter(x -> x.equals(Boolean.FALSE)).findFirst().isPresent();
    }

    public static void main(String[] args){
        List<List<Integer>> rooms = new ArrayList<>();
        List<Integer> room1= new ArrayList<>();
        room1.add(1);
        rooms.add(room1);

        List<Integer> room2= new ArrayList<>();
        room2.add(2);
        rooms.add(room2);

        List<Integer> room3= new ArrayList<>();
        room3.add(3);
        rooms.add(room3);

        List<Integer> room4= new ArrayList<>();
        room4.add(3);
        rooms.add(room4);

        canVisitAllRooms(rooms);
    }
}
