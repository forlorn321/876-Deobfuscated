/* Class636 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class636 {
	Class625 aClass625_8268;
	float[] aFloatArray8269;
	Class436 aClass436_8270;
	Class625[][] aClass625ArrayArray8271;
	Class167 aClass167_8272;
	int anInt8273;
	long aLong8274;
	boolean aBool8275;
	float aFloat8276;
	Class625 aClass625_8277;
	Class625 aClass625_8278;
	Class625 aClass625_8279;
	JS5ResourceProvider aClass461_8280;
	Class642 aClass642_8281;
	float aFloat8282;
	Class199 aClass199_8283;
	Class199 aClass199_8284;
	int anInt8285 = 0;
	public static int anInt8286 = 730890537;
	boolean aBool8287;
	int[] anIntArray8288;
	static int anInt8289 = 1703272277;
	boolean aBool8290;
	float aFloat8291;
	Class199 aClass199_8292;
	Class625 aClass625_8293;
	float aFloat8294;
	float aFloat8295;

	void method7566(int i) {
		aBool8290 = false;
		aFloat8291 = 1.0F;
		aFloat8294 = 0.0F;
		aFloat8276 = 1.0F;
		aFloat8282 = 0.0F;
		aFloat8295 = 1.0F;
	}

	public void method7567(Class515 class515, int i) {
		Class625 class625 = method7578(class515, -719122001);
		if (aClass642_8281 != null) {
			aClass625_8268.method7447(class625, (byte) 120);
			aClass625_8268.method7432(this, aClass642_8281, -1254879609);
			method7579(aClass625_8268, aClass642_8281.method7693((short) 255), 1948634783);
		} else
			method7579(class625, anInt8289 * -40370349, 2065427446);
		method7580(-1556561959);
		method7589(-1678337564);
		method7583(879655403);
	}

	public void method7568(Class515 class515, int i) {
		Class625 class625 = method7578(class515, -719122001);
		if (null != aClass642_8281) {
			aClass625_8268.method7447(class625, (byte) 40);
			aClass625_8268.method7432(this, aClass642_8281, -2037039673);
			method7579(aClass625_8268, aClass642_8281.method7693((short) 255), 2139732767);
		} else
			method7579(class625, anInt8289 * -40370349, 2065308429);
		method7580(-1556561959);
		method7584((byte) 40);
		method7585(344706607);
		method7599((byte) 5);
	}

	public Class642 method7569(byte i) {
		return aClass642_8281;
	}

	public Class625 method7570(byte i) {
		return aClass625_8277;
	}

	public void method7571(Class636 class636_0_, int i) {
		aClass625_8277.method7447(class636_0_.aClass625_8277, (byte) -34);
		aClass625_8278.method7447(class636_0_.aClass625_8278, (byte) -119);
		aClass625_8279.method7447(class636_0_.aClass625_8279, (byte) -33);
		aLong8274 = class636_0_.aLong8274 * 1L;
		anInt8285 = 1 * class636_0_.anInt8285;
		anInt8273 = class636_0_.anInt8273 * 1;
	}

	public void method7572(int i, int i_1_) {
		Class625 class625 = aClass625ArrayArray8271[i][i_1_];
		if (null != class625)
			aClass436_8270.method5272(class625.aClass436_8138);
		method7589(-1445983606);
	}

	Class176 method7573(int i, int i_2_) {
		Class176 class176 = (Class176) aClass199_8283.method2886((long) i);
		if (null != class176)
			return class176;
		class176 = aClass167_8272.method2111(i);
		aClass199_8283.method2881(class176, (long) i);
		return class176;
	}

	void method7574() {
		if (aClass167_8272.method2281()) {
			Class168 class168 = null;
			Class168 class168_3_ = null;
			Class168 class168_4_ = null;
			if (aBool8287) {
				if (anIntArray8288[0] > -1)
					class168 = method7614(anIntArray8288[0], -2121463360);
				if (anIntArray8288[1] > -1)
					class168_3_ = method7614(anIntArray8288[1], -1905482886);
				if (anIntArray8288[2] > -1)
					class168_4_ = method7614(anIntArray8288[2], -1785095184);
				aClass167_8272.method2187(class168, aFloatArray8269[0], class168_3_, aFloatArray8269[1], class168_4_, aFloatArray8269[2]);
			} else {
				if (aClass625_8277.anIntArray8151[0] > -1)
					class168 = method7614(aClass625_8277.anIntArray8151[0], -2016186586);
				if (aClass625_8277.anIntArray8151[1] > -1)
					class168_3_ = method7614(aClass625_8277.anIntArray8151[1], -2025388888);
				if (aClass625_8277.anIntArray8151[2] > -1)
					class168_4_ = method7614(aClass625_8277.anIntArray8151[2], -1764971586);
				aClass167_8272.method2187(class168, aClass625_8277.aFloatArray8152[0], class168_3_, aClass625_8277.aFloatArray8152[1], class168_4_, aClass625_8277.aFloatArray8152[2]);
			}
		}
	}

	public void method7575(int i, int i_5_, Class625 class625, int i_6_) {
		aClass625ArrayArray8271[i][i_5_] = class625;
	}

	public void method7576(byte i) {
		for (int i_7_ = 0; i_7_ < aClass625ArrayArray8271.length; i_7_++) {
			for (int i_8_ = 0; i_8_ < aClass625ArrayArray8271[i_7_].length; i_8_++)
				aClass625ArrayArray8271[i_7_][i_8_] = aClass625_8293;
		}
	}

	public void method7577(int i, int i_9_) {
		Class625 class625 = aClass625ArrayArray8271[i][i_9_];
		if (null != class625)
			aClass436_8270.method5272(class625.aClass436_8138);
		method7589(-2145647313);
	}

	Class625 method7578(Class515 class515, int i) {
		Object object = null;
		int i_10_ = -1;
		int i_11_ = -1;
		if (RSOutputStream.method6895(-708374433 * client.anInt11101, 2024182213) || Class233.method3334(-708374433 * client.anInt11101, (byte) -103)) {
			i_10_ = -1607026219 * Class637.anInt8301 >> 12;
			i_11_ = Class685.anInt8665 * -1646092097 >> 12;
		} else {
			if (null != Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591) {
				i_10_ = (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.screenX[0]) >> 3;
				i_11_ = (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.screenY[0]) >> 3;
			}
			if (i_10_ < 0 || i_10_ >= class515.method6321((byte) 0) >> 3 || i_11_ < 0 || i_11_ >= class515.method6243(177401017) >> 3) {
				i_10_ = class515.method6321((byte) -11) >> 4;
				i_11_ = class515.method6243(177401017) >> 4;
			}
		}
		Class625 class625 = aClass625ArrayArray8271[i_10_][i_11_];
		if (class625 == null)
			class625 = aClass625_8293;
		return class625;
	}

	void method7579(Class625 class625, int i, int i_12_) {
		if (aBool8275) {
			aBool8275 = false;
			i = 0;
		}
		if (!aClass625_8279.method7437(class625, -594094187)) {
			aClass625_8279.method7447(class625, (byte) -81);
			aLong8274 = Class249.method3450(1458813530) * 7792391637566570963L;
			anInt8285 = (anInt8273 = 408431021 * i) * -1704698281;
			if (0 != 312180195 * anInt8285) {
				aClass625_8278.method7447(aClass625_8277, (byte) 118);
				if (null != aClass625_8277.aClass507_8145) {
					if (aClass625_8277.aClass507_8145.method6161(-1224469437))
						aClass625_8277.aClass507_8145 = aClass625_8278.aClass507_8145 = aClass625_8277.aClass507_8145.method6150((byte) 58);
					if (aClass625_8277.aClass507_8145 != null && (aClass625_8277.aClass507_8145 != aClass625_8279.aClass507_8145))
						aClass625_8277.aClass507_8145.method6156(aClass625_8279.aClass507_8145, (byte) -32);
				}
			}
		}
	}

	void method7580(int i) {
		if (633152037 * anInt8273 >= 0) {
			long l = Class249.method3450(1531251452);
			anInt8273 -= (l - 168657240566382171L * aLong8274) * 408431021L;
			if (633152037 * anInt8273 > 0)
				aClass625_8277.method7433(aClass167_8272, aClass625_8278, aClass625_8279, ((float) (anInt8285 * 312180195 - 633152037 * anInt8273) / (float) (312180195 * anInt8285)), 31456006);
			else {
				aClass625_8277.method7447(aClass625_8279, (byte) -30);
				if (null != aClass625_8277.aClass507_8145)
					aClass625_8277.aClass507_8145.method6166((byte) 106);
				anInt8273 = -408431021;
			}
			aLong8274 = 7792391637566570963L * l;
		}
	}

	public void method7581(byte i) {
		aBool8275 = true;
	}

	public void method7582(float f, float f_13_, float f_14_, int i, int i_15_, int i_16_, int i_17_, int i_18_, short i_19_) {
		aClass167_8272.method2006((0.7F + ((float) ClientSetting.aClass536_Sub40_8843.brightnessSetting.method10046(-1506046098) * 0.1F) + client.aClass515_11066.method6279(-55040565)) * f);
		aClass167_8272.method2105(i, f_13_, f_14_, (float) (i_15_ << 2), (float) (i_16_ << 2), (float) (i_17_ << 2));
		aClass167_8272.method2113(method7573(i_18_, -2070407701));
	}

	public void method7583(int i) {
		int i_20_ = 0;
		int i_21_ = i_20_ + (aClass625_8277.anInt8143 * -679981209 + 256 << 2);
		aClass167_8272.method2107(-677219717 * aClass625_8277.anInt8140, (ClientSetting.aClass536_Sub40_8843.fogSetting.method10081(1436659191) == 1 ? i_21_ : -1), 0);
	}

	void method7584(byte i) {
		aClass167_8272.method2125(aClass625_8277.aFloat8149, aClass625_8277.aFloat8142, aClass625_8277.aFloat8144, (byte) 36);
	}

	void method7585(int i) {
		if (aClass167_8272.method2340()) {
			if (aBool8290)
				aClass167_8272.method2118(aFloat8291, aFloat8294, aFloat8276, aFloat8282, aFloat8295);
			else
				aClass167_8272.method2118(aClass625_8277.aFloat8146, aClass625_8277.aFloat8147, aClass625_8277.aFloat8148, aClass625_8277.aFloat8134, aClass625_8277.aFloat8136);
		}
	}

	public void method7586(int i, int i_22_, byte i_23_) {
		Class625 class625 = aClass625ArrayArray8271[i][i_22_];
		if (null != class625)
			aClass436_8270.method5272(class625.aClass436_8138);
		method7589(-1923808997);
	}

	void method7587(int i) {
		aBool8287 = false;
		int[] is = anIntArray8288;
		int[] is_24_ = anIntArray8288;
		anIntArray8288[2] = -1;
		is_24_[1] = -1;
		is[0] = -1;
		float[] fs = aFloatArray8269;
		float[] fs_25_ = aFloatArray8269;
		aFloatArray8269[2] = 0.0F;
		fs_25_[1] = 0.0F;
		fs[0] = 0.0F;
	}

	void method7588() {
		aBool8287 = false;
		int[] is = anIntArray8288;
		int[] is_26_ = anIntArray8288;
		anIntArray8288[2] = -1;
		is_26_[1] = -1;
		is[0] = -1;
		float[] fs = aFloatArray8269;
		float[] fs_27_ = aFloatArray8269;
		aFloatArray8269[2] = 0.0F;
		fs_27_[1] = 0.0F;
		fs[0] = 0.0F;
	}

	public Class636(Class167 class167, JS5ResourceProvider class461, int i, int i_28_) {
		anInt8273 = -408431021;
		aLong8274 = 0L;
		aBool8275 = false;
		aClass436_8270 = new Class436(-50.0F, -60.0F, -50.0F);
		aClass199_8283 = new Class199(9);
		aClass199_8284 = new Class199(8);
		aClass199_8292 = new Class199(8);
		aBool8287 = false;
		anIntArray8288 = new int[] { -1, -1, -1 };
		aFloatArray8269 = new float[] { 0.0F, 0.0F, 0.0F };
		aBool8290 = false;
		aClass167_8272 = class167;
		aClass461_8280 = class461;
		aClass625ArrayArray8271 = new Class625[i][i_28_];
		if (anInt8286 * -1716890393 != -1)
			RuntimeException_Sub4.aClass176_12094 = method7573(anInt8286 * -1716890393, 1167872860);
		Class110.aClass507_1377 = null;
		aClass625_8293 = new Class625();
		aClass625_8277 = new Class625();
		aClass625_8278 = new Class625();
		aClass625_8279 = new Class625();
		method7581((byte) 8);
		method7587(2060215863);
		method7566(-224707280);
	}

	void method7589(int i) {
		aClass167_8272.method2006((0.7F + ((float) ClientSetting.aClass536_Sub40_8843.brightnessSetting.method10046(-1506046098) * 0.1F) + client.aClass515_11066.method6279(1188494619)) * aClass625_8277.aFloat8135);
		aClass167_8272.method2105(aClass625_8277.anInt8150 * -702010885, aClass625_8277.aFloat8141, aClass625_8277.aFloat8137, (float) ((int) aClass436_8270.aFloat4850 << 2), (float) ((int) aClass436_8270.aFloat4852 << 2), (float) ((int) aClass436_8270.aFloat4853 << 2));
		aClass167_8272.method2113(aClass625_8277.aClass176_8139);
	}

	void method7590() {
		aClass167_8272.method2125(aClass625_8277.aFloat8149, aClass625_8277.aFloat8142, aClass625_8277.aFloat8144, (byte) 36);
	}

	void method7591() {
		aClass167_8272.method2125(aClass625_8277.aFloat8149, aClass625_8277.aFloat8142, aClass625_8277.aFloat8144, (byte) 12);
	}

	public void method7592() {
		aClass199_8283.method2884((byte) -122);
		aClass199_8284.method2884((byte) -121);
		aClass199_8292.method2884((byte) -121);
	}

	void method7593() {
		aBool8290 = false;
		aFloat8291 = 1.0F;
		aFloat8294 = 0.0F;
		aFloat8276 = 1.0F;
		aFloat8282 = 0.0F;
		aFloat8295 = 1.0F;
	}

	public void method7594() {
		for (int i = 0; i < aClass625ArrayArray8271.length; i++) {
			for (int i_29_ = 0; i_29_ < aClass625ArrayArray8271[i].length; i_29_++)
				aClass625ArrayArray8271[i][i_29_] = aClass625_8293;
		}
	}

	public void method7595() {
		for (int i = 0; i < aClass625ArrayArray8271.length; i++) {
			for (int i_30_ = 0; i_30_ < aClass625ArrayArray8271[i].length; i_30_++)
				aClass625ArrayArray8271[i][i_30_] = aClass625_8293;
		}
	}

	public void method7596(int i, int i_31_) {
		Class625 class625 = aClass625ArrayArray8271[i][i_31_];
		if (null != class625)
			aClass436_8270.method5272(class625.aClass436_8138);
		method7589(-1595055507);
	}

	public void method7597(int i, int i_32_) {
		Class625 class625 = aClass625ArrayArray8271[i][i_32_];
		if (null != class625)
			aClass436_8270.method5272(class625.aClass436_8138);
		method7589(-1227168828);
	}

	public void method7598(int i) {
		aClass199_8283.method2884((byte) -108);
		aClass199_8284.method2884((byte) -113);
		aClass199_8292.method2884((byte) -23);
	}

	void method7599(byte i) {
		if (aClass167_8272.method2281()) {
			Class168 class168 = null;
			Class168 class168_33_ = null;
			Class168 class168_34_ = null;
			if (aBool8287) {
				if (anIntArray8288[0] > -1)
					class168 = method7614(anIntArray8288[0], -1911892435);
				if (anIntArray8288[1] > -1)
					class168_33_ = method7614(anIntArray8288[1], -1830657799);
				if (anIntArray8288[2] > -1)
					class168_34_ = method7614(anIntArray8288[2], -1684494343);
				aClass167_8272.method2187(class168, aFloatArray8269[0], class168_33_, aFloatArray8269[1], class168_34_, aFloatArray8269[2]);
			} else {
				if (aClass625_8277.anIntArray8151[0] > -1)
					class168 = method7614(aClass625_8277.anIntArray8151[0], -1682044579);
				if (aClass625_8277.anIntArray8151[1] > -1)
					class168_33_ = method7614(aClass625_8277.anIntArray8151[1], -1963214924);
				if (aClass625_8277.anIntArray8151[2] > -1)
					class168_34_ = method7614(aClass625_8277.anIntArray8151[2], -1814842304);
				aClass167_8272.method2187(class168, aClass625_8277.aFloatArray8152[0], class168_33_, aClass625_8277.aFloatArray8152[1], class168_34_, aClass625_8277.aFloatArray8152[2]);
			}
		}
	}

	void method7600() {
		if (633152037 * anInt8273 >= 0) {
			long l = Class249.method3450(1749911575);
			anInt8273 -= (l - 168657240566382171L * aLong8274) * 408431021L;
			if (633152037 * anInt8273 > 0)
				aClass625_8277.method7433(aClass167_8272, aClass625_8278, aClass625_8279, ((float) (anInt8285 * 312180195 - 633152037 * anInt8273) / (float) (312180195 * anInt8285)), 1872662298);
			else {
				aClass625_8277.method7447(aClass625_8279, (byte) -101);
				if (null != aClass625_8277.aClass507_8145)
					aClass625_8277.aClass507_8145.method6166((byte) 38);
				anInt8273 = -408431021;
			}
			aLong8274 = 7792391637566570963L * l;
		}
	}

	public void method7601() {
		int i = 0;
		int i_35_ = i + (aClass625_8277.anInt8143 * -679981209 + 256 << 2);
		aClass167_8272.method2107(-677219717 * aClass625_8277.anInt8140, (ClientSetting.aClass536_Sub40_8843.fogSetting.method10081(1436659191) == 1 ? i_35_ : -1), 0);
	}

	void method7602() {
		aBool8290 = false;
		aFloat8291 = 1.0F;
		aFloat8294 = 0.0F;
		aFloat8276 = 1.0F;
		aFloat8282 = 0.0F;
		aFloat8295 = 1.0F;
	}

	public void method7603() {
		int i = 0;
		int i_36_ = i + (aClass625_8277.anInt8143 * -679981209 + 256 << 2);
		aClass167_8272.method2107(-677219717 * aClass625_8277.anInt8140, (ClientSetting.aClass536_Sub40_8843.fogSetting.method10081(1436659191) == 1 ? i_36_ : -1), 0);
	}

	public void method7604() {
		int i = 0;
		int i_37_ = i + (aClass625_8277.anInt8143 * -679981209 + 256 << 2);
		aClass167_8272.method2107(-677219717 * aClass625_8277.anInt8140, (ClientSetting.aClass536_Sub40_8843.fogSetting.method10081(1436659191) == 1 ? i_37_ : -1), 0);
	}

	void method7605() {
		if (aClass167_8272.method2281()) {
			Class168 class168 = null;
			Class168 class168_38_ = null;
			Class168 class168_39_ = null;
			if (aBool8287) {
				if (anIntArray8288[0] > -1)
					class168 = method7614(anIntArray8288[0], -2016744575);
				if (anIntArray8288[1] > -1)
					class168_38_ = method7614(anIntArray8288[1], -1683224211);
				if (anIntArray8288[2] > -1)
					class168_39_ = method7614(anIntArray8288[2], -2079492624);
				aClass167_8272.method2187(class168, aFloatArray8269[0], class168_38_, aFloatArray8269[1], class168_39_, aFloatArray8269[2]);
			} else {
				if (aClass625_8277.anIntArray8151[0] > -1)
					class168 = method7614(aClass625_8277.anIntArray8151[0], -1959445329);
				if (aClass625_8277.anIntArray8151[1] > -1)
					class168_38_ = method7614(aClass625_8277.anIntArray8151[1], -1984544371);
				if (aClass625_8277.anIntArray8151[2] > -1)
					class168_39_ = method7614(aClass625_8277.anIntArray8151[2], -2048994704);
				aClass167_8272.method2187(class168, aClass625_8277.aFloatArray8152[0], class168_38_, aClass625_8277.aFloatArray8152[1], class168_39_, aClass625_8277.aFloatArray8152[2]);
			}
		}
	}

	public void method7606() {
		int i = 0;
		int i_40_ = i + (aClass625_8277.anInt8143 * -679981209 + 256 << 2);
		aClass167_8272.method2107(-677219717 * aClass625_8277.anInt8140, (ClientSetting.aClass536_Sub40_8843.fogSetting.method10081(1436659191) == 1 ? i_40_ : -1), 0);
	}

	public void method7607() {
		int i = 0;
		int i_41_ = i + (aClass625_8277.anInt8143 * -679981209 + 256 << 2);
		aClass167_8272.method2107(-677219717 * aClass625_8277.anInt8140, (ClientSetting.aClass536_Sub40_8843.fogSetting.method10081(1436659191) == 1 ? i_41_ : -1), 0);
	}

	public void method7608(Class515 class515, Class642 class642, int i, int i_42_) {
		aClass642_8281 = class642;
		Class625 class625 = method7578(class515, -719122001);
		if (null != aClass642_8281) {
			if (null == aClass625_8268)
				aClass625_8268 = new Class625();
			aClass625_8268.method7447(class625, (byte) 23);
			aClass625_8268.method7432(this, aClass642_8281, -1047211108);
			method7579(aClass625_8268, i, 2011744177);
		} else {
			method7579(class625, i, 2081714933);
			aClass625_8268 = null;
		}
	}

	void method7609() {
		aClass167_8272.method2125(aClass625_8277.aFloat8149, aClass625_8277.aFloat8142, aClass625_8277.aFloat8144, (byte) 112);
	}

	void method7610() {
		if (aClass167_8272.method2340()) {
			if (aBool8290)
				aClass167_8272.method2118(aFloat8291, aFloat8294, aFloat8276, aFloat8282, aFloat8295);
			else
				aClass167_8272.method2118(aClass625_8277.aFloat8146, aClass625_8277.aFloat8147, aClass625_8277.aFloat8148, aClass625_8277.aFloat8134, aClass625_8277.aFloat8136);
		}
	}

	void method7611() {
		aBool8290 = false;
		aFloat8291 = 1.0F;
		aFloat8294 = 0.0F;
		aFloat8276 = 1.0F;
		aFloat8282 = 0.0F;
		aFloat8295 = 1.0F;
	}

	Class507 method7612(int i, int i_43_, int i_44_, int i_45_, short i_46_) {
		long l = (((long) i_43_ & 0xffffL) << 48 | ((long) i_44_ & 0xffffL) << 32 | ((long) i_45_ & 0xffffL) << 16 | (long) i & 0xffffL);
		Class507 class507 = (Class507) aClass199_8284.method2886(l);
		if (null == class507) {
			class507 = Class205_Sub15.method9085(i, i_43_, i_44_, i_45_, Class459.aClass34_Sub9_5179, Class144.aClass34_Sub12_1680, 1960844520);
			aClass199_8284.method2881(class507, l);
		}
		return class507;
	}

	void method7613() {
		aBool8290 = false;
		aFloat8291 = 1.0F;
		aFloat8294 = 0.0F;
		aFloat8276 = 1.0F;
		aFloat8282 = 0.0F;
		aFloat8295 = 1.0F;
	}

	Class168 method7614(int i, int i_47_) {
		Class168 class168 = (Class168) aClass199_8292.method2886((long) i);
		if (class168 != null)
			return class168;
		Class179 class179 = Class181.method2717(aClass461_8280, i);
		if (null != class179 && class179.method2633() == 256 && class179.method2677() == 16) {
			int[] is = class179.method2643(false);
			class168 = aClass167_8272.method2119(is);
			if (null != class168)
				aClass199_8292.method2881(class168, (long) i);
		}
		return class168;
	}

	void method7615() {
		aBool8290 = false;
		aFloat8291 = 1.0F;
		aFloat8294 = 0.0F;
		aFloat8276 = 1.0F;
		aFloat8282 = 0.0F;
		aFloat8295 = 1.0F;
	}

	public void method7616(byte i) {
		aClass167_8272.method2006((0.7F + ((float) ClientSetting.aClass536_Sub40_8843.brightnessSetting.method10046(-1506046098) * 0.1F) + client.aClass515_11066.method6279(112481485)) * 1.1523438F);
		aClass167_8272.method2105(16777215, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
		aClass167_8272.method2107(13156520, -1, 0);
		aClass167_8272.method2113(RuntimeException_Sub4.aClass176_12094);
	}

	void method7617() {
		if (aClass167_8272.method2281()) {
			Class168 class168 = null;
			Class168 class168_48_ = null;
			Class168 class168_49_ = null;
			if (aBool8287) {
				if (anIntArray8288[0] > -1)
					class168 = method7614(anIntArray8288[0], -1949579909);
				if (anIntArray8288[1] > -1)
					class168_48_ = method7614(anIntArray8288[1], -1798437497);
				if (anIntArray8288[2] > -1)
					class168_49_ = method7614(anIntArray8288[2], -1774957194);
				aClass167_8272.method2187(class168, aFloatArray8269[0], class168_48_, aFloatArray8269[1], class168_49_, aFloatArray8269[2]);
			} else {
				if (aClass625_8277.anIntArray8151[0] > -1)
					class168 = method7614(aClass625_8277.anIntArray8151[0], -1745402402);
				if (aClass625_8277.anIntArray8151[1] > -1)
					class168_48_ = method7614(aClass625_8277.anIntArray8151[1], -1931538503);
				if (aClass625_8277.anIntArray8151[2] > -1)
					class168_49_ = method7614(aClass625_8277.anIntArray8151[2], -1683288614);
				aClass167_8272.method2187(class168, aClass625_8277.aFloatArray8152[0], class168_48_, aClass625_8277.aFloatArray8152[1], class168_49_, aClass625_8277.aFloatArray8152[2]);
			}
		}
	}

	void method7618() {
		aBool8287 = false;
		int[] is = anIntArray8288;
		int[] is_50_ = anIntArray8288;
		anIntArray8288[2] = -1;
		is_50_[1] = -1;
		is[0] = -1;
		float[] fs = aFloatArray8269;
		float[] fs_51_ = aFloatArray8269;
		aFloatArray8269[2] = 0.0F;
		fs_51_[1] = 0.0F;
		fs[0] = 0.0F;
	}

	public void method7619() {
		aClass167_8272.method2006((0.7F + ((float) ClientSetting.aClass536_Sub40_8843.brightnessSetting.method10046(-1506046098) * 0.1F) + client.aClass515_11066.method6279(1675590599)) * 1.1523438F);
		aClass167_8272.method2105(16777215, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
		aClass167_8272.method2107(13156520, -1, 0);
		aClass167_8272.method2113(RuntimeException_Sub4.aClass176_12094);
	}

	static final void method7620(Class668 class668, int i) {
		int i_52_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		if (-1484801557 * client.anInt11289 == 2 && i_52_ >= 0 && i_52_ < 142551095 * client.anInt11288)
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = client.aClass31Array11291[i_52_].anInt271 * 1914806461;
		else
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
	}

	static final void method7621(Class668 class668, int i) {
		Class514.method6238(class668, class668.aClass649_Sub1_Sub5_Sub1_8554, -820514656);
	}

	public static void method7622(int i) {
		if (Class653.aClass360_8489 != null) {
			Class653.aClass360_8489.method4735(1958948448);
			Class653.aClass360_8489 = null;
		}
	}

	static final void method7623(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
	}
}
