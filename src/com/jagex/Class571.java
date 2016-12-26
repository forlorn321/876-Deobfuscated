/* Class571 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class571 implements Interface68 {
	Class52 aClass52_7630;
	String aString7631;
	String aString7632;
	int anInt7633;

	public void method131() {
		Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.aClass414_4483, client.aClass106_11322.aClass15_1258, 1897283967);
		int i = ((class536_sub23.aClass536_Sub33_Sub2_10528.off += 516175515) * -810172525);
		class536_sub23.aClass536_Sub33_Sub2_10528.writeByte(aClass52_7630.method78());
		class536_sub23.aClass536_Sub33_Sub2_10528.writeString(aString7631);
		class536_sub23.aClass536_Sub33_Sub2_10528.writeShort(anInt7633 * -1085104049, -1778059594);
		class536_sub23.aClass536_Sub33_Sub2_10528.writeString(Class497.aString5549);
		if (aString7632 != null) {
			class536_sub23.aClass536_Sub33_Sub2_10528.writeByte(1);
			String string = aString7632;
			if (string.length() > 100)
				string = string.substring(0, 100);
			class536_sub23.aClass536_Sub33_Sub2_10528.writeString(string);
		} else
			class536_sub23.aClass536_Sub33_Sub2_10528.writeByte(0);
		class536_sub23.aClass536_Sub33_Sub2_10528.method9699((-810172525 * class536_sub23.aClass536_Sub33_Sub2_10528.off - i), 342349724);
		client.aClass106_11322.method1409(class536_sub23, 865485490);
	}

	Class571(Class52 class52, String string, int i, Throwable throwable) {
		aClass52_7630 = class52;
		aString7631 = string;
		anInt7633 = 224425647 * i;
		aString7632 = throwable != null ? throwable.getMessage() : null;
	}

	public void method296() {
		Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.aClass414_4483, client.aClass106_11322.aClass15_1258, 1380197153);
		int i = ((class536_sub23.aClass536_Sub33_Sub2_10528.off += 516175515) * -810172525);
		class536_sub23.aClass536_Sub33_Sub2_10528.writeByte(aClass52_7630.method78());
		class536_sub23.aClass536_Sub33_Sub2_10528.writeString(aString7631);
		class536_sub23.aClass536_Sub33_Sub2_10528.writeShort(anInt7633 * -1085104049, -1778059594);
		class536_sub23.aClass536_Sub33_Sub2_10528.writeString(Class497.aString5549);
		if (aString7632 != null) {
			class536_sub23.aClass536_Sub33_Sub2_10528.writeByte(1);
			String string = aString7632;
			if (string.length() > 100)
				string = string.substring(0, 100);
			class536_sub23.aClass536_Sub33_Sub2_10528.writeString(string);
		} else
			class536_sub23.aClass536_Sub33_Sub2_10528.writeByte(0);
		class536_sub23.aClass536_Sub33_Sub2_10528.method9699((-810172525 * class536_sub23.aClass536_Sub33_Sub2_10528.off - i), -548849881);
		client.aClass106_11322.method1409(class536_sub23, 826244600);
	}

	public void method206(int i) {
		Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.aClass414_4483, client.aClass106_11322.aClass15_1258, 1581434232);
		int i_0_ = ((class536_sub23.aClass536_Sub33_Sub2_10528.off += 516175515) * -810172525);
		class536_sub23.aClass536_Sub33_Sub2_10528.writeByte(aClass52_7630.method78());
		class536_sub23.aClass536_Sub33_Sub2_10528.writeString(aString7631);
		class536_sub23.aClass536_Sub33_Sub2_10528.writeShort(anInt7633 * -1085104049, -1778059594);
		class536_sub23.aClass536_Sub33_Sub2_10528.writeString(Class497.aString5549);
		if (aString7632 != null) {
			class536_sub23.aClass536_Sub33_Sub2_10528.writeByte(1);
			String string = aString7632;
			if (string.length() > 100)
				string = string.substring(0, 100);
			class536_sub23.aClass536_Sub33_Sub2_10528.writeString(string);
		} else
			class536_sub23.aClass536_Sub33_Sub2_10528.writeByte(0);
		class536_sub23.aClass536_Sub33_Sub2_10528.method9699((-810172525 * class536_sub23.aClass536_Sub33_Sub2_10528.off - i_0_), -1289663183);
		client.aClass106_11322.method1409(class536_sub23, 79111965);
	}

	static final void method6927(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		InterfaceDefinitions class251 = class683.aClass251_8650;
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = class251.anInt2584 * -2092413585;
	}

	static final void method6928(Class668 class668, int i) {
		int i_1_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		InterfaceDefinitions class251 = Class264.method3678(i_1_, -689214737);
		Class234 class234 = Class463.aClass234Array5227[i_1_ >>> 16];
		InterfaceDefinitions class251_2_ = Class648.method7834(class234, class251, -16777216);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = null == class251_2_ ? -1 : class251_2_.anInt2559 * -1591767037;
	}

	static final void method6929(Class668 class668, int i) {
		class668.anInt8542 -= 1472892954;
		int i_3_ = class668.anIntArray8541[class668.anInt8542 * 1867269829];
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		boolean bool = 1 == (class668.anIntArray8541[1 + class668.anInt8542 * 1867269829]);
		Class621.method7412(i_3_, string, bool, (byte) 41);
	}

	static final void method6930(Class668 class668, byte i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
	}

	static final void method6931(Class668 class668, byte i) {
		class668.anInt8542 -= 1472892954;
		int i_4_ = class668.anIntArray8541[1867269829 * class668.anInt8542];
		int i_5_ = class668.anIntArray8541[1867269829 * class668.anInt8542 + 1];
		Class273.method3730(10, i_4_, i_5_, "", -1649153595);
	}

	static final void method6932(Class668 class668, byte i) {
		if (!Class683.aClass301_Sub1_8651.method4062(-1499317754).method4020(-1880224523))
			throw new RuntimeException();
		Class706_Sub4 class706_sub4 = ((Class706_Sub4) Class683.aClass301_Sub1_8651.method4052(-810172525));
		class706_sub4.method10304(Class466.aClass439_5323, -1, 0.0F, -1163406888);
		client.aBool11242 = true;
	}

	static final void method6933(Class668 class668, int i) {
		int i_6_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = i_6_ & 0x3fff;
	}
}
