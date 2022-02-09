import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Java {
	static PrintWriter p;
	public void m1(int a) {	}
	public static void main(int[] args) {
		p.println(20);
	}
	public static void main(String[] dinesh) {
		List<Integer> li = new ArrayList<>();
		long a =Runtime.getRuntime().totalMemory();
		long b =Runtime.getRuntime().freeMemory();
		long c =Runtime.getRuntime().maxMemory();
		long startTime = System.currentTimeMillis();
		p = new PrintWriter(System.out);
		for (int i = 0; i < 1000000; i++) {
			p.println("dinu");
			li.add(i);
		}
		long endTime = System.currentTimeMillis();
		p.println(li.size());
		p.println(endTime-startTime+" milliseconds");
		p.println(a);
		p.println(b);
		p.println(c);
		p.println(Runtime.getRuntime().totalMemory());
		p.println(Runtime.getRuntime().freeMemory());
		p.println(Runtime.getRuntime().maxMemory());
		//int[] arr = {1, 2 ,3 ,4, 5, 6};
		//Java.main(arr);
		p.close();
	}
}
