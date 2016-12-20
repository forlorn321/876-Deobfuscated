/* Class565 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

class Class565 implements Runnable {
	Class358_Sub1 this$0;
	static Class687 aClass687_7578;

	public void method9492() {
		try {
			while (!this$0.aBool10124) {
				HashMap hashmap = this$0.method15792((byte) 65);
				Iterator iterator = hashmap.keySet().iterator();
				while (iterator.hasNext()) {
					Class485 class485 = (Class485) iterator.next();
					if (!class485.aBool5457) {
						Class494[] class494s = (Class494[]) hashmap.get(class485);
						for (int i = 0; i < class494s.length; i++)
							class494s[i].method8016((byte) 1);
					}
				}
				Class518.method8635(10L);
			}
		} catch (Exception exception) {
			Class180.method3542(null, exception, 1604547405);
			exception.printStackTrace();
		}
	}

	public void run() {
		try {
			while (!this$0.aBool10124) {
				HashMap hashmap = this$0.method15792((byte) 7);
				Iterator iterator = hashmap.keySet().iterator();
				while (iterator.hasNext()) {
					Class485 class485 = (Class485) iterator.next();
					if (!class485.aBool5457) {
						Class494[] class494s = (Class494[]) hashmap.get(class485);
						for (int i = 0; i < class494s.length; i++)
							class494s[i].method8016((byte) 1);
					}
				}
				Class518.method8635(10L);
			}
		} catch (Exception exception) {
			Class180.method3542(null, exception, 1604547405);
			exception.printStackTrace();
		}
	}

	Class565(Class358_Sub1 class358_sub1) {
		this$0 = class358_sub1;
	}

	public void method9493() {
		try {
			while (!this$0.aBool10124) {
				HashMap hashmap = this$0.method15792((byte) -36);
				Iterator iterator = hashmap.keySet().iterator();
				while (iterator.hasNext()) {
					Class485 class485 = (Class485) iterator.next();
					if (!class485.aBool5457) {
						Class494[] class494s = (Class494[]) hashmap.get(class485);
						for (int i = 0; i < class494s.length; i++)
							class494s[i].method8016((byte) 1);
					}
				}
				Class518.method8635(10L);
			}
		} catch (Exception exception) {
			Class180.method3542(null, exception, 1604547405);
			exception.printStackTrace();
		}
	}

	public static boolean method9494(byte i) {
		if (Class498.aString5584.startsWith("win")) {
			String string = "msvcr110.dll";
			String string_0_ = "msvcp110.dll";
			String[] strings = { string, string_0_ };
			String string_1_ = System.getenv("WINDIR");
			if (string_1_ == "")
				return false;
			for (int i_2_ = 0; i_2_ < strings.length; i_2_++) {
				File file = new File(new StringBuilder().append(string_1_).append("\\system32\\").append(strings[i_2_]).toString());
				if (!file.exists() || file.isDirectory())
					return false;
			}
			return true;
		}
		if (Class498.aString5584.startsWith("mac")) {
			boolean bool;
			try {
				Process process = Runtime.getRuntime().exec("ps -few");
				BufferedReader bufferedreader = (new BufferedReader(new InputStreamReader(process.getInputStream())));
				do {
					boolean bool_3_;
					try {
						int i_4_ = process.waitFor();
						if (0 == i_4_)
							break;
						bool_3_ = false;
					} catch (InterruptedException interruptedexception) {
						return false;
					}
					return bool_3_;
				} while (false);
				boolean bool_5_ = false;
				while_43_: do {
					String string;
					do {
						if ((string = bufferedreader.readLine()) == null)
							break while_43_;
					} while (string.toLowerCase().indexOf("soundflowerbed") == -1);
					bool_5_ = true;
				} while (false);
				bufferedreader.close();
				bool = bool_5_;
			} catch (Exception exception) {
				return false;
			}
			return bool;
		}
		return false;
	}

	static final void method9495(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = 0;
	}

	static void method9496(long l) {
		Class85.aCalendar816.setTime(new Date(l));
	}

	static void method9497(Class180 class180, int i, int i_6_, int i_7_) {
		if (i >= 0 && i_6_ >= 0 && null != Class35.aClass427_362) {
			Class592 class592 = client.aClass509_11072.method8283((short) 3379);
			Class427 class427 = class180.method3171();
			Class100.method1771(class180, 1364842018);
			class427.method6784(Class35.aClass432_355);
			class427.method6751(Class35.aClass427_362);
			class427.method6839();
			int i_8_ = i - 1078888103 * Class35.anInt333;
			int i_9_ = i_6_ - -2006477931 * Class35.anInt359;
			if (client.aClass509_11072.method8314(1710696753) != null) {
				if (!client.aBool11188 || 0 != (-1182072537 * Class477.anInt5388 & 0x40)) {
					int i_10_ = -1;
					int i_11_ = -1;
					float f = (2.0F * (float) i_8_ / (float) (Class35.anInt360 * -434019135) - 1.0F);
					float f_12_ = ((float) i_9_ * 2.0F / (float) (-652091803 * Class35.anInt377) - 1.0F);
					class427.method6773(f, f_12_, -1.0F, Class35.aFloatArray369);
					float f_13_ = (Class35.aFloatArray369[0] / Class35.aFloatArray369[3]);
					float f_14_ = (Class35.aFloatArray369[1] / Class35.aFloatArray369[3]);
					float f_15_ = (Class35.aFloatArray369[2] / Class35.aFloatArray369[3]);
					class427.method6773(f, f_12_, 1.0F, Class35.aFloatArray369);
					float f_16_ = (Class35.aFloatArray369[0] / Class35.aFloatArray369[3]);
					float f_17_ = (Class35.aFloatArray369[1] / Class35.aFloatArray369[3]);
					float f_18_ = (Class35.aFloatArray369[2] / Class35.aFloatArray369[3]);
					float f_19_ = Class595.method9890(f_13_, f_14_, f_15_, f_16_, f_17_, f_18_, 4, (short) 255);
					if (f_19_ > 0.0F) {
						float f_20_ = f_16_ - f_13_;
						float f_21_ = f_18_ - f_15_;
						int i_22_ = (int) (f_20_ * f_19_ + f_13_);
						int i_23_ = (int) (f_21_ * f_19_ + f_15_);
						i_10_ = i_22_ + (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.method18564(-1642352357) - 1 << 8) >> 9;
						i_11_ = i_23_ + (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.method18564(-1859278433) - 1 << 8) >> 9;
						int i_24_ = (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aByte10864);
						if (i_24_ < 3 && ((client.aClass509_11072.method8359(1997483699).aByteArrayArrayArray5354[1][i_22_ >> 9][i_23_ >> 9]) & 0x2) != 0)
							i_24_++;
					}
					if (i_10_ != -1 && i_11_ != -1) {
						if (client.aBool11188 && ((-1182072537 * Class477.anInt5388 & 0x40) != 0)) {
							Class243 class243 = Class447.method7260((847840847 * Class275.anInt3157), (968228363 * client.anInt11078), 421135491);
							if (null != class243)
								Class687.method13961(client.aString11191, new StringBuilder().append(" ").append(Class33.aString326).append(" ").toString(), Class634.anInt8296 * -1312689413, 59, -1, 0L, i_10_, i_11_, true, false, (long) (i_10_ << 0 | i_11_), true, (byte) -39);
							else
								Class700.method14291(-2049760180);
						} else {
							if (Class619.aBool8115)
								Class687.method13961((Class53.aClass53_661.method1290((Class144_Sub1.aClass671_8995), (byte) -6)), "", -1, 60, -1, 0L, i_10_, i_11_, true, false, (long) (i_10_ << 0 | i_11_), true, (byte) -92);
							Class687.method13961(Class485.aString5463, "", (-1908960989 * client.anInt11178), 23, -1, 0L, i_10_, i_11_, true, false, (long) (i_10_ << 0 | i_11_), true, (byte) -42);
						}
					}
				}
				Class546 class546 = (client.aClass509_11072.method8314(-1508126261).aClass546_7480);
				int i_25_ = i;
				int i_26_ = i_6_;
				List list = class546.aList7264;
				Iterator iterator = list.iterator();
				while (iterator.hasNext()) {
					Class558 class558 = (Class558) iterator.next();
					if ((client.aBool11168 || (class558.aClass640_Sub1_7532.aByte10864 == (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aByte10864))) && class558.method9433(class180, i_25_, i_26_, 255816258)) {
						boolean bool = false;
						boolean bool_27_ = false;
						int i_28_;
						int i_29_;
						if (class558.aClass640_Sub1_7532 instanceof Class640_Sub1_Sub2) {
							i_28_ = ((Class640_Sub1_Sub2) class558.aClass640_Sub1_7532).aShort11775;
							i_29_ = ((Class640_Sub1_Sub2) class558.aClass640_Sub1_7532).aShort11771;
						} else {
							Class442 class442 = (class558.aClass640_Sub1_7532.method10637().aClass442_4927);
							i_28_ = (int) class442.aFloat4918 >> 9;
							i_29_ = (int) class442.aFloat4919 >> 9;
						}
						if (class558.aClass640_Sub1_7532 instanceof Class640_Sub1_Sub2_Sub1_Sub2) {
							Class640_Sub1_Sub2_Sub1_Sub2 class640_sub1_sub2_sub1_sub2 = ((Class640_Sub1_Sub2_Sub1_Sub2) class558.aClass640_Sub1_7532);
							int i_30_ = class640_sub1_sub2_sub1_sub2.method18564(-1429081361);
							Class442 class442 = (class640_sub1_sub2_sub1_sub2.method10637().aClass442_4927);
							if (((i_30_ & 0x1) == 0 && ((int) class442.aFloat4918 & 0x1ff) == 0 && 0 == ((int) class442.aFloat4919 & 0x1ff)) || (1 == (i_30_ & 0x1) && (((int) class442.aFloat4918 & 0x1ff) == 256) && 256 == ((int) class442.aFloat4919 & 0x1ff))) {
								int i_31_ = ((int) class442.aFloat4918 - (class640_sub1_sub2_sub1_sub2.method18564(-1780347465) - 1 << 8));
								int i_32_ = ((int) class442.aFloat4919 - (class640_sub1_sub2_sub1_sub2.method18564(-1971570199) - 1 << 8));
								for (int i_33_ = 0; i_33_ < -1599561389 * client.anInt11059; i_33_++) {
									Class527_Sub26 class527_sub26 = ((Class527_Sub26) (client.aClass14_10989.method709((long) client.anIntArray11021[i_33_])));
									if (class527_sub26 != null) {
										Class640_Sub1_Sub2_Sub1_Sub1 class640_sub1_sub2_sub1_sub1 = ((Class640_Sub1_Sub2_Sub1_Sub1) class527_sub26.anObject10522);
										if (((1982712259 * (class640_sub1_sub2_sub1_sub1.anInt11896)) != client.anInt11019) && (class640_sub1_sub2_sub1_sub1.aBool11893)) {
											Class442 class442_34_ = (class640_sub1_sub2_sub1_sub1.method10637().aClass442_4927);
											int i_35_ = ((int) (class442_34_.aFloat4918) - (((class640_sub1_sub2_sub1_sub1.aClass295_12168.anInt3342) * 897343531 - 1) << 8));
											int i_36_ = ((int) (class442_34_.aFloat4919) - (((class640_sub1_sub2_sub1_sub1.aClass295_12168.anInt3342) * 897343531 - 1) << 8));
											if (i_35_ >= i_31_ && ((897343531 * (class640_sub1_sub2_sub1_sub1.aClass295_12168.anInt3342)) <= ((class640_sub1_sub2_sub1_sub2.method18564(-1726655784)) - (i_35_ - i_31_ >> 9))) && i_36_ >= i_32_ && ((897343531 * (class640_sub1_sub2_sub1_sub1.aClass295_12168.anInt3342)) <= ((class640_sub1_sub2_sub1_sub2.method18564(-1504318137)) - (i_36_ - i_32_ >> 9)))) {
												Class24_Sub3.method17353(class640_sub1_sub2_sub1_sub1, ((Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aByte10864) != (class558.aClass640_Sub1_7532.aByte10864)), 1896682494);
												class640_sub1_sub2_sub1_sub1.anInt11896 = (client.anInt11019 * -1321046293);
											}
										}
									}
								}
								int i_37_ = Class105.anInt1300 * 351100807;
								int[] is = Class105.anIntArray1301;
								for (int i_38_ = 0; i_38_ < i_37_; i_38_++) {
									Class640_Sub1_Sub2_Sub1_Sub2 class640_sub1_sub2_sub1_sub2_39_ = (client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[is[i_38_]]);
									if ((null != class640_sub1_sub2_sub1_sub2_39_) && ((1982712259 * (class640_sub1_sub2_sub1_sub2_39_.anInt11896)) != client.anInt11019) && (class640_sub1_sub2_sub1_sub2 != class640_sub1_sub2_sub1_sub2_39_) && (class640_sub1_sub2_sub1_sub2_39_.aBool11893)) {
										Class442 class442_40_ = (class640_sub1_sub2_sub1_sub2_39_.method10637().aClass442_4927);
										int i_41_ = ((int) class442_40_.aFloat4918 - ((class640_sub1_sub2_sub1_sub2_39_.method18564(-1319229030)) - 1 << 8));
										int i_42_ = ((int) class442_40_.aFloat4919 - ((class640_sub1_sub2_sub1_sub2_39_.method18564(-1670170473)) - 1 << 8));
										if (i_41_ >= i_31_ && (class640_sub1_sub2_sub1_sub2_39_.method18564(-1407886365) <= ((class640_sub1_sub2_sub1_sub2.method18564(-1707437933)) - (i_41_ - i_31_ >> 9))) && i_42_ >= i_32_ && (class640_sub1_sub2_sub1_sub2_39_.method18564(-1241296213) <= ((class640_sub1_sub2_sub1_sub2.method18564(-1615997833)) - (i_42_ - i_32_ >> 9)))) {
											Class108.method1938(class640_sub1_sub2_sub1_sub2_39_, ((class558.aClass640_Sub1_7532.aByte10864) != (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aByte10864)), (byte) 1);
											class640_sub1_sub2_sub1_sub2_39_.anInt11896 = (client.anInt11019 * -1321046293);
										}
									}
								}
							}
							if (client.anInt11019 == (class640_sub1_sub2_sub1_sub2.anInt11896 * 1982712259))
								continue;
							Class108.method1938(class640_sub1_sub2_sub1_sub2, (class558.aClass640_Sub1_7532.aByte10864 != (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aByte10864)), (byte) 1);
							class640_sub1_sub2_sub1_sub2.anInt11896 = -1321046293 * client.anInt11019;
						}
						if (class558.aClass640_Sub1_7532 instanceof Class640_Sub1_Sub2_Sub1_Sub1) {
							Class640_Sub1_Sub2_Sub1_Sub1 class640_sub1_sub2_sub1_sub1 = ((Class640_Sub1_Sub2_Sub1_Sub1) class558.aClass640_Sub1_7532);
							if (class640_sub1_sub2_sub1_sub1.aClass295_12168 != null) {
								Class442 class442 = (class640_sub1_sub2_sub1_sub1.method10637().aClass442_4927);
								if ((0 == ((897343531 * (class640_sub1_sub2_sub1_sub1.aClass295_12168.anInt3342)) & 0x1) && (((int) class442.aFloat4918 & 0x1ff) == 0) && (((int) class442.aFloat4919 & 0x1ff) == 0)) || (((897343531 * (class640_sub1_sub2_sub1_sub1.aClass295_12168.anInt3342)) & 0x1) == 1 && (((int) class442.aFloat4918 & 0x1ff) == 256) && 256 == ((int) class442.aFloat4919 & 0x1ff))) {
									int i_43_ = ((int) class442.aFloat4918 - (((897343531 * (class640_sub1_sub2_sub1_sub1.aClass295_12168.anInt3342)) - 1) << 8));
									int i_44_ = ((int) class442.aFloat4919 - (((897343531 * (class640_sub1_sub2_sub1_sub1.aClass295_12168.anInt3342)) - 1) << 8));
									for (int i_45_ = 0; (i_45_ < client.anInt11059 * -1599561389); i_45_++) {
										Class527_Sub26 class527_sub26 = ((Class527_Sub26) (client.aClass14_10989.method709((long) client.anIntArray11021[i_45_])));
										if (class527_sub26 != null) {
											Class640_Sub1_Sub2_Sub1_Sub1 class640_sub1_sub2_sub1_sub1_46_ = ((Class640_Sub1_Sub2_Sub1_Sub1) (class527_sub26.anObject10522));
											if (((1982712259 * (class640_sub1_sub2_sub1_sub1_46_.anInt11896)) != client.anInt11019) && (class640_sub1_sub2_sub1_sub1 != class640_sub1_sub2_sub1_sub1_46_) && (class640_sub1_sub2_sub1_sub1_46_.aBool11893)) {
												Class442 class442_47_ = (class640_sub1_sub2_sub1_sub1_46_.method10637().aClass442_4927);
												int i_48_ = ((int) (class442_47_.aFloat4918) - ((897343531 * (class640_sub1_sub2_sub1_sub1_46_.aClass295_12168.anInt3342)) - 1 << 8));
												int i_49_ = ((int) (class442_47_.aFloat4919) - (((class640_sub1_sub2_sub1_sub1_46_.aClass295_12168.anInt3342) * 897343531) - 1 << 8));
												if (i_48_ >= i_43_ && ((class640_sub1_sub2_sub1_sub1_46_.aClass295_12168.anInt3342) * 897343531 <= ((897343531 * (class640_sub1_sub2_sub1_sub1.aClass295_12168.anInt3342)) - (i_48_ - i_43_ >> 9))) && i_49_ >= i_44_ && ((class640_sub1_sub2_sub1_sub1_46_.aClass295_12168.anInt3342) * 897343531 <= ((897343531 * (class640_sub1_sub2_sub1_sub1.aClass295_12168.anInt3342)) - (i_49_ - i_44_ >> 9)))) {
													Class24_Sub3.method17353(class640_sub1_sub2_sub1_sub1_46_, ((Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aByte10864) != (class558.aClass640_Sub1_7532.aByte10864)), 2125073562);
													class640_sub1_sub2_sub1_sub1_46_.anInt11896 = (-1321046293 * (client.anInt11019));
												}
											}
										}
									}
									int i_50_ = 351100807 * Class105.anInt1300;
									int[] is = Class105.anIntArray1301;
									for (int i_51_ = 0; i_51_ < i_50_; i_51_++) {
										Class640_Sub1_Sub2_Sub1_Sub2 class640_sub1_sub2_sub1_sub2 = (client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[is[i_51_]]);
										if ((null != class640_sub1_sub2_sub1_sub2) && (client.anInt11019 != (1982712259 * (class640_sub1_sub2_sub1_sub2.anInt11896))) && (class640_sub1_sub2_sub1_sub2.aBool11893)) {
											Class442 class442_52_ = (class640_sub1_sub2_sub1_sub2.method10637().aClass442_4927);
											int i_53_ = ((int) (class442_52_.aFloat4918) - ((class640_sub1_sub2_sub1_sub2.method18564(-1885449414)) - 1 << 8));
											int i_54_ = ((int) (class442_52_.aFloat4919) - ((class640_sub1_sub2_sub1_sub2.method18564(-1361428927)) - 1 << 8));
											if (i_53_ >= i_43_ && ((class640_sub1_sub2_sub1_sub2.method18564(-1216868704)) <= ((class640_sub1_sub2_sub1_sub1.aClass295_12168.anInt3342) * 897343531 - (i_53_ - i_43_ >> 9))) && i_54_ >= i_44_ && ((class640_sub1_sub2_sub1_sub2.method18564(-1372530863)) <= ((class640_sub1_sub2_sub1_sub1.aClass295_12168.anInt3342) * 897343531 - (i_54_ - i_44_ >> 9)))) {
												Class108.method1938(class640_sub1_sub2_sub1_sub2, ((class558.aClass640_Sub1_7532.aByte10864) != (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aByte10864)), (byte) 1);
												class640_sub1_sub2_sub1_sub2.anInt11896 = (-1321046293 * client.anInt11019);
											}
										}
									}
								}
								if ((class640_sub1_sub2_sub1_sub1.anInt11896 * 1982712259) == client.anInt11019)
									continue;
								Class24_Sub3.method17353(class640_sub1_sub2_sub1_sub1, ((Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aByte10864) != (class558.aClass640_Sub1_7532.aByte10864)), 2132567957);
								class640_sub1_sub2_sub1_sub1.anInt11896 = -1321046293 * client.anInt11019;
							}
						}
						if (class558.aClass640_Sub1_7532 instanceof Class640_Sub1_Sub5_Sub1) {
							int i_55_ = i_28_ + class592.anInt7798 * 153371143;
							int i_56_ = class592.anInt7799 * -2029646807 + i_29_;
							Class527_Sub12 class527_sub12 = ((Class527_Sub12) (client.aClass14_11253.method709((long) ((class558.aClass640_Sub1_7532.aByte10864) << 28 | i_56_ << 14 | i_55_))));
							if (class527_sub12 != null) {
								int i_57_ = 0;
								Class527_Sub22 class527_sub22 = ((Class527_Sub22) class527_sub12.aClass694_10444.method14152((byte) -67));
								while (class527_sub22 != null) {
									Class9 class9 = ((Class9) (Class174_Sub2.aClass24_Sub17_9120.method81((class527_sub22.anInt10494 * -875637783), -1341053758)));
									int i_58_;
									if (class9.aBool148)
										i_58_ = -1658832325 * class9.anInt149;
									else if (class9.aBool122)
										i_58_ = 24784665 * (Class271.aClass624_3128.anInt8157);
									else
										i_58_ = -894656341 * (Class271.aClass624_3128.anInt8158);
									if (client.aBool11188 && ((class558.aClass640_Sub1_7532.aByte10864) == (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aByte10864))) {
										Class80 class80 = ((Class80) ((163079961 * Class665.anInt8550 != -1) ? (Class679.aClass24_Sub21_8628.method81((163079961 * Class665.anInt8550), 1824979784)) : null));
										if ((Class477.anInt5388 * -1182072537 & 0x1) != 0 && (class80 == null || ((class9.method620((Class665.anInt8550 * 163079961), (class80.anInt804 * 780718929), (byte) 0)) != (class80.anInt804 * 780718929))))
											Class687.method13961(client.aString11191, new StringBuilder().append(client.aString11192).append(" ").append(Class33.aString326).append(" ").append(Class232.method4330(i_58_, 1389274228)).append(class9.aString84).toString(), (-1312689413 * Class634.anInt8296), 17, -1, (long) ((class527_sub22.anInt10494) * -875637783), i_28_, i_29_, true, false, (long) i_57_, false, (byte) -19);
									}
									if ((Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aByte10864) == (class558.aClass640_Sub1_7532.aByte10864)) {
										String[] strings = class9.aStringArray133;
										for (int i_59_ = strings.length - 1; i_59_ >= 0; i_59_--) {
											if (strings[i_59_] != null) {
												int i_60_ = 0;
												int i_61_ = (client.anInt11186 * -1277515419);
												if (i_59_ == 0)
													i_60_ = 18;
												if (i_59_ == 1)
													i_60_ = 19;
												if (i_59_ == 2)
													i_60_ = 20;
												if (i_59_ == 3)
													i_60_ = 21;
												if (i_59_ == 4)
													i_60_ = 22;
												if (i_59_ == 5)
													i_60_ = 1004;
												int i_62_ = (class9.method621(i_59_, 56847906));
												if (i_62_ != -1)
													i_61_ = i_62_;
												Class687.method13961(strings[i_59_], new StringBuilder().append(Class232.method4330(i_58_, 1395434196)).append(class9.aString84).toString(), i_61_, i_60_, -1, (long) ((class527_sub22.anInt10494) * -875637783), i_28_, i_29_, true, false, (long) i_57_, false, (byte) -23);
											}
										}
									}
									class527_sub22 = ((Class527_Sub22) class527_sub12.aClass694_10444.method14091(2012874389));
									i_57_++;
								}
							}
						}
						if (class558.aClass640_Sub1_7532 instanceof Interface62) {
							Interface62 interface62 = (Interface62) class558.aClass640_Sub1_7532;
							Class602 class602 = ((Class602) (client.aClass509_11072.method8310(1279846944).method81(interface62.method64(-973838810), 1991282611)));
							if (class602.anIntArray7929 != null)
								class602 = class602.method9962((Class671.aClass97_8584), (Class671.aClass97_8584), 1137928779);
							if (null != class602) {
								if (client.aBool11188 && ((Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aByte10864) == (class558.aClass640_Sub1_7532.aByte10864))) {
									Class80 class80 = ((Class80) ((Class665.anInt8550 * 163079961 != -1) ? (Class679.aClass24_Sub21_8628.method81(163079961 * Class665.anInt8550, 844454154)) : null));
									if ((-1182072537 * Class477.anInt5388 & 0x4) != 0 && (null == class80 || ((class602.method9963((163079961 * Class665.anInt8550), 780718929 * class80.anInt804, (byte) -22)) != (780718929 * class80.anInt804))))
										Class687.method13961(client.aString11191, new StringBuilder().append(client.aString11192).append(" ").append(Class33.aString326).append(" ").append(Class232.method4330(65535, 451647118)).append(class602.aString7871).toString(), -1312689413 * Class634.anInt8296, 2, -1, (Class700_Sub39.method17293(interface62, i_28_, i_29_, -1213690824)), i_28_, i_29_, true, false, (long) interface62.hashCode(), false, (byte) -96);
								}
								if ((Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aByte10864) == (class558.aClass640_Sub1_7532.aByte10864)) {
									String[] strings = class602.aStringArray7904;
									if (strings != null) {
										for (int i_63_ = strings.length - 1; i_63_ >= 0; i_63_--) {
											if (null != strings[i_63_]) {
												int i_64_ = 0;
												int i_65_ = (client.anInt11186 * -1277515419);
												if (i_63_ == 0)
													i_64_ = 3;
												if (1 == i_63_)
													i_64_ = 4;
												if (i_63_ == 2)
													i_64_ = 5;
												if (3 == i_63_)
													i_64_ = 6;
												if (i_63_ == 4)
													i_64_ = 1001;
												if (5 == i_63_)
													i_64_ = 1002;
												int i_66_ = (class602.method9992(i_63_, -2008540495));
												if (-1 != i_66_)
													i_65_ = i_66_;
												Class687.method13961(strings[i_63_], new StringBuilder().append(Class232.method4330(65535, 870699477)).append(class602.aString7871).toString(), i_65_, i_64_, -1, (Class700_Sub39.method17293(interface62, i_28_, i_29_, -1213690824)), i_28_, i_29_, true, false, (long) interface62.hashCode(), false, (byte) -4);
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

	public static Class527_Sub15 method9498(int i) {
		Class527_Sub15 class527_sub15 = Class295.method5336((byte) -53);
		class527_sub15.aClass414_10457 = null;
		class527_sub15.anInt10459 = 0;
		class527_sub15.buffer = new Class527_Sub38_Sub2(5000);
		return class527_sub15;
	}

	static final void method9499(Class243 class243, int i, int i_67_, Class665 class665, int i_68_) {
		if (class243.anIntArray2591 == null) {
			if (i_67_ > 0) {
				class243.aByteArrayArray2587 = new byte[11][];
				class243.aByteArrayArray2522 = new byte[11][];
				class243.anIntArray2508 = new int[11];
				class243.anIntArray2590 = new int[11];
				class243.anIntArray2591 = new int[11];
			} else
				return;
		}
		class243.anIntArray2591[i] = i_67_;
		if (i_67_ > 0)
			class243.aBool2680 = true;
		else {
			class243.aBool2680 = false;
			for (int i_69_ = 0; i_69_ < class243.aByteArrayArray2587.length; i_69_++) {
				if (null != class243.aByteArrayArray2587[i_69_] || class243.anIntArray2591[i_69_] > 0) {
					class243.aBool2680 = true;
					break;
				}
			}
		}
	}

	static final int method9500(int i, int i_70_) {
		return i < 7 ? 8 : 11;
	}
}
