package module2.ajk.LinkedListImplimetation;

public class linkedList {
	private node start;
	private node last;
	private int count;
	public void add(Object ele) {
		if (start == null) {
			start = new node(ele);
			last = start;
		} else {
			last.next = new node(ele);
			last = last.next;
		}
	}
	class node {
		Object element;
		node  next;
		node(Object ele){
			element = ele;
			count++;
		}
	}
	public int size() {
		return count;
	}
	public Object get(int index) {
		if (index>size())
			throw new IndexOutOfBoundsException();
		node p = start;
		for (int i = 1; i <= index; i++) {
			p = p.next;
		}
		return p.element;
	}
	public String toString() {
		if (size()==0) 
			return "[]";
		String s="["+start.element;
		node p= start;
		while (p.next!=null) {
			p=p.next;
			s=s+","+p.element;
		}
		return s+"]";
	}
	
}
