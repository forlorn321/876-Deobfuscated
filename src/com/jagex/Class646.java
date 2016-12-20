/* Class646 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class646 {
	Class459 aClass459_8349;
	Class205 aClass205_8350 = new Class205(2);

	void method10748(int i) {
		synchronized (aClass205_8350) {
			aClass205_8350.method3792(i, (byte) -22);
		}
	}

	void method10749(int i) {
		synchronized (aClass205_8350) {
			aClass205_8350.method3793((byte) 74);
		}
	}

	void method10750(int i) {
		synchronized (aClass205_8350) {
			aClass205_8350.method3792(i, (byte) -62);
		}
	}

	void method10751(byte i) {
		synchronized (aClass205_8350) {
			aClass205_8350.method3820(-312006809);
		}
	}

	Class646(Class459 class459) {
		aClass459_8349 = class459;
	}

	void method10752(int i, int i_0_) {
		synchronized (aClass205_8350) {
			aClass205_8350.method3792(i, (byte) -46);
		}
	}

	void method10753() {
		synchronized (aClass205_8350) {
			aClass205_8350.method3820(-492610235);
		}
	}

	static final void method10754(Class665 class665, short i) {
		int i_1_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		if (i_1_ < 0)
			i_1_ = 0;
		client.anInt11036 = 1591906877 * (i_1_ + client.anInt11117 * 2014593057);
	}

	static final int method10755(int i, int i_2_, int i_3_) {
		int i_4_ = i + 57 * i_2_;
		i_4_ = i_4_ << 13 ^ i_4_;
		int i_5_ = i_4_ * (789221 + i_4_ * i_4_ * 15731) + 1376312589 & 0x7fffffff;
		return i_5_ >> 19 & 0xff;
	}

	static final void method10756(Class665 class665, byte i) {
		Class211.method3879(-800710789);
		Class467.method7667(-791920877);
		client.aClass509_11072.method8361(-428559959);
		Class631.method10465(309418460);
		client.aBool11020 = false;
	}
}
