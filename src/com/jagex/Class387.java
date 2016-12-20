/* Class387 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class387 implements Interface47 {
	public int anInt3965;

	public static Class387 method6436(RSByteBuffer class527_sub38) {
		int i = class527_sub38.method16466(-2089278166);
		return new Class387(i);
	}

	public Class396 method334(int i) {
		return Class396.aClass396_4115;
	}

	public Class396 method333() {
		return Class396.aClass396_4115;
	}

	Class387(int i) {
		anInt3965 = -1849911685 * i;
	}

	static void method6437(int i) {
		if (Class440.method7115(client.anInt11048 * -1927019389, -342315329)) {
			if (client.aClass109_11066.method1967(2115025653) == null)
				Class78.method1560(1, (byte) 0);
			else
				Class78.method1560(0, (byte) 0);
		} else if (-1927019389 * client.anInt11048 == 1 || -1927019389 * client.anInt11048 == 3)
			Class78.method1560(16, (byte) 0);
		else if (4 == -1927019389 * client.anInt11048)
			Class78.method1560(16, (byte) 0);
	}

	static final void method6438(Class665 class665, byte i) {
		class665.anInt8526 -= 204761682;
		int i_0_ = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		int i_1_ = class665.anIntArray8525[class665.anInt8526 * 1769813785 + 1];
		Class6.method584(i_0_, new Class527_Sub41(i_1_, 3), null, true, 1876814482);
	}

	static final void method6439(Class665 class665, int i) {
		Class581.method9668((byte) 86);
	}

	static final void method6440(Class665 class665, byte i) {
		class665.anInt8526 -= 204761682;
		int i_2_ = class665.anIntArray8525[1769813785 * class665.anInt8526];
		int i_3_ = class665.anIntArray8525[1 + class665.anInt8526 * 1769813785];
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = client.aClass223_11241.method4154(i_2_, -650058816).method4077(i_3_, (byte) -27);
	}

	public static Class527_Sub8_Sub12 method6441(byte i) {
		return Class529_Sub1.aClass527_Sub8_Sub12_7123;
	}

	public static Class385 method6442(RSByteBuffer class527_sub38, int i) {
		int i_4_ = class527_sub38.readUnsignedByte();
		Class400 class400 = (Class183.method3556(-544828721)[class527_sub38.readUnsignedByte()]);
		Class384 class384 = (Class644.method10743(-1015693904)[class527_sub38.readUnsignedByte()]);
		int i_5_ = class527_sub38.readShort();
		int i_6_ = class527_sub38.readShort();
		int i_7_ = class527_sub38.readUnsignedShort();
		int i_8_ = class527_sub38.readUnsignedShort();
		int i_9_ = class527_sub38.readInt();
		int i_10_ = class527_sub38.readInt();
		int i_11_ = class527_sub38.readInt();
		boolean bool = class527_sub38.readUnsignedByte() == 1;
		return new Class385(i_4_, class400, class384, i_5_, i_6_, i_7_, i_8_, i_9_, i_10_, i_11_, bool);
	}

	static void method6443(Class243 class243, int i, int i_12_, int i_13_) {
		Class248 class248 = class243.method4524(Class402.aClass180_4150, 708326095);
		if (null != class248) {
			Class402.aClass180_4150.method3132(i, i_12_, class243.anInt2511 * -1054537975 + i, -1386504031 * class243.anInt2514 + i_12_);
			if (Class106.anInt1320 * 260225719 < 3) {
				int i_14_;
				if (-349191067 * Class30.anInt265 == 2)
					i_14_ = (int) -((double) Class208_Sub10.aClass296_Sub1_9923.method5382(1831952383) * 2607.5945876176133);
				else
					i_14_ = (int) -client.aFloat11112;
				i_14_ = -1946564250 * client.anInt11088 + i_14_ & 0x3fff;
				i_14_ <<= 2;
				Class178.aClass147_2056.method2427(((float) i + (float) (-1054537975 * class243.anInt2511) / 2.0F), ((float) i_12_ + (float) (-1386504031 * class243.anInt2514) / 2.0F), 4201, i_14_, class248.aClass142_2725, i, i_12_);
			} else
				Class402.aClass180_4150.method3169(-16777216, class248.aClass142_2725, i, i_12_);
		}
	}
}
