/* Class105 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.File;

public class Class105 {
	static int anInt1294;
	static byte[] aByteArray1295;
	static Class47[] aClass47Array1296;
	static final int anInt1297 = 2;
	static RSByteBuffer[] aClass527_Sub38Array1298;
	static byte[] aByteArray1299;
	public static int anInt1300;
	static int[] anIntArray1301;
	static int anInt1302;
	static int[] anIntArray1303;
	static final int anInt1304 = 1;
	static RSByteBuffer[] aClass527_Sub38Array1305;
	static int[] anIntArray1306;
	static boolean $assertionsDisabled = !com.jagex.Class105.class.desiredAssertionStatus();
	static File aFile1307;
	static int anInt1308;
	public static Class45 aClass45_1309;
	public static int anInt1310;

	static {
		aByteArray1295 = new byte[2048];
		aByteArray1299 = new byte[2048];
		aClass527_Sub38Array1298 = new RSByteBuffer[2048];
		aClass527_Sub38Array1305 = new RSByteBuffer[2048];
		anInt1300 = 0;
		anIntArray1301 = new int[2048];
		anInt1302 = 0;
		anIntArray1303 = new int[2048];
		aClass47Array1296 = new Class47[2048];
		anInt1294 = 0;
		anIntArray1306 = new int[2048];
	}

	static void method1810() {
		anInt1300 = 0;
		for (int i = 0; i < 2048; i++) {
			aClass527_Sub38Array1298[i] = null;
			aClass527_Sub38Array1305[i] = null;
			aByteArray1299[i] = Class679.aClass679_8622.aByte8627;
			aClass47Array1296[i] = null;
		}
	}

	static boolean method1811(Class527_Sub38_Sub2 class527_sub38_sub2, int i) {
		int i_0_ = class527_sub38_sub2.method18469(2, -1528697743);
		if (i_0_ == 0) {
			if (class527_sub38_sub2.method18469(1, -329240800) != 0)
				Class522_Sub6.method15992(class527_sub38_sub2, i, 1429311990);
			int i_1_ = class527_sub38_sub2.method18469(6, 82306602);
			int i_2_ = class527_sub38_sub2.method18469(6, -1567573751);
			boolean bool = class527_sub38_sub2.method18469(1, -1853821412) == 1;
			if (bool)
				anIntArray1306[(anInt1294 += -1816171541) * -673487677 - 1] = i;
			if (client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[i] != null)
				throw new RuntimeException();
			Class47 class47 = aClass47Array1296[i];
			Class640_Sub1_Sub2_Sub1_Sub2 class640_sub1_sub2_sub1_sub2 = (client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[i] = (new Class640_Sub1_Sub2_Sub1_Sub2(client.aClass509_11072.method8314(-1051694213))));
			class640_sub1_sub2_sub1_sub2.anInt11955 = i * 1587877927;
			if (null != aClass527_Sub38Array1298[i])
				class640_sub1_sub2_sub1_sub2.method18873(aClass527_Sub38Array1298[i], 348521444);
			if (aClass527_Sub38Array1305[i] != null)
				class640_sub1_sub2_sub1_sub2.method18874(aClass527_Sub38Array1305[i], -1720390257);
			class640_sub1_sub2_sub1_sub2.method18528(358090743 * class47.anInt496, true, -2077501541);
			class640_sub1_sub2_sub1_sub2.anInt11910 = -1143379759 * class47.anInt495;
			int i_3_ = class47.anInt497 * 924471349;
			int i_4_ = i_3_ >> 28;
			int i_5_ = i_3_ >> 14 & 0xff;
			int i_6_ = i_3_ & 0xff;
			Class592 class592 = client.aClass509_11072.method8283((short) 27434);
			int i_7_ = (i_5_ << 6) + i_1_ - 153371143 * class592.anInt7798;
			int i_8_ = (i_6_ << 6) + i_2_ - class592.anInt7799 * -2029646807;
			class640_sub1_sub2_sub1_sub2.aClass210_12185 = class47.aClass210_498;
			class640_sub1_sub2_sub1_sub2.aBool12180 = class47.aBool499;
			class640_sub1_sub2_sub1_sub2.aByteArray11945[0] = aByteArray1299[i];
			class640_sub1_sub2_sub1_sub2.aByte10864 = class640_sub1_sub2_sub1_sub2.aByte10862 = (byte) i_4_;
			if (client.aClass509_11072.method8359(790391449).method7706(i_7_, i_8_, (short) 25644))
				class640_sub1_sub2_sub1_sub2.aByte10862++;
			class640_sub1_sub2_sub1_sub2.method18886(i_7_, i_8_, -832757756);
			aClass47Array1296[i] = null;
			return true;
		}
		if (i_0_ == 1) {
			int i_9_ = class527_sub38_sub2.method18469(2, -507985745);
			int i_10_ = 924471349 * aClass47Array1296[i].anInt497;
			aClass47Array1296[i].anInt497 = 224559645 * (((i_9_ + (i_10_ >> 28) & 0x3) << 28) + (i_10_ & 0xfffffff));
			return false;
		}
		if (i_0_ == 2) {
			int i_11_ = class527_sub38_sub2.method18469(5, 1178942959);
			int i_12_ = i_11_ >> 3 & 0x3;
			int i_13_ = i_11_ & 0x7;
			int i_14_ = 924471349 * aClass47Array1296[i].anInt497;
			if (!$assertionsDisabled && (aByteArray1299[i] < 0 || aByteArray1299[i] > 3))
				throw new AssertionError();
			int i_15_ = i_12_ + (i_14_ >> 28) & 0x3;
			int i_16_ = i_14_ >> 14 & 0xff;
			int i_17_ = i_14_ & 0xff;
			if (0 == i_13_) {
				i_16_--;
				i_17_--;
			}
			if (i_13_ == 1)
				i_17_--;
			if (i_13_ == 2) {
				i_16_++;
				i_17_--;
			}
			if (i_13_ == 3)
				i_16_--;
			if (i_13_ == 4)
				i_16_++;
			if (5 == i_13_) {
				i_16_--;
				i_17_++;
			}
			if (i_13_ == 6)
				i_17_++;
			if (7 == i_13_) {
				i_16_++;
				i_17_++;
			}
			Class26.method858(Class679.method13904(673878859), aByteArray1299[i], -732896362);
			aClass47Array1296[i].anInt497 = (i_17_ + ((i_15_ << 28) + (i_16_ << 14))) * 224559645;
			return false;
		}
		int i_18_ = class527_sub38_sub2.method18469(20, 2058247524);
		int i_19_ = i_18_ >> 18 & 0x3;
		int i_20_ = i_18_ >> 16 & 0x3;
		int i_21_ = i_18_ >> 8 & 0xff;
		int i_22_ = i_18_ & 0xff;
		int i_23_ = 924471349 * aClass47Array1296[i].anInt497;
		aByteArray1299[i] = (byte) (i_19_ - 1);
		if (!$assertionsDisabled && (aByteArray1299[i] < 0 || aByteArray1299[i] > 3))
			throw new AssertionError();
		int i_24_ = (i_23_ >> 28) + i_20_ & 0x3;
		int i_25_ = (i_23_ >> 14) + i_21_ & 0xff;
		int i_26_ = i_23_ + i_22_ & 0xff;
		Class26.method858(Class679.method13904(673878859), i_19_ - 1, 252388529);
		aClass47Array1296[i].anInt497 = 224559645 * ((i_24_ << 28) + (i_25_ << 14) + i_26_);
		return false;
	}

	static final void method1812(Class527_Sub38_Sub2 class527_sub38_sub2) {
		class527_sub38_sub2.method18450(1989650342);
		int i = -899375681 * client.anInt11070;
		Class640_Sub1_Sub2_Sub1_Sub2 class640_sub1_sub2_sub1_sub2 = (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937 = client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[i] = new Class640_Sub1_Sub2_Sub1_Sub2(client.aClass509_11072.method8314(653410972)));
		class640_sub1_sub2_sub1_sub2.anInt11955 = 1587877927 * i;
		int i_27_ = class527_sub38_sub2.method18469(30, -1867037849);
		byte i_28_ = (byte) (i_27_ >> 28);
		int i_29_ = i_27_ >> 14 & 0x3fff;
		int i_30_ = i_27_ & 0x3fff;
		Class592 class592 = client.aClass509_11072.method8283((short) 24368);
		class640_sub1_sub2_sub1_sub2.anIntArray11902[0] = i_29_ - class592.anInt7798 * 153371143;
		class640_sub1_sub2_sub1_sub2.anIntArray11944[0] = i_30_ - -2029646807 * class592.anInt7799;
		class640_sub1_sub2_sub1_sub2.method10619((float) ((class640_sub1_sub2_sub1_sub2.anIntArray11902[0] << 9) + (class640_sub1_sub2_sub1_sub2.method18564(-1627926476) << 8)), (class640_sub1_sub2_sub1_sub2.method10613().aClass442_4927.aFloat4915), (float) ((class640_sub1_sub2_sub1_sub2.anIntArray11944[0] << 9) + (class640_sub1_sub2_sub1_sub2.method18564(-1547160476) << 8)));
		Class673.anInt8585 = (class640_sub1_sub2_sub1_sub2.aByte10864 = class640_sub1_sub2_sub1_sub2.aByte10862 = i_28_) * 706975839;
		if (client.aClass509_11072.method8359(843893043).method7706(class640_sub1_sub2_sub1_sub2.anIntArray11902[0], class640_sub1_sub2_sub1_sub2.anIntArray11944[0], (short) 4349))
			class640_sub1_sub2_sub1_sub2.aByte10862++;
		if (aClass527_Sub38Array1298[i] != null)
			class640_sub1_sub2_sub1_sub2.method18873(aClass527_Sub38Array1298[i], 348521444);
		if (aClass527_Sub38Array1305[i] != null)
			class640_sub1_sub2_sub1_sub2.method18874(aClass527_Sub38Array1305[i], -1720390257);
		anInt1300 = 0;
		anIntArray1301[(anInt1300 += -858376649) * 351100807 - 1] = i;
		aByteArray1295[i] = (byte) 0;
		anInt1302 = 0;
		for (int i_31_ = 1; i_31_ < 2048; i_31_++) {
			if (i != i_31_) {
				int i_32_ = class527_sub38_sub2.method18469(18, -575191189);
				int i_33_ = i_32_ >> 16 & 0x3;
				int i_34_ = i_32_ >> 8 & 0xff;
				int i_35_ = i_32_ & 0xff;
				Class47 class47 = aClass47Array1296[i_31_] = new Class47();
				class47.anInt497 = 224559645 * (i_35_ + ((i_33_ << 28) + (i_34_ << 14)));
				class47.anInt496 = 0;
				class47.anInt495 = -1031003831;
				class47.aClass210_498 = Class210.aClass210_2251;
				class47.aBool499 = false;
				anIntArray1303[(anInt1302 += 410783055) * 1242229167 - 1] = i_31_;
				aByteArray1295[i_31_] = (byte) 0;
			}
		}
		class527_sub38_sub2.method18452(1895193937);
		Class301 class301 = Class208_Sub10.aClass296_Sub1_9923.method5376((byte) 23);
		if (Class301.aClass301_3418 == class301) {
			Class327_Sub2 class327_sub2 = ((Class327_Sub2) Class208_Sub10.aClass296_Sub1_9923.method5372((byte) 0));
			class327_sub2.method15729((byte) -48);
		}
		Class309 class309 = Class208_Sub10.aClass296_Sub1_9923.method5378((byte) -27);
		if (class309 == Class309.aClass309_3455) {
			Class696_Sub3 class696_sub3 = ((Class696_Sub3) Class208_Sub10.aClass296_Sub1_9923.method5472(-1806601537));
			class696_sub3.method17233(702029658);
		}
	}

	static final void method1813(Class527_Sub38_Sub2 class527_sub38_sub2, int i) {
		anInt1294 = 0;
		Class534.method8955(class527_sub38_sub2, 985135659);
		Class109.method1980(class527_sub38_sub2, 2085036552);
		if (class527_sub38_sub2.anInt10689 * -441238943 != i)
			throw new RuntimeException(new StringBuilder().append(class527_sub38_sub2.anInt10689 * -441238943).append(" ").append(i).toString());
	}

	static final void method1814(Class527_Sub38_Sub2 class527_sub38_sub2) {
		int i = 0;
		class527_sub38_sub2.method18450(1772412368);
		for (int i_36_ = 0; i_36_ < 351100807 * anInt1300; i_36_++) {
			int i_37_ = anIntArray1301[i_36_];
			if (0 == (aByteArray1295[i_37_] & 0x1)) {
				if (i > 0) {
					i--;
					aByteArray1295[i_37_] |= 0x2;
				} else {
					int i_38_ = class527_sub38_sub2.method18469(1, -396583182);
					if (0 == i_38_) {
						i = Class614.method10175(class527_sub38_sub2, (byte) 104);
						aByteArray1295[i_37_] |= 0x2;
					} else
						Class220.method4071(class527_sub38_sub2, i_37_, -456655989);
				}
			}
		}
		class527_sub38_sub2.method18452(1875306706);
		if (0 != i)
			throw new RuntimeException();
		class527_sub38_sub2.method18450(1422384182);
		for (int i_39_ = 0; i_39_ < anInt1300 * 351100807; i_39_++) {
			int i_40_ = anIntArray1301[i_39_];
			if (0 != (aByteArray1295[i_40_] & 0x1)) {
				if (i > 0) {
					i--;
					aByteArray1295[i_40_] |= 0x2;
				} else {
					int i_41_ = class527_sub38_sub2.method18469(1, 2021225132);
					if (0 == i_41_) {
						i = Class614.method10175(class527_sub38_sub2, (byte) 116);
						aByteArray1295[i_40_] |= 0x2;
					} else
						Class220.method4071(class527_sub38_sub2, i_40_, -456655989);
				}
			}
		}
		class527_sub38_sub2.method18452(1993691848);
		if (0 != i)
			throw new RuntimeException();
		class527_sub38_sub2.method18450(1114272972);
		for (int i_42_ = 0; i_42_ < anInt1302 * 1242229167; i_42_++) {
			int i_43_ = anIntArray1303[i_42_];
			if (0 != (aByteArray1295[i_43_] & 0x1)) {
				if (i > 0) {
					i--;
					aByteArray1295[i_43_] |= 0x2;
				} else {
					int i_44_ = class527_sub38_sub2.method18469(1, -116947498);
					if (0 == i_44_) {
						i = Class614.method10175(class527_sub38_sub2, (byte) 123);
						aByteArray1295[i_43_] |= 0x2;
					} else if (Class522_Sub6.method15992(class527_sub38_sub2, i_43_, -123348812))
						aByteArray1295[i_43_] |= 0x2;
				}
			}
		}
		class527_sub38_sub2.method18452(1718358703);
		if (0 != i)
			throw new RuntimeException();
		class527_sub38_sub2.method18450(1438982442);
		for (int i_45_ = 0; i_45_ < 1242229167 * anInt1302; i_45_++) {
			int i_46_ = anIntArray1303[i_45_];
			if (0 == (aByteArray1295[i_46_] & 0x1)) {
				if (i > 0) {
					i--;
					aByteArray1295[i_46_] |= 0x2;
				} else {
					int i_47_ = class527_sub38_sub2.method18469(1, -1883110637);
					if (0 == i_47_) {
						i = Class614.method10175(class527_sub38_sub2, (byte) 106);
						aByteArray1295[i_46_] |= 0x2;
					} else if (Class522_Sub6.method15992(class527_sub38_sub2, i_46_, 575307999))
						aByteArray1295[i_46_] |= 0x2;
				}
			}
		}
		class527_sub38_sub2.method18452(1933571018);
		if (0 != i)
			throw new RuntimeException();
		anInt1300 = 0;
		anInt1302 = 0;
		for (int i_48_ = 1; i_48_ < 2048; i_48_++) {
			aByteArray1295[i_48_] >>= 1;
			Class640_Sub1_Sub2_Sub1_Sub2 class640_sub1_sub2_sub1_sub2 = client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[i_48_];
			if (null != class640_sub1_sub2_sub1_sub2)
				anIntArray1301[(anInt1300 += -858376649) * 351100807 - 1] = i_48_;
			else
				anIntArray1303[(anInt1302 += 410783055) * 1242229167 - 1] = i_48_;
		}
	}

	static final void method1815(Class527_Sub38_Sub2 class527_sub38_sub2) {
		int i = 0;
		class527_sub38_sub2.method18450(1802107284);
		for (int i_49_ = 0; i_49_ < 351100807 * anInt1300; i_49_++) {
			int i_50_ = anIntArray1301[i_49_];
			if (0 == (aByteArray1295[i_50_] & 0x1)) {
				if (i > 0) {
					i--;
					aByteArray1295[i_50_] |= 0x2;
				} else {
					int i_51_ = class527_sub38_sub2.method18469(1, 1746425655);
					if (0 == i_51_) {
						i = Class614.method10175(class527_sub38_sub2, (byte) 116);
						aByteArray1295[i_50_] |= 0x2;
					} else
						Class220.method4071(class527_sub38_sub2, i_50_, -456655989);
				}
			}
		}
		class527_sub38_sub2.method18452(1795615546);
		if (0 != i)
			throw new RuntimeException();
		class527_sub38_sub2.method18450(1211881775);
		for (int i_52_ = 0; i_52_ < anInt1300 * 351100807; i_52_++) {
			int i_53_ = anIntArray1301[i_52_];
			if (0 != (aByteArray1295[i_53_] & 0x1)) {
				if (i > 0) {
					i--;
					aByteArray1295[i_53_] |= 0x2;
				} else {
					int i_54_ = class527_sub38_sub2.method18469(1, 1352967474);
					if (0 == i_54_) {
						i = Class614.method10175(class527_sub38_sub2, (byte) 119);
						aByteArray1295[i_53_] |= 0x2;
					} else
						Class220.method4071(class527_sub38_sub2, i_53_, -456655989);
				}
			}
		}
		class527_sub38_sub2.method18452(2064907227);
		if (0 != i)
			throw new RuntimeException();
		class527_sub38_sub2.method18450(1224926563);
		for (int i_55_ = 0; i_55_ < anInt1302 * 1242229167; i_55_++) {
			int i_56_ = anIntArray1303[i_55_];
			if (0 != (aByteArray1295[i_56_] & 0x1)) {
				if (i > 0) {
					i--;
					aByteArray1295[i_56_] |= 0x2;
				} else {
					int i_57_ = class527_sub38_sub2.method18469(1, -901211918);
					if (0 == i_57_) {
						i = Class614.method10175(class527_sub38_sub2, (byte) 117);
						aByteArray1295[i_56_] |= 0x2;
					} else if (Class522_Sub6.method15992(class527_sub38_sub2, i_56_, -173224752))
						aByteArray1295[i_56_] |= 0x2;
				}
			}
		}
		class527_sub38_sub2.method18452(1655805825);
		if (0 != i)
			throw new RuntimeException();
		class527_sub38_sub2.method18450(1581108760);
		for (int i_58_ = 0; i_58_ < 1242229167 * anInt1302; i_58_++) {
			int i_59_ = anIntArray1303[i_58_];
			if (0 == (aByteArray1295[i_59_] & 0x1)) {
				if (i > 0) {
					i--;
					aByteArray1295[i_59_] |= 0x2;
				} else {
					int i_60_ = class527_sub38_sub2.method18469(1, -1713218813);
					if (0 == i_60_) {
						i = Class614.method10175(class527_sub38_sub2, (byte) 118);
						aByteArray1295[i_59_] |= 0x2;
					} else if (Class522_Sub6.method15992(class527_sub38_sub2, i_59_, 801798228))
						aByteArray1295[i_59_] |= 0x2;
				}
			}
		}
		class527_sub38_sub2.method18452(2014656873);
		if (0 != i)
			throw new RuntimeException();
		anInt1300 = 0;
		anInt1302 = 0;
		for (int i_61_ = 1; i_61_ < 2048; i_61_++) {
			aByteArray1295[i_61_] >>= 1;
			Class640_Sub1_Sub2_Sub1_Sub2 class640_sub1_sub2_sub1_sub2 = client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[i_61_];
			if (null != class640_sub1_sub2_sub1_sub2)
				anIntArray1301[(anInt1300 += -858376649) * 351100807 - 1] = i_61_;
			else
				anIntArray1303[(anInt1302 += 410783055) * 1242229167 - 1] = i_61_;
		}
	}

	static final void method1816(Class527_Sub38_Sub2 class527_sub38_sub2) {
		int i = 0;
		class527_sub38_sub2.method18450(1668986931);
		for (int i_62_ = 0; i_62_ < 351100807 * anInt1300; i_62_++) {
			int i_63_ = anIntArray1301[i_62_];
			if (0 == (aByteArray1295[i_63_] & 0x1)) {
				if (i > 0) {
					i--;
					aByteArray1295[i_63_] |= 0x2;
				} else {
					int i_64_ = class527_sub38_sub2.method18469(1, -926433108);
					if (0 == i_64_) {
						i = Class614.method10175(class527_sub38_sub2, (byte) 116);
						aByteArray1295[i_63_] |= 0x2;
					} else
						Class220.method4071(class527_sub38_sub2, i_63_, -456655989);
				}
			}
		}
		class527_sub38_sub2.method18452(1781831958);
		if (0 != i)
			throw new RuntimeException();
		class527_sub38_sub2.method18450(2036461947);
		for (int i_65_ = 0; i_65_ < anInt1300 * 351100807; i_65_++) {
			int i_66_ = anIntArray1301[i_65_];
			if (0 != (aByteArray1295[i_66_] & 0x1)) {
				if (i > 0) {
					i--;
					aByteArray1295[i_66_] |= 0x2;
				} else {
					int i_67_ = class527_sub38_sub2.method18469(1, 358203735);
					if (0 == i_67_) {
						i = Class614.method10175(class527_sub38_sub2, (byte) 108);
						aByteArray1295[i_66_] |= 0x2;
					} else
						Class220.method4071(class527_sub38_sub2, i_66_, -456655989);
				}
			}
		}
		class527_sub38_sub2.method18452(2086174185);
		if (0 != i)
			throw new RuntimeException();
		class527_sub38_sub2.method18450(1878475298);
		for (int i_68_ = 0; i_68_ < anInt1302 * 1242229167; i_68_++) {
			int i_69_ = anIntArray1303[i_68_];
			if (0 != (aByteArray1295[i_69_] & 0x1)) {
				if (i > 0) {
					i--;
					aByteArray1295[i_69_] |= 0x2;
				} else {
					int i_70_ = class527_sub38_sub2.method18469(1, -872036284);
					if (0 == i_70_) {
						i = Class614.method10175(class527_sub38_sub2, (byte) 105);
						aByteArray1295[i_69_] |= 0x2;
					} else if (Class522_Sub6.method15992(class527_sub38_sub2, i_69_, 686507428))
						aByteArray1295[i_69_] |= 0x2;
				}
			}
		}
		class527_sub38_sub2.method18452(1525045554);
		if (0 != i)
			throw new RuntimeException();
		class527_sub38_sub2.method18450(1420404344);
		for (int i_71_ = 0; i_71_ < 1242229167 * anInt1302; i_71_++) {
			int i_72_ = anIntArray1303[i_71_];
			if (0 == (aByteArray1295[i_72_] & 0x1)) {
				if (i > 0) {
					i--;
					aByteArray1295[i_72_] |= 0x2;
				} else {
					int i_73_ = class527_sub38_sub2.method18469(1, 695272983);
					if (0 == i_73_) {
						i = Class614.method10175(class527_sub38_sub2, (byte) 107);
						aByteArray1295[i_72_] |= 0x2;
					} else if (Class522_Sub6.method15992(class527_sub38_sub2, i_72_, 1399716124))
						aByteArray1295[i_72_] |= 0x2;
				}
			}
		}
		class527_sub38_sub2.method18452(1860888237);
		if (0 != i)
			throw new RuntimeException();
		anInt1300 = 0;
		anInt1302 = 0;
		for (int i_74_ = 1; i_74_ < 2048; i_74_++) {
			aByteArray1295[i_74_] >>= 1;
			Class640_Sub1_Sub2_Sub1_Sub2 class640_sub1_sub2_sub1_sub2 = client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[i_74_];
			if (null != class640_sub1_sub2_sub1_sub2)
				anIntArray1301[(anInt1300 += -858376649) * 351100807 - 1] = i_74_;
			else
				anIntArray1303[(anInt1302 += 410783055) * 1242229167 - 1] = i_74_;
		}
	}

	static int method1817(Class527_Sub38_Sub2 class527_sub38_sub2) {
		int i = class527_sub38_sub2.method18469(2, 2041977216);
		int i_75_;
		if (i == 0)
			i_75_ = 0;
		else if (i == 1)
			i_75_ = class527_sub38_sub2.method18469(5, 1785504040);
		else if (2 == i)
			i_75_ = class527_sub38_sub2.method18469(8, 1661824812);
		else
			i_75_ = class527_sub38_sub2.method18469(11, -1824212572);
		return i_75_;
	}

	static final void method1818(Class527_Sub38_Sub2 class527_sub38_sub2) {
		int i = 0;
		class527_sub38_sub2.method18450(1777500403);
		for (int i_76_ = 0; i_76_ < 351100807 * anInt1300; i_76_++) {
			int i_77_ = anIntArray1301[i_76_];
			if (0 == (aByteArray1295[i_77_] & 0x1)) {
				if (i > 0) {
					i--;
					aByteArray1295[i_77_] |= 0x2;
				} else {
					int i_78_ = class527_sub38_sub2.method18469(1, 245998985);
					if (0 == i_78_) {
						i = Class614.method10175(class527_sub38_sub2, (byte) 107);
						aByteArray1295[i_77_] |= 0x2;
					} else
						Class220.method4071(class527_sub38_sub2, i_77_, -456655989);
				}
			}
		}
		class527_sub38_sub2.method18452(1940765724);
		if (0 != i)
			throw new RuntimeException();
		class527_sub38_sub2.method18450(1626190939);
		for (int i_79_ = 0; i_79_ < anInt1300 * 351100807; i_79_++) {
			int i_80_ = anIntArray1301[i_79_];
			if (0 != (aByteArray1295[i_80_] & 0x1)) {
				if (i > 0) {
					i--;
					aByteArray1295[i_80_] |= 0x2;
				} else {
					int i_81_ = class527_sub38_sub2.method18469(1, -727556633);
					if (0 == i_81_) {
						i = Class614.method10175(class527_sub38_sub2, (byte) 113);
						aByteArray1295[i_80_] |= 0x2;
					} else
						Class220.method4071(class527_sub38_sub2, i_80_, -456655989);
				}
			}
		}
		class527_sub38_sub2.method18452(2000859136);
		if (0 != i)
			throw new RuntimeException();
		class527_sub38_sub2.method18450(1431147019);
		for (int i_82_ = 0; i_82_ < anInt1302 * 1242229167; i_82_++) {
			int i_83_ = anIntArray1303[i_82_];
			if (0 != (aByteArray1295[i_83_] & 0x1)) {
				if (i > 0) {
					i--;
					aByteArray1295[i_83_] |= 0x2;
				} else {
					int i_84_ = class527_sub38_sub2.method18469(1, 1551789231);
					if (0 == i_84_) {
						i = Class614.method10175(class527_sub38_sub2, (byte) 123);
						aByteArray1295[i_83_] |= 0x2;
					} else if (Class522_Sub6.method15992(class527_sub38_sub2, i_83_, 1656588067))
						aByteArray1295[i_83_] |= 0x2;
				}
			}
		}
		class527_sub38_sub2.method18452(1700805414);
		if (0 != i)
			throw new RuntimeException();
		class527_sub38_sub2.method18450(2140490866);
		for (int i_85_ = 0; i_85_ < 1242229167 * anInt1302; i_85_++) {
			int i_86_ = anIntArray1303[i_85_];
			if (0 == (aByteArray1295[i_86_] & 0x1)) {
				if (i > 0) {
					i--;
					aByteArray1295[i_86_] |= 0x2;
				} else {
					int i_87_ = class527_sub38_sub2.method18469(1, 1728265588);
					if (0 == i_87_) {
						i = Class614.method10175(class527_sub38_sub2, (byte) 116);
						aByteArray1295[i_86_] |= 0x2;
					} else if (Class522_Sub6.method15992(class527_sub38_sub2, i_86_, 182301328))
						aByteArray1295[i_86_] |= 0x2;
				}
			}
		}
		class527_sub38_sub2.method18452(1673832641);
		if (0 != i)
			throw new RuntimeException();
		anInt1300 = 0;
		anInt1302 = 0;
		for (int i_88_ = 1; i_88_ < 2048; i_88_++) {
			aByteArray1295[i_88_] >>= 1;
			Class640_Sub1_Sub2_Sub1_Sub2 class640_sub1_sub2_sub1_sub2 = client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[i_88_];
			if (null != class640_sub1_sub2_sub1_sub2)
				anIntArray1301[(anInt1300 += -858376649) * 351100807 - 1] = i_88_;
			else
				anIntArray1303[(anInt1302 += 410783055) * 1242229167 - 1] = i_88_;
		}
	}

	static int method1819(Class527_Sub38_Sub2 class527_sub38_sub2) {
		int i = class527_sub38_sub2.method18469(2, 476530563);
		int i_89_;
		if (i == 0)
			i_89_ = 0;
		else if (i == 1)
			i_89_ = class527_sub38_sub2.method18469(5, 1244289481);
		else if (2 == i)
			i_89_ = class527_sub38_sub2.method18469(8, 1202929770);
		else
			i_89_ = class527_sub38_sub2.method18469(11, 1893786565);
		return i_89_;
	}

	static final void method1820(Class527_Sub38_Sub2 class527_sub38_sub2, int i) {
		anInt1294 = 0;
		Class534.method8955(class527_sub38_sub2, 937183070);
		Class109.method1980(class527_sub38_sub2, 1634867907);
		if (class527_sub38_sub2.anInt10689 * -441238943 != i)
			throw new RuntimeException(new StringBuilder().append(class527_sub38_sub2.anInt10689 * -441238943).append(" ").append(i).toString());
	}

	static void method1821(Class527_Sub38_Sub2 class527_sub38_sub2, int i) {
		Class592 class592 = client.aClass509_11072.method8283((short) 6447);
		boolean bool = class527_sub38_sub2.method18469(1, -104107090) == 1;
		if (bool)
			anIntArray1306[(anInt1294 += -1816171541) * -673487677 - 1] = i;
		int i_90_ = class527_sub38_sub2.method18469(2, 401360106);
		Class640_Sub1_Sub2_Sub1_Sub2 class640_sub1_sub2_sub1_sub2 = client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[i];
		if (i_90_ == 0) {
			if (!bool) {
				if (client.anInt11070 * -899375681 == i)
					throw new RuntimeException();
				Class47 class47 = aClass47Array1296[i] = new Class47();
				Class679.method13904(673878859);
				class47.anInt497 = ((class640_sub1_sub2_sub1_sub2.aByte10864 << 28) + ((153371143 * class592.anInt7798 + class640_sub1_sub2_sub1_sub2.anIntArray11902[0]) >> 6 << 14) + ((class592.anInt7799 * -2029646807 + class640_sub1_sub2_sub1_sub2.anIntArray11944[0]) >> 6)) * 224559645;
				if (-1 != class640_sub1_sub2_sub1_sub2.anInt12178 * 294621047)
					class47.anInt496 = 712889473 * class640_sub1_sub2_sub1_sub2.anInt12178;
				else
					class47.anInt496 = class640_sub1_sub2_sub1_sub2.aClass61_11936.method1384((byte) 1) * -1598101049;
				class47.anInt495 = class640_sub1_sub2_sub1_sub2.anInt11910 * -17829839;
				class47.aClass210_498 = class640_sub1_sub2_sub1_sub2.aClass210_12185;
				class47.aBool499 = class640_sub1_sub2_sub1_sub2.aBool12180;
				if (class640_sub1_sub2_sub1_sub2.anInt12197 * 17034299 > 0)
					Class608.method10087(class640_sub1_sub2_sub1_sub2, -1636487871);
				client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[i] = null;
				if (class527_sub38_sub2.method18469(1, -1264069712) != 0)
					Class522_Sub6.method15992(class527_sub38_sub2, i, 1561338150);
			}
		} else if (1 == i_90_) {
			int i_91_ = class527_sub38_sub2.method18469(3, 451783101);
			int i_92_ = class527_sub38_sub2.method18469(1, -690990127);
			int i_93_ = class640_sub1_sub2_sub1_sub2.anIntArray11902[0];
			int i_94_ = class640_sub1_sub2_sub1_sub2.anIntArray11944[0];
			if (1 == i_92_) {
				aByteArray1299[i] = Class679.aClass679_8623.aByte8627;
				int i_95_ = class527_sub38_sub2.method18469(2, 1234361858);
				switch (i_95_) {
				case 3:
					class640_sub1_sub2_sub1_sub2.method18878(i_93_, i_94_ - 1, aByteArray1299[i], (byte) -112);
					break;
				case 1:
					class640_sub1_sub2_sub1_sub2.method18878(i_93_ - 1, i_94_, aByteArray1299[i], (byte) -9);
					break;
				case 2:
					class640_sub1_sub2_sub1_sub2.method18878(i_93_ + 1, i_94_, aByteArray1299[i], (byte) -72);
					break;
				case 0:
					class640_sub1_sub2_sub1_sub2.method18878(i_93_, 1 + i_94_, aByteArray1299[i], (byte) -88);
					break;
				}
			}
			if (0 == i_91_) {
				i_93_--;
				i_94_--;
			} else if (i_91_ == 1)
				i_94_--;
			else if (i_91_ == 2) {
				i_93_++;
				i_94_--;
			} else if (3 == i_91_)
				i_93_--;
			else if (i_91_ == 4)
				i_93_++;
			else if (5 == i_91_) {
				i_93_--;
				i_94_++;
			} else if (6 == i_91_)
				i_94_++;
			else if (7 == i_91_) {
				i_93_++;
				i_94_++;
			}
			class640_sub1_sub2_sub1_sub2.method18878(i_93_, i_94_, aByteArray1299[i], (byte) -58);
		} else if (2 == i_90_) {
			int i_96_ = class527_sub38_sub2.method18469(4, -402933954);
			int i_97_ = class640_sub1_sub2_sub1_sub2.anIntArray11902[0];
			int i_98_ = class640_sub1_sub2_sub1_sub2.anIntArray11944[0];
			if (0 == i_96_) {
				i_97_ -= 2;
				i_98_ -= 2;
			} else if (1 == i_96_) {
				i_97_--;
				i_98_ -= 2;
			} else if (2 == i_96_)
				i_98_ -= 2;
			else if (i_96_ == 3) {
				i_97_++;
				i_98_ -= 2;
			} else if (4 == i_96_) {
				i_97_ += 2;
				i_98_ -= 2;
			} else if (i_96_ == 5) {
				i_97_ -= 2;
				i_98_--;
			} else if (6 == i_96_) {
				i_97_ += 2;
				i_98_--;
			} else if (i_96_ == 7)
				i_97_ -= 2;
			else if (8 == i_96_)
				i_97_ += 2;
			else if (i_96_ == 9) {
				i_97_ -= 2;
				i_98_++;
			} else if (10 == i_96_) {
				i_97_ += 2;
				i_98_++;
			} else if (11 == i_96_) {
				i_97_ -= 2;
				i_98_ += 2;
			} else if (12 == i_96_) {
				i_97_--;
				i_98_ += 2;
			} else if (i_96_ == 13)
				i_98_ += 2;
			else if (14 == i_96_) {
				i_97_++;
				i_98_ += 2;
			} else if (i_96_ == 15) {
				i_97_ += 2;
				i_98_ += 2;
			}
			class640_sub1_sub2_sub1_sub2.method18878(i_97_, i_98_, aByteArray1299[i], (byte) -30);
		} else {
			int i_99_ = class527_sub38_sub2.method18469(1, -1901619252);
			if (0 == i_99_) {
				int i_100_ = class527_sub38_sub2.method18469(15, 1106935609);
				int i_101_ = i_100_ >> 12 & 0x7;
				int i_102_ = (byte) (i_100_ >> 10) & 0x3;
				int i_103_ = i_100_ >> 5 & 0x1f;
				if (i_103_ > 15)
					i_103_ -= 32;
				int i_104_ = i_100_ & 0x1f;
				if (i_104_ > 15)
					i_104_ -= 32;
				int i_105_ = class640_sub1_sub2_sub1_sub2.anIntArray11902[0] + i_103_;
				int i_106_ = i_104_ + class640_sub1_sub2_sub1_sub2.anIntArray11944[0];
				if (i_101_ == Class679.aClass679_8621.anInt8624 * -996176747)
					class640_sub1_sub2_sub1_sub2.method18886(i_105_, i_106_, -580908017);
				else {
					aByteArray1299[i] = (byte) (i_101_ - 1);
					class640_sub1_sub2_sub1_sub2.method18878(i_105_, i_106_, aByteArray1299[i], (byte) -95);
				}
				class640_sub1_sub2_sub1_sub2.aByte10864 = class640_sub1_sub2_sub1_sub2.aByte10862 = (byte) (class640_sub1_sub2_sub1_sub2.aByte10864 + i_102_ & 0x3);
				if (client.aClass509_11072.method8359(94425579).method7706(i_105_, i_106_, (short) -16395))
					class640_sub1_sub2_sub1_sub2.aByte10862++;
				if (client.anInt11070 * -899375681 == i && (Class673.anInt8585 * 162317215 != class640_sub1_sub2_sub1_sub2.aByte10864))
					Class673.anInt8585 = class640_sub1_sub2_sub1_sub2.aByte10864 * 706975839;
			} else {
				int i_107_ = class527_sub38_sub2.method18469(3, -531398797);
				int i_108_ = class527_sub38_sub2.method18469(30, 187306927);
				int i_109_ = i_108_ >> 28 & 0x3;
				int i_110_ = i_108_ >> 14 & 0x3fff;
				int i_111_ = i_108_ & 0x3fff;
				int i_112_ = (((class640_sub1_sub2_sub1_sub2.anIntArray11902[0] + 153371143 * class592.anInt7798 + i_110_) & 0x3fff) - 153371143 * class592.anInt7798);
				int i_113_ = ((i_111_ + ((class640_sub1_sub2_sub1_sub2.anIntArray11944[0]) + -2029646807 * class592.anInt7799) & 0x3fff) - -2029646807 * class592.anInt7799);
				if (-996176747 * Class679.aClass679_8621.anInt8624 == i_107_)
					class640_sub1_sub2_sub1_sub2.method18886(i_112_, i_113_, -1853983151);
				else {
					aByteArray1299[i] = (byte) (i_107_ - 1);
					class640_sub1_sub2_sub1_sub2.method18878(i_112_, i_113_, aByteArray1299[i], (byte) -62);
				}
				class640_sub1_sub2_sub1_sub2.aByte10864 = class640_sub1_sub2_sub1_sub2.aByte10862 = (byte) (i_109_ + class640_sub1_sub2_sub1_sub2.aByte10864 & 0x3);
				if (client.aClass509_11072.method8359(1682827727).method7706(i_112_, i_113_, (short) 16019))
					class640_sub1_sub2_sub1_sub2.aByte10862++;
				if (client.anInt11070 * -899375681 == i)
					Class673.anInt8585 = class640_sub1_sub2_sub1_sub2.aByte10864 * 706975839;
			}
		}
	}

	static void method1822(Class527_Sub38_Sub2 class527_sub38_sub2, int i) {
		Class592 class592 = client.aClass509_11072.method8283((short) 359);
		boolean bool = class527_sub38_sub2.method18469(1, -286559586) == 1;
		if (bool)
			anIntArray1306[(anInt1294 += -1816171541) * -673487677 - 1] = i;
		int i_114_ = class527_sub38_sub2.method18469(2, 2095572165);
		Class640_Sub1_Sub2_Sub1_Sub2 class640_sub1_sub2_sub1_sub2 = client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[i];
		if (i_114_ == 0) {
			if (!bool) {
				if (client.anInt11070 * -899375681 == i)
					throw new RuntimeException();
				Class47 class47 = aClass47Array1296[i] = new Class47();
				Class679.method13904(673878859);
				class47.anInt497 = ((class640_sub1_sub2_sub1_sub2.aByte10864 << 28) + ((153371143 * class592.anInt7798 + class640_sub1_sub2_sub1_sub2.anIntArray11902[0]) >> 6 << 14) + ((class592.anInt7799 * -2029646807 + class640_sub1_sub2_sub1_sub2.anIntArray11944[0]) >> 6)) * 224559645;
				if (-1 != class640_sub1_sub2_sub1_sub2.anInt12178 * 294621047)
					class47.anInt496 = 712889473 * class640_sub1_sub2_sub1_sub2.anInt12178;
				else
					class47.anInt496 = class640_sub1_sub2_sub1_sub2.aClass61_11936.method1384((byte) 1) * -1598101049;
				class47.anInt495 = class640_sub1_sub2_sub1_sub2.anInt11910 * -17829839;
				class47.aClass210_498 = class640_sub1_sub2_sub1_sub2.aClass210_12185;
				class47.aBool499 = class640_sub1_sub2_sub1_sub2.aBool12180;
				if (class640_sub1_sub2_sub1_sub2.anInt12197 * 17034299 > 0)
					Class608.method10087(class640_sub1_sub2_sub1_sub2, -820204774);
				client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[i] = null;
				if (class527_sub38_sub2.method18469(1, 1601824853) != 0)
					Class522_Sub6.method15992(class527_sub38_sub2, i, 799349477);
			}
		} else if (1 == i_114_) {
			int i_115_ = class527_sub38_sub2.method18469(3, -9759382);
			int i_116_ = class527_sub38_sub2.method18469(1, -290486767);
			int i_117_ = class640_sub1_sub2_sub1_sub2.anIntArray11902[0];
			int i_118_ = class640_sub1_sub2_sub1_sub2.anIntArray11944[0];
			if (1 == i_116_) {
				aByteArray1299[i] = Class679.aClass679_8623.aByte8627;
				int i_119_ = class527_sub38_sub2.method18469(2, 172244710);
				switch (i_119_) {
				case 3:
					class640_sub1_sub2_sub1_sub2.method18878(i_117_, i_118_ - 1, aByteArray1299[i], (byte) -117);
					break;
				case 1:
					class640_sub1_sub2_sub1_sub2.method18878(i_117_ - 1, i_118_, aByteArray1299[i], (byte) -75);
					break;
				case 2:
					class640_sub1_sub2_sub1_sub2.method18878(i_117_ + 1, i_118_, aByteArray1299[i], (byte) -27);
					break;
				case 0:
					class640_sub1_sub2_sub1_sub2.method18878(i_117_, 1 + i_118_, aByteArray1299[i], (byte) -24);
					break;
				}
			}
			if (0 == i_115_) {
				i_117_--;
				i_118_--;
			} else if (i_115_ == 1)
				i_118_--;
			else if (i_115_ == 2) {
				i_117_++;
				i_118_--;
			} else if (3 == i_115_)
				i_117_--;
			else if (i_115_ == 4)
				i_117_++;
			else if (5 == i_115_) {
				i_117_--;
				i_118_++;
			} else if (6 == i_115_)
				i_118_++;
			else if (7 == i_115_) {
				i_117_++;
				i_118_++;
			}
			class640_sub1_sub2_sub1_sub2.method18878(i_117_, i_118_, aByteArray1299[i], (byte) -122);
		} else if (2 == i_114_) {
			int i_120_ = class527_sub38_sub2.method18469(4, 418248139);
			int i_121_ = class640_sub1_sub2_sub1_sub2.anIntArray11902[0];
			int i_122_ = class640_sub1_sub2_sub1_sub2.anIntArray11944[0];
			if (0 == i_120_) {
				i_121_ -= 2;
				i_122_ -= 2;
			} else if (1 == i_120_) {
				i_121_--;
				i_122_ -= 2;
			} else if (2 == i_120_)
				i_122_ -= 2;
			else if (i_120_ == 3) {
				i_121_++;
				i_122_ -= 2;
			} else if (4 == i_120_) {
				i_121_ += 2;
				i_122_ -= 2;
			} else if (i_120_ == 5) {
				i_121_ -= 2;
				i_122_--;
			} else if (6 == i_120_) {
				i_121_ += 2;
				i_122_--;
			} else if (i_120_ == 7)
				i_121_ -= 2;
			else if (8 == i_120_)
				i_121_ += 2;
			else if (i_120_ == 9) {
				i_121_ -= 2;
				i_122_++;
			} else if (10 == i_120_) {
				i_121_ += 2;
				i_122_++;
			} else if (11 == i_120_) {
				i_121_ -= 2;
				i_122_ += 2;
			} else if (12 == i_120_) {
				i_121_--;
				i_122_ += 2;
			} else if (i_120_ == 13)
				i_122_ += 2;
			else if (14 == i_120_) {
				i_121_++;
				i_122_ += 2;
			} else if (i_120_ == 15) {
				i_121_ += 2;
				i_122_ += 2;
			}
			class640_sub1_sub2_sub1_sub2.method18878(i_121_, i_122_, aByteArray1299[i], (byte) -63);
		} else {
			int i_123_ = class527_sub38_sub2.method18469(1, 53206377);
			if (0 == i_123_) {
				int i_124_ = class527_sub38_sub2.method18469(15, -2094002929);
				int i_125_ = i_124_ >> 12 & 0x7;
				int i_126_ = (byte) (i_124_ >> 10) & 0x3;
				int i_127_ = i_124_ >> 5 & 0x1f;
				if (i_127_ > 15)
					i_127_ -= 32;
				int i_128_ = i_124_ & 0x1f;
				if (i_128_ > 15)
					i_128_ -= 32;
				int i_129_ = class640_sub1_sub2_sub1_sub2.anIntArray11902[0] + i_127_;
				int i_130_ = i_128_ + class640_sub1_sub2_sub1_sub2.anIntArray11944[0];
				if (i_125_ == Class679.aClass679_8621.anInt8624 * -996176747)
					class640_sub1_sub2_sub1_sub2.method18886(i_129_, i_130_, -779933499);
				else {
					aByteArray1299[i] = (byte) (i_125_ - 1);
					class640_sub1_sub2_sub1_sub2.method18878(i_129_, i_130_, aByteArray1299[i], (byte) -24);
				}
				class640_sub1_sub2_sub1_sub2.aByte10864 = class640_sub1_sub2_sub1_sub2.aByte10862 = (byte) (class640_sub1_sub2_sub1_sub2.aByte10864 + i_126_ & 0x3);
				if (client.aClass509_11072.method8359(1503471844).method7706(i_129_, i_130_, (short) -9098))
					class640_sub1_sub2_sub1_sub2.aByte10862++;
				if (client.anInt11070 * -899375681 == i && (Class673.anInt8585 * 162317215 != class640_sub1_sub2_sub1_sub2.aByte10864))
					Class673.anInt8585 = class640_sub1_sub2_sub1_sub2.aByte10864 * 706975839;
			} else {
				int i_131_ = class527_sub38_sub2.method18469(3, 1019278748);
				int i_132_ = class527_sub38_sub2.method18469(30, 1068717320);
				int i_133_ = i_132_ >> 28 & 0x3;
				int i_134_ = i_132_ >> 14 & 0x3fff;
				int i_135_ = i_132_ & 0x3fff;
				int i_136_ = (((class640_sub1_sub2_sub1_sub2.anIntArray11902[0] + 153371143 * class592.anInt7798 + i_134_) & 0x3fff) - 153371143 * class592.anInt7798);
				int i_137_ = ((i_135_ + ((class640_sub1_sub2_sub1_sub2.anIntArray11944[0]) + -2029646807 * class592.anInt7799) & 0x3fff) - -2029646807 * class592.anInt7799);
				if (-996176747 * Class679.aClass679_8621.anInt8624 == i_131_)
					class640_sub1_sub2_sub1_sub2.method18886(i_136_, i_137_, -2093340488);
				else {
					aByteArray1299[i] = (byte) (i_131_ - 1);
					class640_sub1_sub2_sub1_sub2.method18878(i_136_, i_137_, aByteArray1299[i], (byte) -63);
				}
				class640_sub1_sub2_sub1_sub2.aByte10864 = class640_sub1_sub2_sub1_sub2.aByte10862 = (byte) (i_133_ + class640_sub1_sub2_sub1_sub2.aByte10864 & 0x3);
				if (client.aClass509_11072.method8359(1439674626).method7706(i_136_, i_137_, (short) -17709))
					class640_sub1_sub2_sub1_sub2.aByte10862++;
				if (client.anInt11070 * -899375681 == i)
					Class673.anInt8585 = class640_sub1_sub2_sub1_sub2.aByte10864 * 706975839;
			}
		}
	}

	static void method1823(Class527_Sub38_Sub2 class527_sub38_sub2, int i) {
		Class592 class592 = client.aClass509_11072.method8283((short) 3336);
		boolean bool = class527_sub38_sub2.method18469(1, 90342196) == 1;
		if (bool)
			anIntArray1306[(anInt1294 += -1816171541) * -673487677 - 1] = i;
		int i_138_ = class527_sub38_sub2.method18469(2, 427295638);
		Class640_Sub1_Sub2_Sub1_Sub2 class640_sub1_sub2_sub1_sub2 = client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[i];
		if (i_138_ == 0) {
			if (!bool) {
				if (client.anInt11070 * -899375681 == i)
					throw new RuntimeException();
				Class47 class47 = aClass47Array1296[i] = new Class47();
				Class679.method13904(673878859);
				class47.anInt497 = ((class640_sub1_sub2_sub1_sub2.aByte10864 << 28) + ((153371143 * class592.anInt7798 + class640_sub1_sub2_sub1_sub2.anIntArray11902[0]) >> 6 << 14) + ((class592.anInt7799 * -2029646807 + class640_sub1_sub2_sub1_sub2.anIntArray11944[0]) >> 6)) * 224559645;
				if (-1 != class640_sub1_sub2_sub1_sub2.anInt12178 * 294621047)
					class47.anInt496 = 712889473 * class640_sub1_sub2_sub1_sub2.anInt12178;
				else
					class47.anInt496 = class640_sub1_sub2_sub1_sub2.aClass61_11936.method1384((byte) 1) * -1598101049;
				class47.anInt495 = class640_sub1_sub2_sub1_sub2.anInt11910 * -17829839;
				class47.aClass210_498 = class640_sub1_sub2_sub1_sub2.aClass210_12185;
				class47.aBool499 = class640_sub1_sub2_sub1_sub2.aBool12180;
				if (class640_sub1_sub2_sub1_sub2.anInt12197 * 17034299 > 0)
					Class608.method10087(class640_sub1_sub2_sub1_sub2, -311421744);
				client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[i] = null;
				if (class527_sub38_sub2.method18469(1, 1147617402) != 0)
					Class522_Sub6.method15992(class527_sub38_sub2, i, 2011753273);
			}
		} else if (1 == i_138_) {
			int i_139_ = class527_sub38_sub2.method18469(3, 1408070995);
			int i_140_ = class527_sub38_sub2.method18469(1, -627026206);
			int i_141_ = class640_sub1_sub2_sub1_sub2.anIntArray11902[0];
			int i_142_ = class640_sub1_sub2_sub1_sub2.anIntArray11944[0];
			if (1 == i_140_) {
				aByteArray1299[i] = Class679.aClass679_8623.aByte8627;
				int i_143_ = class527_sub38_sub2.method18469(2, -781043535);
				switch (i_143_) {
				case 3:
					class640_sub1_sub2_sub1_sub2.method18878(i_141_, i_142_ - 1, aByteArray1299[i], (byte) -55);
					break;
				case 1:
					class640_sub1_sub2_sub1_sub2.method18878(i_141_ - 1, i_142_, aByteArray1299[i], (byte) -31);
					break;
				case 2:
					class640_sub1_sub2_sub1_sub2.method18878(i_141_ + 1, i_142_, aByteArray1299[i], (byte) -66);
					break;
				case 0:
					class640_sub1_sub2_sub1_sub2.method18878(i_141_, 1 + i_142_, aByteArray1299[i], (byte) -6);
					break;
				}
			}
			if (0 == i_139_) {
				i_141_--;
				i_142_--;
			} else if (i_139_ == 1)
				i_142_--;
			else if (i_139_ == 2) {
				i_141_++;
				i_142_--;
			} else if (3 == i_139_)
				i_141_--;
			else if (i_139_ == 4)
				i_141_++;
			else if (5 == i_139_) {
				i_141_--;
				i_142_++;
			} else if (6 == i_139_)
				i_142_++;
			else if (7 == i_139_) {
				i_141_++;
				i_142_++;
			}
			class640_sub1_sub2_sub1_sub2.method18878(i_141_, i_142_, aByteArray1299[i], (byte) -124);
		} else if (2 == i_138_) {
			int i_144_ = class527_sub38_sub2.method18469(4, -749959011);
			int i_145_ = class640_sub1_sub2_sub1_sub2.anIntArray11902[0];
			int i_146_ = class640_sub1_sub2_sub1_sub2.anIntArray11944[0];
			if (0 == i_144_) {
				i_145_ -= 2;
				i_146_ -= 2;
			} else if (1 == i_144_) {
				i_145_--;
				i_146_ -= 2;
			} else if (2 == i_144_)
				i_146_ -= 2;
			else if (i_144_ == 3) {
				i_145_++;
				i_146_ -= 2;
			} else if (4 == i_144_) {
				i_145_ += 2;
				i_146_ -= 2;
			} else if (i_144_ == 5) {
				i_145_ -= 2;
				i_146_--;
			} else if (6 == i_144_) {
				i_145_ += 2;
				i_146_--;
			} else if (i_144_ == 7)
				i_145_ -= 2;
			else if (8 == i_144_)
				i_145_ += 2;
			else if (i_144_ == 9) {
				i_145_ -= 2;
				i_146_++;
			} else if (10 == i_144_) {
				i_145_ += 2;
				i_146_++;
			} else if (11 == i_144_) {
				i_145_ -= 2;
				i_146_ += 2;
			} else if (12 == i_144_) {
				i_145_--;
				i_146_ += 2;
			} else if (i_144_ == 13)
				i_146_ += 2;
			else if (14 == i_144_) {
				i_145_++;
				i_146_ += 2;
			} else if (i_144_ == 15) {
				i_145_ += 2;
				i_146_ += 2;
			}
			class640_sub1_sub2_sub1_sub2.method18878(i_145_, i_146_, aByteArray1299[i], (byte) -103);
		} else {
			int i_147_ = class527_sub38_sub2.method18469(1, 2091891199);
			if (0 == i_147_) {
				int i_148_ = class527_sub38_sub2.method18469(15, -177577186);
				int i_149_ = i_148_ >> 12 & 0x7;
				int i_150_ = (byte) (i_148_ >> 10) & 0x3;
				int i_151_ = i_148_ >> 5 & 0x1f;
				if (i_151_ > 15)
					i_151_ -= 32;
				int i_152_ = i_148_ & 0x1f;
				if (i_152_ > 15)
					i_152_ -= 32;
				int i_153_ = class640_sub1_sub2_sub1_sub2.anIntArray11902[0] + i_151_;
				int i_154_ = i_152_ + class640_sub1_sub2_sub1_sub2.anIntArray11944[0];
				if (i_149_ == Class679.aClass679_8621.anInt8624 * -996176747)
					class640_sub1_sub2_sub1_sub2.method18886(i_153_, i_154_, -314822390);
				else {
					aByteArray1299[i] = (byte) (i_149_ - 1);
					class640_sub1_sub2_sub1_sub2.method18878(i_153_, i_154_, aByteArray1299[i], (byte) -34);
				}
				class640_sub1_sub2_sub1_sub2.aByte10864 = class640_sub1_sub2_sub1_sub2.aByte10862 = (byte) (class640_sub1_sub2_sub1_sub2.aByte10864 + i_150_ & 0x3);
				if (client.aClass509_11072.method8359(199071580).method7706(i_153_, i_154_, (short) 5676))
					class640_sub1_sub2_sub1_sub2.aByte10862++;
				if (client.anInt11070 * -899375681 == i && (Class673.anInt8585 * 162317215 != class640_sub1_sub2_sub1_sub2.aByte10864))
					Class673.anInt8585 = class640_sub1_sub2_sub1_sub2.aByte10864 * 706975839;
			} else {
				int i_155_ = class527_sub38_sub2.method18469(3, 1330290814);
				int i_156_ = class527_sub38_sub2.method18469(30, -1951331657);
				int i_157_ = i_156_ >> 28 & 0x3;
				int i_158_ = i_156_ >> 14 & 0x3fff;
				int i_159_ = i_156_ & 0x3fff;
				int i_160_ = (((class640_sub1_sub2_sub1_sub2.anIntArray11902[0] + 153371143 * class592.anInt7798 + i_158_) & 0x3fff) - 153371143 * class592.anInt7798);
				int i_161_ = ((i_159_ + ((class640_sub1_sub2_sub1_sub2.anIntArray11944[0]) + -2029646807 * class592.anInt7799) & 0x3fff) - -2029646807 * class592.anInt7799);
				if (-996176747 * Class679.aClass679_8621.anInt8624 == i_155_)
					class640_sub1_sub2_sub1_sub2.method18886(i_160_, i_161_, -1327013954);
				else {
					aByteArray1299[i] = (byte) (i_155_ - 1);
					class640_sub1_sub2_sub1_sub2.method18878(i_160_, i_161_, aByteArray1299[i], (byte) -100);
				}
				class640_sub1_sub2_sub1_sub2.aByte10864 = class640_sub1_sub2_sub1_sub2.aByte10862 = (byte) (i_157_ + class640_sub1_sub2_sub1_sub2.aByte10864 & 0x3);
				if (client.aClass509_11072.method8359(339931499).method7706(i_160_, i_161_, (short) -1319))
					class640_sub1_sub2_sub1_sub2.aByte10862++;
				if (client.anInt11070 * -899375681 == i)
					Class673.anInt8585 = class640_sub1_sub2_sub1_sub2.aByte10864 * 706975839;
			}
		}
	}

	static final void method1824(Class527_Sub38_Sub2 class527_sub38_sub2) {
		class527_sub38_sub2.method18450(1705036641);
		int i = -899375681 * client.anInt11070;
		Class640_Sub1_Sub2_Sub1_Sub2 class640_sub1_sub2_sub1_sub2 = (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937 = client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[i] = (new Class640_Sub1_Sub2_Sub1_Sub2(client.aClass509_11072.method8314(-1877120328))));
		class640_sub1_sub2_sub1_sub2.anInt11955 = 1587877927 * i;
		int i_162_ = class527_sub38_sub2.method18469(30, 872500387);
		byte i_163_ = (byte) (i_162_ >> 28);
		int i_164_ = i_162_ >> 14 & 0x3fff;
		int i_165_ = i_162_ & 0x3fff;
		Class592 class592 = client.aClass509_11072.method8283((short) 19159);
		class640_sub1_sub2_sub1_sub2.anIntArray11902[0] = i_164_ - class592.anInt7798 * 153371143;
		class640_sub1_sub2_sub1_sub2.anIntArray11944[0] = i_165_ - -2029646807 * class592.anInt7799;
		class640_sub1_sub2_sub1_sub2.method10619((float) ((class640_sub1_sub2_sub1_sub2.anIntArray11902[0] << 9) + (class640_sub1_sub2_sub1_sub2.method18564(-1526037249) << 8)), (class640_sub1_sub2_sub1_sub2.method10613().aClass442_4927.aFloat4915), (float) ((class640_sub1_sub2_sub1_sub2.anIntArray11944[0] << 9) + (class640_sub1_sub2_sub1_sub2.method18564(-1210152235) << 8)));
		Class673.anInt8585 = (class640_sub1_sub2_sub1_sub2.aByte10864 = class640_sub1_sub2_sub1_sub2.aByte10862 = i_163_) * 706975839;
		if (client.aClass509_11072.method8359(869207934).method7706(class640_sub1_sub2_sub1_sub2.anIntArray11902[0], class640_sub1_sub2_sub1_sub2.anIntArray11944[0], (short) -10005))
			class640_sub1_sub2_sub1_sub2.aByte10862++;
		if (aClass527_Sub38Array1298[i] != null)
			class640_sub1_sub2_sub1_sub2.method18873(aClass527_Sub38Array1298[i], 348521444);
		if (aClass527_Sub38Array1305[i] != null)
			class640_sub1_sub2_sub1_sub2.method18874(aClass527_Sub38Array1305[i], -1720390257);
		anInt1300 = 0;
		anIntArray1301[(anInt1300 += -858376649) * 351100807 - 1] = i;
		aByteArray1295[i] = (byte) 0;
		anInt1302 = 0;
		for (int i_166_ = 1; i_166_ < 2048; i_166_++) {
			if (i != i_166_) {
				int i_167_ = class527_sub38_sub2.method18469(18, -776947305);
				int i_168_ = i_167_ >> 16 & 0x3;
				int i_169_ = i_167_ >> 8 & 0xff;
				int i_170_ = i_167_ & 0xff;
				Class47 class47 = aClass47Array1296[i_166_] = new Class47();
				class47.anInt497 = 224559645 * (i_170_ + ((i_168_ << 28) + (i_169_ << 14)));
				class47.anInt496 = 0;
				class47.anInt495 = -1031003831;
				class47.aClass210_498 = Class210.aClass210_2251;
				class47.aBool499 = false;
				anIntArray1303[(anInt1302 += 410783055) * 1242229167 - 1] = i_166_;
				aByteArray1295[i_166_] = (byte) 0;
			}
		}
		class527_sub38_sub2.method18452(1682202823);
		Class301 class301 = Class208_Sub10.aClass296_Sub1_9923.method5376((byte) 24);
		if (Class301.aClass301_3418 == class301) {
			Class327_Sub2 class327_sub2 = ((Class327_Sub2) Class208_Sub10.aClass296_Sub1_9923.method5372((byte) 0));
			class327_sub2.method15729((byte) -94);
		}
		Class309 class309 = Class208_Sub10.aClass296_Sub1_9923.method5378((byte) -43);
		if (class309 == Class309.aClass309_3455) {
			Class696_Sub3 class696_sub3 = ((Class696_Sub3) Class208_Sub10.aClass296_Sub1_9923.method5472(621223572));
			class696_sub3.method17233(-242407567);
		}
	}

	Class105() throws Throwable {
		throw new Error();
	}

	static boolean method1825(Class527_Sub38_Sub2 class527_sub38_sub2, int i) {
		int i_171_ = class527_sub38_sub2.method18469(2, 328048634);
		if (i_171_ == 0) {
			if (class527_sub38_sub2.method18469(1, 1391060212) != 0)
				Class522_Sub6.method15992(class527_sub38_sub2, i, 1084140190);
			int i_172_ = class527_sub38_sub2.method18469(6, 350682668);
			int i_173_ = class527_sub38_sub2.method18469(6, 270949432);
			boolean bool = class527_sub38_sub2.method18469(1, 1275913308) == 1;
			if (bool)
				anIntArray1306[(anInt1294 += -1816171541) * -673487677 - 1] = i;
			if (client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[i] != null)
				throw new RuntimeException();
			Class47 class47 = aClass47Array1296[i];
			Class640_Sub1_Sub2_Sub1_Sub2 class640_sub1_sub2_sub1_sub2 = (client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[i] = (new Class640_Sub1_Sub2_Sub1_Sub2(client.aClass509_11072.method8314(840156040))));
			class640_sub1_sub2_sub1_sub2.anInt11955 = i * 1587877927;
			if (null != aClass527_Sub38Array1298[i])
				class640_sub1_sub2_sub1_sub2.method18873(aClass527_Sub38Array1298[i], 348521444);
			if (aClass527_Sub38Array1305[i] != null)
				class640_sub1_sub2_sub1_sub2.method18874(aClass527_Sub38Array1305[i], -1720390257);
			class640_sub1_sub2_sub1_sub2.method18528(358090743 * class47.anInt496, true, -1312047277);
			class640_sub1_sub2_sub1_sub2.anInt11910 = -1143379759 * class47.anInt495;
			int i_174_ = class47.anInt497 * 924471349;
			int i_175_ = i_174_ >> 28;
			int i_176_ = i_174_ >> 14 & 0xff;
			int i_177_ = i_174_ & 0xff;
			Class592 class592 = client.aClass509_11072.method8283((short) 16487);
			int i_178_ = (i_176_ << 6) + i_172_ - 153371143 * class592.anInt7798;
			int i_179_ = (i_177_ << 6) + i_173_ - class592.anInt7799 * -2029646807;
			class640_sub1_sub2_sub1_sub2.aClass210_12185 = class47.aClass210_498;
			class640_sub1_sub2_sub1_sub2.aBool12180 = class47.aBool499;
			class640_sub1_sub2_sub1_sub2.aByteArray11945[0] = aByteArray1299[i];
			class640_sub1_sub2_sub1_sub2.aByte10864 = class640_sub1_sub2_sub1_sub2.aByte10862 = (byte) i_175_;
			if (client.aClass509_11072.method8359(-247473572).method7706(i_178_, i_179_, (short) -7196))
				class640_sub1_sub2_sub1_sub2.aByte10862++;
			class640_sub1_sub2_sub1_sub2.method18886(i_178_, i_179_, -988089191);
			aClass47Array1296[i] = null;
			return true;
		}
		if (i_171_ == 1) {
			int i_180_ = class527_sub38_sub2.method18469(2, 828305361);
			int i_181_ = 924471349 * aClass47Array1296[i].anInt497;
			aClass47Array1296[i].anInt497 = 224559645 * (((i_180_ + (i_181_ >> 28) & 0x3) << 28) + (i_181_ & 0xfffffff));
			return false;
		}
		if (i_171_ == 2) {
			int i_182_ = class527_sub38_sub2.method18469(5, 1638208505);
			int i_183_ = i_182_ >> 3 & 0x3;
			int i_184_ = i_182_ & 0x7;
			int i_185_ = 924471349 * aClass47Array1296[i].anInt497;
			if (!$assertionsDisabled && (aByteArray1299[i] < 0 || aByteArray1299[i] > 3))
				throw new AssertionError();
			int i_186_ = i_183_ + (i_185_ >> 28) & 0x3;
			int i_187_ = i_185_ >> 14 & 0xff;
			int i_188_ = i_185_ & 0xff;
			if (0 == i_184_) {
				i_187_--;
				i_188_--;
			}
			if (i_184_ == 1)
				i_188_--;
			if (i_184_ == 2) {
				i_187_++;
				i_188_--;
			}
			if (i_184_ == 3)
				i_187_--;
			if (i_184_ == 4)
				i_187_++;
			if (5 == i_184_) {
				i_187_--;
				i_188_++;
			}
			if (i_184_ == 6)
				i_188_++;
			if (7 == i_184_) {
				i_187_++;
				i_188_++;
			}
			Class26.method858(Class679.method13904(673878859), aByteArray1299[i], 990621658);
			aClass47Array1296[i].anInt497 = (i_188_ + ((i_186_ << 28) + (i_187_ << 14))) * 224559645;
			return false;
		}
		int i_189_ = class527_sub38_sub2.method18469(20, -1807468520);
		int i_190_ = i_189_ >> 18 & 0x3;
		int i_191_ = i_189_ >> 16 & 0x3;
		int i_192_ = i_189_ >> 8 & 0xff;
		int i_193_ = i_189_ & 0xff;
		int i_194_ = 924471349 * aClass47Array1296[i].anInt497;
		aByteArray1299[i] = (byte) (i_190_ - 1);
		if (!$assertionsDisabled && (aByteArray1299[i] < 0 || aByteArray1299[i] > 3))
			throw new AssertionError();
		int i_195_ = (i_194_ >> 28) + i_191_ & 0x3;
		int i_196_ = (i_194_ >> 14) + i_192_ & 0xff;
		int i_197_ = i_194_ + i_193_ & 0xff;
		Class26.method858(Class679.method13904(673878859), i_190_ - 1, -998218713);
		aClass47Array1296[i].anInt497 = 224559645 * ((i_195_ << 28) + (i_196_ << 14) + i_197_);
		return false;
	}

	static final void method1826(Class527_Sub38_Sub2 class527_sub38_sub2) {
		for (int i = 0; i < anInt1294 * -673487677; i++) {
			class527_sub38_sub2.readUnsignedShort();
			int i_198_ = anIntArray1306[i];
			Class640_Sub1_Sub2_Sub1_Sub2 class640_sub1_sub2_sub1_sub2 = client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[i_198_];
			int i_199_ = class527_sub38_sub2.readUnsignedByte();
			if (0 != (i_199_ & 0x80))
				i_199_ += class527_sub38_sub2.readUnsignedByte() << 8;
			if (0 != (i_199_ & 0x800))
				i_199_ += class527_sub38_sub2.readUnsignedByte() << 16;
			Class208_Sub14.method15623(class527_sub38_sub2, i_198_, class640_sub1_sub2_sub1_sub2, i_199_, 153186612);
		}
	}

	static final void method1827(Class527_Sub38_Sub2 class527_sub38_sub2, int i, Class640_Sub1_Sub2_Sub1_Sub2 class640_sub1_sub2_sub1_sub2, int i_200_) {
		if ((i_200_ & 0x2000) != 0) {
			int i_201_ = class527_sub38_sub2.readUnsignedByteC(-555324603);
			byte[] is = new byte[i_201_];
			RSByteBuffer class527_sub38 = new RSByteBuffer(is);
			class527_sub38_sub2.readBytes(is, 0, i_201_, -1191052884);
			aClass527_Sub38Array1305[i] = class527_sub38;
			class640_sub1_sub2_sub1_sub2.method18874(class527_sub38, -1720390257);
		}
		if ((i_200_ & 0x1000) != 0) {
			int i_202_ = class527_sub38_sub2.readUnsignedShort();
			int i_203_ = class527_sub38_sub2.readIntV2();
			if (i_202_ == 65535)
				i_202_ = -1;
			int i_204_ = class527_sub38_sub2.readUnsignedByte();
			int i_205_ = i_204_ & 0x7;
			int i_206_ = i_204_ >> 3 & 0xf;
			if (15 == i_206_)
				i_206_ = -1;
			boolean bool = (i_204_ >> 7 & 0x1) == 1;
			class640_sub1_sub2_sub1_sub2.method18537(i_202_, i_203_, i_205_, i_206_, bool, 1, (byte) 107);
		}
		if (0 != (i_200_ & 0x10)) {
			int[] is = new int[4];
			for (int i_207_ = 0; i_207_ < 4; i_207_++)
				is[i_207_] = class527_sub38_sub2.method16466(-1811628096);
			int i_208_ = class527_sub38_sub2.readUnsignedByteC(-990363279);
			Class524.method8717(class640_sub1_sub2_sub1_sub2, is, i_208_, false, -397006101);
		}
		if ((i_200_ & 0x40) != 0) {
			class640_sub1_sub2_sub1_sub2.anInt12178 = class527_sub38_sub2.readUnsignedShortLE((byte) 127) * -791414201;
			if (0 == -1057678739 * class640_sub1_sub2_sub1_sub2.anInt11942) {
				class640_sub1_sub2_sub1_sub2.method18527(294621047 * class640_sub1_sub2_sub1_sub2.anInt12178, -654775166);
				class640_sub1_sub2_sub1_sub2.anInt12178 = 791414201;
			}
		}
		if (0 != (i_200_ & 0x100000)) {
			class640_sub1_sub2_sub1_sub2.aByte11887 = class527_sub38_sub2.readByteC((byte) 83);
			class640_sub1_sub2_sub1_sub2.aByte11907 = class527_sub38_sub2.readByteC((byte) 6);
			class640_sub1_sub2_sub1_sub2.aByte11929 = class527_sub38_sub2.readByteC((byte) 114);
			class640_sub1_sub2_sub1_sub2.aByte11898 = (byte) class527_sub38_sub2.readUnsignedByte128();
			class640_sub1_sub2_sub1_sub2.anInt11925 = (client.anInt11019 + class527_sub38_sub2.readUnsignedShortLE((byte) 112)) * 443123777;
			class640_sub1_sub2_sub1_sub2.anInt11926 = (client.anInt11019 + class527_sub38_sub2.readUnsignedShortLE128()) * -1162867085;
		}
		if (0 != (i_200_ & 0x4)) {
			int i_209_ = class527_sub38_sub2.readUnsignedShortLE128();
			int i_210_ = class527_sub38_sub2.readInt();
			if (i_209_ == 65535)
				i_209_ = -1;
			int i_211_ = class527_sub38_sub2.readUnsignedByte128();
			int i_212_ = i_211_ & 0x7;
			int i_213_ = i_211_ >> 3 & 0xf;
			if (15 == i_213_)
				i_213_ = -1;
			boolean bool = 1 == (i_211_ >> 7 & 0x1);
			class640_sub1_sub2_sub1_sub2.method18537(i_209_, i_210_, i_212_, i_213_, bool, 0, (byte) 64);
		}
		if ((i_200_ & 0x200) != 0) {
			int i_214_ = class527_sub38_sub2.readUnsignedByte128();
			int[] is = new int[i_214_];
			int[] is_215_ = new int[i_214_];
			int[] is_216_ = new int[i_214_];
			for (int i_217_ = 0; i_217_ < i_214_; i_217_++) {
				is[i_217_] = class527_sub38_sub2.method16466(-1783206310);
				is_215_[i_217_] = class527_sub38_sub2.readUnsignedByteC(-1558743687);
				is_216_[i_217_] = class527_sub38_sub2.readUnsignedShort128();
			}
			Class71.method1492(class640_sub1_sub2_sub1_sub2, is, is_215_, is_216_, -1563568769);
		}
		if (0 != (i_200_ & 0x80000)) {
			int i_218_ = class527_sub38_sub2.readUnsignedByte();
			int[] is = new int[i_218_];
			int[] is_219_ = new int[i_218_];
			for (int i_220_ = 0; i_220_ < i_218_; i_220_++) {
				int i_221_ = class527_sub38_sub2.readUnsignedShort128();
				if ((i_221_ & 0xc000) == 49152) {
					int i_222_ = class527_sub38_sub2.readUnsignedShortLE128();
					is[i_220_] = i_221_ << 16 | i_222_;
				} else
					is[i_220_] = i_221_;
				is_219_[i_220_] = class527_sub38_sub2.readUnsignedShortLE128();
			}
			class640_sub1_sub2_sub1_sub2.method18530(is, is_219_, (byte) 7);
		}
		if (0 != (i_200_ & 0x200000)) {
			int i_223_ = class527_sub38_sub2.readUnsignedShortLE((byte) 116);
			int i_224_ = class527_sub38_sub2.readIntV1();
			if (65535 == i_223_)
				i_223_ = -1;
			int i_225_ = class527_sub38_sub2.readUnsignedByteC(146765398);
			int i_226_ = i_225_ & 0x7;
			int i_227_ = i_225_ >> 3 & 0xf;
			if (15 == i_227_)
				i_227_ = -1;
			boolean bool = 1 == (i_225_ >> 7 & 0x1);
			class640_sub1_sub2_sub1_sub2.method18537(i_223_, i_224_, i_226_, i_227_, bool, 3, (byte) 27);
		}
		if (0 != (i_200_ & 0x4000)) {
			String string = class527_sub38_sub2.readString(738181422);
			if (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937 == class640_sub1_sub2_sub1_sub2)
				Class99.method1766(2, 0, class640_sub1_sub2_sub1_sub2.method18879(true, (byte) -27), class640_sub1_sub2_sub1_sub2.method18877(false, (byte) -26), class640_sub1_sub2_sub1_sub2.aString12202, string, null, 522650883);
			class640_sub1_sub2_sub1_sub2.method18882(string, 0, 0, -428544080);
		}
		if ((i_200_ & 0x20000) != 0) {
			class527_sub38_sub2.anInt10689 += -1345465534;
			int i_228_ = ((class527_sub38_sub2.buffer[((class527_sub38_sub2.anInt10689 += 1474750881) * -441238943) - 1]) & 0xff);
			for (int i_229_ = 0; i_229_ < i_228_; i_229_++) {
				int i_230_ = class527_sub38_sub2.readUnsigned128Byte();
				Class475 class475 = ((Class475) Class26.method858(Class475.method7767((byte) 7), i_230_, -1416381920));
				Class425 class425 = (Class248.aClass95_Sub1_Sub1_2731.method14484(class527_sub38_sub2, class475, (byte) 2));
				class640_sub1_sub2_sub1_sub2.anInterface3_11953.method18(class425.anInt4803 * 494563151, class425.anObject4804, 808776522);
			}
		}
		if ((i_200_ & 0x40000) != 0) {
			class640_sub1_sub2_sub1_sub2.anInterface3_11953.method19((byte) 7);
			class527_sub38_sub2.anInt10689 += -1345465534;
			int i_231_ = ((class527_sub38_sub2.buffer[((class527_sub38_sub2.anInt10689 += 1474750881) * -441238943) - 1]) & 0xff);
			for (int i_232_ = 0; i_232_ < i_231_; i_232_++) {
				int i_233_ = class527_sub38_sub2.readUnsignedByteC(736091638);
				Class475 class475 = ((Class475) Class26.method858(Class475.method7767((byte) -45), i_233_, -768295049));
				Class425 class425 = (Class248.aClass95_Sub1_Sub1_2731.method14484(class527_sub38_sub2, class475, (byte) 2));
				class640_sub1_sub2_sub1_sub2.anInterface3_11953.method18(494563151 * class425.anInt4803, class425.anObject4804, -906205096);
			}
		}
		if ((i_200_ & 0x400000) != 0) {
			String string = class527_sub38_sub2.readString(1661085808);
			int i_234_ = class527_sub38_sub2.readUnsignedByte128();
			if (0 != (i_234_ & 0x1))
				Class99.method1766(2, i_234_, class640_sub1_sub2_sub1_sub2.method18879(true, (byte) 0), class640_sub1_sub2_sub1_sub2.method18877(false, (byte) -58), class640_sub1_sub2_sub1_sub2.aString12202, string, null, -714540389);
			class640_sub1_sub2_sub1_sub2.method18882(string, 0, 0, -1492202976);
		}
		if (0 != (i_200_ & 0x8)) {
			int i_235_ = class527_sub38_sub2.readUnsignedByteC(1210651427);
			byte[] is = new byte[i_235_];
			RSByteBuffer class527_sub38 = new RSByteBuffer(is);
			class527_sub38_sub2.readBytes(is, 0, i_235_, 285612432);
			aClass527_Sub38Array1298[i] = class527_sub38;
			class640_sub1_sub2_sub1_sub2.method18873(class527_sub38, 348521444);
		}
		if ((i_200_ & 0x1) != 0) {
			int i_236_ = class527_sub38_sub2.readUnsigned128Byte();
			if (i_236_ > 0) {
				for (int i_237_ = 0; i_237_ < i_236_; i_237_++) {
					int i_238_ = -1;
					int i_239_ = -1;
					int i_240_ = -1;
					int i_241_ = class527_sub38_sub2.readUnsignedSmart((byte) -99);
					if (32767 == i_241_) {
						i_241_ = class527_sub38_sub2.readUnsignedSmart((byte) -55);
						i_239_ = class527_sub38_sub2.readUnsignedSmart((byte) -72);
						i_238_ = class527_sub38_sub2.readUnsignedSmart((byte) -58);
						i_240_ = class527_sub38_sub2.readUnsignedSmart((byte) -32);
					} else if (32766 != i_241_)
						i_239_ = class527_sub38_sub2.readUnsignedSmart((byte) -35);
					else {
						i_241_ = -1;
						i_239_ = class527_sub38_sub2.readUnsignedByteC(-951445718);
					}
					int i_242_ = class527_sub38_sub2.readUnsignedSmart((byte) -17);
					class640_sub1_sub2_sub1_sub2.method18538(i_241_, i_239_, i_238_, i_240_, client.anInt11019, i_242_, 709617252);
				}
			}
			int i_243_ = class527_sub38_sub2.readUnsignedByteC(-1351463358);
			if (i_243_ > 0) {
				for (int i_244_ = 0; i_244_ < i_243_; i_244_++) {
					int i_245_ = class527_sub38_sub2.readUnsignedSmart((byte) -39);
					int i_246_ = class527_sub38_sub2.readUnsignedSmart((byte) -20);
					if (i_246_ != 32767) {
						int i_247_ = class527_sub38_sub2.readUnsignedSmart((byte) -47);
						int i_248_ = class527_sub38_sub2.readUnsignedByte128();
						int i_249_ = (i_246_ > 0 ? class527_sub38_sub2.readUnsignedByteC(-989564348) : i_248_);
						class640_sub1_sub2_sub1_sub2.method18535(i_245_, client.anInt11019, i_246_, i_247_, i_248_, i_249_, 1511571073);
					} else
						class640_sub1_sub2_sub1_sub2.method18536(i_245_, -312384552);
				}
			}
		}
		if (0 != (i_200_ & 0x10000)) {
			int i_250_ = class527_sub38_sub2.readUnsignedShortLE128();
			int i_251_ = class527_sub38_sub2.readLEInt();
			if (i_250_ == 65535)
				i_250_ = -1;
			int i_252_ = class527_sub38_sub2.readUnsignedByte128();
			int i_253_ = i_252_ & 0x7;
			int i_254_ = i_252_ >> 3 & 0xf;
			if (i_254_ == 15)
				i_254_ = -1;
			boolean bool = 1 == (i_252_ >> 7 & 0x1);
			class640_sub1_sub2_sub1_sub2.method18537(i_250_, i_251_, i_253_, i_254_, bool, 4, (byte) 63);
		}
		if (0 != (i_200_ & 0x2)) {
			class640_sub1_sub2_sub1_sub2.anInt11916 = class527_sub38_sub2.readByte() * 1798102493;
			class640_sub1_sub2_sub1_sub2.anInt11886 = class527_sub38_sub2.read128Byte((byte) 85) * 1044896249;
			class640_sub1_sub2_sub1_sub2.anInt11895 = class527_sub38_sub2.read128Byte((byte) 88) * -873953571;
			class640_sub1_sub2_sub1_sub2.anInt11909 = class527_sub38_sub2.readByteC((byte) 13) * 1318952643;
			class640_sub1_sub2_sub1_sub2.anInt11920 = class527_sub38_sub2.readByte128((byte) -13) * -935178327;
			class640_sub1_sub2_sub1_sub2.anInt11900 = class527_sub38_sub2.readByte() * 677568689;
			class640_sub1_sub2_sub1_sub2.anInt11923 = (class527_sub38_sub2.readUnsignedShortLE128() + client.anInt11019) * -1540379769;
			class640_sub1_sub2_sub1_sub2.anInt11930 = (class527_sub38_sub2.readUnsignedShortLE((byte) 99) + client.anInt11019) * -1303412629;
			class640_sub1_sub2_sub1_sub2.anInt11924 = class527_sub38_sub2.readUnsignedShort() * 1662470151;
			class640_sub1_sub2_sub1_sub2.anInt11942 = 1705181029;
			class640_sub1_sub2_sub1_sub2.anInt11947 = 0;
			class640_sub1_sub2_sub1_sub2.anInt11916 += (class640_sub1_sub2_sub1_sub2.anIntArray11902[0] * 1798102493);
			class640_sub1_sub2_sub1_sub2.anInt11886 += (1044896249 * class640_sub1_sub2_sub1_sub2.anIntArray11944[0]);
			class640_sub1_sub2_sub1_sub2.anInt11895 += (-873953571 * class640_sub1_sub2_sub1_sub2.anIntArray11902[0]);
			class640_sub1_sub2_sub1_sub2.anInt11909 += (class640_sub1_sub2_sub1_sub2.anIntArray11944[0] * 1318952643);
			class640_sub1_sub2_sub1_sub2.anInt11920 += class640_sub1_sub2_sub1_sub2.aByte10864 * -935178327;
			class640_sub1_sub2_sub1_sub2.anInt11900 += class640_sub1_sub2_sub1_sub2.aByte10864 * 677568689;
		}
		if ((i_200_ & 0x400) != 0) {
			class640_sub1_sub2_sub1_sub2.aClass210_12185 = (Class210) Class26.method858(Class210.method3870((byte) -24), class527_sub38_sub2.readUnsignedByte(), -848286974);
			if (null == class640_sub1_sub2_sub1_sub2.aClass210_12185)
				class640_sub1_sub2_sub1_sub2.aClass210_12185 = Class210.aClass210_2251;
		}
		if ((i_200_ & 0x8000) != 0) {
			int i_255_ = class527_sub38_sub2.readUnsignedShortLE128();
			int i_256_ = class527_sub38_sub2.readLEInt();
			if (i_255_ == 65535)
				i_255_ = -1;
			int i_257_ = class527_sub38_sub2.readUnsignedByte();
			int i_258_ = i_257_ & 0x7;
			int i_259_ = i_257_ >> 3 & 0xf;
			if (i_259_ == 15)
				i_259_ = -1;
			boolean bool = (i_257_ >> 7 & 0x1) == 1;
			class640_sub1_sub2_sub1_sub2.method18537(i_255_, i_256_, i_258_, i_259_, bool, 2, (byte) 41);
		}
		if ((i_200_ & 0x20) != 0) {
			int i_260_ = class527_sub38_sub2.readUnsignedShortLE128();
			if (65535 == i_260_)
				i_260_ = -1;
			class640_sub1_sub2_sub1_sub2.anInt11910 = -1271780505 * i_260_;
		}
		if ((i_200_ & 0x800000) != 0)
			class640_sub1_sub2_sub1_sub2.aBool12180 = class527_sub38_sub2.readUnsigned128Byte() == 1;
	}

	static boolean method1828(Class527_Sub38_Sub2 class527_sub38_sub2, int i) {
		int i_261_ = class527_sub38_sub2.method18469(2, -1467766137);
		if (i_261_ == 0) {
			if (class527_sub38_sub2.method18469(1, -929178076) != 0)
				Class522_Sub6.method15992(class527_sub38_sub2, i, 209845055);
			int i_262_ = class527_sub38_sub2.method18469(6, 208959260);
			int i_263_ = class527_sub38_sub2.method18469(6, 1965095719);
			boolean bool = class527_sub38_sub2.method18469(1, -1062450876) == 1;
			if (bool)
				anIntArray1306[(anInt1294 += -1816171541) * -673487677 - 1] = i;
			if (client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[i] != null)
				throw new RuntimeException();
			Class47 class47 = aClass47Array1296[i];
			Class640_Sub1_Sub2_Sub1_Sub2 class640_sub1_sub2_sub1_sub2 = (client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[i] = (new Class640_Sub1_Sub2_Sub1_Sub2(client.aClass509_11072.method8314(1231744338))));
			class640_sub1_sub2_sub1_sub2.anInt11955 = i * 1587877927;
			if (null != aClass527_Sub38Array1298[i])
				class640_sub1_sub2_sub1_sub2.method18873(aClass527_Sub38Array1298[i], 348521444);
			if (aClass527_Sub38Array1305[i] != null)
				class640_sub1_sub2_sub1_sub2.method18874(aClass527_Sub38Array1305[i], -1720390257);
			class640_sub1_sub2_sub1_sub2.method18528(358090743 * class47.anInt496, true, -1159237653);
			class640_sub1_sub2_sub1_sub2.anInt11910 = -1143379759 * class47.anInt495;
			int i_264_ = class47.anInt497 * 924471349;
			int i_265_ = i_264_ >> 28;
			int i_266_ = i_264_ >> 14 & 0xff;
			int i_267_ = i_264_ & 0xff;
			Class592 class592 = client.aClass509_11072.method8283((short) 5029);
			int i_268_ = (i_266_ << 6) + i_262_ - 153371143 * class592.anInt7798;
			int i_269_ = (i_267_ << 6) + i_263_ - class592.anInt7799 * -2029646807;
			class640_sub1_sub2_sub1_sub2.aClass210_12185 = class47.aClass210_498;
			class640_sub1_sub2_sub1_sub2.aBool12180 = class47.aBool499;
			class640_sub1_sub2_sub1_sub2.aByteArray11945[0] = aByteArray1299[i];
			class640_sub1_sub2_sub1_sub2.aByte10864 = class640_sub1_sub2_sub1_sub2.aByte10862 = (byte) i_265_;
			if (client.aClass509_11072.method8359(919794777).method7706(i_268_, i_269_, (short) -16571))
				class640_sub1_sub2_sub1_sub2.aByte10862++;
			class640_sub1_sub2_sub1_sub2.method18886(i_268_, i_269_, -294378077);
			aClass47Array1296[i] = null;
			return true;
		}
		if (i_261_ == 1) {
			int i_270_ = class527_sub38_sub2.method18469(2, -1913810839);
			int i_271_ = 924471349 * aClass47Array1296[i].anInt497;
			aClass47Array1296[i].anInt497 = 224559645 * (((i_270_ + (i_271_ >> 28) & 0x3) << 28) + (i_271_ & 0xfffffff));
			return false;
		}
		if (i_261_ == 2) {
			int i_272_ = class527_sub38_sub2.method18469(5, -66040308);
			int i_273_ = i_272_ >> 3 & 0x3;
			int i_274_ = i_272_ & 0x7;
			int i_275_ = 924471349 * aClass47Array1296[i].anInt497;
			if (!$assertionsDisabled && (aByteArray1299[i] < 0 || aByteArray1299[i] > 3))
				throw new AssertionError();
			int i_276_ = i_273_ + (i_275_ >> 28) & 0x3;
			int i_277_ = i_275_ >> 14 & 0xff;
			int i_278_ = i_275_ & 0xff;
			if (0 == i_274_) {
				i_277_--;
				i_278_--;
			}
			if (i_274_ == 1)
				i_278_--;
			if (i_274_ == 2) {
				i_277_++;
				i_278_--;
			}
			if (i_274_ == 3)
				i_277_--;
			if (i_274_ == 4)
				i_277_++;
			if (5 == i_274_) {
				i_277_--;
				i_278_++;
			}
			if (i_274_ == 6)
				i_278_++;
			if (7 == i_274_) {
				i_277_++;
				i_278_++;
			}
			Class26.method858(Class679.method13904(673878859), aByteArray1299[i], 546959115);
			aClass47Array1296[i].anInt497 = (i_278_ + ((i_276_ << 28) + (i_277_ << 14))) * 224559645;
			return false;
		}
		int i_279_ = class527_sub38_sub2.method18469(20, -848596669);
		int i_280_ = i_279_ >> 18 & 0x3;
		int i_281_ = i_279_ >> 16 & 0x3;
		int i_282_ = i_279_ >> 8 & 0xff;
		int i_283_ = i_279_ & 0xff;
		int i_284_ = 924471349 * aClass47Array1296[i].anInt497;
		aByteArray1299[i] = (byte) (i_280_ - 1);
		if (!$assertionsDisabled && (aByteArray1299[i] < 0 || aByteArray1299[i] > 3))
			throw new AssertionError();
		int i_285_ = (i_284_ >> 28) + i_281_ & 0x3;
		int i_286_ = (i_284_ >> 14) + i_282_ & 0xff;
		int i_287_ = i_284_ + i_283_ & 0xff;
		Class26.method858(Class679.method13904(673878859), i_280_ - 1, -1424258418);
		aClass47Array1296[i].anInt497 = 224559645 * ((i_285_ << 28) + (i_286_ << 14) + i_287_);
		return false;
	}

	static void method1829() {
		anInt1300 = 0;
		for (int i = 0; i < 2048; i++) {
			aClass527_Sub38Array1298[i] = null;
			aClass527_Sub38Array1305[i] = null;
			aByteArray1299[i] = Class679.aClass679_8622.aByte8627;
			aClass47Array1296[i] = null;
		}
	}

	public static int method1830(int i) {
		Class26_Sub1 class26_sub1 = Class24_Sub22.method17424((byte) 2);
		Class193.method3699(class26_sub1, -64617665);
		return class26_sub1.method853(-1447568625);
	}

	static final void method1831(Class665 class665, int i) {
		int i_288_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_288_, 903404030);
		Class240 class240 = Class183.aClass240Array2100[i_288_ >> 16];
		Class311.method5648(class243, class240, class665, -1714147303);
	}

	public static void method1832(int i, int i_289_) {
		Class472.method7735(new Class582(i), (byte) -35);
	}
}
