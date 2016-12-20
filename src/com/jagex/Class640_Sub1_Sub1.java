/* Class640_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class640_Sub1_Sub1 extends Class640_Sub1 {
	int anInt11739 = 0;
	protected short aShort11740;
	protected short aShort11741;
	Class527_Sub16[] aClass527_Sub16Array11742 = new Class527_Sub16[4];

	final boolean method17068() {
		return false;
	}

	int method17043(Class527_Sub16[] class527_sub16s, int i) {
		if (aBool8335) {
			Class442 class442 = method10637().aClass442_4927;
			anInt11739 = (method17054(((int) class442.aFloat4918 >> aClass555_10867.anInt7421 * 1742303003), ((int) class442.aFloat4919 >> aClass555_10867.anInt7421 * 1742303003), aClass527_Sub16Array11742, (byte) -101) * -48924177);
			aBool8335 = false;
		}
		for (int i_0_ = 0; i_0_ < 425121039 * anInt11739; i_0_++)
			class527_sub16s[i_0_] = aClass527_Sub16Array11742[i_0_];
		return 425121039 * anInt11739;
	}

	boolean method17044(Class180 class180, int i) {
		Class442 class442 = method10637().aClass442_4927;
		return (aClass555_10867.aClass566_7430.method9513(aByte10862, ((int) class442.aFloat4918 >> aClass555_10867.anInt7421 * 1742303003), ((int) class442.aFloat4919 >> aClass555_10867.anInt7421 * 1742303003), method17047(1004008254)));
	}

	boolean method17077(byte i) {
		Class442 class442 = method10637().aClass442_4927;
		return (aClass555_10867.aBoolArrayArray7467[(aClass555_10867.anInt7463 * 1329492325 + (((int) class442.aFloat4918 >> 1742303003 * aClass555_10867.anInt7421) - 1968897173 * aClass555_10867.anInt7431))][(1329492325 * aClass555_10867.anInt7463 + (((int) class442.aFloat4919 >> aClass555_10867.anInt7421 * 1742303003) - aClass555_10867.anInt7458 * 64349821))]);
	}

	final void method17039(int i) {
		throw new IllegalStateException();
	}

	final void method17038(Class180 class180, Class640_Sub1 class640_sub1, int i, int i_1_, int i_2_, boolean bool, int i_3_) {
		throw new IllegalStateException();
	}

	final boolean method17037(int i) {
		return false;
	}

	final void method17041(Class180 class180, Class640_Sub1 class640_sub1, int i, int i_4_, int i_5_, boolean bool) {
		throw new IllegalStateException();
	}

	final boolean method17045() {
		return false;
	}

	boolean method17089() {
		Class442 class442 = method10637().aClass442_4927;
		return (aClass555_10867.aBoolArrayArray7467[(aClass555_10867.anInt7463 * 1329492325 + (((int) class442.aFloat4918 >> 1742303003 * aClass555_10867.anInt7421) - 1968897173 * aClass555_10867.anInt7431))][(1329492325 * aClass555_10867.anInt7463 + (((int) class442.aFloat4919 >> aClass555_10867.anInt7421 * 1742303003) - aClass555_10867.anInt7458 * 64349821))]);
	}

	final void method17078(Class180 class180, Class640_Sub1 class640_sub1, int i, int i_6_, int i_7_, boolean bool) {
		throw new IllegalStateException();
	}

	final void method17062(Class180 class180, Class640_Sub1 class640_sub1, int i, int i_8_, int i_9_, boolean bool) {
		throw new IllegalStateException();
	}

	final void method17074() {
		throw new IllegalStateException();
	}

	final boolean method17067() {
		return false;
	}

	final void method17073(Class180 class180, Class640_Sub1 class640_sub1, int i, int i_10_, int i_11_, boolean bool) {
		throw new IllegalStateException();
	}

	final void method17075() {
		throw new IllegalStateException();
	}

	int method17083(Class527_Sub16[] class527_sub16s) {
		if (aBool8335) {
			Class442 class442 = method10637().aClass442_4927;
			anInt11739 = (method17054(((int) class442.aFloat4918 >> aClass555_10867.anInt7421 * 1742303003), ((int) class442.aFloat4919 >> aClass555_10867.anInt7421 * 1742303003), aClass527_Sub16Array11742, (byte) -80) * -48924177);
			aBool8335 = false;
		}
		for (int i = 0; i < 425121039 * anInt11739; i++)
			class527_sub16s[i] = aClass527_Sub16Array11742[i];
		return 425121039 * anInt11739;
	}

	boolean method17084(Class180 class180) {
		Class442 class442 = method10637().aClass442_4927;
		return (aClass555_10867.aClass566_7430.method9513(aByte10862, ((int) class442.aFloat4918 >> aClass555_10867.anInt7421 * 1742303003), ((int) class442.aFloat4919 >> aClass555_10867.anInt7421 * 1742303003), method17047(1004008254)));
	}

	boolean method17055() {
		Class442 class442 = method10637().aClass442_4927;
		return (aClass555_10867.aBoolArrayArray7467[(aClass555_10867.anInt7463 * 1329492325 + (((int) class442.aFloat4918 >> 1742303003 * aClass555_10867.anInt7421) - 1968897173 * aClass555_10867.anInt7431))][(1329492325 * aClass555_10867.anInt7463 + (((int) class442.aFloat4919 >> aClass555_10867.anInt7421 * 1742303003) - aClass555_10867.anInt7458 * 64349821))]);
	}

	Class640_Sub1_Sub1(Class555 class555, int i, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_) {
		super(class555);
		aByte10864 = (byte) i_14_;
		aByte10862 = (byte) i_15_;
		aShort11740 = (short) i_16_;
		aShort11741 = (short) i_17_;
		method10618(new Class442((float) i, (float) i_12_, (float) i_13_));
		for (int i_18_ = 0; i_18_ < 4; i_18_++)
			aClass527_Sub16Array11742[i_18_] = null;
	}

	boolean method17086() {
		Class442 class442 = method10637().aClass442_4927;
		return (aClass555_10867.aBoolArrayArray7467[(aClass555_10867.anInt7463 * 1329492325 + (((int) class442.aFloat4918 >> 1742303003 * aClass555_10867.anInt7421) - 1968897173 * aClass555_10867.anInt7431))][(1329492325 * aClass555_10867.anInt7463 + (((int) class442.aFloat4919 >> aClass555_10867.anInt7421 * 1742303003) - aClass555_10867.anInt7458 * 64349821))]);
	}
}
