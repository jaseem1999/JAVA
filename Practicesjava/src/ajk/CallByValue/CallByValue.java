package ajk.CallByValue;
//Call by value and call by reference 
public class CallByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int x = 10;// in the call by value time x value is dose not changing 
                   // But Call by reference time there is not passing the value 
        		   // Address is passing that time the x value also changing
        m1(x);	
       
	}
	static void m1(int a) {
		a = 15;
		System.out.println(a);
	}

}
