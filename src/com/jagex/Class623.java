/* Class623 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class623 {
	int anInt8120;
	static Class179 aClass179_8121;
	static Class511 aClass511_8122;
	static int anInt8123;
	Class180 aClass180_8124;
	Class631[][] aClass631ArrayArray8125;
	Class442 aClass442_8126;
	boolean aBool8127;
	long aLong8128;
	float aFloat8129;
	Class631 aClass631_8130;
	int anInt8131 = 0;
	Class631 aClass631_8132;
	Class631 aClass631_8133;
	Class631 aClass631_8134;
	Class205 aClass205_8135;
	Class631 aClass631_8136;
	Class205 aClass205_8137;
	public static int anInt8138 = 654439817;
	Class205 aClass205_8139;
	Class459 aClass459_8140;
	boolean aBool8141;
	int[] anIntArray8142;
	float[] aFloatArray8143;
	boolean aBool8144;
	float aFloat8145;
	float aFloat8146;
	float aFloat8147;
	float aFloat8148;
	Class647 aClass647_8149;

	void method10235() {
		aBool8141 = false;
		int[] is = anIntArray8142;
		int[] is_0_ = anIntArray8142;
		anIntArray8142[2] = -1;
		is_0_[1] = -1;
		is[0] = -1;
		float[] fs = aFloatArray8143;
		float[] fs_1_ = aFloatArray8143;
		aFloatArray8143[2] = 0.0F;
		fs_1_[1] = 0.0F;
		fs[0] = 0.0F;
	}

	public Class631 method10236() {
		return aClass631_8132;
	}

	public void method10237(Class509 class509) {
		Class631 class631 = method10249(class509, (byte) 125);
		if (null != aClass647_8149) {
			aClass631_8134.method10439(class631, 1045943573);
			aClass631_8134.method10441(this, aClass647_8149, 1961936211);
			method10318(aClass631_8134, aClass647_8149.method10777(318492261), (byte) 80);
		} else
			method10318(class631, anInt8123 * 824935819, (byte) 94);
		method10251(1040979577);
		method10253(544049831);
		method10294(206843887);
	}

	void method10238(byte i) {
		if (aClass180_8124.method3200()) {
			Class172 class172 = null;
			Class172 class172_2_ = null;
			Class172 class172_3_ = null;
			if (aBool8141) {
				if (anIntArray8142[0] > -1)
					class172 = method10279(anIntArray8142[0], -383695469);
				if (anIntArray8142[1] > -1)
					class172_2_ = method10279(anIntArray8142[1], -383695469);
				if (anIntArray8142[2] > -1)
					class172_3_ = method10279(anIntArray8142[2], -383695469);
				aClass180_8124.method3201(class172, aFloatArray8143[0], class172_2_, aFloatArray8143[1], class172_3_, aFloatArray8143[2]);
			} else {
				if (aClass631_8132.anIntArray8255[0] > -1)
					class172 = method10279(aClass631_8132.anIntArray8255[0], -383695469);
				if (aClass631_8132.anIntArray8255[1] > -1)
					class172_2_ = method10279(aClass631_8132.anIntArray8255[1], -383695469);
				if (aClass631_8132.anIntArray8255[2] > -1)
					class172_3_ = method10279(aClass631_8132.anIntArray8255[2], -383695469);
				aClass180_8124.method3201(class172, aClass631_8132.aFloatArray8256[0], class172_2_, aClass631_8132.aFloatArray8256[1], class172_3_, aClass631_8132.aFloatArray8256[2]);
			}
		}
	}

	public Class647 method10239(byte i) {
		return aClass647_8149;
	}

	public Class631 method10240(int i) {
		return aClass631_8132;
	}

	public void method10241(Class623 class623_4_, int i) {
		aClass631_8132.method10439(class623_4_.aClass631_8132, 1632595574);
		aClass631_8136.method10439(class623_4_.aClass631_8136, -1106046958);
		aClass631_8133.method10439(class623_4_.aClass631_8133, 1652694764);
		aLong8128 = 1L * class623_4_.aLong8128;
		anInt8131 = 1 * class623_4_.anInt8131;
		anInt8120 = class623_4_.anInt8120 * 1;
	}

	public void method10242(int i) {
		aClass205_8137.method3793((byte) 92);
		aClass205_8135.method3793((byte) 79);
		aClass205_8139.method3793((byte) 85);
	}

	public void method10243() {
		int i = 0;
		int i_5_ = i + (256 + aClass631_8132.anInt8244 * -598890845 << 2);
		aClass180_8124.method3187(aClass631_8132.anInt8243 * -1074650777, (Class204.aClass527_Sub31_2213.aClass700_Sub15_10598.method16992(1561253870) == 1 ? i_5_ : -1), 0);
	}

	Class511 method10244(int i, int i_6_, int i_7_, int i_8_, int i_9_) {
		long l = (((long) i_6_ & 0xffffL) << 48 | ((long) i_7_ & 0xffffL) << 32 | ((long) i_8_ & 0xffffL) << 16 | (long) i & 0xffffL);
		Class511 class511 = (Class511) aClass205_8135.method3787(l);
		if (class511 == null) {
			class511 = Class556.method9419(i, i_6_, i_7_, i_8_, Class84.aClass24_Sub1_815, Class189.aClass24_Sub7_2127, 2146455668);
			aClass205_8135.method3790(class511, l);
		}
		return class511;
	}

	public void method10245(Class509 class509) {
		Class631 class631 = method10249(class509, (byte) 112);
		if (null != aClass647_8149) {
			aClass631_8134.method10439(class631, 972425471);
			aClass631_8134.method10441(this, aClass647_8149, -30090690);
			method10318(aClass631_8134, aClass647_8149.method10777(318492261), (byte) 64);
		} else
			method10318(class631, anInt8123 * 824935819, (byte) 57);
		method10251(1040979577);
		method10253(419592536);
		method10294(1417529081);
	}

	public void method10246(int i, int i_10_, Class631 class631, byte i_11_) {
		aClass631ArrayArray8125[i][i_10_] = class631;
	}

	public void method10247(int i) {
		for (int i_12_ = 0; i_12_ < aClass631ArrayArray8125.length; i_12_++) {
			for (int i_13_ = 0; i_13_ < aClass631ArrayArray8125[i_12_].length; i_13_++)
				aClass631ArrayArray8125[i_12_][i_13_] = aClass631_8130;
		}
	}

	public void method10248(int i, int i_14_, int i_15_) {
		Class631 class631 = aClass631ArrayArray8125[i][i_14_];
		if (null != class631)
			aClass442_8126.method7146(class631.aClass442_8238);
		method10253(820585237);
	}

	Class631 method10249(Class509 class509, byte i) {
		Object object = null;
		int i_16_ = -1;
		int i_17_ = -1;
		if (Class640_Sub1_Sub3_Sub2.method18677(client.anInt11048 * -1927019389, 1495946201) || Class208_Sub23.method15642(-1927019389 * client.anInt11048, -1931322879)) {
			i_16_ = Class320.anInt3543 * -1998563323 >> 12;
			i_17_ = -1261737255 * Class201.anInt2211 >> 12;
		} else {
			if (null != Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937) {
				i_16_ = (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.anIntArray11902[0]) >> 3;
				i_17_ = (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.anIntArray11944[0]) >> 3;
			}
			if (i_16_ < 0 || i_16_ >= class509.method8284((byte) 112) >> 3 || i_17_ < 0 || i_17_ >= class509.method8285(-996707272) >> 3) {
				i_16_ = class509.method8284((byte) 10) >> 4;
				i_17_ = class509.method8285(1969303434) >> 4;
			}
		}
		Class631 class631 = aClass631ArrayArray8125[i_16_][i_17_];
		if (class631 == null)
			class631 = aClass631_8130;
		return class631;
	}

	public void method10250(Class509 class509, int i) {
		Class631 class631 = method10249(class509, (byte) 116);
		if (null != aClass647_8149) {
			aClass631_8134.method10439(class631, 443204884);
			aClass631_8134.method10441(this, aClass647_8149, -113287146);
			method10318(aClass631_8134, aClass647_8149.method10777(318492261), (byte) 109);
		} else
			method10318(class631, anInt8123 * 824935819, (byte) 105);
		method10251(1040979577);
		method10253(1746267183);
		method10294(628723508);
	}

	void method10251(int i) {
		if (anInt8120 * 1988106259 >= 0) {
			long l = Class234.method4347(-1408626088);
			anInt8120 -= (l - 8433384305172803863L * aLong8128) * 633827867L;
			if (1988106259 * anInt8120 > 0)
				aClass631_8132.method10434(aClass180_8124, aClass631_8136, aClass631_8133, ((float) (-1650172335 * anInt8131 - anInt8120 * 1988106259) / (float) (anInt8131 * -1650172335)), 2070100307);
			else {
				aClass631_8132.method10439(aClass631_8133, -1931180475);
				if (aClass631_8132.aClass511_8249 != null)
					aClass631_8132.aClass511_8249.method8449((byte) 0);
				anInt8120 = -633827867;
			}
			aLong8128 = 7881730836209751719L * l;
		}
	}

	public void method10252(short i) {
		aBool8127 = true;
	}

	void method10253(int i) {
		aClass180_8124.method3478((0.7F + ((float) Class204.aClass527_Sub31_2213.aClass700_Sub14_10593.method16970((byte) -106) * 0.1F) + client.aClass509_11072.method8288(-488424328)) * aClass631_8132.aFloat8241);
		aClass180_8124.method3157(-559548817 * aClass631_8132.anInt8250, aClass631_8132.aFloat8240, aClass631_8132.aFloat8254, (float) ((int) aClass442_8126.aFloat4918 << 2), (float) ((int) aClass442_8126.aFloat4915 << 2), (float) ((int) aClass442_8126.aFloat4919 << 2));
		aClass180_8124.method3193(aClass631_8132.aClass179_8239);
	}

	public void method10254(float f, float f_18_, float f_19_, int i, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_) {
		aClass180_8124.method3478((0.7F + (float) Class204.aClass527_Sub31_2213.aClass700_Sub14_10593.method16970((byte) -2) * 0.1F + client.aClass509_11072.method8288(-1803211762)) * f);
		aClass180_8124.method3157(i, f_18_, f_19_, (float) (i_20_ << 2), (float) (i_21_ << 2), (float) (i_22_ << 2));
		aClass180_8124.method3193(method10261(i_23_, -1012717753));
	}

	void method10255() {
		aBool8144 = false;
		aFloat8145 = 1.0F;
		aFloat8146 = 0.0F;
		aFloat8147 = 1.0F;
		aFloat8148 = 0.0F;
		aFloat8129 = 1.0F;
	}

	void method10256(byte i) {
		aClass180_8124.method3400(aClass631_8132.aFloat8248, aClass631_8132.aFloat8246, aClass631_8132.aFloat8242, -395575504);
	}

	void method10257(int i) {
		if (aClass180_8124.method3197()) {
			if (aBool8144)
				aClass180_8124.method3198(aFloat8145, aFloat8146, aFloat8147, aFloat8148, aFloat8129);
			else
				aClass180_8124.method3198(aClass631_8132.aFloat8247, aClass631_8132.aFloat8252, aClass631_8132.aFloat8245, aClass631_8132.aFloat8253, aClass631_8132.aFloat8251);
		}
	}

	void method10258(int i) {
		aBool8144 = false;
		aFloat8145 = 1.0F;
		aFloat8146 = 0.0F;
		aFloat8147 = 1.0F;
		aFloat8148 = 0.0F;
		aFloat8129 = 1.0F;
	}

	public void method10259(Class509 class509) {
		Class631 class631 = method10249(class509, (byte) 111);
		if (aClass647_8149 != null) {
			aClass631_8134.method10439(class631, 291830688);
			aClass631_8134.method10441(this, aClass647_8149, -944742277);
			method10318(aClass631_8134, aClass647_8149.method10777(318492261), (byte) 88);
		} else
			method10318(class631, 824935819 * anInt8123, (byte) 96);
		method10251(1040979577);
		method10256((byte) -47);
		method10257(381090788);
		method10238((byte) 6);
	}

	Class179 method10260(int i) {
		Class179 class179 = (Class179) aClass205_8137.method3787((long) i);
		if (class179 != null)
			return class179;
		class179 = aClass180_8124.method3191(i);
		aClass205_8137.method3790(class179, (long) i);
		return class179;
	}

	Class179 method10261(int i, int i_25_) {
		Class179 class179 = (Class179) aClass205_8137.method3787((long) i);
		if (class179 != null)
			return class179;
		class179 = aClass180_8124.method3191(i);
		aClass205_8137.method3790(class179, (long) i);
		return class179;
	}

	static {
		anInt8123 = -1038685949;
	}

	void method10262() {
		if (aClass180_8124.method3197()) {
			if (aBool8144)
				aClass180_8124.method3198(aFloat8145, aFloat8146, aFloat8147, aFloat8148, aFloat8129);
			else
				aClass180_8124.method3198(aClass631_8132.aFloat8247, aClass631_8132.aFloat8252, aClass631_8132.aFloat8245, aClass631_8132.aFloat8253, aClass631_8132.aFloat8251);
		}
	}

	void method10263() {
		aClass180_8124.method3400(aClass631_8132.aFloat8248, aClass631_8132.aFloat8246, aClass631_8132.aFloat8242, -367569690);
	}

	public void method10264(int i, int i_26_, Class631 class631) {
		aClass631ArrayArray8125[i][i_26_] = class631;
	}

	public void method10265() {
		aClass180_8124.method3478((0.7F + ((float) Class204.aClass527_Sub31_2213.aClass700_Sub14_10593.method16970((byte) -73) * 0.1F) + client.aClass509_11072.method8288(-239808050)) * 1.1523438F);
		aClass180_8124.method3157(16777215, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
		aClass180_8124.method3187(13156520, -1, 0);
		aClass180_8124.method3193(aClass179_8121);
	}

	public void method10266(Class509 class509) {
		Class631 class631 = method10249(class509, (byte) 124);
		if (aClass647_8149 != null) {
			aClass631_8134.method10439(class631, -144084898);
			aClass631_8134.method10441(this, aClass647_8149, 2069159292);
			method10318(aClass631_8134, aClass647_8149.method10777(318492261), (byte) 90);
		} else
			method10318(class631, 824935819 * anInt8123, (byte) 113);
		method10251(1040979577);
		method10256((byte) -82);
		method10257(-1343539218);
		method10238((byte) -2);
	}

	public void method10267(Class509 class509) {
		Class631 class631 = method10249(class509, (byte) 123);
		if (aClass647_8149 != null) {
			aClass631_8134.method10439(class631, -238454893);
			aClass631_8134.method10441(this, aClass647_8149, 1426938230);
			method10318(aClass631_8134, aClass647_8149.method10777(318492261), (byte) 110);
		} else
			method10318(class631, 824935819 * anInt8123, (byte) 117);
		method10251(1040979577);
		method10256((byte) 2);
		method10257(-575984034);
		method10238((byte) -109);
	}

	public void method10268(Class509 class509, Class647 class647, int i) {
		aClass647_8149 = class647;
		Class631 class631 = method10249(class509, (byte) 122);
		if (aClass647_8149 != null) {
			if (null == aClass631_8134)
				aClass631_8134 = new Class631();
			aClass631_8134.method10439(class631, -174781338);
			aClass631_8134.method10441(this, aClass647_8149, 2130113350);
			method10318(aClass631_8134, i, (byte) 60);
		} else {
			method10318(class631, i, (byte) 70);
			aClass631_8134 = null;
		}
	}

	public void method10269(Class509 class509, Class647 class647, int i) {
		aClass647_8149 = class647;
		Class631 class631 = method10249(class509, (byte) 113);
		if (aClass647_8149 != null) {
			if (null == aClass631_8134)
				aClass631_8134 = new Class631();
			aClass631_8134.method10439(class631, -1273259027);
			aClass631_8134.method10441(this, aClass647_8149, 159432726);
			method10318(aClass631_8134, i, (byte) 126);
		} else {
			method10318(class631, i, (byte) 88);
			aClass631_8134 = null;
		}
	}

	public Class647 method10270() {
		return aClass647_8149;
	}

	public void method10271(Class509 class509, int i) {
		Class631 class631 = method10249(class509, (byte) 119);
		if (aClass647_8149 != null) {
			aClass631_8134.method10439(class631, 462275408);
			aClass631_8134.method10441(this, aClass647_8149, -245338792);
			method10318(aClass631_8134, aClass647_8149.method10777(318492261), (byte) 99);
		} else
			method10318(class631, 824935819 * anInt8123, (byte) 73);
		method10251(1040979577);
		method10256((byte) 68);
		method10257(-1200755533);
		method10238((byte) 68);
	}

	public Class631 method10272() {
		return aClass631_8132;
	}

	void method10273() {
		aClass180_8124.method3478((0.7F + ((float) Class204.aClass527_Sub31_2213.aClass700_Sub14_10593.method16970((byte) -30) * 0.1F) + client.aClass509_11072.method8288(-1897120287)) * aClass631_8132.aFloat8241);
		aClass180_8124.method3157(-559548817 * aClass631_8132.anInt8250, aClass631_8132.aFloat8240, aClass631_8132.aFloat8254, (float) ((int) aClass442_8126.aFloat4918 << 2), (float) ((int) aClass442_8126.aFloat4915 << 2), (float) ((int) aClass442_8126.aFloat4919 << 2));
		aClass180_8124.method3193(aClass631_8132.aClass179_8239);
	}

	Class511 method10274(int i, int i_27_, int i_28_, int i_29_) {
		long l = (((long) i_27_ & 0xffffL) << 48 | ((long) i_28_ & 0xffffL) << 32 | ((long) i_29_ & 0xffffL) << 16 | (long) i & 0xffffL);
		Class511 class511 = (Class511) aClass205_8135.method3787(l);
		if (class511 == null) {
			class511 = Class556.method9419(i, i_27_, i_28_, i_29_, Class84.aClass24_Sub1_815, Class189.aClass24_Sub7_2127, 2030311572);
			aClass205_8135.method3790(class511, l);
		}
		return class511;
	}

	public Class631 method10275() {
		return aClass631_8132;
	}

	public void method10276(Class623 class623_30_) {
		aClass631_8132.method10439(class623_30_.aClass631_8132, 284301366);
		aClass631_8136.method10439(class623_30_.aClass631_8136, 1997950319);
		aClass631_8133.method10439(class623_30_.aClass631_8133, -2080071949);
		aLong8128 = 1L * class623_30_.aLong8128;
		anInt8131 = 1 * class623_30_.anInt8131;
		anInt8120 = class623_30_.anInt8120 * 1;
	}

	public void method10277(Class623 class623_31_) {
		aClass631_8132.method10439(class623_31_.aClass631_8132, -1316813476);
		aClass631_8136.method10439(class623_31_.aClass631_8136, -742371223);
		aClass631_8133.method10439(class623_31_.aClass631_8133, 841538618);
		aLong8128 = 1L * class623_31_.aLong8128;
		anInt8131 = 1 * class623_31_.anInt8131;
		anInt8120 = class623_31_.anInt8120 * 1;
	}

	Class179 method10278(int i) {
		Class179 class179 = (Class179) aClass205_8137.method3787((long) i);
		if (class179 != null)
			return class179;
		class179 = aClass180_8124.method3191(i);
		aClass205_8137.method3790(class179, (long) i);
		return class179;
	}

	Class172 method10279(int i, int i_32_) {
		Class172 class172 = (Class172) aClass205_8139.method3787((long) i);
		if (null != class172)
			return class172;
		Class185 class185 = Class165.method2665(aClass459_8140, i);
		if (class185 != null && class185.method3636() == 256 && class185.method3570() == 16) {
			int[] is = class185.method3584(false);
			class172 = aClass180_8124.method3199(is);
			if (null != class172)
				aClass205_8139.method3790(class172, (long) i);
		}
		return class172;
	}

	void method10280() {
		aBool8141 = false;
		int[] is = anIntArray8142;
		int[] is_33_ = anIntArray8142;
		anIntArray8142[2] = -1;
		is_33_[1] = -1;
		is[0] = -1;
		float[] fs = aFloatArray8143;
		float[] fs_34_ = aFloatArray8143;
		aFloatArray8143[2] = 0.0F;
		fs_34_[1] = 0.0F;
		fs[0] = 0.0F;
	}

	public void method10281(Class509 class509) {
		Class631 class631 = method10249(class509, (byte) 121);
		if (null != aClass647_8149) {
			aClass631_8134.method10439(class631, 550684681);
			aClass631_8134.method10441(this, aClass647_8149, -235145086);
			method10318(aClass631_8134, aClass647_8149.method10777(318492261), (byte) 74);
		} else
			method10318(class631, anInt8123 * 824935819, (byte) 84);
		method10251(1040979577);
		method10253(892257427);
		method10294(683243218);
	}

	Class172 method10282(int i) {
		Class172 class172 = (Class172) aClass205_8139.method3787((long) i);
		if (null != class172)
			return class172;
		Class185 class185 = Class165.method2665(aClass459_8140, i);
		if (class185 != null && class185.method3636() == 256 && class185.method3570() == 16) {
			int[] is = class185.method3584(false);
			class172 = aClass180_8124.method3199(is);
			if (null != class172)
				aClass205_8139.method3790(class172, (long) i);
		}
		return class172;
	}

	Class172 method10283(int i) {
		Class172 class172 = (Class172) aClass205_8139.method3787((long) i);
		if (null != class172)
			return class172;
		Class185 class185 = Class165.method2665(aClass459_8140, i);
		if (class185 != null && class185.method3636() == 256 && class185.method3570() == 16) {
			int[] is = class185.method3584(false);
			class172 = aClass180_8124.method3199(is);
			if (null != class172)
				aClass205_8139.method3790(class172, (long) i);
		}
		return class172;
	}

	public void method10284(int i, int i_35_, Class631 class631) {
		aClass631ArrayArray8125[i][i_35_] = class631;
	}

	public void method10285(int i, int i_36_, Class631 class631) {
		aClass631ArrayArray8125[i][i_36_] = class631;
	}

	public void method10286(int i, int i_37_, Class631 class631) {
		aClass631ArrayArray8125[i][i_37_] = class631;
	}

	void method10287() {
		if (anInt8120 * 1988106259 >= 0) {
			long l = Class234.method4347(-1408626088);
			anInt8120 -= (l - 8433384305172803863L * aLong8128) * 633827867L;
			if (1988106259 * anInt8120 > 0)
				aClass631_8132.method10434(aClass180_8124, aClass631_8136, aClass631_8133, ((float) (-1650172335 * anInt8131 - anInt8120 * 1988106259) / (float) (anInt8131 * -1650172335)), 2064531847);
			else {
				aClass631_8132.method10439(aClass631_8133, 1161090062);
				if (aClass631_8132.aClass511_8249 != null)
					aClass631_8132.aClass511_8249.method8449((byte) 0);
				anInt8120 = -633827867;
			}
			aLong8128 = 7881730836209751719L * l;
		}
	}

	public void method10288() {
		for (int i = 0; i < aClass631ArrayArray8125.length; i++) {
			for (int i_38_ = 0; i_38_ < aClass631ArrayArray8125[i].length; i_38_++)
				aClass631ArrayArray8125[i][i_38_] = aClass631_8130;
		}
	}

	public void method10289() {
		for (int i = 0; i < aClass631ArrayArray8125.length; i++) {
			for (int i_39_ = 0; i_39_ < aClass631ArrayArray8125[i].length; i_39_++)
				aClass631ArrayArray8125[i][i_39_] = aClass631_8130;
		}
	}

	public void method10290() {
		for (int i = 0; i < aClass631ArrayArray8125.length; i++) {
			for (int i_40_ = 0; i_40_ < aClass631ArrayArray8125[i].length; i_40_++)
				aClass631ArrayArray8125[i][i_40_] = aClass631_8130;
		}
	}

	Class631 method10291(Class509 class509) {
		Object object = null;
		int i = -1;
		int i_41_ = -1;
		if (Class640_Sub1_Sub3_Sub2.method18677(client.anInt11048 * -1927019389, 1495946201) || Class208_Sub23.method15642(-1927019389 * client.anInt11048, -646713422)) {
			i = Class320.anInt3543 * -1998563323 >> 12;
			i_41_ = -1261737255 * Class201.anInt2211 >> 12;
		} else {
			if (null != Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937) {
				i = (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.anIntArray11902[0]) >> 3;
				i_41_ = (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.anIntArray11944[0]) >> 3;
			}
			if (i < 0 || i >= class509.method8284((byte) 29) >> 3 || i_41_ < 0 || i_41_ >= class509.method8285(1264230851) >> 3) {
				i = class509.method8284((byte) 36) >> 4;
				i_41_ = class509.method8285(-836678207) >> 4;
			}
		}
		Class631 class631 = aClass631ArrayArray8125[i][i_41_];
		if (class631 == null)
			class631 = aClass631_8130;
		return class631;
	}

	void method10292(Class631 class631, int i) {
		if (aBool8127) {
			aBool8127 = false;
			i = 0;
		}
		if (!aClass631_8133.method10445(class631, 1847280813)) {
			aClass631_8133.method10439(class631, -1062632803);
			aLong8128 = Class234.method4347(-1408626088) * 7881730836209751719L;
			anInt8131 = (anInt8120 = i * 633827867) * 1356350243;
			if (0 != -1650172335 * anInt8131) {
				aClass631_8136.method10439(aClass631_8132, 1174491633);
				if (aClass631_8132.aClass511_8249 != null) {
					if (aClass631_8132.aClass511_8249.method8450(1302023843))
						aClass631_8132.aClass511_8249 = aClass631_8136.aClass511_8249 = aClass631_8132.aClass511_8249.method8451(1915616478);
					if (aClass631_8132.aClass511_8249 != null && (aClass631_8133.aClass511_8249 != aClass631_8132.aClass511_8249))
						aClass631_8132.aClass511_8249.method8482(aClass631_8133.aClass511_8249, (byte) -117);
				}
			}
		}
	}

	void method10293(Class631 class631, int i) {
		if (aBool8127) {
			aBool8127 = false;
			i = 0;
		}
		if (!aClass631_8133.method10445(class631, 749755538)) {
			aClass631_8133.method10439(class631, -1101349794);
			aLong8128 = Class234.method4347(-1408626088) * 7881730836209751719L;
			anInt8131 = (anInt8120 = i * 633827867) * 1356350243;
			if (0 != -1650172335 * anInt8131) {
				aClass631_8136.method10439(aClass631_8132, 728220380);
				if (aClass631_8132.aClass511_8249 != null) {
					if (aClass631_8132.aClass511_8249.method8450(-1742321123))
						aClass631_8132.aClass511_8249 = aClass631_8136.aClass511_8249 = aClass631_8132.aClass511_8249.method8451(1915616478);
					if (aClass631_8132.aClass511_8249 != null && (aClass631_8133.aClass511_8249 != aClass631_8132.aClass511_8249))
						aClass631_8132.aClass511_8249.method8482(aClass631_8133.aClass511_8249, (byte) -57);
				}
			}
		}
	}

	public void method10294(int i) {
		int i_42_ = 0;
		int i_43_ = i_42_ + (256 + aClass631_8132.anInt8244 * -598890845 << 2);
		aClass180_8124.method3187(aClass631_8132.anInt8243 * -1074650777, (Class204.aClass527_Sub31_2213.aClass700_Sub15_10598.method16992(1440439241) == 1 ? i_43_ : -1), 0);
	}

	public void method10295(Class509 class509, Class647 class647, int i, int i_44_) {
		aClass647_8149 = class647;
		Class631 class631 = method10249(class509, (byte) 118);
		if (aClass647_8149 != null) {
			if (null == aClass631_8134)
				aClass631_8134 = new Class631();
			aClass631_8134.method10439(class631, -861450392);
			aClass631_8134.method10441(this, aClass647_8149, -882574067);
			method10318(aClass631_8134, i, (byte) 66);
		} else {
			method10318(class631, i, (byte) 55);
			aClass631_8134 = null;
		}
	}

	void method10296() {
		if (anInt8120 * 1988106259 >= 0) {
			long l = Class234.method4347(-1408626088);
			anInt8120 -= (l - 8433384305172803863L * aLong8128) * 633827867L;
			if (1988106259 * anInt8120 > 0)
				aClass631_8132.method10434(aClass180_8124, aClass631_8136, aClass631_8133, ((float) (-1650172335 * anInt8131 - anInt8120 * 1988106259) / (float) (anInt8131 * -1650172335)), 2029984591);
			else {
				aClass631_8132.method10439(aClass631_8133, 1611590466);
				if (aClass631_8132.aClass511_8249 != null)
					aClass631_8132.aClass511_8249.method8449((byte) 0);
				anInt8120 = -633827867;
			}
			aLong8128 = 7881730836209751719L * l;
		}
	}

	void method10297() {
		if (anInt8120 * 1988106259 >= 0) {
			long l = Class234.method4347(-1408626088);
			anInt8120 -= (l - 8433384305172803863L * aLong8128) * 633827867L;
			if (1988106259 * anInt8120 > 0)
				aClass631_8132.method10434(aClass180_8124, aClass631_8136, aClass631_8133, ((float) (-1650172335 * anInt8131 - anInt8120 * 1988106259) / (float) (anInt8131 * -1650172335)), 2020636860);
			else {
				aClass631_8132.method10439(aClass631_8133, 286871704);
				if (aClass631_8132.aClass511_8249 != null)
					aClass631_8132.aClass511_8249.method8449((byte) 0);
				anInt8120 = -633827867;
			}
			aLong8128 = 7881730836209751719L * l;
		}
	}

	void method10298() {
		if (anInt8120 * 1988106259 >= 0) {
			long l = Class234.method4347(-1408626088);
			anInt8120 -= (l - 8433384305172803863L * aLong8128) * 633827867L;
			if (1988106259 * anInt8120 > 0)
				aClass631_8132.method10434(aClass180_8124, aClass631_8136, aClass631_8133, ((float) (-1650172335 * anInt8131 - anInt8120 * 1988106259) / (float) (anInt8131 * -1650172335)), 2018193605);
			else {
				aClass631_8132.method10439(aClass631_8133, 985773364);
				if (aClass631_8132.aClass511_8249 != null)
					aClass631_8132.aClass511_8249.method8449((byte) 0);
				anInt8120 = -633827867;
			}
			aLong8128 = 7881730836209751719L * l;
		}
	}

	public void method10299() {
		aBool8127 = true;
	}

	public Class647 method10300() {
		return aClass647_8149;
	}

	public void method10301() {
		aClass180_8124.method3478((0.7F + ((float) Class204.aClass527_Sub31_2213.aClass700_Sub14_10593.method16970((byte) -77) * 0.1F) + client.aClass509_11072.method8288(1662569858)) * 1.1523438F);
		aClass180_8124.method3157(16777215, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
		aClass180_8124.method3187(13156520, -1, 0);
		aClass180_8124.method3193(aClass179_8121);
	}

	public void method10302(float f, float f_45_, float f_46_, int i, int i_47_, int i_48_, int i_49_, int i_50_) {
		aClass180_8124.method3478((0.7F + ((float) Class204.aClass527_Sub31_2213.aClass700_Sub14_10593.method16970((byte) -118) * 0.1F) + client.aClass509_11072.method8288(-541928332)) * f);
		aClass180_8124.method3157(i, f_45_, f_46_, (float) (i_47_ << 2), (float) (i_48_ << 2), (float) (i_49_ << 2));
		aClass180_8124.method3193(method10261(i_50_, 2110009189));
	}

	public void method10303() {
		int i = 0;
		int i_51_ = i + (256 + aClass631_8132.anInt8244 * -598890845 << 2);
		aClass180_8124.method3187(aClass631_8132.anInt8243 * -1074650777, (Class204.aClass527_Sub31_2213.aClass700_Sub15_10598.method16992(1555312287) == 1 ? i_51_ : -1), 0);
	}

	public void method10304() {
		int i = 0;
		int i_52_ = i + (256 + aClass631_8132.anInt8244 * -598890845 << 2);
		aClass180_8124.method3187(aClass631_8132.anInt8243 * -1074650777, (Class204.aClass527_Sub31_2213.aClass700_Sub15_10598.method16992(214624657) == 1 ? i_52_ : -1), 0);
	}

	public void method10305(int i) {
		aClass180_8124.method3478((0.7F + ((float) Class204.aClass527_Sub31_2213.aClass700_Sub14_10593.method16970((byte) -64) * 0.1F) + client.aClass509_11072.method8288(670710210)) * 1.1523438F);
		aClass180_8124.method3157(16777215, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
		aClass180_8124.method3187(13156520, -1, 0);
		aClass180_8124.method3193(aClass179_8121);
	}

	void method10306() {
		aClass180_8124.method3400(aClass631_8132.aFloat8248, aClass631_8132.aFloat8246, aClass631_8132.aFloat8242, 1541638352);
	}

	void method10307(Class631 class631, int i) {
		if (aBool8127) {
			aBool8127 = false;
			i = 0;
		}
		if (!aClass631_8133.method10445(class631, 740992599)) {
			aClass631_8133.method10439(class631, 848189651);
			aLong8128 = Class234.method4347(-1408626088) * 7881730836209751719L;
			anInt8131 = (anInt8120 = i * 633827867) * 1356350243;
			if (0 != -1650172335 * anInt8131) {
				aClass631_8136.method10439(aClass631_8132, -479126061);
				if (aClass631_8132.aClass511_8249 != null) {
					if (aClass631_8132.aClass511_8249.method8450(-361792276))
						aClass631_8132.aClass511_8249 = aClass631_8136.aClass511_8249 = aClass631_8132.aClass511_8249.method8451(1915616478);
					if (aClass631_8132.aClass511_8249 != null && (aClass631_8133.aClass511_8249 != aClass631_8132.aClass511_8249))
						aClass631_8132.aClass511_8249.method8482(aClass631_8133.aClass511_8249, (byte) -26);
				}
			}
		}
	}

	void method10308() {
		if (aClass180_8124.method3197()) {
			if (aBool8144)
				aClass180_8124.method3198(aFloat8145, aFloat8146, aFloat8147, aFloat8148, aFloat8129);
			else
				aClass180_8124.method3198(aClass631_8132.aFloat8247, aClass631_8132.aFloat8252, aClass631_8132.aFloat8245, aClass631_8132.aFloat8253, aClass631_8132.aFloat8251);
		}
	}

	void method10309() {
		if (aClass180_8124.method3197()) {
			if (aBool8144)
				aClass180_8124.method3198(aFloat8145, aFloat8146, aFloat8147, aFloat8148, aFloat8129);
			else
				aClass180_8124.method3198(aClass631_8132.aFloat8247, aClass631_8132.aFloat8252, aClass631_8132.aFloat8245, aClass631_8132.aFloat8253, aClass631_8132.aFloat8251);
		}
	}

	public Class623(Class180 class180, Class459 class459, int i, int i_53_) {
		anInt8120 = -633827867;
		aLong8128 = 0L;
		aBool8127 = false;
		aClass442_8126 = new Class442(-50.0F, -60.0F, -50.0F);
		aClass205_8137 = new Class205(8);
		aClass205_8135 = new Class205(8);
		aClass205_8139 = new Class205(9);
		aBool8141 = false;
		anIntArray8142 = new int[] { -1, -1, -1 };
		aFloatArray8143 = new float[] { 0.0F, 0.0F, 0.0F };
		aBool8144 = false;
		aClass180_8124 = class180;
		aClass459_8140 = class459;
		aClass631ArrayArray8125 = new Class631[i][i_53_];
		if (-739578041 * anInt8138 != -1)
			aClass179_8121 = method10261(-739578041 * anInt8138, 2101316406);
		aClass511_8122 = null;
		aClass631_8130 = new Class631();
		aClass631_8132 = new Class631();
		aClass631_8136 = new Class631();
		aClass631_8133 = new Class631();
		method10252((short) -28319);
		method10315(-586967155);
		method10258(622723099);
	}

	void method10310() {
		if (aClass180_8124.method3197()) {
			if (aBool8144)
				aClass180_8124.method3198(aFloat8145, aFloat8146, aFloat8147, aFloat8148, aFloat8129);
			else
				aClass180_8124.method3198(aClass631_8132.aFloat8247, aClass631_8132.aFloat8252, aClass631_8132.aFloat8245, aClass631_8132.aFloat8253, aClass631_8132.aFloat8251);
		}
	}

	void method10311() {
		aClass180_8124.method3478((0.7F + ((float) Class204.aClass527_Sub31_2213.aClass700_Sub14_10593.method16970((byte) -10) * 0.1F) + client.aClass509_11072.method8288(-888442133)) * aClass631_8132.aFloat8241);
		aClass180_8124.method3157(-559548817 * aClass631_8132.anInt8250, aClass631_8132.aFloat8240, aClass631_8132.aFloat8254, (float) ((int) aClass442_8126.aFloat4918 << 2), (float) ((int) aClass442_8126.aFloat4915 << 2), (float) ((int) aClass442_8126.aFloat4919 << 2));
		aClass180_8124.method3193(aClass631_8132.aClass179_8239);
	}

	void method10312() {
		aBool8144 = false;
		aFloat8145 = 1.0F;
		aFloat8146 = 0.0F;
		aFloat8147 = 1.0F;
		aFloat8148 = 0.0F;
		aFloat8129 = 1.0F;
	}

	Class511 method10313(int i, int i_54_, int i_55_, int i_56_) {
		long l = (((long) i_54_ & 0xffffL) << 48 | ((long) i_55_ & 0xffffL) << 32 | ((long) i_56_ & 0xffffL) << 16 | (long) i & 0xffffL);
		Class511 class511 = (Class511) aClass205_8135.method3787(l);
		if (class511 == null) {
			class511 = Class556.method9419(i, i_54_, i_55_, i_56_, Class84.aClass24_Sub1_815, Class189.aClass24_Sub7_2127, 1988272530);
			aClass205_8135.method3790(class511, l);
		}
		return class511;
	}

	void method10314() {
		if (aClass180_8124.method3200()) {
			Class172 class172 = null;
			Class172 class172_57_ = null;
			Class172 class172_58_ = null;
			if (aBool8141) {
				if (anIntArray8142[0] > -1)
					class172 = method10279(anIntArray8142[0], -383695469);
				if (anIntArray8142[1] > -1)
					class172_57_ = method10279(anIntArray8142[1], -383695469);
				if (anIntArray8142[2] > -1)
					class172_58_ = method10279(anIntArray8142[2], -383695469);
				aClass180_8124.method3201(class172, aFloatArray8143[0], class172_57_, aFloatArray8143[1], class172_58_, aFloatArray8143[2]);
			} else {
				if (aClass631_8132.anIntArray8255[0] > -1)
					class172 = method10279(aClass631_8132.anIntArray8255[0], -383695469);
				if (aClass631_8132.anIntArray8255[1] > -1)
					class172_57_ = method10279(aClass631_8132.anIntArray8255[1], -383695469);
				if (aClass631_8132.anIntArray8255[2] > -1)
					class172_58_ = method10279(aClass631_8132.anIntArray8255[2], -383695469);
				aClass180_8124.method3201(class172, aClass631_8132.aFloatArray8256[0], class172_57_, aClass631_8132.aFloatArray8256[1], class172_58_, aClass631_8132.aFloatArray8256[2]);
			}
		}
	}

	void method10315(int i) {
		aBool8141 = false;
		int[] is = anIntArray8142;
		int[] is_59_ = anIntArray8142;
		anIntArray8142[2] = -1;
		is_59_[1] = -1;
		is[0] = -1;
		float[] fs = aFloatArray8143;
		float[] fs_60_ = aFloatArray8143;
		aFloatArray8143[2] = 0.0F;
		fs_60_[1] = 0.0F;
		fs[0] = 0.0F;
	}

	public Class631 method10316() {
		return aClass631_8132;
	}

	void method10317() {
		aBool8141 = false;
		int[] is = anIntArray8142;
		int[] is_61_ = anIntArray8142;
		anIntArray8142[2] = -1;
		is_61_[1] = -1;
		is[0] = -1;
		float[] fs = aFloatArray8143;
		float[] fs_62_ = aFloatArray8143;
		aFloatArray8143[2] = 0.0F;
		fs_62_[1] = 0.0F;
		fs[0] = 0.0F;
	}

	void method10318(Class631 class631, int i, byte i_63_) {
		if (aBool8127) {
			aBool8127 = false;
			i = 0;
		}
		if (!aClass631_8133.method10445(class631, -1263944405)) {
			aClass631_8133.method10439(class631, -1559592239);
			aLong8128 = Class234.method4347(-1408626088) * 7881730836209751719L;
			anInt8131 = (anInt8120 = i * 633827867) * 1356350243;
			if (0 != -1650172335 * anInt8131) {
				aClass631_8136.method10439(aClass631_8132, 1959791792);
				if (aClass631_8132.aClass511_8249 != null) {
					if (aClass631_8132.aClass511_8249.method8450(1992349441))
						aClass631_8132.aClass511_8249 = aClass631_8136.aClass511_8249 = aClass631_8132.aClass511_8249.method8451(1915616478);
					if (aClass631_8132.aClass511_8249 != null && (aClass631_8133.aClass511_8249 != aClass631_8132.aClass511_8249))
						aClass631_8132.aClass511_8249.method8482(aClass631_8133.aClass511_8249, (byte) -31);
				}
			}
		}
	}

	public void method10319() {
		aClass180_8124.method3478((0.7F + ((float) Class204.aClass527_Sub31_2213.aClass700_Sub14_10593.method16970((byte) -46) * 0.1F) + client.aClass509_11072.method8288(516685069)) * 1.1523438F);
		aClass180_8124.method3157(16777215, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
		aClass180_8124.method3187(13156520, -1, 0);
		aClass180_8124.method3193(aClass179_8121);
	}

	void method10320() {
		if (aClass180_8124.method3200()) {
			Class172 class172 = null;
			Class172 class172_64_ = null;
			Class172 class172_65_ = null;
			if (aBool8141) {
				if (anIntArray8142[0] > -1)
					class172 = method10279(anIntArray8142[0], -383695469);
				if (anIntArray8142[1] > -1)
					class172_64_ = method10279(anIntArray8142[1], -383695469);
				if (anIntArray8142[2] > -1)
					class172_65_ = method10279(anIntArray8142[2], -383695469);
				aClass180_8124.method3201(class172, aFloatArray8143[0], class172_64_, aFloatArray8143[1], class172_65_, aFloatArray8143[2]);
			} else {
				if (aClass631_8132.anIntArray8255[0] > -1)
					class172 = method10279(aClass631_8132.anIntArray8255[0], -383695469);
				if (aClass631_8132.anIntArray8255[1] > -1)
					class172_64_ = method10279(aClass631_8132.anIntArray8255[1], -383695469);
				if (aClass631_8132.anIntArray8255[2] > -1)
					class172_65_ = method10279(aClass631_8132.anIntArray8255[2], -383695469);
				aClass180_8124.method3201(class172, aClass631_8132.aFloatArray8256[0], class172_64_, aClass631_8132.aFloatArray8256[1], class172_65_, aClass631_8132.aFloatArray8256[2]);
			}
		}
	}

	public void method10321() {
		aClass180_8124.method3478((0.7F + ((float) Class204.aClass527_Sub31_2213.aClass700_Sub14_10593.method16970((byte) -43) * 0.1F) + client.aClass509_11072.method8288(1605431671)) * 1.1523438F);
		aClass180_8124.method3157(16777215, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
		aClass180_8124.method3187(13156520, -1, 0);
		aClass180_8124.method3193(aClass179_8121);
	}

	static int method10322(Class459 class459, Class657 class657, int i) {
		if (class459 != null) {
			if (class657.method10999((byte) 0) > 1) {
				int i_66_ = class459.method7561((byte) -15) - 1;
				return (i_66_ * class657.method10999((byte) 0) + class459.method7504(i_66_, -559776188));
			}
			return class459.method7504(-1573209759 * class657.anInt8404, -2105542206);
		}
		return 0;
	}
}
