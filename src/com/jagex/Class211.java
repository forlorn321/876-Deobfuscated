/* Class211 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Class211 {
	List aList2262 = new ArrayList();
	int anInt2263;
	static final int anInt2264 = 16384;
	static final int anInt2265 = 8192;
	static final int anInt2266 = 0;
	Class199 aClass199_2267;
	static final int anInt2268 = 4096;
	static final int anInt2269 = 16384;
	Class479 aClass479_2270;
	int anInt2271;
	HashMap aHashMap2272;
	HashMap aHashMap2273;
	HashMap aHashMap2274;
	Class199 aClass199_2275;
	Class479 aClass479_2276;
	Class199 aClass199_2277;
	int anInt2278;
	Class436 aClass436_2279;
	static final int anInt2280 = 8192;
	boolean aBool2281;
	List aList2282 = new ArrayList();
	List aList2283;
	boolean aBool2284;
	int anInt2285;
	static final int anInt2286 = 4096;
	boolean aBool2287;
	Interface55 anInterface55_2288;
	Interface55 anInterface55_2289;
	Interface55 anInterface55_2290;
	Interface55 anInterface55_2291;
	public static Map aMap2292;

	Class199 method2984(int i) {
		return aClass199_2275;
	}

	Class436 method2985(int i) {
		return aClass436_2279;
	}

	public Class211() {
		aHashMap2272 = new HashMap();
		aHashMap2273 = new HashMap();
		aList2283 = new ArrayList();
		aHashMap2274 = new HashMap();
		aClass479_2276 = null;
		aBool2284 = false;
		anInterface55_2288 = new Class196(this);
		anInterface55_2289 = new Class200(this);
		anInterface55_2290 = new Class187(this);
		anInterface55_2291 = new Class208(this);
	}

	public void method2986(Class479 class479, int i, int i_0_, int i_1_) {
		if (null != class479) {
			Class215 class215 = (Class215) aHashMap2274.get(Integer.valueOf(i));
			if (class215 == null) {
				class215 = new Class215(this);
				aHashMap2274.put(Integer.valueOf(i), class215);
			}
			if (!class215.method3085(class479, 1431337047)) {
				class479.method5785(i_0_, true, (byte) 0);
				class215.method3084(class479, (byte) -10);
			}
		}
	}

	public void method2987(short i) {
		if (aBool2281) {
			Class555.method6801((short) -281);
			if (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591 != null && (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.method7837() != null)) {
				if (aClass436_2279 == null)
					aClass436_2279 = new Class436();
				aClass436_2279.aFloat4850 = (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.method7837().aClass436_4823.aFloat4850);
				aClass436_2279.aFloat4852 = 0.0F;
				aClass436_2279.aFloat4853 = (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.method7837().aClass436_4823.aFloat4853);
			}
			Iterator iterator = aHashMap2272.values().iterator();
			while (iterator.hasNext()) {
				Interface71 interface71 = (Interface71) iterator.next();
				interface71.method332((byte) 0);
			}
			iterator = aHashMap2273.values().iterator();
			while (iterator.hasNext()) {
				Interface71 interface71 = (Interface71) iterator.next();
				interface71.method332((byte) 0);
			}
			iterator = aList2283.iterator();
			while (iterator.hasNext()) {
				Interface71 interface71 = (Interface71) iterator.next();
				if (interface71.method439(1631610940))
					aHashMap2273.remove(Integer.valueOf(interface71.method443(-1008821643)));
				else
					aHashMap2272.remove(Integer.valueOf(interface71.method443(1744164929)));
			}
			aList2283.clear();
			if (aClass479_2276 != null && (aClass479_2276.method5772(1883778710) == Class481.aClass481_5422) && !aBool2284 && client.aClass106_11322.aClass15_1258 != null && Class426.method5129(client.anInt11101 * -708374433, 1603352511)) {
				Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.aClass414_4520, client.aClass106_11322.aClass15_1258, 903664296);
				class536_sub23.aClass536_Sub33_Sub2_10528.writeInt(aClass479_2276.method5768(-1513884617).method443(-374427889));
				client.aClass106_11322.method1409(class536_sub23, 750913029);
				aBool2284 = true;
			}
			iterator = aList2262.iterator();
			while (iterator.hasNext()) {
				Class479 class479 = (Class479) iterator.next();
				class479.method5787(-1555976534);
				class479.method5789((short) -14625);
				Class481 class481 = class479.method5772(2136720276);
				if (class479.method5814((byte) 0) == this) {
					if (class481 == Class481.aClass481_5427 || Class481.aClass481_5426 == class481) {
						if ((class479.method5776((byte) -117) == Class198.aClass198_2213) || (class479.method5776((byte) -82) == Class198.aClass198_2203)) {
							if (class479 == aClass479_2276) {
								aBool2284 = false;
								aClass479_2276 = null;
								class479.method5766((byte) 95);
								aList2282.remove(class479);
							} else {
								int i_2_ = class479.method5768(-1560430780).method443(1282183062);
								boolean bool = (method2996(Class188.aClass188_2128.method2788(-691227711), (short) 13625) > 0.0F);
								if (false == aBool2287 && bool) {
									if (-285395575 * anInt2271 == i_2_) {
										method2997(i_2_, 1342057561);
										anInt2271 = 954347335;
									}
									class479.method5766((byte) 60);
									aList2282.remove(class479);
								} else if (i_2_ == -1591235157 * anInt2263) {
									anInt2263 = 443685629;
									aBool2287 = false;
									class479.method5766((byte) 99);
									aList2282.remove(class479);
									Iterator iterator_3_ = aList2262.iterator();
									while (iterator_3_.hasNext()) {
										Class479 class479_4_ = (Class479) iterator_3_.next();
										if (class479_4_.method5776((byte) -117) == Class198.aClass198_2213) {
											int i_5_ = class479_4_.method5768(-735359523).method443(1843306710);
											if ((anInt2271 * -285395575 == i_5_ && ((class479_4_.method5772(2006527630)) == (Class481.aClass481_5427))) || (class479_4_.method5772(1850025004) == Class481.aClass481_5420) || (class479_4_.method5772(2003892762) == Class481.aClass481_5425) || (class479_4_.method5772(1844479142) == (Class481.aClass481_5422))) {
												if (class479_4_.method5772(1856761917) == Class481.aClass481_5427)
													class479_4_.method5771((short) 10467);
												else
													class479_4_.method5790((byte) -59);
												break;
											}
										}
									}
								} else if (bool) {
									if (!aBool2287 || i_2_ != anInt2271 * -285395575) {
										class479.method5766((byte) 66);
										aList2282.remove(class479);
									}
									if (false == aBool2287 && i_2_ == anInt2271 * -285395575) {
										anInt2271 = 954347335;
										aClass479_2270 = null;
									}
								}
							}
						} else {
							Iterator iterator_6_ = aHashMap2274.keySet().iterator();
							while (iterator_6_.hasNext()) {
								int i_7_ = ((Integer) iterator_6_.next()).intValue();
								Class215 class215 = ((Class215) aHashMap2274.get(Integer.valueOf(i_7_)));
								if (class215.method3086((byte) 14).contains(class479)) {
									class215.method3087(class479, -1514968501);
									break;
								}
							}
							class479.method5766((byte) 121);
							aList2282.remove(class479);
						}
					} else if ((class479.method5772(1779564955) != Class481.aClass481_5424) && (class479.method5777((byte) 95) == Class188.aClass188_2128.method2788(-1247611731))) {
						boolean bool = (method2996(Class188.aClass188_2128.method2788(-267064087), (short) 31590) > 1.0E-4F);
						if (!bool)
							class479.method5774(150, (byte) 32);
					}
				}
			}
		}
	}

	List method2988(byte i) {
		return aList2282;
	}

	public void method2989(int i, int i_8_) {
		if (anInt2271 * -285395575 != i) {
			if (null != aClass479_2276) {
				aClass479_2276.method5774(0, (byte) 32);
				method3002(aClass479_2276, -1092963117);
				aClass479_2276 = null;
			}
			Class479 class479 = method3003(Class198.aClass198_2213, this, i, 0, i_8_, Class188.aClass188_2128.method2788(-31466627), Class207.aClass207_2242, 0.0F, 0.0F, null, 0, 255, true, (byte) 14);
			if (null != class479) {
				class479.method5767(-63354141);
				aClass479_2276 = class479;
			}
			aBool2284 = false;
		}
	}

	public void method2990(int i, int i_9_) {
		Class215 class215 = (Class215) aHashMap2274.get(Integer.valueOf(i));
		if (class215 != null) {
			List list = class215.method3086((byte) 14);
			Iterator iterator = list.iterator();
			while (iterator.hasNext()) {
				Class479 class479 = (Class479) iterator.next();
				if (!class479.method5813(-1787827292))
					class479.method5790((byte) -118);
			}
		}
	}

	void method2991(int i) {
		if (client.aClass106_11322.aClass15_1258 != null && Class426.method5129(client.anInt11101 * -708374433, 1603352511)) {
			Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.aClass414_4509, client.aClass106_11322.aClass15_1258, 1180745134);
			class536_sub23.aClass536_Sub33_Sub2_10528.writeInt(i);
			client.aClass106_11322.method1409(class536_sub23, 389920950);
		}
	}

	public void method2992(int i, int i_10_) {
		Class215 class215 = (Class215) aHashMap2274.get(Integer.valueOf(i));
		if (null != class215) {
			List list = class215.method3086((byte) 14);
			Iterator iterator = list.iterator();
			while (iterator.hasNext()) {
				Class479 class479 = (Class479) iterator.next();
				class479.method5767(1564846140);
			}
		}
	}

	void method2993() {
		Class192 class192 = new Class192(this);
		Class197 class197 = new Class197(this);
		Class228 class228 = new Class228(this);
		Class217 class217 = new Class217(this);
		Class216 class216 = new Class216(this);
		Class264.method3674(Class209.aClass209_2247.method2975(33096476), Class209.aClass209_2246.method2975(33096476), 0.2F, class192, 1460233496);
		Class264.method3674(Class209.aClass209_2248.method2975(33096476), Class209.aClass209_2246.method2975(33096476), 1.0F, class197, -735992120);
		Class264.method3674(Class209.aClass209_2251.method2975(33096476), Class209.aClass209_2246.method2975(33096476), 1.0F, class228, -825647480);
		Class264.method3674(Class209.aClass209_2250.method2975(33096476), Class209.aClass209_2246.method2975(33096476), 0.8F, class217, -1353725688);
		Class264.method3674(Class209.aClass209_2249.method2975(33096476), Class209.aClass209_2246.method2975(33096476), 1.0F, class216, 1002044252);
		Class264.method3674(Class188.aClass188_2128.method2788(-1349157592), Class209.aClass209_2248.method2975(33096476), 1.0F, null, 978622415);
		Class264.method3674(Class188.aClass188_2129.method2788(-70589652), Class209.aClass209_2249.method2975(33096476), 1.0F, null, -1454443917);
		Class264.method3674(Class188.aClass188_2133.method2788(-2017291375), Class209.aClass209_2247.method2975(33096476), 1.0F, null, -938120376);
		Class264.method3674(Class188.aClass188_2130.method2788(-1466579654), Class209.aClass209_2247.method2975(33096476), 1.0F, null, -1247020475);
		Class264.method3674(Class188.aClass188_2136.method2788(-1780260599), Class209.aClass209_2247.method2975(33096476), 1.0F, null, 2050623936);
		Class264.method3674(Class188.aClass188_2132.method2788(-2014957798), Class209.aClass209_2247.method2975(33096476), 1.0F, null, 497932350);
		Class264.method3674(Class188.aClass188_2131.method2788(38923822), Class209.aClass209_2247.method2975(33096476), 1.0F, null, -1282107416);
		Class264.method3674(Class188.aClass188_2134.method2788(-2006575395), Class209.aClass209_2250.method2975(33096476), 1.0F, null, -42981436);
		Class264.method3674(Class188.aClass188_2127.method2788(-635011748), Class188.aClass188_2134.method2788(-9637470), 1.0F, null, -108041111);
		Class264.method3674(Class188.aClass188_2135.method2788(-1272401140), Class188.aClass188_2134.method2788(-1771653958), 1.0F, null, 128165106);
		Class535.method6479(Class188.aClass188_2128.method2788(-1316364346), -805204123).method4771(0.75F, (byte) -3);
	}

	public void method2994(int i, int i_11_, int i_12_, int i_13_) {
		int i_14_ = Class209.aClass209_2246.method2975(33096476);
		if (Class535.method6479(i, 1350654833) == null && (i_11_ == i_14_ || Class535.method6479(i_11_, -1613100446) != null)) {
			float f = (float) i_12_ * 1.5258789E-5F;
			Class264.method3674(i, i_14_ == i_11_ ? -1 : i_11_, f, null, 991797912);
		}
	}

	public void method2995() {
		Class636.method7622(-424475730);
	}

	float method2996(int i, short i_15_) {
		Class374 class374 = Class535.method6479(i, -1704996516);
		float f = 1.0F;
		for (/**/; class374 != null; class374 = class374.method4772(878499962))
			f *= class374.method4770((byte) 102);
		return f;
	}

	void method2997(int i, int i_16_) {
		if (client.aClass106_11322.aClass15_1258 != null && Class426.method5129(client.anInt11101 * -708374433, 1603352511)) {
			Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.aClass414_4509, client.aClass106_11322.aClass15_1258, 798815628);
			class536_sub23.aClass536_Sub33_Sub2_10528.writeInt(i);
			client.aClass106_11322.method1409(class536_sub23, 438047886);
		}
	}

	public void method2998(int i, int i_17_) {
		if (aBool2281 && i >= 0)
			method3000(i, false, -723459231);
	}

	Interface71 method2999(int i, boolean bool, int i_18_) {
		if (!aBool2281)
			return null;
		Interface71 interface71 = (Interface71) (bool ? aClass199_2267.method2886((long) i) : aClass199_2275.method2886((long) i));
		if (interface71 == null) {
			if (bool)
				interface71 = (Interface71) aHashMap2273.get(Integer.valueOf(i));
			else
				interface71 = (Interface71) aHashMap2272.get(Integer.valueOf(i));
		}
		return interface71;
	}

	Interface71 method3000(int i, boolean bool, int i_19_) {
		if (!aBool2281)
			return null;
		Interface71 interface71 = method2999(i, bool, 1709195201);
		if (null == interface71) {
			Class220 class220 = new Class220(this);
			interface71 = Class545.method6611((bool ? Class14.aClass461_164 : Class206_Sub1.aClass461_10024), i, class220, bool, aClass199_2277, 1180693060);
			if (bool)
				aHashMap2273.put(Integer.valueOf(i), interface71);
			else
				aHashMap2272.put(Integer.valueOf(i), interface71);
		}
		return interface71;
	}

	Class479 method3001(Interface71 interface71, byte i) {
		if (!aBool2281)
			return null;
		int i_20_ = 0;
		Iterator iterator = aList2262.iterator();
		while (iterator.hasNext()) {
			Class479 class479 = (Class479) iterator.next();
			i_20_++;
			if (class479.method5772(1775364824) == Class481.aClass481_5428) {
				class479.method5765(interface71, -2057065349);
				return class479;
			}
		}
		if (i_20_ >= 1328942427 * anInt2278)
			return null;
		Class479 class479 = interface71.method456(404659923);
		aList2262.add(class479);
		return class479;
	}

	public void method3002(Class479 class479, int i) {
		class479.method5773(this, (byte) 11);
		aList2282.add(class479);
	}

	public Class479 method3003(Class198 class198, Object object, int i, int i_21_, int i_22_, int i_23_, Class207 class207, float f, float f_24_, Class436 class436, int i_25_, int i_26_, boolean bool, byte i_27_) {
		if (!aBool2281)
			return null;
		if (null == object)
			return null;
		i_22_ = Math.max(0, Math.min(i_22_, 255));
		i_26_ = Math.max(0, i_26_);
		if (class207 != Class207.aClass207_2242 && !method3053(aClass436_2279, class436, f_24_, (byte) 61))
			return null;
		if (i_26_ <= 0)
			i_26_ = 255;
		float f_28_ = (float) i_22_ / 255.0F;
		float f_29_ = (float) i_26_ / 255.0F;
		Interface71 interface71 = method3000(i, bool, -723459231);
		Class479 class479 = method3001(interface71, (byte) 0);
		if (null == class479)
			return null;
		class479.method5773(object, (byte) 69);
		class479.method5778(i_23_, 1477170214);
		if (Class207.aClass207_2242 != class207) {
			class479.method5779(true, 712734199);
			class479.method5810(class436, (short) 26185);
			class479.method5783(f, -144136244);
			class479.method5784(f_24_, 1967936640);
			if (class207 == Class207.aClass207_2241)
				class479.method5780(anInterface55_2289, 437861212);
			else if (class207 == Class207.aClass207_2238)
				class479.method5780(anInterface55_2291, -778801727);
			else if (class207 == Class207.aClass207_2240)
				class479.method5780(anInterface55_2288, -194548163);
			else if (class207 == Class207.aClass207_2239)
				class479.method5780(anInterface55_2290, -128162861);
			else
				class479.method5779(false, 230015827);
		}
		class479.method5788(f_28_, 0, 814137003);
		class479.method5806(i_21_ > 1 || i_21_ < 0, i_21_ > 0 ? i_21_ - 1 : i_21_, 1423663170);
		class479.method5792(f_29_, (byte) -109);
		class479.method5775(class198, 1732882458);
		return class479;
	}

	public void method3004(int i) {
		Class215 class215 = (Class215) aHashMap2274.get(Integer.valueOf(i));
		if (class215 != null) {
			List list = class215.method3086((byte) 14);
			Iterator iterator = list.iterator();
			while (iterator.hasNext()) {
				Class479 class479 = (Class479) iterator.next();
				class479.method5774(50, (byte) 32);
			}
		}
	}

	public void method3005(int i, int i_30_, int i_31_) {
		if (anInt2271 * -285395575 != i) {
			if (null != aClass479_2276) {
				aClass479_2276.method5774(0, (byte) 32);
				method3002(aClass479_2276, -1092963117);
				aClass479_2276 = null;
			}
			Class479 class479 = method3003(Class198.aClass198_2213, this, i, 0, i_30_, Class188.aClass188_2128.method2788(-1601361783), Class207.aClass207_2242, 0.0F, 0.0F, null, 0, 255, true, (byte) 14);
			if (null != class479) {
				class479.method5767(-940346663);
				aClass479_2276 = class479;
			}
			aBool2284 = false;
		}
	}

	public int method3006(int i) {
		return -285395575 * anInt2271;
	}

	public void method3007(int i, int i_32_) {
		anInt2285 = i * -230851121;
	}

	public void method3008(int i, int i_33_) {
		Class215 class215 = (Class215) aHashMap2274.get(Integer.valueOf(i));
		if (class215 != null) {
			List list = class215.method3086((byte) 14);
			Iterator iterator = list.iterator();
			while (iterator.hasNext()) {
				Class479 class479 = (Class479) iterator.next();
				class479.method5774(50, (byte) 32);
			}
		}
	}

	public void method3009(int i, int i_34_) {
		method3010(i, 255, -1546755876);
	}

	public void method3010(int i, int i_35_, int i_36_) {
		method3011(i, i_35_, false, 0, 0, 0, 0, 0, 1754645698);
	}

	public void method3011(int i, int i_37_, boolean bool, int i_38_, int i_39_, int i_40_, int i_41_, int i_42_, int i_43_) {
		if (aBool2281 && i != -285395575 * anInt2271) {
			if (aBool2287 && null != aClass479_2270 && i != anInt2271 * -285395575) {
				aClass479_2270.method5771((short) 25235);
				aClass479_2270.method5766((byte) 18);
				aList2282.remove(aClass479_2270);
			}
			Class479 class479 = method3012(-1555421480);
			if (class479 != null && (class479.method5768(-1630747633).method443(685676075) == i)) {
				aClass479_2270 = class479;
				anInt2271 = (class479.method5768(-1927964542).method443(-631016349) * -954347335);
			} else {
				boolean bool_44_ = false;
				if (-285395575 * anInt2271 >= 0) {
					Iterator iterator = aList2282.iterator();
					while (iterator.hasNext()) {
						Class479 class479_45_ = (Class479) iterator.next();
						if (class479_45_.method5776((byte) -44) == Class198.aClass198_2213) {
							class479_45_.method5774(2000, (byte) 32);
							bool_44_ = true;
						}
					}
				}
				aClass479_2270 = null;
				anInt2271 = 954347335;
				Class479 class479_46_ = null;
				if (aClass479_2276 != null && aClass479_2276.method5768(-891610579) != null && aClass479_2276.method5768(-654618794).method443(326557908) == i && (aClass479_2276.method5772(1776615415) == Class481.aClass481_5422)) {
					class479_46_ = aClass479_2276;
					aClass479_2276 = null;
					aBool2284 = false;
				}
				if (null == class479_46_) {
					if (bool) {
						float f = (float) i_41_;
						float f_47_ = (float) i_42_;
						Class436 class436 = new Class436((float) i_39_, 0.0F, (float) i_40_);
						class479_46_ = method3003(Class198.aClass198_2213, this, i, 0, bool_44_ ? 0 : i_37_, (i == -752588497 * anInt2285 ? Class209.aClass209_2251.method2975(33096476) : Class188.aClass188_2128.method2788(-1843554848)), Class207.aClass207_2239, f, f_47_, class436, i_38_, 255, true, (byte) 14);
					} else
						class479_46_ = method3003(Class198.aClass198_2213, this, i, 0, bool_44_ ? 0 : i_37_, (i == anInt2285 * -752588497 ? Class209.aClass209_2251.method2975(33096476) : Class188.aClass188_2128.method2788(-527014961)), Class207.aClass207_2242, 0.0F, 0.0F, null, 0, 255, true, (byte) 14);
				}
				if (class479_46_ != null) {
					if (bool_44_) {
						float f = (float) i_37_ / 255.0F;
						class479_46_.method5788(f, 2000, 316529015);
					}
					class479_46_.method5790((byte) -37);
					method3002(class479_46_, -1092963117);
					aClass479_2270 = class479_46_;
					anInt2271 = -954347335 * i;
					if (aBool2287)
						aClass479_2270.method5770(595186347);
					if (client.aClass106_11322.aClass15_1258 != null && Class426.method5129(client.anInt11101 * -708374433, 1603352511)) {
						Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.aClass414_4520, (client.aClass106_11322.aClass15_1258), 1986207603);
						class536_sub23.aClass536_Sub33_Sub2_10528.writeInt(-285395575 * anInt2271);
						client.aClass106_11322.method1409(class536_sub23, 1635768727);
					}
				}
			}
		}
	}

	Class479 method3012(int i) {
		Iterator iterator = aList2282.iterator();
		while (iterator.hasNext()) {
			Class479 class479 = (Class479) iterator.next();
			if (class479.method5776((byte) -97) == Class198.aClass198_2213 && class479.method5772(2072251920) == Class481.aClass481_5429)
				return class479;
		}
		return null;
	}

	public void method3013(int i) {
		Iterator iterator = aList2282.iterator();
		while (iterator.hasNext()) {
			Class479 class479 = (Class479) iterator.next();
			if (class479.method5776((byte) -47) == Class198.aClass198_2213) {
				class479.method5774(500, (byte) 32);
				if (class479.method5768(-680753391).method443(-1306928455) == -285395575 * anInt2271) {
					method2997(anInt2271 * -285395575, 1342057561);
					break;
				}
			}
		}
		aClass479_2270 = null;
		anInt2271 = 954347335;
	}

	public void method3014(int i, int i_48_, int i_49_) {
		if (aBool2281 && (!aBool2287 || -1591235157 * anInt2263 != i)) {
			if (aBool2287 && -1591235157 * anInt2263 != i) {
				Iterator iterator = aList2262.iterator();
				while (iterator.hasNext()) {
					Class479 class479 = (Class479) iterator.next();
					if (class479.method5776((byte) -20) == Class198.aClass198_2203) {
						class479.method5766((byte) 121);
						aList2282.remove(class479);
						aBool2287 = false;
						break;
					}
				}
			}
			if (i_48_ != 0 && i != -1) {
				if (!aBool2287 && aClass479_2270 != null)
					aClass479_2270.method5770(1060762065);
				Class479 class479 = method3003(Class198.aClass198_2203, this, i, 0, i_48_, Class188.aClass188_2128.method2788(-1642536739), Class207.aClass207_2242, 0.0F, 0.0F, null, 0, 255, true, (byte) 14);
				if (class479 != null) {
					class479.method5790((byte) -86);
					method3002(class479, -1092963117);
					aBool2287 = true;
					anInt2263 = -443685629 * i;
				}
			}
		}
	}

	public void method3015(Class191 class191, int i, Class649_Sub1 class649_sub1, int i_50_) {
		if (class191 != null && class191.anIntArrayArray2161 != null && i < class191.anIntArrayArray2161.length && null != class191.anIntArrayArray2161[i] && (class649_sub1.aByte10839 == Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.aByte10839) && class649_sub1.method9952((byte) 85)) {
			int i_51_ = class191.anIntArrayArray2161[i][0];
			int i_52_ = i_51_ >> 8;
			int i_53_ = i_51_ >> 5 & 0x7;
			int i_54_ = i_51_ & 0x1f;
			if (class191.anIntArrayArray2161[i].length > 1) {
				int i_55_ = (int) (Math.random() * (double) (class191.anIntArrayArray2161[i]).length);
				if (i_55_ > 0)
					i_52_ = class191.anIntArrayArray2161[i][i_55_];
			}
			int i_56_ = 256;
			if (class191.anIntArray2173 != null && null != class191.anIntArray2174)
				i_56_ = ((int) (Math.random() * (double) (class191.anIntArray2174[i] - class191.anIntArray2173[i])) + class191.anIntArray2173[i]);
			int i_57_ = (class191.anIntArray2172 == null ? 255 : class191.anIntArray2172[i]);
			if (0 == i_54_) {
				if (class649_sub1 == Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591)
					method3030(Class198.aClass198_2208, i_52_, i_53_, i_57_, Class188.aClass188_2130.method2788(-1611829038), Class207.aClass207_2242, 0.0F, 0.0F, null, class649_sub1.aByte10839, i_56_, 0, (byte) 11);
			} else {
				if (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591 == class649_sub1) {
					if (ClientSetting.aClass536_Sub40_8843.soundVolumeSetting.method10213(1443536621) == 0)
						return;
				} else if (ClientSetting.aClass536_Sub40_8843.bgSoundVolumeSetting.method10213(2120680915) == 0)
					return;
				if (-1 != class191.anInt2159 * -621579199) {
					int i_58_ = 0;
					if (class649_sub1 instanceof Class649_Sub1_Sub5_Sub1)
						i_58_ = ((Class649_Sub1_Sub5_Sub1) class649_sub1).method10886(2069179218);
					else if (class649_sub1 instanceof Class649_Sub1_Sub5_Sub4)
						i_58_ = ((Class649_Sub1_Sub5_Sub4) class649_sub1).method11027(526970163);
					else if (class649_sub1 instanceof Class649_Sub1_Sub5_Sub6)
						i_58_ = ((Class649_Sub1_Sub5_Sub6) class649_sub1).method11051(369251180);
					if (i_58_ != 0 && i_58_ != Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.method10886(2064614880) && i_58_ != client.anInt11002 * 1696506681) {
						i_57_ = class191.anInt2159 * -621579199 * i_57_ / 100;
						if (i_57_ < 0)
							i_57_ = 0;
						else if (i_57_ > 255)
							i_57_ = 255;
					}
				}
				Class436 class436 = class649_sub1.method7837().aClass436_4823;
				int i_59_ = (int) class436.aFloat4850 - 256 >> 9;
				int i_60_ = (int) class436.aFloat4853 - 256 >> 9;
				Class436 class436_61_ = new Class436((float) (i_59_ << 9), 0.0F, (float) (i_60_ << 9));
				int i_62_ = class649_sub1.aByte10839 << 24;
				method3030(Class198.aClass198_2209, i_52_, i_53_, i_57_, Class188.aClass188_2136.method2788(-1556919660), ((class649_sub1 != Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591) ? Class207.aClass207_2240 : Class207.aClass207_2242), 0.0F, (float) (i_54_ << 9), class436_61_, i_62_, i_56_, 0, (byte) 34);
			}
		}
	}

	public void method3016(Class191 class191, int i, int i_63_) {
		if (null != class191 && class191.anIntArrayArray2161 != null && i < class191.anIntArrayArray2161.length && class191.anIntArrayArray2161[i] != null) {
			int i_64_ = class191.anIntArrayArray2161[i][0];
			int i_65_ = i_64_ >> 8;
			int i_66_ = i_64_ >> 5 & 0x7;
			if (class191.anIntArrayArray2161[i].length > 1) {
				int i_67_ = (int) (Math.random() * (double) (class191.anIntArrayArray2161[i]).length);
				if (i_67_ > 0)
					i_65_ = class191.anIntArrayArray2161[i][i_67_];
			}
			int i_68_ = 256;
			if (class191.anIntArray2173 != null && null != class191.anIntArray2174)
				i_68_ = (int) ((double) class191.anIntArray2173[i] + (Math.random() * (double) (class191.anIntArray2174[i] - class191.anIntArray2173[i])));
			int i_69_ = (null == class191.anIntArray2172 ? 255 : class191.anIntArray2172[i]);
			method3030(Class198.aClass198_2212, i_65_, i_66_, i_69_, Class188.aClass188_2136.method2788(-737093754), Class207.aClass207_2242, 0.0F, 0.0F, null, 0, i_68_, 0, (byte) 107);
		}
	}

	public void method3017(int i) {
		Class215 class215 = (Class215) aHashMap2274.get(Integer.valueOf(i));
		if (class215 != null) {
			List list = class215.method3086((byte) 14);
			Iterator iterator = list.iterator();
			while (iterator.hasNext()) {
				Class479 class479 = (Class479) iterator.next();
				if (!class479.method5813(-928068936))
					class479.method5790((byte) -92);
			}
		}
	}

	Class199 method3018(int i) {
		return aClass199_2267;
	}

	void method3019(int i) {
		Class192 class192 = new Class192(this);
		Class197 class197 = new Class197(this);
		Class228 class228 = new Class228(this);
		Class217 class217 = new Class217(this);
		Class216 class216 = new Class216(this);
		Class264.method3674(Class209.aClass209_2247.method2975(33096476), Class209.aClass209_2246.method2975(33096476), 0.2F, class192, 1016575114);
		Class264.method3674(Class209.aClass209_2248.method2975(33096476), Class209.aClass209_2246.method2975(33096476), 1.0F, class197, -269121247);
		Class264.method3674(Class209.aClass209_2251.method2975(33096476), Class209.aClass209_2246.method2975(33096476), 1.0F, class228, 473410257);
		Class264.method3674(Class209.aClass209_2250.method2975(33096476), Class209.aClass209_2246.method2975(33096476), 0.8F, class217, 712386484);
		Class264.method3674(Class209.aClass209_2249.method2975(33096476), Class209.aClass209_2246.method2975(33096476), 1.0F, class216, 431049787);
		Class264.method3674(Class188.aClass188_2128.method2788(-1796500511), Class209.aClass209_2248.method2975(33096476), 1.0F, null, 761236894);
		Class264.method3674(Class188.aClass188_2129.method2788(-1751357480), Class209.aClass209_2249.method2975(33096476), 1.0F, null, -390021245);
		Class264.method3674(Class188.aClass188_2133.method2788(-292756678), Class209.aClass209_2247.method2975(33096476), 1.0F, null, -55025561);
		Class264.method3674(Class188.aClass188_2130.method2788(-2078734747), Class209.aClass209_2247.method2975(33096476), 1.0F, null, 826049799);
		Class264.method3674(Class188.aClass188_2136.method2788(-1715698870), Class209.aClass209_2247.method2975(33096476), 1.0F, null, 1999848191);
		Class264.method3674(Class188.aClass188_2132.method2788(-1200710740), Class209.aClass209_2247.method2975(33096476), 1.0F, null, 272186031);
		Class264.method3674(Class188.aClass188_2131.method2788(-1954015656), Class209.aClass209_2247.method2975(33096476), 1.0F, null, -731435724);
		Class264.method3674(Class188.aClass188_2134.method2788(-1173596297), Class209.aClass209_2250.method2975(33096476), 1.0F, null, 514501366);
		Class264.method3674(Class188.aClass188_2127.method2788(-63041013), Class188.aClass188_2134.method2788(45822468), 1.0F, null, 520141763);
		Class264.method3674(Class188.aClass188_2135.method2788(-1050399655), Class188.aClass188_2134.method2788(-1426208831), 1.0F, null, -565694402);
		Class535.method6479(Class188.aClass188_2128.method2788(-1898047908), -169677334).method4771(0.75F, (byte) -49);
	}

	Class436 method3020() {
		return aClass436_2279;
	}

	Class436 method3021() {
		return aClass436_2279;
	}

	public void method3022() {
		if (aBool2281) {
			Class555.method6801((short) -17022);
			if (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591 != null && (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.method7837() != null)) {
				if (aClass436_2279 == null)
					aClass436_2279 = new Class436();
				aClass436_2279.aFloat4850 = (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.method7837().aClass436_4823.aFloat4850);
				aClass436_2279.aFloat4852 = 0.0F;
				aClass436_2279.aFloat4853 = (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.method7837().aClass436_4823.aFloat4853);
			}
			Iterator iterator = aHashMap2272.values().iterator();
			while (iterator.hasNext()) {
				Interface71 interface71 = (Interface71) iterator.next();
				interface71.method332((byte) 0);
			}
			iterator = aHashMap2273.values().iterator();
			while (iterator.hasNext()) {
				Interface71 interface71 = (Interface71) iterator.next();
				interface71.method332((byte) 0);
			}
			iterator = aList2283.iterator();
			while (iterator.hasNext()) {
				Interface71 interface71 = (Interface71) iterator.next();
				if (interface71.method439(1319858677))
					aHashMap2273.remove(Integer.valueOf(interface71.method443(-268301358)));
				else
					aHashMap2272.remove(Integer.valueOf(interface71.method443(-1936297333)));
			}
			aList2283.clear();
			if (aClass479_2276 != null && (aClass479_2276.method5772(2039992432) == Class481.aClass481_5422) && !aBool2284 && client.aClass106_11322.aClass15_1258 != null && Class426.method5129(client.anInt11101 * -708374433, 1603352511)) {
				Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.aClass414_4520, client.aClass106_11322.aClass15_1258, 586645652);
				class536_sub23.aClass536_Sub33_Sub2_10528.writeInt(aClass479_2276.method5768(-1697141079).method443(-1192868702));
				client.aClass106_11322.method1409(class536_sub23, 447494696);
				aBool2284 = true;
			}
			iterator = aList2262.iterator();
			while (iterator.hasNext()) {
				Class479 class479 = (Class479) iterator.next();
				class479.method5787(-635876373);
				class479.method5789((short) -22963);
				Class481 class481 = class479.method5772(2008918697);
				if (class479.method5814((byte) 0) == this) {
					if (class481 == Class481.aClass481_5427 || Class481.aClass481_5426 == class481) {
						if ((class479.method5776((byte) -83) == Class198.aClass198_2213) || (class479.method5776((byte) -121) == Class198.aClass198_2203)) {
							if (class479 == aClass479_2276) {
								aBool2284 = false;
								aClass479_2276 = null;
								class479.method5766((byte) 22);
								aList2282.remove(class479);
							} else {
								int i = class479.method5768(-1438302571).method443(-1594437996);
								boolean bool = (method2996(Class188.aClass188_2128.method2788(-93531068), (short) 22607) > 0.0F);
								if (false == aBool2287 && bool) {
									if (-285395575 * anInt2271 == i) {
										method2997(i, 1342057561);
										anInt2271 = 954347335;
									}
									class479.method5766((byte) 31);
									aList2282.remove(class479);
								} else if (i == -1591235157 * anInt2263) {
									anInt2263 = 443685629;
									aBool2287 = false;
									class479.method5766((byte) 63);
									aList2282.remove(class479);
									Iterator iterator_70_ = aList2262.iterator();
									while (iterator_70_.hasNext()) {
										Class479 class479_71_ = (Class479) iterator_70_.next();
										if (class479_71_.method5776((byte) -75) == Class198.aClass198_2213) {
											int i_72_ = class479_71_.method5768(-717282370).method443(924713167);
											if (((anInt2271 * -285395575 == i_72_) && ((class479_71_.method5772(1943964150)) == (Class481.aClass481_5427))) || (class479_71_.method5772(1915596389) == Class481.aClass481_5420) || (class479_71_.method5772(1829709080) == Class481.aClass481_5425) || (class479_71_.method5772(2009678502) == (Class481.aClass481_5422))) {
												if (class479_71_.method5772(2109376528) == Class481.aClass481_5427)
													class479_71_.method5771((short) 32529);
												else
													class479_71_.method5790((byte) -5);
												break;
											}
										}
									}
								} else if (bool) {
									if (!aBool2287 || i != anInt2271 * -285395575) {
										class479.method5766((byte) 65);
										aList2282.remove(class479);
									}
									if (false == aBool2287 && i == anInt2271 * -285395575) {
										anInt2271 = 954347335;
										aClass479_2270 = null;
									}
								}
							}
						} else {
							Iterator iterator_73_ = aHashMap2274.keySet().iterator();
							while (iterator_73_.hasNext()) {
								int i = ((Integer) iterator_73_.next()).intValue();
								Class215 class215 = ((Class215) aHashMap2274.get(Integer.valueOf(i)));
								if (class215.method3086((byte) 14).contains(class479)) {
									class215.method3087(class479, -1365297707);
									break;
								}
							}
							class479.method5766((byte) 81);
							aList2282.remove(class479);
						}
					} else if ((class479.method5772(2090363838) != Class481.aClass481_5424) && (class479.method5777((byte) 127) == Class188.aClass188_2128.method2788(-1334842142))) {
						boolean bool = method2996(Class188.aClass188_2128.method2788(-1369913121), (short) 20940) > 1.0E-4F;
						if (!bool)
							class479.method5774(150, (byte) 32);
					}
				}
			}
		}
	}

	public void method3023(int i) {
		if (aBool2281 && i >= 0)
			method3000(i, false, -723459231);
	}

	public void method3024() {
		if (aBool2281) {
			Class555.method6801((short) -3281);
			if (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591 != null && (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.method7837() != null)) {
				if (aClass436_2279 == null)
					aClass436_2279 = new Class436();
				aClass436_2279.aFloat4850 = (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.method7837().aClass436_4823.aFloat4850);
				aClass436_2279.aFloat4852 = 0.0F;
				aClass436_2279.aFloat4853 = (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.method7837().aClass436_4823.aFloat4853);
			}
			Iterator iterator = aHashMap2272.values().iterator();
			while (iterator.hasNext()) {
				Interface71 interface71 = (Interface71) iterator.next();
				interface71.method332((byte) 0);
			}
			iterator = aHashMap2273.values().iterator();
			while (iterator.hasNext()) {
				Interface71 interface71 = (Interface71) iterator.next();
				interface71.method332((byte) 0);
			}
			iterator = aList2283.iterator();
			while (iterator.hasNext()) {
				Interface71 interface71 = (Interface71) iterator.next();
				if (interface71.method439(2065187100))
					aHashMap2273.remove(Integer.valueOf(interface71.method443(-59718458)));
				else
					aHashMap2272.remove(Integer.valueOf(interface71.method443(1299136928)));
			}
			aList2283.clear();
			if (aClass479_2276 != null && (aClass479_2276.method5772(1800204420) == Class481.aClass481_5422) && !aBool2284 && client.aClass106_11322.aClass15_1258 != null && Class426.method5129(client.anInt11101 * -708374433, 1603352511)) {
				Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.aClass414_4520, client.aClass106_11322.aClass15_1258, 747542416);
				class536_sub23.aClass536_Sub33_Sub2_10528.writeInt(aClass479_2276.method5768(-1723560632).method443(701291849));
				client.aClass106_11322.method1409(class536_sub23, 773713930);
				aBool2284 = true;
			}
			iterator = aList2262.iterator();
			while (iterator.hasNext()) {
				Class479 class479 = (Class479) iterator.next();
				class479.method5787(1200823541);
				class479.method5789((short) -4922);
				Class481 class481 = class479.method5772(2066669890);
				if (class479.method5814((byte) 0) == this) {
					if (class481 == Class481.aClass481_5427 || Class481.aClass481_5426 == class481) {
						if ((class479.method5776((byte) -101) == Class198.aClass198_2213) || (class479.method5776((byte) -83) == Class198.aClass198_2203)) {
							if (class479 == aClass479_2276) {
								aBool2284 = false;
								aClass479_2276 = null;
								class479.method5766((byte) 13);
								aList2282.remove(class479);
							} else {
								int i = class479.method5768(-1781463797).method443(-504907721);
								boolean bool = (method2996(Class188.aClass188_2128.method2788(-1050395149), (short) 26695) > 0.0F);
								if (false == aBool2287 && bool) {
									if (-285395575 * anInt2271 == i) {
										method2997(i, 1342057561);
										anInt2271 = 954347335;
									}
									class479.method5766((byte) 93);
									aList2282.remove(class479);
								} else if (i == -1591235157 * anInt2263) {
									anInt2263 = 443685629;
									aBool2287 = false;
									class479.method5766((byte) 50);
									aList2282.remove(class479);
									Iterator iterator_74_ = aList2262.iterator();
									while (iterator_74_.hasNext()) {
										Class479 class479_75_ = (Class479) iterator_74_.next();
										if (class479_75_.method5776((byte) -74) == Class198.aClass198_2213) {
											int i_76_ = class479_75_.method5768(-1529816259).method443(378038802);
											if (((anInt2271 * -285395575 == i_76_) && ((class479_75_.method5772(1836859656)) == (Class481.aClass481_5427))) || (class479_75_.method5772(1948625836) == Class481.aClass481_5420) || (class479_75_.method5772(1939703252) == Class481.aClass481_5425) || (class479_75_.method5772(2004232486) == (Class481.aClass481_5422))) {
												if (class479_75_.method5772(1761685757) == Class481.aClass481_5427)
													class479_75_.method5771((short) 24042);
												else
													class479_75_.method5790((byte) -70);
												break;
											}
										}
									}
								} else if (bool) {
									if (!aBool2287 || i != anInt2271 * -285395575) {
										class479.method5766((byte) 70);
										aList2282.remove(class479);
									}
									if (false == aBool2287 && i == anInt2271 * -285395575) {
										anInt2271 = 954347335;
										aClass479_2270 = null;
									}
								}
							}
						} else {
							Iterator iterator_77_ = aHashMap2274.keySet().iterator();
							while (iterator_77_.hasNext()) {
								int i = ((Integer) iterator_77_.next()).intValue();
								Class215 class215 = ((Class215) aHashMap2274.get(Integer.valueOf(i)));
								if (class215.method3086((byte) 14).contains(class479)) {
									class215.method3087(class479, -2071277309);
									break;
								}
							}
							class479.method5766((byte) 29);
							aList2282.remove(class479);
						}
					} else if ((class479.method5772(1946954748) != Class481.aClass481_5424) && (class479.method5777((byte) 95) == Class188.aClass188_2128.method2788(-1719772498))) {
						boolean bool = (method2996(Class188.aClass188_2128.method2788(-149758275), (short) 4898) > 1.0E-4F);
						if (!bool)
							class479.method5774(150, (byte) 32);
					}
				}
			}
		}
	}

	public void method3025(int i, int i_78_, int i_79_) {
		Class374 class374 = Class535.method6479(i, 1072430096);
		if (null != class374) {
			float f = 1.5258789E-5F * (float) i_78_;
			class374.method4771(f, (byte) -4);
		}
	}

	public void method3026() {
		Class636.method7622(-130375796);
	}

	public void method3027() {
		Class636.method7622(1688585969);
	}

	public void method3028(int i) {
		Class215 class215 = (Class215) aHashMap2274.get(Integer.valueOf(i));
		if (class215 != null) {
			List list = class215.method3086((byte) 14);
			Iterator iterator = list.iterator();
			while (iterator.hasNext()) {
				Class479 class479 = (Class479) iterator.next();
				if (!class479.method5813(-1273466256))
					class479.method5790((byte) -118);
			}
		}
	}

	public void method3029() {
		if (aBool2281) {
			Class555.method6801((short) 15896);
			if (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591 != null && (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.method7837() != null)) {
				if (aClass436_2279 == null)
					aClass436_2279 = new Class436();
				aClass436_2279.aFloat4850 = (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.method7837().aClass436_4823.aFloat4850);
				aClass436_2279.aFloat4852 = 0.0F;
				aClass436_2279.aFloat4853 = (Class565.aClass649_Sub1_Sub5_Sub1_Sub2_7591.method7837().aClass436_4823.aFloat4853);
			}
			Iterator iterator = aHashMap2272.values().iterator();
			while (iterator.hasNext()) {
				Interface71 interface71 = (Interface71) iterator.next();
				interface71.method332((byte) 0);
			}
			iterator = aHashMap2273.values().iterator();
			while (iterator.hasNext()) {
				Interface71 interface71 = (Interface71) iterator.next();
				interface71.method332((byte) 0);
			}
			iterator = aList2283.iterator();
			while (iterator.hasNext()) {
				Interface71 interface71 = (Interface71) iterator.next();
				if (interface71.method439(1884649741))
					aHashMap2273.remove(Integer.valueOf(interface71.method443(-723873564)));
				else
					aHashMap2272.remove(Integer.valueOf(interface71.method443(1601524161)));
			}
			aList2283.clear();
			if (aClass479_2276 != null && (aClass479_2276.method5772(1905310666) == Class481.aClass481_5422) && !aBool2284 && client.aClass106_11322.aClass15_1258 != null && Class426.method5129(client.anInt11101 * -708374433, 1603352511)) {
				Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.aClass414_4520, client.aClass106_11322.aClass15_1258, 1677775739);
				class536_sub23.aClass536_Sub33_Sub2_10528.writeInt(aClass479_2276.method5768(-615993355).method443(231795503));
				client.aClass106_11322.method1409(class536_sub23, 1641208636);
				aBool2284 = true;
			}
			iterator = aList2262.iterator();
			while (iterator.hasNext()) {
				Class479 class479 = (Class479) iterator.next();
				class479.method5787(-1088818958);
				class479.method5789((short) -6712);
				Class481 class481 = class479.method5772(1856908775);
				if (class479.method5814((byte) 0) == this) {
					if (class481 == Class481.aClass481_5427 || Class481.aClass481_5426 == class481) {
						if ((class479.method5776((byte) -41) == Class198.aClass198_2213) || (class479.method5776((byte) -113) == Class198.aClass198_2203)) {
							if (class479 == aClass479_2276) {
								aBool2284 = false;
								aClass479_2276 = null;
								class479.method5766((byte) 127);
								aList2282.remove(class479);
							} else {
								int i = class479.method5768(-693880005).method443(1568056718);
								boolean bool = (method2996(Class188.aClass188_2128.method2788(-1952353769), (short) 32564) > 0.0F);
								if (false == aBool2287 && bool) {
									if (-285395575 * anInt2271 == i) {
										method2997(i, 1342057561);
										anInt2271 = 954347335;
									}
									class479.method5766((byte) 53);
									aList2282.remove(class479);
								} else if (i == -1591235157 * anInt2263) {
									anInt2263 = 443685629;
									aBool2287 = false;
									class479.method5766((byte) 121);
									aList2282.remove(class479);
									Iterator iterator_80_ = aList2262.iterator();
									while (iterator_80_.hasNext()) {
										Class479 class479_81_ = (Class479) iterator_80_.next();
										if (class479_81_.method5776((byte) -98) == Class198.aClass198_2213) {
											int i_82_ = class479_81_.method5768(-895424648).method443(2046546974);
											if (((anInt2271 * -285395575 == i_82_) && ((class479_81_.method5772(2129860444)) == (Class481.aClass481_5427))) || (class479_81_.method5772(2050132075) == Class481.aClass481_5420) || (class479_81_.method5772(2132261176) == Class481.aClass481_5425) || (class479_81_.method5772(1801769948) == (Class481.aClass481_5422))) {
												if (class479_81_.method5772(1922756863) == Class481.aClass481_5427)
													class479_81_.method5771((short) 20951);
												else
													class479_81_.method5790((byte) -57);
												break;
											}
										}
									}
								} else if (bool) {
									if (!aBool2287 || i != anInt2271 * -285395575) {
										class479.method5766((byte) 71);
										aList2282.remove(class479);
									}
									if (false == aBool2287 && i == anInt2271 * -285395575) {
										anInt2271 = 954347335;
										aClass479_2270 = null;
									}
								}
							}
						} else {
							Iterator iterator_83_ = aHashMap2274.keySet().iterator();
							while (iterator_83_.hasNext()) {
								int i = ((Integer) iterator_83_.next()).intValue();
								Class215 class215 = ((Class215) aHashMap2274.get(Integer.valueOf(i)));
								if (class215.method3086((byte) 14).contains(class479)) {
									class215.method3087(class479, -1669062835);
									break;
								}
							}
							class479.method5766((byte) 111);
							aList2282.remove(class479);
						}
					} else if ((class479.method5772(2020543606) != Class481.aClass481_5424) && (class479.method5777((byte) 109) == Class188.aClass188_2128.method2788(-1039617850))) {
						boolean bool = (method2996(Class188.aClass188_2128.method2788(-980140450), (short) 17003) > 1.0E-4F);
						if (!bool)
							class479.method5774(150, (byte) 32);
					}
				}
			}
		}
	}

	public void method3030(Class198 class198, int i, int i_84_, int i_85_, int i_86_, Class207 class207, float f, float f_87_, Class436 class436, int i_88_, int i_89_, int i_90_, byte i_91_) {
		if (aBool2281) {
			Class479 class479 = method3003(class198, this, i, i_84_, i_85_, i_86_, class207, f, f_87_, class436, i_88_, i_89_, false, (byte) 14);
			if (null != class479) {
				if (0 == i_90_)
					class479.method5790((byte) -104);
				else
					class479.method5785(i_90_, false, (byte) 0);
				method3002(class479, -1092963117);
			}
		}
	}

	public void method3031(int i) {
		Class215 class215 = (Class215) aHashMap2274.get(Integer.valueOf(i));
		if (null != class215) {
			List list = class215.method3086((byte) 14);
			Iterator iterator = list.iterator();
			while (iterator.hasNext()) {
				Class479 class479 = (Class479) iterator.next();
				class479.method5767(-516909682);
			}
		}
	}

	public void method3032(int i) {
		Class215 class215 = (Class215) aHashMap2274.get(Integer.valueOf(i));
		if (null != class215) {
			List list = class215.method3086((byte) 14);
			Iterator iterator = list.iterator();
			while (iterator.hasNext()) {
				Class479 class479 = (Class479) iterator.next();
				class479.method5767(38451891);
			}
		}
	}

	void method3033() {
		Class192 class192 = new Class192(this);
		Class197 class197 = new Class197(this);
		Class228 class228 = new Class228(this);
		Class217 class217 = new Class217(this);
		Class216 class216 = new Class216(this);
		Class264.method3674(Class209.aClass209_2247.method2975(33096476), Class209.aClass209_2246.method2975(33096476), 0.2F, class192, -869458376);
		Class264.method3674(Class209.aClass209_2248.method2975(33096476), Class209.aClass209_2246.method2975(33096476), 1.0F, class197, -688672305);
		Class264.method3674(Class209.aClass209_2251.method2975(33096476), Class209.aClass209_2246.method2975(33096476), 1.0F, class228, 719136409);
		Class264.method3674(Class209.aClass209_2250.method2975(33096476), Class209.aClass209_2246.method2975(33096476), 0.8F, class217, 1028329345);
		Class264.method3674(Class209.aClass209_2249.method2975(33096476), Class209.aClass209_2246.method2975(33096476), 1.0F, class216, -647379101);
		Class264.method3674(Class188.aClass188_2128.method2788(-154226669), Class209.aClass209_2248.method2975(33096476), 1.0F, null, -1979234616);
		Class264.method3674(Class188.aClass188_2129.method2788(-1218793477), Class209.aClass209_2249.method2975(33096476), 1.0F, null, 436084476);
		Class264.method3674(Class188.aClass188_2133.method2788(-959362892), Class209.aClass209_2247.method2975(33096476), 1.0F, null, -1933117789);
		Class264.method3674(Class188.aClass188_2130.method2788(-58166712), Class209.aClass209_2247.method2975(33096476), 1.0F, null, -1994059736);
		Class264.method3674(Class188.aClass188_2136.method2788(-341534684), Class209.aClass209_2247.method2975(33096476), 1.0F, null, -629922296);
		Class264.method3674(Class188.aClass188_2132.method2788(-349926290), Class209.aClass209_2247.method2975(33096476), 1.0F, null, 1127929129);
		Class264.method3674(Class188.aClass188_2131.method2788(-1957331569), Class209.aClass209_2247.method2975(33096476), 1.0F, null, 321902029);
		Class264.method3674(Class188.aClass188_2134.method2788(-1004399597), Class209.aClass209_2250.method2975(33096476), 1.0F, null, 489322981);
		Class264.method3674(Class188.aClass188_2127.method2788(-1962082160), Class188.aClass188_2134.method2788(-1654668365), 1.0F, null, 1758357146);
		Class264.method3674(Class188.aClass188_2135.method2788(-2130305944), Class188.aClass188_2134.method2788(-1395477420), 1.0F, null, 1103238479);
		Class535.method6479(Class188.aClass188_2128.method2788(-1681720185), 984743780).method4771(0.75F, (byte) -95);
	}

	void method3034(int[] is, byte i) {
		if (aBool2281 && is != null) {
			int[] is_92_ = is;
			for (int i_93_ = 0; i_93_ < is_92_.length; i_93_++) {
				int i_94_ = is_92_[i_93_];
				method2998(i_94_, 2146362086);
			}
		}
	}

	public void method3035(int i) {
		anInt2285 = i * -230851121;
	}

	public void method3036(int i, int i_95_) {
		Class374 class374 = Class535.method6479(i, 935016383);
		if (null != class374) {
			float f = 1.5258789E-5F * (float) i_95_;
			class374.method4771(f, (byte) -47);
		}
	}

	public void method3037(int i, int i_96_) {
		Class374 class374 = Class535.method6479(i, 86738402);
		if (null != class374) {
			float f = 1.5258789E-5F * (float) i_96_;
			class374.method4771(f, (byte) -125);
		}
	}

	public void method3038(int i, int i_97_, int i_98_) {
		if (!aBool2281) {
			anInt2278 = -1475126573 * i;
			aClass199_2275 = new Class199(i_97_, 100);
			aClass199_2267 = new Class199(10);
			aClass199_2275.method2890(new Class201(this), (byte) -4);
			Class641 class641 = new Class641(Class376.aClass376_3913);
			Class303.method4104(class641, -963422316);
			method3019(2093870838);
			anInt2271 = 954347335;
			aBool2281 = true;
		}
	}

	public void method3039(int i) {
		method3010(i, 255, 1477192707);
	}

	public void method3040(int i) {
		Iterator iterator = aList2282.iterator();
		while (iterator.hasNext()) {
			Class479 class479 = (Class479) iterator.next();
			int i_99_ = class479.method5777((byte) 96);
			boolean bool = Class507.method6168(i_99_, i, (byte) 107);
			if (bool)
				class479.method5774(50, (byte) 32);
		}
	}

	public void method3041(int i) {
		Class636.method7622(777269432);
	}

	public void method3042(int i, int i_100_) {
		if (anInt2271 * -285395575 != i) {
			if (null != aClass479_2276) {
				aClass479_2276.method5774(0, (byte) 32);
				method3002(aClass479_2276, -1092963117);
				aClass479_2276 = null;
			}
			Class479 class479 = method3003(Class198.aClass198_2213, this, i, 0, i_100_, Class188.aClass188_2128.method2788(-827676234), Class207.aClass207_2242, 0.0F, 0.0F, null, 0, 255, true, (byte) 14);
			if (null != class479) {
				class479.method5767(1514588551);
				aClass479_2276 = class479;
			}
			aBool2284 = false;
		}
	}

	public int method3043() {
		return -285395575 * anInt2271;
	}

	public void method3044(int i) {
		Class215 class215 = (Class215) aHashMap2274.get(Integer.valueOf(i));
		if (class215 != null) {
			List list = class215.method3086((byte) 14);
			Iterator iterator = list.iterator();
			while (iterator.hasNext()) {
				Class479 class479 = (Class479) iterator.next();
				class479.method5774(50, (byte) 32);
			}
		}
	}

	public void method3045(int i, int i_101_) {
		method3011(i, i_101_, false, 0, 0, 0, 0, 0, 1842166363);
	}

	public void method3046(int i) {
		anInt2285 = i * -230851121;
	}

	public void method3047(int i) {
		anInt2285 = i * -230851121;
	}

	public void method3048(int i) {
		anInt2285 = i * -230851121;
	}

	public void method3049(int i) {
		anInt2285 = i * -230851121;
	}

	public int method3050() {
		return -752588497 * anInt2285;
	}

	void method3051(int i) {
		if (client.aClass106_11322.aClass15_1258 != null && Class426.method5129(client.anInt11101 * -708374433, 1603352511)) {
			Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.aClass414_4509, client.aClass106_11322.aClass15_1258, 1756851484);
			class536_sub23.aClass536_Sub33_Sub2_10528.writeInt(i);
			client.aClass106_11322.method1409(class536_sub23, 39572284);
		}
	}

	List method3052(int i) {
		return aList2283;
	}

	boolean method3053(Class436 class436, Class436 class436_102_, float f, byte i) {
		Class436 class436_103_ = Class436.method5252(class436_102_, class436);
		if (class436_103_.method5291() >= f)
			return false;
		return true;
	}

	public void method3054(int i, int i_104_) {
		method3011(i, i_104_, false, 0, 0, 0, 0, 0, 1774384758);
	}

	public void method3055(int i, int i_105_) {
		method3011(i, i_105_, false, 0, 0, 0, 0, 0, 1738153174);
	}

	public void method3056(int i) {
		Class215 class215 = (Class215) aHashMap2274.get(Integer.valueOf(i));
		if (null != class215) {
			List list = class215.method3086((byte) 14);
			Iterator iterator = list.iterator();
			while (iterator.hasNext()) {
				Class479 class479 = (Class479) iterator.next();
				class479.method5767(1063716761);
			}
		}
	}

	public void method3057() {
		Iterator iterator = aList2282.iterator();
		while (iterator.hasNext()) {
			Class479 class479 = (Class479) iterator.next();
			if (class479.method5776((byte) -7) == Class198.aClass198_2213) {
				class479.method5774(500, (byte) 32);
				if (class479.method5768(-1419371219).method443(-233617448) == -285395575 * anInt2271) {
					method2997(anInt2271 * -285395575, 1342057561);
					break;
				}
			}
		}
		aClass479_2270 = null;
		anInt2271 = 954347335;
	}

	public void method3058() {
		Iterator iterator = aList2282.iterator();
		while (iterator.hasNext()) {
			Class479 class479 = (Class479) iterator.next();
			if (class479.method5776((byte) -90) == Class198.aClass198_2213) {
				class479.method5774(500, (byte) 32);
				if (class479.method5768(-1565592767).method443(-1863571476) == -285395575 * anInt2271) {
					method2997(anInt2271 * -285395575, 1342057561);
					break;
				}
			}
		}
		aClass479_2270 = null;
		anInt2271 = 954347335;
	}

	public int method3059(byte i) {
		return -752588497 * anInt2285;
	}

	public void method3060(int i, int i_106_) {
		Iterator iterator = aList2282.iterator();
		while (iterator.hasNext()) {
			Class479 class479 = (Class479) iterator.next();
			int i_107_ = class479.method5777((byte) 97);
			boolean bool = Class507.method6168(i_107_, i, (byte) 11);
			if (bool)
				class479.method5774(50, (byte) 32);
		}
	}

	static final void method3061(Class668 class668, byte i) {
		class668.anInt8542 -= 1472892954;
		int i_108_ = class668.anIntArray8541[1867269829 * class668.anInt8542];
		int i_109_ = class668.anIntArray8541[class668.anInt8542 * 1867269829 + 1];
		Class73 class73 = ((Class73) Class207.aClass34_Sub22_2244.method70(i_109_, (byte) 120));
		if (class73.method1128((byte) 16))
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = ((Class191) Class45.aClass34_Sub11_529.method70(i_108_, (byte) -80)).method2830(i_109_, class73.aString805, 1028133390);
		else
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = (((Class191) Class45.aClass34_Sub11_529.method70(i_108_, (byte) -23)).method2829(i_109_, class73.anInt803 * 1566477951, -844689793));
	}

	static final void method3062(Class668 class668, int i) {
		int i_110_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = (((Class191) Class45.aClass34_Sub11_529.method70(i_110_, (byte) 89)).anInt2176) * 1356056491;
	}

	static final void method3063(Class668 class668, int i) {
		ClientSetting.aClass536_Sub40_8843.method9857(ClientSetting.aClass536_Sub40_8843.flickeringSetting, (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]) == 1 ? 1 : 0, (byte) 1);
		Class27.method763(1900152233);
		client.aBool11015 = false;
	}

	static final void method3064(Class668 class668, byte i) {
		int i_111_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		Class536_Sub18_Sub14 class536_sub18_sub14 = Class542.method6563(i_111_);
		if (class536_sub18_sub14 == null)
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -1;
		else
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 1243816017 * class536_sub18_sub14.anInt11764;
	}

	public static boolean method3065(int i, int i_112_) {
		return 0 == i || i == 2;
	}

	static final void method3066(Class668 class668, int i) {
		Class596.anInt7830 = 0;
	}
}
