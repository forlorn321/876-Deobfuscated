/* Class177_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.nio.ByteBuffer;

import sun.misc.Unsafe;

public class Class177_Sub2 extends Class177 {
	byte[] aByteArray9448;
	static final int anInt9449 = 7;
	Class167_Sub3 aClass167_Sub3_9450;
	int[][] anIntArrayArray9451;
	int anInt9452;
	boolean aBool9453;
	short aShort9454;
	int anInt9455 = 0;
	int anInt9456 = 0;
	int anInt9457;
	int[] anIntArray9458;
	static final int anInt9459 = 4;
	int[][] anIntArrayArray9460;
	short[] aShortArray9461;
	int anInt9462 = 0;
	short[] aShortArray9463;
	Class156[] aClass156Array9464;
	boolean aBool9465;
	short[] aShortArray9466;
	short[] aShortArray9467;
	int[] anIntArray9468;
	float[] aFloatArray9469;
	float[] aFloatArray9470;
	boolean aBool9471;
	int anInt9472 = 0;
	int anInt9473;
	static Class351 aClass351_9474;
	int[] anIntArray9475;
	int[] anIntArray9476;
	short[] aShortArray9477;
	int anInt9478;
	short[] aShortArray9479;
	int[][] anIntArrayArray9480;
	short[] aShortArray9481;
	Class348 aClass348_9482;
	Class375 aClass375_9483;
	Class375 aClass375_9484;
	Class375 aClass375_9485;
	Class375 aClass375_9486;
	boolean aBool9487;
	short[] aShortArray9488;
	boolean aBool9489;
	short[] aShortArray9490;
	int anInt9491;
	int anInt9492;
	int[] anIntArray9493;
	short aShort9494;
	int anInt9495;
	int anInt9496;
	int anInt9497;
	int anInt9498;
	int anInt9499;
	short[] aShortArray9500;
	int anInt9501;
	int[] anIntArray9502;
	int[] anIntArray9503;
	int[] anIntArray9504;
	Class373 aClass373_9505;
	short[] aShortArray9506;
	int[] anIntArray9507;
	boolean aBool9508;
	int anInt9509;
	Class372[] aClass372Array9510;
	Class346[] aClass346Array9511;
	byte[] aByteArray9512;
	long[] aLongArray9513;
	float[] aFloatArray9514;
	short[] aShortArray9515;
	int[] anIntArray9516;
	Class172[] aClass172Array9517;
	short[] aShortArray9518;
	int[] anIntArray9519;
	int anInt9520;
	int anInt9521;
	int anInt9522;
	boolean aBool9523;
	int[] anIntArray9524;

	public void method2526(int i) {
		int i_0_ = Class447.anIntArray4906[i];
		int i_1_ = Class447.anIntArray4921[i];
		for (int i_2_ = 0; i_2_ < anInt9456; i_2_++) {
			int i_3_ = (anIntArray9458[i_2_] * i_1_ - anIntArray9493[i_2_] * i_0_ >> 14);
			anIntArray9493[i_2_] = (anIntArray9458[i_2_] * i_0_ + anIntArray9493[i_2_] * i_1_ >> 14);
			anIntArray9458[i_2_] = i_3_;
		}
		method8677();
		aBool9471 = false;
	}

	Class177_Sub2(Class167_Sub3 class167_sub3, Class180 class180, int i, int i_4_, int i_5_, int i_6_) {
		this(class167_sub3, i, i_6_, true, false);
		Class174 class174 = class167_sub3.aClass174_1852;
		Interface47 interface47 = class167_sub3.anInterface47_1867;
		int[] is = new int[class180.anInt1961];
		anIntArray9468 = new int[class180.anInt1951 + 1];
		for (int i_7_ = 0; i_7_ < class180.anInt1961; i_7_++) {
			if (class180.aByteArray1968 == null || class180.aByteArray1968[i_7_] != 2) {
				if (class180.aShortArray1957 != null && class180.aShortArray1957[i_7_] != -1) {
					Class164 class164 = class174.method2446((class180.aShortArray1957[i_7_] & 0xffff), -943388612);
					if (((anInt9452 & 0x40) == 0 || !class164.aBool1820) && class164.aBool1822)
						continue;
				}
				is[anInt9472++] = i_7_;
				anIntArray9468[class180.aShortArray1962[i_7_]]++;
				anIntArray9468[class180.aShortArray1979[i_7_]]++;
				anIntArray9468[class180.aShortArray1964[i_7_]]++;
			}
		}
		anInt9457 = anInt9472;
		long[] ls = new long[anInt9472];
		boolean bool = (anInt9473 & 0x100) != 0;
		for (int i_8_ = 0; i_8_ < anInt9472; i_8_++) {
			int i_9_ = is[i_8_];
			Class164 class164 = null;
			int i_10_ = 0;
			int i_11_ = 0;
			int i_12_ = 0;
			int i_13_ = 0;
			if (class180.aClass170Array1994 != null) {
				boolean bool_14_ = false;
				for (int i_15_ = 0; i_15_ < class180.aClass170Array1994.length; i_15_++) {
					Class170 class170 = class180.aClass170Array1994[i_15_];
					if (i_9_ == class170.anInt1892 * -479439647) {
						Class400 class400 = interface47.method335((class170.anInt1894 * 1249223187), (byte) -6);
						if (class400.aBool4136)
							bool_14_ = true;
						if (class400.anInt4130 * -428264537 != -1) {
							Class164 class164_16_ = class174.method2446((class400.anInt4130 * -428264537), -2014862094);
							if (class164_16_.aClass595_1805 == Class595.aClass595_7819)
								aBool9489 = true;
						}
					}
				}
				if (bool_14_) {
					ls[i_8_] = 9223372036854775807L;
					anInt9457--;
					continue;
				}
			}
			if (class180.aClass172Array1992 != null) {
				boolean bool_17_ = false;
				for (int i_18_ = 0; i_18_ < class180.aClass172Array1992.length; i_18_++) {
					Class172 class172 = class180.aClass172Array1992[i_18_];
					if (i_9_ == class172.anInt1908 * 1443923489) {
						Class381 class381 = (aClass167_Sub3_9450.anInterface48_1854.method338(class172.anInt1906 * -1649091331, (byte) 58));
						if (class381.aBool3941)
							bool_17_ = true;
					}
				}
				if (bool_17_) {
					ls[i_8_] = 9223372036854775807L;
					anInt9457--;
					continue;
				}
			}
			int i_19_ = -1;
			if (class180.aShortArray1957 != null) {
				i_19_ = class180.aShortArray1957[i_9_];
				if (i_19_ != -1) {
					class164 = class174.method2446(i_19_ & 0xffff, -386586869);
					if ((anInt9452 & 0x40) == 0 || !class164.aBool1820) {
						i_12_ = class164.aByte1797;
						i_13_ = class164.aByte1823;
					} else {
						i_19_ = -1;
						class164 = null;
					}
				}
			}
			boolean bool_20_ = ((class180.aByteArray1970 != null && class180.aByteArray1970[i_9_] != 0) || (class164 != null && class164.aClass595_1805 != Class595.aClass595_7820));
			if ((bool || bool_20_) && class180.aByteArray1969 != null)
				i_10_ += class180.aByteArray1969[i_9_] << 17;
			if (bool_20_)
				i_10_ += 65536;
			i_10_ += (i_12_ & 0xff) << 8;
			i_10_ += i_13_ & 0xff;
			i_11_ += (i_19_ & 0xffff) << 16;
			i_11_ += i_8_ & 0xffff;
			ls[i_8_] = ((long) i_10_ << 32) + (long) i_11_;
			aBool9489 |= bool_20_;
			Class177_Sub2 class177_sub2_21_ = this;
			class177_sub2_21_.aBool9508 = (class177_sub2_21_.aBool9508 | (class164 != null && (class164.aByte1802 != 0 || class164.aByte1803 != 0)));
		}
		Class535.method6480(ls, is, (byte) -71);
		anInt9455 = class180.anInt1947;
		anInt9456 = class180.anInt1951;
		anIntArray9524 = class180.anIntArray1952;
		anIntArray9458 = class180.anIntArray1981;
		anIntArray9493 = class180.anIntArray1978;
		aShortArray9461 = class180.aShortArray1958;
		Class370[] class370s = new Class370[anInt9456];
		aClass172Array9517 = class180.aClass172Array1992;
		aClass156Array9464 = class180.aClass156Array1993;
		if (class180.aClass170Array1994 != null) {
			anInt9509 = class180.aClass170Array1994.length;
			aClass372Array9510 = new Class372[anInt9509];
			aClass346Array9511 = new Class346[anInt9509];
			for (int i_22_ = 0; i_22_ < anInt9509; i_22_++) {
				Class170 class170 = class180.aClass170Array1994[i_22_];
				Class400 class400 = interface47.method335(class170.anInt1894 * 1249223187, (byte) -99);
				int i_23_ = -1;
				for (int i_24_ = 0; i_24_ < anInt9472; i_24_++) {
					if (is[i_24_] == class170.anInt1892 * -479439647) {
						i_23_ = i_24_;
						break;
					}
				}
				if (i_23_ == -1)
					throw new RuntimeException();
				int i_25_ = ((ColourUtils.anIntArray8309[(class180.aShortArray1972[class170.anInt1892 * -479439647]) & 0xffff]) & 0xffffff);
				i_25_ = i_25_ | 255 - (class180.aByteArray1970 != null ? (class180.aByteArray1970[class170.anInt1892 * -479439647]) : 0) << 24;
				aClass372Array9510[i_22_] = new Class372(i_23_, (class180.aShortArray1962[class170.anInt1892 * -479439647]), (class180.aShortArray1979[class170.anInt1892 * -479439647]), (class180.aShortArray1964[class170.anInt1892 * -479439647]), class400.anInt4131 * -1116339673, class400.anInt4132 * 1459124959, class400.anInt4130 * -428264537, class400.anInt4135 * 303721477, class400.anInt4133 * -1199139105, class400.aBool4136, class400.aBool4134, class170.anInt1893 * 1430346167);
				aClass346Array9511[i_22_] = new Class346(i_25_);
			}
		}
		int i_26_ = anInt9472 * 3;
		aShortArray9515 = new short[i_26_];
		aShortArray9518 = new short[i_26_];
		aShortArray9500 = new short[i_26_];
		aShortArray9466 = new short[i_26_];
		aShortArray9467 = new short[i_26_];
		aByteArray9512 = new byte[i_26_];
		aFloatArray9469 = new float[i_26_];
		aFloatArray9470 = new float[i_26_];
		aShortArray9490 = new short[anInt9472];
		aByteArray9448 = new byte[anInt9472];
		aShortArray9463 = new short[anInt9472];
		aShortArray9477 = new short[anInt9472];
		aShortArray9488 = new short[anInt9472];
		aShortArray9479 = new short[anInt9472];
		if (class180.aShortArray1976 != null)
			aShortArray9481 = new short[anInt9472];
		aShort9494 = (short) i_4_;
		aShort9454 = (short) i_5_;
		aShortArray9506 = new short[i_26_];
		aLongArray9513 = new long[i_26_];
		int i_27_ = 0;
		for (int i_28_ = 0; i_28_ < class180.anInt1951; i_28_++) {
			int i_29_ = anIntArray9468[i_28_];
			anIntArray9468[i_28_] = i_27_;
			i_27_ += i_29_;
			class370s[i_28_] = new Class370();
		}
		anIntArray9468[class180.anInt1951] = i_27_;
		Class163 class163 = method2494(class180, is, anInt9472);
		Class368[] class368s = new Class368[class180.anInt1961];
		for (int i_30_ = 0; i_30_ < class180.anInt1961; i_30_++) {
			short i_31_ = class180.aShortArray1962[i_30_];
			short i_32_ = class180.aShortArray1979[i_30_];
			short i_33_ = class180.aShortArray1964[i_30_];
			int i_34_ = anIntArray9524[i_32_] - anIntArray9524[i_31_];
			int i_35_ = anIntArray9458[i_32_] - anIntArray9458[i_31_];
			int i_36_ = anIntArray9493[i_32_] - anIntArray9493[i_31_];
			int i_37_ = anIntArray9524[i_33_] - anIntArray9524[i_31_];
			int i_38_ = anIntArray9458[i_33_] - anIntArray9458[i_31_];
			int i_39_ = anIntArray9493[i_33_] - anIntArray9493[i_31_];
			int i_40_ = i_35_ * i_39_ - i_38_ * i_36_;
			int i_41_ = i_36_ * i_37_ - i_39_ * i_34_;
			int i_42_;
			for (i_42_ = i_34_ * i_38_ - i_37_ * i_35_; (i_40_ > 8192 || i_41_ > 8192 || i_42_ > 8192 || i_40_ < -8192 || i_41_ < -8192 || i_42_ < -8192); i_42_ >>= 1) {
				i_40_ >>= 1;
				i_41_ >>= 1;
			}
			int i_43_ = (int) Math.sqrt((double) (i_40_ * i_40_ + i_41_ * i_41_ + i_42_ * i_42_));
			if (i_43_ <= 0)
				i_43_ = 1;
			i_40_ = i_40_ * 256 / i_43_;
			i_41_ = i_41_ * 256 / i_43_;
			i_42_ = i_42_ * 256 / i_43_;
			byte i_44_ = (class180.aByteArray1968 == null ? (byte) 0 : class180.aByteArray1968[i_30_]);
			if (i_44_ == 0) {
				Class370 class370 = class370s[i_31_];
				class370.anInt3879 += i_40_;
				class370.anInt3878 += i_41_;
				class370.anInt3876 += i_42_;
				class370.anInt3877++;
				class370 = class370s[i_32_];
				class370.anInt3879 += i_40_;
				class370.anInt3878 += i_41_;
				class370.anInt3876 += i_42_;
				class370.anInt3877++;
				class370 = class370s[i_33_];
				class370.anInt3879 += i_40_;
				class370.anInt3878 += i_41_;
				class370.anInt3876 += i_42_;
				class370.anInt3877++;
			} else if (i_44_ == 1) {
				Class368 class368 = class368s[i_30_] = new Class368();
				class368.anInt3868 = i_40_;
				class368.anInt3867 = i_41_;
				class368.anInt3866 = i_42_;
			}
		}
		for (int i_45_ = 0; i_45_ < anInt9472; i_45_++) {
			int i_46_ = is[i_45_];
			int i_47_ = class180.aShortArray1972[i_46_] & 0xffff;
			int i_48_ = (class180.aByteArray1970 != null ? class180.aByteArray1970[i_46_] & 0xff : 0);
			short i_49_ = (class180.aShortArray1957 == null ? (short) -1 : class180.aShortArray1957[i_46_]);
			if (i_49_ != -1 && (anInt9452 & 0x40) != 0 && class174.method2446(i_49_, -1536557001).aBool1820)
				i_49_ = (short) -1;
			float f = 0.0F;
			float f_50_ = 0.0F;
			float f_51_ = 0.0F;
			float f_52_ = 0.0F;
			float f_53_ = 0.0F;
			float f_54_ = 0.0F;
			long l;
			long l_55_;
			long l_56_;
			if (i_49_ != -1) {
				int i_57_ = (class180.aShortArray1982 != null ? class180.aShortArray1982[i_46_] : -1);
				if (i_57_ == 32766) {
					int i_58_ = class180.aByteArray1965[i_46_] & 0xff;
					int i_59_ = class180.aByteArray1966[i_46_] & 0xff;
					int i_60_ = class180.aByteArray1967[i_46_] & 0xff;
					i_58_ += (class180.anIntArray1955[class180.aShortArray1962[i_46_]]);
					l_56_ = (long) i_58_;
					i_59_ += (class180.anIntArray1955[class180.aShortArray1979[i_46_]]);
					l_55_ = (long) i_58_;
					i_60_ += (class180.anIntArray1955[class180.aShortArray1964[i_46_]]);
					l = (long) i_58_;
					f = class180.aFloatArray1959[i_58_];
					f_50_ = class180.aFloatArray1960[i_58_];
					f_51_ = class180.aFloatArray1959[i_59_];
					f_52_ = class180.aFloatArray1960[i_59_];
					f_53_ = class180.aFloatArray1959[i_60_];
					f_54_ = class180.aFloatArray1960[i_60_];
				} else if (i_57_ == -1) {
					f = 0.0F;
					f_50_ = 1.0F;
					l_56_ = 65535L;
					f_51_ = 1.0F;
					f_52_ = 1.0F;
					l_55_ = 131071L;
					f_53_ = 0.0F;
					f_54_ = 0.0F;
					l = 196607L;
				} else {
					i_57_ &= 0xffff;
					int i_61_ = 0;
					int i_62_ = 0;
					int i_63_ = 0;
					byte i_64_ = class180.aByteArray1980[i_57_];
					if (i_64_ == 0) {
						short i_65_ = class180.aShortArray1962[i_46_];
						short i_66_ = class180.aShortArray1979[i_46_];
						short i_67_ = class180.aShortArray1964[i_46_];
						short i_68_ = class180.aShortArray1984[i_57_];
						short i_69_ = class180.aShortArray1954[i_57_];
						short i_70_ = class180.aShortArray1956[i_57_];
						float f_71_ = (float) class180.anIntArray1952[i_68_];
						float f_72_ = (float) class180.anIntArray1981[i_68_];
						float f_73_ = (float) class180.anIntArray1978[i_68_];
						float f_74_ = (float) class180.anIntArray1952[i_69_] - f_71_;
						float f_75_ = (float) class180.anIntArray1981[i_69_] - f_72_;
						float f_76_ = (float) class180.anIntArray1978[i_69_] - f_73_;
						float f_77_ = (float) class180.anIntArray1952[i_70_] - f_71_;
						float f_78_ = (float) class180.anIntArray1981[i_70_] - f_72_;
						float f_79_ = (float) class180.anIntArray1978[i_70_] - f_73_;
						float f_80_ = (float) class180.anIntArray1952[i_65_] - f_71_;
						float f_81_ = (float) class180.anIntArray1981[i_65_] - f_72_;
						float f_82_ = (float) class180.anIntArray1978[i_65_] - f_73_;
						float f_83_ = (float) class180.anIntArray1952[i_66_] - f_71_;
						float f_84_ = (float) class180.anIntArray1981[i_66_] - f_72_;
						float f_85_ = (float) class180.anIntArray1978[i_66_] - f_73_;
						float f_86_ = (float) class180.anIntArray1952[i_67_] - f_71_;
						float f_87_ = (float) class180.anIntArray1981[i_67_] - f_72_;
						float f_88_ = (float) class180.anIntArray1978[i_67_] - f_73_;
						float f_89_ = f_75_ * f_79_ - f_76_ * f_78_;
						float f_90_ = f_76_ * f_77_ - f_74_ * f_79_;
						float f_91_ = f_74_ * f_78_ - f_75_ * f_77_;
						float f_92_ = f_78_ * f_91_ - f_79_ * f_90_;
						float f_93_ = f_79_ * f_89_ - f_77_ * f_91_;
						float f_94_ = f_77_ * f_90_ - f_78_ * f_89_;
						float f_95_ = 1.0F / (f_92_ * f_74_ + f_93_ * f_75_ + f_94_ * f_76_);
						f = ((f_92_ * f_80_ + f_93_ * f_81_ + f_94_ * f_82_) * f_95_);
						f_51_ = (f_92_ * f_83_ + f_93_ * f_84_ + f_94_ * f_85_) * f_95_;
						f_53_ = (f_92_ * f_86_ + f_93_ * f_87_ + f_94_ * f_88_) * f_95_;
						f_92_ = f_75_ * f_91_ - f_76_ * f_90_;
						f_93_ = f_76_ * f_89_ - f_74_ * f_91_;
						f_94_ = f_74_ * f_90_ - f_75_ * f_89_;
						f_95_ = 1.0F / (f_92_ * f_77_ + f_93_ * f_78_ + f_94_ * f_79_);
						f_50_ = (f_92_ * f_80_ + f_93_ * f_81_ + f_94_ * f_82_) * f_95_;
						f_52_ = (f_92_ * f_83_ + f_93_ * f_84_ + f_94_ * f_85_) * f_95_;
						f_54_ = (f_92_ * f_86_ + f_93_ * f_87_ + f_94_ * f_88_) * f_95_;
					} else {
						short i_96_ = class180.aShortArray1962[i_46_];
						short i_97_ = class180.aShortArray1979[i_46_];
						short i_98_ = class180.aShortArray1964[i_46_];
						int i_99_ = class163.anIntArray1775[i_57_];
						int i_100_ = class163.anIntArray1776[i_57_];
						int i_101_ = class163.anIntArray1777[i_57_];
						float[] fs = class163.aFloatArrayArray1778[i_57_];
						byte i_102_ = class180.aByteArray1991[i_57_];
						float f_103_ = (float) class180.anIntArray1946[i_57_] / 256.0F;
						if (i_64_ == 1) {
							float f_104_ = ((float) class180.anIntArray1986[i_57_] / 1024.0F);
							method2616(class180.anIntArray1952[i_96_], class180.anIntArray1981[i_96_], class180.anIntArray1978[i_96_], i_99_, i_100_, i_101_, fs, f_104_, i_102_, f_103_, aFloatArray9514);
							f = aFloatArray9514[0];
							f_50_ = aFloatArray9514[1];
							method2616(class180.anIntArray1952[i_97_], class180.anIntArray1981[i_97_], class180.anIntArray1978[i_97_], i_99_, i_100_, i_101_, fs, f_104_, i_102_, f_103_, aFloatArray9514);
							f_51_ = aFloatArray9514[0];
							f_52_ = aFloatArray9514[1];
							method2616(class180.anIntArray1952[i_98_], class180.anIntArray1981[i_98_], class180.anIntArray1978[i_98_], i_99_, i_100_, i_101_, fs, f_104_, i_102_, f_103_, aFloatArray9514);
							f_53_ = aFloatArray9514[0];
							f_54_ = aFloatArray9514[1];
							float f_105_ = f_104_ / 2.0F;
							if ((i_102_ & 0x1) == 0) {
								if (f_51_ - f > f_105_) {
									f_51_ -= f_104_;
									i_62_ = 1;
								} else if (f - f_51_ > f_105_) {
									f_51_ += f_104_;
									i_62_ = 2;
								}
								if (f_53_ - f > f_105_) {
									f_53_ -= f_104_;
									i_63_ = 1;
								} else if (f - f_53_ > f_105_) {
									f_53_ += f_104_;
									i_63_ = 2;
								}
							} else {
								if (f_52_ - f_50_ > f_105_) {
									f_52_ -= f_104_;
									i_62_ = 1;
								} else if (f_50_ - f_52_ > f_105_) {
									f_52_ += f_104_;
									i_62_ = 2;
								}
								if (f_54_ - f_50_ > f_105_) {
									f_54_ -= f_104_;
									i_63_ = 1;
								} else if (f_50_ - f_54_ > f_105_) {
									f_54_ += f_104_;
									i_63_ = 2;
								}
							}
						} else if (i_64_ == 2) {
							float f_106_ = ((float) class180.anIntArray1988[i_57_] / 256.0F);
							float f_107_ = ((float) class180.anIntArray1948[i_57_] / 256.0F);
							int i_108_ = (class180.anIntArray1952[i_97_] - class180.anIntArray1952[i_96_]);
							int i_109_ = (class180.anIntArray1981[i_97_] - class180.anIntArray1981[i_96_]);
							int i_110_ = (class180.anIntArray1978[i_97_] - class180.anIntArray1978[i_96_]);
							int i_111_ = (class180.anIntArray1952[i_98_] - class180.anIntArray1952[i_96_]);
							int i_112_ = (class180.anIntArray1981[i_98_] - class180.anIntArray1981[i_96_]);
							int i_113_ = (class180.anIntArray1978[i_98_] - class180.anIntArray1978[i_96_]);
							int i_114_ = i_109_ * i_113_ - i_112_ * i_110_;
							int i_115_ = i_110_ * i_111_ - i_113_ * i_108_;
							int i_116_ = i_108_ * i_112_ - i_111_ * i_109_;
							float f_117_ = (64.0F / (float) class180.anIntArray1950[i_57_]);
							float f_118_ = (64.0F / (float) class180.anIntArray1985[i_57_]);
							float f_119_ = (64.0F / (float) class180.anIntArray1986[i_57_]);
							float f_120_ = (((float) i_114_ * fs[0] + (float) i_115_ * fs[1] + (float) i_116_ * fs[2]) / f_117_);
							float f_121_ = (((float) i_114_ * fs[3] + (float) i_115_ * fs[4] + (float) i_116_ * fs[5]) / f_118_);
							float f_122_ = (((float) i_114_ * fs[6] + (float) i_115_ * fs[7] + (float) i_116_ * fs[8]) / f_119_);
							i_61_ = method2460(f_120_, f_121_, f_122_);
							method2461(class180.anIntArray1952[i_96_], class180.anIntArray1981[i_96_], class180.anIntArray1978[i_96_], i_99_, i_100_, i_101_, i_61_, fs, i_102_, f_103_, f_106_, f_107_, aFloatArray9514);
							f = aFloatArray9514[0];
							f_50_ = aFloatArray9514[1];
							method2461(class180.anIntArray1952[i_97_], class180.anIntArray1981[i_97_], class180.anIntArray1978[i_97_], i_99_, i_100_, i_101_, i_61_, fs, i_102_, f_103_, f_106_, f_107_, aFloatArray9514);
							f_51_ = aFloatArray9514[0];
							f_52_ = aFloatArray9514[1];
							method2461(class180.anIntArray1952[i_98_], class180.anIntArray1981[i_98_], class180.anIntArray1978[i_98_], i_99_, i_100_, i_101_, i_61_, fs, i_102_, f_103_, f_106_, f_107_, aFloatArray9514);
							f_53_ = aFloatArray9514[0];
							f_54_ = aFloatArray9514[1];
						} else if (i_64_ == 3) {
							method2492(class180.anIntArray1952[i_96_], class180.anIntArray1981[i_96_], class180.anIntArray1978[i_96_], i_99_, i_100_, i_101_, fs, i_102_, f_103_, aFloatArray9514);
							f = aFloatArray9514[0];
							f_50_ = aFloatArray9514[1];
							method2492(class180.anIntArray1952[i_97_], class180.anIntArray1981[i_97_], class180.anIntArray1978[i_97_], i_99_, i_100_, i_101_, fs, i_102_, f_103_, aFloatArray9514);
							f_51_ = aFloatArray9514[0];
							f_52_ = aFloatArray9514[1];
							method2492(class180.anIntArray1952[i_98_], class180.anIntArray1981[i_98_], class180.anIntArray1978[i_98_], i_99_, i_100_, i_101_, fs, i_102_, f_103_, aFloatArray9514);
							f_53_ = aFloatArray9514[0];
							f_54_ = aFloatArray9514[1];
							if ((i_102_ & 0x1) == 0) {
								if (f_51_ - f > 0.5F) {
									f_51_--;
									i_62_ = 1;
								} else if (f - f_51_ > 0.5F) {
									f_51_++;
									i_62_ = 2;
								}
								if (f_53_ - f > 0.5F) {
									f_53_--;
									i_63_ = 1;
								} else if (f - f_53_ > 0.5F) {
									f_53_++;
									i_63_ = 2;
								}
							} else {
								if (f_52_ - f_50_ > 0.5F) {
									f_52_--;
									i_62_ = 1;
								} else if (f_50_ - f_52_ > 0.5F) {
									f_52_++;
									i_62_ = 2;
								}
								if (f_54_ - f_50_ > 0.5F) {
									f_54_--;
									i_63_ = 1;
								} else if (f_50_ - f_54_ > 0.5F) {
									f_54_++;
									i_63_ = 2;
								}
							}
						}
					}
					l_56_ = (long) (i_61_ << 16 | i_57_);
					l_55_ = (long) (i_62_ << 19) | l_56_;
					l = (long) (i_63_ << 19) | l_56_;
				}
			} else {
				l = 0L;
				l_55_ = 0L;
				l_56_ = 0L;
			}
			byte i_123_ = (class180.aByteArray1968 != null ? class180.aByteArray1968[i_46_] : (byte) 0);
			if (i_123_ == 0) {
				long l_124_ = (long) ((i_47_ << 8) + i_48_);
				short i_125_ = class180.aShortArray1962[i_46_];
				short i_126_ = class180.aShortArray1979[i_46_];
				short i_127_ = class180.aShortArray1964[i_46_];
				Class370 class370 = class370s[i_125_];
				aShortArray9463[i_45_] = method8695(class180, i_125_, i_45_, l_124_ | l_56_ << 24, class370.anInt3879, class370.anInt3878, class370.anInt3876, class370.anInt3877, f, f_50_);
				class370 = class370s[i_126_];
				aShortArray9477[i_45_] = method8695(class180, i_126_, i_45_, l_124_ | l_55_ << 24, class370.anInt3879, class370.anInt3878, class370.anInt3876, class370.anInt3877, f_51_, f_52_);
				class370 = class370s[i_127_];
				aShortArray9488[i_45_] = method8695(class180, i_127_, i_45_, l_124_ | l << 24, class370.anInt3879, class370.anInt3878, class370.anInt3876, class370.anInt3877, f_53_, f_54_);
			} else if (i_123_ == 1) {
				Class368 class368 = class368s[i_46_];
				long l_128_ = (((long) (class368.anInt3868 & ~0x7fffffff) << 9) + ((long) (class368.anInt3867 + 256) << 32) + ((long) (class368.anInt3866 + 256) << 24) + (long) (i_47_ << 8) + (long) i_48_);
				aShortArray9463[i_45_] = method8695(class180, class180.aShortArray1962[i_46_], i_45_, l_128_ | l_56_ << 41, class368.anInt3868, class368.anInt3867, class368.anInt3866, 0, f, f_50_);
				aShortArray9477[i_45_] = method8695(class180, class180.aShortArray1979[i_46_], i_45_, l_128_ | l_56_ << 41, class368.anInt3868, class368.anInt3867, class368.anInt3866, 0, f_51_, f_52_);
				aShortArray9488[i_45_] = method8695(class180, class180.aShortArray1964[i_46_], i_45_, l_128_ | l_56_ << 41, class368.anInt3868, class368.anInt3867, class368.anInt3866, 0, f_53_, f_54_);
			}
			if (class180.aByteArray1970 != null)
				aByteArray9448[i_45_] = class180.aByteArray1970[i_46_];
			if (class180.aShortArray1976 != null)
				aShortArray9481[i_45_] = class180.aShortArray1976[i_46_];
			aShortArray9490[i_45_] = class180.aShortArray1972[i_46_];
			aShortArray9479[i_45_] = i_49_;
		}
		if (anInt9457 > 0) {
			int i_129_ = 1;
			short i_130_ = aShortArray9479[0];
			for (int i_131_ = 0; i_131_ < anInt9457; i_131_++) {
				short i_132_ = aShortArray9479[i_131_];
				if (i_132_ != i_130_) {
					i_129_++;
					i_130_ = i_132_;
				}
			}
			anIntArray9503 = new int[i_129_];
			anIntArray9504 = new int[i_129_];
			anIntArray9507 = new int[i_129_ + 1];
			anIntArray9507[0] = 0;
			int i_133_ = anInt9462;
			int i_134_ = 0;
			i_129_ = 0;
			i_130_ = aShortArray9479[0];
			for (int i_135_ = 0; i_135_ < anInt9457; i_135_++) {
				short i_136_ = aShortArray9479[i_135_];
				if (i_136_ != i_130_) {
					anIntArray9503[i_129_] = i_133_;
					anIntArray9504[i_129_] = i_134_ - i_133_ + 1;
					anIntArray9507[++i_129_] = i_135_;
					i_133_ = anInt9462;
					i_134_ = 0;
					i_130_ = i_136_;
				}
				int i_137_ = aShortArray9463[i_135_] & 0xffff;
				if (i_137_ < i_133_)
					i_133_ = i_137_;
				if (i_137_ > i_134_)
					i_134_ = i_137_;
				i_137_ = aShortArray9477[i_135_] & 0xffff;
				if (i_137_ < i_133_)
					i_133_ = i_137_;
				if (i_137_ > i_134_)
					i_134_ = i_137_;
				i_137_ = aShortArray9488[i_135_] & 0xffff;
				if (i_137_ < i_133_)
					i_133_ = i_137_;
				if (i_137_ > i_134_)
					i_134_ = i_137_;
			}
			anIntArray9503[i_129_] = i_133_;
			anIntArray9504[i_129_] = i_134_ - i_133_ + 1;
			anIntArray9507[++i_129_] = anInt9457;
		}
		aLongArray9513 = null;
		aShortArray9515 = method8675(aShortArray9515, anInt9462);
		aShortArray9518 = method8675(aShortArray9518, anInt9462);
		aShortArray9500 = method8675(aShortArray9500, anInt9462);
		aShortArray9466 = method8675(aShortArray9466, anInt9462);
		aShortArray9467 = method8675(aShortArray9467, anInt9462);
		aByteArray9512 = method8674(aByteArray9512, anInt9462);
		aFloatArray9469 = method8676(aFloatArray9469, anInt9462);
		aFloatArray9470 = method8676(aFloatArray9470, anInt9462);
		if (class180.anIntArray1953 != null && Class345.method4518(i, anInt9452))
			anIntArrayArray9460 = class180.method2702(false);
		if (class180.aClass170Array1994 != null && Class345.method4519(i, anInt9452))
			anIntArrayArray9451 = class180.method2710();
		if (class180.anIntArray1974 != null && Class345.method4517(i, anInt9452)) {
			int i_138_ = 0;
			int[] is_139_ = new int[256];
			for (int i_140_ = 0; i_140_ < anInt9472; i_140_++) {
				int i_141_ = class180.anIntArray1974[is[i_140_]];
				if (i_141_ >= 0) {
					is_139_[i_141_]++;
					if (i_141_ > i_138_)
						i_138_ = i_141_;
				}
			}
			anIntArrayArray9480 = new int[i_138_ + 1][];
			for (int i_142_ = 0; i_142_ <= i_138_; i_142_++) {
				anIntArrayArray9480[i_142_] = new int[is_139_[i_142_]];
				is_139_[i_142_] = 0;
			}
			for (int i_143_ = 0; i_143_ < anInt9472; i_143_++) {
				int i_144_ = class180.anIntArray1974[is[i_143_]];
				if (i_144_ >= 0)
					anIntArrayArray9480[i_144_][is_139_[i_144_]++] = i_143_;
			}
		}
	}

	public Class156[] method2600() {
		return aClass156Array9464;
	}

	static byte[] method8674(byte[] is, int i) {
		byte[] is_145_ = new byte[i];
		System.arraycopy(is, 0, is_145_, 0, i);
		return is_145_;
	}

	static short[] method8675(short[] is, int i) {
		short[] is_146_ = new short[i];
		System.arraycopy(is, 0, is_146_, 0, i);
		return is_146_;
	}

	static float[] method8676(float[] fs, int i) {
		float[] fs_147_ = new float[i];
		System.arraycopy(fs, 0, fs_147_, 0, i);
		return fs_147_;
	}

	public int method2458() {
		if (!aBool9471)
			method8681();
		return anInt9497;
	}

	public void method2467() {
		if (anInt9462 > 0 && anInt9457 > 0) {
			method8689();
			method8688();
			method8694();
		}
	}

	public Class177 method2623(byte i, int i_148_, boolean bool) {
		boolean bool_149_ = false;
		Class177_Sub2 class177_sub2_150_;
		Class177_Sub2 class177_sub2_151_;
		if (i > 0 && i <= 8) {
			class177_sub2_151_ = aClass167_Sub3_9450.aClass177_Sub2Array9699[i - 1];
			class177_sub2_150_ = aClass167_Sub3_9450.aClass177_Sub2Array9710[i - 1];
			bool_149_ = true;
		} else
			class177_sub2_150_ = class177_sub2_151_ = new Class177_Sub2(aClass167_Sub3_9450, 0, 0, true, false);
		return method8697(class177_sub2_150_, class177_sub2_151_, i_148_, bool_149_, bool);
	}

	public void method2532(int i, int i_152_, int i_153_) {
		for (int i_154_ = 0; i_154_ < anInt9456; i_154_++) {
			if (i != 128)
				anIntArray9524[i_154_] = anIntArray9524[i_154_] * i >> 7;
			if (i_152_ != 128)
				anIntArray9458[i_154_] = anIntArray9458[i_154_] * i_152_ >> 7;
			if (i_153_ != 128)
				anIntArray9493[i_154_] = anIntArray9493[i_154_] * i_153_ >> 7;
		}
		method8677();
		aBool9471 = false;
	}

	public void method2607(int i) {
		aShort9454 = (short) i;
		method8677();
		method8679();
	}

	void method8677() {
		if (aClass375_9483 != null)
			aClass375_9483.aBool3911 = false;
	}

	void method8678() {
		if (aClass375_9484 != null)
			aClass375_9484.aBool3911 = false;
	}

	void method8679() {
		if ((anInt9452 & 0x37) != 0) {
			if (aClass375_9485 != null)
				aClass375_9485.aBool3911 = false;
		} else if (aClass375_9484 != null)
			aClass375_9484.aBool3911 = false;
	}

	void method8680() {
		if (aClass348_9482 != null)
			aClass348_9482.aBool3693 = false;
	}

	public void method2541(int i) {
		int i_155_ = Class447.anIntArray4906[i];
		int i_156_ = Class447.anIntArray4921[i];
		for (int i_157_ = 0; i_157_ < anInt9456; i_157_++) {
			int i_158_ = ((anIntArray9493[i_157_] * i_155_ + anIntArray9524[i_157_] * i_156_) >> 14);
			anIntArray9493[i_157_] = (anIntArray9493[i_157_] * i_156_ - anIntArray9524[i_157_] * i_155_) >> 14;
			anIntArray9524[i_157_] = i_158_;
		}
		method8677();
		aBool9471 = false;
	}

	void method2536() {
		/* empty */
	}

	public void method2457(int i) {
		int i_159_ = Class447.anIntArray4906[i];
		int i_160_ = Class447.anIntArray4921[i];
		for (int i_161_ = 0; i_161_ < anInt9456; i_161_++) {
			int i_162_ = ((anIntArray9458[i_161_] * i_160_ - anIntArray9493[i_161_] * i_159_) >> 14);
			anIntArray9493[i_161_] = (anIntArray9458[i_161_] * i_159_ + anIntArray9493[i_161_] * i_160_) >> 14;
			anIntArray9458[i_161_] = i_162_;
		}
		method8677();
		aBool9471 = false;
	}

	public void method2529(int i) {
		int i_163_ = Class447.anIntArray4906[i];
		int i_164_ = Class447.anIntArray4921[i];
		for (int i_165_ = 0; i_165_ < anInt9456; i_165_++) {
			int i_166_ = ((anIntArray9458[i_165_] * i_163_ + anIntArray9524[i_165_] * i_164_) >> 14);
			anIntArray9458[i_165_] = (anIntArray9458[i_165_] * i_164_ - anIntArray9524[i_165_] * i_163_) >> 14;
			anIntArray9524[i_165_] = i_166_;
		}
		method8677();
		aBool9471 = false;
	}

	void method2545(int i, int[] is, int i_167_, int i_168_, int i_169_, boolean bool, int i_170_, int[] is_171_) {
		int i_172_ = is.length;
		if (i == 0) {
			i_167_ <<= 4;
			i_168_ <<= 4;
			i_169_ <<= 4;
			int i_173_ = 0;
			anInt9520 = 0;
			anInt9521 = 0;
			anInt9522 = 0;
			for (int i_174_ = 0; i_174_ < i_172_; i_174_++) {
				int i_175_ = is[i_174_];
				if (i_175_ < anIntArrayArray9460.length) {
					int[] is_176_ = anIntArrayArray9460[i_175_];
					for (int i_177_ = 0; i_177_ < is_176_.length; i_177_++) {
						int i_178_ = is_176_[i_177_];
						if (aShortArray9461 == null || (i_170_ & aShortArray9461[i_178_]) != 0) {
							anInt9520 += anIntArray9524[i_178_];
							anInt9521 += anIntArray9458[i_178_];
							anInt9522 += anIntArray9493[i_178_];
							i_173_++;
						}
					}
				}
			}
			if (i_173_ > 0) {
				anInt9520 = anInt9520 / i_173_ + i_167_;
				anInt9521 = anInt9521 / i_173_ + i_168_;
				anInt9522 = anInt9522 / i_173_ + i_169_;
				aBool9523 = true;
			} else {
				anInt9520 = i_167_;
				anInt9521 = i_168_;
				anInt9522 = i_169_;
			}
		} else if (i == 1) {
			if (is_171_ != null) {
				int i_179_ = ((is_171_[0] * i_167_ + is_171_[1] * i_168_ + is_171_[2] * i_169_ + 8192) >> 14);
				int i_180_ = ((is_171_[3] * i_167_ + is_171_[4] * i_168_ + is_171_[5] * i_169_ + 8192) >> 14);
				int i_181_ = ((is_171_[6] * i_167_ + is_171_[7] * i_168_ + is_171_[8] * i_169_ + 8192) >> 14);
				i_167_ = i_179_;
				i_168_ = i_180_;
				i_169_ = i_181_;
			}
			i_167_ <<= 4;
			i_168_ <<= 4;
			i_169_ <<= 4;
			for (int i_182_ = 0; i_182_ < i_172_; i_182_++) {
				int i_183_ = is[i_182_];
				if (i_183_ < anIntArrayArray9460.length) {
					int[] is_184_ = anIntArrayArray9460[i_183_];
					for (int i_185_ = 0; i_185_ < is_184_.length; i_185_++) {
						int i_186_ = is_184_[i_185_];
						if (aShortArray9461 == null || (i_170_ & aShortArray9461[i_186_]) != 0) {
							anIntArray9524[i_186_] += i_167_;
							anIntArray9458[i_186_] += i_168_;
							anIntArray9493[i_186_] += i_169_;
						}
					}
				}
			}
		} else if (i == 2) {
			if (is_171_ != null) {
				int i_187_ = is_171_[9] << 4;
				int i_188_ = is_171_[10] << 4;
				int i_189_ = is_171_[11] << 4;
				int i_190_ = is_171_[12] << 4;
				int i_191_ = is_171_[13] << 4;
				int i_192_ = is_171_[14] << 4;
				if (aBool9523) {
					int i_193_ = ((is_171_[0] * anInt9520 + is_171_[3] * anInt9521 + is_171_[6] * anInt9522 + 8192) >> 14);
					int i_194_ = ((is_171_[1] * anInt9520 + is_171_[4] * anInt9521 + is_171_[7] * anInt9522 + 8192) >> 14);
					int i_195_ = ((is_171_[2] * anInt9520 + is_171_[5] * anInt9521 + is_171_[8] * anInt9522 + 8192) >> 14);
					i_193_ += i_190_;
					i_194_ += i_191_;
					i_195_ += i_192_;
					anInt9520 = i_193_;
					anInt9521 = i_194_;
					anInt9522 = i_195_;
					aBool9523 = false;
				}
				int[] is_196_ = new int[9];
				int i_197_ = Class447.anIntArray4921[i_167_];
				int i_198_ = Class447.anIntArray4906[i_167_];
				int i_199_ = Class447.anIntArray4921[i_168_];
				int i_200_ = Class447.anIntArray4906[i_168_];
				int i_201_ = Class447.anIntArray4921[i_169_];
				int i_202_ = Class447.anIntArray4906[i_169_];
				int i_203_ = i_198_ * i_201_ + 8192 >> 14;
				int i_204_ = i_198_ * i_202_ + 8192 >> 14;
				is_196_[0] = i_199_ * i_201_ + i_200_ * i_204_ + 8192 >> 14;
				is_196_[1] = -i_199_ * i_202_ + i_200_ * i_203_ + 8192 >> 14;
				is_196_[2] = i_200_ * i_197_ + 8192 >> 14;
				is_196_[3] = i_197_ * i_202_ + 8192 >> 14;
				is_196_[4] = i_197_ * i_201_ + 8192 >> 14;
				is_196_[5] = -i_198_;
				is_196_[6] = -i_200_ * i_201_ + i_199_ * i_204_ + 8192 >> 14;
				is_196_[7] = i_200_ * i_202_ + i_199_ * i_203_ + 8192 >> 14;
				is_196_[8] = i_199_ * i_197_ + 8192 >> 14;
				int i_205_ = (is_196_[0] * -anInt9520 + is_196_[1] * -anInt9521 + is_196_[2] * -anInt9522 + 8192) >> 14;
				int i_206_ = (is_196_[3] * -anInt9520 + is_196_[4] * -anInt9521 + is_196_[5] * -anInt9522 + 8192) >> 14;
				int i_207_ = (is_196_[6] * -anInt9520 + is_196_[7] * -anInt9521 + is_196_[8] * -anInt9522 + 8192) >> 14;
				int i_208_ = i_205_ + anInt9520;
				int i_209_ = i_206_ + anInt9521;
				int i_210_ = i_207_ + anInt9522;
				int[] is_211_ = new int[9];
				for (int i_212_ = 0; i_212_ < 3; i_212_++) {
					for (int i_213_ = 0; i_213_ < 3; i_213_++) {
						int i_214_ = 0;
						for (int i_215_ = 0; i_215_ < 3; i_215_++)
							i_214_ += (is_196_[i_212_ * 3 + i_215_] * is_171_[i_213_ * 3 + i_215_]);
						is_211_[i_212_ * 3 + i_213_] = i_214_ + 8192 >> 14;
					}
				}
				int i_216_ = ((is_196_[0] * i_190_ + is_196_[1] * i_191_ + is_196_[2] * i_192_ + 8192) >> 14);
				int i_217_ = ((is_196_[3] * i_190_ + is_196_[4] * i_191_ + is_196_[5] * i_192_ + 8192) >> 14);
				int i_218_ = ((is_196_[6] * i_190_ + is_196_[7] * i_191_ + is_196_[8] * i_192_ + 8192) >> 14);
				i_216_ += i_208_;
				i_217_ += i_209_;
				i_218_ += i_210_;
				int[] is_219_ = new int[9];
				for (int i_220_ = 0; i_220_ < 3; i_220_++) {
					for (int i_221_ = 0; i_221_ < 3; i_221_++) {
						int i_222_ = 0;
						for (int i_223_ = 0; i_223_ < 3; i_223_++)
							i_222_ += (is_171_[i_220_ * 3 + i_223_] * is_211_[i_221_ + i_223_ * 3]);
						is_219_[i_220_ * 3 + i_221_] = i_222_ + 8192 >> 14;
					}
				}
				int i_224_ = ((is_171_[0] * i_216_ + is_171_[1] * i_217_ + is_171_[2] * i_218_ + 8192) >> 14);
				int i_225_ = ((is_171_[3] * i_216_ + is_171_[4] * i_217_ + is_171_[5] * i_218_ + 8192) >> 14);
				int i_226_ = ((is_171_[6] * i_216_ + is_171_[7] * i_217_ + is_171_[8] * i_218_ + 8192) >> 14);
				i_224_ += i_187_;
				i_225_ += i_188_;
				i_226_ += i_189_;
				for (int i_227_ = 0; i_227_ < i_172_; i_227_++) {
					int i_228_ = is[i_227_];
					if (i_228_ < anIntArrayArray9460.length) {
						int[] is_229_ = anIntArrayArray9460[i_228_];
						for (int i_230_ = 0; i_230_ < is_229_.length; i_230_++) {
							int i_231_ = is_229_[i_230_];
							if (aShortArray9461 == null || (i_170_ & aShortArray9461[i_231_]) != 0) {
								int i_232_ = ((is_219_[0] * anIntArray9524[i_231_] + is_219_[1] * anIntArray9458[i_231_] + is_219_[2] * anIntArray9493[i_231_] + 8192) >> 14);
								int i_233_ = ((is_219_[3] * anIntArray9524[i_231_] + is_219_[4] * anIntArray9458[i_231_] + is_219_[5] * anIntArray9493[i_231_] + 8192) >> 14);
								int i_234_ = ((is_219_[6] * anIntArray9524[i_231_] + is_219_[7] * anIntArray9458[i_231_] + is_219_[8] * anIntArray9493[i_231_] + 8192) >> 14);
								i_232_ += i_224_;
								i_233_ += i_225_;
								i_234_ += i_226_;
								anIntArray9524[i_231_] = i_232_;
								anIntArray9458[i_231_] = i_233_;
								anIntArray9493[i_231_] = i_234_;
							}
						}
					}
				}
			} else {
				for (int i_235_ = 0; i_235_ < i_172_; i_235_++) {
					int i_236_ = is[i_235_];
					if (i_236_ < anIntArrayArray9460.length) {
						int[] is_237_ = anIntArrayArray9460[i_236_];
						for (int i_238_ = 0; i_238_ < is_237_.length; i_238_++) {
							int i_239_ = is_237_[i_238_];
							if (aShortArray9461 == null || (i_170_ & aShortArray9461[i_239_]) != 0) {
								anIntArray9524[i_239_] -= anInt9520;
								anIntArray9458[i_239_] -= anInt9521;
								anIntArray9493[i_239_] -= anInt9522;
								if (i_169_ != 0) {
									int i_240_ = Class447.anIntArray4906[i_169_];
									int i_241_ = Class447.anIntArray4921[i_169_];
									int i_242_ = ((anIntArray9458[i_239_] * i_240_ + anIntArray9524[i_239_] * i_241_ + 16383) >> 14);
									anIntArray9458[i_239_] = (anIntArray9458[i_239_] * i_241_ - anIntArray9524[i_239_] * i_240_ + 16383) >> 14;
									anIntArray9524[i_239_] = i_242_;
								}
								if (i_167_ != 0) {
									int i_243_ = Class447.anIntArray4906[i_167_];
									int i_244_ = Class447.anIntArray4921[i_167_];
									int i_245_ = ((anIntArray9458[i_239_] * i_244_ - anIntArray9493[i_239_] * i_243_ + 16383) >> 14);
									anIntArray9493[i_239_] = (anIntArray9458[i_239_] * i_243_ + anIntArray9493[i_239_] * i_244_ + 16383) >> 14;
									anIntArray9458[i_239_] = i_245_;
								}
								if (i_168_ != 0) {
									int i_246_ = Class447.anIntArray4906[i_168_];
									int i_247_ = Class447.anIntArray4921[i_168_];
									int i_248_ = ((anIntArray9493[i_239_] * i_246_ + anIntArray9524[i_239_] * i_247_ + 16383) >> 14);
									anIntArray9493[i_239_] = (anIntArray9493[i_239_] * i_247_ - anIntArray9524[i_239_] * i_246_ + 16383) >> 14;
									anIntArray9524[i_239_] = i_248_;
								}
								anIntArray9524[i_239_] += anInt9520;
								anIntArray9458[i_239_] += anInt9521;
								anIntArray9493[i_239_] += anInt9522;
							}
						}
					}
				}
				if (bool) {
					for (int i_249_ = 0; i_249_ < i_172_; i_249_++) {
						int i_250_ = is[i_249_];
						if (i_250_ < anIntArrayArray9460.length) {
							int[] is_251_ = anIntArrayArray9460[i_250_];
							for (int i_252_ = 0; i_252_ < is_251_.length; i_252_++) {
								int i_253_ = is_251_[i_252_];
								if (aShortArray9461 == null || ((i_170_ & aShortArray9461[i_253_]) != 0)) {
									int i_254_ = anIntArray9468[i_253_];
									int i_255_ = anIntArray9468[i_253_ + 1];
									for (int i_256_ = i_254_; (i_256_ < i_255_ && aShortArray9506[i_256_] != 0); i_256_++) {
										int i_257_ = ((aShortArray9506[i_256_] & 0xffff) - 1);
										if (i_169_ != 0) {
											int i_258_ = (Class447.anIntArray4906[i_169_]);
											int i_259_ = (Class447.anIntArray4921[i_169_]);
											int i_260_ = (((aShortArray9466[i_257_] * i_258_) + (aShortArray9500[i_257_] * i_259_) + 16383) >> 14);
											aShortArray9466[i_257_] = (short) (((aShortArray9466[i_257_]) * i_259_ - ((aShortArray9500[i_257_]) * i_258_) + 16383) >> 14);
											aShortArray9500[i_257_] = (short) i_260_;
										}
										if (i_167_ != 0) {
											int i_261_ = (Class447.anIntArray4906[i_167_]);
											int i_262_ = (Class447.anIntArray4921[i_167_]);
											int i_263_ = (((aShortArray9466[i_257_] * i_262_) - (aShortArray9467[i_257_] * i_261_) + 16383) >> 14);
											aShortArray9467[i_257_] = (short) (((aShortArray9466[i_257_]) * i_261_ + ((aShortArray9467[i_257_]) * i_262_) + 16383) >> 14);
											aShortArray9466[i_257_] = (short) i_263_;
										}
										if (i_168_ != 0) {
											int i_264_ = (Class447.anIntArray4906[i_168_]);
											int i_265_ = (Class447.anIntArray4921[i_168_]);
											int i_266_ = (((aShortArray9467[i_257_] * i_264_) + (aShortArray9500[i_257_] * i_265_) + 16383) >> 14);
											aShortArray9467[i_257_] = (short) (((aShortArray9467[i_257_]) * i_265_ - ((aShortArray9500[i_257_]) * i_264_) + 16383) >> 14);
											aShortArray9500[i_257_] = (short) i_266_;
										}
									}
								}
							}
						}
					}
					method8679();
				}
			}
		} else if (i == 3) {
			if (is_171_ != null) {
				int i_267_ = is_171_[9] << 4;
				int i_268_ = is_171_[10] << 4;
				int i_269_ = is_171_[11] << 4;
				int i_270_ = is_171_[12] << 4;
				int i_271_ = is_171_[13] << 4;
				int i_272_ = is_171_[14] << 4;
				if (aBool9523) {
					int i_273_ = ((is_171_[0] * anInt9520 + is_171_[3] * anInt9521 + is_171_[6] * anInt9522 + 8192) >> 14);
					int i_274_ = ((is_171_[1] * anInt9520 + is_171_[4] * anInt9521 + is_171_[7] * anInt9522 + 8192) >> 14);
					int i_275_ = ((is_171_[2] * anInt9520 + is_171_[5] * anInt9521 + is_171_[8] * anInt9522 + 8192) >> 14);
					i_273_ += i_270_;
					i_274_ += i_271_;
					i_275_ += i_272_;
					anInt9520 = i_273_;
					anInt9521 = i_274_;
					anInt9522 = i_275_;
					aBool9523 = false;
				}
				int i_276_ = i_167_ << 15 >> 7;
				int i_277_ = i_168_ << 15 >> 7;
				int i_278_ = i_169_ << 15 >> 7;
				int i_279_ = i_276_ * -anInt9520 + 8192 >> 14;
				int i_280_ = i_277_ * -anInt9521 + 8192 >> 14;
				int i_281_ = i_278_ * -anInt9522 + 8192 >> 14;
				int i_282_ = i_279_ + anInt9520;
				int i_283_ = i_280_ + anInt9521;
				int i_284_ = i_281_ + anInt9522;
				int[] is_285_ = new int[9];
				is_285_[0] = i_276_ * is_171_[0] + 8192 >> 14;
				is_285_[1] = i_276_ * is_171_[3] + 8192 >> 14;
				is_285_[2] = i_276_ * is_171_[6] + 8192 >> 14;
				is_285_[3] = i_277_ * is_171_[1] + 8192 >> 14;
				is_285_[4] = i_277_ * is_171_[4] + 8192 >> 14;
				is_285_[5] = i_277_ * is_171_[7] + 8192 >> 14;
				is_285_[6] = i_278_ * is_171_[2] + 8192 >> 14;
				is_285_[7] = i_278_ * is_171_[5] + 8192 >> 14;
				is_285_[8] = i_278_ * is_171_[8] + 8192 >> 14;
				int i_286_ = i_276_ * i_270_ + 8192 >> 14;
				int i_287_ = i_277_ * i_271_ + 8192 >> 14;
				int i_288_ = i_278_ * i_272_ + 8192 >> 14;
				i_286_ += i_282_;
				i_287_ += i_283_;
				i_288_ += i_284_;
				int[] is_289_ = new int[9];
				for (int i_290_ = 0; i_290_ < 3; i_290_++) {
					for (int i_291_ = 0; i_291_ < 3; i_291_++) {
						int i_292_ = 0;
						for (int i_293_ = 0; i_293_ < 3; i_293_++)
							i_292_ += (is_171_[i_290_ * 3 + i_293_] * is_285_[i_291_ + i_293_ * 3]);
						is_289_[i_290_ * 3 + i_291_] = i_292_ + 8192 >> 14;
					}
				}
				int i_294_ = ((is_171_[0] * i_286_ + is_171_[1] * i_287_ + is_171_[2] * i_288_ + 8192) >> 14);
				int i_295_ = ((is_171_[3] * i_286_ + is_171_[4] * i_287_ + is_171_[5] * i_288_ + 8192) >> 14);
				int i_296_ = ((is_171_[6] * i_286_ + is_171_[7] * i_287_ + is_171_[8] * i_288_ + 8192) >> 14);
				i_294_ += i_267_;
				i_295_ += i_268_;
				i_296_ += i_269_;
				for (int i_297_ = 0; i_297_ < i_172_; i_297_++) {
					int i_298_ = is[i_297_];
					if (i_298_ < anIntArrayArray9460.length) {
						int[] is_299_ = anIntArrayArray9460[i_298_];
						for (int i_300_ = 0; i_300_ < is_299_.length; i_300_++) {
							int i_301_ = is_299_[i_300_];
							if (aShortArray9461 == null || (i_170_ & aShortArray9461[i_301_]) != 0) {
								int i_302_ = ((is_289_[0] * anIntArray9524[i_301_] + is_289_[1] * anIntArray9458[i_301_] + is_289_[2] * anIntArray9493[i_301_] + 8192) >> 14);
								int i_303_ = ((is_289_[3] * anIntArray9524[i_301_] + is_289_[4] * anIntArray9458[i_301_] + is_289_[5] * anIntArray9493[i_301_] + 8192) >> 14);
								int i_304_ = ((is_289_[6] * anIntArray9524[i_301_] + is_289_[7] * anIntArray9458[i_301_] + is_289_[8] * anIntArray9493[i_301_] + 8192) >> 14);
								i_302_ += i_294_;
								i_303_ += i_295_;
								i_304_ += i_296_;
								anIntArray9524[i_301_] = i_302_;
								anIntArray9458[i_301_] = i_303_;
								anIntArray9493[i_301_] = i_304_;
							}
						}
					}
				}
			} else {
				for (int i_305_ = 0; i_305_ < i_172_; i_305_++) {
					int i_306_ = is[i_305_];
					if (i_306_ < anIntArrayArray9460.length) {
						int[] is_307_ = anIntArrayArray9460[i_306_];
						for (int i_308_ = 0; i_308_ < is_307_.length; i_308_++) {
							int i_309_ = is_307_[i_308_];
							if (aShortArray9461 == null || (i_170_ & aShortArray9461[i_309_]) != 0) {
								anIntArray9524[i_309_] -= anInt9520;
								anIntArray9458[i_309_] -= anInt9521;
								anIntArray9493[i_309_] -= anInt9522;
								anIntArray9524[i_309_] = anIntArray9524[i_309_] * i_167_ >> 7;
								anIntArray9458[i_309_] = anIntArray9458[i_309_] * i_168_ >> 7;
								anIntArray9493[i_309_] = anIntArray9493[i_309_] * i_169_ >> 7;
								anIntArray9524[i_309_] += anInt9520;
								anIntArray9458[i_309_] += anInt9521;
								anIntArray9493[i_309_] += anInt9522;
							}
						}
					}
				}
			}
		} else if (i == 5) {
			if (anIntArrayArray9480 != null) {
				boolean bool_310_ = false;
				for (int i_311_ = 0; i_311_ < i_172_; i_311_++) {
					int i_312_ = is[i_311_];
					if (i_312_ < anIntArrayArray9480.length) {
						int[] is_313_ = anIntArrayArray9480[i_312_];
						for (int i_314_ = 0; i_314_ < is_313_.length; i_314_++) {
							int i_315_ = is_313_[i_314_];
							if (aShortArray9481 == null || (i_170_ & aShortArray9481[i_315_]) != 0) {
								int i_316_ = ((aByteArray9448[i_315_] & 0xff) + i_167_ * 8);
								if (i_316_ < 0)
									i_316_ = 0;
								else if (i_316_ > 255)
									i_316_ = 255;
								aByteArray9448[i_315_] = (byte) i_316_;
							}
						}
						bool_310_ = bool_310_ | is_313_.length > 0;
					}
				}
				if (bool_310_) {
					if (aClass372Array9510 != null) {
						for (int i_317_ = 0; i_317_ < anInt9509; i_317_++) {
							Class372 class372 = aClass372Array9510[i_317_];
							Class346 class346 = aClass346Array9511[i_317_];
							class346.anInt3686 = (class346.anInt3686 & 0xffffff | 255 - (aByteArray9448[class372.anInt3889] & 0xff) << 24);
						}
					}
					method8678();
				}
			}
		} else if (i == 7) {
			if (anIntArrayArray9480 != null) {
				boolean bool_318_ = false;
				for (int i_319_ = 0; i_319_ < i_172_; i_319_++) {
					int i_320_ = is[i_319_];
					if (i_320_ < anIntArrayArray9480.length) {
						int[] is_321_ = anIntArrayArray9480[i_320_];
						for (int i_322_ = 0; i_322_ < is_321_.length; i_322_++) {
							int i_323_ = is_321_[i_322_];
							if (aShortArray9481 == null || (i_170_ & aShortArray9481[i_323_]) != 0) {
								int i_324_ = aShortArray9490[i_323_] & 0xffff;
								int i_325_ = i_324_ >> 10 & 0x3f;
								int i_326_ = i_324_ >> 7 & 0x7;
								int i_327_ = i_324_ & 0x7f;
								i_325_ = i_325_ + i_167_ & 0x3f;
								i_326_ += i_168_ / 4;
								if (i_326_ < 0)
									i_326_ = 0;
								else if (i_326_ > 7)
									i_326_ = 7;
								i_327_ += i_169_;
								if (i_327_ < 0)
									i_327_ = 0;
								else if (i_327_ > 127)
									i_327_ = 127;
								aShortArray9490[i_323_] = (short) (i_325_ << 10 | i_326_ << 7 | i_327_);
							}
						}
						bool_318_ = bool_318_ | is_321_.length > 0;
					}
				}
				if (bool_318_) {
					if (aClass372Array9510 != null) {
						for (int i_328_ = 0; i_328_ < anInt9509; i_328_++) {
							Class372 class372 = aClass372Array9510[i_328_];
							Class346 class346 = aClass346Array9511[i_328_];
							class346.anInt3686 = (class346.anInt3686 & ~0xffffff | (ColourUtils.anIntArray8309[(aShortArray9490[class372.anInt3889] & 0xffff)]) & 0xffffff);
						}
					}
					method8678();
				}
			}
		} else if (i == 8) {
			if (anIntArrayArray9451 != null) {
				for (int i_329_ = 0; i_329_ < i_172_; i_329_++) {
					int i_330_ = is[i_329_];
					if (i_330_ < anIntArrayArray9451.length) {
						int[] is_331_ = anIntArrayArray9451[i_330_];
						for (int i_332_ = 0; i_332_ < is_331_.length; i_332_++) {
							Class346 class346 = aClass346Array9511[is_331_[i_332_]];
							class346.anInt3685 += i_167_;
							class346.anInt3682 += i_168_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (anIntArrayArray9451 != null) {
				for (int i_333_ = 0; i_333_ < i_172_; i_333_++) {
					int i_334_ = is[i_333_];
					if (i_334_ < anIntArrayArray9451.length) {
						int[] is_335_ = anIntArrayArray9451[i_334_];
						for (int i_336_ = 0; i_336_ < is_335_.length; i_336_++) {
							Class346 class346 = aClass346Array9511[is_335_[i_336_]];
							class346.anInt3683 = class346.anInt3683 * i_167_ >> 7;
							class346.anInt3684 = class346.anInt3684 * i_168_ >> 7;
						}
					}
				}
			}
		} else if (i == 9) {
			if (anIntArrayArray9451 != null) {
				for (int i_337_ = 0; i_337_ < i_172_; i_337_++) {
					int i_338_ = is[i_337_];
					if (i_338_ < anIntArrayArray9451.length) {
						int[] is_339_ = anIntArrayArray9451[i_338_];
						for (int i_340_ = 0; i_340_ < is_339_.length; i_340_++) {
							Class346 class346 = aClass346Array9511[is_339_[i_340_]];
							class346.anInt3687 = class346.anInt3687 + i_167_ & 0x3fff;
						}
					}
				}
			}
		}
	}

	public void method2473() {
		for (int i = 0; i < anInt9456; i++)
			anIntArray9493[i] = -anIntArray9493[i];
		for (int i = 0; i < anInt9462; i++)
			aShortArray9467[i] = (short) -aShortArray9467[i];
		for (int i = 0; i < anInt9472; i++) {
			short i_341_ = aShortArray9463[i];
			aShortArray9463[i] = aShortArray9488[i];
			aShortArray9488[i] = i_341_;
		}
		method8677();
		method8679();
		method8680();
		aBool9471 = false;
	}

	public void method2475(int i, int i_342_, Class160 class160, Class160 class160_343_, int i_344_, int i_345_, int i_346_) {
		if (!aBool9471)
			method8681();
		int i_347_ = i_344_ + anInt9496;
		int i_348_ = i_344_ + anInt9497;
		int i_349_ = i_346_ + anInt9498;
		int i_350_ = i_346_ + anInt9499;
		if (i != 1 && i != 2 && i != 3 && i != 5 || (i_347_ >= 0 && ((i_348_ + class160.anInt1767 * -1504778739 >> class160.anInt1768 * 2064238369) < class160.anInt1766 * 1718142487) && i_349_ >= 0 && ((i_350_ + class160.anInt1767 * -1504778739 >> class160.anInt1768 * 2064238369) < class160.anInt1769 * -889224915))) {
			if (i == 4 || i == 5) {
				if (class160_343_ == null || (i_347_ < 0 || ((i_348_ + class160_343_.anInt1767 * -1504778739 >> class160_343_.anInt1768 * 2064238369) >= class160_343_.anInt1766 * 1718142487) || i_349_ < 0 || ((i_350_ + class160_343_.anInt1767 * -1504778739 >> class160_343_.anInt1768 * 2064238369) >= class160_343_.anInt1769 * -889224915)))
					return;
			} else {
				i_347_ >>= class160.anInt1768 * 2064238369;
				i_348_ = (i_348_ + (class160.anInt1767 * -1504778739 - 1) >> class160.anInt1768 * 2064238369);
				i_349_ >>= class160.anInt1768 * 2064238369;
				i_350_ = (i_350_ + (class160.anInt1767 * -1504778739 - 1) >> class160.anInt1768 * 2064238369);
				if (class160.method1927(i_347_, i_349_, -1820416815) == i_345_ && class160.method1927(i_348_, i_349_, 175658828) == i_345_ && (class160.method1927(i_347_, i_350_, -1102651429) == i_345_) && (class160.method1927(i_348_, i_350_, -1529052991) == i_345_))
					return;
			}
			if (i == 1) {
				for (int i_351_ = 0; i_351_ < anInt9456; i_351_++)
					anIntArray9458[i_351_] = (anIntArray9458[i_351_] + class160.method1926((anIntArray9524[i_351_] + i_344_), (anIntArray9493[i_351_] + i_346_), (byte) 0) - i_345_);
			} else if (i == 2) {
				int i_352_ = anInt9478;
				if (i_352_ == 0)
					return;
				for (int i_353_ = 0; i_353_ < anInt9456; i_353_++) {
					int i_354_ = (anIntArray9458[i_353_] << 16) / i_352_;
					if (i_354_ < i_342_)
						anIntArray9458[i_353_] = (anIntArray9458[i_353_] + (class160.method1926((anIntArray9524[i_353_] + i_344_), (anIntArray9493[i_353_] + i_346_), (byte) 0) - i_345_) * (i_342_ - i_354_) / i_342_);
				}
			} else if (i == 3) {
				int i_355_ = (i_342_ & 0xff) * 16;
				int i_356_ = (i_342_ >> 8 & 0xff) * 16;
				int i_357_ = (i_342_ >> 16 & 0xff) << 6;
				int i_358_ = (i_342_ >> 24 & 0xff) << 6;
				if (i_344_ - (i_355_ >> 1) < 0 || ((i_344_ + (i_355_ >> 1) + class160.anInt1767 * -1504778739) >= (class160.anInt1766 * 1718142487 << class160.anInt1768 * 2064238369)) || i_346_ - (i_356_ >> 1) < 0 || ((i_346_ + (i_356_ >> 1) + class160.anInt1767 * -1504778739) >= (class160.anInt1769 * -889224915 << class160.anInt1768 * 2064238369)))
					return;
				method2476(class160, i_344_, i_345_, i_346_, i_355_, i_356_, i_357_, i_358_);
			} else if (i == 4) {
				int i_359_ = anInt9495 - anInt9478;
				for (int i_360_ = 0; i_360_ < anInt9456; i_360_++)
					anIntArray9458[i_360_] = (anIntArray9458[i_360_] + (class160_343_.method1926((anIntArray9524[i_360_] + i_344_), (anIntArray9493[i_360_] + i_346_), (byte) 0) - i_345_) + i_359_);
			} else if (i == 5) {
				int i_361_ = anInt9495 - anInt9478;
				for (int i_362_ = 0; i_362_ < anInt9456; i_362_++) {
					int i_363_ = anIntArray9524[i_362_] + i_344_;
					int i_364_ = anIntArray9493[i_362_] + i_346_;
					int i_365_ = class160.method1926(i_363_, i_364_, (byte) 0);
					int i_366_ = class160_343_.method1926(i_363_, i_364_, (byte) 0);
					int i_367_ = i_365_ - i_366_ - i_342_;
					anIntArray9458[i_362_] = ((anIntArray9458[i_362_] << 8) / i_361_ * i_367_ >> 8) - (i_345_ - i_365_);
				}
			}
			method8677();
			aBool9471 = false;
		}
	}

	void method8681() {
		int i = 32767;
		int i_368_ = 32767;
		int i_369_ = 32767;
		int i_370_ = -32768;
		int i_371_ = -32768;
		int i_372_ = -32768;
		int i_373_ = 0;
		int i_374_ = 0;
		for (int i_375_ = 0; i_375_ < anInt9456; i_375_++) {
			int i_376_ = anIntArray9524[i_375_];
			int i_377_ = anIntArray9458[i_375_];
			int i_378_ = anIntArray9493[i_375_];
			if (i_376_ < i)
				i = i_376_;
			if (i_376_ > i_370_)
				i_370_ = i_376_;
			if (i_377_ < i_368_)
				i_368_ = i_377_;
			if (i_377_ > i_371_)
				i_371_ = i_377_;
			if (i_378_ < i_369_)
				i_369_ = i_378_;
			if (i_378_ > i_372_)
				i_372_ = i_378_;
			int i_379_ = i_376_ * i_376_ + i_378_ * i_378_;
			if (i_379_ > i_373_)
				i_373_ = i_379_;
			i_379_ = i_376_ * i_376_ + i_378_ * i_378_ + i_377_ * i_377_;
			if (i_379_ > i_374_)
				i_374_ = i_379_;
		}
		anInt9496 = i;
		anInt9497 = i_370_;
		anInt9478 = i_368_;
		anInt9495 = i_371_;
		anInt9498 = i_369_;
		anInt9499 = i_372_;
		anInt9492 = (int) (Math.sqrt((double) i_373_) + 0.99);
		anInt9491 = (int) (Math.sqrt((double) i_374_) + 0.99);
		aBool9471 = true;
	}

	public void method2501() {
		if (!aBool9453) {
			if (!aBool9471)
				method8681();
			anInt9501 = anInt9478;
			aBool9453 = true;
		}
	}

	void method8682(Class443 class443) {
		if (aClass372Array9510 != null) {
			aClass167_Sub3_9450.method2302(!aBool9489);
			Class433 class433 = aClass167_Sub3_9450.aClass433_9543;
			Class331 class331 = aClass167_Sub3_9450.aClass331_9606;
			boolean bool = aClass167_Sub3_9450.anInt9550 > 0;
			if (bool)
				class331.aClass436_3610.method5243(((float) (aClass167_Sub3_9450.anInt9672 >> 16 & 0xff) / 255.0F), ((float) (aClass167_Sub3_9450.anInt9672 >> 8 & 0xff) / 255.0F), ((float) (aClass167_Sub3_9450.anInt9672 >> 0 & 0xff) / 255.0F));
			else
				class331.aClass436_3610.method5243(0.0F, 0.0F, 0.0F);
			for (int i = 0; i < anInt9509; i++) {
				Class372 class372 = aClass372Array9510[i];
				Class346 class346 = aClass346Array9511[i];
				if (!class372.aBool3886 || !aClass167_Sub3_9450.method2124()) {
					float f = ((float) (anIntArray9524[class372.anInt3893] + anIntArray9524[class372.anInt3887] + anIntArray9524[class372.anInt3888]) * 0.3333333F);
					float f_380_ = ((float) (anIntArray9458[class372.anInt3893] + anIntArray9458[class372.anInt3887] + anIntArray9458[class372.anInt3888]) * 0.3333333F);
					float f_381_ = ((float) (anIntArray9493[class372.anInt3893] + anIntArray9493[class372.anInt3887] + anIntArray9493[class372.anInt3888]) * 0.3333333F);
					float f_382_ = (class443.aFloatArray4878[0] * f + class443.aFloatArray4878[4] * f_380_ + class443.aFloatArray4878[8] * f_381_ + class443.aFloatArray4878[12]);
					float f_383_ = (class443.aFloatArray4878[1] * f + class443.aFloatArray4878[5] * f_380_ + class443.aFloatArray4878[9] * f_381_ + class443.aFloatArray4878[13]);
					float f_384_ = (class443.aFloatArray4878[2] * f + class443.aFloatArray4878[6] * f_380_ + class443.aFloatArray4878[10] * f_381_ + class443.aFloatArray4878[14]);
					float f_385_ = ((float) (1.0 / Math.sqrt((double) (f_382_ * f_382_ + f_383_ * f_383_ + f_384_ * f_384_))) * (float) class372.anInt3894);
					class433.method5195(class346.anInt3687, class346.anInt3683 * class372.aShort3890 >> 7, class346.anInt3684 * class372.aShort3891 >> 7, f_382_ + (float) class346.anInt3685 - f_382_ * f_385_, f_383_ + (float) class346.anInt3682 - f_383_ * f_385_, f_384_ - f_384_ * f_385_);
					class433.method5204(aClass167_Sub3_9450.aClass433_9562);
					aClass167_Sub3_9450.aClass443_9643.method5359(class433);
					class331.method4324(aClass167_Sub3_9450.aClass443_9643);
					class331.aClass443_3605.method5338();
					class331.anInt3608 = class346.anInt3686;
					if (bool)
						class331.aFloat3611 = 1.0F - ((aClass167_Sub3_9450.aFloat9676 - f_384_) / (aClass167_Sub3_9450.aFloat9676 - aClass167_Sub3_9450.aFloat9675));
					class331.anInterface36_3606 = null;
					if (class372.aShort3892 != -1)
						class331.anInterface36_3606 = (aClass167_Sub3_9450.aClass340_9561.method4456(aClass167_Sub3_9450.aClass174_1852.method2446(class372.aShort3892 & 0xffff, -1983146779)));
					class331.method4321(bool);
				}
			}
			aClass167_Sub3_9450.method2302(true);
		}
	}

	public void method2561(Class177 class177, int i, int i_386_, int i_387_, boolean bool) {
		Class177_Sub2 class177_sub2_388_ = (Class177_Sub2) class177;
		if (anInt9472 != 0 && class177_sub2_388_.anInt9472 != 0) {
			int i_389_ = class177_sub2_388_.anInt9456;
			int[] is = class177_sub2_388_.anIntArray9524;
			int[] is_390_ = class177_sub2_388_.anIntArray9458;
			int[] is_391_ = class177_sub2_388_.anIntArray9493;
			short[] is_392_ = class177_sub2_388_.aShortArray9500;
			short[] is_393_ = class177_sub2_388_.aShortArray9466;
			short[] is_394_ = class177_sub2_388_.aShortArray9467;
			byte[] is_395_ = class177_sub2_388_.aByteArray9512;
			short[] is_396_;
			short[] is_397_;
			short[] is_398_;
			byte[] is_399_;
			if (aClass373_9505 != null) {
				is_396_ = aClass373_9505.aShortArray3896;
				is_397_ = aClass373_9505.aShortArray3895;
				is_398_ = aClass373_9505.aShortArray3897;
				is_399_ = aClass373_9505.aByteArray3898;
			} else {
				is_396_ = null;
				is_397_ = null;
				is_398_ = null;
				is_399_ = null;
			}
			short[] is_400_;
			short[] is_401_;
			short[] is_402_;
			byte[] is_403_;
			if (class177_sub2_388_.aClass373_9505 != null) {
				is_400_ = class177_sub2_388_.aClass373_9505.aShortArray3896;
				is_401_ = class177_sub2_388_.aClass373_9505.aShortArray3895;
				is_402_ = class177_sub2_388_.aClass373_9505.aShortArray3897;
				is_403_ = class177_sub2_388_.aClass373_9505.aByteArray3898;
			} else {
				is_400_ = null;
				is_401_ = null;
				is_402_ = null;
				is_403_ = null;
			}
			int[] is_404_ = class177_sub2_388_.anIntArray9468;
			short[] is_405_ = class177_sub2_388_.aShortArray9506;
			if (!class177_sub2_388_.aBool9471)
				class177_sub2_388_.method8681();
			int i_406_ = class177_sub2_388_.anInt9478;
			int i_407_ = class177_sub2_388_.anInt9495;
			int i_408_ = class177_sub2_388_.anInt9496;
			int i_409_ = class177_sub2_388_.anInt9497;
			int i_410_ = class177_sub2_388_.anInt9498;
			int i_411_ = class177_sub2_388_.anInt9499;
			for (int i_412_ = 0; i_412_ < anInt9456; i_412_++) {
				int i_413_ = anIntArray9458[i_412_] - i_386_;
				if (i_413_ >= i_406_ && i_413_ <= i_407_) {
					int i_414_ = anIntArray9524[i_412_] - i;
					if (i_414_ >= i_408_ && i_414_ <= i_409_) {
						int i_415_ = anIntArray9493[i_412_] - i_387_;
						if (i_415_ >= i_410_ && i_415_ <= i_411_) {
							int i_416_ = -1;
							int i_417_ = anIntArray9468[i_412_];
							int i_418_ = anIntArray9468[i_412_ + 1];
							for (int i_419_ = i_417_; (i_419_ < i_418_ && aShortArray9506[i_419_] != 0); i_419_++) {
								i_416_ = (aShortArray9506[i_419_] & 0xffff) - 1;
								if (aByteArray9512[i_416_] != 0)
									break;
							}
							if (i_416_ != -1) {
								for (int i_420_ = 0; i_420_ < i_389_; i_420_++) {
									if (i_414_ == is[i_420_] && i_415_ == is_391_[i_420_] && i_413_ == is_390_[i_420_]) {
										int i_421_ = -1;
										i_417_ = is_404_[i_420_];
										i_418_ = is_404_[i_420_ + 1];
										for (int i_422_ = i_417_; (i_422_ < i_418_ && is_405_[i_422_] != 0); i_422_++) {
											i_421_ = is_405_[i_422_] - 1 & 0xffff;
											if (is_395_[i_421_] != 0)
												break;
										}
										if (i_421_ != -1) {
											if (is_396_ == null) {
												aClass373_9505 = new Class373();
												is_396_ = aClass373_9505.aShortArray3896 = (Class483.method5839(aShortArray9500, -1721673827));
												is_397_ = aClass373_9505.aShortArray3895 = (Class483.method5839(aShortArray9466, -1571220090));
												is_398_ = aClass373_9505.aShortArray3897 = (Class483.method5839(aShortArray9467, -2107214825));
												is_399_ = aClass373_9505.aByteArray3898 = (Class536_Sub2.method9364(aByteArray9512, (byte) 22));
											}
											if (is_400_ == null) {
												Class373 class373 = (class177_sub2_388_.aClass373_9505 = new Class373());
												is_400_ = class373.aShortArray3896 = (Class483.method5839(is_392_, -1402681381));
												is_401_ = class373.aShortArray3895 = (Class483.method5839(is_393_, -867766941));
												is_402_ = class373.aShortArray3897 = (Class483.method5839(is_394_, -803162573));
												is_403_ = class373.aByteArray3898 = (Class536_Sub2.method9364(is_395_, (byte) 22));
											}
											short i_423_ = aShortArray9500[i_416_];
											short i_424_ = aShortArray9466[i_416_];
											short i_425_ = aShortArray9467[i_416_];
											byte i_426_ = aByteArray9512[i_416_];
											i_417_ = is_404_[i_420_];
											i_418_ = is_404_[i_420_ + 1];
											for (int i_427_ = i_417_; i_427_ < i_418_; i_427_++) {
												int i_428_ = is_405_[i_427_] - 1;
												if (i_428_ == -1)
													break;
												if (is_403_[i_428_] != 0) {
													is_400_[i_428_] += i_423_;
													is_401_[i_428_] += i_424_;
													is_402_[i_428_] += i_425_;
													is_403_[i_428_] += i_426_;
												}
											}
											i_423_ = is_392_[i_421_];
											i_424_ = is_393_[i_421_];
											i_425_ = is_394_[i_421_];
											i_426_ = is_395_[i_421_];
											i_417_ = anIntArray9468[i_412_];
											i_418_ = anIntArray9468[i_412_ + 1];
											for (int i_429_ = i_417_; (i_429_ < i_418_ && (aShortArray9506[i_429_] != 0)); i_429_++) {
												int i_430_ = ((aShortArray9506[i_429_] & 0xffff) - 1);
												if (is_399_[i_430_] != 0) {
													is_396_[i_430_] += i_423_;
													is_397_[i_430_] += i_424_;
													is_398_[i_430_] += i_425_;
													is_399_[i_430_] += i_426_;
												}
											}
											class177_sub2_388_.method8679();
											method8679();
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public int method2563() {
		if (!aBool9471)
			method8681();
		return anInt9496;
	}

	public int method2483() {
		if (!aBool9471)
			method8681();
		return anInt9497;
	}

	public int method2497() {
		if (!aBool9471)
			method8681();
		return anInt9495;
	}

	public int method2498() {
		if (!aBool9471)
			method8681();
		return anInt9498;
	}

	public int method2499() {
		if (!aBool9471)
			method8681();
		return anInt9499;
	}

	void method8683() {
		if (aClass375_9484 != null)
			aClass375_9484.aBool3911 = false;
	}

	public void method2469(Class177 class177, int i, int i_431_, int i_432_, boolean bool) {
		Class177_Sub2 class177_sub2_433_ = (Class177_Sub2) class177;
		if (anInt9472 != 0 && class177_sub2_433_.anInt9472 != 0) {
			int i_434_ = class177_sub2_433_.anInt9456;
			int[] is = class177_sub2_433_.anIntArray9524;
			int[] is_435_ = class177_sub2_433_.anIntArray9458;
			int[] is_436_ = class177_sub2_433_.anIntArray9493;
			short[] is_437_ = class177_sub2_433_.aShortArray9500;
			short[] is_438_ = class177_sub2_433_.aShortArray9466;
			short[] is_439_ = class177_sub2_433_.aShortArray9467;
			byte[] is_440_ = class177_sub2_433_.aByteArray9512;
			short[] is_441_;
			short[] is_442_;
			short[] is_443_;
			byte[] is_444_;
			if (aClass373_9505 != null) {
				is_441_ = aClass373_9505.aShortArray3896;
				is_442_ = aClass373_9505.aShortArray3895;
				is_443_ = aClass373_9505.aShortArray3897;
				is_444_ = aClass373_9505.aByteArray3898;
			} else {
				is_441_ = null;
				is_442_ = null;
				is_443_ = null;
				is_444_ = null;
			}
			short[] is_445_;
			short[] is_446_;
			short[] is_447_;
			byte[] is_448_;
			if (class177_sub2_433_.aClass373_9505 != null) {
				is_445_ = class177_sub2_433_.aClass373_9505.aShortArray3896;
				is_446_ = class177_sub2_433_.aClass373_9505.aShortArray3895;
				is_447_ = class177_sub2_433_.aClass373_9505.aShortArray3897;
				is_448_ = class177_sub2_433_.aClass373_9505.aByteArray3898;
			} else {
				is_445_ = null;
				is_446_ = null;
				is_447_ = null;
				is_448_ = null;
			}
			int[] is_449_ = class177_sub2_433_.anIntArray9468;
			short[] is_450_ = class177_sub2_433_.aShortArray9506;
			if (!class177_sub2_433_.aBool9471)
				class177_sub2_433_.method8681();
			int i_451_ = class177_sub2_433_.anInt9478;
			int i_452_ = class177_sub2_433_.anInt9495;
			int i_453_ = class177_sub2_433_.anInt9496;
			int i_454_ = class177_sub2_433_.anInt9497;
			int i_455_ = class177_sub2_433_.anInt9498;
			int i_456_ = class177_sub2_433_.anInt9499;
			for (int i_457_ = 0; i_457_ < anInt9456; i_457_++) {
				int i_458_ = anIntArray9458[i_457_] - i_431_;
				if (i_458_ >= i_451_ && i_458_ <= i_452_) {
					int i_459_ = anIntArray9524[i_457_] - i;
					if (i_459_ >= i_453_ && i_459_ <= i_454_) {
						int i_460_ = anIntArray9493[i_457_] - i_432_;
						if (i_460_ >= i_455_ && i_460_ <= i_456_) {
							int i_461_ = -1;
							int i_462_ = anIntArray9468[i_457_];
							int i_463_ = anIntArray9468[i_457_ + 1];
							for (int i_464_ = i_462_; (i_464_ < i_463_ && aShortArray9506[i_464_] != 0); i_464_++) {
								i_461_ = (aShortArray9506[i_464_] & 0xffff) - 1;
								if (aByteArray9512[i_461_] != 0)
									break;
							}
							if (i_461_ != -1) {
								for (int i_465_ = 0; i_465_ < i_434_; i_465_++) {
									if (i_459_ == is[i_465_] && i_460_ == is_436_[i_465_] && i_458_ == is_435_[i_465_]) {
										int i_466_ = -1;
										i_462_ = is_449_[i_465_];
										i_463_ = is_449_[i_465_ + 1];
										for (int i_467_ = i_462_; (i_467_ < i_463_ && is_450_[i_467_] != 0); i_467_++) {
											i_466_ = is_450_[i_467_] - 1 & 0xffff;
											if (is_440_[i_466_] != 0)
												break;
										}
										if (i_466_ != -1) {
											if (is_441_ == null) {
												aClass373_9505 = new Class373();
												is_441_ = aClass373_9505.aShortArray3896 = (Class483.method5839(aShortArray9500, -2136180739));
												is_442_ = aClass373_9505.aShortArray3895 = (Class483.method5839(aShortArray9466, -1122773750));
												is_443_ = aClass373_9505.aShortArray3897 = (Class483.method5839(aShortArray9467, -1071838535));
												is_444_ = aClass373_9505.aByteArray3898 = (Class536_Sub2.method9364(aByteArray9512, (byte) 22));
											}
											if (is_445_ == null) {
												Class373 class373 = (class177_sub2_433_.aClass373_9505 = new Class373());
												is_445_ = class373.aShortArray3896 = (Class483.method5839(is_437_, -1958206209));
												is_446_ = class373.aShortArray3895 = (Class483.method5839(is_438_, -873889884));
												is_447_ = class373.aShortArray3897 = (Class483.method5839(is_439_, -1331051833));
												is_448_ = class373.aByteArray3898 = (Class536_Sub2.method9364(is_440_, (byte) 22));
											}
											short i_468_ = aShortArray9500[i_461_];
											short i_469_ = aShortArray9466[i_461_];
											short i_470_ = aShortArray9467[i_461_];
											byte i_471_ = aByteArray9512[i_461_];
											i_462_ = is_449_[i_465_];
											i_463_ = is_449_[i_465_ + 1];
											for (int i_472_ = i_462_; i_472_ < i_463_; i_472_++) {
												int i_473_ = is_450_[i_472_] - 1;
												if (i_473_ == -1)
													break;
												if (is_448_[i_473_] != 0) {
													is_445_[i_473_] += i_468_;
													is_446_[i_473_] += i_469_;
													is_447_[i_473_] += i_470_;
													is_448_[i_473_] += i_471_;
												}
											}
											i_468_ = is_437_[i_466_];
											i_469_ = is_438_[i_466_];
											i_470_ = is_439_[i_466_];
											i_471_ = is_440_[i_466_];
											i_462_ = anIntArray9468[i_457_];
											i_463_ = anIntArray9468[i_457_ + 1];
											for (int i_474_ = i_462_; (i_474_ < i_463_ && (aShortArray9506[i_474_] != 0)); i_474_++) {
												int i_475_ = ((aShortArray9506[i_474_] & 0xffff) - 1);
												if (is_444_[i_475_] != 0) {
													is_441_[i_475_] += i_468_;
													is_442_[i_475_] += i_469_;
													is_443_[i_475_] += i_470_;
													is_444_[i_475_] += i_471_;
												}
											}
											class177_sub2_433_.method8679();
											method8679();
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public void method2502(int i) {
		aShort9494 = (short) i;
		method8678();
	}

	public void method2503(int i) {
		aShort9454 = (short) i;
		method8677();
		method8679();
	}

	public int method2589() {
		return aShort9494;
	}

	public int method2505() {
		return aShort9454;
	}

	public void method2495(int i) {
		aShort9454 = (short) i;
		method8677();
		method8679();
	}

	public int method2466() {
		return anInt9473;
	}

	public void method2552(Class433 class433, Class178 class178, int i) {
		if (aClass351_9474 != null)
			aClass351_9474.method4641();
		if (class178 != null)
			class178.aBool1945 = false;
		if (anInt9462 != 0) {
			Class443 class443 = aClass167_Sub3_9450.aClass443_9580;
			Class443 class443_476_ = aClass167_Sub3_9450.aClass443_9570;
			Class443 class443_477_ = aClass167_Sub3_9450.aClass443_9643;
			class443_476_.method5359(class433);
			class443_477_.method5339(class443_476_);
			class443_477_.method5390(aClass167_Sub3_9450.aClass443_9584);
			if (!aBool9471)
				method8681();
			float[] fs = aClass167_Sub3_9450.aFloatArray9546;
			class443_476_.method5346(0.0F, (float) anInt9478, 0.0F, fs);
			float f = fs[0];
			float f_478_ = fs[1];
			float f_479_ = fs[2];
			class443_476_.method5346(0.0F, (float) anInt9495, 0.0F, fs);
			float f_480_ = fs[0];
			float f_481_ = fs[1];
			float f_482_ = fs[2];
			for (int i_483_ = 0; i_483_ < 6; i_483_++) {
				float[] fs_484_ = aClass167_Sub3_9450.aFloatArrayArray9702[i_483_];
				float f_485_ = (fs_484_[0] * f + fs_484_[1] * f_478_ + fs_484_[2] * f_479_ + fs_484_[3] + (float) anInt9492);
				float f_486_ = (fs_484_[0] * f_480_ + fs_484_[1] * f_481_ + fs_484_[2] * f_482_ + fs_484_[3] + (float) anInt9492);
				if (f_485_ < 0.0F && f_486_ < 0.0F)
					return;
			}
			if (class178 != null) {
				boolean bool = false;
				boolean bool_487_ = true;
				int i_488_ = anInt9496 + anInt9497 >> 1;
				int i_489_ = anInt9498 + anInt9499 >> 1;
				int i_490_ = i_488_;
				int i_491_ = anInt9478;
				int i_492_ = i_489_;
				float f_493_ = (class443_477_.aFloatArray4878[0] * (float) i_490_ + class443_477_.aFloatArray4878[4] * (float) i_491_ + class443_477_.aFloatArray4878[8] * (float) i_492_ + class443_477_.aFloatArray4878[12]);
				float f_494_ = (class443_477_.aFloatArray4878[1] * (float) i_490_ + class443_477_.aFloatArray4878[5] * (float) i_491_ + class443_477_.aFloatArray4878[9] * (float) i_492_ + class443_477_.aFloatArray4878[13]);
				float f_495_ = (class443_477_.aFloatArray4878[2] * (float) i_490_ + class443_477_.aFloatArray4878[6] * (float) i_491_ + class443_477_.aFloatArray4878[10] * (float) i_492_ + class443_477_.aFloatArray4878[14]);
				float f_496_ = (class443_477_.aFloatArray4878[3] * (float) i_490_ + class443_477_.aFloatArray4878[7] * (float) i_491_ + class443_477_.aFloatArray4878[11] * (float) i_492_ + class443_477_.aFloatArray4878[15]);
				if (f_495_ >= -f_496_) {
					class178.anInt1941 = (int) (aClass167_Sub3_9450.aFloat9536 + (aClass167_Sub3_9450.aFloat9588 * f_493_ / f_496_));
					class178.anInt1942 = (int) (aClass167_Sub3_9450.aFloat9589 + (aClass167_Sub3_9450.aFloat9590 * f_494_ / f_496_));
				} else
					bool = true;
				i_490_ = i_488_;
				i_491_ = anInt9495;
				i_492_ = i_489_;
				float f_497_ = (class443_477_.aFloatArray4878[0] * (float) i_490_ + class443_477_.aFloatArray4878[4] * (float) i_491_ + class443_477_.aFloatArray4878[8] * (float) i_492_ + class443_477_.aFloatArray4878[12]);
				float f_498_ = (class443_477_.aFloatArray4878[1] * (float) i_490_ + class443_477_.aFloatArray4878[5] * (float) i_491_ + class443_477_.aFloatArray4878[9] * (float) i_492_ + class443_477_.aFloatArray4878[13]);
				float f_499_ = (class443_477_.aFloatArray4878[2] * (float) i_490_ + class443_477_.aFloatArray4878[6] * (float) i_491_ + class443_477_.aFloatArray4878[10] * (float) i_492_ + class443_477_.aFloatArray4878[14]);
				float f_500_ = (class443_477_.aFloatArray4878[3] * (float) i_490_ + class443_477_.aFloatArray4878[7] * (float) i_491_ + class443_477_.aFloatArray4878[11] * (float) i_492_ + class443_477_.aFloatArray4878[15]);
				if (f_499_ >= -f_500_) {
					class178.anInt1943 = (int) (aClass167_Sub3_9450.aFloat9536 + (aClass167_Sub3_9450.aFloat9588 * f_497_ / f_500_));
					class178.anInt1944 = (int) (aClass167_Sub3_9450.aFloat9589 + (aClass167_Sub3_9450.aFloat9590 * f_498_ / f_500_));
				} else
					bool = true;
				if (bool) {
					if (f_495_ < -f_496_ && f_499_ < -f_500_)
						bool_487_ = false;
					else if (f_495_ < -f_496_) {
						float f_501_ = (f_495_ + f_496_) / (f_499_ + f_500_) - 1.0F;
						float f_502_ = f_493_ + f_501_ * (f_497_ - f_493_);
						float f_503_ = f_494_ + f_501_ * (f_498_ - f_494_);
						float f_504_ = f_496_ + f_501_ * (f_500_ - f_496_);
						class178.anInt1941 = (int) (aClass167_Sub3_9450.aFloat9536 + (aClass167_Sub3_9450.aFloat9588 * f_502_ / f_504_));
						class178.anInt1942 = (int) (aClass167_Sub3_9450.aFloat9589 + (aClass167_Sub3_9450.aFloat9590 * f_503_ / f_504_));
					} else if (f_499_ < -f_500_) {
						float f_505_ = (f_499_ + f_500_) / (f_495_ + f_496_) - 1.0F;
						float f_506_ = f_497_ + f_505_ * (f_493_ - f_497_);
						float f_507_ = f_498_ + f_505_ * (f_494_ - f_498_);
						float f_508_ = f_500_ + f_505_ * (f_496_ - f_500_);
						class178.anInt1943 = (int) (aClass167_Sub3_9450.aFloat9536 + (aClass167_Sub3_9450.aFloat9588 * f_506_ / f_508_));
						class178.anInt1944 = (int) (aClass167_Sub3_9450.aFloat9589 + (aClass167_Sub3_9450.aFloat9590 * f_507_ / f_508_));
					}
				}
				if (bool_487_) {
					if (f_495_ / f_496_ > f_499_ / f_500_) {
						float f_509_ = (f_493_ + (class443.aFloatArray4878[0] * (float) anInt9492) + class443.aFloatArray4878[12]);
						float f_510_ = (f_496_ + (class443.aFloatArray4878[3] * (float) anInt9492) + class443.aFloatArray4878[15]);
						class178.anInt1940 = (int) (aClass167_Sub3_9450.aFloat9536 - (float) class178.anInt1941 + (aClass167_Sub3_9450.aFloat9588 * f_509_ / f_510_));
					} else {
						float f_511_ = (f_497_ + (class443.aFloatArray4878[0] * (float) anInt9492) + class443.aFloatArray4878[12]);
						float f_512_ = (f_500_ + (class443.aFloatArray4878[3] * (float) anInt9492) + class443.aFloatArray4878[15]);
						class178.anInt1940 = (int) (aClass167_Sub3_9450.aFloat9536 - (float) class178.anInt1943 + (aClass167_Sub3_9450.aFloat9588 * f_511_ / f_512_));
					}
					class178.aBool1945 = true;
				}
			}
			aClass167_Sub3_9450.method8711(i);
			method8687(class433);
			aClass167_Sub3_9450.method8711(0);
			class443_476_.method5359(class433);
			class443_476_.method5390(aClass167_Sub3_9450.aClass443_9698);
			method8682(class443_476_);
		}
	}

	public void method2509(short i, short i_513_) {
		Class174 class174 = aClass167_Sub3_9450.aClass174_1852;
		for (int i_514_ = 0; i_514_ < anInt9472; i_514_++) {
			if (aShortArray9479[i_514_] == i)
				aShortArray9479[i_514_] = i_513_;
		}
		byte i_515_ = 0;
		byte i_516_ = 0;
		if (i != -1) {
			Class164 class164 = class174.method2446(i & 0xffff, -1731988750);
			i_515_ = class164.aByte1829;
			i_516_ = class164.aByte1828;
		}
		byte i_517_ = 0;
		byte i_518_ = 0;
		if (i_513_ != -1) {
			Class164 class164 = class174.method2446(i_513_ & 0xffff, -2103921060);
			i_517_ = class164.aByte1829;
			i_518_ = class164.aByte1828;
			if (class164.aByte1802 != 0 || class164.aByte1803 != 0)
				aBool9508 = true;
		}
		if (i_515_ != i_517_ | i_516_ != i_518_) {
			if (aClass372Array9510 != null) {
				for (int i_519_ = 0; i_519_ < anInt9509; i_519_++) {
					Class372 class372 = aClass372Array9510[i_519_];
					Class346 class346 = aClass346Array9511[i_519_];
					class346.anInt3686 = (class346.anInt3686 & ~0xffffff | ((ColourUtils.anIntArray8309[aShortArray9490[class372.anInt3889] & 0xffff]) & 0xffffff));
				}
			}
			method8678();
		}
	}

	public void method2510(int i, int i_520_, int i_521_, int i_522_) {
		for (int i_523_ = 0; i_523_ < anInt9472; i_523_++) {
			int i_524_ = aShortArray9490[i_523_] & 0xffff;
			int i_525_ = i_524_ >> 10 & 0x3f;
			int i_526_ = i_524_ >> 7 & 0x7;
			int i_527_ = i_524_ & 0x7f;
			if (i != -1)
				i_525_ += (i - i_525_) * i_522_ >> 7;
			if (i_520_ != -1)
				i_526_ += (i_520_ - i_526_) * i_522_ >> 7;
			if (i_521_ != -1)
				i_527_ += (i_521_ - i_527_) * i_522_ >> 7;
			aShortArray9490[i_523_] = (short) (i_525_ << 10 | i_526_ << 7 | i_527_);
		}
		if (aClass372Array9510 != null) {
			for (int i_528_ = 0; i_528_ < anInt9509; i_528_++) {
				Class372 class372 = aClass372Array9510[i_528_];
				Class346 class346 = aClass346Array9511[i_528_];
				class346.anInt3686 = (class346.anInt3686 & ~0xffffff | ((ColourUtils.anIntArray8309[aShortArray9490[class372.anInt3889] & 0xffff]) & 0xffffff));
			}
		}
		method8678();
	}

	public void method2470(int i) {
		int i_529_ = Class447.anIntArray4906[i];
		int i_530_ = Class447.anIntArray4921[i];
		for (int i_531_ = 0; i_531_ < anInt9456; i_531_++) {
			int i_532_ = ((anIntArray9458[i_531_] * i_529_ + anIntArray9524[i_531_] * i_530_) >> 14);
			anIntArray9458[i_531_] = (anIntArray9458[i_531_] * i_530_ - anIntArray9524[i_531_] * i_529_) >> 14;
			anIntArray9524[i_531_] = i_532_;
		}
		method8677();
		aBool9471 = false;
	}

	public int method2566() {
		if (!aBool9471)
			method8681();
		return anInt9496;
	}

	public boolean method2512() {
		return aBool9508;
	}

	void method2477() {
		/* empty */
	}

	void method2534() {
		/* empty */
	}

	boolean method2485() {
		if (anIntArrayArray9460 == null)
			return false;
		for (int i = 0; i < anInt9455; i++) {
			anIntArray9524[i] <<= 4;
			anIntArray9458[i] <<= 4;
			anIntArray9493[i] <<= 4;
		}
		anInt9520 = 0;
		anInt9521 = 0;
		anInt9522 = 0;
		return true;
	}

	public boolean method2604() {
		if (aShortArray9479 == null)
			return true;
		for (int i = 0; i < aShortArray9479.length; i++) {
			if (aShortArray9479[i] != -1 && !(aClass167_Sub3_9450.aClass340_9561.method4453(aClass167_Sub3_9450.aClass174_1852.method2446(aShortArray9479[i], -1760657966), -1)))
				return false;
		}
		return true;
	}

	void method2487(int i, int i_533_, int i_534_, int i_535_) {
		if (i == 0) {
			int i_536_ = 0;
			anInt9520 = 0;
			anInt9521 = 0;
			anInt9522 = 0;
			for (int i_537_ = 0; i_537_ < anInt9456; i_537_++) {
				anInt9520 += anIntArray9524[i_537_];
				anInt9521 += anIntArray9458[i_537_];
				anInt9522 += anIntArray9493[i_537_];
				i_536_++;
			}
			if (i_536_ > 0) {
				anInt9520 = anInt9520 / i_536_ + i_533_;
				anInt9521 = anInt9521 / i_536_ + i_534_;
				anInt9522 = anInt9522 / i_536_ + i_535_;
			} else {
				anInt9520 = i_533_;
				anInt9521 = i_534_;
				anInt9522 = i_535_;
			}
		} else if (i == 1) {
			for (int i_538_ = 0; i_538_ < anInt9456; i_538_++) {
				anIntArray9524[i_538_] += i_533_;
				anIntArray9458[i_538_] += i_534_;
				anIntArray9493[i_538_] += i_535_;
			}
		} else if (i == 2) {
			for (int i_539_ = 0; i_539_ < anInt9456; i_539_++) {
				anIntArray9524[i_539_] -= anInt9520;
				anIntArray9458[i_539_] -= anInt9521;
				anIntArray9493[i_539_] -= anInt9522;
				if (i_535_ != 0) {
					int i_540_ = Class447.anIntArray4906[i_535_];
					int i_541_ = Class447.anIntArray4921[i_535_];
					int i_542_ = ((anIntArray9458[i_539_] * i_540_ + anIntArray9524[i_539_] * i_541_ + 16383) >> 14);
					anIntArray9458[i_539_] = (anIntArray9458[i_539_] * i_541_ - anIntArray9524[i_539_] * i_540_ + 16383) >> 14;
					anIntArray9524[i_539_] = i_542_;
				}
				if (i_533_ != 0) {
					int i_543_ = Class447.anIntArray4906[i_533_];
					int i_544_ = Class447.anIntArray4921[i_533_];
					int i_545_ = ((anIntArray9458[i_539_] * i_544_ - anIntArray9493[i_539_] * i_543_ + 16383) >> 14);
					anIntArray9493[i_539_] = (anIntArray9458[i_539_] * i_543_ + anIntArray9493[i_539_] * i_544_ + 16383) >> 14;
					anIntArray9458[i_539_] = i_545_;
				}
				if (i_534_ != 0) {
					int i_546_ = Class447.anIntArray4906[i_534_];
					int i_547_ = Class447.anIntArray4921[i_534_];
					int i_548_ = ((anIntArray9493[i_539_] * i_546_ + anIntArray9524[i_539_] * i_547_ + 16383) >> 14);
					anIntArray9493[i_539_] = (anIntArray9493[i_539_] * i_547_ - anIntArray9524[i_539_] * i_546_ + 16383) >> 14;
					anIntArray9524[i_539_] = i_548_;
				}
				anIntArray9524[i_539_] += anInt9520;
				anIntArray9458[i_539_] += anInt9521;
				anIntArray9493[i_539_] += anInt9522;
			}
		} else if (i == 3) {
			for (int i_549_ = 0; i_549_ < anInt9456; i_549_++) {
				anIntArray9524[i_549_] -= anInt9520;
				anIntArray9458[i_549_] -= anInt9521;
				anIntArray9493[i_549_] -= anInt9522;
				anIntArray9524[i_549_] = anIntArray9524[i_549_] * i_533_ / 128;
				anIntArray9458[i_549_] = anIntArray9458[i_549_] * i_534_ / 128;
				anIntArray9493[i_549_] = anIntArray9493[i_549_] * i_535_ / 128;
				anIntArray9524[i_549_] += anInt9520;
				anIntArray9458[i_549_] += anInt9521;
				anIntArray9493[i_549_] += anInt9522;
			}
		} else if (i == 5) {
			for (int i_550_ = 0; i_550_ < anInt9472; i_550_++) {
				int i_551_ = (aByteArray9448[i_550_] & 0xff) + i_533_ * 8;
				if (i_551_ < 0)
					i_551_ = 0;
				else if (i_551_ > 255)
					i_551_ = 255;
				aByteArray9448[i_550_] = (byte) i_551_;
			}
			if (aClass372Array9510 != null) {
				for (int i_552_ = 0; i_552_ < anInt9509; i_552_++) {
					Class372 class372 = aClass372Array9510[i_552_];
					Class346 class346 = aClass346Array9511[i_552_];
					class346.anInt3686 = (class346.anInt3686 & 0xffffff | (255 - (aByteArray9448[class372.anInt3889] & 0xff) << 24));
				}
			}
			method8678();
		} else if (i == 7) {
			for (int i_553_ = 0; i_553_ < anInt9472; i_553_++) {
				int i_554_ = aShortArray9490[i_553_] & 0xffff;
				int i_555_ = i_554_ >> 10 & 0x3f;
				int i_556_ = i_554_ >> 7 & 0x7;
				int i_557_ = i_554_ & 0x7f;
				i_555_ = i_555_ + i_533_ & 0x3f;
				i_556_ += i_534_ / 4;
				if (i_556_ < 0)
					i_556_ = 0;
				else if (i_556_ > 7)
					i_556_ = 7;
				i_557_ += i_535_;
				if (i_557_ < 0)
					i_557_ = 0;
				else if (i_557_ > 127)
					i_557_ = 127;
				aShortArray9490[i_553_] = (short) (i_555_ << 10 | i_556_ << 7 | i_557_);
			}
			if (aClass372Array9510 != null) {
				for (int i_558_ = 0; i_558_ < anInt9509; i_558_++) {
					Class372 class372 = aClass372Array9510[i_558_];
					Class346 class346 = aClass346Array9511[i_558_];
					class346.anInt3686 = (class346.anInt3686 & ~0xffffff | ((ColourUtils.anIntArray8309[aShortArray9490[class372.anInt3889] & 0xffff]) & 0xffffff));
				}
			}
			method8678();
		} else if (i == 8) {
			for (int i_559_ = 0; i_559_ < anInt9509; i_559_++) {
				Class346 class346 = aClass346Array9511[i_559_];
				class346.anInt3685 += i_533_;
				class346.anInt3682 += i_534_;
			}
		} else if (i == 10) {
			for (int i_560_ = 0; i_560_ < anInt9509; i_560_++) {
				Class346 class346 = aClass346Array9511[i_560_];
				class346.anInt3683 = class346.anInt3683 * i_533_ >> 7;
				class346.anInt3684 = class346.anInt3684 * i_534_ >> 7;
			}
		} else if (i == 9) {
			for (int i_561_ = 0; i_561_ < anInt9509; i_561_++) {
				Class346 class346 = aClass346Array9511[i_561_];
				class346.anInt3687 = class346.anInt3687 + i_533_ & 0x3fff;
			}
		}
	}

	boolean method8684(int i, int i_562_, int i_563_, int i_564_, int i_565_, int i_566_, int i_567_, int i_568_, int i_569_, int i_570_) {
		if (i_564_ < i_565_ && i_564_ < i_566_ && i_564_ < i_567_)
			return false;
		if (i_562_ > i_565_ && i_562_ > i_566_ && i_562_ > i_567_)
			return false;
		if (i_563_ < i_568_ && i_563_ < i_569_ && i_563_ < i_570_)
			return false;
		if (i > i_568_ && i > i_569_ && i > i_570_)
			return false;
		return true;
	}

	void method2573() {
		for (int i = 0; i < anInt9455; i++) {
			anIntArray9524[i] = anIntArray9524[i] + 7 >> 4;
			anIntArray9458[i] = anIntArray9458[i] + 7 >> 4;
			anIntArray9493[i] = anIntArray9493[i] + 7 >> 4;
		}
		method8677();
		aBool9471 = false;
	}

	public void method2489(Class433 class433, int i, boolean bool) {
		if (aShortArray9461 != null) {
			Class433 class433_571_ = class433;
			if (bool) {
				class433_571_ = aClass167_Sub3_9450.aClass433_9543;
				class433_571_.method5196(class433);
			}
			float[] fs = new float[3];
			for (int i_572_ = 0; i_572_ < anInt9456; i_572_++) {
				if ((i & aShortArray9461[i_572_]) != 0) {
					class433_571_.method5215((float) anIntArray9524[i_572_], (float) anIntArray9458[i_572_], (float) anIntArray9493[i_572_], fs);
					anIntArray9524[i_572_] = (int) fs[0];
					anIntArray9458[i_572_] = (int) fs[1];
					anIntArray9493[i_572_] = (int) fs[2];
				}
			}
		}
	}

	public void method2626(int i) {
		int i_573_ = Class447.anIntArray4906[i];
		int i_574_ = Class447.anIntArray4921[i];
		for (int i_575_ = 0; i_575_ < anInt9456; i_575_++) {
			int i_576_ = ((anIntArray9493[i_575_] * i_573_ + anIntArray9524[i_575_] * i_574_) >> 14);
			anIntArray9493[i_575_] = (anIntArray9493[i_575_] * i_574_ - anIntArray9524[i_575_] * i_573_) >> 14;
			anIntArray9524[i_575_] = i_576_;
		}
		for (int i_577_ = 0; i_577_ < anInt9462; i_577_++) {
			int i_578_ = ((aShortArray9467[i_577_] * i_573_ + aShortArray9500[i_577_] * i_574_) >> 14);
			aShortArray9467[i_577_] = (short) ((aShortArray9467[i_577_] * i_574_ - aShortArray9500[i_577_] * i_573_) >> 14);
			aShortArray9500[i_577_] = (short) i_578_;
		}
		method8677();
		method8679();
		aBool9471 = false;
	}

	public Class172[] method2514() {
		return aClass172Array9517;
	}

	public void method2513(Class433 class433) {
		Class443 class443 = aClass167_Sub3_9450.aClass443_9570;
		class443.method5359(class433);
		if (aClass172Array9517 != null) {
			for (int i = 0; i < aClass172Array9517.length; i++) {
				Class172 class172 = aClass172Array9517[i];
				Class172 class172_579_ = class172;
				if (class172.aClass172_1910 != null)
					class172_579_ = class172.aClass172_1910;
				class172_579_.anInt1913 = ((int) (class443.aFloatArray4878[12] + ((class443.aFloatArray4878[0] * (float) anIntArray9524[(class172.anInt1909 * -1506968299)]) + (class443.aFloatArray4878[4] * (float) (anIntArray9458[(class172.anInt1909 * -1506968299)])) + (class443.aFloatArray4878[8] * (float) (anIntArray9493[(class172.anInt1909 * -1506968299)])))) * -1971428173);
				class172_579_.anInt1914 = ((int) (class443.aFloatArray4878[13] + ((class443.aFloatArray4878[1] * (float) anIntArray9524[(class172.anInt1909 * -1506968299)]) + (class443.aFloatArray4878[5] * (float) (anIntArray9458[(class172.anInt1909 * -1506968299)])) + (class443.aFloatArray4878[9] * (float) (anIntArray9493[(class172.anInt1909 * -1506968299)])))) * 179150469);
				class172_579_.anInt1915 = ((int) (class443.aFloatArray4878[14] + ((class443.aFloatArray4878[2] * (float) anIntArray9524[(class172.anInt1909 * -1506968299)]) + (class443.aFloatArray4878[6] * (float) (anIntArray9458[(class172.anInt1909 * -1506968299)])) + (class443.aFloatArray4878[10] * (float) (anIntArray9493[(class172.anInt1909 * -1506968299)])))) * -26173683);
				class172_579_.anInt1907 = ((int) (class443.aFloatArray4878[12] + ((class443.aFloatArray4878[0] * (float) anIntArray9524[(class172.anInt1916 * -1724466837)]) + (class443.aFloatArray4878[4] * (float) (anIntArray9458[(class172.anInt1916 * -1724466837)])) + (class443.aFloatArray4878[8] * (float) (anIntArray9493[(class172.anInt1916 * -1724466837)])))) * 163461589);
				class172_579_.anInt1917 = ((int) (class443.aFloatArray4878[13] + ((class443.aFloatArray4878[1] * (float) anIntArray9524[(class172.anInt1916 * -1724466837)]) + (class443.aFloatArray4878[5] * (float) (anIntArray9458[(class172.anInt1916 * -1724466837)])) + (class443.aFloatArray4878[9] * (float) (anIntArray9493[(class172.anInt1916 * -1724466837)])))) * 555769531);
				class172_579_.anInt1918 = ((int) (class443.aFloatArray4878[14] + ((class443.aFloatArray4878[2] * (float) anIntArray9524[(class172.anInt1916 * -1724466837)]) + (class443.aFloatArray4878[6] * (float) (anIntArray9458[(class172.anInt1916 * -1724466837)])) + (class443.aFloatArray4878[10] * (float) (anIntArray9493[(class172.anInt1916 * -1724466837)])))) * -379440279);
				class172_579_.anInt1919 = ((int) (class443.aFloatArray4878[12] + ((class443.aFloatArray4878[0] * (float) anIntArray9524[(class172.anInt1911 * -767867943)]) + (class443.aFloatArray4878[4] * (float) (anIntArray9458[(class172.anInt1911 * -767867943)])) + (class443.aFloatArray4878[8] * (float) (anIntArray9493[(class172.anInt1911 * -767867943)])))) * -767320321);
				class172_579_.anInt1920 = ((int) (class443.aFloatArray4878[13] + ((class443.aFloatArray4878[1] * (float) anIntArray9524[(class172.anInt1911 * -767867943)]) + (class443.aFloatArray4878[5] * (float) (anIntArray9458[(class172.anInt1911 * -767867943)])) + (class443.aFloatArray4878[9] * (float) (anIntArray9493[(class172.anInt1911 * -767867943)])))) * 1270728077);
				class172_579_.anInt1921 = ((int) (class443.aFloatArray4878[14] + ((class443.aFloatArray4878[2] * (float) anIntArray9524[(class172.anInt1911 * -767867943)]) + (class443.aFloatArray4878[6] * (float) (anIntArray9458[(class172.anInt1911 * -767867943)])) + (class443.aFloatArray4878[10] * (float) (anIntArray9493[(class172.anInt1911 * -767867943)])))) * -2080843121);
			}
		}
		if (aClass156Array9464 != null) {
			for (int i = 0; i < aClass156Array9464.length; i++) {
				Class156 class156 = aClass156Array9464[i];
				Class156 class156_580_ = class156;
				if (class156.aClass156_1735 != null)
					class156_580_ = class156.aClass156_1735;
				if (class156.aClass443_1740 != null)
					class156.aClass443_1740.method5339(class443);
				else
					class156.aClass443_1740 = new Class443(class443);
				class156_580_.anInt1734 = ((int) (class443.aFloatArray4878[12] + ((class443.aFloatArray4878[0] * (float) anIntArray9524[(class156.anInt1738 * -986127555)]) + (class443.aFloatArray4878[4] * (float) (anIntArray9458[(class156.anInt1738 * -986127555)])) + (class443.aFloatArray4878[8] * (float) (anIntArray9493[(class156.anInt1738 * -986127555)])))) * 1464786499);
				class156_580_.anInt1737 = (int) (class443.aFloatArray4878[13] + ((class443.aFloatArray4878[1] * (float) (anIntArray9524[class156.anInt1738 * -986127555])) + (class443.aFloatArray4878[5] * (float) anIntArray9458[(class156.anInt1738 * -986127555)]) + (class443.aFloatArray4878[9] * (float) (anIntArray9493[(class156.anInt1738 * -986127555)])))) * 524114341;
				class156_580_.anInt1739 = ((int) (class443.aFloatArray4878[14] + ((class443.aFloatArray4878[2] * (float) anIntArray9524[(class156.anInt1738 * -986127555)]) + (class443.aFloatArray4878[6] * (float) (anIntArray9458[(class156.anInt1738 * -986127555)])) + (class443.aFloatArray4878[10] * (float) (anIntArray9493[(class156.anInt1738 * -986127555)])))) * -1766187741);
			}
		}
	}

	public boolean method2549(int i, int i_581_, Class433 class433, boolean bool, int i_582_) {
		return method8685(i, i_581_, 0, 0, class433, bool, i_582_);
	}

	boolean method8685(int i, int i_583_, int i_584_, int i_585_, Class433 class433, boolean bool, int i_586_) {
		Class443 class443 = aClass167_Sub3_9450.aClass443_9570;
		class443.method5359(class433);
		class443.method5390(aClass167_Sub3_9450.aClass443_9584);
		boolean bool_587_ = false;
		float f = 3.4028235E38F;
		float f_588_ = -3.4028235E38F;
		float f_589_ = 3.4028235E38F;
		float f_590_ = -3.4028235E38F;
		if (!aBool9471)
			method8681();
		int i_591_ = anInt9497 - anInt9496 >> 1;
		int i_592_ = anInt9495 - anInt9478 >> 1;
		int i_593_ = anInt9499 - anInt9498 >> 1;
		int i_594_ = anInt9496 + i_591_;
		int i_595_ = anInt9478 + i_592_;
		int i_596_ = anInt9498 + i_593_;
		int i_597_ = i_594_ - (i_591_ << i_586_);
		int i_598_ = i_595_ - (i_592_ << i_586_);
		int i_599_ = i_596_ - (i_593_ << i_586_);
		int i_600_ = i_594_ + (i_591_ << i_586_);
		int i_601_ = i_595_ + (i_592_ << i_586_);
		int i_602_ = i_596_ + (i_593_ << i_586_);
		anIntArray9476[0] = i_597_;
		anIntArray9502[0] = i_598_;
		anIntArray9519[0] = i_599_;
		anIntArray9476[1] = i_600_;
		anIntArray9502[1] = i_598_;
		anIntArray9519[1] = i_599_;
		anIntArray9476[2] = i_597_;
		anIntArray9502[2] = i_601_;
		anIntArray9519[2] = i_599_;
		anIntArray9476[3] = i_600_;
		anIntArray9502[3] = i_601_;
		anIntArray9519[3] = i_599_;
		anIntArray9476[4] = i_597_;
		anIntArray9502[4] = i_598_;
		anIntArray9519[4] = i_602_;
		anIntArray9476[5] = i_600_;
		anIntArray9502[5] = i_598_;
		anIntArray9519[5] = i_602_;
		anIntArray9476[6] = i_597_;
		anIntArray9502[6] = i_601_;
		anIntArray9519[6] = i_602_;
		anIntArray9476[7] = i_600_;
		anIntArray9502[7] = i_601_;
		anIntArray9519[7] = i_602_;
		for (int i_603_ = 0; i_603_ < 8; i_603_++) {
			float f_604_ = (float) anIntArray9476[i_603_];
			float f_605_ = (float) anIntArray9502[i_603_];
			float f_606_ = (float) anIntArray9519[i_603_];
			float f_607_ = (class443.aFloatArray4878[2] * f_604_ + class443.aFloatArray4878[6] * f_605_ + class443.aFloatArray4878[10] * f_606_ + class443.aFloatArray4878[14]);
			float f_608_ = (class443.aFloatArray4878[3] * f_604_ + class443.aFloatArray4878[7] * f_605_ + class443.aFloatArray4878[11] * f_606_ + class443.aFloatArray4878[15]);
			if (f_607_ >= -f_608_) {
				float f_609_ = (class443.aFloatArray4878[0] * f_604_ + class443.aFloatArray4878[4] * f_605_ + class443.aFloatArray4878[8] * f_606_ + class443.aFloatArray4878[12]);
				float f_610_ = (class443.aFloatArray4878[1] * f_604_ + class443.aFloatArray4878[5] * f_605_ + class443.aFloatArray4878[9] * f_606_ + class443.aFloatArray4878[13]);
				float f_611_ = (aClass167_Sub3_9450.aFloat9536 + aClass167_Sub3_9450.aFloat9588 * f_609_ / f_608_);
				float f_612_ = (aClass167_Sub3_9450.aFloat9589 + aClass167_Sub3_9450.aFloat9590 * f_610_ / f_608_);
				if (f_611_ < f)
					f = f_611_;
				if (f_611_ > f_588_)
					f_588_ = f_611_;
				if (f_612_ < f_589_)
					f_589_ = f_612_;
				if (f_612_ > f_590_)
					f_590_ = f_612_;
				bool_587_ = true;
			}
		}
		int i_613_ = i + i_584_;
		int i_614_ = i_583_ + i_585_;
		if (bool_587_ && (float) i_613_ > f && (float) i < f_588_ && (float) i_614_ > f_589_ && (float) i_583_ < f_590_) {
			if (bool)
				return true;
			if (anIntArray9475.length < anInt9462) {
				anIntArray9475 = new int[anInt9462];
				anIntArray9516 = new int[anInt9462];
			}
			for (int i_615_ = 0; i_615_ < anInt9456; i_615_++) {
				float f_616_ = (float) anIntArray9524[i_615_];
				float f_617_ = (float) anIntArray9458[i_615_];
				float f_618_ = (float) anIntArray9493[i_615_];
				float f_619_ = (class443.aFloatArray4878[2] * f_616_ + class443.aFloatArray4878[6] * f_617_ + class443.aFloatArray4878[10] * f_618_ + class443.aFloatArray4878[14]);
				float f_620_ = (class443.aFloatArray4878[3] * f_616_ + class443.aFloatArray4878[7] * f_617_ + class443.aFloatArray4878[11] * f_618_ + class443.aFloatArray4878[15]);
				if (f_619_ >= -f_620_) {
					float f_621_ = (class443.aFloatArray4878[0] * f_616_ + class443.aFloatArray4878[4] * f_617_ + class443.aFloatArray4878[8] * f_618_ + class443.aFloatArray4878[12]);
					float f_622_ = (class443.aFloatArray4878[1] * f_616_ + class443.aFloatArray4878[5] * f_617_ + class443.aFloatArray4878[9] * f_618_ + class443.aFloatArray4878[13]);
					int i_623_ = anIntArray9468[i_615_];
					int i_624_ = anIntArray9468[i_615_ + 1];
					for (int i_625_ = i_623_; i_625_ < i_624_ && aShortArray9506[i_625_] != 0; i_625_++) {
						int i_626_ = (aShortArray9506[i_625_] & 0xffff) - 1;
						anIntArray9475[i_626_] = (int) (aClass167_Sub3_9450.aFloat9536 + (aClass167_Sub3_9450.aFloat9588 * f_621_ / f_620_));
						anIntArray9516[i_626_] = (int) (aClass167_Sub3_9450.aFloat9589 + (aClass167_Sub3_9450.aFloat9590 * f_622_ / f_620_));
					}
				} else {
					int i_627_ = anIntArray9468[i_615_];
					int i_628_ = anIntArray9468[i_615_ + 1];
					for (int i_629_ = i_627_; i_629_ < i_628_ && aShortArray9506[i_629_] != 0; i_629_++) {
						int i_630_ = (aShortArray9506[i_629_] & 0xffff) - 1;
						anIntArray9475[i_630_] = -999999;
					}
				}
			}
			for (int i_631_ = 0; i_631_ < anInt9472; i_631_++) {
				if (anIntArray9475[aShortArray9463[i_631_] & 0xffff] != -999999 && (anIntArray9475[aShortArray9477[i_631_] & 0xffff] != -999999) && (anIntArray9475[aShortArray9488[i_631_] & 0xffff] != -999999)
						&& (method8684(i, i_583_, i_613_, i_614_, anIntArray9516[aShortArray9463[i_631_] & 0xffff], anIntArray9516[aShortArray9477[i_631_] & 0xffff], anIntArray9516[aShortArray9488[i_631_] & 0xffff], anIntArray9475[aShortArray9463[i_631_] & 0xffff], anIntArray9475[aShortArray9477[i_631_] & 0xffff], anIntArray9475[aShortArray9488[i_631_] & 0xffff])))
					return true;
			}
		}
		return false;
	}

	Class177_Sub2(Class167_Sub3 class167_sub3, int i, int i_632_, boolean bool, boolean bool_633_) {
		anInt9457 = 0;
		aBool9487 = false;
		aBool9465 = true;
		aBool9489 = false;
		aBool9508 = false;
		aBool9471 = false;
		aBool9453 = false;
		aFloatArray9514 = new float[2];
		anIntArray9475 = new int[1];
		anIntArray9516 = new int[1];
		anIntArray9476 = new int[8];
		anIntArray9502 = new int[8];
		anIntArray9519 = new int[8];
		aClass167_Sub3_9450 = class167_sub3;
		anInt9473 = i;
		anInt9452 = i_632_;
		aBool9487 = bool_633_;
		if (bool || Class345.method4501(anInt9473, anInt9452))
			aClass375_9483 = new Class375(Class345.method4506(anInt9473, anInt9452));
		if (bool || Class345.method4541(anInt9473, anInt9452))
			aClass375_9486 = new Class375(Class345.method4508(anInt9473, anInt9452));
		if (bool || Class345.method4492(anInt9473, anInt9452))
			aClass375_9484 = new Class375(Class345.method4558(anInt9473, anInt9452));
		if (bool || Class345.method4502(anInt9473, anInt9452))
			aClass375_9485 = new Class375(Class345.method4531(anInt9473, anInt9452));
		if (bool || Class345.method4505(anInt9473, anInt9452))
			aClass348_9482 = new Class348(Class345.method4509(anInt9473, anInt9452));
		if (bool && bool_633_) {
			aClass375_9483.anInterface38_3910 = aClass375_9483.anInterface38_3908 = aClass167_Sub3_9450.method8805(aBool9487);
			aClass375_9486.anInterface38_3910 = aClass375_9486.anInterface38_3908 = aClass167_Sub3_9450.method8805(aBool9487);
			aClass375_9484.anInterface38_3910 = aClass375_9484.anInterface38_3908 = aClass167_Sub3_9450.method8805(aBool9487);
			aClass375_9485.anInterface38_3910 = aClass375_9485.anInterface38_3908 = aClass167_Sub3_9450.method8805(aBool9487);
		}
	}

	public Class536_Sub18_Sub7 method2459(Class536_Sub18_Sub7 class536_sub18_sub7) {
		if (anInt9462 == 0)
			return null;
		if (!aBool9471)
			method8681();
		int i;
		int i_634_;
		if (aClass167_Sub3_9450.anInt9634 > 0) {
			i = (anInt9496 - (anInt9495 * aClass167_Sub3_9450.anInt9634 >> 8) >> aClass167_Sub3_9450.anInt9633);
			i_634_ = anInt9497 - (anInt9478 * aClass167_Sub3_9450.anInt9634 >> 8) >> aClass167_Sub3_9450.anInt9633;
		} else {
			i = (anInt9496 - (anInt9478 * aClass167_Sub3_9450.anInt9634 >> 8) >> aClass167_Sub3_9450.anInt9633);
			i_634_ = anInt9497 - (anInt9495 * aClass167_Sub3_9450.anInt9634 >> 8) >> aClass167_Sub3_9450.anInt9633;
		}
		int i_635_;
		int i_636_;
		if (aClass167_Sub3_9450.anInt9635 > 0) {
			i_635_ = anInt9498 - (anInt9495 * aClass167_Sub3_9450.anInt9635 >> 8) >> aClass167_Sub3_9450.anInt9633;
			i_636_ = anInt9499 - (anInt9478 * aClass167_Sub3_9450.anInt9635 >> 8) >> aClass167_Sub3_9450.anInt9633;
		} else {
			i_635_ = anInt9498 - (anInt9478 * aClass167_Sub3_9450.anInt9635 >> 8) >> aClass167_Sub3_9450.anInt9633;
			i_636_ = anInt9499 - (anInt9495 * aClass167_Sub3_9450.anInt9635 >> 8) >> aClass167_Sub3_9450.anInt9633;
		}
		int i_637_ = i_634_ - i + 1;
		int i_638_ = i_636_ - i_635_ + 1;
		Class536_Sub18_Sub7_Sub1 class536_sub18_sub7_sub1 = (Class536_Sub18_Sub7_Sub1) class536_sub18_sub7;
		Class536_Sub18_Sub7_Sub1 class536_sub18_sub7_sub1_639_;
		if (class536_sub18_sub7_sub1 != null && class536_sub18_sub7_sub1.method10972(i_637_, i_638_)) {
			class536_sub18_sub7_sub1_639_ = class536_sub18_sub7_sub1;
			class536_sub18_sub7_sub1_639_.method10980();
		} else
			class536_sub18_sub7_sub1_639_ = new Class536_Sub18_Sub7_Sub1(aClass167_Sub3_9450, i_637_, i_638_);
		class536_sub18_sub7_sub1_639_.method10973(i, i_635_, i_634_, i_636_);
		method8686(class536_sub18_sub7_sub1_639_);
		return class536_sub18_sub7_sub1_639_;
	}

	void method8686(Class536_Sub18_Sub7_Sub1 class536_sub18_sub7_sub1) {
		if (anIntArray9475.length < anInt9462) {
			anIntArray9475 = new int[anInt9462];
			anIntArray9516 = new int[anInt9462];
		}
		for (int i = 0; i < anInt9456; i++) {
			int i_640_ = (((anIntArray9524[i] - (anIntArray9458[i] * aClass167_Sub3_9450.anInt9634 >> 8)) >> aClass167_Sub3_9450.anInt9633) - class536_sub18_sub7_sub1.anInt12054);
			int i_641_ = (((anIntArray9493[i] - (anIntArray9458[i] * aClass167_Sub3_9450.anInt9635 >> 8)) >> aClass167_Sub3_9450.anInt9633) - class536_sub18_sub7_sub1.anInt12051);
			int i_642_ = anIntArray9468[i];
			int i_643_ = anIntArray9468[i + 1];
			for (int i_644_ = i_642_; i_644_ < i_643_ && aShortArray9506[i_644_] != 0; i_644_++) {
				int i_645_ = (aShortArray9506[i_644_] & 0xffff) - 1;
				anIntArray9475[i_645_] = i_640_;
				anIntArray9516[i_645_] = i_641_;
			}
		}
		for (int i = 0; i < anInt9457; i++) {
			if (aByteArray9448 == null || aByteArray9448[i] <= 128) {
				int i_646_ = aShortArray9463[i] & 0xffff;
				int i_647_ = aShortArray9477[i] & 0xffff;
				int i_648_ = aShortArray9488[i] & 0xffff;
				int i_649_ = anIntArray9475[i_646_];
				int i_650_ = anIntArray9475[i_647_];
				int i_651_ = anIntArray9475[i_648_];
				int i_652_ = anIntArray9516[i_646_];
				int i_653_ = anIntArray9516[i_647_];
				int i_654_ = anIntArray9516[i_648_];
				if (((i_649_ - i_650_) * (i_653_ - i_654_) - (i_653_ - i_652_) * (i_651_ - i_650_)) > 0)
					class536_sub18_sub7_sub1.method10975(i_652_, i_653_, i_654_, i_649_, i_650_, i_651_);
			}
		}
	}

	public void method2490(Class433 class433, Class178 class178, int i) {
		if (aClass351_9474 != null)
			aClass351_9474.method4641();
		if (class178 != null)
			class178.aBool1945 = false;
		if (anInt9462 != 0) {
			Class443 class443 = aClass167_Sub3_9450.aClass443_9580;
			Class443 class443_655_ = aClass167_Sub3_9450.aClass443_9570;
			Class443 class443_656_ = aClass167_Sub3_9450.aClass443_9643;
			class443_655_.method5359(class433);
			class443_656_.method5339(class443_655_);
			class443_656_.method5390(aClass167_Sub3_9450.aClass443_9584);
			if (!aBool9471)
				method8681();
			float[] fs = aClass167_Sub3_9450.aFloatArray9546;
			class443_655_.method5346(0.0F, (float) anInt9478, 0.0F, fs);
			float f = fs[0];
			float f_657_ = fs[1];
			float f_658_ = fs[2];
			class443_655_.method5346(0.0F, (float) anInt9495, 0.0F, fs);
			float f_659_ = fs[0];
			float f_660_ = fs[1];
			float f_661_ = fs[2];
			for (int i_662_ = 0; i_662_ < 6; i_662_++) {
				float[] fs_663_ = aClass167_Sub3_9450.aFloatArrayArray9702[i_662_];
				float f_664_ = (fs_663_[0] * f + fs_663_[1] * f_657_ + fs_663_[2] * f_658_ + fs_663_[3] + (float) anInt9492);
				float f_665_ = (fs_663_[0] * f_659_ + fs_663_[1] * f_660_ + fs_663_[2] * f_661_ + fs_663_[3] + (float) anInt9492);
				if (f_664_ < 0.0F && f_665_ < 0.0F)
					return;
			}
			if (class178 != null) {
				boolean bool = false;
				boolean bool_666_ = true;
				int i_667_ = anInt9496 + anInt9497 >> 1;
				int i_668_ = anInt9498 + anInt9499 >> 1;
				int i_669_ = i_667_;
				int i_670_ = anInt9478;
				int i_671_ = i_668_;
				float f_672_ = (class443_656_.aFloatArray4878[0] * (float) i_669_ + class443_656_.aFloatArray4878[4] * (float) i_670_ + class443_656_.aFloatArray4878[8] * (float) i_671_ + class443_656_.aFloatArray4878[12]);
				float f_673_ = (class443_656_.aFloatArray4878[1] * (float) i_669_ + class443_656_.aFloatArray4878[5] * (float) i_670_ + class443_656_.aFloatArray4878[9] * (float) i_671_ + class443_656_.aFloatArray4878[13]);
				float f_674_ = (class443_656_.aFloatArray4878[2] * (float) i_669_ + class443_656_.aFloatArray4878[6] * (float) i_670_ + class443_656_.aFloatArray4878[10] * (float) i_671_ + class443_656_.aFloatArray4878[14]);
				float f_675_ = (class443_656_.aFloatArray4878[3] * (float) i_669_ + class443_656_.aFloatArray4878[7] * (float) i_670_ + class443_656_.aFloatArray4878[11] * (float) i_671_ + class443_656_.aFloatArray4878[15]);
				if (f_674_ >= -f_675_) {
					class178.anInt1941 = (int) (aClass167_Sub3_9450.aFloat9536 + (aClass167_Sub3_9450.aFloat9588 * f_672_ / f_675_));
					class178.anInt1942 = (int) (aClass167_Sub3_9450.aFloat9589 + (aClass167_Sub3_9450.aFloat9590 * f_673_ / f_675_));
				} else
					bool = true;
				i_669_ = i_667_;
				i_670_ = anInt9495;
				i_671_ = i_668_;
				float f_676_ = (class443_656_.aFloatArray4878[0] * (float) i_669_ + class443_656_.aFloatArray4878[4] * (float) i_670_ + class443_656_.aFloatArray4878[8] * (float) i_671_ + class443_656_.aFloatArray4878[12]);
				float f_677_ = (class443_656_.aFloatArray4878[1] * (float) i_669_ + class443_656_.aFloatArray4878[5] * (float) i_670_ + class443_656_.aFloatArray4878[9] * (float) i_671_ + class443_656_.aFloatArray4878[13]);
				float f_678_ = (class443_656_.aFloatArray4878[2] * (float) i_669_ + class443_656_.aFloatArray4878[6] * (float) i_670_ + class443_656_.aFloatArray4878[10] * (float) i_671_ + class443_656_.aFloatArray4878[14]);
				float f_679_ = (class443_656_.aFloatArray4878[3] * (float) i_669_ + class443_656_.aFloatArray4878[7] * (float) i_670_ + class443_656_.aFloatArray4878[11] * (float) i_671_ + class443_656_.aFloatArray4878[15]);
				if (f_678_ >= -f_679_) {
					class178.anInt1943 = (int) (aClass167_Sub3_9450.aFloat9536 + (aClass167_Sub3_9450.aFloat9588 * f_676_ / f_679_));
					class178.anInt1944 = (int) (aClass167_Sub3_9450.aFloat9589 + (aClass167_Sub3_9450.aFloat9590 * f_677_ / f_679_));
				} else
					bool = true;
				if (bool) {
					if (f_674_ < -f_675_ && f_678_ < -f_679_)
						bool_666_ = false;
					else if (f_674_ < -f_675_) {
						float f_680_ = (f_674_ + f_675_) / (f_678_ + f_679_) - 1.0F;
						float f_681_ = f_672_ + f_680_ * (f_676_ - f_672_);
						float f_682_ = f_673_ + f_680_ * (f_677_ - f_673_);
						float f_683_ = f_675_ + f_680_ * (f_679_ - f_675_);
						class178.anInt1941 = (int) (aClass167_Sub3_9450.aFloat9536 + (aClass167_Sub3_9450.aFloat9588 * f_681_ / f_683_));
						class178.anInt1942 = (int) (aClass167_Sub3_9450.aFloat9589 + (aClass167_Sub3_9450.aFloat9590 * f_682_ / f_683_));
					} else if (f_678_ < -f_679_) {
						float f_684_ = (f_678_ + f_679_) / (f_674_ + f_675_) - 1.0F;
						float f_685_ = f_676_ + f_684_ * (f_672_ - f_676_);
						float f_686_ = f_677_ + f_684_ * (f_673_ - f_677_);
						float f_687_ = f_679_ + f_684_ * (f_675_ - f_679_);
						class178.anInt1943 = (int) (aClass167_Sub3_9450.aFloat9536 + (aClass167_Sub3_9450.aFloat9588 * f_685_ / f_687_));
						class178.anInt1944 = (int) (aClass167_Sub3_9450.aFloat9589 + (aClass167_Sub3_9450.aFloat9590 * f_686_ / f_687_));
					}
				}
				if (bool_666_) {
					if (f_674_ / f_675_ > f_678_ / f_679_) {
						float f_688_ = (f_672_ + (class443.aFloatArray4878[0] * (float) anInt9492) + class443.aFloatArray4878[12]);
						float f_689_ = (f_675_ + (class443.aFloatArray4878[3] * (float) anInt9492) + class443.aFloatArray4878[15]);
						class178.anInt1940 = (int) (aClass167_Sub3_9450.aFloat9536 - (float) class178.anInt1941 + (aClass167_Sub3_9450.aFloat9588 * f_688_ / f_689_));
					} else {
						float f_690_ = (f_676_ + (class443.aFloatArray4878[0] * (float) anInt9492) + class443.aFloatArray4878[12]);
						float f_691_ = (f_679_ + (class443.aFloatArray4878[3] * (float) anInt9492) + class443.aFloatArray4878[15]);
						class178.anInt1940 = (int) (aClass167_Sub3_9450.aFloat9536 - (float) class178.anInt1943 + (aClass167_Sub3_9450.aFloat9588 * f_690_ / f_691_));
					}
					class178.aBool1945 = true;
				}
			}
			aClass167_Sub3_9450.method8711(i);
			method8687(class433);
			aClass167_Sub3_9450.method8711(0);
			class443_655_.method5359(class433);
			class443_655_.method5390(aClass167_Sub3_9450.aClass443_9698);
			method8682(class443_655_);
		}
	}

	void method8687(Class433 class433) {
		if (anInt9457 != 0 && (method8689() && method8688())) {
			if (aClass351_9474 == null) {
				/* empty */
			}
			aClass167_Sub3_9450.method8818();
			aClass167_Sub3_9450.method8767();
			Class327 class327 = aClass167_Sub3_9450.aClass327_9541;
			aClass167_Sub3_9450.method8808(0, aClass375_9483.anInterface38_3908);
			aClass167_Sub3_9450.method8808(1, aClass375_9484.anInterface38_3908);
			aClass167_Sub3_9450.method8808(2, aClass375_9486.anInterface38_3908);
			aClass167_Sub3_9450.method8809(aClass348_9482.anInterface41_3691);
			aClass167_Sub3_9450.aClass443_9570.method5359(class433);
			class327.method4284(aClass167_Sub3_9450.aClass443_9570);
			class327.aClass443_3571.method5338();
			if (aClass167_Sub3_9450.aBool9683) {
				Class175 class175 = aClass167_Sub3_9450.method8795();
				class327.aClass427_3575.method5131(0.0F, 1.0F, 0.0F, (float) -aClass167_Sub3_9450.anInt9696);
				class327.aClass427_3575.method5134(3.0F / (float) ((class175.anInt1934) * 71478565));
				class327.aClass436_3573.method5243(((float) (class175.anInt1932 * 432289019 >> 16 & 0xff) / 255.0F), ((float) (class175.anInt1932 * 432289019 >> 8 & 0xff) / 255.0F), ((float) (class175.anInt1932 * 432289019 >> 0 & 0xff) / 255.0F));
			} else {
				class327.aClass427_3575.method5131(0.0F, 0.0F, 0.0F, 0.0F);
				class327.aClass436_3573.method5243(0.0F, 0.0F, 0.0F);
			}
			if (aClass167_Sub3_9450.anInt9550 > 0) {
				class327.aClass427_3577.method5131(0.0F, 0.0F, 1.0F, -(aClass167_Sub3_9450.aFloat9675));
				class327.aClass436_3585.method5243(((float) (aClass167_Sub3_9450.anInt9672 >> 16 & 0xff) / 255.0F), ((float) (aClass167_Sub3_9450.anInt9672 >> 8 & 0xff) / 255.0F), ((float) (aClass167_Sub3_9450.anInt9672 >> 0 & 0xff) / 255.0F));
				aClass167_Sub3_9450.aClass443_9570.method5359(class433);
				aClass167_Sub3_9450.aClass443_9570.method5362();
				class327.aClass427_3575.method5137(aClass167_Sub3_9450.aClass443_9570);
				aClass167_Sub3_9450.aClass443_9570.method5359(class433);
				aClass167_Sub3_9450.aClass443_9570.method5390(aClass167_Sub3_9450.aClass443_9698);
				aClass167_Sub3_9450.aClass443_9570.method5362();
				class327.aClass427_3577.method5137(aClass167_Sub3_9450.aClass443_9570);
				class327.aClass427_3577.method5134(1.0F / (aClass167_Sub3_9450.aFloat9676 - aClass167_Sub3_9450.aFloat9675));
			} else {
				class327.aClass427_3577.method5131(0.0F, 0.0F, 0.0F, 0.0F);
				class327.aClass436_3585.method5243(0.0F, 0.0F, 0.0F);
			}
			if ((anInt9452 & 0x37) == 0) {
				aClass167_Sub3_9450.method8807(aClass167_Sub3_9450.aClass343_9705);
				if (aClass167_Sub3_9450.aBool9704)
					aClass167_Sub3_9450.method8762(false);
				for (int i = 0; i < anIntArray9503.length; i++) {
					int i_692_ = anIntArray9507[i];
					int i_693_ = anIntArray9507[i + 1];
					int i_694_ = aShortArray9479[i_692_];
					boolean bool = false;
					byte i_695_ = 0;
					if (i_694_ != -1) {
						Class164 class164 = aClass167_Sub3_9450.aClass174_1852.method2446(i_694_ & 0xffff, -421452510);
						class327.anInterface36_3569 = aClass167_Sub3_9450.aClass340_9561.method4456(class164);
						bool = !Class16_Sub1.method10359(class164.aByte1797, 2026365547);
						class327.aClass443_3571.aFloatArray4878[12] = ((float) (aClass167_Sub3_9450.anInt9685 % 128000) / 1000.0F * (float) class164.aByte1802 / 64.0F % 1.0F);
						class327.aClass443_3571.aFloatArray4878[13] = ((float) (aClass167_Sub3_9450.anInt9685 % 128000) / 1000.0F * (float) class164.aByte1803 / 64.0F % 1.0F);
						if (class164.aClass595_1805 == Class595.aClass595_7818)
							i_695_ = class164.aByte1806;
					} else {
						class327.anInterface36_3569 = aClass167_Sub3_9450.anInterface36_9691;
						float[] fs = class327.aClass443_3571.aFloatArray4878;
						class327.aClass443_3571.aFloatArray4878[13] = 0.0F;
						fs[12] = 0.0F;
					}
					aClass167_Sub3_9450.method8796(i_695_);
					class327.anInt3584 = anIntArray9503[i];
					class327.anInt3574 = anIntArray9504[i];
					class327.anInt3586 = i_692_ * 3;
					class327.anInt3587 = i_693_ - i_692_;
					class327.method4285(bool);
				}
			} else {
				aClass167_Sub3_9450.method8808(3, aClass375_9485.anInterface38_3908);
				aClass167_Sub3_9450.method8807(aClass167_Sub3_9450.aClass343_9706);
				Class433 class433_696_ = aClass167_Sub3_9450.aClass433_9543;
				class433_696_.method5190(class433);
				class433_696_.method5209();
				int i = 0;
				if (aClass167_Sub3_9450.aBool9704)
					aClass167_Sub3_9450.method8762(true);
				else {
					class327.aClass436_3583.method5243(aClass167_Sub3_9450.aFloatArray9542[0], aClass167_Sub3_9450.aFloatArray9542[1], aClass167_Sub3_9450.aFloatArray9542[2]);
					class327.aClass436_3583.method5282(class433_696_);
					class327.aClass436_3580.method5243((aClass167_Sub3_9450.aFloat9573 * aClass167_Sub3_9450.aFloat9678), (aClass167_Sub3_9450.aFloat9573 * aClass167_Sub3_9450.aFloat9649), (aClass167_Sub3_9450.aFloat9573 * aClass167_Sub3_9450.aFloat9701));
					class327.aClass436_3581.method5243((-aClass167_Sub3_9450.aFloat9579 * aClass167_Sub3_9450.aFloat9678), (-aClass167_Sub3_9450.aFloat9579 * aClass167_Sub3_9450.aFloat9649), (-aClass167_Sub3_9450.aFloat9579 * aClass167_Sub3_9450.aFloat9701));
					class327.aClass436_3566.method5243((aClass167_Sub3_9450.aFloat9626 * aClass167_Sub3_9450.aFloat9678), (aClass167_Sub3_9450.aFloat9626 * aClass167_Sub3_9450.aFloat9649), (aClass167_Sub3_9450.aFloat9626 * aClass167_Sub3_9450.aFloat9701));
					if (aClass167_Sub3_9450.anInt9630 > 0) {
						i = aClass167_Sub3_9450.anInt9630;
						Class436 class436 = aClass167_Sub3_9450.aClass436_9572;
						for (int i_697_ = 0; i_697_ < i; i_697_++) {
							Class536_Sub19 class536_sub19 = (aClass167_Sub3_9450.aClass536_Sub19Array9534[i_697_]);
							int i_698_ = class536_sub19.method9528(-844684610);
							class436.method5272(class536_sub19.aClass436_10513);
							class436.method5264(class433_696_);
							class327.aFloatArray3568[i_697_ * 4 + 0] = class436.aFloat4850;
							class327.aFloatArray3568[i_697_ * 4 + 1] = class436.aFloat4852;
							class327.aFloatArray3568[i_697_ * 4 + 2] = class436.aFloat4853;
							class327.aFloatArray3568[i_697_ * 4 + 3] = (1.0F / (float) (class536_sub19.method9530(217182700) * class536_sub19.method9530(-1214708488)));
							float f = (class536_sub19.method9531(-1666425106) / 255.0F);
							class327.aFloatArray3567[i_697_ * 4 + 0] = (float) (i_698_ >> 16 & 0xff) * f;
							class327.aFloatArray3567[i_697_ * 4 + 1] = (float) (i_698_ >> 8 & 0xff) * f;
							class327.aFloatArray3567[i_697_ * 4 + 2] = (float) (i_698_ & 0xff) * f;
							class327.aFloatArray3567[i_697_ * 4 + 3] = 1.0F;
						}
					}
				}
				for (int i_699_ = 0; i_699_ < anIntArray9503.length; i_699_++) {
					int i_700_ = anIntArray9507[i_699_];
					int i_701_ = anIntArray9507[i_699_ + 1];
					int i_702_ = aShortArray9479[i_700_];
					byte i_703_ = 11;
					Class164 class164 = null;
					byte i_704_ = 0;
					if (i_702_ != -1) {
						class164 = aClass167_Sub3_9450.aClass174_1852.method2446(i_702_ & 0xffff, -1369803660);
						class327.anInterface36_3569 = aClass167_Sub3_9450.aClass340_9561.method4456(class164);
						i_703_ = class164.aByte1797;
						class327.method4303(class164.aByte1823);
						class327.aClass443_3571.aFloatArray4878[12] = ((float) (aClass167_Sub3_9450.anInt9685 % 128000) / 1000.0F * (float) class164.aByte1802 / 64.0F % 1.0F);
						class327.aClass443_3571.aFloatArray4878[13] = ((float) (aClass167_Sub3_9450.anInt9685 % 128000) / 1000.0F * (float) class164.aByte1803 / 64.0F % 1.0F);
						if (class164.aClass595_1805 == Class595.aClass595_7818)
							i_704_ = class164.aByte1806;
					} else {
						class327.anInterface36_3569 = aClass167_Sub3_9450.anInterface36_9691;
						float[] fs = class327.aClass443_3571.aFloatArray4878;
						class327.aClass443_3571.aFloatArray4878[13] = 0.0F;
						fs[12] = 0.0F;
					}
					aClass167_Sub3_9450.method8796(i_704_);
					class327.anInt3584 = anIntArray9503[i_699_];
					class327.anInt3574 = anIntArray9504[i_699_];
					class327.anInt3586 = i_700_ * 3;
					class327.anInt3587 = i_701_ - i_700_;
					switch (i_703_) {
					case 5:
						if (!aClass167_Sub3_9450.aBool9704) {
							Class341_Sub1_Sub1 class341_sub1_sub1 = aClass167_Sub3_9450.aClass341_Sub1_Sub1_9535;
							class341_sub1_sub1.method10556(class164.aByte1823, (class164.anInt1824 * 1131739551), -1262601795);
							class341_sub1_sub1.aClass443_11415.method5359(class433);
							class341_sub1_sub1.aClass443_11412.method5359(class433);
							class341_sub1_sub1.aClass443_11412.method5390(aClass167_Sub3_9450.aClass443_9585);
							class341_sub1_sub1.anInt11421 = anIntArray9503[i_699_] * 1594493119;
							class341_sub1_sub1.anInt11422 = anIntArray9504[i_699_] * -1929777471;
							class341_sub1_sub1.anInt11423 = i_700_ * -1060410555;
							class341_sub1_sub1.anInt11424 = (i_701_ - i_700_) * 67373911;
							class341_sub1_sub1.method10555((byte) -46);
						} else
							class327.method4293(i);
						break;
					case 7:
						class327.aClass436_3572.method5243((aClass167_Sub3_9450.aClass443_9564.aFloatArray4878[12]), (aClass167_Sub3_9450.aClass443_9564.aFloatArray4878[13]), (aClass167_Sub3_9450.aClass443_9564.aFloatArray4878[14]));
						class327.aClass436_3572.method5264(class433_696_);
						class327.aClass443_3582.method5359(class433);
						class327.anInterface39_3570 = aClass167_Sub3_9450.method8739();
						class327.method4288(i);
						break;
					default:
						class327.method4293(i);
						break;
					case 1:
						class327.aClass436_3572.method5243((aClass167_Sub3_9450.aClass443_9564.aFloatArray4878[12]), (aClass167_Sub3_9450.aClass443_9564.aFloatArray4878[13]), (aClass167_Sub3_9450.aClass443_9564.aFloatArray4878[14]));
						class327.aClass436_3572.method5264(class433_696_);
						class327.method4286(i);
						break;
					case 6:
						class327.method4285(!Class16_Sub1.method10359(i_703_, 1980165393));
					}
				}
			}
			method8694();
		}
	}

	public int method2577() {
		if (!aBool9471)
			method8681();
		return anInt9478;
	}

	boolean method8688() {
		if (aClass348_9482.aBool3693)
			return true;
		if (aClass348_9482.anInterface41_3694 == null)
			aClass348_9482.anInterface41_3694 = aClass167_Sub3_9450.method8804(false);
		Interface41 interface41 = aClass348_9482.anInterface41_3694;
		interface41.method283(anInt9457 * 6);
		Unsafe unsafe = aClass167_Sub3_9450.anUnsafe9548;
		if (unsafe != null) {
			int i = anInt9457 * 6;
			long l = interface41.method263(0, i);
			if (l == 0L)
				return false;
			for (int i_705_ = 0; i_705_ < anInt9457; i_705_++) {
				unsafe.putShort(l, aShortArray9463[i_705_]);
				l += 2L;
				unsafe.putShort(l, aShortArray9477[i_705_]);
				l += 2L;
				unsafe.putShort(l, aShortArray9488[i_705_]);
				l += 2L;
			}
			interface41.method265();
			aClass348_9482.anInterface41_3691 = interface41;
			aClass348_9482.aBool3693 = true;
			aBool9465 = true;
			return true;
		}
		ByteBuffer bytebuffer = aClass167_Sub3_9450.aByteBuffer9549;
		bytebuffer.clear();
		for (int i = 0; i < anInt9457; i++) {
			bytebuffer.putShort(aShortArray9463[i]);
			bytebuffer.putShort(aShortArray9477[i]);
			bytebuffer.putShort(aShortArray9488[i]);
		}
		if (interface41.method264(0, bytebuffer.position(), aClass167_Sub3_9450.aLong9586)) {
			aClass348_9482.anInterface41_3691 = interface41;
			aClass348_9482.aBool3693 = true;
			aBool9465 = true;
			return true;
		}
		return false;
	}

	boolean method8689() {
		boolean bool = !aClass375_9484.aBool3911;
		boolean bool_706_ = (anInt9452 & 0x37) != 0 && !aClass375_9485.aBool3911;
		boolean bool_707_ = !aClass375_9483.aBool3911;
		boolean bool_708_ = !aClass375_9486.aBool3911;
		if (!bool_707_ && !bool && !bool_706_ && !bool_708_)
			return true;
		boolean bool_709_ = true;
		if (bool_707_ && aShortArray9515 != null) {
			if (aClass375_9483.anInterface38_3910 == null)
				aClass375_9483.anInterface38_3910 = aClass167_Sub3_9450.method8805(aBool9487);
			Interface38 interface38 = aClass375_9483.anInterface38_3910;
			interface38.method271(anInt9462 * 12, 12);
			Unsafe unsafe = aClass167_Sub3_9450.anUnsafe9548;
			if (unsafe != null) {
				int i = anInt9462 * 12;
				long l = interface38.method263(0, i);
				for (int i_710_ = 0; i_710_ < anInt9462; i_710_++) {
					short i_711_ = aShortArray9515[i_710_];
					unsafe.putFloat(l, (float) anIntArray9524[i_711_]);
					l += 4L;
					unsafe.putFloat(l, (float) anIntArray9458[i_711_]);
					l += 4L;
					unsafe.putFloat(l, (float) anIntArray9493[i_711_]);
					l += 4L;
				}
				interface38.method265();
			} else {
				ByteBuffer bytebuffer = aClass167_Sub3_9450.aByteBuffer9549;
				bytebuffer.clear();
				for (int i = 0; i < anInt9462; i++) {
					bytebuffer.putFloat((float) anIntArray9524[aShortArray9515[i]]);
					bytebuffer.putFloat((float) anIntArray9458[aShortArray9515[i]]);
					bytebuffer.putFloat((float) anIntArray9493[aShortArray9515[i]]);
				}
				interface38.method264(0, bytebuffer.position(), aClass167_Sub3_9450.aLong9586);
			}
			aClass375_9483.anInterface38_3908 = interface38;
			aClass375_9483.aBool3911 = true;
		}
		if (bool) {
			if (aClass375_9484.anInterface38_3910 == null)
				aClass375_9484.anInterface38_3910 = aClass167_Sub3_9450.method8805(aBool9487);
			Interface38 interface38 = aClass375_9484.anInterface38_3910;
			interface38.method271(anInt9462 * 4, 4);
			Unsafe unsafe = aClass167_Sub3_9450.anUnsafe9548;
			if (unsafe != null) {
				int i = anInt9462 * 4;
				long l = interface38.method263(0, i);
				if ((anInt9452 & 0x37) == 0) {
					short[] is;
					short[] is_712_;
					short[] is_713_;
					byte[] is_714_;
					if (aClass373_9505 != null) {
						is = aClass373_9505.aShortArray3896;
						is_712_ = aClass373_9505.aShortArray3895;
						is_713_ = aClass373_9505.aShortArray3897;
						is_714_ = aClass373_9505.aByteArray3898;
					} else {
						is = aShortArray9500;
						is_712_ = aShortArray9466;
						is_713_ = aShortArray9467;
						is_714_ = aByteArray9512;
					}
					float f = (aClass167_Sub3_9450.aFloat9573 * 768.0F / (float) aShort9454);
					float f_715_ = (aClass167_Sub3_9450.aFloat9579 * 768.0F / (float) aShort9454);
					for (int i_716_ = 0; i_716_ < anInt9462; i_716_++) {
						short i_717_ = aShortArray9518[i_716_];
						int i_718_ = method8691(aShortArray9490[i_717_] & 0xffff, aShortArray9479[i_717_], aShort9494);
						float f_719_ = ((float) (i_718_ >> 16 & 0xff) * aClass167_Sub3_9450.aFloat9678);
						float f_720_ = ((float) (i_718_ >> 8 & 0xff) * aClass167_Sub3_9450.aFloat9649);
						float f_721_ = ((float) (i_718_ & 0xff) * aClass167_Sub3_9450.aFloat9701);
						byte i_722_ = is_714_[i_716_];
						float f_723_;
						if (i_722_ == 0)
							f_723_ = (((aClass167_Sub3_9450.aFloatArray9542[0] * (float) is[i_716_]) + (aClass167_Sub3_9450.aFloatArray9542[1] * (float) is_712_[i_716_]) + (aClass167_Sub3_9450.aFloatArray9542[2] * (float) is_713_[i_716_])) * 0.0026041667F);
						else
							f_723_ = (((aClass167_Sub3_9450.aFloatArray9542[0] * (float) is[i_716_]) + (aClass167_Sub3_9450.aFloatArray9542[1] * (float) is_712_[i_716_]) + (aClass167_Sub3_9450.aFloatArray9542[2] * (float) is_713_[i_716_])) / ((float) i_722_ * 256.0F));
						float f_724_ = (aClass167_Sub3_9450.aFloat9626 + f_723_ * (f_723_ < 0.0F ? f_715_ : f));
						int i_725_ = (int) (f_719_ * f_724_);
						if (i_725_ < 0)
							i_725_ = 0;
						else if (i_725_ > 255)
							i_725_ = 255;
						int i_726_ = (int) (f_720_ * f_724_);
						if (i_726_ < 0)
							i_726_ = 0;
						else if (i_726_ > 255)
							i_726_ = 255;
						int i_727_ = (int) (f_721_ * f_724_);
						if (i_727_ < 0)
							i_727_ = 0;
						else if (i_727_ > 255)
							i_727_ = 255;
						unsafe.putInt(l, (255 - aByteArray9448[i_717_] << 24 | i_725_ << 16 | i_726_ << 8 | i_727_));
						l += 4L;
					}
				} else {
					for (int i_728_ = 0; i_728_ < anInt9462; i_728_++) {
						short i_729_ = aShortArray9518[i_728_];
						int i_730_ = (255 - aByteArray9448[i_729_] << 24 | method8691(aShortArray9490[i_729_] & 0xffff, aShortArray9479[i_729_], aShort9494));
						unsafe.putInt(l, i_730_);
						l += 4L;
					}
				}
				interface38.method265();
			} else {
				ByteBuffer bytebuffer = aClass167_Sub3_9450.aByteBuffer9549;
				bytebuffer.clear();
				if ((anInt9452 & 0x37) == 0) {
					short[] is;
					short[] is_731_;
					short[] is_732_;
					byte[] is_733_;
					if (aClass373_9505 != null) {
						is = aClass373_9505.aShortArray3896;
						is_731_ = aClass373_9505.aShortArray3895;
						is_732_ = aClass373_9505.aShortArray3897;
						is_733_ = aClass373_9505.aByteArray3898;
					} else {
						is = aShortArray9500;
						is_731_ = aShortArray9466;
						is_732_ = aShortArray9467;
						is_733_ = aByteArray9512;
					}
					float f = (aClass167_Sub3_9450.aFloat9573 * 768.0F / (float) aShort9454);
					float f_734_ = (aClass167_Sub3_9450.aFloat9579 * 768.0F / (float) aShort9454);
					for (int i = 0; i < anInt9462; i++) {
						short i_735_ = aShortArray9518[i];
						int i_736_ = method8691(aShortArray9490[i_735_] & 0xffff, aShortArray9479[i_735_], aShort9494);
						float f_737_ = ((float) (i_736_ >> 16 & 0xff) * aClass167_Sub3_9450.aFloat9678);
						float f_738_ = ((float) (i_736_ >> 8 & 0xff) * aClass167_Sub3_9450.aFloat9649);
						float f_739_ = ((float) (i_736_ & 0xff) * aClass167_Sub3_9450.aFloat9701);
						byte i_740_ = is_733_[i];
						float f_741_;
						if (i_740_ == 0)
							f_741_ = ((aClass167_Sub3_9450.aFloatArray9542[0] * (float) is[i]) + (aClass167_Sub3_9450.aFloatArray9542[1] * (float) is_731_[i]) + (aClass167_Sub3_9450.aFloatArray9542[2] * (float) is_732_[i])) * 0.0026041667F;
						else
							f_741_ = (((aClass167_Sub3_9450.aFloatArray9542[0] * (float) is[i]) + (aClass167_Sub3_9450.aFloatArray9542[1] * (float) is_731_[i]) + (aClass167_Sub3_9450.aFloatArray9542[2] * (float) is_732_[i])) / ((float) i_740_ * 256.0F));
						float f_742_ = (aClass167_Sub3_9450.aFloat9626 + f_741_ * (f_741_ < 0.0F ? f_734_ : f));
						int i_743_ = (int) (f_737_ * f_742_);
						if (i_743_ < 0)
							i_743_ = 0;
						else if (i_743_ > 255)
							i_743_ = 255;
						int i_744_ = (int) (f_738_ * f_742_);
						if (i_744_ < 0)
							i_744_ = 0;
						else if (i_744_ > 255)
							i_744_ = 255;
						int i_745_ = (int) (f_739_ * f_742_);
						if (i_745_ < 0)
							i_745_ = 0;
						else if (i_745_ > 255)
							i_745_ = 255;
						bytebuffer.putInt(255 - aByteArray9448[i_735_] << 24 | i_743_ << 16 | i_744_ << 8 | i_745_);
					}
				} else {
					for (int i = 0; i < anInt9462; i++) {
						short i_746_ = aShortArray9518[i];
						int i_747_ = (255 - aByteArray9448[i_746_] << 24 | method8691(aShortArray9490[i_746_] & 0xffff, aShortArray9479[i_746_], aShort9494));
						bytebuffer.putInt(i_747_);
					}
				}
				interface38.method264(0, bytebuffer.position(), aClass167_Sub3_9450.aLong9586);
			}
			aClass375_9484.anInterface38_3908 = interface38;
			aClass375_9484.aBool3911 = true;
		}
		if (bool_706_) {
			if (aClass375_9485.anInterface38_3910 == null)
				aClass375_9485.anInterface38_3910 = aClass167_Sub3_9450.method8805(aBool9487);
			Interface38 interface38 = aClass375_9485.anInterface38_3910;
			interface38.method271(anInt9462 * 12, 12);
			short[] is;
			short[] is_748_;
			short[] is_749_;
			byte[] is_750_;
			if (aClass373_9505 != null) {
				is = aClass373_9505.aShortArray3896;
				is_748_ = aClass373_9505.aShortArray3895;
				is_749_ = aClass373_9505.aShortArray3897;
				is_750_ = aClass373_9505.aByteArray3898;
			} else {
				is = aShortArray9500;
				is_748_ = aShortArray9466;
				is_749_ = aShortArray9467;
				is_750_ = aByteArray9512;
			}
			Unsafe unsafe = aClass167_Sub3_9450.anUnsafe9548;
			if (unsafe != null) {
				int i = anInt9462 * 12;
				long l = interface38.method263(0, i);
				for (int i_751_ = 0; i_751_ < anInt9462; i_751_++) {
					Class436 class436 = new Class436((float) is[i_751_], (float) is_748_[i_751_], (float) is_749_[i_751_]);
					if (class436.method5291() != 0.0F) {
						if (is_750_[i_751_] > 1)
							class436.method5262((float) is_750_[i_751_]);
						class436.method5247();
					}
					unsafe.putFloat(l, class436.aFloat4850);
					l += 4L;
					unsafe.putFloat(l, class436.aFloat4852);
					l += 4L;
					unsafe.putFloat(l, class436.aFloat4853);
					l += 4L;
				}
				interface38.method265();
			} else {
				ByteBuffer bytebuffer = aClass167_Sub3_9450.aByteBuffer9549;
				bytebuffer.clear();
				for (int i = 0; i < anInt9462; i++) {
					Class436 class436 = new Class436((float) is[i], (float) is_748_[i], (float) is_749_[i]);
					if (class436.method5291() != 0.0F) {
						if (is_750_[i] > 1)
							class436.method5262((float) is_750_[i]);
						class436.method5247();
					}
					bytebuffer.putFloat(class436.aFloat4850);
					bytebuffer.putFloat(class436.aFloat4852);
					bytebuffer.putFloat(class436.aFloat4853);
				}
				interface38.method264(0, bytebuffer.position(), aClass167_Sub3_9450.aLong9586);
			}
			aClass375_9485.anInterface38_3908 = interface38;
			aClass375_9485.aBool3911 = true;
		}
		if (bool_708_) {
			if (aClass375_9486.anInterface38_3910 == null)
				aClass375_9486.anInterface38_3910 = aClass167_Sub3_9450.method8805(aBool9487);
			Interface38 interface38 = aClass375_9486.anInterface38_3910;
			interface38.method271(anInt9462 * 8, 8);
			Unsafe unsafe = aClass167_Sub3_9450.anUnsafe9548;
			if (unsafe != null) {
				int i = anInt9462 * 8;
				long l = interface38.method263(0, i);
				for (int i_752_ = 0; i_752_ < anInt9462; i_752_++) {
					unsafe.putFloat(l, aFloatArray9469[i_752_]);
					l += 4L;
					unsafe.putFloat(l, aFloatArray9470[i_752_]);
					l += 4L;
				}
				interface38.method265();
			} else {
				ByteBuffer bytebuffer = aClass167_Sub3_9450.aByteBuffer9549;
				bytebuffer.clear();
				for (int i = 0; i < anInt9462; i++) {
					bytebuffer.putFloat(aFloatArray9469[i]);
					bytebuffer.putFloat(aFloatArray9470[i]);
				}
				interface38.method264(0, bytebuffer.position(), aClass167_Sub3_9450.aLong9586);
			}
			aClass375_9486.anInterface38_3908 = interface38;
			aClass375_9486.aBool3911 = true;
		}
		return bool_709_;
	}

	void method8690() {
		if (aClass375_9483 != null)
			aClass375_9483.method4788();
		if (aClass375_9486 != null)
			aClass375_9486.method4788();
		if (aClass375_9484 != null)
			aClass375_9484.method4788();
		if (aClass375_9485 != null)
			aClass375_9485.method4788();
		if (aClass348_9482 != null)
			aClass348_9482.method4590();
	}

	public void method2517(Class177 class177, int i, int i_753_, int i_754_, boolean bool) {
		Class177_Sub2 class177_sub2_755_ = (Class177_Sub2) class177;
		if (anInt9472 != 0 && class177_sub2_755_.anInt9472 != 0) {
			int i_756_ = class177_sub2_755_.anInt9456;
			int[] is = class177_sub2_755_.anIntArray9524;
			int[] is_757_ = class177_sub2_755_.anIntArray9458;
			int[] is_758_ = class177_sub2_755_.anIntArray9493;
			short[] is_759_ = class177_sub2_755_.aShortArray9500;
			short[] is_760_ = class177_sub2_755_.aShortArray9466;
			short[] is_761_ = class177_sub2_755_.aShortArray9467;
			byte[] is_762_ = class177_sub2_755_.aByteArray9512;
			short[] is_763_;
			short[] is_764_;
			short[] is_765_;
			byte[] is_766_;
			if (aClass373_9505 != null) {
				is_763_ = aClass373_9505.aShortArray3896;
				is_764_ = aClass373_9505.aShortArray3895;
				is_765_ = aClass373_9505.aShortArray3897;
				is_766_ = aClass373_9505.aByteArray3898;
			} else {
				is_763_ = null;
				is_764_ = null;
				is_765_ = null;
				is_766_ = null;
			}
			short[] is_767_;
			short[] is_768_;
			short[] is_769_;
			byte[] is_770_;
			if (class177_sub2_755_.aClass373_9505 != null) {
				is_767_ = class177_sub2_755_.aClass373_9505.aShortArray3896;
				is_768_ = class177_sub2_755_.aClass373_9505.aShortArray3895;
				is_769_ = class177_sub2_755_.aClass373_9505.aShortArray3897;
				is_770_ = class177_sub2_755_.aClass373_9505.aByteArray3898;
			} else {
				is_767_ = null;
				is_768_ = null;
				is_769_ = null;
				is_770_ = null;
			}
			int[] is_771_ = class177_sub2_755_.anIntArray9468;
			short[] is_772_ = class177_sub2_755_.aShortArray9506;
			if (!class177_sub2_755_.aBool9471)
				class177_sub2_755_.method8681();
			int i_773_ = class177_sub2_755_.anInt9478;
			int i_774_ = class177_sub2_755_.anInt9495;
			int i_775_ = class177_sub2_755_.anInt9496;
			int i_776_ = class177_sub2_755_.anInt9497;
			int i_777_ = class177_sub2_755_.anInt9498;
			int i_778_ = class177_sub2_755_.anInt9499;
			for (int i_779_ = 0; i_779_ < anInt9456; i_779_++) {
				int i_780_ = anIntArray9458[i_779_] - i_753_;
				if (i_780_ >= i_773_ && i_780_ <= i_774_) {
					int i_781_ = anIntArray9524[i_779_] - i;
					if (i_781_ >= i_775_ && i_781_ <= i_776_) {
						int i_782_ = anIntArray9493[i_779_] - i_754_;
						if (i_782_ >= i_777_ && i_782_ <= i_778_) {
							int i_783_ = -1;
							int i_784_ = anIntArray9468[i_779_];
							int i_785_ = anIntArray9468[i_779_ + 1];
							for (int i_786_ = i_784_; (i_786_ < i_785_ && aShortArray9506[i_786_] != 0); i_786_++) {
								i_783_ = (aShortArray9506[i_786_] & 0xffff) - 1;
								if (aByteArray9512[i_783_] != 0)
									break;
							}
							if (i_783_ != -1) {
								for (int i_787_ = 0; i_787_ < i_756_; i_787_++) {
									if (i_781_ == is[i_787_] && i_782_ == is_758_[i_787_] && i_780_ == is_757_[i_787_]) {
										int i_788_ = -1;
										i_784_ = is_771_[i_787_];
										i_785_ = is_771_[i_787_ + 1];
										for (int i_789_ = i_784_; (i_789_ < i_785_ && is_772_[i_789_] != 0); i_789_++) {
											i_788_ = is_772_[i_789_] - 1 & 0xffff;
											if (is_762_[i_788_] != 0)
												break;
										}
										if (i_788_ != -1) {
											if (is_763_ == null) {
												aClass373_9505 = new Class373();
												is_763_ = aClass373_9505.aShortArray3896 = (Class483.method5839(aShortArray9500, -1606479016));
												is_764_ = aClass373_9505.aShortArray3895 = (Class483.method5839(aShortArray9466, -1851797717));
												is_765_ = aClass373_9505.aShortArray3897 = (Class483.method5839(aShortArray9467, -1837311314));
												is_766_ = aClass373_9505.aByteArray3898 = (Class536_Sub2.method9364(aByteArray9512, (byte) 22));
											}
											if (is_767_ == null) {
												Class373 class373 = (class177_sub2_755_.aClass373_9505 = new Class373());
												is_767_ = class373.aShortArray3896 = (Class483.method5839(is_759_, -1803038719));
												is_768_ = class373.aShortArray3895 = (Class483.method5839(is_760_, -1205593054));
												is_769_ = class373.aShortArray3897 = (Class483.method5839(is_761_, -1043462565));
												is_770_ = class373.aByteArray3898 = (Class536_Sub2.method9364(is_762_, (byte) 22));
											}
											short i_790_ = aShortArray9500[i_783_];
											short i_791_ = aShortArray9466[i_783_];
											short i_792_ = aShortArray9467[i_783_];
											byte i_793_ = aByteArray9512[i_783_];
											i_784_ = is_771_[i_787_];
											i_785_ = is_771_[i_787_ + 1];
											for (int i_794_ = i_784_; i_794_ < i_785_; i_794_++) {
												int i_795_ = is_772_[i_794_] - 1;
												if (i_795_ == -1)
													break;
												if (is_770_[i_795_] != 0) {
													is_767_[i_795_] += i_790_;
													is_768_[i_795_] += i_791_;
													is_769_[i_795_] += i_792_;
													is_770_[i_795_] += i_793_;
												}
											}
											i_790_ = is_759_[i_788_];
											i_791_ = is_760_[i_788_];
											i_792_ = is_761_[i_788_];
											i_793_ = is_762_[i_788_];
											i_784_ = anIntArray9468[i_779_];
											i_785_ = anIntArray9468[i_779_ + 1];
											for (int i_796_ = i_784_; (i_796_ < i_785_ && (aShortArray9506[i_796_] != 0)); i_796_++) {
												int i_797_ = ((aShortArray9506[i_796_] & 0xffff) - 1);
												if (is_766_[i_797_] != 0) {
													is_763_[i_797_] += i_790_;
													is_764_[i_797_] += i_791_;
													is_765_[i_797_] += i_792_;
													is_766_[i_797_] += i_793_;
												}
											}
											class177_sub2_755_.method8679();
											method8679();
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	int method8691(int i, short i_798_, int i_799_) {
		int i_800_ = aClass167_Sub3_9450.anIntArray9708[method8696(i, i_799_)];
		if (i_798_ != -1) {
			Class164 class164 = aClass167_Sub3_9450.aClass174_1852.method2446(i_798_ & 0xffff, -179480055);
			int i_801_ = class164.aByte1829 & 0xff;
			if (i_801_ != 0) {
				int i_802_ = 131586 * i_799_;
				if (i_799_ < 0)
					i_802_ = 0;
				else if (i_799_ > 127)
					i_802_ = 16777215;
				else
					i_802_ = 131586 * i_799_;
				if (i_801_ == 256)
					i_800_ = i_802_;
				else {
					int i_803_ = i_801_;
					int i_804_ = 256 - i_801_;
					i_800_ = ((((i_802_ & 0xff00ff) * i_803_ + (i_800_ & 0xff00ff) * i_804_) & ~0xff00ff) + (((i_802_ & 0xff00) * i_803_ + (i_800_ & 0xff00) * i_804_) & 0xff0000)) >> 8;
				}
			}
			int i_805_ = class164.aByte1828 & 0xff;
			if (i_805_ != 0) {
				i_805_ += 256;
				int i_806_ = ((i_800_ & 0xff0000) >> 16) * i_805_;
				if (i_806_ > 65535)
					i_806_ = 65535;
				int i_807_ = ((i_800_ & 0xff00) >> 8) * i_805_;
				if (i_807_ > 65535)
					i_807_ = 65535;
				int i_808_ = (i_800_ & 0xff) * i_805_;
				if (i_808_ > 65535)
					i_808_ = 65535;
				i_800_ = (i_806_ << 8 & 0xff0000) + (i_807_ & 0xff00) + (i_808_ >> 8);
			}
		}
		return i_800_ & 0xffffff;
	}

	public int method2562() {
		if (!aBool9471)
			method8681();
		return anInt9478;
	}

	public void method2507(short i, short i_809_) {
		for (int i_810_ = 0; i_810_ < anInt9472; i_810_++) {
			if (aShortArray9490[i_810_] == i)
				aShortArray9490[i_810_] = i_809_;
		}
		if (aClass372Array9510 != null) {
			for (int i_811_ = 0; i_811_ < anInt9509; i_811_++) {
				Class372 class372 = aClass372Array9510[i_811_];
				Class346 class346 = aClass346Array9511[i_811_];
				class346.anInt3686 = (class346.anInt3686 & ~0xffffff | ((ColourUtils.anIntArray8309[aShortArray9490[class372.anInt3889] & 0xffff]) & 0xffffff));
			}
		}
		method8678();
	}

	void method8692() {
		if ((anInt9452 & 0x37) != 0) {
			if (aClass375_9485 != null)
				aClass375_9485.aBool3911 = false;
		} else if (aClass375_9484 != null)
			aClass375_9484.aBool3911 = false;
	}

	public void method2519() {
		if (anInt9462 > 0 && anInt9457 > 0) {
			method8689();
			method8688();
			method8694();
		}
	}

	public void method2568() {
		if (anInt9462 > 0 && anInt9457 > 0) {
			method8689();
			method8688();
			method8694();
		}
	}

	public void method2521(int i) {
		int i_812_ = Class447.anIntArray4906[i];
		int i_813_ = Class447.anIntArray4921[i];
		for (int i_814_ = 0; i_814_ < anInt9456; i_814_++) {
			int i_815_ = ((anIntArray9493[i_814_] * i_812_ + anIntArray9524[i_814_] * i_813_) >> 14);
			anIntArray9493[i_814_] = (anIntArray9493[i_814_] * i_813_ - anIntArray9524[i_814_] * i_812_) >> 14;
			anIntArray9524[i_814_] = i_815_;
		}
		method8677();
		aBool9471 = false;
	}

	public void method2614(int i) {
		int i_816_ = Class447.anIntArray4906[i];
		int i_817_ = Class447.anIntArray4921[i];
		for (int i_818_ = 0; i_818_ < anInt9456; i_818_++) {
			int i_819_ = ((anIntArray9493[i_818_] * i_816_ + anIntArray9524[i_818_] * i_817_) >> 14);
			anIntArray9493[i_818_] = (anIntArray9493[i_818_] * i_817_ - anIntArray9524[i_818_] * i_816_) >> 14;
			anIntArray9524[i_818_] = i_819_;
		}
		method8677();
		aBool9471 = false;
	}

	public void method2523(int i) {
		int i_820_ = Class447.anIntArray4906[i];
		int i_821_ = Class447.anIntArray4921[i];
		for (int i_822_ = 0; i_822_ < anInt9456; i_822_++) {
			int i_823_ = ((anIntArray9493[i_822_] * i_820_ + anIntArray9524[i_822_] * i_821_) >> 14);
			anIntArray9493[i_822_] = (anIntArray9493[i_822_] * i_821_ - anIntArray9524[i_822_] * i_820_) >> 14;
			anIntArray9524[i_822_] = i_823_;
		}
		for (int i_824_ = 0; i_824_ < anInt9462; i_824_++) {
			int i_825_ = ((aShortArray9467[i_824_] * i_820_ + aShortArray9500[i_824_] * i_821_) >> 14);
			aShortArray9467[i_824_] = (short) ((aShortArray9467[i_824_] * i_821_ - aShortArray9500[i_824_] * i_820_) >> 14);
			aShortArray9500[i_824_] = (short) i_825_;
		}
		method8677();
		method8679();
		aBool9471 = false;
	}

	public void method2524(int i) {
		int i_826_ = Class447.anIntArray4906[i];
		int i_827_ = Class447.anIntArray4921[i];
		for (int i_828_ = 0; i_828_ < anInt9456; i_828_++) {
			int i_829_ = ((anIntArray9493[i_828_] * i_826_ + anIntArray9524[i_828_] * i_827_) >> 14);
			anIntArray9493[i_828_] = (anIntArray9493[i_828_] * i_827_ - anIntArray9524[i_828_] * i_826_) >> 14;
			anIntArray9524[i_828_] = i_829_;
		}
		for (int i_830_ = 0; i_830_ < anInt9462; i_830_++) {
			int i_831_ = ((aShortArray9467[i_830_] * i_826_ + aShortArray9500[i_830_] * i_827_) >> 14);
			aShortArray9467[i_830_] = (short) ((aShortArray9467[i_830_] * i_827_ - aShortArray9500[i_830_] * i_826_) >> 14);
			aShortArray9500[i_830_] = (short) i_831_;
		}
		method8677();
		method8679();
		aBool9471 = false;
	}

	public int method2580() {
		if (!aBool9471)
			method8681();
		return anInt9498;
	}

	public int method2571() {
		if (!aBool9453)
			method2501();
		return anInt9501;
	}

	public void method2491(int i) {
		int i_832_ = Class447.anIntArray4906[i];
		int i_833_ = Class447.anIntArray4921[i];
		for (int i_834_ = 0; i_834_ < anInt9456; i_834_++) {
			int i_835_ = ((anIntArray9458[i_834_] * i_832_ + anIntArray9524[i_834_] * i_833_) >> 14);
			anIntArray9458[i_834_] = (anIntArray9458[i_834_] * i_833_ - anIntArray9524[i_834_] * i_832_) >> 14;
			anIntArray9524[i_834_] = i_835_;
		}
		method8677();
		aBool9471 = false;
	}

	public int method2579() {
		if (!aBool9471)
			method8681();
		return anInt9491;
	}

	public void method2530(int i, int i_836_, int i_837_) {
		for (int i_838_ = 0; i_838_ < anInt9456; i_838_++) {
			if (i != 0)
				anIntArray9524[i_838_] += i;
			if (i_836_ != 0)
				anIntArray9458[i_838_] += i_836_;
			if (i_837_ != 0)
				anIntArray9493[i_838_] += i_837_;
		}
		method8677();
		aBool9471 = false;
	}

	public void method2531() {
		for (int i = 0; i < anInt9456; i++)
			anIntArray9493[i] = -anIntArray9493[i];
		for (int i = 0; i < anInt9462; i++)
			aShortArray9467[i] = (short) -aShortArray9467[i];
		for (int i = 0; i < anInt9472; i++) {
			short i_839_ = aShortArray9463[i];
			aShortArray9463[i] = aShortArray9488[i];
			aShortArray9488[i] = i_839_;
		}
		method8677();
		method8679();
		method8680();
		aBool9471 = false;
	}

	public Class536_Sub18_Sub7 method2574(Class536_Sub18_Sub7 class536_sub18_sub7) {
		if (anInt9462 == 0)
			return null;
		if (!aBool9471)
			method8681();
		int i;
		int i_840_;
		if (aClass167_Sub3_9450.anInt9634 > 0) {
			i = (anInt9496 - (anInt9495 * aClass167_Sub3_9450.anInt9634 >> 8) >> aClass167_Sub3_9450.anInt9633);
			i_840_ = anInt9497 - (anInt9478 * aClass167_Sub3_9450.anInt9634 >> 8) >> aClass167_Sub3_9450.anInt9633;
		} else {
			i = (anInt9496 - (anInt9478 * aClass167_Sub3_9450.anInt9634 >> 8) >> aClass167_Sub3_9450.anInt9633);
			i_840_ = anInt9497 - (anInt9495 * aClass167_Sub3_9450.anInt9634 >> 8) >> aClass167_Sub3_9450.anInt9633;
		}
		int i_841_;
		int i_842_;
		if (aClass167_Sub3_9450.anInt9635 > 0) {
			i_841_ = anInt9498 - (anInt9495 * aClass167_Sub3_9450.anInt9635 >> 8) >> aClass167_Sub3_9450.anInt9633;
			i_842_ = anInt9499 - (anInt9478 * aClass167_Sub3_9450.anInt9635 >> 8) >> aClass167_Sub3_9450.anInt9633;
		} else {
			i_841_ = anInt9498 - (anInt9478 * aClass167_Sub3_9450.anInt9635 >> 8) >> aClass167_Sub3_9450.anInt9633;
			i_842_ = anInt9499 - (anInt9495 * aClass167_Sub3_9450.anInt9635 >> 8) >> aClass167_Sub3_9450.anInt9633;
		}
		int i_843_ = i_840_ - i + 1;
		int i_844_ = i_842_ - i_841_ + 1;
		Class536_Sub18_Sub7_Sub1 class536_sub18_sub7_sub1 = (Class536_Sub18_Sub7_Sub1) class536_sub18_sub7;
		Class536_Sub18_Sub7_Sub1 class536_sub18_sub7_sub1_845_;
		if (class536_sub18_sub7_sub1 != null && class536_sub18_sub7_sub1.method10972(i_843_, i_844_)) {
			class536_sub18_sub7_sub1_845_ = class536_sub18_sub7_sub1;
			class536_sub18_sub7_sub1_845_.method10980();
		} else
			class536_sub18_sub7_sub1_845_ = new Class536_Sub18_Sub7_Sub1(aClass167_Sub3_9450, i_843_, i_844_);
		class536_sub18_sub7_sub1_845_.method10973(i, i_841_, i_840_, i_842_);
		method8686(class536_sub18_sub7_sub1_845_);
		return class536_sub18_sub7_sub1_845_;
	}

	public void method2533(int i, int i_846_, Class160 class160, Class160 class160_847_, int i_848_, int i_849_, int i_850_) {
		if (!aBool9471)
			method8681();
		int i_851_ = i_848_ + anInt9496;
		int i_852_ = i_848_ + anInt9497;
		int i_853_ = i_850_ + anInt9498;
		int i_854_ = i_850_ + anInt9499;
		if (i != 1 && i != 2 && i != 3 && i != 5 || (i_851_ >= 0 && ((i_852_ + class160.anInt1767 * -1504778739 >> class160.anInt1768 * 2064238369) < class160.anInt1766 * 1718142487) && i_853_ >= 0 && ((i_854_ + class160.anInt1767 * -1504778739 >> class160.anInt1768 * 2064238369) < class160.anInt1769 * -889224915))) {
			if (i == 4 || i == 5) {
				if (class160_847_ == null || (i_851_ < 0 || ((i_852_ + class160_847_.anInt1767 * -1504778739 >> class160_847_.anInt1768 * 2064238369) >= class160_847_.anInt1766 * 1718142487) || i_853_ < 0 || ((i_854_ + class160_847_.anInt1767 * -1504778739 >> class160_847_.anInt1768 * 2064238369) >= class160_847_.anInt1769 * -889224915)))
					return;
			} else {
				i_851_ >>= class160.anInt1768 * 2064238369;
				i_852_ = (i_852_ + (class160.anInt1767 * -1504778739 - 1) >> class160.anInt1768 * 2064238369);
				i_853_ >>= class160.anInt1768 * 2064238369;
				i_854_ = (i_854_ + (class160.anInt1767 * -1504778739 - 1) >> class160.anInt1768 * 2064238369);
				if (class160.method1927(i_851_, i_853_, 1782429835) == i_849_ && (class160.method1927(i_852_, i_853_, 1418898580) == i_849_) && (class160.method1927(i_851_, i_854_, -1725626784) == i_849_) && (class160.method1927(i_852_, i_854_, 1582641638) == i_849_))
					return;
			}
			if (i == 1) {
				for (int i_855_ = 0; i_855_ < anInt9456; i_855_++)
					anIntArray9458[i_855_] = (anIntArray9458[i_855_] + class160.method1926((anIntArray9524[i_855_] + i_848_), (anIntArray9493[i_855_] + i_850_), (byte) 0) - i_849_);
			} else if (i == 2) {
				int i_856_ = anInt9478;
				if (i_856_ == 0)
					return;
				for (int i_857_ = 0; i_857_ < anInt9456; i_857_++) {
					int i_858_ = (anIntArray9458[i_857_] << 16) / i_856_;
					if (i_858_ < i_846_)
						anIntArray9458[i_857_] = (anIntArray9458[i_857_] + (class160.method1926((anIntArray9524[i_857_] + i_848_), (anIntArray9493[i_857_] + i_850_), (byte) 0) - i_849_) * (i_846_ - i_858_) / i_846_);
				}
			} else if (i == 3) {
				int i_859_ = (i_846_ & 0xff) * 16;
				int i_860_ = (i_846_ >> 8 & 0xff) * 16;
				int i_861_ = (i_846_ >> 16 & 0xff) << 6;
				int i_862_ = (i_846_ >> 24 & 0xff) << 6;
				if (i_848_ - (i_859_ >> 1) < 0 || ((i_848_ + (i_859_ >> 1) + class160.anInt1767 * -1504778739) >= (class160.anInt1766 * 1718142487 << class160.anInt1768 * 2064238369)) || i_850_ - (i_860_ >> 1) < 0 || ((i_850_ + (i_860_ >> 1) + class160.anInt1767 * -1504778739) >= (class160.anInt1769 * -889224915 << class160.anInt1768 * 2064238369)))
					return;
				method2476(class160, i_848_, i_849_, i_850_, i_859_, i_860_, i_861_, i_862_);
			} else if (i == 4) {
				int i_863_ = anInt9495 - anInt9478;
				for (int i_864_ = 0; i_864_ < anInt9456; i_864_++)
					anIntArray9458[i_864_] = (anIntArray9458[i_864_] + (class160_847_.method1926((anIntArray9524[i_864_] + i_848_), (anIntArray9493[i_864_] + i_850_), (byte) 0) - i_849_) + i_863_);
			} else if (i == 5) {
				int i_865_ = anInt9495 - anInt9478;
				for (int i_866_ = 0; i_866_ < anInt9456; i_866_++) {
					int i_867_ = anIntArray9524[i_866_] + i_848_;
					int i_868_ = anIntArray9493[i_866_] + i_850_;
					int i_869_ = class160.method1926(i_867_, i_868_, (byte) 0);
					int i_870_ = class160_847_.method1926(i_867_, i_868_, (byte) 0);
					int i_871_ = i_869_ - i_870_ - i_846_;
					anIntArray9458[i_866_] = ((anIntArray9458[i_866_] << 8) / i_865_ * i_871_ >> 8) - (i_849_ - i_869_);
				}
			}
			method8677();
			aBool9471 = false;
		}
	}

	public boolean method2511() {
		return aBool9489;
	}

	void method2535() {
		/* empty */
	}

	void method2537() {
		/* empty */
	}

	void method2538() {
		/* empty */
	}

	boolean method2540() {
		if (anIntArrayArray9460 == null)
			return false;
		for (int i = 0; i < anInt9455; i++) {
			anIntArray9524[i] <<= 4;
			anIntArray9458[i] <<= 4;
			anIntArray9493[i] <<= 4;
		}
		anInt9520 = 0;
		anInt9521 = 0;
		anInt9522 = 0;
		return true;
	}

	boolean method2565() {
		if (anIntArrayArray9460 == null)
			return false;
		for (int i = 0; i < anInt9455; i++) {
			anIntArray9524[i] <<= 4;
			anIntArray9458[i] <<= 4;
			anIntArray9493[i] <<= 4;
		}
		anInt9520 = 0;
		anInt9521 = 0;
		anInt9522 = 0;
		return true;
	}

	void method2542() {
		for (int i = 0; i < anInt9455; i++) {
			anIntArray9524[i] = anIntArray9524[i] + 7 >> 4;
			anIntArray9458[i] = anIntArray9458[i] + 7 >> 4;
			anIntArray9493[i] = anIntArray9493[i] + 7 >> 4;
		}
		method8677();
		aBool9471 = false;
	}

	void method2544(int i, int[] is, int i_872_, int i_873_, int i_874_, int i_875_, boolean bool) {
		int i_876_ = is.length;
		if (i == 0) {
			i_872_ <<= 4;
			i_873_ <<= 4;
			i_874_ <<= 4;
			int i_877_ = 0;
			anInt9520 = 0;
			anInt9521 = 0;
			anInt9522 = 0;
			for (int i_878_ = 0; i_878_ < i_876_; i_878_++) {
				int i_879_ = is[i_878_];
				if (i_879_ < anIntArrayArray9460.length) {
					int[] is_880_ = anIntArrayArray9460[i_879_];
					for (int i_881_ = 0; i_881_ < is_880_.length; i_881_++) {
						int i_882_ = is_880_[i_881_];
						anInt9520 += anIntArray9524[i_882_];
						anInt9521 += anIntArray9458[i_882_];
						anInt9522 += anIntArray9493[i_882_];
						i_877_++;
					}
				}
			}
			if (i_877_ > 0) {
				anInt9520 = anInt9520 / i_877_ + i_872_;
				anInt9521 = anInt9521 / i_877_ + i_873_;
				anInt9522 = anInt9522 / i_877_ + i_874_;
			} else {
				anInt9520 = i_872_;
				anInt9521 = i_873_;
				anInt9522 = i_874_;
			}
		} else if (i == 1) {
			i_872_ <<= 4;
			i_873_ <<= 4;
			i_874_ <<= 4;
			for (int i_883_ = 0; i_883_ < i_876_; i_883_++) {
				int i_884_ = is[i_883_];
				if (i_884_ < anIntArrayArray9460.length) {
					int[] is_885_ = anIntArrayArray9460[i_884_];
					for (int i_886_ = 0; i_886_ < is_885_.length; i_886_++) {
						int i_887_ = is_885_[i_886_];
						anIntArray9524[i_887_] += i_872_;
						anIntArray9458[i_887_] += i_873_;
						anIntArray9493[i_887_] += i_874_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_888_ = 0; i_888_ < i_876_; i_888_++) {
				int i_889_ = is[i_888_];
				if (i_889_ < anIntArrayArray9460.length) {
					int[] is_890_ = anIntArrayArray9460[i_889_];
					if ((i_875_ & 0x1) == 0) {
						for (int i_891_ = 0; i_891_ < is_890_.length; i_891_++) {
							int i_892_ = is_890_[i_891_];
							anIntArray9524[i_892_] -= anInt9520;
							anIntArray9458[i_892_] -= anInt9521;
							anIntArray9493[i_892_] -= anInt9522;
							if (i_874_ != 0) {
								int i_893_ = Class447.anIntArray4906[i_874_];
								int i_894_ = Class447.anIntArray4921[i_874_];
								int i_895_ = (anIntArray9458[i_892_] * i_893_ + anIntArray9524[i_892_] * i_894_ + 16383) >> 14;
								anIntArray9458[i_892_] = (anIntArray9458[i_892_] * i_894_ - anIntArray9524[i_892_] * i_893_ + 16383) >> 14;
								anIntArray9524[i_892_] = i_895_;
							}
							if (i_872_ != 0) {
								int i_896_ = Class447.anIntArray4906[i_872_];
								int i_897_ = Class447.anIntArray4921[i_872_];
								int i_898_ = (anIntArray9458[i_892_] * i_897_ - anIntArray9493[i_892_] * i_896_ + 16383) >> 14;
								anIntArray9493[i_892_] = (anIntArray9458[i_892_] * i_896_ + anIntArray9493[i_892_] * i_897_ + 16383) >> 14;
								anIntArray9458[i_892_] = i_898_;
							}
							if (i_873_ != 0) {
								int i_899_ = Class447.anIntArray4906[i_873_];
								int i_900_ = Class447.anIntArray4921[i_873_];
								int i_901_ = (anIntArray9493[i_892_] * i_899_ + anIntArray9524[i_892_] * i_900_ + 16383) >> 14;
								anIntArray9493[i_892_] = (anIntArray9493[i_892_] * i_900_ - anIntArray9524[i_892_] * i_899_ + 16383) >> 14;
								anIntArray9524[i_892_] = i_901_;
							}
							anIntArray9524[i_892_] += anInt9520;
							anIntArray9458[i_892_] += anInt9521;
							anIntArray9493[i_892_] += anInt9522;
						}
					} else {
						for (int i_902_ = 0; i_902_ < is_890_.length; i_902_++) {
							int i_903_ = is_890_[i_902_];
							anIntArray9524[i_903_] -= anInt9520;
							anIntArray9458[i_903_] -= anInt9521;
							anIntArray9493[i_903_] -= anInt9522;
							if (i_872_ != 0) {
								int i_904_ = Class447.anIntArray4906[i_872_];
								int i_905_ = Class447.anIntArray4921[i_872_];
								int i_906_ = (anIntArray9458[i_903_] * i_905_ - anIntArray9493[i_903_] * i_904_ + 16383) >> 14;
								anIntArray9493[i_903_] = (anIntArray9458[i_903_] * i_904_ + anIntArray9493[i_903_] * i_905_ + 16383) >> 14;
								anIntArray9458[i_903_] = i_906_;
							}
							if (i_874_ != 0) {
								int i_907_ = Class447.anIntArray4906[i_874_];
								int i_908_ = Class447.anIntArray4921[i_874_];
								int i_909_ = (anIntArray9458[i_903_] * i_907_ + anIntArray9524[i_903_] * i_908_ + 16383) >> 14;
								anIntArray9458[i_903_] = (anIntArray9458[i_903_] * i_908_ - anIntArray9524[i_903_] * i_907_ + 16383) >> 14;
								anIntArray9524[i_903_] = i_909_;
							}
							if (i_873_ != 0) {
								int i_910_ = Class447.anIntArray4906[i_873_];
								int i_911_ = Class447.anIntArray4921[i_873_];
								int i_912_ = (anIntArray9493[i_903_] * i_910_ + anIntArray9524[i_903_] * i_911_ + 16383) >> 14;
								anIntArray9493[i_903_] = (anIntArray9493[i_903_] * i_911_ - anIntArray9524[i_903_] * i_910_ + 16383) >> 14;
								anIntArray9524[i_903_] = i_912_;
							}
							anIntArray9524[i_903_] += anInt9520;
							anIntArray9458[i_903_] += anInt9521;
							anIntArray9493[i_903_] += anInt9522;
						}
					}
				}
			}
			if (bool) {
				for (int i_913_ = 0; i_913_ < i_876_; i_913_++) {
					int i_914_ = is[i_913_];
					if (i_914_ < anIntArrayArray9460.length) {
						int[] is_915_ = anIntArrayArray9460[i_914_];
						for (int i_916_ = 0; i_916_ < is_915_.length; i_916_++) {
							int i_917_ = is_915_[i_916_];
							int i_918_ = anIntArray9468[i_917_];
							int i_919_ = anIntArray9468[i_917_ + 1];
							for (int i_920_ = i_918_; (i_920_ < i_919_ && aShortArray9506[i_920_] != 0); i_920_++) {
								int i_921_ = (aShortArray9506[i_920_] & 0xffff) - 1;
								if (i_874_ != 0) {
									int i_922_ = Class447.anIntArray4906[i_874_];
									int i_923_ = Class447.anIntArray4921[i_874_];
									int i_924_ = ((aShortArray9466[i_921_] * i_922_ + aShortArray9500[i_921_] * i_923_ + 16383) >> 14);
									aShortArray9466[i_921_] = (short) (((aShortArray9466[i_921_] * i_923_) - (aShortArray9500[i_921_] * i_922_) + 16383) >> 14);
									aShortArray9500[i_921_] = (short) i_924_;
								}
								if (i_872_ != 0) {
									int i_925_ = Class447.anIntArray4906[i_872_];
									int i_926_ = Class447.anIntArray4921[i_872_];
									int i_927_ = ((aShortArray9466[i_921_] * i_926_ - aShortArray9467[i_921_] * i_925_ + 16383) >> 14);
									aShortArray9467[i_921_] = (short) (((aShortArray9466[i_921_] * i_925_) + (aShortArray9467[i_921_] * i_926_) + 16383) >> 14);
									aShortArray9466[i_921_] = (short) i_927_;
								}
								if (i_873_ != 0) {
									int i_928_ = Class447.anIntArray4906[i_873_];
									int i_929_ = Class447.anIntArray4921[i_873_];
									int i_930_ = ((aShortArray9467[i_921_] * i_928_ + aShortArray9500[i_921_] * i_929_ + 16383) >> 14);
									aShortArray9467[i_921_] = (short) (((aShortArray9467[i_921_] * i_929_) - (aShortArray9500[i_921_] * i_928_) + 16383) >> 14);
									aShortArray9500[i_921_] = (short) i_930_;
								}
							}
						}
					}
				}
				method8679();
			}
		} else if (i == 3) {
			for (int i_931_ = 0; i_931_ < i_876_; i_931_++) {
				int i_932_ = is[i_931_];
				if (i_932_ < anIntArrayArray9460.length) {
					int[] is_933_ = anIntArrayArray9460[i_932_];
					for (int i_934_ = 0; i_934_ < is_933_.length; i_934_++) {
						int i_935_ = is_933_[i_934_];
						anIntArray9524[i_935_] -= anInt9520;
						anIntArray9458[i_935_] -= anInt9521;
						anIntArray9493[i_935_] -= anInt9522;
						anIntArray9524[i_935_] = anIntArray9524[i_935_] * i_872_ >> 7;
						anIntArray9458[i_935_] = anIntArray9458[i_935_] * i_873_ >> 7;
						anIntArray9493[i_935_] = anIntArray9493[i_935_] * i_874_ >> 7;
						anIntArray9524[i_935_] += anInt9520;
						anIntArray9458[i_935_] += anInt9521;
						anIntArray9493[i_935_] += anInt9522;
					}
				}
			}
		} else if (i == 5) {
			if (anIntArrayArray9480 != null) {
				boolean bool_936_ = false;
				for (int i_937_ = 0; i_937_ < i_876_; i_937_++) {
					int i_938_ = is[i_937_];
					if (i_938_ < anIntArrayArray9480.length) {
						int[] is_939_ = anIntArrayArray9480[i_938_];
						for (int i_940_ = 0; i_940_ < is_939_.length; i_940_++) {
							int i_941_ = is_939_[i_940_];
							int i_942_ = (aByteArray9448[i_941_] & 0xff) + i_872_ * 8;
							if (i_942_ < 0)
								i_942_ = 0;
							else if (i_942_ > 255)
								i_942_ = 255;
							aByteArray9448[i_941_] = (byte) i_942_;
						}
						bool_936_ = bool_936_ | is_939_.length > 0;
					}
				}
				if (bool_936_) {
					if (aClass372Array9510 != null) {
						for (int i_943_ = 0; i_943_ < anInt9509; i_943_++) {
							Class372 class372 = aClass372Array9510[i_943_];
							Class346 class346 = aClass346Array9511[i_943_];
							class346.anInt3686 = (class346.anInt3686 & 0xffffff | 255 - (aByteArray9448[class372.anInt3889] & 0xff) << 24);
						}
					}
					method8678();
				}
			}
		} else if (i == 7) {
			if (anIntArrayArray9480 != null) {
				boolean bool_944_ = false;
				for (int i_945_ = 0; i_945_ < i_876_; i_945_++) {
					int i_946_ = is[i_945_];
					if (i_946_ < anIntArrayArray9480.length) {
						int[] is_947_ = anIntArrayArray9480[i_946_];
						for (int i_948_ = 0; i_948_ < is_947_.length; i_948_++) {
							int i_949_ = is_947_[i_948_];
							int i_950_ = aShortArray9490[i_949_] & 0xffff;
							int i_951_ = i_950_ >> 10 & 0x3f;
							int i_952_ = i_950_ >> 7 & 0x7;
							int i_953_ = i_950_ & 0x7f;
							i_951_ = i_951_ + i_872_ & 0x3f;
							i_952_ += i_873_ / 4;
							if (i_952_ < 0)
								i_952_ = 0;
							else if (i_952_ > 7)
								i_952_ = 7;
							i_953_ += i_874_;
							if (i_953_ < 0)
								i_953_ = 0;
							else if (i_953_ > 127)
								i_953_ = 127;
							aShortArray9490[i_949_] = (short) (i_951_ << 10 | i_952_ << 7 | i_953_);
						}
						bool_944_ = bool_944_ | is_947_.length > 0;
					}
				}
				if (bool_944_) {
					if (aClass372Array9510 != null) {
						for (int i_954_ = 0; i_954_ < anInt9509; i_954_++) {
							Class372 class372 = aClass372Array9510[i_954_];
							Class346 class346 = aClass346Array9511[i_954_];
							class346.anInt3686 = (class346.anInt3686 & ~0xffffff | (ColourUtils.anIntArray8309[(aShortArray9490[class372.anInt3889] & 0xffff)]) & 0xffffff);
						}
					}
					method8678();
				}
			}
		} else if (i == 8) {
			if (anIntArrayArray9451 != null) {
				for (int i_955_ = 0; i_955_ < i_876_; i_955_++) {
					int i_956_ = is[i_955_];
					if (i_956_ < anIntArrayArray9451.length) {
						int[] is_957_ = anIntArrayArray9451[i_956_];
						for (int i_958_ = 0; i_958_ < is_957_.length; i_958_++) {
							Class346 class346 = aClass346Array9511[is_957_[i_958_]];
							class346.anInt3685 += i_872_;
							class346.anInt3682 += i_873_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (anIntArrayArray9451 != null) {
				for (int i_959_ = 0; i_959_ < i_876_; i_959_++) {
					int i_960_ = is[i_959_];
					if (i_960_ < anIntArrayArray9451.length) {
						int[] is_961_ = anIntArrayArray9451[i_960_];
						for (int i_962_ = 0; i_962_ < is_961_.length; i_962_++) {
							Class346 class346 = aClass346Array9511[is_961_[i_962_]];
							class346.anInt3683 = class346.anInt3683 * i_872_ >> 7;
							class346.anInt3684 = class346.anInt3684 * i_873_ >> 7;
						}
					}
				}
			}
		} else if (i == 9) {
			if (anIntArrayArray9451 != null) {
				for (int i_963_ = 0; i_963_ < i_876_; i_963_++) {
					int i_964_ = is[i_963_];
					if (i_964_ < anIntArrayArray9451.length) {
						int[] is_965_ = anIntArrayArray9451[i_964_];
						for (int i_966_ = 0; i_966_ < is_965_.length; i_966_++) {
							Class346 class346 = aClass346Array9511[is_965_[i_966_]];
							class346.anInt3687 = class346.anInt3687 + i_872_ & 0x3fff;
						}
					}
				}
			}
		}
	}

	public void method2516(int i) {
		aShort9494 = (short) i;
		method8678();
	}

	void method8693() {
		if (aClass375_9483 != null)
			aClass375_9483.aBool3911 = false;
	}

	void method2547(int i, int i_967_, int i_968_, int i_969_) {
		if (i == 0) {
			int i_970_ = 0;
			anInt9520 = 0;
			anInt9521 = 0;
			anInt9522 = 0;
			for (int i_971_ = 0; i_971_ < anInt9456; i_971_++) {
				anInt9520 += anIntArray9524[i_971_];
				anInt9521 += anIntArray9458[i_971_];
				anInt9522 += anIntArray9493[i_971_];
				i_970_++;
			}
			if (i_970_ > 0) {
				anInt9520 = anInt9520 / i_970_ + i_967_;
				anInt9521 = anInt9521 / i_970_ + i_968_;
				anInt9522 = anInt9522 / i_970_ + i_969_;
			} else {
				anInt9520 = i_967_;
				anInt9521 = i_968_;
				anInt9522 = i_969_;
			}
		} else if (i == 1) {
			for (int i_972_ = 0; i_972_ < anInt9456; i_972_++) {
				anIntArray9524[i_972_] += i_967_;
				anIntArray9458[i_972_] += i_968_;
				anIntArray9493[i_972_] += i_969_;
			}
		} else if (i == 2) {
			for (int i_973_ = 0; i_973_ < anInt9456; i_973_++) {
				anIntArray9524[i_973_] -= anInt9520;
				anIntArray9458[i_973_] -= anInt9521;
				anIntArray9493[i_973_] -= anInt9522;
				if (i_969_ != 0) {
					int i_974_ = Class447.anIntArray4906[i_969_];
					int i_975_ = Class447.anIntArray4921[i_969_];
					int i_976_ = ((anIntArray9458[i_973_] * i_974_ + anIntArray9524[i_973_] * i_975_ + 16383) >> 14);
					anIntArray9458[i_973_] = (anIntArray9458[i_973_] * i_975_ - anIntArray9524[i_973_] * i_974_ + 16383) >> 14;
					anIntArray9524[i_973_] = i_976_;
				}
				if (i_967_ != 0) {
					int i_977_ = Class447.anIntArray4906[i_967_];
					int i_978_ = Class447.anIntArray4921[i_967_];
					int i_979_ = ((anIntArray9458[i_973_] * i_978_ - anIntArray9493[i_973_] * i_977_ + 16383) >> 14);
					anIntArray9493[i_973_] = (anIntArray9458[i_973_] * i_977_ + anIntArray9493[i_973_] * i_978_ + 16383) >> 14;
					anIntArray9458[i_973_] = i_979_;
				}
				if (i_968_ != 0) {
					int i_980_ = Class447.anIntArray4906[i_968_];
					int i_981_ = Class447.anIntArray4921[i_968_];
					int i_982_ = ((anIntArray9493[i_973_] * i_980_ + anIntArray9524[i_973_] * i_981_ + 16383) >> 14);
					anIntArray9493[i_973_] = (anIntArray9493[i_973_] * i_981_ - anIntArray9524[i_973_] * i_980_ + 16383) >> 14;
					anIntArray9524[i_973_] = i_982_;
				}
				anIntArray9524[i_973_] += anInt9520;
				anIntArray9458[i_973_] += anInt9521;
				anIntArray9493[i_973_] += anInt9522;
			}
		} else if (i == 3) {
			for (int i_983_ = 0; i_983_ < anInt9456; i_983_++) {
				anIntArray9524[i_983_] -= anInt9520;
				anIntArray9458[i_983_] -= anInt9521;
				anIntArray9493[i_983_] -= anInt9522;
				anIntArray9524[i_983_] = anIntArray9524[i_983_] * i_967_ / 128;
				anIntArray9458[i_983_] = anIntArray9458[i_983_] * i_968_ / 128;
				anIntArray9493[i_983_] = anIntArray9493[i_983_] * i_969_ / 128;
				anIntArray9524[i_983_] += anInt9520;
				anIntArray9458[i_983_] += anInt9521;
				anIntArray9493[i_983_] += anInt9522;
			}
		} else if (i == 5) {
			for (int i_984_ = 0; i_984_ < anInt9472; i_984_++) {
				int i_985_ = (aByteArray9448[i_984_] & 0xff) + i_967_ * 8;
				if (i_985_ < 0)
					i_985_ = 0;
				else if (i_985_ > 255)
					i_985_ = 255;
				aByteArray9448[i_984_] = (byte) i_985_;
			}
			if (aClass372Array9510 != null) {
				for (int i_986_ = 0; i_986_ < anInt9509; i_986_++) {
					Class372 class372 = aClass372Array9510[i_986_];
					Class346 class346 = aClass346Array9511[i_986_];
					class346.anInt3686 = (class346.anInt3686 & 0xffffff | (255 - (aByteArray9448[class372.anInt3889] & 0xff) << 24));
				}
			}
			method8678();
		} else if (i == 7) {
			for (int i_987_ = 0; i_987_ < anInt9472; i_987_++) {
				int i_988_ = aShortArray9490[i_987_] & 0xffff;
				int i_989_ = i_988_ >> 10 & 0x3f;
				int i_990_ = i_988_ >> 7 & 0x7;
				int i_991_ = i_988_ & 0x7f;
				i_989_ = i_989_ + i_967_ & 0x3f;
				i_990_ += i_968_ / 4;
				if (i_990_ < 0)
					i_990_ = 0;
				else if (i_990_ > 7)
					i_990_ = 7;
				i_991_ += i_969_;
				if (i_991_ < 0)
					i_991_ = 0;
				else if (i_991_ > 127)
					i_991_ = 127;
				aShortArray9490[i_987_] = (short) (i_989_ << 10 | i_990_ << 7 | i_991_);
			}
			if (aClass372Array9510 != null) {
				for (int i_992_ = 0; i_992_ < anInt9509; i_992_++) {
					Class372 class372 = aClass372Array9510[i_992_];
					Class346 class346 = aClass346Array9511[i_992_];
					class346.anInt3686 = (class346.anInt3686 & ~0xffffff | ((ColourUtils.anIntArray8309[aShortArray9490[class372.anInt3889] & 0xffff]) & 0xffffff));
				}
			}
			method8678();
		} else if (i == 8) {
			for (int i_993_ = 0; i_993_ < anInt9509; i_993_++) {
				Class346 class346 = aClass346Array9511[i_993_];
				class346.anInt3685 += i_967_;
				class346.anInt3682 += i_968_;
			}
		} else if (i == 10) {
			for (int i_994_ = 0; i_994_ < anInt9509; i_994_++) {
				Class346 class346 = aClass346Array9511[i_994_];
				class346.anInt3683 = class346.anInt3683 * i_967_ >> 7;
				class346.anInt3684 = class346.anInt3684 * i_968_ >> 7;
			}
		} else if (i == 9) {
			for (int i_995_ = 0; i_995_ < anInt9509; i_995_++) {
				Class346 class346 = aClass346Array9511[i_995_];
				class346.anInt3687 = class346.anInt3687 + i_967_ & 0x3fff;
			}
		}
	}

	void method2548(int i, int i_996_, int i_997_, int i_998_) {
		if (i == 0) {
			int i_999_ = 0;
			anInt9520 = 0;
			anInt9521 = 0;
			anInt9522 = 0;
			for (int i_1000_ = 0; i_1000_ < anInt9456; i_1000_++) {
				anInt9520 += anIntArray9524[i_1000_];
				anInt9521 += anIntArray9458[i_1000_];
				anInt9522 += anIntArray9493[i_1000_];
				i_999_++;
			}
			if (i_999_ > 0) {
				anInt9520 = anInt9520 / i_999_ + i_996_;
				anInt9521 = anInt9521 / i_999_ + i_997_;
				anInt9522 = anInt9522 / i_999_ + i_998_;
			} else {
				anInt9520 = i_996_;
				anInt9521 = i_997_;
				anInt9522 = i_998_;
			}
		} else if (i == 1) {
			for (int i_1001_ = 0; i_1001_ < anInt9456; i_1001_++) {
				anIntArray9524[i_1001_] += i_996_;
				anIntArray9458[i_1001_] += i_997_;
				anIntArray9493[i_1001_] += i_998_;
			}
		} else if (i == 2) {
			for (int i_1002_ = 0; i_1002_ < anInt9456; i_1002_++) {
				anIntArray9524[i_1002_] -= anInt9520;
				anIntArray9458[i_1002_] -= anInt9521;
				anIntArray9493[i_1002_] -= anInt9522;
				if (i_998_ != 0) {
					int i_1003_ = Class447.anIntArray4906[i_998_];
					int i_1004_ = Class447.anIntArray4921[i_998_];
					int i_1005_ = ((anIntArray9458[i_1002_] * i_1003_ + anIntArray9524[i_1002_] * i_1004_ + 16383) >> 14);
					anIntArray9458[i_1002_] = (anIntArray9458[i_1002_] * i_1004_ - anIntArray9524[i_1002_] * i_1003_ + 16383) >> 14;
					anIntArray9524[i_1002_] = i_1005_;
				}
				if (i_996_ != 0) {
					int i_1006_ = Class447.anIntArray4906[i_996_];
					int i_1007_ = Class447.anIntArray4921[i_996_];
					int i_1008_ = ((anIntArray9458[i_1002_] * i_1007_ - anIntArray9493[i_1002_] * i_1006_ + 16383) >> 14);
					anIntArray9493[i_1002_] = (anIntArray9458[i_1002_] * i_1006_ + anIntArray9493[i_1002_] * i_1007_ + 16383) >> 14;
					anIntArray9458[i_1002_] = i_1008_;
				}
				if (i_997_ != 0) {
					int i_1009_ = Class447.anIntArray4906[i_997_];
					int i_1010_ = Class447.anIntArray4921[i_997_];
					int i_1011_ = ((anIntArray9493[i_1002_] * i_1009_ + anIntArray9524[i_1002_] * i_1010_ + 16383) >> 14);
					anIntArray9493[i_1002_] = (anIntArray9493[i_1002_] * i_1010_ - anIntArray9524[i_1002_] * i_1009_ + 16383) >> 14;
					anIntArray9524[i_1002_] = i_1011_;
				}
				anIntArray9524[i_1002_] += anInt9520;
				anIntArray9458[i_1002_] += anInt9521;
				anIntArray9493[i_1002_] += anInt9522;
			}
		} else if (i == 3) {
			for (int i_1012_ = 0; i_1012_ < anInt9456; i_1012_++) {
				anIntArray9524[i_1012_] -= anInt9520;
				anIntArray9458[i_1012_] -= anInt9521;
				anIntArray9493[i_1012_] -= anInt9522;
				anIntArray9524[i_1012_] = anIntArray9524[i_1012_] * i_996_ / 128;
				anIntArray9458[i_1012_] = anIntArray9458[i_1012_] * i_997_ / 128;
				anIntArray9493[i_1012_] = anIntArray9493[i_1012_] * i_998_ / 128;
				anIntArray9524[i_1012_] += anInt9520;
				anIntArray9458[i_1012_] += anInt9521;
				anIntArray9493[i_1012_] += anInt9522;
			}
		} else if (i == 5) {
			for (int i_1013_ = 0; i_1013_ < anInt9472; i_1013_++) {
				int i_1014_ = (aByteArray9448[i_1013_] & 0xff) + i_996_ * 8;
				if (i_1014_ < 0)
					i_1014_ = 0;
				else if (i_1014_ > 255)
					i_1014_ = 255;
				aByteArray9448[i_1013_] = (byte) i_1014_;
			}
			if (aClass372Array9510 != null) {
				for (int i_1015_ = 0; i_1015_ < anInt9509; i_1015_++) {
					Class372 class372 = aClass372Array9510[i_1015_];
					Class346 class346 = aClass346Array9511[i_1015_];
					class346.anInt3686 = (class346.anInt3686 & 0xffffff | (255 - (aByteArray9448[class372.anInt3889] & 0xff) << 24));
				}
			}
			method8678();
		} else if (i == 7) {
			for (int i_1016_ = 0; i_1016_ < anInt9472; i_1016_++) {
				int i_1017_ = aShortArray9490[i_1016_] & 0xffff;
				int i_1018_ = i_1017_ >> 10 & 0x3f;
				int i_1019_ = i_1017_ >> 7 & 0x7;
				int i_1020_ = i_1017_ & 0x7f;
				i_1018_ = i_1018_ + i_996_ & 0x3f;
				i_1019_ += i_997_ / 4;
				if (i_1019_ < 0)
					i_1019_ = 0;
				else if (i_1019_ > 7)
					i_1019_ = 7;
				i_1020_ += i_998_;
				if (i_1020_ < 0)
					i_1020_ = 0;
				else if (i_1020_ > 127)
					i_1020_ = 127;
				aShortArray9490[i_1016_] = (short) (i_1018_ << 10 | i_1019_ << 7 | i_1020_);
			}
			if (aClass372Array9510 != null) {
				for (int i_1021_ = 0; i_1021_ < anInt9509; i_1021_++) {
					Class372 class372 = aClass372Array9510[i_1021_];
					Class346 class346 = aClass346Array9511[i_1021_];
					class346.anInt3686 = (class346.anInt3686 & ~0xffffff | ((ColourUtils.anIntArray8309[aShortArray9490[class372.anInt3889] & 0xffff]) & 0xffffff));
				}
			}
			method8678();
		} else if (i == 8) {
			for (int i_1022_ = 0; i_1022_ < anInt9509; i_1022_++) {
				Class346 class346 = aClass346Array9511[i_1022_];
				class346.anInt3685 += i_996_;
				class346.anInt3682 += i_997_;
			}
		} else if (i == 10) {
			for (int i_1023_ = 0; i_1023_ < anInt9509; i_1023_++) {
				Class346 class346 = aClass346Array9511[i_1023_];
				class346.anInt3683 = class346.anInt3683 * i_996_ >> 7;
				class346.anInt3684 = class346.anInt3684 * i_997_ >> 7;
			}
		} else if (i == 9) {
			for (int i_1024_ = 0; i_1024_ < anInt9509; i_1024_++) {
				Class346 class346 = aClass346Array9511[i_1024_];
				class346.anInt3687 = class346.anInt3687 + i_996_ & 0x3fff;
			}
		}
	}

	public void method2587(Class433 class433, int i, boolean bool) {
		if (aShortArray9461 != null) {
			Class433 class433_1025_ = class433;
			if (bool) {
				class433_1025_ = aClass167_Sub3_9450.aClass433_9543;
				class433_1025_.method5196(class433);
			}
			float[] fs = new float[3];
			for (int i_1026_ = 0; i_1026_ < anInt9456; i_1026_++) {
				if ((i & aShortArray9461[i_1026_]) != 0) {
					class433_1025_.method5215((float) anIntArray9524[i_1026_], (float) anIntArray9458[i_1026_], (float) anIntArray9493[i_1026_], fs);
					anIntArray9524[i_1026_] = (int) fs[0];
					anIntArray9458[i_1026_] = (int) fs[1];
					anIntArray9493[i_1026_] = (int) fs[2];
				}
			}
		}
	}

	public void method2550(Class433 class433, Class178 class178, int i) {
		if (aClass351_9474 != null)
			aClass351_9474.method4641();
		if (class178 != null)
			class178.aBool1945 = false;
		if (anInt9462 != 0) {
			Class443 class443 = aClass167_Sub3_9450.aClass443_9580;
			Class443 class443_1027_ = aClass167_Sub3_9450.aClass443_9570;
			Class443 class443_1028_ = aClass167_Sub3_9450.aClass443_9643;
			class443_1027_.method5359(class433);
			class443_1028_.method5339(class443_1027_);
			class443_1028_.method5390(aClass167_Sub3_9450.aClass443_9584);
			if (!aBool9471)
				method8681();
			float[] fs = aClass167_Sub3_9450.aFloatArray9546;
			class443_1027_.method5346(0.0F, (float) anInt9478, 0.0F, fs);
			float f = fs[0];
			float f_1029_ = fs[1];
			float f_1030_ = fs[2];
			class443_1027_.method5346(0.0F, (float) anInt9495, 0.0F, fs);
			float f_1031_ = fs[0];
			float f_1032_ = fs[1];
			float f_1033_ = fs[2];
			for (int i_1034_ = 0; i_1034_ < 6; i_1034_++) {
				float[] fs_1035_ = aClass167_Sub3_9450.aFloatArrayArray9702[i_1034_];
				float f_1036_ = (fs_1035_[0] * f + fs_1035_[1] * f_1029_ + fs_1035_[2] * f_1030_ + fs_1035_[3] + (float) anInt9492);
				float f_1037_ = (fs_1035_[0] * f_1031_ + fs_1035_[1] * f_1032_ + fs_1035_[2] * f_1033_ + fs_1035_[3] + (float) anInt9492);
				if (f_1036_ < 0.0F && f_1037_ < 0.0F)
					return;
			}
			if (class178 != null) {
				boolean bool = false;
				boolean bool_1038_ = true;
				int i_1039_ = anInt9496 + anInt9497 >> 1;
				int i_1040_ = anInt9498 + anInt9499 >> 1;
				int i_1041_ = i_1039_;
				int i_1042_ = anInt9478;
				int i_1043_ = i_1040_;
				float f_1044_ = (class443_1028_.aFloatArray4878[0] * (float) i_1041_ + class443_1028_.aFloatArray4878[4] * (float) i_1042_ + class443_1028_.aFloatArray4878[8] * (float) i_1043_ + class443_1028_.aFloatArray4878[12]);
				float f_1045_ = (class443_1028_.aFloatArray4878[1] * (float) i_1041_ + class443_1028_.aFloatArray4878[5] * (float) i_1042_ + class443_1028_.aFloatArray4878[9] * (float) i_1043_ + class443_1028_.aFloatArray4878[13]);
				float f_1046_ = (class443_1028_.aFloatArray4878[2] * (float) i_1041_ + class443_1028_.aFloatArray4878[6] * (float) i_1042_ + class443_1028_.aFloatArray4878[10] * (float) i_1043_ + class443_1028_.aFloatArray4878[14]);
				float f_1047_ = (class443_1028_.aFloatArray4878[3] * (float) i_1041_ + class443_1028_.aFloatArray4878[7] * (float) i_1042_ + class443_1028_.aFloatArray4878[11] * (float) i_1043_ + class443_1028_.aFloatArray4878[15]);
				if (f_1046_ >= -f_1047_) {
					class178.anInt1941 = (int) (aClass167_Sub3_9450.aFloat9536 + (aClass167_Sub3_9450.aFloat9588 * f_1044_ / f_1047_));
					class178.anInt1942 = (int) (aClass167_Sub3_9450.aFloat9589 + (aClass167_Sub3_9450.aFloat9590 * f_1045_ / f_1047_));
				} else
					bool = true;
				i_1041_ = i_1039_;
				i_1042_ = anInt9495;
				i_1043_ = i_1040_;
				float f_1048_ = (class443_1028_.aFloatArray4878[0] * (float) i_1041_ + class443_1028_.aFloatArray4878[4] * (float) i_1042_ + class443_1028_.aFloatArray4878[8] * (float) i_1043_ + class443_1028_.aFloatArray4878[12]);
				float f_1049_ = (class443_1028_.aFloatArray4878[1] * (float) i_1041_ + class443_1028_.aFloatArray4878[5] * (float) i_1042_ + class443_1028_.aFloatArray4878[9] * (float) i_1043_ + class443_1028_.aFloatArray4878[13]);
				float f_1050_ = (class443_1028_.aFloatArray4878[2] * (float) i_1041_ + class443_1028_.aFloatArray4878[6] * (float) i_1042_ + class443_1028_.aFloatArray4878[10] * (float) i_1043_ + class443_1028_.aFloatArray4878[14]);
				float f_1051_ = (class443_1028_.aFloatArray4878[3] * (float) i_1041_ + class443_1028_.aFloatArray4878[7] * (float) i_1042_ + class443_1028_.aFloatArray4878[11] * (float) i_1043_ + class443_1028_.aFloatArray4878[15]);
				if (f_1050_ >= -f_1051_) {
					class178.anInt1943 = (int) (aClass167_Sub3_9450.aFloat9536 + (aClass167_Sub3_9450.aFloat9588 * f_1048_ / f_1051_));
					class178.anInt1944 = (int) (aClass167_Sub3_9450.aFloat9589 + (aClass167_Sub3_9450.aFloat9590 * f_1049_ / f_1051_));
				} else
					bool = true;
				if (bool) {
					if (f_1046_ < -f_1047_ && f_1050_ < -f_1051_)
						bool_1038_ = false;
					else if (f_1046_ < -f_1047_) {
						float f_1052_ = (f_1046_ + f_1047_) / (f_1050_ + f_1051_) - 1.0F;
						float f_1053_ = f_1044_ + f_1052_ * (f_1048_ - f_1044_);
						float f_1054_ = f_1045_ + f_1052_ * (f_1049_ - f_1045_);
						float f_1055_ = f_1047_ + f_1052_ * (f_1051_ - f_1047_);
						class178.anInt1941 = (int) (aClass167_Sub3_9450.aFloat9536 + (aClass167_Sub3_9450.aFloat9588 * f_1053_ / f_1055_));
						class178.anInt1942 = (int) (aClass167_Sub3_9450.aFloat9589 + (aClass167_Sub3_9450.aFloat9590 * f_1054_ / f_1055_));
					} else if (f_1050_ < -f_1051_) {
						float f_1056_ = (f_1050_ + f_1051_) / (f_1046_ + f_1047_) - 1.0F;
						float f_1057_ = f_1048_ + f_1056_ * (f_1044_ - f_1048_);
						float f_1058_ = f_1049_ + f_1056_ * (f_1045_ - f_1049_);
						float f_1059_ = f_1051_ + f_1056_ * (f_1047_ - f_1051_);
						class178.anInt1943 = (int) (aClass167_Sub3_9450.aFloat9536 + (aClass167_Sub3_9450.aFloat9588 * f_1057_ / f_1059_));
						class178.anInt1944 = (int) (aClass167_Sub3_9450.aFloat9589 + (aClass167_Sub3_9450.aFloat9590 * f_1058_ / f_1059_));
					}
				}
				if (bool_1038_) {
					if (f_1046_ / f_1047_ > f_1050_ / f_1051_) {
						float f_1060_ = (f_1044_ + (class443.aFloatArray4878[0] * (float) anInt9492) + class443.aFloatArray4878[12]);
						float f_1061_ = (f_1047_ + (class443.aFloatArray4878[3] * (float) anInt9492) + class443.aFloatArray4878[15]);
						class178.anInt1940 = (int) (aClass167_Sub3_9450.aFloat9536 - (float) class178.anInt1941 + (aClass167_Sub3_9450.aFloat9588 * f_1060_ / f_1061_));
					} else {
						float f_1062_ = (f_1048_ + (class443.aFloatArray4878[0] * (float) anInt9492) + class443.aFloatArray4878[12]);
						float f_1063_ = (f_1051_ + (class443.aFloatArray4878[3] * (float) anInt9492) + class443.aFloatArray4878[15]);
						class178.anInt1940 = (int) (aClass167_Sub3_9450.aFloat9536 - (float) class178.anInt1943 + (aClass167_Sub3_9450.aFloat9588 * f_1062_ / f_1063_));
					}
					class178.aBool1945 = true;
				}
			}
			aClass167_Sub3_9450.method8711(i);
			method8687(class433);
			aClass167_Sub3_9450.method8711(0);
			class443_1027_.method5359(class433);
			class443_1027_.method5390(aClass167_Sub3_9450.aClass443_9698);
			method8682(class443_1027_);
		}
	}

	void method2554(int i, int[] is, int i_1064_, int i_1065_, int i_1066_, boolean bool, int i_1067_, int[] is_1068_) {
		int i_1069_ = is.length;
		if (i == 0) {
			i_1064_ <<= 4;
			i_1065_ <<= 4;
			i_1066_ <<= 4;
			int i_1070_ = 0;
			anInt9520 = 0;
			anInt9521 = 0;
			anInt9522 = 0;
			for (int i_1071_ = 0; i_1071_ < i_1069_; i_1071_++) {
				int i_1072_ = is[i_1071_];
				if (i_1072_ < anIntArrayArray9460.length) {
					int[] is_1073_ = anIntArrayArray9460[i_1072_];
					for (int i_1074_ = 0; i_1074_ < is_1073_.length; i_1074_++) {
						int i_1075_ = is_1073_[i_1074_];
						if (aShortArray9461 == null || (i_1067_ & aShortArray9461[i_1075_]) != 0) {
							anInt9520 += anIntArray9524[i_1075_];
							anInt9521 += anIntArray9458[i_1075_];
							anInt9522 += anIntArray9493[i_1075_];
							i_1070_++;
						}
					}
				}
			}
			if (i_1070_ > 0) {
				anInt9520 = anInt9520 / i_1070_ + i_1064_;
				anInt9521 = anInt9521 / i_1070_ + i_1065_;
				anInt9522 = anInt9522 / i_1070_ + i_1066_;
				aBool9523 = true;
			} else {
				anInt9520 = i_1064_;
				anInt9521 = i_1065_;
				anInt9522 = i_1066_;
			}
		} else if (i == 1) {
			if (is_1068_ != null) {
				int i_1076_ = ((is_1068_[0] * i_1064_ + is_1068_[1] * i_1065_ + is_1068_[2] * i_1066_ + 8192) >> 14);
				int i_1077_ = ((is_1068_[3] * i_1064_ + is_1068_[4] * i_1065_ + is_1068_[5] * i_1066_ + 8192) >> 14);
				int i_1078_ = ((is_1068_[6] * i_1064_ + is_1068_[7] * i_1065_ + is_1068_[8] * i_1066_ + 8192) >> 14);
				i_1064_ = i_1076_;
				i_1065_ = i_1077_;
				i_1066_ = i_1078_;
			}
			i_1064_ <<= 4;
			i_1065_ <<= 4;
			i_1066_ <<= 4;
			for (int i_1079_ = 0; i_1079_ < i_1069_; i_1079_++) {
				int i_1080_ = is[i_1079_];
				if (i_1080_ < anIntArrayArray9460.length) {
					int[] is_1081_ = anIntArrayArray9460[i_1080_];
					for (int i_1082_ = 0; i_1082_ < is_1081_.length; i_1082_++) {
						int i_1083_ = is_1081_[i_1082_];
						if (aShortArray9461 == null || (i_1067_ & aShortArray9461[i_1083_]) != 0) {
							anIntArray9524[i_1083_] += i_1064_;
							anIntArray9458[i_1083_] += i_1065_;
							anIntArray9493[i_1083_] += i_1066_;
						}
					}
				}
			}
		} else if (i == 2) {
			if (is_1068_ != null) {
				int i_1084_ = is_1068_[9] << 4;
				int i_1085_ = is_1068_[10] << 4;
				int i_1086_ = is_1068_[11] << 4;
				int i_1087_ = is_1068_[12] << 4;
				int i_1088_ = is_1068_[13] << 4;
				int i_1089_ = is_1068_[14] << 4;
				if (aBool9523) {
					int i_1090_ = ((is_1068_[0] * anInt9520 + is_1068_[3] * anInt9521 + is_1068_[6] * anInt9522 + 8192) >> 14);
					int i_1091_ = ((is_1068_[1] * anInt9520 + is_1068_[4] * anInt9521 + is_1068_[7] * anInt9522 + 8192) >> 14);
					int i_1092_ = ((is_1068_[2] * anInt9520 + is_1068_[5] * anInt9521 + is_1068_[8] * anInt9522 + 8192) >> 14);
					i_1090_ += i_1087_;
					i_1091_ += i_1088_;
					i_1092_ += i_1089_;
					anInt9520 = i_1090_;
					anInt9521 = i_1091_;
					anInt9522 = i_1092_;
					aBool9523 = false;
				}
				int[] is_1093_ = new int[9];
				int i_1094_ = Class447.anIntArray4921[i_1064_];
				int i_1095_ = Class447.anIntArray4906[i_1064_];
				int i_1096_ = Class447.anIntArray4921[i_1065_];
				int i_1097_ = Class447.anIntArray4906[i_1065_];
				int i_1098_ = Class447.anIntArray4921[i_1066_];
				int i_1099_ = Class447.anIntArray4906[i_1066_];
				int i_1100_ = i_1095_ * i_1098_ + 8192 >> 14;
				int i_1101_ = i_1095_ * i_1099_ + 8192 >> 14;
				is_1093_[0] = i_1096_ * i_1098_ + i_1097_ * i_1101_ + 8192 >> 14;
				is_1093_[1] = -i_1096_ * i_1099_ + i_1097_ * i_1100_ + 8192 >> 14;
				is_1093_[2] = i_1097_ * i_1094_ + 8192 >> 14;
				is_1093_[3] = i_1094_ * i_1099_ + 8192 >> 14;
				is_1093_[4] = i_1094_ * i_1098_ + 8192 >> 14;
				is_1093_[5] = -i_1095_;
				is_1093_[6] = -i_1097_ * i_1098_ + i_1096_ * i_1101_ + 8192 >> 14;
				is_1093_[7] = i_1097_ * i_1099_ + i_1096_ * i_1100_ + 8192 >> 14;
				is_1093_[8] = i_1096_ * i_1094_ + 8192 >> 14;
				int i_1102_ = ((is_1093_[0] * -anInt9520 + is_1093_[1] * -anInt9521 + is_1093_[2] * -anInt9522 + 8192) >> 14);
				int i_1103_ = ((is_1093_[3] * -anInt9520 + is_1093_[4] * -anInt9521 + is_1093_[5] * -anInt9522 + 8192) >> 14);
				int i_1104_ = ((is_1093_[6] * -anInt9520 + is_1093_[7] * -anInt9521 + is_1093_[8] * -anInt9522 + 8192) >> 14);
				int i_1105_ = i_1102_ + anInt9520;
				int i_1106_ = i_1103_ + anInt9521;
				int i_1107_ = i_1104_ + anInt9522;
				int[] is_1108_ = new int[9];
				for (int i_1109_ = 0; i_1109_ < 3; i_1109_++) {
					for (int i_1110_ = 0; i_1110_ < 3; i_1110_++) {
						int i_1111_ = 0;
						for (int i_1112_ = 0; i_1112_ < 3; i_1112_++)
							i_1111_ += (is_1093_[i_1109_ * 3 + i_1112_] * is_1068_[i_1110_ * 3 + i_1112_]);
						is_1108_[i_1109_ * 3 + i_1110_] = i_1111_ + 8192 >> 14;
					}
				}
				int i_1113_ = ((is_1093_[0] * i_1087_ + is_1093_[1] * i_1088_ + is_1093_[2] * i_1089_ + 8192) >> 14);
				int i_1114_ = ((is_1093_[3] * i_1087_ + is_1093_[4] * i_1088_ + is_1093_[5] * i_1089_ + 8192) >> 14);
				int i_1115_ = ((is_1093_[6] * i_1087_ + is_1093_[7] * i_1088_ + is_1093_[8] * i_1089_ + 8192) >> 14);
				i_1113_ += i_1105_;
				i_1114_ += i_1106_;
				i_1115_ += i_1107_;
				int[] is_1116_ = new int[9];
				for (int i_1117_ = 0; i_1117_ < 3; i_1117_++) {
					for (int i_1118_ = 0; i_1118_ < 3; i_1118_++) {
						int i_1119_ = 0;
						for (int i_1120_ = 0; i_1120_ < 3; i_1120_++)
							i_1119_ += (is_1068_[i_1117_ * 3 + i_1120_] * is_1108_[i_1118_ + i_1120_ * 3]);
						is_1116_[i_1117_ * 3 + i_1118_] = i_1119_ + 8192 >> 14;
					}
				}
				int i_1121_ = ((is_1068_[0] * i_1113_ + is_1068_[1] * i_1114_ + is_1068_[2] * i_1115_ + 8192) >> 14);
				int i_1122_ = ((is_1068_[3] * i_1113_ + is_1068_[4] * i_1114_ + is_1068_[5] * i_1115_ + 8192) >> 14);
				int i_1123_ = ((is_1068_[6] * i_1113_ + is_1068_[7] * i_1114_ + is_1068_[8] * i_1115_ + 8192) >> 14);
				i_1121_ += i_1084_;
				i_1122_ += i_1085_;
				i_1123_ += i_1086_;
				for (int i_1124_ = 0; i_1124_ < i_1069_; i_1124_++) {
					int i_1125_ = is[i_1124_];
					if (i_1125_ < anIntArrayArray9460.length) {
						int[] is_1126_ = anIntArrayArray9460[i_1125_];
						for (int i_1127_ = 0; i_1127_ < is_1126_.length; i_1127_++) {
							int i_1128_ = is_1126_[i_1127_];
							if (aShortArray9461 == null || (i_1067_ & aShortArray9461[i_1128_]) != 0) {
								int i_1129_ = ((is_1116_[0] * anIntArray9524[i_1128_] + is_1116_[1] * anIntArray9458[i_1128_] + is_1116_[2] * anIntArray9493[i_1128_] + 8192) >> 14);
								int i_1130_ = ((is_1116_[3] * anIntArray9524[i_1128_] + is_1116_[4] * anIntArray9458[i_1128_] + is_1116_[5] * anIntArray9493[i_1128_] + 8192) >> 14);
								int i_1131_ = ((is_1116_[6] * anIntArray9524[i_1128_] + is_1116_[7] * anIntArray9458[i_1128_] + is_1116_[8] * anIntArray9493[i_1128_] + 8192) >> 14);
								i_1129_ += i_1121_;
								i_1130_ += i_1122_;
								i_1131_ += i_1123_;
								anIntArray9524[i_1128_] = i_1129_;
								anIntArray9458[i_1128_] = i_1130_;
								anIntArray9493[i_1128_] = i_1131_;
							}
						}
					}
				}
			} else {
				for (int i_1132_ = 0; i_1132_ < i_1069_; i_1132_++) {
					int i_1133_ = is[i_1132_];
					if (i_1133_ < anIntArrayArray9460.length) {
						int[] is_1134_ = anIntArrayArray9460[i_1133_];
						for (int i_1135_ = 0; i_1135_ < is_1134_.length; i_1135_++) {
							int i_1136_ = is_1134_[i_1135_];
							if (aShortArray9461 == null || (i_1067_ & aShortArray9461[i_1136_]) != 0) {
								anIntArray9524[i_1136_] -= anInt9520;
								anIntArray9458[i_1136_] -= anInt9521;
								anIntArray9493[i_1136_] -= anInt9522;
								if (i_1066_ != 0) {
									int i_1137_ = Class447.anIntArray4906[i_1066_];
									int i_1138_ = Class447.anIntArray4921[i_1066_];
									int i_1139_ = ((anIntArray9458[i_1136_] * i_1137_ + anIntArray9524[i_1136_] * i_1138_ + 16383) >> 14);
									anIntArray9458[i_1136_] = (anIntArray9458[i_1136_] * i_1138_ - anIntArray9524[i_1136_] * i_1137_ + 16383) >> 14;
									anIntArray9524[i_1136_] = i_1139_;
								}
								if (i_1064_ != 0) {
									int i_1140_ = Class447.anIntArray4906[i_1064_];
									int i_1141_ = Class447.anIntArray4921[i_1064_];
									int i_1142_ = ((anIntArray9458[i_1136_] * i_1141_ - anIntArray9493[i_1136_] * i_1140_ + 16383) >> 14);
									anIntArray9493[i_1136_] = (anIntArray9458[i_1136_] * i_1140_ + anIntArray9493[i_1136_] * i_1141_ + 16383) >> 14;
									anIntArray9458[i_1136_] = i_1142_;
								}
								if (i_1065_ != 0) {
									int i_1143_ = Class447.anIntArray4906[i_1065_];
									int i_1144_ = Class447.anIntArray4921[i_1065_];
									int i_1145_ = ((anIntArray9493[i_1136_] * i_1143_ + anIntArray9524[i_1136_] * i_1144_ + 16383) >> 14);
									anIntArray9493[i_1136_] = (anIntArray9493[i_1136_] * i_1144_ - anIntArray9524[i_1136_] * i_1143_ + 16383) >> 14;
									anIntArray9524[i_1136_] = i_1145_;
								}
								anIntArray9524[i_1136_] += anInt9520;
								anIntArray9458[i_1136_] += anInt9521;
								anIntArray9493[i_1136_] += anInt9522;
							}
						}
					}
				}
				if (bool) {
					for (int i_1146_ = 0; i_1146_ < i_1069_; i_1146_++) {
						int i_1147_ = is[i_1146_];
						if (i_1147_ < anIntArrayArray9460.length) {
							int[] is_1148_ = anIntArrayArray9460[i_1147_];
							for (int i_1149_ = 0; i_1149_ < is_1148_.length; i_1149_++) {
								int i_1150_ = is_1148_[i_1149_];
								if (aShortArray9461 == null || ((i_1067_ & aShortArray9461[i_1150_]) != 0)) {
									int i_1151_ = anIntArray9468[i_1150_];
									int i_1152_ = anIntArray9468[i_1150_ + 1];
									for (int i_1153_ = i_1151_; (i_1153_ < i_1152_ && aShortArray9506[i_1153_] != 0); i_1153_++) {
										int i_1154_ = (aShortArray9506[i_1153_] & 0xffff) - 1;
										if (i_1066_ != 0) {
											int i_1155_ = (Class447.anIntArray4906[i_1066_]);
											int i_1156_ = (Class447.anIntArray4921[i_1066_]);
											int i_1157_ = (((aShortArray9466[i_1154_] * i_1155_) + (aShortArray9500[i_1154_] * i_1156_) + 16383) >> 14);
											aShortArray9466[i_1154_] = (short) ((((aShortArray9466[i_1154_]) * i_1156_) - ((aShortArray9500[i_1154_]) * i_1155_) + 16383) >> 14);
											aShortArray9500[i_1154_] = (short) i_1157_;
										}
										if (i_1064_ != 0) {
											int i_1158_ = (Class447.anIntArray4906[i_1064_]);
											int i_1159_ = (Class447.anIntArray4921[i_1064_]);
											int i_1160_ = (((aShortArray9466[i_1154_] * i_1159_) - (aShortArray9467[i_1154_] * i_1158_) + 16383) >> 14);
											aShortArray9467[i_1154_] = (short) ((((aShortArray9466[i_1154_]) * i_1158_) + ((aShortArray9467[i_1154_]) * i_1159_) + 16383) >> 14);
											aShortArray9466[i_1154_] = (short) i_1160_;
										}
										if (i_1065_ != 0) {
											int i_1161_ = (Class447.anIntArray4906[i_1065_]);
											int i_1162_ = (Class447.anIntArray4921[i_1065_]);
											int i_1163_ = (((aShortArray9467[i_1154_] * i_1161_) + (aShortArray9500[i_1154_] * i_1162_) + 16383) >> 14);
											aShortArray9467[i_1154_] = (short) ((((aShortArray9467[i_1154_]) * i_1162_) - ((aShortArray9500[i_1154_]) * i_1161_) + 16383) >> 14);
											aShortArray9500[i_1154_] = (short) i_1163_;
										}
									}
								}
							}
						}
					}
					method8679();
				}
			}
		} else if (i == 3) {
			if (is_1068_ != null) {
				int i_1164_ = is_1068_[9] << 4;
				int i_1165_ = is_1068_[10] << 4;
				int i_1166_ = is_1068_[11] << 4;
				int i_1167_ = is_1068_[12] << 4;
				int i_1168_ = is_1068_[13] << 4;
				int i_1169_ = is_1068_[14] << 4;
				if (aBool9523) {
					int i_1170_ = ((is_1068_[0] * anInt9520 + is_1068_[3] * anInt9521 + is_1068_[6] * anInt9522 + 8192) >> 14);
					int i_1171_ = ((is_1068_[1] * anInt9520 + is_1068_[4] * anInt9521 + is_1068_[7] * anInt9522 + 8192) >> 14);
					int i_1172_ = ((is_1068_[2] * anInt9520 + is_1068_[5] * anInt9521 + is_1068_[8] * anInt9522 + 8192) >> 14);
					i_1170_ += i_1167_;
					i_1171_ += i_1168_;
					i_1172_ += i_1169_;
					anInt9520 = i_1170_;
					anInt9521 = i_1171_;
					anInt9522 = i_1172_;
					aBool9523 = false;
				}
				int i_1173_ = i_1064_ << 15 >> 7;
				int i_1174_ = i_1065_ << 15 >> 7;
				int i_1175_ = i_1066_ << 15 >> 7;
				int i_1176_ = i_1173_ * -anInt9520 + 8192 >> 14;
				int i_1177_ = i_1174_ * -anInt9521 + 8192 >> 14;
				int i_1178_ = i_1175_ * -anInt9522 + 8192 >> 14;
				int i_1179_ = i_1176_ + anInt9520;
				int i_1180_ = i_1177_ + anInt9521;
				int i_1181_ = i_1178_ + anInt9522;
				int[] is_1182_ = new int[9];
				is_1182_[0] = i_1173_ * is_1068_[0] + 8192 >> 14;
				is_1182_[1] = i_1173_ * is_1068_[3] + 8192 >> 14;
				is_1182_[2] = i_1173_ * is_1068_[6] + 8192 >> 14;
				is_1182_[3] = i_1174_ * is_1068_[1] + 8192 >> 14;
				is_1182_[4] = i_1174_ * is_1068_[4] + 8192 >> 14;
				is_1182_[5] = i_1174_ * is_1068_[7] + 8192 >> 14;
				is_1182_[6] = i_1175_ * is_1068_[2] + 8192 >> 14;
				is_1182_[7] = i_1175_ * is_1068_[5] + 8192 >> 14;
				is_1182_[8] = i_1175_ * is_1068_[8] + 8192 >> 14;
				int i_1183_ = i_1173_ * i_1167_ + 8192 >> 14;
				int i_1184_ = i_1174_ * i_1168_ + 8192 >> 14;
				int i_1185_ = i_1175_ * i_1169_ + 8192 >> 14;
				i_1183_ += i_1179_;
				i_1184_ += i_1180_;
				i_1185_ += i_1181_;
				int[] is_1186_ = new int[9];
				for (int i_1187_ = 0; i_1187_ < 3; i_1187_++) {
					for (int i_1188_ = 0; i_1188_ < 3; i_1188_++) {
						int i_1189_ = 0;
						for (int i_1190_ = 0; i_1190_ < 3; i_1190_++)
							i_1189_ += (is_1068_[i_1187_ * 3 + i_1190_] * is_1182_[i_1188_ + i_1190_ * 3]);
						is_1186_[i_1187_ * 3 + i_1188_] = i_1189_ + 8192 >> 14;
					}
				}
				int i_1191_ = ((is_1068_[0] * i_1183_ + is_1068_[1] * i_1184_ + is_1068_[2] * i_1185_ + 8192) >> 14);
				int i_1192_ = ((is_1068_[3] * i_1183_ + is_1068_[4] * i_1184_ + is_1068_[5] * i_1185_ + 8192) >> 14);
				int i_1193_ = ((is_1068_[6] * i_1183_ + is_1068_[7] * i_1184_ + is_1068_[8] * i_1185_ + 8192) >> 14);
				i_1191_ += i_1164_;
				i_1192_ += i_1165_;
				i_1193_ += i_1166_;
				for (int i_1194_ = 0; i_1194_ < i_1069_; i_1194_++) {
					int i_1195_ = is[i_1194_];
					if (i_1195_ < anIntArrayArray9460.length) {
						int[] is_1196_ = anIntArrayArray9460[i_1195_];
						for (int i_1197_ = 0; i_1197_ < is_1196_.length; i_1197_++) {
							int i_1198_ = is_1196_[i_1197_];
							if (aShortArray9461 == null || (i_1067_ & aShortArray9461[i_1198_]) != 0) {
								int i_1199_ = ((is_1186_[0] * anIntArray9524[i_1198_] + is_1186_[1] * anIntArray9458[i_1198_] + is_1186_[2] * anIntArray9493[i_1198_] + 8192) >> 14);
								int i_1200_ = ((is_1186_[3] * anIntArray9524[i_1198_] + is_1186_[4] * anIntArray9458[i_1198_] + is_1186_[5] * anIntArray9493[i_1198_] + 8192) >> 14);
								int i_1201_ = ((is_1186_[6] * anIntArray9524[i_1198_] + is_1186_[7] * anIntArray9458[i_1198_] + is_1186_[8] * anIntArray9493[i_1198_] + 8192) >> 14);
								i_1199_ += i_1191_;
								i_1200_ += i_1192_;
								i_1201_ += i_1193_;
								anIntArray9524[i_1198_] = i_1199_;
								anIntArray9458[i_1198_] = i_1200_;
								anIntArray9493[i_1198_] = i_1201_;
							}
						}
					}
				}
			} else {
				for (int i_1202_ = 0; i_1202_ < i_1069_; i_1202_++) {
					int i_1203_ = is[i_1202_];
					if (i_1203_ < anIntArrayArray9460.length) {
						int[] is_1204_ = anIntArrayArray9460[i_1203_];
						for (int i_1205_ = 0; i_1205_ < is_1204_.length; i_1205_++) {
							int i_1206_ = is_1204_[i_1205_];
							if (aShortArray9461 == null || (i_1067_ & aShortArray9461[i_1206_]) != 0) {
								anIntArray9524[i_1206_] -= anInt9520;
								anIntArray9458[i_1206_] -= anInt9521;
								anIntArray9493[i_1206_] -= anInt9522;
								anIntArray9524[i_1206_] = anIntArray9524[i_1206_] * i_1064_ >> 7;
								anIntArray9458[i_1206_] = anIntArray9458[i_1206_] * i_1065_ >> 7;
								anIntArray9493[i_1206_] = anIntArray9493[i_1206_] * i_1066_ >> 7;
								anIntArray9524[i_1206_] += anInt9520;
								anIntArray9458[i_1206_] += anInt9521;
								anIntArray9493[i_1206_] += anInt9522;
							}
						}
					}
				}
			}
		} else if (i == 5) {
			if (anIntArrayArray9480 != null) {
				boolean bool_1207_ = false;
				for (int i_1208_ = 0; i_1208_ < i_1069_; i_1208_++) {
					int i_1209_ = is[i_1208_];
					if (i_1209_ < anIntArrayArray9480.length) {
						int[] is_1210_ = anIntArrayArray9480[i_1209_];
						for (int i_1211_ = 0; i_1211_ < is_1210_.length; i_1211_++) {
							int i_1212_ = is_1210_[i_1211_];
							if (aShortArray9481 == null || (i_1067_ & aShortArray9481[i_1212_]) != 0) {
								int i_1213_ = ((aByteArray9448[i_1212_] & 0xff) + i_1064_ * 8);
								if (i_1213_ < 0)
									i_1213_ = 0;
								else if (i_1213_ > 255)
									i_1213_ = 255;
								aByteArray9448[i_1212_] = (byte) i_1213_;
							}
						}
						bool_1207_ = bool_1207_ | is_1210_.length > 0;
					}
				}
				if (bool_1207_) {
					if (aClass372Array9510 != null) {
						for (int i_1214_ = 0; i_1214_ < anInt9509; i_1214_++) {
							Class372 class372 = aClass372Array9510[i_1214_];
							Class346 class346 = aClass346Array9511[i_1214_];
							class346.anInt3686 = (class346.anInt3686 & 0xffffff | 255 - (aByteArray9448[class372.anInt3889] & 0xff) << 24);
						}
					}
					method8678();
				}
			}
		} else if (i == 7) {
			if (anIntArrayArray9480 != null) {
				boolean bool_1215_ = false;
				for (int i_1216_ = 0; i_1216_ < i_1069_; i_1216_++) {
					int i_1217_ = is[i_1216_];
					if (i_1217_ < anIntArrayArray9480.length) {
						int[] is_1218_ = anIntArrayArray9480[i_1217_];
						for (int i_1219_ = 0; i_1219_ < is_1218_.length; i_1219_++) {
							int i_1220_ = is_1218_[i_1219_];
							if (aShortArray9481 == null || (i_1067_ & aShortArray9481[i_1220_]) != 0) {
								int i_1221_ = aShortArray9490[i_1220_] & 0xffff;
								int i_1222_ = i_1221_ >> 10 & 0x3f;
								int i_1223_ = i_1221_ >> 7 & 0x7;
								int i_1224_ = i_1221_ & 0x7f;
								i_1222_ = i_1222_ + i_1064_ & 0x3f;
								i_1223_ += i_1065_ / 4;
								if (i_1223_ < 0)
									i_1223_ = 0;
								else if (i_1223_ > 7)
									i_1223_ = 7;
								i_1224_ += i_1066_;
								if (i_1224_ < 0)
									i_1224_ = 0;
								else if (i_1224_ > 127)
									i_1224_ = 127;
								aShortArray9490[i_1220_] = (short) (i_1222_ << 10 | i_1223_ << 7 | i_1224_);
							}
						}
						bool_1215_ = bool_1215_ | is_1218_.length > 0;
					}
				}
				if (bool_1215_) {
					if (aClass372Array9510 != null) {
						for (int i_1225_ = 0; i_1225_ < anInt9509; i_1225_++) {
							Class372 class372 = aClass372Array9510[i_1225_];
							Class346 class346 = aClass346Array9511[i_1225_];
							class346.anInt3686 = (class346.anInt3686 & ~0xffffff | (ColourUtils.anIntArray8309[(aShortArray9490[class372.anInt3889] & 0xffff)]) & 0xffffff);
						}
					}
					method8678();
				}
			}
		} else if (i == 8) {
			if (anIntArrayArray9451 != null) {
				for (int i_1226_ = 0; i_1226_ < i_1069_; i_1226_++) {
					int i_1227_ = is[i_1226_];
					if (i_1227_ < anIntArrayArray9451.length) {
						int[] is_1228_ = anIntArrayArray9451[i_1227_];
						for (int i_1229_ = 0; i_1229_ < is_1228_.length; i_1229_++) {
							Class346 class346 = aClass346Array9511[is_1228_[i_1229_]];
							class346.anInt3685 += i_1064_;
							class346.anInt3682 += i_1065_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (anIntArrayArray9451 != null) {
				for (int i_1230_ = 0; i_1230_ < i_1069_; i_1230_++) {
					int i_1231_ = is[i_1230_];
					if (i_1231_ < anIntArrayArray9451.length) {
						int[] is_1232_ = anIntArrayArray9451[i_1231_];
						for (int i_1233_ = 0; i_1233_ < is_1232_.length; i_1233_++) {
							Class346 class346 = aClass346Array9511[is_1232_[i_1233_]];
							class346.anInt3683 = class346.anInt3683 * i_1064_ >> 7;
							class346.anInt3684 = class346.anInt3684 * i_1065_ >> 7;
						}
					}
				}
			}
		} else if (i == 9) {
			if (anIntArrayArray9451 != null) {
				for (int i_1234_ = 0; i_1234_ < i_1069_; i_1234_++) {
					int i_1235_ = is[i_1234_];
					if (i_1235_ < anIntArrayArray9451.length) {
						int[] is_1236_ = anIntArrayArray9451[i_1235_];
						for (int i_1237_ = 0; i_1237_ < is_1236_.length; i_1237_++) {
							Class346 class346 = aClass346Array9511[is_1236_[i_1237_]];
							class346.anInt3687 = class346.anInt3687 + i_1064_ & 0x3fff;
						}
					}
				}
			}
		}
	}

	public void method2619(Class433 class433, Class178 class178, int i) {
		if (aClass351_9474 != null)
			aClass351_9474.method4641();
		if (class178 != null)
			class178.aBool1945 = false;
		if (anInt9462 != 0) {
			Class443 class443 = aClass167_Sub3_9450.aClass443_9580;
			Class443 class443_1238_ = aClass167_Sub3_9450.aClass443_9570;
			Class443 class443_1239_ = aClass167_Sub3_9450.aClass443_9643;
			class443_1238_.method5359(class433);
			class443_1239_.method5339(class443_1238_);
			class443_1239_.method5390(aClass167_Sub3_9450.aClass443_9584);
			if (!aBool9471)
				method8681();
			float[] fs = aClass167_Sub3_9450.aFloatArray9546;
			class443_1238_.method5346(0.0F, (float) anInt9478, 0.0F, fs);
			float f = fs[0];
			float f_1240_ = fs[1];
			float f_1241_ = fs[2];
			class443_1238_.method5346(0.0F, (float) anInt9495, 0.0F, fs);
			float f_1242_ = fs[0];
			float f_1243_ = fs[1];
			float f_1244_ = fs[2];
			for (int i_1245_ = 0; i_1245_ < 6; i_1245_++) {
				float[] fs_1246_ = aClass167_Sub3_9450.aFloatArrayArray9702[i_1245_];
				float f_1247_ = (fs_1246_[0] * f + fs_1246_[1] * f_1240_ + fs_1246_[2] * f_1241_ + fs_1246_[3] + (float) anInt9492);
				float f_1248_ = (fs_1246_[0] * f_1242_ + fs_1246_[1] * f_1243_ + fs_1246_[2] * f_1244_ + fs_1246_[3] + (float) anInt9492);
				if (f_1247_ < 0.0F && f_1248_ < 0.0F)
					return;
			}
			if (class178 != null) {
				boolean bool = false;
				boolean bool_1249_ = true;
				int i_1250_ = anInt9496 + anInt9497 >> 1;
				int i_1251_ = anInt9498 + anInt9499 >> 1;
				int i_1252_ = i_1250_;
				int i_1253_ = anInt9478;
				int i_1254_ = i_1251_;
				float f_1255_ = (class443_1239_.aFloatArray4878[0] * (float) i_1252_ + class443_1239_.aFloatArray4878[4] * (float) i_1253_ + class443_1239_.aFloatArray4878[8] * (float) i_1254_ + class443_1239_.aFloatArray4878[12]);
				float f_1256_ = (class443_1239_.aFloatArray4878[1] * (float) i_1252_ + class443_1239_.aFloatArray4878[5] * (float) i_1253_ + class443_1239_.aFloatArray4878[9] * (float) i_1254_ + class443_1239_.aFloatArray4878[13]);
				float f_1257_ = (class443_1239_.aFloatArray4878[2] * (float) i_1252_ + class443_1239_.aFloatArray4878[6] * (float) i_1253_ + class443_1239_.aFloatArray4878[10] * (float) i_1254_ + class443_1239_.aFloatArray4878[14]);
				float f_1258_ = (class443_1239_.aFloatArray4878[3] * (float) i_1252_ + class443_1239_.aFloatArray4878[7] * (float) i_1253_ + class443_1239_.aFloatArray4878[11] * (float) i_1254_ + class443_1239_.aFloatArray4878[15]);
				if (f_1257_ >= -f_1258_) {
					class178.anInt1941 = (int) (aClass167_Sub3_9450.aFloat9536 + (aClass167_Sub3_9450.aFloat9588 * f_1255_ / f_1258_));
					class178.anInt1942 = (int) (aClass167_Sub3_9450.aFloat9589 + (aClass167_Sub3_9450.aFloat9590 * f_1256_ / f_1258_));
				} else
					bool = true;
				i_1252_ = i_1250_;
				i_1253_ = anInt9495;
				i_1254_ = i_1251_;
				float f_1259_ = (class443_1239_.aFloatArray4878[0] * (float) i_1252_ + class443_1239_.aFloatArray4878[4] * (float) i_1253_ + class443_1239_.aFloatArray4878[8] * (float) i_1254_ + class443_1239_.aFloatArray4878[12]);
				float f_1260_ = (class443_1239_.aFloatArray4878[1] * (float) i_1252_ + class443_1239_.aFloatArray4878[5] * (float) i_1253_ + class443_1239_.aFloatArray4878[9] * (float) i_1254_ + class443_1239_.aFloatArray4878[13]);
				float f_1261_ = (class443_1239_.aFloatArray4878[2] * (float) i_1252_ + class443_1239_.aFloatArray4878[6] * (float) i_1253_ + class443_1239_.aFloatArray4878[10] * (float) i_1254_ + class443_1239_.aFloatArray4878[14]);
				float f_1262_ = (class443_1239_.aFloatArray4878[3] * (float) i_1252_ + class443_1239_.aFloatArray4878[7] * (float) i_1253_ + class443_1239_.aFloatArray4878[11] * (float) i_1254_ + class443_1239_.aFloatArray4878[15]);
				if (f_1261_ >= -f_1262_) {
					class178.anInt1943 = (int) (aClass167_Sub3_9450.aFloat9536 + (aClass167_Sub3_9450.aFloat9588 * f_1259_ / f_1262_));
					class178.anInt1944 = (int) (aClass167_Sub3_9450.aFloat9589 + (aClass167_Sub3_9450.aFloat9590 * f_1260_ / f_1262_));
				} else
					bool = true;
				if (bool) {
					if (f_1257_ < -f_1258_ && f_1261_ < -f_1262_)
						bool_1249_ = false;
					else if (f_1257_ < -f_1258_) {
						float f_1263_ = (f_1257_ + f_1258_) / (f_1261_ + f_1262_) - 1.0F;
						float f_1264_ = f_1255_ + f_1263_ * (f_1259_ - f_1255_);
						float f_1265_ = f_1256_ + f_1263_ * (f_1260_ - f_1256_);
						float f_1266_ = f_1258_ + f_1263_ * (f_1262_ - f_1258_);
						class178.anInt1941 = (int) (aClass167_Sub3_9450.aFloat9536 + (aClass167_Sub3_9450.aFloat9588 * f_1264_ / f_1266_));
						class178.anInt1942 = (int) (aClass167_Sub3_9450.aFloat9589 + (aClass167_Sub3_9450.aFloat9590 * f_1265_ / f_1266_));
					} else if (f_1261_ < -f_1262_) {
						float f_1267_ = (f_1261_ + f_1262_) / (f_1257_ + f_1258_) - 1.0F;
						float f_1268_ = f_1259_ + f_1267_ * (f_1255_ - f_1259_);
						float f_1269_ = f_1260_ + f_1267_ * (f_1256_ - f_1260_);
						float f_1270_ = f_1262_ + f_1267_ * (f_1258_ - f_1262_);
						class178.anInt1943 = (int) (aClass167_Sub3_9450.aFloat9536 + (aClass167_Sub3_9450.aFloat9588 * f_1268_ / f_1270_));
						class178.anInt1944 = (int) (aClass167_Sub3_9450.aFloat9589 + (aClass167_Sub3_9450.aFloat9590 * f_1269_ / f_1270_));
					}
				}
				if (bool_1249_) {
					if (f_1257_ / f_1258_ > f_1261_ / f_1262_) {
						float f_1271_ = (f_1255_ + (class443.aFloatArray4878[0] * (float) anInt9492) + class443.aFloatArray4878[12]);
						float f_1272_ = (f_1258_ + (class443.aFloatArray4878[3] * (float) anInt9492) + class443.aFloatArray4878[15]);
						class178.anInt1940 = (int) (aClass167_Sub3_9450.aFloat9536 - (float) class178.anInt1941 + (aClass167_Sub3_9450.aFloat9588 * f_1271_ / f_1272_));
					} else {
						float f_1273_ = (f_1259_ + (class443.aFloatArray4878[0] * (float) anInt9492) + class443.aFloatArray4878[12]);
						float f_1274_ = (f_1262_ + (class443.aFloatArray4878[3] * (float) anInt9492) + class443.aFloatArray4878[15]);
						class178.anInt1940 = (int) (aClass167_Sub3_9450.aFloat9536 - (float) class178.anInt1943 + (aClass167_Sub3_9450.aFloat9588 * f_1273_ / f_1274_));
					}
					class178.aBool1945 = true;
				}
			}
			aClass167_Sub3_9450.method8711(i);
			method8687(class433);
			aClass167_Sub3_9450.method8711(0);
			class443_1238_.method5359(class433);
			class443_1238_.method5390(aClass167_Sub3_9450.aClass443_9698);
			method8682(class443_1238_);
		}
	}

	public boolean method2625(int i, int i_1275_, Class433 class433, boolean bool, int i_1276_) {
		return method8685(i, i_1275_, 0, 0, class433, bool, i_1276_);
	}

	public void method2520(Class433 class433) {
		Class443 class443 = aClass167_Sub3_9450.aClass443_9570;
		class443.method5359(class433);
		if (aClass172Array9517 != null) {
			for (int i = 0; i < aClass172Array9517.length; i++) {
				Class172 class172 = aClass172Array9517[i];
				Class172 class172_1277_ = class172;
				if (class172.aClass172_1910 != null)
					class172_1277_ = class172.aClass172_1910;
				class172_1277_.anInt1913 = ((int) (class443.aFloatArray4878[12] + ((class443.aFloatArray4878[0] * (float) anIntArray9524[(class172.anInt1909 * -1506968299)]) + (class443.aFloatArray4878[4] * (float) (anIntArray9458[(class172.anInt1909 * -1506968299)])) + (class443.aFloatArray4878[8] * (float) (anIntArray9493[(class172.anInt1909 * -1506968299)])))) * -1971428173);
				class172_1277_.anInt1914 = ((int) (class443.aFloatArray4878[13] + ((class443.aFloatArray4878[1] * (float) anIntArray9524[(class172.anInt1909 * -1506968299)]) + (class443.aFloatArray4878[5] * (float) (anIntArray9458[(class172.anInt1909 * -1506968299)])) + (class443.aFloatArray4878[9] * (float) (anIntArray9493[(class172.anInt1909 * -1506968299)])))) * 179150469);
				class172_1277_.anInt1915 = ((int) (class443.aFloatArray4878[14] + ((class443.aFloatArray4878[2] * (float) anIntArray9524[(class172.anInt1909 * -1506968299)]) + (class443.aFloatArray4878[6] * (float) (anIntArray9458[(class172.anInt1909 * -1506968299)])) + (class443.aFloatArray4878[10] * (float) (anIntArray9493[(class172.anInt1909 * -1506968299)])))) * -26173683);
				class172_1277_.anInt1907 = ((int) (class443.aFloatArray4878[12] + ((class443.aFloatArray4878[0] * (float) anIntArray9524[(class172.anInt1916 * -1724466837)]) + (class443.aFloatArray4878[4] * (float) (anIntArray9458[(class172.anInt1916 * -1724466837)])) + (class443.aFloatArray4878[8] * (float) (anIntArray9493[(class172.anInt1916 * -1724466837)])))) * 163461589);
				class172_1277_.anInt1917 = ((int) (class443.aFloatArray4878[13] + ((class443.aFloatArray4878[1] * (float) anIntArray9524[(class172.anInt1916 * -1724466837)]) + (class443.aFloatArray4878[5] * (float) (anIntArray9458[(class172.anInt1916 * -1724466837)])) + (class443.aFloatArray4878[9] * (float) (anIntArray9493[(class172.anInt1916 * -1724466837)])))) * 555769531);
				class172_1277_.anInt1918 = ((int) (class443.aFloatArray4878[14] + ((class443.aFloatArray4878[2] * (float) anIntArray9524[(class172.anInt1916 * -1724466837)]) + (class443.aFloatArray4878[6] * (float) (anIntArray9458[(class172.anInt1916 * -1724466837)])) + (class443.aFloatArray4878[10] * (float) (anIntArray9493[(class172.anInt1916 * -1724466837)])))) * -379440279);
				class172_1277_.anInt1919 = ((int) (class443.aFloatArray4878[12] + ((class443.aFloatArray4878[0] * (float) anIntArray9524[(class172.anInt1911 * -767867943)]) + (class443.aFloatArray4878[4] * (float) (anIntArray9458[(class172.anInt1911 * -767867943)])) + (class443.aFloatArray4878[8] * (float) (anIntArray9493[(class172.anInt1911 * -767867943)])))) * -767320321);
				class172_1277_.anInt1920 = ((int) (class443.aFloatArray4878[13] + ((class443.aFloatArray4878[1] * (float) anIntArray9524[(class172.anInt1911 * -767867943)]) + (class443.aFloatArray4878[5] * (float) (anIntArray9458[(class172.anInt1911 * -767867943)])) + (class443.aFloatArray4878[9] * (float) (anIntArray9493[(class172.anInt1911 * -767867943)])))) * 1270728077);
				class172_1277_.anInt1921 = ((int) (class443.aFloatArray4878[14] + ((class443.aFloatArray4878[2] * (float) anIntArray9524[(class172.anInt1911 * -767867943)]) + (class443.aFloatArray4878[6] * (float) (anIntArray9458[(class172.anInt1911 * -767867943)])) + (class443.aFloatArray4878[10] * (float) (anIntArray9493[(class172.anInt1911 * -767867943)])))) * -2080843121);
			}
		}
		if (aClass156Array9464 != null) {
			for (int i = 0; i < aClass156Array9464.length; i++) {
				Class156 class156 = aClass156Array9464[i];
				Class156 class156_1278_ = class156;
				if (class156.aClass156_1735 != null)
					class156_1278_ = class156.aClass156_1735;
				if (class156.aClass443_1740 != null)
					class156.aClass443_1740.method5339(class443);
				else
					class156.aClass443_1740 = new Class443(class443);
				class156_1278_.anInt1734 = ((int) (class443.aFloatArray4878[12] + ((class443.aFloatArray4878[0] * (float) anIntArray9524[(class156.anInt1738 * -986127555)]) + (class443.aFloatArray4878[4] * (float) (anIntArray9458[(class156.anInt1738 * -986127555)])) + (class443.aFloatArray4878[8] * (float) (anIntArray9493[(class156.anInt1738 * -986127555)])))) * 1464786499);
				class156_1278_.anInt1737 = (int) (class443.aFloatArray4878[13] + ((class443.aFloatArray4878[1] * (float) (anIntArray9524[class156.anInt1738 * -986127555])) + (class443.aFloatArray4878[5] * (float) anIntArray9458[(class156.anInt1738 * -986127555)]) + (class443.aFloatArray4878[9] * (float) (anIntArray9493[(class156.anInt1738 * -986127555)])))) * 524114341;
				class156_1278_.anInt1739 = ((int) (class443.aFloatArray4878[14] + ((class443.aFloatArray4878[2] * (float) anIntArray9524[(class156.anInt1738 * -986127555)]) + (class443.aFloatArray4878[6] * (float) (anIntArray9458[(class156.anInt1738 * -986127555)])) + (class443.aFloatArray4878[10] * (float) (anIntArray9493[(class156.anInt1738 * -986127555)])))) * -1766187741);
			}
		}
	}

	void method8694() {
		if (aBool9465) {
			aBool9465 = false;
			if (aClass172Array9517 == null && aClass156Array9464 == null && aClass372Array9510 == null && !Class345.method4540(anInt9473, anInt9452)) {
				boolean bool = false;
				boolean bool_1279_ = false;
				boolean bool_1280_ = false;
				if (anIntArray9524 != null && !Class345.method4510(anInt9473, anInt9452)) {
					if (aClass375_9483 == null || aClass375_9483.method4786()) {
						if (!aBool9471)
							method8681();
						bool = true;
					} else
						aBool9465 = true;
				}
				if (anIntArray9458 != null && !Class345.method4495(anInt9473, anInt9452)) {
					if (aClass375_9483 == null || aClass375_9483.method4786()) {
						if (!aBool9471)
							method8681();
						bool_1279_ = true;
					} else
						aBool9465 = true;
				}
				if (anIntArray9493 != null && !Class345.method4512(anInt9473, anInt9452)) {
					if (aClass375_9483 == null || aClass375_9483.method4786()) {
						if (!aBool9471)
							method8681();
						bool_1280_ = true;
					} else
						aBool9465 = true;
				}
				if (bool)
					anIntArray9524 = null;
				if (bool_1279_)
					anIntArray9458 = null;
				if (bool_1280_)
					anIntArray9493 = null;
			}
			if (aShortArray9506 != null && anIntArray9524 == null && anIntArray9458 == null && anIntArray9493 == null) {
				aShortArray9506 = null;
				anIntArray9468 = null;
			}
			while_52_: do {
				if (aByteArray9512 != null && !Class345.method4513(anInt9473, anInt9452)) {
					do {
						if ((anInt9452 & 0x37) != 0) {
							if (aClass375_9485 != null && !aClass375_9485.method4786())
								break;
						} else if (aClass375_9484 != null && !aClass375_9484.method4786())
							break;
						aShortArray9467 = null;
						aShortArray9466 = null;
						aShortArray9500 = null;
						aByteArray9512 = null;
						break while_52_;
					} while (false);
					aBool9465 = true;
				}
			} while (false);
			if (aShortArray9490 != null && !Class345.method4514(anInt9473, anInt9452)) {
				if (aClass375_9484 == null || aClass375_9484.method4786())
					aShortArray9490 = null;
				else
					aBool9465 = true;
			}
			if (aByteArray9448 != null && !Class345.method4503(anInt9473, anInt9452)) {
				if (aClass375_9484 == null || aClass375_9484.method4786())
					aByteArray9448 = null;
				else
					aBool9465 = true;
			}
			if (aFloatArray9469 != null && !Class345.method4516(anInt9473, anInt9452)) {
				if (aClass375_9486 == null || aClass375_9486.method4786()) {
					aFloatArray9470 = null;
					aFloatArray9469 = null;
				} else
					aBool9465 = true;
			}
			if (aShortArray9479 != null && !Class345.method4521(anInt9473, anInt9452)) {
				if (aClass375_9484 == null || aClass375_9484.method4786())
					aShortArray9479 = null;
				else
					aBool9465 = true;
			}
			if (aShortArray9463 != null && !Class345.method4520(anInt9473, anInt9452)) {
				if ((aClass348_9482 == null || aClass348_9482.method4585()) && (aClass375_9484 == null || aClass375_9484.method4786())) {
					aShortArray9488 = null;
					aShortArray9477 = null;
					aShortArray9463 = null;
				} else
					aBool9465 = true;
			}
			if (aShortArray9515 != null) {
				if (aClass375_9483 == null || aClass375_9483.method4786())
					aShortArray9515 = null;
				else
					aBool9465 = true;
			}
			if (aShortArray9518 != null) {
				if (aClass375_9484 == null || aClass375_9484.method4786())
					aShortArray9518 = null;
				else
					aBool9465 = true;
			}
			if (anIntArrayArray9480 != null && !Class345.method4517(anInt9473, anInt9452)) {
				anIntArrayArray9480 = null;
				aShortArray9481 = null;
			}
			if (anIntArrayArray9460 != null && !Class345.method4518(anInt9473, anInt9452)) {
				anIntArrayArray9460 = null;
				aShortArray9461 = null;
			}
			if (anIntArrayArray9451 != null && !Class345.method4519(anInt9473, anInt9452))
				anIntArrayArray9451 = null;
			if (anIntArray9507 != null && (anInt9473 & 0x800) == 0 && (anInt9473 & 0x40000) == 0) {
				anIntArray9507 = null;
				anIntArray9504 = null;
				anIntArray9503 = null;
			}
		}
	}

	public Class536_Sub18_Sub7 method2556(Class536_Sub18_Sub7 class536_sub18_sub7) {
		if (anInt9462 == 0)
			return null;
		if (!aBool9471)
			method8681();
		int i;
		int i_1281_;
		if (aClass167_Sub3_9450.anInt9634 > 0) {
			i = (anInt9496 - (anInt9495 * aClass167_Sub3_9450.anInt9634 >> 8) >> aClass167_Sub3_9450.anInt9633);
			i_1281_ = anInt9497 - (anInt9478 * aClass167_Sub3_9450.anInt9634 >> 8) >> aClass167_Sub3_9450.anInt9633;
		} else {
			i = (anInt9496 - (anInt9478 * aClass167_Sub3_9450.anInt9634 >> 8) >> aClass167_Sub3_9450.anInt9633);
			i_1281_ = anInt9497 - (anInt9495 * aClass167_Sub3_9450.anInt9634 >> 8) >> aClass167_Sub3_9450.anInt9633;
		}
		int i_1282_;
		int i_1283_;
		if (aClass167_Sub3_9450.anInt9635 > 0) {
			i_1282_ = anInt9498 - (anInt9495 * aClass167_Sub3_9450.anInt9635 >> 8) >> aClass167_Sub3_9450.anInt9633;
			i_1283_ = anInt9499 - (anInt9478 * aClass167_Sub3_9450.anInt9635 >> 8) >> aClass167_Sub3_9450.anInt9633;
		} else {
			i_1282_ = anInt9498 - (anInt9478 * aClass167_Sub3_9450.anInt9635 >> 8) >> aClass167_Sub3_9450.anInt9633;
			i_1283_ = anInt9499 - (anInt9495 * aClass167_Sub3_9450.anInt9635 >> 8) >> aClass167_Sub3_9450.anInt9633;
		}
		int i_1284_ = i_1281_ - i + 1;
		int i_1285_ = i_1283_ - i_1282_ + 1;
		Class536_Sub18_Sub7_Sub1 class536_sub18_sub7_sub1 = (Class536_Sub18_Sub7_Sub1) class536_sub18_sub7;
		Class536_Sub18_Sub7_Sub1 class536_sub18_sub7_sub1_1286_;
		if (class536_sub18_sub7_sub1 != null && class536_sub18_sub7_sub1.method10972(i_1284_, i_1285_)) {
			class536_sub18_sub7_sub1_1286_ = class536_sub18_sub7_sub1;
			class536_sub18_sub7_sub1_1286_.method10980();
		} else
			class536_sub18_sub7_sub1_1286_ = new Class536_Sub18_Sub7_Sub1(aClass167_Sub3_9450, i_1284_, i_1285_);
		class536_sub18_sub7_sub1_1286_.method10973(i, i_1282_, i_1281_, i_1283_);
		method8686(class536_sub18_sub7_sub1_1286_);
		return class536_sub18_sub7_sub1_1286_;
	}

	public void method2465(int i) {
		if (aClass375_9483 != null)
			aClass375_9483.aBool3909 = Class345.method4506(i, anInt9452);
		if (aClass375_9486 != null)
			aClass375_9486.aBool3909 = Class345.method4508(i, anInt9452);
		if (aClass375_9484 != null)
			aClass375_9484.aBool3909 = Class345.method4558(i, anInt9452);
		if (aClass375_9485 != null)
			aClass375_9485.aBool3909 = Class345.method4531(i, anInt9452);
		anInt9473 = i;
		if (aClass373_9505 != null && (anInt9473 & 0x10000) == 0) {
			aShortArray9500 = aClass373_9505.aShortArray3896;
			aShortArray9466 = aClass373_9505.aShortArray3895;
			aShortArray9467 = aClass373_9505.aShortArray3897;
			aByteArray9512 = aClass373_9505.aByteArray3898;
			aClass373_9505 = null;
		}
		aBool9465 = true;
		method8694();
	}

	public Class536_Sub18_Sub7 method2558(Class536_Sub18_Sub7 class536_sub18_sub7) {
		if (anInt9462 == 0)
			return null;
		if (!aBool9471)
			method8681();
		int i;
		int i_1287_;
		if (aClass167_Sub3_9450.anInt9634 > 0) {
			i = (anInt9496 - (anInt9495 * aClass167_Sub3_9450.anInt9634 >> 8) >> aClass167_Sub3_9450.anInt9633);
			i_1287_ = anInt9497 - (anInt9478 * aClass167_Sub3_9450.anInt9634 >> 8) >> aClass167_Sub3_9450.anInt9633;
		} else {
			i = (anInt9496 - (anInt9478 * aClass167_Sub3_9450.anInt9634 >> 8) >> aClass167_Sub3_9450.anInt9633);
			i_1287_ = anInt9497 - (anInt9495 * aClass167_Sub3_9450.anInt9634 >> 8) >> aClass167_Sub3_9450.anInt9633;
		}
		int i_1288_;
		int i_1289_;
		if (aClass167_Sub3_9450.anInt9635 > 0) {
			i_1288_ = anInt9498 - (anInt9495 * aClass167_Sub3_9450.anInt9635 >> 8) >> aClass167_Sub3_9450.anInt9633;
			i_1289_ = anInt9499 - (anInt9478 * aClass167_Sub3_9450.anInt9635 >> 8) >> aClass167_Sub3_9450.anInt9633;
		} else {
			i_1288_ = anInt9498 - (anInt9478 * aClass167_Sub3_9450.anInt9635 >> 8) >> aClass167_Sub3_9450.anInt9633;
			i_1289_ = anInt9499 - (anInt9495 * aClass167_Sub3_9450.anInt9635 >> 8) >> aClass167_Sub3_9450.anInt9633;
		}
		int i_1290_ = i_1287_ - i + 1;
		int i_1291_ = i_1289_ - i_1288_ + 1;
		Class536_Sub18_Sub7_Sub1 class536_sub18_sub7_sub1 = (Class536_Sub18_Sub7_Sub1) class536_sub18_sub7;
		Class536_Sub18_Sub7_Sub1 class536_sub18_sub7_sub1_1292_;
		if (class536_sub18_sub7_sub1 != null && class536_sub18_sub7_sub1.method10972(i_1290_, i_1291_)) {
			class536_sub18_sub7_sub1_1292_ = class536_sub18_sub7_sub1;
			class536_sub18_sub7_sub1_1292_.method10980();
		} else
			class536_sub18_sub7_sub1_1292_ = new Class536_Sub18_Sub7_Sub1(aClass167_Sub3_9450, i_1290_, i_1291_);
		class536_sub18_sub7_sub1_1292_.method10973(i, i_1288_, i_1287_, i_1289_);
		method8686(class536_sub18_sub7_sub1_1292_);
		return class536_sub18_sub7_sub1_1292_;
	}

	public void method2464() {
		if (!aBool9453) {
			if (!aBool9471)
				method8681();
			anInt9501 = anInt9478;
			aBool9453 = true;
		}
	}

	public void method2560() {
		if (!aBool9453) {
			if (!aBool9471)
				method8681();
			anInt9501 = anInt9478;
			aBool9453 = true;
		}
	}

	public void method2553(int i) {
		if (aClass375_9483 != null)
			aClass375_9483.aBool3909 = Class345.method4506(i, anInt9452);
		if (aClass375_9486 != null)
			aClass375_9486.aBool3909 = Class345.method4508(i, anInt9452);
		if (aClass375_9484 != null)
			aClass375_9484.aBool3909 = Class345.method4558(i, anInt9452);
		if (aClass375_9485 != null)
			aClass375_9485.aBool3909 = Class345.method4531(i, anInt9452);
		anInt9473 = i;
		if (aClass373_9505 != null && (anInt9473 & 0x10000) == 0) {
			aShortArray9500 = aClass373_9505.aShortArray3896;
			aShortArray9466 = aClass373_9505.aShortArray3895;
			aShortArray9467 = aClass373_9505.aShortArray3897;
			aByteArray9512 = aClass373_9505.aByteArray3898;
			aClass373_9505 = null;
		}
		aBool9465 = true;
		method8694();
	}

	public int method2504() {
		if (!aBool9471)
			method8681();
		return anInt9492;
	}

	public int method2493() {
		if (!aBool9471)
			method8681();
		return anInt9492;
	}

	public int method2597() {
		if (!aBool9471)
			method8681();
		return anInt9491;
	}

	public int method2528() {
		if (!aBool9471)
			method8681();
		return anInt9496;
	}

	public boolean method2480() {
		if (aShortArray9479 == null)
			return true;
		for (int i = 0; i < aShortArray9479.length; i++) {
			if (aShortArray9479[i] != -1 && !(aClass167_Sub3_9450.aClass340_9561.method4453(aClass167_Sub3_9450.aClass174_1852.method2446(aShortArray9479[i], -859776503), -1)))
				return false;
		}
		return true;
	}

	public int method2471() {
		if (!aBool9471)
			method8681();
		return anInt9496;
	}

	boolean method2539() {
		if (anIntArrayArray9460 == null)
			return false;
		for (int i = 0; i < anInt9455; i++) {
			anIntArray9524[i] <<= 4;
			anIntArray9458[i] <<= 4;
			anIntArray9493[i] <<= 4;
		}
		anInt9520 = 0;
		anInt9521 = 0;
		anInt9522 = 0;
		return true;
	}

	public int method2570() {
		if (!aBool9471)
			method8681();
		return anInt9497;
	}

	public int method2591() {
		if (!aBool9471)
			method8681();
		return anInt9497;
	}

	public int method2622() {
		if (!aBool9471)
			method8681();
		return anInt9497;
	}

	void method2546(int i, int i_1293_, int i_1294_, int i_1295_) {
		if (i == 0) {
			int i_1296_ = 0;
			anInt9520 = 0;
			anInt9521 = 0;
			anInt9522 = 0;
			for (int i_1297_ = 0; i_1297_ < anInt9456; i_1297_++) {
				anInt9520 += anIntArray9524[i_1297_];
				anInt9521 += anIntArray9458[i_1297_];
				anInt9522 += anIntArray9493[i_1297_];
				i_1296_++;
			}
			if (i_1296_ > 0) {
				anInt9520 = anInt9520 / i_1296_ + i_1293_;
				anInt9521 = anInt9521 / i_1296_ + i_1294_;
				anInt9522 = anInt9522 / i_1296_ + i_1295_;
			} else {
				anInt9520 = i_1293_;
				anInt9521 = i_1294_;
				anInt9522 = i_1295_;
			}
		} else if (i == 1) {
			for (int i_1298_ = 0; i_1298_ < anInt9456; i_1298_++) {
				anIntArray9524[i_1298_] += i_1293_;
				anIntArray9458[i_1298_] += i_1294_;
				anIntArray9493[i_1298_] += i_1295_;
			}
		} else if (i == 2) {
			for (int i_1299_ = 0; i_1299_ < anInt9456; i_1299_++) {
				anIntArray9524[i_1299_] -= anInt9520;
				anIntArray9458[i_1299_] -= anInt9521;
				anIntArray9493[i_1299_] -= anInt9522;
				if (i_1295_ != 0) {
					int i_1300_ = Class447.anIntArray4906[i_1295_];
					int i_1301_ = Class447.anIntArray4921[i_1295_];
					int i_1302_ = ((anIntArray9458[i_1299_] * i_1300_ + anIntArray9524[i_1299_] * i_1301_ + 16383) >> 14);
					anIntArray9458[i_1299_] = (anIntArray9458[i_1299_] * i_1301_ - anIntArray9524[i_1299_] * i_1300_ + 16383) >> 14;
					anIntArray9524[i_1299_] = i_1302_;
				}
				if (i_1293_ != 0) {
					int i_1303_ = Class447.anIntArray4906[i_1293_];
					int i_1304_ = Class447.anIntArray4921[i_1293_];
					int i_1305_ = ((anIntArray9458[i_1299_] * i_1304_ - anIntArray9493[i_1299_] * i_1303_ + 16383) >> 14);
					anIntArray9493[i_1299_] = (anIntArray9458[i_1299_] * i_1303_ + anIntArray9493[i_1299_] * i_1304_ + 16383) >> 14;
					anIntArray9458[i_1299_] = i_1305_;
				}
				if (i_1294_ != 0) {
					int i_1306_ = Class447.anIntArray4906[i_1294_];
					int i_1307_ = Class447.anIntArray4921[i_1294_];
					int i_1308_ = ((anIntArray9493[i_1299_] * i_1306_ + anIntArray9524[i_1299_] * i_1307_ + 16383) >> 14);
					anIntArray9493[i_1299_] = (anIntArray9493[i_1299_] * i_1307_ - anIntArray9524[i_1299_] * i_1306_ + 16383) >> 14;
					anIntArray9524[i_1299_] = i_1308_;
				}
				anIntArray9524[i_1299_] += anInt9520;
				anIntArray9458[i_1299_] += anInt9521;
				anIntArray9493[i_1299_] += anInt9522;
			}
		} else if (i == 3) {
			for (int i_1309_ = 0; i_1309_ < anInt9456; i_1309_++) {
				anIntArray9524[i_1309_] -= anInt9520;
				anIntArray9458[i_1309_] -= anInt9521;
				anIntArray9493[i_1309_] -= anInt9522;
				anIntArray9524[i_1309_] = anIntArray9524[i_1309_] * i_1293_ / 128;
				anIntArray9458[i_1309_] = anIntArray9458[i_1309_] * i_1294_ / 128;
				anIntArray9493[i_1309_] = anIntArray9493[i_1309_] * i_1295_ / 128;
				anIntArray9524[i_1309_] += anInt9520;
				anIntArray9458[i_1309_] += anInt9521;
				anIntArray9493[i_1309_] += anInt9522;
			}
		} else if (i == 5) {
			for (int i_1310_ = 0; i_1310_ < anInt9472; i_1310_++) {
				int i_1311_ = (aByteArray9448[i_1310_] & 0xff) + i_1293_ * 8;
				if (i_1311_ < 0)
					i_1311_ = 0;
				else if (i_1311_ > 255)
					i_1311_ = 255;
				aByteArray9448[i_1310_] = (byte) i_1311_;
			}
			if (aClass372Array9510 != null) {
				for (int i_1312_ = 0; i_1312_ < anInt9509; i_1312_++) {
					Class372 class372 = aClass372Array9510[i_1312_];
					Class346 class346 = aClass346Array9511[i_1312_];
					class346.anInt3686 = (class346.anInt3686 & 0xffffff | (255 - (aByteArray9448[class372.anInt3889] & 0xff) << 24));
				}
			}
			method8678();
		} else if (i == 7) {
			for (int i_1313_ = 0; i_1313_ < anInt9472; i_1313_++) {
				int i_1314_ = aShortArray9490[i_1313_] & 0xffff;
				int i_1315_ = i_1314_ >> 10 & 0x3f;
				int i_1316_ = i_1314_ >> 7 & 0x7;
				int i_1317_ = i_1314_ & 0x7f;
				i_1315_ = i_1315_ + i_1293_ & 0x3f;
				i_1316_ += i_1294_ / 4;
				if (i_1316_ < 0)
					i_1316_ = 0;
				else if (i_1316_ > 7)
					i_1316_ = 7;
				i_1317_ += i_1295_;
				if (i_1317_ < 0)
					i_1317_ = 0;
				else if (i_1317_ > 127)
					i_1317_ = 127;
				aShortArray9490[i_1313_] = (short) (i_1315_ << 10 | i_1316_ << 7 | i_1317_);
			}
			if (aClass372Array9510 != null) {
				for (int i_1318_ = 0; i_1318_ < anInt9509; i_1318_++) {
					Class372 class372 = aClass372Array9510[i_1318_];
					Class346 class346 = aClass346Array9511[i_1318_];
					class346.anInt3686 = (class346.anInt3686 & ~0xffffff | ((ColourUtils.anIntArray8309[aShortArray9490[class372.anInt3889] & 0xffff]) & 0xffffff));
				}
			}
			method8678();
		} else if (i == 8) {
			for (int i_1319_ = 0; i_1319_ < anInt9509; i_1319_++) {
				Class346 class346 = aClass346Array9511[i_1319_];
				class346.anInt3685 += i_1293_;
				class346.anInt3682 += i_1294_;
			}
		} else if (i == 10) {
			for (int i_1320_ = 0; i_1320_ < anInt9509; i_1320_++) {
				Class346 class346 = aClass346Array9511[i_1320_];
				class346.anInt3683 = class346.anInt3683 * i_1293_ >> 7;
				class346.anInt3684 = class346.anInt3684 * i_1294_ >> 7;
			}
		} else if (i == 9) {
			for (int i_1321_ = 0; i_1321_ < anInt9509; i_1321_++) {
				Class346 class346 = aClass346Array9511[i_1321_];
				class346.anInt3687 = class346.anInt3687 + i_1293_ & 0x3fff;
			}
		}
	}

	void method2478() {
		/* empty */
	}

	public int method2564() {
		if (!aBool9471)
			method8681();
		return anInt9478;
	}

	public int method2576() {
		if (!aBool9471)
			method8681();
		return anInt9478;
	}

	public void method2474(int i, int i_1322_, int i_1323_) {
		for (int i_1324_ = 0; i_1324_ < anInt9456; i_1324_++) {
			if (i != 128)
				anIntArray9524[i_1324_] = anIntArray9524[i_1324_] * i >> 7;
			if (i_1322_ != 128)
				anIntArray9458[i_1324_] = anIntArray9458[i_1324_] * i_1322_ >> 7;
			if (i_1323_ != 128)
				anIntArray9493[i_1324_] = anIntArray9493[i_1324_] * i_1323_ >> 7;
		}
		method8677();
		aBool9471 = false;
	}

	short method8695(Class180 class180, int i, int i_1325_, long l, int i_1326_, int i_1327_, int i_1328_, int i_1329_, float f, float f_1330_) {
		int i_1331_ = anIntArray9468[i];
		int i_1332_ = anIntArray9468[i + 1];
		int i_1333_ = 0;
		for (int i_1334_ = i_1331_; i_1334_ < i_1332_; i_1334_++) {
			if (aShortArray9506[i_1334_] == 0) {
				i_1333_ = i_1334_;
				break;
			}
			int i_1335_ = (aShortArray9506[i_1334_] & 0xffff) - 1;
			if (aLongArray9513[i_1334_] == l)
				return (short) i_1335_;
		}
		aShortArray9506[i_1333_] = (short) (anInt9462 + 1);
		aLongArray9513[i_1333_] = l;
		aShortArray9518[anInt9462] = (short) i_1325_;
		aShortArray9515[anInt9462] = (short) i;
		aShortArray9500[anInt9462] = (short) i_1326_;
		aShortArray9466[anInt9462] = (short) i_1327_;
		aShortArray9467[anInt9462] = (short) i_1328_;
		aByteArray9512[anInt9462] = (byte) i_1329_;
		aFloatArray9469[anInt9462] = f;
		aFloatArray9470[anInt9462] = f_1330_;
		return (short) anInt9462++;
	}

	public int method2612() {
		if (!aBool9471)
			method8681();
		return anInt9495;
	}

	public int method2615() {
		if (!aBool9471)
			method8681();
		return anInt9495;
	}

	public int method2559() {
		if (!aBool9471)
			method8681();
		return anInt9495;
	}

	public void method2596(short i, short i_1336_) {
		Class174 class174 = aClass167_Sub3_9450.aClass174_1852;
		for (int i_1337_ = 0; i_1337_ < anInt9472; i_1337_++) {
			if (aShortArray9479[i_1337_] == i)
				aShortArray9479[i_1337_] = i_1336_;
		}
		byte i_1338_ = 0;
		byte i_1339_ = 0;
		if (i != -1) {
			Class164 class164 = class174.method2446(i & 0xffff, -1194587160);
			i_1338_ = class164.aByte1829;
			i_1339_ = class164.aByte1828;
		}
		byte i_1340_ = 0;
		byte i_1341_ = 0;
		if (i_1336_ != -1) {
			Class164 class164 = class174.method2446(i_1336_ & 0xffff, -1649949189);
			i_1340_ = class164.aByte1829;
			i_1341_ = class164.aByte1828;
			if (class164.aByte1802 != 0 || class164.aByte1803 != 0)
				aBool9508 = true;
		}
		if (i_1338_ != i_1340_ | i_1339_ != i_1341_) {
			if (aClass372Array9510 != null) {
				for (int i_1342_ = 0; i_1342_ < anInt9509; i_1342_++) {
					Class372 class372 = aClass372Array9510[i_1342_];
					Class346 class346 = aClass346Array9511[i_1342_];
					class346.anInt3686 = (class346.anInt3686 & ~0xffffff | ((ColourUtils.anIntArray8309[aShortArray9490[class372.anInt3889] & 0xffff]) & 0xffffff));
				}
			}
			method8678();
		}
	}

	public int method2522() {
		if (!aBool9471)
			method8681();
		return anInt9499;
	}

	public int method2581() {
		if (!aBool9471)
			method8681();
		return anInt9499;
	}

	public int method2582() {
		if (!aBool9453)
			method2501();
		return anInt9501;
	}

	public int method2583() {
		if (!aBool9453)
			method2501();
		return anInt9501;
	}

	public void method2584(int i) {
		aShort9494 = (short) i;
		method8678();
	}

	public void method2585(int i) {
		aShort9494 = (short) i;
		method8678();
	}

	public void method2586(int i) {
		aShort9494 = (short) i;
		method8678();
	}

	public int method2572() {
		if (!aBool9471)
			method8681();
		return anInt9492;
	}

	public void method2588(int i) {
		aShort9454 = (short) i;
		method8677();
		method8679();
	}

	public int method2488() {
		if (!aBool9471)
			method8681();
		return anInt9497;
	}

	public void method2590(int i) {
		aShort9454 = (short) i;
		method8677();
		method8679();
	}

	public void method2595(short i, short i_1343_) {
		Class174 class174 = aClass167_Sub3_9450.aClass174_1852;
		for (int i_1344_ = 0; i_1344_ < anInt9472; i_1344_++) {
			if (aShortArray9479[i_1344_] == i)
				aShortArray9479[i_1344_] = i_1343_;
		}
		byte i_1345_ = 0;
		byte i_1346_ = 0;
		if (i != -1) {
			Class164 class164 = class174.method2446(i & 0xffff, -89251742);
			i_1345_ = class164.aByte1829;
			i_1346_ = class164.aByte1828;
		}
		byte i_1347_ = 0;
		byte i_1348_ = 0;
		if (i_1343_ != -1) {
			Class164 class164 = class174.method2446(i_1343_ & 0xffff, -909874336);
			i_1347_ = class164.aByte1829;
			i_1348_ = class164.aByte1828;
			if (class164.aByte1802 != 0 || class164.aByte1803 != 0)
				aBool9508 = true;
		}
		if (i_1345_ != i_1347_ | i_1346_ != i_1348_) {
			if (aClass372Array9510 != null) {
				for (int i_1349_ = 0; i_1349_ < anInt9509; i_1349_++) {
					Class372 class372 = aClass372Array9510[i_1349_];
					Class346 class346 = aClass346Array9511[i_1349_];
					class346.anInt3686 = (class346.anInt3686 & ~0xffffff | ((ColourUtils.anIntArray8309[aShortArray9490[class372.anInt3889] & 0xffff]) & 0xffffff));
				}
			}
			method8678();
		}
	}

	public int method2592() {
		return aShort9494;
	}

	public int method2593() {
		return aShort9454;
	}

	public int method2611() {
		return anInt9473;
	}

	int method8696(int i, int i_1350_) {
		i_1350_ = i_1350_ * (i & 0x7f) >> 7;
		if (i_1350_ < 2)
			i_1350_ = 2;
		else if (i_1350_ > 126)
			i_1350_ = 126;
		return (i & 0xff80) + i_1350_;
	}

	public int method2463() {
		if (!aBool9471)
			method8681();
		return anInt9492;
	}

	public void method2620(int i, int i_1351_, int i_1352_, int i_1353_) {
		for (int i_1354_ = 0; i_1354_ < anInt9472; i_1354_++) {
			int i_1355_ = aShortArray9490[i_1354_] & 0xffff;
			int i_1356_ = i_1355_ >> 10 & 0x3f;
			int i_1357_ = i_1355_ >> 7 & 0x7;
			int i_1358_ = i_1355_ & 0x7f;
			if (i != -1)
				i_1356_ += (i - i_1356_) * i_1353_ >> 7;
			if (i_1351_ != -1)
				i_1357_ += (i_1351_ - i_1357_) * i_1353_ >> 7;
			if (i_1352_ != -1)
				i_1358_ += (i_1352_ - i_1358_) * i_1353_ >> 7;
			aShortArray9490[i_1354_] = (short) (i_1356_ << 10 | i_1357_ << 7 | i_1358_);
		}
		if (aClass372Array9510 != null) {
			for (int i_1359_ = 0; i_1359_ < anInt9509; i_1359_++) {
				Class372 class372 = aClass372Array9510[i_1359_];
				Class346 class346 = aClass346Array9511[i_1359_];
				class346.anInt3686 = (class346.anInt3686 & ~0xffffff | ((ColourUtils.anIntArray8309[aShortArray9490[class372.anInt3889] & 0xffff]) & 0xffffff));
			}
		}
		method8678();
	}

	Class177 method8697(Class177_Sub2 class177_sub2_1360_, Class177_Sub2 class177_sub2_1361_, int i, boolean bool, boolean bool_1362_) {
		class177_sub2_1360_.anInt9473 = i;
		class177_sub2_1360_.anInt9452 = anInt9452;
		class177_sub2_1360_.aShort9494 = aShort9494;
		class177_sub2_1360_.aShort9454 = aShort9454;
		class177_sub2_1360_.anInt9455 = anInt9455;
		class177_sub2_1360_.anInt9456 = anInt9456;
		class177_sub2_1360_.anInt9462 = anInt9462;
		class177_sub2_1360_.anInt9472 = anInt9472;
		class177_sub2_1360_.anInt9457 = anInt9457;
		class177_sub2_1360_.anInt9509 = anInt9509;
		if ((i & 0x100) != 0)
			class177_sub2_1360_.aBool9489 = true;
		else
			class177_sub2_1360_.aBool9489 = aBool9489;
		class177_sub2_1360_.aBool9508 = aBool9508;
		boolean bool_1363_ = Class345.method4490(i, anInt9452);
		boolean bool_1364_ = Class345.method4499(i, anInt9452);
		boolean bool_1365_ = Class345.method4491(i, anInt9452);
		boolean bool_1366_ = bool_1363_ | bool_1364_ | bool_1365_;
		if (bool_1366_) {
			if (bool_1363_) {
				if (class177_sub2_1361_.anIntArray9524 == null || class177_sub2_1361_.anIntArray9524.length < anInt9455)
					class177_sub2_1360_.anIntArray9524 = class177_sub2_1361_.anIntArray9524 = new int[anInt9455];
				else
					class177_sub2_1360_.anIntArray9524 = class177_sub2_1361_.anIntArray9524;
			} else
				class177_sub2_1360_.anIntArray9524 = anIntArray9524;
			if (bool_1364_) {
				if (class177_sub2_1361_.anIntArray9458 == null || class177_sub2_1361_.anIntArray9458.length < anInt9455)
					class177_sub2_1360_.anIntArray9458 = class177_sub2_1361_.anIntArray9458 = new int[anInt9455];
				else
					class177_sub2_1360_.anIntArray9458 = class177_sub2_1361_.anIntArray9458;
			} else
				class177_sub2_1360_.anIntArray9458 = anIntArray9458;
			if (bool_1365_) {
				if (class177_sub2_1361_.anIntArray9493 == null || class177_sub2_1361_.anIntArray9493.length < anInt9455)
					class177_sub2_1360_.anIntArray9493 = class177_sub2_1361_.anIntArray9493 = new int[anInt9455];
				else
					class177_sub2_1360_.anIntArray9493 = class177_sub2_1361_.anIntArray9493;
			} else
				class177_sub2_1360_.anIntArray9493 = anIntArray9493;
			for (int i_1367_ = 0; i_1367_ < anInt9455; i_1367_++) {
				if (bool_1363_)
					class177_sub2_1360_.anIntArray9524[i_1367_] = anIntArray9524[i_1367_];
				if (bool_1364_)
					class177_sub2_1360_.anIntArray9458[i_1367_] = anIntArray9458[i_1367_];
				if (bool_1365_)
					class177_sub2_1360_.anIntArray9493[i_1367_] = anIntArray9493[i_1367_];
			}
		} else {
			class177_sub2_1360_.anIntArray9524 = anIntArray9524;
			class177_sub2_1360_.anIntArray9458 = anIntArray9458;
			class177_sub2_1360_.anIntArray9493 = anIntArray9493;
		}
		if (Class345.method4506(i, anInt9452)) {
			class177_sub2_1360_.aClass375_9483 = class177_sub2_1361_.aClass375_9483;
			class177_sub2_1360_.aClass375_9483.anInterface38_3908 = aClass375_9483.anInterface38_3908;
			class177_sub2_1360_.aClass375_9483.aBool3911 = aClass375_9483.aBool3911;
			class177_sub2_1360_.aClass375_9483.aBool3909 = true;
		} else if (Class345.method4501(i, anInt9452))
			class177_sub2_1360_.aClass375_9483 = aClass375_9483;
		else
			class177_sub2_1360_.aClass375_9483 = null;
		if (Class345.method4532(i, anInt9452)) {
			if (class177_sub2_1361_.aShortArray9490 == null || class177_sub2_1361_.aShortArray9490.length < anInt9472)
				class177_sub2_1360_.aShortArray9490 = class177_sub2_1361_.aShortArray9490 = new short[anInt9472];
			else
				class177_sub2_1360_.aShortArray9490 = class177_sub2_1361_.aShortArray9490;
			for (int i_1368_ = 0; i_1368_ < anInt9472; i_1368_++)
				class177_sub2_1360_.aShortArray9490[i_1368_] = aShortArray9490[i_1368_];
		} else
			class177_sub2_1360_.aShortArray9490 = aShortArray9490;
		if (Class345.method4507(i, anInt9452)) {
			if (class177_sub2_1361_.aByteArray9448 == null || class177_sub2_1361_.aByteArray9448.length < anInt9472)
				class177_sub2_1360_.aByteArray9448 = class177_sub2_1361_.aByteArray9448 = new byte[anInt9472];
			else
				class177_sub2_1360_.aByteArray9448 = class177_sub2_1361_.aByteArray9448;
			for (int i_1369_ = 0; i_1369_ < anInt9472; i_1369_++)
				class177_sub2_1360_.aByteArray9448[i_1369_] = aByteArray9448[i_1369_];
		} else
			class177_sub2_1360_.aByteArray9448 = aByteArray9448;
		if (Class345.method4558(i, anInt9452)) {
			class177_sub2_1360_.aClass375_9484 = class177_sub2_1361_.aClass375_9484;
			class177_sub2_1360_.aClass375_9484.anInterface38_3908 = aClass375_9484.anInterface38_3908;
			class177_sub2_1360_.aClass375_9484.aBool3911 = aClass375_9484.aBool3911;
			class177_sub2_1360_.aClass375_9484.aBool3909 = true;
		} else if (Class345.method4492(i, anInt9452))
			class177_sub2_1360_.aClass375_9484 = aClass375_9484;
		else
			class177_sub2_1360_.aClass375_9484 = null;
		if (Class345.method4493(i, anInt9452)) {
			if (class177_sub2_1361_.aShortArray9500 == null || class177_sub2_1361_.aShortArray9500.length < anInt9462) {
				int i_1370_ = anInt9462;
				class177_sub2_1360_.aShortArray9500 = class177_sub2_1361_.aShortArray9500 = new short[i_1370_];
				class177_sub2_1360_.aShortArray9466 = class177_sub2_1361_.aShortArray9466 = new short[i_1370_];
				class177_sub2_1360_.aShortArray9467 = class177_sub2_1361_.aShortArray9467 = new short[i_1370_];
			} else {
				class177_sub2_1360_.aShortArray9500 = class177_sub2_1361_.aShortArray9500;
				class177_sub2_1360_.aShortArray9466 = class177_sub2_1361_.aShortArray9466;
				class177_sub2_1360_.aShortArray9467 = class177_sub2_1361_.aShortArray9467;
			}
			if (aClass373_9505 != null) {
				if (class177_sub2_1361_.aClass373_9505 == null)
					class177_sub2_1361_.aClass373_9505 = new Class373();
				Class373 class373 = (class177_sub2_1360_.aClass373_9505 = class177_sub2_1361_.aClass373_9505);
				if (class373.aShortArray3896 == null || class373.aShortArray3896.length < anInt9462) {
					int i_1371_ = anInt9462;
					class373.aShortArray3896 = new short[i_1371_];
					class373.aShortArray3895 = new short[i_1371_];
					class373.aShortArray3897 = new short[i_1371_];
					class373.aByteArray3898 = new byte[i_1371_];
				}
				for (int i_1372_ = 0; i_1372_ < anInt9462; i_1372_++) {
					class177_sub2_1360_.aShortArray9500[i_1372_] = aShortArray9500[i_1372_];
					class177_sub2_1360_.aShortArray9466[i_1372_] = aShortArray9466[i_1372_];
					class177_sub2_1360_.aShortArray9467[i_1372_] = aShortArray9467[i_1372_];
					class373.aShortArray3896[i_1372_] = aClass373_9505.aShortArray3896[i_1372_];
					class373.aShortArray3895[i_1372_] = aClass373_9505.aShortArray3895[i_1372_];
					class373.aShortArray3897[i_1372_] = aClass373_9505.aShortArray3897[i_1372_];
					class373.aByteArray3898[i_1372_] = aClass373_9505.aByteArray3898[i_1372_];
				}
			} else {
				class177_sub2_1360_.aClass373_9505 = null;
				for (int i_1373_ = 0; i_1373_ < anInt9462; i_1373_++) {
					class177_sub2_1360_.aShortArray9500[i_1373_] = aShortArray9500[i_1373_];
					class177_sub2_1360_.aShortArray9466[i_1373_] = aShortArray9466[i_1373_];
					class177_sub2_1360_.aShortArray9467[i_1373_] = aShortArray9467[i_1373_];
				}
			}
			class177_sub2_1360_.aByteArray9512 = aByteArray9512;
		} else {
			class177_sub2_1360_.aClass373_9505 = aClass373_9505;
			class177_sub2_1360_.aShortArray9500 = aShortArray9500;
			class177_sub2_1360_.aShortArray9466 = aShortArray9466;
			class177_sub2_1360_.aShortArray9467 = aShortArray9467;
			class177_sub2_1360_.aByteArray9512 = aByteArray9512;
		}
		if (Class345.method4531(i, anInt9452)) {
			class177_sub2_1360_.aClass375_9485 = class177_sub2_1361_.aClass375_9485;
			class177_sub2_1360_.aClass375_9485.anInterface38_3908 = aClass375_9485.anInterface38_3908;
			class177_sub2_1360_.aClass375_9485.aBool3911 = aClass375_9485.aBool3911;
			class177_sub2_1360_.aClass375_9485.aBool3909 = true;
		} else if (Class345.method4502(i, anInt9452))
			class177_sub2_1360_.aClass375_9485 = aClass375_9485;
		else
			class177_sub2_1360_.aClass375_9485 = null;
		if (Class345.method4496(i, anInt9452)) {
			if (class177_sub2_1361_.aFloatArray9469 == null || class177_sub2_1361_.aFloatArray9469.length < anInt9472) {
				int i_1374_ = anInt9462;
				class177_sub2_1360_.aFloatArray9469 = class177_sub2_1361_.aFloatArray9469 = new float[i_1374_];
				class177_sub2_1360_.aFloatArray9470 = class177_sub2_1361_.aFloatArray9470 = new float[i_1374_];
			} else {
				class177_sub2_1360_.aFloatArray9469 = class177_sub2_1361_.aFloatArray9469;
				class177_sub2_1360_.aFloatArray9470 = class177_sub2_1361_.aFloatArray9470;
			}
			for (int i_1375_ = 0; i_1375_ < anInt9462; i_1375_++) {
				class177_sub2_1360_.aFloatArray9469[i_1375_] = aFloatArray9469[i_1375_];
				class177_sub2_1360_.aFloatArray9470[i_1375_] = aFloatArray9470[i_1375_];
			}
		} else {
			class177_sub2_1360_.aFloatArray9469 = aFloatArray9469;
			class177_sub2_1360_.aFloatArray9470 = aFloatArray9470;
		}
		if (Class345.method4508(i, anInt9452)) {
			class177_sub2_1360_.aClass375_9486 = class177_sub2_1361_.aClass375_9486;
			class177_sub2_1360_.aClass375_9486.anInterface38_3908 = aClass375_9486.anInterface38_3908;
			class177_sub2_1360_.aClass375_9486.aBool3911 = aClass375_9486.aBool3911;
			class177_sub2_1360_.aClass375_9486.aBool3909 = true;
		} else if (Class345.method4541(i, anInt9452))
			class177_sub2_1360_.aClass375_9486 = aClass375_9486;
		else
			class177_sub2_1360_.aClass375_9486 = null;
		if (Class345.method4497(i, anInt9452)) {
			if (class177_sub2_1361_.aShortArray9463 == null || class177_sub2_1361_.aShortArray9463.length < anInt9472) {
				int i_1376_ = anInt9472;
				class177_sub2_1360_.aShortArray9463 = class177_sub2_1361_.aShortArray9463 = new short[i_1376_];
				class177_sub2_1360_.aShortArray9477 = class177_sub2_1361_.aShortArray9477 = new short[i_1376_];
				class177_sub2_1360_.aShortArray9488 = class177_sub2_1361_.aShortArray9488 = new short[i_1376_];
			} else {
				class177_sub2_1360_.aShortArray9463 = class177_sub2_1361_.aShortArray9463;
				class177_sub2_1360_.aShortArray9477 = class177_sub2_1361_.aShortArray9477;
				class177_sub2_1360_.aShortArray9488 = class177_sub2_1361_.aShortArray9488;
			}
			for (int i_1377_ = 0; i_1377_ < anInt9472; i_1377_++) {
				class177_sub2_1360_.aShortArray9463[i_1377_] = aShortArray9463[i_1377_];
				class177_sub2_1360_.aShortArray9477[i_1377_] = aShortArray9477[i_1377_];
				class177_sub2_1360_.aShortArray9488[i_1377_] = aShortArray9488[i_1377_];
			}
		} else {
			class177_sub2_1360_.aShortArray9463 = aShortArray9463;
			class177_sub2_1360_.aShortArray9477 = aShortArray9477;
			class177_sub2_1360_.aShortArray9488 = aShortArray9488;
		}
		if (Class345.method4509(i, anInt9452)) {
			class177_sub2_1360_.aClass348_9482 = class177_sub2_1361_.aClass348_9482;
			class177_sub2_1360_.aClass348_9482.anInterface41_3691 = aClass348_9482.anInterface41_3691;
			class177_sub2_1360_.aClass348_9482.aBool3693 = aClass348_9482.aBool3693;
			class177_sub2_1360_.aClass348_9482.aBool3692 = true;
		} else if (Class345.method4505(i, anInt9452))
			class177_sub2_1360_.aClass348_9482 = aClass348_9482;
		else
			class177_sub2_1360_.aClass348_9482 = null;
		if (Class345.method4498(i, anInt9452)) {
			if (class177_sub2_1361_.aShortArray9479 == null || class177_sub2_1361_.aShortArray9479.length < anInt9472) {
				int i_1378_ = anInt9472;
				class177_sub2_1360_.aShortArray9479 = class177_sub2_1361_.aShortArray9479 = new short[i_1378_];
			} else
				class177_sub2_1360_.aShortArray9479 = class177_sub2_1361_.aShortArray9479;
			for (int i_1379_ = 0; i_1379_ < anInt9472; i_1379_++)
				class177_sub2_1360_.aShortArray9479[i_1379_] = aShortArray9479[i_1379_];
		} else
			class177_sub2_1360_.aShortArray9479 = aShortArray9479;
		if (Class345.method4529(i, anInt9452)) {
			if (class177_sub2_1361_.aClass346Array9511 == null || class177_sub2_1361_.aClass346Array9511.length < anInt9509) {
				int i_1380_ = anInt9509;
				class177_sub2_1360_.aClass346Array9511 = class177_sub2_1361_.aClass346Array9511 = new Class346[i_1380_];
				for (int i_1381_ = 0; i_1381_ < anInt9509; i_1381_++)
					class177_sub2_1360_.aClass346Array9511[i_1381_] = aClass346Array9511[i_1381_].method4583();
			} else {
				class177_sub2_1360_.aClass346Array9511 = class177_sub2_1361_.aClass346Array9511;
				for (int i_1382_ = 0; i_1382_ < anInt9509; i_1382_++)
					class177_sub2_1360_.aClass346Array9511[i_1382_].method4582(aClass346Array9511[i_1382_]);
			}
		} else
			class177_sub2_1360_.aClass346Array9511 = aClass346Array9511;
		class177_sub2_1360_.aClass372Array9510 = aClass372Array9510;
		if (aBool9471) {
			class177_sub2_1360_.anInt9491 = anInt9491;
			class177_sub2_1360_.anInt9492 = anInt9492;
			class177_sub2_1360_.anInt9496 = anInt9496;
			class177_sub2_1360_.anInt9497 = anInt9497;
			class177_sub2_1360_.anInt9478 = anInt9478;
			class177_sub2_1360_.anInt9495 = anInt9495;
			class177_sub2_1360_.anInt9498 = anInt9498;
			class177_sub2_1360_.anInt9499 = anInt9499;
			class177_sub2_1360_.aBool9471 = true;
		} else
			class177_sub2_1360_.aBool9471 = false;
		if (aBool9453) {
			class177_sub2_1360_.anInt9501 = anInt9501;
			class177_sub2_1360_.aBool9453 = true;
		} else
			class177_sub2_1360_.aBool9453 = false;
		class177_sub2_1360_.anIntArrayArray9460 = anIntArrayArray9460;
		class177_sub2_1360_.anIntArrayArray9480 = anIntArrayArray9480;
		class177_sub2_1360_.anIntArrayArray9451 = anIntArrayArray9451;
		class177_sub2_1360_.aShortArray9506 = aShortArray9506;
		class177_sub2_1360_.anIntArray9468 = anIntArray9468;
		class177_sub2_1360_.aShortArray9515 = aShortArray9515;
		class177_sub2_1360_.aShortArray9518 = aShortArray9518;
		class177_sub2_1360_.aShortArray9461 = aShortArray9461;
		class177_sub2_1360_.aShortArray9481 = aShortArray9481;
		class177_sub2_1360_.anIntArray9507 = anIntArray9507;
		class177_sub2_1360_.anIntArray9504 = anIntArray9504;
		class177_sub2_1360_.anIntArray9503 = anIntArray9503;
		class177_sub2_1360_.aClass172Array9517 = aClass172Array9517;
		class177_sub2_1360_.aClass156Array9464 = aClass156Array9464;
		return class177_sub2_1360_;
	}

	public Class172[] method2599() {
		return aClass172Array9517;
	}

	public Class156[] method2557() {
		return aClass156Array9464;
	}

	public Class156[] method2515() {
		return aClass156Array9464;
	}

	public boolean method2621() {
		if (aShortArray9479 == null)
			return true;
		for (int i = 0; i < aShortArray9479.length; i++) {
			if (aShortArray9479[i] != -1 && !(aClass167_Sub3_9450.aClass340_9561.method4453(aClass167_Sub3_9450.aClass174_1852.method2446(aShortArray9479[i], -1756303293), -1)))
				return false;
		}
		return true;
	}

	public boolean method2601() {
		if (aShortArray9479 == null)
			return true;
		for (int i = 0; i < aShortArray9479.length; i++) {
			if (aShortArray9479[i] != -1 && !(aClass167_Sub3_9450.aClass340_9561.method4453(aClass167_Sub3_9450.aClass174_1852.method2446(aShortArray9479[i], -541090563), -1)))
				return false;
		}
		return true;
	}

	void method8698() {
		int i = 32767;
		int i_1383_ = 32767;
		int i_1384_ = 32767;
		int i_1385_ = -32768;
		int i_1386_ = -32768;
		int i_1387_ = -32768;
		int i_1388_ = 0;
		int i_1389_ = 0;
		for (int i_1390_ = 0; i_1390_ < anInt9456; i_1390_++) {
			int i_1391_ = anIntArray9524[i_1390_];
			int i_1392_ = anIntArray9458[i_1390_];
			int i_1393_ = anIntArray9493[i_1390_];
			if (i_1391_ < i)
				i = i_1391_;
			if (i_1391_ > i_1385_)
				i_1385_ = i_1391_;
			if (i_1392_ < i_1383_)
				i_1383_ = i_1392_;
			if (i_1392_ > i_1386_)
				i_1386_ = i_1392_;
			if (i_1393_ < i_1384_)
				i_1384_ = i_1393_;
			if (i_1393_ > i_1387_)
				i_1387_ = i_1393_;
			int i_1394_ = i_1391_ * i_1391_ + i_1393_ * i_1393_;
			if (i_1394_ > i_1388_)
				i_1388_ = i_1394_;
			i_1394_ = i_1391_ * i_1391_ + i_1393_ * i_1393_ + i_1392_ * i_1392_;
			if (i_1394_ > i_1389_)
				i_1389_ = i_1394_;
		}
		anInt9496 = i;
		anInt9497 = i_1385_;
		anInt9478 = i_1383_;
		anInt9495 = i_1386_;
		anInt9498 = i_1384_;
		anInt9499 = i_1387_;
		anInt9492 = (int) (Math.sqrt((double) i_1388_) + 0.99);
		anInt9491 = (int) (Math.sqrt((double) i_1389_) + 0.99);
		aBool9471 = true;
	}

	public boolean method2603() {
		if (aShortArray9479 == null)
			return true;
		for (int i = 0; i < aShortArray9479.length; i++) {
			if (aShortArray9479[i] != -1 && !(aClass167_Sub3_9450.aClass340_9561.method4453(aClass167_Sub3_9450.aClass174_1852.method2446(aShortArray9479[i], -1062734657), -1)))
				return false;
		}
		return true;
	}

	public void method2472(int i, int i_1395_, int i_1396_) {
		for (int i_1397_ = 0; i_1397_ < anInt9456; i_1397_++) {
			if (i != 0)
				anIntArray9524[i_1397_] += i;
			if (i_1395_ != 0)
				anIntArray9458[i_1397_] += i_1395_;
			if (i_1396_ != 0)
				anIntArray9493[i_1397_] += i_1396_;
		}
		method8677();
		aBool9471 = false;
	}

	public boolean method2605() {
		if (aShortArray9479 == null)
			return true;
		for (int i = 0; i < aShortArray9479.length; i++) {
			if (aShortArray9479[i] != -1 && !(aClass167_Sub3_9450.aClass340_9561.method4453(aClass167_Sub3_9450.aClass174_1852.method2446(aShortArray9479[i], -2105577293), -1)))
				return false;
		}
		return true;
	}

	public boolean method2606() {
		return aBool9489;
	}

	public boolean method2567() {
		return aBool9489;
	}

	public boolean method2608() {
		return aBool9489;
	}

	public boolean method2609() {
		return aBool9508;
	}

	void method8699() {
		if ((anInt9452 & 0x37) != 0) {
			if (aClass375_9485 != null)
				aClass375_9485.aBool3911 = false;
		} else if (aClass375_9484 != null)
			aClass375_9484.aBool3911 = false;
	}

	public byte[] method2462() {
		return aByteArray9448;
	}

	public byte[] method2613() {
		return aByteArray9448;
	}

	public void method2500(byte i, byte[] is) {
		if (is == null) {
			for (int i_1398_ = 0; i_1398_ < anInt9472; i_1398_++)
				aByteArray9448[i_1398_] = i;
		} else {
			for (int i_1399_ = 0; i_1399_ < anInt9472; i_1399_++) {
				int i_1400_ = 255 - ((255 - (is[i_1399_] & 0xff)) * (255 - (i & 0xff)) / 255);
				aByteArray9448[i_1399_] = (byte) i_1400_;
			}
		}
		method8678();
	}

	public Class172[] method2598() {
		return aClass172Array9517;
	}

	public Class177 method2618(byte i, int i_1401_, boolean bool) {
		boolean bool_1402_ = false;
		Class177_Sub2 class177_sub2_1403_;
		Class177_Sub2 class177_sub2_1404_;
		if (i > 0 && i <= 8) {
			class177_sub2_1404_ = aClass167_Sub3_9450.aClass177_Sub2Array9699[i - 1];
			class177_sub2_1403_ = aClass167_Sub3_9450.aClass177_Sub2Array9710[i - 1];
			bool_1402_ = true;
		} else
			class177_sub2_1403_ = class177_sub2_1404_ = new Class177_Sub2(aClass167_Sub3_9450, 0, 0, true, false);
		return method8697(class177_sub2_1403_, class177_sub2_1404_, i_1401_, bool_1402_, bool);
	}

	public Class177 method2496(byte i, int i_1405_, boolean bool) {
		boolean bool_1406_ = false;
		Class177_Sub2 class177_sub2_1407_;
		Class177_Sub2 class177_sub2_1408_;
		if (i > 0 && i <= 8) {
			class177_sub2_1408_ = aClass167_Sub3_9450.aClass177_Sub2Array9699[i - 1];
			class177_sub2_1407_ = aClass167_Sub3_9450.aClass177_Sub2Array9710[i - 1];
			bool_1406_ = true;
		} else
			class177_sub2_1407_ = class177_sub2_1408_ = new Class177_Sub2(aClass167_Sub3_9450, 0, 0, true, false);
		return method8697(class177_sub2_1407_, class177_sub2_1408_, i_1405_, bool_1406_, bool);
	}

	void method8700() {
		if ((anInt9452 & 0x37) != 0) {
			if (aClass375_9485 != null)
				aClass375_9485.aBool3911 = false;
		} else if (aClass375_9484 != null)
			aClass375_9484.aBool3911 = false;
	}

	public int method2575() {
		if (!aBool9471)
			method8681();
		return anInt9496;
	}

	public void method2551(Class433 class433, Class178 class178, int i) {
		if (aClass351_9474 != null)
			aClass351_9474.method4641();
		if (class178 != null)
			class178.aBool1945 = false;
		if (anInt9462 != 0) {
			Class443 class443 = aClass167_Sub3_9450.aClass443_9580;
			Class443 class443_1409_ = aClass167_Sub3_9450.aClass443_9570;
			Class443 class443_1410_ = aClass167_Sub3_9450.aClass443_9643;
			class443_1409_.method5359(class433);
			class443_1410_.method5339(class443_1409_);
			class443_1410_.method5390(aClass167_Sub3_9450.aClass443_9584);
			if (!aBool9471)
				method8681();
			float[] fs = aClass167_Sub3_9450.aFloatArray9546;
			class443_1409_.method5346(0.0F, (float) anInt9478, 0.0F, fs);
			float f = fs[0];
			float f_1411_ = fs[1];
			float f_1412_ = fs[2];
			class443_1409_.method5346(0.0F, (float) anInt9495, 0.0F, fs);
			float f_1413_ = fs[0];
			float f_1414_ = fs[1];
			float f_1415_ = fs[2];
			for (int i_1416_ = 0; i_1416_ < 6; i_1416_++) {
				float[] fs_1417_ = aClass167_Sub3_9450.aFloatArrayArray9702[i_1416_];
				float f_1418_ = (fs_1417_[0] * f + fs_1417_[1] * f_1411_ + fs_1417_[2] * f_1412_ + fs_1417_[3] + (float) anInt9492);
				float f_1419_ = (fs_1417_[0] * f_1413_ + fs_1417_[1] * f_1414_ + fs_1417_[2] * f_1415_ + fs_1417_[3] + (float) anInt9492);
				if (f_1418_ < 0.0F && f_1419_ < 0.0F)
					return;
			}
			if (class178 != null) {
				boolean bool = false;
				boolean bool_1420_ = true;
				int i_1421_ = anInt9496 + anInt9497 >> 1;
				int i_1422_ = anInt9498 + anInt9499 >> 1;
				int i_1423_ = i_1421_;
				int i_1424_ = anInt9478;
				int i_1425_ = i_1422_;
				float f_1426_ = (class443_1410_.aFloatArray4878[0] * (float) i_1423_ + class443_1410_.aFloatArray4878[4] * (float) i_1424_ + class443_1410_.aFloatArray4878[8] * (float) i_1425_ + class443_1410_.aFloatArray4878[12]);
				float f_1427_ = (class443_1410_.aFloatArray4878[1] * (float) i_1423_ + class443_1410_.aFloatArray4878[5] * (float) i_1424_ + class443_1410_.aFloatArray4878[9] * (float) i_1425_ + class443_1410_.aFloatArray4878[13]);
				float f_1428_ = (class443_1410_.aFloatArray4878[2] * (float) i_1423_ + class443_1410_.aFloatArray4878[6] * (float) i_1424_ + class443_1410_.aFloatArray4878[10] * (float) i_1425_ + class443_1410_.aFloatArray4878[14]);
				float f_1429_ = (class443_1410_.aFloatArray4878[3] * (float) i_1423_ + class443_1410_.aFloatArray4878[7] * (float) i_1424_ + class443_1410_.aFloatArray4878[11] * (float) i_1425_ + class443_1410_.aFloatArray4878[15]);
				if (f_1428_ >= -f_1429_) {
					class178.anInt1941 = (int) (aClass167_Sub3_9450.aFloat9536 + (aClass167_Sub3_9450.aFloat9588 * f_1426_ / f_1429_));
					class178.anInt1942 = (int) (aClass167_Sub3_9450.aFloat9589 + (aClass167_Sub3_9450.aFloat9590 * f_1427_ / f_1429_));
				} else
					bool = true;
				i_1423_ = i_1421_;
				i_1424_ = anInt9495;
				i_1425_ = i_1422_;
				float f_1430_ = (class443_1410_.aFloatArray4878[0] * (float) i_1423_ + class443_1410_.aFloatArray4878[4] * (float) i_1424_ + class443_1410_.aFloatArray4878[8] * (float) i_1425_ + class443_1410_.aFloatArray4878[12]);
				float f_1431_ = (class443_1410_.aFloatArray4878[1] * (float) i_1423_ + class443_1410_.aFloatArray4878[5] * (float) i_1424_ + class443_1410_.aFloatArray4878[9] * (float) i_1425_ + class443_1410_.aFloatArray4878[13]);
				float f_1432_ = (class443_1410_.aFloatArray4878[2] * (float) i_1423_ + class443_1410_.aFloatArray4878[6] * (float) i_1424_ + class443_1410_.aFloatArray4878[10] * (float) i_1425_ + class443_1410_.aFloatArray4878[14]);
				float f_1433_ = (class443_1410_.aFloatArray4878[3] * (float) i_1423_ + class443_1410_.aFloatArray4878[7] * (float) i_1424_ + class443_1410_.aFloatArray4878[11] * (float) i_1425_ + class443_1410_.aFloatArray4878[15]);
				if (f_1432_ >= -f_1433_) {
					class178.anInt1943 = (int) (aClass167_Sub3_9450.aFloat9536 + (aClass167_Sub3_9450.aFloat9588 * f_1430_ / f_1433_));
					class178.anInt1944 = (int) (aClass167_Sub3_9450.aFloat9589 + (aClass167_Sub3_9450.aFloat9590 * f_1431_ / f_1433_));
				} else
					bool = true;
				if (bool) {
					if (f_1428_ < -f_1429_ && f_1432_ < -f_1433_)
						bool_1420_ = false;
					else if (f_1428_ < -f_1429_) {
						float f_1434_ = (f_1428_ + f_1429_) / (f_1432_ + f_1433_) - 1.0F;
						float f_1435_ = f_1426_ + f_1434_ * (f_1430_ - f_1426_);
						float f_1436_ = f_1427_ + f_1434_ * (f_1431_ - f_1427_);
						float f_1437_ = f_1429_ + f_1434_ * (f_1433_ - f_1429_);
						class178.anInt1941 = (int) (aClass167_Sub3_9450.aFloat9536 + (aClass167_Sub3_9450.aFloat9588 * f_1435_ / f_1437_));
						class178.anInt1942 = (int) (aClass167_Sub3_9450.aFloat9589 + (aClass167_Sub3_9450.aFloat9590 * f_1436_ / f_1437_));
					} else if (f_1432_ < -f_1433_) {
						float f_1438_ = (f_1432_ + f_1433_) / (f_1428_ + f_1429_) - 1.0F;
						float f_1439_ = f_1430_ + f_1438_ * (f_1426_ - f_1430_);
						float f_1440_ = f_1431_ + f_1438_ * (f_1427_ - f_1431_);
						float f_1441_ = f_1433_ + f_1438_ * (f_1429_ - f_1433_);
						class178.anInt1943 = (int) (aClass167_Sub3_9450.aFloat9536 + (aClass167_Sub3_9450.aFloat9588 * f_1439_ / f_1441_));
						class178.anInt1944 = (int) (aClass167_Sub3_9450.aFloat9589 + (aClass167_Sub3_9450.aFloat9590 * f_1440_ / f_1441_));
					}
				}
				if (bool_1420_) {
					if (f_1428_ / f_1429_ > f_1432_ / f_1433_) {
						float f_1442_ = (f_1426_ + (class443.aFloatArray4878[0] * (float) anInt9492) + class443.aFloatArray4878[12]);
						float f_1443_ = (f_1429_ + (class443.aFloatArray4878[3] * (float) anInt9492) + class443.aFloatArray4878[15]);
						class178.anInt1940 = (int) (aClass167_Sub3_9450.aFloat9536 - (float) class178.anInt1941 + (aClass167_Sub3_9450.aFloat9588 * f_1442_ / f_1443_));
					} else {
						float f_1444_ = (f_1430_ + (class443.aFloatArray4878[0] * (float) anInt9492) + class443.aFloatArray4878[12]);
						float f_1445_ = (f_1433_ + (class443.aFloatArray4878[3] * (float) anInt9492) + class443.aFloatArray4878[15]);
						class178.anInt1940 = (int) (aClass167_Sub3_9450.aFloat9536 - (float) class178.anInt1943 + (aClass167_Sub3_9450.aFloat9588 * f_1444_ / f_1445_));
					}
					class178.aBool1945 = true;
				}
			}
			aClass167_Sub3_9450.method8711(i);
			method8687(class433);
			aClass167_Sub3_9450.method8711(0);
			class443_1409_.method5359(class433);
			class443_1409_.method5390(aClass167_Sub3_9450.aClass443_9698);
			method8682(class443_1409_);
		}
	}

	public int method2610() {
		return anInt9473;
	}

	public byte[] method2506() {
		return aByteArray9448;
	}

	void method2543() {
		for (int i = 0; i < anInt9455; i++) {
			anIntArray9524[i] = anIntArray9524[i] + 7 >> 4;
			anIntArray9458[i] = anIntArray9458[i] + 7 >> 4;
			anIntArray9493[i] = anIntArray9493[i] + 7 >> 4;
		}
		method8677();
		aBool9471 = false;
	}

	void method8701() {
		if (aClass375_9484 != null)
			aClass375_9484.aBool3911 = false;
	}

	void method8702() {
		if (aClass375_9484 != null)
			aClass375_9484.aBool3911 = false;
	}

	public Class536_Sub18_Sub7 method2525(Class536_Sub18_Sub7 class536_sub18_sub7) {
		if (anInt9462 == 0)
			return null;
		if (!aBool9471)
			method8681();
		int i;
		int i_1446_;
		if (aClass167_Sub3_9450.anInt9634 > 0) {
			i = (anInt9496 - (anInt9495 * aClass167_Sub3_9450.anInt9634 >> 8) >> aClass167_Sub3_9450.anInt9633);
			i_1446_ = anInt9497 - (anInt9478 * aClass167_Sub3_9450.anInt9634 >> 8) >> aClass167_Sub3_9450.anInt9633;
		} else {
			i = (anInt9496 - (anInt9478 * aClass167_Sub3_9450.anInt9634 >> 8) >> aClass167_Sub3_9450.anInt9633);
			i_1446_ = anInt9497 - (anInt9495 * aClass167_Sub3_9450.anInt9634 >> 8) >> aClass167_Sub3_9450.anInt9633;
		}
		int i_1447_;
		int i_1448_;
		if (aClass167_Sub3_9450.anInt9635 > 0) {
			i_1447_ = anInt9498 - (anInt9495 * aClass167_Sub3_9450.anInt9635 >> 8) >> aClass167_Sub3_9450.anInt9633;
			i_1448_ = anInt9499 - (anInt9478 * aClass167_Sub3_9450.anInt9635 >> 8) >> aClass167_Sub3_9450.anInt9633;
		} else {
			i_1447_ = anInt9498 - (anInt9478 * aClass167_Sub3_9450.anInt9635 >> 8) >> aClass167_Sub3_9450.anInt9633;
			i_1448_ = anInt9499 - (anInt9495 * aClass167_Sub3_9450.anInt9635 >> 8) >> aClass167_Sub3_9450.anInt9633;
		}
		int i_1449_ = i_1446_ - i + 1;
		int i_1450_ = i_1448_ - i_1447_ + 1;
		Class536_Sub18_Sub7_Sub1 class536_sub18_sub7_sub1 = (Class536_Sub18_Sub7_Sub1) class536_sub18_sub7;
		Class536_Sub18_Sub7_Sub1 class536_sub18_sub7_sub1_1451_;
		if (class536_sub18_sub7_sub1 != null && class536_sub18_sub7_sub1.method10972(i_1449_, i_1450_)) {
			class536_sub18_sub7_sub1_1451_ = class536_sub18_sub7_sub1;
			class536_sub18_sub7_sub1_1451_.method10980();
		} else
			class536_sub18_sub7_sub1_1451_ = new Class536_Sub18_Sub7_Sub1(aClass167_Sub3_9450, i_1449_, i_1450_);
		class536_sub18_sub7_sub1_1451_.method10973(i, i_1447_, i_1446_, i_1448_);
		method8686(class536_sub18_sub7_sub1_1451_);
		return class536_sub18_sub7_sub1_1451_;
	}

	public boolean method2602() {
		if (aShortArray9479 == null)
			return true;
		for (int i = 0; i < aShortArray9479.length; i++) {
			if (aShortArray9479[i] != -1 && !(aClass167_Sub3_9450.aClass340_9561.method4453(aClass167_Sub3_9450.aClass174_1852.method2446(aShortArray9479[i], -347073641), -1)))
				return false;
		}
		return true;
	}

	public void method2624(int i) {
		int i_1452_ = Class447.anIntArray4906[i];
		int i_1453_ = Class447.anIntArray4921[i];
		for (int i_1454_ = 0; i_1454_ < anInt9456; i_1454_++) {
			int i_1455_ = ((anIntArray9458[i_1454_] * i_1453_ - anIntArray9493[i_1454_] * i_1452_) >> 14);
			anIntArray9493[i_1454_] = (anIntArray9458[i_1454_] * i_1452_ + anIntArray9493[i_1454_] * i_1453_) >> 14;
			anIntArray9458[i_1454_] = i_1455_;
		}
		method8677();
		aBool9471 = false;
	}

	public int method2569() {
		if (!aBool9471)
			method8681();
		return anInt9497;
	}

	public void method2527(int i) {
		int i_1456_ = Class447.anIntArray4906[i];
		int i_1457_ = Class447.anIntArray4921[i];
		for (int i_1458_ = 0; i_1458_ < anInt9456; i_1458_++) {
			int i_1459_ = ((anIntArray9458[i_1458_] * i_1457_ - anIntArray9493[i_1458_] * i_1456_) >> 14);
			anIntArray9493[i_1458_] = (anIntArray9458[i_1458_] * i_1456_ + anIntArray9493[i_1458_] * i_1457_) >> 14;
			anIntArray9458[i_1458_] = i_1459_;
		}
		method8677();
		aBool9471 = false;
	}

	public void method2594(short i, short i_1460_) {
		for (int i_1461_ = 0; i_1461_ < anInt9472; i_1461_++) {
			if (aShortArray9490[i_1461_] == i)
				aShortArray9490[i_1461_] = i_1460_;
		}
		if (aClass372Array9510 != null) {
			for (int i_1462_ = 0; i_1462_ < anInt9509; i_1462_++) {
				Class372 class372 = aClass372Array9510[i_1462_];
				Class346 class346 = aClass346Array9511[i_1462_];
				class346.anInt3686 = (class346.anInt3686 & ~0xffffff | ((ColourUtils.anIntArray8309[aShortArray9490[class372.anInt3889] & 0xffff]) & 0xffffff));
			}
		}
		method8678();
	}

	public Class177 method2617(byte i, int i_1463_, boolean bool) {
		boolean bool_1464_ = false;
		Class177_Sub2 class177_sub2_1465_;
		Class177_Sub2 class177_sub2_1466_;
		if (i > 0 && i <= 8) {
			class177_sub2_1466_ = aClass167_Sub3_9450.aClass177_Sub2Array9699[i - 1];
			class177_sub2_1465_ = aClass167_Sub3_9450.aClass177_Sub2Array9710[i - 1];
			bool_1464_ = true;
		} else
			class177_sub2_1465_ = class177_sub2_1466_ = new Class177_Sub2(aClass167_Sub3_9450, 0, 0, true, false);
		return method8697(class177_sub2_1465_, class177_sub2_1466_, i_1463_, bool_1464_, bool);
	}

	void method2486(int i, int[] is, int i_1467_, int i_1468_, int i_1469_, int i_1470_, boolean bool) {
		int i_1471_ = is.length;
		if (i == 0) {
			i_1467_ <<= 4;
			i_1468_ <<= 4;
			i_1469_ <<= 4;
			int i_1472_ = 0;
			anInt9520 = 0;
			anInt9521 = 0;
			anInt9522 = 0;
			for (int i_1473_ = 0; i_1473_ < i_1471_; i_1473_++) {
				int i_1474_ = is[i_1473_];
				if (i_1474_ < anIntArrayArray9460.length) {
					int[] is_1475_ = anIntArrayArray9460[i_1474_];
					for (int i_1476_ = 0; i_1476_ < is_1475_.length; i_1476_++) {
						int i_1477_ = is_1475_[i_1476_];
						anInt9520 += anIntArray9524[i_1477_];
						anInt9521 += anIntArray9458[i_1477_];
						anInt9522 += anIntArray9493[i_1477_];
						i_1472_++;
					}
				}
			}
			if (i_1472_ > 0) {
				anInt9520 = anInt9520 / i_1472_ + i_1467_;
				anInt9521 = anInt9521 / i_1472_ + i_1468_;
				anInt9522 = anInt9522 / i_1472_ + i_1469_;
			} else {
				anInt9520 = i_1467_;
				anInt9521 = i_1468_;
				anInt9522 = i_1469_;
			}
		} else if (i == 1) {
			i_1467_ <<= 4;
			i_1468_ <<= 4;
			i_1469_ <<= 4;
			for (int i_1478_ = 0; i_1478_ < i_1471_; i_1478_++) {
				int i_1479_ = is[i_1478_];
				if (i_1479_ < anIntArrayArray9460.length) {
					int[] is_1480_ = anIntArrayArray9460[i_1479_];
					for (int i_1481_ = 0; i_1481_ < is_1480_.length; i_1481_++) {
						int i_1482_ = is_1480_[i_1481_];
						anIntArray9524[i_1482_] += i_1467_;
						anIntArray9458[i_1482_] += i_1468_;
						anIntArray9493[i_1482_] += i_1469_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_1483_ = 0; i_1483_ < i_1471_; i_1483_++) {
				int i_1484_ = is[i_1483_];
				if (i_1484_ < anIntArrayArray9460.length) {
					int[] is_1485_ = anIntArrayArray9460[i_1484_];
					if ((i_1470_ & 0x1) == 0) {
						for (int i_1486_ = 0; i_1486_ < is_1485_.length; i_1486_++) {
							int i_1487_ = is_1485_[i_1486_];
							anIntArray9524[i_1487_] -= anInt9520;
							anIntArray9458[i_1487_] -= anInt9521;
							anIntArray9493[i_1487_] -= anInt9522;
							if (i_1469_ != 0) {
								int i_1488_ = Class447.anIntArray4906[i_1469_];
								int i_1489_ = Class447.anIntArray4921[i_1469_];
								int i_1490_ = ((anIntArray9458[i_1487_] * i_1488_ + anIntArray9524[i_1487_] * i_1489_ + 16383) >> 14);
								anIntArray9458[i_1487_] = (anIntArray9458[i_1487_] * i_1489_ - anIntArray9524[i_1487_] * i_1488_ + 16383) >> 14;
								anIntArray9524[i_1487_] = i_1490_;
							}
							if (i_1467_ != 0) {
								int i_1491_ = Class447.anIntArray4906[i_1467_];
								int i_1492_ = Class447.anIntArray4921[i_1467_];
								int i_1493_ = ((anIntArray9458[i_1487_] * i_1492_ - anIntArray9493[i_1487_] * i_1491_ + 16383) >> 14);
								anIntArray9493[i_1487_] = (anIntArray9458[i_1487_] * i_1491_ + anIntArray9493[i_1487_] * i_1492_ + 16383) >> 14;
								anIntArray9458[i_1487_] = i_1493_;
							}
							if (i_1468_ != 0) {
								int i_1494_ = Class447.anIntArray4906[i_1468_];
								int i_1495_ = Class447.anIntArray4921[i_1468_];
								int i_1496_ = ((anIntArray9493[i_1487_] * i_1494_ + anIntArray9524[i_1487_] * i_1495_ + 16383) >> 14);
								anIntArray9493[i_1487_] = (anIntArray9493[i_1487_] * i_1495_ - anIntArray9524[i_1487_] * i_1494_ + 16383) >> 14;
								anIntArray9524[i_1487_] = i_1496_;
							}
							anIntArray9524[i_1487_] += anInt9520;
							anIntArray9458[i_1487_] += anInt9521;
							anIntArray9493[i_1487_] += anInt9522;
						}
					} else {
						for (int i_1497_ = 0; i_1497_ < is_1485_.length; i_1497_++) {
							int i_1498_ = is_1485_[i_1497_];
							anIntArray9524[i_1498_] -= anInt9520;
							anIntArray9458[i_1498_] -= anInt9521;
							anIntArray9493[i_1498_] -= anInt9522;
							if (i_1467_ != 0) {
								int i_1499_ = Class447.anIntArray4906[i_1467_];
								int i_1500_ = Class447.anIntArray4921[i_1467_];
								int i_1501_ = ((anIntArray9458[i_1498_] * i_1500_ - anIntArray9493[i_1498_] * i_1499_ + 16383) >> 14);
								anIntArray9493[i_1498_] = (anIntArray9458[i_1498_] * i_1499_ + anIntArray9493[i_1498_] * i_1500_ + 16383) >> 14;
								anIntArray9458[i_1498_] = i_1501_;
							}
							if (i_1469_ != 0) {
								int i_1502_ = Class447.anIntArray4906[i_1469_];
								int i_1503_ = Class447.anIntArray4921[i_1469_];
								int i_1504_ = ((anIntArray9458[i_1498_] * i_1502_ + anIntArray9524[i_1498_] * i_1503_ + 16383) >> 14);
								anIntArray9458[i_1498_] = (anIntArray9458[i_1498_] * i_1503_ - anIntArray9524[i_1498_] * i_1502_ + 16383) >> 14;
								anIntArray9524[i_1498_] = i_1504_;
							}
							if (i_1468_ != 0) {
								int i_1505_ = Class447.anIntArray4906[i_1468_];
								int i_1506_ = Class447.anIntArray4921[i_1468_];
								int i_1507_ = ((anIntArray9493[i_1498_] * i_1505_ + anIntArray9524[i_1498_] * i_1506_ + 16383) >> 14);
								anIntArray9493[i_1498_] = (anIntArray9493[i_1498_] * i_1506_ - anIntArray9524[i_1498_] * i_1505_ + 16383) >> 14;
								anIntArray9524[i_1498_] = i_1507_;
							}
							anIntArray9524[i_1498_] += anInt9520;
							anIntArray9458[i_1498_] += anInt9521;
							anIntArray9493[i_1498_] += anInt9522;
						}
					}
				}
			}
			if (bool) {
				for (int i_1508_ = 0; i_1508_ < i_1471_; i_1508_++) {
					int i_1509_ = is[i_1508_];
					if (i_1509_ < anIntArrayArray9460.length) {
						int[] is_1510_ = anIntArrayArray9460[i_1509_];
						for (int i_1511_ = 0; i_1511_ < is_1510_.length; i_1511_++) {
							int i_1512_ = is_1510_[i_1511_];
							int i_1513_ = anIntArray9468[i_1512_];
							int i_1514_ = anIntArray9468[i_1512_ + 1];
							for (int i_1515_ = i_1513_; (i_1515_ < i_1514_ && aShortArray9506[i_1515_] != 0); i_1515_++) {
								int i_1516_ = (aShortArray9506[i_1515_] & 0xffff) - 1;
								if (i_1469_ != 0) {
									int i_1517_ = Class447.anIntArray4906[i_1469_];
									int i_1518_ = Class447.anIntArray4921[i_1469_];
									int i_1519_ = (aShortArray9466[i_1516_] * i_1517_ + aShortArray9500[i_1516_] * i_1518_ + 16383) >> 14;
									aShortArray9466[i_1516_] = (short) (((aShortArray9466[i_1516_] * i_1518_) - (aShortArray9500[i_1516_] * i_1517_) + 16383) >> 14);
									aShortArray9500[i_1516_] = (short) i_1519_;
								}
								if (i_1467_ != 0) {
									int i_1520_ = Class447.anIntArray4906[i_1467_];
									int i_1521_ = Class447.anIntArray4921[i_1467_];
									int i_1522_ = (aShortArray9466[i_1516_] * i_1521_ - aShortArray9467[i_1516_] * i_1520_ + 16383) >> 14;
									aShortArray9467[i_1516_] = (short) (((aShortArray9466[i_1516_] * i_1520_) + (aShortArray9467[i_1516_] * i_1521_) + 16383) >> 14);
									aShortArray9466[i_1516_] = (short) i_1522_;
								}
								if (i_1468_ != 0) {
									int i_1523_ = Class447.anIntArray4906[i_1468_];
									int i_1524_ = Class447.anIntArray4921[i_1468_];
									int i_1525_ = (aShortArray9467[i_1516_] * i_1523_ + aShortArray9500[i_1516_] * i_1524_ + 16383) >> 14;
									aShortArray9467[i_1516_] = (short) (((aShortArray9467[i_1516_] * i_1524_) - (aShortArray9500[i_1516_] * i_1523_) + 16383) >> 14);
									aShortArray9500[i_1516_] = (short) i_1525_;
								}
							}
						}
					}
				}
				method8679();
			}
		} else if (i == 3) {
			for (int i_1526_ = 0; i_1526_ < i_1471_; i_1526_++) {
				int i_1527_ = is[i_1526_];
				if (i_1527_ < anIntArrayArray9460.length) {
					int[] is_1528_ = anIntArrayArray9460[i_1527_];
					for (int i_1529_ = 0; i_1529_ < is_1528_.length; i_1529_++) {
						int i_1530_ = is_1528_[i_1529_];
						anIntArray9524[i_1530_] -= anInt9520;
						anIntArray9458[i_1530_] -= anInt9521;
						anIntArray9493[i_1530_] -= anInt9522;
						anIntArray9524[i_1530_] = anIntArray9524[i_1530_] * i_1467_ >> 7;
						anIntArray9458[i_1530_] = anIntArray9458[i_1530_] * i_1468_ >> 7;
						anIntArray9493[i_1530_] = anIntArray9493[i_1530_] * i_1469_ >> 7;
						anIntArray9524[i_1530_] += anInt9520;
						anIntArray9458[i_1530_] += anInt9521;
						anIntArray9493[i_1530_] += anInt9522;
					}
				}
			}
		} else if (i == 5) {
			if (anIntArrayArray9480 != null) {
				boolean bool_1531_ = false;
				for (int i_1532_ = 0; i_1532_ < i_1471_; i_1532_++) {
					int i_1533_ = is[i_1532_];
					if (i_1533_ < anIntArrayArray9480.length) {
						int[] is_1534_ = anIntArrayArray9480[i_1533_];
						for (int i_1535_ = 0; i_1535_ < is_1534_.length; i_1535_++) {
							int i_1536_ = is_1534_[i_1535_];
							int i_1537_ = ((aByteArray9448[i_1536_] & 0xff) + i_1467_ * 8);
							if (i_1537_ < 0)
								i_1537_ = 0;
							else if (i_1537_ > 255)
								i_1537_ = 255;
							aByteArray9448[i_1536_] = (byte) i_1537_;
						}
						bool_1531_ = bool_1531_ | is_1534_.length > 0;
					}
				}
				if (bool_1531_) {
					if (aClass372Array9510 != null) {
						for (int i_1538_ = 0; i_1538_ < anInt9509; i_1538_++) {
							Class372 class372 = aClass372Array9510[i_1538_];
							Class346 class346 = aClass346Array9511[i_1538_];
							class346.anInt3686 = (class346.anInt3686 & 0xffffff | 255 - (aByteArray9448[class372.anInt3889] & 0xff) << 24);
						}
					}
					method8678();
				}
			}
		} else if (i == 7) {
			if (anIntArrayArray9480 != null) {
				boolean bool_1539_ = false;
				for (int i_1540_ = 0; i_1540_ < i_1471_; i_1540_++) {
					int i_1541_ = is[i_1540_];
					if (i_1541_ < anIntArrayArray9480.length) {
						int[] is_1542_ = anIntArrayArray9480[i_1541_];
						for (int i_1543_ = 0; i_1543_ < is_1542_.length; i_1543_++) {
							int i_1544_ = is_1542_[i_1543_];
							int i_1545_ = aShortArray9490[i_1544_] & 0xffff;
							int i_1546_ = i_1545_ >> 10 & 0x3f;
							int i_1547_ = i_1545_ >> 7 & 0x7;
							int i_1548_ = i_1545_ & 0x7f;
							i_1546_ = i_1546_ + i_1467_ & 0x3f;
							i_1547_ += i_1468_ / 4;
							if (i_1547_ < 0)
								i_1547_ = 0;
							else if (i_1547_ > 7)
								i_1547_ = 7;
							i_1548_ += i_1469_;
							if (i_1548_ < 0)
								i_1548_ = 0;
							else if (i_1548_ > 127)
								i_1548_ = 127;
							aShortArray9490[i_1544_] = (short) (i_1546_ << 10 | i_1547_ << 7 | i_1548_);
						}
						bool_1539_ = bool_1539_ | is_1542_.length > 0;
					}
				}
				if (bool_1539_) {
					if (aClass372Array9510 != null) {
						for (int i_1549_ = 0; i_1549_ < anInt9509; i_1549_++) {
							Class372 class372 = aClass372Array9510[i_1549_];
							Class346 class346 = aClass346Array9511[i_1549_];
							class346.anInt3686 = (class346.anInt3686 & ~0xffffff | (ColourUtils.anIntArray8309[(aShortArray9490[class372.anInt3889] & 0xffff)]) & 0xffffff);
						}
					}
					method8678();
				}
			}
		} else if (i == 8) {
			if (anIntArrayArray9451 != null) {
				for (int i_1550_ = 0; i_1550_ < i_1471_; i_1550_++) {
					int i_1551_ = is[i_1550_];
					if (i_1551_ < anIntArrayArray9451.length) {
						int[] is_1552_ = anIntArrayArray9451[i_1551_];
						for (int i_1553_ = 0; i_1553_ < is_1552_.length; i_1553_++) {
							Class346 class346 = aClass346Array9511[is_1552_[i_1553_]];
							class346.anInt3685 += i_1467_;
							class346.anInt3682 += i_1468_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (anIntArrayArray9451 != null) {
				for (int i_1554_ = 0; i_1554_ < i_1471_; i_1554_++) {
					int i_1555_ = is[i_1554_];
					if (i_1555_ < anIntArrayArray9451.length) {
						int[] is_1556_ = anIntArrayArray9451[i_1555_];
						for (int i_1557_ = 0; i_1557_ < is_1556_.length; i_1557_++) {
							Class346 class346 = aClass346Array9511[is_1556_[i_1557_]];
							class346.anInt3683 = class346.anInt3683 * i_1467_ >> 7;
							class346.anInt3684 = class346.anInt3684 * i_1468_ >> 7;
						}
					}
				}
			}
		} else if (i == 9) {
			if (anIntArrayArray9451 != null) {
				for (int i_1558_ = 0; i_1558_ < i_1471_; i_1558_++) {
					int i_1559_ = is[i_1558_];
					if (i_1559_ < anIntArrayArray9451.length) {
						int[] is_1560_ = anIntArrayArray9451[i_1559_];
						for (int i_1561_ = 0; i_1561_ < is_1560_.length; i_1561_++) {
							Class346 class346 = aClass346Array9511[is_1560_[i_1561_]];
							class346.anInt3687 = class346.anInt3687 + i_1467_ & 0x3fff;
						}
					}
				}
			}
		}
	}

	public int method2578() {
		if (!aBool9471)
			method8681();
		return anInt9495;
	}

	void method8703() {
		if (aClass375_9483 != null)
			aClass375_9483.method4788();
		if (aClass375_9486 != null)
			aClass375_9486.method4788();
		if (aClass375_9484 != null)
			aClass375_9484.method4788();
		if (aClass375_9485 != null)
			aClass375_9485.method4788();
		if (aClass348_9482 != null)
			aClass348_9482.method4590();
	}

	void method8704() {
		if (aClass375_9483 != null)
			aClass375_9483.method4788();
		if (aClass375_9486 != null)
			aClass375_9486.method4788();
		if (aClass375_9484 != null)
			aClass375_9484.method4788();
		if (aClass375_9485 != null)
			aClass375_9485.method4788();
		if (aClass348_9482 != null)
			aClass348_9482.method4590();
	}

	int method8705(int i, int i_1562_) {
		i_1562_ = i_1562_ * (i & 0x7f) >> 7;
		if (i_1562_ < 2)
			i_1562_ = 2;
		else if (i_1562_ > 126)
			i_1562_ = 126;
		return (i & 0xff80) + i_1562_;
	}

	public void method2508(byte i, byte[] is) {
		if (is == null) {
			for (int i_1563_ = 0; i_1563_ < anInt9472; i_1563_++)
				aByteArray9448[i_1563_] = i;
		} else {
			for (int i_1564_ = 0; i_1564_ < anInt9472; i_1564_++) {
				int i_1565_ = 255 - ((255 - (is[i_1564_] & 0xff)) * (255 - (i & 0xff)) / 255);
				aByteArray9448[i_1564_] = (byte) i_1565_;
			}
		}
		method8678();
	}
}
