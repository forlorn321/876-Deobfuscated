/* Class630 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class630 {
	public int[][] anIntArrayArray8218 = new int[3][5];
	static final int anInt8219 = 3;
	public static final int anInt8220 = 2;
	public static final int anInt8221 = 3;
	public static final int anInt8222 = 0;
	public int anInt8223;
	public static final int anInt8224 = 2;
	public static final int anInt8225 = 3;
	public static final int anInt8226 = 1;
	public static final int anInt8227 = 5;
	public int anInt8228;
	static final int anInt8229 = 100;
	public int anInt8230;
	public int anInt8231;
	public int anInt8232;
	public static final int anInt8233 = 4;
	public static final int anInt8234 = 1;
	public int anInt8235;
	public int anInt8236;
	public static final int anInt8237 = 0;

	void method10423(RSByteBuffer class527_sub38) {
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			if (i == 0)
				break;
			if (i == 1)
				anInt8230 = class527_sub38.readInt() * 1140167671;
			else if (i == 2)
				anInt8223 = class527_sub38.readInt() * -242148217;
			else if (3 == i)
				anInt8232 = class527_sub38.readInt() * 1925477443;
			else if (i == 4)
				anInt8235 = class527_sub38.readUnsignedByte() * 2104822529;
			else if (i == 5)
				anInt8231 = class527_sub38.readUnsignedByte() * -1857832197;
			else if (i == 6)
				anInt8228 = class527_sub38.readInt() * -2009265517;
			else if (7 == i)
				anInt8236 = class527_sub38.readInt() * 32668371;
			else if (i >= 100) {
				i -= 100;
				anIntArrayArray8218[i & (int) (Math.pow(2.0, 3.0) - 1.0)][i >> 3] = class527_sub38.readUnsignedShort();
			}
		}
	}

	void method10424(RSByteBuffer class527_sub38, int i) {
		for (;;) {
			int i_0_ = class527_sub38.readUnsignedByte();
			if (i_0_ == 0)
				break;
			if (i_0_ == 1)
				anInt8230 = class527_sub38.readInt() * 1140167671;
			else if (i_0_ == 2)
				anInt8223 = class527_sub38.readInt() * -242148217;
			else if (3 == i_0_)
				anInt8232 = class527_sub38.readInt() * 1925477443;
			else if (i_0_ == 4)
				anInt8235 = class527_sub38.readUnsignedByte() * 2104822529;
			else if (i_0_ == 5)
				anInt8231 = class527_sub38.readUnsignedByte() * -1857832197;
			else if (i_0_ == 6)
				anInt8228 = class527_sub38.readInt() * -2009265517;
			else if (7 == i_0_)
				anInt8236 = class527_sub38.readInt() * 32668371;
			else if (i_0_ >= 100) {
				i_0_ -= 100;
				anIntArrayArray8218[i_0_ & (int) (Math.pow(2.0, 3.0) - 1.0)][i_0_ >> 3] = class527_sub38.readUnsignedShort();
			}
		}
	}

	void method10425(RSByteBuffer class527_sub38) {
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			if (i == 0)
				break;
			if (i == 1)
				anInt8230 = class527_sub38.readInt() * 1140167671;
			else if (i == 2)
				anInt8223 = class527_sub38.readInt() * -242148217;
			else if (3 == i)
				anInt8232 = class527_sub38.readInt() * 1925477443;
			else if (i == 4)
				anInt8235 = class527_sub38.readUnsignedByte() * 2104822529;
			else if (i == 5)
				anInt8231 = class527_sub38.readUnsignedByte() * -1857832197;
			else if (i == 6)
				anInt8228 = class527_sub38.readInt() * -2009265517;
			else if (7 == i)
				anInt8236 = class527_sub38.readInt() * 32668371;
			else if (i >= 100) {
				i -= 100;
				anIntArrayArray8218[i & (int) (Math.pow(2.0, 3.0) - 1.0)][i >> 3] = class527_sub38.readUnsignedShort();
			}
		}
	}

	public Class630(Class459 class459) {
		byte[] is = class459.method7512((Class632.aClass632_8266.anInt8258 * 1088756673), 1447980132);
		if (null != is) {
			/* empty */
		}
		method10424(new RSByteBuffer(is), -2105023147);
	}

	void method10426(RSByteBuffer class527_sub38) {
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			if (i == 0)
				break;
			if (i == 1)
				anInt8230 = class527_sub38.readInt() * 1140167671;
			else if (i == 2)
				anInt8223 = class527_sub38.readInt() * -242148217;
			else if (3 == i)
				anInt8232 = class527_sub38.readInt() * 1925477443;
			else if (i == 4)
				anInt8235 = class527_sub38.readUnsignedByte() * 2104822529;
			else if (i == 5)
				anInt8231 = class527_sub38.readUnsignedByte() * -1857832197;
			else if (i == 6)
				anInt8228 = class527_sub38.readInt() * -2009265517;
			else if (7 == i)
				anInt8236 = class527_sub38.readInt() * 32668371;
			else if (i >= 100) {
				i -= 100;
				anIntArrayArray8218[i & (int) (Math.pow(2.0, 3.0) - 1.0)][i >> 3] = class527_sub38.readUnsignedShort();
			}
		}
	}

	static final void method10427(Class665 class665, byte i) {
		class665.anInt8526 -= 204761682;
		boolean bool = 1 == class665.anIntArray8525[1769813785 * class665.anInt8526];
		int i_1_ = class665.anIntArray8525[1769813785 * class665.anInt8526 + 1];
		Class243 class243 = Class648.method10837(i_1_, -1500425787);
		Class240 class240 = Class183.aClass240Array2100[i_1_ >> 16];
		Class296.method5503(class243, class240, class665, (bool ? Class237.aClass237_2385 : Class237.aClass237_2382), (byte) 1);
	}

	static final void method10428(Class665 class665, int i) {
		int i_2_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_2_, 175611336);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = class243.anInt2549 * -1521042319;
	}

	static final void method10429(Class665 class665, int i) {
		class665.anInt8526 -= 204761682;
		int i_3_ = class665.anIntArray8525[1769813785 * class665.anInt8526];
		int i_4_ = class665.anIntArray8525[class665.anInt8526 * 1769813785 + 1];
		Class80 class80 = (Class80) Class679.aClass24_Sub21_8628.method81(i_4_, 628493651);
		if (class80.method1566(-338438551))
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = ((Class527_Sub8_Sub2) Class231.aClass62_Sub2_2358.method81(i_3_, -360941532)).method17897(i_4_, class80.aString806, 395564921);
		else
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = (((Class527_Sub8_Sub2) Class231.aClass62_Sub2_2358.method81(i_3_, -2001003343)).method17893(i_4_, class80.anInt804 * 780718929, (byte) 1));
	}

	static final void method10430(Class665 class665, byte i) {
		class665.anInt8526 -= 204761682;
		int i_5_ = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		int i_6_ = class665.anIntArray8525[1769813785 * class665.anInt8526 + 1];
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class254.method4703(i_5_, i_6_, true, false, -929955586);
	}

	static void method10431(int i, int i_7_) {
		Class526.anInt7104 = i * -1317786481;
		synchronized (Class55.aClass205_709) {
			Class55.aClass205_709.method3793((byte) 56);
		}
	}
}
