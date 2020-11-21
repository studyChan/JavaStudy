package chap03;

public class Sample08 {

	public static void main(String[] args) {
		int a = 60;
		int b = -10;
		System.out.println("* AND");
		System.out.printf("[%32s] %d\n", Ipad(Integer.toBinaryString(a),32,"0"),a);
		System.out.printf("[%32s] %d\n", Ipad(Integer.toBinaryString(b),32,"0"),b);
		System.out.println("========================================");
		System.out.printf("[%32s] %d\n", Ipad(Integer.toBinaryString(a&b),32,"0"),a&b);
	}
	
	public static String Ipad(String context, int len, String ch) {
		String str = context;
		if(context.length() < len) {
			for (int i=0; i<len - context.length(); i++) {
				str = ch + str;
			}
		}
		return str;
	}

}
