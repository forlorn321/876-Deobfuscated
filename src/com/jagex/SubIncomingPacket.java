/* Class409 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class SubIncomingPacket {
	public static SubIncomingPacket aClass409_4307 = new SubIncomingPacket(21);
	public static SubIncomingPacket aClass409_4308 = new SubIncomingPacket(7);
	public static SubIncomingPacket aClass409_4309 = new SubIncomingPacket(-1);
	public static SubIncomingPacket ADD_GROUND_ITEM;
	public static SubIncomingPacket aClass409_4311;
	public static SubIncomingPacket aClass409_4312;
	public static SubIncomingPacket aClass409_4313 = new SubIncomingPacket(10);
	public static SubIncomingPacket aClass409_4314;
	public static SubIncomingPacket REMOVE_GROUND_ITEM;
	public static SubIncomingPacket aClass409_4316;
	public static SubIncomingPacket aClass409_4317 = new SubIncomingPacket(9);
	public static SubIncomingPacket aClass409_4318;
	public static SubIncomingPacket aClass409_4319;
	public static SubIncomingPacket aClass409_4320;
	public static SubIncomingPacket aClass409_4321;
	public int id;

	static {
		aClass409_4312 = new SubIncomingPacket(0);
		REMOVE_GROUND_ITEM = new SubIncomingPacket(1);
		aClass409_4314 = new SubIncomingPacket(2);
		ADD_GROUND_ITEM = new SubIncomingPacket(3);
		aClass409_4316 = new SubIncomingPacket(4);
		aClass409_4321 = new SubIncomingPacket(5);
		aClass409_4318 = new SubIncomingPacket(6);
		aClass409_4319 = new SubIncomingPacket(7);
		aClass409_4320 = new SubIncomingPacket(8);
		aClass409_4311 = new SubIncomingPacket(9);
	}

	SubIncomingPacket(int i) {
		this.id = i;
	}

	static void method4967(Class234 class234, int i, int i_0_, int i_1_, boolean bool, Class668 class668, byte i_2_) {
		if (0 == i_0_)
			throw new RuntimeException();
		Class251 class251 = class234.aClass251Array2378[i];
		if (class251.aClass251Array2725 == null) {
			class251.aClass251Array2725 = new Class251[i_1_ + 1];
			class251.aClass251Array2726 = class251.aClass251Array2725;
		}
		if (class251.aClass251Array2725.length <= i_1_) {
			if (class251.aClass251Array2725 == class251.aClass251Array2726) {
				Class251[] class251s = new Class251[1 + i_1_];
				for (int i_3_ = 0; i_3_ < class251.aClass251Array2725.length; i_3_++)
					class251s[i_3_] = class251.aClass251Array2725[i_3_];
				class251.aClass251Array2725 = class251.aClass251Array2726 = class251s;
			} else {
				Class251[] class251s = new Class251[i_1_ + 1];
				Class251[] class251s_4_ = new Class251[i_1_ + 1];
				for (int i_5_ = 0; i_5_ < class251.aClass251Array2725.length; i_5_++) {
					class251s[i_5_] = class251.aClass251Array2725[i_5_];
					class251s_4_[i_5_] = class251.aClass251Array2726[i_5_];
				}
				class251.aClass251Array2725 = class251s;
				class251.aClass251Array2726 = class251s_4_;
			}
		}
		if (i_1_ > 0 && class251.aClass251Array2725[i_1_ - 1] == null)
			throw new RuntimeException(new StringBuilder().append("").append(i_1_ - 1).toString());
		Class251 class251_6_ = new Class251();
		class251_6_.anInt2728 = -611060941 * i_0_;
		class251_6_.anInt2577 = (class251_6_.anInt2559 = 1 * class251.anInt2559) * -832839215;
		class251_6_.anInt2546 = 724931107 * i_1_;
		class251.aClass251Array2725[i_1_] = class251_6_;
		if (class251.aClass251Array2726 != class251.aClass251Array2725)
			class251.aClass251Array2726[i_1_] = class251_6_;
		Class683 class683;
		if (bool)
			class683 = class668.aClass683_8562;
		else
			class683 = class668.aClass683_8549;
		class683.aClass234_8649 = class234;
		class683.aClass251_8650 = class251_6_;
		Class668.method8011(class251, 263642117);
	}

	static final void method4968(Class668 class668, int i) {
		int i_7_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		Class251 class251 = Class264.method3678(i_7_, -689214737);
		Class234 class234 = Class463.aClass234Array5227[i_7_ >> 16];
		Class700.method8251(class251, class234, class668, 837944822);
	}

	static final void method4969(Class668 class668, short i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		Class251 class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class567.method6915(class251, class234, class668, -1844450562);
	}

	static final void method4970(Class668 class668, int i) {
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		Class613.aClass263_8014.method3652(string, -1864696840);
	}

	static final void method4971(Class668 class668, int i) {
		class668.anInt8542 -= 61855783;
		int i_8_ = class668.anIntArray8541[1867269829 * class668.anInt8542];
		int i_9_ = class668.anIntArray8541[1867269829 * class668.anInt8542 + 1];
		int i_10_ = class668.anIntArray8541[1867269829 * class668.anInt8542 + 2];
		Integer integer = (Integer) client.aClass231_11088.method3301(i_8_, (byte) 45).method3172(i_9_, i_10_, 1041612148);
		if (integer == null)
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
		else
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = integer.intValue();
	}

	public static void method4972(int i, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, byte i_17_) {
		Class536_Sub2 class536_sub2 = null;
		for (Class536_Sub2 class536_sub2_18_ = ((Class536_Sub2) Class536_Sub2.aClass708_10320.method8308(1867269829)); class536_sub2_18_ != null; class536_sub2_18_ = (Class536_Sub2) Class536_Sub2.aClass708_10320.method8311(1256805145)) {
			if (class536_sub2_18_.anInt10310 * -1676454841 == i && i_11_ == class536_sub2_18_.anInt10309 * 848380705 && class536_sub2_18_.anInt10312 * -499217723 == i_12_ && i_13_ == 702777497 * class536_sub2_18_.anInt10308) {
				class536_sub2 = class536_sub2_18_;
				break;
			}
		}
		if (class536_sub2 == null) {
			class536_sub2 = new Class536_Sub2();
			class536_sub2.anInt10310 = -384428681 * i;
			class536_sub2.anInt10308 = 196496297 * i_13_;
			class536_sub2.anInt10309 = i_11_ * 399769825;
			class536_sub2.anInt10312 = i_12_ * -1006214131;
			if (i_11_ >= 0 && i_12_ >= 0 && i_11_ < client.aClass515_11066.method6321((byte) -14) && i_12_ < client.aClass515_11066.method6243(177401017))
				Class601.method7168(class536_sub2, 16711935);
			Class536_Sub2.aClass708_10320.method8335(class536_sub2, -1412679831);
		}
		class536_sub2.anInt10314 = 2110314447 * i_14_;
		class536_sub2.anInt10313 = 1199299793 * i_15_;
		class536_sub2.anInt10315 = i_16_ * 1123919071;
		class536_sub2.aBool10318 = true;
		class536_sub2.aBool10319 = false;
	}

	static final void method4973(Class251 class251, Class234 class234, Class668 class668, byte i) {
		class668.anInt8542 -= 1472892954;
		int i_19_ = 10;
		byte[] is = { (byte) class668.anIntArray8541[class668.anInt8542 * 1867269829] };
		byte[] is_20_ = { (byte) class668.anIntArray8541[class668.anInt8542 * 1867269829 + 1] };
		Class481.method5831(class251, i_19_, is, is_20_, class668, -1447742043);
	}

	static final void method4974(Class668 class668, byte i) {
		int i_21_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class710.aClass536_Sub40_8843.aClass710_Sub3_10754.method8348(i_21_, -1102005131);
	}
}
