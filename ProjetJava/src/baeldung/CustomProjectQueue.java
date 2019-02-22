package baeldung;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.LinkedList;

public class CustomProjectQueue<E> extends AbstractQueue<E>{

	private LinkedList<E> elements;
	
	public CustomProjectQueue() {
		this.elements = new LinkedList<>();
	}
	
	@Override
	public boolean offer(E e) {
		if (e == null) return false;
		elements.add(e);
		return true;
	}

	@Override
	public E poll() {
	    Iterator<E> iter = elements.iterator();
	    E e = iter.next();
	    if (e != null) {
	    	iter.remove();
	    	return e;
	    }
		return null;
	}

	@Override
	public E peek() {
		return elements.getFirst();
	}

	@Override
	public Iterator<E> iterator() {
		return elements.iterator();
	}

	@Override
	public int size() {
		return this.elements.size();
	}

}
