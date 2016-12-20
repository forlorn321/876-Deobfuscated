/* Class616 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class616 {
	public static final int anInt8083 = 0;
	public static final int anInt8084 = 1;
	public int anInt8085;
	public int[] anIntArray8086;
	static final int anInt8087 = 2;
	public int anInt8088 = 2028894439;
	public int[] anIntArray8089;
	public int[] anIntArray8090;
	public static Class459 aClass459_8091;

	public Class616(Class459 class459) {
		anInt8085 = 1604547405;
		byte[] is = class459.method7512((1088756673 * Class632.aClass632_8263.anInt8258), 1447980132);
		method10190(new RSByteBuffer(is), (short) -20354);
	}

	void method10190(RSByteBuffer class527_sub38, short i) {
		for (;;) {
			int i_0_ = class527_sub38.readUnsignedByte();
			if (i_0_ == 0)
				break;
			if (i_0_ == 1) {
				int i_1_ = class527_sub38.readUnsignedByte();
				anIntArray8086 = new int[i_1_];
				for (int i_2_ = 0; i_2_ < anIntArray8086.length; i_2_++) {
					anIntArray8086[i_2_] = class527_sub38.readUnsignedByte();
					if (0 != anIntArray8086[i_2_] && anIntArray8086[i_2_] != 2) {
						/* empty */
					}
				}
			} else if (3 == i_0_)
				anInt8088 = class527_sub38.readUnsignedByte() * -2028894439;
			else if (i_0_ == 4)
				anInt8085 = class527_sub38.readUnsignedByte() * -1604547405;
			else if (i_0_ == 5) {
				anIntArray8089 = new int[class527_sub38.readUnsignedByte()];
				for (int i_3_ = 0; i_3_ < anIntArray8089.length; i_3_++)
					anIntArray8089[i_3_] = class527_sub38.readUnsignedByte();
			} else if (6 == i_0_) {
				anIntArray8090 = new int[class527_sub38.readUnsignedByte()];
				for (int i_4_ = 0; i_4_ < anIntArray8090.length; i_4_++)
					anIntArray8090[i_4_] = class527_sub38.readUnsignedByte();
			}
		}
		if (null == anIntArray8086)
			throw new RuntimeException("");
	}

	void method10191(RSByteBuffer class527_sub38) {
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			if (i == 0)
				break;
			if (i == 1) {
				int i_5_ = class527_sub38.readUnsignedByte();
				anIntArray8086 = new int[i_5_];
				for (int i_6_ = 0; i_6_ < anIntArray8086.length; i_6_++) {
					anIntArray8086[i_6_] = class527_sub38.readUnsignedByte();
					if (0 != anIntArray8086[i_6_] && anIntArray8086[i_6_] != 2) {
						/* empty */
					}
				}
			} else if (3 == i)
				anInt8088 = class527_sub38.readUnsignedByte() * -2028894439;
			else if (i == 4)
				anInt8085 = class527_sub38.readUnsignedByte() * -1604547405;
			else if (i == 5) {
				anIntArray8089 = new int[class527_sub38.readUnsignedByte()];
				for (int i_7_ = 0; i_7_ < anIntArray8089.length; i_7_++)
					anIntArray8089[i_7_] = class527_sub38.readUnsignedByte();
			} else if (6 == i) {
				anIntArray8090 = new int[class527_sub38.readUnsignedByte()];
				for (int i_8_ = 0; i_8_ < anIntArray8090.length; i_8_++)
					anIntArray8090[i_8_] = class527_sub38.readUnsignedByte();
			}
		}
		if (null == anIntArray8086)
			throw new RuntimeException("");
	}

	void method10192(RSByteBuffer class527_sub38) {
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			if (i == 0)
				break;
			if (i == 1) {
				int i_9_ = class527_sub38.readUnsignedByte();
				anIntArray8086 = new int[i_9_];
				for (int i_10_ = 0; i_10_ < anIntArray8086.length; i_10_++) {
					anIntArray8086[i_10_] = class527_sub38.readUnsignedByte();
					if (0 != anIntArray8086[i_10_] && anIntArray8086[i_10_] != 2) {
						/* empty */
					}
				}
			} else if (3 == i)
				anInt8088 = class527_sub38.readUnsignedByte() * -2028894439;
			else if (i == 4)
				anInt8085 = class527_sub38.readUnsignedByte() * -1604547405;
			else if (i == 5) {
				anIntArray8089 = new int[class527_sub38.readUnsignedByte()];
				for (int i_11_ = 0; i_11_ < anIntArray8089.length; i_11_++)
					anIntArray8089[i_11_] = class527_sub38.readUnsignedByte();
			} else if (6 == i) {
				anIntArray8090 = new int[class527_sub38.readUnsignedByte()];
				for (int i_12_ = 0; i_12_ < anIntArray8090.length; i_12_++)
					anIntArray8090[i_12_] = class527_sub38.readUnsignedByte();
			}
		}
		if (null == anIntArray8086)
			throw new RuntimeException("");
	}

	static final void method10193(Class665 class665, int i) {
		boolean bool = ((class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]) != 0);
		if (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aClass633_12183 != null)
			Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aClass633_12183.method10479(bool, 1744374166);
	}
}
