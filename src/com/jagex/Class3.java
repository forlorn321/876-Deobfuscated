/* Class3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class3 {
	static Class604_Sub1[] aClass604_Sub1Array31;
	public static Class13 aClass13_32;
	public static Class13 aClass13_33;
	public static Class13 aClass13_34;
	static int anInt35;
	public static Class13 aClass13_36;
	public static Class13 aClass13_37;
	public static boolean aBool38 = false;
	public static Class13 aClass13_39;
	static int anInt40;
	public static Class13 aClass13_41;
	static Class638 aClass638_42;
	public static boolean aBool43;

	public static Class604_Sub1 method530() {
		return Class254.method4698(aClass13_34.anInt181 * 44791937, -1154305347);
	}

	static {
		aClass604_Sub1Array31 = new Class604_Sub1[0];
		anInt40 = -286885067;
		anInt35 = 0;
		aClass638_42 = null;
		aBool43 = false;
	}

	public static void method531() {
		if (aBool43) {
			if (865836043 * anInt35 < Class605.anInt7972 * 451447095)
				anInt35 = 1073518341 * Class605.anInt7972;
			while (anInt35 * 865836043 < 1671964397 * Class638.anInt8321) {
				Class604_Sub1 class604_sub1 = Class254.method4698(865836043 * anInt35, -1154305347);
				if (null == class604_sub1 || -1 != class604_sub1.anInt10576 * 741395911)
					anInt35 += 1454706595;
				else {
					if (aClass638_42 == null)
						aClass638_42 = (client.aClass654_11071.method10904(class604_sub1.aString10577, -1460763393));
					int i = aClass638_42.anInt8320 * 1047194135;
					if (-1 == i)
						break;
					class604_sub1.anInt10576 = -1107368969 * i;
					anInt35 += 1454706595;
					aClass638_42 = null;
				}
			}
		}
	}

	public static void method532() {
		if (-1 != aClass13_41.anInt181 * 44791937)
			Class645.method10747(44791937 * aClass13_41.anInt181, aClass13_41.aString178, aClass13_41.anInt179 * 375656933, aClass13_41.anInt180 * -941127567, 590414775);
	}

	public static boolean method533(int i, String string, int i_0_, int i_1_) {
		aClass13_34 = new Class13();
		aClass13_34.anInt181 = i * 1189922689;
		aClass13_34.aString178 = string;
		aClass13_34.anInt179 = i_0_ * -1993161747;
		aClass13_34.anInt180 = i_1_ * -911001455;
		return true;
	}

	public static Class604_Sub1 method534() {
		return Class254.method4698(aClass13_34.anInt181 * 44791937, -1154305347);
	}

	public static void method535() {
		if (-1 != aClass13_41.anInt181 * 44791937)
			Class645.method10747(44791937 * aClass13_41.anInt181, aClass13_41.aString178, aClass13_41.anInt179 * 375656933, aClass13_41.anInt180 * -941127567, 676680699);
	}

	public static void method536() {
		if (-1 != aClass13_41.anInt181 * 44791937)
			Class645.method10747(44791937 * aClass13_41.anInt181, aClass13_41.aString178, aClass13_41.anInt179 * 375656933, aClass13_41.anInt180 * -941127567, 474276061);
	}

	public static void method537() {
		if (-1 != aClass13_41.anInt181 * 44791937)
			Class645.method10747(44791937 * aClass13_41.anInt181, aClass13_41.aString178, aClass13_41.anInt179 * 375656933, aClass13_41.anInt180 * -941127567, -265695658);
	}

	public static void method538() {
		if (-1 != aClass13_41.anInt181 * 44791937)
			Class645.method10747(44791937 * aClass13_41.anInt181, aClass13_41.aString178, aClass13_41.anInt179 * 375656933, aClass13_41.anInt180 * -941127567, -1131148673);
	}

	static void method539(int i, int i_2_, int i_3_, boolean bool, int i_4_, boolean bool_5_) {
		if (i < i_2_) {
			int i_6_ = (i + i_2_) / 2;
			int i_7_ = i;
			Class604_Sub1 class604_sub1 = aClass604_Sub1Array31[i_6_];
			aClass604_Sub1Array31[i_6_] = aClass604_Sub1Array31[i_2_];
			aClass604_Sub1Array31[i_2_] = class604_sub1;
			for (int i_8_ = i; i_8_ < i_2_; i_8_++) {
				if (Class385.method6429(aClass604_Sub1Array31[i_8_], class604_sub1, i_3_, bool, i_4_, bool_5_, (byte) 4) <= 0) {
					Class604_Sub1 class604_sub1_9_ = aClass604_Sub1Array31[i_8_];
					aClass604_Sub1Array31[i_8_] = aClass604_Sub1Array31[i_7_];
					aClass604_Sub1Array31[i_7_++] = class604_sub1_9_;
				}
			}
			aClass604_Sub1Array31[i_2_] = aClass604_Sub1Array31[i_7_];
			aClass604_Sub1Array31[i_7_] = class604_sub1;
			Class28.method866(i, i_7_ - 1, i_3_, bool, i_4_, bool_5_, 407316478);
			Class28.method866(i_7_ + 1, i_2_, i_3_, bool, i_4_, bool_5_, -166173311);
		}
	}

	public static void method540(boolean bool, byte[] is) {
		if (Class527_Sub6.aClass527_Sub38_10397 == null)
			Class527_Sub6.aClass527_Sub38_10397 = new RSByteBuffer(20000);
		Class527_Sub6.aClass527_Sub38_10397.writeBytes(is, 0, is.length, (byte) 104);
		if (bool) {
			Class215.method3962((Class527_Sub6.aClass527_Sub38_10397.buffer), 1679421826);
			aClass604_Sub1Array31 = new Class604_Sub1[Class318.anInt3535 * -1134558959];
			int i = 0;
			for (int i_10_ = Class605.anInt7972 * 451447095; i_10_ <= Class638.anInt8321 * 1671964397; i_10_++) {
				Class604_Sub1 class604_sub1 = Class254.method4698(i_10_, -1154305347);
				if (class604_sub1 != null)
					aClass604_Sub1Array31[i++] = class604_sub1;
			}
			aBool38 = false;
			Class273.aLong3141 = Class234.method4347(-1408626088) * 4183478645639791091L;
			Class527_Sub6.aClass527_Sub38_10397 = null;
		}
	}

	public static Class604_Sub1 method541() {
		anInt40 = 0;
		return Class464.method7631(-706535260);
	}

	static int method542(Class604_Sub1 class604_sub1, Class604_Sub1 class604_sub1_11_, int i, boolean bool, int i_12_, boolean bool_13_) {
		int i_14_ = Class501.method8193(class604_sub1, class604_sub1_11_, i, bool, -614294691);
		if (0 != i_14_) {
			if (bool)
				return -i_14_;
			return i_14_;
		}
		if (-1 == i_12_)
			return 0;
		int i_15_ = Class501.method8193(class604_sub1, class604_sub1_11_, i_12_, bool_13_, -614294691);
		if (bool_13_)
			return -i_15_;
		return i_15_;
	}

	public static Class604_Sub1 method543() {
		if (1306745497 * anInt40 < aClass604_Sub1Array31.length)
			return (aClass604_Sub1Array31[(anInt40 += 972708265) * 1306745497 - 1]);
		return null;
	}

	static int method544(Class604_Sub1 class604_sub1, Class604_Sub1 class604_sub1_16_, int i, boolean bool) {
		if (i == 1) {
			int i_17_ = 1898710151 * class604_sub1.anInt7967;
			int i_18_ = class604_sub1_16_.anInt7967 * 1898710151;
			if (!bool) {
				if (-1 == i_17_)
					i_17_ = 2001;
				if (-1 == i_18_)
					i_18_ = 2001;
			}
			return i_17_ - i_18_;
		}
		if (i == 2)
			return Class23.method829(class604_sub1.method16320(1996225803), class604_sub1_16_.method16320(1773579683), Class144_Sub1.aClass671_8995, 1241715480);
		if (3 == i) {
			if (class604_sub1.aString10578.equals("-")) {
				if (class604_sub1_16_.aString10578.equals("-"))
					return 0;
				return bool ? -1 : 1;
			}
			if (class604_sub1_16_.aString10578.equals("-"))
				return bool ? 1 : -1;
			return Class23.method829(class604_sub1.aString10578, class604_sub1_16_.aString10578, Class144_Sub1.aClass671_8995, 70018889);
		}
		if (i == 4)
			return (class604_sub1.method10026(1498581368) ? class604_sub1_16_.method10026(1074282834) ? 0 : 1 : class604_sub1_16_.method10026(1364062446) ? -1 : 0);
		if (i == 5)
			return (class604_sub1.method10027(-946722198) ? class604_sub1_16_.method10027(-599069163) ? 0 : 1 : class604_sub1_16_.method10027(7124332) ? -1 : 0);
		if (i == 6)
			return (class604_sub1.method10028((byte) -68) ? class604_sub1_16_.method10028((byte) -71) ? 0 : 1 : class604_sub1_16_.method10028((byte) -126) ? -1 : 0);
		if (7 == i)
			return (class604_sub1.method10025(1717327608) ? class604_sub1_16_.method10025(1312124662) ? 0 : 1 : class604_sub1_16_.method10025(1764194751) ? -1 : 0);
		if (8 == i) {
			int i_19_ = class604_sub1.anInt10576 * 741395911;
			int i_20_ = class604_sub1_16_.anInt10576 * 741395911;
			if (bool) {
				if (i_19_ == 1000)
					i_19_ = -1;
				if (1000 == i_20_)
					i_20_ = -1;
			} else {
				if (-1 == i_19_)
					i_19_ = 1000;
				if (i_20_ == -1)
					i_20_ = 1000;
			}
			return i_19_ - i_20_;
		}
		return (-642278059 * class604_sub1.anInt10579 - class604_sub1_16_.anInt10579 * -642278059);
	}

	public static Class604_Sub1 method545() {
		return Class254.method4698(aClass13_34.anInt181 * 44791937, -1154305347);
	}

	public static Class604_Sub1 method546() {
		if (1306745497 * anInt40 < aClass604_Sub1Array31.length)
			return (aClass604_Sub1Array31[(anInt40 += 972708265) * 1306745497 - 1]);
		return null;
	}

	public static void method547(String string, int i) {
		if (aClass13_36 == null)
			aClass13_36 = new Class13();
		aClass13_36.aString178 = string;
		aClass13_36.anInt181 = (1099 + i) * 1189922689;
		aClass13_36.anInt179 = (Class46.method1235(Class73.aClass677_790, Class682.aClass682_8646, aClass13_36.anInt181 * 44791937, -1353880909) * -1993161747);
		aClass13_36.anInt180 = (Class556.method9421(Class73.aClass677_790, Class682.aClass682_8646, aClass13_36.anInt181 * 44791937, (byte) 4) * -911001455);
	}

	public static void method548(int i, boolean bool, int i_21_, boolean bool_22_) {
		Class28.method866(0, aClass604_Sub1Array31.length - 1, i, bool, i_21_, bool_22_, -1014788583);
		anInt35 = 0;
		aClass638_42 = null;
	}

	public static void method549(int i, boolean bool, int i_23_, boolean bool_24_) {
		Class28.method866(0, aClass604_Sub1Array31.length - 1, i, bool, i_23_, bool_24_, -1071803351);
		anInt35 = 0;
		aClass638_42 = null;
	}

	public static void method550() {
		if (aBool43) {
			if (865836043 * anInt35 < Class605.anInt7972 * 451447095)
				anInt35 = 1073518341 * Class605.anInt7972;
			while (anInt35 * 865836043 < 1671964397 * Class638.anInt8321) {
				Class604_Sub1 class604_sub1 = Class254.method4698(865836043 * anInt35, -1154305347);
				if (null == class604_sub1 || -1 != class604_sub1.anInt10576 * 741395911)
					anInt35 += 1454706595;
				else {
					if (aClass638_42 == null)
						aClass638_42 = (client.aClass654_11071.method10904(class604_sub1.aString10577, -1460763393));
					int i = aClass638_42.anInt8320 * 1047194135;
					if (-1 == i)
						break;
					class604_sub1.anInt10576 = -1107368969 * i;
					anInt35 += 1454706595;
					aClass638_42 = null;
				}
			}
		}
	}

	static void method551(int i, int i_25_, int i_26_, boolean bool, int i_27_, boolean bool_28_) {
		if (i < i_25_) {
			int i_29_ = (i + i_25_) / 2;
			int i_30_ = i;
			Class604_Sub1 class604_sub1 = aClass604_Sub1Array31[i_29_];
			aClass604_Sub1Array31[i_29_] = aClass604_Sub1Array31[i_25_];
			aClass604_Sub1Array31[i_25_] = class604_sub1;
			for (int i_31_ = i; i_31_ < i_25_; i_31_++) {
				if (Class385.method6429(aClass604_Sub1Array31[i_31_], class604_sub1, i_26_, bool, i_27_, bool_28_, (byte) 4) <= 0) {
					Class604_Sub1 class604_sub1_32_ = aClass604_Sub1Array31[i_31_];
					aClass604_Sub1Array31[i_31_] = aClass604_Sub1Array31[i_30_];
					aClass604_Sub1Array31[i_30_++] = class604_sub1_32_;
				}
			}
			aClass604_Sub1Array31[i_25_] = aClass604_Sub1Array31[i_30_];
			aClass604_Sub1Array31[i_30_] = class604_sub1;
			Class28.method866(i, i_30_ - 1, i_26_, bool, i_27_, bool_28_, -104376482);
			Class28.method866(i_30_ + 1, i_25_, i_26_, bool, i_27_, bool_28_, -891618908);
		}
	}

	Class3() throws Throwable {
		throw new Error();
	}

	static void method552(int i, int i_33_, int i_34_, boolean bool, int i_35_, boolean bool_36_) {
		if (i < i_33_) {
			int i_37_ = (i + i_33_) / 2;
			int i_38_ = i;
			Class604_Sub1 class604_sub1 = aClass604_Sub1Array31[i_37_];
			aClass604_Sub1Array31[i_37_] = aClass604_Sub1Array31[i_33_];
			aClass604_Sub1Array31[i_33_] = class604_sub1;
			for (int i_39_ = i; i_39_ < i_33_; i_39_++) {
				if (Class385.method6429(aClass604_Sub1Array31[i_39_], class604_sub1, i_34_, bool, i_35_, bool_36_, (byte) 4) <= 0) {
					Class604_Sub1 class604_sub1_40_ = aClass604_Sub1Array31[i_39_];
					aClass604_Sub1Array31[i_39_] = aClass604_Sub1Array31[i_38_];
					aClass604_Sub1Array31[i_38_++] = class604_sub1_40_;
				}
			}
			aClass604_Sub1Array31[i_33_] = aClass604_Sub1Array31[i_38_];
			aClass604_Sub1Array31[i_38_] = class604_sub1;
			Class28.method866(i, i_38_ - 1, i_34_, bool, i_35_, bool_36_, -2008686070);
			Class28.method866(i_38_ + 1, i_33_, i_34_, bool, i_35_, bool_36_, 283099450);
		}
	}

	static void method553(int i, int i_41_, int i_42_, boolean bool, int i_43_, boolean bool_44_) {
		if (i < i_41_) {
			int i_45_ = (i + i_41_) / 2;
			int i_46_ = i;
			Class604_Sub1 class604_sub1 = aClass604_Sub1Array31[i_45_];
			aClass604_Sub1Array31[i_45_] = aClass604_Sub1Array31[i_41_];
			aClass604_Sub1Array31[i_41_] = class604_sub1;
			for (int i_47_ = i; i_47_ < i_41_; i_47_++) {
				if (Class385.method6429(aClass604_Sub1Array31[i_47_], class604_sub1, i_42_, bool, i_43_, bool_44_, (byte) 4) <= 0) {
					Class604_Sub1 class604_sub1_48_ = aClass604_Sub1Array31[i_47_];
					aClass604_Sub1Array31[i_47_] = aClass604_Sub1Array31[i_46_];
					aClass604_Sub1Array31[i_46_++] = class604_sub1_48_;
				}
			}
			aClass604_Sub1Array31[i_41_] = aClass604_Sub1Array31[i_46_];
			aClass604_Sub1Array31[i_46_] = class604_sub1;
			Class28.method866(i, i_46_ - 1, i_42_, bool, i_43_, bool_44_, -688696012);
			Class28.method866(i_46_ + 1, i_41_, i_42_, bool, i_43_, bool_44_, -1923978575);
		}
	}

	static int method554(Class604_Sub1 class604_sub1, Class604_Sub1 class604_sub1_49_, int i, boolean bool, int i_50_, boolean bool_51_) {
		int i_52_ = Class501.method8193(class604_sub1, class604_sub1_49_, i, bool, -614294691);
		if (0 != i_52_) {
			if (bool)
				return -i_52_;
			return i_52_;
		}
		if (-1 == i_50_)
			return 0;
		int i_53_ = Class501.method8193(class604_sub1, class604_sub1_49_, i_50_, bool_51_, -614294691);
		if (bool_51_)
			return -i_53_;
		return i_53_;
	}

	static int method555(Class604_Sub1 class604_sub1, Class604_Sub1 class604_sub1_54_, int i, boolean bool) {
		if (i == 1) {
			int i_55_ = 1898710151 * class604_sub1.anInt7967;
			int i_56_ = class604_sub1_54_.anInt7967 * 1898710151;
			if (!bool) {
				if (-1 == i_55_)
					i_55_ = 2001;
				if (-1 == i_56_)
					i_56_ = 2001;
			}
			return i_55_ - i_56_;
		}
		if (i == 2)
			return Class23.method829(class604_sub1.method16320(2116570271), class604_sub1_54_.method16320(1810928497), Class144_Sub1.aClass671_8995, 1720231623);
		if (3 == i) {
			if (class604_sub1.aString10578.equals("-")) {
				if (class604_sub1_54_.aString10578.equals("-"))
					return 0;
				return bool ? -1 : 1;
			}
			if (class604_sub1_54_.aString10578.equals("-"))
				return bool ? 1 : -1;
			return Class23.method829(class604_sub1.aString10578, class604_sub1_54_.aString10578, Class144_Sub1.aClass671_8995, 329477114);
		}
		if (i == 4)
			return (class604_sub1.method10026(1264916090) ? class604_sub1_54_.method10026(1135351396) ? 0 : 1 : class604_sub1_54_.method10026(1999859663) ? -1 : 0);
		if (i == 5)
			return (class604_sub1.method10027(800402336) ? class604_sub1_54_.method10027(-158317717) ? 0 : 1 : class604_sub1_54_.method10027(765159664) ? -1 : 0);
		if (i == 6)
			return (class604_sub1.method10028((byte) -89) ? class604_sub1_54_.method10028((byte) -49) ? 0 : 1 : class604_sub1_54_.method10028((byte) -22) ? -1 : 0);
		if (7 == i)
			return (class604_sub1.method10025(2141950218) ? class604_sub1_54_.method10025(1085340268) ? 0 : 1 : class604_sub1_54_.method10025(1107186062) ? -1 : 0);
		if (8 == i) {
			int i_57_ = class604_sub1.anInt10576 * 741395911;
			int i_58_ = class604_sub1_54_.anInt10576 * 741395911;
			if (bool) {
				if (i_57_ == 1000)
					i_57_ = -1;
				if (1000 == i_58_)
					i_58_ = -1;
			} else {
				if (-1 == i_57_)
					i_57_ = 1000;
				if (i_58_ == -1)
					i_58_ = 1000;
			}
			return i_57_ - i_58_;
		}
		return (-642278059 * class604_sub1.anInt10579 - class604_sub1_54_.anInt10579 * -642278059);
	}

	public static Class604_Sub1 method556() {
		anInt40 = 0;
		return Class464.method7631(-704170599);
	}

	static int method557(Class604_Sub1 class604_sub1, Class604_Sub1 class604_sub1_59_, int i, boolean bool) {
		if (i == 1) {
			int i_60_ = 1898710151 * class604_sub1.anInt7967;
			int i_61_ = class604_sub1_59_.anInt7967 * 1898710151;
			if (!bool) {
				if (-1 == i_60_)
					i_60_ = 2001;
				if (-1 == i_61_)
					i_61_ = 2001;
			}
			return i_60_ - i_61_;
		}
		if (i == 2)
			return Class23.method829(class604_sub1.method16320(1999906158), class604_sub1_59_.method16320(1882630142), Class144_Sub1.aClass671_8995, 357916067);
		if (3 == i) {
			if (class604_sub1.aString10578.equals("-")) {
				if (class604_sub1_59_.aString10578.equals("-"))
					return 0;
				return bool ? -1 : 1;
			}
			if (class604_sub1_59_.aString10578.equals("-"))
				return bool ? 1 : -1;
			return Class23.method829(class604_sub1.aString10578, class604_sub1_59_.aString10578, Class144_Sub1.aClass671_8995, 1016245252);
		}
		if (i == 4)
			return (class604_sub1.method10026(1263055401) ? class604_sub1_59_.method10026(722147392) ? 0 : 1 : class604_sub1_59_.method10026(1021955224) ? -1 : 0);
		if (i == 5)
			return (class604_sub1.method10027(-355682398) ? class604_sub1_59_.method10027(-980727705) ? 0 : 1 : class604_sub1_59_.method10027(421680419) ? -1 : 0);
		if (i == 6)
			return (class604_sub1.method10028((byte) -120) ? class604_sub1_59_.method10028((byte) -119) ? 0 : 1 : class604_sub1_59_.method10028((byte) -117) ? -1 : 0);
		if (7 == i)
			return (class604_sub1.method10025(1524250522) ? class604_sub1_59_.method10025(2015190446) ? 0 : 1 : class604_sub1_59_.method10025(1676366800) ? -1 : 0);
		if (8 == i) {
			int i_62_ = class604_sub1.anInt10576 * 741395911;
			int i_63_ = class604_sub1_59_.anInt10576 * 741395911;
			if (bool) {
				if (i_62_ == 1000)
					i_62_ = -1;
				if (1000 == i_63_)
					i_63_ = -1;
			} else {
				if (-1 == i_62_)
					i_62_ = 1000;
				if (i_63_ == -1)
					i_63_ = 1000;
			}
			return i_62_ - i_63_;
		}
		return (-642278059 * class604_sub1.anInt10579 - class604_sub1_59_.anInt10579 * -642278059);
	}

	public static void method558(Class180 class180, Class459 class459, byte i) {
		Class185[] class185s = Class165.method2655(class459, -1153335513 * Class684.anInt8652, 0);
		Class631.aClass147Array8257 = new Class147[class185s.length];
		for (int i_64_ = 0; i_64_ < class185s.length; i_64_++)
			Class631.aClass147Array8257[i_64_] = class180.method3271(class185s[i_64_], true);
		class185s = Class165.method2655(class459, Class188.anInt2121 * -167207879, 0);
		Class650.aClass147Array8373 = new Class147[class185s.length];
		for (int i_65_ = 0; i_65_ < class185s.length; i_65_++)
			Class650.aClass147Array8373[i_65_] = class180.method3271(class185s[i_65_], true);
		class185s = Class165.method2655(class459, Class705.anInt8832 * 1680943229, 0);
		Class238.aClass147Array2388 = new Class147[class185s.length];
		int i_66_ = 25;
		for (int i_67_ = 0; i_67_ < class185s.length; i_67_++) {
			class185s[i_67_].method3585(-i_66_ + (int) (Math.random() * (double) i_66_ * 2.0), -i_66_ + (int) (Math.random() * (double) i_66_ * 2.0), -i_66_ + (int) (Math.random() * (double) i_66_ * 2.0));
			Class238.aClass147Array2388[i_67_] = class180.method3271(class185s[i_67_], true);
		}
		class185s = Class165.method2655(class459, Class49.anInt510 * 735383299, 0);
		Class294.aClass147Array3272 = new Class147[class185s.length];
		for (int i_68_ = 0; i_68_ < class185s.length; i_68_++)
			Class294.aClass147Array3272[i_68_] = class180.method3271(class185s[i_68_], true);
		class185s = Class165.method2655(class459, Class659.anInt8491 * -1741658977, 0);
		Class49.aClass147Array507 = new Class147[class185s.length];
		i_66_ = 12;
		for (int i_69_ = 0; i_69_ < class185s.length; i_69_++) {
			class185s[i_69_].method3585(-i_66_ + (int) (Math.random() * (double) i_66_ * 2.0), -i_66_ + (int) (Math.random() * (double) i_66_ * 2.0), -i_66_ + (int) (Math.random() * (double) i_66_ * 2.0));
			Class49.aClass147Array507[i_69_] = class180.method3271(class185s[i_69_], true);
		}
		class185s = Class165.method2655(class459, Class527_Sub41.anInt10754 * 1463560143, 0);
		Class191.aClass147Array2138 = new Class147[class185s.length];
		i_66_ = 12;
		for (int i_70_ = 0; i_70_ < class185s.length; i_70_++) {
			class185s[i_70_].method3585(-i_66_ + (int) (Math.random() * (double) i_66_ * 2.0), -i_66_ + (int) (Math.random() * (double) i_66_ * 2.0), -i_66_ + (int) (Math.random() * (double) i_66_ * 2.0));
			Class191.aClass147Array2138[i_70_] = class180.method3271(class185s[i_70_], true);
		}
		Class178.aClass147_2056 = class180.method3271(Class165.method2653(class459, (Class95.anInt1147 * -156185833), 0), true);
		Class452.aClass147_4962 = class180.method3271(Class165.method2653(class459, (Class49.anInt509 * -158541985), 0), true);
		class185s = Class165.method2655(class459, Class24_Sub22.anInt10986 * -913661337, 0);
		Class499.aClass147Array5592 = new Class147[class185s.length];
		for (int i_71_ = 0; i_71_ < class185s.length; i_71_++)
			Class499.aClass147Array5592[i_71_] = class180.method3271(class185s[i_71_], true);
	}
}
