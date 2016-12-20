/* Class208 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class208 {
	public int anInt2233;
	static int anInt2234;
	public static int[] anIntArray2235;

	boolean method3845() {
		return true;
	}

	public abstract void method3846(int i);

	Class208(RSByteBuffer class527_sub38) {
		anInt2233 = class527_sub38.readUnsignedShort() * -1528776629;
	}

	boolean method3847(byte i) {
		return true;
	}

	public abstract void method3848();

	boolean method3849() {
		return true;
	}

	void method3850(byte i) {
		/* empty */
	}

	public abstract void method3851();

	void method3852() {
		/* empty */
	}

	void method3853() {
		/* empty */
	}

	void method3854() {
		/* empty */
	}

	static Class208 method3855(RSByteBuffer class527_sub38) {
		int i = class527_sub38.readUnsignedByte();
		Class92 class92 = Class306.method5605(i, (byte) 10);
		Class208 class208 = null;
		switch (class92.anInt880 * -1994424493) {
		case 14:
			class208 = new Class208_Sub6(class527_sub38);
			break;
		case 29:
			class208 = new Class208_Sub18(class527_sub38);
			break;
		case 1:
			class208 = new Class208_Sub20(class527_sub38);
			break;
		case 15:
			class208 = new Class208_Sub9(class527_sub38);
			break;
		case 26:
			class208 = new Class208_Sub22(class527_sub38);
			break;
		case 20:
			class208 = new Class208_Sub21(class527_sub38, true);
			break;
		case 8:
			class208 = new Class208_Sub3(class527_sub38);
			break;
		case 12:
			class208 = new Class208_Sub8(class527_sub38);
			break;
		case 28:
			class208 = new Class208_Sub1(class527_sub38);
			break;
		case 0:
			class208 = new Class208_Sub19(class527_sub38);
			break;
		case 16:
			class208 = new Class208_Sub21(class527_sub38, false);
			break;
		case 18:
			class208 = new Class208_Sub12_Sub2(class527_sub38);
			break;
		case 4:
			class208 = new Class208_Sub14(class527_sub38);
			break;
		case 22:
			class208 = new Class208_Sub17(class527_sub38);
			break;
		case 6:
			class208 = new Class208_Sub15(class527_sub38);
			break;
		case 9:
			class208 = new Class208_Sub11(class527_sub38);
			break;
		case 27:
			class208 = new Class208_Sub10(class527_sub38);
			break;
		case 2:
			class208 = new Class208_Sub4(class527_sub38);
			break;
		case 7:
			class208 = new Class208_Sub7(class527_sub38, 0, 0);
			break;
		case 10:
			class208 = new Class208_Sub5(class527_sub38);
			break;
		case 23:
			class208 = new Class208_Sub7(class527_sub38, 1, 1);
			break;
		case 5:
			class208 = new Class208_Sub16(class527_sub38);
			break;
		default:
			break;
		case 11:
			class208 = new Class208_Sub13(class527_sub38);
			break;
		case 17:
			class208 = new Class208_Sub23(class527_sub38);
			break;
		case 21:
			class208 = new Class208_Sub2(class527_sub38);
			break;
		case 3:
			class208 = new Class208_Sub7(class527_sub38, 1, 0);
			break;
		case 25:
			class208 = new Class208_Sub7(class527_sub38, 0, 1);
			break;
		case 24:
			class208 = new Class208_Sub12_Sub1(class527_sub38);
		}
		return class208;
	}

	static final void method3856(Class665 class665, int i) {
		int i_0_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_0_, -111915043);
		Class72.method1500(class243, class665, (byte) -37);
	}

	static final void method3857(Class665 class665, int i) {
		class665.anInt8526 -= 204761682;
		int i_1_ = class665.anIntArray8525[1769813785 * class665.anInt8526];
		int i_2_ = class665.anIntArray8525[1 + class665.anInt8526 * 1769813785];
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = (Class708.aClass463_8847.method7621(i_1_, 1316116381).aCharArray11867[i_2_]);
	}

	public static Class611[] method3858(int i) {
		return (new Class611[] { Class611.aClass611_8002, Class611.aClass611_8007, Class611.aClass611_8003, Class611.aClass611_8004, Class611.aClass611_8006, Class611.aClass611_8005 });
	}

	static void method3859(String string, String string_3_, String string_4_, boolean bool, boolean bool_5_, int i) {
		Class109 class109 = Class203.method3782((byte) -1);
		if (class109.method1967(2145149294) != null) {
			Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4430, class109.aClass2_1367, (byte) 28);
			class527_sub15.buffer.writeShort((Class208_Sub18.method15632(string, (byte) -124) + Class208_Sub18.method15632(string_3_, (byte) -83) + Class208_Sub18.method15632(string_4_, (byte) -51) + 1), 1404835786);
			class527_sub15.buffer.writeString(string, -161531603);
			class527_sub15.buffer.writeString(string_3_, 513647388);
			class527_sub15.buffer.writeString(string_4_, 267919863);
			int i_6_ = 0;
			if (bool)
				i_6_ |= 0x1;
			if (bool_5_)
				i_6_ |= 0x2;
			class527_sub15.buffer.writeByte(i_6_, 343702949);
			class109.method1969(class527_sub15, (byte) 1);
		}
	}
}
