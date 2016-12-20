/* Class4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class4 implements Interface14, Interface7 {
	Object[][] anObjectArrayArray44;
	Class462[][] aClass462ArrayArray45;

	void method559(RSByteBuffer class527_sub38, int i) {
		if (i == 3) {
			int i_0_ = class527_sub38.readUnsignedByte();
			if (anObjectArrayArray44 == null) {
				anObjectArrayArray44 = new Object[i_0_][];
				aClass462ArrayArray45 = new Class462[i_0_][];
			}
			for (int i_1_ = class527_sub38.readUnsignedByte(); i_1_ != 255; i_1_ = class527_sub38.readUnsignedByte()) {
				int i_2_ = class527_sub38.readUnsignedByte();
				Class462[] class462s = new Class462[i_2_];
				for (int i_3_ = 0; i_3_ < i_2_; i_3_++)
					class462s[i_3_] = ((Class462) Class26.method858(Class462.method7610(-1549507489), class527_sub38.readUnsignedSmart((byte) -3), 1253461613));
				anObjectArrayArray44[i_1_] = Class352.method6211(class527_sub38, class462s, (byte) 86);
				aClass462ArrayArray45[i_1_] = class462s;
			}
		}
	}

	public void method82(RSByteBuffer class527_sub38, int i) {
		for (;;) {
			int i_4_ = class527_sub38.readUnsignedByte();
			if (i_4_ == 0)
				break;
			method561(class527_sub38, i_4_, (byte) 60);
		}
	}

	public Object[] method560(int i) {
		if (null == anObjectArrayArray44)
			return null;
		return anObjectArrayArray44[i];
	}

	void method561(RSByteBuffer class527_sub38, int i, byte i_5_) {
		if (i == 3) {
			int i_6_ = class527_sub38.readUnsignedByte();
			if (anObjectArrayArray44 == null) {
				anObjectArrayArray44 = new Object[i_6_][];
				aClass462ArrayArray45 = new Class462[i_6_][];
			}
			for (int i_7_ = class527_sub38.readUnsignedByte(); i_7_ != 255; i_7_ = class527_sub38.readUnsignedByte()) {
				int i_8_ = class527_sub38.readUnsignedByte();
				Class462[] class462s = new Class462[i_8_];
				for (int i_9_ = 0; i_9_ < i_8_; i_9_++)
					class462s[i_9_] = ((Class462) Class26.method858(Class462.method7610(-723768348), class527_sub38.readUnsignedSmart((byte) -25), 446184171));
				anObjectArrayArray44[i_7_] = Class352.method6211(class527_sub38, class462s, (byte) 83);
				aClass462ArrayArray45[i_7_] = class462s;
			}
		}
	}

	Class4() {
		/* empty */
	}

	public void method16(int i, int i_10_) {
		/* empty */
	}

	public void method83(RSByteBuffer class527_sub38) {
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			if (i == 0)
				break;
			method561(class527_sub38, i, (byte) -2);
		}
	}

	public void method73(RSByteBuffer class527_sub38) {
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			if (i == 0)
				break;
			method561(class527_sub38, i, (byte) 44);
		}
	}

	public void method85() {
		/* empty */
	}

	public void method84() {
		/* empty */
	}

	public void method60(int i) {
		/* empty */
	}

	public Object[] method562(int i) {
		if (null == anObjectArrayArray44)
			return null;
		return anObjectArrayArray44[i];
	}

	public Object[] method563(int i) {
		if (null == anObjectArrayArray44)
			return null;
		return anObjectArrayArray44[i];
	}

	public Object[] method564(int i, int i_11_) {
		if (null == anObjectArrayArray44)
			return null;
		return anObjectArrayArray44[i];
	}

	void method565(RSByteBuffer class527_sub38, int i) {
		if (i == 3) {
			int i_12_ = class527_sub38.readUnsignedByte();
			if (anObjectArrayArray44 == null) {
				anObjectArrayArray44 = new Object[i_12_][];
				aClass462ArrayArray45 = new Class462[i_12_][];
			}
			for (int i_13_ = class527_sub38.readUnsignedByte(); i_13_ != 255; i_13_ = class527_sub38.readUnsignedByte()) {
				int i_14_ = class527_sub38.readUnsignedByte();
				Class462[] class462s = new Class462[i_14_];
				for (int i_15_ = 0; i_15_ < i_14_; i_15_++)
					class462s[i_15_] = ((Class462) Class26.method858(Class462.method7610(-1292684988), class527_sub38.readUnsignedSmart((byte) -128), 1846355575));
				anObjectArrayArray44[i_13_] = Class352.method6211(class527_sub38, class462s, (byte) 16);
				aClass462ArrayArray45[i_13_] = class462s;
			}
		}
	}

	public void method86(int i) {
		/* empty */
	}
}
