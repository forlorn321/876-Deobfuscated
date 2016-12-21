/* Class463 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class463 implements Interface75 {
	static Class463 aClass463_5221;
	static Class463 aClass463_5222 = new Class463("UNCOMPRESSED", 0);
	int anInt5223;
	static Class463 aClass463_5224;
	String aString5225;
	static Class463 aClass463_5226;
	public static Class234[] aClass234Array5227;

	public int method73() {
		return -1233655929 * anInt5223;
	}

	static Class463[] method5621(int i) {
		return new Class463[] { aClass463_5221, aClass463_5226, aClass463_5224, aClass463_5222 };
	}

	public int method78() {
		return -1233655929 * anInt5223;
	}

	static {
		aClass463_5221 = new Class463("BZIP2", 1);
		aClass463_5226 = new Class463("GZIP", 2);
		aClass463_5224 = new Class463("LZMA", 3);
	}

	public int method12() {
		return -1233655929 * anInt5223;
	}

	Class463(String string, int i) {
		aString5225 = string;
		anInt5223 = i * 755314231;
	}

	static final void method5622(Class668 class668, byte i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.aClass62_11940.method1047((byte) 16) >> 3;
	}

	static final void method5623(Class668 class668, int i) {
		int i_0_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = client.aClass231_11088.method3300(i_0_, (byte) -81);
	}

	static final void method5624(Class668 class668, int i) {
		Class598 class598 = new Class598();
		class598.method7144((Class536_Sub30) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]), 2105799882);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = class598.method7145((byte) 35);
	}

	public static Class543 method5625(Class461 class461, String string, boolean bool, int i) {
		int i_1_ = class461.method5571(string, -1584890252);
		if (-1 == i_1_)
			return new Class543(0);
		byte[] is = class461.method5556(i_1_, 1, (byte) 1);
		if (null == is)
			return new Class543(0);
		RSByteBuffer class536_sub33 = new RSByteBuffer(is);
		int i_2_ = class536_sub33.readUnsignedShort();
		Class543 class543 = new Class543(i_2_);
		int i_3_ = 0;
		while (i_3_ < class543.anInt7234 * -1605869619) {
			int i_4_ = class536_sub33.readInt();
			int i_5_ = class536_sub33.readUnsignedShort();
			int i_6_ = class536_sub33.readUnsignedByte();
			if (bool || 1 != i_6_) {
				class543.anIntArray7235[i_3_] = i_4_;
				class543.anIntArray7236[i_3_] = i_5_;
				i_3_++;
			} else
				class543.anInt7234 -= -1355569915;
		}
		return class543;
	}
}
