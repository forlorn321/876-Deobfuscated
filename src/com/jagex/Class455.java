/* Class455 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Callable;

public class Class455 implements Callable {
	URL anURL4973;
	Class527_Sub8_Sub13_Sub2 aClass527_Sub8_Sub13_Sub2_4974;
	Class468 this$0;

	public Object call() throws Exception {
		URLConnection urlconnection = anURL4973.openConnection();
		urlconnection.setConnectTimeout(10000);
		urlconnection.setReadTimeout(60000);
		boolean bool = true;
		try {
			urlconnection.connect();
		} catch (IOException ioexception) {
			this$0.aLong5331 = Class234.method4347(-1408626088) * 3840971936908608637L;
			bool = false;
		}
		return new Class451(this$0, bool ? urlconnection.getInputStream() : null, aClass527_Sub8_Sub13_Sub2_4974, anURL4973);
	}

	Class455(Class468 class468, URL url, Class527_Sub8_Sub13_Sub2 class527_sub8_sub13_sub2) {
		this$0 = class468;
		anURL4973 = url;
		aClass527_Sub8_Sub13_Sub2_4974 = class527_sub8_sub13_sub2;
	}

	public Object method7342() throws Exception {
		URLConnection urlconnection = anURL4973.openConnection();
		urlconnection.setConnectTimeout(10000);
		urlconnection.setReadTimeout(60000);
		boolean bool = true;
		try {
			urlconnection.connect();
		} catch (IOException ioexception) {
			this$0.aLong5331 = Class234.method4347(-1408626088) * 3840971936908608637L;
			bool = false;
		}
		return new Class451(this$0, bool ? urlconnection.getInputStream() : null, aClass527_Sub8_Sub13_Sub2_4974, anURL4973);
	}

	static final void method7343(Class243 class243, Class240 class240, Class665 class665, int i) {
		class243.anInt2520 = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]) * -1929457099;
		class243.anInt2510 = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]) * -1800059707;
	}

	static final void method7344(Class665 class665, int i) {
		class665.anInt8526 -= 102380841;
	}

	static final void method7345(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
		int i_6_ = Class105.anInt1300 * 351100807;
		int[] is = Class105.anIntArray1301;
		client.anInt11258 = 0;
		int i_7_;
		if (4 == -1481292237 * client.anInt11080)
			i_7_ = Class466.aClass196Array5314.length;
		else
			i_7_ = i_6_ + client.anInt11059 * -1599561389;
		for (int i_8_ = 0; i_8_ < i_7_; i_8_++) {
			Class295 class295 = null;
			Class640_Sub1_Sub2_Sub1 class640_sub1_sub2_sub1;
			if (-1481292237 * client.anInt11080 == 4) {
				Class196 class196 = Class466.aClass196Array5314[i_8_];
				if (!class196.aBool2165)
					continue;
				class640_sub1_sub2_sub1 = class196.method3717(-1116716304);
				if (class640_sub1_sub2_sub1.anInt11890 * 623646263 != client.anInt11129 * 1429404695)
					continue;
				if (645243647 * class196.anInt2164 >= 0) {
					class295 = ((Class640_Sub1_Sub2_Sub1_Sub1) class640_sub1_sub2_sub1).aClass295_12168;
					if (class295.anIntArray3312 != null) {
						class295 = class295.method5314(Class671.aClass97_8584, Class671.aClass97_8584, -1078644332);
						if (class295 == null)
							continue;
					}
				}
			} else {
				if (i_8_ < i_6_)
					class640_sub1_sub2_sub1 = (client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[is[i_8_]]);
				else {
					class640_sub1_sub2_sub1 = ((Class640_Sub1_Sub2_Sub1) (((Class527_Sub26) (client.aClass14_10989.method709((long) client.anIntArray11021[i_8_ - i_6_]))).anObject10522));
					class295 = ((Class640_Sub1_Sub2_Sub1_Sub1) class640_sub1_sub2_sub1).aClass295_12168;
					if (class295.anIntArray3312 != null) {
						class295 = class295.method5314(Class671.aClass97_8584, Class671.aClass97_8584, -697437560);
						if (null == class295)
							continue;
					}
				}
				if (786162265 * class640_sub1_sub2_sub1.anInt11897 < 0 || ((623646263 * class640_sub1_sub2_sub1.anInt11890 != 1429404695 * client.anInt11129) && ((Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aByte10864) != class640_sub1_sub2_sub1.aByte10864)))
					continue;
			}
			Class435.method6988(class640_sub1_sub2_sub1, class640_sub1_sub2_sub1.method17049((byte) -67), false, (byte) -55);
			if (!(client.aFloatArray11139[0] < 0.0F)) {
				if (class640_sub1_sub2_sub1.method18554(1405369292)) {
					Class523 class523 = class640_sub1_sub2_sub1.method18547(210163044);
					if (class523 != null && (client.anInt11258 * 1170245295 < 2011525099 * client.anInt11194)) {
						String string = class523.method8686(1504227900);
						if (Class420.aClass273_4591.method5086((byte) -109))
							string = Class420.aClass273_4591.method5109(string, 1968897173);
						client.anIntArray11004[client.anInt11258 * 1170245295] = (Class568.aClass22_7615.method780(string, (short) -30621) / 2);
						client.anIntArray11197[client.anInt11258 * 1170245295] = (int) client.aFloatArray11139[0];
						client.anIntArray11293[client.anInt11258 * 1170245295] = (int) client.aFloatArray11139[1];
						client.aClass523Array11263[(client.anInt11258 * 1170245295)] = class523;
						client.anInt11258 += 1684836431;
					}
				}
				int i_9_ = (int) (client.aFloatArray11139[1] + (float) i_0_);
				i_9_ -= -63286397 * Class568.aClass22_7615.anInt215;
				boolean bool = false;
				if (!class640_sub1_sub2_sub1.aBool11893 && !class640_sub1_sub2_sub1.aClass705_11912.method14331(1240716819)) {
					for (Class522_Sub1 class522_sub1 = (Class522_Sub1) class640_sub1_sub2_sub1.aClass705_11912.method14317(297060422); null != class522_sub1; class522_sub1 = (Class522_Sub1) class640_sub1_sub2_sub1.aClass705_11912.method14320((byte) -2)) {
						Class522_Sub4 class522_sub4 = class522_sub1.method15942(client.anInt11019, 1114700190);
						if (class522_sub4 != null) {
							Class544 class544 = class522_sub1.aClass544_10291;
							Class640_Sub1_Sub2_Sub1_Sub2 class640_sub1_sub2_sub1_sub2 = (client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[is[i_8_]]);
							Class147 class147;
							Class147 class147_10_;
							if (class640_sub1_sub2_sub1_sub2 != null && (Class210.aClass210_2251 != (class640_sub1_sub2_sub1_sub2.aClass210_12185))) {
								if ((class640_sub1_sub2_sub1_sub2.aClass210_12185) == Class210.aClass210_2248) {
									class147 = (class544.method9033(Class402.aClass180_4150, class544.anInt7254 * 1883967975, 425369249));
									class147_10_ = (class544.method9033(Class402.aClass180_4150, class544.anInt7256 * 1660379461, 2096983386));
								} else {
									class147 = (class544.method9033(Class402.aClass180_4150, 1039908361 * class544.anInt7252, 1818060865));
									class147_10_ = (class544.method9033(Class402.aClass180_4150, 919815403 * class544.anInt7255, 709513632));
								}
							} else {
								class147 = class544.method9033((Class402.aClass180_4150), (-1353657513 * (class544.anInt7244)), 1000238331);
								class147_10_ = class544.method9033((Class402.aClass180_4150), (class544.anInt7251 * -975823587), 691885438);
							}
							if (class147 != null && class147_10_ != null) {
								int i_11_ = 255;
								int i_12_ = -1;
								int i_13_ = (client.anInt11019 - (class522_sub4.anInt10310 * -775682299));
								int i_14_ = (class147_10_.method2407() * (-1646517565 * class522_sub4.anInt10309) / 255);
								if (class522_sub4.anInt10307 * 702356667 > i_13_) {
									int i_15_ = (class544.anInt7253 * -257599123 == 0 ? 0 : (-257599123 * class544.anInt7253 * (i_13_ / (-257599123 * class544.anInt7253))));
									int i_16_ = (class147_10_.method2407() * (1903774657 * class522_sub4.anInt10308) / 255);
									i_12_ = i_16_ + (i_15_ * (i_14_ - i_16_) / (702356667 * (class522_sub4.anInt10307)));
								} else {
									i_12_ = i_14_;
									int i_17_ = (class522_sub4.anInt10307 * 702356667 + class544.anInt7250 * -768654555 - i_13_);
									if (-2131571389 * class544.anInt7248 >= 0)
										i_11_ = ((i_17_ << 8) / ((class544.anInt7250 * -768654555) - (-2131571389 * class544.anInt7248)));
								}
								if (-1646517565 * class522_sub4.anInt10309 > 0 && i_12_ < 2)
									i_12_ = 2;
								int i_18_ = class147.method2424();
								int i_19_ = (int) ((float) i + client.aFloatArray11139[0] - (float) (class147.method2407() >> 1));
								i_9_ -= i_18_;
								if (i_11_ >= 0 && i_11_ < 255) {
									int i_20_ = i_11_ << 24;
									int i_21_ = i_20_ | 0xffffff;
									class147.method2416(i_19_, i_9_, 0, i_21_, 1);
									Class402.aClass180_4150.method3138(i_19_, i_9_, i_12_ + i_19_, i_9_ + i_18_);
									class147_10_.method2416(i_19_, i_9_, 0, i_21_, 1);
								} else {
									class147.method2415(i_19_, i_9_);
									Class402.aClass180_4150.method3138(i_19_, i_9_, i_19_ + i_12_, i_18_ + i_9_);
									class147_10_.method2415(i_19_, i_9_);
								}
								Class402.aClass180_4150.method3132(i, i_0_, i_1_ + i, (i_2_ + i_0_));
								i_9_ -= 2;
								bool = true;
							}
						} else if (class522_sub1.method15939(-717166212))
							class522_sub1.method8682(1390922231);
					}
				}
				if (!bool)
					i_9_ -= 2 + 590540811 * Class536.aClass615_7224.anInt8046;
				if (!class640_sub1_sub2_sub1.aBool11893) {
					if (null == class295) {
						Class640_Sub1_Sub2_Sub1_Sub2 class640_sub1_sub2_sub1_sub2 = ((Class640_Sub1_Sub2_Sub1_Sub2) class640_sub1_sub2_sub1);
						for (int i_22_ = 0; i_22_ < (class640_sub1_sub2_sub1_sub2.anIntArray12184).length; i_22_++) {
							if ((class640_sub1_sub2_sub1_sub2.anIntArray12184[i_22_]) >= 0) {
								Object object = null;
								int i_23_ = (class640_sub1_sub2_sub1_sub2.anIntArray12184[i_22_]);
								int i_24_ = (class640_sub1_sub2_sub1_sub2.anIntArray12200[i_22_]);
								long l = (long) (i_24_ << 8 | i_23_);
								Class147 class147 = ((Class147) client.aClass205_11152.method3787(l));
								if (class147 == null) {
									Class185[] class185s = (Class165.method2655(Class338.aClass459_3656, i_24_, 0));
									if (class185s == null)
										continue;
									class147 = (Class402.aClass180_4150.method3271(class185s[i_23_], true));
									client.aClass205_11152.method3790(class147, l);
								}
								if (null != class147) {
									i_9_ -= class147.method2424();
									class147.method2415((int) ((float) i + client.aFloatArray11139[0] - 12.0F), i_9_);
									i_9_ -= 2;
								}
							}
						}
					} else {
						Class640_Sub1_Sub2_Sub1_Sub1 class640_sub1_sub2_sub1_sub1 = ((Class640_Sub1_Sub2_Sub1_Sub1) class640_sub1_sub2_sub1);
						int[] is_25_ = (null != (class640_sub1_sub2_sub1_sub1.aClass297_12164) ? (class640_sub1_sub2_sub1_sub1.aClass297_12164.anIntArray3386) : (class640_sub1_sub2_sub1_sub1.aClass295_12168.anIntArray3324));
						short[] is_26_ = ((class640_sub1_sub2_sub1_sub1.aClass297_12164 != null) ? (class640_sub1_sub2_sub1_sub1.aClass297_12164.aShortArray3387) : (class640_sub1_sub2_sub1_sub1.aClass295_12168.aShortArray3309));
						if (is_26_ != null && is_25_ != null) {
							int i_27_ = 0;
							for (/**/; i_27_ < is_26_.length; i_27_++) {
								if (is_26_[i_27_] >= 0 && is_25_[i_27_] >= 0) {
									Object object = null;
									long l = (long) (is_25_[i_27_] << 8 | is_26_[i_27_]);
									Class147 class147 = (Class147) client.aClass205_11152.method3787(l);
									if (null == class147) {
										Class185[] class185s = (Class165.method2655(Class338.aClass459_3656, is_25_[i_27_], 0));
										if (class185s == null)
											continue;
										class147 = (Class402.aClass180_4150.method3271(class185s[is_26_[i_27_]], true));
										client.aClass205_11152.method3790(class147, l);
									}
									if (null != class147) {
										i_9_ -= class147.method2424();
										class147.method2415((int) (client.aFloatArray11139[0] + (float) i - (float) ((class147.method2407()) >> 1)), i_9_);
										i_9_ -= 2;
									}
								}
							}
						}
					}
				}
				if (class640_sub1_sub2_sub1 instanceof Class640_Sub1_Sub2_Sub1_Sub2) {
					if (i_8_ >= 0) {
						int i_28_ = 0;
						Class100[] class100s = client.aClass100Array11025;
						for (int i_29_ = 0; i_29_ < class100s.length; i_29_++) {
							Class100 class100 = class100s[i_29_];
							if (class100 != null && -905648307 * class100.anInt1176 == 10 && (class100.anInt1184 * 1956653959 == is[i_8_])) {
								Class147 class147 = (Class631.aClass147Array8257[1280661885 * class100.anInt1177]);
								if (class147.method2424() > i_28_)
									i_28_ = class147.method2424();
								class147.method2415((int) (client.aFloatArray11139[0] + (float) i - 12.0F), i_9_ - class147.method2424());
							}
						}
						if (i_28_ > 0)
							i_9_ -= i_28_ + 2;
					}
				} else {
					int i_30_ = 0;
					Class100[] class100s = client.aClass100Array11025;
					for (int i_31_ = 0; i_31_ < class100s.length; i_31_++) {
						Class100 class100 = class100s[i_31_];
						if (null != class100 && -905648307 * class100.anInt1176 == 1 && (client.anIntArray11021[i_8_ - i_6_] == class100.anInt1184 * 1956653959)) {
							Class147 class147 = (Class631.aClass147Array8257[class100.anInt1177 * 1280661885]);
							if (class147.method2424() > i_30_)
								i_30_ = class147.method2424();
							boolean bool_32_;
							if (0 == class100.anInt1185 * -348138181)
								bool_32_ = true;
							else {
								int i_33_ = (Class259.method4781((byte) 8) * 1000 / (class100.anInt1185 * -348138181) / 2);
								bool_32_ = client.anInt11019 % (2 * i_33_) < i_33_;
							}
							if (bool_32_)
								class147.method2415((int) (client.aFloatArray11139[0] + (float) i - 12.0F), i_9_ - class147.method2424());
						}
					}
					if (i_30_ > 0)
						i_9_ -= i_30_ + 2;
				}
				int i_34_ = 0;
				for (/**/; i_34_ < -66822073 * Class536.aClass615_7224.anInt8038; i_34_++) {
					int i_35_ = class640_sub1_sub2_sub1.anIntArray11906[i_34_];
					int i_36_ = class640_sub1_sub2_sub1.anIntArray11904[i_34_];
					Class589 class589 = null;
					int i_37_ = 0;
					if (i_36_ >= 0) {
						if (i_35_ <= client.anInt11019)
							continue;
						class589 = (Class589) (Class234.aClass24_Sub18_2375.method81((class640_sub1_sub2_sub1.anIntArray11904[i_34_]), 1728593333));
						i_37_ = class589.anInt7779 * 346458345;
						if (class589 != null && class589.anIntArray7772 != null) {
							class589 = class589.method9820(Class671.aClass97_8584, Class671.aClass97_8584, 2004406522);
							if (null == class589) {
								class640_sub1_sub2_sub1.anIntArray11906[i_34_] = -1;
								continue;
							}
						}
					} else if (i_35_ < 0)
						continue;
					int i_38_ = class640_sub1_sub2_sub1.anIntArray11894[i_34_];
					Class589 class589_39_ = null;
					if (i_38_ >= 0) {
						class589_39_ = (Class589) Class234.aClass24_Sub18_2375.method81(i_38_, -2004190537);
						if (null != class589_39_ && null != class589_39_.anIntArray7772)
							class589_39_ = class589_39_.method9820((Class671.aClass97_8584), (Class671.aClass97_8584), 2016555664);
					}
					if (i_35_ - i_37_ <= client.anInt11019) {
						if (null == class589)
							class640_sub1_sub2_sub1.anIntArray11906[i_34_] = -1;
						else {
							int i_40_ = (class640_sub1_sub2_sub1.method17049((byte) -9) / 2);
							Class435.method6988(class640_sub1_sub2_sub1, i_40_, false, (byte) -34);
							if (client.aFloatArray11139[0] > -1.0F) {
								client.aFloatArray11139[0] += (float) (Class536.aClass615_7224.anIntArray8076[i_34_]);
								client.aFloatArray11139[1] += (float) (Class536.aClass615_7224.anIntArray8040[i_34_]);
								Object object = null;
								Object object_41_ = null;
								Object object_42_ = null;
								Object object_43_ = null;
								int i_44_ = 0;
								int i_45_ = 0;
								int i_46_ = 0;
								int i_47_ = 0;
								int i_48_ = 0;
								int i_49_ = 0;
								int i_50_ = 0;
								int i_51_ = 0;
								Class147 class147 = null;
								Class147 class147_52_ = null;
								Class147 class147_53_ = null;
								Class147 class147_54_ = null;
								int i_55_ = 0;
								int i_56_ = 0;
								int i_57_ = 0;
								int i_58_ = 0;
								int i_59_ = 0;
								int i_60_ = 0;
								int i_61_ = 0;
								int i_62_ = 0;
								Class147 class147_63_ = class589.method9821((Class402.aClass180_4150), -1927019389);
								if (class147_63_ != null) {
									i_44_ = class147_63_.method2407();
									class147_63_.method2482(client.anIntArray11327);
									i_48_ = client.anIntArray11327[0];
								}
								Class147 class147_64_ = class589.method9822((Class402.aClass180_4150), (byte) 26);
								if (null != class147_64_) {
									i_45_ = class147_64_.method2407();
									class147_64_.method2482(client.anIntArray11327);
									i_49_ = client.anIntArray11327[0];
								}
								Class147 class147_65_ = class589.method9847((Class402.aClass180_4150), 1769813785);
								if (null != class147_65_) {
									i_46_ = class147_65_.method2407();
									class147_65_.method2482(client.anIntArray11327);
									i_50_ = client.anIntArray11327[0];
								}
								Class147 class147_66_ = class589.method9826((Class402.aClass180_4150), (short) 13333);
								if (null != class147_66_) {
									i_47_ = class147_66_.method2407();
									class147_66_.method2482(client.anIntArray11327);
									i_51_ = client.anIntArray11327[0];
								}
								if (class589_39_ != null) {
									class147 = (class589_39_.method9821(Class402.aClass180_4150, -1927019389));
									if (class147 != null) {
										i_55_ = class147.method2407();
										class147.method2482(client.anIntArray11327);
										i_59_ = client.anIntArray11327[0];
									}
									class147_52_ = (class589_39_.method9822(Class402.aClass180_4150, (byte) 57));
									if (class147_52_ != null) {
										i_56_ = class147_52_.method2407();
										class147_52_.method2482(client.anIntArray11327);
										i_60_ = client.anIntArray11327[0];
									}
									class147_53_ = (class589_39_.method9847(Class402.aClass180_4150, 1769813785));
									if (class147_53_ != null) {
										i_57_ = class147_53_.method2407();
										class147_53_.method2482(client.anIntArray11327);
										i_61_ = client.anIntArray11327[0];
									}
									class147_54_ = (class589_39_.method9826(Class402.aClass180_4150, (short) 20056));
									if (class147_54_ != null) {
										i_58_ = class147_54_.method2407();
										class147_54_.method2482(client.anIntArray11327);
										i_62_ = client.anIntArray11327[0];
									}
								}
								Class174 class174 = Class24_Sub9.aClass174_10977;
								Class174 class174_67_ = Class24_Sub9.aClass174_10977;
								Class22 class22 = Class632.aClass22_8269;
								Class22 class22_68_ = Class632.aClass22_8269;
								int i_69_ = 680499097 * class589.anInt7775;
								if (i_69_ >= 0) {
									Class174 class174_70_ = ((Class174) (Class211.aClass420_2256.method6684(client.anInterface50_11053, i_69_, true, class589.aBool7768, (byte) -110)));
									Class22 class22_71_ = (Class211.aClass420_2256.method6690(client.anInterface50_11053, i_69_, -530973439));
									if (class174_70_ != null && class22_71_ != null) {
										class174 = class174_70_;
										class22 = class22_71_;
									}
								}
								if (class589_39_ != null) {
									i_69_ = class589_39_.anInt7775 * 680499097;
									if (i_69_ >= 0) {
										Class174 class174_72_ = ((Class174) (Class211.aClass420_2256.method6684(client.anInterface50_11053, i_69_, true, class589_39_.aBool7768, (byte) -14)));
										Class22 class22_73_ = (Class211.aClass420_2256.method6690(client.anInterface50_11053, i_69_, -530973439));
										if (null != class174_72_ && null != class22_73_) {
											class174_67_ = class174_72_;
											class22_68_ = class22_73_;
										}
									}
								}
								Object object_74_ = null;
								String string = null;
								boolean bool_75_ = false;
								int i_76_ = 0;
								String string_77_ = (class589.method9839((class640_sub1_sub2_sub1.anIntArray11905[i_34_]), 1759920499));
								int i_78_ = class22.method780(string_77_, (short) -22515);
								if (null != class589_39_) {
									string = (class589_39_.method9839((class640_sub1_sub2_sub1.anIntArray11919[i_34_]), 1857878308));
									i_76_ = (class22_68_.method780(string, (short) -15385));
								}
								int i_79_ = 0;
								int i_80_ = 0;
								if (i_45_ > 0)
									i_79_ = 1 + i_78_ / i_45_;
								if (null != class589_39_ && i_56_ > 0)
									i_80_ = 1 + i_76_ / i_56_;
								int i_81_ = 0;
								int i_82_ = i_81_;
								if (i_44_ > 0)
									i_81_ += i_44_;
								i_81_ += 2;
								int i_83_ = i_81_;
								if (i_46_ > 0)
									i_81_ += i_46_;
								int i_84_ = i_81_;
								int i_85_ = i_81_;
								if (i_45_ > 0) {
									int i_86_ = i_45_ * i_79_;
									i_81_ += i_86_;
									i_85_ += (i_86_ - i_78_) / 2;
								} else
									i_81_ += i_78_;
								int i_87_ = i_81_;
								if (i_47_ > 0)
									i_81_ += i_47_;
								int i_88_ = 0;
								int i_89_ = 0;
								int i_90_ = 0;
								int i_91_ = 0;
								int i_92_ = 0;
								if (null != class589_39_) {
									i_81_ += 2;
									i_88_ = i_81_;
									if (i_55_ > 0)
										i_81_ += i_55_;
									i_81_ += 2;
									i_89_ = i_81_;
									if (i_57_ > 0)
										i_81_ += i_57_;
									i_90_ = i_81_;
									i_92_ = i_81_;
									if (i_56_ > 0) {
										int i_93_ = i_56_ * i_80_;
										i_81_ += i_93_;
										i_92_ += (i_93_ - i_76_) / 2;
									} else
										i_81_ += i_76_;
									i_91_ = i_81_;
									if (i_58_ > 0)
										i_81_ += i_58_;
								}
								int i_94_ = ((class640_sub1_sub2_sub1.anIntArray11906[i_34_]) - client.anInt11019);
								int i_95_ = (class589.anInt7776 * 1380299959 - (i_94_ * (class589.anInt7776 * 1380299959) / (class589.anInt7779 * 346458345)));
								int i_96_ = ((class589.anInt7762 * 2132741073 * i_94_ / (346458345 * class589.anInt7779)) + -(class589.anInt7762 * 2132741073));
								int i_97_ = (int) ((float) i_95_ + (client.aFloatArray11139[0] + (float) i - (float) (i_81_ >> 1)));
								int i_98_ = (int) ((float) i_96_ + ((float) i_0_ + client.aFloatArray11139[1] - 12.0F));
								int i_99_ = (i_98_ + 15 + class589.anInt7784 * -909885073);
								int i_100_ = 0;
								if (null != class589_39_)
									i_100_ = i_98_ + 15 + (class589_39_.anInt7784 * -909885073);
								int i_101_ = 255;
								if (-365709535 * class589.anInt7778 >= 0)
									i_101_ = ((i_94_ << 8) / (346458345 * class589.anInt7779 - (-365709535 * class589.anInt7778)));
								if (i_101_ >= 0 && i_101_ < 255) {
									int i_102_ = i_101_ << 24;
									int i_103_ = i_102_ | 0xffffff;
									if (class147_63_ != null)
										class147_63_.method2416((i_97_ + i_82_ - i_48_), i_98_, 0, i_103_, 1);
									if (null != class147_65_)
										class147_65_.method2416((i_97_ + i_83_ - i_50_ + (class589.anInt7782 * 740508171)), (class589.anInt7783 * 389672251 + i_98_), 0, i_103_, 1);
									if (class147_64_ != null) {
										for (int i_104_ = 0; i_104_ < i_79_; i_104_++)
											class147_64_.method2416(((class589.anInt7782 * 740508171) + (i_104_ * i_45_ + (i_84_ + i_97_ - i_49_))), (class589.anInt7783 * 389672251) + i_98_, 0, i_103_, 1);
									}
									if (null != class147_66_)
										class147_66_.method2416((i_97_ + i_87_ - i_51_ + (class589.anInt7782 * 740508171)), (class589.anInt7783 * 389672251 + i_98_), 0, i_103_, 1);
									class174.method2770(string_77_, i_97_ + i_85_, i_99_, ((1352849525 * class589.anInt7770) | i_102_), 0, 1750302709);
									if (null != class589_39_) {
										if (null != class147)
											class147.method2416((i_88_ + i_97_ - i_59_), i_98_, 0, i_103_, 1);
										if (null != class147_53_)
											class147_53_.method2416(((740508171 * class589_39_.anInt7782) + (i_97_ + i_89_ - i_61_)), ((389672251 * class589_39_.anInt7783) + i_98_), 0, i_103_, 1);
										if (class147_52_ != null) {
											for (int i_105_ = 0; i_105_ < i_80_; i_105_++)
												class147_52_.method2416(((class589_39_.anInt7782 * 740508171) + (i_97_ + i_90_ - i_60_ + i_56_ * i_105_)), (389672251 * (class589_39_.anInt7783) + i_98_), 0, i_103_, 1);
										}
										if (null != class147_54_)
											class147_54_.method2416((i_97_ + i_91_ - i_62_ + (class589_39_.anInt7782 * 740508171)), (i_98_ + 389672251 * (class589_39_.anInt7783)), 0, i_103_, 1);
										class174_67_.method2770(string, i_97_ + i_92_, i_100_, (((class589_39_.anInt7770) * 1352849525) | i_102_), 0, 1285769074);
									}
								} else {
									if (null != class147_63_)
										class147_63_.method2415((i_82_ + i_97_ - i_48_), i_98_);
									if (null != class147_65_)
										class147_65_.method2415((class589.anInt7782 * 740508171 + (i_97_ + i_83_ - i_50_)), (class589.anInt7783 * 389672251 + i_98_));
									if (null != class147_64_) {
										for (int i_106_ = 0; i_106_ < i_79_; i_106_++)
											class147_64_.method2415((i_84_ + i_97_ - i_49_ + i_106_ * i_45_ + (class589.anInt7782 * 740508171)), (class589.anInt7783 * 389672251) + i_98_);
									}
									if (null != class147_66_)
										class147_66_.method2415((i_97_ + i_87_ - i_51_ + (class589.anInt7782 * 740508171)), (class589.anInt7783 * 389672251 + i_98_));
									class174.method2770(string_77_, i_85_ + i_97_, i_99_, ((class589.anInt7770 * 1352849525) | ~0xffffff), 0, 1318333123);
									if (null != class589_39_) {
										if (null != class147)
											class147.method2415((i_97_ + i_88_ - i_59_), i_98_);
										if (class147_53_ != null)
											class147_53_.method2415((i_89_ + i_97_ - i_61_ + 740508171 * (class589_39_.anInt7782)), ((389672251 * class589_39_.anInt7783) + i_98_));
										if (null != class147_52_) {
											for (int i_107_ = 0; i_107_ < i_80_; i_107_++)
												class147_52_.method2415((740508171 * (class589_39_.anInt7782) + (i_107_ * i_56_ + (i_97_ + i_90_ - i_60_))), (389672251 * (class589_39_.anInt7783) + i_98_));
										}
										if (class147_54_ != null)
											class147_54_.method2415(((740508171 * class589_39_.anInt7782) + (i_91_ + i_97_ - i_62_)), (i_98_ + (class589_39_.anInt7783 * 389672251)));
										class174_67_.method2770(string, i_97_ + i_92_, i_100_, ((1352849525 * class589_39_.anInt7770) | ~0xffffff), 0, 1426641425);
									}
								}
							}
						}
					}
				}
			}
		}
		for (int i_108_ = 0; i_108_ < client.anInt11136 * -1460763393; i_108_++) {
			int i_109_ = client.anIntArray11134[i_108_];
			Class640_Sub1_Sub2_Sub1 class640_sub1_sub2_sub1;
			if (i_109_ < 2048)
				class640_sub1_sub2_sub1 = client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[i_109_];
			else
				class640_sub1_sub2_sub1 = ((Class640_Sub1_Sub2_Sub1) (((Class527_Sub26) client.aClass14_10989.method709((long) (i_109_ - 2048))).anObject10522));
			int i_110_ = client.anIntArray11135[i_108_];
			Class640_Sub1_Sub2_Sub1 class640_sub1_sub2_sub1_111_;
			if (i_110_ < 2048)
				class640_sub1_sub2_sub1_111_ = client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[i_110_];
			else
				class640_sub1_sub2_sub1_111_ = ((Class640_Sub1_Sub2_Sub1) (((Class527_Sub26) client.aClass14_10989.method709((long) (i_110_ - 2048))).anObject10522));
			Class532.method8931(class640_sub1_sub2_sub1, class640_sub1_sub2_sub1_111_, (class640_sub1_sub2_sub1.anInt11908 -= -1834295049) * 679862471, i, i_0_, i_1_, i_2_, i_3_, i_4_, (byte) 18);
		}
		int i_112_ = 2 + (-63286397 * Class568.aClass22_7615.anInt215 + Class568.aClass22_7615.anInt213 * 672688101);
		for (int i_113_ = 0; i_113_ < client.anInt11258 * 1170245295; i_113_++) {
			int i_114_ = client.anIntArray11197[i_113_];
			int i_115_ = client.anIntArray11293[i_113_];
			int i_116_ = client.anIntArray11004[i_113_];
			boolean bool = true;
			while (bool) {
				bool = false;
				for (int i_117_ = 0; i_117_ < i_113_; i_117_++) {
					if (i_115_ + 2 > client.anIntArray11293[i_117_] - i_112_ && i_115_ - i_112_ < 2 + client.anIntArray11293[i_117_] && i_114_ - i_116_ < (client.anIntArray11197[i_117_] + client.anIntArray11004[i_117_]) && i_116_ + i_114_ > (client.anIntArray11197[i_117_] - client.anIntArray11004[i_117_]) && client.anIntArray11293[i_117_] - i_112_ < i_115_) {
						i_115_ = client.anIntArray11293[i_117_] - i_112_;
						bool = true;
					}
				}
			}
			client.anIntArray11293[i_113_] = i_115_;
			String string = client.aClass523Array11263[i_113_].method8686(1320217019);
			if (Class420.aClass273_4591.method5086((byte) -127))
				string = Class420.aClass273_4591.method5109(string, 1968897173);
			if (1612305651 * client.anInt11042 == 0) {
				int i_118_ = 16776960;
				int i_119_ = client.aClass523Array11263[i_113_].method8687(-1488791303);
				if (i_119_ < 6)
					i_118_ = client.anIntArray11264[i_119_];
				if (i_119_ == 6)
					i_118_ = (client.anInt11129 * 1429404695 % 20 < 10 ? 16711680 : 16776960);
				if (7 == i_119_)
					i_118_ = (1429404695 * client.anInt11129 % 20 < 10 ? 255 : 65535);
				if (i_119_ == 8)
					i_118_ = (1429404695 * client.anInt11129 % 20 < 10 ? 45056 : 8454016);
				if (i_119_ == 9) {
					int i_120_ = 150 - (client.aClass523Array11263[i_113_].method8699(-408753038) * 150 / client.aClass523Array11263[i_113_].method8698((byte) 116));
					if (i_120_ < 50)
						i_118_ = 16711680 + i_120_ * 1280;
					else if (i_120_ < 100)
						i_118_ = 16776960 - 327680 * (i_120_ - 50);
					else if (i_120_ < 150)
						i_118_ = 5 * (i_120_ - 100) + 65280;
				}
				if (i_119_ == 10) {
					int i_121_ = 150 - (client.aClass523Array11263[i_113_].method8699(-1288799982) * 150 / client.aClass523Array11263[i_113_].method8698((byte) 30));
					if (i_121_ < 50)
						i_118_ = 16711680 + i_121_ * 5;
					else if (i_121_ < 100)
						i_118_ = 16711935 - 327680 * (i_121_ - 50);
					else if (i_121_ < 150)
						i_118_ = (255 + 327680 * (i_121_ - 100) - (i_121_ - 100) * 5);
				}
				if (i_119_ == 11) {
					int i_122_ = 150 - (client.aClass523Array11263[i_113_].method8699(1766251798) * 150 / client.aClass523Array11263[i_113_].method8698((byte) 69));
					if (i_122_ < 50)
						i_118_ = 16777215 - i_122_ * 327685;
					else if (i_122_ < 100)
						i_118_ = 327685 * (i_122_ - 50) + 65280;
					else if (i_122_ < 150)
						i_118_ = 16777215 - (i_122_ - 100) * 327680;
				}
				int i_123_ = i_118_ | ~0xffffff;
				int i_124_ = client.aClass523Array11263[i_113_].method8688(-2023187056);
				if (0 == i_124_)
					Class29.aClass174_262.method2745(string, i + i_114_, i_0_ + i_115_, i_123_, -16777216, 1348145444);
				if (1 == i_124_)
					Class29.aClass174_262.method2748(string, i + i_114_, i_115_ + i_0_, i_123_, -16777216, (client.anInt11129 * 1429404695), -1063982129);
				if (2 == i_124_)
					Class29.aClass174_262.method2775(string, i_114_ + i, i_0_ + i_115_, i_123_, -16777216, (client.anInt11129 * 1429404695), 752410094);
				if (i_124_ == 3) {
					int i_125_ = 150 - (client.aClass523Array11263[i_113_].method8699(-1339306502) * 150 / client.aClass523Array11263[i_113_].method8698((byte) 66));
					Class29.aClass174_262.method2781(string, i + i_114_, i_115_ + i_0_, i_123_, -16777216, (client.anInt11129 * 1429404695), i_125_, (short) -13207);
				}
				if (4 == i_124_) {
					int i_126_ = 150 - (client.aClass523Array11263[i_113_].method8699(81360347) * 150 / client.aClass523Array11263[i_113_].method8698((byte) 31));
					int i_127_ = (i_126_ * (Class568.aClass22_7615.method780(string, (short) -12382) + 100) / 150);
					Class402.aClass180_4150.method3138(i_114_ + i - 50, i_0_, 50 + (i_114_ + i), i_0_ + i_2_);
					Class29.aClass174_262.method2770(string, i + i_114_ + 50 - i_127_, i_115_ + i_0_, i_123_, -16777216, 1477696710);
					Class402.aClass180_4150.method3132(i, i_0_, i_1_ + i, i_2_ + i_0_);
				}
				if (5 == i_124_) {
					int i_128_ = 150 - (client.aClass523Array11263[i_113_].method8699(1630262945) * 150 / client.aClass523Array11263[i_113_].method8698((byte) 69));
					int i_129_ = 0;
					if (i_128_ < 25)
						i_129_ = i_128_ - 25;
					else if (i_128_ > 125)
						i_129_ = i_128_ - 125;
					int i_130_ = (Class568.aClass22_7615.anInt213 * 672688101 + -63286397 * Class568.aClass22_7615.anInt215);
					Class402.aClass180_4150.method3138(i, (i_115_ + i_0_ - i_130_ - 1), i_1_ + i, 5 + (i_115_ + i_0_));
					Class29.aClass174_262.method2745(string, i_114_ + i, i_0_ + i_115_ + i_129_, i_123_, -16777216, 1348145444);
					Class402.aClass180_4150.method3132(i, i_0_, i_1_ + i, i_0_ + i_2_);
				}
			} else
				Class29.aClass174_262.method2745(string, i + i_114_, i_0_ + i_115_, -256, -16777216, 1348145444);
		}
	}

	static void method7346(int i, int i_131_) {
		Class106.anInt1316 = 0;
		int i_132_ = client.aClass509_11072.method8284((byte) 17);
		int i_133_ = client.aClass509_11072.method8285(-205047660);
		Class470 class470 = client.aClass509_11072.method8359(-449625446);
		Class555 class555 = client.aClass509_11072.method8314(-298431808);
		Class24_Sub6 class24_sub6 = client.aClass509_11072.method8310(1456856514);
		int i_134_ = i;
		if (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937 != null) {
			int i_135_ = ((Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.anIntArray11902[0]) >> 3);
			int i_136_ = ((Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.anIntArray11944[0]) >> 3);
			if (i_135_ >= 0 && i_135_ < Class682.aBoolArrayArray8647.length && i_136_ >= 0 && i_136_ < Class682.aBoolArrayArray8647[i_135_].length && Class682.aBoolArrayArray8647[i_135_][i_136_])
				i_134_ = 0;
		}
		for (int i_137_ = 0; i_137_ < i_132_; i_137_++) {
			for (int i_138_ = 0; i_138_ < i_133_; i_138_++) {
				for (int i_139_ = i_134_; i_139_ <= 1 + i && i_139_ <= 3; i_139_++) {
					if ((i_139_ < i || class470.method7704(i, i_139_, i_137_, i_138_, -571334438)) && !(Class529_Sub1.method16775((Interface62) class555.method9256(i_139_, i_137_, i_138_, -376941765), class24_sub6, i_137_, i_138_, 914252842)) && !(Class529_Sub1.method16775(((Interface62) class555.method9254(i_139_, i_137_, i_138_, client.anInterface63_11303, -1786840675)), class24_sub6, i_137_, i_138_, 582649664))
							&& !(Class529_Sub1.method16775((Interface62) class555.method9377(i_139_, i_137_, i_138_, -910262463), class24_sub6, i_137_, i_138_, -396428558)) && !(Class529_Sub1.method16775((Interface62) class555.method9252(i_139_, i_137_, i_138_, 514427235), class24_sub6, i_137_, i_138_, 775161334))) {
						/* empty */
					}
				}
			}
		}
	}

	static final void method7347(Class665 class665, int i) {
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		class665.anInt8526 -= 204761682;
		int i_140_ = class665.anIntArray8525[1769813785 * class665.anInt8526];
		int i_141_ = class665.anIntArray8525[1769813785 * class665.anInt8526 + 1];
		Class22 class22 = Class211.aClass420_2256.method6690(client.anInterface50_11053, i_141_, -530973439);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = class22.method786(string, i_140_, Class191.aClass147Array2138, (byte) 6);
	}
}
