/* Class454 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class454 {
	int anInt5145;
	int anInt5146;
	Class463 aClass463_5147;

	int method5449() {
		return anInt5146 * 1954693485;
	}

	Class463 method5450(int i) {
		return aClass463_5147;
	}

	int method5451(byte i) {
		return anInt5146 * 1954693485;
	}

	int method5452() {
		return -372820371 * anInt5145;
	}

	Class454(RSByteBuffer class536_sub33) {
		aClass463_5147 = ((Class463) Class682.method8091(Class463.method5621(1853825189), class536_sub33.readUnsignedByte(), 1858049507));
		anInt5146 = class536_sub33.readInt() * 1923018853;
		if (Class463.aClass463_5222 != aClass463_5147)
			anInt5145 = class536_sub33.readInt() * 1345143653;
		else
			anInt5145 = anInt5146 * -1632872703;
	}

	int method5453() {
		return anInt5146 * 1954693485;
	}

	int method5454() {
		return -372820371 * anInt5145;
	}

	int method5455(byte i) {
		return -372820371 * anInt5145;
	}

	int method5456() {
		return -372820371 * anInt5145;
	}

	static final void method5457(int i, Class4 class4, int i_0_) {
		if (i != -1 && class4.method556((long) i) == null)
			class4.method560(new Class536(), (long) i);
	}

	static final void method5458(Class668 class668, int i) {
		int i_1_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		Class251 class251 = Class264.method3678(i_1_, -689214737);
		Class234 class234 = Class463.aClass234Array5227[i_1_ >> 16];
		Class21.method712(class251, class234, class668, (byte) 14);
	}

	static final void method5459(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 1063476305 * Class61.anInt687;
	}

	public static String method5460(byte[] is, byte i) {
		return Class202.method2925(is, 0, is.length, -1694498816);
	}

	public static boolean method5461(int i) {
		if (Class497.aString5550.startsWith("win"))
			return true;
		return false;
	}

	static final void method5462(Class668 class668, int i) {
		int i_2_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		Class251 class251 = Class264.method3678(i_2_, -689214737);
		Class234 class234 = Class463.aClass234Array5227[i_2_ >> 16];
		Class582.method7025(class251, class234, class668, -890742568);
	}
}
