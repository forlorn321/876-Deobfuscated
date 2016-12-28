/* Class40 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class40 {
	public static String aString491;
	static String aString492 = "true";
	static String aString493;
	static String aString494;
	static String aString495;
	public static String aString496;
	static String aString497;

	Class40() throws Throwable {
		throw new Error();
	}

	public static String method868(int i) {
		return new StringBuilder().append("<img=").append(i).append(">").toString();
	}

	public static String method869(int i) {
		return new StringBuilder().append("<img=").append(i).append(">").toString();
	}

	static {
		aString491 = ",";
		aString493 = " (";
		aString494 = ")";
		aString495 = "->";
		aString496 = "<br>";
		aString497 = "</col>";
	}

	public static boolean decodeWorldListData(byte[] is, int i) {
		RSByteBuffer class536_sub33 = new RSByteBuffer(is);
		int i_0_ = class536_sub33.readUnsignedByte();
		if (2 != i_0_)
			return false;
		boolean bool = class536_sub33.readUnsignedByte() == 1;
		if (bool)
			Class100.decodeWorldDescriptors(class536_sub33, 1031291051);
		Class344.decodeWorldConnections(class536_sub33, 383327791);
		return true;
	}

	static void method871(Class668 class668, int i) {
		class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = (((QuestTypeDecoder) Class38.aClass53_Sub2_481.method70((class668.anIntArray8541[(class668.anInt8542 * 1867269829) - 2]), (byte) -47)).aStringArray3042[class668.anIntArray8541[1867269829 * class668.anInt8542 - 1]]);
		class668.anInt8542 -= 1472892954;
	}

	static Class205 method872(RSByteBuffer class536_sub33, int i) {
		int i_1_ = class536_sub33.readUnsignedByte();
		Class79 class79 = Class205.method2949(i_1_, -1870301746);
		Class205 class205 = null;
		switch (class79.anInt855 * -1314982477) {
		case 12:
			class205 = new Class205_Sub5(class536_sub33);
			break;
		case 15:
			class205 = new Class205_Sub12(class536_sub33);
			break;
		case 22:
			class205 = new Class205_Sub15(class536_sub33);
			break;
		case 19:
			class205 = new Class205_Sub17(class536_sub33);
			break;
		case 21:
			class205 = new Class205_Sub22(class536_sub33);
			break;
		case 30:
			class205 = new Class205_Sub11(class536_sub33);
			break;
		case 23:
			class205 = new Class205_Sub1(class536_sub33);
			break;
		case 11:
			class205 = new Class205_Sub13(class536_sub33);
			break;
		case 20:
			class205 = new Class205_Sub10(class536_sub33, false);
			break;
		case 24:
			class205 = new Class205_Sub21(class536_sub33);
			break;
		case 28:
			class205 = new Class205_Sub7(class536_sub33);
			break;
		case 10:
			class205 = new Class205_Sub14(class536_sub33, 1, 0);
			break;
		case 26:
			class205 = new Class205_Sub2(class536_sub33);
			break;
		case 4:
			class205 = new Class205_Sub18(class536_sub33);
			break;
		case 18:
			class205 = new Class205_Sub20(class536_sub33);
			break;
		case 13:
			class205 = new Class205_Sub14(class536_sub33, 1, 1);
			break;
		case 3:
			class205 = new Class205_Sub19(class536_sub33);
			break;
		case 1:
			class205 = new Class205_Sub14(class536_sub33, 0, 0);
			break;
		case 17:
			class205 = new Class205_Sub4_Sub2(class536_sub33);
			break;
		case 8:
			class205 = new Class205_Sub10(class536_sub33, true);
			break;
		case 29:
			class205 = new Class205_Sub14(class536_sub33, 0, 1);
			break;
		default:
			break;
		case 25:
			class205 = new Class205_Sub23(class536_sub33);
			break;
		case 14:
			class205 = new Class205_Sub6(class536_sub33);
			break;
		case 5:
			class205 = new Class205_Sub8(class536_sub33);
			break;
		case 2:
			class205 = new Class205_Sub3(class536_sub33);
			break;
		case 7:
			class205 = new Class205_Sub4_Sub1(class536_sub33);
			break;
		case 0:
			class205 = new Class205_Sub16(class536_sub33);
			break;
		case 9:
			class205 = new Class205_Sub9(class536_sub33);
		}
		return class205;
	}

	public static void method873(int i) {
		int i_2_ = client.aClass515_11066.method6321((byte) -46);
		int i_3_ = client.aClass515_11066.method6243(177401017);
		Class315_Sub1_Sub1.aBoolArrayArray11398 = new boolean[i_2_ >> 3][i_3_ >> 3];
	}

	static void method874(Class668 class668, int i) {
		QuestTypeDecoder class277 = ((QuestTypeDecoder) Class38.aClass53_Sub2_481.method70((class668.anIntArray8541[((class668.anInt8542 -= -1411037171) * 1867269829)]), (byte) 3));
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = (class277.anIntArray3044 == null ? 0 : class277.anIntArray3044.length);
	}
}
