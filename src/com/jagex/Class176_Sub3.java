/* Class176_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.nio.ByteBuffer;

import sun.misc.Unsafe;

public class Class176_Sub3 extends Class176 {
	float[] aFloatArray9294;
	static final int anInt9295 = 7;
	Class180_Sub2 aClass180_Sub2_9296;
	int anInt9297;
	int anInt9298;
	Class363 aClass363_9299;
	short aShort9300;
	int anInt9301 = 0;
	int anInt9302 = 0;
	Class167[] aClass167Array9303;
	boolean aBool9304;
	short[] aShortArray9305;
	int[][] anIntArrayArray9306;
	short[] aShortArray9307;
	int anInt9308 = 0;
	int anInt9309;
	int[][] anIntArrayArray9310;
	short[] aShortArray9311;
	static final int anInt9312 = 4;
	short[] aShortArray9313;
	byte[] aByteArray9314;
	float[] aFloatArray9315;
	float[] aFloatArray9316;
	Class379 aClass379_9317;
	int anInt9318;
	int anInt9319;
	boolean aBool9320;
	byte[] aByteArray9321;
	short[] aShortArray9322;
	short[] aShortArray9323;
	short[] aShortArray9324;
	short[] aShortArray9325;
	short[] aShortArray9326;
	short[] aShortArray9327;
	boolean aBool9328;
	int[][] anIntArrayArray9329;
	int[] anIntArray9330;
	int anInt9331;
	Class363 aClass363_9332;
	short[] aShortArray9333;
	Class363 aClass363_9334;
	boolean aBool9335;
	boolean aBool9336;
	int anInt9337;
	int[] anIntArray9338;
	short aShort9339;
	int anInt9340;
	boolean aBool9341;
	int anInt9342;
	int anInt9343;
	int anInt9344;
	int anInt9345;
	boolean aBool9346;
	Class354[] aClass354Array9347;
	int[] anIntArray9348;
	int[] anIntArray9349;
	int[] anIntArray9350;
	int[] anIntArray9351;
	int[] anIntArray9352;
	int anInt9353;
	Class159[] aClass159Array9354;
	int anInt9355;
	Class361[] aClass361Array9356;
	int anInt9357;
	short[] aShortArray9358;
	long[] aLongArray9359;
	int[] anIntArray9360;
	Class344 aClass344_9361;
	int[] anIntArray9362;
	int[] anIntArray9363;
	int[] anIntArray9364;
	int[] anIntArray9365;
	short[] aShortArray9366;
	int anInt9367;
	Class363 aClass363_9368;
	int anInt9369 = 0;
	static Class348 aClass348_9370;

	public Class176 method2922(byte i, int i_0_, boolean bool) {
		boolean bool_1_ = false;
		Class176_Sub3 class176_sub3_2_;
		Class176_Sub3 class176_sub3_3_;
		if (i > 0 && i <= 8) {
			class176_sub3_3_ = aClass180_Sub2_9296.aClass176_Sub3Array9600[i - 1];
			class176_sub3_2_ = aClass180_Sub2_9296.aClass176_Sub3Array9599[i - 1];
			bool_1_ = true;
		} else
			class176_sub3_2_ = class176_sub3_3_ = new Class176_Sub3(aClass180_Sub2_9296, 0, 0, true, false);
		return method14810(class176_sub3_2_, class176_sub3_3_, i_0_, bool_1_, bool);
	}

	Class176_Sub3(Class180_Sub2 class180_sub2, Class175 class175, int i, int i_4_, int i_5_, int i_6_) {
		this(class180_sub2, i, i_6_, true, false);
		Class181 class181 = class180_sub2.aClass181_2059;
		Interface48 interface48 = class180_sub2.anInterface48_2067;
		int[] is = new int[class175.anInt1917];
		anIntArray9351 = new int[class175.anInt1912 + 1];
		for (int i_7_ = 0; i_7_ < class175.anInt1917; i_7_++) {
			if (class175.aByteArray1928 == null || class175.aByteArray1928[i_7_] != 2) {
				if (class175.aShortArray1929 != null && class175.aShortArray1929[i_7_] != -1) {
					Class163 class163 = class181.method3544((class175.aShortArray1929[i_7_] & 0xffff), (byte) 4);
					if (((anInt9298 & 0x40) == 0 || !class163.aBool1806) && class163.aBool1782)
						continue;
				}
				is[anInt9369++] = i_7_;
				anIntArray9351[class175.aShortArray1918[i_7_]]++;
				anIntArray9351[class175.aShortArray1940[i_7_]]++;
				anIntArray9351[class175.aShortArray1920[i_7_]]++;
			}
		}
		anInt9319 = anInt9369;
		long[] ls = new long[anInt9369];
		boolean bool = (anInt9297 & 0x100) != 0;
		for (int i_8_ = 0; i_8_ < anInt9369; i_8_++) {
			int i_9_ = is[i_8_];
			Class163 class163 = null;
			int i_10_ = 0;
			int i_11_ = 0;
			int i_12_ = 0;
			int i_13_ = 0;
			if (class175.aClass183Array1947 != null) {
				boolean bool_14_ = false;
				for (int i_15_ = 0; i_15_ < class175.aClass183Array1947.length; i_15_++) {
					Class183 class183 = class175.aClass183Array1947[i_15_];
					if (i_9_ == class183.anInt2097 * -214271421) {
						Class393 class393 = interface48.method336((class183.anInt2099 * 1280345283), 634542251);
						if (class393.aBool4018)
							bool_14_ = true;
						if (class393.anInt4021 * 1521281507 != -1) {
							Class163 class163_16_ = class181.method3544((class393.anInt4021 * 1521281507), (byte) -105);
							if (class163_16_.aClass595_1784 == Class595.aClass595_7814)
								aBool9335 = true;
						}
					}
				}
				if (bool_14_) {
					ls[i_8_] = 9223372036854775807L;
					anInt9319--;
					continue;
				}
			}
			if (class175.aClass167Array1948 != null) {
				boolean bool_17_ = false;
				for (int i_18_ = 0; i_18_ < class175.aClass167Array1948.length; i_18_++) {
					Class167 class167 = class175.aClass167Array1948[i_18_];
					if (i_9_ == class167.anInt1848 * 359046121) {
						Class394 class394 = (aClass180_Sub2_9296.anInterface46_2078.method330(class167.anInt1854 * -1557661391, 1021147888));
						if (class394.aBool4098)
							bool_17_ = true;
					}
				}
				if (bool_17_) {
					ls[i_8_] = 9223372036854775807L;
					anInt9319--;
					continue;
				}
			}
			int i_19_ = -1;
			if (class175.aShortArray1929 != null) {
				i_19_ = class175.aShortArray1929[i_9_];
				if (i_19_ != -1) {
					class163 = class181.method3544(i_19_ & 0xffff, (byte) -77);
					if ((anInt9298 & 0x40) == 0 || !class163.aBool1806) {
						i_12_ = class163.aByte1801;
						i_13_ = class163.aByte1775;
					} else {
						i_19_ = -1;
						class163 = null;
					}
				}
			}
			boolean bool_20_ = ((class175.aByteArray1907 != null && class175.aByteArray1907[i_9_] != 0) || (class163 != null && class163.aClass595_1784 != Class595.aClass595_7816));
			if ((bool || bool_20_) && class175.aByteArray1924 != null)
				i_10_ += class175.aByteArray1924[i_9_] << 17;
			if (bool_20_)
				i_10_ += 65536;
			i_10_ += (i_12_ & 0xff) << 8;
			i_10_ += i_13_ & 0xff;
			i_11_ += (i_19_ & 0xffff) << 16;
			i_11_ += i_8_ & 0xffff;
			ls[i_8_] = ((long) i_10_ << 32) + (long) i_11_;
			aBool9335 |= bool_20_;
			Class176_Sub3 class176_sub3_21_ = this;
			class176_sub3_21_.aBool9336 = (class176_sub3_21_.aBool9336 | (class163 != null && (class163.aByte1781 != 0 || class163.aByte1797 != 0)));
		}
		Class98.method1752(ls, is, -1347337418);
		anInt9301 = class175.anInt1906;
		anInt9302 = class175.anInt1912;
		anIntArray9352 = class175.anIntArray1908;
		anIntArray9360 = class175.anIntArray1909;
		anIntArray9362 = class175.anIntArray1910;
		aShortArray9307 = class175.aShortArray1913;
		Class369[] class369s = new Class369[anInt9302];
		aClass167Array9303 = class175.aClass167Array1948;
		aClass159Array9354 = class175.aClass159Array1925;
		if (class175.aClass183Array1947 != null) {
			anInt9355 = class175.aClass183Array1947.length;
			aClass361Array9356 = new Class361[anInt9355];
			aClass354Array9347 = new Class354[anInt9355];
			for (int i_22_ = 0; i_22_ < anInt9355; i_22_++) {
				Class183 class183 = class175.aClass183Array1947[i_22_];
				Class393 class393 = interface48.method336(class183.anInt2099 * 1280345283, 104094781);
				int i_23_ = -1;
				for (int i_24_ = 0; i_24_ < anInt9369; i_24_++) {
					if (is[i_24_] == class183.anInt2097 * -214271421) {
						i_23_ = i_24_;
						break;
					}
				}
				if (i_23_ == -1)
					throw new RuntimeException();
				int i_25_ = ((Class656.anIntArray8390[(class175.aShortArray1942[class183.anInt2097 * -214271421]) & 0xffff]) & 0xffffff);
				i_25_ = i_25_ | 255 - (class175.aByteArray1907 != null ? (class175.aByteArray1907[class183.anInt2097 * -214271421]) : 0) << 24;
				aClass361Array9356[i_22_] = new Class361(i_23_, (class175.aShortArray1918[class183.anInt2097 * -214271421]), (class175.aShortArray1940[class183.anInt2097 * -214271421]), (class175.aShortArray1920[class183.anInt2097 * -214271421]), class393.anInt4020 * 1759660577, class393.anInt4025 * -1228217751, class393.anInt4021 * 1521281507, class393.anInt4023 * -142033085, class393.anInt4022 * -1198324925, class393.aBool4018, class393.aBool4024, class183.anInt2098 * -1651221637);
				aClass354Array9347[i_22_] = new Class354(i_25_);
			}
		}
		int i_26_ = anInt9369 * 3;
		aShortArray9333 = new short[i_26_];
		aShortArray9358 = new short[i_26_];
		aShortArray9311 = new short[i_26_];
		aShortArray9305 = new short[i_26_];
		aShortArray9313 = new short[i_26_];
		aByteArray9314 = new byte[i_26_];
		aFloatArray9315 = new float[i_26_];
		aFloatArray9316 = new float[i_26_];
		aShortArray9326 = new short[anInt9369];
		aByteArray9321 = new byte[anInt9369];
		aShortArray9322 = new short[anInt9369];
		aShortArray9323 = new short[anInt9369];
		aShortArray9324 = new short[anInt9369];
		aShortArray9325 = new short[anInt9369];
		if (class175.aShortArray1935 != null)
			aShortArray9327 = new short[anInt9369];
		aShort9339 = (short) i_4_;
		aShort9300 = (short) i_5_;
		aShortArray9366 = new short[i_26_];
		aLongArray9359 = new long[i_26_];
		int i_27_ = 0;
		for (int i_28_ = 0; i_28_ < class175.anInt1912; i_28_++) {
			int i_29_ = anIntArray9351[i_28_];
			anIntArray9351[i_28_] = i_27_;
			i_27_ += i_29_;
			class369s[i_28_] = new Class369();
		}
		anIntArray9351[class175.anInt1912] = i_27_;
		Class173 class173 = method2860(class175, is, anInt9369);
		Class367[] class367s = new Class367[class175.anInt1917];
		for (int i_30_ = 0; i_30_ < class175.anInt1917; i_30_++) {
			short i_31_ = class175.aShortArray1918[i_30_];
			short i_32_ = class175.aShortArray1940[i_30_];
			short i_33_ = class175.aShortArray1920[i_30_];
			int i_34_ = anIntArray9352[i_32_] - anIntArray9352[i_31_];
			int i_35_ = anIntArray9360[i_32_] - anIntArray9360[i_31_];
			int i_36_ = anIntArray9362[i_32_] - anIntArray9362[i_31_];
			int i_37_ = anIntArray9352[i_33_] - anIntArray9352[i_31_];
			int i_38_ = anIntArray9360[i_33_] - anIntArray9360[i_31_];
			int i_39_ = anIntArray9362[i_33_] - anIntArray9362[i_31_];
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
			byte i_44_ = (class175.aByteArray1928 == null ? (byte) 0 : class175.aByteArray1928[i_30_]);
			if (i_44_ == 0) {
				Class369 class369 = class369s[i_31_];
				class369.anInt3892 += i_40_;
				class369.anInt3893 += i_41_;
				class369.anInt3894 += i_42_;
				class369.anInt3895++;
				class369 = class369s[i_32_];
				class369.anInt3892 += i_40_;
				class369.anInt3893 += i_41_;
				class369.anInt3894 += i_42_;
				class369.anInt3895++;
				class369 = class369s[i_33_];
				class369.anInt3892 += i_40_;
				class369.anInt3893 += i_41_;
				class369.anInt3894 += i_42_;
				class369.anInt3895++;
			} else if (i_44_ == 1) {
				Class367 class367 = class367s[i_30_] = new Class367();
				class367.anInt3886 = i_40_;
				class367.anInt3885 = i_41_;
				class367.anInt3884 = i_42_;
			}
		}
		for (int i_45_ = 0; i_45_ < anInt9369; i_45_++) {
			int i_46_ = is[i_45_];
			int i_47_ = class175.aShortArray1942[i_46_] & 0xffff;
			int i_48_ = (class175.aByteArray1907 != null ? class175.aByteArray1907[i_46_] & 0xff : 0);
			short i_49_ = (class175.aShortArray1929 == null ? (short) -1 : class175.aShortArray1929[i_46_]);
			if (i_49_ != -1 && (anInt9298 & 0x40) != 0 && class181.method3544(i_49_, (byte) -50).aBool1806)
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
				int i_57_ = (class175.aShortArray1927 != null ? class175.aShortArray1927[i_46_] : -1);
				if (i_57_ == 32766) {
					int i_58_ = class175.aByteArray1944[i_46_] & 0xff;
					int i_59_ = class175.aByteArray1949[i_46_] & 0xff;
					int i_60_ = class175.aByteArray1923[i_46_] & 0xff;
					i_58_ += (class175.anIntArray1911[class175.aShortArray1918[i_46_]]);
					l_56_ = (long) i_58_;
					i_59_ += (class175.anIntArray1911[class175.aShortArray1940[i_46_]]);
					l_55_ = (long) i_58_;
					i_60_ += (class175.anIntArray1911[class175.aShortArray1920[i_46_]]);
					l = (long) i_58_;
					f = class175.aFloatArray1915[i_58_];
					f_50_ = class175.aFloatArray1931[i_58_];
					f_51_ = class175.aFloatArray1915[i_59_];
					f_52_ = class175.aFloatArray1931[i_59_];
					f_53_ = class175.aFloatArray1915[i_60_];
					f_54_ = class175.aFloatArray1931[i_60_];
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
					byte i_64_ = class175.aByteArray1936[i_57_];
					if (i_64_ == 0) {
						short i_65_ = class175.aShortArray1918[i_46_];
						short i_66_ = class175.aShortArray1940[i_46_];
						short i_67_ = class175.aShortArray1920[i_46_];
						short i_68_ = class175.aShortArray1937[i_57_];
						short i_69_ = class175.aShortArray1938[i_57_];
						short i_70_ = class175.aShortArray1939[i_57_];
						float f_71_ = (float) class175.anIntArray1908[i_68_];
						float f_72_ = (float) class175.anIntArray1909[i_68_];
						float f_73_ = (float) class175.anIntArray1910[i_68_];
						float f_74_ = (float) class175.anIntArray1908[i_69_] - f_71_;
						float f_75_ = (float) class175.anIntArray1909[i_69_] - f_72_;
						float f_76_ = (float) class175.anIntArray1910[i_69_] - f_73_;
						float f_77_ = (float) class175.anIntArray1908[i_70_] - f_71_;
						float f_78_ = (float) class175.anIntArray1909[i_70_] - f_72_;
						float f_79_ = (float) class175.anIntArray1910[i_70_] - f_73_;
						float f_80_ = (float) class175.anIntArray1908[i_65_] - f_71_;
						float f_81_ = (float) class175.anIntArray1909[i_65_] - f_72_;
						float f_82_ = (float) class175.anIntArray1910[i_65_] - f_73_;
						float f_83_ = (float) class175.anIntArray1908[i_66_] - f_71_;
						float f_84_ = (float) class175.anIntArray1909[i_66_] - f_72_;
						float f_85_ = (float) class175.anIntArray1910[i_66_] - f_73_;
						float f_86_ = (float) class175.anIntArray1908[i_67_] - f_71_;
						float f_87_ = (float) class175.anIntArray1909[i_67_] - f_72_;
						float f_88_ = (float) class175.anIntArray1910[i_67_] - f_73_;
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
						short i_96_ = class175.aShortArray1918[i_46_];
						short i_97_ = class175.aShortArray1940[i_46_];
						short i_98_ = class175.aShortArray1920[i_46_];
						int i_99_ = class173.anIntArray1887[i_57_];
						int i_100_ = class173.anIntArray1884[i_57_];
						int i_101_ = class173.anIntArray1885[i_57_];
						float[] fs = class173.aFloatArrayArray1886[i_57_];
						byte i_102_ = class175.aByteArray1932[i_57_];
						float f_103_ = (float) class175.anIntArray1902[i_57_] / 256.0F;
						if (i_64_ == 1) {
							float f_104_ = ((float) class175.anIntArray1943[i_57_] / 1024.0F);
							method2857(class175.anIntArray1908[i_96_], class175.anIntArray1909[i_96_], class175.anIntArray1910[i_96_], i_99_, i_100_, i_101_, fs, f_104_, i_102_, f_103_, aFloatArray9294);
							f = aFloatArray9294[0];
							f_50_ = aFloatArray9294[1];
							method2857(class175.anIntArray1908[i_97_], class175.anIntArray1909[i_97_], class175.anIntArray1910[i_97_], i_99_, i_100_, i_101_, fs, f_104_, i_102_, f_103_, aFloatArray9294);
							f_51_ = aFloatArray9294[0];
							f_52_ = aFloatArray9294[1];
							method2857(class175.anIntArray1908[i_98_], class175.anIntArray1909[i_98_], class175.anIntArray1910[i_98_], i_99_, i_100_, i_101_, fs, f_104_, i_102_, f_103_, aFloatArray9294);
							f_53_ = aFloatArray9294[0];
							f_54_ = aFloatArray9294[1];
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
							float f_106_ = ((float) class175.anIntArray1950[i_57_] / 256.0F);
							float f_107_ = ((float) class175.anIntArray1945[i_57_] / 256.0F);
							int i_108_ = (class175.anIntArray1908[i_97_] - class175.anIntArray1908[i_96_]);
							int i_109_ = (class175.anIntArray1909[i_97_] - class175.anIntArray1909[i_96_]);
							int i_110_ = (class175.anIntArray1910[i_97_] - class175.anIntArray1910[i_96_]);
							int i_111_ = (class175.anIntArray1908[i_98_] - class175.anIntArray1908[i_96_]);
							int i_112_ = (class175.anIntArray1909[i_98_] - class175.anIntArray1909[i_96_]);
							int i_113_ = (class175.anIntArray1910[i_98_] - class175.anIntArray1910[i_96_]);
							int i_114_ = i_109_ * i_113_ - i_112_ * i_110_;
							int i_115_ = i_110_ * i_111_ - i_113_ * i_108_;
							int i_116_ = i_108_ * i_112_ - i_111_ * i_109_;
							float f_117_ = (64.0F / (float) class175.anIntArray1930[i_57_]);
							float f_118_ = (64.0F / (float) class175.anIntArray1941[i_57_]);
							float f_119_ = (64.0F / (float) class175.anIntArray1943[i_57_]);
							float f_120_ = (((float) i_114_ * fs[0] + (float) i_115_ * fs[1] + (float) i_116_ * fs[2]) / f_117_);
							float f_121_ = (((float) i_114_ * fs[3] + (float) i_115_ * fs[4] + (float) i_116_ * fs[5]) / f_118_);
							float f_122_ = (((float) i_114_ * fs[6] + (float) i_115_ * fs[7] + (float) i_116_ * fs[8]) / f_119_);
							i_61_ = method2858(f_120_, f_121_, f_122_);
							method2859(class175.anIntArray1908[i_96_], class175.anIntArray1909[i_96_], class175.anIntArray1910[i_96_], i_99_, i_100_, i_101_, i_61_, fs, i_102_, f_103_, f_106_, f_107_, aFloatArray9294);
							f = aFloatArray9294[0];
							f_50_ = aFloatArray9294[1];
							method2859(class175.anIntArray1908[i_97_], class175.anIntArray1909[i_97_], class175.anIntArray1910[i_97_], i_99_, i_100_, i_101_, i_61_, fs, i_102_, f_103_, f_106_, f_107_, aFloatArray9294);
							f_51_ = aFloatArray9294[0];
							f_52_ = aFloatArray9294[1];
							method2859(class175.anIntArray1908[i_98_], class175.anIntArray1909[i_98_], class175.anIntArray1910[i_98_], i_99_, i_100_, i_101_, i_61_, fs, i_102_, f_103_, f_106_, f_107_, aFloatArray9294);
							f_53_ = aFloatArray9294[0];
							f_54_ = aFloatArray9294[1];
						} else if (i_64_ == 3) {
							method2856(class175.anIntArray1908[i_96_], class175.anIntArray1909[i_96_], class175.anIntArray1910[i_96_], i_99_, i_100_, i_101_, fs, i_102_, f_103_, aFloatArray9294);
							f = aFloatArray9294[0];
							f_50_ = aFloatArray9294[1];
							method2856(class175.anIntArray1908[i_97_], class175.anIntArray1909[i_97_], class175.anIntArray1910[i_97_], i_99_, i_100_, i_101_, fs, i_102_, f_103_, aFloatArray9294);
							f_51_ = aFloatArray9294[0];
							f_52_ = aFloatArray9294[1];
							method2856(class175.anIntArray1908[i_98_], class175.anIntArray1909[i_98_], class175.anIntArray1910[i_98_], i_99_, i_100_, i_101_, fs, i_102_, f_103_, aFloatArray9294);
							f_53_ = aFloatArray9294[0];
							f_54_ = aFloatArray9294[1];
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
			byte i_123_ = (class175.aByteArray1928 != null ? class175.aByteArray1928[i_46_] : (byte) 0);
			if (i_123_ == 0) {
				long l_124_ = (long) ((i_47_ << 8) + i_48_);
				short i_125_ = class175.aShortArray1918[i_46_];
				short i_126_ = class175.aShortArray1940[i_46_];
				short i_127_ = class175.aShortArray1920[i_46_];
				Class369 class369 = class369s[i_125_];
				aShortArray9322[i_45_] = method14746(class175, i_125_, i_45_, l_124_ | l_56_ << 24, class369.anInt3892, class369.anInt3893, class369.anInt3894, class369.anInt3895, f, f_50_);
				class369 = class369s[i_126_];
				aShortArray9323[i_45_] = method14746(class175, i_126_, i_45_, l_124_ | l_55_ << 24, class369.anInt3892, class369.anInt3893, class369.anInt3894, class369.anInt3895, f_51_, f_52_);
				class369 = class369s[i_127_];
				aShortArray9324[i_45_] = method14746(class175, i_127_, i_45_, l_124_ | l << 24, class369.anInt3892, class369.anInt3893, class369.anInt3894, class369.anInt3895, f_53_, f_54_);
			} else if (i_123_ == 1) {
				Class367 class367 = class367s[i_46_];
				long l_128_ = (((long) (class367.anInt3886 & ~0x7fffffff) << 9) + ((long) (class367.anInt3885 + 256) << 32) + ((long) (class367.anInt3884 + 256) << 24) + (long) (i_47_ << 8) + (long) i_48_);
				aShortArray9322[i_45_] = method14746(class175, class175.aShortArray1918[i_46_], i_45_, l_128_ | l_56_ << 41, class367.anInt3886, class367.anInt3885, class367.anInt3884, 0, f, f_50_);
				aShortArray9323[i_45_] = method14746(class175, class175.aShortArray1940[i_46_], i_45_, l_128_ | l_56_ << 41, class367.anInt3886, class367.anInt3885, class367.anInt3884, 0, f_51_, f_52_);
				aShortArray9324[i_45_] = method14746(class175, class175.aShortArray1920[i_46_], i_45_, l_128_ | l_56_ << 41, class367.anInt3886, class367.anInt3885, class367.anInt3884, 0, f_53_, f_54_);
			}
			if (class175.aByteArray1907 != null)
				aByteArray9321[i_45_] = class175.aByteArray1907[i_46_];
			if (class175.aShortArray1935 != null)
				aShortArray9327[i_45_] = class175.aShortArray1935[i_46_];
			aShortArray9326[i_45_] = class175.aShortArray1942[i_46_];
			aShortArray9325[i_45_] = i_49_;
		}
		if (anInt9319 > 0) {
			int i_129_ = 1;
			short i_130_ = aShortArray9325[0];
			for (int i_131_ = 0; i_131_ < anInt9319; i_131_++) {
				short i_132_ = aShortArray9325[i_131_];
				if (i_132_ != i_130_) {
					i_129_++;
					i_130_ = i_132_;
				}
			}
			anIntArray9349 = new int[i_129_];
			anIntArray9350 = new int[i_129_];
			anIntArray9348 = new int[i_129_ + 1];
			anIntArray9348[0] = 0;
			int i_133_ = anInt9308;
			int i_134_ = 0;
			i_129_ = 0;
			i_130_ = aShortArray9325[0];
			for (int i_135_ = 0; i_135_ < anInt9319; i_135_++) {
				short i_136_ = aShortArray9325[i_135_];
				if (i_136_ != i_130_) {
					anIntArray9349[i_129_] = i_133_;
					anIntArray9350[i_129_] = i_134_ - i_133_ + 1;
					anIntArray9348[++i_129_] = i_135_;
					i_133_ = anInt9308;
					i_134_ = 0;
					i_130_ = i_136_;
				}
				int i_137_ = aShortArray9322[i_135_] & 0xffff;
				if (i_137_ < i_133_)
					i_133_ = i_137_;
				if (i_137_ > i_134_)
					i_134_ = i_137_;
				i_137_ = aShortArray9323[i_135_] & 0xffff;
				if (i_137_ < i_133_)
					i_133_ = i_137_;
				if (i_137_ > i_134_)
					i_134_ = i_137_;
				i_137_ = aShortArray9324[i_135_] & 0xffff;
				if (i_137_ < i_133_)
					i_133_ = i_137_;
				if (i_137_ > i_134_)
					i_134_ = i_137_;
			}
			anIntArray9349[i_129_] = i_133_;
			anIntArray9350[i_129_] = i_134_ - i_133_ + 1;
			anIntArray9348[++i_129_] = anInt9319;
		}
		aLongArray9359 = null;
		aShortArray9333 = method14748(aShortArray9333, anInt9308);
		aShortArray9358 = method14748(aShortArray9358, anInt9308);
		aShortArray9311 = method14748(aShortArray9311, anInt9308);
		aShortArray9305 = method14748(aShortArray9305, anInt9308);
		aShortArray9313 = method14748(aShortArray9313, anInt9308);
		aByteArray9314 = method14747(aByteArray9314, anInt9308);
		aFloatArray9315 = method14749(aFloatArray9315, anInt9308);
		aFloatArray9316 = method14749(aFloatArray9316, anInt9308);
		if (class175.anIntArray1921 != null && Class337.method5934(i, anInt9298))
			anIntArrayArray9306 = class175.method2807(false);
		if (class175.aClass183Array1947 != null && Class337.method5914(i, anInt9298))
			anIntArrayArray9329 = class175.method2809();
		if (class175.anIntArray1914 != null && Class337.method5997(i, anInt9298)) {
			int i_138_ = 0;
			int[] is_139_ = new int[256];
			for (int i_140_ = 0; i_140_ < anInt9369; i_140_++) {
				int i_141_ = class175.anIntArray1914[is[i_140_]];
				if (i_141_ >= 0) {
					is_139_[i_141_]++;
					if (i_141_ > i_138_)
						i_138_ = i_141_;
				}
			}
			anIntArrayArray9310 = new int[i_138_ + 1][];
			for (int i_142_ = 0; i_142_ <= i_138_; i_142_++) {
				anIntArrayArray9310[i_142_] = new int[is_139_[i_142_]];
				is_139_[i_142_] = 0;
			}
			for (int i_143_ = 0; i_143_ < anInt9369; i_143_++) {
				int i_144_ = class175.anIntArray1914[is[i_143_]];
				if (i_144_ >= 0)
					anIntArrayArray9310[i_144_][is_139_[i_144_]++] = i_143_;
			}
		}
	}

	short method14746(Class175 class175, int i, int i_145_, long l, int i_146_, int i_147_, int i_148_, int i_149_, float f, float f_150_) {
		int i_151_ = anIntArray9351[i];
		int i_152_ = anIntArray9351[i + 1];
		int i_153_ = 0;
		for (int i_154_ = i_151_; i_154_ < i_152_; i_154_++) {
			if (aShortArray9366[i_154_] == 0) {
				i_153_ = i_154_;
				break;
			}
			int i_155_ = (aShortArray9366[i_154_] & 0xffff) - 1;
			if (aLongArray9359[i_154_] == l)
				return (short) i_155_;
		}
		aShortArray9366[i_153_] = (short) (anInt9308 + 1);
		aLongArray9359[i_153_] = l;
		aShortArray9358[anInt9308] = (short) i_145_;
		aShortArray9333[anInt9308] = (short) i;
		aShortArray9311[anInt9308] = (short) i_146_;
		aShortArray9305[anInt9308] = (short) i_147_;
		aShortArray9313[anInt9308] = (short) i_148_;
		aByteArray9314[anInt9308] = (byte) i_149_;
		aFloatArray9315[anInt9308] = f;
		aFloatArray9316[anInt9308] = f_150_;
		return (short) anInt9308++;
	}

	static byte[] method14747(byte[] is, int i) {
		byte[] is_156_ = new byte[i];
		System.arraycopy(is, 0, is_156_, 0, i);
		return is_156_;
	}

	static short[] method14748(short[] is, int i) {
		short[] is_157_ = new short[i];
		System.arraycopy(is, 0, is_157_, 0, i);
		return is_157_;
	}

	static float[] method14749(float[] fs, int i) {
		float[] fs_158_ = new float[i];
		System.arraycopy(fs, 0, fs_158_, 0, i);
		return fs_158_;
	}

	public void method3039(int i) {
		aShort9339 = (short) i;
		method14751();
	}

	void method3031() {
		for (int i = 0; i < anInt9301; i++) {
			anIntArray9352[i] = anIntArray9352[i] + 7 >> 4;
			anIntArray9360[i] = anIntArray9360[i] + 7 >> 4;
			anIntArray9362[i] = anIntArray9362[i] + 7 >> 4;
		}
		method14759();
		aBool9304 = false;
	}

	public void method2895() {
		if (anInt9308 > 0 && anInt9319 > 0) {
			method14768();
			method14772();
			method14750();
		}
	}

	public int method2989() {
		if (!aBool9346)
			method2901();
		return anInt9309;
	}

	public int method2902() {
		if (!aBool9304)
			method14754();
		return anInt9344;
	}

	void method14750() {
		if (aBool9320) {
			aBool9320 = false;
			if (aClass167Array9303 == null && aClass159Array9354 == null && aClass361Array9356 == null && !Class337.method6010(anInt9297, anInt9298)) {
				boolean bool = false;
				boolean bool_159_ = false;
				boolean bool_160_ = false;
				if (anIntArray9352 != null && !Class337.method5926(anInt9297, anInt9298)) {
					if (aClass363_9299 == null || aClass363_9299.method6332()) {
						if (!aBool9304)
							method14754();
						bool = true;
					} else
						aBool9320 = true;
				}
				if (anIntArray9360 != null && !Class337.method5927(anInt9297, anInt9298)) {
					if (aClass363_9299 == null || aClass363_9299.method6332()) {
						if (!aBool9304)
							method14754();
						bool_159_ = true;
					} else
						aBool9320 = true;
				}
				if (anIntArray9362 != null && !Class337.method5928(anInt9297, anInt9298)) {
					if (aClass363_9299 == null || aClass363_9299.method6332()) {
						if (!aBool9304)
							method14754();
						bool_160_ = true;
					} else
						aBool9320 = true;
				}
				if (bool)
					anIntArray9352 = null;
				if (bool_159_)
					anIntArray9360 = null;
				if (bool_160_)
					anIntArray9362 = null;
			}
			if (aShortArray9366 != null && anIntArray9352 == null && anIntArray9360 == null && anIntArray9362 == null) {
				aShortArray9366 = null;
				anIntArray9351 = null;
			}
			while_135_: do {
				if (aByteArray9314 != null && !Class337.method5929(anInt9297, anInt9298)) {
					do {
						if ((anInt9298 & 0x37) != 0) {
							if (aClass363_9368 != null && !aClass363_9368.method6332())
								break;
						} else if (aClass363_9334 != null && !aClass363_9334.method6332())
							break;
						aShortArray9313 = null;
						aShortArray9305 = null;
						aShortArray9311 = null;
						aByteArray9314 = null;
						break while_135_;
					} while (false);
					aBool9320 = true;
				}
			} while (false);
			if (aShortArray9326 != null && !Class337.method6008(anInt9297, anInt9298)) {
				if (aClass363_9334 == null || aClass363_9334.method6332())
					aShortArray9326 = null;
				else
					aBool9320 = true;
			}
			if (aByteArray9321 != null && !Class337.method5931(anInt9297, anInt9298)) {
				if (aClass363_9334 == null || aClass363_9334.method6332())
					aByteArray9321 = null;
				else
					aBool9320 = true;
			}
			if (aFloatArray9315 != null && !Class337.method5946(anInt9297, anInt9298)) {
				if (aClass363_9332 == null || aClass363_9332.method6332()) {
					aFloatArray9316 = null;
					aFloatArray9315 = null;
				} else
					aBool9320 = true;
			}
			if (aShortArray9325 != null && !Class337.method5937(anInt9297, anInt9298)) {
				if (aClass363_9334 == null || aClass363_9334.method6332())
					aShortArray9325 = null;
				else
					aBool9320 = true;
			}
			if (aShortArray9322 != null && !Class337.method5989(anInt9297, anInt9298)) {
				if ((aClass344_9361 == null || aClass344_9361.method6088()) && (aClass363_9334 == null || aClass363_9334.method6332())) {
					aShortArray9324 = null;
					aShortArray9323 = null;
					aShortArray9322 = null;
				} else
					aBool9320 = true;
			}
			if (aShortArray9333 != null) {
				if (aClass363_9299 == null || aClass363_9299.method6332())
					aShortArray9333 = null;
				else
					aBool9320 = true;
			}
			if (aShortArray9358 != null) {
				if (aClass363_9334 == null || aClass363_9334.method6332())
					aShortArray9358 = null;
				else
					aBool9320 = true;
			}
			if (anIntArrayArray9310 != null && !Class337.method5997(anInt9297, anInt9298)) {
				anIntArrayArray9310 = null;
				aShortArray9327 = null;
			}
			if (anIntArrayArray9306 != null && !Class337.method5934(anInt9297, anInt9298)) {
				anIntArrayArray9306 = null;
				aShortArray9307 = null;
			}
			if (anIntArrayArray9329 != null && !Class337.method5914(anInt9297, anInt9298))
				anIntArrayArray9329 = null;
			if (anIntArray9348 != null && (anInt9297 & 0x800) == 0 && (anInt9297 & 0x40000) == 0) {
				anIntArray9348 = null;
				anIntArray9350 = null;
				anIntArray9349 = null;
			}
		}
	}

	public boolean method3012() {
		return aBool9335;
	}

	void method14751() {
		if (aClass363_9334 != null)
			aClass363_9334.aBool3855 = false;
	}

	void method14752() {
		if ((anInt9298 & 0x37) != 0) {
			if (aClass363_9368 != null)
				aClass363_9368.aBool3855 = false;
		} else if (aClass363_9334 != null)
			aClass363_9334.aBool3855 = false;
	}

	short method14753(Class175 class175, int i, int i_161_, long l, int i_162_, int i_163_, int i_164_, int i_165_, float f, float f_166_) {
		int i_167_ = anIntArray9351[i];
		int i_168_ = anIntArray9351[i + 1];
		int i_169_ = 0;
		for (int i_170_ = i_167_; i_170_ < i_168_; i_170_++) {
			if (aShortArray9366[i_170_] == 0) {
				i_169_ = i_170_;
				break;
			}
			int i_171_ = (aShortArray9366[i_170_] & 0xffff) - 1;
			if (aLongArray9359[i_170_] == l)
				return (short) i_171_;
		}
		aShortArray9366[i_169_] = (short) (anInt9308 + 1);
		aLongArray9359[i_169_] = l;
		aShortArray9358[anInt9308] = (short) i_161_;
		aShortArray9333[anInt9308] = (short) i;
		aShortArray9311[anInt9308] = (short) i_162_;
		aShortArray9305[anInt9308] = (short) i_163_;
		aShortArray9313[anInt9308] = (short) i_164_;
		aByteArray9314[anInt9308] = (byte) i_165_;
		aFloatArray9315[anInt9308] = f;
		aFloatArray9316[anInt9308] = f_166_;
		return (short) anInt9308++;
	}

	public Class167[] method2974() {
		return aClass167Array9303;
	}

	public void method2867(int i) {
		int i_172_ = Class428.anIntArray4825[i];
		int i_173_ = Class428.anIntArray4819[i];
		for (int i_174_ = 0; i_174_ < anInt9302; i_174_++) {
			int i_175_ = ((anIntArray9362[i_174_] * i_172_ + anIntArray9352[i_174_] * i_173_) >> 14);
			anIntArray9362[i_174_] = (anIntArray9362[i_174_] * i_173_ - anIntArray9352[i_174_] * i_172_) >> 14;
			anIntArray9352[i_174_] = i_175_;
		}
		for (int i_176_ = 0; i_176_ < anInt9308; i_176_++) {
			int i_177_ = ((aShortArray9313[i_176_] * i_172_ + aShortArray9311[i_176_] * i_173_) >> 14);
			aShortArray9313[i_176_] = (short) ((aShortArray9313[i_176_] * i_173_ - aShortArray9311[i_176_] * i_172_) >> 14);
			aShortArray9311[i_176_] = (short) i_177_;
		}
		method14759();
		method14752();
		aBool9304 = false;
	}

	public void method2868(int i) {
		int i_178_ = Class428.anIntArray4825[i];
		int i_179_ = Class428.anIntArray4819[i];
		for (int i_180_ = 0; i_180_ < anInt9302; i_180_++) {
			int i_181_ = ((anIntArray9360[i_180_] * i_179_ - anIntArray9362[i_180_] * i_178_) >> 14);
			anIntArray9362[i_180_] = (anIntArray9360[i_180_] * i_178_ + anIntArray9362[i_180_] * i_179_) >> 14;
			anIntArray9360[i_180_] = i_181_;
		}
		method14759();
		aBool9304 = false;
	}

	public int method2977() {
		if (!aBool9304)
			method14754();
		return anInt9343;
	}

	public void method3015(int i, int i_182_, int i_183_) {
		for (int i_184_ = 0; i_184_ < anInt9302; i_184_++) {
			if (i != 0)
				anIntArray9352[i_184_] += i;
			if (i_182_ != 0)
				anIntArray9360[i_184_] += i_182_;
			if (i_183_ != 0)
				anIntArray9362[i_184_] += i_183_;
		}
		method14759();
		aBool9304 = false;
	}

	public void method2864() {
		for (int i = 0; i < anInt9302; i++)
			anIntArray9362[i] = -anIntArray9362[i];
		for (int i = 0; i < anInt9308; i++)
			aShortArray9313[i] = (short) -aShortArray9313[i];
		for (int i = 0; i < anInt9369; i++) {
			short i_185_ = aShortArray9322[i];
			aShortArray9322[i] = aShortArray9324[i];
			aShortArray9324[i] = i_185_;
		}
		method14759();
		method14752();
		method14769();
		aBool9304 = false;
	}

	public void method2872(int i, int i_186_, int i_187_) {
		for (int i_188_ = 0; i_188_ < anInt9302; i_188_++) {
			if (i != 128)
				anIntArray9352[i_188_] = anIntArray9352[i_188_] * i >> 7;
			if (i_186_ != 128)
				anIntArray9360[i_188_] = anIntArray9360[i_188_] * i_186_ >> 7;
			if (i_187_ != 128)
				anIntArray9362[i_188_] = anIntArray9362[i_188_] * i_187_ >> 7;
		}
		method14759();
		aBool9304 = false;
	}

	public boolean method3035() {
		if (aShortArray9325 == null)
			return true;
		for (int i = 0; i < aShortArray9325.length; i++) {
			if (aShortArray9325[i] != -1 && !(aClass180_Sub2_9296.aClass336_9532.method5884(aClass180_Sub2_9296.aClass181_2059.method3544(aShortArray9325[i], (byte) -56), -1)))
				return false;
		}
		return true;
	}

	void method14754() {
		int i = 32767;
		int i_189_ = 32767;
		int i_190_ = 32767;
		int i_191_ = -32768;
		int i_192_ = -32768;
		int i_193_ = -32768;
		int i_194_ = 0;
		int i_195_ = 0;
		for (int i_196_ = 0; i_196_ < anInt9302; i_196_++) {
			int i_197_ = anIntArray9352[i_196_];
			int i_198_ = anIntArray9360[i_196_];
			int i_199_ = anIntArray9362[i_196_];
			if (i_197_ < i)
				i = i_197_;
			if (i_197_ > i_191_)
				i_191_ = i_197_;
			if (i_198_ < i_189_)
				i_189_ = i_198_;
			if (i_198_ > i_192_)
				i_192_ = i_198_;
			if (i_199_ < i_190_)
				i_190_ = i_199_;
			if (i_199_ > i_193_)
				i_193_ = i_199_;
			int i_200_ = i_197_ * i_197_ + i_199_ * i_199_;
			if (i_200_ > i_194_)
				i_194_ = i_200_;
			i_200_ = i_197_ * i_197_ + i_199_ * i_199_ + i_198_ * i_198_;
			if (i_200_ > i_195_)
				i_195_ = i_200_;
		}
		anInt9342 = i;
		anInt9343 = i_191_;
		anInt9340 = i_189_;
		anInt9318 = i_192_;
		anInt9344 = i_190_;
		anInt9345 = i_193_;
		anInt9331 = (int) (Math.sqrt((double) i_194_) + 0.99);
		anInt9337 = (int) (Math.sqrt((double) i_195_) + 0.99);
		aBool9304 = true;
	}

	void method14755(Class427 class427) {
		if (aClass361Array9356 != null) {
			aClass180_Sub2_9296.method3182(!aBool9335);
			Class432 class432 = aClass180_Sub2_9296.aClass432_9512;
			Class313 class313 = aClass180_Sub2_9296.aClass313_9544;
			boolean bool = aClass180_Sub2_9296.anInt9562 > 0;
			if (bool)
				class313.aClass442_3503.method7138(((float) (aClass180_Sub2_9296.anInt9561 >> 16 & 0xff) / 255.0F), ((float) (aClass180_Sub2_9296.anInt9561 >> 8 & 0xff) / 255.0F), ((float) (aClass180_Sub2_9296.anInt9561 >> 0 & 0xff) / 255.0F));
			else
				class313.aClass442_3503.method7138(0.0F, 0.0F, 0.0F);
			for (int i = 0; i < anInt9355; i++) {
				Class361 class361 = aClass361Array9356[i];
				Class354 class354 = aClass354Array9347[i];
				if (!class361.aBool3848 || !aClass180_Sub2_9296.method3204()) {
					float f = ((float) (anIntArray9352[class361.anInt3844] + anIntArray9352[class361.anInt3842] + anIntArray9352[class361.anInt3846]) * 0.3333333F);
					float f_201_ = ((float) (anIntArray9360[class361.anInt3844] + anIntArray9360[class361.anInt3842] + anIntArray9360[class361.anInt3846]) * 0.3333333F);
					float f_202_ = ((float) (anIntArray9362[class361.anInt3844] + anIntArray9362[class361.anInt3842] + anIntArray9362[class361.anInt3846]) * 0.3333333F);
					float f_203_ = (class427.aFloatArray4807[0] * f + class427.aFloatArray4807[4] * f_201_ + class427.aFloatArray4807[8] * f_202_ + class427.aFloatArray4807[12]);
					float f_204_ = (class427.aFloatArray4807[1] * f + class427.aFloatArray4807[5] * f_201_ + class427.aFloatArray4807[9] * f_202_ + class427.aFloatArray4807[13]);
					float f_205_ = (class427.aFloatArray4807[2] * f + class427.aFloatArray4807[6] * f_201_ + class427.aFloatArray4807[10] * f_202_ + class427.aFloatArray4807[14]);
					float f_206_ = ((float) (1.0 / Math.sqrt((double) (f_203_ * f_203_ + f_204_ * f_204_ + f_205_ * f_205_))) * (float) class361.anInt3849);
					class432.method6884(class354.anInt3809, class354.anInt3805 * class361.aShort3843 >> 7, class354.anInt3808 * class361.aShort3845 >> 7, f_203_ + (float) class354.anInt3807 - f_203_ * f_206_, f_204_ + (float) class354.anInt3806 - f_204_ * f_206_, f_205_ - f_205_ * f_206_);
					class432.method6882(aClass180_Sub2_9296.aClass432_9451);
					aClass180_Sub2_9296.aClass427_9491.method6784(class432);
					class313.method5654(aClass180_Sub2_9296.aClass427_9491);
					class313.aClass427_3501.method6742();
					class313.anInt3499 = class354.anInt3804;
					if (bool)
						class313.aFloat3504 = 1.0F - ((aClass180_Sub2_9296.aFloat9565 - f_205_) / (aClass180_Sub2_9296.aFloat9565 - aClass180_Sub2_9296.aFloat9517));
					class313.anInterface38_3498 = null;
					if (class361.aShort3847 != -1)
						class313.anInterface38_3498 = (aClass180_Sub2_9296.aClass336_9532.method5895(aClass180_Sub2_9296.aClass181_2059.method3544(class361.aShort3847 & 0xffff, (byte) -120)));
					class313.method5656(bool);
				}
			}
			aClass180_Sub2_9296.method3182(true);
		}
	}

	Class176 method14756(Class176_Sub3 class176_sub3_207_, Class176_Sub3 class176_sub3_208_, int i, boolean bool, boolean bool_209_) {
		class176_sub3_207_.anInt9297 = i;
		class176_sub3_207_.anInt9298 = anInt9298;
		class176_sub3_207_.aShort9339 = aShort9339;
		class176_sub3_207_.aShort9300 = aShort9300;
		class176_sub3_207_.anInt9301 = anInt9301;
		class176_sub3_207_.anInt9302 = anInt9302;
		class176_sub3_207_.anInt9308 = anInt9308;
		class176_sub3_207_.anInt9369 = anInt9369;
		class176_sub3_207_.anInt9319 = anInt9319;
		class176_sub3_207_.anInt9355 = anInt9355;
		if ((i & 0x100) != 0)
			class176_sub3_207_.aBool9335 = true;
		else
			class176_sub3_207_.aBool9335 = aBool9335;
		class176_sub3_207_.aBool9336 = aBool9336;
		boolean bool_210_ = Class337.method5904(i, anInt9298);
		boolean bool_211_ = Class337.method5905(i, anInt9298);
		boolean bool_212_ = Class337.method5906(i, anInt9298);
		boolean bool_213_ = bool_210_ | bool_211_ | bool_212_;
		if (bool_213_) {
			if (bool_210_) {
				if (class176_sub3_208_.anIntArray9352 == null || class176_sub3_208_.anIntArray9352.length < anInt9301)
					class176_sub3_207_.anIntArray9352 = class176_sub3_208_.anIntArray9352 = new int[anInt9301];
				else
					class176_sub3_207_.anIntArray9352 = class176_sub3_208_.anIntArray9352;
			} else
				class176_sub3_207_.anIntArray9352 = anIntArray9352;
			if (bool_211_) {
				if (class176_sub3_208_.anIntArray9360 == null || class176_sub3_208_.anIntArray9360.length < anInt9301)
					class176_sub3_207_.anIntArray9360 = class176_sub3_208_.anIntArray9360 = new int[anInt9301];
				else
					class176_sub3_207_.anIntArray9360 = class176_sub3_208_.anIntArray9360;
			} else
				class176_sub3_207_.anIntArray9360 = anIntArray9360;
			if (bool_212_) {
				if (class176_sub3_208_.anIntArray9362 == null || class176_sub3_208_.anIntArray9362.length < anInt9301)
					class176_sub3_207_.anIntArray9362 = class176_sub3_208_.anIntArray9362 = new int[anInt9301];
				else
					class176_sub3_207_.anIntArray9362 = class176_sub3_208_.anIntArray9362;
			} else
				class176_sub3_207_.anIntArray9362 = anIntArray9362;
			for (int i_214_ = 0; i_214_ < anInt9301; i_214_++) {
				if (bool_210_)
					class176_sub3_207_.anIntArray9352[i_214_] = anIntArray9352[i_214_];
				if (bool_211_)
					class176_sub3_207_.anIntArray9360[i_214_] = anIntArray9360[i_214_];
				if (bool_212_)
					class176_sub3_207_.anIntArray9362[i_214_] = anIntArray9362[i_214_];
			}
		} else {
			class176_sub3_207_.anIntArray9352 = anIntArray9352;
			class176_sub3_207_.anIntArray9360 = anIntArray9360;
			class176_sub3_207_.anIntArray9362 = anIntArray9362;
		}
		if (Class337.method5960(i, anInt9298)) {
			class176_sub3_207_.aClass363_9299 = class176_sub3_208_.aClass363_9299;
			class176_sub3_207_.aClass363_9299.anInterface37_3856 = aClass363_9299.anInterface37_3856;
			class176_sub3_207_.aClass363_9299.aBool3855 = aClass363_9299.aBool3855;
			class176_sub3_207_.aClass363_9299.aBool3854 = true;
		} else if (Class337.method5916(i, anInt9298))
			class176_sub3_207_.aClass363_9299 = aClass363_9299;
		else
			class176_sub3_207_.aClass363_9299 = null;
		if (Class337.method5909(i, anInt9298)) {
			if (class176_sub3_208_.aShortArray9326 == null || class176_sub3_208_.aShortArray9326.length < anInt9369)
				class176_sub3_207_.aShortArray9326 = class176_sub3_208_.aShortArray9326 = new short[anInt9369];
			else
				class176_sub3_207_.aShortArray9326 = class176_sub3_208_.aShortArray9326;
			for (int i_215_ = 0; i_215_ < anInt9369; i_215_++)
				class176_sub3_207_.aShortArray9326[i_215_] = aShortArray9326[i_215_];
		} else
			class176_sub3_207_.aShortArray9326 = aShortArray9326;
		if (Class337.method5977(i, anInt9298)) {
			if (class176_sub3_208_.aByteArray9321 == null || class176_sub3_208_.aByteArray9321.length < anInt9369)
				class176_sub3_207_.aByteArray9321 = class176_sub3_208_.aByteArray9321 = new byte[anInt9369];
			else
				class176_sub3_207_.aByteArray9321 = class176_sub3_208_.aByteArray9321;
			for (int i_216_ = 0; i_216_ < anInt9369; i_216_++)
				class176_sub3_207_.aByteArray9321[i_216_] = aByteArray9321[i_216_];
		} else
			class176_sub3_207_.aByteArray9321 = aByteArray9321;
		if (Class337.method5923(i, anInt9298)) {
			class176_sub3_207_.aClass363_9334 = class176_sub3_208_.aClass363_9334;
			class176_sub3_207_.aClass363_9334.anInterface37_3856 = aClass363_9334.anInterface37_3856;
			class176_sub3_207_.aClass363_9334.aBool3855 = aClass363_9334.aBool3855;
			class176_sub3_207_.aClass363_9334.aBool3854 = true;
		} else if (Class337.method5915(i, anInt9298))
			class176_sub3_207_.aClass363_9334 = aClass363_9334;
		else
			class176_sub3_207_.aClass363_9334 = null;
		if (Class337.method5908(i, anInt9298)) {
			if (class176_sub3_208_.aShortArray9311 == null || class176_sub3_208_.aShortArray9311.length < anInt9308) {
				int i_217_ = anInt9308;
				class176_sub3_207_.aShortArray9311 = class176_sub3_208_.aShortArray9311 = new short[i_217_];
				class176_sub3_207_.aShortArray9305 = class176_sub3_208_.aShortArray9305 = new short[i_217_];
				class176_sub3_207_.aShortArray9313 = class176_sub3_208_.aShortArray9313 = new short[i_217_];
			} else {
				class176_sub3_207_.aShortArray9311 = class176_sub3_208_.aShortArray9311;
				class176_sub3_207_.aShortArray9305 = class176_sub3_208_.aShortArray9305;
				class176_sub3_207_.aShortArray9313 = class176_sub3_208_.aShortArray9313;
			}
			if (aClass379_9317 != null) {
				if (class176_sub3_208_.aClass379_9317 == null)
					class176_sub3_208_.aClass379_9317 = new Class379();
				Class379 class379 = (class176_sub3_207_.aClass379_9317 = class176_sub3_208_.aClass379_9317);
				if (class379.aShortArray3928 == null || class379.aShortArray3928.length < anInt9308) {
					int i_218_ = anInt9308;
					class379.aShortArray3928 = new short[i_218_];
					class379.aShortArray3929 = new short[i_218_];
					class379.aShortArray3930 = new short[i_218_];
					class379.aByteArray3931 = new byte[i_218_];
				}
				for (int i_219_ = 0; i_219_ < anInt9308; i_219_++) {
					class176_sub3_207_.aShortArray9311[i_219_] = aShortArray9311[i_219_];
					class176_sub3_207_.aShortArray9305[i_219_] = aShortArray9305[i_219_];
					class176_sub3_207_.aShortArray9313[i_219_] = aShortArray9313[i_219_];
					class379.aShortArray3928[i_219_] = aClass379_9317.aShortArray3928[i_219_];
					class379.aShortArray3929[i_219_] = aClass379_9317.aShortArray3929[i_219_];
					class379.aShortArray3930[i_219_] = aClass379_9317.aShortArray3930[i_219_];
					class379.aByteArray3931[i_219_] = aClass379_9317.aByteArray3931[i_219_];
				}
			} else {
				class176_sub3_207_.aClass379_9317 = null;
				for (int i_220_ = 0; i_220_ < anInt9308; i_220_++) {
					class176_sub3_207_.aShortArray9311[i_220_] = aShortArray9311[i_220_];
					class176_sub3_207_.aShortArray9305[i_220_] = aShortArray9305[i_220_];
					class176_sub3_207_.aShortArray9313[i_220_] = aShortArray9313[i_220_];
				}
			}
			class176_sub3_207_.aByteArray9314 = aByteArray9314;
		} else {
			class176_sub3_207_.aClass379_9317 = aClass379_9317;
			class176_sub3_207_.aShortArray9311 = aShortArray9311;
			class176_sub3_207_.aShortArray9305 = aShortArray9305;
			class176_sub3_207_.aShortArray9313 = aShortArray9313;
			class176_sub3_207_.aByteArray9314 = aByteArray9314;
		}
		if (Class337.method5975(i, anInt9298)) {
			class176_sub3_207_.aClass363_9368 = class176_sub3_208_.aClass363_9368;
			class176_sub3_207_.aClass363_9368.anInterface37_3856 = aClass363_9368.anInterface37_3856;
			class176_sub3_207_.aClass363_9368.aBool3855 = aClass363_9368.aBool3855;
			class176_sub3_207_.aClass363_9368.aBool3854 = true;
		} else if (Class337.method5917(i, anInt9298))
			class176_sub3_207_.aClass363_9368 = aClass363_9368;
		else
			class176_sub3_207_.aClass363_9368 = null;
		if (Class337.method5911(i, anInt9298)) {
			if (class176_sub3_208_.aFloatArray9315 == null || class176_sub3_208_.aFloatArray9315.length < anInt9369) {
				int i_221_ = anInt9308;
				class176_sub3_207_.aFloatArray9315 = class176_sub3_208_.aFloatArray9315 = new float[i_221_];
				class176_sub3_207_.aFloatArray9316 = class176_sub3_208_.aFloatArray9316 = new float[i_221_];
			} else {
				class176_sub3_207_.aFloatArray9315 = class176_sub3_208_.aFloatArray9315;
				class176_sub3_207_.aFloatArray9316 = class176_sub3_208_.aFloatArray9316;
			}
			for (int i_222_ = 0; i_222_ < anInt9308; i_222_++) {
				class176_sub3_207_.aFloatArray9315[i_222_] = aFloatArray9315[i_222_];
				class176_sub3_207_.aFloatArray9316[i_222_] = aFloatArray9316[i_222_];
			}
		} else {
			class176_sub3_207_.aFloatArray9315 = aFloatArray9315;
			class176_sub3_207_.aFloatArray9316 = aFloatArray9316;
		}
		if (Class337.method5924(i, anInt9298)) {
			class176_sub3_207_.aClass363_9332 = class176_sub3_208_.aClass363_9332;
			class176_sub3_207_.aClass363_9332.anInterface37_3856 = aClass363_9332.anInterface37_3856;
			class176_sub3_207_.aClass363_9332.aBool3855 = aClass363_9332.aBool3855;
			class176_sub3_207_.aClass363_9332.aBool3854 = true;
		} else if (Class337.method5919(i, anInt9298))
			class176_sub3_207_.aClass363_9332 = aClass363_9332;
		else
			class176_sub3_207_.aClass363_9332 = null;
		if (Class337.method5913(i, anInt9298)) {
			if (class176_sub3_208_.aShortArray9322 == null || class176_sub3_208_.aShortArray9322.length < anInt9369) {
				int i_223_ = anInt9369;
				class176_sub3_207_.aShortArray9322 = class176_sub3_208_.aShortArray9322 = new short[i_223_];
				class176_sub3_207_.aShortArray9323 = class176_sub3_208_.aShortArray9323 = new short[i_223_];
				class176_sub3_207_.aShortArray9324 = class176_sub3_208_.aShortArray9324 = new short[i_223_];
			} else {
				class176_sub3_207_.aShortArray9322 = class176_sub3_208_.aShortArray9322;
				class176_sub3_207_.aShortArray9323 = class176_sub3_208_.aShortArray9323;
				class176_sub3_207_.aShortArray9324 = class176_sub3_208_.aShortArray9324;
			}
			for (int i_224_ = 0; i_224_ < anInt9369; i_224_++) {
				class176_sub3_207_.aShortArray9322[i_224_] = aShortArray9322[i_224_];
				class176_sub3_207_.aShortArray9323[i_224_] = aShortArray9323[i_224_];
				class176_sub3_207_.aShortArray9324[i_224_] = aShortArray9324[i_224_];
			}
		} else {
			class176_sub3_207_.aShortArray9322 = aShortArray9322;
			class176_sub3_207_.aShortArray9323 = aShortArray9323;
			class176_sub3_207_.aShortArray9324 = aShortArray9324;
		}
		if (Class337.method5925(i, anInt9298)) {
			class176_sub3_207_.aClass344_9361 = class176_sub3_208_.aClass344_9361;
			class176_sub3_207_.aClass344_9361.anInterface44_3693 = aClass344_9361.anInterface44_3693;
			class176_sub3_207_.aClass344_9361.aBool3695 = aClass344_9361.aBool3695;
			class176_sub3_207_.aClass344_9361.aBool3694 = true;
		} else if (Class337.method5920(i, anInt9298))
			class176_sub3_207_.aClass344_9361 = aClass344_9361;
		else
			class176_sub3_207_.aClass344_9361 = null;
		if (Class337.method5956(i, anInt9298)) {
			if (class176_sub3_208_.aShortArray9325 == null || class176_sub3_208_.aShortArray9325.length < anInt9369) {
				int i_225_ = anInt9369;
				class176_sub3_207_.aShortArray9325 = class176_sub3_208_.aShortArray9325 = new short[i_225_];
			} else
				class176_sub3_207_.aShortArray9325 = class176_sub3_208_.aShortArray9325;
			for (int i_226_ = 0; i_226_ < anInt9369; i_226_++)
				class176_sub3_207_.aShortArray9325[i_226_] = aShortArray9325[i_226_];
		} else
			class176_sub3_207_.aShortArray9325 = aShortArray9325;
		if (Class337.method5918(i, anInt9298)) {
			if (class176_sub3_208_.aClass354Array9347 == null || class176_sub3_208_.aClass354Array9347.length < anInt9355) {
				int i_227_ = anInt9355;
				class176_sub3_207_.aClass354Array9347 = class176_sub3_208_.aClass354Array9347 = new Class354[i_227_];
				for (int i_228_ = 0; i_228_ < anInt9355; i_228_++)
					class176_sub3_207_.aClass354Array9347[i_228_] = aClass354Array9347[i_228_].method6256();
			} else {
				class176_sub3_207_.aClass354Array9347 = class176_sub3_208_.aClass354Array9347;
				for (int i_229_ = 0; i_229_ < anInt9355; i_229_++)
					class176_sub3_207_.aClass354Array9347[i_229_].method6258(aClass354Array9347[i_229_]);
			}
		} else
			class176_sub3_207_.aClass354Array9347 = aClass354Array9347;
		class176_sub3_207_.aClass361Array9356 = aClass361Array9356;
		if (aBool9304) {
			class176_sub3_207_.anInt9337 = anInt9337;
			class176_sub3_207_.anInt9331 = anInt9331;
			class176_sub3_207_.anInt9342 = anInt9342;
			class176_sub3_207_.anInt9343 = anInt9343;
			class176_sub3_207_.anInt9340 = anInt9340;
			class176_sub3_207_.anInt9318 = anInt9318;
			class176_sub3_207_.anInt9344 = anInt9344;
			class176_sub3_207_.anInt9345 = anInt9345;
			class176_sub3_207_.aBool9304 = true;
		} else
			class176_sub3_207_.aBool9304 = false;
		if (aBool9346) {
			class176_sub3_207_.anInt9309 = anInt9309;
			class176_sub3_207_.aBool9346 = true;
		} else
			class176_sub3_207_.aBool9346 = false;
		class176_sub3_207_.anIntArrayArray9306 = anIntArrayArray9306;
		class176_sub3_207_.anIntArrayArray9310 = anIntArrayArray9310;
		class176_sub3_207_.anIntArrayArray9329 = anIntArrayArray9329;
		class176_sub3_207_.aShortArray9366 = aShortArray9366;
		class176_sub3_207_.anIntArray9351 = anIntArray9351;
		class176_sub3_207_.aShortArray9333 = aShortArray9333;
		class176_sub3_207_.aShortArray9358 = aShortArray9358;
		class176_sub3_207_.aShortArray9307 = aShortArray9307;
		class176_sub3_207_.aShortArray9327 = aShortArray9327;
		class176_sub3_207_.anIntArray9348 = anIntArray9348;
		class176_sub3_207_.anIntArray9350 = anIntArray9350;
		class176_sub3_207_.anIntArray9349 = anIntArray9349;
		class176_sub3_207_.aClass167Array9303 = aClass167Array9303;
		class176_sub3_207_.aClass159Array9354 = aClass159Array9354;
		return class176_sub3_207_;
	}

	public int method2893() {
		if (!aBool9304)
			method14754();
		return anInt9337;
	}

	public int method2894() {
		if (!aBool9304)
			method14754();
		return anInt9342;
	}

	public void method2986(int i, int i_230_, int i_231_, int i_232_) {
		for (int i_233_ = 0; i_233_ < anInt9369; i_233_++) {
			int i_234_ = aShortArray9326[i_233_] & 0xffff;
			int i_235_ = i_234_ >> 10 & 0x3f;
			int i_236_ = i_234_ >> 7 & 0x7;
			int i_237_ = i_234_ & 0x7f;
			if (i != -1)
				i_235_ += (i - i_235_) * i_232_ >> 7;
			if (i_230_ != -1)
				i_236_ += (i_230_ - i_236_) * i_232_ >> 7;
			if (i_231_ != -1)
				i_237_ += (i_231_ - i_237_) * i_232_ >> 7;
			aShortArray9326[i_233_] = (short) (i_235_ << 10 | i_236_ << 7 | i_237_);
		}
		if (aClass361Array9356 != null) {
			for (int i_238_ = 0; i_238_ < anInt9355; i_238_++) {
				Class361 class361 = aClass361Array9356[i_238_];
				Class354 class354 = aClass354Array9347[i_238_];
				class354.anInt3804 = (class354.anInt3804 & ~0xffffff | ((Class656.anIntArray8390[aShortArray9326[class361.anInt3841] & 0xffff]) & 0xffffff));
			}
		}
		method14751();
	}

	public int method2896() {
		if (!aBool9304)
			method14754();
		return anInt9340;
	}

	public int method2897() {
		if (!aBool9304)
			method14754();
		return anInt9318;
	}

	public int method2898() {
		if (!aBool9304)
			method14754();
		return anInt9344;
	}

	public int method2890() {
		if (!aBool9304)
			method14754();
		return anInt9345;
	}

	public int method2866() {
		if (!aBool9346)
			method2901();
		return anInt9309;
	}

	public void method2881(Class176 class176, int i, int i_239_, int i_240_, boolean bool) {
		Class176_Sub3 class176_sub3_241_ = (Class176_Sub3) class176;
		if (anInt9369 != 0 && class176_sub3_241_.anInt9369 != 0) {
			int i_242_ = class176_sub3_241_.anInt9302;
			int[] is = class176_sub3_241_.anIntArray9352;
			int[] is_243_ = class176_sub3_241_.anIntArray9360;
			int[] is_244_ = class176_sub3_241_.anIntArray9362;
			short[] is_245_ = class176_sub3_241_.aShortArray9311;
			short[] is_246_ = class176_sub3_241_.aShortArray9305;
			short[] is_247_ = class176_sub3_241_.aShortArray9313;
			byte[] is_248_ = class176_sub3_241_.aByteArray9314;
			short[] is_249_;
			short[] is_250_;
			short[] is_251_;
			byte[] is_252_;
			if (aClass379_9317 != null) {
				is_249_ = aClass379_9317.aShortArray3928;
				is_250_ = aClass379_9317.aShortArray3929;
				is_251_ = aClass379_9317.aShortArray3930;
				is_252_ = aClass379_9317.aByteArray3931;
			} else {
				is_249_ = null;
				is_250_ = null;
				is_251_ = null;
				is_252_ = null;
			}
			short[] is_253_;
			short[] is_254_;
			short[] is_255_;
			byte[] is_256_;
			if (class176_sub3_241_.aClass379_9317 != null) {
				is_253_ = class176_sub3_241_.aClass379_9317.aShortArray3928;
				is_254_ = class176_sub3_241_.aClass379_9317.aShortArray3929;
				is_255_ = class176_sub3_241_.aClass379_9317.aShortArray3930;
				is_256_ = class176_sub3_241_.aClass379_9317.aByteArray3931;
			} else {
				is_253_ = null;
				is_254_ = null;
				is_255_ = null;
				is_256_ = null;
			}
			int[] is_257_ = class176_sub3_241_.anIntArray9351;
			short[] is_258_ = class176_sub3_241_.aShortArray9366;
			if (!class176_sub3_241_.aBool9304)
				class176_sub3_241_.method14754();
			int i_259_ = class176_sub3_241_.anInt9340;
			int i_260_ = class176_sub3_241_.anInt9318;
			int i_261_ = class176_sub3_241_.anInt9342;
			int i_262_ = class176_sub3_241_.anInt9343;
			int i_263_ = class176_sub3_241_.anInt9344;
			int i_264_ = class176_sub3_241_.anInt9345;
			for (int i_265_ = 0; i_265_ < anInt9302; i_265_++) {
				int i_266_ = anIntArray9360[i_265_] - i_239_;
				if (i_266_ >= i_259_ && i_266_ <= i_260_) {
					int i_267_ = anIntArray9352[i_265_] - i;
					if (i_267_ >= i_261_ && i_267_ <= i_262_) {
						int i_268_ = anIntArray9362[i_265_] - i_240_;
						if (i_268_ >= i_263_ && i_268_ <= i_264_) {
							int i_269_ = -1;
							int i_270_ = anIntArray9351[i_265_];
							int i_271_ = anIntArray9351[i_265_ + 1];
							for (int i_272_ = i_270_; (i_272_ < i_271_ && aShortArray9366[i_272_] != 0); i_272_++) {
								i_269_ = (aShortArray9366[i_272_] & 0xffff) - 1;
								if (aByteArray9314[i_269_] != 0)
									break;
							}
							if (i_269_ != -1) {
								for (int i_273_ = 0; i_273_ < i_242_; i_273_++) {
									if (i_267_ == is[i_273_] && i_268_ == is_244_[i_273_] && i_266_ == is_243_[i_273_]) {
										int i_274_ = -1;
										i_270_ = is_257_[i_273_];
										i_271_ = is_257_[i_273_ + 1];
										for (int i_275_ = i_270_; (i_275_ < i_271_ && is_258_[i_275_] != 0); i_275_++) {
											i_274_ = is_258_[i_275_] - 1 & 0xffff;
											if (is_248_[i_274_] != 0)
												break;
										}
										if (i_274_ != -1) {
											if (is_249_ == null) {
												aClass379_9317 = new Class379();
												is_249_ = aClass379_9317.aShortArray3928 = (Class214.method3900(aShortArray9311, -1801467828));
												is_250_ = aClass379_9317.aShortArray3929 = (Class214.method3900(aShortArray9305, -2140221835));
												is_251_ = aClass379_9317.aShortArray3930 = (Class214.method3900(aShortArray9313, -2085809020));
												is_252_ = aClass379_9317.aByteArray3931 = (Class332.method5837(aByteArray9314, -1998518280));
											}
											if (is_253_ == null) {
												Class379 class379 = (class176_sub3_241_.aClass379_9317 = new Class379());
												is_253_ = class379.aShortArray3928 = (Class214.method3900(is_245_, -1882465129));
												is_254_ = class379.aShortArray3929 = (Class214.method3900(is_246_, -1816028995));
												is_255_ = class379.aShortArray3930 = (Class214.method3900(is_247_, -1930679495));
												is_256_ = class379.aByteArray3931 = (Class332.method5837(is_248_, -1051575686));
											}
											short i_276_ = aShortArray9311[i_269_];
											short i_277_ = aShortArray9305[i_269_];
											short i_278_ = aShortArray9313[i_269_];
											byte i_279_ = aByteArray9314[i_269_];
											i_270_ = is_257_[i_273_];
											i_271_ = is_257_[i_273_ + 1];
											for (int i_280_ = i_270_; i_280_ < i_271_; i_280_++) {
												int i_281_ = is_258_[i_280_] - 1;
												if (i_281_ == -1)
													break;
												if (is_256_[i_281_] != 0) {
													is_253_[i_281_] += i_276_;
													is_254_[i_281_] += i_277_;
													is_255_[i_281_] += i_278_;
													is_256_[i_281_] += i_279_;
												}
											}
											i_276_ = is_245_[i_274_];
											i_277_ = is_246_[i_274_];
											i_278_ = is_247_[i_274_];
											i_279_ = is_248_[i_274_];
											i_270_ = anIntArray9351[i_265_];
											i_271_ = anIntArray9351[i_265_ + 1];
											for (int i_282_ = i_270_; (i_282_ < i_271_ && (aShortArray9366[i_282_] != 0)); i_282_++) {
												int i_283_ = ((aShortArray9366[i_282_] & 0xffff) - 1);
												if (is_252_[i_283_] != 0) {
													is_249_[i_283_] += i_276_;
													is_250_[i_283_] += i_277_;
													is_251_[i_283_] += i_278_;
													is_252_[i_283_] += i_279_;
												}
											}
											class176_sub3_241_.method14752();
											method14752();
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

	public void method3019(int i) {
		aShort9339 = (short) i;
		method14751();
	}

	int method14757(int i, short i_284_, int i_285_) {
		int i_286_ = aClass180_Sub2_9296.anIntArray9576[method14760(i, i_285_)];
		if (i_284_ != -1) {
			Class163 class163 = aClass180_Sub2_9296.aClass181_2059.method3544(i_284_ & 0xffff, (byte) -119);
			int i_287_ = class163.aByte1808 & 0xff;
			if (i_287_ != 0) {
				int i_288_ = 131586 * i_285_;
				if (i_285_ < 0)
					i_288_ = 0;
				else if (i_285_ > 127)
					i_288_ = 16777215;
				else
					i_288_ = 131586 * i_285_;
				if (i_287_ == 256)
					i_286_ = i_288_;
				else {
					int i_289_ = i_287_;
					int i_290_ = 256 - i_287_;
					i_286_ = ((((i_288_ & 0xff00ff) * i_289_ + (i_286_ & 0xff00ff) * i_290_) & ~0xff00ff) + (((i_288_ & 0xff00) * i_289_ + (i_286_ & 0xff00) * i_290_) & 0xff0000)) >> 8;
				}
			}
			int i_291_ = class163.aByte1802 & 0xff;
			if (i_291_ != 0) {
				i_291_ += 256;
				int i_292_ = ((i_286_ & 0xff0000) >> 16) * i_291_;
				if (i_292_ > 65535)
					i_292_ = 65535;
				int i_293_ = ((i_286_ & 0xff00) >> 8) * i_291_;
				if (i_293_ > 65535)
					i_293_ = 65535;
				int i_294_ = (i_286_ & 0xff) * i_291_;
				if (i_294_ > 65535)
					i_294_ = 65535;
				i_286_ = (i_292_ << 8 & 0xff0000) + (i_293_ & 0xff00) + (i_294_ >> 8);
			}
		}
		return i_286_ & 0xffffff;
	}

	public int method2929() {
		return aShort9339;
	}

	public void method2930(int i) {
		int i_295_ = Class428.anIntArray4825[i];
		int i_296_ = Class428.anIntArray4819[i];
		for (int i_297_ = 0; i_297_ < anInt9302; i_297_++) {
			int i_298_ = ((anIntArray9362[i_297_] * i_295_ + anIntArray9352[i_297_] * i_296_) >> 14);
			anIntArray9362[i_297_] = (anIntArray9362[i_297_] * i_296_ - anIntArray9352[i_297_] * i_295_) >> 14;
			anIntArray9352[i_297_] = i_298_;
		}
		method14759();
		aBool9304 = false;
	}

	void method14758() {
		if (aClass363_9334 != null)
			aClass363_9334.aBool3855 = false;
	}

	public byte[] method2906() {
		return aByteArray9321;
	}

	public void method2908(byte i, byte[] is) {
		if (is == null) {
			for (int i_299_ = 0; i_299_ < anInt9369; i_299_++)
				aByteArray9321[i_299_] = i;
		} else {
			for (int i_300_ = 0; i_300_ < anInt9369; i_300_++) {
				int i_301_ = 255 - ((255 - (is[i_300_] & 0xff)) * (255 - (i & 0xff)) / 255);
				aByteArray9321[i_300_] = (byte) i_301_;
			}
		}
		method14751();
	}

	public void method2909(short i, short i_302_) {
		Class181 class181 = aClass180_Sub2_9296.aClass181_2059;
		for (int i_303_ = 0; i_303_ < anInt9369; i_303_++) {
			if (aShortArray9325[i_303_] == i)
				aShortArray9325[i_303_] = i_302_;
		}
		byte i_304_ = 0;
		byte i_305_ = 0;
		if (i != -1) {
			Class163 class163 = class181.method3544(i & 0xffff, (byte) -41);
			i_304_ = class163.aByte1808;
			i_305_ = class163.aByte1802;
		}
		byte i_306_ = 0;
		byte i_307_ = 0;
		if (i_302_ != -1) {
			Class163 class163 = class181.method3544(i_302_ & 0xffff, (byte) -62);
			i_306_ = class163.aByte1808;
			i_307_ = class163.aByte1802;
			if (class163.aByte1781 != 0 || class163.aByte1797 != 0)
				aBool9336 = true;
		}
		if (i_304_ != i_306_ | i_305_ != i_307_) {
			if (aClass361Array9356 != null) {
				for (int i_308_ = 0; i_308_ < anInt9355; i_308_++) {
					Class361 class361 = aClass361Array9356[i_308_];
					Class354 class354 = aClass354Array9347[i_308_];
					class354.anInt3804 = (class354.anInt3804 & ~0xffffff | ((Class656.anIntArray8390[aShortArray9326[class361.anInt3841] & 0xffff]) & 0xffffff));
				}
			}
			method14751();
		}
	}

	void method2875() {
		/* empty */
	}

	void method14759() {
		if (aClass363_9299 != null)
			aClass363_9299.aBool3855 = false;
	}

	public boolean method2949() {
		return aBool9335;
	}

	public boolean method2913() {
		return aBool9336;
	}

	int method14760(int i, int i_309_) {
		i_309_ = i_309_ * (i & 0x7f) >> 7;
		if (i_309_ < 2)
			i_309_ = 2;
		else if (i_309_ > 126)
			i_309_ = 126;
		return (i & 0xff80) + i_309_;
	}

	void method2984() {
		/* empty */
	}

	boolean method2883() {
		if (anIntArrayArray9306 == null)
			return false;
		for (int i = 0; i < anInt9301; i++) {
			anIntArray9352[i] <<= 4;
			anIntArray9360[i] <<= 4;
			anIntArray9362[i] <<= 4;
		}
		anInt9357 = 0;
		anInt9367 = 0;
		anInt9353 = 0;
		return true;
	}

	void method2885(int i, int[] is, int i_310_, int i_311_, int i_312_, boolean bool, int i_313_, int[] is_314_) {
		int i_315_ = is.length;
		if (i == 0) {
			i_310_ <<= 4;
			i_311_ <<= 4;
			i_312_ <<= 4;
			int i_316_ = 0;
			anInt9357 = 0;
			anInt9367 = 0;
			anInt9353 = 0;
			for (int i_317_ = 0; i_317_ < i_315_; i_317_++) {
				int i_318_ = is[i_317_];
				if (i_318_ < anIntArrayArray9306.length) {
					int[] is_319_ = anIntArrayArray9306[i_318_];
					for (int i_320_ = 0; i_320_ < is_319_.length; i_320_++) {
						int i_321_ = is_319_[i_320_];
						if (aShortArray9307 == null || (i_313_ & aShortArray9307[i_321_]) != 0) {
							anInt9357 += anIntArray9352[i_321_];
							anInt9367 += anIntArray9360[i_321_];
							anInt9353 += anIntArray9362[i_321_];
							i_316_++;
						}
					}
				}
			}
			if (i_316_ > 0) {
				anInt9357 = anInt9357 / i_316_ + i_310_;
				anInt9367 = anInt9367 / i_316_ + i_311_;
				anInt9353 = anInt9353 / i_316_ + i_312_;
				aBool9328 = true;
			} else {
				anInt9357 = i_310_;
				anInt9367 = i_311_;
				anInt9353 = i_312_;
			}
		} else if (i == 1) {
			if (is_314_ != null) {
				int i_322_ = ((is_314_[0] * i_310_ + is_314_[1] * i_311_ + is_314_[2] * i_312_ + 8192) >> 14);
				int i_323_ = ((is_314_[3] * i_310_ + is_314_[4] * i_311_ + is_314_[5] * i_312_ + 8192) >> 14);
				int i_324_ = ((is_314_[6] * i_310_ + is_314_[7] * i_311_ + is_314_[8] * i_312_ + 8192) >> 14);
				i_310_ = i_322_;
				i_311_ = i_323_;
				i_312_ = i_324_;
			}
			i_310_ <<= 4;
			i_311_ <<= 4;
			i_312_ <<= 4;
			for (int i_325_ = 0; i_325_ < i_315_; i_325_++) {
				int i_326_ = is[i_325_];
				if (i_326_ < anIntArrayArray9306.length) {
					int[] is_327_ = anIntArrayArray9306[i_326_];
					for (int i_328_ = 0; i_328_ < is_327_.length; i_328_++) {
						int i_329_ = is_327_[i_328_];
						if (aShortArray9307 == null || (i_313_ & aShortArray9307[i_329_]) != 0) {
							anIntArray9352[i_329_] += i_310_;
							anIntArray9360[i_329_] += i_311_;
							anIntArray9362[i_329_] += i_312_;
						}
					}
				}
			}
		} else if (i == 2) {
			if (is_314_ != null) {
				int i_330_ = is_314_[9] << 4;
				int i_331_ = is_314_[10] << 4;
				int i_332_ = is_314_[11] << 4;
				int i_333_ = is_314_[12] << 4;
				int i_334_ = is_314_[13] << 4;
				int i_335_ = is_314_[14] << 4;
				if (aBool9328) {
					int i_336_ = ((is_314_[0] * anInt9357 + is_314_[3] * anInt9367 + is_314_[6] * anInt9353 + 8192) >> 14);
					int i_337_ = ((is_314_[1] * anInt9357 + is_314_[4] * anInt9367 + is_314_[7] * anInt9353 + 8192) >> 14);
					int i_338_ = ((is_314_[2] * anInt9357 + is_314_[5] * anInt9367 + is_314_[8] * anInt9353 + 8192) >> 14);
					i_336_ += i_333_;
					i_337_ += i_334_;
					i_338_ += i_335_;
					anInt9357 = i_336_;
					anInt9367 = i_337_;
					anInt9353 = i_338_;
					aBool9328 = false;
				}
				int[] is_339_ = new int[9];
				int i_340_ = Class428.anIntArray4819[i_310_];
				int i_341_ = Class428.anIntArray4825[i_310_];
				int i_342_ = Class428.anIntArray4819[i_311_];
				int i_343_ = Class428.anIntArray4825[i_311_];
				int i_344_ = Class428.anIntArray4819[i_312_];
				int i_345_ = Class428.anIntArray4825[i_312_];
				int i_346_ = i_341_ * i_344_ + 8192 >> 14;
				int i_347_ = i_341_ * i_345_ + 8192 >> 14;
				is_339_[0] = i_342_ * i_344_ + i_343_ * i_347_ + 8192 >> 14;
				is_339_[1] = -i_342_ * i_345_ + i_343_ * i_346_ + 8192 >> 14;
				is_339_[2] = i_343_ * i_340_ + 8192 >> 14;
				is_339_[3] = i_340_ * i_345_ + 8192 >> 14;
				is_339_[4] = i_340_ * i_344_ + 8192 >> 14;
				is_339_[5] = -i_341_;
				is_339_[6] = -i_343_ * i_344_ + i_342_ * i_347_ + 8192 >> 14;
				is_339_[7] = i_343_ * i_345_ + i_342_ * i_346_ + 8192 >> 14;
				is_339_[8] = i_342_ * i_340_ + 8192 >> 14;
				int i_348_ = (is_339_[0] * -anInt9357 + is_339_[1] * -anInt9367 + is_339_[2] * -anInt9353 + 8192) >> 14;
				int i_349_ = (is_339_[3] * -anInt9357 + is_339_[4] * -anInt9367 + is_339_[5] * -anInt9353 + 8192) >> 14;
				int i_350_ = (is_339_[6] * -anInt9357 + is_339_[7] * -anInt9367 + is_339_[8] * -anInt9353 + 8192) >> 14;
				int i_351_ = i_348_ + anInt9357;
				int i_352_ = i_349_ + anInt9367;
				int i_353_ = i_350_ + anInt9353;
				int[] is_354_ = new int[9];
				for (int i_355_ = 0; i_355_ < 3; i_355_++) {
					for (int i_356_ = 0; i_356_ < 3; i_356_++) {
						int i_357_ = 0;
						for (int i_358_ = 0; i_358_ < 3; i_358_++)
							i_357_ += (is_339_[i_355_ * 3 + i_358_] * is_314_[i_356_ * 3 + i_358_]);
						is_354_[i_355_ * 3 + i_356_] = i_357_ + 8192 >> 14;
					}
				}
				int i_359_ = ((is_339_[0] * i_333_ + is_339_[1] * i_334_ + is_339_[2] * i_335_ + 8192) >> 14);
				int i_360_ = ((is_339_[3] * i_333_ + is_339_[4] * i_334_ + is_339_[5] * i_335_ + 8192) >> 14);
				int i_361_ = ((is_339_[6] * i_333_ + is_339_[7] * i_334_ + is_339_[8] * i_335_ + 8192) >> 14);
				i_359_ += i_351_;
				i_360_ += i_352_;
				i_361_ += i_353_;
				int[] is_362_ = new int[9];
				for (int i_363_ = 0; i_363_ < 3; i_363_++) {
					for (int i_364_ = 0; i_364_ < 3; i_364_++) {
						int i_365_ = 0;
						for (int i_366_ = 0; i_366_ < 3; i_366_++)
							i_365_ += (is_314_[i_363_ * 3 + i_366_] * is_354_[i_364_ + i_366_ * 3]);
						is_362_[i_363_ * 3 + i_364_] = i_365_ + 8192 >> 14;
					}
				}
				int i_367_ = ((is_314_[0] * i_359_ + is_314_[1] * i_360_ + is_314_[2] * i_361_ + 8192) >> 14);
				int i_368_ = ((is_314_[3] * i_359_ + is_314_[4] * i_360_ + is_314_[5] * i_361_ + 8192) >> 14);
				int i_369_ = ((is_314_[6] * i_359_ + is_314_[7] * i_360_ + is_314_[8] * i_361_ + 8192) >> 14);
				i_367_ += i_330_;
				i_368_ += i_331_;
				i_369_ += i_332_;
				for (int i_370_ = 0; i_370_ < i_315_; i_370_++) {
					int i_371_ = is[i_370_];
					if (i_371_ < anIntArrayArray9306.length) {
						int[] is_372_ = anIntArrayArray9306[i_371_];
						for (int i_373_ = 0; i_373_ < is_372_.length; i_373_++) {
							int i_374_ = is_372_[i_373_];
							if (aShortArray9307 == null || (i_313_ & aShortArray9307[i_374_]) != 0) {
								int i_375_ = ((is_362_[0] * anIntArray9352[i_374_] + is_362_[1] * anIntArray9360[i_374_] + is_362_[2] * anIntArray9362[i_374_] + 8192) >> 14);
								int i_376_ = ((is_362_[3] * anIntArray9352[i_374_] + is_362_[4] * anIntArray9360[i_374_] + is_362_[5] * anIntArray9362[i_374_] + 8192) >> 14);
								int i_377_ = ((is_362_[6] * anIntArray9352[i_374_] + is_362_[7] * anIntArray9360[i_374_] + is_362_[8] * anIntArray9362[i_374_] + 8192) >> 14);
								i_375_ += i_367_;
								i_376_ += i_368_;
								i_377_ += i_369_;
								anIntArray9352[i_374_] = i_375_;
								anIntArray9360[i_374_] = i_376_;
								anIntArray9362[i_374_] = i_377_;
							}
						}
					}
				}
			} else {
				for (int i_378_ = 0; i_378_ < i_315_; i_378_++) {
					int i_379_ = is[i_378_];
					if (i_379_ < anIntArrayArray9306.length) {
						int[] is_380_ = anIntArrayArray9306[i_379_];
						for (int i_381_ = 0; i_381_ < is_380_.length; i_381_++) {
							int i_382_ = is_380_[i_381_];
							if (aShortArray9307 == null || (i_313_ & aShortArray9307[i_382_]) != 0) {
								anIntArray9352[i_382_] -= anInt9357;
								anIntArray9360[i_382_] -= anInt9367;
								anIntArray9362[i_382_] -= anInt9353;
								if (i_312_ != 0) {
									int i_383_ = Class428.anIntArray4825[i_312_];
									int i_384_ = Class428.anIntArray4819[i_312_];
									int i_385_ = ((anIntArray9360[i_382_] * i_383_ + anIntArray9352[i_382_] * i_384_ + 16383) >> 14);
									anIntArray9360[i_382_] = (anIntArray9360[i_382_] * i_384_ - anIntArray9352[i_382_] * i_383_ + 16383) >> 14;
									anIntArray9352[i_382_] = i_385_;
								}
								if (i_310_ != 0) {
									int i_386_ = Class428.anIntArray4825[i_310_];
									int i_387_ = Class428.anIntArray4819[i_310_];
									int i_388_ = ((anIntArray9360[i_382_] * i_387_ - anIntArray9362[i_382_] * i_386_ + 16383) >> 14);
									anIntArray9362[i_382_] = (anIntArray9360[i_382_] * i_386_ + anIntArray9362[i_382_] * i_387_ + 16383) >> 14;
									anIntArray9360[i_382_] = i_388_;
								}
								if (i_311_ != 0) {
									int i_389_ = Class428.anIntArray4825[i_311_];
									int i_390_ = Class428.anIntArray4819[i_311_];
									int i_391_ = ((anIntArray9362[i_382_] * i_389_ + anIntArray9352[i_382_] * i_390_ + 16383) >> 14);
									anIntArray9362[i_382_] = (anIntArray9362[i_382_] * i_390_ - anIntArray9352[i_382_] * i_389_ + 16383) >> 14;
									anIntArray9352[i_382_] = i_391_;
								}
								anIntArray9352[i_382_] += anInt9357;
								anIntArray9360[i_382_] += anInt9367;
								anIntArray9362[i_382_] += anInt9353;
							}
						}
					}
				}
				if (bool) {
					for (int i_392_ = 0; i_392_ < i_315_; i_392_++) {
						int i_393_ = is[i_392_];
						if (i_393_ < anIntArrayArray9306.length) {
							int[] is_394_ = anIntArrayArray9306[i_393_];
							for (int i_395_ = 0; i_395_ < is_394_.length; i_395_++) {
								int i_396_ = is_394_[i_395_];
								if (aShortArray9307 == null || ((i_313_ & aShortArray9307[i_396_]) != 0)) {
									int i_397_ = anIntArray9351[i_396_];
									int i_398_ = anIntArray9351[i_396_ + 1];
									for (int i_399_ = i_397_; (i_399_ < i_398_ && aShortArray9366[i_399_] != 0); i_399_++) {
										int i_400_ = ((aShortArray9366[i_399_] & 0xffff) - 1);
										if (i_312_ != 0) {
											int i_401_ = (Class428.anIntArray4825[i_312_]);
											int i_402_ = (Class428.anIntArray4819[i_312_]);
											int i_403_ = (((aShortArray9305[i_400_] * i_401_) + (aShortArray9311[i_400_] * i_402_) + 16383) >> 14);
											aShortArray9305[i_400_] = (short) (((aShortArray9305[i_400_]) * i_402_ - ((aShortArray9311[i_400_]) * i_401_) + 16383) >> 14);
											aShortArray9311[i_400_] = (short) i_403_;
										}
										if (i_310_ != 0) {
											int i_404_ = (Class428.anIntArray4825[i_310_]);
											int i_405_ = (Class428.anIntArray4819[i_310_]);
											int i_406_ = (((aShortArray9305[i_400_] * i_405_) - (aShortArray9313[i_400_] * i_404_) + 16383) >> 14);
											aShortArray9313[i_400_] = (short) (((aShortArray9305[i_400_]) * i_404_ + ((aShortArray9313[i_400_]) * i_405_) + 16383) >> 14);
											aShortArray9305[i_400_] = (short) i_406_;
										}
										if (i_311_ != 0) {
											int i_407_ = (Class428.anIntArray4825[i_311_]);
											int i_408_ = (Class428.anIntArray4819[i_311_]);
											int i_409_ = (((aShortArray9313[i_400_] * i_407_) + (aShortArray9311[i_400_] * i_408_) + 16383) >> 14);
											aShortArray9313[i_400_] = (short) (((aShortArray9313[i_400_]) * i_408_ - ((aShortArray9311[i_400_]) * i_407_) + 16383) >> 14);
											aShortArray9311[i_400_] = (short) i_409_;
										}
									}
								}
							}
						}
					}
					method14752();
				}
			}
		} else if (i == 3) {
			if (is_314_ != null) {
				int i_410_ = is_314_[9] << 4;
				int i_411_ = is_314_[10] << 4;
				int i_412_ = is_314_[11] << 4;
				int i_413_ = is_314_[12] << 4;
				int i_414_ = is_314_[13] << 4;
				int i_415_ = is_314_[14] << 4;
				if (aBool9328) {
					int i_416_ = ((is_314_[0] * anInt9357 + is_314_[3] * anInt9367 + is_314_[6] * anInt9353 + 8192) >> 14);
					int i_417_ = ((is_314_[1] * anInt9357 + is_314_[4] * anInt9367 + is_314_[7] * anInt9353 + 8192) >> 14);
					int i_418_ = ((is_314_[2] * anInt9357 + is_314_[5] * anInt9367 + is_314_[8] * anInt9353 + 8192) >> 14);
					i_416_ += i_413_;
					i_417_ += i_414_;
					i_418_ += i_415_;
					anInt9357 = i_416_;
					anInt9367 = i_417_;
					anInt9353 = i_418_;
					aBool9328 = false;
				}
				int i_419_ = i_310_ << 15 >> 7;
				int i_420_ = i_311_ << 15 >> 7;
				int i_421_ = i_312_ << 15 >> 7;
				int i_422_ = i_419_ * -anInt9357 + 8192 >> 14;
				int i_423_ = i_420_ * -anInt9367 + 8192 >> 14;
				int i_424_ = i_421_ * -anInt9353 + 8192 >> 14;
				int i_425_ = i_422_ + anInt9357;
				int i_426_ = i_423_ + anInt9367;
				int i_427_ = i_424_ + anInt9353;
				int[] is_428_ = new int[9];
				is_428_[0] = i_419_ * is_314_[0] + 8192 >> 14;
				is_428_[1] = i_419_ * is_314_[3] + 8192 >> 14;
				is_428_[2] = i_419_ * is_314_[6] + 8192 >> 14;
				is_428_[3] = i_420_ * is_314_[1] + 8192 >> 14;
				is_428_[4] = i_420_ * is_314_[4] + 8192 >> 14;
				is_428_[5] = i_420_ * is_314_[7] + 8192 >> 14;
				is_428_[6] = i_421_ * is_314_[2] + 8192 >> 14;
				is_428_[7] = i_421_ * is_314_[5] + 8192 >> 14;
				is_428_[8] = i_421_ * is_314_[8] + 8192 >> 14;
				int i_429_ = i_419_ * i_413_ + 8192 >> 14;
				int i_430_ = i_420_ * i_414_ + 8192 >> 14;
				int i_431_ = i_421_ * i_415_ + 8192 >> 14;
				i_429_ += i_425_;
				i_430_ += i_426_;
				i_431_ += i_427_;
				int[] is_432_ = new int[9];
				for (int i_433_ = 0; i_433_ < 3; i_433_++) {
					for (int i_434_ = 0; i_434_ < 3; i_434_++) {
						int i_435_ = 0;
						for (int i_436_ = 0; i_436_ < 3; i_436_++)
							i_435_ += (is_314_[i_433_ * 3 + i_436_] * is_428_[i_434_ + i_436_ * 3]);
						is_432_[i_433_ * 3 + i_434_] = i_435_ + 8192 >> 14;
					}
				}
				int i_437_ = ((is_314_[0] * i_429_ + is_314_[1] * i_430_ + is_314_[2] * i_431_ + 8192) >> 14);
				int i_438_ = ((is_314_[3] * i_429_ + is_314_[4] * i_430_ + is_314_[5] * i_431_ + 8192) >> 14);
				int i_439_ = ((is_314_[6] * i_429_ + is_314_[7] * i_430_ + is_314_[8] * i_431_ + 8192) >> 14);
				i_437_ += i_410_;
				i_438_ += i_411_;
				i_439_ += i_412_;
				for (int i_440_ = 0; i_440_ < i_315_; i_440_++) {
					int i_441_ = is[i_440_];
					if (i_441_ < anIntArrayArray9306.length) {
						int[] is_442_ = anIntArrayArray9306[i_441_];
						for (int i_443_ = 0; i_443_ < is_442_.length; i_443_++) {
							int i_444_ = is_442_[i_443_];
							if (aShortArray9307 == null || (i_313_ & aShortArray9307[i_444_]) != 0) {
								int i_445_ = ((is_432_[0] * anIntArray9352[i_444_] + is_432_[1] * anIntArray9360[i_444_] + is_432_[2] * anIntArray9362[i_444_] + 8192) >> 14);
								int i_446_ = ((is_432_[3] * anIntArray9352[i_444_] + is_432_[4] * anIntArray9360[i_444_] + is_432_[5] * anIntArray9362[i_444_] + 8192) >> 14);
								int i_447_ = ((is_432_[6] * anIntArray9352[i_444_] + is_432_[7] * anIntArray9360[i_444_] + is_432_[8] * anIntArray9362[i_444_] + 8192) >> 14);
								i_445_ += i_437_;
								i_446_ += i_438_;
								i_447_ += i_439_;
								anIntArray9352[i_444_] = i_445_;
								anIntArray9360[i_444_] = i_446_;
								anIntArray9362[i_444_] = i_447_;
							}
						}
					}
				}
			} else {
				for (int i_448_ = 0; i_448_ < i_315_; i_448_++) {
					int i_449_ = is[i_448_];
					if (i_449_ < anIntArrayArray9306.length) {
						int[] is_450_ = anIntArrayArray9306[i_449_];
						for (int i_451_ = 0; i_451_ < is_450_.length; i_451_++) {
							int i_452_ = is_450_[i_451_];
							if (aShortArray9307 == null || (i_313_ & aShortArray9307[i_452_]) != 0) {
								anIntArray9352[i_452_] -= anInt9357;
								anIntArray9360[i_452_] -= anInt9367;
								anIntArray9362[i_452_] -= anInt9353;
								anIntArray9352[i_452_] = anIntArray9352[i_452_] * i_310_ >> 7;
								anIntArray9360[i_452_] = anIntArray9360[i_452_] * i_311_ >> 7;
								anIntArray9362[i_452_] = anIntArray9362[i_452_] * i_312_ >> 7;
								anIntArray9352[i_452_] += anInt9357;
								anIntArray9360[i_452_] += anInt9367;
								anIntArray9362[i_452_] += anInt9353;
							}
						}
					}
				}
			}
		} else if (i == 5) {
			if (anIntArrayArray9310 != null) {
				boolean bool_453_ = false;
				for (int i_454_ = 0; i_454_ < i_315_; i_454_++) {
					int i_455_ = is[i_454_];
					if (i_455_ < anIntArrayArray9310.length) {
						int[] is_456_ = anIntArrayArray9310[i_455_];
						for (int i_457_ = 0; i_457_ < is_456_.length; i_457_++) {
							int i_458_ = is_456_[i_457_];
							if (aShortArray9327 == null || (i_313_ & aShortArray9327[i_458_]) != 0) {
								int i_459_ = ((aByteArray9321[i_458_] & 0xff) + i_310_ * 8);
								if (i_459_ < 0)
									i_459_ = 0;
								else if (i_459_ > 255)
									i_459_ = 255;
								aByteArray9321[i_458_] = (byte) i_459_;
							}
						}
						bool_453_ = bool_453_ | is_456_.length > 0;
					}
				}
				if (bool_453_) {
					if (aClass361Array9356 != null) {
						for (int i_460_ = 0; i_460_ < anInt9355; i_460_++) {
							Class361 class361 = aClass361Array9356[i_460_];
							Class354 class354 = aClass354Array9347[i_460_];
							class354.anInt3804 = (class354.anInt3804 & 0xffffff | 255 - (aByteArray9321[class361.anInt3841] & 0xff) << 24);
						}
					}
					method14751();
				}
			}
		} else if (i == 7) {
			if (anIntArrayArray9310 != null) {
				boolean bool_461_ = false;
				for (int i_462_ = 0; i_462_ < i_315_; i_462_++) {
					int i_463_ = is[i_462_];
					if (i_463_ < anIntArrayArray9310.length) {
						int[] is_464_ = anIntArrayArray9310[i_463_];
						for (int i_465_ = 0; i_465_ < is_464_.length; i_465_++) {
							int i_466_ = is_464_[i_465_];
							if (aShortArray9327 == null || (i_313_ & aShortArray9327[i_466_]) != 0) {
								int i_467_ = aShortArray9326[i_466_] & 0xffff;
								int i_468_ = i_467_ >> 10 & 0x3f;
								int i_469_ = i_467_ >> 7 & 0x7;
								int i_470_ = i_467_ & 0x7f;
								i_468_ = i_468_ + i_310_ & 0x3f;
								i_469_ += i_311_ / 4;
								if (i_469_ < 0)
									i_469_ = 0;
								else if (i_469_ > 7)
									i_469_ = 7;
								i_470_ += i_312_;
								if (i_470_ < 0)
									i_470_ = 0;
								else if (i_470_ > 127)
									i_470_ = 127;
								aShortArray9326[i_466_] = (short) (i_468_ << 10 | i_469_ << 7 | i_470_);
							}
						}
						bool_461_ = bool_461_ | is_464_.length > 0;
					}
				}
				if (bool_461_) {
					if (aClass361Array9356 != null) {
						for (int i_471_ = 0; i_471_ < anInt9355; i_471_++) {
							Class361 class361 = aClass361Array9356[i_471_];
							Class354 class354 = aClass354Array9347[i_471_];
							class354.anInt3804 = (class354.anInt3804 & ~0xffffff | (Class656.anIntArray8390[(aShortArray9326[class361.anInt3841] & 0xffff)]) & 0xffffff);
						}
					}
					method14751();
				}
			}
		} else if (i == 8) {
			if (anIntArrayArray9329 != null) {
				for (int i_472_ = 0; i_472_ < i_315_; i_472_++) {
					int i_473_ = is[i_472_];
					if (i_473_ < anIntArrayArray9329.length) {
						int[] is_474_ = anIntArrayArray9329[i_473_];
						for (int i_475_ = 0; i_475_ < is_474_.length; i_475_++) {
							Class354 class354 = aClass354Array9347[is_474_[i_475_]];
							class354.anInt3807 += i_310_;
							class354.anInt3806 += i_311_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (anIntArrayArray9329 != null) {
				for (int i_476_ = 0; i_476_ < i_315_; i_476_++) {
					int i_477_ = is[i_476_];
					if (i_477_ < anIntArrayArray9329.length) {
						int[] is_478_ = anIntArrayArray9329[i_477_];
						for (int i_479_ = 0; i_479_ < is_478_.length; i_479_++) {
							Class354 class354 = aClass354Array9347[is_478_[i_479_]];
							class354.anInt3805 = class354.anInt3805 * i_310_ >> 7;
							class354.anInt3808 = class354.anInt3808 * i_311_ >> 7;
						}
					}
				}
			}
		} else if (i == 9) {
			if (anIntArrayArray9329 != null) {
				for (int i_480_ = 0; i_480_ < i_315_; i_480_++) {
					int i_481_ = is[i_480_];
					if (i_481_ < anIntArrayArray9329.length) {
						int[] is_482_ = anIntArrayArray9329[i_481_];
						for (int i_483_ = 0; i_483_ < is_482_.length; i_483_++) {
							Class354 class354 = aClass354Array9347[is_482_[i_483_]];
							class354.anInt3809 = class354.anInt3809 + i_310_ & 0x3fff;
						}
					}
				}
			}
		}
	}

	void method2910(int i, int i_484_, int i_485_, int i_486_) {
		if (i == 0) {
			int i_487_ = 0;
			anInt9357 = 0;
			anInt9367 = 0;
			anInt9353 = 0;
			for (int i_488_ = 0; i_488_ < anInt9302; i_488_++) {
				anInt9357 += anIntArray9352[i_488_];
				anInt9367 += anIntArray9360[i_488_];
				anInt9353 += anIntArray9362[i_488_];
				i_487_++;
			}
			if (i_487_ > 0) {
				anInt9357 = anInt9357 / i_487_ + i_484_;
				anInt9367 = anInt9367 / i_487_ + i_485_;
				anInt9353 = anInt9353 / i_487_ + i_486_;
			} else {
				anInt9357 = i_484_;
				anInt9367 = i_485_;
				anInt9353 = i_486_;
			}
		} else if (i == 1) {
			for (int i_489_ = 0; i_489_ < anInt9302; i_489_++) {
				anIntArray9352[i_489_] += i_484_;
				anIntArray9360[i_489_] += i_485_;
				anIntArray9362[i_489_] += i_486_;
			}
		} else if (i == 2) {
			for (int i_490_ = 0; i_490_ < anInt9302; i_490_++) {
				anIntArray9352[i_490_] -= anInt9357;
				anIntArray9360[i_490_] -= anInt9367;
				anIntArray9362[i_490_] -= anInt9353;
				if (i_486_ != 0) {
					int i_491_ = Class428.anIntArray4825[i_486_];
					int i_492_ = Class428.anIntArray4819[i_486_];
					int i_493_ = ((anIntArray9360[i_490_] * i_491_ + anIntArray9352[i_490_] * i_492_ + 16383) >> 14);
					anIntArray9360[i_490_] = (anIntArray9360[i_490_] * i_492_ - anIntArray9352[i_490_] * i_491_ + 16383) >> 14;
					anIntArray9352[i_490_] = i_493_;
				}
				if (i_484_ != 0) {
					int i_494_ = Class428.anIntArray4825[i_484_];
					int i_495_ = Class428.anIntArray4819[i_484_];
					int i_496_ = ((anIntArray9360[i_490_] * i_495_ - anIntArray9362[i_490_] * i_494_ + 16383) >> 14);
					anIntArray9362[i_490_] = (anIntArray9360[i_490_] * i_494_ + anIntArray9362[i_490_] * i_495_ + 16383) >> 14;
					anIntArray9360[i_490_] = i_496_;
				}
				if (i_485_ != 0) {
					int i_497_ = Class428.anIntArray4825[i_485_];
					int i_498_ = Class428.anIntArray4819[i_485_];
					int i_499_ = ((anIntArray9362[i_490_] * i_497_ + anIntArray9352[i_490_] * i_498_ + 16383) >> 14);
					anIntArray9362[i_490_] = (anIntArray9362[i_490_] * i_498_ - anIntArray9352[i_490_] * i_497_ + 16383) >> 14;
					anIntArray9352[i_490_] = i_499_;
				}
				anIntArray9352[i_490_] += anInt9357;
				anIntArray9360[i_490_] += anInt9367;
				anIntArray9362[i_490_] += anInt9353;
			}
		} else if (i == 3) {
			for (int i_500_ = 0; i_500_ < anInt9302; i_500_++) {
				anIntArray9352[i_500_] -= anInt9357;
				anIntArray9360[i_500_] -= anInt9367;
				anIntArray9362[i_500_] -= anInt9353;
				anIntArray9352[i_500_] = anIntArray9352[i_500_] * i_484_ / 128;
				anIntArray9360[i_500_] = anIntArray9360[i_500_] * i_485_ / 128;
				anIntArray9362[i_500_] = anIntArray9362[i_500_] * i_486_ / 128;
				anIntArray9352[i_500_] += anInt9357;
				anIntArray9360[i_500_] += anInt9367;
				anIntArray9362[i_500_] += anInt9353;
			}
		} else if (i == 5) {
			for (int i_501_ = 0; i_501_ < anInt9369; i_501_++) {
				int i_502_ = (aByteArray9321[i_501_] & 0xff) + i_484_ * 8;
				if (i_502_ < 0)
					i_502_ = 0;
				else if (i_502_ > 255)
					i_502_ = 255;
				aByteArray9321[i_501_] = (byte) i_502_;
			}
			if (aClass361Array9356 != null) {
				for (int i_503_ = 0; i_503_ < anInt9355; i_503_++) {
					Class361 class361 = aClass361Array9356[i_503_];
					Class354 class354 = aClass354Array9347[i_503_];
					class354.anInt3804 = (class354.anInt3804 & 0xffffff | (255 - (aByteArray9321[class361.anInt3841] & 0xff) << 24));
				}
			}
			method14751();
		} else if (i == 7) {
			for (int i_504_ = 0; i_504_ < anInt9369; i_504_++) {
				int i_505_ = aShortArray9326[i_504_] & 0xffff;
				int i_506_ = i_505_ >> 10 & 0x3f;
				int i_507_ = i_505_ >> 7 & 0x7;
				int i_508_ = i_505_ & 0x7f;
				i_506_ = i_506_ + i_484_ & 0x3f;
				i_507_ += i_485_ / 4;
				if (i_507_ < 0)
					i_507_ = 0;
				else if (i_507_ > 7)
					i_507_ = 7;
				i_508_ += i_486_;
				if (i_508_ < 0)
					i_508_ = 0;
				else if (i_508_ > 127)
					i_508_ = 127;
				aShortArray9326[i_504_] = (short) (i_506_ << 10 | i_507_ << 7 | i_508_);
			}
			if (aClass361Array9356 != null) {
				for (int i_509_ = 0; i_509_ < anInt9355; i_509_++) {
					Class361 class361 = aClass361Array9356[i_509_];
					Class354 class354 = aClass354Array9347[i_509_];
					class354.anInt3804 = (class354.anInt3804 & ~0xffffff | ((Class656.anIntArray8390[aShortArray9326[class361.anInt3841] & 0xffff]) & 0xffffff));
				}
			}
			method14751();
		} else if (i == 8) {
			for (int i_510_ = 0; i_510_ < anInt9355; i_510_++) {
				Class354 class354 = aClass354Array9347[i_510_];
				class354.anInt3807 += i_484_;
				class354.anInt3806 += i_485_;
			}
		} else if (i == 10) {
			for (int i_511_ = 0; i_511_ < anInt9355; i_511_++) {
				Class354 class354 = aClass354Array9347[i_511_];
				class354.anInt3805 = class354.anInt3805 * i_484_ >> 7;
				class354.anInt3808 = class354.anInt3808 * i_485_ >> 7;
			}
		} else if (i == 9) {
			for (int i_512_ = 0; i_512_ < anInt9355; i_512_++) {
				Class354 class354 = aClass354Array9347[i_512_];
				class354.anInt3809 = class354.anInt3809 + i_484_ & 0x3fff;
			}
		}
	}

	public void method2873(int i, int i_513_, Class161 class161, Class161 class161_514_, int i_515_, int i_516_, int i_517_) {
		if (!aBool9304)
			method14754();
		int i_518_ = i_515_ + anInt9342;
		int i_519_ = i_515_ + anInt9343;
		int i_520_ = i_517_ + anInt9344;
		int i_521_ = i_517_ + anInt9345;
		if (i != 1 && i != 2 && i != 3 && i != 5 || (i_518_ >= 0 && ((i_519_ + class161.anInt1752 * 1048375491 >> class161.anInt1753 * 1252000143) < class161.anInt1750 * 1210322533) && i_520_ >= 0 && ((i_521_ + class161.anInt1752 * 1048375491 >> class161.anInt1753 * 1252000143) < class161.anInt1751 * -533476177))) {
			if (i == 4 || i == 5) {
				if (class161_514_ == null || (i_518_ < 0 || ((i_519_ + class161_514_.anInt1752 * 1048375491 >> class161_514_.anInt1753 * 1252000143) >= class161_514_.anInt1750 * 1210322533) || i_520_ < 0 || ((i_521_ + class161_514_.anInt1752 * 1048375491 >> class161_514_.anInt1753 * 1252000143) >= class161_514_.anInt1751 * -533476177)))
					return;
			} else {
				i_518_ >>= class161.anInt1753 * 1252000143;
				i_519_ = (i_519_ + (class161.anInt1752 * 1048375491 - 1) >> class161.anInt1753 * 1252000143);
				i_520_ >>= class161.anInt1753 * 1252000143;
				i_521_ = (i_521_ + (class161.anInt1752 * 1048375491 - 1) >> class161.anInt1753 * 1252000143);
				if (class161.method2595(i_518_, i_520_, (byte) 102) == i_516_ && class161.method2595(i_519_, i_520_, (byte) 20) == i_516_ && class161.method2595(i_518_, i_521_, (byte) 79) == i_516_ && (class161.method2595(i_519_, i_521_, (byte) 91) == i_516_))
					return;
			}
			if (i == 1) {
				for (int i_522_ = 0; i_522_ < anInt9302; i_522_++)
					anIntArray9360[i_522_] = (anIntArray9360[i_522_] + class161.method2619((anIntArray9352[i_522_] + i_515_), (anIntArray9362[i_522_] + i_517_), -1239302142) - i_516_);
			} else if (i == 2) {
				int i_523_ = anInt9340;
				if (i_523_ == 0)
					return;
				for (int i_524_ = 0; i_524_ < anInt9302; i_524_++) {
					int i_525_ = (anIntArray9360[i_524_] << 16) / i_523_;
					if (i_525_ < i_513_)
						anIntArray9360[i_524_] = (anIntArray9360[i_524_] + (class161.method2619((anIntArray9352[i_524_] + i_515_), (anIntArray9362[i_524_] + i_517_), -1806915895) - i_516_) * (i_513_ - i_525_) / i_513_);
				}
			} else if (i == 3) {
				int i_526_ = (i_513_ & 0xff) * 16;
				int i_527_ = (i_513_ >> 8 & 0xff) * 16;
				int i_528_ = (i_513_ >> 16 & 0xff) << 6;
				int i_529_ = (i_513_ >> 24 & 0xff) << 6;
				if (i_515_ - (i_526_ >> 1) < 0 || ((i_515_ + (i_526_ >> 1) + class161.anInt1752 * 1048375491) >= (class161.anInt1750 * 1210322533 << class161.anInt1753 * 1252000143)) || i_517_ - (i_527_ >> 1) < 0 || ((i_517_ + (i_527_ >> 1) + class161.anInt1752 * 1048375491) >= (class161.anInt1751 * -533476177 << class161.anInt1753 * 1252000143)))
					return;
				method2962(class161, i_515_, i_516_, i_517_, i_526_, i_527_, i_528_, i_529_);
			} else if (i == 4) {
				int i_530_ = anInt9318 - anInt9340;
				for (int i_531_ = 0; i_531_ < anInt9302; i_531_++)
					anIntArray9360[i_531_] = (anIntArray9360[i_531_] + (class161_514_.method2619((anIntArray9352[i_531_] + i_515_), (anIntArray9362[i_531_] + i_517_), -702159670) - i_516_) + i_530_);
			} else if (i == 5) {
				int i_532_ = anInt9318 - anInt9340;
				for (int i_533_ = 0; i_533_ < anInt9302; i_533_++) {
					int i_534_ = anIntArray9352[i_533_] + i_515_;
					int i_535_ = anIntArray9362[i_533_] + i_517_;
					int i_536_ = class161.method2619(i_534_, i_535_, -73258566);
					int i_537_ = class161_514_.method2619(i_534_, i_535_, -1809216934);
					int i_538_ = i_536_ - i_537_ - i_513_;
					anIntArray9360[i_533_] = ((anIntArray9360[i_533_] << 8) / i_532_ * i_538_ >> 8) - (i_516_ - i_536_);
				}
			}
			method14759();
			aBool9304 = false;
		}
	}

	void method2887() {
		for (int i = 0; i < anInt9301; i++) {
			anIntArray9352[i] = anIntArray9352[i] + 7 >> 4;
			anIntArray9360[i] = anIntArray9360[i] + 7 >> 4;
			anIntArray9362[i] = anIntArray9362[i] + 7 >> 4;
		}
		method14759();
		aBool9304 = false;
	}

	public void method2888(Class432 class432, int i, boolean bool) {
		if (aShortArray9307 != null) {
			Class432 class432_539_ = class432;
			if (bool) {
				class432_539_ = aClass180_Sub2_9296.aClass432_9512;
				class432_539_.method6918(class432);
			}
			float[] fs = new float[3];
			for (int i_540_ = 0; i_540_ < anInt9302; i_540_++) {
				if ((i & aShortArray9307[i_540_]) != 0) {
					class432_539_.method6883((float) anIntArray9352[i_540_], (float) anIntArray9360[i_540_], (float) anIntArray9362[i_540_], fs);
					anIntArray9352[i_540_] = (int) fs[0];
					anIntArray9360[i_540_] = (int) fs[1];
					anIntArray9362[i_540_] = (int) fs[2];
				}
			}
		}
	}

	public void method2945(int i, int i_541_, Class161 class161, Class161 class161_542_, int i_543_, int i_544_, int i_545_) {
		if (!aBool9304)
			method14754();
		int i_546_ = i_543_ + anInt9342;
		int i_547_ = i_543_ + anInt9343;
		int i_548_ = i_545_ + anInt9344;
		int i_549_ = i_545_ + anInt9345;
		if (i != 1 && i != 2 && i != 3 && i != 5 || (i_546_ >= 0 && ((i_547_ + class161.anInt1752 * 1048375491 >> class161.anInt1753 * 1252000143) < class161.anInt1750 * 1210322533) && i_548_ >= 0 && ((i_549_ + class161.anInt1752 * 1048375491 >> class161.anInt1753 * 1252000143) < class161.anInt1751 * -533476177))) {
			if (i == 4 || i == 5) {
				if (class161_542_ == null || (i_546_ < 0 || ((i_547_ + class161_542_.anInt1752 * 1048375491 >> class161_542_.anInt1753 * 1252000143) >= class161_542_.anInt1750 * 1210322533) || i_548_ < 0 || ((i_549_ + class161_542_.anInt1752 * 1048375491 >> class161_542_.anInt1753 * 1252000143) >= class161_542_.anInt1751 * -533476177)))
					return;
			} else {
				i_546_ >>= class161.anInt1753 * 1252000143;
				i_547_ = (i_547_ + (class161.anInt1752 * 1048375491 - 1) >> class161.anInt1753 * 1252000143);
				i_548_ >>= class161.anInt1753 * 1252000143;
				i_549_ = (i_549_ + (class161.anInt1752 * 1048375491 - 1) >> class161.anInt1753 * 1252000143);
				if (class161.method2595(i_546_, i_548_, (byte) 105) == i_544_ && class161.method2595(i_547_, i_548_, (byte) 76) == i_544_ && class161.method2595(i_546_, i_549_, (byte) 14) == i_544_ && (class161.method2595(i_547_, i_549_, (byte) 48) == i_544_))
					return;
			}
			if (i == 1) {
				for (int i_550_ = 0; i_550_ < anInt9302; i_550_++)
					anIntArray9360[i_550_] = (anIntArray9360[i_550_] + class161.method2619((anIntArray9352[i_550_] + i_543_), (anIntArray9362[i_550_] + i_545_), -677616543) - i_544_);
			} else if (i == 2) {
				int i_551_ = anInt9340;
				if (i_551_ == 0)
					return;
				for (int i_552_ = 0; i_552_ < anInt9302; i_552_++) {
					int i_553_ = (anIntArray9360[i_552_] << 16) / i_551_;
					if (i_553_ < i_541_)
						anIntArray9360[i_552_] = (anIntArray9360[i_552_] + (class161.method2619((anIntArray9352[i_552_] + i_543_), (anIntArray9362[i_552_] + i_545_), -21629316) - i_544_) * (i_541_ - i_553_) / i_541_);
				}
			} else if (i == 3) {
				int i_554_ = (i_541_ & 0xff) * 16;
				int i_555_ = (i_541_ >> 8 & 0xff) * 16;
				int i_556_ = (i_541_ >> 16 & 0xff) << 6;
				int i_557_ = (i_541_ >> 24 & 0xff) << 6;
				if (i_543_ - (i_554_ >> 1) < 0 || ((i_543_ + (i_554_ >> 1) + class161.anInt1752 * 1048375491) >= (class161.anInt1750 * 1210322533 << class161.anInt1753 * 1252000143)) || i_545_ - (i_555_ >> 1) < 0 || ((i_545_ + (i_555_ >> 1) + class161.anInt1752 * 1048375491) >= (class161.anInt1751 * -533476177 << class161.anInt1753 * 1252000143)))
					return;
				method2962(class161, i_543_, i_544_, i_545_, i_554_, i_555_, i_556_, i_557_);
			} else if (i == 4) {
				int i_558_ = anInt9318 - anInt9340;
				for (int i_559_ = 0; i_559_ < anInt9302; i_559_++)
					anIntArray9360[i_559_] = (anIntArray9360[i_559_] + (class161_542_.method2619((anIntArray9352[i_559_] + i_543_), (anIntArray9362[i_559_] + i_545_), -495581703) - i_544_) + i_558_);
			} else if (i == 5) {
				int i_560_ = anInt9318 - anInt9340;
				for (int i_561_ = 0; i_561_ < anInt9302; i_561_++) {
					int i_562_ = anIntArray9352[i_561_] + i_543_;
					int i_563_ = anIntArray9362[i_561_] + i_545_;
					int i_564_ = class161.method2619(i_562_, i_563_, -1435003360);
					int i_565_ = class161_542_.method2619(i_562_, i_563_, -1088004992);
					int i_566_ = i_564_ - i_565_ - i_541_;
					anIntArray9360[i_561_] = ((anIntArray9360[i_561_] << 8) / i_560_ * i_566_ >> 8) - (i_544_ - i_564_);
				}
			}
			method14759();
			aBool9304 = false;
		}
	}

	public void method2991(int i) {
		aShort9300 = (short) i;
		method14759();
		method14752();
	}

	public void method2870(Class432 class432) {
		Class427 class427 = aClass180_Sub2_9296.aClass427_9435;
		class427.method6784(class432);
		if (aClass167Array9303 != null) {
			for (int i = 0; i < aClass167Array9303.length; i++) {
				Class167 class167 = aClass167Array9303[i];
				Class167 class167_567_ = class167;
				if (class167.aClass167_1849 != null)
					class167_567_ = class167.aClass167_1849;
				class167_567_.anInt1855 = (int) (class427.aFloatArray4807[12] + ((class427.aFloatArray4807[0] * (float) (anIntArray9352[class167.anInt1851 * -18705907])) + (class427.aFloatArray4807[4] * (float) anIntArray9360[(class167.anInt1851 * -18705907)]) + (class427.aFloatArray4807[8] * (float) (anIntArray9362[(class167.anInt1851 * -18705907)])))) * 1542395015;
				class167_567_.anInt1856 = ((int) (class427.aFloatArray4807[13] + ((class427.aFloatArray4807[1] * (float) (anIntArray9352[class167.anInt1851 * -18705907])) + (class427.aFloatArray4807[5] * (float) (anIntArray9360[(class167.anInt1851 * -18705907)])) + (class427.aFloatArray4807[9] * (float) (anIntArray9362[(class167.anInt1851 * -18705907)])))) * -1886500927);
				class167_567_.anInt1860 = ((int) (class427.aFloatArray4807[14] + ((class427.aFloatArray4807[2] * (float) (anIntArray9352[class167.anInt1851 * -18705907])) + (class427.aFloatArray4807[6] * (float) (anIntArray9360[(class167.anInt1851 * -18705907)])) + (class427.aFloatArray4807[10] * (float) (anIntArray9362[(class167.anInt1851 * -18705907)])))) * -1731268533);
				class167_567_.anInt1858 = ((int) (class427.aFloatArray4807[12] + ((class427.aFloatArray4807[0] * (float) anIntArray9352[(class167.anInt1852 * -1573542389)]) + (class427.aFloatArray4807[4] * (float) (anIntArray9360[(class167.anInt1852 * -1573542389)])) + (class427.aFloatArray4807[8] * (float) (anIntArray9362[(class167.anInt1852 * -1573542389)])))) * -2034723417);
				class167_567_.anInt1859 = ((int) (class427.aFloatArray4807[13] + ((class427.aFloatArray4807[1] * (float) anIntArray9352[(class167.anInt1852 * -1573542389)]) + (class427.aFloatArray4807[5] * (float) (anIntArray9360[(class167.anInt1852 * -1573542389)])) + (class427.aFloatArray4807[9] * (float) (anIntArray9362[(class167.anInt1852 * -1573542389)])))) * -481732551);
				class167_567_.anInt1862 = ((int) (class427.aFloatArray4807[14] + ((class427.aFloatArray4807[2] * (float) anIntArray9352[(class167.anInt1852 * -1573542389)]) + (class427.aFloatArray4807[6] * (float) (anIntArray9360[(class167.anInt1852 * -1573542389)])) + (class427.aFloatArray4807[10] * (float) (anIntArray9362[(class167.anInt1852 * -1573542389)])))) * -980787877);
				class167_567_.anInt1857 = ((int) (class427.aFloatArray4807[12] + ((class427.aFloatArray4807[0] * (float) anIntArray9352[(class167.anInt1853 * -2116684303)]) + (class427.aFloatArray4807[4] * (float) (anIntArray9360[(class167.anInt1853 * -2116684303)])) + (class427.aFloatArray4807[8] * (float) (anIntArray9362[(class167.anInt1853 * -2116684303)])))) * -1482367683);
				class167_567_.anInt1850 = ((int) (class427.aFloatArray4807[13] + ((class427.aFloatArray4807[1] * (float) anIntArray9352[(class167.anInt1853 * -2116684303)]) + (class427.aFloatArray4807[5] * (float) (anIntArray9360[(class167.anInt1853 * -2116684303)])) + (class427.aFloatArray4807[9] * (float) (anIntArray9362[(class167.anInt1853 * -2116684303)])))) * 1240185219);
				class167_567_.anInt1863 = ((int) (class427.aFloatArray4807[14] + ((class427.aFloatArray4807[2] * (float) anIntArray9352[(class167.anInt1853 * -2116684303)]) + (class427.aFloatArray4807[6] * (float) (anIntArray9360[(class167.anInt1853 * -2116684303)])) + (class427.aFloatArray4807[10] * (float) (anIntArray9362[(class167.anInt1853 * -2116684303)])))) * -857185851);
			}
		}
		if (aClass159Array9354 != null) {
			for (int i = 0; i < aClass159Array9354.length; i++) {
				Class159 class159 = aClass159Array9354[i];
				Class159 class159_568_ = class159;
				if (class159.aClass159_1739 != null)
					class159_568_ = class159.aClass159_1739;
				if (class159.aClass427_1738 != null)
					class159.aClass427_1738.method6750(class427);
				else
					class159.aClass427_1738 = new Class427(class427);
				class159_568_.anInt1744 = ((int) (class427.aFloatArray4807[12] + ((class427.aFloatArray4807[0] * (float) anIntArray9352[(class159.anInt1740 * -449756941)]) + (class427.aFloatArray4807[4] * (float) (anIntArray9360[(class159.anInt1740 * -449756941)])) + (class427.aFloatArray4807[8] * (float) (anIntArray9362[(class159.anInt1740 * -449756941)])))) * -306739393);
				class159_568_.anInt1742 = ((int) (class427.aFloatArray4807[13] + ((class427.aFloatArray4807[1] * (float) anIntArray9352[(class159.anInt1740 * -449756941)]) + (class427.aFloatArray4807[5] * (float) (anIntArray9360[(class159.anInt1740 * -449756941)])) + (class427.aFloatArray4807[9] * (float) (anIntArray9362[(class159.anInt1740 * -449756941)])))) * -1995176663);
				class159_568_.anInt1743 = (int) (class427.aFloatArray4807[14] + ((class427.aFloatArray4807[2] * (float) (anIntArray9352[class159.anInt1740 * -449756941])) + (class427.aFloatArray4807[6] * (float) anIntArray9360[(class159.anInt1740 * -449756941)]) + (class427.aFloatArray4807[10] * (float) (anIntArray9362[(class159.anInt1740 * -449756941)])))) * 76591605;
			}
		}
	}

	public boolean method3051(int i, int i_569_, Class432 class432, boolean bool, int i_570_) {
		return method14761(i, i_569_, 0, 0, class432, bool, i_570_);
	}

	boolean method14761(int i, int i_571_, int i_572_, int i_573_, Class432 class432, boolean bool, int i_574_) {
		Class427 class427 = aClass180_Sub2_9296.aClass427_9435;
		class427.method6784(class432);
		class427.method6751(aClass180_Sub2_9296.aClass427_9530);
		boolean bool_575_ = false;
		float f = 3.4028235E38F;
		float f_576_ = -3.4028235E38F;
		float f_577_ = 3.4028235E38F;
		float f_578_ = -3.4028235E38F;
		if (!aBool9304)
			method14754();
		int i_579_ = anInt9343 - anInt9342 >> 1;
		int i_580_ = anInt9318 - anInt9340 >> 1;
		int i_581_ = anInt9345 - anInt9344 >> 1;
		int i_582_ = anInt9342 + i_579_;
		int i_583_ = anInt9340 + i_580_;
		int i_584_ = anInt9344 + i_581_;
		int i_585_ = i_582_ - (i_579_ << i_574_);
		int i_586_ = i_583_ - (i_580_ << i_574_);
		int i_587_ = i_584_ - (i_581_ << i_574_);
		int i_588_ = i_582_ + (i_579_ << i_574_);
		int i_589_ = i_583_ + (i_580_ << i_574_);
		int i_590_ = i_584_ + (i_581_ << i_574_);
		anIntArray9363[0] = i_585_;
		anIntArray9364[0] = i_586_;
		anIntArray9365[0] = i_587_;
		anIntArray9363[1] = i_588_;
		anIntArray9364[1] = i_586_;
		anIntArray9365[1] = i_587_;
		anIntArray9363[2] = i_585_;
		anIntArray9364[2] = i_589_;
		anIntArray9365[2] = i_587_;
		anIntArray9363[3] = i_588_;
		anIntArray9364[3] = i_589_;
		anIntArray9365[3] = i_587_;
		anIntArray9363[4] = i_585_;
		anIntArray9364[4] = i_586_;
		anIntArray9365[4] = i_590_;
		anIntArray9363[5] = i_588_;
		anIntArray9364[5] = i_586_;
		anIntArray9365[5] = i_590_;
		anIntArray9363[6] = i_585_;
		anIntArray9364[6] = i_589_;
		anIntArray9365[6] = i_590_;
		anIntArray9363[7] = i_588_;
		anIntArray9364[7] = i_589_;
		anIntArray9365[7] = i_590_;
		for (int i_591_ = 0; i_591_ < 8; i_591_++) {
			float f_592_ = (float) anIntArray9363[i_591_];
			float f_593_ = (float) anIntArray9364[i_591_];
			float f_594_ = (float) anIntArray9365[i_591_];
			float f_595_ = (class427.aFloatArray4807[2] * f_592_ + class427.aFloatArray4807[6] * f_593_ + class427.aFloatArray4807[10] * f_594_ + class427.aFloatArray4807[14]);
			float f_596_ = (class427.aFloatArray4807[3] * f_592_ + class427.aFloatArray4807[7] * f_593_ + class427.aFloatArray4807[11] * f_594_ + class427.aFloatArray4807[15]);
			if (f_595_ >= -f_596_) {
				float f_597_ = (class427.aFloatArray4807[0] * f_592_ + class427.aFloatArray4807[4] * f_593_ + class427.aFloatArray4807[8] * f_594_ + class427.aFloatArray4807[12]);
				float f_598_ = (class427.aFloatArray4807[1] * f_592_ + class427.aFloatArray4807[5] * f_593_ + class427.aFloatArray4807[9] * f_594_ + class427.aFloatArray4807[13]);
				float f_599_ = (aClass180_Sub2_9296.aFloat9476 + aClass180_Sub2_9296.aFloat9477 * f_597_ / f_596_);
				float f_600_ = (aClass180_Sub2_9296.aFloat9478 + aClass180_Sub2_9296.aFloat9500 * f_598_ / f_596_);
				if (f_599_ < f)
					f = f_599_;
				if (f_599_ > f_576_)
					f_576_ = f_599_;
				if (f_600_ < f_577_)
					f_577_ = f_600_;
				if (f_600_ > f_578_)
					f_578_ = f_600_;
				bool_575_ = true;
			}
		}
		int i_601_ = i + i_572_;
		int i_602_ = i_571_ + i_573_;
		if (bool_575_ && (float) i_601_ > f && (float) i < f_576_ && (float) i_602_ > f_577_ && (float) i_571_ < f_578_) {
			if (bool)
				return true;
			if (anIntArray9338.length < anInt9308) {
				anIntArray9338 = new int[anInt9308];
				anIntArray9330 = new int[anInt9308];
			}
			for (int i_603_ = 0; i_603_ < anInt9302; i_603_++) {
				float f_604_ = (float) anIntArray9352[i_603_];
				float f_605_ = (float) anIntArray9360[i_603_];
				float f_606_ = (float) anIntArray9362[i_603_];
				float f_607_ = (class427.aFloatArray4807[2] * f_604_ + class427.aFloatArray4807[6] * f_605_ + class427.aFloatArray4807[10] * f_606_ + class427.aFloatArray4807[14]);
				float f_608_ = (class427.aFloatArray4807[3] * f_604_ + class427.aFloatArray4807[7] * f_605_ + class427.aFloatArray4807[11] * f_606_ + class427.aFloatArray4807[15]);
				if (f_607_ >= -f_608_) {
					float f_609_ = (class427.aFloatArray4807[0] * f_604_ + class427.aFloatArray4807[4] * f_605_ + class427.aFloatArray4807[8] * f_606_ + class427.aFloatArray4807[12]);
					float f_610_ = (class427.aFloatArray4807[1] * f_604_ + class427.aFloatArray4807[5] * f_605_ + class427.aFloatArray4807[9] * f_606_ + class427.aFloatArray4807[13]);
					int i_611_ = anIntArray9351[i_603_];
					int i_612_ = anIntArray9351[i_603_ + 1];
					for (int i_613_ = i_611_; i_613_ < i_612_ && aShortArray9366[i_613_] != 0; i_613_++) {
						int i_614_ = (aShortArray9366[i_613_] & 0xffff) - 1;
						anIntArray9338[i_614_] = (int) (aClass180_Sub2_9296.aFloat9476 + (aClass180_Sub2_9296.aFloat9477 * f_609_ / f_608_));
						anIntArray9330[i_614_] = (int) (aClass180_Sub2_9296.aFloat9478 + (aClass180_Sub2_9296.aFloat9500 * f_610_ / f_608_));
					}
				} else {
					int i_615_ = anIntArray9351[i_603_];
					int i_616_ = anIntArray9351[i_603_ + 1];
					for (int i_617_ = i_615_; i_617_ < i_616_ && aShortArray9366[i_617_] != 0; i_617_++) {
						int i_618_ = (aShortArray9366[i_617_] & 0xffff) - 1;
						anIntArray9338[i_618_] = -999999;
					}
				}
			}
			for (int i_619_ = 0; i_619_ < anInt9369; i_619_++) {
				if (anIntArray9338[aShortArray9322[i_619_] & 0xffff] != -999999 && (anIntArray9338[aShortArray9323[i_619_] & 0xffff] != -999999) && (anIntArray9338[aShortArray9324[i_619_] & 0xffff] != -999999)
						&& (method14762(i, i_571_, i_601_, i_602_, anIntArray9330[aShortArray9322[i_619_] & 0xffff], anIntArray9330[aShortArray9323[i_619_] & 0xffff], anIntArray9330[aShortArray9324[i_619_] & 0xffff], anIntArray9338[aShortArray9322[i_619_] & 0xffff], anIntArray9338[aShortArray9323[i_619_] & 0xffff], anIntArray9338[aShortArray9324[i_619_] & 0xffff])))
					return true;
			}
		}
		return false;
	}

	boolean method14762(int i, int i_620_, int i_621_, int i_622_, int i_623_, int i_624_, int i_625_, int i_626_, int i_627_, int i_628_) {
		if (i_622_ < i_623_ && i_622_ < i_624_ && i_622_ < i_625_)
			return false;
		if (i_620_ > i_623_ && i_620_ > i_624_ && i_620_ > i_625_)
			return false;
		if (i_621_ < i_626_ && i_621_ < i_627_ && i_621_ < i_628_)
			return false;
		if (i > i_626_ && i > i_627_ && i > i_628_)
			return false;
		return true;
	}

	public Class527_Sub8_Sub8 method2891(Class527_Sub8_Sub8 class527_sub8_sub8) {
		if (anInt9308 == 0)
			return null;
		if (!aBool9304)
			method14754();
		int i;
		int i_629_;
		if (aClass180_Sub2_9296.anInt9523 > 0) {
			i = (anInt9342 - (anInt9318 * aClass180_Sub2_9296.anInt9523 >> 8) >> aClass180_Sub2_9296.anInt9522);
			i_629_ = anInt9343 - (anInt9340 * aClass180_Sub2_9296.anInt9523 >> 8) >> aClass180_Sub2_9296.anInt9522;
		} else {
			i = (anInt9342 - (anInt9340 * aClass180_Sub2_9296.anInt9523 >> 8) >> aClass180_Sub2_9296.anInt9522);
			i_629_ = anInt9343 - (anInt9318 * aClass180_Sub2_9296.anInt9523 >> 8) >> aClass180_Sub2_9296.anInt9522;
		}
		int i_630_;
		int i_631_;
		if (aClass180_Sub2_9296.anInt9584 > 0) {
			i_630_ = anInt9344 - (anInt9318 * aClass180_Sub2_9296.anInt9584 >> 8) >> aClass180_Sub2_9296.anInt9522;
			i_631_ = anInt9345 - (anInt9340 * aClass180_Sub2_9296.anInt9584 >> 8) >> aClass180_Sub2_9296.anInt9522;
		} else {
			i_630_ = anInt9344 - (anInt9340 * aClass180_Sub2_9296.anInt9584 >> 8) >> aClass180_Sub2_9296.anInt9522;
			i_631_ = anInt9345 - (anInt9318 * aClass180_Sub2_9296.anInt9584 >> 8) >> aClass180_Sub2_9296.anInt9522;
		}
		int i_632_ = i_629_ - i + 1;
		int i_633_ = i_631_ - i_630_ + 1;
		Class527_Sub8_Sub8_Sub2 class527_sub8_sub8_sub2 = (Class527_Sub8_Sub8_Sub2) class527_sub8_sub8;
		Class527_Sub8_Sub8_Sub2 class527_sub8_sub8_sub2_634_;
		if (class527_sub8_sub8_sub2 != null && class527_sub8_sub8_sub2.method18742(i_632_, i_633_)) {
			class527_sub8_sub8_sub2_634_ = class527_sub8_sub8_sub2;
			class527_sub8_sub8_sub2_634_.method18743();
		} else
			class527_sub8_sub8_sub2_634_ = new Class527_Sub8_Sub8_Sub2(aClass180_Sub2_9296, i_632_, i_633_);
		class527_sub8_sub8_sub2_634_.method18741(i, i_630_, i_629_, i_631_);
		method14774(class527_sub8_sub8_sub2_634_);
		return class527_sub8_sub8_sub2_634_;
	}

	public int method2993() {
		return aShort9339;
	}

	public void method3005(short i, short i_635_) {
		Class181 class181 = aClass180_Sub2_9296.aClass181_2059;
		for (int i_636_ = 0; i_636_ < anInt9369; i_636_++) {
			if (aShortArray9325[i_636_] == i)
				aShortArray9325[i_636_] = i_635_;
		}
		byte i_637_ = 0;
		byte i_638_ = 0;
		if (i != -1) {
			Class163 class163 = class181.method3544(i & 0xffff, (byte) -108);
			i_637_ = class163.aByte1808;
			i_638_ = class163.aByte1802;
		}
		byte i_639_ = 0;
		byte i_640_ = 0;
		if (i_635_ != -1) {
			Class163 class163 = class181.method3544(i_635_ & 0xffff, (byte) -53);
			i_639_ = class163.aByte1808;
			i_640_ = class163.aByte1802;
			if (class163.aByte1781 != 0 || class163.aByte1797 != 0)
				aBool9336 = true;
		}
		if (i_637_ != i_639_ | i_638_ != i_640_) {
			if (aClass361Array9356 != null) {
				for (int i_641_ = 0; i_641_ < anInt9355; i_641_++) {
					Class361 class361 = aClass361Array9356[i_641_];
					Class354 class354 = aClass354Array9347[i_641_];
					class354.anInt3804 = (class354.anInt3804 & ~0xffffff | ((Class656.anIntArray8390[aShortArray9326[class361.anInt3841] & 0xffff]) & 0xffffff));
				}
			}
			method14751();
		}
	}

	void method14763(Class432 class432) {
		if (anInt9319 != 0 && (method14768() && method14772())) {
			if (aClass348_9370 == null) {
				/* empty */
			}
			aClass180_Sub2_9296.method14998();
			aClass180_Sub2_9296.method14958();
			Class326 class326 = aClass180_Sub2_9296.aClass326_9541;
			aClass180_Sub2_9296.method14988(0, aClass363_9299.anInterface37_3856);
			aClass180_Sub2_9296.method14988(1, aClass363_9334.anInterface37_3856);
			aClass180_Sub2_9296.method14988(2, aClass363_9332.anInterface37_3856);
			aClass180_Sub2_9296.method15001(aClass344_9361.anInterface44_3693);
			aClass180_Sub2_9296.aClass427_9435.method6784(class432);
			class326.method5770(aClass180_Sub2_9296.aClass427_9435);
			class326.aClass427_3583.method6742();
			if (aClass180_Sub2_9296.aBool9495) {
				Class178 class178 = aClass180_Sub2_9296.method14987();
				class326.aClass441_3587.method7118(0.0F, 1.0F, 0.0F, (float) -aClass180_Sub2_9296.anInt9557);
				class326.aClass441_3587.method7128(3.0F / (float) ((class178.anInt2050) * 112490777));
				class326.aClass442_3588.method7138(((float) (class178.anInt2055 * -2080392837 >> 16 & 0xff) / 255.0F), ((float) (class178.anInt2055 * -2080392837 >> 8 & 0xff) / 255.0F), ((float) (class178.anInt2055 * -2080392837 >> 0 & 0xff) / 255.0F));
			} else {
				class326.aClass441_3587.method7118(0.0F, 0.0F, 0.0F, 0.0F);
				class326.aClass442_3588.method7138(0.0F, 0.0F, 0.0F);
			}
			if (aClass180_Sub2_9296.anInt9562 > 0) {
				class326.aClass441_3589.method7118(0.0F, 0.0F, 1.0F, -(aClass180_Sub2_9296.aFloat9517));
				class326.aClass442_3581.method7138(((float) (aClass180_Sub2_9296.anInt9561 >> 16 & 0xff) / 255.0F), ((float) (aClass180_Sub2_9296.anInt9561 >> 8 & 0xff) / 255.0F), ((float) (aClass180_Sub2_9296.anInt9561 >> 0 & 0xff) / 255.0F));
				aClass180_Sub2_9296.aClass427_9435.method6784(class432);
				aClass180_Sub2_9296.aClass427_9435.method6790();
				class326.aClass441_3587.method7123(aClass180_Sub2_9296.aClass427_9435);
				aClass180_Sub2_9296.aClass427_9435.method6784(class432);
				aClass180_Sub2_9296.aClass427_9435.method6751(aClass180_Sub2_9296.aClass427_9459);
				aClass180_Sub2_9296.aClass427_9435.method6790();
				class326.aClass441_3589.method7123(aClass180_Sub2_9296.aClass427_9435);
				class326.aClass441_3589.method7128(1.0F / (aClass180_Sub2_9296.aFloat9565 - aClass180_Sub2_9296.aFloat9517));
			} else {
				class326.aClass441_3589.method7118(0.0F, 0.0F, 0.0F, 0.0F);
				class326.aClass442_3581.method7138(0.0F, 0.0F, 0.0F);
			}
			if ((anInt9298 & 0x37) == 0) {
				aClass180_Sub2_9296.method15149(aClass180_Sub2_9296.aClass355_9594);
				if (aClass180_Sub2_9296.aBool9597)
					aClass180_Sub2_9296.method14954(false);
				for (int i = 0; i < anIntArray9349.length; i++) {
					int i_642_ = anIntArray9348[i];
					int i_643_ = anIntArray9348[i + 1];
					int i_644_ = aShortArray9325[i_642_];
					boolean bool = false;
					byte i_645_ = 0;
					if (i_644_ != -1) {
						Class163 class163 = aClass180_Sub2_9296.aClass181_2059.method3544(i_644_ & 0xffff, (byte) -29);
						class326.anInterface38_3595 = aClass180_Sub2_9296.aClass336_9532.method5895(class163);
						bool = !Class306.method5607(class163.aByte1801, -1088851960);
						class326.aClass427_3583.aFloatArray4807[12] = ((float) (aClass180_Sub2_9296.anInt9574 % 128000) / 1000.0F * (float) class163.aByte1781 / 64.0F % 1.0F);
						class326.aClass427_3583.aFloatArray4807[13] = ((float) (aClass180_Sub2_9296.anInt9574 % 128000) / 1000.0F * (float) class163.aByte1797 / 64.0F % 1.0F);
						if (class163.aClass595_1784 == Class595.aClass595_7815)
							i_645_ = class163.aByte1764;
					} else {
						class326.anInterface38_3595 = aClass180_Sub2_9296.anInterface38_9533;
						float[] fs = class326.aClass427_3583.aFloatArray4807;
						class326.aClass427_3583.aFloatArray4807[13] = 0.0F;
						fs[12] = 0.0F;
					}
					aClass180_Sub2_9296.method14990(i_645_);
					class326.anInt3598 = anIntArray9349[i];
					class326.anInt3597 = anIntArray9350[i];
					class326.anInt3584 = i_642_ * 3;
					class326.anInt3599 = i_643_ - i_642_;
					class326.method5757(bool);
				}
			} else {
				aClass180_Sub2_9296.method14988(3, aClass363_9368.anInterface37_3856);
				aClass180_Sub2_9296.method15149(aClass180_Sub2_9296.aClass355_9595);
				Class432 class432_646_ = aClass180_Sub2_9296.aClass432_9512;
				class432_646_.method6899(class432);
				class432_646_.method6887();
				int i = 0;
				if (aClass180_Sub2_9296.aBool9597)
					aClass180_Sub2_9296.method14954(true);
				else {
					class326.aClass442_3591.method7138(aClass180_Sub2_9296.aFloatArray9507[0], aClass180_Sub2_9296.aFloatArray9507[1], aClass180_Sub2_9296.aFloatArray9507[2]);
					class326.aClass442_3591.method7230(class432_646_);
					class326.aClass442_3590.method7138((aClass180_Sub2_9296.aFloat9516 * aClass180_Sub2_9296.aFloat9583), (aClass180_Sub2_9296.aFloat9516 * aClass180_Sub2_9296.aFloat9513), (aClass180_Sub2_9296.aFloat9516 * aClass180_Sub2_9296.aFloat9448));
					class326.aClass442_3593.method7138((-aClass180_Sub2_9296.aFloat9548 * aClass180_Sub2_9296.aFloat9583), (-aClass180_Sub2_9296.aFloat9548 * aClass180_Sub2_9296.aFloat9513), (-aClass180_Sub2_9296.aFloat9548 * aClass180_Sub2_9296.aFloat9448));
					class326.aClass442_3594.method7138((aClass180_Sub2_9296.aFloat9551 * aClass180_Sub2_9296.aFloat9583), (aClass180_Sub2_9296.aFloat9551 * aClass180_Sub2_9296.aFloat9513), (aClass180_Sub2_9296.aFloat9551 * aClass180_Sub2_9296.aFloat9448));
					if (aClass180_Sub2_9296.anInt9526 > 0) {
						i = aClass180_Sub2_9296.anInt9526;
						Class442 class442 = aClass180_Sub2_9296.aClass442_9461;
						for (int i_647_ = 0; i_647_ < i; i_647_++) {
							Class527_Sub16 class527_sub16 = (aClass180_Sub2_9296.aClass527_Sub16Array9520[i_647_]);
							int i_648_ = class527_sub16.method16133((byte) 0);
							class442.method7146(class527_sub16.aClass442_10462);
							class442.method7151(class432_646_);
							class326.aFloatArray3580[i_647_ * 4 + 0] = class442.aFloat4918;
							class326.aFloatArray3580[i_647_ * 4 + 1] = class442.aFloat4915;
							class326.aFloatArray3580[i_647_ * 4 + 2] = class442.aFloat4919;
							class326.aFloatArray3580[i_647_ * 4 + 3] = (1.0F / (float) (class527_sub16.method16132(-268630951) * class527_sub16.method16132(650514067)));
							float f = (class527_sub16.method16162(-2121826624) / 255.0F);
							class326.aFloatArray3579[i_647_ * 4 + 0] = (float) (i_648_ >> 16 & 0xff) * f;
							class326.aFloatArray3579[i_647_ * 4 + 1] = (float) (i_648_ >> 8 & 0xff) * f;
							class326.aFloatArray3579[i_647_ * 4 + 2] = (float) (i_648_ & 0xff) * f;
							class326.aFloatArray3579[i_647_ * 4 + 3] = 1.0F;
						}
					}
				}
				for (int i_649_ = 0; i_649_ < anIntArray9349.length; i_649_++) {
					int i_650_ = anIntArray9348[i_649_];
					int i_651_ = anIntArray9348[i_649_ + 1];
					int i_652_ = aShortArray9325[i_650_];
					byte i_653_ = 11;
					Class163 class163 = null;
					byte i_654_ = 0;
					if (i_652_ != -1) {
						class163 = aClass180_Sub2_9296.aClass181_2059.method3544(i_652_ & 0xffff, (byte) -85);
						class326.anInterface38_3595 = aClass180_Sub2_9296.aClass336_9532.method5895(class163);
						i_653_ = class163.aByte1801;
						class326.method5755(class163.aByte1775);
						class326.aClass427_3583.aFloatArray4807[12] = ((float) (aClass180_Sub2_9296.anInt9574 % 128000) / 1000.0F * (float) class163.aByte1781 / 64.0F % 1.0F);
						class326.aClass427_3583.aFloatArray4807[13] = ((float) (aClass180_Sub2_9296.anInt9574 % 128000) / 1000.0F * (float) class163.aByte1797 / 64.0F % 1.0F);
						if (class163.aClass595_1784 == Class595.aClass595_7815)
							i_654_ = class163.aByte1764;
					} else {
						class326.anInterface38_3595 = aClass180_Sub2_9296.anInterface38_9533;
						float[] fs = class326.aClass427_3583.aFloatArray4807;
						class326.aClass427_3583.aFloatArray4807[13] = 0.0F;
						fs[12] = 0.0F;
					}
					aClass180_Sub2_9296.method14990(i_654_);
					class326.anInt3598 = anIntArray9349[i_649_];
					class326.anInt3597 = anIntArray9350[i_649_];
					class326.anInt3584 = i_650_ * 3;
					class326.anInt3599 = i_651_ - i_650_;
					switch (i_653_) {
					case 5:
						if (!aClass180_Sub2_9296.aBool9597) {
							Class350_Sub1_Sub1 class350_sub1_sub1 = aClass180_Sub2_9296.aClass350_Sub1_Sub1_9547;
							class350_sub1_sub1.method17990(class163.aByte1775, (class163.anInt1805 * -1860683695), (byte) -61);
							class350_sub1_sub1.aClass427_11428.method6784(class432);
							class350_sub1_sub1.aClass427_11426.method6784(class432);
							class350_sub1_sub1.aClass427_11426.method6751(aClass180_Sub2_9296.aClass427_9474);
							class350_sub1_sub1.anInt11434 = anIntArray9349[i_649_] * 864923621;
							class350_sub1_sub1.anInt11435 = anIntArray9350[i_649_] * 1474049869;
							class350_sub1_sub1.anInt11436 = i_650_ * 463347371;
							class350_sub1_sub1.anInt11420 = (i_651_ - i_650_) * -400534729;
							class350_sub1_sub1.method17988(1492864119);
						} else
							class326.method5758(i);
						break;
					default:
						class326.method5758(i);
						break;
					case 7:
						class326.aClass442_3592.method7138((aClass180_Sub2_9296.aClass427_9453.aFloatArray4807[12]), (aClass180_Sub2_9296.aClass427_9453.aFloatArray4807[13]), (aClass180_Sub2_9296.aClass427_9453.aFloatArray4807[14]));
						class326.aClass442_3592.method7151(class432_646_);
						class326.aClass427_3577.method6784(class432);
						class326.anInterface39_3582 = aClass180_Sub2_9296.method14925();
						class326.method5760(i);
						break;
					case 1:
						class326.aClass442_3592.method7138((aClass180_Sub2_9296.aClass427_9453.aFloatArray4807[12]), (aClass180_Sub2_9296.aClass427_9453.aFloatArray4807[13]), (aClass180_Sub2_9296.aClass427_9453.aFloatArray4807[14]));
						class326.aClass442_3592.method7151(class432_646_);
						class326.method5754(i);
						break;
					case 6:
						class326.method5757(!Class306.method5607(i_653_, -1088851960));
					}
				}
			}
			method14750();
		}
	}

	void method14764(Class427 class427) {
		if (aClass361Array9356 != null) {
			aClass180_Sub2_9296.method3182(!aBool9335);
			Class432 class432 = aClass180_Sub2_9296.aClass432_9512;
			Class313 class313 = aClass180_Sub2_9296.aClass313_9544;
			boolean bool = aClass180_Sub2_9296.anInt9562 > 0;
			if (bool)
				class313.aClass442_3503.method7138(((float) (aClass180_Sub2_9296.anInt9561 >> 16 & 0xff) / 255.0F), ((float) (aClass180_Sub2_9296.anInt9561 >> 8 & 0xff) / 255.0F), ((float) (aClass180_Sub2_9296.anInt9561 >> 0 & 0xff) / 255.0F));
			else
				class313.aClass442_3503.method7138(0.0F, 0.0F, 0.0F);
			for (int i = 0; i < anInt9355; i++) {
				Class361 class361 = aClass361Array9356[i];
				Class354 class354 = aClass354Array9347[i];
				if (!class361.aBool3848 || !aClass180_Sub2_9296.method3204()) {
					float f = ((float) (anIntArray9352[class361.anInt3844] + anIntArray9352[class361.anInt3842] + anIntArray9352[class361.anInt3846]) * 0.3333333F);
					float f_655_ = ((float) (anIntArray9360[class361.anInt3844] + anIntArray9360[class361.anInt3842] + anIntArray9360[class361.anInt3846]) * 0.3333333F);
					float f_656_ = ((float) (anIntArray9362[class361.anInt3844] + anIntArray9362[class361.anInt3842] + anIntArray9362[class361.anInt3846]) * 0.3333333F);
					float f_657_ = (class427.aFloatArray4807[0] * f + class427.aFloatArray4807[4] * f_655_ + class427.aFloatArray4807[8] * f_656_ + class427.aFloatArray4807[12]);
					float f_658_ = (class427.aFloatArray4807[1] * f + class427.aFloatArray4807[5] * f_655_ + class427.aFloatArray4807[9] * f_656_ + class427.aFloatArray4807[13]);
					float f_659_ = (class427.aFloatArray4807[2] * f + class427.aFloatArray4807[6] * f_655_ + class427.aFloatArray4807[10] * f_656_ + class427.aFloatArray4807[14]);
					float f_660_ = ((float) (1.0 / Math.sqrt((double) (f_657_ * f_657_ + f_658_ * f_658_ + f_659_ * f_659_))) * (float) class361.anInt3849);
					class432.method6884(class354.anInt3809, class354.anInt3805 * class361.aShort3843 >> 7, class354.anInt3808 * class361.aShort3845 >> 7, f_657_ + (float) class354.anInt3807 - f_657_ * f_660_, f_658_ + (float) class354.anInt3806 - f_658_ * f_660_, f_659_ - f_659_ * f_660_);
					class432.method6882(aClass180_Sub2_9296.aClass432_9451);
					aClass180_Sub2_9296.aClass427_9491.method6784(class432);
					class313.method5654(aClass180_Sub2_9296.aClass427_9491);
					class313.aClass427_3501.method6742();
					class313.anInt3499 = class354.anInt3804;
					if (bool)
						class313.aFloat3504 = 1.0F - ((aClass180_Sub2_9296.aFloat9565 - f_659_) / (aClass180_Sub2_9296.aFloat9565 - aClass180_Sub2_9296.aFloat9517));
					class313.anInterface38_3498 = null;
					if (class361.aShort3847 != -1)
						class313.anInterface38_3498 = (aClass180_Sub2_9296.aClass336_9532.method5895(aClass180_Sub2_9296.aClass181_2059.method3544(class361.aShort3847 & 0xffff, (byte) -20)));
					class313.method5656(bool);
				}
			}
			aClass180_Sub2_9296.method3182(true);
		}
	}

	public int method2979() {
		if (!aBool9304)
			method14754();
		return anInt9340;
	}

	public boolean method2948(int i, int i_661_, Class432 class432, boolean bool, int i_662_) {
		return method14761(i, i_661_, 0, 0, class432, bool, i_662_);
	}

	void method14765() {
		if (aClass363_9299 != null)
			aClass363_9299.method6329();
		if (aClass363_9332 != null)
			aClass363_9332.method6329();
		if (aClass363_9334 != null)
			aClass363_9334.method6329();
		if (aClass363_9368 != null)
			aClass363_9368.method6329();
		if (aClass344_9361 != null)
			aClass344_9361.method6087();
	}

	public void method2925(int i) {
		if (aClass363_9299 != null)
			aClass363_9299.aBool3854 = Class337.method5960(i, anInt9298);
		if (aClass363_9332 != null)
			aClass363_9332.aBool3854 = Class337.method5924(i, anInt9298);
		if (aClass363_9334 != null)
			aClass363_9334.aBool3854 = Class337.method5923(i, anInt9298);
		if (aClass363_9368 != null)
			aClass363_9368.aBool3854 = Class337.method5975(i, anInt9298);
		anInt9297 = i;
		if (aClass379_9317 != null && (anInt9297 & 0x10000) == 0) {
			aShortArray9311 = aClass379_9317.aShortArray3928;
			aShortArray9305 = aClass379_9317.aShortArray3929;
			aShortArray9313 = aClass379_9317.aShortArray3930;
			aByteArray9314 = aClass379_9317.aByteArray3931;
			aClass379_9317 = null;
		}
		aBool9320 = true;
		method14750();
	}

	int method14766(int i, short i_663_, int i_664_) {
		int i_665_ = aClass180_Sub2_9296.anIntArray9576[method14760(i, i_664_)];
		if (i_663_ != -1) {
			Class163 class163 = aClass180_Sub2_9296.aClass181_2059.method3544(i_663_ & 0xffff, (byte) -22);
			int i_666_ = class163.aByte1808 & 0xff;
			if (i_666_ != 0) {
				int i_667_ = 131586 * i_664_;
				if (i_664_ < 0)
					i_667_ = 0;
				else if (i_664_ > 127)
					i_667_ = 16777215;
				else
					i_667_ = 131586 * i_664_;
				if (i_666_ == 256)
					i_665_ = i_667_;
				else {
					int i_668_ = i_666_;
					int i_669_ = 256 - i_666_;
					i_665_ = ((((i_667_ & 0xff00ff) * i_668_ + (i_665_ & 0xff00ff) * i_669_) & ~0xff00ff) + (((i_667_ & 0xff00) * i_668_ + (i_665_ & 0xff00) * i_669_) & 0xff0000)) >> 8;
				}
			}
			int i_670_ = class163.aByte1802 & 0xff;
			if (i_670_ != 0) {
				i_670_ += 256;
				int i_671_ = ((i_665_ & 0xff0000) >> 16) * i_670_;
				if (i_671_ > 65535)
					i_671_ = 65535;
				int i_672_ = ((i_665_ & 0xff00) >> 8) * i_670_;
				if (i_672_ > 65535)
					i_672_ = 65535;
				int i_673_ = (i_665_ & 0xff) * i_670_;
				if (i_673_ > 65535)
					i_673_ = 65535;
				i_665_ = (i_671_ << 8 & 0xff0000) + (i_672_ & 0xff00) + (i_673_ >> 8);
			}
		}
		return i_665_ & 0xffffff;
	}

	public void method2918(Class176 class176, int i, int i_674_, int i_675_, boolean bool) {
		Class176_Sub3 class176_sub3_676_ = (Class176_Sub3) class176;
		if (anInt9369 != 0 && class176_sub3_676_.anInt9369 != 0) {
			int i_677_ = class176_sub3_676_.anInt9302;
			int[] is = class176_sub3_676_.anIntArray9352;
			int[] is_678_ = class176_sub3_676_.anIntArray9360;
			int[] is_679_ = class176_sub3_676_.anIntArray9362;
			short[] is_680_ = class176_sub3_676_.aShortArray9311;
			short[] is_681_ = class176_sub3_676_.aShortArray9305;
			short[] is_682_ = class176_sub3_676_.aShortArray9313;
			byte[] is_683_ = class176_sub3_676_.aByteArray9314;
			short[] is_684_;
			short[] is_685_;
			short[] is_686_;
			byte[] is_687_;
			if (aClass379_9317 != null) {
				is_684_ = aClass379_9317.aShortArray3928;
				is_685_ = aClass379_9317.aShortArray3929;
				is_686_ = aClass379_9317.aShortArray3930;
				is_687_ = aClass379_9317.aByteArray3931;
			} else {
				is_684_ = null;
				is_685_ = null;
				is_686_ = null;
				is_687_ = null;
			}
			short[] is_688_;
			short[] is_689_;
			short[] is_690_;
			byte[] is_691_;
			if (class176_sub3_676_.aClass379_9317 != null) {
				is_688_ = class176_sub3_676_.aClass379_9317.aShortArray3928;
				is_689_ = class176_sub3_676_.aClass379_9317.aShortArray3929;
				is_690_ = class176_sub3_676_.aClass379_9317.aShortArray3930;
				is_691_ = class176_sub3_676_.aClass379_9317.aByteArray3931;
			} else {
				is_688_ = null;
				is_689_ = null;
				is_690_ = null;
				is_691_ = null;
			}
			int[] is_692_ = class176_sub3_676_.anIntArray9351;
			short[] is_693_ = class176_sub3_676_.aShortArray9366;
			if (!class176_sub3_676_.aBool9304)
				class176_sub3_676_.method14754();
			int i_694_ = class176_sub3_676_.anInt9340;
			int i_695_ = class176_sub3_676_.anInt9318;
			int i_696_ = class176_sub3_676_.anInt9342;
			int i_697_ = class176_sub3_676_.anInt9343;
			int i_698_ = class176_sub3_676_.anInt9344;
			int i_699_ = class176_sub3_676_.anInt9345;
			for (int i_700_ = 0; i_700_ < anInt9302; i_700_++) {
				int i_701_ = anIntArray9360[i_700_] - i_674_;
				if (i_701_ >= i_694_ && i_701_ <= i_695_) {
					int i_702_ = anIntArray9352[i_700_] - i;
					if (i_702_ >= i_696_ && i_702_ <= i_697_) {
						int i_703_ = anIntArray9362[i_700_] - i_675_;
						if (i_703_ >= i_698_ && i_703_ <= i_699_) {
							int i_704_ = -1;
							int i_705_ = anIntArray9351[i_700_];
							int i_706_ = anIntArray9351[i_700_ + 1];
							for (int i_707_ = i_705_; (i_707_ < i_706_ && aShortArray9366[i_707_] != 0); i_707_++) {
								i_704_ = (aShortArray9366[i_707_] & 0xffff) - 1;
								if (aByteArray9314[i_704_] != 0)
									break;
							}
							if (i_704_ != -1) {
								for (int i_708_ = 0; i_708_ < i_677_; i_708_++) {
									if (i_702_ == is[i_708_] && i_703_ == is_679_[i_708_] && i_701_ == is_678_[i_708_]) {
										int i_709_ = -1;
										i_705_ = is_692_[i_708_];
										i_706_ = is_692_[i_708_ + 1];
										for (int i_710_ = i_705_; (i_710_ < i_706_ && is_693_[i_710_] != 0); i_710_++) {
											i_709_ = is_693_[i_710_] - 1 & 0xffff;
											if (is_683_[i_709_] != 0)
												break;
										}
										if (i_709_ != -1) {
											if (is_684_ == null) {
												aClass379_9317 = new Class379();
												is_684_ = aClass379_9317.aShortArray3928 = (Class214.method3900(aShortArray9311, -2104621668));
												is_685_ = aClass379_9317.aShortArray3929 = (Class214.method3900(aShortArray9305, -1996864835));
												is_686_ = aClass379_9317.aShortArray3930 = (Class214.method3900(aShortArray9313, -1926651522));
												is_687_ = aClass379_9317.aByteArray3931 = (Class332.method5837(aByteArray9314, 807224660));
											}
											if (is_688_ == null) {
												Class379 class379 = (class176_sub3_676_.aClass379_9317 = new Class379());
												is_688_ = class379.aShortArray3928 = (Class214.method3900(is_680_, -2022449797));
												is_689_ = class379.aShortArray3929 = (Class214.method3900(is_681_, -2098498010));
												is_690_ = class379.aShortArray3930 = (Class214.method3900(is_682_, -1767168393));
												is_691_ = class379.aByteArray3931 = (Class332.method5837(is_683_, 2142790569));
											}
											short i_711_ = aShortArray9311[i_704_];
											short i_712_ = aShortArray9305[i_704_];
											short i_713_ = aShortArray9313[i_704_];
											byte i_714_ = aByteArray9314[i_704_];
											i_705_ = is_692_[i_708_];
											i_706_ = is_692_[i_708_ + 1];
											for (int i_715_ = i_705_; i_715_ < i_706_; i_715_++) {
												int i_716_ = is_693_[i_715_] - 1;
												if (i_716_ == -1)
													break;
												if (is_691_[i_716_] != 0) {
													is_688_[i_716_] += i_711_;
													is_689_[i_716_] += i_712_;
													is_690_[i_716_] += i_713_;
													is_691_[i_716_] += i_714_;
												}
											}
											i_711_ = is_680_[i_709_];
											i_712_ = is_681_[i_709_];
											i_713_ = is_682_[i_709_];
											i_714_ = is_683_[i_709_];
											i_705_ = anIntArray9351[i_700_];
											i_706_ = anIntArray9351[i_700_ + 1];
											for (int i_717_ = i_705_; (i_717_ < i_706_ && (aShortArray9366[i_717_] != 0)); i_717_++) {
												int i_718_ = ((aShortArray9366[i_717_] & 0xffff) - 1);
												if (is_687_[i_718_] != 0) {
													is_684_[i_718_] += i_711_;
													is_685_[i_718_] += i_712_;
													is_686_[i_718_] += i_713_;
													is_687_[i_718_] += i_714_;
												}
											}
											class176_sub3_676_.method14752();
											method14752();
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

	public void method3036(Class176 class176, int i, int i_719_, int i_720_, boolean bool) {
		Class176_Sub3 class176_sub3_721_ = (Class176_Sub3) class176;
		if (anInt9369 != 0 && class176_sub3_721_.anInt9369 != 0) {
			int i_722_ = class176_sub3_721_.anInt9302;
			int[] is = class176_sub3_721_.anIntArray9352;
			int[] is_723_ = class176_sub3_721_.anIntArray9360;
			int[] is_724_ = class176_sub3_721_.anIntArray9362;
			short[] is_725_ = class176_sub3_721_.aShortArray9311;
			short[] is_726_ = class176_sub3_721_.aShortArray9305;
			short[] is_727_ = class176_sub3_721_.aShortArray9313;
			byte[] is_728_ = class176_sub3_721_.aByteArray9314;
			short[] is_729_;
			short[] is_730_;
			short[] is_731_;
			byte[] is_732_;
			if (aClass379_9317 != null) {
				is_729_ = aClass379_9317.aShortArray3928;
				is_730_ = aClass379_9317.aShortArray3929;
				is_731_ = aClass379_9317.aShortArray3930;
				is_732_ = aClass379_9317.aByteArray3931;
			} else {
				is_729_ = null;
				is_730_ = null;
				is_731_ = null;
				is_732_ = null;
			}
			short[] is_733_;
			short[] is_734_;
			short[] is_735_;
			byte[] is_736_;
			if (class176_sub3_721_.aClass379_9317 != null) {
				is_733_ = class176_sub3_721_.aClass379_9317.aShortArray3928;
				is_734_ = class176_sub3_721_.aClass379_9317.aShortArray3929;
				is_735_ = class176_sub3_721_.aClass379_9317.aShortArray3930;
				is_736_ = class176_sub3_721_.aClass379_9317.aByteArray3931;
			} else {
				is_733_ = null;
				is_734_ = null;
				is_735_ = null;
				is_736_ = null;
			}
			int[] is_737_ = class176_sub3_721_.anIntArray9351;
			short[] is_738_ = class176_sub3_721_.aShortArray9366;
			if (!class176_sub3_721_.aBool9304)
				class176_sub3_721_.method14754();
			int i_739_ = class176_sub3_721_.anInt9340;
			int i_740_ = class176_sub3_721_.anInt9318;
			int i_741_ = class176_sub3_721_.anInt9342;
			int i_742_ = class176_sub3_721_.anInt9343;
			int i_743_ = class176_sub3_721_.anInt9344;
			int i_744_ = class176_sub3_721_.anInt9345;
			for (int i_745_ = 0; i_745_ < anInt9302; i_745_++) {
				int i_746_ = anIntArray9360[i_745_] - i_719_;
				if (i_746_ >= i_739_ && i_746_ <= i_740_) {
					int i_747_ = anIntArray9352[i_745_] - i;
					if (i_747_ >= i_741_ && i_747_ <= i_742_) {
						int i_748_ = anIntArray9362[i_745_] - i_720_;
						if (i_748_ >= i_743_ && i_748_ <= i_744_) {
							int i_749_ = -1;
							int i_750_ = anIntArray9351[i_745_];
							int i_751_ = anIntArray9351[i_745_ + 1];
							for (int i_752_ = i_750_; (i_752_ < i_751_ && aShortArray9366[i_752_] != 0); i_752_++) {
								i_749_ = (aShortArray9366[i_752_] & 0xffff) - 1;
								if (aByteArray9314[i_749_] != 0)
									break;
							}
							if (i_749_ != -1) {
								for (int i_753_ = 0; i_753_ < i_722_; i_753_++) {
									if (i_747_ == is[i_753_] && i_748_ == is_724_[i_753_] && i_746_ == is_723_[i_753_]) {
										int i_754_ = -1;
										i_750_ = is_737_[i_753_];
										i_751_ = is_737_[i_753_ + 1];
										for (int i_755_ = i_750_; (i_755_ < i_751_ && is_738_[i_755_] != 0); i_755_++) {
											i_754_ = is_738_[i_755_] - 1 & 0xffff;
											if (is_728_[i_754_] != 0)
												break;
										}
										if (i_754_ != -1) {
											if (is_729_ == null) {
												aClass379_9317 = new Class379();
												is_729_ = aClass379_9317.aShortArray3928 = (Class214.method3900(aShortArray9311, -2021538738));
												is_730_ = aClass379_9317.aShortArray3929 = (Class214.method3900(aShortArray9305, -2056466755));
												is_731_ = aClass379_9317.aShortArray3930 = (Class214.method3900(aShortArray9313, -1990650131));
												is_732_ = aClass379_9317.aByteArray3931 = (Class332.method5837(aByteArray9314, 1116264267));
											}
											if (is_733_ == null) {
												Class379 class379 = (class176_sub3_721_.aClass379_9317 = new Class379());
												is_733_ = class379.aShortArray3928 = (Class214.method3900(is_725_, -1854045552));
												is_734_ = class379.aShortArray3929 = (Class214.method3900(is_726_, -1760665648));
												is_735_ = class379.aShortArray3930 = (Class214.method3900(is_727_, -1950750938));
												is_736_ = class379.aByteArray3931 = (Class332.method5837(is_728_, 1432794358));
											}
											short i_756_ = aShortArray9311[i_749_];
											short i_757_ = aShortArray9305[i_749_];
											short i_758_ = aShortArray9313[i_749_];
											byte i_759_ = aByteArray9314[i_749_];
											i_750_ = is_737_[i_753_];
											i_751_ = is_737_[i_753_ + 1];
											for (int i_760_ = i_750_; i_760_ < i_751_; i_760_++) {
												int i_761_ = is_738_[i_760_] - 1;
												if (i_761_ == -1)
													break;
												if (is_736_[i_761_] != 0) {
													is_733_[i_761_] += i_756_;
													is_734_[i_761_] += i_757_;
													is_735_[i_761_] += i_758_;
													is_736_[i_761_] += i_759_;
												}
											}
											i_756_ = is_725_[i_754_];
											i_757_ = is_726_[i_754_];
											i_758_ = is_727_[i_754_];
											i_759_ = is_728_[i_754_];
											i_750_ = anIntArray9351[i_745_];
											i_751_ = anIntArray9351[i_745_ + 1];
											for (int i_762_ = i_750_; (i_762_ < i_751_ && (aShortArray9366[i_762_] != 0)); i_762_++) {
												int i_763_ = ((aShortArray9366[i_762_] & 0xffff) - 1);
												if (is_732_[i_763_] != 0) {
													is_729_[i_763_] += i_756_;
													is_730_[i_763_] += i_757_;
													is_731_[i_763_] += i_758_;
													is_732_[i_763_] += i_759_;
												}
											}
											class176_sub3_721_.method14752();
											method14752();
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

	public int method2970() {
		if (!aBool9304)
			method14754();
		return anInt9331;
	}

	public Class176 method2921(byte i, int i_764_, boolean bool) {
		boolean bool_765_ = false;
		Class176_Sub3 class176_sub3_766_;
		Class176_Sub3 class176_sub3_767_;
		if (i > 0 && i <= 8) {
			class176_sub3_767_ = aClass180_Sub2_9296.aClass176_Sub3Array9600[i - 1];
			class176_sub3_766_ = aClass180_Sub2_9296.aClass176_Sub3Array9599[i - 1];
			bool_765_ = true;
		} else
			class176_sub3_766_ = class176_sub3_767_ = new Class176_Sub3(aClass180_Sub2_9296, 0, 0, true, false);
		return method14810(class176_sub3_766_, class176_sub3_767_, i_764_, bool_765_, bool);
	}

	public void method2941(int i) {
		if (aClass363_9299 != null)
			aClass363_9299.aBool3854 = Class337.method5960(i, anInt9298);
		if (aClass363_9332 != null)
			aClass363_9332.aBool3854 = Class337.method5924(i, anInt9298);
		if (aClass363_9334 != null)
			aClass363_9334.aBool3854 = Class337.method5923(i, anInt9298);
		if (aClass363_9368 != null)
			aClass363_9368.aBool3854 = Class337.method5975(i, anInt9298);
		anInt9297 = i;
		if (aClass379_9317 != null && (anInt9297 & 0x10000) == 0) {
			aShortArray9311 = aClass379_9317.aShortArray3928;
			aShortArray9305 = aClass379_9317.aShortArray3929;
			aShortArray9313 = aClass379_9317.aShortArray3930;
			aByteArray9314 = aClass379_9317.aByteArray3931;
			aClass379_9317 = null;
		}
		aBool9320 = true;
		method14750();
	}

	public Class176 method3043(byte i, int i_768_, boolean bool) {
		boolean bool_769_ = false;
		Class176_Sub3 class176_sub3_770_;
		Class176_Sub3 class176_sub3_771_;
		if (i > 0 && i <= 8) {
			class176_sub3_771_ = aClass180_Sub2_9296.aClass176_Sub3Array9600[i - 1];
			class176_sub3_770_ = aClass180_Sub2_9296.aClass176_Sub3Array9599[i - 1];
			bool_769_ = true;
		} else
			class176_sub3_770_ = class176_sub3_771_ = new Class176_Sub3(aClass180_Sub2_9296, 0, 0, true, false);
		return method14810(class176_sub3_770_, class176_sub3_771_, i_768_, bool_769_, bool);
	}

	public Class176 method2924(byte i, int i_772_, boolean bool) {
		boolean bool_773_ = false;
		Class176_Sub3 class176_sub3_774_;
		Class176_Sub3 class176_sub3_775_;
		if (i > 0 && i <= 8) {
			class176_sub3_775_ = aClass180_Sub2_9296.aClass176_Sub3Array9600[i - 1];
			class176_sub3_774_ = aClass180_Sub2_9296.aClass176_Sub3Array9599[i - 1];
			bool_773_ = true;
		} else
			class176_sub3_774_ = class176_sub3_775_ = new Class176_Sub3(aClass180_Sub2_9296, 0, 0, true, false);
		return method14810(class176_sub3_774_, class176_sub3_775_, i_772_, bool_773_, bool);
	}

	void method14767() {
		if (aClass344_9361 != null)
			aClass344_9361.aBool3695 = false;
	}

	public void method2926(int i) {
		if (aClass363_9299 != null)
			aClass363_9299.aBool3854 = Class337.method5960(i, anInt9298);
		if (aClass363_9332 != null)
			aClass363_9332.aBool3854 = Class337.method5924(i, anInt9298);
		if (aClass363_9334 != null)
			aClass363_9334.aBool3854 = Class337.method5923(i, anInt9298);
		if (aClass363_9368 != null)
			aClass363_9368.aBool3854 = Class337.method5975(i, anInt9298);
		anInt9297 = i;
		if (aClass379_9317 != null && (anInt9297 & 0x10000) == 0) {
			aShortArray9311 = aClass379_9317.aShortArray3928;
			aShortArray9305 = aClass379_9317.aShortArray3929;
			aShortArray9313 = aClass379_9317.aShortArray3930;
			aByteArray9314 = aClass379_9317.aByteArray3931;
			aClass379_9317 = null;
		}
		aBool9320 = true;
		method14750();
	}

	boolean method14768() {
		boolean bool = !aClass363_9334.aBool3855;
		boolean bool_776_ = (anInt9298 & 0x37) != 0 && !aClass363_9368.aBool3855;
		boolean bool_777_ = !aClass363_9299.aBool3855;
		boolean bool_778_ = !aClass363_9332.aBool3855;
		if (!bool_777_ && !bool && !bool_776_ && !bool_778_)
			return true;
		boolean bool_779_ = true;
		if (bool_777_ && aShortArray9333 != null) {
			if (aClass363_9299.anInterface37_3857 == null)
				aClass363_9299.anInterface37_3857 = aClass180_Sub2_9296.method15035(aBool9341);
			Interface37 interface37 = aClass363_9299.anInterface37_3857;
			interface37.method219(anInt9308 * 12, 12);
			Unsafe unsafe = aClass180_Sub2_9296.anUnsafe9437;
			if (unsafe != null) {
				int i = anInt9308 * 12;
				long l = interface37.method209(0, i);
				for (int i_780_ = 0; i_780_ < anInt9308; i_780_++) {
					short i_781_ = aShortArray9333[i_780_];
					unsafe.putFloat(l, (float) anIntArray9352[i_781_]);
					l += 4L;
					unsafe.putFloat(l, (float) anIntArray9360[i_781_]);
					l += 4L;
					unsafe.putFloat(l, (float) anIntArray9362[i_781_]);
					l += 4L;
				}
				interface37.method211();
			} else {
				ByteBuffer bytebuffer = aClass180_Sub2_9296.aByteBuffer9438;
				bytebuffer.clear();
				for (int i = 0; i < anInt9308; i++) {
					bytebuffer.putFloat((float) anIntArray9352[aShortArray9333[i]]);
					bytebuffer.putFloat((float) anIntArray9360[aShortArray9333[i]]);
					bytebuffer.putFloat((float) anIntArray9362[aShortArray9333[i]]);
				}
				interface37.method213(0, bytebuffer.position(), aClass180_Sub2_9296.aLong9439);
			}
			aClass363_9299.anInterface37_3856 = interface37;
			aClass363_9299.aBool3855 = true;
		}
		if (bool) {
			if (aClass363_9334.anInterface37_3857 == null)
				aClass363_9334.anInterface37_3857 = aClass180_Sub2_9296.method15035(aBool9341);
			Interface37 interface37 = aClass363_9334.anInterface37_3857;
			interface37.method219(anInt9308 * 4, 4);
			Unsafe unsafe = aClass180_Sub2_9296.anUnsafe9437;
			if (unsafe != null) {
				int i = anInt9308 * 4;
				long l = interface37.method209(0, i);
				if ((anInt9298 & 0x37) == 0) {
					short[] is;
					short[] is_782_;
					short[] is_783_;
					byte[] is_784_;
					if (aClass379_9317 != null) {
						is = aClass379_9317.aShortArray3928;
						is_782_ = aClass379_9317.aShortArray3929;
						is_783_ = aClass379_9317.aShortArray3930;
						is_784_ = aClass379_9317.aByteArray3931;
					} else {
						is = aShortArray9311;
						is_782_ = aShortArray9305;
						is_783_ = aShortArray9313;
						is_784_ = aByteArray9314;
					}
					float f = (aClass180_Sub2_9296.aFloat9516 * 768.0F / (float) aShort9300);
					float f_785_ = (aClass180_Sub2_9296.aFloat9548 * 768.0F / (float) aShort9300);
					for (int i_786_ = 0; i_786_ < anInt9308; i_786_++) {
						short i_787_ = aShortArray9358[i_786_];
						int i_788_ = method14766(aShortArray9326[i_787_] & 0xffff, aShortArray9325[i_787_], aShort9339);
						float f_789_ = ((float) (i_788_ >> 16 & 0xff) * aClass180_Sub2_9296.aFloat9583);
						float f_790_ = ((float) (i_788_ >> 8 & 0xff) * aClass180_Sub2_9296.aFloat9513);
						float f_791_ = ((float) (i_788_ & 0xff) * aClass180_Sub2_9296.aFloat9448);
						byte i_792_ = is_784_[i_786_];
						float f_793_;
						if (i_792_ == 0)
							f_793_ = (((aClass180_Sub2_9296.aFloatArray9507[0] * (float) is[i_786_]) + (aClass180_Sub2_9296.aFloatArray9507[1] * (float) is_782_[i_786_]) + (aClass180_Sub2_9296.aFloatArray9507[2] * (float) is_783_[i_786_])) * 0.0026041667F);
						else
							f_793_ = (((aClass180_Sub2_9296.aFloatArray9507[0] * (float) is[i_786_]) + (aClass180_Sub2_9296.aFloatArray9507[1] * (float) is_782_[i_786_]) + (aClass180_Sub2_9296.aFloatArray9507[2] * (float) is_783_[i_786_])) / ((float) i_792_ * 256.0F));
						float f_794_ = (aClass180_Sub2_9296.aFloat9551 + f_793_ * (f_793_ < 0.0F ? f_785_ : f));
						int i_795_ = (int) (f_789_ * f_794_);
						if (i_795_ < 0)
							i_795_ = 0;
						else if (i_795_ > 255)
							i_795_ = 255;
						int i_796_ = (int) (f_790_ * f_794_);
						if (i_796_ < 0)
							i_796_ = 0;
						else if (i_796_ > 255)
							i_796_ = 255;
						int i_797_ = (int) (f_791_ * f_794_);
						if (i_797_ < 0)
							i_797_ = 0;
						else if (i_797_ > 255)
							i_797_ = 255;
						unsafe.putInt(l, (255 - aByteArray9321[i_787_] << 24 | i_795_ << 16 | i_796_ << 8 | i_797_));
						l += 4L;
					}
				} else {
					for (int i_798_ = 0; i_798_ < anInt9308; i_798_++) {
						short i_799_ = aShortArray9358[i_798_];
						int i_800_ = (255 - aByteArray9321[i_799_] << 24 | method14766(aShortArray9326[i_799_] & 0xffff, aShortArray9325[i_799_], aShort9339));
						unsafe.putInt(l, i_800_);
						l += 4L;
					}
				}
				interface37.method211();
			} else {
				ByteBuffer bytebuffer = aClass180_Sub2_9296.aByteBuffer9438;
				bytebuffer.clear();
				if ((anInt9298 & 0x37) == 0) {
					short[] is;
					short[] is_801_;
					short[] is_802_;
					byte[] is_803_;
					if (aClass379_9317 != null) {
						is = aClass379_9317.aShortArray3928;
						is_801_ = aClass379_9317.aShortArray3929;
						is_802_ = aClass379_9317.aShortArray3930;
						is_803_ = aClass379_9317.aByteArray3931;
					} else {
						is = aShortArray9311;
						is_801_ = aShortArray9305;
						is_802_ = aShortArray9313;
						is_803_ = aByteArray9314;
					}
					float f = (aClass180_Sub2_9296.aFloat9516 * 768.0F / (float) aShort9300);
					float f_804_ = (aClass180_Sub2_9296.aFloat9548 * 768.0F / (float) aShort9300);
					for (int i = 0; i < anInt9308; i++) {
						short i_805_ = aShortArray9358[i];
						int i_806_ = method14766(aShortArray9326[i_805_] & 0xffff, aShortArray9325[i_805_], aShort9339);
						float f_807_ = ((float) (i_806_ >> 16 & 0xff) * aClass180_Sub2_9296.aFloat9583);
						float f_808_ = ((float) (i_806_ >> 8 & 0xff) * aClass180_Sub2_9296.aFloat9513);
						float f_809_ = ((float) (i_806_ & 0xff) * aClass180_Sub2_9296.aFloat9448);
						byte i_810_ = is_803_[i];
						float f_811_;
						if (i_810_ == 0)
							f_811_ = ((aClass180_Sub2_9296.aFloatArray9507[0] * (float) is[i]) + (aClass180_Sub2_9296.aFloatArray9507[1] * (float) is_801_[i]) + (aClass180_Sub2_9296.aFloatArray9507[2] * (float) is_802_[i])) * 0.0026041667F;
						else
							f_811_ = (((aClass180_Sub2_9296.aFloatArray9507[0] * (float) is[i]) + (aClass180_Sub2_9296.aFloatArray9507[1] * (float) is_801_[i]) + (aClass180_Sub2_9296.aFloatArray9507[2] * (float) is_802_[i])) / ((float) i_810_ * 256.0F));
						float f_812_ = (aClass180_Sub2_9296.aFloat9551 + f_811_ * (f_811_ < 0.0F ? f_804_ : f));
						int i_813_ = (int) (f_807_ * f_812_);
						if (i_813_ < 0)
							i_813_ = 0;
						else if (i_813_ > 255)
							i_813_ = 255;
						int i_814_ = (int) (f_808_ * f_812_);
						if (i_814_ < 0)
							i_814_ = 0;
						else if (i_814_ > 255)
							i_814_ = 255;
						int i_815_ = (int) (f_809_ * f_812_);
						if (i_815_ < 0)
							i_815_ = 0;
						else if (i_815_ > 255)
							i_815_ = 255;
						bytebuffer.putInt(255 - aByteArray9321[i_805_] << 24 | i_813_ << 16 | i_814_ << 8 | i_815_);
					}
				} else {
					for (int i = 0; i < anInt9308; i++) {
						short i_816_ = aShortArray9358[i];
						int i_817_ = (255 - aByteArray9321[i_816_] << 24 | method14766(aShortArray9326[i_816_] & 0xffff, aShortArray9325[i_816_], aShort9339));
						bytebuffer.putInt(i_817_);
					}
				}
				interface37.method213(0, bytebuffer.position(), aClass180_Sub2_9296.aLong9439);
			}
			aClass363_9334.anInterface37_3856 = interface37;
			aClass363_9334.aBool3855 = true;
		}
		if (bool_776_) {
			if (aClass363_9368.anInterface37_3857 == null)
				aClass363_9368.anInterface37_3857 = aClass180_Sub2_9296.method15035(aBool9341);
			Interface37 interface37 = aClass363_9368.anInterface37_3857;
			interface37.method219(anInt9308 * 12, 12);
			short[] is;
			short[] is_818_;
			short[] is_819_;
			byte[] is_820_;
			if (aClass379_9317 != null) {
				is = aClass379_9317.aShortArray3928;
				is_818_ = aClass379_9317.aShortArray3929;
				is_819_ = aClass379_9317.aShortArray3930;
				is_820_ = aClass379_9317.aByteArray3931;
			} else {
				is = aShortArray9311;
				is_818_ = aShortArray9305;
				is_819_ = aShortArray9313;
				is_820_ = aByteArray9314;
			}
			Unsafe unsafe = aClass180_Sub2_9296.anUnsafe9437;
			if (unsafe != null) {
				int i = anInt9308 * 12;
				long l = interface37.method209(0, i);
				for (int i_821_ = 0; i_821_ < anInt9308; i_821_++) {
					Class442 class442 = new Class442((float) is[i_821_], (float) is_818_[i_821_], (float) is_819_[i_821_]);
					if (class442.method7160() != 0.0F) {
						if (is_820_[i_821_] > 1)
							class442.method7167((float) is_820_[i_821_]);
						class442.method7173();
					}
					unsafe.putFloat(l, class442.aFloat4918);
					l += 4L;
					unsafe.putFloat(l, class442.aFloat4915);
					l += 4L;
					unsafe.putFloat(l, class442.aFloat4919);
					l += 4L;
				}
				interface37.method211();
			} else {
				ByteBuffer bytebuffer = aClass180_Sub2_9296.aByteBuffer9438;
				bytebuffer.clear();
				for (int i = 0; i < anInt9308; i++) {
					Class442 class442 = new Class442((float) is[i], (float) is_818_[i], (float) is_819_[i]);
					if (class442.method7160() != 0.0F) {
						if (is_820_[i] > 1)
							class442.method7167((float) is_820_[i]);
						class442.method7173();
					}
					bytebuffer.putFloat(class442.aFloat4918);
					bytebuffer.putFloat(class442.aFloat4915);
					bytebuffer.putFloat(class442.aFloat4919);
				}
				interface37.method213(0, bytebuffer.position(), aClass180_Sub2_9296.aLong9439);
			}
			aClass363_9368.anInterface37_3856 = interface37;
			aClass363_9368.aBool3855 = true;
		}
		if (bool_778_) {
			if (aClass363_9332.anInterface37_3857 == null)
				aClass363_9332.anInterface37_3857 = aClass180_Sub2_9296.method15035(aBool9341);
			Interface37 interface37 = aClass363_9332.anInterface37_3857;
			interface37.method219(anInt9308 * 8, 8);
			Unsafe unsafe = aClass180_Sub2_9296.anUnsafe9437;
			if (unsafe != null) {
				int i = anInt9308 * 8;
				long l = interface37.method209(0, i);
				for (int i_822_ = 0; i_822_ < anInt9308; i_822_++) {
					unsafe.putFloat(l, aFloatArray9315[i_822_]);
					l += 4L;
					unsafe.putFloat(l, aFloatArray9316[i_822_]);
					l += 4L;
				}
				interface37.method211();
			} else {
				ByteBuffer bytebuffer = aClass180_Sub2_9296.aByteBuffer9438;
				bytebuffer.clear();
				for (int i = 0; i < anInt9308; i++) {
					bytebuffer.putFloat(aFloatArray9315[i]);
					bytebuffer.putFloat(aFloatArray9316[i]);
				}
				interface37.method213(0, bytebuffer.position(), aClass180_Sub2_9296.aLong9439);
			}
			aClass363_9332.anInterface37_3856 = interface37;
			aClass363_9332.aBool3855 = true;
		}
		return bool_779_;
	}

	public void method2928() {
		if (anInt9308 > 0 && anInt9319 > 0) {
			method14768();
			method14772();
			method14750();
		}
	}

	public int method2919() {
		return aShort9300;
	}

	public void method2901() {
		if (!aBool9346) {
			if (!aBool9304)
				method14754();
			anInt9309 = anInt9340;
			aBool9346 = true;
		}
	}

	public void method2931(int i) {
		int i_823_ = Class428.anIntArray4825[i];
		int i_824_ = Class428.anIntArray4819[i];
		for (int i_825_ = 0; i_825_ < anInt9302; i_825_++) {
			int i_826_ = ((anIntArray9362[i_825_] * i_823_ + anIntArray9352[i_825_] * i_824_) >> 14);
			anIntArray9362[i_825_] = (anIntArray9362[i_825_] * i_824_ - anIntArray9352[i_825_] * i_823_) >> 14;
			anIntArray9352[i_825_] = i_826_;
		}
		for (int i_827_ = 0; i_827_ < anInt9308; i_827_++) {
			int i_828_ = ((aShortArray9313[i_827_] * i_823_ + aShortArray9311[i_827_] * i_824_) >> 14);
			aShortArray9313[i_827_] = (short) ((aShortArray9313[i_827_] * i_824_ - aShortArray9311[i_827_] * i_823_) >> 14);
			aShortArray9311[i_827_] = (short) i_828_;
		}
		method14759();
		method14752();
		aBool9304 = false;
	}

	public void method3002(int i) {
		int i_829_ = Class428.anIntArray4825[i];
		int i_830_ = Class428.anIntArray4819[i];
		for (int i_831_ = 0; i_831_ < anInt9302; i_831_++) {
			int i_832_ = ((anIntArray9362[i_831_] * i_829_ + anIntArray9352[i_831_] * i_830_) >> 14);
			anIntArray9362[i_831_] = (anIntArray9362[i_831_] * i_830_ - anIntArray9352[i_831_] * i_829_) >> 14;
			anIntArray9352[i_831_] = i_832_;
		}
		for (int i_833_ = 0; i_833_ < anInt9308; i_833_++) {
			int i_834_ = ((aShortArray9313[i_833_] * i_829_ + aShortArray9311[i_833_] * i_830_) >> 14);
			aShortArray9313[i_833_] = (short) ((aShortArray9313[i_833_] * i_830_ - aShortArray9311[i_833_] * i_829_) >> 14);
			aShortArray9311[i_833_] = (short) i_834_;
		}
		method14759();
		method14752();
		aBool9304 = false;
	}

	public void method2933(int i) {
		int i_835_ = Class428.anIntArray4825[i];
		int i_836_ = Class428.anIntArray4819[i];
		for (int i_837_ = 0; i_837_ < anInt9302; i_837_++) {
			int i_838_ = ((anIntArray9360[i_837_] * i_836_ - anIntArray9362[i_837_] * i_835_) >> 14);
			anIntArray9362[i_837_] = (anIntArray9360[i_837_] * i_835_ + anIntArray9362[i_837_] * i_836_) >> 14;
			anIntArray9360[i_837_] = i_838_;
		}
		method14759();
		aBool9304 = false;
	}

	public void method2990() {
		if (anInt9308 > 0 && anInt9319 > 0) {
			method14768();
			method14772();
			method14750();
		}
	}

	void method14769() {
		if (aClass344_9361 != null)
			aClass344_9361.aBool3695 = false;
	}

	public void method2876(int i) {
		int i_839_ = Class428.anIntArray4825[i];
		int i_840_ = Class428.anIntArray4819[i];
		for (int i_841_ = 0; i_841_ < anInt9302; i_841_++) {
			int i_842_ = ((anIntArray9360[i_841_] * i_839_ + anIntArray9352[i_841_] * i_840_) >> 14);
			anIntArray9360[i_841_] = (anIntArray9360[i_841_] * i_840_ - anIntArray9352[i_841_] * i_839_) >> 14;
			anIntArray9352[i_841_] = i_842_;
		}
		method14759();
		aBool9304 = false;
	}

	public void method3018(int i) {
		int i_843_ = Class428.anIntArray4825[i];
		int i_844_ = Class428.anIntArray4819[i];
		for (int i_845_ = 0; i_845_ < anInt9302; i_845_++) {
			int i_846_ = ((anIntArray9360[i_845_] * i_844_ - anIntArray9362[i_845_] * i_843_) >> 14);
			anIntArray9362[i_845_] = (anIntArray9360[i_845_] * i_843_ + anIntArray9362[i_845_] * i_844_) >> 14;
			anIntArray9360[i_845_] = i_846_;
		}
		method14759();
		aBool9304 = false;
	}

	public void method2938(int i) {
		int i_847_ = Class428.anIntArray4825[i];
		int i_848_ = Class428.anIntArray4819[i];
		for (int i_849_ = 0; i_849_ < anInt9302; i_849_++) {
			int i_850_ = ((anIntArray9360[i_849_] * i_847_ + anIntArray9352[i_849_] * i_848_) >> 14);
			anIntArray9360[i_849_] = (anIntArray9360[i_849_] * i_848_ - anIntArray9352[i_849_] * i_847_) >> 14;
			anIntArray9352[i_849_] = i_850_;
		}
		method14759();
		aBool9304 = false;
	}

	public void method2855(int i, int i_851_, int i_852_) {
		for (int i_853_ = 0; i_853_ < anInt9302; i_853_++) {
			if (i != 0)
				anIntArray9352[i_853_] += i;
			if (i_851_ != 0)
				anIntArray9360[i_853_] += i_851_;
			if (i_852_ != 0)
				anIntArray9362[i_853_] += i_852_;
		}
		method14759();
		aBool9304 = false;
	}

	public void method2911(int i) {
		int i_854_ = Class428.anIntArray4825[i];
		int i_855_ = Class428.anIntArray4819[i];
		for (int i_856_ = 0; i_856_ < anInt9302; i_856_++) {
			int i_857_ = ((anIntArray9362[i_856_] * i_854_ + anIntArray9352[i_856_] * i_855_) >> 14);
			anIntArray9362[i_856_] = (anIntArray9362[i_856_] * i_855_ - anIntArray9352[i_856_] * i_854_) >> 14;
			anIntArray9352[i_856_] = i_857_;
		}
		method14759();
		aBool9304 = false;
	}

	public void method3027(int i, int i_858_, Class161 class161, Class161 class161_859_, int i_860_, int i_861_, int i_862_) {
		if (!aBool9304)
			method14754();
		int i_863_ = i_860_ + anInt9342;
		int i_864_ = i_860_ + anInt9343;
		int i_865_ = i_862_ + anInt9344;
		int i_866_ = i_862_ + anInt9345;
		if (i != 1 && i != 2 && i != 3 && i != 5 || (i_863_ >= 0 && ((i_864_ + class161.anInt1752 * 1048375491 >> class161.anInt1753 * 1252000143) < class161.anInt1750 * 1210322533) && i_865_ >= 0 && ((i_866_ + class161.anInt1752 * 1048375491 >> class161.anInt1753 * 1252000143) < class161.anInt1751 * -533476177))) {
			if (i == 4 || i == 5) {
				if (class161_859_ == null || (i_863_ < 0 || ((i_864_ + class161_859_.anInt1752 * 1048375491 >> class161_859_.anInt1753 * 1252000143) >= class161_859_.anInt1750 * 1210322533) || i_865_ < 0 || ((i_866_ + class161_859_.anInt1752 * 1048375491 >> class161_859_.anInt1753 * 1252000143) >= class161_859_.anInt1751 * -533476177)))
					return;
			} else {
				i_863_ >>= class161.anInt1753 * 1252000143;
				i_864_ = (i_864_ + (class161.anInt1752 * 1048375491 - 1) >> class161.anInt1753 * 1252000143);
				i_865_ >>= class161.anInt1753 * 1252000143;
				i_866_ = (i_866_ + (class161.anInt1752 * 1048375491 - 1) >> class161.anInt1753 * 1252000143);
				if (class161.method2595(i_863_, i_865_, (byte) 56) == i_861_ && (class161.method2595(i_864_, i_865_, (byte) 126) == i_861_) && class161.method2595(i_863_, i_866_, (byte) 41) == i_861_ && (class161.method2595(i_864_, i_866_, (byte) 29) == i_861_))
					return;
			}
			if (i == 1) {
				for (int i_867_ = 0; i_867_ < anInt9302; i_867_++)
					anIntArray9360[i_867_] = (anIntArray9360[i_867_] + class161.method2619((anIntArray9352[i_867_] + i_860_), (anIntArray9362[i_867_] + i_862_), 1573606854) - i_861_);
			} else if (i == 2) {
				int i_868_ = anInt9340;
				if (i_868_ == 0)
					return;
				for (int i_869_ = 0; i_869_ < anInt9302; i_869_++) {
					int i_870_ = (anIntArray9360[i_869_] << 16) / i_868_;
					if (i_870_ < i_858_)
						anIntArray9360[i_869_] = (anIntArray9360[i_869_] + (class161.method2619((anIntArray9352[i_869_] + i_860_), (anIntArray9362[i_869_] + i_862_), 1604128038) - i_861_) * (i_858_ - i_870_) / i_858_);
				}
			} else if (i == 3) {
				int i_871_ = (i_858_ & 0xff) * 16;
				int i_872_ = (i_858_ >> 8 & 0xff) * 16;
				int i_873_ = (i_858_ >> 16 & 0xff) << 6;
				int i_874_ = (i_858_ >> 24 & 0xff) << 6;
				if (i_860_ - (i_871_ >> 1) < 0 || ((i_860_ + (i_871_ >> 1) + class161.anInt1752 * 1048375491) >= (class161.anInt1750 * 1210322533 << class161.anInt1753 * 1252000143)) || i_862_ - (i_872_ >> 1) < 0 || ((i_862_ + (i_872_ >> 1) + class161.anInt1752 * 1048375491) >= (class161.anInt1751 * -533476177 << class161.anInt1753 * 1252000143)))
					return;
				method2962(class161, i_860_, i_861_, i_862_, i_871_, i_872_, i_873_, i_874_);
			} else if (i == 4) {
				int i_875_ = anInt9318 - anInt9340;
				for (int i_876_ = 0; i_876_ < anInt9302; i_876_++)
					anIntArray9360[i_876_] = (anIntArray9360[i_876_] + (class161_859_.method2619((anIntArray9352[i_876_] + i_860_), (anIntArray9362[i_876_] + i_862_), 1549682574) - i_861_) + i_875_);
			} else if (i == 5) {
				int i_877_ = anInt9318 - anInt9340;
				for (int i_878_ = 0; i_878_ < anInt9302; i_878_++) {
					int i_879_ = anIntArray9352[i_878_] + i_860_;
					int i_880_ = anIntArray9362[i_878_] + i_862_;
					int i_881_ = class161.method2619(i_879_, i_880_, 1111724890);
					int i_882_ = class161_859_.method2619(i_879_, i_880_, -1481584144);
					int i_883_ = i_881_ - i_882_ - i_858_;
					anIntArray9360[i_878_] = ((anIntArray9360[i_878_] << 8) / i_877_ * i_883_ >> 8) - (i_861_ - i_881_);
				}
			}
			method14759();
			aBool9304 = false;
		}
	}

	public void method2912(int i, int i_884_, Class161 class161, Class161 class161_885_, int i_886_, int i_887_, int i_888_) {
		if (!aBool9304)
			method14754();
		int i_889_ = i_886_ + anInt9342;
		int i_890_ = i_886_ + anInt9343;
		int i_891_ = i_888_ + anInt9344;
		int i_892_ = i_888_ + anInt9345;
		if (i != 1 && i != 2 && i != 3 && i != 5 || (i_889_ >= 0 && ((i_890_ + class161.anInt1752 * 1048375491 >> class161.anInt1753 * 1252000143) < class161.anInt1750 * 1210322533) && i_891_ >= 0 && ((i_892_ + class161.anInt1752 * 1048375491 >> class161.anInt1753 * 1252000143) < class161.anInt1751 * -533476177))) {
			if (i == 4 || i == 5) {
				if (class161_885_ == null || (i_889_ < 0 || ((i_890_ + class161_885_.anInt1752 * 1048375491 >> class161_885_.anInt1753 * 1252000143) >= class161_885_.anInt1750 * 1210322533) || i_891_ < 0 || ((i_892_ + class161_885_.anInt1752 * 1048375491 >> class161_885_.anInt1753 * 1252000143) >= class161_885_.anInt1751 * -533476177)))
					return;
			} else {
				i_889_ >>= class161.anInt1753 * 1252000143;
				i_890_ = (i_890_ + (class161.anInt1752 * 1048375491 - 1) >> class161.anInt1753 * 1252000143);
				i_891_ >>= class161.anInt1753 * 1252000143;
				i_892_ = (i_892_ + (class161.anInt1752 * 1048375491 - 1) >> class161.anInt1753 * 1252000143);
				if (class161.method2595(i_889_, i_891_, (byte) 70) == i_887_ && class161.method2595(i_890_, i_891_, (byte) 85) == i_887_ && (class161.method2595(i_889_, i_892_, (byte) 127) == i_887_) && (class161.method2595(i_890_, i_892_, (byte) 36) == i_887_))
					return;
			}
			if (i == 1) {
				for (int i_893_ = 0; i_893_ < anInt9302; i_893_++)
					anIntArray9360[i_893_] = (anIntArray9360[i_893_] + class161.method2619((anIntArray9352[i_893_] + i_886_), (anIntArray9362[i_893_] + i_888_), 695872394) - i_887_);
			} else if (i == 2) {
				int i_894_ = anInt9340;
				if (i_894_ == 0)
					return;
				for (int i_895_ = 0; i_895_ < anInt9302; i_895_++) {
					int i_896_ = (anIntArray9360[i_895_] << 16) / i_894_;
					if (i_896_ < i_884_)
						anIntArray9360[i_895_] = (anIntArray9360[i_895_] + (class161.method2619((anIntArray9352[i_895_] + i_886_), (anIntArray9362[i_895_] + i_888_), -1293760853) - i_887_) * (i_884_ - i_896_) / i_884_);
				}
			} else if (i == 3) {
				int i_897_ = (i_884_ & 0xff) * 16;
				int i_898_ = (i_884_ >> 8 & 0xff) * 16;
				int i_899_ = (i_884_ >> 16 & 0xff) << 6;
				int i_900_ = (i_884_ >> 24 & 0xff) << 6;
				if (i_886_ - (i_897_ >> 1) < 0 || ((i_886_ + (i_897_ >> 1) + class161.anInt1752 * 1048375491) >= (class161.anInt1750 * 1210322533 << class161.anInt1753 * 1252000143)) || i_888_ - (i_898_ >> 1) < 0 || ((i_888_ + (i_898_ >> 1) + class161.anInt1752 * 1048375491) >= (class161.anInt1751 * -533476177 << class161.anInt1753 * 1252000143)))
					return;
				method2962(class161, i_886_, i_887_, i_888_, i_897_, i_898_, i_899_, i_900_);
			} else if (i == 4) {
				int i_901_ = anInt9318 - anInt9340;
				for (int i_902_ = 0; i_902_ < anInt9302; i_902_++)
					anIntArray9360[i_902_] = (anIntArray9360[i_902_] + (class161_885_.method2619((anIntArray9352[i_902_] + i_886_), (anIntArray9362[i_902_] + i_888_), -964327080) - i_887_) + i_901_);
			} else if (i == 5) {
				int i_903_ = anInt9318 - anInt9340;
				for (int i_904_ = 0; i_904_ < anInt9302; i_904_++) {
					int i_905_ = anIntArray9352[i_904_] + i_886_;
					int i_906_ = anIntArray9362[i_904_] + i_888_;
					int i_907_ = class161.method2619(i_905_, i_906_, -173771760);
					int i_908_ = class161_885_.method2619(i_905_, i_906_, -1646936012);
					int i_909_ = i_907_ - i_908_ - i_884_;
					anIntArray9360[i_904_] = ((anIntArray9360[i_904_] << 8) / i_903_ * i_909_ >> 8) - (i_887_ - i_907_);
				}
			}
			method14759();
			aBool9304 = false;
		}
	}

	public void method2943(int i, int i_910_, Class161 class161, Class161 class161_911_, int i_912_, int i_913_, int i_914_) {
		if (!aBool9304)
			method14754();
		int i_915_ = i_912_ + anInt9342;
		int i_916_ = i_912_ + anInt9343;
		int i_917_ = i_914_ + anInt9344;
		int i_918_ = i_914_ + anInt9345;
		if (i != 1 && i != 2 && i != 3 && i != 5 || (i_915_ >= 0 && ((i_916_ + class161.anInt1752 * 1048375491 >> class161.anInt1753 * 1252000143) < class161.anInt1750 * 1210322533) && i_917_ >= 0 && ((i_918_ + class161.anInt1752 * 1048375491 >> class161.anInt1753 * 1252000143) < class161.anInt1751 * -533476177))) {
			if (i == 4 || i == 5) {
				if (class161_911_ == null || (i_915_ < 0 || ((i_916_ + class161_911_.anInt1752 * 1048375491 >> class161_911_.anInt1753 * 1252000143) >= class161_911_.anInt1750 * 1210322533) || i_917_ < 0 || ((i_918_ + class161_911_.anInt1752 * 1048375491 >> class161_911_.anInt1753 * 1252000143) >= class161_911_.anInt1751 * -533476177)))
					return;
			} else {
				i_915_ >>= class161.anInt1753 * 1252000143;
				i_916_ = (i_916_ + (class161.anInt1752 * 1048375491 - 1) >> class161.anInt1753 * 1252000143);
				i_917_ >>= class161.anInt1753 * 1252000143;
				i_918_ = (i_918_ + (class161.anInt1752 * 1048375491 - 1) >> class161.anInt1753 * 1252000143);
				if (class161.method2595(i_915_, i_917_, (byte) 126) == i_913_ && (class161.method2595(i_916_, i_917_, (byte) 120) == i_913_) && class161.method2595(i_915_, i_918_, (byte) 31) == i_913_ && (class161.method2595(i_916_, i_918_, (byte) 31) == i_913_))
					return;
			}
			if (i == 1) {
				for (int i_919_ = 0; i_919_ < anInt9302; i_919_++)
					anIntArray9360[i_919_] = (anIntArray9360[i_919_] + class161.method2619((anIntArray9352[i_919_] + i_912_), (anIntArray9362[i_919_] + i_914_), -1722284869) - i_913_);
			} else if (i == 2) {
				int i_920_ = anInt9340;
				if (i_920_ == 0)
					return;
				for (int i_921_ = 0; i_921_ < anInt9302; i_921_++) {
					int i_922_ = (anIntArray9360[i_921_] << 16) / i_920_;
					if (i_922_ < i_910_)
						anIntArray9360[i_921_] = (anIntArray9360[i_921_] + (class161.method2619((anIntArray9352[i_921_] + i_912_), (anIntArray9362[i_921_] + i_914_), 922373107) - i_913_) * (i_910_ - i_922_) / i_910_);
				}
			} else if (i == 3) {
				int i_923_ = (i_910_ & 0xff) * 16;
				int i_924_ = (i_910_ >> 8 & 0xff) * 16;
				int i_925_ = (i_910_ >> 16 & 0xff) << 6;
				int i_926_ = (i_910_ >> 24 & 0xff) << 6;
				if (i_912_ - (i_923_ >> 1) < 0 || ((i_912_ + (i_923_ >> 1) + class161.anInt1752 * 1048375491) >= (class161.anInt1750 * 1210322533 << class161.anInt1753 * 1252000143)) || i_914_ - (i_924_ >> 1) < 0 || ((i_914_ + (i_924_ >> 1) + class161.anInt1752 * 1048375491) >= (class161.anInt1751 * -533476177 << class161.anInt1753 * 1252000143)))
					return;
				method2962(class161, i_912_, i_913_, i_914_, i_923_, i_924_, i_925_, i_926_);
			} else if (i == 4) {
				int i_927_ = anInt9318 - anInt9340;
				for (int i_928_ = 0; i_928_ < anInt9302; i_928_++)
					anIntArray9360[i_928_] = (anIntArray9360[i_928_] + (class161_911_.method2619((anIntArray9352[i_928_] + i_912_), (anIntArray9362[i_928_] + i_914_), -1950344532) - i_913_) + i_927_);
			} else if (i == 5) {
				int i_929_ = anInt9318 - anInt9340;
				for (int i_930_ = 0; i_930_ < anInt9302; i_930_++) {
					int i_931_ = anIntArray9352[i_930_] + i_912_;
					int i_932_ = anIntArray9362[i_930_] + i_914_;
					int i_933_ = class161.method2619(i_931_, i_932_, -612969623);
					int i_934_ = class161_911_.method2619(i_931_, i_932_, -1181235604);
					int i_935_ = i_933_ - i_934_ - i_910_;
					anIntArray9360[i_930_] = ((anIntArray9360[i_930_] << 8) / i_929_ * i_935_ >> 8) - (i_913_ - i_933_);
				}
			}
			method14759();
			aBool9304 = false;
		}
	}

	public void method2944(int i, int i_936_, Class161 class161, Class161 class161_937_, int i_938_, int i_939_, int i_940_) {
		if (!aBool9304)
			method14754();
		int i_941_ = i_938_ + anInt9342;
		int i_942_ = i_938_ + anInt9343;
		int i_943_ = i_940_ + anInt9344;
		int i_944_ = i_940_ + anInt9345;
		if (i != 1 && i != 2 && i != 3 && i != 5 || (i_941_ >= 0 && ((i_942_ + class161.anInt1752 * 1048375491 >> class161.anInt1753 * 1252000143) < class161.anInt1750 * 1210322533) && i_943_ >= 0 && ((i_944_ + class161.anInt1752 * 1048375491 >> class161.anInt1753 * 1252000143) < class161.anInt1751 * -533476177))) {
			if (i == 4 || i == 5) {
				if (class161_937_ == null || (i_941_ < 0 || ((i_942_ + class161_937_.anInt1752 * 1048375491 >> class161_937_.anInt1753 * 1252000143) >= class161_937_.anInt1750 * 1210322533) || i_943_ < 0 || ((i_944_ + class161_937_.anInt1752 * 1048375491 >> class161_937_.anInt1753 * 1252000143) >= class161_937_.anInt1751 * -533476177)))
					return;
			} else {
				i_941_ >>= class161.anInt1753 * 1252000143;
				i_942_ = (i_942_ + (class161.anInt1752 * 1048375491 - 1) >> class161.anInt1753 * 1252000143);
				i_943_ >>= class161.anInt1753 * 1252000143;
				i_944_ = (i_944_ + (class161.anInt1752 * 1048375491 - 1) >> class161.anInt1753 * 1252000143);
				if (class161.method2595(i_941_, i_943_, (byte) 28) == i_939_ && class161.method2595(i_942_, i_943_, (byte) 81) == i_939_ && class161.method2595(i_941_, i_944_, (byte) 13) == i_939_ && (class161.method2595(i_942_, i_944_, (byte) 104) == i_939_))
					return;
			}
			if (i == 1) {
				for (int i_945_ = 0; i_945_ < anInt9302; i_945_++)
					anIntArray9360[i_945_] = (anIntArray9360[i_945_] + class161.method2619((anIntArray9352[i_945_] + i_938_), (anIntArray9362[i_945_] + i_940_), 1001063277) - i_939_);
			} else if (i == 2) {
				int i_946_ = anInt9340;
				if (i_946_ == 0)
					return;
				for (int i_947_ = 0; i_947_ < anInt9302; i_947_++) {
					int i_948_ = (anIntArray9360[i_947_] << 16) / i_946_;
					if (i_948_ < i_936_)
						anIntArray9360[i_947_] = (anIntArray9360[i_947_] + (class161.method2619((anIntArray9352[i_947_] + i_938_), (anIntArray9362[i_947_] + i_940_), -32928140) - i_939_) * (i_936_ - i_948_) / i_936_);
				}
			} else if (i == 3) {
				int i_949_ = (i_936_ & 0xff) * 16;
				int i_950_ = (i_936_ >> 8 & 0xff) * 16;
				int i_951_ = (i_936_ >> 16 & 0xff) << 6;
				int i_952_ = (i_936_ >> 24 & 0xff) << 6;
				if (i_938_ - (i_949_ >> 1) < 0 || ((i_938_ + (i_949_ >> 1) + class161.anInt1752 * 1048375491) >= (class161.anInt1750 * 1210322533 << class161.anInt1753 * 1252000143)) || i_940_ - (i_950_ >> 1) < 0 || ((i_940_ + (i_950_ >> 1) + class161.anInt1752 * 1048375491) >= (class161.anInt1751 * -533476177 << class161.anInt1753 * 1252000143)))
					return;
				method2962(class161, i_938_, i_939_, i_940_, i_949_, i_950_, i_951_, i_952_);
			} else if (i == 4) {
				int i_953_ = anInt9318 - anInt9340;
				for (int i_954_ = 0; i_954_ < anInt9302; i_954_++)
					anIntArray9360[i_954_] = (anIntArray9360[i_954_] + (class161_937_.method2619((anIntArray9352[i_954_] + i_938_), (anIntArray9362[i_954_] + i_940_), -597084623) - i_939_) + i_953_);
			} else if (i == 5) {
				int i_955_ = anInt9318 - anInt9340;
				for (int i_956_ = 0; i_956_ < anInt9302; i_956_++) {
					int i_957_ = anIntArray9352[i_956_] + i_938_;
					int i_958_ = anIntArray9362[i_956_] + i_940_;
					int i_959_ = class161.method2619(i_957_, i_958_, 1488517033);
					int i_960_ = class161_937_.method2619(i_957_, i_958_, -2111372409);
					int i_961_ = i_959_ - i_960_ - i_936_;
					anIntArray9360[i_956_] = ((anIntArray9360[i_956_] << 8) / i_955_ * i_961_ >> 8) - (i_939_ - i_959_);
				}
			}
			method14759();
			aBool9304 = false;
		}
	}

	void method14770() {
		if (aClass363_9299 != null)
			aClass363_9299.method6329();
		if (aClass363_9332 != null)
			aClass363_9332.method6329();
		if (aClass363_9334 != null)
			aClass363_9334.method6329();
		if (aClass363_9368 != null)
			aClass363_9368.method6329();
		if (aClass344_9361 != null)
			aClass344_9361.method6087();
	}

	void method2946() {
		/* empty */
	}

	boolean method14771() {
		boolean bool = !aClass363_9334.aBool3855;
		boolean bool_962_ = (anInt9298 & 0x37) != 0 && !aClass363_9368.aBool3855;
		boolean bool_963_ = !aClass363_9299.aBool3855;
		boolean bool_964_ = !aClass363_9332.aBool3855;
		if (!bool_963_ && !bool && !bool_962_ && !bool_964_)
			return true;
		boolean bool_965_ = true;
		if (bool_963_ && aShortArray9333 != null) {
			if (aClass363_9299.anInterface37_3857 == null)
				aClass363_9299.anInterface37_3857 = aClass180_Sub2_9296.method15035(aBool9341);
			Interface37 interface37 = aClass363_9299.anInterface37_3857;
			interface37.method219(anInt9308 * 12, 12);
			Unsafe unsafe = aClass180_Sub2_9296.anUnsafe9437;
			if (unsafe != null) {
				int i = anInt9308 * 12;
				long l = interface37.method209(0, i);
				for (int i_966_ = 0; i_966_ < anInt9308; i_966_++) {
					short i_967_ = aShortArray9333[i_966_];
					unsafe.putFloat(l, (float) anIntArray9352[i_967_]);
					l += 4L;
					unsafe.putFloat(l, (float) anIntArray9360[i_967_]);
					l += 4L;
					unsafe.putFloat(l, (float) anIntArray9362[i_967_]);
					l += 4L;
				}
				interface37.method211();
			} else {
				ByteBuffer bytebuffer = aClass180_Sub2_9296.aByteBuffer9438;
				bytebuffer.clear();
				for (int i = 0; i < anInt9308; i++) {
					bytebuffer.putFloat((float) anIntArray9352[aShortArray9333[i]]);
					bytebuffer.putFloat((float) anIntArray9360[aShortArray9333[i]]);
					bytebuffer.putFloat((float) anIntArray9362[aShortArray9333[i]]);
				}
				interface37.method213(0, bytebuffer.position(), aClass180_Sub2_9296.aLong9439);
			}
			aClass363_9299.anInterface37_3856 = interface37;
			aClass363_9299.aBool3855 = true;
		}
		if (bool) {
			if (aClass363_9334.anInterface37_3857 == null)
				aClass363_9334.anInterface37_3857 = aClass180_Sub2_9296.method15035(aBool9341);
			Interface37 interface37 = aClass363_9334.anInterface37_3857;
			interface37.method219(anInt9308 * 4, 4);
			Unsafe unsafe = aClass180_Sub2_9296.anUnsafe9437;
			if (unsafe != null) {
				int i = anInt9308 * 4;
				long l = interface37.method209(0, i);
				if ((anInt9298 & 0x37) == 0) {
					short[] is;
					short[] is_968_;
					short[] is_969_;
					byte[] is_970_;
					if (aClass379_9317 != null) {
						is = aClass379_9317.aShortArray3928;
						is_968_ = aClass379_9317.aShortArray3929;
						is_969_ = aClass379_9317.aShortArray3930;
						is_970_ = aClass379_9317.aByteArray3931;
					} else {
						is = aShortArray9311;
						is_968_ = aShortArray9305;
						is_969_ = aShortArray9313;
						is_970_ = aByteArray9314;
					}
					float f = (aClass180_Sub2_9296.aFloat9516 * 768.0F / (float) aShort9300);
					float f_971_ = (aClass180_Sub2_9296.aFloat9548 * 768.0F / (float) aShort9300);
					for (int i_972_ = 0; i_972_ < anInt9308; i_972_++) {
						short i_973_ = aShortArray9358[i_972_];
						int i_974_ = method14766(aShortArray9326[i_973_] & 0xffff, aShortArray9325[i_973_], aShort9339);
						float f_975_ = ((float) (i_974_ >> 16 & 0xff) * aClass180_Sub2_9296.aFloat9583);
						float f_976_ = ((float) (i_974_ >> 8 & 0xff) * aClass180_Sub2_9296.aFloat9513);
						float f_977_ = ((float) (i_974_ & 0xff) * aClass180_Sub2_9296.aFloat9448);
						byte i_978_ = is_970_[i_972_];
						float f_979_;
						if (i_978_ == 0)
							f_979_ = (((aClass180_Sub2_9296.aFloatArray9507[0] * (float) is[i_972_]) + (aClass180_Sub2_9296.aFloatArray9507[1] * (float) is_968_[i_972_]) + (aClass180_Sub2_9296.aFloatArray9507[2] * (float) is_969_[i_972_])) * 0.0026041667F);
						else
							f_979_ = (((aClass180_Sub2_9296.aFloatArray9507[0] * (float) is[i_972_]) + (aClass180_Sub2_9296.aFloatArray9507[1] * (float) is_968_[i_972_]) + (aClass180_Sub2_9296.aFloatArray9507[2] * (float) is_969_[i_972_])) / ((float) i_978_ * 256.0F));
						float f_980_ = (aClass180_Sub2_9296.aFloat9551 + f_979_ * (f_979_ < 0.0F ? f_971_ : f));
						int i_981_ = (int) (f_975_ * f_980_);
						if (i_981_ < 0)
							i_981_ = 0;
						else if (i_981_ > 255)
							i_981_ = 255;
						int i_982_ = (int) (f_976_ * f_980_);
						if (i_982_ < 0)
							i_982_ = 0;
						else if (i_982_ > 255)
							i_982_ = 255;
						int i_983_ = (int) (f_977_ * f_980_);
						if (i_983_ < 0)
							i_983_ = 0;
						else if (i_983_ > 255)
							i_983_ = 255;
						unsafe.putInt(l, (255 - aByteArray9321[i_973_] << 24 | i_981_ << 16 | i_982_ << 8 | i_983_));
						l += 4L;
					}
				} else {
					for (int i_984_ = 0; i_984_ < anInt9308; i_984_++) {
						short i_985_ = aShortArray9358[i_984_];
						int i_986_ = (255 - aByteArray9321[i_985_] << 24 | method14766(aShortArray9326[i_985_] & 0xffff, aShortArray9325[i_985_], aShort9339));
						unsafe.putInt(l, i_986_);
						l += 4L;
					}
				}
				interface37.method211();
			} else {
				ByteBuffer bytebuffer = aClass180_Sub2_9296.aByteBuffer9438;
				bytebuffer.clear();
				if ((anInt9298 & 0x37) == 0) {
					short[] is;
					short[] is_987_;
					short[] is_988_;
					byte[] is_989_;
					if (aClass379_9317 != null) {
						is = aClass379_9317.aShortArray3928;
						is_987_ = aClass379_9317.aShortArray3929;
						is_988_ = aClass379_9317.aShortArray3930;
						is_989_ = aClass379_9317.aByteArray3931;
					} else {
						is = aShortArray9311;
						is_987_ = aShortArray9305;
						is_988_ = aShortArray9313;
						is_989_ = aByteArray9314;
					}
					float f = (aClass180_Sub2_9296.aFloat9516 * 768.0F / (float) aShort9300);
					float f_990_ = (aClass180_Sub2_9296.aFloat9548 * 768.0F / (float) aShort9300);
					for (int i = 0; i < anInt9308; i++) {
						short i_991_ = aShortArray9358[i];
						int i_992_ = method14766(aShortArray9326[i_991_] & 0xffff, aShortArray9325[i_991_], aShort9339);
						float f_993_ = ((float) (i_992_ >> 16 & 0xff) * aClass180_Sub2_9296.aFloat9583);
						float f_994_ = ((float) (i_992_ >> 8 & 0xff) * aClass180_Sub2_9296.aFloat9513);
						float f_995_ = ((float) (i_992_ & 0xff) * aClass180_Sub2_9296.aFloat9448);
						byte i_996_ = is_989_[i];
						float f_997_;
						if (i_996_ == 0)
							f_997_ = ((aClass180_Sub2_9296.aFloatArray9507[0] * (float) is[i]) + (aClass180_Sub2_9296.aFloatArray9507[1] * (float) is_987_[i]) + (aClass180_Sub2_9296.aFloatArray9507[2] * (float) is_988_[i])) * 0.0026041667F;
						else
							f_997_ = (((aClass180_Sub2_9296.aFloatArray9507[0] * (float) is[i]) + (aClass180_Sub2_9296.aFloatArray9507[1] * (float) is_987_[i]) + (aClass180_Sub2_9296.aFloatArray9507[2] * (float) is_988_[i])) / ((float) i_996_ * 256.0F));
						float f_998_ = (aClass180_Sub2_9296.aFloat9551 + f_997_ * (f_997_ < 0.0F ? f_990_ : f));
						int i_999_ = (int) (f_993_ * f_998_);
						if (i_999_ < 0)
							i_999_ = 0;
						else if (i_999_ > 255)
							i_999_ = 255;
						int i_1000_ = (int) (f_994_ * f_998_);
						if (i_1000_ < 0)
							i_1000_ = 0;
						else if (i_1000_ > 255)
							i_1000_ = 255;
						int i_1001_ = (int) (f_995_ * f_998_);
						if (i_1001_ < 0)
							i_1001_ = 0;
						else if (i_1001_ > 255)
							i_1001_ = 255;
						bytebuffer.putInt(255 - aByteArray9321[i_991_] << 24 | i_999_ << 16 | i_1000_ << 8 | i_1001_);
					}
				} else {
					for (int i = 0; i < anInt9308; i++) {
						short i_1002_ = aShortArray9358[i];
						int i_1003_ = (255 - aByteArray9321[i_1002_] << 24 | method14766(aShortArray9326[i_1002_] & 0xffff, aShortArray9325[i_1002_], aShort9339));
						bytebuffer.putInt(i_1003_);
					}
				}
				interface37.method213(0, bytebuffer.position(), aClass180_Sub2_9296.aLong9439);
			}
			aClass363_9334.anInterface37_3856 = interface37;
			aClass363_9334.aBool3855 = true;
		}
		if (bool_962_) {
			if (aClass363_9368.anInterface37_3857 == null)
				aClass363_9368.anInterface37_3857 = aClass180_Sub2_9296.method15035(aBool9341);
			Interface37 interface37 = aClass363_9368.anInterface37_3857;
			interface37.method219(anInt9308 * 12, 12);
			short[] is;
			short[] is_1004_;
			short[] is_1005_;
			byte[] is_1006_;
			if (aClass379_9317 != null) {
				is = aClass379_9317.aShortArray3928;
				is_1004_ = aClass379_9317.aShortArray3929;
				is_1005_ = aClass379_9317.aShortArray3930;
				is_1006_ = aClass379_9317.aByteArray3931;
			} else {
				is = aShortArray9311;
				is_1004_ = aShortArray9305;
				is_1005_ = aShortArray9313;
				is_1006_ = aByteArray9314;
			}
			Unsafe unsafe = aClass180_Sub2_9296.anUnsafe9437;
			if (unsafe != null) {
				int i = anInt9308 * 12;
				long l = interface37.method209(0, i);
				for (int i_1007_ = 0; i_1007_ < anInt9308; i_1007_++) {
					Class442 class442 = new Class442((float) is[i_1007_], (float) is_1004_[i_1007_], (float) is_1005_[i_1007_]);
					if (class442.method7160() != 0.0F) {
						if (is_1006_[i_1007_] > 1)
							class442.method7167((float) is_1006_[i_1007_]);
						class442.method7173();
					}
					unsafe.putFloat(l, class442.aFloat4918);
					l += 4L;
					unsafe.putFloat(l, class442.aFloat4915);
					l += 4L;
					unsafe.putFloat(l, class442.aFloat4919);
					l += 4L;
				}
				interface37.method211();
			} else {
				ByteBuffer bytebuffer = aClass180_Sub2_9296.aByteBuffer9438;
				bytebuffer.clear();
				for (int i = 0; i < anInt9308; i++) {
					Class442 class442 = new Class442((float) is[i], (float) is_1004_[i], (float) is_1005_[i]);
					if (class442.method7160() != 0.0F) {
						if (is_1006_[i] > 1)
							class442.method7167((float) is_1006_[i]);
						class442.method7173();
					}
					bytebuffer.putFloat(class442.aFloat4918);
					bytebuffer.putFloat(class442.aFloat4915);
					bytebuffer.putFloat(class442.aFloat4919);
				}
				interface37.method213(0, bytebuffer.position(), aClass180_Sub2_9296.aLong9439);
			}
			aClass363_9368.anInterface37_3856 = interface37;
			aClass363_9368.aBool3855 = true;
		}
		if (bool_964_) {
			if (aClass363_9332.anInterface37_3857 == null)
				aClass363_9332.anInterface37_3857 = aClass180_Sub2_9296.method15035(aBool9341);
			Interface37 interface37 = aClass363_9332.anInterface37_3857;
			interface37.method219(anInt9308 * 8, 8);
			Unsafe unsafe = aClass180_Sub2_9296.anUnsafe9437;
			if (unsafe != null) {
				int i = anInt9308 * 8;
				long l = interface37.method209(0, i);
				for (int i_1008_ = 0; i_1008_ < anInt9308; i_1008_++) {
					unsafe.putFloat(l, aFloatArray9315[i_1008_]);
					l += 4L;
					unsafe.putFloat(l, aFloatArray9316[i_1008_]);
					l += 4L;
				}
				interface37.method211();
			} else {
				ByteBuffer bytebuffer = aClass180_Sub2_9296.aByteBuffer9438;
				bytebuffer.clear();
				for (int i = 0; i < anInt9308; i++) {
					bytebuffer.putFloat(aFloatArray9315[i]);
					bytebuffer.putFloat(aFloatArray9316[i]);
				}
				interface37.method213(0, bytebuffer.position(), aClass180_Sub2_9296.aLong9439);
			}
			aClass363_9332.anInterface37_3856 = interface37;
			aClass363_9332.aBool3855 = true;
		}
		return bool_965_;
	}

	boolean method3042() {
		if (anIntArrayArray9306 == null)
			return false;
		for (int i = 0; i < anInt9301; i++) {
			anIntArray9352[i] <<= 4;
			anIntArray9360[i] <<= 4;
			anIntArray9362[i] <<= 4;
		}
		anInt9357 = 0;
		anInt9367 = 0;
		anInt9353 = 0;
		return true;
	}

	boolean method3021() {
		if (anIntArrayArray9306 == null)
			return false;
		for (int i = 0; i < anInt9301; i++) {
			anIntArray9352[i] <<= 4;
			anIntArray9360[i] <<= 4;
			anIntArray9362[i] <<= 4;
		}
		anInt9357 = 0;
		anInt9367 = 0;
		anInt9353 = 0;
		return true;
	}

	boolean method14772() {
		if (aClass344_9361.aBool3695)
			return true;
		if (aClass344_9361.anInterface44_3696 == null)
			aClass344_9361.anInterface44_3696 = aClass180_Sub2_9296.method15025(false);
		Interface44 interface44 = aClass344_9361.anInterface44_3696;
		interface44.method323(anInt9319 * 6);
		Unsafe unsafe = aClass180_Sub2_9296.anUnsafe9437;
		if (unsafe != null) {
			int i = anInt9319 * 6;
			long l = interface44.method209(0, i);
			if (l == 0L)
				return false;
			for (int i_1009_ = 0; i_1009_ < anInt9319; i_1009_++) {
				unsafe.putShort(l, aShortArray9322[i_1009_]);
				l += 2L;
				unsafe.putShort(l, aShortArray9323[i_1009_]);
				l += 2L;
				unsafe.putShort(l, aShortArray9324[i_1009_]);
				l += 2L;
			}
			interface44.method211();
			aClass344_9361.anInterface44_3693 = interface44;
			aClass344_9361.aBool3695 = true;
			aBool9320 = true;
			return true;
		}
		ByteBuffer bytebuffer = aClass180_Sub2_9296.aByteBuffer9438;
		bytebuffer.clear();
		for (int i = 0; i < anInt9319; i++) {
			bytebuffer.putShort(aShortArray9322[i]);
			bytebuffer.putShort(aShortArray9323[i]);
			bytebuffer.putShort(aShortArray9324[i]);
		}
		if (interface44.method213(0, bytebuffer.position(), aClass180_Sub2_9296.aLong9439)) {
			aClass344_9361.anInterface44_3693 = interface44;
			aClass344_9361.aBool3695 = true;
			aBool9320 = true;
			return true;
		}
		return false;
	}

	void method2950() {
		for (int i = 0; i < anInt9301; i++) {
			anIntArray9352[i] = anIntArray9352[i] + 7 >> 4;
			anIntArray9360[i] = anIntArray9360[i] + 7 >> 4;
			anIntArray9362[i] = anIntArray9362[i] + 7 >> 4;
		}
		method14759();
		aBool9304 = false;
	}

	void method2940() {
		for (int i = 0; i < anInt9301; i++) {
			anIntArray9352[i] = anIntArray9352[i] + 7 >> 4;
			anIntArray9360[i] = anIntArray9360[i] + 7 >> 4;
			anIntArray9362[i] = anIntArray9362[i] + 7 >> 4;
		}
		method14759();
		aBool9304 = false;
	}

	void method2952(int i, int[] is, int i_1010_, int i_1011_, int i_1012_, int i_1013_, boolean bool) {
		int i_1014_ = is.length;
		if (i == 0) {
			i_1010_ <<= 4;
			i_1011_ <<= 4;
			i_1012_ <<= 4;
			int i_1015_ = 0;
			anInt9357 = 0;
			anInt9367 = 0;
			anInt9353 = 0;
			for (int i_1016_ = 0; i_1016_ < i_1014_; i_1016_++) {
				int i_1017_ = is[i_1016_];
				if (i_1017_ < anIntArrayArray9306.length) {
					int[] is_1018_ = anIntArrayArray9306[i_1017_];
					for (int i_1019_ = 0; i_1019_ < is_1018_.length; i_1019_++) {
						int i_1020_ = is_1018_[i_1019_];
						anInt9357 += anIntArray9352[i_1020_];
						anInt9367 += anIntArray9360[i_1020_];
						anInt9353 += anIntArray9362[i_1020_];
						i_1015_++;
					}
				}
			}
			if (i_1015_ > 0) {
				anInt9357 = anInt9357 / i_1015_ + i_1010_;
				anInt9367 = anInt9367 / i_1015_ + i_1011_;
				anInt9353 = anInt9353 / i_1015_ + i_1012_;
			} else {
				anInt9357 = i_1010_;
				anInt9367 = i_1011_;
				anInt9353 = i_1012_;
			}
		} else if (i == 1) {
			i_1010_ <<= 4;
			i_1011_ <<= 4;
			i_1012_ <<= 4;
			for (int i_1021_ = 0; i_1021_ < i_1014_; i_1021_++) {
				int i_1022_ = is[i_1021_];
				if (i_1022_ < anIntArrayArray9306.length) {
					int[] is_1023_ = anIntArrayArray9306[i_1022_];
					for (int i_1024_ = 0; i_1024_ < is_1023_.length; i_1024_++) {
						int i_1025_ = is_1023_[i_1024_];
						anIntArray9352[i_1025_] += i_1010_;
						anIntArray9360[i_1025_] += i_1011_;
						anIntArray9362[i_1025_] += i_1012_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_1026_ = 0; i_1026_ < i_1014_; i_1026_++) {
				int i_1027_ = is[i_1026_];
				if (i_1027_ < anIntArrayArray9306.length) {
					int[] is_1028_ = anIntArrayArray9306[i_1027_];
					if ((i_1013_ & 0x1) == 0) {
						for (int i_1029_ = 0; i_1029_ < is_1028_.length; i_1029_++) {
							int i_1030_ = is_1028_[i_1029_];
							anIntArray9352[i_1030_] -= anInt9357;
							anIntArray9360[i_1030_] -= anInt9367;
							anIntArray9362[i_1030_] -= anInt9353;
							if (i_1012_ != 0) {
								int i_1031_ = Class428.anIntArray4825[i_1012_];
								int i_1032_ = Class428.anIntArray4819[i_1012_];
								int i_1033_ = ((anIntArray9360[i_1030_] * i_1031_ + anIntArray9352[i_1030_] * i_1032_ + 16383) >> 14);
								anIntArray9360[i_1030_] = (anIntArray9360[i_1030_] * i_1032_ - anIntArray9352[i_1030_] * i_1031_ + 16383) >> 14;
								anIntArray9352[i_1030_] = i_1033_;
							}
							if (i_1010_ != 0) {
								int i_1034_ = Class428.anIntArray4825[i_1010_];
								int i_1035_ = Class428.anIntArray4819[i_1010_];
								int i_1036_ = ((anIntArray9360[i_1030_] * i_1035_ - anIntArray9362[i_1030_] * i_1034_ + 16383) >> 14);
								anIntArray9362[i_1030_] = (anIntArray9360[i_1030_] * i_1034_ + anIntArray9362[i_1030_] * i_1035_ + 16383) >> 14;
								anIntArray9360[i_1030_] = i_1036_;
							}
							if (i_1011_ != 0) {
								int i_1037_ = Class428.anIntArray4825[i_1011_];
								int i_1038_ = Class428.anIntArray4819[i_1011_];
								int i_1039_ = ((anIntArray9362[i_1030_] * i_1037_ + anIntArray9352[i_1030_] * i_1038_ + 16383) >> 14);
								anIntArray9362[i_1030_] = (anIntArray9362[i_1030_] * i_1038_ - anIntArray9352[i_1030_] * i_1037_ + 16383) >> 14;
								anIntArray9352[i_1030_] = i_1039_;
							}
							anIntArray9352[i_1030_] += anInt9357;
							anIntArray9360[i_1030_] += anInt9367;
							anIntArray9362[i_1030_] += anInt9353;
						}
					} else {
						for (int i_1040_ = 0; i_1040_ < is_1028_.length; i_1040_++) {
							int i_1041_ = is_1028_[i_1040_];
							anIntArray9352[i_1041_] -= anInt9357;
							anIntArray9360[i_1041_] -= anInt9367;
							anIntArray9362[i_1041_] -= anInt9353;
							if (i_1010_ != 0) {
								int i_1042_ = Class428.anIntArray4825[i_1010_];
								int i_1043_ = Class428.anIntArray4819[i_1010_];
								int i_1044_ = ((anIntArray9360[i_1041_] * i_1043_ - anIntArray9362[i_1041_] * i_1042_ + 16383) >> 14);
								anIntArray9362[i_1041_] = (anIntArray9360[i_1041_] * i_1042_ + anIntArray9362[i_1041_] * i_1043_ + 16383) >> 14;
								anIntArray9360[i_1041_] = i_1044_;
							}
							if (i_1012_ != 0) {
								int i_1045_ = Class428.anIntArray4825[i_1012_];
								int i_1046_ = Class428.anIntArray4819[i_1012_];
								int i_1047_ = ((anIntArray9360[i_1041_] * i_1045_ + anIntArray9352[i_1041_] * i_1046_ + 16383) >> 14);
								anIntArray9360[i_1041_] = (anIntArray9360[i_1041_] * i_1046_ - anIntArray9352[i_1041_] * i_1045_ + 16383) >> 14;
								anIntArray9352[i_1041_] = i_1047_;
							}
							if (i_1011_ != 0) {
								int i_1048_ = Class428.anIntArray4825[i_1011_];
								int i_1049_ = Class428.anIntArray4819[i_1011_];
								int i_1050_ = ((anIntArray9362[i_1041_] * i_1048_ + anIntArray9352[i_1041_] * i_1049_ + 16383) >> 14);
								anIntArray9362[i_1041_] = (anIntArray9362[i_1041_] * i_1049_ - anIntArray9352[i_1041_] * i_1048_ + 16383) >> 14;
								anIntArray9352[i_1041_] = i_1050_;
							}
							anIntArray9352[i_1041_] += anInt9357;
							anIntArray9360[i_1041_] += anInt9367;
							anIntArray9362[i_1041_] += anInt9353;
						}
					}
				}
			}
			if (bool) {
				for (int i_1051_ = 0; i_1051_ < i_1014_; i_1051_++) {
					int i_1052_ = is[i_1051_];
					if (i_1052_ < anIntArrayArray9306.length) {
						int[] is_1053_ = anIntArrayArray9306[i_1052_];
						for (int i_1054_ = 0; i_1054_ < is_1053_.length; i_1054_++) {
							int i_1055_ = is_1053_[i_1054_];
							int i_1056_ = anIntArray9351[i_1055_];
							int i_1057_ = anIntArray9351[i_1055_ + 1];
							for (int i_1058_ = i_1056_; (i_1058_ < i_1057_ && aShortArray9366[i_1058_] != 0); i_1058_++) {
								int i_1059_ = (aShortArray9366[i_1058_] & 0xffff) - 1;
								if (i_1012_ != 0) {
									int i_1060_ = Class428.anIntArray4825[i_1012_];
									int i_1061_ = Class428.anIntArray4819[i_1012_];
									int i_1062_ = (aShortArray9305[i_1059_] * i_1060_ + aShortArray9311[i_1059_] * i_1061_ + 16383) >> 14;
									aShortArray9305[i_1059_] = (short) (((aShortArray9305[i_1059_] * i_1061_) - (aShortArray9311[i_1059_] * i_1060_) + 16383) >> 14);
									aShortArray9311[i_1059_] = (short) i_1062_;
								}
								if (i_1010_ != 0) {
									int i_1063_ = Class428.anIntArray4825[i_1010_];
									int i_1064_ = Class428.anIntArray4819[i_1010_];
									int i_1065_ = (aShortArray9305[i_1059_] * i_1064_ - aShortArray9313[i_1059_] * i_1063_ + 16383) >> 14;
									aShortArray9313[i_1059_] = (short) (((aShortArray9305[i_1059_] * i_1063_) + (aShortArray9313[i_1059_] * i_1064_) + 16383) >> 14);
									aShortArray9305[i_1059_] = (short) i_1065_;
								}
								if (i_1011_ != 0) {
									int i_1066_ = Class428.anIntArray4825[i_1011_];
									int i_1067_ = Class428.anIntArray4819[i_1011_];
									int i_1068_ = (aShortArray9313[i_1059_] * i_1066_ + aShortArray9311[i_1059_] * i_1067_ + 16383) >> 14;
									aShortArray9313[i_1059_] = (short) (((aShortArray9313[i_1059_] * i_1067_) - (aShortArray9311[i_1059_] * i_1066_) + 16383) >> 14);
									aShortArray9311[i_1059_] = (short) i_1068_;
								}
							}
						}
					}
				}
				method14752();
			}
		} else if (i == 3) {
			for (int i_1069_ = 0; i_1069_ < i_1014_; i_1069_++) {
				int i_1070_ = is[i_1069_];
				if (i_1070_ < anIntArrayArray9306.length) {
					int[] is_1071_ = anIntArrayArray9306[i_1070_];
					for (int i_1072_ = 0; i_1072_ < is_1071_.length; i_1072_++) {
						int i_1073_ = is_1071_[i_1072_];
						anIntArray9352[i_1073_] -= anInt9357;
						anIntArray9360[i_1073_] -= anInt9367;
						anIntArray9362[i_1073_] -= anInt9353;
						anIntArray9352[i_1073_] = anIntArray9352[i_1073_] * i_1010_ >> 7;
						anIntArray9360[i_1073_] = anIntArray9360[i_1073_] * i_1011_ >> 7;
						anIntArray9362[i_1073_] = anIntArray9362[i_1073_] * i_1012_ >> 7;
						anIntArray9352[i_1073_] += anInt9357;
						anIntArray9360[i_1073_] += anInt9367;
						anIntArray9362[i_1073_] += anInt9353;
					}
				}
			}
		} else if (i == 5) {
			if (anIntArrayArray9310 != null) {
				boolean bool_1074_ = false;
				for (int i_1075_ = 0; i_1075_ < i_1014_; i_1075_++) {
					int i_1076_ = is[i_1075_];
					if (i_1076_ < anIntArrayArray9310.length) {
						int[] is_1077_ = anIntArrayArray9310[i_1076_];
						for (int i_1078_ = 0; i_1078_ < is_1077_.length; i_1078_++) {
							int i_1079_ = is_1077_[i_1078_];
							int i_1080_ = ((aByteArray9321[i_1079_] & 0xff) + i_1010_ * 8);
							if (i_1080_ < 0)
								i_1080_ = 0;
							else if (i_1080_ > 255)
								i_1080_ = 255;
							aByteArray9321[i_1079_] = (byte) i_1080_;
						}
						bool_1074_ = bool_1074_ | is_1077_.length > 0;
					}
				}
				if (bool_1074_) {
					if (aClass361Array9356 != null) {
						for (int i_1081_ = 0; i_1081_ < anInt9355; i_1081_++) {
							Class361 class361 = aClass361Array9356[i_1081_];
							Class354 class354 = aClass354Array9347[i_1081_];
							class354.anInt3804 = (class354.anInt3804 & 0xffffff | 255 - (aByteArray9321[class361.anInt3841] & 0xff) << 24);
						}
					}
					method14751();
				}
			}
		} else if (i == 7) {
			if (anIntArrayArray9310 != null) {
				boolean bool_1082_ = false;
				for (int i_1083_ = 0; i_1083_ < i_1014_; i_1083_++) {
					int i_1084_ = is[i_1083_];
					if (i_1084_ < anIntArrayArray9310.length) {
						int[] is_1085_ = anIntArrayArray9310[i_1084_];
						for (int i_1086_ = 0; i_1086_ < is_1085_.length; i_1086_++) {
							int i_1087_ = is_1085_[i_1086_];
							int i_1088_ = aShortArray9326[i_1087_] & 0xffff;
							int i_1089_ = i_1088_ >> 10 & 0x3f;
							int i_1090_ = i_1088_ >> 7 & 0x7;
							int i_1091_ = i_1088_ & 0x7f;
							i_1089_ = i_1089_ + i_1010_ & 0x3f;
							i_1090_ += i_1011_ / 4;
							if (i_1090_ < 0)
								i_1090_ = 0;
							else if (i_1090_ > 7)
								i_1090_ = 7;
							i_1091_ += i_1012_;
							if (i_1091_ < 0)
								i_1091_ = 0;
							else if (i_1091_ > 127)
								i_1091_ = 127;
							aShortArray9326[i_1087_] = (short) (i_1089_ << 10 | i_1090_ << 7 | i_1091_);
						}
						bool_1082_ = bool_1082_ | is_1085_.length > 0;
					}
				}
				if (bool_1082_) {
					if (aClass361Array9356 != null) {
						for (int i_1092_ = 0; i_1092_ < anInt9355; i_1092_++) {
							Class361 class361 = aClass361Array9356[i_1092_];
							Class354 class354 = aClass354Array9347[i_1092_];
							class354.anInt3804 = (class354.anInt3804 & ~0xffffff | (Class656.anIntArray8390[(aShortArray9326[class361.anInt3841] & 0xffff)]) & 0xffffff);
						}
					}
					method14751();
				}
			}
		} else if (i == 8) {
			if (anIntArrayArray9329 != null) {
				for (int i_1093_ = 0; i_1093_ < i_1014_; i_1093_++) {
					int i_1094_ = is[i_1093_];
					if (i_1094_ < anIntArrayArray9329.length) {
						int[] is_1095_ = anIntArrayArray9329[i_1094_];
						for (int i_1096_ = 0; i_1096_ < is_1095_.length; i_1096_++) {
							Class354 class354 = aClass354Array9347[is_1095_[i_1096_]];
							class354.anInt3807 += i_1010_;
							class354.anInt3806 += i_1011_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (anIntArrayArray9329 != null) {
				for (int i_1097_ = 0; i_1097_ < i_1014_; i_1097_++) {
					int i_1098_ = is[i_1097_];
					if (i_1098_ < anIntArrayArray9329.length) {
						int[] is_1099_ = anIntArrayArray9329[i_1098_];
						for (int i_1100_ = 0; i_1100_ < is_1099_.length; i_1100_++) {
							Class354 class354 = aClass354Array9347[is_1099_[i_1100_]];
							class354.anInt3805 = class354.anInt3805 * i_1010_ >> 7;
							class354.anInt3808 = class354.anInt3808 * i_1011_ >> 7;
						}
					}
				}
			}
		} else if (i == 9) {
			if (anIntArrayArray9329 != null) {
				for (int i_1101_ = 0; i_1101_ < i_1014_; i_1101_++) {
					int i_1102_ = is[i_1101_];
					if (i_1102_ < anIntArrayArray9329.length) {
						int[] is_1103_ = anIntArrayArray9329[i_1102_];
						for (int i_1104_ = 0; i_1104_ < is_1103_.length; i_1104_++) {
							Class354 class354 = aClass354Array9347[is_1103_[i_1104_]];
							class354.anInt3809 = class354.anInt3809 + i_1010_ & 0x3fff;
						}
					}
				}
			}
		}
	}

	void method3034(int i, int[] is, int i_1105_, int i_1106_, int i_1107_, int i_1108_, boolean bool) {
		int i_1109_ = is.length;
		if (i == 0) {
			i_1105_ <<= 4;
			i_1106_ <<= 4;
			i_1107_ <<= 4;
			int i_1110_ = 0;
			anInt9357 = 0;
			anInt9367 = 0;
			anInt9353 = 0;
			for (int i_1111_ = 0; i_1111_ < i_1109_; i_1111_++) {
				int i_1112_ = is[i_1111_];
				if (i_1112_ < anIntArrayArray9306.length) {
					int[] is_1113_ = anIntArrayArray9306[i_1112_];
					for (int i_1114_ = 0; i_1114_ < is_1113_.length; i_1114_++) {
						int i_1115_ = is_1113_[i_1114_];
						anInt9357 += anIntArray9352[i_1115_];
						anInt9367 += anIntArray9360[i_1115_];
						anInt9353 += anIntArray9362[i_1115_];
						i_1110_++;
					}
				}
			}
			if (i_1110_ > 0) {
				anInt9357 = anInt9357 / i_1110_ + i_1105_;
				anInt9367 = anInt9367 / i_1110_ + i_1106_;
				anInt9353 = anInt9353 / i_1110_ + i_1107_;
			} else {
				anInt9357 = i_1105_;
				anInt9367 = i_1106_;
				anInt9353 = i_1107_;
			}
		} else if (i == 1) {
			i_1105_ <<= 4;
			i_1106_ <<= 4;
			i_1107_ <<= 4;
			for (int i_1116_ = 0; i_1116_ < i_1109_; i_1116_++) {
				int i_1117_ = is[i_1116_];
				if (i_1117_ < anIntArrayArray9306.length) {
					int[] is_1118_ = anIntArrayArray9306[i_1117_];
					for (int i_1119_ = 0; i_1119_ < is_1118_.length; i_1119_++) {
						int i_1120_ = is_1118_[i_1119_];
						anIntArray9352[i_1120_] += i_1105_;
						anIntArray9360[i_1120_] += i_1106_;
						anIntArray9362[i_1120_] += i_1107_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_1121_ = 0; i_1121_ < i_1109_; i_1121_++) {
				int i_1122_ = is[i_1121_];
				if (i_1122_ < anIntArrayArray9306.length) {
					int[] is_1123_ = anIntArrayArray9306[i_1122_];
					if ((i_1108_ & 0x1) == 0) {
						for (int i_1124_ = 0; i_1124_ < is_1123_.length; i_1124_++) {
							int i_1125_ = is_1123_[i_1124_];
							anIntArray9352[i_1125_] -= anInt9357;
							anIntArray9360[i_1125_] -= anInt9367;
							anIntArray9362[i_1125_] -= anInt9353;
							if (i_1107_ != 0) {
								int i_1126_ = Class428.anIntArray4825[i_1107_];
								int i_1127_ = Class428.anIntArray4819[i_1107_];
								int i_1128_ = ((anIntArray9360[i_1125_] * i_1126_ + anIntArray9352[i_1125_] * i_1127_ + 16383) >> 14);
								anIntArray9360[i_1125_] = (anIntArray9360[i_1125_] * i_1127_ - anIntArray9352[i_1125_] * i_1126_ + 16383) >> 14;
								anIntArray9352[i_1125_] = i_1128_;
							}
							if (i_1105_ != 0) {
								int i_1129_ = Class428.anIntArray4825[i_1105_];
								int i_1130_ = Class428.anIntArray4819[i_1105_];
								int i_1131_ = ((anIntArray9360[i_1125_] * i_1130_ - anIntArray9362[i_1125_] * i_1129_ + 16383) >> 14);
								anIntArray9362[i_1125_] = (anIntArray9360[i_1125_] * i_1129_ + anIntArray9362[i_1125_] * i_1130_ + 16383) >> 14;
								anIntArray9360[i_1125_] = i_1131_;
							}
							if (i_1106_ != 0) {
								int i_1132_ = Class428.anIntArray4825[i_1106_];
								int i_1133_ = Class428.anIntArray4819[i_1106_];
								int i_1134_ = ((anIntArray9362[i_1125_] * i_1132_ + anIntArray9352[i_1125_] * i_1133_ + 16383) >> 14);
								anIntArray9362[i_1125_] = (anIntArray9362[i_1125_] * i_1133_ - anIntArray9352[i_1125_] * i_1132_ + 16383) >> 14;
								anIntArray9352[i_1125_] = i_1134_;
							}
							anIntArray9352[i_1125_] += anInt9357;
							anIntArray9360[i_1125_] += anInt9367;
							anIntArray9362[i_1125_] += anInt9353;
						}
					} else {
						for (int i_1135_ = 0; i_1135_ < is_1123_.length; i_1135_++) {
							int i_1136_ = is_1123_[i_1135_];
							anIntArray9352[i_1136_] -= anInt9357;
							anIntArray9360[i_1136_] -= anInt9367;
							anIntArray9362[i_1136_] -= anInt9353;
							if (i_1105_ != 0) {
								int i_1137_ = Class428.anIntArray4825[i_1105_];
								int i_1138_ = Class428.anIntArray4819[i_1105_];
								int i_1139_ = ((anIntArray9360[i_1136_] * i_1138_ - anIntArray9362[i_1136_] * i_1137_ + 16383) >> 14);
								anIntArray9362[i_1136_] = (anIntArray9360[i_1136_] * i_1137_ + anIntArray9362[i_1136_] * i_1138_ + 16383) >> 14;
								anIntArray9360[i_1136_] = i_1139_;
							}
							if (i_1107_ != 0) {
								int i_1140_ = Class428.anIntArray4825[i_1107_];
								int i_1141_ = Class428.anIntArray4819[i_1107_];
								int i_1142_ = ((anIntArray9360[i_1136_] * i_1140_ + anIntArray9352[i_1136_] * i_1141_ + 16383) >> 14);
								anIntArray9360[i_1136_] = (anIntArray9360[i_1136_] * i_1141_ - anIntArray9352[i_1136_] * i_1140_ + 16383) >> 14;
								anIntArray9352[i_1136_] = i_1142_;
							}
							if (i_1106_ != 0) {
								int i_1143_ = Class428.anIntArray4825[i_1106_];
								int i_1144_ = Class428.anIntArray4819[i_1106_];
								int i_1145_ = ((anIntArray9362[i_1136_] * i_1143_ + anIntArray9352[i_1136_] * i_1144_ + 16383) >> 14);
								anIntArray9362[i_1136_] = (anIntArray9362[i_1136_] * i_1144_ - anIntArray9352[i_1136_] * i_1143_ + 16383) >> 14;
								anIntArray9352[i_1136_] = i_1145_;
							}
							anIntArray9352[i_1136_] += anInt9357;
							anIntArray9360[i_1136_] += anInt9367;
							anIntArray9362[i_1136_] += anInt9353;
						}
					}
				}
			}
			if (bool) {
				for (int i_1146_ = 0; i_1146_ < i_1109_; i_1146_++) {
					int i_1147_ = is[i_1146_];
					if (i_1147_ < anIntArrayArray9306.length) {
						int[] is_1148_ = anIntArrayArray9306[i_1147_];
						for (int i_1149_ = 0; i_1149_ < is_1148_.length; i_1149_++) {
							int i_1150_ = is_1148_[i_1149_];
							int i_1151_ = anIntArray9351[i_1150_];
							int i_1152_ = anIntArray9351[i_1150_ + 1];
							for (int i_1153_ = i_1151_; (i_1153_ < i_1152_ && aShortArray9366[i_1153_] != 0); i_1153_++) {
								int i_1154_ = (aShortArray9366[i_1153_] & 0xffff) - 1;
								if (i_1107_ != 0) {
									int i_1155_ = Class428.anIntArray4825[i_1107_];
									int i_1156_ = Class428.anIntArray4819[i_1107_];
									int i_1157_ = (aShortArray9305[i_1154_] * i_1155_ + aShortArray9311[i_1154_] * i_1156_ + 16383) >> 14;
									aShortArray9305[i_1154_] = (short) (((aShortArray9305[i_1154_] * i_1156_) - (aShortArray9311[i_1154_] * i_1155_) + 16383) >> 14);
									aShortArray9311[i_1154_] = (short) i_1157_;
								}
								if (i_1105_ != 0) {
									int i_1158_ = Class428.anIntArray4825[i_1105_];
									int i_1159_ = Class428.anIntArray4819[i_1105_];
									int i_1160_ = (aShortArray9305[i_1154_] * i_1159_ - aShortArray9313[i_1154_] * i_1158_ + 16383) >> 14;
									aShortArray9313[i_1154_] = (short) (((aShortArray9305[i_1154_] * i_1158_) + (aShortArray9313[i_1154_] * i_1159_) + 16383) >> 14);
									aShortArray9305[i_1154_] = (short) i_1160_;
								}
								if (i_1106_ != 0) {
									int i_1161_ = Class428.anIntArray4825[i_1106_];
									int i_1162_ = Class428.anIntArray4819[i_1106_];
									int i_1163_ = (aShortArray9313[i_1154_] * i_1161_ + aShortArray9311[i_1154_] * i_1162_ + 16383) >> 14;
									aShortArray9313[i_1154_] = (short) (((aShortArray9313[i_1154_] * i_1162_) - (aShortArray9311[i_1154_] * i_1161_) + 16383) >> 14);
									aShortArray9311[i_1154_] = (short) i_1163_;
								}
							}
						}
					}
				}
				method14752();
			}
		} else if (i == 3) {
			for (int i_1164_ = 0; i_1164_ < i_1109_; i_1164_++) {
				int i_1165_ = is[i_1164_];
				if (i_1165_ < anIntArrayArray9306.length) {
					int[] is_1166_ = anIntArrayArray9306[i_1165_];
					for (int i_1167_ = 0; i_1167_ < is_1166_.length; i_1167_++) {
						int i_1168_ = is_1166_[i_1167_];
						anIntArray9352[i_1168_] -= anInt9357;
						anIntArray9360[i_1168_] -= anInt9367;
						anIntArray9362[i_1168_] -= anInt9353;
						anIntArray9352[i_1168_] = anIntArray9352[i_1168_] * i_1105_ >> 7;
						anIntArray9360[i_1168_] = anIntArray9360[i_1168_] * i_1106_ >> 7;
						anIntArray9362[i_1168_] = anIntArray9362[i_1168_] * i_1107_ >> 7;
						anIntArray9352[i_1168_] += anInt9357;
						anIntArray9360[i_1168_] += anInt9367;
						anIntArray9362[i_1168_] += anInt9353;
					}
				}
			}
		} else if (i == 5) {
			if (anIntArrayArray9310 != null) {
				boolean bool_1169_ = false;
				for (int i_1170_ = 0; i_1170_ < i_1109_; i_1170_++) {
					int i_1171_ = is[i_1170_];
					if (i_1171_ < anIntArrayArray9310.length) {
						int[] is_1172_ = anIntArrayArray9310[i_1171_];
						for (int i_1173_ = 0; i_1173_ < is_1172_.length; i_1173_++) {
							int i_1174_ = is_1172_[i_1173_];
							int i_1175_ = ((aByteArray9321[i_1174_] & 0xff) + i_1105_ * 8);
							if (i_1175_ < 0)
								i_1175_ = 0;
							else if (i_1175_ > 255)
								i_1175_ = 255;
							aByteArray9321[i_1174_] = (byte) i_1175_;
						}
						bool_1169_ = bool_1169_ | is_1172_.length > 0;
					}
				}
				if (bool_1169_) {
					if (aClass361Array9356 != null) {
						for (int i_1176_ = 0; i_1176_ < anInt9355; i_1176_++) {
							Class361 class361 = aClass361Array9356[i_1176_];
							Class354 class354 = aClass354Array9347[i_1176_];
							class354.anInt3804 = (class354.anInt3804 & 0xffffff | 255 - (aByteArray9321[class361.anInt3841] & 0xff) << 24);
						}
					}
					method14751();
				}
			}
		} else if (i == 7) {
			if (anIntArrayArray9310 != null) {
				boolean bool_1177_ = false;
				for (int i_1178_ = 0; i_1178_ < i_1109_; i_1178_++) {
					int i_1179_ = is[i_1178_];
					if (i_1179_ < anIntArrayArray9310.length) {
						int[] is_1180_ = anIntArrayArray9310[i_1179_];
						for (int i_1181_ = 0; i_1181_ < is_1180_.length; i_1181_++) {
							int i_1182_ = is_1180_[i_1181_];
							int i_1183_ = aShortArray9326[i_1182_] & 0xffff;
							int i_1184_ = i_1183_ >> 10 & 0x3f;
							int i_1185_ = i_1183_ >> 7 & 0x7;
							int i_1186_ = i_1183_ & 0x7f;
							i_1184_ = i_1184_ + i_1105_ & 0x3f;
							i_1185_ += i_1106_ / 4;
							if (i_1185_ < 0)
								i_1185_ = 0;
							else if (i_1185_ > 7)
								i_1185_ = 7;
							i_1186_ += i_1107_;
							if (i_1186_ < 0)
								i_1186_ = 0;
							else if (i_1186_ > 127)
								i_1186_ = 127;
							aShortArray9326[i_1182_] = (short) (i_1184_ << 10 | i_1185_ << 7 | i_1186_);
						}
						bool_1177_ = bool_1177_ | is_1180_.length > 0;
					}
				}
				if (bool_1177_) {
					if (aClass361Array9356 != null) {
						for (int i_1187_ = 0; i_1187_ < anInt9355; i_1187_++) {
							Class361 class361 = aClass361Array9356[i_1187_];
							Class354 class354 = aClass354Array9347[i_1187_];
							class354.anInt3804 = (class354.anInt3804 & ~0xffffff | (Class656.anIntArray8390[(aShortArray9326[class361.anInt3841] & 0xffff)]) & 0xffffff);
						}
					}
					method14751();
				}
			}
		} else if (i == 8) {
			if (anIntArrayArray9329 != null) {
				for (int i_1188_ = 0; i_1188_ < i_1109_; i_1188_++) {
					int i_1189_ = is[i_1188_];
					if (i_1189_ < anIntArrayArray9329.length) {
						int[] is_1190_ = anIntArrayArray9329[i_1189_];
						for (int i_1191_ = 0; i_1191_ < is_1190_.length; i_1191_++) {
							Class354 class354 = aClass354Array9347[is_1190_[i_1191_]];
							class354.anInt3807 += i_1105_;
							class354.anInt3806 += i_1106_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (anIntArrayArray9329 != null) {
				for (int i_1192_ = 0; i_1192_ < i_1109_; i_1192_++) {
					int i_1193_ = is[i_1192_];
					if (i_1193_ < anIntArrayArray9329.length) {
						int[] is_1194_ = anIntArrayArray9329[i_1193_];
						for (int i_1195_ = 0; i_1195_ < is_1194_.length; i_1195_++) {
							Class354 class354 = aClass354Array9347[is_1194_[i_1195_]];
							class354.anInt3805 = class354.anInt3805 * i_1105_ >> 7;
							class354.anInt3808 = class354.anInt3808 * i_1106_ >> 7;
						}
					}
				}
			}
		} else if (i == 9) {
			if (anIntArrayArray9329 != null) {
				for (int i_1196_ = 0; i_1196_ < i_1109_; i_1196_++) {
					int i_1197_ = is[i_1196_];
					if (i_1197_ < anIntArrayArray9329.length) {
						int[] is_1198_ = anIntArrayArray9329[i_1197_];
						for (int i_1199_ = 0; i_1199_ < is_1198_.length; i_1199_++) {
							Class354 class354 = aClass354Array9347[is_1198_[i_1199_]];
							class354.anInt3809 = class354.anInt3809 + i_1105_ & 0x3fff;
						}
					}
				}
			}
		}
	}

	void method2954(int i, int[] is, int i_1200_, int i_1201_, int i_1202_, int i_1203_, boolean bool) {
		int i_1204_ = is.length;
		if (i == 0) {
			i_1200_ <<= 4;
			i_1201_ <<= 4;
			i_1202_ <<= 4;
			int i_1205_ = 0;
			anInt9357 = 0;
			anInt9367 = 0;
			anInt9353 = 0;
			for (int i_1206_ = 0; i_1206_ < i_1204_; i_1206_++) {
				int i_1207_ = is[i_1206_];
				if (i_1207_ < anIntArrayArray9306.length) {
					int[] is_1208_ = anIntArrayArray9306[i_1207_];
					for (int i_1209_ = 0; i_1209_ < is_1208_.length; i_1209_++) {
						int i_1210_ = is_1208_[i_1209_];
						anInt9357 += anIntArray9352[i_1210_];
						anInt9367 += anIntArray9360[i_1210_];
						anInt9353 += anIntArray9362[i_1210_];
						i_1205_++;
					}
				}
			}
			if (i_1205_ > 0) {
				anInt9357 = anInt9357 / i_1205_ + i_1200_;
				anInt9367 = anInt9367 / i_1205_ + i_1201_;
				anInt9353 = anInt9353 / i_1205_ + i_1202_;
			} else {
				anInt9357 = i_1200_;
				anInt9367 = i_1201_;
				anInt9353 = i_1202_;
			}
		} else if (i == 1) {
			i_1200_ <<= 4;
			i_1201_ <<= 4;
			i_1202_ <<= 4;
			for (int i_1211_ = 0; i_1211_ < i_1204_; i_1211_++) {
				int i_1212_ = is[i_1211_];
				if (i_1212_ < anIntArrayArray9306.length) {
					int[] is_1213_ = anIntArrayArray9306[i_1212_];
					for (int i_1214_ = 0; i_1214_ < is_1213_.length; i_1214_++) {
						int i_1215_ = is_1213_[i_1214_];
						anIntArray9352[i_1215_] += i_1200_;
						anIntArray9360[i_1215_] += i_1201_;
						anIntArray9362[i_1215_] += i_1202_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_1216_ = 0; i_1216_ < i_1204_; i_1216_++) {
				int i_1217_ = is[i_1216_];
				if (i_1217_ < anIntArrayArray9306.length) {
					int[] is_1218_ = anIntArrayArray9306[i_1217_];
					if ((i_1203_ & 0x1) == 0) {
						for (int i_1219_ = 0; i_1219_ < is_1218_.length; i_1219_++) {
							int i_1220_ = is_1218_[i_1219_];
							anIntArray9352[i_1220_] -= anInt9357;
							anIntArray9360[i_1220_] -= anInt9367;
							anIntArray9362[i_1220_] -= anInt9353;
							if (i_1202_ != 0) {
								int i_1221_ = Class428.anIntArray4825[i_1202_];
								int i_1222_ = Class428.anIntArray4819[i_1202_];
								int i_1223_ = ((anIntArray9360[i_1220_] * i_1221_ + anIntArray9352[i_1220_] * i_1222_ + 16383) >> 14);
								anIntArray9360[i_1220_] = (anIntArray9360[i_1220_] * i_1222_ - anIntArray9352[i_1220_] * i_1221_ + 16383) >> 14;
								anIntArray9352[i_1220_] = i_1223_;
							}
							if (i_1200_ != 0) {
								int i_1224_ = Class428.anIntArray4825[i_1200_];
								int i_1225_ = Class428.anIntArray4819[i_1200_];
								int i_1226_ = ((anIntArray9360[i_1220_] * i_1225_ - anIntArray9362[i_1220_] * i_1224_ + 16383) >> 14);
								anIntArray9362[i_1220_] = (anIntArray9360[i_1220_] * i_1224_ + anIntArray9362[i_1220_] * i_1225_ + 16383) >> 14;
								anIntArray9360[i_1220_] = i_1226_;
							}
							if (i_1201_ != 0) {
								int i_1227_ = Class428.anIntArray4825[i_1201_];
								int i_1228_ = Class428.anIntArray4819[i_1201_];
								int i_1229_ = ((anIntArray9362[i_1220_] * i_1227_ + anIntArray9352[i_1220_] * i_1228_ + 16383) >> 14);
								anIntArray9362[i_1220_] = (anIntArray9362[i_1220_] * i_1228_ - anIntArray9352[i_1220_] * i_1227_ + 16383) >> 14;
								anIntArray9352[i_1220_] = i_1229_;
							}
							anIntArray9352[i_1220_] += anInt9357;
							anIntArray9360[i_1220_] += anInt9367;
							anIntArray9362[i_1220_] += anInt9353;
						}
					} else {
						for (int i_1230_ = 0; i_1230_ < is_1218_.length; i_1230_++) {
							int i_1231_ = is_1218_[i_1230_];
							anIntArray9352[i_1231_] -= anInt9357;
							anIntArray9360[i_1231_] -= anInt9367;
							anIntArray9362[i_1231_] -= anInt9353;
							if (i_1200_ != 0) {
								int i_1232_ = Class428.anIntArray4825[i_1200_];
								int i_1233_ = Class428.anIntArray4819[i_1200_];
								int i_1234_ = ((anIntArray9360[i_1231_] * i_1233_ - anIntArray9362[i_1231_] * i_1232_ + 16383) >> 14);
								anIntArray9362[i_1231_] = (anIntArray9360[i_1231_] * i_1232_ + anIntArray9362[i_1231_] * i_1233_ + 16383) >> 14;
								anIntArray9360[i_1231_] = i_1234_;
							}
							if (i_1202_ != 0) {
								int i_1235_ = Class428.anIntArray4825[i_1202_];
								int i_1236_ = Class428.anIntArray4819[i_1202_];
								int i_1237_ = ((anIntArray9360[i_1231_] * i_1235_ + anIntArray9352[i_1231_] * i_1236_ + 16383) >> 14);
								anIntArray9360[i_1231_] = (anIntArray9360[i_1231_] * i_1236_ - anIntArray9352[i_1231_] * i_1235_ + 16383) >> 14;
								anIntArray9352[i_1231_] = i_1237_;
							}
							if (i_1201_ != 0) {
								int i_1238_ = Class428.anIntArray4825[i_1201_];
								int i_1239_ = Class428.anIntArray4819[i_1201_];
								int i_1240_ = ((anIntArray9362[i_1231_] * i_1238_ + anIntArray9352[i_1231_] * i_1239_ + 16383) >> 14);
								anIntArray9362[i_1231_] = (anIntArray9362[i_1231_] * i_1239_ - anIntArray9352[i_1231_] * i_1238_ + 16383) >> 14;
								anIntArray9352[i_1231_] = i_1240_;
							}
							anIntArray9352[i_1231_] += anInt9357;
							anIntArray9360[i_1231_] += anInt9367;
							anIntArray9362[i_1231_] += anInt9353;
						}
					}
				}
			}
			if (bool) {
				for (int i_1241_ = 0; i_1241_ < i_1204_; i_1241_++) {
					int i_1242_ = is[i_1241_];
					if (i_1242_ < anIntArrayArray9306.length) {
						int[] is_1243_ = anIntArrayArray9306[i_1242_];
						for (int i_1244_ = 0; i_1244_ < is_1243_.length; i_1244_++) {
							int i_1245_ = is_1243_[i_1244_];
							int i_1246_ = anIntArray9351[i_1245_];
							int i_1247_ = anIntArray9351[i_1245_ + 1];
							for (int i_1248_ = i_1246_; (i_1248_ < i_1247_ && aShortArray9366[i_1248_] != 0); i_1248_++) {
								int i_1249_ = (aShortArray9366[i_1248_] & 0xffff) - 1;
								if (i_1202_ != 0) {
									int i_1250_ = Class428.anIntArray4825[i_1202_];
									int i_1251_ = Class428.anIntArray4819[i_1202_];
									int i_1252_ = (aShortArray9305[i_1249_] * i_1250_ + aShortArray9311[i_1249_] * i_1251_ + 16383) >> 14;
									aShortArray9305[i_1249_] = (short) (((aShortArray9305[i_1249_] * i_1251_) - (aShortArray9311[i_1249_] * i_1250_) + 16383) >> 14);
									aShortArray9311[i_1249_] = (short) i_1252_;
								}
								if (i_1200_ != 0) {
									int i_1253_ = Class428.anIntArray4825[i_1200_];
									int i_1254_ = Class428.anIntArray4819[i_1200_];
									int i_1255_ = (aShortArray9305[i_1249_] * i_1254_ - aShortArray9313[i_1249_] * i_1253_ + 16383) >> 14;
									aShortArray9313[i_1249_] = (short) (((aShortArray9305[i_1249_] * i_1253_) + (aShortArray9313[i_1249_] * i_1254_) + 16383) >> 14);
									aShortArray9305[i_1249_] = (short) i_1255_;
								}
								if (i_1201_ != 0) {
									int i_1256_ = Class428.anIntArray4825[i_1201_];
									int i_1257_ = Class428.anIntArray4819[i_1201_];
									int i_1258_ = (aShortArray9313[i_1249_] * i_1256_ + aShortArray9311[i_1249_] * i_1257_ + 16383) >> 14;
									aShortArray9313[i_1249_] = (short) (((aShortArray9313[i_1249_] * i_1257_) - (aShortArray9311[i_1249_] * i_1256_) + 16383) >> 14);
									aShortArray9311[i_1249_] = (short) i_1258_;
								}
							}
						}
					}
				}
				method14752();
			}
		} else if (i == 3) {
			for (int i_1259_ = 0; i_1259_ < i_1204_; i_1259_++) {
				int i_1260_ = is[i_1259_];
				if (i_1260_ < anIntArrayArray9306.length) {
					int[] is_1261_ = anIntArrayArray9306[i_1260_];
					for (int i_1262_ = 0; i_1262_ < is_1261_.length; i_1262_++) {
						int i_1263_ = is_1261_[i_1262_];
						anIntArray9352[i_1263_] -= anInt9357;
						anIntArray9360[i_1263_] -= anInt9367;
						anIntArray9362[i_1263_] -= anInt9353;
						anIntArray9352[i_1263_] = anIntArray9352[i_1263_] * i_1200_ >> 7;
						anIntArray9360[i_1263_] = anIntArray9360[i_1263_] * i_1201_ >> 7;
						anIntArray9362[i_1263_] = anIntArray9362[i_1263_] * i_1202_ >> 7;
						anIntArray9352[i_1263_] += anInt9357;
						anIntArray9360[i_1263_] += anInt9367;
						anIntArray9362[i_1263_] += anInt9353;
					}
				}
			}
		} else if (i == 5) {
			if (anIntArrayArray9310 != null) {
				boolean bool_1264_ = false;
				for (int i_1265_ = 0; i_1265_ < i_1204_; i_1265_++) {
					int i_1266_ = is[i_1265_];
					if (i_1266_ < anIntArrayArray9310.length) {
						int[] is_1267_ = anIntArrayArray9310[i_1266_];
						for (int i_1268_ = 0; i_1268_ < is_1267_.length; i_1268_++) {
							int i_1269_ = is_1267_[i_1268_];
							int i_1270_ = ((aByteArray9321[i_1269_] & 0xff) + i_1200_ * 8);
							if (i_1270_ < 0)
								i_1270_ = 0;
							else if (i_1270_ > 255)
								i_1270_ = 255;
							aByteArray9321[i_1269_] = (byte) i_1270_;
						}
						bool_1264_ = bool_1264_ | is_1267_.length > 0;
					}
				}
				if (bool_1264_) {
					if (aClass361Array9356 != null) {
						for (int i_1271_ = 0; i_1271_ < anInt9355; i_1271_++) {
							Class361 class361 = aClass361Array9356[i_1271_];
							Class354 class354 = aClass354Array9347[i_1271_];
							class354.anInt3804 = (class354.anInt3804 & 0xffffff | 255 - (aByteArray9321[class361.anInt3841] & 0xff) << 24);
						}
					}
					method14751();
				}
			}
		} else if (i == 7) {
			if (anIntArrayArray9310 != null) {
				boolean bool_1272_ = false;
				for (int i_1273_ = 0; i_1273_ < i_1204_; i_1273_++) {
					int i_1274_ = is[i_1273_];
					if (i_1274_ < anIntArrayArray9310.length) {
						int[] is_1275_ = anIntArrayArray9310[i_1274_];
						for (int i_1276_ = 0; i_1276_ < is_1275_.length; i_1276_++) {
							int i_1277_ = is_1275_[i_1276_];
							int i_1278_ = aShortArray9326[i_1277_] & 0xffff;
							int i_1279_ = i_1278_ >> 10 & 0x3f;
							int i_1280_ = i_1278_ >> 7 & 0x7;
							int i_1281_ = i_1278_ & 0x7f;
							i_1279_ = i_1279_ + i_1200_ & 0x3f;
							i_1280_ += i_1201_ / 4;
							if (i_1280_ < 0)
								i_1280_ = 0;
							else if (i_1280_ > 7)
								i_1280_ = 7;
							i_1281_ += i_1202_;
							if (i_1281_ < 0)
								i_1281_ = 0;
							else if (i_1281_ > 127)
								i_1281_ = 127;
							aShortArray9326[i_1277_] = (short) (i_1279_ << 10 | i_1280_ << 7 | i_1281_);
						}
						bool_1272_ = bool_1272_ | is_1275_.length > 0;
					}
				}
				if (bool_1272_) {
					if (aClass361Array9356 != null) {
						for (int i_1282_ = 0; i_1282_ < anInt9355; i_1282_++) {
							Class361 class361 = aClass361Array9356[i_1282_];
							Class354 class354 = aClass354Array9347[i_1282_];
							class354.anInt3804 = (class354.anInt3804 & ~0xffffff | (Class656.anIntArray8390[(aShortArray9326[class361.anInt3841] & 0xffff)]) & 0xffffff);
						}
					}
					method14751();
				}
			}
		} else if (i == 8) {
			if (anIntArrayArray9329 != null) {
				for (int i_1283_ = 0; i_1283_ < i_1204_; i_1283_++) {
					int i_1284_ = is[i_1283_];
					if (i_1284_ < anIntArrayArray9329.length) {
						int[] is_1285_ = anIntArrayArray9329[i_1284_];
						for (int i_1286_ = 0; i_1286_ < is_1285_.length; i_1286_++) {
							Class354 class354 = aClass354Array9347[is_1285_[i_1286_]];
							class354.anInt3807 += i_1200_;
							class354.anInt3806 += i_1201_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (anIntArrayArray9329 != null) {
				for (int i_1287_ = 0; i_1287_ < i_1204_; i_1287_++) {
					int i_1288_ = is[i_1287_];
					if (i_1288_ < anIntArrayArray9329.length) {
						int[] is_1289_ = anIntArrayArray9329[i_1288_];
						for (int i_1290_ = 0; i_1290_ < is_1289_.length; i_1290_++) {
							Class354 class354 = aClass354Array9347[is_1289_[i_1290_]];
							class354.anInt3805 = class354.anInt3805 * i_1200_ >> 7;
							class354.anInt3808 = class354.anInt3808 * i_1201_ >> 7;
						}
					}
				}
			}
		} else if (i == 9) {
			if (anIntArrayArray9329 != null) {
				for (int i_1291_ = 0; i_1291_ < i_1204_; i_1291_++) {
					int i_1292_ = is[i_1291_];
					if (i_1292_ < anIntArrayArray9329.length) {
						int[] is_1293_ = anIntArrayArray9329[i_1292_];
						for (int i_1294_ = 0; i_1294_ < is_1293_.length; i_1294_++) {
							Class354 class354 = aClass354Array9347[is_1293_[i_1294_]];
							class354.anInt3809 = class354.anInt3809 + i_1200_ & 0x3fff;
						}
					}
				}
			}
		}
	}

	void method2955(int i, int[] is, int i_1295_, int i_1296_, int i_1297_, boolean bool, int i_1298_, int[] is_1299_) {
		int i_1300_ = is.length;
		if (i == 0) {
			i_1295_ <<= 4;
			i_1296_ <<= 4;
			i_1297_ <<= 4;
			int i_1301_ = 0;
			anInt9357 = 0;
			anInt9367 = 0;
			anInt9353 = 0;
			for (int i_1302_ = 0; i_1302_ < i_1300_; i_1302_++) {
				int i_1303_ = is[i_1302_];
				if (i_1303_ < anIntArrayArray9306.length) {
					int[] is_1304_ = anIntArrayArray9306[i_1303_];
					for (int i_1305_ = 0; i_1305_ < is_1304_.length; i_1305_++) {
						int i_1306_ = is_1304_[i_1305_];
						if (aShortArray9307 == null || (i_1298_ & aShortArray9307[i_1306_]) != 0) {
							anInt9357 += anIntArray9352[i_1306_];
							anInt9367 += anIntArray9360[i_1306_];
							anInt9353 += anIntArray9362[i_1306_];
							i_1301_++;
						}
					}
				}
			}
			if (i_1301_ > 0) {
				anInt9357 = anInt9357 / i_1301_ + i_1295_;
				anInt9367 = anInt9367 / i_1301_ + i_1296_;
				anInt9353 = anInt9353 / i_1301_ + i_1297_;
				aBool9328 = true;
			} else {
				anInt9357 = i_1295_;
				anInt9367 = i_1296_;
				anInt9353 = i_1297_;
			}
		} else if (i == 1) {
			if (is_1299_ != null) {
				int i_1307_ = ((is_1299_[0] * i_1295_ + is_1299_[1] * i_1296_ + is_1299_[2] * i_1297_ + 8192) >> 14);
				int i_1308_ = ((is_1299_[3] * i_1295_ + is_1299_[4] * i_1296_ + is_1299_[5] * i_1297_ + 8192) >> 14);
				int i_1309_ = ((is_1299_[6] * i_1295_ + is_1299_[7] * i_1296_ + is_1299_[8] * i_1297_ + 8192) >> 14);
				i_1295_ = i_1307_;
				i_1296_ = i_1308_;
				i_1297_ = i_1309_;
			}
			i_1295_ <<= 4;
			i_1296_ <<= 4;
			i_1297_ <<= 4;
			for (int i_1310_ = 0; i_1310_ < i_1300_; i_1310_++) {
				int i_1311_ = is[i_1310_];
				if (i_1311_ < anIntArrayArray9306.length) {
					int[] is_1312_ = anIntArrayArray9306[i_1311_];
					for (int i_1313_ = 0; i_1313_ < is_1312_.length; i_1313_++) {
						int i_1314_ = is_1312_[i_1313_];
						if (aShortArray9307 == null || (i_1298_ & aShortArray9307[i_1314_]) != 0) {
							anIntArray9352[i_1314_] += i_1295_;
							anIntArray9360[i_1314_] += i_1296_;
							anIntArray9362[i_1314_] += i_1297_;
						}
					}
				}
			}
		} else if (i == 2) {
			if (is_1299_ != null) {
				int i_1315_ = is_1299_[9] << 4;
				int i_1316_ = is_1299_[10] << 4;
				int i_1317_ = is_1299_[11] << 4;
				int i_1318_ = is_1299_[12] << 4;
				int i_1319_ = is_1299_[13] << 4;
				int i_1320_ = is_1299_[14] << 4;
				if (aBool9328) {
					int i_1321_ = ((is_1299_[0] * anInt9357 + is_1299_[3] * anInt9367 + is_1299_[6] * anInt9353 + 8192) >> 14);
					int i_1322_ = ((is_1299_[1] * anInt9357 + is_1299_[4] * anInt9367 + is_1299_[7] * anInt9353 + 8192) >> 14);
					int i_1323_ = ((is_1299_[2] * anInt9357 + is_1299_[5] * anInt9367 + is_1299_[8] * anInt9353 + 8192) >> 14);
					i_1321_ += i_1318_;
					i_1322_ += i_1319_;
					i_1323_ += i_1320_;
					anInt9357 = i_1321_;
					anInt9367 = i_1322_;
					anInt9353 = i_1323_;
					aBool9328 = false;
				}
				int[] is_1324_ = new int[9];
				int i_1325_ = Class428.anIntArray4819[i_1295_];
				int i_1326_ = Class428.anIntArray4825[i_1295_];
				int i_1327_ = Class428.anIntArray4819[i_1296_];
				int i_1328_ = Class428.anIntArray4825[i_1296_];
				int i_1329_ = Class428.anIntArray4819[i_1297_];
				int i_1330_ = Class428.anIntArray4825[i_1297_];
				int i_1331_ = i_1326_ * i_1329_ + 8192 >> 14;
				int i_1332_ = i_1326_ * i_1330_ + 8192 >> 14;
				is_1324_[0] = i_1327_ * i_1329_ + i_1328_ * i_1332_ + 8192 >> 14;
				is_1324_[1] = -i_1327_ * i_1330_ + i_1328_ * i_1331_ + 8192 >> 14;
				is_1324_[2] = i_1328_ * i_1325_ + 8192 >> 14;
				is_1324_[3] = i_1325_ * i_1330_ + 8192 >> 14;
				is_1324_[4] = i_1325_ * i_1329_ + 8192 >> 14;
				is_1324_[5] = -i_1326_;
				is_1324_[6] = -i_1328_ * i_1329_ + i_1327_ * i_1332_ + 8192 >> 14;
				is_1324_[7] = i_1328_ * i_1330_ + i_1327_ * i_1331_ + 8192 >> 14;
				is_1324_[8] = i_1327_ * i_1325_ + 8192 >> 14;
				int i_1333_ = ((is_1324_[0] * -anInt9357 + is_1324_[1] * -anInt9367 + is_1324_[2] * -anInt9353 + 8192) >> 14);
				int i_1334_ = ((is_1324_[3] * -anInt9357 + is_1324_[4] * -anInt9367 + is_1324_[5] * -anInt9353 + 8192) >> 14);
				int i_1335_ = ((is_1324_[6] * -anInt9357 + is_1324_[7] * -anInt9367 + is_1324_[8] * -anInt9353 + 8192) >> 14);
				int i_1336_ = i_1333_ + anInt9357;
				int i_1337_ = i_1334_ + anInt9367;
				int i_1338_ = i_1335_ + anInt9353;
				int[] is_1339_ = new int[9];
				for (int i_1340_ = 0; i_1340_ < 3; i_1340_++) {
					for (int i_1341_ = 0; i_1341_ < 3; i_1341_++) {
						int i_1342_ = 0;
						for (int i_1343_ = 0; i_1343_ < 3; i_1343_++)
							i_1342_ += (is_1324_[i_1340_ * 3 + i_1343_] * is_1299_[i_1341_ * 3 + i_1343_]);
						is_1339_[i_1340_ * 3 + i_1341_] = i_1342_ + 8192 >> 14;
					}
				}
				int i_1344_ = ((is_1324_[0] * i_1318_ + is_1324_[1] * i_1319_ + is_1324_[2] * i_1320_ + 8192) >> 14);
				int i_1345_ = ((is_1324_[3] * i_1318_ + is_1324_[4] * i_1319_ + is_1324_[5] * i_1320_ + 8192) >> 14);
				int i_1346_ = ((is_1324_[6] * i_1318_ + is_1324_[7] * i_1319_ + is_1324_[8] * i_1320_ + 8192) >> 14);
				i_1344_ += i_1336_;
				i_1345_ += i_1337_;
				i_1346_ += i_1338_;
				int[] is_1347_ = new int[9];
				for (int i_1348_ = 0; i_1348_ < 3; i_1348_++) {
					for (int i_1349_ = 0; i_1349_ < 3; i_1349_++) {
						int i_1350_ = 0;
						for (int i_1351_ = 0; i_1351_ < 3; i_1351_++)
							i_1350_ += (is_1299_[i_1348_ * 3 + i_1351_] * is_1339_[i_1349_ + i_1351_ * 3]);
						is_1347_[i_1348_ * 3 + i_1349_] = i_1350_ + 8192 >> 14;
					}
				}
				int i_1352_ = ((is_1299_[0] * i_1344_ + is_1299_[1] * i_1345_ + is_1299_[2] * i_1346_ + 8192) >> 14);
				int i_1353_ = ((is_1299_[3] * i_1344_ + is_1299_[4] * i_1345_ + is_1299_[5] * i_1346_ + 8192) >> 14);
				int i_1354_ = ((is_1299_[6] * i_1344_ + is_1299_[7] * i_1345_ + is_1299_[8] * i_1346_ + 8192) >> 14);
				i_1352_ += i_1315_;
				i_1353_ += i_1316_;
				i_1354_ += i_1317_;
				for (int i_1355_ = 0; i_1355_ < i_1300_; i_1355_++) {
					int i_1356_ = is[i_1355_];
					if (i_1356_ < anIntArrayArray9306.length) {
						int[] is_1357_ = anIntArrayArray9306[i_1356_];
						for (int i_1358_ = 0; i_1358_ < is_1357_.length; i_1358_++) {
							int i_1359_ = is_1357_[i_1358_];
							if (aShortArray9307 == null || (i_1298_ & aShortArray9307[i_1359_]) != 0) {
								int i_1360_ = ((is_1347_[0] * anIntArray9352[i_1359_] + is_1347_[1] * anIntArray9360[i_1359_] + is_1347_[2] * anIntArray9362[i_1359_] + 8192) >> 14);
								int i_1361_ = ((is_1347_[3] * anIntArray9352[i_1359_] + is_1347_[4] * anIntArray9360[i_1359_] + is_1347_[5] * anIntArray9362[i_1359_] + 8192) >> 14);
								int i_1362_ = ((is_1347_[6] * anIntArray9352[i_1359_] + is_1347_[7] * anIntArray9360[i_1359_] + is_1347_[8] * anIntArray9362[i_1359_] + 8192) >> 14);
								i_1360_ += i_1352_;
								i_1361_ += i_1353_;
								i_1362_ += i_1354_;
								anIntArray9352[i_1359_] = i_1360_;
								anIntArray9360[i_1359_] = i_1361_;
								anIntArray9362[i_1359_] = i_1362_;
							}
						}
					}
				}
			} else {
				for (int i_1363_ = 0; i_1363_ < i_1300_; i_1363_++) {
					int i_1364_ = is[i_1363_];
					if (i_1364_ < anIntArrayArray9306.length) {
						int[] is_1365_ = anIntArrayArray9306[i_1364_];
						for (int i_1366_ = 0; i_1366_ < is_1365_.length; i_1366_++) {
							int i_1367_ = is_1365_[i_1366_];
							if (aShortArray9307 == null || (i_1298_ & aShortArray9307[i_1367_]) != 0) {
								anIntArray9352[i_1367_] -= anInt9357;
								anIntArray9360[i_1367_] -= anInt9367;
								anIntArray9362[i_1367_] -= anInt9353;
								if (i_1297_ != 0) {
									int i_1368_ = Class428.anIntArray4825[i_1297_];
									int i_1369_ = Class428.anIntArray4819[i_1297_];
									int i_1370_ = ((anIntArray9360[i_1367_] * i_1368_ + anIntArray9352[i_1367_] * i_1369_ + 16383) >> 14);
									anIntArray9360[i_1367_] = (anIntArray9360[i_1367_] * i_1369_ - anIntArray9352[i_1367_] * i_1368_ + 16383) >> 14;
									anIntArray9352[i_1367_] = i_1370_;
								}
								if (i_1295_ != 0) {
									int i_1371_ = Class428.anIntArray4825[i_1295_];
									int i_1372_ = Class428.anIntArray4819[i_1295_];
									int i_1373_ = ((anIntArray9360[i_1367_] * i_1372_ - anIntArray9362[i_1367_] * i_1371_ + 16383) >> 14);
									anIntArray9362[i_1367_] = (anIntArray9360[i_1367_] * i_1371_ + anIntArray9362[i_1367_] * i_1372_ + 16383) >> 14;
									anIntArray9360[i_1367_] = i_1373_;
								}
								if (i_1296_ != 0) {
									int i_1374_ = Class428.anIntArray4825[i_1296_];
									int i_1375_ = Class428.anIntArray4819[i_1296_];
									int i_1376_ = ((anIntArray9362[i_1367_] * i_1374_ + anIntArray9352[i_1367_] * i_1375_ + 16383) >> 14);
									anIntArray9362[i_1367_] = (anIntArray9362[i_1367_] * i_1375_ - anIntArray9352[i_1367_] * i_1374_ + 16383) >> 14;
									anIntArray9352[i_1367_] = i_1376_;
								}
								anIntArray9352[i_1367_] += anInt9357;
								anIntArray9360[i_1367_] += anInt9367;
								anIntArray9362[i_1367_] += anInt9353;
							}
						}
					}
				}
				if (bool) {
					for (int i_1377_ = 0; i_1377_ < i_1300_; i_1377_++) {
						int i_1378_ = is[i_1377_];
						if (i_1378_ < anIntArrayArray9306.length) {
							int[] is_1379_ = anIntArrayArray9306[i_1378_];
							for (int i_1380_ = 0; i_1380_ < is_1379_.length; i_1380_++) {
								int i_1381_ = is_1379_[i_1380_];
								if (aShortArray9307 == null || ((i_1298_ & aShortArray9307[i_1381_]) != 0)) {
									int i_1382_ = anIntArray9351[i_1381_];
									int i_1383_ = anIntArray9351[i_1381_ + 1];
									for (int i_1384_ = i_1382_; (i_1384_ < i_1383_ && aShortArray9366[i_1384_] != 0); i_1384_++) {
										int i_1385_ = (aShortArray9366[i_1384_] & 0xffff) - 1;
										if (i_1297_ != 0) {
											int i_1386_ = (Class428.anIntArray4825[i_1297_]);
											int i_1387_ = (Class428.anIntArray4819[i_1297_]);
											int i_1388_ = (((aShortArray9305[i_1385_] * i_1386_) + (aShortArray9311[i_1385_] * i_1387_) + 16383) >> 14);
											aShortArray9305[i_1385_] = (short) ((((aShortArray9305[i_1385_]) * i_1387_) - ((aShortArray9311[i_1385_]) * i_1386_) + 16383) >> 14);
											aShortArray9311[i_1385_] = (short) i_1388_;
										}
										if (i_1295_ != 0) {
											int i_1389_ = (Class428.anIntArray4825[i_1295_]);
											int i_1390_ = (Class428.anIntArray4819[i_1295_]);
											int i_1391_ = (((aShortArray9305[i_1385_] * i_1390_) - (aShortArray9313[i_1385_] * i_1389_) + 16383) >> 14);
											aShortArray9313[i_1385_] = (short) ((((aShortArray9305[i_1385_]) * i_1389_) + ((aShortArray9313[i_1385_]) * i_1390_) + 16383) >> 14);
											aShortArray9305[i_1385_] = (short) i_1391_;
										}
										if (i_1296_ != 0) {
											int i_1392_ = (Class428.anIntArray4825[i_1296_]);
											int i_1393_ = (Class428.anIntArray4819[i_1296_]);
											int i_1394_ = (((aShortArray9313[i_1385_] * i_1392_) + (aShortArray9311[i_1385_] * i_1393_) + 16383) >> 14);
											aShortArray9313[i_1385_] = (short) ((((aShortArray9313[i_1385_]) * i_1393_) - ((aShortArray9311[i_1385_]) * i_1392_) + 16383) >> 14);
											aShortArray9311[i_1385_] = (short) i_1394_;
										}
									}
								}
							}
						}
					}
					method14752();
				}
			}
		} else if (i == 3) {
			if (is_1299_ != null) {
				int i_1395_ = is_1299_[9] << 4;
				int i_1396_ = is_1299_[10] << 4;
				int i_1397_ = is_1299_[11] << 4;
				int i_1398_ = is_1299_[12] << 4;
				int i_1399_ = is_1299_[13] << 4;
				int i_1400_ = is_1299_[14] << 4;
				if (aBool9328) {
					int i_1401_ = ((is_1299_[0] * anInt9357 + is_1299_[3] * anInt9367 + is_1299_[6] * anInt9353 + 8192) >> 14);
					int i_1402_ = ((is_1299_[1] * anInt9357 + is_1299_[4] * anInt9367 + is_1299_[7] * anInt9353 + 8192) >> 14);
					int i_1403_ = ((is_1299_[2] * anInt9357 + is_1299_[5] * anInt9367 + is_1299_[8] * anInt9353 + 8192) >> 14);
					i_1401_ += i_1398_;
					i_1402_ += i_1399_;
					i_1403_ += i_1400_;
					anInt9357 = i_1401_;
					anInt9367 = i_1402_;
					anInt9353 = i_1403_;
					aBool9328 = false;
				}
				int i_1404_ = i_1295_ << 15 >> 7;
				int i_1405_ = i_1296_ << 15 >> 7;
				int i_1406_ = i_1297_ << 15 >> 7;
				int i_1407_ = i_1404_ * -anInt9357 + 8192 >> 14;
				int i_1408_ = i_1405_ * -anInt9367 + 8192 >> 14;
				int i_1409_ = i_1406_ * -anInt9353 + 8192 >> 14;
				int i_1410_ = i_1407_ + anInt9357;
				int i_1411_ = i_1408_ + anInt9367;
				int i_1412_ = i_1409_ + anInt9353;
				int[] is_1413_ = new int[9];
				is_1413_[0] = i_1404_ * is_1299_[0] + 8192 >> 14;
				is_1413_[1] = i_1404_ * is_1299_[3] + 8192 >> 14;
				is_1413_[2] = i_1404_ * is_1299_[6] + 8192 >> 14;
				is_1413_[3] = i_1405_ * is_1299_[1] + 8192 >> 14;
				is_1413_[4] = i_1405_ * is_1299_[4] + 8192 >> 14;
				is_1413_[5] = i_1405_ * is_1299_[7] + 8192 >> 14;
				is_1413_[6] = i_1406_ * is_1299_[2] + 8192 >> 14;
				is_1413_[7] = i_1406_ * is_1299_[5] + 8192 >> 14;
				is_1413_[8] = i_1406_ * is_1299_[8] + 8192 >> 14;
				int i_1414_ = i_1404_ * i_1398_ + 8192 >> 14;
				int i_1415_ = i_1405_ * i_1399_ + 8192 >> 14;
				int i_1416_ = i_1406_ * i_1400_ + 8192 >> 14;
				i_1414_ += i_1410_;
				i_1415_ += i_1411_;
				i_1416_ += i_1412_;
				int[] is_1417_ = new int[9];
				for (int i_1418_ = 0; i_1418_ < 3; i_1418_++) {
					for (int i_1419_ = 0; i_1419_ < 3; i_1419_++) {
						int i_1420_ = 0;
						for (int i_1421_ = 0; i_1421_ < 3; i_1421_++)
							i_1420_ += (is_1299_[i_1418_ * 3 + i_1421_] * is_1413_[i_1419_ + i_1421_ * 3]);
						is_1417_[i_1418_ * 3 + i_1419_] = i_1420_ + 8192 >> 14;
					}
				}
				int i_1422_ = ((is_1299_[0] * i_1414_ + is_1299_[1] * i_1415_ + is_1299_[2] * i_1416_ + 8192) >> 14);
				int i_1423_ = ((is_1299_[3] * i_1414_ + is_1299_[4] * i_1415_ + is_1299_[5] * i_1416_ + 8192) >> 14);
				int i_1424_ = ((is_1299_[6] * i_1414_ + is_1299_[7] * i_1415_ + is_1299_[8] * i_1416_ + 8192) >> 14);
				i_1422_ += i_1395_;
				i_1423_ += i_1396_;
				i_1424_ += i_1397_;
				for (int i_1425_ = 0; i_1425_ < i_1300_; i_1425_++) {
					int i_1426_ = is[i_1425_];
					if (i_1426_ < anIntArrayArray9306.length) {
						int[] is_1427_ = anIntArrayArray9306[i_1426_];
						for (int i_1428_ = 0; i_1428_ < is_1427_.length; i_1428_++) {
							int i_1429_ = is_1427_[i_1428_];
							if (aShortArray9307 == null || (i_1298_ & aShortArray9307[i_1429_]) != 0) {
								int i_1430_ = ((is_1417_[0] * anIntArray9352[i_1429_] + is_1417_[1] * anIntArray9360[i_1429_] + is_1417_[2] * anIntArray9362[i_1429_] + 8192) >> 14);
								int i_1431_ = ((is_1417_[3] * anIntArray9352[i_1429_] + is_1417_[4] * anIntArray9360[i_1429_] + is_1417_[5] * anIntArray9362[i_1429_] + 8192) >> 14);
								int i_1432_ = ((is_1417_[6] * anIntArray9352[i_1429_] + is_1417_[7] * anIntArray9360[i_1429_] + is_1417_[8] * anIntArray9362[i_1429_] + 8192) >> 14);
								i_1430_ += i_1422_;
								i_1431_ += i_1423_;
								i_1432_ += i_1424_;
								anIntArray9352[i_1429_] = i_1430_;
								anIntArray9360[i_1429_] = i_1431_;
								anIntArray9362[i_1429_] = i_1432_;
							}
						}
					}
				}
			} else {
				for (int i_1433_ = 0; i_1433_ < i_1300_; i_1433_++) {
					int i_1434_ = is[i_1433_];
					if (i_1434_ < anIntArrayArray9306.length) {
						int[] is_1435_ = anIntArrayArray9306[i_1434_];
						for (int i_1436_ = 0; i_1436_ < is_1435_.length; i_1436_++) {
							int i_1437_ = is_1435_[i_1436_];
							if (aShortArray9307 == null || (i_1298_ & aShortArray9307[i_1437_]) != 0) {
								anIntArray9352[i_1437_] -= anInt9357;
								anIntArray9360[i_1437_] -= anInt9367;
								anIntArray9362[i_1437_] -= anInt9353;
								anIntArray9352[i_1437_] = anIntArray9352[i_1437_] * i_1295_ >> 7;
								anIntArray9360[i_1437_] = anIntArray9360[i_1437_] * i_1296_ >> 7;
								anIntArray9362[i_1437_] = anIntArray9362[i_1437_] * i_1297_ >> 7;
								anIntArray9352[i_1437_] += anInt9357;
								anIntArray9360[i_1437_] += anInt9367;
								anIntArray9362[i_1437_] += anInt9353;
							}
						}
					}
				}
			}
		} else if (i == 5) {
			if (anIntArrayArray9310 != null) {
				boolean bool_1438_ = false;
				for (int i_1439_ = 0; i_1439_ < i_1300_; i_1439_++) {
					int i_1440_ = is[i_1439_];
					if (i_1440_ < anIntArrayArray9310.length) {
						int[] is_1441_ = anIntArrayArray9310[i_1440_];
						for (int i_1442_ = 0; i_1442_ < is_1441_.length; i_1442_++) {
							int i_1443_ = is_1441_[i_1442_];
							if (aShortArray9327 == null || (i_1298_ & aShortArray9327[i_1443_]) != 0) {
								int i_1444_ = ((aByteArray9321[i_1443_] & 0xff) + i_1295_ * 8);
								if (i_1444_ < 0)
									i_1444_ = 0;
								else if (i_1444_ > 255)
									i_1444_ = 255;
								aByteArray9321[i_1443_] = (byte) i_1444_;
							}
						}
						bool_1438_ = bool_1438_ | is_1441_.length > 0;
					}
				}
				if (bool_1438_) {
					if (aClass361Array9356 != null) {
						for (int i_1445_ = 0; i_1445_ < anInt9355; i_1445_++) {
							Class361 class361 = aClass361Array9356[i_1445_];
							Class354 class354 = aClass354Array9347[i_1445_];
							class354.anInt3804 = (class354.anInt3804 & 0xffffff | 255 - (aByteArray9321[class361.anInt3841] & 0xff) << 24);
						}
					}
					method14751();
				}
			}
		} else if (i == 7) {
			if (anIntArrayArray9310 != null) {
				boolean bool_1446_ = false;
				for (int i_1447_ = 0; i_1447_ < i_1300_; i_1447_++) {
					int i_1448_ = is[i_1447_];
					if (i_1448_ < anIntArrayArray9310.length) {
						int[] is_1449_ = anIntArrayArray9310[i_1448_];
						for (int i_1450_ = 0; i_1450_ < is_1449_.length; i_1450_++) {
							int i_1451_ = is_1449_[i_1450_];
							if (aShortArray9327 == null || (i_1298_ & aShortArray9327[i_1451_]) != 0) {
								int i_1452_ = aShortArray9326[i_1451_] & 0xffff;
								int i_1453_ = i_1452_ >> 10 & 0x3f;
								int i_1454_ = i_1452_ >> 7 & 0x7;
								int i_1455_ = i_1452_ & 0x7f;
								i_1453_ = i_1453_ + i_1295_ & 0x3f;
								i_1454_ += i_1296_ / 4;
								if (i_1454_ < 0)
									i_1454_ = 0;
								else if (i_1454_ > 7)
									i_1454_ = 7;
								i_1455_ += i_1297_;
								if (i_1455_ < 0)
									i_1455_ = 0;
								else if (i_1455_ > 127)
									i_1455_ = 127;
								aShortArray9326[i_1451_] = (short) (i_1453_ << 10 | i_1454_ << 7 | i_1455_);
							}
						}
						bool_1446_ = bool_1446_ | is_1449_.length > 0;
					}
				}
				if (bool_1446_) {
					if (aClass361Array9356 != null) {
						for (int i_1456_ = 0; i_1456_ < anInt9355; i_1456_++) {
							Class361 class361 = aClass361Array9356[i_1456_];
							Class354 class354 = aClass354Array9347[i_1456_];
							class354.anInt3804 = (class354.anInt3804 & ~0xffffff | (Class656.anIntArray8390[(aShortArray9326[class361.anInt3841] & 0xffff)]) & 0xffffff);
						}
					}
					method14751();
				}
			}
		} else if (i == 8) {
			if (anIntArrayArray9329 != null) {
				for (int i_1457_ = 0; i_1457_ < i_1300_; i_1457_++) {
					int i_1458_ = is[i_1457_];
					if (i_1458_ < anIntArrayArray9329.length) {
						int[] is_1459_ = anIntArrayArray9329[i_1458_];
						for (int i_1460_ = 0; i_1460_ < is_1459_.length; i_1460_++) {
							Class354 class354 = aClass354Array9347[is_1459_[i_1460_]];
							class354.anInt3807 += i_1295_;
							class354.anInt3806 += i_1296_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (anIntArrayArray9329 != null) {
				for (int i_1461_ = 0; i_1461_ < i_1300_; i_1461_++) {
					int i_1462_ = is[i_1461_];
					if (i_1462_ < anIntArrayArray9329.length) {
						int[] is_1463_ = anIntArrayArray9329[i_1462_];
						for (int i_1464_ = 0; i_1464_ < is_1463_.length; i_1464_++) {
							Class354 class354 = aClass354Array9347[is_1463_[i_1464_]];
							class354.anInt3805 = class354.anInt3805 * i_1295_ >> 7;
							class354.anInt3808 = class354.anInt3808 * i_1296_ >> 7;
						}
					}
				}
			}
		} else if (i == 9) {
			if (anIntArrayArray9329 != null) {
				for (int i_1465_ = 0; i_1465_ < i_1300_; i_1465_++) {
					int i_1466_ = is[i_1465_];
					if (i_1466_ < anIntArrayArray9329.length) {
						int[] is_1467_ = anIntArrayArray9329[i_1466_];
						for (int i_1468_ = 0; i_1468_ < is_1467_.length; i_1468_++) {
							Class354 class354 = aClass354Array9347[is_1467_[i_1468_]];
							class354.anInt3809 = class354.anInt3809 + i_1295_ & 0x3fff;
						}
					}
				}
			}
		}
	}

	void method2956(int i, int[] is, int i_1469_, int i_1470_, int i_1471_, boolean bool, int i_1472_, int[] is_1473_) {
		int i_1474_ = is.length;
		if (i == 0) {
			i_1469_ <<= 4;
			i_1470_ <<= 4;
			i_1471_ <<= 4;
			int i_1475_ = 0;
			anInt9357 = 0;
			anInt9367 = 0;
			anInt9353 = 0;
			for (int i_1476_ = 0; i_1476_ < i_1474_; i_1476_++) {
				int i_1477_ = is[i_1476_];
				if (i_1477_ < anIntArrayArray9306.length) {
					int[] is_1478_ = anIntArrayArray9306[i_1477_];
					for (int i_1479_ = 0; i_1479_ < is_1478_.length; i_1479_++) {
						int i_1480_ = is_1478_[i_1479_];
						if (aShortArray9307 == null || (i_1472_ & aShortArray9307[i_1480_]) != 0) {
							anInt9357 += anIntArray9352[i_1480_];
							anInt9367 += anIntArray9360[i_1480_];
							anInt9353 += anIntArray9362[i_1480_];
							i_1475_++;
						}
					}
				}
			}
			if (i_1475_ > 0) {
				anInt9357 = anInt9357 / i_1475_ + i_1469_;
				anInt9367 = anInt9367 / i_1475_ + i_1470_;
				anInt9353 = anInt9353 / i_1475_ + i_1471_;
				aBool9328 = true;
			} else {
				anInt9357 = i_1469_;
				anInt9367 = i_1470_;
				anInt9353 = i_1471_;
			}
		} else if (i == 1) {
			if (is_1473_ != null) {
				int i_1481_ = ((is_1473_[0] * i_1469_ + is_1473_[1] * i_1470_ + is_1473_[2] * i_1471_ + 8192) >> 14);
				int i_1482_ = ((is_1473_[3] * i_1469_ + is_1473_[4] * i_1470_ + is_1473_[5] * i_1471_ + 8192) >> 14);
				int i_1483_ = ((is_1473_[6] * i_1469_ + is_1473_[7] * i_1470_ + is_1473_[8] * i_1471_ + 8192) >> 14);
				i_1469_ = i_1481_;
				i_1470_ = i_1482_;
				i_1471_ = i_1483_;
			}
			i_1469_ <<= 4;
			i_1470_ <<= 4;
			i_1471_ <<= 4;
			for (int i_1484_ = 0; i_1484_ < i_1474_; i_1484_++) {
				int i_1485_ = is[i_1484_];
				if (i_1485_ < anIntArrayArray9306.length) {
					int[] is_1486_ = anIntArrayArray9306[i_1485_];
					for (int i_1487_ = 0; i_1487_ < is_1486_.length; i_1487_++) {
						int i_1488_ = is_1486_[i_1487_];
						if (aShortArray9307 == null || (i_1472_ & aShortArray9307[i_1488_]) != 0) {
							anIntArray9352[i_1488_] += i_1469_;
							anIntArray9360[i_1488_] += i_1470_;
							anIntArray9362[i_1488_] += i_1471_;
						}
					}
				}
			}
		} else if (i == 2) {
			if (is_1473_ != null) {
				int i_1489_ = is_1473_[9] << 4;
				int i_1490_ = is_1473_[10] << 4;
				int i_1491_ = is_1473_[11] << 4;
				int i_1492_ = is_1473_[12] << 4;
				int i_1493_ = is_1473_[13] << 4;
				int i_1494_ = is_1473_[14] << 4;
				if (aBool9328) {
					int i_1495_ = ((is_1473_[0] * anInt9357 + is_1473_[3] * anInt9367 + is_1473_[6] * anInt9353 + 8192) >> 14);
					int i_1496_ = ((is_1473_[1] * anInt9357 + is_1473_[4] * anInt9367 + is_1473_[7] * anInt9353 + 8192) >> 14);
					int i_1497_ = ((is_1473_[2] * anInt9357 + is_1473_[5] * anInt9367 + is_1473_[8] * anInt9353 + 8192) >> 14);
					i_1495_ += i_1492_;
					i_1496_ += i_1493_;
					i_1497_ += i_1494_;
					anInt9357 = i_1495_;
					anInt9367 = i_1496_;
					anInt9353 = i_1497_;
					aBool9328 = false;
				}
				int[] is_1498_ = new int[9];
				int i_1499_ = Class428.anIntArray4819[i_1469_];
				int i_1500_ = Class428.anIntArray4825[i_1469_];
				int i_1501_ = Class428.anIntArray4819[i_1470_];
				int i_1502_ = Class428.anIntArray4825[i_1470_];
				int i_1503_ = Class428.anIntArray4819[i_1471_];
				int i_1504_ = Class428.anIntArray4825[i_1471_];
				int i_1505_ = i_1500_ * i_1503_ + 8192 >> 14;
				int i_1506_ = i_1500_ * i_1504_ + 8192 >> 14;
				is_1498_[0] = i_1501_ * i_1503_ + i_1502_ * i_1506_ + 8192 >> 14;
				is_1498_[1] = -i_1501_ * i_1504_ + i_1502_ * i_1505_ + 8192 >> 14;
				is_1498_[2] = i_1502_ * i_1499_ + 8192 >> 14;
				is_1498_[3] = i_1499_ * i_1504_ + 8192 >> 14;
				is_1498_[4] = i_1499_ * i_1503_ + 8192 >> 14;
				is_1498_[5] = -i_1500_;
				is_1498_[6] = -i_1502_ * i_1503_ + i_1501_ * i_1506_ + 8192 >> 14;
				is_1498_[7] = i_1502_ * i_1504_ + i_1501_ * i_1505_ + 8192 >> 14;
				is_1498_[8] = i_1501_ * i_1499_ + 8192 >> 14;
				int i_1507_ = ((is_1498_[0] * -anInt9357 + is_1498_[1] * -anInt9367 + is_1498_[2] * -anInt9353 + 8192) >> 14);
				int i_1508_ = ((is_1498_[3] * -anInt9357 + is_1498_[4] * -anInt9367 + is_1498_[5] * -anInt9353 + 8192) >> 14);
				int i_1509_ = ((is_1498_[6] * -anInt9357 + is_1498_[7] * -anInt9367 + is_1498_[8] * -anInt9353 + 8192) >> 14);
				int i_1510_ = i_1507_ + anInt9357;
				int i_1511_ = i_1508_ + anInt9367;
				int i_1512_ = i_1509_ + anInt9353;
				int[] is_1513_ = new int[9];
				for (int i_1514_ = 0; i_1514_ < 3; i_1514_++) {
					for (int i_1515_ = 0; i_1515_ < 3; i_1515_++) {
						int i_1516_ = 0;
						for (int i_1517_ = 0; i_1517_ < 3; i_1517_++)
							i_1516_ += (is_1498_[i_1514_ * 3 + i_1517_] * is_1473_[i_1515_ * 3 + i_1517_]);
						is_1513_[i_1514_ * 3 + i_1515_] = i_1516_ + 8192 >> 14;
					}
				}
				int i_1518_ = ((is_1498_[0] * i_1492_ + is_1498_[1] * i_1493_ + is_1498_[2] * i_1494_ + 8192) >> 14);
				int i_1519_ = ((is_1498_[3] * i_1492_ + is_1498_[4] * i_1493_ + is_1498_[5] * i_1494_ + 8192) >> 14);
				int i_1520_ = ((is_1498_[6] * i_1492_ + is_1498_[7] * i_1493_ + is_1498_[8] * i_1494_ + 8192) >> 14);
				i_1518_ += i_1510_;
				i_1519_ += i_1511_;
				i_1520_ += i_1512_;
				int[] is_1521_ = new int[9];
				for (int i_1522_ = 0; i_1522_ < 3; i_1522_++) {
					for (int i_1523_ = 0; i_1523_ < 3; i_1523_++) {
						int i_1524_ = 0;
						for (int i_1525_ = 0; i_1525_ < 3; i_1525_++)
							i_1524_ += (is_1473_[i_1522_ * 3 + i_1525_] * is_1513_[i_1523_ + i_1525_ * 3]);
						is_1521_[i_1522_ * 3 + i_1523_] = i_1524_ + 8192 >> 14;
					}
				}
				int i_1526_ = ((is_1473_[0] * i_1518_ + is_1473_[1] * i_1519_ + is_1473_[2] * i_1520_ + 8192) >> 14);
				int i_1527_ = ((is_1473_[3] * i_1518_ + is_1473_[4] * i_1519_ + is_1473_[5] * i_1520_ + 8192) >> 14);
				int i_1528_ = ((is_1473_[6] * i_1518_ + is_1473_[7] * i_1519_ + is_1473_[8] * i_1520_ + 8192) >> 14);
				i_1526_ += i_1489_;
				i_1527_ += i_1490_;
				i_1528_ += i_1491_;
				for (int i_1529_ = 0; i_1529_ < i_1474_; i_1529_++) {
					int i_1530_ = is[i_1529_];
					if (i_1530_ < anIntArrayArray9306.length) {
						int[] is_1531_ = anIntArrayArray9306[i_1530_];
						for (int i_1532_ = 0; i_1532_ < is_1531_.length; i_1532_++) {
							int i_1533_ = is_1531_[i_1532_];
							if (aShortArray9307 == null || (i_1472_ & aShortArray9307[i_1533_]) != 0) {
								int i_1534_ = ((is_1521_[0] * anIntArray9352[i_1533_] + is_1521_[1] * anIntArray9360[i_1533_] + is_1521_[2] * anIntArray9362[i_1533_] + 8192) >> 14);
								int i_1535_ = ((is_1521_[3] * anIntArray9352[i_1533_] + is_1521_[4] * anIntArray9360[i_1533_] + is_1521_[5] * anIntArray9362[i_1533_] + 8192) >> 14);
								int i_1536_ = ((is_1521_[6] * anIntArray9352[i_1533_] + is_1521_[7] * anIntArray9360[i_1533_] + is_1521_[8] * anIntArray9362[i_1533_] + 8192) >> 14);
								i_1534_ += i_1526_;
								i_1535_ += i_1527_;
								i_1536_ += i_1528_;
								anIntArray9352[i_1533_] = i_1534_;
								anIntArray9360[i_1533_] = i_1535_;
								anIntArray9362[i_1533_] = i_1536_;
							}
						}
					}
				}
			} else {
				for (int i_1537_ = 0; i_1537_ < i_1474_; i_1537_++) {
					int i_1538_ = is[i_1537_];
					if (i_1538_ < anIntArrayArray9306.length) {
						int[] is_1539_ = anIntArrayArray9306[i_1538_];
						for (int i_1540_ = 0; i_1540_ < is_1539_.length; i_1540_++) {
							int i_1541_ = is_1539_[i_1540_];
							if (aShortArray9307 == null || (i_1472_ & aShortArray9307[i_1541_]) != 0) {
								anIntArray9352[i_1541_] -= anInt9357;
								anIntArray9360[i_1541_] -= anInt9367;
								anIntArray9362[i_1541_] -= anInt9353;
								if (i_1471_ != 0) {
									int i_1542_ = Class428.anIntArray4825[i_1471_];
									int i_1543_ = Class428.anIntArray4819[i_1471_];
									int i_1544_ = ((anIntArray9360[i_1541_] * i_1542_ + anIntArray9352[i_1541_] * i_1543_ + 16383) >> 14);
									anIntArray9360[i_1541_] = (anIntArray9360[i_1541_] * i_1543_ - anIntArray9352[i_1541_] * i_1542_ + 16383) >> 14;
									anIntArray9352[i_1541_] = i_1544_;
								}
								if (i_1469_ != 0) {
									int i_1545_ = Class428.anIntArray4825[i_1469_];
									int i_1546_ = Class428.anIntArray4819[i_1469_];
									int i_1547_ = ((anIntArray9360[i_1541_] * i_1546_ - anIntArray9362[i_1541_] * i_1545_ + 16383) >> 14);
									anIntArray9362[i_1541_] = (anIntArray9360[i_1541_] * i_1545_ + anIntArray9362[i_1541_] * i_1546_ + 16383) >> 14;
									anIntArray9360[i_1541_] = i_1547_;
								}
								if (i_1470_ != 0) {
									int i_1548_ = Class428.anIntArray4825[i_1470_];
									int i_1549_ = Class428.anIntArray4819[i_1470_];
									int i_1550_ = ((anIntArray9362[i_1541_] * i_1548_ + anIntArray9352[i_1541_] * i_1549_ + 16383) >> 14);
									anIntArray9362[i_1541_] = (anIntArray9362[i_1541_] * i_1549_ - anIntArray9352[i_1541_] * i_1548_ + 16383) >> 14;
									anIntArray9352[i_1541_] = i_1550_;
								}
								anIntArray9352[i_1541_] += anInt9357;
								anIntArray9360[i_1541_] += anInt9367;
								anIntArray9362[i_1541_] += anInt9353;
							}
						}
					}
				}
				if (bool) {
					for (int i_1551_ = 0; i_1551_ < i_1474_; i_1551_++) {
						int i_1552_ = is[i_1551_];
						if (i_1552_ < anIntArrayArray9306.length) {
							int[] is_1553_ = anIntArrayArray9306[i_1552_];
							for (int i_1554_ = 0; i_1554_ < is_1553_.length; i_1554_++) {
								int i_1555_ = is_1553_[i_1554_];
								if (aShortArray9307 == null || ((i_1472_ & aShortArray9307[i_1555_]) != 0)) {
									int i_1556_ = anIntArray9351[i_1555_];
									int i_1557_ = anIntArray9351[i_1555_ + 1];
									for (int i_1558_ = i_1556_; (i_1558_ < i_1557_ && aShortArray9366[i_1558_] != 0); i_1558_++) {
										int i_1559_ = (aShortArray9366[i_1558_] & 0xffff) - 1;
										if (i_1471_ != 0) {
											int i_1560_ = (Class428.anIntArray4825[i_1471_]);
											int i_1561_ = (Class428.anIntArray4819[i_1471_]);
											int i_1562_ = (((aShortArray9305[i_1559_] * i_1560_) + (aShortArray9311[i_1559_] * i_1561_) + 16383) >> 14);
											aShortArray9305[i_1559_] = (short) ((((aShortArray9305[i_1559_]) * i_1561_) - ((aShortArray9311[i_1559_]) * i_1560_) + 16383) >> 14);
											aShortArray9311[i_1559_] = (short) i_1562_;
										}
										if (i_1469_ != 0) {
											int i_1563_ = (Class428.anIntArray4825[i_1469_]);
											int i_1564_ = (Class428.anIntArray4819[i_1469_]);
											int i_1565_ = (((aShortArray9305[i_1559_] * i_1564_) - (aShortArray9313[i_1559_] * i_1563_) + 16383) >> 14);
											aShortArray9313[i_1559_] = (short) ((((aShortArray9305[i_1559_]) * i_1563_) + ((aShortArray9313[i_1559_]) * i_1564_) + 16383) >> 14);
											aShortArray9305[i_1559_] = (short) i_1565_;
										}
										if (i_1470_ != 0) {
											int i_1566_ = (Class428.anIntArray4825[i_1470_]);
											int i_1567_ = (Class428.anIntArray4819[i_1470_]);
											int i_1568_ = (((aShortArray9313[i_1559_] * i_1566_) + (aShortArray9311[i_1559_] * i_1567_) + 16383) >> 14);
											aShortArray9313[i_1559_] = (short) ((((aShortArray9313[i_1559_]) * i_1567_) - ((aShortArray9311[i_1559_]) * i_1566_) + 16383) >> 14);
											aShortArray9311[i_1559_] = (short) i_1568_;
										}
									}
								}
							}
						}
					}
					method14752();
				}
			}
		} else if (i == 3) {
			if (is_1473_ != null) {
				int i_1569_ = is_1473_[9] << 4;
				int i_1570_ = is_1473_[10] << 4;
				int i_1571_ = is_1473_[11] << 4;
				int i_1572_ = is_1473_[12] << 4;
				int i_1573_ = is_1473_[13] << 4;
				int i_1574_ = is_1473_[14] << 4;
				if (aBool9328) {
					int i_1575_ = ((is_1473_[0] * anInt9357 + is_1473_[3] * anInt9367 + is_1473_[6] * anInt9353 + 8192) >> 14);
					int i_1576_ = ((is_1473_[1] * anInt9357 + is_1473_[4] * anInt9367 + is_1473_[7] * anInt9353 + 8192) >> 14);
					int i_1577_ = ((is_1473_[2] * anInt9357 + is_1473_[5] * anInt9367 + is_1473_[8] * anInt9353 + 8192) >> 14);
					i_1575_ += i_1572_;
					i_1576_ += i_1573_;
					i_1577_ += i_1574_;
					anInt9357 = i_1575_;
					anInt9367 = i_1576_;
					anInt9353 = i_1577_;
					aBool9328 = false;
				}
				int i_1578_ = i_1469_ << 15 >> 7;
				int i_1579_ = i_1470_ << 15 >> 7;
				int i_1580_ = i_1471_ << 15 >> 7;
				int i_1581_ = i_1578_ * -anInt9357 + 8192 >> 14;
				int i_1582_ = i_1579_ * -anInt9367 + 8192 >> 14;
				int i_1583_ = i_1580_ * -anInt9353 + 8192 >> 14;
				int i_1584_ = i_1581_ + anInt9357;
				int i_1585_ = i_1582_ + anInt9367;
				int i_1586_ = i_1583_ + anInt9353;
				int[] is_1587_ = new int[9];
				is_1587_[0] = i_1578_ * is_1473_[0] + 8192 >> 14;
				is_1587_[1] = i_1578_ * is_1473_[3] + 8192 >> 14;
				is_1587_[2] = i_1578_ * is_1473_[6] + 8192 >> 14;
				is_1587_[3] = i_1579_ * is_1473_[1] + 8192 >> 14;
				is_1587_[4] = i_1579_ * is_1473_[4] + 8192 >> 14;
				is_1587_[5] = i_1579_ * is_1473_[7] + 8192 >> 14;
				is_1587_[6] = i_1580_ * is_1473_[2] + 8192 >> 14;
				is_1587_[7] = i_1580_ * is_1473_[5] + 8192 >> 14;
				is_1587_[8] = i_1580_ * is_1473_[8] + 8192 >> 14;
				int i_1588_ = i_1578_ * i_1572_ + 8192 >> 14;
				int i_1589_ = i_1579_ * i_1573_ + 8192 >> 14;
				int i_1590_ = i_1580_ * i_1574_ + 8192 >> 14;
				i_1588_ += i_1584_;
				i_1589_ += i_1585_;
				i_1590_ += i_1586_;
				int[] is_1591_ = new int[9];
				for (int i_1592_ = 0; i_1592_ < 3; i_1592_++) {
					for (int i_1593_ = 0; i_1593_ < 3; i_1593_++) {
						int i_1594_ = 0;
						for (int i_1595_ = 0; i_1595_ < 3; i_1595_++)
							i_1594_ += (is_1473_[i_1592_ * 3 + i_1595_] * is_1587_[i_1593_ + i_1595_ * 3]);
						is_1591_[i_1592_ * 3 + i_1593_] = i_1594_ + 8192 >> 14;
					}
				}
				int i_1596_ = ((is_1473_[0] * i_1588_ + is_1473_[1] * i_1589_ + is_1473_[2] * i_1590_ + 8192) >> 14);
				int i_1597_ = ((is_1473_[3] * i_1588_ + is_1473_[4] * i_1589_ + is_1473_[5] * i_1590_ + 8192) >> 14);
				int i_1598_ = ((is_1473_[6] * i_1588_ + is_1473_[7] * i_1589_ + is_1473_[8] * i_1590_ + 8192) >> 14);
				i_1596_ += i_1569_;
				i_1597_ += i_1570_;
				i_1598_ += i_1571_;
				for (int i_1599_ = 0; i_1599_ < i_1474_; i_1599_++) {
					int i_1600_ = is[i_1599_];
					if (i_1600_ < anIntArrayArray9306.length) {
						int[] is_1601_ = anIntArrayArray9306[i_1600_];
						for (int i_1602_ = 0; i_1602_ < is_1601_.length; i_1602_++) {
							int i_1603_ = is_1601_[i_1602_];
							if (aShortArray9307 == null || (i_1472_ & aShortArray9307[i_1603_]) != 0) {
								int i_1604_ = ((is_1591_[0] * anIntArray9352[i_1603_] + is_1591_[1] * anIntArray9360[i_1603_] + is_1591_[2] * anIntArray9362[i_1603_] + 8192) >> 14);
								int i_1605_ = ((is_1591_[3] * anIntArray9352[i_1603_] + is_1591_[4] * anIntArray9360[i_1603_] + is_1591_[5] * anIntArray9362[i_1603_] + 8192) >> 14);
								int i_1606_ = ((is_1591_[6] * anIntArray9352[i_1603_] + is_1591_[7] * anIntArray9360[i_1603_] + is_1591_[8] * anIntArray9362[i_1603_] + 8192) >> 14);
								i_1604_ += i_1596_;
								i_1605_ += i_1597_;
								i_1606_ += i_1598_;
								anIntArray9352[i_1603_] = i_1604_;
								anIntArray9360[i_1603_] = i_1605_;
								anIntArray9362[i_1603_] = i_1606_;
							}
						}
					}
				}
			} else {
				for (int i_1607_ = 0; i_1607_ < i_1474_; i_1607_++) {
					int i_1608_ = is[i_1607_];
					if (i_1608_ < anIntArrayArray9306.length) {
						int[] is_1609_ = anIntArrayArray9306[i_1608_];
						for (int i_1610_ = 0; i_1610_ < is_1609_.length; i_1610_++) {
							int i_1611_ = is_1609_[i_1610_];
							if (aShortArray9307 == null || (i_1472_ & aShortArray9307[i_1611_]) != 0) {
								anIntArray9352[i_1611_] -= anInt9357;
								anIntArray9360[i_1611_] -= anInt9367;
								anIntArray9362[i_1611_] -= anInt9353;
								anIntArray9352[i_1611_] = anIntArray9352[i_1611_] * i_1469_ >> 7;
								anIntArray9360[i_1611_] = anIntArray9360[i_1611_] * i_1470_ >> 7;
								anIntArray9362[i_1611_] = anIntArray9362[i_1611_] * i_1471_ >> 7;
								anIntArray9352[i_1611_] += anInt9357;
								anIntArray9360[i_1611_] += anInt9367;
								anIntArray9362[i_1611_] += anInt9353;
							}
						}
					}
				}
			}
		} else if (i == 5) {
			if (anIntArrayArray9310 != null) {
				boolean bool_1612_ = false;
				for (int i_1613_ = 0; i_1613_ < i_1474_; i_1613_++) {
					int i_1614_ = is[i_1613_];
					if (i_1614_ < anIntArrayArray9310.length) {
						int[] is_1615_ = anIntArrayArray9310[i_1614_];
						for (int i_1616_ = 0; i_1616_ < is_1615_.length; i_1616_++) {
							int i_1617_ = is_1615_[i_1616_];
							if (aShortArray9327 == null || (i_1472_ & aShortArray9327[i_1617_]) != 0) {
								int i_1618_ = ((aByteArray9321[i_1617_] & 0xff) + i_1469_ * 8);
								if (i_1618_ < 0)
									i_1618_ = 0;
								else if (i_1618_ > 255)
									i_1618_ = 255;
								aByteArray9321[i_1617_] = (byte) i_1618_;
							}
						}
						bool_1612_ = bool_1612_ | is_1615_.length > 0;
					}
				}
				if (bool_1612_) {
					if (aClass361Array9356 != null) {
						for (int i_1619_ = 0; i_1619_ < anInt9355; i_1619_++) {
							Class361 class361 = aClass361Array9356[i_1619_];
							Class354 class354 = aClass354Array9347[i_1619_];
							class354.anInt3804 = (class354.anInt3804 & 0xffffff | 255 - (aByteArray9321[class361.anInt3841] & 0xff) << 24);
						}
					}
					method14751();
				}
			}
		} else if (i == 7) {
			if (anIntArrayArray9310 != null) {
				boolean bool_1620_ = false;
				for (int i_1621_ = 0; i_1621_ < i_1474_; i_1621_++) {
					int i_1622_ = is[i_1621_];
					if (i_1622_ < anIntArrayArray9310.length) {
						int[] is_1623_ = anIntArrayArray9310[i_1622_];
						for (int i_1624_ = 0; i_1624_ < is_1623_.length; i_1624_++) {
							int i_1625_ = is_1623_[i_1624_];
							if (aShortArray9327 == null || (i_1472_ & aShortArray9327[i_1625_]) != 0) {
								int i_1626_ = aShortArray9326[i_1625_] & 0xffff;
								int i_1627_ = i_1626_ >> 10 & 0x3f;
								int i_1628_ = i_1626_ >> 7 & 0x7;
								int i_1629_ = i_1626_ & 0x7f;
								i_1627_ = i_1627_ + i_1469_ & 0x3f;
								i_1628_ += i_1470_ / 4;
								if (i_1628_ < 0)
									i_1628_ = 0;
								else if (i_1628_ > 7)
									i_1628_ = 7;
								i_1629_ += i_1471_;
								if (i_1629_ < 0)
									i_1629_ = 0;
								else if (i_1629_ > 127)
									i_1629_ = 127;
								aShortArray9326[i_1625_] = (short) (i_1627_ << 10 | i_1628_ << 7 | i_1629_);
							}
						}
						bool_1620_ = bool_1620_ | is_1623_.length > 0;
					}
				}
				if (bool_1620_) {
					if (aClass361Array9356 != null) {
						for (int i_1630_ = 0; i_1630_ < anInt9355; i_1630_++) {
							Class361 class361 = aClass361Array9356[i_1630_];
							Class354 class354 = aClass354Array9347[i_1630_];
							class354.anInt3804 = (class354.anInt3804 & ~0xffffff | (Class656.anIntArray8390[(aShortArray9326[class361.anInt3841] & 0xffff)]) & 0xffffff);
						}
					}
					method14751();
				}
			}
		} else if (i == 8) {
			if (anIntArrayArray9329 != null) {
				for (int i_1631_ = 0; i_1631_ < i_1474_; i_1631_++) {
					int i_1632_ = is[i_1631_];
					if (i_1632_ < anIntArrayArray9329.length) {
						int[] is_1633_ = anIntArrayArray9329[i_1632_];
						for (int i_1634_ = 0; i_1634_ < is_1633_.length; i_1634_++) {
							Class354 class354 = aClass354Array9347[is_1633_[i_1634_]];
							class354.anInt3807 += i_1469_;
							class354.anInt3806 += i_1470_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (anIntArrayArray9329 != null) {
				for (int i_1635_ = 0; i_1635_ < i_1474_; i_1635_++) {
					int i_1636_ = is[i_1635_];
					if (i_1636_ < anIntArrayArray9329.length) {
						int[] is_1637_ = anIntArrayArray9329[i_1636_];
						for (int i_1638_ = 0; i_1638_ < is_1637_.length; i_1638_++) {
							Class354 class354 = aClass354Array9347[is_1637_[i_1638_]];
							class354.anInt3805 = class354.anInt3805 * i_1469_ >> 7;
							class354.anInt3808 = class354.anInt3808 * i_1470_ >> 7;
						}
					}
				}
			}
		} else if (i == 9) {
			if (anIntArrayArray9329 != null) {
				for (int i_1639_ = 0; i_1639_ < i_1474_; i_1639_++) {
					int i_1640_ = is[i_1639_];
					if (i_1640_ < anIntArrayArray9329.length) {
						int[] is_1641_ = anIntArrayArray9329[i_1640_];
						for (int i_1642_ = 0; i_1642_ < is_1641_.length; i_1642_++) {
							Class354 class354 = aClass354Array9347[is_1641_[i_1642_]];
							class354.anInt3809 = class354.anInt3809 + i_1469_ & 0x3fff;
						}
					}
				}
			}
		}
	}

	static short[] method14773(short[] is, int i) {
		short[] is_1643_ = new short[i];
		System.arraycopy(is, 0, is_1643_, 0, i);
		return is_1643_;
	}

	public void method2903(int i) {
		aShort9300 = (short) i;
		method14759();
		method14752();
	}

	public boolean method2923(int i, int i_1644_, Class432 class432, boolean bool, int i_1645_) {
		return method14761(i, i_1644_, 0, 0, class432, bool, i_1645_);
	}

	public Class176 method2862(byte i, int i_1646_, boolean bool) {
		boolean bool_1647_ = false;
		Class176_Sub3 class176_sub3_1648_;
		Class176_Sub3 class176_sub3_1649_;
		if (i > 0 && i <= 8) {
			class176_sub3_1649_ = aClass180_Sub2_9296.aClass176_Sub3Array9600[i - 1];
			class176_sub3_1648_ = aClass180_Sub2_9296.aClass176_Sub3Array9599[i - 1];
			bool_1647_ = true;
		} else
			class176_sub3_1648_ = class176_sub3_1649_ = new Class176_Sub3(aClass180_Sub2_9296, 0, 0, true, false);
		return method14810(class176_sub3_1648_, class176_sub3_1649_, i_1646_, bool_1647_, bool);
	}

	public void method2961(Class432 class432) {
		Class427 class427 = aClass180_Sub2_9296.aClass427_9435;
		class427.method6784(class432);
		if (aClass167Array9303 != null) {
			for (int i = 0; i < aClass167Array9303.length; i++) {
				Class167 class167 = aClass167Array9303[i];
				Class167 class167_1650_ = class167;
				if (class167.aClass167_1849 != null)
					class167_1650_ = class167.aClass167_1849;
				class167_1650_.anInt1855 = (int) (class427.aFloatArray4807[12] + ((class427.aFloatArray4807[0] * (float) (anIntArray9352[class167.anInt1851 * -18705907])) + (class427.aFloatArray4807[4] * (float) anIntArray9360[(class167.anInt1851 * -18705907)]) + (class427.aFloatArray4807[8] * (float) (anIntArray9362[(class167.anInt1851 * -18705907)])))) * 1542395015;
				class167_1650_.anInt1856 = ((int) (class427.aFloatArray4807[13] + ((class427.aFloatArray4807[1] * (float) (anIntArray9352[class167.anInt1851 * -18705907])) + (class427.aFloatArray4807[5] * (float) (anIntArray9360[(class167.anInt1851 * -18705907)])) + (class427.aFloatArray4807[9] * (float) (anIntArray9362[(class167.anInt1851 * -18705907)])))) * -1886500927);
				class167_1650_.anInt1860 = ((int) (class427.aFloatArray4807[14] + ((class427.aFloatArray4807[2] * (float) (anIntArray9352[class167.anInt1851 * -18705907])) + (class427.aFloatArray4807[6] * (float) (anIntArray9360[(class167.anInt1851 * -18705907)])) + (class427.aFloatArray4807[10] * (float) (anIntArray9362[(class167.anInt1851 * -18705907)])))) * -1731268533);
				class167_1650_.anInt1858 = ((int) (class427.aFloatArray4807[12] + ((class427.aFloatArray4807[0] * (float) anIntArray9352[(class167.anInt1852 * -1573542389)]) + (class427.aFloatArray4807[4] * (float) (anIntArray9360[(class167.anInt1852 * -1573542389)])) + (class427.aFloatArray4807[8] * (float) (anIntArray9362[(class167.anInt1852 * -1573542389)])))) * -2034723417);
				class167_1650_.anInt1859 = ((int) (class427.aFloatArray4807[13] + ((class427.aFloatArray4807[1] * (float) anIntArray9352[(class167.anInt1852 * -1573542389)]) + (class427.aFloatArray4807[5] * (float) (anIntArray9360[(class167.anInt1852 * -1573542389)])) + (class427.aFloatArray4807[9] * (float) (anIntArray9362[(class167.anInt1852 * -1573542389)])))) * -481732551);
				class167_1650_.anInt1862 = ((int) (class427.aFloatArray4807[14] + ((class427.aFloatArray4807[2] * (float) anIntArray9352[(class167.anInt1852 * -1573542389)]) + (class427.aFloatArray4807[6] * (float) (anIntArray9360[(class167.anInt1852 * -1573542389)])) + (class427.aFloatArray4807[10] * (float) (anIntArray9362[(class167.anInt1852 * -1573542389)])))) * -980787877);
				class167_1650_.anInt1857 = ((int) (class427.aFloatArray4807[12] + ((class427.aFloatArray4807[0] * (float) anIntArray9352[(class167.anInt1853 * -2116684303)]) + (class427.aFloatArray4807[4] * (float) (anIntArray9360[(class167.anInt1853 * -2116684303)])) + (class427.aFloatArray4807[8] * (float) (anIntArray9362[(class167.anInt1853 * -2116684303)])))) * -1482367683);
				class167_1650_.anInt1850 = ((int) (class427.aFloatArray4807[13] + ((class427.aFloatArray4807[1] * (float) anIntArray9352[(class167.anInt1853 * -2116684303)]) + (class427.aFloatArray4807[5] * (float) (anIntArray9360[(class167.anInt1853 * -2116684303)])) + (class427.aFloatArray4807[9] * (float) (anIntArray9362[(class167.anInt1853 * -2116684303)])))) * 1240185219);
				class167_1650_.anInt1863 = ((int) (class427.aFloatArray4807[14] + ((class427.aFloatArray4807[2] * (float) anIntArray9352[(class167.anInt1853 * -2116684303)]) + (class427.aFloatArray4807[6] * (float) (anIntArray9360[(class167.anInt1853 * -2116684303)])) + (class427.aFloatArray4807[10] * (float) (anIntArray9362[(class167.anInt1853 * -2116684303)])))) * -857185851);
			}
		}
		if (aClass159Array9354 != null) {
			for (int i = 0; i < aClass159Array9354.length; i++) {
				Class159 class159 = aClass159Array9354[i];
				Class159 class159_1651_ = class159;
				if (class159.aClass159_1739 != null)
					class159_1651_ = class159.aClass159_1739;
				if (class159.aClass427_1738 != null)
					class159.aClass427_1738.method6750(class427);
				else
					class159.aClass427_1738 = new Class427(class427);
				class159_1651_.anInt1744 = ((int) (class427.aFloatArray4807[12] + ((class427.aFloatArray4807[0] * (float) anIntArray9352[(class159.anInt1740 * -449756941)]) + (class427.aFloatArray4807[4] * (float) (anIntArray9360[(class159.anInt1740 * -449756941)])) + (class427.aFloatArray4807[8] * (float) (anIntArray9362[(class159.anInt1740 * -449756941)])))) * -306739393);
				class159_1651_.anInt1742 = ((int) (class427.aFloatArray4807[13] + ((class427.aFloatArray4807[1] * (float) anIntArray9352[(class159.anInt1740 * -449756941)]) + (class427.aFloatArray4807[5] * (float) (anIntArray9360[(class159.anInt1740 * -449756941)])) + (class427.aFloatArray4807[9] * (float) (anIntArray9362[(class159.anInt1740 * -449756941)])))) * -1995176663);
				class159_1651_.anInt1743 = (int) (class427.aFloatArray4807[14] + ((class427.aFloatArray4807[2] * (float) (anIntArray9352[class159.anInt1740 * -449756941])) + (class427.aFloatArray4807[6] * (float) anIntArray9360[(class159.anInt1740 * -449756941)]) + (class427.aFloatArray4807[10] * (float) (anIntArray9362[(class159.anInt1740 * -449756941)])))) * 76591605;
			}
		}
	}

	public boolean method2958(int i, int i_1652_, Class432 class432, boolean bool, int i_1653_) {
		return method14761(i, i_1652_, 0, 0, class432, bool, i_1653_);
	}

	public Class527_Sub8_Sub8 method2904(Class527_Sub8_Sub8 class527_sub8_sub8) {
		if (anInt9308 == 0)
			return null;
		if (!aBool9304)
			method14754();
		int i;
		int i_1654_;
		if (aClass180_Sub2_9296.anInt9523 > 0) {
			i = (anInt9342 - (anInt9318 * aClass180_Sub2_9296.anInt9523 >> 8) >> aClass180_Sub2_9296.anInt9522);
			i_1654_ = anInt9343 - (anInt9340 * aClass180_Sub2_9296.anInt9523 >> 8) >> aClass180_Sub2_9296.anInt9522;
		} else {
			i = (anInt9342 - (anInt9340 * aClass180_Sub2_9296.anInt9523 >> 8) >> aClass180_Sub2_9296.anInt9522);
			i_1654_ = anInt9343 - (anInt9318 * aClass180_Sub2_9296.anInt9523 >> 8) >> aClass180_Sub2_9296.anInt9522;
		}
		int i_1655_;
		int i_1656_;
		if (aClass180_Sub2_9296.anInt9584 > 0) {
			i_1655_ = anInt9344 - (anInt9318 * aClass180_Sub2_9296.anInt9584 >> 8) >> aClass180_Sub2_9296.anInt9522;
			i_1656_ = anInt9345 - (anInt9340 * aClass180_Sub2_9296.anInt9584 >> 8) >> aClass180_Sub2_9296.anInt9522;
		} else {
			i_1655_ = anInt9344 - (anInt9340 * aClass180_Sub2_9296.anInt9584 >> 8) >> aClass180_Sub2_9296.anInt9522;
			i_1656_ = anInt9345 - (anInt9318 * aClass180_Sub2_9296.anInt9584 >> 8) >> aClass180_Sub2_9296.anInt9522;
		}
		int i_1657_ = i_1654_ - i + 1;
		int i_1658_ = i_1656_ - i_1655_ + 1;
		Class527_Sub8_Sub8_Sub2 class527_sub8_sub8_sub2 = (Class527_Sub8_Sub8_Sub2) class527_sub8_sub8;
		Class527_Sub8_Sub8_Sub2 class527_sub8_sub8_sub2_1659_;
		if (class527_sub8_sub8_sub2 != null && class527_sub8_sub8_sub2.method18742(i_1657_, i_1658_)) {
			class527_sub8_sub8_sub2_1659_ = class527_sub8_sub8_sub2;
			class527_sub8_sub8_sub2_1659_.method18743();
		} else
			class527_sub8_sub8_sub2_1659_ = new Class527_Sub8_Sub8_Sub2(aClass180_Sub2_9296, i_1657_, i_1658_);
		class527_sub8_sub8_sub2_1659_.method18741(i, i_1655_, i_1654_, i_1656_);
		method14774(class527_sub8_sub8_sub2_1659_);
		return class527_sub8_sub8_sub2_1659_;
	}

	public Class527_Sub8_Sub8 method2964(Class527_Sub8_Sub8 class527_sub8_sub8) {
		if (anInt9308 == 0)
			return null;
		if (!aBool9304)
			method14754();
		int i;
		int i_1660_;
		if (aClass180_Sub2_9296.anInt9523 > 0) {
			i = (anInt9342 - (anInt9318 * aClass180_Sub2_9296.anInt9523 >> 8) >> aClass180_Sub2_9296.anInt9522);
			i_1660_ = anInt9343 - (anInt9340 * aClass180_Sub2_9296.anInt9523 >> 8) >> aClass180_Sub2_9296.anInt9522;
		} else {
			i = (anInt9342 - (anInt9340 * aClass180_Sub2_9296.anInt9523 >> 8) >> aClass180_Sub2_9296.anInt9522);
			i_1660_ = anInt9343 - (anInt9318 * aClass180_Sub2_9296.anInt9523 >> 8) >> aClass180_Sub2_9296.anInt9522;
		}
		int i_1661_;
		int i_1662_;
		if (aClass180_Sub2_9296.anInt9584 > 0) {
			i_1661_ = anInt9344 - (anInt9318 * aClass180_Sub2_9296.anInt9584 >> 8) >> aClass180_Sub2_9296.anInt9522;
			i_1662_ = anInt9345 - (anInt9340 * aClass180_Sub2_9296.anInt9584 >> 8) >> aClass180_Sub2_9296.anInt9522;
		} else {
			i_1661_ = anInt9344 - (anInt9340 * aClass180_Sub2_9296.anInt9584 >> 8) >> aClass180_Sub2_9296.anInt9522;
			i_1662_ = anInt9345 - (anInt9318 * aClass180_Sub2_9296.anInt9584 >> 8) >> aClass180_Sub2_9296.anInt9522;
		}
		int i_1663_ = i_1660_ - i + 1;
		int i_1664_ = i_1662_ - i_1661_ + 1;
		Class527_Sub8_Sub8_Sub2 class527_sub8_sub8_sub2 = (Class527_Sub8_Sub8_Sub2) class527_sub8_sub8;
		Class527_Sub8_Sub8_Sub2 class527_sub8_sub8_sub2_1665_;
		if (class527_sub8_sub8_sub2 != null && class527_sub8_sub8_sub2.method18742(i_1663_, i_1664_)) {
			class527_sub8_sub8_sub2_1665_ = class527_sub8_sub8_sub2;
			class527_sub8_sub8_sub2_1665_.method18743();
		} else
			class527_sub8_sub8_sub2_1665_ = new Class527_Sub8_Sub8_Sub2(aClass180_Sub2_9296, i_1663_, i_1664_);
		class527_sub8_sub8_sub2_1665_.method18741(i, i_1661_, i_1660_, i_1662_);
		method14774(class527_sub8_sub8_sub2_1665_);
		return class527_sub8_sub8_sub2_1665_;
	}

	public Class527_Sub8_Sub8 method2965(Class527_Sub8_Sub8 class527_sub8_sub8) {
		if (anInt9308 == 0)
			return null;
		if (!aBool9304)
			method14754();
		int i;
		int i_1666_;
		if (aClass180_Sub2_9296.anInt9523 > 0) {
			i = (anInt9342 - (anInt9318 * aClass180_Sub2_9296.anInt9523 >> 8) >> aClass180_Sub2_9296.anInt9522);
			i_1666_ = anInt9343 - (anInt9340 * aClass180_Sub2_9296.anInt9523 >> 8) >> aClass180_Sub2_9296.anInt9522;
		} else {
			i = (anInt9342 - (anInt9340 * aClass180_Sub2_9296.anInt9523 >> 8) >> aClass180_Sub2_9296.anInt9522);
			i_1666_ = anInt9343 - (anInt9318 * aClass180_Sub2_9296.anInt9523 >> 8) >> aClass180_Sub2_9296.anInt9522;
		}
		int i_1667_;
		int i_1668_;
		if (aClass180_Sub2_9296.anInt9584 > 0) {
			i_1667_ = anInt9344 - (anInt9318 * aClass180_Sub2_9296.anInt9584 >> 8) >> aClass180_Sub2_9296.anInt9522;
			i_1668_ = anInt9345 - (anInt9340 * aClass180_Sub2_9296.anInt9584 >> 8) >> aClass180_Sub2_9296.anInt9522;
		} else {
			i_1667_ = anInt9344 - (anInt9340 * aClass180_Sub2_9296.anInt9584 >> 8) >> aClass180_Sub2_9296.anInt9522;
			i_1668_ = anInt9345 - (anInt9318 * aClass180_Sub2_9296.anInt9584 >> 8) >> aClass180_Sub2_9296.anInt9522;
		}
		int i_1669_ = i_1666_ - i + 1;
		int i_1670_ = i_1668_ - i_1667_ + 1;
		Class527_Sub8_Sub8_Sub2 class527_sub8_sub8_sub2 = (Class527_Sub8_Sub8_Sub2) class527_sub8_sub8;
		Class527_Sub8_Sub8_Sub2 class527_sub8_sub8_sub2_1671_;
		if (class527_sub8_sub8_sub2 != null && class527_sub8_sub8_sub2.method18742(i_1669_, i_1670_)) {
			class527_sub8_sub8_sub2_1671_ = class527_sub8_sub8_sub2;
			class527_sub8_sub8_sub2_1671_.method18743();
		} else
			class527_sub8_sub8_sub2_1671_ = new Class527_Sub8_Sub8_Sub2(aClass180_Sub2_9296, i_1669_, i_1670_);
		class527_sub8_sub8_sub2_1671_.method18741(i, i_1667_, i_1666_, i_1668_);
		method14774(class527_sub8_sub8_sub2_1671_);
		return class527_sub8_sub8_sub2_1671_;
	}

	public Class527_Sub8_Sub8 method2966(Class527_Sub8_Sub8 class527_sub8_sub8) {
		if (anInt9308 == 0)
			return null;
		if (!aBool9304)
			method14754();
		int i;
		int i_1672_;
		if (aClass180_Sub2_9296.anInt9523 > 0) {
			i = (anInt9342 - (anInt9318 * aClass180_Sub2_9296.anInt9523 >> 8) >> aClass180_Sub2_9296.anInt9522);
			i_1672_ = anInt9343 - (anInt9340 * aClass180_Sub2_9296.anInt9523 >> 8) >> aClass180_Sub2_9296.anInt9522;
		} else {
			i = (anInt9342 - (anInt9340 * aClass180_Sub2_9296.anInt9523 >> 8) >> aClass180_Sub2_9296.anInt9522);
			i_1672_ = anInt9343 - (anInt9318 * aClass180_Sub2_9296.anInt9523 >> 8) >> aClass180_Sub2_9296.anInt9522;
		}
		int i_1673_;
		int i_1674_;
		if (aClass180_Sub2_9296.anInt9584 > 0) {
			i_1673_ = anInt9344 - (anInt9318 * aClass180_Sub2_9296.anInt9584 >> 8) >> aClass180_Sub2_9296.anInt9522;
			i_1674_ = anInt9345 - (anInt9340 * aClass180_Sub2_9296.anInt9584 >> 8) >> aClass180_Sub2_9296.anInt9522;
		} else {
			i_1673_ = anInt9344 - (anInt9340 * aClass180_Sub2_9296.anInt9584 >> 8) >> aClass180_Sub2_9296.anInt9522;
			i_1674_ = anInt9345 - (anInt9318 * aClass180_Sub2_9296.anInt9584 >> 8) >> aClass180_Sub2_9296.anInt9522;
		}
		int i_1675_ = i_1672_ - i + 1;
		int i_1676_ = i_1674_ - i_1673_ + 1;
		Class527_Sub8_Sub8_Sub2 class527_sub8_sub8_sub2 = (Class527_Sub8_Sub8_Sub2) class527_sub8_sub8;
		Class527_Sub8_Sub8_Sub2 class527_sub8_sub8_sub2_1677_;
		if (class527_sub8_sub8_sub2 != null && class527_sub8_sub8_sub2.method18742(i_1675_, i_1676_)) {
			class527_sub8_sub8_sub2_1677_ = class527_sub8_sub8_sub2;
			class527_sub8_sub8_sub2_1677_.method18743();
		} else
			class527_sub8_sub8_sub2_1677_ = new Class527_Sub8_Sub8_Sub2(aClass180_Sub2_9296, i_1675_, i_1676_);
		class527_sub8_sub8_sub2_1677_.method18741(i, i_1673_, i_1672_, i_1674_);
		method14774(class527_sub8_sub8_sub2_1677_);
		return class527_sub8_sub8_sub2_1677_;
	}

	public void method2967() {
		if (!aBool9346) {
			if (!aBool9304)
				method14754();
			anInt9309 = anInt9340;
			aBool9346 = true;
		}
	}

	public int method3028() {
		if (!aBool9304)
			method14754();
		return anInt9331;
	}

	public int method2969() {
		if (!aBool9304)
			method14754();
		return anInt9331;
	}

	public void method3026(Class432 class432, int i, boolean bool) {
		if (aShortArray9307 != null) {
			Class432 class432_1678_ = class432;
			if (bool) {
				class432_1678_ = aClass180_Sub2_9296.aClass432_9512;
				class432_1678_.method6918(class432);
			}
			float[] fs = new float[3];
			for (int i_1679_ = 0; i_1679_ < anInt9302; i_1679_++) {
				if ((i & aShortArray9307[i_1679_]) != 0) {
					class432_1678_.method6883((float) anIntArray9352[i_1679_], (float) anIntArray9360[i_1679_], (float) anIntArray9362[i_1679_], fs);
					anIntArray9352[i_1679_] = (int) fs[0];
					anIntArray9360[i_1679_] = (int) fs[1];
					anIntArray9362[i_1679_] = (int) fs[2];
				}
			}
		}
	}

	public int method2971() {
		if (!aBool9304)
			method14754();
		return anInt9331;
	}

	public int method2972() {
		if (!aBool9304)
			method14754();
		return anInt9337;
	}

	public int method2973() {
		if (!aBool9304)
			method14754();
		return anInt9337;
	}

	public int method2997() {
		if (!aBool9304)
			method14754();
		return anInt9337;
	}

	public int method2932() {
		if (!aBool9304)
			method14754();
		return anInt9343;
	}

	public int method2976() {
		if (!aBool9304)
			method14754();
		return anInt9343;
	}

	public void method2889(Class432 class432, Class169 class169, int i) {
		if (aClass348_9370 != null)
			aClass348_9370.method6164();
		if (class169 != null)
			class169.aBool1874 = false;
		if (anInt9308 != 0) {
			Class427 class427 = aClass180_Sub2_9296.aClass427_9469;
			Class427 class427_1680_ = aClass180_Sub2_9296.aClass427_9435;
			Class427 class427_1681_ = aClass180_Sub2_9296.aClass427_9491;
			class427_1680_.method6784(class432);
			class427_1681_.method6750(class427_1680_);
			class427_1681_.method6751(aClass180_Sub2_9296.aClass427_9530);
			if (!aBool9304)
				method14754();
			float[] fs = aClass180_Sub2_9296.aFloatArray9564;
			class427_1680_.method6773(0.0F, (float) anInt9340, 0.0F, fs);
			float f = fs[0];
			float f_1682_ = fs[1];
			float f_1683_ = fs[2];
			class427_1680_.method6773(0.0F, (float) anInt9318, 0.0F, fs);
			float f_1684_ = fs[0];
			float f_1685_ = fs[1];
			float f_1686_ = fs[2];
			for (int i_1687_ = 0; i_1687_ < 6; i_1687_++) {
				float[] fs_1688_ = aClass180_Sub2_9296.aFloatArrayArray9475[i_1687_];
				float f_1689_ = (fs_1688_[0] * f + fs_1688_[1] * f_1682_ + fs_1688_[2] * f_1683_ + fs_1688_[3] + (float) anInt9331);
				float f_1690_ = (fs_1688_[0] * f_1684_ + fs_1688_[1] * f_1685_ + fs_1688_[2] * f_1686_ + fs_1688_[3] + (float) anInt9331);
				if (f_1689_ < 0.0F && f_1690_ < 0.0F)
					return;
			}
			if (class169 != null) {
				boolean bool = false;
				boolean bool_1691_ = true;
				int i_1692_ = anInt9342 + anInt9343 >> 1;
				int i_1693_ = anInt9344 + anInt9345 >> 1;
				int i_1694_ = i_1692_;
				int i_1695_ = anInt9340;
				int i_1696_ = i_1693_;
				float f_1697_ = (class427_1681_.aFloatArray4807[0] * (float) i_1694_ + class427_1681_.aFloatArray4807[4] * (float) i_1695_ + class427_1681_.aFloatArray4807[8] * (float) i_1696_ + class427_1681_.aFloatArray4807[12]);
				float f_1698_ = (class427_1681_.aFloatArray4807[1] * (float) i_1694_ + class427_1681_.aFloatArray4807[5] * (float) i_1695_ + class427_1681_.aFloatArray4807[9] * (float) i_1696_ + class427_1681_.aFloatArray4807[13]);
				float f_1699_ = (class427_1681_.aFloatArray4807[2] * (float) i_1694_ + class427_1681_.aFloatArray4807[6] * (float) i_1695_ + class427_1681_.aFloatArray4807[10] * (float) i_1696_ + class427_1681_.aFloatArray4807[14]);
				float f_1700_ = (class427_1681_.aFloatArray4807[3] * (float) i_1694_ + class427_1681_.aFloatArray4807[7] * (float) i_1695_ + class427_1681_.aFloatArray4807[11] * (float) i_1696_ + class427_1681_.aFloatArray4807[15]);
				if (f_1699_ >= -f_1700_) {
					class169.anInt1872 = (int) (aClass180_Sub2_9296.aFloat9476 + (aClass180_Sub2_9296.aFloat9477 * f_1697_ / f_1700_));
					class169.anInt1876 = (int) (aClass180_Sub2_9296.aFloat9478 + (aClass180_Sub2_9296.aFloat9500 * f_1698_ / f_1700_));
				} else
					bool = true;
				i_1694_ = i_1692_;
				i_1695_ = anInt9318;
				i_1696_ = i_1693_;
				float f_1701_ = (class427_1681_.aFloatArray4807[0] * (float) i_1694_ + class427_1681_.aFloatArray4807[4] * (float) i_1695_ + class427_1681_.aFloatArray4807[8] * (float) i_1696_ + class427_1681_.aFloatArray4807[12]);
				float f_1702_ = (class427_1681_.aFloatArray4807[1] * (float) i_1694_ + class427_1681_.aFloatArray4807[5] * (float) i_1695_ + class427_1681_.aFloatArray4807[9] * (float) i_1696_ + class427_1681_.aFloatArray4807[13]);
				float f_1703_ = (class427_1681_.aFloatArray4807[2] * (float) i_1694_ + class427_1681_.aFloatArray4807[6] * (float) i_1695_ + class427_1681_.aFloatArray4807[10] * (float) i_1696_ + class427_1681_.aFloatArray4807[14]);
				float f_1704_ = (class427_1681_.aFloatArray4807[3] * (float) i_1694_ + class427_1681_.aFloatArray4807[7] * (float) i_1695_ + class427_1681_.aFloatArray4807[11] * (float) i_1696_ + class427_1681_.aFloatArray4807[15]);
				if (f_1703_ >= -f_1704_) {
					class169.anInt1873 = (int) (aClass180_Sub2_9296.aFloat9476 + (aClass180_Sub2_9296.aFloat9477 * f_1701_ / f_1704_));
					class169.anInt1875 = (int) (aClass180_Sub2_9296.aFloat9478 + (aClass180_Sub2_9296.aFloat9500 * f_1702_ / f_1704_));
				} else
					bool = true;
				if (bool) {
					if (f_1699_ < -f_1700_ && f_1703_ < -f_1704_)
						bool_1691_ = false;
					else if (f_1699_ < -f_1700_) {
						float f_1705_ = (f_1699_ + f_1700_) / (f_1703_ + f_1704_) - 1.0F;
						float f_1706_ = f_1697_ + f_1705_ * (f_1701_ - f_1697_);
						float f_1707_ = f_1698_ + f_1705_ * (f_1702_ - f_1698_);
						float f_1708_ = f_1700_ + f_1705_ * (f_1704_ - f_1700_);
						class169.anInt1872 = (int) (aClass180_Sub2_9296.aFloat9476 + (aClass180_Sub2_9296.aFloat9477 * f_1706_ / f_1708_));
						class169.anInt1876 = (int) (aClass180_Sub2_9296.aFloat9478 + (aClass180_Sub2_9296.aFloat9500 * f_1707_ / f_1708_));
					} else if (f_1703_ < -f_1704_) {
						float f_1709_ = (f_1703_ + f_1704_) / (f_1699_ + f_1700_) - 1.0F;
						float f_1710_ = f_1701_ + f_1709_ * (f_1697_ - f_1701_);
						float f_1711_ = f_1702_ + f_1709_ * (f_1698_ - f_1702_);
						float f_1712_ = f_1704_ + f_1709_ * (f_1700_ - f_1704_);
						class169.anInt1873 = (int) (aClass180_Sub2_9296.aFloat9476 + (aClass180_Sub2_9296.aFloat9477 * f_1710_ / f_1712_));
						class169.anInt1875 = (int) (aClass180_Sub2_9296.aFloat9478 + (aClass180_Sub2_9296.aFloat9500 * f_1711_ / f_1712_));
					}
				}
				if (bool_1691_) {
					if (f_1699_ / f_1700_ > f_1703_ / f_1704_) {
						float f_1713_ = (f_1697_ + (class427.aFloatArray4807[0] * (float) anInt9331) + class427.aFloatArray4807[12]);
						float f_1714_ = (f_1700_ + (class427.aFloatArray4807[3] * (float) anInt9331) + class427.aFloatArray4807[15]);
						class169.anInt1877 = (int) (aClass180_Sub2_9296.aFloat9476 - (float) class169.anInt1872 + (aClass180_Sub2_9296.aFloat9477 * f_1713_ / f_1714_));
					} else {
						float f_1715_ = (f_1701_ + (class427.aFloatArray4807[0] * (float) anInt9331) + class427.aFloatArray4807[12]);
						float f_1716_ = (f_1704_ + (class427.aFloatArray4807[3] * (float) anInt9331) + class427.aFloatArray4807[15]);
						class169.anInt1877 = (int) (aClass180_Sub2_9296.aFloat9476 - (float) class169.anInt1873 + (aClass180_Sub2_9296.aFloat9477 * f_1715_ / f_1716_));
					}
					class169.aBool1874 = true;
				}
			}
			aClass180_Sub2_9296.method15013(i);
			method14763(class432);
			aClass180_Sub2_9296.method15013(0);
			class427_1680_.method6784(class432);
			class427_1680_.method6751(aClass180_Sub2_9296.aClass427_9459);
			method14764(class427_1680_);
		}
	}

	public int method2978() {
		if (!aBool9304)
			method14754();
		return anInt9340;
	}

	void method14774(Class527_Sub8_Sub8_Sub2 class527_sub8_sub8_sub2) {
		if (anIntArray9338.length < anInt9308) {
			anIntArray9338 = new int[anInt9308];
			anIntArray9330 = new int[anInt9308];
		}
		for (int i = 0; i < anInt9302; i++) {
			int i_1717_ = (((anIntArray9352[i] - (anIntArray9360[i] * aClass180_Sub2_9296.anInt9523 >> 8)) >> aClass180_Sub2_9296.anInt9522) - class527_sub8_sub8_sub2.anInt12082);
			int i_1718_ = (((anIntArray9362[i] - (anIntArray9360[i] * aClass180_Sub2_9296.anInt9584 >> 8)) >> aClass180_Sub2_9296.anInt9522) - class527_sub8_sub8_sub2.anInt12083);
			int i_1719_ = anIntArray9351[i];
			int i_1720_ = anIntArray9351[i + 1];
			for (int i_1721_ = i_1719_; i_1721_ < i_1720_ && aShortArray9366[i_1721_] != 0; i_1721_++) {
				int i_1722_ = (aShortArray9366[i_1721_] & 0xffff) - 1;
				anIntArray9338[i_1722_] = i_1717_;
				anIntArray9330[i_1722_] = i_1718_;
			}
		}
		for (int i = 0; i < anInt9319; i++) {
			if (aByteArray9321 == null || aByteArray9321[i] <= 128) {
				int i_1723_ = aShortArray9322[i] & 0xffff;
				int i_1724_ = aShortArray9323[i] & 0xffff;
				int i_1725_ = aShortArray9324[i] & 0xffff;
				int i_1726_ = anIntArray9338[i_1723_];
				int i_1727_ = anIntArray9338[i_1724_];
				int i_1728_ = anIntArray9338[i_1725_];
				int i_1729_ = anIntArray9330[i_1723_];
				int i_1730_ = anIntArray9330[i_1724_];
				int i_1731_ = anIntArray9330[i_1725_];
				if (((i_1726_ - i_1727_) * (i_1730_ - i_1731_) - (i_1730_ - i_1729_) * (i_1728_ - i_1727_)) > 0)
					class527_sub8_sub8_sub2.method18744(i_1729_, i_1730_, i_1731_, i_1726_, i_1727_, i_1728_);
			}
		}
	}

	public int method2985() {
		if (!aBool9304)
			method14754();
		return anInt9340;
	}

	public void method2937(int i) {
		int i_1732_ = Class428.anIntArray4825[i];
		int i_1733_ = Class428.anIntArray4819[i];
		for (int i_1734_ = 0; i_1734_ < anInt9302; i_1734_++) {
			int i_1735_ = ((anIntArray9362[i_1734_] * i_1732_ + anIntArray9352[i_1734_] * i_1733_) >> 14);
			anIntArray9362[i_1734_] = (anIntArray9362[i_1734_] * i_1733_ - anIntArray9352[i_1734_] * i_1732_) >> 14;
			anIntArray9352[i_1734_] = i_1735_;
		}
		method14759();
		aBool9304 = false;
	}

	public int method2982() {
		if (!aBool9304)
			method14754();
		return anInt9344;
	}

	public int method2983() {
		if (!aBool9304)
			method14754();
		return anInt9345;
	}

	public int method3055() {
		if (!aBool9304)
			method14754();
		return anInt9318;
	}

	public void method2886(int i, int i_1736_, int i_1737_) {
		for (int i_1738_ = 0; i_1738_ < anInt9302; i_1738_++) {
			if (i != 128)
				anIntArray9352[i_1738_] = anIntArray9352[i_1738_] * i >> 7;
			if (i_1736_ != 128)
				anIntArray9360[i_1738_] = anIntArray9360[i_1738_] * i_1736_ >> 7;
			if (i_1737_ != 128)
				anIntArray9362[i_1738_] = anIntArray9362[i_1738_] * i_1737_ >> 7;
		}
		method14759();
		aBool9304 = false;
	}

	public int method3023() {
		if (!aBool9346)
			method2901();
		return anInt9309;
	}

	void method2981() {
		/* empty */
	}

	public void method2988(int i) {
		aShort9339 = (short) i;
		method14751();
	}

	public int method2874() {
		return anInt9297;
	}

	public void method3007(int i) {
		aShort9300 = (short) i;
		method14759();
		method14752();
	}

	public void method3016() {
		for (int i = 0; i < anInt9302; i++)
			anIntArray9362[i] = -anIntArray9362[i];
		for (int i = 0; i < anInt9308; i++)
			aShortArray9313[i] = (short) -aShortArray9313[i];
		for (int i = 0; i < anInt9369; i++) {
			short i_1739_ = aShortArray9322[i];
			aShortArray9322[i] = aShortArray9324[i];
			aShortArray9324[i] = i_1739_;
		}
		method14759();
		method14752();
		method14769();
		aBool9304 = false;
	}

	public int method2942() {
		return aShort9339;
	}

	public int method2865() {
		if (!aBool9304)
			method14754();
		return anInt9331;
	}

	public int method2994() {
		return aShort9339;
	}

	public int method2995() {
		return aShort9339;
	}

	public int method2996() {
		return aShort9300;
	}

	void method2947() {
		/* empty */
	}

	public int method2998() {
		return aShort9300;
	}

	public int method2905() {
		return aShort9300;
	}

	public byte[] method2900() {
		return aByteArray9321;
	}

	public byte[] method3001() {
		return aByteArray9321;
	}

	public void method2914(byte i, byte[] is) {
		if (is == null) {
			for (int i_1740_ = 0; i_1740_ < anInt9369; i_1740_++)
				aByteArray9321[i_1740_] = i;
		} else {
			for (int i_1741_ = 0; i_1741_ < anInt9369; i_1741_++) {
				int i_1742_ = 255 - ((255 - (is[i_1741_] & 0xff)) * (255 - (i & 0xff)) / 255);
				aByteArray9321[i_1741_] = (byte) i_1742_;
			}
		}
		method14751();
	}

	public void method2959(byte i, byte[] is) {
		if (is == null) {
			for (int i_1743_ = 0; i_1743_ < anInt9369; i_1743_++)
				aByteArray9321[i_1743_] = i;
		} else {
			for (int i_1744_ = 0; i_1744_ < anInt9369; i_1744_++) {
				int i_1745_ = 255 - ((255 - (is[i_1744_] & 0xff)) * (255 - (i & 0xff)) / 255);
				aByteArray9321[i_1744_] = (byte) i_1745_;
			}
		}
		method14751();
	}

	public void method3004(short i, short i_1746_) {
		Class181 class181 = aClass180_Sub2_9296.aClass181_2059;
		for (int i_1747_ = 0; i_1747_ < anInt9369; i_1747_++) {
			if (aShortArray9325[i_1747_] == i)
				aShortArray9325[i_1747_] = i_1746_;
		}
		byte i_1748_ = 0;
		byte i_1749_ = 0;
		if (i != -1) {
			Class163 class163 = class181.method3544(i & 0xffff, (byte) -84);
			i_1748_ = class163.aByte1808;
			i_1749_ = class163.aByte1802;
		}
		byte i_1750_ = 0;
		byte i_1751_ = 0;
		if (i_1746_ != -1) {
			Class163 class163 = class181.method3544(i_1746_ & 0xffff, (byte) -50);
			i_1750_ = class163.aByte1808;
			i_1751_ = class163.aByte1802;
			if (class163.aByte1781 != 0 || class163.aByte1797 != 0)
				aBool9336 = true;
		}
		if (i_1748_ != i_1750_ | i_1749_ != i_1751_) {
			if (aClass361Array9356 != null) {
				for (int i_1752_ = 0; i_1752_ < anInt9355; i_1752_++) {
					Class361 class361 = aClass361Array9356[i_1752_];
					Class354 class354 = aClass354Array9347[i_1752_];
					class354.anInt3804 = (class354.anInt3804 & ~0xffffff | ((Class656.anIntArray8390[aShortArray9326[class361.anInt3841] & 0xffff]) & 0xffffff));
				}
			}
			method14751();
		}
	}

	public Class167[] method2915() {
		return aClass167Array9303;
	}

	static byte[] method14775(byte[] is, int i) {
		byte[] is_1753_ = new byte[i];
		System.arraycopy(is, 0, is_1753_, 0, i);
		return is_1753_;
	}

	public Class159[] method2916() {
		return aClass159Array9354;
	}

	public boolean method3008() {
		if (aShortArray9325 == null)
			return true;
		for (int i = 0; i < aShortArray9325.length; i++) {
			if (aShortArray9325[i] != -1 && !(aClass180_Sub2_9296.aClass336_9532.method5884(aClass180_Sub2_9296.aClass181_2059.method3544(aShortArray9325[i], (byte) -118), -1)))
				return false;
		}
		return true;
	}

	public boolean method3009() {
		if (aShortArray9325 == null)
			return true;
		for (int i = 0; i < aShortArray9325.length; i++) {
			if (aShortArray9325[i] != -1 && !(aClass180_Sub2_9296.aClass336_9532.method5884(aClass180_Sub2_9296.aClass181_2059.method3544(aShortArray9325[i], (byte) -64), -1)))
				return false;
		}
		return true;
	}

	public boolean method3010() {
		return aBool9335;
	}

	public boolean method3011() {
		return aBool9335;
	}

	public int method2963() {
		if (!aBool9304)
			method14754();
		return anInt9345;
	}

	public boolean method3013() {
		return aBool9336;
	}

	public boolean method3014() {
		return aBool9336;
	}

	public int method2951() {
		return anInt9297;
	}

	void method14776(Class432 class432) {
		if (anInt9319 != 0 && (method14768() && method14772())) {
			if (aClass348_9370 == null) {
				/* empty */
			}
			aClass180_Sub2_9296.method14998();
			aClass180_Sub2_9296.method14958();
			Class326 class326 = aClass180_Sub2_9296.aClass326_9541;
			aClass180_Sub2_9296.method14988(0, aClass363_9299.anInterface37_3856);
			aClass180_Sub2_9296.method14988(1, aClass363_9334.anInterface37_3856);
			aClass180_Sub2_9296.method14988(2, aClass363_9332.anInterface37_3856);
			aClass180_Sub2_9296.method15001(aClass344_9361.anInterface44_3693);
			aClass180_Sub2_9296.aClass427_9435.method6784(class432);
			class326.method5770(aClass180_Sub2_9296.aClass427_9435);
			class326.aClass427_3583.method6742();
			if (aClass180_Sub2_9296.aBool9495) {
				Class178 class178 = aClass180_Sub2_9296.method14987();
				class326.aClass441_3587.method7118(0.0F, 1.0F, 0.0F, (float) -aClass180_Sub2_9296.anInt9557);
				class326.aClass441_3587.method7128(3.0F / (float) ((class178.anInt2050) * 112490777));
				class326.aClass442_3588.method7138(((float) (class178.anInt2055 * -2080392837 >> 16 & 0xff) / 255.0F), ((float) (class178.anInt2055 * -2080392837 >> 8 & 0xff) / 255.0F), ((float) (class178.anInt2055 * -2080392837 >> 0 & 0xff) / 255.0F));
			} else {
				class326.aClass441_3587.method7118(0.0F, 0.0F, 0.0F, 0.0F);
				class326.aClass442_3588.method7138(0.0F, 0.0F, 0.0F);
			}
			if (aClass180_Sub2_9296.anInt9562 > 0) {
				class326.aClass441_3589.method7118(0.0F, 0.0F, 1.0F, -(aClass180_Sub2_9296.aFloat9517));
				class326.aClass442_3581.method7138(((float) (aClass180_Sub2_9296.anInt9561 >> 16 & 0xff) / 255.0F), ((float) (aClass180_Sub2_9296.anInt9561 >> 8 & 0xff) / 255.0F), ((float) (aClass180_Sub2_9296.anInt9561 >> 0 & 0xff) / 255.0F));
				aClass180_Sub2_9296.aClass427_9435.method6784(class432);
				aClass180_Sub2_9296.aClass427_9435.method6790();
				class326.aClass441_3587.method7123(aClass180_Sub2_9296.aClass427_9435);
				aClass180_Sub2_9296.aClass427_9435.method6784(class432);
				aClass180_Sub2_9296.aClass427_9435.method6751(aClass180_Sub2_9296.aClass427_9459);
				aClass180_Sub2_9296.aClass427_9435.method6790();
				class326.aClass441_3589.method7123(aClass180_Sub2_9296.aClass427_9435);
				class326.aClass441_3589.method7128(1.0F / (aClass180_Sub2_9296.aFloat9565 - aClass180_Sub2_9296.aFloat9517));
			} else {
				class326.aClass441_3589.method7118(0.0F, 0.0F, 0.0F, 0.0F);
				class326.aClass442_3581.method7138(0.0F, 0.0F, 0.0F);
			}
			if ((anInt9298 & 0x37) == 0) {
				aClass180_Sub2_9296.method15149(aClass180_Sub2_9296.aClass355_9594);
				if (aClass180_Sub2_9296.aBool9597)
					aClass180_Sub2_9296.method14954(false);
				for (int i = 0; i < anIntArray9349.length; i++) {
					int i_1754_ = anIntArray9348[i];
					int i_1755_ = anIntArray9348[i + 1];
					int i_1756_ = aShortArray9325[i_1754_];
					boolean bool = false;
					byte i_1757_ = 0;
					if (i_1756_ != -1) {
						Class163 class163 = aClass180_Sub2_9296.aClass181_2059.method3544(i_1756_ & 0xffff, (byte) -58);
						class326.anInterface38_3595 = aClass180_Sub2_9296.aClass336_9532.method5895(class163);
						bool = !Class306.method5607(class163.aByte1801, -1088851960);
						class326.aClass427_3583.aFloatArray4807[12] = ((float) (aClass180_Sub2_9296.anInt9574 % 128000) / 1000.0F * (float) class163.aByte1781 / 64.0F % 1.0F);
						class326.aClass427_3583.aFloatArray4807[13] = ((float) (aClass180_Sub2_9296.anInt9574 % 128000) / 1000.0F * (float) class163.aByte1797 / 64.0F % 1.0F);
						if (class163.aClass595_1784 == Class595.aClass595_7815)
							i_1757_ = class163.aByte1764;
					} else {
						class326.anInterface38_3595 = aClass180_Sub2_9296.anInterface38_9533;
						float[] fs = class326.aClass427_3583.aFloatArray4807;
						class326.aClass427_3583.aFloatArray4807[13] = 0.0F;
						fs[12] = 0.0F;
					}
					aClass180_Sub2_9296.method14990(i_1757_);
					class326.anInt3598 = anIntArray9349[i];
					class326.anInt3597 = anIntArray9350[i];
					class326.anInt3584 = i_1754_ * 3;
					class326.anInt3599 = i_1755_ - i_1754_;
					class326.method5757(bool);
				}
			} else {
				aClass180_Sub2_9296.method14988(3, aClass363_9368.anInterface37_3856);
				aClass180_Sub2_9296.method15149(aClass180_Sub2_9296.aClass355_9595);
				Class432 class432_1758_ = aClass180_Sub2_9296.aClass432_9512;
				class432_1758_.method6899(class432);
				class432_1758_.method6887();
				int i = 0;
				if (aClass180_Sub2_9296.aBool9597)
					aClass180_Sub2_9296.method14954(true);
				else {
					class326.aClass442_3591.method7138(aClass180_Sub2_9296.aFloatArray9507[0], aClass180_Sub2_9296.aFloatArray9507[1], aClass180_Sub2_9296.aFloatArray9507[2]);
					class326.aClass442_3591.method7230(class432_1758_);
					class326.aClass442_3590.method7138((aClass180_Sub2_9296.aFloat9516 * aClass180_Sub2_9296.aFloat9583), (aClass180_Sub2_9296.aFloat9516 * aClass180_Sub2_9296.aFloat9513), (aClass180_Sub2_9296.aFloat9516 * aClass180_Sub2_9296.aFloat9448));
					class326.aClass442_3593.method7138((-aClass180_Sub2_9296.aFloat9548 * aClass180_Sub2_9296.aFloat9583), (-aClass180_Sub2_9296.aFloat9548 * aClass180_Sub2_9296.aFloat9513), (-aClass180_Sub2_9296.aFloat9548 * aClass180_Sub2_9296.aFloat9448));
					class326.aClass442_3594.method7138((aClass180_Sub2_9296.aFloat9551 * aClass180_Sub2_9296.aFloat9583), (aClass180_Sub2_9296.aFloat9551 * aClass180_Sub2_9296.aFloat9513), (aClass180_Sub2_9296.aFloat9551 * aClass180_Sub2_9296.aFloat9448));
					if (aClass180_Sub2_9296.anInt9526 > 0) {
						i = aClass180_Sub2_9296.anInt9526;
						Class442 class442 = aClass180_Sub2_9296.aClass442_9461;
						for (int i_1759_ = 0; i_1759_ < i; i_1759_++) {
							Class527_Sub16 class527_sub16 = (aClass180_Sub2_9296.aClass527_Sub16Array9520[i_1759_]);
							int i_1760_ = class527_sub16.method16133((byte) 0);
							class442.method7146(class527_sub16.aClass442_10462);
							class442.method7151(class432_1758_);
							class326.aFloatArray3580[i_1759_ * 4 + 0] = class442.aFloat4918;
							class326.aFloatArray3580[i_1759_ * 4 + 1] = class442.aFloat4915;
							class326.aFloatArray3580[i_1759_ * 4 + 2] = class442.aFloat4919;
							class326.aFloatArray3580[i_1759_ * 4 + 3] = 1.0F / (float) (class527_sub16.method16132(594662086) * (class527_sub16.method16132(-2025949446)));
							float f = (class527_sub16.method16162(-1295226930) / 255.0F);
							class326.aFloatArray3579[i_1759_ * 4 + 0] = (float) (i_1760_ >> 16 & 0xff) * f;
							class326.aFloatArray3579[i_1759_ * 4 + 1] = (float) (i_1760_ >> 8 & 0xff) * f;
							class326.aFloatArray3579[i_1759_ * 4 + 2] = (float) (i_1760_ & 0xff) * f;
							class326.aFloatArray3579[i_1759_ * 4 + 3] = 1.0F;
						}
					}
				}
				for (int i_1761_ = 0; i_1761_ < anIntArray9349.length; i_1761_++) {
					int i_1762_ = anIntArray9348[i_1761_];
					int i_1763_ = anIntArray9348[i_1761_ + 1];
					int i_1764_ = aShortArray9325[i_1762_];
					byte i_1765_ = 11;
					Class163 class163 = null;
					byte i_1766_ = 0;
					if (i_1764_ != -1) {
						class163 = aClass180_Sub2_9296.aClass181_2059.method3544(i_1764_ & 0xffff, (byte) -59);
						class326.anInterface38_3595 = aClass180_Sub2_9296.aClass336_9532.method5895(class163);
						i_1765_ = class163.aByte1801;
						class326.method5755(class163.aByte1775);
						class326.aClass427_3583.aFloatArray4807[12] = ((float) (aClass180_Sub2_9296.anInt9574 % 128000) / 1000.0F * (float) class163.aByte1781 / 64.0F % 1.0F);
						class326.aClass427_3583.aFloatArray4807[13] = ((float) (aClass180_Sub2_9296.anInt9574 % 128000) / 1000.0F * (float) class163.aByte1797 / 64.0F % 1.0F);
						if (class163.aClass595_1784 == Class595.aClass595_7815)
							i_1766_ = class163.aByte1764;
					} else {
						class326.anInterface38_3595 = aClass180_Sub2_9296.anInterface38_9533;
						float[] fs = class326.aClass427_3583.aFloatArray4807;
						class326.aClass427_3583.aFloatArray4807[13] = 0.0F;
						fs[12] = 0.0F;
					}
					aClass180_Sub2_9296.method14990(i_1766_);
					class326.anInt3598 = anIntArray9349[i_1761_];
					class326.anInt3597 = anIntArray9350[i_1761_];
					class326.anInt3584 = i_1762_ * 3;
					class326.anInt3599 = i_1763_ - i_1762_;
					switch (i_1765_) {
					case 5:
						if (!aClass180_Sub2_9296.aBool9597) {
							Class350_Sub1_Sub1 class350_sub1_sub1 = aClass180_Sub2_9296.aClass350_Sub1_Sub1_9547;
							class350_sub1_sub1.method17990(class163.aByte1775, (class163.anInt1805 * -1860683695), (byte) -28);
							class350_sub1_sub1.aClass427_11428.method6784(class432);
							class350_sub1_sub1.aClass427_11426.method6784(class432);
							class350_sub1_sub1.aClass427_11426.method6751(aClass180_Sub2_9296.aClass427_9474);
							class350_sub1_sub1.anInt11434 = anIntArray9349[i_1761_] * 864923621;
							class350_sub1_sub1.anInt11435 = anIntArray9350[i_1761_] * 1474049869;
							class350_sub1_sub1.anInt11436 = i_1762_ * 463347371;
							class350_sub1_sub1.anInt11420 = (i_1763_ - i_1762_) * -400534729;
							class350_sub1_sub1.method17988(-2034323053);
						} else
							class326.method5758(i);
						break;
					default:
						class326.method5758(i);
						break;
					case 7:
						class326.aClass442_3592.method7138((aClass180_Sub2_9296.aClass427_9453.aFloatArray4807[12]), (aClass180_Sub2_9296.aClass427_9453.aFloatArray4807[13]), (aClass180_Sub2_9296.aClass427_9453.aFloatArray4807[14]));
						class326.aClass442_3592.method7151(class432_1758_);
						class326.aClass427_3577.method6784(class432);
						class326.anInterface39_3582 = aClass180_Sub2_9296.method14925();
						class326.method5760(i);
						break;
					case 1:
						class326.aClass442_3592.method7138((aClass180_Sub2_9296.aClass427_9453.aFloatArray4807[12]), (aClass180_Sub2_9296.aClass427_9453.aFloatArray4807[13]), (aClass180_Sub2_9296.aClass427_9453.aFloatArray4807[14]));
						class326.aClass442_3592.method7151(class432_1758_);
						class326.method5754(i);
						break;
					case 6:
						class326.method5757(!Class306.method5607(i_1765_, -1088851960));
					}
				}
			}
			method14750();
		}
	}

	void method14777() {
		if (aClass344_9361 != null)
			aClass344_9361.aBool3695 = false;
	}

	public void method3003(short i, short i_1767_) {
		for (int i_1768_ = 0; i_1768_ < anInt9369; i_1768_++) {
			if (aShortArray9326[i_1768_] == i)
				aShortArray9326[i_1768_] = i_1767_;
		}
		if (aClass361Array9356 != null) {
			for (int i_1769_ = 0; i_1769_ < anInt9355; i_1769_++) {
				Class361 class361 = aClass361Array9356[i_1769_];
				Class354 class354 = aClass354Array9347[i_1769_];
				class354.anInt3804 = (class354.anInt3804 & ~0xffffff | ((Class656.anIntArray8390[aShortArray9326[class361.anInt3841] & 0xffff]) & 0xffffff));
			}
		}
		method14751();
	}

	public void method2936(short i, short i_1770_) {
		for (int i_1771_ = 0; i_1771_ < anInt9369; i_1771_++) {
			if (aShortArray9326[i_1771_] == i)
				aShortArray9326[i_1771_] = i_1770_;
		}
		if (aClass361Array9356 != null) {
			for (int i_1772_ = 0; i_1772_ < anInt9355; i_1772_++) {
				Class361 class361 = aClass361Array9356[i_1772_];
				Class354 class354 = aClass354Array9347[i_1772_];
				class354.anInt3804 = (class354.anInt3804 & ~0xffffff | ((Class656.anIntArray8390[aShortArray9326[class361.anInt3841] & 0xffff]) & 0xffffff));
			}
		}
		method14751();
	}

	public void method3000(int i) {
		int i_1773_ = Class428.anIntArray4825[i];
		int i_1774_ = Class428.anIntArray4819[i];
		for (int i_1775_ = 0; i_1775_ < anInt9302; i_1775_++) {
			int i_1776_ = ((anIntArray9360[i_1775_] * i_1773_ + anIntArray9352[i_1775_] * i_1774_) >> 14);
			anIntArray9360[i_1775_] = (anIntArray9360[i_1775_] * i_1774_ - anIntArray9352[i_1775_] * i_1773_) >> 14;
			anIntArray9352[i_1775_] = i_1776_;
		}
		method14759();
		aBool9304 = false;
	}

	void method2917() {
		/* empty */
	}

	Class176_Sub3(Class180_Sub2 class180_sub2, int i, int i_1777_, boolean bool, boolean bool_1778_) {
		anInt9319 = 0;
		aBool9341 = false;
		aBool9320 = true;
		aBool9335 = false;
		aBool9336 = false;
		aBool9304 = false;
		aBool9346 = false;
		aFloatArray9294 = new float[2];
		anIntArray9338 = new int[1];
		anIntArray9330 = new int[1];
		anIntArray9363 = new int[8];
		anIntArray9364 = new int[8];
		anIntArray9365 = new int[8];
		aClass180_Sub2_9296 = class180_sub2;
		anInt9297 = i;
		anInt9298 = i_1777_;
		aBool9341 = bool_1778_;
		if (bool || Class337.method5916(anInt9297, anInt9298))
			aClass363_9299 = new Class363(Class337.method5960(anInt9297, anInt9298));
		if (bool || Class337.method5919(anInt9297, anInt9298))
			aClass363_9332 = new Class363(Class337.method5924(anInt9297, anInt9298));
		if (bool || Class337.method5915(anInt9297, anInt9298))
			aClass363_9334 = new Class363(Class337.method5923(anInt9297, anInt9298));
		if (bool || Class337.method5917(anInt9297, anInt9298))
			aClass363_9368 = new Class363(Class337.method5975(anInt9297, anInt9298));
		if (bool || Class337.method5920(anInt9297, anInt9298))
			aClass344_9361 = new Class344(Class337.method5925(anInt9297, anInt9298));
		if (bool && bool_1778_) {
			aClass363_9299.anInterface37_3857 = aClass363_9299.anInterface37_3856 = aClass180_Sub2_9296.method15035(aBool9341);
			aClass363_9332.anInterface37_3857 = aClass363_9332.anInterface37_3856 = aClass180_Sub2_9296.method15035(aBool9341);
			aClass363_9334.anInterface37_3857 = aClass363_9334.anInterface37_3856 = aClass180_Sub2_9296.method15035(aBool9341);
			aClass363_9368.anInterface37_3857 = aClass363_9368.anInterface37_3856 = aClass180_Sub2_9296.method15035(aBool9341);
		}
	}

	public void method2863() {
		for (int i = 0; i < anInt9302; i++)
			anIntArray9362[i] = -anIntArray9362[i];
		for (int i = 0; i < anInt9308; i++)
			aShortArray9313[i] = (short) -aShortArray9313[i];
		for (int i = 0; i < anInt9369; i++) {
			short i_1779_ = aShortArray9322[i];
			aShortArray9322[i] = aShortArray9324[i];
			aShortArray9324[i] = i_1779_;
		}
		method14759();
		method14752();
		method14769();
		aBool9304 = false;
	}

	void method3024(int i, int i_1780_, int i_1781_, int i_1782_) {
		if (i == 0) {
			int i_1783_ = 0;
			anInt9357 = 0;
			anInt9367 = 0;
			anInt9353 = 0;
			for (int i_1784_ = 0; i_1784_ < anInt9302; i_1784_++) {
				anInt9357 += anIntArray9352[i_1784_];
				anInt9367 += anIntArray9360[i_1784_];
				anInt9353 += anIntArray9362[i_1784_];
				i_1783_++;
			}
			if (i_1783_ > 0) {
				anInt9357 = anInt9357 / i_1783_ + i_1780_;
				anInt9367 = anInt9367 / i_1783_ + i_1781_;
				anInt9353 = anInt9353 / i_1783_ + i_1782_;
			} else {
				anInt9357 = i_1780_;
				anInt9367 = i_1781_;
				anInt9353 = i_1782_;
			}
		} else if (i == 1) {
			for (int i_1785_ = 0; i_1785_ < anInt9302; i_1785_++) {
				anIntArray9352[i_1785_] += i_1780_;
				anIntArray9360[i_1785_] += i_1781_;
				anIntArray9362[i_1785_] += i_1782_;
			}
		} else if (i == 2) {
			for (int i_1786_ = 0; i_1786_ < anInt9302; i_1786_++) {
				anIntArray9352[i_1786_] -= anInt9357;
				anIntArray9360[i_1786_] -= anInt9367;
				anIntArray9362[i_1786_] -= anInt9353;
				if (i_1782_ != 0) {
					int i_1787_ = Class428.anIntArray4825[i_1782_];
					int i_1788_ = Class428.anIntArray4819[i_1782_];
					int i_1789_ = ((anIntArray9360[i_1786_] * i_1787_ + anIntArray9352[i_1786_] * i_1788_ + 16383) >> 14);
					anIntArray9360[i_1786_] = (anIntArray9360[i_1786_] * i_1788_ - anIntArray9352[i_1786_] * i_1787_ + 16383) >> 14;
					anIntArray9352[i_1786_] = i_1789_;
				}
				if (i_1780_ != 0) {
					int i_1790_ = Class428.anIntArray4825[i_1780_];
					int i_1791_ = Class428.anIntArray4819[i_1780_];
					int i_1792_ = ((anIntArray9360[i_1786_] * i_1791_ - anIntArray9362[i_1786_] * i_1790_ + 16383) >> 14);
					anIntArray9362[i_1786_] = (anIntArray9360[i_1786_] * i_1790_ + anIntArray9362[i_1786_] * i_1791_ + 16383) >> 14;
					anIntArray9360[i_1786_] = i_1792_;
				}
				if (i_1781_ != 0) {
					int i_1793_ = Class428.anIntArray4825[i_1781_];
					int i_1794_ = Class428.anIntArray4819[i_1781_];
					int i_1795_ = ((anIntArray9362[i_1786_] * i_1793_ + anIntArray9352[i_1786_] * i_1794_ + 16383) >> 14);
					anIntArray9362[i_1786_] = (anIntArray9362[i_1786_] * i_1794_ - anIntArray9352[i_1786_] * i_1793_ + 16383) >> 14;
					anIntArray9352[i_1786_] = i_1795_;
				}
				anIntArray9352[i_1786_] += anInt9357;
				anIntArray9360[i_1786_] += anInt9367;
				anIntArray9362[i_1786_] += anInt9353;
			}
		} else if (i == 3) {
			for (int i_1796_ = 0; i_1796_ < anInt9302; i_1796_++) {
				anIntArray9352[i_1796_] -= anInt9357;
				anIntArray9360[i_1796_] -= anInt9367;
				anIntArray9362[i_1796_] -= anInt9353;
				anIntArray9352[i_1796_] = anIntArray9352[i_1796_] * i_1780_ / 128;
				anIntArray9360[i_1796_] = anIntArray9360[i_1796_] * i_1781_ / 128;
				anIntArray9362[i_1796_] = anIntArray9362[i_1796_] * i_1782_ / 128;
				anIntArray9352[i_1796_] += anInt9357;
				anIntArray9360[i_1796_] += anInt9367;
				anIntArray9362[i_1796_] += anInt9353;
			}
		} else if (i == 5) {
			for (int i_1797_ = 0; i_1797_ < anInt9369; i_1797_++) {
				int i_1798_ = (aByteArray9321[i_1797_] & 0xff) + i_1780_ * 8;
				if (i_1798_ < 0)
					i_1798_ = 0;
				else if (i_1798_ > 255)
					i_1798_ = 255;
				aByteArray9321[i_1797_] = (byte) i_1798_;
			}
			if (aClass361Array9356 != null) {
				for (int i_1799_ = 0; i_1799_ < anInt9355; i_1799_++) {
					Class361 class361 = aClass361Array9356[i_1799_];
					Class354 class354 = aClass354Array9347[i_1799_];
					class354.anInt3804 = (class354.anInt3804 & 0xffffff | (255 - (aByteArray9321[class361.anInt3841] & 0xff) << 24));
				}
			}
			method14751();
		} else if (i == 7) {
			for (int i_1800_ = 0; i_1800_ < anInt9369; i_1800_++) {
				int i_1801_ = aShortArray9326[i_1800_] & 0xffff;
				int i_1802_ = i_1801_ >> 10 & 0x3f;
				int i_1803_ = i_1801_ >> 7 & 0x7;
				int i_1804_ = i_1801_ & 0x7f;
				i_1802_ = i_1802_ + i_1780_ & 0x3f;
				i_1803_ += i_1781_ / 4;
				if (i_1803_ < 0)
					i_1803_ = 0;
				else if (i_1803_ > 7)
					i_1803_ = 7;
				i_1804_ += i_1782_;
				if (i_1804_ < 0)
					i_1804_ = 0;
				else if (i_1804_ > 127)
					i_1804_ = 127;
				aShortArray9326[i_1800_] = (short) (i_1802_ << 10 | i_1803_ << 7 | i_1804_);
			}
			if (aClass361Array9356 != null) {
				for (int i_1805_ = 0; i_1805_ < anInt9355; i_1805_++) {
					Class361 class361 = aClass361Array9356[i_1805_];
					Class354 class354 = aClass354Array9347[i_1805_];
					class354.anInt3804 = (class354.anInt3804 & ~0xffffff | ((Class656.anIntArray8390[aShortArray9326[class361.anInt3841] & 0xffff]) & 0xffffff));
				}
			}
			method14751();
		} else if (i == 8) {
			for (int i_1806_ = 0; i_1806_ < anInt9355; i_1806_++) {
				Class354 class354 = aClass354Array9347[i_1806_];
				class354.anInt3807 += i_1780_;
				class354.anInt3806 += i_1781_;
			}
		} else if (i == 10) {
			for (int i_1807_ = 0; i_1807_ < anInt9355; i_1807_++) {
				Class354 class354 = aClass354Array9347[i_1807_];
				class354.anInt3805 = class354.anInt3805 * i_1780_ >> 7;
				class354.anInt3808 = class354.anInt3808 * i_1781_ >> 7;
			}
		} else if (i == 9) {
			for (int i_1808_ = 0; i_1808_ < anInt9355; i_1808_++) {
				Class354 class354 = aClass354Array9347[i_1808_];
				class354.anInt3809 = class354.anInt3809 + i_1780_ & 0x3fff;
			}
		}
	}

	void method3025(int i, int i_1809_, int i_1810_, int i_1811_) {
		if (i == 0) {
			int i_1812_ = 0;
			anInt9357 = 0;
			anInt9367 = 0;
			anInt9353 = 0;
			for (int i_1813_ = 0; i_1813_ < anInt9302; i_1813_++) {
				anInt9357 += anIntArray9352[i_1813_];
				anInt9367 += anIntArray9360[i_1813_];
				anInt9353 += anIntArray9362[i_1813_];
				i_1812_++;
			}
			if (i_1812_ > 0) {
				anInt9357 = anInt9357 / i_1812_ + i_1809_;
				anInt9367 = anInt9367 / i_1812_ + i_1810_;
				anInt9353 = anInt9353 / i_1812_ + i_1811_;
			} else {
				anInt9357 = i_1809_;
				anInt9367 = i_1810_;
				anInt9353 = i_1811_;
			}
		} else if (i == 1) {
			for (int i_1814_ = 0; i_1814_ < anInt9302; i_1814_++) {
				anIntArray9352[i_1814_] += i_1809_;
				anIntArray9360[i_1814_] += i_1810_;
				anIntArray9362[i_1814_] += i_1811_;
			}
		} else if (i == 2) {
			for (int i_1815_ = 0; i_1815_ < anInt9302; i_1815_++) {
				anIntArray9352[i_1815_] -= anInt9357;
				anIntArray9360[i_1815_] -= anInt9367;
				anIntArray9362[i_1815_] -= anInt9353;
				if (i_1811_ != 0) {
					int i_1816_ = Class428.anIntArray4825[i_1811_];
					int i_1817_ = Class428.anIntArray4819[i_1811_];
					int i_1818_ = ((anIntArray9360[i_1815_] * i_1816_ + anIntArray9352[i_1815_] * i_1817_ + 16383) >> 14);
					anIntArray9360[i_1815_] = (anIntArray9360[i_1815_] * i_1817_ - anIntArray9352[i_1815_] * i_1816_ + 16383) >> 14;
					anIntArray9352[i_1815_] = i_1818_;
				}
				if (i_1809_ != 0) {
					int i_1819_ = Class428.anIntArray4825[i_1809_];
					int i_1820_ = Class428.anIntArray4819[i_1809_];
					int i_1821_ = ((anIntArray9360[i_1815_] * i_1820_ - anIntArray9362[i_1815_] * i_1819_ + 16383) >> 14);
					anIntArray9362[i_1815_] = (anIntArray9360[i_1815_] * i_1819_ + anIntArray9362[i_1815_] * i_1820_ + 16383) >> 14;
					anIntArray9360[i_1815_] = i_1821_;
				}
				if (i_1810_ != 0) {
					int i_1822_ = Class428.anIntArray4825[i_1810_];
					int i_1823_ = Class428.anIntArray4819[i_1810_];
					int i_1824_ = ((anIntArray9362[i_1815_] * i_1822_ + anIntArray9352[i_1815_] * i_1823_ + 16383) >> 14);
					anIntArray9362[i_1815_] = (anIntArray9362[i_1815_] * i_1823_ - anIntArray9352[i_1815_] * i_1822_ + 16383) >> 14;
					anIntArray9352[i_1815_] = i_1824_;
				}
				anIntArray9352[i_1815_] += anInt9357;
				anIntArray9360[i_1815_] += anInt9367;
				anIntArray9362[i_1815_] += anInt9353;
			}
		} else if (i == 3) {
			for (int i_1825_ = 0; i_1825_ < anInt9302; i_1825_++) {
				anIntArray9352[i_1825_] -= anInt9357;
				anIntArray9360[i_1825_] -= anInt9367;
				anIntArray9362[i_1825_] -= anInt9353;
				anIntArray9352[i_1825_] = anIntArray9352[i_1825_] * i_1809_ / 128;
				anIntArray9360[i_1825_] = anIntArray9360[i_1825_] * i_1810_ / 128;
				anIntArray9362[i_1825_] = anIntArray9362[i_1825_] * i_1811_ / 128;
				anIntArray9352[i_1825_] += anInt9357;
				anIntArray9360[i_1825_] += anInt9367;
				anIntArray9362[i_1825_] += anInt9353;
			}
		} else if (i == 5) {
			for (int i_1826_ = 0; i_1826_ < anInt9369; i_1826_++) {
				int i_1827_ = (aByteArray9321[i_1826_] & 0xff) + i_1809_ * 8;
				if (i_1827_ < 0)
					i_1827_ = 0;
				else if (i_1827_ > 255)
					i_1827_ = 255;
				aByteArray9321[i_1826_] = (byte) i_1827_;
			}
			if (aClass361Array9356 != null) {
				for (int i_1828_ = 0; i_1828_ < anInt9355; i_1828_++) {
					Class361 class361 = aClass361Array9356[i_1828_];
					Class354 class354 = aClass354Array9347[i_1828_];
					class354.anInt3804 = (class354.anInt3804 & 0xffffff | (255 - (aByteArray9321[class361.anInt3841] & 0xff) << 24));
				}
			}
			method14751();
		} else if (i == 7) {
			for (int i_1829_ = 0; i_1829_ < anInt9369; i_1829_++) {
				int i_1830_ = aShortArray9326[i_1829_] & 0xffff;
				int i_1831_ = i_1830_ >> 10 & 0x3f;
				int i_1832_ = i_1830_ >> 7 & 0x7;
				int i_1833_ = i_1830_ & 0x7f;
				i_1831_ = i_1831_ + i_1809_ & 0x3f;
				i_1832_ += i_1810_ / 4;
				if (i_1832_ < 0)
					i_1832_ = 0;
				else if (i_1832_ > 7)
					i_1832_ = 7;
				i_1833_ += i_1811_;
				if (i_1833_ < 0)
					i_1833_ = 0;
				else if (i_1833_ > 127)
					i_1833_ = 127;
				aShortArray9326[i_1829_] = (short) (i_1831_ << 10 | i_1832_ << 7 | i_1833_);
			}
			if (aClass361Array9356 != null) {
				for (int i_1834_ = 0; i_1834_ < anInt9355; i_1834_++) {
					Class361 class361 = aClass361Array9356[i_1834_];
					Class354 class354 = aClass354Array9347[i_1834_];
					class354.anInt3804 = (class354.anInt3804 & ~0xffffff | ((Class656.anIntArray8390[aShortArray9326[class361.anInt3841] & 0xffff]) & 0xffffff));
				}
			}
			method14751();
		} else if (i == 8) {
			for (int i_1835_ = 0; i_1835_ < anInt9355; i_1835_++) {
				Class354 class354 = aClass354Array9347[i_1835_];
				class354.anInt3807 += i_1809_;
				class354.anInt3806 += i_1810_;
			}
		} else if (i == 10) {
			for (int i_1836_ = 0; i_1836_ < anInt9355; i_1836_++) {
				Class354 class354 = aClass354Array9347[i_1836_];
				class354.anInt3805 = class354.anInt3805 * i_1809_ >> 7;
				class354.anInt3808 = class354.anInt3808 * i_1810_ >> 7;
			}
		} else if (i == 9) {
			for (int i_1837_ = 0; i_1837_ < anInt9355; i_1837_++) {
				Class354 class354 = aClass354Array9347[i_1837_];
				class354.anInt3809 = class354.anInt3809 + i_1809_ & 0x3fff;
			}
		}
	}

	short method14778(Class175 class175, int i, int i_1838_, long l, int i_1839_, int i_1840_, int i_1841_, int i_1842_, float f, float f_1843_) {
		int i_1844_ = anIntArray9351[i];
		int i_1845_ = anIntArray9351[i + 1];
		int i_1846_ = 0;
		for (int i_1847_ = i_1844_; i_1847_ < i_1845_; i_1847_++) {
			if (aShortArray9366[i_1847_] == 0) {
				i_1846_ = i_1847_;
				break;
			}
			int i_1848_ = (aShortArray9366[i_1847_] & 0xffff) - 1;
			if (aLongArray9359[i_1847_] == l)
				return (short) i_1848_;
		}
		aShortArray9366[i_1846_] = (short) (anInt9308 + 1);
		aLongArray9359[i_1846_] = l;
		aShortArray9358[anInt9308] = (short) i_1838_;
		aShortArray9333[anInt9308] = (short) i;
		aShortArray9311[anInt9308] = (short) i_1839_;
		aShortArray9305[anInt9308] = (short) i_1840_;
		aShortArray9313[anInt9308] = (short) i_1841_;
		aByteArray9314[anInt9308] = (byte) i_1842_;
		aFloatArray9315[anInt9308] = f;
		aFloatArray9316[anInt9308] = f_1843_;
		return (short) anInt9308++;
	}

	public void method2871(Class432 class432) {
		Class427 class427 = aClass180_Sub2_9296.aClass427_9435;
		class427.method6784(class432);
		if (aClass167Array9303 != null) {
			for (int i = 0; i < aClass167Array9303.length; i++) {
				Class167 class167 = aClass167Array9303[i];
				Class167 class167_1849_ = class167;
				if (class167.aClass167_1849 != null)
					class167_1849_ = class167.aClass167_1849;
				class167_1849_.anInt1855 = (int) (class427.aFloatArray4807[12] + ((class427.aFloatArray4807[0] * (float) (anIntArray9352[class167.anInt1851 * -18705907])) + (class427.aFloatArray4807[4] * (float) anIntArray9360[(class167.anInt1851 * -18705907)]) + (class427.aFloatArray4807[8] * (float) (anIntArray9362[(class167.anInt1851 * -18705907)])))) * 1542395015;
				class167_1849_.anInt1856 = ((int) (class427.aFloatArray4807[13] + ((class427.aFloatArray4807[1] * (float) (anIntArray9352[class167.anInt1851 * -18705907])) + (class427.aFloatArray4807[5] * (float) (anIntArray9360[(class167.anInt1851 * -18705907)])) + (class427.aFloatArray4807[9] * (float) (anIntArray9362[(class167.anInt1851 * -18705907)])))) * -1886500927);
				class167_1849_.anInt1860 = ((int) (class427.aFloatArray4807[14] + ((class427.aFloatArray4807[2] * (float) (anIntArray9352[class167.anInt1851 * -18705907])) + (class427.aFloatArray4807[6] * (float) (anIntArray9360[(class167.anInt1851 * -18705907)])) + (class427.aFloatArray4807[10] * (float) (anIntArray9362[(class167.anInt1851 * -18705907)])))) * -1731268533);
				class167_1849_.anInt1858 = ((int) (class427.aFloatArray4807[12] + ((class427.aFloatArray4807[0] * (float) anIntArray9352[(class167.anInt1852 * -1573542389)]) + (class427.aFloatArray4807[4] * (float) (anIntArray9360[(class167.anInt1852 * -1573542389)])) + (class427.aFloatArray4807[8] * (float) (anIntArray9362[(class167.anInt1852 * -1573542389)])))) * -2034723417);
				class167_1849_.anInt1859 = ((int) (class427.aFloatArray4807[13] + ((class427.aFloatArray4807[1] * (float) anIntArray9352[(class167.anInt1852 * -1573542389)]) + (class427.aFloatArray4807[5] * (float) (anIntArray9360[(class167.anInt1852 * -1573542389)])) + (class427.aFloatArray4807[9] * (float) (anIntArray9362[(class167.anInt1852 * -1573542389)])))) * -481732551);
				class167_1849_.anInt1862 = ((int) (class427.aFloatArray4807[14] + ((class427.aFloatArray4807[2] * (float) anIntArray9352[(class167.anInt1852 * -1573542389)]) + (class427.aFloatArray4807[6] * (float) (anIntArray9360[(class167.anInt1852 * -1573542389)])) + (class427.aFloatArray4807[10] * (float) (anIntArray9362[(class167.anInt1852 * -1573542389)])))) * -980787877);
				class167_1849_.anInt1857 = ((int) (class427.aFloatArray4807[12] + ((class427.aFloatArray4807[0] * (float) anIntArray9352[(class167.anInt1853 * -2116684303)]) + (class427.aFloatArray4807[4] * (float) (anIntArray9360[(class167.anInt1853 * -2116684303)])) + (class427.aFloatArray4807[8] * (float) (anIntArray9362[(class167.anInt1853 * -2116684303)])))) * -1482367683);
				class167_1849_.anInt1850 = ((int) (class427.aFloatArray4807[13] + ((class427.aFloatArray4807[1] * (float) anIntArray9352[(class167.anInt1853 * -2116684303)]) + (class427.aFloatArray4807[5] * (float) (anIntArray9360[(class167.anInt1853 * -2116684303)])) + (class427.aFloatArray4807[9] * (float) (anIntArray9362[(class167.anInt1853 * -2116684303)])))) * 1240185219);
				class167_1849_.anInt1863 = ((int) (class427.aFloatArray4807[14] + ((class427.aFloatArray4807[2] * (float) anIntArray9352[(class167.anInt1853 * -2116684303)]) + (class427.aFloatArray4807[6] * (float) (anIntArray9360[(class167.anInt1853 * -2116684303)])) + (class427.aFloatArray4807[10] * (float) (anIntArray9362[(class167.anInt1853 * -2116684303)])))) * -857185851);
			}
		}
		if (aClass159Array9354 != null) {
			for (int i = 0; i < aClass159Array9354.length; i++) {
				Class159 class159 = aClass159Array9354[i];
				Class159 class159_1850_ = class159;
				if (class159.aClass159_1739 != null)
					class159_1850_ = class159.aClass159_1739;
				if (class159.aClass427_1738 != null)
					class159.aClass427_1738.method6750(class427);
				else
					class159.aClass427_1738 = new Class427(class427);
				class159_1850_.anInt1744 = ((int) (class427.aFloatArray4807[12] + ((class427.aFloatArray4807[0] * (float) anIntArray9352[(class159.anInt1740 * -449756941)]) + (class427.aFloatArray4807[4] * (float) (anIntArray9360[(class159.anInt1740 * -449756941)])) + (class427.aFloatArray4807[8] * (float) (anIntArray9362[(class159.anInt1740 * -449756941)])))) * -306739393);
				class159_1850_.anInt1742 = ((int) (class427.aFloatArray4807[13] + ((class427.aFloatArray4807[1] * (float) anIntArray9352[(class159.anInt1740 * -449756941)]) + (class427.aFloatArray4807[5] * (float) (anIntArray9360[(class159.anInt1740 * -449756941)])) + (class427.aFloatArray4807[9] * (float) (anIntArray9362[(class159.anInt1740 * -449756941)])))) * -1995176663);
				class159_1850_.anInt1743 = (int) (class427.aFloatArray4807[14] + ((class427.aFloatArray4807[2] * (float) (anIntArray9352[class159.anInt1740 * -449756941])) + (class427.aFloatArray4807[6] * (float) anIntArray9360[(class159.anInt1740 * -449756941)]) + (class427.aFloatArray4807[10] * (float) (anIntArray9362[(class159.anInt1740 * -449756941)])))) * 76591605;
			}
		}
	}

	public void method2907(short i, short i_1851_) {
		for (int i_1852_ = 0; i_1852_ < anInt9369; i_1852_++) {
			if (aShortArray9326[i_1852_] == i)
				aShortArray9326[i_1852_] = i_1851_;
		}
		if (aClass361Array9356 != null) {
			for (int i_1853_ = 0; i_1853_ < anInt9355; i_1853_++) {
				Class361 class361 = aClass361Array9356[i_1853_];
				Class354 class354 = aClass354Array9347[i_1853_];
				class354.anInt3804 = (class354.anInt3804 & ~0xffffff | ((Class656.anIntArray8390[aShortArray9326[class361.anInt3841] & 0xffff]) & 0xffffff));
			}
		}
		method14751();
	}

	void method2927() {
		/* empty */
	}

	public int method3053() {
		if (!aBool9304)
			method14754();
		return anInt9342;
	}

	short method14779(Class175 class175, int i, int i_1854_, long l, int i_1855_, int i_1856_, int i_1857_, int i_1858_, float f, float f_1859_) {
		int i_1860_ = anIntArray9351[i];
		int i_1861_ = anIntArray9351[i + 1];
		int i_1862_ = 0;
		for (int i_1863_ = i_1860_; i_1863_ < i_1861_; i_1863_++) {
			if (aShortArray9366[i_1863_] == 0) {
				i_1862_ = i_1863_;
				break;
			}
			int i_1864_ = (aShortArray9366[i_1863_] & 0xffff) - 1;
			if (aLongArray9359[i_1863_] == l)
				return (short) i_1864_;
		}
		aShortArray9366[i_1862_] = (short) (anInt9308 + 1);
		aLongArray9359[i_1862_] = l;
		aShortArray9358[anInt9308] = (short) i_1854_;
		aShortArray9333[anInt9308] = (short) i;
		aShortArray9311[anInt9308] = (short) i_1855_;
		aShortArray9305[anInt9308] = (short) i_1856_;
		aShortArray9313[anInt9308] = (short) i_1857_;
		aByteArray9314[anInt9308] = (byte) i_1858_;
		aFloatArray9315[anInt9308] = f;
		aFloatArray9316[anInt9308] = f_1859_;
		return (short) anInt9308++;
	}

	void method3020() {
		/* empty */
	}

	public void method2869(int i) {
		int i_1865_ = Class428.anIntArray4825[i];
		int i_1866_ = Class428.anIntArray4819[i];
		for (int i_1867_ = 0; i_1867_ < anInt9302; i_1867_++) {
			int i_1868_ = ((anIntArray9360[i_1867_] * i_1865_ + anIntArray9352[i_1867_] * i_1866_) >> 14);
			anIntArray9360[i_1867_] = (anIntArray9360[i_1867_] * i_1866_ - anIntArray9352[i_1867_] * i_1865_) >> 14;
			anIntArray9352[i_1867_] = i_1868_;
		}
		method14759();
		aBool9304 = false;
	}

	static byte[] method14780(byte[] is, int i) {
		byte[] is_1869_ = new byte[i];
		System.arraycopy(is, 0, is_1869_, 0, i);
		return is_1869_;
	}

	public Class176 method2920(byte i, int i_1870_, boolean bool) {
		boolean bool_1871_ = false;
		Class176_Sub3 class176_sub3_1872_;
		Class176_Sub3 class176_sub3_1873_;
		if (i > 0 && i <= 8) {
			class176_sub3_1873_ = aClass180_Sub2_9296.aClass176_Sub3Array9600[i - 1];
			class176_sub3_1872_ = aClass180_Sub2_9296.aClass176_Sub3Array9599[i - 1];
			bool_1871_ = true;
		} else
			class176_sub3_1872_ = class176_sub3_1873_ = new Class176_Sub3(aClass180_Sub2_9296, 0, 0, true, false);
		return method14810(class176_sub3_1872_, class176_sub3_1873_, i_1870_, bool_1871_, bool);
	}

	static byte[] method14781(byte[] is, int i) {
		byte[] is_1874_ = new byte[i];
		System.arraycopy(is, 0, is_1874_, 0, i);
		return is_1874_;
	}

	static byte[] method14782(byte[] is, int i) {
		byte[] is_1875_ = new byte[i];
		System.arraycopy(is, 0, is_1875_, 0, i);
		return is_1875_;
	}

	static byte[] method14783(byte[] is, int i) {
		byte[] is_1876_ = new byte[i];
		System.arraycopy(is, 0, is_1876_, 0, i);
		return is_1876_;
	}

	boolean method14784() {
		if (aClass344_9361.aBool3695)
			return true;
		if (aClass344_9361.anInterface44_3696 == null)
			aClass344_9361.anInterface44_3696 = aClass180_Sub2_9296.method15025(false);
		Interface44 interface44 = aClass344_9361.anInterface44_3696;
		interface44.method323(anInt9319 * 6);
		Unsafe unsafe = aClass180_Sub2_9296.anUnsafe9437;
		if (unsafe != null) {
			int i = anInt9319 * 6;
			long l = interface44.method209(0, i);
			if (l == 0L)
				return false;
			for (int i_1877_ = 0; i_1877_ < anInt9319; i_1877_++) {
				unsafe.putShort(l, aShortArray9322[i_1877_]);
				l += 2L;
				unsafe.putShort(l, aShortArray9323[i_1877_]);
				l += 2L;
				unsafe.putShort(l, aShortArray9324[i_1877_]);
				l += 2L;
			}
			interface44.method211();
			aClass344_9361.anInterface44_3693 = interface44;
			aClass344_9361.aBool3695 = true;
			aBool9320 = true;
			return true;
		}
		ByteBuffer bytebuffer = aClass180_Sub2_9296.aByteBuffer9438;
		bytebuffer.clear();
		for (int i = 0; i < anInt9319; i++) {
			bytebuffer.putShort(aShortArray9322[i]);
			bytebuffer.putShort(aShortArray9323[i]);
			bytebuffer.putShort(aShortArray9324[i]);
		}
		if (interface44.method213(0, bytebuffer.position(), aClass180_Sub2_9296.aLong9439)) {
			aClass344_9361.anInterface44_3693 = interface44;
			aClass344_9361.aBool3695 = true;
			aBool9320 = true;
			return true;
		}
		return false;
	}

	static float[] method14785(float[] fs, int i) {
		float[] fs_1878_ = new float[i];
		System.arraycopy(fs, 0, fs_1878_, 0, i);
		return fs_1878_;
	}

	public int method2987() {
		if (!aBool9346)
			method2901();
		return anInt9309;
	}

	public void method3006(int i, int i_1879_, int i_1880_, int i_1881_) {
		for (int i_1882_ = 0; i_1882_ < anInt9369; i_1882_++) {
			int i_1883_ = aShortArray9326[i_1882_] & 0xffff;
			int i_1884_ = i_1883_ >> 10 & 0x3f;
			int i_1885_ = i_1883_ >> 7 & 0x7;
			int i_1886_ = i_1883_ & 0x7f;
			if (i != -1)
				i_1884_ += (i - i_1884_) * i_1881_ >> 7;
			if (i_1879_ != -1)
				i_1885_ += (i_1879_ - i_1885_) * i_1881_ >> 7;
			if (i_1880_ != -1)
				i_1886_ += (i_1880_ - i_1886_) * i_1881_ >> 7;
			aShortArray9326[i_1882_] = (short) (i_1884_ << 10 | i_1885_ << 7 | i_1886_);
		}
		if (aClass361Array9356 != null) {
			for (int i_1887_ = 0; i_1887_ < anInt9355; i_1887_++) {
				Class361 class361 = aClass361Array9356[i_1887_];
				Class354 class354 = aClass354Array9347[i_1887_];
				class354.anInt3804 = (class354.anInt3804 & ~0xffffff | ((Class656.anIntArray8390[aShortArray9326[class361.anInt3841] & 0xffff]) & 0xffffff));
			}
		}
		method14751();
	}

	Class176 method14786(Class176_Sub3 class176_sub3_1888_, Class176_Sub3 class176_sub3_1889_, int i, boolean bool, boolean bool_1890_) {
		class176_sub3_1888_.anInt9297 = i;
		class176_sub3_1888_.anInt9298 = anInt9298;
		class176_sub3_1888_.aShort9339 = aShort9339;
		class176_sub3_1888_.aShort9300 = aShort9300;
		class176_sub3_1888_.anInt9301 = anInt9301;
		class176_sub3_1888_.anInt9302 = anInt9302;
		class176_sub3_1888_.anInt9308 = anInt9308;
		class176_sub3_1888_.anInt9369 = anInt9369;
		class176_sub3_1888_.anInt9319 = anInt9319;
		class176_sub3_1888_.anInt9355 = anInt9355;
		if ((i & 0x100) != 0)
			class176_sub3_1888_.aBool9335 = true;
		else
			class176_sub3_1888_.aBool9335 = aBool9335;
		class176_sub3_1888_.aBool9336 = aBool9336;
		boolean bool_1891_ = Class337.method5904(i, anInt9298);
		boolean bool_1892_ = Class337.method5905(i, anInt9298);
		boolean bool_1893_ = Class337.method5906(i, anInt9298);
		boolean bool_1894_ = bool_1891_ | bool_1892_ | bool_1893_;
		if (bool_1894_) {
			if (bool_1891_) {
				if (class176_sub3_1889_.anIntArray9352 == null || class176_sub3_1889_.anIntArray9352.length < anInt9301)
					class176_sub3_1888_.anIntArray9352 = class176_sub3_1889_.anIntArray9352 = new int[anInt9301];
				else
					class176_sub3_1888_.anIntArray9352 = class176_sub3_1889_.anIntArray9352;
			} else
				class176_sub3_1888_.anIntArray9352 = anIntArray9352;
			if (bool_1892_) {
				if (class176_sub3_1889_.anIntArray9360 == null || class176_sub3_1889_.anIntArray9360.length < anInt9301)
					class176_sub3_1888_.anIntArray9360 = class176_sub3_1889_.anIntArray9360 = new int[anInt9301];
				else
					class176_sub3_1888_.anIntArray9360 = class176_sub3_1889_.anIntArray9360;
			} else
				class176_sub3_1888_.anIntArray9360 = anIntArray9360;
			if (bool_1893_) {
				if (class176_sub3_1889_.anIntArray9362 == null || class176_sub3_1889_.anIntArray9362.length < anInt9301)
					class176_sub3_1888_.anIntArray9362 = class176_sub3_1889_.anIntArray9362 = new int[anInt9301];
				else
					class176_sub3_1888_.anIntArray9362 = class176_sub3_1889_.anIntArray9362;
			} else
				class176_sub3_1888_.anIntArray9362 = anIntArray9362;
			for (int i_1895_ = 0; i_1895_ < anInt9301; i_1895_++) {
				if (bool_1891_)
					class176_sub3_1888_.anIntArray9352[i_1895_] = anIntArray9352[i_1895_];
				if (bool_1892_)
					class176_sub3_1888_.anIntArray9360[i_1895_] = anIntArray9360[i_1895_];
				if (bool_1893_)
					class176_sub3_1888_.anIntArray9362[i_1895_] = anIntArray9362[i_1895_];
			}
		} else {
			class176_sub3_1888_.anIntArray9352 = anIntArray9352;
			class176_sub3_1888_.anIntArray9360 = anIntArray9360;
			class176_sub3_1888_.anIntArray9362 = anIntArray9362;
		}
		if (Class337.method5960(i, anInt9298)) {
			class176_sub3_1888_.aClass363_9299 = class176_sub3_1889_.aClass363_9299;
			class176_sub3_1888_.aClass363_9299.anInterface37_3856 = aClass363_9299.anInterface37_3856;
			class176_sub3_1888_.aClass363_9299.aBool3855 = aClass363_9299.aBool3855;
			class176_sub3_1888_.aClass363_9299.aBool3854 = true;
		} else if (Class337.method5916(i, anInt9298))
			class176_sub3_1888_.aClass363_9299 = aClass363_9299;
		else
			class176_sub3_1888_.aClass363_9299 = null;
		if (Class337.method5909(i, anInt9298)) {
			if (class176_sub3_1889_.aShortArray9326 == null || class176_sub3_1889_.aShortArray9326.length < anInt9369)
				class176_sub3_1888_.aShortArray9326 = class176_sub3_1889_.aShortArray9326 = new short[anInt9369];
			else
				class176_sub3_1888_.aShortArray9326 = class176_sub3_1889_.aShortArray9326;
			for (int i_1896_ = 0; i_1896_ < anInt9369; i_1896_++)
				class176_sub3_1888_.aShortArray9326[i_1896_] = aShortArray9326[i_1896_];
		} else
			class176_sub3_1888_.aShortArray9326 = aShortArray9326;
		if (Class337.method5977(i, anInt9298)) {
			if (class176_sub3_1889_.aByteArray9321 == null || class176_sub3_1889_.aByteArray9321.length < anInt9369)
				class176_sub3_1888_.aByteArray9321 = class176_sub3_1889_.aByteArray9321 = new byte[anInt9369];
			else
				class176_sub3_1888_.aByteArray9321 = class176_sub3_1889_.aByteArray9321;
			for (int i_1897_ = 0; i_1897_ < anInt9369; i_1897_++)
				class176_sub3_1888_.aByteArray9321[i_1897_] = aByteArray9321[i_1897_];
		} else
			class176_sub3_1888_.aByteArray9321 = aByteArray9321;
		if (Class337.method5923(i, anInt9298)) {
			class176_sub3_1888_.aClass363_9334 = class176_sub3_1889_.aClass363_9334;
			class176_sub3_1888_.aClass363_9334.anInterface37_3856 = aClass363_9334.anInterface37_3856;
			class176_sub3_1888_.aClass363_9334.aBool3855 = aClass363_9334.aBool3855;
			class176_sub3_1888_.aClass363_9334.aBool3854 = true;
		} else if (Class337.method5915(i, anInt9298))
			class176_sub3_1888_.aClass363_9334 = aClass363_9334;
		else
			class176_sub3_1888_.aClass363_9334 = null;
		if (Class337.method5908(i, anInt9298)) {
			if (class176_sub3_1889_.aShortArray9311 == null || class176_sub3_1889_.aShortArray9311.length < anInt9308) {
				int i_1898_ = anInt9308;
				class176_sub3_1888_.aShortArray9311 = class176_sub3_1889_.aShortArray9311 = new short[i_1898_];
				class176_sub3_1888_.aShortArray9305 = class176_sub3_1889_.aShortArray9305 = new short[i_1898_];
				class176_sub3_1888_.aShortArray9313 = class176_sub3_1889_.aShortArray9313 = new short[i_1898_];
			} else {
				class176_sub3_1888_.aShortArray9311 = class176_sub3_1889_.aShortArray9311;
				class176_sub3_1888_.aShortArray9305 = class176_sub3_1889_.aShortArray9305;
				class176_sub3_1888_.aShortArray9313 = class176_sub3_1889_.aShortArray9313;
			}
			if (aClass379_9317 != null) {
				if (class176_sub3_1889_.aClass379_9317 == null)
					class176_sub3_1889_.aClass379_9317 = new Class379();
				Class379 class379 = (class176_sub3_1888_.aClass379_9317 = class176_sub3_1889_.aClass379_9317);
				if (class379.aShortArray3928 == null || class379.aShortArray3928.length < anInt9308) {
					int i_1899_ = anInt9308;
					class379.aShortArray3928 = new short[i_1899_];
					class379.aShortArray3929 = new short[i_1899_];
					class379.aShortArray3930 = new short[i_1899_];
					class379.aByteArray3931 = new byte[i_1899_];
				}
				for (int i_1900_ = 0; i_1900_ < anInt9308; i_1900_++) {
					class176_sub3_1888_.aShortArray9311[i_1900_] = aShortArray9311[i_1900_];
					class176_sub3_1888_.aShortArray9305[i_1900_] = aShortArray9305[i_1900_];
					class176_sub3_1888_.aShortArray9313[i_1900_] = aShortArray9313[i_1900_];
					class379.aShortArray3928[i_1900_] = aClass379_9317.aShortArray3928[i_1900_];
					class379.aShortArray3929[i_1900_] = aClass379_9317.aShortArray3929[i_1900_];
					class379.aShortArray3930[i_1900_] = aClass379_9317.aShortArray3930[i_1900_];
					class379.aByteArray3931[i_1900_] = aClass379_9317.aByteArray3931[i_1900_];
				}
			} else {
				class176_sub3_1888_.aClass379_9317 = null;
				for (int i_1901_ = 0; i_1901_ < anInt9308; i_1901_++) {
					class176_sub3_1888_.aShortArray9311[i_1901_] = aShortArray9311[i_1901_];
					class176_sub3_1888_.aShortArray9305[i_1901_] = aShortArray9305[i_1901_];
					class176_sub3_1888_.aShortArray9313[i_1901_] = aShortArray9313[i_1901_];
				}
			}
			class176_sub3_1888_.aByteArray9314 = aByteArray9314;
		} else {
			class176_sub3_1888_.aClass379_9317 = aClass379_9317;
			class176_sub3_1888_.aShortArray9311 = aShortArray9311;
			class176_sub3_1888_.aShortArray9305 = aShortArray9305;
			class176_sub3_1888_.aShortArray9313 = aShortArray9313;
			class176_sub3_1888_.aByteArray9314 = aByteArray9314;
		}
		if (Class337.method5975(i, anInt9298)) {
			class176_sub3_1888_.aClass363_9368 = class176_sub3_1889_.aClass363_9368;
			class176_sub3_1888_.aClass363_9368.anInterface37_3856 = aClass363_9368.anInterface37_3856;
			class176_sub3_1888_.aClass363_9368.aBool3855 = aClass363_9368.aBool3855;
			class176_sub3_1888_.aClass363_9368.aBool3854 = true;
		} else if (Class337.method5917(i, anInt9298))
			class176_sub3_1888_.aClass363_9368 = aClass363_9368;
		else
			class176_sub3_1888_.aClass363_9368 = null;
		if (Class337.method5911(i, anInt9298)) {
			if (class176_sub3_1889_.aFloatArray9315 == null || class176_sub3_1889_.aFloatArray9315.length < anInt9369) {
				int i_1902_ = anInt9308;
				class176_sub3_1888_.aFloatArray9315 = class176_sub3_1889_.aFloatArray9315 = new float[i_1902_];
				class176_sub3_1888_.aFloatArray9316 = class176_sub3_1889_.aFloatArray9316 = new float[i_1902_];
			} else {
				class176_sub3_1888_.aFloatArray9315 = class176_sub3_1889_.aFloatArray9315;
				class176_sub3_1888_.aFloatArray9316 = class176_sub3_1889_.aFloatArray9316;
			}
			for (int i_1903_ = 0; i_1903_ < anInt9308; i_1903_++) {
				class176_sub3_1888_.aFloatArray9315[i_1903_] = aFloatArray9315[i_1903_];
				class176_sub3_1888_.aFloatArray9316[i_1903_] = aFloatArray9316[i_1903_];
			}
		} else {
			class176_sub3_1888_.aFloatArray9315 = aFloatArray9315;
			class176_sub3_1888_.aFloatArray9316 = aFloatArray9316;
		}
		if (Class337.method5924(i, anInt9298)) {
			class176_sub3_1888_.aClass363_9332 = class176_sub3_1889_.aClass363_9332;
			class176_sub3_1888_.aClass363_9332.anInterface37_3856 = aClass363_9332.anInterface37_3856;
			class176_sub3_1888_.aClass363_9332.aBool3855 = aClass363_9332.aBool3855;
			class176_sub3_1888_.aClass363_9332.aBool3854 = true;
		} else if (Class337.method5919(i, anInt9298))
			class176_sub3_1888_.aClass363_9332 = aClass363_9332;
		else
			class176_sub3_1888_.aClass363_9332 = null;
		if (Class337.method5913(i, anInt9298)) {
			if (class176_sub3_1889_.aShortArray9322 == null || class176_sub3_1889_.aShortArray9322.length < anInt9369) {
				int i_1904_ = anInt9369;
				class176_sub3_1888_.aShortArray9322 = class176_sub3_1889_.aShortArray9322 = new short[i_1904_];
				class176_sub3_1888_.aShortArray9323 = class176_sub3_1889_.aShortArray9323 = new short[i_1904_];
				class176_sub3_1888_.aShortArray9324 = class176_sub3_1889_.aShortArray9324 = new short[i_1904_];
			} else {
				class176_sub3_1888_.aShortArray9322 = class176_sub3_1889_.aShortArray9322;
				class176_sub3_1888_.aShortArray9323 = class176_sub3_1889_.aShortArray9323;
				class176_sub3_1888_.aShortArray9324 = class176_sub3_1889_.aShortArray9324;
			}
			for (int i_1905_ = 0; i_1905_ < anInt9369; i_1905_++) {
				class176_sub3_1888_.aShortArray9322[i_1905_] = aShortArray9322[i_1905_];
				class176_sub3_1888_.aShortArray9323[i_1905_] = aShortArray9323[i_1905_];
				class176_sub3_1888_.aShortArray9324[i_1905_] = aShortArray9324[i_1905_];
			}
		} else {
			class176_sub3_1888_.aShortArray9322 = aShortArray9322;
			class176_sub3_1888_.aShortArray9323 = aShortArray9323;
			class176_sub3_1888_.aShortArray9324 = aShortArray9324;
		}
		if (Class337.method5925(i, anInt9298)) {
			class176_sub3_1888_.aClass344_9361 = class176_sub3_1889_.aClass344_9361;
			class176_sub3_1888_.aClass344_9361.anInterface44_3693 = aClass344_9361.anInterface44_3693;
			class176_sub3_1888_.aClass344_9361.aBool3695 = aClass344_9361.aBool3695;
			class176_sub3_1888_.aClass344_9361.aBool3694 = true;
		} else if (Class337.method5920(i, anInt9298))
			class176_sub3_1888_.aClass344_9361 = aClass344_9361;
		else
			class176_sub3_1888_.aClass344_9361 = null;
		if (Class337.method5956(i, anInt9298)) {
			if (class176_sub3_1889_.aShortArray9325 == null || class176_sub3_1889_.aShortArray9325.length < anInt9369) {
				int i_1906_ = anInt9369;
				class176_sub3_1888_.aShortArray9325 = class176_sub3_1889_.aShortArray9325 = new short[i_1906_];
			} else
				class176_sub3_1888_.aShortArray9325 = class176_sub3_1889_.aShortArray9325;
			for (int i_1907_ = 0; i_1907_ < anInt9369; i_1907_++)
				class176_sub3_1888_.aShortArray9325[i_1907_] = aShortArray9325[i_1907_];
		} else
			class176_sub3_1888_.aShortArray9325 = aShortArray9325;
		if (Class337.method5918(i, anInt9298)) {
			if (class176_sub3_1889_.aClass354Array9347 == null || class176_sub3_1889_.aClass354Array9347.length < anInt9355) {
				int i_1908_ = anInt9355;
				class176_sub3_1888_.aClass354Array9347 = class176_sub3_1889_.aClass354Array9347 = new Class354[i_1908_];
				for (int i_1909_ = 0; i_1909_ < anInt9355; i_1909_++)
					class176_sub3_1888_.aClass354Array9347[i_1909_] = aClass354Array9347[i_1909_].method6256();
			} else {
				class176_sub3_1888_.aClass354Array9347 = class176_sub3_1889_.aClass354Array9347;
				for (int i_1910_ = 0; i_1910_ < anInt9355; i_1910_++)
					class176_sub3_1888_.aClass354Array9347[i_1910_].method6258(aClass354Array9347[i_1910_]);
			}
		} else
			class176_sub3_1888_.aClass354Array9347 = aClass354Array9347;
		class176_sub3_1888_.aClass361Array9356 = aClass361Array9356;
		if (aBool9304) {
			class176_sub3_1888_.anInt9337 = anInt9337;
			class176_sub3_1888_.anInt9331 = anInt9331;
			class176_sub3_1888_.anInt9342 = anInt9342;
			class176_sub3_1888_.anInt9343 = anInt9343;
			class176_sub3_1888_.anInt9340 = anInt9340;
			class176_sub3_1888_.anInt9318 = anInt9318;
			class176_sub3_1888_.anInt9344 = anInt9344;
			class176_sub3_1888_.anInt9345 = anInt9345;
			class176_sub3_1888_.aBool9304 = true;
		} else
			class176_sub3_1888_.aBool9304 = false;
		if (aBool9346) {
			class176_sub3_1888_.anInt9309 = anInt9309;
			class176_sub3_1888_.aBool9346 = true;
		} else
			class176_sub3_1888_.aBool9346 = false;
		class176_sub3_1888_.anIntArrayArray9306 = anIntArrayArray9306;
		class176_sub3_1888_.anIntArrayArray9310 = anIntArrayArray9310;
		class176_sub3_1888_.anIntArrayArray9329 = anIntArrayArray9329;
		class176_sub3_1888_.aShortArray9366 = aShortArray9366;
		class176_sub3_1888_.anIntArray9351 = anIntArray9351;
		class176_sub3_1888_.aShortArray9333 = aShortArray9333;
		class176_sub3_1888_.aShortArray9358 = aShortArray9358;
		class176_sub3_1888_.aShortArray9307 = aShortArray9307;
		class176_sub3_1888_.aShortArray9327 = aShortArray9327;
		class176_sub3_1888_.anIntArray9348 = anIntArray9348;
		class176_sub3_1888_.anIntArray9350 = anIntArray9350;
		class176_sub3_1888_.anIntArray9349 = anIntArray9349;
		class176_sub3_1888_.aClass167Array9303 = aClass167Array9303;
		class176_sub3_1888_.aClass159Array9354 = aClass159Array9354;
		return class176_sub3_1888_;
	}

	Class176 method14787(Class176_Sub3 class176_sub3_1911_, Class176_Sub3 class176_sub3_1912_, int i, boolean bool, boolean bool_1913_) {
		class176_sub3_1911_.anInt9297 = i;
		class176_sub3_1911_.anInt9298 = anInt9298;
		class176_sub3_1911_.aShort9339 = aShort9339;
		class176_sub3_1911_.aShort9300 = aShort9300;
		class176_sub3_1911_.anInt9301 = anInt9301;
		class176_sub3_1911_.anInt9302 = anInt9302;
		class176_sub3_1911_.anInt9308 = anInt9308;
		class176_sub3_1911_.anInt9369 = anInt9369;
		class176_sub3_1911_.anInt9319 = anInt9319;
		class176_sub3_1911_.anInt9355 = anInt9355;
		if ((i & 0x100) != 0)
			class176_sub3_1911_.aBool9335 = true;
		else
			class176_sub3_1911_.aBool9335 = aBool9335;
		class176_sub3_1911_.aBool9336 = aBool9336;
		boolean bool_1914_ = Class337.method5904(i, anInt9298);
		boolean bool_1915_ = Class337.method5905(i, anInt9298);
		boolean bool_1916_ = Class337.method5906(i, anInt9298);
		boolean bool_1917_ = bool_1914_ | bool_1915_ | bool_1916_;
		if (bool_1917_) {
			if (bool_1914_) {
				if (class176_sub3_1912_.anIntArray9352 == null || class176_sub3_1912_.anIntArray9352.length < anInt9301)
					class176_sub3_1911_.anIntArray9352 = class176_sub3_1912_.anIntArray9352 = new int[anInt9301];
				else
					class176_sub3_1911_.anIntArray9352 = class176_sub3_1912_.anIntArray9352;
			} else
				class176_sub3_1911_.anIntArray9352 = anIntArray9352;
			if (bool_1915_) {
				if (class176_sub3_1912_.anIntArray9360 == null || class176_sub3_1912_.anIntArray9360.length < anInt9301)
					class176_sub3_1911_.anIntArray9360 = class176_sub3_1912_.anIntArray9360 = new int[anInt9301];
				else
					class176_sub3_1911_.anIntArray9360 = class176_sub3_1912_.anIntArray9360;
			} else
				class176_sub3_1911_.anIntArray9360 = anIntArray9360;
			if (bool_1916_) {
				if (class176_sub3_1912_.anIntArray9362 == null || class176_sub3_1912_.anIntArray9362.length < anInt9301)
					class176_sub3_1911_.anIntArray9362 = class176_sub3_1912_.anIntArray9362 = new int[anInt9301];
				else
					class176_sub3_1911_.anIntArray9362 = class176_sub3_1912_.anIntArray9362;
			} else
				class176_sub3_1911_.anIntArray9362 = anIntArray9362;
			for (int i_1918_ = 0; i_1918_ < anInt9301; i_1918_++) {
				if (bool_1914_)
					class176_sub3_1911_.anIntArray9352[i_1918_] = anIntArray9352[i_1918_];
				if (bool_1915_)
					class176_sub3_1911_.anIntArray9360[i_1918_] = anIntArray9360[i_1918_];
				if (bool_1916_)
					class176_sub3_1911_.anIntArray9362[i_1918_] = anIntArray9362[i_1918_];
			}
		} else {
			class176_sub3_1911_.anIntArray9352 = anIntArray9352;
			class176_sub3_1911_.anIntArray9360 = anIntArray9360;
			class176_sub3_1911_.anIntArray9362 = anIntArray9362;
		}
		if (Class337.method5960(i, anInt9298)) {
			class176_sub3_1911_.aClass363_9299 = class176_sub3_1912_.aClass363_9299;
			class176_sub3_1911_.aClass363_9299.anInterface37_3856 = aClass363_9299.anInterface37_3856;
			class176_sub3_1911_.aClass363_9299.aBool3855 = aClass363_9299.aBool3855;
			class176_sub3_1911_.aClass363_9299.aBool3854 = true;
		} else if (Class337.method5916(i, anInt9298))
			class176_sub3_1911_.aClass363_9299 = aClass363_9299;
		else
			class176_sub3_1911_.aClass363_9299 = null;
		if (Class337.method5909(i, anInt9298)) {
			if (class176_sub3_1912_.aShortArray9326 == null || class176_sub3_1912_.aShortArray9326.length < anInt9369)
				class176_sub3_1911_.aShortArray9326 = class176_sub3_1912_.aShortArray9326 = new short[anInt9369];
			else
				class176_sub3_1911_.aShortArray9326 = class176_sub3_1912_.aShortArray9326;
			for (int i_1919_ = 0; i_1919_ < anInt9369; i_1919_++)
				class176_sub3_1911_.aShortArray9326[i_1919_] = aShortArray9326[i_1919_];
		} else
			class176_sub3_1911_.aShortArray9326 = aShortArray9326;
		if (Class337.method5977(i, anInt9298)) {
			if (class176_sub3_1912_.aByteArray9321 == null || class176_sub3_1912_.aByteArray9321.length < anInt9369)
				class176_sub3_1911_.aByteArray9321 = class176_sub3_1912_.aByteArray9321 = new byte[anInt9369];
			else
				class176_sub3_1911_.aByteArray9321 = class176_sub3_1912_.aByteArray9321;
			for (int i_1920_ = 0; i_1920_ < anInt9369; i_1920_++)
				class176_sub3_1911_.aByteArray9321[i_1920_] = aByteArray9321[i_1920_];
		} else
			class176_sub3_1911_.aByteArray9321 = aByteArray9321;
		if (Class337.method5923(i, anInt9298)) {
			class176_sub3_1911_.aClass363_9334 = class176_sub3_1912_.aClass363_9334;
			class176_sub3_1911_.aClass363_9334.anInterface37_3856 = aClass363_9334.anInterface37_3856;
			class176_sub3_1911_.aClass363_9334.aBool3855 = aClass363_9334.aBool3855;
			class176_sub3_1911_.aClass363_9334.aBool3854 = true;
		} else if (Class337.method5915(i, anInt9298))
			class176_sub3_1911_.aClass363_9334 = aClass363_9334;
		else
			class176_sub3_1911_.aClass363_9334 = null;
		if (Class337.method5908(i, anInt9298)) {
			if (class176_sub3_1912_.aShortArray9311 == null || class176_sub3_1912_.aShortArray9311.length < anInt9308) {
				int i_1921_ = anInt9308;
				class176_sub3_1911_.aShortArray9311 = class176_sub3_1912_.aShortArray9311 = new short[i_1921_];
				class176_sub3_1911_.aShortArray9305 = class176_sub3_1912_.aShortArray9305 = new short[i_1921_];
				class176_sub3_1911_.aShortArray9313 = class176_sub3_1912_.aShortArray9313 = new short[i_1921_];
			} else {
				class176_sub3_1911_.aShortArray9311 = class176_sub3_1912_.aShortArray9311;
				class176_sub3_1911_.aShortArray9305 = class176_sub3_1912_.aShortArray9305;
				class176_sub3_1911_.aShortArray9313 = class176_sub3_1912_.aShortArray9313;
			}
			if (aClass379_9317 != null) {
				if (class176_sub3_1912_.aClass379_9317 == null)
					class176_sub3_1912_.aClass379_9317 = new Class379();
				Class379 class379 = (class176_sub3_1911_.aClass379_9317 = class176_sub3_1912_.aClass379_9317);
				if (class379.aShortArray3928 == null || class379.aShortArray3928.length < anInt9308) {
					int i_1922_ = anInt9308;
					class379.aShortArray3928 = new short[i_1922_];
					class379.aShortArray3929 = new short[i_1922_];
					class379.aShortArray3930 = new short[i_1922_];
					class379.aByteArray3931 = new byte[i_1922_];
				}
				for (int i_1923_ = 0; i_1923_ < anInt9308; i_1923_++) {
					class176_sub3_1911_.aShortArray9311[i_1923_] = aShortArray9311[i_1923_];
					class176_sub3_1911_.aShortArray9305[i_1923_] = aShortArray9305[i_1923_];
					class176_sub3_1911_.aShortArray9313[i_1923_] = aShortArray9313[i_1923_];
					class379.aShortArray3928[i_1923_] = aClass379_9317.aShortArray3928[i_1923_];
					class379.aShortArray3929[i_1923_] = aClass379_9317.aShortArray3929[i_1923_];
					class379.aShortArray3930[i_1923_] = aClass379_9317.aShortArray3930[i_1923_];
					class379.aByteArray3931[i_1923_] = aClass379_9317.aByteArray3931[i_1923_];
				}
			} else {
				class176_sub3_1911_.aClass379_9317 = null;
				for (int i_1924_ = 0; i_1924_ < anInt9308; i_1924_++) {
					class176_sub3_1911_.aShortArray9311[i_1924_] = aShortArray9311[i_1924_];
					class176_sub3_1911_.aShortArray9305[i_1924_] = aShortArray9305[i_1924_];
					class176_sub3_1911_.aShortArray9313[i_1924_] = aShortArray9313[i_1924_];
				}
			}
			class176_sub3_1911_.aByteArray9314 = aByteArray9314;
		} else {
			class176_sub3_1911_.aClass379_9317 = aClass379_9317;
			class176_sub3_1911_.aShortArray9311 = aShortArray9311;
			class176_sub3_1911_.aShortArray9305 = aShortArray9305;
			class176_sub3_1911_.aShortArray9313 = aShortArray9313;
			class176_sub3_1911_.aByteArray9314 = aByteArray9314;
		}
		if (Class337.method5975(i, anInt9298)) {
			class176_sub3_1911_.aClass363_9368 = class176_sub3_1912_.aClass363_9368;
			class176_sub3_1911_.aClass363_9368.anInterface37_3856 = aClass363_9368.anInterface37_3856;
			class176_sub3_1911_.aClass363_9368.aBool3855 = aClass363_9368.aBool3855;
			class176_sub3_1911_.aClass363_9368.aBool3854 = true;
		} else if (Class337.method5917(i, anInt9298))
			class176_sub3_1911_.aClass363_9368 = aClass363_9368;
		else
			class176_sub3_1911_.aClass363_9368 = null;
		if (Class337.method5911(i, anInt9298)) {
			if (class176_sub3_1912_.aFloatArray9315 == null || class176_sub3_1912_.aFloatArray9315.length < anInt9369) {
				int i_1925_ = anInt9308;
				class176_sub3_1911_.aFloatArray9315 = class176_sub3_1912_.aFloatArray9315 = new float[i_1925_];
				class176_sub3_1911_.aFloatArray9316 = class176_sub3_1912_.aFloatArray9316 = new float[i_1925_];
			} else {
				class176_sub3_1911_.aFloatArray9315 = class176_sub3_1912_.aFloatArray9315;
				class176_sub3_1911_.aFloatArray9316 = class176_sub3_1912_.aFloatArray9316;
			}
			for (int i_1926_ = 0; i_1926_ < anInt9308; i_1926_++) {
				class176_sub3_1911_.aFloatArray9315[i_1926_] = aFloatArray9315[i_1926_];
				class176_sub3_1911_.aFloatArray9316[i_1926_] = aFloatArray9316[i_1926_];
			}
		} else {
			class176_sub3_1911_.aFloatArray9315 = aFloatArray9315;
			class176_sub3_1911_.aFloatArray9316 = aFloatArray9316;
		}
		if (Class337.method5924(i, anInt9298)) {
			class176_sub3_1911_.aClass363_9332 = class176_sub3_1912_.aClass363_9332;
			class176_sub3_1911_.aClass363_9332.anInterface37_3856 = aClass363_9332.anInterface37_3856;
			class176_sub3_1911_.aClass363_9332.aBool3855 = aClass363_9332.aBool3855;
			class176_sub3_1911_.aClass363_9332.aBool3854 = true;
		} else if (Class337.method5919(i, anInt9298))
			class176_sub3_1911_.aClass363_9332 = aClass363_9332;
		else
			class176_sub3_1911_.aClass363_9332 = null;
		if (Class337.method5913(i, anInt9298)) {
			if (class176_sub3_1912_.aShortArray9322 == null || class176_sub3_1912_.aShortArray9322.length < anInt9369) {
				int i_1927_ = anInt9369;
				class176_sub3_1911_.aShortArray9322 = class176_sub3_1912_.aShortArray9322 = new short[i_1927_];
				class176_sub3_1911_.aShortArray9323 = class176_sub3_1912_.aShortArray9323 = new short[i_1927_];
				class176_sub3_1911_.aShortArray9324 = class176_sub3_1912_.aShortArray9324 = new short[i_1927_];
			} else {
				class176_sub3_1911_.aShortArray9322 = class176_sub3_1912_.aShortArray9322;
				class176_sub3_1911_.aShortArray9323 = class176_sub3_1912_.aShortArray9323;
				class176_sub3_1911_.aShortArray9324 = class176_sub3_1912_.aShortArray9324;
			}
			for (int i_1928_ = 0; i_1928_ < anInt9369; i_1928_++) {
				class176_sub3_1911_.aShortArray9322[i_1928_] = aShortArray9322[i_1928_];
				class176_sub3_1911_.aShortArray9323[i_1928_] = aShortArray9323[i_1928_];
				class176_sub3_1911_.aShortArray9324[i_1928_] = aShortArray9324[i_1928_];
			}
		} else {
			class176_sub3_1911_.aShortArray9322 = aShortArray9322;
			class176_sub3_1911_.aShortArray9323 = aShortArray9323;
			class176_sub3_1911_.aShortArray9324 = aShortArray9324;
		}
		if (Class337.method5925(i, anInt9298)) {
			class176_sub3_1911_.aClass344_9361 = class176_sub3_1912_.aClass344_9361;
			class176_sub3_1911_.aClass344_9361.anInterface44_3693 = aClass344_9361.anInterface44_3693;
			class176_sub3_1911_.aClass344_9361.aBool3695 = aClass344_9361.aBool3695;
			class176_sub3_1911_.aClass344_9361.aBool3694 = true;
		} else if (Class337.method5920(i, anInt9298))
			class176_sub3_1911_.aClass344_9361 = aClass344_9361;
		else
			class176_sub3_1911_.aClass344_9361 = null;
		if (Class337.method5956(i, anInt9298)) {
			if (class176_sub3_1912_.aShortArray9325 == null || class176_sub3_1912_.aShortArray9325.length < anInt9369) {
				int i_1929_ = anInt9369;
				class176_sub3_1911_.aShortArray9325 = class176_sub3_1912_.aShortArray9325 = new short[i_1929_];
			} else
				class176_sub3_1911_.aShortArray9325 = class176_sub3_1912_.aShortArray9325;
			for (int i_1930_ = 0; i_1930_ < anInt9369; i_1930_++)
				class176_sub3_1911_.aShortArray9325[i_1930_] = aShortArray9325[i_1930_];
		} else
			class176_sub3_1911_.aShortArray9325 = aShortArray9325;
		if (Class337.method5918(i, anInt9298)) {
			if (class176_sub3_1912_.aClass354Array9347 == null || class176_sub3_1912_.aClass354Array9347.length < anInt9355) {
				int i_1931_ = anInt9355;
				class176_sub3_1911_.aClass354Array9347 = class176_sub3_1912_.aClass354Array9347 = new Class354[i_1931_];
				for (int i_1932_ = 0; i_1932_ < anInt9355; i_1932_++)
					class176_sub3_1911_.aClass354Array9347[i_1932_] = aClass354Array9347[i_1932_].method6256();
			} else {
				class176_sub3_1911_.aClass354Array9347 = class176_sub3_1912_.aClass354Array9347;
				for (int i_1933_ = 0; i_1933_ < anInt9355; i_1933_++)
					class176_sub3_1911_.aClass354Array9347[i_1933_].method6258(aClass354Array9347[i_1933_]);
			}
		} else
			class176_sub3_1911_.aClass354Array9347 = aClass354Array9347;
		class176_sub3_1911_.aClass361Array9356 = aClass361Array9356;
		if (aBool9304) {
			class176_sub3_1911_.anInt9337 = anInt9337;
			class176_sub3_1911_.anInt9331 = anInt9331;
			class176_sub3_1911_.anInt9342 = anInt9342;
			class176_sub3_1911_.anInt9343 = anInt9343;
			class176_sub3_1911_.anInt9340 = anInt9340;
			class176_sub3_1911_.anInt9318 = anInt9318;
			class176_sub3_1911_.anInt9344 = anInt9344;
			class176_sub3_1911_.anInt9345 = anInt9345;
			class176_sub3_1911_.aBool9304 = true;
		} else
			class176_sub3_1911_.aBool9304 = false;
		if (aBool9346) {
			class176_sub3_1911_.anInt9309 = anInt9309;
			class176_sub3_1911_.aBool9346 = true;
		} else
			class176_sub3_1911_.aBool9346 = false;
		class176_sub3_1911_.anIntArrayArray9306 = anIntArrayArray9306;
		class176_sub3_1911_.anIntArrayArray9310 = anIntArrayArray9310;
		class176_sub3_1911_.anIntArrayArray9329 = anIntArrayArray9329;
		class176_sub3_1911_.aShortArray9366 = aShortArray9366;
		class176_sub3_1911_.anIntArray9351 = anIntArray9351;
		class176_sub3_1911_.aShortArray9333 = aShortArray9333;
		class176_sub3_1911_.aShortArray9358 = aShortArray9358;
		class176_sub3_1911_.aShortArray9307 = aShortArray9307;
		class176_sub3_1911_.aShortArray9327 = aShortArray9327;
		class176_sub3_1911_.anIntArray9348 = anIntArray9348;
		class176_sub3_1911_.anIntArray9350 = anIntArray9350;
		class176_sub3_1911_.anIntArray9349 = anIntArray9349;
		class176_sub3_1911_.aClass167Array9303 = aClass167Array9303;
		class176_sub3_1911_.aClass159Array9354 = aClass159Array9354;
		return class176_sub3_1911_;
	}

	void method14788() {
		if (aClass363_9299 != null)
			aClass363_9299.aBool3855 = false;
	}

	Class176 method14789(Class176_Sub3 class176_sub3_1934_, Class176_Sub3 class176_sub3_1935_, int i, boolean bool, boolean bool_1936_) {
		class176_sub3_1934_.anInt9297 = i;
		class176_sub3_1934_.anInt9298 = anInt9298;
		class176_sub3_1934_.aShort9339 = aShort9339;
		class176_sub3_1934_.aShort9300 = aShort9300;
		class176_sub3_1934_.anInt9301 = anInt9301;
		class176_sub3_1934_.anInt9302 = anInt9302;
		class176_sub3_1934_.anInt9308 = anInt9308;
		class176_sub3_1934_.anInt9369 = anInt9369;
		class176_sub3_1934_.anInt9319 = anInt9319;
		class176_sub3_1934_.anInt9355 = anInt9355;
		if ((i & 0x100) != 0)
			class176_sub3_1934_.aBool9335 = true;
		else
			class176_sub3_1934_.aBool9335 = aBool9335;
		class176_sub3_1934_.aBool9336 = aBool9336;
		boolean bool_1937_ = Class337.method5904(i, anInt9298);
		boolean bool_1938_ = Class337.method5905(i, anInt9298);
		boolean bool_1939_ = Class337.method5906(i, anInt9298);
		boolean bool_1940_ = bool_1937_ | bool_1938_ | bool_1939_;
		if (bool_1940_) {
			if (bool_1937_) {
				if (class176_sub3_1935_.anIntArray9352 == null || class176_sub3_1935_.anIntArray9352.length < anInt9301)
					class176_sub3_1934_.anIntArray9352 = class176_sub3_1935_.anIntArray9352 = new int[anInt9301];
				else
					class176_sub3_1934_.anIntArray9352 = class176_sub3_1935_.anIntArray9352;
			} else
				class176_sub3_1934_.anIntArray9352 = anIntArray9352;
			if (bool_1938_) {
				if (class176_sub3_1935_.anIntArray9360 == null || class176_sub3_1935_.anIntArray9360.length < anInt9301)
					class176_sub3_1934_.anIntArray9360 = class176_sub3_1935_.anIntArray9360 = new int[anInt9301];
				else
					class176_sub3_1934_.anIntArray9360 = class176_sub3_1935_.anIntArray9360;
			} else
				class176_sub3_1934_.anIntArray9360 = anIntArray9360;
			if (bool_1939_) {
				if (class176_sub3_1935_.anIntArray9362 == null || class176_sub3_1935_.anIntArray9362.length < anInt9301)
					class176_sub3_1934_.anIntArray9362 = class176_sub3_1935_.anIntArray9362 = new int[anInt9301];
				else
					class176_sub3_1934_.anIntArray9362 = class176_sub3_1935_.anIntArray9362;
			} else
				class176_sub3_1934_.anIntArray9362 = anIntArray9362;
			for (int i_1941_ = 0; i_1941_ < anInt9301; i_1941_++) {
				if (bool_1937_)
					class176_sub3_1934_.anIntArray9352[i_1941_] = anIntArray9352[i_1941_];
				if (bool_1938_)
					class176_sub3_1934_.anIntArray9360[i_1941_] = anIntArray9360[i_1941_];
				if (bool_1939_)
					class176_sub3_1934_.anIntArray9362[i_1941_] = anIntArray9362[i_1941_];
			}
		} else {
			class176_sub3_1934_.anIntArray9352 = anIntArray9352;
			class176_sub3_1934_.anIntArray9360 = anIntArray9360;
			class176_sub3_1934_.anIntArray9362 = anIntArray9362;
		}
		if (Class337.method5960(i, anInt9298)) {
			class176_sub3_1934_.aClass363_9299 = class176_sub3_1935_.aClass363_9299;
			class176_sub3_1934_.aClass363_9299.anInterface37_3856 = aClass363_9299.anInterface37_3856;
			class176_sub3_1934_.aClass363_9299.aBool3855 = aClass363_9299.aBool3855;
			class176_sub3_1934_.aClass363_9299.aBool3854 = true;
		} else if (Class337.method5916(i, anInt9298))
			class176_sub3_1934_.aClass363_9299 = aClass363_9299;
		else
			class176_sub3_1934_.aClass363_9299 = null;
		if (Class337.method5909(i, anInt9298)) {
			if (class176_sub3_1935_.aShortArray9326 == null || class176_sub3_1935_.aShortArray9326.length < anInt9369)
				class176_sub3_1934_.aShortArray9326 = class176_sub3_1935_.aShortArray9326 = new short[anInt9369];
			else
				class176_sub3_1934_.aShortArray9326 = class176_sub3_1935_.aShortArray9326;
			for (int i_1942_ = 0; i_1942_ < anInt9369; i_1942_++)
				class176_sub3_1934_.aShortArray9326[i_1942_] = aShortArray9326[i_1942_];
		} else
			class176_sub3_1934_.aShortArray9326 = aShortArray9326;
		if (Class337.method5977(i, anInt9298)) {
			if (class176_sub3_1935_.aByteArray9321 == null || class176_sub3_1935_.aByteArray9321.length < anInt9369)
				class176_sub3_1934_.aByteArray9321 = class176_sub3_1935_.aByteArray9321 = new byte[anInt9369];
			else
				class176_sub3_1934_.aByteArray9321 = class176_sub3_1935_.aByteArray9321;
			for (int i_1943_ = 0; i_1943_ < anInt9369; i_1943_++)
				class176_sub3_1934_.aByteArray9321[i_1943_] = aByteArray9321[i_1943_];
		} else
			class176_sub3_1934_.aByteArray9321 = aByteArray9321;
		if (Class337.method5923(i, anInt9298)) {
			class176_sub3_1934_.aClass363_9334 = class176_sub3_1935_.aClass363_9334;
			class176_sub3_1934_.aClass363_9334.anInterface37_3856 = aClass363_9334.anInterface37_3856;
			class176_sub3_1934_.aClass363_9334.aBool3855 = aClass363_9334.aBool3855;
			class176_sub3_1934_.aClass363_9334.aBool3854 = true;
		} else if (Class337.method5915(i, anInt9298))
			class176_sub3_1934_.aClass363_9334 = aClass363_9334;
		else
			class176_sub3_1934_.aClass363_9334 = null;
		if (Class337.method5908(i, anInt9298)) {
			if (class176_sub3_1935_.aShortArray9311 == null || class176_sub3_1935_.aShortArray9311.length < anInt9308) {
				int i_1944_ = anInt9308;
				class176_sub3_1934_.aShortArray9311 = class176_sub3_1935_.aShortArray9311 = new short[i_1944_];
				class176_sub3_1934_.aShortArray9305 = class176_sub3_1935_.aShortArray9305 = new short[i_1944_];
				class176_sub3_1934_.aShortArray9313 = class176_sub3_1935_.aShortArray9313 = new short[i_1944_];
			} else {
				class176_sub3_1934_.aShortArray9311 = class176_sub3_1935_.aShortArray9311;
				class176_sub3_1934_.aShortArray9305 = class176_sub3_1935_.aShortArray9305;
				class176_sub3_1934_.aShortArray9313 = class176_sub3_1935_.aShortArray9313;
			}
			if (aClass379_9317 != null) {
				if (class176_sub3_1935_.aClass379_9317 == null)
					class176_sub3_1935_.aClass379_9317 = new Class379();
				Class379 class379 = (class176_sub3_1934_.aClass379_9317 = class176_sub3_1935_.aClass379_9317);
				if (class379.aShortArray3928 == null || class379.aShortArray3928.length < anInt9308) {
					int i_1945_ = anInt9308;
					class379.aShortArray3928 = new short[i_1945_];
					class379.aShortArray3929 = new short[i_1945_];
					class379.aShortArray3930 = new short[i_1945_];
					class379.aByteArray3931 = new byte[i_1945_];
				}
				for (int i_1946_ = 0; i_1946_ < anInt9308; i_1946_++) {
					class176_sub3_1934_.aShortArray9311[i_1946_] = aShortArray9311[i_1946_];
					class176_sub3_1934_.aShortArray9305[i_1946_] = aShortArray9305[i_1946_];
					class176_sub3_1934_.aShortArray9313[i_1946_] = aShortArray9313[i_1946_];
					class379.aShortArray3928[i_1946_] = aClass379_9317.aShortArray3928[i_1946_];
					class379.aShortArray3929[i_1946_] = aClass379_9317.aShortArray3929[i_1946_];
					class379.aShortArray3930[i_1946_] = aClass379_9317.aShortArray3930[i_1946_];
					class379.aByteArray3931[i_1946_] = aClass379_9317.aByteArray3931[i_1946_];
				}
			} else {
				class176_sub3_1934_.aClass379_9317 = null;
				for (int i_1947_ = 0; i_1947_ < anInt9308; i_1947_++) {
					class176_sub3_1934_.aShortArray9311[i_1947_] = aShortArray9311[i_1947_];
					class176_sub3_1934_.aShortArray9305[i_1947_] = aShortArray9305[i_1947_];
					class176_sub3_1934_.aShortArray9313[i_1947_] = aShortArray9313[i_1947_];
				}
			}
			class176_sub3_1934_.aByteArray9314 = aByteArray9314;
		} else {
			class176_sub3_1934_.aClass379_9317 = aClass379_9317;
			class176_sub3_1934_.aShortArray9311 = aShortArray9311;
			class176_sub3_1934_.aShortArray9305 = aShortArray9305;
			class176_sub3_1934_.aShortArray9313 = aShortArray9313;
			class176_sub3_1934_.aByteArray9314 = aByteArray9314;
		}
		if (Class337.method5975(i, anInt9298)) {
			class176_sub3_1934_.aClass363_9368 = class176_sub3_1935_.aClass363_9368;
			class176_sub3_1934_.aClass363_9368.anInterface37_3856 = aClass363_9368.anInterface37_3856;
			class176_sub3_1934_.aClass363_9368.aBool3855 = aClass363_9368.aBool3855;
			class176_sub3_1934_.aClass363_9368.aBool3854 = true;
		} else if (Class337.method5917(i, anInt9298))
			class176_sub3_1934_.aClass363_9368 = aClass363_9368;
		else
			class176_sub3_1934_.aClass363_9368 = null;
		if (Class337.method5911(i, anInt9298)) {
			if (class176_sub3_1935_.aFloatArray9315 == null || class176_sub3_1935_.aFloatArray9315.length < anInt9369) {
				int i_1948_ = anInt9308;
				class176_sub3_1934_.aFloatArray9315 = class176_sub3_1935_.aFloatArray9315 = new float[i_1948_];
				class176_sub3_1934_.aFloatArray9316 = class176_sub3_1935_.aFloatArray9316 = new float[i_1948_];
			} else {
				class176_sub3_1934_.aFloatArray9315 = class176_sub3_1935_.aFloatArray9315;
				class176_sub3_1934_.aFloatArray9316 = class176_sub3_1935_.aFloatArray9316;
			}
			for (int i_1949_ = 0; i_1949_ < anInt9308; i_1949_++) {
				class176_sub3_1934_.aFloatArray9315[i_1949_] = aFloatArray9315[i_1949_];
				class176_sub3_1934_.aFloatArray9316[i_1949_] = aFloatArray9316[i_1949_];
			}
		} else {
			class176_sub3_1934_.aFloatArray9315 = aFloatArray9315;
			class176_sub3_1934_.aFloatArray9316 = aFloatArray9316;
		}
		if (Class337.method5924(i, anInt9298)) {
			class176_sub3_1934_.aClass363_9332 = class176_sub3_1935_.aClass363_9332;
			class176_sub3_1934_.aClass363_9332.anInterface37_3856 = aClass363_9332.anInterface37_3856;
			class176_sub3_1934_.aClass363_9332.aBool3855 = aClass363_9332.aBool3855;
			class176_sub3_1934_.aClass363_9332.aBool3854 = true;
		} else if (Class337.method5919(i, anInt9298))
			class176_sub3_1934_.aClass363_9332 = aClass363_9332;
		else
			class176_sub3_1934_.aClass363_9332 = null;
		if (Class337.method5913(i, anInt9298)) {
			if (class176_sub3_1935_.aShortArray9322 == null || class176_sub3_1935_.aShortArray9322.length < anInt9369) {
				int i_1950_ = anInt9369;
				class176_sub3_1934_.aShortArray9322 = class176_sub3_1935_.aShortArray9322 = new short[i_1950_];
				class176_sub3_1934_.aShortArray9323 = class176_sub3_1935_.aShortArray9323 = new short[i_1950_];
				class176_sub3_1934_.aShortArray9324 = class176_sub3_1935_.aShortArray9324 = new short[i_1950_];
			} else {
				class176_sub3_1934_.aShortArray9322 = class176_sub3_1935_.aShortArray9322;
				class176_sub3_1934_.aShortArray9323 = class176_sub3_1935_.aShortArray9323;
				class176_sub3_1934_.aShortArray9324 = class176_sub3_1935_.aShortArray9324;
			}
			for (int i_1951_ = 0; i_1951_ < anInt9369; i_1951_++) {
				class176_sub3_1934_.aShortArray9322[i_1951_] = aShortArray9322[i_1951_];
				class176_sub3_1934_.aShortArray9323[i_1951_] = aShortArray9323[i_1951_];
				class176_sub3_1934_.aShortArray9324[i_1951_] = aShortArray9324[i_1951_];
			}
		} else {
			class176_sub3_1934_.aShortArray9322 = aShortArray9322;
			class176_sub3_1934_.aShortArray9323 = aShortArray9323;
			class176_sub3_1934_.aShortArray9324 = aShortArray9324;
		}
		if (Class337.method5925(i, anInt9298)) {
			class176_sub3_1934_.aClass344_9361 = class176_sub3_1935_.aClass344_9361;
			class176_sub3_1934_.aClass344_9361.anInterface44_3693 = aClass344_9361.anInterface44_3693;
			class176_sub3_1934_.aClass344_9361.aBool3695 = aClass344_9361.aBool3695;
			class176_sub3_1934_.aClass344_9361.aBool3694 = true;
		} else if (Class337.method5920(i, anInt9298))
			class176_sub3_1934_.aClass344_9361 = aClass344_9361;
		else
			class176_sub3_1934_.aClass344_9361 = null;
		if (Class337.method5956(i, anInt9298)) {
			if (class176_sub3_1935_.aShortArray9325 == null || class176_sub3_1935_.aShortArray9325.length < anInt9369) {
				int i_1952_ = anInt9369;
				class176_sub3_1934_.aShortArray9325 = class176_sub3_1935_.aShortArray9325 = new short[i_1952_];
			} else
				class176_sub3_1934_.aShortArray9325 = class176_sub3_1935_.aShortArray9325;
			for (int i_1953_ = 0; i_1953_ < anInt9369; i_1953_++)
				class176_sub3_1934_.aShortArray9325[i_1953_] = aShortArray9325[i_1953_];
		} else
			class176_sub3_1934_.aShortArray9325 = aShortArray9325;
		if (Class337.method5918(i, anInt9298)) {
			if (class176_sub3_1935_.aClass354Array9347 == null || class176_sub3_1935_.aClass354Array9347.length < anInt9355) {
				int i_1954_ = anInt9355;
				class176_sub3_1934_.aClass354Array9347 = class176_sub3_1935_.aClass354Array9347 = new Class354[i_1954_];
				for (int i_1955_ = 0; i_1955_ < anInt9355; i_1955_++)
					class176_sub3_1934_.aClass354Array9347[i_1955_] = aClass354Array9347[i_1955_].method6256();
			} else {
				class176_sub3_1934_.aClass354Array9347 = class176_sub3_1935_.aClass354Array9347;
				for (int i_1956_ = 0; i_1956_ < anInt9355; i_1956_++)
					class176_sub3_1934_.aClass354Array9347[i_1956_].method6258(aClass354Array9347[i_1956_]);
			}
		} else
			class176_sub3_1934_.aClass354Array9347 = aClass354Array9347;
		class176_sub3_1934_.aClass361Array9356 = aClass361Array9356;
		if (aBool9304) {
			class176_sub3_1934_.anInt9337 = anInt9337;
			class176_sub3_1934_.anInt9331 = anInt9331;
			class176_sub3_1934_.anInt9342 = anInt9342;
			class176_sub3_1934_.anInt9343 = anInt9343;
			class176_sub3_1934_.anInt9340 = anInt9340;
			class176_sub3_1934_.anInt9318 = anInt9318;
			class176_sub3_1934_.anInt9344 = anInt9344;
			class176_sub3_1934_.anInt9345 = anInt9345;
			class176_sub3_1934_.aBool9304 = true;
		} else
			class176_sub3_1934_.aBool9304 = false;
		if (aBool9346) {
			class176_sub3_1934_.anInt9309 = anInt9309;
			class176_sub3_1934_.aBool9346 = true;
		} else
			class176_sub3_1934_.aBool9346 = false;
		class176_sub3_1934_.anIntArrayArray9306 = anIntArrayArray9306;
		class176_sub3_1934_.anIntArrayArray9310 = anIntArrayArray9310;
		class176_sub3_1934_.anIntArrayArray9329 = anIntArrayArray9329;
		class176_sub3_1934_.aShortArray9366 = aShortArray9366;
		class176_sub3_1934_.anIntArray9351 = anIntArray9351;
		class176_sub3_1934_.aShortArray9333 = aShortArray9333;
		class176_sub3_1934_.aShortArray9358 = aShortArray9358;
		class176_sub3_1934_.aShortArray9307 = aShortArray9307;
		class176_sub3_1934_.aShortArray9327 = aShortArray9327;
		class176_sub3_1934_.anIntArray9348 = anIntArray9348;
		class176_sub3_1934_.anIntArray9350 = anIntArray9350;
		class176_sub3_1934_.anIntArray9349 = anIntArray9349;
		class176_sub3_1934_.aClass167Array9303 = aClass167Array9303;
		class176_sub3_1934_.aClass159Array9354 = aClass159Array9354;
		return class176_sub3_1934_;
	}

	void method14790() {
		if (aClass363_9334 != null)
			aClass363_9334.aBool3855 = false;
	}

	void method14791() {
		if (aClass344_9361 != null)
			aClass344_9361.aBool3695 = false;
	}

	void method14792() {
		if (aClass344_9361 != null)
			aClass344_9361.aBool3695 = false;
	}

	public void method2935(int i) {
		int i_1957_ = Class428.anIntArray4825[i];
		int i_1958_ = Class428.anIntArray4819[i];
		for (int i_1959_ = 0; i_1959_ < anInt9302; i_1959_++) {
			int i_1960_ = ((anIntArray9360[i_1959_] * i_1957_ + anIntArray9352[i_1959_] * i_1958_) >> 14);
			anIntArray9360[i_1959_] = (anIntArray9360[i_1959_] * i_1958_ - anIntArray9352[i_1959_] * i_1957_) >> 14;
			anIntArray9352[i_1959_] = i_1960_;
		}
		method14759();
		aBool9304 = false;
	}

	void method2884(int i, int[] is, int i_1961_, int i_1962_, int i_1963_, int i_1964_, boolean bool) {
		int i_1965_ = is.length;
		if (i == 0) {
			i_1961_ <<= 4;
			i_1962_ <<= 4;
			i_1963_ <<= 4;
			int i_1966_ = 0;
			anInt9357 = 0;
			anInt9367 = 0;
			anInt9353 = 0;
			for (int i_1967_ = 0; i_1967_ < i_1965_; i_1967_++) {
				int i_1968_ = is[i_1967_];
				if (i_1968_ < anIntArrayArray9306.length) {
					int[] is_1969_ = anIntArrayArray9306[i_1968_];
					for (int i_1970_ = 0; i_1970_ < is_1969_.length; i_1970_++) {
						int i_1971_ = is_1969_[i_1970_];
						anInt9357 += anIntArray9352[i_1971_];
						anInt9367 += anIntArray9360[i_1971_];
						anInt9353 += anIntArray9362[i_1971_];
						i_1966_++;
					}
				}
			}
			if (i_1966_ > 0) {
				anInt9357 = anInt9357 / i_1966_ + i_1961_;
				anInt9367 = anInt9367 / i_1966_ + i_1962_;
				anInt9353 = anInt9353 / i_1966_ + i_1963_;
			} else {
				anInt9357 = i_1961_;
				anInt9367 = i_1962_;
				anInt9353 = i_1963_;
			}
		} else if (i == 1) {
			i_1961_ <<= 4;
			i_1962_ <<= 4;
			i_1963_ <<= 4;
			for (int i_1972_ = 0; i_1972_ < i_1965_; i_1972_++) {
				int i_1973_ = is[i_1972_];
				if (i_1973_ < anIntArrayArray9306.length) {
					int[] is_1974_ = anIntArrayArray9306[i_1973_];
					for (int i_1975_ = 0; i_1975_ < is_1974_.length; i_1975_++) {
						int i_1976_ = is_1974_[i_1975_];
						anIntArray9352[i_1976_] += i_1961_;
						anIntArray9360[i_1976_] += i_1962_;
						anIntArray9362[i_1976_] += i_1963_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_1977_ = 0; i_1977_ < i_1965_; i_1977_++) {
				int i_1978_ = is[i_1977_];
				if (i_1978_ < anIntArrayArray9306.length) {
					int[] is_1979_ = anIntArrayArray9306[i_1978_];
					if ((i_1964_ & 0x1) == 0) {
						for (int i_1980_ = 0; i_1980_ < is_1979_.length; i_1980_++) {
							int i_1981_ = is_1979_[i_1980_];
							anIntArray9352[i_1981_] -= anInt9357;
							anIntArray9360[i_1981_] -= anInt9367;
							anIntArray9362[i_1981_] -= anInt9353;
							if (i_1963_ != 0) {
								int i_1982_ = Class428.anIntArray4825[i_1963_];
								int i_1983_ = Class428.anIntArray4819[i_1963_];
								int i_1984_ = ((anIntArray9360[i_1981_] * i_1982_ + anIntArray9352[i_1981_] * i_1983_ + 16383) >> 14);
								anIntArray9360[i_1981_] = (anIntArray9360[i_1981_] * i_1983_ - anIntArray9352[i_1981_] * i_1982_ + 16383) >> 14;
								anIntArray9352[i_1981_] = i_1984_;
							}
							if (i_1961_ != 0) {
								int i_1985_ = Class428.anIntArray4825[i_1961_];
								int i_1986_ = Class428.anIntArray4819[i_1961_];
								int i_1987_ = ((anIntArray9360[i_1981_] * i_1986_ - anIntArray9362[i_1981_] * i_1985_ + 16383) >> 14);
								anIntArray9362[i_1981_] = (anIntArray9360[i_1981_] * i_1985_ + anIntArray9362[i_1981_] * i_1986_ + 16383) >> 14;
								anIntArray9360[i_1981_] = i_1987_;
							}
							if (i_1962_ != 0) {
								int i_1988_ = Class428.anIntArray4825[i_1962_];
								int i_1989_ = Class428.anIntArray4819[i_1962_];
								int i_1990_ = ((anIntArray9362[i_1981_] * i_1988_ + anIntArray9352[i_1981_] * i_1989_ + 16383) >> 14);
								anIntArray9362[i_1981_] = (anIntArray9362[i_1981_] * i_1989_ - anIntArray9352[i_1981_] * i_1988_ + 16383) >> 14;
								anIntArray9352[i_1981_] = i_1990_;
							}
							anIntArray9352[i_1981_] += anInt9357;
							anIntArray9360[i_1981_] += anInt9367;
							anIntArray9362[i_1981_] += anInt9353;
						}
					} else {
						for (int i_1991_ = 0; i_1991_ < is_1979_.length; i_1991_++) {
							int i_1992_ = is_1979_[i_1991_];
							anIntArray9352[i_1992_] -= anInt9357;
							anIntArray9360[i_1992_] -= anInt9367;
							anIntArray9362[i_1992_] -= anInt9353;
							if (i_1961_ != 0) {
								int i_1993_ = Class428.anIntArray4825[i_1961_];
								int i_1994_ = Class428.anIntArray4819[i_1961_];
								int i_1995_ = ((anIntArray9360[i_1992_] * i_1994_ - anIntArray9362[i_1992_] * i_1993_ + 16383) >> 14);
								anIntArray9362[i_1992_] = (anIntArray9360[i_1992_] * i_1993_ + anIntArray9362[i_1992_] * i_1994_ + 16383) >> 14;
								anIntArray9360[i_1992_] = i_1995_;
							}
							if (i_1963_ != 0) {
								int i_1996_ = Class428.anIntArray4825[i_1963_];
								int i_1997_ = Class428.anIntArray4819[i_1963_];
								int i_1998_ = ((anIntArray9360[i_1992_] * i_1996_ + anIntArray9352[i_1992_] * i_1997_ + 16383) >> 14);
								anIntArray9360[i_1992_] = (anIntArray9360[i_1992_] * i_1997_ - anIntArray9352[i_1992_] * i_1996_ + 16383) >> 14;
								anIntArray9352[i_1992_] = i_1998_;
							}
							if (i_1962_ != 0) {
								int i_1999_ = Class428.anIntArray4825[i_1962_];
								int i_2000_ = Class428.anIntArray4819[i_1962_];
								int i_2001_ = ((anIntArray9362[i_1992_] * i_1999_ + anIntArray9352[i_1992_] * i_2000_ + 16383) >> 14);
								anIntArray9362[i_1992_] = (anIntArray9362[i_1992_] * i_2000_ - anIntArray9352[i_1992_] * i_1999_ + 16383) >> 14;
								anIntArray9352[i_1992_] = i_2001_;
							}
							anIntArray9352[i_1992_] += anInt9357;
							anIntArray9360[i_1992_] += anInt9367;
							anIntArray9362[i_1992_] += anInt9353;
						}
					}
				}
			}
			if (bool) {
				for (int i_2002_ = 0; i_2002_ < i_1965_; i_2002_++) {
					int i_2003_ = is[i_2002_];
					if (i_2003_ < anIntArrayArray9306.length) {
						int[] is_2004_ = anIntArrayArray9306[i_2003_];
						for (int i_2005_ = 0; i_2005_ < is_2004_.length; i_2005_++) {
							int i_2006_ = is_2004_[i_2005_];
							int i_2007_ = anIntArray9351[i_2006_];
							int i_2008_ = anIntArray9351[i_2006_ + 1];
							for (int i_2009_ = i_2007_; (i_2009_ < i_2008_ && aShortArray9366[i_2009_] != 0); i_2009_++) {
								int i_2010_ = (aShortArray9366[i_2009_] & 0xffff) - 1;
								if (i_1963_ != 0) {
									int i_2011_ = Class428.anIntArray4825[i_1963_];
									int i_2012_ = Class428.anIntArray4819[i_1963_];
									int i_2013_ = (aShortArray9305[i_2010_] * i_2011_ + aShortArray9311[i_2010_] * i_2012_ + 16383) >> 14;
									aShortArray9305[i_2010_] = (short) (((aShortArray9305[i_2010_] * i_2012_) - (aShortArray9311[i_2010_] * i_2011_) + 16383) >> 14);
									aShortArray9311[i_2010_] = (short) i_2013_;
								}
								if (i_1961_ != 0) {
									int i_2014_ = Class428.anIntArray4825[i_1961_];
									int i_2015_ = Class428.anIntArray4819[i_1961_];
									int i_2016_ = (aShortArray9305[i_2010_] * i_2015_ - aShortArray9313[i_2010_] * i_2014_ + 16383) >> 14;
									aShortArray9313[i_2010_] = (short) (((aShortArray9305[i_2010_] * i_2014_) + (aShortArray9313[i_2010_] * i_2015_) + 16383) >> 14);
									aShortArray9305[i_2010_] = (short) i_2016_;
								}
								if (i_1962_ != 0) {
									int i_2017_ = Class428.anIntArray4825[i_1962_];
									int i_2018_ = Class428.anIntArray4819[i_1962_];
									int i_2019_ = (aShortArray9313[i_2010_] * i_2017_ + aShortArray9311[i_2010_] * i_2018_ + 16383) >> 14;
									aShortArray9313[i_2010_] = (short) (((aShortArray9313[i_2010_] * i_2018_) - (aShortArray9311[i_2010_] * i_2017_) + 16383) >> 14);
									aShortArray9311[i_2010_] = (short) i_2019_;
								}
							}
						}
					}
				}
				method14752();
			}
		} else if (i == 3) {
			for (int i_2020_ = 0; i_2020_ < i_1965_; i_2020_++) {
				int i_2021_ = is[i_2020_];
				if (i_2021_ < anIntArrayArray9306.length) {
					int[] is_2022_ = anIntArrayArray9306[i_2021_];
					for (int i_2023_ = 0; i_2023_ < is_2022_.length; i_2023_++) {
						int i_2024_ = is_2022_[i_2023_];
						anIntArray9352[i_2024_] -= anInt9357;
						anIntArray9360[i_2024_] -= anInt9367;
						anIntArray9362[i_2024_] -= anInt9353;
						anIntArray9352[i_2024_] = anIntArray9352[i_2024_] * i_1961_ >> 7;
						anIntArray9360[i_2024_] = anIntArray9360[i_2024_] * i_1962_ >> 7;
						anIntArray9362[i_2024_] = anIntArray9362[i_2024_] * i_1963_ >> 7;
						anIntArray9352[i_2024_] += anInt9357;
						anIntArray9360[i_2024_] += anInt9367;
						anIntArray9362[i_2024_] += anInt9353;
					}
				}
			}
		} else if (i == 5) {
			if (anIntArrayArray9310 != null) {
				boolean bool_2025_ = false;
				for (int i_2026_ = 0; i_2026_ < i_1965_; i_2026_++) {
					int i_2027_ = is[i_2026_];
					if (i_2027_ < anIntArrayArray9310.length) {
						int[] is_2028_ = anIntArrayArray9310[i_2027_];
						for (int i_2029_ = 0; i_2029_ < is_2028_.length; i_2029_++) {
							int i_2030_ = is_2028_[i_2029_];
							int i_2031_ = ((aByteArray9321[i_2030_] & 0xff) + i_1961_ * 8);
							if (i_2031_ < 0)
								i_2031_ = 0;
							else if (i_2031_ > 255)
								i_2031_ = 255;
							aByteArray9321[i_2030_] = (byte) i_2031_;
						}
						bool_2025_ = bool_2025_ | is_2028_.length > 0;
					}
				}
				if (bool_2025_) {
					if (aClass361Array9356 != null) {
						for (int i_2032_ = 0; i_2032_ < anInt9355; i_2032_++) {
							Class361 class361 = aClass361Array9356[i_2032_];
							Class354 class354 = aClass354Array9347[i_2032_];
							class354.anInt3804 = (class354.anInt3804 & 0xffffff | 255 - (aByteArray9321[class361.anInt3841] & 0xff) << 24);
						}
					}
					method14751();
				}
			}
		} else if (i == 7) {
			if (anIntArrayArray9310 != null) {
				boolean bool_2033_ = false;
				for (int i_2034_ = 0; i_2034_ < i_1965_; i_2034_++) {
					int i_2035_ = is[i_2034_];
					if (i_2035_ < anIntArrayArray9310.length) {
						int[] is_2036_ = anIntArrayArray9310[i_2035_];
						for (int i_2037_ = 0; i_2037_ < is_2036_.length; i_2037_++) {
							int i_2038_ = is_2036_[i_2037_];
							int i_2039_ = aShortArray9326[i_2038_] & 0xffff;
							int i_2040_ = i_2039_ >> 10 & 0x3f;
							int i_2041_ = i_2039_ >> 7 & 0x7;
							int i_2042_ = i_2039_ & 0x7f;
							i_2040_ = i_2040_ + i_1961_ & 0x3f;
							i_2041_ += i_1962_ / 4;
							if (i_2041_ < 0)
								i_2041_ = 0;
							else if (i_2041_ > 7)
								i_2041_ = 7;
							i_2042_ += i_1963_;
							if (i_2042_ < 0)
								i_2042_ = 0;
							else if (i_2042_ > 127)
								i_2042_ = 127;
							aShortArray9326[i_2038_] = (short) (i_2040_ << 10 | i_2041_ << 7 | i_2042_);
						}
						bool_2033_ = bool_2033_ | is_2036_.length > 0;
					}
				}
				if (bool_2033_) {
					if (aClass361Array9356 != null) {
						for (int i_2043_ = 0; i_2043_ < anInt9355; i_2043_++) {
							Class361 class361 = aClass361Array9356[i_2043_];
							Class354 class354 = aClass354Array9347[i_2043_];
							class354.anInt3804 = (class354.anInt3804 & ~0xffffff | (Class656.anIntArray8390[(aShortArray9326[class361.anInt3841] & 0xffff)]) & 0xffffff);
						}
					}
					method14751();
				}
			}
		} else if (i == 8) {
			if (anIntArrayArray9329 != null) {
				for (int i_2044_ = 0; i_2044_ < i_1965_; i_2044_++) {
					int i_2045_ = is[i_2044_];
					if (i_2045_ < anIntArrayArray9329.length) {
						int[] is_2046_ = anIntArrayArray9329[i_2045_];
						for (int i_2047_ = 0; i_2047_ < is_2046_.length; i_2047_++) {
							Class354 class354 = aClass354Array9347[is_2046_[i_2047_]];
							class354.anInt3807 += i_1961_;
							class354.anInt3806 += i_1962_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (anIntArrayArray9329 != null) {
				for (int i_2048_ = 0; i_2048_ < i_1965_; i_2048_++) {
					int i_2049_ = is[i_2048_];
					if (i_2049_ < anIntArrayArray9329.length) {
						int[] is_2050_ = anIntArrayArray9329[i_2049_];
						for (int i_2051_ = 0; i_2051_ < is_2050_.length; i_2051_++) {
							Class354 class354 = aClass354Array9347[is_2050_[i_2051_]];
							class354.anInt3805 = class354.anInt3805 * i_1961_ >> 7;
							class354.anInt3808 = class354.anInt3808 * i_1962_ >> 7;
						}
					}
				}
			}
		} else if (i == 9) {
			if (anIntArrayArray9329 != null) {
				for (int i_2052_ = 0; i_2052_ < i_1965_; i_2052_++) {
					int i_2053_ = is[i_2052_];
					if (i_2053_ < anIntArrayArray9329.length) {
						int[] is_2054_ = anIntArrayArray9329[i_2053_];
						for (int i_2055_ = 0; i_2055_ < is_2054_.length; i_2055_++) {
							Class354 class354 = aClass354Array9347[is_2054_[i_2055_]];
							class354.anInt3809 = class354.anInt3809 + i_1961_ & 0x3fff;
						}
					}
				}
			}
		}
	}

	void method14793() {
		int i = 32767;
		int i_2056_ = 32767;
		int i_2057_ = 32767;
		int i_2058_ = -32768;
		int i_2059_ = -32768;
		int i_2060_ = -32768;
		int i_2061_ = 0;
		int i_2062_ = 0;
		for (int i_2063_ = 0; i_2063_ < anInt9302; i_2063_++) {
			int i_2064_ = anIntArray9352[i_2063_];
			int i_2065_ = anIntArray9360[i_2063_];
			int i_2066_ = anIntArray9362[i_2063_];
			if (i_2064_ < i)
				i = i_2064_;
			if (i_2064_ > i_2058_)
				i_2058_ = i_2064_;
			if (i_2065_ < i_2056_)
				i_2056_ = i_2065_;
			if (i_2065_ > i_2059_)
				i_2059_ = i_2065_;
			if (i_2066_ < i_2057_)
				i_2057_ = i_2066_;
			if (i_2066_ > i_2060_)
				i_2060_ = i_2066_;
			int i_2067_ = i_2064_ * i_2064_ + i_2066_ * i_2066_;
			if (i_2067_ > i_2061_)
				i_2061_ = i_2067_;
			i_2067_ = i_2064_ * i_2064_ + i_2066_ * i_2066_ + i_2065_ * i_2065_;
			if (i_2067_ > i_2062_)
				i_2062_ = i_2067_;
		}
		anInt9342 = i;
		anInt9343 = i_2058_;
		anInt9340 = i_2056_;
		anInt9318 = i_2059_;
		anInt9344 = i_2057_;
		anInt9345 = i_2060_;
		anInt9331 = (int) (Math.sqrt((double) i_2061_) + 0.99);
		anInt9337 = (int) (Math.sqrt((double) i_2062_) + 0.99);
		aBool9304 = true;
	}

	void method14794() {
		int i = 32767;
		int i_2068_ = 32767;
		int i_2069_ = 32767;
		int i_2070_ = -32768;
		int i_2071_ = -32768;
		int i_2072_ = -32768;
		int i_2073_ = 0;
		int i_2074_ = 0;
		for (int i_2075_ = 0; i_2075_ < anInt9302; i_2075_++) {
			int i_2076_ = anIntArray9352[i_2075_];
			int i_2077_ = anIntArray9360[i_2075_];
			int i_2078_ = anIntArray9362[i_2075_];
			if (i_2076_ < i)
				i = i_2076_;
			if (i_2076_ > i_2070_)
				i_2070_ = i_2076_;
			if (i_2077_ < i_2068_)
				i_2068_ = i_2077_;
			if (i_2077_ > i_2071_)
				i_2071_ = i_2077_;
			if (i_2078_ < i_2069_)
				i_2069_ = i_2078_;
			if (i_2078_ > i_2072_)
				i_2072_ = i_2078_;
			int i_2079_ = i_2076_ * i_2076_ + i_2078_ * i_2078_;
			if (i_2079_ > i_2073_)
				i_2073_ = i_2079_;
			i_2079_ = i_2076_ * i_2076_ + i_2078_ * i_2078_ + i_2077_ * i_2077_;
			if (i_2079_ > i_2074_)
				i_2074_ = i_2079_;
		}
		anInt9342 = i;
		anInt9343 = i_2070_;
		anInt9340 = i_2068_;
		anInt9318 = i_2071_;
		anInt9344 = i_2069_;
		anInt9345 = i_2072_;
		anInt9331 = (int) (Math.sqrt((double) i_2073_) + 0.99);
		anInt9337 = (int) (Math.sqrt((double) i_2074_) + 0.99);
		aBool9304 = true;
	}

	public int method2939() {
		if (!aBool9304)
			method14754();
		return anInt9343;
	}

	boolean method14795(int i, int i_2080_, int i_2081_, int i_2082_, Class432 class432, boolean bool, int i_2083_) {
		Class427 class427 = aClass180_Sub2_9296.aClass427_9435;
		class427.method6784(class432);
		class427.method6751(aClass180_Sub2_9296.aClass427_9530);
		boolean bool_2084_ = false;
		float f = 3.4028235E38F;
		float f_2085_ = -3.4028235E38F;
		float f_2086_ = 3.4028235E38F;
		float f_2087_ = -3.4028235E38F;
		if (!aBool9304)
			method14754();
		int i_2088_ = anInt9343 - anInt9342 >> 1;
		int i_2089_ = anInt9318 - anInt9340 >> 1;
		int i_2090_ = anInt9345 - anInt9344 >> 1;
		int i_2091_ = anInt9342 + i_2088_;
		int i_2092_ = anInt9340 + i_2089_;
		int i_2093_ = anInt9344 + i_2090_;
		int i_2094_ = i_2091_ - (i_2088_ << i_2083_);
		int i_2095_ = i_2092_ - (i_2089_ << i_2083_);
		int i_2096_ = i_2093_ - (i_2090_ << i_2083_);
		int i_2097_ = i_2091_ + (i_2088_ << i_2083_);
		int i_2098_ = i_2092_ + (i_2089_ << i_2083_);
		int i_2099_ = i_2093_ + (i_2090_ << i_2083_);
		anIntArray9363[0] = i_2094_;
		anIntArray9364[0] = i_2095_;
		anIntArray9365[0] = i_2096_;
		anIntArray9363[1] = i_2097_;
		anIntArray9364[1] = i_2095_;
		anIntArray9365[1] = i_2096_;
		anIntArray9363[2] = i_2094_;
		anIntArray9364[2] = i_2098_;
		anIntArray9365[2] = i_2096_;
		anIntArray9363[3] = i_2097_;
		anIntArray9364[3] = i_2098_;
		anIntArray9365[3] = i_2096_;
		anIntArray9363[4] = i_2094_;
		anIntArray9364[4] = i_2095_;
		anIntArray9365[4] = i_2099_;
		anIntArray9363[5] = i_2097_;
		anIntArray9364[5] = i_2095_;
		anIntArray9365[5] = i_2099_;
		anIntArray9363[6] = i_2094_;
		anIntArray9364[6] = i_2098_;
		anIntArray9365[6] = i_2099_;
		anIntArray9363[7] = i_2097_;
		anIntArray9364[7] = i_2098_;
		anIntArray9365[7] = i_2099_;
		for (int i_2100_ = 0; i_2100_ < 8; i_2100_++) {
			float f_2101_ = (float) anIntArray9363[i_2100_];
			float f_2102_ = (float) anIntArray9364[i_2100_];
			float f_2103_ = (float) anIntArray9365[i_2100_];
			float f_2104_ = (class427.aFloatArray4807[2] * f_2101_ + class427.aFloatArray4807[6] * f_2102_ + class427.aFloatArray4807[10] * f_2103_ + class427.aFloatArray4807[14]);
			float f_2105_ = (class427.aFloatArray4807[3] * f_2101_ + class427.aFloatArray4807[7] * f_2102_ + class427.aFloatArray4807[11] * f_2103_ + class427.aFloatArray4807[15]);
			if (f_2104_ >= -f_2105_) {
				float f_2106_ = (class427.aFloatArray4807[0] * f_2101_ + class427.aFloatArray4807[4] * f_2102_ + class427.aFloatArray4807[8] * f_2103_ + class427.aFloatArray4807[12]);
				float f_2107_ = (class427.aFloatArray4807[1] * f_2101_ + class427.aFloatArray4807[5] * f_2102_ + class427.aFloatArray4807[9] * f_2103_ + class427.aFloatArray4807[13]);
				float f_2108_ = (aClass180_Sub2_9296.aFloat9476 + aClass180_Sub2_9296.aFloat9477 * f_2106_ / f_2105_);
				float f_2109_ = (aClass180_Sub2_9296.aFloat9478 + aClass180_Sub2_9296.aFloat9500 * f_2107_ / f_2105_);
				if (f_2108_ < f)
					f = f_2108_;
				if (f_2108_ > f_2085_)
					f_2085_ = f_2108_;
				if (f_2109_ < f_2086_)
					f_2086_ = f_2109_;
				if (f_2109_ > f_2087_)
					f_2087_ = f_2109_;
				bool_2084_ = true;
			}
		}
		int i_2110_ = i + i_2081_;
		int i_2111_ = i_2080_ + i_2082_;
		if (bool_2084_ && (float) i_2110_ > f && (float) i < f_2085_ && (float) i_2111_ > f_2086_ && (float) i_2080_ < f_2087_) {
			if (bool)
				return true;
			if (anIntArray9338.length < anInt9308) {
				anIntArray9338 = new int[anInt9308];
				anIntArray9330 = new int[anInt9308];
			}
			for (int i_2112_ = 0; i_2112_ < anInt9302; i_2112_++) {
				float f_2113_ = (float) anIntArray9352[i_2112_];
				float f_2114_ = (float) anIntArray9360[i_2112_];
				float f_2115_ = (float) anIntArray9362[i_2112_];
				float f_2116_ = (class427.aFloatArray4807[2] * f_2113_ + class427.aFloatArray4807[6] * f_2114_ + class427.aFloatArray4807[10] * f_2115_ + class427.aFloatArray4807[14]);
				float f_2117_ = (class427.aFloatArray4807[3] * f_2113_ + class427.aFloatArray4807[7] * f_2114_ + class427.aFloatArray4807[11] * f_2115_ + class427.aFloatArray4807[15]);
				if (f_2116_ >= -f_2117_) {
					float f_2118_ = (class427.aFloatArray4807[0] * f_2113_ + class427.aFloatArray4807[4] * f_2114_ + class427.aFloatArray4807[8] * f_2115_ + class427.aFloatArray4807[12]);
					float f_2119_ = (class427.aFloatArray4807[1] * f_2113_ + class427.aFloatArray4807[5] * f_2114_ + class427.aFloatArray4807[9] * f_2115_ + class427.aFloatArray4807[13]);
					int i_2120_ = anIntArray9351[i_2112_];
					int i_2121_ = anIntArray9351[i_2112_ + 1];
					for (int i_2122_ = i_2120_; i_2122_ < i_2121_ && aShortArray9366[i_2122_] != 0; i_2122_++) {
						int i_2123_ = (aShortArray9366[i_2122_] & 0xffff) - 1;
						anIntArray9338[i_2123_] = (int) (aClass180_Sub2_9296.aFloat9476 + (aClass180_Sub2_9296.aFloat9477 * f_2118_ / f_2117_));
						anIntArray9330[i_2123_] = (int) (aClass180_Sub2_9296.aFloat9478 + (aClass180_Sub2_9296.aFloat9500 * f_2119_ / f_2117_));
					}
				} else {
					int i_2124_ = anIntArray9351[i_2112_];
					int i_2125_ = anIntArray9351[i_2112_ + 1];
					for (int i_2126_ = i_2124_; i_2126_ < i_2125_ && aShortArray9366[i_2126_] != 0; i_2126_++) {
						int i_2127_ = (aShortArray9366[i_2126_] & 0xffff) - 1;
						anIntArray9338[i_2127_] = -999999;
					}
				}
			}
			for (int i_2128_ = 0; i_2128_ < anInt9369; i_2128_++) {
				if ((anIntArray9338[aShortArray9322[i_2128_] & 0xffff] != -999999) && (anIntArray9338[aShortArray9323[i_2128_] & 0xffff] != -999999) && (anIntArray9338[aShortArray9324[i_2128_] & 0xffff] != -999999)
						&& (method14762(i, i_2080_, i_2110_, i_2111_, anIntArray9330[aShortArray9322[i_2128_] & 0xffff], anIntArray9330[aShortArray9323[i_2128_] & 0xffff], anIntArray9330[aShortArray9324[i_2128_] & 0xffff], anIntArray9338[aShortArray9322[i_2128_] & 0xffff], anIntArray9338[aShortArray9323[i_2128_] & 0xffff], anIntArray9338[aShortArray9324[i_2128_] & 0xffff])))
					return true;
			}
		}
		return false;
	}

	boolean method14796(int i, int i_2129_, int i_2130_, int i_2131_, int i_2132_, int i_2133_, int i_2134_, int i_2135_, int i_2136_, int i_2137_) {
		if (i_2131_ < i_2132_ && i_2131_ < i_2133_ && i_2131_ < i_2134_)
			return false;
		if (i_2129_ > i_2132_ && i_2129_ > i_2133_ && i_2129_ > i_2134_)
			return false;
		if (i_2130_ < i_2135_ && i_2130_ < i_2136_ && i_2130_ < i_2137_)
			return false;
		if (i > i_2135_ && i > i_2136_ && i > i_2137_)
			return false;
		return true;
	}

	void method14797(Class527_Sub8_Sub8_Sub2 class527_sub8_sub8_sub2) {
		if (anIntArray9338.length < anInt9308) {
			anIntArray9338 = new int[anInt9308];
			anIntArray9330 = new int[anInt9308];
		}
		for (int i = 0; i < anInt9302; i++) {
			int i_2138_ = (((anIntArray9352[i] - (anIntArray9360[i] * aClass180_Sub2_9296.anInt9523 >> 8)) >> aClass180_Sub2_9296.anInt9522) - class527_sub8_sub8_sub2.anInt12082);
			int i_2139_ = (((anIntArray9362[i] - (anIntArray9360[i] * aClass180_Sub2_9296.anInt9584 >> 8)) >> aClass180_Sub2_9296.anInt9522) - class527_sub8_sub8_sub2.anInt12083);
			int i_2140_ = anIntArray9351[i];
			int i_2141_ = anIntArray9351[i + 1];
			for (int i_2142_ = i_2140_; i_2142_ < i_2141_ && aShortArray9366[i_2142_] != 0; i_2142_++) {
				int i_2143_ = (aShortArray9366[i_2142_] & 0xffff) - 1;
				anIntArray9338[i_2143_] = i_2138_;
				anIntArray9330[i_2143_] = i_2139_;
			}
		}
		for (int i = 0; i < anInt9319; i++) {
			if (aByteArray9321 == null || aByteArray9321[i] <= 128) {
				int i_2144_ = aShortArray9322[i] & 0xffff;
				int i_2145_ = aShortArray9323[i] & 0xffff;
				int i_2146_ = aShortArray9324[i] & 0xffff;
				int i_2147_ = anIntArray9338[i_2144_];
				int i_2148_ = anIntArray9338[i_2145_];
				int i_2149_ = anIntArray9338[i_2146_];
				int i_2150_ = anIntArray9330[i_2144_];
				int i_2151_ = anIntArray9330[i_2145_];
				int i_2152_ = anIntArray9330[i_2146_];
				if (((i_2147_ - i_2148_) * (i_2151_ - i_2152_) - (i_2151_ - i_2150_) * (i_2149_ - i_2148_)) > 0)
					class527_sub8_sub8_sub2.method18744(i_2150_, i_2151_, i_2152_, i_2147_, i_2148_, i_2149_);
			}
		}
	}

	void method14798(Class432 class432) {
		if (anInt9319 != 0 && (method14768() && method14772())) {
			if (aClass348_9370 == null) {
				/* empty */
			}
			aClass180_Sub2_9296.method14998();
			aClass180_Sub2_9296.method14958();
			Class326 class326 = aClass180_Sub2_9296.aClass326_9541;
			aClass180_Sub2_9296.method14988(0, aClass363_9299.anInterface37_3856);
			aClass180_Sub2_9296.method14988(1, aClass363_9334.anInterface37_3856);
			aClass180_Sub2_9296.method14988(2, aClass363_9332.anInterface37_3856);
			aClass180_Sub2_9296.method15001(aClass344_9361.anInterface44_3693);
			aClass180_Sub2_9296.aClass427_9435.method6784(class432);
			class326.method5770(aClass180_Sub2_9296.aClass427_9435);
			class326.aClass427_3583.method6742();
			if (aClass180_Sub2_9296.aBool9495) {
				Class178 class178 = aClass180_Sub2_9296.method14987();
				class326.aClass441_3587.method7118(0.0F, 1.0F, 0.0F, (float) -aClass180_Sub2_9296.anInt9557);
				class326.aClass441_3587.method7128(3.0F / (float) ((class178.anInt2050) * 112490777));
				class326.aClass442_3588.method7138(((float) (class178.anInt2055 * -2080392837 >> 16 & 0xff) / 255.0F), ((float) (class178.anInt2055 * -2080392837 >> 8 & 0xff) / 255.0F), ((float) (class178.anInt2055 * -2080392837 >> 0 & 0xff) / 255.0F));
			} else {
				class326.aClass441_3587.method7118(0.0F, 0.0F, 0.0F, 0.0F);
				class326.aClass442_3588.method7138(0.0F, 0.0F, 0.0F);
			}
			if (aClass180_Sub2_9296.anInt9562 > 0) {
				class326.aClass441_3589.method7118(0.0F, 0.0F, 1.0F, -(aClass180_Sub2_9296.aFloat9517));
				class326.aClass442_3581.method7138(((float) (aClass180_Sub2_9296.anInt9561 >> 16 & 0xff) / 255.0F), ((float) (aClass180_Sub2_9296.anInt9561 >> 8 & 0xff) / 255.0F), ((float) (aClass180_Sub2_9296.anInt9561 >> 0 & 0xff) / 255.0F));
				aClass180_Sub2_9296.aClass427_9435.method6784(class432);
				aClass180_Sub2_9296.aClass427_9435.method6790();
				class326.aClass441_3587.method7123(aClass180_Sub2_9296.aClass427_9435);
				aClass180_Sub2_9296.aClass427_9435.method6784(class432);
				aClass180_Sub2_9296.aClass427_9435.method6751(aClass180_Sub2_9296.aClass427_9459);
				aClass180_Sub2_9296.aClass427_9435.method6790();
				class326.aClass441_3589.method7123(aClass180_Sub2_9296.aClass427_9435);
				class326.aClass441_3589.method7128(1.0F / (aClass180_Sub2_9296.aFloat9565 - aClass180_Sub2_9296.aFloat9517));
			} else {
				class326.aClass441_3589.method7118(0.0F, 0.0F, 0.0F, 0.0F);
				class326.aClass442_3581.method7138(0.0F, 0.0F, 0.0F);
			}
			if ((anInt9298 & 0x37) == 0) {
				aClass180_Sub2_9296.method15149(aClass180_Sub2_9296.aClass355_9594);
				if (aClass180_Sub2_9296.aBool9597)
					aClass180_Sub2_9296.method14954(false);
				for (int i = 0; i < anIntArray9349.length; i++) {
					int i_2153_ = anIntArray9348[i];
					int i_2154_ = anIntArray9348[i + 1];
					int i_2155_ = aShortArray9325[i_2153_];
					boolean bool = false;
					byte i_2156_ = 0;
					if (i_2155_ != -1) {
						Class163 class163 = aClass180_Sub2_9296.aClass181_2059.method3544(i_2155_ & 0xffff, (byte) -76);
						class326.anInterface38_3595 = aClass180_Sub2_9296.aClass336_9532.method5895(class163);
						bool = !Class306.method5607(class163.aByte1801, -1088851960);
						class326.aClass427_3583.aFloatArray4807[12] = ((float) (aClass180_Sub2_9296.anInt9574 % 128000) / 1000.0F * (float) class163.aByte1781 / 64.0F % 1.0F);
						class326.aClass427_3583.aFloatArray4807[13] = ((float) (aClass180_Sub2_9296.anInt9574 % 128000) / 1000.0F * (float) class163.aByte1797 / 64.0F % 1.0F);
						if (class163.aClass595_1784 == Class595.aClass595_7815)
							i_2156_ = class163.aByte1764;
					} else {
						class326.anInterface38_3595 = aClass180_Sub2_9296.anInterface38_9533;
						float[] fs = class326.aClass427_3583.aFloatArray4807;
						class326.aClass427_3583.aFloatArray4807[13] = 0.0F;
						fs[12] = 0.0F;
					}
					aClass180_Sub2_9296.method14990(i_2156_);
					class326.anInt3598 = anIntArray9349[i];
					class326.anInt3597 = anIntArray9350[i];
					class326.anInt3584 = i_2153_ * 3;
					class326.anInt3599 = i_2154_ - i_2153_;
					class326.method5757(bool);
				}
			} else {
				aClass180_Sub2_9296.method14988(3, aClass363_9368.anInterface37_3856);
				aClass180_Sub2_9296.method15149(aClass180_Sub2_9296.aClass355_9595);
				Class432 class432_2157_ = aClass180_Sub2_9296.aClass432_9512;
				class432_2157_.method6899(class432);
				class432_2157_.method6887();
				int i = 0;
				if (aClass180_Sub2_9296.aBool9597)
					aClass180_Sub2_9296.method14954(true);
				else {
					class326.aClass442_3591.method7138(aClass180_Sub2_9296.aFloatArray9507[0], aClass180_Sub2_9296.aFloatArray9507[1], aClass180_Sub2_9296.aFloatArray9507[2]);
					class326.aClass442_3591.method7230(class432_2157_);
					class326.aClass442_3590.method7138((aClass180_Sub2_9296.aFloat9516 * aClass180_Sub2_9296.aFloat9583), (aClass180_Sub2_9296.aFloat9516 * aClass180_Sub2_9296.aFloat9513), (aClass180_Sub2_9296.aFloat9516 * aClass180_Sub2_9296.aFloat9448));
					class326.aClass442_3593.method7138((-aClass180_Sub2_9296.aFloat9548 * aClass180_Sub2_9296.aFloat9583), (-aClass180_Sub2_9296.aFloat9548 * aClass180_Sub2_9296.aFloat9513), (-aClass180_Sub2_9296.aFloat9548 * aClass180_Sub2_9296.aFloat9448));
					class326.aClass442_3594.method7138((aClass180_Sub2_9296.aFloat9551 * aClass180_Sub2_9296.aFloat9583), (aClass180_Sub2_9296.aFloat9551 * aClass180_Sub2_9296.aFloat9513), (aClass180_Sub2_9296.aFloat9551 * aClass180_Sub2_9296.aFloat9448));
					if (aClass180_Sub2_9296.anInt9526 > 0) {
						i = aClass180_Sub2_9296.anInt9526;
						Class442 class442 = aClass180_Sub2_9296.aClass442_9461;
						for (int i_2158_ = 0; i_2158_ < i; i_2158_++) {
							Class527_Sub16 class527_sub16 = (aClass180_Sub2_9296.aClass527_Sub16Array9520[i_2158_]);
							int i_2159_ = class527_sub16.method16133((byte) 0);
							class442.method7146(class527_sub16.aClass442_10462);
							class442.method7151(class432_2157_);
							class326.aFloatArray3580[i_2158_ * 4 + 0] = class442.aFloat4918;
							class326.aFloatArray3580[i_2158_ * 4 + 1] = class442.aFloat4915;
							class326.aFloatArray3580[i_2158_ * 4 + 2] = class442.aFloat4919;
							class326.aFloatArray3580[i_2158_ * 4 + 3] = 1.0F / (float) (class527_sub16.method16132(-1551507067) * (class527_sub16.method16132(-1062573012)));
							float f = (class527_sub16.method16162(-1438916801) / 255.0F);
							class326.aFloatArray3579[i_2158_ * 4 + 0] = (float) (i_2159_ >> 16 & 0xff) * f;
							class326.aFloatArray3579[i_2158_ * 4 + 1] = (float) (i_2159_ >> 8 & 0xff) * f;
							class326.aFloatArray3579[i_2158_ * 4 + 2] = (float) (i_2159_ & 0xff) * f;
							class326.aFloatArray3579[i_2158_ * 4 + 3] = 1.0F;
						}
					}
				}
				for (int i_2160_ = 0; i_2160_ < anIntArray9349.length; i_2160_++) {
					int i_2161_ = anIntArray9348[i_2160_];
					int i_2162_ = anIntArray9348[i_2160_ + 1];
					int i_2163_ = aShortArray9325[i_2161_];
					byte i_2164_ = 11;
					Class163 class163 = null;
					byte i_2165_ = 0;
					if (i_2163_ != -1) {
						class163 = aClass180_Sub2_9296.aClass181_2059.method3544(i_2163_ & 0xffff, (byte) -16);
						class326.anInterface38_3595 = aClass180_Sub2_9296.aClass336_9532.method5895(class163);
						i_2164_ = class163.aByte1801;
						class326.method5755(class163.aByte1775);
						class326.aClass427_3583.aFloatArray4807[12] = ((float) (aClass180_Sub2_9296.anInt9574 % 128000) / 1000.0F * (float) class163.aByte1781 / 64.0F % 1.0F);
						class326.aClass427_3583.aFloatArray4807[13] = ((float) (aClass180_Sub2_9296.anInt9574 % 128000) / 1000.0F * (float) class163.aByte1797 / 64.0F % 1.0F);
						if (class163.aClass595_1784 == Class595.aClass595_7815)
							i_2165_ = class163.aByte1764;
					} else {
						class326.anInterface38_3595 = aClass180_Sub2_9296.anInterface38_9533;
						float[] fs = class326.aClass427_3583.aFloatArray4807;
						class326.aClass427_3583.aFloatArray4807[13] = 0.0F;
						fs[12] = 0.0F;
					}
					aClass180_Sub2_9296.method14990(i_2165_);
					class326.anInt3598 = anIntArray9349[i_2160_];
					class326.anInt3597 = anIntArray9350[i_2160_];
					class326.anInt3584 = i_2161_ * 3;
					class326.anInt3599 = i_2162_ - i_2161_;
					switch (i_2164_) {
					case 5:
						if (!aClass180_Sub2_9296.aBool9597) {
							Class350_Sub1_Sub1 class350_sub1_sub1 = aClass180_Sub2_9296.aClass350_Sub1_Sub1_9547;
							class350_sub1_sub1.method17990(class163.aByte1775, (class163.anInt1805 * -1860683695), (byte) -120);
							class350_sub1_sub1.aClass427_11428.method6784(class432);
							class350_sub1_sub1.aClass427_11426.method6784(class432);
							class350_sub1_sub1.aClass427_11426.method6751(aClass180_Sub2_9296.aClass427_9474);
							class350_sub1_sub1.anInt11434 = anIntArray9349[i_2160_] * 864923621;
							class350_sub1_sub1.anInt11435 = anIntArray9350[i_2160_] * 1474049869;
							class350_sub1_sub1.anInt11436 = i_2161_ * 463347371;
							class350_sub1_sub1.anInt11420 = (i_2162_ - i_2161_) * -400534729;
							class350_sub1_sub1.method17988(-524313213);
						} else
							class326.method5758(i);
						break;
					default:
						class326.method5758(i);
						break;
					case 7:
						class326.aClass442_3592.method7138((aClass180_Sub2_9296.aClass427_9453.aFloatArray4807[12]), (aClass180_Sub2_9296.aClass427_9453.aFloatArray4807[13]), (aClass180_Sub2_9296.aClass427_9453.aFloatArray4807[14]));
						class326.aClass442_3592.method7151(class432_2157_);
						class326.aClass427_3577.method6784(class432);
						class326.anInterface39_3582 = aClass180_Sub2_9296.method14925();
						class326.method5760(i);
						break;
					case 1:
						class326.aClass442_3592.method7138((aClass180_Sub2_9296.aClass427_9453.aFloatArray4807[12]), (aClass180_Sub2_9296.aClass427_9453.aFloatArray4807[13]), (aClass180_Sub2_9296.aClass427_9453.aFloatArray4807[14]));
						class326.aClass442_3592.method7151(class432_2157_);
						class326.method5754(i);
						break;
					case 6:
						class326.method5757(!Class306.method5607(i_2164_, -1088851960));
					}
				}
			}
			method14750();
		}
	}

	void method14799(Class432 class432) {
		if (anInt9319 != 0 && (method14768() && method14772())) {
			if (aClass348_9370 == null) {
				/* empty */
			}
			aClass180_Sub2_9296.method14998();
			aClass180_Sub2_9296.method14958();
			Class326 class326 = aClass180_Sub2_9296.aClass326_9541;
			aClass180_Sub2_9296.method14988(0, aClass363_9299.anInterface37_3856);
			aClass180_Sub2_9296.method14988(1, aClass363_9334.anInterface37_3856);
			aClass180_Sub2_9296.method14988(2, aClass363_9332.anInterface37_3856);
			aClass180_Sub2_9296.method15001(aClass344_9361.anInterface44_3693);
			aClass180_Sub2_9296.aClass427_9435.method6784(class432);
			class326.method5770(aClass180_Sub2_9296.aClass427_9435);
			class326.aClass427_3583.method6742();
			if (aClass180_Sub2_9296.aBool9495) {
				Class178 class178 = aClass180_Sub2_9296.method14987();
				class326.aClass441_3587.method7118(0.0F, 1.0F, 0.0F, (float) -aClass180_Sub2_9296.anInt9557);
				class326.aClass441_3587.method7128(3.0F / (float) ((class178.anInt2050) * 112490777));
				class326.aClass442_3588.method7138(((float) (class178.anInt2055 * -2080392837 >> 16 & 0xff) / 255.0F), ((float) (class178.anInt2055 * -2080392837 >> 8 & 0xff) / 255.0F), ((float) (class178.anInt2055 * -2080392837 >> 0 & 0xff) / 255.0F));
			} else {
				class326.aClass441_3587.method7118(0.0F, 0.0F, 0.0F, 0.0F);
				class326.aClass442_3588.method7138(0.0F, 0.0F, 0.0F);
			}
			if (aClass180_Sub2_9296.anInt9562 > 0) {
				class326.aClass441_3589.method7118(0.0F, 0.0F, 1.0F, -(aClass180_Sub2_9296.aFloat9517));
				class326.aClass442_3581.method7138(((float) (aClass180_Sub2_9296.anInt9561 >> 16 & 0xff) / 255.0F), ((float) (aClass180_Sub2_9296.anInt9561 >> 8 & 0xff) / 255.0F), ((float) (aClass180_Sub2_9296.anInt9561 >> 0 & 0xff) / 255.0F));
				aClass180_Sub2_9296.aClass427_9435.method6784(class432);
				aClass180_Sub2_9296.aClass427_9435.method6790();
				class326.aClass441_3587.method7123(aClass180_Sub2_9296.aClass427_9435);
				aClass180_Sub2_9296.aClass427_9435.method6784(class432);
				aClass180_Sub2_9296.aClass427_9435.method6751(aClass180_Sub2_9296.aClass427_9459);
				aClass180_Sub2_9296.aClass427_9435.method6790();
				class326.aClass441_3589.method7123(aClass180_Sub2_9296.aClass427_9435);
				class326.aClass441_3589.method7128(1.0F / (aClass180_Sub2_9296.aFloat9565 - aClass180_Sub2_9296.aFloat9517));
			} else {
				class326.aClass441_3589.method7118(0.0F, 0.0F, 0.0F, 0.0F);
				class326.aClass442_3581.method7138(0.0F, 0.0F, 0.0F);
			}
			if ((anInt9298 & 0x37) == 0) {
				aClass180_Sub2_9296.method15149(aClass180_Sub2_9296.aClass355_9594);
				if (aClass180_Sub2_9296.aBool9597)
					aClass180_Sub2_9296.method14954(false);
				for (int i = 0; i < anIntArray9349.length; i++) {
					int i_2166_ = anIntArray9348[i];
					int i_2167_ = anIntArray9348[i + 1];
					int i_2168_ = aShortArray9325[i_2166_];
					boolean bool = false;
					byte i_2169_ = 0;
					if (i_2168_ != -1) {
						Class163 class163 = aClass180_Sub2_9296.aClass181_2059.method3544(i_2168_ & 0xffff, (byte) -63);
						class326.anInterface38_3595 = aClass180_Sub2_9296.aClass336_9532.method5895(class163);
						bool = !Class306.method5607(class163.aByte1801, -1088851960);
						class326.aClass427_3583.aFloatArray4807[12] = ((float) (aClass180_Sub2_9296.anInt9574 % 128000) / 1000.0F * (float) class163.aByte1781 / 64.0F % 1.0F);
						class326.aClass427_3583.aFloatArray4807[13] = ((float) (aClass180_Sub2_9296.anInt9574 % 128000) / 1000.0F * (float) class163.aByte1797 / 64.0F % 1.0F);
						if (class163.aClass595_1784 == Class595.aClass595_7815)
							i_2169_ = class163.aByte1764;
					} else {
						class326.anInterface38_3595 = aClass180_Sub2_9296.anInterface38_9533;
						float[] fs = class326.aClass427_3583.aFloatArray4807;
						class326.aClass427_3583.aFloatArray4807[13] = 0.0F;
						fs[12] = 0.0F;
					}
					aClass180_Sub2_9296.method14990(i_2169_);
					class326.anInt3598 = anIntArray9349[i];
					class326.anInt3597 = anIntArray9350[i];
					class326.anInt3584 = i_2166_ * 3;
					class326.anInt3599 = i_2167_ - i_2166_;
					class326.method5757(bool);
				}
			} else {
				aClass180_Sub2_9296.method14988(3, aClass363_9368.anInterface37_3856);
				aClass180_Sub2_9296.method15149(aClass180_Sub2_9296.aClass355_9595);
				Class432 class432_2170_ = aClass180_Sub2_9296.aClass432_9512;
				class432_2170_.method6899(class432);
				class432_2170_.method6887();
				int i = 0;
				if (aClass180_Sub2_9296.aBool9597)
					aClass180_Sub2_9296.method14954(true);
				else {
					class326.aClass442_3591.method7138(aClass180_Sub2_9296.aFloatArray9507[0], aClass180_Sub2_9296.aFloatArray9507[1], aClass180_Sub2_9296.aFloatArray9507[2]);
					class326.aClass442_3591.method7230(class432_2170_);
					class326.aClass442_3590.method7138((aClass180_Sub2_9296.aFloat9516 * aClass180_Sub2_9296.aFloat9583), (aClass180_Sub2_9296.aFloat9516 * aClass180_Sub2_9296.aFloat9513), (aClass180_Sub2_9296.aFloat9516 * aClass180_Sub2_9296.aFloat9448));
					class326.aClass442_3593.method7138((-aClass180_Sub2_9296.aFloat9548 * aClass180_Sub2_9296.aFloat9583), (-aClass180_Sub2_9296.aFloat9548 * aClass180_Sub2_9296.aFloat9513), (-aClass180_Sub2_9296.aFloat9548 * aClass180_Sub2_9296.aFloat9448));
					class326.aClass442_3594.method7138((aClass180_Sub2_9296.aFloat9551 * aClass180_Sub2_9296.aFloat9583), (aClass180_Sub2_9296.aFloat9551 * aClass180_Sub2_9296.aFloat9513), (aClass180_Sub2_9296.aFloat9551 * aClass180_Sub2_9296.aFloat9448));
					if (aClass180_Sub2_9296.anInt9526 > 0) {
						i = aClass180_Sub2_9296.anInt9526;
						Class442 class442 = aClass180_Sub2_9296.aClass442_9461;
						for (int i_2171_ = 0; i_2171_ < i; i_2171_++) {
							Class527_Sub16 class527_sub16 = (aClass180_Sub2_9296.aClass527_Sub16Array9520[i_2171_]);
							int i_2172_ = class527_sub16.method16133((byte) 0);
							class442.method7146(class527_sub16.aClass442_10462);
							class442.method7151(class432_2170_);
							class326.aFloatArray3580[i_2171_ * 4 + 0] = class442.aFloat4918;
							class326.aFloatArray3580[i_2171_ * 4 + 1] = class442.aFloat4915;
							class326.aFloatArray3580[i_2171_ * 4 + 2] = class442.aFloat4919;
							class326.aFloatArray3580[i_2171_ * 4 + 3] = (1.0F / (float) (class527_sub16.method16132(-431869928) * class527_sub16.method16132(-608983800)));
							float f = (class527_sub16.method16162(-1264219434) / 255.0F);
							class326.aFloatArray3579[i_2171_ * 4 + 0] = (float) (i_2172_ >> 16 & 0xff) * f;
							class326.aFloatArray3579[i_2171_ * 4 + 1] = (float) (i_2172_ >> 8 & 0xff) * f;
							class326.aFloatArray3579[i_2171_ * 4 + 2] = (float) (i_2172_ & 0xff) * f;
							class326.aFloatArray3579[i_2171_ * 4 + 3] = 1.0F;
						}
					}
				}
				for (int i_2173_ = 0; i_2173_ < anIntArray9349.length; i_2173_++) {
					int i_2174_ = anIntArray9348[i_2173_];
					int i_2175_ = anIntArray9348[i_2173_ + 1];
					int i_2176_ = aShortArray9325[i_2174_];
					byte i_2177_ = 11;
					Class163 class163 = null;
					byte i_2178_ = 0;
					if (i_2176_ != -1) {
						class163 = aClass180_Sub2_9296.aClass181_2059.method3544(i_2176_ & 0xffff, (byte) -61);
						class326.anInterface38_3595 = aClass180_Sub2_9296.aClass336_9532.method5895(class163);
						i_2177_ = class163.aByte1801;
						class326.method5755(class163.aByte1775);
						class326.aClass427_3583.aFloatArray4807[12] = ((float) (aClass180_Sub2_9296.anInt9574 % 128000) / 1000.0F * (float) class163.aByte1781 / 64.0F % 1.0F);
						class326.aClass427_3583.aFloatArray4807[13] = ((float) (aClass180_Sub2_9296.anInt9574 % 128000) / 1000.0F * (float) class163.aByte1797 / 64.0F % 1.0F);
						if (class163.aClass595_1784 == Class595.aClass595_7815)
							i_2178_ = class163.aByte1764;
					} else {
						class326.anInterface38_3595 = aClass180_Sub2_9296.anInterface38_9533;
						float[] fs = class326.aClass427_3583.aFloatArray4807;
						class326.aClass427_3583.aFloatArray4807[13] = 0.0F;
						fs[12] = 0.0F;
					}
					aClass180_Sub2_9296.method14990(i_2178_);
					class326.anInt3598 = anIntArray9349[i_2173_];
					class326.anInt3597 = anIntArray9350[i_2173_];
					class326.anInt3584 = i_2174_ * 3;
					class326.anInt3599 = i_2175_ - i_2174_;
					switch (i_2177_) {
					case 5:
						if (!aClass180_Sub2_9296.aBool9597) {
							Class350_Sub1_Sub1 class350_sub1_sub1 = aClass180_Sub2_9296.aClass350_Sub1_Sub1_9547;
							class350_sub1_sub1.method17990(class163.aByte1775, (class163.anInt1805 * -1860683695), (byte) -119);
							class350_sub1_sub1.aClass427_11428.method6784(class432);
							class350_sub1_sub1.aClass427_11426.method6784(class432);
							class350_sub1_sub1.aClass427_11426.method6751(aClass180_Sub2_9296.aClass427_9474);
							class350_sub1_sub1.anInt11434 = anIntArray9349[i_2173_] * 864923621;
							class350_sub1_sub1.anInt11435 = anIntArray9350[i_2173_] * 1474049869;
							class350_sub1_sub1.anInt11436 = i_2174_ * 463347371;
							class350_sub1_sub1.anInt11420 = (i_2175_ - i_2174_) * -400534729;
							class350_sub1_sub1.method17988(1284455921);
						} else
							class326.method5758(i);
						break;
					default:
						class326.method5758(i);
						break;
					case 7:
						class326.aClass442_3592.method7138((aClass180_Sub2_9296.aClass427_9453.aFloatArray4807[12]), (aClass180_Sub2_9296.aClass427_9453.aFloatArray4807[13]), (aClass180_Sub2_9296.aClass427_9453.aFloatArray4807[14]));
						class326.aClass442_3592.method7151(class432_2170_);
						class326.aClass427_3577.method6784(class432);
						class326.anInterface39_3582 = aClass180_Sub2_9296.method14925();
						class326.method5760(i);
						break;
					case 1:
						class326.aClass442_3592.method7138((aClass180_Sub2_9296.aClass427_9453.aFloatArray4807[12]), (aClass180_Sub2_9296.aClass427_9453.aFloatArray4807[13]), (aClass180_Sub2_9296.aClass427_9453.aFloatArray4807[14]));
						class326.aClass442_3592.method7151(class432_2170_);
						class326.method5754(i);
						break;
					case 6:
						class326.method5757(!Class306.method5607(i_2177_, -1088851960));
					}
				}
			}
			method14750();
		}
	}

	public Class159[] method2899() {
		return aClass159Array9354;
	}

	void method14800(Class427 class427) {
		if (aClass361Array9356 != null) {
			aClass180_Sub2_9296.method3182(!aBool9335);
			Class432 class432 = aClass180_Sub2_9296.aClass432_9512;
			Class313 class313 = aClass180_Sub2_9296.aClass313_9544;
			boolean bool = aClass180_Sub2_9296.anInt9562 > 0;
			if (bool)
				class313.aClass442_3503.method7138(((float) (aClass180_Sub2_9296.anInt9561 >> 16 & 0xff) / 255.0F), ((float) (aClass180_Sub2_9296.anInt9561 >> 8 & 0xff) / 255.0F), ((float) (aClass180_Sub2_9296.anInt9561 >> 0 & 0xff) / 255.0F));
			else
				class313.aClass442_3503.method7138(0.0F, 0.0F, 0.0F);
			for (int i = 0; i < anInt9355; i++) {
				Class361 class361 = aClass361Array9356[i];
				Class354 class354 = aClass354Array9347[i];
				if (!class361.aBool3848 || !aClass180_Sub2_9296.method3204()) {
					float f = ((float) (anIntArray9352[class361.anInt3844] + anIntArray9352[class361.anInt3842] + anIntArray9352[class361.anInt3846]) * 0.3333333F);
					float f_2179_ = ((float) (anIntArray9360[class361.anInt3844] + anIntArray9360[class361.anInt3842] + anIntArray9360[class361.anInt3846]) * 0.3333333F);
					float f_2180_ = ((float) (anIntArray9362[class361.anInt3844] + anIntArray9362[class361.anInt3842] + anIntArray9362[class361.anInt3846]) * 0.3333333F);
					float f_2181_ = (class427.aFloatArray4807[0] * f + class427.aFloatArray4807[4] * f_2179_ + class427.aFloatArray4807[8] * f_2180_ + class427.aFloatArray4807[12]);
					float f_2182_ = (class427.aFloatArray4807[1] * f + class427.aFloatArray4807[5] * f_2179_ + class427.aFloatArray4807[9] * f_2180_ + class427.aFloatArray4807[13]);
					float f_2183_ = (class427.aFloatArray4807[2] * f + class427.aFloatArray4807[6] * f_2179_ + class427.aFloatArray4807[10] * f_2180_ + class427.aFloatArray4807[14]);
					float f_2184_ = ((float) (1.0 / Math.sqrt((double) (f_2181_ * f_2181_ + f_2182_ * f_2182_ + (f_2183_ * f_2183_)))) * (float) class361.anInt3849);
					class432.method6884(class354.anInt3809, class354.anInt3805 * class361.aShort3843 >> 7, class354.anInt3808 * class361.aShort3845 >> 7, (f_2181_ + (float) class354.anInt3807 - f_2181_ * f_2184_), (f_2182_ + (float) class354.anInt3806 - f_2182_ * f_2184_), f_2183_ - f_2183_ * f_2184_);
					class432.method6882(aClass180_Sub2_9296.aClass432_9451);
					aClass180_Sub2_9296.aClass427_9491.method6784(class432);
					class313.method5654(aClass180_Sub2_9296.aClass427_9491);
					class313.aClass427_3501.method6742();
					class313.anInt3499 = class354.anInt3804;
					if (bool)
						class313.aFloat3504 = 1.0F - ((aClass180_Sub2_9296.aFloat9565 - f_2183_) / (aClass180_Sub2_9296.aFloat9565 - aClass180_Sub2_9296.aFloat9517));
					class313.anInterface38_3498 = null;
					if (class361.aShort3847 != -1)
						class313.anInterface38_3498 = (aClass180_Sub2_9296.aClass336_9532.method5895(aClass180_Sub2_9296.aClass181_2059.method3544(class361.aShort3847 & 0xffff, (byte) -16)));
					class313.method5656(bool);
				}
			}
			aClass180_Sub2_9296.method3182(true);
		}
	}

	public byte[] method2999() {
		return aByteArray9321;
	}

	public int method3054() {
		if (!aBool9304)
			method14754();
		return anInt9318;
	}

	boolean method14801() {
		if (aClass344_9361.aBool3695)
			return true;
		if (aClass344_9361.anInterface44_3696 == null)
			aClass344_9361.anInterface44_3696 = aClass180_Sub2_9296.method15025(false);
		Interface44 interface44 = aClass344_9361.anInterface44_3696;
		interface44.method323(anInt9319 * 6);
		Unsafe unsafe = aClass180_Sub2_9296.anUnsafe9437;
		if (unsafe != null) {
			int i = anInt9319 * 6;
			long l = interface44.method209(0, i);
			if (l == 0L)
				return false;
			for (int i_2185_ = 0; i_2185_ < anInt9319; i_2185_++) {
				unsafe.putShort(l, aShortArray9322[i_2185_]);
				l += 2L;
				unsafe.putShort(l, aShortArray9323[i_2185_]);
				l += 2L;
				unsafe.putShort(l, aShortArray9324[i_2185_]);
				l += 2L;
			}
			interface44.method211();
			aClass344_9361.anInterface44_3693 = interface44;
			aClass344_9361.aBool3695 = true;
			aBool9320 = true;
			return true;
		}
		ByteBuffer bytebuffer = aClass180_Sub2_9296.aByteBuffer9438;
		bytebuffer.clear();
		for (int i = 0; i < anInt9319; i++) {
			bytebuffer.putShort(aShortArray9322[i]);
			bytebuffer.putShort(aShortArray9323[i]);
			bytebuffer.putShort(aShortArray9324[i]);
		}
		if (interface44.method213(0, bytebuffer.position(), aClass180_Sub2_9296.aLong9439)) {
			aClass344_9361.anInterface44_3693 = interface44;
			aClass344_9361.aBool3695 = true;
			aBool9320 = true;
			return true;
		}
		return false;
	}

	public void method2957(Class432 class432, Class169 class169, int i) {
		if (aClass348_9370 != null)
			aClass348_9370.method6164();
		if (class169 != null)
			class169.aBool1874 = false;
		if (anInt9308 != 0) {
			Class427 class427 = aClass180_Sub2_9296.aClass427_9469;
			Class427 class427_2186_ = aClass180_Sub2_9296.aClass427_9435;
			Class427 class427_2187_ = aClass180_Sub2_9296.aClass427_9491;
			class427_2186_.method6784(class432);
			class427_2187_.method6750(class427_2186_);
			class427_2187_.method6751(aClass180_Sub2_9296.aClass427_9530);
			if (!aBool9304)
				method14754();
			float[] fs = aClass180_Sub2_9296.aFloatArray9564;
			class427_2186_.method6773(0.0F, (float) anInt9340, 0.0F, fs);
			float f = fs[0];
			float f_2188_ = fs[1];
			float f_2189_ = fs[2];
			class427_2186_.method6773(0.0F, (float) anInt9318, 0.0F, fs);
			float f_2190_ = fs[0];
			float f_2191_ = fs[1];
			float f_2192_ = fs[2];
			for (int i_2193_ = 0; i_2193_ < 6; i_2193_++) {
				float[] fs_2194_ = aClass180_Sub2_9296.aFloatArrayArray9475[i_2193_];
				float f_2195_ = (fs_2194_[0] * f + fs_2194_[1] * f_2188_ + fs_2194_[2] * f_2189_ + fs_2194_[3] + (float) anInt9331);
				float f_2196_ = (fs_2194_[0] * f_2190_ + fs_2194_[1] * f_2191_ + fs_2194_[2] * f_2192_ + fs_2194_[3] + (float) anInt9331);
				if (f_2195_ < 0.0F && f_2196_ < 0.0F)
					return;
			}
			if (class169 != null) {
				boolean bool = false;
				boolean bool_2197_ = true;
				int i_2198_ = anInt9342 + anInt9343 >> 1;
				int i_2199_ = anInt9344 + anInt9345 >> 1;
				int i_2200_ = i_2198_;
				int i_2201_ = anInt9340;
				int i_2202_ = i_2199_;
				float f_2203_ = (class427_2187_.aFloatArray4807[0] * (float) i_2200_ + class427_2187_.aFloatArray4807[4] * (float) i_2201_ + class427_2187_.aFloatArray4807[8] * (float) i_2202_ + class427_2187_.aFloatArray4807[12]);
				float f_2204_ = (class427_2187_.aFloatArray4807[1] * (float) i_2200_ + class427_2187_.aFloatArray4807[5] * (float) i_2201_ + class427_2187_.aFloatArray4807[9] * (float) i_2202_ + class427_2187_.aFloatArray4807[13]);
				float f_2205_ = (class427_2187_.aFloatArray4807[2] * (float) i_2200_ + class427_2187_.aFloatArray4807[6] * (float) i_2201_ + class427_2187_.aFloatArray4807[10] * (float) i_2202_ + class427_2187_.aFloatArray4807[14]);
				float f_2206_ = (class427_2187_.aFloatArray4807[3] * (float) i_2200_ + class427_2187_.aFloatArray4807[7] * (float) i_2201_ + class427_2187_.aFloatArray4807[11] * (float) i_2202_ + class427_2187_.aFloatArray4807[15]);
				if (f_2205_ >= -f_2206_) {
					class169.anInt1872 = (int) (aClass180_Sub2_9296.aFloat9476 + (aClass180_Sub2_9296.aFloat9477 * f_2203_ / f_2206_));
					class169.anInt1876 = (int) (aClass180_Sub2_9296.aFloat9478 + (aClass180_Sub2_9296.aFloat9500 * f_2204_ / f_2206_));
				} else
					bool = true;
				i_2200_ = i_2198_;
				i_2201_ = anInt9318;
				i_2202_ = i_2199_;
				float f_2207_ = (class427_2187_.aFloatArray4807[0] * (float) i_2200_ + class427_2187_.aFloatArray4807[4] * (float) i_2201_ + class427_2187_.aFloatArray4807[8] * (float) i_2202_ + class427_2187_.aFloatArray4807[12]);
				float f_2208_ = (class427_2187_.aFloatArray4807[1] * (float) i_2200_ + class427_2187_.aFloatArray4807[5] * (float) i_2201_ + class427_2187_.aFloatArray4807[9] * (float) i_2202_ + class427_2187_.aFloatArray4807[13]);
				float f_2209_ = (class427_2187_.aFloatArray4807[2] * (float) i_2200_ + class427_2187_.aFloatArray4807[6] * (float) i_2201_ + class427_2187_.aFloatArray4807[10] * (float) i_2202_ + class427_2187_.aFloatArray4807[14]);
				float f_2210_ = (class427_2187_.aFloatArray4807[3] * (float) i_2200_ + class427_2187_.aFloatArray4807[7] * (float) i_2201_ + class427_2187_.aFloatArray4807[11] * (float) i_2202_ + class427_2187_.aFloatArray4807[15]);
				if (f_2209_ >= -f_2210_) {
					class169.anInt1873 = (int) (aClass180_Sub2_9296.aFloat9476 + (aClass180_Sub2_9296.aFloat9477 * f_2207_ / f_2210_));
					class169.anInt1875 = (int) (aClass180_Sub2_9296.aFloat9478 + (aClass180_Sub2_9296.aFloat9500 * f_2208_ / f_2210_));
				} else
					bool = true;
				if (bool) {
					if (f_2205_ < -f_2206_ && f_2209_ < -f_2210_)
						bool_2197_ = false;
					else if (f_2205_ < -f_2206_) {
						float f_2211_ = (f_2205_ + f_2206_) / (f_2209_ + f_2210_) - 1.0F;
						float f_2212_ = f_2203_ + f_2211_ * (f_2207_ - f_2203_);
						float f_2213_ = f_2204_ + f_2211_ * (f_2208_ - f_2204_);
						float f_2214_ = f_2206_ + f_2211_ * (f_2210_ - f_2206_);
						class169.anInt1872 = (int) (aClass180_Sub2_9296.aFloat9476 + (aClass180_Sub2_9296.aFloat9477 * f_2212_ / f_2214_));
						class169.anInt1876 = (int) (aClass180_Sub2_9296.aFloat9478 + (aClass180_Sub2_9296.aFloat9500 * f_2213_ / f_2214_));
					} else if (f_2209_ < -f_2210_) {
						float f_2215_ = (f_2209_ + f_2210_) / (f_2205_ + f_2206_) - 1.0F;
						float f_2216_ = f_2207_ + f_2215_ * (f_2203_ - f_2207_);
						float f_2217_ = f_2208_ + f_2215_ * (f_2204_ - f_2208_);
						float f_2218_ = f_2210_ + f_2215_ * (f_2206_ - f_2210_);
						class169.anInt1873 = (int) (aClass180_Sub2_9296.aFloat9476 + (aClass180_Sub2_9296.aFloat9477 * f_2216_ / f_2218_));
						class169.anInt1875 = (int) (aClass180_Sub2_9296.aFloat9478 + (aClass180_Sub2_9296.aFloat9500 * f_2217_ / f_2218_));
					}
				}
				if (bool_2197_) {
					if (f_2205_ / f_2206_ > f_2209_ / f_2210_) {
						float f_2219_ = (f_2203_ + (class427.aFloatArray4807[0] * (float) anInt9331) + class427.aFloatArray4807[12]);
						float f_2220_ = (f_2206_ + (class427.aFloatArray4807[3] * (float) anInt9331) + class427.aFloatArray4807[15]);
						class169.anInt1877 = (int) (aClass180_Sub2_9296.aFloat9476 - (float) class169.anInt1872 + (aClass180_Sub2_9296.aFloat9477 * f_2219_ / f_2220_));
					} else {
						float f_2221_ = (f_2207_ + (class427.aFloatArray4807[0] * (float) anInt9331) + class427.aFloatArray4807[12]);
						float f_2222_ = (f_2210_ + (class427.aFloatArray4807[3] * (float) anInt9331) + class427.aFloatArray4807[15]);
						class169.anInt1877 = (int) (aClass180_Sub2_9296.aFloat9476 - (float) class169.anInt1873 + (aClass180_Sub2_9296.aFloat9477 * f_2221_ / f_2222_));
					}
					class169.aBool1874 = true;
				}
			}
			aClass180_Sub2_9296.method15013(i);
			method14763(class432);
			aClass180_Sub2_9296.method15013(0);
			class427_2186_.method6784(class432);
			class427_2186_.method6751(aClass180_Sub2_9296.aClass427_9459);
			method14764(class427_2186_);
		}
	}

	boolean method14802() {
		boolean bool = !aClass363_9334.aBool3855;
		boolean bool_2223_ = (anInt9298 & 0x37) != 0 && !aClass363_9368.aBool3855;
		boolean bool_2224_ = !aClass363_9299.aBool3855;
		boolean bool_2225_ = !aClass363_9332.aBool3855;
		if (!bool_2224_ && !bool && !bool_2223_ && !bool_2225_)
			return true;
		boolean bool_2226_ = true;
		if (bool_2224_ && aShortArray9333 != null) {
			if (aClass363_9299.anInterface37_3857 == null)
				aClass363_9299.anInterface37_3857 = aClass180_Sub2_9296.method15035(aBool9341);
			Interface37 interface37 = aClass363_9299.anInterface37_3857;
			interface37.method219(anInt9308 * 12, 12);
			Unsafe unsafe = aClass180_Sub2_9296.anUnsafe9437;
			if (unsafe != null) {
				int i = anInt9308 * 12;
				long l = interface37.method209(0, i);
				for (int i_2227_ = 0; i_2227_ < anInt9308; i_2227_++) {
					short i_2228_ = aShortArray9333[i_2227_];
					unsafe.putFloat(l, (float) anIntArray9352[i_2228_]);
					l += 4L;
					unsafe.putFloat(l, (float) anIntArray9360[i_2228_]);
					l += 4L;
					unsafe.putFloat(l, (float) anIntArray9362[i_2228_]);
					l += 4L;
				}
				interface37.method211();
			} else {
				ByteBuffer bytebuffer = aClass180_Sub2_9296.aByteBuffer9438;
				bytebuffer.clear();
				for (int i = 0; i < anInt9308; i++) {
					bytebuffer.putFloat((float) anIntArray9352[aShortArray9333[i]]);
					bytebuffer.putFloat((float) anIntArray9360[aShortArray9333[i]]);
					bytebuffer.putFloat((float) anIntArray9362[aShortArray9333[i]]);
				}
				interface37.method213(0, bytebuffer.position(), aClass180_Sub2_9296.aLong9439);
			}
			aClass363_9299.anInterface37_3856 = interface37;
			aClass363_9299.aBool3855 = true;
		}
		if (bool) {
			if (aClass363_9334.anInterface37_3857 == null)
				aClass363_9334.anInterface37_3857 = aClass180_Sub2_9296.method15035(aBool9341);
			Interface37 interface37 = aClass363_9334.anInterface37_3857;
			interface37.method219(anInt9308 * 4, 4);
			Unsafe unsafe = aClass180_Sub2_9296.anUnsafe9437;
			if (unsafe != null) {
				int i = anInt9308 * 4;
				long l = interface37.method209(0, i);
				if ((anInt9298 & 0x37) == 0) {
					short[] is;
					short[] is_2229_;
					short[] is_2230_;
					byte[] is_2231_;
					if (aClass379_9317 != null) {
						is = aClass379_9317.aShortArray3928;
						is_2229_ = aClass379_9317.aShortArray3929;
						is_2230_ = aClass379_9317.aShortArray3930;
						is_2231_ = aClass379_9317.aByteArray3931;
					} else {
						is = aShortArray9311;
						is_2229_ = aShortArray9305;
						is_2230_ = aShortArray9313;
						is_2231_ = aByteArray9314;
					}
					float f = (aClass180_Sub2_9296.aFloat9516 * 768.0F / (float) aShort9300);
					float f_2232_ = (aClass180_Sub2_9296.aFloat9548 * 768.0F / (float) aShort9300);
					for (int i_2233_ = 0; i_2233_ < anInt9308; i_2233_++) {
						short i_2234_ = aShortArray9358[i_2233_];
						int i_2235_ = method14766(aShortArray9326[i_2234_] & 0xffff, aShortArray9325[i_2234_], aShort9339);
						float f_2236_ = ((float) (i_2235_ >> 16 & 0xff) * aClass180_Sub2_9296.aFloat9583);
						float f_2237_ = ((float) (i_2235_ >> 8 & 0xff) * aClass180_Sub2_9296.aFloat9513);
						float f_2238_ = ((float) (i_2235_ & 0xff) * aClass180_Sub2_9296.aFloat9448);
						byte i_2239_ = is_2231_[i_2233_];
						float f_2240_;
						if (i_2239_ == 0)
							f_2240_ = (((aClass180_Sub2_9296.aFloatArray9507[0] * (float) is[i_2233_]) + (aClass180_Sub2_9296.aFloatArray9507[1] * (float) is_2229_[i_2233_]) + (aClass180_Sub2_9296.aFloatArray9507[2] * (float) is_2230_[i_2233_])) * 0.0026041667F);
						else
							f_2240_ = (((aClass180_Sub2_9296.aFloatArray9507[0] * (float) is[i_2233_]) + (aClass180_Sub2_9296.aFloatArray9507[1] * (float) is_2229_[i_2233_]) + (aClass180_Sub2_9296.aFloatArray9507[2] * (float) is_2230_[i_2233_])) / ((float) i_2239_ * 256.0F));
						float f_2241_ = (aClass180_Sub2_9296.aFloat9551 + f_2240_ * (f_2240_ < 0.0F ? f_2232_ : f));
						int i_2242_ = (int) (f_2236_ * f_2241_);
						if (i_2242_ < 0)
							i_2242_ = 0;
						else if (i_2242_ > 255)
							i_2242_ = 255;
						int i_2243_ = (int) (f_2237_ * f_2241_);
						if (i_2243_ < 0)
							i_2243_ = 0;
						else if (i_2243_ > 255)
							i_2243_ = 255;
						int i_2244_ = (int) (f_2238_ * f_2241_);
						if (i_2244_ < 0)
							i_2244_ = 0;
						else if (i_2244_ > 255)
							i_2244_ = 255;
						unsafe.putInt(l, (255 - aByteArray9321[i_2234_] << 24 | i_2242_ << 16 | i_2243_ << 8 | i_2244_));
						l += 4L;
					}
				} else {
					for (int i_2245_ = 0; i_2245_ < anInt9308; i_2245_++) {
						short i_2246_ = aShortArray9358[i_2245_];
						int i_2247_ = (255 - aByteArray9321[i_2246_] << 24 | method14766(aShortArray9326[i_2246_] & 0xffff, aShortArray9325[i_2246_], aShort9339));
						unsafe.putInt(l, i_2247_);
						l += 4L;
					}
				}
				interface37.method211();
			} else {
				ByteBuffer bytebuffer = aClass180_Sub2_9296.aByteBuffer9438;
				bytebuffer.clear();
				if ((anInt9298 & 0x37) == 0) {
					short[] is;
					short[] is_2248_;
					short[] is_2249_;
					byte[] is_2250_;
					if (aClass379_9317 != null) {
						is = aClass379_9317.aShortArray3928;
						is_2248_ = aClass379_9317.aShortArray3929;
						is_2249_ = aClass379_9317.aShortArray3930;
						is_2250_ = aClass379_9317.aByteArray3931;
					} else {
						is = aShortArray9311;
						is_2248_ = aShortArray9305;
						is_2249_ = aShortArray9313;
						is_2250_ = aByteArray9314;
					}
					float f = (aClass180_Sub2_9296.aFloat9516 * 768.0F / (float) aShort9300);
					float f_2251_ = (aClass180_Sub2_9296.aFloat9548 * 768.0F / (float) aShort9300);
					for (int i = 0; i < anInt9308; i++) {
						short i_2252_ = aShortArray9358[i];
						int i_2253_ = method14766(aShortArray9326[i_2252_] & 0xffff, aShortArray9325[i_2252_], aShort9339);
						float f_2254_ = ((float) (i_2253_ >> 16 & 0xff) * aClass180_Sub2_9296.aFloat9583);
						float f_2255_ = ((float) (i_2253_ >> 8 & 0xff) * aClass180_Sub2_9296.aFloat9513);
						float f_2256_ = ((float) (i_2253_ & 0xff) * aClass180_Sub2_9296.aFloat9448);
						byte i_2257_ = is_2250_[i];
						float f_2258_;
						if (i_2257_ == 0)
							f_2258_ = ((aClass180_Sub2_9296.aFloatArray9507[0] * (float) is[i]) + (aClass180_Sub2_9296.aFloatArray9507[1] * (float) is_2248_[i]) + (aClass180_Sub2_9296.aFloatArray9507[2] * (float) is_2249_[i])) * 0.0026041667F;
						else
							f_2258_ = (((aClass180_Sub2_9296.aFloatArray9507[0] * (float) is[i]) + (aClass180_Sub2_9296.aFloatArray9507[1] * (float) is_2248_[i]) + (aClass180_Sub2_9296.aFloatArray9507[2] * (float) is_2249_[i])) / ((float) i_2257_ * 256.0F));
						float f_2259_ = (aClass180_Sub2_9296.aFloat9551 + f_2258_ * (f_2258_ < 0.0F ? f_2251_ : f));
						int i_2260_ = (int) (f_2254_ * f_2259_);
						if (i_2260_ < 0)
							i_2260_ = 0;
						else if (i_2260_ > 255)
							i_2260_ = 255;
						int i_2261_ = (int) (f_2255_ * f_2259_);
						if (i_2261_ < 0)
							i_2261_ = 0;
						else if (i_2261_ > 255)
							i_2261_ = 255;
						int i_2262_ = (int) (f_2256_ * f_2259_);
						if (i_2262_ < 0)
							i_2262_ = 0;
						else if (i_2262_ > 255)
							i_2262_ = 255;
						bytebuffer.putInt(255 - aByteArray9321[i_2252_] << 24 | i_2260_ << 16 | i_2261_ << 8 | i_2262_);
					}
				} else {
					for (int i = 0; i < anInt9308; i++) {
						short i_2263_ = aShortArray9358[i];
						int i_2264_ = (255 - aByteArray9321[i_2263_] << 24 | method14766(aShortArray9326[i_2263_] & 0xffff, aShortArray9325[i_2263_], aShort9339));
						bytebuffer.putInt(i_2264_);
					}
				}
				interface37.method213(0, bytebuffer.position(), aClass180_Sub2_9296.aLong9439);
			}
			aClass363_9334.anInterface37_3856 = interface37;
			aClass363_9334.aBool3855 = true;
		}
		if (bool_2223_) {
			if (aClass363_9368.anInterface37_3857 == null)
				aClass363_9368.anInterface37_3857 = aClass180_Sub2_9296.method15035(aBool9341);
			Interface37 interface37 = aClass363_9368.anInterface37_3857;
			interface37.method219(anInt9308 * 12, 12);
			short[] is;
			short[] is_2265_;
			short[] is_2266_;
			byte[] is_2267_;
			if (aClass379_9317 != null) {
				is = aClass379_9317.aShortArray3928;
				is_2265_ = aClass379_9317.aShortArray3929;
				is_2266_ = aClass379_9317.aShortArray3930;
				is_2267_ = aClass379_9317.aByteArray3931;
			} else {
				is = aShortArray9311;
				is_2265_ = aShortArray9305;
				is_2266_ = aShortArray9313;
				is_2267_ = aByteArray9314;
			}
			Unsafe unsafe = aClass180_Sub2_9296.anUnsafe9437;
			if (unsafe != null) {
				int i = anInt9308 * 12;
				long l = interface37.method209(0, i);
				for (int i_2268_ = 0; i_2268_ < anInt9308; i_2268_++) {
					Class442 class442 = new Class442((float) is[i_2268_], (float) is_2265_[i_2268_], (float) is_2266_[i_2268_]);
					if (class442.method7160() != 0.0F) {
						if (is_2267_[i_2268_] > 1)
							class442.method7167((float) is_2267_[i_2268_]);
						class442.method7173();
					}
					unsafe.putFloat(l, class442.aFloat4918);
					l += 4L;
					unsafe.putFloat(l, class442.aFloat4915);
					l += 4L;
					unsafe.putFloat(l, class442.aFloat4919);
					l += 4L;
				}
				interface37.method211();
			} else {
				ByteBuffer bytebuffer = aClass180_Sub2_9296.aByteBuffer9438;
				bytebuffer.clear();
				for (int i = 0; i < anInt9308; i++) {
					Class442 class442 = new Class442((float) is[i], (float) is_2265_[i], (float) is_2266_[i]);
					if (class442.method7160() != 0.0F) {
						if (is_2267_[i] > 1)
							class442.method7167((float) is_2267_[i]);
						class442.method7173();
					}
					bytebuffer.putFloat(class442.aFloat4918);
					bytebuffer.putFloat(class442.aFloat4915);
					bytebuffer.putFloat(class442.aFloat4919);
				}
				interface37.method213(0, bytebuffer.position(), aClass180_Sub2_9296.aLong9439);
			}
			aClass363_9368.anInterface37_3856 = interface37;
			aClass363_9368.aBool3855 = true;
		}
		if (bool_2225_) {
			if (aClass363_9332.anInterface37_3857 == null)
				aClass363_9332.anInterface37_3857 = aClass180_Sub2_9296.method15035(aBool9341);
			Interface37 interface37 = aClass363_9332.anInterface37_3857;
			interface37.method219(anInt9308 * 8, 8);
			Unsafe unsafe = aClass180_Sub2_9296.anUnsafe9437;
			if (unsafe != null) {
				int i = anInt9308 * 8;
				long l = interface37.method209(0, i);
				for (int i_2269_ = 0; i_2269_ < anInt9308; i_2269_++) {
					unsafe.putFloat(l, aFloatArray9315[i_2269_]);
					l += 4L;
					unsafe.putFloat(l, aFloatArray9316[i_2269_]);
					l += 4L;
				}
				interface37.method211();
			} else {
				ByteBuffer bytebuffer = aClass180_Sub2_9296.aByteBuffer9438;
				bytebuffer.clear();
				for (int i = 0; i < anInt9308; i++) {
					bytebuffer.putFloat(aFloatArray9315[i]);
					bytebuffer.putFloat(aFloatArray9316[i]);
				}
				interface37.method213(0, bytebuffer.position(), aClass180_Sub2_9296.aLong9439);
			}
			aClass363_9332.anInterface37_3856 = interface37;
			aClass363_9332.aBool3855 = true;
		}
		return bool_2226_;
	}

	boolean method14803() {
		boolean bool = !aClass363_9334.aBool3855;
		boolean bool_2270_ = (anInt9298 & 0x37) != 0 && !aClass363_9368.aBool3855;
		boolean bool_2271_ = !aClass363_9299.aBool3855;
		boolean bool_2272_ = !aClass363_9332.aBool3855;
		if (!bool_2271_ && !bool && !bool_2270_ && !bool_2272_)
			return true;
		boolean bool_2273_ = true;
		if (bool_2271_ && aShortArray9333 != null) {
			if (aClass363_9299.anInterface37_3857 == null)
				aClass363_9299.anInterface37_3857 = aClass180_Sub2_9296.method15035(aBool9341);
			Interface37 interface37 = aClass363_9299.anInterface37_3857;
			interface37.method219(anInt9308 * 12, 12);
			Unsafe unsafe = aClass180_Sub2_9296.anUnsafe9437;
			if (unsafe != null) {
				int i = anInt9308 * 12;
				long l = interface37.method209(0, i);
				for (int i_2274_ = 0; i_2274_ < anInt9308; i_2274_++) {
					short i_2275_ = aShortArray9333[i_2274_];
					unsafe.putFloat(l, (float) anIntArray9352[i_2275_]);
					l += 4L;
					unsafe.putFloat(l, (float) anIntArray9360[i_2275_]);
					l += 4L;
					unsafe.putFloat(l, (float) anIntArray9362[i_2275_]);
					l += 4L;
				}
				interface37.method211();
			} else {
				ByteBuffer bytebuffer = aClass180_Sub2_9296.aByteBuffer9438;
				bytebuffer.clear();
				for (int i = 0; i < anInt9308; i++) {
					bytebuffer.putFloat((float) anIntArray9352[aShortArray9333[i]]);
					bytebuffer.putFloat((float) anIntArray9360[aShortArray9333[i]]);
					bytebuffer.putFloat((float) anIntArray9362[aShortArray9333[i]]);
				}
				interface37.method213(0, bytebuffer.position(), aClass180_Sub2_9296.aLong9439);
			}
			aClass363_9299.anInterface37_3856 = interface37;
			aClass363_9299.aBool3855 = true;
		}
		if (bool) {
			if (aClass363_9334.anInterface37_3857 == null)
				aClass363_9334.anInterface37_3857 = aClass180_Sub2_9296.method15035(aBool9341);
			Interface37 interface37 = aClass363_9334.anInterface37_3857;
			interface37.method219(anInt9308 * 4, 4);
			Unsafe unsafe = aClass180_Sub2_9296.anUnsafe9437;
			if (unsafe != null) {
				int i = anInt9308 * 4;
				long l = interface37.method209(0, i);
				if ((anInt9298 & 0x37) == 0) {
					short[] is;
					short[] is_2276_;
					short[] is_2277_;
					byte[] is_2278_;
					if (aClass379_9317 != null) {
						is = aClass379_9317.aShortArray3928;
						is_2276_ = aClass379_9317.aShortArray3929;
						is_2277_ = aClass379_9317.aShortArray3930;
						is_2278_ = aClass379_9317.aByteArray3931;
					} else {
						is = aShortArray9311;
						is_2276_ = aShortArray9305;
						is_2277_ = aShortArray9313;
						is_2278_ = aByteArray9314;
					}
					float f = (aClass180_Sub2_9296.aFloat9516 * 768.0F / (float) aShort9300);
					float f_2279_ = (aClass180_Sub2_9296.aFloat9548 * 768.0F / (float) aShort9300);
					for (int i_2280_ = 0; i_2280_ < anInt9308; i_2280_++) {
						short i_2281_ = aShortArray9358[i_2280_];
						int i_2282_ = method14766(aShortArray9326[i_2281_] & 0xffff, aShortArray9325[i_2281_], aShort9339);
						float f_2283_ = ((float) (i_2282_ >> 16 & 0xff) * aClass180_Sub2_9296.aFloat9583);
						float f_2284_ = ((float) (i_2282_ >> 8 & 0xff) * aClass180_Sub2_9296.aFloat9513);
						float f_2285_ = ((float) (i_2282_ & 0xff) * aClass180_Sub2_9296.aFloat9448);
						byte i_2286_ = is_2278_[i_2280_];
						float f_2287_;
						if (i_2286_ == 0)
							f_2287_ = (((aClass180_Sub2_9296.aFloatArray9507[0] * (float) is[i_2280_]) + (aClass180_Sub2_9296.aFloatArray9507[1] * (float) is_2276_[i_2280_]) + (aClass180_Sub2_9296.aFloatArray9507[2] * (float) is_2277_[i_2280_])) * 0.0026041667F);
						else
							f_2287_ = (((aClass180_Sub2_9296.aFloatArray9507[0] * (float) is[i_2280_]) + (aClass180_Sub2_9296.aFloatArray9507[1] * (float) is_2276_[i_2280_]) + (aClass180_Sub2_9296.aFloatArray9507[2] * (float) is_2277_[i_2280_])) / ((float) i_2286_ * 256.0F));
						float f_2288_ = (aClass180_Sub2_9296.aFloat9551 + f_2287_ * (f_2287_ < 0.0F ? f_2279_ : f));
						int i_2289_ = (int) (f_2283_ * f_2288_);
						if (i_2289_ < 0)
							i_2289_ = 0;
						else if (i_2289_ > 255)
							i_2289_ = 255;
						int i_2290_ = (int) (f_2284_ * f_2288_);
						if (i_2290_ < 0)
							i_2290_ = 0;
						else if (i_2290_ > 255)
							i_2290_ = 255;
						int i_2291_ = (int) (f_2285_ * f_2288_);
						if (i_2291_ < 0)
							i_2291_ = 0;
						else if (i_2291_ > 255)
							i_2291_ = 255;
						unsafe.putInt(l, (255 - aByteArray9321[i_2281_] << 24 | i_2289_ << 16 | i_2290_ << 8 | i_2291_));
						l += 4L;
					}
				} else {
					for (int i_2292_ = 0; i_2292_ < anInt9308; i_2292_++) {
						short i_2293_ = aShortArray9358[i_2292_];
						int i_2294_ = (255 - aByteArray9321[i_2293_] << 24 | method14766(aShortArray9326[i_2293_] & 0xffff, aShortArray9325[i_2293_], aShort9339));
						unsafe.putInt(l, i_2294_);
						l += 4L;
					}
				}
				interface37.method211();
			} else {
				ByteBuffer bytebuffer = aClass180_Sub2_9296.aByteBuffer9438;
				bytebuffer.clear();
				if ((anInt9298 & 0x37) == 0) {
					short[] is;
					short[] is_2295_;
					short[] is_2296_;
					byte[] is_2297_;
					if (aClass379_9317 != null) {
						is = aClass379_9317.aShortArray3928;
						is_2295_ = aClass379_9317.aShortArray3929;
						is_2296_ = aClass379_9317.aShortArray3930;
						is_2297_ = aClass379_9317.aByteArray3931;
					} else {
						is = aShortArray9311;
						is_2295_ = aShortArray9305;
						is_2296_ = aShortArray9313;
						is_2297_ = aByteArray9314;
					}
					float f = (aClass180_Sub2_9296.aFloat9516 * 768.0F / (float) aShort9300);
					float f_2298_ = (aClass180_Sub2_9296.aFloat9548 * 768.0F / (float) aShort9300);
					for (int i = 0; i < anInt9308; i++) {
						short i_2299_ = aShortArray9358[i];
						int i_2300_ = method14766(aShortArray9326[i_2299_] & 0xffff, aShortArray9325[i_2299_], aShort9339);
						float f_2301_ = ((float) (i_2300_ >> 16 & 0xff) * aClass180_Sub2_9296.aFloat9583);
						float f_2302_ = ((float) (i_2300_ >> 8 & 0xff) * aClass180_Sub2_9296.aFloat9513);
						float f_2303_ = ((float) (i_2300_ & 0xff) * aClass180_Sub2_9296.aFloat9448);
						byte i_2304_ = is_2297_[i];
						float f_2305_;
						if (i_2304_ == 0)
							f_2305_ = ((aClass180_Sub2_9296.aFloatArray9507[0] * (float) is[i]) + (aClass180_Sub2_9296.aFloatArray9507[1] * (float) is_2295_[i]) + (aClass180_Sub2_9296.aFloatArray9507[2] * (float) is_2296_[i])) * 0.0026041667F;
						else
							f_2305_ = (((aClass180_Sub2_9296.aFloatArray9507[0] * (float) is[i]) + (aClass180_Sub2_9296.aFloatArray9507[1] * (float) is_2295_[i]) + (aClass180_Sub2_9296.aFloatArray9507[2] * (float) is_2296_[i])) / ((float) i_2304_ * 256.0F));
						float f_2306_ = (aClass180_Sub2_9296.aFloat9551 + f_2305_ * (f_2305_ < 0.0F ? f_2298_ : f));
						int i_2307_ = (int) (f_2301_ * f_2306_);
						if (i_2307_ < 0)
							i_2307_ = 0;
						else if (i_2307_ > 255)
							i_2307_ = 255;
						int i_2308_ = (int) (f_2302_ * f_2306_);
						if (i_2308_ < 0)
							i_2308_ = 0;
						else if (i_2308_ > 255)
							i_2308_ = 255;
						int i_2309_ = (int) (f_2303_ * f_2306_);
						if (i_2309_ < 0)
							i_2309_ = 0;
						else if (i_2309_ > 255)
							i_2309_ = 255;
						bytebuffer.putInt(255 - aByteArray9321[i_2299_] << 24 | i_2307_ << 16 | i_2308_ << 8 | i_2309_);
					}
				} else {
					for (int i = 0; i < anInt9308; i++) {
						short i_2310_ = aShortArray9358[i];
						int i_2311_ = (255 - aByteArray9321[i_2310_] << 24 | method14766(aShortArray9326[i_2310_] & 0xffff, aShortArray9325[i_2310_], aShort9339));
						bytebuffer.putInt(i_2311_);
					}
				}
				interface37.method213(0, bytebuffer.position(), aClass180_Sub2_9296.aLong9439);
			}
			aClass363_9334.anInterface37_3856 = interface37;
			aClass363_9334.aBool3855 = true;
		}
		if (bool_2270_) {
			if (aClass363_9368.anInterface37_3857 == null)
				aClass363_9368.anInterface37_3857 = aClass180_Sub2_9296.method15035(aBool9341);
			Interface37 interface37 = aClass363_9368.anInterface37_3857;
			interface37.method219(anInt9308 * 12, 12);
			short[] is;
			short[] is_2312_;
			short[] is_2313_;
			byte[] is_2314_;
			if (aClass379_9317 != null) {
				is = aClass379_9317.aShortArray3928;
				is_2312_ = aClass379_9317.aShortArray3929;
				is_2313_ = aClass379_9317.aShortArray3930;
				is_2314_ = aClass379_9317.aByteArray3931;
			} else {
				is = aShortArray9311;
				is_2312_ = aShortArray9305;
				is_2313_ = aShortArray9313;
				is_2314_ = aByteArray9314;
			}
			Unsafe unsafe = aClass180_Sub2_9296.anUnsafe9437;
			if (unsafe != null) {
				int i = anInt9308 * 12;
				long l = interface37.method209(0, i);
				for (int i_2315_ = 0; i_2315_ < anInt9308; i_2315_++) {
					Class442 class442 = new Class442((float) is[i_2315_], (float) is_2312_[i_2315_], (float) is_2313_[i_2315_]);
					if (class442.method7160() != 0.0F) {
						if (is_2314_[i_2315_] > 1)
							class442.method7167((float) is_2314_[i_2315_]);
						class442.method7173();
					}
					unsafe.putFloat(l, class442.aFloat4918);
					l += 4L;
					unsafe.putFloat(l, class442.aFloat4915);
					l += 4L;
					unsafe.putFloat(l, class442.aFloat4919);
					l += 4L;
				}
				interface37.method211();
			} else {
				ByteBuffer bytebuffer = aClass180_Sub2_9296.aByteBuffer9438;
				bytebuffer.clear();
				for (int i = 0; i < anInt9308; i++) {
					Class442 class442 = new Class442((float) is[i], (float) is_2312_[i], (float) is_2313_[i]);
					if (class442.method7160() != 0.0F) {
						if (is_2314_[i] > 1)
							class442.method7167((float) is_2314_[i]);
						class442.method7173();
					}
					bytebuffer.putFloat(class442.aFloat4918);
					bytebuffer.putFloat(class442.aFloat4915);
					bytebuffer.putFloat(class442.aFloat4919);
				}
				interface37.method213(0, bytebuffer.position(), aClass180_Sub2_9296.aLong9439);
			}
			aClass363_9368.anInterface37_3856 = interface37;
			aClass363_9368.aBool3855 = true;
		}
		if (bool_2272_) {
			if (aClass363_9332.anInterface37_3857 == null)
				aClass363_9332.anInterface37_3857 = aClass180_Sub2_9296.method15035(aBool9341);
			Interface37 interface37 = aClass363_9332.anInterface37_3857;
			interface37.method219(anInt9308 * 8, 8);
			Unsafe unsafe = aClass180_Sub2_9296.anUnsafe9437;
			if (unsafe != null) {
				int i = anInt9308 * 8;
				long l = interface37.method209(0, i);
				for (int i_2316_ = 0; i_2316_ < anInt9308; i_2316_++) {
					unsafe.putFloat(l, aFloatArray9315[i_2316_]);
					l += 4L;
					unsafe.putFloat(l, aFloatArray9316[i_2316_]);
					l += 4L;
				}
				interface37.method211();
			} else {
				ByteBuffer bytebuffer = aClass180_Sub2_9296.aByteBuffer9438;
				bytebuffer.clear();
				for (int i = 0; i < anInt9308; i++) {
					bytebuffer.putFloat(aFloatArray9315[i]);
					bytebuffer.putFloat(aFloatArray9316[i]);
				}
				interface37.method213(0, bytebuffer.position(), aClass180_Sub2_9296.aLong9439);
			}
			aClass363_9332.anInterface37_3856 = interface37;
			aClass363_9332.aBool3855 = true;
		}
		return bool_2273_;
	}

	boolean method14804() {
		boolean bool = !aClass363_9334.aBool3855;
		boolean bool_2317_ = (anInt9298 & 0x37) != 0 && !aClass363_9368.aBool3855;
		boolean bool_2318_ = !aClass363_9299.aBool3855;
		boolean bool_2319_ = !aClass363_9332.aBool3855;
		if (!bool_2318_ && !bool && !bool_2317_ && !bool_2319_)
			return true;
		boolean bool_2320_ = true;
		if (bool_2318_ && aShortArray9333 != null) {
			if (aClass363_9299.anInterface37_3857 == null)
				aClass363_9299.anInterface37_3857 = aClass180_Sub2_9296.method15035(aBool9341);
			Interface37 interface37 = aClass363_9299.anInterface37_3857;
			interface37.method219(anInt9308 * 12, 12);
			Unsafe unsafe = aClass180_Sub2_9296.anUnsafe9437;
			if (unsafe != null) {
				int i = anInt9308 * 12;
				long l = interface37.method209(0, i);
				for (int i_2321_ = 0; i_2321_ < anInt9308; i_2321_++) {
					short i_2322_ = aShortArray9333[i_2321_];
					unsafe.putFloat(l, (float) anIntArray9352[i_2322_]);
					l += 4L;
					unsafe.putFloat(l, (float) anIntArray9360[i_2322_]);
					l += 4L;
					unsafe.putFloat(l, (float) anIntArray9362[i_2322_]);
					l += 4L;
				}
				interface37.method211();
			} else {
				ByteBuffer bytebuffer = aClass180_Sub2_9296.aByteBuffer9438;
				bytebuffer.clear();
				for (int i = 0; i < anInt9308; i++) {
					bytebuffer.putFloat((float) anIntArray9352[aShortArray9333[i]]);
					bytebuffer.putFloat((float) anIntArray9360[aShortArray9333[i]]);
					bytebuffer.putFloat((float) anIntArray9362[aShortArray9333[i]]);
				}
				interface37.method213(0, bytebuffer.position(), aClass180_Sub2_9296.aLong9439);
			}
			aClass363_9299.anInterface37_3856 = interface37;
			aClass363_9299.aBool3855 = true;
		}
		if (bool) {
			if (aClass363_9334.anInterface37_3857 == null)
				aClass363_9334.anInterface37_3857 = aClass180_Sub2_9296.method15035(aBool9341);
			Interface37 interface37 = aClass363_9334.anInterface37_3857;
			interface37.method219(anInt9308 * 4, 4);
			Unsafe unsafe = aClass180_Sub2_9296.anUnsafe9437;
			if (unsafe != null) {
				int i = anInt9308 * 4;
				long l = interface37.method209(0, i);
				if ((anInt9298 & 0x37) == 0) {
					short[] is;
					short[] is_2323_;
					short[] is_2324_;
					byte[] is_2325_;
					if (aClass379_9317 != null) {
						is = aClass379_9317.aShortArray3928;
						is_2323_ = aClass379_9317.aShortArray3929;
						is_2324_ = aClass379_9317.aShortArray3930;
						is_2325_ = aClass379_9317.aByteArray3931;
					} else {
						is = aShortArray9311;
						is_2323_ = aShortArray9305;
						is_2324_ = aShortArray9313;
						is_2325_ = aByteArray9314;
					}
					float f = (aClass180_Sub2_9296.aFloat9516 * 768.0F / (float) aShort9300);
					float f_2326_ = (aClass180_Sub2_9296.aFloat9548 * 768.0F / (float) aShort9300);
					for (int i_2327_ = 0; i_2327_ < anInt9308; i_2327_++) {
						short i_2328_ = aShortArray9358[i_2327_];
						int i_2329_ = method14766(aShortArray9326[i_2328_] & 0xffff, aShortArray9325[i_2328_], aShort9339);
						float f_2330_ = ((float) (i_2329_ >> 16 & 0xff) * aClass180_Sub2_9296.aFloat9583);
						float f_2331_ = ((float) (i_2329_ >> 8 & 0xff) * aClass180_Sub2_9296.aFloat9513);
						float f_2332_ = ((float) (i_2329_ & 0xff) * aClass180_Sub2_9296.aFloat9448);
						byte i_2333_ = is_2325_[i_2327_];
						float f_2334_;
						if (i_2333_ == 0)
							f_2334_ = (((aClass180_Sub2_9296.aFloatArray9507[0] * (float) is[i_2327_]) + (aClass180_Sub2_9296.aFloatArray9507[1] * (float) is_2323_[i_2327_]) + (aClass180_Sub2_9296.aFloatArray9507[2] * (float) is_2324_[i_2327_])) * 0.0026041667F);
						else
							f_2334_ = (((aClass180_Sub2_9296.aFloatArray9507[0] * (float) is[i_2327_]) + (aClass180_Sub2_9296.aFloatArray9507[1] * (float) is_2323_[i_2327_]) + (aClass180_Sub2_9296.aFloatArray9507[2] * (float) is_2324_[i_2327_])) / ((float) i_2333_ * 256.0F));
						float f_2335_ = (aClass180_Sub2_9296.aFloat9551 + f_2334_ * (f_2334_ < 0.0F ? f_2326_ : f));
						int i_2336_ = (int) (f_2330_ * f_2335_);
						if (i_2336_ < 0)
							i_2336_ = 0;
						else if (i_2336_ > 255)
							i_2336_ = 255;
						int i_2337_ = (int) (f_2331_ * f_2335_);
						if (i_2337_ < 0)
							i_2337_ = 0;
						else if (i_2337_ > 255)
							i_2337_ = 255;
						int i_2338_ = (int) (f_2332_ * f_2335_);
						if (i_2338_ < 0)
							i_2338_ = 0;
						else if (i_2338_ > 255)
							i_2338_ = 255;
						unsafe.putInt(l, (255 - aByteArray9321[i_2328_] << 24 | i_2336_ << 16 | i_2337_ << 8 | i_2338_));
						l += 4L;
					}
				} else {
					for (int i_2339_ = 0; i_2339_ < anInt9308; i_2339_++) {
						short i_2340_ = aShortArray9358[i_2339_];
						int i_2341_ = (255 - aByteArray9321[i_2340_] << 24 | method14766(aShortArray9326[i_2340_] & 0xffff, aShortArray9325[i_2340_], aShort9339));
						unsafe.putInt(l, i_2341_);
						l += 4L;
					}
				}
				interface37.method211();
			} else {
				ByteBuffer bytebuffer = aClass180_Sub2_9296.aByteBuffer9438;
				bytebuffer.clear();
				if ((anInt9298 & 0x37) == 0) {
					short[] is;
					short[] is_2342_;
					short[] is_2343_;
					byte[] is_2344_;
					if (aClass379_9317 != null) {
						is = aClass379_9317.aShortArray3928;
						is_2342_ = aClass379_9317.aShortArray3929;
						is_2343_ = aClass379_9317.aShortArray3930;
						is_2344_ = aClass379_9317.aByteArray3931;
					} else {
						is = aShortArray9311;
						is_2342_ = aShortArray9305;
						is_2343_ = aShortArray9313;
						is_2344_ = aByteArray9314;
					}
					float f = (aClass180_Sub2_9296.aFloat9516 * 768.0F / (float) aShort9300);
					float f_2345_ = (aClass180_Sub2_9296.aFloat9548 * 768.0F / (float) aShort9300);
					for (int i = 0; i < anInt9308; i++) {
						short i_2346_ = aShortArray9358[i];
						int i_2347_ = method14766(aShortArray9326[i_2346_] & 0xffff, aShortArray9325[i_2346_], aShort9339);
						float f_2348_ = ((float) (i_2347_ >> 16 & 0xff) * aClass180_Sub2_9296.aFloat9583);
						float f_2349_ = ((float) (i_2347_ >> 8 & 0xff) * aClass180_Sub2_9296.aFloat9513);
						float f_2350_ = ((float) (i_2347_ & 0xff) * aClass180_Sub2_9296.aFloat9448);
						byte i_2351_ = is_2344_[i];
						float f_2352_;
						if (i_2351_ == 0)
							f_2352_ = ((aClass180_Sub2_9296.aFloatArray9507[0] * (float) is[i]) + (aClass180_Sub2_9296.aFloatArray9507[1] * (float) is_2342_[i]) + (aClass180_Sub2_9296.aFloatArray9507[2] * (float) is_2343_[i])) * 0.0026041667F;
						else
							f_2352_ = (((aClass180_Sub2_9296.aFloatArray9507[0] * (float) is[i]) + (aClass180_Sub2_9296.aFloatArray9507[1] * (float) is_2342_[i]) + (aClass180_Sub2_9296.aFloatArray9507[2] * (float) is_2343_[i])) / ((float) i_2351_ * 256.0F));
						float f_2353_ = (aClass180_Sub2_9296.aFloat9551 + f_2352_ * (f_2352_ < 0.0F ? f_2345_ : f));
						int i_2354_ = (int) (f_2348_ * f_2353_);
						if (i_2354_ < 0)
							i_2354_ = 0;
						else if (i_2354_ > 255)
							i_2354_ = 255;
						int i_2355_ = (int) (f_2349_ * f_2353_);
						if (i_2355_ < 0)
							i_2355_ = 0;
						else if (i_2355_ > 255)
							i_2355_ = 255;
						int i_2356_ = (int) (f_2350_ * f_2353_);
						if (i_2356_ < 0)
							i_2356_ = 0;
						else if (i_2356_ > 255)
							i_2356_ = 255;
						bytebuffer.putInt(255 - aByteArray9321[i_2346_] << 24 | i_2354_ << 16 | i_2355_ << 8 | i_2356_);
					}
				} else {
					for (int i = 0; i < anInt9308; i++) {
						short i_2357_ = aShortArray9358[i];
						int i_2358_ = (255 - aByteArray9321[i_2357_] << 24 | method14766(aShortArray9326[i_2357_] & 0xffff, aShortArray9325[i_2357_], aShort9339));
						bytebuffer.putInt(i_2358_);
					}
				}
				interface37.method213(0, bytebuffer.position(), aClass180_Sub2_9296.aLong9439);
			}
			aClass363_9334.anInterface37_3856 = interface37;
			aClass363_9334.aBool3855 = true;
		}
		if (bool_2317_) {
			if (aClass363_9368.anInterface37_3857 == null)
				aClass363_9368.anInterface37_3857 = aClass180_Sub2_9296.method15035(aBool9341);
			Interface37 interface37 = aClass363_9368.anInterface37_3857;
			interface37.method219(anInt9308 * 12, 12);
			short[] is;
			short[] is_2359_;
			short[] is_2360_;
			byte[] is_2361_;
			if (aClass379_9317 != null) {
				is = aClass379_9317.aShortArray3928;
				is_2359_ = aClass379_9317.aShortArray3929;
				is_2360_ = aClass379_9317.aShortArray3930;
				is_2361_ = aClass379_9317.aByteArray3931;
			} else {
				is = aShortArray9311;
				is_2359_ = aShortArray9305;
				is_2360_ = aShortArray9313;
				is_2361_ = aByteArray9314;
			}
			Unsafe unsafe = aClass180_Sub2_9296.anUnsafe9437;
			if (unsafe != null) {
				int i = anInt9308 * 12;
				long l = interface37.method209(0, i);
				for (int i_2362_ = 0; i_2362_ < anInt9308; i_2362_++) {
					Class442 class442 = new Class442((float) is[i_2362_], (float) is_2359_[i_2362_], (float) is_2360_[i_2362_]);
					if (class442.method7160() != 0.0F) {
						if (is_2361_[i_2362_] > 1)
							class442.method7167((float) is_2361_[i_2362_]);
						class442.method7173();
					}
					unsafe.putFloat(l, class442.aFloat4918);
					l += 4L;
					unsafe.putFloat(l, class442.aFloat4915);
					l += 4L;
					unsafe.putFloat(l, class442.aFloat4919);
					l += 4L;
				}
				interface37.method211();
			} else {
				ByteBuffer bytebuffer = aClass180_Sub2_9296.aByteBuffer9438;
				bytebuffer.clear();
				for (int i = 0; i < anInt9308; i++) {
					Class442 class442 = new Class442((float) is[i], (float) is_2359_[i], (float) is_2360_[i]);
					if (class442.method7160() != 0.0F) {
						if (is_2361_[i] > 1)
							class442.method7167((float) is_2361_[i]);
						class442.method7173();
					}
					bytebuffer.putFloat(class442.aFloat4918);
					bytebuffer.putFloat(class442.aFloat4915);
					bytebuffer.putFloat(class442.aFloat4919);
				}
				interface37.method213(0, bytebuffer.position(), aClass180_Sub2_9296.aLong9439);
			}
			aClass363_9368.anInterface37_3856 = interface37;
			aClass363_9368.aBool3855 = true;
		}
		if (bool_2319_) {
			if (aClass363_9332.anInterface37_3857 == null)
				aClass363_9332.anInterface37_3857 = aClass180_Sub2_9296.method15035(aBool9341);
			Interface37 interface37 = aClass363_9332.anInterface37_3857;
			interface37.method219(anInt9308 * 8, 8);
			Unsafe unsafe = aClass180_Sub2_9296.anUnsafe9437;
			if (unsafe != null) {
				int i = anInt9308 * 8;
				long l = interface37.method209(0, i);
				for (int i_2363_ = 0; i_2363_ < anInt9308; i_2363_++) {
					unsafe.putFloat(l, aFloatArray9315[i_2363_]);
					l += 4L;
					unsafe.putFloat(l, aFloatArray9316[i_2363_]);
					l += 4L;
				}
				interface37.method211();
			} else {
				ByteBuffer bytebuffer = aClass180_Sub2_9296.aByteBuffer9438;
				bytebuffer.clear();
				for (int i = 0; i < anInt9308; i++) {
					bytebuffer.putFloat(aFloatArray9315[i]);
					bytebuffer.putFloat(aFloatArray9316[i]);
				}
				interface37.method213(0, bytebuffer.position(), aClass180_Sub2_9296.aLong9439);
			}
			aClass363_9332.anInterface37_3856 = interface37;
			aClass363_9332.aBool3855 = true;
		}
		return bool_2320_;
	}

	void method14805() {
		int i = 32767;
		int i_2364_ = 32767;
		int i_2365_ = 32767;
		int i_2366_ = -32768;
		int i_2367_ = -32768;
		int i_2368_ = -32768;
		int i_2369_ = 0;
		int i_2370_ = 0;
		for (int i_2371_ = 0; i_2371_ < anInt9302; i_2371_++) {
			int i_2372_ = anIntArray9352[i_2371_];
			int i_2373_ = anIntArray9360[i_2371_];
			int i_2374_ = anIntArray9362[i_2371_];
			if (i_2372_ < i)
				i = i_2372_;
			if (i_2372_ > i_2366_)
				i_2366_ = i_2372_;
			if (i_2373_ < i_2364_)
				i_2364_ = i_2373_;
			if (i_2373_ > i_2367_)
				i_2367_ = i_2373_;
			if (i_2374_ < i_2365_)
				i_2365_ = i_2374_;
			if (i_2374_ > i_2368_)
				i_2368_ = i_2374_;
			int i_2375_ = i_2372_ * i_2372_ + i_2374_ * i_2374_;
			if (i_2375_ > i_2369_)
				i_2369_ = i_2375_;
			i_2375_ = i_2372_ * i_2372_ + i_2374_ * i_2374_ + i_2373_ * i_2373_;
			if (i_2375_ > i_2370_)
				i_2370_ = i_2375_;
		}
		anInt9342 = i;
		anInt9343 = i_2366_;
		anInt9340 = i_2364_;
		anInt9318 = i_2367_;
		anInt9344 = i_2365_;
		anInt9345 = i_2368_;
		anInt9331 = (int) (Math.sqrt((double) i_2369_) + 0.99);
		anInt9337 = (int) (Math.sqrt((double) i_2370_) + 0.99);
		aBool9304 = true;
	}

	int method14806(int i, int i_2376_) {
		i_2376_ = i_2376_ * (i & 0x7f) >> 7;
		if (i_2376_ < 2)
			i_2376_ = 2;
		else if (i_2376_ > 126)
			i_2376_ = 126;
		return (i & 0xff80) + i_2376_;
	}

	int method14807(int i, int i_2377_) {
		i_2377_ = i_2377_ * (i & 0x7f) >> 7;
		if (i_2377_ < 2)
			i_2377_ = 2;
		else if (i_2377_ > 126)
			i_2377_ = 126;
		return (i & 0xff80) + i_2377_;
	}

	int method14808(int i, int i_2378_) {
		i_2378_ = i_2378_ * (i & 0x7f) >> 7;
		if (i_2378_ < 2)
			i_2378_ = 2;
		else if (i_2378_ > 126)
			i_2378_ = 126;
		return (i & 0xff80) + i_2378_;
	}

	int method14809(int i, short i_2379_, int i_2380_) {
		int i_2381_ = aClass180_Sub2_9296.anIntArray9576[method14760(i, i_2380_)];
		if (i_2379_ != -1) {
			Class163 class163 = aClass180_Sub2_9296.aClass181_2059.method3544(i_2379_ & 0xffff, (byte) -47);
			int i_2382_ = class163.aByte1808 & 0xff;
			if (i_2382_ != 0) {
				int i_2383_ = 131586 * i_2380_;
				if (i_2380_ < 0)
					i_2383_ = 0;
				else if (i_2380_ > 127)
					i_2383_ = 16777215;
				else
					i_2383_ = 131586 * i_2380_;
				if (i_2382_ == 256)
					i_2381_ = i_2383_;
				else {
					int i_2384_ = i_2382_;
					int i_2385_ = 256 - i_2382_;
					i_2381_ = ((((i_2383_ & 0xff00ff) * i_2384_ + (i_2381_ & 0xff00ff) * i_2385_) & ~0xff00ff) + (((i_2383_ & 0xff00) * i_2384_ + (i_2381_ & 0xff00) * i_2385_) & 0xff0000)) >> 8;
				}
			}
			int i_2386_ = class163.aByte1802 & 0xff;
			if (i_2386_ != 0) {
				i_2386_ += 256;
				int i_2387_ = ((i_2381_ & 0xff0000) >> 16) * i_2386_;
				if (i_2387_ > 65535)
					i_2387_ = 65535;
				int i_2388_ = ((i_2381_ & 0xff00) >> 8) * i_2386_;
				if (i_2388_ > 65535)
					i_2388_ = 65535;
				int i_2389_ = (i_2381_ & 0xff) * i_2386_;
				if (i_2389_ > 65535)
					i_2389_ = 65535;
				i_2381_ = (i_2387_ << 8 & 0xff0000) + (i_2388_ & 0xff00) + (i_2389_ >> 8);
			}
		}
		return i_2381_ & 0xffffff;
	}

	Class176 method14810(Class176_Sub3 class176_sub3_2390_, Class176_Sub3 class176_sub3_2391_, int i, boolean bool, boolean bool_2392_) {
		class176_sub3_2390_.anInt9297 = i;
		class176_sub3_2390_.anInt9298 = anInt9298;
		class176_sub3_2390_.aShort9339 = aShort9339;
		class176_sub3_2390_.aShort9300 = aShort9300;
		class176_sub3_2390_.anInt9301 = anInt9301;
		class176_sub3_2390_.anInt9302 = anInt9302;
		class176_sub3_2390_.anInt9308 = anInt9308;
		class176_sub3_2390_.anInt9369 = anInt9369;
		class176_sub3_2390_.anInt9319 = anInt9319;
		class176_sub3_2390_.anInt9355 = anInt9355;
		if ((i & 0x100) != 0)
			class176_sub3_2390_.aBool9335 = true;
		else
			class176_sub3_2390_.aBool9335 = aBool9335;
		class176_sub3_2390_.aBool9336 = aBool9336;
		boolean bool_2393_ = Class337.method5904(i, anInt9298);
		boolean bool_2394_ = Class337.method5905(i, anInt9298);
		boolean bool_2395_ = Class337.method5906(i, anInt9298);
		boolean bool_2396_ = bool_2393_ | bool_2394_ | bool_2395_;
		if (bool_2396_) {
			if (bool_2393_) {
				if (class176_sub3_2391_.anIntArray9352 == null || class176_sub3_2391_.anIntArray9352.length < anInt9301)
					class176_sub3_2390_.anIntArray9352 = class176_sub3_2391_.anIntArray9352 = new int[anInt9301];
				else
					class176_sub3_2390_.anIntArray9352 = class176_sub3_2391_.anIntArray9352;
			} else
				class176_sub3_2390_.anIntArray9352 = anIntArray9352;
			if (bool_2394_) {
				if (class176_sub3_2391_.anIntArray9360 == null || class176_sub3_2391_.anIntArray9360.length < anInt9301)
					class176_sub3_2390_.anIntArray9360 = class176_sub3_2391_.anIntArray9360 = new int[anInt9301];
				else
					class176_sub3_2390_.anIntArray9360 = class176_sub3_2391_.anIntArray9360;
			} else
				class176_sub3_2390_.anIntArray9360 = anIntArray9360;
			if (bool_2395_) {
				if (class176_sub3_2391_.anIntArray9362 == null || class176_sub3_2391_.anIntArray9362.length < anInt9301)
					class176_sub3_2390_.anIntArray9362 = class176_sub3_2391_.anIntArray9362 = new int[anInt9301];
				else
					class176_sub3_2390_.anIntArray9362 = class176_sub3_2391_.anIntArray9362;
			} else
				class176_sub3_2390_.anIntArray9362 = anIntArray9362;
			for (int i_2397_ = 0; i_2397_ < anInt9301; i_2397_++) {
				if (bool_2393_)
					class176_sub3_2390_.anIntArray9352[i_2397_] = anIntArray9352[i_2397_];
				if (bool_2394_)
					class176_sub3_2390_.anIntArray9360[i_2397_] = anIntArray9360[i_2397_];
				if (bool_2395_)
					class176_sub3_2390_.anIntArray9362[i_2397_] = anIntArray9362[i_2397_];
			}
		} else {
			class176_sub3_2390_.anIntArray9352 = anIntArray9352;
			class176_sub3_2390_.anIntArray9360 = anIntArray9360;
			class176_sub3_2390_.anIntArray9362 = anIntArray9362;
		}
		if (Class337.method5960(i, anInt9298)) {
			class176_sub3_2390_.aClass363_9299 = class176_sub3_2391_.aClass363_9299;
			class176_sub3_2390_.aClass363_9299.anInterface37_3856 = aClass363_9299.anInterface37_3856;
			class176_sub3_2390_.aClass363_9299.aBool3855 = aClass363_9299.aBool3855;
			class176_sub3_2390_.aClass363_9299.aBool3854 = true;
		} else if (Class337.method5916(i, anInt9298))
			class176_sub3_2390_.aClass363_9299 = aClass363_9299;
		else
			class176_sub3_2390_.aClass363_9299 = null;
		if (Class337.method5909(i, anInt9298)) {
			if (class176_sub3_2391_.aShortArray9326 == null || class176_sub3_2391_.aShortArray9326.length < anInt9369)
				class176_sub3_2390_.aShortArray9326 = class176_sub3_2391_.aShortArray9326 = new short[anInt9369];
			else
				class176_sub3_2390_.aShortArray9326 = class176_sub3_2391_.aShortArray9326;
			for (int i_2398_ = 0; i_2398_ < anInt9369; i_2398_++)
				class176_sub3_2390_.aShortArray9326[i_2398_] = aShortArray9326[i_2398_];
		} else
			class176_sub3_2390_.aShortArray9326 = aShortArray9326;
		if (Class337.method5977(i, anInt9298)) {
			if (class176_sub3_2391_.aByteArray9321 == null || class176_sub3_2391_.aByteArray9321.length < anInt9369)
				class176_sub3_2390_.aByteArray9321 = class176_sub3_2391_.aByteArray9321 = new byte[anInt9369];
			else
				class176_sub3_2390_.aByteArray9321 = class176_sub3_2391_.aByteArray9321;
			for (int i_2399_ = 0; i_2399_ < anInt9369; i_2399_++)
				class176_sub3_2390_.aByteArray9321[i_2399_] = aByteArray9321[i_2399_];
		} else
			class176_sub3_2390_.aByteArray9321 = aByteArray9321;
		if (Class337.method5923(i, anInt9298)) {
			class176_sub3_2390_.aClass363_9334 = class176_sub3_2391_.aClass363_9334;
			class176_sub3_2390_.aClass363_9334.anInterface37_3856 = aClass363_9334.anInterface37_3856;
			class176_sub3_2390_.aClass363_9334.aBool3855 = aClass363_9334.aBool3855;
			class176_sub3_2390_.aClass363_9334.aBool3854 = true;
		} else if (Class337.method5915(i, anInt9298))
			class176_sub3_2390_.aClass363_9334 = aClass363_9334;
		else
			class176_sub3_2390_.aClass363_9334 = null;
		if (Class337.method5908(i, anInt9298)) {
			if (class176_sub3_2391_.aShortArray9311 == null || class176_sub3_2391_.aShortArray9311.length < anInt9308) {
				int i_2400_ = anInt9308;
				class176_sub3_2390_.aShortArray9311 = class176_sub3_2391_.aShortArray9311 = new short[i_2400_];
				class176_sub3_2390_.aShortArray9305 = class176_sub3_2391_.aShortArray9305 = new short[i_2400_];
				class176_sub3_2390_.aShortArray9313 = class176_sub3_2391_.aShortArray9313 = new short[i_2400_];
			} else {
				class176_sub3_2390_.aShortArray9311 = class176_sub3_2391_.aShortArray9311;
				class176_sub3_2390_.aShortArray9305 = class176_sub3_2391_.aShortArray9305;
				class176_sub3_2390_.aShortArray9313 = class176_sub3_2391_.aShortArray9313;
			}
			if (aClass379_9317 != null) {
				if (class176_sub3_2391_.aClass379_9317 == null)
					class176_sub3_2391_.aClass379_9317 = new Class379();
				Class379 class379 = (class176_sub3_2390_.aClass379_9317 = class176_sub3_2391_.aClass379_9317);
				if (class379.aShortArray3928 == null || class379.aShortArray3928.length < anInt9308) {
					int i_2401_ = anInt9308;
					class379.aShortArray3928 = new short[i_2401_];
					class379.aShortArray3929 = new short[i_2401_];
					class379.aShortArray3930 = new short[i_2401_];
					class379.aByteArray3931 = new byte[i_2401_];
				}
				for (int i_2402_ = 0; i_2402_ < anInt9308; i_2402_++) {
					class176_sub3_2390_.aShortArray9311[i_2402_] = aShortArray9311[i_2402_];
					class176_sub3_2390_.aShortArray9305[i_2402_] = aShortArray9305[i_2402_];
					class176_sub3_2390_.aShortArray9313[i_2402_] = aShortArray9313[i_2402_];
					class379.aShortArray3928[i_2402_] = aClass379_9317.aShortArray3928[i_2402_];
					class379.aShortArray3929[i_2402_] = aClass379_9317.aShortArray3929[i_2402_];
					class379.aShortArray3930[i_2402_] = aClass379_9317.aShortArray3930[i_2402_];
					class379.aByteArray3931[i_2402_] = aClass379_9317.aByteArray3931[i_2402_];
				}
			} else {
				class176_sub3_2390_.aClass379_9317 = null;
				for (int i_2403_ = 0; i_2403_ < anInt9308; i_2403_++) {
					class176_sub3_2390_.aShortArray9311[i_2403_] = aShortArray9311[i_2403_];
					class176_sub3_2390_.aShortArray9305[i_2403_] = aShortArray9305[i_2403_];
					class176_sub3_2390_.aShortArray9313[i_2403_] = aShortArray9313[i_2403_];
				}
			}
			class176_sub3_2390_.aByteArray9314 = aByteArray9314;
		} else {
			class176_sub3_2390_.aClass379_9317 = aClass379_9317;
			class176_sub3_2390_.aShortArray9311 = aShortArray9311;
			class176_sub3_2390_.aShortArray9305 = aShortArray9305;
			class176_sub3_2390_.aShortArray9313 = aShortArray9313;
			class176_sub3_2390_.aByteArray9314 = aByteArray9314;
		}
		if (Class337.method5975(i, anInt9298)) {
			class176_sub3_2390_.aClass363_9368 = class176_sub3_2391_.aClass363_9368;
			class176_sub3_2390_.aClass363_9368.anInterface37_3856 = aClass363_9368.anInterface37_3856;
			class176_sub3_2390_.aClass363_9368.aBool3855 = aClass363_9368.aBool3855;
			class176_sub3_2390_.aClass363_9368.aBool3854 = true;
		} else if (Class337.method5917(i, anInt9298))
			class176_sub3_2390_.aClass363_9368 = aClass363_9368;
		else
			class176_sub3_2390_.aClass363_9368 = null;
		if (Class337.method5911(i, anInt9298)) {
			if (class176_sub3_2391_.aFloatArray9315 == null || class176_sub3_2391_.aFloatArray9315.length < anInt9369) {
				int i_2404_ = anInt9308;
				class176_sub3_2390_.aFloatArray9315 = class176_sub3_2391_.aFloatArray9315 = new float[i_2404_];
				class176_sub3_2390_.aFloatArray9316 = class176_sub3_2391_.aFloatArray9316 = new float[i_2404_];
			} else {
				class176_sub3_2390_.aFloatArray9315 = class176_sub3_2391_.aFloatArray9315;
				class176_sub3_2390_.aFloatArray9316 = class176_sub3_2391_.aFloatArray9316;
			}
			for (int i_2405_ = 0; i_2405_ < anInt9308; i_2405_++) {
				class176_sub3_2390_.aFloatArray9315[i_2405_] = aFloatArray9315[i_2405_];
				class176_sub3_2390_.aFloatArray9316[i_2405_] = aFloatArray9316[i_2405_];
			}
		} else {
			class176_sub3_2390_.aFloatArray9315 = aFloatArray9315;
			class176_sub3_2390_.aFloatArray9316 = aFloatArray9316;
		}
		if (Class337.method5924(i, anInt9298)) {
			class176_sub3_2390_.aClass363_9332 = class176_sub3_2391_.aClass363_9332;
			class176_sub3_2390_.aClass363_9332.anInterface37_3856 = aClass363_9332.anInterface37_3856;
			class176_sub3_2390_.aClass363_9332.aBool3855 = aClass363_9332.aBool3855;
			class176_sub3_2390_.aClass363_9332.aBool3854 = true;
		} else if (Class337.method5919(i, anInt9298))
			class176_sub3_2390_.aClass363_9332 = aClass363_9332;
		else
			class176_sub3_2390_.aClass363_9332 = null;
		if (Class337.method5913(i, anInt9298)) {
			if (class176_sub3_2391_.aShortArray9322 == null || class176_sub3_2391_.aShortArray9322.length < anInt9369) {
				int i_2406_ = anInt9369;
				class176_sub3_2390_.aShortArray9322 = class176_sub3_2391_.aShortArray9322 = new short[i_2406_];
				class176_sub3_2390_.aShortArray9323 = class176_sub3_2391_.aShortArray9323 = new short[i_2406_];
				class176_sub3_2390_.aShortArray9324 = class176_sub3_2391_.aShortArray9324 = new short[i_2406_];
			} else {
				class176_sub3_2390_.aShortArray9322 = class176_sub3_2391_.aShortArray9322;
				class176_sub3_2390_.aShortArray9323 = class176_sub3_2391_.aShortArray9323;
				class176_sub3_2390_.aShortArray9324 = class176_sub3_2391_.aShortArray9324;
			}
			for (int i_2407_ = 0; i_2407_ < anInt9369; i_2407_++) {
				class176_sub3_2390_.aShortArray9322[i_2407_] = aShortArray9322[i_2407_];
				class176_sub3_2390_.aShortArray9323[i_2407_] = aShortArray9323[i_2407_];
				class176_sub3_2390_.aShortArray9324[i_2407_] = aShortArray9324[i_2407_];
			}
		} else {
			class176_sub3_2390_.aShortArray9322 = aShortArray9322;
			class176_sub3_2390_.aShortArray9323 = aShortArray9323;
			class176_sub3_2390_.aShortArray9324 = aShortArray9324;
		}
		if (Class337.method5925(i, anInt9298)) {
			class176_sub3_2390_.aClass344_9361 = class176_sub3_2391_.aClass344_9361;
			class176_sub3_2390_.aClass344_9361.anInterface44_3693 = aClass344_9361.anInterface44_3693;
			class176_sub3_2390_.aClass344_9361.aBool3695 = aClass344_9361.aBool3695;
			class176_sub3_2390_.aClass344_9361.aBool3694 = true;
		} else if (Class337.method5920(i, anInt9298))
			class176_sub3_2390_.aClass344_9361 = aClass344_9361;
		else
			class176_sub3_2390_.aClass344_9361 = null;
		if (Class337.method5956(i, anInt9298)) {
			if (class176_sub3_2391_.aShortArray9325 == null || class176_sub3_2391_.aShortArray9325.length < anInt9369) {
				int i_2408_ = anInt9369;
				class176_sub3_2390_.aShortArray9325 = class176_sub3_2391_.aShortArray9325 = new short[i_2408_];
			} else
				class176_sub3_2390_.aShortArray9325 = class176_sub3_2391_.aShortArray9325;
			for (int i_2409_ = 0; i_2409_ < anInt9369; i_2409_++)
				class176_sub3_2390_.aShortArray9325[i_2409_] = aShortArray9325[i_2409_];
		} else
			class176_sub3_2390_.aShortArray9325 = aShortArray9325;
		if (Class337.method5918(i, anInt9298)) {
			if (class176_sub3_2391_.aClass354Array9347 == null || class176_sub3_2391_.aClass354Array9347.length < anInt9355) {
				int i_2410_ = anInt9355;
				class176_sub3_2390_.aClass354Array9347 = class176_sub3_2391_.aClass354Array9347 = new Class354[i_2410_];
				for (int i_2411_ = 0; i_2411_ < anInt9355; i_2411_++)
					class176_sub3_2390_.aClass354Array9347[i_2411_] = aClass354Array9347[i_2411_].method6256();
			} else {
				class176_sub3_2390_.aClass354Array9347 = class176_sub3_2391_.aClass354Array9347;
				for (int i_2412_ = 0; i_2412_ < anInt9355; i_2412_++)
					class176_sub3_2390_.aClass354Array9347[i_2412_].method6258(aClass354Array9347[i_2412_]);
			}
		} else
			class176_sub3_2390_.aClass354Array9347 = aClass354Array9347;
		class176_sub3_2390_.aClass361Array9356 = aClass361Array9356;
		if (aBool9304) {
			class176_sub3_2390_.anInt9337 = anInt9337;
			class176_sub3_2390_.anInt9331 = anInt9331;
			class176_sub3_2390_.anInt9342 = anInt9342;
			class176_sub3_2390_.anInt9343 = anInt9343;
			class176_sub3_2390_.anInt9340 = anInt9340;
			class176_sub3_2390_.anInt9318 = anInt9318;
			class176_sub3_2390_.anInt9344 = anInt9344;
			class176_sub3_2390_.anInt9345 = anInt9345;
			class176_sub3_2390_.aBool9304 = true;
		} else
			class176_sub3_2390_.aBool9304 = false;
		if (aBool9346) {
			class176_sub3_2390_.anInt9309 = anInt9309;
			class176_sub3_2390_.aBool9346 = true;
		} else
			class176_sub3_2390_.aBool9346 = false;
		class176_sub3_2390_.anIntArrayArray9306 = anIntArrayArray9306;
		class176_sub3_2390_.anIntArrayArray9310 = anIntArrayArray9310;
		class176_sub3_2390_.anIntArrayArray9329 = anIntArrayArray9329;
		class176_sub3_2390_.aShortArray9366 = aShortArray9366;
		class176_sub3_2390_.anIntArray9351 = anIntArray9351;
		class176_sub3_2390_.aShortArray9333 = aShortArray9333;
		class176_sub3_2390_.aShortArray9358 = aShortArray9358;
		class176_sub3_2390_.aShortArray9307 = aShortArray9307;
		class176_sub3_2390_.aShortArray9327 = aShortArray9327;
		class176_sub3_2390_.anIntArray9348 = anIntArray9348;
		class176_sub3_2390_.anIntArray9350 = anIntArray9350;
		class176_sub3_2390_.anIntArray9349 = anIntArray9349;
		class176_sub3_2390_.aClass167Array9303 = aClass167Array9303;
		class176_sub3_2390_.aClass159Array9354 = aClass159Array9354;
		return class176_sub3_2390_;
	}
}
