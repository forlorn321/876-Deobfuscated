/* Class618 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class PlayerStat {
	
	int baseLevel;
	PlayerSkill aClass630_8084;
	boolean aBool8085;
	int experience = 0;
	int level;
	
	static final int MAXIMUM_XP = 2000000000;
	static int sceneY;
	static NativeSprite aClass143_8090;
	static Class2 aClass2_8091;

	public int getExperience() {
		return -209628249 * experience;
	}

	public int getVisibleXp(AccountType accountType) {
		if (accountType == AccountType.FREE && aClass630_8084.method7505() && aClass630_8084.method7517()) {
			int i_0_ = aClass630_8084.method7506(781063856);
			if (!aBool8085)
				i_0_ /= 10;
			if (experience * -209628249 > i_0_)
				return i_0_;
		}
		return experience * -209628249;
	}

	public int getBaseLevel() {
		return 251044957 * baseLevel;
	}

	public int getVisibleBaseLevel(AccountType accountType) {
		if (AccountType.FREE == accountType && aClass630_8084.method7505() && aClass630_8084.method7517()) {
			int i_1_ = aClass630_8084.method7503(-325590966);
			if (baseLevel * 251044957 > i_1_)
				return i_1_;
		}
		return baseLevel * 251044957;
	}

	public void method7376(int i, int i_2_) {
		level = i * 1008270269;
	}

	void method7377(int i) {
		if (aBool8085)
			baseLevel = aClass630_8084.method7510(experience * -209628249) * -2106830859;
		else
			baseLevel = aClass630_8084.method7508(-209628249 * experience) * -2106830859;
	}

	public PlayerStat(PlayerSkill class630, boolean bool) {
		baseLevel = -2106830859;
		level = 1008270269;
		aClass630_8084 = class630;
		aBool8085 = bool;
	}

	public void method7380(int i, byte i_3_) {
		experience = i * -1087233001;
		if (experience * -209628249 < 0)
			experience = 0;
		else if (aBool8085 && experience * -209628249 > 2000000000)
			experience = 648039424;
		else if (!aBool8085 && experience * -209628249 > 200000000)
			experience = 494300672;
		method7377(-1781844922);
	}

	public int getLevel() {
		return level * 1475188629;
	}

	public static void method7388(Class536_Sub42 class536_sub42, int i) {
		QuestTypeDecoder.method3753(class536_sub42, 500000, 2130981033);
	}

	static final void method7389(Class668 class668, int i) {
		int i_4_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		IComponentDefinitions class251 = Class264.getIComponentDefinitions(i_4_);
		Class234 class234 = Class463.aClass234Array5227[i_4_ >> 16];
		Class315.method4210(class251, class234, class668, -25382400);
	}

	static final void method7390(Class668 class668, byte i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		IComponentDefinitions class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class99.method1326(class251, class234, class668, -1918680727);
	}

	static final void method7391(Class668 class668, byte i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = ClientSetting.aClass536_Sub40_8843.bloomSetting.method10204(1867269829) == 1 ? 1 : 0;
	}
}
