/* Class329 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class329 implements Interface33 {
	Class383 aClass383_3602;
	Class459 aClass459_3603;
	Class147 aClass147_3604;
	static String aString3605;
	static String aString3606;

	public void method205(byte i) {
		aClass147_3604 = Class568.method9569(aClass459_3603, aClass383_3602.anInt3946 * -1301345907, 173180259);
	}

	public boolean method204(int i) {
		return aClass459_3603.method7480((-1301345907 * aClass383_3602.anInt3946), -969724174);
	}

	public void method203(boolean bool, int i) {
		if (bool) {
			int i_0_ = ((aClass383_3602.aClass400_3943.method6525(aClass147_3604.method42(), -1844600635 * client.anInt11158, -1173855569)) + 1877641641 * aClass383_3602.anInt3945);
			int i_1_ = ((aClass383_3602.aClass384_3944.method6413(aClass147_3604.method2410(), 1254981347 * client.anInt11058, -1349476899)) + 162660109 * aClass383_3602.anInt3942);
			aClass147_3604.method2415(i_0_, i_1_);
		}
	}

	public void method85() {
		aClass147_3604 = Class568.method9569(aClass459_3603, aClass383_3602.anInt3946 * -1301345907, 173180259);
	}

	public void method206(boolean bool) {
		if (bool) {
			int i = ((aClass383_3602.aClass400_3943.method6525(aClass147_3604.method42(), -1844600635 * client.anInt11158, -1173855569)) + 1877641641 * aClass383_3602.anInt3945);
			int i_2_ = ((aClass383_3602.aClass384_3944.method6413(aClass147_3604.method2410(), 1254981347 * client.anInt11058, 504280616)) + 162660109 * aClass383_3602.anInt3942);
			aClass147_3604.method2415(i, i_2_);
		}
	}

	Class329(Class459 class459, Class383 class383) {
		aClass459_3603 = class459;
		aClass383_3602 = class383;
	}

	public boolean method207() {
		return aClass459_3603.method7480((-1301345907 * aClass383_3602.anInt3946), -510443493);
	}

	public boolean method208() {
		return aClass459_3603.method7480((-1301345907 * aClass383_3602.anInt3946), 576236638);
	}

	public static SubIncomingPacket[] method5809(int i) {
		return (new SubIncomingPacket[] { SubIncomingPacket.aClass421_4595, SubIncomingPacket.aClass421_4593, SubIncomingPacket.aClass421_4594, SubIncomingPacket.aClass421_4606, SubIncomingPacket.aClass421_4597, SubIncomingPacket.aClass421_4598, SubIncomingPacket.REMOVE_GROUND_ITEM, SubIncomingPacket.aClass421_4599, SubIncomingPacket.ADD_GROUND_ITEM, SubIncomingPacket.aClass421_4601, SubIncomingPacket.aClass421_4602, SubIncomingPacket.aClass421_4603, SubIncomingPacket.aClass421_4596, SubIncomingPacket.aClass421_4605, SubIncomingPacket.aClass421_4604 });
	}

	public static void method5810(Class180 class180, long l) {
		class180.method3126();
		Class585.aLinkedList7706.clear();
		Class585.aLinkedList7707.clear();
		Class585.aLong7699 = ((l + (long) (Class585.anInt7683 * 1254703743)) * 1221725028280924535L);
	}

	static final void method5811(Class243 class243, Class240 class240, Class665 class665, int i) {
		class243.anInt2541 = 121119097;
		class243.anInt2542 = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]) * -174092741;
		Class430.method6876(class243, (byte) 77);
		if (-1 == class243.anInt2675 * -927924265 && !class240.aBool2394)
			Class207.method3844(class243.anInt2504 * -254728301, -1552427419);
	}

	static final void method5812(Class665 class665, byte i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = 1618747603 * class243.anInt2634;
	}

	static final void method5813(Class665 class665, short i) {
		int i_3_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class527_Sub8_Sub12 class527_sub8_sub12 = Class387.method6441((byte) 0);
		if (class527_sub8_sub12 != null) {
			boolean bool = class527_sub8_sub12.method18314(i_3_ >> 28 & 0x3, i_3_ >> 14 & 0x3fff, i_3_ & 0x3fff, Class666.anIntArray8556, (short) -15289);
			if (bool)
				Class217.method3973(Class666.anIntArray8556[1], Class666.anIntArray8556[2], 408882802);
		}
	}

	static final void method5814(Class665 class665, int i) {
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		Class610.method10114(string, true, (short) 5690);
	}

	static final void method5815(Class665 class665, short i) {
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		long l = Class546.method9056(-1984115578);
		if (0L == l)
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 5;
		else
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = Class399.method6523(l, string, (byte) -112);
	}
}
