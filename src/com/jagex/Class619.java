/* Class619 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class619 {
	public Interface66 anInterface66_8092;
	public static int anInt8093;

	void method7392(RSByteBuffer class536_sub33) {
		for (;;) {
			int i = class536_sub33.readUnsignedByte();
			if (0 == i)
				break;
			if (i == 1)
				anInterface66_8092 = Class283.method3773(class536_sub33, -1912345235);
		}
	}

	void method7393(RSByteBuffer class536_sub33, byte i) {
		for (;;) {
			int i_0_ = class536_sub33.readUnsignedByte();
			if (0 == i_0_)
				break;
			if (i_0_ == 1)
				anInterface66_8092 = Class283.method3773(class536_sub33, -1912345235);
		}
	}

	public Class619(Class461 class461) {
		byte[] is = class461.method5595((Class633.aClass633_8255.anInt8258 * -848473139), -1792324926);
		if (null != is)
			method7393(new RSByteBuffer(is), (byte) 105);
	}

	static final void method7394(Class668 class668, byte i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		IComponentDefinitions class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class613.method7317(class251, class234, class668, (byte) 0);
	}

	public static Class611[] method7395(int i) {
		return (new Class611[] { Class611.aClass611_7926, Class611.aClass611_7928, Class611.aClass611_7924, Class611.aClass611_7925, Class611.aClass611_7923, Class611.aClass611_7927 });
	}

	static void method7396(int i) {
		if (19 == client.anInt11101 * -708374433)
			Class141.method1712((short) 311);
		client.aClass106_11218.method1418(-643016735);
		Class635.method7561((byte) -38);
		Class67_Sub1.aBool10601 = true;
		Class190.method2828((byte) -7);
		for (int i_1_ = 0; i_1_ < client.aClass103Array11020.length; i_1_++)
			client.aClass103Array11020[i_1_] = null;
		client.aBool11188 = false;
		client.anInt10983 = ((int) (Math.random() * 100.0) - 50) * -1313296165;
		client.anInt11091 = ((int) (Math.random() * 110.0) - 55) * 738898683;
		client.anInt11093 = ((int) (Math.random() * 80.0) - 40) * -221669345;
		client.anInt11096 = ((int) (Math.random() * 120.0) - 60) * -996826705;
		client.anInt11098 = ((int) (Math.random() * 30.0) - 20) * 597230115;
		client.aFloat11106 = (float) ((int) (Math.random() * 160.0) - 80 & 0x3fff);
		Class9.method607((byte) -33);
		for (int i_2_ = 0; i_2_ < 2048; i_2_++)
			client.aClass649_Sub1_Sub5_Sub1_Sub2Array11155[i_2_] = null;
		Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591 = null;
		client.anInt11053 = 0;
		client.anInt11164 = 0;
		client.aClass4_11050.method561(-2117553523);
		client.aClass708_11174.method8304(454036827);
		client.aClass4_11175.method561(-2117553523);
		client.aClass695_11176.method8211(-847206498);
		client.aClass4_11170.method561(-2117553523);
		Class536_Sub2.aClass708_10320 = new Class708();
		Class536_Sub2.aClass708_10321 = new Class708();
		Class440.anInt4874 = 0;
		Class606.anInt7898 = 0;
		Class653.anInt8491 = 0;
		Class584_Sub1.anInt10560 = 0;
		Class234.anInt2381 = 0;
		Class438.anInt4868 = 0;
		Class550.anInt7412 = 0;
		Class184_Sub6.anInt9934 = 0;
		Class593.anInt7811 = 0;
		Class460_Sub1.anInt10291 = 0;
		if (-1959825479 * client.anInt11187 != -1)
			Class444.method5395(-1959825479 * client.anInt11187, -687424059);
		for (Class536_Sub36 class536_sub36 = ((Class536_Sub36) client.aClass4_11008.method562(-2040731547)); class536_sub36 != null; class536_sub36 = ((Class536_Sub36) client.aClass4_11008.method567(792014930))) {
			if (!class536_sub36.method6487((byte) -36)) {
				class536_sub36 = ((Class536_Sub36) client.aClass4_11008.method562(-2055476356));
				if (null == class536_sub36)
					break;
			}
			Class398.method4903(class536_sub36, true, false, 1759806773);
		}
		client.anInt11187 = -2074470025;
		client.aClass4_11008 = new Class4(8);
		Class302.method4101(-2141543117);
		client.aClass251_11057 = null;
		for (int i_3_ = 0; i_3_ < 8; i_3_++) {
			client.aStringArray11100[i_3_] = null;
			client.aBoolArray11171[i_3_] = false;
			client.anIntArray11169[i_3_] = -1;
		}
		Class411.method5004((byte) -128);
		client.aBool11012 = true;
		for (int i_4_ = 0; i_4_ < 106; i_4_++)
			client.aBoolArray11240[i_4_] = true;
		for (int i_5_ = 0; i_5_ < 3; i_5_++) {
			for (int i_6_ = 0; i_6_ < 8; i_6_++)
				client.aClass485ArrayArray11266[i_5_][i_6_] = new Class485();
		}
		client.aClass515_11066.method6252(1796531619).method7581((byte) 8);
		client.aBool11242 = true;
		Class612.aShortArray7932 = Class296.aShortArray3267 = ItemDefinitions.aShortArray14 = new short[256];
		Class689.aString8692 = Class38.aClass38_310.method840(Class459.aClass664_5178, 1525670882);
		ClientSetting.aClass536_Sub40_8843.method9857((ClientSetting.aClass536_Sub40_8843.removeRoofSetting), ClientSetting.aClass536_Sub40_8843.defaultRemoveRoofSetting.method9916(), (byte) 1);
		client.anInt11063 = 0;
		Class106.method1429(1164566709);
		Class398.aClass654_4123 = null;
		Class567.aLong7600 = 0L;
	}

	static void method7397(int i, int i_7_, byte i_8_) {
		Class536_Sub18_Sub5 class536_sub18_sub5 = Class34_Sub11.method10334(1, (long) i);
		class536_sub18_sub5.method10659(2056805060);
		class536_sub18_sub5.anInt11675 = 1577826219 * i_7_;
	}
}
