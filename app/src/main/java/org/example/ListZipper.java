package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ListZipper {
    static <T> List<T> zip (List<T> list1, List<T> list2){
        int size = 0;
        List<T> result = new ArrayList<T>();

        //if list1 is bigger than list2, then size equals list2
        if(list1.size()>list2.size()){
            size = list2.size();
        }
        //if list2 is bigger than list1, then size equals list1
        else {
            size = list1.size();
        }
        // Use the size of the smallest list to know when to stop
        for(int i=0; i<size; i++){
            // add from list 1, then from list 2
            result.add(list1.get(i));
            result.add(list2.get(i));
        }
        if(list1.size()!=size){
            result.addAll(list1.subList(size, list1.size()));
        }
        else if(list2.size()!=size){
            result.addAll(list2.subList(size, list2.size()));
        }
        return result;
    }

    static <T> HashMap<String, T> hashmapify (List<String> list1, List<T> list2){
        HashMap<String, T> result = new HashMap<String, T>(list1.size());

        if(list1.size()!=list2.size()){
            throw new IllegalArgumentException("list1 has to be equal to list2 size");
        }

        for(int i=0; i<list1.size(); i++){
            result.put(list1.get(i), list2.get(i));
        }

        return result;
    }
}
