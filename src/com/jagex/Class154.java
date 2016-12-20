/* Class154 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.HashMap;
import java.util.Iterator;

class Class154 implements Runnable {
	Class358_Sub2 this$0;

	public void run() {
		try {
			while (!this$0.aBool10287) {
				HashMap hashmap = this$0.method15932(-693173271);
				Iterator iterator = hashmap.keySet().iterator();
				while (iterator.hasNext()) {
					Class485 class485 = (Class485) iterator.next();
					if (!class485.aBool5457) {
						Class494[] class494s = (Class494[]) hashmap.get(class485);
						for (int i = 0; i < class494s.length; i++)
							class494s[i].method8016((byte) 1);
					}
				}
				Class518.method8635(25L);
			}
		} catch (Exception exception) {
			Class180.method3542(null, exception, 1604547405);
		}
	}

	Class154(Class358_Sub2 class358_sub2) {
		this$0 = class358_sub2;
	}

	public void method2530() {
		try {
			while (!this$0.aBool10287) {
				HashMap hashmap = this$0.method15932(66819754);
				Iterator iterator = hashmap.keySet().iterator();
				while (iterator.hasNext()) {
					Class485 class485 = (Class485) iterator.next();
					if (!class485.aBool5457) {
						Class494[] class494s = (Class494[]) hashmap.get(class485);
						for (int i = 0; i < class494s.length; i++)
							class494s[i].method8016((byte) 1);
					}
				}
				Class518.method8635(25L);
			}
		} catch (Exception exception) {
			Class180.method3542(null, exception, 1604547405);
		}
	}

	public void method2531() {
		try {
			while (!this$0.aBool10287) {
				HashMap hashmap = this$0.method15932(-712887311);
				Iterator iterator = hashmap.keySet().iterator();
				while (iterator.hasNext()) {
					Class485 class485 = (Class485) iterator.next();
					if (!class485.aBool5457) {
						Class494[] class494s = (Class494[]) hashmap.get(class485);
						for (int i = 0; i < class494s.length; i++)
							class494s[i].method8016((byte) 1);
					}
				}
				Class518.method8635(25L);
			}
		} catch (Exception exception) {
			Class180.method3542(null, exception, 1604547405);
		}
	}

	static void method2532(int i) {
		if (1310321663 * client.anInt11245 < 0) {
			Class22 class22 = Class29.method869(-1390486224);
			if (!Class35.aBool338)
				Class35.aBool339 = ((Class35.anInt358 * 420140599 != -1 && (Class35.anInt346 * -943170217 >= Class35.anInt358 * 420140599)) || (((Class35.aBool365 ? 26 : 22) + (Class35.anInt335 * -1297575597 * (Class35.anInt346 * -943170217))) > Class611.anInt8009 * -471480167));
			Class35.aClass694_351.method14105((byte) 78);
			Class35.aClass694_352.method14105((byte) 93);
			for (Class527_Sub8_Sub7 class527_sub8_sub7 = ((Class527_Sub8_Sub7) Class35.aClass694_348.method14081((short) 1342)); null != class527_sub8_sub7; class527_sub8_sub7 = ((Class527_Sub8_Sub7) Class35.aClass694_348.method14086(-65534))) {
				int i_0_ = class527_sub8_sub7.anInt11652 * 1720667579;
				if (i_0_ < 1000) {
					class527_sub8_sub7.method8735(-1889161967);
					if (59 == i_0_ || 2 == i_0_ || i_0_ == 8 || i_0_ == 17 || 15 == i_0_ || 16 == i_0_ || 58 == i_0_)
						Class35.aClass694_352.method14147(class527_sub8_sub7, -1809868408);
					else
						Class35.aClass694_351.method14147(class527_sub8_sub7, -1869184165);
				}
			}
			Class35.aClass694_351.method14080(Class35.aClass694_348, -1557475333);
			Class35.aClass694_352.method14080(Class35.aClass694_348, 306565931);
			if (Class35.anInt346 * -943170217 > 1) {
				if (Class652.method10895(618215913) && -943170217 * Class35.anInt346 > 2)
					Class200.aClass527_Sub8_Sub7_2202 = (Class527_Sub8_Sub7) (Class35.aClass694_348.aClass527_8736.aClass527_7107.aClass527_7107);
				else
					Class200.aClass527_Sub8_Sub7_2202 = (Class527_Sub8_Sub7) (Class35.aClass694_348.aClass527_8736.aClass527_7107);
				Class35.aClass527_Sub8_Sub7_345 = ((Class527_Sub8_Sub7) Class35.aClass694_348.aClass527_8736.aClass527_7107);
				if (Class35.anInt346 * -943170217 > 2)
					Class42.aClass527_Sub8_Sub7_457 = ((Class527_Sub8_Sub7) Class35.aClass527_Sub8_Sub7_345.aClass527_7107);
				else
					Class42.aClass527_Sub8_Sub7_457 = null;
			} else {
				Class200.aClass527_Sub8_Sub7_2202 = null;
				Class35.aClass527_Sub8_Sub7_345 = null;
				Class42.aClass527_Sub8_Sub7_457 = null;
			}
			Class527_Sub34 class527_sub34 = ((Class527_Sub34) client.aClass694_11278.method14081((short) -8908));
			int i_1_;
			int i_2_;
			if (null != class527_sub34) {
				i_1_ = class527_sub34.method16356(1319623125);
				i_2_ = class527_sub34.method16357(719777205);
			} else {
				i_1_ = Class534.aClass553_7213.method9158(-1412060454);
				i_2_ = Class534.aClass553_7213.method9159(2019757848);
			}
			if (Class35.aBool338) {
				if (Class178.method3069((Class271.aClass624_3128.anInterface65_8153), class527_sub34, -40208488)) {
					if (Class35.aClass527_Sub8_Sub4_340 != null && i_1_ >= -860825733 * Class576.anInt7640 && i_1_ <= (949523843 * Class279.anInt3172 + -860825733 * Class576.anInt7640) && i_2_ >= Class35.anInt354 * 182965925 && i_2_ <= (Class35.anInt354 * 182965925 + Class402.anInt4149 * -1441633063)) {
						int i_3_ = -1;
						for (int i_4_ = 0; (i_4_ < 1731231531 * (Class35.aClass527_Sub8_Sub4_340.anInt11625)); i_4_++) {
							if (Class35.aBool365) {
								int i_5_ = (i_4_ * (-1297575597 * Class35.anInt335) + (1 + (class22.anInt215 * -63286397 + (182965925 * Class35.anInt354 + 20))));
								if ((i_2_ > i_5_ - -63286397 * class22.anInt215 - 1) && (i_2_ < class22.anInt213 * 672688101 + i_5_))
									i_3_ = i_4_;
							} else {
								int i_6_ = (182965925 * Class35.anInt354 + 31 + i_4_ * (-1297575597 * Class35.anInt335));
								if (i_2_ > i_6_ - 13 && i_2_ < 3 + i_6_)
									i_3_ = i_4_;
							}
						}
						if (i_3_ != -1) {
							int i_7_ = 0;
							Class689 class689 = new Class689(Class35.aClass527_Sub8_Sub4_340.aClass693_11624);
							for (Class527_Sub8_Sub7 class527_sub8_sub7 = ((Class527_Sub8_Sub7) class689.method13987((byte) -61)); null != class527_sub8_sub7; class527_sub8_sub7 = (Class527_Sub8_Sub7) class689.next()) {
								if (i_7_ == i_3_) {
									Class47.method1237(class527_sub8_sub7, i_1_, i_2_, true, (short) 3553);
									break;
								}
								i_7_++;
							}
						}
						Exception_Sub7.method17974(27891042);
					} else if (i_1_ >= Class230.anInt2355 * -1375491723 && i_1_ <= (-1309847599 * Class100.anInt1187 + -1375491723 * Class230.anInt2355) && i_2_ >= Class80.anInt807 * 479584441 && (i_2_ <= (Class80.anInt807 * 479584441 + Class317.anInt3532 * -830760507))) {
						if (!Class35.aBool339) {
							int i_8_ = -1;
							for (int i_9_ = 0; i_9_ < -943170217 * Class35.anInt346; i_9_++) {
								if (Class35.aBool365) {
									int i_10_ = (((Class35.anInt346 * -943170217 - 1 - i_9_) * (-1297575597 * Class35.anInt335)) + (-63286397 * class22.anInt215 + (20 + (479584441 * Class80.anInt807)) + 1));
									if (i_2_ > (i_10_ - class22.anInt215 * -63286397 - 1) && i_2_ < i_10_ + (672688101 * class22.anInt213))
										i_8_ = i_9_;
								} else {
									int i_11_ = (((-943170217 * Class35.anInt346 - 1 - i_9_) * (Class35.anInt335 * -1297575597)) + (479584441 * Class80.anInt807 + 31));
									if (i_2_ > i_11_ - 13 && i_2_ < i_11_ + 3)
										i_8_ = i_9_;
								}
							}
							if (i_8_ != -1) {
								int i_12_ = 0;
								Class691 class691 = new Class691(Class35.aClass694_348);
								for (Class527_Sub8_Sub7 class527_sub8_sub7 = ((Class527_Sub8_Sub7) class691.method14010(509282666)); class527_sub8_sub7 != null; class527_sub8_sub7 = ((Class527_Sub8_Sub7) class691.next())) {
									if (i_12_ == i_8_) {
										Class47.method1237(class527_sub8_sub7, i_1_, i_2_, true, (short) 3553);
										break;
									}
									i_12_++;
								}
							}
							Exception_Sub7.method17974(-1762191582);
						} else {
							int i_13_ = -1;
							for (int i_14_ = 0; i_14_ < Class35.anInt347 * -1282519069; i_14_++) {
								if (Class35.aBool365) {
									int i_15_ = (1 + (class22.anInt215 * -63286397 + (479584441 * Class80.anInt807 + 20)) + (Class35.anInt335 * -1297575597 * i_14_));
									if (i_2_ > (i_15_ - class22.anInt215 * -63286397 - 1) && (i_2_ < i_15_ + (672688101 * class22.anInt213))) {
										i_13_ = i_14_;
										break;
									}
								} else {
									int i_16_ = (31 + 479584441 * Class80.anInt807 + (-1297575597 * Class35.anInt335 * i_14_));
									if (i_2_ > i_16_ - 13 && i_2_ < 3 + i_16_) {
										i_13_ = i_14_;
										break;
									}
								}
							}
							if (-1 != i_13_) {
								int i_17_ = 0;
								Class689 class689 = new Class689(Class35.aClass693_350);
								for (Class527_Sub8_Sub4 class527_sub8_sub4 = ((Class527_Sub8_Sub4) class689.method13987((byte) 66)); class527_sub8_sub4 != null; class527_sub8_sub4 = ((Class527_Sub8_Sub4) class689.next())) {
									if (i_17_ == i_13_) {
										Class47.method1237(((Class527_Sub8_Sub7) (class527_sub8_sub4.aClass693_11624.aClass527_Sub8_8734.aClass527_Sub8_10400)), i_1_, i_2_, true, (short) 3553);
										Exception_Sub7.method17974(401774090);
										break;
									}
									i_17_++;
								}
							}
						}
					}
				} else {
					boolean bool = false;
					if (Class35.aClass527_Sub8_Sub4_340 != null) {
						if (i_1_ < -860825733 * Class576.anInt7640 - 10 || i_1_ > (Class576.anInt7640 * -860825733 + 949523843 * Class279.anInt3172 + 10) || i_2_ < Class35.anInt354 * 182965925 - 10 || i_2_ > (182965925 * Class35.anInt354 + Class402.anInt4149 * -1441633063 + 10))
							Class418.method6663((byte) -82);
						else
							bool = true;
					}
					if (!bool) {
						if (i_1_ < -1375491723 * Class230.anInt2355 - 10 || i_1_ > (-1375491723 * Class230.anInt2355 + Class100.anInt1187 * -1309847599 + 10) || i_2_ < Class80.anInt807 * 479584441 - 10 || i_2_ > 10 + (Class80.anInt807 * 479584441 + -830760507 * Class317.anInt3532))
							Exception_Sub7.method17974(-1037000947);
						else if (Class35.aBool339) {
							int i_18_ = -1;
							int i_19_ = -1;
							for (int i_20_ = 0; i_20_ < -1282519069 * Class35.anInt347; i_20_++) {
								if (Class35.aBool365) {
									int i_21_ = (20 + Class80.anInt807 * 479584441 + class22.anInt215 * -63286397 + 1 + i_20_ * (Class35.anInt335 * -1297575597));
									if (i_2_ > (i_21_ - -63286397 * class22.anInt215 - 1) && i_2_ < i_21_ + (class22.anInt213 * 672688101)) {
										i_18_ = i_20_;
										i_19_ = (i_21_ - -63286397 * class22.anInt215 - 1);
										break;
									}
								} else {
									int i_22_ = (31 + Class80.anInt807 * 479584441 + i_20_ * (Class35.anInt335 * -1297575597));
									if (i_2_ > i_22_ - 13 && i_2_ < 3 + i_22_) {
										i_18_ = i_20_;
										i_19_ = i_22_ - 13;
										break;
									}
								}
							}
							if (i_18_ != -1) {
								int i_23_ = 0;
								Class689 class689 = new Class689(Class35.aClass693_350);
								for (Class527_Sub8_Sub4 class527_sub8_sub4 = ((Class527_Sub8_Sub4) class689.method13987((byte) -76)); null != class527_sub8_sub4; class527_sub8_sub4 = ((Class527_Sub8_Sub4) class689.next())) {
									if (i_23_ == i_18_) {
										if ((1731231531 * class527_sub8_sub4.anInt11625) > 1)
											Class106.method1885(class527_sub8_sub4, i_19_, 1865949910);
										break;
									}
									i_23_++;
								}
							}
						}
					}
				}
			} else {
				boolean bool = Class178.method3069((Class271.aClass624_3128.anInterface65_8156), class527_sub34, 721250582);
				boolean bool_24_ = Class178.method3069((Class271.aClass624_3128.anInterface65_8151), class527_sub34, 1172404374);
				boolean bool_25_ = Class178.method3069((Class271.aClass624_3128.anInterface65_8152), class527_sub34, -1442845137);
				if ((bool || bool_24_) && ((client.anInt11113 * -1302469599 == 1 && -943170217 * Class35.anInt346 > 2) || Class281.method5184(1812502966)))
					bool_25_ = true;
				if (bool_25_ && -943170217 * Class35.anInt346 > 0) {
					if (null == client.aClass243_11150 && 0 == 903402509 * client.anInt11255)
						Class504.method8221(i_1_, i_2_, -1104248657);
					else
						Class35.anInt344 = -2140393562;
				} else if (bool_24_) {
					if (Class42.aClass527_Sub8_Sub7_457 != null)
						Class47.method1237(Class42.aClass527_Sub8_Sub7_457, i_1_, i_2_, false, (short) 3553);
				} else if (bool) {
					if (null != Class200.aClass527_Sub8_Sub7_2202) {
						boolean bool_26_ = (null != client.aClass243_11150 || client.anInt11255 * 903402509 > 0);
						if (bool_26_) {
							Class35.anInt344 = -1070196781;
							Class206.aClass527_Sub8_Sub7_2231 = Class200.aClass527_Sub8_Sub7_2202;
						} else
							Class47.method1237((Class200.aClass527_Sub8_Sub7_2202), i_1_, i_2_, false, (short) 3553);
					} else if (client.aBool11188)
						Class700.method14291(-179502145);
				}
				if (client.aClass243_11150 == null && 0 == 903402509 * client.anInt11255) {
					Class35.anInt344 = 0;
					Class206.aClass527_Sub8_Sub7_2231 = null;
				}
			}
		}
	}

	static final void method2533(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class204.aClass527_Sub31_2213.aClass700_Sub3_10605.method16859(1590538379);
	}

	static final void method2534(Class665 class665, int i) {
		Class403.anInt4164 = 0;
	}

	static final void method2535(Class665 class665, byte i) {
		int i_27_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class625.method10352((Class627.aClass527_Sub21_8187 == class665.aClass527_Sub21_8537), i_27_, -485799818);
	}

	static final void method2536(Class527_Sub2 class527_sub2, byte i) {
		Class555 class555 = client.aClass509_11072.method8314(-821004033);
		if (class555 != null) {
			Interface62 interface62 = null;
			if (class527_sub2.anInt10358 * 966881501 == 0)
				interface62 = (Interface62) (class555.method9377(1986250821 * class527_sub2.anInt10348, 1182093437 * class527_sub2.anInt10346, class527_sub2.anInt10345 * -677418425, -910262463));
			if (1 == class527_sub2.anInt10358 * 966881501)
				interface62 = (Interface62) (class555.method9252(1986250821 * class527_sub2.anInt10348, class527_sub2.anInt10346 * 1182093437, class527_sub2.anInt10345 * -677418425, 514427235));
			if (966881501 * class527_sub2.anInt10358 == 2)
				interface62 = (Interface62) (class555.method9254(class527_sub2.anInt10348 * 1986250821, class527_sub2.anInt10346 * 1182093437, -677418425 * class527_sub2.anInt10345, client.anInterface63_11303, -1495236592));
			if (966881501 * class527_sub2.anInt10358 == 3)
				interface62 = (Interface62) (class555.method9256(class527_sub2.anInt10348 * 1986250821, 1182093437 * class527_sub2.anInt10346, -677418425 * class527_sub2.anInt10345, 2093690375));
			if (interface62 != null) {
				class527_sub2.anInt10347 = interface62.method64(-1177555772) * -1542203279;
				class527_sub2.anInt10350 = interface62.method77(-1654668189) * -702755317;
				class527_sub2.anInt10349 = interface62.method396(-345489547) * -1217994723;
			} else {
				class527_sub2.anInt10347 = 1542203279;
				class527_sub2.anInt10350 = 0;
				class527_sub2.anInt10349 = 0;
			}
		}
	}
}
