/* Class472 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class472 implements Interface76 {
	int anInt5363;
	static Class472 aClass472_5364;
	static Class472 aClass472_5365;
	static Class472 aClass472_5366;
	String aString5367;
	static Class472 aClass472_5368 = new Class472("UNCOMPRESSED", 0);

	static Class472[] method7732() {
		return new Class472[] { aClass472_5365, aClass472_5368, aClass472_5364, aClass472_5366 };
	}

	Class472(String string, int i) {
		aString5367 = string;
		anInt5363 = 2072304715 * i;
	}

	public int method87() {
		return anInt5363 * -1041429149;
	}

	static {
		aClass472_5364 = new Class472("BZIP2", 1);
		aClass472_5365 = new Class472("GZIP", 2);
		aClass472_5366 = new Class472("LZMA", 3);
	}

	public int method42() {
		return anInt5363 * -1041429149;
	}

	public int method91() {
		return anInt5363 * -1041429149;
	}

	static Class472[] method7733(byte i) {
		return new Class472[] { aClass472_5365, aClass472_5368, aClass472_5364, aClass472_5366 };
	}

	static Class472[] method7734() {
		return new Class472[] { aClass472_5365, aClass472_5368, aClass472_5364, aClass472_5366 };
	}

	static void method7735(Interface67 interface67, byte i) {
		while (Class570.aLinkedList7619.size() > 10)
			Class570.aLinkedList7619.remove();
		Class570.aLinkedList7619.add(interface67);
	}

	static final void method7736(Class665 class665, int i) {
		class665.anInt8526 -= 204761682;
		int i_0_ = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		int i_1_ = class665.anIntArray8525[class665.anInt8526 * 1769813785 + 1];
		int i_2_ = client.aClass492ArrayArray11272[i_1_][i_0_].method7985(1769813785);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = i_2_ == 5 ? 1 : 0;
	}

	static final void method7737(Class665 class665, int i) {
		CharSequence charsequence = (CharSequence) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = Class166.method2669(charsequence, (byte) -83);
	}

	static void method7738(byte i) {
		Class327_Sub1 class327_sub1 = (Class327_Sub1) Class66.aClass296_Sub1_760.method5372((byte) 0);
		Class696_Sub2 class696_sub2 = ((Class696_Sub2) Class66.aClass296_Sub1_760.method5472(1070801860));
		Class442 class442 = class327_sub1.method5781(253069680);
		Class438 class438 = class696_sub2.method17163(-1548379704);
		if (client.aClass243_11201 != null) {
			int i_3_ = -1054537975 * client.aClass243_11201.anInt2511;
			int i_4_ = client.aClass243_11201.anInt2514 * -1386504031;
			float f = 1000.0F;
			float f_5_ = (float) (2.0 * Math.atan((double) ((float) i_3_ / 2.0F / f)));
			float f_6_ = (float) (2.0 * Math.atan((double) ((float) i_4_ / 2.0F / f)));
			try {
				Class66.aClass296_Sub1_760.method5431(f_5_, f_6_, -2005764625);
			} catch (Exception_Sub6 exception_sub6) {
				/* empty */
			}
		}
		if (Class534.aClass553_7213.method9155(-2083456449)) {
			Class438 class438_7_ = Class438.method7020();
			class438_7_.method7040(1.0F, 0.0F, 0.0F, ((float) (Class534.aClass553_7213.method9159(1782115933) - Class66.anInt761 * -869602485) / 200.0F));
			class438.method7019(class438_7_);
			Class442 class442_8_ = Class442.method7166(0.0F, 1.0F, 0.0F);
			class442_8_.method7157(class438);
			Class438 class438_9_ = Class438.method7020();
			class438_9_.method7091(class442_8_, ((float) (-780821755 * Class66.anInt759 - Class534.aClass553_7213.method9158(-1412060454)) / 200.0F));
			class438.method7019(class438_9_);
			class696_sub2.method17150(class438, -1013948043);
		}
		Class66.anInt759 = Class534.aClass553_7213.method9158(-1412060454) * -389023283;
		Class66.anInt761 = Class534.aClass553_7213.method9159(1957148855) * -698235293;
		class438.method7033();
		if (Class681.aClass554_8644.method9199(98, 1897732154)) {
			Class442 class442_10_ = Class442.method7166(0.0F, 0.0F, 25.0F);
			class442_10_.method7157(class438);
			class442_10_.aFloat4915 *= -1.0F;
			class442.method7219(class442_10_);
		}
		if (Class681.aClass554_8644.method9199(99, 939305799)) {
			Class442 class442_11_ = Class442.method7166(0.0F, 0.0F, -25.0F);
			class442_11_.method7157(class438);
			class442_11_.aFloat4915 *= -1.0F;
			class442.method7219(class442_11_);
		}
		if (Class681.aClass554_8644.method9199(96, 1906713581)) {
			Class442 class442_12_ = Class442.method7166(-25.0F, 0.0F, 0.0F);
			class442_12_.method7157(class438);
			class442_12_.aFloat4915 *= -1.0F;
			class442.method7219(class442_12_);
		}
		if (Class681.aClass554_8644.method9199(97, 1212239956)) {
			Class442 class442_13_ = Class442.method7166(25.0F, 0.0F, 0.0F);
			class442_13_.method7157(class438);
			class442_13_.aFloat4915 *= -1.0F;
			class442.method7219(class442_13_);
		}
		Class527_Sub36 class527_sub36 = new Class527_Sub36(0, (int) class442.aFloat4918, (int) class442.aFloat4915, (int) class442.aFloat4919);
		class327_sub1.method15702(class527_sub36, 1960588973);
		Class592 class592 = client.aClass509_11072.method8283((short) 22707);
		int i_14_ = class592.anInt7798 * 153371143 << 9;
		int i_15_ = class592.anInt7799 * -2029646807 << 9;
		Class66.aClass296_Sub1_760.method5343(0.02F, (client.aClass509_11072.method8300((byte) 59).anIntArrayArrayArray4989), client.aClass509_11072.method8359(1113830453), i_14_, i_15_, (byte) 1);
	}

	static boolean method7739(int i) {
		return Class63.aClass28_737 != null;
	}
}
