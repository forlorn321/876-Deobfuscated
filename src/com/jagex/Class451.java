/* Class451 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class451 implements Interface75 {
	static Class451 aClass451_4944 = new Class451(0);
	int anInt4945;
	static Class451 aClass451_4946;
	static Class451 aClass451_4947 = new Class451(1);
	public static String osArchRaw;

	public int method73() {
		return 2027745769 * anInt4945;
	}

	Class451(int i) {
		anInt4945 = 380302937 * i;
	}

	static {
		aClass451_4946 = new Class451(2);
	}

	public int method12() {
		return 2027745769 * anInt4945;
	}

	public int method78() {
		return 2027745769 * anInt4945;
	}

	static final void method5429(Class668 class668, int i) {
		boolean bool = ((class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]) != 0);
		if (null != Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.aClass617_12202)
			Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.aClass617_12202.method7357(bool, 741179106);
	}

	static final void method5430(Class668 class668, short i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		IComponentDefinitions class251 = class683.aClass251_8650;
		Class475.method5743(class251, class668, (byte) 121);
	}

	static final void method5431(Class668 class668, short i) {
		String string = (String) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]);
		Class596.method7138(string, (byte) -46);
	}

	static final void method5432(Class668 class668, byte i) {
		class668.anInt8542 -= -1411037171;
		int i_0_ = class668.anIntArray8541[1867269829 * class668.anInt8542];
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = QuestTypeDecoder.method3754(i_0_, 747507598);
	}

	static void method5433(Player class649_sub1_sub5_sub1_sub2, boolean bool, int i) {
		if (Class70.anInt760 * 1780207751 < 409) {
			if (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591 == class649_sub1_sub5_sub1_sub2) {
				if (client.aBool11188 && 0 != (Class511.anInt6931 * 1686601581 & 0x10))
					Class521_Sub6.method9389(client.aString11185, new StringBuilder().append(client.aString11186).append(" ").append(Class40.aString495).append(" ").append(Class264.method3680(16777215, -2101296480)).append(Class38.aClass38_450.method840((Class459.CLIENT_PARAMS), 1791071951)).toString(), 1764906975 * Class13.anInt161, 16, -1, 0L, 0, 0, true, false, (long) (1710020215 * class649_sub1_sub5_sub1_sub2.anInt11889), false, 2007463476);
			} else {
				String string;
				if (class649_sub1_sub5_sub1_sub2.anInt12189 * -1543258759 == 0) {
					boolean bool_1_ = true;
					if (1370751447 * (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.anInt12188) != -1 && -1 != (class649_sub1_sub5_sub1_sub2.anInt12188 * 1370751447)) {
						int i_2_ = (((Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.anInt12188) * 1370751447 < (1370751447 * class649_sub1_sub5_sub1_sub2.anInt12188)) ? (1370751447 * (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.anInt12188)) : (class649_sub1_sub5_sub1_sub2.anInt12188 * 1370751447));
						int i_3_ = ((Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.anInt12186) * 611144047 - (611144047 * class649_sub1_sub5_sub1_sub2.anInt12186));
						if (i_3_ < 0)
							i_3_ = -i_3_;
						if (i_3_ > i_2_)
							bool_1_ = false;
					}
					String string_4_ = (client.aClass670_11043 == GameMode.aClass670_8575 ? Class38.aClass38_441.method840((Class459.CLIENT_PARAMS), 1852964028) : Class38.aClass38_480.method840((Class459.CLIENT_PARAMS), 1542847096));
					if (611144047 * class649_sub1_sub5_sub1_sub2.anInt12186 >= (1305068021 * class649_sub1_sub5_sub1_sub2.anInt12187))
						string = new StringBuilder().append(class649_sub1_sub5_sub1_sub2.method11085(true, (byte) 1)).append(bool_1_ ? (Class457.method5492((611144047 * (class649_sub1_sub5_sub1_sub2.anInt12186)), (611144047 * (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.anInt12186)), -1131655358)) : Class264.method3680(16777215, -1847667476)).append(Class40.aString493).append(string_4_).append(class649_sub1_sub5_sub1_sub2.anInt12186 * 611144047).append(Class40.aString494).toString();
					else
						string = new StringBuilder().append(class649_sub1_sub5_sub1_sub2.method11085(true, (byte) 1)).append(bool_1_ ? (Class457.method5492((611144047 * (class649_sub1_sub5_sub1_sub2.anInt12186)), (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.anInt12186) * 611144047, -947184453)) : Class264.method3680(16777215, -1807371686)).append(Class40.aString493).append(string_4_).append(class649_sub1_sub5_sub1_sub2.anInt12186 * 611144047).append("+")
								.append((class649_sub1_sub5_sub1_sub2.anInt12187 * 1305068021) - (class649_sub1_sub5_sub1_sub2.anInt12186 * 611144047)).append(Class40.aString494).toString();
				} else if ((class649_sub1_sub5_sub1_sub2.anInt12189 * -1543258759) == -1)
					string = class649_sub1_sub5_sub1_sub2.method11085(true, (byte) 1);
				else
					string = new StringBuilder().append(class649_sub1_sub5_sub1_sub2.method11085(true, (byte) 1)).append(Class40.aString493).append(Class38.aClass38_360.method840(Class459.CLIENT_PARAMS, 1435049222)).append(class649_sub1_sub5_sub1_sub2.anInt12189 * -1543258759).append(Class40.aString494).toString();
				boolean bool_5_ = false;
				if (null != class649_sub1_sub5_sub1_sub2.aClass617_12202 && (class649_sub1_sub5_sub1_sub2.aClass617_12202.anInt8079 * -587726343) != -1) {
					NPCDecoder class296 = ((NPCDecoder) (Class172.aClass34_Sub7_1922.method70(-587726343 * (class649_sub1_sub5_sub1_sub2.aClass617_12202.anInt8079), (byte) -2)));
					if (class296.aBool3339) {
						bool_5_ = true;
						string = ((NPCDecoder) (Class172.aClass34_Sub7_1922.method70(-587726343 * (class649_sub1_sub5_sub1_sub2.aClass617_12202.anInt8079), (byte) 35))).aString3271;
						if (1188862419 * class296.anInt3292 != 0) {
							String string_6_ = ((GameMode.aClass670_8575 == client.aClass670_11043) ? (Class38.aClass38_441.method840(Class459.CLIENT_PARAMS, 1395734488)) : (Class38.aClass38_480.method840(Class459.CLIENT_PARAMS, 2067180394)));
							string = new StringBuilder().append(string).append(Class457.method5492(class296.anInt3292 * 1188862419, (611144047 * (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.anInt12186)), -17766460)).append(Class40.aString493).append(string_6_).append(1188862419 * class296.anInt3292).append(Class40.aString494).toString();
						}
					}
				}
				if (client.aBool11188 && !bool && (Class511.anInt6931 * 1686601581 & 0x8) != 0)
					Class521_Sub6.method9389(client.aString11185, new StringBuilder().append(client.aString11186).append(" ").append(Class40.aString495).append(" ").append(Class264.method3680(16777215, -1343947721)).append(string).toString(), 1764906975 * Class13.anInt161, 15, -1, (long) (1710020215 * class649_sub1_sub5_sub1_sub2.anInt11889), 0, 0, true, false, (long) (1710020215 * class649_sub1_sub5_sub1_sub2.anInt11889), false, 1470194075);
				if (!bool) {
					for (int i_7_ = 7; i_7_ >= 0; i_7_--) {
						if (client.aStringArray11100[i_7_] != null) {
							short i_8_ = 0;
							if ((client.aClass670_11043 == GameMode.aClass670_8568) && (client.aStringArray11100[i_7_].equalsIgnoreCase(Class38.aClass38_344.method840(Class459.CLIENT_PARAMS, 1907592279)))) {
								if (Class634.aClass634_8263 == client.aClass634_11165)
									i_8_ = (short) 2000;
								else if ((Class634.aClass634_8264 == client.aClass634_11165) && ((611144047 * (class649_sub1_sub5_sub1_sub2.anInt12186)) > (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.anInt12186) * 611144047))
									i_8_ = (short) 2000;
								if ((1717228615 * (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.anInt12191)) != 0 && 0 != (class649_sub1_sub5_sub1_sub2.anInt12191) * 1717228615) {
									if ((Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.anInt12191) * 1717228615 == (1717228615 * (class649_sub1_sub5_sub1_sub2.anInt12191)))
										i_8_ = (short) 2000;
									else
										i_8_ = (short) 0;
								} else if (class649_sub1_sub5_sub1_sub2.isClanMember)
									i_8_ = (short) 2000;
							} else if (client.aBoolArray11171[i_7_])
								i_8_ = (short) 2000;
							short i_9_ = (short) (client.aShortArray11168[i_7_] + i_8_);
							int i_10_ = (client.anIntArray11169[i_7_] != -1 ? client.anIntArray11169[i_7_] : 1600879063 * client.anInt11203);
							int i_11_ = bool_5_ ? 16776960 : 16777215;
							Class521_Sub6.method9389(client.aStringArray11100[i_7_], new StringBuilder().append(Class264.method3680(i_11_, -1227918208)).append(string).toString(), i_10_, i_9_, -1, (long) ((class649_sub1_sub5_sub1_sub2.anInt11889) * 1710020215), 0, 0, true, false, (long) ((class649_sub1_sub5_sub1_sub2.anInt11889) * 1710020215), false, 1554291431);
						}
					}
				} else if (!bool_5_)
					Class521_Sub6.method9389(new StringBuilder().append(Class264.method3680(13421772, -1333680083)).append(string).toString(), "", -1, -1, 0, 0L, 0, 0, false, true, (long) (1710020215 * class649_sub1_sub5_sub1_sub2.anInt11889), false, -915906180);
				if (!bool && !bool_5_) {
					for (Class536_Sub18_Sub9 class536_sub18_sub9 = ((Class536_Sub18_Sub9) Class70.aClass708_755.method8308(1867269829)); null != class536_sub18_sub9; class536_sub18_sub9 = ((Class536_Sub18_Sub9) Class70.aClass708_755.method8311(2062265517))) {
						if (class536_sub18_sub9.anInt11718 * -517484763 == 23) {
							class536_sub18_sub9.aString11707 = new StringBuilder().append(Class264.method3680(16777215, -1172675573)).append(string).toString();
							break;
						}
					}
				}
			}
		}
	}
}
