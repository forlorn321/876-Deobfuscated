/* Class392 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class392 implements Interface49 {
	public Class395 aClass395_4064;
	public Class399 aClass399_4065;
	public int anInt4066;
	public int anInt4067;
	public int anInt4068;
	public int anInt4069;
	public int anInt4070;
	public int anInt4071;
	public int anInt4072;

	public Class390 method343(byte i) {
		return null;
	}

	public Class390 method342() {
		return null;
	}

	public Class390 method344() {
		return null;
	}

	Class392(Class395 class395, Class399 class399, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
		aClass395_4064 = class395;
		aClass399_4065 = class399;
		anInt4066 = 1093586533 * i;
		anInt4069 = 1269124143 * i_0_;
		anInt4068 = i_1_ * 184733245;
		anInt4067 = i_2_ * -1611115061;
		anInt4070 = 24634371 * i_3_;
		anInt4071 = 1240423125 * i_4_;
		anInt4072 = 170057205 * i_5_;
	}

	public static final int method4863(int i, int i_6_, int i_7_) {
		if (-1 == i)
			return 12345678;
		i_6_ = (i & 0x7f) * i_6_ >> 7;
		if (i_6_ < 2)
			i_6_ = 2;
		else if (i_6_ > 126)
			i_6_ = 126;
		return (i & 0xff80) + i_6_;
	}

	static Class392 method4864(RSByteBuffer class536_sub33, int i) {
		Class395 class395 = (Class333_Sub3.method9230(1704986689)[class536_sub33.readUnsignedByte()]);
		Class399 class399 = (Class266.method3692(878827744)[class536_sub33.readUnsignedByte()]);
		int i_8_ = class536_sub33.readShort((byte) -60);
		int i_9_ = class536_sub33.readShort((byte) -39);
		int i_10_ = class536_sub33.readUnsignedShort();
		int i_11_ = class536_sub33.readUnsignedShort();
		int i_12_ = class536_sub33.readShort((byte) -110);
		int i_13_ = class536_sub33.readBigSmart();
		int i_14_ = class536_sub33.readInt();
		return new Class392(class395, class399, i_8_, i_9_, i_10_, i_11_, i_12_, i_13_, i_14_);
	}

	static final void method4865(Class668 class668, int i) {
		int i_15_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		Class603_Sub1 class603_sub1 = Class324.method4269(i_15_, 811550963);
		if (class603_sub1 != null) {
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -1176655995 * class603_sub1.worldFlags;
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = class603_sub1.worldActivity;
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = class603_sub1.method9615((byte) 104);
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = class603_sub1.method9616((byte) -111);
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -1880579507 * class603_sub1.online;
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = class603_sub1.anInt10558 * 2023817915;
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = class603_sub1.worldIp;
		} else {
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -1;
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = "";
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = "";
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = "";
		}
	}

	public static Class679[] method4866(byte i) {
		return (new Class679[] { Class679.aClass679_8629, Class679.aClass679_8630, Class679.aClass679_8626, Class679.aClass679_8632, Class679.aClass679_8627, Class679.aClass679_8628, Class679.aClass679_8631, Class679.aClass679_8633 });
	}

	public static int method4867(CharSequence charsequence, int i) {
		return Class171.method2428(charsequence, 10, true, 540172600);
	}

	static final void method4868(Class668 class668, int i) {
		int i_16_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		NPC class649_sub1_sub5_sub1_sub1 = ((NPC) class668.aClass649_Sub1_Sub5_Sub1_8554);
		int i_17_ = class649_sub1_sub5_sub1_sub1.method11070(i_16_, (byte) 82);
		int i_18_ = class649_sub1_sub5_sub1_sub1.method11071(i_16_, 295742203);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = i_17_;
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = i_18_;
	}
}
