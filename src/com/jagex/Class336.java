/* Class336 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class336 {
	Class180_Sub2 aClass180_Sub2_3643;
	Interface24 anInterface24_3644;
	Class205 aClass205_3645 = new Class205(10485760, 256);

	void method5881() {
		aClass205_3645.method3792(5, (byte) 15);
	}

	Interface38 method5882(Class163 class163, int i) {
		long l = (long) (i << 16 | class163.anInt1776 * 1303945621);
		Interface38 interface38 = (Interface38) aClass205_3645.method3787(l);
		if (interface38 != null)
			return interface38;
		if (!method5884(class163, i))
			return null;
		if (i == -1)
			i = class163.anInt1780 * 1039262975;
		Interface38 interface38_0_;
		if (!class163.aBool1803 || !aClass180_Sub2_3643.method3204()) {
			int[] is;
			if (class163.aClass595_1784 != Class595.aClass595_7816 || !Class306.method5607(class163.aByte1801, -1088851960))
				is = anInterface24_3644.method133(Class609.aClass609_7996, (class163.anInt1776 * 1303945621), 0.7F, i, i, false, -257450800);
			else
				is = anInterface24_3644.method132(Class609.aClass609_7996, (class163.anInt1776 * 1303945621), 0.7F, i, i, true, (byte) 41);
			if (is == null)
				return null;
			interface38_0_ = aClass180_Sub2_3643.method14962(i, i, true, is);
		} else {
			float[] fs = anInterface24_3644.method131(Class609.aClass609_7996, class163.anInt1776 * 1303945621, 0.7F, i, i, false, -1403594342);
			interface38_0_ = aClass180_Sub2_3643.method15105(Class157.aClass157_1723, i, i, true, fs);
		}
		interface38_0_.method226(class163.aByte1786 == 1, class163.aByte1787 == 1);
		aClass205_3645.method3813(interface38_0_, l, i * i, 2004530875);
		return interface38_0_;
	}

	Interface38 method5883(Class163 class163, int i) {
		long l = (long) (i << 16 | class163.anInt1776 * 1303945621);
		Interface38 interface38 = (Interface38) aClass205_3645.method3787(l);
		if (interface38 != null)
			return interface38;
		if (!method5884(class163, i))
			return null;
		if (i == -1)
			i = class163.anInt1780 * 1039262975;
		Interface38 interface38_1_;
		if (!class163.aBool1803 || !aClass180_Sub2_3643.method3204()) {
			int[] is;
			if (class163.aClass595_1784 != Class595.aClass595_7816 || !Class306.method5607(class163.aByte1801, -1088851960))
				is = anInterface24_3644.method133(Class609.aClass609_7996, (class163.anInt1776 * 1303945621), 0.7F, i, i, false, 96518864);
			else
				is = anInterface24_3644.method132(Class609.aClass609_7996, (class163.anInt1776 * 1303945621), 0.7F, i, i, true, (byte) -42);
			if (is == null)
				return null;
			interface38_1_ = aClass180_Sub2_3643.method14962(i, i, true, is);
		} else {
			float[] fs = anInterface24_3644.method131(Class609.aClass609_7996, class163.anInt1776 * 1303945621, 0.7F, i, i, false, 78318963);
			interface38_1_ = aClass180_Sub2_3643.method15105(Class157.aClass157_1723, i, i, true, fs);
		}
		interface38_1_.method226(class163.aByte1786 == 1, class163.aByte1787 == 1);
		aClass205_3645.method3813(interface38_1_, l, i * i, 1989001785);
		return interface38_1_;
	}

	boolean method5884(Class163 class163, int i) {
		if (i == -1)
			i = class163.anInt1780 * 1039262975;
		if (!class163.aBool1803 || !aClass180_Sub2_3643.method3204()) {
			if (class163.aClass595_1784 != Class595.aClass595_7816 || !Class306.method5607(class163.aByte1801, -1088851960))
				return anInterface24_3644.method134(Class609.aClass609_7996, (class163.anInt1776 * 1303945621), Class591.aClass591_7796, 0.7F, i, i, false, -1216809946);
			return anInterface24_3644.method134(Class609.aClass609_7996, (class163.anInt1776 * 1303945621), Class591.aClass591_7795, 0.7F, i, i, true, 1281975249);
		}
		return anInterface24_3644.method134(Class609.aClass609_7996, class163.anInt1776 * 1303945621, Class591.aClass591_7794, 0.7F, i, i, false, 580325901);
	}

	void method5885() {
		aClass205_3645.method3792(5, (byte) 92);
	}

	void method5886() {
		aClass205_3645.method3792(5, (byte) 34);
	}

	Interface38 method5887(Class163 class163) {
		return method5883(class163, class163.anInt1780 * 1039262975);
	}

	Interface38 method5888(Class163 class163) {
		return method5883(class163, class163.anInt1780 * 1039262975);
	}

	Interface38 method5889(Class163 class163) {
		return method5883(class163, class163.anInt1780 * 1039262975);
	}

	Interface38 method5890(Class163 class163) {
		return method5883(class163, class163.anInt1780 * 1039262975);
	}

	boolean method5891(Class163 class163, int i) {
		if (i == -1)
			i = class163.anInt1780 * 1039262975;
		if (!class163.aBool1803 || !aClass180_Sub2_3643.method3204()) {
			if (class163.aClass595_1784 != Class595.aClass595_7816 || !Class306.method5607(class163.aByte1801, -1088851960))
				return anInterface24_3644.method134(Class609.aClass609_7996, (class163.anInt1776 * 1303945621), Class591.aClass591_7796, 0.7F, i, i, false, 670116779);
			return anInterface24_3644.method134(Class609.aClass609_7996, (class163.anInt1776 * 1303945621), Class591.aClass591_7795, 0.7F, i, i, true, 552705760);
		}
		return anInterface24_3644.method134(Class609.aClass609_7996, class163.anInt1776 * 1303945621, Class591.aClass591_7794, 0.7F, i, i, false, 399035663);
	}

	Interface38 method5892(Class163 class163, int i) {
		long l = (long) (i << 16 | class163.anInt1776 * 1303945621);
		Interface38 interface38 = (Interface38) aClass205_3645.method3787(l);
		if (interface38 != null)
			return interface38;
		if (!method5884(class163, i))
			return null;
		if (i == -1)
			i = class163.anInt1780 * 1039262975;
		Interface38 interface38_2_;
		if (!class163.aBool1803 || !aClass180_Sub2_3643.method3204()) {
			int[] is;
			if (class163.aClass595_1784 != Class595.aClass595_7816 || !Class306.method5607(class163.aByte1801, -1088851960))
				is = anInterface24_3644.method133(Class609.aClass609_7996, (class163.anInt1776 * 1303945621), 0.7F, i, i, false, -1122169670);
			else
				is = anInterface24_3644.method132(Class609.aClass609_7996, (class163.anInt1776 * 1303945621), 0.7F, i, i, true, (byte) -20);
			if (is == null)
				return null;
			interface38_2_ = aClass180_Sub2_3643.method14962(i, i, true, is);
		} else {
			float[] fs = anInterface24_3644.method131(Class609.aClass609_7996, class163.anInt1776 * 1303945621, 0.7F, i, i, false, -206365807);
			interface38_2_ = aClass180_Sub2_3643.method15105(Class157.aClass157_1723, i, i, true, fs);
		}
		interface38_2_.method226(class163.aByte1786 == 1, class163.aByte1787 == 1);
		aClass205_3645.method3813(interface38_2_, l, i * i, 2024796963);
		return interface38_2_;
	}

	Interface38 method5893(Class163 class163, int i) {
		long l = (long) (i << 16 | class163.anInt1776 * 1303945621);
		Interface38 interface38 = (Interface38) aClass205_3645.method3787(l);
		if (interface38 != null)
			return interface38;
		if (!method5884(class163, i))
			return null;
		if (i == -1)
			i = class163.anInt1780 * 1039262975;
		Interface38 interface38_3_;
		if (!class163.aBool1803 || !aClass180_Sub2_3643.method3204()) {
			int[] is;
			if (class163.aClass595_1784 != Class595.aClass595_7816 || !Class306.method5607(class163.aByte1801, -1088851960))
				is = anInterface24_3644.method133(Class609.aClass609_7996, (class163.anInt1776 * 1303945621), 0.7F, i, i, false, -729254418);
			else
				is = anInterface24_3644.method132(Class609.aClass609_7996, (class163.anInt1776 * 1303945621), 0.7F, i, i, true, (byte) -29);
			if (is == null)
				return null;
			interface38_3_ = aClass180_Sub2_3643.method14962(i, i, true, is);
		} else {
			float[] fs = anInterface24_3644.method131(Class609.aClass609_7996, class163.anInt1776 * 1303945621, 0.7F, i, i, false, -2135209082);
			interface38_3_ = aClass180_Sub2_3643.method15105(Class157.aClass157_1723, i, i, true, fs);
		}
		interface38_3_.method226(class163.aByte1786 == 1, class163.aByte1787 == 1);
		aClass205_3645.method3813(interface38_3_, l, i * i, 2098190497);
		return interface38_3_;
	}

	Interface38 method5894(Class163 class163, int i) {
		long l = (long) (i << 16 | class163.anInt1776 * 1303945621);
		Interface38 interface38 = (Interface38) aClass205_3645.method3787(l);
		if (interface38 != null)
			return interface38;
		if (!method5884(class163, i))
			return null;
		if (i == -1)
			i = class163.anInt1780 * 1039262975;
		Interface38 interface38_4_;
		if (!class163.aBool1803 || !aClass180_Sub2_3643.method3204()) {
			int[] is;
			if (class163.aClass595_1784 != Class595.aClass595_7816 || !Class306.method5607(class163.aByte1801, -1088851960))
				is = anInterface24_3644.method133(Class609.aClass609_7996, (class163.anInt1776 * 1303945621), 0.7F, i, i, false, 569062220);
			else
				is = anInterface24_3644.method132(Class609.aClass609_7996, (class163.anInt1776 * 1303945621), 0.7F, i, i, true, (byte) -72);
			if (is == null)
				return null;
			interface38_4_ = aClass180_Sub2_3643.method14962(i, i, true, is);
		} else {
			float[] fs = anInterface24_3644.method131(Class609.aClass609_7996, class163.anInt1776 * 1303945621, 0.7F, i, i, false, -1276789055);
			interface38_4_ = aClass180_Sub2_3643.method15105(Class157.aClass157_1723, i, i, true, fs);
		}
		interface38_4_.method226(class163.aByte1786 == 1, class163.aByte1787 == 1);
		aClass205_3645.method3813(interface38_4_, l, i * i, 2127056363);
		return interface38_4_;
	}

	Interface38 method5895(Class163 class163) {
		return method5883(class163, class163.anInt1780 * 1039262975);
	}

	boolean method5896(Class163 class163, int i) {
		if (i == -1)
			i = class163.anInt1780 * 1039262975;
		if (!class163.aBool1803 || !aClass180_Sub2_3643.method3204()) {
			if (class163.aClass595_1784 != Class595.aClass595_7816 || !Class306.method5607(class163.aByte1801, -1088851960))
				return anInterface24_3644.method134(Class609.aClass609_7996, (class163.anInt1776 * 1303945621), Class591.aClass591_7796, 0.7F, i, i, false, 40985093);
			return anInterface24_3644.method134(Class609.aClass609_7996, (class163.anInt1776 * 1303945621), Class591.aClass591_7795, 0.7F, i, i, true, 45407176);
		}
		return anInterface24_3644.method134(Class609.aClass609_7996, class163.anInt1776 * 1303945621, Class591.aClass591_7794, 0.7F, i, i, false, 200670760);
	}

	boolean method5897(Class163 class163, int i) {
		if (i == -1)
			i = class163.anInt1780 * 1039262975;
		if (!class163.aBool1803 || !aClass180_Sub2_3643.method3204()) {
			if (class163.aClass595_1784 != Class595.aClass595_7816 || !Class306.method5607(class163.aByte1801, -1088851960))
				return anInterface24_3644.method134(Class609.aClass609_7996, (class163.anInt1776 * 1303945621), Class591.aClass591_7796, 0.7F, i, i, false, 21892343);
			return anInterface24_3644.method134(Class609.aClass609_7996, (class163.anInt1776 * 1303945621), Class591.aClass591_7795, 0.7F, i, i, true, -913086365);
		}
		return anInterface24_3644.method134(Class609.aClass609_7996, class163.anInt1776 * 1303945621, Class591.aClass591_7794, 0.7F, i, i, false, -12155179);
	}

	boolean method5898(Class163 class163, int i) {
		if (i == -1)
			i = class163.anInt1780 * 1039262975;
		if (!class163.aBool1803 || !aClass180_Sub2_3643.method3204()) {
			if (class163.aClass595_1784 != Class595.aClass595_7816 || !Class306.method5607(class163.aByte1801, -1088851960))
				return anInterface24_3644.method134(Class609.aClass609_7996, (class163.anInt1776 * 1303945621), Class591.aClass591_7796, 0.7F, i, i, false, 253706248);
			return anInterface24_3644.method134(Class609.aClass609_7996, (class163.anInt1776 * 1303945621), Class591.aClass591_7795, 0.7F, i, i, true, 753740647);
		}
		return anInterface24_3644.method134(Class609.aClass609_7996, class163.anInt1776 * 1303945621, Class591.aClass591_7794, 0.7F, i, i, false, -1670413029);
	}

	Class336(Class180_Sub2 class180_sub2, Interface24 interface24) {
		aClass180_Sub2_3643 = class180_sub2;
		anInterface24_3644 = interface24;
	}

	boolean method5899(Class163 class163, int i) {
		if (i == -1)
			i = class163.anInt1780 * 1039262975;
		if (!class163.aBool1803 || !aClass180_Sub2_3643.method3204()) {
			if (class163.aClass595_1784 != Class595.aClass595_7816 || !Class306.method5607(class163.aByte1801, -1088851960))
				return anInterface24_3644.method134(Class609.aClass609_7996, (class163.anInt1776 * 1303945621), Class591.aClass591_7796, 0.7F, i, i, false, -2127288554);
			return anInterface24_3644.method134(Class609.aClass609_7996, (class163.anInt1776 * 1303945621), Class591.aClass591_7795, 0.7F, i, i, true, -73113972);
		}
		return anInterface24_3644.method134(Class609.aClass609_7996, class163.anInt1776 * 1303945621, Class591.aClass591_7794, 0.7F, i, i, false, -1065445029);
	}

	Interface38 method5900(Class163 class163) {
		return method5883(class163, class163.anInt1780 * 1039262975);
	}

	void method5901() {
		aClass205_3645.method3793((byte) 60);
	}

	void method5902() {
		aClass205_3645.method3792(5, (byte) -105);
	}
}
