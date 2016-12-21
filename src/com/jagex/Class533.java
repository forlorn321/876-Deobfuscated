/* Class533 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class533 {
	int anInt7125;
	String aString7126;
	int anInt7127;
	int anInt7128;
	int anInt7129;

	public int method6447() {
		return 1892541021 * anInt7127;
	}

	public String method6448(int i) {
		return aString7126;
	}

	public int method6449(int i) {
		return anInt7125 * -2093777983;
	}

	Class533() {
		/* empty */
	}

	public int method6450(int i) {
		return anInt7128 * 213942017;
	}

	public int method6451() {
		return anInt7129 * 1133970979;
	}

	public String method6452() {
		return aString7126;
	}

	public int method6453() {
		return anInt7125 * -2093777983;
	}

	public int method6454() {
		return 1892541021 * anInt7127;
	}

	public int method6455(int i) {
		return anInt7129 * 1133970979;
	}

	public int method6456() {
		return 1892541021 * anInt7127;
	}

	public int method6457(int i) {
		return 1892541021 * anInt7127;
	}

	public int method6458() {
		return 1892541021 * anInt7127;
	}

	public int method6459() {
		return anInt7129 * 1133970979;
	}

	public int method6460() {
		return anInt7128 * 213942017;
	}

	public int method6461() {
		return 1892541021 * anInt7127;
	}

	public int method6462() {
		return 1892541021 * anInt7127;
	}

	static final void method6463(Class668 class668, byte i) {
		class668.anInt8542 -= 1472892954;
	}

	static byte method6464(int i, int i_0_, int i_1_) {
		if (-723459231 * Class606.aClass606_7873.anInt7878 != i)
			return (byte) 0;
		if (0 == (i_0_ & 0x1))
			return (byte) 1;
		return (byte) 2;
	}

	public static int method6465(int i, int i_2_, int i_3_, boolean bool, byte i_4_) {
		Class324 class324 = (Class324) Class56.aClass34_Sub14_608.method70(i_3_, (byte) -27);
		Class153 class153 = class324.aClass153_3555;
		Class536_Sub1 class536_sub1 = Class659.method7970(i, bool, -1951916577);
		int i_5_;
		if (class536_sub1 == null || i_2_ < 0 || i_2_ >= class536_sub1.anIntArray10300.length || class536_sub1.aClass21Array10305 == null || null == class536_sub1.aClass21Array10305[i_2_])
			i_5_ = ((Integer) class153.method1855((byte) -30)).intValue();
		else
			i_5_ = class536_sub1.aClass21Array10305[i_2_].method32(-1786401803 * class153.anInt1715, -1720025215);
		return class324.method4263(i_5_, (byte) 12);
	}

	static Class649_Sub1_Sub5_Sub1 method6466(int i, int i_6_, int i_7_, int i_8_) {
		Class556 class556 = (client.aClass515_11066.method6249(-464801824).aClass556ArrayArrayArray7430[i][i_6_][i_7_]);
		if (null == class556)
			return null;
		Class649_Sub1_Sub5_Sub1 class649_sub1_sub5_sub1 = null;
		int i_9_ = -1;
		for (Class552 class552 = class556.aClass552_7497; null != class552; class552 = class552.aClass552_7414) {
			Class649_Sub1_Sub5 class649_sub1_sub5 = class552.aClass649_Sub1_Sub5_7415;
			if (class649_sub1_sub5 instanceof Class649_Sub1_Sub5_Sub1) {
				Class649_Sub1_Sub5_Sub1 class649_sub1_sub5_sub1_10_ = (Class649_Sub1_Sub5_Sub1) class649_sub1_sub5;
				int i_11_ = ((class649_sub1_sub5_sub1_10_.method10874(1355242333) - 1) * 256 + 252);
				Class436 class436 = class649_sub1_sub5_sub1_10_.method7837().aClass436_4823;
				int i_12_ = (int) class436.aFloat4850 - i_11_ >> 9;
				int i_13_ = (int) class436.aFloat4853 - i_11_ >> 9;
				int i_14_ = (int) class436.aFloat4850 + i_11_ >> 9;
				int i_15_ = i_11_ + (int) class436.aFloat4853 >> 9;
				if (i_12_ <= i_6_ && i_13_ <= i_7_ && i_14_ >= i_6_ && i_15_ >= i_7_) {
					int i_16_ = (i_14_ + 1 - i_6_) * (1 + i_15_ - i_7_);
					if (i_16_ > i_9_) {
						class649_sub1_sub5_sub1 = class649_sub1_sub5_sub1_10_;
						i_9_ = i_16_;
					}
				}
			}
		}
		return class649_sub1_sub5_sub1;
	}

	static void method6467(Class251 class251, Class161 class161, int i, int i_17_, int i_18_, int i_19_, Class143 class143, byte i_20_) {
		Class656.method7946(class251, class161, i, i_17_, i_18_, i_19_, class143, 100.0, Class261.aClass261_2841, Class283.aClass283_3179, (byte) -1);
	}
}
