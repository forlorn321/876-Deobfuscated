/* Class617 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class617 {
	public Interface65 anInterface65_8092;

	void method10194(RSByteBuffer class527_sub38) {
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			if (0 == i)
				break;
			if (i == 1)
				anInterface65_8092 = Class700_Sub9.method16930(class527_sub38, 1852065042);
		}
	}

	void method10195(RSByteBuffer class527_sub38, int i) {
		for (;;) {
			int i_0_ = class527_sub38.readUnsignedByte();
			if (0 == i_0_)
				break;
			if (i_0_ == 1)
				anInterface65_8092 = Class700_Sub9.method16930(class527_sub38, 1647580280);
		}
	}

	void method10196(RSByteBuffer class527_sub38) {
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			if (0 == i)
				break;
			if (i == 1)
				anInterface65_8092 = Class700_Sub9.method16930(class527_sub38, 1741306861);
		}
	}

	public Class617(Class459 class459) {
		byte[] is = class459.method7512((Class632.aClass632_8265.anInt8258 * 1088756673), 1447980132);
		if (null != is)
			method10195(new RSByteBuffer(is), 65536);
	}
}
