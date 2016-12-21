/* Class205_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class205_Sub8 extends Class205 {
	int anInt9879;
	int anInt9880;
	int anInt9881;
	int anInt9882;
	int anInt9883;
	public static int anInt9884;

	public void method2942() {
		Class649_Sub1_Sub5_Sub1 class649_sub1_sub5_sub1 = Class193.aClass189Array2180[-118036407 * anInt9881].method2804(1262375275);
		class649_sub1_sub5_sub1.method10871(anInt9880 * -707257751, anInt9879 * 1108698443, -2083536773 * anInt9882, -2059764745 * anInt9883, client.anInt11014, 0, 2035266174);
	}

	public void method2940(int i) {
		Class649_Sub1_Sub5_Sub1 class649_sub1_sub5_sub1 = Class193.aClass189Array2180[-118036407 * anInt9881].method2804(-1408750290);
		class649_sub1_sub5_sub1.method10871(anInt9880 * -707257751, anInt9879 * 1108698443, -2083536773 * anInt9882, -2059764745 * anInt9883, client.anInt11014, 0, 2052421751);
	}

	Class205_Sub8(RSByteBuffer class536_sub33) {
		super(class536_sub33);
		anInt9881 = class536_sub33.readUnsignedShort() * -482244103;
		int i = class536_sub33.readUnsignedByte();
		if (0 != (i & 0x1)) {
			anInt9880 = class536_sub33.readUnsignedShort() * 428807641;
			anInt9879 = class536_sub33.readUnsignedShort() * -678626205;
		} else {
			anInt9880 = -428807641;
			anInt9879 = 678626205;
		}
		if (0 != (i & 0x2)) {
			anInt9882 = class536_sub33.readUnsignedShort() * -349561165;
			anInt9883 = class536_sub33.readUnsignedShort() * 943502791;
		} else {
			anInt9882 = 349561165;
			anInt9883 = -943502791;
		}
		if ((i & 0x4) != 0) {
			int i_0_ = class536_sub33.readUnsignedShort();
			int i_1_ = class536_sub33.readUnsignedShort();
			int i_2_ = 255 * i_0_ / i_1_;
			if (i_0_ > 0 && i_2_ < 1) {
				boolean bool = true;
			}
		}
	}

	public void method2943() {
		Class649_Sub1_Sub5_Sub1 class649_sub1_sub5_sub1 = Class193.aClass189Array2180[-118036407 * anInt9881].method2804(-1232192249);
		class649_sub1_sub5_sub1.method10871(anInt9880 * -707257751, anInt9879 * 1108698443, -2083536773 * anInt9882, -2059764745 * anInt9883, client.anInt11014, 0, 2076021363);
	}

	static final void method9063(Class668 class668, int i) {
		int i_3_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		if (Class707.aBool8822) {
			Class697[] class697s = Class385.method4841((byte) -79);
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = class697s[i_3_].anInt8744 * -1090373425;
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 832859273 * class697s[i_3_].anInt8743;
		} else {
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
		}
	}
}
