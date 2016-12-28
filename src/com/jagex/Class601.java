/* Class601 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class601 implements Interface75 {
	static Class601 aClass601_7850;
	static Class601 aClass601_7851 = new Class601(0);
	public static Class601 aClass601_7852;
	int anInt7853;

	Class601(int i) {
		anInt7853 = i * -244240919;
	}

	static {
		aClass601_7850 = new Class601(1);
		aClass601_7852 = new Class601(2);
	}

	public int method12() {
		return 1742109273 * anInt7853;
	}

	public int method73() {
		return 1742109273 * anInt7853;
	}

	public int method78() {
		return 1742109273 * anInt7853;
	}

	static final void method7163(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		IComponentDefinitions class251 = class683.aClass251_8650;
		Class466.method5682(class251, class668, -1153659928);
	}

	static final void method7164(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = (ClientSetting.aClass536_Sub40_8843.defaultAntiAliasingSetting.method10155((byte) -47) && Class677.aClass167_8609.method2015()) ? 1 : 0;
	}

	public static byte[] method7165(byte[] is, int i, int i_0_, byte i_1_) {
		byte[] is_2_;
		if (i > 0) {
			is_2_ = new byte[i_0_];
			for (int i_3_ = 0; i_3_ < i_0_; i_3_++)
				is_2_[i_3_] = is[i_3_ + i];
		} else
			is_2_ = is;
		Class10 class10 = new Class10();
		class10.method612(-2143990099);
		class10.method610(is_2_, (long) (i_0_ * 8));
		byte[] is_4_ = new byte[64];
		class10.method611(is_4_, 0, -328858431);
		return is_4_;
	}

	static final void method7166(Class668 class668, int i) {
		int i_5_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		Class248 class248 = ((Class248) Class398_Sub1.aClass34_Sub8_10110.method70(i_5_, (byte) 27));
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 1093270539 * class248.anInt2486;
	}

	static final void method7167(Class668 class668, int i) {
		class668.anInt8542 -= 1472892954;
		client.aShort11275 = (short) class668.anIntArray8541[class668.anInt8542 * 1867269829];
		if (client.aShort11275 <= 0)
			client.aShort11275 = (short) 256;
		client.aShort11276 = (short) (class668.anIntArray8541[1867269829 * class668.anInt8542 + 1]);
		if (client.aShort11276 <= 0)
			client.aShort11276 = (short) 205;
	}

	static final void method7168(Class536_Sub2 class536_sub2, int i) {
		Class553 class553 = client.aClass515_11066.method6249(-2060687331);
		if (null != class553) {
			Interface59 interface59 = null;
			if (class536_sub2.anInt10308 * 702777497 == 0)
				interface59 = (Interface59) (class553.method6716(class536_sub2.anInt10310 * -1676454841, class536_sub2.anInt10309 * 848380705, class536_sub2.anInt10312 * -499217723, -342954341));
			if (1 == class536_sub2.anInt10308 * 702777497)
				interface59 = (Interface59) (class553.method6714(class536_sub2.anInt10310 * -1676454841, class536_sub2.anInt10309 * 848380705, -499217723 * class536_sub2.anInt10312, (byte) -14));
			if (class536_sub2.anInt10308 * 702777497 == 2)
				interface59 = (Interface59) (class553.method6736(class536_sub2.anInt10310 * -1676454841, class536_sub2.anInt10309 * 848380705, class536_sub2.anInt10312 * -499217723, client.anInterface64_11113, (byte) -2));
			if (3 == class536_sub2.anInt10308 * 702777497)
				interface59 = (Interface59) (class553.method6726(class536_sub2.anInt10310 * -1676454841, class536_sub2.anInt10309 * 848380705, -499217723 * class536_sub2.anInt10312, 1672121015));
			if (null != interface59) {
				class536_sub2.anInt10311 = interface59.method373((byte) -1) * -184607751;
				class536_sub2.anInt10307 = interface59.method71(705286088) * 2098306573;
				class536_sub2.anInt10322 = interface59.method367((byte) -10) * 528314499;
			} else {
				class536_sub2.anInt10311 = 184607751;
				class536_sub2.anInt10307 = 0;
				class536_sub2.anInt10322 = 0;
			}
		}
	}

	static int method7169(int i) {
		if (ClientSetting.aClass536_Sub40_8843.aClass710_Sub39_10783.method10236(-1980192452) == 0) {
			for (int i_6_ = 0; i_6_ < -1816034791 * client.anInt11033; i_6_++) {
				if (client.anInterface63Array11034[i_6_].method412((byte) -104) == 's' || client.anInterface63Array11034[i_6_].method412((byte) -81) == 'S') {
					ClientSetting.aClass536_Sub40_8843.method9857(ClientSetting.aClass536_Sub40_8843.aClass710_Sub39_10783, 1, (byte) 1);
					client.aBool10995 = true;
					Class398.method4898(Class63.aClass63_710, (byte) 0);
					break;
				}
			}
		}
		if (Class303.aClass303_3416 == Class483.aClass303_5431) {
			if (null == Class290.aClass426_3223)
				Class290.aClass426_3223 = new Class426(Class176.aClass460_1936, Class183_Sub2.aClass449_9812, Class246.aClass466_2473, Class72.GRAB_PUBLIC_EXPONENT, Class72.GRAB_PUBLIC_MODULUS);
			if (!Class290.aClass426_3223.method5122((byte) 35))
				return 0;
			Class656.method7945(0, null, true, (byte) -99);
			Class310.aBool3466 = !Class175.method2451((byte) 15);
			InputStream_Sub1.aClass461_10979 = Class30.method785((Class310.aBool3466 ? JS5Archive.LOADING_SPRITES_RAW : JS5Archive.LOADING_SPRITES), false, 1, true, true, (byte) -38);
			Class161.aClass461_1770 = Class30.method785(JS5Archive.LOADING_SCREENS, false, 1, true, true, (byte) -113);
			Class710_Sub43.aClass461_10940 = Class30.method785(JS5Archive.FONT_METRICS, false, 1, true, true, (byte) -77);
			Class184_Sub2.aClass461_9443 = Class30.method785(JS5Archive.DEFAULTS, true, 1, true, true, (byte) -95);
		}
		if (Class483.aClass303_5431 == Class303.aClass303_3415) {
			boolean bool = Class161.aClass461_1770.method5561(-1376011786);
			boolean bool_7_ = Class184_Sub2.aClass461_9443.method5561(-1376011786);
			int i_8_ = Class275.aClass459_Sub1Array3024[JS5Archive.LOADING_SCREENS.method903(1859216960)].method9232((byte) 112);
			i_8_ = i_8_ + Class275.aClass459_Sub1Array3024[(Class310.aBool3466 ? JS5Archive.LOADING_SPRITES_RAW.method903(-437999709) : JS5Archive.LOADING_SPRITES.method903(-1566797578))].method9232((byte) 112);
			i_8_ += Class275.aClass459_Sub1Array3024[JS5Archive.FONT_METRICS.method903(-867625406)].method9232((byte) 42);
			i_8_ = i_8_ + (bool_7_ ? 100 : Class184_Sub2.aClass461_9443.method5563(1366896953));
			i_8_ = i_8_ + (bool ? 100 : Class161.aClass461_1770.method5563(859090222));
			if (500 != i_8_)
				return i_8_ / 5;
			Class644.aClass628_8352 = new Class628(Class184_Sub2.aClass461_9443);
			Class594.method7127(Class644.aClass628_8352, 1898130781);
			int i_9_ = ClientSetting.aClass536_Sub40_8843.loadingScreenTypeSetting.method10186(-900485541);
			Class708.aClass87_8824 = new Class87(client.aClass670_11043, Class459.aClass664_5178, Class161.aClass461_1770);
			Class88[] class88s = Class708.aClass87_8824.method1207(i_9_, -1411037171);
			if (0 == class88s.length)
				class88s = Class708.aClass87_8824.method1207(0, -1411037171);
			Class322 class322 = new Class322(InputStream_Sub1.aClass461_10979, Class710_Sub43.aClass461_10940);
			if (class88s.length > 0) {
				Class310.anInterface30Array3473 = new Interface30[class88s.length];
				for (int i_10_ = 0; i_10_ < Class310.anInterface30Array3473.length; i_10_++)
					Class310.anInterface30Array3473[i_10_] = new Class291((Class708.aClass87_8824.method1206(1764439391 * class88s[i_10_].anInt877, (byte) 61)), -1366497531 * class88s[i_10_].anInt878, class88s[i_10_].anInt876 * 1111462391, class322);
			}
		}
		if (Class483.aClass303_5431 == Class303.aClass303_3409)
			Class196.aClass410_2202 = new Class410(Class677.aClass167_8609, InputStream_Sub1.aClass461_10979, Class710_Sub43.aClass461_10940, Class308.method4135(648600930));
		if (Class483.aClass303_5431 == Class303.aClass303_3410) {
			int i_11_ = Class196.aClass410_2202.method4985(2099829102);
			int i_12_ = Class196.aClass410_2202.method4978(483558724);
			if (i_11_ < i_12_)
				return 100 * i_11_ / i_12_;
		}
		if (Class303.aClass303_3411 == Class483.aClass303_5431) {
			if (Class310.anInterface30Array3473 != null && Class310.anInterface30Array3473.length > 0) {
				if (Class310.anInterface30Array3473[0].method171(-635110050) < 100)
					return 0;
				if (Class310.anInterface30Array3473.length > 1 && Class708.aClass87_8824.method1208(2029839107) && Class310.anInterface30Array3473[1].method171(-2044172292) < 100)
					return 0;
			}
			Class196.aClass410_2202.method4976(client.anInterface51_11196, 2087316112);
			Class199.method2908(Class677.aClass167_8609, -1952860773);
			Class673.method8026(15, -1798113843);
		}
		if (Class483.aClass303_5431 == Class303.aClass303_3408) {
			Class398.aClass461_4122 = Class30.method785(JS5Archive.SPRITES, false, 1, false, true, (byte) -64);
			Class529_Sub1.aClass461_10283 = Class30.method785(JS5Archive.ANIMATIONS, false, 1, false, true, (byte) -30);
			Class586.aClass461_7709 = Class30.method785(JS5Archive.BASES, false, 1, false, true, (byte) -17);
			Class205_Sub9.aClass461_9887 = Class30.method785(JS5Archive.CONFIG, false, 1, true, true, (byte) 1);
			Class247_Sub1.aClass461_9968 = Class30.method785(JS5Archive.DB_TABLE_INDEX, false, 1, true, true, (byte) -46);
			Class318.aClass461_3526 = Class30.method785(JS5Archive.INTERFACES, false, 1, true, true, (byte) 1);
			Class116.aClass461_1432 = Class30.method785(JS5Archive.MAPS, true, 1, false, true, (byte) 4);
			Class602.aClass461_7857 = Class30.method785(JS5Archive.MODELS, false, 1, false, true, (byte) -77);
			Class279.aClass461_3162 = Class30.method785(JS5Archive.TEXTURES_DIFFUSE_PNG, true, 1, false, true, (byte) -15);
			Class65.aClass461_719 = Class30.method785(JS5Archive.TEXTURES_HDR_PNG, true, 1, false, true, (byte) -70);
			Class395.aClass461_4109 = Class30.method785(JS5Archive.BINARY, false, 1, false, true, (byte) -107);
			Class649_Sub1_Sub4_Sub2.aClass461_12021 = Class30.method785(JS5Archive.CLIENT_SCRIPTS, false, 1, true, true, (byte) -44);
			Class206_Sub1.aClass461_10024 = Class30.method785(JS5Archive.VORBIS, true, 1, false, false, (byte) -10);
			Class14.aClass461_164 = Class30.method785(JS5Archive.AUDIO_STREAMS, true, 1, false, false, (byte) -32);
			Class214.aClass461_2301 = Class30.method785(JS5Archive.CONFIG_LOC, false, 1, true, true, (byte) -70);
			Class303.aClass461_3432 = Class30.method785(JS5Archive.CONFIG_ENUM, false, 1, true, true, (byte) -44);
			Class214.aClass461_2302 = Class30.method785(JS5Archive.CONFIG_NPC, false, 1, true, true, (byte) -112);
			Class154.aClass461_1720 = Class30.method785(JS5Archive.CONFIG_OBJ, false, 1, true, true, (byte) -11);
			Class20.aClass461_215 = Class30.method785(JS5Archive.CONFIG_SEQ, false, 1, true, true, (byte) -79);
			Class218.aClass461_2308 = Class30.method785(JS5Archive.CONFIG_SPOT, false, 1, true, true, (byte) -91);
			Class397.aClass461_4114 = Class30.method785(JS5Archive.CONFIG_STRUCT, false, 1, true, true, (byte) -90);
			Class613.aClass461_8013 = Class30.method785(JS5Archive.WORLD_MAP, true, 1, false, false, (byte) -38);
			Class622.aClass461_8129 = Class30.method785(JS5Archive.WORLD_MAP_AREA, true, 1, false, true, (byte) -43);
			Class576.aClass461_7687 = Class30.method785(JS5Archive.QUICK_CHAT, false, 1, true, true, (byte) -56);
			Class711.aClass461_8849 = Class30.method785(JS5Archive.QUICK_CHAT_GLOBAL, false, 1, true, true, (byte) -77);
			ObjTypeTransformation.aClass461_7789 = Class30.method785(JS5Archive.MATERIALS, true, 1, true, true, (byte) -105);
			Class550_Sub1.aClass461_10617 = Class30.method785(JS5Archive.PARTICLES, false, 1, true, true, (byte) -33);
			Class271.aClass461_2886 = Class30.method785(JS5Archive.BILLBOARDS, false, 1, true, true, (byte) -23);
			Class98_Sub1_Sub1.aClass461_11326 = Class30.method785(JS5Archive.CUTSCENES, true, 1, false, true, (byte) -17);
			Class460.aClass461_5203 = Class30.method785(JS5Archive.DLLS, true, 1, false, true, (byte) -68);
			Class540.aClass461_7161 = Class30.method785(JS5Archive.SHADERS, true, 1, true, true, (byte) -117);
		}
		if (Class483.aClass303_5431 == Class303.aClass303_3423) {
			int i_13_ = 0;
			int i_14_ = 0;
			for (int i_15_ = 0; i_15_ < Class275.aClass459_Sub1Array3024.length; i_15_++) {
				if (Class275.aClass459_Sub1Array3024[i_15_] != null) {
					i_13_ += Class275.aClass459_Sub1Array3024[i_15_].method9232((byte) 36);
					i_14_++;
				}
			}
			if (i_14_ > 0)
				i_13_ /= i_14_;
			if (100 != i_13_) {
				if (Class310.anInt3474 * -716548019 < 0)
					Class310.anInt3474 = 904962181 * i_13_;
				return (100 * (i_13_ - -716548019 * Class310.anInt3474) / (100 - -716548019 * Class310.anInt3474));
			}
			Class556.method6807(Class644.aClass628_8352, -1606870910);
			Class196.aClass410_2202 = new Class410(Class677.aClass167_8609, Class398.aClass461_4122, Class710_Sub43.aClass461_10940, Class308.method4135(648600930));
		}
		if (Class303.aClass303_3414 == Class483.aClass303_5431) {
			byte[] is = Class184_Sub2.aClass461_9443.method5595(((Class633.aClass633_8248.anInt8258) * -848473139), -999218638);
			if (is == null)
				return 0;
			Class184_Sub2.aClass211_9442 = new Class211();
			Class184_Sub2.aClass211_9442.method3038(50, 7340032, -1968863110);
			Class309.method4154(is, -2122833194);
			Class673.method8026(12, -1798113843);
		}
		if (Class483.aClass303_5431 == Class303.aClass303_3413 && null == Class399.aClass530_4128) {
			Class399.aClass530_4128 = new Class530(Class460.aClass461_5203);
			Class267.method3702(Class399.aClass530_4128, (byte) -12);
		}
		if (Class303.aClass303_3407 == Class483.aClass303_5431) {
			int i_16_ = Class405.method4938(1299553012);
			if (i_16_ < 100)
				return i_16_;
			Class388.method4849((Class184_Sub2.aClass461_9443.method5595((Class633.aClass633_8257.anInt8258 * -848473139), -2073080638)), (byte) -90);
			Class500.aShortArrayArray6844 = Class644.aClass628_8352.aShortArrayArray8189;
			Class267.aShortArrayArrayArray2870 = Class644.aClass628_8352.aShortArrayArrayArray8202;
			Class710_Sub4.aShortArrayArray10822 = Class644.aClass628_8352.aShortArrayArray8203;
			Class44.aShortArrayArrayArray520 = Class644.aClass628_8352.aShortArrayArrayArray8204;
			if (-1 != Class644.aClass628_8352.anInt8209 * 40680465 && Class644.aClass628_8352.anInt8227 * -1332536013 != -1) {
				client.anInt11152 = Class644.aClass628_8352.anInt8209 * 450786931;
				client.anInt11153 = 450748111 * Class644.aClass628_8352.anInt8227;
			}
			Class71.aClass631_796 = new Class631(Class184_Sub2.aClass461_9443);
			Class611.aClass602_7930 = new Class602(Class184_Sub2.aClass461_9443);
			Class331_Sub2.aClass621_10048 = new Class621(Class184_Sub2.aClass461_9443);
			Class333.aClass619_3623 = new Class619(Class184_Sub2.aClass461_9443);
			Class542.aClass622_7228 = new Class622(Class184_Sub2.aClass461_9443);
		}
		if (Class483.aClass303_5431 == Class303.aClass303_3417) {
			if (183673691 * Class644.aClass628_8352.anInt8197 != -1 && !Class602.aClass461_7857.method5558((183673691 * (Class644.aClass628_8352.anInt8197)), 0, -661641174))
				return 99;
			CPUUsageSetting.aClass174_10892 = new Class174(ObjTypeTransformation.aClass461_7789);
			Class175.anInterface24_1935 = new Class173_Sub1(Class279.aClass461_3162, Class65.aClass461_719);
			Class207.aClass34_Sub22_2244 = new Class34_Sub22(client.aClass670_11043, Class459.aClass664_5178, Class205_Sub9.aClass461_9887);
			Class497.aClass34_Sub16_5554 = new BASTypeList(client.aClass670_11043, Class459.aClass664_5178, Class205_Sub9.aClass461_9887);
			Class580.aClass34_Sub19_7695 = new Class34_Sub19(client.aClass670_11043, Class459.aClass664_5178, Class205_Sub9.aClass461_9887, Class398.aClass461_4122);
			Class228.aClass34_2360 = new Class34(client.aClass670_11043, Class459.aClass664_5178, Class205_Sub9.aClass461_9887, JS5ConfigGroup.DB_ROW_TYPE, 64, new Class58(com.jagex.Class14.class));
			Class205_Sub17.aClass34_9949 = new Class34(client.aClass670_11043, Class459.aClass664_5178, Class205_Sub9.aClass461_9887, JS5ConfigGroup.DB_TABLE_TYPE, 16, new Class58(com.jagex.Class92.class));
			Class676.aClass34_Sub6_8589 = new Class34_Sub6(client.aClass670_11043, Class459.aClass664_5178, Class303.aClass461_3432);
			Class654.aClass34_Sub4_8494 = new Class34_Sub4(client.aClass670_11043, Class459.aClass664_5178, Class205_Sub9.aClass461_9887);
			Class279.aClass34_Sub3_3163 = new Class34_Sub3(client.aClass670_11043, Class459.aClass664_5178, Class205_Sub9.aClass461_9887);
			Class524.aClass34_Sub10_7097 = new Class34_Sub10(client.aClass670_11043, Class459.aClass664_5178, Class205_Sub9.aClass461_9887, Class398.aClass461_4122);
			Class257.aClass34_Sub5_2765 = new Class34_Sub5(client.aClass670_11043, Class459.aClass664_5178, Class205_Sub9.aClass461_9887, Class398.aClass461_4122);
			Class205_Sub7.aClass34_Sub2_9878 = new Class34_Sub2(client.aClass670_11043, Class459.aClass664_5178, Class205_Sub9.aClass461_9887, Class602.aClass461_7857);
			Class74.aClass34_Sub21_818 = new Class34_Sub21(client.aClass670_11043, Class459.aClass664_5178, Class205_Sub9.aClass461_9887);
			Class642.aClass34_Sub20_8334 = new Class34_Sub20(client.aClass670_11043, Class459.aClass664_5178, Class205_Sub9.aClass461_9887);
			Class48.aClass34_Sub17_579 = new Class34_Sub17(client.aClass670_11043, Class459.aClass664_5178, true, Class214.aClass461_2301, Class602.aClass461_7857);
			client.aClass515_11066.method6254(Class48.aClass34_Sub17_579, -253285224);
			Class266.aClass503_2867.method6049(new Class34_Sub17(client.aClass670_11043, Class459.aClass664_5178, true, Class214.aClass461_2301, Class602.aClass461_7857), -256293637);
			Class398_Sub1.aClass34_Sub8_10110 = new Class34_Sub8(client.aClass670_11043, Class459.aClass664_5178, Class205_Sub9.aClass461_9887, Class398.aClass461_4122);
			Class602.aClass34_Sub1_7856 = new Class34_Sub1(client.aClass670_11043, Class459.aClass664_5178, Class205_Sub9.aClass461_9887, Class398.aClass461_4122);
			Class172.aClass34_Sub7_1922 = new Class34_Sub7(client.aClass670_11043, Class459.aClass664_5178, true, Class214.aClass461_2302, Class602.aClass461_7857);
			Class111.aClass34_Sub13_1391 = new Class34_Sub13(client.aClass670_11043, Class459.aClass664_5178, true, Class207.aClass34_Sub22_2244, Class154.aClass461_1720, Class602.aClass461_7857);
			Class38.aClass53_Sub2_481 = new QuestTypeList(client.aClass670_11043, Class459.aClass664_5178, Class205_Sub9.aClass461_9887, true);
			Class210.aClass34_Sub18_2261 = new Class34_Sub18(client.aClass670_11043, Class459.aClass664_5178, Class205_Sub9.aClass461_9887);
			Class45.aClass34_Sub11_529 = new Class34_Sub11(client.aClass670_11043, Class459.aClass664_5178, Class20.aClass461_215, Class529_Sub1.aClass461_10283, Class586.aClass461_7709, Class210.aClass34_Sub18_2261);
			Class459.aClass34_Sub9_5179 = new Class34_Sub9(client.aClass670_11043, Class459.aClass664_5178, Class205_Sub9.aClass461_9887);
			Class144.aClass34_Sub12_1680 = new Class34_Sub12(client.aClass670_11043, Class459.aClass664_5178, Class205_Sub9.aClass461_9887);
			Class633.aClass34_Sub15_8260 = new Class34_Sub15(client.aClass670_11043, Class459.aClass664_5178, Class218.aClass461_2308, Class602.aClass461_7857);
			Class529.aClass53_Sub1_7109 = new Class53_Sub1(client.aClass670_11043, Class459.aClass664_5178, Class397.aClass461_4114, true);
			Class309.aClass98_Sub1_Sub2_3465 = new Class98_Sub1_Sub2(client.aClass670_11043, Class458.aClass458_5167, Class459.aClass664_5178, Class205_Sub9.aClass461_9887);
			Class532.aClass98_Sub1_Sub1_7122 = new Class98_Sub1_Sub1(client.aClass670_11043, Class458.aClass458_5176, Class459.aClass664_5178, Class205_Sub9.aClass461_9887);
			Class678.aClass98_Sub1_Sub2_8625 = new Class98_Sub1_Sub2(client.aClass670_11043, Class458.aClass458_5166, Class459.aClass664_5178, Class205_Sub9.aClass461_9887);
			Class536_Sub19.aClass98_Sub1_Sub2_10519 = new Class98_Sub1_Sub2(client.aClass670_11043, Class458.aClass458_5171, Class459.aClass664_5178, Class205_Sub9.aClass461_9887);
			Class446.aClass98_Sub1_Sub2_4902 = new Class98_Sub1_Sub2(client.aClass670_11043, Class458.aClass458_5165, Class459.aClass664_5178, Class205_Sub9.aClass461_9887);
			Class333.aClass98_Sub1_Sub2_3622 = new Class98_Sub1_Sub2(client.aClass670_11043, Class458.aClass458_5174, Class459.aClass664_5178, Class205_Sub9.aClass461_9887);
			Class458_Sub2.aClass98_Sub1_Sub2_10306 = new Class98_Sub1_Sub2(client.aClass670_11043, Class458.aClass458_5170, Class459.aClass664_5178, Class205_Sub9.aClass461_9887);
			Class622.aMap8128 = Class449.method5420((new Class98_Sub1[] { Class309.aClass98_Sub1_Sub2_3465, Class532.aClass98_Sub1_Sub1_7122, Class678.aClass98_Sub1_Sub2_8625, (Class536_Sub19.aClass98_Sub1_Sub2_10519), Class446.aClass98_Sub1_Sub2_4902, Class333.aClass98_Sub1_Sub2_3622, (Class458_Sub2.aClass98_Sub1_Sub2_10306) }), (byte) 77);
			Class56.aClass34_Sub14_608 = new Class34_Sub14(client.aClass670_11043, Class459.aClass664_5178, Class205_Sub9.aClass461_9887, Class622.aMap8128);
			Class464.anInterface20_5230 = new Class294();
			Class197.method2869(Class318.aClass461_3526, Class602.aClass461_7857, Class398.aClass461_4122, Class710_Sub43.aClass461_10940, -1663052276);
			Class53.aClass385_598 = new Class385(Class271.aClass461_2886);
			Class237.aClass396_2422 = new Class396(Class550_Sub1.aClass461_10617);
			Class402.aClass397_4204 = new Class397(Class550_Sub1.aClass461_10617);
			Class39.aClass450_490 = new Class450(Class459.aClass664_5178, Class576.aClass461_7687, Class711.aClass461_8849);
			Class198.aClass32_2216 = new Class32(Class459.aClass664_5178, Class576.aClass461_7687, Class711.aClass461_8849, new Class389());
			Class465_Sub1.aClass96_10352 = new Class96(Class532.aClass98_Sub1_Sub1_7122, Class56.aClass34_Sub14_608, Class611.aClass602_7930.method7173(-601201309));
			Class184.method2769(2052496465);
			Class69.method1094(Class45.aClass34_Sub11_529, (byte) -114);
			Class160.method1963(Class402.aClass397_4204, Class237.aClass396_2422, 1334437075);
			Class652.method7868(Class602.aClass461_7857, CPUUsageSetting.aClass174_10892, Class175.anInterface24_1935, -1438323382);
			Huffman class282 = new Huffman(Class395.aClass461_4109.method5609("huffman", "", -6855510));
			Class390.method4855(class282, -628193606);
			GameShell.aClass504_6883 = Class449.method5423(-1643875150);
			Class458_Sub4.aClass536_Sub38_10336 = new Class536_Sub38(true);
		}
		if (Class483.aClass303_5431 == Class303.aClass303_3418) {
			int i_17_ = (Class635.method7565(Class398.aClass461_4122, (byte) -34) + Class196.aClass410_2202.method4979(true, (byte) 87));
			int i_18_ = (Class167.method2412(1855773893) + Class196.aClass410_2202.method4978(180521832));
			if (i_17_ < i_18_)
				return i_17_ * 100 / i_18_;
		}
		if (Class303.aClass303_3419 == Class483.aClass303_5431)
			Class542.method6556(Class613.aClass461_8013, Class622.aClass461_8129, Class654.aClass34_Sub4_8494, Class279.aClass34_Sub3_3163, client.aClass515_11066.method6280(-1073841494), Class398_Sub1.aClass34_Sub8_10110, Class602.aClass34_Sub1_7856, Class465_Sub1.aClass96_10352, Class465_Sub1.aClass96_10352);
		if (Class303.aClass303_3420 == Class483.aClass303_5431) {
			ObjTypeTransformation.aClass147_Sub1_7791 = new Class147_Sub1(Class309.aClass98_Sub1_Sub2_3465);
			Class144.method1790(-1807765770);
			Class218.aClass66_2307 = Class456.method5483(-1538387421);
			Class116.aClass461_1432.method5569(false, true, (byte) -22);
			Class398.aClass461_4122.method5569(true, true, (byte) 24);
			Class710_Sub43.aClass461_10940.method5569(true, true, (byte) 15);
			Class395.aClass461_4109.method5569(true, true, (byte) 73);
			client.aBool11103 = true;
		}
		if (Class483.aClass303_5431 == Class303.aClass303_3421 && Class644.aClass628_8352.anInt8195 * 1657790451 != -1) {
			if (!Class644.method7794((1657790451 * Class644.aClass628_8352.anInt8195), null, 1300952836))
				return 0;
			boolean bool = true;
			for (int i_19_ = 0; i_19_ < (Class463.aClass234Array5227[1657790451 * Class644.aClass628_8352.anInt8195].icomponentDefinitions).length; i_19_++) {
				IComponentDefinitions class251 = (Class463.aClass234Array5227[1657790451 * Class644.aClass628_8352.anInt8195].icomponentDefinitions[i_19_]);
				if (1049444347 * class251.anInt2728 == 5 && -1 != class251.graphicId * -1307221069 && !Class398.aClass461_4122.method5558((-1307221069 * (class251.graphicId)), 0, -1248136142))
					bool = false;
			}
			if (!bool)
				return 0;
		}
		if (Class483.aClass303_5431 == Class303.aClass303_3422)
			Class106.method1427(true, -1158638358);
		if (Class483.aClass303_5431 == Class303.aClass303_3428) {
			Class192.aClass292_2177.method3941((short) -21375);
			try {
				Class94.aThread1148.join();
			} catch (InterruptedException interruptedexception) {
				return 0;
			}
			Class192.aClass292_2177 = null;
			Class94.aThread1148 = null;
			InputStream_Sub1.aClass461_10979 = null;
			Class161.aClass461_1770 = null;
			Class708.aClass87_8824 = null;
			Class310.anInterface30Array3473 = null;
			Class211.aMap2292.remove(JS5Archive.LOADING_SCREENS);
			Class211.aMap2292.remove(JS5Archive.LOADING_SPRITES);
			Class211.aMap2292.remove(JS5Archive.LOADING_SPRITES_RAW);
			Class287.method3911(-2013398097);
			client.aBool10994 = ClientSetting.aClass536_Sub40_8843.aClass710_Sub39_10783.method10236(-2026408065) == 1;
			ClientSetting.aClass536_Sub40_8843.method9857((ClientSetting.aClass536_Sub40_8843.aClass710_Sub39_10783), 1, (byte) 1);
			if (client.aBool10994)
				ClientSetting.aClass536_Sub40_8843.method9857(ClientSetting.aClass536_Sub40_8843.defaultToolkit, 0, (byte) 1);
			else if ((ClientSetting.aClass536_Sub40_8843.defaultToolkit.aBool10858) && (Class458_Sub4.aClass536_Sub38_10336.anInt10684 * -853108975) < 512 && 0 != -853108975 * (Class458_Sub4.aClass536_Sub38_10336.anInt10684))
				ClientSetting.aClass536_Sub40_8843.method9857(ClientSetting.aClass536_Sub40_8843.defaultToolkit, 0, (byte) 1);
			Class27.method763(1909866459);
			if (client.aBool10994) {
				Class704.method8264(0, false, (byte) 30);
				if (!client.aBool10995)
					Class398.method4898(Class63.aClass63_711, (byte) 0);
			} else {
				Class704.method8264(ClientSetting.aClass536_Sub40_8843.defaultToolkit.method10071(), false, (byte) 45);
				if (ClientSetting.aClass536_Sub40_8843.defaultToolkit.method10071() == 0)
					Class398.method4898(Class63.aClass63_712, (byte) 0);
			}
			Class15.method640(ClientSetting.aClass536_Sub40_8843.aClass710_Sub12_10769.method10038(), -1, -1, false, -1239133661);
			Class196.aClass410_2202.method4976(client.anInterface51_11196, 1766214944);
			Class199.method2908(Class677.aClass167_8609, -2028484045);
			Class536_Sub34.method9816(Class677.aClass167_8609, Class398.aClass461_4122, (byte) 0);
		}
		return Class248.method3444(-790193575);
	}
}
