/* Class145 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Frame;

public class Class145 {
	public String aString1682;
	public static final int anInt1683 = 4318;
	public static final int anInt1684 = 4098;
	public static final int anInt1685 = 32902;
	public static final int anInt1686 = -1;
	public int anInt1687;
	public long aLong1688;
	public int anInt1689;
	public String aString1690;
	public static final int anInt1691 = 0;
	protected static Frame aFrame1692;

	public Class145(int i, String string, int i_0_, String string_1_, long l, boolean bool) {
		anInt1687 = i * -2087550891;
		aString1682 = string;
		anInt1689 = 221479383 * i_0_;
		aString1690 = string_1_;
		aLong1688 = 6214799672619585139L * l;
	}

	static final void method1797(Class668 class668, int i) {
		int i_2_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		IComponentDefinitions class251 = Class264.getIComponentDefinitions(i_2_);
		Class234 class234 = Class463.aClass234Array5227[i_2_ >> 16];
		Class567.method6915(class251, class234, class668, -1083906987);
	}

	static final void method1798(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
	}

	static int method1799(Class603_Sub1 class603_sub1, Class603_Sub1 class603_sub1_3_, int i, boolean bool, int i_4_, boolean bool_5_, byte i_6_) {
		int i_7_ = Class577.method7005(class603_sub1, class603_sub1_3_, i, bool, (byte) 16);
		if (0 != i_7_) {
			if (bool)
				return -i_7_;
			return i_7_;
		}
		if (i_4_ == -1)
			return 0;
		int i_8_ = Class577.method7005(class603_sub1, class603_sub1_3_, i_4_, bool_5_, (byte) 16);
		if (bool_5_)
			return -i_8_;
		return i_8_;
	}

	public static ObjShapes[] method1800(byte i) {
		return (new ObjShapes[] { ObjShapes.aClass606_7879, ObjShapes.aClass606_7894, ObjShapes.aClass606_7881, ObjShapes.aClass606_7876, ObjShapes.aClass606_7873, ObjShapes.aClass606_7892, ObjShapes.aClass606_7886, ObjShapes.aClass606_7883, ObjShapes.aClass606_7880, ObjShapes.aClass606_7877, ObjShapes.aClass606_7882, ObjShapes.aClass606_7884, ObjShapes.aClass606_7874, ObjShapes.aClass606_7890, ObjShapes.aClass606_7893, ObjShapes.aClass606_7875, ObjShapes.aClass606_7889, ObjShapes.aClass606_7888,
				ObjShapes.aClass606_7891, ObjShapes.aClass606_7896, ObjShapes.aClass606_7895, ObjShapes.aClass606_7885, ObjShapes.aClass606_7887 });
	}

	public static void method1801(Player class649_sub1_sub5_sub1_sub2, byte i) {
		Class536_Sub3 class536_sub3 = (Class536_Sub3) (Class536_Sub3.aClass4_10366.method556((long) (class649_sub1_sub5_sub1_sub2.anInt11889 * 1710020215)));
		if (null == class536_sub3)
			Class76.method1155(class649_sub1_sub5_sub1_sub2.aByte10839, class649_sub1_sub5_sub1_sub2.screenX[0], class649_sub1_sub5_sub1_sub2.screenY[0], 0, null, null, class649_sub1_sub5_sub1_sub2, 352877239);
		else
			class536_sub3.method9392(-66106772);
	}
}
