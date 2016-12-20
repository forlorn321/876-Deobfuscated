/* Class305 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;

public class Class305 implements Interface14, Interface7 {
	public int anInt3429;
	public int anInt3430;
	public int anInt3431;
	public int anInt3432;
	public int anInt3433;
	public boolean aBool3434;
	public int anInt3435;
	public int anInt3436 = 1863319704;
	public int anInt3437;
	public int anInt3438;
	public int anInt3439;

	public void method84() {
		/* empty */
	}

	public void method60(int i) {
		/* empty */
	}

	void method5588(RSByteBuffer class527_sub38, int i, byte i_0_) {
		if (1 == i)
			anInt3436 = class527_sub38.readUnsignedShort() * -840826861;
		else if (i == 2)
			aBool3434 = true;
		else if (3 == i) {
			anInt3431 = class527_sub38.readShort() * 1357400455;
			anInt3432 = class527_sub38.readShort() * 1464735087;
			anInt3430 = class527_sub38.readShort() * 1817491745;
		} else if (i == 4)
			anInt3433 = class527_sub38.readUnsignedByte() * 69762261;
		else if (5 == i)
			anInt3435 = class527_sub38.method16466(-1943546860) * -1749468779;
		else if (i == 6)
			anInt3429 = class527_sub38.read24BitUnsignedInteger(1694439205) * 527376401;
		else if (7 == i) {
			anInt3437 = class527_sub38.readShort() * -1728435771;
			anInt3438 = class527_sub38.readShort() * 1519288235;
			anInt3439 = class527_sub38.readShort() * 1645395347;
		}
	}

	public void method16(int i, int i_1_) {
		/* empty */
	}

	public void method86(int i) {
		/* empty */
	}

	public void method83(RSByteBuffer class527_sub38) {
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			if (0 == i)
				break;
			method5588(class527_sub38, i, (byte) -69);
		}
	}

	Class305() {
		anInt3429 = -242163729;
	}

	public void method85() {
		/* empty */
	}

	public void method73(RSByteBuffer class527_sub38) {
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			if (0 == i)
				break;
			method5588(class527_sub38, i, (byte) -38);
		}
	}

	public void method82(RSByteBuffer class527_sub38, int i) {
		for (;;) {
			int i_2_ = class527_sub38.readUnsignedByte();
			if (0 == i_2_)
				break;
			method5588(class527_sub38, i_2_, (byte) -51);
		}
	}

	void method5589(RSByteBuffer class527_sub38, int i) {
		if (1 == i)
			anInt3436 = class527_sub38.readUnsignedShort() * -840826861;
		else if (i == 2)
			aBool3434 = true;
		else if (3 == i) {
			anInt3431 = class527_sub38.readShort() * 1357400455;
			anInt3432 = class527_sub38.readShort() * 1464735087;
			anInt3430 = class527_sub38.readShort() * 1817491745;
		} else if (i == 4)
			anInt3433 = class527_sub38.readUnsignedByte() * 69762261;
		else if (5 == i)
			anInt3435 = class527_sub38.method16466(-1862600044) * -1749468779;
		else if (i == 6)
			anInt3429 = class527_sub38.read24BitUnsignedInteger(1765529447) * 527376401;
		else if (7 == i) {
			anInt3437 = class527_sub38.readShort() * -1728435771;
			anInt3438 = class527_sub38.readShort() * 1519288235;
			anInt3439 = class527_sub38.readShort() * 1645395347;
		}
	}

	void method5590(RSByteBuffer class527_sub38, int i) {
		if (1 == i)
			anInt3436 = class527_sub38.readUnsignedShort() * -840826861;
		else if (i == 2)
			aBool3434 = true;
		else if (3 == i) {
			anInt3431 = class527_sub38.readShort() * 1357400455;
			anInt3432 = class527_sub38.readShort() * 1464735087;
			anInt3430 = class527_sub38.readShort() * 1817491745;
		} else if (i == 4)
			anInt3433 = class527_sub38.readUnsignedByte() * 69762261;
		else if (5 == i)
			anInt3435 = class527_sub38.method16466(-2021828944) * -1749468779;
		else if (i == 6)
			anInt3429 = class527_sub38.read24BitUnsignedInteger(852631796) * 527376401;
		else if (7 == i) {
			anInt3437 = class527_sub38.readShort() * -1728435771;
			anInt3438 = class527_sub38.readShort() * 1519288235;
			anInt3439 = class527_sub38.readShort() * 1645395347;
		}
	}

	static final byte[] method5591(byte[] is, int i) {
		RSByteBuffer class527_sub38 = new RSByteBuffer(is);
		Class471 class471 = new Class471(class527_sub38);
		Class472 class472 = class471.method7719(170882388);
		int i_3_ = class471.method7720(1650704442);
		if (i_3_ < 0 || (0 != Class459.anInt5082 * 2035298957 && i_3_ > Class459.anInt5082 * 2035298957))
			throw new RuntimeException();
		if (Class472.aClass472_5368 == class472) {
			byte[] is_4_ = new byte[i_3_];
			class527_sub38.method16460(is_4_, 0, i_3_, -1956247007);
			return is_4_;
		}
		int i_5_ = class471.method7721(681714003);
		if (i_5_ < 0 || (0 != Class459.anInt5082 * 2035298957 && i_5_ > Class459.anInt5082 * 2035298957))
			throw new RuntimeException();
		byte[] is_6_;
		if (class472 == Class472.aClass472_5364) {
			is_6_ = new byte[i_5_];
			Class688.method13969(is_6_, i_5_, is, i_3_, 9);
		} else if (Class472.aClass472_5365 == class472) {
			is_6_ = new byte[i_5_];
			synchronized (Class459.aClass77_5074) {
				Class459.aClass77_5074.method1542(class527_sub38, is_6_, 1018337799);
			}
		} else if (class472 == Class472.aClass472_5366) {
			try {
				is_6_ = Class84.method1581(class527_sub38, i_5_, 1581758235);
			} catch (IOException ioexception) {
				throw new RuntimeException(ioexception);
			}
		} else
			throw new RuntimeException();
		return is_6_;
	}

	static void method5592(byte i) {
		Class585.aBool7696 = false;
		Class172.anIntArray1883 = null;
		Class398.anIntArray4124 = null;
		Class585.aLinkedList7706.clear();
		Class585.aLinkedList7707.clear();
		Class402.aClass180_4150.method3126();
	}

	static final void method5593(Class665 class665, int i) {
		int i_7_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_7_, 1206439713);
		Class240 class240 = Class183.aClass240Array2100[i_7_ >> 16];
		Class180.method3537(class243, class240, class665, (short) 5735);
	}

	static final void method5594(Class243 class243, Class240 class240, Class665 class665, int i) {
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		if (Class606.method10056(string, class665, -1567486513) != null)
			string = string.substring(0, string.length() - 1);
		class243.anObjectArray2638 = Class103.method1800(string, class665, (byte) -51);
		class243.aBool2606 = true;
	}

	static final void method5595(Class665 class665, byte i) throws Exception_Sub6 {
		class665.anInt8526 -= 307142523;
		int i_8_ = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		int i_9_ = class665.anIntArray8525[1 + class665.anInt8526 * 1769813785];
		int i_10_ = class665.anIntArray8525[2 + class665.anInt8526 * 1769813785];
		float f = (float) (2.0 * Math.atan((double) ((float) i_8_ / 2.0F / (float) i_10_)));
		float f_11_ = (float) (2.0 * Math.atan((double) ((float) i_9_ / 2.0F / (float) i_10_)));
		Class208_Sub10.aClass296_Sub1_9923.method5431(f, f_11_, -1697191632);
	}

	static final void method5596(Class665 class665, int i) {
		class665.anInt8526 -= 204761682;
		int i_12_ = class665.anIntArray8525[1769813785 * class665.anInt8526];
		int i_13_ = class665.anIntArray8525[1769813785 * class665.anInt8526 + 1];
		Class572.method9608(i_12_, i_13_ >> 14 & 0x3fff, i_13_ & 0x3fff, false, 2091205339);
	}

	static final void method5597(Class665 class665, byte i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class243.method4608(class243, class240, class665, 714701526);
	}

	public static Class30 method5598(String string, int i, int i_14_) {
		Class30_Sub1 class30_sub1 = new Class30_Sub1();
		class30_sub1.aString263 = string;
		class30_sub1.anInt264 = i * -499412537;
		return class30_sub1;
	}

	static final void method5599(int i) {
		Class527_Sub38_Sub2 class527_sub38_sub2 = client.aClass109_11067.aClass527_Sub38_Sub2_1364;
		class527_sub38_sub2.method18450(1297923635);
		int i_15_ = class527_sub38_sub2.method18469(8, -2061245479);
		if (i_15_ < -1599561389 * client.anInt11059) {
			for (int i_16_ = i_15_; i_16_ < -1599561389 * client.anInt11059; i_16_++)
				client.anIntArray11065[(client.anInt11064 += 110493973) * -2086779331 - 1] = client.anIntArray11021[i_16_];
		}
		if (i_15_ > -1599561389 * client.anInt11059)
			throw new RuntimeException();
		client.anInt11059 = 0;
		for (int i_17_ = 0; i_17_ < i_15_; i_17_++) {
			int i_18_ = client.anIntArray11021[i_17_];
			Class640_Sub1_Sub2_Sub1_Sub1 class640_sub1_sub2_sub1_sub1 = ((Class640_Sub1_Sub2_Sub1_Sub1) (((Class527_Sub26) client.aClass14_10989.method709((long) i_18_)).anObject10522));
			int i_19_ = class527_sub38_sub2.method18469(1, -1153131351);
			if (i_19_ == 0) {
				client.anIntArray11021[(client.anInt11059 += -84653349) * -1599561389 - 1] = i_18_;
				class640_sub1_sub2_sub1_sub1.anInt11933 = 1544429177 * client.anInt11063;
			} else {
				int i_20_ = class527_sub38_sub2.method18469(2, -1788831864);
				if (0 == i_20_) {
					client.anIntArray11021[(client.anInt11059 += -84653349) * -1599561389 - 1] = i_18_;
					class640_sub1_sub2_sub1_sub1.anInt11933 = client.anInt11063 * 1544429177;
					client.anIntArray10988[(client.anInt11061 += -11772455) * 1741574761 - 1] = i_18_;
				} else if (1 == i_20_) {
					client.anIntArray11021[(client.anInt11059 += -84653349) * -1599561389 - 1] = i_18_;
					class640_sub1_sub2_sub1_sub1.anInt11933 = 1544429177 * client.anInt11063;
					Class681 class681 = ((Class681) Class26.method858(Class255.method4707(752828172), class527_sub38_sub2.method18469(3, -1680954615), -54379590));
					class640_sub1_sub2_sub1_sub1.method18836(class681, (Class679.aClass679_8622.aByte8627), (byte) -74);
					int i_21_ = class527_sub38_sub2.method18469(1, 1731866167);
					if (i_21_ == 1)
						client.anIntArray10988[(client.anInt11061 += -11772455) * 1741574761 - 1] = i_18_;
				} else if (i_20_ == 2) {
					client.anIntArray11021[(client.anInt11059 += -84653349) * -1599561389 - 1] = i_18_;
					class640_sub1_sub2_sub1_sub1.anInt11933 = 1544429177 * client.anInt11063;
					if (class527_sub38_sub2.method18469(1, -884855478) == 1) {
						Class681 class681 = ((Class681) (Class26.method858(Class255.method4707(2073397985), class527_sub38_sub2.method18469(3, 1514439401), -635854910)));
						class640_sub1_sub2_sub1_sub1.method18836(class681, Class679.aClass679_8623.aByte8627, (byte) -14);
						Class681 class681_22_ = ((Class681) (Class26.method858(Class255.method4707(-1759720560), class527_sub38_sub2.method18469(3, 1083711672), -1686364092)));
						class640_sub1_sub2_sub1_sub1.method18836(class681_22_, Class679.aClass679_8623.aByte8627, (byte) -43);
					} else {
						Class681 class681 = ((Class681) (Class26.method858(Class255.method4707(-17515734), class527_sub38_sub2.method18469(3, -574987565), -728334766)));
						class640_sub1_sub2_sub1_sub1.method18836(class681, Class679.aClass679_8620.aByte8627, (byte) -104);
					}
					int i_23_ = class527_sub38_sub2.method18469(1, 706265783);
					if (1 == i_23_)
						client.anIntArray10988[(client.anInt11061 += -11772455) * 1741574761 - 1] = i_18_;
				} else if (3 == i_20_)
					client.anIntArray11065[(client.anInt11064 += 110493973) * -2086779331 - 1] = i_18_;
			}
		}
	}

	public static int method5600(int i) {
		return Class290.aClass300_3229.method5555(-1413545882);
	}
}
