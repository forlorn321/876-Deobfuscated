/* Class205_Sub22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class205_Sub22 extends Class205 {
	int anInt9959;
	int anInt9960;
	int anInt9961;
	int anInt9962;
	int anInt9963;

	public void method2942() {
		Class193.aClass190Array2179[1305556819 * anInt9961].method2816(anInt9963 * 1185467057, anInt9960 * 813274235, -1038970691 * anInt9962, anInt9959 * 1478933825, (byte) 49);
	}

	public void method2940(int i) {
		Class193.aClass190Array2179[1305556819 * anInt9961].method2816(anInt9963 * 1185467057, anInt9960 * 813274235, -1038970691 * anInt9962, anInt9959 * 1478933825, (byte) 89);
	}

	public void method2943() {
		Class193.aClass190Array2179[1305556819 * anInt9961].method2816(anInt9963 * 1185467057, anInt9960 * 813274235, -1038970691 * anInt9962, anInt9959 * 1478933825, (byte) 107);
	}

	Class205_Sub22(RSByteBuffer class536_sub33) {
		super(class536_sub33);
		anInt9961 = class536_sub33.readUnsignedShort((short) -16543) * -1559616293;
		int i = class536_sub33.readInt(-627126422);
		anInt9960 = -762107213 * (i >>> 16);
		anInt9962 = 1363798677 * (i & 0xffff);
		anInt9963 = class536_sub33.readUnsignedByte(-922954581) * 433143377;
		anInt9959 = class536_sub33.readUnsignedByte(-1676163834) * 1150079681;
	}

	static final void method9097(Class668 class668, int i) {
		int i_0_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class465_Sub1.aClass96_10352.method1299(i_0_, 347819214);
	}

	public static final void method9098(int i) {
		String string = (Class462.aString5220 != null ? Class462.aString5220 : Class206.method2960(548551276));
		Class380.method4809(string, false, client.aBool11228, 1733697821);
	}

	static final void method9099(int i) {
		int[] is = Class95.anIntArray1157;
		for (int i_1_ = 0; i_1_ < Class95.anInt1156 * -1482773169; i_1_++) {
			Class649_Sub1_Sub5_Sub1_Sub2 class649_sub1_sub5_sub1_sub2 = client.aClass649_Sub1_Sub5_Sub1_Sub2Array11155[is[i_1_]];
			if (class649_sub1_sub5_sub1_sub2 != null)
				class649_sub1_sub5_sub1_sub2.method10905((byte) -82);
		}
		for (int i_2_ = 0; i_2_ < client.anInt11053 * -664631943; i_2_++) {
			long l = (long) client.anIntArray11211[i_2_];
			Class536_Sub13 class536_sub13 = (Class536_Sub13) client.aClass4_11050.method556(l);
			if (class536_sub13 != null)
				((Class649_Sub1_Sub5_Sub1) class536_sub13.anObject10468).method10905((byte) -90);
		}
		if (1542697723 * client.anInt11074 == 4) {
			for (int i_3_ = 0; i_3_ < Class193.aClass189Array2180.length; i_3_++) {
				Class189 class189 = Class193.aClass189Array2180[i_3_];
				if (class189.aBool2141)
					class189.method2804(389733677).method10905((byte) -22);
			}
		}
	}

	static final void method9100(Class668 class668, int i) {
		class668.anInt8542 -= 1472892954;
		int i_4_ = class668.anIntArray8541[1867269829 * class668.anInt8542];
		int i_5_ = class668.anIntArray8541[1 + class668.anInt8542 * 1867269829];
		int i_6_ = client.aClass485ArrayArray11266[i_5_][i_4_].method5851(-1720195440);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 2 == i_6_ ? 1 : 0;
	}
}
