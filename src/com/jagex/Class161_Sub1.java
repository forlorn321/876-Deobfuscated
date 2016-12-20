/* Class161_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class161_Sub1 extends Class161 {
	float aFloat9121;
	float aFloat9122;
	float aFloat9123;
	static final int anInt9124 = 2;
	static final int anInt9125 = 4;
	Class180_Sub1 aClass180_Sub1_9126;
	float aFloat9127;
	float aFloat9128;
	byte[][] aByteArrayArray9129;
	Class96[][] aClass96ArrayArray9130;
	Class94[][] aClass94ArrayArray9131;
	Class126[][] aClass126ArrayArray9132;
	float aFloat9133;
	int anInt9134;
	float aFloat9135;
	float aFloat9136;
	float aFloat9137;
	float aFloat9138;
	static final int anInt9139 = 1;
	Class111[][] aClass111ArrayArray9140;
	float aFloat9141;
	float aFloat9142;
	Class139[][] aClass139ArrayArray9143;
	float aFloat9144;
	float aFloat9145;
	float aFloat9146;
	static final boolean aBool9147 = true;
	float aFloat9148;
	byte[][] aByteArrayArray9149;
	static final int anInt9150 = -1694498816;
	static final boolean aBool9151 = true;
	static final int anInt9152 = 64;
	static final boolean aBool9153 = false;

	public Class527_Sub8_Sub8 method2586(int i, int i_0_, Class527_Sub8_Sub8 class527_sub8_sub8) {
		return null;
	}

	public void method2587(int i, int i_1_, int i_2_) {
		i = Math.min(aByteArrayArray9129.length - 1, Math.max(0, i));
		i_1_ = Math.min(aByteArrayArray9129[i].length - 1, Math.max(0, i_1_));
		if (aByteArrayArray9129[i][i_1_] < i_2_)
			aByteArrayArray9129[i][i_1_] = (byte) i_2_;
	}

	public void method2633(Class527_Sub8_Sub8 class527_sub8_sub8, int i, int i_3_, int i_4_, int i_5_, boolean bool) {
		/* empty */
	}

	public void method2604(int i, int i_6_, int[] is, int[] is_7_, int[] is_8_, int[] is_9_, int[] is_10_, int[] is_11_, int[] is_12_, int[] is_13_, Class178 class178, boolean bool) {
		boolean bool_14_ = (anInt9134 & 0x20) == 0;
		if (aClass96ArrayArray9130 == null && !bool_14_) {
			aClass96ArrayArray9130 = new Class96[anInt1750 * 1210322533][anInt1751 * -533476177];
			aClass94ArrayArray9131 = new Class94[anInt1750 * 1210322533][anInt1751 * -533476177];
		} else if (aClass126ArrayArray9132 == null && bool_14_)
			aClass126ArrayArray9132 = new Class126[anInt1750 * 1210322533][anInt1751 * -533476177];
		else if (aClass139ArrayArray9143 != null)
			throw new IllegalStateException();
		if (is != null && is.length != 0) {
			for (int i_15_ = 0; i_15_ < is_10_.length; i_15_++) {
				if (is_10_[i_15_] == -1)
					is_10_[i_15_] = 0;
				else
					is_10_[i_15_] = (Class656.anIntArray8393[(Class453.method7333(is_10_[i_15_], (byte) 10) & 0xffff)]) << 8 | 0xff;
			}
			if (is_11_ != null) {
				for (int i_16_ = 0; i_16_ < is_11_.length; i_16_++) {
					if (is_11_[i_16_] == -1)
						is_11_[i_16_] = 0;
					else
						is_11_[i_16_] = (Class656.anIntArray8393[(Class453.method7333(is_11_[i_16_], (byte) 10) & 0xffff)]) << 8 | 0xff;
				}
			}
			if (bool_14_) {
				Class126 class126 = new Class126();
				class126.aShort1522 = (short) is.length;
				class126.aShort1526 = (short) (is.length / 3);
				class126.aShortArray1520 = new short[class126.aShort1522];
				class126.aShortArray1519 = new short[class126.aShort1522];
				class126.aShortArray1518 = new short[class126.aShort1522];
				class126.anIntArray1521 = new int[class126.aShort1522];
				class126.aShortArray1524 = new short[class126.aShort1522];
				class126.aShortArray1525 = new short[class126.aShort1522];
				class126.aByteArray1527 = new byte[class126.aShort1522];
				if (is_9_ != null)
					class126.aShortArray1523 = new short[class126.aShort1522];
				for (int i_17_ = 0; i_17_ < class126.aShort1522; i_17_++) {
					int i_18_ = is[i_17_];
					int i_19_ = is_8_[i_17_];
					boolean bool_20_ = false;
					int i_21_;
					if (i_18_ == 0 && i_19_ == 0)
						i_21_ = (aByteArrayArray9149[i][i_6_] - aByteArrayArray9129[i][i_6_]);
					else if (i_18_ == 0 && i_19_ == anInt1752 * 1048375491)
						i_21_ = (aByteArrayArray9149[i][i_6_ + 1] - aByteArrayArray9129[i][i_6_ + 1]);
					else if (i_18_ == anInt1752 * 1048375491 && i_19_ == anInt1752 * 1048375491)
						i_21_ = (aByteArrayArray9149[i + 1][i_6_ + 1] - aByteArrayArray9129[i + 1][i_6_ + 1]);
					else if (i_18_ == anInt1752 * 1048375491 && i_19_ == 0)
						i_21_ = (aByteArrayArray9149[i + 1][i_6_] - aByteArrayArray9129[i + 1][i_6_]);
					else {
						int i_22_ = (((aByteArrayArray9149[i][i_6_] - aByteArrayArray9129[i][i_6_]) * (anInt1752 * 1048375491 - i_18_)) + (aByteArrayArray9149[i + 1][i_6_] - aByteArrayArray9129[i + 1][i_6_]) * i_18_);
						int i_23_ = (((aByteArrayArray9149[i][i_6_ + 1] - aByteArrayArray9129[i][i_6_ + 1]) * (anInt1752 * 1048375491 - i_18_)) + ((aByteArrayArray9149[i + 1][i_6_ + 1] - aByteArrayArray9129[i + 1][i_6_ + 1]) * i_18_));
						i_21_ = (i_22_ * (anInt1752 * 1048375491 - i_19_) + i_23_ * i_19_) >> anInt1753 * -1790967010;
					}
					int i_24_ = (i << anInt1753 * 1252000143) + i_18_;
					int i_25_ = (i_6_ << anInt1753 * 1252000143) + i_19_;
					class126.aShortArray1520[i_17_] = (short) i_18_;
					class126.aShortArray1518[i_17_] = (short) i_19_;
					class126.aShortArray1519[i_17_] = (short) (method2593(i_24_, i_25_, -1151432033) + (is_7_ != null ? is_7_[i_17_] : 0));
					if (i_21_ < 0)
						i_21_ = 0;
					if (is_10_[i_17_] == 0) {
						class126.anIntArray1521[i_17_] = 0;
						if (is_11_ != null)
							class126.aByteArray1527[i_17_] = (byte) i_21_;
					} else {
						int i_26_ = 0;
						if (is_9_ != null) {
							int i_27_ = (class126.aShortArray1523[i_17_] = (short) is_9_[i_17_]);
							if (class178.anInt2050 * 112490777 != 0) {
								i_26_ = 255 * i_27_ / (class178.anInt2050 * 112490777);
								if (i_26_ < 0)
									i_26_ = 0;
								else if (i_26_ > 255)
									i_26_ = 255;
							}
						}
						int i_28_ = -16777216;
						if (is_12_[i_17_] != -1) {
							Class163 class163 = aClass180_Sub1_9126.aClass181_2059.method3544(is_12_[i_17_], (byte) -71);
							if (class163.aBool1761 && method14603(class163.aByte1801))
								i_28_ = -1694498816;
						}
						class126.anIntArray1521[i_17_] = (i_28_ | Class307.method5617(method14602((is_10_[i_17_] >> 8), i_21_), (class178.anInt2055 * -2080392837), i_26_, (short) 10240));
						if (is_11_ != null)
							class126.aByteArray1527[i_17_] = (byte) i_21_;
					}
					class126.aShortArray1524[i_17_] = (short) is_12_[i_17_];
					class126.aShortArray1525[i_17_] = (short) is_13_[i_17_];
				}
				if (is_11_ != null) {
					class126.anIntArray1528 = new int[class126.aShort1526];
					for (int i_29_ = 0; i_29_ < class126.aShort1526; i_29_++) {
						int i_30_ = i_29_ * 3;
						if (is_11_[i_30_] != 0)
							class126.anIntArray1528[i_29_] = ~0xffffff | is_11_[i_30_] >> 8;
					}
				}
				aClass126ArrayArray9132[i][i_6_] = class126;
			} else {
				boolean bool_31_ = true;
				int i_32_ = -1;
				int i_33_ = -1;
				int i_34_ = -1;
				int i_35_ = -1;
				if (is.length == 6) {
					for (int i_36_ = 0; i_36_ < 6; i_36_++) {
						if (is[i_36_] == 0 && is_8_[i_36_] == 0) {
							if (i_32_ != -1 && is_10_[i_32_] != is_10_[i_36_]) {
								bool_31_ = false;
								break;
							}
							i_32_ = i_36_;
						} else if (is[i_36_] == anInt1752 * 1048375491 && is_8_[i_36_] == 0) {
							if (i_33_ != -1 && is_10_[i_33_] != is_10_[i_36_]) {
								bool_31_ = false;
								break;
							}
							i_33_ = i_36_;
						} else if (is[i_36_] == anInt1752 * 1048375491 && is_8_[i_36_] == anInt1752 * 1048375491) {
							if (i_34_ != -1 && is_10_[i_34_] != is_10_[i_36_]) {
								bool_31_ = false;
								break;
							}
							i_34_ = i_36_;
						} else if (is[i_36_] == 0 && is_8_[i_36_] == anInt1752 * 1048375491) {
							if (i_35_ != -1 && is_10_[i_35_] != is_10_[i_36_]) {
								bool_31_ = false;
								break;
							}
							i_35_ = i_36_;
						}
					}
					if (i_32_ == -1 || i_33_ == -1 || i_34_ == -1 || i_35_ == -1)
						bool_31_ = false;
					if (bool_31_) {
						if (is_7_ != null) {
							for (int i_37_ = 0; i_37_ < 4; i_37_++) {
								if (is_7_[i_37_] != 0) {
									bool_31_ = false;
									break;
								}
							}
						}
						if (bool_31_) {
							for (int i_38_ = 1; i_38_ < 4; i_38_++) {
								if (is[i_38_] != is[0] && (is[i_38_] != is[0] + anInt1752 * 1048375491) && (is[i_38_] != is[0] - anInt1752 * 1048375491)) {
									bool_31_ = false;
									break;
								}
								if (is_8_[i_38_] != is_8_[0] && (is_8_[i_38_] != is_8_[0] + anInt1752 * 1048375491) && (is_8_[i_38_] != (is_8_[0] - anInt1752 * 1048375491))) {
									bool_31_ = false;
									break;
								}
							}
						}
					}
				} else
					bool_31_ = false;
				if (bool_31_) {
					Class96 class96 = new Class96();
					int i_39_ = is_10_[0];
					int i_40_ = is_12_[0];
					if (is_11_ != null) {
						class96.anInt1157 = is_11_[0] >> 8;
						if (i_39_ == 0)
							class96.aByte1149 |= 0x2;
					} else if (i_39_ == 0)
						return;
					if ((anIntArrayArray1754[i][i_6_] == anIntArrayArray1754[i + 1][i_6_]) && (anIntArrayArray1754[i][i_6_] == anIntArrayArray1754[i + 1][i_6_ + 1]) && (anIntArrayArray1754[i][i_6_] == anIntArrayArray1754[i][i_6_ + 1]))
						class96.aByte1149 |= 0x1;
					if (i_40_ != -1 && (class96.aByte1149 & 0x2) == 0 && !(aClass180_Sub1_9126.aClass181_2059.method3544(i_40_, (byte) -46).aBool1806)) {
						int i_41_;
						if (is_9_ != null && class178.anInt2050 * 112490777 != 0) {
							i_41_ = 255 * is_9_[i_32_] / (class178.anInt2050 * 112490777);
							if (i_41_ < 0)
								i_41_ = 0;
							else if (i_41_ > 255)
								i_41_ = 255;
						} else
							i_41_ = 0;
						class96.anInt1152 = (Class307.method5617(method14602(is_10_[i_32_] >> 8, (aByteArrayArray9149[i][i_6_] - aByteArrayArray9129[i][i_6_])), class178.anInt2055 * -2080392837, i_41_, (short) 10240));
						if (class96.anInt1157 != 0)
							class96.anInt1152 |= (255 - (aByteArrayArray9149[i][i_6_] - aByteArrayArray9129[i][i_6_]) << 25);
						if (is_9_ != null && class178.anInt2050 * 112490777 != 0) {
							i_41_ = 255 * is_9_[i_33_] / (class178.anInt2050 * 112490777);
							if (i_41_ < 0)
								i_41_ = 0;
							else if (i_41_ > 255)
								i_41_ = 255;
						} else
							i_41_ = 0;
						class96.anInt1158 = (Class307.method5617(method14602(is_10_[i_33_] >> 8, (aByteArrayArray9149[i + 1][i_6_] - (aByteArrayArray9129[i + 1][i_6_]))), class178.anInt2055 * -2080392837, i_41_, (short) 10240));
						if (class96.anInt1157 != 0)
							class96.anInt1158 |= (255 - (aByteArrayArray9149[i + 1][i_6_] - aByteArrayArray9129[i + 1][i_6_]) << 25);
						if (is_9_ != null && class178.anInt2050 * 112490777 != 0) {
							i_41_ = 255 * is_9_[i_34_] / (class178.anInt2050 * 112490777);
							if (i_41_ < 0)
								i_41_ = 0;
							else if (i_41_ > 255)
								i_41_ = 255;
						} else
							i_41_ = 0;
						class96.anInt1151 = (Class307.method5617(method14602(is_10_[i_34_] >> 8, ((aByteArrayArray9149[i + 1][i_6_ + 1]) - (aByteArrayArray9129[i + 1][i_6_ + 1]))), class178.anInt2055 * -2080392837, i_41_, (short) 10240));
						if (class96.anInt1157 != 0)
							class96.anInt1151 |= 255 - (aByteArrayArray9149[i + 1][i_6_ + 1] - (aByteArrayArray9129[i + 1][i_6_ + 1])) << 25;
						if (is_9_ != null && class178.anInt2050 * 112490777 != 0) {
							i_41_ = 255 * is_9_[i_35_] / (class178.anInt2050 * 112490777);
							if (i_41_ < 0)
								i_41_ = 0;
							else if (i_41_ > 255)
								i_41_ = 255;
						} else
							i_41_ = 0;
						class96.anInt1153 = (Class307.method5617(method14602(is_10_[i_35_] >> 8, (aByteArrayArray9149[i][i_6_ + 1] - (aByteArrayArray9129[i][i_6_ + 1]))), class178.anInt2055 * -2080392837, i_41_, (short) 10240));
						class96.aShort1148 = (short) i_40_;
					} else {
						int i_42_;
						if (is_9_ != null && class178.anInt2050 * 112490777 != 0) {
							i_42_ = 255 * is_9_[i_32_] / (class178.anInt2050 * 112490777);
							if (i_42_ < 0)
								i_42_ = 0;
							else if (i_42_ > 255)
								i_42_ = 255;
						} else
							i_42_ = 0;
						class96.anInt1152 = (Class307.method5617(method14602(is_10_[i_32_] >> 8, (aByteArrayArray9149[i][i_6_] - aByteArrayArray9129[i][i_6_])), class178.anInt2055 * -2080392837, i_42_, (short) 10240));
						if (class96.anInt1157 != 0)
							class96.anInt1152 |= (255 - (aByteArrayArray9149[i][i_6_] - aByteArrayArray9129[i][i_6_]) << 25);
						if (is_9_ != null && class178.anInt2050 * 112490777 != 0) {
							i_42_ = 255 * is_9_[i_33_] / (class178.anInt2050 * 112490777);
							if (i_42_ < 0)
								i_42_ = 0;
							else if (i_42_ > 255)
								i_42_ = 255;
						} else
							i_42_ = 0;
						class96.anInt1158 = (Class307.method5617(method14602(is_10_[i_33_] >> 8, (aByteArrayArray9149[i + 1][i_6_] - (aByteArrayArray9129[i + 1][i_6_]))), class178.anInt2055 * -2080392837, i_42_, (short) 10240));
						if (class96.anInt1157 != 0)
							class96.anInt1158 |= (255 - (aByteArrayArray9149[i + 1][i_6_] - aByteArrayArray9129[i + 1][i_6_]) << 25);
						if (is_9_ != null && class178.anInt2050 * 112490777 != 0) {
							i_42_ = 255 * is_9_[i_34_] / (class178.anInt2050 * 112490777);
							if (i_42_ < 0)
								i_42_ = 0;
							else if (i_42_ > 255)
								i_42_ = 255;
						} else
							i_42_ = 0;
						class96.anInt1151 = (Class307.method5617(method14602(is_10_[i_34_] >> 8, ((aByteArrayArray9149[i + 1][i_6_ + 1]) - (aByteArrayArray9129[i + 1][i_6_ + 1]))), class178.anInt2055 * -2080392837, i_42_, (short) 10240));
						if (class96.anInt1157 != 0)
							class96.anInt1151 |= 255 - (aByteArrayArray9149[i + 1][i_6_ + 1] - (aByteArrayArray9129[i + 1][i_6_ + 1])) << 25;
						if (is_9_ != null && class178.anInt2050 * 112490777 != 0) {
							i_42_ = 255 * is_9_[i_35_] / (class178.anInt2050 * 112490777);
							if (i_42_ < 0)
								i_42_ = 0;
							else if (i_42_ > 255)
								i_42_ = 255;
						} else
							i_42_ = 0;
						class96.anInt1153 = (Class307.method5617(method14602(is_10_[i_35_] >> 8, (aByteArrayArray9149[i][i_6_ + 1] - (aByteArrayArray9129[i][i_6_ + 1]))), class178.anInt2055 * -2080392837, i_42_, (short) 10240));
						if (class96.anInt1157 != 0)
							class96.anInt1153 |= (255 - (aByteArrayArray9149[i][i_6_ + 1] - aByteArrayArray9129[i][i_6_ + 1]) << 25);
						class96.aShort1148 = (short) -1;
					}
					if (is_9_ != null) {
						class96.aShort1155 = (short) is_9_[i_34_];
						class96.aShort1150 = (short) is_9_[i_35_];
						class96.aShort1154 = (short) is_9_[i_33_];
						class96.aShort1156 = (short) is_9_[i_32_];
					}
					aClass96ArrayArray9130[i][i_6_] = class96;
				} else {
					Class94 class94 = new Class94();
					class94.aShort1136 = (short) is.length;
					class94.aShort1145 = (short) (is.length / 3);
					class94.aShortArray1135 = new short[class94.aShort1136];
					class94.aShortArray1139 = new short[class94.aShort1136];
					class94.aShortArray1140 = new short[class94.aShort1136];
					class94.anIntArray1142 = new int[class94.aShort1136];
					if (is_9_ != null)
						class94.aShortArray1141 = new short[class94.aShort1136];
					for (int i_43_ = 0; i_43_ < class94.aShort1136; i_43_++) {
						int i_44_ = is[i_43_];
						int i_45_ = is_8_[i_43_];
						boolean bool_46_ = false;
						int i_47_;
						if (i_44_ == 0 && i_45_ == 0)
							i_47_ = (aByteArrayArray9149[i][i_6_] - aByteArrayArray9129[i][i_6_]);
						else if (i_44_ == 0 && i_45_ == anInt1752 * 1048375491)
							i_47_ = (aByteArrayArray9149[i][i_6_ + 1] - aByteArrayArray9129[i][i_6_ + 1]);
						else if (i_44_ == anInt1752 * 1048375491 && i_45_ == anInt1752 * 1048375491)
							i_47_ = (aByteArrayArray9149[i + 1][i_6_ + 1] - aByteArrayArray9129[i + 1][i_6_ + 1]);
						else if (i_44_ == anInt1752 * 1048375491 && i_45_ == 0)
							i_47_ = (aByteArrayArray9149[i + 1][i_6_] - aByteArrayArray9129[i + 1][i_6_]);
						else {
							int i_48_ = (((aByteArrayArray9149[i][i_6_] - aByteArrayArray9129[i][i_6_]) * (anInt1752 * 1048375491 - i_44_)) + ((aByteArrayArray9149[i + 1][i_6_] - aByteArrayArray9129[i + 1][i_6_]) * i_44_));
							int i_49_ = (((aByteArrayArray9149[i][i_6_ + 1] - aByteArrayArray9129[i][i_6_ + 1]) * (anInt1752 * 1048375491 - i_44_)) + ((aByteArrayArray9149[i + 1][i_6_ + 1] - aByteArrayArray9129[i + 1][i_6_ + 1]) * i_44_));
							i_47_ = (i_48_ * (anInt1752 * 1048375491 - i_45_) + i_49_ * i_45_) >> anInt1753 * -1790967010;
						}
						int i_50_ = (i << anInt1753 * 1252000143) + i_44_;
						int i_51_ = (i_6_ << anInt1753 * 1252000143) + i_45_;
						class94.aShortArray1135[i_43_] = (short) i_44_;
						class94.aShortArray1140[i_43_] = (short) i_45_;
						class94.aShortArray1139[i_43_] = (short) (method2593(i_50_, i_51_, -1151432033) + (is_7_ != null ? is_7_[i_43_] : 0));
						if (i_47_ < 0)
							i_47_ = 0;
						if (is_10_[i_43_] == 0) {
							if (is_11_ != null)
								class94.anIntArray1142[i_43_] = i_47_ << 25;
							else
								class94.anIntArray1142[i_43_] = 0;
						} else {
							int i_52_ = 0;
							if (is_9_ != null) {
								int i_53_ = (class94.aShortArray1141[i_43_] = (short) is_9_[i_43_]);
								if (class178.anInt2050 * 112490777 != 0) {
									i_52_ = 255 * i_53_ / (class178.anInt2050 * 112490777);
									if (i_52_ < 0)
										i_52_ = 0;
									else if (i_52_ > 255)
										i_52_ = 255;
								}
							}
							class94.anIntArray1142[i_43_] = (Class307.method5617(method14602(is_10_[i_43_] >> 8, i_47_), class178.anInt2055 * -2080392837, i_52_, (short) 10240));
							if (is_11_ != null)
								class94.anIntArray1142[i_43_] |= i_47_ << 25;
						}
					}
					boolean bool_54_ = false;
					for (int i_55_ = 0; i_55_ < class94.aShort1145; i_55_++) {
						if (is_12_[i_55_ * 3] != -1 && !(aClass180_Sub1_9126.aClass181_2059.method3544(is_12_[i_55_ * 3], (byte) -38).aBool1806))
							bool_54_ = true;
					}
					if (is_11_ != null)
						class94.anIntArray1144 = new int[class94.aShort1145];
					if (bool_54_) {
						class94.aShortArray1143 = new short[class94.aShort1145];
						class94.aShortArray1138 = new short[class94.aShort1145];
					}
					for (int i_56_ = 0; i_56_ < class94.aShort1145; i_56_++) {
						int i_57_ = i_56_ * 3;
						if (is_11_ != null && is_11_[i_57_] != 0)
							class94.anIntArray1144[i_56_] = is_11_[i_57_] >> 8;
						if (bool_54_) {
							int i_58_ = i_57_ + 1;
							int i_59_ = i_58_ + 1;
							boolean bool_60_ = false;
							boolean bool_61_ = true;
							int i_62_ = is_12_[i_57_];
							if (i_62_ == -1 || (aClass180_Sub1_9126.aClass181_2059.method3544(i_62_, (byte) -94).aBool1806))
								bool_61_ = false;
							else
								bool_60_ = true;
							i_62_ = is_12_[i_58_];
							if (i_62_ == -1 || (aClass180_Sub1_9126.aClass181_2059.method3544(i_62_, (byte) -70).aBool1806))
								bool_61_ = false;
							else
								bool_60_ = true;
							i_62_ = is_12_[i_59_];
							if (i_62_ == -1 || (aClass180_Sub1_9126.aClass181_2059.method3544(i_62_, (byte) -121).aBool1806))
								bool_61_ = false;
							else
								bool_60_ = true;
							if (bool_61_) {
								class94.aShortArray1143[i_56_] = (short) i_62_;
								class94.aShortArray1138[i_56_] = (short) is_13_[i_57_];
							} else {
								if (bool_60_) {
									i_62_ = is_12_[i_57_];
									if (i_62_ != -1 && !(aClass180_Sub1_9126.aClass181_2059.method3544(i_62_, (byte) -88).aBool1806))
										class94.anIntArray1142[i_57_] = (Class656.anIntArray8393[(Class453.method7333((aClass180_Sub1_9126.aClass181_2059.method3544(i_62_, (byte) 3).aShort1810) & 0xffff, (byte) 10)) & 0xffff]);
									i_62_ = is_12_[i_58_];
									if (i_62_ != -1 && !(aClass180_Sub1_9126.aClass181_2059.method3544(i_62_, (byte) 2).aBool1806))
										class94.anIntArray1142[i_58_] = (Class656.anIntArray8393[(Class453.method7333((aClass180_Sub1_9126.aClass181_2059.method3544(i_62_, (byte) -121).aShort1810) & 0xffff, (byte) 10)) & 0xffff]);
									i_62_ = is_12_[i_59_];
									if (i_62_ != -1 && !(aClass180_Sub1_9126.aClass181_2059.method3544(i_62_, (byte) -28).aBool1806))
										class94.anIntArray1142[i_59_] = (Class656.anIntArray8393[(Class453.method7333((aClass180_Sub1_9126.aClass181_2059.method3544(i_62_, (byte) -30).aShort1810) & 0xffff, (byte) 10)) & 0xffff]);
								}
								class94.aShortArray1143[i_56_] = (short) -1;
							}
						}
					}
					aClass94ArrayArray9131[i][i_6_] = class94;
				}
			}
		}
	}

	public Class527_Sub8_Sub8 method2610(int i, int i_63_, Class527_Sub8_Sub8 class527_sub8_sub8) {
		return null;
	}

	public void method2588() {
		aByteArrayArray9149 = null;
		aByteArrayArray9129 = null;
	}

	Class161_Sub1(Class180_Sub1 class180_sub1, int i, int i_64_, int i_65_, int i_66_, int[][] is, int[][] is_67_, int i_68_) {
		super(i_65_, i_66_, i_68_, is);
		aClass180_Sub1_9126 = class180_sub1;
		anInt9134 = i_64_;
		aByteArrayArray9149 = new byte[i_65_ + 1][i_66_ + 1];
		int i_69_ = aClass180_Sub1_9126.anInt9399 * -1757876199 >> 9;
		for (int i_70_ = 1; i_70_ < i_66_; i_70_++) {
			for (int i_71_ = 1; i_71_ < i_65_; i_71_++) {
				int i_72_ = i_69_;
				int i_73_ = is_67_[i_71_ + 1][i_70_] - is_67_[i_71_ - 1][i_70_];
				int i_74_ = is_67_[i_71_][i_70_ + 1] - is_67_[i_71_][i_70_ - 1];
				int i_75_ = (int) Math.sqrt((double) (i_73_ * i_73_ + 512 * i_68_ + i_74_ * i_74_));
				int i_76_ = (i_73_ << 8) / i_75_;
				int i_77_ = -512 * i_68_ / i_75_;
				int i_78_ = (i_74_ << 8) / i_75_;
				i_72_ += ((aClass180_Sub1_9126.anInt9413 * -1353141313 * i_76_ + aClass180_Sub1_9126.anInt9409 * 748091021 * i_77_ + aClass180_Sub1_9126.anInt9394 * -1663247975 * i_78_) >> 17);
				i_72_ >>= 1;
				if (i_72_ < 2)
					i_72_ = 2;
				else if (i_72_ > 126)
					i_72_ = 126;
				aByteArrayArray9149[i_71_][i_70_] = (byte) i_72_;
			}
		}
		aByteArrayArray9129 = new byte[i_65_ + 1][i_66_ + 1];
	}

	void method14597(int i, int i_79_, int i_80_) {
		Class101 class101 = aClass180_Sub1_9126.method14835(Thread.currentThread());
		class101.aClass119_1197.anInt1441 = 0;
		if (aClass96ArrayArray9130 != null)
			method14599(i, i_79_, class101.aBool1196, class101, class101.aClass119_1197, class101.aFloatArray1228, class101.aFloatArray1229, class101.aFloatArray1230, class101.aFloatArray1231, class101.aFloatArray1202, i_80_);
		else if (aClass139ArrayArray9143 != null)
			method14598(i, i_79_, class101.aClass119_1197, class101.aFloatArray1228, class101.aFloatArray1229, class101.aFloatArray1230, class101.aFloatArray1231, class101.aFloatArray1202, i_80_);
		else if (aClass126ArrayArray9132 != null)
			method14617(i, i_79_, class101.aBool1196, class101, class101.aClass119_1197, class101.aFloatArray1228, class101.aFloatArray1229, class101.aFloatArray1230, class101.aFloatArray1231, class101.aFloatArray1202, i_80_);
	}

	void method14598(int i, int i_81_, Class119 class119, float[] fs, float[] fs_82_, float[] fs_83_, float[] fs_84_, float[] fs_85_, int i_86_) {
		Class139 class139 = aClass139ArrayArray9143[i][i_81_];
		if (class139 != null) {
			if ((class139.aByte1646 & 0x2) == 0) {
				if (i_86_ != 0) {
					if ((class139.aByte1646 & 0x4) != 0) {
						if ((i_86_ & 0x1) != 0)
							return;
					} else if ((i_86_ & 0x2) != 0)
						return;
				}
				int i_87_ = i * (anInt1752 * 1048375491);
				int i_88_ = i_87_ + anInt1752 * 1048375491;
				int i_89_ = i_81_ * (anInt1752 * 1048375491);
				int i_90_ = i_89_ + anInt1752 * 1048375491;
				float f;
				float f_91_;
				float f_92_;
				float f_93_;
				float f_94_;
				float f_95_;
				float f_96_;
				float f_97_;
				float f_98_;
				float f_99_;
				float f_100_;
				float f_101_;
				float f_102_;
				float f_103_;
				float f_104_;
				float f_105_;
				if ((class139.aByte1646 & 0x1) != 0) {
					int i_106_ = anIntArrayArray1754[i][i_81_];
					float f_107_ = aFloat9127 * (float) i_106_;
					float f_108_ = aFloat9123 * (float) i_106_;
					float f_109_ = aFloat9145 + (aFloat9135 * (float) i_87_ + f_107_ + aFloat9128 * (float) i_89_);
					f = aFloat9148 + (aFloat9136 * (float) i_87_ + f_108_ + aFloat9144 * (float) i_89_);
					if (f_109_ < -f)
						return;
					float f_110_ = aFloat9145 + (aFloat9135 * (float) i_88_ + f_107_ + aFloat9128 * (float) i_89_);
					f_91_ = aFloat9148 + (aFloat9136 * (float) i_88_ + f_108_ + aFloat9144 * (float) i_89_);
					if (f_110_ < -f_91_)
						return;
					float f_111_ = aFloat9145 + (aFloat9135 * (float) i_88_ + f_107_ + aFloat9128 * (float) i_90_);
					f_92_ = aFloat9148 + (aFloat9136 * (float) i_88_ + f_108_ + aFloat9144 * (float) i_90_);
					if (f_111_ < -f_92_)
						return;
					float f_112_ = aFloat9145 + (aFloat9135 * (float) i_87_ + f_107_ + aFloat9128 * (float) i_90_);
					f_93_ = aFloat9148 + (aFloat9136 * (float) i_87_ + f_108_ + aFloat9144 * (float) i_90_);
					if (f_112_ < -f_93_)
						return;
					float f_113_ = aFloat9137 * (float) i_106_;
					float f_114_ = aFloat9138 * (float) i_106_;
					float f_115_ = aFloat9122 + (aFloat9133 * (float) i_87_ + f_113_ + aFloat9141 * (float) i_89_);
					f_94_ = (class119.aFloat1448 + class119.aFloat1451 * f_115_ / f);
					float f_116_ = aFloat9121 + (aFloat9146 * (float) i_87_ + f_114_ + aFloat9142 * (float) i_89_);
					f_95_ = (class119.aFloat1444 + class119.aFloat1466 * f_116_ / f);
					f_96_ = (class119.aFloat1452 + class119.aFloat1453 * f_109_ / f);
					float f_117_ = aFloat9122 + (aFloat9133 * (float) i_88_ + f_113_ + aFloat9141 * (float) i_89_);
					f_97_ = (class119.aFloat1448 + class119.aFloat1451 * f_117_ / f_91_);
					float f_118_ = aFloat9121 + (aFloat9146 * (float) i_88_ + f_114_ + aFloat9142 * (float) i_89_);
					f_98_ = (class119.aFloat1444 + class119.aFloat1466 * f_118_ / f_91_);
					f_99_ = (class119.aFloat1452 + class119.aFloat1453 * f_110_ / f_91_);
					float f_119_ = aFloat9122 + (aFloat9133 * (float) i_88_ + f_113_ + aFloat9141 * (float) i_90_);
					f_100_ = (class119.aFloat1448 + class119.aFloat1451 * f_119_ / f_92_);
					float f_120_ = aFloat9121 + (aFloat9146 * (float) i_88_ + f_114_ + aFloat9142 * (float) i_90_);
					f_101_ = (class119.aFloat1444 + class119.aFloat1466 * f_120_ / f_92_);
					f_102_ = (class119.aFloat1452 + class119.aFloat1453 * f_111_ / f_92_);
					float f_121_ = aFloat9122 + (aFloat9133 * (float) i_87_ + f_113_ + aFloat9141 * (float) i_90_);
					f_103_ = (class119.aFloat1448 + class119.aFloat1451 * f_121_ / f_93_);
					float f_122_ = aFloat9121 + (aFloat9146 * (float) i_87_ + f_114_ + aFloat9142 * (float) i_90_);
					f_104_ = (class119.aFloat1444 + class119.aFloat1466 * f_122_ / f_93_);
					f_105_ = (class119.aFloat1452 + class119.aFloat1453 * f_112_ / f_93_);
				} else {
					int i_123_ = anIntArrayArray1754[i][i_81_];
					int i_124_ = anIntArrayArray1754[i + 1][i_81_];
					int i_125_ = anIntArrayArray1754[i + 1][i_81_ + 1];
					int i_126_ = anIntArrayArray1754[i][i_81_ + 1];
					float f_127_ = aFloat9145 + (aFloat9135 * (float) i_87_ + aFloat9127 * (float) i_123_ + aFloat9128 * (float) i_89_);
					f = aFloat9148 + (aFloat9136 * (float) i_87_ + aFloat9123 * (float) i_123_ + aFloat9144 * (float) i_89_);
					if (f_127_ < -f)
						return;
					float f_128_ = aFloat9145 + (aFloat9135 * (float) i_88_ + aFloat9127 * (float) i_124_ + aFloat9128 * (float) i_89_);
					f_91_ = aFloat9148 + (aFloat9136 * (float) i_88_ + aFloat9123 * (float) i_124_ + aFloat9144 * (float) i_89_);
					if (f_128_ < -f_91_)
						return;
					float f_129_ = aFloat9145 + (aFloat9135 * (float) i_88_ + aFloat9127 * (float) i_125_ + aFloat9128 * (float) i_90_);
					f_92_ = aFloat9148 + (aFloat9136 * (float) i_88_ + aFloat9123 * (float) i_125_ + aFloat9144 * (float) i_90_);
					if (f_129_ < -f_92_)
						return;
					float f_130_ = aFloat9145 + (aFloat9135 * (float) i_87_ + aFloat9127 * (float) i_126_ + aFloat9128 * (float) i_90_);
					f_93_ = aFloat9148 + (aFloat9136 * (float) i_87_ + aFloat9123 * (float) i_126_ + aFloat9144 * (float) i_90_);
					if (f_130_ < -f_93_)
						return;
					float f_131_ = aFloat9122 + (aFloat9133 * (float) i_87_ + aFloat9137 * (float) i_123_ + aFloat9141 * (float) i_89_);
					f_94_ = (class119.aFloat1448 + class119.aFloat1451 * f_131_ / f);
					float f_132_ = aFloat9121 + (aFloat9146 * (float) i_87_ + aFloat9138 * (float) i_123_ + aFloat9142 * (float) i_89_);
					f_95_ = (class119.aFloat1444 + class119.aFloat1466 * f_132_ / f);
					f_96_ = (class119.aFloat1452 + class119.aFloat1453 * f_127_ / f);
					float f_133_ = aFloat9122 + (aFloat9133 * (float) i_88_ + aFloat9137 * (float) i_124_ + aFloat9141 * (float) i_89_);
					f_97_ = (class119.aFloat1448 + class119.aFloat1451 * f_133_ / f_91_);
					float f_134_ = aFloat9121 + (aFloat9146 * (float) i_88_ + aFloat9138 * (float) i_124_ + aFloat9142 * (float) i_89_);
					f_98_ = (class119.aFloat1444 + class119.aFloat1466 * f_134_ / f_91_);
					f_99_ = (class119.aFloat1452 + class119.aFloat1453 * f_128_ / f_91_);
					float f_135_ = aFloat9122 + (aFloat9133 * (float) i_88_ + aFloat9137 * (float) i_125_ + aFloat9141 * (float) i_90_);
					f_100_ = (class119.aFloat1448 + class119.aFloat1451 * f_135_ / f_92_);
					float f_136_ = aFloat9121 + (aFloat9146 * (float) i_88_ + aFloat9138 * (float) i_125_ + aFloat9142 * (float) i_90_);
					f_101_ = (class119.aFloat1444 + class119.aFloat1466 * f_136_ / f_92_);
					f_102_ = (class119.aFloat1452 + class119.aFloat1453 * f_129_ / f_92_);
					float f_137_ = aFloat9122 + (aFloat9133 * (float) i_87_ + aFloat9137 * (float) i_126_ + aFloat9141 * (float) i_90_);
					f_103_ = (class119.aFloat1448 + class119.aFloat1451 * f_137_ / f_93_);
					float f_138_ = aFloat9121 + (aFloat9146 * (float) i_87_ + aFloat9138 * (float) i_126_ + aFloat9142 * (float) i_90_);
					f_104_ = (class119.aFloat1444 + class119.aFloat1466 * f_138_ / f_93_);
					f_105_ = (class119.aFloat1452 + class119.aFloat1453 * f_130_ / f_93_);
				}
				boolean bool = false;
				if (class139.aShort1644 != -1) {
					Class163 class163 = (aClass180_Sub1_9126.aClass181_2059.method3544(class139.aShort1644 & 0xffff, (byte) -64));
					bool = class163.aBool1761;
				}
				if (((f_100_ - f_103_) * (f_98_ - f_104_) - (f_101_ - f_104_) * (f_97_ - f_103_)) > 0.0F) {
					class119.aBool1445 = (f_100_ < 0.0F || f_103_ < 0.0F || f_97_ < 0.0F || f_100_ > (float) class119.anInt1442 || f_103_ > (float) class119.anInt1442 || f_97_ > (float) class119.anInt1442);
					if (bool)
						class119.method2079(true, true, false, f_101_, f_104_, f_98_, f_100_, f_103_, f_97_, f_102_, f_105_, f_99_, f_92_, f_93_, f_91_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, ~0xffffff | ((Class656.anIntArray8393[class139.aShort1642 & 0xffff]) & 0xffffff), ~0xffffff | ((Class656.anIntArray8393[class139.aShort1643 & 0xffff]) & 0xffffff), ~0xffffff | ((Class656.anIntArray8393[class139.aShort1640 & 0xffff]) & 0xffffff), 0, 0.0F, 0.0F, 0.0F, class139.aShort1644 & 0xffff);
					else
						class119.method2073(true, true, false, f_101_, f_104_, f_98_, f_100_, f_103_, f_97_, f_102_, f_105_, f_99_, (float) (class139.aShort1642 & 0xffff), (float) (class139.aShort1643 & 0xffff), (float) (class139.aShort1640 & 0xffff));
				}
				if (((f_94_ - f_97_) * (f_104_ - f_98_) - (f_95_ - f_98_) * (f_103_ - f_97_)) > 0.0F) {
					class119.aBool1445 = (f_94_ < 0.0F || f_97_ < 0.0F || f_103_ < 0.0F || f_94_ > (float) class119.anInt1442 || f_97_ > (float) class119.anInt1442 || f_103_ > (float) class119.anInt1442);
					if (bool)
						class119.method2079(true, true, false, f_95_, f_98_, f_104_, f_94_, f_97_, f_103_, f_96_, f_99_, f_105_, f, f_91_, f_93_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, ~0xffffff | ((Class656.anIntArray8393[class139.aShort1641 & 0xffff]) & 0xffffff), ~0xffffff | ((Class656.anIntArray8393[class139.aShort1640 & 0xffff]) & 0xffffff), ~0xffffff | ((Class656.anIntArray8393[class139.aShort1643 & 0xffff]) & 0xffffff), 0, 0.0F, 0.0F, 0.0F, class139.aShort1644 & 0xffff);
					else
						class119.method2073(true, true, false, f_95_, f_98_, f_104_, f_94_, f_97_, f_103_, f_96_, f_99_, f_105_, (float) (class139.aShort1641 & 0xffff), (float) (class139.aShort1640 & 0xffff), (float) (class139.aShort1643 & 0xffff));
				}
			}
		} else {
			Class111 class111 = aClass111ArrayArray9140[i][i_81_];
			if (class111 != null) {
				if (i_86_ != 0) {
					if ((class111.aByte1394 & 0x4) != 0) {
						if ((i_86_ & 0x1) != 0)
							return;
					} else if ((i_86_ & 0x2) != 0)
						return;
				}
				for (int i_139_ = 0; i_139_ < class111.aShort1402; i_139_++) {
					int i_140_ = (class111.aShortArray1395[i_139_] + (i << anInt1753 * 1252000143));
					short i_141_ = class111.aShortArray1396[i_139_];
					int i_142_ = (class111.aShortArray1398[i_139_] + (i_81_ << anInt1753 * 1252000143));
					float f = aFloat9145 + (aFloat9135 * (float) i_140_ + aFloat9127 * (float) i_141_ + aFloat9128 * (float) i_142_);
					float f_143_ = aFloat9148 + (aFloat9136 * (float) i_140_ + aFloat9123 * (float) i_141_ + aFloat9144 * (float) i_142_);
					if (f < -f_143_)
						return;
					float f_144_ = aFloat9122 + (aFloat9133 * (float) i_140_ + aFloat9137 * (float) i_141_ + aFloat9141 * (float) i_142_);
					float f_145_ = aFloat9121 + (aFloat9146 * (float) i_140_ + aFloat9138 * (float) i_141_ + aFloat9142 * (float) i_142_);
					fs[i_139_] = (class119.aFloat1448 + class119.aFloat1451 * f_144_ / f_143_);
					fs_82_[i_139_] = (class119.aFloat1444 + class119.aFloat1466 * f_145_ / f_143_);
					fs_83_[i_139_] = (class119.aFloat1452 + class119.aFloat1453 * f / f_143_);
					fs_84_[i_139_] = f_143_;
				}
				if (class111.aShortArray1405 != null) {
					for (int i_146_ = 0; i_146_ < class111.aShort1403; i_146_++) {
						short i_147_ = class111.aShortArray1399[i_146_];
						short i_148_ = class111.aShortArray1400[i_146_];
						short i_149_ = class111.aShortArray1401[i_146_];
						float f = fs[i_147_];
						float f_150_ = fs[i_148_];
						float f_151_ = fs[i_149_];
						float f_152_ = fs_82_[i_147_];
						float f_153_ = fs_82_[i_148_];
						float f_154_ = fs_82_[i_149_];
						if (((f - f_150_) * (f_154_ - f_153_) - (f_152_ - f_153_) * (f_151_ - f_150_)) > 0.0F) {
							class119.aBool1445 = (f < 0.0F || f_150_ < 0.0F || f_151_ < 0.0F || f > (float) class119.anInt1442 || f_150_ > (float) class119.anInt1442 || f_151_ > (float) class119.anInt1442);
							boolean bool = false;
							if (class111.aShortArray1405[i_146_] != -1) {
								Class163 class163 = (aClass180_Sub1_9126.aClass181_2059.method3544((class111.aShortArray1405[i_146_] & 0xffff), (byte) -44));
								bool = class163.aBool1761;
							}
							if (bool)
								class119.method2079(true, true, false, f_152_, f_153_, f_154_, f, f_150_, f_151_, fs_83_[i_147_], fs_83_[i_148_], fs_83_[i_149_], fs_84_[i_147_], fs_84_[i_148_], fs_84_[i_149_], ((float) class111.aShortArray1395[i_147_] / (float) (anInt1752 * 1048375491)), ((float) class111.aShortArray1395[i_148_] / (float) (anInt1752 * 1048375491)), ((float) class111.aShortArray1395[i_149_] / (float) (anInt1752 * 1048375491)),
										((float) class111.aShortArray1398[i_147_] / (float) (anInt1752 * 1048375491)), ((float) class111.aShortArray1398[i_148_] / (float) (anInt1752 * 1048375491)), ((float) class111.aShortArray1398[i_149_] / (float) (anInt1752 * 1048375491)), (~0xffffff | (Class656.anIntArray8393[(class111.aShortArray1393[i_147_] & 0xffff)]) & 0xffffff), (~0xffffff | (Class656.anIntArray8393[(class111.aShortArray1393[i_148_] & 0xffff)]) & 0xffffff),
										(~0xffffff | (Class656.anIntArray8393[(class111.aShortArray1393[i_149_] & 0xffff)]) & 0xffffff), 0, 0.0F, 0.0F, 0.0F, (class111.aShortArray1405[i_146_] & 0xffff));
							else {
								int i_155_ = class111.anIntArray1404[i_146_];
								if (i_155_ != -1)
									class119.method2073(true, true, false, f_152_, f_153_, f_154_, f, f_150_, f_151_, fs_83_[i_147_], fs_83_[i_148_], fs_83_[i_149_], (float) (Class395.method6504(i_155_, (class111.aShortArray1393[i_147_]), -501584282)), (float) (Class395.method6504(i_155_, (class111.aShortArray1393[i_148_]), -501584282)), (float) (Class395.method6504(i_155_, (class111.aShortArray1393[i_149_]), -501584282)));
							}
						}
					}
				} else {
					for (int i_156_ = 0; i_156_ < class111.aShort1403; i_156_++) {
						short i_157_ = class111.aShortArray1399[i_156_];
						short i_158_ = class111.aShortArray1400[i_156_];
						short i_159_ = class111.aShortArray1401[i_156_];
						float f = fs[i_157_];
						float f_160_ = fs[i_158_];
						float f_161_ = fs[i_159_];
						float f_162_ = fs_82_[i_157_];
						float f_163_ = fs_82_[i_158_];
						float f_164_ = fs_82_[i_159_];
						if (((f - f_160_) * (f_164_ - f_163_) - (f_162_ - f_163_) * (f_161_ - f_160_)) > 0.0F) {
							int i_165_ = class111.anIntArray1404[i_156_];
							if (i_165_ != -1) {
								class119.aBool1445 = (f < 0.0F || f_160_ < 0.0F || f_161_ < 0.0F || f > (float) class119.anInt1442 || f_160_ > (float) class119.anInt1442 || f_161_ > (float) class119.anInt1442);
								class119.method2073(true, true, false, f_162_, f_163_, f_164_, f, f_160_, f_161_, fs_83_[i_157_], fs_83_[i_158_], fs_83_[i_159_], (float) (Class395.method6504(i_165_, (class111.aShortArray1393[i_157_]), -501584282)), (float) (Class395.method6504(i_165_, (class111.aShortArray1393[i_158_]), -501584282)), (float) (Class395.method6504(i_165_, (class111.aShortArray1393[i_159_]), -501584282)));
							}
						}
					}
				}
			}
		}
	}

	void method14599(int i, int i_166_, boolean bool, Class101 class101, Class119 class119, float[] fs, float[] fs_167_, float[] fs_168_, float[] fs_169_, float[] fs_170_, int i_171_) {
		Class96 class96 = aClass96ArrayArray9130[i][i_166_];
		if (class96 != null) {
			if ((class96.aByte1149 & 0x2) == 0) {
				if (i_171_ != 0) {
					if ((class96.aByte1149 & 0x4) != 0) {
						if ((i_171_ & 0x1) != 0)
							return;
					} else if ((i_171_ & 0x2) != 0)
						return;
				}
				int i_172_ = i * (anInt1752 * 1048375491);
				int i_173_ = i_172_ + anInt1752 * 1048375491;
				int i_174_ = i_166_ * (anInt1752 * 1048375491);
				int i_175_ = i_174_ + anInt1752 * 1048375491;
				float f = 0.0F;
				float f_176_ = 0.0F;
				float f_177_ = 0.0F;
				float f_178_ = 0.0F;
				float f_179_;
				float f_180_;
				float f_181_;
				float f_182_;
				float f_183_;
				float f_184_;
				float f_185_;
				float f_186_;
				float f_187_;
				float f_188_;
				float f_189_;
				float f_190_;
				float f_191_;
				float f_192_;
				float f_193_;
				float f_194_;
				if ((class96.aByte1149 & 0x1) != 0 && !bool) {
					int i_195_ = anIntArrayArray1754[i][i_166_];
					float f_196_ = aFloat9127 * (float) i_195_;
					float f_197_ = aFloat9123 * (float) i_195_;
					float f_198_ = aFloat9145 + (aFloat9135 * (float) i_172_ + f_196_ + aFloat9128 * (float) i_174_);
					f_179_ = aFloat9148 + (aFloat9136 * (float) i_172_ + f_197_ + aFloat9144 * (float) i_174_);
					if (f_198_ < -f_179_)
						return;
					float f_199_ = aFloat9145 + (aFloat9135 * (float) i_173_ + f_196_ + aFloat9128 * (float) i_174_);
					f_180_ = aFloat9148 + (aFloat9136 * (float) i_173_ + f_197_ + aFloat9144 * (float) i_174_);
					if (f_199_ < -f_180_)
						return;
					float f_200_ = aFloat9145 + (aFloat9135 * (float) i_173_ + f_196_ + aFloat9128 * (float) i_175_);
					f_181_ = aFloat9148 + (aFloat9136 * (float) i_173_ + f_197_ + aFloat9144 * (float) i_175_);
					if (f_200_ < -f_181_)
						return;
					float f_201_ = aFloat9145 + (aFloat9135 * (float) i_172_ + f_196_ + aFloat9128 * (float) i_175_);
					f_182_ = aFloat9148 + (aFloat9136 * (float) i_172_ + f_197_ + aFloat9144 * (float) i_175_);
					if (f_201_ < -f_182_)
						return;
					f_183_ = (class119.aFloat1452 + class119.aFloat1453 * f_198_ / f_179_);
					f_184_ = (class119.aFloat1452 + class119.aFloat1453 * f_199_ / f_180_);
					f_185_ = (class119.aFloat1452 + class119.aFloat1453 * f_200_ / f_181_);
					f_186_ = (class119.aFloat1452 + class119.aFloat1453 * f_201_ / f_182_);
					if (class101.aBool1191) {
						float f_202_ = f_198_ - class101.aFloat1192;
						if (f_202_ > 0.0F) {
							f = f_202_ / class101.aFloat1193;
							if (f > 1.0F)
								f = 1.0F;
						}
						f_202_ = f_199_ - class101.aFloat1192;
						if (f_202_ > 0.0F) {
							f_176_ = f_202_ / class101.aFloat1193;
							if (f_176_ > 1.0F)
								f_176_ = 1.0F;
						}
						f_202_ = f_200_ - class101.aFloat1192;
						if (f_202_ > 0.0F) {
							f_177_ = f_202_ / class101.aFloat1193;
							if (f_177_ > 1.0F)
								f_177_ = 1.0F;
						}
						f_202_ = f_201_ - class101.aFloat1192;
						if (f_202_ > 0.0F) {
							f_178_ = f_202_ / class101.aFloat1193;
							if (f_178_ > 1.0F)
								f_178_ = 1.0F;
						}
					}
					float f_203_ = aFloat9137 * (float) i_195_;
					float f_204_ = aFloat9138 * (float) i_195_;
					float f_205_ = aFloat9122 + (aFloat9133 * (float) i_172_ + f_203_ + aFloat9141 * (float) i_174_);
					f_187_ = (class119.aFloat1448 + class119.aFloat1451 * f_205_ / f_179_);
					float f_206_ = aFloat9121 + (aFloat9146 * (float) i_172_ + f_204_ + aFloat9142 * (float) i_174_);
					f_188_ = (class119.aFloat1444 + class119.aFloat1466 * f_206_ / f_179_);
					float f_207_ = aFloat9122 + (aFloat9133 * (float) i_173_ + f_203_ + aFloat9141 * (float) i_174_);
					f_189_ = (class119.aFloat1448 + class119.aFloat1451 * f_207_ / f_180_);
					float f_208_ = aFloat9121 + (aFloat9146 * (float) i_173_ + f_204_ + aFloat9142 * (float) i_174_);
					f_190_ = (class119.aFloat1444 + class119.aFloat1466 * f_208_ / f_180_);
					float f_209_ = aFloat9122 + (aFloat9133 * (float) i_173_ + f_203_ + aFloat9141 * (float) i_175_);
					f_191_ = (class119.aFloat1448 + class119.aFloat1451 * f_209_ / f_181_);
					float f_210_ = aFloat9121 + (aFloat9146 * (float) i_173_ + f_204_ + aFloat9142 * (float) i_175_);
					f_192_ = (class119.aFloat1444 + class119.aFloat1466 * f_210_ / f_181_);
					float f_211_ = aFloat9122 + (aFloat9133 * (float) i_172_ + f_203_ + aFloat9141 * (float) i_175_);
					f_193_ = (class119.aFloat1448 + class119.aFloat1451 * f_211_ / f_182_);
					float f_212_ = aFloat9121 + (aFloat9146 * (float) i_172_ + f_204_ + aFloat9142 * (float) i_175_);
					f_194_ = (class119.aFloat1444 + class119.aFloat1466 * f_212_ / f_182_);
				} else {
					int i_213_ = anIntArrayArray1754[i][i_166_];
					int i_214_ = anIntArrayArray1754[i + 1][i_166_];
					int i_215_ = anIntArrayArray1754[i + 1][i_166_ + 1];
					int i_216_ = anIntArrayArray1754[i][i_166_ + 1];
					float f_217_ = aFloat9145 + (aFloat9135 * (float) i_172_ + aFloat9127 * (float) i_213_ + aFloat9128 * (float) i_174_);
					f_179_ = aFloat9148 + (aFloat9136 * (float) i_172_ + aFloat9123 * (float) i_213_ + aFloat9144 * (float) i_174_);
					if (f_217_ < -f_179_)
						return;
					float f_218_ = aFloat9145 + (aFloat9135 * (float) i_173_ + aFloat9127 * (float) i_214_ + aFloat9128 * (float) i_174_);
					f_180_ = aFloat9148 + (aFloat9136 * (float) i_173_ + aFloat9123 * (float) i_214_ + aFloat9144 * (float) i_174_);
					if (f_218_ < -f_180_)
						return;
					float f_219_ = aFloat9145 + (aFloat9135 * (float) i_173_ + aFloat9127 * (float) i_215_ + aFloat9128 * (float) i_175_);
					f_181_ = aFloat9148 + (aFloat9136 * (float) i_173_ + aFloat9123 * (float) i_215_ + aFloat9144 * (float) i_175_);
					if (f_219_ < -f_181_)
						return;
					float f_220_ = aFloat9145 + (aFloat9135 * (float) i_172_ + aFloat9127 * (float) i_216_ + aFloat9128 * (float) i_175_);
					f_182_ = aFloat9148 + (aFloat9136 * (float) i_172_ + aFloat9123 * (float) i_216_ + aFloat9144 * (float) i_175_);
					if (f_220_ < -f_182_)
						return;
					f_183_ = (class119.aFloat1452 + class119.aFloat1453 * f_217_ / f_179_);
					f_184_ = (class119.aFloat1452 + class119.aFloat1453 * f_218_ / f_180_);
					f_185_ = (class119.aFloat1452 + class119.aFloat1453 * f_219_ / f_181_);
					f_186_ = (class119.aFloat1452 + class119.aFloat1453 * f_220_ / f_182_);
					if (bool) {
						float f_221_ = f_217_ - class101.aFloat1192;
						if (f_221_ > 0.0F) {
							f_221_ /= class101.aFloat1193;
							if (f_221_ > 1.0F)
								f_221_ = 1.0F;
							f = f_221_;
							int i_222_ = (int) ((float) class96.aShort1156 * f_221_);
							if (i_222_ > 0)
								i_213_ -= i_222_;
						}
						f_221_ = f_218_ - class101.aFloat1192;
						if (f_221_ > 0.0F) {
							f_221_ /= class101.aFloat1193;
							if (f_221_ > 1.0F)
								f_221_ = 1.0F;
							f_176_ = f_221_;
							int i_223_ = (int) ((float) class96.aShort1154 * f_221_);
							if (i_223_ > 0)
								i_214_ -= i_223_;
						}
						f_221_ = f_219_ - class101.aFloat1192;
						if (f_221_ > 0.0F) {
							f_221_ /= class101.aFloat1193;
							if (f_221_ > 1.0F)
								f_221_ = 1.0F;
							f_177_ = f_221_;
							int i_224_ = (int) ((float) class96.aShort1155 * f_221_);
							if (i_224_ > 0)
								i_215_ -= i_224_;
						}
						f_221_ = f_220_ - class101.aFloat1192;
						if (f_221_ > 0.0F) {
							f_221_ /= class101.aFloat1193;
							if (f_221_ > 1.0F)
								f_221_ = 1.0F;
							f_178_ = f_221_;
							int i_225_ = (int) ((float) class96.aShort1150 * f_221_);
							if (i_225_ > 0)
								i_216_ -= i_225_;
						}
					} else if (class101.aBool1191) {
						float f_226_ = f_217_ - class101.aFloat1192;
						if (f_226_ > 0.0F) {
							f = f_226_ / class101.aFloat1193;
							if (f > 1.0F)
								f = 1.0F;
						}
						f_226_ = f_218_ - class101.aFloat1192;
						if (f_226_ > 0.0F) {
							f_176_ = f_226_ / class101.aFloat1193;
							if (f_176_ > 1.0F)
								f_176_ = 1.0F;
						}
						f_226_ = f_219_ - class101.aFloat1192;
						if (f_226_ > 0.0F) {
							f_177_ = f_226_ / class101.aFloat1193;
							if (f_177_ > 1.0F)
								f_177_ = 1.0F;
						}
						f_226_ = f_220_ - class101.aFloat1192;
						if (f_226_ > 0.0F) {
							f_178_ = f_226_ / class101.aFloat1193;
							if (f_178_ > 1.0F)
								f_178_ = 1.0F;
						}
					}
					float f_227_ = aFloat9122 + (aFloat9133 * (float) i_172_ + aFloat9137 * (float) i_213_ + aFloat9141 * (float) i_174_);
					f_187_ = (class119.aFloat1448 + class119.aFloat1451 * f_227_ / f_179_);
					float f_228_ = aFloat9121 + (aFloat9146 * (float) i_172_ + aFloat9138 * (float) i_213_ + aFloat9142 * (float) i_174_);
					f_188_ = (class119.aFloat1444 + class119.aFloat1466 * f_228_ / f_179_);
					float f_229_ = aFloat9122 + (aFloat9133 * (float) i_173_ + aFloat9137 * (float) i_214_ + aFloat9141 * (float) i_174_);
					f_189_ = (class119.aFloat1448 + class119.aFloat1451 * f_229_ / f_180_);
					float f_230_ = aFloat9121 + (aFloat9146 * (float) i_173_ + aFloat9138 * (float) i_214_ + aFloat9142 * (float) i_174_);
					f_190_ = (class119.aFloat1444 + class119.aFloat1466 * f_230_ / f_180_);
					float f_231_ = aFloat9122 + (aFloat9133 * (float) i_173_ + aFloat9137 * (float) i_215_ + aFloat9141 * (float) i_175_);
					f_191_ = (class119.aFloat1448 + class119.aFloat1451 * f_231_ / f_181_);
					float f_232_ = aFloat9121 + (aFloat9146 * (float) i_173_ + aFloat9138 * (float) i_215_ + aFloat9142 * (float) i_175_);
					f_192_ = (class119.aFloat1444 + class119.aFloat1466 * f_232_ / f_181_);
					float f_233_ = aFloat9122 + (aFloat9133 * (float) i_172_ + aFloat9137 * (float) i_216_ + aFloat9141 * (float) i_175_);
					f_193_ = (class119.aFloat1448 + class119.aFloat1451 * f_233_ / f_182_);
					float f_234_ = aFloat9121 + (aFloat9146 * (float) i_172_ + aFloat9138 * (float) i_216_ + aFloat9142 * (float) i_175_);
					f_194_ = (class119.aFloat1444 + class119.aFloat1466 * f_234_ / f_182_);
				}
				Class163 class163 = null;
				boolean bool_235_ = false;
				if (class96.aShort1148 != -1) {
					class163 = (aClass180_Sub1_9126.aClass181_2059.method3544(class96.aShort1148 & 0xffff, (byte) -59));
					bool_235_ = class163.aBool1761;
				}
				boolean bool_236_ = class163 != null && method14603(class163.aByte1801);
				float f_237_ = f_176_ + f_177_ + f_178_;
				if (((f_191_ - f_193_) * (f_190_ - f_194_) - (f_192_ - f_194_) * (f_189_ - f_193_)) > 0.0F) {
					class119.aBool1445 = (f_191_ < 0.0F || f_193_ < 0.0F || f_189_ < 0.0F || f_191_ > (float) class119.anInt1442 || f_193_ > (float) class119.anInt1442 || f_189_ > (float) class119.anInt1442);
					if (f_237_ < 3.0F) {
						if (f_237_ > 0.0F) {
							if (bool_235_) {
								int i_238_ = -16777216;
								if (bool_236_)
									i_238_ = -1694498816;
								class119.method2079(true, true, false, f_192_, f_194_, f_190_, f_191_, f_193_, f_189_, f_185_, f_186_, f_184_, f_181_, f_182_, f_180_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, i_238_ | class96.anInt1151 & 0xffffff, i_238_ | class96.anInt1153 & 0xffffff, i_238_ | class96.anInt1158 & 0xffffff, class101.anInt1194 * -1009384223, f_177_ * 255.0F, f_178_ * 255.0F, f_176_ * 255.0F, class96.aShort1148 & 0xffff);
							} else {
								if (bool_236_)
									class119.anInt1441 = 100;
								class119.method2106(true, true, false, f_192_, f_194_, f_190_, f_191_, f_193_, f_189_, f_185_, f_186_, f_184_, Class597.method9915(class96.anInt1151, (((int) (f_177_ * 255.0F) << 24) | (class101.anInt1194 * -1009384223)), (short) -24474), Class597.method9915(class96.anInt1153, (((int) (f_178_ * 255.0F) << 24) | (class101.anInt1194 * -1009384223)), (short) -6307),
										Class597.method9915(class96.anInt1158, (((int) (f_176_ * 255.0F) << 24) | (class101.anInt1194 * -1009384223)), (short) -2899));
								class119.anInt1441 = 0;
							}
						} else if (bool_235_) {
							int i_239_ = -16777216;
							if (bool_236_)
								i_239_ = -1694498816;
							class119.method2079(true, true, false, f_192_, f_194_, f_190_, f_191_, f_193_, f_189_, f_185_, f_186_, f_184_, f_181_, f_182_, f_180_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, i_239_ | class96.anInt1151 & 0xffffff, i_239_ | class96.anInt1153 & 0xffffff, i_239_ | class96.anInt1158 & 0xffffff, 0, 0.0F, 0.0F, 0.0F, class96.aShort1148 & 0xffff);
						} else {
							if (bool_236_)
								class119.anInt1441 = 100;
							class119.method2106(true, true, false, f_192_, f_194_, f_190_, f_191_, f_193_, f_189_, f_185_, f_186_, f_184_, class96.anInt1151, class96.anInt1153, class96.anInt1158);
							class119.anInt1441 = 0;
						}
					} else
						class119.method2077(true, true, false, f_192_, f_194_, f_190_, f_191_, f_193_, f_189_, f_185_, f_186_, f_184_, class101.anInt1194 * -1009384223);
				}
				f_237_ = f + f_176_ + f_178_;
				if (((f_187_ - f_189_) * (f_194_ - f_190_) - (f_188_ - f_190_) * (f_193_ - f_189_)) > 0.0F) {
					class119.aBool1445 = (f_187_ < 0.0F || f_189_ < 0.0F || f_193_ < 0.0F || f_187_ > (float) class119.anInt1442 || f_189_ > (float) class119.anInt1442 || f_193_ > (float) class119.anInt1442);
					if (f_237_ < 3.0F) {
						if (bool_236_)
							class119.anInt1441 = -1694498816;
						if (f_237_ > 0.0F) {
							if (bool_235_) {
								int i_240_ = -16777216;
								if (bool_236_)
									i_240_ = -1694498816;
								class119.method2079(true, true, false, f_188_, f_190_, f_194_, f_187_, f_189_, f_193_, f_183_, f_184_, f_186_, f_179_, f_180_, f_182_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, i_240_ | class96.anInt1152 & 0xffffff, i_240_ | class96.anInt1158 & 0xffffff, i_240_ | class96.anInt1153 & 0xffffff, class101.anInt1194 * -1009384223, f * 255.0F, f_176_ * 255.0F, f_178_ * 255.0F, class96.aShort1148 & 0xffff);
							} else {
								if (bool_236_)
									class119.anInt1441 = 100;
								class119.method2106(true, true, false, f_188_, f_190_, f_194_, f_187_, f_189_, f_193_, f_183_, f_184_, f_186_, Class597.method9915(class96.anInt1152, (((int) (f * 255.0F) << 24) | (class101.anInt1194 * -1009384223)), (short) 1076), Class597.method9915(class96.anInt1158, (((int) (f_176_ * 255.0F) << 24) | (class101.anInt1194 * -1009384223)), (short) -13974),
										Class597.method9915(class96.anInt1153, (((int) (f_178_ * 255.0F) << 24) | (class101.anInt1194 * -1009384223)), (short) 23553));
								class119.anInt1441 = 0;
							}
						} else if (bool_235_) {
							int i_241_ = -16777216;
							if (bool_236_)
								i_241_ = -1694498816;
							class119.method2079(true, true, false, f_188_, f_190_, f_194_, f_187_, f_189_, f_193_, f_183_, f_184_, f_186_, f_179_, f_180_, f_182_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, i_241_ | class96.anInt1152 & 0xffffff, i_241_ | class96.anInt1158 & 0xffffff, i_241_ | class96.anInt1153 & 0xffffff, 0, 0.0F, 0.0F, 0.0F, class96.aShort1148 & 0xffff);
						} else {
							if (bool_236_)
								class119.anInt1441 = 100;
							class119.method2106(true, true, false, f_188_, f_190_, f_194_, f_187_, f_189_, f_193_, f_183_, f_184_, f_186_, class96.anInt1152, class96.anInt1158, class96.anInt1153);
							class119.anInt1441 = 0;
						}
					} else
						class119.method2077(true, true, false, f_188_, f_190_, f_194_, f_187_, f_189_, f_193_, f_183_, f_184_, f_186_, class101.anInt1194 * -1009384223);
				}
			}
		} else {
			Class94 class94 = aClass94ArrayArray9131[i][i_166_];
			if (class94 != null) {
				if (i_171_ != 0) {
					if ((class94.aByte1137 & 0x4) != 0) {
						if ((i_171_ & 0x1) != 0)
							return;
					} else if ((i_171_ & 0x2) != 0)
						return;
				}
				for (int i_242_ = 0; i_242_ < class94.aShort1136; i_242_++) {
					int i_243_ = (class94.aShortArray1135[i_242_] + (i << anInt1753 * 1252000143));
					int i_244_ = class94.aShortArray1139[i_242_];
					int i_245_ = (class94.aShortArray1140[i_242_] + (i_166_ << anInt1753 * 1252000143));
					float f = aFloat9145 + (aFloat9135 * (float) i_243_ + aFloat9127 * (float) i_244_ + aFloat9128 * (float) i_245_);
					float f_246_ = aFloat9148 + (aFloat9136 * (float) i_243_ + aFloat9123 * (float) i_244_ + aFloat9144 * (float) i_245_);
					if (f < -f_246_)
						return;
					float f_247_ = (class119.aFloat1452 + class119.aFloat1453 * f / f_246_);
					fs_170_[i_242_] = 0.0F;
					if (bool) {
						float f_248_ = f - class101.aFloat1192;
						if (f_248_ > 0.0F) {
							f_248_ /= class101.aFloat1193;
							if (f_248_ > 1.0F)
								f_248_ = 1.0F;
							fs_170_[i_242_] = f_248_;
							int i_249_ = (int) ((float) (class94.aShortArray1141[i_242_]) * f_248_);
							if (i_249_ > 0)
								i_244_ -= i_249_;
						}
					} else if (class101.aBool1191) {
						float f_250_ = f - class101.aFloat1192;
						if (f_250_ > 0.0F) {
							fs_170_[i_242_] = f_250_ / class101.aFloat1193;
							if (fs_170_[i_242_] > 1.0F)
								fs_170_[i_242_] = 1.0F;
						}
					}
					float f_251_ = aFloat9122 + (aFloat9133 * (float) i_243_ + aFloat9137 * (float) i_244_ + aFloat9141 * (float) i_245_);
					float f_252_ = aFloat9121 + (aFloat9146 * (float) i_243_ + aFloat9138 * (float) i_244_ + aFloat9142 * (float) i_245_);
					fs[i_242_] = (class119.aFloat1448 + class119.aFloat1451 * f_251_ / f_246_);
					fs_167_[i_242_] = (class119.aFloat1444 + class119.aFloat1466 * f_252_ / f_246_);
					fs_168_[i_242_] = f_247_;
					fs_169_[i_242_] = f_246_;
				}
				if (class94.aShortArray1143 != null) {
					for (int i_253_ = 0; i_253_ < class94.aShort1145; i_253_++) {
						int i_254_ = i_253_ * 3;
						int i_255_ = i_254_ + 1;
						int i_256_ = i_255_ + 1;
						float f = fs[i_254_];
						float f_257_ = fs[i_255_];
						float f_258_ = fs[i_256_];
						float f_259_ = fs_167_[i_254_];
						float f_260_ = fs_167_[i_255_];
						float f_261_ = fs_167_[i_256_];
						float f_262_ = (fs_170_[i_254_] + fs_170_[i_255_] + fs_170_[i_256_]);
						if (((f - f_257_) * (f_261_ - f_260_) - (f_259_ - f_260_) * (f_258_ - f_257_)) > 0.0F) {
							class119.aBool1445 = (f < 0.0F || f_257_ < 0.0F || f_258_ < 0.0F || f > (float) class119.anInt1442 || f_257_ > (float) class119.anInt1442 || f_258_ > (float) class119.anInt1442);
							Class163 class163 = null;
							boolean bool_263_ = false;
							if (class94.aShortArray1143[i_253_] != -1) {
								class163 = (aClass180_Sub1_9126.aClass181_2059.method3544((class94.aShortArray1143[i_253_] & 0xffff), (byte) -96));
								bool_263_ = class163.aBool1761;
							}
							if (f_262_ < 3.0F) {
								if (f_262_ > 0.0F) {
									if (bool_263_) {
										int i_264_ = -16777216;
										if (method14603(class163.aByte1801))
											i_264_ = -1694498816;
										class119.method2079(true, true, false, f_259_, f_260_, f_261_, f, f_257_, f_258_, fs_168_[i_254_], fs_168_[i_255_], fs_168_[i_256_], fs_169_[i_254_], fs_169_[i_255_], fs_169_[i_256_], ((float) (class94.aShortArray1135[i_254_]) / (float) (anInt1752 * 1048375491)), ((float) (class94.aShortArray1135[i_255_]) / (float) (anInt1752 * 1048375491)), ((float) (class94.aShortArray1135[i_256_]) / (float) (anInt1752 * 1048375491)),
												((float) (class94.aShortArray1140[i_254_]) / (float) (anInt1752 * 1048375491)), ((float) (class94.aShortArray1140[i_255_]) / (float) (anInt1752 * 1048375491)), ((float) (class94.aShortArray1140[i_256_]) / (float) (anInt1752 * 1048375491)), i_264_ | (class94.anIntArray1142[i_254_]) & 0xffffff, i_264_ | (class94.anIntArray1142[i_255_]) & 0xffffff, i_264_ | (class94.anIntArray1142[i_256_]) & 0xffffff, class101.anInt1194 * -1009384223,
												fs_170_[i_254_] * 255.0F, fs_170_[i_255_] * 255.0F, fs_170_[i_256_] * 255.0F, (class94.aShortArray1143[i_253_] & 0xffff));
									} else if ((class94.anIntArray1142[i_254_] & 0xffffff) != 0) {
										class119.method2106(true, true, false, f_259_, f_260_, f_261_, f, f_257_, f_258_, fs_168_[i_254_], fs_168_[i_255_], fs_168_[i_256_], (Class597.method9915(class94.anIntArray1142[i_254_], ((int) (fs_170_[i_254_] * 255.0F) << 24 | (class101.anInt1194 * -1009384223)), (short) -11309)), (Class597.method9915(class94.anIntArray1142[i_255_], ((int) (fs_170_[i_255_] * 255.0F) << 24 | (class101.anInt1194 * -1009384223)), (short) -21164)),
												(Class597.method9915(class94.anIntArray1142[i_256_], ((int) (fs_170_[i_256_] * 255.0F) << 24 | (class101.anInt1194 * -1009384223)), (short) 13447)));
										class119.anInt1441 = 0;
									}
								} else if (bool_263_) {
									int i_265_ = -16777216;
									if (method14603(class163.aByte1801))
										i_265_ = -1694498816;
									class119.method2079(true, true, false, f_259_, f_260_, f_261_, f, f_257_, f_258_, fs_168_[i_254_], fs_168_[i_255_], fs_168_[i_256_], fs_169_[i_254_], fs_169_[i_255_], fs_169_[i_256_], ((float) (class94.aShortArray1135[i_254_]) / (float) (anInt1752 * 1048375491)), ((float) (class94.aShortArray1135[i_255_]) / (float) (anInt1752 * 1048375491)), ((float) (class94.aShortArray1135[i_256_]) / (float) (anInt1752 * 1048375491)),
											((float) (class94.aShortArray1140[i_254_]) / (float) (anInt1752 * 1048375491)), ((float) (class94.aShortArray1140[i_255_]) / (float) (anInt1752 * 1048375491)), ((float) (class94.aShortArray1140[i_256_]) / (float) (anInt1752 * 1048375491)), i_265_ | (class94.anIntArray1142[i_254_]) & 0xffffff, i_265_ | (class94.anIntArray1142[i_255_]) & 0xffffff, i_265_ | (class94.anIntArray1142[i_256_]) & 0xffffff, 0, 0.0F, 0.0F, 0.0F,
											(class94.aShortArray1143[i_253_] & 0xffff));
								} else if ((class94.anIntArray1142[i_254_] & 0xffffff) != 0) {
									class119.method2106(true, true, false, f_259_, f_260_, f_261_, f, f_257_, f_258_, fs_168_[i_254_], fs_168_[i_255_], fs_168_[i_256_], class94.anIntArray1142[i_254_], class94.anIntArray1142[i_255_], class94.anIntArray1142[i_256_]);
									class119.anInt1441 = 0;
								}
							} else
								class119.method2077(true, true, false, f_259_, f_260_, f_261_, f, f_257_, f_258_, fs_168_[i_254_], fs_168_[i_255_], fs_168_[i_256_], (class101.anInt1194 * -1009384223));
						}
					}
				} else {
					for (int i_266_ = 0; i_266_ < class94.aShort1145; i_266_++) {
						int i_267_ = i_266_ * 3;
						int i_268_ = i_267_ + 1;
						int i_269_ = i_268_ + 1;
						float f = fs[i_267_];
						float f_270_ = fs[i_268_];
						float f_271_ = fs[i_269_];
						float f_272_ = fs_167_[i_267_];
						float f_273_ = fs_167_[i_268_];
						float f_274_ = fs_167_[i_269_];
						float f_275_ = (fs_170_[i_267_] + fs_170_[i_268_] + fs_170_[i_269_]);
						if (((f - f_270_) * (f_274_ - f_273_) - (f_272_ - f_273_) * (f_271_ - f_270_)) > 0.0F) {
							class119.aBool1445 = (f < 0.0F || f_270_ < 0.0F || f_271_ < 0.0F || f > (float) class119.anInt1442 || f_270_ > (float) class119.anInt1442 || f_271_ > (float) class119.anInt1442);
							if (f_275_ < 3.0F) {
								if (f_275_ > 0.0F) {
									if ((class94.anIntArray1142[i_267_] & 0xffffff) != 0)
										class119.method2106(true, true, false, f_272_, f_273_, f_274_, f, f_270_, f_271_, fs_168_[i_267_], fs_168_[i_268_], fs_168_[i_269_], (Class388.method6456(class94.anIntArray1142[i_267_], (class101.anInt1194 * -1009384223), fs_170_[i_267_] * 255.0F, (byte) -11)), (Class388.method6456(class94.anIntArray1142[i_268_], (class101.anInt1194 * -1009384223), fs_170_[i_268_] * 255.0F, (byte) 9)),
												(Class388.method6456(class94.anIntArray1142[i_269_], (class101.anInt1194 * -1009384223), fs_170_[i_269_] * 255.0F, (byte) 9)));
								} else if ((class94.anIntArray1142[i_267_] & 0xffffff) != 0)
									class119.method2106(true, true, false, f_272_, f_273_, f_274_, f, f_270_, f_271_, fs_168_[i_267_], fs_168_[i_268_], fs_168_[i_269_], class94.anIntArray1142[i_267_], class94.anIntArray1142[i_268_], class94.anIntArray1142[i_269_]);
							} else
								class119.method2077(true, true, false, f_272_, f_273_, f_274_, f, f_270_, f_271_, fs_168_[i_267_], fs_168_[i_268_], fs_168_[i_269_], (class101.anInt1194 * -1009384223));
						}
					}
				}
			}
		}
	}

	public void method2589(int i, int i_276_, int[] is, int[] is_277_, int[] is_278_, int[] is_279_, int[] is_280_, int[] is_281_, int[] is_282_, int[] is_283_, int[] is_284_, int[] is_285_, int[] is_286_, Class178 class178, boolean bool) {
		if (aClass139ArrayArray9143 == null) {
			aClass139ArrayArray9143 = new Class139[anInt1750 * 1210322533][anInt1751 * -533476177];
			aClass111ArrayArray9140 = new Class111[anInt1750 * 1210322533][anInt1751 * -533476177];
		} else if (aClass96ArrayArray9130 != null || aClass126ArrayArray9132 != null)
			throw new IllegalStateException();
		boolean bool_287_ = false;
		if (is_283_.length == 2 && is_280_.length == 2 && (is_283_[0] == is_283_[1] || is_285_[0] != -1 && is_285_[0] == is_285_[1])) {
			bool_287_ = true;
			for (int i_288_ = 1; i_288_ < 2; i_288_++) {
				int i_289_ = is[is_280_[i_288_]];
				int i_290_ = is_278_[is_280_[i_288_]];
				if (i_289_ != 0 && i_289_ != anInt1752 * 1048375491 || i_290_ != 0 && i_290_ != anInt1752 * 1048375491) {
					bool_287_ = false;
					break;
				}
			}
		}
		if (!bool_287_) {
			Class111 class111 = new Class111();
			short i_291_ = (short) is.length;
			int i_292_ = (short) is_283_.length;
			class111.aShort1402 = i_291_;
			class111.aShortArray1393 = new short[i_291_];
			class111.aShortArray1395 = new short[i_291_];
			class111.aShortArray1396 = new short[i_291_];
			class111.aShortArray1398 = new short[i_291_];
			for (int i_293_ = 0; i_293_ < i_291_; i_293_++) {
				int i_294_ = is[i_293_];
				int i_295_ = is_278_[i_293_];
				if (i_294_ == 0 && i_295_ == 0)
					class111.aShortArray1393[i_293_] = (short) (aByteArrayArray9149[i][i_276_] - aByteArrayArray9129[i][i_276_]);
				else if (i_294_ == 0 && i_295_ == anInt1752 * 1048375491)
					class111.aShortArray1393[i_293_] = (short) (aByteArrayArray9149[i][i_276_ + 1] - aByteArrayArray9129[i][i_276_ + 1]);
				else if (i_294_ == anInt1752 * 1048375491 && i_295_ == anInt1752 * 1048375491)
					class111.aShortArray1393[i_293_] = (short) (aByteArrayArray9149[i + 1][i_276_ + 1] - aByteArrayArray9129[i + 1][i_276_ + 1]);
				else if (i_294_ == anInt1752 * 1048375491 && i_295_ == 0)
					class111.aShortArray1393[i_293_] = (short) (aByteArrayArray9149[i + 1][i_276_] - aByteArrayArray9129[i + 1][i_276_]);
				else {
					int i_296_ = (((aByteArrayArray9149[i][i_276_] - aByteArrayArray9129[i][i_276_]) * (anInt1752 * 1048375491 - i_294_)) + (aByteArrayArray9149[i + 1][i_276_] - aByteArrayArray9129[i + 1][i_276_]) * i_294_);
					int i_297_ = (((aByteArrayArray9149[i][i_276_ + 1] - aByteArrayArray9129[i][i_276_ + 1]) * (anInt1752 * 1048375491 - i_294_)) + ((aByteArrayArray9149[i + 1][i_276_ + 1] - aByteArrayArray9129[i + 1][i_276_ + 1]) * i_294_));
					class111.aShortArray1393[i_293_] = (short) ((i_296_ * (anInt1752 * 1048375491 - i_295_) + i_297_ * i_295_) >> anInt1753 * -1790967010);
				}
				int i_298_ = (i << anInt1753 * 1252000143) + i_294_;
				int i_299_ = (i_276_ << anInt1753 * 1252000143) + i_295_;
				class111.aShortArray1395[i_293_] = (short) i_294_;
				class111.aShortArray1398[i_293_] = (short) i_295_;
				class111.aShortArray1396[i_293_] = (short) (method2593(i_298_, i_299_, -1151432033) + (is_277_ != null ? is_277_[i_293_] : 0));
				if (class111.aShortArray1393[i_293_] < 2)
					class111.aShortArray1393[i_293_] = (short) 2;
			}
			boolean bool_300_ = false;
			int i_301_ = 0;
			for (int i_302_ = 0; i_302_ < i_292_; i_302_++) {
				if (is_283_[i_302_] >= 0 || is_284_ != null && is_284_[i_302_] >= 0)
					i_301_++;
				int i_303_ = is_285_[i_302_];
				if (i_303_ != -1) {
					Class163 class163 = aClass180_Sub1_9126.aClass181_2059.method3544(i_303_, (byte) -29);
					if (!class163.aBool1806) {
						bool_300_ = true;
						if (method14603(class163.aByte1801) || class163.aByte1781 != 0 || class163.aByte1797 != 0)
							class111.aByte1394 |= 0x4;
					}
				}
			}
			class111.anIntArray1404 = new int[i_301_];
			if (is_284_ != null)
				class111.anIntArray1397 = new int[i_301_];
			class111.aShortArray1399 = new short[i_301_];
			class111.aShortArray1400 = new short[i_301_];
			class111.aShortArray1401 = new short[i_301_];
			if (bool_300_) {
				class111.aShortArray1405 = new short[i_301_];
				class111.aShortArray1392 = new short[i_301_];
			}
			for (int i_304_ = 0; i_304_ < i_292_; i_304_++) {
				if (is_283_[i_304_] >= 0 || is_284_ != null && is_284_[i_304_] >= 0) {
					if (is_283_[i_304_] >= 0)
						class111.anIntArray1404[class111.aShort1403] = Class453.method7333(is_283_[i_304_], (byte) 10);
					else
						class111.anIntArray1404[class111.aShort1403] = -1;
					if (is_284_ != null) {
						if (is_284_[i_304_] != -1)
							class111.anIntArray1397[class111.aShort1403] = Class453.method7333(is_284_[i_304_], (byte) 10);
						else
							class111.anIntArray1397[class111.aShort1403] = -1;
					}
					class111.aShortArray1399[class111.aShort1403] = (short) is_280_[i_304_];
					class111.aShortArray1400[class111.aShort1403] = (short) is_281_[i_304_];
					class111.aShortArray1401[class111.aShort1403] = (short) is_282_[i_304_];
					if (bool_300_) {
						if (is_285_[i_304_] != -1 && !(aClass180_Sub1_9126.aClass181_2059.method3544(is_285_[i_304_], (byte) -17).aBool1806)) {
							class111.aShortArray1405[class111.aShort1403] = (short) is_285_[i_304_];
							class111.aShortArray1392[class111.aShort1403] = (short) is_286_[i_304_];
						} else
							class111.aShortArray1405[class111.aShort1403] = (short) -1;
					}
					class111.aShort1403++;
				}
			}
			aClass111ArrayArray9140[i][i_276_] = class111;
		} else if (is_283_[0] >= 0 || is_284_ != null && is_284_[0] >= 0) {
			Class139 class139 = new Class139();
			int i_305_ = is_283_[0];
			int i_306_ = is_285_[0];
			if (is_284_ != null) {
				class139.anInt1645 = Class395.method6504(Class453.method7333(is_284_[0], (byte) 10), (aByteArrayArray9149[i][i_276_] - aByteArrayArray9129[i][i_276_]), -501584282);
				if (i_305_ == -1)
					class139.aByte1646 |= 0x2;
			}
			if ((anIntArrayArray1754[i][i_276_] == anIntArrayArray1754[i + 1][i_276_]) && (anIntArrayArray1754[i][i_276_] == anIntArrayArray1754[i + 1][i_276_ + 1]) && (anIntArrayArray1754[i][i_276_] == anIntArrayArray1754[i][i_276_ + 1]))
				class139.aByte1646 |= 0x1;
			Class163 class163 = null;
			if (i_306_ != -1)
				class163 = aClass180_Sub1_9126.aClass181_2059.method3544(i_306_, (byte) -53);
			if (class163 != null && (class139.aByte1646 & 0x2) == 0 && !class163.aBool1806) {
				class139.aShort1641 = (short) (aByteArrayArray9149[i][i_276_] - aByteArrayArray9129[i][i_276_]);
				class139.aShort1640 = (short) (aByteArrayArray9149[i + 1][i_276_] - aByteArrayArray9129[i + 1][i_276_]);
				class139.aShort1642 = (short) (aByteArrayArray9149[i + 1][i_276_ + 1] - aByteArrayArray9129[i + 1][i_276_ + 1]);
				class139.aShort1643 = (short) (aByteArrayArray9149[i][i_276_ + 1] - aByteArrayArray9129[i][i_276_ + 1]);
				class139.aShort1644 = (short) i_306_;
				if (method14603(class163.aByte1801) || class163.aByte1781 != 0 || class163.aByte1797 != 0)
					class139.aByte1646 |= 0x4;
			} else {
				short i_307_ = Class453.method7333(i_305_, (byte) 10);
				class139.aShort1641 = (short) Class395.method6504(i_307_, ((aByteArrayArray9149[i][i_276_]) - (aByteArrayArray9129[i][i_276_])), -501584282);
				class139.aShort1640 = (short) Class395.method6504(i_307_, ((aByteArrayArray9149[i + 1][i_276_]) - (aByteArrayArray9129[i + 1][i_276_])), -501584282);
				class139.aShort1642 = (short) Class395.method6504(i_307_, ((aByteArrayArray9149[i + 1][i_276_ + 1]) - (aByteArrayArray9129[i + 1][i_276_ + 1])), -501584282);
				class139.aShort1643 = (short) Class395.method6504(i_307_, ((aByteArrayArray9149[i][i_276_ + 1]) - (aByteArrayArray9129[i][i_276_ + 1])), -501584282);
				class139.aShort1644 = (short) -1;
			}
			aClass139ArrayArray9143[i][i_276_] = class139;
		}
	}

	public void method2613(Class527_Sub8_Sub8 class527_sub8_sub8, int i, int i_308_, int i_309_, int i_310_, boolean bool) {
		/* empty */
	}

	public void method2594(int i, int i_311_, int i_312_, int i_313_, int i_314_, int i_315_, int i_316_, boolean[][] bools) {
		Class101 class101 = aClass180_Sub1_9126.method14835(Thread.currentThread());
		Class119 class119 = class101.aClass119_1197;
		class119.anInt1441 = 0;
		class119.aBool1445 = true;
		aClass180_Sub1_9126.method14829();
		if (aClass96ArrayArray9130 != null || aClass126ArrayArray9132 != null)
			method14616(i, i_311_, i_312_, i_313_, i_314_, i_315_, i_316_, bools, class101, class119, class101.aFloatArray1228, class101.aFloatArray1229);
		else if (aClass139ArrayArray9143 != null)
			method14600(i, i_311_, i_312_, i_313_, i_314_, i_315_, i_316_, bools, class101, class119, class101.aFloatArray1228, class101.aFloatArray1229);
	}

	void method14600(int i, int i_317_, int i_318_, int i_319_, int i_320_, int i_321_, int i_322_, boolean[][] bools, Class101 class101, Class119 class119, float[] fs, float[] fs_323_) {
		int i_324_ = (i_322_ - i_320_) * i_318_ / 256;
		int i_325_ = i_318_ >> 8;
		boolean bool = class101.aBool1227;
		aClass180_Sub1_9126.method3182(false);
		class119.aBool1467 = false;
		class119.aBool1443 = false;
		int i_326_ = i;
		int i_327_ = i_317_ + i_324_;
		for (int i_328_ = i_319_; i_328_ < i_321_; i_328_++) {
			for (int i_329_ = i_320_; i_329_ < i_322_; i_329_++) {
				if (bools[i_328_ - i_319_][i_329_ - i_320_]) {
					if (aClass139ArrayArray9143[i_328_][i_329_] != null) {
						Class139 class139 = aClass139ArrayArray9143[i_328_][i_329_];
						if (class139.aShort1644 != -1 && (class139.aByte1646 & 0x2) == 0 && class139.anInt1645 == -1) {
							int i_330_ = aClass180_Sub1_9126.method14825((class139.aShort1644) & 0xffff);
							class119.method2073(true, true, false, (float) (i_327_ - i_325_), (float) (i_327_ - i_325_), (float) i_327_, (float) (i_326_ + i_325_), (float) i_326_, (float) (i_326_ + i_325_), 100.0F, 100.0F, 100.0F, (float) Class395.method6504(i_330_, ((class139.aShort1642) & 0xffff), -501584282), (float) Class395.method6504(i_330_, ((class139.aShort1643) & 0xffff), -501584282), (float) Class395.method6504(i_330_, ((class139.aShort1640) & 0xffff), -501584282));
							class119.method2073(true, true, false, (float) i_327_, (float) i_327_, (float) (i_327_ - i_325_), (float) i_326_, (float) (i_326_ + i_325_), (float) i_326_, 100.0F, 100.0F, 100.0F, (float) Class395.method6504(i_330_, ((class139.aShort1641) & 0xffff), -501584282), (float) Class395.method6504(i_330_, ((class139.aShort1640) & 0xffff), -501584282), (float) Class395.method6504(i_330_, ((class139.aShort1643) & 0xffff), -501584282));
						} else if (class139.anInt1645 == -1) {
							class119.method2073(true, true, false, (float) (i_327_ - i_325_), (float) (i_327_ - i_325_), (float) i_327_, (float) (i_326_ + i_325_), (float) i_326_, (float) (i_326_ + i_325_), 100.0F, 100.0F, 100.0F, (float) (class139.aShort1642 & 0xffff), (float) (class139.aShort1643 & 0xffff), (float) (class139.aShort1640 & 0xffff));
							class119.method2073(true, true, false, (float) i_327_, (float) i_327_, (float) (i_327_ - i_325_), (float) i_326_, (float) (i_326_ + i_325_), (float) i_326_, 100.0F, 100.0F, 100.0F, (float) (class139.aShort1641 & 0xffff), (float) (class139.aShort1640 & 0xffff), (float) (class139.aShort1643 & 0xffff));
						} else {
							int i_331_ = class139.anInt1645;
							class119.method2073(true, true, false, (float) (i_327_ - i_325_), (float) (i_327_ - i_325_), (float) i_327_, (float) (i_326_ + i_325_), (float) i_326_, (float) (i_326_ + i_325_), 100.0F, 100.0F, 100.0F, (float) i_331_, (float) i_331_, (float) i_331_);
							class119.method2073(true, true, false, (float) i_327_, (float) i_327_, (float) (i_327_ - i_325_), (float) i_326_, (float) (i_326_ + i_325_), (float) i_326_, 100.0F, 100.0F, 100.0F, (float) i_331_, (float) i_331_, (float) i_331_);
						}
					} else if (aClass111ArrayArray9140[i_328_][i_329_] != null) {
						Class111 class111 = aClass111ArrayArray9140[i_328_][i_329_];
						for (int i_332_ = 0; i_332_ < class111.aShort1402; i_332_++) {
							fs[i_332_] = (float) (i_326_ + (class111.aShortArray1395[i_332_] * i_325_ / (anInt1752 * 1048375491)));
							fs_323_[i_332_] = (float) (i_327_ - (class111.aShortArray1398[i_332_] * i_325_ / (anInt1752 * 1048375491)));
						}
						for (int i_333_ = 0; i_333_ < class111.aShort1403; i_333_++) {
							short i_334_ = class111.aShortArray1399[i_333_];
							short i_335_ = class111.aShortArray1400[i_333_];
							short i_336_ = class111.aShortArray1401[i_333_];
							float f = fs[i_334_];
							float f_337_ = fs[i_335_];
							float f_338_ = fs[i_336_];
							float f_339_ = fs_323_[i_334_];
							float f_340_ = fs_323_[i_335_];
							float f_341_ = fs_323_[i_336_];
							if (class111.anIntArray1397 != null && class111.anIntArray1397[i_333_] != -1) {
								int i_342_ = class111.anIntArray1397[i_333_];
								class119.method2073(true, true, false, f_339_, f_340_, f_341_, f, f_337_, f_338_, 100.0F, 100.0F, 100.0F, (float) (Class395.method6504(i_342_, (class111.aShortArray1393[i_334_]), -501584282)), (float) (Class395.method6504(i_342_, (class111.aShortArray1393[i_335_]), -501584282)), (float) (Class395.method6504(i_342_, (class111.aShortArray1393[i_336_]), -501584282)));
							} else if (class111.aShortArray1405 != null && (class111.aShortArray1405[i_333_] != -1)) {
								int i_343_ = (aClass180_Sub1_9126.method14825(class111.aShortArray1405[i_333_] & 0xffff));
								class119.method2073(true, true, false, f_339_, f_340_, f_341_, f, f_337_, f_338_, 100.0F, 100.0F, 100.0F, (float) (Class395.method6504(i_343_, (class111.aShortArray1393[i_334_]), -501584282)), (float) (Class395.method6504(i_343_, (class111.aShortArray1393[i_335_]), -501584282)), (float) (Class395.method6504(i_343_, (class111.aShortArray1393[i_336_]), -501584282)));
							} else {
								int i_344_ = class111.anIntArray1404[i_333_];
								class119.method2073(true, true, false, f_339_, f_340_, f_341_, f, f_337_, f_338_, 100.0F, 100.0F, 100.0F, (float) (Class395.method6504(i_344_, (class111.aShortArray1393[i_334_]), -501584282)), (float) (Class395.method6504(i_344_, (class111.aShortArray1393[i_335_]), -501584282)), (float) (Class395.method6504(i_344_, (class111.aShortArray1393[i_336_]), -501584282)));
							}
						}
					}
				}
				i_327_ -= i_325_;
			}
			i_327_ = i_317_ + i_324_;
			i_326_ += i_325_;
		}
		class119.aBool1467 = true;
		aClass180_Sub1_9126.method3182(bool);
	}

	public void method2631(Class527_Sub8_Sub8 class527_sub8_sub8, int i, int i_345_, int i_346_, int i_347_, boolean bool) {
		/* empty */
	}

	public Class527_Sub8_Sub8 method2597(int i, int i_348_, Class527_Sub8_Sub8 class527_sub8_sub8) {
		return null;
	}

	public void method2618(int i, int i_349_, int[] is, int[] is_350_, int[] is_351_, int[] is_352_, int[] is_353_, int[] is_354_, int[] is_355_, int[] is_356_, int[] is_357_, int[] is_358_, int[] is_359_, Class178 class178, boolean bool) {
		if (aClass139ArrayArray9143 == null) {
			aClass139ArrayArray9143 = new Class139[anInt1750 * 1210322533][anInt1751 * -533476177];
			aClass111ArrayArray9140 = new Class111[anInt1750 * 1210322533][anInt1751 * -533476177];
		} else if (aClass96ArrayArray9130 != null || aClass126ArrayArray9132 != null)
			throw new IllegalStateException();
		boolean bool_360_ = false;
		if (is_356_.length == 2 && is_353_.length == 2 && (is_356_[0] == is_356_[1] || is_358_[0] != -1 && is_358_[0] == is_358_[1])) {
			bool_360_ = true;
			for (int i_361_ = 1; i_361_ < 2; i_361_++) {
				int i_362_ = is[is_353_[i_361_]];
				int i_363_ = is_351_[is_353_[i_361_]];
				if (i_362_ != 0 && i_362_ != anInt1752 * 1048375491 || i_363_ != 0 && i_363_ != anInt1752 * 1048375491) {
					bool_360_ = false;
					break;
				}
			}
		}
		if (!bool_360_) {
			Class111 class111 = new Class111();
			short i_364_ = (short) is.length;
			int i_365_ = (short) is_356_.length;
			class111.aShort1402 = i_364_;
			class111.aShortArray1393 = new short[i_364_];
			class111.aShortArray1395 = new short[i_364_];
			class111.aShortArray1396 = new short[i_364_];
			class111.aShortArray1398 = new short[i_364_];
			for (int i_366_ = 0; i_366_ < i_364_; i_366_++) {
				int i_367_ = is[i_366_];
				int i_368_ = is_351_[i_366_];
				if (i_367_ == 0 && i_368_ == 0)
					class111.aShortArray1393[i_366_] = (short) (aByteArrayArray9149[i][i_349_] - aByteArrayArray9129[i][i_349_]);
				else if (i_367_ == 0 && i_368_ == anInt1752 * 1048375491)
					class111.aShortArray1393[i_366_] = (short) (aByteArrayArray9149[i][i_349_ + 1] - aByteArrayArray9129[i][i_349_ + 1]);
				else if (i_367_ == anInt1752 * 1048375491 && i_368_ == anInt1752 * 1048375491)
					class111.aShortArray1393[i_366_] = (short) (aByteArrayArray9149[i + 1][i_349_ + 1] - aByteArrayArray9129[i + 1][i_349_ + 1]);
				else if (i_367_ == anInt1752 * 1048375491 && i_368_ == 0)
					class111.aShortArray1393[i_366_] = (short) (aByteArrayArray9149[i + 1][i_349_] - aByteArrayArray9129[i + 1][i_349_]);
				else {
					int i_369_ = (((aByteArrayArray9149[i][i_349_] - aByteArrayArray9129[i][i_349_]) * (anInt1752 * 1048375491 - i_367_)) + (aByteArrayArray9149[i + 1][i_349_] - aByteArrayArray9129[i + 1][i_349_]) * i_367_);
					int i_370_ = (((aByteArrayArray9149[i][i_349_ + 1] - aByteArrayArray9129[i][i_349_ + 1]) * (anInt1752 * 1048375491 - i_367_)) + ((aByteArrayArray9149[i + 1][i_349_ + 1] - aByteArrayArray9129[i + 1][i_349_ + 1]) * i_367_));
					class111.aShortArray1393[i_366_] = (short) ((i_369_ * (anInt1752 * 1048375491 - i_368_) + i_370_ * i_368_) >> anInt1753 * -1790967010);
				}
				int i_371_ = (i << anInt1753 * 1252000143) + i_367_;
				int i_372_ = (i_349_ << anInt1753 * 1252000143) + i_368_;
				class111.aShortArray1395[i_366_] = (short) i_367_;
				class111.aShortArray1398[i_366_] = (short) i_368_;
				class111.aShortArray1396[i_366_] = (short) (method2593(i_371_, i_372_, -1151432033) + (is_350_ != null ? is_350_[i_366_] : 0));
				if (class111.aShortArray1393[i_366_] < 2)
					class111.aShortArray1393[i_366_] = (short) 2;
			}
			boolean bool_373_ = false;
			int i_374_ = 0;
			for (int i_375_ = 0; i_375_ < i_365_; i_375_++) {
				if (is_356_[i_375_] >= 0 || is_357_ != null && is_357_[i_375_] >= 0)
					i_374_++;
				int i_376_ = is_358_[i_375_];
				if (i_376_ != -1) {
					Class163 class163 = aClass180_Sub1_9126.aClass181_2059.method3544(i_376_, (byte) -93);
					if (!class163.aBool1806) {
						bool_373_ = true;
						if (method14603(class163.aByte1801) || class163.aByte1781 != 0 || class163.aByte1797 != 0)
							class111.aByte1394 |= 0x4;
					}
				}
			}
			class111.anIntArray1404 = new int[i_374_];
			if (is_357_ != null)
				class111.anIntArray1397 = new int[i_374_];
			class111.aShortArray1399 = new short[i_374_];
			class111.aShortArray1400 = new short[i_374_];
			class111.aShortArray1401 = new short[i_374_];
			if (bool_373_) {
				class111.aShortArray1405 = new short[i_374_];
				class111.aShortArray1392 = new short[i_374_];
			}
			for (int i_377_ = 0; i_377_ < i_365_; i_377_++) {
				if (is_356_[i_377_] >= 0 || is_357_ != null && is_357_[i_377_] >= 0) {
					if (is_356_[i_377_] >= 0)
						class111.anIntArray1404[class111.aShort1403] = Class453.method7333(is_356_[i_377_], (byte) 10);
					else
						class111.anIntArray1404[class111.aShort1403] = -1;
					if (is_357_ != null) {
						if (is_357_[i_377_] != -1)
							class111.anIntArray1397[class111.aShort1403] = Class453.method7333(is_357_[i_377_], (byte) 10);
						else
							class111.anIntArray1397[class111.aShort1403] = -1;
					}
					class111.aShortArray1399[class111.aShort1403] = (short) is_353_[i_377_];
					class111.aShortArray1400[class111.aShort1403] = (short) is_354_[i_377_];
					class111.aShortArray1401[class111.aShort1403] = (short) is_355_[i_377_];
					if (bool_373_) {
						if (is_358_[i_377_] != -1 && !(aClass180_Sub1_9126.aClass181_2059.method3544(is_358_[i_377_], (byte) -59).aBool1806)) {
							class111.aShortArray1405[class111.aShort1403] = (short) is_358_[i_377_];
							class111.aShortArray1392[class111.aShort1403] = (short) is_359_[i_377_];
						} else
							class111.aShortArray1405[class111.aShort1403] = (short) -1;
					}
					class111.aShort1403++;
				}
			}
			aClass111ArrayArray9140[i][i_349_] = class111;
		} else if (is_356_[0] >= 0 || is_357_ != null && is_357_[0] >= 0) {
			Class139 class139 = new Class139();
			int i_378_ = is_356_[0];
			int i_379_ = is_358_[0];
			if (is_357_ != null) {
				class139.anInt1645 = Class395.method6504(Class453.method7333(is_357_[0], (byte) 10), (aByteArrayArray9149[i][i_349_] - aByteArrayArray9129[i][i_349_]), -501584282);
				if (i_378_ == -1)
					class139.aByte1646 |= 0x2;
			}
			if ((anIntArrayArray1754[i][i_349_] == anIntArrayArray1754[i + 1][i_349_]) && (anIntArrayArray1754[i][i_349_] == anIntArrayArray1754[i + 1][i_349_ + 1]) && (anIntArrayArray1754[i][i_349_] == anIntArrayArray1754[i][i_349_ + 1]))
				class139.aByte1646 |= 0x1;
			Class163 class163 = null;
			if (i_379_ != -1)
				class163 = aClass180_Sub1_9126.aClass181_2059.method3544(i_379_, (byte) -123);
			if (class163 != null && (class139.aByte1646 & 0x2) == 0 && !class163.aBool1806) {
				class139.aShort1641 = (short) (aByteArrayArray9149[i][i_349_] - aByteArrayArray9129[i][i_349_]);
				class139.aShort1640 = (short) (aByteArrayArray9149[i + 1][i_349_] - aByteArrayArray9129[i + 1][i_349_]);
				class139.aShort1642 = (short) (aByteArrayArray9149[i + 1][i_349_ + 1] - aByteArrayArray9129[i + 1][i_349_ + 1]);
				class139.aShort1643 = (short) (aByteArrayArray9149[i][i_349_ + 1] - aByteArrayArray9129[i][i_349_ + 1]);
				class139.aShort1644 = (short) i_379_;
				if (method14603(class163.aByte1801) || class163.aByte1781 != 0 || class163.aByte1797 != 0)
					class139.aByte1646 |= 0x4;
			} else {
				short i_380_ = Class453.method7333(i_378_, (byte) 10);
				class139.aShort1641 = (short) Class395.method6504(i_380_, ((aByteArrayArray9149[i][i_349_]) - (aByteArrayArray9129[i][i_349_])), -501584282);
				class139.aShort1640 = (short) Class395.method6504(i_380_, ((aByteArrayArray9149[i + 1][i_349_]) - (aByteArrayArray9129[i + 1][i_349_])), -501584282);
				class139.aShort1642 = (short) Class395.method6504(i_380_, ((aByteArrayArray9149[i + 1][i_349_ + 1]) - (aByteArrayArray9129[i + 1][i_349_ + 1])), -501584282);
				class139.aShort1643 = (short) Class395.method6504(i_380_, ((aByteArrayArray9149[i][i_349_ + 1]) - (aByteArrayArray9129[i][i_349_ + 1])), -501584282);
				class139.aShort1644 = (short) -1;
			}
			aClass139ArrayArray9143[i][i_349_] = class139;
		}
	}

	public void method2621(Class527_Sub8_Sub8 class527_sub8_sub8, int i, int i_381_, int i_382_, int i_383_, boolean bool) {
		/* empty */
	}

	void method14601(int i, int i_384_, int i_385_) {
		Class101 class101 = aClass180_Sub1_9126.method14835(Thread.currentThread());
		class101.aClass119_1197.anInt1441 = 0;
		if (aClass96ArrayArray9130 != null)
			method14599(i, i_384_, class101.aBool1196, class101, class101.aClass119_1197, class101.aFloatArray1228, class101.aFloatArray1229, class101.aFloatArray1230, class101.aFloatArray1231, class101.aFloatArray1202, i_385_);
		else if (aClass139ArrayArray9143 != null)
			method14598(i, i_384_, class101.aClass119_1197, class101.aFloatArray1228, class101.aFloatArray1229, class101.aFloatArray1230, class101.aFloatArray1231, class101.aFloatArray1202, i_385_);
		else if (aClass126ArrayArray9132 != null)
			method14617(i, i_384_, class101.aBool1196, class101, class101.aClass119_1197, class101.aFloatArray1228, class101.aFloatArray1229, class101.aFloatArray1230, class101.aFloatArray1231, class101.aFloatArray1202, i_385_);
	}

	public void method2601(Class527_Sub16 class527_sub16, int[] is) {
		/* empty */
	}

	static int method14602(int i, int i_386_) {
		int i_387_ = (i & 0xff0000) * i_386_ >> 23;
		if (i_387_ < 2)
			i_387_ = 2;
		else if (i_387_ > 253)
			i_387_ = 253;
		int i_388_ = (i & 0xff00) * i_386_ >> 15;
		if (i_388_ < 2)
			i_388_ = 2;
		else if (i_388_ > 253)
			i_388_ = 253;
		int i_389_ = (i & 0xff) * i_386_ >> 7;
		if (i_389_ < 2)
			i_389_ = 2;
		else if (i_389_ > 253)
			i_389_ = 253;
		return i_387_ << 16 | i_388_ << 8 | i_389_;
	}

	public void method2603(int i, int i_390_, int i_391_) {
		i = Math.min(aByteArrayArray9129.length - 1, Math.max(0, i));
		i_390_ = Math.min(aByteArrayArray9129[i].length - 1, Math.max(0, i_390_));
		if (aByteArrayArray9129[i][i_390_] < i_391_)
			aByteArrayArray9129[i][i_390_] = (byte) i_391_;
	}

	public void method2592(int i, int i_392_, int[] is, int[] is_393_, int[] is_394_, int[] is_395_, int[] is_396_, int[] is_397_, int[] is_398_, int[] is_399_, Class178 class178, boolean bool) {
		boolean bool_400_ = (anInt9134 & 0x20) == 0;
		if (aClass96ArrayArray9130 == null && !bool_400_) {
			aClass96ArrayArray9130 = new Class96[anInt1750 * 1210322533][anInt1751 * -533476177];
			aClass94ArrayArray9131 = new Class94[anInt1750 * 1210322533][anInt1751 * -533476177];
		} else if (aClass126ArrayArray9132 == null && bool_400_)
			aClass126ArrayArray9132 = new Class126[anInt1750 * 1210322533][anInt1751 * -533476177];
		else if (aClass139ArrayArray9143 != null)
			throw new IllegalStateException();
		if (is != null && is.length != 0) {
			for (int i_401_ = 0; i_401_ < is_396_.length; i_401_++) {
				if (is_396_[i_401_] == -1)
					is_396_[i_401_] = 0;
				else
					is_396_[i_401_] = (Class656.anIntArray8393[(Class453.method7333(is_396_[i_401_], (byte) 10) & 0xffff)]) << 8 | 0xff;
			}
			if (is_397_ != null) {
				for (int i_402_ = 0; i_402_ < is_397_.length; i_402_++) {
					if (is_397_[i_402_] == -1)
						is_397_[i_402_] = 0;
					else
						is_397_[i_402_] = ((Class656.anIntArray8393[Class453.method7333(is_397_[i_402_], (byte) 10) & 0xffff]) << 8 | 0xff);
				}
			}
			if (bool_400_) {
				Class126 class126 = new Class126();
				class126.aShort1522 = (short) is.length;
				class126.aShort1526 = (short) (is.length / 3);
				class126.aShortArray1520 = new short[class126.aShort1522];
				class126.aShortArray1519 = new short[class126.aShort1522];
				class126.aShortArray1518 = new short[class126.aShort1522];
				class126.anIntArray1521 = new int[class126.aShort1522];
				class126.aShortArray1524 = new short[class126.aShort1522];
				class126.aShortArray1525 = new short[class126.aShort1522];
				class126.aByteArray1527 = new byte[class126.aShort1522];
				if (is_395_ != null)
					class126.aShortArray1523 = new short[class126.aShort1522];
				for (int i_403_ = 0; i_403_ < class126.aShort1522; i_403_++) {
					int i_404_ = is[i_403_];
					int i_405_ = is_394_[i_403_];
					boolean bool_406_ = false;
					int i_407_;
					if (i_404_ == 0 && i_405_ == 0)
						i_407_ = (aByteArrayArray9149[i][i_392_] - aByteArrayArray9129[i][i_392_]);
					else if (i_404_ == 0 && i_405_ == anInt1752 * 1048375491)
						i_407_ = (aByteArrayArray9149[i][i_392_ + 1] - aByteArrayArray9129[i][i_392_ + 1]);
					else if (i_404_ == anInt1752 * 1048375491 && i_405_ == anInt1752 * 1048375491)
						i_407_ = (aByteArrayArray9149[i + 1][i_392_ + 1] - aByteArrayArray9129[i + 1][i_392_ + 1]);
					else if (i_404_ == anInt1752 * 1048375491 && i_405_ == 0)
						i_407_ = (aByteArrayArray9149[i + 1][i_392_] - aByteArrayArray9129[i + 1][i_392_]);
					else {
						int i_408_ = (((aByteArrayArray9149[i][i_392_] - aByteArrayArray9129[i][i_392_]) * (anInt1752 * 1048375491 - i_404_)) + ((aByteArrayArray9149[i + 1][i_392_] - aByteArrayArray9129[i + 1][i_392_]) * i_404_));
						int i_409_ = (((aByteArrayArray9149[i][i_392_ + 1] - aByteArrayArray9129[i][i_392_ + 1]) * (anInt1752 * 1048375491 - i_404_)) + ((aByteArrayArray9149[i + 1][i_392_ + 1] - aByteArrayArray9129[i + 1][i_392_ + 1]) * i_404_));
						i_407_ = (i_408_ * (anInt1752 * 1048375491 - i_405_) + i_409_ * i_405_) >> anInt1753 * -1790967010;
					}
					int i_410_ = (i << anInt1753 * 1252000143) + i_404_;
					int i_411_ = (i_392_ << anInt1753 * 1252000143) + i_405_;
					class126.aShortArray1520[i_403_] = (short) i_404_;
					class126.aShortArray1518[i_403_] = (short) i_405_;
					class126.aShortArray1519[i_403_] = (short) (method2593(i_410_, i_411_, -1151432033) + (is_393_ != null ? is_393_[i_403_] : 0));
					if (i_407_ < 0)
						i_407_ = 0;
					if (is_396_[i_403_] == 0) {
						class126.anIntArray1521[i_403_] = 0;
						if (is_397_ != null)
							class126.aByteArray1527[i_403_] = (byte) i_407_;
					} else {
						int i_412_ = 0;
						if (is_395_ != null) {
							int i_413_ = (class126.aShortArray1523[i_403_] = (short) is_395_[i_403_]);
							if (class178.anInt2050 * 112490777 != 0) {
								i_412_ = 255 * i_413_ / (class178.anInt2050 * 112490777);
								if (i_412_ < 0)
									i_412_ = 0;
								else if (i_412_ > 255)
									i_412_ = 255;
							}
						}
						int i_414_ = -16777216;
						if (is_398_[i_403_] != -1) {
							Class163 class163 = aClass180_Sub1_9126.aClass181_2059.method3544(is_398_[i_403_], (byte) -13);
							if (class163.aBool1761 && method14603(class163.aByte1801))
								i_414_ = -1694498816;
						}
						class126.anIntArray1521[i_403_] = i_414_ | (Class307.method5617(method14602(is_396_[i_403_] >> 8, i_407_), class178.anInt2055 * -2080392837, i_412_, (short) 10240));
						if (is_397_ != null)
							class126.aByteArray1527[i_403_] = (byte) i_407_;
					}
					class126.aShortArray1524[i_403_] = (short) is_398_[i_403_];
					class126.aShortArray1525[i_403_] = (short) is_399_[i_403_];
				}
				if (is_397_ != null) {
					class126.anIntArray1528 = new int[class126.aShort1526];
					for (int i_415_ = 0; i_415_ < class126.aShort1526; i_415_++) {
						int i_416_ = i_415_ * 3;
						if (is_397_[i_416_] != 0)
							class126.anIntArray1528[i_415_] = ~0xffffff | is_397_[i_416_] >> 8;
					}
				}
				aClass126ArrayArray9132[i][i_392_] = class126;
			} else {
				boolean bool_417_ = true;
				int i_418_ = -1;
				int i_419_ = -1;
				int i_420_ = -1;
				int i_421_ = -1;
				if (is.length == 6) {
					for (int i_422_ = 0; i_422_ < 6; i_422_++) {
						if (is[i_422_] == 0 && is_394_[i_422_] == 0) {
							if (i_418_ != -1 && is_396_[i_418_] != is_396_[i_422_]) {
								bool_417_ = false;
								break;
							}
							i_418_ = i_422_;
						} else if (is[i_422_] == anInt1752 * 1048375491 && is_394_[i_422_] == 0) {
							if (i_419_ != -1 && is_396_[i_419_] != is_396_[i_422_]) {
								bool_417_ = false;
								break;
							}
							i_419_ = i_422_;
						} else if (is[i_422_] == anInt1752 * 1048375491 && (is_394_[i_422_] == anInt1752 * 1048375491)) {
							if (i_420_ != -1 && is_396_[i_420_] != is_396_[i_422_]) {
								bool_417_ = false;
								break;
							}
							i_420_ = i_422_;
						} else if (is[i_422_] == 0 && (is_394_[i_422_] == anInt1752 * 1048375491)) {
							if (i_421_ != -1 && is_396_[i_421_] != is_396_[i_422_]) {
								bool_417_ = false;
								break;
							}
							i_421_ = i_422_;
						}
					}
					if (i_418_ == -1 || i_419_ == -1 || i_420_ == -1 || i_421_ == -1)
						bool_417_ = false;
					if (bool_417_) {
						if (is_393_ != null) {
							for (int i_423_ = 0; i_423_ < 4; i_423_++) {
								if (is_393_[i_423_] != 0) {
									bool_417_ = false;
									break;
								}
							}
						}
						if (bool_417_) {
							for (int i_424_ = 1; i_424_ < 4; i_424_++) {
								if (is[i_424_] != is[0] && (is[i_424_] != is[0] + anInt1752 * 1048375491) && (is[i_424_] != is[0] - anInt1752 * 1048375491)) {
									bool_417_ = false;
									break;
								}
								if (is_394_[i_424_] != is_394_[0] && (is_394_[i_424_] != is_394_[0] + anInt1752 * 1048375491) && (is_394_[i_424_] != (is_394_[0] - anInt1752 * 1048375491))) {
									bool_417_ = false;
									break;
								}
							}
						}
					}
				} else
					bool_417_ = false;
				if (bool_417_) {
					Class96 class96 = new Class96();
					int i_425_ = is_396_[0];
					int i_426_ = is_398_[0];
					if (is_397_ != null) {
						class96.anInt1157 = is_397_[0] >> 8;
						if (i_425_ == 0)
							class96.aByte1149 |= 0x2;
					} else if (i_425_ == 0)
						return;
					if ((anIntArrayArray1754[i][i_392_] == anIntArrayArray1754[i + 1][i_392_]) && (anIntArrayArray1754[i][i_392_] == anIntArrayArray1754[i + 1][i_392_ + 1]) && (anIntArrayArray1754[i][i_392_] == anIntArrayArray1754[i][i_392_ + 1]))
						class96.aByte1149 |= 0x1;
					if (i_426_ != -1 && (class96.aByte1149 & 0x2) == 0 && !(aClass180_Sub1_9126.aClass181_2059.method3544(i_426_, (byte) -104).aBool1806)) {
						int i_427_;
						if (is_395_ != null && class178.anInt2050 * 112490777 != 0) {
							i_427_ = 255 * is_395_[i_418_] / (class178.anInt2050 * 112490777);
							if (i_427_ < 0)
								i_427_ = 0;
							else if (i_427_ > 255)
								i_427_ = 255;
						} else
							i_427_ = 0;
						class96.anInt1152 = (Class307.method5617(method14602(is_396_[i_418_] >> 8, (aByteArrayArray9149[i][i_392_] - (aByteArrayArray9129[i][i_392_]))), class178.anInt2055 * -2080392837, i_427_, (short) 10240));
						if (class96.anInt1157 != 0)
							class96.anInt1152 |= (255 - (aByteArrayArray9149[i][i_392_] - aByteArrayArray9129[i][i_392_]) << 25);
						if (is_395_ != null && class178.anInt2050 * 112490777 != 0) {
							i_427_ = 255 * is_395_[i_419_] / (class178.anInt2050 * 112490777);
							if (i_427_ < 0)
								i_427_ = 0;
							else if (i_427_ > 255)
								i_427_ = 255;
						} else
							i_427_ = 0;
						class96.anInt1158 = (Class307.method5617(method14602(is_396_[i_419_] >> 8, (aByteArrayArray9149[i + 1][i_392_] - (aByteArrayArray9129[i + 1][i_392_]))), class178.anInt2055 * -2080392837, i_427_, (short) 10240));
						if (class96.anInt1157 != 0)
							class96.anInt1158 |= 255 - (aByteArrayArray9149[i + 1][i_392_] - (aByteArrayArray9129[i + 1][i_392_])) << 25;
						if (is_395_ != null && class178.anInt2050 * 112490777 != 0) {
							i_427_ = 255 * is_395_[i_420_] / (class178.anInt2050 * 112490777);
							if (i_427_ < 0)
								i_427_ = 0;
							else if (i_427_ > 255)
								i_427_ = 255;
						} else
							i_427_ = 0;
						class96.anInt1151 = (Class307.method5617(method14602(is_396_[i_420_] >> 8, ((aByteArrayArray9149[i + 1][i_392_ + 1]) - (aByteArrayArray9129[i + 1][i_392_ + 1]))), class178.anInt2055 * -2080392837, i_427_, (short) 10240));
						if (class96.anInt1157 != 0)
							class96.anInt1151 |= (255 - (aByteArrayArray9149[i + 1][i_392_ + 1] - (aByteArrayArray9129[i + 1][i_392_ + 1]))) << 25;
						if (is_395_ != null && class178.anInt2050 * 112490777 != 0) {
							i_427_ = 255 * is_395_[i_421_] / (class178.anInt2050 * 112490777);
							if (i_427_ < 0)
								i_427_ = 0;
							else if (i_427_ > 255)
								i_427_ = 255;
						} else
							i_427_ = 0;
						class96.anInt1153 = (Class307.method5617(method14602(is_396_[i_421_] >> 8, (aByteArrayArray9149[i][i_392_ + 1] - (aByteArrayArray9129[i][i_392_ + 1]))), class178.anInt2055 * -2080392837, i_427_, (short) 10240));
						class96.aShort1148 = (short) i_426_;
					} else {
						int i_428_;
						if (is_395_ != null && class178.anInt2050 * 112490777 != 0) {
							i_428_ = 255 * is_395_[i_418_] / (class178.anInt2050 * 112490777);
							if (i_428_ < 0)
								i_428_ = 0;
							else if (i_428_ > 255)
								i_428_ = 255;
						} else
							i_428_ = 0;
						class96.anInt1152 = (Class307.method5617(method14602(is_396_[i_418_] >> 8, (aByteArrayArray9149[i][i_392_] - (aByteArrayArray9129[i][i_392_]))), class178.anInt2055 * -2080392837, i_428_, (short) 10240));
						if (class96.anInt1157 != 0)
							class96.anInt1152 |= (255 - (aByteArrayArray9149[i][i_392_] - aByteArrayArray9129[i][i_392_]) << 25);
						if (is_395_ != null && class178.anInt2050 * 112490777 != 0) {
							i_428_ = 255 * is_395_[i_419_] / (class178.anInt2050 * 112490777);
							if (i_428_ < 0)
								i_428_ = 0;
							else if (i_428_ > 255)
								i_428_ = 255;
						} else
							i_428_ = 0;
						class96.anInt1158 = (Class307.method5617(method14602(is_396_[i_419_] >> 8, (aByteArrayArray9149[i + 1][i_392_] - (aByteArrayArray9129[i + 1][i_392_]))), class178.anInt2055 * -2080392837, i_428_, (short) 10240));
						if (class96.anInt1157 != 0)
							class96.anInt1158 |= 255 - (aByteArrayArray9149[i + 1][i_392_] - (aByteArrayArray9129[i + 1][i_392_])) << 25;
						if (is_395_ != null && class178.anInt2050 * 112490777 != 0) {
							i_428_ = 255 * is_395_[i_420_] / (class178.anInt2050 * 112490777);
							if (i_428_ < 0)
								i_428_ = 0;
							else if (i_428_ > 255)
								i_428_ = 255;
						} else
							i_428_ = 0;
						class96.anInt1151 = (Class307.method5617(method14602(is_396_[i_420_] >> 8, ((aByteArrayArray9149[i + 1][i_392_ + 1]) - (aByteArrayArray9129[i + 1][i_392_ + 1]))), class178.anInt2055 * -2080392837, i_428_, (short) 10240));
						if (class96.anInt1157 != 0)
							class96.anInt1151 |= (255 - (aByteArrayArray9149[i + 1][i_392_ + 1] - (aByteArrayArray9129[i + 1][i_392_ + 1]))) << 25;
						if (is_395_ != null && class178.anInt2050 * 112490777 != 0) {
							i_428_ = 255 * is_395_[i_421_] / (class178.anInt2050 * 112490777);
							if (i_428_ < 0)
								i_428_ = 0;
							else if (i_428_ > 255)
								i_428_ = 255;
						} else
							i_428_ = 0;
						class96.anInt1153 = (Class307.method5617(method14602(is_396_[i_421_] >> 8, (aByteArrayArray9149[i][i_392_ + 1] - (aByteArrayArray9129[i][i_392_ + 1]))), class178.anInt2055 * -2080392837, i_428_, (short) 10240));
						if (class96.anInt1157 != 0)
							class96.anInt1153 |= 255 - (aByteArrayArray9149[i][i_392_ + 1] - (aByteArrayArray9129[i][i_392_ + 1])) << 25;
						class96.aShort1148 = (short) -1;
					}
					if (is_395_ != null) {
						class96.aShort1155 = (short) is_395_[i_420_];
						class96.aShort1150 = (short) is_395_[i_421_];
						class96.aShort1154 = (short) is_395_[i_419_];
						class96.aShort1156 = (short) is_395_[i_418_];
					}
					aClass96ArrayArray9130[i][i_392_] = class96;
				} else {
					Class94 class94 = new Class94();
					class94.aShort1136 = (short) is.length;
					class94.aShort1145 = (short) (is.length / 3);
					class94.aShortArray1135 = new short[class94.aShort1136];
					class94.aShortArray1139 = new short[class94.aShort1136];
					class94.aShortArray1140 = new short[class94.aShort1136];
					class94.anIntArray1142 = new int[class94.aShort1136];
					if (is_395_ != null)
						class94.aShortArray1141 = new short[class94.aShort1136];
					for (int i_429_ = 0; i_429_ < class94.aShort1136; i_429_++) {
						int i_430_ = is[i_429_];
						int i_431_ = is_394_[i_429_];
						boolean bool_432_ = false;
						int i_433_;
						if (i_430_ == 0 && i_431_ == 0)
							i_433_ = (aByteArrayArray9149[i][i_392_] - aByteArrayArray9129[i][i_392_]);
						else if (i_430_ == 0 && i_431_ == anInt1752 * 1048375491)
							i_433_ = (aByteArrayArray9149[i][i_392_ + 1] - aByteArrayArray9129[i][i_392_ + 1]);
						else if (i_430_ == anInt1752 * 1048375491 && i_431_ == anInt1752 * 1048375491)
							i_433_ = (aByteArrayArray9149[i + 1][i_392_ + 1] - aByteArrayArray9129[i + 1][i_392_ + 1]);
						else if (i_430_ == anInt1752 * 1048375491 && i_431_ == 0)
							i_433_ = (aByteArrayArray9149[i + 1][i_392_] - aByteArrayArray9129[i + 1][i_392_]);
						else {
							int i_434_ = (((aByteArrayArray9149[i][i_392_] - aByteArrayArray9129[i][i_392_]) * (anInt1752 * 1048375491 - i_430_)) + ((aByteArrayArray9149[i + 1][i_392_] - aByteArrayArray9129[i + 1][i_392_]) * i_430_));
							int i_435_ = (((aByteArrayArray9149[i][i_392_ + 1] - aByteArrayArray9129[i][i_392_ + 1]) * (anInt1752 * 1048375491 - i_430_)) + (aByteArrayArray9149[i + 1][i_392_ + 1] - (aByteArrayArray9129[i + 1][i_392_ + 1])) * i_430_);
							i_433_ = (i_434_ * (anInt1752 * 1048375491 - i_431_) + i_435_ * i_431_ >> anInt1753 * -1790967010);
						}
						int i_436_ = (i << anInt1753 * 1252000143) + i_430_;
						int i_437_ = (i_392_ << anInt1753 * 1252000143) + i_431_;
						class94.aShortArray1135[i_429_] = (short) i_430_;
						class94.aShortArray1140[i_429_] = (short) i_431_;
						class94.aShortArray1139[i_429_] = (short) (method2593(i_436_, i_437_, -1151432033) + (is_393_ != null ? is_393_[i_429_] : 0));
						if (i_433_ < 0)
							i_433_ = 0;
						if (is_396_[i_429_] == 0) {
							if (is_397_ != null)
								class94.anIntArray1142[i_429_] = i_433_ << 25;
							else
								class94.anIntArray1142[i_429_] = 0;
						} else {
							int i_438_ = 0;
							if (is_395_ != null) {
								int i_439_ = (class94.aShortArray1141[i_429_] = (short) is_395_[i_429_]);
								if (class178.anInt2050 * 112490777 != 0) {
									i_438_ = 255 * i_439_ / (class178.anInt2050 * 112490777);
									if (i_438_ < 0)
										i_438_ = 0;
									else if (i_438_ > 255)
										i_438_ = 255;
								}
							}
							class94.anIntArray1142[i_429_] = (Class307.method5617(method14602(is_396_[i_429_] >> 8, i_433_), class178.anInt2055 * -2080392837, i_438_, (short) 10240));
							if (is_397_ != null)
								class94.anIntArray1142[i_429_] |= i_433_ << 25;
						}
					}
					boolean bool_440_ = false;
					for (int i_441_ = 0; i_441_ < class94.aShort1145; i_441_++) {
						if (is_398_[i_441_ * 3] != -1 && !(aClass180_Sub1_9126.aClass181_2059.method3544(is_398_[i_441_ * 3], (byte) -53).aBool1806))
							bool_440_ = true;
					}
					if (is_397_ != null)
						class94.anIntArray1144 = new int[class94.aShort1145];
					if (bool_440_) {
						class94.aShortArray1143 = new short[class94.aShort1145];
						class94.aShortArray1138 = new short[class94.aShort1145];
					}
					for (int i_442_ = 0; i_442_ < class94.aShort1145; i_442_++) {
						int i_443_ = i_442_ * 3;
						if (is_397_ != null && is_397_[i_443_] != 0)
							class94.anIntArray1144[i_442_] = is_397_[i_443_] >> 8;
						if (bool_440_) {
							int i_444_ = i_443_ + 1;
							int i_445_ = i_444_ + 1;
							boolean bool_446_ = false;
							boolean bool_447_ = true;
							int i_448_ = is_398_[i_443_];
							if (i_448_ == -1 || aClass180_Sub1_9126.aClass181_2059.method3544(i_448_, (byte) 3).aBool1806)
								bool_447_ = false;
							else
								bool_446_ = true;
							i_448_ = is_398_[i_444_];
							if (i_448_ == -1 || (aClass180_Sub1_9126.aClass181_2059.method3544(i_448_, (byte) -104).aBool1806))
								bool_447_ = false;
							else
								bool_446_ = true;
							i_448_ = is_398_[i_445_];
							if (i_448_ == -1 || (aClass180_Sub1_9126.aClass181_2059.method3544(i_448_, (byte) -26).aBool1806))
								bool_447_ = false;
							else
								bool_446_ = true;
							if (bool_447_) {
								class94.aShortArray1143[i_442_] = (short) i_448_;
								class94.aShortArray1138[i_442_] = (short) is_399_[i_443_];
							} else {
								if (bool_446_) {
									i_448_ = is_398_[i_443_];
									if (i_448_ != -1 && !(aClass180_Sub1_9126.aClass181_2059.method3544(i_448_, (byte) -58).aBool1806))
										class94.anIntArray1142[i_443_] = (Class656.anIntArray8393[(Class453.method7333((aClass180_Sub1_9126.aClass181_2059.method3544(i_448_, (byte) -81).aShort1810) & 0xffff, (byte) 10)) & 0xffff]);
									i_448_ = is_398_[i_444_];
									if (i_448_ != -1 && !(aClass180_Sub1_9126.aClass181_2059.method3544(i_448_, (byte) -128).aBool1806))
										class94.anIntArray1142[i_444_] = (Class656.anIntArray8393[(Class453.method7333((aClass180_Sub1_9126.aClass181_2059.method3544(i_448_, (byte) -117).aShort1810) & 0xffff, (byte) 10)) & 0xffff]);
									i_448_ = is_398_[i_445_];
									if (i_448_ != -1 && !(aClass180_Sub1_9126.aClass181_2059.method3544(i_448_, (byte) -50).aBool1806))
										class94.anIntArray1142[i_445_] = (Class656.anIntArray8393[(Class453.method7333((aClass180_Sub1_9126.aClass181_2059.method3544(i_448_, (byte) -93).aShort1810) & 0xffff, (byte) 10)) & 0xffff]);
								}
								class94.aShortArray1143[i_442_] = (short) -1;
							}
						}
					}
					aClass94ArrayArray9131[i][i_392_] = class94;
				}
			}
		}
	}

	boolean method14603(int i) {
		if ((anInt9134 & 0x8) == 0)
			return false;
		if (i == 4)
			return true;
		if (i == 8)
			return true;
		if (i == 9)
			return true;
		return false;
	}

	public void method2606(int i, int i_449_, int[] is, int[] is_450_, int[] is_451_, int[] is_452_, int[] is_453_, int[] is_454_, int[] is_455_, int[] is_456_, Class178 class178, boolean bool) {
		boolean bool_457_ = (anInt9134 & 0x20) == 0;
		if (aClass96ArrayArray9130 == null && !bool_457_) {
			aClass96ArrayArray9130 = new Class96[anInt1750 * 1210322533][anInt1751 * -533476177];
			aClass94ArrayArray9131 = new Class94[anInt1750 * 1210322533][anInt1751 * -533476177];
		} else if (aClass126ArrayArray9132 == null && bool_457_)
			aClass126ArrayArray9132 = new Class126[anInt1750 * 1210322533][anInt1751 * -533476177];
		else if (aClass139ArrayArray9143 != null)
			throw new IllegalStateException();
		if (is != null && is.length != 0) {
			for (int i_458_ = 0; i_458_ < is_453_.length; i_458_++) {
				if (is_453_[i_458_] == -1)
					is_453_[i_458_] = 0;
				else
					is_453_[i_458_] = (Class656.anIntArray8393[(Class453.method7333(is_453_[i_458_], (byte) 10) & 0xffff)]) << 8 | 0xff;
			}
			if (is_454_ != null) {
				for (int i_459_ = 0; i_459_ < is_454_.length; i_459_++) {
					if (is_454_[i_459_] == -1)
						is_454_[i_459_] = 0;
					else
						is_454_[i_459_] = ((Class656.anIntArray8393[Class453.method7333(is_454_[i_459_], (byte) 10) & 0xffff]) << 8 | 0xff);
				}
			}
			if (bool_457_) {
				Class126 class126 = new Class126();
				class126.aShort1522 = (short) is.length;
				class126.aShort1526 = (short) (is.length / 3);
				class126.aShortArray1520 = new short[class126.aShort1522];
				class126.aShortArray1519 = new short[class126.aShort1522];
				class126.aShortArray1518 = new short[class126.aShort1522];
				class126.anIntArray1521 = new int[class126.aShort1522];
				class126.aShortArray1524 = new short[class126.aShort1522];
				class126.aShortArray1525 = new short[class126.aShort1522];
				class126.aByteArray1527 = new byte[class126.aShort1522];
				if (is_452_ != null)
					class126.aShortArray1523 = new short[class126.aShort1522];
				for (int i_460_ = 0; i_460_ < class126.aShort1522; i_460_++) {
					int i_461_ = is[i_460_];
					int i_462_ = is_451_[i_460_];
					boolean bool_463_ = false;
					int i_464_;
					if (i_461_ == 0 && i_462_ == 0)
						i_464_ = (aByteArrayArray9149[i][i_449_] - aByteArrayArray9129[i][i_449_]);
					else if (i_461_ == 0 && i_462_ == anInt1752 * 1048375491)
						i_464_ = (aByteArrayArray9149[i][i_449_ + 1] - aByteArrayArray9129[i][i_449_ + 1]);
					else if (i_461_ == anInt1752 * 1048375491 && i_462_ == anInt1752 * 1048375491)
						i_464_ = (aByteArrayArray9149[i + 1][i_449_ + 1] - aByteArrayArray9129[i + 1][i_449_ + 1]);
					else if (i_461_ == anInt1752 * 1048375491 && i_462_ == 0)
						i_464_ = (aByteArrayArray9149[i + 1][i_449_] - aByteArrayArray9129[i + 1][i_449_]);
					else {
						int i_465_ = (((aByteArrayArray9149[i][i_449_] - aByteArrayArray9129[i][i_449_]) * (anInt1752 * 1048375491 - i_461_)) + ((aByteArrayArray9149[i + 1][i_449_] - aByteArrayArray9129[i + 1][i_449_]) * i_461_));
						int i_466_ = (((aByteArrayArray9149[i][i_449_ + 1] - aByteArrayArray9129[i][i_449_ + 1]) * (anInt1752 * 1048375491 - i_461_)) + ((aByteArrayArray9149[i + 1][i_449_ + 1] - aByteArrayArray9129[i + 1][i_449_ + 1]) * i_461_));
						i_464_ = (i_465_ * (anInt1752 * 1048375491 - i_462_) + i_466_ * i_462_) >> anInt1753 * -1790967010;
					}
					int i_467_ = (i << anInt1753 * 1252000143) + i_461_;
					int i_468_ = (i_449_ << anInt1753 * 1252000143) + i_462_;
					class126.aShortArray1520[i_460_] = (short) i_461_;
					class126.aShortArray1518[i_460_] = (short) i_462_;
					class126.aShortArray1519[i_460_] = (short) (method2593(i_467_, i_468_, -1151432033) + (is_450_ != null ? is_450_[i_460_] : 0));
					if (i_464_ < 0)
						i_464_ = 0;
					if (is_453_[i_460_] == 0) {
						class126.anIntArray1521[i_460_] = 0;
						if (is_454_ != null)
							class126.aByteArray1527[i_460_] = (byte) i_464_;
					} else {
						int i_469_ = 0;
						if (is_452_ != null) {
							int i_470_ = (class126.aShortArray1523[i_460_] = (short) is_452_[i_460_]);
							if (class178.anInt2050 * 112490777 != 0) {
								i_469_ = 255 * i_470_ / (class178.anInt2050 * 112490777);
								if (i_469_ < 0)
									i_469_ = 0;
								else if (i_469_ > 255)
									i_469_ = 255;
							}
						}
						int i_471_ = -16777216;
						if (is_455_[i_460_] != -1) {
							Class163 class163 = aClass180_Sub1_9126.aClass181_2059.method3544(is_455_[i_460_], (byte) -57);
							if (class163.aBool1761 && method14603(class163.aByte1801))
								i_471_ = -1694498816;
						}
						class126.anIntArray1521[i_460_] = i_471_ | (Class307.method5617(method14602(is_453_[i_460_] >> 8, i_464_), class178.anInt2055 * -2080392837, i_469_, (short) 10240));
						if (is_454_ != null)
							class126.aByteArray1527[i_460_] = (byte) i_464_;
					}
					class126.aShortArray1524[i_460_] = (short) is_455_[i_460_];
					class126.aShortArray1525[i_460_] = (short) is_456_[i_460_];
				}
				if (is_454_ != null) {
					class126.anIntArray1528 = new int[class126.aShort1526];
					for (int i_472_ = 0; i_472_ < class126.aShort1526; i_472_++) {
						int i_473_ = i_472_ * 3;
						if (is_454_[i_473_] != 0)
							class126.anIntArray1528[i_472_] = ~0xffffff | is_454_[i_473_] >> 8;
					}
				}
				aClass126ArrayArray9132[i][i_449_] = class126;
			} else {
				boolean bool_474_ = true;
				int i_475_ = -1;
				int i_476_ = -1;
				int i_477_ = -1;
				int i_478_ = -1;
				if (is.length == 6) {
					for (int i_479_ = 0; i_479_ < 6; i_479_++) {
						if (is[i_479_] == 0 && is_451_[i_479_] == 0) {
							if (i_475_ != -1 && is_453_[i_475_] != is_453_[i_479_]) {
								bool_474_ = false;
								break;
							}
							i_475_ = i_479_;
						} else if (is[i_479_] == anInt1752 * 1048375491 && is_451_[i_479_] == 0) {
							if (i_476_ != -1 && is_453_[i_476_] != is_453_[i_479_]) {
								bool_474_ = false;
								break;
							}
							i_476_ = i_479_;
						} else if (is[i_479_] == anInt1752 * 1048375491 && (is_451_[i_479_] == anInt1752 * 1048375491)) {
							if (i_477_ != -1 && is_453_[i_477_] != is_453_[i_479_]) {
								bool_474_ = false;
								break;
							}
							i_477_ = i_479_;
						} else if (is[i_479_] == 0 && (is_451_[i_479_] == anInt1752 * 1048375491)) {
							if (i_478_ != -1 && is_453_[i_478_] != is_453_[i_479_]) {
								bool_474_ = false;
								break;
							}
							i_478_ = i_479_;
						}
					}
					if (i_475_ == -1 || i_476_ == -1 || i_477_ == -1 || i_478_ == -1)
						bool_474_ = false;
					if (bool_474_) {
						if (is_450_ != null) {
							for (int i_480_ = 0; i_480_ < 4; i_480_++) {
								if (is_450_[i_480_] != 0) {
									bool_474_ = false;
									break;
								}
							}
						}
						if (bool_474_) {
							for (int i_481_ = 1; i_481_ < 4; i_481_++) {
								if (is[i_481_] != is[0] && (is[i_481_] != is[0] + anInt1752 * 1048375491) && (is[i_481_] != is[0] - anInt1752 * 1048375491)) {
									bool_474_ = false;
									break;
								}
								if (is_451_[i_481_] != is_451_[0] && (is_451_[i_481_] != is_451_[0] + anInt1752 * 1048375491) && (is_451_[i_481_] != (is_451_[0] - anInt1752 * 1048375491))) {
									bool_474_ = false;
									break;
								}
							}
						}
					}
				} else
					bool_474_ = false;
				if (bool_474_) {
					Class96 class96 = new Class96();
					int i_482_ = is_453_[0];
					int i_483_ = is_455_[0];
					if (is_454_ != null) {
						class96.anInt1157 = is_454_[0] >> 8;
						if (i_482_ == 0)
							class96.aByte1149 |= 0x2;
					} else if (i_482_ == 0)
						return;
					if ((anIntArrayArray1754[i][i_449_] == anIntArrayArray1754[i + 1][i_449_]) && (anIntArrayArray1754[i][i_449_] == anIntArrayArray1754[i + 1][i_449_ + 1]) && (anIntArrayArray1754[i][i_449_] == anIntArrayArray1754[i][i_449_ + 1]))
						class96.aByte1149 |= 0x1;
					if (i_483_ != -1 && (class96.aByte1149 & 0x2) == 0 && !(aClass180_Sub1_9126.aClass181_2059.method3544(i_483_, (byte) -81).aBool1806)) {
						int i_484_;
						if (is_452_ != null && class178.anInt2050 * 112490777 != 0) {
							i_484_ = 255 * is_452_[i_475_] / (class178.anInt2050 * 112490777);
							if (i_484_ < 0)
								i_484_ = 0;
							else if (i_484_ > 255)
								i_484_ = 255;
						} else
							i_484_ = 0;
						class96.anInt1152 = (Class307.method5617(method14602(is_453_[i_475_] >> 8, (aByteArrayArray9149[i][i_449_] - (aByteArrayArray9129[i][i_449_]))), class178.anInt2055 * -2080392837, i_484_, (short) 10240));
						if (class96.anInt1157 != 0)
							class96.anInt1152 |= (255 - (aByteArrayArray9149[i][i_449_] - aByteArrayArray9129[i][i_449_]) << 25);
						if (is_452_ != null && class178.anInt2050 * 112490777 != 0) {
							i_484_ = 255 * is_452_[i_476_] / (class178.anInt2050 * 112490777);
							if (i_484_ < 0)
								i_484_ = 0;
							else if (i_484_ > 255)
								i_484_ = 255;
						} else
							i_484_ = 0;
						class96.anInt1158 = (Class307.method5617(method14602(is_453_[i_476_] >> 8, (aByteArrayArray9149[i + 1][i_449_] - (aByteArrayArray9129[i + 1][i_449_]))), class178.anInt2055 * -2080392837, i_484_, (short) 10240));
						if (class96.anInt1157 != 0)
							class96.anInt1158 |= 255 - (aByteArrayArray9149[i + 1][i_449_] - (aByteArrayArray9129[i + 1][i_449_])) << 25;
						if (is_452_ != null && class178.anInt2050 * 112490777 != 0) {
							i_484_ = 255 * is_452_[i_477_] / (class178.anInt2050 * 112490777);
							if (i_484_ < 0)
								i_484_ = 0;
							else if (i_484_ > 255)
								i_484_ = 255;
						} else
							i_484_ = 0;
						class96.anInt1151 = (Class307.method5617(method14602(is_453_[i_477_] >> 8, ((aByteArrayArray9149[i + 1][i_449_ + 1]) - (aByteArrayArray9129[i + 1][i_449_ + 1]))), class178.anInt2055 * -2080392837, i_484_, (short) 10240));
						if (class96.anInt1157 != 0)
							class96.anInt1151 |= (255 - (aByteArrayArray9149[i + 1][i_449_ + 1] - (aByteArrayArray9129[i + 1][i_449_ + 1]))) << 25;
						if (is_452_ != null && class178.anInt2050 * 112490777 != 0) {
							i_484_ = 255 * is_452_[i_478_] / (class178.anInt2050 * 112490777);
							if (i_484_ < 0)
								i_484_ = 0;
							else if (i_484_ > 255)
								i_484_ = 255;
						} else
							i_484_ = 0;
						class96.anInt1153 = (Class307.method5617(method14602(is_453_[i_478_] >> 8, (aByteArrayArray9149[i][i_449_ + 1] - (aByteArrayArray9129[i][i_449_ + 1]))), class178.anInt2055 * -2080392837, i_484_, (short) 10240));
						class96.aShort1148 = (short) i_483_;
					} else {
						int i_485_;
						if (is_452_ != null && class178.anInt2050 * 112490777 != 0) {
							i_485_ = 255 * is_452_[i_475_] / (class178.anInt2050 * 112490777);
							if (i_485_ < 0)
								i_485_ = 0;
							else if (i_485_ > 255)
								i_485_ = 255;
						} else
							i_485_ = 0;
						class96.anInt1152 = (Class307.method5617(method14602(is_453_[i_475_] >> 8, (aByteArrayArray9149[i][i_449_] - (aByteArrayArray9129[i][i_449_]))), class178.anInt2055 * -2080392837, i_485_, (short) 10240));
						if (class96.anInt1157 != 0)
							class96.anInt1152 |= (255 - (aByteArrayArray9149[i][i_449_] - aByteArrayArray9129[i][i_449_]) << 25);
						if (is_452_ != null && class178.anInt2050 * 112490777 != 0) {
							i_485_ = 255 * is_452_[i_476_] / (class178.anInt2050 * 112490777);
							if (i_485_ < 0)
								i_485_ = 0;
							else if (i_485_ > 255)
								i_485_ = 255;
						} else
							i_485_ = 0;
						class96.anInt1158 = (Class307.method5617(method14602(is_453_[i_476_] >> 8, (aByteArrayArray9149[i + 1][i_449_] - (aByteArrayArray9129[i + 1][i_449_]))), class178.anInt2055 * -2080392837, i_485_, (short) 10240));
						if (class96.anInt1157 != 0)
							class96.anInt1158 |= 255 - (aByteArrayArray9149[i + 1][i_449_] - (aByteArrayArray9129[i + 1][i_449_])) << 25;
						if (is_452_ != null && class178.anInt2050 * 112490777 != 0) {
							i_485_ = 255 * is_452_[i_477_] / (class178.anInt2050 * 112490777);
							if (i_485_ < 0)
								i_485_ = 0;
							else if (i_485_ > 255)
								i_485_ = 255;
						} else
							i_485_ = 0;
						class96.anInt1151 = (Class307.method5617(method14602(is_453_[i_477_] >> 8, ((aByteArrayArray9149[i + 1][i_449_ + 1]) - (aByteArrayArray9129[i + 1][i_449_ + 1]))), class178.anInt2055 * -2080392837, i_485_, (short) 10240));
						if (class96.anInt1157 != 0)
							class96.anInt1151 |= (255 - (aByteArrayArray9149[i + 1][i_449_ + 1] - (aByteArrayArray9129[i + 1][i_449_ + 1]))) << 25;
						if (is_452_ != null && class178.anInt2050 * 112490777 != 0) {
							i_485_ = 255 * is_452_[i_478_] / (class178.anInt2050 * 112490777);
							if (i_485_ < 0)
								i_485_ = 0;
							else if (i_485_ > 255)
								i_485_ = 255;
						} else
							i_485_ = 0;
						class96.anInt1153 = (Class307.method5617(method14602(is_453_[i_478_] >> 8, (aByteArrayArray9149[i][i_449_ + 1] - (aByteArrayArray9129[i][i_449_ + 1]))), class178.anInt2055 * -2080392837, i_485_, (short) 10240));
						if (class96.anInt1157 != 0)
							class96.anInt1153 |= 255 - (aByteArrayArray9149[i][i_449_ + 1] - (aByteArrayArray9129[i][i_449_ + 1])) << 25;
						class96.aShort1148 = (short) -1;
					}
					if (is_452_ != null) {
						class96.aShort1155 = (short) is_452_[i_477_];
						class96.aShort1150 = (short) is_452_[i_478_];
						class96.aShort1154 = (short) is_452_[i_476_];
						class96.aShort1156 = (short) is_452_[i_475_];
					}
					aClass96ArrayArray9130[i][i_449_] = class96;
				} else {
					Class94 class94 = new Class94();
					class94.aShort1136 = (short) is.length;
					class94.aShort1145 = (short) (is.length / 3);
					class94.aShortArray1135 = new short[class94.aShort1136];
					class94.aShortArray1139 = new short[class94.aShort1136];
					class94.aShortArray1140 = new short[class94.aShort1136];
					class94.anIntArray1142 = new int[class94.aShort1136];
					if (is_452_ != null)
						class94.aShortArray1141 = new short[class94.aShort1136];
					for (int i_486_ = 0; i_486_ < class94.aShort1136; i_486_++) {
						int i_487_ = is[i_486_];
						int i_488_ = is_451_[i_486_];
						boolean bool_489_ = false;
						int i_490_;
						if (i_487_ == 0 && i_488_ == 0)
							i_490_ = (aByteArrayArray9149[i][i_449_] - aByteArrayArray9129[i][i_449_]);
						else if (i_487_ == 0 && i_488_ == anInt1752 * 1048375491)
							i_490_ = (aByteArrayArray9149[i][i_449_ + 1] - aByteArrayArray9129[i][i_449_ + 1]);
						else if (i_487_ == anInt1752 * 1048375491 && i_488_ == anInt1752 * 1048375491)
							i_490_ = (aByteArrayArray9149[i + 1][i_449_ + 1] - aByteArrayArray9129[i + 1][i_449_ + 1]);
						else if (i_487_ == anInt1752 * 1048375491 && i_488_ == 0)
							i_490_ = (aByteArrayArray9149[i + 1][i_449_] - aByteArrayArray9129[i + 1][i_449_]);
						else {
							int i_491_ = (((aByteArrayArray9149[i][i_449_] - aByteArrayArray9129[i][i_449_]) * (anInt1752 * 1048375491 - i_487_)) + ((aByteArrayArray9149[i + 1][i_449_] - aByteArrayArray9129[i + 1][i_449_]) * i_487_));
							int i_492_ = (((aByteArrayArray9149[i][i_449_ + 1] - aByteArrayArray9129[i][i_449_ + 1]) * (anInt1752 * 1048375491 - i_487_)) + (aByteArrayArray9149[i + 1][i_449_ + 1] - (aByteArrayArray9129[i + 1][i_449_ + 1])) * i_487_);
							i_490_ = (i_491_ * (anInt1752 * 1048375491 - i_488_) + i_492_ * i_488_ >> anInt1753 * -1790967010);
						}
						int i_493_ = (i << anInt1753 * 1252000143) + i_487_;
						int i_494_ = (i_449_ << anInt1753 * 1252000143) + i_488_;
						class94.aShortArray1135[i_486_] = (short) i_487_;
						class94.aShortArray1140[i_486_] = (short) i_488_;
						class94.aShortArray1139[i_486_] = (short) (method2593(i_493_, i_494_, -1151432033) + (is_450_ != null ? is_450_[i_486_] : 0));
						if (i_490_ < 0)
							i_490_ = 0;
						if (is_453_[i_486_] == 0) {
							if (is_454_ != null)
								class94.anIntArray1142[i_486_] = i_490_ << 25;
							else
								class94.anIntArray1142[i_486_] = 0;
						} else {
							int i_495_ = 0;
							if (is_452_ != null) {
								int i_496_ = (class94.aShortArray1141[i_486_] = (short) is_452_[i_486_]);
								if (class178.anInt2050 * 112490777 != 0) {
									i_495_ = 255 * i_496_ / (class178.anInt2050 * 112490777);
									if (i_495_ < 0)
										i_495_ = 0;
									else if (i_495_ > 255)
										i_495_ = 255;
								}
							}
							class94.anIntArray1142[i_486_] = (Class307.method5617(method14602(is_453_[i_486_] >> 8, i_490_), class178.anInt2055 * -2080392837, i_495_, (short) 10240));
							if (is_454_ != null)
								class94.anIntArray1142[i_486_] |= i_490_ << 25;
						}
					}
					boolean bool_497_ = false;
					for (int i_498_ = 0; i_498_ < class94.aShort1145; i_498_++) {
						if (is_455_[i_498_ * 3] != -1 && !(aClass180_Sub1_9126.aClass181_2059.method3544(is_455_[i_498_ * 3], (byte) -125).aBool1806))
							bool_497_ = true;
					}
					if (is_454_ != null)
						class94.anIntArray1144 = new int[class94.aShort1145];
					if (bool_497_) {
						class94.aShortArray1143 = new short[class94.aShort1145];
						class94.aShortArray1138 = new short[class94.aShort1145];
					}
					for (int i_499_ = 0; i_499_ < class94.aShort1145; i_499_++) {
						int i_500_ = i_499_ * 3;
						if (is_454_ != null && is_454_[i_500_] != 0)
							class94.anIntArray1144[i_499_] = is_454_[i_500_] >> 8;
						if (bool_497_) {
							int i_501_ = i_500_ + 1;
							int i_502_ = i_501_ + 1;
							boolean bool_503_ = false;
							boolean bool_504_ = true;
							int i_505_ = is_455_[i_500_];
							if (i_505_ == -1 || (aClass180_Sub1_9126.aClass181_2059.method3544(i_505_, (byte) -16).aBool1806))
								bool_504_ = false;
							else
								bool_503_ = true;
							i_505_ = is_455_[i_501_];
							if (i_505_ == -1 || (aClass180_Sub1_9126.aClass181_2059.method3544(i_505_, (byte) -63).aBool1806))
								bool_504_ = false;
							else
								bool_503_ = true;
							i_505_ = is_455_[i_502_];
							if (i_505_ == -1 || (aClass180_Sub1_9126.aClass181_2059.method3544(i_505_, (byte) -49).aBool1806))
								bool_504_ = false;
							else
								bool_503_ = true;
							if (bool_504_) {
								class94.aShortArray1143[i_499_] = (short) i_505_;
								class94.aShortArray1138[i_499_] = (short) is_456_[i_500_];
							} else {
								if (bool_503_) {
									i_505_ = is_455_[i_500_];
									if (i_505_ != -1 && !(aClass180_Sub1_9126.aClass181_2059.method3544(i_505_, (byte) -115).aBool1806))
										class94.anIntArray1142[i_500_] = (Class656.anIntArray8393[(Class453.method7333((aClass180_Sub1_9126.aClass181_2059.method3544(i_505_, (byte) -79).aShort1810) & 0xffff, (byte) 10)) & 0xffff]);
									i_505_ = is_455_[i_501_];
									if (i_505_ != -1 && !(aClass180_Sub1_9126.aClass181_2059.method3544(i_505_, (byte) -27).aBool1806))
										class94.anIntArray1142[i_501_] = (Class656.anIntArray8393[(Class453.method7333((aClass180_Sub1_9126.aClass181_2059.method3544(i_505_, (byte) -9).aShort1810) & 0xffff, (byte) 10)) & 0xffff]);
									i_505_ = is_455_[i_502_];
									if (i_505_ != -1 && !(aClass180_Sub1_9126.aClass181_2059.method3544(i_505_, (byte) -3).aBool1806))
										class94.anIntArray1142[i_502_] = (Class656.anIntArray8393[(Class453.method7333((aClass180_Sub1_9126.aClass181_2059.method3544(i_505_, (byte) -82).aShort1810) & 0xffff, (byte) 10)) & 0xffff]);
								}
								class94.aShortArray1143[i_499_] = (short) -1;
							}
						}
					}
					aClass94ArrayArray9131[i][i_449_] = class94;
				}
			}
		}
	}

	static int method14604(int i, int i_506_) {
		int i_507_ = (i & 0xff0000) * i_506_ >> 23;
		if (i_507_ < 2)
			i_507_ = 2;
		else if (i_507_ > 253)
			i_507_ = 253;
		int i_508_ = (i & 0xff00) * i_506_ >> 15;
		if (i_508_ < 2)
			i_508_ = 2;
		else if (i_508_ > 253)
			i_508_ = 253;
		int i_509_ = (i & 0xff) * i_506_ >> 7;
		if (i_509_ < 2)
			i_509_ = 2;
		else if (i_509_ > 253)
			i_509_ = 253;
		return i_507_ << 16 | i_508_ << 8 | i_509_;
	}

	void method14605(int i, int i_510_, int i_511_) {
		Class101 class101 = aClass180_Sub1_9126.method14835(Thread.currentThread());
		class101.aClass119_1197.anInt1441 = 0;
		if (aClass96ArrayArray9130 != null)
			method14599(i, i_510_, class101.aBool1196, class101, class101.aClass119_1197, class101.aFloatArray1228, class101.aFloatArray1229, class101.aFloatArray1230, class101.aFloatArray1231, class101.aFloatArray1202, i_511_);
		else if (aClass139ArrayArray9143 != null)
			method14598(i, i_510_, class101.aClass119_1197, class101.aFloatArray1228, class101.aFloatArray1229, class101.aFloatArray1230, class101.aFloatArray1231, class101.aFloatArray1202, i_511_);
		else if (aClass126ArrayArray9132 != null)
			method14617(i, i_510_, class101.aBool1196, class101, class101.aClass119_1197, class101.aFloatArray1228, class101.aFloatArray1229, class101.aFloatArray1230, class101.aFloatArray1231, class101.aFloatArray1202, i_511_);
	}

	public void method2611(int i, int i_512_, int[] is, int[] is_513_, int[] is_514_, int[] is_515_, int[] is_516_, int[] is_517_, int[] is_518_, int[] is_519_, Class178 class178, boolean bool) {
		boolean bool_520_ = (anInt9134 & 0x20) == 0;
		if (aClass96ArrayArray9130 == null && !bool_520_) {
			aClass96ArrayArray9130 = new Class96[anInt1750 * 1210322533][anInt1751 * -533476177];
			aClass94ArrayArray9131 = new Class94[anInt1750 * 1210322533][anInt1751 * -533476177];
		} else if (aClass126ArrayArray9132 == null && bool_520_)
			aClass126ArrayArray9132 = new Class126[anInt1750 * 1210322533][anInt1751 * -533476177];
		else if (aClass139ArrayArray9143 != null)
			throw new IllegalStateException();
		if (is != null && is.length != 0) {
			for (int i_521_ = 0; i_521_ < is_516_.length; i_521_++) {
				if (is_516_[i_521_] == -1)
					is_516_[i_521_] = 0;
				else
					is_516_[i_521_] = (Class656.anIntArray8393[(Class453.method7333(is_516_[i_521_], (byte) 10) & 0xffff)]) << 8 | 0xff;
			}
			if (is_517_ != null) {
				for (int i_522_ = 0; i_522_ < is_517_.length; i_522_++) {
					if (is_517_[i_522_] == -1)
						is_517_[i_522_] = 0;
					else
						is_517_[i_522_] = ((Class656.anIntArray8393[Class453.method7333(is_517_[i_522_], (byte) 10) & 0xffff]) << 8 | 0xff);
				}
			}
			if (bool_520_) {
				Class126 class126 = new Class126();
				class126.aShort1522 = (short) is.length;
				class126.aShort1526 = (short) (is.length / 3);
				class126.aShortArray1520 = new short[class126.aShort1522];
				class126.aShortArray1519 = new short[class126.aShort1522];
				class126.aShortArray1518 = new short[class126.aShort1522];
				class126.anIntArray1521 = new int[class126.aShort1522];
				class126.aShortArray1524 = new short[class126.aShort1522];
				class126.aShortArray1525 = new short[class126.aShort1522];
				class126.aByteArray1527 = new byte[class126.aShort1522];
				if (is_515_ != null)
					class126.aShortArray1523 = new short[class126.aShort1522];
				for (int i_523_ = 0; i_523_ < class126.aShort1522; i_523_++) {
					int i_524_ = is[i_523_];
					int i_525_ = is_514_[i_523_];
					boolean bool_526_ = false;
					int i_527_;
					if (i_524_ == 0 && i_525_ == 0)
						i_527_ = (aByteArrayArray9149[i][i_512_] - aByteArrayArray9129[i][i_512_]);
					else if (i_524_ == 0 && i_525_ == anInt1752 * 1048375491)
						i_527_ = (aByteArrayArray9149[i][i_512_ + 1] - aByteArrayArray9129[i][i_512_ + 1]);
					else if (i_524_ == anInt1752 * 1048375491 && i_525_ == anInt1752 * 1048375491)
						i_527_ = (aByteArrayArray9149[i + 1][i_512_ + 1] - aByteArrayArray9129[i + 1][i_512_ + 1]);
					else if (i_524_ == anInt1752 * 1048375491 && i_525_ == 0)
						i_527_ = (aByteArrayArray9149[i + 1][i_512_] - aByteArrayArray9129[i + 1][i_512_]);
					else {
						int i_528_ = (((aByteArrayArray9149[i][i_512_] - aByteArrayArray9129[i][i_512_]) * (anInt1752 * 1048375491 - i_524_)) + ((aByteArrayArray9149[i + 1][i_512_] - aByteArrayArray9129[i + 1][i_512_]) * i_524_));
						int i_529_ = (((aByteArrayArray9149[i][i_512_ + 1] - aByteArrayArray9129[i][i_512_ + 1]) * (anInt1752 * 1048375491 - i_524_)) + ((aByteArrayArray9149[i + 1][i_512_ + 1] - aByteArrayArray9129[i + 1][i_512_ + 1]) * i_524_));
						i_527_ = (i_528_ * (anInt1752 * 1048375491 - i_525_) + i_529_ * i_525_) >> anInt1753 * -1790967010;
					}
					int i_530_ = (i << anInt1753 * 1252000143) + i_524_;
					int i_531_ = (i_512_ << anInt1753 * 1252000143) + i_525_;
					class126.aShortArray1520[i_523_] = (short) i_524_;
					class126.aShortArray1518[i_523_] = (short) i_525_;
					class126.aShortArray1519[i_523_] = (short) (method2593(i_530_, i_531_, -1151432033) + (is_513_ != null ? is_513_[i_523_] : 0));
					if (i_527_ < 0)
						i_527_ = 0;
					if (is_516_[i_523_] == 0) {
						class126.anIntArray1521[i_523_] = 0;
						if (is_517_ != null)
							class126.aByteArray1527[i_523_] = (byte) i_527_;
					} else {
						int i_532_ = 0;
						if (is_515_ != null) {
							int i_533_ = (class126.aShortArray1523[i_523_] = (short) is_515_[i_523_]);
							if (class178.anInt2050 * 112490777 != 0) {
								i_532_ = 255 * i_533_ / (class178.anInt2050 * 112490777);
								if (i_532_ < 0)
									i_532_ = 0;
								else if (i_532_ > 255)
									i_532_ = 255;
							}
						}
						int i_534_ = -16777216;
						if (is_518_[i_523_] != -1) {
							Class163 class163 = aClass180_Sub1_9126.aClass181_2059.method3544(is_518_[i_523_], (byte) -77);
							if (class163.aBool1761 && method14603(class163.aByte1801))
								i_534_ = -1694498816;
						}
						class126.anIntArray1521[i_523_] = i_534_ | (Class307.method5617(method14602(is_516_[i_523_] >> 8, i_527_), class178.anInt2055 * -2080392837, i_532_, (short) 10240));
						if (is_517_ != null)
							class126.aByteArray1527[i_523_] = (byte) i_527_;
					}
					class126.aShortArray1524[i_523_] = (short) is_518_[i_523_];
					class126.aShortArray1525[i_523_] = (short) is_519_[i_523_];
				}
				if (is_517_ != null) {
					class126.anIntArray1528 = new int[class126.aShort1526];
					for (int i_535_ = 0; i_535_ < class126.aShort1526; i_535_++) {
						int i_536_ = i_535_ * 3;
						if (is_517_[i_536_] != 0)
							class126.anIntArray1528[i_535_] = ~0xffffff | is_517_[i_536_] >> 8;
					}
				}
				aClass126ArrayArray9132[i][i_512_] = class126;
			} else {
				boolean bool_537_ = true;
				int i_538_ = -1;
				int i_539_ = -1;
				int i_540_ = -1;
				int i_541_ = -1;
				if (is.length == 6) {
					for (int i_542_ = 0; i_542_ < 6; i_542_++) {
						if (is[i_542_] == 0 && is_514_[i_542_] == 0) {
							if (i_538_ != -1 && is_516_[i_538_] != is_516_[i_542_]) {
								bool_537_ = false;
								break;
							}
							i_538_ = i_542_;
						} else if (is[i_542_] == anInt1752 * 1048375491 && is_514_[i_542_] == 0) {
							if (i_539_ != -1 && is_516_[i_539_] != is_516_[i_542_]) {
								bool_537_ = false;
								break;
							}
							i_539_ = i_542_;
						} else if (is[i_542_] == anInt1752 * 1048375491 && (is_514_[i_542_] == anInt1752 * 1048375491)) {
							if (i_540_ != -1 && is_516_[i_540_] != is_516_[i_542_]) {
								bool_537_ = false;
								break;
							}
							i_540_ = i_542_;
						} else if (is[i_542_] == 0 && (is_514_[i_542_] == anInt1752 * 1048375491)) {
							if (i_541_ != -1 && is_516_[i_541_] != is_516_[i_542_]) {
								bool_537_ = false;
								break;
							}
							i_541_ = i_542_;
						}
					}
					if (i_538_ == -1 || i_539_ == -1 || i_540_ == -1 || i_541_ == -1)
						bool_537_ = false;
					if (bool_537_) {
						if (is_513_ != null) {
							for (int i_543_ = 0; i_543_ < 4; i_543_++) {
								if (is_513_[i_543_] != 0) {
									bool_537_ = false;
									break;
								}
							}
						}
						if (bool_537_) {
							for (int i_544_ = 1; i_544_ < 4; i_544_++) {
								if (is[i_544_] != is[0] && (is[i_544_] != is[0] + anInt1752 * 1048375491) && (is[i_544_] != is[0] - anInt1752 * 1048375491)) {
									bool_537_ = false;
									break;
								}
								if (is_514_[i_544_] != is_514_[0] && (is_514_[i_544_] != is_514_[0] + anInt1752 * 1048375491) && (is_514_[i_544_] != (is_514_[0] - anInt1752 * 1048375491))) {
									bool_537_ = false;
									break;
								}
							}
						}
					}
				} else
					bool_537_ = false;
				if (bool_537_) {
					Class96 class96 = new Class96();
					int i_545_ = is_516_[0];
					int i_546_ = is_518_[0];
					if (is_517_ != null) {
						class96.anInt1157 = is_517_[0] >> 8;
						if (i_545_ == 0)
							class96.aByte1149 |= 0x2;
					} else if (i_545_ == 0)
						return;
					if ((anIntArrayArray1754[i][i_512_] == anIntArrayArray1754[i + 1][i_512_]) && (anIntArrayArray1754[i][i_512_] == anIntArrayArray1754[i + 1][i_512_ + 1]) && (anIntArrayArray1754[i][i_512_] == anIntArrayArray1754[i][i_512_ + 1]))
						class96.aByte1149 |= 0x1;
					if (i_546_ != -1 && (class96.aByte1149 & 0x2) == 0 && !(aClass180_Sub1_9126.aClass181_2059.method3544(i_546_, (byte) -111).aBool1806)) {
						int i_547_;
						if (is_515_ != null && class178.anInt2050 * 112490777 != 0) {
							i_547_ = 255 * is_515_[i_538_] / (class178.anInt2050 * 112490777);
							if (i_547_ < 0)
								i_547_ = 0;
							else if (i_547_ > 255)
								i_547_ = 255;
						} else
							i_547_ = 0;
						class96.anInt1152 = (Class307.method5617(method14602(is_516_[i_538_] >> 8, (aByteArrayArray9149[i][i_512_] - (aByteArrayArray9129[i][i_512_]))), class178.anInt2055 * -2080392837, i_547_, (short) 10240));
						if (class96.anInt1157 != 0)
							class96.anInt1152 |= (255 - (aByteArrayArray9149[i][i_512_] - aByteArrayArray9129[i][i_512_]) << 25);
						if (is_515_ != null && class178.anInt2050 * 112490777 != 0) {
							i_547_ = 255 * is_515_[i_539_] / (class178.anInt2050 * 112490777);
							if (i_547_ < 0)
								i_547_ = 0;
							else if (i_547_ > 255)
								i_547_ = 255;
						} else
							i_547_ = 0;
						class96.anInt1158 = (Class307.method5617(method14602(is_516_[i_539_] >> 8, (aByteArrayArray9149[i + 1][i_512_] - (aByteArrayArray9129[i + 1][i_512_]))), class178.anInt2055 * -2080392837, i_547_, (short) 10240));
						if (class96.anInt1157 != 0)
							class96.anInt1158 |= 255 - (aByteArrayArray9149[i + 1][i_512_] - (aByteArrayArray9129[i + 1][i_512_])) << 25;
						if (is_515_ != null && class178.anInt2050 * 112490777 != 0) {
							i_547_ = 255 * is_515_[i_540_] / (class178.anInt2050 * 112490777);
							if (i_547_ < 0)
								i_547_ = 0;
							else if (i_547_ > 255)
								i_547_ = 255;
						} else
							i_547_ = 0;
						class96.anInt1151 = (Class307.method5617(method14602(is_516_[i_540_] >> 8, ((aByteArrayArray9149[i + 1][i_512_ + 1]) - (aByteArrayArray9129[i + 1][i_512_ + 1]))), class178.anInt2055 * -2080392837, i_547_, (short) 10240));
						if (class96.anInt1157 != 0)
							class96.anInt1151 |= (255 - (aByteArrayArray9149[i + 1][i_512_ + 1] - (aByteArrayArray9129[i + 1][i_512_ + 1]))) << 25;
						if (is_515_ != null && class178.anInt2050 * 112490777 != 0) {
							i_547_ = 255 * is_515_[i_541_] / (class178.anInt2050 * 112490777);
							if (i_547_ < 0)
								i_547_ = 0;
							else if (i_547_ > 255)
								i_547_ = 255;
						} else
							i_547_ = 0;
						class96.anInt1153 = (Class307.method5617(method14602(is_516_[i_541_] >> 8, (aByteArrayArray9149[i][i_512_ + 1] - (aByteArrayArray9129[i][i_512_ + 1]))), class178.anInt2055 * -2080392837, i_547_, (short) 10240));
						class96.aShort1148 = (short) i_546_;
					} else {
						int i_548_;
						if (is_515_ != null && class178.anInt2050 * 112490777 != 0) {
							i_548_ = 255 * is_515_[i_538_] / (class178.anInt2050 * 112490777);
							if (i_548_ < 0)
								i_548_ = 0;
							else if (i_548_ > 255)
								i_548_ = 255;
						} else
							i_548_ = 0;
						class96.anInt1152 = (Class307.method5617(method14602(is_516_[i_538_] >> 8, (aByteArrayArray9149[i][i_512_] - (aByteArrayArray9129[i][i_512_]))), class178.anInt2055 * -2080392837, i_548_, (short) 10240));
						if (class96.anInt1157 != 0)
							class96.anInt1152 |= (255 - (aByteArrayArray9149[i][i_512_] - aByteArrayArray9129[i][i_512_]) << 25);
						if (is_515_ != null && class178.anInt2050 * 112490777 != 0) {
							i_548_ = 255 * is_515_[i_539_] / (class178.anInt2050 * 112490777);
							if (i_548_ < 0)
								i_548_ = 0;
							else if (i_548_ > 255)
								i_548_ = 255;
						} else
							i_548_ = 0;
						class96.anInt1158 = (Class307.method5617(method14602(is_516_[i_539_] >> 8, (aByteArrayArray9149[i + 1][i_512_] - (aByteArrayArray9129[i + 1][i_512_]))), class178.anInt2055 * -2080392837, i_548_, (short) 10240));
						if (class96.anInt1157 != 0)
							class96.anInt1158 |= 255 - (aByteArrayArray9149[i + 1][i_512_] - (aByteArrayArray9129[i + 1][i_512_])) << 25;
						if (is_515_ != null && class178.anInt2050 * 112490777 != 0) {
							i_548_ = 255 * is_515_[i_540_] / (class178.anInt2050 * 112490777);
							if (i_548_ < 0)
								i_548_ = 0;
							else if (i_548_ > 255)
								i_548_ = 255;
						} else
							i_548_ = 0;
						class96.anInt1151 = (Class307.method5617(method14602(is_516_[i_540_] >> 8, ((aByteArrayArray9149[i + 1][i_512_ + 1]) - (aByteArrayArray9129[i + 1][i_512_ + 1]))), class178.anInt2055 * -2080392837, i_548_, (short) 10240));
						if (class96.anInt1157 != 0)
							class96.anInt1151 |= (255 - (aByteArrayArray9149[i + 1][i_512_ + 1] - (aByteArrayArray9129[i + 1][i_512_ + 1]))) << 25;
						if (is_515_ != null && class178.anInt2050 * 112490777 != 0) {
							i_548_ = 255 * is_515_[i_541_] / (class178.anInt2050 * 112490777);
							if (i_548_ < 0)
								i_548_ = 0;
							else if (i_548_ > 255)
								i_548_ = 255;
						} else
							i_548_ = 0;
						class96.anInt1153 = (Class307.method5617(method14602(is_516_[i_541_] >> 8, (aByteArrayArray9149[i][i_512_ + 1] - (aByteArrayArray9129[i][i_512_ + 1]))), class178.anInt2055 * -2080392837, i_548_, (short) 10240));
						if (class96.anInt1157 != 0)
							class96.anInt1153 |= 255 - (aByteArrayArray9149[i][i_512_ + 1] - (aByteArrayArray9129[i][i_512_ + 1])) << 25;
						class96.aShort1148 = (short) -1;
					}
					if (is_515_ != null) {
						class96.aShort1155 = (short) is_515_[i_540_];
						class96.aShort1150 = (short) is_515_[i_541_];
						class96.aShort1154 = (short) is_515_[i_539_];
						class96.aShort1156 = (short) is_515_[i_538_];
					}
					aClass96ArrayArray9130[i][i_512_] = class96;
				} else {
					Class94 class94 = new Class94();
					class94.aShort1136 = (short) is.length;
					class94.aShort1145 = (short) (is.length / 3);
					class94.aShortArray1135 = new short[class94.aShort1136];
					class94.aShortArray1139 = new short[class94.aShort1136];
					class94.aShortArray1140 = new short[class94.aShort1136];
					class94.anIntArray1142 = new int[class94.aShort1136];
					if (is_515_ != null)
						class94.aShortArray1141 = new short[class94.aShort1136];
					for (int i_549_ = 0; i_549_ < class94.aShort1136; i_549_++) {
						int i_550_ = is[i_549_];
						int i_551_ = is_514_[i_549_];
						boolean bool_552_ = false;
						int i_553_;
						if (i_550_ == 0 && i_551_ == 0)
							i_553_ = (aByteArrayArray9149[i][i_512_] - aByteArrayArray9129[i][i_512_]);
						else if (i_550_ == 0 && i_551_ == anInt1752 * 1048375491)
							i_553_ = (aByteArrayArray9149[i][i_512_ + 1] - aByteArrayArray9129[i][i_512_ + 1]);
						else if (i_550_ == anInt1752 * 1048375491 && i_551_ == anInt1752 * 1048375491)
							i_553_ = (aByteArrayArray9149[i + 1][i_512_ + 1] - aByteArrayArray9129[i + 1][i_512_ + 1]);
						else if (i_550_ == anInt1752 * 1048375491 && i_551_ == 0)
							i_553_ = (aByteArrayArray9149[i + 1][i_512_] - aByteArrayArray9129[i + 1][i_512_]);
						else {
							int i_554_ = (((aByteArrayArray9149[i][i_512_] - aByteArrayArray9129[i][i_512_]) * (anInt1752 * 1048375491 - i_550_)) + ((aByteArrayArray9149[i + 1][i_512_] - aByteArrayArray9129[i + 1][i_512_]) * i_550_));
							int i_555_ = (((aByteArrayArray9149[i][i_512_ + 1] - aByteArrayArray9129[i][i_512_ + 1]) * (anInt1752 * 1048375491 - i_550_)) + (aByteArrayArray9149[i + 1][i_512_ + 1] - (aByteArrayArray9129[i + 1][i_512_ + 1])) * i_550_);
							i_553_ = (i_554_ * (anInt1752 * 1048375491 - i_551_) + i_555_ * i_551_ >> anInt1753 * -1790967010);
						}
						int i_556_ = (i << anInt1753 * 1252000143) + i_550_;
						int i_557_ = (i_512_ << anInt1753 * 1252000143) + i_551_;
						class94.aShortArray1135[i_549_] = (short) i_550_;
						class94.aShortArray1140[i_549_] = (short) i_551_;
						class94.aShortArray1139[i_549_] = (short) (method2593(i_556_, i_557_, -1151432033) + (is_513_ != null ? is_513_[i_549_] : 0));
						if (i_553_ < 0)
							i_553_ = 0;
						if (is_516_[i_549_] == 0) {
							if (is_517_ != null)
								class94.anIntArray1142[i_549_] = i_553_ << 25;
							else
								class94.anIntArray1142[i_549_] = 0;
						} else {
							int i_558_ = 0;
							if (is_515_ != null) {
								int i_559_ = (class94.aShortArray1141[i_549_] = (short) is_515_[i_549_]);
								if (class178.anInt2050 * 112490777 != 0) {
									i_558_ = 255 * i_559_ / (class178.anInt2050 * 112490777);
									if (i_558_ < 0)
										i_558_ = 0;
									else if (i_558_ > 255)
										i_558_ = 255;
								}
							}
							class94.anIntArray1142[i_549_] = (Class307.method5617(method14602(is_516_[i_549_] >> 8, i_553_), class178.anInt2055 * -2080392837, i_558_, (short) 10240));
							if (is_517_ != null)
								class94.anIntArray1142[i_549_] |= i_553_ << 25;
						}
					}
					boolean bool_560_ = false;
					for (int i_561_ = 0; i_561_ < class94.aShort1145; i_561_++) {
						if (is_518_[i_561_ * 3] != -1 && !(aClass180_Sub1_9126.aClass181_2059.method3544(is_518_[i_561_ * 3], (byte) -125).aBool1806))
							bool_560_ = true;
					}
					if (is_517_ != null)
						class94.anIntArray1144 = new int[class94.aShort1145];
					if (bool_560_) {
						class94.aShortArray1143 = new short[class94.aShort1145];
						class94.aShortArray1138 = new short[class94.aShort1145];
					}
					for (int i_562_ = 0; i_562_ < class94.aShort1145; i_562_++) {
						int i_563_ = i_562_ * 3;
						if (is_517_ != null && is_517_[i_563_] != 0)
							class94.anIntArray1144[i_562_] = is_517_[i_563_] >> 8;
						if (bool_560_) {
							int i_564_ = i_563_ + 1;
							int i_565_ = i_564_ + 1;
							boolean bool_566_ = false;
							boolean bool_567_ = true;
							int i_568_ = is_518_[i_563_];
							if (i_568_ == -1 || (aClass180_Sub1_9126.aClass181_2059.method3544(i_568_, (byte) -91).aBool1806))
								bool_567_ = false;
							else
								bool_566_ = true;
							i_568_ = is_518_[i_564_];
							if (i_568_ == -1 || (aClass180_Sub1_9126.aClass181_2059.method3544(i_568_, (byte) -57).aBool1806))
								bool_567_ = false;
							else
								bool_566_ = true;
							i_568_ = is_518_[i_565_];
							if (i_568_ == -1 || (aClass180_Sub1_9126.aClass181_2059.method3544(i_568_, (byte) -104).aBool1806))
								bool_567_ = false;
							else
								bool_566_ = true;
							if (bool_567_) {
								class94.aShortArray1143[i_562_] = (short) i_568_;
								class94.aShortArray1138[i_562_] = (short) is_519_[i_563_];
							} else {
								if (bool_566_) {
									i_568_ = is_518_[i_563_];
									if (i_568_ != -1 && !(aClass180_Sub1_9126.aClass181_2059.method3544(i_568_, (byte) -66).aBool1806))
										class94.anIntArray1142[i_563_] = (Class656.anIntArray8393[(Class453.method7333((aClass180_Sub1_9126.aClass181_2059.method3544(i_568_, (byte) -81).aShort1810) & 0xffff, (byte) 10)) & 0xffff]);
									i_568_ = is_518_[i_564_];
									if (i_568_ != -1 && !(aClass180_Sub1_9126.aClass181_2059.method3544(i_568_, (byte) -41).aBool1806))
										class94.anIntArray1142[i_564_] = (Class656.anIntArray8393[(Class453.method7333((aClass180_Sub1_9126.aClass181_2059.method3544(i_568_, (byte) -61).aShort1810) & 0xffff, (byte) 10)) & 0xffff]);
									i_568_ = is_518_[i_565_];
									if (i_568_ != -1 && !(aClass180_Sub1_9126.aClass181_2059.method3544(i_568_, (byte) -116).aBool1806))
										class94.anIntArray1142[i_565_] = (Class656.anIntArray8393[(Class453.method7333((aClass180_Sub1_9126.aClass181_2059.method3544(i_568_, (byte) -111).aShort1810) & 0xffff, (byte) 10)) & 0xffff]);
								}
								class94.aShortArray1143[i_562_] = (short) -1;
							}
						}
					}
					aClass94ArrayArray9131[i][i_512_] = class94;
				}
			}
		}
	}

	void method14606(int i, int i_569_, Class119 class119, float[] fs, float[] fs_570_, float[] fs_571_, float[] fs_572_, float[] fs_573_, int i_574_) {
		Class139 class139 = aClass139ArrayArray9143[i][i_569_];
		if (class139 != null) {
			if ((class139.aByte1646 & 0x2) == 0) {
				if (i_574_ != 0) {
					if ((class139.aByte1646 & 0x4) != 0) {
						if ((i_574_ & 0x1) != 0)
							return;
					} else if ((i_574_ & 0x2) != 0)
						return;
				}
				int i_575_ = i * (anInt1752 * 1048375491);
				int i_576_ = i_575_ + anInt1752 * 1048375491;
				int i_577_ = i_569_ * (anInt1752 * 1048375491);
				int i_578_ = i_577_ + anInt1752 * 1048375491;
				float f;
				float f_579_;
				float f_580_;
				float f_581_;
				float f_582_;
				float f_583_;
				float f_584_;
				float f_585_;
				float f_586_;
				float f_587_;
				float f_588_;
				float f_589_;
				float f_590_;
				float f_591_;
				float f_592_;
				float f_593_;
				if ((class139.aByte1646 & 0x1) != 0) {
					int i_594_ = anIntArrayArray1754[i][i_569_];
					float f_595_ = aFloat9127 * (float) i_594_;
					float f_596_ = aFloat9123 * (float) i_594_;
					float f_597_ = aFloat9145 + (aFloat9135 * (float) i_575_ + f_595_ + aFloat9128 * (float) i_577_);
					f = aFloat9148 + (aFloat9136 * (float) i_575_ + f_596_ + aFloat9144 * (float) i_577_);
					if (f_597_ < -f)
						return;
					float f_598_ = aFloat9145 + (aFloat9135 * (float) i_576_ + f_595_ + aFloat9128 * (float) i_577_);
					f_579_ = aFloat9148 + (aFloat9136 * (float) i_576_ + f_596_ + aFloat9144 * (float) i_577_);
					if (f_598_ < -f_579_)
						return;
					float f_599_ = aFloat9145 + (aFloat9135 * (float) i_576_ + f_595_ + aFloat9128 * (float) i_578_);
					f_580_ = aFloat9148 + (aFloat9136 * (float) i_576_ + f_596_ + aFloat9144 * (float) i_578_);
					if (f_599_ < -f_580_)
						return;
					float f_600_ = aFloat9145 + (aFloat9135 * (float) i_575_ + f_595_ + aFloat9128 * (float) i_578_);
					f_581_ = aFloat9148 + (aFloat9136 * (float) i_575_ + f_596_ + aFloat9144 * (float) i_578_);
					if (f_600_ < -f_581_)
						return;
					float f_601_ = aFloat9137 * (float) i_594_;
					float f_602_ = aFloat9138 * (float) i_594_;
					float f_603_ = aFloat9122 + (aFloat9133 * (float) i_575_ + f_601_ + aFloat9141 * (float) i_577_);
					f_582_ = (class119.aFloat1448 + class119.aFloat1451 * f_603_ / f);
					float f_604_ = aFloat9121 + (aFloat9146 * (float) i_575_ + f_602_ + aFloat9142 * (float) i_577_);
					f_583_ = (class119.aFloat1444 + class119.aFloat1466 * f_604_ / f);
					f_584_ = (class119.aFloat1452 + class119.aFloat1453 * f_597_ / f);
					float f_605_ = aFloat9122 + (aFloat9133 * (float) i_576_ + f_601_ + aFloat9141 * (float) i_577_);
					f_585_ = (class119.aFloat1448 + class119.aFloat1451 * f_605_ / f_579_);
					float f_606_ = aFloat9121 + (aFloat9146 * (float) i_576_ + f_602_ + aFloat9142 * (float) i_577_);
					f_586_ = (class119.aFloat1444 + class119.aFloat1466 * f_606_ / f_579_);
					f_587_ = (class119.aFloat1452 + class119.aFloat1453 * f_598_ / f_579_);
					float f_607_ = aFloat9122 + (aFloat9133 * (float) i_576_ + f_601_ + aFloat9141 * (float) i_578_);
					f_588_ = (class119.aFloat1448 + class119.aFloat1451 * f_607_ / f_580_);
					float f_608_ = aFloat9121 + (aFloat9146 * (float) i_576_ + f_602_ + aFloat9142 * (float) i_578_);
					f_589_ = (class119.aFloat1444 + class119.aFloat1466 * f_608_ / f_580_);
					f_590_ = (class119.aFloat1452 + class119.aFloat1453 * f_599_ / f_580_);
					float f_609_ = aFloat9122 + (aFloat9133 * (float) i_575_ + f_601_ + aFloat9141 * (float) i_578_);
					f_591_ = (class119.aFloat1448 + class119.aFloat1451 * f_609_ / f_581_);
					float f_610_ = aFloat9121 + (aFloat9146 * (float) i_575_ + f_602_ + aFloat9142 * (float) i_578_);
					f_592_ = (class119.aFloat1444 + class119.aFloat1466 * f_610_ / f_581_);
					f_593_ = (class119.aFloat1452 + class119.aFloat1453 * f_600_ / f_581_);
				} else {
					int i_611_ = anIntArrayArray1754[i][i_569_];
					int i_612_ = anIntArrayArray1754[i + 1][i_569_];
					int i_613_ = anIntArrayArray1754[i + 1][i_569_ + 1];
					int i_614_ = anIntArrayArray1754[i][i_569_ + 1];
					float f_615_ = aFloat9145 + (aFloat9135 * (float) i_575_ + aFloat9127 * (float) i_611_ + aFloat9128 * (float) i_577_);
					f = aFloat9148 + (aFloat9136 * (float) i_575_ + aFloat9123 * (float) i_611_ + aFloat9144 * (float) i_577_);
					if (f_615_ < -f)
						return;
					float f_616_ = aFloat9145 + (aFloat9135 * (float) i_576_ + aFloat9127 * (float) i_612_ + aFloat9128 * (float) i_577_);
					f_579_ = aFloat9148 + (aFloat9136 * (float) i_576_ + aFloat9123 * (float) i_612_ + aFloat9144 * (float) i_577_);
					if (f_616_ < -f_579_)
						return;
					float f_617_ = aFloat9145 + (aFloat9135 * (float) i_576_ + aFloat9127 * (float) i_613_ + aFloat9128 * (float) i_578_);
					f_580_ = aFloat9148 + (aFloat9136 * (float) i_576_ + aFloat9123 * (float) i_613_ + aFloat9144 * (float) i_578_);
					if (f_617_ < -f_580_)
						return;
					float f_618_ = aFloat9145 + (aFloat9135 * (float) i_575_ + aFloat9127 * (float) i_614_ + aFloat9128 * (float) i_578_);
					f_581_ = aFloat9148 + (aFloat9136 * (float) i_575_ + aFloat9123 * (float) i_614_ + aFloat9144 * (float) i_578_);
					if (f_618_ < -f_581_)
						return;
					float f_619_ = aFloat9122 + (aFloat9133 * (float) i_575_ + aFloat9137 * (float) i_611_ + aFloat9141 * (float) i_577_);
					f_582_ = (class119.aFloat1448 + class119.aFloat1451 * f_619_ / f);
					float f_620_ = aFloat9121 + (aFloat9146 * (float) i_575_ + aFloat9138 * (float) i_611_ + aFloat9142 * (float) i_577_);
					f_583_ = (class119.aFloat1444 + class119.aFloat1466 * f_620_ / f);
					f_584_ = (class119.aFloat1452 + class119.aFloat1453 * f_615_ / f);
					float f_621_ = aFloat9122 + (aFloat9133 * (float) i_576_ + aFloat9137 * (float) i_612_ + aFloat9141 * (float) i_577_);
					f_585_ = (class119.aFloat1448 + class119.aFloat1451 * f_621_ / f_579_);
					float f_622_ = aFloat9121 + (aFloat9146 * (float) i_576_ + aFloat9138 * (float) i_612_ + aFloat9142 * (float) i_577_);
					f_586_ = (class119.aFloat1444 + class119.aFloat1466 * f_622_ / f_579_);
					f_587_ = (class119.aFloat1452 + class119.aFloat1453 * f_616_ / f_579_);
					float f_623_ = aFloat9122 + (aFloat9133 * (float) i_576_ + aFloat9137 * (float) i_613_ + aFloat9141 * (float) i_578_);
					f_588_ = (class119.aFloat1448 + class119.aFloat1451 * f_623_ / f_580_);
					float f_624_ = aFloat9121 + (aFloat9146 * (float) i_576_ + aFloat9138 * (float) i_613_ + aFloat9142 * (float) i_578_);
					f_589_ = (class119.aFloat1444 + class119.aFloat1466 * f_624_ / f_580_);
					f_590_ = (class119.aFloat1452 + class119.aFloat1453 * f_617_ / f_580_);
					float f_625_ = aFloat9122 + (aFloat9133 * (float) i_575_ + aFloat9137 * (float) i_614_ + aFloat9141 * (float) i_578_);
					f_591_ = (class119.aFloat1448 + class119.aFloat1451 * f_625_ / f_581_);
					float f_626_ = aFloat9121 + (aFloat9146 * (float) i_575_ + aFloat9138 * (float) i_614_ + aFloat9142 * (float) i_578_);
					f_592_ = (class119.aFloat1444 + class119.aFloat1466 * f_626_ / f_581_);
					f_593_ = (class119.aFloat1452 + class119.aFloat1453 * f_618_ / f_581_);
				}
				boolean bool = false;
				if (class139.aShort1644 != -1) {
					Class163 class163 = (aClass180_Sub1_9126.aClass181_2059.method3544(class139.aShort1644 & 0xffff, (byte) -94));
					bool = class163.aBool1761;
				}
				if (((f_588_ - f_591_) * (f_586_ - f_592_) - (f_589_ - f_592_) * (f_585_ - f_591_)) > 0.0F) {
					class119.aBool1445 = (f_588_ < 0.0F || f_591_ < 0.0F || f_585_ < 0.0F || f_588_ > (float) class119.anInt1442 || f_591_ > (float) class119.anInt1442 || f_585_ > (float) class119.anInt1442);
					if (bool)
						class119.method2079(true, true, false, f_589_, f_592_, f_586_, f_588_, f_591_, f_585_, f_590_, f_593_, f_587_, f_580_, f_581_, f_579_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, ~0xffffff | ((Class656.anIntArray8393[class139.aShort1642 & 0xffff]) & 0xffffff), ~0xffffff | ((Class656.anIntArray8393[class139.aShort1643 & 0xffff]) & 0xffffff), ~0xffffff | ((Class656.anIntArray8393[class139.aShort1640 & 0xffff]) & 0xffffff), 0, 0.0F, 0.0F, 0.0F, class139.aShort1644 & 0xffff);
					else
						class119.method2073(true, true, false, f_589_, f_592_, f_586_, f_588_, f_591_, f_585_, f_590_, f_593_, f_587_, (float) (class139.aShort1642 & 0xffff), (float) (class139.aShort1643 & 0xffff), (float) (class139.aShort1640 & 0xffff));
				}
				if (((f_582_ - f_585_) * (f_592_ - f_586_) - (f_583_ - f_586_) * (f_591_ - f_585_)) > 0.0F) {
					class119.aBool1445 = (f_582_ < 0.0F || f_585_ < 0.0F || f_591_ < 0.0F || f_582_ > (float) class119.anInt1442 || f_585_ > (float) class119.anInt1442 || f_591_ > (float) class119.anInt1442);
					if (bool)
						class119.method2079(true, true, false, f_583_, f_586_, f_592_, f_582_, f_585_, f_591_, f_584_, f_587_, f_593_, f, f_579_, f_581_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, ~0xffffff | ((Class656.anIntArray8393[class139.aShort1641 & 0xffff]) & 0xffffff), ~0xffffff | ((Class656.anIntArray8393[class139.aShort1640 & 0xffff]) & 0xffffff), ~0xffffff | ((Class656.anIntArray8393[class139.aShort1643 & 0xffff]) & 0xffffff), 0, 0.0F, 0.0F, 0.0F, class139.aShort1644 & 0xffff);
					else
						class119.method2073(true, true, false, f_583_, f_586_, f_592_, f_582_, f_585_, f_591_, f_584_, f_587_, f_593_, (float) (class139.aShort1641 & 0xffff), (float) (class139.aShort1640 & 0xffff), (float) (class139.aShort1643 & 0xffff));
				}
			}
		} else {
			Class111 class111 = aClass111ArrayArray9140[i][i_569_];
			if (class111 != null) {
				if (i_574_ != 0) {
					if ((class111.aByte1394 & 0x4) != 0) {
						if ((i_574_ & 0x1) != 0)
							return;
					} else if ((i_574_ & 0x2) != 0)
						return;
				}
				for (int i_627_ = 0; i_627_ < class111.aShort1402; i_627_++) {
					int i_628_ = (class111.aShortArray1395[i_627_] + (i << anInt1753 * 1252000143));
					short i_629_ = class111.aShortArray1396[i_627_];
					int i_630_ = (class111.aShortArray1398[i_627_] + (i_569_ << anInt1753 * 1252000143));
					float f = aFloat9145 + (aFloat9135 * (float) i_628_ + aFloat9127 * (float) i_629_ + aFloat9128 * (float) i_630_);
					float f_631_ = aFloat9148 + (aFloat9136 * (float) i_628_ + aFloat9123 * (float) i_629_ + aFloat9144 * (float) i_630_);
					if (f < -f_631_)
						return;
					float f_632_ = aFloat9122 + (aFloat9133 * (float) i_628_ + aFloat9137 * (float) i_629_ + aFloat9141 * (float) i_630_);
					float f_633_ = aFloat9121 + (aFloat9146 * (float) i_628_ + aFloat9138 * (float) i_629_ + aFloat9142 * (float) i_630_);
					fs[i_627_] = (class119.aFloat1448 + class119.aFloat1451 * f_632_ / f_631_);
					fs_570_[i_627_] = (class119.aFloat1444 + class119.aFloat1466 * f_633_ / f_631_);
					fs_571_[i_627_] = (class119.aFloat1452 + class119.aFloat1453 * f / f_631_);
					fs_572_[i_627_] = f_631_;
				}
				if (class111.aShortArray1405 != null) {
					for (int i_634_ = 0; i_634_ < class111.aShort1403; i_634_++) {
						short i_635_ = class111.aShortArray1399[i_634_];
						short i_636_ = class111.aShortArray1400[i_634_];
						short i_637_ = class111.aShortArray1401[i_634_];
						float f = fs[i_635_];
						float f_638_ = fs[i_636_];
						float f_639_ = fs[i_637_];
						float f_640_ = fs_570_[i_635_];
						float f_641_ = fs_570_[i_636_];
						float f_642_ = fs_570_[i_637_];
						if (((f - f_638_) * (f_642_ - f_641_) - (f_640_ - f_641_) * (f_639_ - f_638_)) > 0.0F) {
							class119.aBool1445 = (f < 0.0F || f_638_ < 0.0F || f_639_ < 0.0F || f > (float) class119.anInt1442 || f_638_ > (float) class119.anInt1442 || f_639_ > (float) class119.anInt1442);
							boolean bool = false;
							if (class111.aShortArray1405[i_634_] != -1) {
								Class163 class163 = (aClass180_Sub1_9126.aClass181_2059.method3544((class111.aShortArray1405[i_634_] & 0xffff), (byte) -72));
								bool = class163.aBool1761;
							}
							if (bool)
								class119.method2079(true, true, false, f_640_, f_641_, f_642_, f, f_638_, f_639_, fs_571_[i_635_], fs_571_[i_636_], fs_571_[i_637_], fs_572_[i_635_], fs_572_[i_636_], fs_572_[i_637_], ((float) class111.aShortArray1395[i_635_] / (float) (anInt1752 * 1048375491)), ((float) class111.aShortArray1395[i_636_] / (float) (anInt1752 * 1048375491)), ((float) class111.aShortArray1395[i_637_] / (float) (anInt1752 * 1048375491)),
										((float) class111.aShortArray1398[i_635_] / (float) (anInt1752 * 1048375491)), ((float) class111.aShortArray1398[i_636_] / (float) (anInt1752 * 1048375491)), ((float) class111.aShortArray1398[i_637_] / (float) (anInt1752 * 1048375491)), (~0xffffff | (Class656.anIntArray8393[(class111.aShortArray1393[i_635_] & 0xffff)]) & 0xffffff), (~0xffffff | (Class656.anIntArray8393[(class111.aShortArray1393[i_636_] & 0xffff)]) & 0xffffff),
										(~0xffffff | (Class656.anIntArray8393[(class111.aShortArray1393[i_637_] & 0xffff)]) & 0xffffff), 0, 0.0F, 0.0F, 0.0F, (class111.aShortArray1405[i_634_] & 0xffff));
							else {
								int i_643_ = class111.anIntArray1404[i_634_];
								if (i_643_ != -1)
									class119.method2073(true, true, false, f_640_, f_641_, f_642_, f, f_638_, f_639_, fs_571_[i_635_], fs_571_[i_636_], fs_571_[i_637_], (float) (Class395.method6504(i_643_, (class111.aShortArray1393[i_635_]), -501584282)), (float) (Class395.method6504(i_643_, (class111.aShortArray1393[i_636_]), -501584282)), (float) (Class395.method6504(i_643_, (class111.aShortArray1393[i_637_]), -501584282)));
							}
						}
					}
				} else {
					for (int i_644_ = 0; i_644_ < class111.aShort1403; i_644_++) {
						short i_645_ = class111.aShortArray1399[i_644_];
						short i_646_ = class111.aShortArray1400[i_644_];
						short i_647_ = class111.aShortArray1401[i_644_];
						float f = fs[i_645_];
						float f_648_ = fs[i_646_];
						float f_649_ = fs[i_647_];
						float f_650_ = fs_570_[i_645_];
						float f_651_ = fs_570_[i_646_];
						float f_652_ = fs_570_[i_647_];
						if (((f - f_648_) * (f_652_ - f_651_) - (f_650_ - f_651_) * (f_649_ - f_648_)) > 0.0F) {
							int i_653_ = class111.anIntArray1404[i_644_];
							if (i_653_ != -1) {
								class119.aBool1445 = (f < 0.0F || f_648_ < 0.0F || f_649_ < 0.0F || f > (float) class119.anInt1442 || f_648_ > (float) class119.anInt1442 || f_649_ > (float) class119.anInt1442);
								class119.method2073(true, true, false, f_650_, f_651_, f_652_, f, f_648_, f_649_, fs_571_[i_645_], fs_571_[i_646_], fs_571_[i_647_], (float) (Class395.method6504(i_653_, (class111.aShortArray1393[i_645_]), -501584282)), (float) (Class395.method6504(i_653_, (class111.aShortArray1393[i_646_]), -501584282)), (float) (Class395.method6504(i_653_, (class111.aShortArray1393[i_647_]), -501584282)));
							}
						}
					}
				}
			}
		}
	}

	void method14607(int i, int i_654_, Class119 class119, float[] fs, float[] fs_655_, float[] fs_656_, float[] fs_657_, float[] fs_658_, int i_659_) {
		Class139 class139 = aClass139ArrayArray9143[i][i_654_];
		if (class139 != null) {
			if ((class139.aByte1646 & 0x2) == 0) {
				if (i_659_ != 0) {
					if ((class139.aByte1646 & 0x4) != 0) {
						if ((i_659_ & 0x1) != 0)
							return;
					} else if ((i_659_ & 0x2) != 0)
						return;
				}
				int i_660_ = i * (anInt1752 * 1048375491);
				int i_661_ = i_660_ + anInt1752 * 1048375491;
				int i_662_ = i_654_ * (anInt1752 * 1048375491);
				int i_663_ = i_662_ + anInt1752 * 1048375491;
				float f;
				float f_664_;
				float f_665_;
				float f_666_;
				float f_667_;
				float f_668_;
				float f_669_;
				float f_670_;
				float f_671_;
				float f_672_;
				float f_673_;
				float f_674_;
				float f_675_;
				float f_676_;
				float f_677_;
				float f_678_;
				if ((class139.aByte1646 & 0x1) != 0) {
					int i_679_ = anIntArrayArray1754[i][i_654_];
					float f_680_ = aFloat9127 * (float) i_679_;
					float f_681_ = aFloat9123 * (float) i_679_;
					float f_682_ = aFloat9145 + (aFloat9135 * (float) i_660_ + f_680_ + aFloat9128 * (float) i_662_);
					f = aFloat9148 + (aFloat9136 * (float) i_660_ + f_681_ + aFloat9144 * (float) i_662_);
					if (f_682_ < -f)
						return;
					float f_683_ = aFloat9145 + (aFloat9135 * (float) i_661_ + f_680_ + aFloat9128 * (float) i_662_);
					f_664_ = aFloat9148 + (aFloat9136 * (float) i_661_ + f_681_ + aFloat9144 * (float) i_662_);
					if (f_683_ < -f_664_)
						return;
					float f_684_ = aFloat9145 + (aFloat9135 * (float) i_661_ + f_680_ + aFloat9128 * (float) i_663_);
					f_665_ = aFloat9148 + (aFloat9136 * (float) i_661_ + f_681_ + aFloat9144 * (float) i_663_);
					if (f_684_ < -f_665_)
						return;
					float f_685_ = aFloat9145 + (aFloat9135 * (float) i_660_ + f_680_ + aFloat9128 * (float) i_663_);
					f_666_ = aFloat9148 + (aFloat9136 * (float) i_660_ + f_681_ + aFloat9144 * (float) i_663_);
					if (f_685_ < -f_666_)
						return;
					float f_686_ = aFloat9137 * (float) i_679_;
					float f_687_ = aFloat9138 * (float) i_679_;
					float f_688_ = aFloat9122 + (aFloat9133 * (float) i_660_ + f_686_ + aFloat9141 * (float) i_662_);
					f_667_ = (class119.aFloat1448 + class119.aFloat1451 * f_688_ / f);
					float f_689_ = aFloat9121 + (aFloat9146 * (float) i_660_ + f_687_ + aFloat9142 * (float) i_662_);
					f_668_ = (class119.aFloat1444 + class119.aFloat1466 * f_689_ / f);
					f_669_ = (class119.aFloat1452 + class119.aFloat1453 * f_682_ / f);
					float f_690_ = aFloat9122 + (aFloat9133 * (float) i_661_ + f_686_ + aFloat9141 * (float) i_662_);
					f_670_ = (class119.aFloat1448 + class119.aFloat1451 * f_690_ / f_664_);
					float f_691_ = aFloat9121 + (aFloat9146 * (float) i_661_ + f_687_ + aFloat9142 * (float) i_662_);
					f_671_ = (class119.aFloat1444 + class119.aFloat1466 * f_691_ / f_664_);
					f_672_ = (class119.aFloat1452 + class119.aFloat1453 * f_683_ / f_664_);
					float f_692_ = aFloat9122 + (aFloat9133 * (float) i_661_ + f_686_ + aFloat9141 * (float) i_663_);
					f_673_ = (class119.aFloat1448 + class119.aFloat1451 * f_692_ / f_665_);
					float f_693_ = aFloat9121 + (aFloat9146 * (float) i_661_ + f_687_ + aFloat9142 * (float) i_663_);
					f_674_ = (class119.aFloat1444 + class119.aFloat1466 * f_693_ / f_665_);
					f_675_ = (class119.aFloat1452 + class119.aFloat1453 * f_684_ / f_665_);
					float f_694_ = aFloat9122 + (aFloat9133 * (float) i_660_ + f_686_ + aFloat9141 * (float) i_663_);
					f_676_ = (class119.aFloat1448 + class119.aFloat1451 * f_694_ / f_666_);
					float f_695_ = aFloat9121 + (aFloat9146 * (float) i_660_ + f_687_ + aFloat9142 * (float) i_663_);
					f_677_ = (class119.aFloat1444 + class119.aFloat1466 * f_695_ / f_666_);
					f_678_ = (class119.aFloat1452 + class119.aFloat1453 * f_685_ / f_666_);
				} else {
					int i_696_ = anIntArrayArray1754[i][i_654_];
					int i_697_ = anIntArrayArray1754[i + 1][i_654_];
					int i_698_ = anIntArrayArray1754[i + 1][i_654_ + 1];
					int i_699_ = anIntArrayArray1754[i][i_654_ + 1];
					float f_700_ = aFloat9145 + (aFloat9135 * (float) i_660_ + aFloat9127 * (float) i_696_ + aFloat9128 * (float) i_662_);
					f = aFloat9148 + (aFloat9136 * (float) i_660_ + aFloat9123 * (float) i_696_ + aFloat9144 * (float) i_662_);
					if (f_700_ < -f)
						return;
					float f_701_ = aFloat9145 + (aFloat9135 * (float) i_661_ + aFloat9127 * (float) i_697_ + aFloat9128 * (float) i_662_);
					f_664_ = aFloat9148 + (aFloat9136 * (float) i_661_ + aFloat9123 * (float) i_697_ + aFloat9144 * (float) i_662_);
					if (f_701_ < -f_664_)
						return;
					float f_702_ = aFloat9145 + (aFloat9135 * (float) i_661_ + aFloat9127 * (float) i_698_ + aFloat9128 * (float) i_663_);
					f_665_ = aFloat9148 + (aFloat9136 * (float) i_661_ + aFloat9123 * (float) i_698_ + aFloat9144 * (float) i_663_);
					if (f_702_ < -f_665_)
						return;
					float f_703_ = aFloat9145 + (aFloat9135 * (float) i_660_ + aFloat9127 * (float) i_699_ + aFloat9128 * (float) i_663_);
					f_666_ = aFloat9148 + (aFloat9136 * (float) i_660_ + aFloat9123 * (float) i_699_ + aFloat9144 * (float) i_663_);
					if (f_703_ < -f_666_)
						return;
					float f_704_ = aFloat9122 + (aFloat9133 * (float) i_660_ + aFloat9137 * (float) i_696_ + aFloat9141 * (float) i_662_);
					f_667_ = (class119.aFloat1448 + class119.aFloat1451 * f_704_ / f);
					float f_705_ = aFloat9121 + (aFloat9146 * (float) i_660_ + aFloat9138 * (float) i_696_ + aFloat9142 * (float) i_662_);
					f_668_ = (class119.aFloat1444 + class119.aFloat1466 * f_705_ / f);
					f_669_ = (class119.aFloat1452 + class119.aFloat1453 * f_700_ / f);
					float f_706_ = aFloat9122 + (aFloat9133 * (float) i_661_ + aFloat9137 * (float) i_697_ + aFloat9141 * (float) i_662_);
					f_670_ = (class119.aFloat1448 + class119.aFloat1451 * f_706_ / f_664_);
					float f_707_ = aFloat9121 + (aFloat9146 * (float) i_661_ + aFloat9138 * (float) i_697_ + aFloat9142 * (float) i_662_);
					f_671_ = (class119.aFloat1444 + class119.aFloat1466 * f_707_ / f_664_);
					f_672_ = (class119.aFloat1452 + class119.aFloat1453 * f_701_ / f_664_);
					float f_708_ = aFloat9122 + (aFloat9133 * (float) i_661_ + aFloat9137 * (float) i_698_ + aFloat9141 * (float) i_663_);
					f_673_ = (class119.aFloat1448 + class119.aFloat1451 * f_708_ / f_665_);
					float f_709_ = aFloat9121 + (aFloat9146 * (float) i_661_ + aFloat9138 * (float) i_698_ + aFloat9142 * (float) i_663_);
					f_674_ = (class119.aFloat1444 + class119.aFloat1466 * f_709_ / f_665_);
					f_675_ = (class119.aFloat1452 + class119.aFloat1453 * f_702_ / f_665_);
					float f_710_ = aFloat9122 + (aFloat9133 * (float) i_660_ + aFloat9137 * (float) i_699_ + aFloat9141 * (float) i_663_);
					f_676_ = (class119.aFloat1448 + class119.aFloat1451 * f_710_ / f_666_);
					float f_711_ = aFloat9121 + (aFloat9146 * (float) i_660_ + aFloat9138 * (float) i_699_ + aFloat9142 * (float) i_663_);
					f_677_ = (class119.aFloat1444 + class119.aFloat1466 * f_711_ / f_666_);
					f_678_ = (class119.aFloat1452 + class119.aFloat1453 * f_703_ / f_666_);
				}
				boolean bool = false;
				if (class139.aShort1644 != -1) {
					Class163 class163 = (aClass180_Sub1_9126.aClass181_2059.method3544(class139.aShort1644 & 0xffff, (byte) -109));
					bool = class163.aBool1761;
				}
				if (((f_673_ - f_676_) * (f_671_ - f_677_) - (f_674_ - f_677_) * (f_670_ - f_676_)) > 0.0F) {
					class119.aBool1445 = (f_673_ < 0.0F || f_676_ < 0.0F || f_670_ < 0.0F || f_673_ > (float) class119.anInt1442 || f_676_ > (float) class119.anInt1442 || f_670_ > (float) class119.anInt1442);
					if (bool)
						class119.method2079(true, true, false, f_674_, f_677_, f_671_, f_673_, f_676_, f_670_, f_675_, f_678_, f_672_, f_665_, f_666_, f_664_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, ~0xffffff | ((Class656.anIntArray8393[class139.aShort1642 & 0xffff]) & 0xffffff), ~0xffffff | ((Class656.anIntArray8393[class139.aShort1643 & 0xffff]) & 0xffffff), ~0xffffff | ((Class656.anIntArray8393[class139.aShort1640 & 0xffff]) & 0xffffff), 0, 0.0F, 0.0F, 0.0F, class139.aShort1644 & 0xffff);
					else
						class119.method2073(true, true, false, f_674_, f_677_, f_671_, f_673_, f_676_, f_670_, f_675_, f_678_, f_672_, (float) (class139.aShort1642 & 0xffff), (float) (class139.aShort1643 & 0xffff), (float) (class139.aShort1640 & 0xffff));
				}
				if (((f_667_ - f_670_) * (f_677_ - f_671_) - (f_668_ - f_671_) * (f_676_ - f_670_)) > 0.0F) {
					class119.aBool1445 = (f_667_ < 0.0F || f_670_ < 0.0F || f_676_ < 0.0F || f_667_ > (float) class119.anInt1442 || f_670_ > (float) class119.anInt1442 || f_676_ > (float) class119.anInt1442);
					if (bool)
						class119.method2079(true, true, false, f_668_, f_671_, f_677_, f_667_, f_670_, f_676_, f_669_, f_672_, f_678_, f, f_664_, f_666_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, ~0xffffff | ((Class656.anIntArray8393[class139.aShort1641 & 0xffff]) & 0xffffff), ~0xffffff | ((Class656.anIntArray8393[class139.aShort1640 & 0xffff]) & 0xffffff), ~0xffffff | ((Class656.anIntArray8393[class139.aShort1643 & 0xffff]) & 0xffffff), 0, 0.0F, 0.0F, 0.0F, class139.aShort1644 & 0xffff);
					else
						class119.method2073(true, true, false, f_668_, f_671_, f_677_, f_667_, f_670_, f_676_, f_669_, f_672_, f_678_, (float) (class139.aShort1641 & 0xffff), (float) (class139.aShort1640 & 0xffff), (float) (class139.aShort1643 & 0xffff));
				}
			}
		} else {
			Class111 class111 = aClass111ArrayArray9140[i][i_654_];
			if (class111 != null) {
				if (i_659_ != 0) {
					if ((class111.aByte1394 & 0x4) != 0) {
						if ((i_659_ & 0x1) != 0)
							return;
					} else if ((i_659_ & 0x2) != 0)
						return;
				}
				for (int i_712_ = 0; i_712_ < class111.aShort1402; i_712_++) {
					int i_713_ = (class111.aShortArray1395[i_712_] + (i << anInt1753 * 1252000143));
					short i_714_ = class111.aShortArray1396[i_712_];
					int i_715_ = (class111.aShortArray1398[i_712_] + (i_654_ << anInt1753 * 1252000143));
					float f = aFloat9145 + (aFloat9135 * (float) i_713_ + aFloat9127 * (float) i_714_ + aFloat9128 * (float) i_715_);
					float f_716_ = aFloat9148 + (aFloat9136 * (float) i_713_ + aFloat9123 * (float) i_714_ + aFloat9144 * (float) i_715_);
					if (f < -f_716_)
						return;
					float f_717_ = aFloat9122 + (aFloat9133 * (float) i_713_ + aFloat9137 * (float) i_714_ + aFloat9141 * (float) i_715_);
					float f_718_ = aFloat9121 + (aFloat9146 * (float) i_713_ + aFloat9138 * (float) i_714_ + aFloat9142 * (float) i_715_);
					fs[i_712_] = (class119.aFloat1448 + class119.aFloat1451 * f_717_ / f_716_);
					fs_655_[i_712_] = (class119.aFloat1444 + class119.aFloat1466 * f_718_ / f_716_);
					fs_656_[i_712_] = (class119.aFloat1452 + class119.aFloat1453 * f / f_716_);
					fs_657_[i_712_] = f_716_;
				}
				if (class111.aShortArray1405 != null) {
					for (int i_719_ = 0; i_719_ < class111.aShort1403; i_719_++) {
						short i_720_ = class111.aShortArray1399[i_719_];
						short i_721_ = class111.aShortArray1400[i_719_];
						short i_722_ = class111.aShortArray1401[i_719_];
						float f = fs[i_720_];
						float f_723_ = fs[i_721_];
						float f_724_ = fs[i_722_];
						float f_725_ = fs_655_[i_720_];
						float f_726_ = fs_655_[i_721_];
						float f_727_ = fs_655_[i_722_];
						if (((f - f_723_) * (f_727_ - f_726_) - (f_725_ - f_726_) * (f_724_ - f_723_)) > 0.0F) {
							class119.aBool1445 = (f < 0.0F || f_723_ < 0.0F || f_724_ < 0.0F || f > (float) class119.anInt1442 || f_723_ > (float) class119.anInt1442 || f_724_ > (float) class119.anInt1442);
							boolean bool = false;
							if (class111.aShortArray1405[i_719_] != -1) {
								Class163 class163 = (aClass180_Sub1_9126.aClass181_2059.method3544((class111.aShortArray1405[i_719_] & 0xffff), (byte) -38));
								bool = class163.aBool1761;
							}
							if (bool)
								class119.method2079(true, true, false, f_725_, f_726_, f_727_, f, f_723_, f_724_, fs_656_[i_720_], fs_656_[i_721_], fs_656_[i_722_], fs_657_[i_720_], fs_657_[i_721_], fs_657_[i_722_], ((float) class111.aShortArray1395[i_720_] / (float) (anInt1752 * 1048375491)), ((float) class111.aShortArray1395[i_721_] / (float) (anInt1752 * 1048375491)), ((float) class111.aShortArray1395[i_722_] / (float) (anInt1752 * 1048375491)),
										((float) class111.aShortArray1398[i_720_] / (float) (anInt1752 * 1048375491)), ((float) class111.aShortArray1398[i_721_] / (float) (anInt1752 * 1048375491)), ((float) class111.aShortArray1398[i_722_] / (float) (anInt1752 * 1048375491)), (~0xffffff | (Class656.anIntArray8393[(class111.aShortArray1393[i_720_] & 0xffff)]) & 0xffffff), (~0xffffff | (Class656.anIntArray8393[(class111.aShortArray1393[i_721_] & 0xffff)]) & 0xffffff),
										(~0xffffff | (Class656.anIntArray8393[(class111.aShortArray1393[i_722_] & 0xffff)]) & 0xffffff), 0, 0.0F, 0.0F, 0.0F, (class111.aShortArray1405[i_719_] & 0xffff));
							else {
								int i_728_ = class111.anIntArray1404[i_719_];
								if (i_728_ != -1)
									class119.method2073(true, true, false, f_725_, f_726_, f_727_, f, f_723_, f_724_, fs_656_[i_720_], fs_656_[i_721_], fs_656_[i_722_], (float) (Class395.method6504(i_728_, (class111.aShortArray1393[i_720_]), -501584282)), (float) (Class395.method6504(i_728_, (class111.aShortArray1393[i_721_]), -501584282)), (float) (Class395.method6504(i_728_, (class111.aShortArray1393[i_722_]), -501584282)));
							}
						}
					}
				} else {
					for (int i_729_ = 0; i_729_ < class111.aShort1403; i_729_++) {
						short i_730_ = class111.aShortArray1399[i_729_];
						short i_731_ = class111.aShortArray1400[i_729_];
						short i_732_ = class111.aShortArray1401[i_729_];
						float f = fs[i_730_];
						float f_733_ = fs[i_731_];
						float f_734_ = fs[i_732_];
						float f_735_ = fs_655_[i_730_];
						float f_736_ = fs_655_[i_731_];
						float f_737_ = fs_655_[i_732_];
						if (((f - f_733_) * (f_737_ - f_736_) - (f_735_ - f_736_) * (f_734_ - f_733_)) > 0.0F) {
							int i_738_ = class111.anIntArray1404[i_729_];
							if (i_738_ != -1) {
								class119.aBool1445 = (f < 0.0F || f_733_ < 0.0F || f_734_ < 0.0F || f > (float) class119.anInt1442 || f_733_ > (float) class119.anInt1442 || f_734_ > (float) class119.anInt1442);
								class119.method2073(true, true, false, f_735_, f_736_, f_737_, f, f_733_, f_734_, fs_656_[i_730_], fs_656_[i_731_], fs_656_[i_732_], (float) (Class395.method6504(i_738_, (class111.aShortArray1393[i_730_]), -501584282)), (float) (Class395.method6504(i_738_, (class111.aShortArray1393[i_731_]), -501584282)), (float) (Class395.method6504(i_738_, (class111.aShortArray1393[i_732_]), -501584282)));
							}
						}
					}
				}
			}
		}
	}

	void method14608(int i, int i_739_, Class119 class119, float[] fs, float[] fs_740_, float[] fs_741_, float[] fs_742_, float[] fs_743_, int i_744_) {
		Class139 class139 = aClass139ArrayArray9143[i][i_739_];
		if (class139 != null) {
			if ((class139.aByte1646 & 0x2) == 0) {
				if (i_744_ != 0) {
					if ((class139.aByte1646 & 0x4) != 0) {
						if ((i_744_ & 0x1) != 0)
							return;
					} else if ((i_744_ & 0x2) != 0)
						return;
				}
				int i_745_ = i * (anInt1752 * 1048375491);
				int i_746_ = i_745_ + anInt1752 * 1048375491;
				int i_747_ = i_739_ * (anInt1752 * 1048375491);
				int i_748_ = i_747_ + anInt1752 * 1048375491;
				float f;
				float f_749_;
				float f_750_;
				float f_751_;
				float f_752_;
				float f_753_;
				float f_754_;
				float f_755_;
				float f_756_;
				float f_757_;
				float f_758_;
				float f_759_;
				float f_760_;
				float f_761_;
				float f_762_;
				float f_763_;
				if ((class139.aByte1646 & 0x1) != 0) {
					int i_764_ = anIntArrayArray1754[i][i_739_];
					float f_765_ = aFloat9127 * (float) i_764_;
					float f_766_ = aFloat9123 * (float) i_764_;
					float f_767_ = aFloat9145 + (aFloat9135 * (float) i_745_ + f_765_ + aFloat9128 * (float) i_747_);
					f = aFloat9148 + (aFloat9136 * (float) i_745_ + f_766_ + aFloat9144 * (float) i_747_);
					if (f_767_ < -f)
						return;
					float f_768_ = aFloat9145 + (aFloat9135 * (float) i_746_ + f_765_ + aFloat9128 * (float) i_747_);
					f_749_ = aFloat9148 + (aFloat9136 * (float) i_746_ + f_766_ + aFloat9144 * (float) i_747_);
					if (f_768_ < -f_749_)
						return;
					float f_769_ = aFloat9145 + (aFloat9135 * (float) i_746_ + f_765_ + aFloat9128 * (float) i_748_);
					f_750_ = aFloat9148 + (aFloat9136 * (float) i_746_ + f_766_ + aFloat9144 * (float) i_748_);
					if (f_769_ < -f_750_)
						return;
					float f_770_ = aFloat9145 + (aFloat9135 * (float) i_745_ + f_765_ + aFloat9128 * (float) i_748_);
					f_751_ = aFloat9148 + (aFloat9136 * (float) i_745_ + f_766_ + aFloat9144 * (float) i_748_);
					if (f_770_ < -f_751_)
						return;
					float f_771_ = aFloat9137 * (float) i_764_;
					float f_772_ = aFloat9138 * (float) i_764_;
					float f_773_ = aFloat9122 + (aFloat9133 * (float) i_745_ + f_771_ + aFloat9141 * (float) i_747_);
					f_752_ = (class119.aFloat1448 + class119.aFloat1451 * f_773_ / f);
					float f_774_ = aFloat9121 + (aFloat9146 * (float) i_745_ + f_772_ + aFloat9142 * (float) i_747_);
					f_753_ = (class119.aFloat1444 + class119.aFloat1466 * f_774_ / f);
					f_754_ = (class119.aFloat1452 + class119.aFloat1453 * f_767_ / f);
					float f_775_ = aFloat9122 + (aFloat9133 * (float) i_746_ + f_771_ + aFloat9141 * (float) i_747_);
					f_755_ = (class119.aFloat1448 + class119.aFloat1451 * f_775_ / f_749_);
					float f_776_ = aFloat9121 + (aFloat9146 * (float) i_746_ + f_772_ + aFloat9142 * (float) i_747_);
					f_756_ = (class119.aFloat1444 + class119.aFloat1466 * f_776_ / f_749_);
					f_757_ = (class119.aFloat1452 + class119.aFloat1453 * f_768_ / f_749_);
					float f_777_ = aFloat9122 + (aFloat9133 * (float) i_746_ + f_771_ + aFloat9141 * (float) i_748_);
					f_758_ = (class119.aFloat1448 + class119.aFloat1451 * f_777_ / f_750_);
					float f_778_ = aFloat9121 + (aFloat9146 * (float) i_746_ + f_772_ + aFloat9142 * (float) i_748_);
					f_759_ = (class119.aFloat1444 + class119.aFloat1466 * f_778_ / f_750_);
					f_760_ = (class119.aFloat1452 + class119.aFloat1453 * f_769_ / f_750_);
					float f_779_ = aFloat9122 + (aFloat9133 * (float) i_745_ + f_771_ + aFloat9141 * (float) i_748_);
					f_761_ = (class119.aFloat1448 + class119.aFloat1451 * f_779_ / f_751_);
					float f_780_ = aFloat9121 + (aFloat9146 * (float) i_745_ + f_772_ + aFloat9142 * (float) i_748_);
					f_762_ = (class119.aFloat1444 + class119.aFloat1466 * f_780_ / f_751_);
					f_763_ = (class119.aFloat1452 + class119.aFloat1453 * f_770_ / f_751_);
				} else {
					int i_781_ = anIntArrayArray1754[i][i_739_];
					int i_782_ = anIntArrayArray1754[i + 1][i_739_];
					int i_783_ = anIntArrayArray1754[i + 1][i_739_ + 1];
					int i_784_ = anIntArrayArray1754[i][i_739_ + 1];
					float f_785_ = aFloat9145 + (aFloat9135 * (float) i_745_ + aFloat9127 * (float) i_781_ + aFloat9128 * (float) i_747_);
					f = aFloat9148 + (aFloat9136 * (float) i_745_ + aFloat9123 * (float) i_781_ + aFloat9144 * (float) i_747_);
					if (f_785_ < -f)
						return;
					float f_786_ = aFloat9145 + (aFloat9135 * (float) i_746_ + aFloat9127 * (float) i_782_ + aFloat9128 * (float) i_747_);
					f_749_ = aFloat9148 + (aFloat9136 * (float) i_746_ + aFloat9123 * (float) i_782_ + aFloat9144 * (float) i_747_);
					if (f_786_ < -f_749_)
						return;
					float f_787_ = aFloat9145 + (aFloat9135 * (float) i_746_ + aFloat9127 * (float) i_783_ + aFloat9128 * (float) i_748_);
					f_750_ = aFloat9148 + (aFloat9136 * (float) i_746_ + aFloat9123 * (float) i_783_ + aFloat9144 * (float) i_748_);
					if (f_787_ < -f_750_)
						return;
					float f_788_ = aFloat9145 + (aFloat9135 * (float) i_745_ + aFloat9127 * (float) i_784_ + aFloat9128 * (float) i_748_);
					f_751_ = aFloat9148 + (aFloat9136 * (float) i_745_ + aFloat9123 * (float) i_784_ + aFloat9144 * (float) i_748_);
					if (f_788_ < -f_751_)
						return;
					float f_789_ = aFloat9122 + (aFloat9133 * (float) i_745_ + aFloat9137 * (float) i_781_ + aFloat9141 * (float) i_747_);
					f_752_ = (class119.aFloat1448 + class119.aFloat1451 * f_789_ / f);
					float f_790_ = aFloat9121 + (aFloat9146 * (float) i_745_ + aFloat9138 * (float) i_781_ + aFloat9142 * (float) i_747_);
					f_753_ = (class119.aFloat1444 + class119.aFloat1466 * f_790_ / f);
					f_754_ = (class119.aFloat1452 + class119.aFloat1453 * f_785_ / f);
					float f_791_ = aFloat9122 + (aFloat9133 * (float) i_746_ + aFloat9137 * (float) i_782_ + aFloat9141 * (float) i_747_);
					f_755_ = (class119.aFloat1448 + class119.aFloat1451 * f_791_ / f_749_);
					float f_792_ = aFloat9121 + (aFloat9146 * (float) i_746_ + aFloat9138 * (float) i_782_ + aFloat9142 * (float) i_747_);
					f_756_ = (class119.aFloat1444 + class119.aFloat1466 * f_792_ / f_749_);
					f_757_ = (class119.aFloat1452 + class119.aFloat1453 * f_786_ / f_749_);
					float f_793_ = aFloat9122 + (aFloat9133 * (float) i_746_ + aFloat9137 * (float) i_783_ + aFloat9141 * (float) i_748_);
					f_758_ = (class119.aFloat1448 + class119.aFloat1451 * f_793_ / f_750_);
					float f_794_ = aFloat9121 + (aFloat9146 * (float) i_746_ + aFloat9138 * (float) i_783_ + aFloat9142 * (float) i_748_);
					f_759_ = (class119.aFloat1444 + class119.aFloat1466 * f_794_ / f_750_);
					f_760_ = (class119.aFloat1452 + class119.aFloat1453 * f_787_ / f_750_);
					float f_795_ = aFloat9122 + (aFloat9133 * (float) i_745_ + aFloat9137 * (float) i_784_ + aFloat9141 * (float) i_748_);
					f_761_ = (class119.aFloat1448 + class119.aFloat1451 * f_795_ / f_751_);
					float f_796_ = aFloat9121 + (aFloat9146 * (float) i_745_ + aFloat9138 * (float) i_784_ + aFloat9142 * (float) i_748_);
					f_762_ = (class119.aFloat1444 + class119.aFloat1466 * f_796_ / f_751_);
					f_763_ = (class119.aFloat1452 + class119.aFloat1453 * f_788_ / f_751_);
				}
				boolean bool = false;
				if (class139.aShort1644 != -1) {
					Class163 class163 = (aClass180_Sub1_9126.aClass181_2059.method3544(class139.aShort1644 & 0xffff, (byte) -92));
					bool = class163.aBool1761;
				}
				if (((f_758_ - f_761_) * (f_756_ - f_762_) - (f_759_ - f_762_) * (f_755_ - f_761_)) > 0.0F) {
					class119.aBool1445 = (f_758_ < 0.0F || f_761_ < 0.0F || f_755_ < 0.0F || f_758_ > (float) class119.anInt1442 || f_761_ > (float) class119.anInt1442 || f_755_ > (float) class119.anInt1442);
					if (bool)
						class119.method2079(true, true, false, f_759_, f_762_, f_756_, f_758_, f_761_, f_755_, f_760_, f_763_, f_757_, f_750_, f_751_, f_749_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, ~0xffffff | ((Class656.anIntArray8393[class139.aShort1642 & 0xffff]) & 0xffffff), ~0xffffff | ((Class656.anIntArray8393[class139.aShort1643 & 0xffff]) & 0xffffff), ~0xffffff | ((Class656.anIntArray8393[class139.aShort1640 & 0xffff]) & 0xffffff), 0, 0.0F, 0.0F, 0.0F, class139.aShort1644 & 0xffff);
					else
						class119.method2073(true, true, false, f_759_, f_762_, f_756_, f_758_, f_761_, f_755_, f_760_, f_763_, f_757_, (float) (class139.aShort1642 & 0xffff), (float) (class139.aShort1643 & 0xffff), (float) (class139.aShort1640 & 0xffff));
				}
				if (((f_752_ - f_755_) * (f_762_ - f_756_) - (f_753_ - f_756_) * (f_761_ - f_755_)) > 0.0F) {
					class119.aBool1445 = (f_752_ < 0.0F || f_755_ < 0.0F || f_761_ < 0.0F || f_752_ > (float) class119.anInt1442 || f_755_ > (float) class119.anInt1442 || f_761_ > (float) class119.anInt1442);
					if (bool)
						class119.method2079(true, true, false, f_753_, f_756_, f_762_, f_752_, f_755_, f_761_, f_754_, f_757_, f_763_, f, f_749_, f_751_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, ~0xffffff | ((Class656.anIntArray8393[class139.aShort1641 & 0xffff]) & 0xffffff), ~0xffffff | ((Class656.anIntArray8393[class139.aShort1640 & 0xffff]) & 0xffffff), ~0xffffff | ((Class656.anIntArray8393[class139.aShort1643 & 0xffff]) & 0xffffff), 0, 0.0F, 0.0F, 0.0F, class139.aShort1644 & 0xffff);
					else
						class119.method2073(true, true, false, f_753_, f_756_, f_762_, f_752_, f_755_, f_761_, f_754_, f_757_, f_763_, (float) (class139.aShort1641 & 0xffff), (float) (class139.aShort1640 & 0xffff), (float) (class139.aShort1643 & 0xffff));
				}
			}
		} else {
			Class111 class111 = aClass111ArrayArray9140[i][i_739_];
			if (class111 != null) {
				if (i_744_ != 0) {
					if ((class111.aByte1394 & 0x4) != 0) {
						if ((i_744_ & 0x1) != 0)
							return;
					} else if ((i_744_ & 0x2) != 0)
						return;
				}
				for (int i_797_ = 0; i_797_ < class111.aShort1402; i_797_++) {
					int i_798_ = (class111.aShortArray1395[i_797_] + (i << anInt1753 * 1252000143));
					short i_799_ = class111.aShortArray1396[i_797_];
					int i_800_ = (class111.aShortArray1398[i_797_] + (i_739_ << anInt1753 * 1252000143));
					float f = aFloat9145 + (aFloat9135 * (float) i_798_ + aFloat9127 * (float) i_799_ + aFloat9128 * (float) i_800_);
					float f_801_ = aFloat9148 + (aFloat9136 * (float) i_798_ + aFloat9123 * (float) i_799_ + aFloat9144 * (float) i_800_);
					if (f < -f_801_)
						return;
					float f_802_ = aFloat9122 + (aFloat9133 * (float) i_798_ + aFloat9137 * (float) i_799_ + aFloat9141 * (float) i_800_);
					float f_803_ = aFloat9121 + (aFloat9146 * (float) i_798_ + aFloat9138 * (float) i_799_ + aFloat9142 * (float) i_800_);
					fs[i_797_] = (class119.aFloat1448 + class119.aFloat1451 * f_802_ / f_801_);
					fs_740_[i_797_] = (class119.aFloat1444 + class119.aFloat1466 * f_803_ / f_801_);
					fs_741_[i_797_] = (class119.aFloat1452 + class119.aFloat1453 * f / f_801_);
					fs_742_[i_797_] = f_801_;
				}
				if (class111.aShortArray1405 != null) {
					for (int i_804_ = 0; i_804_ < class111.aShort1403; i_804_++) {
						short i_805_ = class111.aShortArray1399[i_804_];
						short i_806_ = class111.aShortArray1400[i_804_];
						short i_807_ = class111.aShortArray1401[i_804_];
						float f = fs[i_805_];
						float f_808_ = fs[i_806_];
						float f_809_ = fs[i_807_];
						float f_810_ = fs_740_[i_805_];
						float f_811_ = fs_740_[i_806_];
						float f_812_ = fs_740_[i_807_];
						if (((f - f_808_) * (f_812_ - f_811_) - (f_810_ - f_811_) * (f_809_ - f_808_)) > 0.0F) {
							class119.aBool1445 = (f < 0.0F || f_808_ < 0.0F || f_809_ < 0.0F || f > (float) class119.anInt1442 || f_808_ > (float) class119.anInt1442 || f_809_ > (float) class119.anInt1442);
							boolean bool = false;
							if (class111.aShortArray1405[i_804_] != -1) {
								Class163 class163 = (aClass180_Sub1_9126.aClass181_2059.method3544((class111.aShortArray1405[i_804_] & 0xffff), (byte) -90));
								bool = class163.aBool1761;
							}
							if (bool)
								class119.method2079(true, true, false, f_810_, f_811_, f_812_, f, f_808_, f_809_, fs_741_[i_805_], fs_741_[i_806_], fs_741_[i_807_], fs_742_[i_805_], fs_742_[i_806_], fs_742_[i_807_], ((float) class111.aShortArray1395[i_805_] / (float) (anInt1752 * 1048375491)), ((float) class111.aShortArray1395[i_806_] / (float) (anInt1752 * 1048375491)), ((float) class111.aShortArray1395[i_807_] / (float) (anInt1752 * 1048375491)),
										((float) class111.aShortArray1398[i_805_] / (float) (anInt1752 * 1048375491)), ((float) class111.aShortArray1398[i_806_] / (float) (anInt1752 * 1048375491)), ((float) class111.aShortArray1398[i_807_] / (float) (anInt1752 * 1048375491)), (~0xffffff | (Class656.anIntArray8393[(class111.aShortArray1393[i_805_] & 0xffff)]) & 0xffffff), (~0xffffff | (Class656.anIntArray8393[(class111.aShortArray1393[i_806_] & 0xffff)]) & 0xffffff),
										(~0xffffff | (Class656.anIntArray8393[(class111.aShortArray1393[i_807_] & 0xffff)]) & 0xffffff), 0, 0.0F, 0.0F, 0.0F, (class111.aShortArray1405[i_804_] & 0xffff));
							else {
								int i_813_ = class111.anIntArray1404[i_804_];
								if (i_813_ != -1)
									class119.method2073(true, true, false, f_810_, f_811_, f_812_, f, f_808_, f_809_, fs_741_[i_805_], fs_741_[i_806_], fs_741_[i_807_], (float) (Class395.method6504(i_813_, (class111.aShortArray1393[i_805_]), -501584282)), (float) (Class395.method6504(i_813_, (class111.aShortArray1393[i_806_]), -501584282)), (float) (Class395.method6504(i_813_, (class111.aShortArray1393[i_807_]), -501584282)));
							}
						}
					}
				} else {
					for (int i_814_ = 0; i_814_ < class111.aShort1403; i_814_++) {
						short i_815_ = class111.aShortArray1399[i_814_];
						short i_816_ = class111.aShortArray1400[i_814_];
						short i_817_ = class111.aShortArray1401[i_814_];
						float f = fs[i_815_];
						float f_818_ = fs[i_816_];
						float f_819_ = fs[i_817_];
						float f_820_ = fs_740_[i_815_];
						float f_821_ = fs_740_[i_816_];
						float f_822_ = fs_740_[i_817_];
						if (((f - f_818_) * (f_822_ - f_821_) - (f_820_ - f_821_) * (f_819_ - f_818_)) > 0.0F) {
							int i_823_ = class111.anIntArray1404[i_814_];
							if (i_823_ != -1) {
								class119.aBool1445 = (f < 0.0F || f_818_ < 0.0F || f_819_ < 0.0F || f > (float) class119.anInt1442 || f_818_ > (float) class119.anInt1442 || f_819_ > (float) class119.anInt1442);
								class119.method2073(true, true, false, f_820_, f_821_, f_822_, f, f_818_, f_819_, fs_741_[i_815_], fs_741_[i_816_], fs_741_[i_817_], (float) (Class395.method6504(i_823_, (class111.aShortArray1393[i_815_]), -501584282)), (float) (Class395.method6504(i_823_, (class111.aShortArray1393[i_816_]), -501584282)), (float) (Class395.method6504(i_823_, (class111.aShortArray1393[i_817_]), -501584282)));
							}
						}
					}
				}
			}
		}
	}

	void method14609(int i, int i_824_, boolean bool, Class101 class101, Class119 class119, float[] fs, float[] fs_825_, float[] fs_826_, float[] fs_827_, float[] fs_828_, int i_829_) {
		Class96 class96 = aClass96ArrayArray9130[i][i_824_];
		if (class96 != null) {
			if ((class96.aByte1149 & 0x2) == 0) {
				if (i_829_ != 0) {
					if ((class96.aByte1149 & 0x4) != 0) {
						if ((i_829_ & 0x1) != 0)
							return;
					} else if ((i_829_ & 0x2) != 0)
						return;
				}
				int i_830_ = i * (anInt1752 * 1048375491);
				int i_831_ = i_830_ + anInt1752 * 1048375491;
				int i_832_ = i_824_ * (anInt1752 * 1048375491);
				int i_833_ = i_832_ + anInt1752 * 1048375491;
				float f = 0.0F;
				float f_834_ = 0.0F;
				float f_835_ = 0.0F;
				float f_836_ = 0.0F;
				float f_837_;
				float f_838_;
				float f_839_;
				float f_840_;
				float f_841_;
				float f_842_;
				float f_843_;
				float f_844_;
				float f_845_;
				float f_846_;
				float f_847_;
				float f_848_;
				float f_849_;
				float f_850_;
				float f_851_;
				float f_852_;
				if ((class96.aByte1149 & 0x1) != 0 && !bool) {
					int i_853_ = anIntArrayArray1754[i][i_824_];
					float f_854_ = aFloat9127 * (float) i_853_;
					float f_855_ = aFloat9123 * (float) i_853_;
					float f_856_ = aFloat9145 + (aFloat9135 * (float) i_830_ + f_854_ + aFloat9128 * (float) i_832_);
					f_837_ = aFloat9148 + (aFloat9136 * (float) i_830_ + f_855_ + aFloat9144 * (float) i_832_);
					if (f_856_ < -f_837_)
						return;
					float f_857_ = aFloat9145 + (aFloat9135 * (float) i_831_ + f_854_ + aFloat9128 * (float) i_832_);
					f_838_ = aFloat9148 + (aFloat9136 * (float) i_831_ + f_855_ + aFloat9144 * (float) i_832_);
					if (f_857_ < -f_838_)
						return;
					float f_858_ = aFloat9145 + (aFloat9135 * (float) i_831_ + f_854_ + aFloat9128 * (float) i_833_);
					f_839_ = aFloat9148 + (aFloat9136 * (float) i_831_ + f_855_ + aFloat9144 * (float) i_833_);
					if (f_858_ < -f_839_)
						return;
					float f_859_ = aFloat9145 + (aFloat9135 * (float) i_830_ + f_854_ + aFloat9128 * (float) i_833_);
					f_840_ = aFloat9148 + (aFloat9136 * (float) i_830_ + f_855_ + aFloat9144 * (float) i_833_);
					if (f_859_ < -f_840_)
						return;
					f_841_ = (class119.aFloat1452 + class119.aFloat1453 * f_856_ / f_837_);
					f_842_ = (class119.aFloat1452 + class119.aFloat1453 * f_857_ / f_838_);
					f_843_ = (class119.aFloat1452 + class119.aFloat1453 * f_858_ / f_839_);
					f_844_ = (class119.aFloat1452 + class119.aFloat1453 * f_859_ / f_840_);
					if (class101.aBool1191) {
						float f_860_ = f_856_ - class101.aFloat1192;
						if (f_860_ > 0.0F) {
							f = f_860_ / class101.aFloat1193;
							if (f > 1.0F)
								f = 1.0F;
						}
						f_860_ = f_857_ - class101.aFloat1192;
						if (f_860_ > 0.0F) {
							f_834_ = f_860_ / class101.aFloat1193;
							if (f_834_ > 1.0F)
								f_834_ = 1.0F;
						}
						f_860_ = f_858_ - class101.aFloat1192;
						if (f_860_ > 0.0F) {
							f_835_ = f_860_ / class101.aFloat1193;
							if (f_835_ > 1.0F)
								f_835_ = 1.0F;
						}
						f_860_ = f_859_ - class101.aFloat1192;
						if (f_860_ > 0.0F) {
							f_836_ = f_860_ / class101.aFloat1193;
							if (f_836_ > 1.0F)
								f_836_ = 1.0F;
						}
					}
					float f_861_ = aFloat9137 * (float) i_853_;
					float f_862_ = aFloat9138 * (float) i_853_;
					float f_863_ = aFloat9122 + (aFloat9133 * (float) i_830_ + f_861_ + aFloat9141 * (float) i_832_);
					f_845_ = (class119.aFloat1448 + class119.aFloat1451 * f_863_ / f_837_);
					float f_864_ = aFloat9121 + (aFloat9146 * (float) i_830_ + f_862_ + aFloat9142 * (float) i_832_);
					f_846_ = (class119.aFloat1444 + class119.aFloat1466 * f_864_ / f_837_);
					float f_865_ = aFloat9122 + (aFloat9133 * (float) i_831_ + f_861_ + aFloat9141 * (float) i_832_);
					f_847_ = (class119.aFloat1448 + class119.aFloat1451 * f_865_ / f_838_);
					float f_866_ = aFloat9121 + (aFloat9146 * (float) i_831_ + f_862_ + aFloat9142 * (float) i_832_);
					f_848_ = (class119.aFloat1444 + class119.aFloat1466 * f_866_ / f_838_);
					float f_867_ = aFloat9122 + (aFloat9133 * (float) i_831_ + f_861_ + aFloat9141 * (float) i_833_);
					f_849_ = (class119.aFloat1448 + class119.aFloat1451 * f_867_ / f_839_);
					float f_868_ = aFloat9121 + (aFloat9146 * (float) i_831_ + f_862_ + aFloat9142 * (float) i_833_);
					f_850_ = (class119.aFloat1444 + class119.aFloat1466 * f_868_ / f_839_);
					float f_869_ = aFloat9122 + (aFloat9133 * (float) i_830_ + f_861_ + aFloat9141 * (float) i_833_);
					f_851_ = (class119.aFloat1448 + class119.aFloat1451 * f_869_ / f_840_);
					float f_870_ = aFloat9121 + (aFloat9146 * (float) i_830_ + f_862_ + aFloat9142 * (float) i_833_);
					f_852_ = (class119.aFloat1444 + class119.aFloat1466 * f_870_ / f_840_);
				} else {
					int i_871_ = anIntArrayArray1754[i][i_824_];
					int i_872_ = anIntArrayArray1754[i + 1][i_824_];
					int i_873_ = anIntArrayArray1754[i + 1][i_824_ + 1];
					int i_874_ = anIntArrayArray1754[i][i_824_ + 1];
					float f_875_ = aFloat9145 + (aFloat9135 * (float) i_830_ + aFloat9127 * (float) i_871_ + aFloat9128 * (float) i_832_);
					f_837_ = aFloat9148 + (aFloat9136 * (float) i_830_ + aFloat9123 * (float) i_871_ + aFloat9144 * (float) i_832_);
					if (f_875_ < -f_837_)
						return;
					float f_876_ = aFloat9145 + (aFloat9135 * (float) i_831_ + aFloat9127 * (float) i_872_ + aFloat9128 * (float) i_832_);
					f_838_ = aFloat9148 + (aFloat9136 * (float) i_831_ + aFloat9123 * (float) i_872_ + aFloat9144 * (float) i_832_);
					if (f_876_ < -f_838_)
						return;
					float f_877_ = aFloat9145 + (aFloat9135 * (float) i_831_ + aFloat9127 * (float) i_873_ + aFloat9128 * (float) i_833_);
					f_839_ = aFloat9148 + (aFloat9136 * (float) i_831_ + aFloat9123 * (float) i_873_ + aFloat9144 * (float) i_833_);
					if (f_877_ < -f_839_)
						return;
					float f_878_ = aFloat9145 + (aFloat9135 * (float) i_830_ + aFloat9127 * (float) i_874_ + aFloat9128 * (float) i_833_);
					f_840_ = aFloat9148 + (aFloat9136 * (float) i_830_ + aFloat9123 * (float) i_874_ + aFloat9144 * (float) i_833_);
					if (f_878_ < -f_840_)
						return;
					f_841_ = (class119.aFloat1452 + class119.aFloat1453 * f_875_ / f_837_);
					f_842_ = (class119.aFloat1452 + class119.aFloat1453 * f_876_ / f_838_);
					f_843_ = (class119.aFloat1452 + class119.aFloat1453 * f_877_ / f_839_);
					f_844_ = (class119.aFloat1452 + class119.aFloat1453 * f_878_ / f_840_);
					if (bool) {
						float f_879_ = f_875_ - class101.aFloat1192;
						if (f_879_ > 0.0F) {
							f_879_ /= class101.aFloat1193;
							if (f_879_ > 1.0F)
								f_879_ = 1.0F;
							f = f_879_;
							int i_880_ = (int) ((float) class96.aShort1156 * f_879_);
							if (i_880_ > 0)
								i_871_ -= i_880_;
						}
						f_879_ = f_876_ - class101.aFloat1192;
						if (f_879_ > 0.0F) {
							f_879_ /= class101.aFloat1193;
							if (f_879_ > 1.0F)
								f_879_ = 1.0F;
							f_834_ = f_879_;
							int i_881_ = (int) ((float) class96.aShort1154 * f_879_);
							if (i_881_ > 0)
								i_872_ -= i_881_;
						}
						f_879_ = f_877_ - class101.aFloat1192;
						if (f_879_ > 0.0F) {
							f_879_ /= class101.aFloat1193;
							if (f_879_ > 1.0F)
								f_879_ = 1.0F;
							f_835_ = f_879_;
							int i_882_ = (int) ((float) class96.aShort1155 * f_879_);
							if (i_882_ > 0)
								i_873_ -= i_882_;
						}
						f_879_ = f_878_ - class101.aFloat1192;
						if (f_879_ > 0.0F) {
							f_879_ /= class101.aFloat1193;
							if (f_879_ > 1.0F)
								f_879_ = 1.0F;
							f_836_ = f_879_;
							int i_883_ = (int) ((float) class96.aShort1150 * f_879_);
							if (i_883_ > 0)
								i_874_ -= i_883_;
						}
					} else if (class101.aBool1191) {
						float f_884_ = f_875_ - class101.aFloat1192;
						if (f_884_ > 0.0F) {
							f = f_884_ / class101.aFloat1193;
							if (f > 1.0F)
								f = 1.0F;
						}
						f_884_ = f_876_ - class101.aFloat1192;
						if (f_884_ > 0.0F) {
							f_834_ = f_884_ / class101.aFloat1193;
							if (f_834_ > 1.0F)
								f_834_ = 1.0F;
						}
						f_884_ = f_877_ - class101.aFloat1192;
						if (f_884_ > 0.0F) {
							f_835_ = f_884_ / class101.aFloat1193;
							if (f_835_ > 1.0F)
								f_835_ = 1.0F;
						}
						f_884_ = f_878_ - class101.aFloat1192;
						if (f_884_ > 0.0F) {
							f_836_ = f_884_ / class101.aFloat1193;
							if (f_836_ > 1.0F)
								f_836_ = 1.0F;
						}
					}
					float f_885_ = aFloat9122 + (aFloat9133 * (float) i_830_ + aFloat9137 * (float) i_871_ + aFloat9141 * (float) i_832_);
					f_845_ = (class119.aFloat1448 + class119.aFloat1451 * f_885_ / f_837_);
					float f_886_ = aFloat9121 + (aFloat9146 * (float) i_830_ + aFloat9138 * (float) i_871_ + aFloat9142 * (float) i_832_);
					f_846_ = (class119.aFloat1444 + class119.aFloat1466 * f_886_ / f_837_);
					float f_887_ = aFloat9122 + (aFloat9133 * (float) i_831_ + aFloat9137 * (float) i_872_ + aFloat9141 * (float) i_832_);
					f_847_ = (class119.aFloat1448 + class119.aFloat1451 * f_887_ / f_838_);
					float f_888_ = aFloat9121 + (aFloat9146 * (float) i_831_ + aFloat9138 * (float) i_872_ + aFloat9142 * (float) i_832_);
					f_848_ = (class119.aFloat1444 + class119.aFloat1466 * f_888_ / f_838_);
					float f_889_ = aFloat9122 + (aFloat9133 * (float) i_831_ + aFloat9137 * (float) i_873_ + aFloat9141 * (float) i_833_);
					f_849_ = (class119.aFloat1448 + class119.aFloat1451 * f_889_ / f_839_);
					float f_890_ = aFloat9121 + (aFloat9146 * (float) i_831_ + aFloat9138 * (float) i_873_ + aFloat9142 * (float) i_833_);
					f_850_ = (class119.aFloat1444 + class119.aFloat1466 * f_890_ / f_839_);
					float f_891_ = aFloat9122 + (aFloat9133 * (float) i_830_ + aFloat9137 * (float) i_874_ + aFloat9141 * (float) i_833_);
					f_851_ = (class119.aFloat1448 + class119.aFloat1451 * f_891_ / f_840_);
					float f_892_ = aFloat9121 + (aFloat9146 * (float) i_830_ + aFloat9138 * (float) i_874_ + aFloat9142 * (float) i_833_);
					f_852_ = (class119.aFloat1444 + class119.aFloat1466 * f_892_ / f_840_);
				}
				Class163 class163 = null;
				boolean bool_893_ = false;
				if (class96.aShort1148 != -1) {
					class163 = (aClass180_Sub1_9126.aClass181_2059.method3544(class96.aShort1148 & 0xffff, (byte) 2));
					bool_893_ = class163.aBool1761;
				}
				boolean bool_894_ = class163 != null && method14603(class163.aByte1801);
				float f_895_ = f_834_ + f_835_ + f_836_;
				if (((f_849_ - f_851_) * (f_848_ - f_852_) - (f_850_ - f_852_) * (f_847_ - f_851_)) > 0.0F) {
					class119.aBool1445 = (f_849_ < 0.0F || f_851_ < 0.0F || f_847_ < 0.0F || f_849_ > (float) class119.anInt1442 || f_851_ > (float) class119.anInt1442 || f_847_ > (float) class119.anInt1442);
					if (f_895_ < 3.0F) {
						if (f_895_ > 0.0F) {
							if (bool_893_) {
								int i_896_ = -16777216;
								if (bool_894_)
									i_896_ = -1694498816;
								class119.method2079(true, true, false, f_850_, f_852_, f_848_, f_849_, f_851_, f_847_, f_843_, f_844_, f_842_, f_839_, f_840_, f_838_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, i_896_ | class96.anInt1151 & 0xffffff, i_896_ | class96.anInt1153 & 0xffffff, i_896_ | class96.anInt1158 & 0xffffff, class101.anInt1194 * -1009384223, f_835_ * 255.0F, f_836_ * 255.0F, f_834_ * 255.0F, class96.aShort1148 & 0xffff);
							} else {
								if (bool_894_)
									class119.anInt1441 = 100;
								class119.method2106(true, true, false, f_850_, f_852_, f_848_, f_849_, f_851_, f_847_, f_843_, f_844_, f_842_, Class597.method9915(class96.anInt1151, (((int) (f_835_ * 255.0F) << 24) | (class101.anInt1194 * -1009384223)), (short) 4044), Class597.method9915(class96.anInt1153, (((int) (f_836_ * 255.0F) << 24) | (class101.anInt1194 * -1009384223)), (short) 24370),
										Class597.method9915(class96.anInt1158, (((int) (f_834_ * 255.0F) << 24) | (class101.anInt1194 * -1009384223)), (short) 9266));
								class119.anInt1441 = 0;
							}
						} else if (bool_893_) {
							int i_897_ = -16777216;
							if (bool_894_)
								i_897_ = -1694498816;
							class119.method2079(true, true, false, f_850_, f_852_, f_848_, f_849_, f_851_, f_847_, f_843_, f_844_, f_842_, f_839_, f_840_, f_838_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, i_897_ | class96.anInt1151 & 0xffffff, i_897_ | class96.anInt1153 & 0xffffff, i_897_ | class96.anInt1158 & 0xffffff, 0, 0.0F, 0.0F, 0.0F, class96.aShort1148 & 0xffff);
						} else {
							if (bool_894_)
								class119.anInt1441 = 100;
							class119.method2106(true, true, false, f_850_, f_852_, f_848_, f_849_, f_851_, f_847_, f_843_, f_844_, f_842_, class96.anInt1151, class96.anInt1153, class96.anInt1158);
							class119.anInt1441 = 0;
						}
					} else
						class119.method2077(true, true, false, f_850_, f_852_, f_848_, f_849_, f_851_, f_847_, f_843_, f_844_, f_842_, class101.anInt1194 * -1009384223);
				}
				f_895_ = f + f_834_ + f_836_;
				if (((f_845_ - f_847_) * (f_852_ - f_848_) - (f_846_ - f_848_) * (f_851_ - f_847_)) > 0.0F) {
					class119.aBool1445 = (f_845_ < 0.0F || f_847_ < 0.0F || f_851_ < 0.0F || f_845_ > (float) class119.anInt1442 || f_847_ > (float) class119.anInt1442 || f_851_ > (float) class119.anInt1442);
					if (f_895_ < 3.0F) {
						if (bool_894_)
							class119.anInt1441 = -1694498816;
						if (f_895_ > 0.0F) {
							if (bool_893_) {
								int i_898_ = -16777216;
								if (bool_894_)
									i_898_ = -1694498816;
								class119.method2079(true, true, false, f_846_, f_848_, f_852_, f_845_, f_847_, f_851_, f_841_, f_842_, f_844_, f_837_, f_838_, f_840_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, i_898_ | class96.anInt1152 & 0xffffff, i_898_ | class96.anInt1158 & 0xffffff, i_898_ | class96.anInt1153 & 0xffffff, class101.anInt1194 * -1009384223, f * 255.0F, f_834_ * 255.0F, f_836_ * 255.0F, class96.aShort1148 & 0xffff);
							} else {
								if (bool_894_)
									class119.anInt1441 = 100;
								class119.method2106(true, true, false, f_846_, f_848_, f_852_, f_845_, f_847_, f_851_, f_841_, f_842_, f_844_, Class597.method9915(class96.anInt1152, (((int) (f * 255.0F) << 24) | (class101.anInt1194 * -1009384223)), (short) 465), Class597.method9915(class96.anInt1158, (((int) (f_834_ * 255.0F) << 24) | (class101.anInt1194 * -1009384223)), (short) 4192),
										Class597.method9915(class96.anInt1153, (((int) (f_836_ * 255.0F) << 24) | (class101.anInt1194 * -1009384223)), (short) 12353));
								class119.anInt1441 = 0;
							}
						} else if (bool_893_) {
							int i_899_ = -16777216;
							if (bool_894_)
								i_899_ = -1694498816;
							class119.method2079(true, true, false, f_846_, f_848_, f_852_, f_845_, f_847_, f_851_, f_841_, f_842_, f_844_, f_837_, f_838_, f_840_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, i_899_ | class96.anInt1152 & 0xffffff, i_899_ | class96.anInt1158 & 0xffffff, i_899_ | class96.anInt1153 & 0xffffff, 0, 0.0F, 0.0F, 0.0F, class96.aShort1148 & 0xffff);
						} else {
							if (bool_894_)
								class119.anInt1441 = 100;
							class119.method2106(true, true, false, f_846_, f_848_, f_852_, f_845_, f_847_, f_851_, f_841_, f_842_, f_844_, class96.anInt1152, class96.anInt1158, class96.anInt1153);
							class119.anInt1441 = 0;
						}
					} else
						class119.method2077(true, true, false, f_846_, f_848_, f_852_, f_845_, f_847_, f_851_, f_841_, f_842_, f_844_, class101.anInt1194 * -1009384223);
				}
			}
		} else {
			Class94 class94 = aClass94ArrayArray9131[i][i_824_];
			if (class94 != null) {
				if (i_829_ != 0) {
					if ((class94.aByte1137 & 0x4) != 0) {
						if ((i_829_ & 0x1) != 0)
							return;
					} else if ((i_829_ & 0x2) != 0)
						return;
				}
				for (int i_900_ = 0; i_900_ < class94.aShort1136; i_900_++) {
					int i_901_ = (class94.aShortArray1135[i_900_] + (i << anInt1753 * 1252000143));
					int i_902_ = class94.aShortArray1139[i_900_];
					int i_903_ = (class94.aShortArray1140[i_900_] + (i_824_ << anInt1753 * 1252000143));
					float f = aFloat9145 + (aFloat9135 * (float) i_901_ + aFloat9127 * (float) i_902_ + aFloat9128 * (float) i_903_);
					float f_904_ = aFloat9148 + (aFloat9136 * (float) i_901_ + aFloat9123 * (float) i_902_ + aFloat9144 * (float) i_903_);
					if (f < -f_904_)
						return;
					float f_905_ = (class119.aFloat1452 + class119.aFloat1453 * f / f_904_);
					fs_828_[i_900_] = 0.0F;
					if (bool) {
						float f_906_ = f - class101.aFloat1192;
						if (f_906_ > 0.0F) {
							f_906_ /= class101.aFloat1193;
							if (f_906_ > 1.0F)
								f_906_ = 1.0F;
							fs_828_[i_900_] = f_906_;
							int i_907_ = (int) ((float) (class94.aShortArray1141[i_900_]) * f_906_);
							if (i_907_ > 0)
								i_902_ -= i_907_;
						}
					} else if (class101.aBool1191) {
						float f_908_ = f - class101.aFloat1192;
						if (f_908_ > 0.0F) {
							fs_828_[i_900_] = f_908_ / class101.aFloat1193;
							if (fs_828_[i_900_] > 1.0F)
								fs_828_[i_900_] = 1.0F;
						}
					}
					float f_909_ = aFloat9122 + (aFloat9133 * (float) i_901_ + aFloat9137 * (float) i_902_ + aFloat9141 * (float) i_903_);
					float f_910_ = aFloat9121 + (aFloat9146 * (float) i_901_ + aFloat9138 * (float) i_902_ + aFloat9142 * (float) i_903_);
					fs[i_900_] = (class119.aFloat1448 + class119.aFloat1451 * f_909_ / f_904_);
					fs_825_[i_900_] = (class119.aFloat1444 + class119.aFloat1466 * f_910_ / f_904_);
					fs_826_[i_900_] = f_905_;
					fs_827_[i_900_] = f_904_;
				}
				if (class94.aShortArray1143 != null) {
					for (int i_911_ = 0; i_911_ < class94.aShort1145; i_911_++) {
						int i_912_ = i_911_ * 3;
						int i_913_ = i_912_ + 1;
						int i_914_ = i_913_ + 1;
						float f = fs[i_912_];
						float f_915_ = fs[i_913_];
						float f_916_ = fs[i_914_];
						float f_917_ = fs_825_[i_912_];
						float f_918_ = fs_825_[i_913_];
						float f_919_ = fs_825_[i_914_];
						float f_920_ = (fs_828_[i_912_] + fs_828_[i_913_] + fs_828_[i_914_]);
						if (((f - f_915_) * (f_919_ - f_918_) - (f_917_ - f_918_) * (f_916_ - f_915_)) > 0.0F) {
							class119.aBool1445 = (f < 0.0F || f_915_ < 0.0F || f_916_ < 0.0F || f > (float) class119.anInt1442 || f_915_ > (float) class119.anInt1442 || f_916_ > (float) class119.anInt1442);
							Class163 class163 = null;
							boolean bool_921_ = false;
							if (class94.aShortArray1143[i_911_] != -1) {
								class163 = (aClass180_Sub1_9126.aClass181_2059.method3544((class94.aShortArray1143[i_911_] & 0xffff), (byte) -127));
								bool_921_ = class163.aBool1761;
							}
							if (f_920_ < 3.0F) {
								if (f_920_ > 0.0F) {
									if (bool_921_) {
										int i_922_ = -16777216;
										if (method14603(class163.aByte1801))
											i_922_ = -1694498816;
										class119.method2079(true, true, false, f_917_, f_918_, f_919_, f, f_915_, f_916_, fs_826_[i_912_], fs_826_[i_913_], fs_826_[i_914_], fs_827_[i_912_], fs_827_[i_913_], fs_827_[i_914_], ((float) (class94.aShortArray1135[i_912_]) / (float) (anInt1752 * 1048375491)), ((float) (class94.aShortArray1135[i_913_]) / (float) (anInt1752 * 1048375491)), ((float) (class94.aShortArray1135[i_914_]) / (float) (anInt1752 * 1048375491)),
												((float) (class94.aShortArray1140[i_912_]) / (float) (anInt1752 * 1048375491)), ((float) (class94.aShortArray1140[i_913_]) / (float) (anInt1752 * 1048375491)), ((float) (class94.aShortArray1140[i_914_]) / (float) (anInt1752 * 1048375491)), i_922_ | (class94.anIntArray1142[i_912_]) & 0xffffff, i_922_ | (class94.anIntArray1142[i_913_]) & 0xffffff, i_922_ | (class94.anIntArray1142[i_914_]) & 0xffffff, class101.anInt1194 * -1009384223,
												fs_828_[i_912_] * 255.0F, fs_828_[i_913_] * 255.0F, fs_828_[i_914_] * 255.0F, (class94.aShortArray1143[i_911_] & 0xffff));
									} else if ((class94.anIntArray1142[i_912_] & 0xffffff) != 0) {
										class119.method2106(true, true, false, f_917_, f_918_, f_919_, f, f_915_, f_916_, fs_826_[i_912_], fs_826_[i_913_], fs_826_[i_914_], (Class597.method9915(class94.anIntArray1142[i_912_], ((int) (fs_828_[i_912_] * 255.0F) << 24 | (class101.anInt1194 * -1009384223)), (short) -1454)), (Class597.method9915(class94.anIntArray1142[i_913_], ((int) (fs_828_[i_913_] * 255.0F) << 24 | (class101.anInt1194 * -1009384223)), (short) 4606)),
												(Class597.method9915(class94.anIntArray1142[i_914_], ((int) (fs_828_[i_914_] * 255.0F) << 24 | (class101.anInt1194 * -1009384223)), (short) -15059)));
										class119.anInt1441 = 0;
									}
								} else if (bool_921_) {
									int i_923_ = -16777216;
									if (method14603(class163.aByte1801))
										i_923_ = -1694498816;
									class119.method2079(true, true, false, f_917_, f_918_, f_919_, f, f_915_, f_916_, fs_826_[i_912_], fs_826_[i_913_], fs_826_[i_914_], fs_827_[i_912_], fs_827_[i_913_], fs_827_[i_914_], ((float) (class94.aShortArray1135[i_912_]) / (float) (anInt1752 * 1048375491)), ((float) (class94.aShortArray1135[i_913_]) / (float) (anInt1752 * 1048375491)), ((float) (class94.aShortArray1135[i_914_]) / (float) (anInt1752 * 1048375491)),
											((float) (class94.aShortArray1140[i_912_]) / (float) (anInt1752 * 1048375491)), ((float) (class94.aShortArray1140[i_913_]) / (float) (anInt1752 * 1048375491)), ((float) (class94.aShortArray1140[i_914_]) / (float) (anInt1752 * 1048375491)), i_923_ | (class94.anIntArray1142[i_912_]) & 0xffffff, i_923_ | (class94.anIntArray1142[i_913_]) & 0xffffff, i_923_ | (class94.anIntArray1142[i_914_]) & 0xffffff, 0, 0.0F, 0.0F, 0.0F,
											(class94.aShortArray1143[i_911_] & 0xffff));
								} else if ((class94.anIntArray1142[i_912_] & 0xffffff) != 0) {
									class119.method2106(true, true, false, f_917_, f_918_, f_919_, f, f_915_, f_916_, fs_826_[i_912_], fs_826_[i_913_], fs_826_[i_914_], class94.anIntArray1142[i_912_], class94.anIntArray1142[i_913_], class94.anIntArray1142[i_914_]);
									class119.anInt1441 = 0;
								}
							} else
								class119.method2077(true, true, false, f_917_, f_918_, f_919_, f, f_915_, f_916_, fs_826_[i_912_], fs_826_[i_913_], fs_826_[i_914_], (class101.anInt1194 * -1009384223));
						}
					}
				} else {
					for (int i_924_ = 0; i_924_ < class94.aShort1145; i_924_++) {
						int i_925_ = i_924_ * 3;
						int i_926_ = i_925_ + 1;
						int i_927_ = i_926_ + 1;
						float f = fs[i_925_];
						float f_928_ = fs[i_926_];
						float f_929_ = fs[i_927_];
						float f_930_ = fs_825_[i_925_];
						float f_931_ = fs_825_[i_926_];
						float f_932_ = fs_825_[i_927_];
						float f_933_ = (fs_828_[i_925_] + fs_828_[i_926_] + fs_828_[i_927_]);
						if (((f - f_928_) * (f_932_ - f_931_) - (f_930_ - f_931_) * (f_929_ - f_928_)) > 0.0F) {
							class119.aBool1445 = (f < 0.0F || f_928_ < 0.0F || f_929_ < 0.0F || f > (float) class119.anInt1442 || f_928_ > (float) class119.anInt1442 || f_929_ > (float) class119.anInt1442);
							if (f_933_ < 3.0F) {
								if (f_933_ > 0.0F) {
									if ((class94.anIntArray1142[i_925_] & 0xffffff) != 0)
										class119.method2106(true, true, false, f_930_, f_931_, f_932_, f, f_928_, f_929_, fs_826_[i_925_], fs_826_[i_926_], fs_826_[i_927_], (Class388.method6456(class94.anIntArray1142[i_925_], (class101.anInt1194 * -1009384223), fs_828_[i_925_] * 255.0F, (byte) -80)), (Class388.method6456(class94.anIntArray1142[i_926_], (class101.anInt1194 * -1009384223), fs_828_[i_926_] * 255.0F, (byte) 41)),
												(Class388.method6456(class94.anIntArray1142[i_927_], (class101.anInt1194 * -1009384223), fs_828_[i_927_] * 255.0F, (byte) -68)));
								} else if ((class94.anIntArray1142[i_925_] & 0xffffff) != 0)
									class119.method2106(true, true, false, f_930_, f_931_, f_932_, f, f_928_, f_929_, fs_826_[i_925_], fs_826_[i_926_], fs_826_[i_927_], class94.anIntArray1142[i_925_], class94.anIntArray1142[i_926_], class94.anIntArray1142[i_927_]);
							} else
								class119.method2077(true, true, false, f_930_, f_931_, f_932_, f, f_928_, f_929_, fs_826_[i_925_], fs_826_[i_926_], fs_826_[i_927_], (class101.anInt1194 * -1009384223));
						}
					}
				}
			}
		}
	}

	void method14610(int i, int i_934_, boolean bool, Class101 class101, Class119 class119, float[] fs, float[] fs_935_, float[] fs_936_, float[] fs_937_, float[] fs_938_, int i_939_) {
		Class126 class126 = aClass126ArrayArray9132[i][i_934_];
		if (i_939_ == 0 || (i_939_ & 0x2) == 0) {
			if (class126 != null) {
				for (int i_940_ = 0; i_940_ < class126.aShort1522; i_940_++) {
					int i_941_ = (class126.aShortArray1520[i_940_] + (i << anInt1753 * 1252000143));
					int i_942_ = class126.aShortArray1519[i_940_];
					int i_943_ = (class126.aShortArray1518[i_940_] + (i_934_ << anInt1753 * 1252000143));
					float f = aFloat9145 + (aFloat9135 * (float) i_941_ + aFloat9127 * (float) i_942_ + aFloat9128 * (float) i_943_);
					float f_944_ = aFloat9148 + (aFloat9136 * (float) i_941_ + aFloat9123 * (float) i_942_ + aFloat9144 * (float) i_943_);
					if (f < -f_944_)
						return;
					fs_938_[i_940_] = 0.0F;
					if (bool) {
						float f_945_ = f - class101.aFloat1192;
						if (f_945_ > 0.0F) {
							f_945_ /= class101.aFloat1193;
							if (f_945_ > 1.0F)
								f_945_ = 1.0F;
							fs_938_[i_940_] = f_945_;
							int i_946_ = (int) ((float) (class126.aShortArray1523[i_940_]) * f_945_);
							if (i_946_ > 0)
								i_942_ -= i_946_;
						}
					} else if (class101.aBool1191) {
						float f_947_ = f - class101.aFloat1192;
						if (f_947_ > 0.0F) {
							fs_938_[i_940_] = f_947_ / class101.aFloat1193;
							if (fs_938_[i_940_] > 1.0F)
								fs_938_[i_940_] = 1.0F;
						}
					}
					float f_948_ = aFloat9122 + (aFloat9133 * (float) i_941_ + aFloat9137 * (float) i_942_ + aFloat9141 * (float) i_943_);
					float f_949_ = aFloat9121 + (aFloat9146 * (float) i_941_ + aFloat9138 * (float) i_942_ + aFloat9142 * (float) i_943_);
					fs[i_940_] = (class119.aFloat1448 + class119.aFloat1451 * f_948_ / f_944_);
					fs_935_[i_940_] = (class119.aFloat1444 + class119.aFloat1466 * f_949_ / f_944_);
					fs_936_[i_940_] = (class119.aFloat1452 + class119.aFloat1453 * f / f_944_);
					fs_937_[i_940_] = f_944_;
				}
				float f = (float) (anInt1752 * 1048375491);
				for (int i_950_ = 0; i_950_ < class126.aShort1526; i_950_++) {
					int i_951_ = i_950_ * 3;
					int i_952_ = i_951_ + 1;
					int i_953_ = i_952_ + 1;
					float f_954_ = fs[i_951_];
					float f_955_ = fs[i_952_];
					float f_956_ = fs[i_953_];
					float f_957_ = fs_935_[i_951_];
					float f_958_ = fs_935_[i_952_];
					float f_959_ = fs_935_[i_953_];
					if (((f_954_ - f_955_) * (f_959_ - f_958_) - (f_957_ - f_958_) * (f_956_ - f_955_)) > 0.0F) {
						class119.aBool1445 = (f_954_ < 0.0F || f_955_ < 0.0F || f_956_ < 0.0F || f_954_ > (float) class119.anInt1442 || f_955_ > (float) class119.anInt1442 || f_956_ > (float) class119.anInt1442);
						if (fs_938_[i_951_] + fs_938_[i_952_] + fs_938_[i_953_] < 3.0F) {
							int i_960_ = i << anInt1753 * 1252000143;
							int i_961_ = i_934_ << anInt1753 * 1252000143;
							if ((class126.anIntArray1521[i_951_] & 0xffffff) != 0) {
								if (class126.aShortArray1524[i_951_] != -1 && class126.aShortArray1524[i_952_] != -1 && (class126.aShortArray1524[i_953_] != -1)) {
									if ((class126.aShortArray1524[i_951_] == class126.aShortArray1524[i_952_]) && (class126.aShortArray1524[i_951_] == (class126.aShortArray1524[i_953_])) && (class126.aShortArray1525[i_951_] == (class126.aShortArray1525[i_952_])) && (class126.aShortArray1525[i_951_] == (class126.aShortArray1525[i_953_])))
										class119.method2079(true, true, false, f_957_, f_958_, f_959_, f_954_, f_955_, f_956_, fs_936_[i_951_], fs_936_[i_952_], fs_936_[i_953_], fs_937_[i_951_], fs_937_[i_952_], fs_937_[i_953_], ((float) (i_960_ + (class126.aShortArray1520[i_951_])) / (float) (class126.aShortArray1525[i_951_])), ((float) (i_960_ + (class126.aShortArray1520[i_952_])) / (float) (class126.aShortArray1525[i_952_])),
												((float) (i_960_ + (class126.aShortArray1520[i_953_])) / (float) (class126.aShortArray1525[i_953_])), ((float) (i_961_ + (class126.aShortArray1518[i_951_])) / (float) (class126.aShortArray1525[i_951_])), ((float) (i_961_ + (class126.aShortArray1518[i_952_])) / (float) (class126.aShortArray1525[i_952_])), ((float) (i_961_ + (class126.aShortArray1518[i_953_])) / (float) (class126.aShortArray1525[i_953_])), class126.anIntArray1521[i_951_],
												class126.anIntArray1521[i_952_], class126.anIntArray1521[i_953_], class101.anInt1194 * -1009384223, fs_938_[i_951_] * 255.0F, fs_938_[i_952_] * 255.0F, fs_938_[i_953_] * 255.0F, (class126.aShortArray1524[i_951_] & 0xffff));
									else
										class119.method2114(true, true, false, f_957_, f_958_, f_959_, f_954_, f_955_, f_956_, fs_936_[i_951_], fs_936_[i_952_], fs_936_[i_953_], fs_937_[i_951_], fs_937_[i_952_], fs_937_[i_953_], (float) (i_960_ + (class126.aShortArray1520[i_951_])) / f, (float) (i_960_ + (class126.aShortArray1520[i_952_])) / f, (float) (i_960_ + (class126.aShortArray1520[i_953_])) / f, (float) (i_961_ + (class126.aShortArray1518[i_951_])) / f,
												(float) (i_961_ + (class126.aShortArray1518[i_952_])) / f, (float) (i_961_ + (class126.aShortArray1518[i_953_])) / f, class126.anIntArray1521[i_951_], class126.anIntArray1521[i_952_], class126.anIntArray1521[i_953_], class101.anInt1194 * -1009384223, fs_938_[i_951_] * 255.0F, fs_938_[i_952_] * 255.0F, fs_938_[i_953_] * 255.0F, (class126.aShortArray1524[i_951_] & 0xffff), f / (float) (class126.aShortArray1525[i_951_]),
												(class126.aShortArray1524[i_952_] & 0xffff), f / (float) (class126.aShortArray1525[i_952_]), (class126.aShortArray1524[i_953_] & 0xffff), f / (float) (class126.aShortArray1525[i_953_]));
								} else if ((fs_938_[i_951_] + fs_938_[i_952_] + fs_938_[i_953_]) > 0.0F)
									class119.method2106(true, true, false, f_957_, f_958_, f_959_, f_954_, f_955_, f_956_, fs_936_[i_951_], fs_936_[i_952_], fs_936_[i_953_], (Class388.method6456(class126.anIntArray1521[i_951_], class101.anInt1194 * -1009384223, fs_938_[i_951_] * 255.0F, (byte) -30)), (Class388.method6456(class126.anIntArray1521[i_952_], class101.anInt1194 * -1009384223, fs_938_[i_952_] * 255.0F, (byte) 85)),
											(Class388.method6456(class126.anIntArray1521[i_953_], class101.anInt1194 * -1009384223, fs_938_[i_953_] * 255.0F, (byte) 1)));
								else
									class119.method2106(true, true, false, f_957_, f_958_, f_959_, f_954_, f_955_, f_956_, fs_936_[i_951_], fs_936_[i_952_], fs_936_[i_953_], class126.anIntArray1521[i_951_], class126.anIntArray1521[i_952_], class126.anIntArray1521[i_953_]);
							}
						} else
							class119.method2077(true, true, false, f_957_, f_958_, f_959_, f_954_, f_955_, f_956_, fs_936_[i_951_], fs_936_[i_952_], fs_936_[i_953_], (class101.anInt1194 * -1009384223));
					}
				}
			}
		}
	}

	boolean method14611(int i) {
		if ((anInt9134 & 0x8) == 0)
			return false;
		if (i == 4)
			return true;
		if (i == 8)
			return true;
		if (i == 9)
			return true;
		return false;
	}

	public void method2607(int i, int i_962_, int i_963_, int i_964_, int i_965_, int i_966_, int i_967_, boolean[][] bools) {
		Class101 class101 = aClass180_Sub1_9126.method14835(Thread.currentThread());
		Class119 class119 = class101.aClass119_1197;
		class119.anInt1441 = 0;
		class119.aBool1445 = true;
		aClass180_Sub1_9126.method14829();
		if (aClass96ArrayArray9130 != null || aClass126ArrayArray9132 != null)
			method14616(i, i_962_, i_963_, i_964_, i_965_, i_966_, i_967_, bools, class101, class119, class101.aFloatArray1228, class101.aFloatArray1229);
		else if (aClass139ArrayArray9143 != null)
			method14600(i, i_962_, i_963_, i_964_, i_965_, i_966_, i_967_, bools, class101, class119, class101.aFloatArray1228, class101.aFloatArray1229);
	}

	public void method2608(int i, int i_968_, int i_969_, int i_970_, int i_971_, int i_972_, int i_973_, boolean[][] bools) {
		Class101 class101 = aClass180_Sub1_9126.method14835(Thread.currentThread());
		Class119 class119 = class101.aClass119_1197;
		class119.anInt1441 = 0;
		class119.aBool1445 = true;
		aClass180_Sub1_9126.method14829();
		if (aClass96ArrayArray9130 != null || aClass126ArrayArray9132 != null)
			method14616(i, i_968_, i_969_, i_970_, i_971_, i_972_, i_973_, bools, class101, class119, class101.aFloatArray1228, class101.aFloatArray1229);
		else if (aClass139ArrayArray9143 != null)
			method14600(i, i_968_, i_969_, i_970_, i_971_, i_972_, i_973_, bools, class101, class119, class101.aFloatArray1228, class101.aFloatArray1229);
	}

	public void method2623(Class527_Sub8_Sub8 class527_sub8_sub8, int i, int i_974_, int i_975_, int i_976_, boolean bool) {
		/* empty */
	}

	void method14612(int i, int i_977_, int i_978_, int i_979_, int i_980_, int i_981_, int i_982_, boolean[][] bools, Class101 class101, Class119 class119, float[] fs, float[] fs_983_) {
		int i_984_ = (i_982_ - i_980_) * i_978_ / 256;
		int i_985_ = i_978_ >> 8;
		boolean bool = class101.aBool1227;
		aClass180_Sub1_9126.method3182(false);
		class119.aBool1467 = false;
		class119.aBool1443 = false;
		int i_986_ = i;
		int i_987_ = i_977_ + i_984_;
		for (int i_988_ = i_979_; i_988_ < i_981_; i_988_++) {
			for (int i_989_ = i_980_; i_989_ < i_982_; i_989_++) {
				if (bools[i_988_ - i_979_][i_989_ - i_980_]) {
					if (aClass139ArrayArray9143[i_988_][i_989_] != null) {
						Class139 class139 = aClass139ArrayArray9143[i_988_][i_989_];
						if (class139.aShort1644 != -1 && (class139.aByte1646 & 0x2) == 0 && class139.anInt1645 == -1) {
							int i_990_ = aClass180_Sub1_9126.method14825((class139.aShort1644) & 0xffff);
							class119.method2073(true, true, false, (float) (i_987_ - i_985_), (float) (i_987_ - i_985_), (float) i_987_, (float) (i_986_ + i_985_), (float) i_986_, (float) (i_986_ + i_985_), 100.0F, 100.0F, 100.0F, (float) Class395.method6504(i_990_, ((class139.aShort1642) & 0xffff), -501584282), (float) Class395.method6504(i_990_, ((class139.aShort1643) & 0xffff), -501584282), (float) Class395.method6504(i_990_, ((class139.aShort1640) & 0xffff), -501584282));
							class119.method2073(true, true, false, (float) i_987_, (float) i_987_, (float) (i_987_ - i_985_), (float) i_986_, (float) (i_986_ + i_985_), (float) i_986_, 100.0F, 100.0F, 100.0F, (float) Class395.method6504(i_990_, ((class139.aShort1641) & 0xffff), -501584282), (float) Class395.method6504(i_990_, ((class139.aShort1640) & 0xffff), -501584282), (float) Class395.method6504(i_990_, ((class139.aShort1643) & 0xffff), -501584282));
						} else if (class139.anInt1645 == -1) {
							class119.method2073(true, true, false, (float) (i_987_ - i_985_), (float) (i_987_ - i_985_), (float) i_987_, (float) (i_986_ + i_985_), (float) i_986_, (float) (i_986_ + i_985_), 100.0F, 100.0F, 100.0F, (float) (class139.aShort1642 & 0xffff), (float) (class139.aShort1643 & 0xffff), (float) (class139.aShort1640 & 0xffff));
							class119.method2073(true, true, false, (float) i_987_, (float) i_987_, (float) (i_987_ - i_985_), (float) i_986_, (float) (i_986_ + i_985_), (float) i_986_, 100.0F, 100.0F, 100.0F, (float) (class139.aShort1641 & 0xffff), (float) (class139.aShort1640 & 0xffff), (float) (class139.aShort1643 & 0xffff));
						} else {
							int i_991_ = class139.anInt1645;
							class119.method2073(true, true, false, (float) (i_987_ - i_985_), (float) (i_987_ - i_985_), (float) i_987_, (float) (i_986_ + i_985_), (float) i_986_, (float) (i_986_ + i_985_), 100.0F, 100.0F, 100.0F, (float) i_991_, (float) i_991_, (float) i_991_);
							class119.method2073(true, true, false, (float) i_987_, (float) i_987_, (float) (i_987_ - i_985_), (float) i_986_, (float) (i_986_ + i_985_), (float) i_986_, 100.0F, 100.0F, 100.0F, (float) i_991_, (float) i_991_, (float) i_991_);
						}
					} else if (aClass111ArrayArray9140[i_988_][i_989_] != null) {
						Class111 class111 = aClass111ArrayArray9140[i_988_][i_989_];
						for (int i_992_ = 0; i_992_ < class111.aShort1402; i_992_++) {
							fs[i_992_] = (float) (i_986_ + (class111.aShortArray1395[i_992_] * i_985_ / (anInt1752 * 1048375491)));
							fs_983_[i_992_] = (float) (i_987_ - (class111.aShortArray1398[i_992_] * i_985_ / (anInt1752 * 1048375491)));
						}
						for (int i_993_ = 0; i_993_ < class111.aShort1403; i_993_++) {
							short i_994_ = class111.aShortArray1399[i_993_];
							short i_995_ = class111.aShortArray1400[i_993_];
							short i_996_ = class111.aShortArray1401[i_993_];
							float f = fs[i_994_];
							float f_997_ = fs[i_995_];
							float f_998_ = fs[i_996_];
							float f_999_ = fs_983_[i_994_];
							float f_1000_ = fs_983_[i_995_];
							float f_1001_ = fs_983_[i_996_];
							if (class111.anIntArray1397 != null && class111.anIntArray1397[i_993_] != -1) {
								int i_1002_ = class111.anIntArray1397[i_993_];
								class119.method2073(true, true, false, f_999_, f_1000_, f_1001_, f, f_997_, f_998_, 100.0F, 100.0F, 100.0F, (float) (Class395.method6504(i_1002_, (class111.aShortArray1393[i_994_]), -501584282)), (float) (Class395.method6504(i_1002_, (class111.aShortArray1393[i_995_]), -501584282)), (float) (Class395.method6504(i_1002_, (class111.aShortArray1393[i_996_]), -501584282)));
							} else if (class111.aShortArray1405 != null && (class111.aShortArray1405[i_993_] != -1)) {
								int i_1003_ = (aClass180_Sub1_9126.method14825(class111.aShortArray1405[i_993_] & 0xffff));
								class119.method2073(true, true, false, f_999_, f_1000_, f_1001_, f, f_997_, f_998_, 100.0F, 100.0F, 100.0F, (float) (Class395.method6504(i_1003_, (class111.aShortArray1393[i_994_]), -501584282)), (float) (Class395.method6504(i_1003_, (class111.aShortArray1393[i_995_]), -501584282)), (float) (Class395.method6504(i_1003_, (class111.aShortArray1393[i_996_]), -501584282)));
							} else {
								int i_1004_ = class111.anIntArray1404[i_993_];
								class119.method2073(true, true, false, f_999_, f_1000_, f_1001_, f, f_997_, f_998_, 100.0F, 100.0F, 100.0F, (float) (Class395.method6504(i_1004_, (class111.aShortArray1393[i_994_]), -501584282)), (float) (Class395.method6504(i_1004_, (class111.aShortArray1393[i_995_]), -501584282)), (float) (Class395.method6504(i_1004_, (class111.aShortArray1393[i_996_]), -501584282)));
							}
						}
					}
				}
				i_987_ -= i_985_;
			}
			i_987_ = i_977_ + i_984_;
			i_986_ += i_985_;
		}
		class119.aBool1467 = true;
		aClass180_Sub1_9126.method3182(bool);
	}

	void method14613(int i, int i_1005_, int i_1006_, int i_1007_, int i_1008_, int i_1009_, int i_1010_, boolean[][] bools, Class101 class101, Class119 class119, float[] fs, float[] fs_1011_) {
		int i_1012_ = (i_1010_ - i_1008_) * i_1006_ / 256;
		int i_1013_ = i_1006_ >> 8;
		boolean bool = class101.aBool1227;
		aClass180_Sub1_9126.method3182(false);
		class119.aBool1467 = false;
		class119.aBool1443 = false;
		int i_1014_ = i;
		int i_1015_ = i_1005_ + i_1012_;
		for (int i_1016_ = i_1007_; i_1016_ < i_1009_; i_1016_++) {
			for (int i_1017_ = i_1008_; i_1017_ < i_1010_; i_1017_++) {
				if (bools[i_1016_ - i_1007_][i_1017_ - i_1008_]) {
					if (aClass96ArrayArray9130 != null) {
						if (aClass96ArrayArray9130[i_1016_][i_1017_] != null) {
							Class96 class96 = aClass96ArrayArray9130[i_1016_][i_1017_];
							if (class96.aShort1148 != -1 && (class96.aByte1149 & 0x2) == 0 && class96.anInt1157 == 0) {
								int i_1018_ = (aClass180_Sub1_9126.method14825(class96.aShort1148 & 0xffff));
								class119.method2073(true, true, false, (float) (i_1015_ - i_1013_), (float) (i_1015_ - i_1013_), (float) i_1015_, (float) (i_1014_ + i_1013_), (float) i_1014_, (float) (i_1014_ + i_1013_), 100.0F, 100.0F, 100.0F, (float) Class395.method6504(i_1018_, (class96.anInt1151), -501584282), (float) Class395.method6504(i_1018_, (class96.anInt1153), -501584282), (float) Class395.method6504(i_1018_, (class96.anInt1158), -501584282));
								class119.method2073(true, true, false, (float) i_1015_, (float) i_1015_, (float) (i_1015_ - i_1013_), (float) i_1014_, (float) (i_1014_ + i_1013_), (float) i_1014_, 100.0F, 100.0F, 100.0F, (float) Class395.method6504(i_1018_, (class96.anInt1152), -501584282), (float) Class395.method6504(i_1018_, (class96.anInt1158), -501584282), (float) Class395.method6504(i_1018_, (class96.anInt1153), -501584282));
							} else if (class96.anInt1157 == 0) {
								class119.method2106(true, true, false, (float) (i_1015_ - i_1013_), (float) (i_1015_ - i_1013_), (float) i_1015_, (float) (i_1014_ + i_1013_), (float) i_1014_, (float) (i_1014_ + i_1013_), 100.0F, 100.0F, 100.0F, class96.anInt1151, class96.anInt1153, class96.anInt1158);
								class119.method2106(true, true, false, (float) i_1015_, (float) i_1015_, (float) (i_1015_ - i_1013_), (float) i_1014_, (float) (i_1014_ + i_1013_), (float) i_1014_, 100.0F, 100.0F, 100.0F, class96.anInt1152, class96.anInt1158, class96.anInt1153);
							} else {
								int i_1019_ = class96.anInt1157;
								class119.method2106(true, true, false, (float) (i_1015_ - i_1013_), (float) (i_1015_ - i_1013_), (float) i_1015_, (float) (i_1014_ + i_1013_), (float) i_1014_, (float) (i_1014_ + i_1013_), 100.0F, 100.0F, 100.0F, Class597.method9915(i_1019_, (class96.anInt1151 & ~0xffffff), (short) -15258), Class597.method9915(i_1019_, (class96.anInt1153 & ~0xffffff), (short) 2458), Class597.method9915(i_1019_, (class96.anInt1158 & ~0xffffff), (short) -162));
								class119.method2106(true, true, false, (float) i_1015_, (float) i_1015_, (float) (i_1015_ - i_1013_), (float) i_1014_, (float) (i_1014_ + i_1013_), (float) i_1014_, 100.0F, 100.0F, 100.0F, Class597.method9915(i_1019_, (class96.anInt1152 & ~0xffffff), (short) 6214), Class597.method9915(i_1019_, (class96.anInt1158 & ~0xffffff), (short) -19424), Class597.method9915(i_1019_, (class96.anInt1153 & ~0xffffff), (short) 5300));
							}
						} else if (aClass94ArrayArray9131[i_1016_][i_1017_] != null) {
							Class94 class94 = aClass94ArrayArray9131[i_1016_][i_1017_];
							for (int i_1020_ = 0; i_1020_ < class94.aShort1136; i_1020_++) {
								fs[i_1020_] = (float) (i_1014_ + ((class94.aShortArray1135[i_1020_]) * i_1013_ / (anInt1752 * 1048375491)));
								fs_1011_[i_1020_] = (float) (i_1015_ - ((class94.aShortArray1140[i_1020_]) * i_1013_ / (anInt1752 * 1048375491)));
							}
							for (int i_1021_ = 0; i_1021_ < class94.aShort1145; i_1021_++) {
								int i_1022_ = i_1021_ * 3;
								int i_1023_ = i_1022_ + 1;
								int i_1024_ = i_1023_ + 1;
								float f = fs[i_1022_];
								float f_1025_ = fs[i_1023_];
								float f_1026_ = fs[i_1024_];
								float f_1027_ = fs_1011_[i_1022_];
								float f_1028_ = fs_1011_[i_1023_];
								float f_1029_ = fs_1011_[i_1024_];
								if (class94.anIntArray1144 != null && class94.anIntArray1144[i_1021_] != 0 && (class94.aShortArray1143 == null || (class94.aShortArray1143 != null && (class94.aShortArray1143[i_1021_]) == -1))) {
									int i_1030_ = class94.anIntArray1144[i_1021_];
									class119.method2106(true, true, false, f_1027_, f_1028_, f_1029_, f, f_1025_, f_1026_, 100.0F, 100.0F, 100.0F, (Class597.method9915(i_1030_, (-16777216 - (class94.anIntArray1142[i_1022_] & ~0xffffff)), (short) -21850)), (Class597.method9915(i_1030_, (-16777216 - (class94.anIntArray1142[i_1023_] & ~0xffffff)), (short) 16718)), (Class597.method9915(i_1030_, (-16777216 - (class94.anIntArray1142[i_1024_] & ~0xffffff)), (short) 10297)));
								} else if (class94.aShortArray1143 != null && (class94.aShortArray1143[i_1021_] != -1)) {
									int i_1031_ = (aClass180_Sub1_9126.method14825(class94.aShortArray1143[i_1021_] & 0xffff));
									class119.method2073(true, true, false, f_1027_, f_1028_, f_1029_, f, f_1025_, f_1026_, 100.0F, 100.0F, 100.0F, (float) i_1031_, (float) i_1031_, (float) i_1031_);
								} else
									class119.method2106(true, true, false, f_1027_, f_1028_, f_1029_, f, f_1025_, f_1026_, 100.0F, 100.0F, 100.0F, class94.anIntArray1142[i_1022_], class94.anIntArray1142[i_1023_], class94.anIntArray1142[i_1024_]);
							}
						}
					} else if (aClass126ArrayArray9132[i_1016_][i_1017_] != null) {
						Class126 class126 = aClass126ArrayArray9132[i_1016_][i_1017_];
						for (int i_1032_ = 0; i_1032_ < class126.aShort1522; i_1032_++) {
							fs[i_1032_] = (float) (i_1014_ + (class126.aShortArray1520[i_1032_] * i_1013_ / (anInt1752 * 1048375491)));
							fs_1011_[i_1032_] = (float) (i_1015_ - (class126.aShortArray1518[i_1032_] * i_1013_ / (anInt1752 * 1048375491)));
						}
						for (int i_1033_ = 0; i_1033_ < class126.aShort1526; i_1033_++) {
							int i_1034_ = i_1033_ * 3;
							int i_1035_ = i_1034_ + 1;
							int i_1036_ = i_1035_ + 1;
							float f = fs[i_1034_];
							float f_1037_ = fs[i_1035_];
							float f_1038_ = fs[i_1036_];
							float f_1039_ = fs_1011_[i_1034_];
							float f_1040_ = fs_1011_[i_1035_];
							float f_1041_ = fs_1011_[i_1036_];
							if (class126.anIntArray1528 != null && class126.anIntArray1528[i_1033_] != 0) {
								int i_1042_ = class126.anIntArray1528[i_1033_];
								class119.method2106(true, true, false, f_1039_, f_1040_, f_1041_, f, f_1037_, f_1038_, 100.0F, 100.0F, 100.0F, i_1042_, i_1042_, i_1042_);
							} else
								class119.method2106(true, true, false, f_1039_, f_1040_, f_1041_, f, f_1037_, f_1038_, 100.0F, 100.0F, 100.0F, class126.anIntArray1521[i_1034_], class126.anIntArray1521[i_1035_], class126.anIntArray1521[i_1036_]);
						}
					}
				}
				i_1015_ -= i_1013_;
			}
			i_1015_ = i_1005_ + i_1012_;
			i_1014_ += i_1013_;
		}
		class119.aBool1467 = true;
		aClass180_Sub1_9126.method3182(bool);
	}

	void method14614(int i, int i_1043_, int i_1044_, int i_1045_, int i_1046_, int i_1047_, int i_1048_, boolean[][] bools, Class101 class101, Class119 class119, float[] fs, float[] fs_1049_) {
		int i_1050_ = (i_1048_ - i_1046_) * i_1044_ / 256;
		int i_1051_ = i_1044_ >> 8;
		boolean bool = class101.aBool1227;
		aClass180_Sub1_9126.method3182(false);
		class119.aBool1467 = false;
		class119.aBool1443 = false;
		int i_1052_ = i;
		int i_1053_ = i_1043_ + i_1050_;
		for (int i_1054_ = i_1045_; i_1054_ < i_1047_; i_1054_++) {
			for (int i_1055_ = i_1046_; i_1055_ < i_1048_; i_1055_++) {
				if (bools[i_1054_ - i_1045_][i_1055_ - i_1046_]) {
					if (aClass96ArrayArray9130 != null) {
						if (aClass96ArrayArray9130[i_1054_][i_1055_] != null) {
							Class96 class96 = aClass96ArrayArray9130[i_1054_][i_1055_];
							if (class96.aShort1148 != -1 && (class96.aByte1149 & 0x2) == 0 && class96.anInt1157 == 0) {
								int i_1056_ = (aClass180_Sub1_9126.method14825(class96.aShort1148 & 0xffff));
								class119.method2073(true, true, false, (float) (i_1053_ - i_1051_), (float) (i_1053_ - i_1051_), (float) i_1053_, (float) (i_1052_ + i_1051_), (float) i_1052_, (float) (i_1052_ + i_1051_), 100.0F, 100.0F, 100.0F, (float) Class395.method6504(i_1056_, (class96.anInt1151), -501584282), (float) Class395.method6504(i_1056_, (class96.anInt1153), -501584282), (float) Class395.method6504(i_1056_, (class96.anInt1158), -501584282));
								class119.method2073(true, true, false, (float) i_1053_, (float) i_1053_, (float) (i_1053_ - i_1051_), (float) i_1052_, (float) (i_1052_ + i_1051_), (float) i_1052_, 100.0F, 100.0F, 100.0F, (float) Class395.method6504(i_1056_, (class96.anInt1152), -501584282), (float) Class395.method6504(i_1056_, (class96.anInt1158), -501584282), (float) Class395.method6504(i_1056_, (class96.anInt1153), -501584282));
							} else if (class96.anInt1157 == 0) {
								class119.method2106(true, true, false, (float) (i_1053_ - i_1051_), (float) (i_1053_ - i_1051_), (float) i_1053_, (float) (i_1052_ + i_1051_), (float) i_1052_, (float) (i_1052_ + i_1051_), 100.0F, 100.0F, 100.0F, class96.anInt1151, class96.anInt1153, class96.anInt1158);
								class119.method2106(true, true, false, (float) i_1053_, (float) i_1053_, (float) (i_1053_ - i_1051_), (float) i_1052_, (float) (i_1052_ + i_1051_), (float) i_1052_, 100.0F, 100.0F, 100.0F, class96.anInt1152, class96.anInt1158, class96.anInt1153);
							} else {
								int i_1057_ = class96.anInt1157;
								class119.method2106(true, true, false, (float) (i_1053_ - i_1051_), (float) (i_1053_ - i_1051_), (float) i_1053_, (float) (i_1052_ + i_1051_), (float) i_1052_, (float) (i_1052_ + i_1051_), 100.0F, 100.0F, 100.0F, Class597.method9915(i_1057_, (class96.anInt1151 & ~0xffffff), (short) -20860), Class597.method9915(i_1057_, (class96.anInt1153 & ~0xffffff), (short) -14342), Class597.method9915(i_1057_, (class96.anInt1158 & ~0xffffff), (short) -190));
								class119.method2106(true, true, false, (float) i_1053_, (float) i_1053_, (float) (i_1053_ - i_1051_), (float) i_1052_, (float) (i_1052_ + i_1051_), (float) i_1052_, 100.0F, 100.0F, 100.0F, Class597.method9915(i_1057_, (class96.anInt1152 & ~0xffffff), (short) -6374), Class597.method9915(i_1057_, (class96.anInt1158 & ~0xffffff), (short) -14711), Class597.method9915(i_1057_, (class96.anInt1153 & ~0xffffff), (short) -5492));
							}
						} else if (aClass94ArrayArray9131[i_1054_][i_1055_] != null) {
							Class94 class94 = aClass94ArrayArray9131[i_1054_][i_1055_];
							for (int i_1058_ = 0; i_1058_ < class94.aShort1136; i_1058_++) {
								fs[i_1058_] = (float) (i_1052_ + ((class94.aShortArray1135[i_1058_]) * i_1051_ / (anInt1752 * 1048375491)));
								fs_1049_[i_1058_] = (float) (i_1053_ - ((class94.aShortArray1140[i_1058_]) * i_1051_ / (anInt1752 * 1048375491)));
							}
							for (int i_1059_ = 0; i_1059_ < class94.aShort1145; i_1059_++) {
								int i_1060_ = i_1059_ * 3;
								int i_1061_ = i_1060_ + 1;
								int i_1062_ = i_1061_ + 1;
								float f = fs[i_1060_];
								float f_1063_ = fs[i_1061_];
								float f_1064_ = fs[i_1062_];
								float f_1065_ = fs_1049_[i_1060_];
								float f_1066_ = fs_1049_[i_1061_];
								float f_1067_ = fs_1049_[i_1062_];
								if (class94.anIntArray1144 != null && class94.anIntArray1144[i_1059_] != 0 && (class94.aShortArray1143 == null || (class94.aShortArray1143 != null && (class94.aShortArray1143[i_1059_]) == -1))) {
									int i_1068_ = class94.anIntArray1144[i_1059_];
									class119.method2106(true, true, false, f_1065_, f_1066_, f_1067_, f, f_1063_, f_1064_, 100.0F, 100.0F, 100.0F, (Class597.method9915(i_1068_, (-16777216 - (class94.anIntArray1142[i_1060_] & ~0xffffff)), (short) 7234)), (Class597.method9915(i_1068_, (-16777216 - (class94.anIntArray1142[i_1061_] & ~0xffffff)), (short) -11424)), (Class597.method9915(i_1068_, (-16777216 - (class94.anIntArray1142[i_1062_] & ~0xffffff)), (short) -2790)));
								} else if (class94.aShortArray1143 != null && (class94.aShortArray1143[i_1059_] != -1)) {
									int i_1069_ = (aClass180_Sub1_9126.method14825(class94.aShortArray1143[i_1059_] & 0xffff));
									class119.method2073(true, true, false, f_1065_, f_1066_, f_1067_, f, f_1063_, f_1064_, 100.0F, 100.0F, 100.0F, (float) i_1069_, (float) i_1069_, (float) i_1069_);
								} else
									class119.method2106(true, true, false, f_1065_, f_1066_, f_1067_, f, f_1063_, f_1064_, 100.0F, 100.0F, 100.0F, class94.anIntArray1142[i_1060_], class94.anIntArray1142[i_1061_], class94.anIntArray1142[i_1062_]);
							}
						}
					} else if (aClass126ArrayArray9132[i_1054_][i_1055_] != null) {
						Class126 class126 = aClass126ArrayArray9132[i_1054_][i_1055_];
						for (int i_1070_ = 0; i_1070_ < class126.aShort1522; i_1070_++) {
							fs[i_1070_] = (float) (i_1052_ + (class126.aShortArray1520[i_1070_] * i_1051_ / (anInt1752 * 1048375491)));
							fs_1049_[i_1070_] = (float) (i_1053_ - (class126.aShortArray1518[i_1070_] * i_1051_ / (anInt1752 * 1048375491)));
						}
						for (int i_1071_ = 0; i_1071_ < class126.aShort1526; i_1071_++) {
							int i_1072_ = i_1071_ * 3;
							int i_1073_ = i_1072_ + 1;
							int i_1074_ = i_1073_ + 1;
							float f = fs[i_1072_];
							float f_1075_ = fs[i_1073_];
							float f_1076_ = fs[i_1074_];
							float f_1077_ = fs_1049_[i_1072_];
							float f_1078_ = fs_1049_[i_1073_];
							float f_1079_ = fs_1049_[i_1074_];
							if (class126.anIntArray1528 != null && class126.anIntArray1528[i_1071_] != 0) {
								int i_1080_ = class126.anIntArray1528[i_1071_];
								class119.method2106(true, true, false, f_1077_, f_1078_, f_1079_, f, f_1075_, f_1076_, 100.0F, 100.0F, 100.0F, i_1080_, i_1080_, i_1080_);
							} else
								class119.method2106(true, true, false, f_1077_, f_1078_, f_1079_, f, f_1075_, f_1076_, 100.0F, 100.0F, 100.0F, class126.anIntArray1521[i_1072_], class126.anIntArray1521[i_1073_], class126.anIntArray1521[i_1074_]);
						}
					}
				}
				i_1053_ -= i_1051_;
			}
			i_1053_ = i_1043_ + i_1050_;
			i_1052_ += i_1051_;
		}
		class119.aBool1467 = true;
		aClass180_Sub1_9126.method3182(bool);
	}

	void method14615(int i, int i_1081_, int i_1082_, int i_1083_, int i_1084_, int i_1085_, int i_1086_, boolean[][] bools, Class101 class101, Class119 class119, float[] fs, float[] fs_1087_) {
		int i_1088_ = (i_1086_ - i_1084_) * i_1082_ / 256;
		int i_1089_ = i_1082_ >> 8;
		boolean bool = class101.aBool1227;
		aClass180_Sub1_9126.method3182(false);
		class119.aBool1467 = false;
		class119.aBool1443 = false;
		int i_1090_ = i;
		int i_1091_ = i_1081_ + i_1088_;
		for (int i_1092_ = i_1083_; i_1092_ < i_1085_; i_1092_++) {
			for (int i_1093_ = i_1084_; i_1093_ < i_1086_; i_1093_++) {
				if (bools[i_1092_ - i_1083_][i_1093_ - i_1084_]) {
					if (aClass96ArrayArray9130 != null) {
						if (aClass96ArrayArray9130[i_1092_][i_1093_] != null) {
							Class96 class96 = aClass96ArrayArray9130[i_1092_][i_1093_];
							if (class96.aShort1148 != -1 && (class96.aByte1149 & 0x2) == 0 && class96.anInt1157 == 0) {
								int i_1094_ = (aClass180_Sub1_9126.method14825(class96.aShort1148 & 0xffff));
								class119.method2073(true, true, false, (float) (i_1091_ - i_1089_), (float) (i_1091_ - i_1089_), (float) i_1091_, (float) (i_1090_ + i_1089_), (float) i_1090_, (float) (i_1090_ + i_1089_), 100.0F, 100.0F, 100.0F, (float) Class395.method6504(i_1094_, (class96.anInt1151), -501584282), (float) Class395.method6504(i_1094_, (class96.anInt1153), -501584282), (float) Class395.method6504(i_1094_, (class96.anInt1158), -501584282));
								class119.method2073(true, true, false, (float) i_1091_, (float) i_1091_, (float) (i_1091_ - i_1089_), (float) i_1090_, (float) (i_1090_ + i_1089_), (float) i_1090_, 100.0F, 100.0F, 100.0F, (float) Class395.method6504(i_1094_, (class96.anInt1152), -501584282), (float) Class395.method6504(i_1094_, (class96.anInt1158), -501584282), (float) Class395.method6504(i_1094_, (class96.anInt1153), -501584282));
							} else if (class96.anInt1157 == 0) {
								class119.method2106(true, true, false, (float) (i_1091_ - i_1089_), (float) (i_1091_ - i_1089_), (float) i_1091_, (float) (i_1090_ + i_1089_), (float) i_1090_, (float) (i_1090_ + i_1089_), 100.0F, 100.0F, 100.0F, class96.anInt1151, class96.anInt1153, class96.anInt1158);
								class119.method2106(true, true, false, (float) i_1091_, (float) i_1091_, (float) (i_1091_ - i_1089_), (float) i_1090_, (float) (i_1090_ + i_1089_), (float) i_1090_, 100.0F, 100.0F, 100.0F, class96.anInt1152, class96.anInt1158, class96.anInt1153);
							} else {
								int i_1095_ = class96.anInt1157;
								class119.method2106(true, true, false, (float) (i_1091_ - i_1089_), (float) (i_1091_ - i_1089_), (float) i_1091_, (float) (i_1090_ + i_1089_), (float) i_1090_, (float) (i_1090_ + i_1089_), 100.0F, 100.0F, 100.0F, Class597.method9915(i_1095_, (class96.anInt1151 & ~0xffffff), (short) 17467), Class597.method9915(i_1095_, (class96.anInt1153 & ~0xffffff), (short) 8577), Class597.method9915(i_1095_, (class96.anInt1158 & ~0xffffff), (short) 1384));
								class119.method2106(true, true, false, (float) i_1091_, (float) i_1091_, (float) (i_1091_ - i_1089_), (float) i_1090_, (float) (i_1090_ + i_1089_), (float) i_1090_, 100.0F, 100.0F, 100.0F, Class597.method9915(i_1095_, (class96.anInt1152 & ~0xffffff), (short) 17955), Class597.method9915(i_1095_, (class96.anInt1158 & ~0xffffff), (short) 3795), Class597.method9915(i_1095_, (class96.anInt1153 & ~0xffffff), (short) 23070));
							}
						} else if (aClass94ArrayArray9131[i_1092_][i_1093_] != null) {
							Class94 class94 = aClass94ArrayArray9131[i_1092_][i_1093_];
							for (int i_1096_ = 0; i_1096_ < class94.aShort1136; i_1096_++) {
								fs[i_1096_] = (float) (i_1090_ + ((class94.aShortArray1135[i_1096_]) * i_1089_ / (anInt1752 * 1048375491)));
								fs_1087_[i_1096_] = (float) (i_1091_ - ((class94.aShortArray1140[i_1096_]) * i_1089_ / (anInt1752 * 1048375491)));
							}
							for (int i_1097_ = 0; i_1097_ < class94.aShort1145; i_1097_++) {
								int i_1098_ = i_1097_ * 3;
								int i_1099_ = i_1098_ + 1;
								int i_1100_ = i_1099_ + 1;
								float f = fs[i_1098_];
								float f_1101_ = fs[i_1099_];
								float f_1102_ = fs[i_1100_];
								float f_1103_ = fs_1087_[i_1098_];
								float f_1104_ = fs_1087_[i_1099_];
								float f_1105_ = fs_1087_[i_1100_];
								if (class94.anIntArray1144 != null && class94.anIntArray1144[i_1097_] != 0 && (class94.aShortArray1143 == null || (class94.aShortArray1143 != null && (class94.aShortArray1143[i_1097_]) == -1))) {
									int i_1106_ = class94.anIntArray1144[i_1097_];
									class119.method2106(true, true, false, f_1103_, f_1104_, f_1105_, f, f_1101_, f_1102_, 100.0F, 100.0F, 100.0F, (Class597.method9915(i_1106_, (-16777216 - (class94.anIntArray1142[i_1098_] & ~0xffffff)), (short) 2462)), (Class597.method9915(i_1106_, (-16777216 - (class94.anIntArray1142[i_1099_] & ~0xffffff)), (short) 2506)), (Class597.method9915(i_1106_, (-16777216 - (class94.anIntArray1142[i_1100_] & ~0xffffff)), (short) 1517)));
								} else if (class94.aShortArray1143 != null && (class94.aShortArray1143[i_1097_] != -1)) {
									int i_1107_ = (aClass180_Sub1_9126.method14825(class94.aShortArray1143[i_1097_] & 0xffff));
									class119.method2073(true, true, false, f_1103_, f_1104_, f_1105_, f, f_1101_, f_1102_, 100.0F, 100.0F, 100.0F, (float) i_1107_, (float) i_1107_, (float) i_1107_);
								} else
									class119.method2106(true, true, false, f_1103_, f_1104_, f_1105_, f, f_1101_, f_1102_, 100.0F, 100.0F, 100.0F, class94.anIntArray1142[i_1098_], class94.anIntArray1142[i_1099_], class94.anIntArray1142[i_1100_]);
							}
						}
					} else if (aClass126ArrayArray9132[i_1092_][i_1093_] != null) {
						Class126 class126 = aClass126ArrayArray9132[i_1092_][i_1093_];
						for (int i_1108_ = 0; i_1108_ < class126.aShort1522; i_1108_++) {
							fs[i_1108_] = (float) (i_1090_ + (class126.aShortArray1520[i_1108_] * i_1089_ / (anInt1752 * 1048375491)));
							fs_1087_[i_1108_] = (float) (i_1091_ - (class126.aShortArray1518[i_1108_] * i_1089_ / (anInt1752 * 1048375491)));
						}
						for (int i_1109_ = 0; i_1109_ < class126.aShort1526; i_1109_++) {
							int i_1110_ = i_1109_ * 3;
							int i_1111_ = i_1110_ + 1;
							int i_1112_ = i_1111_ + 1;
							float f = fs[i_1110_];
							float f_1113_ = fs[i_1111_];
							float f_1114_ = fs[i_1112_];
							float f_1115_ = fs_1087_[i_1110_];
							float f_1116_ = fs_1087_[i_1111_];
							float f_1117_ = fs_1087_[i_1112_];
							if (class126.anIntArray1528 != null && class126.anIntArray1528[i_1109_] != 0) {
								int i_1118_ = class126.anIntArray1528[i_1109_];
								class119.method2106(true, true, false, f_1115_, f_1116_, f_1117_, f, f_1113_, f_1114_, 100.0F, 100.0F, 100.0F, i_1118_, i_1118_, i_1118_);
							} else
								class119.method2106(true, true, false, f_1115_, f_1116_, f_1117_, f, f_1113_, f_1114_, 100.0F, 100.0F, 100.0F, class126.anIntArray1521[i_1110_], class126.anIntArray1521[i_1111_], class126.anIntArray1521[i_1112_]);
						}
					}
				}
				i_1091_ -= i_1089_;
			}
			i_1091_ = i_1081_ + i_1088_;
			i_1090_ += i_1089_;
		}
		class119.aBool1467 = true;
		aClass180_Sub1_9126.method3182(bool);
	}

	public void method2609(int i, int i_1119_, int i_1120_, int i_1121_, int i_1122_, int i_1123_, int i_1124_, boolean[][] bools) {
		Class101 class101 = aClass180_Sub1_9126.method14835(Thread.currentThread());
		Class119 class119 = class101.aClass119_1197;
		class119.anInt1441 = 0;
		class119.aBool1445 = true;
		aClass180_Sub1_9126.method14829();
		if (aClass96ArrayArray9130 != null || aClass126ArrayArray9132 != null)
			method14616(i, i_1119_, i_1120_, i_1121_, i_1122_, i_1123_, i_1124_, bools, class101, class119, class101.aFloatArray1228, class101.aFloatArray1229);
		else if (aClass139ArrayArray9143 != null)
			method14600(i, i_1119_, i_1120_, i_1121_, i_1122_, i_1123_, i_1124_, bools, class101, class119, class101.aFloatArray1228, class101.aFloatArray1229);
	}

	public Class527_Sub8_Sub8 method2625(int i, int i_1125_, Class527_Sub8_Sub8 class527_sub8_sub8) {
		return null;
	}

	public void method2591(int i, int i_1126_, int i_1127_, boolean[][] bools, boolean bool, int i_1128_) {
		if (aClass180_Sub1_9126.anIntArray9386 == null || aClass180_Sub1_9126.aFloatArray9389 == null)
			throw new IllegalStateException("");
		Class427 class427 = aClass180_Sub1_9126.aClass427_9403;
		aFloat9133 = class427.aFloatArray4807[0];
		aFloat9146 = class427.aFloatArray4807[1];
		aFloat9135 = class427.aFloatArray4807[2];
		aFloat9136 = class427.aFloatArray4807[3];
		aFloat9137 = class427.aFloatArray4807[4];
		aFloat9138 = class427.aFloatArray4807[5];
		aFloat9127 = class427.aFloatArray4807[6];
		aFloat9123 = class427.aFloatArray4807[7];
		aFloat9141 = class427.aFloatArray4807[8];
		aFloat9142 = class427.aFloatArray4807[9];
		aFloat9128 = class427.aFloatArray4807[10];
		aFloat9144 = class427.aFloatArray4807[11];
		aFloat9122 = class427.aFloatArray4807[12];
		aFloat9121 = class427.aFloatArray4807[13];
		aFloat9145 = class427.aFloatArray4807[14];
		aFloat9148 = class427.aFloatArray4807[15];
		for (int i_1129_ = 0; i_1129_ < i_1127_ + i_1127_; i_1129_++) {
			for (int i_1130_ = 0; i_1130_ < i_1127_ + i_1127_; i_1130_++) {
				if (bools[i_1129_][i_1130_]) {
					int i_1131_ = i - i_1127_ + i_1129_;
					int i_1132_ = i_1126_ - i_1127_ + i_1130_;
					if (i_1131_ >= 0 && i_1131_ < anInt1750 * 1210322533 && i_1132_ >= 0 && i_1132_ < anInt1751 * -533476177)
						method14597(i_1131_, i_1132_, i_1128_);
				}
			}
		}
	}

	void method14616(int i, int i_1133_, int i_1134_, int i_1135_, int i_1136_, int i_1137_, int i_1138_, boolean[][] bools, Class101 class101, Class119 class119, float[] fs, float[] fs_1139_) {
		int i_1140_ = (i_1138_ - i_1136_) * i_1134_ / 256;
		int i_1141_ = i_1134_ >> 8;
		boolean bool = class101.aBool1227;
		aClass180_Sub1_9126.method3182(false);
		class119.aBool1467 = false;
		class119.aBool1443 = false;
		int i_1142_ = i;
		int i_1143_ = i_1133_ + i_1140_;
		for (int i_1144_ = i_1135_; i_1144_ < i_1137_; i_1144_++) {
			for (int i_1145_ = i_1136_; i_1145_ < i_1138_; i_1145_++) {
				if (bools[i_1144_ - i_1135_][i_1145_ - i_1136_]) {
					if (aClass96ArrayArray9130 != null) {
						if (aClass96ArrayArray9130[i_1144_][i_1145_] != null) {
							Class96 class96 = aClass96ArrayArray9130[i_1144_][i_1145_];
							if (class96.aShort1148 != -1 && (class96.aByte1149 & 0x2) == 0 && class96.anInt1157 == 0) {
								int i_1146_ = (aClass180_Sub1_9126.method14825(class96.aShort1148 & 0xffff));
								class119.method2073(true, true, false, (float) (i_1143_ - i_1141_), (float) (i_1143_ - i_1141_), (float) i_1143_, (float) (i_1142_ + i_1141_), (float) i_1142_, (float) (i_1142_ + i_1141_), 100.0F, 100.0F, 100.0F, (float) Class395.method6504(i_1146_, (class96.anInt1151), -501584282), (float) Class395.method6504(i_1146_, (class96.anInt1153), -501584282), (float) Class395.method6504(i_1146_, (class96.anInt1158), -501584282));
								class119.method2073(true, true, false, (float) i_1143_, (float) i_1143_, (float) (i_1143_ - i_1141_), (float) i_1142_, (float) (i_1142_ + i_1141_), (float) i_1142_, 100.0F, 100.0F, 100.0F, (float) Class395.method6504(i_1146_, (class96.anInt1152), -501584282), (float) Class395.method6504(i_1146_, (class96.anInt1158), -501584282), (float) Class395.method6504(i_1146_, (class96.anInt1153), -501584282));
							} else if (class96.anInt1157 == 0) {
								class119.method2106(true, true, false, (float) (i_1143_ - i_1141_), (float) (i_1143_ - i_1141_), (float) i_1143_, (float) (i_1142_ + i_1141_), (float) i_1142_, (float) (i_1142_ + i_1141_), 100.0F, 100.0F, 100.0F, class96.anInt1151, class96.anInt1153, class96.anInt1158);
								class119.method2106(true, true, false, (float) i_1143_, (float) i_1143_, (float) (i_1143_ - i_1141_), (float) i_1142_, (float) (i_1142_ + i_1141_), (float) i_1142_, 100.0F, 100.0F, 100.0F, class96.anInt1152, class96.anInt1158, class96.anInt1153);
							} else {
								int i_1147_ = class96.anInt1157;
								class119.method2106(true, true, false, (float) (i_1143_ - i_1141_), (float) (i_1143_ - i_1141_), (float) i_1143_, (float) (i_1142_ + i_1141_), (float) i_1142_, (float) (i_1142_ + i_1141_), 100.0F, 100.0F, 100.0F, Class597.method9915(i_1147_, (class96.anInt1151 & ~0xffffff), (short) -15605), Class597.method9915(i_1147_, (class96.anInt1153 & ~0xffffff), (short) 17060), Class597.method9915(i_1147_, (class96.anInt1158 & ~0xffffff), (short) 7850));
								class119.method2106(true, true, false, (float) i_1143_, (float) i_1143_, (float) (i_1143_ - i_1141_), (float) i_1142_, (float) (i_1142_ + i_1141_), (float) i_1142_, 100.0F, 100.0F, 100.0F, Class597.method9915(i_1147_, (class96.anInt1152 & ~0xffffff), (short) -1127), Class597.method9915(i_1147_, (class96.anInt1158 & ~0xffffff), (short) 18351), Class597.method9915(i_1147_, (class96.anInt1153 & ~0xffffff), (short) -5614));
							}
						} else if (aClass94ArrayArray9131[i_1144_][i_1145_] != null) {
							Class94 class94 = aClass94ArrayArray9131[i_1144_][i_1145_];
							for (int i_1148_ = 0; i_1148_ < class94.aShort1136; i_1148_++) {
								fs[i_1148_] = (float) (i_1142_ + ((class94.aShortArray1135[i_1148_]) * i_1141_ / (anInt1752 * 1048375491)));
								fs_1139_[i_1148_] = (float) (i_1143_ - ((class94.aShortArray1140[i_1148_]) * i_1141_ / (anInt1752 * 1048375491)));
							}
							for (int i_1149_ = 0; i_1149_ < class94.aShort1145; i_1149_++) {
								int i_1150_ = i_1149_ * 3;
								int i_1151_ = i_1150_ + 1;
								int i_1152_ = i_1151_ + 1;
								float f = fs[i_1150_];
								float f_1153_ = fs[i_1151_];
								float f_1154_ = fs[i_1152_];
								float f_1155_ = fs_1139_[i_1150_];
								float f_1156_ = fs_1139_[i_1151_];
								float f_1157_ = fs_1139_[i_1152_];
								if (class94.anIntArray1144 != null && class94.anIntArray1144[i_1149_] != 0 && (class94.aShortArray1143 == null || (class94.aShortArray1143 != null && (class94.aShortArray1143[i_1149_]) == -1))) {
									int i_1158_ = class94.anIntArray1144[i_1149_];
									class119.method2106(true, true, false, f_1155_, f_1156_, f_1157_, f, f_1153_, f_1154_, 100.0F, 100.0F, 100.0F, (Class597.method9915(i_1158_, (-16777216 - (class94.anIntArray1142[i_1150_] & ~0xffffff)), (short) 17622)), (Class597.method9915(i_1158_, (-16777216 - (class94.anIntArray1142[i_1151_] & ~0xffffff)), (short) 12992)), (Class597.method9915(i_1158_, (-16777216 - (class94.anIntArray1142[i_1152_] & ~0xffffff)), (short) -15093)));
								} else if (class94.aShortArray1143 != null && (class94.aShortArray1143[i_1149_] != -1)) {
									int i_1159_ = (aClass180_Sub1_9126.method14825(class94.aShortArray1143[i_1149_] & 0xffff));
									class119.method2073(true, true, false, f_1155_, f_1156_, f_1157_, f, f_1153_, f_1154_, 100.0F, 100.0F, 100.0F, (float) i_1159_, (float) i_1159_, (float) i_1159_);
								} else
									class119.method2106(true, true, false, f_1155_, f_1156_, f_1157_, f, f_1153_, f_1154_, 100.0F, 100.0F, 100.0F, class94.anIntArray1142[i_1150_], class94.anIntArray1142[i_1151_], class94.anIntArray1142[i_1152_]);
							}
						}
					} else if (aClass126ArrayArray9132[i_1144_][i_1145_] != null) {
						Class126 class126 = aClass126ArrayArray9132[i_1144_][i_1145_];
						for (int i_1160_ = 0; i_1160_ < class126.aShort1522; i_1160_++) {
							fs[i_1160_] = (float) (i_1142_ + (class126.aShortArray1520[i_1160_] * i_1141_ / (anInt1752 * 1048375491)));
							fs_1139_[i_1160_] = (float) (i_1143_ - (class126.aShortArray1518[i_1160_] * i_1141_ / (anInt1752 * 1048375491)));
						}
						for (int i_1161_ = 0; i_1161_ < class126.aShort1526; i_1161_++) {
							int i_1162_ = i_1161_ * 3;
							int i_1163_ = i_1162_ + 1;
							int i_1164_ = i_1163_ + 1;
							float f = fs[i_1162_];
							float f_1165_ = fs[i_1163_];
							float f_1166_ = fs[i_1164_];
							float f_1167_ = fs_1139_[i_1162_];
							float f_1168_ = fs_1139_[i_1163_];
							float f_1169_ = fs_1139_[i_1164_];
							if (class126.anIntArray1528 != null && class126.anIntArray1528[i_1161_] != 0) {
								int i_1170_ = class126.anIntArray1528[i_1161_];
								class119.method2106(true, true, false, f_1167_, f_1168_, f_1169_, f, f_1165_, f_1166_, 100.0F, 100.0F, 100.0F, i_1170_, i_1170_, i_1170_);
							} else
								class119.method2106(true, true, false, f_1167_, f_1168_, f_1169_, f, f_1165_, f_1166_, 100.0F, 100.0F, 100.0F, class126.anIntArray1521[i_1162_], class126.anIntArray1521[i_1163_], class126.anIntArray1521[i_1164_]);
						}
					}
				}
				i_1143_ -= i_1141_;
			}
			i_1143_ = i_1133_ + i_1140_;
			i_1142_ += i_1141_;
		}
		class119.aBool1467 = true;
		aClass180_Sub1_9126.method3182(bool);
	}

	public void method2629(int i, int i_1171_, int i_1172_, boolean[][] bools, boolean bool, int i_1173_) {
		if (aClass180_Sub1_9126.anIntArray9386 == null || aClass180_Sub1_9126.aFloatArray9389 == null)
			throw new IllegalStateException("");
		Class427 class427 = aClass180_Sub1_9126.aClass427_9403;
		aFloat9133 = class427.aFloatArray4807[0];
		aFloat9146 = class427.aFloatArray4807[1];
		aFloat9135 = class427.aFloatArray4807[2];
		aFloat9136 = class427.aFloatArray4807[3];
		aFloat9137 = class427.aFloatArray4807[4];
		aFloat9138 = class427.aFloatArray4807[5];
		aFloat9127 = class427.aFloatArray4807[6];
		aFloat9123 = class427.aFloatArray4807[7];
		aFloat9141 = class427.aFloatArray4807[8];
		aFloat9142 = class427.aFloatArray4807[9];
		aFloat9128 = class427.aFloatArray4807[10];
		aFloat9144 = class427.aFloatArray4807[11];
		aFloat9122 = class427.aFloatArray4807[12];
		aFloat9121 = class427.aFloatArray4807[13];
		aFloat9145 = class427.aFloatArray4807[14];
		aFloat9148 = class427.aFloatArray4807[15];
		for (int i_1174_ = 0; i_1174_ < i_1172_ + i_1172_; i_1174_++) {
			for (int i_1175_ = 0; i_1175_ < i_1172_ + i_1172_; i_1175_++) {
				if (bools[i_1174_][i_1175_]) {
					int i_1176_ = i - i_1172_ + i_1174_;
					int i_1177_ = i_1171_ - i_1172_ + i_1175_;
					if (i_1176_ >= 0 && i_1176_ < anInt1750 * 1210322533 && i_1177_ >= 0 && i_1177_ < anInt1751 * -533476177)
						method14597(i_1176_, i_1177_, i_1173_);
				}
			}
		}
	}

	public boolean method2614(Class527_Sub8_Sub8 class527_sub8_sub8, int i, int i_1178_, int i_1179_, int i_1180_, boolean bool) {
		return false;
	}

	public void method2615(Class527_Sub16 class527_sub16, int[] is) {
		/* empty */
	}

	public void method2616(Class527_Sub16 class527_sub16, int[] is) {
		/* empty */
	}

	public void method2590(int i, int i_1181_, int[] is, int[] is_1182_, int[] is_1183_, int[] is_1184_, int[] is_1185_, int[] is_1186_, int[] is_1187_, int[] is_1188_, int[] is_1189_, int[] is_1190_, int[] is_1191_, Class178 class178, boolean bool) {
		if (aClass139ArrayArray9143 == null) {
			aClass139ArrayArray9143 = new Class139[anInt1750 * 1210322533][anInt1751 * -533476177];
			aClass111ArrayArray9140 = new Class111[anInt1750 * 1210322533][anInt1751 * -533476177];
		} else if (aClass96ArrayArray9130 != null || aClass126ArrayArray9132 != null)
			throw new IllegalStateException();
		boolean bool_1192_ = false;
		if (is_1188_.length == 2 && is_1185_.length == 2 && (is_1188_[0] == is_1188_[1] || is_1190_[0] != -1 && is_1190_[0] == is_1190_[1])) {
			bool_1192_ = true;
			for (int i_1193_ = 1; i_1193_ < 2; i_1193_++) {
				int i_1194_ = is[is_1185_[i_1193_]];
				int i_1195_ = is_1183_[is_1185_[i_1193_]];
				if (i_1194_ != 0 && i_1194_ != anInt1752 * 1048375491 || i_1195_ != 0 && i_1195_ != anInt1752 * 1048375491) {
					bool_1192_ = false;
					break;
				}
			}
		}
		if (!bool_1192_) {
			Class111 class111 = new Class111();
			short i_1196_ = (short) is.length;
			int i_1197_ = (short) is_1188_.length;
			class111.aShort1402 = i_1196_;
			class111.aShortArray1393 = new short[i_1196_];
			class111.aShortArray1395 = new short[i_1196_];
			class111.aShortArray1396 = new short[i_1196_];
			class111.aShortArray1398 = new short[i_1196_];
			for (int i_1198_ = 0; i_1198_ < i_1196_; i_1198_++) {
				int i_1199_ = is[i_1198_];
				int i_1200_ = is_1183_[i_1198_];
				if (i_1199_ == 0 && i_1200_ == 0)
					class111.aShortArray1393[i_1198_] = (short) (aByteArrayArray9149[i][i_1181_] - aByteArrayArray9129[i][i_1181_]);
				else if (i_1199_ == 0 && i_1200_ == anInt1752 * 1048375491)
					class111.aShortArray1393[i_1198_] = (short) (aByteArrayArray9149[i][i_1181_ + 1] - aByteArrayArray9129[i][i_1181_ + 1]);
				else if (i_1199_ == anInt1752 * 1048375491 && i_1200_ == anInt1752 * 1048375491)
					class111.aShortArray1393[i_1198_] = (short) (aByteArrayArray9149[i + 1][i_1181_ + 1] - aByteArrayArray9129[i + 1][i_1181_ + 1]);
				else if (i_1199_ == anInt1752 * 1048375491 && i_1200_ == 0)
					class111.aShortArray1393[i_1198_] = (short) (aByteArrayArray9149[i + 1][i_1181_] - aByteArrayArray9129[i + 1][i_1181_]);
				else {
					int i_1201_ = (((aByteArrayArray9149[i][i_1181_] - aByteArrayArray9129[i][i_1181_]) * (anInt1752 * 1048375491 - i_1199_)) + ((aByteArrayArray9149[i + 1][i_1181_] - aByteArrayArray9129[i + 1][i_1181_]) * i_1199_));
					int i_1202_ = (((aByteArrayArray9149[i][i_1181_ + 1] - aByteArrayArray9129[i][i_1181_ + 1]) * (anInt1752 * 1048375491 - i_1199_)) + ((aByteArrayArray9149[i + 1][i_1181_ + 1] - aByteArrayArray9129[i + 1][i_1181_ + 1]) * i_1199_));
					class111.aShortArray1393[i_1198_] = (short) (i_1201_ * (anInt1752 * 1048375491 - i_1200_) + i_1202_ * i_1200_ >> anInt1753 * -1790967010);
				}
				int i_1203_ = (i << anInt1753 * 1252000143) + i_1199_;
				int i_1204_ = (i_1181_ << anInt1753 * 1252000143) + i_1200_;
				class111.aShortArray1395[i_1198_] = (short) i_1199_;
				class111.aShortArray1398[i_1198_] = (short) i_1200_;
				class111.aShortArray1396[i_1198_] = (short) (method2593(i_1203_, i_1204_, -1151432033) + (is_1182_ != null ? is_1182_[i_1198_] : 0));
				if (class111.aShortArray1393[i_1198_] < 2)
					class111.aShortArray1393[i_1198_] = (short) 2;
			}
			boolean bool_1205_ = false;
			int i_1206_ = 0;
			for (int i_1207_ = 0; i_1207_ < i_1197_; i_1207_++) {
				if (is_1188_[i_1207_] >= 0 || is_1189_ != null && is_1189_[i_1207_] >= 0)
					i_1206_++;
				int i_1208_ = is_1190_[i_1207_];
				if (i_1208_ != -1) {
					Class163 class163 = aClass180_Sub1_9126.aClass181_2059.method3544(i_1208_, (byte) -36);
					if (!class163.aBool1806) {
						bool_1205_ = true;
						if (method14603(class163.aByte1801) || class163.aByte1781 != 0 || class163.aByte1797 != 0)
							class111.aByte1394 |= 0x4;
					}
				}
			}
			class111.anIntArray1404 = new int[i_1206_];
			if (is_1189_ != null)
				class111.anIntArray1397 = new int[i_1206_];
			class111.aShortArray1399 = new short[i_1206_];
			class111.aShortArray1400 = new short[i_1206_];
			class111.aShortArray1401 = new short[i_1206_];
			if (bool_1205_) {
				class111.aShortArray1405 = new short[i_1206_];
				class111.aShortArray1392 = new short[i_1206_];
			}
			for (int i_1209_ = 0; i_1209_ < i_1197_; i_1209_++) {
				if (is_1188_[i_1209_] >= 0 || is_1189_ != null && is_1189_[i_1209_] >= 0) {
					if (is_1188_[i_1209_] >= 0)
						class111.anIntArray1404[class111.aShort1403] = Class453.method7333(is_1188_[i_1209_], (byte) 10);
					else
						class111.anIntArray1404[class111.aShort1403] = -1;
					if (is_1189_ != null) {
						if (is_1189_[i_1209_] != -1)
							class111.anIntArray1397[class111.aShort1403] = Class453.method7333(is_1189_[i_1209_], (byte) 10);
						else
							class111.anIntArray1397[class111.aShort1403] = -1;
					}
					class111.aShortArray1399[class111.aShort1403] = (short) is_1185_[i_1209_];
					class111.aShortArray1400[class111.aShort1403] = (short) is_1186_[i_1209_];
					class111.aShortArray1401[class111.aShort1403] = (short) is_1187_[i_1209_];
					if (bool_1205_) {
						if (is_1190_[i_1209_] != -1 && !(aClass180_Sub1_9126.aClass181_2059.method3544(is_1190_[i_1209_], (byte) -51).aBool1806)) {
							class111.aShortArray1405[class111.aShort1403] = (short) is_1190_[i_1209_];
							class111.aShortArray1392[class111.aShort1403] = (short) is_1191_[i_1209_];
						} else
							class111.aShortArray1405[class111.aShort1403] = (short) -1;
					}
					class111.aShort1403++;
				}
			}
			aClass111ArrayArray9140[i][i_1181_] = class111;
		} else if (is_1188_[0] >= 0 || is_1189_ != null && is_1189_[0] >= 0) {
			Class139 class139 = new Class139();
			int i_1210_ = is_1188_[0];
			int i_1211_ = is_1190_[0];
			if (is_1189_ != null) {
				class139.anInt1645 = Class395.method6504(Class453.method7333(is_1189_[0], (byte) 10), (aByteArrayArray9149[i][i_1181_] - aByteArrayArray9129[i][i_1181_]), -501584282);
				if (i_1210_ == -1)
					class139.aByte1646 |= 0x2;
			}
			if ((anIntArrayArray1754[i][i_1181_] == anIntArrayArray1754[i + 1][i_1181_]) && (anIntArrayArray1754[i][i_1181_] == anIntArrayArray1754[i + 1][i_1181_ + 1]) && (anIntArrayArray1754[i][i_1181_] == anIntArrayArray1754[i][i_1181_ + 1]))
				class139.aByte1646 |= 0x1;
			Class163 class163 = null;
			if (i_1211_ != -1)
				class163 = aClass180_Sub1_9126.aClass181_2059.method3544(i_1211_, (byte) -72);
			if (class163 != null && (class139.aByte1646 & 0x2) == 0 && !class163.aBool1806) {
				class139.aShort1641 = (short) (aByteArrayArray9149[i][i_1181_] - aByteArrayArray9129[i][i_1181_]);
				class139.aShort1640 = (short) (aByteArrayArray9149[i + 1][i_1181_] - aByteArrayArray9129[i + 1][i_1181_]);
				class139.aShort1642 = (short) (aByteArrayArray9149[i + 1][i_1181_ + 1] - aByteArrayArray9129[i + 1][i_1181_ + 1]);
				class139.aShort1643 = (short) (aByteArrayArray9149[i][i_1181_ + 1] - aByteArrayArray9129[i][i_1181_ + 1]);
				class139.aShort1644 = (short) i_1211_;
				if (method14603(class163.aByte1801) || class163.aByte1781 != 0 || class163.aByte1797 != 0)
					class139.aByte1646 |= 0x4;
			} else {
				short i_1212_ = Class453.method7333(i_1210_, (byte) 10);
				class139.aShort1641 = (short) Class395.method6504(i_1212_, ((aByteArrayArray9149[i][i_1181_]) - (aByteArrayArray9129[i][i_1181_])), -501584282);
				class139.aShort1640 = (short) Class395.method6504(i_1212_, ((aByteArrayArray9149[i + 1][i_1181_]) - (aByteArrayArray9129[i + 1][i_1181_])), -501584282);
				class139.aShort1642 = (short) Class395.method6504(i_1212_, ((aByteArrayArray9149[i + 1][i_1181_ + 1]) - (aByteArrayArray9129[i + 1][i_1181_ + 1])), -501584282);
				class139.aShort1643 = (short) Class395.method6504(i_1212_, ((aByteArrayArray9149[i][i_1181_ + 1]) - (aByteArrayArray9129[i][i_1181_ + 1])), -501584282);
				class139.aShort1644 = (short) -1;
			}
			aClass139ArrayArray9143[i][i_1181_] = class139;
		}
	}

	void method14617(int i, int i_1213_, boolean bool, Class101 class101, Class119 class119, float[] fs, float[] fs_1214_, float[] fs_1215_, float[] fs_1216_, float[] fs_1217_, int i_1218_) {
		Class126 class126 = aClass126ArrayArray9132[i][i_1213_];
		if (i_1218_ == 0 || (i_1218_ & 0x2) == 0) {
			if (class126 != null) {
				for (int i_1219_ = 0; i_1219_ < class126.aShort1522; i_1219_++) {
					int i_1220_ = (class126.aShortArray1520[i_1219_] + (i << anInt1753 * 1252000143));
					int i_1221_ = class126.aShortArray1519[i_1219_];
					int i_1222_ = (class126.aShortArray1518[i_1219_] + (i_1213_ << anInt1753 * 1252000143));
					float f = aFloat9145 + (aFloat9135 * (float) i_1220_ + aFloat9127 * (float) i_1221_ + aFloat9128 * (float) i_1222_);
					float f_1223_ = aFloat9148 + (aFloat9136 * (float) i_1220_ + aFloat9123 * (float) i_1221_ + aFloat9144 * (float) i_1222_);
					if (f < -f_1223_)
						return;
					fs_1217_[i_1219_] = 0.0F;
					if (bool) {
						float f_1224_ = f - class101.aFloat1192;
						if (f_1224_ > 0.0F) {
							f_1224_ /= class101.aFloat1193;
							if (f_1224_ > 1.0F)
								f_1224_ = 1.0F;
							fs_1217_[i_1219_] = f_1224_;
							int i_1225_ = (int) ((float) (class126.aShortArray1523[i_1219_]) * f_1224_);
							if (i_1225_ > 0)
								i_1221_ -= i_1225_;
						}
					} else if (class101.aBool1191) {
						float f_1226_ = f - class101.aFloat1192;
						if (f_1226_ > 0.0F) {
							fs_1217_[i_1219_] = f_1226_ / class101.aFloat1193;
							if (fs_1217_[i_1219_] > 1.0F)
								fs_1217_[i_1219_] = 1.0F;
						}
					}
					float f_1227_ = aFloat9122 + (aFloat9133 * (float) i_1220_ + aFloat9137 * (float) i_1221_ + aFloat9141 * (float) i_1222_);
					float f_1228_ = aFloat9121 + (aFloat9146 * (float) i_1220_ + aFloat9138 * (float) i_1221_ + aFloat9142 * (float) i_1222_);
					fs[i_1219_] = (class119.aFloat1448 + class119.aFloat1451 * f_1227_ / f_1223_);
					fs_1214_[i_1219_] = (class119.aFloat1444 + class119.aFloat1466 * f_1228_ / f_1223_);
					fs_1215_[i_1219_] = (class119.aFloat1452 + class119.aFloat1453 * f / f_1223_);
					fs_1216_[i_1219_] = f_1223_;
				}
				float f = (float) (anInt1752 * 1048375491);
				for (int i_1229_ = 0; i_1229_ < class126.aShort1526; i_1229_++) {
					int i_1230_ = i_1229_ * 3;
					int i_1231_ = i_1230_ + 1;
					int i_1232_ = i_1231_ + 1;
					float f_1233_ = fs[i_1230_];
					float f_1234_ = fs[i_1231_];
					float f_1235_ = fs[i_1232_];
					float f_1236_ = fs_1214_[i_1230_];
					float f_1237_ = fs_1214_[i_1231_];
					float f_1238_ = fs_1214_[i_1232_];
					if (((f_1233_ - f_1234_) * (f_1238_ - f_1237_) - (f_1236_ - f_1237_) * (f_1235_ - f_1234_)) > 0.0F) {
						class119.aBool1445 = (f_1233_ < 0.0F || f_1234_ < 0.0F || f_1235_ < 0.0F || f_1233_ > (float) class119.anInt1442 || f_1234_ > (float) class119.anInt1442 || f_1235_ > (float) class119.anInt1442);
						if ((fs_1217_[i_1230_] + fs_1217_[i_1231_] + fs_1217_[i_1232_]) < 3.0F) {
							int i_1239_ = i << anInt1753 * 1252000143;
							int i_1240_ = i_1213_ << anInt1753 * 1252000143;
							if ((class126.anIntArray1521[i_1230_] & 0xffffff) != 0) {
								if (class126.aShortArray1524[i_1230_] != -1 && class126.aShortArray1524[i_1231_] != -1 && (class126.aShortArray1524[i_1232_] != -1)) {
									if ((class126.aShortArray1524[i_1230_] == class126.aShortArray1524[i_1231_]) && (class126.aShortArray1524[i_1230_] == (class126.aShortArray1524[i_1232_])) && (class126.aShortArray1525[i_1230_] == (class126.aShortArray1525[i_1231_])) && (class126.aShortArray1525[i_1230_] == (class126.aShortArray1525[i_1232_])))
										class119.method2079(true, true, false, f_1236_, f_1237_, f_1238_, f_1233_, f_1234_, f_1235_, fs_1215_[i_1230_], fs_1215_[i_1231_], fs_1215_[i_1232_], fs_1216_[i_1230_], fs_1216_[i_1231_], fs_1216_[i_1232_], ((float) (i_1239_ + (class126.aShortArray1520[i_1230_])) / (float) (class126.aShortArray1525[i_1230_])), ((float) (i_1239_ + (class126.aShortArray1520[i_1231_])) / (float) (class126.aShortArray1525[i_1231_])),
												((float) (i_1239_ + (class126.aShortArray1520[i_1232_])) / (float) (class126.aShortArray1525[i_1232_])), ((float) (i_1240_ + (class126.aShortArray1518[i_1230_])) / (float) (class126.aShortArray1525[i_1230_])), ((float) (i_1240_ + (class126.aShortArray1518[i_1231_])) / (float) (class126.aShortArray1525[i_1231_])), ((float) (i_1240_ + (class126.aShortArray1518[i_1232_])) / (float) (class126.aShortArray1525[i_1232_])),
												class126.anIntArray1521[i_1230_], class126.anIntArray1521[i_1231_], class126.anIntArray1521[i_1232_], class101.anInt1194 * -1009384223, fs_1217_[i_1230_] * 255.0F, fs_1217_[i_1231_] * 255.0F, fs_1217_[i_1232_] * 255.0F, (class126.aShortArray1524[i_1230_] & 0xffff));
									else
										class119.method2114(true, true, false, f_1236_, f_1237_, f_1238_, f_1233_, f_1234_, f_1235_, fs_1215_[i_1230_], fs_1215_[i_1231_], fs_1215_[i_1232_], fs_1216_[i_1230_], fs_1216_[i_1231_], fs_1216_[i_1232_], (float) (i_1239_ + (class126.aShortArray1520[i_1230_])) / f, (float) (i_1239_ + (class126.aShortArray1520[i_1231_])) / f, (float) (i_1239_ + (class126.aShortArray1520[i_1232_])) / f, (float) (i_1240_ + (class126.aShortArray1518[i_1230_])) / f,
												(float) (i_1240_ + (class126.aShortArray1518[i_1231_])) / f, (float) (i_1240_ + (class126.aShortArray1518[i_1232_])) / f, class126.anIntArray1521[i_1230_], class126.anIntArray1521[i_1231_], class126.anIntArray1521[i_1232_], class101.anInt1194 * -1009384223, fs_1217_[i_1230_] * 255.0F, fs_1217_[i_1231_] * 255.0F, fs_1217_[i_1232_] * 255.0F, (class126.aShortArray1524[i_1230_] & 0xffff), f / (float) (class126.aShortArray1525[i_1230_]),
												(class126.aShortArray1524[i_1231_] & 0xffff), f / (float) (class126.aShortArray1525[i_1231_]), (class126.aShortArray1524[i_1232_] & 0xffff), f / (float) (class126.aShortArray1525[i_1232_]));
								} else if ((fs_1217_[i_1230_] + fs_1217_[i_1231_] + fs_1217_[i_1232_]) > 0.0F)
									class119.method2106(true, true, false, f_1236_, f_1237_, f_1238_, f_1233_, f_1234_, f_1235_, fs_1215_[i_1230_], fs_1215_[i_1231_], fs_1215_[i_1232_], (Class388.method6456(class126.anIntArray1521[i_1230_], class101.anInt1194 * -1009384223, fs_1217_[i_1230_] * 255.0F, (byte) -40)), (Class388.method6456(class126.anIntArray1521[i_1231_], class101.anInt1194 * -1009384223, fs_1217_[i_1231_] * 255.0F, (byte) 5)),
											(Class388.method6456(class126.anIntArray1521[i_1232_], class101.anInt1194 * -1009384223, fs_1217_[i_1232_] * 255.0F, (byte) 29)));
								else
									class119.method2106(true, true, false, f_1236_, f_1237_, f_1238_, f_1233_, f_1234_, f_1235_, fs_1215_[i_1230_], fs_1215_[i_1231_], fs_1215_[i_1232_], class126.anIntArray1521[i_1230_], class126.anIntArray1521[i_1231_], class126.anIntArray1521[i_1232_]);
							}
						} else
							class119.method2077(true, true, false, f_1236_, f_1237_, f_1238_, f_1233_, f_1234_, f_1235_, fs_1215_[i_1230_], fs_1215_[i_1231_], fs_1215_[i_1232_], (class101.anInt1194 * -1009384223));
					}
				}
			}
		}
	}

	public void method2602(int i, int i_1241_, int i_1242_) {
		i = Math.min(aByteArrayArray9129.length - 1, Math.max(0, i));
		i_1241_ = Math.min(aByteArrayArray9129[i].length - 1, Math.max(0, i_1241_));
		if (aByteArrayArray9129[i][i_1241_] < i_1242_)
			aByteArrayArray9129[i][i_1241_] = (byte) i_1242_;
	}

	public void method2620(int i, int i_1243_, int i_1244_, boolean[][] bools, boolean bool, int i_1245_) {
		if (aClass180_Sub1_9126.anIntArray9386 == null || aClass180_Sub1_9126.aFloatArray9389 == null)
			throw new IllegalStateException("");
		Class427 class427 = aClass180_Sub1_9126.aClass427_9403;
		aFloat9133 = class427.aFloatArray4807[0];
		aFloat9146 = class427.aFloatArray4807[1];
		aFloat9135 = class427.aFloatArray4807[2];
		aFloat9136 = class427.aFloatArray4807[3];
		aFloat9137 = class427.aFloatArray4807[4];
		aFloat9138 = class427.aFloatArray4807[5];
		aFloat9127 = class427.aFloatArray4807[6];
		aFloat9123 = class427.aFloatArray4807[7];
		aFloat9141 = class427.aFloatArray4807[8];
		aFloat9142 = class427.aFloatArray4807[9];
		aFloat9128 = class427.aFloatArray4807[10];
		aFloat9144 = class427.aFloatArray4807[11];
		aFloat9122 = class427.aFloatArray4807[12];
		aFloat9121 = class427.aFloatArray4807[13];
		aFloat9145 = class427.aFloatArray4807[14];
		aFloat9148 = class427.aFloatArray4807[15];
		for (int i_1246_ = 0; i_1246_ < i_1244_ + i_1244_; i_1246_++) {
			for (int i_1247_ = 0; i_1247_ < i_1244_ + i_1244_; i_1247_++) {
				if (bools[i_1246_][i_1247_]) {
					int i_1248_ = i - i_1244_ + i_1246_;
					int i_1249_ = i_1243_ - i_1244_ + i_1247_;
					if (i_1248_ >= 0 && i_1248_ < anInt1750 * 1210322533 && i_1249_ >= 0 && i_1249_ < anInt1751 * -533476177)
						method14597(i_1248_, i_1249_, i_1245_);
				}
			}
		}
	}

	public void method2622(int i, int i_1250_, int i_1251_, boolean[][] bools, boolean bool, int i_1252_) {
		if (aClass180_Sub1_9126.anIntArray9386 == null || aClass180_Sub1_9126.aFloatArray9389 == null)
			throw new IllegalStateException("");
		Class427 class427 = aClass180_Sub1_9126.aClass427_9403;
		aFloat9133 = class427.aFloatArray4807[0];
		aFloat9146 = class427.aFloatArray4807[1];
		aFloat9135 = class427.aFloatArray4807[2];
		aFloat9136 = class427.aFloatArray4807[3];
		aFloat9137 = class427.aFloatArray4807[4];
		aFloat9138 = class427.aFloatArray4807[5];
		aFloat9127 = class427.aFloatArray4807[6];
		aFloat9123 = class427.aFloatArray4807[7];
		aFloat9141 = class427.aFloatArray4807[8];
		aFloat9142 = class427.aFloatArray4807[9];
		aFloat9128 = class427.aFloatArray4807[10];
		aFloat9144 = class427.aFloatArray4807[11];
		aFloat9122 = class427.aFloatArray4807[12];
		aFloat9121 = class427.aFloatArray4807[13];
		aFloat9145 = class427.aFloatArray4807[14];
		aFloat9148 = class427.aFloatArray4807[15];
		for (int i_1253_ = 0; i_1253_ < i_1251_ + i_1251_; i_1253_++) {
			for (int i_1254_ = 0; i_1254_ < i_1251_ + i_1251_; i_1254_++) {
				if (bools[i_1253_][i_1254_]) {
					int i_1255_ = i - i_1251_ + i_1253_;
					int i_1256_ = i_1250_ - i_1251_ + i_1254_;
					if (i_1255_ >= 0 && i_1255_ < anInt1750 * 1210322533 && i_1256_ >= 0 && i_1256_ < anInt1751 * -533476177)
						method14597(i_1255_, i_1256_, i_1252_);
				}
			}
		}
	}

	public void method2600(int i, int i_1257_, int i_1258_, boolean[][] bools, boolean bool, int i_1259_) {
		if (aClass180_Sub1_9126.anIntArray9386 == null || aClass180_Sub1_9126.aFloatArray9389 == null)
			throw new IllegalStateException("");
		Class427 class427 = aClass180_Sub1_9126.aClass427_9403;
		aFloat9133 = class427.aFloatArray4807[0];
		aFloat9146 = class427.aFloatArray4807[1];
		aFloat9135 = class427.aFloatArray4807[2];
		aFloat9136 = class427.aFloatArray4807[3];
		aFloat9137 = class427.aFloatArray4807[4];
		aFloat9138 = class427.aFloatArray4807[5];
		aFloat9127 = class427.aFloatArray4807[6];
		aFloat9123 = class427.aFloatArray4807[7];
		aFloat9141 = class427.aFloatArray4807[8];
		aFloat9142 = class427.aFloatArray4807[9];
		aFloat9128 = class427.aFloatArray4807[10];
		aFloat9144 = class427.aFloatArray4807[11];
		aFloat9122 = class427.aFloatArray4807[12];
		aFloat9121 = class427.aFloatArray4807[13];
		aFloat9145 = class427.aFloatArray4807[14];
		aFloat9148 = class427.aFloatArray4807[15];
		for (int i_1260_ = 0; i_1260_ < i_1258_ + i_1258_; i_1260_++) {
			for (int i_1261_ = 0; i_1261_ < i_1258_ + i_1258_; i_1261_++) {
				if (bools[i_1260_][i_1261_]) {
					int i_1262_ = i - i_1258_ + i_1260_;
					int i_1263_ = i_1257_ - i_1258_ + i_1261_;
					if (i_1262_ >= 0 && i_1262_ < anInt1750 * 1210322533 && i_1263_ >= 0 && i_1263_ < anInt1751 * -533476177)
						method14597(i_1262_, i_1263_, i_1259_);
				}
			}
		}
	}

	public boolean method2598(Class527_Sub8_Sub8 class527_sub8_sub8, int i, int i_1264_, int i_1265_, int i_1266_, boolean bool) {
		return false;
	}

	public void method2624(Class527_Sub8_Sub8 class527_sub8_sub8, int i, int i_1267_, int i_1268_, int i_1269_, boolean bool) {
		/* empty */
	}

	public void method2612() {
		aByteArrayArray9149 = null;
		aByteArrayArray9129 = null;
	}
}
