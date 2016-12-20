/* Class517_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaclib.nanotime.QueryPerformanceCounter;

public class Class517_Sub1 extends Class517 {
	int anInt10337;
	long aLong10338;
	long aLong10339;
	long[] aLongArray10340;
	long aLong10341 = 0L;
	int anInt10342;

	long method8615(byte i) {
		aLong10341 += method16021(-1029403794) * -6463567910603925767L;
		if (-5172823196922751557L * aLong10338 > -7490269507433264311L * aLong10341)
			return ((-5172823196922751557L * aLong10338 - aLong10341 * -7490269507433264311L) / 1000000L);
		return 0L;
	}

	void method8625(byte i) {
		aLong10339 = 0L;
		if (aLong10338 * -5172823196922751557L > -7490269507433264311L * aLong10341)
			aLong10341 += aLong10338 * 6016690417208145123L - 1L * aLong10341;
	}

	long method16020() {
		long l = QueryPerformanceCounter.nanoTime();
		long l_0_ = l - aLong10339 * -9102243253026978421L;
		aLong10339 = 3993043903810107939L * l;
		if (l_0_ > -5000000000L && l_0_ < 5000000000L) {
			aLongArray10340[201303581 * anInt10337] = l_0_;
			anInt10337 = 1982483509 * ((201303581 * anInt10337 + 1) % 10);
			if (-253533719 * anInt10342 < 1)
				anInt10342 += 1933280857;
		}
		long l_1_ = 0L;
		for (int i = 1; i <= anInt10342 * -253533719; i++)
			l_1_ += aLongArray10340[(anInt10337 * 201303581 - i + 10) % 10];
		return l_1_ / (long) (anInt10342 * -253533719);
	}

	void method8618() {
		aLong10339 = 0L;
		if (aLong10338 * -5172823196922751557L > -7490269507433264311L * aLong10341)
			aLong10341 += aLong10338 * 6016690417208145123L - 1L * aLong10341;
	}

	Class517_Sub1() {
		aLong10338 = 0L;
		aLong10339 = 0L;
		aLongArray10340 = new long[10];
		anInt10337 = 0;
		anInt10342 = 1933280857;
		aLong10338 = ((aLong10341 = QueryPerformanceCounter.nanoTime() * -6463567910603925767L) * 8914504116320776395L);
		if (0L == aLong10341 * -7490269507433264311L)
			throw new RuntimeException();
	}

	long method16021(int i) {
		long l = QueryPerformanceCounter.nanoTime();
		long l_2_ = l - aLong10339 * -9102243253026978421L;
		aLong10339 = 3993043903810107939L * l;
		if (l_2_ > -5000000000L && l_2_ < 5000000000L) {
			aLongArray10340[201303581 * anInt10337] = l_2_;
			anInt10337 = 1982483509 * ((201303581 * anInt10337 + 1) % 10);
			if (-253533719 * anInt10342 < 1)
				anInt10342 += 1933280857;
		}
		long l_3_ = 0L;
		for (int i_4_ = 1; i_4_ <= anInt10342 * -253533719; i_4_++)
			l_3_ += aLongArray10340[(anInt10337 * 201303581 - i_4_ + 10) % 10];
		return l_3_ / (long) (anInt10342 * -253533719);
	}

	int method8616(long l) {
		if (-5172823196922751557L * aLong10338 > aLong10341 * -7490269507433264311L) {
			aLong10339 += (aLong10338 * 5993604189433026193L - -4504440593954253573L * aLong10341);
			aLong10341 += aLong10338 * 6016690417208145123L - aLong10341 * 1L;
			aLong10338 += 8003372774947399539L * l;
			return 1;
		}
		int i = 0;
		do {
			i++;
			aLong10338 += 8003372774947399539L * l;
		} while (i < 10 && (-5172823196922751557L * aLong10338 < aLong10341 * -7490269507433264311L));
		if (-5172823196922751557L * aLong10338 < -7490269507433264311L * aLong10341)
			aLong10338 = aLong10341 * 8914504116320776395L;
		return i;
	}

	long method8619() {
		aLong10341 += method16021(703614572) * -6463567910603925767L;
		if (-5172823196922751557L * aLong10338 > -7490269507433264311L * aLong10341)
			return ((-5172823196922751557L * aLong10338 - aLong10341 * -7490269507433264311L) / 1000000L);
		return 0L;
	}

	long method8612() {
		aLong10341 += method16021(-1848247891) * -6463567910603925767L;
		if (-5172823196922751557L * aLong10338 > -7490269507433264311L * aLong10341)
			return ((-5172823196922751557L * aLong10338 - aLong10341 * -7490269507433264311L) / 1000000L);
		return 0L;
	}

	int method8620(long l) {
		if (-5172823196922751557L * aLong10338 > aLong10341 * -7490269507433264311L) {
			aLong10339 += (aLong10338 * 5993604189433026193L - -4504440593954253573L * aLong10341);
			aLong10341 += aLong10338 * 6016690417208145123L - aLong10341 * 1L;
			aLong10338 += 8003372774947399539L * l;
			return 1;
		}
		int i = 0;
		do {
			i++;
			aLong10338 += 8003372774947399539L * l;
		} while (i < 10 && (-5172823196922751557L * aLong10338 < aLong10341 * -7490269507433264311L));
		if (-5172823196922751557L * aLong10338 < -7490269507433264311L * aLong10341)
			aLong10338 = aLong10341 * 8914504116320776395L;
		return i;
	}

	int method8621(long l) {
		if (-5172823196922751557L * aLong10338 > aLong10341 * -7490269507433264311L) {
			aLong10339 += (aLong10338 * 5993604189433026193L - -4504440593954253573L * aLong10341);
			aLong10341 += aLong10338 * 6016690417208145123L - aLong10341 * 1L;
			aLong10338 += 8003372774947399539L * l;
			return 1;
		}
		int i = 0;
		do {
			i++;
			aLong10338 += 8003372774947399539L * l;
		} while (i < 10 && (-5172823196922751557L * aLong10338 < aLong10341 * -7490269507433264311L));
		if (-5172823196922751557L * aLong10338 < -7490269507433264311L * aLong10341)
			aLong10338 = aLong10341 * 8914504116320776395L;
		return i;
	}

	int method8622(long l) {
		if (-5172823196922751557L * aLong10338 > aLong10341 * -7490269507433264311L) {
			aLong10339 += (aLong10338 * 5993604189433026193L - -4504440593954253573L * aLong10341);
			aLong10341 += aLong10338 * 6016690417208145123L - aLong10341 * 1L;
			aLong10338 += 8003372774947399539L * l;
			return 1;
		}
		int i = 0;
		do {
			i++;
			aLong10338 += 8003372774947399539L * l;
		} while (i < 10 && (-5172823196922751557L * aLong10338 < aLong10341 * -7490269507433264311L));
		if (-5172823196922751557L * aLong10338 < -7490269507433264311L * aLong10341)
			aLong10338 = aLong10341 * 8914504116320776395L;
		return i;
	}

	long method8613() {
		return aLong10341 * -7490269507433264311L;
	}

	long method8614(byte i) {
		return aLong10341 * -7490269507433264311L;
	}

	long method16022() {
		long l = QueryPerformanceCounter.nanoTime();
		long l_5_ = l - aLong10339 * -9102243253026978421L;
		aLong10339 = 3993043903810107939L * l;
		if (l_5_ > -5000000000L && l_5_ < 5000000000L) {
			aLongArray10340[201303581 * anInt10337] = l_5_;
			anInt10337 = 1982483509 * ((201303581 * anInt10337 + 1) % 10);
			if (-253533719 * anInt10342 < 1)
				anInt10342 += 1933280857;
		}
		long l_6_ = 0L;
		for (int i = 1; i <= anInt10342 * -253533719; i++)
			l_6_ += aLongArray10340[(anInt10337 * 201303581 - i + 10) % 10];
		return l_6_ / (long) (anInt10342 * -253533719);
	}
}
