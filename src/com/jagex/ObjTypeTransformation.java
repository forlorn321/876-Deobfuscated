/* Class590 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class ObjTypeTransformation {
	short[] aShortArray7785;
	int[] anIntArray7786;
	short[] aShortArray7787;
	long aLong7788;
	
	public static JS5ResourceProvider aClass461_7789;
	static Class697[] aClass697Array7790;
	public static Class147_Sub1 aClass147_Sub1_7791;

	public ObjTypeTransformation(long l, int[] is, short[] is_0_, short[] is_1_) {
		aLong7788 = 2519431825178180043L * l;
		anIntArray7786 = is;
		aShortArray7787 = is_0_;
		aShortArray7785 = is_1_;
	}

	public static boolean method7099(int i, int i_2_) {
		return (i >= -723459231 * ObjShapes.aClass606_7886.anInt7878 && i <= -723459231 * ObjShapes.aClass606_7891.anInt7878);
	}

	static final void method7100(Class668 class668, int i) {
		int i_3_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		Class683 class683;
		if (class668.aBool8548)
			class683 = class668.aClass683_8562;
		else
			class683 = class668.aClass683_8549;
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = class683.method8096(i_3_, -1, (short) -4670) ? 1 : 0;
	}

	static final void method7101(Class668 class668, byte i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class156.method1883(-323771008);
	}
}
