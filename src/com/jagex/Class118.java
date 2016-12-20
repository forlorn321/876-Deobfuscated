/* Class118 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public abstract class Class118 {
	Class157 aClass157_1426;
	static final int anInt1427 = 3553;
	static final int anInt1428 = 5121;
	static final int anInt1429 = 32879;
	int anInt1430;
	Class184 aClass184_1431;
	Class180_Sub3 aClass180_Sub3_1432;
	int anInt1433;
	int anInt1434;
	static int[] anIntArray1435 = new int[1];
	static final int anInt1436 = 34067;
	boolean aBool1437;
	boolean aBool1438 = false;
	static final int anInt1439 = 3552;
	static final int anInt1440 = 34037;

	static void method2034(int i, int i_0_, int i_1_, int i_2_, Class157 class157, float[] fs) {
		if (i_1_ > 0 && !Class143.method2383(i_1_, 1871412447))
			throw new IllegalArgumentException("");
		if (i_2_ > 0 && !Class143.method2383(i_2_, 2048770832))
			throw new IllegalArgumentException("");
		int i_3_ = class157.anInt1722 * -1216378097;
		int i_4_ = 0;
		int i_5_ = i_1_ < i_2_ ? i_1_ : i_2_;
		int i_6_ = i_1_ >> 1;
		int i_7_ = i_2_ >> 1;
		float[] fs_8_ = fs;
		float[] fs_9_ = new float[i_6_ * i_7_ * i_3_];
		for (;;) {
			OpenGL.glTexImage2Df(i, i_4_, i_0_, i_1_, i_2_, 0, Class180_Sub3.method15423(class157), 5126, fs_8_, 0);
			if (i_5_ <= 1)
				break;
			int i_10_ = i_1_ * i_3_;
			for (int i_11_ = 0; i_11_ < i_3_; i_11_++) {
				int i_12_ = i_11_;
				int i_13_ = i_11_;
				int i_14_ = i_13_ + i_10_;
				for (int i_15_ = 0; i_15_ < i_7_; i_15_++) {
					for (int i_16_ = 0; i_16_ < i_6_; i_16_++) {
						float f = fs_8_[i_13_];
						i_13_ += i_3_;
						f += fs_8_[i_13_];
						i_13_ += i_3_;
						f += fs_8_[i_14_];
						i_14_ += i_3_;
						f += fs_8_[i_14_];
						i_14_ += i_3_;
						fs_9_[i_12_] = f * 0.25F;
						i_12_ += i_3_;
					}
					i_13_ += i_10_;
					i_14_ += i_10_;
				}
			}
			float[] fs_17_ = fs_9_;
			fs_9_ = fs_8_;
			fs_8_ = fs_17_;
			i_1_ = i_6_;
			i_2_ = i_7_;
			i_6_ >>= 1;
			i_7_ >>= 1;
			i_5_ >>= 1;
			i_4_++;
		}
	}

	void method2035(boolean bool) {
		if (aBool1438 != bool) {
			aBool1438 = bool;
			method2055();
		}
	}

	boolean method2036() {
		if (aClass180_Sub3_1432.aBool9818) {
			int i = method2053();
			aClass180_Sub3_1432.method15401(this);
			OpenGL.glGenerateMipmapEXT(anInt1434);
			aBool1437 = true;
			method2055();
			method2041(i);
			return true;
		}
		return false;
	}

	boolean method2037() {
		if (aClass180_Sub3_1432.aBool9818) {
			int i = method2053();
			aClass180_Sub3_1432.method15401(this);
			OpenGL.glGenerateMipmapEXT(anInt1434);
			aBool1437 = true;
			method2055();
			method2041(i);
			return true;
		}
		return false;
	}

	void method2038(boolean bool) {
		if (aBool1437 != bool) {
			int i = method2053();
			aBool1437 = true;
			method2055();
			method2041(i);
		}
	}

	void method2039(boolean bool) {
		if (aBool1437 != bool) {
			int i = method2053();
			aBool1437 = true;
			method2055();
			method2041(i);
		}
	}

	void method2040() {
		if (anInt1433 != 0) {
			aClass180_Sub3_1432.method15384(anInt1433, method2053());
			anInt1433 = 0;
		}
	}

	public void finalize() throws Throwable {
		method2040();
		super.finalize();
	}

	void method2041(int i) {
		aClass180_Sub3_1432.anInt9712 -= i;
		aClass180_Sub3_1432.anInt9712 += method2053();
	}

	void method2042() throws Throwable {
		method2040();
		super.finalize();
	}

	static void method2043(int i, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_, int[] is) {
		if (i_19_ > 0 && !Class143.method2383(i_19_, 1890515887))
			throw new IllegalArgumentException("");
		if (i_20_ > 0 && !Class143.method2383(i_20_, 1694877536))
			throw new IllegalArgumentException("");
		if (i_21_ != 32993)
			throw new IllegalArgumentException("");
		int i_23_ = 0;
		int i_24_ = i_19_ < i_20_ ? i_19_ : i_20_;
		int i_25_ = i_19_ >> 1;
		int i_26_ = i_20_ >> 1;
		int[] is_27_ = is;
		int[] is_28_ = new int[i_25_ * i_26_];
		for (;;) {
			OpenGL.glTexImage2Di(i, i_23_, i_18_, i_19_, i_20_, 0, i_21_, i_22_, is_27_, 0);
			if (i_24_ <= 1)
				break;
			int i_29_ = 0;
			int i_30_ = 0;
			int i_31_ = i_30_ + i_19_;
			for (int i_32_ = 0; i_32_ < i_26_; i_32_++) {
				for (int i_33_ = 0; i_33_ < i_25_; i_33_++) {
					int i_34_ = is_27_[i_30_++];
					int i_35_ = is_27_[i_30_++];
					int i_36_ = is_27_[i_31_++];
					int i_37_ = is_27_[i_31_++];
					int i_38_ = i_34_ >> 24 & 0xff;
					int i_39_ = i_34_ >> 16 & 0xff;
					int i_40_ = i_34_ >> 8 & 0xff;
					int i_41_ = i_34_ & 0xff;
					i_38_ += i_35_ >> 24 & 0xff;
					i_39_ += i_35_ >> 16 & 0xff;
					i_40_ += i_35_ >> 8 & 0xff;
					i_41_ += i_35_ & 0xff;
					i_38_ += i_36_ >> 24 & 0xff;
					i_39_ += i_36_ >> 16 & 0xff;
					i_40_ += i_36_ >> 8 & 0xff;
					i_41_ += i_36_ & 0xff;
					i_38_ += i_37_ >> 24 & 0xff;
					i_39_ += i_37_ >> 16 & 0xff;
					i_40_ += i_37_ >> 8 & 0xff;
					i_41_ += i_37_ & 0xff;
					is_28_[i_29_++] = ((i_38_ & 0x3fc) << 22 | (i_39_ & 0x3fc) << 14 | (i_40_ & 0x3fc) << 6 | (i_41_ & 0x3fc) >> 2);
				}
				i_30_ += i_19_;
				i_31_ += i_19_;
			}
			int[] is_42_ = is_28_;
			is_28_ = is_27_;
			is_27_ = is_42_;
			i_19_ = i_25_;
			i_20_ = i_26_;
			i_25_ >>= 1;
			i_26_ >>= 1;
			i_24_ >>= 1;
			i_23_++;
		}
	}

	static void method2044(int i, int i_43_, int i_44_, int i_45_, Class157 class157, byte[] is) {
		if (i_44_ > 0 && !Class143.method2383(i_44_, 2036208758))
			throw new IllegalArgumentException("");
		if (i_45_ > 0 && !Class143.method2383(i_45_, 1495418036))
			throw new IllegalArgumentException("");
		int i_46_ = class157.anInt1722 * -1216378097;
		int i_47_ = 0;
		int i_48_ = i_44_ < i_45_ ? i_44_ : i_45_;
		int i_49_ = i_44_ >> 1;
		int i_50_ = i_45_ >> 1;
		byte[] is_51_ = is;
		byte[] is_52_ = new byte[i_49_ * i_50_ * i_46_];
		for (;;) {
			OpenGL.glTexImage2Dub(i, i_47_, i_43_, i_44_, i_45_, 0, Class180_Sub3.method15423(class157), 5121, is_51_, 0);
			if (i_48_ <= 1)
				break;
			int i_53_ = i_44_ * i_46_;
			for (int i_54_ = 0; i_54_ < i_46_; i_54_++) {
				int i_55_ = i_54_;
				int i_56_ = i_54_;
				int i_57_ = i_56_ + i_53_;
				for (int i_58_ = 0; i_58_ < i_50_; i_58_++) {
					for (int i_59_ = 0; i_59_ < i_49_; i_59_++) {
						int i_60_ = is_51_[i_56_];
						i_56_ += i_46_;
						i_60_ += is_51_[i_56_];
						i_56_ += i_46_;
						i_60_ += is_51_[i_57_];
						i_57_ += i_46_;
						i_60_ += is_51_[i_57_];
						i_57_ += i_46_;
						is_52_[i_55_] = (byte) (i_60_ >> 2);
						i_55_ += i_46_;
					}
					i_56_ += i_53_;
					i_57_ += i_53_;
				}
			}
			byte[] is_61_ = is_52_;
			is_52_ = is_51_;
			is_51_ = is_61_;
			i_44_ = i_49_;
			i_45_ = i_50_;
			i_49_ >>= 1;
			i_50_ >>= 1;
			i_48_ >>= 1;
			i_47_++;
		}
	}

	void method2045() {
		aClass180_Sub3_1432.method15401(this);
		if (aBool1438) {
			OpenGL.glTexParameteri(anInt1434, 10241, aBool1437 ? 9987 : 9729);
			OpenGL.glTexParameteri(anInt1434, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(anInt1434, 10241, aBool1437 ? 9984 : 9728);
			OpenGL.glTexParameteri(anInt1434, 10240, 9728);
		}
	}

	void method2046() {
		if (anInt1433 != 0) {
			aClass180_Sub3_1432.method15384(anInt1433, method2053());
			anInt1433 = 0;
		}
	}

	void method2047() throws Throwable {
		method2040();
		super.finalize();
	}

	void method2048() {
		if (anInt1433 != 0) {
			aClass180_Sub3_1432.method15384(anInt1433, method2053());
			anInt1433 = 0;
		}
	}

	void method2049(boolean bool) {
		if (aBool1437 != bool) {
			int i = method2053();
			aBool1437 = true;
			method2055();
			method2041(i);
		}
	}

	void method2050() throws Throwable {
		method2040();
		super.finalize();
	}

	void method2051(boolean bool) {
		if (aBool1438 != bool) {
			aBool1438 = bool;
			method2055();
		}
	}

	void method2052() throws Throwable {
		method2040();
		super.finalize();
	}

	int method2053() {
		int i = (aClass157_1426.anInt1722 * -1216378097 * (aClass184_1431.anInt2111 * 408933829) * anInt1430);
		return aBool1437 ? i * 4 / 3 : i;
	}

	boolean method2054() {
		if (aClass180_Sub3_1432.aBool9818) {
			int i = method2053();
			aClass180_Sub3_1432.method15401(this);
			OpenGL.glGenerateMipmapEXT(anInt1434);
			aBool1437 = true;
			method2055();
			method2041(i);
			return true;
		}
		return false;
	}

	void method2055() {
		aClass180_Sub3_1432.method15401(this);
		if (aBool1438) {
			OpenGL.glTexParameteri(anInt1434, 10241, aBool1437 ? 9987 : 9729);
			OpenGL.glTexParameteri(anInt1434, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(anInt1434, 10241, aBool1437 ? 9984 : 9728);
			OpenGL.glTexParameteri(anInt1434, 10240, 9728);
		}
	}

	void method2056(int i) {
		aClass180_Sub3_1432.anInt9712 -= i;
		aClass180_Sub3_1432.anInt9712 += method2053();
	}

	static void method2057(int i, int i_62_, int i_63_, int i_64_, Class157 class157, byte[] is) {
		if (i_63_ > 0 && !Class143.method2383(i_63_, 1992987405))
			throw new IllegalArgumentException("");
		if (i_64_ > 0 && !Class143.method2383(i_64_, 1836558233))
			throw new IllegalArgumentException("");
		int i_65_ = class157.anInt1722 * -1216378097;
		int i_66_ = 0;
		int i_67_ = i_63_ < i_64_ ? i_63_ : i_64_;
		int i_68_ = i_63_ >> 1;
		int i_69_ = i_64_ >> 1;
		byte[] is_70_ = is;
		byte[] is_71_ = new byte[i_68_ * i_69_ * i_65_];
		for (;;) {
			OpenGL.glTexImage2Dub(i, i_66_, i_62_, i_63_, i_64_, 0, Class180_Sub3.method15423(class157), 5121, is_70_, 0);
			if (i_67_ <= 1)
				break;
			int i_72_ = i_63_ * i_65_;
			for (int i_73_ = 0; i_73_ < i_65_; i_73_++) {
				int i_74_ = i_73_;
				int i_75_ = i_73_;
				int i_76_ = i_75_ + i_72_;
				for (int i_77_ = 0; i_77_ < i_69_; i_77_++) {
					for (int i_78_ = 0; i_78_ < i_68_; i_78_++) {
						int i_79_ = is_70_[i_75_];
						i_75_ += i_65_;
						i_79_ += is_70_[i_75_];
						i_75_ += i_65_;
						i_79_ += is_70_[i_76_];
						i_76_ += i_65_;
						i_79_ += is_70_[i_76_];
						i_76_ += i_65_;
						is_71_[i_74_] = (byte) (i_79_ >> 2);
						i_74_ += i_65_;
					}
					i_75_ += i_72_;
					i_76_ += i_72_;
				}
			}
			byte[] is_80_ = is_71_;
			is_71_ = is_70_;
			is_70_ = is_80_;
			i_63_ = i_68_;
			i_64_ = i_69_;
			i_68_ >>= 1;
			i_69_ >>= 1;
			i_67_ >>= 1;
			i_66_++;
		}
	}

	void method2058(int i) {
		aClass180_Sub3_1432.anInt9712 -= i;
		aClass180_Sub3_1432.anInt9712 += method2053();
	}

	Class118(Class180_Sub3 class180_sub3, int i, Class157 class157, Class184 class184, int i_81_, boolean bool) {
		aClass180_Sub3_1432 = class180_sub3;
		anInt1434 = i;
		aClass157_1426 = class157;
		aClass184_1431 = class184;
		aBool1437 = bool;
		anInt1430 = i_81_;
		OpenGL.glGenTextures(1, anIntArray1435, 0);
		anInt1433 = anIntArray1435[0];
		method2041(0);
	}

	void method2059() throws Throwable {
		method2040();
		super.finalize();
	}

	static void method2060(int i, int i_82_, int i_83_, int i_84_, int i_85_, int i_86_, int[] is) {
		if (i_83_ > 0 && !Class143.method2383(i_83_, 1887375738))
			throw new IllegalArgumentException("");
		if (i_84_ > 0 && !Class143.method2383(i_84_, 2020231122))
			throw new IllegalArgumentException("");
		if (i_85_ != 32993)
			throw new IllegalArgumentException("");
		int i_87_ = 0;
		int i_88_ = i_83_ < i_84_ ? i_83_ : i_84_;
		int i_89_ = i_83_ >> 1;
		int i_90_ = i_84_ >> 1;
		int[] is_91_ = is;
		int[] is_92_ = new int[i_89_ * i_90_];
		for (;;) {
			OpenGL.glTexImage2Di(i, i_87_, i_82_, i_83_, i_84_, 0, i_85_, i_86_, is_91_, 0);
			if (i_88_ <= 1)
				break;
			int i_93_ = 0;
			int i_94_ = 0;
			int i_95_ = i_94_ + i_83_;
			for (int i_96_ = 0; i_96_ < i_90_; i_96_++) {
				for (int i_97_ = 0; i_97_ < i_89_; i_97_++) {
					int i_98_ = is_91_[i_94_++];
					int i_99_ = is_91_[i_94_++];
					int i_100_ = is_91_[i_95_++];
					int i_101_ = is_91_[i_95_++];
					int i_102_ = i_98_ >> 24 & 0xff;
					int i_103_ = i_98_ >> 16 & 0xff;
					int i_104_ = i_98_ >> 8 & 0xff;
					int i_105_ = i_98_ & 0xff;
					i_102_ += i_99_ >> 24 & 0xff;
					i_103_ += i_99_ >> 16 & 0xff;
					i_104_ += i_99_ >> 8 & 0xff;
					i_105_ += i_99_ & 0xff;
					i_102_ += i_100_ >> 24 & 0xff;
					i_103_ += i_100_ >> 16 & 0xff;
					i_104_ += i_100_ >> 8 & 0xff;
					i_105_ += i_100_ & 0xff;
					i_102_ += i_101_ >> 24 & 0xff;
					i_103_ += i_101_ >> 16 & 0xff;
					i_104_ += i_101_ >> 8 & 0xff;
					i_105_ += i_101_ & 0xff;
					is_92_[i_93_++] = ((i_102_ & 0x3fc) << 22 | (i_103_ & 0x3fc) << 14 | (i_104_ & 0x3fc) << 6 | (i_105_ & 0x3fc) >> 2);
				}
				i_94_ += i_83_;
				i_95_ += i_83_;
			}
			int[] is_106_ = is_92_;
			is_92_ = is_91_;
			is_91_ = is_106_;
			i_83_ = i_89_;
			i_84_ = i_90_;
			i_89_ >>= 1;
			i_90_ >>= 1;
			i_88_ >>= 1;
			i_87_++;
		}
	}

	static void method2061(int i, int i_107_, int i_108_, int i_109_, int i_110_, int i_111_, int[] is) {
		if (i_108_ > 0 && !Class143.method2383(i_108_, 1716555002))
			throw new IllegalArgumentException("");
		if (i_109_ > 0 && !Class143.method2383(i_109_, 1898279694))
			throw new IllegalArgumentException("");
		if (i_110_ != 32993)
			throw new IllegalArgumentException("");
		int i_112_ = 0;
		int i_113_ = i_108_ < i_109_ ? i_108_ : i_109_;
		int i_114_ = i_108_ >> 1;
		int i_115_ = i_109_ >> 1;
		int[] is_116_ = is;
		int[] is_117_ = new int[i_114_ * i_115_];
		for (;;) {
			OpenGL.glTexImage2Di(i, i_112_, i_107_, i_108_, i_109_, 0, i_110_, i_111_, is_116_, 0);
			if (i_113_ <= 1)
				break;
			int i_118_ = 0;
			int i_119_ = 0;
			int i_120_ = i_119_ + i_108_;
			for (int i_121_ = 0; i_121_ < i_115_; i_121_++) {
				for (int i_122_ = 0; i_122_ < i_114_; i_122_++) {
					int i_123_ = is_116_[i_119_++];
					int i_124_ = is_116_[i_119_++];
					int i_125_ = is_116_[i_120_++];
					int i_126_ = is_116_[i_120_++];
					int i_127_ = i_123_ >> 24 & 0xff;
					int i_128_ = i_123_ >> 16 & 0xff;
					int i_129_ = i_123_ >> 8 & 0xff;
					int i_130_ = i_123_ & 0xff;
					i_127_ += i_124_ >> 24 & 0xff;
					i_128_ += i_124_ >> 16 & 0xff;
					i_129_ += i_124_ >> 8 & 0xff;
					i_130_ += i_124_ & 0xff;
					i_127_ += i_125_ >> 24 & 0xff;
					i_128_ += i_125_ >> 16 & 0xff;
					i_129_ += i_125_ >> 8 & 0xff;
					i_130_ += i_125_ & 0xff;
					i_127_ += i_126_ >> 24 & 0xff;
					i_128_ += i_126_ >> 16 & 0xff;
					i_129_ += i_126_ >> 8 & 0xff;
					i_130_ += i_126_ & 0xff;
					is_117_[i_118_++] = ((i_127_ & 0x3fc) << 22 | (i_128_ & 0x3fc) << 14 | (i_129_ & 0x3fc) << 6 | (i_130_ & 0x3fc) >> 2);
				}
				i_119_ += i_108_;
				i_120_ += i_108_;
			}
			int[] is_131_ = is_117_;
			is_117_ = is_116_;
			is_116_ = is_131_;
			i_108_ = i_114_;
			i_109_ = i_115_;
			i_114_ >>= 1;
			i_115_ >>= 1;
			i_113_ >>= 1;
			i_112_++;
		}
	}

	static void method2062(int i, int i_132_, int i_133_, int i_134_, Class157 class157, byte[] is) {
		if (i_133_ > 0 && !Class143.method2383(i_133_, 1507303899))
			throw new IllegalArgumentException("");
		if (i_134_ > 0 && !Class143.method2383(i_134_, 1591528458))
			throw new IllegalArgumentException("");
		int i_135_ = class157.anInt1722 * -1216378097;
		int i_136_ = 0;
		int i_137_ = i_133_ < i_134_ ? i_133_ : i_134_;
		int i_138_ = i_133_ >> 1;
		int i_139_ = i_134_ >> 1;
		byte[] is_140_ = is;
		byte[] is_141_ = new byte[i_138_ * i_139_ * i_135_];
		for (;;) {
			OpenGL.glTexImage2Dub(i, i_136_, i_132_, i_133_, i_134_, 0, Class180_Sub3.method15423(class157), 5121, is_140_, 0);
			if (i_137_ <= 1)
				break;
			int i_142_ = i_133_ * i_135_;
			for (int i_143_ = 0; i_143_ < i_135_; i_143_++) {
				int i_144_ = i_143_;
				int i_145_ = i_143_;
				int i_146_ = i_145_ + i_142_;
				for (int i_147_ = 0; i_147_ < i_139_; i_147_++) {
					for (int i_148_ = 0; i_148_ < i_138_; i_148_++) {
						int i_149_ = is_140_[i_145_];
						i_145_ += i_135_;
						i_149_ += is_140_[i_145_];
						i_145_ += i_135_;
						i_149_ += is_140_[i_146_];
						i_146_ += i_135_;
						i_149_ += is_140_[i_146_];
						i_146_ += i_135_;
						is_141_[i_144_] = (byte) (i_149_ >> 2);
						i_144_ += i_135_;
					}
					i_145_ += i_142_;
					i_146_ += i_142_;
				}
			}
			byte[] is_150_ = is_141_;
			is_141_ = is_140_;
			is_140_ = is_150_;
			i_133_ = i_138_;
			i_134_ = i_139_;
			i_138_ >>= 1;
			i_139_ >>= 1;
			i_137_ >>= 1;
			i_136_++;
		}
	}

	static void method2063(int i, int i_151_, int i_152_, int i_153_, Class157 class157, byte[] is) {
		if (i_152_ > 0 && !Class143.method2383(i_152_, 2133224387))
			throw new IllegalArgumentException("");
		if (i_153_ > 0 && !Class143.method2383(i_153_, 1828657527))
			throw new IllegalArgumentException("");
		int i_154_ = class157.anInt1722 * -1216378097;
		int i_155_ = 0;
		int i_156_ = i_152_ < i_153_ ? i_152_ : i_153_;
		int i_157_ = i_152_ >> 1;
		int i_158_ = i_153_ >> 1;
		byte[] is_159_ = is;
		byte[] is_160_ = new byte[i_157_ * i_158_ * i_154_];
		for (;;) {
			OpenGL.glTexImage2Dub(i, i_155_, i_151_, i_152_, i_153_, 0, Class180_Sub3.method15423(class157), 5121, is_159_, 0);
			if (i_156_ <= 1)
				break;
			int i_161_ = i_152_ * i_154_;
			for (int i_162_ = 0; i_162_ < i_154_; i_162_++) {
				int i_163_ = i_162_;
				int i_164_ = i_162_;
				int i_165_ = i_164_ + i_161_;
				for (int i_166_ = 0; i_166_ < i_158_; i_166_++) {
					for (int i_167_ = 0; i_167_ < i_157_; i_167_++) {
						int i_168_ = is_159_[i_164_];
						i_164_ += i_154_;
						i_168_ += is_159_[i_164_];
						i_164_ += i_154_;
						i_168_ += is_159_[i_165_];
						i_165_ += i_154_;
						i_168_ += is_159_[i_165_];
						i_165_ += i_154_;
						is_160_[i_163_] = (byte) (i_168_ >> 2);
						i_163_ += i_154_;
					}
					i_164_ += i_161_;
					i_165_ += i_161_;
				}
			}
			byte[] is_169_ = is_160_;
			is_160_ = is_159_;
			is_159_ = is_169_;
			i_152_ = i_157_;
			i_153_ = i_158_;
			i_157_ >>= 1;
			i_158_ >>= 1;
			i_156_ >>= 1;
			i_155_++;
		}
	}

	void method2064() {
		if (anInt1433 != 0) {
			aClass180_Sub3_1432.anInt9712 -= method2053();
			int[] is = new int[1];
			is[0] = anInt1433;
			OpenGL.glDeleteTextures(1, is, 0);
			anInt1433 = 0;
		}
	}

	static void method2065(int i, int i_170_, int i_171_, int i_172_, Class157 class157, float[] fs) {
		if (i_171_ > 0 && !Class143.method2383(i_171_, 1876370597))
			throw new IllegalArgumentException("");
		if (i_172_ > 0 && !Class143.method2383(i_172_, 1651591031))
			throw new IllegalArgumentException("");
		int i_173_ = class157.anInt1722 * -1216378097;
		int i_174_ = 0;
		int i_175_ = i_171_ < i_172_ ? i_171_ : i_172_;
		int i_176_ = i_171_ >> 1;
		int i_177_ = i_172_ >> 1;
		float[] fs_178_ = fs;
		float[] fs_179_ = new float[i_176_ * i_177_ * i_173_];
		for (;;) {
			OpenGL.glTexImage2Df(i, i_174_, i_170_, i_171_, i_172_, 0, Class180_Sub3.method15423(class157), 5126, fs_178_, 0);
			if (i_175_ <= 1)
				break;
			int i_180_ = i_171_ * i_173_;
			for (int i_181_ = 0; i_181_ < i_173_; i_181_++) {
				int i_182_ = i_181_;
				int i_183_ = i_181_;
				int i_184_ = i_183_ + i_180_;
				for (int i_185_ = 0; i_185_ < i_177_; i_185_++) {
					for (int i_186_ = 0; i_186_ < i_176_; i_186_++) {
						float f = fs_178_[i_183_];
						i_183_ += i_173_;
						f += fs_178_[i_183_];
						i_183_ += i_173_;
						f += fs_178_[i_184_];
						i_184_ += i_173_;
						f += fs_178_[i_184_];
						i_184_ += i_173_;
						fs_179_[i_182_] = f * 0.25F;
						i_182_ += i_173_;
					}
					i_183_ += i_180_;
					i_184_ += i_180_;
				}
			}
			float[] fs_187_ = fs_179_;
			fs_179_ = fs_178_;
			fs_178_ = fs_187_;
			i_171_ = i_176_;
			i_172_ = i_177_;
			i_176_ >>= 1;
			i_177_ >>= 1;
			i_175_ >>= 1;
			i_174_++;
		}
	}

	static void method2066(int i, int i_188_, int i_189_, int i_190_, Class157 class157, float[] fs) {
		if (i_189_ > 0 && !Class143.method2383(i_189_, 1525799430))
			throw new IllegalArgumentException("");
		if (i_190_ > 0 && !Class143.method2383(i_190_, 2129607096))
			throw new IllegalArgumentException("");
		int i_191_ = class157.anInt1722 * -1216378097;
		int i_192_ = 0;
		int i_193_ = i_189_ < i_190_ ? i_189_ : i_190_;
		int i_194_ = i_189_ >> 1;
		int i_195_ = i_190_ >> 1;
		float[] fs_196_ = fs;
		float[] fs_197_ = new float[i_194_ * i_195_ * i_191_];
		for (;;) {
			OpenGL.glTexImage2Df(i, i_192_, i_188_, i_189_, i_190_, 0, Class180_Sub3.method15423(class157), 5126, fs_196_, 0);
			if (i_193_ <= 1)
				break;
			int i_198_ = i_189_ * i_191_;
			for (int i_199_ = 0; i_199_ < i_191_; i_199_++) {
				int i_200_ = i_199_;
				int i_201_ = i_199_;
				int i_202_ = i_201_ + i_198_;
				for (int i_203_ = 0; i_203_ < i_195_; i_203_++) {
					for (int i_204_ = 0; i_204_ < i_194_; i_204_++) {
						float f = fs_196_[i_201_];
						i_201_ += i_191_;
						f += fs_196_[i_201_];
						i_201_ += i_191_;
						f += fs_196_[i_202_];
						i_202_ += i_191_;
						f += fs_196_[i_202_];
						i_202_ += i_191_;
						fs_197_[i_200_] = f * 0.25F;
						i_200_ += i_191_;
					}
					i_201_ += i_198_;
					i_202_ += i_198_;
				}
			}
			float[] fs_205_ = fs_197_;
			fs_197_ = fs_196_;
			fs_196_ = fs_205_;
			i_189_ = i_194_;
			i_190_ = i_195_;
			i_194_ >>= 1;
			i_195_ >>= 1;
			i_193_ >>= 1;
			i_192_++;
		}
	}

	static void method2067(int i, int i_206_, int i_207_, int i_208_, Class157 class157, float[] fs) {
		if (i_207_ > 0 && !Class143.method2383(i_207_, 1993441703))
			throw new IllegalArgumentException("");
		if (i_208_ > 0 && !Class143.method2383(i_208_, 1750775049))
			throw new IllegalArgumentException("");
		int i_209_ = class157.anInt1722 * -1216378097;
		int i_210_ = 0;
		int i_211_ = i_207_ < i_208_ ? i_207_ : i_208_;
		int i_212_ = i_207_ >> 1;
		int i_213_ = i_208_ >> 1;
		float[] fs_214_ = fs;
		float[] fs_215_ = new float[i_212_ * i_213_ * i_209_];
		for (;;) {
			OpenGL.glTexImage2Df(i, i_210_, i_206_, i_207_, i_208_, 0, Class180_Sub3.method15423(class157), 5126, fs_214_, 0);
			if (i_211_ <= 1)
				break;
			int i_216_ = i_207_ * i_209_;
			for (int i_217_ = 0; i_217_ < i_209_; i_217_++) {
				int i_218_ = i_217_;
				int i_219_ = i_217_;
				int i_220_ = i_219_ + i_216_;
				for (int i_221_ = 0; i_221_ < i_213_; i_221_++) {
					for (int i_222_ = 0; i_222_ < i_212_; i_222_++) {
						float f = fs_214_[i_219_];
						i_219_ += i_209_;
						f += fs_214_[i_219_];
						i_219_ += i_209_;
						f += fs_214_[i_220_];
						i_220_ += i_209_;
						f += fs_214_[i_220_];
						i_220_ += i_209_;
						fs_215_[i_218_] = f * 0.25F;
						i_218_ += i_209_;
					}
					i_219_ += i_216_;
					i_220_ += i_216_;
				}
			}
			float[] fs_223_ = fs_215_;
			fs_215_ = fs_214_;
			fs_214_ = fs_223_;
			i_207_ = i_212_;
			i_208_ = i_213_;
			i_212_ >>= 1;
			i_213_ >>= 1;
			i_211_ >>= 1;
			i_210_++;
		}
	}

	static void method2068(int i, int i_224_, int i_225_, int i_226_, Class157 class157, float[] fs) {
		if (i_225_ > 0 && !Class143.method2383(i_225_, 1626349469))
			throw new IllegalArgumentException("");
		if (i_226_ > 0 && !Class143.method2383(i_226_, 2020835079))
			throw new IllegalArgumentException("");
		int i_227_ = class157.anInt1722 * -1216378097;
		int i_228_ = 0;
		int i_229_ = i_225_ < i_226_ ? i_225_ : i_226_;
		int i_230_ = i_225_ >> 1;
		int i_231_ = i_226_ >> 1;
		float[] fs_232_ = fs;
		float[] fs_233_ = new float[i_230_ * i_231_ * i_227_];
		for (;;) {
			OpenGL.glTexImage2Df(i, i_228_, i_224_, i_225_, i_226_, 0, Class180_Sub3.method15423(class157), 5126, fs_232_, 0);
			if (i_229_ <= 1)
				break;
			int i_234_ = i_225_ * i_227_;
			for (int i_235_ = 0; i_235_ < i_227_; i_235_++) {
				int i_236_ = i_235_;
				int i_237_ = i_235_;
				int i_238_ = i_237_ + i_234_;
				for (int i_239_ = 0; i_239_ < i_231_; i_239_++) {
					for (int i_240_ = 0; i_240_ < i_230_; i_240_++) {
						float f = fs_232_[i_237_];
						i_237_ += i_227_;
						f += fs_232_[i_237_];
						i_237_ += i_227_;
						f += fs_232_[i_238_];
						i_238_ += i_227_;
						f += fs_232_[i_238_];
						i_238_ += i_227_;
						fs_233_[i_236_] = f * 0.25F;
						i_236_ += i_227_;
					}
					i_237_ += i_234_;
					i_238_ += i_234_;
				}
			}
			float[] fs_241_ = fs_233_;
			fs_233_ = fs_232_;
			fs_232_ = fs_241_;
			i_225_ = i_230_;
			i_226_ = i_231_;
			i_230_ >>= 1;
			i_231_ >>= 1;
			i_229_ >>= 1;
			i_228_++;
		}
	}
}
