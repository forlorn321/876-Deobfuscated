/* Class620 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;

class Class620 implements Iterator {
	public static int anInt8094;
	Class98_Sub1_Sub2 this$0;
	int anInt8095;

	public boolean method7398() {
		return 2143297539 * anInt8095 < this$0.method71(2121383467);
	}

	public Object next() {
		int i = (anInt8095 += -1826387285) * 2143297539 - 1;
		Class153_Sub2 class153_sub2 = (Class153_Sub2) this$0.aClass199_11333.method2886((long) i);
		if (class153_sub2 != null)
			return class153_sub2;
		return this$0.method10492(i, (byte) -87);
	}

	public void method7399() {
		throw new UnsupportedOperationException();
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

	public boolean hasNext() {
		return 2143297539 * anInt8095 < this$0.method71(1808106100);
	}

	public boolean method7400() {
		return 2143297539 * anInt8095 < this$0.method71(1875719971);
	}

	public Object method7401() {
		int i = (anInt8095 += -1826387285) * 2143297539 - 1;
		Class153_Sub2 class153_sub2 = (Class153_Sub2) this$0.aClass199_11333.method2886((long) i);
		if (class153_sub2 != null)
			return class153_sub2;
		return this$0.method10492(i, (byte) -6);
	}

	public Object method7402() {
		int i = (anInt8095 += -1826387285) * 2143297539 - 1;
		Class153_Sub2 class153_sub2 = (Class153_Sub2) this$0.aClass199_11333.method2886((long) i);
		if (class153_sub2 != null)
			return class153_sub2;
		return this$0.method10492(i, (byte) -35);
	}

	Class620(Class98_Sub1_Sub2 class98_sub1_sub2) {
		this$0 = class98_sub1_sub2;
	}

	static final void method7403(Class668 class668, byte i) {
		Class93.method1238(-1027770804);
	}

	public static final void method7404(Class251[] class251s, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, boolean bool, int i_7_) {
		Class677.aClass167_8609.method2369(i_0_, i_1_, i_2_, i_3_);
		for (int i_8_ = 0; i_8_ < class251s.length; i_8_++) {
			Class251 class251 = class251s[i_8_];
			if (class251 != null && (i == -1940204141 * class251.anInt2577 || (i == -1412584499 && client.aClass251_10992 == class251))) {
				int i_9_;
				if (-1 == i_6_) {
					client.aRectangleArray11249[-5823823 * client.anInt11245].setBounds(class251.anInt2571 * 1151043453 + i_4_, i_5_ + class251.anInt2572 * -712740187, -1606950689 * class251.anInt2573, class251.anInt2574 * 223822141);
					i_9_ = (client.anInt11245 += 820242001) * -5823823 - 1;
				} else
					i_9_ = i_6_;
				class251.anInt2736 = i_9_ * -1381511251;
				class251.anInt2627 = client.anInt11014 * -1535001011;
				if (!client.method10439(class251)) {
					if (0 != -1769600535 * class251.anInt2562)
						Class103.method1375(class251, 1167498537);
					int i_10_ = class251.anInt2571 * 1151043453 + i_4_;
					int i_11_ = class251.anInt2572 * -712740187 + i_5_;
					int i_12_ = class251.anInt2589 * 1425974027;
					if (client.aBool11010 && ((client.method10389(class251).anInt10469 * -512963777) != 0 || 0 == class251.anInt2728 * 1049444347) && i_12_ > 127)
						i_12_ = 127;
					if (class251 == client.aClass251_10992) {
						if (i != -1412584499 && ((class251.anInt2534 * -2010774799 == Class251.anInt2535 * -292337027) || (class251.anInt2534 * -2010774799 == Class251.anInt2617 * 10493011) || (client.method10389(class251).method9477(1157638953) && (1087226469 * Class251.anInt2634 != (-2010774799 * class251.anInt2534))))) {
							Class397.aClass251Array4115 = class251s;
							Class581.anInt7698 = i_4_ * 1551682379;
							Class512.anInt6936 = -366094201 * i_5_;
							continue;
						}
						if (client.aBool11121 && client.aBool11274) {
							int i_13_ = Class329.aClass550_3601.method6656(-937726158);
							int i_14_ = Class329.aClass550_3601.method6657(-1208707336);
							i_13_ -= -1721422785 * client.anInt11281;
							i_14_ -= client.anInt11201 * 671669755;
							if (i_13_ < client.anInt11204 * 1828303855)
								i_13_ = client.anInt11204 * 1828303855;
							if (-1606950689 * class251.anInt2573 + i_13_ > (1828303855 * client.anInt11204 + client.anInt11206 * 171675909))
								i_13_ = (1828303855 * client.anInt11204 + 171675909 * client.anInt11206 - -1606950689 * class251.anInt2573);
							if (i_14_ < 1260646355 * client.anInt11205)
								i_14_ = 1260646355 * client.anInt11205;
							if (i_14_ + class251.anInt2574 * 223822141 > (1260646355 * client.anInt11205 + 904217971 * client.anInt11207))
								i_14_ = (1260646355 * client.anInt11205 + client.anInt11207 * 904217971 - 223822141 * class251.anInt2574);
							if (client.method10389(class251).method9477(-1742526348))
								Class680.method8073(i_13_, i_14_, (-1606950689 * class251.anInt2573), (class251.anInt2574 * 223822141), (byte) 61);
							if (class251.anInt2534 * -2010774799 != Class251.anInt2634 * 1087226469) {
								i_10_ = i_13_;
								i_11_ = i_14_;
							}
						}
						if (Class251.anInt2617 * 10493011 == class251.anInt2534 * -2010774799)
							i_12_ = 128;
					}
					int i_15_;
					int i_16_;
					int i_17_;
					int i_18_;
					if (2 == class251.anInt2728 * 1049444347) {
						i_15_ = i_0_;
						i_16_ = i_1_;
						i_17_ = i_2_;
						i_18_ = i_3_;
					} else {
						int i_19_ = i_10_ + class251.anInt2573 * -1606950689;
						int i_20_ = class251.anInt2574 * 223822141 + i_11_;
						if (9 == class251.anInt2728 * 1049444347) {
							i_19_++;
							i_20_++;
						}
						i_15_ = i_10_ > i_0_ ? i_10_ : i_0_;
						i_16_ = i_11_ > i_1_ ? i_11_ : i_1_;
						i_17_ = i_19_ < i_2_ ? i_19_ : i_2_;
						i_18_ = i_20_ < i_3_ ? i_20_ : i_3_;
					}
					if (i_15_ < i_17_ && i_16_ < i_18_) {
						if (class251.anInt2562 * -1769600535 != 0) {
							if ((Class251.anInt2537 * -2049675251 == class251.anInt2562 * -1769600535) || (Class251.anInt2646 * -1686834873 == class251.anInt2562 * -1769600535)) {
								if (client.aBool11147) {
									Class677.aClass167_8609.method2084();
									Class648.method7832(i_10_, i_11_, class251.anInt2573 * -1606950689, 223822141 * class251.anInt2574, (-1686834873 * Class251.anInt2646 == -1769600535 * class251.anInt2562), 890824445);
									Class290.method3926(i_9_, i_15_, i_16_, i_17_, i_18_, i_10_, i_11_, 1572076274);
									Class677.aClass167_8609.method2047();
									Class677.aClass167_8609.method2369(i_0_, i_1_, i_2_, i_3_);
									client.aBoolArray11240[i_9_] = true;
								}
								continue;
							}
							if ((1208417731 * Class251.anInt2691 == -1769600535 * class251.anInt2562) && 3 == client.anInt11074 * 1542697723) {
								if (5 != 1049444347 * class251.anInt2728 || (class251.method3478((Class677.aClass167_8609), 492256283) != null)) {
									Class631.method7533((Class677.aClass167_8609), class251, i_10_, i_11_, 1832746197);
									Class677.aClass167_8609.method2369(i_0_, i_1_, i_2_, i_3_);
								}
								continue;
							}
							if (-1769600535 * class251.anInt2562 == -400443225 * Class251.anInt2570) {
								Class616.method7337(Class677.aClass167_8609, i_10_, i_11_, class251, (byte) -66);
								continue;
							}
							if (-1607190081 * Class251.anInt2539 == class251.anInt2562 * -1769600535) {
								Class690.method8184(Class677.aClass167_8609, i_10_, i_11_, class251, (-336626187 * class251.anInt2587 % 64), (byte) -13);
								continue;
							}
							if (class251.anInt2562 * -1769600535 == Class251.anInt2540 * 495396233) {
								if (class251.method3478((Class677.aClass167_8609), 444219950) != null) {
									Class677.aClass167_8609.method2084();
									Class301.method4095(class251, i_10_, i_11_, -1397083450);
									Class677.aClass167_8609.method2369(i_0_, i_1_, i_2_, i_3_);
								}
								continue;
							}
							if (class251.anInt2562 * -1769600535 == -628362163 * Class251.anInt2541) {
								Class471.method5717(Class677.aClass167_8609, i_10_, i_11_, (class251.anInt2573 * -1606950689), (223822141 * class251.anInt2574), -1070948127);
								client.aBoolArray11240[i_9_] = true;
								Class677.aClass167_8609.method2369(i_0_, i_1_, i_2_, i_3_);
								continue;
							}
							if (class251.anInt2562 * -1769600535 == Class251.anInt2542 * -1789268997) {
								Class141.method1714(Class677.aClass167_8609, i_10_, i_11_, (class251.anInt2573 * -1606950689), (223822141 * class251.anInt2574), -616980937);
								client.aBoolArray11240[i_9_] = true;
								Class677.aClass167_8609.method2369(i_0_, i_1_, i_2_, i_3_);
								continue;
							}
							if (Class251.anInt2685 * -1560473329 == -1769600535 * class251.anInt2562) {
								if (client.aBool11314 || client.aBool11018) {
									Class257.method3545(i_10_, i_11_, class251, (byte) -84);
									client.aBoolArray11240[i_9_] = true;
								}
								continue;
							}
							if (-1769600535 * class251.anInt2562 == Class251.anInt2548 * -1730281477) {
								Class143 class143 = Class467.method5691((byte) -9);
								if (null != class143) {
									int i_21_ = i_2_ - i_0_;
									int i_22_ = i_3_ - i_1_;
									float f = (float) i_21_ / (float) i_22_;
									float f_23_ = ((float) class143.method1720() / (float) class143.method1752());
									int i_24_;
									int i_25_;
									if (f < f_23_) {
										i_24_ = i_21_;
										i_25_ = (int) ((float) i_21_ / f_23_);
									} else {
										i_24_ = (int) ((float) i_22_ * f_23_);
										i_25_ = i_22_;
									}
									int i_26_ = i_0_ + (i_21_ - i_24_) / 2;
									int i_27_ = i_1_ + (i_22_ - i_25_) / 2;
									class143.method1724(i_26_, i_27_, i_24_, i_25_);
								}
								continue;
							}
							if (Class251.anInt2549 * 868301 == class251.anInt2562 * -1769600535) {
								if (Class187.method2780(-276166249) && Class292.method3964(1047859301))
									Class265.method3686(i_0_, i_1_, i_2_, i_3_, (byte) 4);
								continue;
							}
						}
						if (class251.anInt2728 * 1049444347 == 0) {
							if (-1544108083 * Class251.anInt2545 == class251.anInt2562 * -1769600535) {
								Class677.aClass167_8609.method2084();
								client.aClass515_11066.method6252(1796531619).method7568(client.aClass515_11066, 1907373827);
								Class677.aClass167_8609.method2114(i_10_, i_11_, Class144.anInt1679 * -1804846931, 589116499 * Class34_Sub6.anInt10965);
							}
							method7404(class251s, -1591767037 * class251.anInt2559, i_15_, i_16_, i_17_, i_18_, i_10_ - 1428895931 * class251.anInt2581, (i_11_ - class251.anInt2584 * -2092413585), i_9_, bool, -281492535);
							if (null != class251.aClass251Array2726)
								method7404(class251.aClass251Array2726, -1591767037 * class251.anInt2559, i_15_, i_16_, i_17_, i_18_, (i_10_ - class251.anInt2581 * 1428895931), i_11_ - (-2092413585 * class251.anInt2584), i_9_, bool, 2124413703);
							Class536_Sub36 class536_sub36 = ((Class536_Sub36) (client.aClass4_11008.method556((long) (class251.anInt2559 * -1591767037))));
							if (null != class536_sub36)
								Class527.method6432(class536_sub36.anInt10634 * -358726121, i_15_, i_16_, i_17_, i_18_, i_10_ - 1428895931 * class251.anInt2581, i_11_ - class251.anInt2584 * -2092413585, i_9_, -586272756);
							if (class251.anInt2562 * -1769600535 == Class251.anInt2545 * -1544108083) {
								if (Class677.aClass167_8609.method2116()) {
									Class677.aClass167_8609.method2402(class251.anInt2573 * -1606950689, 223822141 * class251.anInt2574);
									if (-708374433 * client.anInt11101 == 9)
										Class199.method2912(i_10_, i_11_, -1606950689 * class251.anInt2573, 223822141 * class251.anInt2574, (byte) -72);
								}
								if (4 == 1542697723 * client.anInt11074) {
									int i_28_ = client.anInt11213 * -2136890415;
									int i_29_ = -40562213 * client.anInt11047;
									int i_30_ = client.anInt11083 * 1374449393;
									int i_31_ = 1395989923 * client.anInt11084;
									if (client.anInt11014 < client.anInt11080 * 1849325181) {
										float f = ((float) (client.anInt11014 - (client.anInt11079 * -1385676247)) * 1.0F / (float) ((client.anInt11080 * 1849325181) - (-1385676247 * (client.anInt11079))));
										i_28_ = (int) (((1.0F - f) * (float) (-1092588535 * (Class655.anInt8496))) + (f * (float) ((client.anInt11213) * -2136890415)));
										i_29_ = (int) (((1.0F - f) * (float) ((Class628.anInt8230) * 1567933979)) + ((float) (-40562213 * (client.anInt11047)) * f));
										i_30_ = (int) (((float) (-504804425 * (Class30.anInt265)) * (1.0F - f)) + (f * (float) ((client.anInt11083) * 1374449393)));
										i_31_ = (int) ((float) (client.anInt11084 * 1395989923) * f + ((float) ((Class205_Sub8.anInt9884) * 1976065549) * (1.0F - f)));
									}
									if (i_28_ > 0)
										Class677.aClass167_8609.method2057(i_15_, i_16_, i_17_ - i_15_, i_18_ - i_16_, (i_28_ << 24 | i_29_ << 16 | i_30_ << 8 | i_31_), (short) -20225);
								}
							}
							Class677.aClass167_8609.method2369(i_0_, i_1_, i_2_, i_3_);
						}
						if (client.aBoolArray11029[i_9_] || client.anInt11016 * -176554429 > 1) {
							if (1049444347 * class251.anInt2728 == 3) {
								if (0 == i_12_) {
									if (class251.aBool2642)
										Class677.aClass167_8609.method2063(i_10_, i_11_, -1606950689 * class251.anInt2573, 223822141 * class251.anInt2574, (~0xffffff | (-336626187 * class251.anInt2587)), 0);
									else
										Class677.aClass167_8609.method2062(i_10_, i_11_, -1606950689 * class251.anInt2573, class251.anInt2574 * 223822141, ~0xffffff | (class251.anInt2587 * -336626187), 0);
								} else if (class251.aBool2642)
									Class677.aClass167_8609.method2063(i_10_, i_11_, -1606950689 * class251.anInt2573, class251.anInt2574 * 223822141, (255 - (i_12_ & 0xff) << 24 | (-336626187 * class251.anInt2587 & 0xffffff)), 1);
								else
									Class677.aClass167_8609.method2062(i_10_, i_11_, -1606950689 * class251.anInt2573, class251.anInt2574 * 223822141, (255 - (i_12_ & 0xff) << 24 | (-336626187 * class251.anInt2587 & 0xffffff)), 1);
							} else if (4 == 1049444347 * class251.anInt2728) {
								int i_32_ = 255 - (i_12_ & 0xff);
								if (i_32_ != 0) {
									Class184 class184 = (class251.method3469(Class196.aClass410_2202, client.anInterface51_11196, (byte) 1));
									if (null == class184) {
										if (Class251.aBool2724)
											Class668.method8011(class251, 263642117);
									} else {
										int i_33_ = class251.anInt2587 * -336626187;
										String string = class251.aString2638;
										if (-1484799213 * class251.anInt2711 != -1) {
											Class1 class1 = ((Class1) (Class111.aClass34_Sub13_1391.method70((class251.anInt2711 * -1484799213), (byte) 21)));
											string = class1.aString44;
											if (null == string)
												string = "null";
											if ((1 == (class1.anInt34 * -1370184373) || 1 != (-1880327077 * (class251.anInt2712))) && ((-1880327077 * class251.anInt2712) != -1))
												string = new StringBuilder().append(Class264.method3680(16748608, -1945533512)).append(string).append(Class40.aString497).append(" x").append(Class190.method2827((class251.anInt2712 * -1880327077), 1118178337)).toString();
										}
										if (class251 == client.aClass251_11057) {
											string = (Class38.aClass38_442.method840(Class459.aClass664_5178, 1733594989));
											i_33_ = (-336626187 * class251.anInt2587);
										}
										if (client.aBool11136)
											Class677.aClass167_8609.method2196(i_10_, i_11_, i_10_ + (class251.anInt2573 * -1606950689), ((223822141 * class251.anInt2574) + i_11_));
										i_32_ <<= 24;
										if (class251.aBool2608)
											class184.method2739(string, i_10_, i_11_, (class251.anInt2573 * -1606950689), (223822141 * class251.anInt2574), i_32_ | i_33_, (class251.aBool2644 ? i_32_ : -1), (-953209107 * class251.anInt2640), 18027815 * class251.anInt2641, client.aRandom11161, Class458_Sub4.anInt10337, client.anIntArray11251, Class195.aClass143Array2201, null, (byte) 0);
										else
											class184.method2744(string, i_10_, i_11_, (-1606950689 * class251.anInt2573), (class251.anInt2574 * 223822141), i_32_ | i_33_, (class251.aBool2644 ? i_32_ : -1), (-953209107 * class251.anInt2640), 18027815 * class251.anInt2641, (class251.anInt2721 * -1204882523), (796723497 * class251.anInt2643), Class195.aClass143Array2201, null, null, 0, 0, -254556702);
										if (client.aBool11136)
											Class677.aClass167_8609.method2369(i_0_, i_1_, i_2_, i_3_);
									}
								}
							} else if (class251.anInt2728 * 1049444347 == 5) {
								if (2028683203 * class251.anInt2716 >= 0)
									class251.method3472(Class459.aClass34_Sub9_5179, Class144.aClass34_Sub12_1680, (byte) -46).method6153(Class677.aClass167_8609, 0, i_10_, i_11_, class251.anInt2573 * -1606950689, 223822141 * class251.anInt2574, class251.anInt2717 * -340415797 << 3, -1504755387 * class251.anInt2718 << 3, 0, 0, (short) 8578);
								else {
									Class143 class143;
									if (-1 != class251.anInt2711 * -1484799213) {
										Class617 class617 = (class251.aBool2671 ? (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.aClass617_12202) : null);
										class143 = (Class111.aClass34_Sub13_1391.method10342(Class677.aClass167_8609, (-1484799213 * class251.anInt2711), (-1880327077 * class251.anInt2712), (1960646061 * class251.anInt2720), (~0xffffff | (1514577167 * class251.anInt2596)), (-1273595415 * class251.anInt2595), class617, -1895524453));
									} else if (class251.anInt2604 * 11093663 != -1) {
										class143 = ((Class143) (client.aClass199_11300.method2886((long) (11093663 * (class251.anInt2604)))));
										if (class143 == null && !(client.aMap11301.containsKey(Integer.valueOf(class251.anInt2604 * 11093663)))) {
											try {
												client.aMap11301.put((Integer.valueOf(class251.anInt2604 * 11093663)), (Class208.aClass60_2245.method990((new URL(new StringBuilder().append(client.aString10998).append("/img/image_").append((class251.anInt2604) * 11093663).append(".png?a=").append(Class249.method3450(1381073741)).toString())), -1124813087)));
											} catch (MalformedURLException malformedurlexception) {
												Class81.method1165(null, malformedurlexception, (byte) -92);
											}
										}
									} else
										class143 = (class251.method3484(Class677.aClass167_8609, 1796437439));
									if (class143 != null) {
										int i_34_ = class143.method12();
										int i_35_ = class143.method1785();
										int i_36_ = 255 - (i_12_ & 0xff);
										if (0 != i_36_) {
											int i_37_;
											if (-1 == (class251.anInt2587 * -336626187))
												i_37_ = 16777215;
											else {
												i_37_ = ((class251.anInt2587 * -336626187) & 0xffffff);
												if (i_37_ == 0)
													i_37_ = 16777215;
											}
											i_37_ |= i_36_ << 24;
											boolean bool_38_ = i_37_ != -1;
											if (class251.aBool2594) {
												Class677.aClass167_8609.method2196(i_10_, i_11_, i_10_ + (-1606950689 * (class251.anInt2573)), ((223822141 * class251.anInt2574) + i_11_));
												if (0 != (1548616703 * (class251.anInt2593))) {
													int i_39_ = ((i_34_ - 1 + ((class251.anInt2573) * -1606950689)) / i_34_);
													int i_40_ = (((class251.anInt2574 * 223822141) + (i_35_ - 1)) / i_35_);
													for (int i_41_ = 0; i_41_ < i_39_; i_41_++) {
														for (int i_42_ = 0; i_42_ < i_40_; i_42_++) {
															if (bool_38_)
																class143.method1736((((float) i_34_ / 2.0F) + (float) (i_34_ * i_41_ + i_10_)), (((float) i_35_ / 2.0F) + (float) (i_42_ * i_35_ + i_11_)), 4096, (1548616703 * (class251.anInt2593)), 0, i_37_, 1);
															else
																class143.method1735(((float) (i_41_ * i_34_ + i_10_) + ((float) i_34_ / 2.0F)), ((float) (i_35_ * i_42_ + i_11_) + ((float) i_35_ / 2.0F)), 4096, (1548616703 * (class251.anInt2593)));
														}
													}
												} else if (bool_38_)
													class143.method1734(i_10_, i_11_, (-1606950689 * (class251.anInt2573)), (223822141 * (class251.anInt2574)), 0, i_37_, 1);
												else
													class143.method1733(i_10_, i_11_, (-1606950689 * (class251.anInt2573)), (class251.anInt2574 * 223822141));
												Class677.aClass167_8609.method2369(i_0_, i_1_, i_2_, i_3_);
											} else if (bool_38_) {
												if ((class251.anInt2593 * 1548616703) != 0)
													class143.method1736((((float) ((class251.anInt2573) * -1606950689) / 2.0F) + (float) i_10_), ((float) i_11_ + ((float) (223822141 * (class251.anInt2574)) / 2.0F)), (class251.anInt2573 * 2114842624 / i_34_), (class251.anInt2593 * 1548616703), 0, i_37_, 1);
												else if ((i_34_ != (-1606950689 * (class251.anInt2573))) || (i_35_ != ((class251.anInt2574) * 223822141)))
													class143.method1731(i_10_, i_11_, (-1606950689 * (class251.anInt2573)), (223822141 * (class251.anInt2574)), 0, i_37_, 1);
												else
													class143.method1729(i_10_, i_11_, 0, i_37_, 1);
											} else if ((1548616703 * class251.anInt2593) != 0)
												class143.method1723(((float) i_10_ + ((float) (-1606950689 * (class251.anInt2573)) / 2.0F)), ((float) (223822141 * (class251.anInt2574)) / 2.0F) + (float) i_11_, (float) i_34_ / 2.0F, (float) i_35_ / 2.0F, (2114842624 * class251.anInt2573 / i_34_), (1947455488 * class251.anInt2574 / i_35_), (1548616703 * class251.anInt2593), 1, -1, 1);
											else if ((i_34_ != (class251.anInt2573 * -1606950689)) || (i_35_ != (223822141 * (class251.anInt2574))))
												class143.method1724(i_10_, i_11_, (class251.anInt2573 * -1606950689), (class251.anInt2574 * 223822141));
											else
												class143.method1728(i_10_, i_11_);
										}
									} else if (Class251.aBool2724)
										Class668.method8011(class251, 263642117);
								}
							} else if (1049444347 * class251.anInt2728 == 6) {
								Class677.aClass167_8609.method2084();
								Class177 class177 = null;
								int i_43_ = 2048;
								if (0 != -948134625 * class251.anInt2687)
									i_43_ |= 0x80000;
								int i_44_ = 0;
								if (-1 != class251.anInt2711 * -1484799213) {
									Class1 class1 = ((Class1) (Class111.aClass34_Sub13_1391.method70(-1484799213 * class251.anInt2711, (byte) -45)));
									if (class1 != null) {
										class1 = (class1.method504((-1880327077 * class251.anInt2712), -174651263));
										class177 = (class1.method503(Class677.aClass167_8609, i_43_, 1, (class251.aBool2671 ? (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.aClass617_12202) : null), class251.aClass688_2653, 0, 0, 0, 0, (byte) 26));
										if (null != class177)
											i_44_ = -class177.method2562() >> 1;
										else
											Class668.method8011(class251, 263642117);
									}
								} else if (class251.anInt2601 * 1939619399 == 3) {
									int i_45_ = class251.anInt2602 * -2011124813;
									if (i_45_ >= 0 && i_45_ < 2048) {
										Player class649_sub1_sub5_sub1_sub2 = (client.aClass649_Sub1_Sub5_Sub1_Sub2Array11155[i_45_]);
										if ((null != class649_sub1_sub5_sub1_sub2) && (i_45_ == (-1791435655 * client.anInt11156) || ((Class264.method3677((class649_sub1_sub5_sub1_sub2.aString12184), -311312947)) == (class251.anInt2603 * 2109818095)))) {
											class177 = (class251.method3502(Class677.aClass167_8609, i_43_, (Class497.aClass34_Sub16_5554), (Class205_Sub7.aClass34_Sub2_9878), (Class172.aClass34_Sub7_1922), (Class111.aClass34_Sub13_1391), Class45.aClass34_Sub11_529, (Class465_Sub1.aClass96_10352), (Class465_Sub1.aClass96_10352), class251.aClass688_2653, (class649_sub1_sub5_sub1_sub2.aClass617_12202), (short) -4149));
											if (class177 == null && Class251.aBool2724)
												Class668.method8011(class251, 263642117);
										}
									}
								} else if (5 == (1939619399 * class251.anInt2601)) {
									int i_46_ = class251.anInt2602 * -2011124813;
									Player class649_sub1_sub5_sub1_sub2 = null;
									boolean bool_47_ = false;
									if (i_46_ >= 0 && i_46_ < 2048) {
										class649_sub1_sub5_sub1_sub2 = (client.aClass649_Sub1_Sub5_Sub1_Sub2Array11155[i_46_]);
										bool_47_ = ((null != class649_sub1_sub5_sub1_sub2) && (((-1791435655 * client.anInt11156) == i_46_) || ((Class264.method3677((class649_sub1_sub5_sub1_sub2.aString12184), -311312947)) == (2109818095 * (class251.anInt2603)))));
									} else if (-1 == i_46_) {
										bool_47_ = true;
										class649_sub1_sub5_sub1_sub2 = (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591);
									} else {
										Player class649_sub1_sub5_sub1_sub2_48_ = ((Player) (client.aMap11157.get(Integer.valueOf(i_46_))));
										if ((null != class649_sub1_sub5_sub1_sub2_48_) && (1710020215 * (class649_sub1_sub5_sub1_sub2_48_.anInt11889)) == i_46_) {
											bool_47_ = true;
											class649_sub1_sub5_sub1_sub2 = class649_sub1_sub5_sub1_sub2_48_;
										}
									}
									if (bool_47_ && class649_sub1_sub5_sub1_sub2 != null && (class649_sub1_sub5_sub1_sub2.aClass617_12202) != null)
										class177 = (class649_sub1_sub5_sub1_sub2.aClass617_12202.method7345(Class677.aClass167_8609, i_43_, Class497.aClass34_Sub16_5554, (Class205_Sub7.aClass34_Sub2_9878), Class172.aClass34_Sub7_1922, Class111.aClass34_Sub13_1391, Class465_Sub1.aClass96_10352, Class465_Sub1.aClass96_10352, class251.aClass688_2653, null, null, null, 0, true, Class71.aClass631_796, 16711680));
								} else if (8 == class251.anInt2601 * 1939619399 || (1939619399 * class251.anInt2601 == 9)) {
									Class536_Sub1 class536_sub1 = Class659.method7970((-2011124813 * (class251.anInt2602)), false, -992904672);
									if (class536_sub1 != null)
										class177 = (class536_sub1.method9346(Class677.aClass167_8609, i_43_, class251.aClass688_2653, (2109818095 * class251.anInt2603), 9 == (class251.anInt2601 * 1939619399), (class251.aBool2671 ? (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.aClass617_12202) : null), -1860430658));
								} else if (null == class251.aClass688_2653 || !class251.aClass688_2653.method8121(-823836134)) {
									class177 = (class251.method3502(Class677.aClass167_8609, i_43_, Class497.aClass34_Sub16_5554, Class205_Sub7.aClass34_Sub2_9878, Class172.aClass34_Sub7_1922, Class111.aClass34_Sub13_1391, Class45.aClass34_Sub11_529, Class465_Sub1.aClass96_10352, Class465_Sub1.aClass96_10352, null, (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.aClass617_12202), (short) 20956));
									if (null == class177 && Class251.aBool2724)
										Class668.method8011(class251, 263642117);
								} else {
									class177 = (class251.method3502(Class677.aClass167_8609, i_43_, Class497.aClass34_Sub16_5554, Class205_Sub7.aClass34_Sub2_9878, Class172.aClass34_Sub7_1922, Class111.aClass34_Sub13_1391, Class45.aClass34_Sub11_529, Class465_Sub1.aClass96_10352, Class465_Sub1.aClass96_10352, class251.aClass688_2653, (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.aClass617_12202), (short) 14955));
									if (null == class177 && Class251.aBool2724)
										Class668.method8011(class251, 263642117);
								}
								if (null != class177) {
									if (-948134625 * class251.anInt2687 != 0)
										class177.method2510(-1013506549 * class251.anInt2623, -1580095687 * class251.anInt2681, class251.anInt2625 * 1641909195, class251.anInt2687 * -948134625);
									int i_49_;
									if (class251.anInt2614 * -555385111 > 0)
										i_49_ = (((-1606950689 * class251.anInt2573) << 9) / (-555385111 * class251.anInt2614));
									else
										i_49_ = 512;
									int i_50_;
									if (class251.anInt2615 * 2043741855 > 0)
										i_50_ = ((class251.anInt2574 * 223822141 << 9) / (2043741855 * class251.anInt2615));
									else
										i_50_ = 512;
									int i_51_ = (-1606950689 * class251.anInt2573 / 2 + i_10_);
									int i_52_ = (223822141 * class251.anInt2574 / 2 + i_11_);
									if (!class251.aBool2633) {
										i_51_ += i_49_ * (class251.anInt2610 * -605050607) >> 9;
										i_52_ += i_50_ * (class251.anInt2611 * -383360765) >> 9;
									}
									client.aClass433_11110.method5193();
									Class677.aClass167_8609.method2099(client.aClass433_11110);
									Class443 class443 = Class677.aClass167_8609.method2391();
									int i_53_ = client.aClass515_11066.method6247(-1661109781);
									int i_54_ = client.aClass515_11066.method6248(-1550632057);
									i_54_ += class251.anInt2613 * -632476725;
									if (class251.aBool2616) {
										if (Class246.anInt2474 * 155362615 == 2) {
											if (class251.aBool2633)
												class443.method5388((float) i_51_, (float) i_52_, (float) i_49_, (float) i_50_, Class683.aClass301_Sub1_8651.method4069(73168445), Class683.aClass301_Sub1_8651.method4066(12744689), (float) (-1804846931 * (Class144.anInt1679)), (float) ((Class34_Sub6.anInt10965) * 589116499), (float) (-632476725 * (class251.anInt2613)));
											else
												class443.method5388((float) i_51_, (float) i_52_, (float) i_49_, (float) i_50_, (Class683.aClass301_Sub1_8651.method4069(1024889559)), Class683.aClass301_Sub1_8651.method4066(12744689), (float) (-1804846931 * (Class144.anInt1679)), (float) ((Class34_Sub6.anInt10965) * 589116499), (float) ((-632476725 * (class251.anInt2613)) << 2));
										} else if (class251.aBool2633)
											class443.method5388((float) i_51_, (float) i_52_, (float) i_49_, (float) i_50_, (float) i_53_, (float) i_54_, (float) (-1804846931 * (Class144.anInt1679)), (float) ((Class34_Sub6.anInt10965) * 589116499), (float) (class251.anInt2613 * -632476725));
										else
											class443.method5388((float) i_51_, (float) i_52_, (float) i_49_, (float) i_50_, (float) i_53_, (float) i_54_, (float) (-1804846931 * (Class144.anInt1679)), (float) (589116499 * (Class34_Sub6.anInt10965)), (float) ((-632476725 * (class251.anInt2613)) << 2));
									} else if (Class246.anInt2474 * 155362615 == 2)
										class443.method5350((float) i_51_, (float) i_52_, (float) i_49_, (float) i_50_, Class683.aClass301_Sub1_8651.method4069(937405440), Class683.aClass301_Sub1_8651.method4066(12744689), (float) (-1804846931 * Class144.anInt1679), (float) (Class34_Sub6.anInt10965 * 589116499));
									else
										class443.method5350((float) i_51_, (float) i_52_, (float) i_49_, (float) i_50_, (float) i_53_, (float) i_54_, (float) (-1804846931 * Class144.anInt1679), (float) (589116499 * (Class34_Sub6.anInt10965)));
									Class677.aClass167_8609.method2390(class443);
									Class677.aClass167_8609.method2000(2, 0);
									if (class251.aBool2682)
										Class677.aClass167_8609.method2302(false);
									if (class251.aBool2633) {
										client.aClass433_11294.method5206(1.0F, 0.0F, 0.0F, (Class447.method5400(-1515601291 * class251.anInt2551)));
										client.aClass433_11294.method5214(0.0F, 1.0F, 0.0F, (Class447.method5400(92396219 * class251.anInt2547)));
										client.aClass433_11294.method5214(0.0F, 0.0F, 1.0F, (Class447.method5400(1533121603 * class251.anInt2609)));
										client.aClass433_11294.method5200((float) (-605050607 * class251.anInt2610), (float) (class251.anInt2611 * -383360765), (float) (class251.anInt2612 * 523954249));
									} else {
										int i_55_ = ((-632476725 * class251.anInt2613 << 2) * (Class447.anIntArray4906[((-1515601291 * class251.anInt2551) << 3)])) >> 14;
										int i_56_ = ((class251.anInt2613 * -632476725 << 2) * (Class447.anIntArray4921[((class251.anInt2551 * -1515601291) << 3)])) >> 14;
										client.aClass433_11294.method5206(0.0F, 0.0F, 1.0F, (Class447.method5400(-(class251.anInt2609 * 1533121603) << 3)));
										client.aClass433_11294.method5214(0.0F, 1.0F, 0.0F, (Class447.method5400(92396219 * class251.anInt2547 << 3)));
										client.aClass433_11294.method5200((float) ((class251.anInt2658 * -1064708005) << 2), (float) (i_44_ + (((-1027484909 * (class251.anInt2606)) << 2) + i_55_)), (float) (((class251.anInt2606 * -1027484909) << 2) + i_56_));
										client.aClass433_11294.method5214(1.0F, 0.0F, 0.0F, (Class447.method5400(class251.anInt2551 * -1515601291 << 3)));
									}
									class251.method3471((Class677.aClass167_8609), class177, client.aClass433_11294, client.anInt11014, 1061586503);
									Class677.aClass167_8609.method2047();
									Class677.aClass167_8609.method2245(true);
									Class677.aClass167_8609.method2369(i_0_, i_1_, i_2_, i_3_);
									if (client.aBool11136)
										Class677.aClass167_8609.method2196(i_10_, i_11_, i_10_ + (class251.anInt2573 * -1606950689), i_11_ + (223822141 * class251.anInt2574));
									if (class251.aBool2659)
										client.aClass515_11066.method6252(1796531619).method7582(((float) (-1506966235 * class251.anInt2588) / 256.0F), ((float) (-2013168625 * class251.anInt2631) / 256.0F), (float) (class251.anInt2632 * 1038403251) / 256.0F, class251.anInt2579 * 1421639527, 1702720115 * class251.anInt2650, class251.anInt2629 * 1373300045, 239029523 * class251.anInt2639, class251.anInt2635 * 966315903, (short) 255);
									else
										client.aClass515_11066.method6252(1796531619).method7616((byte) 58);
									class177.method2490(client.aClass433_11294, null, 1);
									if (!class251.aBool2616 && class251.aClass627_2739 != null)
										Class677.aClass167_8609.method2351(class251.aClass627_2739.method7475());
									if (client.aBool11136)
										Class677.aClass167_8609.method2369(i_0_, i_1_, i_2_, i_3_);
									Class677.aClass167_8609.method2245(false);
									Class677.aClass167_8609.method2051();
									Class677.aClass167_8609.method2369(i_0_, i_1_, i_2_, i_3_);
									if (class251.aBool2659)
										client.aClass515_11066.method6252(1796531619).method7616((byte) 89);
									if (class251.aBool2682)
										Class677.aClass167_8609.method2302(true);
								}
							} else if (class251.anInt2728 * 1049444347 == 9) {
								int i_57_;
								int i_58_;
								int i_59_;
								int i_60_;
								if (class251.aBool2692) {
									i_57_ = i_10_;
									i_58_ = (i_11_ + class251.anInt2574 * 223822141);
									i_59_ = (-1606950689 * class251.anInt2573 + i_10_);
									i_60_ = i_11_;
								} else {
									i_57_ = i_10_;
									i_58_ = i_11_;
									i_59_ = i_10_ + (-1606950689 * class251.anInt2573);
									i_60_ = (i_11_ + class251.anInt2574 * 223822141);
								}
								if (class251.anInt2590 * 1029415787 == 1)
									Class677.aClass167_8609.method2277(i_57_, i_58_, i_59_, i_60_, (~0xffffff | class251.anInt2587 * -336626187), 0);
								else
									Class677.aClass167_8609.method2096(i_57_, i_58_, i_59_, i_60_, (~0xffffff | -336626187 * class251.anInt2587), 1029415787 * class251.anInt2590, 0);
							}
						}
					}
				}
			}
		}
	}
}
