package explicit;
// conversion of  data  from long data type to other data types
public class Long1 {

	public static void main(String[] args) {
		long a=123456;
		 
		byte b=(byte)a;
		System.out.println(b);
	   short c= (short) a;
	   System.out.println(c);
	    
	   int d= (int) a;
	   System.out.println(d);
	    float e=a;
	    System.out.println(e);
	    double f= a;
	    System.out.println(f);
	    char g=(char) a;
	    System.out.println(g);
	    //boolean h= (boolean) a;// can not convert from long to boolean
	    //System.out.println(h);
	     
	    

	}

}
