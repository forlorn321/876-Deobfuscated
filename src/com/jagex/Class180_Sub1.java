/* Class180_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.awt.Canvas;

public class Class180_Sub1 extends Class180 {
	int anInt9383;
	int anInt9384;
	int anInt9385;
	int[] anIntArray9386;
	int anInt9387;
	int anInt9388;
	float[] aFloatArray9389;
	int anInt9390;
	int anInt9391;
	int anInt9392;
	int anInt9393;
	int anInt9394;
	float aFloat9395;
	Class147 aClass147_9396;
	int anInt9397;
	Class427 aClass427_9398;
	int anInt9399;
	Class205 aClass205_9400;
	boolean aBool9401;
	Class427 aClass427_9402;
	Class427 aClass427_9403;
	float[][] aFloatArrayArray9404;
	float aFloat9405;
	int anInt9406;
	int anInt9407;
	int anInt9408;
	int anInt9409;
	float aFloat9410;
	boolean aBool9411 = false;
	float aFloat9412;
	int anInt9413;
	float aFloat9414;
	int anInt9415;
	Class101[] aClass101Array9416;
	Class205 aClass205_9417;
	int anInt9418;
	float aFloat9419;
	Class432 aClass432_9420;
	Class147 aClass147_9421;
	Class171_Sub2 aClass171_Sub2_9422;

	boolean method3320(int i, int i_0_, int i_1_, int i_2_, Class432 class432, Class439 class439) {
		Class427 class427 = method3171();
		class427.method6784(class432);
		class427.method6751(aClass427_9403);
		return class439.method7097(i, i_0_, i_1_, i_2_, class427, aFloat9410, aFloat9412, aFloat9419, aFloat9395);
	}

	public Class161 method3352(int i, int i_3_, int[][] is, int[][] is_4_, int i_5_, int i_6_, int i_7_) {
		return new Class161_Sub1(this, i_6_, i_7_, i, i_3_, is, is_4_, i_5_);
	}

	public Class143 method3077() {
		return new Class143(0, "Pure Java", 1, "CPU", 0L, false);
	}

	public boolean method3208() {
		return false;
	}

	public void method3282(boolean bool) {
		Class101 class101 = method14835(Thread.currentThread());
		class101.aBool1227 = bool;
	}

	void method3082() {
		if (aBool9401) {
			Class520.method8664(true, false, 12721497);
			aBool9401 = false;
		}
		aBool9411 = true;
	}

	public void method3209(int i) {
		int i_8_ = i - anInt9384 * -1577765119;
		for (Class527_Sub19 class527_sub19 = (Class527_Sub19) aClass205_9417.method3797(-323392309); null != class527_sub19; class527_sub19 = (Class527_Sub19) aClass205_9417.method3798((byte) -112)) {
			if (class527_sub19.aBool10479) {
				class527_sub19.anInt10478 += i_8_;
				int i_9_ = class527_sub19.anInt10478 / 50;
				if (i_9_ > 0) {
					Class163 class163 = aClass181_2059.method3544(class527_sub19.anInt10476, (byte) -19);
					float f = (float) (1039262975 * class163.anInt1780);
					class527_sub19.method16202((int) ((float) i_8_ / 1000.0F * (float) class163.aByte1781 / 64.0F * f), (int) ((float) class163.aByte1797 * ((float) i_8_ / 1000.0F) / 64.0F * f));
					class527_sub19.anInt10478 -= 50 * i_9_;
				}
				class527_sub19.aBool10479 = false;
			}
		}
		anInt9384 = i * -925120255;
		aClass205_9400.method3792(5, (byte) 51);
		aClass205_9417.method3792(5, (byte) -103);
	}

	public void method3150(int i, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, Class142 class142, int i_15_, int i_16_) {
		if (null != anIntArray9386) {
			Class142_Sub1 class142_sub1 = (Class142_Sub1) class142;
			int[] is = class142_sub1.anIntArray9002;
			int[] is_17_ = class142_sub1.anIntArray9003;
			int i_18_ = (anInt9392 * -456655989 > i_16_ ? -456655989 * anInt9392 : i_16_);
			int i_19_ = (anInt9393 * -383695469 < is.length + i_16_ ? -383695469 * anInt9393 : i_16_ + is.length);
			i_11_ -= i;
			i_12_ -= i_10_;
			if (i_12_ + i_11_ < 0) {
				i += i_11_;
				i_11_ = -i_11_;
				i_10_ += i_12_;
				i_12_ = -i_12_;
			}
			if (i_11_ > i_12_) {
				i_10_ <<= 16;
				i_10_ += 32768;
				i_12_ <<= 16;
				int i_20_ = (int) Math.floor((double) i_12_ / (double) i_11_ + 0.5);
				i_11_ += i;
				if (i < anInt9383 * 1605202751) {
					i_10_ += i_20_ * (anInt9383 * 1605202751 - i);
					i = anInt9383 * 1605202751;
				}
				if (i_11_ >= 2014358275 * anInt9391)
					i_11_ = 2014358275 * anInt9391 - 1;
				int i_21_ = i_13_ >>> 24;
				if (0 == i_14_ || 1 == i_14_ && 255 == i_21_) {
					for (/**/; i <= i_11_; i++) {
						int i_22_ = i_10_ >> 16;
						int i_23_ = i_22_ - i_16_;
						if (i_22_ >= i_18_ && i_22_ < i_19_) {
							int i_24_ = i_15_ + is[i_23_];
							if (i >= i_24_ && i < is_17_[i_23_] + i_24_)
								anIntArray9386[i_22_ * (anInt9387 * -1173855569) + i] = i_13_;
						}
						i_10_ += i_20_;
					}
				} else if (1 == i_14_) {
					i_13_ = (i_21_ << 24) + (((i_13_ & 0xff00) * i_21_ >> 8 & 0xff00) + ((i_13_ & 0xff00ff) * i_21_ >> 8 & 0xff00ff));
					int i_25_ = 256 - i_21_;
					for (/**/; i <= i_11_; i++) {
						int i_26_ = i_10_ >> 16;
						int i_27_ = i_26_ - i_16_;
						if (i_26_ >= i_18_ && i_26_ < i_19_) {
							int i_28_ = i_15_ + is[i_27_];
							if (i >= i_28_ && i < is_17_[i_27_] + i_28_) {
								int i_29_ = i + anInt9387 * -1173855569 * i_26_;
								int i_30_ = anIntArray9386[i_29_];
								i_30_ = ((i_25_ * (i_30_ & 0xff00ff) >> 8 & 0xff00ff) + (i_25_ * (i_30_ & 0xff00) >> 8 & 0xff00));
								anIntArray9386[i_29_] = i_13_ + i_30_;
							}
						}
						i_10_ += i_20_;
					}
				} else if (2 == i_14_) {
					for (/**/; i <= i_11_; i++) {
						int i_31_ = i_10_ >> 16;
						int i_32_ = i_31_ - i_16_;
						if (i_31_ >= i_18_ && i_31_ < i_19_) {
							int i_33_ = is[i_32_] + i_15_;
							if (i >= i_33_ && i < is_17_[i_32_] + i_33_) {
								int i_34_ = i + -1173855569 * anInt9387 * i_31_;
								int i_35_ = anIntArray9386[i_34_];
								int i_36_ = i_13_ + i_35_;
								int i_37_ = (i_35_ & 0xff00ff) + (i_13_ & 0xff00ff);
								i_35_ = ((i_36_ - i_37_ & 0x10000) + (i_37_ & 0x1000100));
								anIntArray9386[i_34_] = i_36_ - i_35_ | i_35_ - (i_35_ >>> 8);
							}
						}
						i_10_ += i_20_;
					}
				} else
					throw new IllegalArgumentException();
			} else {
				i <<= 16;
				i += 32768;
				i_11_ <<= 16;
				int i_38_ = (int) Math.floor((double) i_11_ / (double) i_12_ + 0.5);
				i_12_ += i_10_;
				if (i_10_ < i_18_) {
					i += i_38_ * (i_18_ - i_10_);
					i_10_ = i_18_;
				}
				if (i_12_ >= i_19_)
					i_12_ = i_19_ - 1;
				int i_39_ = i_13_ >>> 24;
				if (0 == i_14_ || i_14_ == 1 && i_39_ == 255) {
					for (/**/; i_10_ <= i_12_; i_10_++) {
						int i_40_ = i >> 16;
						int i_41_ = i_10_ - i_16_;
						int i_42_ = is[i_41_] + i_15_;
						if (i_40_ >= 1605202751 * anInt9383 && i_40_ < 2014358275 * anInt9391 && i_40_ >= i_42_ && i_40_ < i_42_ + is_17_[i_41_])
							anIntArray9386[i_40_ + i_10_ * (-1173855569 * anInt9387)] = i_13_;
						i += i_38_;
					}
				} else if (i_14_ == 1) {
					i_13_ = (i_39_ << 24) + (((i_13_ & 0xff00) * i_39_ >> 8 & 0xff00) + (i_39_ * (i_13_ & 0xff00ff) >> 8 & 0xff00ff));
					int i_43_ = 256 - i_39_;
					for (/**/; i_10_ <= i_12_; i_10_++) {
						int i_44_ = i >> 16;
						int i_45_ = i_10_ - i_16_;
						int i_46_ = is[i_45_] + i_15_;
						if (i_44_ >= anInt9383 * 1605202751 && i_44_ < 2014358275 * anInt9391 && i_44_ >= i_46_ && i_44_ < is_17_[i_45_] + i_46_) {
							int i_47_ = i_10_ * (-1173855569 * anInt9387) + i_44_;
							int i_48_ = anIntArray9386[i_47_];
							i_48_ = (((i_48_ & 0xff00) * i_43_ >> 8 & 0xff00) + ((i_48_ & 0xff00ff) * i_43_ >> 8 & 0xff00ff));
							anIntArray9386[(i_10_ * (-1173855569 * anInt9387) + i_44_)] = i_13_ + i_48_;
						}
						i += i_38_;
					}
				} else if (i_14_ == 2) {
					for (/**/; i_10_ <= i_12_; i_10_++) {
						int i_49_ = i >> 16;
						int i_50_ = i_10_ - i_16_;
						int i_51_ = is[i_50_] + i_15_;
						if (i_49_ >= anInt9383 * 1605202751 && i_49_ < 2014358275 * anInt9391 && i_49_ >= i_51_ && i_49_ < i_51_ + is_17_[i_50_]) {
							int i_52_ = i_49_ + anInt9387 * -1173855569 * i_10_;
							int i_53_ = anIntArray9386[i_52_];
							int i_54_ = i_53_ + i_13_;
							int i_55_ = (i_13_ & 0xff00ff) + (i_53_ & 0xff00ff);
							i_53_ = (i_55_ & 0x1000100) + (i_54_ - i_55_ & 0x10000);
							anIntArray9386[i_52_] = i_54_ - i_53_ | i_53_ - (i_53_ >>> 8);
						}
						i += i_38_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public int[] method3113(int i, int i_56_, int i_57_, int i_58_) {
		if (anIntArray9386 == null)
			throw new IllegalStateException("");
		int[] is = new int[i_57_ * i_58_];
		int i_59_ = 0;
		for (int i_60_ = 0; i_60_ < i_58_; i_60_++) {
			int i_61_ = i + (i_60_ + i_56_) * (-1173855569 * anInt9387);
			for (int i_62_ = 0; i_62_ < i_57_; i_62_++)
				is[i_59_++] = anIntArray9386[i_61_ + i_62_];
		}
		return is;
	}

	void method14820(boolean bool, boolean bool_63_, boolean bool_64_, int i, int i_65_, float f, int i_66_, int i_67_, short i_68_, int i_69_, int i_70_, int i_71_) {
		if (0 != i_66_ && 0 != i_67_) {
			if (i_68_ != -1) {
				Class163 class163 = aClass181_2059.method3544(i_68_, (byte) -90);
				if (!class163.aBool1806) {
					if (i_68_ != anInt9418 * -1948774645) {
						Class147 class147 = ((Class147) aClass205_9400.method3787((long) i_68_));
						if (null == class147) {
							int[] is = method14841(i_68_);
							if (is == null)
								return;
							int i_72_ = class163.anInt1780 * 1039262975;
							class147 = method3163(is, 0, i_72_, i_72_, i_72_, 1778840012);
							aClass205_9400.method3790(class147, (long) i_68_);
						}
						anInt9418 = i_68_ * -134298461;
						aClass147_9396 = class147;
					}
					((Class147_Sub1) aClass147_9396).method14430(bool, bool_63_, bool_64_, i - i_66_, i_65_ - i_67_, f, i_66_ << 1, i_67_ << 1, i_70_, i_69_, i_71_, 1, Class595.aClass595_7814 != class163.aClass595_1784);
					return;
				}
			}
			method14838(bool_63_, i, i_65_, f, i_66_, i_69_, i_71_);
		}
	}

	boolean method14821(int i) {
		Class163 class163 = aClass181_2059.method3544(i, (byte) -50);
		return anInterface24_2085.method134(Class609.aClass609_7996, i, Class591.aClass591_7796, 0.7F, 1039262975 * class163.anInt1780, 1039262975 * class163.anInt1780, true, 1316872573);
	}

	int method14822(int i) {
		return (aClass181_2059.method3544(i, (byte) -104).anInt1780 * 1039262975);
	}

	Class595 method14823(int i) {
		return aClass181_2059.method3544(i, (byte) -102).aClass595_1784;
	}

	byte method14824(int i) {
		return aClass181_2059.method3544(i, (byte) -105).aByte1764;
	}

	int method14825(int i) {
		return aClass181_2059.method3544(i, (byte) -102).aShort1810 & 0xffff;
	}

	public void method3375(Class427 class427) {
		aClass427_9402.method6750(class427);
		method14839();
	}

	public boolean method3094() {
		return false;
	}

	public void method3361(int i, int i_73_, int i_74_, int i_75_, int i_76_, int i_77_, int i_78_, int i_79_, int i_80_) {
		if (anIntArray9386 != null) {
			i_74_ -= i;
			i_75_ -= i_73_;
			if (0 == i_75_) {
				if (i_74_ >= 0)
					method14830(i, i_73_, 1 + i_74_, i_76_, i_77_, i_78_, i_79_, i_80_);
				else {
					int i_81_ = i_79_ + i_78_;
					i_80_ %= i_81_;
					i_80_ = i_81_ + i_78_ - i_80_ - (-i_74_ + 1) % i_81_;
					i_80_ %= i_81_;
					if (i_80_ < 0)
						i_80_ += i_81_;
					method14830(i + i_74_, i_73_, 1 + -i_74_, i_76_, i_77_, i_78_, i_79_, i_80_);
				}
			} else if (0 == i_74_) {
				if (i_75_ >= 0)
					method14831(i, i_73_, 1 + i_75_, i_76_, i_77_, i_78_, i_79_, i_80_);
				else {
					int i_82_ = i_78_ + i_79_;
					i_80_ %= i_82_;
					i_80_ = i_78_ + i_82_ - i_80_ - (1 + -i_75_) % i_82_;
					i_80_ %= i_82_;
					if (i_80_ < 0)
						i_80_ += i_82_;
					method14831(i, i_73_ + i_75_, 1 + -i_75_, i_76_, i_77_, i_78_, i_79_, i_80_);
				}
			} else {
				i_80_ <<= 8;
				i_78_ <<= 8;
				i_79_ <<= 8;
				int i_83_ = i_78_ + i_79_;
				i_80_ %= i_83_;
				if (i_74_ + i_75_ < 0) {
					int i_84_ = (int) (Math.sqrt((double) (i_75_ * i_75_ + i_74_ * i_74_)) * 256.0);
					int i_85_ = i_84_ % i_83_;
					i_80_ = i_83_ + i_78_ - i_80_ - i_85_;
					i_80_ %= i_83_;
					if (i_80_ < 0)
						i_80_ += i_83_;
					i += i_74_;
					i_74_ = -i_74_;
					i_73_ += i_75_;
					i_75_ = -i_75_;
				}
				if (i_74_ > i_75_) {
					i_73_ <<= 16;
					i_73_ += 32768;
					i_75_ <<= 16;
					int i_86_ = (int) Math.floor((double) i_75_ / (double) i_74_ + 0.5);
					i_74_ += i;
					int i_87_ = i_76_ >>> 24;
					int i_88_ = (int) Math.sqrt((double) (65536 + (i_86_ >> 8) * (i_86_ >> 8)));
					if (0 == i_77_ || 1 == i_77_ && 255 == i_87_) {
						while (i <= i_74_) {
							int i_89_ = i_73_ >> 16;
							if (i >= 1605202751 * anInt9383 && i < 2014358275 * anInt9391 && i_89_ >= anInt9392 * -456655989 && i_89_ < -383695469 * anInt9393 && i_80_ < i_78_)
								anIntArray9386[i + i_89_ * (anInt9387 * -1173855569)] = i_76_;
							i_73_ += i_86_;
							i++;
							i_80_ += i_88_;
							i_80_ %= i_83_;
						}
					} else if (i_77_ == 1) {
						i_76_ = (((i_76_ & 0xff00ff) * i_87_ >> 8 & 0xff00ff) + (i_87_ * (i_76_ & 0xff00) >> 8 & 0xff00) + (i_87_ << 24));
						int i_90_ = 256 - i_87_;
						while (i <= i_74_) {
							int i_91_ = i_73_ >> 16;
							if (i >= 1605202751 * anInt9383 && i < 2014358275 * anInt9391 && i_91_ >= -456655989 * anInt9392 && i_91_ < -383695469 * anInt9393 && i_80_ < i_78_) {
								int i_92_ = i + -1173855569 * anInt9387 * i_91_;
								int i_93_ = anIntArray9386[i_92_];
								i_93_ = ((i_90_ * (i_93_ & 0xff00) >> 8 & 0xff00) + (i_90_ * (i_93_ & 0xff00ff) >> 8 & 0xff00ff));
								anIntArray9386[i_92_] = i_93_ + i_76_;
							}
							i_73_ += i_86_;
							i++;
							i_80_ += i_88_;
							i_80_ %= i_83_;
						}
					} else if (2 == i_77_) {
						while (i <= i_74_) {
							int i_94_ = i_73_ >> 16;
							if (i >= anInt9383 * 1605202751 && i < 2014358275 * anInt9391 && i_94_ >= anInt9392 * -456655989 && i_94_ < -383695469 * anInt9393 && i_80_ < i_78_) {
								int i_95_ = i + anInt9387 * -1173855569 * i_94_;
								int i_96_ = anIntArray9386[i_95_];
								int i_97_ = i_76_ + i_96_;
								int i_98_ = (i_76_ & 0xff00ff) + (i_96_ & 0xff00ff);
								i_96_ = (i_98_ & 0x1000100) + (i_97_ - i_98_ & 0x10000);
								anIntArray9386[i_95_] = i_97_ - i_96_ | i_96_ - (i_96_ >>> 8);
							}
							i_73_ += i_86_;
							i++;
							i_80_ += i_88_;
							i_80_ %= i_83_;
						}
					} else
						throw new IllegalArgumentException();
				} else {
					i <<= 16;
					i += 32768;
					i_74_ <<= 16;
					int i_99_ = (int) Math.floor((double) i_74_ / (double) i_75_ + 0.5);
					i_75_ += i_73_;
					int i_100_ = i_76_ >>> 24;
					int i_101_ = (int) Math.sqrt((double) ((i_99_ >> 8) * (i_99_ >> 8) + 65536));
					if (i_77_ == 0 || i_77_ == 1 && 255 == i_100_) {
						while (i_73_ <= i_75_) {
							int i_102_ = i >> 16;
							if (i_73_ >= -456655989 * anInt9392 && i_73_ < -383695469 * anInt9393 && i_102_ >= 1605202751 * anInt9383 && i_102_ < anInt9391 * 2014358275 && i_80_ < i_78_)
								anIntArray9386[i_102_ + (-1173855569 * anInt9387 * i_73_)] = i_76_;
							i += i_99_;
							i_73_++;
							i_80_ += i_101_;
							i_80_ %= i_83_;
						}
					} else if (i_77_ == 1) {
						i_76_ = ((i_100_ << 24) + (((i_76_ & 0xff00ff) * i_100_ >> 8 & 0xff00ff) + (i_100_ * (i_76_ & 0xff00) >> 8 & 0xff00)));
						int i_103_ = 256 - i_100_;
						while (i_73_ <= i_75_) {
							int i_104_ = i >> 16;
							if (i_73_ >= -456655989 * anInt9392 && i_73_ < anInt9393 * -383695469 && i_104_ >= 1605202751 * anInt9383 && i_104_ < 2014358275 * anInt9391 && i_80_ < i_78_) {
								int i_105_ = i_104_ + -1173855569 * anInt9387 * i_73_;
								int i_106_ = anIntArray9386[i_105_];
								i_106_ = (((i_106_ & 0xff00) * i_103_ >> 8 & 0xff00) + ((i_106_ & 0xff00ff) * i_103_ >> 8 & 0xff00ff));
								anIntArray9386[i_104_ + (-1173855569 * anInt9387 * i_73_)] = i_106_ + i_76_;
							}
							i += i_99_;
							i_73_++;
							i_80_ += i_101_;
							i_80_ %= i_83_;
						}
					} else if (2 == i_77_) {
						while (i_73_ <= i_75_) {
							int i_107_ = i >> 16;
							if (i_73_ >= -456655989 * anInt9392 && i_73_ < -383695469 * anInt9393 && i_107_ >= 1605202751 * anInt9383 && i_107_ < anInt9391 * 2014358275 && i_80_ < i_78_) {
								int i_108_ = anInt9387 * -1173855569 * i_73_ + i_107_;
								int i_109_ = anIntArray9386[i_108_];
								int i_110_ = i_109_ + i_76_;
								int i_111_ = (i_76_ & 0xff00ff) + (i_109_ & 0xff00ff);
								i_109_ = ((i_110_ - i_111_ & 0x10000) + (i_111_ & 0x1000100));
								anIntArray9386[i_108_] = i_110_ - i_109_ | i_109_ - (i_109_ >>> 8);
							}
							i += i_99_;
							i_73_++;
							i_80_ += i_101_;
							i_80_ %= i_83_;
						}
					} else
						throw new IllegalArgumentException();
				}
			}
		}
	}

	public boolean method3088() {
		return true;
	}

	public boolean method3374() {
		return false;
	}

	public void method3383(int i, float f, float f_112_, float f_113_, float f_114_, float f_115_) {
		anInt9397 = (int) (65535.0F * f) * 1717693179;
		anInt9408 = -300169701 * (int) (f_112_ * 65535.0F);
		float f_116_ = (float) Math.sqrt((double) (f_114_ * f_114_ + f_113_ * f_113_ + f_115_ * f_115_));
		anInt9413 = (int) (65535.0F * f_113_ / f_116_) * 1203059775;
		anInt9409 = (int) (f_114_ * 65535.0F / f_116_) * 658553925;
		anInt9394 = 1070820009 * (int) (65535.0F * f_115_ / f_116_);
	}

	public boolean method3381() {
		return false;
	}

	public boolean method3251() {
		return false;
	}

	public boolean method3112() {
		return false;
	}

	public Class527_Sub16 method3472(int i, int i_117_, int i_118_, int i_119_, int i_120_, float f) {
		return null;
	}

	public void method3201(Class172 class172, float f, Class172 class172_121_, float f_122_, Class172 class172_123_, float f_124_) {
		/* empty */
	}

	public String method3096() {
		return "";
	}

	public void method3483(int i, int i_125_, int i_126_, int i_127_) {
		if (1605202751 * anInt9383 < i)
			anInt9383 = i * -1482949441;
		if (anInt9392 * -456655989 < i_125_)
			anInt9392 = i_125_ * -1103277021;
		if (2014358275 * anInt9391 > i_126_)
			anInt9391 = 274044843 * i_126_;
		if (anInt9393 * -383695469 > i_127_)
			anInt9393 = i_127_ * 2022023323;
		method14828();
	}

	void method3215(float f, float f_128_, float f_129_, float f_130_, float f_131_, float f_132_) {
		/* empty */
	}

	public Class147 method3162(int[] is, int i, int i_133_, int i_134_, int i_135_, boolean bool) {
		boolean bool_136_ = false;
		int i_137_ = i;
		while_114_: for (int i_138_ = 0; i_138_ < i_135_; i_138_++) {
			for (int i_139_ = 0; i_139_ < i_134_; i_139_++) {
				int i_140_ = is[i_137_++] >>> 24;
				if (0 != i_140_ && i_140_ != 255) {
					bool_136_ = true;
					break while_114_;
				}
			}
		}
		if (bool_136_)
			return new Class147_Sub1_Sub2(this, is, i, i_133_, i_134_, i_135_, bool);
		return new Class147_Sub1_Sub1(this, is, i, i_133_, i_134_, i_135_, bool);
	}

	void method14826(int i, int i_141_, int[] is, float[] fs) {
		anInt9387 = i * 1107440719;
		anInt9388 = -197273773 * i_141_;
		anIntArray9386 = is;
		aFloatArray9389 = fs;
		for (int i_142_ = 0; i_142_ < 1413774429 * anInt9415; i_142_++)
			aClass101Array9416[i_142_].method1777((byte) -26);
		method3131();
		method3127();
	}

	void method14827(int i, int i_143_, int[] is, float[] fs) {
		anInt9387 = i * 1107440719;
		anInt9388 = -197273773 * i_143_;
		anIntArray9386 = is;
		aFloatArray9389 = fs;
		for (int i_144_ = 0; i_144_ < 1413774429 * anInt9415; i_144_++)
			aClass101Array9416[i_144_].method1777((byte) 2);
		method3131();
		method3127();
	}

	public void method3114() {
		/* empty */
	}

	public void method3098(int[] is) {
		is[0] = -1173855569 * anInt9387;
		is[1] = anInt9388 * -77167397;
	}

	public boolean method3469() {
		return false;
	}

	public boolean method3184() {
		return true;
	}

	public void method3183(Class427 class427) {
		aClass427_9402.method6750(class427);
		method14839();
	}

	public Class143 method3218() {
		return new Class143(0, "Pure Java", 1, "CPU", 0L, false);
	}

	public boolean method3265() {
		return false;
	}

	public void method3121(int i, int i_145_, int i_146_) {
		/* empty */
	}

	public void method3120() {
		/* empty */
	}

	void method14828() {
		int i = anInt9391 * 2014358275 - anInt9383 * 1605202751;
		int i_147_ = anInt9393 * -383695469 - -456655989 * anInt9392;
		float f = aFloat9419 = (float) (278922843 * anInt9390) / 2.0F;
		float f_148_ = aFloat9395 = (float) (anInt9385 * 56228905) / 2.0F;
		aFloat9410 = (float) (anInt9407 * 1927584963) + f;
		aFloat9412 = (float) (anInt9406 * 950770619) + f_148_;
		for (int i_149_ = 0; i_149_ < anInt9415 * 1413774429; i_149_++) {
			Class101 class101 = aClass101Array9416[i_149_];
			Class119 class119 = class101.aClass119_1197;
			class119.aFloat1451 = f;
			class119.aFloat1466 = f_148_;
			class119.aFloat1448 = aFloat9410 - (float) (1605202751 * anInt9383);
			class119.aFloat1444 = aFloat9412 - (float) (anInt9392 * -456655989);
			class119.anInt1442 = i;
			class119.anInt1450 = i_147_;
		}
		int i_150_ = (anInt9383 * 1605202751 + anInt9387 * -1173855569 * (-456655989 * anInt9392));
		for (int i_151_ = -456655989 * anInt9392; i_151_ < -383695469 * anInt9393; i_151_++) {
			for (int i_152_ = 0; i_152_ < 1413774429 * anInt9415; i_152_++)
				aClass101Array9416[i_152_].aClass119_1197.anIntArray1447[i_151_ - anInt9392 * -456655989] = i_150_;
			i_150_ += -1173855569 * anInt9387;
		}
	}

	public boolean method3095() {
		return true;
	}

	public void method3266(int i, int i_153_, int[] is, int[] is_154_) {
		method3482(i, i_153_, -1784395681);
		if (null == aClass147_9421 || aClass147_9421.method2407() != i || aClass147_9421.method2424() != i_153_) {
			aClass147_9421 = method3161(i, i_153_, true, true);
			aClass171_Sub2_9422 = null;
		}
		if (null == aClass171_Sub2_9422) {
			aClass171_Sub2_9422 = method3109();
			aClass171_Sub2_9422.method15321(0, aClass147_9421.method2454());
		}
		Class147_Sub1_Sub2 class147_sub1_sub2 = new Class147_Sub1_Sub2(this, anIntArray9386, -1173855569 * anInt9387, anInt9388 * -77167397);
		method3106(aClass171_Sub2_9422, (byte) -3);
		method3136(1, -16777216);
		class147_sub1_sub2.method2420(-1964562579 * anInt2083, anInt2068 * 960890533, anInt2088 * -731510031, anInt2089 * 351158293, 1, 0, 0, 0);
		aClass147_9421.method2412(0, 0, i, i_153_, is, is_154_, 0, i);
		method3107(aClass171_Sub2_9422, -677418425);
	}

	public boolean method3089() {
		return false;
	}

	void method14829() {
		if (null != aFloatArray9389) {
			if (0 == 1605202751 * anInt9383 && anInt9387 * -1173855569 == 2014358275 * anInt9391 && -456655989 * anInt9392 == 0 && anInt9388 * -77167397 == -383695469 * anInt9393) {
				int i = aFloatArray9389.length;
				int i_155_ = i - (i & 0x7);
				int i_156_ = 0;
				while (i_156_ < i_155_) {
					aFloatArray9389[i_156_++] = 2.14748365E9F;
					aFloatArray9389[i_156_++] = 2.14748365E9F;
					aFloatArray9389[i_156_++] = 2.14748365E9F;
					aFloatArray9389[i_156_++] = 2.14748365E9F;
					aFloatArray9389[i_156_++] = 2.14748365E9F;
					aFloatArray9389[i_156_++] = 2.14748365E9F;
					aFloatArray9389[i_156_++] = 2.14748365E9F;
					aFloatArray9389[i_156_++] = 2.14748365E9F;
				}
				while (i_156_ < i)
					aFloatArray9389[i_156_++] = 2.14748365E9F;
			} else {
				int i = anInt9391 * 2014358275 - anInt9383 * 1605202751;
				int i_157_ = anInt9393 * -383695469 - anInt9392 * -456655989;
				int i_158_ = anInt9387 * -1173855569 - i;
				int i_159_ = (1605202751 * anInt9383 + anInt9387 * -1173855569 * (anInt9392 * -456655989));
				int i_160_ = i >> 3;
				int i_161_ = i & 0x7;
				i = i_159_ - 1;
				for (int i_162_ = -i_157_; i_162_ < 0; i_162_++) {
					if (i_160_ > 0) {
						int i_163_ = i_160_;
						do {
							aFloatArray9389[++i] = 2.14748365E9F;
							aFloatArray9389[++i] = 2.14748365E9F;
							aFloatArray9389[++i] = 2.14748365E9F;
							aFloatArray9389[++i] = 2.14748365E9F;
							aFloatArray9389[++i] = 2.14748365E9F;
							aFloatArray9389[++i] = 2.14748365E9F;
							aFloatArray9389[++i] = 2.14748365E9F;
							aFloatArray9389[++i] = 2.14748365E9F;
						} while (--i_163_ > 0);
					}
					if (i_161_ > 0) {
						int i_164_ = i_161_;
						do
							aFloatArray9389[++i] = 2.14748365E9F;
						while (--i_164_ > 0);
					}
					i += i_158_;
				}
			}
		}
	}

	public void method3168(int i, int i_165_, int i_166_, int i_167_) {
		if (i < 0)
			i = 0;
		if (i_165_ < 0)
			i_165_ = 0;
		if (i_166_ > anInt9387 * -1173855569)
			i_166_ = anInt9387 * -1173855569;
		if (i_167_ > -77167397 * anInt9388)
			i_167_ = -77167397 * anInt9388;
		anInt9383 = -1482949441 * i;
		anInt9391 = 274044843 * i_166_;
		anInt9392 = i_165_ * -1103277021;
		anInt9393 = 2022023323 * i_167_;
		method14828();
	}

	void method3410(int i, int i_168_, int i_169_, int i_170_, int i_171_) {
		if (anIntArray9386 != null && (i_168_ >= anInt9392 * -456655989 && i_168_ < -383695469 * anInt9393)) {
			if (i < 1605202751 * anInt9383) {
				i_169_ -= 1605202751 * anInt9383 - i;
				i = anInt9383 * 1605202751;
			}
			if (i_169_ + i > anInt9391 * 2014358275)
				i_169_ = anInt9391 * 2014358275 - i;
			int i_172_ = i_168_ * (anInt9387 * -1173855569) + i;
			int i_173_ = i_170_ >>> 24;
			if (0 == i_171_ || i_171_ == 1 && i_173_ == 255) {
				for (int i_174_ = 0; i_174_ < i_169_; i_174_++)
					anIntArray9386[i_172_ + i_174_] = i_170_;
			} else if (i_171_ == 1) {
				i_170_ = (((i_170_ & 0xff00) * i_173_ >> 8 & 0xff00) + (i_173_ * (i_170_ & 0xff00ff) >> 8 & 0xff00ff) + (i_173_ << 24));
				int i_175_ = 256 - i_173_;
				for (int i_176_ = 0; i_176_ < i_169_; i_176_++) {
					int i_177_ = anIntArray9386[i_176_ + i_172_];
					i_177_ = ((i_175_ * (i_177_ & 0xff00ff) >> 8 & 0xff00ff) + (i_175_ * (i_177_ & 0xff00) >> 8 & 0xff00));
					anIntArray9386[i_176_ + i_172_] = i_177_ + i_170_;
				}
			} else if (i_171_ == 2) {
				for (int i_178_ = 0; i_178_ < i_169_; i_178_++) {
					int i_179_ = anIntArray9386[i_172_ + i_178_];
					int i_180_ = i_170_ + i_179_;
					int i_181_ = (i_170_ & 0xff00ff) + (i_179_ & 0xff00ff);
					i_179_ = (i_181_ & 0x1000100) + (i_180_ - i_181_ & 0x10000);
					anIntArray9386[i_172_ + i_178_] = i_180_ - i_179_ | i_179_ - (i_179_ >>> 8);
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public void method3128(int i, int i_182_, int i_183_, int i_184_) {
		anInt9407 = i * -773983253;
		anInt9406 = 940241267 * i_182_;
		anInt9390 = -1141261869 * i_183_;
		anInt9385 = -716218343 * i_184_;
		method14828();
	}

	public void method3129(int[] is) {
		is[0] = anInt9407 * 1927584963;
		is[1] = anInt9406 * 950770619;
		is[2] = 278922843 * anInt9390;
		is[3] = 56228905 * anInt9385;
	}

	public void method3327(float f, float f_185_) {
		aFloat9405 = f_185_ - f;
		aFloat9414 = f_185_ + f - 1.0F;
		for (int i = 0; i < anInt9415 * 1413774429; i++) {
			Class101 class101 = aClass101Array9416[i];
			Class119 class119 = class101.aClass119_1197;
			class119.aFloat1453 = aFloat9405;
			class119.aFloat1452 = aFloat9414;
		}
	}

	public void method3126() {
		aClass171_Sub2_9422 = null;
		aClass147_9421 = null;
	}

	public void method3386(int i, int i_186_, int i_187_) {
		for (int i_188_ = 0; i_188_ < aClass101Array9416.length; i_188_++) {
			Class101 class101 = aClass101Array9416[i_188_];
			class101.anInt1194 = (i & 0xffffff) * 653672225;
			int i_189_ = -1009384223 * class101.anInt1194 >>> 16 & 0xff;
			if (i_189_ < 2)
				i_189_ = 2;
			int i_190_ = -1009384223 * class101.anInt1194 >> 8 & 0xff;
			if (i_190_ < 2)
				i_190_ = 2;
			int i_191_ = class101.anInt1194 * -1009384223 & 0xff;
			if (i_191_ < 2)
				i_191_ = 2;
			class101.anInt1194 = 653672225 * (i_189_ << 16 | i_190_ << 8 | i_191_);
			if (i_186_ < 0)
				class101.aBool1191 = false;
			else
				class101.aBool1191 = true;
		}
	}

	public void method3132(int i, int i_192_, int i_193_, int i_194_) {
		if (i < 0)
			i = 0;
		if (i_192_ < 0)
			i_192_ = 0;
		if (i_193_ > anInt9387 * -1173855569)
			i_193_ = anInt9387 * -1173855569;
		if (i_194_ > -77167397 * anInt9388)
			i_194_ = -77167397 * anInt9388;
		anInt9383 = -1482949441 * i;
		anInt9391 = 274044843 * i_193_;
		anInt9392 = i_192_ * -1103277021;
		anInt9393 = 2022023323 * i_194_;
		method14828();
	}

	public void method3138(int i, int i_195_, int i_196_, int i_197_) {
		if (1605202751 * anInt9383 < i)
			anInt9383 = i * -1482949441;
		if (anInt9392 * -456655989 < i_195_)
			anInt9392 = i_195_ * -1103277021;
		if (2014358275 * anInt9391 > i_196_)
			anInt9391 = 274044843 * i_196_;
		if (anInt9393 * -383695469 > i_197_)
			anInt9393 = i_197_ * 2022023323;
		method14828();
	}

	public void method3135(int[] is) {
		is[0] = anInt9383 * 1605202751;
		is[1] = -456655989 * anInt9392;
		is[2] = anInt9391 * 2014358275;
		is[3] = -383695469 * anInt9393;
	}

	public void method3136(int i, int i_198_) {
		if (0 != (i & 0x1))
			method3348(0, 0, -1173855569 * anInt9387, -77167397 * anInt9388, i_198_, 0);
		if ((i & 0x2) != 0)
			method14829();
	}

	public void method3134(int i, int i_199_, int i_200_, int i_201_, int i_202_, int i_203_) {
		method3410(i, i_199_, i_200_, i_202_, i_203_);
		method3410(i, i_201_ + i_199_ - 1, i_200_, i_202_, i_203_);
		method3148(i, i_199_ + 1, i_201_ - 2, i_202_, i_203_);
		method3148(i_200_ + i - 1, i_199_ + 1, i_201_ - 2, i_202_, i_203_);
	}

	public void method3344(int i, Class527_Sub16[] class527_sub16s) {
		/* empty */
	}

	public void method3415(int i, Class178 class178) {
		for (int i_204_ = 0; i_204_ < aClass101Array9416.length; i_204_++) {
			aClass101Array9416[i_204_].anInt1195 = aClass101Array9416[i_204_].anInt1194 * 523461273;
			aClass101Array9416[i_204_].anInt1205 = -1687140521 * i;
			aClass101Array9416[i_204_].anInt1194 = 1892560347 * class178.anInt2055;
			aClass101Array9416[i_204_].anInt1198 = class178.anInt2050 * -1455708645;
			aClass101Array9416[i_204_].aBool1196 = true;
		}
	}

	public void method3339(boolean bool) {
		/* empty */
	}

	void method14830(int i, int i_205_, int i_206_, int i_207_, int i_208_, int i_209_, int i_210_, int i_211_) {
		if (anIntArray9386 != null && (i_205_ >= -456655989 * anInt9392 && i_205_ < anInt9393 * -383695469)) {
			int i_212_ = i + i_205_ * (-1173855569 * anInt9387);
			int i_213_ = i_207_ >>> 24;
			int i_214_ = i_210_ + i_209_;
			int i_215_ = i_211_ % i_214_;
			if (0 == i_208_ || 1 == i_208_ && i_213_ == 255) {
				int i_216_ = 0;
				while (i_216_ < i_206_) {
					if (i + i_216_ >= 1605202751 * anInt9383 && i + i_216_ < 2014358275 * anInt9391 && i_215_ < i_209_)
						anIntArray9386[i_212_ + i_216_] = i_207_;
					i_216_++;
					i_215_ = ++i_215_ % i_214_;
				}
			} else if (1 == i_208_) {
				i_207_ = ((i_213_ << 24) + ((i_213_ * (i_207_ & 0xff00ff) >> 8 & 0xff00ff) + (i_213_ * (i_207_ & 0xff00) >> 8 & 0xff00)));
				int i_217_ = 256 - i_213_;
				int i_218_ = 0;
				while (i_218_ < i_206_) {
					if (i_218_ + i >= anInt9383 * 1605202751 && i + i_218_ < anInt9391 * 2014358275 && i_215_ < i_209_) {
						int i_219_ = anIntArray9386[i_212_ + i_218_];
						i_219_ = ((i_217_ * (i_219_ & 0xff00ff) >> 8 & 0xff00ff) + (i_217_ * (i_219_ & 0xff00) >> 8 & 0xff00));
						anIntArray9386[i_212_ + i_218_] = i_207_ + i_219_;
					}
					i_218_++;
					i_215_ = ++i_215_ % i_214_;
				}
			} else if (2 == i_208_) {
				int i_220_ = 0;
				while (i_220_ < i_206_) {
					if (i + i_220_ >= anInt9383 * 1605202751 && i_220_ + i < anInt9391 * 2014358275 && i_215_ < i_209_) {
						int i_221_ = anIntArray9386[i_212_ + i_220_];
						int i_222_ = i_207_ + i_221_;
						int i_223_ = (i_207_ & 0xff00ff) + (i_221_ & 0xff00ff);
						i_221_ = (i_222_ - i_223_ & 0x10000) + (i_223_ & 0x1000100);
						anIntArray9386[i_220_ + i_212_] = i_222_ - i_221_ | i_221_ - (i_221_ >>> 8);
					}
					i_220_++;
					i_215_ = ++i_215_ % i_214_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public boolean method3441() {
		return false;
	}

	void method14831(int i, int i_224_, int i_225_, int i_226_, int i_227_, int i_228_, int i_229_, int i_230_) {
		if (anIntArray9386 != null && (i >= anInt9383 * 1605202751 && i < 2014358275 * anInt9391)) {
			int i_231_ = i + i_224_ * (-1173855569 * anInt9387);
			int i_232_ = i_226_ >>> 24;
			int i_233_ = i_229_ + i_228_;
			int i_234_ = i_230_ % i_233_;
			if (i_227_ == 0 || 1 == i_227_ && i_232_ == 255) {
				int i_235_ = 0;
				while (i_235_ < i_225_) {
					if (i_235_ + i_224_ >= -456655989 * anInt9392 && i_235_ + i_224_ < -383695469 * anInt9393 && i_234_ < i_228_)
						anIntArray9386[(i_235_ * (anInt9387 * -1173855569) + i_231_)] = i_226_;
					i_235_++;
					i_234_ = ++i_234_ % i_233_;
				}
			} else if (i_227_ == 1) {
				i_226_ = ((i_232_ * (i_226_ & 0xff00) >> 8 & 0xff00) + ((i_226_ & 0xff00ff) * i_232_ >> 8 & 0xff00ff) + (i_232_ << 24));
				int i_236_ = 256 - i_232_;
				int i_237_ = 0;
				while (i_237_ < i_225_) {
					if (i_224_ + i_237_ >= anInt9392 * -456655989 && i_237_ + i_224_ < -383695469 * anInt9393 && i_234_ < i_228_) {
						int i_238_ = i_231_ + -1173855569 * anInt9387 * i_237_;
						int i_239_ = anIntArray9386[i_238_];
						i_239_ = ((i_236_ * (i_239_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_239_ & 0xff00) * i_236_ >> 8 & 0xff00));
						anIntArray9386[i_238_] = i_226_ + i_239_;
					}
					i_237_++;
					i_234_ = ++i_234_ % i_233_;
				}
			} else if (i_227_ == 2) {
				int i_240_ = 0;
				while (i_240_ < i_225_) {
					if (i_224_ + i_240_ >= -456655989 * anInt9392 && i_240_ + i_224_ < -383695469 * anInt9393 && i_234_ < i_228_) {
						int i_241_ = i_240_ * (anInt9387 * -1173855569) + i_231_;
						int i_242_ = anIntArray9386[i_241_];
						int i_243_ = i_226_ + i_242_;
						int i_244_ = (i_226_ & 0xff00ff) + (i_242_ & 0xff00ff);
						i_242_ = (i_244_ & 0x1000100) + (i_243_ - i_244_ & 0x10000);
						anIntArray9386[i_241_] = i_243_ - i_242_ | i_242_ - (i_242_ >>> 8);
					}
					i_240_++;
					i_234_ = ++i_234_ % i_233_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public void method3149(int i, int i_245_, int i_246_, int i_247_, int i_248_, int i_249_) {
		if (anIntArray9386 != null) {
			i_246_ -= i;
			i_247_ -= i_245_;
			if (0 == i_247_) {
				if (i_246_ >= 0)
					method3410(i, i_245_, i_246_ + 1, i_248_, i_249_);
				else
					method3410(i + i_246_, i_245_, -i_246_ + 1, i_248_, i_249_);
			} else if (i_246_ == 0) {
				if (i_247_ >= 0)
					method3148(i, i_245_, i_247_ + 1, i_248_, i_249_);
				else
					method3148(i, i_247_ + i_245_, 1 + -i_247_, i_248_, i_249_);
			} else {
				if (i_246_ + i_247_ < 0) {
					i += i_246_;
					i_246_ = -i_246_;
					i_245_ += i_247_;
					i_247_ = -i_247_;
				}
				if (i_246_ > i_247_) {
					i_245_ <<= 16;
					i_245_ += 32768;
					i_247_ <<= 16;
					int i_250_ = (int) Math.floor(0.5 + ((double) i_247_ / (double) i_246_));
					i_246_ += i;
					if (i < 1605202751 * anInt9383) {
						i_245_ += (anInt9383 * 1605202751 - i) * i_250_;
						i = anInt9383 * 1605202751;
					}
					if (i_246_ >= 2014358275 * anInt9391)
						i_246_ = anInt9391 * 2014358275 - 1;
					int i_251_ = i_248_ >>> 24;
					if (0 == i_249_ || i_249_ == 1 && 255 == i_251_) {
						for (/**/; i <= i_246_; i++) {
							int i_252_ = i_245_ >> 16;
							if (i_252_ >= anInt9392 * -456655989 && i_252_ < anInt9393 * -383695469)
								anIntArray9386[i_252_ * (-1173855569 * anInt9387) + i] = i_248_;
							i_245_ += i_250_;
						}
					} else if (1 == i_249_) {
						i_248_ = ((i_251_ << 24) + ((i_251_ * (i_248_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_248_ & 0xff00) * i_251_ >> 8 & 0xff00)));
						int i_253_ = 256 - i_251_;
						for (/**/; i <= i_246_; i++) {
							int i_254_ = i_245_ >> 16;
							if (i_254_ >= anInt9392 * -456655989 && i_254_ < anInt9393 * -383695469) {
								int i_255_ = i + i_254_ * (anInt9387 * -1173855569);
								int i_256_ = anIntArray9386[i_255_];
								i_256_ = (((i_256_ & 0xff00) * i_253_ >> 8 & 0xff00) + (i_253_ * (i_256_ & 0xff00ff) >> 8 & 0xff00ff));
								anIntArray9386[i_255_] = i_248_ + i_256_;
							}
							i_245_ += i_250_;
						}
					} else if (2 == i_249_) {
						for (/**/; i <= i_246_; i++) {
							int i_257_ = i_245_ >> 16;
							if (i_257_ >= -456655989 * anInt9392 && i_257_ < -383695469 * anInt9393) {
								int i_258_ = i + anInt9387 * -1173855569 * i_257_;
								int i_259_ = anIntArray9386[i_258_];
								int i_260_ = i_259_ + i_248_;
								int i_261_ = ((i_248_ & 0xff00ff) + (i_259_ & 0xff00ff));
								i_259_ = ((i_260_ - i_261_ & 0x10000) + (i_261_ & 0x1000100));
								anIntArray9386[i_258_] = i_260_ - i_259_ | i_259_ - (i_259_ >>> 8);
							}
							i_245_ += i_250_;
						}
					} else
						throw new IllegalArgumentException();
				} else {
					i <<= 16;
					i += 32768;
					i_246_ <<= 16;
					int i_262_ = (int) Math.floor((double) i_246_ / (double) i_247_ + 0.5);
					i_247_ += i_245_;
					if (i_245_ < anInt9392 * -456655989) {
						i += (-456655989 * anInt9392 - i_245_) * i_262_;
						i_245_ = anInt9392 * -456655989;
					}
					if (i_247_ >= -383695469 * anInt9393)
						i_247_ = anInt9393 * -383695469 - 1;
					int i_263_ = i_248_ >>> 24;
					if (0 == i_249_ || i_249_ == 1 && 255 == i_263_) {
						for (/**/; i_245_ <= i_247_; i_245_++) {
							int i_264_ = i >> 16;
							if (i_264_ >= anInt9383 * 1605202751 && i_264_ < anInt9391 * 2014358275)
								anIntArray9386[anInt9387 * -1173855569 * i_245_ + i_264_] = i_248_;
							i += i_262_;
						}
					} else if (1 == i_249_) {
						i_248_ = ((i_263_ << 24) + (((i_248_ & 0xff00ff) * i_263_ >> 8 & 0xff00ff) + ((i_248_ & 0xff00) * i_263_ >> 8 & 0xff00)));
						int i_265_ = 256 - i_263_;
						for (/**/; i_245_ <= i_247_; i_245_++) {
							int i_266_ = i >> 16;
							if (i_266_ >= anInt9383 * 1605202751 && i_266_ < anInt9391 * 2014358275) {
								int i_267_ = i_266_ + i_245_ * (-1173855569 * anInt9387);
								int i_268_ = anIntArray9386[i_267_];
								i_268_ = ((i_265_ * (i_268_ & 0xff00) >> 8 & 0xff00) + ((i_268_ & 0xff00ff) * i_265_ >> 8 & 0xff00ff));
								anIntArray9386[(i_266_ + i_245_ * (anInt9387 * -1173855569))] = i_248_ + i_268_;
							}
							i += i_262_;
						}
					} else if (i_249_ == 2) {
						for (/**/; i_245_ <= i_247_; i_245_++) {
							int i_269_ = i >> 16;
							if (i_269_ >= anInt9383 * 1605202751 && i_269_ < anInt9391 * 2014358275) {
								int i_270_ = (i_245_ * (-1173855569 * anInt9387) + i_269_);
								int i_271_ = anIntArray9386[i_270_];
								int i_272_ = i_271_ + i_248_;
								int i_273_ = ((i_248_ & 0xff00ff) + (i_271_ & 0xff00ff));
								i_271_ = ((i_272_ - i_273_ & 0x10000) + (i_273_ & 0x1000100));
								anIntArray9386[i_270_] = i_272_ - i_271_ | i_271_ - (i_271_ >>> 8);
							}
							i += i_262_;
						}
					} else
						throw new IllegalArgumentException();
				}
			}
		}
	}

	public Class176 method3376(Class175 class175, int i, int i_274_, int i_275_, int i_276_) {
		return new Class176_Sub2(this, class175, i, i_275_, i_276_, i_274_);
	}

	int method14832(int i) {
		return aClass181_2059.method3544(i, (byte) 0).aShort1810 & 0xffff;
	}

	public Class179 method3390(Class179 class179, Class179 class179_277_, float f, Class179 class179_278_) {
		return null;
	}

	public void method3262(int[] is) {
		is[0] = -1173855569 * anInt9387;
		is[1] = anInt9388 * -77167397;
	}

	public int method3382(int i, int i_279_, int i_280_, int i_281_, int i_282_, int i_283_) {
		int i_284_ = 0;
		float f = (aClass427_9403.aFloatArray4807[6] * (float) i_279_ + (aClass427_9403.aFloatArray4807[14] + (float) i * aClass427_9403.aFloatArray4807[2]) + (float) i_280_ * aClass427_9403.aFloatArray4807[10]);
		float f_285_ = ((float) i_282_ * aClass427_9403.aFloatArray4807[6] + (aClass427_9403.aFloatArray4807[2] * (float) i_281_ + aClass427_9403.aFloatArray4807[14]) + (float) i_283_ * aClass427_9403.aFloatArray4807[10]);
		float f_286_ = (aClass427_9403.aFloatArray4807[15] + aClass427_9403.aFloatArray4807[3] * (float) i + aClass427_9403.aFloatArray4807[7] * (float) i_279_ + aClass427_9403.aFloatArray4807[11] * (float) i_280_);
		float f_287_ = (aClass427_9403.aFloatArray4807[15] + aClass427_9403.aFloatArray4807[3] * (float) i_281_ + (float) i_282_ * aClass427_9403.aFloatArray4807[7] + aClass427_9403.aFloatArray4807[11] * (float) i_283_);
		if (f < -f_286_ && f_285_ < -f_287_)
			i_284_ |= 0x10;
		else if (f > f_286_ && f_285_ > f_287_)
			i_284_ |= 0x20;
		float f_288_ = ((float) i * aClass427_9403.aFloatArray4807[0] + aClass427_9403.aFloatArray4807[12] + aClass427_9403.aFloatArray4807[4] * (float) i_279_ + aClass427_9403.aFloatArray4807[8] * (float) i_280_);
		float f_289_ = ((float) i_283_ * aClass427_9403.aFloatArray4807[8] + (aClass427_9403.aFloatArray4807[4] * (float) i_282_ + (aClass427_9403.aFloatArray4807[12] + aClass427_9403.aFloatArray4807[0] * (float) i_281_)));
		if (f_288_ < -f_286_ && f_289_ < -f_287_)
			i_284_ |= 0x1;
		if (f_288_ > f_286_ && f_289_ > f_287_)
			i_284_ |= 0x2;
		float f_290_ = ((float) i * aClass427_9403.aFloatArray4807[1] + aClass427_9403.aFloatArray4807[13] + (float) i_279_ * aClass427_9403.aFloatArray4807[5] + aClass427_9403.aFloatArray4807[9] * (float) i_280_);
		float f_291_ = ((float) i_282_ * aClass427_9403.aFloatArray4807[5] + (aClass427_9403.aFloatArray4807[13] + (float) i_281_ * aClass427_9403.aFloatArray4807[1]) + (float) i_283_ * aClass427_9403.aFloatArray4807[9]);
		if (f_290_ < -f_286_ && f_291_ < -f_287_)
			i_284_ |= 0x4;
		if (f_290_ > f_286_ && f_291_ > f_287_)
			i_284_ |= 0x8;
		return i_284_;
	}

	boolean method3349(int i, int i_292_, int i_293_, int i_294_, Class432 class432, Class439 class439) {
		Class427 class427 = method3171();
		class427.method6784(class432);
		class427.method6751(aClass427_9403);
		return class439.method7097(i, i_292_, i_293_, i_294_, class427, aFloat9410, aFloat9412, aFloat9419, aFloat9395);
	}

	public void method3536(Class432 class432, Class169 class169, Class439 class439) {
		Class427 class427 = method3171();
		class427.method6784(class432);
		class427.method6751(aClass427_9403);
		class169.method2706(class439, aClass427_9402, class427, aFloat9410, aFloat9412, aFloat9419, aFloat9395);
	}

	public Class527_Sub27 method3298(int i) {
		return null;
	}

	public void method3190(Class527_Sub27 class527_sub27) {
		/* empty */
	}

	public Class147 method3161(int i, int i_295_, boolean bool, boolean bool_296_) {
		if (bool)
			return new Class147_Sub1_Sub2(this, i, i_295_);
		return new Class147_Sub1_Sub1(this, i, i_295_);
	}

	public void method3416(int i, Class178 class178) {
		for (int i_297_ = 0; i_297_ < aClass101Array9416.length; i_297_++) {
			aClass101Array9416[i_297_].anInt1195 = aClass101Array9416[i_297_].anInt1194 * 523461273;
			aClass101Array9416[i_297_].anInt1205 = -1687140521 * i;
			aClass101Array9416[i_297_].anInt1194 = 1892560347 * class178.anInt2055;
			aClass101Array9416[i_297_].anInt1198 = class178.anInt2050 * -1455708645;
			aClass101Array9416[i_297_].aBool1196 = true;
		}
	}

	public Class147 method3271(Class185 class185, boolean bool) {
		int i = class185.method3636();
		int i_298_ = class185.method3570();
		Class147_Sub1 class147_sub1;
		if (bool && !class185.method3568() && class185.method3567()) {
			Class185_Sub2 class185_sub2 = (Class185_Sub2) class185;
			int[] is = new int[class185_sub2.anIntArray9377.length];
			byte[] is_299_ = new byte[i * i_298_];
			for (int i_300_ = 0; i_300_ < i_298_; i_300_++) {
				int i_301_ = i_300_ * i;
				for (int i_302_ = 0; i_302_ < i; i_302_++)
					is_299_[i_301_ + i_302_] = class185_sub2.aByteArray9371[i_301_ + i_302_];
			}
			for (int i_303_ = 0; i_303_ < class185_sub2.anIntArray9377.length; i_303_++)
				is[i_303_] = class185_sub2.anIntArray9377[i_303_];
			class147_sub1 = new Class147_Sub1_Sub3(this, is_299_, is, i, i_298_);
		} else {
			int[] is = class185.method3584(false);
			if (class185.method3568())
				class147_sub1 = new Class147_Sub1_Sub2(this, is, i, i_298_);
			else
				class147_sub1 = new Class147_Sub1_Sub1(this, is, i, i_298_);
		}
		class147_sub1.method2405(class185.method3634(), class185.method3611(), class185.method3572(), class185.method3603());
		return class147_sub1;
	}

	public Class147 method3226(int i, int i_304_, int i_305_, int i_306_, boolean bool) {
		if (null == anIntArray9386)
			throw new IllegalStateException("");
		int[] is = new int[i_305_ * i_306_];
		int i_307_ = i + -1173855569 * anInt9387 * i_304_;
		int i_308_ = anInt9387 * -1173855569 - i_305_;
		for (int i_309_ = 0; i_309_ < i_306_; i_309_++) {
			int i_310_ = i_309_ * i_305_;
			for (int i_311_ = 0; i_311_ < i_305_; i_311_++)
				is[i_311_ + i_310_] = anIntArray9386[i_307_++];
			i_307_ += i_308_;
		}
		if (bool)
			return new Class147_Sub1_Sub2(this, is, i_305_, i_306_);
		return new Class147_Sub1_Sub1(this, is, i_305_, i_306_);
	}

	public int method3119() {
		return -1;
	}

	public void method3131() {
		anInt9383 = 0;
		anInt9392 = 0;
		anInt9391 = -370531355 * anInt9387;
		anInt9393 = -136163175 * anInt9388;
		method14828();
	}

	public Class174 method3170(Class22 class22, Class185[] class185s, boolean bool) {
		int[] is = new int[class185s.length];
		int[] is_312_ = new int[class185s.length];
		boolean bool_313_ = false;
		boolean bool_314_ = false;
		for (int i = 0; i < class185s.length; i++) {
			is[i] = class185s[i].method3636();
			is_312_[i] = class185s[i].method3570();
			if (class185s[i].method3568())
				bool_313_ = true;
			if (class185s[i].method3567())
				bool_314_ = true;
		}
		if (bool) {
			if (bool_314_) {
				if (bool_313_)
					return new Class174_Sub1(this, class22, (Class185_Sub2[]) class185s, is, is_312_);
				return new Class174_Sub4(this, class22, (Class185_Sub2[]) class185s, is, is_312_);
			}
			if (bool_313_)
				return new Class174_Sub1(this, class22, (Class185_Sub1[]) class185s, is, is_312_);
			return new Class174_Sub4(this, class22, (Class185_Sub1[]) class185s, is, is_312_);
		}
		if (bool_314_) {
			if (bool_313_)
				throw new IllegalArgumentException("");
			return new Class174_Sub3(this, class22, (Class185_Sub2[]) class185s, is, is_312_);
		}
		return new Class174_Sub2(this, class22, (Class185_Sub1[]) class185s, is, is_312_);
	}

	public void method3173(int i) {
		Class176_Sub2.anInt9206 = Class176_Sub2.anInt9166 = i;
		if (1413774429 * anInt9415 > 1)
			throw new IllegalStateException();
		method14880(anInt9415 * 1413774429);
		method14879(0);
	}

	void method14833(int i, int i_315_, int i_316_, int i_317_, int i_318_, int i_319_, int i_320_, int i_321_) {
		if (anIntArray9386 != null && (i_315_ >= -456655989 * anInt9392 && i_315_ < anInt9393 * -383695469)) {
			int i_322_ = i + i_315_ * (-1173855569 * anInt9387);
			int i_323_ = i_317_ >>> 24;
			int i_324_ = i_320_ + i_319_;
			int i_325_ = i_321_ % i_324_;
			if (0 == i_318_ || 1 == i_318_ && i_323_ == 255) {
				int i_326_ = 0;
				while (i_326_ < i_316_) {
					if (i + i_326_ >= 1605202751 * anInt9383 && i + i_326_ < 2014358275 * anInt9391 && i_325_ < i_319_)
						anIntArray9386[i_322_ + i_326_] = i_317_;
					i_326_++;
					i_325_ = ++i_325_ % i_324_;
				}
			} else if (1 == i_318_) {
				i_317_ = ((i_323_ << 24) + ((i_323_ * (i_317_ & 0xff00ff) >> 8 & 0xff00ff) + (i_323_ * (i_317_ & 0xff00) >> 8 & 0xff00)));
				int i_327_ = 256 - i_323_;
				int i_328_ = 0;
				while (i_328_ < i_316_) {
					if (i_328_ + i >= anInt9383 * 1605202751 && i + i_328_ < anInt9391 * 2014358275 && i_325_ < i_319_) {
						int i_329_ = anIntArray9386[i_322_ + i_328_];
						i_329_ = ((i_327_ * (i_329_ & 0xff00ff) >> 8 & 0xff00ff) + (i_327_ * (i_329_ & 0xff00) >> 8 & 0xff00));
						anIntArray9386[i_322_ + i_328_] = i_317_ + i_329_;
					}
					i_328_++;
					i_325_ = ++i_325_ % i_324_;
				}
			} else if (2 == i_318_) {
				int i_330_ = 0;
				while (i_330_ < i_316_) {
					if (i + i_330_ >= anInt9383 * 1605202751 && i_330_ + i < anInt9391 * 2014358275 && i_325_ < i_319_) {
						int i_331_ = anIntArray9386[i_322_ + i_330_];
						int i_332_ = i_317_ + i_331_;
						int i_333_ = (i_317_ & 0xff00ff) + (i_331_ & 0xff00ff);
						i_331_ = (i_332_ - i_333_ & 0x10000) + (i_333_ & 0x1000100);
						anIntArray9386[i_330_ + i_322_] = i_332_ - i_331_ | i_331_ - (i_331_ >>> 8);
					}
					i_330_++;
					i_325_ = ++i_325_ % i_324_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public int method3175(int i, int i_334_) {
		i |= 0x20800;
		return i & i_334_ ^ i_334_;
	}

	void method3079(int i, int i_335_) throws Exception_Sub1 {
		aClass171_Sub1_2073.method14727(i, i_335_);
		if (null != anInterface24_2085)
			anInterface24_2085.method19((byte) -123);
	}

	boolean method14834(int i) {
		Class163 class163 = aClass181_2059.method3544(i, (byte) -13);
		return 0 != class163.aByte1786 || 0 != class163.aByte1787;
	}

	public Class427 method3171() {
		Class101 class101 = method14835(Thread.currentThread());
		return class101.aClass427_1212;
	}

	public Class432 method3172() {
		Class101 class101 = method14835(Thread.currentThread());
		return class101.aClass432_1201;
	}

	public int method3188() {
		return 0;
	}

	public void method3333(float f, float f_336_, float f_337_, float[] fs) {
		float f_338_ = (aClass427_9403.aFloatArray4807[7] * f_336_ + (aClass427_9403.aFloatArray4807[3] * f + aClass427_9403.aFloatArray4807[15]) + f_337_ * aClass427_9403.aFloatArray4807[11]);
		float f_339_ = (f * aClass427_9403.aFloatArray4807[0] + aClass427_9403.aFloatArray4807[12] + f_336_ * aClass427_9403.aFloatArray4807[4] + f_337_ * aClass427_9403.aFloatArray4807[8]);
		float f_340_ = (aClass427_9403.aFloatArray4807[1] * f + aClass427_9403.aFloatArray4807[13] + aClass427_9403.aFloatArray4807[5] * f_336_ + f_337_ * aClass427_9403.aFloatArray4807[9]);
		float f_341_ = (f_336_ * aClass427_9398.aFloatArray4807[6] + (aClass427_9398.aFloatArray4807[14] + f * aClass427_9398.aFloatArray4807[2]) + aClass427_9398.aFloatArray4807[10] * f_337_);
		fs[0] = aFloat9410 + f_339_ * aFloat9419 / f_338_;
		fs[1] = aFloat9395 * f_340_ / f_338_ + aFloat9412;
		fs[2] = f_341_;
	}

	public void method3158(int i, Class527_Sub16[] class527_sub16s) {
		/* empty */
	}

	public void method3280(boolean bool) {
		Class101 class101 = method14835(Thread.currentThread());
		class101.aBool1227 = bool;
	}

	public Class179 method3324(int i) {
		return null;
	}

	Class101 method14835(Runnable runnable) {
		for (int i = 0; i < 1413774429 * anInt9415; i++) {
			if (aClass101Array9416[i].aRunnable1189 == runnable)
				return aClass101Array9416[i];
		}
		return null;
	}

	public void method3179(Class182 class182) {
		method14836(null != anIntArray9386, aFloatArray9389 != null, false, class182);
	}

	void method14836(boolean bool, boolean bool_342_, boolean bool_343_, Class182 class182) {
		Class101 class101 = method14835(Thread.currentThread());
		for (Class522_Sub6_Sub1 class522_sub6_sub1 = ((Class522_Sub6_Sub1) class182.aClass710_2094.method14400(340824690)); class522_sub6_sub1 != null; class522_sub6_sub1 = ((Class522_Sub6_Sub1) class182.aClass710_2094.method14399(706802838))) {
			int i = class522_sub6_sub1.anInt11411 >> 12;
			int i_344_ = class522_sub6_sub1.anInt11407 >> 12;
			int i_345_ = class522_sub6_sub1.anInt11403 >> 12;
			float f = (aClass427_9403.aFloatArray4807[14] + (aClass427_9403.aFloatArray4807[10] * (float) i_345_ + ((float) i * aClass427_9403.aFloatArray4807[2] + (aClass427_9403.aFloatArray4807[6] * (float) i_344_))));
			float f_346_ = ((float) i_344_ * aClass427_9403.aFloatArray4807[7] + aClass427_9403.aFloatArray4807[3] * (float) i + (float) i_345_ * aClass427_9403.aFloatArray4807[11] + aClass427_9403.aFloatArray4807[15]);
			if (!(f < -f_346_)) {
				float f_347_ = aFloat9405 * f / f_346_ + aFloat9414;
				if (!(f > class101.aFloat1192)) {
					float f_348_ = (aClass427_9403.aFloatArray4807[12] + ((aClass427_9403.aFloatArray4807[8] * (float) i_345_) + (((float) i_344_ * aClass427_9403.aFloatArray4807[4]) + (aClass427_9403.aFloatArray4807[0] * (float) i))));
					float f_349_ = (aClass427_9403.aFloatArray4807[9] * (float) i_345_ + (aClass427_9403.aFloatArray4807[1] * (float) i + ((float) i_344_ * aClass427_9403.aFloatArray4807[5])) + aClass427_9403.aFloatArray4807[13]);
					if (!(f_348_ < -f_346_) && !(f_348_ > f_346_) && !(f_349_ < -f_346_) && !(f_349_ > f_346_)) {
						float f_350_ = (float) class522_sub6_sub1.anInt11408 / 4096.0F;
						float f_351_ = (aClass427_9402.aFloatArray4807[0] * f_350_ + f_348_);
						float f_352_ = (f_346_ + aClass427_9402.aFloatArray4807[3] * f_350_);
						float f_353_ = aFloat9410 + aFloat9419 * f_348_ / f_346_;
						float f_354_ = aFloat9412 + f_349_ * aFloat9395 / f_346_;
						float f_355_ = f_351_ * aFloat9419 / f_352_ + aFloat9410;
						method14837(bool, bool_342_, bool_343_, class522_sub6_sub1, (int) f_353_, (int) f_354_, f_347_, (int) (f_355_ < f_353_ ? f_353_ - f_355_ : f_355_ - f_353_));
					}
				}
			}
		}
	}

	void method14837(boolean bool, boolean bool_356_, boolean bool_357_, Class522_Sub6_Sub1 class522_sub6_sub1, int i, int i_358_, float f, int i_359_) {
		int i_360_ = class522_sub6_sub1.anInt11410;
		int i_361_ = i_359_;
		i_359_ <<= 1;
		if (i_360_ == -1)
			method14838(bool_356_, i, i_358_, f, i_361_, class522_sub6_sub1.anInt11409, 1);
		else {
			if (i_360_ != anInt9418 * -1948774645) {
				Class147 class147 = (Class147) aClass205_9400.method3787((long) i_360_);
				if (class147 == null) {
					Class163 class163 = aClass181_2059.method3544(i_360_, (byte) -74);
					int[] is = method14841(i_360_);
					if (is != null) {
						int i_362_ = class163.anInt1780 * 1039262975;
						class147 = method3163(is, 0, i_362_, i_362_, i_362_, 345803263);
						aClass205_9400.method3790(class147, (long) i_360_);
					} else
						return;
				}
				anInt9418 = i_360_ * -134298461;
				aClass147_9396 = class147;
			}
			i_359_++;
			((Class147_Sub1) aClass147_9396).method14430(bool, bool_356_, bool_357_, i - i_361_, i_358_ - i_361_, f, i_359_, i_359_, 0, (class522_sub6_sub1.anInt11409), 1, 1, false);
		}
	}

	public void method3342(int i) {
		Class176_Sub2.anInt9206 = Class176_Sub2.anInt9166 = i;
		if (1413774429 * anInt9415 > 1)
			throw new IllegalStateException();
		method14880(anInt9415 * 1413774429);
		method14879(0);
	}

	void method14838(boolean bool, int i, int i_363_, float f, int i_364_, int i_365_, int i_366_) {
		if (anIntArray9386 != null) {
			if (i_364_ < 0)
				i_364_ = -i_364_;
			int i_367_ = i_363_ - i_364_;
			if (i_367_ < -456655989 * anInt9392)
				i_367_ = anInt9392 * -456655989;
			int i_368_ = 1 + (i_363_ + i_364_);
			if (i_368_ > anInt9393 * -383695469)
				i_368_ = anInt9393 * -383695469;
			int i_369_ = i_367_;
			int i_370_ = i_364_ * i_364_;
			int i_371_ = 0;
			int i_372_ = i_363_ - i_369_;
			int i_373_ = i_372_ * i_372_;
			int i_374_ = i_373_ - i_372_;
			if (i_363_ > i_368_)
				i_363_ = i_368_;
			int i_375_ = i_365_ >>> 24;
			if (0 == i_366_ || 1 == i_366_ && 255 == i_375_) {
				while (i_369_ < i_363_) {
					for (/**/; i_374_ <= i_370_ || i_373_ <= i_370_; i_374_ += i_371_++ + i_371_)
						i_373_ += i_371_ + i_371_;
					int i_376_ = i - i_371_ + 1;
					if (i_376_ < 1605202751 * anInt9383)
						i_376_ = anInt9383 * 1605202751;
					int i_377_ = i_371_ + i;
					if (i_377_ > 2014358275 * anInt9391)
						i_377_ = anInt9391 * 2014358275;
					int i_378_ = i_369_ * (anInt9387 * -1173855569) + i_376_;
					for (int i_379_ = i_376_; i_379_ < i_377_; i_379_++) {
						if (!bool || f < aFloatArray9389[i_378_])
							anIntArray9386[i_378_] = i_365_;
						i_378_++;
					}
					i_369_++;
					i_373_ -= i_372_-- + i_372_;
					i_374_ -= i_372_ + i_372_;
				}
				i_371_ = i_364_;
				i_372_ = i_369_ - i_363_;
				i_374_ = i_372_ * i_372_ + i_370_;
				i_373_ = i_374_ - i_371_;
				i_374_ -= i_372_;
				while (i_369_ < i_368_) {
					for (/**/; i_374_ > i_370_ && i_373_ > i_370_; i_373_ -= i_371_ + i_371_)
						i_374_ -= i_371_-- + i_371_;
					int i_380_ = i - i_371_;
					if (i_380_ < anInt9383 * 1605202751)
						i_380_ = 1605202751 * anInt9383;
					int i_381_ = i_371_ + i;
					if (i_381_ > 2014358275 * anInt9391 - 1)
						i_381_ = 2014358275 * anInt9391 - 1;
					int i_382_ = i_380_ + anInt9387 * -1173855569 * i_369_;
					for (int i_383_ = i_380_; i_383_ <= i_381_; i_383_++) {
						if (!bool || f < aFloatArray9389[i_382_])
							anIntArray9386[i_382_] = i_365_;
						i_382_++;
					}
					i_369_++;
					i_374_ += i_372_ + i_372_;
					i_373_ += i_372_++ + i_372_;
				}
			} else if (i_366_ == 1) {
				i_365_ = (i_375_ << 24) + (((i_365_ & 0xff00) * i_375_ >> 8 & 0xff00) + (i_375_ * (i_365_ & 0xff00ff) >> 8 & 0xff00ff));
				int i_384_ = 256 - i_375_;
				while (i_369_ < i_363_) {
					for (/**/; i_374_ <= i_370_ || i_373_ <= i_370_; i_374_ += i_371_++ + i_371_)
						i_373_ += i_371_ + i_371_;
					int i_385_ = 1 + (i - i_371_);
					if (i_385_ < anInt9383 * 1605202751)
						i_385_ = anInt9383 * 1605202751;
					int i_386_ = i_371_ + i;
					if (i_386_ > 2014358275 * anInt9391)
						i_386_ = 2014358275 * anInt9391;
					int i_387_ = i_385_ + i_369_ * (-1173855569 * anInt9387);
					for (int i_388_ = i_385_; i_388_ < i_386_; i_388_++) {
						if (!bool || f < aFloatArray9389[i_387_]) {
							int i_389_ = anIntArray9386[i_387_];
							i_389_ = (((i_389_ & 0xff00ff) * i_384_ >> 8 & 0xff00ff) + ((i_389_ & 0xff00) * i_384_ >> 8 & 0xff00));
							anIntArray9386[i_387_] = i_389_ + i_365_;
						}
						i_387_++;
					}
					i_369_++;
					i_373_ -= i_372_-- + i_372_;
					i_374_ -= i_372_ + i_372_;
				}
				i_371_ = i_364_;
				i_372_ = -i_372_;
				i_374_ = i_370_ + i_372_ * i_372_;
				i_373_ = i_374_ - i_371_;
				i_374_ -= i_372_;
				while (i_369_ < i_368_) {
					for (/**/; i_374_ > i_370_ && i_373_ > i_370_; i_373_ -= i_371_ + i_371_)
						i_374_ -= i_371_-- + i_371_;
					int i_390_ = i - i_371_;
					if (i_390_ < 1605202751 * anInt9383)
						i_390_ = 1605202751 * anInt9383;
					int i_391_ = i_371_ + i;
					if (i_391_ > anInt9391 * 2014358275 - 1)
						i_391_ = 2014358275 * anInt9391 - 1;
					int i_392_ = i_390_ + i_369_ * (anInt9387 * -1173855569);
					for (int i_393_ = i_390_; i_393_ <= i_391_; i_393_++) {
						if (!bool || f < aFloatArray9389[i_392_]) {
							int i_394_ = anIntArray9386[i_392_];
							i_394_ = (((i_394_ & 0xff00) * i_384_ >> 8 & 0xff00) + ((i_394_ & 0xff00ff) * i_384_ >> 8 & 0xff00ff));
							anIntArray9386[i_392_] = i_365_ + i_394_;
						}
						i_392_++;
					}
					i_369_++;
					i_374_ += i_372_ + i_372_;
					i_373_ += i_372_++ + i_372_;
				}
			} else if (2 == i_366_) {
				while (i_369_ < i_363_) {
					for (/**/; i_374_ <= i_370_ || i_373_ <= i_370_; i_374_ += i_371_++ + i_371_)
						i_373_ += i_371_ + i_371_;
					int i_395_ = i - i_371_ + 1;
					if (i_395_ < 1605202751 * anInt9383)
						i_395_ = 1605202751 * anInt9383;
					int i_396_ = i + i_371_;
					if (i_396_ > anInt9391 * 2014358275)
						i_396_ = anInt9391 * 2014358275;
					int i_397_ = i_369_ * (-1173855569 * anInt9387) + i_395_;
					for (int i_398_ = i_395_; i_398_ < i_396_; i_398_++) {
						if (!bool || f < aFloatArray9389[i_397_]) {
							int i_399_ = anIntArray9386[i_397_];
							int i_400_ = i_399_ + i_365_;
							int i_401_ = (i_365_ & 0xff00ff) + (i_399_ & 0xff00ff);
							i_399_ = (i_400_ - i_401_ & 0x10000) + (i_401_ & 0x1000100);
							anIntArray9386[i_397_] = i_400_ - i_399_ | i_399_ - (i_399_ >>> 8);
						}
						i_397_++;
					}
					i_369_++;
					i_373_ -= i_372_-- + i_372_;
					i_374_ -= i_372_ + i_372_;
				}
				i_371_ = i_364_;
				i_372_ = -i_372_;
				i_374_ = i_372_ * i_372_ + i_370_;
				i_373_ = i_374_ - i_371_;
				i_374_ -= i_372_;
				while (i_369_ < i_368_) {
					for (/**/; i_374_ > i_370_ && i_373_ > i_370_; i_373_ -= i_371_ + i_371_)
						i_374_ -= i_371_-- + i_371_;
					int i_402_ = i - i_371_;
					if (i_402_ < anInt9383 * 1605202751)
						i_402_ = 1605202751 * anInt9383;
					int i_403_ = i_371_ + i;
					if (i_403_ > 2014358275 * anInt9391 - 1)
						i_403_ = 2014358275 * anInt9391 - 1;
					int i_404_ = anInt9387 * -1173855569 * i_369_ + i_402_;
					for (int i_405_ = i_402_; i_405_ <= i_403_; i_405_++) {
						if (!bool || f < aFloatArray9389[i_404_]) {
							int i_406_ = anIntArray9386[i_404_];
							int i_407_ = i_406_ + i_365_;
							int i_408_ = (i_365_ & 0xff00ff) + (i_406_ & 0xff00ff);
							i_406_ = (i_408_ & 0x1000100) + (i_407_ - i_408_ & 0x10000);
							anIntArray9386[i_404_] = i_407_ - i_406_ | i_406_ - (i_406_ >>> 8);
						}
						i_404_++;
					}
					i_369_++;
					i_374_ += i_372_ + i_372_;
					i_373_ += i_372_++ + i_372_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public void method3180(Class432 class432) {
		aClass432_9420 = class432;
		method14839();
	}

	public Class432 method3181() {
		return new Class432(aClass432_9420);
	}

	Class180_Sub1(Class181 class181, Interface24 interface24, Interface48 interface48, Interface46 interface46, Interface49 interface49) {
		super(class181, interface24, interface48, interface46, interface49);
		aBool9401 = false;
		anInt9383 = 0;
		anInt9391 = 0;
		anInt9392 = 0;
		anInt9393 = 0;
		anInt9397 = 283874821;
		anInt9408 = -805367226;
		anInt9399 = -381393234;
		aFloatArrayArray9404 = new float[6][4];
		aFloat9405 = 1.0F;
		aFloat9414 = 0.0F;
		aClass205_9400 = new Class205(16);
		anInt9418 = 134298461;
		try {
			aClass205_9417 = new Class205(10485760, 256);
			aClass432_9420 = new Class432();
			aClass427_9398 = new Class427();
			aClass427_9402 = new Class427();
			aClass427_9403 = new Class427();
			method14880(1);
			method14879(0);
			Class25.method851(true, true, (byte) 3);
			aBool9401 = true;
			anInt9384 = (int) Class234.method4347(-1408626088) * -925120255;
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			method3081((byte) 27);
			throw new RuntimeException("");
		}
	}

	public Class427 method3364() {
		return new Class427(aClass427_9402);
	}

	public void method3478(float f) {
		anInt9399 = (int) (f * 65535.0F) * -567317463;
	}

	public void method3157(int i, float f, float f_409_, float f_410_, float f_411_, float f_412_) {
		anInt9397 = (int) (65535.0F * f) * 1717693179;
		anInt9408 = -300169701 * (int) (f_409_ * 65535.0F);
		float f_413_ = (float) Math.sqrt((double) (f_411_ * f_411_ + f_410_ * f_410_ + f_412_ * f_412_));
		anInt9413 = (int) (65535.0F * f_410_ / f_413_) * 1203059775;
		anInt9409 = (int) (f_411_ * 65535.0F / f_413_) * 658553925;
		anInt9394 = 1070820009 * (int) (65535.0F * f_412_ / f_413_);
	}

	public void method3535(int i) {
		/* empty */
	}

	public void method3182(boolean bool) {
		Class101 class101 = method14835(Thread.currentThread());
		class101.aBool1227 = bool;
	}

	void method14839() {
		aClass427_9398.method6784(aClass432_9420);
		aClass427_9403.method6750(aClass427_9398);
		aClass427_9403.method6751(aClass427_9402);
		aClass427_9403.method6760(aFloatArrayArray9404[0]);
		aClass427_9403.method6761(aFloatArrayArray9404[1]);
		aClass427_9403.method6756(aFloatArrayArray9404[2]);
		aClass427_9403.method6757(aFloatArrayArray9404[3]);
		aClass427_9403.method6758(aFloatArrayArray9404[4]);
		aClass427_9403.method6779(aFloatArrayArray9404[5]);
		float f = aClass427_9402.method6755();
		float f_414_ = (aClass427_9402.aFloatArray4807[10] * (f - 255.0F) + aClass427_9402.aFloatArray4807[14]);
		float f_415_ = (aClass427_9402.aFloatArray4807[10] * f + aClass427_9402.aFloatArray4807[14]);
		float f_416_ = f_415_ - f_414_;
		for (int i = 0; i < 1413774429 * anInt9415; i++) {
			Class101 class101 = aClass101Array9416[i];
			class101.aFloat1192 = f_414_;
			class101.aFloat1193 = f_416_;
		}
	}

	public Class179 method3191(int i) {
		return null;
	}

	public Class179 method3409(Class179 class179, Class179 class179_417_, float f, Class179 class179_418_) {
		return null;
	}

	public void method3193(Class179 class179) {
		/* empty */
	}

	public void method3509(Class182 class182) {
		method14836(null != anIntArray9386, aFloatArray9389 != null, false, class182);
	}

	public void method3195(int i, int i_419_) {
		/* empty */
	}

	public boolean method3196() {
		return false;
	}

	public Class143 method3220() {
		return new Class143(0, "Pure Java", 1, "CPU", 0L, false);
	}

	public void method3198(float f, float f_420_, float f_421_, float f_422_, float f_423_) {
		/* empty */
	}

	public void method3495(int[] is) {
		is[0] = anInt9383 * 1605202751;
		is[1] = -456655989 * anInt9392;
		is[2] = anInt9391 * 2014358275;
		is[3] = -383695469 * anInt9393;
	}

	void method14840(boolean bool, boolean bool_424_, boolean bool_425_, int i, int i_426_, float f, int i_427_, int i_428_, short i_429_, int i_430_, int i_431_, int i_432_) {
		if (0 != i_427_ && 0 != i_428_) {
			if (i_429_ != -1) {
				Class163 class163 = aClass181_2059.method3544(i_429_, (byte) -92);
				if (!class163.aBool1806) {
					if (i_429_ != anInt9418 * -1948774645) {
						Class147 class147 = ((Class147) aClass205_9400.method3787((long) i_429_));
						if (null == class147) {
							int[] is = method14841(i_429_);
							if (is == null)
								return;
							int i_433_ = class163.anInt1780 * 1039262975;
							class147 = method3163(is, 0, i_433_, i_433_, i_433_, -1617949356);
							aClass205_9400.method3790(class147, (long) i_429_);
						}
						anInt9418 = i_429_ * -134298461;
						aClass147_9396 = class147;
					}
					((Class147_Sub1) aClass147_9396).method14430(bool, bool_424_, bool_425_, i - i_427_, i_426_ - i_428_, f, i_427_ << 1, i_428_ << 1, i_431_, i_430_, i_432_, 1, Class595.aClass595_7814 != class163.aClass595_1784);
					return;
				}
			}
			method14838(bool_424_, i, i_426_, f, i_427_, i_430_, i_432_);
		}
	}

	public boolean method3244() {
		return false;
	}

	public boolean method3202() {
		return false;
	}

	public void method3203() {
		/* empty */
	}

	public Class161 method3085(int i, int i_434_, int[][] is, int[][] is_435_, int i_436_, int i_437_, int i_438_) {
		return new Class161_Sub1(this, i_437_, i_438_, i, i_434_, is, is_435_, i_436_);
	}

	int[] method14841(int i) {
		Class527_Sub19 class527_sub19;
		synchronized (aClass205_9417) {
			class527_sub19 = ((Class527_Sub19) aClass205_9417.method3787((long) (i & 0xffff) | ~0x7fffffffffffffffL));
			if (class527_sub19 == null) {
				Class163 class163 = aClass181_2059.method3544(i, (byte) 6);
				int i_439_ = class163.anInt1780 * 1039262975;
				if (!anInterface24_2085.method134(Class609.aClass609_7996, i, Class591.aClass591_7796, 0.7F, i_439_, i_439_, true, -586322568)) {
					int[] is = null;
					return is;
				}
				int[] is;
				if (Class595.aClass595_7816 != class163.aClass595_1784)
					is = anInterface24_2085.method133(Class609.aClass609_7996, i, 0.7F, i_439_, i_439_, true, 701419490);
				else
					is = anInterface24_2085.method132(Class609.aClass609_7996, i, 0.7F, i_439_, i_439_, true, (byte) -88);
				class527_sub19 = new Class527_Sub19(i, i_439_, is, (class163.aClass595_1784 != Class595.aClass595_7815));
				aClass205_9417.method3813(class527_sub19, ((long) (i & 0xffff) | ~0x7fffffffffffffffL), i_439_ * i_439_, 1980047065);
			}
		}
		class527_sub19.aBool10479 = true;
		return class527_sub19.method16205();
	}

	public void method3207(int i, Class178 class178) {
		for (int i_440_ = 0; i_440_ < aClass101Array9416.length; i_440_++) {
			aClass101Array9416[i_440_].anInt1195 = aClass101Array9416[i_440_].anInt1194 * 523461273;
			aClass101Array9416[i_440_].anInt1205 = -1687140521 * i;
			aClass101Array9416[i_440_].anInt1194 = 1892560347 * class178.anInt2055;
			aClass101Array9416[i_440_].anInt1198 = class178.anInt2050 * -1455708645;
			aClass101Array9416[i_440_].aBool1196 = true;
		}
	}

	public void method3144(int i, Class178 class178) {
		Class101 class101 = method14835(Thread.currentThread());
		class101.anInt1205 = -1687140521 * i;
		class101.anInt1194 = 1892560347 * class178.anInt2055;
		class101.anInt1198 = -1455708645 * class178.anInt2050;
	}

	public void method3194() {
		for (int i = 0; i < aClass101Array9416.length; i++) {
			aClass101Array9416[i].anInt1194 = aClass101Array9416[i].anInt1195 * -228732503;
			aClass101Array9416[i].aBool1196 = false;
		}
	}

	public void method3076(int i, int i_441_, float f, int i_442_, int i_443_, float f_444_, int i_445_, int i_446_, float f_447_, int i_448_, int i_449_, int i_450_, int i_451_) {
		boolean bool = null != anIntArray9386;
		boolean bool_452_ = aFloatArray9389 != null;
		if (bool || bool_452_) {
			Class101 class101 = method14835(Thread.currentThread());
			Class119 class119 = class101.aClass119_1197;
			class119.aBool1467 = false;
			i -= anInt9383 * 1605202751;
			i_442_ -= 1605202751 * anInt9383;
			i_445_ -= 1605202751 * anInt9383;
			i_441_ -= anInt9392 * -456655989;
			i_443_ -= anInt9392 * -456655989;
			i_446_ -= anInt9392 * -456655989;
			class119.aBool1445 = (i < 0 || i > class119.anInt1442 || i_442_ < 0 || i_442_ > class119.anInt1442 || i_445_ < 0 || i_445_ > class119.anInt1442);
			int i_453_ = i_448_ >>> 24;
			if (0 == i_451_ || i_451_ == 1 && 255 == i_453_) {
				class119.anInt1441 = 0;
				class119.aBool1443 = false;
				class119.method2106(bool, bool_452_, false, (float) i_441_, (float) i_443_, (float) i_446_, (float) i, (float) i_442_, (float) i_445_, f, f_444_, f_447_, i_448_, i_449_, i_450_);
			} else if (1 == i_451_) {
				class119.anInt1441 = 255 - i_453_;
				class119.aBool1443 = false;
				class119.method2106(bool, bool_452_, false, (float) i_441_, (float) i_443_, (float) i_446_, (float) i, (float) i_442_, (float) i_445_, f, f_444_, f_447_, i_448_, i_449_, i_450_);
			} else if (i_451_ == 2) {
				class119.anInt1441 = 128;
				class119.aBool1443 = true;
				class119.method2106(bool, bool_452_, false, (float) i_441_, (float) i_443_, (float) i_446_, (float) i, (float) i_442_, (float) i_445_, f, f_444_, f_447_, i_448_, i_449_, i_450_);
			} else
				throw new IllegalArgumentException();
			class119.aBool1467 = true;
		}
	}

	void method14842(int i, int i_454_, int[] is, float[] fs) {
		anInt9387 = i * 1107440719;
		anInt9388 = -197273773 * i_454_;
		anIntArray9386 = is;
		aFloatArray9389 = fs;
		for (int i_455_ = 0; i_455_ < 1413774429 * anInt9415; i_455_++)
			aClass101Array9416[i_455_].method1777((byte) -42);
		method3131();
		method3127();
	}

	public void method3210(float f, float f_456_, float f_457_, float[] fs) {
		float f_458_ = (aClass427_9403.aFloatArray4807[14] + f * aClass427_9403.aFloatArray4807[2] + aClass427_9403.aFloatArray4807[6] * f_456_ + aClass427_9403.aFloatArray4807[10] * f_457_);
		float f_459_ = (aClass427_9403.aFloatArray4807[7] * f_456_ + (aClass427_9403.aFloatArray4807[15] + aClass427_9403.aFloatArray4807[3] * f) + f_457_ * aClass427_9403.aFloatArray4807[11]);
		if (f_458_ < -f_459_ || f_458_ > f_459_) {
			float[] fs_460_ = fs;
			float[] fs_461_ = fs;
			fs[2] = Float.NaN;
			fs_461_[1] = Float.NaN;
			fs_460_[0] = Float.NaN;
		} else {
			float f_462_ = (f_457_ * aClass427_9403.aFloatArray4807[8] + (f_456_ * aClass427_9403.aFloatArray4807[4] + (aClass427_9403.aFloatArray4807[12] + f * aClass427_9403.aFloatArray4807[0])));
			if (f_462_ < -f_459_ || f_462_ > f_459_) {
				float[] fs_463_ = fs;
				float[] fs_464_ = fs;
				fs[2] = Float.NaN;
				fs_464_[1] = Float.NaN;
				fs_463_[0] = Float.NaN;
			} else {
				float f_465_ = (aClass427_9403.aFloatArray4807[5] * f_456_ + (aClass427_9403.aFloatArray4807[13] + f * aClass427_9403.aFloatArray4807[1]) + f_457_ * aClass427_9403.aFloatArray4807[9]);
				if (f_465_ < -f_459_ || f_465_ > f_459_) {
					float[] fs_466_ = fs;
					float[] fs_467_ = fs;
					fs[2] = Float.NaN;
					fs_467_[1] = Float.NaN;
					fs_466_[0] = Float.NaN;
				} else {
					float f_468_ = (f_456_ * aClass427_9398.aFloatArray4807[6] + (aClass427_9398.aFloatArray4807[2] * f + aClass427_9398.aFloatArray4807[14]) + aClass427_9398.aFloatArray4807[10] * f_457_);
					fs[0] = f_462_ * aFloat9419 / f_459_ + aFloat9410;
					fs[1] = aFloat9412 + f_465_ * aFloat9395 / f_459_;
					fs[2] = f_468_;
				}
			}
		}
	}

	public void method3127() {
		anInt9407 = 0;
		anInt9406 = 0;
		anInt9390 = anInt9387 * 896585021;
		anInt9385 = anInt9388 * 896145763;
		method14828();
	}

	Interface21 method14843(int i, int i_469_) {
		return new Class98(i, i_469_);
	}

	public Interface21 method3419(int i, int i_470_, Class157 class157, Class184 class184, int i_471_) {
		return method14843(i, i_470_);
	}

	int[] method14844(int i) {
		Class527_Sub19 class527_sub19;
		synchronized (aClass205_9417) {
			class527_sub19 = ((Class527_Sub19) aClass205_9417.method3787((long) (i & 0xffff) | ~0x7fffffffffffffffL));
			if (class527_sub19 == null) {
				Class163 class163 = aClass181_2059.method3544(i, (byte) -122);
				int i_472_ = class163.anInt1780 * 1039262975;
				if (!anInterface24_2085.method134(Class609.aClass609_7996, i, Class591.aClass591_7796, 0.7F, i_472_, i_472_, true, 286738556)) {
					int[] is = null;
					return is;
				}
				int[] is;
				if (Class595.aClass595_7816 != class163.aClass595_1784)
					is = anInterface24_2085.method133(Class609.aClass609_7996, i, 0.7F, i_472_, i_472_, true, 240386071);
				else
					is = anInterface24_2085.method132(Class609.aClass609_7996, i, 0.7F, i_472_, i_472_, true, (byte) 23);
				class527_sub19 = new Class527_Sub19(i, i_472_, is, (class163.aClass595_1784 != Class595.aClass595_7815));
				aClass205_9417.method3813(class527_sub19, ((long) (i & 0xffff) | ~0x7fffffffffffffffL), i_472_ * i_472_, 2080706810);
			}
		}
		class527_sub19.aBool10479 = true;
		return class527_sub19.method16205();
	}

	public Interface23 method3156(int i, int i_473_, int i_474_) {
		return new Class117(i, i_473_);
	}

	public Class143 method3217() {
		return new Class143(0, "Pure Java", 1, "CPU", 0L, false);
	}

	public Class161 method3353(int i, int i_475_, int[][] is, int[][] is_476_, int i_477_, int i_478_, int i_479_) {
		return new Class161_Sub1(this, i_478_, i_479_, i, i_475_, is, is_476_, i_477_);
	}

	public Class143 method3370() {
		return new Class143(0, "Pure Java", 1, "CPU", 0L, false);
	}

	void method3529(int i, int i_480_, int i_481_, int i_482_, int i_483_) {
		if (anIntArray9386 != null) {
			if (i_481_ < 0)
				i_481_ = -i_481_;
			int i_484_ = i_480_ - i_481_;
			if (i_484_ < -456655989 * anInt9392)
				i_484_ = anInt9392 * -456655989;
			int i_485_ = 1 + (i_481_ + i_480_);
			if (i_485_ > anInt9393 * -383695469)
				i_485_ = anInt9393 * -383695469;
			int i_486_ = i_484_;
			int i_487_ = i_481_ * i_481_;
			int i_488_ = 0;
			int i_489_ = i_480_ - i_486_;
			int i_490_ = i_489_ * i_489_;
			int i_491_ = i_490_ - i_489_;
			if (i_480_ > i_485_)
				i_480_ = i_485_;
			int i_492_ = i_482_ >>> 24;
			if (i_483_ == 0 || i_483_ == 1 && i_492_ == 255) {
				while (i_486_ < i_480_) {
					for (/**/; i_491_ <= i_487_ || i_490_ <= i_487_; i_491_ += i_488_++ + i_488_)
						i_490_ += i_488_ + i_488_;
					int i_493_ = i - i_488_ + 1;
					if (i_493_ < anInt9383 * 1605202751)
						i_493_ = anInt9383 * 1605202751;
					int i_494_ = i + i_488_;
					if (i_494_ > 2014358275 * anInt9391)
						i_494_ = 2014358275 * anInt9391;
					int i_495_ = i_493_ + i_486_ * (anInt9387 * -1173855569);
					for (int i_496_ = i_493_; i_496_ < i_494_; i_496_++)
						anIntArray9386[i_495_++] = i_482_;
					i_486_++;
					i_490_ -= i_489_-- + i_489_;
					i_491_ -= i_489_ + i_489_;
				}
				i_488_ = i_481_;
				i_489_ = i_486_ - i_480_;
				i_491_ = i_487_ + i_489_ * i_489_;
				i_490_ = i_491_ - i_488_;
				i_491_ -= i_489_;
				while (i_486_ < i_485_) {
					for (/**/; i_491_ > i_487_ && i_490_ > i_487_; i_490_ -= i_488_ + i_488_)
						i_491_ -= i_488_-- + i_488_;
					int i_497_ = i - i_488_;
					if (i_497_ < 1605202751 * anInt9383)
						i_497_ = 1605202751 * anInt9383;
					int i_498_ = i_488_ + i;
					if (i_498_ > 2014358275 * anInt9391 - 1)
						i_498_ = 2014358275 * anInt9391 - 1;
					int i_499_ = i_486_ * (-1173855569 * anInt9387) + i_497_;
					for (int i_500_ = i_497_; i_500_ <= i_498_; i_500_++)
						anIntArray9386[i_499_++] = i_482_;
					i_486_++;
					i_491_ += i_489_ + i_489_;
					i_490_ += i_489_++ + i_489_;
				}
			} else if (1 == i_483_) {
				i_482_ = ((i_492_ << 24) + ((i_492_ * (i_482_ & 0xff00ff) >> 8 & 0xff00ff) + (i_492_ * (i_482_ & 0xff00) >> 8 & 0xff00)));
				int i_501_ = 256 - i_492_;
				while (i_486_ < i_480_) {
					for (/**/; i_491_ <= i_487_ || i_490_ <= i_487_; i_491_ += i_488_++ + i_488_)
						i_490_ += i_488_ + i_488_;
					int i_502_ = 1 + (i - i_488_);
					if (i_502_ < 1605202751 * anInt9383)
						i_502_ = anInt9383 * 1605202751;
					int i_503_ = i_488_ + i;
					if (i_503_ > 2014358275 * anInt9391)
						i_503_ = anInt9391 * 2014358275;
					int i_504_ = i_502_ + -1173855569 * anInt9387 * i_486_;
					for (int i_505_ = i_502_; i_505_ < i_503_; i_505_++) {
						int i_506_ = anIntArray9386[i_504_];
						i_506_ = ((i_501_ * (i_506_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_506_ & 0xff00) * i_501_ >> 8 & 0xff00));
						anIntArray9386[i_504_++] = i_506_ + i_482_;
					}
					i_486_++;
					i_490_ -= i_489_-- + i_489_;
					i_491_ -= i_489_ + i_489_;
				}
				i_488_ = i_481_;
				i_489_ = -i_489_;
				i_491_ = i_487_ + i_489_ * i_489_;
				i_490_ = i_491_ - i_488_;
				i_491_ -= i_489_;
				while (i_486_ < i_485_) {
					for (/**/; i_491_ > i_487_ && i_490_ > i_487_; i_490_ -= i_488_ + i_488_)
						i_491_ -= i_488_-- + i_488_;
					int i_507_ = i - i_488_;
					if (i_507_ < anInt9383 * 1605202751)
						i_507_ = anInt9383 * 1605202751;
					int i_508_ = i_488_ + i;
					if (i_508_ > 2014358275 * anInt9391 - 1)
						i_508_ = anInt9391 * 2014358275 - 1;
					int i_509_ = i_486_ * (anInt9387 * -1173855569) + i_507_;
					for (int i_510_ = i_507_; i_510_ <= i_508_; i_510_++) {
						int i_511_ = anIntArray9386[i_509_];
						i_511_ = ((i_501_ * (i_511_ & 0xff00) >> 8 & 0xff00) + ((i_511_ & 0xff00ff) * i_501_ >> 8 & 0xff00ff));
						anIntArray9386[i_509_++] = i_511_ + i_482_;
					}
					i_486_++;
					i_491_ += i_489_ + i_489_;
					i_490_ += i_489_++ + i_489_;
				}
			} else if (i_483_ == 2) {
				while (i_486_ < i_480_) {
					for (/**/; i_491_ <= i_487_ || i_490_ <= i_487_; i_491_ += i_488_++ + i_488_)
						i_490_ += i_488_ + i_488_;
					int i_512_ = 1 + (i - i_488_);
					if (i_512_ < 1605202751 * anInt9383)
						i_512_ = anInt9383 * 1605202751;
					int i_513_ = i_488_ + i;
					if (i_513_ > 2014358275 * anInt9391)
						i_513_ = 2014358275 * anInt9391;
					int i_514_ = i_486_ * (-1173855569 * anInt9387) + i_512_;
					for (int i_515_ = i_512_; i_515_ < i_513_; i_515_++) {
						int i_516_ = anIntArray9386[i_514_];
						int i_517_ = i_516_ + i_482_;
						int i_518_ = (i_516_ & 0xff00ff) + (i_482_ & 0xff00ff);
						i_516_ = (i_518_ & 0x1000100) + (i_517_ - i_518_ & 0x10000);
						anIntArray9386[i_514_++] = i_517_ - i_516_ | i_516_ - (i_516_ >>> 8);
					}
					i_486_++;
					i_490_ -= i_489_-- + i_489_;
					i_491_ -= i_489_ + i_489_;
				}
				i_488_ = i_481_;
				i_489_ = -i_489_;
				i_491_ = i_489_ * i_489_ + i_487_;
				i_490_ = i_491_ - i_488_;
				i_491_ -= i_489_;
				while (i_486_ < i_485_) {
					for (/**/; i_491_ > i_487_ && i_490_ > i_487_; i_490_ -= i_488_ + i_488_)
						i_491_ -= i_488_-- + i_488_;
					int i_519_ = i - i_488_;
					if (i_519_ < 1605202751 * anInt9383)
						i_519_ = anInt9383 * 1605202751;
					int i_520_ = i_488_ + i;
					if (i_520_ > anInt9391 * 2014358275 - 1)
						i_520_ = anInt9391 * 2014358275 - 1;
					int i_521_ = i_486_ * (anInt9387 * -1173855569) + i_519_;
					for (int i_522_ = i_519_; i_522_ <= i_520_; i_522_++) {
						int i_523_ = anIntArray9386[i_521_];
						int i_524_ = i_523_ + i_482_;
						int i_525_ = (i_482_ & 0xff00ff) + (i_523_ & 0xff00ff);
						i_523_ = (i_524_ - i_525_ & 0x10000) + (i_525_ & 0x1000100);
						anIntArray9386[i_521_++] = i_524_ - i_523_ | i_523_ - (i_523_ >>> 8);
					}
					i_486_++;
					i_491_ += i_489_ + i_489_;
					i_490_ += i_489_++ + i_489_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	void method3350(int i, int i_526_) throws Exception_Sub1 {
		aClass171_Sub1_2073.method14727(i, i_526_);
		if (null != anInterface24_2085)
			anInterface24_2085.method19((byte) -8);
	}

	void method3122(int i, int i_527_) throws Exception_Sub1 {
		aClass171_Sub1_2073.method14727(i, i_527_);
		if (null != anInterface24_2085)
			anInterface24_2085.method19((byte) -70);
	}

	void method3223(int i, int i_528_) throws Exception_Sub1 {
		aClass171_Sub1_2073.method14727(i, i_528_);
		if (null != anInterface24_2085)
			anInterface24_2085.method19((byte) -118);
	}

	public Class432 method3372() {
		return new Class432(aClass432_9420);
	}

	public Interface21 method3431(int i, int i_529_, Class157 class157, Class184 class184, int i_530_) {
		return method14843(i, i_529_);
	}

	public void method3229() {
		/* empty */
	}

	public void method3227() {
		/* empty */
	}

	void method3228() {
		if (aBool9401) {
			Class520.method8664(true, false, -1988010584);
			aBool9401 = false;
		}
		aBool9411 = true;
	}

	void method3092() {
		if (aBool9401) {
			Class520.method8664(true, false, 58520812);
			aBool9401 = false;
		}
		aBool9411 = true;
	}

	void method3230() {
		if (aBool9401) {
			Class520.method8664(true, false, -1389014785);
			aBool9401 = false;
		}
		aBool9411 = true;
	}

	public Class527_Sub16 method3450(int i, int i_531_, int i_532_, int i_533_, int i_534_, float f) {
		return null;
	}

	void method3423() {
		if (aBool9401) {
			Class520.method8664(true, false, -1590715003);
			aBool9401 = false;
		}
		aBool9411 = true;
	}

	public void method3233(int i) {
		int i_535_ = i - anInt9384 * -1577765119;
		for (Class527_Sub19 class527_sub19 = (Class527_Sub19) aClass205_9417.method3797(-1630467925); null != class527_sub19; class527_sub19 = (Class527_Sub19) aClass205_9417.method3798((byte) -23)) {
			if (class527_sub19.aBool10479) {
				class527_sub19.anInt10478 += i_535_;
				int i_536_ = class527_sub19.anInt10478 / 50;
				if (i_536_ > 0) {
					Class163 class163 = aClass181_2059.method3544(class527_sub19.anInt10476, (byte) -96);
					float f = (float) (1039262975 * class163.anInt1780);
					class527_sub19.method16202((int) ((float) i_535_ / 1000.0F * (float) class163.aByte1781 / 64.0F * f), (int) ((float) class163.aByte1797 * ((float) i_535_ / 1000.0F) / 64.0F * f));
					class527_sub19.anInt10478 -= 50 * i_536_;
				}
				class527_sub19.aBool10479 = false;
			}
		}
		anInt9384 = i * -925120255;
		aClass205_9400.method3792(5, (byte) 107);
		aClass205_9417.method3792(5, (byte) 2);
	}

	public void method3267(int i) {
		int i_537_ = i - anInt9384 * -1577765119;
		for (Class527_Sub19 class527_sub19 = (Class527_Sub19) aClass205_9417.method3797(-812944912); null != class527_sub19; class527_sub19 = (Class527_Sub19) aClass205_9417.method3798((byte) -108)) {
			if (class527_sub19.aBool10479) {
				class527_sub19.anInt10478 += i_537_;
				int i_538_ = class527_sub19.anInt10478 / 50;
				if (i_538_ > 0) {
					Class163 class163 = aClass181_2059.method3544(class527_sub19.anInt10476, (byte) -94);
					float f = (float) (1039262975 * class163.anInt1780);
					class527_sub19.method16202((int) ((float) i_537_ / 1000.0F * (float) class163.aByte1781 / 64.0F * f), (int) ((float) class163.aByte1797 * ((float) i_537_ / 1000.0F) / 64.0F * f));
					class527_sub19.anInt10478 -= 50 * i_538_;
				}
				class527_sub19.aBool10479 = false;
			}
		}
		anInt9384 = i * -925120255;
		aClass205_9400.method3792(5, (byte) -3);
		aClass205_9417.method3792(5, (byte) 12);
	}

	public void method3235(int i) {
		int i_539_ = i - anInt9384 * -1577765119;
		for (Class527_Sub19 class527_sub19 = (Class527_Sub19) aClass205_9417.method3797(-1285608015); null != class527_sub19; class527_sub19 = (Class527_Sub19) aClass205_9417.method3798((byte) -85)) {
			if (class527_sub19.aBool10479) {
				class527_sub19.anInt10478 += i_539_;
				int i_540_ = class527_sub19.anInt10478 / 50;
				if (i_540_ > 0) {
					Class163 class163 = aClass181_2059.method3544(class527_sub19.anInt10476, (byte) -68);
					float f = (float) (1039262975 * class163.anInt1780);
					class527_sub19.method16202((int) ((float) i_539_ / 1000.0F * (float) class163.aByte1781 / 64.0F * f), (int) ((float) class163.aByte1797 * ((float) i_539_ / 1000.0F) / 64.0F * f));
					class527_sub19.anInt10478 -= 50 * i_540_;
				}
				class527_sub19.aBool10479 = false;
			}
		}
		anInt9384 = i * -925120255;
		aClass205_9400.method3792(5, (byte) -26);
		aClass205_9417.method3792(5, (byte) -13);
	}

	void method3224(int i, int i_541_) throws Exception_Sub1 {
		aClass171_Sub1_2073.method14727(i, i_541_);
		if (null != anInterface24_2085)
			anInterface24_2085.method19((byte) -14);
	}

	boolean method14845() {
		return aBool9411;
	}

	boolean method14846() {
		return aBool9411;
	}

	void method14847(int i, int i_542_, int i_543_, int i_544_, int i_545_, int i_546_, int i_547_, int i_548_) {
		if (anIntArray9386 != null && (i_542_ >= -456655989 * anInt9392 && i_542_ < anInt9393 * -383695469)) {
			int i_549_ = i + i_542_ * (-1173855569 * anInt9387);
			int i_550_ = i_544_ >>> 24;
			int i_551_ = i_547_ + i_546_;
			int i_552_ = i_548_ % i_551_;
			if (0 == i_545_ || 1 == i_545_ && i_550_ == 255) {
				int i_553_ = 0;
				while (i_553_ < i_543_) {
					if (i + i_553_ >= 1605202751 * anInt9383 && i + i_553_ < 2014358275 * anInt9391 && i_552_ < i_546_)
						anIntArray9386[i_549_ + i_553_] = i_544_;
					i_553_++;
					i_552_ = ++i_552_ % i_551_;
				}
			} else if (1 == i_545_) {
				i_544_ = ((i_550_ << 24) + ((i_550_ * (i_544_ & 0xff00ff) >> 8 & 0xff00ff) + (i_550_ * (i_544_ & 0xff00) >> 8 & 0xff00)));
				int i_554_ = 256 - i_550_;
				int i_555_ = 0;
				while (i_555_ < i_543_) {
					if (i_555_ + i >= anInt9383 * 1605202751 && i + i_555_ < anInt9391 * 2014358275 && i_552_ < i_546_) {
						int i_556_ = anIntArray9386[i_549_ + i_555_];
						i_556_ = ((i_554_ * (i_556_ & 0xff00ff) >> 8 & 0xff00ff) + (i_554_ * (i_556_ & 0xff00) >> 8 & 0xff00));
						anIntArray9386[i_549_ + i_555_] = i_544_ + i_556_;
					}
					i_555_++;
					i_552_ = ++i_552_ % i_551_;
				}
			} else if (2 == i_545_) {
				int i_557_ = 0;
				while (i_557_ < i_543_) {
					if (i + i_557_ >= anInt9383 * 1605202751 && i_557_ + i < anInt9391 * 2014358275 && i_552_ < i_546_) {
						int i_558_ = anIntArray9386[i_549_ + i_557_];
						int i_559_ = i_544_ + i_558_;
						int i_560_ = (i_544_ & 0xff00ff) + (i_558_ & 0xff00ff);
						i_558_ = (i_559_ - i_560_ & 0x10000) + (i_560_ & 0x1000100);
						anIntArray9386[i_557_ + i_549_] = i_559_ - i_558_ | i_558_ - (i_558_ >>> 8);
					}
					i_557_++;
					i_552_ = ++i_552_ % i_551_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	int[] method14848(int i) {
		Class527_Sub19 class527_sub19;
		synchronized (aClass205_9417) {
			class527_sub19 = ((Class527_Sub19) aClass205_9417.method3787((long) (i & 0xffff) | ~0x7fffffffffffffffL));
			if (class527_sub19 == null) {
				Class163 class163 = aClass181_2059.method3544(i, (byte) -80);
				int i_561_ = class163.anInt1780 * 1039262975;
				if (!anInterface24_2085.method134(Class609.aClass609_7996, i, Class591.aClass591_7796, 0.7F, i_561_, i_561_, true, -2042317620)) {
					int[] is = null;
					return is;
				}
				int[] is;
				if (Class595.aClass595_7816 != class163.aClass595_1784)
					is = anInterface24_2085.method133(Class609.aClass609_7996, i, 0.7F, i_561_, i_561_, true, -414163667);
				else
					is = anInterface24_2085.method132(Class609.aClass609_7996, i, 0.7F, i_561_, i_561_, true, (byte) 0);
				class527_sub19 = new Class527_Sub19(i, i_561_, is, (class163.aClass595_1784 != Class595.aClass595_7815));
				aClass205_9417.method3813(class527_sub19, ((long) (i & 0xffff) | ~0x7fffffffffffffffL), i_561_ * i_561_, 2013574424);
			}
		}
		class527_sub19.aBool10479 = true;
		return class527_sub19.method16205();
	}

	int method14849(int i) {
		return aClass181_2059.method3544(i, (byte) -81).anInt1780 * 1039262975;
	}

	Class595 method14850(int i) {
		return aClass181_2059.method3544(i, (byte) -31).aClass595_1784;
	}

	Class595 method14851(int i) {
		return aClass181_2059.method3544(i, (byte) -76).aClass595_1784;
	}

	Class595 method14852(int i) {
		return aClass181_2059.method3544(i, (byte) -102).aClass595_1784;
	}

	public void method3225() {
		/* empty */
	}

	boolean method14853(int i) {
		Class163 class163 = aClass181_2059.method3544(i, (byte) 4);
		return 0 != class163.aByte1786 || 0 != class163.aByte1787;
	}

	public boolean method3237() {
		return false;
	}

	public boolean method3238() {
		return false;
	}

	public Interface23 method3434(int i, int i_562_) {
		return new Class117(i, i_562_);
	}

	public boolean method3240() {
		return false;
	}

	public boolean method3241() {
		return true;
	}

	public boolean method3115() {
		return false;
	}

	public boolean method3091() {
		return false;
	}

	public int method3090() {
		return 0;
	}

	public boolean method3245() {
		return false;
	}

	public boolean method3118() {
		return false;
	}

	public void method3087() {
		/* empty */
	}

	public boolean method3152() {
		return false;
	}

	public boolean method3249() {
		return false;
	}

	public void method3393(Class179 class179) {
		/* empty */
	}

	public boolean method3205() {
		return false;
	}

	public boolean method3252() {
		return false;
	}

	public boolean method3465() {
		return true;
	}

	public String method3254() {
		return "";
	}

	public String method3101() {
		return "";
	}

	public int[] method3256() {
		return null;
	}

	public Interface21 method3432(int i, int i_563_, Class157 class157, Class184 class184, int i_564_) {
		return method14843(i, i_563_);
	}

	public void method3258(boolean bool) {
		/* empty */
	}

	Class171_Sub1 method3491(Canvas canvas, int i, int i_565_) {
		return Class300.method5568(this, canvas, i, i_565_, -1157168525);
	}

	void method14854(int i, int i_566_, int[] is, float[] fs) {
		anInt9387 = i * 1107440719;
		anInt9388 = -197273773 * i_566_;
		anIntArray9386 = is;
		aFloatArray9389 = fs;
		for (int i_567_ = 0; i_567_ < 1413774429 * anInt9415; i_567_++)
			aClass101Array9416[i_567_].method1777((byte) -34);
		method3131();
		method3127();
	}

	void method14855(int i, int i_568_, int[] is, float[] fs) {
		anInt9387 = i * 1107440719;
		anInt9388 = -197273773 * i_568_;
		anIntArray9386 = is;
		aFloatArray9389 = fs;
		for (int i_569_ = 0; i_569_ < 1413774429 * anInt9415; i_569_++)
			aClass101Array9416[i_569_].method1777((byte) -41);
		method3131();
		method3127();
	}

	public void method3348(int i, int i_570_, int i_571_, int i_572_, int i_573_, int i_574_) {
		if (null != anIntArray9386) {
			if (i < anInt9383 * 1605202751) {
				i_571_ -= anInt9383 * 1605202751 - i;
				i = anInt9383 * 1605202751;
			}
			if (i_570_ < anInt9392 * -456655989) {
				i_572_ -= anInt9392 * -456655989 - i_570_;
				i_570_ = -456655989 * anInt9392;
			}
			if (i + i_571_ > anInt9391 * 2014358275)
				i_571_ = anInt9391 * 2014358275 - i;
			if (i_570_ + i_572_ > anInt9393 * -383695469)
				i_572_ = -383695469 * anInt9393 - i_570_;
			if (i_571_ > 0 && i_572_ > 0 && i <= 2014358275 * anInt9391 && i_570_ <= -383695469 * anInt9393) {
				int i_575_ = -1173855569 * anInt9387 - i_571_;
				int i_576_ = i + i_570_ * (anInt9387 * -1173855569);
				int i_577_ = i_573_ >>> 24;
				if (i_574_ == 0 || i_574_ == 1 && i_577_ == 255) {
					int i_578_ = i_571_ >> 3;
					int i_579_ = i_571_ & 0x7;
					i_571_ = i_576_ - 1;
					for (int i_580_ = -i_572_; i_580_ < 0; i_580_++) {
						if (i_578_ > 0) {
							i = i_578_;
							do {
								anIntArray9386[++i_571_] = i_573_;
								anIntArray9386[++i_571_] = i_573_;
								anIntArray9386[++i_571_] = i_573_;
								anIntArray9386[++i_571_] = i_573_;
								anIntArray9386[++i_571_] = i_573_;
								anIntArray9386[++i_571_] = i_573_;
								anIntArray9386[++i_571_] = i_573_;
								anIntArray9386[++i_571_] = i_573_;
							} while (--i > 0);
						}
						if (i_579_ > 0) {
							i = i_579_;
							do
								anIntArray9386[++i_571_] = i_573_;
							while (--i > 0);
						}
						i_571_ += i_575_;
					}
				} else if (1 == i_574_) {
					i_573_ = ((i_577_ * (i_573_ & 0xff00ff) >> 8 & 0xff00ff) + (((i_573_ & ~0xff00ff) >>> 8) * i_577_ & ~0xff00ff));
					int i_581_ = 256 - i_577_;
					for (int i_582_ = 0; i_582_ < i_572_; i_582_++) {
						for (int i_583_ = -i_571_; i_583_ < 0; i_583_++) {
							int i_584_ = anIntArray9386[i_576_];
							i_584_ = ((i_581_ * (i_584_ & 0xff00ff) >> 8 & 0xff00ff) + (((i_584_ & ~0xff00ff) >>> 8) * i_581_ & ~0xff00ff));
							anIntArray9386[i_576_++] = i_573_ + i_584_;
						}
						i_576_ += i_575_;
					}
				} else if (2 == i_574_) {
					for (int i_585_ = 0; i_585_ < i_572_; i_585_++) {
						for (int i_586_ = -i_571_; i_586_ < 0; i_586_++) {
							int i_587_ = anIntArray9386[i_576_];
							int i_588_ = i_573_ + i_587_;
							int i_589_ = (i_573_ & 0xff00ff) + (i_587_ & 0xff00ff);
							i_587_ = (i_588_ - i_589_ & 0x10000) + (i_589_ & 0x1000100);
							anIntArray9386[i_576_++] = i_588_ - i_587_ | i_587_ - (i_587_ >>> 8);
						}
						i_576_ += i_575_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public Class427 method3356() {
		Class101 class101 = method14835(Thread.currentThread());
		return class101.aClass427_1212;
	}

	void method14856(int i, int i_590_, int[] is, float[] fs) {
		anInt9387 = i * 1107440719;
		anInt9388 = -197273773 * i_590_;
		anIntArray9386 = is;
		aFloatArray9389 = fs;
		for (int i_591_ = 0; i_591_ < 1413774429 * anInt9415; i_591_++)
			aClass101Array9416[i_591_].method1777((byte) -90);
		method3131();
		method3127();
	}

	public int[] method3259(int i, int i_592_, int i_593_, int i_594_) {
		if (anIntArray9386 == null)
			throw new IllegalStateException("");
		int[] is = new int[i_593_ * i_594_];
		int i_595_ = 0;
		for (int i_596_ = 0; i_596_ < i_594_; i_596_++) {
			int i_597_ = i + (i_596_ + i_592_) * (-1173855569 * anInt9387);
			for (int i_598_ = 0; i_598_ < i_593_; i_598_++)
				is[i_595_++] = anIntArray9386[i_597_ + i_598_];
		}
		return is;
	}

	public int[] method3260(int i, int i_599_, int i_600_, int i_601_) {
		if (anIntArray9386 == null)
			throw new IllegalStateException("");
		int[] is = new int[i_600_ * i_601_];
		int i_602_ = 0;
		for (int i_603_ = 0; i_603_ < i_601_; i_603_++) {
			int i_604_ = i + (i_603_ + i_599_) * (-1173855569 * anInt9387);
			for (int i_605_ = 0; i_605_ < i_600_; i_605_++)
				is[i_602_++] = anIntArray9386[i_604_ + i_605_];
		}
		return is;
	}

	public void method3261() {
		/* empty */
	}

	public void method3473(int[] is) {
		is[0] = anInt9407 * 1927584963;
		is[1] = anInt9406 * 950770619;
		is[2] = 278922843 * anInt9390;
		is[3] = 56228905 * anInt9385;
	}

	public void method3216(int[] is) {
		is[0] = -1173855569 * anInt9387;
		is[1] = anInt9388 * -77167397;
	}

	public boolean method3264() {
		return false;
	}

	public void method3343(int i) {
		Class176_Sub2.anInt9206 = Class176_Sub2.anInt9166 = i;
		if (1413774429 * anInt9415 > 1)
			throw new IllegalStateException();
		method14880(anInt9415 * 1413774429);
		method14879(0);
	}

	public boolean method3335() {
		return true;
	}

	public void method3341(int i) {
		Class176_Sub2.anInt9206 = Class176_Sub2.anInt9166 = i;
		if (1413774429 * anInt9415 > 1)
			throw new IllegalStateException();
		method14880(anInt9415 * 1413774429);
		method14879(0);
	}

	public boolean method3140() {
		return true;
	}

	public boolean method3133() {
		return false;
	}

	public Class171_Sub2 method3109() {
		return new Class171_Sub2_Sub3(this);
	}

	public int method3402() {
		return -1;
	}

	public void method3272(int i, int i_606_, int i_607_) {
		/* empty */
	}

	public void method3273() {
		/* empty */
	}

	public long method3274(int i, int i_608_) {
		return 0L;
	}

	public long method3275(int i, int i_609_) {
		return 0L;
	}

	public void method3187(int i, int i_610_, int i_611_) {
		for (int i_612_ = 0; i_612_ < aClass101Array9416.length; i_612_++) {
			Class101 class101 = aClass101Array9416[i_612_];
			class101.anInt1194 = (i & 0xffffff) * 653672225;
			int i_613_ = -1009384223 * class101.anInt1194 >>> 16 & 0xff;
			if (i_613_ < 2)
				i_613_ = 2;
			int i_614_ = -1009384223 * class101.anInt1194 >> 8 & 0xff;
			if (i_614_ < 2)
				i_614_ = 2;
			int i_615_ = class101.anInt1194 * -1009384223 & 0xff;
			if (i_615_ < 2)
				i_615_ = 2;
			class101.anInt1194 = 653672225 * (i_613_ << 16 | i_614_ << 8 | i_615_);
			if (i_610_ < 0)
				class101.aBool1191 = false;
			else
				class101.aBool1191 = true;
		}
	}

	Class180_Sub1(Canvas canvas, Class181 class181, Interface24 interface24, Interface48 interface48, Interface46 interface46, Interface49 interface49, int i, int i_616_) {
		this(class181, interface24, interface48, interface46, interface49);
		try {
			method3371(canvas, i, i_616_, 1611049152);
			method3104(canvas, 673954373);
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			method3081((byte) 61);
			throw new RuntimeException("");
		}
	}

	public void method3278(int i, int i_617_, int[] is, int[] is_618_) {
		method3482(i, i_617_, -1784395681);
		if (null == aClass147_9421 || aClass147_9421.method2407() != i || aClass147_9421.method2424() != i_617_) {
			aClass147_9421 = method3161(i, i_617_, true, true);
			aClass171_Sub2_9422 = null;
		}
		if (null == aClass171_Sub2_9422) {
			aClass171_Sub2_9422 = method3109();
			aClass171_Sub2_9422.method15321(0, aClass147_9421.method2454());
		}
		Class147_Sub1_Sub2 class147_sub1_sub2 = new Class147_Sub1_Sub2(this, anIntArray9386, -1173855569 * anInt9387, anInt9388 * -77167397);
		method3106(aClass171_Sub2_9422, (byte) -125);
		method3136(1, -16777216);
		class147_sub1_sub2.method2420(-1964562579 * anInt2083, anInt2068 * 960890533, anInt2088 * -731510031, anInt2089 * 351158293, 1, 0, 0, 0);
		aClass147_9421.method2412(0, 0, i, i_617_, is, is_618_, 0, i);
		method3107(aClass171_Sub2_9422, -677418425);
	}

	public void method3279(boolean bool) {
		Class101 class101 = method14835(Thread.currentThread());
		class101.aBool1227 = bool;
	}

	public void method3301(int i, int i_619_, int i_620_, int i_621_, int i_622_, int i_623_) {
		method3410(i, i_619_, i_620_, i_622_, i_623_);
		method3410(i, i_621_ + i_619_ - 1, i_620_, i_622_, i_623_);
		method3148(i, i_619_ + 1, i_621_ - 2, i_622_, i_623_);
		method3148(i_620_ + i - 1, i_619_ + 1, i_621_ - 2, i_622_, i_623_);
	}

	public void method3281(boolean bool) {
		Class101 class101 = method14835(Thread.currentThread());
		class101.aBool1227 = bool;
	}

	void method14857(boolean bool, boolean bool_624_, boolean bool_625_, Class182 class182) {
		Class101 class101 = method14835(Thread.currentThread());
		for (Class522_Sub6_Sub1 class522_sub6_sub1 = ((Class522_Sub6_Sub1) class182.aClass710_2094.method14400(-2124532977)); class522_sub6_sub1 != null; class522_sub6_sub1 = ((Class522_Sub6_Sub1) class182.aClass710_2094.method14399(-735951926))) {
			int i = class522_sub6_sub1.anInt11411 >> 12;
			int i_626_ = class522_sub6_sub1.anInt11407 >> 12;
			int i_627_ = class522_sub6_sub1.anInt11403 >> 12;
			float f = (aClass427_9403.aFloatArray4807[14] + (aClass427_9403.aFloatArray4807[10] * (float) i_627_ + ((float) i * aClass427_9403.aFloatArray4807[2] + (aClass427_9403.aFloatArray4807[6] * (float) i_626_))));
			float f_628_ = ((float) i_626_ * aClass427_9403.aFloatArray4807[7] + aClass427_9403.aFloatArray4807[3] * (float) i + (float) i_627_ * aClass427_9403.aFloatArray4807[11] + aClass427_9403.aFloatArray4807[15]);
			if (!(f < -f_628_)) {
				float f_629_ = aFloat9405 * f / f_628_ + aFloat9414;
				if (!(f > class101.aFloat1192)) {
					float f_630_ = (aClass427_9403.aFloatArray4807[12] + ((aClass427_9403.aFloatArray4807[8] * (float) i_627_) + (((float) i_626_ * aClass427_9403.aFloatArray4807[4]) + (aClass427_9403.aFloatArray4807[0] * (float) i))));
					float f_631_ = (aClass427_9403.aFloatArray4807[9] * (float) i_627_ + (aClass427_9403.aFloatArray4807[1] * (float) i + ((float) i_626_ * aClass427_9403.aFloatArray4807[5])) + aClass427_9403.aFloatArray4807[13]);
					if (!(f_630_ < -f_628_) && !(f_630_ > f_628_) && !(f_631_ < -f_628_) && !(f_631_ > f_628_)) {
						float f_632_ = (float) class522_sub6_sub1.anInt11408 / 4096.0F;
						float f_633_ = (aClass427_9402.aFloatArray4807[0] * f_632_ + f_630_);
						float f_634_ = (f_628_ + aClass427_9402.aFloatArray4807[3] * f_632_);
						float f_635_ = aFloat9410 + aFloat9419 * f_630_ / f_628_;
						float f_636_ = aFloat9412 + f_631_ * aFloat9395 / f_628_;
						float f_637_ = f_633_ * aFloat9419 / f_634_ + aFloat9410;
						method14837(bool, bool_624_, bool_625_, class522_sub6_sub1, (int) f_635_, (int) f_636_, f_629_, (int) (f_637_ < f_635_ ? f_635_ - f_637_ : f_637_ - f_635_));
					}
				}
			}
		}
	}

	public void method3283(int i, int i_638_, int i_639_, int i_640_) {
		anInt9407 = i * -773983253;
		anInt9406 = 940241267 * i_638_;
		anInt9390 = -1141261869 * i_639_;
		anInt9385 = -716218343 * i_640_;
		method14828();
	}

	public void method3337(int i, Class142 class142, int i_641_, int i_642_) {
		if (anIntArray9386 != null) {
			Class142_Sub1 class142_sub1 = (Class142_Sub1) class142;
			int[] is = class142_sub1.anIntArray9002;
			int[] is_643_ = class142_sub1.anIntArray9003;
			int i_644_;
			if (-383695469 * anInt9393 < i_642_ + is.length)
				i_644_ = -383695469 * anInt9393 - i_642_;
			else
				i_644_ = is.length;
			int i_645_;
			if (-456655989 * anInt9392 > i_642_) {
				i_645_ = anInt9392 * -456655989 - i_642_;
				i_642_ = -456655989 * anInt9392;
			} else
				i_645_ = 0;
			if (i_644_ - i_645_ > 0) {
				int i_646_ = i_642_ * (anInt9387 * -1173855569);
				for (int i_647_ = i_645_; i_647_ < i_644_; i_647_++) {
					int i_648_ = i_641_ + is[i_647_];
					int i_649_ = is_643_[i_647_];
					if (1605202751 * anInt9383 > i_648_) {
						i_649_ -= 1605202751 * anInt9383 - i_648_;
						i_648_ = 1605202751 * anInt9383;
					}
					if (2014358275 * anInt9391 < i_649_ + i_648_)
						i_649_ = anInt9391 * 2014358275 - i_648_;
					i_648_ += i_646_;
					for (int i_650_ = -i_649_; i_650_ < 0; i_650_++)
						anIntArray9386[i_648_++] = i;
					i_646_ += -1173855569 * anInt9387;
				}
			}
		}
	}

	public void method3433(int[] is) {
		is[0] = anInt9407 * 1927584963;
		is[1] = anInt9406 * 950770619;
		is[2] = 278922843 * anInt9390;
		is[3] = 56228905 * anInt9385;
	}

	public void method3286(int[] is) {
		is[0] = anInt9407 * 1927584963;
		is[1] = anInt9406 * 950770619;
		is[2] = 278922843 * anInt9390;
		is[3] = 56228905 * anInt9385;
	}

	public void method3401(float f, float f_651_) {
		aFloat9405 = f_651_ - f;
		aFloat9414 = f_651_ + f - 1.0F;
		for (int i = 0; i < anInt9415 * 1413774429; i++) {
			Class101 class101 = aClass101Array9416[i];
			Class119 class119 = class101.aClass119_1197;
			class119.aFloat1453 = aFloat9405;
			class119.aFloat1452 = aFloat9414;
		}
	}

	public void method3312(int i, int i_652_, int i_653_, int i_654_, int i_655_, int i_656_, int i_657_, int i_658_, int i_659_) {
		if (anIntArray9386 != null) {
			i_653_ -= i;
			i_654_ -= i_652_;
			if (0 == i_654_) {
				if (i_653_ >= 0)
					method14830(i, i_652_, 1 + i_653_, i_655_, i_656_, i_657_, i_658_, i_659_);
				else {
					int i_660_ = i_658_ + i_657_;
					i_659_ %= i_660_;
					i_659_ = i_660_ + i_657_ - i_659_ - (-i_653_ + 1) % i_660_;
					i_659_ %= i_660_;
					if (i_659_ < 0)
						i_659_ += i_660_;
					method14830(i + i_653_, i_652_, 1 + -i_653_, i_655_, i_656_, i_657_, i_658_, i_659_);
				}
			} else if (0 == i_653_) {
				if (i_654_ >= 0)
					method14831(i, i_652_, 1 + i_654_, i_655_, i_656_, i_657_, i_658_, i_659_);
				else {
					int i_661_ = i_657_ + i_658_;
					i_659_ %= i_661_;
					i_659_ = i_657_ + i_661_ - i_659_ - (1 + -i_654_) % i_661_;
					i_659_ %= i_661_;
					if (i_659_ < 0)
						i_659_ += i_661_;
					method14831(i, i_652_ + i_654_, 1 + -i_654_, i_655_, i_656_, i_657_, i_658_, i_659_);
				}
			} else {
				i_659_ <<= 8;
				i_657_ <<= 8;
				i_658_ <<= 8;
				int i_662_ = i_657_ + i_658_;
				i_659_ %= i_662_;
				if (i_653_ + i_654_ < 0) {
					int i_663_ = (int) (Math.sqrt((double) (i_654_ * i_654_ + i_653_ * i_653_)) * 256.0);
					int i_664_ = i_663_ % i_662_;
					i_659_ = i_662_ + i_657_ - i_659_ - i_664_;
					i_659_ %= i_662_;
					if (i_659_ < 0)
						i_659_ += i_662_;
					i += i_653_;
					i_653_ = -i_653_;
					i_652_ += i_654_;
					i_654_ = -i_654_;
				}
				if (i_653_ > i_654_) {
					i_652_ <<= 16;
					i_652_ += 32768;
					i_654_ <<= 16;
					int i_665_ = (int) Math.floor((double) i_654_ / (double) i_653_ + 0.5);
					i_653_ += i;
					int i_666_ = i_655_ >>> 24;
					int i_667_ = (int) Math.sqrt((double) (65536 + (i_665_ >> 8) * (i_665_ >> 8)));
					if (0 == i_656_ || 1 == i_656_ && 255 == i_666_) {
						while (i <= i_653_) {
							int i_668_ = i_652_ >> 16;
							if (i >= 1605202751 * anInt9383 && i < 2014358275 * anInt9391 && i_668_ >= anInt9392 * -456655989 && i_668_ < -383695469 * anInt9393 && i_659_ < i_657_)
								anIntArray9386[i + i_668_ * (anInt9387 * -1173855569)] = i_655_;
							i_652_ += i_665_;
							i++;
							i_659_ += i_667_;
							i_659_ %= i_662_;
						}
					} else if (i_656_ == 1) {
						i_655_ = (((i_655_ & 0xff00ff) * i_666_ >> 8 & 0xff00ff) + (i_666_ * (i_655_ & 0xff00) >> 8 & 0xff00) + (i_666_ << 24));
						int i_669_ = 256 - i_666_;
						while (i <= i_653_) {
							int i_670_ = i_652_ >> 16;
							if (i >= 1605202751 * anInt9383 && i < 2014358275 * anInt9391 && i_670_ >= -456655989 * anInt9392 && i_670_ < -383695469 * anInt9393 && i_659_ < i_657_) {
								int i_671_ = i + -1173855569 * anInt9387 * i_670_;
								int i_672_ = anIntArray9386[i_671_];
								i_672_ = ((i_669_ * (i_672_ & 0xff00) >> 8 & 0xff00) + (i_669_ * (i_672_ & 0xff00ff) >> 8 & 0xff00ff));
								anIntArray9386[i_671_] = i_672_ + i_655_;
							}
							i_652_ += i_665_;
							i++;
							i_659_ += i_667_;
							i_659_ %= i_662_;
						}
					} else if (2 == i_656_) {
						while (i <= i_653_) {
							int i_673_ = i_652_ >> 16;
							if (i >= anInt9383 * 1605202751 && i < 2014358275 * anInt9391 && i_673_ >= anInt9392 * -456655989 && i_673_ < -383695469 * anInt9393 && i_659_ < i_657_) {
								int i_674_ = i + anInt9387 * -1173855569 * i_673_;
								int i_675_ = anIntArray9386[i_674_];
								int i_676_ = i_655_ + i_675_;
								int i_677_ = ((i_655_ & 0xff00ff) + (i_675_ & 0xff00ff));
								i_675_ = (i_677_ & 0x1000100) + (i_676_ - i_677_ & 0x10000);
								anIntArray9386[i_674_] = i_676_ - i_675_ | i_675_ - (i_675_ >>> 8);
							}
							i_652_ += i_665_;
							i++;
							i_659_ += i_667_;
							i_659_ %= i_662_;
						}
					} else
						throw new IllegalArgumentException();
				} else {
					i <<= 16;
					i += 32768;
					i_653_ <<= 16;
					int i_678_ = (int) Math.floor((double) i_653_ / (double) i_654_ + 0.5);
					i_654_ += i_652_;
					int i_679_ = i_655_ >>> 24;
					int i_680_ = (int) Math.sqrt((double) ((i_678_ >> 8) * (i_678_ >> 8) + 65536));
					if (i_656_ == 0 || i_656_ == 1 && 255 == i_679_) {
						while (i_652_ <= i_654_) {
							int i_681_ = i >> 16;
							if (i_652_ >= -456655989 * anInt9392 && i_652_ < -383695469 * anInt9393 && i_681_ >= 1605202751 * anInt9383 && i_681_ < anInt9391 * 2014358275 && i_659_ < i_657_)
								anIntArray9386[i_681_ + (-1173855569 * anInt9387 * i_652_)] = i_655_;
							i += i_678_;
							i_652_++;
							i_659_ += i_680_;
							i_659_ %= i_662_;
						}
					} else if (i_656_ == 1) {
						i_655_ = ((i_679_ << 24) + (((i_655_ & 0xff00ff) * i_679_ >> 8 & 0xff00ff) + (i_679_ * (i_655_ & 0xff00) >> 8 & 0xff00)));
						int i_682_ = 256 - i_679_;
						while (i_652_ <= i_654_) {
							int i_683_ = i >> 16;
							if (i_652_ >= -456655989 * anInt9392 && i_652_ < anInt9393 * -383695469 && i_683_ >= 1605202751 * anInt9383 && i_683_ < 2014358275 * anInt9391 && i_659_ < i_657_) {
								int i_684_ = (i_683_ + -1173855569 * anInt9387 * i_652_);
								int i_685_ = anIntArray9386[i_684_];
								i_685_ = (((i_685_ & 0xff00) * i_682_ >> 8 & 0xff00) + ((i_685_ & 0xff00ff) * i_682_ >> 8 & 0xff00ff));
								anIntArray9386[i_683_ + (-1173855569 * anInt9387 * i_652_)] = i_685_ + i_655_;
							}
							i += i_678_;
							i_652_++;
							i_659_ += i_680_;
							i_659_ %= i_662_;
						}
					} else if (2 == i_656_) {
						while (i_652_ <= i_654_) {
							int i_686_ = i >> 16;
							if (i_652_ >= -456655989 * anInt9392 && i_652_ < -383695469 * anInt9393 && i_686_ >= 1605202751 * anInt9383 && i_686_ < anInt9391 * 2014358275 && i_659_ < i_657_) {
								int i_687_ = (anInt9387 * -1173855569 * i_652_ + i_686_);
								int i_688_ = anIntArray9386[i_687_];
								int i_689_ = i_688_ + i_655_;
								int i_690_ = ((i_655_ & 0xff00ff) + (i_688_ & 0xff00ff));
								i_688_ = ((i_689_ - i_690_ & 0x10000) + (i_690_ & 0x1000100));
								anIntArray9386[i_687_] = i_689_ - i_688_ | i_688_ - (i_688_ >>> 8);
							}
							i += i_678_;
							i_652_++;
							i_659_ += i_680_;
							i_659_ %= i_662_;
						}
					} else
						throw new IllegalArgumentException();
				}
			}
		}
	}

	public void method3289(float f, float f_691_) {
		aFloat9405 = f_691_ - f;
		aFloat9414 = f_691_ + f - 1.0F;
		for (int i = 0; i < anInt9415 * 1413774429; i++) {
			Class101 class101 = aClass101Array9416[i];
			Class119 class119 = class101.aClass119_1197;
			class119.aFloat1453 = aFloat9405;
			class119.aFloat1452 = aFloat9414;
		}
	}

	Class171_Sub1 method3108(Canvas canvas, int i, int i_692_) {
		return Class300.method5568(this, canvas, i, i_692_, 1416479062);
	}

	public void method3443(float f, float f_693_) {
		aFloat9405 = f_693_ - f;
		aFloat9414 = f_693_ + f - 1.0F;
		for (int i = 0; i < anInt9415 * 1413774429; i++) {
			Class101 class101 = aClass101Array9416[i];
			Class119 class119 = class101.aClass119_1197;
			class119.aFloat1453 = aFloat9405;
			class119.aFloat1452 = aFloat9414;
		}
	}

	void method14858() {
		int i = anInt9391 * 2014358275 - anInt9383 * 1605202751;
		int i_694_ = anInt9393 * -383695469 - -456655989 * anInt9392;
		float f = aFloat9419 = (float) (278922843 * anInt9390) / 2.0F;
		float f_695_ = aFloat9395 = (float) (anInt9385 * 56228905) / 2.0F;
		aFloat9410 = (float) (anInt9407 * 1927584963) + f;
		aFloat9412 = (float) (anInt9406 * 950770619) + f_695_;
		for (int i_696_ = 0; i_696_ < anInt9415 * 1413774429; i_696_++) {
			Class101 class101 = aClass101Array9416[i_696_];
			Class119 class119 = class101.aClass119_1197;
			class119.aFloat1451 = f;
			class119.aFloat1466 = f_695_;
			class119.aFloat1448 = aFloat9410 - (float) (1605202751 * anInt9383);
			class119.aFloat1444 = aFloat9412 - (float) (anInt9392 * -456655989);
			class119.anInt1442 = i;
			class119.anInt1450 = i_694_;
		}
		int i_697_ = (anInt9383 * 1605202751 + anInt9387 * -1173855569 * (-456655989 * anInt9392));
		for (int i_698_ = -456655989 * anInt9392; i_698_ < -383695469 * anInt9393; i_698_++) {
			for (int i_699_ = 0; i_699_ < 1413774429 * anInt9415; i_699_++)
				aClass101Array9416[i_699_].aClass119_1197.anIntArray1447[i_698_ - anInt9392 * -456655989] = i_697_;
			i_697_ += -1173855569 * anInt9387;
		}
	}

	public void method3292() {
		anInt9383 = 0;
		anInt9392 = 0;
		anInt9391 = -370531355 * anInt9387;
		anInt9393 = -136163175 * anInt9388;
		method14828();
	}

	public void method3293() {
		anInt9383 = 0;
		anInt9392 = 0;
		anInt9391 = -370531355 * anInt9387;
		anInt9393 = -136163175 * anInt9388;
		method14828();
	}

	public boolean method3197() {
		return false;
	}

	public void method3192() {
		anInt9383 = 0;
		anInt9392 = 0;
		anInt9391 = -370531355 * anInt9387;
		anInt9393 = -136163175 * anInt9388;
		method14828();
	}

	public void method3296() {
		anInt9383 = 0;
		anInt9392 = 0;
		anInt9391 = -370531355 * anInt9387;
		anInt9393 = -136163175 * anInt9388;
		method14828();
	}

	public void method3315(int i, int i_700_, int i_701_, int i_702_, int i_703_, int i_704_, int i_705_) {
		if (anIntArray9386 != null) {
			Class101 class101 = method14835(Thread.currentThread());
			Class119 class119 = class101.aClass119_1197;
			int i_706_ = i_701_ - i;
			int i_707_ = i_702_ - i_700_;
			int i_708_ = i_706_ >= 0 ? i_706_ : -i_706_;
			int i_709_ = i_707_ >= 0 ? i_707_ : -i_707_;
			int i_710_ = i_708_;
			if (i_710_ < i_709_)
				i_710_ = i_709_;
			if (i_710_ != 0) {
				int i_711_ = (i_706_ << 16) / i_710_;
				int i_712_ = (i_707_ << 16) / i_710_;
				i_706_ += i_711_ >> 16;
				i_707_ += i_712_ >> 16;
				if (i_712_ <= i_711_)
					i_711_ = -i_711_;
				else
					i_712_ = -i_712_;
				int i_713_ = i_712_ * i_704_ >> 17;
				int i_714_ = 1 + i_712_ * i_704_ >> 17;
				int i_715_ = i_704_ * i_711_ >> 17;
				int i_716_ = 1 + i_711_ * i_704_ >> 17;
				i -= class119.method2083();
				i_700_ -= class119.method2071();
				int i_717_ = i_713_ + i;
				int i_718_ = i - i_714_;
				int i_719_ = i + i_706_ - i_714_;
				int i_720_ = i + i_706_ + i_713_;
				int i_721_ = i_700_ + i_715_;
				int i_722_ = i_700_ - i_716_;
				int i_723_ = i_707_ + i_700_ - i_716_;
				int i_724_ = i_715_ + (i_700_ + i_707_);
				if (i_705_ == 0)
					class119.anInt1441 = 0;
				else if (i_705_ == 1)
					class119.anInt1441 = 255 - (i_703_ >>> 24);
				else
					throw new IllegalArgumentException();
				method3182(false);
				class119.aBool1445 = (i_717_ < 0 || i_717_ > class119.anInt1442 || i_718_ < 0 || i_718_ > class119.anInt1442 || i_719_ < 0 || i_719_ > class119.anInt1442);
				class119.method2077(true, false, false, (float) i_721_, (float) i_722_, (float) i_723_, (float) i_717_, (float) i_718_, (float) i_719_, 100.0F, 100.0F, 100.0F, i_703_);
				class119.aBool1445 = (i_717_ < 0 || i_717_ > class119.anInt1442 || i_719_ < 0 || i_719_ > class119.anInt1442 || i_720_ < 0 || i_720_ > class119.anInt1442);
				class119.method2077(true, false, false, (float) i_721_, (float) i_723_, (float) i_724_, (float) i_717_, (float) i_719_, (float) i_720_, 100.0F, 100.0F, 100.0F, i_703_);
				method3182(true);
			}
		}
	}

	public void method3314(int i, int i_725_, int i_726_, int i_727_) {
		if (i < 0)
			i = 0;
		if (i_725_ < 0)
			i_725_ = 0;
		if (i_726_ > anInt9387 * -1173855569)
			i_726_ = anInt9387 * -1173855569;
		if (i_727_ > -77167397 * anInt9388)
			i_727_ = -77167397 * anInt9388;
		anInt9383 = -1482949441 * i;
		anInt9391 = 274044843 * i_726_;
		anInt9392 = i_725_ * -1103277021;
		anInt9393 = 2022023323 * i_727_;
		method14828();
	}

	public void method3290(float f, float f_728_) {
		aFloat9405 = f_728_ - f;
		aFloat9414 = f_728_ + f - 1.0F;
		for (int i = 0; i < anInt9415 * 1413774429; i++) {
			Class101 class101 = aClass101Array9416[i];
			Class119 class119 = class101.aClass119_1197;
			class119.aFloat1453 = aFloat9405;
			class119.aFloat1452 = aFloat9414;
		}
	}

	public void method3387(int i, int i_729_, int i_730_) {
		for (int i_731_ = 0; i_731_ < aClass101Array9416.length; i_731_++) {
			Class101 class101 = aClass101Array9416[i_731_];
			class101.anInt1194 = (i & 0xffffff) * 653672225;
			int i_732_ = -1009384223 * class101.anInt1194 >>> 16 & 0xff;
			if (i_732_ < 2)
				i_732_ = 2;
			int i_733_ = -1009384223 * class101.anInt1194 >> 8 & 0xff;
			if (i_733_ < 2)
				i_733_ = 2;
			int i_734_ = class101.anInt1194 * -1009384223 & 0xff;
			if (i_734_ < 2)
				i_734_ = 2;
			class101.anInt1194 = 653672225 * (i_732_ << 16 | i_733_ << 8 | i_734_);
			if (i_729_ < 0)
				class101.aBool1191 = false;
			else
				class101.aBool1191 = true;
		}
	}

	public int[] method3284() {
		return null;
	}

	public void method3075(int i, int i_735_, int i_736_, int i_737_, int i_738_, int i_739_) {
		if (null != anIntArray9386) {
			if (i < anInt9383 * 1605202751) {
				i_736_ -= anInt9383 * 1605202751 - i;
				i = anInt9383 * 1605202751;
			}
			if (i_735_ < anInt9392 * -456655989) {
				i_737_ -= anInt9392 * -456655989 - i_735_;
				i_735_ = -456655989 * anInt9392;
			}
			if (i + i_736_ > anInt9391 * 2014358275)
				i_736_ = anInt9391 * 2014358275 - i;
			if (i_735_ + i_737_ > anInt9393 * -383695469)
				i_737_ = -383695469 * anInt9393 - i_735_;
			if (i_736_ > 0 && i_737_ > 0 && i <= 2014358275 * anInt9391 && i_735_ <= -383695469 * anInt9393) {
				int i_740_ = -1173855569 * anInt9387 - i_736_;
				int i_741_ = i + i_735_ * (anInt9387 * -1173855569);
				int i_742_ = i_738_ >>> 24;
				if (i_739_ == 0 || i_739_ == 1 && i_742_ == 255) {
					int i_743_ = i_736_ >> 3;
					int i_744_ = i_736_ & 0x7;
					i_736_ = i_741_ - 1;
					for (int i_745_ = -i_737_; i_745_ < 0; i_745_++) {
						if (i_743_ > 0) {
							i = i_743_;
							do {
								anIntArray9386[++i_736_] = i_738_;
								anIntArray9386[++i_736_] = i_738_;
								anIntArray9386[++i_736_] = i_738_;
								anIntArray9386[++i_736_] = i_738_;
								anIntArray9386[++i_736_] = i_738_;
								anIntArray9386[++i_736_] = i_738_;
								anIntArray9386[++i_736_] = i_738_;
								anIntArray9386[++i_736_] = i_738_;
							} while (--i > 0);
						}
						if (i_744_ > 0) {
							i = i_744_;
							do
								anIntArray9386[++i_736_] = i_738_;
							while (--i > 0);
						}
						i_736_ += i_740_;
					}
				} else if (1 == i_739_) {
					i_738_ = ((i_742_ * (i_738_ & 0xff00ff) >> 8 & 0xff00ff) + (((i_738_ & ~0xff00ff) >>> 8) * i_742_ & ~0xff00ff));
					int i_746_ = 256 - i_742_;
					for (int i_747_ = 0; i_747_ < i_737_; i_747_++) {
						for (int i_748_ = -i_736_; i_748_ < 0; i_748_++) {
							int i_749_ = anIntArray9386[i_741_];
							i_749_ = ((i_746_ * (i_749_ & 0xff00ff) >> 8 & 0xff00ff) + (((i_749_ & ~0xff00ff) >>> 8) * i_746_ & ~0xff00ff));
							anIntArray9386[i_741_++] = i_738_ + i_749_;
						}
						i_741_ += i_740_;
					}
				} else if (2 == i_739_) {
					for (int i_750_ = 0; i_750_ < i_737_; i_750_++) {
						for (int i_751_ = -i_736_; i_751_ < 0; i_751_++) {
							int i_752_ = anIntArray9386[i_741_];
							int i_753_ = i_738_ + i_752_;
							int i_754_ = (i_738_ & 0xff00ff) + (i_752_ & 0xff00ff);
							i_752_ = (i_753_ - i_754_ & 0x10000) + (i_754_ & 0x1000100);
							anIntArray9386[i_741_++] = i_753_ - i_752_ | i_752_ - (i_752_ >>> 8);
						}
						i_741_ += i_740_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method3303(int i, int i_755_, int i_756_, int i_757_, int i_758_, int i_759_) {
		if (null != anIntArray9386) {
			if (i < anInt9383 * 1605202751) {
				i_756_ -= anInt9383 * 1605202751 - i;
				i = anInt9383 * 1605202751;
			}
			if (i_755_ < anInt9392 * -456655989) {
				i_757_ -= anInt9392 * -456655989 - i_755_;
				i_755_ = -456655989 * anInt9392;
			}
			if (i + i_756_ > anInt9391 * 2014358275)
				i_756_ = anInt9391 * 2014358275 - i;
			if (i_755_ + i_757_ > anInt9393 * -383695469)
				i_757_ = -383695469 * anInt9393 - i_755_;
			if (i_756_ > 0 && i_757_ > 0 && i <= 2014358275 * anInt9391 && i_755_ <= -383695469 * anInt9393) {
				int i_760_ = -1173855569 * anInt9387 - i_756_;
				int i_761_ = i + i_755_ * (anInt9387 * -1173855569);
				int i_762_ = i_758_ >>> 24;
				if (i_759_ == 0 || i_759_ == 1 && i_762_ == 255) {
					int i_763_ = i_756_ >> 3;
					int i_764_ = i_756_ & 0x7;
					i_756_ = i_761_ - 1;
					for (int i_765_ = -i_757_; i_765_ < 0; i_765_++) {
						if (i_763_ > 0) {
							i = i_763_;
							do {
								anIntArray9386[++i_756_] = i_758_;
								anIntArray9386[++i_756_] = i_758_;
								anIntArray9386[++i_756_] = i_758_;
								anIntArray9386[++i_756_] = i_758_;
								anIntArray9386[++i_756_] = i_758_;
								anIntArray9386[++i_756_] = i_758_;
								anIntArray9386[++i_756_] = i_758_;
								anIntArray9386[++i_756_] = i_758_;
							} while (--i > 0);
						}
						if (i_764_ > 0) {
							i = i_764_;
							do
								anIntArray9386[++i_756_] = i_758_;
							while (--i > 0);
						}
						i_756_ += i_760_;
					}
				} else if (1 == i_759_) {
					i_758_ = ((i_762_ * (i_758_ & 0xff00ff) >> 8 & 0xff00ff) + (((i_758_ & ~0xff00ff) >>> 8) * i_762_ & ~0xff00ff));
					int i_766_ = 256 - i_762_;
					for (int i_767_ = 0; i_767_ < i_757_; i_767_++) {
						for (int i_768_ = -i_756_; i_768_ < 0; i_768_++) {
							int i_769_ = anIntArray9386[i_761_];
							i_769_ = ((i_766_ * (i_769_ & 0xff00ff) >> 8 & 0xff00ff) + (((i_769_ & ~0xff00ff) >>> 8) * i_766_ & ~0xff00ff));
							anIntArray9386[i_761_++] = i_758_ + i_769_;
						}
						i_761_ += i_760_;
					}
				} else if (2 == i_759_) {
					for (int i_770_ = 0; i_770_ < i_757_; i_770_++) {
						for (int i_771_ = -i_756_; i_771_ < 0; i_771_++) {
							int i_772_ = anIntArray9386[i_761_];
							int i_773_ = i_758_ + i_772_;
							int i_774_ = (i_758_ & 0xff00ff) + (i_772_ & 0xff00ff);
							i_772_ = (i_773_ - i_774_ & 0x10000) + (i_774_ & 0x1000100);
							anIntArray9386[i_761_++] = i_773_ - i_772_ | i_772_ - (i_772_ >>> 8);
						}
						i_761_ += i_760_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public boolean method3316() {
		return false;
	}

	boolean method14859() {
		return aBool9411;
	}

	void method14860(int i, int i_775_, int i_776_, int i_777_, int i_778_, int i_779_, int i_780_, int i_781_) {
		if (anIntArray9386 != null && (i_775_ >= -456655989 * anInt9392 && i_775_ < anInt9393 * -383695469)) {
			int i_782_ = i + i_775_ * (-1173855569 * anInt9387);
			int i_783_ = i_777_ >>> 24;
			int i_784_ = i_780_ + i_779_;
			int i_785_ = i_781_ % i_784_;
			if (0 == i_778_ || 1 == i_778_ && i_783_ == 255) {
				int i_786_ = 0;
				while (i_786_ < i_776_) {
					if (i + i_786_ >= 1605202751 * anInt9383 && i + i_786_ < 2014358275 * anInt9391 && i_785_ < i_779_)
						anIntArray9386[i_782_ + i_786_] = i_777_;
					i_786_++;
					i_785_ = ++i_785_ % i_784_;
				}
			} else if (1 == i_778_) {
				i_777_ = ((i_783_ << 24) + ((i_783_ * (i_777_ & 0xff00ff) >> 8 & 0xff00ff) + (i_783_ * (i_777_ & 0xff00) >> 8 & 0xff00)));
				int i_787_ = 256 - i_783_;
				int i_788_ = 0;
				while (i_788_ < i_776_) {
					if (i_788_ + i >= anInt9383 * 1605202751 && i + i_788_ < anInt9391 * 2014358275 && i_785_ < i_779_) {
						int i_789_ = anIntArray9386[i_782_ + i_788_];
						i_789_ = ((i_787_ * (i_789_ & 0xff00ff) >> 8 & 0xff00ff) + (i_787_ * (i_789_ & 0xff00) >> 8 & 0xff00));
						anIntArray9386[i_782_ + i_788_] = i_777_ + i_789_;
					}
					i_788_++;
					i_785_ = ++i_785_ % i_784_;
				}
			} else if (2 == i_778_) {
				int i_790_ = 0;
				while (i_790_ < i_776_) {
					if (i + i_790_ >= anInt9383 * 1605202751 && i_790_ + i < anInt9391 * 2014358275 && i_785_ < i_779_) {
						int i_791_ = anIntArray9386[i_782_ + i_790_];
						int i_792_ = i_777_ + i_791_;
						int i_793_ = (i_777_ & 0xff00ff) + (i_791_ & 0xff00ff);
						i_791_ = (i_792_ - i_793_ & 0x10000) + (i_793_ & 0x1000100);
						anIntArray9386[i_790_ + i_782_] = i_792_ - i_791_ | i_791_ - (i_791_ >>> 8);
					}
					i_790_++;
					i_785_ = ++i_785_ % i_784_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	Class101 method14861(Runnable runnable) {
		for (int i = 0; i < 1413774429 * anInt9415; i++) {
			if (aClass101Array9416[i].aRunnable1189 == runnable)
				return aClass101Array9416[i];
		}
		return null;
	}

	void method14862(int i, int i_794_, int i_795_, int i_796_, int i_797_, int i_798_, int i_799_, int i_800_) {
		if (anIntArray9386 != null && (i_794_ >= -456655989 * anInt9392 && i_794_ < anInt9393 * -383695469)) {
			int i_801_ = i + i_794_ * (-1173855569 * anInt9387);
			int i_802_ = i_796_ >>> 24;
			int i_803_ = i_799_ + i_798_;
			int i_804_ = i_800_ % i_803_;
			if (0 == i_797_ || 1 == i_797_ && i_802_ == 255) {
				int i_805_ = 0;
				while (i_805_ < i_795_) {
					if (i + i_805_ >= 1605202751 * anInt9383 && i + i_805_ < 2014358275 * anInt9391 && i_804_ < i_798_)
						anIntArray9386[i_801_ + i_805_] = i_796_;
					i_805_++;
					i_804_ = ++i_804_ % i_803_;
				}
			} else if (1 == i_797_) {
				i_796_ = ((i_802_ << 24) + ((i_802_ * (i_796_ & 0xff00ff) >> 8 & 0xff00ff) + (i_802_ * (i_796_ & 0xff00) >> 8 & 0xff00)));
				int i_806_ = 256 - i_802_;
				int i_807_ = 0;
				while (i_807_ < i_795_) {
					if (i_807_ + i >= anInt9383 * 1605202751 && i + i_807_ < anInt9391 * 2014358275 && i_804_ < i_798_) {
						int i_808_ = anIntArray9386[i_801_ + i_807_];
						i_808_ = ((i_806_ * (i_808_ & 0xff00ff) >> 8 & 0xff00ff) + (i_806_ * (i_808_ & 0xff00) >> 8 & 0xff00));
						anIntArray9386[i_801_ + i_807_] = i_796_ + i_808_;
					}
					i_807_++;
					i_804_ = ++i_804_ % i_803_;
				}
			} else if (2 == i_797_) {
				int i_809_ = 0;
				while (i_809_ < i_795_) {
					if (i + i_809_ >= anInt9383 * 1605202751 && i_809_ + i < anInt9391 * 2014358275 && i_804_ < i_798_) {
						int i_810_ = anIntArray9386[i_801_ + i_809_];
						int i_811_ = i_796_ + i_810_;
						int i_812_ = (i_796_ & 0xff00ff) + (i_810_ & 0xff00ff);
						i_810_ = (i_811_ - i_812_ & 0x10000) + (i_812_ & 0x1000100);
						anIntArray9386[i_809_ + i_801_] = i_811_ - i_810_ | i_810_ - (i_810_ >>> 8);
					}
					i_809_++;
					i_804_ = ++i_804_ % i_803_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public void method3257(boolean bool) {
		/* empty */
	}

	public boolean method3086() {
		return false;
	}

	void method3305(int i, int i_813_, int i_814_, int i_815_, int i_816_) {
		if (anIntArray9386 != null && (i_813_ >= anInt9392 * -456655989 && i_813_ < -383695469 * anInt9393)) {
			if (i < 1605202751 * anInt9383) {
				i_814_ -= 1605202751 * anInt9383 - i;
				i = anInt9383 * 1605202751;
			}
			if (i_814_ + i > anInt9391 * 2014358275)
				i_814_ = anInt9391 * 2014358275 - i;
			int i_817_ = i_813_ * (anInt9387 * -1173855569) + i;
			int i_818_ = i_815_ >>> 24;
			if (0 == i_816_ || i_816_ == 1 && i_818_ == 255) {
				for (int i_819_ = 0; i_819_ < i_814_; i_819_++)
					anIntArray9386[i_817_ + i_819_] = i_815_;
			} else if (i_816_ == 1) {
				i_815_ = (((i_815_ & 0xff00) * i_818_ >> 8 & 0xff00) + (i_818_ * (i_815_ & 0xff00ff) >> 8 & 0xff00ff) + (i_818_ << 24));
				int i_820_ = 256 - i_818_;
				for (int i_821_ = 0; i_821_ < i_814_; i_821_++) {
					int i_822_ = anIntArray9386[i_821_ + i_817_];
					i_822_ = ((i_820_ * (i_822_ & 0xff00ff) >> 8 & 0xff00ff) + (i_820_ * (i_822_ & 0xff00) >> 8 & 0xff00));
					anIntArray9386[i_821_ + i_817_] = i_822_ + i_815_;
				}
			} else if (i_816_ == 2) {
				for (int i_823_ = 0; i_823_ < i_814_; i_823_++) {
					int i_824_ = anIntArray9386[i_817_ + i_823_];
					int i_825_ = i_815_ + i_824_;
					int i_826_ = (i_815_ & 0xff00ff) + (i_824_ & 0xff00ff);
					i_824_ = (i_826_ & 0x1000100) + (i_825_ - i_826_ & 0x10000);
					anIntArray9386[i_817_ + i_823_] = i_825_ - i_824_ | i_824_ - (i_824_ >>> 8);
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public void method3186(int i, int i_827_, int i_828_, int i_829_, int i_830_, int i_831_) {
		if (anIntArray9386 != null) {
			i_828_ -= i;
			i_829_ -= i_827_;
			if (0 == i_829_) {
				if (i_828_ >= 0)
					method3410(i, i_827_, i_828_ + 1, i_830_, i_831_);
				else
					method3410(i + i_828_, i_827_, -i_828_ + 1, i_830_, i_831_);
			} else if (i_828_ == 0) {
				if (i_829_ >= 0)
					method3148(i, i_827_, i_829_ + 1, i_830_, i_831_);
				else
					method3148(i, i_829_ + i_827_, 1 + -i_829_, i_830_, i_831_);
			} else {
				if (i_828_ + i_829_ < 0) {
					i += i_828_;
					i_828_ = -i_828_;
					i_827_ += i_829_;
					i_829_ = -i_829_;
				}
				if (i_828_ > i_829_) {
					i_827_ <<= 16;
					i_827_ += 32768;
					i_829_ <<= 16;
					int i_832_ = (int) Math.floor(0.5 + ((double) i_829_ / (double) i_828_));
					i_828_ += i;
					if (i < 1605202751 * anInt9383) {
						i_827_ += (anInt9383 * 1605202751 - i) * i_832_;
						i = anInt9383 * 1605202751;
					}
					if (i_828_ >= 2014358275 * anInt9391)
						i_828_ = anInt9391 * 2014358275 - 1;
					int i_833_ = i_830_ >>> 24;
					if (0 == i_831_ || i_831_ == 1 && 255 == i_833_) {
						for (/**/; i <= i_828_; i++) {
							int i_834_ = i_827_ >> 16;
							if (i_834_ >= anInt9392 * -456655989 && i_834_ < anInt9393 * -383695469)
								anIntArray9386[i_834_ * (-1173855569 * anInt9387) + i] = i_830_;
							i_827_ += i_832_;
						}
					} else if (1 == i_831_) {
						i_830_ = ((i_833_ << 24) + ((i_833_ * (i_830_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_830_ & 0xff00) * i_833_ >> 8 & 0xff00)));
						int i_835_ = 256 - i_833_;
						for (/**/; i <= i_828_; i++) {
							int i_836_ = i_827_ >> 16;
							if (i_836_ >= anInt9392 * -456655989 && i_836_ < anInt9393 * -383695469) {
								int i_837_ = i + i_836_ * (anInt9387 * -1173855569);
								int i_838_ = anIntArray9386[i_837_];
								i_838_ = (((i_838_ & 0xff00) * i_835_ >> 8 & 0xff00) + (i_835_ * (i_838_ & 0xff00ff) >> 8 & 0xff00ff));
								anIntArray9386[i_837_] = i_830_ + i_838_;
							}
							i_827_ += i_832_;
						}
					} else if (2 == i_831_) {
						for (/**/; i <= i_828_; i++) {
							int i_839_ = i_827_ >> 16;
							if (i_839_ >= -456655989 * anInt9392 && i_839_ < -383695469 * anInt9393) {
								int i_840_ = i + anInt9387 * -1173855569 * i_839_;
								int i_841_ = anIntArray9386[i_840_];
								int i_842_ = i_841_ + i_830_;
								int i_843_ = ((i_830_ & 0xff00ff) + (i_841_ & 0xff00ff));
								i_841_ = ((i_842_ - i_843_ & 0x10000) + (i_843_ & 0x1000100));
								anIntArray9386[i_840_] = i_842_ - i_841_ | i_841_ - (i_841_ >>> 8);
							}
							i_827_ += i_832_;
						}
					} else
						throw new IllegalArgumentException();
				} else {
					i <<= 16;
					i += 32768;
					i_828_ <<= 16;
					int i_844_ = (int) Math.floor((double) i_828_ / (double) i_829_ + 0.5);
					i_829_ += i_827_;
					if (i_827_ < anInt9392 * -456655989) {
						i += (-456655989 * anInt9392 - i_827_) * i_844_;
						i_827_ = anInt9392 * -456655989;
					}
					if (i_829_ >= -383695469 * anInt9393)
						i_829_ = anInt9393 * -383695469 - 1;
					int i_845_ = i_830_ >>> 24;
					if (0 == i_831_ || i_831_ == 1 && 255 == i_845_) {
						for (/**/; i_827_ <= i_829_; i_827_++) {
							int i_846_ = i >> 16;
							if (i_846_ >= anInt9383 * 1605202751 && i_846_ < anInt9391 * 2014358275)
								anIntArray9386[anInt9387 * -1173855569 * i_827_ + i_846_] = i_830_;
							i += i_844_;
						}
					} else if (1 == i_831_) {
						i_830_ = ((i_845_ << 24) + (((i_830_ & 0xff00ff) * i_845_ >> 8 & 0xff00ff) + ((i_830_ & 0xff00) * i_845_ >> 8 & 0xff00)));
						int i_847_ = 256 - i_845_;
						for (/**/; i_827_ <= i_829_; i_827_++) {
							int i_848_ = i >> 16;
							if (i_848_ >= anInt9383 * 1605202751 && i_848_ < anInt9391 * 2014358275) {
								int i_849_ = i_848_ + i_827_ * (-1173855569 * anInt9387);
								int i_850_ = anIntArray9386[i_849_];
								i_850_ = ((i_847_ * (i_850_ & 0xff00) >> 8 & 0xff00) + ((i_850_ & 0xff00ff) * i_847_ >> 8 & 0xff00ff));
								anIntArray9386[(i_848_ + i_827_ * (anInt9387 * -1173855569))] = i_830_ + i_850_;
							}
							i += i_844_;
						}
					} else if (i_831_ == 2) {
						for (/**/; i_827_ <= i_829_; i_827_++) {
							int i_851_ = i >> 16;
							if (i_851_ >= anInt9383 * 1605202751 && i_851_ < anInt9391 * 2014358275) {
								int i_852_ = (i_827_ * (-1173855569 * anInt9387) + i_851_);
								int i_853_ = anIntArray9386[i_852_];
								int i_854_ = i_853_ + i_830_;
								int i_855_ = ((i_830_ & 0xff00ff) + (i_853_ & 0xff00ff));
								i_853_ = ((i_854_ - i_855_ & 0x10000) + (i_855_ & 0x1000100));
								anIntArray9386[i_852_] = i_854_ - i_853_ | i_853_ - (i_853_ >>> 8);
							}
							i += i_844_;
						}
					} else
						throw new IllegalArgumentException();
				}
			}
		}
	}

	public void method3395(int i, int i_856_, int i_857_, int i_858_, int i_859_, int i_860_) {
		if (anIntArray9386 != null) {
			i_857_ -= i;
			i_858_ -= i_856_;
			if (0 == i_858_) {
				if (i_857_ >= 0)
					method3410(i, i_856_, i_857_ + 1, i_859_, i_860_);
				else
					method3410(i + i_857_, i_856_, -i_857_ + 1, i_859_, i_860_);
			} else if (i_857_ == 0) {
				if (i_858_ >= 0)
					method3148(i, i_856_, i_858_ + 1, i_859_, i_860_);
				else
					method3148(i, i_858_ + i_856_, 1 + -i_858_, i_859_, i_860_);
			} else {
				if (i_857_ + i_858_ < 0) {
					i += i_857_;
					i_857_ = -i_857_;
					i_856_ += i_858_;
					i_858_ = -i_858_;
				}
				if (i_857_ > i_858_) {
					i_856_ <<= 16;
					i_856_ += 32768;
					i_858_ <<= 16;
					int i_861_ = (int) Math.floor(0.5 + ((double) i_858_ / (double) i_857_));
					i_857_ += i;
					if (i < 1605202751 * anInt9383) {
						i_856_ += (anInt9383 * 1605202751 - i) * i_861_;
						i = anInt9383 * 1605202751;
					}
					if (i_857_ >= 2014358275 * anInt9391)
						i_857_ = anInt9391 * 2014358275 - 1;
					int i_862_ = i_859_ >>> 24;
					if (0 == i_860_ || i_860_ == 1 && 255 == i_862_) {
						for (/**/; i <= i_857_; i++) {
							int i_863_ = i_856_ >> 16;
							if (i_863_ >= anInt9392 * -456655989 && i_863_ < anInt9393 * -383695469)
								anIntArray9386[i_863_ * (-1173855569 * anInt9387) + i] = i_859_;
							i_856_ += i_861_;
						}
					} else if (1 == i_860_) {
						i_859_ = ((i_862_ << 24) + ((i_862_ * (i_859_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_859_ & 0xff00) * i_862_ >> 8 & 0xff00)));
						int i_864_ = 256 - i_862_;
						for (/**/; i <= i_857_; i++) {
							int i_865_ = i_856_ >> 16;
							if (i_865_ >= anInt9392 * -456655989 && i_865_ < anInt9393 * -383695469) {
								int i_866_ = i + i_865_ * (anInt9387 * -1173855569);
								int i_867_ = anIntArray9386[i_866_];
								i_867_ = (((i_867_ & 0xff00) * i_864_ >> 8 & 0xff00) + (i_864_ * (i_867_ & 0xff00ff) >> 8 & 0xff00ff));
								anIntArray9386[i_866_] = i_859_ + i_867_;
							}
							i_856_ += i_861_;
						}
					} else if (2 == i_860_) {
						for (/**/; i <= i_857_; i++) {
							int i_868_ = i_856_ >> 16;
							if (i_868_ >= -456655989 * anInt9392 && i_868_ < -383695469 * anInt9393) {
								int i_869_ = i + anInt9387 * -1173855569 * i_868_;
								int i_870_ = anIntArray9386[i_869_];
								int i_871_ = i_870_ + i_859_;
								int i_872_ = ((i_859_ & 0xff00ff) + (i_870_ & 0xff00ff));
								i_870_ = ((i_871_ - i_872_ & 0x10000) + (i_872_ & 0x1000100));
								anIntArray9386[i_869_] = i_871_ - i_870_ | i_870_ - (i_870_ >>> 8);
							}
							i_856_ += i_861_;
						}
					} else
						throw new IllegalArgumentException();
				} else {
					i <<= 16;
					i += 32768;
					i_857_ <<= 16;
					int i_873_ = (int) Math.floor((double) i_857_ / (double) i_858_ + 0.5);
					i_858_ += i_856_;
					if (i_856_ < anInt9392 * -456655989) {
						i += (-456655989 * anInt9392 - i_856_) * i_873_;
						i_856_ = anInt9392 * -456655989;
					}
					if (i_858_ >= -383695469 * anInt9393)
						i_858_ = anInt9393 * -383695469 - 1;
					int i_874_ = i_859_ >>> 24;
					if (0 == i_860_ || i_860_ == 1 && 255 == i_874_) {
						for (/**/; i_856_ <= i_858_; i_856_++) {
							int i_875_ = i >> 16;
							if (i_875_ >= anInt9383 * 1605202751 && i_875_ < anInt9391 * 2014358275)
								anIntArray9386[anInt9387 * -1173855569 * i_856_ + i_875_] = i_859_;
							i += i_873_;
						}
					} else if (1 == i_860_) {
						i_859_ = ((i_874_ << 24) + (((i_859_ & 0xff00ff) * i_874_ >> 8 & 0xff00ff) + ((i_859_ & 0xff00) * i_874_ >> 8 & 0xff00)));
						int i_876_ = 256 - i_874_;
						for (/**/; i_856_ <= i_858_; i_856_++) {
							int i_877_ = i >> 16;
							if (i_877_ >= anInt9383 * 1605202751 && i_877_ < anInt9391 * 2014358275) {
								int i_878_ = i_877_ + i_856_ * (-1173855569 * anInt9387);
								int i_879_ = anIntArray9386[i_878_];
								i_879_ = ((i_876_ * (i_879_ & 0xff00) >> 8 & 0xff00) + ((i_879_ & 0xff00ff) * i_876_ >> 8 & 0xff00ff));
								anIntArray9386[(i_877_ + i_856_ * (anInt9387 * -1173855569))] = i_859_ + i_879_;
							}
							i += i_873_;
						}
					} else if (i_860_ == 2) {
						for (/**/; i_856_ <= i_858_; i_856_++) {
							int i_880_ = i >> 16;
							if (i_880_ >= anInt9383 * 1605202751 && i_880_ < anInt9391 * 2014358275) {
								int i_881_ = (i_856_ * (-1173855569 * anInt9387) + i_880_);
								int i_882_ = anIntArray9386[i_881_];
								int i_883_ = i_882_ + i_859_;
								int i_884_ = ((i_859_ & 0xff00ff) + (i_882_ & 0xff00ff));
								i_882_ = ((i_883_ - i_884_ & 0x10000) + (i_884_ & 0x1000100));
								anIntArray9386[i_881_] = i_883_ - i_882_ | i_882_ - (i_882_ >>> 8);
							}
							i += i_873_;
						}
					} else
						throw new IllegalArgumentException();
				}
			}
		}
	}

	public void method3463(int i, int i_885_, int i_886_, int i_887_, int i_888_, int i_889_) {
		if (anIntArray9386 != null) {
			i_886_ -= i;
			i_887_ -= i_885_;
			if (0 == i_887_) {
				if (i_886_ >= 0)
					method3410(i, i_885_, i_886_ + 1, i_888_, i_889_);
				else
					method3410(i + i_886_, i_885_, -i_886_ + 1, i_888_, i_889_);
			} else if (i_886_ == 0) {
				if (i_887_ >= 0)
					method3148(i, i_885_, i_887_ + 1, i_888_, i_889_);
				else
					method3148(i, i_887_ + i_885_, 1 + -i_887_, i_888_, i_889_);
			} else {
				if (i_886_ + i_887_ < 0) {
					i += i_886_;
					i_886_ = -i_886_;
					i_885_ += i_887_;
					i_887_ = -i_887_;
				}
				if (i_886_ > i_887_) {
					i_885_ <<= 16;
					i_885_ += 32768;
					i_887_ <<= 16;
					int i_890_ = (int) Math.floor(0.5 + ((double) i_887_ / (double) i_886_));
					i_886_ += i;
					if (i < 1605202751 * anInt9383) {
						i_885_ += (anInt9383 * 1605202751 - i) * i_890_;
						i = anInt9383 * 1605202751;
					}
					if (i_886_ >= 2014358275 * anInt9391)
						i_886_ = anInt9391 * 2014358275 - 1;
					int i_891_ = i_888_ >>> 24;
					if (0 == i_889_ || i_889_ == 1 && 255 == i_891_) {
						for (/**/; i <= i_886_; i++) {
							int i_892_ = i_885_ >> 16;
							if (i_892_ >= anInt9392 * -456655989 && i_892_ < anInt9393 * -383695469)
								anIntArray9386[i_892_ * (-1173855569 * anInt9387) + i] = i_888_;
							i_885_ += i_890_;
						}
					} else if (1 == i_889_) {
						i_888_ = ((i_891_ << 24) + ((i_891_ * (i_888_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_888_ & 0xff00) * i_891_ >> 8 & 0xff00)));
						int i_893_ = 256 - i_891_;
						for (/**/; i <= i_886_; i++) {
							int i_894_ = i_885_ >> 16;
							if (i_894_ >= anInt9392 * -456655989 && i_894_ < anInt9393 * -383695469) {
								int i_895_ = i + i_894_ * (anInt9387 * -1173855569);
								int i_896_ = anIntArray9386[i_895_];
								i_896_ = (((i_896_ & 0xff00) * i_893_ >> 8 & 0xff00) + (i_893_ * (i_896_ & 0xff00ff) >> 8 & 0xff00ff));
								anIntArray9386[i_895_] = i_888_ + i_896_;
							}
							i_885_ += i_890_;
						}
					} else if (2 == i_889_) {
						for (/**/; i <= i_886_; i++) {
							int i_897_ = i_885_ >> 16;
							if (i_897_ >= -456655989 * anInt9392 && i_897_ < -383695469 * anInt9393) {
								int i_898_ = i + anInt9387 * -1173855569 * i_897_;
								int i_899_ = anIntArray9386[i_898_];
								int i_900_ = i_899_ + i_888_;
								int i_901_ = ((i_888_ & 0xff00ff) + (i_899_ & 0xff00ff));
								i_899_ = ((i_900_ - i_901_ & 0x10000) + (i_901_ & 0x1000100));
								anIntArray9386[i_898_] = i_900_ - i_899_ | i_899_ - (i_899_ >>> 8);
							}
							i_885_ += i_890_;
						}
					} else
						throw new IllegalArgumentException();
				} else {
					i <<= 16;
					i += 32768;
					i_886_ <<= 16;
					int i_902_ = (int) Math.floor((double) i_886_ / (double) i_887_ + 0.5);
					i_887_ += i_885_;
					if (i_885_ < anInt9392 * -456655989) {
						i += (-456655989 * anInt9392 - i_885_) * i_902_;
						i_885_ = anInt9392 * -456655989;
					}
					if (i_887_ >= -383695469 * anInt9393)
						i_887_ = anInt9393 * -383695469 - 1;
					int i_903_ = i_888_ >>> 24;
					if (0 == i_889_ || i_889_ == 1 && 255 == i_903_) {
						for (/**/; i_885_ <= i_887_; i_885_++) {
							int i_904_ = i >> 16;
							if (i_904_ >= anInt9383 * 1605202751 && i_904_ < anInt9391 * 2014358275)
								anIntArray9386[anInt9387 * -1173855569 * i_885_ + i_904_] = i_888_;
							i += i_902_;
						}
					} else if (1 == i_889_) {
						i_888_ = ((i_903_ << 24) + (((i_888_ & 0xff00ff) * i_903_ >> 8 & 0xff00ff) + ((i_888_ & 0xff00) * i_903_ >> 8 & 0xff00)));
						int i_905_ = 256 - i_903_;
						for (/**/; i_885_ <= i_887_; i_885_++) {
							int i_906_ = i >> 16;
							if (i_906_ >= anInt9383 * 1605202751 && i_906_ < anInt9391 * 2014358275) {
								int i_907_ = i_906_ + i_885_ * (-1173855569 * anInt9387);
								int i_908_ = anIntArray9386[i_907_];
								i_908_ = ((i_905_ * (i_908_ & 0xff00) >> 8 & 0xff00) + ((i_908_ & 0xff00ff) * i_905_ >> 8 & 0xff00ff));
								anIntArray9386[(i_906_ + i_885_ * (anInt9387 * -1173855569))] = i_888_ + i_908_;
							}
							i += i_902_;
						}
					} else if (i_889_ == 2) {
						for (/**/; i_885_ <= i_887_; i_885_++) {
							int i_909_ = i >> 16;
							if (i_909_ >= anInt9383 * 1605202751 && i_909_ < anInt9391 * 2014358275) {
								int i_910_ = (i_885_ * (-1173855569 * anInt9387) + i_909_);
								int i_911_ = anIntArray9386[i_910_];
								int i_912_ = i_911_ + i_888_;
								int i_913_ = ((i_888_ & 0xff00ff) + (i_911_ & 0xff00ff));
								i_911_ = ((i_912_ - i_913_ & 0x10000) + (i_913_ & 0x1000100));
								anIntArray9386[i_910_] = i_912_ - i_911_ | i_911_ - (i_911_ >>> 8);
							}
							i += i_902_;
						}
					} else
						throw new IllegalArgumentException();
				}
			}
		}
	}

	public int method3304() {
		return 0;
	}

	public Class427 method3355() {
		Class101 class101 = method14835(Thread.currentThread());
		return class101.aClass427_1212;
	}

	public int method3345(int i, int i_914_) {
		i |= 0x20800;
		return i & i_914_ ^ i_914_;
	}

	public void method3313(int i, int i_915_, int i_916_, int i_917_, int i_918_, int i_919_, Class142 class142, int i_920_, int i_921_) {
		if (null != anIntArray9386) {
			Class142_Sub1 class142_sub1 = (Class142_Sub1) class142;
			int[] is = class142_sub1.anIntArray9002;
			int[] is_922_ = class142_sub1.anIntArray9003;
			int i_923_ = (anInt9392 * -456655989 > i_921_ ? -456655989 * anInt9392 : i_921_);
			int i_924_ = (anInt9393 * -383695469 < is.length + i_921_ ? -383695469 * anInt9393 : i_921_ + is.length);
			i_916_ -= i;
			i_917_ -= i_915_;
			if (i_917_ + i_916_ < 0) {
				i += i_916_;
				i_916_ = -i_916_;
				i_915_ += i_917_;
				i_917_ = -i_917_;
			}
			if (i_916_ > i_917_) {
				i_915_ <<= 16;
				i_915_ += 32768;
				i_917_ <<= 16;
				int i_925_ = (int) Math.floor((double) i_917_ / (double) i_916_ + 0.5);
				i_916_ += i;
				if (i < anInt9383 * 1605202751) {
					i_915_ += i_925_ * (anInt9383 * 1605202751 - i);
					i = anInt9383 * 1605202751;
				}
				if (i_916_ >= 2014358275 * anInt9391)
					i_916_ = 2014358275 * anInt9391 - 1;
				int i_926_ = i_918_ >>> 24;
				if (0 == i_919_ || 1 == i_919_ && 255 == i_926_) {
					for (/**/; i <= i_916_; i++) {
						int i_927_ = i_915_ >> 16;
						int i_928_ = i_927_ - i_921_;
						if (i_927_ >= i_923_ && i_927_ < i_924_) {
							int i_929_ = i_920_ + is[i_928_];
							if (i >= i_929_ && i < is_922_[i_928_] + i_929_)
								anIntArray9386[i_927_ * (anInt9387 * -1173855569) + i] = i_918_;
						}
						i_915_ += i_925_;
					}
				} else if (1 == i_919_) {
					i_918_ = ((i_926_ << 24) + (((i_918_ & 0xff00) * i_926_ >> 8 & 0xff00) + ((i_918_ & 0xff00ff) * i_926_ >> 8 & 0xff00ff)));
					int i_930_ = 256 - i_926_;
					for (/**/; i <= i_916_; i++) {
						int i_931_ = i_915_ >> 16;
						int i_932_ = i_931_ - i_921_;
						if (i_931_ >= i_923_ && i_931_ < i_924_) {
							int i_933_ = i_920_ + is[i_932_];
							if (i >= i_933_ && i < is_922_[i_932_] + i_933_) {
								int i_934_ = i + anInt9387 * -1173855569 * i_931_;
								int i_935_ = anIntArray9386[i_934_];
								i_935_ = ((i_930_ * (i_935_ & 0xff00ff) >> 8 & 0xff00ff) + (i_930_ * (i_935_ & 0xff00) >> 8 & 0xff00));
								anIntArray9386[i_934_] = i_918_ + i_935_;
							}
						}
						i_915_ += i_925_;
					}
				} else if (2 == i_919_) {
					for (/**/; i <= i_916_; i++) {
						int i_936_ = i_915_ >> 16;
						int i_937_ = i_936_ - i_921_;
						if (i_936_ >= i_923_ && i_936_ < i_924_) {
							int i_938_ = is[i_937_] + i_920_;
							if (i >= i_938_ && i < is_922_[i_937_] + i_938_) {
								int i_939_ = i + -1173855569 * anInt9387 * i_936_;
								int i_940_ = anIntArray9386[i_939_];
								int i_941_ = i_918_ + i_940_;
								int i_942_ = ((i_940_ & 0xff00ff) + (i_918_ & 0xff00ff));
								i_940_ = ((i_941_ - i_942_ & 0x10000) + (i_942_ & 0x1000100));
								anIntArray9386[i_939_] = i_941_ - i_940_ | i_940_ - (i_940_ >>> 8);
							}
						}
						i_915_ += i_925_;
					}
				} else
					throw new IllegalArgumentException();
			} else {
				i <<= 16;
				i += 32768;
				i_916_ <<= 16;
				int i_943_ = (int) Math.floor((double) i_916_ / (double) i_917_ + 0.5);
				i_917_ += i_915_;
				if (i_915_ < i_923_) {
					i += i_943_ * (i_923_ - i_915_);
					i_915_ = i_923_;
				}
				if (i_917_ >= i_924_)
					i_917_ = i_924_ - 1;
				int i_944_ = i_918_ >>> 24;
				if (0 == i_919_ || i_919_ == 1 && i_944_ == 255) {
					for (/**/; i_915_ <= i_917_; i_915_++) {
						int i_945_ = i >> 16;
						int i_946_ = i_915_ - i_921_;
						int i_947_ = is[i_946_] + i_920_;
						if (i_945_ >= 1605202751 * anInt9383 && i_945_ < 2014358275 * anInt9391 && i_945_ >= i_947_ && i_945_ < i_947_ + is_922_[i_946_])
							anIntArray9386[i_945_ + i_915_ * (-1173855569 * anInt9387)] = i_918_;
						i += i_943_;
					}
				} else if (i_919_ == 1) {
					i_918_ = ((i_944_ << 24) + (((i_918_ & 0xff00) * i_944_ >> 8 & 0xff00) + (i_944_ * (i_918_ & 0xff00ff) >> 8 & 0xff00ff)));
					int i_948_ = 256 - i_944_;
					for (/**/; i_915_ <= i_917_; i_915_++) {
						int i_949_ = i >> 16;
						int i_950_ = i_915_ - i_921_;
						int i_951_ = is[i_950_] + i_920_;
						if (i_949_ >= anInt9383 * 1605202751 && i_949_ < 2014358275 * anInt9391 && i_949_ >= i_951_ && i_949_ < is_922_[i_950_] + i_951_) {
							int i_952_ = i_915_ * (-1173855569 * anInt9387) + i_949_;
							int i_953_ = anIntArray9386[i_952_];
							i_953_ = (((i_953_ & 0xff00) * i_948_ >> 8 & 0xff00) + ((i_953_ & 0xff00ff) * i_948_ >> 8 & 0xff00ff));
							anIntArray9386[(i_915_ * (-1173855569 * anInt9387) + i_949_)] = i_918_ + i_953_;
						}
						i += i_943_;
					}
				} else if (i_919_ == 2) {
					for (/**/; i_915_ <= i_917_; i_915_++) {
						int i_954_ = i >> 16;
						int i_955_ = i_915_ - i_921_;
						int i_956_ = is[i_955_] + i_920_;
						if (i_954_ >= anInt9383 * 1605202751 && i_954_ < 2014358275 * anInt9391 && i_954_ >= i_956_ && i_954_ < i_956_ + is_922_[i_955_]) {
							int i_957_ = i_954_ + anInt9387 * -1173855569 * i_915_;
							int i_958_ = anIntArray9386[i_957_];
							int i_959_ = i_958_ + i_918_;
							int i_960_ = (i_918_ & 0xff00ff) + (i_958_ & 0xff00ff);
							i_958_ = (i_960_ & 0x1000100) + (i_959_ - i_960_ & 0x10000);
							anIntArray9386[i_957_] = i_959_ - i_958_ | i_958_ - (i_958_ >>> 8);
						}
						i += i_943_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method3231(int i, int i_961_, int i_962_, int i_963_, int i_964_, int i_965_, int i_966_) {
		if (anIntArray9386 != null) {
			Class101 class101 = method14835(Thread.currentThread());
			Class119 class119 = class101.aClass119_1197;
			int i_967_ = i_962_ - i;
			int i_968_ = i_963_ - i_961_;
			int i_969_ = i_967_ >= 0 ? i_967_ : -i_967_;
			int i_970_ = i_968_ >= 0 ? i_968_ : -i_968_;
			int i_971_ = i_969_;
			if (i_971_ < i_970_)
				i_971_ = i_970_;
			if (i_971_ != 0) {
				int i_972_ = (i_967_ << 16) / i_971_;
				int i_973_ = (i_968_ << 16) / i_971_;
				i_967_ += i_972_ >> 16;
				i_968_ += i_973_ >> 16;
				if (i_973_ <= i_972_)
					i_972_ = -i_972_;
				else
					i_973_ = -i_973_;
				int i_974_ = i_973_ * i_965_ >> 17;
				int i_975_ = 1 + i_973_ * i_965_ >> 17;
				int i_976_ = i_965_ * i_972_ >> 17;
				int i_977_ = 1 + i_972_ * i_965_ >> 17;
				i -= class119.method2083();
				i_961_ -= class119.method2071();
				int i_978_ = i_974_ + i;
				int i_979_ = i - i_975_;
				int i_980_ = i + i_967_ - i_975_;
				int i_981_ = i + i_967_ + i_974_;
				int i_982_ = i_961_ + i_976_;
				int i_983_ = i_961_ - i_977_;
				int i_984_ = i_968_ + i_961_ - i_977_;
				int i_985_ = i_976_ + (i_961_ + i_968_);
				if (i_966_ == 0)
					class119.anInt1441 = 0;
				else if (i_966_ == 1)
					class119.anInt1441 = 255 - (i_964_ >>> 24);
				else
					throw new IllegalArgumentException();
				method3182(false);
				class119.aBool1445 = (i_978_ < 0 || i_978_ > class119.anInt1442 || i_979_ < 0 || i_979_ > class119.anInt1442 || i_980_ < 0 || i_980_ > class119.anInt1442);
				class119.method2077(true, false, false, (float) i_982_, (float) i_983_, (float) i_984_, (float) i_978_, (float) i_979_, (float) i_980_, 100.0F, 100.0F, 100.0F, i_964_);
				class119.aBool1445 = (i_978_ < 0 || i_978_ > class119.anInt1442 || i_980_ < 0 || i_980_ > class119.anInt1442 || i_981_ < 0 || i_981_ > class119.anInt1442);
				class119.method2077(true, false, false, (float) i_982_, (float) i_984_, (float) i_985_, (float) i_978_, (float) i_980_, (float) i_981_, 100.0F, 100.0F, 100.0F, i_964_);
				method3182(true);
			}
		}
	}

	public void method3177(int i, int i_986_, int i_987_, int i_988_, int i_989_, int i_990_, int i_991_) {
		if (anIntArray9386 != null) {
			Class101 class101 = method14835(Thread.currentThread());
			Class119 class119 = class101.aClass119_1197;
			int i_992_ = i_987_ - i;
			int i_993_ = i_988_ - i_986_;
			int i_994_ = i_992_ >= 0 ? i_992_ : -i_992_;
			int i_995_ = i_993_ >= 0 ? i_993_ : -i_993_;
			int i_996_ = i_994_;
			if (i_996_ < i_995_)
				i_996_ = i_995_;
			if (i_996_ != 0) {
				int i_997_ = (i_992_ << 16) / i_996_;
				int i_998_ = (i_993_ << 16) / i_996_;
				i_992_ += i_997_ >> 16;
				i_993_ += i_998_ >> 16;
				if (i_998_ <= i_997_)
					i_997_ = -i_997_;
				else
					i_998_ = -i_998_;
				int i_999_ = i_998_ * i_990_ >> 17;
				int i_1000_ = 1 + i_998_ * i_990_ >> 17;
				int i_1001_ = i_990_ * i_997_ >> 17;
				int i_1002_ = 1 + i_997_ * i_990_ >> 17;
				i -= class119.method2083();
				i_986_ -= class119.method2071();
				int i_1003_ = i_999_ + i;
				int i_1004_ = i - i_1000_;
				int i_1005_ = i + i_992_ - i_1000_;
				int i_1006_ = i + i_992_ + i_999_;
				int i_1007_ = i_986_ + i_1001_;
				int i_1008_ = i_986_ - i_1002_;
				int i_1009_ = i_993_ + i_986_ - i_1002_;
				int i_1010_ = i_1001_ + (i_986_ + i_993_);
				if (i_991_ == 0)
					class119.anInt1441 = 0;
				else if (i_991_ == 1)
					class119.anInt1441 = 255 - (i_989_ >>> 24);
				else
					throw new IllegalArgumentException();
				method3182(false);
				class119.aBool1445 = (i_1003_ < 0 || i_1003_ > class119.anInt1442 || i_1004_ < 0 || i_1004_ > class119.anInt1442 || i_1005_ < 0 || i_1005_ > class119.anInt1442);
				class119.method2077(true, false, false, (float) i_1007_, (float) i_1008_, (float) i_1009_, (float) i_1003_, (float) i_1004_, (float) i_1005_, 100.0F, 100.0F, 100.0F, i_989_);
				class119.aBool1445 = (i_1003_ < 0 || i_1003_ > class119.anInt1442 || i_1005_ < 0 || i_1005_ > class119.anInt1442 || i_1006_ < 0 || i_1006_ > class119.anInt1442);
				class119.method2077(true, false, false, (float) i_1007_, (float) i_1009_, (float) i_1010_, (float) i_1003_, (float) i_1005_, (float) i_1006_, 100.0F, 100.0F, 100.0F, i_989_);
				method3182(true);
			}
		}
	}

	void method14863() {
		aClass427_9398.method6784(aClass432_9420);
		aClass427_9403.method6750(aClass427_9398);
		aClass427_9403.method6751(aClass427_9402);
		aClass427_9403.method6760(aFloatArrayArray9404[0]);
		aClass427_9403.method6761(aFloatArrayArray9404[1]);
		aClass427_9403.method6756(aFloatArrayArray9404[2]);
		aClass427_9403.method6757(aFloatArrayArray9404[3]);
		aClass427_9403.method6758(aFloatArrayArray9404[4]);
		aClass427_9403.method6779(aFloatArrayArray9404[5]);
		float f = aClass427_9402.method6755();
		float f_1011_ = (aClass427_9402.aFloatArray4807[10] * (f - 255.0F) + aClass427_9402.aFloatArray4807[14]);
		float f_1012_ = (aClass427_9402.aFloatArray4807[10] * f + aClass427_9402.aFloatArray4807[14]);
		float f_1013_ = f_1012_ - f_1011_;
		for (int i = 0; i < 1413774429 * anInt9415; i++) {
			Class101 class101 = aClass101Array9416[i];
			class101.aFloat1192 = f_1011_;
			class101.aFloat1193 = f_1013_;
		}
	}

	public int method3317(int i, int i_1014_, int i_1015_, int i_1016_, int i_1017_, int i_1018_) {
		int i_1019_ = 0;
		float f = (aClass427_9403.aFloatArray4807[6] * (float) i_1014_ + (aClass427_9403.aFloatArray4807[14] + (float) i * aClass427_9403.aFloatArray4807[2]) + (float) i_1015_ * aClass427_9403.aFloatArray4807[10]);
		float f_1020_ = ((float) i_1017_ * aClass427_9403.aFloatArray4807[6] + (aClass427_9403.aFloatArray4807[2] * (float) i_1016_ + aClass427_9403.aFloatArray4807[14]) + (float) i_1018_ * aClass427_9403.aFloatArray4807[10]);
		float f_1021_ = (aClass427_9403.aFloatArray4807[15] + aClass427_9403.aFloatArray4807[3] * (float) i + aClass427_9403.aFloatArray4807[7] * (float) i_1014_ + aClass427_9403.aFloatArray4807[11] * (float) i_1015_);
		float f_1022_ = (aClass427_9403.aFloatArray4807[15] + aClass427_9403.aFloatArray4807[3] * (float) i_1016_ + (float) i_1017_ * aClass427_9403.aFloatArray4807[7] + aClass427_9403.aFloatArray4807[11] * (float) i_1018_);
		if (f < -f_1021_ && f_1020_ < -f_1022_)
			i_1019_ |= 0x10;
		else if (f > f_1021_ && f_1020_ > f_1022_)
			i_1019_ |= 0x20;
		float f_1023_ = ((float) i * aClass427_9403.aFloatArray4807[0] + aClass427_9403.aFloatArray4807[12] + aClass427_9403.aFloatArray4807[4] * (float) i_1014_ + aClass427_9403.aFloatArray4807[8] * (float) i_1015_);
		float f_1024_ = ((float) i_1018_ * aClass427_9403.aFloatArray4807[8] + (aClass427_9403.aFloatArray4807[4] * (float) i_1017_ + (aClass427_9403.aFloatArray4807[12] + aClass427_9403.aFloatArray4807[0] * (float) i_1016_)));
		if (f_1023_ < -f_1021_ && f_1024_ < -f_1022_)
			i_1019_ |= 0x1;
		if (f_1023_ > f_1021_ && f_1024_ > f_1022_)
			i_1019_ |= 0x2;
		float f_1025_ = ((float) i * aClass427_9403.aFloatArray4807[1] + aClass427_9403.aFloatArray4807[13] + (float) i_1014_ * aClass427_9403.aFloatArray4807[5] + aClass427_9403.aFloatArray4807[9] * (float) i_1015_);
		float f_1026_ = ((float) i_1017_ * aClass427_9403.aFloatArray4807[5] + (aClass427_9403.aFloatArray4807[13] + (float) i_1016_ * aClass427_9403.aFloatArray4807[1]) + (float) i_1018_ * aClass427_9403.aFloatArray4807[9]);
		if (f_1025_ < -f_1021_ && f_1026_ < -f_1022_)
			i_1019_ |= 0x4;
		if (f_1025_ > f_1021_ && f_1026_ > f_1022_)
			i_1019_ |= 0x8;
		return i_1019_;
	}

	boolean method3318(int i, int i_1027_, int i_1028_, int i_1029_, Class432 class432, Class439 class439) {
		Class427 class427 = method3171();
		class427.method6784(class432);
		class427.method6751(aClass427_9403);
		return class439.method7097(i, i_1027_, i_1028_, i_1029_, class427, aFloat9410, aFloat9412, aFloat9419, aFloat9395);
	}

	boolean method3319(int i, int i_1030_, int i_1031_, int i_1032_, Class432 class432, Class439 class439) {
		Class427 class427 = method3171();
		class427.method6784(class432);
		class427.method6751(aClass427_9403);
		return class439.method7097(i, i_1030_, i_1031_, i_1032_, class427, aFloat9410, aFloat9412, aFloat9419, aFloat9395);
	}

	public void method3494(int[] is) {
		is[0] = anInt9383 * 1605202751;
		is[1] = -456655989 * anInt9392;
		is[2] = anInt9391 * 2014358275;
		is[3] = -383695469 * anInt9393;
	}

	public void method3232(Class432 class432, Class169 class169, Class439 class439) {
		Class427 class427 = method3171();
		class427.method6784(class432);
		class427.method6751(aClass427_9403);
		class169.method2706(class439, aClass427_9402, class427, aFloat9410, aFloat9412, aFloat9419, aFloat9395);
	}

	public Class527_Sub27 method3322(int i) {
		return null;
	}

	public void method3323(Class527_Sub27 class527_sub27) {
		/* empty */
	}

	public void method3130(Class527_Sub27 class527_sub27) {
		/* empty */
	}

	public void method3325(Class527_Sub27 class527_sub27) {
		/* empty */
	}

	public Class147 method3326(int i, int i_1033_, boolean bool, boolean bool_1034_) {
		if (bool)
			return new Class147_Sub1_Sub2(this, i, i_1033_);
		return new Class147_Sub1_Sub1(this, i, i_1033_);
	}

	public Class147 method3534(int i, int i_1035_, boolean bool, boolean bool_1036_) {
		if (bool)
			return new Class147_Sub1_Sub2(this, i, i_1035_);
		return new Class147_Sub1_Sub1(this, i, i_1035_);
	}

	public Class147 method3321(int i, int i_1037_, boolean bool, boolean bool_1038_) {
		if (bool)
			return new Class147_Sub1_Sub2(this, i, i_1037_);
		return new Class147_Sub1_Sub1(this, i, i_1037_);
	}

	public Class147 method3329(int[] is, int i, int i_1039_, int i_1040_, int i_1041_, boolean bool) {
		boolean bool_1042_ = false;
		int i_1043_ = i;
		while_115_: for (int i_1044_ = 0; i_1044_ < i_1041_; i_1044_++) {
			for (int i_1045_ = 0; i_1045_ < i_1040_; i_1045_++) {
				int i_1046_ = is[i_1043_++] >>> 24;
				if (0 != i_1046_ && i_1046_ != 255) {
					bool_1042_ = true;
					break while_115_;
				}
			}
		}
		if (bool_1042_)
			return new Class147_Sub1_Sub2(this, is, i, i_1039_, i_1040_, i_1041_, bool);
		return new Class147_Sub1_Sub1(this, is, i, i_1039_, i_1040_, i_1041_, bool);
	}

	public Class147 method3330(Class185 class185, boolean bool) {
		int i = class185.method3636();
		int i_1047_ = class185.method3570();
		Class147_Sub1 class147_sub1;
		if (bool && !class185.method3568() && class185.method3567()) {
			Class185_Sub2 class185_sub2 = (Class185_Sub2) class185;
			int[] is = new int[class185_sub2.anIntArray9377.length];
			byte[] is_1048_ = new byte[i * i_1047_];
			for (int i_1049_ = 0; i_1049_ < i_1047_; i_1049_++) {
				int i_1050_ = i_1049_ * i;
				for (int i_1051_ = 0; i_1051_ < i; i_1051_++)
					is_1048_[i_1050_ + i_1051_] = class185_sub2.aByteArray9371[i_1050_ + i_1051_];
			}
			for (int i_1052_ = 0; i_1052_ < class185_sub2.anIntArray9377.length; i_1052_++)
				is[i_1052_] = class185_sub2.anIntArray9377[i_1052_];
			class147_sub1 = new Class147_Sub1_Sub3(this, is_1048_, is, i, i_1047_);
		} else {
			int[] is = class185.method3584(false);
			if (class185.method3568())
				class147_sub1 = new Class147_Sub1_Sub2(this, is, i, i_1047_);
			else
				class147_sub1 = new Class147_Sub1_Sub1(this, is, i, i_1047_);
		}
		class147_sub1.method2405(class185.method3634(), class185.method3611(), class185.method3572(), class185.method3603());
		return class147_sub1;
	}

	public Class147 method3331(Class185 class185, boolean bool) {
		int i = class185.method3636();
		int i_1053_ = class185.method3570();
		Class147_Sub1 class147_sub1;
		if (bool && !class185.method3568() && class185.method3567()) {
			Class185_Sub2 class185_sub2 = (Class185_Sub2) class185;
			int[] is = new int[class185_sub2.anIntArray9377.length];
			byte[] is_1054_ = new byte[i * i_1053_];
			for (int i_1055_ = 0; i_1055_ < i_1053_; i_1055_++) {
				int i_1056_ = i_1055_ * i;
				for (int i_1057_ = 0; i_1057_ < i; i_1057_++)
					is_1054_[i_1056_ + i_1057_] = class185_sub2.aByteArray9371[i_1056_ + i_1057_];
			}
			for (int i_1058_ = 0; i_1058_ < class185_sub2.anIntArray9377.length; i_1058_++)
				is[i_1058_] = class185_sub2.anIntArray9377[i_1058_];
			class147_sub1 = new Class147_Sub1_Sub3(this, is_1054_, is, i, i_1053_);
		} else {
			int[] is = class185.method3584(false);
			if (class185.method3568())
				class147_sub1 = new Class147_Sub1_Sub2(this, is, i, i_1053_);
			else
				class147_sub1 = new Class147_Sub1_Sub1(this, is, i, i_1053_);
		}
		class147_sub1.method2405(class185.method3634(), class185.method3611(), class185.method3572(), class185.method3603());
		return class147_sub1;
	}

	public void method3169(int i, Class142 class142, int i_1059_, int i_1060_) {
		if (anIntArray9386 != null) {
			Class142_Sub1 class142_sub1 = (Class142_Sub1) class142;
			int[] is = class142_sub1.anIntArray9002;
			int[] is_1061_ = class142_sub1.anIntArray9003;
			int i_1062_;
			if (-383695469 * anInt9393 < i_1060_ + is.length)
				i_1062_ = -383695469 * anInt9393 - i_1060_;
			else
				i_1062_ = is.length;
			int i_1063_;
			if (-456655989 * anInt9392 > i_1060_) {
				i_1063_ = anInt9392 * -456655989 - i_1060_;
				i_1060_ = -456655989 * anInt9392;
			} else
				i_1063_ = 0;
			if (i_1062_ - i_1063_ > 0) {
				int i_1064_ = i_1060_ * (anInt9387 * -1173855569);
				for (int i_1065_ = i_1063_; i_1065_ < i_1062_; i_1065_++) {
					int i_1066_ = i_1059_ + is[i_1065_];
					int i_1067_ = is_1061_[i_1065_];
					if (1605202751 * anInt9383 > i_1066_) {
						i_1067_ -= 1605202751 * anInt9383 - i_1066_;
						i_1066_ = 1605202751 * anInt9383;
					}
					if (2014358275 * anInt9391 < i_1067_ + i_1066_)
						i_1067_ = anInt9391 * 2014358275 - i_1066_;
					i_1066_ += i_1064_;
					for (int i_1068_ = -i_1067_; i_1068_ < 0; i_1068_++)
						anIntArray9386[i_1066_++] = i;
					i_1064_ += -1173855569 * anInt9387;
				}
			}
		}
	}

	public Class147 method3487(Class185 class185, boolean bool) {
		int i = class185.method3636();
		int i_1069_ = class185.method3570();
		Class147_Sub1 class147_sub1;
		if (bool && !class185.method3568() && class185.method3567()) {
			Class185_Sub2 class185_sub2 = (Class185_Sub2) class185;
			int[] is = new int[class185_sub2.anIntArray9377.length];
			byte[] is_1070_ = new byte[i * i_1069_];
			for (int i_1071_ = 0; i_1071_ < i_1069_; i_1071_++) {
				int i_1072_ = i_1071_ * i;
				for (int i_1073_ = 0; i_1073_ < i; i_1073_++)
					is_1070_[i_1072_ + i_1073_] = class185_sub2.aByteArray9371[i_1072_ + i_1073_];
			}
			for (int i_1074_ = 0; i_1074_ < class185_sub2.anIntArray9377.length; i_1074_++)
				is[i_1074_] = class185_sub2.anIntArray9377[i_1074_];
			class147_sub1 = new Class147_Sub1_Sub3(this, is_1070_, is, i, i_1069_);
		} else {
			int[] is = class185.method3584(false);
			if (class185.method3568())
				class147_sub1 = new Class147_Sub1_Sub2(this, is, i, i_1069_);
			else
				class147_sub1 = new Class147_Sub1_Sub1(this, is, i, i_1069_);
		}
		class147_sub1.method2405(class185.method3634(), class185.method3611(), class185.method3572(), class185.method3603());
		return class147_sub1;
	}

	public Class147 method3334(int i, int i_1075_, int i_1076_, int i_1077_, boolean bool) {
		if (null == anIntArray9386)
			throw new IllegalStateException("");
		int[] is = new int[i_1076_ * i_1077_];
		int i_1078_ = i + -1173855569 * anInt9387 * i_1075_;
		int i_1079_ = anInt9387 * -1173855569 - i_1076_;
		for (int i_1080_ = 0; i_1080_ < i_1077_; i_1080_++) {
			int i_1081_ = i_1080_ * i_1076_;
			for (int i_1082_ = 0; i_1082_ < i_1076_; i_1082_++)
				is[i_1082_ + i_1081_] = anIntArray9386[i_1078_++];
			i_1078_ += i_1079_;
		}
		if (bool)
			return new Class147_Sub1_Sub2(this, is, i_1076_, i_1077_);
		return new Class147_Sub1_Sub1(this, is, i_1076_, i_1077_);
	}

	public boolean method3250() {
		return false;
	}

	public void method3531(int i, int i_1083_, int i_1084_, int i_1085_, int i_1086_, int i_1087_, int i_1088_) {
		if (anIntArray9386 != null) {
			Class101 class101 = method14835(Thread.currentThread());
			Class119 class119 = class101.aClass119_1197;
			int i_1089_ = i_1084_ - i;
			int i_1090_ = i_1085_ - i_1083_;
			int i_1091_ = i_1089_ >= 0 ? i_1089_ : -i_1089_;
			int i_1092_ = i_1090_ >= 0 ? i_1090_ : -i_1090_;
			int i_1093_ = i_1091_;
			if (i_1093_ < i_1092_)
				i_1093_ = i_1092_;
			if (i_1093_ != 0) {
				int i_1094_ = (i_1089_ << 16) / i_1093_;
				int i_1095_ = (i_1090_ << 16) / i_1093_;
				i_1089_ += i_1094_ >> 16;
				i_1090_ += i_1095_ >> 16;
				if (i_1095_ <= i_1094_)
					i_1094_ = -i_1094_;
				else
					i_1095_ = -i_1095_;
				int i_1096_ = i_1095_ * i_1087_ >> 17;
				int i_1097_ = 1 + i_1095_ * i_1087_ >> 17;
				int i_1098_ = i_1087_ * i_1094_ >> 17;
				int i_1099_ = 1 + i_1094_ * i_1087_ >> 17;
				i -= class119.method2083();
				i_1083_ -= class119.method2071();
				int i_1100_ = i_1096_ + i;
				int i_1101_ = i - i_1097_;
				int i_1102_ = i + i_1089_ - i_1097_;
				int i_1103_ = i + i_1089_ + i_1096_;
				int i_1104_ = i_1083_ + i_1098_;
				int i_1105_ = i_1083_ - i_1099_;
				int i_1106_ = i_1090_ + i_1083_ - i_1099_;
				int i_1107_ = i_1098_ + (i_1083_ + i_1090_);
				if (i_1088_ == 0)
					class119.anInt1441 = 0;
				else if (i_1088_ == 1)
					class119.anInt1441 = 255 - (i_1086_ >>> 24);
				else
					throw new IllegalArgumentException();
				method3182(false);
				class119.aBool1445 = (i_1100_ < 0 || i_1100_ > class119.anInt1442 || i_1101_ < 0 || i_1101_ > class119.anInt1442 || i_1102_ < 0 || i_1102_ > class119.anInt1442);
				class119.method2077(true, false, false, (float) i_1104_, (float) i_1105_, (float) i_1106_, (float) i_1100_, (float) i_1101_, (float) i_1102_, 100.0F, 100.0F, 100.0F, i_1086_);
				class119.aBool1445 = (i_1100_ < 0 || i_1100_ > class119.anInt1442 || i_1102_ < 0 || i_1102_ > class119.anInt1442 || i_1103_ < 0 || i_1103_ > class119.anInt1442);
				class119.method2077(true, false, false, (float) i_1104_, (float) i_1106_, (float) i_1107_, (float) i_1100_, (float) i_1102_, (float) i_1103_, 100.0F, 100.0F, 100.0F, i_1086_);
				method3182(true);
			}
		}
	}

	public void method3287(int[] is) {
		is[0] = anInt9407 * 1927584963;
		is[1] = anInt9406 * 950770619;
		is[2] = 278922843 * anInt9390;
		is[3] = 56228905 * anInt9385;
	}

	public Class174 method3338(Class22 class22, Class185[] class185s, boolean bool) {
		int[] is = new int[class185s.length];
		int[] is_1108_ = new int[class185s.length];
		boolean bool_1109_ = false;
		boolean bool_1110_ = false;
		for (int i = 0; i < class185s.length; i++) {
			is[i] = class185s[i].method3636();
			is_1108_[i] = class185s[i].method3570();
			if (class185s[i].method3568())
				bool_1109_ = true;
			if (class185s[i].method3567())
				bool_1110_ = true;
		}
		if (bool) {
			if (bool_1110_) {
				if (bool_1109_)
					return new Class174_Sub1(this, class22, (Class185_Sub2[]) class185s, is, is_1108_);
				return new Class174_Sub4(this, class22, (Class185_Sub2[]) class185s, is, is_1108_);
			}
			if (bool_1109_)
				return new Class174_Sub1(this, class22, (Class185_Sub1[]) class185s, is, is_1108_);
			return new Class174_Sub4(this, class22, (Class185_Sub1[]) class185s, is, is_1108_);
		}
		if (bool_1110_) {
			if (bool_1109_)
				throw new IllegalArgumentException("");
			return new Class174_Sub3(this, class22, (Class185_Sub2[]) class185s, is, is_1108_);
		}
		return new Class174_Sub2(this, class22, (Class185_Sub1[]) class185s, is, is_1108_);
	}

	public Class174 method3166(Class22 class22, Class185[] class185s, boolean bool) {
		int[] is = new int[class185s.length];
		int[] is_1111_ = new int[class185s.length];
		boolean bool_1112_ = false;
		boolean bool_1113_ = false;
		for (int i = 0; i < class185s.length; i++) {
			is[i] = class185s[i].method3636();
			is_1111_[i] = class185s[i].method3570();
			if (class185s[i].method3568())
				bool_1112_ = true;
			if (class185s[i].method3567())
				bool_1113_ = true;
		}
		if (bool) {
			if (bool_1113_) {
				if (bool_1112_)
					return new Class174_Sub1(this, class22, (Class185_Sub2[]) class185s, is, is_1111_);
				return new Class174_Sub4(this, class22, (Class185_Sub2[]) class185s, is, is_1111_);
			}
			if (bool_1112_)
				return new Class174_Sub1(this, class22, (Class185_Sub1[]) class185s, is, is_1111_);
			return new Class174_Sub4(this, class22, (Class185_Sub1[]) class185s, is, is_1111_);
		}
		if (bool_1113_) {
			if (bool_1112_)
				throw new IllegalArgumentException("");
			return new Class174_Sub3(this, class22, (Class185_Sub2[]) class185s, is, is_1111_);
		}
		return new Class174_Sub2(this, class22, (Class185_Sub1[]) class185s, is, is_1111_);
	}

	public void method3447(int i) {
		Class176_Sub2.anInt9206 = Class176_Sub2.anInt9166 = i;
		if (1413774429 * anInt9415 > 1)
			throw new IllegalStateException();
		method14880(anInt9415 * 1413774429);
		method14879(0);
	}

	public long method3117(int i, int i_1114_) {
		return 0L;
	}

	void method3310() {
		if (aBool9401) {
			Class520.method8664(true, false, 635087448);
			aBool9401 = false;
		}
		aBool9411 = true;
	}

	public void method3425(int i, int i_1115_, float f, int i_1116_, int i_1117_, float f_1118_, int i_1119_, int i_1120_, float f_1121_, int i_1122_, int i_1123_, int i_1124_, int i_1125_) {
		boolean bool = null != anIntArray9386;
		boolean bool_1126_ = aFloatArray9389 != null;
		if (bool || bool_1126_) {
			Class101 class101 = method14835(Thread.currentThread());
			Class119 class119 = class101.aClass119_1197;
			class119.aBool1467 = false;
			i -= anInt9383 * 1605202751;
			i_1116_ -= 1605202751 * anInt9383;
			i_1119_ -= 1605202751 * anInt9383;
			i_1115_ -= anInt9392 * -456655989;
			i_1117_ -= anInt9392 * -456655989;
			i_1120_ -= anInt9392 * -456655989;
			class119.aBool1445 = (i < 0 || i > class119.anInt1442 || i_1116_ < 0 || i_1116_ > class119.anInt1442 || i_1119_ < 0 || i_1119_ > class119.anInt1442);
			int i_1127_ = i_1122_ >>> 24;
			if (0 == i_1125_ || i_1125_ == 1 && 255 == i_1127_) {
				class119.anInt1441 = 0;
				class119.aBool1443 = false;
				class119.method2106(bool, bool_1126_, false, (float) i_1115_, (float) i_1117_, (float) i_1120_, (float) i, (float) i_1116_, (float) i_1119_, f, f_1118_, f_1121_, i_1122_, i_1123_, i_1124_);
			} else if (1 == i_1125_) {
				class119.anInt1441 = 255 - i_1127_;
				class119.aBool1443 = false;
				class119.method2106(bool, bool_1126_, false, (float) i_1115_, (float) i_1117_, (float) i_1120_, (float) i, (float) i_1116_, (float) i_1119_, f, f_1118_, f_1121_, i_1122_, i_1123_, i_1124_);
			} else if (i_1125_ == 2) {
				class119.anInt1441 = 128;
				class119.aBool1443 = true;
				class119.method2106(bool, bool_1126_, false, (float) i_1115_, (float) i_1117_, (float) i_1120_, (float) i, (float) i_1116_, (float) i_1119_, f, f_1118_, f_1121_, i_1122_, i_1123_, i_1124_);
			} else
				throw new IllegalArgumentException();
			class119.aBool1467 = true;
		}
	}

	public Class176 method3110(Class175 class175, int i, int i_1128_, int i_1129_, int i_1130_) {
		return new Class176_Sub2(this, class175, i, i_1129_, i_1130_, i_1128_);
	}

	void method14864(boolean bool, boolean bool_1131_, boolean bool_1132_, Class522_Sub6_Sub1 class522_sub6_sub1, int i, int i_1133_, float f, int i_1134_) {
		int i_1135_ = class522_sub6_sub1.anInt11410;
		int i_1136_ = i_1134_;
		i_1134_ <<= 1;
		if (i_1135_ == -1)
			method14838(bool_1131_, i, i_1133_, f, i_1136_, class522_sub6_sub1.anInt11409, 1);
		else {
			if (i_1135_ != anInt9418 * -1948774645) {
				Class147 class147 = (Class147) aClass205_9400.method3787((long) i_1135_);
				if (class147 == null) {
					Class163 class163 = aClass181_2059.method3544(i_1135_, (byte) -40);
					int[] is = method14841(i_1135_);
					if (is != null) {
						int i_1137_ = class163.anInt1780 * 1039262975;
						class147 = method3163(is, 0, i_1137_, i_1137_, i_1137_, -1261892512);
						aClass205_9400.method3790(class147, (long) i_1135_);
					} else
						return;
				}
				anInt9418 = i_1135_ * -134298461;
				aClass147_9396 = class147;
			}
			i_1134_++;
			((Class147_Sub1) aClass147_9396).method14430(bool, bool_1131_, bool_1132_, i - i_1136_, i_1133_ - i_1136_, f, i_1134_, i_1134_, 0, class522_sub6_sub1.anInt11409, 1, 1, false);
		}
	}

	public int method3346(int i, int i_1138_) {
		i |= 0x20800;
		return i & i_1138_ ^ i_1138_;
	}

	public int method3347(int i, int i_1139_) {
		return i | i_1139_;
	}

	public int method3145(int i, int i_1140_) {
		return i | i_1140_;
	}

	public Class161 method3099(int i, int i_1141_, int[][] is, int[][] is_1142_, int i_1143_, int i_1144_, int i_1145_) {
		return new Class161_Sub1(this, i_1144_, i_1145_, i, i_1141_, is, is_1142_, i_1143_);
	}

	public boolean method3243() {
		return false;
	}

	public Class161 method3399(int i, int i_1146_, int[][] is, int[][] is_1147_, int i_1148_, int i_1149_, int i_1150_) {
		return new Class161_Sub1(this, i_1149_, i_1150_, i, i_1146_, is, is_1147_, i_1148_);
	}

	public boolean method3248() {
		return false;
	}

	public boolean method3403() {
		return false;
	}

	public Class427 method3354() {
		Class101 class101 = method14835(Thread.currentThread());
		return class101.aClass427_1212;
	}

	public void method3420(int i, Class178 class178) {
		Class101 class101 = method14835(Thread.currentThread());
		class101.anInt1205 = -1687140521 * i;
		class101.anInt1194 = 1892560347 * class178.anInt2055;
		class101.anInt1198 = -1455708645 * class178.anInt2050;
	}

	public void method3413(int i, int i_1151_, int i_1152_, int i_1153_, int i_1154_, int i_1155_, Class142 class142, int i_1156_, int i_1157_, int i_1158_, int i_1159_, int i_1160_) {
		if (anIntArray9386 != null) {
			Class142_Sub1 class142_sub1 = (Class142_Sub1) class142;
			int[] is = class142_sub1.anIntArray9002;
			int[] is_1161_ = class142_sub1.anIntArray9003;
			int i_1162_ = (anInt9392 * -456655989 > i_1157_ ? anInt9392 * -456655989 : i_1157_);
			int i_1163_ = (anInt9393 * -383695469 < i_1157_ + is.length ? -383695469 * anInt9393 : i_1157_ + is.length);
			i_1160_ <<= 8;
			i_1158_ <<= 8;
			i_1159_ <<= 8;
			int i_1164_ = i_1159_ + i_1158_;
			i_1160_ %= i_1164_;
			i_1152_ -= i;
			i_1153_ -= i_1151_;
			if (i_1152_ + i_1153_ < 0) {
				int i_1165_ = (int) (Math.sqrt((double) (i_1153_ * i_1153_ + i_1152_ * i_1152_)) * 256.0);
				int i_1166_ = i_1165_ % i_1164_;
				i_1160_ = i_1158_ + i_1164_ - i_1160_ - i_1166_;
				i_1160_ %= i_1164_;
				if (i_1160_ < 0)
					i_1160_ += i_1164_;
				i += i_1152_;
				i_1152_ = -i_1152_;
				i_1151_ += i_1153_;
				i_1153_ = -i_1153_;
			}
			if (i_1152_ > i_1153_) {
				i_1151_ <<= 16;
				i_1151_ += 32768;
				i_1153_ <<= 16;
				int i_1167_ = (int) Math.floor((double) i_1153_ / (double) i_1152_ + 0.5);
				i_1152_ += i;
				int i_1168_ = i_1154_ >>> 24;
				int i_1169_ = (int) Math.sqrt((double) ((i_1167_ >> 8) * (i_1167_ >> 8) + 65536));
				if (0 == i_1155_ || 1 == i_1155_ && i_1168_ == 255) {
					while (i <= i_1152_) {
						int i_1170_ = i_1151_ >> 16;
						int i_1171_ = i_1170_ - i_1157_;
						if (i >= anInt9383 * 1605202751 && i < 2014358275 * anInt9391 && i_1170_ >= i_1162_ && i_1170_ < i_1163_ && i_1160_ < i_1158_) {
							int i_1172_ = i_1156_ + is[i_1171_];
							if (i >= i_1172_ && i < i_1172_ + is_1161_[i_1171_])
								anIntArray9386[anInt9387 * -1173855569 * i_1170_ + i] = i_1154_;
						}
						i_1151_ += i_1167_;
						i++;
						i_1160_ += i_1169_;
						i_1160_ %= i_1164_;
					}
				} else if (i_1155_ == 1) {
					i_1154_ = (((i_1154_ & 0xff00ff) * i_1168_ >> 8 & 0xff00ff) + (i_1168_ * (i_1154_ & 0xff00) >> 8 & 0xff00) + (i_1168_ << 24));
					int i_1173_ = 256 - i_1168_;
					while (i <= i_1152_) {
						int i_1174_ = i_1151_ >> 16;
						int i_1175_ = i_1174_ - i_1157_;
						if (i >= anInt9383 * 1605202751 && i < anInt9391 * 2014358275 && i_1174_ >= i_1162_ && i_1174_ < i_1163_ && i_1160_ < i_1158_) {
							int i_1176_ = i_1156_ + is[i_1175_];
							if (i >= i_1176_ && i < is_1161_[i_1175_] + i_1176_) {
								int i_1177_ = i + anInt9387 * -1173855569 * i_1174_;
								int i_1178_ = anIntArray9386[i_1177_];
								i_1178_ = (((i_1178_ & 0xff00) * i_1173_ >> 8 & 0xff00) + ((i_1178_ & 0xff00ff) * i_1173_ >> 8 & 0xff00ff));
								anIntArray9386[i_1177_] = i_1154_ + i_1178_;
							}
						}
						i_1151_ += i_1167_;
						i++;
						i_1160_ += i_1169_;
						i_1160_ %= i_1164_;
					}
				} else if (2 == i_1155_) {
					while (i <= i_1152_) {
						int i_1179_ = i_1151_ >> 16;
						int i_1180_ = i_1179_ - i_1157_;
						if (i >= anInt9383 * 1605202751 && i < 2014358275 * anInt9391 && i_1179_ >= i_1162_ && i_1179_ < i_1163_ && i_1160_ < i_1158_) {
							int i_1181_ = i_1156_ + is[i_1180_];
							if (i >= i_1181_ && i < is_1161_[i_1180_] + i_1181_) {
								int i_1182_ = i + i_1179_ * (-1173855569 * anInt9387);
								int i_1183_ = anIntArray9386[i_1182_];
								int i_1184_ = i_1154_ + i_1183_;
								int i_1185_ = ((i_1183_ & 0xff00ff) + (i_1154_ & 0xff00ff));
								i_1183_ = ((i_1184_ - i_1185_ & 0x10000) + (i_1185_ & 0x1000100));
								anIntArray9386[i_1182_] = i_1184_ - i_1183_ | i_1183_ - (i_1183_ >>> 8);
							}
						}
						i_1151_ += i_1167_;
						i++;
						i_1160_ += i_1169_;
						i_1160_ %= i_1164_;
					}
				} else
					throw new IllegalArgumentException();
			} else {
				i <<= 16;
				i += 32768;
				i_1152_ <<= 16;
				int i_1186_ = (int) Math.floor(0.5 + ((double) i_1152_ / (double) i_1153_));
				int i_1187_ = (int) Math.sqrt((double) (65536 + (i_1186_ >> 8) * (i_1186_ >> 8)));
				i_1153_ += i_1151_;
				int i_1188_ = i_1154_ >>> 24;
				if (0 == i_1155_ || 1 == i_1155_ && i_1188_ == 255) {
					while (i_1151_ <= i_1153_) {
						int i_1189_ = i >> 16;
						int i_1190_ = i_1151_ - i_1157_;
						if (i_1151_ >= i_1162_ && i_1151_ < i_1163_ && i_1189_ >= 1605202751 * anInt9383 && i_1189_ < anInt9391 * 2014358275 && i_1160_ < i_1158_ && i_1189_ >= is[i_1190_] + i_1156_ && i_1189_ < is_1161_[i_1190_] + (i_1156_ + is[i_1190_]))
							anIntArray9386[i_1189_ + i_1151_ * (-1173855569 * anInt9387)] = i_1154_;
						i += i_1186_;
						i_1151_++;
						i_1160_ += i_1187_;
						i_1160_ %= i_1164_;
					}
				} else if (i_1155_ == 1) {
					i_1154_ = ((i_1188_ << 24) + ((i_1188_ * (i_1154_ & 0xff00ff) >> 8 & 0xff00ff) + (i_1188_ * (i_1154_ & 0xff00) >> 8 & 0xff00)));
					int i_1191_ = 256 - i_1188_;
					while (i_1151_ <= i_1153_) {
						int i_1192_ = i >> 16;
						int i_1193_ = i_1151_ - i_1157_;
						if (i_1151_ >= i_1162_ && i_1151_ < i_1163_ && i_1192_ >= 1605202751 * anInt9383 && i_1192_ < anInt9391 * 2014358275 && i_1160_ < i_1158_ && i_1192_ >= is[i_1193_] + i_1156_ && i_1192_ < is_1161_[i_1193_] + (is[i_1193_] + i_1156_)) {
							int i_1194_ = i_1192_ + anInt9387 * -1173855569 * i_1151_;
							int i_1195_ = anIntArray9386[i_1194_];
							i_1195_ = (((i_1195_ & 0xff00ff) * i_1191_ >> 8 & 0xff00ff) + (i_1191_ * (i_1195_ & 0xff00) >> 8 & 0xff00));
							anIntArray9386[i_1192_ + i_1151_ * (anInt9387 * -1173855569)] = i_1195_ + i_1154_;
						}
						i += i_1186_;
						i_1151_++;
						i_1160_ += i_1187_;
						i_1160_ %= i_1164_;
					}
				} else if (2 == i_1155_) {
					while (i_1151_ <= i_1153_) {
						int i_1196_ = i >> 16;
						int i_1197_ = i_1151_ - i_1157_;
						if (i_1151_ >= i_1162_ && i_1151_ < i_1163_ && i_1196_ >= 1605202751 * anInt9383 && i_1196_ < 2014358275 * anInt9391 && i_1160_ < i_1158_ && i_1196_ >= is[i_1197_] + i_1156_ && i_1196_ < is_1161_[i_1197_] + (i_1156_ + is[i_1197_])) {
							int i_1198_ = (i_1151_ * (-1173855569 * anInt9387) + i_1196_);
							int i_1199_ = anIntArray9386[i_1198_];
							int i_1200_ = i_1199_ + i_1154_;
							int i_1201_ = (i_1154_ & 0xff00ff) + (i_1199_ & 0xff00ff);
							i_1199_ = ((i_1200_ - i_1201_ & 0x10000) + (i_1201_ & 0x1000100));
							anIntArray9386[i_1198_] = i_1200_ - i_1199_ | i_1199_ - (i_1199_ >>> 8);
						}
						i += i_1186_;
						i_1151_++;
						i_1160_ += i_1187_;
						i_1160_ %= i_1164_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public Class432 method3143() {
		Class101 class101 = method14835(Thread.currentThread());
		return class101.aClass432_1201;
	}

	public Class432 method3358() {
		Class101 class101 = method14835(Thread.currentThread());
		return class101.aClass432_1201;
	}

	public int method3359() {
		return 0;
	}

	public void method3444() {
		aClass171_Sub2_9422 = null;
		aClass147_9421 = null;
	}

	void method3445(int i, int i_1202_, int i_1203_, int i_1204_, int i_1205_) {
		if (anIntArray9386 != null) {
			if (i_1203_ < 0)
				i_1203_ = -i_1203_;
			int i_1206_ = i_1202_ - i_1203_;
			if (i_1206_ < -456655989 * anInt9392)
				i_1206_ = anInt9392 * -456655989;
			int i_1207_ = 1 + (i_1203_ + i_1202_);
			if (i_1207_ > anInt9393 * -383695469)
				i_1207_ = anInt9393 * -383695469;
			int i_1208_ = i_1206_;
			int i_1209_ = i_1203_ * i_1203_;
			int i_1210_ = 0;
			int i_1211_ = i_1202_ - i_1208_;
			int i_1212_ = i_1211_ * i_1211_;
			int i_1213_ = i_1212_ - i_1211_;
			if (i_1202_ > i_1207_)
				i_1202_ = i_1207_;
			int i_1214_ = i_1204_ >>> 24;
			if (i_1205_ == 0 || i_1205_ == 1 && i_1214_ == 255) {
				while (i_1208_ < i_1202_) {
					for (/**/; i_1213_ <= i_1209_ || i_1212_ <= i_1209_; i_1213_ += i_1210_++ + i_1210_)
						i_1212_ += i_1210_ + i_1210_;
					int i_1215_ = i - i_1210_ + 1;
					if (i_1215_ < anInt9383 * 1605202751)
						i_1215_ = anInt9383 * 1605202751;
					int i_1216_ = i + i_1210_;
					if (i_1216_ > 2014358275 * anInt9391)
						i_1216_ = 2014358275 * anInt9391;
					int i_1217_ = i_1215_ + i_1208_ * (anInt9387 * -1173855569);
					for (int i_1218_ = i_1215_; i_1218_ < i_1216_; i_1218_++)
						anIntArray9386[i_1217_++] = i_1204_;
					i_1208_++;
					i_1212_ -= i_1211_-- + i_1211_;
					i_1213_ -= i_1211_ + i_1211_;
				}
				i_1210_ = i_1203_;
				i_1211_ = i_1208_ - i_1202_;
				i_1213_ = i_1209_ + i_1211_ * i_1211_;
				i_1212_ = i_1213_ - i_1210_;
				i_1213_ -= i_1211_;
				while (i_1208_ < i_1207_) {
					for (/**/; i_1213_ > i_1209_ && i_1212_ > i_1209_; i_1212_ -= i_1210_ + i_1210_)
						i_1213_ -= i_1210_-- + i_1210_;
					int i_1219_ = i - i_1210_;
					if (i_1219_ < 1605202751 * anInt9383)
						i_1219_ = 1605202751 * anInt9383;
					int i_1220_ = i_1210_ + i;
					if (i_1220_ > 2014358275 * anInt9391 - 1)
						i_1220_ = 2014358275 * anInt9391 - 1;
					int i_1221_ = i_1208_ * (-1173855569 * anInt9387) + i_1219_;
					for (int i_1222_ = i_1219_; i_1222_ <= i_1220_; i_1222_++)
						anIntArray9386[i_1221_++] = i_1204_;
					i_1208_++;
					i_1213_ += i_1211_ + i_1211_;
					i_1212_ += i_1211_++ + i_1211_;
				}
			} else if (1 == i_1205_) {
				i_1204_ = ((i_1214_ << 24) + ((i_1214_ * (i_1204_ & 0xff00ff) >> 8 & 0xff00ff) + (i_1214_ * (i_1204_ & 0xff00) >> 8 & 0xff00)));
				int i_1223_ = 256 - i_1214_;
				while (i_1208_ < i_1202_) {
					for (/**/; i_1213_ <= i_1209_ || i_1212_ <= i_1209_; i_1213_ += i_1210_++ + i_1210_)
						i_1212_ += i_1210_ + i_1210_;
					int i_1224_ = 1 + (i - i_1210_);
					if (i_1224_ < 1605202751 * anInt9383)
						i_1224_ = anInt9383 * 1605202751;
					int i_1225_ = i_1210_ + i;
					if (i_1225_ > 2014358275 * anInt9391)
						i_1225_ = anInt9391 * 2014358275;
					int i_1226_ = i_1224_ + -1173855569 * anInt9387 * i_1208_;
					for (int i_1227_ = i_1224_; i_1227_ < i_1225_; i_1227_++) {
						int i_1228_ = anIntArray9386[i_1226_];
						i_1228_ = ((i_1223_ * (i_1228_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_1228_ & 0xff00) * i_1223_ >> 8 & 0xff00));
						anIntArray9386[i_1226_++] = i_1228_ + i_1204_;
					}
					i_1208_++;
					i_1212_ -= i_1211_-- + i_1211_;
					i_1213_ -= i_1211_ + i_1211_;
				}
				i_1210_ = i_1203_;
				i_1211_ = -i_1211_;
				i_1213_ = i_1209_ + i_1211_ * i_1211_;
				i_1212_ = i_1213_ - i_1210_;
				i_1213_ -= i_1211_;
				while (i_1208_ < i_1207_) {
					for (/**/; i_1213_ > i_1209_ && i_1212_ > i_1209_; i_1212_ -= i_1210_ + i_1210_)
						i_1213_ -= i_1210_-- + i_1210_;
					int i_1229_ = i - i_1210_;
					if (i_1229_ < anInt9383 * 1605202751)
						i_1229_ = anInt9383 * 1605202751;
					int i_1230_ = i_1210_ + i;
					if (i_1230_ > 2014358275 * anInt9391 - 1)
						i_1230_ = anInt9391 * 2014358275 - 1;
					int i_1231_ = i_1208_ * (anInt9387 * -1173855569) + i_1229_;
					for (int i_1232_ = i_1229_; i_1232_ <= i_1230_; i_1232_++) {
						int i_1233_ = anIntArray9386[i_1231_];
						i_1233_ = ((i_1223_ * (i_1233_ & 0xff00) >> 8 & 0xff00) + ((i_1233_ & 0xff00ff) * i_1223_ >> 8 & 0xff00ff));
						anIntArray9386[i_1231_++] = i_1233_ + i_1204_;
					}
					i_1208_++;
					i_1213_ += i_1211_ + i_1211_;
					i_1212_ += i_1211_++ + i_1211_;
				}
			} else if (i_1205_ == 2) {
				while (i_1208_ < i_1202_) {
					for (/**/; i_1213_ <= i_1209_ || i_1212_ <= i_1209_; i_1213_ += i_1210_++ + i_1210_)
						i_1212_ += i_1210_ + i_1210_;
					int i_1234_ = 1 + (i - i_1210_);
					if (i_1234_ < 1605202751 * anInt9383)
						i_1234_ = anInt9383 * 1605202751;
					int i_1235_ = i_1210_ + i;
					if (i_1235_ > 2014358275 * anInt9391)
						i_1235_ = 2014358275 * anInt9391;
					int i_1236_ = i_1208_ * (-1173855569 * anInt9387) + i_1234_;
					for (int i_1237_ = i_1234_; i_1237_ < i_1235_; i_1237_++) {
						int i_1238_ = anIntArray9386[i_1236_];
						int i_1239_ = i_1238_ + i_1204_;
						int i_1240_ = (i_1238_ & 0xff00ff) + (i_1204_ & 0xff00ff);
						i_1238_ = (i_1240_ & 0x1000100) + (i_1239_ - i_1240_ & 0x10000);
						anIntArray9386[i_1236_++] = i_1239_ - i_1238_ | i_1238_ - (i_1238_ >>> 8);
					}
					i_1208_++;
					i_1212_ -= i_1211_-- + i_1211_;
					i_1213_ -= i_1211_ + i_1211_;
				}
				i_1210_ = i_1203_;
				i_1211_ = -i_1211_;
				i_1213_ = i_1211_ * i_1211_ + i_1209_;
				i_1212_ = i_1213_ - i_1210_;
				i_1213_ -= i_1211_;
				while (i_1208_ < i_1207_) {
					for (/**/; i_1213_ > i_1209_ && i_1212_ > i_1209_; i_1212_ -= i_1210_ + i_1210_)
						i_1213_ -= i_1210_-- + i_1210_;
					int i_1241_ = i - i_1210_;
					if (i_1241_ < 1605202751 * anInt9383)
						i_1241_ = anInt9383 * 1605202751;
					int i_1242_ = i_1210_ + i;
					if (i_1242_ > anInt9391 * 2014358275 - 1)
						i_1242_ = anInt9391 * 2014358275 - 1;
					int i_1243_ = i_1208_ * (anInt9387 * -1173855569) + i_1241_;
					for (int i_1244_ = i_1241_; i_1244_ <= i_1242_; i_1244_++) {
						int i_1245_ = anIntArray9386[i_1243_];
						int i_1246_ = i_1245_ + i_1204_;
						int i_1247_ = (i_1204_ & 0xff00ff) + (i_1245_ & 0xff00ff);
						i_1245_ = (i_1246_ - i_1247_ & 0x10000) + (i_1247_ & 0x1000100);
						anIntArray9386[i_1243_++] = i_1246_ - i_1245_ | i_1245_ - (i_1245_ >>> 8);
					}
					i_1208_++;
					i_1213_ += i_1211_ + i_1211_;
					i_1212_ += i_1211_++ + i_1211_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public boolean method3200() {
		return false;
	}

	public Class147 method3440(int i, int i_1248_, int i_1249_, int i_1250_, boolean bool) {
		if (null == anIntArray9386)
			throw new IllegalStateException("");
		int[] is = new int[i_1249_ * i_1250_];
		int i_1251_ = i + -1173855569 * anInt9387 * i_1248_;
		int i_1252_ = anInt9387 * -1173855569 - i_1249_;
		for (int i_1253_ = 0; i_1253_ < i_1250_; i_1253_++) {
			int i_1254_ = i_1253_ * i_1249_;
			for (int i_1255_ = 0; i_1255_ < i_1249_; i_1255_++)
				is[i_1255_ + i_1254_] = anIntArray9386[i_1251_++];
			i_1251_ += i_1252_;
		}
		if (bool)
			return new Class147_Sub1_Sub2(this, is, i_1249_, i_1250_);
		return new Class147_Sub1_Sub1(this, is, i_1249_, i_1250_);
	}

	public void method3214(int i, int i_1256_, int i_1257_, int i_1258_) {
		/* empty */
	}

	public void method3365(int i, Class527_Sub16[] class527_sub16s) {
		/* empty */
	}

	void method14865(int i) {
		aClass101Array9416[i].method1778(Thread.currentThread(), 1949246975);
	}

	void method14866(int i) {
		aClass101Array9416[i].method1778(Thread.currentThread(), 510555426);
	}

	public boolean method3247() {
		return true;
	}

	void method14867(int i) {
		anInt9415 = 1323382773 * i;
		aClass101Array9416 = new Class101[anInt9415 * 1413774429];
		for (int i_1259_ = 0; i_1259_ < anInt9415 * 1413774429; i_1259_++)
			aClass101Array9416[i_1259_] = new Class101(this);
	}

	public Class172 method3199(int[] is) {
		return null;
	}

	Class101 method14868(Runnable runnable) {
		for (int i = 0; i < 1413774429 * anInt9415; i++) {
			if (aClass101Array9416[i].aRunnable1189 == runnable)
				return aClass101Array9416[i];
		}
		return null;
	}

	public void method3366(Class182 class182) {
		method14836(null != anIntArray9386, aFloatArray9389 != null, false, class182);
	}

	public void method3234(Class182 class182) {
		method14836(null != anIntArray9386, aFloatArray9389 != null, false, class182);
	}

	public Class527_Sub16 method3360(int i, int i_1260_, int i_1261_, int i_1262_, int i_1263_, float f) {
		return null;
	}

	public void method3369(int i, int i_1264_, int i_1265_, int i_1266_) {
		/* empty */
	}

	void method14869(boolean bool, boolean bool_1267_, boolean bool_1268_, Class182 class182) {
		Class101 class101 = method14835(Thread.currentThread());
		for (Class522_Sub6_Sub1 class522_sub6_sub1 = ((Class522_Sub6_Sub1) class182.aClass710_2094.method14400(426039171)); class522_sub6_sub1 != null; class522_sub6_sub1 = ((Class522_Sub6_Sub1) class182.aClass710_2094.method14399(-375033774))) {
			int i = class522_sub6_sub1.anInt11411 >> 12;
			int i_1269_ = class522_sub6_sub1.anInt11407 >> 12;
			int i_1270_ = class522_sub6_sub1.anInt11403 >> 12;
			float f = (aClass427_9403.aFloatArray4807[14] + (aClass427_9403.aFloatArray4807[10] * (float) i_1270_ + ((float) i * aClass427_9403.aFloatArray4807[2] + (aClass427_9403.aFloatArray4807[6] * (float) i_1269_))));
			float f_1271_ = ((float) i_1269_ * aClass427_9403.aFloatArray4807[7] + aClass427_9403.aFloatArray4807[3] * (float) i + (float) i_1270_ * aClass427_9403.aFloatArray4807[11] + aClass427_9403.aFloatArray4807[15]);
			if (!(f < -f_1271_)) {
				float f_1272_ = aFloat9405 * f / f_1271_ + aFloat9414;
				if (!(f > class101.aFloat1192)) {
					float f_1273_ = (aClass427_9403.aFloatArray4807[12] + ((aClass427_9403.aFloatArray4807[8] * (float) i_1270_) + (((float) i_1269_ * aClass427_9403.aFloatArray4807[4]) + (aClass427_9403.aFloatArray4807[0] * (float) i))));
					float f_1274_ = (aClass427_9403.aFloatArray4807[9] * (float) i_1270_ + (aClass427_9403.aFloatArray4807[1] * (float) i + ((float) i_1269_ * aClass427_9403.aFloatArray4807[5])) + aClass427_9403.aFloatArray4807[13]);
					if (!(f_1273_ < -f_1271_) && !(f_1273_ > f_1271_) && !(f_1274_ < -f_1271_) && !(f_1274_ > f_1271_)) {
						float f_1275_ = (float) class522_sub6_sub1.anInt11408 / 4096.0F;
						float f_1276_ = (aClass427_9402.aFloatArray4807[0] * f_1275_ + f_1273_);
						float f_1277_ = (f_1271_ + aClass427_9402.aFloatArray4807[3] * f_1275_);
						float f_1278_ = aFloat9410 + aFloat9419 * f_1273_ / f_1271_;
						float f_1279_ = aFloat9412 + f_1274_ * aFloat9395 / f_1271_;
						float f_1280_ = f_1276_ * aFloat9419 / f_1277_ + aFloat9410;
						method14837(bool, bool_1267_, bool_1268_, class522_sub6_sub1, (int) f_1278_, (int) f_1279_, f_1272_, (int) (f_1280_ < f_1278_ ? f_1278_ - f_1280_ : f_1280_ - f_1278_));
					}
				}
			}
		}
	}

	public void method3151(int i, int i_1281_, int i_1282_, int i_1283_, int i_1284_, int i_1285_, int i_1286_, int i_1287_, int i_1288_) {
		if (anIntArray9386 != null) {
			i_1282_ -= i;
			i_1283_ -= i_1281_;
			if (0 == i_1283_) {
				if (i_1282_ >= 0)
					method14830(i, i_1281_, 1 + i_1282_, i_1284_, i_1285_, i_1286_, i_1287_, i_1288_);
				else {
					int i_1289_ = i_1287_ + i_1286_;
					i_1288_ %= i_1289_;
					i_1288_ = (i_1289_ + i_1286_ - i_1288_ - (-i_1282_ + 1) % i_1289_);
					i_1288_ %= i_1289_;
					if (i_1288_ < 0)
						i_1288_ += i_1289_;
					method14830(i + i_1282_, i_1281_, 1 + -i_1282_, i_1284_, i_1285_, i_1286_, i_1287_, i_1288_);
				}
			} else if (0 == i_1282_) {
				if (i_1283_ >= 0)
					method14831(i, i_1281_, 1 + i_1283_, i_1284_, i_1285_, i_1286_, i_1287_, i_1288_);
				else {
					int i_1290_ = i_1286_ + i_1287_;
					i_1288_ %= i_1290_;
					i_1288_ = (i_1286_ + i_1290_ - i_1288_ - (1 + -i_1283_) % i_1290_);
					i_1288_ %= i_1290_;
					if (i_1288_ < 0)
						i_1288_ += i_1290_;
					method14831(i, i_1281_ + i_1283_, 1 + -i_1283_, i_1284_, i_1285_, i_1286_, i_1287_, i_1288_);
				}
			} else {
				i_1288_ <<= 8;
				i_1286_ <<= 8;
				i_1287_ <<= 8;
				int i_1291_ = i_1286_ + i_1287_;
				i_1288_ %= i_1291_;
				if (i_1282_ + i_1283_ < 0) {
					int i_1292_ = (int) (Math.sqrt((double) (i_1283_ * i_1283_ + i_1282_ * i_1282_)) * 256.0);
					int i_1293_ = i_1292_ % i_1291_;
					i_1288_ = i_1291_ + i_1286_ - i_1288_ - i_1293_;
					i_1288_ %= i_1291_;
					if (i_1288_ < 0)
						i_1288_ += i_1291_;
					i += i_1282_;
					i_1282_ = -i_1282_;
					i_1281_ += i_1283_;
					i_1283_ = -i_1283_;
				}
				if (i_1282_ > i_1283_) {
					i_1281_ <<= 16;
					i_1281_ += 32768;
					i_1283_ <<= 16;
					int i_1294_ = (int) Math.floor((double) i_1283_ / (double) i_1282_ + 0.5);
					i_1282_ += i;
					int i_1295_ = i_1284_ >>> 24;
					int i_1296_ = (int) Math.sqrt((double) (65536 + ((i_1294_ >> 8) * (i_1294_ >> 8))));
					if (0 == i_1285_ || 1 == i_1285_ && 255 == i_1295_) {
						while (i <= i_1282_) {
							int i_1297_ = i_1281_ >> 16;
							if (i >= 1605202751 * anInt9383 && i < 2014358275 * anInt9391 && i_1297_ >= anInt9392 * -456655989 && i_1297_ < -383695469 * anInt9393 && i_1288_ < i_1286_)
								anIntArray9386[i + i_1297_ * (anInt9387 * -1173855569)] = i_1284_;
							i_1281_ += i_1294_;
							i++;
							i_1288_ += i_1296_;
							i_1288_ %= i_1291_;
						}
					} else if (i_1285_ == 1) {
						i_1284_ = (((i_1284_ & 0xff00ff) * i_1295_ >> 8 & 0xff00ff) + (i_1295_ * (i_1284_ & 0xff00) >> 8 & 0xff00) + (i_1295_ << 24));
						int i_1298_ = 256 - i_1295_;
						while (i <= i_1282_) {
							int i_1299_ = i_1281_ >> 16;
							if (i >= 1605202751 * anInt9383 && i < 2014358275 * anInt9391 && i_1299_ >= -456655989 * anInt9392 && i_1299_ < -383695469 * anInt9393 && i_1288_ < i_1286_) {
								int i_1300_ = i + -1173855569 * anInt9387 * i_1299_;
								int i_1301_ = anIntArray9386[i_1300_];
								i_1301_ = ((i_1298_ * (i_1301_ & 0xff00) >> 8 & 0xff00) + (i_1298_ * (i_1301_ & 0xff00ff) >> 8 & 0xff00ff));
								anIntArray9386[i_1300_] = i_1301_ + i_1284_;
							}
							i_1281_ += i_1294_;
							i++;
							i_1288_ += i_1296_;
							i_1288_ %= i_1291_;
						}
					} else if (2 == i_1285_) {
						while (i <= i_1282_) {
							int i_1302_ = i_1281_ >> 16;
							if (i >= anInt9383 * 1605202751 && i < 2014358275 * anInt9391 && i_1302_ >= anInt9392 * -456655989 && i_1302_ < -383695469 * anInt9393 && i_1288_ < i_1286_) {
								int i_1303_ = i + anInt9387 * -1173855569 * i_1302_;
								int i_1304_ = anIntArray9386[i_1303_];
								int i_1305_ = i_1284_ + i_1304_;
								int i_1306_ = ((i_1284_ & 0xff00ff) + (i_1304_ & 0xff00ff));
								i_1304_ = ((i_1306_ & 0x1000100) + (i_1305_ - i_1306_ & 0x10000));
								anIntArray9386[i_1303_] = i_1305_ - i_1304_ | i_1304_ - (i_1304_ >>> 8);
							}
							i_1281_ += i_1294_;
							i++;
							i_1288_ += i_1296_;
							i_1288_ %= i_1291_;
						}
					} else
						throw new IllegalArgumentException();
				} else {
					i <<= 16;
					i += 32768;
					i_1282_ <<= 16;
					int i_1307_ = (int) Math.floor((double) i_1282_ / (double) i_1283_ + 0.5);
					i_1283_ += i_1281_;
					int i_1308_ = i_1284_ >>> 24;
					int i_1309_ = (int) Math.sqrt((double) ((i_1307_ >> 8) * (i_1307_ >> 8) + 65536));
					if (i_1285_ == 0 || i_1285_ == 1 && 255 == i_1308_) {
						while (i_1281_ <= i_1283_) {
							int i_1310_ = i >> 16;
							if (i_1281_ >= -456655989 * anInt9392 && i_1281_ < -383695469 * anInt9393 && i_1310_ >= 1605202751 * anInt9383 && i_1310_ < anInt9391 * 2014358275 && i_1288_ < i_1286_)
								anIntArray9386[i_1310_ + (-1173855569 * anInt9387 * i_1281_)] = i_1284_;
							i += i_1307_;
							i_1281_++;
							i_1288_ += i_1309_;
							i_1288_ %= i_1291_;
						}
					} else if (i_1285_ == 1) {
						i_1284_ = ((i_1308_ << 24) + (((i_1284_ & 0xff00ff) * i_1308_ >> 8 & 0xff00ff) + (i_1308_ * (i_1284_ & 0xff00) >> 8 & 0xff00)));
						int i_1311_ = 256 - i_1308_;
						while (i_1281_ <= i_1283_) {
							int i_1312_ = i >> 16;
							if (i_1281_ >= -456655989 * anInt9392 && i_1281_ < anInt9393 * -383695469 && i_1312_ >= 1605202751 * anInt9383 && i_1312_ < 2014358275 * anInt9391 && i_1288_ < i_1286_) {
								int i_1313_ = (i_1312_ + -1173855569 * anInt9387 * i_1281_);
								int i_1314_ = anIntArray9386[i_1313_];
								i_1314_ = (((i_1314_ & 0xff00) * i_1311_ >> 8 & 0xff00) + ((i_1314_ & 0xff00ff) * i_1311_ >> 8 & 0xff00ff));
								anIntArray9386[i_1312_ + (-1173855569 * anInt9387 * i_1281_)] = i_1314_ + i_1284_;
							}
							i += i_1307_;
							i_1281_++;
							i_1288_ += i_1309_;
							i_1288_ %= i_1291_;
						}
					} else if (2 == i_1285_) {
						while (i_1281_ <= i_1283_) {
							int i_1315_ = i >> 16;
							if (i_1281_ >= -456655989 * anInt9392 && i_1281_ < -383695469 * anInt9393 && i_1315_ >= 1605202751 * anInt9383 && i_1315_ < anInt9391 * 2014358275 && i_1288_ < i_1286_) {
								int i_1316_ = (anInt9387 * -1173855569 * i_1281_ + i_1315_);
								int i_1317_ = anIntArray9386[i_1316_];
								int i_1318_ = i_1317_ + i_1284_;
								int i_1319_ = ((i_1284_ & 0xff00ff) + (i_1317_ & 0xff00ff));
								i_1317_ = ((i_1318_ - i_1319_ & 0x10000) + (i_1319_ & 0x1000100));
								anIntArray9386[i_1316_] = i_1318_ - i_1317_ | i_1317_ - (i_1317_ >>> 8);
							}
							i += i_1307_;
							i_1281_++;
							i_1288_ += i_1309_;
							i_1288_ %= i_1291_;
						}
					} else
						throw new IllegalArgumentException();
				}
			}
		}
	}

	void method14870(boolean bool, boolean bool_1320_, boolean bool_1321_, Class522_Sub6_Sub1 class522_sub6_sub1, int i, int i_1322_, float f, int i_1323_) {
		int i_1324_ = class522_sub6_sub1.anInt11410;
		int i_1325_ = i_1323_;
		i_1323_ <<= 1;
		if (i_1324_ == -1)
			method14838(bool_1320_, i, i_1322_, f, i_1325_, class522_sub6_sub1.anInt11409, 1);
		else {
			if (i_1324_ != anInt9418 * -1948774645) {
				Class147 class147 = (Class147) aClass205_9400.method3787((long) i_1324_);
				if (class147 == null) {
					Class163 class163 = aClass181_2059.method3544(i_1324_, (byte) -53);
					int[] is = method14841(i_1324_);
					if (is != null) {
						int i_1326_ = class163.anInt1780 * 1039262975;
						class147 = method3163(is, 0, i_1326_, i_1326_, i_1326_, 1207240790);
						aClass205_9400.method3790(class147, (long) i_1324_);
					} else
						return;
				}
				anInt9418 = i_1324_ * -134298461;
				aClass147_9396 = class147;
			}
			i_1323_++;
			((Class147_Sub1) aClass147_9396).method14430(bool, bool_1320_, bool_1321_, i - i_1325_, i_1322_ - i_1325_, f, i_1323_, i_1323_, 0, class522_sub6_sub1.anInt11409, 1, 1, false);
		}
	}

	public boolean method3408() {
		return false;
	}

	public void method3276(long l) {
		/* empty */
	}

	void method14871(boolean bool, boolean bool_1327_, boolean bool_1328_, int i, int i_1329_, float f, int i_1330_, int i_1331_, short i_1332_, int i_1333_, int i_1334_, int i_1335_) {
		if (0 != i_1330_ && 0 != i_1331_) {
			if (i_1332_ != -1) {
				Class163 class163 = aClass181_2059.method3544(i_1332_, (byte) 3);
				if (!class163.aBool1806) {
					if (i_1332_ != anInt9418 * -1948774645) {
						Class147 class147 = ((Class147) aClass205_9400.method3787((long) i_1332_));
						if (null == class147) {
							int[] is = method14841(i_1332_);
							if (is == null)
								return;
							int i_1336_ = class163.anInt1780 * 1039262975;
							class147 = method3163(is, 0, i_1336_, i_1336_, i_1336_, -1762037135);
							aClass205_9400.method3790(class147, (long) i_1332_);
						}
						anInt9418 = i_1332_ * -134298461;
						aClass147_9396 = class147;
					}
					((Class147_Sub1) aClass147_9396).method14430(bool, bool_1327_, bool_1328_, i - i_1330_, i_1329_ - i_1331_, f, i_1330_ << 1, i_1331_ << 1, i_1334_, i_1333_, i_1335_, 1, Class595.aClass595_7814 != class163.aClass595_1784);
					return;
				}
			}
			method14838(bool_1327_, i, i_1329_, f, i_1330_, i_1333_, i_1335_);
		}
	}

	void method14872(boolean bool, int i, int i_1337_, float f, int i_1338_, int i_1339_, int i_1340_) {
		if (anIntArray9386 != null) {
			if (i_1338_ < 0)
				i_1338_ = -i_1338_;
			int i_1341_ = i_1337_ - i_1338_;
			if (i_1341_ < -456655989 * anInt9392)
				i_1341_ = anInt9392 * -456655989;
			int i_1342_ = 1 + (i_1337_ + i_1338_);
			if (i_1342_ > anInt9393 * -383695469)
				i_1342_ = anInt9393 * -383695469;
			int i_1343_ = i_1341_;
			int i_1344_ = i_1338_ * i_1338_;
			int i_1345_ = 0;
			int i_1346_ = i_1337_ - i_1343_;
			int i_1347_ = i_1346_ * i_1346_;
			int i_1348_ = i_1347_ - i_1346_;
			if (i_1337_ > i_1342_)
				i_1337_ = i_1342_;
			int i_1349_ = i_1339_ >>> 24;
			if (0 == i_1340_ || 1 == i_1340_ && 255 == i_1349_) {
				while (i_1343_ < i_1337_) {
					for (/**/; i_1348_ <= i_1344_ || i_1347_ <= i_1344_; i_1348_ += i_1345_++ + i_1345_)
						i_1347_ += i_1345_ + i_1345_;
					int i_1350_ = i - i_1345_ + 1;
					if (i_1350_ < 1605202751 * anInt9383)
						i_1350_ = anInt9383 * 1605202751;
					int i_1351_ = i_1345_ + i;
					if (i_1351_ > 2014358275 * anInt9391)
						i_1351_ = anInt9391 * 2014358275;
					int i_1352_ = i_1343_ * (anInt9387 * -1173855569) + i_1350_;
					for (int i_1353_ = i_1350_; i_1353_ < i_1351_; i_1353_++) {
						if (!bool || f < aFloatArray9389[i_1352_])
							anIntArray9386[i_1352_] = i_1339_;
						i_1352_++;
					}
					i_1343_++;
					i_1347_ -= i_1346_-- + i_1346_;
					i_1348_ -= i_1346_ + i_1346_;
				}
				i_1345_ = i_1338_;
				i_1346_ = i_1343_ - i_1337_;
				i_1348_ = i_1346_ * i_1346_ + i_1344_;
				i_1347_ = i_1348_ - i_1345_;
				i_1348_ -= i_1346_;
				while (i_1343_ < i_1342_) {
					for (/**/; i_1348_ > i_1344_ && i_1347_ > i_1344_; i_1347_ -= i_1345_ + i_1345_)
						i_1348_ -= i_1345_-- + i_1345_;
					int i_1354_ = i - i_1345_;
					if (i_1354_ < anInt9383 * 1605202751)
						i_1354_ = 1605202751 * anInt9383;
					int i_1355_ = i_1345_ + i;
					if (i_1355_ > 2014358275 * anInt9391 - 1)
						i_1355_ = 2014358275 * anInt9391 - 1;
					int i_1356_ = i_1354_ + anInt9387 * -1173855569 * i_1343_;
					for (int i_1357_ = i_1354_; i_1357_ <= i_1355_; i_1357_++) {
						if (!bool || f < aFloatArray9389[i_1356_])
							anIntArray9386[i_1356_] = i_1339_;
						i_1356_++;
					}
					i_1343_++;
					i_1348_ += i_1346_ + i_1346_;
					i_1347_ += i_1346_++ + i_1346_;
				}
			} else if (i_1340_ == 1) {
				i_1339_ = ((i_1349_ << 24) + (((i_1339_ & 0xff00) * i_1349_ >> 8 & 0xff00) + (i_1349_ * (i_1339_ & 0xff00ff) >> 8 & 0xff00ff)));
				int i_1358_ = 256 - i_1349_;
				while (i_1343_ < i_1337_) {
					for (/**/; i_1348_ <= i_1344_ || i_1347_ <= i_1344_; i_1348_ += i_1345_++ + i_1345_)
						i_1347_ += i_1345_ + i_1345_;
					int i_1359_ = 1 + (i - i_1345_);
					if (i_1359_ < anInt9383 * 1605202751)
						i_1359_ = anInt9383 * 1605202751;
					int i_1360_ = i_1345_ + i;
					if (i_1360_ > 2014358275 * anInt9391)
						i_1360_ = 2014358275 * anInt9391;
					int i_1361_ = i_1359_ + i_1343_ * (-1173855569 * anInt9387);
					for (int i_1362_ = i_1359_; i_1362_ < i_1360_; i_1362_++) {
						if (!bool || f < aFloatArray9389[i_1361_]) {
							int i_1363_ = anIntArray9386[i_1361_];
							i_1363_ = (((i_1363_ & 0xff00ff) * i_1358_ >> 8 & 0xff00ff) + ((i_1363_ & 0xff00) * i_1358_ >> 8 & 0xff00));
							anIntArray9386[i_1361_] = i_1363_ + i_1339_;
						}
						i_1361_++;
					}
					i_1343_++;
					i_1347_ -= i_1346_-- + i_1346_;
					i_1348_ -= i_1346_ + i_1346_;
				}
				i_1345_ = i_1338_;
				i_1346_ = -i_1346_;
				i_1348_ = i_1344_ + i_1346_ * i_1346_;
				i_1347_ = i_1348_ - i_1345_;
				i_1348_ -= i_1346_;
				while (i_1343_ < i_1342_) {
					for (/**/; i_1348_ > i_1344_ && i_1347_ > i_1344_; i_1347_ -= i_1345_ + i_1345_)
						i_1348_ -= i_1345_-- + i_1345_;
					int i_1364_ = i - i_1345_;
					if (i_1364_ < 1605202751 * anInt9383)
						i_1364_ = 1605202751 * anInt9383;
					int i_1365_ = i_1345_ + i;
					if (i_1365_ > anInt9391 * 2014358275 - 1)
						i_1365_ = 2014358275 * anInt9391 - 1;
					int i_1366_ = i_1364_ + i_1343_ * (anInt9387 * -1173855569);
					for (int i_1367_ = i_1364_; i_1367_ <= i_1365_; i_1367_++) {
						if (!bool || f < aFloatArray9389[i_1366_]) {
							int i_1368_ = anIntArray9386[i_1366_];
							i_1368_ = (((i_1368_ & 0xff00) * i_1358_ >> 8 & 0xff00) + ((i_1368_ & 0xff00ff) * i_1358_ >> 8 & 0xff00ff));
							anIntArray9386[i_1366_] = i_1339_ + i_1368_;
						}
						i_1366_++;
					}
					i_1343_++;
					i_1348_ += i_1346_ + i_1346_;
					i_1347_ += i_1346_++ + i_1346_;
				}
			} else if (2 == i_1340_) {
				while (i_1343_ < i_1337_) {
					for (/**/; i_1348_ <= i_1344_ || i_1347_ <= i_1344_; i_1348_ += i_1345_++ + i_1345_)
						i_1347_ += i_1345_ + i_1345_;
					int i_1369_ = i - i_1345_ + 1;
					if (i_1369_ < 1605202751 * anInt9383)
						i_1369_ = 1605202751 * anInt9383;
					int i_1370_ = i + i_1345_;
					if (i_1370_ > anInt9391 * 2014358275)
						i_1370_ = anInt9391 * 2014358275;
					int i_1371_ = i_1343_ * (-1173855569 * anInt9387) + i_1369_;
					for (int i_1372_ = i_1369_; i_1372_ < i_1370_; i_1372_++) {
						if (!bool || f < aFloatArray9389[i_1371_]) {
							int i_1373_ = anIntArray9386[i_1371_];
							int i_1374_ = i_1373_ + i_1339_;
							int i_1375_ = (i_1339_ & 0xff00ff) + (i_1373_ & 0xff00ff);
							i_1373_ = ((i_1374_ - i_1375_ & 0x10000) + (i_1375_ & 0x1000100));
							anIntArray9386[i_1371_] = i_1374_ - i_1373_ | i_1373_ - (i_1373_ >>> 8);
						}
						i_1371_++;
					}
					i_1343_++;
					i_1347_ -= i_1346_-- + i_1346_;
					i_1348_ -= i_1346_ + i_1346_;
				}
				i_1345_ = i_1338_;
				i_1346_ = -i_1346_;
				i_1348_ = i_1346_ * i_1346_ + i_1344_;
				i_1347_ = i_1348_ - i_1345_;
				i_1348_ -= i_1346_;
				while (i_1343_ < i_1342_) {
					for (/**/; i_1348_ > i_1344_ && i_1347_ > i_1344_; i_1347_ -= i_1345_ + i_1345_)
						i_1348_ -= i_1345_-- + i_1345_;
					int i_1376_ = i - i_1345_;
					if (i_1376_ < anInt9383 * 1605202751)
						i_1376_ = 1605202751 * anInt9383;
					int i_1377_ = i_1345_ + i;
					if (i_1377_ > 2014358275 * anInt9391 - 1)
						i_1377_ = 2014358275 * anInt9391 - 1;
					int i_1378_ = anInt9387 * -1173855569 * i_1343_ + i_1376_;
					for (int i_1379_ = i_1376_; i_1379_ <= i_1377_; i_1379_++) {
						if (!bool || f < aFloatArray9389[i_1378_]) {
							int i_1380_ = anIntArray9386[i_1378_];
							int i_1381_ = i_1380_ + i_1339_;
							int i_1382_ = (i_1339_ & 0xff00ff) + (i_1380_ & 0xff00ff);
							i_1380_ = (i_1382_ & 0x1000100) + (i_1381_ - i_1382_ & 0x10000);
							anIntArray9386[i_1378_] = i_1381_ - i_1380_ | i_1380_ - (i_1380_ >>> 8);
						}
						i_1378_++;
					}
					i_1343_++;
					i_1348_ += i_1346_ + i_1346_;
					i_1347_ += i_1346_++ + i_1346_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public void method3123(long l) {
		/* empty */
	}

	public void method3185(Class432 class432) {
		aClass432_9420 = class432;
		method14839();
	}

	public Class147 method3332(Class185 class185, boolean bool) {
		int i = class185.method3636();
		int i_1383_ = class185.method3570();
		Class147_Sub1 class147_sub1;
		if (bool && !class185.method3568() && class185.method3567()) {
			Class185_Sub2 class185_sub2 = (Class185_Sub2) class185;
			int[] is = new int[class185_sub2.anIntArray9377.length];
			byte[] is_1384_ = new byte[i * i_1383_];
			for (int i_1385_ = 0; i_1385_ < i_1383_; i_1385_++) {
				int i_1386_ = i_1385_ * i;
				for (int i_1387_ = 0; i_1387_ < i; i_1387_++)
					is_1384_[i_1386_ + i_1387_] = class185_sub2.aByteArray9371[i_1386_ + i_1387_];
			}
			for (int i_1388_ = 0; i_1388_ < class185_sub2.anIntArray9377.length; i_1388_++)
				is[i_1388_] = class185_sub2.anIntArray9377[i_1388_];
			class147_sub1 = new Class147_Sub1_Sub3(this, is_1384_, is, i, i_1383_);
		} else {
			int[] is = class185.method3584(false);
			if (class185.method3568())
				class147_sub1 = new Class147_Sub1_Sub2(this, is, i, i_1383_);
			else
				class147_sub1 = new Class147_Sub1_Sub1(this, is, i, i_1383_);
		}
		class147_sub1.method2405(class185.method3634(), class185.method3611(), class185.method3572(), class185.method3603());
		return class147_sub1;
	}

	public Class432 method3211() {
		return new Class432(aClass432_9420);
	}

	public void method3105(Class427 class427) {
		aClass427_9402.method6750(class427);
		method14839();
	}

	public void method3116(int i, int i_1389_) {
		/* empty */
	}

	public void method3291(Class427 class427) {
		aClass427_9402.method6750(class427);
		method14839();
	}

	public Class427 method3377() {
		return new Class427(aClass427_9402);
	}

	public Class427 method3137() {
		return new Class427(aClass427_9402);
	}

	public void method3379(float f) {
		anInt9399 = (int) (f * 65535.0F) * -567317463;
	}

	public void method3302(float f) {
		anInt9399 = (int) (f * 65535.0F) * -567317463;
	}

	public void method3505(float f) {
		anInt9399 = (int) (f * 65535.0F) * -567317463;
	}

	public void method3277(int i, float f, float f_1390_, float f_1391_, float f_1392_, float f_1393_) {
		anInt9397 = (int) (65535.0F * f) * 1717693179;
		anInt9408 = -300169701 * (int) (f_1390_ * 65535.0F);
		float f_1394_ = (float) Math.sqrt((double) (f_1392_ * f_1392_ + f_1391_ * f_1391_ + f_1393_ * f_1393_));
		anInt9413 = (int) (65535.0F * f_1391_ / f_1394_) * 1203059775;
		anInt9409 = (int) (f_1392_ * 65535.0F / f_1394_) * 658553925;
		anInt9394 = 1070820009 * (int) (65535.0F * f_1393_ / f_1394_);
	}

	public int method3222(int i, int i_1395_) {
		return i | i_1395_;
	}

	public void method3384(int i, float f, float f_1396_, float f_1397_, float f_1398_, float f_1399_) {
		anInt9397 = (int) (65535.0F * f) * 1717693179;
		anInt9408 = -300169701 * (int) (f_1396_ * 65535.0F);
		float f_1400_ = (float) Math.sqrt((double) (f_1398_ * f_1398_ + f_1397_ * f_1397_ + f_1399_ * f_1399_));
		anInt9413 = (int) (65535.0F * f_1397_ / f_1400_) * 1203059775;
		anInt9409 = (int) (f_1398_ * 65535.0F / f_1400_) * 658553925;
		anInt9394 = 1070820009 * (int) (65535.0F * f_1399_ / f_1400_);
	}

	public void method3385(int i) {
		/* empty */
	}

	public Class142 method3270(int i, int i_1401_, int[] is, int[] is_1402_) {
		return new Class142_Sub1(i, i_1401_, is, is_1402_);
	}

	void method3306(int i, int i_1403_, int i_1404_, int i_1405_, int i_1406_) {
		if (anIntArray9386 != null && (i >= anInt9383 * 1605202751 && i < 2014358275 * anInt9391)) {
			if (i_1403_ < -456655989 * anInt9392) {
				i_1404_ -= anInt9392 * -456655989 - i_1403_;
				i_1403_ = anInt9392 * -456655989;
			}
			if (i_1404_ + i_1403_ > anInt9393 * -383695469)
				i_1404_ = anInt9393 * -383695469 - i_1403_;
			int i_1407_ = i + anInt9387 * -1173855569 * i_1403_;
			int i_1408_ = i_1405_ >>> 24;
			if (i_1406_ == 0 || 1 == i_1406_ && i_1408_ == 255) {
				for (int i_1409_ = 0; i_1409_ < i_1404_; i_1409_++)
					anIntArray9386[i_1407_ + i_1409_ * (anInt9387 * -1173855569)] = i_1405_;
			} else if (1 == i_1406_) {
				i_1405_ = (((i_1405_ & 0xff00) * i_1408_ >> 8 & 0xff00) + ((i_1405_ & 0xff00ff) * i_1408_ >> 8 & 0xff00ff) + (i_1408_ << 24));
				int i_1410_ = 256 - i_1408_;
				for (int i_1411_ = 0; i_1411_ < i_1404_; i_1411_++) {
					int i_1412_ = i_1407_ + i_1411_ * (anInt9387 * -1173855569);
					int i_1413_ = anIntArray9386[i_1412_];
					i_1413_ = (((i_1413_ & 0xff00ff) * i_1410_ >> 8 & 0xff00ff) + ((i_1413_ & 0xff00) * i_1410_ >> 8 & 0xff00));
					anIntArray9386[i_1412_] = i_1405_ + i_1413_;
				}
			} else if (i_1406_ == 2) {
				for (int i_1414_ = 0; i_1414_ < i_1404_; i_1414_++) {
					int i_1415_ = -1173855569 * anInt9387 * i_1414_ + i_1407_;
					int i_1416_ = anIntArray9386[i_1415_];
					int i_1417_ = i_1405_ + i_1416_;
					int i_1418_ = (i_1405_ & 0xff00ff) + (i_1416_ & 0xff00ff);
					i_1416_ = (i_1418_ & 0x1000100) + (i_1417_ - i_1418_ & 0x10000);
					anIntArray9386[i_1415_] = i_1417_ - i_1416_ | i_1416_ - (i_1416_ >>> 8);
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public void method3388(int i, int i_1419_, int i_1420_) {
		for (int i_1421_ = 0; i_1421_ < aClass101Array9416.length; i_1421_++) {
			Class101 class101 = aClass101Array9416[i_1421_];
			class101.anInt1194 = (i & 0xffffff) * 653672225;
			int i_1422_ = -1009384223 * class101.anInt1194 >>> 16 & 0xff;
			if (i_1422_ < 2)
				i_1422_ = 2;
			int i_1423_ = -1009384223 * class101.anInt1194 >> 8 & 0xff;
			if (i_1423_ < 2)
				i_1423_ = 2;
			int i_1424_ = class101.anInt1194 * -1009384223 & 0xff;
			if (i_1424_ < 2)
				i_1424_ = 2;
			class101.anInt1194 = 653672225 * (i_1422_ << 16 | i_1423_ << 8 | i_1424_);
			if (i_1419_ < 0)
				class101.aBool1191 = false;
			else
				class101.aBool1191 = true;
		}
	}

	void method14873() {
		aClass427_9398.method6784(aClass432_9420);
		aClass427_9403.method6750(aClass427_9398);
		aClass427_9403.method6751(aClass427_9402);
		aClass427_9403.method6760(aFloatArrayArray9404[0]);
		aClass427_9403.method6761(aFloatArrayArray9404[1]);
		aClass427_9403.method6756(aFloatArrayArray9404[2]);
		aClass427_9403.method6757(aFloatArrayArray9404[3]);
		aClass427_9403.method6758(aFloatArrayArray9404[4]);
		aClass427_9403.method6779(aFloatArrayArray9404[5]);
		float f = aClass427_9402.method6755();
		float f_1425_ = (aClass427_9402.aFloatArray4807[10] * (f - 255.0F) + aClass427_9402.aFloatArray4807[14]);
		float f_1426_ = (aClass427_9402.aFloatArray4807[10] * f + aClass427_9402.aFloatArray4807[14]);
		float f_1427_ = f_1426_ - f_1425_;
		for (int i = 0; i < 1413774429 * anInt9415; i++) {
			Class101 class101 = aClass101Array9416[i];
			class101.aFloat1192 = f_1425_;
			class101.aFloat1193 = f_1427_;
		}
	}

	void method14874() {
		aClass427_9398.method6784(aClass432_9420);
		aClass427_9403.method6750(aClass427_9398);
		aClass427_9403.method6751(aClass427_9402);
		aClass427_9403.method6760(aFloatArrayArray9404[0]);
		aClass427_9403.method6761(aFloatArrayArray9404[1]);
		aClass427_9403.method6756(aFloatArrayArray9404[2]);
		aClass427_9403.method6757(aFloatArrayArray9404[3]);
		aClass427_9403.method6758(aFloatArrayArray9404[4]);
		aClass427_9403.method6779(aFloatArrayArray9404[5]);
		float f = aClass427_9402.method6755();
		float f_1428_ = (aClass427_9402.aFloatArray4807[10] * (f - 255.0F) + aClass427_9402.aFloatArray4807[14]);
		float f_1429_ = (aClass427_9402.aFloatArray4807[10] * f + aClass427_9402.aFloatArray4807[14]);
		float f_1430_ = f_1429_ - f_1428_;
		for (int i = 0; i < 1413774429 * anInt9415; i++) {
			Class101 class101 = aClass101Array9416[i];
			class101.aFloat1192 = f_1428_;
			class101.aFloat1193 = f_1430_;
		}
	}

	void method14875(int i, int i_1431_, int i_1432_, int i_1433_, int i_1434_, int i_1435_, int i_1436_, int i_1437_) {
		if (anIntArray9386 != null && (i >= anInt9383 * 1605202751 && i < 2014358275 * anInt9391)) {
			int i_1438_ = i + i_1431_ * (-1173855569 * anInt9387);
			int i_1439_ = i_1433_ >>> 24;
			int i_1440_ = i_1436_ + i_1435_;
			int i_1441_ = i_1437_ % i_1440_;
			if (i_1434_ == 0 || 1 == i_1434_ && i_1439_ == 255) {
				int i_1442_ = 0;
				while (i_1442_ < i_1432_) {
					if (i_1442_ + i_1431_ >= -456655989 * anInt9392 && i_1442_ + i_1431_ < -383695469 * anInt9393 && i_1441_ < i_1435_)
						anIntArray9386[(i_1442_ * (anInt9387 * -1173855569) + i_1438_)] = i_1433_;
					i_1442_++;
					i_1441_ = ++i_1441_ % i_1440_;
				}
			} else if (i_1434_ == 1) {
				i_1433_ = ((i_1439_ * (i_1433_ & 0xff00) >> 8 & 0xff00) + ((i_1433_ & 0xff00ff) * i_1439_ >> 8 & 0xff00ff) + (i_1439_ << 24));
				int i_1443_ = 256 - i_1439_;
				int i_1444_ = 0;
				while (i_1444_ < i_1432_) {
					if (i_1431_ + i_1444_ >= anInt9392 * -456655989 && i_1444_ + i_1431_ < -383695469 * anInt9393 && i_1441_ < i_1435_) {
						int i_1445_ = i_1438_ + -1173855569 * anInt9387 * i_1444_;
						int i_1446_ = anIntArray9386[i_1445_];
						i_1446_ = ((i_1443_ * (i_1446_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_1446_ & 0xff00) * i_1443_ >> 8 & 0xff00));
						anIntArray9386[i_1445_] = i_1433_ + i_1446_;
					}
					i_1444_++;
					i_1441_ = ++i_1441_ % i_1440_;
				}
			} else if (i_1434_ == 2) {
				int i_1447_ = 0;
				while (i_1447_ < i_1432_) {
					if (i_1431_ + i_1447_ >= -456655989 * anInt9392 && i_1447_ + i_1431_ < -383695469 * anInt9393 && i_1441_ < i_1435_) {
						int i_1448_ = i_1447_ * (anInt9387 * -1173855569) + i_1438_;
						int i_1449_ = anIntArray9386[i_1448_];
						int i_1450_ = i_1433_ + i_1449_;
						int i_1451_ = (i_1433_ & 0xff00ff) + (i_1449_ & 0xff00ff);
						i_1449_ = (i_1451_ & 0x1000100) + (i_1450_ - i_1451_ & 0x10000);
						anIntArray9386[i_1448_] = i_1450_ - i_1449_ | i_1449_ - (i_1449_ >>> 8);
					}
					i_1447_++;
					i_1441_ = ++i_1441_ % i_1440_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public Class527_Sub16 method3236(int i, int i_1452_, int i_1453_, int i_1454_, int i_1455_, float f) {
		return null;
	}

	void method14876(int i) {
		aClass101Array9416[i].method1778(Thread.currentThread(), -1118455964);
	}

	public Class179 method3391(Class179 class179, Class179 class179_1456_, float f, Class179 class179_1457_) {
		return null;
	}

	public void method3392(Class179 class179) {
		/* empty */
	}

	public void method3397(int i, int i_1458_, int i_1459_, int i_1460_) {
		/* empty */
	}

	public void method3394(int i, int i_1461_, int i_1462_, int i_1463_) {
		/* empty */
	}

	public void method3160(int i, int i_1464_, int i_1465_, int i_1466_, int i_1467_, int i_1468_, int i_1469_, int i_1470_, int i_1471_) {
		if (anIntArray9386 != null) {
			i_1465_ -= i;
			i_1466_ -= i_1464_;
			if (0 == i_1466_) {
				if (i_1465_ >= 0)
					method14830(i, i_1464_, 1 + i_1465_, i_1467_, i_1468_, i_1469_, i_1470_, i_1471_);
				else {
					int i_1472_ = i_1470_ + i_1469_;
					i_1471_ %= i_1472_;
					i_1471_ = (i_1472_ + i_1469_ - i_1471_ - (-i_1465_ + 1) % i_1472_);
					i_1471_ %= i_1472_;
					if (i_1471_ < 0)
						i_1471_ += i_1472_;
					method14830(i + i_1465_, i_1464_, 1 + -i_1465_, i_1467_, i_1468_, i_1469_, i_1470_, i_1471_);
				}
			} else if (0 == i_1465_) {
				if (i_1466_ >= 0)
					method14831(i, i_1464_, 1 + i_1466_, i_1467_, i_1468_, i_1469_, i_1470_, i_1471_);
				else {
					int i_1473_ = i_1469_ + i_1470_;
					i_1471_ %= i_1473_;
					i_1471_ = (i_1469_ + i_1473_ - i_1471_ - (1 + -i_1466_) % i_1473_);
					i_1471_ %= i_1473_;
					if (i_1471_ < 0)
						i_1471_ += i_1473_;
					method14831(i, i_1464_ + i_1466_, 1 + -i_1466_, i_1467_, i_1468_, i_1469_, i_1470_, i_1471_);
				}
			} else {
				i_1471_ <<= 8;
				i_1469_ <<= 8;
				i_1470_ <<= 8;
				int i_1474_ = i_1469_ + i_1470_;
				i_1471_ %= i_1474_;
				if (i_1465_ + i_1466_ < 0) {
					int i_1475_ = (int) (Math.sqrt((double) (i_1466_ * i_1466_ + i_1465_ * i_1465_)) * 256.0);
					int i_1476_ = i_1475_ % i_1474_;
					i_1471_ = i_1474_ + i_1469_ - i_1471_ - i_1476_;
					i_1471_ %= i_1474_;
					if (i_1471_ < 0)
						i_1471_ += i_1474_;
					i += i_1465_;
					i_1465_ = -i_1465_;
					i_1464_ += i_1466_;
					i_1466_ = -i_1466_;
				}
				if (i_1465_ > i_1466_) {
					i_1464_ <<= 16;
					i_1464_ += 32768;
					i_1466_ <<= 16;
					int i_1477_ = (int) Math.floor((double) i_1466_ / (double) i_1465_ + 0.5);
					i_1465_ += i;
					int i_1478_ = i_1467_ >>> 24;
					int i_1479_ = (int) Math.sqrt((double) (65536 + ((i_1477_ >> 8) * (i_1477_ >> 8))));
					if (0 == i_1468_ || 1 == i_1468_ && 255 == i_1478_) {
						while (i <= i_1465_) {
							int i_1480_ = i_1464_ >> 16;
							if (i >= 1605202751 * anInt9383 && i < 2014358275 * anInt9391 && i_1480_ >= anInt9392 * -456655989 && i_1480_ < -383695469 * anInt9393 && i_1471_ < i_1469_)
								anIntArray9386[i + i_1480_ * (anInt9387 * -1173855569)] = i_1467_;
							i_1464_ += i_1477_;
							i++;
							i_1471_ += i_1479_;
							i_1471_ %= i_1474_;
						}
					} else if (i_1468_ == 1) {
						i_1467_ = (((i_1467_ & 0xff00ff) * i_1478_ >> 8 & 0xff00ff) + (i_1478_ * (i_1467_ & 0xff00) >> 8 & 0xff00) + (i_1478_ << 24));
						int i_1481_ = 256 - i_1478_;
						while (i <= i_1465_) {
							int i_1482_ = i_1464_ >> 16;
							if (i >= 1605202751 * anInt9383 && i < 2014358275 * anInt9391 && i_1482_ >= -456655989 * anInt9392 && i_1482_ < -383695469 * anInt9393 && i_1471_ < i_1469_) {
								int i_1483_ = i + -1173855569 * anInt9387 * i_1482_;
								int i_1484_ = anIntArray9386[i_1483_];
								i_1484_ = ((i_1481_ * (i_1484_ & 0xff00) >> 8 & 0xff00) + (i_1481_ * (i_1484_ & 0xff00ff) >> 8 & 0xff00ff));
								anIntArray9386[i_1483_] = i_1484_ + i_1467_;
							}
							i_1464_ += i_1477_;
							i++;
							i_1471_ += i_1479_;
							i_1471_ %= i_1474_;
						}
					} else if (2 == i_1468_) {
						while (i <= i_1465_) {
							int i_1485_ = i_1464_ >> 16;
							if (i >= anInt9383 * 1605202751 && i < 2014358275 * anInt9391 && i_1485_ >= anInt9392 * -456655989 && i_1485_ < -383695469 * anInt9393 && i_1471_ < i_1469_) {
								int i_1486_ = i + anInt9387 * -1173855569 * i_1485_;
								int i_1487_ = anIntArray9386[i_1486_];
								int i_1488_ = i_1467_ + i_1487_;
								int i_1489_ = ((i_1467_ & 0xff00ff) + (i_1487_ & 0xff00ff));
								i_1487_ = ((i_1489_ & 0x1000100) + (i_1488_ - i_1489_ & 0x10000));
								anIntArray9386[i_1486_] = i_1488_ - i_1487_ | i_1487_ - (i_1487_ >>> 8);
							}
							i_1464_ += i_1477_;
							i++;
							i_1471_ += i_1479_;
							i_1471_ %= i_1474_;
						}
					} else
						throw new IllegalArgumentException();
				} else {
					i <<= 16;
					i += 32768;
					i_1465_ <<= 16;
					int i_1490_ = (int) Math.floor((double) i_1465_ / (double) i_1466_ + 0.5);
					i_1466_ += i_1464_;
					int i_1491_ = i_1467_ >>> 24;
					int i_1492_ = (int) Math.sqrt((double) ((i_1490_ >> 8) * (i_1490_ >> 8) + 65536));
					if (i_1468_ == 0 || i_1468_ == 1 && 255 == i_1491_) {
						while (i_1464_ <= i_1466_) {
							int i_1493_ = i >> 16;
							if (i_1464_ >= -456655989 * anInt9392 && i_1464_ < -383695469 * anInt9393 && i_1493_ >= 1605202751 * anInt9383 && i_1493_ < anInt9391 * 2014358275 && i_1471_ < i_1469_)
								anIntArray9386[i_1493_ + (-1173855569 * anInt9387 * i_1464_)] = i_1467_;
							i += i_1490_;
							i_1464_++;
							i_1471_ += i_1492_;
							i_1471_ %= i_1474_;
						}
					} else if (i_1468_ == 1) {
						i_1467_ = ((i_1491_ << 24) + (((i_1467_ & 0xff00ff) * i_1491_ >> 8 & 0xff00ff) + (i_1491_ * (i_1467_ & 0xff00) >> 8 & 0xff00)));
						int i_1494_ = 256 - i_1491_;
						while (i_1464_ <= i_1466_) {
							int i_1495_ = i >> 16;
							if (i_1464_ >= -456655989 * anInt9392 && i_1464_ < anInt9393 * -383695469 && i_1495_ >= 1605202751 * anInt9383 && i_1495_ < 2014358275 * anInt9391 && i_1471_ < i_1469_) {
								int i_1496_ = (i_1495_ + -1173855569 * anInt9387 * i_1464_);
								int i_1497_ = anIntArray9386[i_1496_];
								i_1497_ = (((i_1497_ & 0xff00) * i_1494_ >> 8 & 0xff00) + ((i_1497_ & 0xff00ff) * i_1494_ >> 8 & 0xff00ff));
								anIntArray9386[i_1495_ + (-1173855569 * anInt9387 * i_1464_)] = i_1497_ + i_1467_;
							}
							i += i_1490_;
							i_1464_++;
							i_1471_ += i_1492_;
							i_1471_ %= i_1474_;
						}
					} else if (2 == i_1468_) {
						while (i_1464_ <= i_1466_) {
							int i_1498_ = i >> 16;
							if (i_1464_ >= -456655989 * anInt9392 && i_1464_ < -383695469 * anInt9393 && i_1498_ >= 1605202751 * anInt9383 && i_1498_ < anInt9391 * 2014358275 && i_1471_ < i_1469_) {
								int i_1499_ = (anInt9387 * -1173855569 * i_1464_ + i_1498_);
								int i_1500_ = anIntArray9386[i_1499_];
								int i_1501_ = i_1500_ + i_1467_;
								int i_1502_ = ((i_1467_ & 0xff00ff) + (i_1500_ & 0xff00ff));
								i_1500_ = ((i_1501_ - i_1502_ & 0x10000) + (i_1502_ & 0x1000100));
								anIntArray9386[i_1499_] = i_1501_ - i_1500_ | i_1500_ - (i_1500_ >>> 8);
							}
							i += i_1490_;
							i_1464_++;
							i_1471_ += i_1492_;
							i_1471_ %= i_1474_;
						}
					} else
						throw new IllegalArgumentException();
				}
			}
		}
	}

	public void method3389(int i, int i_1503_, int i_1504_, int i_1505_) {
		/* empty */
	}

	void method3148(int i, int i_1506_, int i_1507_, int i_1508_, int i_1509_) {
		if (anIntArray9386 != null && (i >= anInt9383 * 1605202751 && i < 2014358275 * anInt9391)) {
			if (i_1506_ < -456655989 * anInt9392) {
				i_1507_ -= anInt9392 * -456655989 - i_1506_;
				i_1506_ = anInt9392 * -456655989;
			}
			if (i_1507_ + i_1506_ > anInt9393 * -383695469)
				i_1507_ = anInt9393 * -383695469 - i_1506_;
			int i_1510_ = i + anInt9387 * -1173855569 * i_1506_;
			int i_1511_ = i_1508_ >>> 24;
			if (i_1509_ == 0 || 1 == i_1509_ && i_1511_ == 255) {
				for (int i_1512_ = 0; i_1512_ < i_1507_; i_1512_++)
					anIntArray9386[i_1510_ + i_1512_ * (anInt9387 * -1173855569)] = i_1508_;
			} else if (1 == i_1509_) {
				i_1508_ = (((i_1508_ & 0xff00) * i_1511_ >> 8 & 0xff00) + ((i_1508_ & 0xff00ff) * i_1511_ >> 8 & 0xff00ff) + (i_1511_ << 24));
				int i_1513_ = 256 - i_1511_;
				for (int i_1514_ = 0; i_1514_ < i_1507_; i_1514_++) {
					int i_1515_ = i_1510_ + i_1514_ * (anInt9387 * -1173855569);
					int i_1516_ = anIntArray9386[i_1515_];
					i_1516_ = (((i_1516_ & 0xff00ff) * i_1513_ >> 8 & 0xff00ff) + ((i_1516_ & 0xff00) * i_1513_ >> 8 & 0xff00));
					anIntArray9386[i_1515_] = i_1508_ + i_1516_;
				}
			} else if (i_1509_ == 2) {
				for (int i_1517_ = 0; i_1517_ < i_1507_; i_1517_++) {
					int i_1518_ = -1173855569 * anInt9387 * i_1517_ + i_1510_;
					int i_1519_ = anIntArray9386[i_1518_];
					int i_1520_ = i_1508_ + i_1519_;
					int i_1521_ = (i_1508_ & 0xff00ff) + (i_1519_ & 0xff00ff);
					i_1519_ = (i_1521_ & 0x1000100) + (i_1520_ - i_1521_ & 0x10000);
					anIntArray9386[i_1518_] = i_1520_ - i_1519_ | i_1519_ - (i_1519_ >>> 8);
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public void method3297(int i, int i_1522_) {
		/* empty */
	}

	public boolean method3084() {
		return false;
	}

	public Interface23 method3111(int i, int i_1523_) {
		return new Class117(i, i_1523_);
	}

	public void method3426(float f, float f_1524_, float f_1525_, float[] fs) {
		float f_1526_ = (aClass427_9403.aFloatArray4807[7] * f_1524_ + (aClass427_9403.aFloatArray4807[3] * f + aClass427_9403.aFloatArray4807[15]) + f_1525_ * aClass427_9403.aFloatArray4807[11]);
		float f_1527_ = (f * aClass427_9403.aFloatArray4807[0] + aClass427_9403.aFloatArray4807[12] + f_1524_ * aClass427_9403.aFloatArray4807[4] + f_1525_ * aClass427_9403.aFloatArray4807[8]);
		float f_1528_ = (aClass427_9403.aFloatArray4807[1] * f + aClass427_9403.aFloatArray4807[13] + aClass427_9403.aFloatArray4807[5] * f_1524_ + f_1525_ * aClass427_9403.aFloatArray4807[9]);
		float f_1529_ = (f_1524_ * aClass427_9398.aFloatArray4807[6] + (aClass427_9398.aFloatArray4807[14] + f * aClass427_9398.aFloatArray4807[2]) + aClass427_9398.aFloatArray4807[10] * f_1525_);
		fs[0] = aFloat9410 + f_1527_ * aFloat9419 / f_1526_;
		fs[1] = aFloat9395 * f_1528_ / f_1526_ + aFloat9412;
		fs[2] = f_1529_;
	}

	public boolean method3239() {
		return false;
	}

	public void method3351(float f, float f_1530_, float f_1531_, float f_1532_, float f_1533_) {
		/* empty */
	}

	public void method3398(float f, float f_1534_, float f_1535_, float f_1536_, float f_1537_) {
		/* empty */
	}

	public void method3405(float f, float f_1538_, float f_1539_, float f_1540_, float f_1541_) {
		/* empty */
	}

	public boolean method3406() {
		return false;
	}

	public void method3407(Class172 class172, float f, Class172 class172_1542_, float f_1543_, Class172 class172_1544_, float f_1545_) {
		/* empty */
	}

	public void method3219() {
		aClass171_Sub2_9422 = null;
		aClass147_9421 = null;
	}

	public void method3080() {
		/* empty */
	}

	public void method3404() {
		/* empty */
	}

	public boolean method3411() {
		return false;
	}

	public boolean method3412() {
		return false;
	}

	public void method3429(int i, int i_1546_) {
		if (0 != (i & 0x1))
			method3348(0, 0, -1173855569 * anInt9387, -77167397 * anInt9388, i_1546_, 0);
		if ((i & 0x2) != 0)
			method14829();
	}

	void method3414(float f, float f_1547_, float f_1548_, float f_1549_, float f_1550_, float f_1551_) {
		/* empty */
	}

	public void method3438(Class432 class432) {
		aClass432_9420 = class432;
		method14839();
	}

	public Class142 method3336(int i, int i_1552_, int[] is, int[] is_1553_) {
		return new Class142_Sub1(i, i_1552_, is, is_1553_);
	}

	public void method3417(int i, Class178 class178) {
		for (int i_1554_ = 0; i_1554_ < aClass101Array9416.length; i_1554_++) {
			aClass101Array9416[i_1554_].anInt1195 = aClass101Array9416[i_1554_].anInt1194 * 523461273;
			aClass101Array9416[i_1554_].anInt1205 = -1687140521 * i;
			aClass101Array9416[i_1554_].anInt1194 = 1892560347 * class178.anInt2055;
			aClass101Array9416[i_1554_].anInt1198 = class178.anInt2050 * -1455708645;
			aClass101Array9416[i_1554_].aBool1196 = true;
		}
	}

	public void method3418(int i, Class178 class178) {
		for (int i_1555_ = 0; i_1555_ < aClass101Array9416.length; i_1555_++) {
			aClass101Array9416[i_1555_].anInt1195 = aClass101Array9416[i_1555_].anInt1194 * 523461273;
			aClass101Array9416[i_1555_].anInt1205 = -1687140521 * i;
			aClass101Array9416[i_1555_].anInt1194 = 1892560347 * class178.anInt2055;
			aClass101Array9416[i_1555_].anInt1198 = class178.anInt2050 * -1455708645;
			aClass101Array9416[i_1555_].aBool1196 = true;
		}
	}

	public void method3309(int i, Class178 class178) {
		Class101 class101 = method14835(Thread.currentThread());
		class101.anInt1205 = -1687140521 * i;
		class101.anInt1194 = 1892560347 * class178.anInt2055;
		class101.anInt1198 = -1455708645 * class178.anInt2050;
	}

	void method3206(float f, float f_1556_, float f_1557_, float f_1558_, float f_1559_, float f_1560_) {
		/* empty */
	}

	public void method3421() {
		for (int i = 0; i < aClass101Array9416.length; i++) {
			aClass101Array9416[i].anInt1194 = aClass101Array9416[i].anInt1195 * -228732503;
			aClass101Array9416[i].aBool1196 = false;
		}
	}

	public void method3422() {
		for (int i = 0; i < aClass101Array9416.length; i++) {
			aClass101Array9416[i].anInt1194 = aClass101Array9416[i].anInt1195 * -228732503;
			aClass101Array9416[i].aBool1196 = false;
		}
	}

	public void method3299(int i, int i_1561_, float f, int i_1562_, int i_1563_, float f_1564_, int i_1565_, int i_1566_, float f_1567_, int i_1568_, int i_1569_, int i_1570_, int i_1571_) {
		boolean bool = null != anIntArray9386;
		boolean bool_1572_ = aFloatArray9389 != null;
		if (bool || bool_1572_) {
			Class101 class101 = method14835(Thread.currentThread());
			Class119 class119 = class101.aClass119_1197;
			class119.aBool1467 = false;
			i -= anInt9383 * 1605202751;
			i_1562_ -= 1605202751 * anInt9383;
			i_1565_ -= 1605202751 * anInt9383;
			i_1561_ -= anInt9392 * -456655989;
			i_1563_ -= anInt9392 * -456655989;
			i_1566_ -= anInt9392 * -456655989;
			class119.aBool1445 = (i < 0 || i > class119.anInt1442 || i_1562_ < 0 || i_1562_ > class119.anInt1442 || i_1565_ < 0 || i_1565_ > class119.anInt1442);
			int i_1573_ = i_1568_ >>> 24;
			if (0 == i_1571_ || i_1571_ == 1 && 255 == i_1573_) {
				class119.anInt1441 = 0;
				class119.aBool1443 = false;
				class119.method2106(bool, bool_1572_, false, (float) i_1561_, (float) i_1563_, (float) i_1566_, (float) i, (float) i_1562_, (float) i_1565_, f, f_1564_, f_1567_, i_1568_, i_1569_, i_1570_);
			} else if (1 == i_1571_) {
				class119.anInt1441 = 255 - i_1573_;
				class119.aBool1443 = false;
				class119.method2106(bool, bool_1572_, false, (float) i_1561_, (float) i_1563_, (float) i_1566_, (float) i, (float) i_1562_, (float) i_1565_, f, f_1564_, f_1567_, i_1568_, i_1569_, i_1570_);
			} else if (i_1571_ == 2) {
				class119.anInt1441 = 128;
				class119.aBool1443 = true;
				class119.method2106(bool, bool_1572_, false, (float) i_1561_, (float) i_1563_, (float) i_1566_, (float) i, (float) i_1562_, (float) i_1565_, f, f_1564_, f_1567_, i_1568_, i_1569_, i_1570_);
			} else
				throw new IllegalArgumentException();
			class119.aBool1467 = true;
		}
	}

	public void method3424(int i, int i_1574_, float f, int i_1575_, int i_1576_, float f_1577_, int i_1578_, int i_1579_, float f_1580_, int i_1581_, int i_1582_, int i_1583_, int i_1584_) {
		boolean bool = null != anIntArray9386;
		boolean bool_1585_ = aFloatArray9389 != null;
		if (bool || bool_1585_) {
			Class101 class101 = method14835(Thread.currentThread());
			Class119 class119 = class101.aClass119_1197;
			class119.aBool1467 = false;
			i -= anInt9383 * 1605202751;
			i_1575_ -= 1605202751 * anInt9383;
			i_1578_ -= 1605202751 * anInt9383;
			i_1574_ -= anInt9392 * -456655989;
			i_1576_ -= anInt9392 * -456655989;
			i_1579_ -= anInt9392 * -456655989;
			class119.aBool1445 = (i < 0 || i > class119.anInt1442 || i_1575_ < 0 || i_1575_ > class119.anInt1442 || i_1578_ < 0 || i_1578_ > class119.anInt1442);
			int i_1586_ = i_1581_ >>> 24;
			if (0 == i_1584_ || i_1584_ == 1 && 255 == i_1586_) {
				class119.anInt1441 = 0;
				class119.aBool1443 = false;
				class119.method2106(bool, bool_1585_, false, (float) i_1574_, (float) i_1576_, (float) i_1579_, (float) i, (float) i_1575_, (float) i_1578_, f, f_1577_, f_1580_, i_1581_, i_1582_, i_1583_);
			} else if (1 == i_1584_) {
				class119.anInt1441 = 255 - i_1586_;
				class119.aBool1443 = false;
				class119.method2106(bool, bool_1585_, false, (float) i_1574_, (float) i_1576_, (float) i_1579_, (float) i, (float) i_1575_, (float) i_1578_, f, f_1577_, f_1580_, i_1581_, i_1582_, i_1583_);
			} else if (i_1584_ == 2) {
				class119.anInt1441 = 128;
				class119.aBool1443 = true;
				class119.method2106(bool, bool_1585_, false, (float) i_1574_, (float) i_1576_, (float) i_1579_, (float) i, (float) i_1575_, (float) i_1578_, f, f_1577_, f_1580_, i_1581_, i_1582_, i_1583_);
			} else
				throw new IllegalArgumentException();
			class119.aBool1467 = true;
		}
	}

	public void method3246(long l) {
		/* empty */
	}

	public void method3097(int i, int i_1587_) {
		/* empty */
	}

	public void method3427(float f, float f_1588_, float f_1589_, float[] fs) {
		float f_1590_ = (aClass427_9403.aFloatArray4807[7] * f_1588_ + (aClass427_9403.aFloatArray4807[3] * f + aClass427_9403.aFloatArray4807[15]) + f_1589_ * aClass427_9403.aFloatArray4807[11]);
		float f_1591_ = (f * aClass427_9403.aFloatArray4807[0] + aClass427_9403.aFloatArray4807[12] + f_1588_ * aClass427_9403.aFloatArray4807[4] + f_1589_ * aClass427_9403.aFloatArray4807[8]);
		float f_1592_ = (aClass427_9403.aFloatArray4807[1] * f + aClass427_9403.aFloatArray4807[13] + aClass427_9403.aFloatArray4807[5] * f_1588_ + f_1589_ * aClass427_9403.aFloatArray4807[9]);
		float f_1593_ = (f_1588_ * aClass427_9398.aFloatArray4807[6] + (aClass427_9398.aFloatArray4807[14] + f * aClass427_9398.aFloatArray4807[2]) + aClass427_9398.aFloatArray4807[10] * f_1589_);
		fs[0] = aFloat9410 + f_1591_ * aFloat9419 / f_1590_;
		fs[1] = aFloat9395 * f_1592_ / f_1590_ + aFloat9412;
		fs[2] = f_1593_;
	}

	public void method3428(float f, float f_1594_, float f_1595_, float[] fs) {
		float f_1596_ = (aClass427_9403.aFloatArray4807[14] + f * aClass427_9403.aFloatArray4807[2] + aClass427_9403.aFloatArray4807[6] * f_1594_ + aClass427_9403.aFloatArray4807[10] * f_1595_);
		float f_1597_ = (aClass427_9403.aFloatArray4807[7] * f_1594_ + (aClass427_9403.aFloatArray4807[15] + aClass427_9403.aFloatArray4807[3] * f) + f_1595_ * aClass427_9403.aFloatArray4807[11]);
		if (f_1596_ < -f_1597_ || f_1596_ > f_1597_) {
			float[] fs_1598_ = fs;
			float[] fs_1599_ = fs;
			fs[2] = Float.NaN;
			fs_1599_[1] = Float.NaN;
			fs_1598_[0] = Float.NaN;
		} else {
			float f_1600_ = (f_1595_ * aClass427_9403.aFloatArray4807[8] + (f_1594_ * aClass427_9403.aFloatArray4807[4] + (aClass427_9403.aFloatArray4807[12] + f * aClass427_9403.aFloatArray4807[0])));
			if (f_1600_ < -f_1597_ || f_1600_ > f_1597_) {
				float[] fs_1601_ = fs;
				float[] fs_1602_ = fs;
				fs[2] = Float.NaN;
				fs_1602_[1] = Float.NaN;
				fs_1601_[0] = Float.NaN;
			} else {
				float f_1603_ = (aClass427_9403.aFloatArray4807[5] * f_1594_ + (aClass427_9403.aFloatArray4807[13] + f * aClass427_9403.aFloatArray4807[1]) + f_1595_ * aClass427_9403.aFloatArray4807[9]);
				if (f_1603_ < -f_1597_ || f_1603_ > f_1597_) {
					float[] fs_1604_ = fs;
					float[] fs_1605_ = fs;
					fs[2] = Float.NaN;
					fs_1605_[1] = Float.NaN;
					fs_1604_[0] = Float.NaN;
				} else {
					float f_1606_ = (f_1594_ * aClass427_9398.aFloatArray4807[6] + (aClass427_9398.aFloatArray4807[2] * f + aClass427_9398.aFloatArray4807[14]) + aClass427_9398.aFloatArray4807[10] * f_1595_);
					fs[0] = f_1600_ * aFloat9419 / f_1597_ + aFloat9410;
					fs[1] = aFloat9412 + f_1603_ * aFloat9395 / f_1597_;
					fs[2] = f_1606_;
				}
			}
		}
	}

	public Class171_Sub2 method3464() {
		return new Class171_Sub2_Sub3(this);
	}

	Interface21 method14877(int i, int i_1607_) {
		return new Class98(i, i_1607_);
	}

	Interface21 method14878(int i, int i_1608_) {
		return new Class98(i, i_1608_);
	}

	public Interface21 method3430(int i, int i_1609_, Class157 class157, Class184 class184, int i_1610_) {
		return method14843(i, i_1609_);
	}

	public boolean method3295() {
		return false;
	}

	public void method3380(Class182 class182) {
		method14836(null != anIntArray9386, aFloatArray9389 != null, false, class182);
	}

	public Interface23 method3522(int i, int i_1611_) {
		return new Class117(i, i_1611_);
	}

	public void method3496(int i, int i_1612_, int i_1613_, int i_1614_, int i_1615_, int i_1616_) {
		if (null != anIntArray9386) {
			if (i < anInt9383 * 1605202751) {
				i_1613_ -= anInt9383 * 1605202751 - i;
				i = anInt9383 * 1605202751;
			}
			if (i_1612_ < anInt9392 * -456655989) {
				i_1614_ -= anInt9392 * -456655989 - i_1612_;
				i_1612_ = -456655989 * anInt9392;
			}
			if (i + i_1613_ > anInt9391 * 2014358275)
				i_1613_ = anInt9391 * 2014358275 - i;
			if (i_1612_ + i_1614_ > anInt9393 * -383695469)
				i_1614_ = -383695469 * anInt9393 - i_1612_;
			if (i_1613_ > 0 && i_1614_ > 0 && i <= 2014358275 * anInt9391 && i_1612_ <= -383695469 * anInt9393) {
				int i_1617_ = -1173855569 * anInt9387 - i_1613_;
				int i_1618_ = i + i_1612_ * (anInt9387 * -1173855569);
				int i_1619_ = i_1615_ >>> 24;
				if (i_1616_ == 0 || i_1616_ == 1 && i_1619_ == 255) {
					int i_1620_ = i_1613_ >> 3;
					int i_1621_ = i_1613_ & 0x7;
					i_1613_ = i_1618_ - 1;
					for (int i_1622_ = -i_1614_; i_1622_ < 0; i_1622_++) {
						if (i_1620_ > 0) {
							i = i_1620_;
							do {
								anIntArray9386[++i_1613_] = i_1615_;
								anIntArray9386[++i_1613_] = i_1615_;
								anIntArray9386[++i_1613_] = i_1615_;
								anIntArray9386[++i_1613_] = i_1615_;
								anIntArray9386[++i_1613_] = i_1615_;
								anIntArray9386[++i_1613_] = i_1615_;
								anIntArray9386[++i_1613_] = i_1615_;
								anIntArray9386[++i_1613_] = i_1615_;
							} while (--i > 0);
						}
						if (i_1621_ > 0) {
							i = i_1621_;
							do
								anIntArray9386[++i_1613_] = i_1615_;
							while (--i > 0);
						}
						i_1613_ += i_1617_;
					}
				} else if (1 == i_1616_) {
					i_1615_ = ((i_1619_ * (i_1615_ & 0xff00ff) >> 8 & 0xff00ff) + (((i_1615_ & ~0xff00ff) >>> 8) * i_1619_ & ~0xff00ff));
					int i_1623_ = 256 - i_1619_;
					for (int i_1624_ = 0; i_1624_ < i_1614_; i_1624_++) {
						for (int i_1625_ = -i_1613_; i_1625_ < 0; i_1625_++) {
							int i_1626_ = anIntArray9386[i_1618_];
							i_1626_ = ((i_1623_ * (i_1626_ & 0xff00ff) >> 8 & 0xff00ff) + (((i_1626_ & ~0xff00ff) >>> 8) * i_1623_ & ~0xff00ff));
							anIntArray9386[i_1618_++] = i_1615_ + i_1626_;
						}
						i_1618_ += i_1617_;
					}
				} else if (2 == i_1616_) {
					for (int i_1627_ = 0; i_1627_ < i_1614_; i_1627_++) {
						for (int i_1628_ = -i_1613_; i_1628_ < 0; i_1628_++) {
							int i_1629_ = anIntArray9386[i_1618_];
							int i_1630_ = i_1615_ + i_1629_;
							int i_1631_ = (i_1615_ & 0xff00ff) + (i_1629_ & 0xff00ff);
							i_1629_ = ((i_1630_ - i_1631_ & 0x10000) + (i_1631_ & 0x1000100));
							anIntArray9386[i_1618_++] = i_1630_ - i_1629_ | i_1629_ - (i_1629_ >>> 8);
						}
						i_1618_ += i_1617_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public Interface23 method3435(int i, int i_1632_, int i_1633_) {
		return new Class117(i, i_1632_);
	}

	void method14879(int i) {
		aClass101Array9416[i].method1778(Thread.currentThread(), 700502355);
	}

	public boolean method3442() {
		return false;
	}

	public void method3363(int i, Class527_Sub16[] class527_sub16s) {
		/* empty */
	}

	public boolean method3204() {
		return false;
	}

	public void method3294() {
		anInt9383 = 0;
		anInt9392 = 0;
		anInt9391 = -370531355 * anInt9387;
		anInt9393 = -136163175 * anInt9388;
		method14828();
	}

	void method3446(int i, int i_1634_, int i_1635_, int i_1636_, int i_1637_) {
		if (anIntArray9386 != null) {
			if (i_1635_ < 0)
				i_1635_ = -i_1635_;
			int i_1638_ = i_1634_ - i_1635_;
			if (i_1638_ < -456655989 * anInt9392)
				i_1638_ = anInt9392 * -456655989;
			int i_1639_ = 1 + (i_1635_ + i_1634_);
			if (i_1639_ > anInt9393 * -383695469)
				i_1639_ = anInt9393 * -383695469;
			int i_1640_ = i_1638_;
			int i_1641_ = i_1635_ * i_1635_;
			int i_1642_ = 0;
			int i_1643_ = i_1634_ - i_1640_;
			int i_1644_ = i_1643_ * i_1643_;
			int i_1645_ = i_1644_ - i_1643_;
			if (i_1634_ > i_1639_)
				i_1634_ = i_1639_;
			int i_1646_ = i_1636_ >>> 24;
			if (i_1637_ == 0 || i_1637_ == 1 && i_1646_ == 255) {
				while (i_1640_ < i_1634_) {
					for (/**/; i_1645_ <= i_1641_ || i_1644_ <= i_1641_; i_1645_ += i_1642_++ + i_1642_)
						i_1644_ += i_1642_ + i_1642_;
					int i_1647_ = i - i_1642_ + 1;
					if (i_1647_ < anInt9383 * 1605202751)
						i_1647_ = anInt9383 * 1605202751;
					int i_1648_ = i + i_1642_;
					if (i_1648_ > 2014358275 * anInt9391)
						i_1648_ = 2014358275 * anInt9391;
					int i_1649_ = i_1647_ + i_1640_ * (anInt9387 * -1173855569);
					for (int i_1650_ = i_1647_; i_1650_ < i_1648_; i_1650_++)
						anIntArray9386[i_1649_++] = i_1636_;
					i_1640_++;
					i_1644_ -= i_1643_-- + i_1643_;
					i_1645_ -= i_1643_ + i_1643_;
				}
				i_1642_ = i_1635_;
				i_1643_ = i_1640_ - i_1634_;
				i_1645_ = i_1641_ + i_1643_ * i_1643_;
				i_1644_ = i_1645_ - i_1642_;
				i_1645_ -= i_1643_;
				while (i_1640_ < i_1639_) {
					for (/**/; i_1645_ > i_1641_ && i_1644_ > i_1641_; i_1644_ -= i_1642_ + i_1642_)
						i_1645_ -= i_1642_-- + i_1642_;
					int i_1651_ = i - i_1642_;
					if (i_1651_ < 1605202751 * anInt9383)
						i_1651_ = 1605202751 * anInt9383;
					int i_1652_ = i_1642_ + i;
					if (i_1652_ > 2014358275 * anInt9391 - 1)
						i_1652_ = 2014358275 * anInt9391 - 1;
					int i_1653_ = i_1640_ * (-1173855569 * anInt9387) + i_1651_;
					for (int i_1654_ = i_1651_; i_1654_ <= i_1652_; i_1654_++)
						anIntArray9386[i_1653_++] = i_1636_;
					i_1640_++;
					i_1645_ += i_1643_ + i_1643_;
					i_1644_ += i_1643_++ + i_1643_;
				}
			} else if (1 == i_1637_) {
				i_1636_ = ((i_1646_ << 24) + ((i_1646_ * (i_1636_ & 0xff00ff) >> 8 & 0xff00ff) + (i_1646_ * (i_1636_ & 0xff00) >> 8 & 0xff00)));
				int i_1655_ = 256 - i_1646_;
				while (i_1640_ < i_1634_) {
					for (/**/; i_1645_ <= i_1641_ || i_1644_ <= i_1641_; i_1645_ += i_1642_++ + i_1642_)
						i_1644_ += i_1642_ + i_1642_;
					int i_1656_ = 1 + (i - i_1642_);
					if (i_1656_ < 1605202751 * anInt9383)
						i_1656_ = anInt9383 * 1605202751;
					int i_1657_ = i_1642_ + i;
					if (i_1657_ > 2014358275 * anInt9391)
						i_1657_ = anInt9391 * 2014358275;
					int i_1658_ = i_1656_ + -1173855569 * anInt9387 * i_1640_;
					for (int i_1659_ = i_1656_; i_1659_ < i_1657_; i_1659_++) {
						int i_1660_ = anIntArray9386[i_1658_];
						i_1660_ = ((i_1655_ * (i_1660_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_1660_ & 0xff00) * i_1655_ >> 8 & 0xff00));
						anIntArray9386[i_1658_++] = i_1660_ + i_1636_;
					}
					i_1640_++;
					i_1644_ -= i_1643_-- + i_1643_;
					i_1645_ -= i_1643_ + i_1643_;
				}
				i_1642_ = i_1635_;
				i_1643_ = -i_1643_;
				i_1645_ = i_1641_ + i_1643_ * i_1643_;
				i_1644_ = i_1645_ - i_1642_;
				i_1645_ -= i_1643_;
				while (i_1640_ < i_1639_) {
					for (/**/; i_1645_ > i_1641_ && i_1644_ > i_1641_; i_1644_ -= i_1642_ + i_1642_)
						i_1645_ -= i_1642_-- + i_1642_;
					int i_1661_ = i - i_1642_;
					if (i_1661_ < anInt9383 * 1605202751)
						i_1661_ = anInt9383 * 1605202751;
					int i_1662_ = i_1642_ + i;
					if (i_1662_ > 2014358275 * anInt9391 - 1)
						i_1662_ = anInt9391 * 2014358275 - 1;
					int i_1663_ = i_1640_ * (anInt9387 * -1173855569) + i_1661_;
					for (int i_1664_ = i_1661_; i_1664_ <= i_1662_; i_1664_++) {
						int i_1665_ = anIntArray9386[i_1663_];
						i_1665_ = ((i_1655_ * (i_1665_ & 0xff00) >> 8 & 0xff00) + ((i_1665_ & 0xff00ff) * i_1655_ >> 8 & 0xff00ff));
						anIntArray9386[i_1663_++] = i_1665_ + i_1636_;
					}
					i_1640_++;
					i_1645_ += i_1643_ + i_1643_;
					i_1644_ += i_1643_++ + i_1643_;
				}
			} else if (i_1637_ == 2) {
				while (i_1640_ < i_1634_) {
					for (/**/; i_1645_ <= i_1641_ || i_1644_ <= i_1641_; i_1645_ += i_1642_++ + i_1642_)
						i_1644_ += i_1642_ + i_1642_;
					int i_1666_ = 1 + (i - i_1642_);
					if (i_1666_ < 1605202751 * anInt9383)
						i_1666_ = anInt9383 * 1605202751;
					int i_1667_ = i_1642_ + i;
					if (i_1667_ > 2014358275 * anInt9391)
						i_1667_ = 2014358275 * anInt9391;
					int i_1668_ = i_1640_ * (-1173855569 * anInt9387) + i_1666_;
					for (int i_1669_ = i_1666_; i_1669_ < i_1667_; i_1669_++) {
						int i_1670_ = anIntArray9386[i_1668_];
						int i_1671_ = i_1670_ + i_1636_;
						int i_1672_ = (i_1670_ & 0xff00ff) + (i_1636_ & 0xff00ff);
						i_1670_ = (i_1672_ & 0x1000100) + (i_1671_ - i_1672_ & 0x10000);
						anIntArray9386[i_1668_++] = i_1671_ - i_1670_ | i_1670_ - (i_1670_ >>> 8);
					}
					i_1640_++;
					i_1644_ -= i_1643_-- + i_1643_;
					i_1645_ -= i_1643_ + i_1643_;
				}
				i_1642_ = i_1635_;
				i_1643_ = -i_1643_;
				i_1645_ = i_1643_ * i_1643_ + i_1641_;
				i_1644_ = i_1645_ - i_1642_;
				i_1645_ -= i_1643_;
				while (i_1640_ < i_1639_) {
					for (/**/; i_1645_ > i_1641_ && i_1644_ > i_1641_; i_1644_ -= i_1642_ + i_1642_)
						i_1645_ -= i_1642_-- + i_1642_;
					int i_1673_ = i - i_1642_;
					if (i_1673_ < 1605202751 * anInt9383)
						i_1673_ = anInt9383 * 1605202751;
					int i_1674_ = i_1642_ + i;
					if (i_1674_ > anInt9391 * 2014358275 - 1)
						i_1674_ = anInt9391 * 2014358275 - 1;
					int i_1675_ = i_1640_ * (anInt9387 * -1173855569) + i_1673_;
					for (int i_1676_ = i_1673_; i_1676_ <= i_1674_; i_1676_++) {
						int i_1677_ = anIntArray9386[i_1675_];
						int i_1678_ = i_1677_ + i_1636_;
						int i_1679_ = (i_1636_ & 0xff00ff) + (i_1677_ & 0xff00ff);
						i_1677_ = (i_1678_ - i_1679_ & 0x10000) + (i_1679_ & 0x1000100);
						anIntArray9386[i_1675_++] = i_1678_ - i_1677_ | i_1677_ - (i_1677_ >>> 8);
					}
					i_1640_++;
					i_1645_ += i_1643_ + i_1643_;
					i_1644_ += i_1643_++ + i_1643_;
				}
			} else
				throw new IllegalArgumentException();
		}
	}

	public void method3083(int i, int i_1680_, int i_1681_, int i_1682_, int i_1683_, int i_1684_, Class142 class142, int i_1685_, int i_1686_, int i_1687_, int i_1688_, int i_1689_) {
		if (anIntArray9386 != null) {
			Class142_Sub1 class142_sub1 = (Class142_Sub1) class142;
			int[] is = class142_sub1.anIntArray9002;
			int[] is_1690_ = class142_sub1.anIntArray9003;
			int i_1691_ = (anInt9392 * -456655989 > i_1686_ ? anInt9392 * -456655989 : i_1686_);
			int i_1692_ = (anInt9393 * -383695469 < i_1686_ + is.length ? -383695469 * anInt9393 : i_1686_ + is.length);
			i_1689_ <<= 8;
			i_1687_ <<= 8;
			i_1688_ <<= 8;
			int i_1693_ = i_1688_ + i_1687_;
			i_1689_ %= i_1693_;
			i_1681_ -= i;
			i_1682_ -= i_1680_;
			if (i_1681_ + i_1682_ < 0) {
				int i_1694_ = (int) (Math.sqrt((double) (i_1682_ * i_1682_ + i_1681_ * i_1681_)) * 256.0);
				int i_1695_ = i_1694_ % i_1693_;
				i_1689_ = i_1687_ + i_1693_ - i_1689_ - i_1695_;
				i_1689_ %= i_1693_;
				if (i_1689_ < 0)
					i_1689_ += i_1693_;
				i += i_1681_;
				i_1681_ = -i_1681_;
				i_1680_ += i_1682_;
				i_1682_ = -i_1682_;
			}
			if (i_1681_ > i_1682_) {
				i_1680_ <<= 16;
				i_1680_ += 32768;
				i_1682_ <<= 16;
				int i_1696_ = (int) Math.floor((double) i_1682_ / (double) i_1681_ + 0.5);
				i_1681_ += i;
				int i_1697_ = i_1683_ >>> 24;
				int i_1698_ = (int) Math.sqrt((double) ((i_1696_ >> 8) * (i_1696_ >> 8) + 65536));
				if (0 == i_1684_ || 1 == i_1684_ && i_1697_ == 255) {
					while (i <= i_1681_) {
						int i_1699_ = i_1680_ >> 16;
						int i_1700_ = i_1699_ - i_1686_;
						if (i >= anInt9383 * 1605202751 && i < 2014358275 * anInt9391 && i_1699_ >= i_1691_ && i_1699_ < i_1692_ && i_1689_ < i_1687_) {
							int i_1701_ = i_1685_ + is[i_1700_];
							if (i >= i_1701_ && i < i_1701_ + is_1690_[i_1700_])
								anIntArray9386[anInt9387 * -1173855569 * i_1699_ + i] = i_1683_;
						}
						i_1680_ += i_1696_;
						i++;
						i_1689_ += i_1698_;
						i_1689_ %= i_1693_;
					}
				} else if (i_1684_ == 1) {
					i_1683_ = (((i_1683_ & 0xff00ff) * i_1697_ >> 8 & 0xff00ff) + (i_1697_ * (i_1683_ & 0xff00) >> 8 & 0xff00) + (i_1697_ << 24));
					int i_1702_ = 256 - i_1697_;
					while (i <= i_1681_) {
						int i_1703_ = i_1680_ >> 16;
						int i_1704_ = i_1703_ - i_1686_;
						if (i >= anInt9383 * 1605202751 && i < anInt9391 * 2014358275 && i_1703_ >= i_1691_ && i_1703_ < i_1692_ && i_1689_ < i_1687_) {
							int i_1705_ = i_1685_ + is[i_1704_];
							if (i >= i_1705_ && i < is_1690_[i_1704_] + i_1705_) {
								int i_1706_ = i + anInt9387 * -1173855569 * i_1703_;
								int i_1707_ = anIntArray9386[i_1706_];
								i_1707_ = (((i_1707_ & 0xff00) * i_1702_ >> 8 & 0xff00) + ((i_1707_ & 0xff00ff) * i_1702_ >> 8 & 0xff00ff));
								anIntArray9386[i_1706_] = i_1683_ + i_1707_;
							}
						}
						i_1680_ += i_1696_;
						i++;
						i_1689_ += i_1698_;
						i_1689_ %= i_1693_;
					}
				} else if (2 == i_1684_) {
					while (i <= i_1681_) {
						int i_1708_ = i_1680_ >> 16;
						int i_1709_ = i_1708_ - i_1686_;
						if (i >= anInt9383 * 1605202751 && i < 2014358275 * anInt9391 && i_1708_ >= i_1691_ && i_1708_ < i_1692_ && i_1689_ < i_1687_) {
							int i_1710_ = i_1685_ + is[i_1709_];
							if (i >= i_1710_ && i < is_1690_[i_1709_] + i_1710_) {
								int i_1711_ = i + i_1708_ * (-1173855569 * anInt9387);
								int i_1712_ = anIntArray9386[i_1711_];
								int i_1713_ = i_1683_ + i_1712_;
								int i_1714_ = ((i_1712_ & 0xff00ff) + (i_1683_ & 0xff00ff));
								i_1712_ = ((i_1713_ - i_1714_ & 0x10000) + (i_1714_ & 0x1000100));
								anIntArray9386[i_1711_] = i_1713_ - i_1712_ | i_1712_ - (i_1712_ >>> 8);
							}
						}
						i_1680_ += i_1696_;
						i++;
						i_1689_ += i_1698_;
						i_1689_ %= i_1693_;
					}
				} else
					throw new IllegalArgumentException();
			} else {
				i <<= 16;
				i += 32768;
				i_1681_ <<= 16;
				int i_1715_ = (int) Math.floor(0.5 + ((double) i_1681_ / (double) i_1682_));
				int i_1716_ = (int) Math.sqrt((double) (65536 + (i_1715_ >> 8) * (i_1715_ >> 8)));
				i_1682_ += i_1680_;
				int i_1717_ = i_1683_ >>> 24;
				if (0 == i_1684_ || 1 == i_1684_ && i_1717_ == 255) {
					while (i_1680_ <= i_1682_) {
						int i_1718_ = i >> 16;
						int i_1719_ = i_1680_ - i_1686_;
						if (i_1680_ >= i_1691_ && i_1680_ < i_1692_ && i_1718_ >= 1605202751 * anInt9383 && i_1718_ < anInt9391 * 2014358275 && i_1689_ < i_1687_ && i_1718_ >= is[i_1719_] + i_1685_ && i_1718_ < is_1690_[i_1719_] + (i_1685_ + is[i_1719_]))
							anIntArray9386[i_1718_ + i_1680_ * (-1173855569 * anInt9387)] = i_1683_;
						i += i_1715_;
						i_1680_++;
						i_1689_ += i_1716_;
						i_1689_ %= i_1693_;
					}
				} else if (i_1684_ == 1) {
					i_1683_ = ((i_1717_ << 24) + ((i_1717_ * (i_1683_ & 0xff00ff) >> 8 & 0xff00ff) + (i_1717_ * (i_1683_ & 0xff00) >> 8 & 0xff00)));
					int i_1720_ = 256 - i_1717_;
					while (i_1680_ <= i_1682_) {
						int i_1721_ = i >> 16;
						int i_1722_ = i_1680_ - i_1686_;
						if (i_1680_ >= i_1691_ && i_1680_ < i_1692_ && i_1721_ >= 1605202751 * anInt9383 && i_1721_ < anInt9391 * 2014358275 && i_1689_ < i_1687_ && i_1721_ >= is[i_1722_] + i_1685_ && i_1721_ < is_1690_[i_1722_] + (is[i_1722_] + i_1685_)) {
							int i_1723_ = i_1721_ + anInt9387 * -1173855569 * i_1680_;
							int i_1724_ = anIntArray9386[i_1723_];
							i_1724_ = (((i_1724_ & 0xff00ff) * i_1720_ >> 8 & 0xff00ff) + (i_1720_ * (i_1724_ & 0xff00) >> 8 & 0xff00));
							anIntArray9386[i_1721_ + i_1680_ * (anInt9387 * -1173855569)] = i_1724_ + i_1683_;
						}
						i += i_1715_;
						i_1680_++;
						i_1689_ += i_1716_;
						i_1689_ %= i_1693_;
					}
				} else if (2 == i_1684_) {
					while (i_1680_ <= i_1682_) {
						int i_1725_ = i >> 16;
						int i_1726_ = i_1680_ - i_1686_;
						if (i_1680_ >= i_1691_ && i_1680_ < i_1692_ && i_1725_ >= 1605202751 * anInt9383 && i_1725_ < 2014358275 * anInt9391 && i_1689_ < i_1687_ && i_1725_ >= is[i_1726_] + i_1685_ && i_1725_ < is_1690_[i_1726_] + (i_1685_ + is[i_1726_])) {
							int i_1727_ = (i_1680_ * (-1173855569 * anInt9387) + i_1725_);
							int i_1728_ = anIntArray9386[i_1727_];
							int i_1729_ = i_1728_ + i_1683_;
							int i_1730_ = (i_1683_ & 0xff00ff) + (i_1728_ & 0xff00ff);
							i_1728_ = ((i_1729_ - i_1730_ & 0x10000) + (i_1730_ & 0x1000100));
							anIntArray9386[i_1727_] = i_1729_ - i_1728_ | i_1728_ - (i_1728_ >>> 8);
						}
						i += i_1715_;
						i_1680_++;
						i_1689_ += i_1716_;
						i_1689_ %= i_1693_;
					}
				} else
					throw new IllegalArgumentException();
			}
		}
	}

	public void method3448() {
		anInt9407 = 0;
		anInt9406 = 0;
		anInt9390 = anInt9387 * 896585021;
		anInt9385 = anInt9388 * 896145763;
		method14828();
	}

	public void method3449() {
		anInt9407 = 0;
		anInt9406 = 0;
		anInt9390 = anInt9387 * 896585021;
		anInt9385 = anInt9388 * 896145763;
		method14828();
	}

	public void method3308() {
		anInt9407 = 0;
		anInt9406 = 0;
		anInt9390 = anInt9387 * 896585021;
		anInt9385 = anInt9388 * 896145763;
		method14828();
	}

	public boolean method3436() {
		return true;
	}

	public boolean method3517() {
		return true;
	}

	public int method3176(int i, int i_1731_) {
		return i | i_1731_;
	}

	public boolean method3093() {
		return false;
	}

	void method14880(int i) {
		anInt9415 = 1323382773 * i;
		aClass101Array9416 = new Class101[anInt9415 * 1413774429];
		for (int i_1732_ = 0; i_1732_ < anInt9415 * 1413774429; i_1732_++)
			aClass101Array9416[i_1732_] = new Class101(this);
	}

	public void method3439(int[] is) {
		is[0] = anInt9383 * 1605202751;
		is[1] = -456655989 * anInt9392;
		is[2] = anInt9391 * 2014358275;
		is[3] = -383695469 * anInt9393;
	}

	public void method3497(int[] is) {
		is[0] = anInt9383 * 1605202751;
		is[1] = -456655989 * anInt9392;
		is[2] = anInt9391 * 2014358275;
		is[3] = -383695469 * anInt9393;
	}

	public Class172 method3533(int[] is) {
		return null;
	}

	public Class172 method3221(int[] is) {
		return null;
	}

	public Class172 method3300(int[] is) {
		return null;
	}

	public Class172 method3268(int[] is) {
		return null;
	}

	static void method14881(Class427 class427, boolean bool, float f, float f_1733_, float f_1734_, float f_1735_, int i, int i_1736_, int i_1737_) {
		int i_1738_ = client.aClass509_11072.method8351(1220073746);
		int i_1739_ = client.aClass509_11072.method8394(-1401540116);
		class427.method6752(f, f_1733_, f_1734_, f_1735_, (float) i_1739_, (float) i_1738_, (float) i, (float) i_1736_);
	}

	static final void method14882(Class665 class665, int i) {
		int i_1740_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		class665.anInt8528 -= 866019034;
		String string = ((String) class665.anObjectArray8541[318492261 * class665.anInt8528]);
		String string_1741_ = ((String) class665.anObjectArray8541[1 + class665.anInt8528 * 318492261]);
		if (string.length() <= 500 && string_1741_.length() <= 500)
			Class527_Sub8.method16063(i_1740_, string, string_1741_, -1191696371);
	}

	static final int method14883(int i, int i_1742_, int i_1743_, byte i_1744_) {
		int i_1745_ = i / i_1743_;
		int i_1746_ = i & i_1743_ - 1;
		int i_1747_ = i_1742_ / i_1743_;
		int i_1748_ = i_1742_ & i_1743_ - 1;
		int i_1749_ = Class490.method7973(i_1745_, i_1747_, (byte) 29);
		int i_1750_ = Class490.method7973(i_1745_ + 1, i_1747_, (byte) 12);
		int i_1751_ = Class490.method7973(i_1745_, 1 + i_1747_, (byte) 48);
		int i_1752_ = Class490.method7973(i_1745_ + 1, i_1747_ + 1, (byte) 37);
		int i_1753_ = Class298.method5512(i_1749_, i_1750_, i_1746_, i_1743_, (short) 397);
		int i_1754_ = Class298.method5512(i_1751_, i_1752_, i_1746_, i_1743_, (short) 397);
		return Class298.method5512(i_1753_, i_1754_, i_1748_, i_1743_, (short) 397);
	}

	public static String method14884(Object[] objects, int i, int i_1755_, byte i_1756_) {
		if (i_1755_ == 0)
			return "";
		if (1 == i_1755_) {
			CharSequence charsequence = (CharSequence) objects[i];
			if (charsequence == null)
				return "null";
			return charsequence.toString();
		}
		int i_1757_ = i_1755_ + i;
		int i_1758_ = 0;
		for (int i_1759_ = i; i_1759_ < i_1757_; i_1759_++) {
			CharSequence charsequence = (CharSequence) objects[i_1759_];
			if (null == charsequence)
				i_1758_ += 4;
			else
				i_1758_ += charsequence.length();
		}
		StringBuilder stringbuilder = new StringBuilder(i_1758_);
		for (int i_1760_ = i; i_1760_ < i_1757_; i_1760_++) {
			CharSequence charsequence = (CharSequence) objects[i_1760_];
			if (charsequence == null)
				stringbuilder.append("null");
			else
				stringbuilder.append(charsequence);
		}
		return stringbuilder.toString();
	}
}
