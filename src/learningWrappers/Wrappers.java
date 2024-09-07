package learningWrappers;

public class Wrappers {

	public static void main(String[] args) {
		
		//byte
		Byte b = 100;
		Short s = 1000;
		
		//int e long
		Integer i = 10000;
		Long l = 1000000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.doubleValue());
		System.out.println(i.compareTo(100000));
		System.out.println(l.equals(i));
		
		
		// float e double
		Float f = 50.7F;
		Double d = 45.3;
		
		System.out.println(f.valueOf(f));
		System.out.println(d.sum(d, 10.7));
		

	}

}
