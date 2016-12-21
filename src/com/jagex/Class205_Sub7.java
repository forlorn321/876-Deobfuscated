/* Class205_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class205_Sub7 extends Class205 {
	int anInt9876;
	int anInt9877;
	public static Class34_Sub2 aClass34_Sub2_9878;

	public void method2942() {
		Class184_Sub2.aClass211_9442.method3014(anInt9877 * 1785593429, anInt9876 * 312179505, -1738392546);
	}

	Class205_Sub7(RSByteBuffer class536_sub33) {
		super(class536_sub33);
		anInt9877 = class536_sub33.readUnsignedShort() * 1691815677;
		anInt9876 = class536_sub33.readUnsignedByte() * 1428291025;
	}

	public void method2940(int i) {
		Class184_Sub2.aClass211_9442.method3014(anInt9877 * 1785593429, anInt9876 * 312179505, -783026716);
	}

	public void method2943() {
		Class184_Sub2.aClass211_9442.method3014(anInt9877 * 1785593429, anInt9876 * 312179505, -1297401434);
	}

	static final void method9061(Class668 class668, byte i) {
		int i_0_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		Class251 class251 = Class264.method3678(i_0_, -689214737);
		Class234 class234 = Class463.aClass234Array5227[i_0_ >> 16];
		Class306.method4122(class251, class234, class668, 32206471);
	}

	static final void method9062(Class668 class668, int i) {
		throw new RuntimeException("");
	}
}
