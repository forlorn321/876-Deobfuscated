/* Class205_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class205_Sub4 extends Class205 {
	int anInt9865;
	int anInt9866;
	int anInt9867;

	boolean method2939(int i) {
		Class677 class677 = ((Class677) Class633.aClass34_Sub15_8260.method70(anInt9865 * 556893693, (byte) -19));
		boolean bool = class677.method8048(-360686808);
		Class191 class191 = ((Class191) Class45.aClass34_Sub11_529.method70(class677.anInt8607 * -1078340929, (byte) 40));
		bool &= class191.method2836(-269612054);
		return bool;
	}

	boolean method2944() {
		Class677 class677 = ((Class677) Class633.aClass34_Sub15_8260.method70(anInt9865 * 556893693, (byte) -16));
		boolean bool = class677.method8048(-842492127);
		Class191 class191 = ((Class191) Class45.aClass34_Sub11_529.method70(class677.anInt8607 * -1078340929, (byte) 39));
		bool &= class191.method2836(438349035);
		return bool;
	}

	Class205_Sub4(RSByteBuffer class536_sub33) {
		super(class536_sub33);
		anInt9865 = class536_sub33.readUnsignedShort() * -833716395;
		anInt9866 = class536_sub33.readUnsignedShort() * 909018553;
		anInt9867 = class536_sub33.readUnsignedByte() * 1901171693;
	}

	static final void method9056(Class668 class668, int i) {
		int i_0_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		if (2 == -1484801557 * client.anInt11289 && i_0_ < client.anInt11288 * 142551095) {
			Class31 class31 = client.aClass31Array11291[i_0_];
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = class31.aString266;
			if (class31.aString267 != null)
				class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = class31.aString267;
			else
				class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = "";
		} else {
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = "";
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = "";
		}
	}

	public static void method9057(byte i) {
		Class542_Sub1.aHashMap10719.clear();
		Class542_Sub1.aHashMap10715.clear();
	}
}
