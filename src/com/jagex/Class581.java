/* Class581 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class581 implements Interface76 {
	static Class581 aClass581_7674 = new Class581(0);
	public static Class581 aClass581_7675 = new Class581(1);
	int anInt7676;
	public static Class22 aClass22_7677;

	public int method42() {
		return anInt7676 * 811411869;
	}

	public int method87() {
		return anInt7676 * 811411869;
	}

	public int method91() {
		return anInt7676 * 811411869;
	}

	static Class581[] method9664() {
		return new Class581[] { aClass581_7674, aClass581_7675 };
	}

	static Class581[] method9665() {
		return new Class581[] { aClass581_7674, aClass581_7675 };
	}

	Class581(int i) {
		anInt7676 = i * -997350219;
	}

	public static Class22 method9666(Class459 class459, int i, Interface2 interface2, byte i_0_) {
		byte[] is = class459.method7512(i, 1447980132);
		if (null == is)
			return null;
		return new Class22(is, interface2);
	}

	public static Class392 method9667(RSByteBuffer class527_sub38, int i) {
		Class400 class400 = (Class183.method3556(-1217941132)[class527_sub38.readUnsignedByte()]);
		Class384 class384 = (Class644.method10743(-1015693904)[class527_sub38.readUnsignedByte()]);
		int i_1_ = class527_sub38.readShort();
		int i_2_ = class527_sub38.readShort();
		int i_3_ = class527_sub38.method16466(-1604957753);
		int i_4_ = class527_sub38.readInt();
		int i_5_ = class527_sub38.readUnsignedByte();
		return new Class392(class400, class384, i_1_, i_2_, i_3_, i_4_, i_5_);
	}

	public static void method9668(byte i) {
		if (client.anInt11048 * -1927019389 == 16 && (!Class266.method5045((byte) 1) && !Class472.method7739(1853897047)))
			Class78.method1560(13, (byte) 0);
	}

	static final void method9669(int i, int[] is, byte i_6_) {
		if (Class189.method3666(i, is, -374584257)) {
			Class243[] class243s = Class183.aClass240Array2100[i].aClass243Array2392;
			for (int i_7_ = 0; i_7_ < class243s.length; i_7_++) {
				Class243 class243 = class243s[i_7_];
				if (null != class243 && class243.aClass695_2664 != null)
					class243.aClass695_2664.method14179(1014236581);
			}
		}
	}
}
