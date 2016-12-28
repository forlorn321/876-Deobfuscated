/* Class675 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class675 {
	int anInt8585;
	Class598 aClass598_8586;
	int anInt8587;
	static int anInt8588;

	int method8032(int i) {
		return client.anIntArray11315[anInt8585 * 663238071];
	}

	public Interface59 method8033(int i) {
		Interface59 interface59 = method8035((byte) 24);
		if (null == interface59)
			return null;
		if (interface59.method373((byte) 11) != anInt8587 * 280198253)
			return null;
		return interface59;
	}

	int method8034() {
		return client.anIntArray11315[anInt8585 * 663238071];
	}

	Interface59 method8035(byte i) {
		int i_0_ = -1551431315 * aClass598_8586.anInt7838;
		Class598 class598 = client.aClass515_11066.method6255(-1431259566);
		int i_1_ = (aClass598_8586.anInt7839 * 1858049507 - 1858049507 * class598.anInt7839);
		int i_2_ = (1479112045 * aClass598_8586.anInt7840 - 1479112045 * class598.anInt7840);
		if (i_1_ < 0 || i_2_ < 0 || i_1_ >= client.aClass515_11066.method6321((byte) -21) || i_2_ >= client.aClass515_11066.method6243(177401017) || client.aClass515_11066.method6249(205150003) == null)
			return null;
		switch (method8032(-1990508349)) {
		case 2:
			return ((Interface59) (client.aClass515_11066.method6249(1114764764).method6736(i_0_, i_1_, i_2_, client.anInterface64_11113, (byte) -108)));
		case 1:
			return (Interface59) client.aClass515_11066.method6249(-1397958480).method6714(i_0_, i_1_, i_2_, (byte) -94);
		default:
			return null;
		case 0:
			return (Interface59) client.aClass515_11066.method6249(-577670333).method6716(i_0_, i_1_, i_2_, -342954341);
		case 3:
			return (Interface59) client.aClass515_11066.method6249(-611667678).method6726(i_0_, i_1_, i_2_, 1672121015);
		}
	}

	int method8036() {
		return client.anIntArray11315[anInt8585 * 663238071];
	}

	public Class675(Class598 class598, int i, int i_3_, int i_4_) {
		aClass598_8586 = class598;
		anInt8585 = 145602567 * i;
		anInt8587 = i_4_ * -308548251;
	}

	static final void method8037(IComponentDefinitions class251, Class234 class234, Class668 class668, int i) {
		int i_5_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		class251.anInt2711 = 180322533;
		if (i_5_ != class251.graphicId * -1307221069) {
			class251.graphicId = i_5_ * -2093350021;
			Class668.method8011(class251, 263642117);
		}
		if (-1 == -809980533 * class251.anInt2546 && !class234.aBool2379)
			Class205_Sub4_Sub1.method10582(-1591767037 * class251.anInt2559, -2072420430);
	}
}
