/* Class493 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public abstract class Class493 implements Interface40 {
	Class167_Sub3_Sub1 aClass167_Sub3_Sub1_5525;
	static final int anInt5526 = 3553;
	static final int anInt5527 = 34067;
	static final int anInt5528 = 32879;
	static int[] anIntArray5529 = new int[1];
	int anInt5530;
	int anInt5531;
	static final int anInt5532 = 0;
	Class155 aClass155_5533;
	boolean aBool5534;
	Class342 aClass342_5535 = Class342.aClass342_3663;
	int anInt5536;
	Class171 aClass171_5537;

	public void method275() {
		if (anInt5530 == 0)
			throw new IllegalStateException("");
		int i = aClass167_Sub3_Sub1_5525.method8811();
		int i_0_ = aClass167_Sub3_Sub1_5525.anIntArray11439[i];
		if (i_0_ != anInt5531) {
			if (i_0_ != 0) {
				OpenGL.glBindTexture(i_0_, 0);
				OpenGL.glDisable(i_0_);
			}
			OpenGL.glEnable(anInt5531);
			aClass167_Sub3_Sub1_5525.anIntArray11439[i] = anInt5531;
		}
		OpenGL.glBindTexture(anInt5531, anInt5530);
	}

	boolean method254() {
		if (anInt5530 == 0)
			throw new IllegalStateException("");
		int i = method5978();
		aClass167_Sub3_Sub1_5525.method8781(this);
		if (aClass167_Sub3_Sub1_5525.aBool11443)
			OpenGL.glEnable(anInt5531);
		OpenGL.glGenerateMipmapEXT(anInt5531);
		if (aClass167_Sub3_Sub1_5525.aBool11443)
			OpenGL.glDisable(anInt5531);
		aBool5534 = true;
		method5974();
		method5977(i);
		return true;
	}

	void method5974() {
		if (anInt5530 == 0)
			throw new IllegalStateException("");
		aClass167_Sub3_Sub1_5525.method8781(this);
		if (aClass342_5535 == Class342.aClass342_3663) {
			OpenGL.glTexParameteri(anInt5531, 10241, aBool5534 ? 9987 : 9729);
			OpenGL.glTexParameteri(anInt5531, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(anInt5531, 10241, aBool5534 ? 9984 : 9728);
			OpenGL.glTexParameteri(anInt5531, 10240, 9728);
		}
	}

	boolean method230() {
		if (anInt5530 == 0)
			throw new IllegalStateException("");
		int i = method5978();
		aClass167_Sub3_Sub1_5525.method8781(this);
		if (aClass167_Sub3_Sub1_5525.aBool11443)
			OpenGL.glEnable(anInt5531);
		OpenGL.glGenerateMipmapEXT(anInt5531);
		if (aClass167_Sub3_Sub1_5525.aBool11443)
			OpenGL.glDisable(anInt5531);
		aBool5534 = true;
		method5974();
		method5977(i);
		return true;
	}

	void method5975(int i, int i_1_, int i_2_, int[] is) {
		if (anInt5530 == 0)
			throw new IllegalStateException("");
		if (i_1_ > 0 && !Class29.method777(i_1_, (short) 16383))
			throw new IllegalArgumentException("");
		if (i_2_ > 0 && !Class29.method777(i_2_, (short) 16383))
			throw new IllegalArgumentException("");
		if (aClass155_5533 != Class155.aClass155_1722)
			throw new IllegalArgumentException("");
		int i_3_ = 0;
		int i_4_ = i_1_ < i_2_ ? i_1_ : i_2_;
		int i_5_ = i_1_ >> 1;
		int i_6_ = i_2_ >> 1;
		int[] is_7_ = is;
		int[] is_8_ = new int[i_5_ * i_6_];
		for (;;) {
			OpenGL.glTexImage2Di(i, i_3_, Class167_Sub3_Sub1.method10567(aClass155_5533, aClass171_5537), i_1_, i_2_, 0, 32993, aClass167_Sub3_Sub1_5525.anInt11454, is_7_, 0);
			if (i_4_ <= 1)
				break;
			int i_9_ = 0;
			int i_10_ = 0;
			int i_11_ = i_10_ + i_1_;
			for (int i_12_ = 0; i_12_ < i_6_; i_12_++) {
				for (int i_13_ = 0; i_13_ < i_5_; i_13_++) {
					int i_14_ = is_7_[i_10_++];
					int i_15_ = is_7_[i_10_++];
					int i_16_ = is_7_[i_11_++];
					int i_17_ = is_7_[i_11_++];
					int i_18_ = i_14_ >> 24 & 0xff;
					int i_19_ = i_14_ >> 16 & 0xff;
					int i_20_ = i_14_ >> 8 & 0xff;
					int i_21_ = i_14_ & 0xff;
					i_18_ += i_15_ >> 24 & 0xff;
					i_19_ += i_15_ >> 16 & 0xff;
					i_20_ += i_15_ >> 8 & 0xff;
					i_21_ += i_15_ & 0xff;
					i_18_ += i_16_ >> 24 & 0xff;
					i_19_ += i_16_ >> 16 & 0xff;
					i_20_ += i_16_ >> 8 & 0xff;
					i_21_ += i_16_ & 0xff;
					i_18_ += i_17_ >> 24 & 0xff;
					i_19_ += i_17_ >> 16 & 0xff;
					i_20_ += i_17_ >> 8 & 0xff;
					i_21_ += i_17_ & 0xff;
					is_8_[i_9_++] = ((i_18_ & 0x3fc) << 22 | (i_19_ & 0x3fc) << 14 | (i_20_ & 0x3fc) << 6 | (i_21_ & 0x3fc) >> 2);
				}
				i_10_ += i_1_;
				i_11_ += i_1_;
			}
			int[] is_22_ = is_8_;
			is_8_ = is_7_;
			is_7_ = is_22_;
			i_1_ = i_5_;
			i_2_ = i_6_;
			i_5_ >>= 1;
			i_6_ >>= 1;
			i_4_ >>= 1;
			i_3_++;
		}
	}

	void method5976(int i, int i_23_, int i_24_, float[] fs) {
		if (anInt5530 == 0)
			throw new IllegalStateException("");
		if (i_23_ > 0 && !Class29.method777(i_23_, (short) 16383))
			throw new IllegalArgumentException("");
		if (i_24_ > 0 && !Class29.method777(i_24_, (short) 16383))
			throw new IllegalArgumentException("");
		int i_25_ = aClass155_5533.anInt1732 * -2037186451;
		int i_26_ = 0;
		int i_27_ = i_23_ < i_24_ ? i_23_ : i_24_;
		int i_28_ = i_23_ >> 1;
		int i_29_ = i_24_ >> 1;
		float[] fs_30_ = fs;
		float[] fs_31_ = new float[i_28_ * i_29_ * i_25_];
		for (;;) {
			OpenGL.glTexImage2Df(i, i_26_, Class167_Sub3_Sub1.method10567(aClass155_5533, aClass171_5537), i_23_, i_24_, 0, Class167_Sub3_Sub1.method10566(aClass155_5533), 5126, fs_30_, 0);
			if (i_27_ <= 1)
				break;
			int i_32_ = i_23_ * i_25_;
			for (int i_33_ = 0; i_33_ < i_25_; i_33_++) {
				int i_34_ = i_33_;
				int i_35_ = i_33_;
				int i_36_ = i_35_ + i_32_;
				for (int i_37_ = 0; i_37_ < i_29_; i_37_++) {
					for (int i_38_ = 0; i_38_ < i_28_; i_38_++) {
						float f = fs_30_[i_35_];
						i_35_ += i_25_;
						f += fs_30_[i_35_];
						i_35_ += i_25_;
						f += fs_30_[i_36_];
						i_36_ += i_25_;
						f += fs_30_[i_36_];
						i_36_ += i_25_;
						fs_31_[i_34_] = f * 0.25F;
						i_34_ += i_25_;
					}
					i_35_ += i_32_;
					i_36_ += i_32_;
				}
			}
			float[] fs_39_ = fs_31_;
			fs_31_ = fs_30_;
			fs_30_ = fs_39_;
			i_23_ = i_28_;
			i_24_ = i_29_;
			i_28_ >>= 1;
			i_29_ >>= 1;
			i_27_ >>= 1;
			i_26_++;
		}
	}

	void method5977(int i) {
		aClass167_Sub3_Sub1_5525.anInt9556 -= i;
		aClass167_Sub3_Sub1_5525.anInt9556 += method5978();
	}

	int method5978() {
		int i = (aClass155_5533.anInt1732 * -2037186451 * (aClass171_5537.anInt1898 * -147747987) * anInt5536);
		return aBool5534 ? i * 4 / 3 : i;
	}

	public void method131() {
		if (anInt5530 != 0) {
			aClass167_Sub3_Sub1_5525.anInt9556 -= method5978();
			int[] is = new int[1];
			is[0] = anInt5530;
			OpenGL.glDeleteTextures(1, is, 0);
			anInt5530 = 0;
		}
	}

	boolean method236() {
		if (anInt5530 == 0)
			throw new IllegalStateException("");
		int i = method5978();
		aClass167_Sub3_Sub1_5525.method8781(this);
		if (aClass167_Sub3_Sub1_5525.aBool11443)
			OpenGL.glEnable(anInt5531);
		OpenGL.glGenerateMipmapEXT(anInt5531);
		if (aClass167_Sub3_Sub1_5525.aBool11443)
			OpenGL.glDisable(anInt5531);
		aBool5534 = true;
		method5974();
		method5977(i);
		return true;
	}

	public void finalize() throws Throwable {
		method5984();
		super.finalize();
	}

	public void method130() {
		if (anInt5530 != 0) {
			aClass167_Sub3_Sub1_5525.anInt9556 -= method5978();
			int[] is = new int[1];
			is[0] = anInt5530;
			OpenGL.glDeleteTextures(1, is, 0);
			anInt5530 = 0;
		}
	}

	public void method129() {
		if (anInt5530 != 0) {
			aClass167_Sub3_Sub1_5525.anInt9556 -= method5978();
			int[] is = new int[1];
			is[0] = anInt5530;
			OpenGL.glDeleteTextures(1, is, 0);
			anInt5530 = 0;
		}
	}

	void method5979() throws Throwable {
		method5984();
		super.finalize();
	}

	Class493(Class167_Sub3_Sub1 class167_sub3_sub1, int i, Class155 class155, Class171 class171, int i_40_, boolean bool) {
		aClass167_Sub3_Sub1_5525 = class167_sub3_sub1;
		anInt5531 = i;
		aClass155_5533 = class155;
		aClass171_5537 = class171;
		aBool5534 = bool;
		anInt5536 = i_40_;
		OpenGL.glGenTextures(1, anIntArray5529, 0);
		anInt5530 = anIntArray5529[0];
		method5974();
		method5977(0);
	}

	boolean method252() {
		if (anInt5530 == 0)
			throw new IllegalStateException("");
		int i = method5978();
		aClass167_Sub3_Sub1_5525.method8781(this);
		if (aClass167_Sub3_Sub1_5525.aBool11443)
			OpenGL.glEnable(anInt5531);
		OpenGL.glGenerateMipmapEXT(anInt5531);
		if (aClass167_Sub3_Sub1_5525.aBool11443)
			OpenGL.glDisable(anInt5531);
		aBool5534 = true;
		method5974();
		method5977(i);
		return true;
	}

	public void method276() {
		if (anInt5530 == 0)
			throw new IllegalStateException("");
		int i = aClass167_Sub3_Sub1_5525.method8811();
		int i_41_ = aClass167_Sub3_Sub1_5525.anIntArray11439[i];
		if (i_41_ != anInt5531) {
			if (i_41_ != 0) {
				OpenGL.glBindTexture(i_41_, 0);
				OpenGL.glDisable(i_41_);
			}
			OpenGL.glEnable(anInt5531);
			aClass167_Sub3_Sub1_5525.anIntArray11439[i] = anInt5531;
		}
		OpenGL.glBindTexture(anInt5531, anInt5530);
	}

	public void method277() {
		if (anInt5530 == 0)
			throw new IllegalStateException("");
		int i = aClass167_Sub3_Sub1_5525.method8811();
		int i_42_ = aClass167_Sub3_Sub1_5525.anIntArray11439[i];
		if (i_42_ != anInt5531) {
			if (i_42_ != 0) {
				OpenGL.glBindTexture(i_42_, 0);
				OpenGL.glDisable(i_42_);
			}
			OpenGL.glEnable(anInt5531);
			aClass167_Sub3_Sub1_5525.anIntArray11439[i] = anInt5531;
		}
		OpenGL.glBindTexture(anInt5531, anInt5530);
	}

	public void method278(Class342 class342) {
		if (aClass342_5535 != class342) {
			aClass342_5535 = class342;
			method5974();
		}
	}

	void method5980(int i, int i_43_, int i_44_, byte[] is) {
		if (anInt5530 == 0)
			throw new IllegalStateException("");
		if (i_43_ > 0 && !Class29.method777(i_43_, (short) 16383))
			throw new IllegalArgumentException("");
		if (i_44_ > 0 && !Class29.method777(i_44_, (short) 16383))
			throw new IllegalArgumentException("");
		int i_45_ = aClass155_5533.anInt1732 * -2037186451;
		int i_46_ = 0;
		int i_47_ = i_43_ < i_44_ ? i_43_ : i_44_;
		int i_48_ = i_43_ >> 1;
		int i_49_ = i_44_ >> 1;
		byte[] is_50_ = is;
		byte[] is_51_ = new byte[i_48_ * i_49_ * i_45_];
		for (;;) {
			OpenGL.glTexImage2Dub(i, i_46_, Class167_Sub3_Sub1.method10567(aClass155_5533, aClass171_5537), i_43_, i_44_, 0, Class167_Sub3_Sub1.method10566(aClass155_5533), 5121, is_50_, 0);
			if (i_47_ <= 1)
				break;
			int i_52_ = i_43_ * i_45_;
			for (int i_53_ = 0; i_53_ < i_45_; i_53_++) {
				int i_54_ = i_53_;
				int i_55_ = i_53_;
				int i_56_ = i_55_ + i_52_;
				for (int i_57_ = 0; i_57_ < i_49_; i_57_++) {
					for (int i_58_ = 0; i_58_ < i_48_; i_58_++) {
						int i_59_ = is_50_[i_55_];
						i_55_ += i_45_;
						i_59_ += is_50_[i_55_];
						i_55_ += i_45_;
						i_59_ += is_50_[i_56_];
						i_56_ += i_45_;
						i_59_ += is_50_[i_56_];
						i_56_ += i_45_;
						is_51_[i_54_] = (byte) (i_59_ >> 2);
						i_54_ += i_45_;
					}
					i_55_ += i_52_;
					i_56_ += i_52_;
				}
			}
			byte[] is_60_ = is_51_;
			is_51_ = is_50_;
			is_50_ = is_60_;
			i_43_ = i_48_;
			i_44_ = i_49_;
			i_48_ >>= 1;
			i_49_ >>= 1;
			i_47_ >>= 1;
			i_46_++;
		}
	}

	void method5981() {
		if (anInt5530 == 0)
			throw new IllegalStateException("");
		aClass167_Sub3_Sub1_5525.method8781(this);
		if (aClass342_5535 == Class342.aClass342_3663) {
			OpenGL.glTexParameteri(anInt5531, 10241, aBool5534 ? 9987 : 9729);
			OpenGL.glTexParameteri(anInt5531, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(anInt5531, 10241, aBool5534 ? 9984 : 9728);
			OpenGL.glTexParameteri(anInt5531, 10240, 9728);
		}
	}

	void method5982() {
		if (anInt5530 == 0)
			throw new IllegalStateException("");
		aClass167_Sub3_Sub1_5525.method8781(this);
		if (aClass342_5535 == Class342.aClass342_3663) {
			OpenGL.glTexParameteri(anInt5531, 10241, aBool5534 ? 9987 : 9729);
			OpenGL.glTexParameteri(anInt5531, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(anInt5531, 10241, aBool5534 ? 9984 : 9728);
			OpenGL.glTexParameteri(anInt5531, 10240, 9728);
		}
	}

	void method5983() {
		if (anInt5530 == 0)
			throw new IllegalStateException("");
		aClass167_Sub3_Sub1_5525.method8781(this);
		if (aClass342_5535 == Class342.aClass342_3663) {
			OpenGL.glTexParameteri(anInt5531, 10241, aBool5534 ? 9987 : 9729);
			OpenGL.glTexParameteri(anInt5531, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(anInt5531, 10241, aBool5534 ? 9984 : 9728);
			OpenGL.glTexParameteri(anInt5531, 10240, 9728);
		}
	}

	public void method279(Class342 class342) {
		if (aClass342_5535 != class342) {
			aClass342_5535 = class342;
			method5974();
		}
	}

	void method5984() {
		if (anInt5530 != 0) {
			aClass167_Sub3_Sub1_5525.method10561(anInt5530, method5978());
			anInt5530 = 0;
		}
	}

	public void method274(Class342 class342) {
		if (aClass342_5535 != class342) {
			aClass342_5535 = class342;
			method5974();
		}
	}

	void method5985() throws Throwable {
		method5984();
		super.finalize();
	}

	void method5986(int i) {
		aClass167_Sub3_Sub1_5525.anInt9556 -= i;
		aClass167_Sub3_Sub1_5525.anInt9556 += method5978();
	}

	int method5987() {
		int i = (aClass155_5533.anInt1732 * -2037186451 * (aClass171_5537.anInt1898 * -147747987) * anInt5536);
		return aBool5534 ? i * 4 / 3 : i;
	}

	int method5988() {
		int i = (aClass155_5533.anInt1732 * -2037186451 * (aClass171_5537.anInt1898 * -147747987) * anInt5536);
		return aBool5534 ? i * 4 / 3 : i;
	}
}
