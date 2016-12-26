/* Class307 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class307 {
	public short[] aShortArray3452;
	public int[] anIntArray3453;
	public static int anInt3454;

	public Class307(Class296 class296) {
		anIntArray3453 = new int[8];
		aShortArray3452 = new short[8];
		int i = 0;
		if (null != class296.anIntArray3300 && null != class296.aShortArray3301) {
			i = class296.anIntArray3300.length;
			System.arraycopy(class296.anIntArray3300, 0, anIntArray3453, 0, i);
			System.arraycopy(class296.aShortArray3301, 0, aShortArray3452, 0, i);
		}
		for (int i_0_ = i; i_0_ < 8; i_0_++) {
			anIntArray3453[i_0_] = -1;
			aShortArray3452[i_0_] = (short) -1;
		}
	}

	public Class307(int[] is, short[] is_1_) {
		anIntArray3453 = is;
		aShortArray3452 = is_1_;
	}

	static boolean method4133() {
		client.anInt11063 += 1770922671;
		client.aBool11064 = true;
		return true;
	}

	static final void method4134(int i) {
		for (int i_2_ = 0; i_2_ < client.anInt11053 * -664631943; i_2_++) {
			int i_3_ = client.anIntArray11211[i_2_];
			Class536_Sub13 class536_sub13 = (Class536_Sub13) client.aClass4_11050.method556((long) i_3_);
			if (class536_sub13 != null) {
				Class649_Sub1_Sub5_Sub1_Sub1 class649_sub1_sub5_sub1_sub1 = ((Class649_Sub1_Sub5_Sub1_Sub1) class536_sub13.anObject10468);
				Class583.method7028(class649_sub1_sub5_sub1_sub1, false, 65535);
			}
		}
	}
}
