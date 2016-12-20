/* Class208_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class208_Sub2 extends Class208 {
	int anInt9863;
	int anInt9864;
	int anInt9865;
	int anInt9866;
	int anInt9867;
	public static Class24 aClass24_9868;

	public void method3848() {
		Class352.method6212(anInt9864 * 1767036663, -1732132781 * anInt9865, anInt9863 * 1571146039, 100, 100, false, (byte) 24);
		Class570.method9598(-327632721 * anInt9866, anInt9867 * -361026083, 0, -1944295345);
		client.aBool11081 = true;
	}

	public void method3846(int i) {
		Class352.method6212(anInt9864 * 1767036663, -1732132781 * anInt9865, anInt9863 * 1571146039, 100, 100, false, (byte) -18);
		Class570.method9598(-327632721 * anInt9866, anInt9867 * -361026083, 0, -1944295345);
		client.aBool11081 = true;
	}

	public void method3851() {
		Class352.method6212(anInt9864 * 1767036663, -1732132781 * anInt9865, anInt9863 * 1571146039, 100, 100, false, (byte) 14);
		Class570.method9598(-327632721 * anInt9866, anInt9867 * -361026083, 0, -1944295345);
		client.aBool11081 = true;
	}

	Class208_Sub2(RSByteBuffer class527_sub38) {
		super(class527_sub38);
		anInt9864 = class527_sub38.readUnsignedShort() * 1776601799;
		anInt9863 = class527_sub38.readUnsignedShort() * 1575369863;
		anInt9865 = class527_sub38.readUnsignedShort() * -585989157;
		anInt9866 = class527_sub38.readUnsignedShort() * 1378721359;
		anInt9867 = class527_sub38.readUnsignedShort() * 821858933;
	}

	static final void method15589(Class665 class665, int i) {
		class665.anInt8526 -= 204761682;
		int i_0_ = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		int i_1_ = class665.anIntArray8525[1769813785 * class665.anInt8526 + 1];
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class315.method5674(i_0_, i_1_, false, 2095524038);
	}

	static boolean method15590(int i, int i_2_) {
		return i == 16 || 0 == i || 8 == i || 9 == i;
	}

	static final void method15591(Class665 class665, int i) {
		/* empty */
	}

	static final void method15592(Class243 class243, Class665 class665, short i) {
		int i_3_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		int i_4_ = ((class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]) - 1);
		if (2 != class243.anInt2541 * -1260029751)
			throw new RuntimeException("");
		Class295 class295 = ((Class295) Class381.aClass24_Sub9_3936.method81(1538136819 * class243.anInt2542, -614811771));
		if (class243.aClass308_2513 == null)
			class243.aClass308_2513 = new Class308(class295, false);
		class243.aClass308_2513.aLong3450 = Class235.method4355(427826459) * -1114685536257316839L;
		if (i_4_ < 0 || i_4_ >= class295.anIntArray3282.length)
			throw new RuntimeException("");
		class243.aClass308_2513.anIntArray3449[i_4_] = i_3_;
		Class430.method6876(class243, (byte) 60);
	}
}
