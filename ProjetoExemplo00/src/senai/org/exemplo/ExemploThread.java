package senai.org.exemplo;

import java.util.Iterator;

public class ExemploThread extends Thread {

	public static void main(String[] args) {
		
		ExemploThread et = new ExemploThread();
//		et.run();
		et.start();
		
		for (int i = 0; i < 200; i++) {
			System.out.println("main() " + i);
		}
	}

	public void run() {
		for (int i = 0; i < 200; i++) {
			System.out.println("run() " + i);
		}
	}

}
