/* Class311 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class311 implements ConfigType, Interface7 {
	public int anInt3475;
	public int anInt3476 = -1289603752;
	public int anInt3477;
	public int anInt3478;
	public int anInt3479;
	public boolean aBool3480;
	public int anInt3481 = -1835927157;
	public int anInt3482;
	public int anInt3483;
	public int anInt3484;
	public int anInt3485;

	Class311() {
		/* empty */
	}

	public void method56(int i) {
		/* empty */
	}

	void method4179(RSByteBuffer class536_sub33, int i, int i_0_) {
		if (1 == i)
			anInt3476 = class536_sub33.readUnsignedShort() * -1771813205;
		else if (2 == i)
			aBool3480 = true;
		else if (3 == i) {
			anInt3477 = class536_sub33.readShort() * 607092271;
			anInt3478 = class536_sub33.readShort() * 306678829;
			anInt3479 = class536_sub33.readShort() * -875688417;
		} else if (i == 4)
			anInt3482 = class536_sub33.readUnsignedByte() * -2107798657;
		else if (i == 5)
			anInt3483 = class536_sub33.readBigSmart() * 718669759;
		else if (i == 6)
			anInt3481 = class536_sub33.read24BitUnsignedInteger() * -496105867;
		else if (7 == i) {
			anInt3475 = class536_sub33.readShort() * -1777370783;
			anInt3484 = class536_sub33.readShort() * -580593381;
			anInt3485 = class536_sub33.readShort() * -1263664647;
		}
	}

	public void decodeType(RSByteBuffer class536_sub33) {
		for (;;) {
			int i_1_ = class536_sub33.readUnsignedByte();
			if (i_1_ == 0)
				break;
			method4179(class536_sub33, i_1_, 1664182739);
		}
	}

	public void postDecode() {
		/* empty */
	}

	public void method76(RSByteBuffer class536_sub33) {
		for (;;) {
			int i = class536_sub33.readUnsignedByte();
			if (i == 0)
				break;
			method4179(class536_sub33, i, 936918943);
		}
	}

	public void method59(int i, int i_2_) {
		/* empty */
	}

	public void method57(int i) {
		/* empty */
	}

	public void method77() {
		/* empty */
	}

	public void method58(int i) {
		/* empty */
	}

	static final void method4180(IComponentDefinitions class251, Class234 class234, Class668 class668, byte i) {
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		if (Class510.method6183(string, class668, -1831641204) != null)
			string = string.substring(0, string.length() - 1);
		class251.onTargetLeaveHook = Class33.method796(string, class668, (short) 8049);
		class251.hasComponentHook = true;
	}

	static final void method4181(Class668 class668, byte i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class329.aClass550_3601.method6657(-1232839934);
	}
}
