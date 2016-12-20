/* Class196 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public final class Class196 {
	static final int anInt2162 = 25;
	int anInt2163;
	public int anInt2164;
	public boolean aBool2165 = false;
	Class640_Sub1_Sub2_Sub1_Sub1 aClass640_Sub1_Sub2_Sub1_Sub1_2166 = null;
	Class640_Sub1_Sub2_Sub1_Sub2 aClass640_Sub1_Sub2_Sub1_Sub2_2167 = null;
	int[] anIntArray2168;

	public Class640_Sub1_Sub2_Sub1 method3713() {
		if (aClass640_Sub1_Sub2_Sub1_Sub1_2166 != null)
			return aClass640_Sub1_Sub2_Sub1_Sub1_2166;
		return aClass640_Sub1_Sub2_Sub1_Sub2_2167;
	}

	void method3714(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		if (!aBool2165) {
			aBool2165 = true;
			if (645243647 * anInt2164 >= 0) {
				aClass640_Sub1_Sub2_Sub1_Sub1_2166 = (new Class640_Sub1_Sub2_Sub1_Sub1(client.aClass509_11072.method8314(153621380), 25));
				aClass640_Sub1_Sub2_Sub1_Sub1_2166.anInt11955 = 1661578801 * anInt2163;
				aClass640_Sub1_Sub2_Sub1_Sub1_2166.anInt11933 = client.anInt11019 * 2052153447;
				aClass640_Sub1_Sub2_Sub1_Sub1_2166.method18832(((Class295) Class381.aClass24_Sub9_3936.method81(645243647 * anInt2164, 1773481099)), 2145069098);
				aClass640_Sub1_Sub2_Sub1_Sub1_2166.method18585(897343531 * (aClass640_Sub1_Sub2_Sub1_Sub1_2166.aClass295_12168.anInt3342), 630953843);
				aClass640_Sub1_Sub2_Sub1_Sub1_2166.anInt11937 = 57049381 * ((aClass640_Sub1_Sub2_Sub1_Sub1_2166.aClass295_12168.anInt3311) * 1076155623 << 3);
				aClass640_Sub1_Sub2_Sub1_Sub1_2166.anInt11897 = (((Class209.anInt2239 += 1072441851) * -309036749 - 1) * 1998931433);
			} else {
				aClass640_Sub1_Sub2_Sub1_Sub2_2167 = (new Class640_Sub1_Sub2_Sub1_Sub2(client.aClass509_11072.method8314(155807833), 25));
				aClass640_Sub1_Sub2_Sub1_Sub2_2167.method18873(Class213.aClass527_Sub38_2261, 348521444);
				aClass640_Sub1_Sub2_Sub1_Sub2_2167.anInt11955 = anInt2163 * 1661578801;
				aClass640_Sub1_Sub2_Sub1_Sub2_2167.anInt11933 = 2052153447 * client.anInt11019;
				aClass640_Sub1_Sub2_Sub1_Sub2_2167.anInt11897 = (((Class209.anInt2239 += 1072441851) * -309036749 - 1) * 1998931433);
			}
		}
		if (anInt2164 * 645243647 >= 0) {
			aClass640_Sub1_Sub2_Sub1_Sub1_2166.method18837(i_1_, i, i_0_, true, aClass640_Sub1_Sub2_Sub1_Sub1_2166.method18564(-2075658679), (byte) 77);
			aClass640_Sub1_Sub2_Sub1_Sub1_2166.method18528(i_2_, true, -1394917949);
		} else {
			aClass640_Sub1_Sub2_Sub1_Sub2_2167.aByte10864 = aClass640_Sub1_Sub2_Sub1_Sub2_2167.aByte10862 = (byte) i_1_;
			aClass640_Sub1_Sub2_Sub1_Sub2_2167.method18886(i, i_0_, -876906332);
			aClass640_Sub1_Sub2_Sub1_Sub2_2167.method18528(i_2_, true, -1893938034);
		}
	}

	public Class640_Sub1_Sub2_Sub1 method3715() {
		if (aClass640_Sub1_Sub2_Sub1_Sub1_2166 != null)
			return aClass640_Sub1_Sub2_Sub1_Sub1_2166;
		return aClass640_Sub1_Sub2_Sub1_Sub2_2167;
	}

	void method3716(int i, int i_4_, int i_5_, int i_6_) {
		if (null != aClass640_Sub1_Sub2_Sub1_Sub1_2166)
			aClass640_Sub1_Sub2_Sub1_Sub1_2166.method18837(i, i_4_, i_5_, true, aClass640_Sub1_Sub2_Sub1_Sub1_2166.method18564(-1284606441), (byte) 104);
		else {
			aClass640_Sub1_Sub2_Sub1_Sub2_2167.aByte10864 = aClass640_Sub1_Sub2_Sub1_Sub2_2167.aByte10862 = (byte) i;
			aClass640_Sub1_Sub2_Sub1_Sub2_2167.method18886(i_4_, i_5_, -1345273005);
		}
	}

	public Class640_Sub1_Sub2_Sub1 method3717(int i) {
		if (aClass640_Sub1_Sub2_Sub1_Sub1_2166 != null)
			return aClass640_Sub1_Sub2_Sub1_Sub1_2166;
		return aClass640_Sub1_Sub2_Sub1_Sub2_2167;
	}

	boolean method3718() {
		if (645243647 * anInt2164 >= 0) {
			Class295 class295 = ((Class295) Class381.aClass24_Sub9_3936.method81(anInt2164 * 645243647, -303950594));
			boolean bool = class295.method5312((byte) -93);
			if (anIntArray2168 == null) {
				Class587 class587 = ((Class587) Class258.aClass24_Sub2_2827.method81((class295.anInt3284 * -767096327), -1919565814));
				anIntArray2168 = class587.method9790((byte) 0);
			}
			int[] is = anIntArray2168;
			for (int i = 0; i < is.length; i++) {
				int i_7_ = is[i];
				bool &= ((Class198) Class321.aClass24_Sub10_3551.method81(i_7_, 103615683)).method3732((byte) -3);
			}
			return bool;
		}
		return true;
	}

	void method3719() {
		aClass640_Sub1_Sub2_Sub1_Sub1_2166 = null;
		aClass640_Sub1_Sub2_Sub1_Sub2_2167 = null;
		aBool2165 = false;
	}

	void method3720(byte i) {
		aClass640_Sub1_Sub2_Sub1_Sub1_2166 = null;
		aClass640_Sub1_Sub2_Sub1_Sub2_2167 = null;
		aBool2165 = false;
	}

	public Class640_Sub1_Sub2_Sub1 method3721() {
		if (aClass640_Sub1_Sub2_Sub1_Sub1_2166 != null)
			return aClass640_Sub1_Sub2_Sub1_Sub1_2166;
		return aClass640_Sub1_Sub2_Sub1_Sub2_2167;
	}

	boolean method3722(int i) {
		if (645243647 * anInt2164 >= 0) {
			Class295 class295 = ((Class295) Class381.aClass24_Sub9_3936.method81(anInt2164 * 645243647, -844240956));
			boolean bool = class295.method5312((byte) -118);
			if (anIntArray2168 == null) {
				Class587 class587 = ((Class587) Class258.aClass24_Sub2_2827.method81((class295.anInt3284 * -767096327), 932603294));
				anIntArray2168 = class587.method9790((byte) 0);
			}
			int[] is = anIntArray2168;
			for (int i_8_ = 0; i_8_ < is.length; i_8_++) {
				int i_9_ = is[i_8_];
				bool &= ((Class198) Class321.aClass24_Sub10_3551.method81(i_9_, 851341416)).method3732((byte) -22);
			}
			return bool;
		}
		return true;
	}

	Class196(RSByteBuffer class527_sub38, int i) {
		anInt2163 = 1174166999 * i;
		int i_10_ = class527_sub38.readUnsignedByte();
		switch (i_10_) {
		case 1:
			anInt2164 = -2025938175;
			break;
		case 0:
			anInt2164 = class527_sub38.method16466(-1798978920) * 2025938175;
			break;
		default:
			anInt2164 = -2025938175;
		}
		class527_sub38.readString(1311546425);
	}

	void method3723() {
		aClass640_Sub1_Sub2_Sub1_Sub1_2166 = null;
		aClass640_Sub1_Sub2_Sub1_Sub2_2167 = null;
		aBool2165 = false;
	}

	boolean method3724() {
		if (645243647 * anInt2164 >= 0) {
			Class295 class295 = ((Class295) Class381.aClass24_Sub9_3936.method81(anInt2164 * 645243647, -704070979));
			boolean bool = class295.method5312((byte) -41);
			if (anIntArray2168 == null) {
				Class587 class587 = ((Class587) Class258.aClass24_Sub2_2827.method81((class295.anInt3284 * -767096327), -842342597));
				anIntArray2168 = class587.method9790((byte) 0);
			}
			int[] is = anIntArray2168;
			for (int i = 0; i < is.length; i++) {
				int i_11_ = is[i];
				bool &= ((Class198) Class321.aClass24_Sub10_3551.method81(i_11_, -1013143368)).method3732((byte) 7);
			}
			return bool;
		}
		return true;
	}

	boolean method3725() {
		if (645243647 * anInt2164 >= 0) {
			Class295 class295 = ((Class295) Class381.aClass24_Sub9_3936.method81(anInt2164 * 645243647, 249813860));
			boolean bool = class295.method5312((byte) -93);
			if (anIntArray2168 == null) {
				Class587 class587 = ((Class587) Class258.aClass24_Sub2_2827.method81((class295.anInt3284 * -767096327), -1187970661));
				anIntArray2168 = class587.method9790((byte) 0);
			}
			int[] is = anIntArray2168;
			for (int i = 0; i < is.length; i++) {
				int i_12_ = is[i];
				bool &= ((Class198) Class321.aClass24_Sub10_3551.method81(i_12_, 1387643708)).method3732((byte) 6);
			}
			return bool;
		}
		return true;
	}

	static final void method3726(Class665 class665, byte i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class249.method4659(class243, class240, false, 2, class665, (byte) 74);
	}

	static final void method3727(Class665 class665, int i) {
		int i_13_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub13_10607), i_13_, 951293535);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub13_10608), i_13_, 208388979);
		Class204.aClass527_Sub31_2213.aClass700_Sub13_10607.method16965((byte) 86);
		Class204.aClass527_Sub31_2213.aClass700_Sub13_10608.method16965((byte) 6);
		Class639_Sub1.method16871((byte) 41);
		Class631.method10465(1522824641);
		client.aBool11020 = false;
	}
}
