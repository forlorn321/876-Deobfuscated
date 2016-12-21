/* Class536_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.nio.ByteBuffer;

import sun.misc.Unsafe;

public class Class536_Sub4 extends Class536 {
	Class167_Sub3 aClass167_Sub3_10395;
	Class160_Sub2 aClass160_Sub2_10396;
	Class536_Sub19 aClass536_Sub19_10397;
	int anInt10398;
	int anInt10399;
	int anInt10400;
	float[][] aFloatArrayArray10401;
	int anInt10402 = 0;
	int anInt10403;
	int anInt10404;
	float[][] aFloatArrayArray10405;
	Interface38 anInterface38_10406;
	float[][] aFloatArrayArray10407;
	Interface41 anInterface41_10408;
	int anInt10409 = 0;
	Class4 aClass4_10410;
	ByteBuffer aByteBuffer10411;

	void method9395(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
		long l = -1L;
		int i_5_ = i_3_ + (i_1_ << aClass160_Sub2_10396.anInt1768 * 2064238369);
		int i_6_ = i_4_ + (i_2_ << aClass160_Sub2_10396.anInt1768 * 2064238369);
		int i_7_ = aClass160_Sub2_10396.method1925(i_5_, i_6_, (byte) 56);
		if ((i_3_ & 0x7f) == 0 || (i_4_ & 0x7f) == 0) {
			l = ((long) i_6_ & 0xffffL) << 16 | (long) i_5_ & 0xffffL;
			Class536 class536 = aClass4_10410.method556(l);
			if (class536 != null) {
				Unsafe unsafe = aClass167_Sub3_10395.anUnsafe9548;
				unsafe.putShort((aClass167_Sub3_10395.aLong9586 + (long) (aClass167_Sub3_10395.anInt9552 >> 1) + (long) (anInt10404 * 2)), ((Class536_Sub20) class536).aShort10520);
				anInt10404++;
				return;
			}
		}
		short i_8_ = (short) anInt10402;
		if (l != -1L)
			aClass4_10410.method560(new Class536_Sub20(i_8_), l);
		float f;
		float f_9_;
		float f_10_;
		if (i_3_ == 0 && i_4_ == 0) {
			f = aFloatArrayArray10407[i][i_0_];
			f_9_ = aFloatArrayArray10405[i][i_0_];
			f_10_ = aFloatArrayArray10401[i][i_0_];
		} else if (i_3_ == aClass160_Sub2_10396.anInt1767 * -1504778739 && i_4_ == 0) {
			f = aFloatArrayArray10407[i + 1][i_0_];
			f_9_ = aFloatArrayArray10405[i + 1][i_0_];
			f_10_ = aFloatArrayArray10401[i + 1][i_0_];
		} else if (i_3_ == aClass160_Sub2_10396.anInt1767 * -1504778739 && i_4_ == aClass160_Sub2_10396.anInt1767 * -1504778739) {
			f = aFloatArrayArray10407[i + 1][i_0_ + 1];
			f_9_ = aFloatArrayArray10405[i + 1][i_0_ + 1];
			f_10_ = aFloatArrayArray10401[i + 1][i_0_ + 1];
		} else if (i_3_ == 0 && i_4_ == aClass160_Sub2_10396.anInt1767 * -1504778739) {
			f = aFloatArrayArray10407[i][i_0_ + 1];
			f_9_ = aFloatArrayArray10405[i][i_0_ + 1];
			f_10_ = aFloatArrayArray10401[i][i_0_ + 1];
		} else {
			float f_11_ = ((float) i_3_ / (float) (aClass160_Sub2_10396.anInt1767 * -1504778739));
			float f_12_ = ((float) i_4_ / (float) (aClass160_Sub2_10396.anInt1767 * -1504778739));
			float f_13_ = aFloatArrayArray10407[i][i_0_];
			float f_14_ = aFloatArrayArray10405[i][i_0_];
			float f_15_ = aFloatArrayArray10401[i][i_0_];
			float f_16_ = aFloatArrayArray10407[i + 1][i_0_];
			float f_17_ = aFloatArrayArray10405[i + 1][i_0_];
			float f_18_ = aFloatArrayArray10401[i + 1][i_0_];
			f_13_ += (aFloatArrayArray10407[i][i_0_ + 1] - f_13_) * f_11_;
			f_14_ += (aFloatArrayArray10405[i][i_0_ + 1] - f_14_) * f_11_;
			f_15_ += (aFloatArrayArray10401[i][i_0_ + 1] - f_15_) * f_11_;
			f_16_ += (aFloatArrayArray10407[i + 1][i_0_ + 1] - f_16_) * f_11_;
			f_17_ += (aFloatArrayArray10405[i + 1][i_0_ + 1] - f_17_) * f_11_;
			f_18_ += (aFloatArrayArray10401[i + 1][i_0_ + 1] - f_18_) * f_11_;
			f = f_13_ + (f_16_ - f_13_) * f_12_;
			f_9_ = f_14_ + (f_17_ - f_14_) * f_12_;
			f_10_ = f_15_ + (f_18_ - f_15_) * f_12_;
		}
		float f_19_ = (float) (aClass536_Sub19_10397.method9548(-1631795522) - i_5_);
		float f_20_ = (float) (aClass536_Sub19_10397.method9549(843330510) - i_7_);
		float f_21_ = (float) (aClass536_Sub19_10397.method9551((byte) 0) - i_6_);
		float f_22_ = (float) Math.sqrt((double) (f_19_ * f_19_ + f_20_ * f_20_ + f_21_ * f_21_));
		float f_23_ = 1.0F / f_22_;
		f_19_ *= f_23_;
		f_20_ *= f_23_;
		f_21_ *= f_23_;
		float f_24_ = f_22_ / (float) aClass536_Sub19_10397.method9530(1871651161);
		float f_25_ = 1.0F - f_24_ * f_24_;
		if (f_25_ < 0.0F)
			f_25_ = 0.0F;
		float f_26_ = f_19_ * f + f_20_ * f_9_ + f_21_ * f_10_;
		if (f_26_ < 0.0F)
			f_26_ = 0.0F;
		float f_27_ = f_26_ * f_25_ * 2.0F;
		if (f_27_ > 1.0F)
			f_27_ = 1.0F;
		int i_28_ = aClass536_Sub19_10397.method9528(-1140218307);
		int i_29_ = (int) (f_27_ * (float) (i_28_ >> 16 & 0xff));
		if (i_29_ > 255)
			i_29_ = 255;
		int i_30_ = (int) (f_27_ * (float) (i_28_ >> 8 & 0xff));
		if (i_30_ > 255)
			i_30_ = 255;
		int i_31_ = (int) (f_27_ * (float) (i_28_ & 0xff));
		if (i_31_ > 255)
			i_31_ = 255;
		Unsafe unsafe = aClass167_Sub3_10395.anUnsafe9548;
		unsafe.putFloat(aClass167_Sub3_10395.aLong9586 + (long) (anInt10402 * 16), (float) i_5_);
		unsafe.putFloat((aClass167_Sub3_10395.aLong9586 + (long) (anInt10402 * 16) + 4L), (float) i_7_);
		unsafe.putFloat((aClass167_Sub3_10395.aLong9586 + (long) (anInt10402 * 16) + 8L), (float) i_6_);
		if (aClass167_Sub3_10395.anInt9689 == 0) {
			unsafe.putByte((aClass167_Sub3_10395.aLong9586 + (long) (anInt10402 * 16) + 12L), (byte) i_31_);
			unsafe.putByte((aClass167_Sub3_10395.aLong9586 + (long) (anInt10402 * 16) + 13L), (byte) i_30_);
			unsafe.putByte((aClass167_Sub3_10395.aLong9586 + (long) (anInt10402 * 16) + 14L), (byte) i_29_);
		} else {
			unsafe.putByte((aClass167_Sub3_10395.aLong9586 + (long) (anInt10402 * 16) + 12L), (byte) i_29_);
			unsafe.putByte((aClass167_Sub3_10395.aLong9586 + (long) (anInt10402 * 16) + 13L), (byte) i_30_);
			unsafe.putByte((aClass167_Sub3_10395.aLong9586 + (long) (anInt10402 * 16) + 14L), (byte) i_31_);
		}
		unsafe.putByte((aClass167_Sub3_10395.aLong9586 + (long) (anInt10402 * 16) + 15L), (byte) -1);
		anInt10402++;
		unsafe.putShort((aClass167_Sub3_10395.aLong9586 + (long) (aClass167_Sub3_10395.anInt9552 >> 1) + (long) (anInt10404 * 2)), i_8_);
		anInt10404++;
	}

	void method9396() {
		anInterface41_10408 = aClass167_Sub3_10395.method8804(false);
		anInterface41_10408.method283(anInt10404);
		anInterface38_10406 = aClass167_Sub3_10395.method8805(false);
		anInterface38_10406.method271(anInt10402 * 16, 16);
		anInterface38_10406.method264(0, anInt10402 * 16, aClass167_Sub3_10395.aLong9586);
		anInterface41_10408.method264(0, anInt10404 * 2, (aClass167_Sub3_10395.aLong9586 + (long) (aClass167_Sub3_10395.anInt9552 >> 1)));
	}

	void method9397(int i, int i_32_, int i_33_, int i_34_, int i_35_, int i_36_) {
		long l = -1L;
		int i_37_ = i_35_ + (i_33_ << aClass160_Sub2_10396.anInt1768 * 2064238369);
		int i_38_ = i_36_ + (i_34_ << aClass160_Sub2_10396.anInt1768 * 2064238369);
		int i_39_ = aClass160_Sub2_10396.method1925(i_37_, i_38_, (byte) -34);
		if ((i_35_ & 0x7f) == 0 || (i_36_ & 0x7f) == 0) {
			l = ((long) i_38_ & 0xffffL) << 16 | (long) i_37_ & 0xffffL;
			Class536 class536 = aClass4_10410.method556(l);
			if (class536 != null) {
				Unsafe unsafe = aClass167_Sub3_10395.anUnsafe9548;
				unsafe.putShort((aClass167_Sub3_10395.aLong9586 + (long) (aClass167_Sub3_10395.anInt9552 >> 1) + (long) (anInt10404 * 2)), ((Class536_Sub20) class536).aShort10520);
				anInt10404++;
				return;
			}
		}
		short i_40_ = (short) anInt10402;
		if (l != -1L)
			aClass4_10410.method560(new Class536_Sub20(i_40_), l);
		float f;
		float f_41_;
		float f_42_;
		if (i_35_ == 0 && i_36_ == 0) {
			f = aFloatArrayArray10407[i][i_32_];
			f_41_ = aFloatArrayArray10405[i][i_32_];
			f_42_ = aFloatArrayArray10401[i][i_32_];
		} else if (i_35_ == aClass160_Sub2_10396.anInt1767 * -1504778739 && i_36_ == 0) {
			f = aFloatArrayArray10407[i + 1][i_32_];
			f_41_ = aFloatArrayArray10405[i + 1][i_32_];
			f_42_ = aFloatArrayArray10401[i + 1][i_32_];
		} else if (i_35_ == aClass160_Sub2_10396.anInt1767 * -1504778739 && i_36_ == aClass160_Sub2_10396.anInt1767 * -1504778739) {
			f = aFloatArrayArray10407[i + 1][i_32_ + 1];
			f_41_ = aFloatArrayArray10405[i + 1][i_32_ + 1];
			f_42_ = aFloatArrayArray10401[i + 1][i_32_ + 1];
		} else if (i_35_ == 0 && i_36_ == aClass160_Sub2_10396.anInt1767 * -1504778739) {
			f = aFloatArrayArray10407[i][i_32_ + 1];
			f_41_ = aFloatArrayArray10405[i][i_32_ + 1];
			f_42_ = aFloatArrayArray10401[i][i_32_ + 1];
		} else {
			float f_43_ = ((float) i_35_ / (float) (aClass160_Sub2_10396.anInt1767 * -1504778739));
			float f_44_ = ((float) i_36_ / (float) (aClass160_Sub2_10396.anInt1767 * -1504778739));
			float f_45_ = aFloatArrayArray10407[i][i_32_];
			float f_46_ = aFloatArrayArray10405[i][i_32_];
			float f_47_ = aFloatArrayArray10401[i][i_32_];
			float f_48_ = aFloatArrayArray10407[i + 1][i_32_];
			float f_49_ = aFloatArrayArray10405[i + 1][i_32_];
			float f_50_ = aFloatArrayArray10401[i + 1][i_32_];
			f_45_ += (aFloatArrayArray10407[i][i_32_ + 1] - f_45_) * f_43_;
			f_46_ += (aFloatArrayArray10405[i][i_32_ + 1] - f_46_) * f_43_;
			f_47_ += (aFloatArrayArray10401[i][i_32_ + 1] - f_47_) * f_43_;
			f_48_ += (aFloatArrayArray10407[i + 1][i_32_ + 1] - f_48_) * f_43_;
			f_49_ += (aFloatArrayArray10405[i + 1][i_32_ + 1] - f_49_) * f_43_;
			f_50_ += (aFloatArrayArray10401[i + 1][i_32_ + 1] - f_50_) * f_43_;
			f = f_45_ + (f_48_ - f_45_) * f_44_;
			f_41_ = f_46_ + (f_49_ - f_46_) * f_44_;
			f_42_ = f_47_ + (f_50_ - f_47_) * f_44_;
		}
		float f_51_ = (float) (aClass536_Sub19_10397.method9548(-1764258260) - i_37_);
		float f_52_ = (float) (aClass536_Sub19_10397.method9549(213134231) - i_39_);
		float f_53_ = (float) (aClass536_Sub19_10397.method9551((byte) 0) - i_38_);
		float f_54_ = (float) Math.sqrt((double) (f_51_ * f_51_ + f_52_ * f_52_ + f_53_ * f_53_));
		float f_55_ = 1.0F / f_54_;
		f_51_ *= f_55_;
		f_52_ *= f_55_;
		f_53_ *= f_55_;
		float f_56_ = f_54_ / (float) aClass536_Sub19_10397.method9530(-2132028605);
		float f_57_ = 1.0F - f_56_ * f_56_;
		if (f_57_ < 0.0F)
			f_57_ = 0.0F;
		float f_58_ = f_51_ * f + f_52_ * f_41_ + f_53_ * f_42_;
		if (f_58_ < 0.0F)
			f_58_ = 0.0F;
		float f_59_ = f_58_ * f_57_ * 2.0F;
		if (f_59_ > 1.0F)
			f_59_ = 1.0F;
		int i_60_ = aClass536_Sub19_10397.method9528(2091332810);
		int i_61_ = (int) (f_59_ * (float) (i_60_ >> 16 & 0xff));
		if (i_61_ > 255)
			i_61_ = 255;
		int i_62_ = (int) (f_59_ * (float) (i_60_ >> 8 & 0xff));
		if (i_62_ > 255)
			i_62_ = 255;
		int i_63_ = (int) (f_59_ * (float) (i_60_ & 0xff));
		if (i_63_ > 255)
			i_63_ = 255;
		Unsafe unsafe = aClass167_Sub3_10395.anUnsafe9548;
		unsafe.putFloat(aClass167_Sub3_10395.aLong9586 + (long) (anInt10402 * 16), (float) i_37_);
		unsafe.putFloat((aClass167_Sub3_10395.aLong9586 + (long) (anInt10402 * 16) + 4L), (float) i_39_);
		unsafe.putFloat((aClass167_Sub3_10395.aLong9586 + (long) (anInt10402 * 16) + 8L), (float) i_38_);
		if (aClass167_Sub3_10395.anInt9689 == 0) {
			unsafe.putByte((aClass167_Sub3_10395.aLong9586 + (long) (anInt10402 * 16) + 12L), (byte) i_63_);
			unsafe.putByte((aClass167_Sub3_10395.aLong9586 + (long) (anInt10402 * 16) + 13L), (byte) i_62_);
			unsafe.putByte((aClass167_Sub3_10395.aLong9586 + (long) (anInt10402 * 16) + 14L), (byte) i_61_);
		} else {
			unsafe.putByte((aClass167_Sub3_10395.aLong9586 + (long) (anInt10402 * 16) + 12L), (byte) i_61_);
			unsafe.putByte((aClass167_Sub3_10395.aLong9586 + (long) (anInt10402 * 16) + 13L), (byte) i_62_);
			unsafe.putByte((aClass167_Sub3_10395.aLong9586 + (long) (anInt10402 * 16) + 14L), (byte) i_63_);
		}
		unsafe.putByte((aClass167_Sub3_10395.aLong9586 + (long) (anInt10402 * 16) + 15L), (byte) -1);
		anInt10402++;
		unsafe.putShort((aClass167_Sub3_10395.aLong9586 + (long) (aClass167_Sub3_10395.anInt9552 >> 1) + (long) (anInt10404 * 2)), i_40_);
		anInt10404++;
	}

	void method9398(Class327 class327, Interface41 interface41, int i) {
		class327.anInt3584 = 0;
		class327.anInt3574 = anInt10402;
		class327.anInt3586 = 0;
		class327.anInt3587 = anInt10404 / 3;
		class327.anInterface36_3569 = aClass167_Sub3_10395.anInterface36_9691;
		float f = aClass536_Sub19_10397.method9531(-798329874);
		class327.aClass436_3566.method5243(f, f, f);
		aClass167_Sub3_10395.method8808(0, anInterface38_10406);
		aClass167_Sub3_10395.method8807(aClass167_Sub3_10395.aClass343_9625);
		aClass167_Sub3_10395.method8809(anInterface41_10408);
		class327.method4293(0);
	}

	Class536_Sub4(Class167_Sub3 class167_sub3, Class160_Sub2 class160_sub2, Class536_Sub19 class536_sub19, int[] is) {
		anInt10404 = 0;
		aClass167_Sub3_10395 = class167_sub3;
		aClass536_Sub19_10397 = class536_sub19;
		aClass160_Sub2_10396 = class160_sub2;
		int i = (aClass536_Sub19_10397.method9530(-829116915) - (class160_sub2.anInt1767 * -1504778739 >> 1));
		anInt10398 = (aClass536_Sub19_10397.method9548(-1354991371) - i >> class160_sub2.anInt1768 * 2064238369);
		anInt10399 = (aClass536_Sub19_10397.method9548(339672822) + i >> class160_sub2.anInt1768 * 2064238369);
		anInt10400 = (aClass536_Sub19_10397.method9551((byte) 0) - i >> class160_sub2.anInt1768 * 2064238369);
		anInt10403 = (aClass536_Sub19_10397.method9551((byte) 0) + i >> class160_sub2.anInt1768 * 2064238369);
		int i_64_ = anInt10399 - anInt10398 + 1;
		int i_65_ = anInt10403 - anInt10400 + 1;
		aFloatArrayArray10407 = new float[i_64_ + 1][i_65_ + 1];
		aFloatArrayArray10405 = new float[i_64_ + 1][i_65_ + 1];
		aFloatArrayArray10401 = new float[i_64_ + 1][i_65_ + 1];
		for (int i_66_ = 0; i_66_ <= i_65_; i_66_++) {
			int i_67_ = i_66_ + anInt10400;
			if (i_67_ > 0 && i_67_ < aClass160_Sub2_10396.anInt1769 * -889224915 - 1) {
				for (int i_68_ = 0; i_68_ <= i_64_; i_68_++) {
					int i_69_ = i_68_ + anInt10398;
					if (i_69_ > 0 && i_69_ < (aClass160_Sub2_10396.anInt1766 * 1718142487 - 1)) {
						int i_70_ = (class160_sub2.method1927(i_69_ + 1, i_67_, 246103778) - class160_sub2.method1927(i_69_ - 1, i_67_, 1427095639));
						int i_71_ = (class160_sub2.method1927(i_69_, i_67_ + 1, -1469379487) - class160_sub2.method1927(i_69_, i_67_ - 1, -1254000715));
						float f = (float) (1.0 / Math.sqrt((double) (i_70_ * i_70_ + 65536 + (i_71_ * i_71_))));
						aFloatArrayArray10407[i_68_][i_66_] = (float) i_70_ * f;
						aFloatArrayArray10405[i_68_][i_66_] = -256.0F * f;
						aFloatArrayArray10401[i_68_][i_66_] = (float) i_71_ * f;
					}
				}
			}
		}
		int i_72_ = 0;
		for (int i_73_ = anInt10400; i_73_ <= anInt10403; i_73_++) {
			if (i_73_ >= 0 && i_73_ < class160_sub2.anInt1769 * -889224915) {
				for (int i_74_ = anInt10398; i_74_ <= anInt10399; i_74_++) {
					if (i_74_ >= 0 && i_74_ < class160_sub2.anInt1766 * 1718142487) {
						int i_75_ = is[i_72_];
						int[] is_76_ = (class160_sub2.anIntArrayArrayArray9417[i_74_][i_73_]);
						if (is_76_ != null && i_75_ != 0) {
							if (i_75_ == 1) {
								for (int i_77_ = 0; i_77_ < is_76_.length; i_77_ += 3) {
									if (is_76_[i_77_] != -1 && is_76_[i_77_ + 1] != -1 && is_76_[i_77_ + 2] != -1)
										anInt10409 += 3;
								}
							} else
								anInt10409 += 3;
						}
					}
					i_72_++;
				}
			} else
				i_72_ += anInt10399 - anInt10398;
		}
		if (anInt10409 > 0) {
			aClass4_10410 = new Class4(Class528.method6434(anInt10409, -980941172));
			aByteBuffer10411 = aClass167_Sub3_10395.aByteBuffer9549;
			aByteBuffer10411.clear();
			aByteBuffer10411.position(aClass167_Sub3_10395.anInt9552 >> 1);
			aByteBuffer10411.slice();
			aByteBuffer10411.position(0);
			aByteBuffer10411.limit(aClass167_Sub3_10395.anInt9552 >> 1);
			int i_78_ = 0;
			i_72_ = 0;
			for (int i_79_ = anInt10400; i_79_ <= anInt10403; i_79_++) {
				if (i_79_ >= 0 && i_79_ < class160_sub2.anInt1769 * -889224915) {
					int i_80_ = 0;
					for (int i_81_ = anInt10398; i_81_ <= anInt10399; i_81_++) {
						if (i_81_ >= 0 && i_81_ < class160_sub2.anInt1766 * 1718142487) {
							int i_82_ = is[i_72_];
							int[] is_83_ = (class160_sub2.anIntArrayArrayArray9417[i_81_][i_79_]);
							if (is_83_ != null && i_82_ != 0) {
								if (i_82_ == 1) {
									int[] is_84_ = (class160_sub2.anIntArrayArrayArray9409[i_81_][i_79_]);
									int[] is_85_ = (class160_sub2.anIntArrayArrayArray9414[i_81_][i_79_]);
									int i_86_ = 0;
									while (i_86_ < is_83_.length) {
										if (is_83_[i_86_] != -1 && is_83_[i_86_ + 1] != -1 && is_83_[i_86_ + 2] != -1) {
											method9397(i_80_, i_78_, i_81_, i_79_, is_84_[i_86_], is_85_[i_86_]);
											i_86_++;
											method9397(i_80_, i_78_, i_81_, i_79_, is_84_[i_86_], is_85_[i_86_]);
											i_86_++;
											method9397(i_80_, i_78_, i_81_, i_79_, is_84_[i_86_], is_85_[i_86_]);
											i_86_++;
										} else
											i_86_ += 3;
									}
								} else if (i_82_ == 3) {
									method9397(i_80_, i_78_, i_81_, i_79_, 0, 0);
									method9397(i_80_, i_78_, i_81_, i_79_, (class160_sub2.anInt1767 * -1504778739), 0);
									method9397(i_80_, i_78_, i_81_, i_79_, 0, (class160_sub2.anInt1767 * -1504778739));
								} else if (i_82_ == 2) {
									method9397(i_80_, i_78_, i_81_, i_79_, (class160_sub2.anInt1767 * -1504778739), 0);
									method9397(i_80_, i_78_, i_81_, i_79_, (class160_sub2.anInt1767 * -1504778739), (class160_sub2.anInt1767 * -1504778739));
									method9397(i_80_, i_78_, i_81_, i_79_, 0, 0);
								} else if (i_82_ == 5) {
									method9397(i_80_, i_78_, i_81_, i_79_, (class160_sub2.anInt1767 * -1504778739), (class160_sub2.anInt1767 * -1504778739));
									method9397(i_80_, i_78_, i_81_, i_79_, 0, (class160_sub2.anInt1767 * -1504778739));
									method9397(i_80_, i_78_, i_81_, i_79_, (class160_sub2.anInt1767 * -1504778739), 0);
								} else if (i_82_ == 4) {
									method9397(i_80_, i_78_, i_81_, i_79_, 0, (class160_sub2.anInt1767 * -1504778739));
									method9397(i_80_, i_78_, i_81_, i_79_, 0, 0);
									method9397(i_80_, i_78_, i_81_, i_79_, (class160_sub2.anInt1767 * -1504778739), (class160_sub2.anInt1767 * -1504778739));
								}
							}
						}
						i_72_++;
						i_80_++;
					}
				} else
					i_72_ += anInt10399 - anInt10398;
				i_78_++;
			}
			method9396();
		} else {
			anInterface38_10406 = null;
			anInterface41_10408 = null;
		}
		aClass4_10410 = null;
		aFloatArrayArray10401 = null;
		aFloatArrayArray10405 = null;
		aFloatArrayArray10407 = null;
	}

	void method9399(Class327 class327, int i, int i_87_, int i_88_, boolean[][] bools, boolean bool) {
		if (anInterface41_10408 != null && anInt10398 <= i + i_88_ && anInt10399 >= i - i_88_ && anInt10400 <= i_87_ + i_88_ && anInt10403 >= i_87_ - i_88_) {
			if (bool) {
				for (int i_89_ = anInt10398; i_89_ <= anInt10399; i_89_++) {
					if (i_89_ - i >= -i_88_ && i_89_ - i <= i_88_) {
						for (int i_90_ = anInt10400; i_90_ <= anInt10403; i_90_++) {
							if (i_90_ - i_87_ >= -i_88_ && i_90_ - i_87_ <= i_88_ && (bools[i_89_ - i + i_88_][i_90_ - i_87_ + i_88_])) {
								method9398(class327, anInterface41_10408, anInt10404 / 3);
								return;
							}
						}
					}
				}
			} else {
				int i_91_ = 0;
				ByteBuffer bytebuffer = aClass167_Sub3_10395.aByteBuffer9549;
				bytebuffer.clear();
				for (int i_92_ = anInt10400; i_92_ <= anInt10403; i_92_++) {
					if (i_92_ - i_87_ >= -i_88_ && i_92_ - i_87_ <= i_88_) {
						int i_93_ = (i_92_ * (aClass160_Sub2_10396.anInt1766 * 1718142487) + anInt10398);
						for (int i_94_ = anInt10398; i_94_ <= anInt10399; i_94_++) {
							if (i_94_ - i >= -i_88_ && i_94_ - i <= i_88_ && (bools[i_94_ - i + i_88_][i_92_ - i_87_ + i_88_])) {
								short[] is = (aClass160_Sub2_10396.aShortArrayArray9402[i_93_]);
								if (is != null) {
									for (int i_95_ = 0; i_95_ < is.length; i_95_++) {
										bytebuffer.putShort(is[i_95_]);
										i_91_++;
									}
								}
							}
							i_93_++;
						}
					}
				}
				if (bytebuffer.position() != 0 && i_91_ != 0) {
					int i_96_ = bytebuffer.position();
					Interface41 interface41 = aClass167_Sub3_10395.method8737(i_96_ / 2);
					interface41.method264(0, i_96_, aClass167_Sub3_10395.aLong9586);
					method9398(class327, interface41, i_91_ / 3);
				}
			}
		}
	}

	void method9400(int i, int i_97_, int i_98_, int i_99_, int i_100_, int i_101_) {
		long l = -1L;
		int i_102_ = i_100_ + (i_98_ << aClass160_Sub2_10396.anInt1768 * 2064238369);
		int i_103_ = i_101_ + (i_99_ << aClass160_Sub2_10396.anInt1768 * 2064238369);
		int i_104_ = aClass160_Sub2_10396.method1925(i_102_, i_103_, (byte) 60);
		if ((i_100_ & 0x7f) == 0 || (i_101_ & 0x7f) == 0) {
			l = ((long) i_103_ & 0xffffL) << 16 | (long) i_102_ & 0xffffL;
			Class536 class536 = aClass4_10410.method556(l);
			if (class536 != null) {
				Unsafe unsafe = aClass167_Sub3_10395.anUnsafe9548;
				unsafe.putShort((aClass167_Sub3_10395.aLong9586 + (long) (aClass167_Sub3_10395.anInt9552 >> 1) + (long) (anInt10404 * 2)), ((Class536_Sub20) class536).aShort10520);
				anInt10404++;
				return;
			}
		}
		short i_105_ = (short) anInt10402;
		if (l != -1L)
			aClass4_10410.method560(new Class536_Sub20(i_105_), l);
		float f;
		float f_106_;
		float f_107_;
		if (i_100_ == 0 && i_101_ == 0) {
			f = aFloatArrayArray10407[i][i_97_];
			f_106_ = aFloatArrayArray10405[i][i_97_];
			f_107_ = aFloatArrayArray10401[i][i_97_];
		} else if (i_100_ == aClass160_Sub2_10396.anInt1767 * -1504778739 && i_101_ == 0) {
			f = aFloatArrayArray10407[i + 1][i_97_];
			f_106_ = aFloatArrayArray10405[i + 1][i_97_];
			f_107_ = aFloatArrayArray10401[i + 1][i_97_];
		} else if (i_100_ == aClass160_Sub2_10396.anInt1767 * -1504778739 && i_101_ == aClass160_Sub2_10396.anInt1767 * -1504778739) {
			f = aFloatArrayArray10407[i + 1][i_97_ + 1];
			f_106_ = aFloatArrayArray10405[i + 1][i_97_ + 1];
			f_107_ = aFloatArrayArray10401[i + 1][i_97_ + 1];
		} else if (i_100_ == 0 && i_101_ == aClass160_Sub2_10396.anInt1767 * -1504778739) {
			f = aFloatArrayArray10407[i][i_97_ + 1];
			f_106_ = aFloatArrayArray10405[i][i_97_ + 1];
			f_107_ = aFloatArrayArray10401[i][i_97_ + 1];
		} else {
			float f_108_ = ((float) i_100_ / (float) (aClass160_Sub2_10396.anInt1767 * -1504778739));
			float f_109_ = ((float) i_101_ / (float) (aClass160_Sub2_10396.anInt1767 * -1504778739));
			float f_110_ = aFloatArrayArray10407[i][i_97_];
			float f_111_ = aFloatArrayArray10405[i][i_97_];
			float f_112_ = aFloatArrayArray10401[i][i_97_];
			float f_113_ = aFloatArrayArray10407[i + 1][i_97_];
			float f_114_ = aFloatArrayArray10405[i + 1][i_97_];
			float f_115_ = aFloatArrayArray10401[i + 1][i_97_];
			f_110_ += (aFloatArrayArray10407[i][i_97_ + 1] - f_110_) * f_108_;
			f_111_ += (aFloatArrayArray10405[i][i_97_ + 1] - f_111_) * f_108_;
			f_112_ += (aFloatArrayArray10401[i][i_97_ + 1] - f_112_) * f_108_;
			f_113_ += (aFloatArrayArray10407[i + 1][i_97_ + 1] - f_113_) * f_108_;
			f_114_ += (aFloatArrayArray10405[i + 1][i_97_ + 1] - f_114_) * f_108_;
			f_115_ += (aFloatArrayArray10401[i + 1][i_97_ + 1] - f_115_) * f_108_;
			f = f_110_ + (f_113_ - f_110_) * f_109_;
			f_106_ = f_111_ + (f_114_ - f_111_) * f_109_;
			f_107_ = f_112_ + (f_115_ - f_112_) * f_109_;
		}
		float f_116_ = (float) (aClass536_Sub19_10397.method9548(-516860468) - i_102_);
		float f_117_ = (float) (aClass536_Sub19_10397.method9549(187131232) - i_104_);
		float f_118_ = (float) (aClass536_Sub19_10397.method9551((byte) 0) - i_103_);
		float f_119_ = (float) Math.sqrt((double) (f_116_ * f_116_ + f_117_ * f_117_ + f_118_ * f_118_));
		float f_120_ = 1.0F / f_119_;
		f_116_ *= f_120_;
		f_117_ *= f_120_;
		f_118_ *= f_120_;
		float f_121_ = f_119_ / (float) aClass536_Sub19_10397.method9530(840262208);
		float f_122_ = 1.0F - f_121_ * f_121_;
		if (f_122_ < 0.0F)
			f_122_ = 0.0F;
		float f_123_ = f_116_ * f + f_117_ * f_106_ + f_118_ * f_107_;
		if (f_123_ < 0.0F)
			f_123_ = 0.0F;
		float f_124_ = f_123_ * f_122_ * 2.0F;
		if (f_124_ > 1.0F)
			f_124_ = 1.0F;
		int i_125_ = aClass536_Sub19_10397.method9528(1015051593);
		int i_126_ = (int) (f_124_ * (float) (i_125_ >> 16 & 0xff));
		if (i_126_ > 255)
			i_126_ = 255;
		int i_127_ = (int) (f_124_ * (float) (i_125_ >> 8 & 0xff));
		if (i_127_ > 255)
			i_127_ = 255;
		int i_128_ = (int) (f_124_ * (float) (i_125_ & 0xff));
		if (i_128_ > 255)
			i_128_ = 255;
		Unsafe unsafe = aClass167_Sub3_10395.anUnsafe9548;
		unsafe.putFloat(aClass167_Sub3_10395.aLong9586 + (long) (anInt10402 * 16), (float) i_102_);
		unsafe.putFloat((aClass167_Sub3_10395.aLong9586 + (long) (anInt10402 * 16) + 4L), (float) i_104_);
		unsafe.putFloat((aClass167_Sub3_10395.aLong9586 + (long) (anInt10402 * 16) + 8L), (float) i_103_);
		if (aClass167_Sub3_10395.anInt9689 == 0) {
			unsafe.putByte((aClass167_Sub3_10395.aLong9586 + (long) (anInt10402 * 16) + 12L), (byte) i_128_);
			unsafe.putByte((aClass167_Sub3_10395.aLong9586 + (long) (anInt10402 * 16) + 13L), (byte) i_127_);
			unsafe.putByte((aClass167_Sub3_10395.aLong9586 + (long) (anInt10402 * 16) + 14L), (byte) i_126_);
		} else {
			unsafe.putByte((aClass167_Sub3_10395.aLong9586 + (long) (anInt10402 * 16) + 12L), (byte) i_126_);
			unsafe.putByte((aClass167_Sub3_10395.aLong9586 + (long) (anInt10402 * 16) + 13L), (byte) i_127_);
			unsafe.putByte((aClass167_Sub3_10395.aLong9586 + (long) (anInt10402 * 16) + 14L), (byte) i_128_);
		}
		unsafe.putByte((aClass167_Sub3_10395.aLong9586 + (long) (anInt10402 * 16) + 15L), (byte) -1);
		anInt10402++;
		unsafe.putShort((aClass167_Sub3_10395.aLong9586 + (long) (aClass167_Sub3_10395.anInt9552 >> 1) + (long) (anInt10404 * 2)), i_105_);
		anInt10404++;
	}

	void method9401() {
		anInterface41_10408 = aClass167_Sub3_10395.method8804(false);
		anInterface41_10408.method283(anInt10404);
		anInterface38_10406 = aClass167_Sub3_10395.method8805(false);
		anInterface38_10406.method271(anInt10402 * 16, 16);
		anInterface38_10406.method264(0, anInt10402 * 16, aClass167_Sub3_10395.aLong9586);
		anInterface41_10408.method264(0, anInt10404 * 2, (aClass167_Sub3_10395.aLong9586 + (long) (aClass167_Sub3_10395.anInt9552 >> 1)));
	}
}
