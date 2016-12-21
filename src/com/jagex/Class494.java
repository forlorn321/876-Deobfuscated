/* Class494 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;
import java.util.List;

public class Class494 {
	public static final int anInt5538 = 0;
	public static final int anInt5539 = 3;
	public static final int anInt5540 = 8;
	public static final int anInt5541 = 1;
	public static final int anInt5542 = 2;
	public static final int anInt5543 = 5;

	Class494() throws Throwable {
		throw new Error();
	}

	static void method5989(Class167 class167, int i, int i_0_, int i_1_) {
		if (i >= 0 && i_0_ >= 0 && null != Class70.aClass443_777) {
			Class598 class598 = client.aClass515_11066.method6255(-1718737081);
			Class443 class443 = class167.method2391();
			Class22.method716(class167, -2131423477);
			class443.method5359(Class70.aClass433_779);
			class443.method5390(Class70.aClass443_777);
			class443.method5343();
			int i_2_ = i - Class70.anInt791 * 1116561127;
			int i_3_ = i_0_ - 90202433 * Class70.anInt774;
			if (client.aClass515_11066.method6249(-1671897423) != null) {
				if (!client.aBool11188 || (1686601581 * Class511.anInt6931 & 0x40) != 0) {
					int i_4_ = -1;
					int i_5_ = -1;
					float f = (2.0F * (float) i_2_ / (float) (Class70.anInt775 * 1506631003) - 1.0F);
					float f_6_ = ((float) i_3_ * 2.0F / (float) (Class70.anInt772 * 325129509) - 1.0F);
					class443.method5346(f, f_6_, -1.0F, Class70.aFloatArray787);
					float f_7_ = (Class70.aFloatArray787[0] / Class70.aFloatArray787[3]);
					float f_8_ = (Class70.aFloatArray787[1] / Class70.aFloatArray787[3]);
					float f_9_ = (Class70.aFloatArray787[2] / Class70.aFloatArray787[3]);
					class443.method5346(f, f_6_, 1.0F, Class70.aFloatArray787);
					float f_10_ = (Class70.aFloatArray787[0] / Class70.aFloatArray787[3]);
					float f_11_ = (Class70.aFloatArray787[1] / Class70.aFloatArray787[3]);
					float f_12_ = (Class70.aFloatArray787[2] / Class70.aFloatArray787[3]);
					float f_13_ = Class546.method6624(f_7_, f_8_, f_9_, f_10_, f_11_, f_12_, 4, 2009293339);
					if (f_13_ > 0.0F) {
						float f_14_ = f_10_ - f_7_;
						float f_15_ = f_12_ - f_9_;
						int i_16_ = (int) (f_7_ + f_14_ * f_13_);
						int i_17_ = (int) (f_9_ + f_15_ * f_13_);
						i_4_ = i_16_ + (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.method10874(1355242333) - 1 << 8) >> 9;
						i_5_ = i_17_ + (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.method10874(1355242333) - 1 << 8) >> 9;
						int i_18_ = (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.aByte10839);
						if (i_18_ < 3 && ((client.aClass515_11066.method6251(1833055224).aByteArrayArrayArray5154[1][i_16_ >> 9][i_17_ >> 9]) & 0x2) != 0)
							i_18_++;
					}
					if (i_4_ != -1 && i_5_ != -1) {
						if (client.aBool11188 && (1686601581 * Class511.anInt6931 & 0x40) != 0) {
							Class251 class251 = Class527.method6429((1625551467 * Class663.anInt8515), (-1059472497 * client.anInt11183), (byte) -92);
							if (class251 != null)
								Class521_Sub6.method9389(client.aString11185, new StringBuilder().append(" ").append(Class40.aString495).append(" ").toString(), 1764906975 * Class13.anInt161, 59, -1, 0L, i_4_, i_5_, true, false, (long) (i_4_ << 0 | i_5_), true, 1459200966);
							else
								Class270.method3717(-637059713);
						} else {
							if (Class532.aBool7124)
								Class521_Sub6.method9389((Class38.aClass38_438.method840(Class459.aClass664_5178, 2138110047)), "", -1, 60, -1, 0L, i_4_, i_5_, true, false, (long) (i_4_ << 0 | i_5_), true, 2103785516);
							Class521_Sub6.method9389(Class689.aString8692, "", (client.anInt11035 * -1869983847), 23, -1, 0L, i_4_, i_5_, true, false, (long) (i_4_ << 0 | i_5_), true, 1306789397);
						}
					}
				}
				Class564 class564 = (client.aClass515_11066.method6249(1640438818).aClass564_7477);
				int i_19_ = i;
				int i_20_ = i_0_;
				List list = class564.aList7586;
				Iterator iterator = list.iterator();
				while (iterator.hasNext()) {
					Class563 class563 = (Class563) iterator.next();
					if ((client.aBool11197 || ((Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.aByte10839) == class563.aClass649_Sub1_7582.aByte10839)) && class563.method6867(class167, i_19_, i_20_, (byte) 8)) {
						boolean bool = false;
						boolean bool_21_ = false;
						int i_22_;
						int i_23_;
						if (class563.aClass649_Sub1_7582 instanceof Class649_Sub1_Sub5) {
							i_22_ = ((Class649_Sub1_Sub5) class563.aClass649_Sub1_7582).aShort11867;
							i_23_ = ((Class649_Sub1_Sub5) class563.aClass649_Sub1_7582).aShort11865;
						} else {
							Class436 class436 = (class563.aClass649_Sub1_7582.method7837().aClass436_4823);
							i_22_ = (int) class436.aFloat4850 >> 9;
							i_23_ = (int) class436.aFloat4853 >> 9;
						}
						if (class563.aClass649_Sub1_7582 instanceof Class649_Sub1_Sub5_Sub1_Sub2) {
							Class649_Sub1_Sub5_Sub1_Sub2 class649_sub1_sub5_sub1_sub2 = ((Class649_Sub1_Sub5_Sub1_Sub2) class563.aClass649_Sub1_7582);
							int i_24_ = class649_sub1_sub5_sub1_sub2.method10874(1355242333);
							Class436 class436 = (class649_sub1_sub5_sub1_sub2.method7837().aClass436_4823);
							if (((i_24_ & 0x1) == 0 && 0 == ((int) class436.aFloat4850 & 0x1ff) && ((int) class436.aFloat4853 & 0x1ff) == 0) || (1 == (i_24_ & 0x1) && 256 == ((int) class436.aFloat4850 & 0x1ff) && 256 == ((int) class436.aFloat4853 & 0x1ff))) {
								int i_25_ = ((int) class436.aFloat4850 - (class649_sub1_sub5_sub1_sub2.method10874(1355242333) - 1 << 8));
								int i_26_ = ((int) class436.aFloat4853 - (class649_sub1_sub5_sub1_sub2.method10874(1355242333) - 1 << 8));
								for (int i_27_ = 0; i_27_ < client.anInt11053 * -664631943; i_27_++) {
									Class536_Sub13 class536_sub13 = ((Class536_Sub13) (client.aClass4_11050.method556((long) client.anIntArray11211[i_27_])));
									if (class536_sub13 != null) {
										Class649_Sub1_Sub5_Sub1_Sub1 class649_sub1_sub5_sub1_sub1 = ((Class649_Sub1_Sub5_Sub1_Sub1) class536_sub13.anObject10468);
										if ((client.anInt11014 != (class649_sub1_sub5_sub1_sub1.anInt11897) * -1388995997) && (class649_sub1_sub5_sub1_sub1.aBool11894)) {
											Class436 class436_28_ = (class649_sub1_sub5_sub1_sub1.method7837().aClass436_4823);
											int i_29_ = ((int) (class436_28_.aFloat4850) - (((class649_sub1_sub5_sub1_sub1.aClass296_12174.anInt3272) * 830254667 - 1) << 8));
											int i_30_ = ((int) (class436_28_.aFloat4853) - (((class649_sub1_sub5_sub1_sub1.aClass296_12174.anInt3272) * 830254667 - 1) << 8));
											if (i_29_ >= i_25_ && ((830254667 * (class649_sub1_sub5_sub1_sub1.aClass296_12174.anInt3272)) <= ((class649_sub1_sub5_sub1_sub2.method10874(1355242333)) - (i_29_ - i_25_ >> 9))) && i_30_ >= i_26_ && ((class649_sub1_sub5_sub1_sub1.aClass296_12174.anInt3272) * 830254667 <= ((class649_sub1_sub5_sub1_sub2.method10874(1355242333)) - (i_30_ - i_26_ >> 9)))) {
												Class11.method620(class649_sub1_sub5_sub1_sub1, ((class563.aClass649_Sub1_7582.aByte10839) != (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.aByte10839)), (byte) 1);
												class649_sub1_sub5_sub1_sub1.anInt11897 = (client.anInt11014 * 604354379);
											}
										}
									}
								}
								int i_31_ = -1482773169 * Class95.anInt1156;
								int[] is = Class95.anIntArray1157;
								for (int i_32_ = 0; i_32_ < i_31_; i_32_++) {
									Class649_Sub1_Sub5_Sub1_Sub2 class649_sub1_sub5_sub1_sub2_33_ = (client.aClass649_Sub1_Sub5_Sub1_Sub2Array11155[is[i_32_]]);
									if ((null != class649_sub1_sub5_sub1_sub2_33_) && ((-1388995997 * (class649_sub1_sub5_sub1_sub2_33_.anInt11897)) != client.anInt11014) && (class649_sub1_sub5_sub1_sub2 != class649_sub1_sub5_sub1_sub2_33_) && (class649_sub1_sub5_sub1_sub2_33_.aBool11894)) {
										Class436 class436_34_ = (class649_sub1_sub5_sub1_sub2_33_.method7837().aClass436_4823);
										int i_35_ = ((int) class436_34_.aFloat4850 - ((class649_sub1_sub5_sub1_sub2_33_.method10874(1355242333) - 1) << 8));
										int i_36_ = ((int) class436_34_.aFloat4853 - ((class649_sub1_sub5_sub1_sub2_33_.method10874(1355242333) - 1) << 8));
										if (i_35_ >= i_25_ && (class649_sub1_sub5_sub1_sub2_33_.method10874(1355242333) <= (class649_sub1_sub5_sub1_sub2.method10874(1355242333) - (i_35_ - i_25_ >> 9))) && i_36_ >= i_26_ && (class649_sub1_sub5_sub1_sub2_33_.method10874(1355242333) <= (class649_sub1_sub5_sub1_sub2.method10874(1355242333) - (i_36_ - i_26_ >> 9)))) {
											Class451.method5433(class649_sub1_sub5_sub1_sub2_33_, ((Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.aByte10839) != (class563.aClass649_Sub1_7582.aByte10839)), 1593427808);
											class649_sub1_sub5_sub1_sub2_33_.anInt11897 = (604354379 * client.anInt11014);
										}
									}
								}
							}
							if ((class649_sub1_sub5_sub1_sub2.anInt11897 * -1388995997) == client.anInt11014)
								continue;
							Class451.method5433(class649_sub1_sub5_sub1_sub2, (class563.aClass649_Sub1_7582.aByte10839 != (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.aByte10839)), 1446684254);
							class649_sub1_sub5_sub1_sub2.anInt11897 = 604354379 * client.anInt11014;
						}
						if (class563.aClass649_Sub1_7582 instanceof Class649_Sub1_Sub5_Sub1_Sub1) {
							Class649_Sub1_Sub5_Sub1_Sub1 class649_sub1_sub5_sub1_sub1 = ((Class649_Sub1_Sub5_Sub1_Sub1) class563.aClass649_Sub1_7582);
							if (null != (class649_sub1_sub5_sub1_sub1.aClass296_12174)) {
								Class436 class436 = (class649_sub1_sub5_sub1_sub1.method7837().aClass436_4823);
								if (((830254667 * (class649_sub1_sub5_sub1_sub1.aClass296_12174.anInt3272) & 0x1) == 0 && (((int) class436.aFloat4850 & 0x1ff) == 0) && (((int) class436.aFloat4853 & 0x1ff) == 0)) || (1 == (((class649_sub1_sub5_sub1_sub1.aClass296_12174.anInt3272) * 830254667) & 0x1) && (((int) class436.aFloat4850 & 0x1ff) == 256) && (((int) class436.aFloat4853 & 0x1ff) == 256))) {
									int i_37_ = ((int) class436.aFloat4850 - (((830254667 * (class649_sub1_sub5_sub1_sub1.aClass296_12174.anInt3272)) - 1) << 8));
									int i_38_ = ((int) class436.aFloat4853 - (((830254667 * (class649_sub1_sub5_sub1_sub1.aClass296_12174.anInt3272)) - 1) << 8));
									for (int i_39_ = 0; (i_39_ < client.anInt11053 * -664631943); i_39_++) {
										Class536_Sub13 class536_sub13 = ((Class536_Sub13) (client.aClass4_11050.method556((long) client.anIntArray11211[i_39_])));
										if (class536_sub13 != null) {
											Class649_Sub1_Sub5_Sub1_Sub1 class649_sub1_sub5_sub1_sub1_40_ = ((Class649_Sub1_Sub5_Sub1_Sub1) (class536_sub13.anObject10468));
											if (((-1388995997 * (class649_sub1_sub5_sub1_sub1_40_.anInt11897)) != client.anInt11014) && (class649_sub1_sub5_sub1_sub1 != class649_sub1_sub5_sub1_sub1_40_) && (class649_sub1_sub5_sub1_sub1_40_.aBool11894)) {
												Class436 class436_41_ = (class649_sub1_sub5_sub1_sub1_40_.method7837().aClass436_4823);
												int i_42_ = ((int) (class436_41_.aFloat4850) - ((830254667 * (class649_sub1_sub5_sub1_sub1_40_.aClass296_12174.anInt3272)) - 1 << 8));
												int i_43_ = ((int) (class436_41_.aFloat4853) - (((class649_sub1_sub5_sub1_sub1_40_.aClass296_12174.anInt3272) * 830254667) - 1 << 8));
												if (i_42_ >= i_37_ && ((830254667 * (class649_sub1_sub5_sub1_sub1_40_.aClass296_12174.anInt3272)) <= (((class649_sub1_sub5_sub1_sub1.aClass296_12174.anInt3272) * 830254667) - (i_42_ - i_37_ >> 9))) && i_43_ >= i_38_ && ((830254667 * (class649_sub1_sub5_sub1_sub1_40_.aClass296_12174.anInt3272)) <= (((class649_sub1_sub5_sub1_sub1.aClass296_12174.anInt3272) * 830254667) - (i_43_ - i_38_ >> 9)))) {
													Class11.method620(class649_sub1_sub5_sub1_sub1_40_, ((Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.aByte10839) != (class563.aClass649_Sub1_7582.aByte10839)), (byte) -48);
													class649_sub1_sub5_sub1_sub1_40_.anInt11897 = (604354379 * (client.anInt11014));
												}
											}
										}
									}
									int i_44_ = -1482773169 * Class95.anInt1156;
									int[] is = Class95.anIntArray1157;
									for (int i_45_ = 0; i_45_ < i_44_; i_45_++) {
										Class649_Sub1_Sub5_Sub1_Sub2 class649_sub1_sub5_sub1_sub2 = (client.aClass649_Sub1_Sub5_Sub1_Sub2Array11155[is[i_45_]]);
										if ((null != class649_sub1_sub5_sub1_sub2) && (client.anInt11014 != (class649_sub1_sub5_sub1_sub2.anInt11897) * -1388995997) && (class649_sub1_sub5_sub1_sub2.aBool11894)) {
											Class436 class436_46_ = (class649_sub1_sub5_sub1_sub2.method7837().aClass436_4823);
											int i_47_ = ((int) (class436_46_.aFloat4850) - ((class649_sub1_sub5_sub1_sub2.method10874(1355242333)) - 1 << 8));
											int i_48_ = ((int) (class436_46_.aFloat4853) - ((class649_sub1_sub5_sub1_sub2.method10874(1355242333)) - 1 << 8));
											if (i_47_ >= i_37_ && (class649_sub1_sub5_sub1_sub2.method10874(1355242333) <= ((830254667 * (class649_sub1_sub5_sub1_sub1.aClass296_12174.anInt3272)) - (i_47_ - i_37_ >> 9))) && i_48_ >= i_38_ && (class649_sub1_sub5_sub1_sub2.method10874(1355242333) <= ((class649_sub1_sub5_sub1_sub1.aClass296_12174.anInt3272) * 830254667 - (i_48_ - i_38_ >> 9)))) {
												Class451.method5433(class649_sub1_sub5_sub1_sub2, ((class563.aClass649_Sub1_7582.aByte10839) != (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.aByte10839)), 1913292698);
												class649_sub1_sub5_sub1_sub2.anInt11897 = (604354379 * client.anInt11014);
											}
										}
									}
								}
								if (client.anInt11014 == (-1388995997 * (class649_sub1_sub5_sub1_sub1.anInt11897)))
									continue;
								Class11.method620(class649_sub1_sub5_sub1_sub1, (class563.aClass649_Sub1_7582.aByte10839 != (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.aByte10839)), (byte) -49);
								class649_sub1_sub5_sub1_sub1.anInt11897 = 604354379 * client.anInt11014;
							}
						}
						if (class563.aClass649_Sub1_7582 instanceof Class649_Sub1_Sub1_Sub1) {
							int i_49_ = i_22_ + 1858049507 * class598.anInt7839;
							int i_50_ = i_23_ + 1479112045 * class598.anInt7840;
							Class536_Sub9 class536_sub9 = ((Class536_Sub9) (client.aClass4_11170.method556((long) ((class563.aClass649_Sub1_7582.aByte10839) << 28 | i_50_ << 14 | i_49_))));
							if (class536_sub9 != null) {
								int i_51_ = 0;
								Class536_Sub6 class536_sub6 = ((Class536_Sub6) class536_sub9.aClass708_10433.method8309(2096815466));
								while (null != class536_sub6) {
									Class1 class1 = ((Class1) (Class111.aClass34_Sub13_1391.method70((class536_sub6.anInt10419 * 1696543099), (byte) 51)));
									int i_52_;
									if (class1.aBool84)
										i_52_ = class1.anInt40 * 676567643;
									else if (class1.aBool37)
										i_52_ = (Class331_Sub2.aClass621_10048.anInt8103) * -1020331067;
									else
										i_52_ = 696751511 * (Class331_Sub2.aClass621_10048.anInt8102);
									if (client.aBool11188 && ((class563.aClass649_Sub1_7582.aByte10839) == (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.aByte10839))) {
										Class73 class73 = ((Class73) (-1 != (Class173_Sub1.anInt9384 * -4715005) ? (Class207.aClass34_Sub22_2244.method70((Class173_Sub1.anInt9384 * -4715005), (byte) 45)) : null));
										if (0 != ((Class511.anInt6931 * 1686601581) & 0x1) && (class73 == null || ((class1.method510((Class173_Sub1.anInt9384 * -4715005), (1566477951 * class73.anInt803), (byte) 96)) != (class73.anInt803 * 1566477951))))
											Class521_Sub6.method9389(client.aString11185, new StringBuilder().append(client.aString11186).append(" ").append(Class40.aString495).append(" ").append(Class264.method3680(i_52_, -1753577563)).append(class1.aString44).toString(), 1764906975 * Class13.anInt161, 17, -1, (long) (1696543099 * (class536_sub6.anInt10419)), i_22_, i_23_, true, false, (long) i_51_, false, 950404063);
									}
									if ((Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.aByte10839) == (class563.aClass649_Sub1_7582.aByte10839)) {
										String[] strings = class1.aStringArray38;
										for (int i_53_ = strings.length - 1; i_53_ >= 0; i_53_--) {
											if (strings[i_53_] != null) {
												int i_54_ = 0;
												int i_55_ = (1600879063 * client.anInt11203);
												if (0 == i_53_)
													i_54_ = 18;
												if (1 == i_53_)
													i_54_ = 19;
												if (i_53_ == 2)
													i_54_ = 20;
												if (3 == i_53_)
													i_54_ = 21;
												if (4 == i_53_)
													i_54_ = 22;
												if (5 == i_53_)
													i_54_ = 1004;
												int i_56_ = (class1.method511(i_53_, 1294189286));
												if (i_56_ != -1)
													i_55_ = i_56_;
												Class521_Sub6.method9389(strings[i_53_], new StringBuilder().append(Class264.method3680(i_52_, -1251111124)).append(class1.aString44).toString(), i_55_, i_54_, -1, (long) (1696543099 * (class536_sub6.anInt10419)), i_22_, i_23_, true, false, (long) i_51_, false, 876987344);
											}
										}
									}
									class536_sub6 = ((Class536_Sub6) class536_sub9.aClass708_10433.method8312(-736689254));
									i_51_++;
								}
							}
						}
						if (class563.aClass649_Sub1_7582 instanceof Interface59) {
							Interface59 interface59 = (Interface59) class563.aClass649_Sub1_7582;
							Class612 class612 = ((Class612) (client.aClass515_11066.method6280(-1073841494).method70(interface59.method373((byte) -50), (byte) 48)));
							if (null != class612.anIntArray7988)
								class612 = class612.method7293((Class465_Sub1.aClass96_10352), (Class465_Sub1.aClass96_10352), (byte) 37);
							if (class612 != null) {
								if (client.aBool11188 && (class563.aClass649_Sub1_7582.aByte10839 == (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.aByte10839))) {
									Class73 class73 = ((Class73) (-1 != (-4715005 * Class173_Sub1.anInt9384) ? (Class207.aClass34_Sub22_2244.method70((-4715005 * Class173_Sub1.anInt9384), (byte) -26)) : null));
									if (0 != (Class511.anInt6931 * 1686601581 & 0x4) && (null == class73 || ((class612.method7290((Class173_Sub1.anInt9384 * -4715005), (1566477951 * class73.anInt803), 410724759)) != (class73.anInt803 * 1566477951))))
										Class521_Sub6.method9389(client.aString11185, new StringBuilder().append(client.aString11186).append(" ").append(Class40.aString495).append(" ").append(Class264.method3680(65535, -1337871131)).append(class612.aString7935).toString(), Class13.anInt161 * 1764906975, 2, -1, Class26.method735(interface59, i_22_, i_23_, (byte) 2), i_22_, i_23_, true, false, (long) interface59.hashCode(), false, 124886324);
								}
								if (class563.aClass649_Sub1_7582.aByte10839 == (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.aByte10839)) {
									String[] strings = class612.aStringArray7966;
									if (null != strings) {
										for (int i_57_ = strings.length - 1; i_57_ >= 0; i_57_--) {
											if (null != strings[i_57_]) {
												int i_58_ = 0;
												int i_59_ = (1600879063 * client.anInt11203);
												if (0 == i_57_)
													i_58_ = 3;
												if (1 == i_57_)
													i_58_ = 4;
												if (2 == i_57_)
													i_58_ = 5;
												if (3 == i_57_)
													i_58_ = 6;
												if (4 == i_57_)
													i_58_ = 1001;
												if (i_57_ == 5)
													i_58_ = 1002;
												int i_60_ = (class612.method7297(i_57_, 2135222422));
												if (i_60_ != -1)
													i_59_ = i_60_;
												Class521_Sub6.method9389(strings[i_57_], new StringBuilder().append(Class264.method3680(65535, -2071503749)).append(class612.aString7935).toString(), i_59_, i_58_, -1, (Class26.method735(interface59, i_22_, i_23_, (byte) 2)), i_22_, i_23_, true, false, (long) interface59.hashCode(), false, 133071362);
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	static final void method5990(Class668 class668, int i) {
		int i_61_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		Class251 class251 = Class264.method3678(i_61_, -689214737);
		Class234 class234 = Class463.aClass234Array5227[i_61_ >> 16];
		Class390.method4856(class251, class234, true, 0, class668, (byte) -37);
	}

	static final void method5991(Class668 class668, int i) {
		int i_62_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class465_Sub1.aClass96_10352.method1301(i_62_, 539620176);
	}

	static final void method5992(Class668 class668, int i) {
		Class205_Sub4.method9057((byte) 1);
	}

	static Class79[] method5993(int i) {
		return new Class79[] { Class79.aClass79_827, Class79.aClass79_851, Class79.aClass79_849, Class79.aClass79_852, Class79.aClass79_843, Class79.aClass79_835, Class79.aClass79_825, Class79.aClass79_830, Class79.aClass79_854, Class79.aClass79_832, Class79.aClass79_837, Class79.aClass79_838, Class79.aClass79_853, Class79.aClass79_840, Class79.aClass79_842, Class79.aClass79_828, Class79.aClass79_841, Class79.aClass79_833, Class79.aClass79_824, Class79.aClass79_829, Class79.aClass79_839,
				Class79.aClass79_850, Class79.aClass79_846, Class79.aClass79_847, Class79.aClass79_845, Class79.aClass79_844, Class79.aClass79_836, Class79.aClass79_834, Class79.aClass79_848, Class79.aClass79_856, Class79.aClass79_826 };
	}
}
