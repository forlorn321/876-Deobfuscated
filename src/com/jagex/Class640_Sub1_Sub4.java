/* Class640_Sub1_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class640_Sub1_Sub4 extends Class640_Sub1 {
	int anInt11869 = 0;
	Class527_Sub16[] aClass527_Sub16Array11870 = new Class527_Sub16[4];
	public short aShort11871;

	boolean method17044(Class180 class180, int i) {
		Class442 class442 = method10637().aClass442_4927;
		return (aClass555_10867.aClass566_7430.method9549(aByte10862, ((int) class442.aFloat4918 >> 1742303003 * aClass555_10867.anInt7421), ((int) class442.aFloat4919 >> 1742303003 * aClass555_10867.anInt7421)));
	}

	int method17043(Class527_Sub16[] class527_sub16s, int i) {
		if (aBool8335) {
			Class442 class442 = method10637().aClass442_4927;
			anInt11869 = (method17054(((int) class442.aFloat4918 >> 1742303003 * aClass555_10867.anInt7421), ((int) class442.aFloat4919 >> aClass555_10867.anInt7421 * 1742303003), aClass527_Sub16Array11870, (byte) -54) * 956972495);
			aBool8335 = false;
		}
		for (int i_0_ = 0; i_0_ < anInt11869 * -2082494161; i_0_++)
			class527_sub16s[i_0_] = aClass527_Sub16Array11870[i_0_];
		return anInt11869 * -2082494161;
	}

	boolean method17086() {
		Class442 class442 = method10637().aClass442_4927;
		return (aClass555_10867.aBoolArrayArray7467[(1329492325 * aClass555_10867.anInt7463 + (((int) class442.aFloat4918 >> aClass555_10867.anInt7421 * 1742303003) - aClass555_10867.anInt7431 * 1968897173))][(((int) class442.aFloat4919 >> aClass555_10867.anInt7421 * 1742303003) - aClass555_10867.anInt7458 * 64349821 + 1329492325 * aClass555_10867.anInt7463)]);
	}

	boolean method17077(byte i) {
		Class442 class442 = method10637().aClass442_4927;
		return (aClass555_10867.aBoolArrayArray7467[(1329492325 * aClass555_10867.anInt7463 + (((int) class442.aFloat4918 >> aClass555_10867.anInt7421 * 1742303003) - aClass555_10867.anInt7431 * 1968897173))][(((int) class442.aFloat4919 >> aClass555_10867.anInt7421 * 1742303003) - aClass555_10867.anInt7458 * 64349821 + 1329492325 * aClass555_10867.anInt7463)]);
	}

	boolean method17055() {
		Class442 class442 = method10637().aClass442_4927;
		return (aClass555_10867.aBoolArrayArray7467[(1329492325 * aClass555_10867.anInt7463 + (((int) class442.aFloat4918 >> aClass555_10867.anInt7421 * 1742303003) - aClass555_10867.anInt7431 * 1968897173))][(((int) class442.aFloat4919 >> aClass555_10867.anInt7421 * 1742303003) - aClass555_10867.anInt7458 * 64349821 + 1329492325 * aClass555_10867.anInt7463)]);
	}

	boolean method17084(Class180 class180) {
		Class442 class442 = method10637().aClass442_4927;
		return (aClass555_10867.aClass566_7430.method9549(aByte10862, ((int) class442.aFloat4918 >> 1742303003 * aClass555_10867.anInt7421), ((int) class442.aFloat4919 >> 1742303003 * aClass555_10867.anInt7421)));
	}

	Class640_Sub1_Sub4(Class555 class555, int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
		super(class555);
		aByte10864 = (byte) i_3_;
		aByte10862 = (byte) i_4_;
		aShort11871 = (short) i_5_;
		method10618(new Class442((float) i, (float) i_1_, (float) i_2_));
		for (int i_6_ = 0; i_6_ < 4; i_6_++)
			aClass527_Sub16Array11870[i_6_] = null;
	}

	int method17083(Class527_Sub16[] class527_sub16s) {
		if (aBool8335) {
			Class442 class442 = method10637().aClass442_4927;
			anInt11869 = (method17054(((int) class442.aFloat4918 >> 1742303003 * aClass555_10867.anInt7421), ((int) class442.aFloat4919 >> aClass555_10867.anInt7421 * 1742303003), aClass527_Sub16Array11870, (byte) -101) * 956972495);
			aBool8335 = false;
		}
		for (int i = 0; i < anInt11869 * -2082494161; i++)
			class527_sub16s[i] = aClass527_Sub16Array11870[i];
		return anInt11869 * -2082494161;
	}

	boolean method17089() {
		Class442 class442 = method10637().aClass442_4927;
		return (aClass555_10867.aBoolArrayArray7467[(1329492325 * aClass555_10867.anInt7463 + (((int) class442.aFloat4918 >> aClass555_10867.anInt7421 * 1742303003) - aClass555_10867.anInt7431 * 1968897173))][(((int) class442.aFloat4919 >> aClass555_10867.anInt7421 * 1742303003) - aClass555_10867.anInt7458 * 64349821 + 1329492325 * aClass555_10867.anInt7463)]);
	}
}
