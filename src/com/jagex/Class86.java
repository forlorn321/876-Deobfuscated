/* Class86 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Random;

public class Class86 {
	static Random aRandom869;
	static Object anObject870 = new Object();

	static int method1189(int i, int i_0_) {
		int i_1_ = i >> 31 & i_0_ - 1;
		return ((i >>> 31) + i) % i_0_ + i_1_;
	}

	public static int method1190(int i) {
		int i_2_ = i >>> 1;
		i_2_ |= i_2_ >>> 1;
		i_2_ |= i_2_ >>> 2;
		i_2_ |= i_2_ >>> 4;
		i_2_ |= i_2_ >>> 8;
		i_2_ |= i_2_ >>> 16;
		return i & (i_2_ ^ 0xffffffff);
	}

	public static int method1191(int i) {
		i = --i | i >>> 1;
		i |= i >>> 2;
		i |= i >>> 4;
		i |= i >>> 8;
		i |= i >>> 16;
		return i + 1;
	}

	Class86() throws Throwable {
		throw new Error();
	}

	public static int method1192(int i) {
		int i_3_ = 0;
		if (i < 0 || i >= 65536) {
			i >>>= 16;
			i_3_ += 16;
		}
		if (i >= 256) {
			i >>>= 8;
			i_3_ += 8;
		}
		if (i >= 16) {
			i >>>= 4;
			i_3_ += 4;
		}
		if (i >= 4) {
			i >>>= 2;
			i_3_ += 2;
		}
		if (i >= 1) {
			i >>>= 1;
			i_3_++;
		}
		return i_3_ + i;
	}

	public static int method1193(int i) {
		int i_4_ = i >>> 1;
		i_4_ |= i_4_ >>> 1;
		i_4_ |= i_4_ >>> 2;
		i_4_ |= i_4_ >>> 4;
		i_4_ |= i_4_ >>> 8;
		i_4_ |= i_4_ >>> 16;
		return i & (i_4_ ^ 0xffffffff);
	}

	public static boolean method1194(int i) {
		return i == (i & -i);
	}

	public static boolean method1195(int i) {
		return i == (i & -i);
	}

	public static int method1196(int i) {
		int i_5_ = 0;
		if (i < 0 || i >= 65536) {
			i >>>= 16;
			i_5_ += 16;
		}
		if (i >= 256) {
			i >>>= 8;
			i_5_ += 8;
		}
		if (i >= 16) {
			i >>>= 4;
			i_5_ += 4;
		}
		if (i >= 4) {
			i >>>= 2;
			i_5_ += 2;
		}
		if (i >= 1) {
			i >>>= 1;
			i_5_++;
		}
		return i_5_ + i;
	}

	public static int method1197(int i) {
		i = --i | i >>> 1;
		i |= i >>> 2;
		i |= i >>> 4;
		i |= i >>> 8;
		i |= i >>> 16;
		return i + 1;
	}

	public static int method1198(int i, int i_6_) {
		int i_7_ = 0;
		for (/**/; i_6_ > 0; i_6_--) {
			i_7_ = i_7_ << 1 | i & 0x1;
			i >>>= 1;
		}
		return i_7_;
	}

	public static int method1199(int i) {
		int i_8_ = 0;
		if (i < 0 || i >= 65536) {
			i >>>= 16;
			i_8_ += 16;
		}
		if (i >= 256) {
			i >>>= 8;
			i_8_ += 8;
		}
		if (i >= 16) {
			i >>>= 4;
			i_8_ += 4;
		}
		if (i >= 4) {
			i >>>= 2;
			i_8_ += 2;
		}
		if (i >= 1) {
			i >>>= 1;
			i_8_++;
		}
		return i_8_ + i;
	}

	public static int method1200(int i, int i_9_) {
		int i_10_ = 0;
		for (/**/; i_9_ > 0; i_9_--) {
			i_10_ = i_10_ << 1 | i & 0x1;
			i >>>= 1;
		}
		return i_10_;
	}

	static int method1201(int i, int i_11_) {
		int i_12_ = i >> 31 & i_11_ - 1;
		return ((i >>> 31) + i) % i_11_ + i_12_;
	}

	static final void method1202(Class668 class668, int i) {
		int i_13_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		IComponentDefinitions class251 = Class264.getIComponentDefinitions(i_13_);
		Class241.method3385(class251, class668, (byte) 6);
	}

	static void method1203(int i, int i_14_) {
		synchronized (Class49.aClass199_580) {
			Class49.aClass199_580.method2883(i, -1047508820);
		}
	}
}
