/* Class208_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class208_Sub12 extends Class208 {
	int anInt9927;
	int anInt9928;
	int anInt9929;
	public static Class459 aClass459_9930;

	boolean method3849() {
		Class685 class685 = ((Class685) Class57.aClass24_Sub4_720.method81(anInt9927 * 1651021427, -1193623629));
		boolean bool = class685.method13935(848012033);
		Class198 class198 = ((Class198) Class321.aClass24_Sub10_3551.method81(-1567837355 * class685.anInt8671, 1634792857));
		bool &= class198.method3732((byte) 11);
		return bool;
	}

	Class208_Sub12(RSByteBuffer class527_sub38) {
		super(class527_sub38);
		anInt9927 = class527_sub38.readUnsignedShort() * -581108037;
		anInt9928 = class527_sub38.readUnsignedShort() * 1080434377;
		anInt9929 = class527_sub38.readUnsignedByte() * -1634795129;
	}

	boolean method3845() {
		Class685 class685 = ((Class685) Class57.aClass24_Sub4_720.method81(anInt9927 * 1651021427, -771943999));
		boolean bool = class685.method13935(665169709);
		Class198 class198 = ((Class198) Class321.aClass24_Sub10_3551.method81(-1567837355 * class685.anInt8671, -934583031));
		bool &= class198.method3732((byte) 22);
		return bool;
	}

	boolean method3847(byte i) {
		Class685 class685 = ((Class685) Class57.aClass24_Sub4_720.method81(anInt9927 * 1651021427, 890661874));
		boolean bool = class685.method13935(407778840);
		Class198 class198 = ((Class198) Class321.aClass24_Sub10_3551.method81(-1567837355 * class685.anInt8671, -244024631));
		bool &= class198.method3732((byte) 100);
		return bool;
	}

	static boolean method15619(Class243 class243, int i) {
		Class527_Sub25 class527_sub25 = client.method17815(class243);
		if (class527_sub25.method16269(-910537361) > 0)
			return true;
		if (class527_sub25.method16259(1646451152))
			return true;
		if (null != class243.aClass243_2588)
			return true;
		return false;
	}

	static final void method15620(Class665 class665, int i) {
		class665.anInt8526 -= 204761682;
		if (class665.anIntArray8525[1769813785 * class665.anInt8526] >= class665.anIntArray8525[1 + class665.anInt8526 * 1769813785])
			class665.anInt8527 += (class665.anIntArray8545[891367231 * class665.anInt8527] * -1038991169);
	}

	static void method15621(Class243 class243, int i, int i_0_, int i_1_) {
		if (class243.aByte2503 == 0)
			class243.anInt2634 = class243.anInt2507 * -1453426071;
		else if (class243.aByte2503 == 1)
			class243.anInt2634 = 2013345627 * (319292555 * class243.anInt2507 + (i - class243.anInt2511 * -1054537975) / 2);
		else if (class243.aByte2503 == 2)
			class243.anInt2634 = 2013345627 * (i - -1054537975 * class243.anInt2511 - 319292555 * class243.anInt2507);
		else if (3 == class243.aByte2503)
			class243.anInt2634 = (class243.anInt2507 * 319292555 * i >> 14) * 2013345627;
		else if (class243.aByte2503 == 4)
			class243.anInt2634 = ((i - -1054537975 * class243.anInt2511) / 2 + (class243.anInt2507 * 319292555 * i >> 14)) * 2013345627;
		else
			class243.anInt2634 = 2013345627 * (i - -1054537975 * class243.anInt2511 - (i * (class243.anInt2507 * 319292555) >> 14));
		if (0 == class243.aByte2488)
			class243.anInt2512 = -726185513 * class243.anInt2534;
		else if (class243.aByte2488 == 1)
			class243.anInt2512 = (1059132563 * (class243.anInt2534 * 171320365 + (i_0_ - -1386504031 * class243.anInt2514) / 2));
		else if (class243.aByte2488 == 2)
			class243.anInt2512 = (i_0_ - -1386504031 * class243.anInt2514 - 171320365 * class243.anInt2534) * 1059132563;
		else if (class243.aByte2488 == 3)
			class243.anInt2512 = (171320365 * class243.anInt2534 * i_0_ >> 14) * 1059132563;
		else if (4 == class243.aByte2488)
			class243.anInt2512 = 1059132563 * ((i_0_ - class243.anInt2514 * -1386504031) / 2 + (171320365 * class243.anInt2534 * i_0_ >> 14));
		else
			class243.anInt2512 = 1059132563 * (i_0_ - class243.anInt2514 * -1386504031 - (class243.anInt2534 * 171320365 * i_0_ >> 14));
		if (client.aBool11199 && (client.method17815(class243).anInt10520 * -2105107355 != 0 || 0 == class243.anInt2501 * -270144907)) {
			if (class243.anInt2634 * 1618747603 < 0)
				class243.anInt2634 = 0;
			else if ((class243.anInt2511 * -1054537975 + class243.anInt2634 * 1618747603) > i)
				class243.anInt2634 = 2013345627 * (i - class243.anInt2511 * -1054537975);
			if (-71358053 * class243.anInt2512 < 0)
				class243.anInt2512 = 0;
			else if ((-71358053 * class243.anInt2512 + class243.anInt2514 * -1386504031) > i_0_)
				class243.anInt2512 = 1059132563 * (i_0_ - -1386504031 * class243.anInt2514);
		}
	}
}
