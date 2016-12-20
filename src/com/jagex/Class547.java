/* Class547 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class547 {
	Class205 aClass205_7266 = new Class205(20);
	Class459 aClass459_7267;
	public static int anInt7268;

	void method9061(int i) {
		synchronized (aClass205_7266) {
			aClass205_7266.method3792(i, (byte) 61);
		}
	}

	void method9062(int i) {
		synchronized (aClass205_7266) {
			aClass205_7266.method3793((byte) 86);
		}
	}

	void method9063() {
		synchronized (aClass205_7266) {
			aClass205_7266.method3820(-345571643);
		}
	}

	void method9064(int i) {
		synchronized (aClass205_7266) {
			aClass205_7266.method3820(718854146);
		}
	}

	void method9065() {
		synchronized (aClass205_7266) {
			aClass205_7266.method3793((byte) 29);
		}
	}

	void method9066() {
		synchronized (aClass205_7266) {
			aClass205_7266.method3793((byte) 7);
		}
	}

	Class547(Class459 class459) {
		aClass459_7267 = class459;
	}

	void method9067() {
		synchronized (aClass205_7266) {
			aClass205_7266.method3793((byte) 25);
		}
	}

	void method9068(int i, int i_0_) {
		synchronized (aClass205_7266) {
			aClass205_7266.method3792(i, (byte) -37);
		}
	}

	void method9069(int i) {
		synchronized (aClass205_7266) {
			aClass205_7266.method3792(i, (byte) 7);
		}
	}

	void method9070() {
		synchronized (aClass205_7266) {
			aClass205_7266.method3793((byte) 127);
		}
	}

	void method9071() {
		synchronized (aClass205_7266) {
			aClass205_7266.method3820(141902418);
		}
	}

	void method9072() {
		synchronized (aClass205_7266) {
			aClass205_7266.method3820(925442135);
		}
	}

	static final void method9073(Class665 class665, byte i) {
		int i_1_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_1_, 152289159);
		Class240 class240 = Class183.aClass240Array2100[i_1_ >> 16];
		Class296.method5503(class243, class240, class665, Class237.aClass237_2386, (byte) 1);
	}

	static final void method9075(Class665 class665, int i) {
		if (client.anInt11118 * -1786224855 >= 5 && -1786224855 * client.anInt11118 <= 9)
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 1;
		else
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 0;
	}
}
