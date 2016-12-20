/* Class301 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class301 {
	boolean aBool3412;
	public static Class301 aClass301_3413 = new Class301(0, false);
	static Class301 aClass301_3414;
	static Class301 aClass301_3415;
	static Class301 aClass301_3416;
	public int anInt3417;
	public static Class301 aClass301_3418 = new Class301(1, false);

	static {
		aClass301_3414 = new Class301(2, true);
		aClass301_3415 = new Class301(3, true);
		aClass301_3416 = new Class301(4, true);
	}

	public boolean method5569(byte i) {
		return aBool3412;
	}

	Class301(int i, boolean bool) {
		anInt3417 = 944351121 * i;
		aBool3412 = bool;
	}

	public static Class301 method5570(int i) {
		if (aClass301_3413.anInt3417 * -2064516751 == i)
			return aClass301_3413;
		if (-2064516751 * aClass301_3418.anInt3417 == i)
			return aClass301_3418;
		if (i == -2064516751 * aClass301_3414.anInt3417)
			return aClass301_3414;
		if (i == aClass301_3415.anInt3417 * -2064516751)
			return aClass301_3415;
		if (-2064516751 * aClass301_3416.anInt3417 == i)
			return aClass301_3416;
		return null;
	}

	public boolean method5571() {
		return aBool3412;
	}

	static final void method5572(Class665 class665, byte i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class204.aClass527_Sub31_2213.aClass700_Sub21_10638.method17114(-1015217315) == 1 ? 1 : 0;
	}

	static void method5573(Class180 class180, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
		Class555 class555 = client.aClass509_11072.method8314(-517340367);
		Interface62 interface62 = (Interface62) class555.method9377(i, i_0_, i_1_, -910262463);
		if (interface62 != null) {
			Class602 class602 = ((Class602) (client.aClass509_11072.method8310(1386394685).method81(interface62.method64(-1681178302), -534628328)));
			int i_7_ = interface62.method396(-487741626) & 0x3;
			int i_8_ = interface62.method77(-1355136294);
			if (class602.anInt7909 * 624402131 != -1)
				Class700_Sub3.method16869(class180, class602, i_7_, i_2_, i_3_, (byte) 59);
			else {
				int i_9_ = i_4_;
				if (-1508648055 * class602.anInt7898 > 0)
					i_9_ = i_5_;
				if (Class596.aClass596_7835.anInt7844 * -1736797763 == i_8_ || (i_8_ == Class596.aClass596_7822.anInt7844 * -1736797763)) {
					if (i_7_ == 0)
						class180.method3141(i_2_, i_3_, 4, i_9_, 1852596480);
					else if (i_7_ == 1)
						class180.method3527(i_2_, i_3_, 4, i_9_, 1145940484);
					else if (i_7_ == 2)
						class180.method3141(i_2_ + 3, i_3_, 4, i_9_, 1852596480);
					else if (3 == i_7_)
						class180.method3527(i_2_, 3 + i_3_, 4, i_9_, 1145940484);
				}
				if (Class596.aClass596_7838.anInt7844 * -1736797763 == i_8_) {
					if (0 == i_7_)
						class180.method3174(i_2_, i_3_, 1, 1, i_9_, 330634762);
					else if (1 == i_7_)
						class180.method3174(i_2_ + 3, i_3_, 1, 1, i_9_, -16799779);
					else if (i_7_ == 2)
						class180.method3174(i_2_ + 3, 3 + i_3_, 1, 1, i_9_, 2078111002);
					else if (3 == i_7_)
						class180.method3174(i_2_, 3 + i_3_, 1, 1, i_9_, 219129932);
				}
				if (i_8_ == -1736797763 * Class596.aClass596_7822.anInt7844) {
					if (i_7_ == 0)
						class180.method3527(i_2_, i_3_, 4, i_9_, 1145940484);
					else if (i_7_ == 1)
						class180.method3141(3 + i_2_, i_3_, 4, i_9_, 1852596480);
					else if (i_7_ == 2)
						class180.method3527(i_2_, i_3_ + 3, 4, i_9_, 1145940484);
					else if (3 == i_7_)
						class180.method3141(i_2_, i_3_, 4, i_9_, 1852596480);
				}
			}
		}
		interface62 = (Interface62) class555.method9254(i, i_0_, i_1_, client.anInterface63_11303, -1899684066);
		if (null != interface62) {
			Class602 class602 = ((Class602) (client.aClass509_11072.method8310(1904495750).method81(interface62.method64(-1927349791), -1489262812)));
			int i_10_ = interface62.method396(1042318718) & 0x3;
			int i_11_ = interface62.method77(-1761610036);
			if (624402131 * class602.anInt7909 != -1)
				Class700_Sub3.method16869(class180, class602, i_10_, i_2_, i_3_, (byte) 68);
			else if (i_11_ == Class596.aClass596_7824.anInt7844 * -1736797763) {
				int i_12_ = -1118482;
				if (class602.anInt7898 * -1508648055 > 0)
					i_12_ = -1179648;
				if (i_10_ == 0 || 2 == i_10_)
					class180.method3142(i_2_, 3 + i_3_, i_2_ + 3, i_3_, i_12_, (byte) 1);
				else
					class180.method3142(i_2_, i_3_, i_2_ + 3, 3 + i_3_, i_12_, (byte) 1);
			}
		}
		interface62 = (Interface62) class555.method9256(i, i_0_, i_1_, 17940588);
		if (null != interface62) {
			Class602 class602 = ((Class602) (client.aClass509_11072.method8310(547752098).method81(interface62.method64(-1874024892), 146311674)));
			int i_13_ = interface62.method396(811650753) & 0x3;
			if (-1 != 624402131 * class602.anInt7909)
				Class700_Sub3.method16869(class180, class602, i_13_, i_2_, i_3_, (byte) 4);
		}
	}
}
