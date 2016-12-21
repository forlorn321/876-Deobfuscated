/* Class495 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

final class Class495 implements Interface11 {
	public Object method69(RSByteBuffer class536_sub33) {
		return class536_sub33.readString((byte) 92);
	}

	public Object method68(RSByteBuffer class536_sub33, short i) {
		return class536_sub33.readString((byte) 81);
	}

	static final void method5994(Class668 class668, int i) {
		int i_0_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		Class251 class251 = Class264.method3678(i_0_, -689214737);
		Class234 class234 = Class463.aClass234Array5227[i_0_ >> 16];
		Class4.method572(class251, class234, class668, 2114632494);
	}

	static final void method5995(Class668 class668, byte i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class497.aString5550.startsWith("linux") ? 1 : 0;
	}

	static final void method5996(Class668 class668, int i) {
		int i_1_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		Class251 class251 = Class264.method3678(i_1_, -689214737);
		Class234 class234 = Class463.aClass234Array5227[i_1_ >> 16];
		Class536_Sub42.method9872(class251, class234, class668, 391030096);
	}

	static final void method5997(Class668 class668, byte i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		Class251 class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class642.method7733(class251, class234, class668, 1215376741);
	}
}
