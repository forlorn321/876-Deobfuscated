/* Class574 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class574 implements Interface13, Interface7 {
	int anInt7640;
	Class569 aClass569_7641;
	int[] anIntArray7642;
	int anInt7643 = 280628181;
	int anInt7644;

	void method6943(RSByteBuffer class536_sub33, int i) {
		if (1 == i)
			anInt7643 = class536_sub33.readUnsignedShort() * -280628181;
		else if (2 == i) {
			anIntArray7642 = new int[class536_sub33.readUnsignedByte(-255148278)];
			for (int i_0_ = 0; i_0_ < anIntArray7642.length; i_0_++)
				anIntArray7642[i_0_] = class536_sub33.readUnsignedShort();
		} else if (3 == i)
			anInt7640 = class536_sub33.readUnsignedByte(1289382787) * 2117524411;
		else if (4 == i)
			aClass569_7641 = ((Class569) Class682.method8091(Class27.method757(1105811138), class536_sub33.readUnsignedByte(-1741986387), 1858049507));
		else if (i == 5)
			anInt7644 = class536_sub33.method9720((byte) 1) * 2144736261;
		else if (i == 6)
			class536_sub33.method9720((byte) 1);
	}

	public void method59(int i, int i_1_) {
		/* empty */
	}

	void method6944(RSByteBuffer class536_sub33, int i, int i_2_) {
		if (1 == i)
			anInt7643 = class536_sub33.readUnsignedShort() * -280628181;
		else if (2 == i) {
			anIntArray7642 = new int[class536_sub33.readUnsignedByte(2017979937)];
			for (int i_3_ = 0; i_3_ < anIntArray7642.length; i_3_++)
				anIntArray7642[i_3_] = class536_sub33.readUnsignedShort();
		} else if (3 == i)
			anInt7640 = class536_sub33.readUnsignedByte(458265865) * 2117524411;
		else if (4 == i)
			aClass569_7641 = ((Class569) Class682.method8091(Class27.method757(-1541528916), class536_sub33.readUnsignedByte(1736129585), 1858049507));
		else if (i == 5)
			anInt7644 = class536_sub33.method9720((byte) 1) * 2144736261;
		else if (i == 6)
			class536_sub33.method9720((byte) 1);
	}

	public void method77() {
		/* empty */
	}

	public void method75(byte i) {
		/* empty */
	}

	public void method76(RSByteBuffer class536_sub33) {
		for (;;) {
			int i = class536_sub33.readUnsignedByte(1974695741);
			if (i == 0)
				break;
			method6944(class536_sub33, i, 1033731633);
		}
	}

	public void method58(int i) {
		/* empty */
	}

	Class574() {
		anInt7640 = -2117524411;
		aClass569_7641 = Class569.aClass569_7604;
		anInt7644 = -2144736261;
	}

	public void method74(RSByteBuffer class536_sub33, int i) {
		for (;;) {
			int i_4_ = class536_sub33.readUnsignedByte(-148327739);
			if (i_4_ == 0)
				break;
			method6944(class536_sub33, i_4_, -960777401);
		}
	}

	public void method56(int i) {
		/* empty */
	}

	void method6945(RSByteBuffer class536_sub33, int i) {
		if (1 == i)
			anInt7643 = class536_sub33.readUnsignedShort() * -280628181;
		else if (2 == i) {
			anIntArray7642 = new int[class536_sub33.readUnsignedByte(2099348273)];
			for (int i_5_ = 0; i_5_ < anIntArray7642.length; i_5_++)
				anIntArray7642[i_5_] = class536_sub33.readUnsignedShort();
		} else if (3 == i)
			anInt7640 = class536_sub33.readUnsignedByte(-1814596186) * 2117524411;
		else if (4 == i)
			aClass569_7641 = ((Class569) Class682.method8091(Class27.method757(861976295), class536_sub33.readUnsignedByte(848797718), 1858049507));
		else if (i == 5)
			anInt7644 = class536_sub33.method9720((byte) 1) * 2144736261;
		else if (i == 6)
			class536_sub33.method9720((byte) 1);
	}

	public void method57(int i) {
		/* empty */
	}

	static final void method6946(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		Class251 class251 = class683.aClass251_8650;
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = client.method10389(class251).method9474((byte) 3);
	}

	static void method6947(int i, byte i_6_) {
		for (Class536 class536 = client.aClass4_11243.method562(-1589104751); null != class536; class536 = client.aClass4_11243.method567(-1065638845)) {
			if ((class536.aLong7133 * -6909195213925454795L >> 48 & 0xffffL) == (long) i)
				class536.method6484(-708598847);
		}
	}
}
