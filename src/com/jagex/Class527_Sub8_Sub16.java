/* Class527_Sub8_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class527_Sub8_Sub16 extends Class527_Sub8 {
	static Class459 aClass459_11815;
	int anInt11816;
	byte[][] aByteArrayArray11817;
	Class164[] aClass164Array11818;

	public boolean method18382(int i) {
		return aClass164Array11818[i].aBool1826;
	}

	public boolean method18383(int i) {
		if (null != aClass164Array11818)
			return true;
		if (null == aByteArrayArray11817) {
			synchronized (aClass459_11815) {
				if (!aClass459_11815.method7552(anInt11816 * 2009392579, (byte) 109)) {
					boolean bool = false;
					return bool;
				}
				int[] is = aClass459_11815.method7486(anInt11816 * 2009392579, 2147483647);
				aByteArrayArray11817 = new byte[is.length][];
				for (int i_0_ = 0; i_0_ < is.length; i_0_++)
					aByteArrayArray11817[i_0_] = aClass459_11815.method7470(anInt11816 * 2009392579, is[i_0_], (byte) -46);
			}
		}
		boolean bool = true;
		for (int i_1_ = 0; i_1_ < aByteArrayArray11817.length; i_1_++) {
			byte[] is = aByteArrayArray11817[i_1_];
			RSByteBuffer class527_sub38 = new RSByteBuffer(is);
			class527_sub38.anInt10689 = 1474750881;
			int i_2_ = class527_sub38.readUnsignedShort();
			synchronized (Class238.aClass459_2389) {
				bool &= Class238.aClass459_2389.method7480(i_2_, 862715497);
			}
		}
		if (!bool)
			return false;
		Class694 class694 = new Class694();
		int[] is;
		synchronized (aClass459_11815) {
			int i_3_ = aClass459_11815.method7504(2009392579 * anInt11816, 1745153992);
			aClass164Array11818 = new Class164[i_3_];
			is = aClass459_11815.method7486(anInt11816 * 2009392579, 2147483647);
		}
		for (int i_4_ = 0; i_4_ < is.length; i_4_++) {
			byte[] is_5_ = aByteArrayArray11817[i_4_];
			RSByteBuffer class527_sub38 = new RSByteBuffer(is_5_);
			class527_sub38.anInt10689 = 1474750881;
			int i_6_ = class527_sub38.readUnsignedShort();
			Class527_Sub3 class527_sub3 = null;
			for (Class527_Sub3 class527_sub3_7_ = (Class527_Sub3) class694.method14081((short) -20887); class527_sub3_7_ != null; class527_sub3_7_ = (Class527_Sub3) class694.method14086(-65534)) {
				if (class527_sub3_7_.anInt10380 * 1546192369 == i_6_) {
					class527_sub3 = class527_sub3_7_;
					break;
				}
			}
			if (null == class527_sub3) {
				synchronized (Class238.aClass459_2389) {
					class527_sub3 = new Class527_Sub3(i_6_, Class238.aClass459_2389.method7512(i_6_, 1447980132));
				}
				class694.method14147(class527_sub3, -1768048436);
			}
			aClass164Array11818[is[i_4_]] = new Class164(is_5_, class527_sub3);
		}
		aByteArrayArray11817 = null;
		return true;
	}

	public boolean method18384(int i) {
		return aClass164Array11818[i].aBool1825;
	}

	public boolean method18385(int i, byte i_8_) {
		return aClass164Array11818[i].aBool1826;
	}

	public boolean method18386(int i, int i_9_) {
		return aClass164Array11818[i].aBool1827;
	}

	public boolean method18387(int i) {
		return aClass164Array11818[i].aBool1826;
	}

	public Class527_Sub8_Sub16(int i) {
		anInt11816 = i * -1106562325;
	}

	public boolean method18388() {
		if (null != aClass164Array11818)
			return true;
		if (null == aByteArrayArray11817) {
			synchronized (aClass459_11815) {
				if (!aClass459_11815.method7552(anInt11816 * 2009392579, (byte) 102)) {
					boolean bool = false;
					return bool;
				}
				int[] is = aClass459_11815.method7486(anInt11816 * 2009392579, 2147483647);
				aByteArrayArray11817 = new byte[is.length][];
				for (int i = 0; i < is.length; i++)
					aByteArrayArray11817[i] = aClass459_11815.method7470(anInt11816 * 2009392579, is[i], (byte) -62);
			}
		}
		boolean bool = true;
		for (int i = 0; i < aByteArrayArray11817.length; i++) {
			byte[] is = aByteArrayArray11817[i];
			RSByteBuffer class527_sub38 = new RSByteBuffer(is);
			class527_sub38.anInt10689 = 1474750881;
			int i_10_ = class527_sub38.readUnsignedShort();
			synchronized (Class238.aClass459_2389) {
				bool &= Class238.aClass459_2389.method7480(i_10_, -147961351);
			}
		}
		if (!bool)
			return false;
		Class694 class694 = new Class694();
		int[] is;
		synchronized (aClass459_11815) {
			int i = aClass459_11815.method7504(2009392579 * anInt11816, -1349732393);
			aClass164Array11818 = new Class164[i];
			is = aClass459_11815.method7486(anInt11816 * 2009392579, 2147483647);
		}
		for (int i = 0; i < is.length; i++) {
			byte[] is_11_ = aByteArrayArray11817[i];
			RSByteBuffer class527_sub38 = new RSByteBuffer(is_11_);
			class527_sub38.anInt10689 = 1474750881;
			int i_12_ = class527_sub38.readUnsignedShort();
			Class527_Sub3 class527_sub3 = null;
			for (Class527_Sub3 class527_sub3_13_ = (Class527_Sub3) class694.method14081((short) -9830); class527_sub3_13_ != null; class527_sub3_13_ = (Class527_Sub3) class694.method14086(-65534)) {
				if (class527_sub3_13_.anInt10380 * 1546192369 == i_12_) {
					class527_sub3 = class527_sub3_13_;
					break;
				}
			}
			if (null == class527_sub3) {
				synchronized (Class238.aClass459_2389) {
					class527_sub3 = new Class527_Sub3(i_12_, (Class238.aClass459_2389.method7512(i_12_, 1447980132)));
				}
				class694.method14147(class527_sub3, -946398441);
			}
			aClass164Array11818[is[i]] = new Class164(is_11_, class527_sub3);
		}
		aByteArrayArray11817 = null;
		return true;
	}

	public boolean method18389(int i) {
		return aClass164Array11818[i].aBool1825;
	}

	public static void method18390(Class459 class459, Class459 class459_14_, int i) {
		aClass459_11815 = class459;
		Class238.aClass459_2389 = class459_14_;
	}

	public boolean method18391(int i) {
		return aClass164Array11818[i].aBool1825;
	}

	public boolean method18392(int i) {
		return aClass164Array11818[i].aBool1825;
	}

	public boolean method18393(int i, byte i_15_) {
		return aClass164Array11818[i].aBool1825;
	}

	public boolean method18394(int i) {
		return aClass164Array11818[i].aBool1826;
	}

	public static void method18395(Class459 class459, Class459 class459_16_, int i) {
		aClass459_11815 = class459;
		Class238.aClass459_2389 = class459_16_;
	}

	public boolean method18396(int i) {
		return aClass164Array11818[i].aBool1826;
	}

	public boolean method18397(int i) {
		return aClass164Array11818[i].aBool1827;
	}

	public boolean method18398(int i) {
		return aClass164Array11818[i].aBool1827;
	}

	static void method18399(byte i) {
		/* empty */
	}
}
