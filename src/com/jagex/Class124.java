/* Class124 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public abstract class Class124 {
	Class167_Sub2 aClass167_Sub2_1488;
	static final int anInt1489 = 3553;
	static final int anInt1490 = 34037;
	static final int anInt1491 = 34067;
	static final int anInt1492 = 32879;
	static final int anInt1493 = 5121;
	static final int anInt1494 = 3552;
	Class155 aClass155_1495;
	int anInt1496;
	int anInt1497;
	Class171 aClass171_1498;
	boolean aBool1499;
	boolean aBool1500 = false;
	int anInt1501;
	static int[] anIntArray1502 = new int[1];

	static void method1608(int i, int i_0_, int i_1_, int i_2_, Class155 class155, byte[] is) {
		if (i_1_ > 0 && !Class29.method777(i_1_, (short) 16383))
			throw new IllegalArgumentException("");
		if (i_2_ > 0 && !Class29.method777(i_2_, (short) 16383))
			throw new IllegalArgumentException("");
		int i_3_ = class155.anInt1732 * -2037186451;
		int i_4_ = 0;
		int i_5_ = i_1_ < i_2_ ? i_1_ : i_2_;
		int i_6_ = i_1_ >> 1;
		int i_7_ = i_2_ >> 1;
		byte[] is_8_ = is;
		byte[] is_9_ = new byte[i_6_ * i_7_ * i_3_];
		for (;;) {
			OpenGL.glTexImage2Dub(i, i_4_, i_0_, i_1_, i_2_, 0, Class167_Sub2.method8576(class155), 5121, is_8_, 0);
			if (i_5_ <= 1)
				break;
			int i_10_ = i_1_ * i_3_;
			for (int i_11_ = 0; i_11_ < i_3_; i_11_++) {
				int i_12_ = i_11_;
				int i_13_ = i_11_;
				int i_14_ = i_13_ + i_10_;
				for (int i_15_ = 0; i_15_ < i_7_; i_15_++) {
					for (int i_16_ = 0; i_16_ < i_6_; i_16_++) {
						int i_17_ = is_8_[i_13_];
						i_13_ += i_3_;
						i_17_ += is_8_[i_13_];
						i_13_ += i_3_;
						i_17_ += is_8_[i_14_];
						i_14_ += i_3_;
						i_17_ += is_8_[i_14_];
						i_14_ += i_3_;
						is_9_[i_12_] = (byte) (i_17_ >> 2);
						i_12_ += i_3_;
					}
					i_13_ += i_10_;
					i_14_ += i_10_;
				}
			}
			byte[] is_18_ = is_9_;
			is_9_ = is_8_;
			is_8_ = is_18_;
			i_1_ = i_6_;
			i_2_ = i_7_;
			i_6_ >>= 1;
			i_7_ >>= 1;
			i_5_ >>= 1;
			i_4_++;
		}
	}

	void method1609(boolean bool) {
		if (aBool1500 != bool) {
			aBool1500 = bool;
			method1615();
		}
	}

	void method1610() {
		if (anInt1497 != 0) {
			aClass167_Sub2_1488.method8592(anInt1497, method1635());
			anInt1497 = 0;
		}
	}

	boolean method1611() {
		if (aClass167_Sub2_1488.aBool9289) {
			int i = method1635();
			aClass167_Sub2_1488.method8617(this);
			OpenGL.glGenerateMipmapEXT(anInt1496);
			aBool1499 = true;
			method1615();
			method1616(i);
			return true;
		}
		return false;
	}

	static void method1612(int i, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_, int[] is) {
		if (i_20_ > 0 && !Class29.method777(i_20_, (short) 16383))
			throw new IllegalArgumentException("");
		if (i_21_ > 0 && !Class29.method777(i_21_, (short) 16383))
			throw new IllegalArgumentException("");
		if (i_22_ != 32993)
			throw new IllegalArgumentException("");
		int i_24_ = 0;
		int i_25_ = i_20_ < i_21_ ? i_20_ : i_21_;
		int i_26_ = i_20_ >> 1;
		int i_27_ = i_21_ >> 1;
		int[] is_28_ = is;
		int[] is_29_ = new int[i_26_ * i_27_];
		for (;;) {
			OpenGL.glTexImage2Di(i, i_24_, i_19_, i_20_, i_21_, 0, i_22_, i_23_, is_28_, 0);
			if (i_25_ <= 1)
				break;
			int i_30_ = 0;
			int i_31_ = 0;
			int i_32_ = i_31_ + i_20_;
			for (int i_33_ = 0; i_33_ < i_27_; i_33_++) {
				for (int i_34_ = 0; i_34_ < i_26_; i_34_++) {
					int i_35_ = is_28_[i_31_++];
					int i_36_ = is_28_[i_31_++];
					int i_37_ = is_28_[i_32_++];
					int i_38_ = is_28_[i_32_++];
					int i_39_ = i_35_ >> 24 & 0xff;
					int i_40_ = i_35_ >> 16 & 0xff;
					int i_41_ = i_35_ >> 8 & 0xff;
					int i_42_ = i_35_ & 0xff;
					i_39_ += i_36_ >> 24 & 0xff;
					i_40_ += i_36_ >> 16 & 0xff;
					i_41_ += i_36_ >> 8 & 0xff;
					i_42_ += i_36_ & 0xff;
					i_39_ += i_37_ >> 24 & 0xff;
					i_40_ += i_37_ >> 16 & 0xff;
					i_41_ += i_37_ >> 8 & 0xff;
					i_42_ += i_37_ & 0xff;
					i_39_ += i_38_ >> 24 & 0xff;
					i_40_ += i_38_ >> 16 & 0xff;
					i_41_ += i_38_ >> 8 & 0xff;
					i_42_ += i_38_ & 0xff;
					is_29_[i_30_++] = ((i_39_ & 0x3fc) << 22 | (i_40_ & 0x3fc) << 14 | (i_41_ & 0x3fc) << 6 | (i_42_ & 0x3fc) >> 2);
				}
				i_31_ += i_20_;
				i_32_ += i_20_;
			}
			int[] is_43_ = is_29_;
			is_29_ = is_28_;
			is_28_ = is_43_;
			i_20_ = i_26_;
			i_21_ = i_27_;
			i_26_ >>= 1;
			i_27_ >>= 1;
			i_25_ >>= 1;
			i_24_++;
		}
	}

	void method1613() {
		if (anInt1497 != 0) {
			aClass167_Sub2_1488.anInt9296 -= method1635();
			int[] is = new int[1];
			is[0] = anInt1497;
			OpenGL.glDeleteTextures(1, is, 0);
			anInt1497 = 0;
		}
	}

	void method1614() {
		if (anInt1497 != 0) {
			aClass167_Sub2_1488.method8592(anInt1497, method1635());
			anInt1497 = 0;
		}
	}

	public void finalize() throws Throwable {
		method1625();
		super.finalize();
	}

	void method1615() {
		aClass167_Sub2_1488.method8617(this);
		if (aBool1500) {
			OpenGL.glTexParameteri(anInt1496, 10241, aBool1499 ? 9987 : 9729);
			OpenGL.glTexParameteri(anInt1496, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(anInt1496, 10241, aBool1499 ? 9984 : 9728);
			OpenGL.glTexParameteri(anInt1496, 10240, 9728);
		}
	}

	void method1616(int i) {
		aClass167_Sub2_1488.anInt9296 -= i;
		aClass167_Sub2_1488.anInt9296 += method1635();
	}

	void method1617(boolean bool) {
		if (aBool1499 != bool) {
			int i = method1635();
			aBool1499 = true;
			method1615();
			method1616(i);
		}
	}

	static void method1618(int i, int i_44_, int i_45_, int i_46_, Class155 class155, float[] fs) {
		if (i_45_ > 0 && !Class29.method777(i_45_, (short) 16383))
			throw new IllegalArgumentException("");
		if (i_46_ > 0 && !Class29.method777(i_46_, (short) 16383))
			throw new IllegalArgumentException("");
		int i_47_ = class155.anInt1732 * -2037186451;
		int i_48_ = 0;
		int i_49_ = i_45_ < i_46_ ? i_45_ : i_46_;
		int i_50_ = i_45_ >> 1;
		int i_51_ = i_46_ >> 1;
		float[] fs_52_ = fs;
		float[] fs_53_ = new float[i_50_ * i_51_ * i_47_];
		for (;;) {
			OpenGL.glTexImage2Df(i, i_48_, i_44_, i_45_, i_46_, 0, Class167_Sub2.method8576(class155), 5126, fs_52_, 0);
			if (i_49_ <= 1)
				break;
			int i_54_ = i_45_ * i_47_;
			for (int i_55_ = 0; i_55_ < i_47_; i_55_++) {
				int i_56_ = i_55_;
				int i_57_ = i_55_;
				int i_58_ = i_57_ + i_54_;
				for (int i_59_ = 0; i_59_ < i_51_; i_59_++) {
					for (int i_60_ = 0; i_60_ < i_50_; i_60_++) {
						float f = fs_52_[i_57_];
						i_57_ += i_47_;
						f += fs_52_[i_57_];
						i_57_ += i_47_;
						f += fs_52_[i_58_];
						i_58_ += i_47_;
						f += fs_52_[i_58_];
						i_58_ += i_47_;
						fs_53_[i_56_] = f * 0.25F;
						i_56_ += i_47_;
					}
					i_57_ += i_54_;
					i_58_ += i_54_;
				}
			}
			float[] fs_61_ = fs_53_;
			fs_53_ = fs_52_;
			fs_52_ = fs_61_;
			i_45_ = i_50_;
			i_46_ = i_51_;
			i_50_ >>= 1;
			i_51_ >>= 1;
			i_49_ >>= 1;
			i_48_++;
		}
	}

	void method1619() throws Throwable {
		method1625();
		super.finalize();
	}

	void method1620() throws Throwable {
		method1625();
		super.finalize();
	}

	void method1621(boolean bool) {
		if (aBool1500 != bool) {
			aBool1500 = bool;
			method1615();
		}
	}

	Class124(Class167_Sub2 class167_sub2, int i, Class155 class155, Class171 class171, int i_62_, boolean bool) {
		aClass167_Sub2_1488 = class167_sub2;
		anInt1496 = i;
		aClass155_1495 = class155;
		aClass171_1498 = class171;
		aBool1499 = bool;
		anInt1501 = i_62_;
		OpenGL.glGenTextures(1, anIntArray1502, 0);
		anInt1497 = anIntArray1502[0];
		method1616(0);
	}

	void method1622() {
		aClass167_Sub2_1488.method8617(this);
		if (aBool1500) {
			OpenGL.glTexParameteri(anInt1496, 10241, aBool1499 ? 9987 : 9729);
			OpenGL.glTexParameteri(anInt1496, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(anInt1496, 10241, aBool1499 ? 9984 : 9728);
			OpenGL.glTexParameteri(anInt1496, 10240, 9728);
		}
	}

	boolean method1623() {
		if (aClass167_Sub2_1488.aBool9289) {
			int i = method1635();
			aClass167_Sub2_1488.method8617(this);
			OpenGL.glGenerateMipmapEXT(anInt1496);
			aBool1499 = true;
			method1615();
			method1616(i);
			return true;
		}
		return false;
	}

	void method1624(boolean bool) {
		if (aBool1499 != bool) {
			int i = method1635();
			aBool1499 = true;
			method1615();
			method1616(i);
		}
	}

	void method1625() {
		if (anInt1497 != 0) {
			aClass167_Sub2_1488.method8592(anInt1497, method1635());
			anInt1497 = 0;
		}
	}

	void method1626() {
		if (anInt1497 != 0) {
			aClass167_Sub2_1488.anInt9296 -= method1635();
			int[] is = new int[1];
			is[0] = anInt1497;
			OpenGL.glDeleteTextures(1, is, 0);
			anInt1497 = 0;
		}
	}

	void method1627() {
		if (anInt1497 != 0) {
			aClass167_Sub2_1488.method8592(anInt1497, method1635());
			anInt1497 = 0;
		}
	}

	void method1628() {
		if (anInt1497 != 0) {
			aClass167_Sub2_1488.method8592(anInt1497, method1635());
			anInt1497 = 0;
		}
	}

	void method1629() {
		aClass167_Sub2_1488.method8617(this);
		if (aBool1500) {
			OpenGL.glTexParameteri(anInt1496, 10241, aBool1499 ? 9987 : 9729);
			OpenGL.glTexParameteri(anInt1496, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(anInt1496, 10241, aBool1499 ? 9984 : 9728);
			OpenGL.glTexParameteri(anInt1496, 10240, 9728);
		}
	}

	int method1630() {
		int i = (aClass155_1495.anInt1732 * -2037186451 * (aClass171_1498.anInt1898 * -147747987) * anInt1501);
		return aBool1499 ? i * 4 / 3 : i;
	}

	int method1631() {
		int i = (aClass155_1495.anInt1732 * -2037186451 * (aClass171_1498.anInt1898 * -147747987) * anInt1501);
		return aBool1499 ? i * 4 / 3 : i;
	}

	void method1632() {
		if (anInt1497 != 0) {
			aClass167_Sub2_1488.method8592(anInt1497, method1635());
			anInt1497 = 0;
		}
	}

	int method1633() {
		int i = (aClass155_1495.anInt1732 * -2037186451 * (aClass171_1498.anInt1898 * -147747987) * anInt1501);
		return aBool1499 ? i * 4 / 3 : i;
	}

	void method1634(boolean bool) {
		if (aBool1499 != bool) {
			int i = method1635();
			aBool1499 = true;
			method1615();
			method1616(i);
		}
	}

	int method1635() {
		int i = (aClass155_1495.anInt1732 * -2037186451 * (aClass171_1498.anInt1898 * -147747987) * anInt1501);
		return aBool1499 ? i * 4 / 3 : i;
	}
}
