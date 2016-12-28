/* Class160_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.nio.ByteBuffer;
import java.util.Iterator;

public class Class160_Sub2 extends Class160 {
	int anInt9393;
	static final int anInt9394 = 74;
	int anInt9395;
	int anInt9396;
	int anInt9397;
	int anInt9398;
	int anInt9399;
	int anInt9400;
	int anInt9401;
	short[][] aShortArrayArray9402;
	float aFloat9403 = 3.4028235E38F;
	static final int anInt9404 = 1;
	float[][] aFloatArrayArray9405;
	int[] anIntArray9406;
	int[][][] anIntArrayArrayArray9407;
	int[] anIntArray9408;
	int[][][] anIntArrayArrayArray9409;
	int[][][] anIntArrayArrayArray9410;
	int[][][] anIntArrayArrayArray9411;
	byte[][] aByteArrayArray9412;
	Class339 aClass339_9413;
	int[][][] anIntArrayArrayArray9414;
	Class536[] aClass536Array9415;
	Interface38 anInterface38_9416;
	int[][][] anIntArrayArrayArray9417;
	Class343 aClass343_9418;
	int anInt9419;
	Class536_Sub10[][][] aClass536_Sub10ArrayArrayArray9420;
	Class167_Sub3 aClass167_Sub3_9421;
	float[][] aFloatArrayArray9422;
	byte[][] aByteArrayArray9423;
	float[][] aFloatArrayArray9424;
	Class4 aClass4_9425;
	Class536[] aClass536Array9426;
	int anInt9427;
	Interface38 anInterface38_9428;
	ByteBuffer aByteBuffer9429;
	int anInt9430;
	float aFloat9431 = -3.4028235E38F;
	int[] anIntArray9432;
	ByteBuffer aByteBuffer9433;
	Class708 aClass708_9434 = new Class708();

	void method8660() {
		if ((anInt9398 & 0x2) == 0) {
			anIntArrayArrayArray9414 = null;
			anIntArrayArrayArray9409 = null;
			anIntArrayArrayArray9417 = null;
		}
		anIntArrayArrayArray9411 = null;
		anIntArrayArrayArray9407 = null;
		anIntArrayArrayArray9410 = null;
		aClass536_Sub10ArrayArrayArray9420 = null;
		aByteArrayArray9423 = null;
		aClass4_9425 = null;
		aClass536Array9426 = null;
		aFloatArrayArray9424 = null;
		aFloatArrayArray9405 = null;
		aFloatArrayArray9422 = null;
	}

	public void method1952(Class536_Sub19 class536_sub19, int[] is) {
		aClass708_9434.method8335(new Class536_Sub4(aClass167_Sub3_9421, this, class536_sub19, is), -1628125961);
	}

	public void method1920(int i, int i_0_, int[] is, int[] is_1_, int[] is_2_, int[] is_3_, int[] is_4_, int[] is_5_, int[] is_6_, int[] is_7_, Class175 class175, boolean bool) {
		Class174 class174 = aClass167_Sub3_9421.aClass174_1852;
		if (is_3_ != null && anIntArrayArrayArray9411 == null)
			anIntArrayArrayArray9411 = new int[anInt1766 * 1718142487][anInt1769 * -889224915][];
		if (is_1_ != null && anIntArrayArrayArray9410 == null)
			anIntArrayArrayArray9410 = new int[anInt1766 * 1718142487][anInt1769 * -889224915][];
		anIntArrayArrayArray9409[i][i_0_] = is;
		anIntArrayArrayArray9414[i][i_0_] = is_2_;
		anIntArrayArrayArray9417[i][i_0_] = is_4_;
		anIntArrayArrayArray9407[i][i_0_] = is_5_;
		if (anIntArrayArrayArray9411 != null)
			anIntArrayArrayArray9411[i][i_0_] = is_3_;
		if (anIntArrayArrayArray9410 != null)
			anIntArrayArrayArray9410[i][i_0_] = is_1_;
		Class536_Sub10[] class536_sub10s = (aClass536_Sub10ArrayArrayArray9420[i][i_0_] = new Class536_Sub10[is_4_.length]);
		for (int i_8_ = 0; i_8_ < is_4_.length; i_8_++) {
			int i_9_ = is_6_[i_8_];
			int i_10_ = is_7_[i_8_];
			if ((anInt9399 & 0x20) != 0 && i_9_ != -1 && class174.method2446(i_9_, -1858287584).aBool1820) {
				i_10_ = 128;
				i_9_ = -1;
			}
			long l = ((long) (class175.anInt1930 * 1487365757) << 48 | (long) (class175.anInt1934 * 71478565) << 42 | (long) (class175.anInt1932 * 432289019) << 28 | (long) (i_10_ << 14) | (long) i_9_);
			Class536 class536;
			for (class536 = aClass4_9425.method556(l); class536 != null; class536 = aClass4_9425.method557(-1552138840)) {
				Class536_Sub10 class536_sub10 = (Class536_Sub10) class536;
				if (class536_sub10.anInt10436 == i_9_ && class536_sub10.aFloat10437 == (float) i_10_ && class536_sub10.aClass175_10438.method2450(class175, (byte) 33))
					break;
			}
			if (class536 == null) {
				class536_sub10s[i_8_] = new Class536_Sub10(this, i_9_, i_10_, class175);
				aClass4_9425.method560(class536_sub10s[i_8_], l);
			} else
				class536_sub10s[i_8_] = (Class536_Sub10) class536;
		}
		if (bool)
			aByteArrayArray9412[i][i_0_] |= 0x1;
		if (is_4_.length > anInt9396)
			anInt9396 = is_4_.length;
		anInt9419 += is_4_.length;
	}

	public void method1921(int i, int i_11_, int[] is, int[] is_12_, int[] is_13_, int[] is_14_, int[] is_15_, int[] is_16_, int[] is_17_, int[] is_18_, int[] is_19_, int[] is_20_, int[] is_21_, Class175 class175, boolean bool) {
		int i_22_ = is_18_.length;
		int[] is_23_ = new int[i_22_ * 3];
		int[] is_24_ = new int[i_22_ * 3];
		int[] is_25_ = new int[i_22_ * 3];
		int[] is_26_ = new int[i_22_ * 3];
		int[] is_27_ = new int[i_22_ * 3];
		int[] is_28_ = new int[i_22_ * 3];
		int[] is_29_ = is_12_ != null ? new int[i_22_ * 3] : null;
		int[] is_30_ = is_14_ != null ? new int[i_22_ * 3] : null;
		int i_31_ = 0;
		for (int i_32_ = 0; i_32_ < i_22_; i_32_++) {
			int i_33_ = is_15_[i_32_];
			int i_34_ = is_16_[i_32_];
			int i_35_ = is_17_[i_32_];
			is_23_[i_31_] = is[i_33_];
			is_24_[i_31_] = is_13_[i_33_];
			is_25_[i_31_] = is_18_[i_32_];
			is_27_[i_31_] = is_20_[i_32_];
			is_28_[i_31_] = is_21_[i_32_];
			is_26_[i_31_] = is_19_ != null ? is_19_[i_32_] : is_18_[i_32_];
			if (is_12_ != null)
				is_29_[i_31_] = is_12_[i_33_];
			if (is_14_ != null)
				is_30_[i_31_] = is_14_[i_33_];
			i_31_++;
			is_23_[i_31_] = is[i_34_];
			is_24_[i_31_] = is_13_[i_34_];
			is_25_[i_31_] = is_18_[i_32_];
			is_27_[i_31_] = is_20_[i_32_];
			is_28_[i_31_] = is_21_[i_32_];
			is_26_[i_31_] = is_19_ != null ? is_19_[i_32_] : is_18_[i_32_];
			if (is_12_ != null)
				is_29_[i_31_] = is_12_[i_34_];
			if (is_14_ != null)
				is_30_[i_31_] = is_14_[i_34_];
			i_31_++;
			is_23_[i_31_] = is[i_35_];
			is_24_[i_31_] = is_13_[i_35_];
			is_25_[i_31_] = is_18_[i_32_];
			is_27_[i_31_] = is_20_[i_32_];
			is_28_[i_31_] = is_21_[i_32_];
			is_26_[i_31_] = is_19_ != null ? is_19_[i_32_] : is_18_[i_32_];
			if (is_12_ != null)
				is_29_[i_31_] = is_12_[i_35_];
			if (is_14_ != null)
				is_30_[i_31_] = is_14_[i_35_];
			i_31_++;
		}
		method1920(i, i_11_, is_23_, is_29_, is_24_, is_30_, is_25_, is_26_, is_27_, is_28_, class175, bool);
	}

	public void method1922() {
		if (anInt9419 <= 0) {
			aClass339_9413 = null;
			method8662();
		} else {
			byte[][] is = (new byte[anInt1766 * 1718142487 + 1][anInt1769 * -889224915 + 1]);
			for (int i = 1; i < anInt1766 * 1718142487; i++) {
				for (int i_36_ = 1; i_36_ < anInt1769 * -889224915; i_36_++)
					is[i][i_36_] = (byte) ((aByteArrayArray9423[i - 1][i_36_] >> 2) + (aByteArrayArray9423[i + 1][i_36_] >> 3) + (aByteArrayArray9423[i][i_36_ - 1] >> 2) + (aByteArrayArray9423[i][i_36_ + 1] >> 3) + (aByteArrayArray9423[i][i_36_] >> 1));
			}
			aClass536Array9426 = new Class536[aClass4_9425.method569(1329056482)];
			aClass4_9425.method558(aClass536Array9426, -1979322356);
			for (int i = 0; i < aClass536Array9426.length; i++)
				((Class536_Sub10) aClass536Array9426[i]).method9419(anInt9419);
			anInt9430 = 20;
			if (anIntArrayArrayArray9411 != null)
				anInt9430 += 4;
			if ((anInt9399 & 0x7) != 0)
				anInt9430 += 12;
			aByteBuffer9433 = aClass167_Sub3_9421.method8858(anInt9419 * 4);
			aByteBuffer9429 = aClass167_Sub3_9421.method8858(anInt9419 * anInt9430);
			Class536_Sub10[] class536_sub10s = new Class536_Sub10[anInt9419];
			int i = Class72.method1124(anInt9419 / 4, 1194535161);
			if (i < 1)
				i = 1;
			Class4 class4 = new Class4(i);
			Class536_Sub10[] class536_sub10s_37_ = new Class536_Sub10[anInt9396];
			for (int i_38_ = 0; i_38_ < anInt1766 * 1718142487; i_38_++) {
				for (int i_39_ = 0; i_39_ < anInt1769 * -889224915; i_39_++)
					method8661(i_38_, i_39_, is, class536_sub10s_37_, class4, class536_sub10s);
			}
			for (int i_40_ = 0; i_40_ < anInt9400; i_40_++) {
				Class536_Sub10 class536_sub10 = class536_sub10s[i_40_];
				if (class536_sub10 != null)
					class536_sub10.method9411(i_40_);
			}
			for (int i_41_ = 0; i_41_ < anInt1766 * 1718142487; i_41_++) {
				for (int i_42_ = 0; i_42_ < anInt1769 * -889224915; i_42_++) {
					short[] is_43_ = (aShortArrayArray9402[i_42_ * (anInt1766 * 1718142487) + i_41_]);
					if (is_43_ != null) {
						int i_44_ = 0;
						int i_45_ = 0;
						while (i_45_ < is_43_.length) {
							int i_46_ = is_43_[i_45_++] & 0xffff;
							int i_47_ = is_43_[i_45_++] & 0xffff;
							int i_48_ = is_43_[i_45_++] & 0xffff;
							Class536_Sub10 class536_sub10 = class536_sub10s[i_46_];
							Class536_Sub10 class536_sub10_49_ = class536_sub10s[i_47_];
							Class536_Sub10 class536_sub10_50_ = class536_sub10s[i_48_];
							Class536_Sub10 class536_sub10_51_ = null;
							if (class536_sub10 != null) {
								class536_sub10.method9412(i_41_, i_42_, i_44_);
								class536_sub10_51_ = class536_sub10;
							}
							if (class536_sub10_49_ != null) {
								class536_sub10_49_.method9412(i_41_, i_42_, i_44_);
								if (class536_sub10_51_ == null || ((class536_sub10_49_.aLong7133 * -6909195213925454795L) < (class536_sub10_51_.aLong7133 * -6909195213925454795L)))
									class536_sub10_51_ = class536_sub10_49_;
							}
							if (class536_sub10_50_ != null) {
								class536_sub10_50_.method9412(i_41_, i_42_, i_44_);
								if (class536_sub10_51_ == null || ((class536_sub10_50_.aLong7133 * -6909195213925454795L) < (class536_sub10_51_.aLong7133 * -6909195213925454795L)))
									class536_sub10_51_ = class536_sub10_50_;
							}
							if (class536_sub10_51_ != null) {
								if (class536_sub10 != null)
									class536_sub10_51_.method9411(i_46_);
								if (class536_sub10_49_ != null)
									class536_sub10_51_.method9411(i_47_);
								if (class536_sub10_50_ != null)
									class536_sub10_51_.method9411(i_48_);
								class536_sub10_51_.method9412(i_41_, i_42_, i_44_);
							}
							i_44_++;
						}
					}
				}
			}
			anInt9427 = 0;
			for (int i_52_ = 0; i_52_ < aClass536Array9426.length; i_52_++) {
				Class536_Sub10 class536_sub10 = (Class536_Sub10) aClass536Array9426[i_52_];
				if (class536_sub10.anInt10446 > 0)
					aClass536Array9426[anInt9427++] = class536_sub10;
			}
			aClass536Array9415 = new Class536[anInt9427];
			long[] ls = new long[anInt9427];
			for (int i_53_ = 0; i_53_ < anInt9427; i_53_++) {
				Class536_Sub10 class536_sub10 = (Class536_Sub10) aClass536Array9426[i_53_];
				ls[i_53_] = class536_sub10.aLong7133 * -6909195213925454795L;
				aClass536Array9415[i_53_] = class536_sub10;
			}
			Class507.method6172(ls, aClass536Array9415, 579954722);
			method8663();
		}
	}

	public boolean method1924(Class536_Sub18_Sub7 class536_sub18_sub7, int i, int i_54_, int i_55_, int i_56_, boolean bool) {
		if (aClass339_9413 == null || class536_sub18_sub7 == null)
			return false;
		int i_57_ = (i - (i_54_ * aClass167_Sub3_9421.anInt9634 >> 8) >> aClass167_Sub3_9421.anInt9633);
		int i_58_ = (i_55_ - (i_54_ * aClass167_Sub3_9421.anInt9635 >> 8) >> aClass167_Sub3_9421.anInt9633);
		return aClass339_9413.method4436(class536_sub18_sub7, i_57_, i_58_);
	}

	public void method1938(int i, int i_59_, int i_60_) {
		i = Math.min(aByteArrayArray9423.length - 1, Math.max(0, i));
		i_59_ = Math.min(aByteArrayArray9423[i].length - 1, Math.max(0, i_59_));
		if ((aByteArrayArray9423[i][i_59_] & 0xff) < i_60_)
			aByteArrayArray9423[i][i_59_] = (byte) i_60_;
	}

	void method8661(int i, int i_61_, byte[][] is, Class536_Sub10[] class536_sub10s, Class4 class4, Class536_Sub10[] class536_sub10s_62_) {
		if (anIntArrayArrayArray9417[i][i_61_] != null) {
			Class536_Sub10[] class536_sub10s_63_ = aClass536_Sub10ArrayArrayArray9420[i][i_61_];
			int[] is_64_ = anIntArrayArrayArray9409[i][i_61_];
			int[] is_65_ = anIntArrayArrayArray9414[i][i_61_];
			int[] is_66_ = anIntArrayArrayArray9407[i][i_61_];
			int[] is_67_ = anIntArrayArrayArray9417[i][i_61_];
			int[] is_68_ = (anIntArrayArrayArray9410 != null ? anIntArrayArrayArray9410[i][i_61_] : null);
			int[] is_69_ = (anIntArrayArrayArray9411 != null ? anIntArrayArrayArray9411[i][i_61_] : null);
			if (is_66_ == null)
				is_66_ = is_67_;
			float f = aFloatArrayArray9422[i][i_61_];
			float f_70_ = aFloatArrayArray9405[i][i_61_];
			float f_71_ = aFloatArrayArray9424[i][i_61_];
			float f_72_ = aFloatArrayArray9422[i][i_61_ + 1];
			float f_73_ = aFloatArrayArray9405[i][i_61_ + 1];
			float f_74_ = aFloatArrayArray9424[i][i_61_ + 1];
			float f_75_ = aFloatArrayArray9422[i + 1][i_61_ + 1];
			float f_76_ = aFloatArrayArray9405[i + 1][i_61_ + 1];
			float f_77_ = aFloatArrayArray9424[i + 1][i_61_ + 1];
			float f_78_ = aFloatArrayArray9422[i + 1][i_61_];
			float f_79_ = aFloatArrayArray9405[i + 1][i_61_];
			float f_80_ = aFloatArrayArray9424[i + 1][i_61_];
			int i_81_ = is[i][i_61_] & 0xff;
			int i_82_ = is[i][i_61_ + 1] & 0xff;
			int i_83_ = is[i + 1][i_61_ + 1] & 0xff;
			int i_84_ = is[i + 1][i_61_] & 0xff;
			int i_85_ = 0;
			while_36_: for (int i_86_ = 0; i_86_ < is_67_.length; i_86_++) {
				Class536_Sub10 class536_sub10 = class536_sub10s_63_[i_86_];
				for (int i_87_ = 0; i_87_ < i_85_; i_87_++) {
					if (class536_sub10s[i_87_] == class536_sub10)
						continue while_36_;
				}
				class536_sub10s[i_85_++] = class536_sub10;
			}
			short[] is_88_ = (aShortArrayArray9402[i_61_ * (anInt1766 * 1718142487) + i] = new short[is_67_.length]);
			for (int i_89_ = 0; i_89_ < is_67_.length; i_89_++) {
				int i_90_ = (i << anInt1768 * 2064238369) + is_64_[i_89_];
				int i_91_ = (i_61_ << anInt1768 * 2064238369) + is_65_[i_89_];
				int i_92_ = i_90_ >> anInt9395;
				int i_93_ = i_91_ >> anInt9395;
				int i_94_ = is_67_[i_89_];
				int i_95_ = is_66_[i_89_];
				int i_96_ = is_68_ != null ? is_68_[i_89_] : 0;
				long l = ((long) i_95_ << 48 | (long) i_94_ << 32 | (long) (i_92_ << 16) | (long) i_93_);
				int i_97_ = is_64_[i_89_];
				int i_98_ = is_65_[i_89_];
				int i_99_ = 74;
				int i_100_ = 0;
				float f_101_ = 1.0F;
				float f_102_;
				float f_103_;
				float f_104_;
				if (i_97_ == 0 && i_98_ == 0) {
					f_102_ = f;
					f_103_ = f_70_;
					f_104_ = f_71_;
					i_99_ -= i_81_;
				} else if (i_97_ == 0 && i_98_ == anInt1767 * -1504778739) {
					f_102_ = f_72_;
					f_103_ = f_73_;
					f_104_ = f_74_;
					i_99_ -= i_82_;
				} else if (i_97_ == anInt1767 * -1504778739 && i_98_ == anInt1767 * -1504778739) {
					f_102_ = f_75_;
					f_103_ = f_76_;
					f_104_ = f_77_;
					i_99_ -= i_83_;
				} else if (i_97_ == anInt1767 * -1504778739 && i_98_ == 0) {
					f_102_ = f_78_;
					f_103_ = f_79_;
					f_104_ = f_80_;
					i_99_ -= i_84_;
				} else {
					float f_105_ = (float) i_97_ / (float) (anInt1767 * -1504778739);
					float f_106_ = (float) i_98_ / (float) (anInt1767 * -1504778739);
					float f_107_ = f + (f_78_ - f) * f_105_;
					float f_108_ = f_70_ + (f_79_ - f_70_) * f_105_;
					float f_109_ = f_71_ + (f_80_ - f_71_) * f_105_;
					float f_110_ = f_72_ + (f_75_ - f_72_) * f_105_;
					float f_111_ = f_73_ + (f_76_ - f_73_) * f_105_;
					float f_112_ = f_74_ + (f_77_ - f_74_) * f_105_;
					f_102_ = f_107_ + (f_110_ - f_107_) * f_106_;
					f_103_ = f_108_ + (f_111_ - f_108_) * f_106_;
					f_104_ = f_109_ + (f_112_ - f_109_) * f_106_;
					int i_113_ = i_81_ + ((i_84_ - i_81_) * i_97_ >> anInt1768 * 2064238369);
					int i_114_ = i_82_ + ((i_83_ - i_82_) * i_97_ >> anInt1768 * 2064238369);
					i_99_ -= i_113_ + ((i_114_ - i_113_) * i_98_ >> anInt1768 * 2064238369);
				}
				if (i_94_ != -1) {
					int i_115_ = (i_94_ & 0x7f) * i_99_ >> 7;
					if (i_115_ < 2)
						i_115_ = 2;
					else if (i_115_ > 126)
						i_115_ = 126;
					i_100_ = ColourUtils.anIntArray8310[i_94_ & 0xff80 | i_115_];
					if ((anInt9399 & 0x7) == 0) {
						f_101_ = (aClass167_Sub3_9421.aFloatArray9542[0] * f_102_ + (aClass167_Sub3_9421.aFloatArray9542[1] * f_103_) + (aClass167_Sub3_9421.aFloatArray9542[2] * f_104_));
						f_101_ = (aClass167_Sub3_9421.aFloat9626 + f_101_ * (f_101_ > 0.0F ? aClass167_Sub3_9421.aFloat9573 : aClass167_Sub3_9421.aFloat9579));
					}
				}
				Class536 class536 = null;
				if ((i_90_ & anInt9397 - 1) == 0 && (i_91_ & anInt9397 - 1) == 0)
					class536 = class4.method556(l);
				int i_116_;
				if (class536 == null) {
					int i_117_;
					if (i_95_ != i_94_) {
						int i_118_ = (i_95_ & 0x7f) * i_99_ >> 7;
						if (i_118_ < 2)
							i_118_ = 2;
						else if (i_118_ > 126)
							i_118_ = 126;
						i_117_ = ColourUtils.anIntArray8310[i_95_ & 0xff80 | i_118_];
						if ((anInt9399 & 0x7) == 0) {
							float f_119_ = ((aClass167_Sub3_9421.aFloatArray9542[0] * f_102_) + (aClass167_Sub3_9421.aFloatArray9542[1] * f_103_) + (aClass167_Sub3_9421.aFloatArray9542[2] * f_104_));
							f_119_ = (aClass167_Sub3_9421.aFloat9626 + (f_101_ * (f_101_ > 0.0F ? aClass167_Sub3_9421.aFloat9573 : aClass167_Sub3_9421.aFloat9579)));
							int i_120_ = i_117_ >> 16 & 0xff;
							int i_121_ = i_117_ >> 8 & 0xff;
							int i_122_ = i_117_ & 0xff;
							i_120_ *= f_119_;
							if (i_120_ < 0)
								i_120_ = 0;
							else if (i_120_ > 255)
								i_120_ = 255;
							i_121_ *= f_119_;
							if (i_121_ < 0)
								i_121_ = 0;
							else if (i_121_ > 255)
								i_121_ = 255;
							i_122_ *= f_119_;
							if (i_122_ < 0)
								i_122_ = 0;
							else if (i_122_ > 255)
								i_122_ = 255;
							i_117_ = i_120_ << 16 | i_121_ << 8 | i_122_;
						}
					} else
						i_117_ = i_100_;
					aByteBuffer9429.putFloat((float) i_90_);
					aByteBuffer9429.putFloat((float) (method1925(i_90_, i_91_, (byte) 64) + i_96_));
					aByteBuffer9429.putFloat((float) i_91_);
					aByteBuffer9429.putFloat((float) i_90_);
					aByteBuffer9429.putFloat((float) i_91_);
					if (anIntArrayArrayArray9411 != null)
						aByteBuffer9429.putFloat(is_69_ != null ? (float) (is_69_[i_89_] - 1) : 0.0F);
					if ((anInt9399 & 0x7) != 0) {
						aByteBuffer9429.putFloat(f_102_);
						aByteBuffer9429.putFloat(f_103_);
						aByteBuffer9429.putFloat(f_104_);
					}
					if (aClass167_Sub3_9421.anInt9689 == 0) {
						int i_123_ = i_117_ & ~0xff00ff;
						i_123_ |= (i_117_ & 0xff0000) >> 16;
						i_123_ |= (i_117_ & 0xff) << 16;
						i_117_ = i_123_;
					}
					aByteBuffer9433.putInt(~0xffffff | i_117_);
					i_116_ = anInt9400++;
					is_88_[i_89_] = (short) i_116_;
					if (i_94_ != -1)
						class536_sub10s_62_[i_116_] = class536_sub10s_63_[i_89_];
					class4.method560(new Class536_Sub20(is_88_[i_89_]), l);
				} else {
					is_88_[i_89_] = ((Class536_Sub20) class536).aShort10520;
					i_116_ = is_88_[i_89_] & 0xffff;
					if (i_94_ != -1 && ((class536_sub10s_63_[i_89_].aLong7133 * -6909195213925454795L) < (class536_sub10s_62_[i_116_].aLong7133 * -6909195213925454795L)))
						class536_sub10s_62_[i_116_] = class536_sub10s_63_[i_89_];
				}
				for (int i_124_ = 0; i_124_ < i_85_; i_124_++)
					class536_sub10s[i_124_].method9416(i_116_, i_100_, i_99_, f_101_);
				anInt9401++;
			}
		}
	}

	public void method1923(int i, int i_125_, int i_126_, boolean[][] bools, boolean bool, int i_127_) {
		if (aClass536Array9415 != null) {
			int i_128_ = i_126_ + i_126_ + 1;
			i_128_ *= i_128_;
			if (anIntArray9408.length < i_128_)
				anIntArray9408 = new int[i_128_];
			int i_129_ = i - i_126_;
			int i_130_ = i_129_;
			if (i_129_ < 0)
				i_129_ = 0;
			int i_131_ = i_125_ - i_126_;
			int i_132_ = i_131_;
			if (i_131_ < 0)
				i_131_ = 0;
			int i_133_ = i + i_126_;
			if (i_133_ > anInt1766 * 1718142487 - 1)
				i_133_ = anInt1766 * 1718142487 - 1;
			int i_134_ = i_125_ + i_126_;
			if (i_134_ > anInt1769 * -889224915 - 1)
				i_134_ = anInt1769 * -889224915 - 1;
			anInt9393 = 0;
			for (int i_135_ = i_129_; i_135_ <= i_133_; i_135_++) {
				boolean[] bools_136_ = bools[i_135_ - i_130_];
				for (int i_137_ = i_131_; i_137_ <= i_134_; i_137_++) {
					if (bools_136_[i_137_ - i_132_])
						anIntArray9408[anInt9393++] = i_137_ * (anInt1766 * 1718142487) + i_135_;
				}
			}
			ByteBuffer bytebuffer = aClass167_Sub3_9421.aByteBuffer9549;
			bytebuffer.clear();
			for (int i_138_ = 0; i_138_ < aClass536Array9415.length; i_138_++) {
				Class536_Sub10 class536_sub10 = (Class536_Sub10) aClass536Array9415[i_138_];
				class536_sub10.method9415(anIntArray9408, anInt9393);
			}
			int i_139_ = bytebuffer.position();
			Class327 class327 = aClass167_Sub3_9421.aClass327_9541;
			aClass167_Sub3_9421.method8818();
			if (aClass167_Sub3_9421.anInt9550 > 0) {
				class327.aClass436_3585.method5243(((float) (aClass167_Sub3_9421.anInt9672 >> 16 & 0xff) / 255.0F), ((float) (aClass167_Sub3_9421.anInt9672 >> 8 & 0xff) / 255.0F), ((float) (aClass167_Sub3_9421.anInt9672 >> 0 & 0xff) / 255.0F));
				class327.aClass427_3577.method5131(0.0F, 0.0F, 1.0F, -(aClass167_Sub3_9421.aFloat9675));
				class327.aClass427_3577.method5137(aClass167_Sub3_9421.aClass443_9565);
				class327.aClass427_3577.method5134(1.0F / (aClass167_Sub3_9421.aFloat9676 - aClass167_Sub3_9421.aFloat9675));
			} else {
				class327.aClass427_3577.method5131(0.0F, 0.0F, 0.0F, 0.0F);
				class327.aClass436_3585.method5243(0.0F, 0.0F, 0.0F);
			}
			if (i_139_ != 0) {
				Interface41 interface41 = aClass167_Sub3_9421.method8737(i_139_ / 2);
				interface41.method264(0, i_139_, aClass167_Sub3_9421.aLong9586);
				aClass167_Sub3_9421.method8808(0, anInterface38_9416);
				aClass167_Sub3_9421.method8809(interface41);
				class327.method4284(Class443.aClass443_4879);
				if ((anInt9399 & 0x7) == 0) {
					int i_140_ = 0;
					for (int i_141_ = 0; i_141_ < aClass536Array9415.length; i_141_++) {
						Class536_Sub10 class536_sub10 = (Class536_Sub10) aClass536Array9415[i_141_];
						if (class536_sub10.anInt10434 != 0) {
							if (aClass167_Sub3_9421.aBool9683) {
								aClass167_Sub3_9421.method2282(0, class536_sub10.aClass175_10438);
								class327.aClass427_3575.method5131(0.0F, 1.0F, 0.0F, ((float) aClass167_Sub3_9421.anInt9696 + ((float) ((class536_sub10.aClass175_10438.anInt1930) * 1487365757) / 255.0F * (float) ((class536_sub10.aClass175_10438.anInt1934) * 71478565))));
								class327.aClass427_3575.method5134(1.0F / (float) ((class536_sub10.aClass175_10438.anInt1934) * 71478565));
								class327.aClass436_3573.method5243((float) ((class536_sub10.aClass175_10438.anInt1932) * 432289019 >> 16 & 0xff) / 255.0F, (float) ((class536_sub10.aClass175_10438.anInt1932) * 432289019 >> 8 & 0xff) / 255.0F, (float) ((class536_sub10.aClass175_10438.anInt1932) * 432289019 >> 0 & 0xff) / 255.0F);
							} else {
								class327.aClass427_3575.method5131(0.0F, 0.0F, 0.0F, 0.0F);
								class327.aClass436_3573.method5243(0.0F, 0.0F, 0.0F);
							}
							boolean bool_142_ = false;
							if (class536_sub10.anInt10436 != -1) {
								Class164 class164 = (aClass167_Sub3_9421.aClass174_1852.method2446(class536_sub10.anInt10436, -1632815610));
								class327.anInterface36_3569 = aClass167_Sub3_9421.aClass340_9561.method4456(class164);
								bool_142_ = !Class16_Sub1.method10359((class164.aByte1797), -1214407383);
							} else
								class327.anInterface36_3569 = aClass167_Sub3_9421.anInterface36_9691;
							aClass167_Sub3_9421.method8808(1, class536_sub10.anInterface38_10439);
							aClass167_Sub3_9421.method8807(aClass343_9418);
							class327.aClass443_3571.method5344(1.0F / class536_sub10.aFloat10437, 1.0F / class536_sub10.aFloat10437, 1.0F, 1.0F);
							class327.anInt3584 = class536_sub10.anInt10441;
							class327.anInt3574 = (class536_sub10.anInt10444 - class536_sub10.anInt10441 + 1);
							class327.anInt3586 = i_140_;
							class327.anInt3587 = class536_sub10.anInt10434 / 3;
							class327.method4285(bool_142_);
							i_140_ += class536_sub10.anInt10434;
						}
					}
				} else {
					class327.aClass436_3583.method5243(aClass167_Sub3_9421.aFloatArray9542[0], aClass167_Sub3_9421.aFloatArray9542[1], aClass167_Sub3_9421.aFloatArray9542[2]);
					class327.aClass436_3580.method5243((aClass167_Sub3_9421.aFloat9573 * aClass167_Sub3_9421.aFloat9678), (aClass167_Sub3_9421.aFloat9573 * aClass167_Sub3_9421.aFloat9649), (aClass167_Sub3_9421.aFloat9573 * aClass167_Sub3_9421.aFloat9701));
					class327.aClass436_3581.method5243((-aClass167_Sub3_9421.aFloat9579 * aClass167_Sub3_9421.aFloat9678), (-aClass167_Sub3_9421.aFloat9579 * aClass167_Sub3_9421.aFloat9649), (-aClass167_Sub3_9421.aFloat9579 * aClass167_Sub3_9421.aFloat9701));
					class327.aClass436_3566.method5243((aClass167_Sub3_9421.aFloat9626 * aClass167_Sub3_9421.aFloat9678), (aClass167_Sub3_9421.aFloat9626 * aClass167_Sub3_9421.aFloat9649), (aClass167_Sub3_9421.aFloat9626 * aClass167_Sub3_9421.aFloat9701));
					int i_143_ = 0;
					for (int i_144_ = 0; i_144_ < aClass536Array9415.length; i_144_++) {
						Class536_Sub10 class536_sub10 = (Class536_Sub10) aClass536Array9415[i_144_];
						if (class536_sub10.anInt10434 > 0) {
							if (aClass167_Sub3_9421.aBool9683) {
								aClass167_Sub3_9421.method2282(0, class536_sub10.aClass175_10438);
								float f = 0.15F;
								class327.aClass427_3575.method5131(0.0F, 1.0F / ((float) ((class536_sub10.aClass175_10438.anInt1934) * 71478565) * f), 0.0F, 256.0F / ((float) ((class536_sub10.aClass175_10438.anInt1934) * 71478565) * f));
								class327.aClass436_3573.method5243((float) ((class536_sub10.aClass175_10438.anInt1932) * 432289019 >> 16 & 0xff) / 255.0F, (float) ((class536_sub10.aClass175_10438.anInt1932) * 432289019 >> 8 & 0xff) / 255.0F, (float) ((class536_sub10.aClass175_10438.anInt1932) * 432289019 >> 0 & 0xff) / 255.0F);
							} else {
								class327.aClass427_3575.method5131(0.0F, 0.0F, 0.0F, 0.0F);
								class327.aClass436_3573.method5243(0.0F, 0.0F, 0.0F);
							}
							byte i_145_ = 11;
							if (class536_sub10.anInt10436 != -1) {
								Class164 class164 = (aClass167_Sub3_9421.aClass174_1852.method2446(class536_sub10.anInt10436, -910995187));
								i_145_ = class164.aByte1797;
								class327.anInterface36_3569 = aClass167_Sub3_9421.aClass340_9561.method4456(class164);
								class327.method4303(class164.aByte1823);
							} else
								class327.anInterface36_3569 = aClass167_Sub3_9421.anInterface36_9691;
							aClass167_Sub3_9421.method8808(1, class536_sub10.anInterface38_10439);
							aClass167_Sub3_9421.method8807(aClass343_9418);
							class327.aClass443_3571.method5344(1.0F / class536_sub10.aFloat10437, 1.0F / class536_sub10.aFloat10437, 1.0F, 1.0F);
							class327.anInt3584 = class536_sub10.anInt10441;
							class327.anInt3574 = (class536_sub10.anInt10444 - class536_sub10.anInt10441 + 1);
							class327.anInt3586 = i_143_;
							class327.anInt3587 = class536_sub10.anInt10434 / 3;
							switch (i_145_) {
							case 6:
								class327.method4285(!Class16_Sub1.method10359(i_145_, -1597814836));
								break;
							case 1:
								class327.aClass436_3572.method5243((aClass167_Sub3_9421.aClass443_9564.aFloatArray4878[12]), (aClass167_Sub3_9421.aClass443_9564.aFloatArray4878[13]), (aClass167_Sub3_9421.aClass443_9564.aFloatArray4878[14]));
								if (aClass167_Sub3_9421.aBool9683)
									class327.method4287();
								else
									class327.method4286(0);
								break;
							case 7:
								class327.aClass436_3572.method5243((aClass167_Sub3_9421.aClass443_9564.aFloatArray4878[12]), (aClass167_Sub3_9421.aClass443_9564.aFloatArray4878[13]), (aClass167_Sub3_9421.aClass443_9564.aFloatArray4878[14]));
								class327.aClass443_3582.method5338();
								class327.anInterface39_3570 = aClass167_Sub3_9421.method8739();
								class327.method4288(0);
								break;
							default:
								if (aClass167_Sub3_9421.aBool9683)
									class327.method4289();
								else
									class327.method4293(0);
								break;
							case 2:
							case 4:
							case 8:
							case 9:
								if (!aClass167_Sub3_9421.aBool9704 && (anInt9399 & 0x8) != 0 && aClass167_Sub3_9421.aClass341_Sub1_Sub2_9657.method10591(-639427979)) {
									Class341_Sub1_Sub2 class341_sub1_sub2 = (aClass167_Sub3_9421.aClass341_Sub1_Sub2_9657);
									if (i_145_ == 2)
										class341_sub1_sub2 = (aClass167_Sub3_9421.aClass341_Sub1_Sub2_9656);
									class341_sub1_sub2.aClass443_11507.method5339(aClass167_Sub3_9421.aClass443_9585);
									class341_sub1_sub2.aClass443_11509.method5344(1.0F / (class536_sub10.aFloat10437 * (float) ((class536_sub10.aClass175_10438.anInt1928) * -1036575495)), 1.0F / (class536_sub10.aFloat10437 * (float) ((class536_sub10.aClass175_10438.anInt1928) * -1036575495)), 1.0F, 1.0F);
									class341_sub1_sub2.aClass436_11514.method5243((aClass167_Sub3_9421.aClass443_9564.aFloatArray4878[12]), (aClass167_Sub3_9421.aClass443_9564.aFloatArray4878[13]), (aClass167_Sub3_9421.aClass443_9564.aFloatArray4878[14]));
									Class164 class164 = (aClass167_Sub3_9421.aClass174_1852.method2446(class536_sub10.anInt10436, -2109573239));
									class341_sub1_sub2.anInt11518 = class164.aByte1823 * 87899859;
									class341_sub1_sub2.anInt11527 = (class536_sub10.anInt10441 * -510634877);
									class341_sub1_sub2.anInt11528 = ((class536_sub10.anInt10444 - class536_sub10.anInt10441 + 1) * -885610021);
									class341_sub1_sub2.anInt11521 = i_143_ * -1615681415;
									class341_sub1_sub2.anInt11530 = (class536_sub10.anInt10434 / 3 * 1711695181);
									class341_sub1_sub2.aClass427_11517.method5133(class327.aClass427_3575);
									class341_sub1_sub2.aClass436_11522.method5272(class327.aClass436_3573);
									class341_sub1_sub2.aClass427_11524.method5133(class327.aClass427_3577);
									class341_sub1_sub2.aClass436_11526.method5272(class327.aClass436_3585);
									class341_sub1_sub2.method10592(-1672150177);
								} else
									class327.method4293(0);
							}
							i_143_ += class536_sub10.anInt10434;
						}
					}
				}
			}
			if (!aClass708_9434.method8313(-203274118)) {
				aClass167_Sub3_9421.method8763(128);
				aClass167_Sub3_9421.method8760(false);
				Class436 class436 = new Class436(class327.aClass436_3585);
				class327.aClass436_3585.method5243(0.0F, 0.0F, 0.0F);
				Iterator iterator = aClass708_9434.iterator();
				while (iterator.hasNext()) {
					Class536_Sub4 class536_sub4 = (Class536_Sub4) iterator.next();
					class536_sub4.method9399(class327, i, i_125_, i_126_, bools, bool);
				}
				class327.aClass436_3585.method5272(class436);
			}
			if (aClass339_9413 != null) {
				aClass167_Sub3_9421.method8763(1);
				aClass167_Sub3_9421.method8808(0, anInterface38_9416);
				aClass167_Sub3_9421.method8808(1, anInterface38_9428);
				aClass167_Sub3_9421.method8807(aClass343_9418);
				Class443 class443 = aClass167_Sub3_9421.aClass443_9570;
				class443.method5338();
				class443.aFloatArray4878[13] = -1.0F;
				class327.method4284(class443);
				aClass339_9413.method4438(class327, i, i_125_, i_126_, bools, bool);
			}
		}
	}

	public void method1943(int i, int i_146_, int i_147_, int i_148_, int i_149_, int i_150_, int i_151_, boolean[][] bools) {
		if (anInt9419 > 0) {
			Interface41 interface41 = aClass167_Sub3_9421.method8737(anInt9401);
			int i_152_ = 0;
			int i_153_ = 32767;
			int i_154_ = -32768;
			ByteBuffer bytebuffer = aClass167_Sub3_9421.aByteBuffer9549;
			bytebuffer.clear();
			for (int i_155_ = i_149_; i_155_ < i_151_; i_155_++) {
				int i_156_ = i_155_ * (anInt1766 * 1718142487) + i_148_;
				for (int i_157_ = i_148_; i_157_ < i_150_; i_157_++) {
					if (bools[i_157_ - i_148_][i_155_ - i_149_]) {
						short[] is = aShortArrayArray9402[i_156_];
						if (is != null) {
							for (int i_158_ = 0; i_158_ < is.length; i_158_++) {
								int i_159_ = is[i_158_] & 0xffff;
								if (i_159_ > i_154_)
									i_154_ = i_159_;
								if (i_159_ < i_153_)
									i_153_ = i_159_;
								bytebuffer.putShort((short) i_159_);
								i_152_++;
							}
						}
					}
					i_156_++;
				}
			}
			interface41.method264(0, bytebuffer.position(), aClass167_Sub3_9421.aLong9586);
			if (i_152_ > 0) {
				aClass167_Sub3_9421.method8818();
				Class327 class327 = aClass167_Sub3_9421.aClass327_9541;
				aClass167_Sub3_9421.method8808(0, anInterface38_9416);
				aClass167_Sub3_9421.method8808(1, anInterface38_9428);
				aClass167_Sub3_9421.method8807(aClass343_9418);
				aClass167_Sub3_9421.method8809(interface41);
				aClass167_Sub3_9421.method2099(Class433.aClass433_4836);
				float f = (float) aClass167_Sub3_9421.method2278((byte) 80).method2725();
				float f_160_ = (float) aClass167_Sub3_9421.method2278((byte) -56).method2726();
				Class433 class433 = new Class433();
				Class433 class433_161_ = new Class433();
				class433.method5228(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F);
				class433_161_.method5197((float) i_147_ / (256.0F * (float) (anInt1767 * -1504778739)), (float) -i_147_ / (256.0F * (float) (anInt1767 * -1504778739)), 1.0F / (aFloat9431 - aFloat9403));
				class433_161_.method5200((float) i - (float) (i_148_ * i_147_) / 256.0F, (float) i_146_ + (float) (i_151_ * i_147_) / 256.0F, -aFloat9403 / (aFloat9431 - aFloat9403));
				class433_161_.method5202(2.0F / f, 2.0F / f_160_, 1.0F);
				class433_161_.method5200(-1.0F, -1.0F, 0.0F);
				aClass167_Sub3_9421.aClass433_9543.method5213(class433, class433_161_);
				aClass167_Sub3_9421.aClass443_9570.method5359(aClass167_Sub3_9421.aClass433_9543);
				aClass167_Sub3_9421.method2390(aClass167_Sub3_9421.aClass443_9570);
				class327.method4284(Class443.aClass443_4879);
				class327.aClass427_3577.method5131(0.0F, 0.0F, 0.0F, 0.0F);
				class327.aClass436_3585.method5243(0.0F, 0.0F, 0.0F);
				class327.aClass427_3575.method5131(0.0F, 0.0F, 0.0F, 0.0F);
				class327.aClass436_3573.method5243(0.0F, 0.0F, 0.0F);
				class327.anInterface36_3569 = aClass167_Sub3_9421.anInterface36_9691;
				class327.aClass443_3571.method5338();
				class327.anInt3584 = i_153_;
				class327.anInt3574 = i_154_ - i_153_ + 1;
				class327.anInt3586 = 0;
				class327.anInt3587 = i_152_ / 3;
				if (aClass167_Sub3_9421.aBool9611) {
					aClass167_Sub3_9421.method2302(false);
					class327.method4285(false);
					aClass167_Sub3_9421.method2302(true);
				} else
					class327.method4285(false);
			}
		}
	}

	public void method1931(int i, int i_162_, int[] is, int[] is_163_, int[] is_164_, int[] is_165_, int[] is_166_, int[] is_167_, int[] is_168_, int[] is_169_, int[] is_170_, int[] is_171_, int[] is_172_, Class175 class175, boolean bool) {
		int i_173_ = is_169_.length;
		int[] is_174_ = new int[i_173_ * 3];
		int[] is_175_ = new int[i_173_ * 3];
		int[] is_176_ = new int[i_173_ * 3];
		int[] is_177_ = new int[i_173_ * 3];
		int[] is_178_ = new int[i_173_ * 3];
		int[] is_179_ = new int[i_173_ * 3];
		int[] is_180_ = is_163_ != null ? new int[i_173_ * 3] : null;
		int[] is_181_ = is_165_ != null ? new int[i_173_ * 3] : null;
		int i_182_ = 0;
		for (int i_183_ = 0; i_183_ < i_173_; i_183_++) {
			int i_184_ = is_166_[i_183_];
			int i_185_ = is_167_[i_183_];
			int i_186_ = is_168_[i_183_];
			is_174_[i_182_] = is[i_184_];
			is_175_[i_182_] = is_164_[i_184_];
			is_176_[i_182_] = is_169_[i_183_];
			is_178_[i_182_] = is_171_[i_183_];
			is_179_[i_182_] = is_172_[i_183_];
			is_177_[i_182_] = is_170_ != null ? is_170_[i_183_] : is_169_[i_183_];
			if (is_163_ != null)
				is_180_[i_182_] = is_163_[i_184_];
			if (is_165_ != null)
				is_181_[i_182_] = is_165_[i_184_];
			i_182_++;
			is_174_[i_182_] = is[i_185_];
			is_175_[i_182_] = is_164_[i_185_];
			is_176_[i_182_] = is_169_[i_183_];
			is_178_[i_182_] = is_171_[i_183_];
			is_179_[i_182_] = is_172_[i_183_];
			is_177_[i_182_] = is_170_ != null ? is_170_[i_183_] : is_169_[i_183_];
			if (is_163_ != null)
				is_180_[i_182_] = is_163_[i_185_];
			if (is_165_ != null)
				is_181_[i_182_] = is_165_[i_185_];
			i_182_++;
			is_174_[i_182_] = is[i_186_];
			is_175_[i_182_] = is_164_[i_186_];
			is_176_[i_182_] = is_169_[i_183_];
			is_178_[i_182_] = is_171_[i_183_];
			is_179_[i_182_] = is_172_[i_183_];
			is_177_[i_182_] = is_170_ != null ? is_170_[i_183_] : is_169_[i_183_];
			if (is_163_ != null)
				is_180_[i_182_] = is_163_[i_186_];
			if (is_165_ != null)
				is_181_[i_182_] = is_165_[i_186_];
			i_182_++;
		}
		method1920(i, i_162_, is_174_, is_180_, is_175_, is_181_, is_176_, is_177_, is_178_, is_179_, class175, bool);
	}

	public Class536_Sub18_Sub7 method1928(int i, int i_187_, Class536_Sub18_Sub7 class536_sub18_sub7) {
		if ((aByteArrayArray9412[i][i_187_] & 0x1) == 0)
			return null;
		int i_188_ = anInt1767 * -1504778739 >> aClass167_Sub3_9421.anInt9633;
		Class536_Sub18_Sub7_Sub1 class536_sub18_sub7_sub1 = (Class536_Sub18_Sub7_Sub1) class536_sub18_sub7;
		Class536_Sub18_Sub7_Sub1 class536_sub18_sub7_sub1_189_;
		if (class536_sub18_sub7_sub1 != null && class536_sub18_sub7_sub1.method10972(i_188_, i_188_)) {
			class536_sub18_sub7_sub1_189_ = class536_sub18_sub7_sub1;
			class536_sub18_sub7_sub1_189_.method10980();
		} else
			class536_sub18_sub7_sub1_189_ = new Class536_Sub18_Sub7_Sub1(aClass167_Sub3_9421, i_188_, i_188_);
		class536_sub18_sub7_sub1_189_.method10973(0, 0, i_188_, i_188_);
		method8664(class536_sub18_sub7_sub1_189_, i, i_187_);
		return class536_sub18_sub7_sub1_189_;
	}

	public boolean method1930(Class536_Sub18_Sub7 class536_sub18_sub7, int i, int i_190_, int i_191_, int i_192_, boolean bool) {
		if (aClass339_9413 == null || class536_sub18_sub7 == null)
			return false;
		int i_193_ = (i - (i_190_ * aClass167_Sub3_9421.anInt9634 >> 8) >> aClass167_Sub3_9421.anInt9633);
		int i_194_ = (i_191_ - (i_190_ * aClass167_Sub3_9421.anInt9635 >> 8) >> aClass167_Sub3_9421.anInt9633);
		return aClass339_9413.method4436(class536_sub18_sub7, i_193_, i_194_);
	}

	public void method1945(Class536_Sub18_Sub7 class536_sub18_sub7, int i, int i_195_, int i_196_, int i_197_, boolean bool) {
		if (aClass339_9413 != null && class536_sub18_sub7 != null) {
			int i_198_ = (i - (i_195_ * aClass167_Sub3_9421.anInt9634 >> 8) >> aClass167_Sub3_9421.anInt9633);
			int i_199_ = (i_196_ - (i_195_ * aClass167_Sub3_9421.anInt9635 >> 8) >> aClass167_Sub3_9421.anInt9633);
			aClass339_9413.method4434(class536_sub18_sub7, i_198_, i_199_);
		}
	}

	public void method1953(int i, int i_200_, int i_201_, int i_202_, int i_203_, int i_204_, int i_205_, boolean[][] bools) {
		if (anInt9419 > 0) {
			Interface41 interface41 = aClass167_Sub3_9421.method8737(anInt9401);
			int i_206_ = 0;
			int i_207_ = 32767;
			int i_208_ = -32768;
			ByteBuffer bytebuffer = aClass167_Sub3_9421.aByteBuffer9549;
			bytebuffer.clear();
			for (int i_209_ = i_203_; i_209_ < i_205_; i_209_++) {
				int i_210_ = i_209_ * (anInt1766 * 1718142487) + i_202_;
				for (int i_211_ = i_202_; i_211_ < i_204_; i_211_++) {
					if (bools[i_211_ - i_202_][i_209_ - i_203_]) {
						short[] is = aShortArrayArray9402[i_210_];
						if (is != null) {
							for (int i_212_ = 0; i_212_ < is.length; i_212_++) {
								int i_213_ = is[i_212_] & 0xffff;
								if (i_213_ > i_208_)
									i_208_ = i_213_;
								if (i_213_ < i_207_)
									i_207_ = i_213_;
								bytebuffer.putShort((short) i_213_);
								i_206_++;
							}
						}
					}
					i_210_++;
				}
			}
			interface41.method264(0, bytebuffer.position(), aClass167_Sub3_9421.aLong9586);
			if (i_206_ > 0) {
				aClass167_Sub3_9421.method8818();
				Class327 class327 = aClass167_Sub3_9421.aClass327_9541;
				aClass167_Sub3_9421.method8808(0, anInterface38_9416);
				aClass167_Sub3_9421.method8808(1, anInterface38_9428);
				aClass167_Sub3_9421.method8807(aClass343_9418);
				aClass167_Sub3_9421.method8809(interface41);
				aClass167_Sub3_9421.method2099(Class433.aClass433_4836);
				float f = (float) aClass167_Sub3_9421.method2278((byte) 45).method2725();
				float f_214_ = (float) aClass167_Sub3_9421.method2278((byte) 92).method2726();
				Class433 class433 = new Class433();
				Class433 class433_215_ = new Class433();
				class433.method5228(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F);
				class433_215_.method5197((float) i_201_ / (256.0F * (float) (anInt1767 * -1504778739)), (float) -i_201_ / (256.0F * (float) (anInt1767 * -1504778739)), 1.0F / (aFloat9431 - aFloat9403));
				class433_215_.method5200((float) i - (float) (i_202_ * i_201_) / 256.0F, (float) i_200_ + (float) (i_205_ * i_201_) / 256.0F, -aFloat9403 / (aFloat9431 - aFloat9403));
				class433_215_.method5202(2.0F / f, 2.0F / f_214_, 1.0F);
				class433_215_.method5200(-1.0F, -1.0F, 0.0F);
				aClass167_Sub3_9421.aClass433_9543.method5213(class433, class433_215_);
				aClass167_Sub3_9421.aClass443_9570.method5359(aClass167_Sub3_9421.aClass433_9543);
				aClass167_Sub3_9421.method2390(aClass167_Sub3_9421.aClass443_9570);
				class327.method4284(Class443.aClass443_4879);
				class327.aClass427_3577.method5131(0.0F, 0.0F, 0.0F, 0.0F);
				class327.aClass436_3585.method5243(0.0F, 0.0F, 0.0F);
				class327.aClass427_3575.method5131(0.0F, 0.0F, 0.0F, 0.0F);
				class327.aClass436_3573.method5243(0.0F, 0.0F, 0.0F);
				class327.anInterface36_3569 = aClass167_Sub3_9421.anInterface36_9691;
				class327.aClass443_3571.method5338();
				class327.anInt3584 = i_207_;
				class327.anInt3574 = i_208_ - i_207_ + 1;
				class327.anInt3586 = 0;
				class327.anInt3587 = i_206_ / 3;
				if (aClass167_Sub3_9421.aBool9611) {
					aClass167_Sub3_9421.method2302(false);
					class327.method4285(false);
					aClass167_Sub3_9421.method2302(true);
				} else
					class327.method4285(false);
			}
		}
	}

	void method8662() {
		if ((anInt9398 & 0x2) == 0) {
			anIntArrayArrayArray9414 = null;
			anIntArrayArrayArray9409 = null;
			anIntArrayArrayArray9417 = null;
		}
		anIntArrayArrayArray9411 = null;
		anIntArrayArrayArray9407 = null;
		anIntArrayArrayArray9410 = null;
		aClass536_Sub10ArrayArrayArray9420 = null;
		aByteArrayArray9423 = null;
		aClass4_9425 = null;
		aClass536Array9426 = null;
		aFloatArrayArray9424 = null;
		aFloatArrayArray9405 = null;
		aFloatArrayArray9422 = null;
	}

	void method8663() {
		anInterface38_9428 = aClass167_Sub3_9421.method8805(false);
		anInterface38_9428.method271(anInt9400 * 4, 4);
		anInterface38_9428.method264(0, anInt9400 * 4, aClass167_Sub3_9421.method8772(aByteBuffer9433));
		anInterface38_9416 = aClass167_Sub3_9421.method8805(false);
		anInterface38_9416.method271(anInt9400 * anInt9430, anInt9430);
		anInterface38_9416.method264(0, anInt9400 * anInt9430, aClass167_Sub3_9421.method8772(aByteBuffer9429));
		aByteBuffer9433.clear();
		aByteBuffer9433 = null;
		aByteBuffer9429.clear();
		aByteBuffer9429 = null;
		if ((anInt9399 & 0x7) != 0) {
			if (anIntArrayArrayArray9411 != null)
				aClass343_9418 = (aClass167_Sub3_9421.method8806(new Class362[] { new Class362(new Class355[] { Class355.aClass355_3763, Class355.aClass355_3761, Class355.aClass355_3760, Class355.aClass355_3758 }), new Class362(Class355.aClass355_3759) }));
			else
				aClass343_9418 = (aClass167_Sub3_9421.method8806(new Class362[] { new Class362(new Class355[] { Class355.aClass355_3763, Class355.aClass355_3761, Class355.aClass355_3758 }), new Class362(Class355.aClass355_3759) }));
		} else if (anIntArrayArrayArray9411 != null)
			aClass343_9418 = (aClass167_Sub3_9421.method8806(new Class362[] { new Class362(new Class355[] { Class355.aClass355_3763, Class355.aClass355_3761, Class355.aClass355_3760 }), new Class362(Class355.aClass355_3759) }));
		else
			aClass343_9418 = (aClass167_Sub3_9421.method8806(new Class362[] { new Class362(new Class355[] { Class355.aClass355_3763, Class355.aClass355_3761 }), new Class362(Class355.aClass355_3759) }));
		for (int i = 0; i < anInt9427; i++) {
			Class536_Sub10 class536_sub10 = (Class536_Sub10) aClass536Array9426[i];
			class536_sub10.method9414(anInt9400);
		}
		if (aClass339_9413 != null)
			aClass339_9413.method4433();
		method8662();
	}

	public void method1919(int i, int i_216_, int[] is, int[] is_217_, int[] is_218_, int[] is_219_, int[] is_220_, int[] is_221_, int[] is_222_, int[] is_223_, int[] is_224_, int[] is_225_, int[] is_226_, Class175 class175, boolean bool) {
		int i_227_ = is_223_.length;
		int[] is_228_ = new int[i_227_ * 3];
		int[] is_229_ = new int[i_227_ * 3];
		int[] is_230_ = new int[i_227_ * 3];
		int[] is_231_ = new int[i_227_ * 3];
		int[] is_232_ = new int[i_227_ * 3];
		int[] is_233_ = new int[i_227_ * 3];
		int[] is_234_ = is_217_ != null ? new int[i_227_ * 3] : null;
		int[] is_235_ = is_219_ != null ? new int[i_227_ * 3] : null;
		int i_236_ = 0;
		for (int i_237_ = 0; i_237_ < i_227_; i_237_++) {
			int i_238_ = is_220_[i_237_];
			int i_239_ = is_221_[i_237_];
			int i_240_ = is_222_[i_237_];
			is_228_[i_236_] = is[i_238_];
			is_229_[i_236_] = is_218_[i_238_];
			is_230_[i_236_] = is_223_[i_237_];
			is_232_[i_236_] = is_225_[i_237_];
			is_233_[i_236_] = is_226_[i_237_];
			is_231_[i_236_] = is_224_ != null ? is_224_[i_237_] : is_223_[i_237_];
			if (is_217_ != null)
				is_234_[i_236_] = is_217_[i_238_];
			if (is_219_ != null)
				is_235_[i_236_] = is_219_[i_238_];
			i_236_++;
			is_228_[i_236_] = is[i_239_];
			is_229_[i_236_] = is_218_[i_239_];
			is_230_[i_236_] = is_223_[i_237_];
			is_232_[i_236_] = is_225_[i_237_];
			is_233_[i_236_] = is_226_[i_237_];
			is_231_[i_236_] = is_224_ != null ? is_224_[i_237_] : is_223_[i_237_];
			if (is_217_ != null)
				is_234_[i_236_] = is_217_[i_239_];
			if (is_219_ != null)
				is_235_[i_236_] = is_219_[i_239_];
			i_236_++;
			is_228_[i_236_] = is[i_240_];
			is_229_[i_236_] = is_218_[i_240_];
			is_230_[i_236_] = is_223_[i_237_];
			is_232_[i_236_] = is_225_[i_237_];
			is_233_[i_236_] = is_226_[i_237_];
			is_231_[i_236_] = is_224_ != null ? is_224_[i_237_] : is_223_[i_237_];
			if (is_217_ != null)
				is_234_[i_236_] = is_217_[i_240_];
			if (is_219_ != null)
				is_235_[i_236_] = is_219_[i_240_];
			i_236_++;
		}
		method1920(i, i_216_, is_228_, is_234_, is_229_, is_235_, is_230_, is_231_, is_232_, is_233_, class175, bool);
	}

	public void method1956(int i, int i_241_, int i_242_) {
		i = Math.min(aByteArrayArray9423.length - 1, Math.max(0, i));
		i_241_ = Math.min(aByteArrayArray9423[i].length - 1, Math.max(0, i_241_));
		if ((aByteArrayArray9423[i][i_241_] & 0xff) < i_242_)
			aByteArrayArray9423[i][i_241_] = (byte) i_242_;
	}

	public void method1935(int i, int i_243_, int[] is, int[] is_244_, int[] is_245_, int[] is_246_, int[] is_247_, int[] is_248_, int[] is_249_, int[] is_250_, Class175 class175, boolean bool) {
		Class174 class174 = aClass167_Sub3_9421.aClass174_1852;
		if (is_246_ != null && anIntArrayArrayArray9411 == null)
			anIntArrayArrayArray9411 = new int[anInt1766 * 1718142487][anInt1769 * -889224915][];
		if (is_244_ != null && anIntArrayArrayArray9410 == null)
			anIntArrayArrayArray9410 = new int[anInt1766 * 1718142487][anInt1769 * -889224915][];
		anIntArrayArrayArray9409[i][i_243_] = is;
		anIntArrayArrayArray9414[i][i_243_] = is_245_;
		anIntArrayArrayArray9417[i][i_243_] = is_247_;
		anIntArrayArrayArray9407[i][i_243_] = is_248_;
		if (anIntArrayArrayArray9411 != null)
			anIntArrayArrayArray9411[i][i_243_] = is_246_;
		if (anIntArrayArrayArray9410 != null)
			anIntArrayArrayArray9410[i][i_243_] = is_244_;
		Class536_Sub10[] class536_sub10s = (aClass536_Sub10ArrayArrayArray9420[i][i_243_] = new Class536_Sub10[is_247_.length]);
		for (int i_251_ = 0; i_251_ < is_247_.length; i_251_++) {
			int i_252_ = is_249_[i_251_];
			int i_253_ = is_250_[i_251_];
			if ((anInt9399 & 0x20) != 0 && i_252_ != -1 && class174.method2446(i_252_, -945064425).aBool1820) {
				i_253_ = 128;
				i_252_ = -1;
			}
			long l = ((long) (class175.anInt1930 * 1487365757) << 48 | (long) (class175.anInt1934 * 71478565) << 42 | (long) (class175.anInt1932 * 432289019) << 28 | (long) (i_253_ << 14) | (long) i_252_);
			Class536 class536;
			for (class536 = aClass4_9425.method556(l); class536 != null; class536 = aClass4_9425.method557(-781709643)) {
				Class536_Sub10 class536_sub10 = (Class536_Sub10) class536;
				if (class536_sub10.anInt10436 == i_252_ && class536_sub10.aFloat10437 == (float) i_253_ && class536_sub10.aClass175_10438.method2450(class175, (byte) 113))
					break;
			}
			if (class536 == null) {
				class536_sub10s[i_251_] = new Class536_Sub10(this, i_252_, i_253_, class175);
				aClass4_9425.method560(class536_sub10s[i_251_], l);
			} else
				class536_sub10s[i_251_] = (Class536_Sub10) class536;
		}
		if (bool)
			aByteArrayArray9412[i][i_243_] |= 0x1;
		if (is_247_.length > anInt9396)
			anInt9396 = is_247_.length;
		anInt9419 += is_247_.length;
	}

	public void method1936(int i, int i_254_, int[] is, int[] is_255_, int[] is_256_, int[] is_257_, int[] is_258_, int[] is_259_, int[] is_260_, int[] is_261_, Class175 class175, boolean bool) {
		Class174 class174 = aClass167_Sub3_9421.aClass174_1852;
		if (is_257_ != null && anIntArrayArrayArray9411 == null)
			anIntArrayArrayArray9411 = new int[anInt1766 * 1718142487][anInt1769 * -889224915][];
		if (is_255_ != null && anIntArrayArrayArray9410 == null)
			anIntArrayArrayArray9410 = new int[anInt1766 * 1718142487][anInt1769 * -889224915][];
		anIntArrayArrayArray9409[i][i_254_] = is;
		anIntArrayArrayArray9414[i][i_254_] = is_256_;
		anIntArrayArrayArray9417[i][i_254_] = is_258_;
		anIntArrayArrayArray9407[i][i_254_] = is_259_;
		if (anIntArrayArrayArray9411 != null)
			anIntArrayArrayArray9411[i][i_254_] = is_257_;
		if (anIntArrayArrayArray9410 != null)
			anIntArrayArrayArray9410[i][i_254_] = is_255_;
		Class536_Sub10[] class536_sub10s = (aClass536_Sub10ArrayArrayArray9420[i][i_254_] = new Class536_Sub10[is_258_.length]);
		for (int i_262_ = 0; i_262_ < is_258_.length; i_262_++) {
			int i_263_ = is_260_[i_262_];
			int i_264_ = is_261_[i_262_];
			if ((anInt9399 & 0x20) != 0 && i_263_ != -1 && class174.method2446(i_263_, -314130882).aBool1820) {
				i_264_ = 128;
				i_263_ = -1;
			}
			long l = ((long) (class175.anInt1930 * 1487365757) << 48 | (long) (class175.anInt1934 * 71478565) << 42 | (long) (class175.anInt1932 * 432289019) << 28 | (long) (i_264_ << 14) | (long) i_263_);
			Class536 class536;
			for (class536 = aClass4_9425.method556(l); class536 != null; class536 = aClass4_9425.method557(-1354763456)) {
				Class536_Sub10 class536_sub10 = (Class536_Sub10) class536;
				if (class536_sub10.anInt10436 == i_263_ && class536_sub10.aFloat10437 == (float) i_264_ && class536_sub10.aClass175_10438.method2450(class175, (byte) 127))
					break;
			}
			if (class536 == null) {
				class536_sub10s[i_262_] = new Class536_Sub10(this, i_263_, i_264_, class175);
				aClass4_9425.method560(class536_sub10s[i_262_], l);
			} else
				class536_sub10s[i_262_] = (Class536_Sub10) class536;
		}
		if (bool)
			aByteArrayArray9412[i][i_254_] |= 0x1;
		if (is_258_.length > anInt9396)
			anInt9396 = is_258_.length;
		anInt9419 += is_258_.length;
	}

	public void method1937() {
		if (anInt9419 <= 0) {
			aClass339_9413 = null;
			method8662();
		} else {
			byte[][] is = (new byte[anInt1766 * 1718142487 + 1][anInt1769 * -889224915 + 1]);
			for (int i = 1; i < anInt1766 * 1718142487; i++) {
				for (int i_265_ = 1; i_265_ < anInt1769 * -889224915; i_265_++)
					is[i][i_265_] = (byte) ((aByteArrayArray9423[i - 1][i_265_] >> 2) + (aByteArrayArray9423[i + 1][i_265_] >> 3) + (aByteArrayArray9423[i][i_265_ - 1] >> 2) + (aByteArrayArray9423[i][i_265_ + 1] >> 3) + (aByteArrayArray9423[i][i_265_] >> 1));
			}
			aClass536Array9426 = new Class536[aClass4_9425.method569(1695810847)];
			aClass4_9425.method558(aClass536Array9426, 298042934);
			for (int i = 0; i < aClass536Array9426.length; i++)
				((Class536_Sub10) aClass536Array9426[i]).method9419(anInt9419);
			anInt9430 = 20;
			if (anIntArrayArrayArray9411 != null)
				anInt9430 += 4;
			if ((anInt9399 & 0x7) != 0)
				anInt9430 += 12;
			aByteBuffer9433 = aClass167_Sub3_9421.method8858(anInt9419 * 4);
			aByteBuffer9429 = aClass167_Sub3_9421.method8858(anInt9419 * anInt9430);
			Class536_Sub10[] class536_sub10s = new Class536_Sub10[anInt9419];
			int i = Class72.method1124(anInt9419 / 4, 1194029570);
			if (i < 1)
				i = 1;
			Class4 class4 = new Class4(i);
			Class536_Sub10[] class536_sub10s_266_ = new Class536_Sub10[anInt9396];
			for (int i_267_ = 0; i_267_ < anInt1766 * 1718142487; i_267_++) {
				for (int i_268_ = 0; i_268_ < anInt1769 * -889224915; i_268_++)
					method8661(i_267_, i_268_, is, class536_sub10s_266_, class4, class536_sub10s);
			}
			for (int i_269_ = 0; i_269_ < anInt9400; i_269_++) {
				Class536_Sub10 class536_sub10 = class536_sub10s[i_269_];
				if (class536_sub10 != null)
					class536_sub10.method9411(i_269_);
			}
			for (int i_270_ = 0; i_270_ < anInt1766 * 1718142487; i_270_++) {
				for (int i_271_ = 0; i_271_ < anInt1769 * -889224915; i_271_++) {
					short[] is_272_ = (aShortArrayArray9402[i_271_ * (anInt1766 * 1718142487) + i_270_]);
					if (is_272_ != null) {
						int i_273_ = 0;
						int i_274_ = 0;
						while (i_274_ < is_272_.length) {
							int i_275_ = is_272_[i_274_++] & 0xffff;
							int i_276_ = is_272_[i_274_++] & 0xffff;
							int i_277_ = is_272_[i_274_++] & 0xffff;
							Class536_Sub10 class536_sub10 = class536_sub10s[i_275_];
							Class536_Sub10 class536_sub10_278_ = class536_sub10s[i_276_];
							Class536_Sub10 class536_sub10_279_ = class536_sub10s[i_277_];
							Class536_Sub10 class536_sub10_280_ = null;
							if (class536_sub10 != null) {
								class536_sub10.method9412(i_270_, i_271_, i_273_);
								class536_sub10_280_ = class536_sub10;
							}
							if (class536_sub10_278_ != null) {
								class536_sub10_278_.method9412(i_270_, i_271_, i_273_);
								if (class536_sub10_280_ == null || ((class536_sub10_278_.aLong7133 * -6909195213925454795L) < (class536_sub10_280_.aLong7133 * -6909195213925454795L)))
									class536_sub10_280_ = class536_sub10_278_;
							}
							if (class536_sub10_279_ != null) {
								class536_sub10_279_.method9412(i_270_, i_271_, i_273_);
								if (class536_sub10_280_ == null || ((class536_sub10_279_.aLong7133 * -6909195213925454795L) < (class536_sub10_280_.aLong7133 * -6909195213925454795L)))
									class536_sub10_280_ = class536_sub10_279_;
							}
							if (class536_sub10_280_ != null) {
								if (class536_sub10 != null)
									class536_sub10_280_.method9411(i_275_);
								if (class536_sub10_278_ != null)
									class536_sub10_280_.method9411(i_276_);
								if (class536_sub10_279_ != null)
									class536_sub10_280_.method9411(i_277_);
								class536_sub10_280_.method9412(i_270_, i_271_, i_273_);
							}
							i_273_++;
						}
					}
				}
			}
			anInt9427 = 0;
			for (int i_281_ = 0; i_281_ < aClass536Array9426.length; i_281_++) {
				Class536_Sub10 class536_sub10 = (Class536_Sub10) aClass536Array9426[i_281_];
				if (class536_sub10.anInt10446 > 0)
					aClass536Array9426[anInt9427++] = class536_sub10;
			}
			aClass536Array9415 = new Class536[anInt9427];
			long[] ls = new long[anInt9427];
			for (int i_282_ = 0; i_282_ < anInt9427; i_282_++) {
				Class536_Sub10 class536_sub10 = (Class536_Sub10) aClass536Array9426[i_282_];
				ls[i_282_] = class536_sub10.aLong7133 * -6909195213925454795L;
				aClass536Array9415[i_282_] = class536_sub10;
			}
			Class507.method6172(ls, aClass536Array9415, 615712527);
			method8663();
		}
	}

	Class160_Sub2(Class167_Sub3 class167_sub3, int i, int i_283_, int i_284_, int i_285_, int[][] is, int[][] is_286_, int i_287_) {
		super(i_284_, i_285_, i_287_, is);
		anIntArray9406 = new int[1];
		anIntArray9432 = new int[1];
		anIntArray9408 = new int[1];
		aClass167_Sub3_9421 = class167_sub3;
		anInt9395 = anInt1768 * 2064238369 - 2;
		anInt9397 = 1 << anInt9395;
		anInt9398 = i;
		anInt9399 = i_283_;
		anIntArrayArrayArray9410 = new int[i_284_][i_285_][];
		aClass536_Sub10ArrayArrayArray9420 = new Class536_Sub10[i_284_][i_285_][];
		anIntArrayArrayArray9409 = new int[i_284_][i_285_][];
		anIntArrayArrayArray9414 = new int[i_284_][i_285_][];
		anIntArrayArrayArray9417 = new int[i_284_][i_285_][];
		anIntArrayArrayArray9407 = new int[i_284_][i_285_][];
		aShortArrayArray9402 = new short[i_284_ * i_285_][];
		aByteArrayArray9412 = new byte[i_284_][i_285_];
		aByteArrayArray9423 = new byte[i_284_ + 1][i_285_ + 1];
		aFloatArrayArray9422 = (new float[anInt1766 * 1718142487 + 1][anInt1769 * -889224915 + 1]);
		aFloatArrayArray9405 = (new float[anInt1766 * 1718142487 + 1][anInt1769 * -889224915 + 1]);
		aFloatArrayArray9424 = (new float[anInt1766 * 1718142487 + 1][anInt1769 * -889224915 + 1]);
		for (int i_288_ = 0; i_288_ <= anInt1769 * -889224915; i_288_++) {
			for (int i_289_ = 0; i_289_ <= anInt1766 * 1718142487; i_289_++) {
				int i_290_ = anIntArrayArray1765[i_289_][i_288_];
				if ((float) i_290_ < aFloat9403)
					aFloat9403 = (float) i_290_;
				if ((float) i_290_ > aFloat9431)
					aFloat9431 = (float) i_290_;
				if (i_289_ > 0 && i_288_ > 0 && i_289_ < anInt1766 * 1718142487 && i_288_ < anInt1769 * -889224915) {
					int i_291_ = (is_286_[i_289_ + 1][i_288_] - is_286_[i_289_ - 1][i_288_]);
					int i_292_ = (is_286_[i_289_][i_288_ + 1] - is_286_[i_289_][i_288_ - 1]);
					float f = (float) (1.0 / Math.sqrt((double) (i_291_ * i_291_ + 4 * i_287_ * i_287_ + i_292_ * i_292_)));
					aFloatArrayArray9422[i_289_][i_288_] = (float) i_291_ * f;
					aFloatArrayArray9405[i_289_][i_288_] = (float) (-i_287_ * 2) * f;
					aFloatArrayArray9424[i_289_][i_288_] = (float) i_292_ * f;
				}
			}
		}
		aFloat9403--;
		aFloat9431++;
		aClass4_9425 = new Class4(128);
		if ((anInt9399 & 0x10) != 0)
			aClass339_9413 = new Class339(aClass167_Sub3_9421, this);
	}

	public void method1932(Class536_Sub18_Sub7 class536_sub18_sub7, int i, int i_293_, int i_294_, int i_295_, boolean bool) {
		if (aClass339_9413 != null && class536_sub18_sub7 != null) {
			int i_296_ = (i - (i_293_ * aClass167_Sub3_9421.anInt9634 >> 8) >> aClass167_Sub3_9421.anInt9633);
			int i_297_ = (i_294_ - (i_293_ * aClass167_Sub3_9421.anInt9635 >> 8) >> aClass167_Sub3_9421.anInt9633);
			aClass339_9413.method4443(class536_sub18_sub7, i_296_, i_297_);
		}
	}

	public void method1940(int i, int i_298_, int i_299_, int i_300_, int i_301_, int i_302_, int i_303_, boolean[][] bools) {
		if (anInt9419 > 0) {
			Interface41 interface41 = aClass167_Sub3_9421.method8737(anInt9401);
			int i_304_ = 0;
			int i_305_ = 32767;
			int i_306_ = -32768;
			ByteBuffer bytebuffer = aClass167_Sub3_9421.aByteBuffer9549;
			bytebuffer.clear();
			for (int i_307_ = i_301_; i_307_ < i_303_; i_307_++) {
				int i_308_ = i_307_ * (anInt1766 * 1718142487) + i_300_;
				for (int i_309_ = i_300_; i_309_ < i_302_; i_309_++) {
					if (bools[i_309_ - i_300_][i_307_ - i_301_]) {
						short[] is = aShortArrayArray9402[i_308_];
						if (is != null) {
							for (int i_310_ = 0; i_310_ < is.length; i_310_++) {
								int i_311_ = is[i_310_] & 0xffff;
								if (i_311_ > i_306_)
									i_306_ = i_311_;
								if (i_311_ < i_305_)
									i_305_ = i_311_;
								bytebuffer.putShort((short) i_311_);
								i_304_++;
							}
						}
					}
					i_308_++;
				}
			}
			interface41.method264(0, bytebuffer.position(), aClass167_Sub3_9421.aLong9586);
			if (i_304_ > 0) {
				aClass167_Sub3_9421.method8818();
				Class327 class327 = aClass167_Sub3_9421.aClass327_9541;
				aClass167_Sub3_9421.method8808(0, anInterface38_9416);
				aClass167_Sub3_9421.method8808(1, anInterface38_9428);
				aClass167_Sub3_9421.method8807(aClass343_9418);
				aClass167_Sub3_9421.method8809(interface41);
				aClass167_Sub3_9421.method2099(Class433.aClass433_4836);
				float f = (float) aClass167_Sub3_9421.method2278((byte) 57).method2725();
				float f_312_ = (float) aClass167_Sub3_9421.method2278((byte) 16).method2726();
				Class433 class433 = new Class433();
				Class433 class433_313_ = new Class433();
				class433.method5228(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F);
				class433_313_.method5197((float) i_299_ / (256.0F * (float) (anInt1767 * -1504778739)), (float) -i_299_ / (256.0F * (float) (anInt1767 * -1504778739)), 1.0F / (aFloat9431 - aFloat9403));
				class433_313_.method5200((float) i - (float) (i_300_ * i_299_) / 256.0F, (float) i_298_ + (float) (i_303_ * i_299_) / 256.0F, -aFloat9403 / (aFloat9431 - aFloat9403));
				class433_313_.method5202(2.0F / f, 2.0F / f_312_, 1.0F);
				class433_313_.method5200(-1.0F, -1.0F, 0.0F);
				aClass167_Sub3_9421.aClass433_9543.method5213(class433, class433_313_);
				aClass167_Sub3_9421.aClass443_9570.method5359(aClass167_Sub3_9421.aClass433_9543);
				aClass167_Sub3_9421.method2390(aClass167_Sub3_9421.aClass443_9570);
				class327.method4284(Class443.aClass443_4879);
				class327.aClass427_3577.method5131(0.0F, 0.0F, 0.0F, 0.0F);
				class327.aClass436_3585.method5243(0.0F, 0.0F, 0.0F);
				class327.aClass427_3575.method5131(0.0F, 0.0F, 0.0F, 0.0F);
				class327.aClass436_3573.method5243(0.0F, 0.0F, 0.0F);
				class327.anInterface36_3569 = aClass167_Sub3_9421.anInterface36_9691;
				class327.aClass443_3571.method5338();
				class327.anInt3584 = i_305_;
				class327.anInt3574 = i_306_ - i_305_ + 1;
				class327.anInt3586 = 0;
				class327.anInt3587 = i_304_ / 3;
				if (aClass167_Sub3_9421.aBool9611) {
					aClass167_Sub3_9421.method2302(false);
					class327.method4285(false);
					aClass167_Sub3_9421.method2302(true);
				} else
					class327.method4285(false);
			}
		}
	}

	public Class536_Sub18_Sub7 method1941(int i, int i_314_, Class536_Sub18_Sub7 class536_sub18_sub7) {
		if ((aByteArrayArray9412[i][i_314_] & 0x1) == 0)
			return null;
		int i_315_ = anInt1767 * -1504778739 >> aClass167_Sub3_9421.anInt9633;
		Class536_Sub18_Sub7_Sub1 class536_sub18_sub7_sub1 = (Class536_Sub18_Sub7_Sub1) class536_sub18_sub7;
		Class536_Sub18_Sub7_Sub1 class536_sub18_sub7_sub1_316_;
		if (class536_sub18_sub7_sub1 != null && class536_sub18_sub7_sub1.method10972(i_315_, i_315_)) {
			class536_sub18_sub7_sub1_316_ = class536_sub18_sub7_sub1;
			class536_sub18_sub7_sub1_316_.method10980();
		} else
			class536_sub18_sub7_sub1_316_ = new Class536_Sub18_Sub7_Sub1(aClass167_Sub3_9421, i_315_, i_315_);
		class536_sub18_sub7_sub1_316_.method10973(0, 0, i_315_, i_315_);
		method8664(class536_sub18_sub7_sub1_316_, i, i_314_);
		return class536_sub18_sub7_sub1_316_;
	}

	public void method1955(Class536_Sub18_Sub7 class536_sub18_sub7, int i, int i_317_, int i_318_, int i_319_, boolean bool) {
		if (aClass339_9413 != null && class536_sub18_sub7 != null) {
			int i_320_ = (i - (i_317_ * aClass167_Sub3_9421.anInt9634 >> 8) >> aClass167_Sub3_9421.anInt9633);
			int i_321_ = (i_318_ - (i_317_ * aClass167_Sub3_9421.anInt9635 >> 8) >> aClass167_Sub3_9421.anInt9633);
			aClass339_9413.method4434(class536_sub18_sub7, i_320_, i_321_);
		}
	}

	public void method1942(Class536_Sub18_Sub7 class536_sub18_sub7, int i, int i_322_, int i_323_, int i_324_, boolean bool) {
		if (aClass339_9413 != null && class536_sub18_sub7 != null) {
			int i_325_ = (i - (i_322_ * aClass167_Sub3_9421.anInt9634 >> 8) >> aClass167_Sub3_9421.anInt9633);
			int i_326_ = (i_323_ - (i_322_ * aClass167_Sub3_9421.anInt9635 >> 8) >> aClass167_Sub3_9421.anInt9633);
			aClass339_9413.method4434(class536_sub18_sub7, i_325_, i_326_);
		}
	}

	void method8664(Class536_Sub18_Sub7_Sub1 class536_sub18_sub7_sub1, int i, int i_327_) {
		int[] is = anIntArrayArrayArray9409[i][i_327_];
		int[] is_328_ = anIntArrayArrayArray9414[i][i_327_];
		int i_329_ = is.length;
		if (anIntArray9406.length < i_329_) {
			anIntArray9406 = new int[i_329_];
			anIntArray9432 = new int[i_329_];
		}
		for (int i_330_ = 0; i_330_ < i_329_; i_330_++) {
			anIntArray9406[i_330_] = is[i_330_] >> aClass167_Sub3_9421.anInt9633;
			anIntArray9432[i_330_] = is_328_[i_330_] >> aClass167_Sub3_9421.anInt9633;
		}
		int i_331_ = 0;
		while (i_331_ < i_329_) {
			int i_332_ = anIntArray9406[i_331_];
			int i_333_ = anIntArray9432[i_331_++];
			int i_334_ = anIntArray9406[i_331_];
			int i_335_ = anIntArray9432[i_331_++];
			int i_336_ = anIntArray9406[i_331_];
			int i_337_ = anIntArray9432[i_331_++];
			if (((i_332_ - i_334_) * (i_335_ - i_337_) - (i_335_ - i_333_) * (i_336_ - i_334_)) > 0)
				class536_sub18_sub7_sub1.method10975(i_333_, i_335_, i_337_, i_332_, i_334_, i_336_);
		}
	}

	public boolean method1944(Class536_Sub18_Sub7 class536_sub18_sub7, int i, int i_338_, int i_339_, int i_340_, boolean bool) {
		if (aClass339_9413 == null || class536_sub18_sub7 == null)
			return false;
		int i_341_ = (i - (i_338_ * aClass167_Sub3_9421.anInt9634 >> 8) >> aClass167_Sub3_9421.anInt9633);
		int i_342_ = (i_339_ - (i_338_ * aClass167_Sub3_9421.anInt9635 >> 8) >> aClass167_Sub3_9421.anInt9633);
		return aClass339_9413.method4436(class536_sub18_sub7, i_341_, i_342_);
	}

	public void method1939(int i, int i_343_, int i_344_, int i_345_, int i_346_, int i_347_, int i_348_, boolean[][] bools) {
		if (anInt9419 > 0) {
			Interface41 interface41 = aClass167_Sub3_9421.method8737(anInt9401);
			int i_349_ = 0;
			int i_350_ = 32767;
			int i_351_ = -32768;
			ByteBuffer bytebuffer = aClass167_Sub3_9421.aByteBuffer9549;
			bytebuffer.clear();
			for (int i_352_ = i_346_; i_352_ < i_348_; i_352_++) {
				int i_353_ = i_352_ * (anInt1766 * 1718142487) + i_345_;
				for (int i_354_ = i_345_; i_354_ < i_347_; i_354_++) {
					if (bools[i_354_ - i_345_][i_352_ - i_346_]) {
						short[] is = aShortArrayArray9402[i_353_];
						if (is != null) {
							for (int i_355_ = 0; i_355_ < is.length; i_355_++) {
								int i_356_ = is[i_355_] & 0xffff;
								if (i_356_ > i_351_)
									i_351_ = i_356_;
								if (i_356_ < i_350_)
									i_350_ = i_356_;
								bytebuffer.putShort((short) i_356_);
								i_349_++;
							}
						}
					}
					i_353_++;
				}
			}
			interface41.method264(0, bytebuffer.position(), aClass167_Sub3_9421.aLong9586);
			if (i_349_ > 0) {
				aClass167_Sub3_9421.method8818();
				Class327 class327 = aClass167_Sub3_9421.aClass327_9541;
				aClass167_Sub3_9421.method8808(0, anInterface38_9416);
				aClass167_Sub3_9421.method8808(1, anInterface38_9428);
				aClass167_Sub3_9421.method8807(aClass343_9418);
				aClass167_Sub3_9421.method8809(interface41);
				aClass167_Sub3_9421.method2099(Class433.aClass433_4836);
				float f = (float) aClass167_Sub3_9421.method2278((byte) -31).method2725();
				float f_357_ = (float) aClass167_Sub3_9421.method2278((byte) -19).method2726();
				Class433 class433 = new Class433();
				Class433 class433_358_ = new Class433();
				class433.method5228(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F);
				class433_358_.method5197((float) i_344_ / (256.0F * (float) (anInt1767 * -1504778739)), (float) -i_344_ / (256.0F * (float) (anInt1767 * -1504778739)), 1.0F / (aFloat9431 - aFloat9403));
				class433_358_.method5200((float) i - (float) (i_345_ * i_344_) / 256.0F, (float) i_343_ + (float) (i_348_ * i_344_) / 256.0F, -aFloat9403 / (aFloat9431 - aFloat9403));
				class433_358_.method5202(2.0F / f, 2.0F / f_357_, 1.0F);
				class433_358_.method5200(-1.0F, -1.0F, 0.0F);
				aClass167_Sub3_9421.aClass433_9543.method5213(class433, class433_358_);
				aClass167_Sub3_9421.aClass443_9570.method5359(aClass167_Sub3_9421.aClass433_9543);
				aClass167_Sub3_9421.method2390(aClass167_Sub3_9421.aClass443_9570);
				class327.method4284(Class443.aClass443_4879);
				class327.aClass427_3577.method5131(0.0F, 0.0F, 0.0F, 0.0F);
				class327.aClass436_3585.method5243(0.0F, 0.0F, 0.0F);
				class327.aClass427_3575.method5131(0.0F, 0.0F, 0.0F, 0.0F);
				class327.aClass436_3573.method5243(0.0F, 0.0F, 0.0F);
				class327.anInterface36_3569 = aClass167_Sub3_9421.anInterface36_9691;
				class327.aClass443_3571.method5338();
				class327.anInt3584 = i_350_;
				class327.anInt3574 = i_351_ - i_350_ + 1;
				class327.anInt3586 = 0;
				class327.anInt3587 = i_349_ / 3;
				if (aClass167_Sub3_9421.aBool9611) {
					aClass167_Sub3_9421.method2302(false);
					class327.method4285(false);
					aClass167_Sub3_9421.method2302(true);
				} else
					class327.method4285(false);
			}
		}
	}

	public boolean method1946(Class536_Sub18_Sub7 class536_sub18_sub7, int i, int i_359_, int i_360_, int i_361_, boolean bool) {
		if (aClass339_9413 == null || class536_sub18_sub7 == null)
			return false;
		int i_362_ = (i - (i_359_ * aClass167_Sub3_9421.anInt9634 >> 8) >> aClass167_Sub3_9421.anInt9633);
		int i_363_ = (i_360_ - (i_359_ * aClass167_Sub3_9421.anInt9635 >> 8) >> aClass167_Sub3_9421.anInt9633);
		return aClass339_9413.method4436(class536_sub18_sub7, i_362_, i_363_);
	}

	public boolean method1947(Class536_Sub18_Sub7 class536_sub18_sub7, int i, int i_364_, int i_365_, int i_366_, boolean bool) {
		if (aClass339_9413 == null || class536_sub18_sub7 == null)
			return false;
		int i_367_ = (i - (i_364_ * aClass167_Sub3_9421.anInt9634 >> 8) >> aClass167_Sub3_9421.anInt9633);
		int i_368_ = (i_365_ - (i_364_ * aClass167_Sub3_9421.anInt9635 >> 8) >> aClass167_Sub3_9421.anInt9633);
		return aClass339_9413.method4436(class536_sub18_sub7, i_367_, i_368_);
	}

	public void method1950(Class536_Sub19 class536_sub19, int[] is) {
		aClass708_9434.method8335(new Class536_Sub4(aClass167_Sub3_9421, this, class536_sub19, is), 446845863);
	}

	public void method1933(Class536_Sub19 class536_sub19, int[] is) {
		aClass708_9434.method8335(new Class536_Sub4(aClass167_Sub3_9421, this, class536_sub19, is), -1080197876);
	}

	public void method1929(Class536_Sub18_Sub7 class536_sub18_sub7, int i, int i_369_, int i_370_, int i_371_, boolean bool) {
		if (aClass339_9413 != null && class536_sub18_sub7 != null) {
			int i_372_ = (i - (i_369_ * aClass167_Sub3_9421.anInt9634 >> 8) >> aClass167_Sub3_9421.anInt9633);
			int i_373_ = (i_370_ - (i_369_ * aClass167_Sub3_9421.anInt9635 >> 8) >> aClass167_Sub3_9421.anInt9633);
			aClass339_9413.method4434(class536_sub18_sub7, i_372_, i_373_);
		}
	}

	public void method1951(int i, int i_374_, int i_375_, boolean[][] bools, boolean bool, int i_376_) {
		if (aClass536Array9415 != null) {
			int i_377_ = i_375_ + i_375_ + 1;
			i_377_ *= i_377_;
			if (anIntArray9408.length < i_377_)
				anIntArray9408 = new int[i_377_];
			int i_378_ = i - i_375_;
			int i_379_ = i_378_;
			if (i_378_ < 0)
				i_378_ = 0;
			int i_380_ = i_374_ - i_375_;
			int i_381_ = i_380_;
			if (i_380_ < 0)
				i_380_ = 0;
			int i_382_ = i + i_375_;
			if (i_382_ > anInt1766 * 1718142487 - 1)
				i_382_ = anInt1766 * 1718142487 - 1;
			int i_383_ = i_374_ + i_375_;
			if (i_383_ > anInt1769 * -889224915 - 1)
				i_383_ = anInt1769 * -889224915 - 1;
			anInt9393 = 0;
			for (int i_384_ = i_378_; i_384_ <= i_382_; i_384_++) {
				boolean[] bools_385_ = bools[i_384_ - i_379_];
				for (int i_386_ = i_380_; i_386_ <= i_383_; i_386_++) {
					if (bools_385_[i_386_ - i_381_])
						anIntArray9408[anInt9393++] = i_386_ * (anInt1766 * 1718142487) + i_384_;
				}
			}
			ByteBuffer bytebuffer = aClass167_Sub3_9421.aByteBuffer9549;
			bytebuffer.clear();
			for (int i_387_ = 0; i_387_ < aClass536Array9415.length; i_387_++) {
				Class536_Sub10 class536_sub10 = (Class536_Sub10) aClass536Array9415[i_387_];
				class536_sub10.method9415(anIntArray9408, anInt9393);
			}
			int i_388_ = bytebuffer.position();
			Class327 class327 = aClass167_Sub3_9421.aClass327_9541;
			aClass167_Sub3_9421.method8818();
			if (aClass167_Sub3_9421.anInt9550 > 0) {
				class327.aClass436_3585.method5243(((float) (aClass167_Sub3_9421.anInt9672 >> 16 & 0xff) / 255.0F), ((float) (aClass167_Sub3_9421.anInt9672 >> 8 & 0xff) / 255.0F), ((float) (aClass167_Sub3_9421.anInt9672 >> 0 & 0xff) / 255.0F));
				class327.aClass427_3577.method5131(0.0F, 0.0F, 1.0F, -(aClass167_Sub3_9421.aFloat9675));
				class327.aClass427_3577.method5137(aClass167_Sub3_9421.aClass443_9565);
				class327.aClass427_3577.method5134(1.0F / (aClass167_Sub3_9421.aFloat9676 - aClass167_Sub3_9421.aFloat9675));
			} else {
				class327.aClass427_3577.method5131(0.0F, 0.0F, 0.0F, 0.0F);
				class327.aClass436_3585.method5243(0.0F, 0.0F, 0.0F);
			}
			if (i_388_ != 0) {
				Interface41 interface41 = aClass167_Sub3_9421.method8737(i_388_ / 2);
				interface41.method264(0, i_388_, aClass167_Sub3_9421.aLong9586);
				aClass167_Sub3_9421.method8808(0, anInterface38_9416);
				aClass167_Sub3_9421.method8809(interface41);
				class327.method4284(Class443.aClass443_4879);
				if ((anInt9399 & 0x7) == 0) {
					int i_389_ = 0;
					for (int i_390_ = 0; i_390_ < aClass536Array9415.length; i_390_++) {
						Class536_Sub10 class536_sub10 = (Class536_Sub10) aClass536Array9415[i_390_];
						if (class536_sub10.anInt10434 != 0) {
							if (aClass167_Sub3_9421.aBool9683) {
								aClass167_Sub3_9421.method2282(0, class536_sub10.aClass175_10438);
								class327.aClass427_3575.method5131(0.0F, 1.0F, 0.0F, ((float) aClass167_Sub3_9421.anInt9696 + ((float) ((class536_sub10.aClass175_10438.anInt1930) * 1487365757) / 255.0F * (float) ((class536_sub10.aClass175_10438.anInt1934) * 71478565))));
								class327.aClass427_3575.method5134(1.0F / (float) ((class536_sub10.aClass175_10438.anInt1934) * 71478565));
								class327.aClass436_3573.method5243((float) ((class536_sub10.aClass175_10438.anInt1932) * 432289019 >> 16 & 0xff) / 255.0F, (float) ((class536_sub10.aClass175_10438.anInt1932) * 432289019 >> 8 & 0xff) / 255.0F, (float) ((class536_sub10.aClass175_10438.anInt1932) * 432289019 >> 0 & 0xff) / 255.0F);
							} else {
								class327.aClass427_3575.method5131(0.0F, 0.0F, 0.0F, 0.0F);
								class327.aClass436_3573.method5243(0.0F, 0.0F, 0.0F);
							}
							boolean bool_391_ = false;
							if (class536_sub10.anInt10436 != -1) {
								Class164 class164 = (aClass167_Sub3_9421.aClass174_1852.method2446(class536_sub10.anInt10436, -726279970));
								class327.anInterface36_3569 = aClass167_Sub3_9421.aClass340_9561.method4456(class164);
								bool_391_ = !Class16_Sub1.method10359((class164.aByte1797), -921385230);
							} else
								class327.anInterface36_3569 = aClass167_Sub3_9421.anInterface36_9691;
							aClass167_Sub3_9421.method8808(1, class536_sub10.anInterface38_10439);
							aClass167_Sub3_9421.method8807(aClass343_9418);
							class327.aClass443_3571.method5344(1.0F / class536_sub10.aFloat10437, 1.0F / class536_sub10.aFloat10437, 1.0F, 1.0F);
							class327.anInt3584 = class536_sub10.anInt10441;
							class327.anInt3574 = (class536_sub10.anInt10444 - class536_sub10.anInt10441 + 1);
							class327.anInt3586 = i_389_;
							class327.anInt3587 = class536_sub10.anInt10434 / 3;
							class327.method4285(bool_391_);
							i_389_ += class536_sub10.anInt10434;
						}
					}
				} else {
					class327.aClass436_3583.method5243(aClass167_Sub3_9421.aFloatArray9542[0], aClass167_Sub3_9421.aFloatArray9542[1], aClass167_Sub3_9421.aFloatArray9542[2]);
					class327.aClass436_3580.method5243((aClass167_Sub3_9421.aFloat9573 * aClass167_Sub3_9421.aFloat9678), (aClass167_Sub3_9421.aFloat9573 * aClass167_Sub3_9421.aFloat9649), (aClass167_Sub3_9421.aFloat9573 * aClass167_Sub3_9421.aFloat9701));
					class327.aClass436_3581.method5243((-aClass167_Sub3_9421.aFloat9579 * aClass167_Sub3_9421.aFloat9678), (-aClass167_Sub3_9421.aFloat9579 * aClass167_Sub3_9421.aFloat9649), (-aClass167_Sub3_9421.aFloat9579 * aClass167_Sub3_9421.aFloat9701));
					class327.aClass436_3566.method5243((aClass167_Sub3_9421.aFloat9626 * aClass167_Sub3_9421.aFloat9678), (aClass167_Sub3_9421.aFloat9626 * aClass167_Sub3_9421.aFloat9649), (aClass167_Sub3_9421.aFloat9626 * aClass167_Sub3_9421.aFloat9701));
					int i_392_ = 0;
					for (int i_393_ = 0; i_393_ < aClass536Array9415.length; i_393_++) {
						Class536_Sub10 class536_sub10 = (Class536_Sub10) aClass536Array9415[i_393_];
						if (class536_sub10.anInt10434 > 0) {
							if (aClass167_Sub3_9421.aBool9683) {
								aClass167_Sub3_9421.method2282(0, class536_sub10.aClass175_10438);
								float f = 0.15F;
								class327.aClass427_3575.method5131(0.0F, 1.0F / ((float) ((class536_sub10.aClass175_10438.anInt1934) * 71478565) * f), 0.0F, 256.0F / ((float) ((class536_sub10.aClass175_10438.anInt1934) * 71478565) * f));
								class327.aClass436_3573.method5243((float) ((class536_sub10.aClass175_10438.anInt1932) * 432289019 >> 16 & 0xff) / 255.0F, (float) ((class536_sub10.aClass175_10438.anInt1932) * 432289019 >> 8 & 0xff) / 255.0F, (float) ((class536_sub10.aClass175_10438.anInt1932) * 432289019 >> 0 & 0xff) / 255.0F);
							} else {
								class327.aClass427_3575.method5131(0.0F, 0.0F, 0.0F, 0.0F);
								class327.aClass436_3573.method5243(0.0F, 0.0F, 0.0F);
							}
							byte i_394_ = 11;
							if (class536_sub10.anInt10436 != -1) {
								Class164 class164 = (aClass167_Sub3_9421.aClass174_1852.method2446(class536_sub10.anInt10436, -186533446));
								i_394_ = class164.aByte1797;
								class327.anInterface36_3569 = aClass167_Sub3_9421.aClass340_9561.method4456(class164);
								class327.method4303(class164.aByte1823);
							} else
								class327.anInterface36_3569 = aClass167_Sub3_9421.anInterface36_9691;
							aClass167_Sub3_9421.method8808(1, class536_sub10.anInterface38_10439);
							aClass167_Sub3_9421.method8807(aClass343_9418);
							class327.aClass443_3571.method5344(1.0F / class536_sub10.aFloat10437, 1.0F / class536_sub10.aFloat10437, 1.0F, 1.0F);
							class327.anInt3584 = class536_sub10.anInt10441;
							class327.anInt3574 = (class536_sub10.anInt10444 - class536_sub10.anInt10441 + 1);
							class327.anInt3586 = i_392_;
							class327.anInt3587 = class536_sub10.anInt10434 / 3;
							switch (i_394_) {
							case 6:
								class327.method4285(!Class16_Sub1.method10359(i_394_, 1734567402));
								break;
							case 1:
								class327.aClass436_3572.method5243((aClass167_Sub3_9421.aClass443_9564.aFloatArray4878[12]), (aClass167_Sub3_9421.aClass443_9564.aFloatArray4878[13]), (aClass167_Sub3_9421.aClass443_9564.aFloatArray4878[14]));
								if (aClass167_Sub3_9421.aBool9683)
									class327.method4287();
								else
									class327.method4286(0);
								break;
							case 7:
								class327.aClass436_3572.method5243((aClass167_Sub3_9421.aClass443_9564.aFloatArray4878[12]), (aClass167_Sub3_9421.aClass443_9564.aFloatArray4878[13]), (aClass167_Sub3_9421.aClass443_9564.aFloatArray4878[14]));
								class327.aClass443_3582.method5338();
								class327.anInterface39_3570 = aClass167_Sub3_9421.method8739();
								class327.method4288(0);
								break;
							default:
								if (aClass167_Sub3_9421.aBool9683)
									class327.method4289();
								else
									class327.method4293(0);
								break;
							case 2:
							case 4:
							case 8:
							case 9:
								if (!aClass167_Sub3_9421.aBool9704 && (anInt9399 & 0x8) != 0 && aClass167_Sub3_9421.aClass341_Sub1_Sub2_9657.method10591(889151753)) {
									Class341_Sub1_Sub2 class341_sub1_sub2 = (aClass167_Sub3_9421.aClass341_Sub1_Sub2_9657);
									if (i_394_ == 2)
										class341_sub1_sub2 = (aClass167_Sub3_9421.aClass341_Sub1_Sub2_9656);
									class341_sub1_sub2.aClass443_11507.method5339(aClass167_Sub3_9421.aClass443_9585);
									class341_sub1_sub2.aClass443_11509.method5344(1.0F / (class536_sub10.aFloat10437 * (float) ((class536_sub10.aClass175_10438.anInt1928) * -1036575495)), 1.0F / (class536_sub10.aFloat10437 * (float) ((class536_sub10.aClass175_10438.anInt1928) * -1036575495)), 1.0F, 1.0F);
									class341_sub1_sub2.aClass436_11514.method5243((aClass167_Sub3_9421.aClass443_9564.aFloatArray4878[12]), (aClass167_Sub3_9421.aClass443_9564.aFloatArray4878[13]), (aClass167_Sub3_9421.aClass443_9564.aFloatArray4878[14]));
									Class164 class164 = (aClass167_Sub3_9421.aClass174_1852.method2446(class536_sub10.anInt10436, -83897628));
									class341_sub1_sub2.anInt11518 = class164.aByte1823 * 87899859;
									class341_sub1_sub2.anInt11527 = (class536_sub10.anInt10441 * -510634877);
									class341_sub1_sub2.anInt11528 = ((class536_sub10.anInt10444 - class536_sub10.anInt10441 + 1) * -885610021);
									class341_sub1_sub2.anInt11521 = i_392_ * -1615681415;
									class341_sub1_sub2.anInt11530 = (class536_sub10.anInt10434 / 3 * 1711695181);
									class341_sub1_sub2.aClass427_11517.method5133(class327.aClass427_3575);
									class341_sub1_sub2.aClass436_11522.method5272(class327.aClass436_3573);
									class341_sub1_sub2.aClass427_11524.method5133(class327.aClass427_3577);
									class341_sub1_sub2.aClass436_11526.method5272(class327.aClass436_3585);
									class341_sub1_sub2.method10592(-169663533);
								} else
									class327.method4293(0);
							}
							i_392_ += class536_sub10.anInt10434;
						}
					}
				}
			}
			if (!aClass708_9434.method8313(-1932215769)) {
				aClass167_Sub3_9421.method8763(128);
				aClass167_Sub3_9421.method8760(false);
				Class436 class436 = new Class436(class327.aClass436_3585);
				class327.aClass436_3585.method5243(0.0F, 0.0F, 0.0F);
				Iterator iterator = aClass708_9434.iterator();
				while (iterator.hasNext()) {
					Class536_Sub4 class536_sub4 = (Class536_Sub4) iterator.next();
					class536_sub4.method9399(class327, i, i_374_, i_375_, bools, bool);
				}
				class327.aClass436_3585.method5272(class436);
			}
			if (aClass339_9413 != null) {
				aClass167_Sub3_9421.method8763(1);
				aClass167_Sub3_9421.method8808(0, anInterface38_9416);
				aClass167_Sub3_9421.method8808(1, anInterface38_9428);
				aClass167_Sub3_9421.method8807(aClass343_9418);
				Class443 class443 = aClass167_Sub3_9421.aClass443_9570;
				class443.method5338();
				class443.aFloatArray4878[13] = -1.0F;
				class327.method4284(class443);
				aClass339_9413.method4438(class327, i, i_374_, i_375_, bools, bool);
			}
		}
	}

	public void method1949(Class536_Sub18_Sub7 class536_sub18_sub7, int i, int i_395_, int i_396_, int i_397_, boolean bool) {
		if (aClass339_9413 != null && class536_sub18_sub7 != null) {
			int i_398_ = (i - (i_395_ * aClass167_Sub3_9421.anInt9634 >> 8) >> aClass167_Sub3_9421.anInt9633);
			int i_399_ = (i_396_ - (i_395_ * aClass167_Sub3_9421.anInt9635 >> 8) >> aClass167_Sub3_9421.anInt9633);
			aClass339_9413.method4443(class536_sub18_sub7, i_398_, i_399_);
		}
	}

	public void method1934(Class536_Sub18_Sub7 class536_sub18_sub7, int i, int i_400_, int i_401_, int i_402_, boolean bool) {
		if (aClass339_9413 != null && class536_sub18_sub7 != null) {
			int i_403_ = (i - (i_400_ * aClass167_Sub3_9421.anInt9634 >> 8) >> aClass167_Sub3_9421.anInt9633);
			int i_404_ = (i_401_ - (i_400_ * aClass167_Sub3_9421.anInt9635 >> 8) >> aClass167_Sub3_9421.anInt9633);
			aClass339_9413.method4443(class536_sub18_sub7, i_403_, i_404_);
		}
	}

	void method8665() {
		if ((anInt9398 & 0x2) == 0) {
			anIntArrayArrayArray9414 = null;
			anIntArrayArrayArray9409 = null;
			anIntArrayArrayArray9417 = null;
		}
		anIntArrayArrayArray9411 = null;
		anIntArrayArrayArray9407 = null;
		anIntArrayArrayArray9410 = null;
		aClass536_Sub10ArrayArrayArray9420 = null;
		aByteArrayArray9423 = null;
		aClass4_9425 = null;
		aClass536Array9426 = null;
		aFloatArrayArray9424 = null;
		aFloatArrayArray9405 = null;
		aFloatArrayArray9422 = null;
	}

	void method8666() {
		if ((anInt9398 & 0x2) == 0) {
			anIntArrayArrayArray9414 = null;
			anIntArrayArrayArray9409 = null;
			anIntArrayArrayArray9417 = null;
		}
		anIntArrayArrayArray9411 = null;
		anIntArrayArrayArray9407 = null;
		anIntArrayArrayArray9410 = null;
		aClass536_Sub10ArrayArrayArray9420 = null;
		aByteArrayArray9423 = null;
		aClass4_9425 = null;
		aClass536Array9426 = null;
		aFloatArrayArray9424 = null;
		aFloatArrayArray9405 = null;
		aFloatArrayArray9422 = null;
	}

	public boolean method1948(Class536_Sub18_Sub7 class536_sub18_sub7, int i, int i_405_, int i_406_, int i_407_, boolean bool) {
		if (aClass339_9413 == null || class536_sub18_sub7 == null)
			return false;
		int i_408_ = (i - (i_405_ * aClass167_Sub3_9421.anInt9634 >> 8) >> aClass167_Sub3_9421.anInt9633);
		int i_409_ = (i_406_ - (i_405_ * aClass167_Sub3_9421.anInt9635 >> 8) >> aClass167_Sub3_9421.anInt9633);
		return aClass339_9413.method4436(class536_sub18_sub7, i_408_, i_409_);
	}
}
