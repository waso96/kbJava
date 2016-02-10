package kbJava;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import ec.util.MersenneTwister;

public class kbRandom {
	public String randomNumberByMath(int digit) {
//System.out.println("Long Max = "+ Long.MAX_VALUE);
//System.out.println("Double Max = "+ Double.MAX_VALUE);
		//double res = Math.random();
		long res;
		long upperbound = 0;
		long x = 9;
		for (int i = 1; i <= digit; i++) {
			upperbound = x + upperbound;
			x = (long)(9L * Math.pow(10,i));
		}

		//long lowerbound = 0;
		//res = (long)(Math.random() * ((upperbound - lowerbound) + 1) + lowerbound);
		res = (long)(Math.random() * upperbound);
//System.out.println("result = " + res);
		return String.format("%0" + digit + "d", res);
	}
	
	public String randomNumberByUtilRandom(int digit) {
		long l;
		String res;
	    Random randomGenerator = new Random();
	    l = randomGenerator.nextLong();
	    res = Long.toString(l);
	    return res.substring(res.length() - digit);
	}
	
	public String randomNumberByThreadLocalRandom(int digit) {
		long res;
		long upperbound = 0L;
		long x = 9L;
		for (int i = 1; i <= digit; i++) {
			upperbound = x + upperbound;
			x = (long)(9L * Math.pow(10,i));
		}
		res = ThreadLocalRandom.current().nextLong(upperbound);
		return String.format("%0" + digit + "d", res);
	}
	
	public String randomNumberByMersenneTwister(int digit) {
		long l;
		String res;
		MersenneTwister randomGenerator = new MersenneTwister();
	    l = randomGenerator.nextLong();
	    res = Long.toString(l);
	    return res.substring(res.length() - digit);
	}
}
