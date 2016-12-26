/* Class520 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;

public class Class520 {
	short[] aShortArray7050;
	Class317[] aClass317Array7051;
	Class317[] aClass317Array7052;
	Class317 aClass317_7053;
	int anInt7054;
	Class537 this$0;

	void method6338() {
		Class263.method3666(aShortArray7050, (byte) -27);
		for (int i = 0; i < 1016851381 * anInt7054; i++) {
			aClass317Array7051[i].method4225(396294013);
			aClass317Array7052[i].method4225(396294013);
		}
		aClass317_7053.method4225(396294013);
	}

	void method6339(int i, int i_0_) {
		for (/**/; 1016851381 * anInt7054 < i; anInt7054 += 156887709) {
			aClass317Array7051[anInt7054 * 1016851381] = new Class317(3);
			aClass317Array7052[anInt7054 * 1016851381] = new Class317(3);
		}
	}

	void method6340(int i) {
		for (/**/; 1016851381 * anInt7054 < i; anInt7054 += 156887709) {
			aClass317Array7051[anInt7054 * 1016851381] = new Class317(3);
			aClass317Array7052[anInt7054 * 1016851381] = new Class317(3);
		}
	}

	int method6341(Class332 class332, int i, int i_1_) throws IOException {
		if (class332.method4333(aShortArray7050, 0, 583354225) == 0)
			return aClass317Array7051[i].method4220(class332, (byte) -10);
		int i_2_ = 8;
		if (class332.method4333(aShortArray7050, 1, 215188970) == 0)
			i_2_ += aClass317Array7052[i].method4220(class332, (byte) -63);
		else
			i_2_ += 8 + aClass317_7053.method4220(class332, (byte) 70);
		return i_2_;
	}

	void method6342(int i) {
		for (/**/; 1016851381 * anInt7054 < i; anInt7054 += 156887709) {
			aClass317Array7051[anInt7054 * 1016851381] = new Class317(3);
			aClass317Array7052[anInt7054 * 1016851381] = new Class317(3);
		}
	}

	void method6343(int i) {
		for (/**/; 1016851381 * anInt7054 < i; anInt7054 += 156887709) {
			aClass317Array7051[anInt7054 * 1016851381] = new Class317(3);
			aClass317Array7052[anInt7054 * 1016851381] = new Class317(3);
		}
	}

	Class520(Class537 class537) {
		this$0 = class537;
		aShortArray7050 = new short[2];
		aClass317Array7051 = new Class317[16];
		aClass317Array7052 = new Class317[16];
		aClass317_7053 = new Class317(8);
		anInt7054 = 0;
	}

	void method6344(int i) {
		Class263.method3666(aShortArray7050, (byte) -41);
		for (int i_3_ = 0; i_3_ < 1016851381 * anInt7054; i_3_++) {
			aClass317Array7051[i_3_].method4225(396294013);
			aClass317Array7052[i_3_].method4225(396294013);
		}
		aClass317_7053.method4225(396294013);
	}

	void method6345() {
		Class263.method3666(aShortArray7050, (byte) -80);
		for (int i = 0; i < 1016851381 * anInt7054; i++) {
			aClass317Array7051[i].method4225(396294013);
			aClass317Array7052[i].method4225(396294013);
		}
		aClass317_7053.method4225(396294013);
	}

	void method6346() {
		Class263.method3666(aShortArray7050, (byte) -47);
		for (int i = 0; i < 1016851381 * anInt7054; i++) {
			aClass317Array7051[i].method4225(396294013);
			aClass317Array7052[i].method4225(396294013);
		}
		aClass317_7053.method4225(396294013);
	}

	static void method6347(Class536_Sub18_Sub9 class536_sub18_sub9, int i) {
		if (!Class70.aBool752) {
			class536_sub18_sub9.method6484(-373369152);
			Class70.anInt760 -= 354678071;
			if (!class536_sub18_sub9.aBool11717) {
				long l = class536_sub18_sub9.aLong11719 * 4372728678228642485L;
				Class536_Sub18_Sub6 class536_sub18_sub6;
				for (class536_sub18_sub6 = ((Class536_Sub18_Sub6) Class70.aClass4_763.method556(l)); (class536_sub18_sub6 != null && !class536_sub18_sub6.aString11684.equals(class536_sub18_sub9.aString11712)); class536_sub18_sub6 = ((Class536_Sub18_Sub6) Class70.aClass4_763.method557(-994018013))) {
					/* empty */
				}
				if (class536_sub18_sub6 != null && class536_sub18_sub6.method10692(class536_sub18_sub9, (byte) -66))
					Class462.method5618(class536_sub18_sub6, (short) -5156);
			} else {
				for (Class536_Sub18_Sub6 class536_sub18_sub6 = ((Class536_Sub18_Sub6) Class70.aClass700_764.method8248(1023918093)); null != class536_sub18_sub6; class536_sub18_sub6 = ((Class536_Sub18_Sub6) Class70.aClass700_764.method8241(1905935425))) {
					if (class536_sub18_sub6.aString11684.equals(class536_sub18_sub9.aString11712)) {
						boolean bool = false;
						for (Class536_Sub18_Sub9 class536_sub18_sub9_4_ = ((Class536_Sub18_Sub9) class536_sub18_sub6.aClass700_11683.method8248(-686291479)); class536_sub18_sub9_4_ != null; class536_sub18_sub9_4_ = ((Class536_Sub18_Sub9) class536_sub18_sub6.aClass700_11683.method8241(778813099))) {
							if (class536_sub18_sub9 == class536_sub18_sub9_4_) {
								if (class536_sub18_sub6.method10692(class536_sub18_sub9, (byte) -115))
									Class462.method5618(class536_sub18_sub6, (short) 8750);
								bool = true;
								break;
							}
						}
						if (bool)
							break;
					}
				}
			}
		}
	}

	static final void method6348(InterfaceDefinitions class251, Class234 class234, Class668 class668, int i) {
		class251.anInt2643 = class668.anIntArray8541[((class668.anInt8542 -= -1411037171) * 1867269829)] * -1108499687;
		Class668.method8011(class251, 263642117);
	}

	static final void method6349(Class668 class668, int i) {
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		int i_5_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		if (-1 == i_5_)
			throw new RuntimeException("");
		class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = new StringBuilder().append(string).append((char) i_5_).toString();
	}

	public static Class281 method6350(int i, byte i_6_) {
		if (1877163399 * Class281.aClass281_3171.anInt3174 == i)
			return Class281.aClass281_3171;
		if (i == 1877163399 * Class281.aClass281_3168.anInt3174)
			return Class281.aClass281_3168;
		if (i == 1877163399 * Class281.aClass281_3169.anInt3174)
			return Class281.aClass281_3169;
		if (i == Class281.aClass281_3170.anInt3174 * 1877163399)
			return Class281.aClass281_3170;
		if (i == 1877163399 * Class281.aClass281_3172.anInt3174)
			return Class281.aClass281_3172;
		if (i == Class281.aClass281_3173.anInt3174 * 1877163399)
			return Class281.aClass281_3173;
		return null;
	}

	static final void method6351(InterfaceDefinitions class251, Class234 class234, Class668 class668, int i) {
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		if (Class510.method6183(string, class668, -916987741) != null)
			string = string.substring(0, string.length() - 1);
		class251.anObjectArray2740 = Class33.method796(string, class668, (short) -2852);
		class251.aBool2666 = true;
	}

	static int method6352(int i) {
		if (client.aClass251_10992 == null) {
			if (!Class70.aBool752) {
				if (Class331_Sub2.aClass621_10048.aBool8096) {
					if (Class704.aClass536_Sub18_Sub9_8811 != null)
						return (Class704.aClass536_Sub18_Sub9_8811.anInt11709 * -392431989);
				} else if (null != Class70.aClass536_Sub18_Sub9_759)
					return (Class70.aClass536_Sub18_Sub9_759.anInt11709 * -392431989);
			} else {
				Class2 class2 = Class231.method3316(2076920663);
				int i_7_ = Class329.aClass550_3601.method6656(-1509042299);
				int i_8_ = Class329.aClass550_3601.method6657(-1312964630);
				if (!Class70.aBool753) {
					if (i_7_ > -467577567 * Class312.anInt3487 && i_7_ < (917143623 * Class2.anInt95 + -467577567 * Class312.anInt3487)) {
						int i_9_ = -1;
						for (int i_10_ = 0; i_10_ < Class70.anInt760 * 1780207751; i_10_++) {
							if (Class70.aBool780) {
								int i_11_ = (class2.anInt91 * -1214764847 + (20 + 1644471179 * Class70.anInt768) + 1 + (2934691 * Class70.anInt749 * (Class70.anInt760 * 1780207751 - 1 - i_10_)));
								if (i_8_ > (i_11_ - class2.anInt91 * -1214764847 - 1) && (i_8_ < i_11_ + 1780869003 * class2.anInt92))
									i_9_ = i_10_;
							} else {
								int i_12_ = ((Class70.anInt749 * 2934691 * (Class70.anInt760 * 1780207751 - 1 - i_10_)) + (1644471179 * Class70.anInt768 + 31));
								if (i_8_ > (i_12_ - -1214764847 * class2.anInt91 - 1) && (i_8_ < i_12_ + 1780869003 * class2.anInt92))
									i_9_ = i_10_;
							}
						}
						if (-1 != i_9_) {
							int i_13_ = 0;
							Class693 class693 = new Class693(Class70.aClass708_755);
							for (Class536_Sub18_Sub9 class536_sub18_sub9 = ((Class536_Sub18_Sub9) class693.method8198(-909061158)); null != class536_sub18_sub9; class536_sub18_sub9 = (Class536_Sub18_Sub9) class693.next()) {
								if (i_13_++ == i_9_)
									return (-392431989 * class536_sub18_sub9.anInt11709);
							}
						}
					}
				} else if (i_7_ > -467577567 * Class312.anInt3487 && i_7_ < (Class2.anInt95 * 917143623 + Class312.anInt3487 * -467577567)) {
					int i_14_ = -1;
					for (int i_15_ = 0; i_15_ < 1868462753 * Class70.anInt761; i_15_++) {
						if (Class70.aBool780) {
							int i_16_ = (class2.anInt91 * -1214764847 + (20 + 1644471179 * Class70.anInt768) + 1 + 2934691 * Class70.anInt749 * i_15_);
							if (i_8_ > i_16_ - class2.anInt91 * -1214764847 - 1 && i_8_ < class2.anInt92 * 1780869003 + i_16_)
								i_14_ = i_15_;
						} else {
							int i_17_ = (Class70.anInt749 * 2934691 * i_15_ + (1644471179 * Class70.anInt768 + 31));
							if (i_8_ > i_17_ - class2.anInt91 * -1214764847 - 1 && i_8_ < 1780869003 * class2.anInt92 + i_17_)
								i_14_ = i_15_;
						}
					}
					if (i_14_ != -1) {
						int i_18_ = 0;
						Class689 class689 = new Class689(Class70.aClass700_764);
						for (Class536_Sub18_Sub6 class536_sub18_sub6 = ((Class536_Sub18_Sub6) class689.method8174((byte) 8)); null != class536_sub18_sub6; class536_sub18_sub6 = (Class536_Sub18_Sub6) class689.next()) {
							if (i_18_++ == i_14_)
								return -392431989 * (((Class536_Sub18_Sub9) (class536_sub18_sub6.aClass700_11683.aClass536_Sub18_8794.aClass536_Sub18_10506)).anInt11709);
						}
					}
				} else if (null != Class70.aClass536_Sub18_Sub6_754 && i_7_ > -1742636179 * Class283.anInt3184 && (i_7_ < (Class283.anInt3184 * -1742636179 + Canvas_Sub1.anInt11875 * -2003725765))) {
					int i_19_ = -1;
					for (int i_20_ = 0; i_20_ < (Class70.aClass536_Sub18_Sub6_754.anInt11685 * -606992075); i_20_++) {
						if (Class70.aBool780) {
							int i_21_ = (Class70.anInt749 * 2934691 * i_20_ + (Class70.anInt767 * -1907476413 + 20 + class2.anInt91 * -1214764847 + 1));
							if (i_8_ > i_21_ - -1214764847 * class2.anInt91 - 1 && i_8_ < i_21_ + 1780869003 * class2.anInt92)
								i_19_ = i_20_;
						} else {
							int i_22_ = (i_20_ * (2934691 * Class70.anInt749) + (31 + -1907476413 * Class70.anInt767));
							if (i_8_ > i_22_ - -1214764847 * class2.anInt91 - 1 && i_8_ < i_22_ + class2.anInt92 * 1780869003)
								i_19_ = i_20_;
						}
					}
					if (-1 != i_19_) {
						int i_23_ = 0;
						Class689 class689 = new Class689(Class70.aClass536_Sub18_Sub6_754.aClass700_11683);
						for (Class536_Sub18_Sub9 class536_sub18_sub9 = ((Class536_Sub18_Sub9) class689.method8174((byte) 8)); class536_sub18_sub9 != null; class536_sub18_sub9 = (Class536_Sub18_Sub9) class689.next()) {
							if (i_23_++ == i_19_)
								return (class536_sub18_sub9.anInt11709 * -392431989);
						}
					}
				}
			}
		}
		return -1;
	}
}
