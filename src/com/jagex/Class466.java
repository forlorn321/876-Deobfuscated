/* Class466 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Comparator;

class Class466 implements Comparator {
	Class458 this$0;
	public static Class196[] aClass196Array5314;

	public boolean equals(Object object) {
		return super.equals(object);
	}

	int method7652(Class473 class473, Class473 class473_0_, int i) {
		if (7787969294484491961L * class473.aLong5371 > 7787969294484491961L * class473_0_.aLong5371)
			return 1;
		if (7787969294484491961L * class473.aLong5371 < class473_0_.aLong5371 * 7787969294484491961L)
			return -1;
		return 0;
	}

	public int method7653(Object object, Object object_1_) {
		return method7652((Class473) object, (Class473) object_1_, 661033495);
	}

	public int compare(Object object, Object object_2_) {
		return method7652((Class473) object, (Class473) object_2_, 1729968156);
	}

	public boolean method7654(Object object) {
		return super.equals(object);
	}

	public int method7655(Object object, Object object_3_) {
		return method7652((Class473) object, (Class473) object_3_, 999933601);
	}

	public boolean method7656(Object object) {
		return super.equals(object);
	}

	int method7657(Class473 class473, Class473 class473_4_) {
		if (7787969294484491961L * class473.aLong5371 > 7787969294484491961L * class473_4_.aLong5371)
			return 1;
		if (7787969294484491961L * class473.aLong5371 < class473_4_.aLong5371 * 7787969294484491961L)
			return -1;
		return 0;
	}

	Class466(Class458 class458) {
		this$0 = class458;
	}

	int method7658(Class473 class473, Class473 class473_5_) {
		if (7787969294484491961L * class473.aLong5371 > 7787969294484491961L * class473_5_.aLong5371)
			return 1;
		if (7787969294484491961L * class473.aLong5371 < class473_5_.aLong5371 * 7787969294484491961L)
			return -1;
		return 0;
	}

	static void method7659(Class665 class665, byte i) {
		int i_6_ = Class296_Sub1.method15693((short) -20088);
		if (i_6_ < 0) {
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1;
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = "";
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = "";
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = "";
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = "";
		} else {
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = Class597.aTwitchEventLiveStreams7849.viewerCounts[i_6_];
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = Class597.aTwitchEventLiveStreams7849.channelUrls[i_6_];
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = (Class597.aTwitchEventLiveStreams7849.previewUrlTemplates[i_6_]);
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = Class597.aTwitchEventLiveStreams7849.streamTitles[i_6_];
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = (Class597.aTwitchEventLiveStreams7849.channelDisplayNames[i_6_]);
		}
	}

	static final void method7660(Class665 class665, int i) {
		int i_7_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class656.anIntArray8393[i_7_ & 0xffff];
	}

	static final void method7661(Class665 class665, byte i) {
		int i_8_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = i_8_ ^ 0xffffffff;
	}

	public static Class698[] method7662(byte i) {
		return (new Class698[] { Class698.aClass698_8768, Class698.aClass698_8763, Class698.aClass698_8764, Class698.aClass698_8765, Class698.aClass698_8766, Class698.aClass698_8767 });
	}
}
