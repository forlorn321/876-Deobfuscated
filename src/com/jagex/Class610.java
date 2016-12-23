/* Class610 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public final class Class610 implements Interface19 {
	static final long aLong7915 = 4611686018427387904L;
	int[] anIntArray7916;
	static final long aLong7917 = 1L;
	static final long aLong7918 = 500L;
	int[] anIntArray7919;
	static final long aLong7920 = 4611686018427387903L;
	Class4 aClass4_7921 = new Class4(128);
	static Class143[] aClass143Array7922;

	public int method98(Class153 class153) {
		return anIntArray7916[class153.anInt1715 * -1786401803];
	}

	public int method7268(boolean bool, int i) {
		long l = Class249.method3450(1289264945);
		for (Class536_Sub16 class536_sub16 = (Class536_Sub16) (bool ? aClass4_7921.method562(-1442883841) : aClass4_7921.method567(911204430)); class536_sub16 != null; class536_sub16 = (Class536_Sub16) aClass4_7921.method567(1560928442)) {
			if ((-8221678582872212071L * class536_sub16.aLong10489 & 0x3fffffffffffffffL) < l) {
				if ((-8221678582872212071L * class536_sub16.aLong10489 & 0x4000000000000000L) != 0L) {
					int i_0_ = (int) (-6909195213925454795L * class536_sub16.aLong7133);
					anIntArray7916[i_0_] = anIntArray7919[i_0_];
					class536_sub16.method6484(615271047);
					return i_0_;
				}
				class536_sub16.method6484(1385430678);
			}
		}
		return -1;
	}

	public Object method117(Class153 class153) {
		throw new UnsupportedOperationException();
	}

	public int method99(Class153 class153, int i) {
		return anIntArray7916[class153.anInt1715 * -1786401803];
	}

	public void method7269(Class153 class153, int i, int i_1_) {
		anIntArray7919[class153.anInt1715 * -1786401803] = i;
		Class536_Sub16 class536_sub16 = ((Class536_Sub16) aClass4_7921.method556((long) (class153.anInt1715 * -1786401803)));
		if (class536_sub16 != null) {
			if (class536_sub16.aLong10489 * -8221678582872212071L != 4611686018427387905L)
				class536_sub16.aLong10489 = (Class249.method3450(1337751812) + 500L | 0x4000000000000000L) * 1363666573745260201L;
		} else {
			class536_sub16 = new Class536_Sub16(4611686018427387905L);
			aClass4_7921.method560(class536_sub16, (long) (class153.anInt1715 * -1786401803));
		}
	}

	public void method111(Class153 class153, int i) {
		anIntArray7916[class153.anInt1715 * -1786401803] = i;
		Class536_Sub16 class536_sub16 = ((Class536_Sub16) aClass4_7921.method556((long) (-1786401803 * class153.anInt1715)));
		if (class536_sub16 != null)
			class536_sub16.aLong10489 = (Class249.method3450(1733366788) + 500L) * 1363666573745260201L;
		else {
			class536_sub16 = new Class536_Sub16(Class249.method3450(1296205825) + 500L);
			aClass4_7921.method560(class536_sub16, (long) (class153.anInt1715 * -1786401803));
		}
	}

	public void method107(Class324 class324, int i, byte i_2_) throws Exception_Sub4 {
		int i_3_ = class324.method4265(anIntArray7916[(class324.aClass153_3555.anInt1715) * -1786401803], i, (byte) -33);
		method101(class324.aClass153_3555, i_3_, -887435289);
	}

	public void method7270(Class324 class324, int i, byte i_4_) {
		try {
			int i_5_ = class324.method4265((anIntArray7919[(class324.aClass153_3555.anInt1715 * -1786401803)]), i, (byte) -127);
			method7269(class324.aClass153_3555, i_5_, 315754912);
		} catch (Exception_Sub4 exception_sub4) {
			/* empty */
		}
	}

	public void method119(Class153 class153, long l) {
		throw new UnsupportedOperationException();
	}

	public Object method104(Class153 class153, byte i) {
		throw new UnsupportedOperationException();
	}

	public Object method116(Class153 class153) {
		throw new UnsupportedOperationException();
	}

	public int method97(Class153 class153) {
		return anIntArray7916[class153.anInt1715 * -1786401803];
	}

	public void method7271(int i) {
		for (int i_6_ = 0; i_6_ < Class532.aClass98_Sub1_Sub1_7122.method71(2067810237); i_6_++) {
			Class153_Sub1 class153_sub1 = ((Class153_Sub1) Class532.aClass98_Sub1_Sub1_7122.method70(i_6_, (byte) 32));
			if (class153_sub1 != null) {
				anIntArray7919[i_6_] = 0;
				anIntArray7916[i_6_] = 0;
			}
		}
		aClass4_7921 = new Class4(128);
	}

	public int method95(Class324 class324) {
		return class324.method4263((anIntArray7916[(-1786401803 * class324.aClass153_3555.anInt1715)]), (byte) 12);
	}

	public void method109(Class153 class153, int i) {
		anIntArray7916[class153.anInt1715 * -1786401803] = i;
		Class536_Sub16 class536_sub16 = ((Class536_Sub16) aClass4_7921.method556((long) (-1786401803 * class153.anInt1715)));
		if (class536_sub16 != null)
			class536_sub16.aLong10489 = (Class249.method3450(1266365921) + 500L) * 1363666573745260201L;
		else {
			class536_sub16 = new Class536_Sub16(Class249.method3450(1888918403) + 500L);
			aClass4_7921.method560(class536_sub16, (long) (class153.anInt1715 * -1786401803));
		}
	}

	public int method96(Class324 class324, int i) {
		return class324.method4263((anIntArray7916[(-1786401803 * class324.aClass153_3555.anInt1715)]), (byte) 12);
	}

	public void method105(Class153 class153, Object object, int i) {
		throw new UnsupportedOperationException();
	}

	public void method112(Class153 class153, int i) {
		anIntArray7916[class153.anInt1715 * -1786401803] = i;
		Class536_Sub16 class536_sub16 = ((Class536_Sub16) aClass4_7921.method556((long) (-1786401803 * class153.anInt1715)));
		if (class536_sub16 != null)
			class536_sub16.aLong10489 = (Class249.method3450(2135368204) + 500L) * 1363666573745260201L;
		else {
			class536_sub16 = new Class536_Sub16(Class249.method3450(1622516660) + 500L);
			aClass4_7921.method560(class536_sub16, (long) (class153.anInt1715 * -1786401803));
		}
	}

	public long method102(Class153 class153, int i) {
		throw new UnsupportedOperationException();
	}

	public long method108(Class153 class153) {
		throw new UnsupportedOperationException();
	}

	public long method114(Class153 class153) {
		throw new UnsupportedOperationException();
	}

	public void method110(Class153 class153, long l) {
		throw new UnsupportedOperationException();
	}

	public void method101(Class153 class153, int i, int i_7_) {
		anIntArray7916[class153.anInt1715 * -1786401803] = i;
		Class536_Sub16 class536_sub16 = ((Class536_Sub16) aClass4_7921.method556((long) (-1786401803 * class153.anInt1715)));
		if (class536_sub16 != null)
			class536_sub16.aLong10489 = (Class249.method3450(2040427824) + 500L) * 1363666573745260201L;
		else {
			class536_sub16 = new Class536_Sub16(Class249.method3450(1483961381) + 500L);
			aClass4_7921.method560(class536_sub16, (long) (class153.anInt1715 * -1786401803));
		}
	}

	public Object method118(Class153 class153) {
		throw new UnsupportedOperationException();
	}

	public void method103(Class153 class153, Object object) {
		throw new UnsupportedOperationException();
	}

	public void method100(Class153 class153, Object object) {
		throw new UnsupportedOperationException();
	}

	public void method120(Class153 class153, Object object) {
		throw new UnsupportedOperationException();
	}

	public void method121(Class324 class324, int i) throws Exception_Sub4 {
		int i_8_ = class324.method4265(anIntArray7916[(class324.aClass153_3555.anInt1715) * -1786401803], i, (byte) -124);
		method101(class324.aClass153_3555, i_8_, 220287606);
	}

	public Class610() {
		anIntArray7919 = new int[Class532.aClass98_Sub1_Sub1_7122.method71(2053346812)];
		anIntArray7916 = new int[Class532.aClass98_Sub1_Sub1_7122.method71(1792490439)];
	}

	public void method113(Class153 class153, int i) {
		anIntArray7916[class153.anInt1715 * -1786401803] = i;
		Class536_Sub16 class536_sub16 = ((Class536_Sub16) aClass4_7921.method556((long) (-1786401803 * class153.anInt1715)));
		if (class536_sub16 != null)
			class536_sub16.aLong10489 = (Class249.method3450(1726186929) + 500L) * 1363666573745260201L;
		else {
			class536_sub16 = new Class536_Sub16(Class249.method3450(1876670140) + 500L);
			aClass4_7921.method560(class536_sub16, (long) (class153.anInt1715 * -1786401803));
		}
	}

	public void method115(Class153 class153, int i) {
		anIntArray7916[class153.anInt1715 * -1786401803] = i;
		Class536_Sub16 class536_sub16 = ((Class536_Sub16) aClass4_7921.method556((long) (-1786401803 * class153.anInt1715)));
		if (class536_sub16 != null)
			class536_sub16.aLong10489 = (Class249.method3450(1836368422) + 500L) * 1363666573745260201L;
		else {
			class536_sub16 = new Class536_Sub16(Class249.method3450(1557439623) + 500L);
			aClass4_7921.method560(class536_sub16, (long) (class153.anInt1715 * -1786401803));
		}
	}

	public void method106(Class324 class324, int i) throws Exception_Sub4 {
		int i_9_ = class324.method4265(anIntArray7916[(class324.aClass153_3555.anInt1715) * -1786401803], i, (byte) -62);
		method101(class324.aClass153_3555, i_9_, -1640549908);
	}

	static final void method7272(Class668 class668, byte i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		Class251 class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class332.method4339(class251, class234, class668, (byte) 28);
	}

	static final void method7273(Class668 class668, short i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = client.aBool10989 ? 1 : 0;
	}

	static final void method7274(Class668 class668, short i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = class668.aClass350_8563.aByte3698;
	}

	static final void method7275(Class668 class668, byte i) {
		class668.anInt8544 -= -402808782;
		String string = ((String) class668.anObjectArray8543[class668.anInt8544 * 366709801]);
		String string_10_ = ((String) class668.anObjectArray8543[366709801 * class668.anInt8544 + 1]);
		class668.anInt8542 -= 1472892954;
		int i_11_ = class668.anIntArray8541[class668.anInt8542 * 1867269829];
		int i_12_ = class668.anIntArray8541[1867269829 * class668.anInt8542 + 1];
		if (string_10_ == null)
			string_10_ = "";
		if (string_10_.length() > 80)
			string_10_ = string_10_.substring(0, 80);
		Class106 class106 = Class536_Sub41.method9871(2077853800);
		Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.aClass414_4446, class106.aClass15_1258, 1394364057);
		class536_sub23.aClass536_Sub33_Sub2_10528.writeByte((Class555.method6802(string, -1090133431) + 2 + Class555.method6802(string_10_, 1336064071)));
		class536_sub23.aClass536_Sub33_Sub2_10528.writeString(string);
		class536_sub23.aClass536_Sub33_Sub2_10528.writeByte(i_11_ - 1);
		class536_sub23.aClass536_Sub33_Sub2_10528.writeByte(i_12_);
		class536_sub23.aClass536_Sub33_Sub2_10528.writeString(string_10_);
		class106.method1409(class536_sub23, 1321719810);
	}

	static final void method7276(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class710.aClass536_Sub40_8843.aClass710_Sub25_10735.method10142(1665721795);
	}
}
