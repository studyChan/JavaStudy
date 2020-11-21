package chap03;

public class Sample14 {
	public static void main(String[] args) {
	int a = 60;
	int b = -10;
	System.out.println("* >>>");
	System.out.printf("[%32s] >>> 4 [%32s] = %d\n", Ipad(Integer.toBinaryString(a),32,"0"),Ipad(Integer.toBinaryString(a>>>4),32,"0"),a>>>4);
	System.out.printf("[%32s] >>> 4 [%32s] = %d\n", Ipad(Integer.toBinaryString(b),32,"0"),Ipad(Integer.toBinaryString(b>>>4),32,"0"),b>>>4);
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
