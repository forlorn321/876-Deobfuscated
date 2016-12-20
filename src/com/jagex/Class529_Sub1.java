/* Class529_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Class529_Sub1 extends Class529 {
	static HashMap aHashMap10764;
	static boolean aBool10765;
	static boolean aBool10766;
	static int anInt10767;
	public static int anInt10768;
	static int anInt10769;
	public static boolean aBool10770;
	static Class691 aClass691_10771;
	static int anInt10772;
	public static int anInt10773;
	public static int anInt10774;
	static Class147 aClass147_10775;
	static int anInt10776;
	static int anInt10777;
	static boolean aBool10778;
	static int anInt10779;
	static Class22[][] aClass22ArrayArray10780;
	static Class22 aClass22_10781;
	static HashMap aHashMap10782;
	public static int anInt10783;
	static int anInt10784;
	static Class174[][] aClass174ArrayArray10785;
	static boolean aBool10786;
	static int anInt10787;
	public static Class14 aClass14_10788;
	public static Class14 aClass14_10789;
	public static boolean aBool10790;
	static int anInt10791;
	public static boolean aBool10792;
	public static boolean aBool10793;
	static boolean aBool10794;
	static int anInt10795 = 0;
	static boolean aBool10796;

	static void method16688(int i, int i_0_, int i_1_) {
		if (1008 == i)
			Class546.method9060(Class579.aClass579_7651, i_0_, i_1_, (byte) -36);
		else if (i == 1009)
			Class546.method9060(Class579.aClass579_7657, i_0_, i_1_, (byte) 0);
		else if (1010 == i)
			Class546.method9060(Class579.aClass579_7665, i_0_, i_1_, (byte) -41);
		else if (i == 1011)
			Class546.method9060(Class579.aClass579_7653, i_0_, i_1_, (byte) -67);
		else if (i == 1012)
			Class546.method9060(Class579.aClass579_7654, i_0_, i_1_, (byte) -48);
	}

	public static void method16689(int i) {
		Class25 class25 = (Class25) aHashMap10782.get(Integer.valueOf(i));
		if (null == class25)
			class25 = new Class25();
		class25.anInt236 = 1896267987 * anInt10784;
		class25.anInt235 = anInt10791 * 1656762787;
		aHashMap10782.put(Integer.valueOf(i), class25);
	}

	static void method16690(Class180 class180, Class694 class694, int i, int i_2_) {
		Class620.aClass694_8119.method14105((byte) 16);
		if (!aBool10770) {
			for (Class527_Sub30 class527_sub30 = (Class527_Sub30) class694.method14081((short) 25584); null != class527_sub30; class527_sub30 = (Class527_Sub30) class694.method14086(-65534)) {
				Class249 class249 = ((Class249) aClass24_Sub12_7164.method81((-558184067 * (class527_sub30.anInt10567)), 598697981));
				if (Class174_Sub2.method14596(class249, (byte) -85)) {
					boolean bool = Class14.method731(class180, class527_sub30, class249, i, i_2_, 1053465343);
					if (bool)
						Class143.method2382(class180, class527_sub30, class249, (byte) -22);
				}
			}
		}
	}

	static void method16691(Class180 class180, Class527_Sub30 class527_sub30, Class249 class249) {
		Class147 class147 = class249.method4639(class180, 1378238529);
		if (class147 != null) {
			int i = class147.method2407();
			if (class147.method2424() > i)
				i = class147.method2424();
			int i_3_ = 10;
			int i_4_ = -1409288891 * class527_sub30.anInt10569;
			int i_5_ = -745445839 * class527_sub30.anInt10570;
			int i_6_ = 0;
			int i_7_ = 0;
			if (null != class249.aString2737) {
				i_7_ = aClass22_10781.method810(class249.aString2737, (-1803844265 * Class289.anInt3223), 0, null, -1306735058);
				i_6_ = aClass22_10781.method798(class249.aString2737, (Class289.anInt3223 * -1803844265), null, -2131464332);
			}
			int i_8_ = class527_sub30.anInt10569 * -1409288891 + i / 2;
			int i_9_ = -745445839 * class527_sub30.anInt10570;
			if (i_4_ < i + anInt7179) {
				i_4_ = anInt7179;
				i_8_ = i_6_ / 2 + (anInt7179 + i / 2 + i_3_) + 5;
			} else if (i_4_ > anInt7181 - i) {
				i_4_ = anInt7181 - i;
				i_8_ = anInt7181 - i / 2 - i_3_ - i_6_ / 2 - 5;
			}
			if (i_5_ < i + anInt7180) {
				i_5_ = anInt7180;
				i_9_ = anInt7180 + i_3_ + i / 2;
			} else if (i_5_ > anInt7182 - i) {
				i_5_ = anInt7182 - i;
				i_9_ = anInt7182 - i / 2 - i_3_ - i_7_;
			}
			int i_10_ = (int) (Math.atan2((double) (i_4_ - (class527_sub30.anInt10569 * -1409288891)), (double) (i_5_ - (class527_sub30.anInt10570 * -745445839))) / 3.141592653589793 * 32767.0) & 0xffff;
			class147.method2473((float) i_4_ + (float) i / 2.0F, (float) i / 2.0F + (float) i_5_, 4096, i_10_);
			int i_11_ = -2;
			int i_12_ = -2;
			int i_13_ = -2;
			int i_14_ = -2;
			if (class249.aString2737 != null) {
				i_11_ = i_8_ - i_6_ / 2 - 5;
				i_12_ = i_9_;
				i_13_ = 10 + (i_11_ + i_6_);
				i_14_ = i_7_ + i_12_ + 3;
				if (class249.anInt2779 * 2110063129 != 0)
					class180.method3174(i_11_, i_12_, i_13_ - i_11_, i_14_ - i_12_, class249.anInt2779 * 2110063129, 237872694);
				if (1688213881 * class249.anInt2732 != 0)
					class180.method3269(i_11_, i_12_, i_13_ - i_11_, i_14_ - i_12_, 1688213881 * class249.anInt2732, 1477879031);
				Class358_Sub2.aClass174_10289.method2746(class249.aString2737, i_8_, i_9_, i_6_, i_7_, ~0xffffff | 1166915573 * class249.anInt2738, 786689371 * aClass630_7122.anInt8236, 1, 0, 0, null, null, null, 0, 0, -1300246824);
			}
			if (class249.anInt2735 * 1928897467 != -1 || null != class249.aString2737) {
				Class527_Sub10 class527_sub10 = new Class527_Sub10(class527_sub30);
				class527_sub10.anInt10425 = (i_4_ - i / 2) * 1547116355;
				class527_sub10.anInt10423 = (i_4_ + i / 2) * 460630271;
				class527_sub10.anInt10422 = (i_5_ - i) * -1555531975;
				class527_sub10.anInt10428 = -560104107 * i_5_;
				class527_sub10.anInt10426 = -1221672401 * i_11_;
				class527_sub10.anInt10424 = 240629295 * i_13_;
				class527_sub10.anInt10427 = 320863415 * i_12_;
				class527_sub10.anInt10429 = i_14_ * -1601482153;
				Class620.aClass694_8119.method14147(class527_sub10, -1249128872);
			}
		}
	}

	static void method16692() {
		if (anInt10783 * -502443805 < 0) {
			anInt10783 = 0;
			anInt10779 = -1449615877;
			anInt10772 = -1784395681;
		}
		if (anInt10783 * -502443805 > anInt7131) {
			anInt10783 = 2049864907 * anInt7131;
			anInt10779 = -1449615877;
			anInt10772 = -1784395681;
		}
		if (Class635.anInt8302 * 1891819005 < 0) {
			Class635.anInt8302 = 0;
			anInt10779 = -1449615877;
			anInt10772 = -1784395681;
		}
		if (Class635.anInt8302 * 1891819005 > anInt7167) {
			Class635.anInt8302 = anInt7167 * -1224612011;
			anInt10779 = -1449615877;
			anInt10772 = -1784395681;
		}
	}

	static void method16693() {
		Class620.aClass694_8119 = null;
		anInt10773 = 0;
		anInt7178 = 0;
		Class527_Sub27.aClass243_10524 = null;
		method8748();
		aClass694_7147.method14105((byte) 115);
		aClass532_7135 = null;
		aClass205_7161.method3793((byte) 8);
		aClass205_7129.method3793((byte) 61);
		aClass147_10775 = null;
		anInt10779 = -1449615877;
		anInt10772 = -1784395681;
		if (aClass24_Sub12_7164 != null) {
			aClass24_Sub12_7164.method836(-1840081732);
			aClass24_Sub12_7164.method17394(128, 64, (byte) -24);
		}
		if (null != aClass24_Sub8_7119)
			aClass24_Sub8_7119.method17378(64, 64, -2047347255);
		if (null != aClass24_Sub6_7117)
			aClass24_Sub6_7117.method838(256, -2084981894);
		Class51.aClass24_Sub16_522.method838(64, -2007496044);
	}

	static void method16694() {
		Class620.aClass694_8119 = null;
		anInt10773 = 0;
		anInt7178 = 0;
		Class527_Sub27.aClass243_10524 = null;
		method8748();
		aClass694_7147.method14105((byte) 17);
		aClass532_7135 = null;
		aClass205_7161.method3793((byte) 12);
		aClass205_7129.method3793((byte) 108);
		aClass147_10775 = null;
		anInt10779 = -1449615877;
		anInt10772 = -1784395681;
		if (aClass24_Sub12_7164 != null) {
			aClass24_Sub12_7164.method836(-1761536119);
			aClass24_Sub12_7164.method17394(128, 64, (byte) 29);
		}
		if (null != aClass24_Sub8_7119)
			aClass24_Sub8_7119.method17378(64, 64, -1345340940);
		if (null != aClass24_Sub6_7117)
			aClass24_Sub6_7117.method838(256, -2059783475);
		Class51.aClass24_Sub16_522.method838(64, -2020656917);
	}

	public static void method16695(int i) {
		Class25 class25 = (Class25) aHashMap10764.get(Integer.valueOf(i));
		if (class25 == null)
			class25 = new Class25();
		class25.anInt236 = anInt10784 * 1896267987;
		class25.anInt235 = 1656762787 * anInt10791;
		aHashMap10764.put(Integer.valueOf(i), class25);
	}

	static void method16696() {
		int i = -1;
		if (null != aClass527_Sub8_Sub12_7123)
			i = aClass527_Sub8_Sub12_7123.anInt11765 * 911503199;
		Class592.method9876((byte) -125);
		for (int i_15_ = 0; i_15_ < 3; i_15_++) {
			for (int i_16_ = 0; i_16_ < 5; i_16_++) {
				aClass174ArrayArray10785[i_15_][i_16_] = null;
				aClass22ArrayArray10780[i_15_][i_16_] = null;
			}
		}
		aClass527_Sub8_Sub12_7123 = null;
		if (i != -1)
			Class572.method9608(i, -1, -1, false, 2143586841);
	}

	static void method16697() {
		int i = -1;
		if (null != aClass527_Sub8_Sub12_7123)
			i = aClass527_Sub8_Sub12_7123.anInt11765 * 911503199;
		Class592.method9876((byte) 105);
		for (int i_17_ = 0; i_17_ < 3; i_17_++) {
			for (int i_18_ = 0; i_18_ < 5; i_18_++) {
				aClass174ArrayArray10785[i_17_][i_18_] = null;
				aClass22ArrayArray10780[i_17_][i_18_] = null;
			}
		}
		aClass527_Sub8_Sub12_7123 = null;
		if (i != -1)
			Class572.method9608(i, -1, -1, false, 2144400918);
	}

	static void method16698(int i) {
		Class635.anInt8302 = i * -1224612011;
		anInt10772 = -1784395681;
		anInt10772 = -1784395681;
		Class146.method2401((byte) 118);
	}

	static void method16699() {
		Class592.method9876((byte) -33);
		aClass527_Sub8_Sub12_7123 = null;
		Class603.aClass527_Sub8_Sub12_7959 = null;
		aClass14_10788.method721(-943071923);
		aClass14_10789.method721(-1403829618);
		for (int i = 0; i < 3; i++) {
			for (int i_19_ = 0; i_19_ < 5; i_19_++) {
				aClass174ArrayArray10785[i][i_19_] = null;
				aClass22ArrayArray10780[i][i_19_] = null;
			}
		}
	}

	static void method16700() {
		Class592.method9876((byte) 26);
		aClass527_Sub8_Sub12_7123 = null;
		Class603.aClass527_Sub8_Sub12_7959 = null;
		aClass14_10788.method721(-1427423518);
		aClass14_10789.method721(925963249);
		for (int i = 0; i < 3; i++) {
			for (int i_20_ = 0; i_20_ < 5; i_20_++) {
				aClass174ArrayArray10785[i][i_20_] = null;
				aClass22ArrayArray10780[i][i_20_] = null;
			}
		}
	}

	static void method16701(Class180 class180, Class694 class694, int i, int i_21_) {
		Class620.aClass694_8119.method14105((byte) 36);
		if (!aBool10770) {
			for (Class527_Sub30 class527_sub30 = (Class527_Sub30) class694.method14081((short) -5256); null != class527_sub30; class527_sub30 = (Class527_Sub30) class694.method14086(-65534)) {
				Class249 class249 = ((Class249) aClass24_Sub12_7164.method81((-558184067 * (class527_sub30.anInt10567)), -1856367111));
				if (Class174_Sub2.method14596(class249, (byte) -64)) {
					boolean bool = Class14.method731(class180, class527_sub30, class249, i, i_21_, -1429534190);
					if (bool)
						Class143.method2382(class180, class527_sub30, class249, (byte) -92);
				}
			}
		}
	}

	static void method16702(Class180 class180, int i, int i_22_, int i_23_, int i_24_) {
		class180.method3132(i, i_22_, i + i_23_, i_22_ + i_24_);
		if (anInt10773 * -1639647951 < 100) {
			int i_25_ = 20;
			int i_26_ = i + i_23_ / 2;
			int i_27_ = i_22_ + i_24_ / 2 - 18 - i_25_;
			class180.method3348(i, i_22_, i_23_, i_24_, -16777216, 0);
			class180.method3134(i_26_ - 152, i_27_, 304, 34, client.aColorArray11044[-1289997611 * client.anInt10993].getRGB(), 0);
			class180.method3348(i_26_ - 150, i_27_ + 2, anInt10773 * -623976557, 30, client.aColorArray11098[client.anInt10993 * -1289997611].getRGB(), 0);
			Class29.aClass174_262.method2745(Class53.aClass53_648.method1290(Class144_Sub1.aClass671_8995, (byte) -14), i_26_, i_25_ + i_27_, client.aColorArray11057[-1289997611 * client.anInt10993].getRGB(), -1, 1348145444);
		} else {
			int i_28_ = anInt10783 * -502443805 - (int) ((float) i_23_ / aFloat7133);
			int i_29_ = (1891819005 * Class635.anInt8302 + (int) ((float) i_24_ / aFloat7133));
			int i_30_ = anInt10783 * -502443805 + (int) ((float) i_23_ / aFloat7133);
			int i_31_ = (Class635.anInt8302 * 1891819005 - (int) ((float) i_24_ / aFloat7133));
			Class400.anInt4142 = (anInt10783 * -502443805 - (int) ((float) i_23_ / aFloat7133)) * 722671441;
			Class701.anInt8796 = 1312438649 * (Class635.anInt8302 * 1891819005 - (int) ((float) i_24_ / aFloat7133));
			Class316_Sub1.anInt10040 = 1416497589 * (int) ((float) (i_23_ * 2) / aFloat7133);
			Class55.anInt710 = (int) ((float) (2 * i_24_) / aFloat7133) * 466095865;
			aClass205_7163 = aClass205_7161;
			method8846(i_28_ + anInt7137, anInt7138 + i_29_, i_30_ + anInt7137, anInt7138 + i_31_, i, i_22_, i + i_23_, i_22_ + i_24_ + 1);
			method8763(class180, !aBool10794, !aBool10766, client.aBool11165, false);
			Class694 class694 = method8770(class180);
			Class112.method2020(class180, class694, 0, 0, (byte) 62);
			if (client.aBool11022) {
				int i_32_ = i_23_ + i - 5;
				int i_33_ = i_22_ + i_24_ - 8;
				Class85.aClass174_819.method2744(new StringBuilder().append("Fps: ").append(-1176934951 * Class515.anInt7014).append(" (").append(-961466639 * Class515.anInt7016).append(" ms)").toString(), i_32_, i_33_, 16776960, -1, -377311585);
				i_33_ -= 15;
				Runtime runtime = Runtime.getRuntime();
				int i_34_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
				int i_35_ = 16776960;
				if (i_34_ > 65536)
					i_35_ = 16711680;
				Class85.aClass174_819.method2744(new StringBuilder().append("Mem:").append(i_34_).append("k").toString(), i_32_, i_33_, i_35_, -1, -121257493);
				i_33_ -= 15;
			}
			aClass205_7161.method3792(5, (byte) -8);
		}
	}

	static void method16703(Class180 class180, int i, int i_36_, int i_37_, int i_38_) {
		class180.method3132(i, i_36_, i + i_37_, i_36_ + i_38_);
		if (anInt10773 * -1639647951 < 100) {
			int i_39_ = 20;
			int i_40_ = i + i_37_ / 2;
			int i_41_ = i_36_ + i_38_ / 2 - 18 - i_39_;
			class180.method3348(i, i_36_, i_37_, i_38_, -16777216, 0);
			class180.method3134(i_40_ - 152, i_41_, 304, 34, client.aColorArray11044[-1289997611 * client.anInt10993].getRGB(), 0);
			class180.method3348(i_40_ - 150, i_41_ + 2, anInt10773 * -623976557, 30, client.aColorArray11098[client.anInt10993 * -1289997611].getRGB(), 0);
			Class29.aClass174_262.method2745(Class53.aClass53_648.method1290(Class144_Sub1.aClass671_8995, (byte) -120), i_40_, i_39_ + i_41_, client.aColorArray11057[-1289997611 * client.anInt10993].getRGB(), -1, 1348145444);
		} else {
			int i_42_ = anInt10783 * -502443805 - (int) ((float) i_37_ / aFloat7133);
			int i_43_ = (1891819005 * Class635.anInt8302 + (int) ((float) i_38_ / aFloat7133));
			int i_44_ = anInt10783 * -502443805 + (int) ((float) i_37_ / aFloat7133);
			int i_45_ = (Class635.anInt8302 * 1891819005 - (int) ((float) i_38_ / aFloat7133));
			Class400.anInt4142 = (anInt10783 * -502443805 - (int) ((float) i_37_ / aFloat7133)) * 722671441;
			Class701.anInt8796 = 1312438649 * (Class635.anInt8302 * 1891819005 - (int) ((float) i_38_ / aFloat7133));
			Class316_Sub1.anInt10040 = 1416497589 * (int) ((float) (i_37_ * 2) / aFloat7133);
			Class55.anInt710 = (int) ((float) (2 * i_38_) / aFloat7133) * 466095865;
			aClass205_7163 = aClass205_7161;
			method8846(i_42_ + anInt7137, anInt7138 + i_43_, i_44_ + anInt7137, anInt7138 + i_45_, i, i_36_, i + i_37_, i_36_ + i_38_ + 1);
			method8763(class180, !aBool10794, !aBool10766, client.aBool11165, false);
			Class694 class694 = method8770(class180);
			Class112.method2020(class180, class694, 0, 0, (byte) 82);
			if (client.aBool11022) {
				int i_46_ = i_37_ + i - 5;
				int i_47_ = i_36_ + i_38_ - 8;
				Class85.aClass174_819.method2744(new StringBuilder().append("Fps: ").append(-1176934951 * Class515.anInt7014).append(" (").append(-961466639 * Class515.anInt7016).append(" ms)").toString(), i_46_, i_47_, 16776960, -1, -1469648589);
				i_47_ -= 15;
				Runtime runtime = Runtime.getRuntime();
				int i_48_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
				int i_49_ = 16776960;
				if (i_48_ > 65536)
					i_49_ = 16711680;
				Class85.aClass174_819.method2744(new StringBuilder().append("Mem:").append(i_48_).append("k").toString(), i_46_, i_47_, i_49_, -1, -2055712453);
				i_47_ -= 15;
			}
			aClass205_7161.method3792(5, (byte) 42);
		}
	}

	static void method16704(Class180 class180, Class694 class694, int i, int i_50_) {
		Class620.aClass694_8119.method14105((byte) 8);
		if (!aBool10770) {
			for (Class527_Sub30 class527_sub30 = (Class527_Sub30) class694.method14081((short) -25930); null != class527_sub30; class527_sub30 = (Class527_Sub30) class694.method14086(-65534)) {
				Class249 class249 = ((Class249) aClass24_Sub12_7164.method81((-558184067 * (class527_sub30.anInt10567)), 1333062917));
				if (Class174_Sub2.method14596(class249, (byte) -18)) {
					boolean bool = Class14.method731(class180, class527_sub30, class249, i, i_50_, -1224080166);
					if (bool)
						Class143.method2382(class180, class527_sub30, class249, (byte) -39);
				}
			}
		}
	}

	static void method16705(boolean bool) {
		Class592 class592 = Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.method18534(-2108951278);
		Class527_Sub8_Sub12 class527_sub8_sub12 = method8818(153371143 * class592.anInt7798, class592.anInt7799 * -2029646807);
		if (class527_sub8_sub12 == null)
			class527_sub8_sub12 = method8752(aClass630_7122.anInt8228 * 1674945435);
		if (Class603.aClass527_Sub8_Sub12_7959 != class527_sub8_sub12 || bool) {
			Class603.aClass527_Sub8_Sub12_7959 = class527_sub8_sub12;
			boolean bool_51_ = method8831(class527_sub8_sub12);
			if (bool_51_) {
				aBool7172 = true;
				Class592.method9876((byte) 40);
			}
		}
	}

	public static int method16706(int i, int i_52_, int i_53_) {
		if (anInt10773 * -1639647951 < 100)
			return -2;
		int i_54_ = -2;
		int i_55_ = 2147483647;
		int i_56_ = i_52_ - anInt7137;
		int i_57_ = i_53_ - anInt7138;
		for (Class527_Sub30 class527_sub30 = (Class527_Sub30) aClass694_7147.method14081((short) 11547); class527_sub30 != null; class527_sub30 = (Class527_Sub30) aClass694_7147.method14086(-65534)) {
			if (class527_sub30.anInt10567 * -558184067 == i) {
				int i_58_ = class527_sub30.anInt10568 * 208579007;
				int i_59_ = -1499963557 * class527_sub30.anInt10565;
				int i_60_ = i_58_ + anInt7137 << 14 | anInt7138 + i_59_;
				int i_61_ = ((i_56_ - i_58_) * (i_56_ - i_58_) + (i_57_ - i_59_) * (i_57_ - i_59_));
				if (i_54_ < 0 || i_61_ < i_55_) {
					i_54_ = i_60_;
					i_55_ = i_61_;
				}
			}
		}
		return i_54_;
	}

	static void method16707(Class180 class180, Class694 class694, int i, int i_62_) {
		Class620.aClass694_8119.method14105((byte) 113);
		if (!aBool10770) {
			for (Class527_Sub30 class527_sub30 = (Class527_Sub30) class694.method14081((short) -5613); null != class527_sub30; class527_sub30 = (Class527_Sub30) class694.method14086(-65534)) {
				Class249 class249 = ((Class249) aClass24_Sub12_7164.method81((-558184067 * (class527_sub30.anInt10567)), 826145872));
				if (Class174_Sub2.method14596(class249, (byte) 4)) {
					boolean bool = Class14.method731(class180, class527_sub30, class249, i, i_62_, -1187190977);
					if (bool)
						Class143.method2382(class180, class527_sub30, class249, (byte) -38);
				}
			}
		}
	}

	static boolean method16708(Class180 class180, Class527_Sub30 class527_sub30, Class249 class249, int i, int i_63_) {
		if (aBool7165 && !client.aBool11165 && !method8774(class527_sub30.anInt10568 * 208579007, class527_sub30.anInt10565 * -1499963557))
			return false;
		if (null != class249.anIntArray2759) {
			class249 = class249.method4645(anInterface20_7121, anInterface18_7120, -676942845);
			if (class249 == null)
				return false;
		}
		int i_64_ = 2147483647;
		int i_65_ = -2147483648;
		int i_66_ = 2147483647;
		int i_67_ = -2147483648;
		if (null != class249.anIntArray2760) {
			i_64_ = (((class249.anInt2740 * -1712073 + class527_sub30.anInt10568 * 208579007 - anInt7125) * (anInt7181 - anInt7179) / (anInt7177 - anInt7125)) + anInt7179);
			i_65_ = anInt7179 + ((anInt7181 - anInt7179) * (208579007 * class527_sub30.anInt10568 + 1589409961 * class249.anInt2771 - anInt7125) / (anInt7177 - anInt7125));
			i_67_ = anInt7182 - ((-1499963557 * class527_sub30.anInt10565 + class249.anInt2748 * -1564335433 - anInt7175) * (anInt7182 - anInt7180) / (anInt7136 - anInt7175));
			i_66_ = anInt7182 - ((class527_sub30.anInt10565 * -1499963557 + class249.anInt2764 * -548669143 - anInt7175) * (anInt7182 - anInt7180) / (anInt7136 - anInt7175));
		}
		Class147 class147 = null;
		int i_68_ = 0;
		int i_69_ = 0;
		int i_70_ = 0;
		int i_71_ = 0;
		if (-1 != class249.anInt2735 * 1928897467) {
			if (class527_sub30.aBool10571 && 1028708925 * class249.anInt2736 != -1)
				class147 = class249.method4637(class180, true, 1669294038);
			else
				class147 = class249.method4637(class180, false, 2009699994);
			if (class147 != null) {
				switch (class249.aClass274_2752.anInt3146 * -229615941) {
				case 1:
					i_68_ = (-1409288891 * class527_sub30.anInt10569 - (class147.method42() + 1 >> 1));
					i_69_ = (class527_sub30.anInt10569 * -1409288891 + (class147.method42() + 1 >> 1));
					break;
				case 2:
					i_68_ = class527_sub30.anInt10569 * -1409288891;
					i_69_ = (class527_sub30.anInt10569 * -1409288891 + class147.method42());
					break;
				case 0:
					i_68_ = (-1409288891 * class527_sub30.anInt10569 - class147.method42());
					i_69_ = class527_sub30.anInt10569 * -1409288891;
					break;
				}
				switch (-401058325 * class249.aClass277_2763.anInt3165) {
				case 1:
					i_70_ = (class527_sub30.anInt10570 * -745445839 - (class147.method2410() + 1 >> 1));
					i_71_ = (class527_sub30.anInt10570 * -745445839 + (class147.method2410() + 1 >> 1));
					break;
				case 0:
					i_70_ = class527_sub30.anInt10570 * -745445839;
					i_71_ = (class527_sub30.anInt10570 * -745445839 + class147.method2410());
					break;
				case 2:
					i_70_ = (-745445839 * class527_sub30.anInt10570 - class147.method2410());
					i_71_ = -745445839 * class527_sub30.anInt10570;
					break;
				}
				if (i_68_ < i_64_)
					i_64_ = i_68_;
				if (i_69_ > i_65_)
					i_65_ = i_69_;
				if (i_70_ < i_66_)
					i_66_ = i_70_;
				if (i_71_ > i_67_)
					i_67_ = i_71_;
			}
		}
		Class147 class147_72_ = null;
		if (class249.anInt2745 * 581159495 != -1)
			class147_72_ = class249.method4648(class180, (byte) 4);
		int i_73_ = 0;
		int i_74_ = 0;
		int i_75_ = 0;
		int i_76_ = 0;
		int i_77_ = 0;
		int i_78_ = 0;
		int i_79_ = 0;
		int i_80_ = 0;
		if (null != class249.aString2737) {
			Class332.method5838(1365262055 * class249.anInt2741, (byte) 37);
			if (Class358_Sub2.aClass174_10289 != null) {
				i_80_ = aClass22_10781.method810(class249.aString2737, (Class289.anInt3223 * -1803844265), 0, null, -1655450415);
				i_75_ = aClass22_10781.method798(class249.aString2737, (Class289.anInt3223 * -1803844265), null, -1493815486);
				i_73_ = (class527_sub30.anInt10569 * -1409288891 - i_75_ / 2 + (class249.anInt2769 * 899834733 * (anInt7181 - anInt7179) / (anInt7177 - anInt7125)));
				i_74_ = (class527_sub30.anInt10570 * -745445839 - (class249.anInt2766 * -1987476183 * (anInt7182 - anInt7180) / (anInt7136 - anInt7175)));
				if (class147 == null)
					i_74_ -= i_80_ / 2;
				else
					i_74_ -= (class147.method2410() >> 1) + i_80_;
				i_76_ = i_73_ + i;
				if (i_76_ < i_64_)
					i_64_ = i_76_;
				i_77_ = i + (i_75_ + i_73_);
				if (i_77_ > i_65_)
					i_65_ = i_77_;
				i_78_ = i_74_ + i_63_;
				if (i_78_ < i_66_)
					i_66_ = i_78_;
				i_79_ = i_63_ + (i_74_ + i_80_);
				if (i_79_ > i_67_)
					i_67_ = i_79_;
			}
		}
		if (i_65_ < anInt7179 || i_64_ > anInt7181 || i_67_ < anInt7180 || i_66_ > anInt7182)
			return true;
		method8773(class180, class527_sub30, class249);
		if (null != class147) {
			int i_81_ = 0;
			int i_82_ = 0;
			int i_83_ = 0;
			int i_84_ = 0;
			int i_85_ = 0;
			int i_86_ = 0;
			switch (-229615941 * class249.aClass274_2752.anInt3146) {
			case 2:
				i_82_ = -(class147.method2407() + 1) / 2;
				break;
			case 0:
				i_81_ = class147.method2407();
				i_82_ = (class147.method2407() + 1) / 2;
				i_83_ = class147.method42();
				break;
			case 1:
				i_81_ = class147.method2407() / 2;
				i_83_ = class147.method42() >> 1;
				break;
			}
			switch (class249.aClass277_2763.anInt3165 * -401058325) {
			case 1:
				i_84_ = class147.method2407() / 2;
				i_86_ = class147.method2410() >> 1;
				break;
			case 2:
				i_84_ = class147.method2407();
				i_85_ = (class147.method2407() + 1) / 2;
				i_86_ = class147.method2410();
				break;
			case 0:
				i_85_ = -(class147.method2407() + 1) / 2;
				break;
			}
			Class25 class25 = ((Class25) aHashMap10782.get(Integer.valueOf(class527_sub30.anInt10567 * -558184067)));
			if (class25 == null)
				class25 = ((Class25) aHashMap10764.get(Integer.valueOf(-1771553873 * (class249.anInt2777))));
			if (class25 != null && -1 == 581159495 * class249.anInt2745) {
				int i_87_;
				if (class25.anInt235 * -810418811 > anInt10791 * 1570431151 / 2)
					i_87_ = ((anInt10791 * 1027984977 - -498366597 * class25.anInt235) / (1570431151 * anInt10791));
				else
					i_87_ = class25.anInt235 * -498366597 / (1570431151 * anInt10791);
				int i_88_ = i_87_ << 24 | 0xffff00;
				if (class180 instanceof Class180_Sub2) {
					class180.method3174(class527_sub30.anInt10569 * -1409288891 - i_81_ - 7, class527_sub30.anInt10570 * -745445839 - i_84_ - 7, class147.method2407() + 14, class147.method2407() + 14, i_88_, -233161623);
					class180.method3174(-1409288891 * class527_sub30.anInt10569 - i_81_ - 5, class527_sub30.anInt10570 * -745445839 - i_84_ - 5, class147.method2407() + 10, class147.method2407() + 10, i_88_, -1537088087);
					class180.method3174(-1409288891 * class527_sub30.anInt10569 - i_81_ - 3, -745445839 * class527_sub30.anInt10570 - i_84_ - 3, class147.method2407() + 6, class147.method2407() + 6, i_88_, -1255392441);
					class180.method3174(class527_sub30.anInt10569 * -1409288891 - i_81_ - 1, class527_sub30.anInt10570 * -745445839 - i_84_ - 1, class147.method2407() + 2, class147.method2407() + 2, i_88_, 343282978);
					class180.method3174(-1409288891 * class527_sub30.anInt10569 - i_81_, class527_sub30.anInt10570 * -745445839 - i_84_, class147.method2407(), class147.method2407(), i_88_, 1372867351);
				} else {
					class180.method3139(class527_sub30.anInt10569 * -1409288891 - i_82_, class527_sub30.anInt10570 * -745445839 - i_85_, class147.method2407() / 2 + 7, i_88_, (byte) -31);
					class180.method3139((class527_sub30.anInt10569 * -1409288891) - i_82_, (class527_sub30.anInt10570 * -745445839 - i_85_ - i_85_) != 0 ? 1 : 0, class147.method2407() / 2 + 5, i_88_, (byte) -16);
					class180.method3139(class527_sub30.anInt10569 * -1409288891 - i_82_, 0 != (-745445839 * class527_sub30.anInt10570 - i_85_ - i_85_) ? 1 : 0, class147.method2407() / 2 + 3, i_88_, (byte) -95);
					class180.method3139((class527_sub30.anInt10569 * -1409288891) - i_82_, (-745445839 * class527_sub30.anInt10570 - i_85_ - i_85_) != 0 ? 1 : 0, class147.method2407() / 2 + 1, i_88_, (byte) -37);
					class180.method3139((-1409288891 * class527_sub30.anInt10569) - i_82_, (class527_sub30.anInt10570 * -745445839 - i_85_ - i_85_) != 0 ? 1 : 0, class147.method2407() / 2, i_88_, (byte) -8);
				}
			}
			class147.method2415((-1409288891 * class527_sub30.anInt10569 - i_83_), (-745445839 * class527_sub30.anInt10570 - i_86_));
			int i_89_ = 0;
			int i_90_ = 0;
			if (null != class25 && null != class147_72_) {
				switch (class249.aClass274_2752.anInt3146 * -229615941) {
				case 1:
					i_89_ = class147_72_.method42() >> 1;
					break;
				case 0:
					break;
				case 2:
					i_89_ = class147_72_.method42();
					break;
				}
				switch (class249.aClass277_2763.anInt3165 * -401058325) {
				case 2:
					i_90_ = (class147_72_.method2410() + class147.method2410()) / 2;
					break;
				case 0:
					break;
				case 1:
					i_90_ = (class147_72_.method2410() / 2 + class147.method2410()) / 2;
					break;
				}
				int i_91_;
				if (-810418811 * class25.anInt235 > 1570431151 * anInt10791 / 2)
					i_91_ = ((anInt10791 * 1027984977 - class25.anInt235 * -498366597) / (anInt10791 * 1570431151));
				else
					i_91_ = -498366597 * class25.anInt235 / (1570431151 * anInt10791);
				int i_92_ = i_91_ << 24 | 0xffff00;
				class147_72_.method2416((class527_sub30.anInt10569 * -1409288891) - i_89_, (-745445839 * class527_sub30.anInt10570 - i_90_), 0, i_92_, 1);
			}
		}
		if (null != class249.aString2737 && Class358_Sub2.aClass174_10289 != null)
			Class553.method9195(class180, class527_sub30, class249, i_73_, i_74_, i_80_, i_75_, -2017952067);
		if (1928897467 * class249.anInt2735 != -1 || class249.aString2737 != null) {
			Class527_Sub10 class527_sub10 = new Class527_Sub10(class527_sub30);
			class527_sub10.anInt10425 = 1547116355 * i_68_;
			class527_sub10.anInt10423 = i_69_ * 460630271;
			class527_sub10.anInt10422 = i_70_ * -1555531975;
			class527_sub10.anInt10428 = -560104107 * i_71_;
			class527_sub10.anInt10426 = -1221672401 * i_76_;
			class527_sub10.anInt10424 = i_77_ * 240629295;
			class527_sub10.anInt10427 = i_78_ * 320863415;
			class527_sub10.anInt10429 = -1601482153 * i_79_;
			Class620.aClass694_8119.method14147(class527_sub10, -1851106081);
		}
		return false;
	}

	static void method16709(Class180 class180, Class694 class694, int i, int i_93_) {
		Class620.aClass694_8119.method14105((byte) 47);
		if (!aBool10770) {
			for (Class527_Sub30 class527_sub30 = (Class527_Sub30) class694.method14081((short) -9159); null != class527_sub30; class527_sub30 = (Class527_Sub30) class694.method14086(-65534)) {
				Class249 class249 = ((Class249) aClass24_Sub12_7164.method81((-558184067 * (class527_sub30.anInt10567)), -971925817));
				if (Class174_Sub2.method14596(class249, (byte) -109)) {
					boolean bool = Class14.method731(class180, class527_sub30, class249, i, i_93_, -1204111638);
					if (bool)
						Class143.method2382(class180, class527_sub30, class249, (byte) -30);
				}
			}
		}
	}

	static boolean method16710(Class249 class249) {
		if (null == class249)
			return false;
		if (null != class249.anIntArray2759) {
			class249 = class249.method4645(anInterface20_7121, anInterface18_7120, -506435782);
			if (class249 == null)
				return false;
		}
		if (!class249.aBool2746)
			return false;
		if (!class249.method4638(anInterface20_7121, anInterface18_7120, 1949405825))
			return false;
		if (aClass14_10788.method709((long) (1657285097 * class249.anInt2772)) != null)
			return false;
		if (aClass14_10789.method709((long) (class249.anInt2777 * -1771553873)) != null)
			return false;
		if (null != class249.aString2737) {
			if (0 == 1365262055 * class249.anInt2741 && aBool10790)
				return false;
			if (1 == class249.anInt2741 * 1365262055 && aBool10792)
				return false;
			if (2 == class249.anInt2741 * 1365262055 && aBool10793)
				return false;
		}
		return true;
	}

	static boolean method16711(Class249 class249) {
		if (null == class249)
			return false;
		if (null != class249.anIntArray2759) {
			class249 = class249.method4645(anInterface20_7121, anInterface18_7120, -1122722993);
			if (class249 == null)
				return false;
		}
		if (!class249.aBool2746)
			return false;
		if (!class249.method4638(anInterface20_7121, anInterface18_7120, 1949405825))
			return false;
		if (aClass14_10788.method709((long) (1657285097 * class249.anInt2772)) != null)
			return false;
		if (aClass14_10789.method709((long) (class249.anInt2777 * -1771553873)) != null)
			return false;
		if (null != class249.aString2737) {
			if (0 == 1365262055 * class249.anInt2741 && aBool10790)
				return false;
			if (1 == class249.anInt2741 * 1365262055 && aBool10792)
				return false;
			if (2 == class249.anInt2741 * 1365262055 && aBool10793)
				return false;
		}
		return true;
	}

	public static void method16712(int i) {
		if (i < 1)
			anInt10791 = -2065903011 * anInt10774;
		else
			anInt10791 = -509839793 * i;
	}

	static boolean method16713(Class180 class180, Class527_Sub30 class527_sub30, Class249 class249, int i, int i_94_) {
		if (aBool7165 && !client.aBool11165 && !method8774(class527_sub30.anInt10568 * 208579007, class527_sub30.anInt10565 * -1499963557))
			return false;
		if (null != class249.anIntArray2759) {
			class249 = class249.method4645(anInterface20_7121, anInterface18_7120, -864087345);
			if (class249 == null)
				return false;
		}
		int i_95_ = 2147483647;
		int i_96_ = -2147483648;
		int i_97_ = 2147483647;
		int i_98_ = -2147483648;
		if (null != class249.anIntArray2760) {
			i_95_ = (((class249.anInt2740 * -1712073 + class527_sub30.anInt10568 * 208579007 - anInt7125) * (anInt7181 - anInt7179) / (anInt7177 - anInt7125)) + anInt7179);
			i_96_ = anInt7179 + ((anInt7181 - anInt7179) * (208579007 * class527_sub30.anInt10568 + 1589409961 * class249.anInt2771 - anInt7125) / (anInt7177 - anInt7125));
			i_98_ = anInt7182 - ((-1499963557 * class527_sub30.anInt10565 + class249.anInt2748 * -1564335433 - anInt7175) * (anInt7182 - anInt7180) / (anInt7136 - anInt7175));
			i_97_ = anInt7182 - ((class527_sub30.anInt10565 * -1499963557 + class249.anInt2764 * -548669143 - anInt7175) * (anInt7182 - anInt7180) / (anInt7136 - anInt7175));
		}
		Class147 class147 = null;
		int i_99_ = 0;
		int i_100_ = 0;
		int i_101_ = 0;
		int i_102_ = 0;
		if (-1 != class249.anInt2735 * 1928897467) {
			if (class527_sub30.aBool10571 && 1028708925 * class249.anInt2736 != -1)
				class147 = class249.method4637(class180, true, 2108862258);
			else
				class147 = class249.method4637(class180, false, 1998999682);
			if (class147 != null) {
				switch (class249.aClass274_2752.anInt3146 * -229615941) {
				case 1:
					i_99_ = (-1409288891 * class527_sub30.anInt10569 - (class147.method42() + 1 >> 1));
					i_100_ = (class527_sub30.anInt10569 * -1409288891 + (class147.method42() + 1 >> 1));
					break;
				case 2:
					i_99_ = class527_sub30.anInt10569 * -1409288891;
					i_100_ = (class527_sub30.anInt10569 * -1409288891 + class147.method42());
					break;
				case 0:
					i_99_ = (-1409288891 * class527_sub30.anInt10569 - class147.method42());
					i_100_ = class527_sub30.anInt10569 * -1409288891;
					break;
				}
				switch (-401058325 * class249.aClass277_2763.anInt3165) {
				case 1:
					i_101_ = (class527_sub30.anInt10570 * -745445839 - (class147.method2410() + 1 >> 1));
					i_102_ = (class527_sub30.anInt10570 * -745445839 + (class147.method2410() + 1 >> 1));
					break;
				case 0:
					i_101_ = class527_sub30.anInt10570 * -745445839;
					i_102_ = (class527_sub30.anInt10570 * -745445839 + class147.method2410());
					break;
				case 2:
					i_101_ = (-745445839 * class527_sub30.anInt10570 - class147.method2410());
					i_102_ = -745445839 * class527_sub30.anInt10570;
					break;
				}
				if (i_99_ < i_95_)
					i_95_ = i_99_;
				if (i_100_ > i_96_)
					i_96_ = i_100_;
				if (i_101_ < i_97_)
					i_97_ = i_101_;
				if (i_102_ > i_98_)
					i_98_ = i_102_;
			}
		}
		Class147 class147_103_ = null;
		if (class249.anInt2745 * 581159495 != -1)
			class147_103_ = class249.method4648(class180, (byte) 4);
		int i_104_ = 0;
		int i_105_ = 0;
		int i_106_ = 0;
		int i_107_ = 0;
		int i_108_ = 0;
		int i_109_ = 0;
		int i_110_ = 0;
		int i_111_ = 0;
		if (null != class249.aString2737) {
			Class332.method5838(1365262055 * class249.anInt2741, (byte) 62);
			if (Class358_Sub2.aClass174_10289 != null) {
				i_111_ = aClass22_10781.method810(class249.aString2737, (Class289.anInt3223 * -1803844265), 0, null, -1051567415);
				i_106_ = aClass22_10781.method798(class249.aString2737, (Class289.anInt3223 * -1803844265), null, -1574734931);
				i_104_ = (class527_sub30.anInt10569 * -1409288891 - i_106_ / 2 + (class249.anInt2769 * 899834733 * (anInt7181 - anInt7179) / (anInt7177 - anInt7125)));
				i_105_ = (class527_sub30.anInt10570 * -745445839 - (class249.anInt2766 * -1987476183 * (anInt7182 - anInt7180) / (anInt7136 - anInt7175)));
				if (class147 == null)
					i_105_ -= i_111_ / 2;
				else
					i_105_ -= (class147.method2410() >> 1) + i_111_;
				i_107_ = i_104_ + i;
				if (i_107_ < i_95_)
					i_95_ = i_107_;
				i_108_ = i + (i_106_ + i_104_);
				if (i_108_ > i_96_)
					i_96_ = i_108_;
				i_109_ = i_105_ + i_94_;
				if (i_109_ < i_97_)
					i_97_ = i_109_;
				i_110_ = i_94_ + (i_105_ + i_111_);
				if (i_110_ > i_98_)
					i_98_ = i_110_;
			}
		}
		if (i_96_ < anInt7179 || i_95_ > anInt7181 || i_98_ < anInt7180 || i_97_ > anInt7182)
			return true;
		method8773(class180, class527_sub30, class249);
		if (null != class147) {
			int i_112_ = 0;
			int i_113_ = 0;
			int i_114_ = 0;
			int i_115_ = 0;
			int i_116_ = 0;
			int i_117_ = 0;
			switch (-229615941 * class249.aClass274_2752.anInt3146) {
			case 2:
				i_113_ = -(class147.method2407() + 1) / 2;
				break;
			case 0:
				i_112_ = class147.method2407();
				i_113_ = (class147.method2407() + 1) / 2;
				i_114_ = class147.method42();
				break;
			case 1:
				i_112_ = class147.method2407() / 2;
				i_114_ = class147.method42() >> 1;
				break;
			}
			switch (class249.aClass277_2763.anInt3165 * -401058325) {
			case 1:
				i_115_ = class147.method2407() / 2;
				i_117_ = class147.method2410() >> 1;
				break;
			case 2:
				i_115_ = class147.method2407();
				i_116_ = (class147.method2407() + 1) / 2;
				i_117_ = class147.method2410();
				break;
			case 0:
				i_116_ = -(class147.method2407() + 1) / 2;
				break;
			}
			Class25 class25 = ((Class25) aHashMap10782.get(Integer.valueOf(class527_sub30.anInt10567 * -558184067)));
			if (class25 == null)
				class25 = ((Class25) aHashMap10764.get(Integer.valueOf(-1771553873 * (class249.anInt2777))));
			if (class25 != null && -1 == 581159495 * class249.anInt2745) {
				int i_118_;
				if (class25.anInt235 * -810418811 > anInt10791 * 1570431151 / 2)
					i_118_ = ((anInt10791 * 1027984977 - -498366597 * class25.anInt235) / (1570431151 * anInt10791));
				else
					i_118_ = class25.anInt235 * -498366597 / (1570431151 * anInt10791);
				int i_119_ = i_118_ << 24 | 0xffff00;
				if (class180 instanceof Class180_Sub2) {
					class180.method3174(class527_sub30.anInt10569 * -1409288891 - i_112_ - 7, class527_sub30.anInt10570 * -745445839 - i_115_ - 7, class147.method2407() + 14, class147.method2407() + 14, i_119_, 32110938);
					class180.method3174(-1409288891 * class527_sub30.anInt10569 - i_112_ - 5, class527_sub30.anInt10570 * -745445839 - i_115_ - 5, class147.method2407() + 10, class147.method2407() + 10, i_119_, -125473792);
					class180.method3174(-1409288891 * class527_sub30.anInt10569 - i_112_ - 3, -745445839 * class527_sub30.anInt10570 - i_115_ - 3, class147.method2407() + 6, class147.method2407() + 6, i_119_, -954184342);
					class180.method3174(class527_sub30.anInt10569 * -1409288891 - i_112_ - 1, class527_sub30.anInt10570 * -745445839 - i_115_ - 1, class147.method2407() + 2, class147.method2407() + 2, i_119_, -1909248952);
					class180.method3174(-1409288891 * class527_sub30.anInt10569 - i_112_, class527_sub30.anInt10570 * -745445839 - i_115_, class147.method2407(), class147.method2407(), i_119_, -1440543064);
				} else {
					class180.method3139(class527_sub30.anInt10569 * -1409288891 - i_113_, class527_sub30.anInt10570 * -745445839 - i_116_, class147.method2407() / 2 + 7, i_119_, (byte) -117);
					class180.method3139((class527_sub30.anInt10569 * -1409288891) - i_113_, (class527_sub30.anInt10570 * -745445839 - i_116_ - i_116_) != 0 ? 1 : 0, class147.method2407() / 2 + 5, i_119_, (byte) -41);
					class180.method3139(class527_sub30.anInt10569 * -1409288891 - i_113_, 0 != (-745445839 * class527_sub30.anInt10570 - i_116_ - i_116_) ? 1 : 0, class147.method2407() / 2 + 3, i_119_, (byte) -111);
					class180.method3139((class527_sub30.anInt10569 * -1409288891) - i_113_, (-745445839 * class527_sub30.anInt10570 - i_116_ - i_116_) != 0 ? 1 : 0, class147.method2407() / 2 + 1, i_119_, (byte) -65);
					class180.method3139((-1409288891 * class527_sub30.anInt10569) - i_113_, (class527_sub30.anInt10570 * -745445839 - i_116_ - i_116_) != 0 ? 1 : 0, class147.method2407() / 2, i_119_, (byte) -50);
				}
			}
			class147.method2415((-1409288891 * class527_sub30.anInt10569 - i_114_), (-745445839 * class527_sub30.anInt10570 - i_117_));
			int i_120_ = 0;
			int i_121_ = 0;
			if (null != class25 && null != class147_103_) {
				switch (class249.aClass274_2752.anInt3146 * -229615941) {
				case 1:
					i_120_ = class147_103_.method42() >> 1;
					break;
				case 0:
					break;
				case 2:
					i_120_ = class147_103_.method42();
					break;
				}
				switch (class249.aClass277_2763.anInt3165 * -401058325) {
				case 2:
					i_121_ = (class147_103_.method2410() + class147.method2410()) / 2;
					break;
				case 0:
					break;
				case 1:
					i_121_ = (class147_103_.method2410() / 2 + class147.method2410()) / 2;
					break;
				}
				int i_122_;
				if (-810418811 * class25.anInt235 > 1570431151 * anInt10791 / 2)
					i_122_ = ((anInt10791 * 1027984977 - class25.anInt235 * -498366597) / (anInt10791 * 1570431151));
				else
					i_122_ = -498366597 * class25.anInt235 / (1570431151 * anInt10791);
				int i_123_ = i_122_ << 24 | 0xffff00;
				class147_103_.method2416(class527_sub30.anInt10569 * -1409288891 - i_120_, -745445839 * class527_sub30.anInt10570 - i_121_, 0, i_123_, 1);
			}
		}
		if (null != class249.aString2737 && Class358_Sub2.aClass174_10289 != null)
			Class553.method9195(class180, class527_sub30, class249, i_104_, i_105_, i_111_, i_106_, -1930056066);
		if (1928897467 * class249.anInt2735 != -1 || class249.aString2737 != null) {
			Class527_Sub10 class527_sub10 = new Class527_Sub10(class527_sub30);
			class527_sub10.anInt10425 = 1547116355 * i_99_;
			class527_sub10.anInt10423 = i_100_ * 460630271;
			class527_sub10.anInt10422 = i_101_ * -1555531975;
			class527_sub10.anInt10428 = -560104107 * i_102_;
			class527_sub10.anInt10426 = -1221672401 * i_107_;
			class527_sub10.anInt10424 = i_108_ * 240629295;
			class527_sub10.anInt10427 = i_109_ * 320863415;
			class527_sub10.anInt10429 = -1601482153 * i_110_;
			Class620.aClass694_8119.method14147(class527_sub10, -356851051);
		}
		return false;
	}

	static boolean method16714(Class180 class180, Class527_Sub30 class527_sub30, Class249 class249, int i, int i_124_) {
		if (aBool7165 && !client.aBool11165 && !method8774(class527_sub30.anInt10568 * 208579007, class527_sub30.anInt10565 * -1499963557))
			return false;
		if (null != class249.anIntArray2759) {
			class249 = class249.method4645(anInterface20_7121, anInterface18_7120, 106539713);
			if (class249 == null)
				return false;
		}
		int i_125_ = 2147483647;
		int i_126_ = -2147483648;
		int i_127_ = 2147483647;
		int i_128_ = -2147483648;
		if (null != class249.anIntArray2760) {
			i_125_ = (((class249.anInt2740 * -1712073 + class527_sub30.anInt10568 * 208579007 - anInt7125) * (anInt7181 - anInt7179) / (anInt7177 - anInt7125)) + anInt7179);
			i_126_ = anInt7179 + ((anInt7181 - anInt7179) * (208579007 * class527_sub30.anInt10568 + 1589409961 * class249.anInt2771 - anInt7125) / (anInt7177 - anInt7125));
			i_128_ = anInt7182 - ((-1499963557 * class527_sub30.anInt10565 + class249.anInt2748 * -1564335433 - anInt7175) * (anInt7182 - anInt7180) / (anInt7136 - anInt7175));
			i_127_ = anInt7182 - ((class527_sub30.anInt10565 * -1499963557 + class249.anInt2764 * -548669143 - anInt7175) * (anInt7182 - anInt7180) / (anInt7136 - anInt7175));
		}
		Class147 class147 = null;
		int i_129_ = 0;
		int i_130_ = 0;
		int i_131_ = 0;
		int i_132_ = 0;
		if (-1 != class249.anInt2735 * 1928897467) {
			if (class527_sub30.aBool10571 && 1028708925 * class249.anInt2736 != -1)
				class147 = class249.method4637(class180, true, 2142445123);
			else
				class147 = class249.method4637(class180, false, 1873657075);
			if (class147 != null) {
				switch (class249.aClass274_2752.anInt3146 * -229615941) {
				case 1:
					i_129_ = (-1409288891 * class527_sub30.anInt10569 - (class147.method42() + 1 >> 1));
					i_130_ = (class527_sub30.anInt10569 * -1409288891 + (class147.method42() + 1 >> 1));
					break;
				case 2:
					i_129_ = class527_sub30.anInt10569 * -1409288891;
					i_130_ = (class527_sub30.anInt10569 * -1409288891 + class147.method42());
					break;
				case 0:
					i_129_ = (-1409288891 * class527_sub30.anInt10569 - class147.method42());
					i_130_ = class527_sub30.anInt10569 * -1409288891;
					break;
				}
				switch (-401058325 * class249.aClass277_2763.anInt3165) {
				case 1:
					i_131_ = (class527_sub30.anInt10570 * -745445839 - (class147.method2410() + 1 >> 1));
					i_132_ = (class527_sub30.anInt10570 * -745445839 + (class147.method2410() + 1 >> 1));
					break;
				case 0:
					i_131_ = class527_sub30.anInt10570 * -745445839;
					i_132_ = (class527_sub30.anInt10570 * -745445839 + class147.method2410());
					break;
				case 2:
					i_131_ = (-745445839 * class527_sub30.anInt10570 - class147.method2410());
					i_132_ = -745445839 * class527_sub30.anInt10570;
					break;
				}
				if (i_129_ < i_125_)
					i_125_ = i_129_;
				if (i_130_ > i_126_)
					i_126_ = i_130_;
				if (i_131_ < i_127_)
					i_127_ = i_131_;
				if (i_132_ > i_128_)
					i_128_ = i_132_;
			}
		}
		Class147 class147_133_ = null;
		if (class249.anInt2745 * 581159495 != -1)
			class147_133_ = class249.method4648(class180, (byte) 4);
		int i_134_ = 0;
		int i_135_ = 0;
		int i_136_ = 0;
		int i_137_ = 0;
		int i_138_ = 0;
		int i_139_ = 0;
		int i_140_ = 0;
		int i_141_ = 0;
		if (null != class249.aString2737) {
			Class332.method5838(1365262055 * class249.anInt2741, (byte) 98);
			if (Class358_Sub2.aClass174_10289 != null) {
				i_141_ = aClass22_10781.method810(class249.aString2737, (Class289.anInt3223 * -1803844265), 0, null, -1328712263);
				i_136_ = aClass22_10781.method798(class249.aString2737, (Class289.anInt3223 * -1803844265), null, -1890724854);
				i_134_ = (class527_sub30.anInt10569 * -1409288891 - i_136_ / 2 + (class249.anInt2769 * 899834733 * (anInt7181 - anInt7179) / (anInt7177 - anInt7125)));
				i_135_ = (class527_sub30.anInt10570 * -745445839 - (class249.anInt2766 * -1987476183 * (anInt7182 - anInt7180) / (anInt7136 - anInt7175)));
				if (class147 == null)
					i_135_ -= i_141_ / 2;
				else
					i_135_ -= (class147.method2410() >> 1) + i_141_;
				i_137_ = i_134_ + i;
				if (i_137_ < i_125_)
					i_125_ = i_137_;
				i_138_ = i + (i_136_ + i_134_);
				if (i_138_ > i_126_)
					i_126_ = i_138_;
				i_139_ = i_135_ + i_124_;
				if (i_139_ < i_127_)
					i_127_ = i_139_;
				i_140_ = i_124_ + (i_135_ + i_141_);
				if (i_140_ > i_128_)
					i_128_ = i_140_;
			}
		}
		if (i_126_ < anInt7179 || i_125_ > anInt7181 || i_128_ < anInt7180 || i_127_ > anInt7182)
			return true;
		method8773(class180, class527_sub30, class249);
		if (null != class147) {
			int i_142_ = 0;
			int i_143_ = 0;
			int i_144_ = 0;
			int i_145_ = 0;
			int i_146_ = 0;
			int i_147_ = 0;
			switch (-229615941 * class249.aClass274_2752.anInt3146) {
			case 2:
				i_143_ = -(class147.method2407() + 1) / 2;
				break;
			case 0:
				i_142_ = class147.method2407();
				i_143_ = (class147.method2407() + 1) / 2;
				i_144_ = class147.method42();
				break;
			case 1:
				i_142_ = class147.method2407() / 2;
				i_144_ = class147.method42() >> 1;
				break;
			}
			switch (class249.aClass277_2763.anInt3165 * -401058325) {
			case 1:
				i_145_ = class147.method2407() / 2;
				i_147_ = class147.method2410() >> 1;
				break;
			case 2:
				i_145_ = class147.method2407();
				i_146_ = (class147.method2407() + 1) / 2;
				i_147_ = class147.method2410();
				break;
			case 0:
				i_146_ = -(class147.method2407() + 1) / 2;
				break;
			}
			Class25 class25 = ((Class25) aHashMap10782.get(Integer.valueOf(class527_sub30.anInt10567 * -558184067)));
			if (class25 == null)
				class25 = ((Class25) aHashMap10764.get(Integer.valueOf(-1771553873 * (class249.anInt2777))));
			if (class25 != null && -1 == 581159495 * class249.anInt2745) {
				int i_148_;
				if (class25.anInt235 * -810418811 > anInt10791 * 1570431151 / 2)
					i_148_ = ((anInt10791 * 1027984977 - -498366597 * class25.anInt235) / (1570431151 * anInt10791));
				else
					i_148_ = class25.anInt235 * -498366597 / (1570431151 * anInt10791);
				int i_149_ = i_148_ << 24 | 0xffff00;
				if (class180 instanceof Class180_Sub2) {
					class180.method3174(class527_sub30.anInt10569 * -1409288891 - i_142_ - 7, class527_sub30.anInt10570 * -745445839 - i_145_ - 7, class147.method2407() + 14, class147.method2407() + 14, i_149_, -1268657957);
					class180.method3174(-1409288891 * class527_sub30.anInt10569 - i_142_ - 5, class527_sub30.anInt10570 * -745445839 - i_145_ - 5, class147.method2407() + 10, class147.method2407() + 10, i_149_, 1121566647);
					class180.method3174(-1409288891 * class527_sub30.anInt10569 - i_142_ - 3, -745445839 * class527_sub30.anInt10570 - i_145_ - 3, class147.method2407() + 6, class147.method2407() + 6, i_149_, 973502174);
					class180.method3174(class527_sub30.anInt10569 * -1409288891 - i_142_ - 1, class527_sub30.anInt10570 * -745445839 - i_145_ - 1, class147.method2407() + 2, class147.method2407() + 2, i_149_, 1581698211);
					class180.method3174(-1409288891 * class527_sub30.anInt10569 - i_142_, class527_sub30.anInt10570 * -745445839 - i_145_, class147.method2407(), class147.method2407(), i_149_, 2073935423);
				} else {
					class180.method3139(class527_sub30.anInt10569 * -1409288891 - i_143_, class527_sub30.anInt10570 * -745445839 - i_146_, class147.method2407() / 2 + 7, i_149_, (byte) -12);
					class180.method3139((class527_sub30.anInt10569 * -1409288891) - i_143_, (class527_sub30.anInt10570 * -745445839 - i_146_ - i_146_) != 0 ? 1 : 0, class147.method2407() / 2 + 5, i_149_, (byte) -48);
					class180.method3139(class527_sub30.anInt10569 * -1409288891 - i_143_, 0 != (-745445839 * class527_sub30.anInt10570 - i_146_ - i_146_) ? 1 : 0, class147.method2407() / 2 + 3, i_149_, (byte) -69);
					class180.method3139((class527_sub30.anInt10569 * -1409288891) - i_143_, (-745445839 * class527_sub30.anInt10570 - i_146_ - i_146_) != 0 ? 1 : 0, class147.method2407() / 2 + 1, i_149_, (byte) -113);
					class180.method3139((-1409288891 * class527_sub30.anInt10569) - i_143_, (class527_sub30.anInt10570 * -745445839 - i_146_ - i_146_) != 0 ? 1 : 0, class147.method2407() / 2, i_149_, (byte) -68);
				}
			}
			class147.method2415((-1409288891 * class527_sub30.anInt10569 - i_144_), (-745445839 * class527_sub30.anInt10570 - i_147_));
			int i_150_ = 0;
			int i_151_ = 0;
			if (null != class25 && null != class147_133_) {
				switch (class249.aClass274_2752.anInt3146 * -229615941) {
				case 1:
					i_150_ = class147_133_.method42() >> 1;
					break;
				case 0:
					break;
				case 2:
					i_150_ = class147_133_.method42();
					break;
				}
				switch (class249.aClass277_2763.anInt3165 * -401058325) {
				case 2:
					i_151_ = (class147_133_.method2410() + class147.method2410()) / 2;
					break;
				case 0:
					break;
				case 1:
					i_151_ = (class147_133_.method2410() / 2 + class147.method2410()) / 2;
					break;
				}
				int i_152_;
				if (-810418811 * class25.anInt235 > 1570431151 * anInt10791 / 2)
					i_152_ = ((anInt10791 * 1027984977 - class25.anInt235 * -498366597) / (anInt10791 * 1570431151));
				else
					i_152_ = -498366597 * class25.anInt235 / (1570431151 * anInt10791);
				int i_153_ = i_152_ << 24 | 0xffff00;
				class147_133_.method2416(class527_sub30.anInt10569 * -1409288891 - i_150_, -745445839 * class527_sub30.anInt10570 - i_151_, 0, i_153_, 1);
			}
		}
		if (null != class249.aString2737 && Class358_Sub2.aClass174_10289 != null)
			Class553.method9195(class180, class527_sub30, class249, i_134_, i_135_, i_141_, i_136_, -1959716399);
		if (1928897467 * class249.anInt2735 != -1 || class249.aString2737 != null) {
			Class527_Sub10 class527_sub10 = new Class527_Sub10(class527_sub30);
			class527_sub10.anInt10425 = 1547116355 * i_129_;
			class527_sub10.anInt10423 = i_130_ * 460630271;
			class527_sub10.anInt10422 = i_131_ * -1555531975;
			class527_sub10.anInt10428 = -560104107 * i_132_;
			class527_sub10.anInt10426 = -1221672401 * i_137_;
			class527_sub10.anInt10424 = i_138_ * 240629295;
			class527_sub10.anInt10427 = i_139_ * 320863415;
			class527_sub10.anInt10429 = -1601482153 * i_140_;
			Class620.aClass694_8119.method14147(class527_sub10, -1549446242);
		}
		return false;
	}

	static boolean method16715(Class180 class180, Class527_Sub30 class527_sub30, Class249 class249, int i, int i_154_) {
		if (aBool7165 && !client.aBool11165 && !method8774(class527_sub30.anInt10568 * 208579007, class527_sub30.anInt10565 * -1499963557))
			return false;
		if (null != class249.anIntArray2759) {
			class249 = class249.method4645(anInterface20_7121, anInterface18_7120, -216162728);
			if (class249 == null)
				return false;
		}
		int i_155_ = 2147483647;
		int i_156_ = -2147483648;
		int i_157_ = 2147483647;
		int i_158_ = -2147483648;
		if (null != class249.anIntArray2760) {
			i_155_ = (((class249.anInt2740 * -1712073 + class527_sub30.anInt10568 * 208579007 - anInt7125) * (anInt7181 - anInt7179) / (anInt7177 - anInt7125)) + anInt7179);
			i_156_ = anInt7179 + ((anInt7181 - anInt7179) * (208579007 * class527_sub30.anInt10568 + 1589409961 * class249.anInt2771 - anInt7125) / (anInt7177 - anInt7125));
			i_158_ = anInt7182 - ((-1499963557 * class527_sub30.anInt10565 + class249.anInt2748 * -1564335433 - anInt7175) * (anInt7182 - anInt7180) / (anInt7136 - anInt7175));
			i_157_ = anInt7182 - ((class527_sub30.anInt10565 * -1499963557 + class249.anInt2764 * -548669143 - anInt7175) * (anInt7182 - anInt7180) / (anInt7136 - anInt7175));
		}
		Class147 class147 = null;
		int i_159_ = 0;
		int i_160_ = 0;
		int i_161_ = 0;
		int i_162_ = 0;
		if (-1 != class249.anInt2735 * 1928897467) {
			if (class527_sub30.aBool10571 && 1028708925 * class249.anInt2736 != -1)
				class147 = class249.method4637(class180, true, 1749999699);
			else
				class147 = class249.method4637(class180, false, 1886609914);
			if (class147 != null) {
				switch (class249.aClass274_2752.anInt3146 * -229615941) {
				case 1:
					i_159_ = (-1409288891 * class527_sub30.anInt10569 - (class147.method42() + 1 >> 1));
					i_160_ = (class527_sub30.anInt10569 * -1409288891 + (class147.method42() + 1 >> 1));
					break;
				case 2:
					i_159_ = class527_sub30.anInt10569 * -1409288891;
					i_160_ = (class527_sub30.anInt10569 * -1409288891 + class147.method42());
					break;
				case 0:
					i_159_ = (-1409288891 * class527_sub30.anInt10569 - class147.method42());
					i_160_ = class527_sub30.anInt10569 * -1409288891;
					break;
				}
				switch (-401058325 * class249.aClass277_2763.anInt3165) {
				case 1:
					i_161_ = (class527_sub30.anInt10570 * -745445839 - (class147.method2410() + 1 >> 1));
					i_162_ = (class527_sub30.anInt10570 * -745445839 + (class147.method2410() + 1 >> 1));
					break;
				case 0:
					i_161_ = class527_sub30.anInt10570 * -745445839;
					i_162_ = (class527_sub30.anInt10570 * -745445839 + class147.method2410());
					break;
				case 2:
					i_161_ = (-745445839 * class527_sub30.anInt10570 - class147.method2410());
					i_162_ = -745445839 * class527_sub30.anInt10570;
					break;
				}
				if (i_159_ < i_155_)
					i_155_ = i_159_;
				if (i_160_ > i_156_)
					i_156_ = i_160_;
				if (i_161_ < i_157_)
					i_157_ = i_161_;
				if (i_162_ > i_158_)
					i_158_ = i_162_;
			}
		}
		Class147 class147_163_ = null;
		if (class249.anInt2745 * 581159495 != -1)
			class147_163_ = class249.method4648(class180, (byte) 4);
		int i_164_ = 0;
		int i_165_ = 0;
		int i_166_ = 0;
		int i_167_ = 0;
		int i_168_ = 0;
		int i_169_ = 0;
		int i_170_ = 0;
		int i_171_ = 0;
		if (null != class249.aString2737) {
			Class332.method5838(1365262055 * class249.anInt2741, (byte) 64);
			if (Class358_Sub2.aClass174_10289 != null) {
				i_171_ = aClass22_10781.method810(class249.aString2737, (Class289.anInt3223 * -1803844265), 0, null, -1700323348);
				i_166_ = aClass22_10781.method798(class249.aString2737, (Class289.anInt3223 * -1803844265), null, -1438327288);
				i_164_ = (class527_sub30.anInt10569 * -1409288891 - i_166_ / 2 + (class249.anInt2769 * 899834733 * (anInt7181 - anInt7179) / (anInt7177 - anInt7125)));
				i_165_ = (class527_sub30.anInt10570 * -745445839 - (class249.anInt2766 * -1987476183 * (anInt7182 - anInt7180) / (anInt7136 - anInt7175)));
				if (class147 == null)
					i_165_ -= i_171_ / 2;
				else
					i_165_ -= (class147.method2410() >> 1) + i_171_;
				i_167_ = i_164_ + i;
				if (i_167_ < i_155_)
					i_155_ = i_167_;
				i_168_ = i + (i_166_ + i_164_);
				if (i_168_ > i_156_)
					i_156_ = i_168_;
				i_169_ = i_165_ + i_154_;
				if (i_169_ < i_157_)
					i_157_ = i_169_;
				i_170_ = i_154_ + (i_165_ + i_171_);
				if (i_170_ > i_158_)
					i_158_ = i_170_;
			}
		}
		if (i_156_ < anInt7179 || i_155_ > anInt7181 || i_158_ < anInt7180 || i_157_ > anInt7182)
			return true;
		method8773(class180, class527_sub30, class249);
		if (null != class147) {
			int i_172_ = 0;
			int i_173_ = 0;
			int i_174_ = 0;
			int i_175_ = 0;
			int i_176_ = 0;
			int i_177_ = 0;
			switch (-229615941 * class249.aClass274_2752.anInt3146) {
			case 2:
				i_173_ = -(class147.method2407() + 1) / 2;
				break;
			case 0:
				i_172_ = class147.method2407();
				i_173_ = (class147.method2407() + 1) / 2;
				i_174_ = class147.method42();
				break;
			case 1:
				i_172_ = class147.method2407() / 2;
				i_174_ = class147.method42() >> 1;
				break;
			}
			switch (class249.aClass277_2763.anInt3165 * -401058325) {
			case 1:
				i_175_ = class147.method2407() / 2;
				i_177_ = class147.method2410() >> 1;
				break;
			case 2:
				i_175_ = class147.method2407();
				i_176_ = (class147.method2407() + 1) / 2;
				i_177_ = class147.method2410();
				break;
			case 0:
				i_176_ = -(class147.method2407() + 1) / 2;
				break;
			}
			Class25 class25 = ((Class25) aHashMap10782.get(Integer.valueOf(class527_sub30.anInt10567 * -558184067)));
			if (class25 == null)
				class25 = ((Class25) aHashMap10764.get(Integer.valueOf(-1771553873 * (class249.anInt2777))));
			if (class25 != null && -1 == 581159495 * class249.anInt2745) {
				int i_178_;
				if (class25.anInt235 * -810418811 > anInt10791 * 1570431151 / 2)
					i_178_ = ((anInt10791 * 1027984977 - -498366597 * class25.anInt235) / (1570431151 * anInt10791));
				else
					i_178_ = class25.anInt235 * -498366597 / (1570431151 * anInt10791);
				int i_179_ = i_178_ << 24 | 0xffff00;
				if (class180 instanceof Class180_Sub2) {
					class180.method3174(class527_sub30.anInt10569 * -1409288891 - i_172_ - 7, class527_sub30.anInt10570 * -745445839 - i_175_ - 7, class147.method2407() + 14, class147.method2407() + 14, i_179_, -2139283484);
					class180.method3174(-1409288891 * class527_sub30.anInt10569 - i_172_ - 5, class527_sub30.anInt10570 * -745445839 - i_175_ - 5, class147.method2407() + 10, class147.method2407() + 10, i_179_, 1857588553);
					class180.method3174(-1409288891 * class527_sub30.anInt10569 - i_172_ - 3, -745445839 * class527_sub30.anInt10570 - i_175_ - 3, class147.method2407() + 6, class147.method2407() + 6, i_179_, -1224738702);
					class180.method3174(class527_sub30.anInt10569 * -1409288891 - i_172_ - 1, class527_sub30.anInt10570 * -745445839 - i_175_ - 1, class147.method2407() + 2, class147.method2407() + 2, i_179_, 799505705);
					class180.method3174(-1409288891 * class527_sub30.anInt10569 - i_172_, class527_sub30.anInt10570 * -745445839 - i_175_, class147.method2407(), class147.method2407(), i_179_, 1548751068);
				} else {
					class180.method3139(class527_sub30.anInt10569 * -1409288891 - i_173_, class527_sub30.anInt10570 * -745445839 - i_176_, class147.method2407() / 2 + 7, i_179_, (byte) -59);
					class180.method3139((class527_sub30.anInt10569 * -1409288891) - i_173_, (class527_sub30.anInt10570 * -745445839 - i_176_ - i_176_) != 0 ? 1 : 0, class147.method2407() / 2 + 5, i_179_, (byte) -73);
					class180.method3139(class527_sub30.anInt10569 * -1409288891 - i_173_, 0 != (-745445839 * class527_sub30.anInt10570 - i_176_ - i_176_) ? 1 : 0, class147.method2407() / 2 + 3, i_179_, (byte) -117);
					class180.method3139((class527_sub30.anInt10569 * -1409288891) - i_173_, (-745445839 * class527_sub30.anInt10570 - i_176_ - i_176_) != 0 ? 1 : 0, class147.method2407() / 2 + 1, i_179_, (byte) -37);
					class180.method3139((-1409288891 * class527_sub30.anInt10569) - i_173_, (class527_sub30.anInt10570 * -745445839 - i_176_ - i_176_) != 0 ? 1 : 0, class147.method2407() / 2, i_179_, (byte) -3);
				}
			}
			class147.method2415((-1409288891 * class527_sub30.anInt10569 - i_174_), (-745445839 * class527_sub30.anInt10570 - i_177_));
			int i_180_ = 0;
			int i_181_ = 0;
			if (null != class25 && null != class147_163_) {
				switch (class249.aClass274_2752.anInt3146 * -229615941) {
				case 1:
					i_180_ = class147_163_.method42() >> 1;
					break;
				case 0:
					break;
				case 2:
					i_180_ = class147_163_.method42();
					break;
				}
				switch (class249.aClass277_2763.anInt3165 * -401058325) {
				case 2:
					i_181_ = (class147_163_.method2410() + class147.method2410()) / 2;
					break;
				case 0:
					break;
				case 1:
					i_181_ = (class147_163_.method2410() / 2 + class147.method2410()) / 2;
					break;
				}
				int i_182_;
				if (-810418811 * class25.anInt235 > 1570431151 * anInt10791 / 2)
					i_182_ = ((anInt10791 * 1027984977 - class25.anInt235 * -498366597) / (anInt10791 * 1570431151));
				else
					i_182_ = -498366597 * class25.anInt235 / (1570431151 * anInt10791);
				int i_183_ = i_182_ << 24 | 0xffff00;
				class147_163_.method2416(class527_sub30.anInt10569 * -1409288891 - i_180_, -745445839 * class527_sub30.anInt10570 - i_181_, 0, i_183_, 1);
			}
		}
		if (null != class249.aString2737 && Class358_Sub2.aClass174_10289 != null)
			Class553.method9195(class180, class527_sub30, class249, i_164_, i_165_, i_171_, i_166_, -1869861025);
		if (1928897467 * class249.anInt2735 != -1 || class249.aString2737 != null) {
			Class527_Sub10 class527_sub10 = new Class527_Sub10(class527_sub30);
			class527_sub10.anInt10425 = 1547116355 * i_159_;
			class527_sub10.anInt10423 = i_160_ * 460630271;
			class527_sub10.anInt10422 = i_161_ * -1555531975;
			class527_sub10.anInt10428 = -560104107 * i_162_;
			class527_sub10.anInt10426 = -1221672401 * i_167_;
			class527_sub10.anInt10424 = i_168_ * 240629295;
			class527_sub10.anInt10427 = i_169_ * 320863415;
			class527_sub10.anInt10429 = -1601482153 * i_170_;
			Class620.aClass694_8119.method14147(class527_sub10, -1243870045);
		}
		return false;
	}

	static boolean method16716(Class180 class180, Class527_Sub30 class527_sub30, Class249 class249, int i, int i_184_) {
		if (aBool7165 && !client.aBool11165 && !method8774(class527_sub30.anInt10568 * 208579007, class527_sub30.anInt10565 * -1499963557))
			return false;
		if (null != class249.anIntArray2759) {
			class249 = class249.method4645(anInterface20_7121, anInterface18_7120, -1917833591);
			if (class249 == null)
				return false;
		}
		int i_185_ = 2147483647;
		int i_186_ = -2147483648;
		int i_187_ = 2147483647;
		int i_188_ = -2147483648;
		if (null != class249.anIntArray2760) {
			i_185_ = (((class249.anInt2740 * -1712073 + class527_sub30.anInt10568 * 208579007 - anInt7125) * (anInt7181 - anInt7179) / (anInt7177 - anInt7125)) + anInt7179);
			i_186_ = anInt7179 + ((anInt7181 - anInt7179) * (208579007 * class527_sub30.anInt10568 + 1589409961 * class249.anInt2771 - anInt7125) / (anInt7177 - anInt7125));
			i_188_ = anInt7182 - ((-1499963557 * class527_sub30.anInt10565 + class249.anInt2748 * -1564335433 - anInt7175) * (anInt7182 - anInt7180) / (anInt7136 - anInt7175));
			i_187_ = anInt7182 - ((class527_sub30.anInt10565 * -1499963557 + class249.anInt2764 * -548669143 - anInt7175) * (anInt7182 - anInt7180) / (anInt7136 - anInt7175));
		}
		Class147 class147 = null;
		int i_189_ = 0;
		int i_190_ = 0;
		int i_191_ = 0;
		int i_192_ = 0;
		if (-1 != class249.anInt2735 * 1928897467) {
			if (class527_sub30.aBool10571 && 1028708925 * class249.anInt2736 != -1)
				class147 = class249.method4637(class180, true, 1889218342);
			else
				class147 = class249.method4637(class180, false, 1929703225);
			if (class147 != null) {
				switch (class249.aClass274_2752.anInt3146 * -229615941) {
				case 1:
					i_189_ = (-1409288891 * class527_sub30.anInt10569 - (class147.method42() + 1 >> 1));
					i_190_ = (class527_sub30.anInt10569 * -1409288891 + (class147.method42() + 1 >> 1));
					break;
				case 2:
					i_189_ = class527_sub30.anInt10569 * -1409288891;
					i_190_ = (class527_sub30.anInt10569 * -1409288891 + class147.method42());
					break;
				case 0:
					i_189_ = (-1409288891 * class527_sub30.anInt10569 - class147.method42());
					i_190_ = class527_sub30.anInt10569 * -1409288891;
					break;
				}
				switch (-401058325 * class249.aClass277_2763.anInt3165) {
				case 1:
					i_191_ = (class527_sub30.anInt10570 * -745445839 - (class147.method2410() + 1 >> 1));
					i_192_ = (class527_sub30.anInt10570 * -745445839 + (class147.method2410() + 1 >> 1));
					break;
				case 0:
					i_191_ = class527_sub30.anInt10570 * -745445839;
					i_192_ = (class527_sub30.anInt10570 * -745445839 + class147.method2410());
					break;
				case 2:
					i_191_ = (-745445839 * class527_sub30.anInt10570 - class147.method2410());
					i_192_ = -745445839 * class527_sub30.anInt10570;
					break;
				}
				if (i_189_ < i_185_)
					i_185_ = i_189_;
				if (i_190_ > i_186_)
					i_186_ = i_190_;
				if (i_191_ < i_187_)
					i_187_ = i_191_;
				if (i_192_ > i_188_)
					i_188_ = i_192_;
			}
		}
		Class147 class147_193_ = null;
		if (class249.anInt2745 * 581159495 != -1)
			class147_193_ = class249.method4648(class180, (byte) 4);
		int i_194_ = 0;
		int i_195_ = 0;
		int i_196_ = 0;
		int i_197_ = 0;
		int i_198_ = 0;
		int i_199_ = 0;
		int i_200_ = 0;
		int i_201_ = 0;
		if (null != class249.aString2737) {
			Class332.method5838(1365262055 * class249.anInt2741, (byte) 54);
			if (Class358_Sub2.aClass174_10289 != null) {
				i_201_ = aClass22_10781.method810(class249.aString2737, (Class289.anInt3223 * -1803844265), 0, null, -1915839100);
				i_196_ = aClass22_10781.method798(class249.aString2737, (Class289.anInt3223 * -1803844265), null, -1461529625);
				i_194_ = (class527_sub30.anInt10569 * -1409288891 - i_196_ / 2 + (class249.anInt2769 * 899834733 * (anInt7181 - anInt7179) / (anInt7177 - anInt7125)));
				i_195_ = (class527_sub30.anInt10570 * -745445839 - (class249.anInt2766 * -1987476183 * (anInt7182 - anInt7180) / (anInt7136 - anInt7175)));
				if (class147 == null)
					i_195_ -= i_201_ / 2;
				else
					i_195_ -= (class147.method2410() >> 1) + i_201_;
				i_197_ = i_194_ + i;
				if (i_197_ < i_185_)
					i_185_ = i_197_;
				i_198_ = i + (i_196_ + i_194_);
				if (i_198_ > i_186_)
					i_186_ = i_198_;
				i_199_ = i_195_ + i_184_;
				if (i_199_ < i_187_)
					i_187_ = i_199_;
				i_200_ = i_184_ + (i_195_ + i_201_);
				if (i_200_ > i_188_)
					i_188_ = i_200_;
			}
		}
		if (i_186_ < anInt7179 || i_185_ > anInt7181 || i_188_ < anInt7180 || i_187_ > anInt7182)
			return true;
		method8773(class180, class527_sub30, class249);
		if (null != class147) {
			int i_202_ = 0;
			int i_203_ = 0;
			int i_204_ = 0;
			int i_205_ = 0;
			int i_206_ = 0;
			int i_207_ = 0;
			switch (-229615941 * class249.aClass274_2752.anInt3146) {
			case 2:
				i_203_ = -(class147.method2407() + 1) / 2;
				break;
			case 0:
				i_202_ = class147.method2407();
				i_203_ = (class147.method2407() + 1) / 2;
				i_204_ = class147.method42();
				break;
			case 1:
				i_202_ = class147.method2407() / 2;
				i_204_ = class147.method42() >> 1;
				break;
			}
			switch (class249.aClass277_2763.anInt3165 * -401058325) {
			case 1:
				i_205_ = class147.method2407() / 2;
				i_207_ = class147.method2410() >> 1;
				break;
			case 2:
				i_205_ = class147.method2407();
				i_206_ = (class147.method2407() + 1) / 2;
				i_207_ = class147.method2410();
				break;
			case 0:
				i_206_ = -(class147.method2407() + 1) / 2;
				break;
			}
			Class25 class25 = ((Class25) aHashMap10782.get(Integer.valueOf(class527_sub30.anInt10567 * -558184067)));
			if (class25 == null)
				class25 = ((Class25) aHashMap10764.get(Integer.valueOf(-1771553873 * (class249.anInt2777))));
			if (class25 != null && -1 == 581159495 * class249.anInt2745) {
				int i_208_;
				if (class25.anInt235 * -810418811 > anInt10791 * 1570431151 / 2)
					i_208_ = ((anInt10791 * 1027984977 - -498366597 * class25.anInt235) / (1570431151 * anInt10791));
				else
					i_208_ = class25.anInt235 * -498366597 / (1570431151 * anInt10791);
				int i_209_ = i_208_ << 24 | 0xffff00;
				if (class180 instanceof Class180_Sub2) {
					class180.method3174(class527_sub30.anInt10569 * -1409288891 - i_202_ - 7, class527_sub30.anInt10570 * -745445839 - i_205_ - 7, class147.method2407() + 14, class147.method2407() + 14, i_209_, -1612284023);
					class180.method3174(-1409288891 * class527_sub30.anInt10569 - i_202_ - 5, class527_sub30.anInt10570 * -745445839 - i_205_ - 5, class147.method2407() + 10, class147.method2407() + 10, i_209_, -1668667574);
					class180.method3174(-1409288891 * class527_sub30.anInt10569 - i_202_ - 3, -745445839 * class527_sub30.anInt10570 - i_205_ - 3, class147.method2407() + 6, class147.method2407() + 6, i_209_, 1114852637);
					class180.method3174(class527_sub30.anInt10569 * -1409288891 - i_202_ - 1, class527_sub30.anInt10570 * -745445839 - i_205_ - 1, class147.method2407() + 2, class147.method2407() + 2, i_209_, -349440356);
					class180.method3174(-1409288891 * class527_sub30.anInt10569 - i_202_, class527_sub30.anInt10570 * -745445839 - i_205_, class147.method2407(), class147.method2407(), i_209_, -514708176);
				} else {
					class180.method3139(class527_sub30.anInt10569 * -1409288891 - i_203_, class527_sub30.anInt10570 * -745445839 - i_206_, class147.method2407() / 2 + 7, i_209_, (byte) -45);
					class180.method3139((class527_sub30.anInt10569 * -1409288891) - i_203_, (class527_sub30.anInt10570 * -745445839 - i_206_ - i_206_) != 0 ? 1 : 0, class147.method2407() / 2 + 5, i_209_, (byte) -17);
					class180.method3139(class527_sub30.anInt10569 * -1409288891 - i_203_, 0 != (-745445839 * class527_sub30.anInt10570 - i_206_ - i_206_) ? 1 : 0, class147.method2407() / 2 + 3, i_209_, (byte) -55);
					class180.method3139((class527_sub30.anInt10569 * -1409288891) - i_203_, (-745445839 * class527_sub30.anInt10570 - i_206_ - i_206_) != 0 ? 1 : 0, class147.method2407() / 2 + 1, i_209_, (byte) -20);
					class180.method3139((-1409288891 * class527_sub30.anInt10569) - i_203_, (class527_sub30.anInt10570 * -745445839 - i_206_ - i_206_) != 0 ? 1 : 0, class147.method2407() / 2, i_209_, (byte) -44);
				}
			}
			class147.method2415((-1409288891 * class527_sub30.anInt10569 - i_204_), (-745445839 * class527_sub30.anInt10570 - i_207_));
			int i_210_ = 0;
			int i_211_ = 0;
			if (null != class25 && null != class147_193_) {
				switch (class249.aClass274_2752.anInt3146 * -229615941) {
				case 1:
					i_210_ = class147_193_.method42() >> 1;
					break;
				case 0:
					break;
				case 2:
					i_210_ = class147_193_.method42();
					break;
				}
				switch (class249.aClass277_2763.anInt3165 * -401058325) {
				case 2:
					i_211_ = (class147_193_.method2410() + class147.method2410()) / 2;
					break;
				case 0:
					break;
				case 1:
					i_211_ = (class147_193_.method2410() / 2 + class147.method2410()) / 2;
					break;
				}
				int i_212_;
				if (-810418811 * class25.anInt235 > 1570431151 * anInt10791 / 2)
					i_212_ = ((anInt10791 * 1027984977 - class25.anInt235 * -498366597) / (anInt10791 * 1570431151));
				else
					i_212_ = -498366597 * class25.anInt235 / (1570431151 * anInt10791);
				int i_213_ = i_212_ << 24 | 0xffff00;
				class147_193_.method2416(class527_sub30.anInt10569 * -1409288891 - i_210_, -745445839 * class527_sub30.anInt10570 - i_211_, 0, i_213_, 1);
			}
		}
		if (null != class249.aString2737 && Class358_Sub2.aClass174_10289 != null)
			Class553.method9195(class180, class527_sub30, class249, i_194_, i_195_, i_201_, i_196_, -1655118444);
		if (1928897467 * class249.anInt2735 != -1 || class249.aString2737 != null) {
			Class527_Sub10 class527_sub10 = new Class527_Sub10(class527_sub30);
			class527_sub10.anInt10425 = 1547116355 * i_189_;
			class527_sub10.anInt10423 = i_190_ * 460630271;
			class527_sub10.anInt10422 = i_191_ * -1555531975;
			class527_sub10.anInt10428 = -560104107 * i_192_;
			class527_sub10.anInt10426 = -1221672401 * i_197_;
			class527_sub10.anInt10424 = i_198_ * 240629295;
			class527_sub10.anInt10427 = i_199_ * 320863415;
			class527_sub10.anInt10429 = -1601482153 * i_200_;
			Class620.aClass694_8119.method14147(class527_sub10, -589243313);
		}
		return false;
	}

	static void method16717() {
		Class592.method9876((byte) 7);
		aClass527_Sub8_Sub12_7123 = null;
		Class603.aClass527_Sub8_Sub12_7959 = null;
		aClass14_10788.method721(-1987543957);
		aClass14_10789.method721(1122489011);
		for (int i = 0; i < 3; i++) {
			for (int i_214_ = 0; i_214_ < 5; i_214_++) {
				aClass174ArrayArray10785[i][i_214_] = null;
				aClass22ArrayArray10780[i][i_214_] = null;
			}
		}
	}

	public static void method16718(int i) {
		Class25 class25 = (Class25) aHashMap10782.get(Integer.valueOf(i));
		if (null == class25)
			class25 = new Class25();
		class25.anInt236 = 1896267987 * anInt10784;
		class25.anInt235 = anInt10791 * 1656762787;
		aHashMap10782.put(Integer.valueOf(i), class25);
	}

	static void method16719(int i) {
		int i_215_;
		if (i == 0)
			i_215_ = 0;
		else if (i == 1)
			i_215_ = 1;
		else if (2 == i)
			i_215_ = 2;
		else
			return;
		int i_216_;
		if (2.0 == (double) aFloat7134)
			i_216_ = 0;
		else if (3.0 == (double) aFloat7134)
			i_216_ = 1;
		else if ((double) aFloat7134 == 4.0)
			i_216_ = 2;
		else if (6.0 == (double) aFloat7134)
			i_216_ = 3;
		else if ((double) aFloat7134 >= 8.0)
			i_216_ = 4;
		else
			return;
		Class358_Sub2.aClass174_10289 = aClass174ArrayArray10785[i_215_][i_216_];
		aClass22_10781 = aClass22ArrayArray10780[i_215_][i_216_];
	}

	static void method16720(Class180 class180, Class527_Sub30 class527_sub30, Class249 class249, int i, int i_217_, int i_218_, int i_219_) {
		int i_220_ = i - 5;
		int i_221_ = 2 + i_217_;
		if (2110063129 * class249.anInt2779 != 0)
			class180.method3174(i_220_, i_221_, 10 + i_219_, i_218_ + i_217_ - i_221_ + 1, 2110063129 * class249.anInt2779, 690948145);
		if (class249.anInt2732 * 1688213881 != 0)
			class180.method3269(i_220_, i_221_, 10 + i_219_, i_217_ + i_218_ - i_221_ + 1, class249.anInt2732 * 1688213881, 1578982512);
		int i_222_ = class249.anInt2738 * 1166915573;
		if (class527_sub30.aBool10571 && -1 != 210107331 * class249.anInt2739)
			i_222_ = 210107331 * class249.anInt2739;
		Class358_Sub2.aClass174_10289.method2746(class249.aString2737, i, i_217_, i_219_, i_218_, ~0xffffff | i_222_, (786689371 * aClass630_7122.anInt8236), 1, 0, 0, null, null, null, 0, 0, -1300246824);
	}

	static final void method16721(Class180 class180, int i, int i_223_, int i_224_, int i_225_) {
		class180.method3132(i, i_223_, i_224_ + i, i_225_ + i_223_);
		class180.method3174(i, i_223_, i_224_, i_225_, -16777216, 943105885);
		if (anInt10773 * -1639647951 >= 100) {
			float f = (float) anInt7167 / (float) anInt7131;
			int i_226_ = i_224_;
			int i_227_ = i_225_;
			if (f < 1.0F)
				i_227_ = (int) ((float) i_224_ * f);
			else
				i_226_ = (int) ((float) i_225_ / f);
			i += (i_224_ - i_226_) / 2;
			i_223_ += (i_225_ - i_227_) / 2;
			if (null == aClass147_10775 || aClass147_10775.method2407() != i_226_ || aClass147_10775.method2424() != i_227_) {
				aClass205_7163 = aClass205_7129;
				method8846(anInt7137, anInt7167 + anInt7138, anInt7131 + anInt7137, anInt7138, i, i_223_, i + i_226_, i_223_ + i_227_);
				method8763(class180, false, false, client.aBool11165, true);
				class180.method3165();
				aClass147_10775 = class180.method3226(i, i_223_, i_226_, i_227_, true);
			}
			aClass147_10775.method2415(i, i_223_);
			int i_228_ = (i_226_ * (Class316_Sub1.anInt10040 * -1588896611) / anInt7131);
			int i_229_ = i_227_ * (Class55.anInt710 * -786345143) / anInt7167;
			int i_230_ = i_226_ * (-1206349391 * Class400.anInt4142) / anInt7131 + i;
			int i_231_ = (i_223_ + i_227_ - Class701.anInt8796 * 1362616521 * i_227_ / anInt7167 - i_229_);
			int i_232_ = -1996554240;
			if (client.aClass678_11259 == Class678.aClass678_8611)
				i_232_ = -1996488705;
			class180.method3348(i_230_, i_231_, i_228_, i_229_, i_232_, 1);
			class180.method3134(i_230_, i_231_, i_228_, i_229_, i_232_, 0);
			for (Class527_Sub30 class527_sub30 = ((Class527_Sub30) aClass694_7147.method14081((short) -23894)); null != class527_sub30; class527_sub30 = (Class527_Sub30) aClass694_7147.method14086(-65534)) {
				Class249 class249 = ((Class249) aClass24_Sub12_7164.method81((-558184067 * (class527_sub30.anInt10567)), -770945765));
				if (Class174_Sub2.method14596(class249, (byte) -39)) {
					Class25 class25 = ((Class25) aHashMap10782.get(Integer.valueOf((class527_sub30.anInt10567) * -558184067)));
					if (null == class25)
						class25 = (Class25) (aHashMap10764.get(Integer.valueOf(class249.anInt2777 * -1771553873)));
					if (class25 != null) {
						int i_233_;
						if (-810418811 * class25.anInt235 > anInt10791 * 1570431151 / 2)
							i_233_ = ((1027984977 * anInt10791 - class25.anInt235 * -498366597) / (1570431151 * anInt10791));
						else
							i_233_ = (class25.anInt235 * -498366597 / (1570431151 * anInt10791));
						int i_234_ = i + (i_226_ * (208579007 * class527_sub30.anInt10568) / anInt7131);
						int i_235_ = (i_223_ + ((anInt7167 - -1499963557 * class527_sub30.anInt10565) * i_227_ / anInt7167));
						class180.method3174(i_234_ - 2, i_235_ - 2, 4, 4, i_233_ << 24 | 0xffff00, 544726837);
					}
				}
			}
			aClass205_7129.method3792(5, (byte) 11);
		}
	}

	static void method16722(Class180 class180, Class527_Sub30 class527_sub30, Class249 class249) {
		Class147 class147 = class249.method4639(class180, 830941930);
		if (class147 != null) {
			int i = class147.method2407();
			if (class147.method2424() > i)
				i = class147.method2424();
			int i_236_ = 10;
			int i_237_ = -1409288891 * class527_sub30.anInt10569;
			int i_238_ = -745445839 * class527_sub30.anInt10570;
			int i_239_ = 0;
			int i_240_ = 0;
			if (null != class249.aString2737) {
				i_240_ = aClass22_10781.method810(class249.aString2737, (-1803844265 * Class289.anInt3223), 0, null, -1786866925);
				i_239_ = aClass22_10781.method798(class249.aString2737, (Class289.anInt3223 * -1803844265), null, -1603045772);
			}
			int i_241_ = class527_sub30.anInt10569 * -1409288891 + i / 2;
			int i_242_ = -745445839 * class527_sub30.anInt10570;
			if (i_237_ < i + anInt7179) {
				i_237_ = anInt7179;
				i_241_ = i_239_ / 2 + (anInt7179 + i / 2 + i_236_) + 5;
			} else if (i_237_ > anInt7181 - i) {
				i_237_ = anInt7181 - i;
				i_241_ = anInt7181 - i / 2 - i_236_ - i_239_ / 2 - 5;
			}
			if (i_238_ < i + anInt7180) {
				i_238_ = anInt7180;
				i_242_ = anInt7180 + i_236_ + i / 2;
			} else if (i_238_ > anInt7182 - i) {
				i_238_ = anInt7182 - i;
				i_242_ = anInt7182 - i / 2 - i_236_ - i_240_;
			}
			int i_243_ = ((int) (Math.atan2((double) (i_237_ - (class527_sub30.anInt10569 * -1409288891)), (double) (i_238_ - (class527_sub30.anInt10570 * -745445839))) / 3.141592653589793 * 32767.0) & 0xffff);
			class147.method2473((float) i_237_ + (float) i / 2.0F, (float) i / 2.0F + (float) i_238_, 4096, i_243_);
			int i_244_ = -2;
			int i_245_ = -2;
			int i_246_ = -2;
			int i_247_ = -2;
			if (class249.aString2737 != null) {
				i_244_ = i_241_ - i_239_ / 2 - 5;
				i_245_ = i_242_;
				i_246_ = 10 + (i_244_ + i_239_);
				i_247_ = i_240_ + i_245_ + 3;
				if (class249.anInt2779 * 2110063129 != 0)
					class180.method3174(i_244_, i_245_, i_246_ - i_244_, i_247_ - i_245_, class249.anInt2779 * 2110063129, 743813230);
				if (1688213881 * class249.anInt2732 != 0)
					class180.method3269(i_244_, i_245_, i_246_ - i_244_, i_247_ - i_245_, 1688213881 * class249.anInt2732, 377113161);
				Class358_Sub2.aClass174_10289.method2746(class249.aString2737, i_241_, i_242_, i_239_, i_240_, ~0xffffff | 1166915573 * class249.anInt2738, 786689371 * aClass630_7122.anInt8236, 1, 0, 0, null, null, null, 0, 0, -1300246824);
			}
			if (class249.anInt2735 * 1928897467 != -1 || null != class249.aString2737) {
				Class527_Sub10 class527_sub10 = new Class527_Sub10(class527_sub30);
				class527_sub10.anInt10425 = (i_237_ - i / 2) * 1547116355;
				class527_sub10.anInt10423 = (i_237_ + i / 2) * 460630271;
				class527_sub10.anInt10422 = (i_238_ - i) * -1555531975;
				class527_sub10.anInt10428 = -560104107 * i_238_;
				class527_sub10.anInt10426 = -1221672401 * i_244_;
				class527_sub10.anInt10424 = 240629295 * i_246_;
				class527_sub10.anInt10427 = 320863415 * i_245_;
				class527_sub10.anInt10429 = i_247_ * -1601482153;
				Class620.aClass694_8119.method14147(class527_sub10, -1731472843);
			}
		}
	}

	static final void method16723(int i, int i_248_) {
		if (aFloat7133 < aFloat7134) {
			aFloat7133 += (double) aFloat7133 / 30.0;
			if (aFloat7133 > aFloat7134)
				aFloat7133 = aFloat7134;
			Class146.method2401((byte) 81);
			anInt7130 = (int) aFloat7134 >> 1;
			aByteArrayArrayArray7118 = Class265.method5039(anInt7130, 672688101);
		} else if (aFloat7133 > aFloat7134) {
			aFloat7133 -= (double) aFloat7133 / 30.0;
			if (aFloat7133 < aFloat7134)
				aFloat7133 = aFloat7134;
			Class146.method2401((byte) 96);
			anInt7130 = (int) aFloat7134 >> 1;
			aByteArrayArrayArray7118 = Class265.method5039(anInt7130, 672688101);
		}
		if (-1 != 735713997 * anInt10779 && -1 != anInt10772 * 379055201) {
			int i_249_ = anInt10779 * 735713997 - -502443805 * anInt10783;
			if (0 != i_249_)
				i_249_ /= Math.min(anInt10767 * 1724714249, Math.abs(i_249_));
			int i_250_ = anInt10772 * 379055201 - Class635.anInt8302 * 1891819005;
			if (0 != i_250_)
				i_250_ /= Math.min(1724714249 * anInt10767, Math.abs(i_250_));
			anInt10783 = (anInt10783 * -502443805 + i_249_) * 2049864907;
			Class635.anInt8302 = -1224612011 * (Class635.anInt8302 * 1891819005 + i_250_);
			if (0 == i_249_ && i_250_ == 0) {
				anInt10779 = -1449615877;
				anInt10772 = -1784395681;
			}
			Class146.method2401((byte) 41);
		}
		Iterator iterator = aHashMap10782.entrySet().iterator();
		while (iterator.hasNext()) {
			Class25 class25 = (Class25) ((Map.Entry) iterator.next()).getValue();
			class25.anInt235 -= -1836813491;
			if (class25.anInt235 * -810418811 == 0) {
				if (class25.anInt236 * -235365155 <= 1 && !aBool10786)
					iterator.remove();
				else {
					class25.anInt236 -= -933684363;
					class25.anInt235 = 1656762787 * anInt10791;
				}
			}
		}
		iterator = aHashMap10764.entrySet().iterator();
		while (iterator.hasNext()) {
			Class25 class25 = (Class25) ((Map.Entry) iterator.next()).getValue();
			class25.anInt235 -= -1836813491;
			if (class25.anInt235 * -810418811 == 0) {
				if (class25.anInt236 * -235365155 <= 1 && !aBool10786)
					iterator.remove();
				else {
					class25.anInt236 -= -933684363;
					class25.anInt235 = 1656762787 * anInt10791;
				}
			}
		}
		if (aBool10765 && null != Class620.aClass694_8119) {
			for (Class527_Sub10 class527_sub10 = ((Class527_Sub10) Class620.aClass694_8119.method14081((short) 3954)); class527_sub10 != null; class527_sub10 = (Class527_Sub10) Class620.aClass694_8119.method14086(-65534)) {
				Class249 class249 = ((Class249) aClass24_Sub12_7164.method81((-558184067 * (class527_sub10.aClass527_Sub30_10430.anInt10567)), -744463723));
				if (class527_sub10.method16074(i, i_248_, -1177042977)) {
					if (class249.aStringArray2744 != null) {
						if (null != class249.aStringArray2744[4])
							Class687.method13961(class249.aStringArray2744[4], class249.aString2749, -1, 1012, -1, (long) ((class527_sub10.aClass527_Sub30_10430.anInt10567) * -558184067), class249.anInt2777 * -1771553873, 0, true, false, (long) (-558184067 * (class527_sub10.aClass527_Sub30_10430.anInt10567)), false, (byte) -105);
						if (class249.aStringArray2744[3] != null)
							Class687.method13961(class249.aStringArray2744[3], class249.aString2749, -1, 1011, -1, (long) (-558184067 * (class527_sub10.aClass527_Sub30_10430.anInt10567)), -1771553873 * class249.anInt2777, 0, true, false, (long) (-558184067 * (class527_sub10.aClass527_Sub30_10430.anInt10567)), false, (byte) -43);
						if (null != class249.aStringArray2744[2])
							Class687.method13961(class249.aStringArray2744[2], class249.aString2749, -1, 1010, -1, (long) ((class527_sub10.aClass527_Sub30_10430.anInt10567) * -558184067), -1771553873 * class249.anInt2777, 0, true, false, (long) ((class527_sub10.aClass527_Sub30_10430.anInt10567) * -558184067), false, (byte) -34);
						if (null != class249.aStringArray2744[1])
							Class687.method13961(class249.aStringArray2744[1], class249.aString2749, -1, 1009, -1, (long) ((class527_sub10.aClass527_Sub30_10430.anInt10567) * -558184067), class249.anInt2777 * -1771553873, 0, true, false, (long) (-558184067 * (class527_sub10.aClass527_Sub30_10430.anInt10567)), false, (byte) -43);
						if (null != class249.aStringArray2744[0])
							Class687.method13961(class249.aStringArray2744[0], class249.aString2749, -1, 1008, -1, (long) (-558184067 * (class527_sub10.aClass527_Sub30_10430.anInt10567)), -1771553873 * class249.anInt2777, 0, true, false, (long) (-558184067 * (class527_sub10.aClass527_Sub30_10430.anInt10567)), false, (byte) -113);
					}
					if (!class527_sub10.aClass527_Sub30_10430.aBool10571) {
						class527_sub10.aClass527_Sub30_10430.aBool10571 = true;
						Class546.method9060(Class579.aClass579_7655, (class527_sub10.aClass527_Sub30_10430.anInt10567) * -558184067, -1771553873 * class249.anInt2777, (byte) -72);
					}
					if (class527_sub10.aClass527_Sub30_10430.aBool10571)
						Class546.method9060(Class579.aClass579_7666, (-558184067 * (class527_sub10.aClass527_Sub30_10430.anInt10567)), class249.anInt2777 * -1771553873, (byte) -85);
				} else if (class527_sub10.aClass527_Sub30_10430.aBool10571) {
					class527_sub10.aClass527_Sub30_10430.aBool10571 = false;
					Class546.method9060(Class579.aClass579_7656, (class527_sub10.aClass527_Sub30_10430.anInt10567) * -558184067, -1771553873 * class249.anInt2777, (byte) -39);
				}
			}
		}
	}

	static final void method16724(int i, int i_251_) {
		if (aFloat7133 < aFloat7134) {
			aFloat7133 += (double) aFloat7133 / 30.0;
			if (aFloat7133 > aFloat7134)
				aFloat7133 = aFloat7134;
			Class146.method2401((byte) 114);
			anInt7130 = (int) aFloat7134 >> 1;
			aByteArrayArrayArray7118 = Class265.method5039(anInt7130, 672688101);
		} else if (aFloat7133 > aFloat7134) {
			aFloat7133 -= (double) aFloat7133 / 30.0;
			if (aFloat7133 < aFloat7134)
				aFloat7133 = aFloat7134;
			Class146.method2401((byte) 24);
			anInt7130 = (int) aFloat7134 >> 1;
			aByteArrayArrayArray7118 = Class265.method5039(anInt7130, 672688101);
		}
		if (-1 != 735713997 * anInt10779 && -1 != anInt10772 * 379055201) {
			int i_252_ = anInt10779 * 735713997 - -502443805 * anInt10783;
			if (0 != i_252_)
				i_252_ /= Math.min(anInt10767 * 1724714249, Math.abs(i_252_));
			int i_253_ = anInt10772 * 379055201 - Class635.anInt8302 * 1891819005;
			if (0 != i_253_)
				i_253_ /= Math.min(1724714249 * anInt10767, Math.abs(i_253_));
			anInt10783 = (anInt10783 * -502443805 + i_252_) * 2049864907;
			Class635.anInt8302 = -1224612011 * (Class635.anInt8302 * 1891819005 + i_253_);
			if (0 == i_252_ && i_253_ == 0) {
				anInt10779 = -1449615877;
				anInt10772 = -1784395681;
			}
			Class146.method2401((byte) 4);
		}
		Iterator iterator = aHashMap10782.entrySet().iterator();
		while (iterator.hasNext()) {
			Class25 class25 = (Class25) ((Map.Entry) iterator.next()).getValue();
			class25.anInt235 -= -1836813491;
			if (class25.anInt235 * -810418811 == 0) {
				if (class25.anInt236 * -235365155 <= 1 && !aBool10786)
					iterator.remove();
				else {
					class25.anInt236 -= -933684363;
					class25.anInt235 = 1656762787 * anInt10791;
				}
			}
		}
		iterator = aHashMap10764.entrySet().iterator();
		while (iterator.hasNext()) {
			Class25 class25 = (Class25) ((Map.Entry) iterator.next()).getValue();
			class25.anInt235 -= -1836813491;
			if (class25.anInt235 * -810418811 == 0) {
				if (class25.anInt236 * -235365155 <= 1 && !aBool10786)
					iterator.remove();
				else {
					class25.anInt236 -= -933684363;
					class25.anInt235 = 1656762787 * anInt10791;
				}
			}
		}
		if (aBool10765 && null != Class620.aClass694_8119) {
			for (Class527_Sub10 class527_sub10 = ((Class527_Sub10) Class620.aClass694_8119.method14081((short) -23373)); class527_sub10 != null; class527_sub10 = (Class527_Sub10) Class620.aClass694_8119.method14086(-65534)) {
				Class249 class249 = ((Class249) aClass24_Sub12_7164.method81((-558184067 * (class527_sub10.aClass527_Sub30_10430.anInt10567)), 627223884));
				if (class527_sub10.method16074(i, i_251_, 1250248461)) {
					if (class249.aStringArray2744 != null) {
						if (null != class249.aStringArray2744[4])
							Class687.method13961(class249.aStringArray2744[4], class249.aString2749, -1, 1012, -1, (long) ((class527_sub10.aClass527_Sub30_10430.anInt10567) * -558184067), class249.anInt2777 * -1771553873, 0, true, false, (long) (-558184067 * (class527_sub10.aClass527_Sub30_10430.anInt10567)), false, (byte) -17);
						if (class249.aStringArray2744[3] != null)
							Class687.method13961(class249.aStringArray2744[3], class249.aString2749, -1, 1011, -1, (long) (-558184067 * (class527_sub10.aClass527_Sub30_10430.anInt10567)), -1771553873 * class249.anInt2777, 0, true, false, (long) (-558184067 * (class527_sub10.aClass527_Sub30_10430.anInt10567)), false, (byte) -40);
						if (null != class249.aStringArray2744[2])
							Class687.method13961(class249.aStringArray2744[2], class249.aString2749, -1, 1010, -1, (long) ((class527_sub10.aClass527_Sub30_10430.anInt10567) * -558184067), -1771553873 * class249.anInt2777, 0, true, false, (long) ((class527_sub10.aClass527_Sub30_10430.anInt10567) * -558184067), false, (byte) -109);
						if (null != class249.aStringArray2744[1])
							Class687.method13961(class249.aStringArray2744[1], class249.aString2749, -1, 1009, -1, (long) ((class527_sub10.aClass527_Sub30_10430.anInt10567) * -558184067), class249.anInt2777 * -1771553873, 0, true, false, (long) (-558184067 * (class527_sub10.aClass527_Sub30_10430.anInt10567)), false, (byte) -53);
						if (null != class249.aStringArray2744[0])
							Class687.method13961(class249.aStringArray2744[0], class249.aString2749, -1, 1008, -1, (long) (-558184067 * (class527_sub10.aClass527_Sub30_10430.anInt10567)), -1771553873 * class249.anInt2777, 0, true, false, (long) (-558184067 * (class527_sub10.aClass527_Sub30_10430.anInt10567)), false, (byte) -88);
					}
					if (!class527_sub10.aClass527_Sub30_10430.aBool10571) {
						class527_sub10.aClass527_Sub30_10430.aBool10571 = true;
						Class546.method9060(Class579.aClass579_7655, (class527_sub10.aClass527_Sub30_10430.anInt10567) * -558184067, -1771553873 * class249.anInt2777, (byte) -121);
					}
					if (class527_sub10.aClass527_Sub30_10430.aBool10571)
						Class546.method9060(Class579.aClass579_7666, (-558184067 * (class527_sub10.aClass527_Sub30_10430.anInt10567)), class249.anInt2777 * -1771553873, (byte) -49);
				} else if (class527_sub10.aClass527_Sub30_10430.aBool10571) {
					class527_sub10.aClass527_Sub30_10430.aBool10571 = false;
					Class546.method9060(Class579.aClass579_7656, (class527_sub10.aClass527_Sub30_10430.anInt10567) * -558184067, -1771553873 * class249.anInt2777, (byte) -5);
				}
			}
		}
	}

	static final void method16725(int i, int i_254_) {
		if (aFloat7133 < aFloat7134) {
			aFloat7133 += (double) aFloat7133 / 30.0;
			if (aFloat7133 > aFloat7134)
				aFloat7133 = aFloat7134;
			Class146.method2401((byte) 33);
			anInt7130 = (int) aFloat7134 >> 1;
			aByteArrayArrayArray7118 = Class265.method5039(anInt7130, 672688101);
		} else if (aFloat7133 > aFloat7134) {
			aFloat7133 -= (double) aFloat7133 / 30.0;
			if (aFloat7133 < aFloat7134)
				aFloat7133 = aFloat7134;
			Class146.method2401((byte) 46);
			anInt7130 = (int) aFloat7134 >> 1;
			aByteArrayArrayArray7118 = Class265.method5039(anInt7130, 672688101);
		}
		if (-1 != 735713997 * anInt10779 && -1 != anInt10772 * 379055201) {
			int i_255_ = anInt10779 * 735713997 - -502443805 * anInt10783;
			if (0 != i_255_)
				i_255_ /= Math.min(anInt10767 * 1724714249, Math.abs(i_255_));
			int i_256_ = anInt10772 * 379055201 - Class635.anInt8302 * 1891819005;
			if (0 != i_256_)
				i_256_ /= Math.min(1724714249 * anInt10767, Math.abs(i_256_));
			anInt10783 = (anInt10783 * -502443805 + i_255_) * 2049864907;
			Class635.anInt8302 = -1224612011 * (Class635.anInt8302 * 1891819005 + i_256_);
			if (0 == i_255_ && i_256_ == 0) {
				anInt10779 = -1449615877;
				anInt10772 = -1784395681;
			}
			Class146.method2401((byte) 33);
		}
		Iterator iterator = aHashMap10782.entrySet().iterator();
		while (iterator.hasNext()) {
			Class25 class25 = (Class25) ((Map.Entry) iterator.next()).getValue();
			class25.anInt235 -= -1836813491;
			if (class25.anInt235 * -810418811 == 0) {
				if (class25.anInt236 * -235365155 <= 1 && !aBool10786)
					iterator.remove();
				else {
					class25.anInt236 -= -933684363;
					class25.anInt235 = 1656762787 * anInt10791;
				}
			}
		}
		iterator = aHashMap10764.entrySet().iterator();
		while (iterator.hasNext()) {
			Class25 class25 = (Class25) ((Map.Entry) iterator.next()).getValue();
			class25.anInt235 -= -1836813491;
			if (class25.anInt235 * -810418811 == 0) {
				if (class25.anInt236 * -235365155 <= 1 && !aBool10786)
					iterator.remove();
				else {
					class25.anInt236 -= -933684363;
					class25.anInt235 = 1656762787 * anInt10791;
				}
			}
		}
		if (aBool10765 && null != Class620.aClass694_8119) {
			for (Class527_Sub10 class527_sub10 = ((Class527_Sub10) Class620.aClass694_8119.method14081((short) -799)); class527_sub10 != null; class527_sub10 = (Class527_Sub10) Class620.aClass694_8119.method14086(-65534)) {
				Class249 class249 = ((Class249) aClass24_Sub12_7164.method81((-558184067 * (class527_sub10.aClass527_Sub30_10430.anInt10567)), 1851554362));
				if (class527_sub10.method16074(i, i_254_, -1674305465)) {
					if (class249.aStringArray2744 != null) {
						if (null != class249.aStringArray2744[4])
							Class687.method13961(class249.aStringArray2744[4], class249.aString2749, -1, 1012, -1, (long) ((class527_sub10.aClass527_Sub30_10430.anInt10567) * -558184067), class249.anInt2777 * -1771553873, 0, true, false, (long) (-558184067 * (class527_sub10.aClass527_Sub30_10430.anInt10567)), false, (byte) -36);
						if (class249.aStringArray2744[3] != null)
							Class687.method13961(class249.aStringArray2744[3], class249.aString2749, -1, 1011, -1, (long) (-558184067 * (class527_sub10.aClass527_Sub30_10430.anInt10567)), -1771553873 * class249.anInt2777, 0, true, false, (long) (-558184067 * (class527_sub10.aClass527_Sub30_10430.anInt10567)), false, (byte) -18);
						if (null != class249.aStringArray2744[2])
							Class687.method13961(class249.aStringArray2744[2], class249.aString2749, -1, 1010, -1, (long) ((class527_sub10.aClass527_Sub30_10430.anInt10567) * -558184067), -1771553873 * class249.anInt2777, 0, true, false, (long) ((class527_sub10.aClass527_Sub30_10430.anInt10567) * -558184067), false, (byte) -117);
						if (null != class249.aStringArray2744[1])
							Class687.method13961(class249.aStringArray2744[1], class249.aString2749, -1, 1009, -1, (long) ((class527_sub10.aClass527_Sub30_10430.anInt10567) * -558184067), class249.anInt2777 * -1771553873, 0, true, false, (long) (-558184067 * (class527_sub10.aClass527_Sub30_10430.anInt10567)), false, (byte) -10);
						if (null != class249.aStringArray2744[0])
							Class687.method13961(class249.aStringArray2744[0], class249.aString2749, -1, 1008, -1, (long) (-558184067 * (class527_sub10.aClass527_Sub30_10430.anInt10567)), -1771553873 * class249.anInt2777, 0, true, false, (long) (-558184067 * (class527_sub10.aClass527_Sub30_10430.anInt10567)), false, (byte) -118);
					}
					if (!class527_sub10.aClass527_Sub30_10430.aBool10571) {
						class527_sub10.aClass527_Sub30_10430.aBool10571 = true;
						Class546.method9060(Class579.aClass579_7655, (class527_sub10.aClass527_Sub30_10430.anInt10567) * -558184067, -1771553873 * class249.anInt2777, (byte) -110);
					}
					if (class527_sub10.aClass527_Sub30_10430.aBool10571)
						Class546.method9060(Class579.aClass579_7666, (-558184067 * (class527_sub10.aClass527_Sub30_10430.anInt10567)), class249.anInt2777 * -1771553873, (byte) -30);
				} else if (class527_sub10.aClass527_Sub30_10430.aBool10571) {
					class527_sub10.aClass527_Sub30_10430.aBool10571 = false;
					Class546.method9060(Class579.aClass579_7656, (class527_sub10.aClass527_Sub30_10430.anInt10567) * -558184067, -1771553873 * class249.anInt2777, (byte) -87);
				}
			}
		}
	}

	public static int method16726(int i, int i_257_, int i_258_) {
		if (anInt10773 * -1639647951 < 100)
			return -2;
		int i_259_ = -2;
		int i_260_ = 2147483647;
		int i_261_ = i_257_ - anInt7137;
		int i_262_ = i_258_ - anInt7138;
		for (Class527_Sub30 class527_sub30 = (Class527_Sub30) aClass694_7147.method14081((short) 28576); class527_sub30 != null; class527_sub30 = (Class527_Sub30) aClass694_7147.method14086(-65534)) {
			if (class527_sub30.anInt10567 * -558184067 == i) {
				int i_263_ = class527_sub30.anInt10568 * 208579007;
				int i_264_ = -1499963557 * class527_sub30.anInt10565;
				int i_265_ = i_263_ + anInt7137 << 14 | anInt7138 + i_264_;
				int i_266_ = ((i_261_ - i_263_) * (i_261_ - i_263_) + (i_262_ - i_264_) * (i_262_ - i_264_));
				if (i_259_ < 0 || i_266_ < i_260_) {
					i_259_ = i_265_;
					i_260_ = i_266_;
				}
			}
		}
		return i_259_;
	}

	static {
		anInt10769 = 1762471073;
		anInt10787 = 622137330;
		anInt10767 = 1580501448;
		anInt10768 = 1483422427;
		anInt10774 = 563514950;
		anInt10773 = 0;
		anInt10779 = -1449615877;
		anInt10772 = -1784395681;
		aBool10765 = false;
		anInt10776 = -974227339;
		anInt10777 = 1984324647;
		aBool10778 = false;
		aClass174ArrayArray10785 = new Class174[3][5];
		aClass22ArrayArray10780 = new Class22[3][5];
		aHashMap10782 = new HashMap();
		aHashMap10764 = new HashMap();
		anInt10784 = -2102467361 * anInt10768;
		anInt10791 = anInt10774 * -2065903011;
		aBool10786 = false;
		aBool10770 = false;
		aClass14_10788 = new Class14(8);
		aClass14_10789 = new Class14(8);
		aClass691_10771 = new Class691(new Class694());
		aBool10790 = false;
		aBool10792 = false;
		aBool10793 = false;
		aBool10794 = false;
		aBool10766 = false;
		aBool10796 = false;
	}

	static void method16727(Class180 class180, int i, int i_267_, int i_268_, int i_269_) {
		class180.method3132(i, i_267_, i + i_268_, i_267_ + i_269_);
		if (anInt10773 * -1639647951 < 100) {
			int i_270_ = 20;
			int i_271_ = i + i_268_ / 2;
			int i_272_ = i_267_ + i_269_ / 2 - 18 - i_270_;
			class180.method3348(i, i_267_, i_268_, i_269_, -16777216, 0);
			class180.method3134(i_271_ - 152, i_272_, 304, 34, client.aColorArray11044[-1289997611 * client.anInt10993].getRGB(), 0);
			class180.method3348(i_271_ - 150, i_272_ + 2, anInt10773 * -623976557, 30, client.aColorArray11098[client.anInt10993 * -1289997611].getRGB(), 0);
			Class29.aClass174_262.method2745(Class53.aClass53_648.method1290(Class144_Sub1.aClass671_8995, (byte) -13), i_271_, i_270_ + i_272_, client.aColorArray11057[-1289997611 * client.anInt10993].getRGB(), -1, 1348145444);
		} else {
			int i_273_ = (anInt10783 * -502443805 - (int) ((float) i_268_ / aFloat7133));
			int i_274_ = (1891819005 * Class635.anInt8302 + (int) ((float) i_269_ / aFloat7133));
			int i_275_ = (anInt10783 * -502443805 + (int) ((float) i_268_ / aFloat7133));
			int i_276_ = (Class635.anInt8302 * 1891819005 - (int) ((float) i_269_ / aFloat7133));
			Class400.anInt4142 = (anInt10783 * -502443805 - (int) ((float) i_268_ / aFloat7133)) * 722671441;
			Class701.anInt8796 = 1312438649 * (Class635.anInt8302 * 1891819005 - (int) ((float) i_269_ / aFloat7133));
			Class316_Sub1.anInt10040 = 1416497589 * (int) ((float) (i_268_ * 2) / aFloat7133);
			Class55.anInt710 = (int) ((float) (2 * i_269_) / aFloat7133) * 466095865;
			aClass205_7163 = aClass205_7161;
			method8846(i_273_ + anInt7137, anInt7138 + i_274_, i_275_ + anInt7137, anInt7138 + i_276_, i, i_267_, i + i_268_, i_267_ + i_269_ + 1);
			method8763(class180, !aBool10794, !aBool10766, client.aBool11165, false);
			Class694 class694 = method8770(class180);
			Class112.method2020(class180, class694, 0, 0, (byte) 44);
			if (client.aBool11022) {
				int i_277_ = i_268_ + i - 5;
				int i_278_ = i_267_ + i_269_ - 8;
				Class85.aClass174_819.method2744(new StringBuilder().append("Fps: ").append(-1176934951 * Class515.anInt7014).append(" (").append(-961466639 * Class515.anInt7016).append(" ms)").toString(), i_277_, i_278_, 16776960, -1, -1570093691);
				i_278_ -= 15;
				Runtime runtime = Runtime.getRuntime();
				int i_279_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
				int i_280_ = 16776960;
				if (i_279_ > 65536)
					i_280_ = 16711680;
				Class85.aClass174_819.method2744(new StringBuilder().append("Mem:").append(i_279_).append("k").toString(), i_277_, i_278_, i_280_, -1, -344787404);
				i_278_ -= 15;
			}
			aClass205_7161.method3792(5, (byte) 11);
		}
	}

	static final void method16728(Class180 class180, int i, int i_281_, int i_282_, int i_283_) {
		class180.method3132(i, i_281_, i_282_ + i, i_283_ + i_281_);
		class180.method3174(i, i_281_, i_282_, i_283_, -16777216, 1681111836);
		if (anInt10773 * -1639647951 >= 100) {
			float f = (float) anInt7167 / (float) anInt7131;
			int i_284_ = i_282_;
			int i_285_ = i_283_;
			if (f < 1.0F)
				i_285_ = (int) ((float) i_282_ * f);
			else
				i_284_ = (int) ((float) i_283_ / f);
			i += (i_282_ - i_284_) / 2;
			i_281_ += (i_283_ - i_285_) / 2;
			if (null == aClass147_10775 || aClass147_10775.method2407() != i_284_ || aClass147_10775.method2424() != i_285_) {
				aClass205_7163 = aClass205_7129;
				method8846(anInt7137, anInt7167 + anInt7138, anInt7131 + anInt7137, anInt7138, i, i_281_, i + i_284_, i_281_ + i_285_);
				method8763(class180, false, false, client.aBool11165, true);
				class180.method3165();
				aClass147_10775 = class180.method3226(i, i_281_, i_284_, i_285_, true);
			}
			aClass147_10775.method2415(i, i_281_);
			int i_286_ = (i_284_ * (Class316_Sub1.anInt10040 * -1588896611) / anInt7131);
			int i_287_ = i_285_ * (Class55.anInt710 * -786345143) / anInt7167;
			int i_288_ = i_284_ * (-1206349391 * Class400.anInt4142) / anInt7131 + i;
			int i_289_ = (i_281_ + i_285_ - Class701.anInt8796 * 1362616521 * i_285_ / anInt7167 - i_287_);
			int i_290_ = -1996554240;
			if (client.aClass678_11259 == Class678.aClass678_8611)
				i_290_ = -1996488705;
			class180.method3348(i_288_, i_289_, i_286_, i_287_, i_290_, 1);
			class180.method3134(i_288_, i_289_, i_286_, i_287_, i_290_, 0);
			for (Class527_Sub30 class527_sub30 = ((Class527_Sub30) aClass694_7147.method14081((short) 6119)); null != class527_sub30; class527_sub30 = (Class527_Sub30) aClass694_7147.method14086(-65534)) {
				Class249 class249 = ((Class249) aClass24_Sub12_7164.method81((-558184067 * (class527_sub30.anInt10567)), -798084602));
				if (Class174_Sub2.method14596(class249, (byte) -91)) {
					Class25 class25 = ((Class25) aHashMap10782.get(Integer.valueOf((class527_sub30.anInt10567) * -558184067)));
					if (null == class25)
						class25 = (Class25) (aHashMap10764.get(Integer.valueOf(class249.anInt2777 * -1771553873)));
					if (class25 != null) {
						int i_291_;
						if (-810418811 * class25.anInt235 > anInt10791 * 1570431151 / 2)
							i_291_ = ((1027984977 * anInt10791 - class25.anInt235 * -498366597) / (1570431151 * anInt10791));
						else
							i_291_ = (class25.anInt235 * -498366597 / (1570431151 * anInt10791));
						int i_292_ = i + (i_284_ * (208579007 * class527_sub30.anInt10568) / anInt7131);
						int i_293_ = (i_281_ + ((anInt7167 - -1499963557 * class527_sub30.anInt10565) * i_285_ / anInt7167));
						class180.method3174(i_292_ - 2, i_293_ - 2, 4, 4, i_291_ << 24 | 0xffff00, 314417592);
					}
				}
			}
			aClass205_7129.method3792(5, (byte) 57);
		}
	}

	Class529_Sub1() throws Throwable {
		throw new Error();
	}

	public static void method16729() {
		Class465_Sub3.method15987(true, 713849349);
	}

	public static Class527_Sub8_Sub12 method16730() {
		return aClass527_Sub8_Sub12_7123;
	}

	public static Class527_Sub8_Sub12 method16731() {
		return aClass527_Sub8_Sub12_7123;
	}

	public static Class527_Sub8_Sub12 method16732() {
		return aClass527_Sub8_Sub12_7123;
	}

	public static Class527_Sub8_Sub12 method16733() {
		return aClass527_Sub8_Sub12_7123;
	}

	public static void method16734(int i, int i_294_, int i_295_, boolean bool) {
		Class527_Sub8_Sub12 class527_sub8_sub12 = aClass527_Sub8_Sub12_7123;
		method8749(i);
		aBool7172 = false;
		if (class527_sub8_sub12 != aClass527_Sub8_Sub12_7123)
			Class592.method9876((byte) 48);
		anInt10776 = 974227339 * i_294_;
		anInt10777 = i_295_ * -1984324647;
		aBool10778 = bool;
	}

	static void method16735(boolean bool) {
		Class592 class592 = Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.method18534(-1769454685);
		Class527_Sub8_Sub12 class527_sub8_sub12 = method8818(153371143 * class592.anInt7798, class592.anInt7799 * -2029646807);
		if (class527_sub8_sub12 == null)
			class527_sub8_sub12 = method8752(aClass630_7122.anInt8228 * 1674945435);
		if (Class603.aClass527_Sub8_Sub12_7959 != class527_sub8_sub12 || bool) {
			Class603.aClass527_Sub8_Sub12_7959 = class527_sub8_sub12;
			boolean bool_296_ = method8831(class527_sub8_sub12);
			if (bool_296_) {
				aBool7172 = true;
				Class592.method9876((byte) 53);
			}
		}
	}

	static void method16736(boolean bool) {
		Class592 class592 = Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.method18534(-2010156047);
		Class527_Sub8_Sub12 class527_sub8_sub12 = method8818(153371143 * class592.anInt7798, class592.anInt7799 * -2029646807);
		if (class527_sub8_sub12 == null)
			class527_sub8_sub12 = method8752(aClass630_7122.anInt8228 * 1674945435);
		if (Class603.aClass527_Sub8_Sub12_7959 != class527_sub8_sub12 || bool) {
			Class603.aClass527_Sub8_Sub12_7959 = class527_sub8_sub12;
			boolean bool_297_ = method8831(class527_sub8_sub12);
			if (bool_297_) {
				aBool7172 = true;
				Class592.method9876((byte) -2);
			}
		}
	}

	static void method16737(int i) {
		anInt10783 = 2049864907 * i;
		anInt10779 = -1449615877;
		anInt10772 = -1784395681;
		Class146.method2401((byte) 115);
	}

	static void method16738(int i) {
		anInt10783 = 2049864907 * i;
		anInt10779 = -1449615877;
		anInt10772 = -1784395681;
		Class146.method2401((byte) 121);
	}

	static void method16739(int i) {
		Class635.anInt8302 = i * -1224612011;
		anInt10772 = -1784395681;
		anInt10772 = -1784395681;
		Class146.method2401((byte) 69);
	}

	static void method16740(int i, int i_298_, int i_299_) {
		if (1008 == i)
			Class546.method9060(Class579.aClass579_7651, i_298_, i_299_, (byte) -92);
		else if (i == 1009)
			Class546.method9060(Class579.aClass579_7657, i_298_, i_299_, (byte) -18);
		else if (1010 == i)
			Class546.method9060(Class579.aClass579_7665, i_298_, i_299_, (byte) -82);
		else if (i == 1011)
			Class546.method9060(Class579.aClass579_7653, i_298_, i_299_, (byte) -64);
		else if (i == 1012)
			Class546.method9060(Class579.aClass579_7654, i_298_, i_299_, (byte) -12);
	}

	public static void method16741(int i) {
		if (25 == i)
			aFloat7134 = 2.0F;
		else if (37 == i)
			aFloat7134 = 3.0F;
		else if (50 == i)
			aFloat7134 = 4.0F;
		else if (75 == i)
			aFloat7134 = 6.0F;
		else if (i == 100)
			aFloat7134 = 8.0F;
		else if (i == 200)
			aFloat7134 = 16.0F;
		anInt10772 = -1784395681;
		anInt10772 = -1784395681;
	}

	public static void method16742(int i) {
		if (25 == i)
			aFloat7134 = 2.0F;
		else if (37 == i)
			aFloat7134 = 3.0F;
		else if (50 == i)
			aFloat7134 = 4.0F;
		else if (75 == i)
			aFloat7134 = 6.0F;
		else if (i == 100)
			aFloat7134 = 8.0F;
		else if (i == 200)
			aFloat7134 = 16.0F;
		anInt10772 = -1784395681;
		anInt10772 = -1784395681;
	}

	static void method16743() {
		if (anInt10783 * -502443805 < 0) {
			anInt10783 = 0;
			anInt10779 = -1449615877;
			anInt10772 = -1784395681;
		}
		if (anInt10783 * -502443805 > anInt7131) {
			anInt10783 = 2049864907 * anInt7131;
			anInt10779 = -1449615877;
			anInt10772 = -1784395681;
		}
		if (Class635.anInt8302 * 1891819005 < 0) {
			Class635.anInt8302 = 0;
			anInt10779 = -1449615877;
			anInt10772 = -1784395681;
		}
		if (Class635.anInt8302 * 1891819005 > anInt7167) {
			Class635.anInt8302 = anInt7167 * -1224612011;
			anInt10779 = -1449615877;
			anInt10772 = -1784395681;
		}
	}

	public static int method16744() {
		if (2.0 == (double) aFloat7134)
			return 25;
		if ((double) aFloat7134 == 3.0)
			return 37;
		if (4.0 == (double) aFloat7134)
			return 50;
		if ((double) aFloat7134 == 6.0)
			return 75;
		if (8.0 == (double) aFloat7134)
			return 100;
		return 200;
	}

	public static void method16745(int i) {
		Class25 class25 = (Class25) aHashMap10782.get(Integer.valueOf(i));
		if (null == class25)
			class25 = new Class25();
		class25.anInt236 = 1896267987 * anInt10784;
		class25.anInt235 = anInt10791 * 1656762787;
		aHashMap10782.put(Integer.valueOf(i), class25);
	}

	public static int method16746(int i, int i_300_, int i_301_) {
		if (anInt10773 * -1639647951 < 100)
			return -2;
		int i_302_ = -2;
		int i_303_ = 2147483647;
		int i_304_ = i_300_ - anInt7137;
		int i_305_ = i_301_ - anInt7138;
		for (Class527_Sub30 class527_sub30 = (Class527_Sub30) aClass694_7147.method14081((short) -28745); class527_sub30 != null; class527_sub30 = (Class527_Sub30) aClass694_7147.method14086(-65534)) {
			if (class527_sub30.anInt10567 * -558184067 == i) {
				int i_306_ = class527_sub30.anInt10568 * 208579007;
				int i_307_ = -1499963557 * class527_sub30.anInt10565;
				int i_308_ = i_306_ + anInt7137 << 14 | anInt7138 + i_307_;
				int i_309_ = ((i_304_ - i_306_) * (i_304_ - i_306_) + (i_305_ - i_307_) * (i_305_ - i_307_));
				if (i_302_ < 0 || i_309_ < i_303_) {
					i_302_ = i_308_;
					i_303_ = i_309_;
				}
			}
		}
		return i_302_;
	}

	public static void method16747(int i) {
		Class25 class25 = (Class25) aHashMap10782.get(Integer.valueOf(i));
		if (null == class25)
			class25 = new Class25();
		class25.anInt236 = 1896267987 * anInt10784;
		class25.anInt235 = anInt10791 * 1656762787;
		aHashMap10782.put(Integer.valueOf(i), class25);
	}

	public static int method16748(int i, int i_310_, int i_311_) {
		if (anInt10773 * -1639647951 < 100)
			return -2;
		int i_312_ = -2;
		int i_313_ = 2147483647;
		int i_314_ = i_310_ - anInt7137;
		int i_315_ = i_311_ - anInt7138;
		for (Class527_Sub30 class527_sub30 = (Class527_Sub30) aClass694_7147.method14081((short) 4345); class527_sub30 != null; class527_sub30 = (Class527_Sub30) aClass694_7147.method14086(-65534)) {
			if (class527_sub30.anInt10567 * -558184067 == i) {
				int i_316_ = class527_sub30.anInt10568 * 208579007;
				int i_317_ = -1499963557 * class527_sub30.anInt10565;
				int i_318_ = i_316_ + anInt7137 << 14 | anInt7138 + i_317_;
				int i_319_ = ((i_314_ - i_316_) * (i_314_ - i_316_) + (i_315_ - i_317_) * (i_315_ - i_317_));
				if (i_312_ < 0 || i_319_ < i_313_) {
					i_312_ = i_318_;
					i_313_ = i_319_;
				}
			}
		}
		return i_312_;
	}

	public static void method16749() {
		Class465_Sub3.method15987(true, 594489608);
	}

	public static void method16750(int i) {
		Class25 class25 = (Class25) aHashMap10764.get(Integer.valueOf(i));
		if (class25 == null)
			class25 = new Class25();
		class25.anInt236 = anInt10784 * 1896267987;
		class25.anInt235 = 1656762787 * anInt10791;
		aHashMap10764.put(Integer.valueOf(i), class25);
	}

	public static void method16751(int i) {
		Class25 class25 = (Class25) aHashMap10764.get(Integer.valueOf(i));
		if (class25 == null)
			class25 = new Class25();
		class25.anInt236 = anInt10784 * 1896267987;
		class25.anInt235 = 1656762787 * anInt10791;
		aHashMap10764.put(Integer.valueOf(i), class25);
	}

	public static void method16752(int i) {
		if (i < 1)
			anInt10784 = anInt10768 * -2102467361;
		else
			anInt10784 = i * -1808153193;
	}

	static final void method16753(Class180 class180, Class181 class181) {
		if (100 != anInt10773 * -1639647951 && null != aClass527_Sub8_Sub12_7123) {
			Class234.method4347(-1408626088);
			Class234.method4347(-1408626088);
			if (anInt10773 * -1639647951 < 10) {
				for (int i = 0; i < aClass174ArrayArray10785.length; i++) {
					for (int i_320_ = 0; i_320_ < aClass174ArrayArray10785[i].length; i_320_++) {
						Class338.aClass459_3656.method7480(aClass630_7122.anIntArrayArray8218[i][i_320_], 919100042);
						Class272.aClass459_3136.method7480(aClass630_7122.anIntArrayArray8218[i][i_320_], 1184942740);
					}
				}
				if (!aClass459_7115.method7485((aClass527_Sub8_Sub12_7123.aString11755), 1336183438)) {
					anInt10773 = (Class509.aClass459_6970.method7501(aClass527_Sub8_Sub12_7123.aString11755, -424734829)) / 10 * 1409827793;
					return;
				}
				anInt10773 = 1213376042;
			}
			if (10 == anInt10773 * -1639647951) {
				anInt7137 = (-696795403 * aClass527_Sub8_Sub12_7123.anInt11761 >> 6 << 6);
				anInt7138 = (aClass527_Sub8_Sub12_7123.anInt11756 * 124580655 >> 6 << 6);
				anInt7131 = (-646015201 * aClass527_Sub8_Sub12_7123.anInt11762 >> 6 << 6) - anInt7137 + 64;
				anInt7167 = (1393632705 * aClass527_Sub8_Sub12_7123.anInt11764 >> 6 << 6) - anInt7138 + 64;
				int[] is = new int[3];
				int i = -1;
				int i_321_ = -1;
				Class442 class442 = (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.method10637().aClass442_4927);
				Class592 class592 = client.aClass509_11072.method8283((short) 3254);
				if (aClass527_Sub8_Sub12_7123.method18314(Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aByte10864, (153371143 * class592.anInt7798 + ((int) class442.aFloat4918 >> 9)), (-2029646807 * class592.anInt7799 + ((int) class442.aFloat4919 >> 9)), is, (short) -8460)) {
					i = is[1] - anInt7137;
					i_321_ = is[2] - anInt7138;
				}
				if (!aBool10778 && i >= 0 && i < anInt7131 && i_321_ >= 0 && i_321_ < anInt7167) {
					i += (int) (Math.random() * 10.0) - 5;
					i_321_ += (int) (Math.random() * 10.0) - 5;
					anInt10783 = i * 2049864907;
					Class635.anInt8302 = i_321_ * -1224612011;
				} else if (anInt10776 * -220305373 != -1 && 697250921 * anInt10777 != -1) {
					aClass527_Sub8_Sub12_7123.method18305((anInt10776 * -220305373), (anInt10777 * 697250921), is, (byte) 14);
					if (is != null) {
						anInt10783 = (is[1] - anInt7137) * 2049864907;
						Class635.anInt8302 = -1224612011 * (is[2] - anInt7138);
					}
					anInt10777 = 1984324647;
					anInt10776 = -974227339;
					aBool10778 = false;
				} else {
					aClass527_Sub8_Sub12_7123.method18305((aClass527_Sub8_Sub12_7123.anInt11763 * 18711255 >> 14 & 0x3fff), (aClass527_Sub8_Sub12_7123.anInt11763 * 18711255 & 0x3fff), is, (byte) -23);
					anInt10783 = (is[1] - anInt7137) * 2049864907;
					Class635.anInt8302 = -1224612011 * (is[2] - anInt7138);
				}
				if (25 == aClass527_Sub8_Sub12_7123.anInt11760 * -1417497333) {
					aFloat7133 = 2.0F;
					aFloat7134 = 2.0F;
				} else if (-1417497333 * aClass527_Sub8_Sub12_7123.anInt11760 == 37) {
					aFloat7133 = 3.0F;
					aFloat7134 = 3.0F;
				} else if (-1417497333 * aClass527_Sub8_Sub12_7123.anInt11760 == 50) {
					aFloat7133 = 4.0F;
					aFloat7134 = 4.0F;
				} else if (75 == (aClass527_Sub8_Sub12_7123.anInt11760 * -1417497333)) {
					aFloat7133 = 6.0F;
					aFloat7134 = 6.0F;
				} else if (100 == (aClass527_Sub8_Sub12_7123.anInt11760 * -1417497333)) {
					aFloat7133 = 8.0F;
					aFloat7134 = 8.0F;
				} else if (aClass527_Sub8_Sub12_7123.anInt11760 * -1417497333 == 200) {
					aFloat7133 = 16.0F;
					aFloat7134 = 16.0F;
				} else {
					aFloat7133 = 8.0F;
					aFloat7134 = 8.0F;
				}
				anInt7130 = (int) aFloat7134 >> 1;
				aByteArrayArrayArray7118 = Class265.method5039(anInt7130, 672688101);
				Class146.method2401((byte) 27);
				method8747();
				Class620.aClass694_8119 = new Class694();
				anInt7116 += (int) (Math.random() * 5.0) - 2;
				if (anInt7116 < -8)
					anInt7116 = -8;
				if (anInt7116 > 8)
					anInt7116 = 8;
				anInt7128 += (int) (Math.random() * 5.0) - 2;
				if (anInt7128 < -16)
					anInt7128 = -16;
				if (anInt7128 > 16)
					anInt7128 = 16;
				method8866(class181, anInt7116 >> 2 << 10, anInt7128 >> 1);
				aClass24_Sub12_7164.method17394(1024, 256, (byte) -55);
				aClass24_Sub8_7119.method17378(256, 256, 999508948);
				aClass24_Sub6_7117.method838(4096, -2013002498);
				Class51.aClass24_Sub16_522.method838(256, -2023888532);
				anInt10773 = -1868215212;
			} else if (-1639647951 * anInt10773 == 20) {
				if (aBool7172) {
					if (method8808(class180, anInt7116, anInt7128, aBool7172))
						anInt10773 = -1309678340;
				} else {
					Class568.method9570(true, -2121305656);
					method8808(class180, anInt7116, anInt7128, aBool7172);
					anInt10773 = -1309678340;
					Class568.method9570(true, -786885327);
					Class527_Sub3.method16047(-1547764970);
				}
			} else if (60 == -1639647951 * anInt10773) {
				if (aClass459_7115.method7495((aClass527_Sub8_Sub12_7123.aString11755), 1430604295)) {
					if (!aClass459_7115.method7485((aClass527_Sub8_Sub12_7123.aString11755), 1270697514))
						return;
					aClass532_7135 = Class19.method770(aClass459_7115, (aClass527_Sub8_Sub12_7123.aString11755), client.aBool11165, 16777472);
				} else
					aClass532_7135 = new Class532(0);
				method8761();
				anInt10773 = -96302298;
				Class568.method9570(true, -1994878792);
				Class527_Sub3.method16047(-1136080141);
			} else if (anInt10773 * -1639647951 >= 70) {
				for (int i = 0; i < 3; i++) {
					for (int i_322_ = 0; i_322_ < 5; i_322_++) {
						if (aClass174ArrayArray10785[i][i_322_] == null || aClass22ArrayArray10780[i][i_322_] == null) {
							aClass174ArrayArray10785[i][i_322_] = ((Class174) (Class211.aClass420_2256.method6684(client.anInterface50_11053, (aClass630_7122.anIntArrayArray8218[i][i_322_]), true, true, (byte) -38)));
							aClass22ArrayArray10780[i][i_322_] = (Class211.aClass420_2256.method6690(client.anInterface50_11053, (aClass630_7122.anIntArrayArray8218[i][i_322_]), -530973439));
							if (aClass174ArrayArray10785[i][i_322_] != null && aClass22ArrayArray10780[i][i_322_] != null)
								anInt10773 += -65483917;
							else
								return;
						}
					}
				}
				anInt10773 = -751141468;
				System.gc();
			}
		}
	}

	public static void method16754(boolean bool) {
		aBool10786 = bool;
	}

	public static void method16755() {
		aHashMap10782.clear();
		aHashMap10764.clear();
	}

	public static void method16756() {
		aHashMap10782.clear();
		aHashMap10764.clear();
	}

	static void method16757(int i, int i_323_, int i_324_) {
		if (1008 == i)
			Class546.method9060(Class579.aClass579_7651, i_323_, i_324_, (byte) -63);
		else if (i == 1009)
			Class546.method9060(Class579.aClass579_7657, i_323_, i_324_, (byte) -18);
		else if (1010 == i)
			Class546.method9060(Class579.aClass579_7665, i_323_, i_324_, (byte) -41);
		else if (i == 1011)
			Class546.method9060(Class579.aClass579_7653, i_323_, i_324_, (byte) -125);
		else if (i == 1012)
			Class546.method9060(Class579.aClass579_7654, i_323_, i_324_, (byte) 2);
	}

	static boolean method16758(Class249 class249) {
		if (null == class249)
			return false;
		if (null != class249.anIntArray2759) {
			class249 = class249.method4645(anInterface20_7121, anInterface18_7120, -1702883297);
			if (class249 == null)
				return false;
		}
		if (!class249.aBool2746)
			return false;
		if (!class249.method4638(anInterface20_7121, anInterface18_7120, 1949405825))
			return false;
		if (aClass14_10788.method709((long) (1657285097 * class249.anInt2772)) != null)
			return false;
		if (aClass14_10789.method709((long) (class249.anInt2777 * -1771553873)) != null)
			return false;
		if (null != class249.aString2737) {
			if (0 == 1365262055 * class249.anInt2741 && aBool10790)
				return false;
			if (1 == class249.anInt2741 * 1365262055 && aBool10792)
				return false;
			if (2 == class249.anInt2741 * 1365262055 && aBool10793)
				return false;
		}
		return true;
	}

	static void method16759() {
		Class620.aClass694_8119 = null;
		anInt10773 = 0;
		anInt7178 = 0;
		Class527_Sub27.aClass243_10524 = null;
		method8748();
		aClass694_7147.method14105((byte) 124);
		aClass532_7135 = null;
		aClass205_7161.method3793((byte) 114);
		aClass205_7129.method3793((byte) 47);
		aClass147_10775 = null;
		anInt10779 = -1449615877;
		anInt10772 = -1784395681;
		if (aClass24_Sub12_7164 != null) {
			aClass24_Sub12_7164.method836(-358525160);
			aClass24_Sub12_7164.method17394(128, 64, (byte) 94);
		}
		if (null != aClass24_Sub8_7119)
			aClass24_Sub8_7119.method17378(64, 64, 133874047);
		if (null != aClass24_Sub6_7117)
			aClass24_Sub6_7117.method838(256, -2006836713);
		Class51.aClass24_Sub16_522.method838(64, -2090017789);
	}

	static void method16760(int i, int i_325_, int i_326_, int i_327_) {
		float f = (float) anInt7167 / (float) anInt7131;
		int i_328_ = i_326_;
		int i_329_ = i_327_;
		if (f < 1.0F)
			i_329_ = (int) (f * (float) i_326_);
		else
			i_328_ = (int) ((float) i_327_ / f);
		i -= (i_326_ - i_328_) / 2;
		i_325_ -= (i_327_ - i_329_) / 2;
		anInt10783 = 2049864907 * (anInt7131 * i / i_328_);
		Class635.anInt8302 = (anInt7167 - i_325_ * anInt7167 / i_329_) * -1224612011;
		anInt10779 = -1449615877;
		anInt10772 = -1784395681;
		Class146.method2401((byte) 19);
	}

	public static int method16761(int i, int i_330_, int i_331_) {
		if (anInt10773 * -1639647951 < 100)
			return -2;
		int i_332_ = -2;
		int i_333_ = 2147483647;
		int i_334_ = i_330_ - anInt7137;
		int i_335_ = i_331_ - anInt7138;
		for (Class527_Sub30 class527_sub30 = (Class527_Sub30) aClass694_7147.method14081((short) 6740); class527_sub30 != null; class527_sub30 = (Class527_Sub30) aClass694_7147.method14086(-65534)) {
			if (class527_sub30.anInt10567 * -558184067 == i) {
				int i_336_ = class527_sub30.anInt10568 * 208579007;
				int i_337_ = -1499963557 * class527_sub30.anInt10565;
				int i_338_ = i_336_ + anInt7137 << 14 | anInt7138 + i_337_;
				int i_339_ = ((i_334_ - i_336_) * (i_334_ - i_336_) + (i_335_ - i_337_) * (i_335_ - i_337_));
				if (i_332_ < 0 || i_339_ < i_333_) {
					i_332_ = i_338_;
					i_333_ = i_339_;
				}
			}
		}
		return i_332_;
	}

	public static Class527_Sub30 method16762() {
		if (null == aClass694_7147 || aClass691_10771 == null)
			return null;
		aClass691_10771.method14003(aClass694_7147, -1350836079);
		Class527_Sub30 class527_sub30 = (Class527_Sub30) aClass691_10771.method14010(1886751445);
		if (class527_sub30 == null)
			return null;
		Class249 class249 = ((Class249) aClass24_Sub12_7164.method81((class527_sub30.anInt10567 * -558184067), 1126763784));
		if (null == class249 || !class249.aBool2776 || !class249.method4638(anInterface20_7121, anInterface18_7120, 1949405825))
			return Class493.method8001((byte) 15);
		return class527_sub30;
	}

	public static Class527_Sub30 method16763() {
		if (aClass694_7147 == null || aClass691_10771 == null)
			return null;
		for (Class527_Sub30 class527_sub30 = (Class527_Sub30) aClass691_10771.next(); null != class527_sub30; class527_sub30 = (Class527_Sub30) aClass691_10771.next()) {
			Class249 class249 = ((Class249) aClass24_Sub12_7164.method81((-558184067 * class527_sub30.anInt10567), 1603209104));
			if (null != class249 && class249.aBool2776 && class249.method4638(anInterface20_7121, anInterface18_7120, 1949405825))
				return class527_sub30;
		}
		return null;
	}

	public static void method16764(int i, int i_340_) {
		anInt10779 = 1449615877 * (i - anInt7137);
		anInt10772 = 1784395681 * (i_340_ - anInt7138);
	}

	public static void method16765(int i, int i_341_) {
		anInt10779 = 1449615877 * (i - anInt7137);
		anInt10772 = 1784395681 * (i_341_ - anInt7138);
	}

	public static void method16766(int i, int i_342_) {
		anInt10783 = (i - anInt7137) * 2049864907;
		Class635.anInt8302 = -1224612011 * (i_342_ - anInt7138);
		anInt10779 = -1449615877;
		anInt10772 = -1784395681;
		Class146.method2401((byte) 9);
	}

	public static void method16767(int i, int i_343_) {
		anInt10783 = (i - anInt7137) * 2049864907;
		Class635.anInt8302 = -1224612011 * (i_343_ - anInt7138);
		anInt10779 = -1449615877;
		anInt10772 = -1784395681;
		Class146.method2401((byte) 66);
	}

	public static void method16768(int i, int i_344_) {
		anInt10783 = (i - anInt7137) * 2049864907;
		Class635.anInt8302 = -1224612011 * (i_344_ - anInt7138);
		anInt10779 = -1449615877;
		anInt10772 = -1784395681;
		Class146.method2401((byte) 104);
	}

	public static boolean method16769(int i, boolean bool) {
		if (-1688002965 * anInt10795 == i)
			aBool10796 = bool;
		else if (-1103382687 * anInt10769 == i)
			aBool10794 = bool;
		else if (495684169 * anInt10787 == i)
			aBool10766 = bool;
		else
			return false;
		return true;
	}

	public static boolean method16770(int i, boolean bool) {
		if (-1688002965 * anInt10795 == i)
			aBool10796 = bool;
		else if (-1103382687 * anInt10769 == i)
			aBool10794 = bool;
		else if (495684169 * anInt10787 == i)
			aBool10766 = bool;
		else
			return false;
		return true;
	}

	public static boolean method16771(int i, boolean bool) {
		if (-1688002965 * anInt10795 == i)
			aBool10796 = bool;
		else if (-1103382687 * anInt10769 == i)
			aBool10794 = bool;
		else if (495684169 * anInt10787 == i)
			aBool10766 = bool;
		else
			return false;
		return true;
	}

	public static int method16772(int i) {
		if (i == -1688002965 * anInt10795)
			return aBool10796 ? 1 : 0;
		if (-1103382687 * anInt10769 == i)
			return aBool10794 ? 1 : 0;
		if (i == 495684169 * anInt10787)
			return aBool10766 ? 1 : 0;
		return -1;
	}

	public static int method16773(int i) {
		if (i == -1688002965 * anInt10795)
			return aBool10796 ? 1 : 0;
		if (-1103382687 * anInt10769 == i)
			return aBool10794 ? 1 : 0;
		if (i == 495684169 * anInt10787)
			return aBool10766 ? 1 : 0;
		return -1;
	}

	static final void method16774(Class665 class665, int i) {
		if (Class420.aClass273_4591.method5088(-2046627338) > 0) {
			String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
			String string_345_ = Class420.aClass273_4591.method5109(string, 1968897173);
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = string_345_;
		}
	}

	static boolean method16775(Interface62 interface62, Class24_Sub6 class24_sub6, int i, int i_346_, int i_347_) {
		if (interface62 == null)
			return false;
		Class602 class602 = ((Class602) class24_sub6.method81(interface62.method64(-904373743), 81513128));
		if (class602.aBool7951 && !client.aBool11165)
			return false;
		int i_348_ = -177138561 * class602.anInt7928;
		if (class602.anIntArray7929 != null) {
			for (int i_349_ = 0; i_349_ < class602.anIntArray7929.length; i_349_++) {
				if (class602.anIntArray7929[i_349_] != -1) {
					Class602 class602_350_ = ((Class602) class24_sub6.method81((class602.anIntArray7929[i_349_]), 1410713557));
					if (class602_350_.anInt7928 * -177138561 >= 0)
						i_348_ = class602_350_.anInt7928 * -177138561;
				}
			}
		}
		if (i_348_ >= 0) {
			Class106.anIntArray1315[-306278703 * Class106.anInt1316] = class602.anInt7873 * -320331677;
			Class106.anIntArray1326[-306278703 * Class106.anInt1316] = i;
			Class106.anIntArray1318[Class106.anInt1316 * -306278703] = i_346_;
			Class106.anInt1316 += 862620209;
			return true;
		}
		return false;
	}
}
