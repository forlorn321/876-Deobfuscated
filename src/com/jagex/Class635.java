/* Class635 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class635 implements Interface76 {
	public static Class635 aClass635_8297;
	int anInt8298;
	public static Class635 aClass635_8299;
	static Class635 aClass635_8300 = new Class635(2, 0);
	int anInt8301;
	public static int anInt8302;

	public int method91() {
		return anInt8301 * 834154609;
	}

	static {
		aClass635_8297 = new Class635(0, 1);
		aClass635_8299 = new Class635(1, 2);
	}

	Class635(int i, int i_0_) {
		anInt8298 = -196416463 * i;
		anInt8301 = i_0_ * -121794415;
	}

	public static Class635[] method10551(int i) {
		return (new Class635[] { aClass635_8297, aClass635_8299, aClass635_8300 });
	}

	public int method42() {
		return anInt8301 * 834154609;
	}

	public int method87() {
		return anInt8301 * 834154609;
	}

	static final void method10552(Class665 class665, int i) {
		class665.anInt8527 += (class665.anIntArray8545[891367231 * class665.anInt8527] * -1038991169);
	}

	static final void method10553(Class665 class665, byte i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = class243.aString2578;
	}

	static final void method10554(Class665 class665, byte i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = class665.aClass527_Sub21_8537.method16211(((String) (class665.anObjectArray8541[((class665.anInt8528 -= 433009517) * 318492261)])), -1018810540);
	}

	static final void method10555(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = 0;
	}

	public static final void method10556(int i) {
		if (Class32.loginStage * -17413703 != 1) {
			Class32.aClass109_270.method1968((byte) 120);
			Class106.method1886(262144);
			Class387.method6437(1211952778);
		}
	}

	static boolean method10557(int i) {
		return Class66.aBool758;
	}

	static int method10558(byte i) {
		if (null == client.aClass243_11150) {
			if (!Class35.aBool338) {
				if (Class271.aClass624_3128.aBool8155) {
					if (null != Class42.aClass527_Sub8_Sub7_457)
						return (Class42.aClass527_Sub8_Sub7_457.anInt11643 * 2044890211);
				} else if (Class200.aClass527_Sub8_Sub7_2202 != null)
					return (Class200.aClass527_Sub8_Sub7_2202.anInt11643 * 2044890211);
			} else {
				Class22 class22 = Class29.method869(-1390486224);
				int i_1_ = Class534.aClass553_7213.method9158(-1412060454);
				int i_2_ = Class534.aClass553_7213.method9159(1922007926);
				if (!Class35.aBool339) {
					if (i_1_ > -1375491723 * Class230.anInt2355 && i_1_ < (-1375491723 * Class230.anInt2355 + -1309847599 * Class100.anInt1187)) {
						int i_3_ = -1;
						for (int i_4_ = 0; i_4_ < Class35.anInt346 * -943170217; i_4_++) {
							if (Class35.aBool365) {
								int i_5_ = (((Class35.anInt346 * -943170217 - 1 - i_4_) * (-1297575597 * Class35.anInt335)) + (class22.anInt215 * -63286397 + (20 + 479584441 * Class80.anInt807) + 1));
								if ((i_2_ > i_5_ - class22.anInt215 * -63286397 - 1) && (i_2_ < 672688101 * class22.anInt213 + i_5_))
									i_3_ = i_4_;
							} else {
								int i_6_ = (((Class35.anInt346 * -943170217 - 1 - i_4_) * (Class35.anInt335 * -1297575597)) + (31 + Class80.anInt807 * 479584441));
								if ((i_2_ > i_6_ - -63286397 * class22.anInt215 - 1) && (i_2_ < class22.anInt213 * 672688101 + i_6_))
									i_3_ = i_4_;
							}
						}
						if (-1 != i_3_) {
							int i_7_ = 0;
							Class691 class691 = new Class691(Class35.aClass694_348);
							for (Class527_Sub8_Sub7 class527_sub8_sub7 = ((Class527_Sub8_Sub7) class691.method14010(-70182425)); null != class527_sub8_sub7; class527_sub8_sub7 = (Class527_Sub8_Sub7) class691.next()) {
								if (i_7_++ == i_3_)
									return (class527_sub8_sub7.anInt11643 * 2044890211);
							}
						}
					}
				} else if (i_1_ > Class230.anInt2355 * -1375491723 && i_1_ < (Class100.anInt1187 * -1309847599 + Class230.anInt2355 * -1375491723)) {
					int i_8_ = -1;
					for (int i_9_ = 0; i_9_ < -1282519069 * Class35.anInt347; i_9_++) {
						if (Class35.aBool365) {
							int i_10_ = (Class35.anInt335 * -1297575597 * i_9_ + (1 + (-63286397 * class22.anInt215 + (20 + 479584441 * Class80.anInt807))));
							if (i_2_ > i_10_ - -63286397 * class22.anInt215 - 1 && i_2_ < class22.anInt213 * 672688101 + i_10_)
								i_8_ = i_9_;
						} else {
							int i_11_ = (479584441 * Class80.anInt807 + 31 + i_9_ * (Class35.anInt335 * -1297575597));
							if (i_2_ > i_11_ - -63286397 * class22.anInt215 - 1 && i_2_ < 672688101 * class22.anInt213 + i_11_)
								i_8_ = i_9_;
						}
					}
					if (-1 != i_8_) {
						int i_12_ = 0;
						Class689 class689 = new Class689(Class35.aClass693_350);
						for (Class527_Sub8_Sub4 class527_sub8_sub4 = ((Class527_Sub8_Sub4) class689.method13987((byte) 18)); class527_sub8_sub4 != null; class527_sub8_sub4 = (Class527_Sub8_Sub4) class689.next()) {
							if (i_12_++ == i_8_)
								return (2044890211 * (((Class527_Sub8_Sub7) (class527_sub8_sub4.aClass693_11624.aClass527_Sub8_8734.aClass527_Sub8_10400)).anInt11643));
						}
					}
				} else if (Class35.aClass527_Sub8_Sub4_340 != null && i_1_ > Class576.anInt7640 * -860825733 && i_1_ < (Class279.anInt3172 * 949523843 + Class576.anInt7640 * -860825733)) {
					int i_13_ = -1;
					for (int i_14_ = 0; i_14_ < 1731231531 * (Class35.aClass527_Sub8_Sub4_340.anInt11625); i_14_++) {
						if (Class35.aBool365) {
							int i_15_ = (i_14_ * (-1297575597 * Class35.anInt335) + (-63286397 * class22.anInt215 + (20 + 182965925 * Class35.anInt354) + 1));
							if (i_2_ > i_15_ - class22.anInt215 * -63286397 - 1 && i_2_ < i_15_ + 672688101 * class22.anInt213)
								i_13_ = i_14_;
						} else {
							int i_16_ = (Class35.anInt335 * -1297575597 * i_14_ + (31 + 182965925 * Class35.anInt354));
							if (i_2_ > i_16_ - -63286397 * class22.anInt215 - 1 && i_2_ < class22.anInt213 * 672688101 + i_16_)
								i_13_ = i_14_;
						}
					}
					if (i_13_ != -1) {
						int i_17_ = 0;
						Class689 class689 = new Class689(Class35.aClass527_Sub8_Sub4_340.aClass693_11624);
						for (Class527_Sub8_Sub7 class527_sub8_sub7 = ((Class527_Sub8_Sub7) class689.method13987((byte) 42)); class527_sub8_sub7 != null; class527_sub8_sub7 = (Class527_Sub8_Sub7) class689.next()) {
							if (i_17_++ == i_13_)
								return (2044890211 * class527_sub8_sub7.anInt11643);
						}
					}
				}
			}
		}
		return -1;
	}
}
