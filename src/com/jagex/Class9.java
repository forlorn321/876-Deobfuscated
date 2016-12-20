/* Class9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Arrays;

public class Class9 implements Interface14 {
	public boolean aBool73;
	public static final int anInt74 = 1;
	public static final int anInt75 = 2;
	static final int anInt76 = 6;
	static final int anInt77 = 5;
	public static short[] aShortArray78 = new short[256];
	Interface13 anInterface13_79;
	Class6 aClass6_80;
	public static final int anInt81 = 0;
	public int anInt82 = 1550839219;
	int anInt83;
	public String aString84 = "null";
	short[] aShortArray85;
	short[] aShortArray86;
	byte[] aByteArray87;
	short[] aShortArray88;
	int anInt89;
	int anInt90;
	byte[] aByteArray91;
	public int anInt92 = 1806029360;
	int anInt93;
	public int anInt94;
	public int anInt95;
	int anInt96;
	public int anInt97;
	public int anInt98;
	int anInt99;
	public int anInt100;
	int anInt101;
	public String[] aStringArray102;
	public int anInt103;
	int[] anIntArray104;
	int anInt105;
	public int anInt106;
	public int anInt107 = 0;
	public int anInt108;
	int anInt109;
	int anInt110;
	int anInt111;
	int anInt112;
	public int[] anIntArray113;
	int anInt114;
	int anInt115;
	int anInt116;
	int anInt117;
	int anInt118;
	public int anInt119;
	int anInt120;
	int anInt121;
	public boolean aBool122;
	public int anInt123;
	int[] anIntArray124;
	int[] anIntArray125;
	int[] anIntArray126;
	public int anInt127;
	public int anInt128;
	int anInt129;
	int anInt130;
	short[] aShortArray131;
	public int anInt132;
	public String[] aStringArray133;
	public int anInt134;
	int anInt135;
	int anInt136;
	int anInt137;
	public int anInt138;
	public int anInt139;
	public int anInt140;
	String aString141;
	byte[] aByteArray142;
	Class14 aClass14_143;
	public int anInt144;
	public int anInt145;
	int anInt146;
	public int anInt147;
	public boolean aBool148;
	public int anInt149;
	public boolean aBool150;
	static String aString151 = "</col>";
	public static int anInt152;

	void method603(Class9 class9_0_, Class9 class9_1_, Class671 class671) {
		method606(Class21.aClass21_208, class9_0_, class9_1_, Class53.aClass53_536, class671, (byte) 21);
	}

	static String method604(int i) {
		return new StringBuilder().append("<col=").append(Integer.toHexString(i)).append(">").toString();
	}

	public void method82(RSByteBuffer class527_sub38, int i) {
		for (;;) {
			int i_2_ = class527_sub38.readUnsignedByte();
			if (i_2_ == 0)
				break;
			method605(class527_sub38, i_2_, (short) 350);
		}
	}

	void method605(RSByteBuffer class527_sub38, int i, short i_3_) {
		if (i == 1)
			anInt83 = class527_sub38.method16466(-1653049181) * 1932088435;
		else if (2 == i)
			aString84 = class527_sub38.readString(1281843670);
		else if (i == 4)
			anInt92 = class527_sub38.readUnsignedShort() * -1684871649;
		else if (5 == i)
			anInt107 = class527_sub38.readUnsignedShort() * -663382909;
		else if (i == 6)
			anInt94 = class527_sub38.readUnsignedShort() * -684598821;
		else if (i == 7) {
			anInt138 = class527_sub38.readUnsignedShort() * -1210747305;
			if (anInt138 * 288478567 > 32767)
				anInt138 -= 1985413120;
		} else if (8 == i) {
			anInt97 = class527_sub38.readUnsignedShort() * -614879091;
			if (560960069 * anInt97 > 32767)
				anInt97 -= -1332936704;
		} else if (i == 11)
			anInt98 = -1126447641;
		else if (12 == i)
			anInt100 = class527_sub38.readInt() * 1980648817;
		else if (i == 13)
			anInt106 = class527_sub38.readUnsignedByte() * 1572536855;
		else if (14 == i)
			anInt123 = class527_sub38.readUnsignedByte() * -216271905;
		else if (16 == i)
			aBool122 = true;
		else if (i == 18)
			anInt139 = class527_sub38.readUnsignedShort() * -816412701;
		else if (23 == i)
			anInt90 = class527_sub38.method16466(-1823873963) * -1463845957;
		else if (i == 24)
			anInt116 = class527_sub38.method16466(-1685440818) * -1461620721;
		else if (i == 25)
			anInt111 = class527_sub38.method16466(-1967456051) * 329347863;
		else if (26 == i)
			anInt99 = class527_sub38.method16466(-2069201687) * -562526483;
		else if (i == 27)
			anInt108 = class527_sub38.readUnsignedByte() * 1203660899;
		else if (i >= 30 && i < 35)
			aStringArray133[i - 30] = class527_sub38.readString(1021831377);
		else if (i >= 35 && i < 40)
			aStringArray102[i - 35] = class527_sub38.readString(2003824844);
		else if (i == 40) {
			int i_4_ = class527_sub38.readUnsignedByte();
			aShortArray85 = new short[i_4_];
			aShortArray86 = new short[i_4_];
			for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
				aShortArray85[i_5_] = (short) class527_sub38.readUnsignedShort();
				aShortArray86[i_5_] = (short) class527_sub38.readUnsignedShort();
			}
		} else if (41 == i) {
			int i_6_ = class527_sub38.readUnsignedByte();
			aShortArray88 = new short[i_6_];
			aShortArray131 = new short[i_6_];
			for (int i_7_ = 0; i_7_ < i_6_; i_7_++) {
				aShortArray88[i_7_] = (short) class527_sub38.readUnsignedShort();
				aShortArray131[i_7_] = (short) class527_sub38.readUnsignedShort();
			}
		} else if (42 == i) {
			int i_8_ = class527_sub38.readUnsignedByte();
			aByteArray87 = new byte[i_8_];
			for (int i_9_ = 0; i_9_ < i_8_; i_9_++)
				aByteArray87[i_9_] = class527_sub38.readByte();
		} else if (43 == i) {
			anInt149 = class527_sub38.readInt() * -258699533;
			aBool148 = true;
		} else if (44 == i) {
			int i_10_ = class527_sub38.readUnsignedShort();
			int i_11_ = 0;
			for (int i_12_ = i_10_; i_12_ > 0; i_12_ >>= 1)
				i_11_++;
			aByteArray142 = new byte[i_11_];
			byte i_13_ = 0;
			for (int i_14_ = 0; i_14_ < i_11_; i_14_++) {
				if ((i_10_ & 1 << i_14_) > 0) {
					aByteArray142[i_14_] = i_13_;
					i_13_++;
				} else
					aByteArray142[i_14_] = (byte) -1;
			}
		} else if (i == 45) {
			int i_15_ = class527_sub38.readUnsignedShort();
			int i_16_ = 0;
			for (int i_17_ = i_15_; i_17_ > 0; i_17_ >>= 1)
				i_16_++;
			aByteArray91 = new byte[i_16_];
			byte i_18_ = 0;
			for (int i_19_ = 0; i_19_ < i_16_; i_19_++) {
				if ((i_15_ & 1 << i_19_) > 0) {
					aByteArray91[i_19_] = i_18_;
					i_18_++;
				} else
					aByteArray91[i_19_] = (byte) -1;
			}
		} else if (65 == i)
			aBool73 = true;
		else if (i == 78)
			anInt121 = class527_sub38.method16466(-1760192506) * -1735475793;
		else if (i == 79)
			anInt110 = class527_sub38.method16466(-1850193041) * -1125129177;
		else if (i == 90)
			anInt101 = class527_sub38.method16466(-1737698732) * 397647389;
		else if (91 == i)
			anInt109 = class527_sub38.method16466(-2122336082) * -661499793;
		else if (92 == i)
			anInt112 = class527_sub38.method16466(-1804506866) * 299769433;
		else if (i == 93)
			anInt105 = class527_sub38.method16466(-1774668800) * 1479479923;
		else if (i == 94)
			anInt82 = class527_sub38.readUnsignedShort() * -1550839219;
		else if (i == 95)
			anInt95 = class527_sub38.readUnsignedShort() * -1345432921;
		else if (96 == i)
			anInt144 = class527_sub38.readUnsignedByte() * 12248847;
		else if (97 == i)
			anInt128 = class527_sub38.readUnsignedShort() * -1199583697;
		else if (i == 98)
			anInt127 = class527_sub38.readUnsignedShort() * 1010157239;
		else if (i >= 100 && i < 110) {
			if (null == anIntArray125) {
				anIntArray125 = new int[10];
				anIntArray126 = new int[10];
			}
			anIntArray125[i - 100] = class527_sub38.readUnsignedShort();
			anIntArray126[i - 100] = class527_sub38.readUnsignedShort();
		} else if (110 == i)
			anInt135 = class527_sub38.readUnsignedShort() * -1845292679;
		else if (i == 111)
			anInt89 = class527_sub38.readUnsignedShort() * -1763458223;
		else if (112 == i)
			anInt137 = class527_sub38.readUnsignedShort() * -632254305;
		else if (i == 113)
			anInt93 = class527_sub38.readByte() * -1787052187;
		else if (i == 114)
			anInt115 = class527_sub38.readByte() * -1453627035;
		else if (115 == i)
			anInt140 = class527_sub38.readUnsignedByte() * -743508023;
		else if (121 == i)
			anInt129 = class527_sub38.readUnsignedShort() * 1882324293;
		else if (i == 122)
			anInt119 = class527_sub38.readUnsignedShort() * 331582577;
		else if (i == 125) {
			anInt114 = (class527_sub38.readByte() << 2) * 529210699;
			anInt117 = (class527_sub38.readByte() << 2) * 769219685;
			anInt96 = (class527_sub38.readByte() << 2) * 948502291;
		} else if (i == 126) {
			anInt130 = (class527_sub38.readByte() << 2) * 1496932671;
			anInt118 = (class527_sub38.readByte() << 2) * 1431330647;
			anInt120 = (class527_sub38.readByte() << 2) * -356500311;
		} else if (127 == i || i == 128 || i == 129 || 130 == i) {
			class527_sub38.readUnsignedByte();
			class527_sub38.readUnsignedShort();
		} else if (132 == i) {
			int i_20_ = class527_sub38.readUnsignedByte();
			anIntArray113 = new int[i_20_];
			for (int i_21_ = 0; i_21_ < i_20_; i_21_++)
				anIntArray113[i_21_] = class527_sub38.readUnsignedShort();
		} else if (134 == i)
			anInt145 = class527_sub38.readUnsignedByte() * -218964887;
		else if (139 == i)
			anInt146 = class527_sub38.readUnsignedShort() * -1896004601;
		else if (140 == i)
			anInt147 = class527_sub38.readUnsignedShort() * 733594899;
		else if (i >= 142 && i < 147) {
			if (anIntArray104 == null) {
				anIntArray104 = new int[6];
				Arrays.fill(anIntArray104, -1);
			}
			anIntArray104[i - 142] = class527_sub38.readUnsignedShort();
		} else if (i >= 150 && i < 155) {
			if (anIntArray124 == null) {
				anIntArray124 = new int[5];
				Arrays.fill(anIntArray124, -1);
			}
			anIntArray124[i - 150] = class527_sub38.readUnsignedShort();
		} else if (i != 156) {
			if (i == 157)
				aBool150 = true;
			else if (161 == i)
				anInt103 = class527_sub38.readUnsignedShort() * -1741117381;
			else if (i == 162)
				anInt132 = class527_sub38.readUnsignedShort() * -2027695975;
			else if (163 == i)
				anInt134 = class527_sub38.readUnsignedShort() * -1851015713;
			else if (i == 164)
				aString141 = class527_sub38.readString(2107343175);
			else if (165 == i)
				anInt98 = 2042072014;
			else if (i == 249) {
				int i_22_ = class527_sub38.readUnsignedByte();
				if (null == aClass14_143) {
					int i_23_ = Class186.method3652(i_22_, 1986005295);
					aClass14_143 = new Class14(i_23_);
				}
				for (int i_24_ = 0; i_24_ < i_22_; i_24_++) {
					boolean bool = class527_sub38.readUnsignedByte() == 1;
					int i_25_ = class527_sub38.read24BitUnsignedInteger(769630277);
					Class527 class527;
					if (bool)
						class527 = new Class527_Sub26(class527_sub38.readString(1996631325));
					else
						class527 = new Node_Sub6(class527_sub38.readInt());
					aClass14_143.method714(class527, (long) i_25_);
				}
			}
		}
	}

	void method606(Class21 class21, Class9 class9_26_, Class9 class9_27_, Class53 class53, Class671 class671, byte i) {
		anInt83 = 1 * class9_26_.anInt83;
		anInt92 = class9_26_.anInt92 * 1;
		anInt107 = 1 * class9_26_.anInt107;
		anInt94 = class9_26_.anInt94 * 1;
		anInt95 = class9_26_.anInt95 * 1;
		anInt138 = class9_26_.anInt138 * 1;
		anInt97 = 1 * class9_26_.anInt97;
		Class9 class9_28_ = class21 == Class21.aClass21_209 ? class9_26_ : class9_27_;
		aShortArray85 = class9_28_.aShortArray85;
		aShortArray86 = class9_28_.aShortArray86;
		aByteArray87 = class9_28_.aByteArray87;
		aShortArray88 = class9_28_.aShortArray88;
		aShortArray131 = class9_28_.aShortArray131;
		aString84 = class9_27_.aString84;
		aBool122 = class9_27_.aBool122;
		if (class21 == Class21.aClass21_209) {
			anInt100 = class9_27_.anInt100 * 1;
			anInt98 = -1126447641;
		} else if (class21 == Class21.aClass21_207) {
			aString84 = class9_27_.aString141;
			anInt100 = (int) Math.floor((double) (class9_27_.anInt100 * -1204628591 / (class9_27_.anInt134 * 1388854815))) * 1980648817;
			anInt98 = -1126447641;
			aBool73 = class9_27_.aBool73;
			anInt82 = class9_26_.anInt82 * 1;
			anIntArray104 = class9_26_.anIntArray104;
			anIntArray124 = class9_26_.anIntArray124;
			aStringArray102 = new String[5];
			aStringArray102[0] = Class53.aClass53_539.method1290(class671, (byte) -80);
			aStringArray102[4] = class53.method1290(class671, (byte) -68);
		} else {
			anInt100 = 0;
			anInt98 = class9_27_.anInt98 * 1;
			anInt106 = 1 * class9_27_.anInt106;
			anInt123 = class9_27_.anInt123 * 1;
			anInt108 = 1 * class9_27_.anInt108;
			anInt90 = class9_27_.anInt90 * 1;
			anInt116 = class9_27_.anInt116 * 1;
			anInt121 = class9_27_.anInt121 * 1;
			anInt111 = class9_27_.anInt111 * 1;
			anInt99 = class9_27_.anInt99 * 1;
			anInt110 = 1 * class9_27_.anInt110;
			anInt114 = class9_27_.anInt114 * 1;
			anInt130 = class9_27_.anInt130 * 1;
			anInt117 = 1 * class9_27_.anInt117;
			anInt118 = 1 * class9_27_.anInt118;
			anInt96 = class9_27_.anInt96 * 1;
			anInt120 = class9_27_.anInt120 * 1;
			anInt101 = 1 * class9_27_.anInt101;
			anInt112 = 1 * class9_27_.anInt112;
			anInt109 = 1 * class9_27_.anInt109;
			anInt105 = class9_27_.anInt105 * 1;
			anInt82 = 1 * class9_27_.anInt82;
			anInt140 = class9_27_.anInt140 * 1;
			aStringArray133 = class9_27_.aStringArray133;
			aClass14_143 = class9_27_.aClass14_143;
			aStringArray102 = new String[5];
			if (class9_27_.aStringArray102 != null) {
				for (int i_29_ = 0; i_29_ < 4; i_29_++)
					aStringArray102[i_29_] = class9_27_.aStringArray102[i_29_];
			}
			aStringArray102[4] = class53.method1290(class671, (byte) -107);
		}
	}

	public final boolean method607(boolean bool, Class23 class23) {
		int i;
		int i_30_;
		int i_31_;
		if (bool) {
			if (null != class23 && null != class23.anIntArray217) {
				i = class23.anIntArray217[0];
				i_30_ = class23.anIntArray217[1];
				i_31_ = class23.anIntArray217[2];
			} else {
				i = 1566897319 * anInt111;
				i_30_ = anInt99 * -291191067;
				i_31_ = anInt110 * 816794519;
			}
		} else if (null != class23 && class23.anIntArray222 != null) {
			i = class23.anIntArray222[0];
			i_30_ = class23.anIntArray222[1];
			i_31_ = class23.anIntArray222[2];
		} else {
			i = 705433971 * anInt90;
			i_30_ = -1198555409 * anInt116;
			i_31_ = anInt121 * -1591690929;
		}
		if (i == -1)
			return true;
		boolean bool_32_ = true;
		if (!aClass6_80.aClass459_54.method7479(i, 0, 102380841))
			bool_32_ = false;
		if (-1 != i_30_ && !aClass6_80.aClass459_54.method7479(i_30_, 0, 102380841))
			bool_32_ = false;
		if (-1 != i_31_ && !aClass6_80.aClass459_54.method7479(i_31_, 0, 102380841))
			bool_32_ = false;
		return bool_32_;
	}

	int[] method608(int[] is, int i, byte i_33_) {
		int[] is_34_ = new int[1152];
		int i_35_ = 0;
		for (int i_36_ = 0; i_36_ < 32; i_36_++) {
			for (int i_37_ = 0; i_37_ < 36; i_37_++) {
				int i_38_ = is[i_35_];
				if (i_38_ == 0) {
					if (i_37_ > 0 && is[i_35_ - 1] != 0)
						i_38_ = i;
					else if (i_36_ > 0 && 0 != is[i_35_ - 36])
						i_38_ = i;
					else if (i_37_ < 35 && 0 != is[1 + i_35_])
						i_38_ = i;
					else if (i_36_ < 31 && is[36 + i_35_] != 0)
						i_38_ = i;
				}
				is_34_[i_35_++] = i_38_;
			}
		}
		return is_34_;
	}

	int[] method609(Class180 class180, Class180 class180_39_, int i, int i_40_, int i_41_, boolean bool, int i_42_, Class174 class174, Class633 class633, Class615 class615) {
		Class175 class175 = Class175.method2814(aClass6_80.aClass459_54, anInt83 * -1703972677, 0);
		if (null == class175)
			return null;
		if (class175.anInt1905 < 13)
			class175.method2829(2);
		if (null != aShortArray85) {
			for (int i_43_ = 0; i_43_ < aShortArray85.length; i_43_++) {
				if (null != aByteArray87 && i_43_ < aByteArray87.length)
					class175.method2803(aShortArray85[i_43_], (aShortArray78[aByteArray87[i_43_] & 0xff]));
				else
					class175.method2803(aShortArray85[i_43_], aShortArray86[i_43_]);
			}
		}
		if (aShortArray88 != null) {
			for (int i_44_ = 0; i_44_ < aShortArray88.length; i_44_++)
				class175.method2853(aShortArray88[i_44_], aShortArray131[i_44_]);
		}
		if (class633 != null) {
			for (int i_45_ = 0; i_45_ < 10; i_45_++) {
				for (int i_46_ = 0; i_46_ < Class193.aShortArrayArray2156[i_45_].length; i_46_++) {
					if (class633.anIntArray8285[i_45_] < (Class487.aShortArrayArrayArray5470[i_45_][i_46_]).length)
						class175.method2803((Class193.aShortArrayArray2156[i_45_][i_46_]), (Class487.aShortArrayArrayArray5470[i_45_][i_46_][(class633.anIntArray8285[i_45_])]));
				}
			}
			for (int i_47_ = 0; i_47_ < 10; i_47_++) {
				for (int i_48_ = 0; i_48_ < Class552.aShortArrayArray7313[i_47_].length; i_48_++) {
					if (class633.anIntArray8282[i_47_] < (Class78.aShortArrayArrayArray802[i_47_][i_48_]).length)
						class175.method2853((Class552.aShortArrayArray7313[i_47_][i_48_]), (Class78.aShortArrayArrayArray802[i_47_][i_48_][(class633.anIntArray8282[i_47_])]));
				}
			}
		}
		int i_49_ = 2048;
		boolean bool_50_ = false;
		if (128 != anInt135 * 1074235593 || anInt89 * 357000625 != 128 || 128 != 904694623 * anInt137) {
			bool_50_ = true;
			i_49_ |= 0x7;
		}
		Class176 class176 = class180.method3376(class175, i_49_, 64, 64 + anInt93 * -2087822739, 768 + anInt115 * 316154401);
		if (!class176.method3035())
			return null;
		if (bool_50_)
			class176.method2872(anInt135 * 1074235593, anInt89 * 357000625, anInt137 * 904694623);
		Class147 class147 = null;
		if (-1 != 295433991 * anInt127) {
			class147 = aClass6_80.method570(class180, class180_39_, -1747830577 * anInt128, 10, 1, 0, true, true, 0, class174, class633, class615, anInterface13_79, (byte) 1);
			if (class147 == null)
				return null;
		} else if (anInt119 * -1637960559 != -1) {
			class147 = aClass6_80.method570(class180, class180_39_, -698413683 * anInt129, i, i_40_, i_41_, false, true, 0, class174, class633, class615, anInterface13_79, (byte) 1);
			if (class147 == null)
				return null;
		} else if (anInt147 * -1475818213 != -1) {
			class147 = aClass6_80.method570(class180, class180_39_, anInt146 * 723970487, i, i_40_, i_41_, false, true, 0, class174, class633, class615, anInterface13_79, (byte) 1);
			if (class147 == null)
				return null;
		} else if (-1 != -73038935 * anInt132) {
			class147 = aClass6_80.method570(class180, class180_39_, 1450438899 * anInt103, 10, 1, 0, true, true, 0, class174, class633, class615, anInterface13_79, (byte) 1);
			if (null == class147)
				return null;
		}
		int i_51_;
		if (bool)
			i_51_ = (int) ((double) (anInt92 * 1387730399) * 1.5) << 2;
		else if (2 == i_40_)
			i_51_ = (int) ((double) (anInt92 * 1387730399) * 1.04) << 2;
		else
			i_51_ = 1387730399 * anInt92 << 2;
		Class427 class427 = class180.method3364();
		Class427 class427_52_ = class180.method3171();
		class427_52_.method6752(16.0F, 16.0F, 512.0F, 512.0F, 50.0F, 2.14748365E9F, (float) class180.method3285(2101105026).method2728(), (float) class180.method3285(903114654).method2729());
		class180.method3183(class427_52_);
		class180.method3128(0, 0, class180.method3285(1477832141).method2728(), class180.method3285(1378009028).method2729());
		Class432 class432 = new Class432();
		class180.method3180(class432);
		class180.method3478(0.95F + (float) (Math.random() / 10.0));
		class180.method3157(16777215, 0.95F + (float) (Math.random() / 10.0), 0.95F + (float) (Math.random() / 10.0), -50.0F, -10.0F, -50.0F);
		Class432 class432_53_ = class180.method3172();
		class432_53_.method6890(0.0F, 0.0F, 1.0F, Class428.method6863(-(-451529449 * anInt95) << 3));
		class432_53_.method6936(0.0F, 1.0F, 0.0F, Class428.method6863(anInt94 * 608991827 << 3));
		class432_53_.method6896((float) (anInt138 * 288478567 << 2), (float) (((i_51_ * (Class428.anIntArray4825[-1615963605 * anInt107 << 3])) >> 14) - class176.method2896() / 2 + (anInt97 * 560960069 << 2)), (float) (((i_51_ * (Class428.anIntArray4819[-1615963605 * anInt107 << 3])) >> 14) + (560960069 * anInt97 << 2)));
		class432_53_.method6936(1.0F, 0.0F, 0.0F, Class428.method6863(-1615963605 * anInt107 << 3));
		class180.method3132(0, 0, 36, 32);
		class180.method3136(2, 0);
		class180.method3348(0, 0, 36, 32, 0, 0);
		class180.method3187(0, -1, 0);
		class176.method2889(class432_53_, null, 1);
		class180.method3183(class427);
		int[] is = class180.method3113(0, 0, 36, 32);
		if (i_40_ >= 1) {
			is = method608(is, -16777214, (byte) 10);
			if (i_40_ >= 2)
				is = method608(is, -1, (byte) 4);
		}
		if (i_41_ != 0)
			method615(is, i_41_, (byte) -33);
		if (-1 != -1637960559 * anInt119)
			class147.method2415(0, 0);
		else if (-1 != -1475818213 * anInt147)
			class147.method2415(0, 0);
		class180.method3163(is, 0, 36, 36, 32, -706039025).method2415(0, 0);
		if (-1 != anInt127 * 295433991)
			class147.method2415(0, 0);
		if (-1 != anInt132 * -73038935)
			class147.method2415(0, 0);
		if (i_42_ == 1 || 2 == i_42_ && (-1099072041 * anInt98 == 1 || i != 1) && -1 != i)
			class174.method2770(Class487.method7966(i, aClass6_80.aClass671_56, class615, -1102730229), 0, 9, -256, -16777215, 1377191258);
		is = class180.method3113(0, 0, 36, 32);
		for (int i_54_ = 0; i_54_ < is.length; i_54_++) {
			if ((is[i_54_] & 0xffffff) == 0)
				is[i_54_] = 0;
			else
				is[i_54_] |= ~0xffffff;
		}
		return is;
	}

	void method610(Class9 class9_55_, Class9 class9_56_, Class671 class671, int i) {
		method606(Class21.aClass21_207, class9_55_, class9_56_, Class53.aClass53_541, class671, (byte) 44);
	}

	public final Class176 method611(Class180 class180, int i, int i_57_, Class633 class633, Class695 class695, int i_58_, int i_59_, int i_60_, int i_61_, int i_62_) {
		if (anIntArray125 != null && i_57_ > 1) {
			int i_63_ = -1;
			for (int i_64_ = 0; i_64_ < 10; i_64_++) {
				if (i_57_ >= anIntArray126[i_64_] && 0 != anIntArray126[i_64_])
					i_63_ = anIntArray125[i_64_];
			}
			if (i_63_ != -1)
				return (((Class9) anInterface13_79.method81(i_63_, 773263524)).method611(class180, i, 1, class633, class695, i_58_, i_59_, i_60_, i_61_, -1901021476));
		}
		int i_65_ = i;
		if (null != class695)
			i_65_ |= class695.method14174(-822649352);
		Class176 class176;
		synchronized (aClass6_80.aClass205_60) {
			class176 = ((Class176) (aClass6_80.aClass205_60.method3787((long) (107322467 * anInt136 | -397006101 * class180.anInt2064 << 29))));
		}
		if (class176 == null || class180.method3175(class176.method2874(), i_65_) != 0) {
			if (null != class176)
				i_65_ = class180.method3176(i_65_, class176.method2874());
			int i_66_ = i_65_;
			if (null != aShortArray88)
				i_66_ |= 0x8000;
			if (aShortArray85 != null || class633 != null)
				i_66_ |= 0x4000;
			if (1074235593 * anInt135 != 128)
				i_66_ |= 0x1;
			if (anInt89 * 357000625 != 128)
				i_66_ |= 0x2;
			if (904694623 * anInt137 != 128)
				i_66_ |= 0x4;
			Class175 class175 = Class175.method2814(aClass6_80.aClass459_54, -1703972677 * anInt83, 0);
			if (class175 == null)
				return null;
			if (class175.anInt1905 < 13)
				class175.method2829(2);
			class176 = class180.method3376(class175, i_66_, aClass6_80.anInt61 * -1303365985, 64 + -2087822739 * anInt93, anInt115 * 316154401 + 850);
			if (1074235593 * anInt135 != 128 || 128 != 357000625 * anInt89 || anInt137 * 904694623 != 128)
				class176.method2872(1074235593 * anInt135, anInt89 * 357000625, 904694623 * anInt137);
			if (aShortArray85 != null) {
				for (int i_67_ = 0; i_67_ < aShortArray85.length; i_67_++) {
					if (null != aByteArray87 && i_67_ < aByteArray87.length)
						class176.method2907(aShortArray85[i_67_], (aShortArray78[aByteArray87[i_67_] & 0xff]));
					else
						class176.method2907(aShortArray85[i_67_], aShortArray86[i_67_]);
				}
			}
			if (null != aShortArray88) {
				for (int i_68_ = 0; i_68_ < aShortArray88.length; i_68_++)
					class176.method2909(aShortArray88[i_68_], aShortArray131[i_68_]);
			}
			if (null != class633) {
				for (int i_69_ = 0; i_69_ < 10; i_69_++) {
					for (int i_70_ = 0; i_70_ < Class193.aShortArrayArray2156[i_69_].length; i_70_++) {
						if (class633.anIntArray8285[i_69_] < (Class487.aShortArrayArrayArray5470[i_69_][i_70_]).length)
							class176.method2907(Class193.aShortArrayArray2156[i_69_][i_70_], (Class487.aShortArrayArrayArray5470[i_69_][i_70_][class633.anIntArray8285[i_69_]]));
					}
				}
				for (int i_71_ = 0; i_71_ < 10; i_71_++) {
					for (int i_72_ = 0; i_72_ < Class552.aShortArrayArray7313[i_71_].length; i_72_++) {
						if (class633.anIntArray8282[i_71_] < (Class78.aShortArrayArrayArray802[i_71_][i_72_]).length)
							class176.method2909(Class552.aShortArrayArray7313[i_71_][i_72_], (Class78.aShortArrayArrayArray802[i_71_][i_72_][class633.anIntArray8282[i_71_]]));
					}
				}
			}
			class176.method2941(i_65_);
			synchronized (aClass6_80.aClass205_60) {
				aClass6_80.aClass205_60.method3790(class176, (long) (anInt136 * 107322467 | class180.anInt2064 * -397006101 << 29));
			}
		}
		if (null != class695 || 0 != i_61_) {
			class176 = class176.method2862((byte) 1, i_65_, true);
			if (null != class695)
				class695.method14175(class176, 0, (byte) 0);
			if (i_61_ != 0)
				class176.method2986(i_58_, i_59_, i_60_, i_61_);
		}
		class176.method2941(i);
		return class176;
	}

	public Class9 method612(int i, int i_73_) {
		if (anIntArray125 != null && i > 1) {
			int i_74_ = -1;
			for (int i_75_ = 0; i_75_ < 10; i_75_++) {
				if (i >= anIntArray126[i_75_] && anIntArray126[i_75_] != 0)
					i_74_ = anIntArray125[i_75_];
			}
			if (-1 != i_74_)
				return (Class9) anInterface13_79.method81(i_74_, 594214131);
		}
		return this;
	}

	int[] method613(Class180 class180, Class180 class180_76_, int i, int i_77_, int i_78_, boolean bool, int i_79_, Class174 class174, Class633 class633, Class615 class615, int i_80_) {
		Class175 class175 = Class175.method2814(aClass6_80.aClass459_54, anInt83 * -1703972677, 0);
		if (null == class175)
			return null;
		if (class175.anInt1905 < 13)
			class175.method2829(2);
		if (null != aShortArray85) {
			for (int i_81_ = 0; i_81_ < aShortArray85.length; i_81_++) {
				if (null != aByteArray87 && i_81_ < aByteArray87.length)
					class175.method2803(aShortArray85[i_81_], (aShortArray78[aByteArray87[i_81_] & 0xff]));
				else
					class175.method2803(aShortArray85[i_81_], aShortArray86[i_81_]);
			}
		}
		if (aShortArray88 != null) {
			for (int i_82_ = 0; i_82_ < aShortArray88.length; i_82_++)
				class175.method2853(aShortArray88[i_82_], aShortArray131[i_82_]);
		}
		if (class633 != null) {
			for (int i_83_ = 0; i_83_ < 10; i_83_++) {
				for (int i_84_ = 0; i_84_ < Class193.aShortArrayArray2156[i_83_].length; i_84_++) {
					if (class633.anIntArray8285[i_83_] < (Class487.aShortArrayArrayArray5470[i_83_][i_84_]).length)
						class175.method2803((Class193.aShortArrayArray2156[i_83_][i_84_]), (Class487.aShortArrayArrayArray5470[i_83_][i_84_][(class633.anIntArray8285[i_83_])]));
				}
			}
			for (int i_85_ = 0; i_85_ < 10; i_85_++) {
				for (int i_86_ = 0; i_86_ < Class552.aShortArrayArray7313[i_85_].length; i_86_++) {
					if (class633.anIntArray8282[i_85_] < (Class78.aShortArrayArrayArray802[i_85_][i_86_]).length)
						class175.method2853((Class552.aShortArrayArray7313[i_85_][i_86_]), (Class78.aShortArrayArrayArray802[i_85_][i_86_][(class633.anIntArray8282[i_85_])]));
				}
			}
		}
		int i_87_ = 2048;
		boolean bool_88_ = false;
		if (128 != anInt135 * 1074235593 || anInt89 * 357000625 != 128 || 128 != 904694623 * anInt137) {
			bool_88_ = true;
			i_87_ |= 0x7;
		}
		Class176 class176 = class180.method3376(class175, i_87_, 64, 64 + anInt93 * -2087822739, 768 + anInt115 * 316154401);
		if (!class176.method3035())
			return null;
		if (bool_88_)
			class176.method2872(anInt135 * 1074235593, anInt89 * 357000625, anInt137 * 904694623);
		Class147 class147 = null;
		if (-1 != 295433991 * anInt127) {
			class147 = aClass6_80.method570(class180, class180_76_, -1747830577 * anInt128, 10, 1, 0, true, true, 0, class174, class633, class615, anInterface13_79, (byte) 1);
			if (class147 == null)
				return null;
		} else if (anInt119 * -1637960559 != -1) {
			class147 = aClass6_80.method570(class180, class180_76_, -698413683 * anInt129, i, i_77_, i_78_, false, true, 0, class174, class633, class615, anInterface13_79, (byte) 1);
			if (class147 == null)
				return null;
		} else if (anInt147 * -1475818213 != -1) {
			class147 = aClass6_80.method570(class180, class180_76_, anInt146 * 723970487, i, i_77_, i_78_, false, true, 0, class174, class633, class615, anInterface13_79, (byte) 1);
			if (class147 == null)
				return null;
		} else if (-1 != -73038935 * anInt132) {
			class147 = aClass6_80.method570(class180, class180_76_, 1450438899 * anInt103, 10, 1, 0, true, true, 0, class174, class633, class615, anInterface13_79, (byte) 1);
			if (null == class147)
				return null;
		}
		int i_89_;
		if (bool)
			i_89_ = (int) ((double) (anInt92 * 1387730399) * 1.5) << 2;
		else if (2 == i_77_)
			i_89_ = (int) ((double) (anInt92 * 1387730399) * 1.04) << 2;
		else
			i_89_ = 1387730399 * anInt92 << 2;
		Class427 class427 = class180.method3364();
		Class427 class427_90_ = class180.method3171();
		class427_90_.method6752(16.0F, 16.0F, 512.0F, 512.0F, 50.0F, 2.14748365E9F, (float) class180.method3285(1681583177).method2728(), (float) class180.method3285(539647724).method2729());
		class180.method3183(class427_90_);
		class180.method3128(0, 0, class180.method3285(413382228).method2728(), class180.method3285(928359432).method2729());
		Class432 class432 = new Class432();
		class180.method3180(class432);
		class180.method3478(0.95F + (float) (Math.random() / 10.0));
		class180.method3157(16777215, 0.95F + (float) (Math.random() / 10.0), 0.95F + (float) (Math.random() / 10.0), -50.0F, -10.0F, -50.0F);
		Class432 class432_91_ = class180.method3172();
		class432_91_.method6890(0.0F, 0.0F, 1.0F, Class428.method6863(-(-451529449 * anInt95) << 3));
		class432_91_.method6936(0.0F, 1.0F, 0.0F, Class428.method6863(anInt94 * 608991827 << 3));
		class432_91_.method6896((float) (anInt138 * 288478567 << 2), (float) (((i_89_ * (Class428.anIntArray4825[-1615963605 * anInt107 << 3])) >> 14) - class176.method2896() / 2 + (anInt97 * 560960069 << 2)), (float) (((i_89_ * (Class428.anIntArray4819[-1615963605 * anInt107 << 3])) >> 14) + (560960069 * anInt97 << 2)));
		class432_91_.method6936(1.0F, 0.0F, 0.0F, Class428.method6863(-1615963605 * anInt107 << 3));
		class180.method3132(0, 0, 36, 32);
		class180.method3136(2, 0);
		class180.method3348(0, 0, 36, 32, 0, 0);
		class180.method3187(0, -1, 0);
		class176.method2889(class432_91_, null, 1);
		class180.method3183(class427);
		int[] is = class180.method3113(0, 0, 36, 32);
		if (i_77_ >= 1) {
			is = method608(is, -16777214, (byte) -96);
			if (i_77_ >= 2)
				is = method608(is, -1, (byte) 37);
		}
		if (i_78_ != 0)
			method615(is, i_78_, (byte) -108);
		if (-1 != -1637960559 * anInt119)
			class147.method2415(0, 0);
		else if (-1 != -1475818213 * anInt147)
			class147.method2415(0, 0);
		class180.method3163(is, 0, 36, 36, 32, -29352070).method2415(0, 0);
		if (-1 != anInt127 * 295433991)
			class147.method2415(0, 0);
		if (-1 != anInt132 * -73038935)
			class147.method2415(0, 0);
		if (i_79_ == 1 || 2 == i_79_ && (-1099072041 * anInt98 == 1 || i != 1) && -1 != i)
			class174.method2770(Class487.method7966(i, aClass6_80.aClass671_56, class615, 717275415), 0, 9, -256, -16777215, 1739994059);
		is = class180.method3113(0, 0, 36, 32);
		for (int i_92_ = 0; i_92_ < is.length; i_92_++) {
			if ((is[i_92_] & 0xffffff) == 0)
				is[i_92_] = 0;
			else
				is[i_92_] |= ~0xffffff;
		}
		return is;
	}

	public final boolean method614(boolean bool, Class23 class23, int i) {
		int i_93_;
		int i_94_;
		int i_95_;
		if (bool) {
			if (null != class23 && null != class23.anIntArray217) {
				i_93_ = class23.anIntArray217[0];
				i_94_ = class23.anIntArray217[1];
				i_95_ = class23.anIntArray217[2];
			} else {
				i_93_ = 1566897319 * anInt111;
				i_94_ = anInt99 * -291191067;
				i_95_ = anInt110 * 816794519;
			}
		} else if (null != class23 && class23.anIntArray222 != null) {
			i_93_ = class23.anIntArray222[0];
			i_94_ = class23.anIntArray222[1];
			i_95_ = class23.anIntArray222[2];
		} else {
			i_93_ = 705433971 * anInt90;
			i_94_ = -1198555409 * anInt116;
			i_95_ = anInt121 * -1591690929;
		}
		if (i_93_ == -1)
			return true;
		boolean bool_96_ = true;
		if (!aClass6_80.aClass459_54.method7479(i_93_, 0, 102380841))
			bool_96_ = false;
		if (-1 != i_94_ && !aClass6_80.aClass459_54.method7479(i_94_, 0, 102380841))
			bool_96_ = false;
		if (-1 != i_95_ && !aClass6_80.aClass459_54.method7479(i_95_, 0, 102380841))
			bool_96_ = false;
		return bool_96_;
	}

	void method615(int[] is, int i, byte i_97_) {
		for (int i_98_ = 31; i_98_ > 0; i_98_--) {
			int i_99_ = i_98_ * 36;
			for (int i_100_ = 35; i_100_ > 0; i_100_--) {
				if (is[i_100_ + i_99_] == 0 && is[i_100_ + i_99_ - 1 - 36] != 0)
					is[i_100_ + i_99_] = i;
			}
		}
	}

	public final Class175 method616(boolean bool, Class23 class23) {
		int i;
		int i_101_;
		if (bool) {
			if (class23 != null && class23.anIntArray226 != null) {
				i = class23.anIntArray226[0];
				i_101_ = class23.anIntArray226[1];
			} else {
				i = 2039549583 * anInt109;
				i_101_ = -2107841861 * anInt105;
			}
		} else if (null != class23 && class23.anIntArray224 != null) {
			i = class23.anIntArray224[0];
			i_101_ = class23.anIntArray224[1];
		} else {
			i = 1802376245 * anInt101;
			i_101_ = 1741113833 * anInt112;
		}
		if (i == -1)
			return null;
		Class175 class175 = Class175.method2814(aClass6_80.aClass459_54, i, 0);
		if (class175.anInt1905 < 13)
			class175.method2829(2);
		if (i_101_ != -1) {
			Class175 class175_102_ = Class175.method2814(aClass6_80.aClass459_54, i_101_, 0);
			if (class175_102_.anInt1905 < 13)
				class175_102_.method2829(2);
			Class175[] class175s = { class175, class175_102_ };
			class175 = new Class175(class175s, 2);
		}
		if (null != aShortArray85) {
			short[] is;
			if (class23 != null && class23.aShortArray218 != null)
				is = class23.aShortArray218;
			else
				is = aShortArray86;
			for (int i_103_ = 0; i_103_ < aShortArray85.length; i_103_++)
				class175.method2803(aShortArray85[i_103_], is[i_103_]);
		}
		if (null != aShortArray88) {
			short[] is;
			if (null != class23 && null != class23.aShortArray227)
				is = class23.aShortArray227;
			else
				is = aShortArray131;
			for (int i_104_ = 0; i_104_ < aShortArray88.length; i_104_++)
				class175.method2853(aShortArray88[i_104_], is[i_104_]);
		}
		return class175;
	}

	public final Class175 method617(boolean bool, Class23 class23, int i) {
		int i_105_;
		int i_106_;
		int i_107_;
		if (bool) {
			if (null != class23 && null != class23.anIntArray217) {
				i_105_ = class23.anIntArray217[0];
				i_106_ = class23.anIntArray217[1];
				i_107_ = class23.anIntArray217[2];
			} else {
				i_105_ = 1566897319 * anInt111;
				i_106_ = -291191067 * anInt99;
				i_107_ = anInt110 * 816794519;
			}
		} else if (class23 != null && null != class23.anIntArray222) {
			i_105_ = class23.anIntArray222[0];
			i_106_ = class23.anIntArray222[1];
			i_107_ = class23.anIntArray222[2];
		} else {
			i_105_ = 705433971 * anInt90;
			i_106_ = -1198555409 * anInt116;
			i_107_ = anInt121 * -1591690929;
		}
		if (-1 == i_105_)
			return null;
		Class175 class175 = Class175.method2814(aClass6_80.aClass459_54, i_105_, 0);
		if (null == class175)
			return null;
		if (class175.anInt1905 < 13)
			class175.method2829(2);
		if (i_106_ != -1) {
			Class175 class175_108_ = Class175.method2814(aClass6_80.aClass459_54, i_106_, 0);
			if (class175_108_.anInt1905 < 13)
				class175_108_.method2829(2);
			if (-1 != i_107_) {
				Class175 class175_109_ = Class175.method2814(aClass6_80.aClass459_54, i_107_, 0);
				if (class175_109_.anInt1905 < 13)
					class175_109_.method2829(2);
				Class175[] class175s = { class175, class175_108_, class175_109_ };
				class175 = new Class175(class175s, 3);
			} else {
				Class175[] class175s = { class175, class175_108_ };
				class175 = new Class175(class175s, 2);
			}
		}
		if (!bool && (-475298717 * anInt114 != 0 || anInt117 * -2030307987 != 0 || 0 != anInt96 * -993221861))
			class175.method2812(anInt114 * -475298717, -2030307987 * anInt117, -993221861 * anInt96);
		if (bool && (0 != anInt130 * 241241791 || 0 != 900791399 * anInt118 || 0 != 397289369 * anInt120))
			class175.method2812(anInt130 * 241241791, 900791399 * anInt118, anInt120 * 397289369);
		if (null != aShortArray85) {
			short[] is;
			if (null != class23 && null != class23.aShortArray218)
				is = class23.aShortArray218;
			else
				is = aShortArray86;
			for (int i_110_ = 0; i_110_ < aShortArray85.length; i_110_++)
				class175.method2803(aShortArray85[i_110_], is[i_110_]);
		}
		if (aShortArray88 != null) {
			short[] is;
			if (null != class23 && null != class23.aShortArray227)
				is = class23.aShortArray227;
			else
				is = aShortArray131;
			for (int i_111_ = 0; i_111_ < aShortArray88.length; i_111_++)
				class175.method2853(aShortArray88[i_111_], is[i_111_]);
		}
		return class175;
	}

	public final boolean method618(boolean bool, Class23 class23, int i) {
		int i_112_;
		int i_113_;
		if (bool) {
			if (class23 != null && null != class23.anIntArray226) {
				i_112_ = class23.anIntArray226[0];
				i_113_ = class23.anIntArray226[1];
			} else {
				i_112_ = anInt109 * 2039549583;
				i_113_ = anInt105 * -2107841861;
			}
		} else if (null != class23 && class23.anIntArray224 != null) {
			i_112_ = class23.anIntArray224[0];
			i_113_ = class23.anIntArray224[1];
		} else {
			i_112_ = anInt101 * 1802376245;
			i_113_ = 1741113833 * anInt112;
		}
		if (i_112_ == -1)
			return true;
		boolean bool_114_ = true;
		if (!aClass6_80.aClass459_54.method7479(i_112_, 0, 102380841))
			bool_114_ = false;
		if (i_113_ != -1 && !aClass6_80.aClass459_54.method7479(i_113_, 0, 102380841))
			bool_114_ = false;
		return bool_114_;
	}

	void method619(Class21 class21, Class9 class9_115_, Class9 class9_116_, Class53 class53, Class671 class671) {
		anInt83 = 1 * class9_115_.anInt83;
		anInt92 = class9_115_.anInt92 * 1;
		anInt107 = 1 * class9_115_.anInt107;
		anInt94 = class9_115_.anInt94 * 1;
		anInt95 = class9_115_.anInt95 * 1;
		anInt138 = class9_115_.anInt138 * 1;
		anInt97 = 1 * class9_115_.anInt97;
		Class9 class9_117_ = class21 == Class21.aClass21_209 ? class9_115_ : class9_116_;
		aShortArray85 = class9_117_.aShortArray85;
		aShortArray86 = class9_117_.aShortArray86;
		aByteArray87 = class9_117_.aByteArray87;
		aShortArray88 = class9_117_.aShortArray88;
		aShortArray131 = class9_117_.aShortArray131;
		aString84 = class9_116_.aString84;
		aBool122 = class9_116_.aBool122;
		if (class21 == Class21.aClass21_209) {
			anInt100 = class9_116_.anInt100 * 1;
			anInt98 = -1126447641;
		} else if (class21 == Class21.aClass21_207) {
			aString84 = class9_116_.aString141;
			anInt100 = (int) Math.floor((double) (class9_116_.anInt100 * -1204628591 / (class9_116_.anInt134 * 1388854815))) * 1980648817;
			anInt98 = -1126447641;
			aBool73 = class9_116_.aBool73;
			anInt82 = class9_115_.anInt82 * 1;
			anIntArray104 = class9_115_.anIntArray104;
			anIntArray124 = class9_115_.anIntArray124;
			aStringArray102 = new String[5];
			aStringArray102[0] = Class53.aClass53_539.method1290(class671, (byte) -92);
			aStringArray102[4] = class53.method1290(class671, (byte) -92);
		} else {
			anInt100 = 0;
			anInt98 = class9_116_.anInt98 * 1;
			anInt106 = 1 * class9_116_.anInt106;
			anInt123 = class9_116_.anInt123 * 1;
			anInt108 = 1 * class9_116_.anInt108;
			anInt90 = class9_116_.anInt90 * 1;
			anInt116 = class9_116_.anInt116 * 1;
			anInt121 = class9_116_.anInt121 * 1;
			anInt111 = class9_116_.anInt111 * 1;
			anInt99 = class9_116_.anInt99 * 1;
			anInt110 = 1 * class9_116_.anInt110;
			anInt114 = class9_116_.anInt114 * 1;
			anInt130 = class9_116_.anInt130 * 1;
			anInt117 = 1 * class9_116_.anInt117;
			anInt118 = 1 * class9_116_.anInt118;
			anInt96 = class9_116_.anInt96 * 1;
			anInt120 = class9_116_.anInt120 * 1;
			anInt101 = 1 * class9_116_.anInt101;
			anInt112 = 1 * class9_116_.anInt112;
			anInt109 = 1 * class9_116_.anInt109;
			anInt105 = class9_116_.anInt105 * 1;
			anInt82 = 1 * class9_116_.anInt82;
			anInt140 = class9_116_.anInt140 * 1;
			aStringArray133 = class9_116_.aStringArray133;
			aClass14_143 = class9_116_.aClass14_143;
			aStringArray102 = new String[5];
			if (class9_116_.aStringArray102 != null) {
				for (int i = 0; i < 4; i++)
					aStringArray102[i] = class9_116_.aStringArray102[i];
			}
			aStringArray102[4] = class53.method1290(class671, (byte) -48);
		}
	}

	public int method620(int i, int i_118_, byte i_119_) {
		if (aClass14_143 == null)
			return i_118_;
		Node_Sub6 class527_sub7 = (Node_Sub6) aClass14_143.method709((long) i);
		if (class527_sub7 == null)
			return i_118_;
		return -78845949 * class527_sub7.anInt10398;
	}

	public void method86(int i) {
		if (-1 != anInt127 * 295433991)
			method659((Class9) anInterface13_79.method81(295433991 * anInt127, 368738304), ((Class9) anInterface13_79.method81(anInt128 * -1747830577, -543942059)), aClass6_80.aClass671_56, (byte) 97);
		else if (-1637960559 * anInt119 != -1)
			method629(((Class9) anInterface13_79.method81(anInt119 * -1637960559, -1027524572)), (Class9) anInterface13_79.method81(anInt129 * -698413683, 815092873), aClass6_80.aClass671_56, 1501460769);
		else if (-1 != anInt147 * -1475818213)
			method654((Class9) anInterface13_79.method81(-1475818213 * anInt147, 92666730), (Class9) anInterface13_79.method81(anInt146 * 723970487, -1686301514), aClass6_80.aClass671_56, 1363291121);
		else if (-1 != -73038935 * anInt132)
			method610((Class9) anInterface13_79.method81(-73038935 * anInt132, -928589476), (Class9) anInterface13_79.method81(anInt103 * 1450438899, 1299128951), aClass6_80.aClass671_56, 579281983);
		if (!aClass6_80.aBool57 && aBool122) {
			anInt140 = 0;
			aStringArray133 = aClass6_80.aStringArray62;
			aStringArray102 = aClass6_80.aStringArray63;
			aBool73 = false;
			anIntArray113 = null;
			if (aClass14_143 != null) {
				boolean bool = false;
				for (Class527 class527 = aClass14_143.method713((byte) 12); class527 != null; class527 = aClass14_143.method717(1098075174)) {
					Class80 class80 = (Class80) (aClass6_80.anInterface13_55.method81((int) (-8168620736534281759L * class527.aLong7106), -87977841));
					if (class80.aBool803)
						class527.method8735(-1889161967);
					else
						bool = true;
				}
				if (!bool)
					aClass14_143 = null;
			}
		}
	}

	public int method621(int i, int i_120_) {
		if (null == anIntArray104)
			return -1;
		return anIntArray104[i];
	}

	public int method622(int i) {
		if (null == anIntArray104)
			return -1;
		return anIntArray104[i];
	}

	public void method83(RSByteBuffer class527_sub38) {
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			if (i == 0)
				break;
			method605(class527_sub38, i, (short) 350);
		}
	}

	public void method73(RSByteBuffer class527_sub38) {
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			if (i == 0)
				break;
			method605(class527_sub38, i, (short) 350);
		}
	}

	public void method85() {
		if (-1 != anInt127 * 295433991)
			method659((Class9) anInterface13_79.method81(295433991 * anInt127, -345142130), ((Class9) anInterface13_79.method81(anInt128 * -1747830577, -1051872861)), aClass6_80.aClass671_56, (byte) 66);
		else if (-1637960559 * anInt119 != -1)
			method629(((Class9) anInterface13_79.method81(anInt119 * -1637960559, 632976923)), (Class9) anInterface13_79.method81(anInt129 * -698413683, 391241329), aClass6_80.aClass671_56, 1824125440);
		else if (-1 != anInt147 * -1475818213)
			method654(((Class9) anInterface13_79.method81(-1475818213 * anInt147, -1557505490)), (Class9) anInterface13_79.method81(anInt146 * 723970487, 1267833144), aClass6_80.aClass671_56, 2141111468);
		else if (-1 != -73038935 * anInt132)
			method610((Class9) anInterface13_79.method81(-73038935 * anInt132, 1263866741), (Class9) anInterface13_79.method81(anInt103 * 1450438899, -1796981445), aClass6_80.aClass671_56, 579281983);
		if (!aClass6_80.aBool57 && aBool122) {
			anInt140 = 0;
			aStringArray133 = aClass6_80.aStringArray62;
			aStringArray102 = aClass6_80.aStringArray63;
			aBool73 = false;
			anIntArray113 = null;
			if (aClass14_143 != null) {
				boolean bool = false;
				for (Class527 class527 = aClass14_143.method713((byte) 5); class527 != null; class527 = aClass14_143.method717(2070655183)) {
					Class80 class80 = (Class80) (aClass6_80.anInterface13_55.method81((int) (-8168620736534281759L * class527.aLong7106), -1136018369));
					if (class80.aBool803)
						class527.method8735(-1889161967);
					else
						bool = true;
				}
				if (!bool)
					aClass14_143 = null;
			}
		}
	}

	public int method623(int i, int i_121_) {
		if (null == anIntArray124)
			return -1;
		return anIntArray124[i];
	}

	void method624(RSByteBuffer class527_sub38, int i) {
		if (i == 1)
			anInt83 = class527_sub38.method16466(-2096303482) * 1932088435;
		else if (2 == i)
			aString84 = class527_sub38.readString(1894139709);
		else if (i == 4)
			anInt92 = class527_sub38.readUnsignedShort() * -1684871649;
		else if (5 == i)
			anInt107 = class527_sub38.readUnsignedShort() * -663382909;
		else if (i == 6)
			anInt94 = class527_sub38.readUnsignedShort() * -684598821;
		else if (i == 7) {
			anInt138 = class527_sub38.readUnsignedShort() * -1210747305;
			if (anInt138 * 288478567 > 32767)
				anInt138 -= 1985413120;
		} else if (8 == i) {
			anInt97 = class527_sub38.readUnsignedShort() * -614879091;
			if (560960069 * anInt97 > 32767)
				anInt97 -= -1332936704;
		} else if (i == 11)
			anInt98 = -1126447641;
		else if (12 == i)
			anInt100 = class527_sub38.readInt() * 1980648817;
		else if (i == 13)
			anInt106 = class527_sub38.readUnsignedByte() * 1572536855;
		else if (14 == i)
			anInt123 = class527_sub38.readUnsignedByte() * -216271905;
		else if (16 == i)
			aBool122 = true;
		else if (i == 18)
			anInt139 = class527_sub38.readUnsignedShort() * -816412701;
		else if (23 == i)
			anInt90 = class527_sub38.method16466(-2104929409) * -1463845957;
		else if (i == 24)
			anInt116 = class527_sub38.method16466(-1897098666) * -1461620721;
		else if (i == 25)
			anInt111 = class527_sub38.method16466(-2084492793) * 329347863;
		else if (26 == i)
			anInt99 = class527_sub38.method16466(-1835362505) * -562526483;
		else if (i == 27)
			anInt108 = class527_sub38.readUnsignedByte() * 1203660899;
		else if (i >= 30 && i < 35)
			aStringArray133[i - 30] = class527_sub38.readString(1182785196);
		else if (i >= 35 && i < 40)
			aStringArray102[i - 35] = class527_sub38.readString(1736065124);
		else if (i == 40) {
			int i_122_ = class527_sub38.readUnsignedByte();
			aShortArray85 = new short[i_122_];
			aShortArray86 = new short[i_122_];
			for (int i_123_ = 0; i_123_ < i_122_; i_123_++) {
				aShortArray85[i_123_] = (short) class527_sub38.readUnsignedShort();
				aShortArray86[i_123_] = (short) class527_sub38.readUnsignedShort();
			}
		} else if (41 == i) {
			int i_124_ = class527_sub38.readUnsignedByte();
			aShortArray88 = new short[i_124_];
			aShortArray131 = new short[i_124_];
			for (int i_125_ = 0; i_125_ < i_124_; i_125_++) {
				aShortArray88[i_125_] = (short) class527_sub38.readUnsignedShort();
				aShortArray131[i_125_] = (short) class527_sub38.readUnsignedShort();
			}
		} else if (42 == i) {
			int i_126_ = class527_sub38.readUnsignedByte();
			aByteArray87 = new byte[i_126_];
			for (int i_127_ = 0; i_127_ < i_126_; i_127_++)
				aByteArray87[i_127_] = class527_sub38.readByte();
		} else if (43 == i) {
			anInt149 = class527_sub38.readInt() * -258699533;
			aBool148 = true;
		} else if (44 == i) {
			int i_128_ = class527_sub38.readUnsignedShort();
			int i_129_ = 0;
			for (int i_130_ = i_128_; i_130_ > 0; i_130_ >>= 1)
				i_129_++;
			aByteArray142 = new byte[i_129_];
			byte i_131_ = 0;
			for (int i_132_ = 0; i_132_ < i_129_; i_132_++) {
				if ((i_128_ & 1 << i_132_) > 0) {
					aByteArray142[i_132_] = i_131_;
					i_131_++;
				} else
					aByteArray142[i_132_] = (byte) -1;
			}
		} else if (i == 45) {
			int i_133_ = class527_sub38.readUnsignedShort();
			int i_134_ = 0;
			for (int i_135_ = i_133_; i_135_ > 0; i_135_ >>= 1)
				i_134_++;
			aByteArray91 = new byte[i_134_];
			byte i_136_ = 0;
			for (int i_137_ = 0; i_137_ < i_134_; i_137_++) {
				if ((i_133_ & 1 << i_137_) > 0) {
					aByteArray91[i_137_] = i_136_;
					i_136_++;
				} else
					aByteArray91[i_137_] = (byte) -1;
			}
		} else if (65 == i)
			aBool73 = true;
		else if (i == 78)
			anInt121 = class527_sub38.method16466(-1607787484) * -1735475793;
		else if (i == 79)
			anInt110 = class527_sub38.method16466(-1870542996) * -1125129177;
		else if (i == 90)
			anInt101 = class527_sub38.method16466(-1736003269) * 397647389;
		else if (91 == i)
			anInt109 = class527_sub38.method16466(-1922142255) * -661499793;
		else if (92 == i)
			anInt112 = class527_sub38.method16466(-1718483046) * 299769433;
		else if (i == 93)
			anInt105 = class527_sub38.method16466(-1603340004) * 1479479923;
		else if (i == 94)
			anInt82 = class527_sub38.readUnsignedShort() * -1550839219;
		else if (i == 95)
			anInt95 = class527_sub38.readUnsignedShort() * -1345432921;
		else if (96 == i)
			anInt144 = class527_sub38.readUnsignedByte() * 12248847;
		else if (97 == i)
			anInt128 = class527_sub38.readUnsignedShort() * -1199583697;
		else if (i == 98)
			anInt127 = class527_sub38.readUnsignedShort() * 1010157239;
		else if (i >= 100 && i < 110) {
			if (null == anIntArray125) {
				anIntArray125 = new int[10];
				anIntArray126 = new int[10];
			}
			anIntArray125[i - 100] = class527_sub38.readUnsignedShort();
			anIntArray126[i - 100] = class527_sub38.readUnsignedShort();
		} else if (110 == i)
			anInt135 = class527_sub38.readUnsignedShort() * -1845292679;
		else if (i == 111)
			anInt89 = class527_sub38.readUnsignedShort() * -1763458223;
		else if (112 == i)
			anInt137 = class527_sub38.readUnsignedShort() * -632254305;
		else if (i == 113)
			anInt93 = class527_sub38.readByte() * -1787052187;
		else if (i == 114)
			anInt115 = class527_sub38.readByte() * -1453627035;
		else if (115 == i)
			anInt140 = class527_sub38.readUnsignedByte() * -743508023;
		else if (121 == i)
			anInt129 = class527_sub38.readUnsignedShort() * 1882324293;
		else if (i == 122)
			anInt119 = class527_sub38.readUnsignedShort() * 331582577;
		else if (i == 125) {
			anInt114 = (class527_sub38.readByte() << 2) * 529210699;
			anInt117 = (class527_sub38.readByte() << 2) * 769219685;
			anInt96 = (class527_sub38.readByte() << 2) * 948502291;
		} else if (i == 126) {
			anInt130 = (class527_sub38.readByte() << 2) * 1496932671;
			anInt118 = (class527_sub38.readByte() << 2) * 1431330647;
			anInt120 = (class527_sub38.readByte() << 2) * -356500311;
		} else if (127 == i || i == 128 || i == 129 || 130 == i) {
			class527_sub38.readUnsignedByte();
			class527_sub38.readUnsignedShort();
		} else if (132 == i) {
			int i_138_ = class527_sub38.readUnsignedByte();
			anIntArray113 = new int[i_138_];
			for (int i_139_ = 0; i_139_ < i_138_; i_139_++)
				anIntArray113[i_139_] = class527_sub38.readUnsignedShort();
		} else if (134 == i)
			anInt145 = class527_sub38.readUnsignedByte() * -218964887;
		else if (139 == i)
			anInt146 = class527_sub38.readUnsignedShort() * -1896004601;
		else if (140 == i)
			anInt147 = class527_sub38.readUnsignedShort() * 733594899;
		else if (i >= 142 && i < 147) {
			if (anIntArray104 == null) {
				anIntArray104 = new int[6];
				Arrays.fill(anIntArray104, -1);
			}
			anIntArray104[i - 142] = class527_sub38.readUnsignedShort();
		} else if (i >= 150 && i < 155) {
			if (anIntArray124 == null) {
				anIntArray124 = new int[5];
				Arrays.fill(anIntArray124, -1);
			}
			anIntArray124[i - 150] = class527_sub38.readUnsignedShort();
		} else if (i != 156) {
			if (i == 157)
				aBool150 = true;
			else if (161 == i)
				anInt103 = class527_sub38.readUnsignedShort() * -1741117381;
			else if (i == 162)
				anInt132 = class527_sub38.readUnsignedShort() * -2027695975;
			else if (163 == i)
				anInt134 = class527_sub38.readUnsignedShort() * -1851015713;
			else if (i == 164)
				aString141 = class527_sub38.readString(1930930149);
			else if (165 == i)
				anInt98 = 2042072014;
			else if (i == 249) {
				int i_140_ = class527_sub38.readUnsignedByte();
				if (null == aClass14_143) {
					int i_141_ = Class186.method3652(i_140_, 355741777);
					aClass14_143 = new Class14(i_141_);
				}
				for (int i_142_ = 0; i_142_ < i_140_; i_142_++) {
					boolean bool = class527_sub38.readUnsignedByte() == 1;
					int i_143_ = class527_sub38.read24BitUnsignedInteger(947245341);
					Class527 class527;
					if (bool)
						class527 = new Class527_Sub26(class527_sub38.readString(2049051464));
					else
						class527 = new Node_Sub6(class527_sub38.readInt());
					aClass14_143.method714(class527, (long) i_143_);
				}
			}
		}
	}

	void method625(RSByteBuffer class527_sub38, int i) {
		if (i == 1)
			anInt83 = class527_sub38.method16466(-1764465684) * 1932088435;
		else if (2 == i)
			aString84 = class527_sub38.readString(1545820278);
		else if (i == 4)
			anInt92 = class527_sub38.readUnsignedShort() * -1684871649;
		else if (5 == i)
			anInt107 = class527_sub38.readUnsignedShort() * -663382909;
		else if (i == 6)
			anInt94 = class527_sub38.readUnsignedShort() * -684598821;
		else if (i == 7) {
			anInt138 = class527_sub38.readUnsignedShort() * -1210747305;
			if (anInt138 * 288478567 > 32767)
				anInt138 -= 1985413120;
		} else if (8 == i) {
			anInt97 = class527_sub38.readUnsignedShort() * -614879091;
			if (560960069 * anInt97 > 32767)
				anInt97 -= -1332936704;
		} else if (i == 11)
			anInt98 = -1126447641;
		else if (12 == i)
			anInt100 = class527_sub38.readInt() * 1980648817;
		else if (i == 13)
			anInt106 = class527_sub38.readUnsignedByte() * 1572536855;
		else if (14 == i)
			anInt123 = class527_sub38.readUnsignedByte() * -216271905;
		else if (16 == i)
			aBool122 = true;
		else if (i == 18)
			anInt139 = class527_sub38.readUnsignedShort() * -816412701;
		else if (23 == i)
			anInt90 = class527_sub38.method16466(-1762241951) * -1463845957;
		else if (i == 24)
			anInt116 = class527_sub38.method16466(-1957717678) * -1461620721;
		else if (i == 25)
			anInt111 = class527_sub38.method16466(-1601326846) * 329347863;
		else if (26 == i)
			anInt99 = class527_sub38.method16466(-1629367447) * -562526483;
		else if (i == 27)
			anInt108 = class527_sub38.readUnsignedByte() * 1203660899;
		else if (i >= 30 && i < 35)
			aStringArray133[i - 30] = class527_sub38.readString(827940387);
		else if (i >= 35 && i < 40)
			aStringArray102[i - 35] = class527_sub38.readString(1983468640);
		else if (i == 40) {
			int i_144_ = class527_sub38.readUnsignedByte();
			aShortArray85 = new short[i_144_];
			aShortArray86 = new short[i_144_];
			for (int i_145_ = 0; i_145_ < i_144_; i_145_++) {
				aShortArray85[i_145_] = (short) class527_sub38.readUnsignedShort();
				aShortArray86[i_145_] = (short) class527_sub38.readUnsignedShort();
			}
		} else if (41 == i) {
			int i_146_ = class527_sub38.readUnsignedByte();
			aShortArray88 = new short[i_146_];
			aShortArray131 = new short[i_146_];
			for (int i_147_ = 0; i_147_ < i_146_; i_147_++) {
				aShortArray88[i_147_] = (short) class527_sub38.readUnsignedShort();
				aShortArray131[i_147_] = (short) class527_sub38.readUnsignedShort();
			}
		} else if (42 == i) {
			int i_148_ = class527_sub38.readUnsignedByte();
			aByteArray87 = new byte[i_148_];
			for (int i_149_ = 0; i_149_ < i_148_; i_149_++)
				aByteArray87[i_149_] = class527_sub38.readByte();
		} else if (43 == i) {
			anInt149 = class527_sub38.readInt() * -258699533;
			aBool148 = true;
		} else if (44 == i) {
			int i_150_ = class527_sub38.readUnsignedShort();
			int i_151_ = 0;
			for (int i_152_ = i_150_; i_152_ > 0; i_152_ >>= 1)
				i_151_++;
			aByteArray142 = new byte[i_151_];
			byte i_153_ = 0;
			for (int i_154_ = 0; i_154_ < i_151_; i_154_++) {
				if ((i_150_ & 1 << i_154_) > 0) {
					aByteArray142[i_154_] = i_153_;
					i_153_++;
				} else
					aByteArray142[i_154_] = (byte) -1;
			}
		} else if (i == 45) {
			int i_155_ = class527_sub38.readUnsignedShort();
			int i_156_ = 0;
			for (int i_157_ = i_155_; i_157_ > 0; i_157_ >>= 1)
				i_156_++;
			aByteArray91 = new byte[i_156_];
			byte i_158_ = 0;
			for (int i_159_ = 0; i_159_ < i_156_; i_159_++) {
				if ((i_155_ & 1 << i_159_) > 0) {
					aByteArray91[i_159_] = i_158_;
					i_158_++;
				} else
					aByteArray91[i_159_] = (byte) -1;
			}
		} else if (65 == i)
			aBool73 = true;
		else if (i == 78)
			anInt121 = class527_sub38.method16466(-1820896766) * -1735475793;
		else if (i == 79)
			anInt110 = class527_sub38.method16466(-1617804836) * -1125129177;
		else if (i == 90)
			anInt101 = class527_sub38.method16466(-1739909369) * 397647389;
		else if (91 == i)
			anInt109 = class527_sub38.method16466(-1594371211) * -661499793;
		else if (92 == i)
			anInt112 = class527_sub38.method16466(-1951735162) * 299769433;
		else if (i == 93)
			anInt105 = class527_sub38.method16466(-2043844215) * 1479479923;
		else if (i == 94)
			anInt82 = class527_sub38.readUnsignedShort() * -1550839219;
		else if (i == 95)
			anInt95 = class527_sub38.readUnsignedShort() * -1345432921;
		else if (96 == i)
			anInt144 = class527_sub38.readUnsignedByte() * 12248847;
		else if (97 == i)
			anInt128 = class527_sub38.readUnsignedShort() * -1199583697;
		else if (i == 98)
			anInt127 = class527_sub38.readUnsignedShort() * 1010157239;
		else if (i >= 100 && i < 110) {
			if (null == anIntArray125) {
				anIntArray125 = new int[10];
				anIntArray126 = new int[10];
			}
			anIntArray125[i - 100] = class527_sub38.readUnsignedShort();
			anIntArray126[i - 100] = class527_sub38.readUnsignedShort();
		} else if (110 == i)
			anInt135 = class527_sub38.readUnsignedShort() * -1845292679;
		else if (i == 111)
			anInt89 = class527_sub38.readUnsignedShort() * -1763458223;
		else if (112 == i)
			anInt137 = class527_sub38.readUnsignedShort() * -632254305;
		else if (i == 113)
			anInt93 = class527_sub38.readByte() * -1787052187;
		else if (i == 114)
			anInt115 = class527_sub38.readByte() * -1453627035;
		else if (115 == i)
			anInt140 = class527_sub38.readUnsignedByte() * -743508023;
		else if (121 == i)
			anInt129 = class527_sub38.readUnsignedShort() * 1882324293;
		else if (i == 122)
			anInt119 = class527_sub38.readUnsignedShort() * 331582577;
		else if (i == 125) {
			anInt114 = (class527_sub38.readByte() << 2) * 529210699;
			anInt117 = (class527_sub38.readByte() << 2) * 769219685;
			anInt96 = (class527_sub38.readByte() << 2) * 948502291;
		} else if (i == 126) {
			anInt130 = (class527_sub38.readByte() << 2) * 1496932671;
			anInt118 = (class527_sub38.readByte() << 2) * 1431330647;
			anInt120 = (class527_sub38.readByte() << 2) * -356500311;
		} else if (127 == i || i == 128 || i == 129 || 130 == i) {
			class527_sub38.readUnsignedByte();
			class527_sub38.readUnsignedShort();
		} else if (132 == i) {
			int i_160_ = class527_sub38.readUnsignedByte();
			anIntArray113 = new int[i_160_];
			for (int i_161_ = 0; i_161_ < i_160_; i_161_++)
				anIntArray113[i_161_] = class527_sub38.readUnsignedShort();
		} else if (134 == i)
			anInt145 = class527_sub38.readUnsignedByte() * -218964887;
		else if (139 == i)
			anInt146 = class527_sub38.readUnsignedShort() * -1896004601;
		else if (140 == i)
			anInt147 = class527_sub38.readUnsignedShort() * 733594899;
		else if (i >= 142 && i < 147) {
			if (anIntArray104 == null) {
				anIntArray104 = new int[6];
				Arrays.fill(anIntArray104, -1);
			}
			anIntArray104[i - 142] = class527_sub38.readUnsignedShort();
		} else if (i >= 150 && i < 155) {
			if (anIntArray124 == null) {
				anIntArray124 = new int[5];
				Arrays.fill(anIntArray124, -1);
			}
			anIntArray124[i - 150] = class527_sub38.readUnsignedShort();
		} else if (i != 156) {
			if (i == 157)
				aBool150 = true;
			else if (161 == i)
				anInt103 = class527_sub38.readUnsignedShort() * -1741117381;
			else if (i == 162)
				anInt132 = class527_sub38.readUnsignedShort() * -2027695975;
			else if (163 == i)
				anInt134 = class527_sub38.readUnsignedShort() * -1851015713;
			else if (i == 164)
				aString141 = class527_sub38.readString(2041483783);
			else if (165 == i)
				anInt98 = 2042072014;
			else if (i == 249) {
				int i_162_ = class527_sub38.readUnsignedByte();
				if (null == aClass14_143) {
					int i_163_ = Class186.method3652(i_162_, 210708633);
					aClass14_143 = new Class14(i_163_);
				}
				for (int i_164_ = 0; i_164_ < i_162_; i_164_++) {
					boolean bool = class527_sub38.readUnsignedByte() == 1;
					int i_165_ = class527_sub38.read24BitUnsignedInteger(1841478743);
					Class527 class527;
					if (bool)
						class527 = new Class527_Sub26(class527_sub38.readString(844314479));
					else
						class527 = new Node_Sub6(class527_sub38.readInt());
					aClass14_143.method714(class527, (long) i_165_);
				}
			}
		}
	}

	void method626(RSByteBuffer class527_sub38, int i) {
		if (i == 1)
			anInt83 = class527_sub38.method16466(-1660202552) * 1932088435;
		else if (2 == i)
			aString84 = class527_sub38.readString(2108457935);
		else if (i == 4)
			anInt92 = class527_sub38.readUnsignedShort() * -1684871649;
		else if (5 == i)
			anInt107 = class527_sub38.readUnsignedShort() * -663382909;
		else if (i == 6)
			anInt94 = class527_sub38.readUnsignedShort() * -684598821;
		else if (i == 7) {
			anInt138 = class527_sub38.readUnsignedShort() * -1210747305;
			if (anInt138 * 288478567 > 32767)
				anInt138 -= 1985413120;
		} else if (8 == i) {
			anInt97 = class527_sub38.readUnsignedShort() * -614879091;
			if (560960069 * anInt97 > 32767)
				anInt97 -= -1332936704;
		} else if (i == 11)
			anInt98 = -1126447641;
		else if (12 == i)
			anInt100 = class527_sub38.readInt() * 1980648817;
		else if (i == 13)
			anInt106 = class527_sub38.readUnsignedByte() * 1572536855;
		else if (14 == i)
			anInt123 = class527_sub38.readUnsignedByte() * -216271905;
		else if (16 == i)
			aBool122 = true;
		else if (i == 18)
			anInt139 = class527_sub38.readUnsignedShort() * -816412701;
		else if (23 == i)
			anInt90 = class527_sub38.method16466(-1589364040) * -1463845957;
		else if (i == 24)
			anInt116 = class527_sub38.method16466(-1729090767) * -1461620721;
		else if (i == 25)
			anInt111 = class527_sub38.method16466(-2128866213) * 329347863;
		else if (26 == i)
			anInt99 = class527_sub38.method16466(-1633606787) * -562526483;
		else if (i == 27)
			anInt108 = class527_sub38.readUnsignedByte() * 1203660899;
		else if (i >= 30 && i < 35)
			aStringArray133[i - 30] = class527_sub38.readString(728972896);
		else if (i >= 35 && i < 40)
			aStringArray102[i - 35] = class527_sub38.readString(2069959952);
		else if (i == 40) {
			int i_166_ = class527_sub38.readUnsignedByte();
			aShortArray85 = new short[i_166_];
			aShortArray86 = new short[i_166_];
			for (int i_167_ = 0; i_167_ < i_166_; i_167_++) {
				aShortArray85[i_167_] = (short) class527_sub38.readUnsignedShort();
				aShortArray86[i_167_] = (short) class527_sub38.readUnsignedShort();
			}
		} else if (41 == i) {
			int i_168_ = class527_sub38.readUnsignedByte();
			aShortArray88 = new short[i_168_];
			aShortArray131 = new short[i_168_];
			for (int i_169_ = 0; i_169_ < i_168_; i_169_++) {
				aShortArray88[i_169_] = (short) class527_sub38.readUnsignedShort();
				aShortArray131[i_169_] = (short) class527_sub38.readUnsignedShort();
			}
		} else if (42 == i) {
			int i_170_ = class527_sub38.readUnsignedByte();
			aByteArray87 = new byte[i_170_];
			for (int i_171_ = 0; i_171_ < i_170_; i_171_++)
				aByteArray87[i_171_] = class527_sub38.readByte();
		} else if (43 == i) {
			anInt149 = class527_sub38.readInt() * -258699533;
			aBool148 = true;
		} else if (44 == i) {
			int i_172_ = class527_sub38.readUnsignedShort();
			int i_173_ = 0;
			for (int i_174_ = i_172_; i_174_ > 0; i_174_ >>= 1)
				i_173_++;
			aByteArray142 = new byte[i_173_];
			byte i_175_ = 0;
			for (int i_176_ = 0; i_176_ < i_173_; i_176_++) {
				if ((i_172_ & 1 << i_176_) > 0) {
					aByteArray142[i_176_] = i_175_;
					i_175_++;
				} else
					aByteArray142[i_176_] = (byte) -1;
			}
		} else if (i == 45) {
			int i_177_ = class527_sub38.readUnsignedShort();
			int i_178_ = 0;
			for (int i_179_ = i_177_; i_179_ > 0; i_179_ >>= 1)
				i_178_++;
			aByteArray91 = new byte[i_178_];
			byte i_180_ = 0;
			for (int i_181_ = 0; i_181_ < i_178_; i_181_++) {
				if ((i_177_ & 1 << i_181_) > 0) {
					aByteArray91[i_181_] = i_180_;
					i_180_++;
				} else
					aByteArray91[i_181_] = (byte) -1;
			}
		} else if (65 == i)
			aBool73 = true;
		else if (i == 78)
			anInt121 = class527_sub38.method16466(-1876071418) * -1735475793;
		else if (i == 79)
			anInt110 = class527_sub38.method16466(-1787353722) * -1125129177;
		else if (i == 90)
			anInt101 = class527_sub38.method16466(-1904799733) * 397647389;
		else if (91 == i)
			anInt109 = class527_sub38.method16466(-1674617448) * -661499793;
		else if (92 == i)
			anInt112 = class527_sub38.method16466(-1614154071) * 299769433;
		else if (i == 93)
			anInt105 = class527_sub38.method16466(-1803712103) * 1479479923;
		else if (i == 94)
			anInt82 = class527_sub38.readUnsignedShort() * -1550839219;
		else if (i == 95)
			anInt95 = class527_sub38.readUnsignedShort() * -1345432921;
		else if (96 == i)
			anInt144 = class527_sub38.readUnsignedByte() * 12248847;
		else if (97 == i)
			anInt128 = class527_sub38.readUnsignedShort() * -1199583697;
		else if (i == 98)
			anInt127 = class527_sub38.readUnsignedShort() * 1010157239;
		else if (i >= 100 && i < 110) {
			if (null == anIntArray125) {
				anIntArray125 = new int[10];
				anIntArray126 = new int[10];
			}
			anIntArray125[i - 100] = class527_sub38.readUnsignedShort();
			anIntArray126[i - 100] = class527_sub38.readUnsignedShort();
		} else if (110 == i)
			anInt135 = class527_sub38.readUnsignedShort() * -1845292679;
		else if (i == 111)
			anInt89 = class527_sub38.readUnsignedShort() * -1763458223;
		else if (112 == i)
			anInt137 = class527_sub38.readUnsignedShort() * -632254305;
		else if (i == 113)
			anInt93 = class527_sub38.readByte() * -1787052187;
		else if (i == 114)
			anInt115 = class527_sub38.readByte() * -1453627035;
		else if (115 == i)
			anInt140 = class527_sub38.readUnsignedByte() * -743508023;
		else if (121 == i)
			anInt129 = class527_sub38.readUnsignedShort() * 1882324293;
		else if (i == 122)
			anInt119 = class527_sub38.readUnsignedShort() * 331582577;
		else if (i == 125) {
			anInt114 = (class527_sub38.readByte() << 2) * 529210699;
			anInt117 = (class527_sub38.readByte() << 2) * 769219685;
			anInt96 = (class527_sub38.readByte() << 2) * 948502291;
		} else if (i == 126) {
			anInt130 = (class527_sub38.readByte() << 2) * 1496932671;
			anInt118 = (class527_sub38.readByte() << 2) * 1431330647;
			anInt120 = (class527_sub38.readByte() << 2) * -356500311;
		} else if (127 == i || i == 128 || i == 129 || 130 == i) {
			class527_sub38.readUnsignedByte();
			class527_sub38.readUnsignedShort();
		} else if (132 == i) {
			int i_182_ = class527_sub38.readUnsignedByte();
			anIntArray113 = new int[i_182_];
			for (int i_183_ = 0; i_183_ < i_182_; i_183_++)
				anIntArray113[i_183_] = class527_sub38.readUnsignedShort();
		} else if (134 == i)
			anInt145 = class527_sub38.readUnsignedByte() * -218964887;
		else if (139 == i)
			anInt146 = class527_sub38.readUnsignedShort() * -1896004601;
		else if (140 == i)
			anInt147 = class527_sub38.readUnsignedShort() * 733594899;
		else if (i >= 142 && i < 147) {
			if (anIntArray104 == null) {
				anIntArray104 = new int[6];
				Arrays.fill(anIntArray104, -1);
			}
			anIntArray104[i - 142] = class527_sub38.readUnsignedShort();
		} else if (i >= 150 && i < 155) {
			if (anIntArray124 == null) {
				anIntArray124 = new int[5];
				Arrays.fill(anIntArray124, -1);
			}
			anIntArray124[i - 150] = class527_sub38.readUnsignedShort();
		} else if (i != 156) {
			if (i == 157)
				aBool150 = true;
			else if (161 == i)
				anInt103 = class527_sub38.readUnsignedShort() * -1741117381;
			else if (i == 162)
				anInt132 = class527_sub38.readUnsignedShort() * -2027695975;
			else if (163 == i)
				anInt134 = class527_sub38.readUnsignedShort() * -1851015713;
			else if (i == 164)
				aString141 = class527_sub38.readString(2118306929);
			else if (165 == i)
				anInt98 = 2042072014;
			else if (i == 249) {
				int i_184_ = class527_sub38.readUnsignedByte();
				if (null == aClass14_143) {
					int i_185_ = Class186.method3652(i_184_, 1735593674);
					aClass14_143 = new Class14(i_185_);
				}
				for (int i_186_ = 0; i_186_ < i_184_; i_186_++) {
					boolean bool = class527_sub38.readUnsignedByte() == 1;
					int i_187_ = class527_sub38.read24BitUnsignedInteger(126893564);
					Class527 class527;
					if (bool)
						class527 = new Class527_Sub26(class527_sub38.readString(2142676850));
					else
						class527 = new Node_Sub6(class527_sub38.readInt());
					aClass14_143.method714(class527, (long) i_187_);
				}
			}
		}
	}

	public void method84() {
		if (-1 != anInt127 * 295433991)
			method659((Class9) anInterface13_79.method81(295433991 * anInt127, 109293232), ((Class9) anInterface13_79.method81(anInt128 * -1747830577, 2053600357)), aClass6_80.aClass671_56, (byte) 21);
		else if (-1637960559 * anInt119 != -1)
			method629(((Class9) anInterface13_79.method81(anInt119 * -1637960559, -1814302274)), (Class9) anInterface13_79.method81(anInt129 * -698413683, -556196160), aClass6_80.aClass671_56, 495039699);
		else if (-1 != anInt147 * -1475818213)
			method654(((Class9) anInterface13_79.method81(-1475818213 * anInt147, 467679011)), (Class9) anInterface13_79.method81(anInt146 * 723970487, -1138736955), aClass6_80.aClass671_56, 1786132300);
		else if (-1 != -73038935 * anInt132)
			method610((Class9) anInterface13_79.method81(-73038935 * anInt132, 1561471530), (Class9) anInterface13_79.method81(anInt103 * 1450438899, -968543089), aClass6_80.aClass671_56, 579281983);
		if (!aClass6_80.aBool57 && aBool122) {
			anInt140 = 0;
			aStringArray133 = aClass6_80.aStringArray62;
			aStringArray102 = aClass6_80.aStringArray63;
			aBool73 = false;
			anIntArray113 = null;
			if (aClass14_143 != null) {
				boolean bool = false;
				for (Class527 class527 = aClass14_143.method713((byte) 9); class527 != null; class527 = aClass14_143.method717(965403406)) {
					Class80 class80 = (Class80) (aClass6_80.anInterface13_55.method81((int) (-8168620736534281759L * class527.aLong7106), -5475927));
					if (class80.aBool803)
						class527.method8735(-1889161967);
					else
						bool = true;
				}
				if (!bool)
					aClass14_143 = null;
			}
		}
	}

	void method627(Class21 class21, Class9 class9_188_, Class9 class9_189_, Class53 class53, Class671 class671) {
		anInt83 = 1 * class9_188_.anInt83;
		anInt92 = class9_188_.anInt92 * 1;
		anInt107 = 1 * class9_188_.anInt107;
		anInt94 = class9_188_.anInt94 * 1;
		anInt95 = class9_188_.anInt95 * 1;
		anInt138 = class9_188_.anInt138 * 1;
		anInt97 = 1 * class9_188_.anInt97;
		Class9 class9_190_ = class21 == Class21.aClass21_209 ? class9_188_ : class9_189_;
		aShortArray85 = class9_190_.aShortArray85;
		aShortArray86 = class9_190_.aShortArray86;
		aByteArray87 = class9_190_.aByteArray87;
		aShortArray88 = class9_190_.aShortArray88;
		aShortArray131 = class9_190_.aShortArray131;
		aString84 = class9_189_.aString84;
		aBool122 = class9_189_.aBool122;
		if (class21 == Class21.aClass21_209) {
			anInt100 = class9_189_.anInt100 * 1;
			anInt98 = -1126447641;
		} else if (class21 == Class21.aClass21_207) {
			aString84 = class9_189_.aString141;
			anInt100 = (int) Math.floor((double) (class9_189_.anInt100 * -1204628591 / (class9_189_.anInt134 * 1388854815))) * 1980648817;
			anInt98 = -1126447641;
			aBool73 = class9_189_.aBool73;
			anInt82 = class9_188_.anInt82 * 1;
			anIntArray104 = class9_188_.anIntArray104;
			anIntArray124 = class9_188_.anIntArray124;
			aStringArray102 = new String[5];
			aStringArray102[0] = Class53.aClass53_539.method1290(class671, (byte) -84);
			aStringArray102[4] = class53.method1290(class671, (byte) -41);
		} else {
			anInt100 = 0;
			anInt98 = class9_189_.anInt98 * 1;
			anInt106 = 1 * class9_189_.anInt106;
			anInt123 = class9_189_.anInt123 * 1;
			anInt108 = 1 * class9_189_.anInt108;
			anInt90 = class9_189_.anInt90 * 1;
			anInt116 = class9_189_.anInt116 * 1;
			anInt121 = class9_189_.anInt121 * 1;
			anInt111 = class9_189_.anInt111 * 1;
			anInt99 = class9_189_.anInt99 * 1;
			anInt110 = 1 * class9_189_.anInt110;
			anInt114 = class9_189_.anInt114 * 1;
			anInt130 = class9_189_.anInt130 * 1;
			anInt117 = 1 * class9_189_.anInt117;
			anInt118 = 1 * class9_189_.anInt118;
			anInt96 = class9_189_.anInt96 * 1;
			anInt120 = class9_189_.anInt120 * 1;
			anInt101 = 1 * class9_189_.anInt101;
			anInt112 = 1 * class9_189_.anInt112;
			anInt109 = 1 * class9_189_.anInt109;
			anInt105 = class9_189_.anInt105 * 1;
			anInt82 = 1 * class9_189_.anInt82;
			anInt140 = class9_189_.anInt140 * 1;
			aStringArray133 = class9_189_.aStringArray133;
			aClass14_143 = class9_189_.aClass14_143;
			aStringArray102 = new String[5];
			if (class9_189_.aStringArray102 != null) {
				for (int i = 0; i < 4; i++)
					aStringArray102[i] = class9_189_.aStringArray102[i];
			}
			aStringArray102[4] = class53.method1290(class671, (byte) -115);
		}
	}

	void method628(Class21 class21, Class9 class9_191_, Class9 class9_192_, Class53 class53, Class671 class671) {
		anInt83 = 1 * class9_191_.anInt83;
		anInt92 = class9_191_.anInt92 * 1;
		anInt107 = 1 * class9_191_.anInt107;
		anInt94 = class9_191_.anInt94 * 1;
		anInt95 = class9_191_.anInt95 * 1;
		anInt138 = class9_191_.anInt138 * 1;
		anInt97 = 1 * class9_191_.anInt97;
		Class9 class9_193_ = class21 == Class21.aClass21_209 ? class9_191_ : class9_192_;
		aShortArray85 = class9_193_.aShortArray85;
		aShortArray86 = class9_193_.aShortArray86;
		aByteArray87 = class9_193_.aByteArray87;
		aShortArray88 = class9_193_.aShortArray88;
		aShortArray131 = class9_193_.aShortArray131;
		aString84 = class9_192_.aString84;
		aBool122 = class9_192_.aBool122;
		if (class21 == Class21.aClass21_209) {
			anInt100 = class9_192_.anInt100 * 1;
			anInt98 = -1126447641;
		} else if (class21 == Class21.aClass21_207) {
			aString84 = class9_192_.aString141;
			anInt100 = (int) Math.floor((double) (class9_192_.anInt100 * -1204628591 / (class9_192_.anInt134 * 1388854815))) * 1980648817;
			anInt98 = -1126447641;
			aBool73 = class9_192_.aBool73;
			anInt82 = class9_191_.anInt82 * 1;
			anIntArray104 = class9_191_.anIntArray104;
			anIntArray124 = class9_191_.anIntArray124;
			aStringArray102 = new String[5];
			aStringArray102[0] = Class53.aClass53_539.method1290(class671, (byte) -7);
			aStringArray102[4] = class53.method1290(class671, (byte) -90);
		} else {
			anInt100 = 0;
			anInt98 = class9_192_.anInt98 * 1;
			anInt106 = 1 * class9_192_.anInt106;
			anInt123 = class9_192_.anInt123 * 1;
			anInt108 = 1 * class9_192_.anInt108;
			anInt90 = class9_192_.anInt90 * 1;
			anInt116 = class9_192_.anInt116 * 1;
			anInt121 = class9_192_.anInt121 * 1;
			anInt111 = class9_192_.anInt111 * 1;
			anInt99 = class9_192_.anInt99 * 1;
			anInt110 = 1 * class9_192_.anInt110;
			anInt114 = class9_192_.anInt114 * 1;
			anInt130 = class9_192_.anInt130 * 1;
			anInt117 = 1 * class9_192_.anInt117;
			anInt118 = 1 * class9_192_.anInt118;
			anInt96 = class9_192_.anInt96 * 1;
			anInt120 = class9_192_.anInt120 * 1;
			anInt101 = 1 * class9_192_.anInt101;
			anInt112 = 1 * class9_192_.anInt112;
			anInt109 = 1 * class9_192_.anInt109;
			anInt105 = class9_192_.anInt105 * 1;
			anInt82 = 1 * class9_192_.anInt82;
			anInt140 = class9_192_.anInt140 * 1;
			aStringArray133 = class9_192_.aStringArray133;
			aClass14_143 = class9_192_.aClass14_143;
			aStringArray102 = new String[5];
			if (class9_192_.aStringArray102 != null) {
				for (int i = 0; i < 4; i++)
					aStringArray102[i] = class9_192_.aStringArray102[i];
			}
			aStringArray102[4] = class53.method1290(class671, (byte) -90);
		}
	}

	void method629(Class9 class9_194_, Class9 class9_195_, Class671 class671, int i) {
		method606(Class21.aClass21_206, class9_194_, class9_195_, Class53.aClass53_570, class671, (byte) 62);
	}

	void method630(Class9 class9_196_, Class9 class9_197_, Class671 class671) {
		method606(Class21.aClass21_209, class9_196_, class9_197_, null, class671, (byte) 67);
	}

	void method631(Class21 class21, Class9 class9_198_, Class9 class9_199_, Class53 class53, Class671 class671) {
		anInt83 = 1 * class9_198_.anInt83;
		anInt92 = class9_198_.anInt92 * 1;
		anInt107 = 1 * class9_198_.anInt107;
		anInt94 = class9_198_.anInt94 * 1;
		anInt95 = class9_198_.anInt95 * 1;
		anInt138 = class9_198_.anInt138 * 1;
		anInt97 = 1 * class9_198_.anInt97;
		Class9 class9_200_ = class21 == Class21.aClass21_209 ? class9_198_ : class9_199_;
		aShortArray85 = class9_200_.aShortArray85;
		aShortArray86 = class9_200_.aShortArray86;
		aByteArray87 = class9_200_.aByteArray87;
		aShortArray88 = class9_200_.aShortArray88;
		aShortArray131 = class9_200_.aShortArray131;
		aString84 = class9_199_.aString84;
		aBool122 = class9_199_.aBool122;
		if (class21 == Class21.aClass21_209) {
			anInt100 = class9_199_.anInt100 * 1;
			anInt98 = -1126447641;
		} else if (class21 == Class21.aClass21_207) {
			aString84 = class9_199_.aString141;
			anInt100 = (int) Math.floor((double) (class9_199_.anInt100 * -1204628591 / (class9_199_.anInt134 * 1388854815))) * 1980648817;
			anInt98 = -1126447641;
			aBool73 = class9_199_.aBool73;
			anInt82 = class9_198_.anInt82 * 1;
			anIntArray104 = class9_198_.anIntArray104;
			anIntArray124 = class9_198_.anIntArray124;
			aStringArray102 = new String[5];
			aStringArray102[0] = Class53.aClass53_539.method1290(class671, (byte) -118);
			aStringArray102[4] = class53.method1290(class671, (byte) -124);
		} else {
			anInt100 = 0;
			anInt98 = class9_199_.anInt98 * 1;
			anInt106 = 1 * class9_199_.anInt106;
			anInt123 = class9_199_.anInt123 * 1;
			anInt108 = 1 * class9_199_.anInt108;
			anInt90 = class9_199_.anInt90 * 1;
			anInt116 = class9_199_.anInt116 * 1;
			anInt121 = class9_199_.anInt121 * 1;
			anInt111 = class9_199_.anInt111 * 1;
			anInt99 = class9_199_.anInt99 * 1;
			anInt110 = 1 * class9_199_.anInt110;
			anInt114 = class9_199_.anInt114 * 1;
			anInt130 = class9_199_.anInt130 * 1;
			anInt117 = 1 * class9_199_.anInt117;
			anInt118 = 1 * class9_199_.anInt118;
			anInt96 = class9_199_.anInt96 * 1;
			anInt120 = class9_199_.anInt120 * 1;
			anInt101 = 1 * class9_199_.anInt101;
			anInt112 = 1 * class9_199_.anInt112;
			anInt109 = 1 * class9_199_.anInt109;
			anInt105 = class9_199_.anInt105 * 1;
			anInt82 = 1 * class9_199_.anInt82;
			anInt140 = class9_199_.anInt140 * 1;
			aStringArray133 = class9_199_.aStringArray133;
			aClass14_143 = class9_199_.aClass14_143;
			aStringArray102 = new String[5];
			if (class9_199_.aStringArray102 != null) {
				for (int i = 0; i < 4; i++)
					aStringArray102[i] = class9_199_.aStringArray102[i];
			}
			aStringArray102[4] = class53.method1290(class671, (byte) -81);
		}
	}

	public final boolean method632(boolean bool, Class23 class23) {
		int i;
		int i_201_;
		if (bool) {
			if (class23 != null && null != class23.anIntArray226) {
				i = class23.anIntArray226[0];
				i_201_ = class23.anIntArray226[1];
			} else {
				i = anInt109 * 2039549583;
				i_201_ = anInt105 * -2107841861;
			}
		} else if (null != class23 && class23.anIntArray224 != null) {
			i = class23.anIntArray224[0];
			i_201_ = class23.anIntArray224[1];
		} else {
			i = anInt101 * 1802376245;
			i_201_ = 1741113833 * anInt112;
		}
		if (i == -1)
			return true;
		boolean bool_202_ = true;
		if (!aClass6_80.aClass459_54.method7479(i, 0, 102380841))
			bool_202_ = false;
		if (i_201_ != -1 && !aClass6_80.aClass459_54.method7479(i_201_, 0, 102380841))
			bool_202_ = false;
		return bool_202_;
	}

	void method633(Class9 class9_203_, Class9 class9_204_, Class671 class671) {
		method606(Class21.aClass21_209, class9_203_, class9_204_, null, class671, (byte) 30);
	}

	public int method634(int i, int i_205_) {
		if (aClass14_143 == null)
			return i_205_;
		Node_Sub6 class527_sub7 = (Node_Sub6) aClass14_143.method709((long) i);
		if (class527_sub7 == null)
			return i_205_;
		return -78845949 * class527_sub7.anInt10398;
	}

	void method635(Class9 class9_206_, Class9 class9_207_, Class671 class671) {
		method606(Class21.aClass21_206, class9_206_, class9_207_, Class53.aClass53_570, class671, (byte) 99);
	}

	void method636(Class9 class9_208_, Class9 class9_209_, Class671 class671) {
		method606(Class21.aClass21_206, class9_208_, class9_209_, Class53.aClass53_570, class671, (byte) 58);
	}

	int[] method637(Class180 class180, Class180 class180_210_, int i, int i_211_, int i_212_, boolean bool, int i_213_, Class174 class174, Class633 class633, Class615 class615) {
		Class175 class175 = Class175.method2814(aClass6_80.aClass459_54, anInt83 * -1703972677, 0);
		if (null == class175)
			return null;
		if (class175.anInt1905 < 13)
			class175.method2829(2);
		if (null != aShortArray85) {
			for (int i_214_ = 0; i_214_ < aShortArray85.length; i_214_++) {
				if (null != aByteArray87 && i_214_ < aByteArray87.length)
					class175.method2803(aShortArray85[i_214_], (aShortArray78[aByteArray87[i_214_] & 0xff]));
				else
					class175.method2803(aShortArray85[i_214_], aShortArray86[i_214_]);
			}
		}
		if (aShortArray88 != null) {
			for (int i_215_ = 0; i_215_ < aShortArray88.length; i_215_++)
				class175.method2853(aShortArray88[i_215_], aShortArray131[i_215_]);
		}
		if (class633 != null) {
			for (int i_216_ = 0; i_216_ < 10; i_216_++) {
				for (int i_217_ = 0; i_217_ < Class193.aShortArrayArray2156[i_216_].length; i_217_++) {
					if (class633.anIntArray8285[i_216_] < (Class487.aShortArrayArrayArray5470[i_216_][i_217_]).length)
						class175.method2803((Class193.aShortArrayArray2156[i_216_][i_217_]), (Class487.aShortArrayArrayArray5470[i_216_][i_217_][(class633.anIntArray8285[i_216_])]));
				}
			}
			for (int i_218_ = 0; i_218_ < 10; i_218_++) {
				for (int i_219_ = 0; i_219_ < Class552.aShortArrayArray7313[i_218_].length; i_219_++) {
					if (class633.anIntArray8282[i_218_] < (Class78.aShortArrayArrayArray802[i_218_][i_219_]).length)
						class175.method2853((Class552.aShortArrayArray7313[i_218_][i_219_]), (Class78.aShortArrayArrayArray802[i_218_][i_219_][(class633.anIntArray8282[i_218_])]));
				}
			}
		}
		int i_220_ = 2048;
		boolean bool_221_ = false;
		if (128 != anInt135 * 1074235593 || anInt89 * 357000625 != 128 || 128 != 904694623 * anInt137) {
			bool_221_ = true;
			i_220_ |= 0x7;
		}
		Class176 class176 = class180.method3376(class175, i_220_, 64, 64 + anInt93 * -2087822739, 768 + anInt115 * 316154401);
		if (!class176.method3035())
			return null;
		if (bool_221_)
			class176.method2872(anInt135 * 1074235593, anInt89 * 357000625, anInt137 * 904694623);
		Class147 class147 = null;
		if (-1 != 295433991 * anInt127) {
			class147 = aClass6_80.method570(class180, class180_210_, -1747830577 * anInt128, 10, 1, 0, true, true, 0, class174, class633, class615, anInterface13_79, (byte) 1);
			if (class147 == null)
				return null;
		} else if (anInt119 * -1637960559 != -1) {
			class147 = aClass6_80.method570(class180, class180_210_, -698413683 * anInt129, i, i_211_, i_212_, false, true, 0, class174, class633, class615, anInterface13_79, (byte) 1);
			if (class147 == null)
				return null;
		} else if (anInt147 * -1475818213 != -1) {
			class147 = aClass6_80.method570(class180, class180_210_, anInt146 * 723970487, i, i_211_, i_212_, false, true, 0, class174, class633, class615, anInterface13_79, (byte) 1);
			if (class147 == null)
				return null;
		} else if (-1 != -73038935 * anInt132) {
			class147 = aClass6_80.method570(class180, class180_210_, 1450438899 * anInt103, 10, 1, 0, true, true, 0, class174, class633, class615, anInterface13_79, (byte) 1);
			if (null == class147)
				return null;
		}
		int i_222_;
		if (bool)
			i_222_ = (int) ((double) (anInt92 * 1387730399) * 1.5) << 2;
		else if (2 == i_211_)
			i_222_ = (int) ((double) (anInt92 * 1387730399) * 1.04) << 2;
		else
			i_222_ = 1387730399 * anInt92 << 2;
		Class427 class427 = class180.method3364();
		Class427 class427_223_ = class180.method3171();
		class427_223_.method6752(16.0F, 16.0F, 512.0F, 512.0F, 50.0F, 2.14748365E9F, (float) class180.method3285(1352152893).method2728(), (float) class180.method3285(1407663255).method2729());
		class180.method3183(class427_223_);
		class180.method3128(0, 0, class180.method3285(1057330816).method2728(), class180.method3285(1154377261).method2729());
		Class432 class432 = new Class432();
		class180.method3180(class432);
		class180.method3478(0.95F + (float) (Math.random() / 10.0));
		class180.method3157(16777215, 0.95F + (float) (Math.random() / 10.0), 0.95F + (float) (Math.random() / 10.0), -50.0F, -10.0F, -50.0F);
		Class432 class432_224_ = class180.method3172();
		class432_224_.method6890(0.0F, 0.0F, 1.0F, Class428.method6863(-(-451529449 * anInt95) << 3));
		class432_224_.method6936(0.0F, 1.0F, 0.0F, Class428.method6863(anInt94 * 608991827 << 3));
		class432_224_.method6896((float) (anInt138 * 288478567 << 2), (float) (((i_222_ * (Class428.anIntArray4825[-1615963605 * anInt107 << 3])) >> 14) - class176.method2896() / 2 + (anInt97 * 560960069 << 2)), (float) (((i_222_ * (Class428.anIntArray4819[-1615963605 * anInt107 << 3])) >> 14) + (560960069 * anInt97 << 2)));
		class432_224_.method6936(1.0F, 0.0F, 0.0F, Class428.method6863(-1615963605 * anInt107 << 3));
		class180.method3132(0, 0, 36, 32);
		class180.method3136(2, 0);
		class180.method3348(0, 0, 36, 32, 0, 0);
		class180.method3187(0, -1, 0);
		class176.method2889(class432_224_, null, 1);
		class180.method3183(class427);
		int[] is = class180.method3113(0, 0, 36, 32);
		if (i_211_ >= 1) {
			is = method608(is, -16777214, (byte) -44);
			if (i_211_ >= 2)
				is = method608(is, -1, (byte) -41);
		}
		if (i_212_ != 0)
			method615(is, i_212_, (byte) -44);
		if (-1 != -1637960559 * anInt119)
			class147.method2415(0, 0);
		else if (-1 != -1475818213 * anInt147)
			class147.method2415(0, 0);
		class180.method3163(is, 0, 36, 36, 32, 694377194).method2415(0, 0);
		if (-1 != anInt127 * 295433991)
			class147.method2415(0, 0);
		if (-1 != anInt132 * -73038935)
			class147.method2415(0, 0);
		if (i_213_ == 1 || 2 == i_213_ && (-1099072041 * anInt98 == 1 || i != 1) && -1 != i)
			class174.method2770(Class487.method7966(i, aClass6_80.aClass671_56, class615, 636848344), 0, 9, -256, -16777215, 1412785587);
		is = class180.method3113(0, 0, 36, 32);
		for (int i_225_ = 0; i_225_ < is.length; i_225_++) {
			if ((is[i_225_] & 0xffffff) == 0)
				is[i_225_] = 0;
			else
				is[i_225_] |= ~0xffffff;
		}
		return is;
	}

	void method638(RSByteBuffer class527_sub38, int i) {
		if (i == 1)
			anInt83 = class527_sub38.method16466(-1993059778) * 1932088435;
		else if (2 == i)
			aString84 = class527_sub38.readString(1123861939);
		else if (i == 4)
			anInt92 = class527_sub38.readUnsignedShort() * -1684871649;
		else if (5 == i)
			anInt107 = class527_sub38.readUnsignedShort() * -663382909;
		else if (i == 6)
			anInt94 = class527_sub38.readUnsignedShort() * -684598821;
		else if (i == 7) {
			anInt138 = class527_sub38.readUnsignedShort() * -1210747305;
			if (anInt138 * 288478567 > 32767)
				anInt138 -= 1985413120;
		} else if (8 == i) {
			anInt97 = class527_sub38.readUnsignedShort() * -614879091;
			if (560960069 * anInt97 > 32767)
				anInt97 -= -1332936704;
		} else if (i == 11)
			anInt98 = -1126447641;
		else if (12 == i)
			anInt100 = class527_sub38.readInt() * 1980648817;
		else if (i == 13)
			anInt106 = class527_sub38.readUnsignedByte() * 1572536855;
		else if (14 == i)
			anInt123 = class527_sub38.readUnsignedByte() * -216271905;
		else if (16 == i)
			aBool122 = true;
		else if (i == 18)
			anInt139 = class527_sub38.readUnsignedShort() * -816412701;
		else if (23 == i)
			anInt90 = class527_sub38.method16466(-2107256986) * -1463845957;
		else if (i == 24)
			anInt116 = class527_sub38.method16466(-2038797443) * -1461620721;
		else if (i == 25)
			anInt111 = class527_sub38.method16466(-2021637982) * 329347863;
		else if (26 == i)
			anInt99 = class527_sub38.method16466(-1649400129) * -562526483;
		else if (i == 27)
			anInt108 = class527_sub38.readUnsignedByte() * 1203660899;
		else if (i >= 30 && i < 35)
			aStringArray133[i - 30] = class527_sub38.readString(792803893);
		else if (i >= 35 && i < 40)
			aStringArray102[i - 35] = class527_sub38.readString(1015380638);
		else if (i == 40) {
			int i_226_ = class527_sub38.readUnsignedByte();
			aShortArray85 = new short[i_226_];
			aShortArray86 = new short[i_226_];
			for (int i_227_ = 0; i_227_ < i_226_; i_227_++) {
				aShortArray85[i_227_] = (short) class527_sub38.readUnsignedShort();
				aShortArray86[i_227_] = (short) class527_sub38.readUnsignedShort();
			}
		} else if (41 == i) {
			int i_228_ = class527_sub38.readUnsignedByte();
			aShortArray88 = new short[i_228_];
			aShortArray131 = new short[i_228_];
			for (int i_229_ = 0; i_229_ < i_228_; i_229_++) {
				aShortArray88[i_229_] = (short) class527_sub38.readUnsignedShort();
				aShortArray131[i_229_] = (short) class527_sub38.readUnsignedShort();
			}
		} else if (42 == i) {
			int i_230_ = class527_sub38.readUnsignedByte();
			aByteArray87 = new byte[i_230_];
			for (int i_231_ = 0; i_231_ < i_230_; i_231_++)
				aByteArray87[i_231_] = class527_sub38.readByte();
		} else if (43 == i) {
			anInt149 = class527_sub38.readInt() * -258699533;
			aBool148 = true;
		} else if (44 == i) {
			int i_232_ = class527_sub38.readUnsignedShort();
			int i_233_ = 0;
			for (int i_234_ = i_232_; i_234_ > 0; i_234_ >>= 1)
				i_233_++;
			aByteArray142 = new byte[i_233_];
			byte i_235_ = 0;
			for (int i_236_ = 0; i_236_ < i_233_; i_236_++) {
				if ((i_232_ & 1 << i_236_) > 0) {
					aByteArray142[i_236_] = i_235_;
					i_235_++;
				} else
					aByteArray142[i_236_] = (byte) -1;
			}
		} else if (i == 45) {
			int i_237_ = class527_sub38.readUnsignedShort();
			int i_238_ = 0;
			for (int i_239_ = i_237_; i_239_ > 0; i_239_ >>= 1)
				i_238_++;
			aByteArray91 = new byte[i_238_];
			byte i_240_ = 0;
			for (int i_241_ = 0; i_241_ < i_238_; i_241_++) {
				if ((i_237_ & 1 << i_241_) > 0) {
					aByteArray91[i_241_] = i_240_;
					i_240_++;
				} else
					aByteArray91[i_241_] = (byte) -1;
			}
		} else if (65 == i)
			aBool73 = true;
		else if (i == 78)
			anInt121 = class527_sub38.method16466(-2087605238) * -1735475793;
		else if (i == 79)
			anInt110 = class527_sub38.method16466(-1843336210) * -1125129177;
		else if (i == 90)
			anInt101 = class527_sub38.method16466(-1670773205) * 397647389;
		else if (91 == i)
			anInt109 = class527_sub38.method16466(-1684141115) * -661499793;
		else if (92 == i)
			anInt112 = class527_sub38.method16466(-1918373625) * 299769433;
		else if (i == 93)
			anInt105 = class527_sub38.method16466(-1809816713) * 1479479923;
		else if (i == 94)
			anInt82 = class527_sub38.readUnsignedShort() * -1550839219;
		else if (i == 95)
			anInt95 = class527_sub38.readUnsignedShort() * -1345432921;
		else if (96 == i)
			anInt144 = class527_sub38.readUnsignedByte() * 12248847;
		else if (97 == i)
			anInt128 = class527_sub38.readUnsignedShort() * -1199583697;
		else if (i == 98)
			anInt127 = class527_sub38.readUnsignedShort() * 1010157239;
		else if (i >= 100 && i < 110) {
			if (null == anIntArray125) {
				anIntArray125 = new int[10];
				anIntArray126 = new int[10];
			}
			anIntArray125[i - 100] = class527_sub38.readUnsignedShort();
			anIntArray126[i - 100] = class527_sub38.readUnsignedShort();
		} else if (110 == i)
			anInt135 = class527_sub38.readUnsignedShort() * -1845292679;
		else if (i == 111)
			anInt89 = class527_sub38.readUnsignedShort() * -1763458223;
		else if (112 == i)
			anInt137 = class527_sub38.readUnsignedShort() * -632254305;
		else if (i == 113)
			anInt93 = class527_sub38.readByte() * -1787052187;
		else if (i == 114)
			anInt115 = class527_sub38.readByte() * -1453627035;
		else if (115 == i)
			anInt140 = class527_sub38.readUnsignedByte() * -743508023;
		else if (121 == i)
			anInt129 = class527_sub38.readUnsignedShort() * 1882324293;
		else if (i == 122)
			anInt119 = class527_sub38.readUnsignedShort() * 331582577;
		else if (i == 125) {
			anInt114 = (class527_sub38.readByte() << 2) * 529210699;
			anInt117 = (class527_sub38.readByte() << 2) * 769219685;
			anInt96 = (class527_sub38.readByte() << 2) * 948502291;
		} else if (i == 126) {
			anInt130 = (class527_sub38.readByte() << 2) * 1496932671;
			anInt118 = (class527_sub38.readByte() << 2) * 1431330647;
			anInt120 = (class527_sub38.readByte() << 2) * -356500311;
		} else if (127 == i || i == 128 || i == 129 || 130 == i) {
			class527_sub38.readUnsignedByte();
			class527_sub38.readUnsignedShort();
		} else if (132 == i) {
			int i_242_ = class527_sub38.readUnsignedByte();
			anIntArray113 = new int[i_242_];
			for (int i_243_ = 0; i_243_ < i_242_; i_243_++)
				anIntArray113[i_243_] = class527_sub38.readUnsignedShort();
		} else if (134 == i)
			anInt145 = class527_sub38.readUnsignedByte() * -218964887;
		else if (139 == i)
			anInt146 = class527_sub38.readUnsignedShort() * -1896004601;
		else if (140 == i)
			anInt147 = class527_sub38.readUnsignedShort() * 733594899;
		else if (i >= 142 && i < 147) {
			if (anIntArray104 == null) {
				anIntArray104 = new int[6];
				Arrays.fill(anIntArray104, -1);
			}
			anIntArray104[i - 142] = class527_sub38.readUnsignedShort();
		} else if (i >= 150 && i < 155) {
			if (anIntArray124 == null) {
				anIntArray124 = new int[5];
				Arrays.fill(anIntArray124, -1);
			}
			anIntArray124[i - 150] = class527_sub38.readUnsignedShort();
		} else if (i != 156) {
			if (i == 157)
				aBool150 = true;
			else if (161 == i)
				anInt103 = class527_sub38.readUnsignedShort() * -1741117381;
			else if (i == 162)
				anInt132 = class527_sub38.readUnsignedShort() * -2027695975;
			else if (163 == i)
				anInt134 = class527_sub38.readUnsignedShort() * -1851015713;
			else if (i == 164)
				aString141 = class527_sub38.readString(1968331525);
			else if (165 == i)
				anInt98 = 2042072014;
			else if (i == 249) {
				int i_244_ = class527_sub38.readUnsignedByte();
				if (null == aClass14_143) {
					int i_245_ = Class186.method3652(i_244_, -146789494);
					aClass14_143 = new Class14(i_245_);
				}
				for (int i_246_ = 0; i_246_ < i_244_; i_246_++) {
					boolean bool = class527_sub38.readUnsignedByte() == 1;
					int i_247_ = class527_sub38.read24BitUnsignedInteger(2025464396);
					Class527 class527;
					if (bool)
						class527 = new Class527_Sub26(class527_sub38.readString(1463235440));
					else
						class527 = new Node_Sub6(class527_sub38.readInt());
					aClass14_143.method714(class527, (long) i_247_);
				}
			}
		}
	}

	public final Class175 method639(boolean bool, Class23 class23, int i) {
		int i_248_;
		int i_249_;
		if (bool) {
			if (class23 != null && class23.anIntArray226 != null) {
				i_248_ = class23.anIntArray226[0];
				i_249_ = class23.anIntArray226[1];
			} else {
				i_248_ = 2039549583 * anInt109;
				i_249_ = -2107841861 * anInt105;
			}
		} else if (null != class23 && class23.anIntArray224 != null) {
			i_248_ = class23.anIntArray224[0];
			i_249_ = class23.anIntArray224[1];
		} else {
			i_248_ = 1802376245 * anInt101;
			i_249_ = 1741113833 * anInt112;
		}
		if (i_248_ == -1)
			return null;
		Class175 class175 = Class175.method2814(aClass6_80.aClass459_54, i_248_, 0);
		if (class175.anInt1905 < 13)
			class175.method2829(2);
		if (i_249_ != -1) {
			Class175 class175_250_ = Class175.method2814(aClass6_80.aClass459_54, i_249_, 0);
			if (class175_250_.anInt1905 < 13)
				class175_250_.method2829(2);
			Class175[] class175s = { class175, class175_250_ };
			class175 = new Class175(class175s, 2);
		}
		if (null != aShortArray85) {
			short[] is;
			if (class23 != null && class23.aShortArray218 != null)
				is = class23.aShortArray218;
			else
				is = aShortArray86;
			for (int i_251_ = 0; i_251_ < aShortArray85.length; i_251_++)
				class175.method2803(aShortArray85[i_251_], is[i_251_]);
		}
		if (null != aShortArray88) {
			short[] is;
			if (null != class23 && null != class23.aShortArray227)
				is = class23.aShortArray227;
			else
				is = aShortArray131;
			for (int i_252_ = 0; i_252_ < aShortArray88.length; i_252_++)
				class175.method2853(aShortArray88[i_252_], is[i_252_]);
		}
		return class175;
	}

	void method640(Class9 class9_253_, Class9 class9_254_, Class671 class671) {
		method606(Class21.aClass21_207, class9_253_, class9_254_, Class53.aClass53_541, class671, (byte) 6);
	}

	public final Class176 method641(Class180 class180, int i, int i_255_, Class633 class633, Class695 class695, int i_256_, int i_257_, int i_258_, int i_259_) {
		if (anIntArray125 != null && i_255_ > 1) {
			int i_260_ = -1;
			for (int i_261_ = 0; i_261_ < 10; i_261_++) {
				if (i_255_ >= anIntArray126[i_261_] && 0 != anIntArray126[i_261_])
					i_260_ = anIntArray125[i_261_];
			}
			if (i_260_ != -1)
				return (((Class9) anInterface13_79.method81(i_260_, 1553139181)).method611(class180, i, 1, class633, class695, i_256_, i_257_, i_258_, i_259_, -2102571109));
		}
		int i_262_ = i;
		if (null != class695)
			i_262_ |= class695.method14174(-822649352);
		Class176 class176;
		synchronized (aClass6_80.aClass205_60) {
			class176 = ((Class176) (aClass6_80.aClass205_60.method3787((long) (107322467 * anInt136 | -397006101 * class180.anInt2064 << 29))));
		}
		if (class176 == null || class180.method3175(class176.method2874(), i_262_) != 0) {
			if (null != class176)
				i_262_ = class180.method3176(i_262_, class176.method2874());
			int i_263_ = i_262_;
			if (null != aShortArray88)
				i_263_ |= 0x8000;
			if (aShortArray85 != null || class633 != null)
				i_263_ |= 0x4000;
			if (1074235593 * anInt135 != 128)
				i_263_ |= 0x1;
			if (anInt89 * 357000625 != 128)
				i_263_ |= 0x2;
			if (904694623 * anInt137 != 128)
				i_263_ |= 0x4;
			Class175 class175 = Class175.method2814(aClass6_80.aClass459_54, -1703972677 * anInt83, 0);
			if (class175 == null)
				return null;
			if (class175.anInt1905 < 13)
				class175.method2829(2);
			class176 = class180.method3376(class175, i_263_, aClass6_80.anInt61 * -1303365985, 64 + -2087822739 * anInt93, anInt115 * 316154401 + 850);
			if (1074235593 * anInt135 != 128 || 128 != 357000625 * anInt89 || anInt137 * 904694623 != 128)
				class176.method2872(1074235593 * anInt135, anInt89 * 357000625, 904694623 * anInt137);
			if (aShortArray85 != null) {
				for (int i_264_ = 0; i_264_ < aShortArray85.length; i_264_++) {
					if (null != aByteArray87 && i_264_ < aByteArray87.length)
						class176.method2907(aShortArray85[i_264_], (aShortArray78[aByteArray87[i_264_] & 0xff]));
					else
						class176.method2907(aShortArray85[i_264_], aShortArray86[i_264_]);
				}
			}
			if (null != aShortArray88) {
				for (int i_265_ = 0; i_265_ < aShortArray88.length; i_265_++)
					class176.method2909(aShortArray88[i_265_], aShortArray131[i_265_]);
			}
			if (null != class633) {
				for (int i_266_ = 0; i_266_ < 10; i_266_++) {
					for (int i_267_ = 0; i_267_ < Class193.aShortArrayArray2156[i_266_].length; i_267_++) {
						if (class633.anIntArray8285[i_266_] < (Class487.aShortArrayArrayArray5470[i_266_][i_267_]).length)
							class176.method2907(Class193.aShortArrayArray2156[i_266_][i_267_], (Class487.aShortArrayArrayArray5470[i_266_][i_267_][class633.anIntArray8285[i_266_]]));
					}
				}
				for (int i_268_ = 0; i_268_ < 10; i_268_++) {
					for (int i_269_ = 0; i_269_ < Class552.aShortArrayArray7313[i_268_].length; i_269_++) {
						if (class633.anIntArray8282[i_268_] < (Class78.aShortArrayArrayArray802[i_268_][i_269_]).length)
							class176.method2909(Class552.aShortArrayArray7313[i_268_][i_269_], (Class78.aShortArrayArrayArray802[i_268_][i_269_][class633.anIntArray8282[i_268_]]));
					}
				}
			}
			class176.method2941(i_262_);
			synchronized (aClass6_80.aClass205_60) {
				aClass6_80.aClass205_60.method3790(class176, (long) (anInt136 * 107322467 | class180.anInt2064 * -397006101 << 29));
			}
		}
		if (null != class695 || 0 != i_259_) {
			class176 = class176.method2862((byte) 1, i_262_, true);
			if (null != class695)
				class695.method14175(class176, 0, (byte) 0);
			if (i_259_ != 0)
				class176.method2986(i_256_, i_257_, i_258_, i_259_);
		}
		class176.method2941(i);
		return class176;
	}

	public final Class176 method642(Class180 class180, int i, int i_270_, Class633 class633, Class695 class695, int i_271_, int i_272_, int i_273_, int i_274_) {
		if (anIntArray125 != null && i_270_ > 1) {
			int i_275_ = -1;
			for (int i_276_ = 0; i_276_ < 10; i_276_++) {
				if (i_270_ >= anIntArray126[i_276_] && 0 != anIntArray126[i_276_])
					i_275_ = anIntArray125[i_276_];
			}
			if (i_275_ != -1)
				return (((Class9) anInterface13_79.method81(i_275_, 1158761098)).method611(class180, i, 1, class633, class695, i_271_, i_272_, i_273_, i_274_, -530089878));
		}
		int i_277_ = i;
		if (null != class695)
			i_277_ |= class695.method14174(-822649352);
		Class176 class176;
		synchronized (aClass6_80.aClass205_60) {
			class176 = ((Class176) (aClass6_80.aClass205_60.method3787((long) (107322467 * anInt136 | -397006101 * class180.anInt2064 << 29))));
		}
		if (class176 == null || class180.method3175(class176.method2874(), i_277_) != 0) {
			if (null != class176)
				i_277_ = class180.method3176(i_277_, class176.method2874());
			int i_278_ = i_277_;
			if (null != aShortArray88)
				i_278_ |= 0x8000;
			if (aShortArray85 != null || class633 != null)
				i_278_ |= 0x4000;
			if (1074235593 * anInt135 != 128)
				i_278_ |= 0x1;
			if (anInt89 * 357000625 != 128)
				i_278_ |= 0x2;
			if (904694623 * anInt137 != 128)
				i_278_ |= 0x4;
			Class175 class175 = Class175.method2814(aClass6_80.aClass459_54, -1703972677 * anInt83, 0);
			if (class175 == null)
				return null;
			if (class175.anInt1905 < 13)
				class175.method2829(2);
			class176 = class180.method3376(class175, i_278_, aClass6_80.anInt61 * -1303365985, 64 + -2087822739 * anInt93, anInt115 * 316154401 + 850);
			if (1074235593 * anInt135 != 128 || 128 != 357000625 * anInt89 || anInt137 * 904694623 != 128)
				class176.method2872(1074235593 * anInt135, anInt89 * 357000625, 904694623 * anInt137);
			if (aShortArray85 != null) {
				for (int i_279_ = 0; i_279_ < aShortArray85.length; i_279_++) {
					if (null != aByteArray87 && i_279_ < aByteArray87.length)
						class176.method2907(aShortArray85[i_279_], (aShortArray78[aByteArray87[i_279_] & 0xff]));
					else
						class176.method2907(aShortArray85[i_279_], aShortArray86[i_279_]);
				}
			}
			if (null != aShortArray88) {
				for (int i_280_ = 0; i_280_ < aShortArray88.length; i_280_++)
					class176.method2909(aShortArray88[i_280_], aShortArray131[i_280_]);
			}
			if (null != class633) {
				for (int i_281_ = 0; i_281_ < 10; i_281_++) {
					for (int i_282_ = 0; i_282_ < Class193.aShortArrayArray2156[i_281_].length; i_282_++) {
						if (class633.anIntArray8285[i_281_] < (Class487.aShortArrayArrayArray5470[i_281_][i_282_]).length)
							class176.method2907(Class193.aShortArrayArray2156[i_281_][i_282_], (Class487.aShortArrayArrayArray5470[i_281_][i_282_][class633.anIntArray8285[i_281_]]));
					}
				}
				for (int i_283_ = 0; i_283_ < 10; i_283_++) {
					for (int i_284_ = 0; i_284_ < Class552.aShortArrayArray7313[i_283_].length; i_284_++) {
						if (class633.anIntArray8282[i_283_] < (Class78.aShortArrayArrayArray802[i_283_][i_284_]).length)
							class176.method2909(Class552.aShortArrayArray7313[i_283_][i_284_], (Class78.aShortArrayArrayArray802[i_283_][i_284_][class633.anIntArray8282[i_283_]]));
					}
				}
			}
			class176.method2941(i_277_);
			synchronized (aClass6_80.aClass205_60) {
				aClass6_80.aClass205_60.method3790(class176, (long) (anInt136 * 107322467 | class180.anInt2064 * -397006101 << 29));
			}
		}
		if (null != class695 || 0 != i_274_) {
			class176 = class176.method2862((byte) 1, i_277_, true);
			if (null != class695)
				class695.method14175(class176, 0, (byte) 0);
			if (i_274_ != 0)
				class176.method2986(i_271_, i_272_, i_273_, i_274_);
		}
		class176.method2941(i);
		return class176;
	}

	public final Class176 method643(Class180 class180, int i, int i_285_, Class633 class633, Class695 class695, int i_286_, int i_287_, int i_288_, int i_289_) {
		if (anIntArray125 != null && i_285_ > 1) {
			int i_290_ = -1;
			for (int i_291_ = 0; i_291_ < 10; i_291_++) {
				if (i_285_ >= anIntArray126[i_291_] && 0 != anIntArray126[i_291_])
					i_290_ = anIntArray125[i_291_];
			}
			if (i_290_ != -1)
				return (((Class9) anInterface13_79.method81(i_290_, -1357315800)).method611(class180, i, 1, class633, class695, i_286_, i_287_, i_288_, i_289_, -536619914));
		}
		int i_292_ = i;
		if (null != class695)
			i_292_ |= class695.method14174(-822649352);
		Class176 class176;
		synchronized (aClass6_80.aClass205_60) {
			class176 = ((Class176) (aClass6_80.aClass205_60.method3787((long) (107322467 * anInt136 | -397006101 * class180.anInt2064 << 29))));
		}
		if (class176 == null || class180.method3175(class176.method2874(), i_292_) != 0) {
			if (null != class176)
				i_292_ = class180.method3176(i_292_, class176.method2874());
			int i_293_ = i_292_;
			if (null != aShortArray88)
				i_293_ |= 0x8000;
			if (aShortArray85 != null || class633 != null)
				i_293_ |= 0x4000;
			if (1074235593 * anInt135 != 128)
				i_293_ |= 0x1;
			if (anInt89 * 357000625 != 128)
				i_293_ |= 0x2;
			if (904694623 * anInt137 != 128)
				i_293_ |= 0x4;
			Class175 class175 = Class175.method2814(aClass6_80.aClass459_54, -1703972677 * anInt83, 0);
			if (class175 == null)
				return null;
			if (class175.anInt1905 < 13)
				class175.method2829(2);
			class176 = class180.method3376(class175, i_293_, aClass6_80.anInt61 * -1303365985, 64 + -2087822739 * anInt93, anInt115 * 316154401 + 850);
			if (1074235593 * anInt135 != 128 || 128 != 357000625 * anInt89 || anInt137 * 904694623 != 128)
				class176.method2872(1074235593 * anInt135, anInt89 * 357000625, 904694623 * anInt137);
			if (aShortArray85 != null) {
				for (int i_294_ = 0; i_294_ < aShortArray85.length; i_294_++) {
					if (null != aByteArray87 && i_294_ < aByteArray87.length)
						class176.method2907(aShortArray85[i_294_], (aShortArray78[aByteArray87[i_294_] & 0xff]));
					else
						class176.method2907(aShortArray85[i_294_], aShortArray86[i_294_]);
				}
			}
			if (null != aShortArray88) {
				for (int i_295_ = 0; i_295_ < aShortArray88.length; i_295_++)
					class176.method2909(aShortArray88[i_295_], aShortArray131[i_295_]);
			}
			if (null != class633) {
				for (int i_296_ = 0; i_296_ < 10; i_296_++) {
					for (int i_297_ = 0; i_297_ < Class193.aShortArrayArray2156[i_296_].length; i_297_++) {
						if (class633.anIntArray8285[i_296_] < (Class487.aShortArrayArrayArray5470[i_296_][i_297_]).length)
							class176.method2907(Class193.aShortArrayArray2156[i_296_][i_297_], (Class487.aShortArrayArrayArray5470[i_296_][i_297_][class633.anIntArray8285[i_296_]]));
					}
				}
				for (int i_298_ = 0; i_298_ < 10; i_298_++) {
					for (int i_299_ = 0; i_299_ < Class552.aShortArrayArray7313[i_298_].length; i_299_++) {
						if (class633.anIntArray8282[i_298_] < (Class78.aShortArrayArrayArray802[i_298_][i_299_]).length)
							class176.method2909(Class552.aShortArrayArray7313[i_298_][i_299_], (Class78.aShortArrayArrayArray802[i_298_][i_299_][class633.anIntArray8282[i_298_]]));
					}
				}
			}
			class176.method2941(i_292_);
			synchronized (aClass6_80.aClass205_60) {
				aClass6_80.aClass205_60.method3790(class176, (long) (anInt136 * 107322467 | class180.anInt2064 * -397006101 << 29));
			}
		}
		if (null != class695 || 0 != i_289_) {
			class176 = class176.method2862((byte) 1, i_292_, true);
			if (null != class695)
				class695.method14175(class176, 0, (byte) 0);
			if (i_289_ != 0)
				class176.method2986(i_286_, i_287_, i_288_, i_289_);
		}
		class176.method2941(i);
		return class176;
	}

	public Class9 method644(int i) {
		if (anIntArray125 != null && i > 1) {
			int i_300_ = -1;
			for (int i_301_ = 0; i_301_ < 10; i_301_++) {
				if (i >= anIntArray126[i_301_] && anIntArray126[i_301_] != 0)
					i_300_ = anIntArray125[i_301_];
			}
			if (-1 != i_300_)
				return (Class9) anInterface13_79.method81(i_300_, 270587679);
		}
		return this;
	}

	public Class9 method645(int i) {
		if (anIntArray125 != null && i > 1) {
			int i_302_ = -1;
			for (int i_303_ = 0; i_303_ < 10; i_303_++) {
				if (i >= anIntArray126[i_303_] && anIntArray126[i_303_] != 0)
					i_302_ = anIntArray125[i_303_];
			}
			if (-1 != i_302_)
				return (Class9) anInterface13_79.method81(i_302_, -108815055);
		}
		return this;
	}

	void method646(Class9 class9_304_, Class9 class9_305_, Class671 class671) {
		method606(Class21.aClass21_208, class9_304_, class9_305_, Class53.aClass53_536, class671, (byte) 31);
	}

	public String method647(int i, String string) {
		if (aClass14_143 == null)
			return string;
		Class527_Sub26 class527_sub26 = (Class527_Sub26) aClass14_143.method709((long) i);
		if (null == class527_sub26)
			return string;
		return (String) class527_sub26.anObject10522;
	}

	int[] method648(int[] is, int i) {
		int[] is_306_ = new int[1152];
		int i_307_ = 0;
		for (int i_308_ = 0; i_308_ < 32; i_308_++) {
			for (int i_309_ = 0; i_309_ < 36; i_309_++) {
				int i_310_ = is[i_307_];
				if (i_310_ == 0) {
					if (i_309_ > 0 && is[i_307_ - 1] != 0)
						i_310_ = i;
					else if (i_308_ > 0 && 0 != is[i_307_ - 36])
						i_310_ = i;
					else if (i_309_ < 35 && 0 != is[1 + i_307_])
						i_310_ = i;
					else if (i_308_ < 31 && is[36 + i_307_] != 0)
						i_310_ = i;
				}
				is_306_[i_307_++] = i_310_;
			}
		}
		return is_306_;
	}

	public String method649(int i, String string, int i_311_) {
		if (aClass14_143 == null)
			return string;
		Class527_Sub26 class527_sub26 = (Class527_Sub26) aClass14_143.method709((long) i);
		if (null == class527_sub26)
			return string;
		return (String) class527_sub26.anObject10522;
	}

	static String method650(int i, Class671 class671, Class615 class615) {
		if (i < 100000)
			return new StringBuilder().append(Class234.method4350(class615.anInt8061 * -1823030115, -1043338908)).append(i).append(aString151).toString();
		if (i < 10000000)
			return new StringBuilder().append(Class234.method4350(847490433 * class615.anInt8069, -1635650617)).append(i / 1000).append(Class53.aClass53_560.method1290(class671, (byte) -82)).append(aString151).toString();
		return new StringBuilder().append(Class234.method4350(-2000793193 * class615.anInt8065, 609271841)).append(i / 1000000).append(Class53.aClass53_669.method1290(class671, (byte) -6)).append(aString151).toString();
	}

	static String method651(int i, Class671 class671, Class615 class615) {
		if (i < 100000)
			return new StringBuilder().append(Class234.method4350(class615.anInt8061 * -1823030115, 348485325)).append(i).append(aString151).toString();
		if (i < 10000000)
			return new StringBuilder().append(Class234.method4350(847490433 * class615.anInt8069, -1130363706)).append(i / 1000).append(Class53.aClass53_560.method1290(class671, (byte) -42)).append(aString151).toString();
		return new StringBuilder().append(Class234.method4350(-2000793193 * class615.anInt8065, 1218647617)).append(i / 1000000).append(Class53.aClass53_669.method1290(class671, (byte) -50)).append(aString151).toString();
	}

	public String method652(int i, String string) {
		if (aClass14_143 == null)
			return string;
		Class527_Sub26 class527_sub26 = (Class527_Sub26) aClass14_143.method709((long) i);
		if (null == class527_sub26)
			return string;
		return (String) class527_sub26.anObject10522;
	}

	static String method653(int i) {
		return new StringBuilder().append("<col=").append(Integer.toHexString(i)).append(">").toString();
	}

	Class9(int i, Interface13 interface13, Class6 class6) {
		anInt94 = 0;
		anInt95 = 0;
		anInt138 = 0;
		anInt97 = 0;
		anInt98 = 0;
		anInt139 = 816412701;
		anInt100 = 1980648817;
		aBool122 = false;
		anInt106 = -1572536855;
		anInt123 = 216271905;
		anInt108 = -1203660899;
		anInt90 = 1463845957;
		anInt116 = 1461620721;
		anInt111 = -329347863;
		anInt99 = 562526483;
		anInt121 = 1735475793;
		anInt110 = 1125129177;
		anInt114 = 0;
		anInt130 = 0;
		anInt117 = 0;
		anInt118 = 0;
		anInt96 = 0;
		anInt120 = 0;
		anInt101 = -397647389;
		anInt112 = -299769433;
		anInt109 = 661499793;
		anInt105 = -1479479923;
		anInt127 = -1010157239;
		anInt128 = 1199583697;
		anInt129 = -1882324293;
		anInt119 = -331582577;
		anInt103 = 1741117381;
		anInt132 = 2027695975;
		aString141 = "null";
		anInt134 = 0;
		anInt135 = 25738368;
		anInt89 = 1910614144;
		anInt137 = 675827584;
		anInt93 = 0;
		anInt115 = 0;
		anInt140 = 0;
		aBool73 = false;
		anInt144 = 0;
		anInt145 = 0;
		anInt146 = 1896004601;
		anInt147 = -733594899;
		aBool148 = false;
		aBool150 = false;
		anInt136 = -1417558709 * i;
		anInterface13_79 = interface13;
		aClass6_80 = class6;
		aStringArray133 = (String[]) aClass6_80.aStringArray62.clone();
		aStringArray102 = (String[]) aClass6_80.aStringArray63.clone();
	}

	void method654(Class9 class9_312_, Class9 class9_313_, Class671 class671, int i) {
		method606(Class21.aClass21_208, class9_312_, class9_313_, Class53.aClass53_536, class671, (byte) 123);
	}

	public final boolean method655(boolean bool, Class23 class23) {
		int i;
		int i_314_;
		int i_315_;
		if (bool) {
			if (null != class23 && null != class23.anIntArray217) {
				i = class23.anIntArray217[0];
				i_314_ = class23.anIntArray217[1];
				i_315_ = class23.anIntArray217[2];
			} else {
				i = 1566897319 * anInt111;
				i_314_ = anInt99 * -291191067;
				i_315_ = anInt110 * 816794519;
			}
		} else if (null != class23 && class23.anIntArray222 != null) {
			i = class23.anIntArray222[0];
			i_314_ = class23.anIntArray222[1];
			i_315_ = class23.anIntArray222[2];
		} else {
			i = 705433971 * anInt90;
			i_314_ = -1198555409 * anInt116;
			i_315_ = anInt121 * -1591690929;
		}
		if (i == -1)
			return true;
		boolean bool_316_ = true;
		if (!aClass6_80.aClass459_54.method7479(i, 0, 102380841))
			bool_316_ = false;
		if (-1 != i_314_ && !aClass6_80.aClass459_54.method7479(i_314_, 0, 102380841))
			bool_316_ = false;
		if (-1 != i_315_ && !aClass6_80.aClass459_54.method7479(i_315_, 0, 102380841))
			bool_316_ = false;
		return bool_316_;
	}

	void method656(int[] is, int i) {
		for (int i_317_ = 31; i_317_ > 0; i_317_--) {
			int i_318_ = i_317_ * 36;
			for (int i_319_ = 35; i_319_ > 0; i_319_--) {
				if (is[i_319_ + i_318_] == 0 && is[i_319_ + i_318_ - 1 - 36] != 0)
					is[i_319_ + i_318_] = i;
			}
		}
	}

	public final boolean method657(boolean bool, Class23 class23) {
		int i;
		int i_320_;
		int i_321_;
		if (bool) {
			if (null != class23 && null != class23.anIntArray217) {
				i = class23.anIntArray217[0];
				i_320_ = class23.anIntArray217[1];
				i_321_ = class23.anIntArray217[2];
			} else {
				i = 1566897319 * anInt111;
				i_320_ = anInt99 * -291191067;
				i_321_ = anInt110 * 816794519;
			}
		} else if (null != class23 && class23.anIntArray222 != null) {
			i = class23.anIntArray222[0];
			i_320_ = class23.anIntArray222[1];
			i_321_ = class23.anIntArray222[2];
		} else {
			i = 705433971 * anInt90;
			i_320_ = -1198555409 * anInt116;
			i_321_ = anInt121 * -1591690929;
		}
		if (i == -1)
			return true;
		boolean bool_322_ = true;
		if (!aClass6_80.aClass459_54.method7479(i, 0, 102380841))
			bool_322_ = false;
		if (-1 != i_320_ && !aClass6_80.aClass459_54.method7479(i_320_, 0, 102380841))
			bool_322_ = false;
		if (-1 != i_321_ && !aClass6_80.aClass459_54.method7479(i_321_, 0, 102380841))
			bool_322_ = false;
		return bool_322_;
	}

	public final Class175 method658(boolean bool, Class23 class23) {
		int i;
		int i_323_;
		int i_324_;
		if (bool) {
			if (null != class23 && null != class23.anIntArray217) {
				i = class23.anIntArray217[0];
				i_323_ = class23.anIntArray217[1];
				i_324_ = class23.anIntArray217[2];
			} else {
				i = 1566897319 * anInt111;
				i_323_ = -291191067 * anInt99;
				i_324_ = anInt110 * 816794519;
			}
		} else if (class23 != null && null != class23.anIntArray222) {
			i = class23.anIntArray222[0];
			i_323_ = class23.anIntArray222[1];
			i_324_ = class23.anIntArray222[2];
		} else {
			i = 705433971 * anInt90;
			i_323_ = -1198555409 * anInt116;
			i_324_ = anInt121 * -1591690929;
		}
		if (-1 == i)
			return null;
		Class175 class175 = Class175.method2814(aClass6_80.aClass459_54, i, 0);
		if (null == class175)
			return null;
		if (class175.anInt1905 < 13)
			class175.method2829(2);
		if (i_323_ != -1) {
			Class175 class175_325_ = Class175.method2814(aClass6_80.aClass459_54, i_323_, 0);
			if (class175_325_.anInt1905 < 13)
				class175_325_.method2829(2);
			if (-1 != i_324_) {
				Class175 class175_326_ = Class175.method2814(aClass6_80.aClass459_54, i_324_, 0);
				if (class175_326_.anInt1905 < 13)
					class175_326_.method2829(2);
				Class175[] class175s = { class175, class175_325_, class175_326_ };
				class175 = new Class175(class175s, 3);
			} else {
				Class175[] class175s = { class175, class175_325_ };
				class175 = new Class175(class175s, 2);
			}
		}
		if (!bool && (-475298717 * anInt114 != 0 || anInt117 * -2030307987 != 0 || 0 != anInt96 * -993221861))
			class175.method2812(anInt114 * -475298717, -2030307987 * anInt117, -993221861 * anInt96);
		if (bool && (0 != anInt130 * 241241791 || 0 != 900791399 * anInt118 || 0 != 397289369 * anInt120))
			class175.method2812(anInt130 * 241241791, 900791399 * anInt118, anInt120 * 397289369);
		if (null != aShortArray85) {
			short[] is;
			if (null != class23 && null != class23.aShortArray218)
				is = class23.aShortArray218;
			else
				is = aShortArray86;
			for (int i_327_ = 0; i_327_ < aShortArray85.length; i_327_++)
				class175.method2803(aShortArray85[i_327_], is[i_327_]);
		}
		if (aShortArray88 != null) {
			short[] is;
			if (null != class23 && null != class23.aShortArray227)
				is = class23.aShortArray227;
			else
				is = aShortArray131;
			for (int i_328_ = 0; i_328_ < aShortArray88.length; i_328_++)
				class175.method2853(aShortArray88[i_328_], is[i_328_]);
		}
		return class175;
	}

	void method659(Class9 class9_329_, Class9 class9_330_, Class671 class671, byte i) {
		method606(Class21.aClass21_209, class9_329_, class9_330_, null, class671, (byte) 30);
	}

	public final boolean method660(boolean bool, Class23 class23) {
		int i;
		int i_331_;
		if (bool) {
			if (class23 != null && null != class23.anIntArray226) {
				i = class23.anIntArray226[0];
				i_331_ = class23.anIntArray226[1];
			} else {
				i = anInt109 * 2039549583;
				i_331_ = anInt105 * -2107841861;
			}
		} else if (null != class23 && class23.anIntArray224 != null) {
			i = class23.anIntArray224[0];
			i_331_ = class23.anIntArray224[1];
		} else {
			i = anInt101 * 1802376245;
			i_331_ = 1741113833 * anInt112;
		}
		if (i == -1)
			return true;
		boolean bool_332_ = true;
		if (!aClass6_80.aClass459_54.method7479(i, 0, 102380841))
			bool_332_ = false;
		if (i_331_ != -1 && !aClass6_80.aClass459_54.method7479(i_331_, 0, 102380841))
			bool_332_ = false;
		return bool_332_;
	}

	void method661(Class21 class21, Class9 class9_333_, Class9 class9_334_, Class53 class53, Class671 class671) {
		anInt83 = 1 * class9_333_.anInt83;
		anInt92 = class9_333_.anInt92 * 1;
		anInt107 = 1 * class9_333_.anInt107;
		anInt94 = class9_333_.anInt94 * 1;
		anInt95 = class9_333_.anInt95 * 1;
		anInt138 = class9_333_.anInt138 * 1;
		anInt97 = 1 * class9_333_.anInt97;
		Class9 class9_335_ = class21 == Class21.aClass21_209 ? class9_333_ : class9_334_;
		aShortArray85 = class9_335_.aShortArray85;
		aShortArray86 = class9_335_.aShortArray86;
		aByteArray87 = class9_335_.aByteArray87;
		aShortArray88 = class9_335_.aShortArray88;
		aShortArray131 = class9_335_.aShortArray131;
		aString84 = class9_334_.aString84;
		aBool122 = class9_334_.aBool122;
		if (class21 == Class21.aClass21_209) {
			anInt100 = class9_334_.anInt100 * 1;
			anInt98 = -1126447641;
		} else if (class21 == Class21.aClass21_207) {
			aString84 = class9_334_.aString141;
			anInt100 = (int) Math.floor((double) (class9_334_.anInt100 * -1204628591 / (class9_334_.anInt134 * 1388854815))) * 1980648817;
			anInt98 = -1126447641;
			aBool73 = class9_334_.aBool73;
			anInt82 = class9_333_.anInt82 * 1;
			anIntArray104 = class9_333_.anIntArray104;
			anIntArray124 = class9_333_.anIntArray124;
			aStringArray102 = new String[5];
			aStringArray102[0] = Class53.aClass53_539.method1290(class671, (byte) -25);
			aStringArray102[4] = class53.method1290(class671, (byte) -99);
		} else {
			anInt100 = 0;
			anInt98 = class9_334_.anInt98 * 1;
			anInt106 = 1 * class9_334_.anInt106;
			anInt123 = class9_334_.anInt123 * 1;
			anInt108 = 1 * class9_334_.anInt108;
			anInt90 = class9_334_.anInt90 * 1;
			anInt116 = class9_334_.anInt116 * 1;
			anInt121 = class9_334_.anInt121 * 1;
			anInt111 = class9_334_.anInt111 * 1;
			anInt99 = class9_334_.anInt99 * 1;
			anInt110 = 1 * class9_334_.anInt110;
			anInt114 = class9_334_.anInt114 * 1;
			anInt130 = class9_334_.anInt130 * 1;
			anInt117 = 1 * class9_334_.anInt117;
			anInt118 = 1 * class9_334_.anInt118;
			anInt96 = class9_334_.anInt96 * 1;
			anInt120 = class9_334_.anInt120 * 1;
			anInt101 = 1 * class9_334_.anInt101;
			anInt112 = 1 * class9_334_.anInt112;
			anInt109 = 1 * class9_334_.anInt109;
			anInt105 = class9_334_.anInt105 * 1;
			anInt82 = 1 * class9_334_.anInt82;
			anInt140 = class9_334_.anInt140 * 1;
			aStringArray133 = class9_334_.aStringArray133;
			aClass14_143 = class9_334_.aClass14_143;
			aStringArray102 = new String[5];
			if (class9_334_.aStringArray102 != null) {
				for (int i = 0; i < 4; i++)
					aStringArray102[i] = class9_334_.aStringArray102[i];
			}
			aStringArray102[4] = class53.method1290(class671, (byte) -87);
		}
	}

	static String method662(int i) {
		return new StringBuilder().append("<col=").append(Integer.toHexString(i)).append(">").toString();
	}

	public int method663(int i, int i_336_) {
		if (aClass14_143 == null)
			return i_336_;
		Node_Sub6 class527_sub7 = (Node_Sub6) aClass14_143.method709((long) i);
		if (class527_sub7 == null)
			return i_336_;
		return -78845949 * class527_sub7.anInt10398;
	}

	public int method664(int i, int i_337_) {
		if (aClass14_143 == null)
			return i_337_;
		Node_Sub6 class527_sub7 = (Node_Sub6) aClass14_143.method709((long) i);
		if (class527_sub7 == null)
			return i_337_;
		return -78845949 * class527_sub7.anInt10398;
	}

	void method665(Class9 class9_338_, Class9 class9_339_, Class671 class671) {
		method606(Class21.aClass21_207, class9_338_, class9_339_, Class53.aClass53_541, class671, (byte) 30);
	}

	static String method666(int i) {
		return new StringBuilder().append("<col=").append(Integer.toHexString(i)).append(">").toString();
	}

	void method667(Class9 class9_340_, Class9 class9_341_, Class671 class671) {
		method606(Class21.aClass21_206, class9_340_, class9_341_, Class53.aClass53_570, class671, (byte) 11);
	}

	public int method668(int i) {
		if (null == anIntArray124)
			return -1;
		return anIntArray124[i];
	}

	static final void method669(Class243 class243, Class240 class240, Class665 class665, int i) {
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		if (Class606.method10056(string, class665, 1240833843) != null)
			string = string.substring(0, string.length() - 1);
		class243.anObjectArray2616 = Class103.method1800(string, class665, (byte) -21);
		class243.aBool2606 = true;
	}
}
