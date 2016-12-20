/* Class530 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Date;

public class Class530 {
	Class537 this$0;

	Class530(Class537 class537) {
		this$0 = class537;
	}

	static final void method8878(Class665 class665, byte i) {
		class665.anInt8526 -= 204761682;
		int i_0_ = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		int i_1_ = class665.anIntArray8525[class665.anInt8526 * 1769813785 + 1];
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = i_0_ | 1 << i_1_;
	}

	static final void method8879(Class665 class665, int i) {
		Class35.anInt358 = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]) * -1153777785;
	}

	static final void method8880(Class665 class665, byte i) {
		class665.anInt8526 -= 204761682;
		int i_2_ = class665.anIntArray8525[1769813785 * class665.anInt8526];
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		boolean bool = (class665.anIntArray8525[1 + class665.anInt8526 * 1769813785] == 1);
		Class325.method5750(i_2_, string, bool, -1173855569);
	}

	static final void method8881(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = 0;
	}

	static String method8882(long l) {
		return Class253.method4683(new Date(l), "EEE dd-MMM-yyyy HH:mm:ss zzz", (byte) 125);
	}
}
