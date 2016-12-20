/* Class512 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class512 {
	public int anInt7004;
	public int anInt7005;
	public int anInt7006;
	public int anInt7007;
	static long aLong7008;

	Class512(int i, int i_0_, int i_1_, int i_2_) {
		anInt7004 = i * 435015693;
		anInt7005 = -97047673 * i_0_;
		anInt7007 = i_1_ * -1359887683;
		anInt7006 = i_2_ * 1991112107;
	}

	Class512() {
		anInt7004 = (32 + (int) (Math.random() * 4.0)) * 435015693;
		anInt7005 = (3 + (int) (Math.random() * 2.0)) * -97047673;
		anInt7007 = (16 + (int) (Math.random() * 3.0)) * -1359887683;
		if (Class204.aClass527_Sub31_2213.aClass700_Sub9_10610.method16924(-2143463434) == 1)
			anInt7006 = (int) (Math.random() * 6.0) * 1991112107;
		else
			anInt7006 = (int) (Math.random() * 12.0) * 1991112107;
	}

	static final void method8486(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class243 class243_3_ = Class519.method8657(class240, class243, 896322317);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = null == class243_3_ ? -1 : -254728301 * class243_3_.anInt2504;
	}

	public static void method8487(boolean bool, int i) {
		/* empty */
	}

	public static String method8488(long l, int i, int i_4_) {
		Class565.method9496(l);
		int i_5_ = Class85.aCalendar816.get(11);
		int i_6_ = Class85.aCalendar816.get(12);
		int i_7_ = Class85.aCalendar816.get(13);
		return new StringBuilder().append(Integer.toString(i_5_ / 10)).append(i_5_ % 10).append(":").append(i_6_ / 10).append(i_6_ % 10).append(":").append(i_7_ / 10).append(i_7_ % 10).toString();
	}

	public static final void method8489(String string, byte i) {
		if (!string.equals("")) {
			Class109 class109 = Class203.method3782((byte) -1);
			Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4466, class109.aClass2_1367, (byte) 29);
			class527_sub15.buffer.writeByte(Class208_Sub18.method15632(string, (byte) -65), 584496355);
			class527_sub15.buffer.writeString(string, -2066054120);
			class109.method1969(class527_sub15, (byte) 1);
		}
	}

	static final void method8490(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class324.method5724(class243, class665, -1337513921);
	}
}
