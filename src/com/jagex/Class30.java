/* Class30 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.HashMap;

public class Class30 {
	public String aString261;
	public String aString262;
	public String aString263;
	public boolean aBool264;
	public static int anInt265;

	Class30() {
		/* empty */
	}

	static final void method778(Class668 class668, int i) {
		int i_0_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		IComponentDefinitions class251 = Class264.getIComponentDefinitions(i_0_);
		Class234 class234 = Class463.aClass234Array5227[i_0_ >> 16];
		Class390.method4856(class251, class234, true, 1, class668, (byte) -116);
	}

	static final void method779(Class668 class668, int i) {
		class668.anInt8542 -= 61855783;
		int i_1_ = class668.anIntArray8541[1867269829 * class668.anInt8542];
		int i_2_ = class668.anIntArray8541[1 + 1867269829 * class668.anInt8542];
		int i_3_ = class668.anIntArray8541[class668.anInt8542 * 1867269829 + 2];
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class533.method6465(i_1_, i_2_, i_3_, false, (byte) 1);
	}

	public static long method780(CharSequence charsequence, byte i) {
		int i_4_ = charsequence.length();
		long l = 0L;
		for (int i_5_ = 0; i_5_ < i_4_; i_5_++)
			l = (l << 5) - l + (long) charsequence.charAt(i_5_);
		return l;
	}

	static void method781(Class106 class106, byte i) {
		Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.aClass414_4503, class106.aClass15_1258, 725927789);
		class536_sub23.aClass536_Sub33_Sub2_10528.writeByte(Class315.method4212((byte) 43));
		class536_sub23.aClass536_Sub33_Sub2_10528.writeShort(Class144.anInt1679 * -1804846931, -1778059594);
		class536_sub23.aClass536_Sub33_Sub2_10528.writeShort(Class34_Sub6.anInt10965 * 589116499, -1778059594);
		class536_sub23.aClass536_Sub33_Sub2_10528.writeByte(Class710.aClass536_Sub40_8843.aClass710_Sub27_10743.method10156(463714195));
		class106.method1409(class536_sub23, 1588399593);
	}

	static final void method782(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		IComponentDefinitions class251 = class683.aClass251_8650;
		int i_6_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		Class73 class73 = (Class73) Class207.aClass34_Sub22_2244.method70(i_6_, (byte) 31);
		if (class73.method1128((byte) 97))
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = class251.getStringParamDefault(i_6_, class73.aString805, -279793543);
		else
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = class251.getIntParamDefault(i_6_, 1566477951 * class73.anInt803, 1869360746);
	}

	static final void method783(Class668 class668, byte i) {
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		if (Class522.aString7077 != null && Class522.aString7077.equalsIgnoreCase(string))
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 1;
		else
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
	}

	static final void method784(Class668 class668, int i) {
		int i_7_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		if (2 == client.anInt11289 * -1484801557 && i_7_ < 142551095 * client.anInt11288)
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = client.aClass31Array11291[i_7_].anInt269 * 2003991197;
		else
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
	}

	public static Class461 method785(Class46 class46, boolean bool, int i, boolean bool_8_, boolean bool_9_, byte i_10_) {
		if (Class275.aClass459_Sub1Array3024 == null) {
			Class275.aClass459_Sub1Array3024 = new Class459_Sub1[Class319.method4240(-1974867093)];
			Class211.aMap2292 = new HashMap();
		}
		Class547 class547 = null;
		int i_11_ = class46.method903(969914377);
		if (null != client.aClass18_6879 && !Class97.aBool1179)
			class547 = new Class547(i_11_, client.aClass18_6879, Class484.aClass18Array5436[i_11_], (i_11_ == Class46.aClass46_555.method903(-233346589) ? 8000000 : 2500000));
		Class275.aClass459_Sub1Array3024[i_11_] = Class290.aClass426_3223.method5123(i_11_, class547, Class653.aClass547_8490, class46.method902(-1565860380), 691809011);
		if (bool_9_)
			Class275.aClass459_Sub1Array3024[i_11_].method9239(1206569215);
		Class461 class461 = new Class461(Class275.aClass459_Sub1Array3024[i_11_], bool, i);
		Class211.aMap2292.put(class46, class461);
		return class461;
	}
}
