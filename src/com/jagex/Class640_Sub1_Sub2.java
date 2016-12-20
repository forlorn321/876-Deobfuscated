/* Class640_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class640_Sub1_Sub2 extends Class640_Sub1 {
	Class527_Sub16[] aClass527_Sub16Array11769;
	public short aShort11770;
	public short aShort11771;
	public short aShort11772;
	public boolean aBool11773;
	int anInt11774 = 0;
	public short aShort11775;
	byte aByte11776;

	boolean method17044(Class180 class180, int i) {
		return (aClass555_10867.aClass566_7430.method9540(aByte10862, aShort11775, aShort11770, aShort11771, aShort11772, method17042(class180, 1214670231)));
	}

	void method18335(byte i) {
		/* empty */
	}

	int method17043(Class527_Sub16[] class527_sub16s, int i) {
		if (aBool8335) {
			anInt11774 = 0;
			int i_0_ = Math.max(0, aShort11775);
			int i_1_ = Math.min((aClass555_10867.aLongArrayArrayArray7475[aByte10864]).length - 1, aShort11770);
			int i_2_ = Math.max(0, aShort11771);
			int i_3_ = Math.min((aClass555_10867.aLongArrayArrayArray7475[aByte10864][i_0_]).length - 1, aShort11772);
			while_138_: for (/**/; i_0_ <= i_1_; i_0_++) {
				for (/**/; i_2_ <= i_3_; i_2_++) {
					long l = (aClass555_10867.aLongArrayArrayArray7475[aByte10864][i_0_][i_2_]);
					long l_4_ = 0L;
					while_137_: while (l_4_ <= 48L) {
						int i_5_ = (int) (l >>> (int) l_4_ & 0xffffL);
						if (i_5_ <= 0)
							break;
						Class556 class556 = aClass555_10867.aClass556Array7476[i_5_ - 1];
						for (int i_6_ = 0; i_6_ < -829952513 * anInt11774; i_6_++) {
							if (class556.aClass527_Sub16_7495 == aClass527_Sub16Array11769[i_6_]) {
								l_4_ += 16L;
								continue while_137_;
							}
						}
						aClass527_Sub16Array11769[(anInt11774 += 406065663) * -829952513 - 1] = class556.aClass527_Sub16_7495;
						if (4 == anInt11774 * -829952513)
							break while_138_;
						l_4_ += 16L;
					}
				}
			}
			for (int i_7_ = -829952513 * anInt11774; i_7_ < 4; i_7_++)
				aClass527_Sub16Array11769[i_7_] = null;
			if (0 != aByte11776) {
				int i_8_ = aShort11775 - 1968897173 * aClass555_10867.anInt7431;
				int i_9_ = aShort11771 - aClass555_10867.anInt7458 * 64349821;
				short i_10_;
				int i_11_;
				int i_12_;
				short i_13_;
				if (aByte11776 == 1) {
					if (i_9_ > i_8_) {
						i_10_ = aShort11775;
						i_11_ = aShort11771 - 1;
						i_12_ = 1 + aShort11775;
						i_13_ = aShort11771;
					} else {
						i_10_ = aShort11775;
						i_11_ = 1 + aShort11771;
						i_12_ = aShort11775 - 1;
						i_13_ = aShort11771;
					}
				} else if (i_9_ > -i_8_) {
					i_10_ = aShort11775;
					i_11_ = aShort11771 - 1;
					i_12_ = aShort11775 - 1;
					i_13_ = aShort11771;
				} else {
					i_10_ = aShort11775;
					i_11_ = aShort11771 + 1;
					i_12_ = aShort11775 + 1;
					i_13_ = aShort11771;
				}
				int i_14_ = 0;
				while_140_: for (/**/; i_14_ < anInt11774 * -829952513; i_14_++) {
					long l = (aClass555_10867.aLongArrayArrayArray7475[aByte10864][i_10_][i_11_]);
					while (l != 0L) {
						Class556 class556 = (aClass555_10867.aClass556Array7476[(int) ((l & 0xffffL) - 1L)]);
						l >>>= 16;
						if (class556.aClass527_Sub16_7495 == aClass527_Sub16Array11769[i_14_])
							continue while_140_;
					}
					l = (aClass555_10867.aLongArrayArrayArray7475[aByte10864][i_12_][i_13_]);
					while (l != 0L) {
						Class556 class556 = (aClass555_10867.aClass556Array7476[(int) ((l & 0xffffL) - 1L)]);
						l >>>= 16;
						if (aClass527_Sub16Array11769[i_14_] == class556.aClass527_Sub16_7495)
							continue while_140_;
					}
					for (int i_15_ = i_14_; i_15_ < -829952513 * anInt11774 - 1; i_15_++)
						aClass527_Sub16Array11769[i_15_] = aClass527_Sub16Array11769[i_15_ + 1];
					anInt11774 -= 406065663;
				}
			}
			aBool8335 = false;
		}
		for (int i_16_ = 0; i_16_ < anInt11774 * -829952513; i_16_++)
			class527_sub16s[i_16_] = aClass527_Sub16Array11769[i_16_];
		return -829952513 * anInt11774;
	}

	boolean method17055() {
		for (int i = aShort11775; i <= aShort11770; i++) {
			for (int i_17_ = aShort11771; i_17_ <= aShort11772; i_17_++) {
				int i_18_ = (aClass555_10867.anInt7463 * 1329492325 + (i - 1968897173 * aClass555_10867.anInt7431));
				if (i_18_ >= 0 && i_18_ < aClass555_10867.aBoolArrayArray7467.length) {
					int i_19_ = (1329492325 * aClass555_10867.anInt7463 + (i_17_ - 64349821 * aClass555_10867.anInt7458));
					if (i_19_ >= 0 && i_19_ < aClass555_10867.aBoolArrayArray7467.length && aClass555_10867.aBoolArrayArray7467[i_18_][i_19_])
						return true;
				}
			}
		}
		return false;
	}

	boolean method17077(byte i) {
		for (int i_20_ = aShort11775; i_20_ <= aShort11770; i_20_++) {
			for (int i_21_ = aShort11771; i_21_ <= aShort11772; i_21_++) {
				int i_22_ = (aClass555_10867.anInt7463 * 1329492325 + (i_20_ - 1968897173 * aClass555_10867.anInt7431));
				if (i_22_ >= 0 && i_22_ < aClass555_10867.aBoolArrayArray7467.length) {
					int i_23_ = (1329492325 * aClass555_10867.anInt7463 + (i_21_ - 64349821 * aClass555_10867.anInt7458));
					if (i_23_ >= 0 && i_23_ < aClass555_10867.aBoolArrayArray7467.length && aClass555_10867.aBoolArrayArray7467[i_22_][i_23_])
						return true;
				}
			}
		}
		return false;
	}

	void method18336() {
		/* empty */
	}

	Class640_Sub1_Sub2(Class555 class555, int i, int i_24_, int i_25_, int i_26_, int i_27_, int i_28_, int i_29_, int i_30_, int i_31_, boolean bool, byte i_32_) {
		super(class555);
		aClass527_Sub16Array11769 = new Class527_Sub16[4];
		aByte10864 = (byte) i;
		aByte10862 = (byte) i_24_;
		method10618(new Class442((float) i_25_, (float) i_26_, (float) i_27_));
		aShort11775 = (short) i_28_;
		aShort11770 = (short) i_29_;
		aShort11771 = (short) i_30_;
		aShort11772 = (short) i_31_;
		aBool11773 = bool;
		aByte11776 = i_32_;
		for (int i_33_ = 0; i_33_ < 4; i_33_++)
			aClass527_Sub16Array11769[i_33_] = null;
	}

	void method18337() {
		/* empty */
	}

	void method18338() {
		/* empty */
	}

	void method18339() {
		/* empty */
	}

	void method18340() {
		/* empty */
	}

	int method17083(Class527_Sub16[] class527_sub16s) {
		if (aBool8335) {
			anInt11774 = 0;
			int i = Math.max(0, aShort11775);
			int i_34_ = Math.min((aClass555_10867.aLongArrayArrayArray7475[aByte10864]).length - 1, aShort11770);
			int i_35_ = Math.max(0, aShort11771);
			int i_36_ = Math.min((aClass555_10867.aLongArrayArrayArray7475[aByte10864][i]).length - 1, aShort11772);
			while_142_: for (/**/; i <= i_34_; i++) {
				for (/**/; i_35_ <= i_36_; i_35_++) {
					long l = (aClass555_10867.aLongArrayArrayArray7475[aByte10864][i][i_35_]);
					long l_37_ = 0L;
					while_141_: while (l_37_ <= 48L) {
						int i_38_ = (int) (l >>> (int) l_37_ & 0xffffL);
						if (i_38_ <= 0)
							break;
						Class556 class556 = aClass555_10867.aClass556Array7476[i_38_ - 1];
						for (int i_39_ = 0; i_39_ < -829952513 * anInt11774; i_39_++) {
							if (class556.aClass527_Sub16_7495 == aClass527_Sub16Array11769[i_39_]) {
								l_37_ += 16L;
								continue while_141_;
							}
						}
						aClass527_Sub16Array11769[(anInt11774 += 406065663) * -829952513 - 1] = class556.aClass527_Sub16_7495;
						if (4 == anInt11774 * -829952513)
							break while_142_;
						l_37_ += 16L;
					}
				}
			}
			for (int i_40_ = -829952513 * anInt11774; i_40_ < 4; i_40_++)
				aClass527_Sub16Array11769[i_40_] = null;
			if (0 != aByte11776) {
				int i_41_ = aShort11775 - 1968897173 * aClass555_10867.anInt7431;
				int i_42_ = aShort11771 - aClass555_10867.anInt7458 * 64349821;
				short i_43_;
				int i_44_;
				int i_45_;
				short i_46_;
				if (aByte11776 == 1) {
					if (i_42_ > i_41_) {
						i_43_ = aShort11775;
						i_44_ = aShort11771 - 1;
						i_45_ = 1 + aShort11775;
						i_46_ = aShort11771;
					} else {
						i_43_ = aShort11775;
						i_44_ = 1 + aShort11771;
						i_45_ = aShort11775 - 1;
						i_46_ = aShort11771;
					}
				} else if (i_42_ > -i_41_) {
					i_43_ = aShort11775;
					i_44_ = aShort11771 - 1;
					i_45_ = aShort11775 - 1;
					i_46_ = aShort11771;
				} else {
					i_43_ = aShort11775;
					i_44_ = aShort11771 + 1;
					i_45_ = aShort11775 + 1;
					i_46_ = aShort11771;
				}
				int i_47_ = 0;
				while_144_: for (/**/; i_47_ < anInt11774 * -829952513; i_47_++) {
					long l = (aClass555_10867.aLongArrayArrayArray7475[aByte10864][i_43_][i_44_]);
					while (l != 0L) {
						Class556 class556 = (aClass555_10867.aClass556Array7476[(int) ((l & 0xffffL) - 1L)]);
						l >>>= 16;
						if (class556.aClass527_Sub16_7495 == aClass527_Sub16Array11769[i_47_])
							continue while_144_;
					}
					l = (aClass555_10867.aLongArrayArrayArray7475[aByte10864][i_45_][i_46_]);
					while (l != 0L) {
						Class556 class556 = (aClass555_10867.aClass556Array7476[(int) ((l & 0xffffL) - 1L)]);
						l >>>= 16;
						if (aClass527_Sub16Array11769[i_47_] == class556.aClass527_Sub16_7495)
							continue while_144_;
					}
					for (int i_48_ = i_47_; i_48_ < -829952513 * anInt11774 - 1; i_48_++)
						aClass527_Sub16Array11769[i_48_] = aClass527_Sub16Array11769[i_48_ + 1];
					anInt11774 -= 406065663;
				}
			}
			aBool8335 = false;
		}
		for (int i = 0; i < anInt11774 * -829952513; i++)
			class527_sub16s[i] = aClass527_Sub16Array11769[i];
		return -829952513 * anInt11774;
	}

	boolean method17084(Class180 class180) {
		return (aClass555_10867.aClass566_7430.method9540(aByte10862, aShort11775, aShort11770, aShort11771, aShort11772, method17042(class180, 1954239899)));
	}

	boolean method17089() {
		for (int i = aShort11775; i <= aShort11770; i++) {
			for (int i_49_ = aShort11771; i_49_ <= aShort11772; i_49_++) {
				int i_50_ = (aClass555_10867.anInt7463 * 1329492325 + (i - 1968897173 * aClass555_10867.anInt7431));
				if (i_50_ >= 0 && i_50_ < aClass555_10867.aBoolArrayArray7467.length) {
					int i_51_ = (1329492325 * aClass555_10867.anInt7463 + (i_49_ - 64349821 * aClass555_10867.anInt7458));
					if (i_51_ >= 0 && i_51_ < aClass555_10867.aBoolArrayArray7467.length && aClass555_10867.aBoolArrayArray7467[i_50_][i_51_])
						return true;
				}
			}
		}
		return false;
	}

	boolean method17086() {
		for (int i = aShort11775; i <= aShort11770; i++) {
			for (int i_52_ = aShort11771; i_52_ <= aShort11772; i_52_++) {
				int i_53_ = (aClass555_10867.anInt7463 * 1329492325 + (i - 1968897173 * aClass555_10867.anInt7431));
				if (i_53_ >= 0 && i_53_ < aClass555_10867.aBoolArrayArray7467.length) {
					int i_54_ = (1329492325 * aClass555_10867.anInt7463 + (i_52_ - 64349821 * aClass555_10867.anInt7458));
					if (i_54_ >= 0 && i_54_ < aClass555_10867.aBoolArrayArray7467.length && aClass555_10867.aBoolArrayArray7467[i_53_][i_54_])
						return true;
				}
			}
		}
		return false;
	}

	void method18341() {
		/* empty */
	}
}
