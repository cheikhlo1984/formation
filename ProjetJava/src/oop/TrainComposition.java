package oop;

import java.util.LinkedList;

public class TrainComposition {
	
    private LinkedList<Integer> wagons = new LinkedList<>(); 
    
    public void attachWagonFromLeft(int wagonId) {
    	wagons.addFirst(wagonId);
    }

    public void attachWagonFromRight(int wagonId) {
    	wagons.addLast(wagonId);
    }

    public int detachWagonFromLeft() {
        if(!wagons.isEmpty()) {
        	return wagons.removeFirst();
        }
        return wagons.removeFirst();
    }

    public int detachWagonFromRight() {
    	if(!wagons.isEmpty()) {
        	return wagons.removeLast();
        }
    	return wagons.removeLast();
    }

    public static void main(String[] args) {
        TrainComposition tree = new TrainComposition();
        tree.attachWagonFromRight(7);
        tree.attachWagonFromLeft(13);
        System.out.println(tree.detachWagonFromRight()); // 7 
        System.out.println(tree.detachWagonFromLeft()); // 13
    }
}
