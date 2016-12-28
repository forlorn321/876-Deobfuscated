/* Class84 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class84 implements DefinitionI, Interface7 {
	public int anInt864;
	public int anInt865;
	public int anInt866;
	public int anInt867 = 0;

	void method1178(RSByteBuffer class536_sub33, int i, int i_0_) {
		if (i == 1)
			anInt867 = class536_sub33.readUnsignedByte() * 1103714185;
		else if (i == 2)
			anInt864 = class536_sub33.readUnsignedShort() * -1927758131;
		else if (i == 3)
			anInt866 = class536_sub33.readUnsignedShort() * -563225365;
		else if (4 == i)
			anInt865 = class536_sub33.readShort() * 1858377877;
	}

	public void method74(RSByteBuffer class536_sub33, int i) {
		for (;;) {
			int i_1_ = class536_sub33.readUnsignedByte();
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
			int i = class536_sub33.readUnsignedByte();
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
			anInt867 = class536_sub33.readUnsignedByte() * 1103714185;
		else if (i == 2)
			anInt864 = class536_sub33.readUnsignedShort() * -1927758131;
		else if (i == 3)
			anInt866 = class536_sub33.readUnsignedShort() * -563225365;
		else if (4 == i)
			anInt865 = class536_sub33.readShort() * 1858377877;
	}

	void method1180(RSByteBuffer class536_sub33, int i) {
		if (i == 1)
			anInt867 = class536_sub33.readUnsignedByte() * 1103714185;
		else if (i == 2)
			anInt864 = class536_sub33.readUnsignedShort() * -1927758131;
		else if (i == 3)
			anInt866 = class536_sub33.readUnsignedShort() * -563225365;
		else if (4 == i)
			anInt865 = class536_sub33.readShort() * 1858377877;
	}

	void method1181(RSByteBuffer class536_sub33, int i) {
		if (i == 1)
			anInt867 = class536_sub33.readUnsignedByte() * 1103714185;
		else if (i == 2)
			anInt864 = class536_sub33.readUnsignedShort() * -1927758131;
		else if (i == 3)
			anInt866 = class536_sub33.readUnsignedShort() * -563225365;
		else if (4 == i)
			anInt865 = class536_sub33.readShort() * 1858377877;
	}

	void method1182(RSByteBuffer class536_sub33, int i) {
		if (i == 1)
			anInt867 = class536_sub33.readUnsignedByte() * 1103714185;
		else if (i == 2)
			anInt864 = class536_sub33.readUnsignedShort() * -1927758131;
		else if (i == 3)
			anInt866 = class536_sub33.readUnsignedShort() * -563225365;
		else if (4 == i)
			anInt865 = class536_sub33.readShort() * 1858377877;
	}

	void method1183(RSByteBuffer class536_sub33, int i) {
		if (i == 1)
			anInt867 = class536_sub33.readUnsignedByte() * 1103714185;
		else if (i == 2)
			anInt864 = class536_sub33.readUnsignedShort() * -1927758131;
		else if (i == 3)
			anInt866 = class536_sub33.readUnsignedShort() * -563225365;
		else if (4 == i)
			anInt865 = class536_sub33.readShort() * 1858377877;
	}
}
