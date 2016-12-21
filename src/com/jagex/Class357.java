/* Class357 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class357 {
	public Interface34 anInterface34_3799;
	static final int anInt3800 = 128;
	static Object anObject3801;
	Class167_Sub3 aClass167_Sub3_3802;
	public boolean aBool3803;
	Interface36[] anInterface36Array3804 = null;
	static final int anInt3805 = 128;
	public Interface36[] anInterface36Array3806;
	public static final int anInt3807 = 16;
	public Interface34 anInterface34_3808;
	static Object anObject3809;
	Interface34 anInterface34_3810 = null;
	static Object anObject3811;

	static void method4684() {
		if (anObject3809 == null) {
			Class418_Sub1_Sub2 class418_sub1_sub2 = new Class418_Sub1_Sub2();
			byte[] is = class418_sub1_sub2.method10631(128, 128, 16);
			anObject3809 = Class676.method8038(is, false, (byte) 11);
		}
		if (anObject3801 == null) {
			Class418_Sub2_Sub1 class418_sub2_sub1 = new Class418_Sub2_Sub1();
			byte[] is = class418_sub2_sub1.method10627(128, 128, 16);
			anObject3801 = Class676.method8038(is, false, (byte) 13);
		}
	}

	Class357(Class167_Sub3 class167_sub3) {
		anInterface36Array3806 = null;
		anInterface34_3799 = null;
		anInterface34_3808 = null;
		aClass167_Sub3_3802 = class167_sub3;
		aBool3803 = aClass167_Sub3_3802.aBool9697;
		if (aBool3803 && !aClass167_Sub3_3802.aBool9693)
			aBool3803 = false;
		if (aBool3803 && !aClass167_Sub3_3802.method8838(Class155.aClass155_1725, Class171.aClass171_1905))
			aBool3803 = false;
		if (aBool3803 || aClass167_Sub3_3802.method8769(Class155.aClass155_1725, Class171.aClass171_1905)) {
			method4692();
			if (!aBool3803) {
				anInterface36Array3804 = new Interface36[16];
				for (int i = 0; i < 16; i++) {
					byte[] is = Class449.method5422(anObject3809, i * 32768, 32768, -2085793422);
					anInterface36Array3804[i] = aClass167_Sub3_3802.method8740((Class155.aClass155_1725), 128, 128, true, is);
				}
				anInterface36Array3806 = new Interface36[16];
				for (int i = 0; i < 16; i++) {
					byte[] is = Class449.method5422(anObject3801, i * 32768, 32768, -11030276);
					anInterface36Array3806[i] = aClass167_Sub3_3802.method8740((Class155.aClass155_1725), 128, 128, true, is);
				}
			} else {
				byte[] is = Class51.method931(anObject3809, false, -672943972);
				anInterface34_3810 = aClass167_Sub3_3802.method8870(Class155.aClass155_1725, 128, 128, 16, true, is);
				is = Class51.method931(anObject3801, false, -169173001);
				anInterface34_3799 = aClass167_Sub3_3802.method8870(Class155.aClass155_1725, 128, 128, 16, true, is);
			}
		}
	}

	public boolean method4685() {
		return (aBool3803 ? anInterface34_3810 != null : anInterface36Array3804 != null);
	}

	public boolean method4686() {
		if (!aClass167_Sub3_3802.aBool9697)
			return false;
		if (anInterface34_3808 == null) {
			if (anObject3811 == null) {
				byte[] is = Class525.method6411(128, 128, 16, 8, new Class539_Sub1(419684), 4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
				anObject3811 = Class676.method8038(is, false, (byte) 105);
			}
			byte[] is = Class51.method931(anObject3811, false, -1656255189);
			byte[] is_0_ = new byte[is.length * 4];
			int i = 0;
			for (int i_1_ = 0; i_1_ < 16; i_1_++) {
				int i_2_ = i_1_ * 16384;
				int i_3_ = i_2_;
				for (int i_4_ = 0; i_4_ < 128; i_4_++) {
					int i_5_ = i_3_ + i_4_ * 128;
					int i_6_ = i_3_ + (i_4_ - 1 & 0x7f) * 128;
					int i_7_ = i_3_ + (i_4_ + 1 & 0x7f) * 128;
					for (int i_8_ = 0; i_8_ < 128; i_8_++) {
						float f = (float) ((is[i_6_ + i_8_] & 0xff) - (is[i_7_ + i_8_] & 0xff));
						float f_9_ = (float) ((is[i_5_ + (i_8_ - 1 & 0x7f)] & 0xff) - (is[i_5_ + (i_8_ + 1 & 0x7f)] & 0xff));
						float f_10_ = (float) (128.0 / Math.sqrt((double) (f_9_ * f_9_ + 16384.0F + f * f)));
						is_0_[i++] = (byte) (int) (f_9_ * f_10_ + 127.0F);
						is_0_[i++] = (byte) (int) (128.0F * f_10_ + 127.0F);
						is_0_[i++] = (byte) (int) (f * f_10_ + 127.0F);
						is_0_[i++] = is[i_2_++];
					}
				}
			}
			anInterface34_3808 = aClass167_Sub3_3802.method8870(Class155.aClass155_1722, 128, 128, 16, true, is_0_);
		}
		return anInterface34_3808 != null;
	}

	static void method4687() {
		if (anObject3809 == null) {
			Class418_Sub1_Sub2 class418_sub1_sub2 = new Class418_Sub1_Sub2();
			byte[] is = class418_sub1_sub2.method10631(128, 128, 16);
			anObject3809 = Class676.method8038(is, false, (byte) 97);
		}
		if (anObject3801 == null) {
			Class418_Sub2_Sub1 class418_sub2_sub1 = new Class418_Sub2_Sub1();
			byte[] is = class418_sub2_sub1.method10627(128, 128, 16);
			anObject3801 = Class676.method8038(is, false, (byte) 126);
		}
	}

	static void method4688() {
		if (anObject3809 == null) {
			Class418_Sub1_Sub2 class418_sub1_sub2 = new Class418_Sub1_Sub2();
			byte[] is = class418_sub1_sub2.method10631(128, 128, 16);
			anObject3809 = Class676.method8038(is, false, (byte) 56);
		}
		if (anObject3801 == null) {
			Class418_Sub2_Sub1 class418_sub2_sub1 = new Class418_Sub2_Sub1();
			byte[] is = class418_sub2_sub1.method10627(128, 128, 16);
			anObject3801 = Class676.method8038(is, false, (byte) 23);
		}
	}

	static void method4689() {
		if (anObject3809 == null) {
			Class418_Sub1_Sub2 class418_sub1_sub2 = new Class418_Sub1_Sub2();
			byte[] is = class418_sub1_sub2.method10631(128, 128, 16);
			anObject3809 = Class676.method8038(is, false, (byte) 117);
		}
		if (anObject3801 == null) {
			Class418_Sub2_Sub1 class418_sub2_sub1 = new Class418_Sub2_Sub1();
			byte[] is = class418_sub2_sub1.method10627(128, 128, 16);
			anObject3801 = Class676.method8038(is, false, (byte) 67);
		}
	}

	public boolean method4690() {
		return (aBool3803 ? anInterface34_3810 != null : anInterface36Array3804 != null);
	}

	static void method4691() {
		if (anObject3809 == null) {
			Class418_Sub1_Sub2 class418_sub1_sub2 = new Class418_Sub1_Sub2();
			byte[] is = class418_sub1_sub2.method10631(128, 128, 16);
			anObject3809 = Class676.method8038(is, false, (byte) 79);
		}
		if (anObject3801 == null) {
			Class418_Sub2_Sub1 class418_sub2_sub1 = new Class418_Sub2_Sub1();
			byte[] is = class418_sub2_sub1.method10627(128, 128, 16);
			anObject3801 = Class676.method8038(is, false, (byte) 114);
		}
	}

	static void method4692() {
		if (anObject3809 == null) {
			Class418_Sub1_Sub2 class418_sub1_sub2 = new Class418_Sub1_Sub2();
			byte[] is = class418_sub1_sub2.method10631(128, 128, 16);
			anObject3809 = Class676.method8038(is, false, (byte) 117);
		}
		if (anObject3801 == null) {
			Class418_Sub2_Sub1 class418_sub2_sub1 = new Class418_Sub2_Sub1();
			byte[] is = class418_sub2_sub1.method10627(128, 128, 16);
			anObject3801 = Class676.method8038(is, false, (byte) 100);
		}
	}

	public boolean method4693() {
		if (!aClass167_Sub3_3802.aBool9697)
			return false;
		if (anInterface34_3808 == null) {
			if (anObject3811 == null) {
				byte[] is = Class525.method6411(128, 128, 16, 8, new Class539_Sub1(419684), 4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
				anObject3811 = Class676.method8038(is, false, (byte) 65);
			}
			byte[] is = Class51.method931(anObject3811, false, -114163576);
			byte[] is_11_ = new byte[is.length * 4];
			int i = 0;
			for (int i_12_ = 0; i_12_ < 16; i_12_++) {
				int i_13_ = i_12_ * 16384;
				int i_14_ = i_13_;
				for (int i_15_ = 0; i_15_ < 128; i_15_++) {
					int i_16_ = i_14_ + i_15_ * 128;
					int i_17_ = i_14_ + (i_15_ - 1 & 0x7f) * 128;
					int i_18_ = i_14_ + (i_15_ + 1 & 0x7f) * 128;
					for (int i_19_ = 0; i_19_ < 128; i_19_++) {
						float f = (float) ((is[i_17_ + i_19_] & 0xff) - (is[i_18_ + i_19_] & 0xff));
						float f_20_ = (float) ((is[i_16_ + (i_19_ - 1 & 0x7f)] & 0xff) - (is[i_16_ + (i_19_ + 1 & 0x7f)] & 0xff));
						float f_21_ = (float) (128.0 / Math.sqrt((double) (f_20_ * f_20_ + 16384.0F + f * f)));
						is_11_[i++] = (byte) (int) (f_20_ * f_21_ + 127.0F);
						is_11_[i++] = (byte) (int) (128.0F * f_21_ + 127.0F);
						is_11_[i++] = (byte) (int) (f * f_21_ + 127.0F);
						is_11_[i++] = is[i_13_++];
					}
				}
			}
			anInterface34_3808 = aClass167_Sub3_3802.method8870(Class155.aClass155_1722, 128, 128, 16, true, is_11_);
		}
		return anInterface34_3808 != null;
	}
}
