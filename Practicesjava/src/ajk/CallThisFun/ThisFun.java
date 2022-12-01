package ajk.CallThisFun;
// This function are using 
public class ThisFun {
	int height;
	int width;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisFun TF = new ThisFun();
		TF.dispaly();
	}
	ThisFun(){
		this(10,20);//
	}
	ThisFun(int a, int b){
		height = a;
		width = b;
	}
	ThisFun(int a){
		height = width = a;
	}
	void dispaly() {
		System.out.println("Height " +height);
		System.out.println("width "+ width);
	}

}
