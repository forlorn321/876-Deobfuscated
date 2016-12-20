/* Class309 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class309 {
	public static Class309 aClass309_3455;
	public static Class309 aClass309_3456 = new Class309(0, false);
	static Class309 aClass309_3457;
	boolean aBool3458;
	public static Class309 aClass309_3459;
	static Class309 aClass309_3460;
	static Class309 aClass309_3461;
	public int anInt3462;
	static Class309 aClass309_3463;
	public static Class440 aClass440_3464;

	public boolean method5627(byte i) {
		return aBool3458;
	}

	Class309(int i, boolean bool) {
		anInt3462 = 360438057 * i;
		aBool3458 = bool;
	}

	static {
		aClass309_3455 = new Class309(1, false);
		aClass309_3457 = new Class309(2, true);
		aClass309_3459 = new Class309(3, false);
		aClass309_3463 = new Class309(4, true);
		aClass309_3460 = new Class309(5, true);
		aClass309_3461 = new Class309(6, true);
	}

	static final void method5628(Class665 class665, byte i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		class665.anInt8526 -= 1023808410;
		byte[] is = null;
		byte[] is_0_ = null;
		int i_1_;
		for (i_1_ = 0; i_1_ < 10 && (class665.anIntArray8525[i_1_ + 1769813785 * class665.anInt8526]) >= 0; i_1_ += 2) {
			/* empty */
		}
		if (i_1_ > 0) {
			is = new byte[i_1_ / 2];
			is_0_ = new byte[i_1_ / 2];
			for (i_1_ -= 2; i_1_ >= 0; i_1_ -= 2) {
				is[i_1_ / 2] = (byte) (class665.anIntArray8525[i_1_ + 1769813785 * class665.anInt8526]);
				is_0_[i_1_ / 2] = (byte) (class665.anIntArray8525[i_1_ + 1769813785 * class665.anInt8526 + 1]);
			}
		}
		Class527_Sub41.method16680(class243, is, is_0_, class665, -1489331638);
	}

	static final void method5629(Class243 class243, Class240 class240, Class665 class665, int i) {
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		if (Class606.method10056(string, class665, -878113865) != null)
			string = string.substring(0, string.length() - 1);
		class243.anObjectArray2609 = Class103.method1800(string, class665, (byte) -93);
		class243.aBool2606 = true;
	}

	static final void method5630(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class679.method13903(class243, class240, class665, -145247278);
	}

	static final void method5631(Class665 class665, int i) {
		class665.anInt8526 -= 204761682;
		int i_2_ = class665.anIntArray8525[1769813785 * class665.anInt8526];
		int i_3_ = class665.anIntArray8525[class665.anInt8526 * 1769813785 + 1];
		Class80 class80 = (Class80) Class679.aClass24_Sub21_8628.method81(i_3_, -49724878);
		if (class80.method1566(-1168324902))
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = ((Class249) Class457.aClass24_Sub12_5063.method81(i_2_, 1775197812)).method4636(i_3_, class80.aString806, -650155190);
		else
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = (((Class249) Class457.aClass24_Sub12_5063.method81(i_2_, 545629681)).method4640(i_3_, 780718929 * class80.anInt804, 1921746187));
	}

	static final void method5632(Class243 class243, Class240 class240, Class665 class665, byte i) {
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		if (Class606.method10056(string, class665, -1384611458) != null)
			string = string.substring(0, string.length() - 1);
		class243.anObjectArray2608 = Class103.method1800(string, class665, (byte) -80);
		class243.aBool2606 = true;
	}

	public static final void method5633(String string, int i) {
		if (null != string) {
			String string_4_ = Class641.method10704(string, Class242.aClass91_2471, -2096956998);
			if (string_4_ != null) {
				for (int i_5_ = 0; i_5_ < 182205737 * client.anInt11299; i_5_++) {
					Class72 class72 = client.aClass72Array11301[i_5_];
					String string_6_ = class72.aString785;
					String string_7_ = Class641.method10704(string_6_, Class242.aClass91_2471, -2140926722);
					if (Class519.method8660(string, string_4_, string_6_, string_7_, (short) 3450)) {
						client.anInt11299 -= 1142402841;
						for (int i_8_ = i_5_; i_8_ < 182205737 * client.anInt11299; i_8_++)
							client.aClass72Array11301[i_8_] = client.aClass72Array11301[1 + i_8_];
						client.anInt11047 = -97421591 * client.anInt11221;
						Class109 class109 = Class203.method3782((byte) -1);
						Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4480, class109.aClass2_1367, (byte) 18);
						class527_sub15.buffer.writeByte(Class208_Sub18.method15632(string, (byte) -88), -916832674);
						class527_sub15.buffer.writeString(string, 732737119);
						class109.method1969(class527_sub15, (byte) 1);
						break;
					}
				}
			}
		}
	}
}
