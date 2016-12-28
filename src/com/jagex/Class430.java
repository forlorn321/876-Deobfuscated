/* Class430 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class430 {
	public Object anObject4819;
	public int anInt4820;
	static Class536_Sub18_Sub9 aClass536_Sub18_Sub9_4821;

	public boolean method5161(Object object) {
		if (!(object instanceof Class430))
			return false;
		Class430 class430_0_ = (Class430) object;
		if (class430_0_.anObject4819 == null && anObject4819 != null)
			return false;
		if (anObject4819 == null && null != class430_0_.anObject4819)
			return false;
		if (class430_0_.anInt4820 * 706703961 == anInt4820 * 706703961 && class430_0_.anObject4819.equals(anObject4819))
			return true;
		return false;
	}

	public Class430(int i, Object object) {
		anInt4820 = -657934871 * i;
		anObject4819 = object;
	}

	public boolean equals(Object object) {
		if (!(object instanceof Class430))
			return false;
		Class430 class430_1_ = (Class430) object;
		if (class430_1_.anObject4819 == null && anObject4819 != null)
			return false;
		if (anObject4819 == null && null != class430_1_.anObject4819)
			return false;
		if (class430_1_.anInt4820 * 706703961 == anInt4820 * 706703961 && class430_1_.anObject4819.equals(anObject4819))
			return true;
		return false;
	}

	public Class430(int i) {
		anInt4820 = -657934871 * i;
	}

	public boolean method5162(Object object) {
		if (!(object instanceof Class430))
			return false;
		Class430 class430_2_ = (Class430) object;
		if (class430_2_.anObject4819 == null && anObject4819 != null)
			return false;
		if (anObject4819 == null && null != class430_2_.anObject4819)
			return false;
		if (class430_2_.anInt4820 * 706703961 == anInt4820 * 706703961 && class430_2_.anObject4819.equals(anObject4819))
			return true;
		return false;
	}

	static final void method5163(Class668 class668, int i) throws Exception_Sub4 {
		Class324 class324 = (Class324) (class668.aClass536_Sub18_Sub16_8547.anObjectArray11796[class668.anInt8564 * -1640738851]);
		Interface19 interface19 = ((Interface19) (class668.anIntArray8537[-1640738851 * class668.anInt8564] == 0 ? class668.aMap8557.get(class324.aClass153_3555.aClass458_1717) : class668.aMap8558.get(class324.aClass153_3555.aClass458_1717)));
		try {
			interface19.method107(class324, class668.anIntArray8541[((class668.anInt8542 -= -1411037171) * 1867269829)], (byte) 61);
		} catch (Exception_Sub4 exception_sub4) {
			if (interface19 instanceof Class610)
				Class245.method3414(class668, Class499.aClass499_5569, exception_sub4, "VO", (byte) -1);
			else
				throw exception_sub4;
		}
	}

	static final void method5164(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		IComponentDefinitions class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class534.method6469(class251, class234, class668, 678657269);
	}

	static final void method5165(Class668 class668, int i) {
		int i_3_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		IComponentDefinitions class251 = Class264.method3678(i_3_, -689214737);
		Class234 class234 = Class463.aClass234Array5227[i_3_ >> 16];
		Class453.method5447(class251, class234, class668, (byte) 45);
	}

	static final void method5166(Class668 class668, int i) {
		class668.anInt8542 -= -1411037171;
		int i_4_ = class668.anIntArray8541[class668.anInt8542 * 1867269829];
		Class536_Sub36 class536_sub36 = (Class536_Sub36) client.aClass4_11008.method556((long) i_4_);
		if (class536_sub36 != null && class536_sub36.anInt10633 * -700395843 == 3)
			Class398.method4903(class536_sub36, true, true, 1759806773);
	}

	static final void method5167(Class668 class668, int i) {
		class668.anInt8542 -= 1472892954;
		int i_5_ = class668.anIntArray8541[class668.anInt8542 * 1867269829];
		int i_6_ = class668.anIntArray8541[1 + class668.anInt8542 * 1867269829];
		Class273.method3730(3, i_5_, i_6_, "", -1982887402);
	}

	static final void method5168(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class710.aClass536_Sub40_8843.aClass710_Sub35_10788.method10213(999112287);
	}

	static void method5169(int i) {
		Class549_Sub1.anIntArray10580[44] = 71;
		Class549_Sub1.anIntArray10580[45] = 26;
		Class549_Sub1.anIntArray10580[46] = 72;
		Class549_Sub1.anIntArray10580[47] = 73;
		Class549_Sub1.anIntArray10580[59] = 57;
		Class549_Sub1.anIntArray10580[61] = 27;
		Class549_Sub1.anIntArray10580[91] = 42;
		Class549_Sub1.anIntArray10580[92] = 74;
		Class549_Sub1.anIntArray10580[93] = 43;
		Class549_Sub1.anIntArray10580[192] = 28;
		Class549_Sub1.anIntArray10580[222] = 58;
		Class549_Sub1.anIntArray10580[520] = 59;
	}

	static final void method5170(Class668 class668, int i) {
		int i_7_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		IComponentDefinitions class251 = Class264.method3678(i_7_, -689214737);
		Class234 class234 = Class463.aClass234Array5227[i_7_ >> 16];
		Class457.method5486(class251, class234, class668, (byte) -26);
	}
}
