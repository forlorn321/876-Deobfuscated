/* Class666 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class666 {
	int anInt8532;
	Class598 aClass598_8533;

	public Class649_Sub1_Sub1_Sub1 method8002(int i) {
		Class536_Sub9 class536_sub9 = ((Class536_Sub9) (client.aClass4_11170.method556((long) (aClass598_8533.anInt7838 * -1551431315 << 28 | 1479112045 * aClass598_8533.anInt7840 << 14 | 1858049507 * aClass598_8533.anInt7839))));
		if (null == class536_sub9)
			return null;
		Class598 class598 = client.aClass515_11066.method6255(-1452325506);
		int i_0_ = (aClass598_8533.anInt7839 * 1858049507 - class598.anInt7839 * 1858049507);
		int i_1_ = (1479112045 * aClass598_8533.anInt7840 - 1479112045 * class598.anInt7840);
		if (i_0_ >= 0 && i_1_ >= 0 && i_0_ < client.aClass515_11066.method6321((byte) 48) && i_1_ < client.aClass515_11066.method6243(177401017) && client.aClass515_11066.method6249(655670422) != null) {
			for (Class536_Sub6 class536_sub6 = ((Class536_Sub6) class536_sub9.aClass708_10433.method8308(1867269829)); null != class536_sub6; class536_sub6 = (Class536_Sub6) class536_sub9.aClass708_10433.method8311(1783559486)) {
				if (591996667 * anInt8532 == 1696543099 * class536_sub6.anInt10419)
					return ((Class649_Sub1_Sub1_Sub1) (client.aClass515_11066.method6249(-1764012472).method6762(-1551431315 * aClass598_8533.anInt7838, i_0_, i_1_, (byte) 103)));
			}
		}
		return null;
	}

	public Class666(Class598 class598, int i) {
		aClass598_8533 = class598;
		anInt8532 = 1391653939 * i;
	}
}
