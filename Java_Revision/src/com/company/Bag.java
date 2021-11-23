package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Bag<E> {

    private Map<E, Integer> elements = new HashMap<>();

    public void add(E  element){
        if( elements.containsKey(element)){
            elements.put(element, elements.get(element) + 1);
        }else{
            elements.put(element, 1);
        }
    }

    public void remove(E element){
        if(elements.containsKey(element)){
            int val = elements.get(element);
            if( val == 1){
                elements.remove(element); // removing the last occurrence
            }else {
                elements.put(element, val -1);
            }
        }
    }

    public void clear(){
        elements.clear();
    }
}
