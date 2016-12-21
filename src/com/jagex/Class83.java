/* Class83 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class83 {
	public Interface49[] anInterface49Array863;

	void method1171(RSByteBuffer class536_sub33) {
		anInterface49Array863 = new Interface49[class536_sub33.readUnsignedByte()];
		Class390[] class390s = Class270.method3714((byte) 94);
		for (int i = 0; i < anInterface49Array863.length; i++)
			anInterface49Array863[i] = method1173(class536_sub33, class390s[class536_sub33.readUnsignedByte()], -1278413334);
	}

	void method1172(RSByteBuffer class536_sub33) {
		anInterface49Array863 = new Interface49[class536_sub33.readUnsignedByte()];
		Class390[] class390s = Class270.method3714((byte) 109);
		for (int i = 0; i < anInterface49Array863.length; i++)
			anInterface49Array863[i] = method1173(class536_sub33, class390s[class536_sub33.readUnsignedByte()], -2071266229);
	}

	Interface49 method1173(RSByteBuffer class536_sub33, Class390 class390, int i) {
		if (Class390.aClass390_4056 == class390)
			return Class205_Sub11.method9070(class536_sub33, -968769098);
		if (class390 == Class390.aClass390_4049)
			return RSByteBuffer.method9791(class536_sub33, 2032205958);
		if (Class390.aClass390_4052 == class390)
			return Class703.method8257(class536_sub33, (byte) 44);
		if (class390 == Class390.aClass390_4050)
			return Class164.method1974(class536_sub33, -166070826);
		if (Class390.aClass390_4053 == class390)
			return Class390.method4854(class536_sub33, (byte) -104);
		if (class390 == Class390.aClass390_4059)
			return Class705.method8275(class536_sub33, -1479101078);
		if (class390 == Class390.aClass390_4051)
			return Class676.method8040(class536_sub33, (byte) -83);
		if (Class390.aClass390_4054 == class390)
			return Class306.method4119(class536_sub33, 818142368);
		if (class390 == Class390.aClass390_4048)
			return Class536_Sub23.method9583(class536_sub33, -683453912);
		if (Class390.aClass390_4057 == class390)
			return Class536_Sub39.method9849(class536_sub33, (byte) -35);
		if (Class390.aClass390_4058 == class390)
			return Class109.method1449(class536_sub33, -1852237044);
		return null;
	}

	void method1174(RSByteBuffer class536_sub33) {
		anInterface49Array863 = new Interface49[class536_sub33.readUnsignedByte()];
		Class390[] class390s = Class270.method3714((byte) 97);
		for (int i = 0; i < anInterface49Array863.length; i++)
			anInterface49Array863[i] = method1173(class536_sub33, class390s[class536_sub33.readUnsignedByte()], -875760412);
	}

	Class83() {
		/* empty */
	}

	void method1175(RSByteBuffer class536_sub33, int i) {
		anInterface49Array863 = new Interface49[class536_sub33.readUnsignedByte()];
		Class390[] class390s = Class270.method3714((byte) 106);
		for (int i_0_ = 0; i_0_ < anInterface49Array863.length; i_0_++)
			anInterface49Array863[i_0_] = method1173(class536_sub33, class390s[class536_sub33.readUnsignedByte()], -417407818);
	}

	static final void method1176(Class668 class668, byte i) {
		class668.anInt8544 -= -402808782;
		String string = ((String) class668.anObjectArray8543[366709801 * class668.anInt8544]);
		String string_1_ = ((String) class668.anObjectArray8543[1 + class668.anInt8544 * 366709801]);
		int i_2_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = string.indexOf(string_1_, i_2_);
	}

	static final String method1177(String string, String string_3_, String string_4_, int i) {
		for (int i_5_ = string.indexOf(string_3_); -1 != i_5_; i_5_ = string.indexOf(string_3_, i_5_ + string_4_.length()))
			string = new StringBuilder().append(string.substring(0, i_5_)).append(string_4_).append(string.substring(i_5_ + string_3_.length())).toString();
		return string;
	}
}
