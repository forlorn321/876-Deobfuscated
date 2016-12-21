/* Class492 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class492 {
	Interface43 anInterface43_5474;
	int anInt5475;
	int anInt5476;
	int anInt5477;
	float[] aFloatArray5478;
	boolean aBool5479;
	int anInt5480;
	float aFloat5481;
	Interface58 anInterface58_5482;
	int anInt5483;
	int anInt5484;
	boolean aBool5485;
	int anInt5486 = 0;
	int anInt5487;
	int anInt5488;
	Object anObject5489;
	byte[] aByteArray5490;
	int anInt5491;
	int anInt5492;
	int anInt5493;
	int anInt5494;
	int[] anIntArray5495;
	boolean aBool5496;
	int[] anIntArray5497;
	int[] anIntArray5498;
	boolean aBool5499;
	Class475 aClass475_5500;
	Class484[] aClass484Array5501;
	Class360 aClass360_5502;
	boolean aBool5503;
	Interface55 anInterface55_5504;
	Object anObject5505;
	float aFloat5506;
	int anInt5507;
	int anInt5508;
	boolean aBool5509;
	float aFloat5510;
	int anInt5511;
	boolean aBool5512;
	int anInt5513;
	float aFloat5514;
	boolean aBool5515;
	float aFloat5516;
	long aLong5517;
	long aLong5518;
	int anInt5519;
	int anInt5520;
	boolean aBool5521;
	int anInt5522;
	float aFloat5523;
	int anInt5524;

	void method5887() {
		aBool5485 = true;
	}

	public Class475 method5888(byte i) {
		return aClass475_5500;
	}

	void method5889(Class475 class475, byte i) {
		aClass475_5500 = class475;
	}

	boolean method5890(int i) {
		return aClass475_5500 == Class475.aClass475_5377;
	}

	public void method5891(byte i) {
		if (method5888((byte) 16).anInt5381 * 2043370079 >= 2043370079 * Class475.aClass475_5378.anInt5381)
			throw new RuntimeException("");
		method5889(Class475.aClass475_5378, (byte) 34);
	}

	public void method5892(int i) {
		if (method5888((byte) 112).anInt5381 * 2043370079 < Class475.aClass475_5378.anInt5381 * 2043370079)
			throw new RuntimeException("");
		anObject5505 = null;
		method5889(Class475.aClass475_5380, (byte) 5);
	}

	boolean method5893(byte[] is, Interface58 interface58, int i, float f, boolean bool, boolean bool_0_, int i_1_, float f_2_, Object object, int i_3_) {
		synchronized (this) {
			if (interface58 != null) {
				aByteArray5490 = null;
				anInterface58_5482 = interface58;
			} else
				aByteArray5490 = is;
			anObject5505 = object;
			anInt5475 = i * 2083126431;
			aFloat5523 = f;
			aBool5479 = bool_0_;
			anInt5480 = 371125089 * i_1_;
			aFloat5481 = f_2_;
			byte[] is_4_ = null;
			if (null != aByteArray5490)
				is_4_ = aByteArray5490;
			else if (null != anInterface58_5482) {
				anInt5483 = 0;
				is_4_ = anInterface58_5482.method365(404459863 * anInt5483, (byte) 100);
			}
			if (null != is_4_) {
				RSByteBuffer class536_sub33 = new RSByteBuffer(is_4_);
				if (class536_sub33.readUnsignedByte(-1596906375) != 74 || class536_sub33.readUnsignedByte(-899125192) != 65 || class536_sub33.readUnsignedByte(118168251) != 71 || class536_sub33.readUnsignedByte(236772352) != 65)
					throw new RuntimeException("");
				anInt5524 = class536_sub33.method9709(-1740666315) * 269118443;
				anInt5491 = class536_sub33.method9709(-756084200) * 1414429427;
				anInt5493 = class536_sub33.method9709(173497277) * 752681551;
				anInt5520 = class536_sub33.method9709(-1819727512) * -729674031;
				anInt5494 = class536_sub33.method9709(-1550542587) * 1103211933;
				if (anObject5489 == null) {
					anObject5489 = aClass360_5502.method4728(1037503025 * anInt5520, anInt5493 * -1436625745, anInterface43_5474.method291(), anInterface43_5474.method294(), -22869281 * anInt5487, aFloat5481, (byte) -26);
					if (anObject5489 == null) {
						method5889(Class475.aClass475_5374, (byte) 7);
						boolean bool_5_ = false;
						return bool_5_;
					}
				}
				anIntArray5495 = new int[1165836469 * anInt5494];
				anIntArray5498 = new int[anInt5494 * 1165836469];
				anIntArray5497 = new int[anInt5494 * 1165836469];
				int i_6_ = (anInt5494 * 736757160 + -810172525 * class536_sub33.off);
				for (int i_7_ = 0; i_7_ < 1165836469 * anInt5494; i_7_++) {
					anIntArray5495[i_7_] = i_6_;
					anIntArray5498[i_7_] = class536_sub33.method9709(-1295570240);
					anIntArray5497[i_7_] = class536_sub33.method9709(-876268804);
					i_6_ += anIntArray5498[i_7_];
				}
				anInt5477 = class536_sub33.off * 1263018237;
				aClass484Array5501 = new Class484[1708148925 * anInt5507];
				aFloatArray5478 = new float[2];
				for (int i_8_ = 0; i_8_ < aFloatArray5478.length; i_8_++)
					aFloatArray5478[i_8_] = 1.0F;
				if (anObject5505 instanceof Class479) {
					Interface71 interface71 = ((Class479) anObject5505).method5768(-203390285);
					aBool5521 = interface71.method446(-173378926);
					aBool5496 = !aBool5521;
				}
				anInterface43_5474.method323(aBool5496, (aBool5479 ? anInt5480 * 2005465249 : 0), 800613571 * anInt5524, 1499868731 * anInt5491);
				if (anInterface58_5482 != null) {
					int i_9_ = (class536_sub33.buffer.length - 60379087 * anInt5477);
					byte[] is_10_ = Class705.method8269(i_9_, true, 768798937);
					System.arraycopy(class536_sub33.buffer, anInt5477 * 60379087, is_10_, 0, i_9_);
					class536_sub33.buffer = is_10_;
					class536_sub33.off = i_9_ * 516175515;
					anInterface43_5474.method63(class536_sub33);
					anInt5483 += 839510631;
				} else
					aBool5503 = true;
				boolean bool_11_ = true;
				return bool_11_;
			}
			boolean bool_12_ = is_4_ != null;
			return bool_12_;
		}
	}

	void method5894(int i) {
		synchronized (this) {
			method5905(749206174);
		}
	}

	public void method5895() {
		if ((method5888((byte) 27).anInt5381 * 2043370079 >= Class475.aClass475_5372.anInt5381 * 2043370079) && (method5888((byte) 90).anInt5381 * 2043370079 < Class475.aClass475_5377.anInt5381 * 2043370079) && method5931(417965456)) {
			synchronized (this) {
				anInterface43_5474.method295();
				method5910(685574029);
			}
			Thread.yield();
		}
	}

	void method5896(Interface55 interface55, int i) {
		anInterface55_5504 = interface55;
		if (null != anInterface55_5504)
			anInterface55_5504.method360(anObject5505, aFloatArray5478, null, (byte) 16);
	}

	boolean method5897() {
		return Class475.aClass475_5374 == aClass475_5500;
	}

	void method5898(int i) {
		Class374 class374 = aClass360_5502.method4756(-1467887104).method4717(anInt5475 * 1689001823, -108544516);
		aFloat5506 = null != class374 ? class374.method4773(-66299414) : 1.0F;
		float f = null != class374 ? class374.method4776((byte) 26) : 0.1F;
		f *= aFloat5523;
		float f_13_ = aFloatArray5478.length > 0 ? 0.0F : 1.0F;
		for (int i_14_ = 0; i_14_ < aFloatArray5478.length; i_14_++) {
			if (aFloatArray5478[i_14_] > f_13_)
				f_13_ = aFloatArray5478[i_14_];
		}
		f *= f_13_;
		if (!method5931(235771047))
			f = -1.0F;
		if (method5899((byte) 79) != f) {
			method5900(f, (byte) 3);
			aBool5515 = true;
		}
	}

	public float method5899(byte i) {
		return aFloat5514;
	}

	void method5900(float f, byte i) {
		synchronized (this) {
			aFloat5514 = f;
		}
	}

	public boolean method5901(int i) {
		return aBool5515;
	}

	void method5902(boolean bool, int i) {
		aBool5503 = bool;
	}

	public void method5903() {
		if (method5888((byte) 66).anInt5381 * 2043370079 >= 2043370079 * Class475.aClass475_5378.anInt5381)
			throw new RuntimeException("");
		method5889(Class475.aClass475_5378, (byte) 20);
	}

	void method5904(byte i) {
		synchronized (this) {
			if (anInterface43_5474.method289() == Class369.aClass369_3870) {
				if (null != anObject5489) {
					int i_15_ = aClass360_5502.method4727(anObject5489, -1421899370);
					if (i_15_ >= anInt5487 * -22869281) {
						aClass360_5502.method4729(anObject5489, -882238357);
						anObject5489 = null;
						method5889(Class475.aClass475_5373, (byte) 86);
					}
				} else
					method5889(Class475.aClass475_5373, (byte) 36);
			}
		}
		method5963((byte) -97);
	}

	void method5905(int i) {
		if (method5888((byte) 98) != Class475.aClass475_5377 && (method5888((byte) 43).anInt5381 * 2043370079 < Class475.aClass475_5372.anInt5381 * 2043370079)) {
			method5889(Class475.aClass475_5372, (byte) 14);
			aBool5499 = true;
			method5906(1307366290);
			method5898(-246292710);
		}
	}

	void method5906(int i) {
		if (aBool5499 == true && (method5888((byte) 12).anInt5381 * 2043370079 >= Class475.aClass475_5372.anInt5381 * 2043370079) && (method5888((byte) 54).anInt5381 * 2043370079 < 2043370079 * Class475.aClass475_5374.anInt5381) && anInterface55_5504 != null && aFloat5523 == aFloat5516)
			anInterface55_5504.method360(anObject5505, aFloatArray5478, null, (byte) 101);
	}

	void method5907() {
		synchronized (this) {
			int i = method5918(-1532338895);
			if (aBool5521 && i > anInt5519 * 1486721285 && anInterface43_5474.method315()) {
				/* empty */
			} else {
				Class369 class369 = anInterface43_5474.method289();
				if (aBool5503 && Class369.aClass369_3873 != class369) {
					if (null != aByteArray5490) {
						if (-434564505 * anInt5492 >= anInt5494 * 1165836469) {
							anInterface43_5474.method63(null);
							anInt5492 = 0;
						} else {
							if (-312036945 * anInt5522 < 60379087 * anInt5477)
								anInt5522 = anInt5477 * -1260557343;
							anInt5522 = (anIntArray5495[-434564505 * anInt5492] + -1736370679 * anInt5513) * -1727707825;
							int i_16_ = anIntArray5498[-434564505 * anInt5492];
							int i_17_ = i_16_;
							int i_18_ = (i_17_ + anInt5513 * -1736370679 > i_16_ ? (i_16_ + anIntArray5495[-434564505 * anInt5492]) : i_17_ + -312036945 * anInt5522);
							Class492 class492_19_ = this;
							class492_19_.anInt5513 = (class492_19_.anInt5513 + ((anInt5522 * -312036945 + i_17_ > aByteArray5490.length) ? (aByteArray5490.length - anInt5522 * -312036945) : i_17_) * 1643599929);
							RSByteBuffer class536_sub33 = new RSByteBuffer(i_18_ - (-312036945 * anInt5522), true);
							if (aByteArray5490 == null)
								throw new RuntimeException("");
							if (null == class536_sub33.buffer)
								throw new RuntimeException("");
							class536_sub33.method9696(aByteArray5490, anInt5522 * -312036945, i_18_ - (anInt5522 * -312036945), (byte) 51);
							anInterface43_5474.method63(class536_sub33);
							method5902(false, -822288670);
							if (anInt5513 * -1736370679 >= i_16_) {
								anInt5492 += -1081218729;
								anInt5513 = 0;
							}
						}
					} else if (anInterface58_5482 != null) {
						if (anInt5483 * 404459863 >= anInt5494 * 1165836469) {
							anInt5483 = 0;
							anInterface43_5474.method63(null);
						} else {
							byte[] is = (anInterface58_5482.method365(anIntArray5497[anInt5483 * 404459863], (byte) 100));
							if (is != null) {
								RSByteBuffer class536_sub33 = new RSByteBuffer(is);
								class536_sub33.off = 516175515 * is.length;
								anInterface43_5474.method63(class536_sub33);
								method5902(false, -822288670);
								anInt5483 += 839510631;
							}
						}
					}
				}
			}
		}
	}

	void method5908(int i) {
		aBool5485 = false;
	}

	void method5909(float f) {
		synchronized (this) {
			aFloat5514 = f;
		}
	}

	void method5910(int i) {
		if (null != aClass484Array5501) {
			boolean bool = true;
			Class369 class369 = anInterface43_5474.method289();
			if (anInterface43_5474.method315()) {
				if (aBool5521 && method5917(anInt5519 * 1486721285, 1096411292)) {
					if (aClass484Array5501[230597895 * anInt5511] == null) {
						RSByteBuffer class536_sub33 = method5916(anInt5519 * 1486721285, (byte) 23);
						if (null != class536_sub33) {
							aClass484Array5501[anInt5511 * 230597895] = new Class484(this, class536_sub33, false);
							int i_20_ = anInterface43_5474.method262();
							int i_21_ = (anInterface43_5474.method173((aClass484Array5501[anInt5511 * 230597895].aClass536_Sub33_5432.off) * -810172525 / i_20_));
							anInt5476 += -2005835759 * i_21_;
							if (!aBool5496 && aBool5479 && anInt5484 * -1563201689 > 0) {
								if (-1098149647 * anInt5476 < anInt5524 * 800613571)
									aClass484Array5501[230597895 * anInt5511] = null;
								else if ((-1098149647 * anInt5476 >= anInt5524 * 800613571) && (-1098149647 * anInt5476 - i_21_ < 800613571 * anInt5524))
									aClass484Array5501[230597895 * anInt5511].anInt5434 = ((anInterface43_5474.method298(i_20_ * (anInt5476 * -1098149647 - anInt5524 * 800613571))) * 31667017);
							}
							anInt5519 += -353791027;
							if (false == aBool5496 && aBool5479 && (-1098149647 * anInt5476 >= 1499868731 * anInt5491) && ((-1563201689 * anInt5484 < anInt5480 * 2005465249) || anInt5480 * 2005465249 < 0)) {
								int i_22_ = (-1098149647 * anInt5476 - 1499868731 * anInt5491);
								int i_23_ = i_21_ - i_22_;
								aClass484Array5501[230597895 * anInt5511].anInt5433 = (anInterface43_5474.method298(i_20_ * i_23_) * -728696753);
								anInt5519 = 0;
								anInt5476 = 0;
								anInt5484 += -1559282601;
							}
							if (aClass484Array5501[230597895 * anInt5511] != null) {
								anInt5511 += -1521633097;
								anInt5511 = (-1521633097 * (anInt5511 * 230597895 % aClass484Array5501.length));
							}
						}
					}
				} else if (!method5919(-1975760868) || !aBool5521) {
					int i_24_ = anInterface43_5474.method9();
					int i_25_ = anInterface43_5474.method173(anInt5487 * -22869281);
					if (!aBool5509 && aClass484Array5501[230597895 * anInt5511] == null) {
						if (Class369.aClass369_3874 != class369 && i_24_ > 0) {
							RSByteBuffer class536_sub33 = method5914(i_25_, 638514152);
							aClass484Array5501[230597895 * anInt5511] = (class536_sub33 != null ? new Class484(this, class536_sub33, false) : null);
							int i_26_ = ((aClass484Array5501[230597895 * anInt5511] != null) ? -810172525 * (aClass484Array5501[230597895 * anInt5511].aClass536_Sub33_5432.off) : 0);
							int i_27_ = anInterface43_5474.method262();
							int i_28_ = anInterface43_5474.method173(i_26_ / i_27_);
							anInt5508 += 642383161 * i_28_;
							if (anInt5508 * -1785732855 > anInt5476 * -1098149647) {
								anInt5476 += -2005835759 * i_28_;
								i_24_ -= i_28_;
								if (false == aBool5496 && aBool5479 && -1563201689 * anInt5484 > 0) {
									if (-1098149647 * anInt5476 < anInt5524 * 800613571)
										aClass484Array5501[(230597895 * anInt5511)] = null;
									else if ((-1098149647 * anInt5476 >= anInt5524 * 800613571) && ((-1098149647 * anInt5476 - i_28_) < 800613571 * anInt5524))
										aClass484Array5501[anInt5511 * 230597895].anInt5434 = ((anInterface43_5474.method298(i_27_ * (-1098149647 * anInt5476 - anInt5524 * 800613571))) * 31667017);
								}
								if (aClass484Array5501[230597895 * anInt5511] != null) {
									if (aBool5521 && !method5917(anInt5519 * 1486721285, 1096411292))
										method5915((aClass484Array5501[anInt5511 * 230597895].aClass536_Sub33_5432), (byte) 23);
									if (!aBool5496 && aBool5479 && (-1098149647 * anInt5476 >= 1499868731 * anInt5491) && ((anInt5484 * -1563201689 <= 2005465249 * anInt5480) || anInt5480 * 2005465249 < 0)) {
										int i_29_ = (anInt5476 * -1098149647 - anInt5491 * 1499868731);
										int i_30_ = i_28_ - i_29_;
										aClass484Array5501[230597895 * anInt5511].anInt5433 = (anInterface43_5474.method298(i_27_ * i_30_) * -728696753);
										anInt5519 = 0;
										anInt5484 += -1559282601;
										anInt5476 = 0;
									} else
										anInt5519 += -353791027;
									anInt5511 += -1521633097;
									anInt5511 = (-1521633097 * (230597895 * anInt5511 % aClass484Array5501.length));
								}
							} else
								aClass484Array5501[anInt5511 * 230597895] = null;
						} else if (class369 == Class369.aClass369_3874 && aBool5479 && !aBool5496 && ((-1563201689 * anInt5484 < anInt5480 * 2005465249) || anInt5480 * 2005465249 < 0))
							anInterface43_5474.method300(true);
					}
				}
			}
			int i_31_ = 0;
			for (int i_32_ = 0; i_32_ < aClass484Array5501.length; i_32_++) {
				if (null != aClass484Array5501[i_32_]) {
					i_31_++;
					bool = false;
				}
			}
			if (!aBool5512 && method5899((byte) -44) >= 0.0F && (i_31_ >= anInt5507 * 1708148925 || class369 == Class369.aClass369_3874 || class369 == Class369.aClass369_3873)) {
				aBool5512 = true;
				method5889(Class475.aClass475_5379, (byte) 98);
			}
			if (anInterface43_5474.method315() && bool && (method5919(-639207761) || aBool5509 || Class369.aClass369_3874 == class369) && (false == aBool5479 || (false == aBool5496 && anInt5484 * -1563201689 >= 2005465249 * anInt5480 && 2005465249 * anInt5480 >= 0))) {
				method5889(Class475.aClass475_5374, (byte) 34);
				aBool5499 = false;
				if (aBool5521)
					method5920((byte) -33);
			}
		}
	}

	void method5911(byte i) {
		if (method5888((byte) 98).anInt5381 * 2043370079 >= 2043370079 * Class475.aClass475_5372.anInt5381) {
			if (method5888((byte) 78) == Class475.aClass475_5380)
				method5904((byte) -64);
			else {
				method5970((byte) -84);
				if (aFloat5523 != aFloat5516) {
					long l = Class249.method3450(1954921920);
					if (l > 6280816253683973025L * aLong5517)
						aFloat5523 = aFloat5516;
					else {
						float f = aFloat5516 - aFloat5510;
						long l_33_ = (aLong5517 * 6280816253683973025L - aLong5518 * 5725544384157460679L);
						float f_34_ = f / (float) l_33_;
						aFloat5523 = ((float) (l - aLong5518 * 5725544384157460679L) * f_34_) + aFloat5510;
						aFloat5523 = Math.max(0.0F, Math.min(1.0F, aFloat5523));
					}
				}
				method5898(578561703);
				if (method5888((byte) 61).anInt5381 * 2043370079 < Class475.aClass475_5377.anInt5381 * 2043370079)
					method5906(1380527814);
			}
		}
	}

	public void method5912(int i) {
		synchronized (this) {
			if (aBool5485) {
				/* empty */
			} else if (null == anObject5489) {
				/* empty */
			} else {
				int i_35_ = aClass360_5502.method4727(anObject5489, -1594496437);
				if (i_35_ <= 0) {
					/* empty */
				} else if (aClass484Array5501 != null && (null != aClass484Array5501[anInt5488 * 2045243951]) && aBool5512) {
					int i_36_ = ((265901925 * anInt5486 + i_35_ > -810172525 * (aClass484Array5501[2045243951 * anInt5488].aClass536_Sub33_5432.off)) ? ((aClass484Array5501[anInt5488 * 2045243951].aClass536_Sub33_5432.off) * -810172525 - 265901925 * anInt5486) : i_35_);
					if (anInt5486 * 265901925 < (aClass484Array5501[2045243951 * anInt5488].anInt5434) * 342634233 && (i_36_ + 265901925 * anInt5486 > 342634233 * (aClass484Array5501[2045243951 * anInt5488].anInt5434)) && (aClass484Array5501[2045243951 * anInt5488].anInt5434) * 342634233 >= 0) {
						anInt5486 += 1834021381 * (aClass484Array5501[anInt5488 * 2045243951].anInt5434) - 1 * anInt5486;
						i_36_ = ((i_35_ + anInt5486 * 265901925 > (aClass484Array5501[anInt5488 * 2045243951].aClass536_Sub33_5432.off) * -810172525) ? ((aClass484Array5501[2045243951 * anInt5488].aClass536_Sub33_5432.off) * -810172525) - anInt5486 * 265901925 : i_35_);
					}
					if ((265901925 * anInt5486 + i_36_ > (aClass484Array5501[anInt5488 * 2045243951].anInt5433) * -282911057) && (aClass484Array5501[anInt5488 * 2045243951].anInt5433) * -282911057 >= 0)
						i_36_ = (-282911057 * (aClass484Array5501[2045243951 * anInt5488].anInt5433) - anInt5486 * 265901925);
					method5913((aClass484Array5501[anInt5488 * 2045243951].aClass536_Sub33_5432.buffer), 265901925 * anInt5486, 265901925 * anInt5486 + i_36_, (byte) 113);
					aClass360_5502.method4745(anObject5489, (aClass484Array5501[2045243951 * anInt5488].aClass536_Sub33_5432.buffer), anInt5486 * 265901925, i_36_, (byte) -80);
					anInt5486 += -340065683 * i_36_;
					i_35_ -= i_36_;
					if ((anInt5486 * 265901925 >= (aClass484Array5501[2045243951 * anInt5488].aClass536_Sub33_5432.off) * -810172525) || (anInt5486 * 265901925 >= (aClass484Array5501[anInt5488 * 2045243951].anInt5433) * -282911057 && -282911057 * (aClass484Array5501[anInt5488 * 2045243951].anInt5433) >= 0)) {
						aClass484Array5501[2045243951 * anInt5488].method5841(213579417);
						aClass484Array5501[2045243951 * anInt5488] = null;
						anInt5488 += -711945009;
						anInt5488 = -711945009 * (2045243951 * anInt5488 % aClass484Array5501.length);
						anInt5486 = 0;
					}
				}
			}
		}
	}

	void method5913(byte[] is, int i, int i_37_, byte i_38_) {
		int i_39_ = i;
		int i_40_ = 0;
		int i_41_ = anInterface43_5474.method291().anInt3933 * 2067142005;
		while (i_39_ < is.length && i_39_ < i_37_) {
			float f = aFloatArray5478[i_40_] * (aFloat5523 * aFloat5506);
			if (16 == i_41_) {
				int i_42_ = (is[1 + i_39_] << 8) + (is[i_39_] & 0xff);
				i_42_ *= f * f;
				is[i_39_++] = (byte) i_42_;
				is[i_39_++] = (byte) (i_42_ >> 8);
			} else if (8 == i_41_) {
				byte i_43_ = is[i_39_];
				i_43_ *= f;
				is[i_39_++] = i_43_;
			} else
				throw new RuntimeException("");
			i_40_ = ++i_40_ % aFloatArray5478.length;
		}
	}

	RSByteBuffer method5914(int i, int i_44_) {
		return anInterface43_5474.method313(i);
	}

	void method5915(RSByteBuffer class536_sub33, byte i) {
		if (anObject5505 != null && anObject5505 instanceof Class479) {
			Class479 class479 = (Class479) anObject5505;
			Interface71 interface71 = class479.method5768(-466624248);
			byte[] is = new byte[class536_sub33.off * -810172525];
			System.arraycopy(class536_sub33.buffer, 0, is, 0, class536_sub33.off * -810172525);
			RSByteBuffer class536_sub33_45_ = new RSByteBuffer(is);
			class536_sub33_45_.off = 1 * class536_sub33.off;
			interface71.method445(class536_sub33_45_, (byte) 1);
		}
	}

	RSByteBuffer method5916(int i, byte i_46_) {
		if (null != anObject5505 && anObject5505 instanceof Class479) {
			Class479 class479 = (Class479) anObject5505;
			Interface71 interface71 = class479.method5768(-1728498155);
			RSByteBuffer class536_sub33 = interface71.method457(i, -4702004);
			RSByteBuffer class536_sub33_47_ = new RSByteBuffer(class536_sub33.off * -810172525, true);
			class536_sub33_47_.method9790(class536_sub33, -1130044229);
			return class536_sub33_47_;
		}
		return null;
	}

	boolean method5917(int i, int i_48_) {
		if (anObject5505 != null && anObject5505 instanceof Class479) {
			Class479 class479 = (Class479) anObject5505;
			Interface71 interface71 = class479.method5768(-1521196256);
			return interface71.method447(i, (byte) 14);
		}
		return false;
	}

	int method5918(int i) {
		if (null != anObject5505 && anObject5505 instanceof Class479) {
			Class479 class479 = (Class479) anObject5505;
			Interface71 interface71 = class479.method5768(-1494482130);
			return interface71.method455((byte) 80);
		}
		return 0;
	}

	boolean method5919(int i) {
		synchronized (this) {
			if (null != anObject5505 && anObject5505 instanceof Class479) {
				Class479 class479 = (Class479) anObject5505;
				Interface71 interface71 = class479.method5768(-820137680);
				if (null != interface71) {
					boolean bool = interface71.method450((byte) -16);
					return bool;
				}
			}
			boolean bool = false;
			return bool;
		}
	}

	void method5920(byte i) {
		synchronized (this) {
			if (null != anObject5505 && anObject5505 instanceof Class479) {
				Class479 class479 = (Class479) anObject5505;
				Interface71 interface71 = class479.method5768(-849733725);
				if (null != interface71)
					interface71.method449(true, 2078016604);
			}
		}
	}

	Object method5921(int i) {
		return anObject5505;
	}

	float method5922(int i) {
		return aFloat5523;
	}

	public void method5923(int i) {
		if ((method5888((byte) 25).anInt5381 * 2043370079 >= Class475.aClass475_5372.anInt5381 * 2043370079) && (method5888((byte) 60).anInt5381 * 2043370079 < Class475.aClass475_5377.anInt5381 * 2043370079) && method5931(1827774951)) {
			synchronized (this) {
				anInterface43_5474.method295();
				method5910(-1137314874);
			}
			Thread.yield();
		}
	}

	void method5924() {
		synchronized (this) {
			if (anInterface43_5474.method289() == Class369.aClass369_3870) {
				if (null != anObject5489) {
					int i = aClass360_5502.method4727(anObject5489, 1519419793);
					if (i >= anInt5487 * -22869281) {
						aClass360_5502.method4729(anObject5489, -650940328);
						anObject5489 = null;
						method5889(Class475.aClass475_5373, (byte) 61);
					}
				} else
					method5889(Class475.aClass475_5373, (byte) 116);
			}
		}
		method5963((byte) 41);
	}

	void method5925() {
		if (aBool5499 == true && (method5888((byte) 127).anInt5381 * 2043370079 >= Class475.aClass475_5372.anInt5381 * 2043370079) && (method5888((byte) 89).anInt5381 * 2043370079 < 2043370079 * Class475.aClass475_5374.anInt5381) && anInterface55_5504 != null && aFloat5523 == aFloat5516)
			anInterface55_5504.method360(anObject5505, aFloatArray5478, null, (byte) -91);
	}

	boolean method5926() {
		return Class475.aClass475_5374 == aClass475_5500;
	}

	int method5927() {
		if (null != anObject5505 && anObject5505 instanceof Class479) {
			Class479 class479 = (Class479) anObject5505;
			Interface71 interface71 = class479.method5768(-1878082243);
			return interface71.method455((byte) 21);
		}
		return 0;
	}

	float method5928() {
		return aFloat5523;
	}

	public void method5929() {
		synchronized (this) {
			if (method5888((byte) 90) == Class475.aClass475_5377 || (method5888((byte) 58).anInt5381 * 2043370079 < 2043370079 * Class475.aClass475_5378.anInt5381)) {
				/* empty */
			} else
				method5889(Class475.aClass475_5377, (byte) 114);
		}
	}

	void method5930() {
		synchronized (this) {
			aByteArray5490 = null;
			anInt5475 = 0;
			aFloat5523 = 0.0F;
			aFloat5506 = 0.0F;
			aBool5479 = false;
			anInt5480 = 0;
			aFloat5481 = 1.0F;
			anInterface58_5482 = null;
			anInt5483 = 0;
			anInt5522 = 0;
			if (null != aClass484Array5501) {
				for (int i = 0; i < aClass484Array5501.length; i++) {
					if (null != aClass484Array5501[i])
						aClass484Array5501[i].method5841(-1446208111);
				}
			}
			aClass484Array5501 = null;
			aBool5521 = false;
			anInt5488 = 0;
			anInt5524 = 0;
			anInt5491 = 0;
			anInt5520 = 0;
			anInt5493 = 0;
			anInt5494 = 0;
			anIntArray5495 = null;
			anIntArray5498 = null;
			anIntArray5497 = null;
			anInt5477 = 0;
			aBool5499 = false;
			anInterface43_5474.method296();
			aBool5503 = false;
			anInterface55_5504 = null;
			anObject5505 = null;
			anInt5486 = 0;
			anInt5476 = 0;
			anInt5508 = 0;
			aBool5509 = false;
			anInt5492 = 0;
			anInt5511 = 0;
			aBool5512 = false;
			anInt5513 = 0;
			method5900(-1.0F, (byte) 3);
			aBool5515 = false;
			aFloat5516 = 0.0F;
			aLong5517 = 0L;
			aLong5518 = 0L;
			aFloat5510 = 0.0F;
			anInt5519 = 0;
			anInt5484 = 0;
		}
	}

	boolean method5931(int i) {
		if (null == aFloatArray5478)
			return false;
		float f = 0.0F;
		float f_49_ = 0.0F;
		for (int i_50_ = 0; i_50_ < aFloatArray5478.length; i_50_++) {
			float f_51_ = aFloatArray5478[i_50_];
			if (f_51_ * aFloat5523 > f)
				f = f_51_;
			if (f_51_ > f_49_)
				f_49_ = f_51_;
		}
		if (f < 1.0E-5F) {
			if (f_49_ >= 1.0E-5F && aFloat5516 >= 1.0E-5F)
				return true;
			return false;
		}
		return true;
	}

	void method5932() {
		synchronized (this) {
			method5905(926568808);
		}
	}

	public void method5933() {
		synchronized (this) {
			if (method5888((byte) 105) == Class475.aClass475_5377 || (method5888((byte) 76).anInt5381 * 2043370079 < 2043370079 * Class475.aClass475_5378.anInt5381)) {
				/* empty */
			} else
				method5889(Class475.aClass475_5377, (byte) 66);
		}
	}

	void method5934() {
		if (aBool5499 == true && (method5888((byte) 78).anInt5381 * 2043370079 >= Class475.aClass475_5372.anInt5381 * 2043370079) && (method5888((byte) 66).anInt5381 * 2043370079 < 2043370079 * Class475.aClass475_5374.anInt5381) && anInterface55_5504 != null && aFloat5523 == aFloat5516)
			anInterface55_5504.method360(anObject5505, aFloatArray5478, null, (byte) -73);
	}

	void method5935() {
		if (method5888((byte) 80).anInt5381 * 2043370079 >= 2043370079 * Class475.aClass475_5372.anInt5381) {
			if (method5888((byte) 5) == Class475.aClass475_5380)
				method5904((byte) -23);
			else {
				method5970((byte) -92);
				if (aFloat5523 != aFloat5516) {
					long l = Class249.method3450(1832354439);
					if (l > 6280816253683973025L * aLong5517)
						aFloat5523 = aFloat5516;
					else {
						float f = aFloat5516 - aFloat5510;
						long l_52_ = (aLong5517 * 6280816253683973025L - aLong5518 * 5725544384157460679L);
						float f_53_ = f / (float) l_52_;
						aFloat5523 = ((float) (l - aLong5518 * 5725544384157460679L) * f_53_) + aFloat5510;
						aFloat5523 = Math.max(0.0F, Math.min(1.0F, aFloat5523));
					}
				}
				method5898(-486014020);
				if (method5888((byte) 106).anInt5381 * 2043370079 < Class475.aClass475_5377.anInt5381 * 2043370079)
					method5906(1545030390);
			}
		}
	}

	void method5936() {
		if (null != aClass484Array5501) {
			boolean bool = true;
			Class369 class369 = anInterface43_5474.method289();
			if (anInterface43_5474.method315()) {
				if (aBool5521 && method5917(anInt5519 * 1486721285, 1096411292)) {
					if (aClass484Array5501[230597895 * anInt5511] == null) {
						RSByteBuffer class536_sub33 = method5916(anInt5519 * 1486721285, (byte) 27);
						if (null != class536_sub33) {
							aClass484Array5501[anInt5511 * 230597895] = new Class484(this, class536_sub33, false);
							int i = anInterface43_5474.method262();
							int i_54_ = (anInterface43_5474.method173((aClass484Array5501[anInt5511 * 230597895].aClass536_Sub33_5432.off) * -810172525 / i));
							anInt5476 += -2005835759 * i_54_;
							if (!aBool5496 && aBool5479 && anInt5484 * -1563201689 > 0) {
								if (-1098149647 * anInt5476 < anInt5524 * 800613571)
									aClass484Array5501[230597895 * anInt5511] = null;
								else if ((-1098149647 * anInt5476 >= anInt5524 * 800613571) && (-1098149647 * anInt5476 - i_54_ < 800613571 * anInt5524))
									aClass484Array5501[230597895 * anInt5511].anInt5434 = ((anInterface43_5474.method298(i * (anInt5476 * -1098149647 - anInt5524 * 800613571))) * 31667017);
							}
							anInt5519 += -353791027;
							if (false == aBool5496 && aBool5479 && (-1098149647 * anInt5476 >= 1499868731 * anInt5491) && ((-1563201689 * anInt5484 < anInt5480 * 2005465249) || anInt5480 * 2005465249 < 0)) {
								int i_55_ = (-1098149647 * anInt5476 - 1499868731 * anInt5491);
								int i_56_ = i_54_ - i_55_;
								aClass484Array5501[230597895 * anInt5511].anInt5433 = (anInterface43_5474.method298(i * i_56_) * -728696753);
								anInt5519 = 0;
								anInt5476 = 0;
								anInt5484 += -1559282601;
							}
							if (aClass484Array5501[230597895 * anInt5511] != null) {
								anInt5511 += -1521633097;
								anInt5511 = (-1521633097 * (anInt5511 * 230597895 % aClass484Array5501.length));
							}
						}
					}
				} else if (!method5919(259458708) || !aBool5521) {
					int i = anInterface43_5474.method9();
					int i_57_ = anInterface43_5474.method173(anInt5487 * -22869281);
					if (!aBool5509 && aClass484Array5501[230597895 * anInt5511] == null) {
						if (Class369.aClass369_3874 != class369 && i > 0) {
							RSByteBuffer class536_sub33 = method5914(i_57_, 261429773);
							aClass484Array5501[230597895 * anInt5511] = (class536_sub33 != null ? new Class484(this, class536_sub33, false) : null);
							int i_58_ = ((aClass484Array5501[230597895 * anInt5511] != null) ? -810172525 * (aClass484Array5501[230597895 * anInt5511].aClass536_Sub33_5432.off) : 0);
							int i_59_ = anInterface43_5474.method262();
							int i_60_ = anInterface43_5474.method173(i_58_ / i_59_);
							anInt5508 += 642383161 * i_60_;
							if (anInt5508 * -1785732855 > anInt5476 * -1098149647) {
								anInt5476 += -2005835759 * i_60_;
								i -= i_60_;
								if (false == aBool5496 && aBool5479 && -1563201689 * anInt5484 > 0) {
									if (-1098149647 * anInt5476 < anInt5524 * 800613571)
										aClass484Array5501[(230597895 * anInt5511)] = null;
									else if ((-1098149647 * anInt5476 >= anInt5524 * 800613571) && ((-1098149647 * anInt5476 - i_60_) < 800613571 * anInt5524))
										aClass484Array5501[anInt5511 * 230597895].anInt5434 = ((anInterface43_5474.method298(i_59_ * (-1098149647 * anInt5476 - anInt5524 * 800613571))) * 31667017);
								}
								if (aClass484Array5501[230597895 * anInt5511] != null) {
									if (aBool5521 && !method5917(anInt5519 * 1486721285, 1096411292))
										method5915((aClass484Array5501[anInt5511 * 230597895].aClass536_Sub33_5432), (byte) 78);
									if (!aBool5496 && aBool5479 && (-1098149647 * anInt5476 >= 1499868731 * anInt5491) && ((anInt5484 * -1563201689 <= 2005465249 * anInt5480) || anInt5480 * 2005465249 < 0)) {
										int i_61_ = (anInt5476 * -1098149647 - anInt5491 * 1499868731);
										int i_62_ = i_60_ - i_61_;
										aClass484Array5501[230597895 * anInt5511].anInt5433 = (anInterface43_5474.method298(i_59_ * i_62_) * -728696753);
										anInt5519 = 0;
										anInt5484 += -1559282601;
										anInt5476 = 0;
									} else
										anInt5519 += -353791027;
									anInt5511 += -1521633097;
									anInt5511 = (-1521633097 * (230597895 * anInt5511 % aClass484Array5501.length));
								}
							} else
								aClass484Array5501[anInt5511 * 230597895] = null;
						} else if (class369 == Class369.aClass369_3874 && aBool5479 && !aBool5496 && ((-1563201689 * anInt5484 < anInt5480 * 2005465249) || anInt5480 * 2005465249 < 0))
							anInterface43_5474.method300(true);
					}
				}
			}
			int i = 0;
			for (int i_63_ = 0; i_63_ < aClass484Array5501.length; i_63_++) {
				if (null != aClass484Array5501[i_63_]) {
					i++;
					bool = false;
				}
			}
			if (!aBool5512 && method5899((byte) 73) >= 0.0F && (i >= anInt5507 * 1708148925 || class369 == Class369.aClass369_3874 || class369 == Class369.aClass369_3873)) {
				aBool5512 = true;
				method5889(Class475.aClass475_5379, (byte) 90);
			}
			if (anInterface43_5474.method315() && bool && (method5919(-479216819) || aBool5509 || Class369.aClass369_3874 == class369) && (false == aBool5479 || (false == aBool5496 && anInt5484 * -1563201689 >= 2005465249 * anInt5480 && 2005465249 * anInt5480 >= 0))) {
				method5889(Class475.aClass475_5374, (byte) 56);
				aBool5499 = false;
				if (aBool5521)
					method5920((byte) -44);
			}
		}
	}

	void method5937() {
		Class374 class374 = aClass360_5502.method4756(1647580554).method4717(anInt5475 * 1689001823, 636921387);
		aFloat5506 = null != class374 ? class374.method4773(-66299414) : 1.0F;
		float f = null != class374 ? class374.method4776((byte) 96) : 0.1F;
		f *= aFloat5523;
		float f_64_ = aFloatArray5478.length > 0 ? 0.0F : 1.0F;
		for (int i = 0; i < aFloatArray5478.length; i++) {
			if (aFloatArray5478[i] > f_64_)
				f_64_ = aFloatArray5478[i];
		}
		f *= f_64_;
		if (!method5931(1086303628))
			f = -1.0F;
		if (method5899((byte) -27) != f) {
			method5900(f, (byte) 3);
			aBool5515 = true;
		}
	}

	void method5938() {
		Class374 class374 = aClass360_5502.method4756(-29171541).method4717(anInt5475 * 1689001823, 1967327122);
		aFloat5506 = null != class374 ? class374.method4773(-66299414) : 1.0F;
		float f = null != class374 ? class374.method4776((byte) 99) : 0.1F;
		f *= aFloat5523;
		float f_65_ = aFloatArray5478.length > 0 ? 0.0F : 1.0F;
		for (int i = 0; i < aFloatArray5478.length; i++) {
			if (aFloatArray5478[i] > f_65_)
				f_65_ = aFloatArray5478[i];
		}
		f *= f_65_;
		if (!method5931(770824611))
			f = -1.0F;
		if (method5899((byte) 13) != f) {
			method5900(f, (byte) 3);
			aBool5515 = true;
		}
	}

	void method5939() {
		Class374 class374 = aClass360_5502.method4756(1349726972).method4717(anInt5475 * 1689001823, 164438247);
		aFloat5506 = null != class374 ? class374.method4773(-66299414) : 1.0F;
		float f = null != class374 ? class374.method4776((byte) 65) : 0.1F;
		f *= aFloat5523;
		float f_66_ = aFloatArray5478.length > 0 ? 0.0F : 1.0F;
		for (int i = 0; i < aFloatArray5478.length; i++) {
			if (aFloatArray5478[i] > f_66_)
				f_66_ = aFloatArray5478[i];
		}
		f *= f_66_;
		if (!method5931(996769856))
			f = -1.0F;
		if (method5899((byte) -3) != f) {
			method5900(f, (byte) 3);
			aBool5515 = true;
		}
	}

	public void method5940(int i) {
		synchronized (this) {
			method5911((byte) 100);
		}
	}

	public void method5941() {
		if (method5888((byte) 99).anInt5381 * 2043370079 < Class475.aClass475_5378.anInt5381 * 2043370079)
			throw new RuntimeException("");
		anObject5505 = null;
		method5889(Class475.aClass475_5380, (byte) 16);
	}

	void method5942() {
		synchronized (this) {
			method5905(1562709677);
		}
	}

	int method5943() {
		if (null != anObject5505 && anObject5505 instanceof Class479) {
			Class479 class479 = (Class479) anObject5505;
			Interface71 interface71 = class479.method5768(-482077631);
			return interface71.method455((byte) 23);
		}
		return 0;
	}

	void method5944() {
		synchronized (this) {
			int i = method5918(-1134850413);
			if (aBool5521 && i > anInt5519 * 1486721285 && anInterface43_5474.method315()) {
				/* empty */
			} else {
				Class369 class369 = anInterface43_5474.method289();
				if (aBool5503 && Class369.aClass369_3873 != class369) {
					if (null != aByteArray5490) {
						if (-434564505 * anInt5492 >= anInt5494 * 1165836469) {
							anInterface43_5474.method63(null);
							anInt5492 = 0;
						} else {
							if (-312036945 * anInt5522 < 60379087 * anInt5477)
								anInt5522 = anInt5477 * -1260557343;
							anInt5522 = (anIntArray5495[-434564505 * anInt5492] + -1736370679 * anInt5513) * -1727707825;
							int i_67_ = anIntArray5498[-434564505 * anInt5492];
							int i_68_ = i_67_;
							int i_69_ = (i_68_ + anInt5513 * -1736370679 > i_67_ ? (i_67_ + anIntArray5495[-434564505 * anInt5492]) : i_68_ + -312036945 * anInt5522);
							Class492 class492_70_ = this;
							class492_70_.anInt5513 = (class492_70_.anInt5513 + ((anInt5522 * -312036945 + i_68_ > aByteArray5490.length) ? (aByteArray5490.length - anInt5522 * -312036945) : i_68_) * 1643599929);
							RSByteBuffer class536_sub33 = new RSByteBuffer(i_69_ - (-312036945 * anInt5522), true);
							if (aByteArray5490 == null)
								throw new RuntimeException("");
							if (null == class536_sub33.buffer)
								throw new RuntimeException("");
							class536_sub33.method9696(aByteArray5490, anInt5522 * -312036945, i_69_ - (anInt5522 * -312036945), (byte) 126);
							anInterface43_5474.method63(class536_sub33);
							method5902(false, -822288670);
							if (anInt5513 * -1736370679 >= i_67_) {
								anInt5492 += -1081218729;
								anInt5513 = 0;
							}
						}
					} else if (anInterface58_5482 != null) {
						if (anInt5483 * 404459863 >= anInt5494 * 1165836469) {
							anInt5483 = 0;
							anInterface43_5474.method63(null);
						} else {
							byte[] is = (anInterface58_5482.method365(anIntArray5497[anInt5483 * 404459863], (byte) 100));
							if (is != null) {
								RSByteBuffer class536_sub33 = new RSByteBuffer(is);
								class536_sub33.off = 516175515 * is.length;
								anInterface43_5474.method63(class536_sub33);
								method5902(false, -822288670);
								anInt5483 += 839510631;
							}
						}
					}
				}
			}
		}
	}

	void method5945() {
		synchronized (this) {
			int i = method5918(-347949539);
			if (aBool5521 && i > anInt5519 * 1486721285 && anInterface43_5474.method315()) {
				/* empty */
			} else {
				Class369 class369 = anInterface43_5474.method289();
				if (aBool5503 && Class369.aClass369_3873 != class369) {
					if (null != aByteArray5490) {
						if (-434564505 * anInt5492 >= anInt5494 * 1165836469) {
							anInterface43_5474.method63(null);
							anInt5492 = 0;
						} else {
							if (-312036945 * anInt5522 < 60379087 * anInt5477)
								anInt5522 = anInt5477 * -1260557343;
							anInt5522 = (anIntArray5495[-434564505 * anInt5492] + -1736370679 * anInt5513) * -1727707825;
							int i_71_ = anIntArray5498[-434564505 * anInt5492];
							int i_72_ = i_71_;
							int i_73_ = (i_72_ + anInt5513 * -1736370679 > i_71_ ? (i_71_ + anIntArray5495[-434564505 * anInt5492]) : i_72_ + -312036945 * anInt5522);
							Class492 class492_74_ = this;
							class492_74_.anInt5513 = (class492_74_.anInt5513 + ((anInt5522 * -312036945 + i_72_ > aByteArray5490.length) ? (aByteArray5490.length - anInt5522 * -312036945) : i_72_) * 1643599929);
							RSByteBuffer class536_sub33 = new RSByteBuffer(i_73_ - (-312036945 * anInt5522), true);
							if (aByteArray5490 == null)
								throw new RuntimeException("");
							if (null == class536_sub33.buffer)
								throw new RuntimeException("");
							class536_sub33.method9696(aByteArray5490, anInt5522 * -312036945, i_73_ - (anInt5522 * -312036945), (byte) 22);
							anInterface43_5474.method63(class536_sub33);
							method5902(false, -822288670);
							if (anInt5513 * -1736370679 >= i_71_) {
								anInt5492 += -1081218729;
								anInt5513 = 0;
							}
						}
					} else if (anInterface58_5482 != null) {
						if (anInt5483 * 404459863 >= anInt5494 * 1165836469) {
							anInt5483 = 0;
							anInterface43_5474.method63(null);
						} else {
							byte[] is = (anInterface58_5482.method365(anIntArray5497[anInt5483 * 404459863], (byte) 100));
							if (is != null) {
								RSByteBuffer class536_sub33 = new RSByteBuffer(is);
								class536_sub33.off = 516175515 * is.length;
								anInterface43_5474.method63(class536_sub33);
								method5902(false, -822288670);
								anInt5483 += 839510631;
							}
						}
					}
				}
			}
		}
	}

	public Class492(Class489 class489, int i, int i_75_, Interface43 interface43, Class360 class360) {
		anInt5476 = 0;
		anInt5508 = 0;
		anInt5492 = 0;
		anInt5511 = 0;
		anInt5513 = 0;
		aFloat5516 = 0.0F;
		aLong5517 = 0L;
		aLong5518 = 0L;
		aFloat5510 = 0.0F;
		anInt5519 = 0;
		anInt5484 = 0;
		aClass360_5502 = class360;
		method5889(Class475.aClass475_5373, (byte) 110);
		anInt5487 = 1299394847 * i;
		anInt5507 = 616559253 * i_75_;
		anInterface43_5474 = interface43;
		anInt5488 = 0;
		aBool5503 = false;
		anInterface43_5474.method290(new Class477(this));
		method5963((byte) -66);
	}

	void method5946() {
		synchronized (this) {
			if (anInterface43_5474.method289() == Class369.aClass369_3870) {
				if (null != anObject5489) {
					int i = aClass360_5502.method4727(anObject5489, -2066832828);
					if (i >= anInt5487 * -22869281) {
						aClass360_5502.method4729(anObject5489, -2083908455);
						anObject5489 = null;
						method5889(Class475.aClass475_5373, (byte) 41);
					}
				} else
					method5889(Class475.aClass475_5373, (byte) 68);
			}
		}
		method5963((byte) 30);
	}

	void method5947() {
		synchronized (this) {
			if (anInterface43_5474.method289() == Class369.aClass369_3870) {
				if (null != anObject5489) {
					int i = aClass360_5502.method4727(anObject5489, 800810066);
					if (i >= anInt5487 * -22869281) {
						aClass360_5502.method4729(anObject5489, -567273585);
						anObject5489 = null;
						method5889(Class475.aClass475_5373, (byte) 70);
					}
				} else
					method5889(Class475.aClass475_5373, (byte) 63);
			}
		}
		method5963((byte) -27);
	}

	void method5948() {
		if (method5888((byte) 35) != Class475.aClass475_5377 && (method5888((byte) 61).anInt5381 * 2043370079 < Class475.aClass475_5372.anInt5381 * 2043370079)) {
			method5889(Class475.aClass475_5372, (byte) 98);
			aBool5499 = true;
			method5906(1778493525);
			method5898(-1454664333);
		}
	}

	void method5949() {
		if (method5888((byte) 43) != Class475.aClass475_5377 && (method5888((byte) 81).anInt5381 * 2043370079 < Class475.aClass475_5372.anInt5381 * 2043370079)) {
			method5889(Class475.aClass475_5372, (byte) 20);
			aBool5499 = true;
			method5906(822159699);
			method5898(-1690717051);
		}
	}

	void method5950() {
		if (method5888((byte) 63) != Class475.aClass475_5377 && (method5888((byte) 70).anInt5381 * 2043370079 < Class475.aClass475_5372.anInt5381 * 2043370079)) {
			method5889(Class475.aClass475_5372, (byte) 21);
			aBool5499 = true;
			method5906(1463372473);
			method5898(337909873);
		}
	}

	public void method5951() {
		if ((method5888((byte) 107).anInt5381 * 2043370079 >= Class475.aClass475_5372.anInt5381 * 2043370079) && (method5888((byte) 121).anInt5381 * 2043370079 < Class475.aClass475_5377.anInt5381 * 2043370079) && method5931(1180619629)) {
			synchronized (this) {
				anInterface43_5474.method295();
				method5910(-185726481);
			}
			Thread.yield();
		}
	}

	boolean method5952() {
		return aClass475_5500 == Class475.aClass475_5377;
	}

	void method5953() {
		aBool5485 = true;
	}

	void method5954() {
		aBool5485 = true;
	}

	void method5955() {
		aBool5485 = false;
	}

	public void method5956() {
		if ((method5888((byte) 93).anInt5381 * 2043370079 >= Class475.aClass475_5372.anInt5381 * 2043370079) && (method5888((byte) 33).anInt5381 * 2043370079 < Class475.aClass475_5377.anInt5381 * 2043370079) && method5931(1258852860)) {
			synchronized (this) {
				anInterface43_5474.method295();
				method5910(-434009236);
			}
			Thread.yield();
		}
	}

	public void method5957() {
		if ((method5888((byte) 49).anInt5381 * 2043370079 >= Class475.aClass475_5372.anInt5381 * 2043370079) && (method5888((byte) 24).anInt5381 * 2043370079 < Class475.aClass475_5377.anInt5381 * 2043370079) && method5931(-80680573)) {
			synchronized (this) {
				anInterface43_5474.method295();
				method5910(-1020301161);
			}
			Thread.yield();
		}
	}

	void method5958(float f, int i, short i_76_) {
		if (i <= 0) {
			aFloat5523 = f;
			aFloat5516 = aFloat5523;
			aLong5518 = 0L;
			aLong5517 = 0L;
		} else {
			aFloat5510 = aFloat5523;
			aFloat5516 = f;
			aLong5518 = Class249.method3450(1424262898) * -6517718799341709065L;
			aLong5517 = (((long) i + 5725544384157460679L * aLong5518) * 2556942783233091681L);
		}
	}

	public void method5959() {
		synchronized (this) {
			method5911((byte) 76);
		}
	}

	void method5960() {
		if (null != aClass484Array5501) {
			boolean bool = true;
			Class369 class369 = anInterface43_5474.method289();
			if (anInterface43_5474.method315()) {
				if (aBool5521 && method5917(anInt5519 * 1486721285, 1096411292)) {
					if (aClass484Array5501[230597895 * anInt5511] == null) {
						RSByteBuffer class536_sub33 = method5916(anInt5519 * 1486721285, (byte) 55);
						if (null != class536_sub33) {
							aClass484Array5501[anInt5511 * 230597895] = new Class484(this, class536_sub33, false);
							int i = anInterface43_5474.method262();
							int i_77_ = (anInterface43_5474.method173((aClass484Array5501[anInt5511 * 230597895].aClass536_Sub33_5432.off) * -810172525 / i));
							anInt5476 += -2005835759 * i_77_;
							if (!aBool5496 && aBool5479 && anInt5484 * -1563201689 > 0) {
								if (-1098149647 * anInt5476 < anInt5524 * 800613571)
									aClass484Array5501[230597895 * anInt5511] = null;
								else if ((-1098149647 * anInt5476 >= anInt5524 * 800613571) && (-1098149647 * anInt5476 - i_77_ < 800613571 * anInt5524))
									aClass484Array5501[230597895 * anInt5511].anInt5434 = ((anInterface43_5474.method298(i * (anInt5476 * -1098149647 - anInt5524 * 800613571))) * 31667017);
							}
							anInt5519 += -353791027;
							if (false == aBool5496 && aBool5479 && (-1098149647 * anInt5476 >= 1499868731 * anInt5491) && ((-1563201689 * anInt5484 < anInt5480 * 2005465249) || anInt5480 * 2005465249 < 0)) {
								int i_78_ = (-1098149647 * anInt5476 - 1499868731 * anInt5491);
								int i_79_ = i_77_ - i_78_;
								aClass484Array5501[230597895 * anInt5511].anInt5433 = (anInterface43_5474.method298(i * i_79_) * -728696753);
								anInt5519 = 0;
								anInt5476 = 0;
								anInt5484 += -1559282601;
							}
							if (aClass484Array5501[230597895 * anInt5511] != null) {
								anInt5511 += -1521633097;
								anInt5511 = (-1521633097 * (anInt5511 * 230597895 % aClass484Array5501.length));
							}
						}
					}
				} else if (!method5919(-437519850) || !aBool5521) {
					int i = anInterface43_5474.method9();
					int i_80_ = anInterface43_5474.method173(anInt5487 * -22869281);
					if (!aBool5509 && aClass484Array5501[230597895 * anInt5511] == null) {
						if (Class369.aClass369_3874 != class369 && i > 0) {
							RSByteBuffer class536_sub33 = method5914(i_80_, 1013087448);
							aClass484Array5501[230597895 * anInt5511] = (class536_sub33 != null ? new Class484(this, class536_sub33, false) : null);
							int i_81_ = ((aClass484Array5501[230597895 * anInt5511] != null) ? -810172525 * (aClass484Array5501[230597895 * anInt5511].aClass536_Sub33_5432.off) : 0);
							int i_82_ = anInterface43_5474.method262();
							int i_83_ = anInterface43_5474.method173(i_81_ / i_82_);
							anInt5508 += 642383161 * i_83_;
							if (anInt5508 * -1785732855 > anInt5476 * -1098149647) {
								anInt5476 += -2005835759 * i_83_;
								i -= i_83_;
								if (false == aBool5496 && aBool5479 && -1563201689 * anInt5484 > 0) {
									if (-1098149647 * anInt5476 < anInt5524 * 800613571)
										aClass484Array5501[(230597895 * anInt5511)] = null;
									else if ((-1098149647 * anInt5476 >= anInt5524 * 800613571) && ((-1098149647 * anInt5476 - i_83_) < 800613571 * anInt5524))
										aClass484Array5501[anInt5511 * 230597895].anInt5434 = ((anInterface43_5474.method298(i_82_ * (-1098149647 * anInt5476 - anInt5524 * 800613571))) * 31667017);
								}
								if (aClass484Array5501[230597895 * anInt5511] != null) {
									if (aBool5521 && !method5917(anInt5519 * 1486721285, 1096411292))
										method5915((aClass484Array5501[anInt5511 * 230597895].aClass536_Sub33_5432), (byte) 103);
									if (!aBool5496 && aBool5479 && (-1098149647 * anInt5476 >= 1499868731 * anInt5491) && ((anInt5484 * -1563201689 <= 2005465249 * anInt5480) || anInt5480 * 2005465249 < 0)) {
										int i_84_ = (anInt5476 * -1098149647 - anInt5491 * 1499868731);
										int i_85_ = i_83_ - i_84_;
										aClass484Array5501[230597895 * anInt5511].anInt5433 = (anInterface43_5474.method298(i_82_ * i_85_) * -728696753);
										anInt5519 = 0;
										anInt5484 += -1559282601;
										anInt5476 = 0;
									} else
										anInt5519 += -353791027;
									anInt5511 += -1521633097;
									anInt5511 = (-1521633097 * (230597895 * anInt5511 % aClass484Array5501.length));
								}
							} else
								aClass484Array5501[anInt5511 * 230597895] = null;
						} else if (class369 == Class369.aClass369_3874 && aBool5479 && !aBool5496 && ((-1563201689 * anInt5484 < anInt5480 * 2005465249) || anInt5480 * 2005465249 < 0))
							anInterface43_5474.method300(true);
					}
				}
			}
			int i = 0;
			for (int i_86_ = 0; i_86_ < aClass484Array5501.length; i_86_++) {
				if (null != aClass484Array5501[i_86_]) {
					i++;
					bool = false;
				}
			}
			if (!aBool5512 && method5899((byte) -43) >= 0.0F && (i >= anInt5507 * 1708148925 || class369 == Class369.aClass369_3874 || class369 == Class369.aClass369_3873)) {
				aBool5512 = true;
				method5889(Class475.aClass475_5379, (byte) 72);
			}
			if (anInterface43_5474.method315() && bool && (method5919(-1915888461) || aBool5509 || Class369.aClass369_3874 == class369) && (false == aBool5479 || (false == aBool5496 && anInt5484 * -1563201689 >= 2005465249 * anInt5480 && 2005465249 * anInt5480 >= 0))) {
				method5889(Class475.aClass475_5374, (byte) 56);
				aBool5499 = false;
				if (aBool5521)
					method5920((byte) -16);
			}
		}
	}

	void method5961() {
		if (null != aClass484Array5501) {
			boolean bool = true;
			Class369 class369 = anInterface43_5474.method289();
			if (anInterface43_5474.method315()) {
				if (aBool5521 && method5917(anInt5519 * 1486721285, 1096411292)) {
					if (aClass484Array5501[230597895 * anInt5511] == null) {
						RSByteBuffer class536_sub33 = method5916(anInt5519 * 1486721285, (byte) 24);
						if (null != class536_sub33) {
							aClass484Array5501[anInt5511 * 230597895] = new Class484(this, class536_sub33, false);
							int i = anInterface43_5474.method262();
							int i_87_ = (anInterface43_5474.method173((aClass484Array5501[anInt5511 * 230597895].aClass536_Sub33_5432.off) * -810172525 / i));
							anInt5476 += -2005835759 * i_87_;
							if (!aBool5496 && aBool5479 && anInt5484 * -1563201689 > 0) {
								if (-1098149647 * anInt5476 < anInt5524 * 800613571)
									aClass484Array5501[230597895 * anInt5511] = null;
								else if ((-1098149647 * anInt5476 >= anInt5524 * 800613571) && (-1098149647 * anInt5476 - i_87_ < 800613571 * anInt5524))
									aClass484Array5501[230597895 * anInt5511].anInt5434 = ((anInterface43_5474.method298(i * (anInt5476 * -1098149647 - anInt5524 * 800613571))) * 31667017);
							}
							anInt5519 += -353791027;
							if (false == aBool5496 && aBool5479 && (-1098149647 * anInt5476 >= 1499868731 * anInt5491) && ((-1563201689 * anInt5484 < anInt5480 * 2005465249) || anInt5480 * 2005465249 < 0)) {
								int i_88_ = (-1098149647 * anInt5476 - 1499868731 * anInt5491);
								int i_89_ = i_87_ - i_88_;
								aClass484Array5501[230597895 * anInt5511].anInt5433 = (anInterface43_5474.method298(i * i_89_) * -728696753);
								anInt5519 = 0;
								anInt5476 = 0;
								anInt5484 += -1559282601;
							}
							if (aClass484Array5501[230597895 * anInt5511] != null) {
								anInt5511 += -1521633097;
								anInt5511 = (-1521633097 * (anInt5511 * 230597895 % aClass484Array5501.length));
							}
						}
					}
				} else if (!method5919(-870730009) || !aBool5521) {
					int i = anInterface43_5474.method9();
					int i_90_ = anInterface43_5474.method173(anInt5487 * -22869281);
					if (!aBool5509 && aClass484Array5501[230597895 * anInt5511] == null) {
						if (Class369.aClass369_3874 != class369 && i > 0) {
							RSByteBuffer class536_sub33 = method5914(i_90_, 1338419420);
							aClass484Array5501[230597895 * anInt5511] = (class536_sub33 != null ? new Class484(this, class536_sub33, false) : null);
							int i_91_ = ((aClass484Array5501[230597895 * anInt5511] != null) ? -810172525 * (aClass484Array5501[230597895 * anInt5511].aClass536_Sub33_5432.off) : 0);
							int i_92_ = anInterface43_5474.method262();
							int i_93_ = anInterface43_5474.method173(i_91_ / i_92_);
							anInt5508 += 642383161 * i_93_;
							if (anInt5508 * -1785732855 > anInt5476 * -1098149647) {
								anInt5476 += -2005835759 * i_93_;
								i -= i_93_;
								if (false == aBool5496 && aBool5479 && -1563201689 * anInt5484 > 0) {
									if (-1098149647 * anInt5476 < anInt5524 * 800613571)
										aClass484Array5501[(230597895 * anInt5511)] = null;
									else if ((-1098149647 * anInt5476 >= anInt5524 * 800613571) && ((-1098149647 * anInt5476 - i_93_) < 800613571 * anInt5524))
										aClass484Array5501[anInt5511 * 230597895].anInt5434 = ((anInterface43_5474.method298(i_92_ * (-1098149647 * anInt5476 - anInt5524 * 800613571))) * 31667017);
								}
								if (aClass484Array5501[230597895 * anInt5511] != null) {
									if (aBool5521 && !method5917(anInt5519 * 1486721285, 1096411292))
										method5915((aClass484Array5501[anInt5511 * 230597895].aClass536_Sub33_5432), (byte) 72);
									if (!aBool5496 && aBool5479 && (-1098149647 * anInt5476 >= 1499868731 * anInt5491) && ((anInt5484 * -1563201689 <= 2005465249 * anInt5480) || anInt5480 * 2005465249 < 0)) {
										int i_94_ = (anInt5476 * -1098149647 - anInt5491 * 1499868731);
										int i_95_ = i_93_ - i_94_;
										aClass484Array5501[230597895 * anInt5511].anInt5433 = (anInterface43_5474.method298(i_92_ * i_95_) * -728696753);
										anInt5519 = 0;
										anInt5484 += -1559282601;
										anInt5476 = 0;
									} else
										anInt5519 += -353791027;
									anInt5511 += -1521633097;
									anInt5511 = (-1521633097 * (230597895 * anInt5511 % aClass484Array5501.length));
								}
							} else
								aClass484Array5501[anInt5511 * 230597895] = null;
						} else if (class369 == Class369.aClass369_3874 && aBool5479 && !aBool5496 && ((-1563201689 * anInt5484 < anInt5480 * 2005465249) || anInt5480 * 2005465249 < 0))
							anInterface43_5474.method300(true);
					}
				}
			}
			int i = 0;
			for (int i_96_ = 0; i_96_ < aClass484Array5501.length; i_96_++) {
				if (null != aClass484Array5501[i_96_]) {
					i++;
					bool = false;
				}
			}
			if (!aBool5512 && method5899((byte) 36) >= 0.0F && (i >= anInt5507 * 1708148925 || class369 == Class369.aClass369_3874 || class369 == Class369.aClass369_3873)) {
				aBool5512 = true;
				method5889(Class475.aClass475_5379, (byte) 53);
			}
			if (anInterface43_5474.method315() && bool && (method5919(-566008412) || aBool5509 || Class369.aClass369_3874 == class369) && (false == aBool5479 || (false == aBool5496 && anInt5484 * -1563201689 >= 2005465249 * anInt5480 && 2005465249 * anInt5480 >= 0))) {
				method5889(Class475.aClass475_5374, (byte) 123);
				aBool5499 = false;
				if (aBool5521)
					method5920((byte) -2);
			}
		}
	}

	void method5962(byte i) {
		aBool5485 = true;
	}

	void method5963(byte i) {
		synchronized (this) {
			aByteArray5490 = null;
			anInt5475 = 0;
			aFloat5523 = 0.0F;
			aFloat5506 = 0.0F;
			aBool5479 = false;
			anInt5480 = 0;
			aFloat5481 = 1.0F;
			anInterface58_5482 = null;
			anInt5483 = 0;
			anInt5522 = 0;
			if (null != aClass484Array5501) {
				for (int i_97_ = 0; i_97_ < aClass484Array5501.length; i_97_++) {
					if (null != aClass484Array5501[i_97_])
						aClass484Array5501[i_97_].method5841(-1394275911);
				}
			}
			aClass484Array5501 = null;
			aBool5521 = false;
			anInt5488 = 0;
			anInt5524 = 0;
			anInt5491 = 0;
			anInt5520 = 0;
			anInt5493 = 0;
			anInt5494 = 0;
			anIntArray5495 = null;
			anIntArray5498 = null;
			anIntArray5497 = null;
			anInt5477 = 0;
			aBool5499 = false;
			anInterface43_5474.method296();
			aBool5503 = false;
			anInterface55_5504 = null;
			anObject5505 = null;
			anInt5486 = 0;
			anInt5476 = 0;
			anInt5508 = 0;
			aBool5509 = false;
			anInt5492 = 0;
			anInt5511 = 0;
			aBool5512 = false;
			anInt5513 = 0;
			method5900(-1.0F, (byte) 3);
			aBool5515 = false;
			aFloat5516 = 0.0F;
			aLong5517 = 0L;
			aLong5518 = 0L;
			aFloat5510 = 0.0F;
			anInt5519 = 0;
			anInt5484 = 0;
		}
	}

	boolean method5964(int i) {
		return Class475.aClass475_5374 == aClass475_5500;
	}

	int method5965() {
		if (null != anObject5505 && anObject5505 instanceof Class479) {
			Class479 class479 = (Class479) anObject5505;
			Interface71 interface71 = class479.method5768(-589190223);
			return interface71.method455((byte) 10);
		}
		return 0;
	}

	void method5966() {
		synchronized (this) {
			if (null != anObject5505 && anObject5505 instanceof Class479) {
				Class479 class479 = (Class479) anObject5505;
				Interface71 interface71 = class479.method5768(-849259481);
				if (null != interface71)
					interface71.method449(true, -148689216);
			}
		}
	}

	void method5967() {
		synchronized (this) {
			if (null != anObject5505 && anObject5505 instanceof Class479) {
				Class479 class479 = (Class479) anObject5505;
				Interface71 interface71 = class479.method5768(-446933993);
				if (null != interface71)
					interface71.method449(true, 1874545865);
			}
		}
	}

	public void method5968(short i) {
		synchronized (this) {
			if (method5888((byte) 32) == Class475.aClass475_5377 || (method5888((byte) 26).anInt5381 * 2043370079 < 2043370079 * Class475.aClass475_5378.anInt5381)) {
				/* empty */
			} else
				method5889(Class475.aClass475_5377, (byte) 36);
		}
	}

	boolean method5969() {
		return aClass475_5500 == Class475.aClass475_5377;
	}

	void method5970(byte i) {
		synchronized (this) {
			int i_98_ = method5918(-591647958);
			if (aBool5521 && i_98_ > anInt5519 * 1486721285 && anInterface43_5474.method315()) {
				/* empty */
			} else {
				Class369 class369 = anInterface43_5474.method289();
				if (aBool5503 && Class369.aClass369_3873 != class369) {
					if (null != aByteArray5490) {
						if (-434564505 * anInt5492 >= anInt5494 * 1165836469) {
							anInterface43_5474.method63(null);
							anInt5492 = 0;
						} else {
							if (-312036945 * anInt5522 < 60379087 * anInt5477)
								anInt5522 = anInt5477 * -1260557343;
							anInt5522 = (anIntArray5495[-434564505 * anInt5492] + -1736370679 * anInt5513) * -1727707825;
							int i_99_ = anIntArray5498[-434564505 * anInt5492];
							int i_100_ = i_99_;
							int i_101_ = (i_100_ + anInt5513 * -1736370679 > i_99_ ? (i_99_ + anIntArray5495[-434564505 * anInt5492]) : i_100_ + -312036945 * anInt5522);
							Class492 class492_102_ = this;
							class492_102_.anInt5513 = (class492_102_.anInt5513 + ((anInt5522 * -312036945 + i_100_ > aByteArray5490.length) ? (aByteArray5490.length - anInt5522 * -312036945) : i_100_) * 1643599929);
							RSByteBuffer class536_sub33 = new RSByteBuffer(i_101_ - (-312036945 * anInt5522), true);
							if (aByteArray5490 == null)
								throw new RuntimeException("");
							if (null == class536_sub33.buffer)
								throw new RuntimeException("");
							class536_sub33.method9696(aByteArray5490, anInt5522 * -312036945, i_101_ - (anInt5522 * -312036945), (byte) 110);
							anInterface43_5474.method63(class536_sub33);
							method5902(false, -822288670);
							if (anInt5513 * -1736370679 >= i_99_) {
								anInt5492 += -1081218729;
								anInt5513 = 0;
							}
						}
					} else if (anInterface58_5482 != null) {
						if (anInt5483 * 404459863 >= anInt5494 * 1165836469) {
							anInt5483 = 0;
							anInterface43_5474.method63(null);
						} else {
							byte[] is = (anInterface58_5482.method365(anIntArray5497[anInt5483 * 404459863], (byte) 100));
							if (is != null) {
								RSByteBuffer class536_sub33 = new RSByteBuffer(is);
								class536_sub33.off = 516175515 * is.length;
								anInterface43_5474.method63(class536_sub33);
								method5902(false, -822288670);
								anInt5483 += 839510631;
							}
						}
					}
				}
			}
		}
	}

	void method5971() {
		synchronized (this) {
			aByteArray5490 = null;
			anInt5475 = 0;
			aFloat5523 = 0.0F;
			aFloat5506 = 0.0F;
			aBool5479 = false;
			anInt5480 = 0;
			aFloat5481 = 1.0F;
			anInterface58_5482 = null;
			anInt5483 = 0;
			anInt5522 = 0;
			if (null != aClass484Array5501) {
				for (int i = 0; i < aClass484Array5501.length; i++) {
					if (null != aClass484Array5501[i])
						aClass484Array5501[i].method5841(104363419);
				}
			}
			aClass484Array5501 = null;
			aBool5521 = false;
			anInt5488 = 0;
			anInt5524 = 0;
			anInt5491 = 0;
			anInt5520 = 0;
			anInt5493 = 0;
			anInt5494 = 0;
			anIntArray5495 = null;
			anIntArray5498 = null;
			anIntArray5497 = null;
			anInt5477 = 0;
			aBool5499 = false;
			anInterface43_5474.method296();
			aBool5503 = false;
			anInterface55_5504 = null;
			anObject5505 = null;
			anInt5486 = 0;
			anInt5476 = 0;
			anInt5508 = 0;
			aBool5509 = false;
			anInt5492 = 0;
			anInt5511 = 0;
			aBool5512 = false;
			anInt5513 = 0;
			method5900(-1.0F, (byte) 3);
			aBool5515 = false;
			aFloat5516 = 0.0F;
			aLong5517 = 0L;
			aLong5518 = 0L;
			aFloat5510 = 0.0F;
			anInt5519 = 0;
			anInt5484 = 0;
		}
	}

	static final void method5972(Class251 class251, Class234 class234, Class668 class668, byte i) {
		class251.method3473(-454304166);
	}

	static final void method5973(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		Class251 class251 = class683.aClass251_8650;
		class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = class251.aString2638;
	}
}
