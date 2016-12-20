/* Class517_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class517_Sub2 extends Class517 {
	long aLong10360 = 0L;
	long aLong10361 = 0L;
	long aLong10362 = 0L;
	long[] aLongArray10363 = new long[10];
	int anInt10364 = 0;
	int anInt10365 = 386147613;

	long method16041() {
		long l = System.nanoTime();
		long l_0_ = l - aLong10362 * 8202444403260419703L;
		aLong10362 = l * 2845899674066733895L;
		if (l_0_ > -5000000000L && l_0_ < 5000000000L) {
			aLongArray10363[-1056491405 * anInt10364] = l_0_;
			anInt10364 = (anInt10364 * -1056491405 + 1) % 10 * -1033753413;
			if (249152821 * anInt10365 < 1)
				anInt10365 += 386147613;
		}
		long l_1_ = 0L;
		for (int i = 1; i <= 249152821 * anInt10365; i++)
			l_1_ += aLongArray10363[(anInt10364 * -1056491405 - i + 10) % 10];
		return l_1_ / (long) (anInt10365 * 249152821);
	}

	void method8625(byte i) {
		aLong10362 = 0L;
		if (-4337326713238019043L * aLong10361 > aLong10360 * -423039720136535921L)
			aLong10360 += 868135992249695891L * aLong10361 - 1L * aLong10360;
	}

	Class517_Sub2() {
		aLong10360 = System.nanoTime() * -8543369479175958929L;
		aLong10361 = System.nanoTime() * -8316072411387052491L;
	}

	long method16042() {
		long l = System.nanoTime();
		long l_2_ = l - aLong10362 * 8202444403260419703L;
		aLong10362 = l * 2845899674066733895L;
		if (l_2_ > -5000000000L && l_2_ < 5000000000L) {
			aLongArray10363[-1056491405 * anInt10364] = l_2_;
			anInt10364 = (anInt10364 * -1056491405 + 1) % 10 * -1033753413;
			if (249152821 * anInt10365 < 1)
				anInt10365 += 386147613;
		}
		long l_3_ = 0L;
		for (int i = 1; i <= 249152821 * anInt10365; i++)
			l_3_ += aLongArray10363[(anInt10364 * -1056491405 - i + 10) % 10];
		return l_3_ / (long) (anInt10365 * 249152821);
	}

	long method8614(byte i) {
		return -423039720136535921L * aLong10360;
	}

	long method16043() {
		long l = System.nanoTime();
		long l_4_ = l - aLong10362 * 8202444403260419703L;
		aLong10362 = l * 2845899674066733895L;
		if (l_4_ > -5000000000L && l_4_ < 5000000000L) {
			aLongArray10363[-1056491405 * anInt10364] = l_4_;
			anInt10364 = (anInt10364 * -1056491405 + 1) % 10 * -1033753413;
			if (249152821 * anInt10365 < 1)
				anInt10365 += 386147613;
		}
		long l_5_ = 0L;
		for (int i = 1; i <= 249152821 * anInt10365; i++)
			l_5_ += aLongArray10363[(anInt10364 * -1056491405 - i + 10) % 10];
		return l_5_ / (long) (anInt10365 * 249152821);
	}

	void method8618() {
		aLong10362 = 0L;
		if (-4337326713238019043L * aLong10361 > aLong10360 * -423039720136535921L)
			aLong10360 += 868135992249695891L * aLong10361 - 1L * aLong10360;
	}

	long method8619() {
		aLong10360 += method16044(847392694) * -8543369479175958929L;
		if (-4337326713238019043L * aLong10361 > -423039720136535921L * aLong10360)
			return ((-4337326713238019043L * aLong10361 - aLong10360 * -423039720136535921L) / 1000000L);
		return 0L;
	}

	int method8616(long l) {
		if (-4337326713238019043L * aLong10361 > -423039720136535921L * aLong10360) {
			aLong10362 += (-7921076322503261429L * aLong10361 - -8773933475207349079L * aLong10360);
			aLong10360 += aLong10361 * 868135992249695891L - aLong10360 * 1L;
			aLong10361 += l * -8316072411387052491L;
			return 1;
		}
		int i = 0;
		do {
			i++;
			aLong10361 += l * -8316072411387052491L;
		} while (i < 10 && (aLong10361 * -4337326713238019043L < -423039720136535921L * aLong10360));
		if (aLong10361 * -4337326713238019043L < aLong10360 * -423039720136535921L)
			aLong10361 = 7505625114204737435L * aLong10360;
		return i;
	}

	long method16044(int i) {
		long l = System.nanoTime();
		long l_6_ = l - aLong10362 * 8202444403260419703L;
		aLong10362 = l * 2845899674066733895L;
		if (l_6_ > -5000000000L && l_6_ < 5000000000L) {
			aLongArray10363[-1056491405 * anInt10364] = l_6_;
			anInt10364 = (anInt10364 * -1056491405 + 1) % 10 * -1033753413;
			if (249152821 * anInt10365 < 1)
				anInt10365 += 386147613;
		}
		long l_7_ = 0L;
		for (int i_8_ = 1; i_8_ <= 249152821 * anInt10365; i_8_++)
			l_7_ += (aLongArray10363[(anInt10364 * -1056491405 - i_8_ + 10) % 10]);
		return l_7_ / (long) (anInt10365 * 249152821);
	}

	long method8615(byte i) {
		aLong10360 += method16044(1348909884) * -8543369479175958929L;
		if (-4337326713238019043L * aLong10361 > -423039720136535921L * aLong10360)
			return ((-4337326713238019043L * aLong10361 - aLong10360 * -423039720136535921L) / 1000000L);
		return 0L;
	}

	int method8622(long l) {
		if (-4337326713238019043L * aLong10361 > -423039720136535921L * aLong10360) {
			aLong10362 += (-7921076322503261429L * aLong10361 - -8773933475207349079L * aLong10360);
			aLong10360 += aLong10361 * 868135992249695891L - aLong10360 * 1L;
			aLong10361 += l * -8316072411387052491L;
			return 1;
		}
		int i = 0;
		do {
			i++;
			aLong10361 += l * -8316072411387052491L;
		} while (i < 10 && (aLong10361 * -4337326713238019043L < -423039720136535921L * aLong10360));
		if (aLong10361 * -4337326713238019043L < aLong10360 * -423039720136535921L)
			aLong10361 = 7505625114204737435L * aLong10360;
		return i;
	}

	long method8613() {
		return -423039720136535921L * aLong10360;
	}

	int method8621(long l) {
		if (-4337326713238019043L * aLong10361 > -423039720136535921L * aLong10360) {
			aLong10362 += (-7921076322503261429L * aLong10361 - -8773933475207349079L * aLong10360);
			aLong10360 += aLong10361 * 868135992249695891L - aLong10360 * 1L;
			aLong10361 += l * -8316072411387052491L;
			return 1;
		}
		int i = 0;
		do {
			i++;
			aLong10361 += l * -8316072411387052491L;
		} while (i < 10 && (aLong10361 * -4337326713238019043L < -423039720136535921L * aLong10360));
		if (aLong10361 * -4337326713238019043L < aLong10360 * -423039720136535921L)
			aLong10361 = 7505625114204737435L * aLong10360;
		return i;
	}

	long method16045() {
		long l = System.nanoTime();
		long l_9_ = l - aLong10362 * 8202444403260419703L;
		aLong10362 = l * 2845899674066733895L;
		if (l_9_ > -5000000000L && l_9_ < 5000000000L) {
			aLongArray10363[-1056491405 * anInt10364] = l_9_;
			anInt10364 = (anInt10364 * -1056491405 + 1) % 10 * -1033753413;
			if (249152821 * anInt10365 < 1)
				anInt10365 += 386147613;
		}
		long l_10_ = 0L;
		for (int i = 1; i <= 249152821 * anInt10365; i++)
			l_10_ += aLongArray10363[(anInt10364 * -1056491405 - i + 10) % 10];
		return l_10_ / (long) (anInt10365 * 249152821);
	}

	long method8612() {
		aLong10360 += method16044(-1165515326) * -8543369479175958929L;
		if (-4337326713238019043L * aLong10361 > -423039720136535921L * aLong10360)
			return ((-4337326713238019043L * aLong10361 - aLong10360 * -423039720136535921L) / 1000000L);
		return 0L;
	}

	int method8620(long l) {
		if (-4337326713238019043L * aLong10361 > -423039720136535921L * aLong10360) {
			aLong10362 += (-7921076322503261429L * aLong10361 - -8773933475207349079L * aLong10360);
			aLong10360 += aLong10361 * 868135992249695891L - aLong10360 * 1L;
			aLong10361 += l * -8316072411387052491L;
			return 1;
		}
		int i = 0;
		do {
			i++;
			aLong10361 += l * -8316072411387052491L;
		} while (i < 10 && (aLong10361 * -4337326713238019043L < -423039720136535921L * aLong10360));
		if (aLong10361 * -4337326713238019043L < aLong10360 * -423039720136535921L)
			aLong10361 = 7505625114204737435L * aLong10360;
		return i;
	}

	public static int[][] method16046(int i, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, float f, boolean bool, byte i_16_) {
		int[][] is = new int[i_11_][i];
		Class527_Sub35_Sub1 class527_sub35_sub1 = new Class527_Sub35_Sub1();
		class527_sub35_sub1.aBool11845 = bool;
		class527_sub35_sub1.anInt11841 = 2136005631 * i_13_;
		class527_sub35_sub1.anInt11842 = 1166412227 * i_14_;
		class527_sub35_sub1.anInt11843 = i_15_ * -4578145;
		class527_sub35_sub1.anInt11844 = -2067227147 * (int) (4096.0F * f);
		class527_sub35_sub1.method18431((byte) -44);
		Class40.method1162(i, i_11_, 153371143);
		for (int i_17_ = 0; i_17_ < i_11_; i_17_++)
			class527_sub35_sub1.method18429(i_17_, is[i_17_], (byte) 0);
		return is;
	}
}
