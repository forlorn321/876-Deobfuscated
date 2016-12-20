/* Class485 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.net.MalformedURLException;
import java.net.URL;

public class Class485 {
	static Class485 aClass485_5452 = new Class485(0, false);
	public static Class485 aClass485_5453 = new Class485(1, false);
	static Class485 aClass485_5454 = new Class485(2, false);
	static Class485 aClass485_5455 = new Class485(3, false);
	static Class485 aClass485_5456 = new Class485(4, false);
	public boolean aBool5457;
	static Class485 aClass485_5458;
	static Class485 aClass485_5459 = new Class485(5, true);
	static Class485 aClass485_5460;
	int anInt5461;
	static Class485 aClass485_5462;
	static String aString5463;

	static {
		aClass485_5458 = new Class485(6, true);
		aClass485_5462 = new Class485(7, true);
		aClass485_5460 = new Class485(8, true);
	}

	Class485(int i, boolean bool) {
		anInt5461 = i * -353025843;
		aBool5457 = bool;
	}

	static final void method7955(Class665 class665, int i) {
		class665.anInt8526 -= 102380841;
		int i_0_ = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		Class245.aClass226_2698.method4203(i_0_, 1769813785);
	}

	static final void method7956(Class665 class665, byte i) {
		int i_1_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		if (i_1_ != Class204.aClass527_Sub31_2213.aClass700_Sub34_10599.method17253(-2018843157)) {
			Class204.aClass527_Sub31_2213.method16350((Class204.aClass527_Sub31_2213.aClass700_Sub34_10599), i_1_, -232958347);
			Class631.method10465(-1381981500);
			client.aBool11020 = false;
		}
	}

	public static final void method7957(Class243[] class243s, int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, boolean bool, int i_9_) {
		Class402.aClass180_4150.method3132(i_2_, i_3_, i_4_, i_5_);
		for (int i_10_ = 0; i_10_ < class243s.length; i_10_++) {
			Class243 class243 = class243s[i_10_];
			if (class243 != null && (i == -1774688479 * class243.anInt2536 || (i == -1412584499 && client.aClass243_11150 == class243))) {
				int i_11_;
				if (-1 == i_8_) {
					client.aRectangleArray11239[client.anInt11260 * 195456631].setBounds(i_6_ + class243.anInt2634 * 1618747603, class243.anInt2512 * -71358053 + i_7_, -1054537975 * class243.anInt2511, class243.anInt2514 * -1386504031);
					i_11_ = (client.anInt11260 += 1400490823) * 195456631 - 1;
				} else
					i_11_ = i_8_;
				class243.anInt2652 = 812714295 * i_11_;
				class243.anInt2657 = client.anInt11019 * -567353491;
				if (!client.method17449(class243)) {
					if (0 != class243.anInt2528 * -2084214243)
						Class551.method9133(class243, 1520832557);
					int i_12_ = 1618747603 * class243.anInt2634 + i_6_;
					int i_13_ = -71358053 * class243.anInt2512 + i_7_;
					int i_14_ = 942931881 * class243.anInt2662;
					if (client.aBool11199 && ((client.method17815(class243).anInt10520 * -2105107355) != 0 || 0 == class243.anInt2501 * -270144907) && i_14_ > 127)
						i_14_ = 127;
					if (class243 == client.aClass243_11150) {
						if (i != -1412584499 && ((-1281262299 * Class243.anInt2474 == class243.anInt2604 * -128350231) || (class243.anInt2604 * -128350231 == 1866237161 * Class243.anInt2676) || (client.method17815(class243).method16259(649768947) && (633613451 * Class243.anInt2475 != (class243.anInt2604 * -128350231))))) {
							Class219.aClass243Array2304 = class243s;
							Class156.anInt1721 = i_6_ * 1592819563;
							Class187.anInt2120 = -30348159 * i_7_;
							continue;
						}
						if (client.aBool11217 && client.aBool11209) {
							int i_15_ = Class534.aClass553_7213.method9158(-1412060454);
							int i_16_ = Class534.aClass553_7213.method9159(1998735123);
							i_15_ -= client.anInt11164 * 277626839;
							i_16_ -= 1103297349 * client.anInt11207;
							if (i_15_ < client.anInt11210 * -2045434633)
								i_15_ = -2045434633 * client.anInt11210;
							if (i_15_ + class243.anInt2511 * -1054537975 > (-2045434633 * client.anInt11210 + client.anInt11225 * -860353037))
								i_15_ = (-860353037 * client.anInt11225 + client.anInt11210 * -2045434633 - -1054537975 * class243.anInt2511);
							if (i_16_ < 1754568453 * client.anInt11107)
								i_16_ = client.anInt11107 * 1754568453;
							if (-1386504031 * class243.anInt2514 + i_16_ > (1318918147 * client.anInt11131 + client.anInt11107 * 1754568453))
								i_16_ = (1754568453 * client.anInt11107 + client.anInt11131 * 1318918147 - class243.anInt2514 * -1386504031);
							if (client.method17815(class243).method16259(1140566300))
								Class554_Sub1.method16829(i_15_, i_16_, -1054537975 * class243.anInt2511, class243.anInt2514 * -1386504031, (byte) 3);
							if (class243.anInt2604 * -128350231 != Class243.anInt2475 * 633613451) {
								i_12_ = i_15_;
								i_13_ = i_16_;
							}
						}
						if (class243.anInt2604 * -128350231 == Class243.anInt2676 * 1866237161)
							i_14_ = 128;
					}
					int i_17_;
					int i_18_;
					int i_19_;
					int i_20_;
					if (2 == class243.anInt2501 * -270144907) {
						i_17_ = i_2_;
						i_18_ = i_3_;
						i_19_ = i_4_;
						i_20_ = i_5_;
					} else {
						int i_21_ = i_12_ + -1054537975 * class243.anInt2511;
						int i_22_ = i_13_ + class243.anInt2514 * -1386504031;
						if (class243.anInt2501 * -270144907 == 9) {
							i_21_++;
							i_22_++;
						}
						i_17_ = i_12_ > i_2_ ? i_12_ : i_2_;
						i_18_ = i_13_ > i_3_ ? i_13_ : i_3_;
						i_19_ = i_21_ < i_4_ ? i_21_ : i_4_;
						i_20_ = i_22_ < i_5_ ? i_22_ : i_5_;
					}
					if (i_17_ < i_19_ && i_18_ < i_20_) {
						if (0 != class243.anInt2528 * -2084214243) {
							if ((-2084214243 * class243.anInt2528 == 1043781351 * Class243.anInt2529) || (-1428659499 * Class243.anInt2478 == -2084214243 * class243.anInt2528)) {
								if (client.aBool10996) {
									Class402.aClass180_4150.method3165();
									Class378.method6391(i_12_, i_13_, -1054537975 * class243.anInt2511, class243.anInt2514 * -1386504031, (-1428659499 * Class243.anInt2478 == -2084214243 * class243.anInt2528), (short) -11891);
									Class451.method7295(i_11_, i_17_, i_18_, i_19_, i_20_, i_12_, i_13_, 222848867);
									Class402.aClass180_4150.method3127();
									Class402.aClass180_4150.method3132(i_2_, i_3_, i_4_, i_5_);
									client.aBoolArray11310[i_11_] = true;
								}
								continue;
							}
							if ((-248770281 * Class243.anInt2479 == -2084214243 * class243.anInt2528) && 3 == client.anInt11080 * -1481292237) {
								if (class243.anInt2501 * -270144907 != 5 || (class243.method4524((Class402.aClass180_4150), 708326095) != null)) {
									Class624.method10333((Class402.aClass180_4150), class243, i_12_, i_13_, -560284799);
									Class402.aClass180_4150.method3132(i_2_, i_3_, i_4_, i_5_);
								}
								continue;
							}
							if (Class243.anInt2586 * 190019777 == -2084214243 * class243.anInt2528) {
								Class146.method2403(Class402.aClass180_4150, i_12_, i_13_, class243, 29539226);
								continue;
							}
							if (Class243.anInt2628 * 274623639 == -2084214243 * class243.anInt2528) {
								Class430.method6872(Class402.aClass180_4150, i_12_, i_13_, class243, (class243.anInt2527 * -192538049 % 64), 789005168);
								continue;
							}
							if (-2084214243 * class243.anInt2528 == -282724347 * Class243.anInt2480) {
								if (class243.method4524((Class402.aClass180_4150), 708326095) != null) {
									Class402.aClass180_4150.method3165();
									Class387.method6443(class243, i_12_, i_13_, 1718618507);
									Class402.aClass180_4150.method3132(i_2_, i_3_, i_4_, i_5_);
								}
								continue;
							}
							if (Class243.anInt2481 * 1025175483 == -2084214243 * class243.anInt2528) {
								Class702.method14300(Class402.aClass180_4150, i_12_, i_13_, (-1054537975 * class243.anInt2511), (class243.anInt2514 * -1386504031), -1968962193);
								client.aBoolArray11310[i_11_] = true;
								Class402.aClass180_4150.method3132(i_2_, i_3_, i_4_, i_5_);
								continue;
							}
							if (-2084214243 * class243.anInt2528 == 469295705 * Class243.anInt2482) {
								Class527_Sub8.method16061(Class402.aClass180_4150, i_12_, i_13_, -1054537975 * class243.anInt2511, -1386504031 * class243.anInt2514, 1589631675);
								client.aBoolArray11310[i_11_] = true;
								Class402.aClass180_4150.method3132(i_2_, i_3_, i_4_, i_5_);
								continue;
							}
							if (class243.anInt2528 * -2084214243 == -12461793 * Class243.anInt2635) {
								if (client.aBool11022 || client.aBool11023) {
									Class15.method738(i_12_, i_13_, class243, (byte) -10);
									client.aBoolArray11310[i_11_] = true;
								}
								continue;
							}
							if (class243.anInt2528 * -2084214243 == 1965610929 * Class243.anInt2613) {
								Class147 class147 = Class682.method13909(1631123081);
								if (null != class147) {
									int i_23_ = i_4_ - i_2_;
									int i_24_ = i_5_ - i_3_;
									float f = (float) i_23_ / (float) i_24_;
									float f_25_ = ((float) class147.method2407() / (float) class147.method2424());
									int i_26_;
									int i_27_;
									if (f < f_25_) {
										i_26_ = i_23_;
										i_27_ = (int) ((float) i_23_ / f_25_);
									} else {
										i_26_ = (int) (f_25_ * (float) i_24_);
										i_27_ = i_24_;
									}
									int i_28_ = i_2_ + (i_23_ - i_26_) / 2;
									int i_29_ = i_3_ + (i_24_ - i_27_) / 2;
									class147.method2418(i_28_, i_29_, i_26_, i_27_);
								}
								continue;
							}
							if (class243.anInt2528 * -2084214243 == -1805927601 * Class243.anInt2489) {
								if (Class274.method5129(1854039959) && Class457.method7445((byte) -3))
									Class37.method1144(i_2_, i_3_, i_4_, i_5_, 1529836402);
								continue;
							}
						}
						if (class243.anInt2501 * -270144907 == 0) {
							if (Class243.anInt2538 * -1584185899 == class243.anInt2528 * -2084214243) {
								Class402.aClass180_4150.method3165();
								client.aClass509_11072.method8397(1902183608).method10271(client.aClass509_11072, -1531523137);
								Class402.aClass180_4150.method3369(i_12_, i_13_, -1803844265 * Class289.anInt3223, -471480167 * Class611.anInt8009);
							}
							method7957(class243s, class243.anInt2504 * -254728301, i_17_, i_18_, i_19_, i_20_, i_12_ - 32398549 * class243.anInt2523, i_13_ - 114452147 * class243.anInt2524, i_11_, bool, 765284435);
							if (class243.aClass243Array2666 != null)
								method7957(class243.aClass243Array2666, class243.anInt2504 * -254728301, i_17_, i_18_, i_19_, i_20_, (i_12_ - class243.anInt2523 * 32398549), (i_13_ - 114452147 * class243.anInt2524), i_11_, bool, 710211016);
							Class527_Sub41 class527_sub41 = ((Class527_Sub41) (client.aClass14_11276.method709((long) (class243.anInt2504 * -254728301))));
							if (class527_sub41 != null)
								Class97.method1746(class527_sub41.anInt10752 * 1307137747, i_17_, i_18_, i_19_, i_20_, i_12_ - class243.anInt2523 * 32398549, i_13_ - 114452147 * class243.anInt2524, i_11_, -2037419024);
							if (-1584185899 * Class243.anInt2538 == class243.anInt2528 * -2084214243) {
								if (Class402.aClass180_4150.method3196()) {
									Class402.aClass180_4150.method3195(class243.anInt2511 * -1054537975, -1386504031 * class243.anInt2514);
									if (9 == client.anInt11048 * -1927019389)
										Class683.method13913(i_12_, i_13_, class243.anInt2511 * -1054537975, class243.anInt2514 * -1386504031, -597338225);
								}
								if (-1481292237 * client.anInt11080 == 4) {
									int i_30_ = client.anInt11087 * 1045538329;
									int i_31_ = -1039669227 * client.anInt11212;
									int i_32_ = -1043858031 * client.anInt11089;
									int i_33_ = client.anInt11090 * -1099371351;
									if (client.anInt11019 < -1829126123 * client.anInt11086) {
										float f = (1.0F * (float) (client.anInt11019 - (844357585 * (client.anInt11085))) / (float) ((-1829126123 * client.anInt11086) - (844357585 * (client.anInt11085))));
										i_30_ = (int) (((1.0F - f) * (float) ((Class668.anInt8567) * -2053037931)) + f * (float) (1045538329 * (client.anInt11087)));
										i_31_ = (int) (f * (float) (-1039669227 * (client.anInt11212)) + ((float) ((Class331_Sub3.anInt10073) * -1632335595) * (1.0F - f)));
										i_32_ = (int) (((float) ((client.anInt11089) * -1043858031) * f) + ((1.0F - f) * (float) ((Class547.anInt7268) * 1395960043)));
										i_33_ = (int) (f * (float) (-1099371351 * (client.anInt11090)) + ((float) ((Class650.anInt8377) * -319541825) * (1.0F - f)));
									}
									if (i_30_ > 0)
										Class402.aClass180_4150.method3174(i_17_, i_18_, i_19_ - i_17_, i_20_ - i_18_, (i_30_ << 24 | i_31_ << 16 | i_32_ << 8 | i_33_), 506975749);
								}
							}
							Class402.aClass180_4150.method3132(i_2_, i_3_, i_4_, i_5_);
						}
						if (client.aBoolArray11254[i_11_] || client.anInt11256 * -1631091049 > 1) {
							if (3 == class243.anInt2501 * -270144907) {
								if (0 == i_14_) {
									if (class243.aBool2483)
										Class402.aClass180_4150.method3348(i_12_, i_13_, class243.anInt2511 * -1054537975, class243.anInt2514 * -1386504031, (~0xffffff | (-192538049 * class243.anInt2527)), 0);
									else
										Class402.aClass180_4150.method3134(i_12_, i_13_, -1054537975 * class243.anInt2511, -1386504031 * class243.anInt2514, ~0xffffff | (class243.anInt2527 * -192538049), 0);
								} else if (class243.aBool2483)
									Class402.aClass180_4150.method3348(i_12_, i_13_, class243.anInt2511 * -1054537975, class243.anInt2514 * -1386504031, (255 - (i_14_ & 0xff) << 24 | (class243.anInt2527 * -192538049 & 0xffffff)), 1);
								else
									Class402.aClass180_4150.method3134(i_12_, i_13_, class243.anInt2511 * -1054537975, -1386504031 * class243.anInt2514, (255 - (i_14_ & 0xff) << 24 | (-192538049 * class243.anInt2527 & 0xffffff)), 1);
							} else if (4 == class243.anInt2501 * -270144907) {
								int i_34_ = 255 - (i_14_ & 0xff);
								if (0 != i_34_) {
									Class174 class174 = (class243.method4516(Class211.aClass420_2256, client.anInterface50_11053, -1294053566));
									if (null == class174) {
										if (Class243.aBool2496)
											Class430.method6876(class243, (byte) 96);
									} else {
										int i_35_ = -192538049 * class243.anInt2527;
										String string = class243.aString2578;
										if (class243.anInt2572 * -437471887 != -1) {
											Class9 class9 = ((Class9) (Class174_Sub2.aClass24_Sub17_9120.method81((-437471887 * class243.anInt2572), 1235362101)));
											string = class9.aString84;
											if (null == string)
												string = "null";
											if (((-1099072041 * class9.anInt98 == 1) || 1 != (-1109781355 * (class243.anInt2589))) && (-1 != (-1109781355 * class243.anInt2589)))
												string = new StringBuilder().append(Class232.method4330(16748608, 1360642983)).append(string).append(Class33.aString330).append(" x").append(Class15.method737((-1109781355 * (class243.anInt2589)), -372160609)).toString();
										}
										if (client.aClass243_11196 == class243) {
											string = (Class53.aClass53_681.method1290((Class144_Sub1.aClass671_8995), (byte) -10));
											i_35_ = (class243.anInt2527 * -192538049);
										}
										if (client.aBool11203)
											Class402.aClass180_4150.method3138(i_12_, i_13_, (i_12_ + (-1054537975 * class243.anInt2511)), i_13_ + (class243.anInt2514 * -1386504031));
										i_34_ <<= 24;
										if (class243.aBool2487)
											class174.method2767(string, i_12_, i_13_, (class243.anInt2511 * -1054537975), (-1386504031 * class243.anInt2514), i_34_ | i_35_, (class243.aBool2582 ? i_34_ : -1), (1184331787 * class243.anInt2580), (class243.anInt2581 * 213133865), client.aRandom11092, Class610.anInt8001, client.anIntArray11257, Class191.aClass147Array2138, null, -1557114038);
										else
											class174.method2747(string, i_12_, i_13_, (class243.anInt2511 * -1054537975), (-1386504031 * class243.anInt2514), i_34_ | i_35_, (class243.aBool2582 ? i_34_ : -1), (1184331787 * class243.anInt2580), (class243.anInt2581 * 213133865), (class243.anInt2579 * -409542683), (-1639180185 * class243.anInt2583), Class191.aClass147Array2138, null, null, 0, 0, 668265290);
										if (client.aBool11203)
											Class402.aClass180_4150.method3132(i_2_, i_3_, i_4_, i_5_);
									}
								}
							} else if (-270144907 * class243.anInt2501 == 5) {
								if (class243.anInt2630 * -700868549 >= 0)
									class243.method4520(Class84.aClass24_Sub1_815, Class189.aClass24_Sub7_2127, 1443296755).method8453(Class402.aClass180_4150, 0, i_12_, i_13_, -1054537975 * class243.anInt2511, -1386504031 * class243.anInt2514, -1884196317 * class243.anInt2660 << 3, class243.anInt2658 * 698012497 << 3, 0, 0, 908293259);
								else {
									Class147 class147;
									if (-1 != class243.anInt2572 * -437471887) {
										Class633 class633 = (class243.aBool2655 ? (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aClass633_12183) : null);
										class147 = (Class174_Sub2.aClass24_Sub17_9120.method17407(Class402.aClass180_4150, (class243.anInt2572 * -437471887), (-1109781355 * class243.anInt2589), class243.anInt2535 * 251715111, (~0xffffff | (-413972121 * class243.anInt2621)), (class243.anInt2558 * -1036615247), class633, 966881501));
									} else if (-1 != (1786579329 * class243.anInt2472)) {
										class147 = ((Class147) (client.aClass205_11306.method3787((long) (class243.anInt2472 * 1786579329))));
										if (class147 == null && !(client.aMap11307.containsKey(Integer.valueOf(class243.anInt2472 * 1786579329)))) {
											try {
												client.aMap11307.put((Integer.valueOf(1786579329 * class243.anInt2472)), (Class208_Sub13.aClass64_9933.method1446((new URL(new StringBuilder().append(client.aString11003).append("/img/image_").append((class243.anInt2472) * 1786579329).append(".png?a=").append(Class234.method4347(-1408626088)).toString())), 1135012715)));
											} catch (MalformedURLException malformedurlexception) {
												Class180.method3542(null, malformedurlexception, 1604547405);
											}
										}
									} else
										class147 = (class243.method4515(Class402.aClass180_4150, -2084326941));
									if (class147 != null) {
										int i_36_ = class147.method42();
										int i_37_ = class147.method2410();
										int i_38_ = 255 - (i_14_ & 0xff);
										if (i_38_ != 0) {
											int i_39_;
											if (-1 == (class243.anInt2527 * -192538049))
												i_39_ = 16777215;
											else {
												i_39_ = ((class243.anInt2527 * -192538049) & 0xffffff);
												if (i_39_ == 0)
													i_39_ = 16777215;
											}
											i_39_ |= i_38_ << 24;
											boolean bool_40_ = -1 != i_39_;
											if (class243.aBool2573) {
												Class402.aClass180_4150.method3138(i_12_, i_13_, (class243.anInt2511 * -1054537975) + i_12_, i_13_ + (-1386504031 * (class243.anInt2514)));
												if ((class243.anInt2533 * -2004765635) != 0) {
													int i_41_ = (((class243.anInt2511 * -1054537975) + (i_36_ - 1)) / i_36_);
													int i_42_ = (((class243.anInt2514 * -1386504031) + (i_37_ - 1)) / i_37_);
													for (int i_43_ = 0; i_43_ < i_41_; i_43_++) {
														for (int i_44_ = 0; i_44_ < i_42_; i_44_++) {
															if (bool_40_)
																class147.method2442((((float) i_36_ / 2.0F) + (float) (i_12_ + i_36_ * i_43_)), (((float) i_37_ / 2.0F) + (float) (i_37_ * i_44_ + i_13_)), 4096, (-2004765635 * (class243.anInt2533)), 0, i_39_, 1);
															else
																class147.method2473((((float) i_36_ / 2.0F) + (float) (i_12_ + i_36_ * i_43_)), (((float) i_37_ / 2.0F) + (float) (i_13_ + i_44_ * i_37_)), 4096, (-2004765635 * (class243.anInt2533)));
														}
													}
												} else if (bool_40_)
													class147.method2422(i_12_, i_13_, (class243.anInt2511 * -1054537975), (-1386504031 * (class243.anInt2514)), 0, i_39_, 1);
												else
													class147.method2421(i_12_, i_13_, (-1054537975 * (class243.anInt2511)), (class243.anInt2514 * -1386504031));
												Class402.aClass180_4150.method3132(i_2_, i_3_, i_4_, i_5_);
											} else if (bool_40_) {
												if (0 != (-2004765635 * class243.anInt2533))
													class147.method2442(((float) i_12_ + ((float) (-1054537975 * (class243.anInt2511)) / 2.0F)), (((float) (-1386504031 * (class243.anInt2514)) / 2.0F) + (float) i_13_), (class243.anInt2511 * 1349554176 / i_36_), (class243.anInt2533 * -2004765635), 0, i_39_, 1);
												else if (((-1054537975 * (class243.anInt2511)) != i_36_) || (((class243.anInt2514) * -1386504031) != i_37_))
													class147.method2419(i_12_, i_13_, (-1054537975 * (class243.anInt2511)), (-1386504031 * (class243.anInt2514)), 0, i_39_, 1);
												else
													class147.method2416(i_12_, i_13_, 0, i_39_, 1);
											} else if (0 != (-2004765635 * (class243.anInt2533)))
												class147.method2425(((float) ((class243.anInt2511) * -1054537975) / 2.0F) + (float) i_12_, ((float) ((class243.anInt2514) * -1386504031) / 2.0F) + (float) i_13_, (float) i_36_ / 2.0F, (float) i_37_ / 2.0F, (class243.anInt2511 * 1349554176 / i_36_), (-1173745664 * class243.anInt2514 / i_37_), (class243.anInt2533 * -2004765635), 1, -1, 1);
											else if ((i_36_ != (class243.anInt2511 * -1054537975)) || ((-1386504031 * class243.anInt2514) != i_37_))
												class147.method2418(i_12_, i_13_, (class243.anInt2511 * -1054537975), (class243.anInt2514 * -1386504031));
											else
												class147.method2415(i_12_, i_13_);
										}
									} else if (Class243.aBool2496)
										Class430.method6876(class243, (byte) 121);
								}
							} else if (6 == class243.anInt2501 * -270144907) {
								Class402.aClass180_4150.method3165();
								Class176 class176 = null;
								int i_45_ = 2048;
								if (0 != -1629952607 * class243.anInt2656)
									i_45_ |= 0x80000;
								int i_46_ = 0;
								if (-1 != -437471887 * class243.anInt2572) {
									Class9 class9 = ((Class9) (Class174_Sub2.aClass24_Sub17_9120.method81(class243.anInt2572 * -437471887, -247894147)));
									if (class9 != null) {
										class9 = class9.method612(((class243.anInt2589) * -1109781355), 562476233);
										class176 = (class9.method611(Class402.aClass180_4150, i_45_, 1, (class243.aBool2655 ? (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aClass633_12183) : null), class243.aClass695_2664, 0, 0, 0, 0, -1652227739));
										if (class176 != null)
											i_46_ = -class176.method2896() >> 1;
										else
											Class430.method6876(class243, (byte) 90);
									}
								} else if (-1260029751 * class243.anInt2541 == 3) {
									int i_47_ = 1538136819 * class243.anInt2542;
									if (i_47_ >= 0 && i_47_ < 2048) {
										Class640_Sub1_Sub2_Sub1_Sub2 class640_sub1_sub2_sub1_sub2 = (client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[i_47_]);
										if ((null != class640_sub1_sub2_sub1_sub2) && ((client.anInt11070 * -899375681 == i_47_) || ((Class429.method6866((class640_sub1_sub2_sub1_sub2.aString12179), -1746333520)) == (class243.anInt2543 * 1484887087)))) {
											class176 = (class243.method4518(Class402.aClass180_4150, i_45_, (Class258.aClass24_Sub2_2827), (Class587.aClass24_Sub19_7760), (Class381.aClass24_Sub9_3936), (Class174_Sub2.aClass24_Sub17_9120), (Class321.aClass24_Sub10_3551), Class671.aClass97_8584, Class671.aClass97_8584, class243.aClass695_2664, (class640_sub1_sub2_sub1_sub2.aClass633_12183), 534148456));
											if (null == class176 && Class243.aBool2496)
												Class430.method6876(class243, (byte) 106);
										}
									}
								} else if (5 == (-1260029751 * class243.anInt2541)) {
									int i_48_ = 1538136819 * class243.anInt2542;
									Class640_Sub1_Sub2_Sub1_Sub2 class640_sub1_sub2_sub1_sub2 = null;
									boolean bool_49_ = false;
									if (i_48_ >= 0 && i_48_ < 2048) {
										class640_sub1_sub2_sub1_sub2 = (client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[i_48_]);
										bool_49_ = ((class640_sub1_sub2_sub1_sub2 != null) && (i_48_ == (client.anInt11070 * -899375681) || ((Class429.method6866((class640_sub1_sub2_sub1_sub2.aString12179), 270619231)) == (class243.anInt2543 * 1484887087))));
									} else if (i_48_ == -1) {
										bool_49_ = true;
										class640_sub1_sub2_sub1_sub2 = (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937);
									} else {
										Class640_Sub1_Sub2_Sub1_Sub2 class640_sub1_sub2_sub1_sub2_50_ = ((Class640_Sub1_Sub2_Sub1_Sub2) (client.aMap11163.get(Integer.valueOf(i_48_))));
										if ((null != class640_sub1_sub2_sub1_sub2_50_) && ((class640_sub1_sub2_sub1_sub2_50_.anInt11955) * -541403241 == i_48_)) {
											bool_49_ = true;
											class640_sub1_sub2_sub1_sub2 = class640_sub1_sub2_sub1_sub2_50_;
										}
									}
									if (bool_49_ && class640_sub1_sub2_sub1_sub2 != null && (class640_sub1_sub2_sub1_sub2.aClass633_12183) != null)
										class176 = (class640_sub1_sub2_sub1_sub2.aClass633_12183.method10505(Class402.aClass180_4150, i_45_, Class258.aClass24_Sub2_2827, Class587.aClass24_Sub19_7760, Class381.aClass24_Sub9_3936, (Class174_Sub2.aClass24_Sub17_9120), Class671.aClass97_8584, Class671.aClass97_8584, class243.aClass695_2664, null, null, null, 0, true, Class443.aClass616_4922, -2072434803));
								} else if (8 == (class243.anInt2541 * -1260029751) || 9 == (-1260029751 * class243.anInt2541)) {
									Class527_Sub1 class527_sub1 = Class263.method4962(((class243.anInt2542) * 1538136819), false, (byte) 103);
									if (null != class527_sub1)
										class176 = (class527_sub1.method16014(Class402.aClass180_4150, i_45_, class243.aClass695_2664, (class243.anInt2543 * 1484887087), 9 == (class243.anInt2541 * -1260029751), (class243.aBool2655 ? (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aClass633_12183) : null), (byte) -3));
								} else if (null == class243.aClass695_2664 || !class243.aClass695_2664.method14162(-693341265)) {
									class176 = (class243.method4518(Class402.aClass180_4150, i_45_, Class258.aClass24_Sub2_2827, Class587.aClass24_Sub19_7760, Class381.aClass24_Sub9_3936, Class174_Sub2.aClass24_Sub17_9120, Class321.aClass24_Sub10_3551, Class671.aClass97_8584, Class671.aClass97_8584, null, (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aClass633_12183), 783544069));
									if (class176 == null && Class243.aBool2496)
										Class430.method6876(class243, (byte) 25);
								} else {
									class176 = (class243.method4518(Class402.aClass180_4150, i_45_, Class258.aClass24_Sub2_2827, Class587.aClass24_Sub19_7760, Class381.aClass24_Sub9_3936, Class174_Sub2.aClass24_Sub17_9120, Class321.aClass24_Sub10_3551, Class671.aClass97_8584, Class671.aClass97_8584, class243.aClass695_2664, (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aClass633_12183), 1599277776));
									if (class176 == null && Class243.aBool2496)
										Class430.method6876(class243, (byte) 68);
								}
								if (null != class176) {
									if (class243.anInt2656 * -1629952607 != 0)
										class176.method2986(class243.anInt2563 * 318146107, class243.anInt2564 * -2014153593, 1786916573 * class243.anInt2565, class243.anInt2656 * -1629952607);
									int i_51_;
									if (class243.anInt2554 * 1514038763 > 0)
										i_51_ = (((-1054537975 * class243.anInt2511) << 9) / (class243.anInt2554 * 1514038763));
									else
										i_51_ = 512;
									int i_52_;
									if (-1614541599 * class243.anInt2677 > 0)
										i_52_ = (((class243.anInt2514 * -1386504031) << 9) / (-1614541599 * class243.anInt2677));
									else
										i_52_ = 512;
									int i_53_ = (-1054537975 * class243.anInt2511 / 2 + i_12_);
									int i_54_ = i_13_ + (class243.anInt2514 * -1386504031 / 2);
									if (!class243.aBool2544) {
										i_53_ += (i_51_ * (1295566105 * class243.anInt2566) >> 9);
										i_54_ += (99975135 * class243.anInt2551 * i_52_) >> 9;
									}
									client.aClass432_11013.method6886();
									Class402.aClass180_4150.method3180(client.aClass432_11013);
									Class427 class427 = Class402.aClass180_4150.method3171();
									int i_55_ = client.aClass509_11072.method8394(-1401540116);
									int i_56_ = client.aClass509_11072.method8351(213902049);
									i_56_ += 1228419355 * class243.anInt2553;
									if (class243.aBool2556) {
										if (2 == -349191067 * Class30.anInt265) {
											if (class243.aBool2544)
												class427.method6753((float) i_53_, (float) i_54_, (float) i_51_, (float) i_52_, (Class208_Sub10.aClass296_Sub1_9923.method5390(1857175063)), (Class208_Sub10.aClass296_Sub1_9923.method5391((byte) -115)), (float) ((Class289.anInt3223) * -1803844265), (float) (-471480167 * (Class611.anInt8009)), (float) (1228419355 * (class243.anInt2553)));
											else
												class427.method6753((float) i_53_, (float) i_54_, (float) i_51_, (float) i_52_, (Class208_Sub10.aClass296_Sub1_9923.method5390(2064845612)), (Class208_Sub10.aClass296_Sub1_9923.method5391((byte) -45)), (float) ((Class289.anInt3223) * -1803844265), (float) (-471480167 * (Class611.anInt8009)), (float) (((class243.anInt2553) * 1228419355) << 2));
										} else if (class243.aBool2544)
											class427.method6753((float) i_53_, (float) i_54_, (float) i_51_, (float) i_52_, (float) i_55_, (float) i_56_, (float) (-1803844265 * (Class289.anInt3223)), (float) (-471480167 * (Class611.anInt8009)), (float) (class243.anInt2553 * 1228419355));
										else
											class427.method6753((float) i_53_, (float) i_54_, (float) i_51_, (float) i_52_, (float) i_55_, (float) i_56_, (float) (-1803844265 * (Class289.anInt3223)), (float) (Class611.anInt8009 * -471480167), (float) ((class243.anInt2553 * 1228419355) << 2));
									} else if (2 == (-349191067 * Class30.anInt265))
										class427.method6752((float) i_53_, (float) i_54_, (float) i_51_, (float) i_52_, Class208_Sub10.aClass296_Sub1_9923.method5390(1841557917), Class208_Sub10.aClass296_Sub1_9923.method5391((byte) -18), (float) (Class289.anInt3223 * -1803844265), (float) (-471480167 * Class611.anInt8009));
									else
										class427.method6752((float) i_53_, (float) i_54_, (float) i_51_, (float) i_52_, (float) i_55_, (float) i_56_, (float) (Class289.anInt3223 * -1803844265), (float) (Class611.anInt8009 * -471480167));
									Class402.aClass180_4150.method3183(class427);
									Class402.aClass180_4150.method3136(2, 0);
									if (class243.aBool2517)
										Class402.aClass180_4150.method3182(false);
									if (class243.aBool2544) {
										client.aClass432_11014.method6890(1.0F, 0.0F, 0.0F, (Class428.method6863(class243.anInt2547 * 1865797529)));
										client.aClass432_11014.method6936(0.0F, 1.0F, 0.0F, (Class428.method6863(-1514904661 * class243.anInt2548)));
										client.aClass432_11014.method6936(0.0F, 0.0F, 1.0F, (Class428.method6863(class243.anInt2549 * -1521042319)));
										client.aClass432_11014.method6896((float) (1295566105 * class243.anInt2566), (float) (class243.anInt2551 * 99975135), (float) (class243.anInt2519 * -1347015961));
									} else {
										int i_57_ = (((Class428.anIntArray4825[(class243.anInt2547 * 1865797529) << 3]) * ((1228419355 * class243.anInt2553) << 2)) >> 14);
										int i_58_ = (((Class428.anIntArray4819[(class243.anInt2547 * 1865797529) << 3]) * ((class243.anInt2553 * 1228419355) << 2)) >> 14);
										client.aClass432_11014.method6890(0.0F, 0.0F, 1.0F, (Class428.method6863(-(-1521042319 * class243.anInt2549) << 3)));
										client.aClass432_11014.method6936(0.0F, 1.0F, 0.0F, (Class428.method6863(-1514904661 * class243.anInt2548 << 3)));
										client.aClass432_11014.method6896((float) ((class243.anInt2545 * -1768842777) << 2), (float) (i_57_ + ((-124591531 * class243.anInt2546) << 2) + i_46_), (float) (i_58_ + ((class243.anInt2546 * -124591531) << 2)));
										client.aClass432_11014.method6936(1.0F, 0.0F, 0.0F, Class428.method6863(((class243.anInt2547) * 1865797529) << 3));
									}
									class243.method4519((Class402.aClass180_4150), class176, client.aClass432_11014, client.anInt11019, -1826359224);
									Class402.aClass180_4150.method3127();
									Class402.aClass180_4150.method3124(true);
									Class402.aClass180_4150.method3132(i_2_, i_3_, i_4_, i_5_);
									if (client.aBool11203)
										Class402.aClass180_4150.method3138(i_12_, i_13_, (class243.anInt2511 * -1054537975 + i_12_), (class243.anInt2514 * -1386504031 + i_13_));
									if (class243.aBool2567)
										client.aClass509_11072.method8397(-1140842720).method10254(((float) (377822519 * class243.anInt2629) / 256.0F), (float) (class243.anInt2633 * -527899429) / 256.0F, ((float) (588420361 * class243.anInt2596) / 256.0F), class243.anInt2574 * -2093783987, -1712344477 * class243.anInt2568, -1320868581 * class243.anInt2569, -700044521 * class243.anInt2550, 1052398325 * class243.anInt2575, 209387980);
									else
										client.aClass509_11072.method8397(-661369248).method10305(1168395669);
									class176.method2889(client.aClass432_11014, null, 1);
									if (!class243.aBool2556 && null != class243.aClass613_2679)
										Class402.aClass180_4150.method3179(class243.aClass613_2679.method10146());
									if (client.aBool11203)
										Class402.aClass180_4150.method3132(i_2_, i_3_, i_4_, i_5_);
									Class402.aClass180_4150.method3124(false);
									Class402.aClass180_4150.method3131();
									Class402.aClass180_4150.method3132(i_2_, i_3_, i_4_, i_5_);
									if (class243.aBool2567)
										client.aClass509_11072.method8397(1517375996).method10305(664677731);
									if (class243.aBool2517)
										Class402.aClass180_4150.method3182(true);
								}
							} else if (class243.anInt2501 * -270144907 == 9) {
								int i_59_;
								int i_60_;
								int i_61_;
								int i_62_;
								if (class243.aBool2499) {
									i_59_ = i_12_;
									i_60_ = i_13_ + (class243.anInt2514 * -1386504031);
									i_61_ = i_12_ + (class243.anInt2511 * -1054537975);
									i_62_ = i_13_;
								} else {
									i_59_ = i_12_;
									i_60_ = i_13_;
									i_61_ = i_12_ + (class243.anInt2511 * -1054537975);
									i_62_ = (class243.anInt2514 * -1386504031 + i_13_);
								}
								if (271751169 * class243.anInt2530 == 1)
									Class402.aClass180_4150.method3149(i_59_, i_60_, i_61_, i_62_, (~0xffffff | -192538049 * class243.anInt2527), 0);
								else
									Class402.aClass180_4150.method3315(i_59_, i_60_, i_61_, i_62_, (~0xffffff | class243.anInt2527 * -192538049), 271751169 * class243.anInt2530, 0);
							}
						}
					}
				}
			}
		}
	}
}
