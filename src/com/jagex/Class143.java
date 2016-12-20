/* Class143 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class143 {
	public static final int anInt1659 = 4318;
	public int anInt1660;
	public static final int anInt1661 = 4098;
	public static final int anInt1662 = 0;
	public static final int anInt1663 = -1;
	public int anInt1664;
	public String aString1665;
	public static final int anInt1666 = 32902;
	public String aString1667;
	public long aLong1668;
	public static Class181 aClass181_1669;

	public Class143(int i, String string, int i_0_, String string_1_, long l, boolean bool) {
		anInt1664 = 674354317 * i;
		aString1665 = string;
		anInt1660 = 395200421 * i_0_;
		aString1667 = string_1_;
		aLong1668 = 6486496358824005949L * l;
	}

	static void method2379(int i, int i_2_, int i_3_) {
		Class35.anInt333 = i * 1793245463;
		Class35.anInt359 = i_2_ * -1278926915;
	}

	static void method2380(Class26_Sub1 class26_sub1, int i) {
		class26_sub1.method16295(0, 2083967390);
		int i_4_;
		if (Class515.anInt7045 * 814176903 >= 96) {
			int i_5_ = Class574.method9623((byte) -65);
			if (i_5_ <= 101) {
				Class6.method586((byte) 14);
				i_4_ = 4;
			} else if (i_5_ <= 502) {
				Class394.method6501(-337837994);
				i_4_ = 3;
			} else if (i_5_ <= 1000) {
				Class211.method3879(1369685555);
				i_4_ = 2;
			} else {
				Class53.method1291(true, -2034576485);
				i_4_ = 1;
			}
			class26_sub1.method16294(0, i_5_, (byte) 10);
		} else {
			Class53.method1291(true, -2034576485);
			i_4_ = 1;
			class26_sub1.method16293(64, 1429692099);
		}
		if (Class204.aClass527_Sub31_2213.aClass700_Sub7_10629.method16894(-1645665526) != 0) {
			Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub7_10613), 0, 484298990);
			Class535.method8982(0, false, 2038795974);
		} else
			Class204.aClass527_Sub31_2213.method16331((Class204.aClass527_Sub31_2213.aClass700_Sub7_10629), true, (byte) 110);
		Class631.method10465(1187264776);
		class26_sub1.method16296(i_4_, 1281869212);
	}

	static void method2381(Class665 class665, short i) {
		class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = (((Class259) Class590.aClass62_Sub1_7793.method81((class665.anIntArray8525[(class665.anInt8526 * 1769813785) - 2]), 2069465450)).aStringArray2848[class665.anIntArray8525[class665.anInt8526 * 1769813785 - 1]]);
		class665.anInt8526 -= 204761682;
	}

	static void method2382(Class180 class180, Class527_Sub30 class527_sub30, Class249 class249, byte i) {
		Class147 class147 = class249.method4639(class180, -1573866322);
		if (class147 != null) {
			int i_6_ = class147.method2407();
			if (class147.method2424() > i_6_)
				i_6_ = class147.method2424();
			int i_7_ = 10;
			int i_8_ = -1409288891 * class527_sub30.anInt10569;
			int i_9_ = -745445839 * class527_sub30.anInt10570;
			int i_10_ = 0;
			int i_11_ = 0;
			if (null != class249.aString2737) {
				i_11_ = (Class529_Sub1.aClass22_10781.method810(class249.aString2737, -1803844265 * Class289.anInt3223, 0, null, -1166715511));
				i_10_ = (Class529_Sub1.aClass22_10781.method798(class249.aString2737, Class289.anInt3223 * -1803844265, null, -1543843425));
			}
			int i_12_ = class527_sub30.anInt10569 * -1409288891 + i_6_ / 2;
			int i_13_ = -745445839 * class527_sub30.anInt10570;
			if (i_8_ < i_6_ + Class529_Sub1.anInt7179) {
				i_8_ = Class529_Sub1.anInt7179;
				i_12_ = (i_10_ / 2 + (Class529_Sub1.anInt7179 + i_6_ / 2 + i_7_) + 5);
			} else if (i_8_ > Class529_Sub1.anInt7181 - i_6_) {
				i_8_ = Class529_Sub1.anInt7181 - i_6_;
				i_12_ = (Class529_Sub1.anInt7181 - i_6_ / 2 - i_7_ - i_10_ / 2 - 5);
			}
			if (i_9_ < i_6_ + Class529_Sub1.anInt7180) {
				i_9_ = Class529_Sub1.anInt7180;
				i_13_ = Class529_Sub1.anInt7180 + i_7_ + i_6_ / 2;
			} else if (i_9_ > Class529_Sub1.anInt7182 - i_6_) {
				i_9_ = Class529_Sub1.anInt7182 - i_6_;
				i_13_ = Class529_Sub1.anInt7182 - i_6_ / 2 - i_7_ - i_11_;
			}
			int i_14_ = (int) (Math.atan2((double) (i_8_ - (class527_sub30.anInt10569 * -1409288891)), (double) (i_9_ - (class527_sub30.anInt10570 * -745445839))) / 3.141592653589793 * 32767.0) & 0xffff;
			class147.method2473((float) i_8_ + (float) i_6_ / 2.0F, (float) i_6_ / 2.0F + (float) i_9_, 4096, i_14_);
			int i_15_ = -2;
			int i_16_ = -2;
			int i_17_ = -2;
			int i_18_ = -2;
			if (class249.aString2737 != null) {
				i_15_ = i_12_ - i_10_ / 2 - 5;
				i_16_ = i_13_;
				i_17_ = 10 + (i_15_ + i_10_);
				i_18_ = i_11_ + i_16_ + 3;
				if (class249.anInt2779 * 2110063129 != 0)
					class180.method3174(i_15_, i_16_, i_17_ - i_15_, i_18_ - i_16_, class249.anInt2779 * 2110063129, 1636471536);
				if (1688213881 * class249.anInt2732 != 0)
					class180.method3269(i_15_, i_16_, i_17_ - i_15_, i_18_ - i_16_, 1688213881 * class249.anInt2732, 715505638);
				Class358_Sub2.aClass174_10289.method2746(class249.aString2737, i_12_, i_13_, i_10_, i_11_, ~0xffffff | 1166915573 * class249.anInt2738, 786689371 * Class529_Sub1.aClass630_7122.anInt8236, 1, 0, 0, null, null, null, 0, 0, -1300246824);
			}
			if (class249.anInt2735 * 1928897467 != -1 || null != class249.aString2737) {
				Class527_Sub10 class527_sub10 = new Class527_Sub10(class527_sub30);
				class527_sub10.anInt10425 = (i_8_ - i_6_ / 2) * 1547116355;
				class527_sub10.anInt10423 = (i_8_ + i_6_ / 2) * 460630271;
				class527_sub10.anInt10422 = (i_9_ - i_6_) * -1555531975;
				class527_sub10.anInt10428 = -560104107 * i_9_;
				class527_sub10.anInt10426 = -1221672401 * i_15_;
				class527_sub10.anInt10424 = 240629295 * i_17_;
				class527_sub10.anInt10427 = 320863415 * i_16_;
				class527_sub10.anInt10429 = i_18_ * -1601482153;
				Class620.aClass694_8119.method14147(class527_sub10, -1331597091);
			}
		}
	}

	public static boolean method2383(int i, int i_19_) {
		return (i & -i) == i;
	}
}
