/* Class578 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class578 implements Interface76, Interface68 {
	public static Class578 aClass578_7643 = new Class578(0, "", new Class462[] { Class462.aClass462_5255, Class462.aClass462_5131 });
	int anInt7644;
	public static Class578 aClass578_7645 = new Class578(1, "", new Class462[] { Class462.aClass462_5255, Class462.aClass462_5255 });
	static Class578 aClass578_7646;
	public static Class578 aClass578_7647 = new Class578(2, "", new Class462[] { Class462.aClass462_5131, Class462.aClass462_5131 });
	Class462[] aClass462Array7648;
	static Class704[] aClass704Array7649;

	Class578(int i, String string, Class462[] class462s) {
		anInt7644 = -519397331 * i;
		aClass462Array7648 = class462s;
		Class462[] class462s_0_ = aClass462Array7648;
		for (int i_1_ = 0; i_1_ < class462s_0_.length; i_1_++) {
			Class462 class462 = class462s_0_[i_1_];
			switch (533573711 * class462.aClass475_5283.anInt5377) {
			case 3:
				break;
			case 2:
				break;
			default:
				break;
			case 1:
				/* empty */
			}
		}
	}

	public int method87() {
		return anInt7644 * -1270304859;
	}

	static {
		aClass578_7646 = new Class578(3, "", new Class462[] { Class462.aClass462_5255, Class462.aClass462_5255, Class462.aClass462_5131 });
	}

	public int method42() {
		return anInt7644 * -1270304859;
	}

	public int method91() {
		return anInt7644 * -1270304859;
	}

	public static void method9646(int i) {
		Class35.aClass147_366 = null;
		Class640_Sub1_Sub1_Sub1.aClass147_11978 = null;
		Class39.aClass147_433 = null;
		Class327_Sub2.aClass147_10052 = null;
		Class218.aClass147_2285 = null;
		Class700_Sub27.aClass147_10907 = null;
		Class190.aClass147_2130 = null;
		Class700_Sub16.aClass147_10856 = null;
		Class504.aClass174_6906 = null;
		Class153.aClass22_1715 = null;
	}

	static final void method9647(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class296.method5503(class243, class240, class665, Class237.aClass237_2381, (byte) 1);
	}

	static final void method9648(Class665 class665, int i) {
		int i_2_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		if (null != Class679.aClass104Array8629 && i_2_ < -2075991457 * Class695_Sub3.anInt10976 && (Class679.aClass104Array8629[i_2_].aString1290.equalsIgnoreCase(Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aString12179)))
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 1;
		else
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 0;
	}

	static final void method9649(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = 1495139311 * Class338.anInt3655;
	}

	static final void method9650(int i) {
		int i_3_ = Class321.anInt3552 * 2027875840 + 256;
		int i_4_ = 580681216 * Class452.anInt4963 + 256;
		int i_5_ = (Class590.method9853(i_3_, i_4_, 162317215 * Class673.anInt8585, (byte) 5) - Class568.anInt7614 * -727765249);
		if (Class208_Sub11.anInt9926 * 413342447 >= 100) {
			Class320.anInt3543 = 2125778176 + -1378052608 * Class321.anInt3552;
			Class201.anInt2211 = 477456640 + Class452.anInt4963 * 2143661568;
			Class142.anInt1657 = (Class590.method9853(Class320.anInt3543 * -1998563323, Class201.anInt2211 * -1261737255, Class673.anInt8585 * 162317215, (byte) 5) - -727765249 * Class568.anInt7614) * -1960018167;
		} else {
			if (Class320.anInt3543 * -1998563323 < i_3_) {
				Class320.anInt3543 += (1149154509 * ((Class208_Sub11.anInt9926 * 413342447 * (i_3_ - -1998563323 * Class320.anInt3543) / 1000) + Class498.anInt5586 * 1657865751));
				if (Class320.anInt3543 * -1998563323 > i_3_)
					Class320.anInt3543 = i_3_ * 1149154509;
			}
			if (-1998563323 * Class320.anInt3543 > i_3_) {
				Class320.anInt3543 -= (1149154509 * ((413342447 * Class208_Sub11.anInt9926 * (-1998563323 * Class320.anInt3543 - i_3_) / 1000) + 1657865751 * Class498.anInt5586));
				if (Class320.anInt3543 * -1998563323 < i_3_)
					Class320.anInt3543 = 1149154509 * i_3_;
			}
			if (Class142.anInt1657 * 298893113 < i_5_) {
				Class142.anInt1657 += -1960018167 * (Class498.anInt5586 * 1657865751 + (413342447 * Class208_Sub11.anInt9926 * (i_5_ - 298893113 * Class142.anInt1657) / 1000));
				if (Class142.anInt1657 * 298893113 > i_5_)
					Class142.anInt1657 = -1960018167 * i_5_;
			}
			if (Class142.anInt1657 * 298893113 > i_5_) {
				Class142.anInt1657 -= (-1960018167 * ((413342447 * Class208_Sub11.anInt9926 * (Class142.anInt1657 * 298893113 - i_5_) / 1000) + 1657865751 * Class498.anInt5586));
				if (298893113 * Class142.anInt1657 < i_5_)
					Class142.anInt1657 = i_5_ * -1960018167;
			}
			if (Class201.anInt2211 * -1261737255 < i_4_) {
				Class201.anInt2211 += 421295465 * (Class498.anInt5586 * 1657865751 + ((i_4_ - Class201.anInt2211 * -1261737255) * (413342447 * Class208_Sub11.anInt9926) / 1000));
				if (Class201.anInt2211 * -1261737255 > i_4_)
					Class201.anInt2211 = 421295465 * i_4_;
			}
			if (-1261737255 * Class201.anInt2211 > i_4_) {
				Class201.anInt2211 -= ((1657865751 * Class498.anInt5586 + ((-1261737255 * Class201.anInt2211 - i_4_) * (413342447 * Class208_Sub11.anInt9926) / 1000)) * 421295465);
				if (Class201.anInt2211 * -1261737255 < i_4_)
					Class201.anInt2211 = 421295465 * i_4_;
			}
		}
		i_3_ = 789284352 * Class405.anInt4196 + 256;
		i_4_ = 256 + Class170.anInt1881 * -640907776;
		i_5_ = Class590.method9853(i_3_, i_4_, Class673.anInt8585 * 162317215, (byte) 5) - -1151746675 * Class447.anInt4930;
		int i_6_ = i_3_ - Class320.anInt3543 * -1998563323;
		int i_7_ = i_5_ - Class142.anInt1657 * 298893113;
		int i_8_ = i_4_ - Class201.anInt2211 * -1261737255;
		int i_9_ = (int) Math.sqrt((double) (i_8_ * i_8_ + i_6_ * i_6_));
		int i_10_ = ((int) (Math.atan2((double) i_7_, (double) i_9_) * 2607.5945876176133) & 0x3fff);
		int i_11_ = ((int) (Math.atan2((double) i_6_, (double) i_8_) * -2607.5945876176133) & 0x3fff);
		if (i_10_ < 1024)
			i_10_ = 1024;
		if (i_10_ > 3072)
			i_10_ = 3072;
		if (Class700_Sub34.anInt10928 * -1153148977 < i_10_) {
			Class700_Sub34.anInt10928 += ((((i_10_ - -1153148977 * Class700_Sub34.anInt10928 >> 3) * (Class78.anInt801 * -1338335921) / 1000) + 1322246397 * Class209.anInt2246) << 3) * -290107601;
			if (-1153148977 * Class700_Sub34.anInt10928 > i_10_)
				Class700_Sub34.anInt10928 = -290107601 * i_10_;
		}
		if (Class700_Sub34.anInt10928 * -1153148977 > i_10_) {
			Class700_Sub34.anInt10928 -= ((1322246397 * Class209.anInt2246 + ((Class700_Sub34.anInt10928 * -1153148977 - i_10_ >> 3) * (-1338335921 * Class78.anInt801) / 1000)) << 3) * -290107601;
			if (Class700_Sub34.anInt10928 * -1153148977 < i_10_)
				Class700_Sub34.anInt10928 = -290107601 * i_10_;
		}
		int i_12_ = i_11_ - Class12.anInt176 * -1728661517;
		if (i_12_ > 8192)
			i_12_ -= 16384;
		if (i_12_ < -8192)
			i_12_ += 16384;
		i_12_ >>= 3;
		if (i_12_ > 0) {
			Class12.anInt176 += ((Class78.anInt801 * -1338335921 * i_12_ / 1000 + Class209.anInt2246 * 1322246397) << 3) * 355973435;
			Class12.anInt176 = (-1728661517 * Class12.anInt176 & 0x3fff) * 355973435;
		}
		if (i_12_ < 0) {
			Class12.anInt176 -= ((Class209.anInt2246 * 1322246397 + -i_12_ * (Class78.anInt801 * -1338335921) / 1000) << 3) * 355973435;
			Class12.anInt176 = (-1728661517 * Class12.anInt176 & 0x3fff) * 355973435;
		}
		int i_13_ = i_11_ - Class12.anInt176 * -1728661517;
		if (i_13_ > 8192)
			i_13_ -= 16384;
		if (i_13_ < -8192)
			i_13_ += 16384;
		if (i_13_ < 0 && i_12_ > 0 || i_13_ > 0 && i_12_ < 0)
			Class12.anInt176 = i_11_ * 355973435;
		Class689.anInt8692 = 0;
	}

	static final void method9651(Class665 class665, byte i) {
		int i_14_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_14_, -1617703943);
		Class240 class240 = Class183.aClass240Array2100[i_14_ >> 16];
		Class430.method6870(class243, class240, class665, -2029646807);
	}
}
