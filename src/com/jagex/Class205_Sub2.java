/* Class205_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class205_Sub2 extends Class205 {
	int anInt9858;
	int anInt9859;
	int anInt9860;
	int anInt9861;
	int anInt9862;

	public void method2940(int i) {
		Class101.method1354(anInt9862 * -1266644137, anInt9858 * -1003385391, 2105383931 * anInt9860, 100, 100, false, (short) 31467);
		OutgoingPacket.method5027(1029514217 * anInt9861, 1034248061 * anInt9859, 0, (byte) 51);
		client.aBool11159 = true;
	}

	Class205_Sub2(RSByteBuffer class536_sub33) {
		super(class536_sub33);
		anInt9862 = class536_sub33.readUnsignedShort((short) 9644) * 603033703;
		anInt9860 = class536_sub33.readUnsignedShort((short) -18913) * 1102395187;
		anInt9858 = class536_sub33.readUnsignedShort((short) -840) * -62526671;
		anInt9861 = class536_sub33.readUnsignedShort((short) 7225) * -1431575463;
		anInt9859 = class536_sub33.readUnsignedShort((short) -4611) * 868569557;
	}

	public void method2942() {
		Class101.method1354(anInt9862 * -1266644137, anInt9858 * -1003385391, 2105383931 * anInt9860, 100, 100, false, (short) 31287);
		OutgoingPacket.method5027(1029514217 * anInt9861, 1034248061 * anInt9859, 0, (byte) 106);
		client.aBool11159 = true;
	}

	public void method2943() {
		Class101.method1354(anInt9862 * -1266644137, anInt9858 * -1003385391, 2105383931 * anInt9860, 100, 100, false, (short) 32723);
		OutgoingPacket.method5027(1029514217 * anInt9861, 1034248061 * anInt9859, 0, (byte) 16);
		client.aBool11159 = true;
	}
}
