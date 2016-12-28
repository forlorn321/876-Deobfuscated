/* Class14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class14 implements DefinitionI, Interface7 {
	Class453[][] aClass453ArrayArray162;
	Object[][] anObjectArrayArray163;
	public static Class461 aClass461_164;

	public void method56(int i) {
		/* empty */
	}

	public void method74(RSByteBuffer class536_sub33, int i) {
		for (;;) {
			int i_0_ = class536_sub33.readUnsignedByte();
			if (0 == i_0_)
				break;
			method625(class536_sub33, i_0_, 2136956551);
		}
	}

	public Object[] method624(int i, int i_1_) {
		if (anObjectArrayArray163 == null)
			return null;
		return anObjectArrayArray163[i];
	}

	void method625(RSByteBuffer class536_sub33, int i, int i_2_) {
		if (i == 3) {
			int i_3_ = class536_sub33.readUnsignedByte();
			if (anObjectArrayArray163 == null) {
				anObjectArrayArray163 = new Object[i_3_][];
				aClass453ArrayArray162 = new Class453[i_3_][];
			}
			for (int i_4_ = class536_sub33.readUnsignedByte(); i_4_ != 255; i_4_ = class536_sub33.readUnsignedByte()) {
				int i_5_ = class536_sub33.readUnsignedByte();
				Class453[] class453s = new Class453[i_5_];
				for (int i_6_ = 0; i_6_ < i_5_; i_6_++)
					class453s[i_6_] = ((Class453) Class682.method8091(Class453.method5438((byte) 101), class536_sub33.readUnsignedSmart(), 1858049507));
				anObjectArrayArray163[i_4_] = Class655.method7940(class536_sub33, class453s, 1594603721);
				aClass453ArrayArray162[i_4_] = class453s;
			}
		}
	}

	public void method59(int i, int i_7_) {
		/* empty */
	}

	public void method76(RSByteBuffer class536_sub33) {
		for (;;) {
			int i = class536_sub33.readUnsignedByte();
			if (0 == i)
				break;
			method625(class536_sub33, i, 2144856946);
		}
	}

	public void method77() {
		/* empty */
	}

	Class14() {
		/* empty */
	}

	public void method58(int i) {
		/* empty */
	}

	public void method57(int i) {
		/* empty */
	}

	public void method75(byte i) {
		/* empty */
	}

	void method626(RSByteBuffer class536_sub33, int i) {
		if (i == 3) {
			int i_8_ = class536_sub33.readUnsignedByte();
			if (anObjectArrayArray163 == null) {
				anObjectArrayArray163 = new Object[i_8_][];
				aClass453ArrayArray162 = new Class453[i_8_][];
			}
			for (int i_9_ = class536_sub33.readUnsignedByte(); i_9_ != 255; i_9_ = class536_sub33.readUnsignedByte()) {
				int i_10_ = class536_sub33.readUnsignedByte();
				Class453[] class453s = new Class453[i_10_];
				for (int i_11_ = 0; i_11_ < i_10_; i_11_++)
					class453s[i_11_] = ((Class453) Class682.method8091(Class453.method5438((byte) 85), class536_sub33.readUnsignedSmart(), 1858049507));
				anObjectArrayArray163[i_9_] = Class655.method7940(class536_sub33, class453s, 1594603721);
				aClass453ArrayArray162[i_9_] = class453s;
			}
		}
	}
}
