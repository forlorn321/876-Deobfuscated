/* Class634 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class634 implements Interface75 {
	int anInt8261;
	static Class634 aClass634_8262 = new Class634(0, 0);
	public static Class634 aClass634_8263;
	public static Class634 aClass634_8264 = new Class634(2, 1);
	int anInt8265;

	static {
		aClass634_8263 = new Class634(1, 2);
	}

	Class634(int i, int i_0_) {
		anInt8261 = i * 1451863995;
		anInt8265 = i_0_ * -1188769899;
	}

	public static Class634[] method7547(byte i) {
		return (new Class634[] { aClass634_8262, aClass634_8263, aClass634_8264 });
	}

	public int method12() {
		return anInt8265 * -1831599171;
	}

	public int method73() {
		return anInt8265 * -1831599171;
	}

	public int method78() {
		return anInt8265 * -1831599171;
	}

	static final void method7548(Class668 class668, int i) {
		int i_1_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		IComponentDefinitions class251 = Class264.getIComponentDefinitions(i_1_);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 1428895931 * class251.anInt2581;
	}

	static byte[] method7549(Class461 class461, JS5ConfigGroup class648, int i, byte i_2_) {
		if (class648.getGroupSize() > 1)
			return class461.method5556(class648.getClientGroupId(i), class648.getClientFileId(i), (byte) 1);
		return class461.method5556(class648.id * 1716263195, i, (byte) 1);
	}
}
