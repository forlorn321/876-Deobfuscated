/* Class546 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class546 implements ConfigType {
	public int anInt7278;
	static final int anInt7279 = 70;
	public int anInt7280;
	public int anInt7281;
	public int anInt7282;
	public int anInt7283;
	public int anInt7284;
	public int anInt7285;
	public int anInt7286;
	public int anInt7287 = 1787398471;
	public int anInt7288;
	public int anInt7289;
	Class554 aClass554_7290;

	void method6612(Class167 class167, int i) {
		method6615(class167, anInt7285 * 948522675, -217659160);
		method6615(class167, anInt7286 * 1922671995, -217659160);
		method6615(class167, 1090904519 * anInt7280, -217659160);
		method6615(class167, -1794801113 * anInt7288, -217659160);
		method6615(class167, -1222862513 * anInt7289, -217659160);
		method6615(class167, anInt7282 * 1594042231, -217659160);
	}

	public void decodeType(RSByteBuffer class536_sub33) {
		for (;;) {
			int i_0_ = class536_sub33.readUnsignedByte();
			if (i_0_ == 0)
				break;
			method6613(class536_sub33, i_0_, -491726257);
		}
	}

	void method6613(RSByteBuffer class536_sub33, int i, int i_1_) {
		if (1 == i)
			class536_sub33.readUnsignedShort();
		else if (i == 2)
			anInt7287 = class536_sub33.readUnsignedByte() * 1000746937;
		else if (3 == i)
			anInt7278 = class536_sub33.readUnsignedByte() * -2053405977;
		else if (4 == i)
			anInt7281 = 0;
		else if (i == 5)
			anInt7284 = class536_sub33.readUnsignedShort() * 1289295945;
		else if (6 == i)
			class536_sub33.readUnsignedByte();
		else if (i == 7)
			anInt7285 = class536_sub33.readBigSmart() * 141824123;
		else if (i == 8)
			anInt7286 = class536_sub33.readBigSmart() * -407735885;
		else if (i == 9)
			anInt7280 = class536_sub33.readBigSmart() * 69439479;
		else if (10 == i)
			anInt7288 = class536_sub33.readBigSmart() * 983682455;
		else if (i == 11)
			anInt7281 = class536_sub33.readUnsignedShort() * 747781677;
		else if (i == 12)
			anInt7289 = class536_sub33.readBigSmart() * 1892081071;
		else if (13 == i)
			anInt7282 = class536_sub33.readBigSmart() * -784342457;
	}

	public Class143 method6614(Class167 class167, int i, int i_2_) {
		if (i < 0)
			return null;
		Class143 class143 = (Class143) aClass554_7290.aClass199_7483.method2886((long) i);
		if (class143 == null) {
			method6612(class167, 1404157345);
			class143 = ((Class143) aClass554_7290.aClass199_7483.method2886((long) i));
		}
		return class143;
	}

	Class546(int i, Class554 class554) {
		anInt7278 = 367485977;
		anInt7281 = -747781677;
		anInt7283 = 651704205;
		anInt7284 = 56402934;
		anInt7285 = -141824123;
		anInt7286 = 407735885;
		anInt7280 = -69439479;
		anInt7288 = -983682455;
		anInt7289 = -1892081071;
		anInt7282 = 784342457;
		aClass554_7290 = class554;
	}

	public void postDecode() {
		/* empty */
	}

	void method6615(Class167 class167, int i, int i_3_) {
		Class461 class461 = aClass554_7290.aClass461_7484;
		if (i >= 0 && aClass554_7290.aClass199_7483.method2886((long) i) == null && class461.method5580(i, -964514165)) {
			Class179 class179 = Class181.method2717(class461, i);
			aClass554_7290.aClass199_7483.method2881(class167.method2082(class179, true), (long) i);
		}
	}

	public void method77() {
		/* empty */
	}

	void method6616(RSByteBuffer class536_sub33, int i) {
		if (1 == i)
			class536_sub33.readUnsignedShort();
		else if (i == 2)
			anInt7287 = class536_sub33.readUnsignedByte() * 1000746937;
		else if (3 == i)
			anInt7278 = class536_sub33.readUnsignedByte() * -2053405977;
		else if (4 == i)
			anInt7281 = 0;
		else if (i == 5)
			anInt7284 = class536_sub33.readUnsignedShort() * 1289295945;
		else if (6 == i)
			class536_sub33.readUnsignedByte();
		else if (i == 7)
			anInt7285 = class536_sub33.readBigSmart() * 141824123;
		else if (i == 8)
			anInt7286 = class536_sub33.readBigSmart() * -407735885;
		else if (i == 9)
			anInt7280 = class536_sub33.readBigSmart() * 69439479;
		else if (10 == i)
			anInt7288 = class536_sub33.readBigSmart() * 983682455;
		else if (i == 11)
			anInt7281 = class536_sub33.readUnsignedShort() * 747781677;
		else if (i == 12)
			anInt7289 = class536_sub33.readBigSmart() * 1892081071;
		else if (13 == i)
			anInt7282 = class536_sub33.readBigSmart() * -784342457;
	}

	void method6617(Class167 class167, int i) {
		Class461 class461 = aClass554_7290.aClass461_7484;
		if (i >= 0 && aClass554_7290.aClass199_7483.method2886((long) i) == null && class461.method5580(i, -964514165)) {
			Class179 class179 = Class181.method2717(class461, i);
			aClass554_7290.aClass199_7483.method2881(class167.method2082(class179, true), (long) i);
		}
	}

	public Class143 method6618(Class167 class167, int i) {
		if (i < 0)
			return null;
		Class143 class143 = (Class143) aClass554_7290.aClass199_7483.method2886((long) i);
		if (class143 == null) {
			method6612(class167, -1109043934);
			class143 = ((Class143) aClass554_7290.aClass199_7483.method2886((long) i));
		}
		return class143;
	}

	public void method76(RSByteBuffer class536_sub33) {
		for (;;) {
			int i = class536_sub33.readUnsignedByte();
			if (i == 0)
				break;
			method6613(class536_sub33, i, -1015727939);
		}
	}

	void method6619(Class167 class167) {
		method6615(class167, anInt7285 * 948522675, -217659160);
		method6615(class167, anInt7286 * 1922671995, -217659160);
		method6615(class167, 1090904519 * anInt7280, -217659160);
		method6615(class167, -1794801113 * anInt7288, -217659160);
		method6615(class167, -1222862513 * anInt7289, -217659160);
		method6615(class167, anInt7282 * 1594042231, -217659160);
	}

	void method6620(Class167 class167, int i) {
		Class461 class461 = aClass554_7290.aClass461_7484;
		if (i >= 0 && aClass554_7290.aClass199_7483.method2886((long) i) == null && class461.method5580(i, -964514165)) {
			Class179 class179 = Class181.method2717(class461, i);
			aClass554_7290.aClass199_7483.method2881(class167.method2082(class179, true), (long) i);
		}
	}

	void method6621(Class167 class167) {
		method6615(class167, anInt7285 * 948522675, -217659160);
		method6615(class167, anInt7286 * 1922671995, -217659160);
		method6615(class167, 1090904519 * anInt7280, -217659160);
		method6615(class167, -1794801113 * anInt7288, -217659160);
		method6615(class167, -1222862513 * anInt7289, -217659160);
		method6615(class167, anInt7282 * 1594042231, -217659160);
	}

	static final void method6622(Class668 class668, int i) {
		class668.anInt8542 -= 1472892954;
		int i_4_ = class668.anIntArray8541[class668.anInt8542 * 1867269829];
		int i_5_ = class668.anIntArray8541[1867269829 * class668.anInt8542 + 1];
		Class73 class73 = ((Class73) Class207.aClass34_Sub22_2244.method70(i_5_, (byte) -13));
		if (class73.method1128((byte) 58))
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = ((Class536_Sub18_Sub2) Class529.aClass53_Sub1_7109.method70(i_4_, (byte) 21)).method10482(i_5_, class73.aString805, 1341811408);
		else
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = (((Class536_Sub18_Sub2) Class529.aClass53_Sub1_7109.method70(i_4_, (byte) -23)).method10484(i_5_, class73.anInt803 * 1566477951, (byte) 2));
	}

	static void method6623(Class668 class668, int i) {
		class668.anIntArray8541[class668.anInt8542 * 1867269829 - 2] = (((Class277) Class38.aClass53_Sub2_481.method70((class668.anIntArray8541[((1867269829 * class668.anInt8542) - 2)]), (byte) -50)).anIntArray3036[class668.anIntArray8541[1867269829 * class668.anInt8542 - 1]]);
		class668.anInt8542 -= -1411037171;
	}

	static float method6624(float f, float f_6_, float f_7_, float f_8_, float f_9_, float f_10_, int i, int i_11_) {
		float f_12_ = 0.0F;
		float f_13_ = f_8_ - f;
		float f_14_ = f_9_ - f_6_;
		float f_15_ = f_10_ - f_7_;
		float f_16_ = 0.0F;
		float f_17_ = 0.0F;
		float f_18_ = 0.0F;
		Class553 class553 = client.aClass515_11066.method6249(2011663200);
		for (/**/; f_12_ < 1.1F; f_12_ += 0.1F) {
			float f_19_ = f_12_ * f_13_ + f;
			float f_20_ = f_6_ + f_12_ * f_14_;
			float f_21_ = f_7_ + f_15_ * f_12_;
			int i_22_ = (int) f_19_ >> 9;
			int i_23_ = (int) f_21_ >> 9;
			if (i_22_ > 0 && i_23_ > 0 && i_22_ < client.aClass515_11066.method6321((byte) -51) && i_23_ < client.aClass515_11066.method6243(177401017)) {
				int i_24_ = Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.aByte10839;
				if (i_24_ < 3 && ((client.aClass515_11066.method6251(1164788132).aByteArrayArrayArray5154[1][i_22_][i_23_]) & 0x2) != 0)
					i_24_++;
				int i_25_ = class553.aClass160Array7459[i_24_].method1925((int) f_19_, (int) f_21_, (byte) 8);
				if ((float) i_25_ < f_20_) {
					if (i >= 2)
						return (f_12_ - 0.1F + (method6624(f_16_, f_17_, f_18_, f_19_, f_20_, f_21_, i - 1, -1772852827) * 0.1F));
					return f_12_;
				}
			}
			f_16_ = f_19_;
			f_17_ = f_20_;
			f_18_ = f_21_;
		}
		return -1.0F;
	}

	public static int method6625(int i) {
		return Class536_Sub42.aTwitchTV10811.GetViewerCount();
	}
}
