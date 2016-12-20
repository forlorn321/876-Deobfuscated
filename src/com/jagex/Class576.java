/* Class576 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class576 implements Interface67 {
	Class71 aClass71_7636;
	String aString7637;
	int anInt7638;
	String aString7639;
	static int anInt7640;

	public void method285() {
		Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4397, client.aClass109_11067.aClass2_1367, (byte) -50);
		int i = ((class527_sub15.buffer.anInt10689 += 1474750881) * -441238943);
		class527_sub15.buffer.writeByte(aClass71_7636.method87(), 1927025035);
		class527_sub15.buffer.writeString(aString7637, -83079944);
		class527_sub15.buffer.writeShort(-692010739 * anInt7638, 1404835786);
		class527_sub15.buffer.writeString(Class498.aString5582, 558261261);
		if (aString7639 != null) {
			class527_sub15.buffer.writeByte(1, 1571121457);
			String string = aString7639;
			if (string.length() > 100)
				string = string.substring(0, 100);
			class527_sub15.buffer.writeString(string, 706132511);
		} else
			class527_sub15.buffer.writeByte(0, -540150956);
		class527_sub15.buffer.method16534((class527_sub15.buffer.anInt10689 * -441238943 - i), -1562822477);
		client.aClass109_11067.method1969(class527_sub15, (byte) 1);
	}

	public void method421(int i) {
		Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4397, client.aClass109_11067.aClass2_1367, (byte) -78);
		int i_0_ = ((class527_sub15.buffer.anInt10689 += 1474750881) * -441238943);
		class527_sub15.buffer.writeByte(aClass71_7636.method87(), -2112433522);
		class527_sub15.buffer.writeString(aString7637, -1133811209);
		class527_sub15.buffer.writeShort(-692010739 * anInt7638, 1404835786);
		class527_sub15.buffer.writeString(Class498.aString5582, 1773300575);
		if (aString7639 != null) {
			class527_sub15.buffer.writeByte(1, 1345041405);
			String string = aString7639;
			if (string.length() > 100)
				string = string.substring(0, 100);
			class527_sub15.buffer.writeString(string, 1152856625);
		} else
			class527_sub15.buffer.writeByte(0, -1310774540);
		class527_sub15.buffer.method16534((class527_sub15.buffer.anInt10689 * -441238943 - i_0_), -615581109);
		client.aClass109_11067.method1969(class527_sub15, (byte) 1);
	}

	Class576(Class71 class71, String string, int i, Throwable throwable) {
		aClass71_7636 = class71;
		aString7637 = string;
		anInt7638 = -99420731 * i;
		aString7639 = throwable != null ? throwable.getMessage() : null;
	}

	static final void method9633(Class243 class243, Class665 class665, byte i) {
		class665.anInt8526 -= 204761682;
		int i_1_ = class665.anIntArray8525[class665.anInt8526 * 1769813785] - 1;
		int i_2_ = class665.anIntArray8525[1 + 1769813785 * class665.anInt8526];
		if (i_1_ < 0 || i_1_ > 9)
			throw new RuntimeException();
		Class565.method9499(class243, i_1_, i_2_, class665, -17413703);
	}

	static final void method9634(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = ((Class640_Sub1) class665.anInterface62_8539).method17049((byte) -128);
	}

	public static Class176 method9635(Class180 class180, int i, int i_3_, int i_4_, int i_5_, Class176 class176, short i_6_, byte i_7_, Class695 class695, byte i_8_) {
		if (class176 == null)
			return null;
		int i_9_ = 2055;
		if (class695 != null) {
			i_9_ |= class695.method14174(-822649352);
			i_9_ &= ~0x200;
		}
		long l = (long) ((i_6_ & 0xffff) << 8 | i_7_);
		Class176 class176_10_;
		synchronized (Class55.aClass205_709) {
			class176_10_ = (Class176) Class55.aClass205_709.method3787(l);
		}
		if (null == class176_10_ || class180.method3175(class176_10_.method2874(), i_9_) != 0) {
			if (class176_10_ != null)
				i_9_ = class180.method3176(i_9_, class176_10_.method2874());
			Class175 class175 = new Class175(4, 2, 2);
			int i_11_ = 128;
			int[] is = new int[4];
			is[0] = class175.method2849(-i_11_, 0, -i_11_);
			is[1] = class175.method2849(i_11_, 0, -i_11_);
			is[2] = class175.method2849(i_11_, 0, i_11_);
			is[3] = class175.method2849(-i_11_, 0, i_11_);
			class175.method2804(0, 1, 2, (byte) 1, (byte) 0, (short) 0, i_7_, i_6_);
			class175.method2804(0, 2, 3, (byte) 1, (byte) 0, (short) 0, i_7_, i_6_);
			class175.method2805((short) 1, (short) 2, (short) 0);
			class175.method2805((short) 2, (short) 3, (short) 0);
			class176_10_ = class180.method3376(class175, i_9_, Class526.anInt7104 * 1730638447, 64, 768);
			synchronized (Class55.aClass205_709) {
				Class55.aClass205_709.method3790(class176_10_, l);
			}
		}
		int i_12_ = class176.method2894();
		int i_13_ = class176.method2939();
		int i_14_ = class176.method2898();
		int i_15_ = class176.method2890();
		if (class695 != null) {
			class176_10_ = class176_10_.method2862((byte) 3, i_9_, true);
			class176_10_.method2872(i_13_ - i_12_ >> 1, 128, i_15_ - i_14_ >> 1);
			class176_10_.method3015(i_13_ + i_12_ >> 1, 0, i_15_ + i_14_ >> 1);
			class695.method14171(class176_10_, 536775333);
		} else {
			class176_10_ = class176_10_.method2862((byte) 3, i_9_, true);
			class176_10_.method2872(i_13_ - i_12_ >> 1, 128, i_15_ - i_14_ >> 1);
			class176_10_.method3015(i_13_ + i_12_ >> 1, 0, i_14_ + i_15_ >> 1);
		}
		if (i_3_ != 0)
			class176_10_.method2868(i_3_);
		if (i_4_ != 0)
			class176_10_.method2869(i_4_);
		if (i_5_ != 0)
			class176_10_.method3015(0, i_5_, 0);
		return class176_10_;
	}

	static final void method9636(Class665 class665, int i) {
		class665.aClass382_8535 = new Class382();
		class665.aClass382_8535.anInt3939 = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]) * 389032867;
		class665.aClass382_8535.aClass527_Sub8_Sub17_3940 = Exception_Sub3.aClass51_11362.method1277((-1237622773 * (class665.aClass382_8535.anInt3939)), 2028881186);
		class665.aClass382_8535.anIntArray3941 = new int[class665.aClass382_8535.aClass527_Sub8_Sub17_3940.method18406(1901603093)];
	}
}
