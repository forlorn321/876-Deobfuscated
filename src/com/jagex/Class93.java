/* Class93 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Random;

public class Class93 {
	static Random aRandom882;
	static Object anObject883 = new Object();

	public static int method1653(Random random, int i) {
		if (null == random) {
			random = aRandom882;
			if (null == random) {
				synchronized (anObject883) {
					if (null == aRandom882)
						aRandom882 = new Random();
					random = aRandom882;
				}
			}
		}
		if (i <= 0)
			throw new IllegalArgumentException();
		if (Class143.method2383(i, 1959130309))
			return (int) (((long) random.nextInt() & 0xffffffffL) * (long) i >> 32);
		int i_0_ = -2147483648 - (int) (4294967296L % (long) i);
		int i_1_;
		do
			i_1_ = random.nextInt();
		while (i_1_ >= i_0_);
		return Class24.method848(i_1_, i, -1494078768);
	}

	static int method1654(int i, int i_2_) {
		int i_3_ = i >> 31 & i_2_ - 1;
		return i_3_ + ((i >>> 31) + i) % i_2_;
	}

	public static int method1655(int i) {
		i = --i | i >>> 1;
		i |= i >>> 2;
		i |= i >>> 4;
		i |= i >>> 8;
		i |= i >>> 16;
		return 1 + i;
	}

	public static int method1656(int i) {
		i = --i | i >>> 1;
		i |= i >>> 2;
		i |= i >>> 4;
		i |= i >>> 8;
		i |= i >>> 16;
		return 1 + i;
	}

	static int method1657(int i, int i_4_) {
		int i_5_ = i >> 31 & i_4_ - 1;
		return i_5_ + ((i >>> 31) + i) % i_4_;
	}

	public static int method1658(int i) {
		int i_6_ = i >>> 1;
		i_6_ |= i_6_ >>> 1;
		i_6_ |= i_6_ >>> 2;
		i_6_ |= i_6_ >>> 4;
		i_6_ |= i_6_ >>> 8;
		i_6_ |= i_6_ >>> 16;
		return i & (i_6_ ^ 0xffffffff);
	}

	public static boolean method1659(int i) {
		return (i & -i) == i;
	}

	public static int method1660(int i) {
		int i_7_ = 0;
		if (i < 0 || i >= 65536) {
			i >>>= 16;
			i_7_ += 16;
		}
		if (i >= 256) {
			i >>>= 8;
			i_7_ += 8;
		}
		if (i >= 16) {
			i >>>= 4;
			i_7_ += 4;
		}
		if (i >= 4) {
			i >>>= 2;
			i_7_ += 2;
		}
		if (i >= 1) {
			i >>>= 1;
			i_7_++;
		}
		return i + i_7_;
	}

	public static int method1661(int i) {
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
		return i + i_8_;
	}

	public static int method1662(int i) {
		int i_9_ = 0;
		if (i < 0 || i >= 65536) {
			i >>>= 16;
			i_9_ += 16;
		}
		if (i >= 256) {
			i >>>= 8;
			i_9_ += 8;
		}
		if (i >= 16) {
			i >>>= 4;
			i_9_ += 4;
		}
		if (i >= 4) {
			i >>>= 2;
			i_9_ += 2;
		}
		if (i >= 1) {
			i >>>= 1;
			i_9_++;
		}
		return i + i_9_;
	}

	public static int method1663(int i) {
		int i_10_ = 0;
		if (i < 0 || i >= 65536) {
			i >>>= 16;
			i_10_ += 16;
		}
		if (i >= 256) {
			i >>>= 8;
			i_10_ += 8;
		}
		if (i >= 16) {
			i >>>= 4;
			i_10_ += 4;
		}
		if (i >= 4) {
			i >>>= 2;
			i_10_ += 2;
		}
		if (i >= 1) {
			i >>>= 1;
			i_10_++;
		}
		return i + i_10_;
	}

	public static int method1664(int i, int i_11_) {
		int i_12_ = 0;
		for (/**/; i_11_ > 0; i_11_--) {
			i_12_ = i_12_ << 1 | i & 0x1;
			i >>>= 1;
		}
		return i_12_;
	}

	public static int method1665(int i, int i_13_) {
		int i_14_ = 0;
		for (/**/; i_13_ > 0; i_13_--) {
			i_14_ = i_14_ << 1 | i & 0x1;
			i >>>= 1;
		}
		return i_14_;
	}

	public static int method1666(int i) {
		int i_15_ = i >>> 1;
		i_15_ |= i_15_ >>> 1;
		i_15_ |= i_15_ >>> 2;
		i_15_ |= i_15_ >>> 4;
		i_15_ |= i_15_ >>> 8;
		i_15_ |= i_15_ >>> 16;
		return i & (i_15_ ^ 0xffffffff);
	}

	static int method1667(int i, int i_16_) {
		int i_17_ = i >> 31 & i_16_ - 1;
		return i_17_ + ((i >>> 31) + i) % i_16_;
	}

	Class93() throws Throwable {
		throw new Error();
	}

	public static int method1668(int i) {
		int i_18_ = i >>> 1;
		i_18_ |= i_18_ >>> 1;
		i_18_ |= i_18_ >>> 2;
		i_18_ |= i_18_ >>> 4;
		i_18_ |= i_18_ >>> 8;
		i_18_ |= i_18_ >>> 16;
		return i & (i_18_ ^ 0xffffffff);
	}

	public static int method1669(Random random, int i) {
		if (null == random) {
			random = aRandom882;
			if (null == random) {
				synchronized (anObject883) {
					if (null == aRandom882)
						aRandom882 = new Random();
					random = aRandom882;
				}
			}
		}
		if (i <= 0)
			throw new IllegalArgumentException();
		if (Class143.method2383(i, 1658283487))
			return (int) (((long) random.nextInt() & 0xffffffffL) * (long) i >> 32);
		int i_19_ = -2147483648 - (int) (4294967296L % (long) i);
		int i_20_;
		do
			i_20_ = random.nextInt();
		while (i_20_ >= i_19_);
		return Class24.method848(i_20_, i, -1494078768);
	}

	public static int method1670(Random random, int i) {
		if (null == random) {
			random = aRandom882;
			if (null == random) {
				synchronized (anObject883) {
					if (null == aRandom882)
						aRandom882 = new Random();
					random = aRandom882;
				}
			}
		}
		if (i <= 0)
			throw new IllegalArgumentException();
		if (Class143.method2383(i, 1561974463))
			return (int) (((long) random.nextInt() & 0xffffffffL) * (long) i >> 32);
		int i_21_ = -2147483648 - (int) (4294967296L % (long) i);
		int i_22_;
		do
			i_22_ = random.nextInt();
		while (i_22_ >= i_21_);
		return Class24.method848(i_22_, i, -1494078768);
	}

	public static int method1671(Random random, int i) {
		if (null == random) {
			random = aRandom882;
			if (null == random) {
				synchronized (anObject883) {
					if (null == aRandom882)
						aRandom882 = new Random();
					random = aRandom882;
				}
			}
		}
		if (i <= 0)
			throw new IllegalArgumentException();
		if (Class143.method2383(i, 2071929391))
			return (int) (((long) random.nextInt() & 0xffffffffL) * (long) i >> 32);
		int i_23_ = -2147483648 - (int) (4294967296L % (long) i);
		int i_24_;
		do
			i_24_ = random.nextInt();
		while (i_24_ >= i_23_);
		return Class24.method848(i_24_, i, -1494078768);
	}

	public static void method1672(boolean bool, int i) {
		for (Class527_Sub28 class527_sub28 = ((Class527_Sub28) Class527_Sub28.aClass694_10526.method14081((short) -6779)); class527_sub28 != null; class527_sub28 = (Class527_Sub28) Class527_Sub28.aClass694_10526.method14086(-65534)) {
			if (null != class527_sub28.aClass483_10551) {
				class527_sub28.aClass483_10551.method7864(150, (byte) 6);
				Class245.aClass226_2698.method4215(class527_sub28.aClass483_10551, (byte) -1);
				class527_sub28.aClass483_10551 = null;
			}
			if (class527_sub28.aClass483_10525 != null) {
				class527_sub28.aClass483_10525.method7864(150, (byte) 6);
				Class245.aClass226_2698.method4215(class527_sub28.aClass483_10525, (byte) -1);
				class527_sub28.aClass483_10525 = null;
			}
			class527_sub28.method8735(-1889161967);
		}
		if (bool) {
			for (Class527_Sub28 class527_sub28 = (Class527_Sub28) Class527_Sub28.aClass694_10527.method14081((short) -19296); class527_sub28 != null; class527_sub28 = ((Class527_Sub28) Class527_Sub28.aClass694_10527.method14086(-65534))) {
				if (null != class527_sub28.aClass483_10551) {
					class527_sub28.aClass483_10551.method7864(150, (byte) 6);
					Class245.aClass226_2698.method4215(class527_sub28.aClass483_10551, (byte) -1);
					class527_sub28.aClass483_10551 = null;
				}
				class527_sub28.method8735(-1889161967);
			}
			for (Class527_Sub28 class527_sub28 = ((Class527_Sub28) Class527_Sub28.aClass14_10545.method713((byte) -27)); class527_sub28 != null; class527_sub28 = ((Class527_Sub28) Class527_Sub28.aClass14_10545.method717(725944298))) {
				if (null != class527_sub28.aClass483_10551) {
					class527_sub28.aClass483_10551.method7864(150, (byte) 6);
					Class245.aClass226_2698.method4215(class527_sub28.aClass483_10551, (byte) -1);
					class527_sub28.aClass483_10551 = null;
				}
				class527_sub28.method8735(-1889161967);
			}
		}
	}
}
