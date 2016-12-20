/* Class480 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import jaggl.OpenGL;

public abstract class Class480 implements Interface41 {
	static final int anInt5406 = 0;
	static final int anInt5407 = 3553;
	static final int anInt5408 = 34067;
	Class184 aClass184_5409;
	static final int anInt5410 = 32879;
	int anInt5411;
	int anInt5412;
	Class157 aClass157_5413;
	Class343 aClass343_5414 = Class343.aClass343_3692;
	boolean aBool5415;
	Class180_Sub2_Sub1 aClass180_Sub2_Sub1_5416;
	int anInt5417;
	static int[] anIntArray5418 = new int[1];

	public void method130() {
		if (anInt5411 != 0) {
			aClass180_Sub2_Sub1_5416.anInt9445 -= method7817();
			int[] is = new int[1];
			is[0] = anInt5411;
			OpenGL.glDeleteTextures(1, is, 0);
			anInt5411 = 0;
		}
	}

	public void method273(Class343 class343) {
		if (aClass343_5414 != class343) {
			aClass343_5414 = class343;
			method7827();
		}
	}

	void method7803(int i, int i_0_, int i_1_, byte[] is) {
		if (anInt5411 == 0)
			throw new IllegalStateException("");
		if (i_0_ > 0 && !Class143.method2383(i_0_, 1660422705))
			throw new IllegalArgumentException("");
		if (i_1_ > 0 && !Class143.method2383(i_1_, 1642651770))
			throw new IllegalArgumentException("");
		int i_2_ = aClass157_5413.anInt1722 * -1216378097;
		int i_3_ = 0;
		int i_4_ = i_0_ < i_1_ ? i_0_ : i_1_;
		int i_5_ = i_0_ >> 1;
		int i_6_ = i_1_ >> 1;
		byte[] is_7_ = is;
		byte[] is_8_ = new byte[i_5_ * i_6_ * i_2_];
		for (;;) {
			OpenGL.glTexImage2Dub(i, i_3_, Class180_Sub2_Sub1.method18015(aClass157_5413, aClass184_5409), i_0_, i_1_, 0, Class180_Sub2_Sub1.method18008(aClass157_5413), 5121, is_7_, 0);
			if (i_4_ <= 1)
				break;
			int i_9_ = i_0_ * i_2_;
			for (int i_10_ = 0; i_10_ < i_2_; i_10_++) {
				int i_11_ = i_10_;
				int i_12_ = i_10_;
				int i_13_ = i_12_ + i_9_;
				for (int i_14_ = 0; i_14_ < i_6_; i_14_++) {
					for (int i_15_ = 0; i_15_ < i_5_; i_15_++) {
						int i_16_ = is_7_[i_12_];
						i_12_ += i_2_;
						i_16_ += is_7_[i_12_];
						i_12_ += i_2_;
						i_16_ += is_7_[i_13_];
						i_13_ += i_2_;
						i_16_ += is_7_[i_13_];
						i_13_ += i_2_;
						is_8_[i_11_] = (byte) (i_16_ >> 2);
						i_11_ += i_2_;
					}
					i_12_ += i_9_;
					i_13_ += i_9_;
				}
			}
			byte[] is_17_ = is_8_;
			is_8_ = is_7_;
			is_7_ = is_17_;
			i_0_ = i_5_;
			i_1_ = i_6_;
			i_5_ >>= 1;
			i_6_ >>= 1;
			i_4_ >>= 1;
			i_3_++;
		}
	}

	public void finalize() throws Throwable {
		method7807();
		super.finalize();
	}

	boolean method260() {
		if (anInt5411 == 0)
			throw new IllegalStateException("");
		int i = method7817();
		aClass180_Sub2_Sub1_5416.method14971(this);
		if (aClass180_Sub2_Sub1_5416.aBool11508)
			OpenGL.glEnable(anInt5412);
		OpenGL.glGenerateMipmapEXT(anInt5412);
		if (aClass180_Sub2_Sub1_5416.aBool11508)
			OpenGL.glDisable(anInt5412);
		aBool5415 = true;
		method7827();
		method7805(i);
		return true;
	}

	Class480(Class180_Sub2_Sub1 class180_sub2_sub1, int i, Class157 class157, Class184 class184, int i_18_, boolean bool) {
		aClass180_Sub2_Sub1_5416 = class180_sub2_sub1;
		anInt5412 = i;
		aClass157_5413 = class157;
		aClass184_5409 = class184;
		aBool5415 = bool;
		anInt5417 = i_18_;
		OpenGL.glGenTextures(1, anIntArray5418, 0);
		anInt5411 = anIntArray5418[0];
		method7827();
		method7805(0);
	}

	public void method277() {
		if (anInt5411 == 0)
			throw new IllegalStateException("");
		int i = aClass180_Sub2_Sub1_5416.method15171();
		int i_19_ = aClass180_Sub2_Sub1_5416.anIntArray11478[i];
		if (i_19_ != anInt5412) {
			if (i_19_ != 0) {
				OpenGL.glBindTexture(i_19_, 0);
				OpenGL.glDisable(i_19_);
			}
			OpenGL.glEnable(anInt5412);
			aClass180_Sub2_Sub1_5416.anIntArray11478[i] = anInt5412;
		}
		OpenGL.glBindTexture(anInt5412, anInt5411);
	}

	void method7804(int i, int i_20_, int i_21_, float[] fs) {
		if (anInt5411 == 0)
			throw new IllegalStateException("");
		if (i_20_ > 0 && !Class143.method2383(i_20_, 1946512584))
			throw new IllegalArgumentException("");
		if (i_21_ > 0 && !Class143.method2383(i_21_, 1797046402))
			throw new IllegalArgumentException("");
		int i_22_ = aClass157_5413.anInt1722 * -1216378097;
		int i_23_ = 0;
		int i_24_ = i_20_ < i_21_ ? i_20_ : i_21_;
		int i_25_ = i_20_ >> 1;
		int i_26_ = i_21_ >> 1;
		float[] fs_27_ = fs;
		float[] fs_28_ = new float[i_25_ * i_26_ * i_22_];
		for (;;) {
			OpenGL.glTexImage2Df(i, i_23_, Class180_Sub2_Sub1.method18015(aClass157_5413, aClass184_5409), i_20_, i_21_, 0, Class180_Sub2_Sub1.method18008(aClass157_5413), 5126, fs_27_, 0);
			if (i_24_ <= 1)
				break;
			int i_29_ = i_20_ * i_22_;
			for (int i_30_ = 0; i_30_ < i_22_; i_30_++) {
				int i_31_ = i_30_;
				int i_32_ = i_30_;
				int i_33_ = i_32_ + i_29_;
				for (int i_34_ = 0; i_34_ < i_26_; i_34_++) {
					for (int i_35_ = 0; i_35_ < i_25_; i_35_++) {
						float f = fs_27_[i_32_];
						i_32_ += i_22_;
						f += fs_27_[i_32_];
						i_32_ += i_22_;
						f += fs_27_[i_33_];
						i_33_ += i_22_;
						f += fs_27_[i_33_];
						i_33_ += i_22_;
						fs_28_[i_31_] = f * 0.25F;
						i_31_ += i_22_;
					}
					i_32_ += i_29_;
					i_33_ += i_29_;
				}
			}
			float[] fs_36_ = fs_28_;
			fs_28_ = fs_27_;
			fs_27_ = fs_36_;
			i_20_ = i_25_;
			i_21_ = i_26_;
			i_25_ >>= 1;
			i_26_ >>= 1;
			i_24_ >>= 1;
			i_23_++;
		}
	}

	void method7805(int i) {
		aClass180_Sub2_Sub1_5416.anInt9445 -= i;
		aClass180_Sub2_Sub1_5416.anInt9445 += method7817();
	}

	void method7806(int i) {
		aClass180_Sub2_Sub1_5416.anInt9445 -= i;
		aClass180_Sub2_Sub1_5416.anInt9445 += method7817();
	}

	public void method129() {
		if (anInt5411 != 0) {
			aClass180_Sub2_Sub1_5416.anInt9445 -= method7817();
			int[] is = new int[1];
			is[0] = anInt5411;
			OpenGL.glDeleteTextures(1, is, 0);
			anInt5411 = 0;
		}
	}

	void method7807() {
		if (anInt5411 != 0) {
			aClass180_Sub2_Sub1_5416.method18005(anInt5411, method7817());
			anInt5411 = 0;
		}
	}

	int method7808() {
		int i = (aClass157_5413.anInt1722 * -1216378097 * (aClass184_5409.anInt2111 * 408933829) * anInt5417);
		return aBool5415 ? i * 4 / 3 : i;
	}

	void method7809(int i, int i_37_, int i_38_, float[] fs) {
		if (anInt5411 == 0)
			throw new IllegalStateException("");
		if (i_37_ > 0 && !Class143.method2383(i_37_, 1997460434))
			throw new IllegalArgumentException("");
		if (i_38_ > 0 && !Class143.method2383(i_38_, 2045166199))
			throw new IllegalArgumentException("");
		int i_39_ = aClass157_5413.anInt1722 * -1216378097;
		int i_40_ = 0;
		int i_41_ = i_37_ < i_38_ ? i_37_ : i_38_;
		int i_42_ = i_37_ >> 1;
		int i_43_ = i_38_ >> 1;
		float[] fs_44_ = fs;
		float[] fs_45_ = new float[i_42_ * i_43_ * i_39_];
		for (;;) {
			OpenGL.glTexImage2Df(i, i_40_, Class180_Sub2_Sub1.method18015(aClass157_5413, aClass184_5409), i_37_, i_38_, 0, Class180_Sub2_Sub1.method18008(aClass157_5413), 5126, fs_44_, 0);
			if (i_41_ <= 1)
				break;
			int i_46_ = i_37_ * i_39_;
			for (int i_47_ = 0; i_47_ < i_39_; i_47_++) {
				int i_48_ = i_47_;
				int i_49_ = i_47_;
				int i_50_ = i_49_ + i_46_;
				for (int i_51_ = 0; i_51_ < i_43_; i_51_++) {
					for (int i_52_ = 0; i_52_ < i_42_; i_52_++) {
						float f = fs_44_[i_49_];
						i_49_ += i_39_;
						f += fs_44_[i_49_];
						i_49_ += i_39_;
						f += fs_44_[i_50_];
						i_50_ += i_39_;
						f += fs_44_[i_50_];
						i_50_ += i_39_;
						fs_45_[i_48_] = f * 0.25F;
						i_48_ += i_39_;
					}
					i_49_ += i_46_;
					i_50_ += i_46_;
				}
			}
			float[] fs_53_ = fs_45_;
			fs_45_ = fs_44_;
			fs_44_ = fs_53_;
			i_37_ = i_42_;
			i_38_ = i_43_;
			i_42_ >>= 1;
			i_43_ >>= 1;
			i_41_ >>= 1;
			i_40_++;
		}
	}

	int method7810() {
		int i = (aClass157_5413.anInt1722 * -1216378097 * (aClass184_5409.anInt2111 * 408933829) * anInt5417);
		return aBool5415 ? i * 4 / 3 : i;
	}

	void method7811() throws Throwable {
		method7807();
		super.finalize();
	}

	void method7812() throws Throwable {
		method7807();
		super.finalize();
	}

	void method7813() throws Throwable {
		method7807();
		super.finalize();
	}

	void method7814() throws Throwable {
		method7807();
		super.finalize();
	}

	void method7815() throws Throwable {
		method7807();
		super.finalize();
	}

	void method7816() {
		if (anInt5411 == 0)
			throw new IllegalStateException("");
		aClass180_Sub2_Sub1_5416.method14971(this);
		if (aClass343_5414 == Class343.aClass343_3692) {
			OpenGL.glTexParameteri(anInt5412, 10241, aBool5415 ? 9987 : 9729);
			OpenGL.glTexParameteri(anInt5412, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(anInt5412, 10241, aBool5415 ? 9984 : 9728);
			OpenGL.glTexParameteri(anInt5412, 10240, 9728);
		}
	}

	boolean method236() {
		if (anInt5411 == 0)
			throw new IllegalStateException("");
		int i = method7817();
		aClass180_Sub2_Sub1_5416.method14971(this);
		if (aClass180_Sub2_Sub1_5416.aBool11508)
			OpenGL.glEnable(anInt5412);
		OpenGL.glGenerateMipmapEXT(anInt5412);
		if (aClass180_Sub2_Sub1_5416.aBool11508)
			OpenGL.glDisable(anInt5412);
		aBool5415 = true;
		method7827();
		method7805(i);
		return true;
	}

	public void method275() {
		if (anInt5411 == 0)
			throw new IllegalStateException("");
		int i = aClass180_Sub2_Sub1_5416.method15171();
		int i_54_ = aClass180_Sub2_Sub1_5416.anIntArray11478[i];
		if (i_54_ != anInt5412) {
			if (i_54_ != 0) {
				OpenGL.glBindTexture(i_54_, 0);
				OpenGL.glDisable(i_54_);
			}
			OpenGL.glEnable(anInt5412);
			aClass180_Sub2_Sub1_5416.anIntArray11478[i] = anInt5412;
		}
		OpenGL.glBindTexture(anInt5412, anInt5411);
	}

	public void method276() {
		if (anInt5411 == 0)
			throw new IllegalStateException("");
		int i = aClass180_Sub2_Sub1_5416.method15171();
		int i_55_ = aClass180_Sub2_Sub1_5416.anIntArray11478[i];
		if (i_55_ != anInt5412) {
			if (i_55_ != 0) {
				OpenGL.glBindTexture(i_55_, 0);
				OpenGL.glDisable(i_55_);
			}
			OpenGL.glEnable(anInt5412);
			aClass180_Sub2_Sub1_5416.anIntArray11478[i] = anInt5412;
		}
		OpenGL.glBindTexture(anInt5412, anInt5411);
	}

	int method7817() {
		int i = (aClass157_5413.anInt1722 * -1216378097 * (aClass184_5409.anInt2111 * 408933829) * anInt5417);
		return aBool5415 ? i * 4 / 3 : i;
	}

	void method7818(int i, int i_56_, int i_57_, int[] is) {
		if (anInt5411 == 0)
			throw new IllegalStateException("");
		if (i_56_ > 0 && !Class143.method2383(i_56_, 1868978222))
			throw new IllegalArgumentException("");
		if (i_57_ > 0 && !Class143.method2383(i_57_, 2034100901))
			throw new IllegalArgumentException("");
		if (aClass157_5413 != Class157.aClass157_1723)
			throw new IllegalArgumentException("");
		int i_58_ = 0;
		int i_59_ = i_56_ < i_57_ ? i_56_ : i_57_;
		int i_60_ = i_56_ >> 1;
		int i_61_ = i_57_ >> 1;
		int[] is_62_ = is;
		int[] is_63_ = new int[i_60_ * i_61_];
		for (;;) {
			OpenGL.glTexImage2Di(i, i_58_, Class180_Sub2_Sub1.method18015(aClass157_5413, aClass184_5409), i_56_, i_57_, 0, 32993, aClass180_Sub2_Sub1_5416.anInt11495, is_62_, 0);
			if (i_59_ <= 1)
				break;
			int i_64_ = 0;
			int i_65_ = 0;
			int i_66_ = i_65_ + i_56_;
			for (int i_67_ = 0; i_67_ < i_61_; i_67_++) {
				for (int i_68_ = 0; i_68_ < i_60_; i_68_++) {
					int i_69_ = is_62_[i_65_++];
					int i_70_ = is_62_[i_65_++];
					int i_71_ = is_62_[i_66_++];
					int i_72_ = is_62_[i_66_++];
					int i_73_ = i_69_ >> 24 & 0xff;
					int i_74_ = i_69_ >> 16 & 0xff;
					int i_75_ = i_69_ >> 8 & 0xff;
					int i_76_ = i_69_ & 0xff;
					i_73_ += i_70_ >> 24 & 0xff;
					i_74_ += i_70_ >> 16 & 0xff;
					i_75_ += i_70_ >> 8 & 0xff;
					i_76_ += i_70_ & 0xff;
					i_73_ += i_71_ >> 24 & 0xff;
					i_74_ += i_71_ >> 16 & 0xff;
					i_75_ += i_71_ >> 8 & 0xff;
					i_76_ += i_71_ & 0xff;
					i_73_ += i_72_ >> 24 & 0xff;
					i_74_ += i_72_ >> 16 & 0xff;
					i_75_ += i_72_ >> 8 & 0xff;
					i_76_ += i_72_ & 0xff;
					is_63_[i_64_++] = ((i_73_ & 0x3fc) << 22 | (i_74_ & 0x3fc) << 14 | (i_75_ & 0x3fc) << 6 | (i_76_ & 0x3fc) >> 2);
				}
				i_65_ += i_56_;
				i_66_ += i_56_;
			}
			int[] is_77_ = is_63_;
			is_63_ = is_62_;
			is_62_ = is_77_;
			i_56_ = i_60_;
			i_57_ = i_61_;
			i_60_ >>= 1;
			i_61_ >>= 1;
			i_59_ >>= 1;
			i_58_++;
		}
	}

	void method7819() {
		if (anInt5411 == 0)
			throw new IllegalStateException("");
		aClass180_Sub2_Sub1_5416.method14971(this);
		if (aClass343_5414 == Class343.aClass343_3692) {
			OpenGL.glTexParameteri(anInt5412, 10241, aBool5415 ? 9987 : 9729);
			OpenGL.glTexParameteri(anInt5412, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(anInt5412, 10241, aBool5415 ? 9984 : 9728);
			OpenGL.glTexParameteri(anInt5412, 10240, 9728);
		}
	}

	void method7820() {
		if (anInt5411 == 0)
			throw new IllegalStateException("");
		aClass180_Sub2_Sub1_5416.method14971(this);
		if (aClass343_5414 == Class343.aClass343_3692) {
			OpenGL.glTexParameteri(anInt5412, 10241, aBool5415 ? 9987 : 9729);
			OpenGL.glTexParameteri(anInt5412, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(anInt5412, 10241, aBool5415 ? 9984 : 9728);
			OpenGL.glTexParameteri(anInt5412, 10240, 9728);
		}
	}

	void method7821(int i, int i_78_, int i_79_, int[] is) {
		if (anInt5411 == 0)
			throw new IllegalStateException("");
		if (i_78_ > 0 && !Class143.method2383(i_78_, 2062704095))
			throw new IllegalArgumentException("");
		if (i_79_ > 0 && !Class143.method2383(i_79_, 1508977159))
			throw new IllegalArgumentException("");
		if (aClass157_5413 != Class157.aClass157_1723)
			throw new IllegalArgumentException("");
		int i_80_ = 0;
		int i_81_ = i_78_ < i_79_ ? i_78_ : i_79_;
		int i_82_ = i_78_ >> 1;
		int i_83_ = i_79_ >> 1;
		int[] is_84_ = is;
		int[] is_85_ = new int[i_82_ * i_83_];
		for (;;) {
			OpenGL.glTexImage2Di(i, i_80_, Class180_Sub2_Sub1.method18015(aClass157_5413, aClass184_5409), i_78_, i_79_, 0, 32993, aClass180_Sub2_Sub1_5416.anInt11495, is_84_, 0);
			if (i_81_ <= 1)
				break;
			int i_86_ = 0;
			int i_87_ = 0;
			int i_88_ = i_87_ + i_78_;
			for (int i_89_ = 0; i_89_ < i_83_; i_89_++) {
				for (int i_90_ = 0; i_90_ < i_82_; i_90_++) {
					int i_91_ = is_84_[i_87_++];
					int i_92_ = is_84_[i_87_++];
					int i_93_ = is_84_[i_88_++];
					int i_94_ = is_84_[i_88_++];
					int i_95_ = i_91_ >> 24 & 0xff;
					int i_96_ = i_91_ >> 16 & 0xff;
					int i_97_ = i_91_ >> 8 & 0xff;
					int i_98_ = i_91_ & 0xff;
					i_95_ += i_92_ >> 24 & 0xff;
					i_96_ += i_92_ >> 16 & 0xff;
					i_97_ += i_92_ >> 8 & 0xff;
					i_98_ += i_92_ & 0xff;
					i_95_ += i_93_ >> 24 & 0xff;
					i_96_ += i_93_ >> 16 & 0xff;
					i_97_ += i_93_ >> 8 & 0xff;
					i_98_ += i_93_ & 0xff;
					i_95_ += i_94_ >> 24 & 0xff;
					i_96_ += i_94_ >> 16 & 0xff;
					i_97_ += i_94_ >> 8 & 0xff;
					i_98_ += i_94_ & 0xff;
					is_85_[i_86_++] = ((i_95_ & 0x3fc) << 22 | (i_96_ & 0x3fc) << 14 | (i_97_ & 0x3fc) << 6 | (i_98_ & 0x3fc) >> 2);
				}
				i_87_ += i_78_;
				i_88_ += i_78_;
			}
			int[] is_99_ = is_85_;
			is_85_ = is_84_;
			is_84_ = is_99_;
			i_78_ = i_82_;
			i_79_ = i_83_;
			i_82_ >>= 1;
			i_83_ >>= 1;
			i_81_ >>= 1;
			i_80_++;
		}
	}

	void method7822(int i, int i_100_, int i_101_, int[] is) {
		if (anInt5411 == 0)
			throw new IllegalStateException("");
		if (i_100_ > 0 && !Class143.method2383(i_100_, 1577785495))
			throw new IllegalArgumentException("");
		if (i_101_ > 0 && !Class143.method2383(i_101_, 1697828809))
			throw new IllegalArgumentException("");
		if (aClass157_5413 != Class157.aClass157_1723)
			throw new IllegalArgumentException("");
		int i_102_ = 0;
		int i_103_ = i_100_ < i_101_ ? i_100_ : i_101_;
		int i_104_ = i_100_ >> 1;
		int i_105_ = i_101_ >> 1;
		int[] is_106_ = is;
		int[] is_107_ = new int[i_104_ * i_105_];
		for (;;) {
			OpenGL.glTexImage2Di(i, i_102_, Class180_Sub2_Sub1.method18015(aClass157_5413, aClass184_5409), i_100_, i_101_, 0, 32993, aClass180_Sub2_Sub1_5416.anInt11495, is_106_, 0);
			if (i_103_ <= 1)
				break;
			int i_108_ = 0;
			int i_109_ = 0;
			int i_110_ = i_109_ + i_100_;
			for (int i_111_ = 0; i_111_ < i_105_; i_111_++) {
				for (int i_112_ = 0; i_112_ < i_104_; i_112_++) {
					int i_113_ = is_106_[i_109_++];
					int i_114_ = is_106_[i_109_++];
					int i_115_ = is_106_[i_110_++];
					int i_116_ = is_106_[i_110_++];
					int i_117_ = i_113_ >> 24 & 0xff;
					int i_118_ = i_113_ >> 16 & 0xff;
					int i_119_ = i_113_ >> 8 & 0xff;
					int i_120_ = i_113_ & 0xff;
					i_117_ += i_114_ >> 24 & 0xff;
					i_118_ += i_114_ >> 16 & 0xff;
					i_119_ += i_114_ >> 8 & 0xff;
					i_120_ += i_114_ & 0xff;
					i_117_ += i_115_ >> 24 & 0xff;
					i_118_ += i_115_ >> 16 & 0xff;
					i_119_ += i_115_ >> 8 & 0xff;
					i_120_ += i_115_ & 0xff;
					i_117_ += i_116_ >> 24 & 0xff;
					i_118_ += i_116_ >> 16 & 0xff;
					i_119_ += i_116_ >> 8 & 0xff;
					i_120_ += i_116_ & 0xff;
					is_107_[i_108_++] = ((i_117_ & 0x3fc) << 22 | (i_118_ & 0x3fc) << 14 | (i_119_ & 0x3fc) << 6 | (i_120_ & 0x3fc) >> 2);
				}
				i_109_ += i_100_;
				i_110_ += i_100_;
			}
			int[] is_121_ = is_107_;
			is_107_ = is_106_;
			is_106_ = is_121_;
			i_100_ = i_104_;
			i_101_ = i_105_;
			i_104_ >>= 1;
			i_105_ >>= 1;
			i_103_ >>= 1;
			i_102_++;
		}
	}

	void method7823(int i) {
		aClass180_Sub2_Sub1_5416.anInt9445 -= i;
		aClass180_Sub2_Sub1_5416.anInt9445 += method7817();
	}

	void method7824(int i, int i_122_, int i_123_, byte[] is) {
		if (anInt5411 == 0)
			throw new IllegalStateException("");
		if (i_122_ > 0 && !Class143.method2383(i_122_, 1772284441))
			throw new IllegalArgumentException("");
		if (i_123_ > 0 && !Class143.method2383(i_123_, 2097794939))
			throw new IllegalArgumentException("");
		int i_124_ = aClass157_5413.anInt1722 * -1216378097;
		int i_125_ = 0;
		int i_126_ = i_122_ < i_123_ ? i_122_ : i_123_;
		int i_127_ = i_122_ >> 1;
		int i_128_ = i_123_ >> 1;
		byte[] is_129_ = is;
		byte[] is_130_ = new byte[i_127_ * i_128_ * i_124_];
		for (;;) {
			OpenGL.glTexImage2Dub(i, i_125_, Class180_Sub2_Sub1.method18015(aClass157_5413, aClass184_5409), i_122_, i_123_, 0, Class180_Sub2_Sub1.method18008(aClass157_5413), 5121, is_129_, 0);
			if (i_126_ <= 1)
				break;
			int i_131_ = i_122_ * i_124_;
			for (int i_132_ = 0; i_132_ < i_124_; i_132_++) {
				int i_133_ = i_132_;
				int i_134_ = i_132_;
				int i_135_ = i_134_ + i_131_;
				for (int i_136_ = 0; i_136_ < i_128_; i_136_++) {
					for (int i_137_ = 0; i_137_ < i_127_; i_137_++) {
						int i_138_ = is_129_[i_134_];
						i_134_ += i_124_;
						i_138_ += is_129_[i_134_];
						i_134_ += i_124_;
						i_138_ += is_129_[i_135_];
						i_135_ += i_124_;
						i_138_ += is_129_[i_135_];
						i_135_ += i_124_;
						is_130_[i_133_] = (byte) (i_138_ >> 2);
						i_133_ += i_124_;
					}
					i_134_ += i_131_;
					i_135_ += i_131_;
				}
			}
			byte[] is_139_ = is_130_;
			is_130_ = is_129_;
			is_129_ = is_139_;
			i_122_ = i_127_;
			i_123_ = i_128_;
			i_127_ >>= 1;
			i_128_ >>= 1;
			i_126_ >>= 1;
			i_125_++;
		}
	}

	void method7825(int i, int i_140_, int i_141_, float[] fs) {
		if (anInt5411 == 0)
			throw new IllegalStateException("");
		if (i_140_ > 0 && !Class143.method2383(i_140_, 1552433163))
			throw new IllegalArgumentException("");
		if (i_141_ > 0 && !Class143.method2383(i_141_, 1763336093))
			throw new IllegalArgumentException("");
		int i_142_ = aClass157_5413.anInt1722 * -1216378097;
		int i_143_ = 0;
		int i_144_ = i_140_ < i_141_ ? i_140_ : i_141_;
		int i_145_ = i_140_ >> 1;
		int i_146_ = i_141_ >> 1;
		float[] fs_147_ = fs;
		float[] fs_148_ = new float[i_145_ * i_146_ * i_142_];
		for (;;) {
			OpenGL.glTexImage2Df(i, i_143_, Class180_Sub2_Sub1.method18015(aClass157_5413, aClass184_5409), i_140_, i_141_, 0, Class180_Sub2_Sub1.method18008(aClass157_5413), 5126, fs_147_, 0);
			if (i_144_ <= 1)
				break;
			int i_149_ = i_140_ * i_142_;
			for (int i_150_ = 0; i_150_ < i_142_; i_150_++) {
				int i_151_ = i_150_;
				int i_152_ = i_150_;
				int i_153_ = i_152_ + i_149_;
				for (int i_154_ = 0; i_154_ < i_146_; i_154_++) {
					for (int i_155_ = 0; i_155_ < i_145_; i_155_++) {
						float f = fs_147_[i_152_];
						i_152_ += i_142_;
						f += fs_147_[i_152_];
						i_152_ += i_142_;
						f += fs_147_[i_153_];
						i_153_ += i_142_;
						f += fs_147_[i_153_];
						i_153_ += i_142_;
						fs_148_[i_151_] = f * 0.25F;
						i_151_ += i_142_;
					}
					i_152_ += i_149_;
					i_153_ += i_149_;
				}
			}
			float[] fs_156_ = fs_148_;
			fs_148_ = fs_147_;
			fs_147_ = fs_156_;
			i_140_ = i_145_;
			i_141_ = i_146_;
			i_145_ >>= 1;
			i_146_ >>= 1;
			i_144_ >>= 1;
			i_143_++;
		}
	}

	void method7826(int i, int i_157_, int i_158_, float[] fs) {
		if (anInt5411 == 0)
			throw new IllegalStateException("");
		if (i_157_ > 0 && !Class143.method2383(i_157_, 2004254275))
			throw new IllegalArgumentException("");
		if (i_158_ > 0 && !Class143.method2383(i_158_, 1993234630))
			throw new IllegalArgumentException("");
		int i_159_ = aClass157_5413.anInt1722 * -1216378097;
		int i_160_ = 0;
		int i_161_ = i_157_ < i_158_ ? i_157_ : i_158_;
		int i_162_ = i_157_ >> 1;
		int i_163_ = i_158_ >> 1;
		float[] fs_164_ = fs;
		float[] fs_165_ = new float[i_162_ * i_163_ * i_159_];
		for (;;) {
			OpenGL.glTexImage2Df(i, i_160_, Class180_Sub2_Sub1.method18015(aClass157_5413, aClass184_5409), i_157_, i_158_, 0, Class180_Sub2_Sub1.method18008(aClass157_5413), 5126, fs_164_, 0);
			if (i_161_ <= 1)
				break;
			int i_166_ = i_157_ * i_159_;
			for (int i_167_ = 0; i_167_ < i_159_; i_167_++) {
				int i_168_ = i_167_;
				int i_169_ = i_167_;
				int i_170_ = i_169_ + i_166_;
				for (int i_171_ = 0; i_171_ < i_163_; i_171_++) {
					for (int i_172_ = 0; i_172_ < i_162_; i_172_++) {
						float f = fs_164_[i_169_];
						i_169_ += i_159_;
						f += fs_164_[i_169_];
						i_169_ += i_159_;
						f += fs_164_[i_170_];
						i_170_ += i_159_;
						f += fs_164_[i_170_];
						i_170_ += i_159_;
						fs_165_[i_168_] = f * 0.25F;
						i_168_ += i_159_;
					}
					i_169_ += i_166_;
					i_170_ += i_166_;
				}
			}
			float[] fs_173_ = fs_165_;
			fs_165_ = fs_164_;
			fs_164_ = fs_173_;
			i_157_ = i_162_;
			i_158_ = i_163_;
			i_162_ >>= 1;
			i_163_ >>= 1;
			i_161_ >>= 1;
			i_160_++;
		}
	}

	public void method274(Class343 class343) {
		if (aClass343_5414 != class343) {
			aClass343_5414 = class343;
			method7827();
		}
	}

	void method7827() {
		if (anInt5411 == 0)
			throw new IllegalStateException("");
		aClass180_Sub2_Sub1_5416.method14971(this);
		if (aClass343_5414 == Class343.aClass343_3692) {
			OpenGL.glTexParameteri(anInt5412, 10241, aBool5415 ? 9987 : 9729);
			OpenGL.glTexParameteri(anInt5412, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(anInt5412, 10241, aBool5415 ? 9984 : 9728);
			OpenGL.glTexParameteri(anInt5412, 10240, 9728);
		}
	}

	void method7828(int i) {
		aClass180_Sub2_Sub1_5416.anInt9445 -= i;
		aClass180_Sub2_Sub1_5416.anInt9445 += method7817();
	}

	int method7829() {
		int i = (aClass157_5413.anInt1722 * -1216378097 * (aClass184_5409.anInt2111 * 408933829) * anInt5417);
		return aBool5415 ? i * 4 / 3 : i;
	}

	int method7830() {
		int i = (aClass157_5413.anInt1722 * -1216378097 * (aClass184_5409.anInt2111 * 408933829) * anInt5417);
		return aBool5415 ? i * 4 / 3 : i;
	}

	boolean method240() {
		if (anInt5411 == 0)
			throw new IllegalStateException("");
		int i = method7817();
		aClass180_Sub2_Sub1_5416.method14971(this);
		if (aClass180_Sub2_Sub1_5416.aBool11508)
			OpenGL.glEnable(anInt5412);
		OpenGL.glGenerateMipmapEXT(anInt5412);
		if (aClass180_Sub2_Sub1_5416.aBool11508)
			OpenGL.glDisable(anInt5412);
		aBool5415 = true;
		method7827();
		method7805(i);
		return true;
	}

	void method7831(int i, int i_174_, int i_175_, byte[] is) {
		if (anInt5411 == 0)
			throw new IllegalStateException("");
		if (i_174_ > 0 && !Class143.method2383(i_174_, 2125475763))
			throw new IllegalArgumentException("");
		if (i_175_ > 0 && !Class143.method2383(i_175_, 2141881904))
			throw new IllegalArgumentException("");
		int i_176_ = aClass157_5413.anInt1722 * -1216378097;
		int i_177_ = 0;
		int i_178_ = i_174_ < i_175_ ? i_174_ : i_175_;
		int i_179_ = i_174_ >> 1;
		int i_180_ = i_175_ >> 1;
		byte[] is_181_ = is;
		byte[] is_182_ = new byte[i_179_ * i_180_ * i_176_];
		for (;;) {
			OpenGL.glTexImage2Dub(i, i_177_, Class180_Sub2_Sub1.method18015(aClass157_5413, aClass184_5409), i_174_, i_175_, 0, Class180_Sub2_Sub1.method18008(aClass157_5413), 5121, is_181_, 0);
			if (i_178_ <= 1)
				break;
			int i_183_ = i_174_ * i_176_;
			for (int i_184_ = 0; i_184_ < i_176_; i_184_++) {
				int i_185_ = i_184_;
				int i_186_ = i_184_;
				int i_187_ = i_186_ + i_183_;
				for (int i_188_ = 0; i_188_ < i_180_; i_188_++) {
					for (int i_189_ = 0; i_189_ < i_179_; i_189_++) {
						int i_190_ = is_181_[i_186_];
						i_186_ += i_176_;
						i_190_ += is_181_[i_186_];
						i_186_ += i_176_;
						i_190_ += is_181_[i_187_];
						i_187_ += i_176_;
						i_190_ += is_181_[i_187_];
						i_187_ += i_176_;
						is_182_[i_185_] = (byte) (i_190_ >> 2);
						i_185_ += i_176_;
					}
					i_186_ += i_183_;
					i_187_ += i_183_;
				}
			}
			byte[] is_191_ = is_182_;
			is_182_ = is_181_;
			is_181_ = is_191_;
			i_174_ = i_179_;
			i_175_ = i_180_;
			i_179_ >>= 1;
			i_180_ >>= 1;
			i_178_ >>= 1;
			i_177_++;
		}
	}

	void method7832() {
		if (anInt5411 != 0) {
			aClass180_Sub2_Sub1_5416.method18005(anInt5411, method7817());
			anInt5411 = 0;
		}
	}

	void method7833() {
		if (anInt5411 != 0) {
			aClass180_Sub2_Sub1_5416.method18005(anInt5411, method7817());
			anInt5411 = 0;
		}
	}
}
