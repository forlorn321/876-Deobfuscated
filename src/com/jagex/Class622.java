/* Class622 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

final class Class622 implements Interface74 {
	public void method486(int i, int i_0_, int i_1_) {
		int i_2_ = i >> 16;
		int i_3_ = i & 0xffff;
		synchronized (Class642.aQueue8341) {
			Class642.aQueue8341.add(Class574.method9629(i_2_, i_3_, i_0_, i_1_, (short) -29251));
		}
	}

	public void method489(boolean bool, int i) {
		/* empty */
	}

	public void method485(int i, int i_4_, int i_5_, byte i_6_) {
		int i_7_ = i >> 16;
		int i_8_ = i & 0xffff;
		synchronized (Class642.aQueue8341) {
			Class642.aQueue8341.add(Class574.method9629(i_7_, i_8_, i_4_, i_5_, (short) -4154));
		}
	}

	public void method206(boolean bool) {
		/* empty */
	}

	public void method487(boolean bool) {
		/* empty */
	}

	public void method488(boolean bool) {
		/* empty */
	}

	public void method484(boolean bool) {
		/* empty */
	}

	static final void method10231(Class665 class665, int i) {
		class665.anInt8526 -= 307142523;
		int i_9_ = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		int i_10_ = class665.anIntArray8525[class665.anInt8526 * 1769813785 + 1];
		int i_11_ = class665.anIntArray8525[2 + 1769813785 * class665.anInt8526];
		Class648.method10837(i_9_, 1919997687);
		Class460.method7572(Class183.aClass240Array2100[i_9_ >>> 16], i_9_ & 0xffff, i_10_, i_11_, class665.aBool8549, class665, 1007746272);
	}

	static final void method10232(Class665 class665, int i) {
		class665.anInt8526 -= 204761682;
		if (class665.anIntArray8525[1769813785 * class665.anInt8526] > class665.anIntArray8525[1 + class665.anInt8526 * 1769813785])
			class665.anInt8527 += (class665.anIntArray8545[891367231 * class665.anInt8527] * -1038991169);
	}

	public static void method10233(int i, int i_12_, int i_13_, int i_14_, Class602 class602, Class640_Sub1_Sub2_Sub1_Sub1 class640_sub1_sub2_sub1_sub1, Class640_Sub1_Sub2_Sub1_Sub2 class640_sub1_sub2_sub1_sub2, int i_15_) {
		Class527_Sub28 class527_sub28 = new Class527_Sub28();
		class527_sub28.anInt10529 = 2056430489 * i;
		class527_sub28.anInt10530 = 1124016263 * (i_12_ << 9);
		class527_sub28.anInt10540 = (i_13_ << 9) * -846636707;
		if (class602 != null) {
			class527_sub28.aClass602_10539 = class602;
			int i_16_ = class602.anInt7874 * -49406469;
			int i_17_ = class602.anInt7891 * 1481957615;
			if (1 == i_14_ || i_14_ == 3) {
				i_16_ = 1481957615 * class602.anInt7891;
				i_17_ = class602.anInt7874 * -49406469;
			}
			class527_sub28.anInt10532 = -1591011705 * (i_12_ + i_16_ << 9);
			class527_sub28.anInt10533 = 1319623125 * (i_17_ + i_13_ << 9);
			class527_sub28.anInt10547 = class602.anInt7944 * -1825154101;
			class527_sub28.anInt10549 = 1137908471 * (class602.anInt7932 * 1055754593 << 9);
			class527_sub28.anInt10538 = 1367590993 * class602.anInt7934;
			class527_sub28.anInt10553 = class602.anInt7895 * -697521443;
			class527_sub28.anInt10554 = class602.anInt7936 * 484723147;
			class527_sub28.anIntArray10536 = class602.anIntArray7937;
			class527_sub28.anInt10550 = class602.anInt7946 * 690698687;
			class527_sub28.anInt10548 = 1877701961 * class602.anInt7945;
			class527_sub28.anInt10537 = (class602.anInt7933 * 63807431 << 9) * -1518900471;
			if (null != class602.anIntArray7929) {
				class527_sub28.aBool10552 = true;
				class527_sub28.method16271((byte) -92);
			}
			if (null != class527_sub28.anIntArray10536)
				class527_sub28.anInt10556 = ((class527_sub28.anInt10553 * -1237634111 + (int) (Math.random() * (double) ((223197129 * class527_sub28.anInt10554) - (-1237634111 * class527_sub28.anInt10553)))) * 430347401);
			Class527_Sub28.aClass694_10526.method14147(class527_sub28, -1162363262);
			Class245.aClass226_2698.method4223((-167494023 * class527_sub28.anInt10547), -808961326);
			Class245.aClass226_2698.method4246(class527_sub28.anIntArray10536, (byte) -62);
		} else if (null != class640_sub1_sub2_sub1_sub1) {
			class527_sub28.aClass640_Sub1_Sub2_Sub1_Sub1_10528 = class640_sub1_sub2_sub1_sub1;
			Class295 class295 = class640_sub1_sub2_sub1_sub1.aClass295_12168;
			if (null != class295.anIntArray3312) {
				class527_sub28.aBool10552 = true;
				class295 = class295.method5314(Class671.aClass97_8584, Class671.aClass97_8584, -1068599333);
			}
			if (class295 != null) {
				class527_sub28.anInt10532 = ((class295.anInt3342 * 897343531 + i_12_ << 9) * -1591011705);
				class527_sub28.anInt10533 = ((i_13_ + class295.anInt3342 * 897343531 << 9) * 1319623125);
				class527_sub28.anInt10547 = Class456.method7428(class640_sub1_sub2_sub1_sub1, 1321933551) * 1172949961;
				class527_sub28.anInt10549 = 1137908471 * (class295.anInt3273 * -35728309 << 9);
				class527_sub28.anInt10538 = -1299058901 * class295.anInt3333;
				class527_sub28.anInt10550 = class295.anInt3343 * -1743406611;
				class527_sub28.anInt10548 = -1488595911 * class295.anInt3287;
				class527_sub28.anInt10537 = -1518900471 * (-2031545287 * class295.anInt3332 << 9);
				Class245.aClass226_2698.method4223(class295.anInt3327 * -324553837, -488011710);
				Class245.aClass226_2698.method4223(1772688851 * class295.anInt3331, 293690051);
				Class245.aClass226_2698.method4223(class295.anInt3329 * -422751553, 1298098478);
				Class245.aClass226_2698.method4223(class295.anInt3330 * 2047475243, -1474169345);
			}
			Class527_Sub28.aClass694_10527.method14147(class527_sub28, -261760885);
		} else if (null != class640_sub1_sub2_sub1_sub2) {
			class527_sub28.aClass640_Sub1_Sub2_Sub1_Sub2_10541 = class640_sub1_sub2_sub1_sub2;
			class527_sub28.anInt10532 = (i_12_ + class640_sub1_sub2_sub1_sub2.method18564(-2038940184) << 9) * -1591011705;
			class527_sub28.anInt10533 = (i_13_ + class640_sub1_sub2_sub1_sub2.method18564(-1576481261) << 9) * 1319623125;
			class527_sub28.anInt10547 = Class389.method6466(class640_sub1_sub2_sub1_sub2, (byte) -76) * 1172949961;
			class527_sub28.anInt10549 = ((class640_sub1_sub2_sub1_sub2.anInt12197 * 17034299 << 9) * 1137908471);
			class527_sub28.anInt10538 = class640_sub1_sub2_sub1_sub2.anInt12198 * -1099163075;
			class527_sub28.anInt10550 = -7725312;
			class527_sub28.anInt10548 = 833674496;
			class527_sub28.anInt10537 = 0;
			Class527_Sub28.aClass14_10545.method714(class527_sub28, (long) (class640_sub1_sub2_sub1_sub2.anInt11955 * -541403241));
			Class245.aClass226_2698.method4223((class640_sub1_sub2_sub1_sub2.anInt12193) * -1970690963, 1568881845);
			Class245.aClass226_2698.method4223((class640_sub1_sub2_sub1_sub2.anInt12194) * -834256763, 587283274);
			Class245.aClass226_2698.method4223((class640_sub1_sub2_sub1_sub2.anInt12195) * -1614266203, 868081821);
			Class245.aClass226_2698.method4223((-1251313557 * (class640_sub1_sub2_sub1_sub2.anInt12187)), -835385165);
		}
	}

	public static Class303 method10234(int i, int i_18_) {
		if (-660298349 * Class303.aClass303_3426.anInt3425 == i)
			return Class303.aClass303_3426;
		if (i == -660298349 * Class303.aClass303_3423.anInt3425)
			return Class303.aClass303_3423;
		if (Class303.aClass303_3424.anInt3425 * -660298349 == i)
			return Class303.aClass303_3424;
		return null;
	}
}
