/* Class211 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class211 implements Interface26 {
	Class214 this$0;
	Class228 aClass228_2255;
	public static Class420 aClass420_2256;

	public void method151(Class219 class219) {
		class219.method3996(aClass228_2255, (byte) 1);
	}

	public void method150(Class219 class219, int i) {
		class219.method3996(aClass228_2255, (byte) 1);
	}

	Class211(Class214 class214, RSByteBuffer class527_sub38) {
		this$0 = class214;
		boolean bool = class527_sub38.readUnsignedByte() != 255;
		if (bool)
			class527_sub38.anInt10689 -= 1474750881;
		aClass228_2255 = new Class228(class527_sub38, bool, true);
	}

	public static int[] method3875(byte i) {
		return (new int[] { Class49.anInt505 * 1950472807, Class49.anInt504 * -334130291, 1465865579 * Class49.anInt506 });
	}

	static final void method3876(Class665 class665, int i) {
		int i_0_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_0_, -823854496);
		Class240 class240 = Class183.aClass240Array2100[i_0_ >> 16];
		Class249.method4659(class243, class240, true, 1, class665, (byte) 109);
	}

	public static final void method3877(String string, int i, int i_1_) {
		Class109 class109 = Class203.method3782((byte) -1);
		Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4487, class109.aClass2_1367, (byte) -64);
		class527_sub15.buffer.writeByte(1 + Class208_Sub18.method15632(string, (byte) -51), 1603885915);
		class527_sub15.buffer.writeString(string, 1552821537);
		class527_sub15.buffer.write128Byte(i, (byte) 8);
		class109.method1969(class527_sub15, (byte) 1);
	}

	static final void method3878(Class665 class665, int i) {
		class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = ((Class640_Sub1_Sub2_Sub1_Sub2) class665.aClass640_Sub1_Sub2_Sub1_8522).method18879(true, (byte) -2);
	}

	public static void method3879(int i) {
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub13_10607), 1, 1461947169);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub13_10608), 1, 276137610);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub4_10600), 1, 255707964);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub40_10604), 1, -161253583);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub26_10602), 0, 591456076);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub12_10597), 0, 168731633);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub10_10611), 0, -117545848);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub1_10603), 0, 640582651);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub9_10610), 0, 2137119413);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub8_10601), 0, 1339003988);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub18_10615), 0, 824824488);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub15_10598), 0, 68079238);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub37_10589), 0, 1360762082);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub37_10637), 0, 811525242);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub20_10606), 0, 212356064);
		Class204.aClass527_Sub31_2213.method16350(Class204.aClass527_Sub31_2213.aClass700_Sub17_10594, -1802310015 * Class282.aClass282_3192.anInt3196, 407086964);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub42_10592), 0, 173185770);
		if (null != Class402.aClass180_4150 && Class402.aClass180_4150.method3374() && Class402.aClass180_4150.method3204())
			Class402.aClass180_4150.method3203();
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub34_10599), 0, 1845000933);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub35_10588), 0, -201753131);
		Class317.method5683(-564648607);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub32_10620), 2, 1622971285);
		Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub39_10627), 2, 1395096965);
		Class208_Sub22.method15638((byte) 1);
		client.aClass509_11072.method8397(1241726467).method10252((short) -29970);
		client.aBool11183 = true;
	}

	static final void method3880(Class665 class665, int i) {
		Class204.aClass527_Sub31_2213.method16350(Class204.aClass527_Sub31_2213.aClass700_Sub1_10603, (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]), -207010187);
		client.aClass509_11072.method8361(-428559959);
		Class631.method10465(2131749803);
		client.aBool11020 = false;
	}
}
