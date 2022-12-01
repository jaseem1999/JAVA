package module2.ajk.ArrayListImplimentation.sample;


public class array {
	int p = 0;
	Object arr[] = new Object[3];//Declared array
	public void add(Object ele) {//add elements 
		if (p>=arr.length)
			increase();
		arr[p++]= ele;
	}
	public void increase() {
		int newSize = arr.length+(arr.length/2);
		Object []newArr = new Object[newSize];
		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i]; 
		}
		arr = newArr;
	}
	
	public Object get(int index) {
		if (index >= p) {
			throw new IndexOutOfBoundsException();
		}
		return arr[index];
	}
	public int size() {
		return p;
	}
	public String toString() {
		if(size() == 0) {
			return "[]";
		}
		String s1 = "["+get(0);
		for (int i = 1; i < size(); i++) {
			s1=s1+","+get(i);
			
		}
		s1=s1+"]";
		return s1;
	}
}
