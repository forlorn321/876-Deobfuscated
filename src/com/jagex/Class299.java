/* Class299 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class299 implements Interface31 {
	int anInt3392;
	static Class205 aClass205_3393;
	Class73 aClass73_3394;
	Interface33[] anInterface33Array3395;
	boolean aBool3396;
	int anInt3397;
	Class180 aClass180_3398;
	static byte[] aByteArray3399 = { 31, -117, 8, 0, 0, 0, 0, 0, 0, 0, -5, 127, -29, -1, 109, 6, 103, 6, 14, 54, 54, 118, 54, 86, 14, 118, 118, 118, 78, 78, 14, 46, 30, 17, 94, 30, 110, 110, 30, 73, 33, 97, 126, 17, 89, 41, 121, 57, 89, 41, 25, 25, 5, 21, 61, 117, 5, 37, 29, 101, 25, 25, 13, 115, 77, 29, 3, 67, 19, 19, 19, 121, 117, 75, 91, 11, 35, 27, 61, 99, 19, 35, -112, 33, -116, -100, -100, -100, 60, -36, 60, 18, -68, -68, 18, 70, -118, 50, -118, 70, 36, -125, -1, 7, 24, 68, 56, 24, 24, 25,
			24, 89, 24, -107, 24, -104, 4, 25, -103, 5, 25, 89, -108, 24, -2, 31, 97, -112, 103, 96, 96, 100, 101, 4, 3, 6, 40, 96, 100, 98, 102, 97, 101, 99, -25, -32, -28, -30, 6, 42, -40, 42, -64, -64, -60, -56, -52, -52, -60, -62, -52, -54, -54, -62, 2, -108, -83, 5, -54, 51, -80, 8, -78, 10, 41, 26, 58, -78, 9, 7, 38, -78, 43, 21, -118, 24, 53, 78, 92, -56, -95, -20, -76, -15, -96, 104, -48, -59, 15, 42, -58, 73, 69, 77, -100, 92, 98, -30, 18, -110, 82, -86, 106, -22, 26, -102, 90, 38, -90,
			102, -26, 22, -106, 86, -50, 46, -82, 110, -18, 30, -98, 94, -63, 33, -95, 97, -31, 17, -111, 81, -55, 41, -87, 105, -23, 25, -103, 89, -59, 37, -91, 101, -27, 21, -107, 85, -51, 45, -83, 109, -19, 29, -99, 93, -109, 38, 79, -103, 58, 109, -6, -116, -103, -77, 22, 45, 94, -78, 116, -39, -14, 21, 43, 87, 109, -38, -68, 101, -21, -74, -19, 59, 118, -18, 58, 116, -8, -56, -47, 99, -57, 79, -100, 60, 117, -23, -14, -107, -85, -41, -82, -33, -72, 121, -21, -31, -93, -57, 79, -98, 62, 123,
			-2, -30, -27, -85, -113, -97, 62, 127, -7, -6, -19, -5, -113, -97, -65, 64, -2, 98, 100, 96, 102, -124, 1, -84, -2, 18, 4, -6, -117, -119, -123, -123, -103, -123, 29, -28, 47, 70, -90, 114, -112, 2, 65, 22, 86, 69, 67, 54, 33, -57, 64, -10, -60, 66, 97, 37, -93, 70, 14, 17, -89, -119, 11, 55, 30, -28, 84, 54, 14, -6, 32, -102, 84, 116, -111, 75, 76, -59, -28, -95, -22, 71, -112, -41, -64, 62, 35, -50, 99, 77, 100, -7, 12, -18, 49, -124, -65, 110, 49, -16, -79, 48, 2, -29, 15, -24,
			78, 6, 6, 123, -122, -97, -1, -70, 52, 22, -16, -49, 127, -79, -88, -21, -1, 77, 0, 38, 27, -28, 10, 110, 2, 0, 0 };
	public static int anInt3400;

	public int method185() {
		return 103183081 * anInt3397;
	}

	public void method182(int i) {
		if (aClass180_3398 != Class402.aClass180_4150) {
			aClass180_3398 = Class402.aClass180_4150;
			aBool3396 = true;
		}
		aClass180_3398.method3136(3, 0);
		Interface33[] interface33s = anInterface33Array3395;
		for (int i_0_ = 0; i_0_ < interface33s.length; i_0_++) {
			Interface33 interface33 = interface33s[i_0_];
			if (null != interface33)
				interface33.method205((byte) -23);
		}
	}

	public void method176(boolean bool, byte i) {
		bool = true;
		Interface33[] interface33s = anInterface33Array3395;
		for (int i_1_ = 0; i_1_ < interface33s.length; i_1_++) {
			Interface33 interface33 = interface33s[i_1_];
			if (interface33 != null)
				interface33.method203(bool || aBool3396, 953727586);
		}
		aBool3396 = false;
	}

	public int method181(int i) {
		int i_2_ = 0;
		Interface33[] interface33s = anInterface33Array3395;
		for (int i_3_ = 0; i_3_ < interface33s.length; i_3_++) {
			Interface33 interface33 = interface33s[i_3_];
			if (interface33 == null || interface33.method204(-1712318126))
				i_2_++;
		}
		return 100 * i_2_ / anInterface33Array3395.length;
	}

	static boolean method5517() {
		boolean bool;
		try {
			Class77 class77 = new Class77();
			byte[] is = class77.method1540(aByteArray3399, (byte) 14);
			Class689.method14000(is, -1879418778);
			bool = true;
		} catch (Exception exception) {
			return false;
		}
		return bool;
	}

	public boolean method178(long l) {
		return (Class234.method4347(-1408626088) >= (long) (-130758597 * anInt3392) + l);
	}

	public boolean method184(long l) {
		return (Class234.method4347(-1408626088) >= (long) (-130758597 * anInt3392) + l);
	}

	static {
		aClass205_3393 = new Class205(128, 4);
	}

	public void method174(boolean bool) {
		bool = true;
		Interface33[] interface33s = anInterface33Array3395;
		for (int i = 0; i < interface33s.length; i++) {
			Interface33 interface33 = interface33s[i];
			if (interface33 != null)
				interface33.method203(bool || aBool3396, -1881099804);
		}
		aBool3396 = false;
	}

	public static Class147 method5518(Class459 class459, int i) {
		Class147 class147 = (Class147) aClass205_3393.method3787((long) i);
		if (class147 == null) {
			if (Class527_Sub22.aBool10492)
				class147 = Class402.aClass180_4150.method3271(Class165.method2665(class459, i), true);
			else
				class147 = Class689.method14000(class459.method7512(i, 1447980132), -1943527080);
			aClass205_3393.method3790(class147, (long) i);
		}
		return class147;
	}

	public void method177(int i) {
		/* empty */
	}

	public void method33() {
		/* empty */
	}

	public void method34() {
		if (aClass180_3398 != Class402.aClass180_4150) {
			aClass180_3398 = Class402.aClass180_4150;
			aBool3396 = true;
		}
		aClass180_3398.method3136(3, 0);
		Interface33[] interface33s = anInterface33Array3395;
		for (int i = 0; i < interface33s.length; i++) {
			Interface33 interface33 = interface33s[i];
			if (null != interface33)
				interface33.method205((byte) 4);
		}
	}

	public int method187() {
		int i = 0;
		Interface33[] interface33s = anInterface33Array3395;
		for (int i_4_ = 0; i_4_ < interface33s.length; i_4_++) {
			Interface33 interface33 = interface33s[i_4_];
			if (interface33 == null || interface33.method204(475531261))
				i++;
		}
		return 100 * i / anInterface33Array3395.length;
	}

	public int method183() {
		int i = 0;
		Interface33[] interface33s = anInterface33Array3395;
		for (int i_5_ = 0; i_5_ < interface33s.length; i_5_++) {
			Interface33 interface33 = interface33s[i_5_];
			if (interface33 == null || interface33.method204(1669290540))
				i++;
		}
		return 100 * i / anInterface33Array3395.length;
	}

	public boolean method175(long l) {
		return (Class234.method4347(-1408626088) >= (long) (-130758597 * anInt3392) + l);
	}

	public static Class147 method5519(Class459 class459, int i) {
		Class147 class147 = (Class147) aClass205_3393.method3787((long) i);
		if (class147 == null) {
			if (Class527_Sub22.aBool10492)
				class147 = Class402.aClass180_4150.method3271(Class165.method2665(class459, i), true);
			else
				class147 = Class689.method14000(class459.method7512(i, 1447980132), -1824170229);
			aClass205_3393.method3790(class147, (long) i);
		}
		return class147;
	}

	public boolean method186(long l) {
		return (Class234.method4347(-1408626088) >= (long) (-130758597 * anInt3392) + l);
	}

	public static Class147 method5520(Class459 class459, int i) {
		Class147 class147 = (Class147) aClass205_3393.method3787((long) i);
		if (class147 == null) {
			if (Class527_Sub22.aBool10492)
				class147 = Class402.aClass180_4150.method3271(Class165.method2665(class459, i), true);
			else
				class147 = Class689.method14000(class459.method7512(i, 1447980132), -2104520993);
			aClass205_3393.method3790(class147, (long) i);
		}
		return class147;
	}

	public int method179(int i) {
		return 103183081 * anInt3397;
	}

	public void method32() {
		/* empty */
	}

	public void method180() {
		/* empty */
	}

	Class299(Class73 class73, int i, int i_6_, Class332 class332) {
		aClass73_3394 = class73;
		anInt3392 = 1816318195 * i;
		anInt3397 = i_6_ * 269976921;
		anInterface33Array3395 = new Interface33[aClass73_3394.anInterface47Array789.length];
		for (int i_7_ = 0; i_7_ < anInterface33Array3395.length; i_7_++)
			anInterface33Array3395[i_7_] = class332.method5832((aClass73_3394.anInterface47Array789[i_7_]), 102380841);
	}

	public static void method5521(byte i) {
		if (null != Class649.aClass358_8371) {
			Class649.aClass358_8371.method6280(390050913);
			Class649.aClass358_8371 = null;
		}
	}

	public static int method5522(byte i) {
		if (1480422999 * Class36.anInt425 == -1) {
			Class36[] class36s = Class457.method7447(2121792511);
			for (int i_8_ = 0; i_8_ < class36s.length; i_8_++) {
				Class36 class36 = class36s[i_8_];
				if (801896755 * class36.anInt423 > Class36.anInt425 * 1480422999)
					Class36.anInt425 = class36.anInt423 * -1846300027;
			}
			Class36.anInt425 += 726259047;
		}
		return Class36.anInt425 * 1480422999;
	}

	public static int method5523(String string, String string_9_, byte i) {
		if (!Class585.aBool7693)
			return 12;
		if (Class203.method3782((byte) -1) != client.aClass109_11067)
			return 42;
		return Class585.aTwitchTV7698.Login(string, string_9_);
	}
}
