package com.me;

public class Main {

    public static void main(String[] args) {
		byte byteValue = 25;
		short shortValue = 235;
		int intValue = 1025;
		long longTotal = 50_000L + 10L * (byteValue + shortValue + intValue);
        System.out.println(longTotal);

        short shortTotal = (short) (1000 + 10 * (byteValue + shortValue + intValue));
    }
}
