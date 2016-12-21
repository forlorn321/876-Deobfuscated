/* Class84 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class84 implements Interface13, Interface7 {
	public int anInt864;
	public int anInt865;
	public int anInt866;
	public int anInt867 = 0;

	void method1178(RSByteBuffer class536_sub33, int i, int i_0_) {
		if (i == 1)
			anInt867 = class536_sub33.readUnsignedByte(1366800927) * 1103714185;
		else if (i == 2)
			anInt864 = class536_sub33.readUnsignedShort((short) -146) * -1927758131;
		else if (i == 3)
			anInt866 = class536_sub33.readUnsignedShort((short) 1302) * -563225365;
		else if (4 == i)
			anInt865 = class536_sub33.readShort((byte) -110) * 1858377877;
	}

	public void method74(RSByteBuffer class536_sub33, int i) {
		for (;;) {
			int i_1_ = class536_sub33.readUnsignedByte(2098144538);
			if (0 == i_1_)
				break;
			method1178(class536_sub33, i_1_, -796815401);
		}
	}

	public void method57(int i) {
		/* empty */
	}

	public void method59(int i, int i_2_) {
		/* empty */
	}

	public void method75(byte i) {
		/* empty */
	}

	Class84() {
		anInt865 = 0;
		anInt866 = 1860655104;
		anInt864 = -973707264;
	}

	public void method77() {
		/* empty */
	}

	public void method76(RSByteBuffer class536_sub33) {
		for (;;) {
			int i = class536_sub33.readUnsignedByte(939889399);
			if (0 == i)
				break;
			method1178(class536_sub33, i, -12418057);
		}
	}

	public void method58(int i) {
		/* empty */
	}

	public void method56(int i) {
		/* empty */
	}

	void method1179(RSByteBuffer class536_sub33, int i) {
		if (i == 1)
			anInt867 = class536_sub33.readUnsignedByte(-706293004) * 1103714185;
		else if (i == 2)
			anInt864 = class536_sub33.readUnsignedShort((short) 10593) * -1927758131;
		else if (i == 3)
			anInt866 = class536_sub33.readUnsignedShort((short) -18182) * -563225365;
		else if (4 == i)
			anInt865 = class536_sub33.readShort((byte) -61) * 1858377877;
	}

	void method1180(RSByteBuffer class536_sub33, int i) {
		if (i == 1)
			anInt867 = class536_sub33.readUnsignedByte(-1059494403) * 1103714185;
		else if (i == 2)
			anInt864 = class536_sub33.readUnsignedShort((short) 1260) * -1927758131;
		else if (i == 3)
			anInt866 = class536_sub33.readUnsignedShort((short) -7053) * -563225365;
		else if (4 == i)
			anInt865 = class536_sub33.readShort((byte) -4) * 1858377877;
	}

	void method1181(RSByteBuffer class536_sub33, int i) {
		if (i == 1)
			anInt867 = class536_sub33.readUnsignedByte(1678101963) * 1103714185;
		else if (i == 2)
			anInt864 = class536_sub33.readUnsignedShort((short) -6997) * -1927758131;
		else if (i == 3)
			anInt866 = class536_sub33.readUnsignedShort((short) -1815) * -563225365;
		else if (4 == i)
			anInt865 = class536_sub33.readShort((byte) -32) * 1858377877;
	}

	void method1182(RSByteBuffer class536_sub33, int i) {
		if (i == 1)
			anInt867 = class536_sub33.readUnsignedByte(1845969376) * 1103714185;
		else if (i == 2)
			anInt864 = class536_sub33.readUnsignedShort((short) -2476) * -1927758131;
		else if (i == 3)
			anInt866 = class536_sub33.readUnsignedShort((short) 10409) * -563225365;
		else if (4 == i)
			anInt865 = class536_sub33.readShort((byte) -111) * 1858377877;
	}

	void method1183(RSByteBuffer class536_sub33, int i) {
		if (i == 1)
			anInt867 = class536_sub33.readUnsignedByte(1574515825) * 1103714185;
		else if (i == 2)
			anInt864 = class536_sub33.readUnsignedShort((short) 8146) * -1927758131;
		else if (i == 3)
			anInt866 = class536_sub33.readUnsignedShort((short) -14994) * -563225365;
		else if (4 == i)
			anInt865 = class536_sub33.readShort((byte) -28) * 1858377877;
	}
}
