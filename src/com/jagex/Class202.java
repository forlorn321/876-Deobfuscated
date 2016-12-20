/* Class202 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class202 implements Interface14, Interface7 {
	public boolean[] aBoolArray2212;

	Class202() {
		/* empty */
	}

	public void method82(RSByteBuffer class527_sub38, int i) {
		for (;;) {
			int i_0_ = class527_sub38.readUnsignedByte();
			if (0 == i_0_)
				break;
			method3771(class527_sub38, i_0_, -2100966001);
		}
	}

	void method3771(RSByteBuffer class527_sub38, int i, int i_1_) {
		if (i == 2) {
			aBoolArray2212 = new boolean[400];
			int i_2_ = class527_sub38.readUnsignedSmart((byte) -35);
			for (int i_3_ = 0; i_3_ < i_2_; i_3_++)
				aBoolArray2212[class527_sub38.readUnsignedSmart((byte) -105)] = true;
		} else if (3 == i) {
			class527_sub38.readUnsignedByte();
			int i_4_ = class527_sub38.readUnsignedSmart((byte) -24);
			for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
				class527_sub38.readUnsignedSmart((byte) -95);
				class527_sub38.readUnsignedByte();
			}
		}
	}

	public void method60(int i) {
		/* empty */
	}

	public void method16(int i, int i_6_) {
		/* empty */
	}

	public void method83(RSByteBuffer class527_sub38) {
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			if (0 == i)
				break;
			method3771(class527_sub38, i, -2100966001);
		}
	}

	public void method73(RSByteBuffer class527_sub38) {
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			if (0 == i)
				break;
			method3771(class527_sub38, i, -2100966001);
		}
	}

	public void method85() {
		/* empty */
	}

	public void method86(int i) {
		/* empty */
	}

	public void method84() {
		/* empty */
	}

	public static void method3772(int i) {
		int i_7_ = client.aClass509_11072.method8284((byte) 121);
		int i_8_ = client.aClass509_11072.method8285(-1445464525);
		Class682.aBoolArrayArray8647 = new boolean[i_7_ >> 3][i_8_ >> 3];
	}

	static final void method3773(Class665 class665, int i) {
		int i_9_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_9_, 1801101513);
		Class335.method5874(class243, class665, -1959693494);
	}

	static final void method3774(Class665 class665, int i) {
		throw new RuntimeException("");
	}

	public static String method3775(int i, int i_10_) {
		return new StringBuilder().append("<img=").append(i).append(">").toString();
	}

	static void method3776(Class109 class109, Class243 class243, int i, int i_11_, int i_12_, int i_13_) {
		if (1 == i) {
			Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4496, class109.aClass2_1367, (byte) -12);
			Class190.method3677(class527_sub15, i_11_, i_12_, -437471887 * class243.anInt2572, 1392476503);
			class109.method1969(class527_sub15, (byte) 1);
		}
		if (i == 2) {
			Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4422, class109.aClass2_1367, (byte) 29);
			Class190.method3677(class527_sub15, i_11_, i_12_, -437471887 * class243.anInt2572, -513622360);
			class109.method1969(class527_sub15, (byte) 1);
		}
		if (i == 3) {
			Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4463, class109.aClass2_1367, (byte) -41);
			Class190.method3677(class527_sub15, i_11_, i_12_, class243.anInt2572 * -437471887, -1057390846);
			class109.method1969(class527_sub15, (byte) 1);
		}
		if (4 == i) {
			Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4485, class109.aClass2_1367, (byte) -26);
			Class190.method3677(class527_sub15, i_11_, i_12_, -437471887 * class243.anInt2572, 1249485852);
			class109.method1969(class527_sub15, (byte) 1);
		}
		if (i == 5) {
			Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4415, class109.aClass2_1367, (byte) -21);
			Class190.method3677(class527_sub15, i_11_, i_12_, class243.anInt2572 * -437471887, 1924738531);
			class109.method1969(class527_sub15, (byte) 1);
		}
		if (6 == i) {
			Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4467, class109.aClass2_1367, (byte) -46);
			Class190.method3677(class527_sub15, i_11_, i_12_, -437471887 * class243.anInt2572, 1829796845);
			class109.method1969(class527_sub15, (byte) 1);
		}
		if (i == 7) {
			Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4478, class109.aClass2_1367, (byte) -53);
			Class190.method3677(class527_sub15, i_11_, i_12_, class243.anInt2572 * -437471887, 1948178417);
			class109.method1969(class527_sub15, (byte) 1);
		}
		if (i == 8) {
			Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4435, class109.aClass2_1367, (byte) -1);
			Class190.method3677(class527_sub15, i_11_, i_12_, class243.anInt2572 * -437471887, 886364180);
			class109.method1969(class527_sub15, (byte) 1);
		}
		if (i == 9) {
			Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4398, class109.aClass2_1367, (byte) -17);
			Class190.method3677(class527_sub15, i_11_, i_12_, class243.anInt2572 * -437471887, -1686717175);
			class109.method1969(class527_sub15, (byte) 1);
		}
		if (i == 10) {
			Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4388, class109.aClass2_1367, (byte) 19);
			Class190.method3677(class527_sub15, i_11_, i_12_, -437471887 * class243.anInt2572, 1327265840);
			class109.method1969(class527_sub15, (byte) 1);
		}
	}
}
