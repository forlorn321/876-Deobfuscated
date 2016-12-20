/* Class447 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class447 implements Interface5 {
	Class459 aClass459_4929;
	static int anInt4930;

	public Class48 method47() {
		return Class48.aClass48_501;
	}

	public int method45(byte i) {
		if (aClass459_4929.method7482(-614933937))
			return 100;
		return aClass459_4929.method7484(2050437652);
	}

	public Class48 method49(int i) {
		return Class48.aClass48_501;
	}

	Class447(Class459 class459) {
		aClass459_4929 = class459;
	}

	public Class48 method48() {
		return Class48.aClass48_501;
	}

	public Class48 method50() {
		return Class48.aClass48_501;
	}

	public int method6() {
		if (aClass459_4929.method7482(110615777))
			return 100;
		return aClass459_4929.method7484(321114429);
	}

	public int method7() {
		if (aClass459_4929.method7482(-237412426))
			return 100;
		return aClass459_4929.method7484(1134963559);
	}

	public int method46() {
		if (aClass459_4929.method7482(-1518733494))
			return 100;
		return aClass459_4929.method7484(832489943);
	}

	public int method51() {
		if (aClass459_4929.method7482(61783422))
			return 100;
		return aClass459_4929.method7484(2067694256);
	}

	static long method7257(int i) {
		return Class170.aClass517_1880.method8614((byte) -100);
	}

	static final void method7258(Class665 class665, int i) {
		class665.anInt8526 -= 511904205;
		int i_0_ = class665.anIntArray8525[1769813785 * class665.anInt8526];
		int i_1_ = class665.anIntArray8525[1 + class665.anInt8526 * 1769813785];
		int i_2_ = class665.anIntArray8525[2 + 1769813785 * class665.anInt8526];
		int i_3_ = class665.anIntArray8525[3 + 1769813785 * class665.anInt8526];
		int i_4_ = class665.anIntArray8525[class665.anInt8526 * 1769813785 + 4];
		Class245.aClass226_2698.method4218(Class193.aClass193_2150, i_0_, i_1_, i_3_, Class206.aClass206_2228.method3836(1150263446), Class189.aClass189_2126, 0.0F, 0.0F, null, 0, i_4_, i_2_, -824512385);
	}

	static final void method7259(Class665 class665, int i) {
		long l = (class665.aLongArray8529[(class665.anInt8530 -= 32636613) * -2076258291]);
		class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = l == -1L ? "" : Long.toString(l, 36).toUpperCase();
	}

	public static Class243 method7260(int i, int i_5_, int i_6_) {
		Class243 class243 = Class648.method10837(i, 729681275);
		if (i_5_ == -1)
			return class243;
		if (class243 == null || null == class243.aClass243Array2665 || i_5_ >= class243.aClass243Array2665.length)
			return null;
		return class243.aClass243Array2665[i_5_];
	}

	static void method7261(Class527_Sub33 class527_sub33, int i, int i_7_) {
		Object[] objects = class527_sub33.anObjectArray10650;
		int i_8_ = ((Integer) objects[0]).intValue();
		Class527_Sub8_Sub10 class527_sub8_sub10 = Class282.method5195(i_8_, 713415995);
		if (class527_sub8_sub10 != null) {
			Class665 class665 = Class383.method6409((byte) -69);
			class665.anIntArray8546 = new int[class527_sub8_sub10.anInt11726 * -1228779449];
			int i_9_ = 0;
			class665.anObjectArray8524 = new String[class527_sub8_sub10.anInt11727 * 1563313657];
			int i_10_ = 0;
			class665.aLongArray8547 = new long[-1600507105 * class527_sub8_sub10.anInt11721];
			int i_11_ = 0;
			for (int i_12_ = 1; i_12_ < objects.length; i_12_++) {
				if (objects[i_12_] instanceof Integer) {
					int i_13_ = ((Integer) objects[i_12_]).intValue();
					if (-2147483647 == i_13_)
						i_13_ = 1866171449 * class527_sub33.anInt10649;
					if (-2147483646 == i_13_)
						i_13_ = -1191036419 * class527_sub33.anInt10647;
					if (i_13_ == -2147483645)
						i_13_ = (class527_sub33.aClass243_10648 != null ? (class527_sub33.aClass243_10648.anInt2504 * -254728301) : -1);
					if (-2147483644 == i_13_)
						i_13_ = class527_sub33.anInt10651 * 219745877;
					if (-2147483643 == i_13_)
						i_13_ = (class527_sub33.aClass243_10648 != null ? (class527_sub33.aClass243_10648.anInt2675 * -927924265) : -1);
					if (i_13_ == -2147483642)
						i_13_ = (null != class527_sub33.aClass243_10652 ? (class527_sub33.aClass243_10652.anInt2504 * -254728301) : -1);
					if (i_13_ == -2147483641)
						i_13_ = (null != class527_sub33.aClass243_10652 ? (class527_sub33.aClass243_10652.anInt2675 * -927924265) : -1);
					if (i_13_ == -2147483640)
						i_13_ = class527_sub33.anInt10653 * 382205147;
					if (i_13_ == -2147483639)
						i_13_ = 1135927417 * class527_sub33.anInt10654;
					class665.anIntArray8546[i_9_++] = i_13_;
				} else if (objects[i_12_] instanceof String) {
					String string = (String) objects[i_12_];
					if (string.equals("event_opbase"))
						string = class527_sub33.aString10655;
					class665.anObjectArray8524[i_10_++] = string;
				} else if (objects[i_12_] instanceof Long) {
					long l = ((Long) objects[i_12_]).longValue();
					class665.aLongArray8547[i_11_++] = l;
				}
			}
			class665.anInt8543 = -268074749 * class527_sub33.anInt10656;
			Class208_Sub17.method15631(class527_sub8_sub10, i, class665, 1005372970);
			class665.anInt8543 = 0;
		}
	}
}
