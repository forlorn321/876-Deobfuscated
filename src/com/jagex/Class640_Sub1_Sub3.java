/* Class640_Sub1_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class640_Sub1_Sub3 extends Class640_Sub1 {
	Class527_Sub16[] aClass527_Sub16Array11850;
	public static final int anInt11851 = 4;
	public static final int anInt11852 = 1;
	public static final int anInt11853 = 8;
	public static final int anInt11854 = 16;
	public static final int anInt11855 = 32;
	int anInt11856 = 0;
	public static final int anInt11857 = 128;
	static int[] anIntArray11858 = { 19, 55, 38, 155, 255, 110, 137, 205, 76 };
	public short aShort11859;
	public static final int anInt11860 = 64;
	public static final int anInt11861 = 2;

	boolean method17055() {
		Class442 class442 = method10637().aClass442_4927;
		return (aClass555_10867.aBoolArrayArray7467[(aClass555_10867.anInt7463 * 1329492325 + (((int) class442.aFloat4918 >> aClass555_10867.anInt7421 * 1742303003) - aClass555_10867.anInt7431 * 1968897173))][(aClass555_10867.anInt7463 * 1329492325 + (((int) class442.aFloat4919 >> aClass555_10867.anInt7421 * 1742303003) - 64349821 * aClass555_10867.anInt7458))]);
	}

	Class640_Sub1_Sub3(Class555 class555, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
		super(class555);
		aClass527_Sub16Array11850 = new Class527_Sub16[4];
		aByte10864 = (byte) i_2_;
		aByte10862 = (byte) i_3_;
		aShort11859 = (short) i_4_;
		method10618(new Class442((float) i, (float) i_0_, (float) i_1_));
		for (int i_5_ = 0; i_5_ < 4; i_5_++)
			aClass527_Sub16Array11850[i_5_] = null;
	}

	boolean method17089() {
		Class442 class442 = method10637().aClass442_4927;
		return (aClass555_10867.aBoolArrayArray7467[(aClass555_10867.anInt7463 * 1329492325 + (((int) class442.aFloat4918 >> aClass555_10867.anInt7421 * 1742303003) - aClass555_10867.anInt7431 * 1968897173))][(aClass555_10867.anInt7463 * 1329492325 + (((int) class442.aFloat4919 >> aClass555_10867.anInt7421 * 1742303003) - 64349821 * aClass555_10867.anInt7458))]);
	}

	boolean method17077(byte i) {
		Class442 class442 = method10637().aClass442_4927;
		return (aClass555_10867.aBoolArrayArray7467[(aClass555_10867.anInt7463 * 1329492325 + (((int) class442.aFloat4918 >> aClass555_10867.anInt7421 * 1742303003) - aClass555_10867.anInt7431 * 1968897173))][(aClass555_10867.anInt7463 * 1329492325 + (((int) class442.aFloat4919 >> aClass555_10867.anInt7421 * 1742303003) - 64349821 * aClass555_10867.anInt7458))]);
	}

	boolean method17044(Class180 class180, int i) {
		Class442 class442 = method10637().aClass442_4927;
		return (aClass555_10867.aClass566_7430.method9512(this, aByte10862, ((int) class442.aFloat4918 >> 1742303003 * aClass555_10867.anInt7421), ((int) class442.aFloat4919 >> 1742303003 * aClass555_10867.anInt7421)));
	}

	boolean method17084(Class180 class180) {
		Class442 class442 = method10637().aClass442_4927;
		return (aClass555_10867.aClass566_7430.method9512(this, aByte10862, ((int) class442.aFloat4918 >> 1742303003 * aClass555_10867.anInt7421), ((int) class442.aFloat4919 >> 1742303003 * aClass555_10867.anInt7421)));
	}

	int method17043(Class527_Sub16[] class527_sub16s, int i) {
		if (aBool8335) {
			Class442 class442 = method10637().aClass442_4927;
			int i_6_ = ((int) class442.aFloat4918 >> aClass555_10867.anInt7421 * 1742303003);
			int i_7_ = ((int) class442.aFloat4919 >> 1742303003 * aClass555_10867.anInt7421);
			int i_8_ = 0;
			if (aClass555_10867.anInt7431 * 1968897173 == i_6_)
				i_8_++;
			else if (1968897173 * aClass555_10867.anInt7431 < i_6_)
				i_8_ += 2;
			if (i_7_ == 64349821 * aClass555_10867.anInt7458)
				i_8_ += 3;
			else if (aClass555_10867.anInt7458 * 64349821 > i_7_)
				i_8_ += 6;
			int i_9_ = anIntArray11858[i_8_];
			if ((aShort11859 & i_9_) == 0) {
				if (1 == aShort11859 && i_6_ > 0)
					i_6_--;
				else if (4 == aShort11859 && i_6_ <= aClass555_10867.anInt7443 * -547681223)
					i_6_++;
				else if (aShort11859 == 8 && i_7_ > 0)
					i_7_--;
				else if (aShort11859 == 2 && i_7_ <= -1437024153 * aClass555_10867.anInt7432)
					i_7_++;
				else if (aShort11859 == 16 && i_6_ > 0 && i_7_ <= -1437024153 * aClass555_10867.anInt7432) {
					i_6_--;
					i_7_++;
				} else if (32 == aShort11859 && i_6_ <= aClass555_10867.anInt7443 * -547681223 && (i_7_ <= -1437024153 * aClass555_10867.anInt7432)) {
					i_6_++;
					i_7_++;
				} else if (128 == aShort11859 && i_6_ > 0 && i_7_ > 0) {
					i_6_--;
					i_7_--;
				} else if (64 == aShort11859 && i_6_ <= aClass555_10867.anInt7443 * -547681223 && i_7_ > 0) {
					i_6_++;
					i_7_--;
				} else
					throw new RuntimeException("");
			}
			anInt11856 = method17054(i_6_, i_7_, aClass527_Sub16Array11850, (byte) -80) * 654961933;
			aBool8335 = false;
		}
		for (int i_10_ = 0; i_10_ < anInt11856 * 630958533; i_10_++)
			class527_sub16s[i_10_] = aClass527_Sub16Array11850[i_10_];
		return anInt11856 * 630958533;
	}

	boolean method17086() {
		Class442 class442 = method10637().aClass442_4927;
		return (aClass555_10867.aBoolArrayArray7467[(aClass555_10867.anInt7463 * 1329492325 + (((int) class442.aFloat4918 >> aClass555_10867.anInt7421 * 1742303003) - aClass555_10867.anInt7431 * 1968897173))][(aClass555_10867.anInt7463 * 1329492325 + (((int) class442.aFloat4919 >> aClass555_10867.anInt7421 * 1742303003) - 64349821 * aClass555_10867.anInt7458))]);
	}

	int method17083(Class527_Sub16[] class527_sub16s) {
		if (aBool8335) {
			Class442 class442 = method10637().aClass442_4927;
			int i = ((int) class442.aFloat4918 >> aClass555_10867.anInt7421 * 1742303003);
			int i_11_ = ((int) class442.aFloat4919 >> 1742303003 * aClass555_10867.anInt7421);
			int i_12_ = 0;
			if (aClass555_10867.anInt7431 * 1968897173 == i)
				i_12_++;
			else if (1968897173 * aClass555_10867.anInt7431 < i)
				i_12_ += 2;
			if (i_11_ == 64349821 * aClass555_10867.anInt7458)
				i_12_ += 3;
			else if (aClass555_10867.anInt7458 * 64349821 > i_11_)
				i_12_ += 6;
			int i_13_ = anIntArray11858[i_12_];
			if ((aShort11859 & i_13_) == 0) {
				if (1 == aShort11859 && i > 0)
					i--;
				else if (4 == aShort11859 && i <= aClass555_10867.anInt7443 * -547681223)
					i++;
				else if (aShort11859 == 8 && i_11_ > 0)
					i_11_--;
				else if (aShort11859 == 2 && i_11_ <= -1437024153 * aClass555_10867.anInt7432)
					i_11_++;
				else if (aShort11859 == 16 && i > 0 && i_11_ <= -1437024153 * aClass555_10867.anInt7432) {
					i--;
					i_11_++;
				} else if (32 == aShort11859 && i <= aClass555_10867.anInt7443 * -547681223 && (i_11_ <= -1437024153 * aClass555_10867.anInt7432)) {
					i++;
					i_11_++;
				} else if (128 == aShort11859 && i > 0 && i_11_ > 0) {
					i--;
					i_11_--;
				} else if (64 == aShort11859 && i <= aClass555_10867.anInt7443 * -547681223 && i_11_ > 0) {
					i++;
					i_11_--;
				} else
					throw new RuntimeException("");
			}
			anInt11856 = method17054(i, i_11_, aClass527_Sub16Array11850, (byte) -89) * 654961933;
			aBool8335 = false;
		}
		for (int i = 0; i < anInt11856 * 630958533; i++)
			class527_sub16s[i] = aClass527_Sub16Array11850[i];
		return anInt11856 * 630958533;
	}
}
