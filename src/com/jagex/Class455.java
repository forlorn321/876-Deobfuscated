/* Class455 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class455 {
	public static final int anInt5148 = 2;
	public static final int anInt5149 = 4;
	static final int anInt5150 = 2;
	static final int anInt5151 = 2;
	public static final int anInt5152 = 8;
	static final int anInt5153 = 16;
	public byte[][][] aByteArrayArrayArray5154;

	public void method5463() {
		for (int i = 0; i < aByteArrayArrayArray5154.length; i++) {
			for (int i_0_ = 0; i_0_ < aByteArrayArrayArray5154[0].length; i_0_++) {
				for (int i_1_ = 0; i_1_ < aByteArrayArrayArray5154[0][0].length; i_1_++)
					aByteArrayArrayArray5154[i][i_0_][i_1_] = (byte) 0;
			}
		}
	}

	public void method5464(int i) {
		for (int i_2_ = 0; i_2_ < aByteArrayArrayArray5154.length; i_2_++) {
			for (int i_3_ = 0; i_3_ < aByteArrayArrayArray5154[0].length; i_3_++) {
				for (int i_4_ = 0; i_4_ < aByteArrayArrayArray5154[0][0].length; i_4_++)
					aByteArrayArrayArray5154[i_2_][i_3_][i_4_] = (byte) 0;
			}
		}
	}

	public boolean method5465(int i, int i_5_, int i_6_) {
		if (i < 0 || i_5_ < 0 || i >= aByteArrayArrayArray5154[3].length || i_5_ >= aByteArrayArrayArray5154[3][i].length)
			return false;
		return (aByteArrayArrayArray5154[3][i][i_5_] & 0x2) != 0;
	}

	public boolean method5466(int i, int i_7_, byte i_8_) {
		if (i < 0 || i_7_ < 0 || i >= aByteArrayArrayArray5154[1].length || i_7_ >= aByteArrayArrayArray5154[1][i].length)
			return false;
		if ((aByteArrayArrayArray5154[1][i][i_7_] & 0x2) != 0)
			return true;
		return false;
	}

	public boolean method5467(int i, int i_9_, int i_10_, int i_11_, int i_12_) {
		if (0 != (aByteArrayArrayArray5154[0][i_10_][i_11_] & 0x2))
			return true;
		if ((aByteArrayArrayArray5154[i_9_][i_10_][i_11_] & 0x10) != 0)
			return false;
		if (method5468(i_9_, i_10_, i_11_, 456516734) == i)
			return true;
		return false;
	}

	int method5468(int i, int i_13_, int i_14_, int i_15_) {
		if (0 != (aByteArrayArrayArray5154[i][i_13_][i_14_] & 0x8))
			return 0;
		if (i > 0 && 0 != (aByteArrayArrayArray5154[1][i_13_][i_14_] & 0x2))
			return i - 1;
		return i;
	}

	int method5469(int i, int i_16_, int i_17_) {
		if (0 != (aByteArrayArrayArray5154[i][i_16_][i_17_] & 0x8))
			return 0;
		if (i > 0 && 0 != (aByteArrayArrayArray5154[1][i_16_][i_17_] & 0x2))
			return i - 1;
		return i;
	}

	public void method5470() {
		for (int i = 0; i < aByteArrayArrayArray5154.length; i++) {
			for (int i_18_ = 0; i_18_ < aByteArrayArrayArray5154[0].length; i_18_++) {
				for (int i_19_ = 0; i_19_ < aByteArrayArrayArray5154[0][0].length; i_19_++)
					aByteArrayArrayArray5154[i][i_18_][i_19_] = (byte) 0;
			}
		}
	}

	public boolean method5471(int i, int i_20_, int i_21_, int i_22_) {
		if (0 != (aByteArrayArrayArray5154[0][i_21_][i_22_] & 0x2))
			return true;
		if ((aByteArrayArrayArray5154[i_20_][i_21_][i_22_] & 0x10) != 0)
			return false;
		if (method5468(i_20_, i_21_, i_22_, -2011259661) == i)
			return true;
		return false;
	}

	public boolean method5472(int i, int i_23_) {
		if (i < 0 || i_23_ < 0 || i >= aByteArrayArrayArray5154[3].length || i_23_ >= aByteArrayArrayArray5154[3][i].length)
			return false;
		return (aByteArrayArrayArray5154[3][i][i_23_] & 0x2) != 0;
	}

	public boolean method5473(int i, int i_24_, int i_25_, int i_26_) {
		if (0 != (aByteArrayArrayArray5154[0][i_25_][i_26_] & 0x2))
			return true;
		if ((aByteArrayArrayArray5154[i_24_][i_25_][i_26_] & 0x10) != 0)
			return false;
		if (method5468(i_24_, i_25_, i_26_, -641137803) == i)
			return true;
		return false;
	}

	public Class455(int i, int i_27_, int i_28_) {
		aByteArrayArrayArray5154 = new byte[i][i_27_][i_28_];
	}

	public boolean method5474(int i, int i_29_, int i_30_, int i_31_) {
		if (0 != (aByteArrayArrayArray5154[0][i_30_][i_31_] & 0x2))
			return true;
		if ((aByteArrayArrayArray5154[i_29_][i_30_][i_31_] & 0x10) != 0)
			return false;
		if (method5468(i_29_, i_30_, i_31_, -340337756) == i)
			return true;
		return false;
	}

	int method5475(int i, int i_32_, int i_33_) {
		if (0 != (aByteArrayArrayArray5154[i][i_32_][i_33_] & 0x8))
			return 0;
		if (i > 0 && 0 != (aByteArrayArrayArray5154[1][i_32_][i_33_] & 0x2))
			return i - 1;
		return i;
	}

	public void method5476() {
		for (int i = 0; i < aByteArrayArrayArray5154.length; i++) {
			for (int i_34_ = 0; i_34_ < aByteArrayArrayArray5154[0].length; i_34_++) {
				for (int i_35_ = 0; i_35_ < aByteArrayArrayArray5154[0][0].length; i_35_++)
					aByteArrayArrayArray5154[i][i_34_][i_35_] = (byte) 0;
			}
		}
	}

	public static void method5477(int[] is, Object[] objects, int i, int i_36_, int i_37_) {
		if (i < i_36_) {
			int i_38_ = (i_36_ + i) / 2;
			int i_39_ = i;
			int i_40_ = is[i_38_];
			is[i_38_] = is[i_36_];
			is[i_36_] = i_40_;
			Object object = objects[i_38_];
			objects[i_38_] = objects[i_36_];
			objects[i_36_] = object;
			int i_41_ = 2147483647 == i_40_ ? 0 : 1;
			for (int i_42_ = i; i_42_ < i_36_; i_42_++) {
				if (is[i_42_] < i_40_ + (i_42_ & i_41_)) {
					int i_43_ = is[i_42_];
					is[i_42_] = is[i_39_];
					is[i_39_] = i_43_;
					Object object_44_ = objects[i_42_];
					objects[i_42_] = objects[i_39_];
					objects[i_39_++] = object_44_;
				}
			}
			is[i_36_] = is[i_39_];
			is[i_39_] = i_40_;
			objects[i_36_] = objects[i_39_];
			objects[i_39_] = object;
			method5477(is, objects, i, i_39_ - 1, -457600677);
			method5477(is, objects, i_39_ + 1, i_36_, 1745439746);
		}
	}

	static final void method5478(Class668 class668, byte i) {
		class668.anInt8542 -= 1472892954;
		int i_45_ = class668.anIntArray8541[class668.anInt8542 * 1867269829];
		int i_46_ = class668.anIntArray8541[1867269829 * class668.anInt8542 + 1];
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = (Class39.aClass450_490.method5424(i_45_, 1711781633).aCharArray11761[i_46_]);
	}

	static final void method5479(int i, int i_47_, int i_48_, int i_49_, ObjTypeTransformation class590, int i_50_) {
		if (i_48_ >= 1 && i_49_ >= 1 && i_48_ <= client.aClass515_11066.method6321((byte) 35) - 2 && i_49_ <= client.aClass515_11066.method6243(177401017) - 2) {
			if (client.aClass515_11066.method6249(-1481366149) != null) {
				Interface59 interface59 = client.aClass515_11066.method6292(1417825298).method9380(i, i_47_, i_48_, i_49_, -1862702185);
				if (null != interface59) {
					if (interface59 instanceof Class649_Sub1_Sub5_Sub3)
						((Class649_Sub1_Sub5_Sub3) interface59).method10949(class590, (byte) 48);
					else if (interface59 instanceof Class649_Sub1_Sub2_Sub1)
						((Class649_Sub1_Sub2_Sub1) interface59).method10926(class590, -1683385185);
					else if (interface59 instanceof Class649_Sub1_Sub3_Sub1)
						((Class649_Sub1_Sub3_Sub1) interface59).method10937(class590, -412365779);
					else if (interface59 instanceof Class649_Sub1_Sub4_Sub1)
						((Class649_Sub1_Sub4_Sub1) interface59).method10928(class590, (short) 128);
				}
			}
		}
	}

	static void method5480(byte i) {
		if (804924017 * Class552.anInt7416 < 0) {
			Class552.anInt7416 = 0;
			Class542_Sub1.anInt10706 = 1619839959;
			Class542_Sub1.anInt10707 = 636642145;
		}
		if (Class552.anInt7416 * 804924017 > Class542_Sub1.anInt7187) {
			Class552.anInt7416 = -406038895 * Class542_Sub1.anInt7187;
			Class542_Sub1.anInt10706 = 1619839959;
			Class542_Sub1.anInt10707 = 636642145;
		}
		if (Class391.anInt4063 * 2122662073 < 0) {
			Class391.anInt4063 = 0;
			Class542_Sub1.anInt10706 = 1619839959;
			Class542_Sub1.anInt10707 = 636642145;
		}
		if (2122662073 * Class391.anInt4063 > Class542_Sub1.anInt7188) {
			Class391.anInt4063 = Class542_Sub1.anInt7188 * -1712142967;
			Class542_Sub1.anInt10706 = 1619839959;
			Class542_Sub1.anInt10707 = 636642145;
		}
	}

	static final void method5481(Class668 class668, byte i) {
		int i_51_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = ClientSetting.aClass536_Sub40_8843.buildAreaSetting.method8348(i_51_, -1102005131);
	}
}
