/* Class573 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class573 implements Interface14, Interface7 {
	Class581 aClass581_7627;
	int anInt7628 = 1238959933;
	int[] anIntArray7629;
	int anInt7630 = 188545473;
	int anInt7631;

	public static Class511 method9610(int i, int i_0_, int i_1_, int i_2_, Interface13 interface13, Interface13 interface13_3_) {
		Class496[] class496s = null;
		Class573 class573 = (Class573) interface13.method81(i, 204215206);
		if (null != class573.anIntArray7629) {
			class496s = new Class496[class573.anIntArray7629.length];
			for (int i_4_ = 0; i_4_ < class496s.length; i_4_++) {
				Class305 class305 = ((Class305) interface13_3_.method81(class573.anIntArray7629[i_4_], 579929000));
				class496s[i_4_] = new Class496(-1557865347 * class305.anInt3433, class305.anInt3435 * 1547782589, 1008938039 * class305.anInt3431, 1143007631 * class305.anInt3432, class305.anInt3430 * -1970402591, 668584475 * class305.anInt3436, class305.anInt3429 * -1643785999, class305.aBool3434, 413625613 * class305.anInt3437, 251691779 * class305.anInt3438, class305.anInt3439 * 704571547);
			}
		}
		return new Class511(class573.anInt7628 * -1617070101, class496s, -529405505 * class573.anInt7630, i_0_, i_1_, i_2_, class573.aClass581_7627, class573.anInt7631 * 1957028581);
	}

	public void method82(RSByteBuffer class527_sub38, int i) {
		for (;;) {
			int i_5_ = class527_sub38.readUnsignedByte();
			if (i_5_ == 0)
				break;
			method9615(class527_sub38, i_5_, 2099535081);
		}
	}

	public void method16(int i, int i_6_) {
		/* empty */
	}

	void method9611(RSByteBuffer class527_sub38, int i) {
		if (i == 1)
			anInt7628 = class527_sub38.readUnsignedShort() * -1238959933;
		else if (i == 2) {
			anIntArray7629 = new int[class527_sub38.readUnsignedByte()];
			for (int i_7_ = 0; i_7_ < anIntArray7629.length; i_7_++)
				anIntArray7629[i_7_] = class527_sub38.readUnsignedShort();
		} else if (i == 3)
			anInt7630 = class527_sub38.readUnsignedByte() * -188545473;
		else if (i == 4)
			aClass581_7627 = ((Class581) Class26.method858(Class672.method13829((byte) -45), class527_sub38.readUnsignedByte(), -1277673506));
		else if (5 == i)
			anInt7631 = class527_sub38.method16466(-1916030652) * 542116589;
		else if (6 == i)
			class527_sub38.method16466(-1908440112);
	}

	public void method86(int i) {
		/* empty */
	}

	public void method83(RSByteBuffer class527_sub38) {
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			if (i == 0)
				break;
			method9615(class527_sub38, i, 2076232643);
		}
	}

	public void method85() {
		/* empty */
	}

	Class573() {
		aClass581_7627 = Class581.aClass581_7674;
		anInt7631 = -542116589;
	}

	public void method73(RSByteBuffer class527_sub38) {
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			if (i == 0)
				break;
			method9615(class527_sub38, i, 2066167877);
		}
	}

	public void method60(int i) {
		/* empty */
	}

	void method9612(RSByteBuffer class527_sub38, int i) {
		if (i == 1)
			anInt7628 = class527_sub38.readUnsignedShort() * -1238959933;
		else if (i == 2) {
			anIntArray7629 = new int[class527_sub38.readUnsignedByte()];
			for (int i_8_ = 0; i_8_ < anIntArray7629.length; i_8_++)
				anIntArray7629[i_8_] = class527_sub38.readUnsignedShort();
		} else if (i == 3)
			anInt7630 = class527_sub38.readUnsignedByte() * -188545473;
		else if (i == 4)
			aClass581_7627 = ((Class581) Class26.method858(Class672.method13829((byte) -69), class527_sub38.readUnsignedByte(), -161737874));
		else if (5 == i)
			anInt7631 = class527_sub38.method16466(-1991091473) * 542116589;
		else if (6 == i)
			class527_sub38.method16466(-1913792406);
	}

	void method9613(RSByteBuffer class527_sub38, int i) {
		if (i == 1)
			anInt7628 = class527_sub38.readUnsignedShort() * -1238959933;
		else if (i == 2) {
			anIntArray7629 = new int[class527_sub38.readUnsignedByte()];
			for (int i_9_ = 0; i_9_ < anIntArray7629.length; i_9_++)
				anIntArray7629[i_9_] = class527_sub38.readUnsignedShort();
		} else if (i == 3)
			anInt7630 = class527_sub38.readUnsignedByte() * -188545473;
		else if (i == 4)
			aClass581_7627 = ((Class581) Class26.method858(Class672.method13829((byte) 51), class527_sub38.readUnsignedByte(), -1053443295));
		else if (5 == i)
			anInt7631 = class527_sub38.method16466(-1984698337) * 542116589;
		else if (6 == i)
			class527_sub38.method16466(-1716688896);
	}

	void method9614(RSByteBuffer class527_sub38, int i) {
		if (i == 1)
			anInt7628 = class527_sub38.readUnsignedShort() * -1238959933;
		else if (i == 2) {
			anIntArray7629 = new int[class527_sub38.readUnsignedByte()];
			for (int i_10_ = 0; i_10_ < anIntArray7629.length; i_10_++)
				anIntArray7629[i_10_] = class527_sub38.readUnsignedShort();
		} else if (i == 3)
			anInt7630 = class527_sub38.readUnsignedByte() * -188545473;
		else if (i == 4)
			aClass581_7627 = ((Class581) Class26.method858(Class672.method13829((byte) -68), class527_sub38.readUnsignedByte(), 349693894));
		else if (5 == i)
			anInt7631 = class527_sub38.method16466(-1656630111) * 542116589;
		else if (6 == i)
			class527_sub38.method16466(-2081302412);
	}

	void method9615(RSByteBuffer class527_sub38, int i, int i_11_) {
		if (i == 1)
			anInt7628 = class527_sub38.readUnsignedShort() * -1238959933;
		else if (i == 2) {
			anIntArray7629 = new int[class527_sub38.readUnsignedByte()];
			for (int i_12_ = 0; i_12_ < anIntArray7629.length; i_12_++)
				anIntArray7629[i_12_] = class527_sub38.readUnsignedShort();
		} else if (i == 3)
			anInt7630 = class527_sub38.readUnsignedByte() * -188545473;
		else if (i == 4)
			aClass581_7627 = ((Class581) Class26.method858(Class672.method13829((byte) 15), class527_sub38.readUnsignedByte(), -658388839));
		else if (5 == i)
			anInt7631 = class527_sub38.method16466(-1802825334) * 542116589;
		else if (6 == i)
			class527_sub38.method16466(-1701334174);
	}

	public void method84() {
		/* empty */
	}

	static final void method9616(Class665 class665, boolean bool, boolean bool_13_, byte i) {
		int i_14_ = class665.anIntArray8545[class665.anInt8527 * 891367231];
		int i_15_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		if (i_15_ < 0 || i_15_ >= class665.anIntArray8538[i_14_])
			throw new RuntimeException();
		if (!bool)
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = class665.anIntArrayArray8542[i_14_][i_15_];
		else if (bool_13_) {
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = class665.anIntArrayArray8542[i_14_][i_15_];
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = i_15_;
		} else {
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = i_15_;
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = class665.anIntArrayArray8542[i_14_][i_15_];
		}
	}

	static final void method9617(Class665 class665, int i) {
		int i_16_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class703.aClass219_8825.method3992(i_16_, 967361750).method3911(2078942534) ? 1 : 0;
	}

	public static void method9618(int i, int[] is, int i_17_) {
		if (i != -1 && Class189.method3666(i, is, -374584257)) {
			Class243[] class243s = Class183.aClass240Array2100[i].aClass243Array2392;
			Class203.method3777(class243s, (byte) 71);
		}
	}
}
