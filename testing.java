
public class testing {
	public static void main(String[] args) {
		System.out.println("this testing");
	String str = "hello world, well come the earth ?";
	System.out.println(str);
	
	System.out.println(str.replaceAll("\\s+",""));
		
	System.out.println(str.replaceAll(" ", ""));
	System.out.println(str.replaceAll("[,;\\s;?]", ""));
	System.out.println(str.replaceAll("\\s+", ""));
	}

}
