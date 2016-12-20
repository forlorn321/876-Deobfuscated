/* Class706 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class706 {
	static int anInt8833;
	static int anInt8834;
	static int anInt8835 = 0;
	static byte[][] aByteArrayArray8836;
	static byte[][] aByteArrayArray8837;
	static byte[][] aByteArrayArray8838;
	static int[] anIntArray8839;
	static byte[][][] aByteArrayArrayArray8840;

	public static synchronized void method14339(byte[] is) {
		if (is.length == 100 && anInt8835 * 891302559 < 1000)
			aByteArrayArray8836[(anInt8835 += -512333473) * 891302559 - 1] = is;
		else if (5000 == is.length && anInt8834 * -1657017109 < 250)
			aByteArrayArray8837[(anInt8834 += -710321213) * -1657017109 - 1] = is;
		else if (is.length == 30000 && anInt8833 * -1480397203 < 50)
			aByteArrayArray8838[(anInt8833 += 1182157669) * -1480397203 - 1] = is;
		else if (null != aByteArrayArrayArray8840) {
			for (int i = 0; i < anIntArray8839.length; i++) {
				if (is.length == anIntArray8839[i] && (Class700_Sub43.anIntArray10955[i] < aByteArrayArrayArray8840[i].length)) {
					aByteArrayArrayArray8840[i][Class700_Sub43.anIntArray10955[i]++] = is;
					break;
				}
			}
		}
	}

	public static synchronized byte[] method14340(int i, boolean bool, int i_0_) {
		if ((i == 100 || i < 100 && bool) && anInt8835 * 891302559 > 0) {
			byte[] is = aByteArrayArray8836[(anInt8835 -= -512333473) * 891302559];
			aByteArrayArray8836[anInt8835 * 891302559] = null;
			return is;
		}
		if ((5000 == i || i < 5000 && bool) && -1657017109 * anInt8834 > 0) {
			byte[] is = aByteArrayArray8837[(anInt8834 -= -710321213) * -1657017109];
			aByteArrayArray8837[-1657017109 * anInt8834] = null;
			return is;
		}
		if ((i == 30000 || i < 30000 && bool) && anInt8833 * -1480397203 > 0) {
			byte[] is = aByteArrayArray8838[(anInt8833 -= 1182157669) * -1480397203];
			aByteArrayArray8838[-1480397203 * anInt8833] = null;
			return is;
		}
		if (aByteArrayArrayArray8840 != null) {
			for (int i_1_ = 0; i_1_ < anIntArray8839.length; i_1_++) {
				if ((i == anIntArray8839[i_1_] || i < anIntArray8839[i_1_] && bool) && Class700_Sub43.anIntArray10955[i_1_] > 0) {
					byte[] is = (aByteArrayArrayArray8840[i_1_][--Class700_Sub43.anIntArray10955[i_1_]]);
					aByteArrayArrayArray8840[i_1_][(Class700_Sub43.anIntArray10955[i_1_])] = null;
					return is;
				}
			}
		}
		if (bool && anIntArray8839 != null) {
			for (int i_2_ = 0; i_2_ < anIntArray8839.length; i_2_++) {
				if (i <= anIntArray8839[i_2_] && (Class700_Sub43.anIntArray10955[i_2_] < aByteArrayArrayArray8840[i_2_].length))
					return new byte[anIntArray8839[i_2_]];
			}
		}
		return new byte[i];
	}

	public static synchronized byte[] method14341(int i, int i_3_) {
		return method14340(i, false, -740746889);
	}

	public static synchronized void method14342(byte[] is, byte i) {
		if (is.length == 100 && anInt8835 * 891302559 < 1000)
			aByteArrayArray8836[(anInt8835 += -512333473) * 891302559 - 1] = is;
		else if (5000 == is.length && anInt8834 * -1657017109 < 250)
			aByteArrayArray8837[(anInt8834 += -710321213) * -1657017109 - 1] = is;
		else if (is.length == 30000 && anInt8833 * -1480397203 < 50)
			aByteArrayArray8838[(anInt8833 += 1182157669) * -1480397203 - 1] = is;
		else if (null != aByteArrayArrayArray8840) {
			for (int i_4_ = 0; i_4_ < anIntArray8839.length; i_4_++) {
				if (is.length == anIntArray8839[i_4_] && (Class700_Sub43.anIntArray10955[i_4_] < aByteArrayArrayArray8840[i_4_].length)) {
					aByteArrayArrayArray8840[i_4_][Class700_Sub43.anIntArray10955[i_4_]++] = is;
					break;
				}
			}
		}
	}

	static {
		anInt8834 = 0;
		anInt8833 = 0;
		aByteArrayArray8836 = new byte[1000][];
		aByteArrayArray8837 = new byte[250][];
		aByteArrayArray8838 = new byte[50][];
	}

	public static void method14343(int[] is, int[] is_5_) {
		if (null == is || is_5_ == null) {
			anIntArray8839 = null;
			Class700_Sub43.anIntArray10955 = null;
			aByteArrayArrayArray8840 = null;
		} else {
			anIntArray8839 = is;
			Class700_Sub43.anIntArray10955 = new int[is.length];
			aByteArrayArrayArray8840 = new byte[is.length][][];
			for (int i = 0; i < anIntArray8839.length; i++)
				aByteArrayArrayArray8840[i] = new byte[is_5_[i]][];
		}
	}

	public static synchronized byte[] method14344(int i, boolean bool) {
		if ((i == 100 || i < 100 && bool) && anInt8835 * 891302559 > 0) {
			byte[] is = aByteArrayArray8836[(anInt8835 -= -512333473) * 891302559];
			aByteArrayArray8836[anInt8835 * 891302559] = null;
			return is;
		}
		if ((5000 == i || i < 5000 && bool) && -1657017109 * anInt8834 > 0) {
			byte[] is = aByteArrayArray8837[(anInt8834 -= -710321213) * -1657017109];
			aByteArrayArray8837[-1657017109 * anInt8834] = null;
			return is;
		}
		if ((i == 30000 || i < 30000 && bool) && anInt8833 * -1480397203 > 0) {
			byte[] is = aByteArrayArray8838[(anInt8833 -= 1182157669) * -1480397203];
			aByteArrayArray8838[-1480397203 * anInt8833] = null;
			return is;
		}
		if (aByteArrayArrayArray8840 != null) {
			for (int i_6_ = 0; i_6_ < anIntArray8839.length; i_6_++) {
				if ((i == anIntArray8839[i_6_] || i < anIntArray8839[i_6_] && bool) && Class700_Sub43.anIntArray10955[i_6_] > 0) {
					byte[] is = (aByteArrayArrayArray8840[i_6_][--Class700_Sub43.anIntArray10955[i_6_]]);
					aByteArrayArrayArray8840[i_6_][(Class700_Sub43.anIntArray10955[i_6_])] = null;
					return is;
				}
			}
		}
		if (bool && anIntArray8839 != null) {
			for (int i_7_ = 0; i_7_ < anIntArray8839.length; i_7_++) {
				if (i <= anIntArray8839[i_7_] && (Class700_Sub43.anIntArray10955[i_7_] < aByteArrayArrayArray8840[i_7_].length))
					return new byte[anIntArray8839[i_7_]];
			}
		}
		return new byte[i];
	}

	Class706() throws Throwable {
		throw new Error();
	}

	public static synchronized byte[] method14345(int i) {
		return method14340(i, false, -740746889);
	}

	public static synchronized void method14346(byte[] is) {
		if (is.length == 100 && anInt8835 * 891302559 < 1000)
			aByteArrayArray8836[(anInt8835 += -512333473) * 891302559 - 1] = is;
		else if (5000 == is.length && anInt8834 * -1657017109 < 250)
			aByteArrayArray8837[(anInt8834 += -710321213) * -1657017109 - 1] = is;
		else if (is.length == 30000 && anInt8833 * -1480397203 < 50)
			aByteArrayArray8838[(anInt8833 += 1182157669) * -1480397203 - 1] = is;
		else if (null != aByteArrayArrayArray8840) {
			for (int i = 0; i < anIntArray8839.length; i++) {
				if (is.length == anIntArray8839[i] && (Class700_Sub43.anIntArray10955[i] < aByteArrayArrayArray8840[i].length)) {
					aByteArrayArrayArray8840[i][Class700_Sub43.anIntArray10955[i]++] = is;
					break;
				}
			}
		}
	}

	public static synchronized void method14347(byte[] is) {
		if (is.length == 100 && anInt8835 * 891302559 < 1000)
			aByteArrayArray8836[(anInt8835 += -512333473) * 891302559 - 1] = is;
		else if (5000 == is.length && anInt8834 * -1657017109 < 250)
			aByteArrayArray8837[(anInt8834 += -710321213) * -1657017109 - 1] = is;
		else if (is.length == 30000 && anInt8833 * -1480397203 < 50)
			aByteArrayArray8838[(anInt8833 += 1182157669) * -1480397203 - 1] = is;
		else if (null != aByteArrayArrayArray8840) {
			for (int i = 0; i < anIntArray8839.length; i++) {
				if (is.length == anIntArray8839[i] && (Class700_Sub43.anIntArray10955[i] < aByteArrayArrayArray8840[i].length)) {
					aByteArrayArrayArray8840[i][Class700_Sub43.anIntArray10955[i]++] = is;
					break;
				}
			}
		}
	}

	public static synchronized void method14348(byte[] is) {
		if (is.length == 100 && anInt8835 * 891302559 < 1000)
			aByteArrayArray8836[(anInt8835 += -512333473) * 891302559 - 1] = is;
		else if (5000 == is.length && anInt8834 * -1657017109 < 250)
			aByteArrayArray8837[(anInt8834 += -710321213) * -1657017109 - 1] = is;
		else if (is.length == 30000 && anInt8833 * -1480397203 < 50)
			aByteArrayArray8838[(anInt8833 += 1182157669) * -1480397203 - 1] = is;
		else if (null != aByteArrayArrayArray8840) {
			for (int i = 0; i < anIntArray8839.length; i++) {
				if (is.length == anIntArray8839[i] && (Class700_Sub43.anIntArray10955[i] < aByteArrayArrayArray8840[i].length)) {
					aByteArrayArrayArray8840[i][Class700_Sub43.anIntArray10955[i]++] = is;
					break;
				}
			}
		}
	}

	public static synchronized void method14349(byte[] is) {
		if (is.length == 100 && anInt8835 * 891302559 < 1000)
			aByteArrayArray8836[(anInt8835 += -512333473) * 891302559 - 1] = is;
		else if (5000 == is.length && anInt8834 * -1657017109 < 250)
			aByteArrayArray8837[(anInt8834 += -710321213) * -1657017109 - 1] = is;
		else if (is.length == 30000 && anInt8833 * -1480397203 < 50)
			aByteArrayArray8838[(anInt8833 += 1182157669) * -1480397203 - 1] = is;
		else if (null != aByteArrayArrayArray8840) {
			for (int i = 0; i < anIntArray8839.length; i++) {
				if (is.length == anIntArray8839[i] && (Class700_Sub43.anIntArray10955[i] < aByteArrayArrayArray8840[i].length)) {
					aByteArrayArrayArray8840[i][Class700_Sub43.anIntArray10955[i]++] = is;
					break;
				}
			}
		}
	}

	public static synchronized void method14350(byte[] is) {
		if (is.length == 100 && anInt8835 * 891302559 < 1000)
			aByteArrayArray8836[(anInt8835 += -512333473) * 891302559 - 1] = is;
		else if (5000 == is.length && anInt8834 * -1657017109 < 250)
			aByteArrayArray8837[(anInt8834 += -710321213) * -1657017109 - 1] = is;
		else if (is.length == 30000 && anInt8833 * -1480397203 < 50)
			aByteArrayArray8838[(anInt8833 += 1182157669) * -1480397203 - 1] = is;
		else if (null != aByteArrayArrayArray8840) {
			for (int i = 0; i < anIntArray8839.length; i++) {
				if (is.length == anIntArray8839[i] && (Class700_Sub43.anIntArray10955[i] < aByteArrayArrayArray8840[i].length)) {
					aByteArrayArrayArray8840[i][Class700_Sub43.anIntArray10955[i]++] = is;
					break;
				}
			}
		}
	}

	public static synchronized byte[] method14351(int i) {
		return method14340(i, false, -740746889);
	}

	public static synchronized byte[] method14352(int i) {
		return method14340(i, false, -740746889);
	}

	static final void method14353(int i, int i_8_) {
		if (Class189.method3666(i, null, -374584257))
			Class477.method7783((Class183.aClass240Array2100[i].aClass243Array2392), -1, 110323932);
	}

	static final void method14354(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = 529936607 * Class177.aClass527_Sub40_2048.anInt10721;
	}
}
