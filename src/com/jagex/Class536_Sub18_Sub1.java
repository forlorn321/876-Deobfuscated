/* Class536_Sub18_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class536_Sub18_Sub1 extends Class536_Sub18 implements DefinitionI, Interface7 {
	public int anInt11327 = 0;
	public int[] anIntArray11328;
	public int[] anIntArray11329;
	public int anInt11330 = 0;

	void method10477(RSByteBuffer class536_sub33, int i) {
		if (i == 2)
			anInt11330 = class536_sub33.readUnsignedShort() * -1858511933;
		else if (4 == i) {
			anInt11327 = class536_sub33.readUnsignedByte() * -1264944693;
			anIntArray11328 = new int[anInt11327 * -1103764509];
			anIntArray11329 = new int[anInt11327 * -1103764509];
			for (int i_0_ = 0; i_0_ < anInt11327 * -1103764509; i_0_++) {
				anIntArray11328[i_0_] = class536_sub33.readUnsignedShort();
				anIntArray11329[i_0_] = class536_sub33.readUnsignedShort();
			}
		}
	}

	Class536_Sub18_Sub1() {
		/* empty */
	}

	void method10478(RSByteBuffer class536_sub33, int i, byte i_1_) {
		if (i == 2)
			anInt11330 = class536_sub33.readUnsignedShort() * -1858511933;
		else if (4 == i) {
			anInt11327 = class536_sub33.readUnsignedByte() * -1264944693;
			anIntArray11328 = new int[anInt11327 * -1103764509];
			anIntArray11329 = new int[anInt11327 * -1103764509];
			for (int i_2_ = 0; i_2_ < anInt11327 * -1103764509; i_2_++) {
				anIntArray11328[i_2_] = class536_sub33.readUnsignedShort();
				anIntArray11329[i_2_] = class536_sub33.readUnsignedShort();
			}
		}
	}

	public void method74(RSByteBuffer class536_sub33, int i) {
		for (;;) {
			int i_3_ = class536_sub33.readUnsignedByte();
			if (0 == i_3_)
				break;
			method10478(class536_sub33, i_3_, (byte) 8);
		}
	}

	public void method59(int i, int i_4_) {
		/* empty */
	}

	public void method75(byte i) {
		/* empty */
	}

	public void method57(int i) {
		/* empty */
	}

	public void method76(RSByteBuffer class536_sub33) {
		for (;;) {
			int i = class536_sub33.readUnsignedByte();
			if (0 == i)
				break;
			method10478(class536_sub33, i, (byte) 8);
		}
	}

	public void method58(int i) {
		/* empty */
	}

	public void method56(int i) {
		/* empty */
	}

	public void method77() {
		/* empty */
	}

	static final void method10479(InterfaceDefinitions class251, Class234 class234, Class668 class668, byte i) {
		class251.fontMono = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]) == 1;
		Class668.method8011(class251, 263642117);
		if (-1 == class251.anInt2546 * -809980533 && !class234.aBool2379)
			Class665.method8001(class251.anInt2559 * -1591767037, (byte) -19);
	}

	public static Class177 method10480(Class167 class167, int i, int i_5_, int i_6_, int i_7_, Class177 class177, short i_8_, byte i_9_, Class688 class688, int i_10_) {
		if (null == class177)
			return null;
		int i_11_ = 2055;
		if (null != class688) {
			i_11_ |= class688.method8162((byte) 13);
			i_11_ &= ~0x200;
		}
		long l = (long) ((i_8_ & 0xffff) << 8 | i_9_);
		Class177 class177_12_;
		synchronized (Class49.aClass199_580) {
			class177_12_ = (Class177) Class49.aClass199_580.method2886(l);
		}
		if (null == class177_12_ || class167.method2308(class177_12_.method2466(), i_11_) != 0) {
			if (null != class177_12_)
				i_11_ = class167.method2068(i_11_, class177_12_.method2466());
			Class180 class180 = new Class180(4, 2, 2);
			int i_13_ = 128;
			int[] is = new int[4];
			is[0] = class180.method2697(-i_13_, 0, -i_13_);
			is[1] = class180.method2697(i_13_, 0, -i_13_);
			is[2] = class180.method2697(i_13_, 0, i_13_);
			is[3] = class180.method2697(-i_13_, 0, i_13_);
			class180.method2706(0, 1, 2, (byte) 1, (byte) 0, (short) 0, i_9_, i_8_);
			class180.method2706(0, 2, 3, (byte) 1, (byte) 0, (short) 0, i_9_, i_8_);
			class180.method2699((short) 1, (short) 2, (short) 0);
			class180.method2699((short) 2, (short) 3, (short) 0);
			class177_12_ = class167.method2093(class180, i_11_, Class588.anInt7740 * 1185333419, 64, 768);
			synchronized (Class49.aClass199_580) {
				Class49.aClass199_580.method2881(class177_12_, l);
			}
		}
		int i_14_ = class177.method2563();
		int i_15_ = class177.method2483();
		int i_16_ = class177.method2498();
		int i_17_ = class177.method2499();
		if (null != class688) {
			class177_12_ = class177_12_.method2623((byte) 3, i_11_, true);
			class177_12_.method2474(i_15_ - i_14_ >> 1, 128, i_17_ - i_16_ >> 1);
			class177_12_.method2472(i_14_ + i_15_ >> 1, 0, i_16_ + i_17_ >> 1);
			class688.method8119(class177_12_, (byte) 64);
		} else {
			class177_12_ = class177_12_.method2623((byte) 3, i_11_, true);
			class177_12_.method2474(i_15_ - i_14_ >> 1, 128, i_17_ - i_16_ >> 1);
			class177_12_.method2472(i_14_ + i_15_ >> 1, 0, i_16_ + i_17_ >> 1);
		}
		if (i_5_ != 0)
			class177_12_.method2457(i_5_);
		if (0 != i_6_)
			class177_12_.method2529(i_6_);
		if (0 != i_7_)
			class177_12_.method2472(0, i_7_, 0);
		return class177_12_;
	}
}
