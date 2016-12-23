/* Class205_Sub20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class205_Sub20 extends Class205 {
	public void method2942() {
		Class684.method8107(true, -1943551684);
	}

	public void method2940(int i) {
		Class684.method8107(true, -1956840848);
	}

	Class205_Sub20(RSByteBuffer class536_sub33) {
		super(class536_sub33);
	}

	public void method2943() {
		Class684.method8107(true, -2040382859);
	}

	public static final void method9092(String string, String string_0_, int i) {
		Class106 class106 = Class536_Sub41.method9871(2077853800);
		Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.aClass414_4451, class106.aClass15_1258, 1786411778);
		if (string_0_.length() > 30)
			string_0_ = string_0_.substring(0, 30);
		class536_sub23.aClass536_Sub33_Sub2_10528.writeByte((Class555.method6802(string, 1643476799) + Class555.method6802(string_0_, 512303196)));
		class536_sub23.aClass536_Sub33_Sub2_10528.writeString(string);
		class536_sub23.aClass536_Sub33_Sub2_10528.writeString(string_0_);
		class106.method1409(class536_sub23, 973165313);
	}

	static void method9093(int i) {
		if (null != Class70.aClass536_Sub18_Sub6_754) {
			Class70.aClass536_Sub18_Sub6_754 = null;
			Class680.method8073(-1742636179 * Class283.anInt3184, -1907476413 * Class70.anInt767, Canvas_Sub1.anInt11875 * -2003725765, Class507.anInt6915 * -1785378353, (byte) 38);
		}
	}

	static void method9094(int i, int i_1_, int i_2_, int i_3_, int i_4_) {
		float f = ((float) Class542_Sub1.anInt7188 / (float) Class542_Sub1.anInt7187);
		int i_5_ = i_2_;
		int i_6_ = i_3_;
		if (f < 1.0F)
			i_6_ = (int) (f * (float) i_2_);
		else
			i_5_ = (int) ((float) i_3_ / f);
		i -= (i_2_ - i_5_) / 2;
		i_1_ -= (i_3_ - i_6_) / 2;
		Class552.anInt7416 = i * Class542_Sub1.anInt7187 / i_5_ * -406038895;
		Class391.anInt4063 = (Class542_Sub1.anInt7188 - i_1_ * Class542_Sub1.anInt7188 / i_6_) * -1712142967;
		Class542_Sub1.anInt10706 = 1619839959;
		Class542_Sub1.anInt10707 = 636642145;
		Class455.method5480((byte) 124);
	}
}
