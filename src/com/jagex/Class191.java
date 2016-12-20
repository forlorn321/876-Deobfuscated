/* Class191 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class191 {
	int[] anIntArray2131;
	int[] anIntArray2132;
	int[] anIntArray2133;
	int[] anIntArray2134;
	int[] anIntArray2135;
	int[] anIntArray2136;
	int[] anIntArray2137;
	public static Class147[] aClass147Array2138;

	void method3679(int i) {
		int[][] is = new int[anIntArray2132.length << 1][4];
		for (int i_0_ = 0; i_0_ < anIntArray2132.length; i_0_++) {
			is[i_0_ * 2][0] = anIntArray2132[i_0_];
			is[2 * i_0_][1] = anIntArray2131[i_0_];
			is[2 * i_0_][2] = anIntArray2133[i_0_];
			is[i_0_ * 2][3] = anIntArray2134[i_0_];
			is[1 + i_0_ * 2][0] = anIntArray2135[i_0_];
			is[i_0_ * 2 + 1][1] = anIntArray2136[i_0_];
			is[2 * i_0_ + 1][2] = anIntArray2137[i_0_];
			is[1 + i_0_ * 2][3] = anIntArray2134[i_0_];
		}
		client.anIntArrayArrayArray11148[i] = is;
	}

	Class191(RSByteBuffer class527_sub38) {
		int i = class527_sub38.readUnsignedSmart((byte) -12);
		anIntArray2132 = new int[i];
		anIntArray2131 = new int[i];
		anIntArray2133 = new int[i];
		anIntArray2134 = new int[i];
		anIntArray2135 = new int[i];
		anIntArray2136 = new int[i];
		anIntArray2137 = new int[i];
		for (int i_1_ = 0; i_1_ < i; i_1_++) {
			anIntArray2132[i_1_] = class527_sub38.readUnsignedShort() - 5120;
			anIntArray2133[i_1_] = class527_sub38.readUnsignedShort() - 5120;
			anIntArray2131[i_1_] = class527_sub38.readShort();
			anIntArray2135[i_1_] = class527_sub38.readUnsignedShort() - 5120;
			anIntArray2137[i_1_] = class527_sub38.readUnsignedShort() - 5120;
			anIntArray2136[i_1_] = class527_sub38.readShort();
			anIntArray2134[i_1_] = class527_sub38.readShort();
		}
	}

	void method3680(int i) {
		int[][] is = new int[anIntArray2132.length << 1][4];
		for (int i_2_ = 0; i_2_ < anIntArray2132.length; i_2_++) {
			is[i_2_ * 2][0] = anIntArray2132[i_2_];
			is[2 * i_2_][1] = anIntArray2131[i_2_];
			is[2 * i_2_][2] = anIntArray2133[i_2_];
			is[i_2_ * 2][3] = anIntArray2134[i_2_];
			is[1 + i_2_ * 2][0] = anIntArray2135[i_2_];
			is[i_2_ * 2 + 1][1] = anIntArray2136[i_2_];
			is[2 * i_2_ + 1][2] = anIntArray2137[i_2_];
			is[1 + i_2_ * 2][3] = anIntArray2134[i_2_];
		}
		client.anIntArrayArrayArray11148[i] = is;
	}

	void method3681(int i, int i_3_) {
		int[][] is = new int[anIntArray2132.length << 1][4];
		for (int i_4_ = 0; i_4_ < anIntArray2132.length; i_4_++) {
			is[i_4_ * 2][0] = anIntArray2132[i_4_];
			is[2 * i_4_][1] = anIntArray2131[i_4_];
			is[2 * i_4_][2] = anIntArray2133[i_4_];
			is[i_4_ * 2][3] = anIntArray2134[i_4_];
			is[1 + i_4_ * 2][0] = anIntArray2135[i_4_];
			is[i_4_ * 2 + 1][1] = anIntArray2136[i_4_];
			is[2 * i_4_ + 1][2] = anIntArray2137[i_4_];
			is[1 + i_4_ * 2][3] = anIntArray2134[i_4_];
		}
		client.anIntArrayArrayArray11148[i] = is;
	}

	void method3682(int i) {
		int[][] is = new int[anIntArray2132.length << 1][4];
		for (int i_5_ = 0; i_5_ < anIntArray2132.length; i_5_++) {
			is[i_5_ * 2][0] = anIntArray2132[i_5_];
			is[2 * i_5_][1] = anIntArray2131[i_5_];
			is[2 * i_5_][2] = anIntArray2133[i_5_];
			is[i_5_ * 2][3] = anIntArray2134[i_5_];
			is[1 + i_5_ * 2][0] = anIntArray2135[i_5_];
			is[i_5_ * 2 + 1][1] = anIntArray2136[i_5_];
			is[2 * i_5_ + 1][2] = anIntArray2137[i_5_];
			is[1 + i_5_ * 2][3] = anIntArray2134[i_5_];
		}
		client.anIntArrayArrayArray11148[i] = is;
	}

	void method3683(int i) {
		int[][] is = new int[anIntArray2132.length << 1][4];
		for (int i_6_ = 0; i_6_ < anIntArray2132.length; i_6_++) {
			is[i_6_ * 2][0] = anIntArray2132[i_6_];
			is[2 * i_6_][1] = anIntArray2131[i_6_];
			is[2 * i_6_][2] = anIntArray2133[i_6_];
			is[i_6_ * 2][3] = anIntArray2134[i_6_];
			is[1 + i_6_ * 2][0] = anIntArray2135[i_6_];
			is[i_6_ * 2 + 1][1] = anIntArray2136[i_6_];
			is[2 * i_6_ + 1][2] = anIntArray2137[i_6_];
			is[1 + i_6_ * 2][3] = anIntArray2134[i_6_];
		}
		client.anIntArrayArrayArray11148[i] = is;
	}

	public static void method3684(float f, Class442 class442, Class438 class438, Class442 class442_7_, Class442 class442_8_, Class442 class442_9_, float f_10_, float f_11_, float f_12_, int i) {
		if (!class442_7_.method7177(class442)) {
			Class442 class442_13_ = Class442.method7166(0.0F, 0.0F, 0.0F);
			Class442 class442_14_ = Class442.method7139(Class442.method7155(class442_7_, class442));
			class442_14_.method7157(class438);
			Class442 class442_15_ = Class442.method7155(class442_14_, class442_13_);
			float f_16_ = class442_15_.method7160();
			if (Float.POSITIVE_INFINITY == class442_9_.aFloat4918 || Float.isNaN(class442.aFloat4918) || f_16_ > f_11_ || f_16_ < f_12_) {
				class442.method7146(class442_7_);
				class442_8_.method7211();
			} else {
				class438.method7033();
				Class442 class442_17_ = Class442.method7166(1.0F, 0.0F, 0.0F);
				Class442 class442_18_ = Class442.method7166(0.0F, 1.0F, 0.0F);
				Class442 class442_19_ = Class442.method7166(0.0F, 0.0F, 1.0F);
				class442_17_.method7157(class438);
				class442_18_.method7157(class438);
				class442_19_.method7157(class438);
				Class442 class442_20_ = Class442.method7166(Class442.method7145(class442_17_, class442_8_), Class442.method7145(class442_18_, class442_8_), Class442.method7145(class442_19_, class442_8_));
				Class442 class442_21_ = Class442.method7139(class442_20_);
				Class442 class442_22_ = (Class442.method7166(class442_15_.aFloat4918 * class442_9_.aFloat4918, class442_15_.aFloat4915 * class442_9_.aFloat4915, class442_9_.aFloat4919 * class442_15_.aFloat4919));
				class442_21_.method7152(class442_22_, f);
				class442_21_.method7167(f_10_);
				Class442 class442_23_ = Class442.method7168(class442_17_, class442_21_.aFloat4918);
				class442_23_.method7152(class442_18_, class442_21_.aFloat4915);
				class442_23_.method7152(class442_19_, class442_21_.aFloat4919);
				class442_8_.method7146(class442_23_);
				class442.method7219(Class442.method7168(class442_8_, f));
			}
		}
	}

	static final void method3685(Class665 class665, short i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class204.aClass527_Sub31_2213.aClass700_Sub17_10594.method17008((byte) -82) ? 1 : 0;
	}

	static void method3686(byte[] is, int i) {
		RSByteBuffer class527_sub38 = new RSByteBuffer(is);
		for (;;) {
			int i_24_ = class527_sub38.readUnsignedByte();
			if (0 == i_24_)
				break;
			if (1 == i_24_)
				Class623.anInt8138 = class527_sub38.readUnsignedShort() * -654439817;
			else if (10 == i_24_)
				class527_sub38.readUnsignedShort();
		}
	}

	static boolean method3687(int i, int i_25_) {
		return (i >= -1736797763 * Class596.aClass596_7825.anInt7844 && i <= -1736797763 * Class596.aClass596_7829.anInt7844);
	}

	static final void method3688(Class665 class665, byte i) {
		/* empty */
	}

	static final void method3689(Class665 class665, byte i) {
		int i_26_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_26_, 102245035);
		Class240 class240 = Class183.aClass240Array2100[i_26_ >> 16];
		Class460.method7573(class243, class240, class665, (byte) 78);
	}
}
