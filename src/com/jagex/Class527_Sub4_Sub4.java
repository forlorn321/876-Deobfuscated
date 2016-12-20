/* Class527_Sub4_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class527_Sub4_Sub4 extends Class527_Sub4 {
	byte aByte11702;
	byte aByte11703;
	String aString11704;
	Class338 this$0;

	void method16048(Class527_Sub21 class527_sub21, byte i) {
		class527_sub21.aString10483 = aString11704;
		if (null != aString11704) {
			class527_sub21.aByte10489 = aByte11703;
			class527_sub21.aByte10491 = aByte11702;
		}
	}

	void method16049(RSByteBuffer class527_sub38, byte i) {
		aString11704 = class527_sub38.method16456((byte) 3);
		if (aString11704 != null) {
			class527_sub38.readUnsignedByte();
			aByte11703 = class527_sub38.readByte();
			aByte11702 = class527_sub38.readByte();
		}
	}

	Class527_Sub4_Sub4(Class338 class338) {
		this$0 = class338;
	}

	void method16050(RSByteBuffer class527_sub38) {
		aString11704 = class527_sub38.method16456((byte) 31);
		if (aString11704 != null) {
			class527_sub38.readUnsignedByte();
			aByte11703 = class527_sub38.readByte();
			aByte11702 = class527_sub38.readByte();
		}
	}

	void method16051(Class527_Sub21 class527_sub21) {
		class527_sub21.aString10483 = aString11704;
		if (null != aString11704) {
			class527_sub21.aByte10489 = aByte11703;
			class527_sub21.aByte10491 = aByte11702;
		}
	}
}
