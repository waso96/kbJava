package kbJava;

public class kbMain {

	public static void main(String[] args) {
System.out.println("Start..");
		kbRandom kbr = new kbRandom();
		for (int i=1; i <= 10; i++) {
			System.out.println(i + " result = " + kbr.randomNumberByUtilRandom(15));
		}
System.out.println("Stop..");



//kbDerby
/*
System.out.println("Start..");
	kbDerby kbd = new kbDerby();
	kbd.callDerby(args);
System.out.println("Stop..");	
*/


//kbFiles
/*		
System.out.println("Start..");
		kbFiles kbf = new kbFiles();
		kbf.writeBufferedFile();
System.out.println("Stop..");
*/
	}

}
