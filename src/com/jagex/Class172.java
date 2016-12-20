/* Class172 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import com.jagex.twitchtv.TwitchEvent;

public abstract class Class172 {
	static int[] anIntArray1883;

	Class172() {
		/* empty */
	}

	public static void method2736(Class180 class180, long l) {
		if (-748564677 * Class585.anInt7681 != 3 && 0 != -748564677 * Class585.anInt7681) {
			if (1 == -748564677 * Class585.anInt7681) {
				if (Class585.aStringArray7685 == null || Class585.aStringArray7685.length == 0)
					throw new RuntimeException("");
				int i = 0;
				for (int i_0_ = 0; i_0_ < Class585.aStringArray7685.length; i_0_++) {
					if (null != Class585.aStringArray7685[i_0_]) {
						try {
							i += (Class234.aClass539_2374.method8993(Class585.aStringArray7685[i_0_], (byte) -83));
						} catch (Exception_Sub4 exception_sub4) {
							Class637.method10570(Class71.aClass71_783, exception_sub4.aString11364, (exception_sub4.anInt11363 * 1122887509), exception_sub4.getCause(), -1646086477);
							Class585.anInt7681 = 969840089;
							return;
						}
					} else
						i += 100;
				}
				Class585.anInt7703 = -1432363959 * (i / Class585.aStringArray7685.length);
				if (Class585.anInt7703 * 1114297849 == 100) {
					Class585.anInt7681 = Class639_Sub2.method16983(256207128) * 1754935795;
					if (2 != -748564677 * Class585.anInt7681)
						return;
				} else
					return;
			}
			TwitchEvent[] twitchevents = Class585.aTwitchTV7698.Service();
			if (twitchevents != null) {
				for (int i = 0; i < twitchevents.length; i++) {
					TwitchEvent twitchevent = twitchevents[i];
					if (null != twitchevent && Class235.method4353(twitchevent, l)) {
						Class578 class578 = twitchevent.method6561();
						if (class578 != null)
							Class390.method6467(class578.method87(), twitchevent, 1584586495);
					}
				}
			}
			if (Class585.aTwitchTV7698.IsStreaming() && (l - Class585.aLong7699 * -5842675412488605625L > Class512.aLong7008 * 2633100174167199109L)) {
				Class585.aLong7699 = l * 1221725028280924535L;
				if (class180.method3184())
					Class585.aBool7696 = true;
			}
			if (Class585.aTwitchTV7698.IsStreaming()) {
				if (l - Class585.aLong7700 * 4608545456380175315L < (long) (161905497 * Class585.anInt7690))
					Class585.anInt7702 = 823554538;
				else if (l - Class585.aLong7701 * -6495383206257305831L < (long) (161905497 * Class585.anInt7690))
					Class585.anInt7702 = -1735706379;
				else
					Class585.anInt7702 = 0;
			} else
				Class585.anInt7702 = 0;
			if ((l - Class585.aLong7710 * 1418162785997322403L > (long) (1107878885 * Class585.anInt7692)) && Class585.aTwitchTV7698.GetWebcamState() == 5) {
				Class585.aTwitchTV7698.RestartWebcamDevice();
				Class585.aLong7710 = -7609805716521092341L * l;
			}
		}
	}

	static void method2737(long[] ls, int[] is, int i, int i_1_, byte i_2_) {
		if (i < i_1_) {
			int i_3_ = (i + i_1_) / 2;
			int i_4_ = i;
			long l = ls[i_3_];
			ls[i_3_] = ls[i_1_];
			ls[i_1_] = l;
			int i_5_ = is[i_3_];
			is[i_3_] = is[i_1_];
			is[i_1_] = i_5_;
			int i_6_ = 9223372036854775807L == l ? 0 : 1;
			for (int i_7_ = i; i_7_ < i_1_; i_7_++) {
				if (ls[i_7_] < (long) (i_7_ & i_6_) + l) {
					long l_8_ = ls[i_7_];
					ls[i_7_] = ls[i_4_];
					ls[i_4_] = l_8_;
					int i_9_ = is[i_7_];
					is[i_7_] = is[i_4_];
					is[i_4_++] = i_9_;
				}
			}
			ls[i_1_] = ls[i_4_];
			ls[i_4_] = l;
			is[i_1_] = is[i_4_];
			is[i_4_] = i_5_;
			method2737(ls, is, i, i_4_ - 1, (byte) 10);
			method2737(ls, is, 1 + i_4_, i_1_, (byte) 10);
		}
	}

	static final void method2738(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = client.aBool10994 ? 1 : 0;
	}

	static final void method2739(Class665 class665, byte i) {
		Class526.method8733(class665.aClass640_Sub1_Sub5_Sub1_8540, (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]), true, (byte) -67);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = (int) client.aFloatArray11139[0];
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = (int) client.aFloatArray11139[1];
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = (int) client.aFloatArray11139[2];
	}

	static final void method2740(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = 0;
	}

	public static void method2741(int i) {
		if (!Class115.aBool1414) {
			Class42.method1180((client.aClass509_11072.method8314(1448239364).aClass561ArrayArrayArray7420), 371752361);
			if ((client.aClass509_11072.method8314(1690493738).aClass561ArrayArrayArray7437) != null)
				Class42.method1180((client.aClass509_11072.method8314(-1984440968).aClass561ArrayArrayArray7437), -1642076023);
			Class115.aBool1414 = true;
		}
	}
}
