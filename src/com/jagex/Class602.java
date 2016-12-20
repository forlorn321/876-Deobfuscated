/* Class602 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Arrays;

public class Class602 implements Interface14 {
	public String aString7871 = "null";
	public int anInt7872;
	public int anInt7873;
	public int anInt7874;
	Interface13 anInterface13_7875;
	int anInt7876;
	public int anInt7877;
	byte[] aByteArray7878;
	short[] aShortArray7879;
	public int[] anIntArray7880;
	byte[] aByteArray7881;
	short[] aShortArray7882;
	short[] aShortArray7883;
	byte[] aByteArray7884;
	byte[] aByteArray7885;
	int anInt7886;
	byte aByte7887;
	byte aByte7888;
	byte aByte7889 = 0;
	int anInt7890;
	public int anInt7891;
	public int anInt7892;
	short[] aShortArray7893;
	byte aByte7894;
	public int anInt7895;
	public boolean aBool7896;
	public int anInt7897;
	public int anInt7898;
	public int anInt7899;
	int[] anIntArray7900;
	int[] anIntArray7901;
	public boolean aBool7902;
	public int anInt7903;
	public String[] aStringArray7904;
	int anInt7905;
	int anInt7906;
	int[] anIntArray7907;
	static final int anInt7908 = 6;
	public int anInt7909;
	public boolean aBool7910;
	public boolean aBool7911;
	public boolean aBool7912;
	Class601 aClass601_7913;
	byte aByte7914;
	int anInt7915;
	int anInt7916;
	int anInt7917;
	int anInt7918;
	public boolean aBool7919;
	int anInt7920;
	int anInt7921;
	int anInt7922;
	int[][] anIntArrayArray7923;
	public boolean aBool7924;
	boolean aBool7925;
	public int anInt7926;
	public int anInt7927;
	public int anInt7928;
	public int[] anIntArray7929;
	int anInt7930;
	public boolean aBool7931;
	public int anInt7932;
	public int anInt7933;
	public int anInt7934;
	public static short[] aShortArray7935 = new short[256];
	public int anInt7936;
	public int[] anIntArray7937;
	int anInt7938;
	public boolean aBool7939;
	public boolean aBool7940;
	static final int anInt7941 = 127007;
	Class14 aClass14_7942;
	public boolean aBool7943;
	public int anInt7944;
	public int anInt7945;
	public int anInt7946;
	public boolean aBool7947;
	public boolean aBool7948;
	public Class593 aClass593_7949;
	public Class439 aClass439_7950;
	public boolean aBool7951;

	public final synchronized Class176 method9955(Class180 class180, int i, int i_0_, int i_1_, Class161 class161, Class161 class161_2_, int i_3_, int i_4_, int i_5_, Class695 class695, Class599 class599, byte i_6_) {
		if (Class191.method3687(i_0_, 1169478440))
			i_0_ = -1736797763 * Class596.aClass596_7825.anInt7844;
		long l = (long) (i_1_ + ((anInt7873 * -320331677 << 10) + (i_0_ << 3)));
		int i_7_ = i;
		l |= (long) (-397006101 * class180.anInt2064 << 29);
		if (null != class599)
			l |= class599.aLong7855 * -4233498556259136701L << 32;
		if (class695 != null)
			i |= class695.method14174(-822649352);
		if (aByte7894 == 3)
			i |= 0x7;
		else {
			if (aByte7894 != 0 || 0 != anInt7922 * 686376233)
				i |= 0x2;
			if (0 != anInt7921 * -1311205683)
				i |= 0x1;
			if (0 != anInt7915 * 240741633)
				i |= 0x4;
		}
		if (i_0_ == -1736797763 * Class596.aClass596_7823.anInt7844 && i_1_ > 3)
			i |= 0x5;
		Class176 class176;
		synchronized (aClass601_7913.aClass205_7868) {
			class176 = (Class176) aClass601_7913.aClass205_7868.method3787(l);
		}
		if (class176 == null || class180.method3175(class176.method2874(), i) != 0) {
			if (null != class176)
				i = class180.method3176(i, class176.method2874());
			class176 = method9961(class180, i, i_0_, i_1_, class599, (byte) -53);
			if (class176 == null)
				return null;
			synchronized (aClass601_7913.aClass205_7868) {
				aClass601_7913.aClass205_7868.method3790(class176, l);
			}
		}
		boolean bool = false;
		if (null != class695) {
			class176 = class176.method2862((byte) 1, i, true);
			bool = true;
			class695.method14175(class176, i_1_ & 0x3, (byte) 0);
		}
		if (Class596.aClass596_7823.anInt7844 * -1736797763 == i_0_ && i_1_ > 3) {
			if (!bool) {
				class176 = class176.method2862((byte) 3, i, true);
				bool = true;
			}
			class176.method2911(2048);
		}
		if (aByte7894 != 0) {
			if (!bool) {
				class176 = class176.method2862((byte) 3, i, true);
				bool = true;
			}
			class176.method2873(aByte7894, 588638211 * anInt7906, class161, class161_2_, i_3_, i_4_, i_5_);
		}
		if (-1311205683 * anInt7921 != 0 || 686376233 * anInt7922 != 0 || 0 != anInt7915 * 240741633) {
			if (!bool) {
				class176 = class176.method2862((byte) 3, i, true);
				bool = true;
			}
			class176.method3015(anInt7921 * -1311205683, 686376233 * anInt7922, anInt7915 * 240741633);
		}
		if (bool)
			class176.method2941(i_7_);
		return class176;
	}

	public void method82(RSByteBuffer class527_sub38, int i) {
		for (;;) {
			int i_8_ = class527_sub38.readUnsignedByte();
			if (0 == i_8_)
				break;
			method9956(class527_sub38, i_8_, 1367630417);
		}
	}

	public void method86(int i) {
		method9957((byte) 3);
		if (aBool7925)
			anInt7892 = 0;
		if (!aClass601_7913.aBool7866 && aBool7951) {
			aStringArray7904 = null;
			anIntArray7880 = null;
		}
	}

	void method9956(RSByteBuffer class527_sub38, int i, int i_9_) {
		if (1 == i) {
			int i_10_ = class527_sub38.readUnsignedByte();
			aByteArray7878 = new byte[i_10_];
			anIntArrayArray7923 = new int[i_10_][];
			for (int i_11_ = 0; i_11_ < i_10_; i_11_++) {
				aByteArray7878[i_11_] = class527_sub38.readByte();
				int i_12_ = class527_sub38.readUnsignedByte();
				anIntArrayArray7923[i_11_] = new int[i_12_];
				for (int i_13_ = 0; i_13_ < i_12_; i_13_++)
					anIntArrayArray7923[i_11_][i_13_] = class527_sub38.method16466(-1732068798);
			}
		} else if (2 == i)
			aString7871 = class527_sub38.readString(885422994).intern();
		else if (14 == i)
			anInt7874 = class527_sub38.readUnsignedByte() * 710174003;
		else if (15 == i)
			anInt7891 = class527_sub38.readUnsignedByte() * -714977777;
		else if (i == 17)
			anInt7892 = 0;
		else if (i != 18) {
			if (19 == i)
				anInt7898 = class527_sub38.readUnsignedByte() * 414911161;
			else if (i == 21)
				aByte7894 = (byte) 1;
			else if (22 == i)
				aBool7896 = true;
			else if (i == 23)
				anInt7897 = 1744638697;
			else if (i == 24) {
				int i_14_ = class527_sub38.method16466(-2044682399);
				if (-1 != i_14_)
					anIntArray7900 = new int[] { i_14_ };
			} else if (i == 27)
				anInt7892 = 39411999;
			else if (28 == i)
				anInt7903 = ((class527_sub38.readUnsignedByte() << 2) * 1448696305);
			else if (29 == i)
				anInt7938 = class527_sub38.readByte() * -529693273;
			else if (i == 39)
				anInt7905 = class527_sub38.readByte() * -344954101;
			else if (i >= 30 && i < 35)
				aStringArray7904[i - 30] = class527_sub38.readString(1187678129).intern();
			else if (i == 40) {
				int i_15_ = class527_sub38.readUnsignedByte();
				aShortArray7879 = new short[i_15_];
				aShortArray7893 = new short[i_15_];
				for (int i_16_ = 0; i_16_ < i_15_; i_16_++) {
					aShortArray7879[i_16_] = (short) class527_sub38.readUnsignedShort();
					aShortArray7893[i_16_] = (short) class527_sub38.readUnsignedShort();
				}
			} else if (41 == i) {
				int i_17_ = class527_sub38.readUnsignedByte();
				aShortArray7882 = new short[i_17_];
				aShortArray7883 = new short[i_17_];
				for (int i_18_ = 0; i_18_ < i_17_; i_18_++) {
					aShortArray7882[i_18_] = (short) class527_sub38.readUnsignedShort();
					aShortArray7883[i_18_] = (short) class527_sub38.readUnsignedShort();
				}
			} else if (42 == i) {
				int i_19_ = class527_sub38.readUnsignedByte();
				aByteArray7881 = new byte[i_19_];
				for (int i_20_ = 0; i_20_ < i_19_; i_20_++)
					aByteArray7881[i_20_] = class527_sub38.readByte();
			} else if (i == 44) {
				int i_21_ = class527_sub38.readUnsignedShort();
				int i_22_ = 0;
				for (int i_23_ = i_21_; i_23_ > 0; i_23_ >>= 1)
					i_22_++;
				aByteArray7884 = new byte[i_22_];
				byte i_24_ = 0;
				for (int i_25_ = 0; i_25_ < i_22_; i_25_++) {
					if ((i_21_ & 1 << i_25_) > 0) {
						aByteArray7884[i_25_] = i_24_;
						i_24_++;
					} else
						aByteArray7884[i_25_] = (byte) -1;
				}
			} else if (45 == i) {
				int i_26_ = class527_sub38.readUnsignedShort();
				int i_27_ = 0;
				for (int i_28_ = i_26_; i_28_ > 0; i_28_ >>= 1)
					i_27_++;
				aByteArray7885 = new byte[i_27_];
				byte i_29_ = 0;
				for (int i_30_ = 0; i_30_ < i_27_; i_30_++) {
					if ((i_26_ & 1 << i_30_) > 0) {
						aByteArray7885[i_30_] = i_29_;
						i_29_++;
					} else
						aByteArray7885[i_30_] = (byte) -1;
				}
			} else if (62 == i)
				aBool7931 = true;
			else if (64 == i)
				aBool7911 = false;
			else if (65 == i)
				anInt7876 = class527_sub38.readUnsignedShort() * 112917655;
			else if (i == 66)
				anInt7916 = class527_sub38.readUnsignedShort() * 427052873;
			else if (67 == i)
				anInt7917 = class527_sub38.readUnsignedShort() * -1637254973;
			else if (i == 69)
				class527_sub38.readUnsignedByte();
			else if (70 == i)
				anInt7918 = ((class527_sub38.readShort() << 2) * 393958559);
			else if (i == 71)
				anInt7886 = ((class527_sub38.readShort() << 2) * -411896285);
			else if (i == 72)
				anInt7920 = ((class527_sub38.readShort() << 2) * 366378575);
			else if (73 == i)
				aBool7924 = true;
			else if (i == 74)
				aBool7925 = true;
			else if (75 == i)
				anInt7872 = class527_sub38.readUnsignedByte() * 579945601;
			else if (77 == i || i == 92) {
				anInt7890 = class527_sub38.readUnsignedShort() * 902276345;
				if (65535 == anInt7890 * 715119945)
					anInt7890 = -902276345;
				anInt7930 = class527_sub38.readUnsignedShort() * -1031416697;
				if (65535 == anInt7930 * 700625207)
					anInt7930 = 1031416697;
				int i_31_ = -1;
				if (i == 92)
					i_31_ = class527_sub38.method16466(-1786838248);
				int i_32_ = class527_sub38.readUnsignedByte();
				anIntArray7929 = new int[2 + i_32_];
				for (int i_33_ = 0; i_33_ <= i_32_; i_33_++)
					anIntArray7929[i_33_] = class527_sub38.method16466(-1615050629);
				anIntArray7929[i_32_ + 1] = i_31_;
			} else if (78 == i) {
				anInt7944 = class527_sub38.readUnsignedShort() * 1239116859;
				anInt7932 = class527_sub38.readUnsignedByte() * -375334239;
			} else if (79 == i) {
				anInt7895 = class527_sub38.readUnsignedShort() * -552704331;
				anInt7936 = class527_sub38.readUnsignedShort() * 358931531;
				anInt7932 = class527_sub38.readUnsignedByte() * -375334239;
				int i_34_ = class527_sub38.readUnsignedByte();
				anIntArray7937 = new int[i_34_];
				for (int i_35_ = 0; i_35_ < i_34_; i_35_++)
					anIntArray7937[i_35_] = class527_sub38.readUnsignedShort();
			} else if (i == 81) {
				aByte7894 = (byte) 2;
				anInt7906 = class527_sub38.readUnsignedByte() * -637359360;
			} else if (82 == i)
				aBool7939 = true;
			else if (i == 88)
				aBool7940 = false;
			else if (89 == i)
				aBool7919 = false;
			else if (91 == i)
				aBool7951 = true;
			else if (93 == i) {
				aByte7894 = (byte) 3;
				anInt7906 = class527_sub38.readUnsignedShort() * 1188692651;
			} else if (94 == i)
				aByte7894 = (byte) 4;
			else if (i == 95) {
				aByte7894 = (byte) 5;
				anInt7906 = class527_sub38.readShort() * 1188692651;
			} else if (97 == i)
				aBool7910 = true;
			else if (98 == i)
				aBool7943 = true;
			else if (99 == i || 100 == i) {
				class527_sub38.readUnsignedByte();
				class527_sub38.readUnsignedShort();
			} else if (101 == i)
				anInt7877 = class527_sub38.readUnsignedByte() * 621693555;
			else if (i == 102)
				anInt7909 = class527_sub38.readUnsignedShort() * 617769307;
			else if (103 == i)
				anInt7897 = 0;
			else if (104 == i)
				anInt7934 = class527_sub38.readUnsignedByte() * -1088346297;
			else if (i == 105)
				aBool7912 = true;
			else if (106 == i) {
				int i_36_ = class527_sub38.readUnsignedByte();
				int i_37_ = 0;
				anIntArray7900 = new int[i_36_];
				anIntArray7901 = new int[i_36_];
				for (int i_38_ = 0; i_38_ < i_36_; i_38_++) {
					anIntArray7900[i_38_] = class527_sub38.method16466(-1677793636);
					i_37_ += anIntArray7901[i_38_] = class527_sub38.readUnsignedByte();
				}
				for (int i_39_ = 0; i_39_ < i_36_; i_39_++)
					anIntArray7901[i_39_] = anIntArray7901[i_39_] * 65535 / i_37_;
			} else if (107 == i)
				anInt7928 = class527_sub38.readUnsignedShort() * 2026548095;
			else if (i >= 150 && i < 155) {
				aStringArray7904[i - 150] = class527_sub38.readString(957965051).intern();
				if (!aClass601_7913.aBool7866)
					aStringArray7904[i - 150] = null;
			} else if (i == 160) {
				int i_40_ = class527_sub38.readUnsignedByte();
				anIntArray7880 = new int[i_40_];
				for (int i_41_ = 0; i_41_ < i_40_; i_41_++)
					anIntArray7880[i_41_] = class527_sub38.readUnsignedShort();
			} else if (i == 162) {
				aByte7894 = (byte) 3;
				anInt7906 = class527_sub38.readInt() * 1188692651;
			} else if (163 == i) {
				aByte7914 = class527_sub38.readByte();
				aByte7887 = class527_sub38.readByte();
				aByte7888 = class527_sub38.readByte();
				aByte7889 = class527_sub38.readByte();
			} else if (i == 164)
				anInt7921 = class527_sub38.readShort() * -106084859;
			else if (i == 165)
				anInt7922 = class527_sub38.readShort() * 1494689561;
			else if (i == 166)
				anInt7915 = class527_sub38.readShort() * 890213121;
			else if (i == 167)
				anInt7927 = class527_sub38.readUnsignedShort() * -1362738813;
			else if (168 != i && 169 != i) {
				if (170 == i)
					anInt7926 = (class527_sub38.readUnsignedSmart((byte) -104) * -1807639681);
				else if (171 == i)
					anInt7899 = class527_sub38.readUnsignedSmart((byte) -10) * -689509155;
				else if (i == 173) {
					anInt7945 = class527_sub38.readUnsignedShort() * -1513037067;
					anInt7946 = class527_sub38.readUnsignedShort() * -1429993567;
				} else if (i == 177)
					aBool7947 = true;
				else if (178 == i)
					anInt7933 = class527_sub38.readUnsignedByte() * -833850889;
				else if (186 == i)
					aClass593_7949 = ((Class593) Class26.method858(Class144_Sub1.method14512(-2087285631), class527_sub38.readUnsignedByte(), -49969849));
				else if (188 != i) {
					if (i == 189)
						aBool7948 = true;
					else if (i >= 190 && i < 196) {
						if (anIntArray7907 == null) {
							anIntArray7907 = new int[6];
							Arrays.fill(anIntArray7907, -1);
						}
						anIntArray7907[i - 190] = class527_sub38.readUnsignedShort();
					} else if (196 == i)
						Class26.method858(Class208.method3858(51905236), class527_sub38.readUnsignedByte(), -2090164735);
					else if (197 == i)
						Class26.method858(Class321.method5697((byte) 6), class527_sub38.readUnsignedByte(), 210021953);
					else if (i != 198 && i != 199) {
						if (i == 200)
							aBool7902 = true;
						else if (i == 201) {
							aClass439_7950 = new Class439();
							aClass439_7950.aFloat4894 = (float) class527_sub38.readSmartVariant(983912765);
							aClass439_7950.aFloat4891 = (float) class527_sub38.readSmartVariant(983912765);
							aClass439_7950.aFloat4892 = (float) class527_sub38.readSmartVariant(983912765);
							aClass439_7950.aFloat4893 = (float) class527_sub38.readSmartVariant(983912765);
							aClass439_7950.aFloat4890 = (float) class527_sub38.readSmartVariant(983912765);
							aClass439_7950.aFloat4895 = (float) class527_sub38.readSmartVariant(983912765);
						} else if (i == 249) {
							int i_42_ = class527_sub38.readUnsignedByte();
							if (null == aClass14_7942) {
								int i_43_ = Class186.method3652(i_42_, -2074465056);
								aClass14_7942 = new Class14(i_43_);
							}
							for (int i_44_ = 0; i_44_ < i_42_; i_44_++) {
								boolean bool = (class527_sub38.readUnsignedByte() == 1);
								int i_45_ = class527_sub38.read24BitUnsignedInteger(156715291);
								Class527 class527;
								if (bool)
									class527 = new Class527_Sub26(class527_sub38.readString(1592610255).intern());
								else
									class527 = new Node_Sub6(class527_sub38.readInt());
								aClass14_7942.method714(class527, (long) i_45_);
							}
						}
					}
				}
			}
		}
	}

	void method9957(byte i) {
		if (-1 == anInt7898 * -1508648055) {
			anInt7898 = 0;
			if (null != aByteArray7878 && 1 == aByteArray7878.length && (aByteArray7878[0] == Class596.aClass596_7823.anInt7844 * -1736797763))
				anInt7898 = 414911161;
			for (int i_46_ = 0; i_46_ < 5; i_46_++) {
				if (aStringArray7904[i_46_] != null) {
					anInt7898 = 414911161;
					break;
				}
			}
		}
		if (-1 == anInt7872 * 1302526849)
			anInt7872 = (177265375 * anInt7892 != 0 ? 1 : 0) * 579945601;
		if (method9974(-1080894671) || aBool7943 || anIntArray7929 != null)
			aBool7947 = true;
		if (-1508648055 * anInt7898 <= 0 && Class593.aClass593_7800 != aClass593_7949) {
			/* empty */
		}
	}

	public final boolean method9958(int i, int i_47_) {
		if (anIntArrayArray7923 == null)
			return true;
		boolean bool = true;
		for (int i_48_ = 0; i_48_ < aByteArray7878.length; i_48_++) {
			if (i == aByteArray7878[i_48_]) {
				for (int i_49_ = 0; i_49_ < anIntArrayArray7923[i_48_].length; i_49_++) {
					if (!aClass601_7913.method9934((anIntArrayArray7923[i_48_][i_49_]), (byte) -41))
						bool = false;
				}
			}
		}
		return bool;
	}

	public boolean method9959(int i) {
		if (anIntArray7900 != null && -1 != i) {
			for (int i_50_ = 0; i_50_ < anIntArray7900.length; i_50_++) {
				if (i == anIntArray7900[i_50_])
					return true;
			}
		}
		return false;
	}

	public final synchronized Class20 method9960(Class180 class180, int i, int i_51_, int i_52_, Class161 class161, Class161 class161_53_, int i_54_, int i_55_, int i_56_, boolean bool, Class599 class599, int i_57_) {
		if (Class191.method3687(i_51_, 1820568680))
			i_51_ = -1736797763 * Class596.aClass596_7825.anInt7844;
		long l = (long) ((i_51_ << 3) + (-320331677 * anInt7873 << 10) + i_52_);
		l |= (long) (class180.anInt2064 * -397006101 << 29);
		if (null != class599)
			l |= -4233498556259136701L * class599.aLong7855 << 32;
		int i_58_ = i;
		if (3 == aByte7894)
			i_58_ |= 0x7;
		else {
			if (aByte7894 != 0 || 0 != 686376233 * anInt7922)
				i_58_ |= 0x2;
			if (anInt7921 * -1311205683 != 0)
				i_58_ |= 0x1;
			if (anInt7915 * 240741633 != 0)
				i_58_ |= 0x4;
		}
		if (bool)
			i_58_ |= 0x40000;
		boolean bool_59_ = 0 != aByte7894 && (class161 != null || null != class161_53_);
		boolean bool_60_ = (0 != -1311205683 * anInt7921 || 0 != 686376233 * anInt7922 || 0 != 240741633 * anInt7915);
		Class20 class20;
		synchronized (aClass601_7913.aClass205_7865) {
			class20 = (Class20) aClass601_7913.aClass205_7865.method3787(l);
		}
		Class176 class176 = (Class176) (null != class20 ? class20.anObject205 : null);
		Class527_Sub8_Sub8 class527_sub8_sub8 = null;
		if (null == class176 || class180.method3175(class176.method2874(), i_58_) != 0) {
			if (class176 != null)
				i_58_ = class180.method3176(i_58_, class176.method2874());
			int i_61_ = i_58_;
			if (i_51_ == -1736797763 * Class596.aClass596_7823.anInt7844 && i_52_ > 3)
				i_61_ |= 0x5;
			class176 = method9961(class180, i_61_, i_51_, i_52_, class599, (byte) -49);
			if (null == class176)
				return null;
			if (-1736797763 * Class596.aClass596_7823.anInt7844 == i_51_ && i_52_ > 3)
				class176.method2911(2048);
			if (bool && !bool_59_ && !bool_60_)
				class527_sub8_sub8 = class176.method2891(null);
			class176.method2941(i_58_);
			class20 = new Class20(class176, class527_sub8_sub8);
			synchronized (aClass601_7913.aClass205_7865) {
				aClass601_7913.aClass205_7865.method3790(class20, l);
			}
		} else {
			class527_sub8_sub8 = (Class527_Sub8_Sub8) class20.anObject204;
			if (bool && null == class527_sub8_sub8 && !bool_59_ && !bool_60_)
				class527_sub8_sub8 = (Class527_Sub8_Sub8) (class20.anObject204 = class176.method2891(null));
		}
		if (bool_59_ || bool_60_) {
			class176 = class176.method2862((byte) 0, i_58_, true);
			if (bool_59_)
				class176.method2873(aByte7894, 588638211 * anInt7906, class161, class161_53_, i_54_, i_55_, i_56_);
			if (bool_60_)
				class176.method3015(-1311205683 * anInt7921, 686376233 * anInt7922, anInt7915 * 240741633);
			if (bool)
				class527_sub8_sub8 = class176.method2891(null);
			class176.method2941(i);
		} else
			class176 = class176.method2862((byte) 0, i, true);
		aClass601_7913.aClass20_7870.anObject205 = class176;
		aClass601_7913.aClass20_7870.anObject204 = class527_sub8_sub8;
		return aClass601_7913.aClass20_7870;
	}

	Class176 method9961(Class180 class180, int i, int i_62_, int i_63_, Class599 class599, byte i_64_) {
		int i_65_ = -905260521 * anInt7938 + 64;
		int i_66_ = 850 + anInt7905 * 907324207;
		int i_67_ = i;
		boolean bool = (aBool7931 || (i_62_ == -1736797763 * Class596.aClass596_7822.anInt7844 && i_63_ > 3));
		if (bool)
			i |= 0x10;
		if (0 == i_63_) {
			if (128 != anInt7876 * -1495776473 || 0 != anInt7918 * -1391671457)
				i |= 0x1;
			if (128 != 2098132971 * anInt7917 || 0 != anInt7920 * 1025759407)
				i |= 0x4;
		} else
			i |= 0xd;
		if (128 != anInt7916 * -1121070343 || 0 != 1709205899 * anInt7886)
			i |= 0x2;
		if (aShortArray7879 != null)
			i |= 0x4000;
		if (aShortArray7882 != null)
			i |= 0x8000;
		if (0 != aByte7889)
			i |= 0x80000;
		Class176 class176 = null;
		if (null != aByteArray7878) {
			int i_68_ = -1;
			for (int i_69_ = 0; i_69_ < aByteArray7878.length; i_69_++) {
				if (i_62_ == aByteArray7878[i_69_]) {
					i_68_ = i_69_;
					break;
				}
			}
			if (i_68_ == -1)
				return null;
			int[] is = (null != class599 && class599.anIntArray7853 != null ? class599.anIntArray7853 : anIntArrayArray7923[i_68_]);
			int i_70_ = is.length;
			if (i_70_ > 0) {
				long l = (long) (class180.anInt2064 * -397006101);
				for (int i_71_ = 0; i_71_ < i_70_; i_71_++)
					l = 67783L * l + (long) is[i_71_];
				synchronized (aClass601_7913.aClass205_7864) {
					class176 = ((Class176) aClass601_7913.aClass205_7864.method3787(l));
				}
				if (null != class176) {
					if (i_65_ != class176.method2929())
						i |= 0x1000;
					if (i_66_ != class176.method2905())
						i |= 0x2000;
				}
				if (class176 == null || class180.method3175(class176.method2874(), i) != 0) {
					int i_72_ = i | 0x1f01f;
					if (class176 != null)
						i_72_ = class180.method3176(i_72_, class176.method2874());
					Class175 class175 = null;
					synchronized (aClass601_7913.aClass175Array7869) {
						for (int i_73_ = 0; i_73_ < i_70_; i_73_++) {
							byte[] is_74_ = aClass601_7913.method9933(is[i_73_], 1740499431);
							if (null == is_74_) {
								Class176 class176_75_ = null;
								return class176_75_;
							}
							class175 = new Class175(is_74_);
							if (class175.anInt1905 < 13)
								class175.method2829(2);
							if (i_70_ > 1)
								aClass601_7913.aClass175Array7869[i_73_] = class175;
						}
						if (i_70_ > 1)
							class175 = new Class175((aClass601_7913.aClass175Array7869), i_70_);
					}
					class176 = class180.method3376(class175, i_72_, (-1376978533 * aClass601_7913.anInt7867), i_65_, i_66_);
					synchronized (aClass601_7913.aClass205_7864) {
						aClass601_7913.aClass205_7864.method3790(class176, l);
					}
				}
			}
		}
		if (null == class176)
			return null;
		Class176 class176_76_ = class176.method2862((byte) 0, i, true);
		if (i_65_ != class176.method2929())
			class176_76_.method3019(i_65_);
		if (i_66_ != class176.method2905())
			class176_76_.method2903(i_66_);
		if (bool)
			class176_76_.method2864();
		if (i_62_ == -1736797763 * Class596.aClass596_7825.anInt7844 && i_63_ > 3) {
			class176_76_.method2867(2048);
			class176_76_.method3015(180, 0, -180);
		}
		i_63_ &= 0x3;
		if (i_63_ == 1)
			class176_76_.method2867(4096);
		else if (i_63_ == 2)
			class176_76_.method2867(8192);
		else if (3 == i_63_)
			class176_76_.method2867(12288);
		if (aShortArray7879 != null) {
			short[] is;
			if (null != class599 && null != class599.aShortArray7856)
				is = class599.aShortArray7856;
			else
				is = aShortArray7893;
			for (int i_77_ = 0; i_77_ < aShortArray7879.length; i_77_++) {
				if (null != aByteArray7881 && i_77_ < aByteArray7881.length)
					class176_76_.method2907(aShortArray7879[i_77_], (aShortArray7935[aByteArray7881[i_77_] & 0xff]));
				else
					class176_76_.method2907(aShortArray7879[i_77_], is[i_77_]);
			}
		}
		if (aShortArray7882 != null) {
			short[] is;
			if (class599 != null && class599.aShortArray7854 != null)
				is = class599.aShortArray7854;
			else
				is = aShortArray7883;
			for (int i_78_ = 0; i_78_ < aShortArray7882.length; i_78_++)
				class176_76_.method2909(aShortArray7882[i_78_], is[i_78_]);
		}
		if (0 != aByte7889)
			class176_76_.method2986(aByte7914, aByte7887, aByte7888, aByte7889 & 0xff);
		if (128 != anInt7876 * -1495776473 || -1121070343 * anInt7916 != 128 || 128 != anInt7917 * 2098132971)
			class176_76_.method2872(anInt7876 * -1495776473, anInt7916 * -1121070343, anInt7917 * 2098132971);
		if (0 != -1391671457 * anInt7918 || 0 != anInt7886 * 1709205899 || 0 != 1025759407 * anInt7920)
			class176_76_.method3015(-1391671457 * anInt7918, 1709205899 * anInt7886, 1025759407 * anInt7920);
		class176_76_.method2941(i_67_);
		return class176_76_;
	}

	public final Class602 method9962(Interface20 interface20, Interface18 interface18, int i) {
		int i_79_ = -1;
		if (anInt7890 * 715119945 != -1) {
			Class333 class333 = interface20.method123(715119945 * anInt7890, 1710025921);
			if (null != class333)
				i_79_ = interface18.method100(class333, (short) -23717);
		} else if (700625207 * anInt7930 != -1) {
			Class160 class160 = interface20.method125(Class465.aClass465_5313, anInt7930 * 700625207, -1929398865);
			if (class160 != null)
				i_79_ = interface18.method101(class160, 1096407173);
		}
		if (i_79_ < 0 || i_79_ >= anIntArray7929.length - 1) {
			int i_80_ = anIntArray7929[anIntArray7929.length - 1];
			if (-1 != i_80_)
				return ((Class602) anInterface13_7875.method81(i_80_, -518632768));
			return null;
		}
		if (-1 == anIntArray7929[i_79_])
			return null;
		return (Class602) anInterface13_7875.method81(anIntArray7929[i_79_], -372305461);
	}

	public int method9963(int i, int i_81_, byte i_82_) {
		if (aClass14_7942 == null)
			return i_81_;
		Node_Sub6 class527_sub7 = (Node_Sub6) aClass14_7942.method709((long) i);
		if (class527_sub7 == null)
			return i_81_;
		return -78845949 * class527_sub7.anInt10398;
	}

	public int method9964(byte i) {
		if (null != anIntArray7900) {
			if (anIntArray7900.length > 1) {
				int i_83_ = (int) (Math.random() * 65535.0);
				for (int i_84_ = 0; i_84_ < anIntArray7900.length; i_84_++) {
					if (i_83_ <= anIntArray7901[i_84_])
						return anIntArray7900[i_84_];
					i_83_ -= anIntArray7901[i_84_];
				}
			} else
				return anIntArray7900[0];
		}
		return -1;
	}

	public boolean method9965(int i) {
		if (null == anIntArray7929)
			return -1 != anInt7944 * 1075350771 || null != anIntArray7937;
		for (int i_85_ = 0; i_85_ < anIntArray7929.length; i_85_++) {
			if (-1 != anIntArray7929[i_85_]) {
				Class602 class602_86_ = ((Class602) anInterface13_7875.method81(anIntArray7929[i_85_], -1053878798));
				if (1075350771 * class602_86_.anInt7944 != -1 || class602_86_.anIntArray7937 != null)
					return true;
			}
		}
		return false;
	}

	public boolean method9966(int i, byte i_87_) {
		if (anIntArray7900 != null && -1 != i) {
			for (int i_88_ = 0; i_88_ < anIntArray7900.length; i_88_++) {
				if (i == anIntArray7900[i_88_])
					return true;
			}
		}
		return false;
	}

	Class602(int i, Class601 class601, Interface13 interface13) {
		anInt7874 = 710174003;
		anInt7891 = -714977777;
		anInt7892 = 78823998;
		anInt7898 = -414911161;
		aByte7894 = (byte) 0;
		anInt7906 = -1188692651;
		aBool7896 = false;
		anInt7897 = -1744638697;
		anInt7926 = -167306176;
		anInt7899 = 0;
		anIntArray7900 = null;
		anIntArray7901 = null;
		aBool7902 = false;
		anInt7903 = -1772716992;
		anInt7938 = 0;
		anInt7905 = 0;
		anInt7928 = -2026548095;
		anInt7909 = -617769307;
		aBool7910 = false;
		anInt7877 = 0;
		aBool7912 = false;
		aBool7931 = false;
		aBool7911 = true;
		anInt7876 = 1568557952;
		anInt7916 = -1171807104;
		anInt7917 = 884760960;
		anInt7918 = 0;
		anInt7886 = 0;
		anInt7920 = 0;
		anInt7921 = 0;
		anInt7922 = 0;
		anInt7915 = 0;
		aBool7924 = false;
		aBool7925 = false;
		anInt7872 = -579945601;
		anInt7927 = 0;
		anInt7890 = -902276345;
		anInt7930 = 1031416697;
		anInt7944 = -1239116859;
		anInt7932 = 0;
		anInt7933 = 0;
		anInt7934 = 1644568505;
		anInt7895 = 0;
		anInt7936 = 0;
		aBool7919 = true;
		aBool7939 = false;
		aBool7940 = true;
		aBool7951 = false;
		aBool7943 = false;
		anInt7945 = -790432512;
		anInt7946 = -1006132992;
		aBool7947 = false;
		aBool7948 = false;
		aClass593_7949 = Class593.aClass593_7801;
		anInt7873 = 271802699 * i;
		aClass601_7913 = class601;
		anInterface13_7875 = interface13;
		aStringArray7904 = (String[]) aClass601_7913.aStringArray7863.clone();
	}

	public int method9967(int i, int i_89_) {
		if (aClass14_7942 == null)
			return i_89_;
		Node_Sub6 class527_sub7 = (Node_Sub6) aClass14_7942.method709((long) i);
		if (class527_sub7 == null)
			return i_89_;
		return -78845949 * class527_sub7.anInt10398;
	}

	public final boolean method9968(Class645 class645, int i) {
		if (null == anIntArrayArray7923)
			return true;
		boolean bool = true;
		for (int i_90_ = 0; i_90_ < anIntArrayArray7923.length; i_90_++) {
			for (int i_91_ = 0; i_91_ < anIntArrayArray7923[i_90_].length; i_91_++) {
				boolean bool_92_ = aClass601_7913.method9934((anIntArrayArray7923[i_90_][i_91_]), (byte) -127);
				bool &= bool_92_;
				if (!bool_92_)
					class645.anInt8348 = anIntArrayArray7923[i_90_][i_91_] * 1626444987;
			}
		}
		return bool;
	}

	public final boolean method9969(int i) {
		if (anIntArrayArray7923 == null)
			return true;
		boolean bool = true;
		for (int i_93_ = 0; i_93_ < aByteArray7878.length; i_93_++) {
			if (i == aByteArray7878[i_93_]) {
				for (int i_94_ = 0; i_94_ < anIntArrayArray7923[i_93_].length; i_94_++) {
					if (!aClass601_7913.method9934((anIntArrayArray7923[i_93_][i_94_]), (byte) -95))
						bool = false;
				}
			}
		}
		return bool;
	}

	void method9970(RSByteBuffer class527_sub38, int i) {
		if (1 == i) {
			int i_95_ = class527_sub38.readUnsignedByte();
			aByteArray7878 = new byte[i_95_];
			anIntArrayArray7923 = new int[i_95_][];
			for (int i_96_ = 0; i_96_ < i_95_; i_96_++) {
				aByteArray7878[i_96_] = class527_sub38.readByte();
				int i_97_ = class527_sub38.readUnsignedByte();
				anIntArrayArray7923[i_96_] = new int[i_97_];
				for (int i_98_ = 0; i_98_ < i_97_; i_98_++)
					anIntArrayArray7923[i_96_][i_98_] = class527_sub38.method16466(-2090878523);
			}
		} else if (2 == i)
			aString7871 = class527_sub38.readString(1434833843).intern();
		else if (14 == i)
			anInt7874 = class527_sub38.readUnsignedByte() * 710174003;
		else if (15 == i)
			anInt7891 = class527_sub38.readUnsignedByte() * -714977777;
		else if (i == 17)
			anInt7892 = 0;
		else if (i != 18) {
			if (19 == i)
				anInt7898 = class527_sub38.readUnsignedByte() * 414911161;
			else if (i == 21)
				aByte7894 = (byte) 1;
			else if (22 == i)
				aBool7896 = true;
			else if (i == 23)
				anInt7897 = 1744638697;
			else if (i == 24) {
				int i_99_ = class527_sub38.method16466(-1996926019);
				if (-1 != i_99_)
					anIntArray7900 = new int[] { i_99_ };
			} else if (i == 27)
				anInt7892 = 39411999;
			else if (28 == i)
				anInt7903 = ((class527_sub38.readUnsignedByte() << 2) * 1448696305);
			else if (29 == i)
				anInt7938 = class527_sub38.readByte() * -529693273;
			else if (i == 39)
				anInt7905 = class527_sub38.readByte() * -344954101;
			else if (i >= 30 && i < 35)
				aStringArray7904[i - 30] = class527_sub38.readString(927936212).intern();
			else if (i == 40) {
				int i_100_ = class527_sub38.readUnsignedByte();
				aShortArray7879 = new short[i_100_];
				aShortArray7893 = new short[i_100_];
				for (int i_101_ = 0; i_101_ < i_100_; i_101_++) {
					aShortArray7879[i_101_] = (short) class527_sub38.readUnsignedShort();
					aShortArray7893[i_101_] = (short) class527_sub38.readUnsignedShort();
				}
			} else if (41 == i) {
				int i_102_ = class527_sub38.readUnsignedByte();
				aShortArray7882 = new short[i_102_];
				aShortArray7883 = new short[i_102_];
				for (int i_103_ = 0; i_103_ < i_102_; i_103_++) {
					aShortArray7882[i_103_] = (short) class527_sub38.readUnsignedShort();
					aShortArray7883[i_103_] = (short) class527_sub38.readUnsignedShort();
				}
			} else if (42 == i) {
				int i_104_ = class527_sub38.readUnsignedByte();
				aByteArray7881 = new byte[i_104_];
				for (int i_105_ = 0; i_105_ < i_104_; i_105_++)
					aByteArray7881[i_105_] = class527_sub38.readByte();
			} else if (i == 44) {
				int i_106_ = class527_sub38.readUnsignedShort();
				int i_107_ = 0;
				for (int i_108_ = i_106_; i_108_ > 0; i_108_ >>= 1)
					i_107_++;
				aByteArray7884 = new byte[i_107_];
				byte i_109_ = 0;
				for (int i_110_ = 0; i_110_ < i_107_; i_110_++) {
					if ((i_106_ & 1 << i_110_) > 0) {
						aByteArray7884[i_110_] = i_109_;
						i_109_++;
					} else
						aByteArray7884[i_110_] = (byte) -1;
				}
			} else if (45 == i) {
				int i_111_ = class527_sub38.readUnsignedShort();
				int i_112_ = 0;
				for (int i_113_ = i_111_; i_113_ > 0; i_113_ >>= 1)
					i_112_++;
				aByteArray7885 = new byte[i_112_];
				byte i_114_ = 0;
				for (int i_115_ = 0; i_115_ < i_112_; i_115_++) {
					if ((i_111_ & 1 << i_115_) > 0) {
						aByteArray7885[i_115_] = i_114_;
						i_114_++;
					} else
						aByteArray7885[i_115_] = (byte) -1;
				}
			} else if (62 == i)
				aBool7931 = true;
			else if (64 == i)
				aBool7911 = false;
			else if (65 == i)
				anInt7876 = class527_sub38.readUnsignedShort() * 112917655;
			else if (i == 66)
				anInt7916 = class527_sub38.readUnsignedShort() * 427052873;
			else if (67 == i)
				anInt7917 = class527_sub38.readUnsignedShort() * -1637254973;
			else if (i == 69)
				class527_sub38.readUnsignedByte();
			else if (70 == i)
				anInt7918 = (class527_sub38.readShort() << 2) * 393958559;
			else if (i == 71)
				anInt7886 = ((class527_sub38.readShort() << 2) * -411896285);
			else if (i == 72)
				anInt7920 = ((class527_sub38.readShort() << 2) * 366378575);
			else if (73 == i)
				aBool7924 = true;
			else if (i == 74)
				aBool7925 = true;
			else if (75 == i)
				anInt7872 = class527_sub38.readUnsignedByte() * 579945601;
			else if (77 == i || i == 92) {
				anInt7890 = class527_sub38.readUnsignedShort() * 902276345;
				if (65535 == anInt7890 * 715119945)
					anInt7890 = -902276345;
				anInt7930 = class527_sub38.readUnsignedShort() * -1031416697;
				if (65535 == anInt7930 * 700625207)
					anInt7930 = 1031416697;
				int i_116_ = -1;
				if (i == 92)
					i_116_ = class527_sub38.method16466(-1767744346);
				int i_117_ = class527_sub38.readUnsignedByte();
				anIntArray7929 = new int[2 + i_117_];
				for (int i_118_ = 0; i_118_ <= i_117_; i_118_++)
					anIntArray7929[i_118_] = class527_sub38.method16466(-2074881437);
				anIntArray7929[i_117_ + 1] = i_116_;
			} else if (78 == i) {
				anInt7944 = class527_sub38.readUnsignedShort() * 1239116859;
				anInt7932 = class527_sub38.readUnsignedByte() * -375334239;
			} else if (79 == i) {
				anInt7895 = class527_sub38.readUnsignedShort() * -552704331;
				anInt7936 = class527_sub38.readUnsignedShort() * 358931531;
				anInt7932 = class527_sub38.readUnsignedByte() * -375334239;
				int i_119_ = class527_sub38.readUnsignedByte();
				anIntArray7937 = new int[i_119_];
				for (int i_120_ = 0; i_120_ < i_119_; i_120_++)
					anIntArray7937[i_120_] = class527_sub38.readUnsignedShort();
			} else if (i == 81) {
				aByte7894 = (byte) 2;
				anInt7906 = class527_sub38.readUnsignedByte() * -637359360;
			} else if (82 == i)
				aBool7939 = true;
			else if (i == 88)
				aBool7940 = false;
			else if (89 == i)
				aBool7919 = false;
			else if (91 == i)
				aBool7951 = true;
			else if (93 == i) {
				aByte7894 = (byte) 3;
				anInt7906 = class527_sub38.readUnsignedShort() * 1188692651;
			} else if (94 == i)
				aByte7894 = (byte) 4;
			else if (i == 95) {
				aByte7894 = (byte) 5;
				anInt7906 = class527_sub38.readShort() * 1188692651;
			} else if (97 == i)
				aBool7910 = true;
			else if (98 == i)
				aBool7943 = true;
			else if (99 == i || 100 == i) {
				class527_sub38.readUnsignedByte();
				class527_sub38.readUnsignedShort();
			} else if (101 == i)
				anInt7877 = class527_sub38.readUnsignedByte() * 621693555;
			else if (i == 102)
				anInt7909 = class527_sub38.readUnsignedShort() * 617769307;
			else if (103 == i)
				anInt7897 = 0;
			else if (104 == i)
				anInt7934 = class527_sub38.readUnsignedByte() * -1088346297;
			else if (i == 105)
				aBool7912 = true;
			else if (106 == i) {
				int i_121_ = class527_sub38.readUnsignedByte();
				int i_122_ = 0;
				anIntArray7900 = new int[i_121_];
				anIntArray7901 = new int[i_121_];
				for (int i_123_ = 0; i_123_ < i_121_; i_123_++) {
					anIntArray7900[i_123_] = class527_sub38.method16466(-1822730190);
					i_122_ += anIntArray7901[i_123_] = class527_sub38.readUnsignedByte();
				}
				for (int i_124_ = 0; i_124_ < i_121_; i_124_++)
					anIntArray7901[i_124_] = anIntArray7901[i_124_] * 65535 / i_122_;
			} else if (107 == i)
				anInt7928 = class527_sub38.readUnsignedShort() * 2026548095;
			else if (i >= 150 && i < 155) {
				aStringArray7904[i - 150] = class527_sub38.readString(943629255).intern();
				if (!aClass601_7913.aBool7866)
					aStringArray7904[i - 150] = null;
			} else if (i == 160) {
				int i_125_ = class527_sub38.readUnsignedByte();
				anIntArray7880 = new int[i_125_];
				for (int i_126_ = 0; i_126_ < i_125_; i_126_++)
					anIntArray7880[i_126_] = class527_sub38.readUnsignedShort();
			} else if (i == 162) {
				aByte7894 = (byte) 3;
				anInt7906 = class527_sub38.readInt() * 1188692651;
			} else if (163 == i) {
				aByte7914 = class527_sub38.readByte();
				aByte7887 = class527_sub38.readByte();
				aByte7888 = class527_sub38.readByte();
				aByte7889 = class527_sub38.readByte();
			} else if (i == 164)
				anInt7921 = class527_sub38.readShort() * -106084859;
			else if (i == 165)
				anInt7922 = class527_sub38.readShort() * 1494689561;
			else if (i == 166)
				anInt7915 = class527_sub38.readShort() * 890213121;
			else if (i == 167)
				anInt7927 = class527_sub38.readUnsignedShort() * -1362738813;
			else if (168 != i && 169 != i) {
				if (170 == i)
					anInt7926 = class527_sub38.readUnsignedSmart((byte) -54) * -1807639681;
				else if (171 == i)
					anInt7899 = class527_sub38.readUnsignedSmart((byte) -3) * -689509155;
				else if (i == 173) {
					anInt7945 = class527_sub38.readUnsignedShort() * -1513037067;
					anInt7946 = class527_sub38.readUnsignedShort() * -1429993567;
				} else if (i == 177)
					aBool7947 = true;
				else if (178 == i)
					anInt7933 = class527_sub38.readUnsignedByte() * -833850889;
				else if (186 == i)
					aClass593_7949 = ((Class593) Class26.method858(Class144_Sub1.method14512(-1035019670), class527_sub38.readUnsignedByte(), -1771300894));
				else if (188 != i) {
					if (i == 189)
						aBool7948 = true;
					else if (i >= 190 && i < 196) {
						if (anIntArray7907 == null) {
							anIntArray7907 = new int[6];
							Arrays.fill(anIntArray7907, -1);
						}
						anIntArray7907[i - 190] = class527_sub38.readUnsignedShort();
					} else if (196 == i)
						Class26.method858(Class208.method3858(51905236), class527_sub38.readUnsignedByte(), 1294000296);
					else if (197 == i)
						Class26.method858(Class321.method5697((byte) 6), class527_sub38.readUnsignedByte(), -1030233457);
					else if (i != 198 && i != 199) {
						if (i == 200)
							aBool7902 = true;
						else if (i == 201) {
							aClass439_7950 = new Class439();
							aClass439_7950.aFloat4894 = (float) class527_sub38.readSmartVariant(983912765);
							aClass439_7950.aFloat4891 = (float) class527_sub38.readSmartVariant(983912765);
							aClass439_7950.aFloat4892 = (float) class527_sub38.readSmartVariant(983912765);
							aClass439_7950.aFloat4893 = (float) class527_sub38.readSmartVariant(983912765);
							aClass439_7950.aFloat4890 = (float) class527_sub38.readSmartVariant(983912765);
							aClass439_7950.aFloat4895 = (float) class527_sub38.readSmartVariant(983912765);
						} else if (i == 249) {
							int i_127_ = class527_sub38.readUnsignedByte();
							if (null == aClass14_7942) {
								int i_128_ = Class186.method3652(i_127_, -1800222867);
								aClass14_7942 = new Class14(i_128_);
							}
							for (int i_129_ = 0; i_129_ < i_127_; i_129_++) {
								boolean bool = (class527_sub38.readUnsignedByte() == 1);
								int i_130_ = class527_sub38.read24BitUnsignedInteger(1929642241);
								Class527 class527;
								if (bool)
									class527 = new Class527_Sub26(class527_sub38.readString(1039595038).intern());
								else
									class527 = new Node_Sub6(class527_sub38.readInt());
								aClass14_7942.method714(class527, (long) i_130_);
							}
						}
					}
				}
			}
		}
	}

	public final synchronized Class176 method9971(Class180 class180, int i, int i_131_, int i_132_, Class161 class161, Class161 class161_133_, int i_134_, int i_135_, int i_136_, Class695 class695, Class599 class599) {
		if (Class191.method3687(i_131_, 1369668888))
			i_131_ = -1736797763 * Class596.aClass596_7825.anInt7844;
		long l = (long) (i_132_ + ((anInt7873 * -320331677 << 10) + (i_131_ << 3)));
		int i_137_ = i;
		l |= (long) (-397006101 * class180.anInt2064 << 29);
		if (null != class599)
			l |= class599.aLong7855 * -4233498556259136701L << 32;
		if (class695 != null)
			i |= class695.method14174(-822649352);
		if (aByte7894 == 3)
			i |= 0x7;
		else {
			if (aByte7894 != 0 || 0 != anInt7922 * 686376233)
				i |= 0x2;
			if (0 != anInt7921 * -1311205683)
				i |= 0x1;
			if (0 != anInt7915 * 240741633)
				i |= 0x4;
		}
		if (i_131_ == -1736797763 * Class596.aClass596_7823.anInt7844 && i_132_ > 3)
			i |= 0x5;
		Class176 class176;
		synchronized (aClass601_7913.aClass205_7868) {
			class176 = (Class176) aClass601_7913.aClass205_7868.method3787(l);
		}
		if (class176 == null || class180.method3175(class176.method2874(), i) != 0) {
			if (null != class176)
				i = class180.method3176(i, class176.method2874());
			class176 = method9961(class180, i, i_131_, i_132_, class599, (byte) 99);
			if (class176 == null)
				return null;
			synchronized (aClass601_7913.aClass205_7868) {
				aClass601_7913.aClass205_7868.method3790(class176, l);
			}
		}
		boolean bool = false;
		if (null != class695) {
			class176 = class176.method2862((byte) 1, i, true);
			bool = true;
			class695.method14175(class176, i_132_ & 0x3, (byte) 0);
		}
		if (Class596.aClass596_7823.anInt7844 * -1736797763 == i_131_ && i_132_ > 3) {
			if (!bool) {
				class176 = class176.method2862((byte) 3, i, true);
				bool = true;
			}
			class176.method2911(2048);
		}
		if (aByte7894 != 0) {
			if (!bool) {
				class176 = class176.method2862((byte) 3, i, true);
				bool = true;
			}
			class176.method2873(aByte7894, 588638211 * anInt7906, class161, class161_133_, i_134_, i_135_, i_136_);
		}
		if (-1311205683 * anInt7921 != 0 || 686376233 * anInt7922 != 0 || 0 != anInt7915 * 240741633) {
			if (!bool) {
				class176 = class176.method2862((byte) 3, i, true);
				bool = true;
			}
			class176.method3015(anInt7921 * -1311205683, 686376233 * anInt7922, anInt7915 * 240741633);
		}
		if (bool)
			class176.method2941(i_137_);
		return class176;
	}

	public void method83(RSByteBuffer class527_sub38) {
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			if (0 == i)
				break;
			method9956(class527_sub38, i, -271174943);
		}
	}

	public void method73(RSByteBuffer class527_sub38) {
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			if (0 == i)
				break;
			method9956(class527_sub38, i, 953269079);
		}
	}

	public void method85() {
		method9957((byte) 3);
		if (aBool7925)
			anInt7892 = 0;
		if (!aClass601_7913.aBool7866 && aBool7951) {
			aStringArray7904 = null;
			anIntArray7880 = null;
		}
	}

	public void method84() {
		method9957((byte) 3);
		if (aBool7925)
			anInt7892 = 0;
		if (!aClass601_7913.aBool7866 && aBool7951) {
			aStringArray7904 = null;
			anIntArray7880 = null;
		}
	}

	public final synchronized Class20 method9972(Class180 class180, int i, int i_138_, int i_139_, Class161 class161, Class161 class161_140_, int i_141_, int i_142_, int i_143_, boolean bool, Class599 class599) {
		if (Class191.method3687(i_138_, 1429797850))
			i_138_ = -1736797763 * Class596.aClass596_7825.anInt7844;
		long l = (long) ((i_138_ << 3) + (-320331677 * anInt7873 << 10) + i_139_);
		l |= (long) (class180.anInt2064 * -397006101 << 29);
		if (null != class599)
			l |= -4233498556259136701L * class599.aLong7855 << 32;
		int i_144_ = i;
		if (3 == aByte7894)
			i_144_ |= 0x7;
		else {
			if (aByte7894 != 0 || 0 != 686376233 * anInt7922)
				i_144_ |= 0x2;
			if (anInt7921 * -1311205683 != 0)
				i_144_ |= 0x1;
			if (anInt7915 * 240741633 != 0)
				i_144_ |= 0x4;
		}
		if (bool)
			i_144_ |= 0x40000;
		boolean bool_145_ = 0 != aByte7894 && (class161 != null || null != class161_140_);
		boolean bool_146_ = (0 != -1311205683 * anInt7921 || 0 != 686376233 * anInt7922 || 0 != 240741633 * anInt7915);
		Class20 class20;
		synchronized (aClass601_7913.aClass205_7865) {
			class20 = (Class20) aClass601_7913.aClass205_7865.method3787(l);
		}
		Class176 class176 = (Class176) (null != class20 ? class20.anObject205 : null);
		Class527_Sub8_Sub8 class527_sub8_sub8 = null;
		if (null == class176 || class180.method3175(class176.method2874(), i_144_) != 0) {
			if (class176 != null)
				i_144_ = class180.method3176(i_144_, class176.method2874());
			int i_147_ = i_144_;
			if (i_138_ == -1736797763 * Class596.aClass596_7823.anInt7844 && i_139_ > 3)
				i_147_ |= 0x5;
			class176 = method9961(class180, i_147_, i_138_, i_139_, class599, (byte) -66);
			if (null == class176)
				return null;
			if (-1736797763 * Class596.aClass596_7823.anInt7844 == i_138_ && i_139_ > 3)
				class176.method2911(2048);
			if (bool && !bool_145_ && !bool_146_)
				class527_sub8_sub8 = class176.method2891(null);
			class176.method2941(i_144_);
			class20 = new Class20(class176, class527_sub8_sub8);
			synchronized (aClass601_7913.aClass205_7865) {
				aClass601_7913.aClass205_7865.method3790(class20, l);
			}
		} else {
			class527_sub8_sub8 = (Class527_Sub8_Sub8) class20.anObject204;
			if (bool && null == class527_sub8_sub8 && !bool_145_ && !bool_146_)
				class527_sub8_sub8 = (Class527_Sub8_Sub8) (class20.anObject204 = class176.method2891(null));
		}
		if (bool_145_ || bool_146_) {
			class176 = class176.method2862((byte) 0, i_144_, true);
			if (bool_145_)
				class176.method2873(aByte7894, 588638211 * anInt7906, class161, class161_140_, i_141_, i_142_, i_143_);
			if (bool_146_)
				class176.method3015(-1311205683 * anInt7921, 686376233 * anInt7922, anInt7915 * 240741633);
			if (bool)
				class527_sub8_sub8 = class176.method2891(null);
			class176.method2941(i);
		} else
			class176 = class176.method2862((byte) 0, i, true);
		aClass601_7913.aClass20_7870.anObject205 = class176;
		aClass601_7913.aClass20_7870.anObject204 = class527_sub8_sub8;
		return aClass601_7913.aClass20_7870;
	}

	void method9973() {
		if (-1 == anInt7898 * -1508648055) {
			anInt7898 = 0;
			if (null != aByteArray7878 && 1 == aByteArray7878.length && (aByteArray7878[0] == Class596.aClass596_7823.anInt7844 * -1736797763))
				anInt7898 = 414911161;
			for (int i = 0; i < 5; i++) {
				if (aStringArray7904[i] != null) {
					anInt7898 = 414911161;
					break;
				}
			}
		}
		if (-1 == anInt7872 * 1302526849)
			anInt7872 = (177265375 * anInt7892 != 0 ? 1 : 0) * 579945601;
		if (method9974(-2137289999) || aBool7943 || anIntArray7929 != null)
			aBool7947 = true;
		if (-1508648055 * anInt7898 <= 0 && Class593.aClass593_7800 != aClass593_7949) {
			/* empty */
		}
	}

	public boolean method9974(int i) {
		return anIntArray7900 != null;
	}

	public final boolean method9975(int i) {
		if (anIntArrayArray7923 == null)
			return true;
		boolean bool = true;
		for (int i_148_ = 0; i_148_ < aByteArray7878.length; i_148_++) {
			if (i == aByteArray7878[i_148_]) {
				for (int i_149_ = 0; i_149_ < anIntArrayArray7923[i_148_].length; i_149_++) {
					if (!aClass601_7913.method9934((anIntArrayArray7923[i_148_][i_149_]), (byte) -121))
						bool = false;
				}
			}
		}
		return bool;
	}

	public int method9976() {
		if (null != anIntArray7900) {
			if (anIntArray7900.length > 1) {
				int i = (int) (Math.random() * 65535.0);
				for (int i_150_ = 0; i_150_ < anIntArray7900.length; i_150_++) {
					if (i <= anIntArray7901[i_150_])
						return anIntArray7900[i_150_];
					i -= anIntArray7901[i_150_];
				}
			} else
				return anIntArray7900[0];
		}
		return -1;
	}

	public final boolean method9977(int i) {
		if (anIntArrayArray7923 == null)
			return true;
		boolean bool = true;
		for (int i_151_ = 0; i_151_ < aByteArray7878.length; i_151_++) {
			if (i == aByteArray7878[i_151_]) {
				for (int i_152_ = 0; i_152_ < anIntArrayArray7923[i_151_].length; i_152_++) {
					if (!aClass601_7913.method9934((anIntArrayArray7923[i_151_][i_152_]), (byte) -88))
						bool = false;
				}
			}
		}
		return bool;
	}

	public int method9978(int i) {
		if (anIntArray7907 == null)
			return -1;
		return anIntArray7907[i];
	}

	public final boolean method9979(Class645 class645) {
		if (null == anIntArrayArray7923)
			return true;
		boolean bool = true;
		for (int i = 0; i < anIntArrayArray7923.length; i++) {
			for (int i_153_ = 0; i_153_ < anIntArrayArray7923[i].length; i_153_++) {
				boolean bool_154_ = aClass601_7913.method9934(anIntArrayArray7923[i][i_153_], (byte) -127);
				bool &= bool_154_;
				if (!bool_154_)
					class645.anInt8348 = anIntArrayArray7923[i][i_153_] * 1626444987;
			}
		}
		return bool;
	}

	public final boolean method9980(Class645 class645) {
		if (null == anIntArrayArray7923)
			return true;
		boolean bool = true;
		for (int i = 0; i < anIntArrayArray7923.length; i++) {
			for (int i_155_ = 0; i_155_ < anIntArrayArray7923[i].length; i_155_++) {
				boolean bool_156_ = aClass601_7913.method9934(anIntArrayArray7923[i][i_155_], (byte) -76);
				bool &= bool_156_;
				if (!bool_156_)
					class645.anInt8348 = anIntArrayArray7923[i][i_155_] * 1626444987;
			}
		}
		return bool;
	}

	public boolean method9981() {
		if (null == anIntArray7929)
			return -1 != anInt7944 * 1075350771 || null != anIntArray7937;
		for (int i = 0; i < anIntArray7929.length; i++) {
			if (-1 != anIntArray7929[i]) {
				Class602 class602_157_ = (Class602) anInterface13_7875.method81(anIntArray7929[i], -187952559);
				if (1075350771 * class602_157_.anInt7944 != -1 || class602_157_.anIntArray7937 != null)
					return true;
			}
		}
		return false;
	}

	public final synchronized Class20 method9982(Class180 class180, int i, int i_158_, int i_159_, Class161 class161, Class161 class161_160_, int i_161_, int i_162_, int i_163_, boolean bool, Class599 class599) {
		if (Class191.method3687(i_158_, 1907964391))
			i_158_ = -1736797763 * Class596.aClass596_7825.anInt7844;
		long l = (long) ((i_158_ << 3) + (-320331677 * anInt7873 << 10) + i_159_);
		l |= (long) (class180.anInt2064 * -397006101 << 29);
		if (null != class599)
			l |= -4233498556259136701L * class599.aLong7855 << 32;
		int i_164_ = i;
		if (3 == aByte7894)
			i_164_ |= 0x7;
		else {
			if (aByte7894 != 0 || 0 != 686376233 * anInt7922)
				i_164_ |= 0x2;
			if (anInt7921 * -1311205683 != 0)
				i_164_ |= 0x1;
			if (anInt7915 * 240741633 != 0)
				i_164_ |= 0x4;
		}
		if (bool)
			i_164_ |= 0x40000;
		boolean bool_165_ = 0 != aByte7894 && (class161 != null || null != class161_160_);
		boolean bool_166_ = (0 != -1311205683 * anInt7921 || 0 != 686376233 * anInt7922 || 0 != 240741633 * anInt7915);
		Class20 class20;
		synchronized (aClass601_7913.aClass205_7865) {
			class20 = (Class20) aClass601_7913.aClass205_7865.method3787(l);
		}
		Class176 class176 = (Class176) (null != class20 ? class20.anObject205 : null);
		Class527_Sub8_Sub8 class527_sub8_sub8 = null;
		if (null == class176 || class180.method3175(class176.method2874(), i_164_) != 0) {
			if (class176 != null)
				i_164_ = class180.method3176(i_164_, class176.method2874());
			int i_167_ = i_164_;
			if (i_158_ == -1736797763 * Class596.aClass596_7823.anInt7844 && i_159_ > 3)
				i_167_ |= 0x5;
			class176 = method9961(class180, i_167_, i_158_, i_159_, class599, (byte) 2);
			if (null == class176)
				return null;
			if (-1736797763 * Class596.aClass596_7823.anInt7844 == i_158_ && i_159_ > 3)
				class176.method2911(2048);
			if (bool && !bool_165_ && !bool_166_)
				class527_sub8_sub8 = class176.method2891(null);
			class176.method2941(i_164_);
			class20 = new Class20(class176, class527_sub8_sub8);
			synchronized (aClass601_7913.aClass205_7865) {
				aClass601_7913.aClass205_7865.method3790(class20, l);
			}
		} else {
			class527_sub8_sub8 = (Class527_Sub8_Sub8) class20.anObject204;
			if (bool && null == class527_sub8_sub8 && !bool_165_ && !bool_166_)
				class527_sub8_sub8 = (Class527_Sub8_Sub8) (class20.anObject204 = class176.method2891(null));
		}
		if (bool_165_ || bool_166_) {
			class176 = class176.method2862((byte) 0, i_164_, true);
			if (bool_165_)
				class176.method2873(aByte7894, 588638211 * anInt7906, class161, class161_160_, i_161_, i_162_, i_163_);
			if (bool_166_)
				class176.method3015(-1311205683 * anInt7921, 686376233 * anInt7922, anInt7915 * 240741633);
			if (bool)
				class527_sub8_sub8 = class176.method2891(null);
			class176.method2941(i);
		} else
			class176 = class176.method2862((byte) 0, i, true);
		aClass601_7913.aClass20_7870.anObject205 = class176;
		aClass601_7913.aClass20_7870.anObject204 = class527_sub8_sub8;
		return aClass601_7913.aClass20_7870;
	}

	public final boolean method9983(int i) {
		if (anIntArrayArray7923 == null)
			return true;
		boolean bool = true;
		for (int i_168_ = 0; i_168_ < aByteArray7878.length; i_168_++) {
			if (i == aByteArray7878[i_168_]) {
				for (int i_169_ = 0; i_169_ < anIntArrayArray7923[i_168_].length; i_169_++) {
					if (!aClass601_7913.method9934((anIntArrayArray7923[i_168_][i_169_]), (byte) -81))
						bool = false;
				}
			}
		}
		return bool;
	}

	public final synchronized Class176 method9984(Class180 class180, int i, int i_170_, int i_171_, Class161 class161, Class161 class161_172_, int i_173_, int i_174_, int i_175_, Class695 class695, Class599 class599) {
		if (Class191.method3687(i_170_, 1552009275))
			i_170_ = -1736797763 * Class596.aClass596_7825.anInt7844;
		long l = (long) (i_171_ + ((anInt7873 * -320331677 << 10) + (i_170_ << 3)));
		int i_176_ = i;
		l |= (long) (-397006101 * class180.anInt2064 << 29);
		if (null != class599)
			l |= class599.aLong7855 * -4233498556259136701L << 32;
		if (class695 != null)
			i |= class695.method14174(-822649352);
		if (aByte7894 == 3)
			i |= 0x7;
		else {
			if (aByte7894 != 0 || 0 != anInt7922 * 686376233)
				i |= 0x2;
			if (0 != anInt7921 * -1311205683)
				i |= 0x1;
			if (0 != anInt7915 * 240741633)
				i |= 0x4;
		}
		if (i_170_ == -1736797763 * Class596.aClass596_7823.anInt7844 && i_171_ > 3)
			i |= 0x5;
		Class176 class176;
		synchronized (aClass601_7913.aClass205_7868) {
			class176 = (Class176) aClass601_7913.aClass205_7868.method3787(l);
		}
		if (class176 == null || class180.method3175(class176.method2874(), i) != 0) {
			if (null != class176)
				i = class180.method3176(i, class176.method2874());
			class176 = method9961(class180, i, i_170_, i_171_, class599, (byte) -13);
			if (class176 == null)
				return null;
			synchronized (aClass601_7913.aClass205_7868) {
				aClass601_7913.aClass205_7868.method3790(class176, l);
			}
		}
		boolean bool = false;
		if (null != class695) {
			class176 = class176.method2862((byte) 1, i, true);
			bool = true;
			class695.method14175(class176, i_171_ & 0x3, (byte) 0);
		}
		if (Class596.aClass596_7823.anInt7844 * -1736797763 == i_170_ && i_171_ > 3) {
			if (!bool) {
				class176 = class176.method2862((byte) 3, i, true);
				bool = true;
			}
			class176.method2911(2048);
		}
		if (aByte7894 != 0) {
			if (!bool) {
				class176 = class176.method2862((byte) 3, i, true);
				bool = true;
			}
			class176.method2873(aByte7894, 588638211 * anInt7906, class161, class161_172_, i_173_, i_174_, i_175_);
		}
		if (-1311205683 * anInt7921 != 0 || 686376233 * anInt7922 != 0 || 0 != anInt7915 * 240741633) {
			if (!bool) {
				class176 = class176.method2862((byte) 3, i, true);
				bool = true;
			}
			class176.method3015(anInt7921 * -1311205683, 686376233 * anInt7922, anInt7915 * 240741633);
		}
		if (bool)
			class176.method2941(i_176_);
		return class176;
	}

	public final boolean method9985(Class645 class645) {
		if (null == anIntArrayArray7923)
			return true;
		boolean bool = true;
		for (int i = 0; i < anIntArrayArray7923.length; i++) {
			for (int i_177_ = 0; i_177_ < anIntArrayArray7923[i].length; i_177_++) {
				boolean bool_178_ = aClass601_7913.method9934(anIntArrayArray7923[i][i_177_], (byte) -38);
				bool &= bool_178_;
				if (!bool_178_)
					class645.anInt8348 = anIntArrayArray7923[i][i_177_] * 1626444987;
			}
		}
		return bool;
	}

	public boolean method9986(int i) {
		if (anIntArray7900 != null && -1 != i) {
			for (int i_179_ = 0; i_179_ < anIntArray7900.length; i_179_++) {
				if (i == anIntArray7900[i_179_])
					return true;
			}
		}
		return false;
	}

	public final Class602 method9987(Interface20 interface20, Interface18 interface18) {
		int i = -1;
		if (anInt7890 * 715119945 != -1) {
			Class333 class333 = interface20.method123(715119945 * anInt7890, 1073469140);
			if (null != class333)
				i = interface18.method100(class333, (short) -351);
		} else if (700625207 * anInt7930 != -1) {
			Class160 class160 = interface20.method125(Class465.aClass465_5313, anInt7930 * 700625207, -2029259157);
			if (class160 != null)
				i = interface18.method101(class160, 1096407173);
		}
		if (i < 0 || i >= anIntArray7929.length - 1) {
			int i_180_ = anIntArray7929[anIntArray7929.length - 1];
			if (-1 != i_180_)
				return ((Class602) anInterface13_7875.method81(i_180_, 1092581349));
			return null;
		}
		if (-1 == anIntArray7929[i])
			return null;
		return ((Class602) anInterface13_7875.method81(anIntArray7929[i], 256878326));
	}

	public int method9988(int i, int i_181_) {
		if (aClass14_7942 == null)
			return i_181_;
		Node_Sub6 class527_sub7 = (Node_Sub6) aClass14_7942.method709((long) i);
		if (class527_sub7 == null)
			return i_181_;
		return -78845949 * class527_sub7.anInt10398;
	}

	public boolean method9989() {
		if (null == anIntArray7929)
			return -1 != anInt7944 * 1075350771 || null != anIntArray7937;
		for (int i = 0; i < anIntArray7929.length; i++) {
			if (-1 != anIntArray7929[i]) {
				Class602 class602_182_ = (Class602) anInterface13_7875.method81(anIntArray7929[i], -735361704);
				if (1075350771 * class602_182_.anInt7944 != -1 || class602_182_.anIntArray7937 != null)
					return true;
			}
		}
		return false;
	}

	public String method9990(int i, String string) {
		if (null == aClass14_7942)
			return string;
		Class527_Sub26 class527_sub26 = (Class527_Sub26) aClass14_7942.method709((long) i);
		if (class527_sub26 == null)
			return string;
		return (String) class527_sub26.anObject10522;
	}

	public boolean method9991() {
		if (null == anIntArray7929)
			return -1 != anInt7944 * 1075350771 || null != anIntArray7937;
		for (int i = 0; i < anIntArray7929.length; i++) {
			if (-1 != anIntArray7929[i]) {
				Class602 class602_183_ = (Class602) anInterface13_7875.method81(anIntArray7929[i], 131427823);
				if (1075350771 * class602_183_.anInt7944 != -1 || class602_183_.anIntArray7937 != null)
					return true;
			}
		}
		return false;
	}

	public int method9992(int i, int i_184_) {
		if (anIntArray7907 == null)
			return -1;
		return anIntArray7907[i];
	}

	public final Class602 method9993(Interface20 interface20, Interface18 interface18) {
		int i = -1;
		if (anInt7890 * 715119945 != -1) {
			Class333 class333 = interface20.method123(715119945 * anInt7890, 933407482);
			if (null != class333)
				i = interface18.method100(class333, (short) -15422);
		} else if (700625207 * anInt7930 != -1) {
			Class160 class160 = interface20.method125(Class465.aClass465_5313, anInt7930 * 700625207, -2004488393);
			if (class160 != null)
				i = interface18.method101(class160, 1096407173);
		}
		if (i < 0 || i >= anIntArray7929.length - 1) {
			int i_185_ = anIntArray7929[anIntArray7929.length - 1];
			if (-1 != i_185_)
				return ((Class602) anInterface13_7875.method81(i_185_, -907576331));
			return null;
		}
		if (-1 == anIntArray7929[i])
			return null;
		return ((Class602) anInterface13_7875.method81(anIntArray7929[i], 1408321641));
	}

	public boolean method9994() {
		return anIntArray7900 != null;
	}

	public boolean method9995() {
		return anIntArray7900 != null;
	}

	public boolean method9996() {
		return anIntArray7900 != null;
	}

	public boolean method9997() {
		return anIntArray7900 != null && anIntArray7900.length > 1;
	}

	public int[] method9998(byte i) {
		return anIntArray7900;
	}

	public int[] method9999() {
		return anIntArray7900;
	}

	public int[] method10000() {
		return anIntArray7900;
	}

	public boolean method10001(byte i) {
		return anIntArray7900 != null && anIntArray7900.length > 1;
	}

	public boolean method10002(int i) {
		if (anIntArray7900 != null && -1 != i) {
			for (int i_186_ = 0; i_186_ < anIntArray7900.length; i_186_++) {
				if (i == anIntArray7900[i_186_])
					return true;
			}
		}
		return false;
	}

	public String method10003(int i, String string, byte i_187_) {
		if (null == aClass14_7942)
			return string;
		Class527_Sub26 class527_sub26 = (Class527_Sub26) aClass14_7942.method709((long) i);
		if (class527_sub26 == null)
			return string;
		return (String) class527_sub26.anObject10522;
	}

	public int method10004(int i) {
		if (anIntArray7907 == null)
			return -1;
		return anIntArray7907[i];
	}

	void method10005() {
		if (-1 == anInt7898 * -1508648055) {
			anInt7898 = 0;
			if (null != aByteArray7878 && 1 == aByteArray7878.length && (aByteArray7878[0] == Class596.aClass596_7823.anInt7844 * -1736797763))
				anInt7898 = 414911161;
			for (int i = 0; i < 5; i++) {
				if (aStringArray7904[i] != null) {
					anInt7898 = 414911161;
					break;
				}
			}
		}
		if (-1 == anInt7872 * 1302526849)
			anInt7872 = (177265375 * anInt7892 != 0 ? 1 : 0) * 579945601;
		if (method9974(-415547670) || aBool7943 || anIntArray7929 != null)
			aBool7947 = true;
		if (-1508648055 * anInt7898 <= 0 && Class593.aClass593_7800 != aClass593_7949) {
			/* empty */
		}
	}

	static final void method10006(Class665 class665, int i) {
		class665.anInt8526 -= 102380841;
	}

	static int[] method10007(Class527_Sub15 class527_sub15, int i) {
		RSByteBuffer class527_sub38 = new RSByteBuffer(518);
		int[] is = new int[4];
		for (int i_188_ = 0; i_188_ < 4; i_188_++)
			is[i_188_] = (int) (Math.random() * 9.9999999E7);
		class527_sub38.writeByte(10, 9016630);
		class527_sub38.writeInt(is[0], 533850406);
		class527_sub38.writeInt(is[1], 1429514357);
		class527_sub38.writeInt(is[2], 664414509);
		class527_sub38.writeInt(is[3], 1725836472);
		for (int i_189_ = 0; i_189_ < 10; i_189_++)
			class527_sub38.writeInt((int) (Math.random() * 9.9999999E7), 1271065759);
		class527_sub38.writeShort((int) (Math.random() * 9.9999999E7), 1404835786);
		class527_sub38.method16650(Class52.LOGIN_PUBLIC_EXPONENT, Class52.LOGIN_PUBLIC_MODULUS, (byte) -35);
		class527_sub15.buffer.writeBytes(class527_sub38.buffer, 0, -441238943 * class527_sub38.anInt10689, (byte) 60);
		return is;
	}

	public static void method10008(int i) {
		Class183.aClass240Array2100 = new Class240[Class254.aClass459_2807.method7561((byte) -89)];
		Class293.aBoolArray3265 = new boolean[Class254.aClass459_2807.method7561((byte) -31)];
	}

	static final void method10009(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class204.aClass527_Sub31_2213.aClass700_Sub39_10627.method17290(-332646457);
	}

	static final void method10010(Class665 class665, int i) {
		class665.anInt8526 -= 102380841;
	}

	public static void method10011(Class459 class459, Class459 class459_190_, Class459 class459_191_, Class459 class459_192_, int i) {
		Class254.aClass459_2807 = class459;
		Class274.aClass459_3148 = class459_190_;
		Class227.aClass459_2353 = class459_191_;
		Class183.aClass240Array2100 = new Class240[Class254.aClass459_2807.method7561((byte) -39)];
		Class293.aBoolArray3265 = new boolean[Class254.aClass459_2807.method7561((byte) -83)];
	}

	public static void method10012(Class160 class160, int i) {
		Class527_Sub8_Sub9 class527_sub8_sub9 = Class532.method8930(1, (long) (727971013 * class160.anInt1746));
		class527_sub8_sub9.method18186(637668168);
	}
}
