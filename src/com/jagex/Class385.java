/* Class385 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class385 implements Interface47 {
	public int anInt3950;
	public Class384 aClass384_3951;
	public int anInt3952;
	public int anInt3953;
	public int anInt3954;
	public int anInt3955;
	public int anInt3956;
	public int anInt3957;
	public boolean aBool3958;
	public int anInt3959;
	public Class400 aClass400_3960;
	static String aString3961;

	public static Class385 method6425(RSByteBuffer class527_sub38) {
		int i = class527_sub38.readUnsignedByte();
		Class400 class400 = (Class183.method3556(1991291118)[class527_sub38.readUnsignedByte()]);
		Class384 class384 = (Class644.method10743(-1015693904)[class527_sub38.readUnsignedByte()]);
		int i_0_ = class527_sub38.readShort();
		int i_1_ = class527_sub38.readShort();
		int i_2_ = class527_sub38.readUnsignedShort();
		int i_3_ = class527_sub38.readUnsignedShort();
		int i_4_ = class527_sub38.readInt();
		int i_5_ = class527_sub38.readInt();
		int i_6_ = class527_sub38.readInt();
		boolean bool = class527_sub38.readUnsignedByte() == 1;
		return new Class385(i, class400, class384, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_, i_6_, bool);
	}

	public Class396 method334(int i) {
		return Class396.aClass396_4117;
	}

	Class385(int i, Class400 class400, Class384 class384, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, boolean bool) {
		anInt3953 = -123553055 * i;
		aClass400_3960 = class400;
		aClass384_3951 = class384;
		anInt3952 = 1176098341 * i_7_;
		anInt3959 = 1823380875 * i_8_;
		anInt3957 = i_9_ * -903883627;
		anInt3950 = 1171114875 * i_10_;
		anInt3954 = -1182265931 * i_11_;
		anInt3955 = 669103953 * i_12_;
		anInt3956 = i_13_ * 1448482729;
		aBool3958 = bool;
	}

	public Class396 method333() {
		return Class396.aClass396_4117;
	}

	public static Class385 method6426(RSByteBuffer class527_sub38) {
		int i = class527_sub38.readUnsignedByte();
		Class400 class400 = (Class183.method3556(682227256)[class527_sub38.readUnsignedByte()]);
		Class384 class384 = (Class644.method10743(-1015693904)[class527_sub38.readUnsignedByte()]);
		int i_14_ = class527_sub38.readShort();
		int i_15_ = class527_sub38.readShort();
		int i_16_ = class527_sub38.readUnsignedShort();
		int i_17_ = class527_sub38.readUnsignedShort();
		int i_18_ = class527_sub38.readInt();
		int i_19_ = class527_sub38.readInt();
		int i_20_ = class527_sub38.readInt();
		boolean bool = class527_sub38.readUnsignedByte() == 1;
		return new Class385(i, class400, class384, i_14_, i_15_, i_16_, i_17_, i_18_, i_19_, i_20_, bool);
	}

	public static Class385 method6427(RSByteBuffer class527_sub38) {
		int i = class527_sub38.readUnsignedByte();
		Class400 class400 = (Class183.method3556(-1364462319)[class527_sub38.readUnsignedByte()]);
		Class384 class384 = (Class644.method10743(-1015693904)[class527_sub38.readUnsignedByte()]);
		int i_21_ = class527_sub38.readShort();
		int i_22_ = class527_sub38.readShort();
		int i_23_ = class527_sub38.readUnsignedShort();
		int i_24_ = class527_sub38.readUnsignedShort();
		int i_25_ = class527_sub38.readInt();
		int i_26_ = class527_sub38.readInt();
		int i_27_ = class527_sub38.readInt();
		boolean bool = class527_sub38.readUnsignedByte() == 1;
		return new Class385(i, class400, class384, i_21_, i_22_, i_23_, i_24_, i_25_, i_26_, i_27_, bool);
	}

	static final void method6428(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = client.aBool11034 ? 1 : 0;
	}

	static int method6429(Class604_Sub1 class604_sub1, Class604_Sub1 class604_sub1_28_, int i, boolean bool, int i_29_, boolean bool_30_, byte i_31_) {
		int i_32_ = Class501.method8193(class604_sub1, class604_sub1_28_, i, bool, -614294691);
		if (0 != i_32_) {
			if (bool)
				return -i_32_;
			return i_32_;
		}
		if (-1 == i_29_)
			return 0;
		int i_33_ = Class501.method8193(class604_sub1, class604_sub1_28_, i_29_, bool_30_, -614294691);
		if (bool_30_)
			return -i_33_;
		return i_33_;
	}

	static final void method6430(Class665 class665, int i) {
		int i_34_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_34_, 1028545737);
		Class240 class240 = Class183.aClass240Array2100[i_34_ >> 16];
		Class273.method5121(class243, class240, class665, 1639777797);
	}

	public static void method6431(byte i) {
		if (-1 != Class3.aClass13_41.anInt181 * 44791937)
			Class645.method10747(44791937 * Class3.aClass13_41.anInt181, Class3.aClass13_41.aString178, Class3.aClass13_41.anInt179 * 375656933, Class3.aClass13_41.anInt180 * -941127567, -735096978);
	}
}
