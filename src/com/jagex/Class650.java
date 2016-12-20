/* Class650 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class650 implements Interface14 {
	Class646 aClass646_8372;
	static Class147[] aClass147Array8373;
	public int anInt8374;
	public int anInt8375;
	int anInt8376;
	public static int anInt8377;

	void method10854(RSByteBuffer class527_sub38, int i) {
		if (i == 1)
			anInt8376 = class527_sub38.method16466(-2098287162) * -1565398123;
		else if (2 == i) {
			anInt8374 = class527_sub38.readUnsignedByte() * 1599249969;
			anInt8375 = class527_sub38.readUnsignedByte() * 330120003;
		}
	}

	public void method85() {
		/* empty */
	}

	void method10855(RSByteBuffer class527_sub38, int i, int i_0_) {
		if (i == 1)
			anInt8376 = class527_sub38.method16466(-1610373090) * -1565398123;
		else if (2 == i) {
			anInt8374 = class527_sub38.readUnsignedByte() * 1599249969;
			anInt8375 = class527_sub38.readUnsignedByte() * 330120003;
		}
	}

	public synchronized Class185 method10856(int i) {
		Class185 class185 = ((Class185) aClass646_8372.aClass205_8350.method3787((long) (1130629053 * anInt8376)));
		if (null != class185)
			return class185;
		class185 = Class165.method2653(aClass646_8372.aClass459_8349, 1130629053 * anInt8376, 0);
		if (null != class185)
			aClass646_8372.aClass205_8350.method3790(class185, (long) (1130629053 * anInt8376));
		return class185;
	}

	public void method86(int i) {
		/* empty */
	}

	public void method83(RSByteBuffer class527_sub38) {
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			if (i == 0)
				break;
			method10855(class527_sub38, i, 1199901668);
		}
	}

	public synchronized Class185 method10857() {
		Class185 class185 = ((Class185) aClass646_8372.aClass205_8350.method3787((long) (1130629053 * anInt8376)));
		if (null != class185)
			return class185;
		class185 = Class165.method2653(aClass646_8372.aClass459_8349, 1130629053 * anInt8376, 0);
		if (null != class185)
			aClass646_8372.aClass205_8350.method3790(class185, (long) (1130629053 * anInt8376));
		return class185;
	}

	Class650(int i, Class646 class646) {
		aClass646_8372 = class646;
	}

	public void method84() {
		/* empty */
	}

	void method10858(RSByteBuffer class527_sub38, int i) {
		if (i == 1)
			anInt8376 = class527_sub38.method16466(-1649023240) * -1565398123;
		else if (2 == i) {
			anInt8374 = class527_sub38.readUnsignedByte() * 1599249969;
			anInt8375 = class527_sub38.readUnsignedByte() * 330120003;
		}
	}

	void method10859(RSByteBuffer class527_sub38, int i) {
		if (i == 1)
			anInt8376 = class527_sub38.method16466(-1853812805) * -1565398123;
		else if (2 == i) {
			anInt8374 = class527_sub38.readUnsignedByte() * 1599249969;
			anInt8375 = class527_sub38.readUnsignedByte() * 330120003;
		}
	}

	public void method73(RSByteBuffer class527_sub38) {
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			if (i == 0)
				break;
			method10855(class527_sub38, i, 2095497339);
		}
	}

	public void method82(RSByteBuffer class527_sub38, int i) {
		for (;;) {
			int i_1_ = class527_sub38.readUnsignedByte();
			if (i_1_ == 0)
				break;
			method10855(class527_sub38, i_1_, 337947243);
		}
	}

	public synchronized Class185 method10860() {
		Class185 class185 = ((Class185) aClass646_8372.aClass205_8350.method3787((long) (1130629053 * anInt8376)));
		if (null != class185)
			return class185;
		class185 = Class165.method2653(aClass646_8372.aClass459_8349, 1130629053 * anInt8376, 0);
		if (null != class185)
			aClass646_8372.aClass205_8350.method3790(class185, (long) (1130629053 * anInt8376));
		return class185;
	}

	public synchronized Class185 method10861() {
		Class185 class185 = ((Class185) aClass646_8372.aClass205_8350.method3787((long) (1130629053 * anInt8376)));
		if (null != class185)
			return class185;
		class185 = Class165.method2653(aClass646_8372.aClass459_8349, 1130629053 * anInt8376, 0);
		if (null != class185)
			aClass646_8372.aClass205_8350.method3790(class185, (long) (1130629053 * anInt8376));
		return class185;
	}

	static final boolean method10862(Class561[][][] class561s, int i, int i_2_, int i_3_, boolean bool, int i_4_) {
		byte[][][] is = client.aClass509_11072.method8371((byte) 0);
		byte i_5_ = bool ? (byte) 1 : (byte) (1429404695 * client.anInt11129 & 0xff);
		if (is[162317215 * Class673.anInt8585][i_2_][i_3_] == i_5_)
			return false;
		Class470 class470 = client.aClass509_11072.method8359(723206803);
		if (((class470.aByteArrayArrayArray5354[162317215 * Class673.anInt8585][i_2_][i_3_]) & 0x4) == 0)
			return false;
		int i_6_ = 0;
		int i_7_ = 0;
		client.anIntArray11202[i_6_] = i_2_;
		client.anIntArray11093[i_6_++] = i_3_;
		is[Class673.anInt8585 * 162317215][i_2_][i_3_] = i_5_;
		while (i_6_ != i_7_) {
			int i_8_ = client.anIntArray11202[i_7_] & 0xffff;
			int i_9_ = client.anIntArray11202[i_7_] >> 16 & 0xff;
			int i_10_ = client.anIntArray11202[i_7_] >> 24 & 0xff;
			int i_11_ = client.anIntArray11093[i_7_] & 0xffff;
			int i_12_ = client.anIntArray11093[i_7_] >> 16 & 0xff;
			i_7_ = i_7_ + 1 & 0xfff;
			boolean bool_13_ = false;
			if (0 == ((class470.aByteArrayArrayArray5354[Class673.anInt8585 * 162317215][i_8_][i_11_]) & 0x4))
				bool_13_ = true;
			boolean bool_14_ = false;
			if (null != class561s) {
				int i_15_ = 1 + 162317215 * Class673.anInt8585;
				while_132_: for (/**/; i_15_ <= 3; i_15_++) {
					if (null != class561s[i_15_] && ((class470.aByteArrayArrayArray5354[i_15_][i_8_][i_11_]) & 0x8) == 0) {
						if (bool_13_ && null != class561s[i_15_][i_8_][i_11_]) {
							if (null != (class561s[i_15_][i_8_][i_11_].aClass640_Sub1_Sub3_7553)) {
								int i_16_ = Class700_Sub15.method16999(i_9_, -1866105426);
								if (((class561s[i_15_][i_8_][i_11_].aClass640_Sub1_Sub3_7553.aShort11859) == i_16_) || (null != (class561s[i_15_][i_8_][i_11_].aClass640_Sub1_Sub3_7562) && i_16_ == (class561s[i_15_][i_8_][i_11_].aClass640_Sub1_Sub3_7562.aShort11859)))
									continue;
								if (i_10_ != 0) {
									int i_17_ = Class700_Sub15.method16999(i_10_, -2071951297);
									if (i_17_ == (class561s[i_15_][i_8_][i_11_].aClass640_Sub1_Sub3_7553.aShort11859) || (null != (class561s[i_15_][i_8_][i_11_].aClass640_Sub1_Sub3_7562) && (class561s[i_15_][i_8_][i_11_].aClass640_Sub1_Sub3_7562.aShort11859) == i_17_))
										continue;
								}
								if (i_12_ != 0) {
									int i_18_ = Class700_Sub15.method16999(i_12_, 595148749);
									if ((class561s[i_15_][i_8_][i_11_].aClass640_Sub1_Sub3_7553.aShort11859) == i_18_ || ((class561s[i_15_][i_8_][i_11_].aClass640_Sub1_Sub3_7562) != null && (class561s[i_15_][i_8_][i_11_].aClass640_Sub1_Sub3_7562.aShort11859) == i_18_))
										continue;
								}
							}
							Class561 class561 = class561s[i_15_][i_8_][i_11_];
							if (null != class561.aClass562_7558) {
								for (Class562 class562 = class561.aClass562_7558; class562 != null; class562 = class562.aClass562_7565) {
									Class640_Sub1_Sub2 class640_sub1_sub2 = class562.aClass640_Sub1_Sub2_7564;
									if (class640_sub1_sub2 instanceof Interface62) {
										Interface62 interface62 = (Interface62) class640_sub1_sub2;
										int i_19_ = interface62.method77(-1718024316);
										int i_20_ = interface62.method396(-121691925);
										if (21 == i_19_)
											i_19_ = 19;
										int i_21_ = i_19_ | i_20_ << 6;
										if (i_9_ == i_21_ || i_10_ != 0 && i_10_ == i_21_ || i_12_ != 0 && i_12_ == i_21_)
											continue while_132_;
									}
								}
							}
						}
						Class561 class561 = class561s[i_15_][i_8_][i_11_];
						if (null != class561 && class561.aClass562_7558 != null) {
							for (Class562 class562 = class561.aClass562_7558; class562 != null; class562 = class562.aClass562_7565) {
								Class640_Sub1_Sub2 class640_sub1_sub2 = class562.aClass640_Sub1_Sub2_7564;
								if ((class640_sub1_sub2.aShort11775 != class640_sub1_sub2.aShort11770) || (class640_sub1_sub2.aShort11771 != class640_sub1_sub2.aShort11772)) {
									short i_22_ = class640_sub1_sub2.aShort11775;
									short i_23_ = class640_sub1_sub2.aShort11770;
									short i_24_ = class640_sub1_sub2.aShort11771;
									short i_25_ = class640_sub1_sub2.aShort11772;
									int i_26_ = Math.max(0, Math.min(i_22_, (is[i_15_].length - 1)));
									int i_27_ = Math.max(0, Math.min(i_24_, (is[i_15_][0]).length - 1));
									int i_28_ = Math.max(0, Math.min(i_23_, (is[i_15_].length - 1)));
									int i_29_ = Math.max(0, Math.min(i_25_, (is[i_15_][0]).length - 1));
									for (/**/; i_26_ <= i_28_; i_26_++) {
										for (/**/; i_27_ <= i_29_; i_27_++)
											is[i_15_][i_26_][i_27_] = i_5_;
									}
								}
							}
						}
						is[i_15_][i_8_][i_11_] = i_5_;
						bool_14_ = true;
					}
				}
			}
			if (bool_14_) {
				int i_30_ = client.aClass509_11072.method8314(888801764).aClass161Array7434[Class673.anInt8585 * 162317215 + 1].method2595(i_8_, i_11_, (byte) 99);
				if (client.anIntArray11149[i] < i_30_)
					client.anIntArray11149[i] = i_30_;
				int i_31_ = i_8_ << 9;
				int i_32_ = i_11_ << 9;
				if (client.anIntArray11052[i] > i_31_)
					client.anIntArray11052[i] = i_31_;
				else if (client.anIntArray11151[i] < i_31_)
					client.anIntArray11151[i] = i_31_;
				if (client.anIntArray11104[i] > i_32_)
					client.anIntArray11104[i] = i_32_;
				else if (client.anIntArray11101[i] < i_32_)
					client.anIntArray11101[i] = i_32_;
			}
			if (!bool_13_) {
				if (i_8_ >= 1 && (is[Class673.anInt8585 * 162317215][i_8_ - 1][i_11_] != i_5_)) {
					client.anIntArray11202[i_6_] = i_8_ - 1 | 0x120000 | ~0x2cffffff;
					client.anIntArray11093[i_6_] = i_11_ | 0x130000;
					i_6_ = 1 + i_6_ & 0xfff;
					is[Class673.anInt8585 * 162317215][i_8_ - 1][i_11_] = i_5_;
				}
				if (++i_11_ < client.aClass509_11072.method8285(-1472047218)) {
					if (i_8_ - 1 >= 0 && i_5_ != (is[162317215 * Class673.anInt8585][i_8_ - 1][i_11_]) && ((class470.aByteArrayArrayArray5354[Class673.anInt8585 * 162317215][i_8_][i_11_]) & 0x4) == 0 && ((class470.aByteArrayArrayArray5354[Class673.anInt8585 * 162317215][i_8_ - 1][i_11_ - 1]) & 0x4) == 0) {
						client.anIntArray11202[i_6_] = i_8_ - 1 | 0x120000 | 0x52000000;
						client.anIntArray11093[i_6_] = i_11_ | 0x130000;
						i_6_ = 1 + i_6_ & 0xfff;
						is[162317215 * Class673.anInt8585][i_8_ - 1][i_11_] = i_5_;
					}
					if (is[162317215 * Class673.anInt8585][i_8_][i_11_] != i_5_) {
						client.anIntArray11202[i_6_] = i_8_ | 0x520000 | 0x13000000;
						client.anIntArray11093[i_6_] = i_11_ | 0x530000;
						i_6_ = i_6_ + 1 & 0xfff;
						is[162317215 * Class673.anInt8585][i_8_][i_11_] = i_5_;
					}
					if (1 + i_8_ < client.aClass509_11072.method8284((byte) 10) && i_5_ != (is[162317215 * Class673.anInt8585][i_8_ + 1][i_11_]) && 0 == ((class470.aByteArrayArrayArray5354[162317215 * Class673.anInt8585][i_8_][i_11_]) & 0x4) && ((class470.aByteArrayArrayArray5354[162317215 * Class673.anInt8585][1 + i_8_][i_11_ - 1]) & 0x4) == 0) {
						client.anIntArray11202[i_6_] = i_8_ + 1 | 0x520000 | ~0x6dffffff;
						client.anIntArray11093[i_6_] = i_11_ | 0x530000;
						i_6_ = i_6_ + 1 & 0xfff;
						is[162317215 * Class673.anInt8585][i_8_ + 1][i_11_] = i_5_;
					}
				}
				i_11_--;
				if (1 + i_8_ < client.aClass509_11072.method8284((byte) 108) && (is[162317215 * Class673.anInt8585][1 + i_8_][i_11_] != i_5_)) {
					client.anIntArray11202[i_6_] = 1 + i_8_ | 0x920000 | 0x53000000;
					client.anIntArray11093[i_6_] = i_11_ | 0x930000;
					i_6_ = i_6_ + 1 & 0xfff;
					is[Class673.anInt8585 * 162317215][1 + i_8_][i_11_] = i_5_;
				}
				if (--i_11_ >= 0) {
					if (i_8_ - 1 >= 0 && i_5_ != (is[162317215 * Class673.anInt8585][i_8_ - 1][i_11_]) && ((class470.aByteArrayArrayArray5354[162317215 * Class673.anInt8585][i_8_][i_11_]) & 0x4) == 0 && 0 == ((class470.aByteArrayArrayArray5354[Class673.anInt8585 * 162317215][i_8_ - 1][1 + i_11_]) & 0x4)) {
						client.anIntArray11202[i_6_] = i_8_ - 1 | 0xd20000 | 0x12000000;
						client.anIntArray11093[i_6_] = i_11_ | 0xd30000;
						i_6_ = 1 + i_6_ & 0xfff;
						is[Class673.anInt8585 * 162317215][i_8_ - 1][i_11_] = i_5_;
					}
					if (is[162317215 * Class673.anInt8585][i_8_][i_11_] != i_5_) {
						client.anIntArray11202[i_6_] = i_8_ | 0xd20000 | ~0x6cffffff;
						client.anIntArray11093[i_6_] = i_11_ | 0xd30000;
						i_6_ = i_6_ + 1 & 0xfff;
						is[162317215 * Class673.anInt8585][i_8_][i_11_] = i_5_;
					}
					if ((1 + i_8_ < client.aClass509_11072.method8284((byte) 114)) && (is[162317215 * Class673.anInt8585][1 + i_8_][i_11_] != i_5_) && 0 == ((class470.aByteArrayArrayArray5354[Class673.anInt8585 * 162317215][i_8_][i_11_]) & 0x4) && ((class470.aByteArrayArrayArray5354[162317215 * Class673.anInt8585][1 + i_8_][1 + i_11_]) & 0x4) == 0) {
						client.anIntArray11202[i_6_] = i_8_ + 1 | 0x920000 | ~0x2dffffff;
						client.anIntArray11093[i_6_] = i_11_ | 0x930000;
						i_6_ = 1 + i_6_ & 0xfff;
						is[Class673.anInt8585 * 162317215][i_8_ + 1][i_11_] = i_5_;
					}
				}
			}
		}
		if (client.anIntArray11149[i] != -1000000) {
			client.anIntArray11149[i] += 40;
			client.anIntArray11052[i] -= 512;
			client.anIntArray11151[i] += 512;
			client.anIntArray11101[i] += 512;
			client.anIntArray11104[i] -= 512;
		}
		return true;
	}

	static final void method10863(Class243 class243, Class240 class240, Class665 class665, int i) {
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		if (Class606.method10056(string, class665, -2054752545) != null)
			string = string.substring(0, string.length() - 1);
		class243.anObjectArray2641 = Class103.method1800(string, class665, (byte) -77);
		class243.aBool2606 = true;
	}
}
