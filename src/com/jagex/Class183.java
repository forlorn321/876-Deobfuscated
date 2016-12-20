/* Class183 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class183 {
	int anInt2096;
	public int anInt2097;
	public int anInt2098;
	public int anInt2099;
	public static Class240[] aClass240Array2100;

	Class183 method3554(int i, byte i_0_) {
		return new Class183(1280345283 * anInt2099, i, anInt2096 * 302411983, anInt2098 * -1651221637);
	}

	Class183(int i, int i_1_, int i_2_, int i_3_) {
		anInt2099 = 284904427 * i;
		anInt2097 = 205922923 * i_1_;
		anInt2096 = -406284753 * i_2_;
		anInt2098 = 506809267 * i_3_;
	}

	Class183 method3555(int i) {
		return new Class183(1280345283 * anInt2099, i, anInt2096 * 302411983, anInt2098 * -1651221637);
	}

	public static Class400[] method3556(int i) {
		return (new Class400[] { Class400.aClass400_4138, Class400.aClass400_4139, Class400.aClass400_4140 });
	}

	public static void method3557(String string, String string_4_, int i, boolean bool, String string_5_, int i_6_) {
		if (11 == client.anInt11048 * -1927019389) {
			Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4458, client.aClass109_11066.aClass2_1367, (byte) -79);
			class527_sub15.buffer.writeShort(0, 1404835786);
			int i_7_ = (-441238943 * class527_sub15.buffer.anInt10689);
			class527_sub15.buffer.writeString(string, -1975400307);
			class527_sub15.buffer.writeString(string_4_, 1593805857);
			class527_sub15.buffer.writeByte(i, 798206248);
			class527_sub15.buffer.writeByte(bool ? 1 : 0, -313995628);
			class527_sub15.buffer.writeString(string_5_, 1153514618);
			class527_sub15.buffer.anInt10689 += 1733321575;
			class527_sub15.buffer.method16471(Class77.anIntArray797, i_7_, (class527_sub15.buffer.anInt10689 * -441238943), (byte) -25);
			class527_sub15.buffer.method16437(-441238943 * (class527_sub15.buffer.anInt10689) - i_7_, -18705907);
			client.aClass109_11066.method1969(class527_sub15, (byte) 1);
			if (i < 13) {
				client.aBool11034 = true;
				Class483.method7954(1457957411);
			}
			Class207.aClass702_2232 = Class702.aClass702_8803;
		}
	}

	public static void method3558(String string, boolean bool, boolean bool_8_, int i) {
		Class477.method7780(string, bool, "openjs", bool_8_, (byte) 23);
	}

	static final void method3559(Class665 class665, int i) {
		int i_9_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		if (null == aClass240Array2100[i_9_])
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = "";
		else {
			String string = aClass240Array2100[i_9_].aClass243Array2392[0].aString2667;
			if (string == null)
				class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = "";
			else
				class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = string.substring(0, string.indexOf(':'));
		}
	}

	static final void method3560(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class671.method13783(725231575);
	}

	static final void method3561(Class665 class665, byte i) {
		Class527_Sub1.method16019((Class640_Sub1) class665.anInterface62_8539, class665, -1056398798);
	}

	static final void method3562(Class665 class665, byte i) {
		int i_10_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = class665.aClass346_8532.aBoolArray3728[i_10_] ? 1 : 0;
	}
}
