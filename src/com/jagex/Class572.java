/* Class572 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class572 implements Interface65 {
	int anInt7625;
	int anInt7626;

	Class572(int i, int i_0_) {
		anInt7626 = -508652777 * i;
		anInt7625 = i_0_ * 1226020057;
	}

	public boolean method420(Class527_Sub34 class527_sub34, Interface64[] interface64s, int i, Class554 class554, byte i_1_) {
		for (int i_2_ = 0; i_2_ < i && i_2_ < interface64s.length; i_2_++) {
			Interface64 interface64 = interface64s[i_2_];
			if (null != interface64 && interface64.method396(754050486) == 847893671 * anInt7626 && interface64.method415(-864137654) == 1409526633 * anInt7625)
				return true;
		}
		return false;
	}

	static Class572 method9604(RSByteBuffer class527_sub38) {
		int i = class527_sub38.readUnsignedByte();
		int i_3_ = class527_sub38.readUnsignedByte();
		return new Class572(i, i_3_);
	}

	static Class572 method9605(RSByteBuffer class527_sub38) {
		int i = class527_sub38.readUnsignedByte();
		int i_4_ = class527_sub38.readUnsignedByte();
		return new Class572(i, i_4_);
	}

	static Class572 method9606(RSByteBuffer class527_sub38) {
		int i = class527_sub38.readUnsignedByte();
		int i_5_ = class527_sub38.readUnsignedByte();
		return new Class572(i, i_5_);
	}

	public boolean method419(Class527_Sub34 class527_sub34, Interface64[] interface64s, int i, Class554 class554) {
		for (int i_6_ = 0; i_6_ < i && i_6_ < interface64s.length; i_6_++) {
			Interface64 interface64 = interface64s[i_6_];
			if (null != interface64 && interface64.method396(1299006652) == 847893671 * anInt7626 && interface64.method415(250015200) == 1409526633 * anInt7625)
				return true;
		}
		return false;
	}

	static void method9607(Class665 class665, byte i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class208_Sub11.method15616(Class402.aClass180_4150, 2100982645);
	}

	public static void method9608(int i, int i_7_, int i_8_, boolean bool, int i_9_) {
		Class527_Sub8_Sub12 class527_sub8_sub12 = Class529_Sub1.aClass527_Sub8_Sub12_7123;
		Class529_Sub1.method8749(i);
		Class529_Sub1.aBool7172 = false;
		if (class527_sub8_sub12 != Class529_Sub1.aClass527_Sub8_Sub12_7123)
			Class592.method9876((byte) -12);
		Class529_Sub1.anInt10776 = 974227339 * i_7_;
		Class529_Sub1.anInt10777 = i_8_ * -1984324647;
		Class529_Sub1.aBool10778 = bool;
	}

	static final void method9609(Class665 class665, byte i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class498.aString5584.startsWith("mac") ? 1 : 0;
	}
}
