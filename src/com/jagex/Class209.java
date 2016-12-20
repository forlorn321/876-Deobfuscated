/* Class209 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class209 {
	public static Class14 aClass14_2236;
	static int anInt2237;
	static boolean aBool2238;
	static int anInt2239;
	static int anInt2240;
	static int anInt2241;
	static Class191[] aClass191Array2242;
	public static Class694 aClass694_2243 = new Class694();
	static int anInt2244;
	public static Interface18 anInterface18_2245;
	static int anInt2246;

	public static void method3860(boolean bool) {
		if (2 != -1481292237 * client.anInt11080 && 3 != -1481292237 * client.anInt11080) {
			if (!bool) {
				if (null != Class181.aClass208Array2093) {
					Class208[] class208s = Class181.aClass208Array2093;
					for (int i = 0; i < class208s.length; i++) {
						Class208 class208 = class208s[i];
						class208.method3850((byte) 91);
					}
				}
				if (-1939121951 * anInt2237 != -1)
					Class245.aClass226_2698.method4273(-1939121951 * anInt2237, 255, (byte) 8);
			}
			client.anInt11080 = 1879984630;
			Class213.aClass527_Sub38_2261 = null;
			client.aBool11081 = false;
			if (anInt2244 * 554639759 > 0)
				Class546.method9060(Class579.aClass579_7650, anInt2244 * 554639759, -1, (byte) -40);
			Class263.method4963(-1561071134);
			Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4403, client.aClass109_11067.aClass2_1367, (byte) -27);
			class527_sub15.buffer.writeByte(bool ? 1 : 0, 1568184364);
			client.aClass109_11067.method1969(class527_sub15, (byte) 1);
		}
	}

	static {
		aClass14_2236 = new Class14(32);
		anInt2239 = 1072441851;
		anInt2240 = 0;
		anInt2241 = 0;
		aBool2238 = false;
		anInt2237 = 1091310815;
		anInt2244 = 1844912785;
		anInterface18_2245 = new Class188();
	}

	Class209() throws Throwable {
		throw new Error();
	}

	public static boolean method3861(int i) {
		if (554639759 * anInt2244 != i || null == Class235.aClass192_2378) {
			Class263.method4963(1966165564);
			Class235.aClass192_2378 = Class192.aClass192_2140;
			anInt2244 = i * -1844912785;
		}
		if (Class235.aClass192_2378 == Class192.aClass192_2140) {
			byte[] is = Class186.aClass459_2118.method7512(i, 1447980132);
			if (is == null)
				return false;
			RSByteBuffer class527_sub38 = new RSByteBuffer(is);
			Class178.method3064(class527_sub38, (byte) 2);
			int i_0_ = class527_sub38.readUnsignedByte();
			for (int i_1_ = 0; i_1_ < i_0_; i_1_++)
				aClass694_2243.method14147(new Class527_Sub5(class527_sub38), -643754964);
			int i_2_ = class527_sub38.readUnsignedSmart((byte) -37);
			aClass191Array2242 = new Class191[i_2_];
			for (int i_3_ = 0; i_3_ < i_2_; i_3_++)
				aClass191Array2242[i_3_] = new Class191(class527_sub38);
			int i_4_ = class527_sub38.readUnsignedSmart((byte) -35);
			Class466.aClass196Array5314 = new Class196[i_4_];
			for (int i_5_ = 0; i_5_ < i_4_; i_5_++)
				Class466.aClass196Array5314[i_5_] = new Class196(class527_sub38, i_5_);
			int i_6_ = class527_sub38.readUnsignedSmart((byte) -84);
			Class689.aClass186Array8689 = new Class186[i_6_];
			for (int i_7_ = 0; i_7_ < i_6_; i_7_++)
				Class689.aClass186Array8689[i_7_] = new Class186(class527_sub38);
			int i_8_ = class527_sub38.readUnsignedSmart((byte) -42);
			Class232.aClass195Array2359 = new Class195[i_8_];
			for (int i_9_ = 0; i_9_ < i_8_; i_9_++)
				Class232.aClass195Array2359[i_9_] = new Class195(class527_sub38);
			int i_10_ = class527_sub38.readUnsignedSmart((byte) -113);
			Class181.aClass208Array2093 = new Class208[i_10_];
			for (int i_11_ = 0; i_11_ < i_10_; i_11_++)
				Class181.aClass208Array2093[i_11_] = Class237.method4367(class527_sub38, (short) 255);
			Class235.aClass192_2378 = Class192.aClass192_2141;
		}
		if (Class192.aClass192_2141 == Class235.aClass192_2378) {
			boolean bool = true;
			Class196[] class196s = Class466.aClass196Array5314;
			for (int i_12_ = 0; i_12_ < class196s.length; i_12_++) {
				Class196 class196 = class196s[i_12_];
				if (!class196.method3722(1840760718))
					bool = false;
			}
			Class208[] class208s = Class181.aClass208Array2093;
			for (int i_13_ = 0; i_13_ < class208s.length; i_13_++) {
				Class208 class208 = class208s[i_13_];
				if (!class208.method3847((byte) 76))
					bool = false;
			}
			Class186[] class186s = Class689.aClass186Array8689;
			for (int i_14_ = 0; i_14_ < class186s.length; i_14_++) {
				Class186 class186 = class186s[i_14_];
				if (!class186.method3641(144664520))
					bool = false;
			}
			if (!bool)
				return false;
			Class235.aClass192_2378 = Class192.aClass192_2139;
		}
		return true;
	}

	public static boolean method3862(int i) {
		if (554639759 * anInt2244 != i || null == Class235.aClass192_2378) {
			Class263.method4963(1355831141);
			Class235.aClass192_2378 = Class192.aClass192_2140;
			anInt2244 = i * -1844912785;
		}
		if (Class235.aClass192_2378 == Class192.aClass192_2140) {
			byte[] is = Class186.aClass459_2118.method7512(i, 1447980132);
			if (is == null)
				return false;
			RSByteBuffer class527_sub38 = new RSByteBuffer(is);
			Class178.method3064(class527_sub38, (byte) 70);
			int i_15_ = class527_sub38.readUnsignedByte();
			for (int i_16_ = 0; i_16_ < i_15_; i_16_++)
				aClass694_2243.method14147(new Class527_Sub5(class527_sub38), -98757195);
			int i_17_ = class527_sub38.readUnsignedSmart((byte) -35);
			aClass191Array2242 = new Class191[i_17_];
			for (int i_18_ = 0; i_18_ < i_17_; i_18_++)
				aClass191Array2242[i_18_] = new Class191(class527_sub38);
			int i_19_ = class527_sub38.readUnsignedSmart((byte) -38);
			Class466.aClass196Array5314 = new Class196[i_19_];
			for (int i_20_ = 0; i_20_ < i_19_; i_20_++)
				Class466.aClass196Array5314[i_20_] = new Class196(class527_sub38, i_20_);
			int i_21_ = class527_sub38.readUnsignedSmart((byte) -63);
			Class689.aClass186Array8689 = new Class186[i_21_];
			for (int i_22_ = 0; i_22_ < i_21_; i_22_++)
				Class689.aClass186Array8689[i_22_] = new Class186(class527_sub38);
			int i_23_ = class527_sub38.readUnsignedSmart((byte) -41);
			Class232.aClass195Array2359 = new Class195[i_23_];
			for (int i_24_ = 0; i_24_ < i_23_; i_24_++)
				Class232.aClass195Array2359[i_24_] = new Class195(class527_sub38);
			int i_25_ = class527_sub38.readUnsignedSmart((byte) -120);
			Class181.aClass208Array2093 = new Class208[i_25_];
			for (int i_26_ = 0; i_26_ < i_25_; i_26_++)
				Class181.aClass208Array2093[i_26_] = Class237.method4367(class527_sub38, (short) 255);
			Class235.aClass192_2378 = Class192.aClass192_2141;
		}
		if (Class192.aClass192_2141 == Class235.aClass192_2378) {
			boolean bool = true;
			Class196[] class196s = Class466.aClass196Array5314;
			for (int i_27_ = 0; i_27_ < class196s.length; i_27_++) {
				Class196 class196 = class196s[i_27_];
				if (!class196.method3722(1840760718))
					bool = false;
			}
			Class208[] class208s = Class181.aClass208Array2093;
			for (int i_28_ = 0; i_28_ < class208s.length; i_28_++) {
				Class208 class208 = class208s[i_28_];
				if (!class208.method3847((byte) 43))
					bool = false;
			}
			Class186[] class186s = Class689.aClass186Array8689;
			for (int i_29_ = 0; i_29_ < class186s.length; i_29_++) {
				Class186 class186 = class186s[i_29_];
				if (!class186.method3641(-1495227100))
					bool = false;
			}
			if (!bool)
				return false;
			Class235.aClass192_2378 = Class192.aClass192_2139;
		}
		return true;
	}

	public static void method3863() {
		aClass14_2236.method721(-1733252452);
		aClass694_2243.method14105((byte) 47);
		aClass191Array2242 = null;
		Class466.aClass196Array5314 = null;
		Class689.aClass186Array8689 = null;
		Class232.aClass195Array2359 = null;
		Class181.aClass208Array2093 = null;
		anInt2239 = 1072441851;
		anInt2240 = 0;
		anInt2241 = 0;
		Class235.aClass192_2378 = null;
		anInt2244 = 1844912785;
		anInt2237 = 1091310815;
		if (aBool2238) {
			client.aShort11287 = Class646_Sub1.aShort10841;
			client.aShort11211 = Class316_Sub1.aShort10037;
			client.aShort11285 = Class682.aShort8649;
			client.aShort11043 = Class236.aShort2379;
			aBool2238 = false;
		}
	}

	public static void method3864() {
		aClass14_2236.method721(349179621);
		aClass694_2243.method14105((byte) 27);
		aClass191Array2242 = null;
		Class466.aClass196Array5314 = null;
		Class689.aClass186Array8689 = null;
		Class232.aClass195Array2359 = null;
		Class181.aClass208Array2093 = null;
		anInt2239 = 1072441851;
		anInt2240 = 0;
		anInt2241 = 0;
		Class235.aClass192_2378 = null;
		anInt2244 = 1844912785;
		anInt2237 = 1091310815;
		if (aBool2238) {
			client.aShort11287 = Class646_Sub1.aShort10841;
			client.aShort11211 = Class316_Sub1.aShort10037;
			client.aShort11285 = Class682.aShort8649;
			client.aShort11043 = Class236.aShort2379;
			aBool2238 = false;
		}
	}

	public static void method3865() {
		Class646_Sub1.aShort10841 = client.aShort11287;
		Class316_Sub1.aShort10037 = client.aShort11211;
		Class682.aShort8649 = client.aShort11285;
		Class236.aShort2379 = client.aShort11043;
		aBool2238 = true;
		anInt2237 = Class245.aClass226_2698.method4220(321294525) * -1091310815;
		if (0 != anInt2241 * -1541232839 && anInt2240 * -429332687 != 0) {
			client.aShort11285 = (short) 334;
			client.aShort11043 = (short) 334;
			client.aShort11211 = client.aShort11287 = (short) (anInt2241 * 1162768896 / (anInt2240 * -429332687));
		}
	}

	static void method3866(RSByteBuffer class527_sub38) {
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			switch (i) {
			case 0:
				anInt2240 = class527_sub38.readUnsignedShort() * -1898901039;
				anInt2241 = class527_sub38.readUnsignedShort() * 2043811593;
				break;
			case 255:
				return;
			}
		}
	}

	public static void method3867(boolean bool) {
		if (2 != -1481292237 * client.anInt11080 && 3 != -1481292237 * client.anInt11080) {
			if (!bool) {
				if (null != Class181.aClass208Array2093) {
					Class208[] class208s = Class181.aClass208Array2093;
					for (int i = 0; i < class208s.length; i++) {
						Class208 class208 = class208s[i];
						class208.method3850((byte) 32);
					}
				}
				if (-1939121951 * anInt2237 != -1)
					Class245.aClass226_2698.method4273(-1939121951 * anInt2237, 255, (byte) 8);
			}
			client.anInt11080 = 1879984630;
			Class213.aClass527_Sub38_2261 = null;
			client.aBool11081 = false;
			if (anInt2244 * 554639759 > 0)
				Class546.method9060(Class579.aClass579_7650, anInt2244 * 554639759, -1, (byte) -53);
			Class263.method4963(-120732611);
			Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4403, client.aClass109_11067.aClass2_1367, (byte) 81);
			class527_sub15.buffer.writeByte(bool ? 1 : 0, 1493239426);
			client.aClass109_11067.method1969(class527_sub15, (byte) 1);
		}
	}

	public static Class590[] method3868(int i) {
		return (new Class590[] { Class590.aClass590_7790, Class590.aClass590_7791, Class590.aClass590_7789 });
	}

	public static void method3869(Class240 class240, Class243 class243, int i) {
		Class243 class243_30_ = Class519.method8657(class240, class243, 440158663);
		int i_31_;
		int i_32_;
		if (null == class243_30_) {
			i_31_ = -1803844265 * Class289.anInt3223;
			i_32_ = Class611.anInt8009 * -471480167;
		} else {
			i_31_ = class243_30_.anInt2511 * -1054537975;
			i_32_ = -1386504031 * class243_30_.anInt2514;
		}
		Class68.method1476(class243, i_31_, i_32_, false, 964737479);
		Class208_Sub12.method15621(class243, i_31_, i_32_, -1391605013);
	}
}
