/* Class591 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;

import com.jagex.twitchtv.TwitchWebcamDevice;

public class Class591 {
	public static Class591 aClass591_7794;
	public static Class591 aClass591_7795 = new Class591(0);
	public static Class591 aClass591_7796 = new Class591(1);

	Class591(int i) {
		/* empty */
	}

	static {
		aClass591_7794 = new Class591(2);
	}

	static final void method9854(byte i) {
		Iterator iterator = client.aClass14_11184.iterator();
		while (iterator.hasNext()) {
			Class527_Sub8_Sub6 class527_sub8_sub6 = (Class527_Sub8_Sub6) iterator.next();
			Class640_Sub1_Sub2_Sub4 class640_sub1_sub2_sub4 = class527_sub8_sub6.aClass640_Sub1_Sub2_Sub4_11639;
			if (client.aClass509_11072.method8314(-1858171341) != null && class640_sub1_sub2_sub4.method18787(1563611809))
				client.aClass509_11072.method8314(1932242735).method9269(class640_sub1_sub2_sub4, true, -2035300978);
		}
	}

	static void method9855(Class665 class665, int i) {
		int i_0_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		TwitchWebcamDevice twitchwebcamdevice = Class460.method7571(i_0_, (byte) -63);
		if (twitchwebcamdevice == null) {
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1;
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = "";
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = "";
		} else {
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = twitchwebcamdevice.anInt1120 * 1028486927;
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = twitchwebcamdevice.aString1118;
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = twitchwebcamdevice.aString1119;
		}
	}
}
