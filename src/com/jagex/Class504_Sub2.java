/* Class504_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaclib.nanotime.QueryPerformanceCounter;

public class Class504_Sub2 extends Class504 {
	long aLong10330;
	long[] aLongArray10331;
	long aLong10332;
	long aLong10333 = 0L;
	int anInt10334;
	int anInt10335;

	void method6065() {
		aLong10332 = 0L;
		if (aLong10330 * -2441806852454325681L > 8045152297213310607L * aLong10333)
			aLong10333 += 3040015846542014529L * aLong10330 - 1L * aLong10333;
	}

	long method9370(byte i) {
		long l = QueryPerformanceCounter.nanoTime();
		long l_0_ = l - 6574678695809185753L * aLong10332;
		aLong10332 = -903842561212934039L * l;
		if (l_0_ > -5000000000L && l_0_ < 5000000000L) {
			aLongArray10331[585751357 * anInt10334] = l_0_;
			anInt10334 = 1148539925 * ((1 + anInt10334 * 585751357) % 10);
			if (541715047 * anInt10335 < 1)
				anInt10335 += 1708888407;
		}
		long l_1_ = 0L;
		for (int i_2_ = 1; i_2_ <= 541715047 * anInt10335; i_2_++)
			l_1_ += aLongArray10331[(anInt10334 * 585751357 - i_2_ + 10) % 10];
		return l_1_ / (long) (anInt10335 * 541715047);
	}

	long method6075() {
		return aLong10333 * 8045152297213310607L;
	}

	int method6061(long l) {
		if (aLong10330 * -2441806852454325681L > aLong10333 * 8045152297213310607L) {
			aLong10332 += (2141058520979716711L * aLong10330 - 1635986329827723431L * aLong10333);
			aLong10333 += 3040015846542014529L * aLong10330 - 1L * aLong10333;
			aLong10330 += -5673011138310736721L * l;
			return 1;
		}
		int i = 0;
		do {
			i++;
			aLong10330 += l * -5673011138310736721L;
		} while (i < 10 && (aLong10330 * -2441806852454325681L < aLong10333 * 8045152297213310607L));
		if (-2441806852454325681L * aLong10330 < aLong10333 * 8045152297213310607L)
			aLong10330 = -2884365669434517567L * aLong10333;
		return i;
	}

	long method6062(byte i) {
		return aLong10333 * 8045152297213310607L;
	}

	long method6060(int i) {
		aLong10333 += method9370((byte) -124) * -720120978217293713L;
		if (aLong10330 * -2441806852454325681L > 8045152297213310607L * aLong10333)
			return ((aLong10330 * -2441806852454325681L - 8045152297213310607L * aLong10333) / 1000000L);
		return 0L;
	}

	void method6066() {
		aLong10332 = 0L;
		if (aLong10330 * -2441806852454325681L > 8045152297213310607L * aLong10333)
			aLong10333 += 3040015846542014529L * aLong10330 - 1L * aLong10333;
	}

	void method6064() {
		aLong10332 = 0L;
		if (aLong10330 * -2441806852454325681L > 8045152297213310607L * aLong10333)
			aLong10333 += 3040015846542014529L * aLong10330 - 1L * aLong10333;
	}

	void method6059(int i) {
		aLong10332 = 0L;
		if (aLong10330 * -2441806852454325681L > 8045152297213310607L * aLong10333)
			aLong10333 += 3040015846542014529L * aLong10330 - 1L * aLong10333;
	}

	long method9371() {
		long l = QueryPerformanceCounter.nanoTime();
		long l_3_ = l - 6574678695809185753L * aLong10332;
		aLong10332 = -903842561212934039L * l;
		if (l_3_ > -5000000000L && l_3_ < 5000000000L) {
			aLongArray10331[585751357 * anInt10334] = l_3_;
			anInt10334 = 1148539925 * ((1 + anInt10334 * 585751357) % 10);
			if (541715047 * anInt10335 < 1)
				anInt10335 += 1708888407;
		}
		long l_4_ = 0L;
		for (int i = 1; i <= 541715047 * anInt10335; i++)
			l_4_ += aLongArray10331[(anInt10334 * 585751357 - i + 10) % 10];
		return l_4_ / (long) (anInt10335 * 541715047);
	}

	Class504_Sub2() {
		aLong10330 = 0L;
		aLong10332 = 0L;
		aLongArray10331 = new long[10];
		anInt10334 = 0;
		anInt10335 = 1708888407;
		aLong10330 = ((aLong10333 = QueryPerformanceCounter.nanoTime() * -720120978217293713L) * -2884365669434517567L);
		if (aLong10333 * 8045152297213310607L == 0L)
			throw new RuntimeException();
	}

	long method6058() {
		aLong10333 += method9370((byte) -80) * -720120978217293713L;
		if (aLong10330 * -2441806852454325681L > 8045152297213310607L * aLong10333)
			return ((aLong10330 * -2441806852454325681L - 8045152297213310607L * aLong10333) / 1000000L);
		return 0L;
	}

	long method6069() {
		aLong10333 += method9370((byte) -70) * -720120978217293713L;
		if (aLong10330 * -2441806852454325681L > 8045152297213310607L * aLong10333)
			return ((aLong10330 * -2441806852454325681L - 8045152297213310607L * aLong10333) / 1000000L);
		return 0L;
	}

	long method6067() {
		aLong10333 += method9370((byte) -118) * -720120978217293713L;
		if (aLong10330 * -2441806852454325681L > 8045152297213310607L * aLong10333)
			return ((aLong10330 * -2441806852454325681L - 8045152297213310607L * aLong10333) / 1000000L);
		return 0L;
	}

	int method6071(long l) {
		if (aLong10330 * -2441806852454325681L > aLong10333 * 8045152297213310607L) {
			aLong10332 += (2141058520979716711L * aLong10330 - 1635986329827723431L * aLong10333);
			aLong10333 += 3040015846542014529L * aLong10330 - 1L * aLong10333;
			aLong10330 += -5673011138310736721L * l;
			return 1;
		}
		int i = 0;
		do {
			i++;
			aLong10330 += l * -5673011138310736721L;
		} while (i < 10 && (aLong10330 * -2441806852454325681L < aLong10333 * 8045152297213310607L));
		if (-2441806852454325681L * aLong10330 < aLong10333 * 8045152297213310607L)
			aLong10330 = -2884365669434517567L * aLong10333;
		return i;
	}

	long method6070() {
		aLong10333 += method9370((byte) -81) * -720120978217293713L;
		if (aLong10330 * -2441806852454325681L > 8045152297213310607L * aLong10333)
			return ((aLong10330 * -2441806852454325681L - 8045152297213310607L * aLong10333) / 1000000L);
		return 0L;
	}

	long method6073() {
		return aLong10333 * 8045152297213310607L;
	}

	long method6063() {
		return aLong10333 * 8045152297213310607L;
	}

	void method6057() {
		aLong10332 = 0L;
		if (aLong10330 * -2441806852454325681L > 8045152297213310607L * aLong10333)
			aLong10333 += 3040015846542014529L * aLong10330 - 1L * aLong10333;
	}

	long method6072() {
		return aLong10333 * 8045152297213310607L;
	}

	int method6074(long l) {
		if (aLong10330 * -2441806852454325681L > aLong10333 * 8045152297213310607L) {
			aLong10332 += (2141058520979716711L * aLong10330 - 1635986329827723431L * aLong10333);
			aLong10333 += 3040015846542014529L * aLong10330 - 1L * aLong10333;
			aLong10330 += -5673011138310736721L * l;
			return 1;
		}
		int i = 0;
		do {
			i++;
			aLong10330 += l * -5673011138310736721L;
		} while (i < 10 && (aLong10330 * -2441806852454325681L < aLong10333 * 8045152297213310607L));
		if (-2441806852454325681L * aLong10330 < aLong10333 * 8045152297213310607L)
			aLong10330 = -2884365669434517567L * aLong10333;
		return i;
	}
}
