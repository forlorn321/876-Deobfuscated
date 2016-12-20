/* Class507 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class507 {
	static Interface59 anInterface59_6917;

	public static void method8247(Interface59 interface59) {
		if (anInterface59_6917 != null)
			throw new IllegalStateException("");
		anInterface59_6917 = interface59;
	}

	public static void method8248(Interface59 interface59) {
		if (anInterface59_6917 != null)
			throw new IllegalStateException("");
		anInterface59_6917 = interface59;
	}

	public static boolean method8249() {
		return null != anInterface59_6917;
	}

	public static Interface59 method8250() {
		if (anInterface59_6917 == null)
			throw new IllegalStateException("");
		return anInterface59_6917;
	}

	public static Interface59 method8251() {
		if (anInterface59_6917 == null)
			throw new IllegalStateException("");
		return anInterface59_6917;
	}

	Class507() throws Throwable {
		throw new Error();
	}

	public static boolean method8252() {
		return null != anInterface59_6917;
	}

	public static boolean method8253() {
		return null != anInterface59_6917;
	}

	static final void method8254(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = -1988380647 * class665.aClass527_Sub21_8537.anInt10486;
	}

	static final void method8255(Class665 class665, byte i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = 0;
	}

	static final void method8256(Class665 class665, byte i) {
		int i_0_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_0_, -144712309);
		Class240 class240 = Class183.aClass240Array2100[i_0_ >> 16];
		Class650.method10863(class243, class240, class665, 523042938);
	}

	static void method8257(Class180 class180, int i) {
		if (Class274.method5129(1361299731) && Class457.method7445((byte) -123))
			Class37.method1144(0, 0, -1803844265 * Class289.anInt3223, 350, 1240972602);
		class180.method3132(0, 0, Class289.anInt3223 * -1803844265, 350);
		class180.method3348(0, 0, -1803844265 * Class289.anInt3223, 350, -1549400497 * Class107.anInt1332 << 24 | 0x332277, 1);
		if (Class107.aBool1335) {
			for (int i_1_ = 0; i_1_ < 100; i_1_++) {
				int i_2_ = Class107.anIntArray1334[i_1_] >> 4;
				int i_3_ = Class107.anIntArray1333[i_1_] >> 4;
				i_2_ += (Class428.anIntArray4825[((i_2_ & 0x40) + i_3_) * 64 & 0x3fff]) >> 10;
				if (i_2_ >= 0 && i_2_ >> 1 < Class527_Sub41_Sub1.anIntArray11734.length && (Class527_Sub41_Sub1.anIntArray11734[i_2_ >> 1] >> 2 < 350 - i_3_))
					class180.method3348(i_2_, i_3_, 2, 2, (Class107.anIntArray1340[i_1_] << 24 | 0xffffff), 1);
			}
			for (int i_4_ = 0; i_4_ < Class527_Sub41_Sub1.anIntArray11734.length; i_4_++) {
				int i_5_ = Class527_Sub41_Sub1.anIntArray11734[i_4_] >> 2;
				class180.method3348(i_4_ << 1, 350 - i_5_, 2, i_5_, -2130706433, 1);
			}
		}
		int i_6_ = 350 / (645606131 * Class257.anInt2824);
		if (Class107.anInt1329 * -2080366569 > 0) {
			int i_7_ = 346 - 645606131 * Class257.anInt2824 - 4;
			int i_8_ = i_6_ * i_7_ / (Class107.anInt1329 * -2080366569 + i_6_ - 1);
			int i_9_ = 4;
			if (Class107.anInt1329 * -2080366569 > 1)
				i_9_ += ((Class107.anInt1329 * -2080366569 - 1 - Class107.anInt1331 * 656150623) * (i_7_ - i_8_) / (-2080366569 * Class107.anInt1329 - 1));
			class180.method3348(-1803844265 * Class289.anInt3223 - 16, i_9_, 12, i_8_, (-1549400497 * Class107.anInt1332 << 24 | 0x332277), 2);
			for (int i_10_ = 656150623 * Class107.anInt1331; (i_10_ < i_6_ + 656150623 * Class107.anInt1331 && i_10_ < Class107.anInt1329 * -2080366569); i_10_++) {
				String[] strings = Class592.method9875(Class107.aStringArray1327[i_10_], '\010', (short) -5935);
				int i_11_ = ((-1803844265 * Class289.anInt3223 - 8 - 16) / strings.length);
				for (int i_12_ = 0; i_12_ < strings.length; i_12_++) {
					int i_13_ = 8 + i_12_ * i_11_;
					class180.method3132(i_13_, 0, i_13_ + i_11_ - 8, 350);
					Class85.aClass174_819.method2770(Class215.method3960(strings[i_12_], (byte) -71), i_13_, (350 - Class107.anInt1328 * 104544033 - 2 - Class581.aClass22_7677.anInt213 * 672688101 - ((i_10_ - 656150623 * Class107.anInt1331) * (Class257.anInt2824 * 645606131))), -1, -16777216, 1332450094);
				}
			}
		}
		Class24_Sub9.aClass174_10977.method2744("876 1", (-1803844265 * Class289.anInt3223) - 25, 330, -1, -16777216, -811980400);
		class180.method3132(0, 0, Class289.anInt3223 * -1803844265, 350);
		class180.method3527(0, 350 - Class107.anInt1328 * 104544033, Class289.anInt3223 * -1803844265, -1, 1145940484);
		Class29.aClass174_262.method2770(new StringBuilder().append("--> ").append(Class215.method3960(Class107.aString1337, (byte) -114)).toString(), 10, 350 - Class568.aClass22_7615.anInt213 * 672688101 - 1, -1, -16777216, 1944933646);
		if (Class333.aBool3628) {
			int i_14_ = -1;
			if (client.anInt11019 % 30 > 15)
				i_14_ = 16777215;
			class180.method3141((10 + (Class568.aClass22_7615.method780(new StringBuilder().append("--> ").append(Class215.method3960(Class107.aString1337, (byte) -1).substring(0, Class107.anInt1339 * -1301288505)).toString(), (short) -22423))), 350 - Class568.aClass22_7615.anInt213 * 672688101 - 11, 12, i_14_, 1852596480);
		}
		class180.method3131();
		Class527_Sub42.method16687((byte) -27);
	}
}
