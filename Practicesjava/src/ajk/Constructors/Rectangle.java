package ajk.Constructors;
//Copy Constructor
public class Rectangle {
	int length;
	int breadth;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 =new Rectangle();
		Rectangle r2 =new Rectangle(10,20);
		Rectangle r3 =new Rectangle(r1);
		Rectangle r4 =new Rectangle(r2);
		r1.dispaly();
		System.out.println();
		r2.dispaly();
		System.out.println();
		r3.dispaly();
		System.out.println();
		r4.dispaly();
		System.out.println();
	}
    Rectangle(){
    	
    }
	Rectangle(int l, int b){
		length =l;
		breadth =b;
	}
	Rectangle(Rectangle r){
		length = r.length;
		breadth = r.breadth;
	}
	void dispaly() {
		System.out.println("Length :"+length);
		System.out.println("Breadth :"+breadth);
	}
}
