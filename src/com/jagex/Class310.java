/* Class310 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Frame;

public class Class310 {
	static boolean aBool3466;
	static Class303[] aClass303Array3467;
	static int anInt3468 = 1442489163;
	static String aString3469;
	static final String aString3470 = " - ";
	static boolean aBool3471 = false;
	static String aString3472;
	static Interface30[] anInterface30Array3473;
	static int anInt3474 = -904962181;

	public static void method4155() {
		aBool3471 = true;
		aString3472 = Class61.aString679;
		Class87.aString872 = Class61.aString696;
		Class275.method3737(false, -1843726747);
		Class184.method2768((short) -18069);
		aClass303Array3467 = null;
		Class290.aClass426_3223 = null;
		Class673.method8026(18, -1798113843);
	}

	public static void method4156() {
		aBool3471 = true;
		aString3472 = Class61.aString679;
		Class87.aString872 = Class61.aString696;
		Class275.method3737(false, -1568203617);
		Class184.method2768((short) -29641);
		aClass303Array3467 = null;
		Class290.aClass426_3223 = null;
		Class673.method8026(18, -1798113843);
	}

	public static boolean method4157() {
		return aBool3471;
	}

	public static void method4158() {
		if (anInterface30Array3473 != null) {
			Interface30[] interface30s = anInterface30Array3473;
			for (int i = 0; i < interface30s.length; i++) {
				Interface30 interface30 = interface30s[i];
				interface30.method172((short) 807);
			}
		}
	}

	static int method4159() {
		int i = Class483.aClass303_5431.anInt3425 * -783382047;
		if (i < aClass303Array3467.length - 1)
			Class483.aClass303_5431 = aClass303Array3467[i + 1];
		return 100;
	}

	static void method4160() {
		if (null != Class483.aClass303_5431) {
			Class192.aClass292_2177 = new Class292();
			Class192.aClass292_2177.method3935(Class34_Sub14.aLong10970 * -1422508675219242683L, Class483.aClass303_5431.aClass38_3426.method840(Class459.aClass664_5178, 1701080421), Class483.aClass303_5431.aClass38_3426.method840(Class459.aClass664_5178, 2108965625), -1949228175 * Class483.aClass303_5431.anInt3431, Class483.aClass303_5431, 1452175058);
			Class94.aThread1148 = new Thread(Class192.aClass292_2177, "");
			Class94.aThread1148.start();
		}
	}

	static void method4161() {
		if (null != Class483.aClass303_5431) {
			Class192.aClass292_2177 = new Class292();
			Class192.aClass292_2177.method3935(Class34_Sub14.aLong10970 * -1422508675219242683L, Class483.aClass303_5431.aClass38_3426.method840(Class459.aClass664_5178, 1752719079), Class483.aClass303_5431.aClass38_3426.method840(Class459.aClass664_5178, 2131376002), -1949228175 * Class483.aClass303_5431.anInt3431, Class483.aClass303_5431, 2012830074);
			Class94.aThread1148 = new Thread(Class192.aClass292_2177, "");
			Class94.aThread1148.start();
		}
	}

	public static void method4162() {
		if (anInterface30Array3473 != null) {
			Interface30[] interface30s = anInterface30Array3473;
			for (int i = 0; i < interface30s.length; i++) {
				Interface30 interface30 = interface30s[i];
				interface30.method172((short) 807);
			}
		}
	}

	public static void method4163() {
		if (anInterface30Array3473 != null) {
			Interface30[] interface30s = anInterface30Array3473;
			for (int i = 0; i < interface30s.length; i++) {
				Interface30 interface30 = interface30s[i];
				interface30.method172((short) 807);
			}
		}
	}

	public static void method4164() {
		if (aClass303Array3467 == null) {
			aClass303Array3467 = Class303.method4103((byte) -43);
			Class483.aClass303_5431 = aClass303Array3467[0];
			Class34_Sub14.aLong10970 = Class249.method3450(1478151227) * -5008952368824637043L;
		}
		if (null == Class192.aClass292_2177)
			Class6.method593(560532053);
		Class303 class303 = Class483.aClass303_5431;
		int i = Class601.method7169(-1340742229);
		if (class303 == Class483.aClass303_5431) {
			aString3469 = Class483.aClass303_5431.aClass38_3426.method840(Class459.aClass664_5178, 2132593836);
			Class594.aString7816 = aString3469;
			if (Class483.aClass303_5431.aBool3427)
				Class71.anInt795 = (-1270314255 * (i * (Class483.aClass303_5431.anInt3429 * -1375848401 - (Class483.aClass303_5431.anInt3431 * -1949228175)) / 100 + -1949228175 * Class483.aClass303_5431.anInt3431));
			if (Class483.aClass303_5431.aBool3430)
				Class594.aString7816 = new StringBuilder().append(Class594.aString7816).append(" - ").append(Class71.anInt795 * -1518393839).append("%").toString();
		} else if (Class303.aClass303_3424 == Class483.aClass303_5431) {
			Class192.aClass292_2177 = null;
			Class673.method8026(16, -1798113843);
			if (aBool3471) {
				aBool3471 = false;
				Class315_Sub2.method9204(aString3472, Class87.aString872, "", false, 621918291);
			}
		} else {
			aString3469 = class303.aClass38_3412.method840(Class459.aClass664_5178, 2059848486);
			Class594.aString7816 = aString3469;
			if (Class483.aClass303_5431.aBool3430)
				Class594.aString7816 = new StringBuilder().append(Class594.aString7816).append(" - ").append(class303.anInt3429 * -1375848401).append("%").toString();
			Class71.anInt795 = class303.anInt3429 * -1345045953;
			if (Class483.aClass303_5431.aBool3427 || class303.aBool3427)
				Class34_Sub14.aLong10970 = Class249.method3450(1870598556) * -5008952368824637043L;
		}
		if (Class192.aClass292_2177 != null) {
			Class192.aClass292_2177.method3935((-1422508675219242683L * Class34_Sub14.aLong10970), aString3469, Class594.aString7816, Class71.anInt795 * -1518393839, Class483.aClass303_5431, 1053554981);
			if (null != anInterface30Array3473) {
				for (int i_0_ = -28724835 * anInt3468 + 1; i_0_ < anInterface30Array3473.length; i_0_++) {
					if ((anInterface30Array3473[i_0_].method171(526849321) >= 100) && anInt3468 * -28724835 == i_0_ - 1 && 18 != -708374433 * client.anInt11101 && Class192.aClass292_2177.method3933(-1165207171)) {
						try {
							anInterface30Array3473[i_0_].method172((short) 807);
						} catch (Exception exception) {
							anInterface30Array3473 = null;
							break;
						}
						Class192.aClass292_2177.method3934(anInterface30Array3473[i_0_], -1865316790);
						anInt3468 += -1442489163;
						if ((anInt3468 * -28724835 >= anInterface30Array3473.length - 1) && anInterface30Array3473.length > 1)
							anInt3468 = (Class708.aClass87_8824.method1208(1280580437) ? 0 : -1) * -1442489163;
					}
				}
			}
		}
	}

	static int method4165() {
		int i = Class483.aClass303_5431.anInt3425 * -783382047;
		if (i < aClass303Array3467.length - 1)
			Class483.aClass303_5431 = aClass303Array3467[i + 1];
		return 100;
	}

	static int method4166() {
		int i = Class483.aClass303_5431.anInt3425 * -783382047;
		if (i < aClass303Array3467.length - 1)
			Class483.aClass303_5431 = aClass303Array3467[i + 1];
		return 100;
	}

	static int method4167() {
		int i = Class483.aClass303_5431.anInt3425 * -783382047;
		if (i < aClass303Array3467.length - 1)
			Class483.aClass303_5431 = aClass303Array3467[i + 1];
		return 100;
	}

	Class310() throws Throwable {
		throw new Error();
	}

	static int method4168() {
		if (Class710.aClass536_Sub40_8843.aClass710_Sub39_10783.method10236(-2048977463) == 0) {
			for (int i = 0; i < -1816034791 * client.anInt11033; i++) {
				if ((client.anInterface63Array11034[i].method412((byte) -25) == 's') || (client.anInterface63Array11034[i].method412((byte) -41) == 'S')) {
					Class710.aClass536_Sub40_8843.method9857(Class710.aClass536_Sub40_8843.aClass710_Sub39_10783, 1, (byte) 1);
					client.aBool10995 = true;
					Class398.method4898(Class63.aClass63_710, (byte) 0);
					break;
				}
			}
		}
		if (Class303.aClass303_3416 == Class483.aClass303_5431) {
			if (null == Class290.aClass426_3223)
				Class290.aClass426_3223 = new Class426(Class176.aClass460_1936, Class183_Sub2.aClass449_9812, Class246.aClass466_2473, Class72.GRAB_PUBLIC_EXPONENT, Class72.GRAB_PUBLIC_MODULUS);
			if (!Class290.aClass426_3223.method5122((byte) -87))
				return 0;
			Class656.method7945(0, null, true, (byte) -19);
			aBool3466 = !Class175.method2451((byte) 15);
			InputStream_Sub1.aClass461_10979 = Class30.method785((aBool3466 ? Class46.aClass46_559 : Class46.aClass46_572), false, 1, true, true, (byte) -31);
			Class161.aClass461_1770 = Class30.method785(Class46.aClass46_558, false, 1, true, true, (byte) -90);
			Class710_Sub43.aClass461_10940 = Class30.method785(Class46.aClass46_539, false, 1, true, true, (byte) -39);
			Class184_Sub2.aClass461_9443 = Class30.method785(Class46.aClass46_532, true, 1, true, true, (byte) -62);
		}
		if (Class483.aClass303_5431 == Class303.aClass303_3415) {
			boolean bool = Class161.aClass461_1770.method5561(-1376011786);
			boolean bool_1_ = Class184_Sub2.aClass461_9443.method5561(-1376011786);
			int i = Class275.aClass459_Sub1Array3024[Class46.aClass46_558.method903(-550413157)].method9232((byte) 81);
			i = i + Class275.aClass459_Sub1Array3024[(aBool3466 ? Class46.aClass46_559.method903(561001597) : Class46.aClass46_572.method903(-526800832))].method9232((byte) 37);
			i += Class275.aClass459_Sub1Array3024[Class46.aClass46_539.method903(-1037879971)].method9232((byte) 120);
			i = i + (bool_1_ ? 100 : Class184_Sub2.aClass461_9443.method5563(1521097131));
			i = i + (bool ? 100 : Class161.aClass461_1770.method5563(38645376));
			if (500 != i)
				return i / 5;
			Class644.aClass628_8352 = new Class628(Class184_Sub2.aClass461_9443);
			Class594.method7127(Class644.aClass628_8352, 1992429284);
			int i_2_ = Class710.aClass536_Sub40_8843.aClass710_Sub31_10782.method10186(-1862394991);
			Class708.aClass87_8824 = new Class87(client.aClass670_11043, Class459.aClass664_5178, Class161.aClass461_1770);
			Class88[] class88s = Class708.aClass87_8824.method1207(i_2_, -1411037171);
			if (0 == class88s.length)
				class88s = Class708.aClass87_8824.method1207(0, -1411037171);
			Class322 class322 = new Class322(InputStream_Sub1.aClass461_10979, Class710_Sub43.aClass461_10940);
			if (class88s.length > 0) {
				anInterface30Array3473 = new Interface30[class88s.length];
				for (int i_3_ = 0; i_3_ < anInterface30Array3473.length; i_3_++)
					anInterface30Array3473[i_3_] = new Class291((Class708.aClass87_8824.method1206(1764439391 * class88s[i_3_].anInt877, (byte) 9)), -1366497531 * class88s[i_3_].anInt878, class88s[i_3_].anInt876 * 1111462391, class322);
			}
		}
		if (Class483.aClass303_5431 == Class303.aClass303_3409)
			Class196.aClass410_2202 = new Class410(Class677.aClass167_8609, InputStream_Sub1.aClass461_10979, Class710_Sub43.aClass461_10940, Class308.method4135(648600930));
		if (Class483.aClass303_5431 == Class303.aClass303_3410) {
			int i = Class196.aClass410_2202.method4985(1856003531);
			int i_4_ = Class196.aClass410_2202.method4978(1471717342);
			if (i < i_4_)
				return 100 * i / i_4_;
		}
		if (Class303.aClass303_3411 == Class483.aClass303_5431) {
			if (anInterface30Array3473 != null && anInterface30Array3473.length > 0) {
				if (anInterface30Array3473[0].method171(-2022548450) < 100)
					return 0;
				if (anInterface30Array3473.length > 1 && Class708.aClass87_8824.method1208(1033774051) && anInterface30Array3473[1].method171(-1322515546) < 100)
					return 0;
			}
			Class196.aClass410_2202.method4976(client.anInterface51_11196, 1846004377);
			Class199.method2908(Class677.aClass167_8609, -1957399830);
			Class673.method8026(15, -1798113843);
		}
		if (Class483.aClass303_5431 == Class303.aClass303_3408) {
			Class398.aClass461_4122 = Class30.method785(Class46.aClass46_557, false, 1, false, true, (byte) -20);
			Class529_Sub1.aClass461_10283 = Class30.method785(Class46.aClass46_571, false, 1, false, true, (byte) -119);
			Class586.aClass461_7709 = Class30.method785(Class46.aClass46_531, false, 1, false, true, (byte) -122);
			Class205_Sub9.aClass461_9887 = Class30.method785(Class46.aClass46_533, false, 1, true, true, (byte) -47);
			Class247_Sub1.aClass461_9968 = Class30.method785(Class46.aClass46_556, false, 1, true, true, (byte) -49);
			Class318.aClass461_3526 = Class30.method785(Class46.aClass46_538, false, 1, true, true, (byte) -77);
			Class116.aClass461_1432 = Class30.method785(Class46.aClass46_534, true, 1, false, true, (byte) 2);
			Class602.aClass461_7857 = Class30.method785(Class46.aClass46_535, false, 1, false, true, (byte) -15);
			Class279.aClass461_3162 = Class30.method785(Class46.aClass46_564, true, 1, false, true, (byte) -50);
			Class65.aClass461_719 = Class30.method785(Class46.aClass46_565, true, 1, false, true, (byte) -8);
			Class395.aClass461_4109 = Class30.method785(Class46.aClass46_537, false, 1, false, true, (byte) 2);
			Class649_Sub1_Sub4_Sub2.aClass461_12021 = Class30.method785(Class46.aClass46_530, false, 1, true, true, (byte) -71);
			Class206_Sub1.aClass461_10024 = Class30.method785(Class46.aClass46_553, true, 1, false, false, (byte) -37);
			Class14.aClass461_164 = Class30.method785(Class46.aClass46_561, true, 1, false, false, (byte) -69);
			Class214.aClass461_2301 = Class30.method785(Class46.aClass46_541, false, 1, true, true, (byte) -23);
			Class303.aClass461_3432 = Class30.method785(Class46.aClass46_542, false, 1, true, true, (byte) -23);
			Class214.aClass461_2302 = Class30.method785(Class46.aClass46_563, false, 1, true, true, (byte) -14);
			Class154.aClass461_1720 = Class30.method785(Class46.aClass46_573, false, 1, true, true, (byte) -72);
			Class20.aClass461_215 = Class30.method785(Class46.aClass46_545, false, 1, true, true, (byte) -111);
			Class218.aClass461_2308 = Class30.method785(Class46.aClass46_546, false, 1, true, true, (byte) -4);
			Class397.aClass461_4114 = Class30.method785(Class46.aClass46_547, false, 1, true, true, (byte) -40);
			Class613.aClass461_8013 = Class30.method785(Class46.aClass46_552, true, 1, false, false, (byte) -29);
			Class622.aClass461_8129 = Class30.method785(Class46.aClass46_562, true, 1, false, true, (byte) -48);
			Class576.aClass461_7687 = Class30.method785(Class46.aClass46_549, false, 1, true, true, (byte) -105);
			Class711.aClass461_8849 = Class30.method785(Class46.aClass46_575, false, 1, true, true, (byte) -15);
			Class590.aClass461_7789 = Class30.method785(Class46.aClass46_551, true, 1, true, true, (byte) -22);
			Class550_Sub1.aClass461_10617 = Class30.method785(Class46.aClass46_544, false, 1, true, true, (byte) 1);
			Class271.aClass461_2886 = Class30.method785(Class46.aClass46_540, false, 1, true, true, (byte) -26);
			Class98_Sub1_Sub1.aClass461_11326 = Class30.method785(Class46.aClass46_548, true, 1, false, true, (byte) -43);
			Class460.aClass461_5203 = Class30.method785(Class46.aClass46_555, true, 1, false, true, (byte) -120);
			Class540.aClass461_7161 = Class30.method785(Class46.aClass46_536, true, 1, true, true, (byte) -83);
		}
		if (Class483.aClass303_5431 == Class303.aClass303_3423) {
			int i = 0;
			int i_5_ = 0;
			for (int i_6_ = 0; i_6_ < Class275.aClass459_Sub1Array3024.length; i_6_++) {
				if (Class275.aClass459_Sub1Array3024[i_6_] != null) {
					i += Class275.aClass459_Sub1Array3024[i_6_].method9232((byte) 44);
					i_5_++;
				}
			}
			if (i_5_ > 0)
				i /= i_5_;
			if (100 != i) {
				if (anInt3474 * -716548019 < 0)
					anInt3474 = 904962181 * i;
				return (100 * (i - -716548019 * anInt3474) / (100 - -716548019 * anInt3474));
			}
			Class556.method6807(Class644.aClass628_8352, -1029534002);
			Class196.aClass410_2202 = new Class410(Class677.aClass167_8609, Class398.aClass461_4122, Class710_Sub43.aClass461_10940, Class308.method4135(648600930));
		}
		if (Class303.aClass303_3414 == Class483.aClass303_5431) {
			byte[] is = Class184_Sub2.aClass461_9443.method5595(((Class633.aClass633_8248.anInt8258) * -848473139), -1374589956);
			if (is == null)
				return 0;
			Class184_Sub2.aClass211_9442 = new Class211();
			Class184_Sub2.aClass211_9442.method3038(50, 7340032, -1984187068);
			Class309.method4154(is, -2122539856);
			Class673.method8026(12, -1798113843);
		}
		if (Class483.aClass303_5431 == Class303.aClass303_3413 && null == Class399.aClass530_4128) {
			Class399.aClass530_4128 = new Class530(Class460.aClass461_5203);
			Class267.method3702(Class399.aClass530_4128, (byte) 32);
		}
		if (Class303.aClass303_3407 == Class483.aClass303_5431) {
			int i = Class405.method4938(1299553012);
			if (i < 100)
				return i;
			Class388.method4849((Class184_Sub2.aClass461_9443.method5595((Class633.aClass633_8257.anInt8258 * -848473139), -1262516097)), (byte) -68);
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
			if (183673691 * Class644.aClass628_8352.anInt8197 != -1 && !Class602.aClass461_7857.method5558((183673691 * (Class644.aClass628_8352.anInt8197)), 0, -2011432431))
				return 99;
			Class710_Sub26.aClass174_10892 = new Class174(Class590.aClass461_7789);
			Class175.anInterface24_1935 = new Class173_Sub1(Class279.aClass461_3162, Class65.aClass461_719);
			Class207.aClass34_Sub22_2244 = new Class34_Sub22(client.aClass670_11043, Class459.aClass664_5178, Class205_Sub9.aClass461_9887);
			Class497.aClass34_Sub16_5554 = new Class34_Sub16(client.aClass670_11043, Class459.aClass664_5178, Class205_Sub9.aClass461_9887);
			Class580.aClass34_Sub19_7695 = new Class34_Sub19(client.aClass670_11043, Class459.aClass664_5178, Class205_Sub9.aClass461_9887, Class398.aClass461_4122);
			Class228.aClass34_2360 = new Class34(client.aClass670_11043, Class459.aClass664_5178, Class205_Sub9.aClass461_9887, Class648.aClass648_8418, 64, new Class58(com.jagex.Class14.class));
			Class205_Sub17.aClass34_9949 = new Class34(client.aClass670_11043, Class459.aClass664_5178, Class205_Sub9.aClass461_9887, Class648.aClass648_8417, 16, new Class58(com.jagex.Class92.class));
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
			Class266.aClass503_2867.method6049(new Class34_Sub17(client.aClass670_11043, Class459.aClass664_5178, true, Class214.aClass461_2301, Class602.aClass461_7857), -111171910);
			Class398_Sub1.aClass34_Sub8_10110 = new Class34_Sub8(client.aClass670_11043, Class459.aClass664_5178, Class205_Sub9.aClass461_9887, Class398.aClass461_4122);
			Class602.aClass34_Sub1_7856 = new Class34_Sub1(client.aClass670_11043, Class459.aClass664_5178, Class205_Sub9.aClass461_9887, Class398.aClass461_4122);
			Class172.aClass34_Sub7_1922 = new Class34_Sub7(client.aClass670_11043, Class459.aClass664_5178, true, Class214.aClass461_2302, Class602.aClass461_7857);
			Class111.aClass34_Sub13_1391 = new Class34_Sub13(client.aClass670_11043, Class459.aClass664_5178, true, Class207.aClass34_Sub22_2244, Class154.aClass461_1720, Class602.aClass461_7857);
			Class38.aClass53_Sub2_481 = new Class53_Sub2(client.aClass670_11043, Class459.aClass664_5178, Class205_Sub9.aClass461_9887, true);
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
			Class622.aMap8128 = Class449.method5420((new Class98_Sub1[] { Class309.aClass98_Sub1_Sub2_3465, Class532.aClass98_Sub1_Sub1_7122, Class678.aClass98_Sub1_Sub2_8625, (Class536_Sub19.aClass98_Sub1_Sub2_10519), Class446.aClass98_Sub1_Sub2_4902, Class333.aClass98_Sub1_Sub2_3622, (Class458_Sub2.aClass98_Sub1_Sub2_10306) }), (byte) 65);
			Class56.aClass34_Sub14_608 = new Class34_Sub14(client.aClass670_11043, Class459.aClass664_5178, Class205_Sub9.aClass461_9887, Class622.aMap8128);
			Class464.anInterface20_5230 = new Class294();
			Class197.method2869(Class318.aClass461_3526, Class602.aClass461_7857, Class398.aClass461_4122, Class710_Sub43.aClass461_10940, -22093907);
			Class53.aClass385_598 = new Class385(Class271.aClass461_2886);
			Class237.aClass396_2422 = new Class396(Class550_Sub1.aClass461_10617);
			Class402.aClass397_4204 = new Class397(Class550_Sub1.aClass461_10617);
			Class39.aClass450_490 = new Class450(Class459.aClass664_5178, Class576.aClass461_7687, Class711.aClass461_8849);
			Class198.aClass32_2216 = new Class32(Class459.aClass664_5178, Class576.aClass461_7687, Class711.aClass461_8849, new Class389());
			Class465_Sub1.aClass96_10352 = new Class96(Class532.aClass98_Sub1_Sub1_7122, Class56.aClass34_Sub14_608, Class611.aClass602_7930.method7173(1469612243));
			Class184.method2769(1766275376);
			Class69.method1094(Class45.aClass34_Sub11_529, (byte) -88);
			Class160.method1963(Class402.aClass397_4204, Class237.aClass396_2422, 1709291521);
			Class652.method7868(Class602.aClass461_7857, Class710_Sub26.aClass174_10892, Class175.anInterface24_1935, -1292180565);
			Class282 class282 = new Class282(Class395.aClass461_4109.method5609("huffman", "", -6855510));
			Class390.method4855(class282, -1695021445);
			Class505.aClass504_6883 = Class449.method5423(-1600254925);
			Class458_Sub4.aClass536_Sub38_10336 = new Class536_Sub38(true);
		}
		if (Class483.aClass303_5431 == Class303.aClass303_3418) {
			int i = (Class635.method7565(Class398.aClass461_4122, (byte) -13) + Class196.aClass410_2202.method4979(true, (byte) -1));
			int i_7_ = (Class167.method2412(2097888879) + Class196.aClass410_2202.method4978(1558792313));
			if (i < i_7_)
				return i * 100 / i_7_;
		}
		if (Class303.aClass303_3419 == Class483.aClass303_5431)
			Class542.method6556(Class613.aClass461_8013, Class622.aClass461_8129, Class654.aClass34_Sub4_8494, Class279.aClass34_Sub3_3163, client.aClass515_11066.method6280(-1073841494), Class398_Sub1.aClass34_Sub8_10110, Class602.aClass34_Sub1_7856, Class465_Sub1.aClass96_10352, Class465_Sub1.aClass96_10352);
		if (Class303.aClass303_3420 == Class483.aClass303_5431) {
			Class590.aClass147_Sub1_7791 = new Class147_Sub1(Class309.aClass98_Sub1_Sub2_3465);
			Class144.method1790(-842664029);
			Class218.aClass66_2307 = Class456.method5483(-1538387421);
			Class116.aClass461_1432.method5569(false, true, (byte) -30);
			Class398.aClass461_4122.method5569(true, true, (byte) 64);
			Class710_Sub43.aClass461_10940.method5569(true, true, (byte) -57);
			Class395.aClass461_4109.method5569(true, true, (byte) 91);
			client.aBool11103 = true;
		}
		if (Class483.aClass303_5431 == Class303.aClass303_3421 && Class644.aClass628_8352.anInt8195 * 1657790451 != -1) {
			if (!Class644.method7794((1657790451 * Class644.aClass628_8352.anInt8195), null, 1544319225))
				return 0;
			boolean bool = true;
			for (int i = 0; i < (Class463.aClass234Array5227[1657790451 * Class644.aClass628_8352.anInt8195].aClass251Array2378).length; i++) {
				IComponentDefinitions class251 = (Class463.aClass234Array5227[1657790451 * Class644.aClass628_8352.anInt8195].aClass251Array2378[i]);
				if (1049444347 * class251.anInt2728 == 5 && -1 != class251.graphicId * -1307221069 && !Class398.aClass461_4122.method5558((-1307221069 * (class251.graphicId)), 0, 758234553))
					bool = false;
			}
			if (!bool)
				return 0;
		}
		if (Class483.aClass303_5431 == Class303.aClass303_3422)
			Class106.method1427(true, -1410441324);
		if (Class483.aClass303_5431 == Class303.aClass303_3428) {
			Class192.aClass292_2177.method3941((short) -6469);
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
			anInterface30Array3473 = null;
			Class211.aMap2292.remove(Class46.aClass46_558);
			Class211.aMap2292.remove(Class46.aClass46_572);
			Class211.aMap2292.remove(Class46.aClass46_559);
			Class287.method3911(-2013398097);
			client.aBool10994 = Class710.aClass536_Sub40_8843.aClass710_Sub39_10783.method10236(-2002789891) == 1;
			Class710.aClass536_Sub40_8843.method9857((Class710.aClass536_Sub40_8843.aClass710_Sub39_10783), 1, (byte) 1);
			if (client.aBool10994)
				Class710.aClass536_Sub40_8843.method9857(Class710.aClass536_Sub40_8843.aClass710_Sub15_10766, 0, (byte) 1);
			else if ((Class710.aClass536_Sub40_8843.aClass710_Sub15_10766.aBool10858) && (Class458_Sub4.aClass536_Sub38_10336.anInt10684 * -853108975) < 512 && 0 != -853108975 * (Class458_Sub4.aClass536_Sub38_10336.anInt10684))
				Class710.aClass536_Sub40_8843.method9857(Class710.aClass536_Sub40_8843.aClass710_Sub15_10766, 0, (byte) 1);
			Class27.method763(1875283710);
			if (client.aBool10994) {
				Class704.method8264(0, false, (byte) 59);
				if (!client.aBool10995)
					Class398.method4898(Class63.aClass63_711, (byte) 0);
			} else {
				Class704.method8264(Class710.aClass536_Sub40_8843.aClass710_Sub15_10766.method10071(446805643), false, (byte) 19);
				if (Class710.aClass536_Sub40_8843.aClass710_Sub15_10766.method10071(1241864966) == 0)
					Class398.method4898(Class63.aClass63_712, (byte) 0);
			}
			Class15.method640(Class710.aClass536_Sub40_8843.aClass710_Sub12_10769.method10038(-750028542), -1, -1, false, -1162135281);
			Class196.aClass410_2202.method4976(client.anInterface51_11196, 1843224982);
			Class199.method2908(Class677.aClass167_8609, -1919708355);
			Class536_Sub34.method9816(Class677.aClass167_8609, Class398.aClass461_4122, (byte) 0);
		}
		return Class248.method3444(-790193575);
	}

	static void method4169() {
		if (null != Class483.aClass303_5431) {
			Class192.aClass292_2177 = new Class292();
			Class192.aClass292_2177.method3935(Class34_Sub14.aLong10970 * -1422508675219242683L, Class483.aClass303_5431.aClass38_3426.method840(Class459.aClass664_5178, 1554575676), Class483.aClass303_5431.aClass38_3426.method840(Class459.aClass664_5178, 1576640265), -1949228175 * Class483.aClass303_5431.anInt3431, Class483.aClass303_5431, 1758788492);
			Class94.aThread1148 = new Thread(Class192.aClass292_2177, "");
			Class94.aThread1148.start();
		}
	}

	static void method4170() {
		Class6 class6 = Class153_Sub1.method8383("2", client.aClass670_11043.aString8573, false, 1951924385);
		Class590.aClass147_Sub1_7791.method8407(class6, (byte) 49);
	}

	public static void method4171() {
		if (null != Class192.aClass292_2177)
			Class192.aClass292_2177.method3941((short) 894);
		if (Class94.aThread1148 != null) {
			for (;;) {
				try {
					Class94.aThread1148.join();
					break;
				} catch (InterruptedException interruptedexception) {
					/* empty */
				}
			}
		}
	}

	public static boolean method4172() {
		return aBool3471;
	}

	static final void method4173(Class668 class668, byte i) {
		class668.anInt8542 -= 61855783;
		if (Class683.aClass301_Sub1_8651.method4062(1456032593) != Class300.aClass300_3357)
			throw new RuntimeException();
		((Class706_Sub3) Class683.aClass301_Sub1_8651.method4052(-810172525)).method10282(class668.anIntArray8541[class668.anInt8542 * 1867269829], class668.anIntArray8541[1 + class668.anInt8542 * 1867269829], class668.anIntArray8541[2 + 1867269829 * class668.anInt8542], (byte) -18);
	}

	static final void method4174(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
	}

	static final void method4175(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = (client.aClass251_11195 == null ? -1 : -1591767037 * client.aClass251_11195.anInt2559);
	}

	public static void method4176(Class691 class691, Frame frame, byte i) {
		class691.method8190(-1739343851);
		frame.setVisible(false);
		frame.dispose();
	}

	static final void method4177(long l) {
		try {
			Thread.sleep(l);
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	static void method4178(int i, String string, int i_8_) {
		Class536_Sub18_Sub5 class536_sub18_sub5 = Class34_Sub11.method10334(2, (long) i);
		class536_sub18_sub5.method10659(1542410340);
		class536_sub18_sub5.aString11649 = string;
	}
}
