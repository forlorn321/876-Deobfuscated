/* Class302 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class302 {
	static Class302 aClass302_3401;
	static Class302 aClass302_3402 = new Class302(0);
	int anInt3403;
	static Class302 aClass302_3404 = new Class302(1);
	static int sceneX;
	static Class74 aClass74_3406;

	static {
		aClass302_3401 = new Class302(2);
	}

	Class302(int i) {
		anInt3403 = i * 1445410277;
	}

	public static int method4097(int i, int i_0_, float f, int i_1_) {
		return Class59.method984(i, i_0_, (int) f, -402310046);
	}

	static void method4098(Class668 class668, byte i) {
		class668.anIntArray8541[class668.anInt8542 * 1867269829 - 1] = (((Class277) Class38.aClass53_Sub2_481.method70((class668.anIntArray8541[((1867269829 * class668.anInt8542) - 1)]), (byte) -10)).anInt3031 * -269064123);
	}

	static final void method4099(Class668 class668, int i) {
		int i_2_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		InterfaceDefinitions class251 = Class264.method3678(i_2_, -689214737);
		Class234 class234 = Class463.aClass234Array5227[i_2_ >> 16];
		Class34_Sub15.method10350(class251, class234, class668, (byte) 74);
	}

	static final void method4100(Class668 class668, int i) {
		class668.anInt8542 -= 1534748737;
		int i_3_ = class668.anIntArray8541[1867269829 * class668.anInt8542];
		int i_4_ = class668.anIntArray8541[1867269829 * class668.anInt8542 + 1];
		int i_5_ = class668.anIntArray8541[2 + class668.anInt8542 * 1867269829];
		int i_6_ = class668.anIntArray8541[class668.anInt8542 * 1867269829 + 3];
		int i_7_ = class668.anIntArray8541[4 + 1867269829 * class668.anInt8542];
		Class184_Sub2.aClass211_9442.method3030(Class198.aClass198_2211, i_3_, i_4_, i_6_, Class188.aClass188_2133.method2788(-1752754606), Class207.aClass207_2242, 0.0F, 0.0F, null, 0, i_7_, i_5_, (byte) 100);
	}

	public static void method4101(int i) {
		Class463.aClass234Array5227 = new Class234[Class452.aClass461_4953.method5570(217818897)];
		Class684.aBoolArray8653 = new boolean[Class452.aClass461_4953.method5570(-1975535778)];
	}

	static final void method4102(RSBitBuffer buffer) {
		for (int index = 0; index < 38697745 * Class95.anInt1150; index++) {
			buffer.readUnsignedShort();
			int playerIndex = Class95.anIntArray1160[index];
			Player player = client.aClass649_Sub1_Sub5_Sub1_Sub2Array11155[playerIndex];
			int flag = buffer.readUnsignedByte();
			if (0 != (flag & 0x80))
				flag += buffer.readUnsignedByte() << 8;
			if ((flag & 0x800) != 0)
				flag += buffer.readUnsignedByte() << 16;
			Class630.decodePlayerMasks(buffer, playerIndex, player, flag);
		}
	}
}
