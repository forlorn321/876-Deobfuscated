/* Class440 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.math.BigInteger;

public class Class440 {
	Class450 aClass450_4899;
	Class452 aClass452_4900;
	Class461 aClass461_4901;
	BigInteger aBigInteger4902;
	BigInteger aBigInteger4903;
	Class527_Sub8_Sub13_Sub3 aClass527_Sub8_Sub13_Sub3_4904;
	Class527_Sub8_Sub13_Sub2 aClass527_Sub8_Sub13_Sub2_4905;
	Class468 aClass468_4906;
	Class450 aClass450_4907;
	boolean aBool4908 = false;
	Class457_Sub1[] aClass457_Sub1Array4909;

	public Class457_Sub1 method7098(int i, Class552 class552, Class552 class552_0_, boolean bool, int i_1_) {
		return method7101(i, class552, class552_0_, true, bool, 66600012);
	}

	public boolean method7099(byte i) {
		if (null != aClass450_4899)
			return true;
		if (null == aClass527_Sub8_Sub13_Sub3_4904) {
			if (aClass452_4900.method7299((byte) 45))
				return false;
			aClass527_Sub8_Sub13_Sub3_4904 = aClass452_4900.method7297(255, 255, (byte) 0, true, -1962925154);
		}
		if (aClass527_Sub8_Sub13_Sub3_4904.aBool11768)
			return false;
		RSByteBuffer class527_sub38 = new RSByteBuffer(aClass527_Sub8_Sub13_Sub3_4904.method18319(-5611412));
		aClass450_4899 = new Class450(class527_sub38, aBigInteger4902, aBigInteger4903);
		if (null == aClass457_Sub1Array4909)
			aClass457_Sub1Array4909 = new Class457_Sub1[aClass450_4899.aClass453Array4936.length];
		else {
			for (int i_2_ = 0; i_2_ < aClass457_Sub1Array4909.length; i_2_++) {
				if (aClass457_Sub1Array4909[i_2_] != null) {
					Class453 class453 = aClass450_4899.aClass453Array4936[i_2_];
					aClass457_Sub1Array4909[i_2_].method15873(1933841649 * class453.anInt4966, class453.aByteArray4965, -1905061093 * class453.anInt4967, 230106837 * class453.anInt4968, (byte) 10);
					if (aClass457_Sub1Array4909[i_2_].method15885(1195332759))
						aClass457_Sub1Array4909[i_2_].method15880(false, -1656021704);
				}
			}
		}
		aBool4908 = false;
		return true;
	}

	public Class457_Sub1 method7100(int i, Class552 class552, Class552 class552_3_, boolean bool) {
		return method7101(i, class552, class552_3_, true, bool, -829535240);
	}

	Class457_Sub1 method7101(int i, Class552 class552, Class552 class552_4_, boolean bool, boolean bool_5_, int i_6_) {
		if (aClass450_4899 == null)
			throw new RuntimeException();
		if (i < 0 || i >= aClass457_Sub1Array4909.length)
			throw new RuntimeException();
		if (aClass457_Sub1Array4909[i] != null)
			return aClass457_Sub1Array4909[i];
		Class453 class453 = aClass450_4899.aClass453Array4936[i];
		Class457_Sub1 class457_sub1 = new Class457_Sub1(i, class552, class552_4_, aClass452_4900, bool_5_ ? aClass468_4906 : null, aClass461_4901, class453.anInt4966 * 1933841649, class453.aByteArray4965, class453.anInt4967 * -1905061093, bool, class453.anInt4968 * 230106837);
		aClass457_Sub1Array4909[i] = class457_sub1;
		if (null != aClass450_4907 && bool_5_) {
			Class453 class453_7_ = aClass450_4907.aClass453Array4936[i];
			aClass457_Sub1Array4909[i].method15880((aClass457_Sub1Array4909[i].method15874(class453_7_.anInt4966 * 1933841649, class453_7_.aByteArray4965, class453_7_.anInt4967 * -1905061093, class453_7_.anInt4968 * 230106837, 2029726020)), -1279907167);
		}
		return class457_sub1;
	}

	public void method7102(int i) {
		if (null != aClass457_Sub1Array4909) {
			for (int i_8_ = 0; i_8_ < aClass457_Sub1Array4909.length; i_8_++) {
				if (aClass457_Sub1Array4909[i_8_] != null)
					aClass457_Sub1Array4909[i_8_].method15877(1222358512);
			}
			for (int i_9_ = 0; i_9_ < aClass457_Sub1Array4909.length; i_9_++) {
				if (aClass457_Sub1Array4909[i_9_] != null)
					aClass457_Sub1Array4909[i_9_].method15909(-1480976516);
			}
			if (null == aClass450_4899)
				method7099((byte) 48);
			else if (null != aClass468_4906 && !aBool4908) {
				if (null == aClass527_Sub8_Sub13_Sub2_4905)
					aClass527_Sub8_Sub13_Sub2_4905 = aClass468_4906.method7677((short) 128);
				else if (!aClass527_Sub8_Sub13_Sub2_4905.aBool11768) {
					byte[] is = aClass527_Sub8_Sub13_Sub2_4905.method18319(868030472);
					try {
						aClass450_4907 = new Class450(new RSByteBuffer(is), aBigInteger4902, aBigInteger4903);
						for (int i_10_ = 0; i_10_ < aClass457_Sub1Array4909.length; i_10_++) {
							if (null != aClass457_Sub1Array4909[i_10_] && aClass457_Sub1Array4909[i_10_].method15885(228190075)) {
								Class453 class453 = aClass450_4907.aClass453Array4936[i_10_];
								aClass457_Sub1Array4909[i_10_].method15880((aClass457_Sub1Array4909[i_10_].method15874(class453.anInt4966 * 1933841649, class453.aByteArray4965, class453.anInt4967 * -1905061093, class453.anInt4968 * 230106837, -1729755489)), -992385057);
							}
						}
					} catch (Exception exception) {
						for (int i_11_ = 0; i_11_ < aClass457_Sub1Array4909.length; i_11_++) {
							if (null != aClass457_Sub1Array4909[i_11_] && aClass457_Sub1Array4909[i_11_].method15885(1978736811))
								aClass457_Sub1Array4909[i_11_].method15880(false, 1425876439);
						}
					}
					aClass527_Sub8_Sub13_Sub2_4905 = null;
					aBool4908 = true;
				}
			}
		}
	}

	public boolean method7103() {
		if (null != aClass450_4899)
			return true;
		if (null == aClass527_Sub8_Sub13_Sub3_4904) {
			if (aClass452_4900.method7299((byte) 44))
				return false;
			aClass527_Sub8_Sub13_Sub3_4904 = aClass452_4900.method7297(255, 255, (byte) 0, true, -2081975610);
		}
		if (aClass527_Sub8_Sub13_Sub3_4904.aBool11768)
			return false;
		RSByteBuffer class527_sub38 = new RSByteBuffer(aClass527_Sub8_Sub13_Sub3_4904.method18319(436430491));
		aClass450_4899 = new Class450(class527_sub38, aBigInteger4902, aBigInteger4903);
		if (null == aClass457_Sub1Array4909)
			aClass457_Sub1Array4909 = new Class457_Sub1[aClass450_4899.aClass453Array4936.length];
		else {
			for (int i = 0; i < aClass457_Sub1Array4909.length; i++) {
				if (aClass457_Sub1Array4909[i] != null) {
					Class453 class453 = aClass450_4899.aClass453Array4936[i];
					aClass457_Sub1Array4909[i].method15873(1933841649 * class453.anInt4966, class453.aByteArray4965, -1905061093 * class453.anInt4967, 230106837 * class453.anInt4968, (byte) 87);
					if (aClass457_Sub1Array4909[i].method15885(452528896))
						aClass457_Sub1Array4909[i].method15880(false, -267300549);
				}
			}
		}
		aBool4908 = false;
		return true;
	}

	public boolean method7104() {
		if (null != aClass450_4899)
			return true;
		if (null == aClass527_Sub8_Sub13_Sub3_4904) {
			if (aClass452_4900.method7299((byte) 6))
				return false;
			aClass527_Sub8_Sub13_Sub3_4904 = aClass452_4900.method7297(255, 255, (byte) 0, true, -1417637488);
		}
		if (aClass527_Sub8_Sub13_Sub3_4904.aBool11768)
			return false;
		RSByteBuffer class527_sub38 = new RSByteBuffer(aClass527_Sub8_Sub13_Sub3_4904.method18319(129899005));
		aClass450_4899 = new Class450(class527_sub38, aBigInteger4902, aBigInteger4903);
		if (null == aClass457_Sub1Array4909)
			aClass457_Sub1Array4909 = new Class457_Sub1[aClass450_4899.aClass453Array4936.length];
		else {
			for (int i = 0; i < aClass457_Sub1Array4909.length; i++) {
				if (aClass457_Sub1Array4909[i] != null) {
					Class453 class453 = aClass450_4899.aClass453Array4936[i];
					aClass457_Sub1Array4909[i].method15873(1933841649 * class453.anInt4966, class453.aByteArray4965, -1905061093 * class453.anInt4967, 230106837 * class453.anInt4968, (byte) 41);
					if (aClass457_Sub1Array4909[i].method15885(-166321645))
						aClass457_Sub1Array4909[i].method15880(false, 1601220828);
				}
			}
		}
		aBool4908 = false;
		return true;
	}

	public boolean method7105() {
		if (null != aClass450_4899)
			return true;
		if (null == aClass527_Sub8_Sub13_Sub3_4904) {
			if (aClass452_4900.method7299((byte) -14))
				return false;
			aClass527_Sub8_Sub13_Sub3_4904 = aClass452_4900.method7297(255, 255, (byte) 0, true, -1500412792);
		}
		if (aClass527_Sub8_Sub13_Sub3_4904.aBool11768)
			return false;
		RSByteBuffer class527_sub38 = new RSByteBuffer(aClass527_Sub8_Sub13_Sub3_4904.method18319(-951314981));
		aClass450_4899 = new Class450(class527_sub38, aBigInteger4902, aBigInteger4903);
		if (null == aClass457_Sub1Array4909)
			aClass457_Sub1Array4909 = new Class457_Sub1[aClass450_4899.aClass453Array4936.length];
		else {
			for (int i = 0; i < aClass457_Sub1Array4909.length; i++) {
				if (aClass457_Sub1Array4909[i] != null) {
					Class453 class453 = aClass450_4899.aClass453Array4936[i];
					aClass457_Sub1Array4909[i].method15873(1933841649 * class453.anInt4966, class453.aByteArray4965, -1905061093 * class453.anInt4967, 230106837 * class453.anInt4968, (byte) -13);
					if (aClass457_Sub1Array4909[i].method15885(-191433714))
						aClass457_Sub1Array4909[i].method15880(false, -1202409859);
				}
			}
		}
		aBool4908 = false;
		return true;
	}

	public Class457_Sub1 method7106(int i, Class552 class552, Class552 class552_12_, boolean bool) {
		return method7101(i, class552, class552_12_, true, bool, -1617419470);
	}

	public Class457_Sub1 method7107(int i, Class552 class552, Class552 class552_13_, boolean bool) {
		return method7101(i, class552, class552_13_, true, bool, -1888811112);
	}

	public Class440(Class452 class452, Class468 class468, Class461 class461, BigInteger biginteger, BigInteger biginteger_14_) {
		aClass452_4900 = class452;
		aClass468_4906 = class468;
		aClass461_4901 = class461;
		aBigInteger4902 = biginteger;
		aBigInteger4903 = biginteger_14_;
		if (!aClass452_4900.method7299((byte) 92))
			aClass527_Sub8_Sub13_Sub3_4904 = aClass452_4900.method7297(255, 255, (byte) 0, true, -1754948915);
		if (aClass468_4906 != null)
			aClass527_Sub8_Sub13_Sub2_4905 = aClass468_4906.method7677((short) 128);
	}

	Class457_Sub1 method7108(int i, Class552 class552, Class552 class552_15_, boolean bool, boolean bool_16_) {
		if (aClass450_4899 == null)
			throw new RuntimeException();
		if (i < 0 || i >= aClass457_Sub1Array4909.length)
			throw new RuntimeException();
		if (aClass457_Sub1Array4909[i] != null)
			return aClass457_Sub1Array4909[i];
		Class453 class453 = aClass450_4899.aClass453Array4936[i];
		Class457_Sub1 class457_sub1 = new Class457_Sub1(i, class552, class552_15_, aClass452_4900, bool_16_ ? aClass468_4906 : null, aClass461_4901, class453.anInt4966 * 1933841649, class453.aByteArray4965, class453.anInt4967 * -1905061093, bool, class453.anInt4968 * 230106837);
		aClass457_Sub1Array4909[i] = class457_sub1;
		if (null != aClass450_4907 && bool_16_) {
			Class453 class453_17_ = aClass450_4907.aClass453Array4936[i];
			aClass457_Sub1Array4909[i].method15880((aClass457_Sub1Array4909[i].method15874(class453_17_.anInt4966 * 1933841649, class453_17_.aByteArray4965, class453_17_.anInt4967 * -1905061093, class453_17_.anInt4968 * 230106837, 324360089)), -241494061);
		}
		return class457_sub1;
	}

	public void method7109() {
		if (null != aClass457_Sub1Array4909) {
			for (int i = 0; i < aClass457_Sub1Array4909.length; i++) {
				if (aClass457_Sub1Array4909[i] != null)
					aClass457_Sub1Array4909[i].method15877(642708228);
			}
			for (int i = 0; i < aClass457_Sub1Array4909.length; i++) {
				if (aClass457_Sub1Array4909[i] != null)
					aClass457_Sub1Array4909[i].method15909(1499897570);
			}
			if (null == aClass450_4899)
				method7099((byte) -46);
			else if (null != aClass468_4906 && !aBool4908) {
				if (null == aClass527_Sub8_Sub13_Sub2_4905)
					aClass527_Sub8_Sub13_Sub2_4905 = aClass468_4906.method7677((short) 128);
				else if (!aClass527_Sub8_Sub13_Sub2_4905.aBool11768) {
					byte[] is = aClass527_Sub8_Sub13_Sub2_4905.method18319(-855697420);
					try {
						aClass450_4907 = new Class450(new RSByteBuffer(is), aBigInteger4902, aBigInteger4903);
						for (int i = 0; i < aClass457_Sub1Array4909.length; i++) {
							if (null != aClass457_Sub1Array4909[i] && aClass457_Sub1Array4909[i].method15885(1608905146)) {
								Class453 class453 = aClass450_4907.aClass453Array4936[i];
								aClass457_Sub1Array4909[i].method15880((aClass457_Sub1Array4909[i].method15874(class453.anInt4966 * 1933841649, class453.aByteArray4965, class453.anInt4967 * -1905061093, class453.anInt4968 * 230106837, -1410316652)), -1956901315);
							}
						}
					} catch (Exception exception) {
						for (int i = 0; i < aClass457_Sub1Array4909.length; i++) {
							if (null != aClass457_Sub1Array4909[i] && aClass457_Sub1Array4909[i].method15885(-54369247))
								aClass457_Sub1Array4909[i].method15880(false, 3591406);
						}
					}
					aClass527_Sub8_Sub13_Sub2_4905 = null;
					aBool4908 = true;
				}
			}
		}
	}

	public static Class516 method7110(byte i) {
		return Class515.aClass516_7041;
	}

	static final void method7111(Class665 class665, int i) {
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4426, client.aClass109_11067.aClass2_1367, (byte) 12);
		class527_sub15.buffer.writeByte(string.length() + 1, -1267869779);
		class527_sub15.buffer.writeString(string, -741993066);
		client.aClass109_11067.method1969(class527_sub15, (byte) 1);
	}

	static final void method7112(long l) {
		if (client.aClass509_11072.method8314(-671345511) != null) {
			if (Class30.anInt265 * -349191067 == 1 || 5 == -349191067 * Class30.anInt265)
				Class314_Sub2.method15778(l);
			else if (Class30.anInt265 * -349191067 == 6)
				Class629.method10422(l);
		}
		Class45.method1217(Class402.aClass180_4150, (long) client.anInt11019);
		if (-1 != -2119864417 * client.anInt11237)
			Class706.method14353(-2119864417 * client.anInt11237, -1861580087);
		for (int i = 0; i < client.anInt11260 * 195456631; i++) {
			client.aBoolArray11254[i] = client.aBoolArray11310[i];
			client.aBoolArray11310[i] = false;
		}
		client.anInt11252 = client.anInt11019 * -404058165;
		Class143.method2379(-1, -1, 2017248892);
		if (-1 != -2119864417 * client.anInt11237) {
			client.anInt11260 = 0;
			Class700_Sub36.method17274(2113265878);
		}
		Class402.aClass180_4150.method3131();
		Class611.method10120(Class402.aClass180_4150, -1232251043);
		int i = Class635.method10558((byte) 31);
		if (-1 == i)
			i = client.anInt11185 * 227760777;
		if (i == -1)
			i = 957177321 * client.anInt11167;
		Class73.method1509(i, 193608500);
		int i_18_ = (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.method18564(-1586047188) << 8);
		Class442 class442 = (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.method10637().aClass442_4927);
		Class505.method8226((Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aByte10864), (int) class442.aFloat4918 + i_18_, (int) class442.aFloat4919 + i_18_, -2132013331 * client.anInt11108, -849481142);
		client.anInt11108 = 0;
	}

	static final void method7113(Class665 class665, int i) {
		class665.anInt8526 -= 204761682;
		int i_19_ = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		int i_20_ = class665.anIntArray8525[1 + class665.anInt8526 * 1769813785];
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = (260503469 * client.aClass492ArrayArray11272[i_20_][i_19_].anInt5484);
	}

	static final void method7114(Class527_Sub8_Sub7 class527_sub8_sub7, Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class43.method1182(class527_sub8_sub7, (byte) -20);
		class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = Class19.method768(class527_sub8_sub7, -1167935946);
		class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = Class254.method4702(class527_sub8_sub7, -1179166265);
		class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = Class634.method10549(class527_sub8_sub7, (byte) 20);
	}

	static boolean method7115(int i, int i_21_) {
		return 8 == i || 6 == i;
	}
}
