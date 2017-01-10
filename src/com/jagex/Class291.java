/* Class291 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class291 implements Interface30 {
	boolean aBool3224;
	Class83 aClass83_3225;
	GraphicalRenderer aClass167_3226;
	Interface33[] anInterface33Array3227;
	int anInt3228;
	int anInt3229;
	static Class199 aClass199_3230;
	static byte[] aByteArray3231 = { 31, -117, 8, 0, 0, 0, 0, 0, 0, 0, -5, 127, -29, -1, 109, 6, 103, 6, 14, 54, 54, 118, 54, 86, 14, 118, 118, 118, 78, 78, 14, 46, 30, 17, 94, 30, 110, 110, 30, 73, 33, 97, 126, 17, 89, 41, 121, 57, 89, 41, 25, 25, 5, 21, 61, 117, 5, 37, 29, 101, 25, 25, 13, 115, 77, 29, 3, 67, 19, 19, 19, 121, 117, 75, 91, 11, 35, 27, 61, 99, 19, 35, -112, 33, -116, -100, -100, -100, 60, -36, 60, 18, -68, -68, 18, 70, -118, 50, -118, 70, 36, -125, -1, 7, 24, 68, 56, 24, 24, 25,
			24, 89, 24, -107, 24, -104, 4, 25, -103, 5, 25, 89, -108, 24, -2, 31, 97, -112, 103, 96, 96, 100, 101, 4, 3, 6, 40, 96, 100, 98, 102, 97, 101, 99, -25, -32, -28, -30, 6, 42, -40, 42, -64, -64, -60, -56, -52, -52, -60, -62, -52, -54, -54, -62, 2, -108, -83, 5, -54, 51, -80, 8, -78, 10, 41, 26, 58, -78, 9, 7, 38, -78, 43, 21, -118, 24, 53, 78, 92, -56, -95, -20, -76, -15, -96, 104, -48, -59, 15, 42, -58, 73, 69, 77, -100, 92, 98, -30, 18, -110, 82, -86, 106, -22, 26, -102, 90, 38, -90,
			102, -26, 22, -106, 86, -50, 46, -82, 110, -18, 30, -98, 94, -63, 33, -95, 97, -31, 17, -111, 81, -55, 41, -87, 105, -23, 25, -103, 89, -59, 37, -91, 101, -27, 21, -107, 85, -51, 45, -83, 109, -19, 29, -99, 93, -109, 38, 79, -103, 58, 109, -6, -116, -103, -77, 22, 45, 94, -78, 116, -39, -14, 21, 43, 87, 109, -38, -68, 101, -21, -74, -19, 59, 118, -18, 58, 116, -8, -56, -47, 99, -57, 79, -100, 60, 117, -23, -14, -107, -85, -41, -82, -33, -72, 121, -21, -31, -93, -57, 79, -98, 62, 123,
			-2, -30, -27, -85, -113, -97, 62, 127, -7, -6, -19, -5, -113, -97, -65, 64, -2, 98, 100, 96, 102, -124, 1, -84, -2, 18, 4, -6, -117, -119, -123, -123, -103, -123, 29, -28, 47, 70, -90, 114, -112, 2, 65, 22, 86, 69, 67, 54, 33, -57, 64, -10, -60, 66, 97, 37, -93, 70, 14, 17, -89, -119, 11, 55, 30, -28, 84, 54, 14, -6, 32, -102, 84, 116, -111, 75, 76, -59, -28, -95, -22, 71, -112, -41, -64, 62, 35, -50, 99, 77, 100, -7, 12, -18, 49, -124, -65, 110, 49, -16, -79, 48, 2, -29, 15, -24,
			78, 6, 6, 123, -122, -97, -1, -70, 52, 22, -16, -49, 127, -79, -88, -21, -1, 77, 0, 38, 27, -28, 10, 110, 2, 0, 0 };

	static boolean method3927() {
		boolean bool;
		try {
			Class85 class85 = new Class85();
			byte[] is = class85.method1185(aByteArray3231, 1793456077);
			Huffman.method3771(is, (byte) 12);
			bool = true;
		} catch (Exception exception) {
			return false;
		}
		return bool;
	}

	public void method172(short i) {
		if (Class677.aClass167_8609 != aClass167_3226) {
			aClass167_3226 = Class677.aClass167_8609;
			aBool3224 = true;
		}
		aClass167_3226.method2000(3, 0);
		Interface33[] interface33s = anInterface33Array3227;
		for (int i_0_ = 0; i_0_ < interface33s.length; i_0_++) {
			Interface33 interface33 = interface33s[i_0_];
			if (null != interface33)
				interface33.method206(-1298110672);
		}
	}

	public void method188(boolean bool, byte i) {
		bool = true;
		Interface33[] interface33s = anInterface33Array3227;
		for (int i_1_ = 0; i_1_ < interface33s.length; i_1_++) {
			Interface33 interface33 = interface33s[i_1_];
			if (interface33 != null)
				interface33.method216(bool || aBool3224, -989431627);
		}
		aBool3224 = false;
	}

	public int method171(int i) {
		int i_2_ = 0;
		Interface33[] interface33s = anInterface33Array3227;
		for (int i_3_ = 0; i_3_ < interface33s.length; i_3_++) {
			Interface33 interface33 = interface33s[i_3_];
			if (null == interface33 || interface33.method209(442742789))
				i_2_++;
		}
		return 100 * i_2_ / anInterface33Array3227.length;
	}

	public int method176() {
		int i = 0;
		Interface33[] interface33s = anInterface33Array3227;
		for (int i_4_ = 0; i_4_ < interface33s.length; i_4_++) {
			Interface33 interface33 = interface33s[i_4_];
			if (null == interface33 || interface33.method209(-114883633))
				i++;
		}
		return 100 * i / anInterface33Array3227.length;
	}

	static {
		aClass199_3230 = new Class199(128, 4);
	}

	public int method173(int i) {
		return anInt3229 * -554656005;
	}

	public boolean method184(long l) {
		return (Class249.method3450(1298138029) >= l + (long) (-1225848535 * anInt3228));
	}

	public void method178() {
		if (Class677.aClass167_8609 != aClass167_3226) {
			aClass167_3226 = Class677.aClass167_8609;
			aBool3224 = true;
		}
		aClass167_3226.method2000(3, 0);
		Interface33[] interface33s = anInterface33Array3227;
		for (int i = 0; i < interface33s.length; i++) {
			Interface33 interface33 = interface33s[i];
			if (null != interface33)
				interface33.method206(-1043267154);
		}
	}

	public void method183() {
		/* empty */
	}

	public int method177() {
		int i = 0;
		Interface33[] interface33s = anInterface33Array3227;
		for (int i_5_ = 0; i_5_ < interface33s.length; i_5_++) {
			Interface33 interface33 = interface33s[i_5_];
			if (null == interface33 || interface33.method209(1898711531))
				i++;
		}
		return 100 * i / anInterface33Array3227.length;
	}

	public int method180() {
		int i = 0;
		Interface33[] interface33s = anInterface33Array3227;
		for (int i_6_ = 0; i_6_ < interface33s.length; i_6_++) {
			Interface33 interface33 = interface33s[i_6_];
			if (null == interface33 || interface33.method209(1151373415))
				i++;
		}
		return 100 * i / anInterface33Array3227.length;
	}

	public int method181() {
		int i = 0;
		Interface33[] interface33s = anInterface33Array3227;
		for (int i_7_ = 0; i_7_ < interface33s.length; i_7_++) {
			Interface33 interface33 = interface33s[i_7_];
			if (null == interface33 || interface33.method209(297917196))
				i++;
		}
		return 100 * i / anInterface33Array3227.length;
	}

	public boolean method175(long l) {
		return (Class249.method3450(2037833220) >= l + (long) (-1225848535 * anInt3228));
	}

	public boolean method189(long l) {
		return (Class249.method3450(2027038950) >= l + (long) (-1225848535 * anInt3228));
	}

	public void method182(int i) {
		/* empty */
	}

	public boolean method185(long l) {
		return (Class249.method3450(1849037959) >= l + (long) (-1225848535 * anInt3228));
	}

	public int method186() {
		return anInt3229 * -554656005;
	}

	public int method187() {
		return anInt3229 * -554656005;
	}

	static void method3928() {
		aClass199_3230.method2884((byte) -65);
	}

	public void method174(boolean bool) {
		bool = true;
		Interface33[] interface33s = anInterface33Array3227;
		for (int i = 0; i < interface33s.length; i++) {
			Interface33 interface33 = interface33s[i];
			if (interface33 != null)
				interface33.method216(bool || aBool3224, -989431627);
		}
		aBool3224 = false;
	}

	public void method179(boolean bool) {
		bool = true;
		Interface33[] interface33s = anInterface33Array3227;
		for (int i = 0; i < interface33s.length; i++) {
			Interface33 interface33 = interface33s[i];
			if (interface33 != null)
				interface33.method216(bool || aBool3224, -989431627);
		}
		aBool3224 = false;
	}

	static boolean method3929() {
		boolean bool;
		try {
			Class85 class85 = new Class85();
			byte[] is = class85.method1185(aByteArray3231, 1793456077);
			Huffman.method3771(is, (byte) 12);
			bool = true;
		} catch (Exception exception) {
			return false;
		}
		return bool;
	}

	Class291(Class83 class83, int i, int i_8_, Class322 class322) {
		aClass83_3225 = class83;
		anInt3228 = -996433127 * i;
		anInt3229 = i_8_ * -1561281485;
		anInterface33Array3227 = new Interface33[aClass83_3225.anInterface49Array863.length];
		for (int i_9_ = 0; i_9_ < anInterface33Array3227.length; i_9_++)
			anInterface33Array3227[i_9_] = class322.method4248((aClass83_3225.anInterface49Array863[i_9_]), (byte) -1);
	}

	static final void method3930(Class668 class668, int i) {
		int i_10_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		IComponentDefinitions class251 = Class264.getIComponentDefinitions(i_10_);
		Class234 class234 = Class463.aClass234Array5227[i_10_ >> 16];
		Class39.method866(class251, class234, class668, (byte) 18);
	}
}
