/* Class353 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class353 {
	static final int anInt3732 = 2;
	long aLong3733;
	Class708 aClass708_3734;
	static final int anInt3735 = 1;
	long aLong3736 = -3913866828255632411L;
	static final int anInt3737 = 3;
	static final int anInt3738 = 4;
	static final int anInt3739 = 5;
	public static int anInt3740;

	public Class353(RSByteBuffer class536_sub33) {
		aClass708_3734 = new Class708();
		method4642(class536_sub33, (byte) -47);
	}

	void method4642(RSByteBuffer class536_sub33, byte i) {
		aLong3733 = class536_sub33.method9711(702869087) * 7828786957485518831L;
		aLong3736 = class536_sub33.method9711(702869087) * 3913866828255632411L;
		for (int i_0_ = class536_sub33.readUnsignedByte(); i_0_ != 0; i_0_ = class536_sub33.readUnsignedByte()) {
			Class536_Sub24 class536_sub24;
			if (i_0_ == 1)
				class536_sub24 = new Class536_Sub24_Sub2(this);
			else if (i_0_ == 4)
				class536_sub24 = new Class536_Sub24_Sub5(this);
			else if (3 == i_0_)
				class536_sub24 = new Class536_Sub24_Sub4(this);
			else if (2 == i_0_)
				class536_sub24 = new Class536_Sub24_Sub1(this);
			else if (i_0_ == 5)
				class536_sub24 = new Class536_Sub24_Sub3(this);
			else
				throw new RuntimeException("");
			class536_sub24.method9585(class536_sub33, 1068373810);
			aClass708_3734.method8335(class536_sub24, -1070277825);
		}
	}

	public void method4643(Class536_Sub15 class536_sub15, int i) {
		if ((-6909195213925454795L * class536_sub15.aLong7133 != -1183593751974355185L * aLong3733) || (class536_sub15.aLong10484 * 7994147041570885677L != aLong3736 * 2552204525009362451L))
			throw new RuntimeException("");
		for (Class536_Sub24 class536_sub24 = (Class536_Sub24) aClass708_3734.method8308(1867269829); class536_sub24 != null; class536_sub24 = (Class536_Sub24) aClass708_3734.method8311(1975091977))
			class536_sub24.method9584(class536_sub15, 1500037355);
		class536_sub15.aLong10484 += -6958170873332875355L;
	}

	void method4644(RSByteBuffer class536_sub33) {
		aLong3733 = class536_sub33.method9711(702869087) * 7828786957485518831L;
		aLong3736 = class536_sub33.method9711(702869087) * 3913866828255632411L;
		for (int i = class536_sub33.readUnsignedByte(); i != 0; i = class536_sub33.readUnsignedByte()) {
			Class536_Sub24 class536_sub24;
			if (i == 1)
				class536_sub24 = new Class536_Sub24_Sub2(this);
			else if (i == 4)
				class536_sub24 = new Class536_Sub24_Sub5(this);
			else if (3 == i)
				class536_sub24 = new Class536_Sub24_Sub4(this);
			else if (2 == i)
				class536_sub24 = new Class536_Sub24_Sub1(this);
			else if (i == 5)
				class536_sub24 = new Class536_Sub24_Sub3(this);
			else
				throw new RuntimeException("");
			class536_sub24.method9585(class536_sub33, -1022723097);
			aClass708_3734.method8335(class536_sub24, 462549691);
		}
	}

	static final void method4645(Class668 class668, int i) {
		class668.anInt8544 -= -402808782;
		Class242.method3397((String) (class668.anObjectArray8543[366709801 * class668.anInt8544]), (String) (class668.anObjectArray8543[1 + 366709801 * class668.anInt8544]), "", class668.anIntArray8541[((class668.anInt8542 -= -1411037171) * 1867269829)] == 1, false, -432846471);
	}

	static final void method4646(Class668 class668, int i) {
		Class706.method8297((byte) -80);
	}

	static final void method4647(Class668 class668, byte i) {
		class668.aLongArray8538[(class668.anIntArray8537[class668.anInt8564 * -1640738851])] = (class668.aLongArray8565[(class668.anInt8546 -= 1792517805) * 1346022693]);
	}

	static final void method4648(Class251 class251, Class234 class234, Class668 class668, byte i) {
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		if (Class510.method6183(string, class668, -1490832696) != null)
			string = string.substring(0, string.length() - 1);
		class251.anObjectArray2706 = Class33.method796(string, class668, (short) -17682);
		class251.aBool2666 = true;
	}

	static final void method4649(Class668 class668, int i) {
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		StringBuilder stringbuilder = new StringBuilder(string.length());
		boolean bool = false;
		for (int i_1_ = 0; i_1_ < string.length(); i_1_++) {
			char c = string.charAt(i_1_);
			if (c == '<')
				bool = true;
			else if ('>' == c)
				bool = false;
			else if (!bool)
				stringbuilder.append(c);
		}
		class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = stringbuilder.toString();
	}
}
