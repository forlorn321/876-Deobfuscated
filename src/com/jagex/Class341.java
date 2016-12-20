/* Class341 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class341 {
	Class180_Sub2 aClass180_Sub2_3675;
	static final int anInt3676 = 128;
	public static final int anInt3677 = 16;
	static final int anInt3678 = 128;
	public boolean aBool3679;
	Interface38[] anInterface38Array3680 = null;
	Interface35 anInterface35_3681 = null;
	static Object anObject3682;
	public Interface35 anInterface35_3683;
	public Interface35 anInterface35_3684;
	static Object anObject3685;
	static Object anObject3686;
	public Interface38[] anInterface38Array3687 = null;

	public boolean method6079() {
		if (!aClass180_Sub2_3675.aBool9587)
			return false;
		if (anInterface35_3684 == null) {
			if (anObject3682 == null) {
				byte[] is = Class533.method8935(128, 128, 16, 8, new Class538_Sub1(419684), 4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
				anObject3682 = Class166.method2668(is, false, (short) -22778);
			}
			byte[] is = Class537.method8985(anObject3682, false, -942105733);
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
			anInterface35_3684 = aClass180_Sub2_3675.method15179(Class157.aClass157_1723, 128, 128, 16, true, is_0_);
		}
		return anInterface35_3684 != null;
	}

	Class341(Class180_Sub2 class180_sub2) {
		anInterface35_3683 = null;
		anInterface35_3684 = null;
		aClass180_Sub2_3675 = class180_sub2;
		aBool3679 = aClass180_Sub2_3675.aBool9587;
		if (aBool3679 && !aClass180_Sub2_3675.aBool9488)
			aBool3679 = false;
		if (aBool3679 && !aClass180_Sub2_3675.method14961(Class157.aClass157_1726, Class184.aClass184_2104))
			aBool3679 = false;
		if (aBool3679 || aClass180_Sub2_3675.method14960(Class157.aClass157_1726, Class184.aClass184_2104)) {
			method6082();
			if (!aBool3679) {
				anInterface38Array3680 = new Interface38[16];
				for (int i = 0; i < 16; i++) {
					byte[] is = Class320.method5696(anObject3685, i * 32768, 32768, 316740117);
					anInterface38Array3680[i] = aClass180_Sub2_3675.method15022((Class157.aClass157_1726), 128, 128, true, is);
				}
				anInterface38Array3687 = new Interface38[16];
				for (int i = 0; i < 16; i++) {
					byte[] is = Class320.method5696(anObject3686, i * 32768, 32768, 316740117);
					anInterface38Array3687[i] = aClass180_Sub2_3675.method15022((Class157.aClass157_1726), 128, 128, true, is);
				}
			} else {
				byte[] is = Class537.method8985(anObject3685, false, -404854400);
				anInterface35_3681 = aClass180_Sub2_3675.method15179(Class157.aClass157_1726, 128, 128, 16, true, is);
				is = Class537.method8985(anObject3686, false, 1848313876);
				anInterface35_3683 = aClass180_Sub2_3675.method15179(Class157.aClass157_1726, 128, 128, 16, true, is);
			}
		}
	}

	public boolean method6080() {
		return (aBool3679 ? anInterface35_3681 != null : anInterface38Array3680 != null);
	}

	public boolean method6081() {
		if (!aClass180_Sub2_3675.aBool9587)
			return false;
		if (anInterface35_3684 == null) {
			if (anObject3682 == null) {
				byte[] is = Class533.method8935(128, 128, 16, 8, new Class538_Sub1(419684), 4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
				anObject3682 = Class166.method2668(is, false, (short) 1483);
			}
			byte[] is = Class537.method8985(anObject3682, false, -25264279);
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
			anInterface35_3684 = aClass180_Sub2_3675.method15179(Class157.aClass157_1723, 128, 128, 16, true, is_11_);
		}
		return anInterface35_3684 != null;
	}

	static void method6082() {
		if (anObject3685 == null) {
			Class412_Sub1_Sub1 class412_sub1_sub1 = new Class412_Sub1_Sub1();
			byte[] is = class412_sub1_sub1.method18063(128, 128, 16);
			anObject3685 = Class166.method2668(is, false, (short) 22020);
		}
		if (anObject3686 == null) {
			Class412_Sub2_Sub2 class412_sub2_sub2 = new Class412_Sub2_Sub2();
			byte[] is = class412_sub2_sub2.method18050(128, 128, 16);
			anObject3686 = Class166.method2668(is, false, (short) -14797);
		}
	}

	static void method6083() {
		if (anObject3685 == null) {
			Class412_Sub1_Sub1 class412_sub1_sub1 = new Class412_Sub1_Sub1();
			byte[] is = class412_sub1_sub1.method18063(128, 128, 16);
			anObject3685 = Class166.method2668(is, false, (short) -14347);
		}
		if (anObject3686 == null) {
			Class412_Sub2_Sub2 class412_sub2_sub2 = new Class412_Sub2_Sub2();
			byte[] is = class412_sub2_sub2.method18050(128, 128, 16);
			anObject3686 = Class166.method2668(is, false, (short) -1749);
		}
	}

	static void method6084() {
		if (anObject3685 == null) {
			Class412_Sub1_Sub1 class412_sub1_sub1 = new Class412_Sub1_Sub1();
			byte[] is = class412_sub1_sub1.method18063(128, 128, 16);
			anObject3685 = Class166.method2668(is, false, (short) -16265);
		}
		if (anObject3686 == null) {
			Class412_Sub2_Sub2 class412_sub2_sub2 = new Class412_Sub2_Sub2();
			byte[] is = class412_sub2_sub2.method18050(128, 128, 16);
			anObject3686 = Class166.method2668(is, false, (short) -15565);
		}
	}

	public boolean method6085() {
		return (aBool3679 ? anInterface35_3681 != null : anInterface38Array3680 != null);
	}

	public boolean method6086() {
		return (aBool3679 ? anInterface35_3681 != null : anInterface38Array3680 != null);
	}
}
