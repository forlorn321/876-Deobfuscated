/* Class660 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class660 implements Interface14, Interface7 {
	public int anInt8498 = 0;
	static final int anInt8499 = 1190717;
	public int anInt8500;
	public int anInt8501 = -845580999;
	public boolean aBool8502 = true;
	public int anInt8503;
	public int anInt8504;
	public int anInt8505 = -1046254465;
	public int anInt8506;
	public boolean aBool8507;
	public int anInt8508;
	int anInt8509;
	public boolean aBool8510;
	public int anInt8511;
	public int anInt8512;
	public int anInt8513;

	static int method11014(int i) {
		if (16711935 == i)
			return -1;
		return Class57.method1365(i, 1859361840);
	}

	public void method82(RSByteBuffer class527_sub38, int i) {
		for (;;) {
			int i_0_ = class527_sub38.readUnsignedByte();
			if (i_0_ == 0)
				break;
			method11016(class527_sub38, i_0_, -1097820699);
		}
	}

	public void method60(int i) {
		anInt8509 = i * 1516987325;
	}

	Class660() {
		anInt8504 = 1032071680;
		aBool8510 = true;
		anInt8500 = -181960120;
		aBool8507 = false;
		anInt8508 = 1899303369;
		anInt8506 = 1906868928;
		anInt8512 = 765094033;
		anInt8511 = -1082686907;
		anInt8503 = 0;
		anInt8513 = -1192915776;
	}

	public void method16(int i, int i_1_) {
		anInt8509 = i * 1516987325;
	}

	public void method83(RSByteBuffer class527_sub38) {
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			if (i == 0)
				break;
			method11016(class527_sub38, i, 91847731);
		}
	}

	public void method73(RSByteBuffer class527_sub38) {
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			if (i == 0)
				break;
			method11016(class527_sub38, i, -1961377452);
		}
	}

	public void method85() {
		anInt8500 = ((anInt8500 * 194118137 << 8 | anInt8509 * 1614835605) * 2124738633);
	}

	public void method86(int i) {
		anInt8500 = ((anInt8500 * 194118137 << 8 | anInt8509 * 1614835605) * 2124738633);
	}

	public void method84() {
		anInt8500 = ((anInt8500 * 194118137 << 8 | anInt8509 * 1614835605) * 2124738633);
	}

	void method11015(RSByteBuffer class527_sub38, int i) {
		if (1 == i)
			anInt8498 = Class271.method5074(class527_sub38.read24BitUnsignedInteger(1176354116), (byte) 111) * -2074997671;
		else if (2 == i)
			anInt8501 = class527_sub38.readUnsignedByte() * 845580999;
		else if (i == 3) {
			anInt8501 = class527_sub38.readUnsignedShort() * 845580999;
			if (65535 == 482678519 * anInt8501)
				anInt8501 = -845580999;
		} else if (i == 5)
			aBool8502 = false;
		else if (i == 7)
			anInt8505 = Class271.method5074(class527_sub38.read24BitUnsignedInteger(1009509056), (byte) 73) * 1046254465;
		else if (8 != i) {
			if (i == 9)
				anInt8504 = (class527_sub38.readUnsignedShort() << 2) * 765379093;
			else if (10 == i)
				aBool8510 = false;
			else if (11 == i)
				anInt8500 = class527_sub38.readUnsignedByte() * 2124738633;
			else if (i == 12)
				aBool8507 = true;
			else if (i == 13)
				anInt8508 = class527_sub38.read24BitUnsignedInteger(654036311) * 1080105341;
			else if (i == 14)
				anInt8506 = ((class527_sub38.readUnsignedByte() << 2) * -574184949);
			else if (16 == i)
				anInt8512 = class527_sub38.readUnsignedByte() * 1047266927;
			else if (20 == i)
				anInt8511 = class527_sub38.readUnsignedShort() * 1550818427;
			else if (i == 21)
				anInt8503 = class527_sub38.readUnsignedByte() * 99795185;
			else if (i == 22)
				anInt8513 = class527_sub38.readUnsignedShort() * -622619085;
		}
	}

	void method11016(RSByteBuffer class527_sub38, int i, int i_2_) {
		if (1 == i)
			anInt8498 = Class271.method5074(class527_sub38.read24BitUnsignedInteger(720862932), (byte) 88) * -2074997671;
		else if (2 == i)
			anInt8501 = class527_sub38.readUnsignedByte() * 845580999;
		else if (i == 3) {
			anInt8501 = class527_sub38.readUnsignedShort() * 845580999;
			if (65535 == 482678519 * anInt8501)
				anInt8501 = -845580999;
		} else if (i == 5)
			aBool8502 = false;
		else if (i == 7)
			anInt8505 = Class271.method5074(class527_sub38.read24BitUnsignedInteger(1611676846), (byte) 65) * 1046254465;
		else if (8 != i) {
			if (i == 9)
				anInt8504 = (class527_sub38.readUnsignedShort() << 2) * 765379093;
			else if (10 == i)
				aBool8510 = false;
			else if (11 == i)
				anInt8500 = class527_sub38.readUnsignedByte() * 2124738633;
			else if (i == 12)
				aBool8507 = true;
			else if (i == 13)
				anInt8508 = class527_sub38.read24BitUnsignedInteger(150894560) * 1080105341;
			else if (i == 14)
				anInt8506 = ((class527_sub38.readUnsignedByte() << 2) * -574184949);
			else if (16 == i)
				anInt8512 = class527_sub38.readUnsignedByte() * 1047266927;
			else if (20 == i)
				anInt8511 = class527_sub38.readUnsignedShort() * 1550818427;
			else if (i == 21)
				anInt8503 = class527_sub38.readUnsignedByte() * 99795185;
			else if (i == 22)
				anInt8513 = class527_sub38.readUnsignedShort() * -622619085;
		}
	}

	static int method11017(int i) {
		if (16711935 == i)
			return -1;
		return Class57.method1365(i, 2016233837);
	}

	static final void method11018(Class665 class665, byte i) {
		Class278.method5165((String) (class665.anObjectArray8541[((class665.anInt8528 -= 433009517) * 318492261)]), (byte) -113);
	}

	static final void method11019(Class665 class665, byte i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = 44791937 * Class3.aClass13_34.anInt181;
	}

	static final void method11020(Class665 class665, int i) {
		int i_3_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class249 class249 = ((Class249) Class457.aClass24_Sub12_5063.method81(i_3_, -864431398));
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = -1771553873 * class249.anInt2777;
	}

	static String method11021(long l, int i, int i_4_) {
		Class565.method9496(l);
		int i_5_ = Class85.aCalendar816.get(5);
		int i_6_ = Class85.aCalendar816.get(2) + 1;
		int i_7_ = Class85.aCalendar816.get(1);
		return new StringBuilder().append(Integer.toString(i_5_ / 10)).append(i_5_ % 10).append("/").append(i_6_ / 10).append(i_6_ % 10).append("/").append(i_7_ % 100 / 10).append(i_7_ % 10).toString();
	}
}
