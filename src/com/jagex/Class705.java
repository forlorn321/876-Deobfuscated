/* Class705 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class705 {
	static byte[][] aByteArrayArray8812;
	static int anInt8813 = 0;
	static int anInt8814;
	static byte[][] aByteArrayArray8815;
	static int[] anIntArray8816;
	static byte[][] aByteArrayArray8817;
	static int anInt8818 = 0;
	static int[] anIntArray8819;
	static byte[][][] aByteArrayArrayArray8820;

	public static synchronized byte[] method8268(int i, int i_0_) {
		return method8269(i, false, 1420982086);
	}

	public static synchronized byte[] method8269(int i, boolean bool, int i_1_) {
		if ((i == 100 || i < 100 && bool) && -948976061 * anInt8813 > 0) {
			byte[] is = aByteArrayArray8815[(anInt8813 -= -984467861) * -948976061];
			aByteArrayArray8815[anInt8813 * -948976061] = null;
			return is;
		}
		if ((5000 == i || i < 5000 && bool) && anInt8818 * -278565465 > 0) {
			byte[] is = aByteArrayArray8812[(anInt8818 -= -1255904745) * -278565465];
			aByteArrayArray8812[-278565465 * anInt8818] = null;
			return is;
		}
		if ((i == 30000 || i < 30000 && bool) && -1473954337 * anInt8814 > 0) {
			byte[] is = aByteArrayArray8817[(anInt8814 -= 1320074783) * -1473954337];
			aByteArrayArray8817[-1473954337 * anInt8814] = null;
			return is;
		}
		if (null != aByteArrayArrayArray8820) {
			for (int i_2_ = 0; i_2_ < anIntArray8816.length; i_2_++) {
				if ((i == anIntArray8816[i_2_] || i < anIntArray8816[i_2_] && bool) && anIntArray8819[i_2_] > 0) {
					byte[] is = (aByteArrayArrayArray8820[i_2_][--anIntArray8819[i_2_]]);
					aByteArrayArrayArray8820[i_2_][anIntArray8819[i_2_]] = null;
					return is;
				}
			}
		}
		if (bool && null != anIntArray8816) {
			for (int i_3_ = 0; i_3_ < anIntArray8816.length; i_3_++) {
				if (i <= anIntArray8816[i_3_] && (anIntArray8819[i_3_] < aByteArrayArrayArray8820[i_3_].length))
					return new byte[anIntArray8816[i_3_]];
			}
		}
		return new byte[i];
	}

	public static synchronized void method8270(byte[] is, int i) {
		if (is.length == 100 && -948976061 * anInt8813 < 1000)
			aByteArrayArray8815[(anInt8813 += -984467861) * -948976061 - 1] = is;
		else if (5000 == is.length && -278565465 * anInt8818 < 250)
			aByteArrayArray8812[(anInt8818 += -1255904745) * -278565465 - 1] = is;
		else if (is.length == 30000 && -1473954337 * anInt8814 < 50)
			aByteArrayArray8817[(anInt8814 += 1320074783) * -1473954337 - 1] = is;
		else if (aByteArrayArrayArray8820 != null) {
			for (int i_4_ = 0; i_4_ < anIntArray8816.length; i_4_++) {
				if (anIntArray8816[i_4_] == is.length && (anIntArray8819[i_4_] < aByteArrayArrayArray8820[i_4_].length)) {
					aByteArrayArrayArray8820[i_4_][anIntArray8819[i_4_]++] = is;
					break;
				}
			}
		}
	}

	static {
		anInt8814 = 0;
		aByteArrayArray8815 = new byte[1000][];
		aByteArrayArray8812 = new byte[250][];
		aByteArrayArray8817 = new byte[50][];
	}

	Class705() throws Throwable {
		throw new Error();
	}

	public static synchronized byte[] method8271(int i) {
		return method8269(i, false, 2070366434);
	}

	public static synchronized void method8272(byte[] is) {
		if (is.length == 100 && -948976061 * anInt8813 < 1000)
			aByteArrayArray8815[(anInt8813 += -984467861) * -948976061 - 1] = is;
		else if (5000 == is.length && -278565465 * anInt8818 < 250)
			aByteArrayArray8812[(anInt8818 += -1255904745) * -278565465 - 1] = is;
		else if (is.length == 30000 && -1473954337 * anInt8814 < 50)
			aByteArrayArray8817[(anInt8814 += 1320074783) * -1473954337 - 1] = is;
		else if (aByteArrayArrayArray8820 != null) {
			for (int i = 0; i < anIntArray8816.length; i++) {
				if (anIntArray8816[i] == is.length && (anIntArray8819[i] < aByteArrayArrayArray8820[i].length)) {
					aByteArrayArrayArray8820[i][anIntArray8819[i]++] = is;
					break;
				}
			}
		}
	}

	static final void method8273(Class668 class668, byte i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class710.aClass536_Sub40_8843.aClass710_Sub25_10735.method10141(481974905) ? 1 : 0;
	}

	static final void method8274(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		Class251 class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class560.method6824(class251, class234, class668, -2144257166);
	}

	public static Class392 method8275(RSByteBuffer class536_sub33, int i) {
		Class392 class392 = Class392.method4864(class536_sub33, 277638295);
		int i_5_ = class536_sub33.readInt(-1012160213);
		int i_6_ = class536_sub33.readInt(-812563541);
		int i_7_ = class536_sub33.method9720((byte) 1);
		return new Class392_Sub2(class392.aClass395_4064, class392.aClass399_4065, class392.anInt4066 * 316945261, class392.anInt4069 * 1917287119, class392.anInt4068 * -1755858667, -840030237 * class392.anInt4067, -2068781397 * class392.anInt4070, class392.anInt4071 * 1694830205, -369678755 * class392.anInt4072, i_5_, i_6_, i_7_);
	}

	public static void method8276(String string, int i) {
		if (client.aBool11188 && 0 != (1686601581 * Class511.anInt6931 & 0x18)) {
			boolean bool = false;
			int i_8_ = -1482773169 * Class95.anInt1156;
			int[] is = Class95.anIntArray1157;
			for (int i_9_ = 0; i_9_ < i_8_; i_9_++) {
				Class649_Sub1_Sub5_Sub1_Sub2 class649_sub1_sub5_sub1_sub2 = client.aClass649_Sub1_Sub5_Sub1_Sub2Array11155[is[i_9_]];
				if (null != class649_sub1_sub5_sub1_sub2.aString12184 && class649_sub1_sub5_sub1_sub2.aString12184.equalsIgnoreCase(string) && (((class649_sub1_sub5_sub1_sub2 == Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591) && (Class511.anInt6931 * 1686601581 & 0x10) != 0) || 0 != (1686601581 * Class511.anInt6931 & 0x8))) {
					Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.aClass414_4487, (client.aClass106_11322.aClass15_1258), 1682496297);
					class536_sub23.aClass536_Sub33_Sub2_10528.writeShort128(client.anInt11184 * -678599443, (byte) 0);
					class536_sub23.aClass536_Sub33_Sub2_10528.method9728(0, (byte) 125);
					class536_sub23.aClass536_Sub33_Sub2_10528.writeIntV2(Class663.anInt8515 * 1625551467, (byte) 56);
					class536_sub23.aClass536_Sub33_Sub2_10528.writeLEShort(is[i_9_], -1411037171);
					class536_sub23.aClass536_Sub33_Sub2_10528.writeLEShort(-1059472497 * client.anInt11183, -1411037171);
					client.aClass106_11322.method1409(class536_sub23, 1390331548);
					Class205_Sub17.method9089((class649_sub1_sub5_sub1_sub2.anIntArray11944[0]), (class649_sub1_sub5_sub1_sub2.anIntArray11945[0]), (byte) -94);
					bool = true;
					break;
				}
			}
			if (!bool)
				Class173_Sub1.method8634(4, new StringBuilder().append(Class38.aClass38_431.method840(Class459.aClass664_5178, 1968862526)).append(string).toString(), -1476606329);
			if (client.aBool11188)
				Class270.method3717(-1586741064);
		}
	}
}
