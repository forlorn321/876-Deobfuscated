/* Class481 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class481 {
	static Class481 aClass481_5419;
	public static Class481 aClass481_5420;
	int anInt5421;
	public static Class481 aClass481_5422;
	static Class481 aClass481_5423 = new Class481(0);
	public static Class481 aClass481_5424;
	public static Class481 aClass481_5425;
	public static Class481 aClass481_5426;
	public static Class481 aClass481_5427;
	public static Class481 aClass481_5428;
	public static Class481 aClass481_5429;

	static {
		aClass481_5420 = new Class481(1);
		aClass481_5425 = new Class481(2);
		aClass481_5422 = new Class481(3);
		aClass481_5429 = new Class481(4);
		aClass481_5424 = new Class481(5);
		aClass481_5427 = new Class481(6);
		aClass481_5426 = new Class481(7);
		aClass481_5419 = new Class481(8);
		aClass481_5428 = new Class481(9);
	}

	Class481(int i) {
		anInt5421 = 1566942627 * i;
	}

	static final void method5831(InterfaceDefinitions class251, int i, byte[] is, byte[] is_0_, Class668 class668, int i_1_) {
		if (null == class251.aByteArrayArray2647) {
			if (null != is) {
				class251.aByteArrayArray2647 = new byte[11][];
				class251.aByteArrayArray2648 = new byte[11][];
				class251.anIntArray2560 = new int[11];
				class251.anIntArray2722 = new int[11];
				class251.anIntArray2651 = new int[11];
			} else
				return;
		}
		class251.aByteArrayArray2647[i] = is;
		if (null != is)
			class251.aBool2582 = true;
		else {
			class251.aBool2582 = false;
			for (int i_2_ = 0; i_2_ < class251.aByteArrayArray2647.length; i_2_++) {
				if (null != class251.aByteArrayArray2647[i_2_] || class251.anIntArray2651[i_2_] > 0) {
					class251.aBool2582 = true;
					break;
				}
			}
		}
		class251.aByteArrayArray2648[i] = is_0_;
	}

	static final void method5832(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		InterfaceDefinitions class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class462.method5620(class251, class234, class668, -1991869906);
	}

	static void method5833(Class536_Sub18_Sub9 class536_sub18_sub9, int i) {
		if (null != class536_sub18_sub9) {
			Class70.aClass708_755.method8335(class536_sub18_sub9, -1740636174);
			Class70.anInt760 += 354678071;
			Object object = null;
			Class536_Sub18_Sub6 class536_sub18_sub6;
			if (!class536_sub18_sub9.aBool11717 && !"".equals(class536_sub18_sub9.aString11712)) {
				long l = 4372728678228642485L * class536_sub18_sub9.aLong11719;
				for (class536_sub18_sub6 = ((Class536_Sub18_Sub6) Class70.aClass4_763.method556(l)); (null != class536_sub18_sub6 && !class536_sub18_sub6.aString11684.equals(class536_sub18_sub9.aString11712)); class536_sub18_sub6 = ((Class536_Sub18_Sub6) Class70.aClass4_763.method557(-1177488012))) {
					/* empty */
				}
				if (class536_sub18_sub6 == null) {
					class536_sub18_sub6 = ((Class536_Sub18_Sub6) Class70.aClass199_757.method2886(l));
					if (null != class536_sub18_sub6 && !class536_sub18_sub6.aString11684.equals(class536_sub18_sub9.aString11712))
						class536_sub18_sub6 = null;
					if (class536_sub18_sub6 == null)
						class536_sub18_sub6 = new Class536_Sub18_Sub6(class536_sub18_sub9.aString11712);
					Class70.aClass4_763.method560(class536_sub18_sub6, l);
					Class70.anInt761 += 389540193;
				}
			} else {
				class536_sub18_sub6 = new Class536_Sub18_Sub6(class536_sub18_sub9.aString11712);
				Class70.anInt761 += 389540193;
			}
			if (class536_sub18_sub6.method10691(class536_sub18_sub9, -340334154))
				Class462.method5618(class536_sub18_sub6, (short) -6474);
		}
	}

	static final void method5834(Class668 class668, int i) {
		if (null != Class50.aClass350_585) {
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 1;
			class668.aClass350_8563 = Class50.aClass350_585;
			class668.aMap8557.put(Class458.aClass458_5165, Class262.method3643(class668.aClass350_8563, -200219436));
		} else
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
	}
}
