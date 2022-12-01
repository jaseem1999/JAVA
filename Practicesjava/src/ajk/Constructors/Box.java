package ajk.Constructors;
//Constructor overloading 
public class Box {
	int height;
	int width;
	int length;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b1= new Box();
		Box b2= new Box(20,10,30);
		Box b3= new Box(23);
		System.out.println();
		b1.display();
		System.out.println();
		b2.display();
		System.out.println();
		b3.display();
	}
    Box(){
    	System.out.println("Hello");
    }
    Box(int h , int w, int l){
    	height = h;
    	width = w;
    	length = l;
    }
    Box(int a){
    	System.out.println("Number of box :"+a);
    }
    void display() {
    	System.out.println("Height of box :"+ height);
    	System.out.println("Width of box :"+ width);
    	System.out.println("Length of box :"+ length);
    }
    
}
