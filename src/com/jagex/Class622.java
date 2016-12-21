/* Class622 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.applet.Applet;
import java.util.Map;

public class Class622 {
	public static final int anInt8106 = 2;
	public int[][] anIntArrayArray8107 = new int[3][5];
	public static final int anInt8108 = 0;
	public static final int anInt8109 = 1;
	public static final int anInt8110 = 0;
	public static final int anInt8111 = 1;
	public static final int anInt8112 = 3;
	public static final int anInt8113 = 3;
	static final int anInt8114 = 3;
	public static final int anInt8115 = 5;
	public static final int anInt8116 = 4;
	static final int anInt8117 = 100;
	public int anInt8118;
	public int anInt8119;
	public int anInt8120;
	public static final int anInt8121 = 2;
	public int anInt8122;
	public int anInt8123;
	public int anInt8124;
	public int anInt8125;
	public static Applet anApplet8126;
	public static int anInt8127;
	public static Map aMap8128;
	public static Class461 aClass461_8129;

	void method7414(RSByteBuffer class536_sub33, int i) {
		for (;;) {
			int i_0_ = class536_sub33.readUnsignedByte(-990260025);
			if (0 == i_0_)
				break;
			if (1 == i_0_)
				anInt8118 = class536_sub33.method9709(-1630543065) * -576652699;
			else if (2 == i_0_)
				anInt8119 = class536_sub33.method9709(-572667858) * -266523553;
			else if (3 == i_0_)
				anInt8120 = class536_sub33.method9709(-1482561777) * -122991621;
			else if (4 == i_0_)
				anInt8125 = class536_sub33.readUnsignedByte(261847487) * 2043721265;
			else if (i_0_ == 5)
				anInt8122 = class536_sub33.readUnsignedByte(389351295) * -1183133043;
			else if (i_0_ == 6)
				anInt8123 = class536_sub33.method9709(-1801379778) * 1083493521;
			else if (7 == i_0_)
				anInt8124 = class536_sub33.method9709(-1151297333) * 1371157433;
			else if (i_0_ >= 100) {
				i_0_ -= 100;
				anIntArrayArray8107[i_0_ & (int) (Math.pow(2.0, 3.0) - 1.0)][i_0_ >> 3] = class536_sub33.readUnsignedShort((short) -12567);
			}
		}
	}

	public Class622(Class461 class461) {
		byte[] is = class461.method5595((Class633.aClass633_8252.anInt8258 * -848473139), -1878712891);
		if (is != null) {
			/* empty */
		}
		method7414(new RSByteBuffer(is), 1017362388);
	}

	void method7415(RSByteBuffer class536_sub33) {
		for (;;) {
			int i = class536_sub33.readUnsignedByte(-647868047);
			if (0 == i)
				break;
			if (1 == i)
				anInt8118 = class536_sub33.method9709(-787345436) * -576652699;
			else if (2 == i)
				anInt8119 = class536_sub33.method9709(-1854147655) * -266523553;
			else if (3 == i)
				anInt8120 = class536_sub33.method9709(-1155849354) * -122991621;
			else if (4 == i)
				anInt8125 = class536_sub33.readUnsignedByte(-778473523) * 2043721265;
			else if (i == 5)
				anInt8122 = class536_sub33.readUnsignedByte(-552606997) * -1183133043;
			else if (i == 6)
				anInt8123 = class536_sub33.method9709(-2010017022) * 1083493521;
			else if (7 == i)
				anInt8124 = class536_sub33.method9709(-742576669) * 1371157433;
			else if (i >= 100) {
				i -= 100;
				anIntArrayArray8107[i & (int) (Math.pow(2.0, 3.0) - 1.0)][i >> 3] = class536_sub33.readUnsignedShort((short) -8917);
			}
		}
	}

	static final void method7416(Class668 class668, byte i) {
		if (!Class683.aClass301_Sub1_8651.method4054(346046871).method3922((short) 2360))
			throw new RuntimeException();
		Class333_Sub3 class333_sub3 = ((Class333_Sub3) Class683.aClass301_Sub1_8651.method4051(826143221));
		class333_sub3.method9213(Class466.aClass439_5323, -1, 0.0F, (byte) -64);
		client.aBool11242 = true;
	}

	static boolean method7417(byte i) {
		if (Class228.aClass536_Sub18_Sub9_2359 == null)
			return false;
		if (-517484763 * Class228.aClass536_Sub18_Sub9_2359.anInt11718 >= 2000)
			Class228.aClass536_Sub18_Sub9_2359.anInt11718 -= -1959557232;
		if (-517484763 * Class228.aClass536_Sub18_Sub9_2359.anInt11718 == 1007)
			return true;
		return false;
	}

	static final void method7418(Class668 class668, byte i) {
		int i_1_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		Class251 class251 = Class264.method3678(i_1_, -689214737);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = (1 == 1939619399 * class251.anInt2601 ? class251.anInt2602 * -2011124813 : -1);
	}

	static final void method7419(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		Class251 class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class4.method572(class251, class234, class668, 2039348808);
	}
}
