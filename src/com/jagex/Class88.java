/* Class88 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class88 implements Interface14, Interface7 {
	public int anInt828;
	public int anInt829 = 0;
	public int anInt830;
	public int anInt831;

	void method1624(RSByteBuffer class527_sub38, int i, int i_0_) {
		if (i == 1)
			anInt829 = class527_sub38.readUnsignedByte() * 932424207;
		else if (2 == i)
			anInt831 = class527_sub38.readUnsignedShort() * 1040307623;
		else if (i == 3)
			anInt830 = class527_sub38.readUnsignedShort() * 175631495;
		else if (i == 4)
			anInt828 = class527_sub38.readShort() * 459341095;
	}

	public void method82(RSByteBuffer class527_sub38, int i) {
		for (;;) {
			int i_1_ = class527_sub38.readUnsignedByte();
			if (0 == i_1_)
				break;
			method1624(class527_sub38, i_1_, -1963646169);
		}
	}

	public void method16(int i, int i_2_) {
		/* empty */
	}

	void method1625(RSByteBuffer class527_sub38, int i) {
		if (i == 1)
			anInt829 = class527_sub38.readUnsignedByte() * 932424207;
		else if (2 == i)
			anInt831 = class527_sub38.readUnsignedShort() * 1040307623;
		else if (i == 3)
			anInt830 = class527_sub38.readUnsignedShort() * 175631495;
		else if (i == 4)
			anInt828 = class527_sub38.readShort() * 459341095;
	}

	public void method84() {
		/* empty */
	}

	public void method83(RSByteBuffer class527_sub38) {
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			if (0 == i)
				break;
			method1624(class527_sub38, i, -430516907);
		}
	}

	Class88() {
		anInt828 = 0;
		anInt830 = -1083951104;
		anInt831 = 246233088;
	}

	public void method85() {
		/* empty */
	}

	void method1626(RSByteBuffer class527_sub38, int i) {
		if (i == 1)
			anInt829 = class527_sub38.readUnsignedByte() * 932424207;
		else if (2 == i)
			anInt831 = class527_sub38.readUnsignedShort() * 1040307623;
		else if (i == 3)
			anInt830 = class527_sub38.readUnsignedShort() * 175631495;
		else if (i == 4)
			anInt828 = class527_sub38.readShort() * 459341095;
	}

	public void method60(int i) {
		/* empty */
	}

	void method1627(RSByteBuffer class527_sub38, int i) {
		if (i == 1)
			anInt829 = class527_sub38.readUnsignedByte() * 932424207;
		else if (2 == i)
			anInt831 = class527_sub38.readUnsignedShort() * 1040307623;
		else if (i == 3)
			anInt830 = class527_sub38.readUnsignedShort() * 175631495;
		else if (i == 4)
			anInt828 = class527_sub38.readShort() * 459341095;
	}

	public void method86(int i) {
		/* empty */
	}

	void method1628(RSByteBuffer class527_sub38, int i) {
		if (i == 1)
			anInt829 = class527_sub38.readUnsignedByte() * 932424207;
		else if (2 == i)
			anInt831 = class527_sub38.readUnsignedShort() * 1040307623;
		else if (i == 3)
			anInt830 = class527_sub38.readUnsignedShort() * 175631495;
		else if (i == 4)
			anInt828 = class527_sub38.readShort() * 459341095;
	}

	public void method73(RSByteBuffer class527_sub38) {
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			if (0 == i)
				break;
			method1624(class527_sub38, i, 414658435);
		}
	}

	static int method1629(Class527_Sub8_Sub7 class527_sub8_sub7, Class22 class22, int i) {
		String string = Class72.method1496(class527_sub8_sub7, (byte) -53);
		int[] is = Class700_Sub41.method17315(class527_sub8_sub7, -1419422402);
		if (is != null)
			string = new StringBuilder().append(string).append(Class370.method6358(is, 233982914)).toString();
		int i_3_ = class22.method781(string, Class191.aClass147Array2138, (short) 386);
		if (class527_sub8_sub7.aBool11645)
			i_3_ += Class452.aClass147_4962.method2407() + 4;
		return i_3_;
	}

	static final void method1630(Class665 class665, int i) {
		class665.anInt8526 -= 204761682;
		int i_4_ = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		int i_5_ = class665.anIntArray8525[1769813785 * class665.anInt8526 + 1];
		if (Class707.aBool8841) {
			Class188.method3663(3, i_4_, i_5_, false, (byte) -19);
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = Class56.aFrame711 != null ? 1 : 0;
		} else
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 0;
	}
}
