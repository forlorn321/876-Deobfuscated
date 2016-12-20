/* Class200 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class200 implements Interface6 {
	Interface13 anInterface13_2199;
	Class205 aClass205_2200 = new Class205(100);
	static String aString2201;
	static Class527_Sub8_Sub7 aClass527_Sub8_Sub7_2202;
	public static Class50 aClass50_2203;

	void method3755() {
		synchronized (aClass205_2200) {
			aClass205_2200.method3820(-1309170087);
		}
	}

	Class527_Sub8_Sub16 method3756(int i, byte i_0_) {
		Class527_Sub8_Sub16 class527_sub8_sub16;
		synchronized (aClass205_2200) {
			class527_sub8_sub16 = (Class527_Sub8_Sub16) aClass205_2200.method3787((long) i);
			if (class527_sub8_sub16 == null) {
				class527_sub8_sub16 = new Class527_Sub8_Sub16(i);
				aClass205_2200.method3790(class527_sub8_sub16, (long) i);
			}
			if (!class527_sub8_sub16.method18383(-832740476)) {
				Class527_Sub8_Sub16 class527_sub8_sub16_1_ = null;
				return class527_sub8_sub16_1_;
			}
		}
		return class527_sub8_sub16;
	}

	void method3757(int i, int i_2_) {
		synchronized (aClass205_2200) {
			aClass205_2200.method3792(i, (byte) 48);
		}
	}

	Class200(Interface13 interface13, Class459 class459, Class459 class459_3_) {
		anInterface13_2199 = interface13;
		Class189.method3673(class459, class459_3_, 2, (byte) 43);
	}

	void method3758(int i) {
		synchronized (aClass205_2200) {
			aClass205_2200.method3820(865532961);
		}
	}

	void method3759() {
		synchronized (aClass205_2200) {
			aClass205_2200.method3793((byte) 68);
		}
	}

	void method3760() {
		synchronized (aClass205_2200) {
			aClass205_2200.method3793((byte) 83);
		}
	}

	void method3761() {
		synchronized (aClass205_2200) {
			aClass205_2200.method3793((byte) 64);
		}
	}

	void method3762(int i) {
		synchronized (aClass205_2200) {
			aClass205_2200.method3792(i, (byte) 108);
		}
	}

	void method3763() {
		synchronized (aClass205_2200) {
			aClass205_2200.method3820(385648957);
		}
	}

	void method3764(int i) {
		synchronized (aClass205_2200) {
			aClass205_2200.method3793((byte) 71);
		}
	}

	static Class282[] method3765(int i) {
		return (new Class282[] { Class282.aClass282_3191, Class282.aClass282_3193, Class282.aClass282_3192, Class282.aClass282_3194, Class282.aClass282_3190, Class282.aClass282_3195 });
	}
}
