/* Class639_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class639_Sub1 extends Class639 {
	void method10604(RSByteBuffer class527_sub38, Class527_Sub34 class527_sub34) {
		/* empty */
	}

	void method10594(RSByteBuffer class527_sub38, Class527_Sub34 class527_sub34) {
		/* empty */
	}

	boolean method10577(int i) {
		return (method16870(731887180) != null || (-2812603364086814583L * aLong8322 < Class234.method4347(-1408626088) - 2000L));
	}

	Class527_Sub15 method10589() {
		return Class70.method1489(OutgoingPacket.aClass414_4472, client.aClass109_11067.aClass2_1367, (byte) -44);
	}

	Class527_Sub15 method10586(int i) {
		return Class70.method1489(OutgoingPacket.aClass414_4472, client.aClass109_11067.aClass2_1367, (byte) 64);
	}

	void method10583(RSByteBuffer class527_sub38, Class527_Sub34 class527_sub34, byte i) {
		/* empty */
	}

	int method10580(int i) {
		return 0;
	}

	boolean method10581() {
		return (method16870(1686256269) != null || (-2812603364086814583L * aLong8322 < Class234.method4347(-1408626088) - 2000L));
	}

	boolean method10588() {
		return (method16870(-2135762563) != null || (-2812603364086814583L * aLong8322 < Class234.method4347(-1408626088) - 2000L));
	}

	Class527_Sub34 method16870(int i) {
		return ((Class527_Sub34) client.aClass694_11278.method14081((short) -4412));
	}

	void method10584(int i) {
		Class527_Sub34 class527_sub34 = method16870(402713115);
		if (null != class527_sub34) {
			int i_0_ = method10587(class527_sub34, 32767, -1729826532);
			int i_1_ = class527_sub34.method16357(719777205);
			if (i_1_ < 0)
				i_1_ = 0;
			else if (i_1_ > 65535)
				i_1_ = 65535;
			int i_2_ = class527_sub34.method16356(1319623125);
			if (i_2_ < 0)
				i_2_ = 0;
			else if (i_2_ > 65535)
				i_2_ = 65535;
			int i_3_ = 0;
			if (class527_sub34.method16355(1029210433) == 2)
				i_3_ = 1;
			Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4457, client.aClass109_11067.aClass2_1367, (byte) -34);
			class527_sub15.buffer.writeIntV2(i_2_ | i_1_ << 16, (byte) 72);
			class527_sub15.buffer.writeShortLE128(i_0_ | i_3_ << 15, 2096488306);
			client.aClass109_11067.method1969(class527_sub15, (byte) 1);
		}
	}

	Class527_Sub15 method10585() {
		return Class70.method1489(OutgoingPacket.aClass414_4472, client.aClass109_11067.aClass2_1367, (byte) 32);
	}

	int method10592() {
		return 0;
	}

	Class639_Sub1() {
		/* empty */
	}

	void method10607() {
		Class527_Sub34 class527_sub34 = method16870(-346886634);
		if (null != class527_sub34) {
			int i = method10587(class527_sub34, 32767, -1729826532);
			int i_4_ = class527_sub34.method16357(719777205);
			if (i_4_ < 0)
				i_4_ = 0;
			else if (i_4_ > 65535)
				i_4_ = 65535;
			int i_5_ = class527_sub34.method16356(1319623125);
			if (i_5_ < 0)
				i_5_ = 0;
			else if (i_5_ > 65535)
				i_5_ = 65535;
			int i_6_ = 0;
			if (class527_sub34.method16355(1029210433) == 2)
				i_6_ = 1;
			Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4457, client.aClass109_11067.aClass2_1367, (byte) -80);
			class527_sub15.buffer.writeIntV2(i_5_ | i_4_ << 16, (byte) 75);
			class527_sub15.buffer.writeShortLE128(i | i_6_ << 15, 1479233462);
			client.aClass109_11067.method1969(class527_sub15, (byte) 1);
		}
	}

	int method10593() {
		return 0;
	}

	Class527_Sub15 method10595() {
		return Class70.method1489(OutgoingPacket.aClass414_4472, client.aClass109_11067.aClass2_1367, (byte) -92);
	}

	void method10608() {
		Class527_Sub34 class527_sub34 = method16870(219241453);
		if (null != class527_sub34) {
			int i = method10587(class527_sub34, 32767, -1729826532);
			int i_7_ = class527_sub34.method16357(719777205);
			if (i_7_ < 0)
				i_7_ = 0;
			else if (i_7_ > 65535)
				i_7_ = 65535;
			int i_8_ = class527_sub34.method16356(1319623125);
			if (i_8_ < 0)
				i_8_ = 0;
			else if (i_8_ > 65535)
				i_8_ = 65535;
			int i_9_ = 0;
			if (class527_sub34.method16355(1029210433) == 2)
				i_9_ = 1;
			Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4457, client.aClass109_11067.aClass2_1367, (byte) -63);
			class527_sub15.buffer.writeIntV2(i_8_ | i_7_ << 16, (byte) 123);
			class527_sub15.buffer.writeShortLE128(i | i_9_ << 15, 2034956663);
			client.aClass109_11067.method1969(class527_sub15, (byte) 1);
		}
	}

	void method10609() {
		Class527_Sub34 class527_sub34 = method16870(-1893853947);
		if (null != class527_sub34) {
			int i = method10587(class527_sub34, 32767, -1729826532);
			int i_10_ = class527_sub34.method16357(719777205);
			if (i_10_ < 0)
				i_10_ = 0;
			else if (i_10_ > 65535)
				i_10_ = 65535;
			int i_11_ = class527_sub34.method16356(1319623125);
			if (i_11_ < 0)
				i_11_ = 0;
			else if (i_11_ > 65535)
				i_11_ = 65535;
			int i_12_ = 0;
			if (class527_sub34.method16355(1029210433) == 2)
				i_12_ = 1;
			Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4457, client.aClass109_11067.aClass2_1367, (byte) 50);
			class527_sub15.buffer.writeIntV2(i_11_ | i_10_ << 16, (byte) 28);
			class527_sub15.buffer.writeShortLE128(i | i_12_ << 15, 1846482708);
			client.aClass109_11067.method1969(class527_sub15, (byte) 1);
		}
	}

	public static final void method16871(byte i) {
		int i_13_ = Class204.aClass527_Sub31_2213.aClass700_Sub13_10608.method16964((byte) -45);
		if (i_13_ == 0) {
			client.aClass509_11072.method8299(null, (byte) -30);
			Class208_Sub6.method15609(0, -1053237133);
		} else if (1 == i_13_ || 3 == i_13_) {
			Class669.method13759((byte) 0, (byte) 127);
			Class208_Sub6.method15609(512, -1053237133);
			if (client.aClass509_11072.method8314(1478789658) != null)
				Class672.method13827(1744059603);
		} else {
			Class669.method13759((byte) (1429404695 * client.anInt11129 - 4 & 0xff), (byte) 79);
			Class208_Sub6.method15609(2, -1053237133);
		}
		client.anInt11319 = Class673.anInt8585 * 391298569;
	}
}
