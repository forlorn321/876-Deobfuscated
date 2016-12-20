/* Class494 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class494 {
	int anInt5498;
	int anInt5499;
	float aFloat5500;
	float aFloat5501;
	float[] aFloatArray5502;
	int anInt5503;
	int anInt5504;
	boolean aBool5505;
	int anInt5506;
	int anInt5507;
	int anInt5508;
	int anInt5509;
	int anInt5510;
	Class477[] aClass477Array5511;
	byte[] aByteArray5512;
	int[] anIntArray5513;
	int anInt5514;
	int anInt5515;
	int anInt5516;
	Interface57 anInterface57_5517;
	int anInt5518;
	int[] anIntArray5519;
	Object anObject5520;
	int[] anIntArray5521;
	Interface56 anInterface56_5522;
	boolean aBool5523;
	Class491 aClass491_5524;
	Interface43 anInterface43_5525;
	Class358 aClass358_5526;
	boolean aBool5527;
	boolean aBool5528;
	int anInt5529;
	int anInt5530 = 0;
	int anInt5531 = 0;
	float aFloat5532;
	boolean aBool5533;
	int anInt5534 = 0;
	int anInt5535;
	boolean aBool5536;
	int anInt5537;
	float aFloat5538;
	boolean aBool5539;
	float aFloat5540;
	long aLong5541;
	long aLong5542;
	float aFloat5543;
	Object anObject5544;
	boolean aBool5545;
	int anInt5546 = 0;
	int anInt5547;
	boolean aBool5548;
	static Class563 aClass563_5549;

	float method8003(int i) {
		return aFloat5532;
	}

	boolean method8004(byte[] is, Interface57 interface57, int i, float f, boolean bool, boolean bool_0_, int i_1_, float f_2_, Object object) {
		synchronized (this) {
			if (null != interface57) {
				aByteArray5512 = null;
				anInterface57_5517 = interface57;
			} else
				aByteArray5512 = is;
			anObject5544 = object;
			anInt5499 = i * -446863251;
			aFloat5532 = f;
			aBool5527 = bool_0_;
			anInt5504 = 3325247 * i_1_;
			aFloat5500 = f_2_;
			byte[] is_3_ = null;
			if (aByteArray5512 != null)
				is_3_ = aByteArray5512;
			else if (anInterface57_5517 != null) {
				anInt5507 = 0;
				is_3_ = anInterface57_5517.method364(anInt5507 * 1196609847, 1929358203);
			}
			if (is_3_ != null) {
				RSByteBuffer class527_sub38 = new RSByteBuffer(is_3_);
				if (class527_sub38.readUnsignedByte() != 74 || class527_sub38.readUnsignedByte() != 65 || class527_sub38.readUnsignedByte() != 71 || class527_sub38.readUnsignedByte() != 65)
					throw new RuntimeException("");
				anInt5514 = class527_sub38.readInt() * -95192197;
				anInt5515 = class527_sub38.readInt() * 528278021;
				anInt5506 = class527_sub38.readInt() * -1102315897;
				anInt5516 = class527_sub38.readInt() * -662240445;
				anInt5518 = class527_sub38.readInt() * 864835383;
				if (null == anObject5520) {
					anObject5520 = aClass358_5526.method6273(-35511957 * anInt5516, anInt5506 * 278685495, anInterface43_5525.method307(), anInterface43_5525.method302(), -1864169603 * anInt5510, aFloat5500, (byte) 5);
					if (anObject5520 == null) {
						method8120(Class491.aClass491_5481, 1815007812);
						boolean bool_4_ = false;
						return bool_4_;
					}
				}
				anIntArray5519 = new int[940510855 * anInt5518];
				anIntArray5513 = new int[940510855 * anInt5518];
				anIntArray5521 = new int[940510855 * anInt5518];
				int i_5_ = (class527_sub38.anInt10689 * -441238943 + anInt5518 * -1065847752);
				for (int i_6_ = 0; i_6_ < 940510855 * anInt5518; i_6_++) {
					anIntArray5519[i_6_] = i_5_;
					anIntArray5513[i_6_] = class527_sub38.readInt();
					anIntArray5521[i_6_] = class527_sub38.readInt();
					i_5_ += anIntArray5513[i_6_];
				}
				anInt5498 = -260545605 * class527_sub38.anInt10689;
				aClass477Array5511 = new Class477[anInt5508 * -506738031];
				aFloatArray5502 = new float[2];
				for (int i_7_ = 0; i_7_ < aFloatArray5502.length; i_7_++)
					aFloatArray5502[i_7_] = 1.0F;
				if (anObject5544 instanceof Class483) {
					Interface70 interface70 = ((Class483) anObject5544).method7926(-1925326175);
					aBool5545 = interface70.method437((byte) 41);
					aBool5505 = !aBool5545;
				}
				anInterface43_5525.method290(aBool5505, (aBool5527 ? anInt5504 * -961432897 : 0), 1119431603 * anInt5514, 728275661 * anInt5515);
				if (anInterface57_5517 != null) {
					int i_8_ = (class527_sub38.buffer.length - -696810861 * anInt5498);
					byte[] is_9_ = Class706.method14340(i_8_, true, -740746889);
					System.arraycopy(class527_sub38.buffer, anInt5498 * -696810861, is_9_, 0, i_8_);
					class527_sub38.buffer = is_9_;
					class527_sub38.anInt10689 = i_8_ * 1474750881;
					anInterface43_5525.method66(class527_sub38);
					anInt5507 += 1242543239;
				} else
					aBool5536 = true;
				boolean bool_10_ = true;
				return bool_10_;
			}
			boolean bool_11_ = is_3_ != null;
			return bool_11_;
		}
	}

	public void method8005(int i) {
		if (method8041(-1813744398).anInt5476 * 1013450527 >= Class491.aClass491_5474.anInt5476 * 1013450527)
			throw new RuntimeException("");
		method8120(Class491.aClass491_5474, 830994039);
	}

	RSByteBuffer method8006(int i) {
		if (null != anObject5544 && anObject5544 instanceof Class483) {
			Class483 class483 = (Class483) anObject5544;
			Interface70 interface70 = class483.method7926(-1916458857);
			RSByteBuffer class527_sub38 = interface70.method436(i, (short) -14876);
			RSByteBuffer class527_sub38_12_ = new RSByteBuffer(-441238943 * class527_sub38.anInt10689, true);
			class527_sub38_12_.writeBuffer(class527_sub38, (byte) 4);
			return class527_sub38_12_;
		}
		return null;
	}

	boolean method8007(int i) {
		return aClass491_5524 == Class491.aClass491_5481;
	}

	boolean method8008(short i) {
		return Class491.aClass491_5479 == aClass491_5524;
	}

	public void method8009(short i) {
		if (method8041(-1980435871).anInt5476 * 1013450527 < 1013450527 * Class491.aClass491_5474.anInt5476)
			throw new RuntimeException("");
		anObject5544 = null;
		method8120(Class491.aClass491_5482, -695540288);
	}

	void method8010(float f, int i, byte i_13_) {
		if (i <= 0) {
			aFloat5532 = f;
			aFloat5540 = aFloat5532;
			aLong5542 = 0L;
			aLong5541 = 0L;
		} else {
			aFloat5543 = aFloat5532;
			aFloat5540 = f;
			aLong5542 = Class234.method4347(-1408626088) * 7541413693900102809L;
			aLong5541 = ((-2369264723060590679L * aLong5542 + (long) i) * -2993626228150981415L);
		}
	}

	void method8011() {
		synchronized (this) {
			int i = method8038(-538362763);
			if (aBool5545 && i > -2096335745 * anInt5537 && anInterface43_5525.method316()) {
				/* empty */
			} else {
				Class370 class370 = anInterface43_5525.method281();
				if (aBool5536 && class370 != Class370.aClass370_3900) {
					if (aByteArray5512 != null) {
						if (-2143350869 * anInt5546 >= 940510855 * anInt5518) {
							anInterface43_5525.method66(null);
							anInt5546 = 0;
						} else {
							if (-1533072425 * anInt5509 < anInt5498 * -696810861)
								anInt5509 = anInt5498 * 1259448229;
							anInt5509 = (1831204839 * (anIntArray5519[anInt5546 * -2143350869] + 1439347891 * anInt5503));
							int i_14_ = anIntArray5513[anInt5546 * -2143350869];
							int i_15_ = i_14_;
							int i_16_ = (anInt5503 * 1439347891 + i_15_ > i_14_ ? (anIntArray5519[anInt5546 * -2143350869] + i_14_) : i_15_ + anInt5509 * -1533072425);
							Class494 class494_17_ = this;
							class494_17_.anInt5503 = (class494_17_.anInt5503 + ((i_15_ + anInt5509 * -1533072425 > aByteArray5512.length) ? (aByteArray5512.length - anInt5509 * -1533072425) : i_15_) * 1144724091);
							RSByteBuffer class527_sub38 = new RSByteBuffer(i_16_ - (-1533072425 * anInt5509), true);
							if (aByteArray5512 == null)
								throw new RuntimeException("");
							if (null == class527_sub38.buffer)
								throw new RuntimeException("");
							class527_sub38.writeBytes(aByteArray5512, -1533072425 * anInt5509, i_16_ - (anInt5509 * -1533072425), (byte) 64);
							anInterface43_5525.method66(class527_sub38);
							method8083(false, 976297105);
							if (anInt5503 * 1439347891 >= i_14_) {
								anInt5546 += 480998147;
								anInt5503 = 0;
							}
						}
					} else if (anInterface57_5517 != null) {
						if (1196609847 * anInt5507 >= 940510855 * anInt5518) {
							anInt5507 = 0;
							anInterface43_5525.method66(null);
						} else {
							byte[] is = (anInterface57_5517.method364(anIntArray5521[anInt5507 * 1196609847], 1097542161));
							if (null != is) {
								RSByteBuffer class527_sub38 = new RSByteBuffer(is);
								class527_sub38.anInt10689 = 1474750881 * is.length;
								anInterface43_5525.method66(class527_sub38);
								method8083(false, 976297105);
								anInt5507 += 1242543239;
							}
						}
					}
				}
			}
		}
	}

	public boolean method8012(byte i) {
		return aBool5539;
	}

	void method8013(byte i) {
		synchronized (this) {
			method8025((byte) 0);
		}
	}

	void method8014(int i) {
		Class360 class360 = aClass358_5526.method6287(537089603).method6379(806805861 * anInt5499, 1351835060);
		aFloat5501 = null != class360 ? class360.method6308((byte) 2) : 1.0F;
		float f = null != class360 ? class360.method6307(102380841) : 0.1F;
		f *= aFloat5532;
		float f_18_ = aFloatArray5502.length > 0 ? 0.0F : 1.0F;
		for (int i_19_ = 0; i_19_ < aFloatArray5502.length; i_19_++) {
			if (aFloatArray5502[i_19_] > f_18_)
				f_18_ = aFloatArray5502[i_19_];
		}
		f *= f_18_;
		if (!method8075(683474405))
			f = -1.0F;
		if (method8018((byte) 78) != f) {
			method8019(f, -124285113);
			aBool5539 = true;
		}
	}

	void method8015(Interface56 interface56, int i) {
		anInterface56_5522 = interface56;
		if (anInterface56_5522 != null)
			anInterface56_5522.method361(anObject5544, aFloatArray5502, null, -1814840716);
	}

	public void method8016(byte i) {
		if ((method8041(-1879225406).anInt5476 * 1013450527 >= Class491.aClass491_5477.anInt5476 * 1013450527) && (method8041(-1974159471).anInt5476 * 1013450527 < Class491.aClass491_5479.anInt5476 * 1013450527) && method8075(132967158)) {
			synchronized (this) {
				anInterface43_5525.method130();
				method8030(-592353589);
			}
			Thread.yield();
		}
	}

	void method8017(int i) {
		aBool5548 = true;
	}

	public float method8018(byte i) {
		return aFloat5538;
	}

	void method8019(float f, int i) {
		synchronized (this) {
			aFloat5538 = f;
		}
	}

	Object method8020(int i) {
		return anObject5544;
	}

	public void method8021(int i) {
		synchronized (this) {
			method8022((byte) -31);
		}
	}

	void method8022(byte i) {
		if (method8041(-1876408902).anInt5476 * 1013450527 >= 1013450527 * Class491.aClass491_5477.anInt5476) {
			if (method8041(-1619216998) == Class491.aClass491_5482)
				method8088(-1628803387);
			else {
				method8117((byte) 28);
				if (aFloat5532 != aFloat5540) {
					long l = Class234.method4347(-1408626088);
					if (l > aLong5541 * -3936120985842281623L)
						aFloat5532 = aFloat5540;
					else {
						float f = aFloat5540 - aFloat5543;
						long l_20_ = (aLong5541 * -3936120985842281623L - aLong5542 * -2369264723060590679L);
						float f_21_ = f / (float) l_20_;
						aFloat5532 = (f_21_ * (float) (l - (aLong5542 * -2369264723060590679L)) + aFloat5543);
						aFloat5532 = Math.max(0.0F, Math.min(1.0F, aFloat5532));
					}
				}
				method8014(-360949542);
				if (method8041(-1985123945).anInt5476 * 1013450527 < 1013450527 * Class491.aClass491_5479.anInt5476)
					method8026((byte) 100);
			}
		}
	}

	void method8023() {
		synchronized (this) {
			aByteArray5512 = null;
			anInt5499 = 0;
			aFloat5532 = 0.0F;
			aFloat5501 = 0.0F;
			aBool5527 = false;
			anInt5504 = 0;
			aFloat5500 = 1.0F;
			anInterface57_5517 = null;
			anInt5507 = 0;
			anInt5509 = 0;
			if (aClass477Array5511 != null) {
				for (int i = 0; i < aClass477Array5511.length; i++) {
					if (aClass477Array5511[i] != null)
						aClass477Array5511[i].method7775(-2027272454);
				}
			}
			aClass477Array5511 = null;
			aBool5545 = false;
			anInt5529 = 0;
			anInt5514 = 0;
			anInt5515 = 0;
			anInt5516 = 0;
			anInt5506 = 0;
			anInt5518 = 0;
			anIntArray5519 = null;
			anIntArray5513 = null;
			anIntArray5521 = null;
			anInt5498 = 0;
			aBool5523 = false;
			anInterface43_5525.method285();
			aBool5536 = false;
			anInterface56_5522 = null;
			anObject5544 = null;
			anInt5530 = 0;
			anInt5531 = 0;
			anInt5534 = 0;
			aBool5533 = false;
			anInt5546 = 0;
			anInt5535 = 0;
			aBool5528 = false;
			anInt5503 = 0;
			method8019(-1.0F, 1854273223);
			aBool5539 = false;
			aFloat5540 = 0.0F;
			aLong5541 = 0L;
			aLong5542 = 0L;
			aFloat5543 = 0.0F;
			anInt5537 = 0;
			anInt5547 = 0;
		}
	}

	void method8024(RSByteBuffer class527_sub38) {
		if (null != anObject5544 && anObject5544 instanceof Class483) {
			Class483 class483 = (Class483) anObject5544;
			Interface70 interface70 = class483.method7926(-2003697593);
			byte[] is = new byte[-441238943 * class527_sub38.anInt10689];
			System.arraycopy(class527_sub38.buffer, 0, is, 0, class527_sub38.anInt10689 * -441238943);
			RSByteBuffer class527_sub38_22_ = new RSByteBuffer(is);
			class527_sub38_22_.anInt10689 = class527_sub38.anInt10689 * 1;
			interface70.method450(class527_sub38_22_, 1622099819);
		}
	}

	void method8025(byte i) {
		if (method8041(-1719110200) != Class491.aClass491_5479 && (method8041(-1794505882).anInt5476 * 1013450527 < Class491.aClass491_5477.anInt5476 * 1013450527)) {
			method8120(Class491.aClass491_5477, -1032559622);
			aBool5523 = true;
			method8026((byte) 100);
			method8014(-285457947);
		}
	}

	void method8026(byte i) {
		if (true == aBool5523 && (method8041(-1686907113).anInt5476 * 1013450527 >= Class491.aClass491_5477.anInt5476 * 1013450527) && (method8041(-1792384072).anInt5476 * 1013450527 < 1013450527 * Class491.aClass491_5481.anInt5476) && anInterface56_5522 != null && aFloat5540 == aFloat5532)
			anInterface56_5522.method361(anObject5544, aFloatArray5502, null, -1834493245);
	}

	int method8027() {
		if (anObject5544 != null && anObject5544 instanceof Class483) {
			Class483 class483 = (Class483) anObject5544;
			Interface70 interface70 = class483.method7926(-2050686046);
			return interface70.method439((byte) -49);
		}
		return 0;
	}

	void method8028(int i) {
		aBool5548 = false;
	}

	RSByteBuffer method8029(int i, int i_23_) {
		return anInterface43_5525.method286(i);
	}

	void method8030(int i) {
		if (aClass477Array5511 != null) {
			boolean bool = true;
			Class370 class370 = anInterface43_5525.method281();
			if (anInterface43_5525.method316()) {
				if (aBool5545 && method8037(-2096335745 * anInt5537, -1107711924)) {
					if (aClass477Array5511[-1625082935 * anInt5535] == null) {
						RSByteBuffer class527_sub38 = method8036(anInt5537 * -2096335745, 1449026822);
						if (null != class527_sub38) {
							aClass477Array5511[anInt5535 * -1625082935] = new Class477(this, class527_sub38, false);
							int i_24_ = anInterface43_5525.method72();
							int i_25_ = (anInterface43_5525.method179(-441238943 * (aClass477Array5511[anInt5535 * -1625082935].aClass527_Sub38_5387.anInt10689) / i_24_));
							anInt5531 += -1297232747 * i_25_;
							if (!aBool5505 && aBool5527 && -2030307209 * anInt5547 > 0) {
								if (1153212093 * anInt5531 < anInt5514 * 1119431603)
									aClass477Array5511[-1625082935 * anInt5535] = null;
								else if ((1153212093 * anInt5531 >= 1119431603 * anInt5514) && (anInt5531 * 1153212093 - i_25_ < anInt5514 * 1119431603))
									aClass477Array5511[-1625082935 * anInt5535].anInt5384 = ((anInterface43_5525.method319(i_24_ * (anInt5531 * 1153212093 - anInt5514 * 1119431603))) * 613641665);
							}
							anInt5537 += -590394497;
							if (!aBool5505 && aBool5527 && (1153212093 * anInt5531 >= anInt5515 * 728275661) && ((anInt5547 * -2030307209 < anInt5504 * -961432897) || -961432897 * anInt5504 < 0)) {
								int i_26_ = (anInt5531 * 1153212093 - 728275661 * anInt5515);
								int i_27_ = i_25_ - i_26_;
								aClass477Array5511[-1625082935 * anInt5535].anInt5386 = (anInterface43_5525.method319(i_27_ * i_24_) * -633303233);
								anInt5537 = 0;
								anInt5531 = 0;
								anInt5547 += -1206951609;
							}
							if (aClass477Array5511[anInt5535 * -1625082935] != null) {
								anInt5535 += -1027647879;
								anInt5535 = (-1625082935 * anInt5535 % aClass477Array5511.length * -1027647879);
							}
						}
					}
				} else if (!method8039((byte) 18) || !aBool5545) {
					int i_28_ = anInterface43_5525.method51();
					int i_29_ = anInterface43_5525.method179(anInt5510 * -1864169603);
					if (!aBool5533 && (aClass477Array5511[anInt5535 * -1625082935] == null)) {
						if (class370 != Class370.aClass370_3896 && i_28_ > 0) {
							RSByteBuffer class527_sub38 = method8029(i_29_, -1967612425);
							aClass477Array5511[-1625082935 * anInt5535] = (class527_sub38 != null ? new Class477(this, class527_sub38, false) : null);
							int i_30_ = ((aClass477Array5511[-1625082935 * anInt5535] != null) ? -441238943 * (aClass477Array5511[-1625082935 * anInt5535].aClass527_Sub38_5387.anInt10689) : 0);
							int i_31_ = anInterface43_5525.method72();
							int i_32_ = anInterface43_5525.method179(i_30_ / i_31_);
							anInt5534 += i_32_ * -243571503;
							if (anInt5534 * -1958513615 > anInt5531 * 1153212093) {
								anInt5531 += i_32_ * -1297232747;
								i_28_ -= i_32_;
								if (false == aBool5505 && aBool5527 && anInt5547 * -2030307209 > 0) {
									if (1153212093 * anInt5531 < 1119431603 * anInt5514)
										aClass477Array5511[(anInt5535 * -1625082935)] = null;
									else if ((1153212093 * anInt5531 >= 1119431603 * anInt5514) && (anInt5531 * 1153212093 - i_32_ < 1119431603 * anInt5514))
										aClass477Array5511[anInt5535 * -1625082935].anInt5384 = (anInterface43_5525.method319((1153212093 * anInt5531 - 1119431603 * anInt5514) * i_31_)) * 613641665;
								}
								if (aClass477Array5511[anInt5535 * -1625082935] != null) {
									if (aBool5545 && !method8037(-2096335745 * anInt5537, -1861498790))
										method8035((aClass477Array5511[anInt5535 * -1625082935].aClass527_Sub38_5387), (byte) 0);
									if (!aBool5505 && aBool5527 && (anInt5531 * 1153212093 >= 728275661 * anInt5515) && ((anInt5547 * -2030307209 <= anInt5504 * -961432897) || anInt5504 * -961432897 < 0)) {
										int i_33_ = (anInt5531 * 1153212093 - anInt5515 * 728275661);
										int i_34_ = i_32_ - i_33_;
										aClass477Array5511[anInt5535 * -1625082935].anInt5386 = (anInterface43_5525.method319(i_31_ * i_34_) * -633303233);
										anInt5537 = 0;
										anInt5547 += -1206951609;
										anInt5531 = 0;
									} else
										anInt5537 += -590394497;
									anInt5535 += -1027647879;
									anInt5535 = (-1027647879 * (anInt5535 * -1625082935 % aClass477Array5511.length));
								}
							} else
								aClass477Array5511[anInt5535 * -1625082935] = null;
						} else if (Class370.aClass370_3896 == class370 && aBool5527 && !aBool5505 && ((-2030307209 * anInt5547 < anInt5504 * -961432897) || anInt5504 * -961432897 < 0))
							anInterface43_5525.method291(true);
					}
				}
			}
			int i_35_ = 0;
			for (int i_36_ = 0; i_36_ < aClass477Array5511.length; i_36_++) {
				if (aClass477Array5511[i_36_] != null) {
					i_35_++;
					bool = false;
				}
			}
			if (!aBool5528 && method8018((byte) 72) >= 0.0F && (i_35_ >= -506738031 * anInt5508 || Class370.aClass370_3896 == class370 || Class370.aClass370_3900 == class370)) {
				aBool5528 = true;
				method8120(Class491.aClass491_5483, -976012427);
			}
			if (anInterface43_5525.method316() && bool && (method8039((byte) 79) || aBool5533 || class370 == Class370.aClass370_3896) && (!aBool5527 || (false == aBool5505 && -2030307209 * anInt5547 >= -961432897 * anInt5504 && anInt5504 * -961432897 >= 0))) {
				method8120(Class491.aClass491_5481, -901741325);
				aBool5523 = false;
				if (aBool5545)
					method8040((byte) -111);
			}
		}
	}

	void method8031(float f) {
		synchronized (this) {
			aFloat5538 = f;
		}
	}

	public void method8032(byte i) {
		synchronized (this) {
			if (aBool5548) {
				/* empty */
			} else if (anObject5520 == null) {
				/* empty */
			} else {
				int i_37_ = aClass358_5526.method6276(anObject5520, 423545538);
				if (i_37_ <= 0) {
					/* empty */
				} else if (null != aClass477Array5511 && (null != aClass477Array5511[anInt5529 * 1861171021]) && aBool5528) {
					int i_38_ = ((i_37_ + -2023917027 * anInt5530 > -441238943 * (aClass477Array5511[anInt5529 * 1861171021].aClass527_Sub38_5387.anInt10689)) ? (-441238943 * (aClass477Array5511[1861171021 * anInt5529].aClass527_Sub38_5387.anInt10689) - anInt5530 * -2023917027) : i_37_);
					if ((-2023917027 * anInt5530 < -1940020671 * (aClass477Array5511[1861171021 * anInt5529].anInt5384)) && (i_38_ + anInt5530 * -2023917027 > -1940020671 * (aClass477Array5511[anInt5529 * 1861171021].anInt5384)) && (aClass477Array5511[anInt5529 * 1861171021].anInt5384) * -1940020671 >= 0) {
						anInt5530 += 2028449653 * (aClass477Array5511[anInt5529 * 1861171021].anInt5384) - anInt5530 * 1;
						i_38_ = ((anInt5530 * -2023917027 + i_37_ > (aClass477Array5511[1861171021 * anInt5529].aClass527_Sub38_5387.anInt10689) * -441238943) ? (-441238943 * (aClass477Array5511[1861171021 * anInt5529].aClass527_Sub38_5387.anInt10689) - anInt5530 * -2023917027) : i_37_);
					}
					if ((anInt5530 * -2023917027 + i_38_ > (aClass477Array5511[anInt5529 * 1861171021].anInt5386) * -234692417) && (aClass477Array5511[anInt5529 * 1861171021].anInt5386) * -234692417 >= 0)
						i_38_ = (-234692417 * (aClass477Array5511[anInt5529 * 1861171021].anInt5386) - anInt5530 * -2023917027);
					method8113((aClass477Array5511[1861171021 * anInt5529].aClass527_Sub38_5387.buffer), -2023917027 * anInt5530, -2023917027 * anInt5530 + i_38_, -946602939);
					aClass358_5526.method6275(anObject5520, (aClass477Array5511[anInt5529 * 1861171021].aClass527_Sub38_5387.buffer), -2023917027 * anInt5530, i_38_, 1839170174);
					anInt5530 += i_38_ * 9377845;
					i_37_ -= i_38_;
					if ((-2023917027 * anInt5530 >= (aClass477Array5511[anInt5529 * 1861171021].aClass527_Sub38_5387.anInt10689) * -441238943) || ((-2023917027 * anInt5530 >= (aClass477Array5511[anInt5529 * 1861171021].anInt5386) * -234692417) && -234692417 * (aClass477Array5511[1861171021 * anInt5529].anInt5386) >= 0)) {
						aClass477Array5511[anInt5529 * 1861171021].method7775(-1969971397);
						aClass477Array5511[anInt5529 * 1861171021] = null;
						anInt5529 += -80160379;
						anInt5529 = (1861171021 * anInt5529 % aClass477Array5511.length * -80160379);
						anInt5530 = 0;
					}
				}
			}
		}
	}

	void method8033() {
		synchronized (this) {
			aByteArray5512 = null;
			anInt5499 = 0;
			aFloat5532 = 0.0F;
			aFloat5501 = 0.0F;
			aBool5527 = false;
			anInt5504 = 0;
			aFloat5500 = 1.0F;
			anInterface57_5517 = null;
			anInt5507 = 0;
			anInt5509 = 0;
			if (aClass477Array5511 != null) {
				for (int i = 0; i < aClass477Array5511.length; i++) {
					if (aClass477Array5511[i] != null)
						aClass477Array5511[i].method7775(-1934458097);
				}
			}
			aClass477Array5511 = null;
			aBool5545 = false;
			anInt5529 = 0;
			anInt5514 = 0;
			anInt5515 = 0;
			anInt5516 = 0;
			anInt5506 = 0;
			anInt5518 = 0;
			anIntArray5519 = null;
			anIntArray5513 = null;
			anIntArray5521 = null;
			anInt5498 = 0;
			aBool5523 = false;
			anInterface43_5525.method285();
			aBool5536 = false;
			anInterface56_5522 = null;
			anObject5544 = null;
			anInt5530 = 0;
			anInt5531 = 0;
			anInt5534 = 0;
			aBool5533 = false;
			anInt5546 = 0;
			anInt5535 = 0;
			aBool5528 = false;
			anInt5503 = 0;
			method8019(-1.0F, 1524877214);
			aBool5539 = false;
			aFloat5540 = 0.0F;
			aLong5541 = 0L;
			aLong5542 = 0L;
			aFloat5543 = 0.0F;
			anInt5537 = 0;
			anInt5547 = 0;
		}
	}

	boolean method8034() {
		return aClass491_5524 == Class491.aClass491_5481;
	}

	void method8035(RSByteBuffer class527_sub38, byte i) {
		if (null != anObject5544 && anObject5544 instanceof Class483) {
			Class483 class483 = (Class483) anObject5544;
			Interface70 interface70 = class483.method7926(-2133088375);
			byte[] is = new byte[-441238943 * class527_sub38.anInt10689];
			System.arraycopy(class527_sub38.buffer, 0, is, 0, class527_sub38.anInt10689 * -441238943);
			RSByteBuffer class527_sub38_39_ = new RSByteBuffer(is);
			class527_sub38_39_.anInt10689 = class527_sub38.anInt10689 * 1;
			interface70.method450(class527_sub38_39_, 1220781984);
		}
	}

	RSByteBuffer method8036(int i, int i_40_) {
		if (null != anObject5544 && anObject5544 instanceof Class483) {
			Class483 class483 = (Class483) anObject5544;
			Interface70 interface70 = class483.method7926(-2045483429);
			RSByteBuffer class527_sub38 = interface70.method436(i, (short) 16348);
			RSByteBuffer class527_sub38_41_ = new RSByteBuffer(-441238943 * class527_sub38.anInt10689, true);
			class527_sub38_41_.writeBuffer(class527_sub38, (byte) 4);
			return class527_sub38_41_;
		}
		return null;
	}

	boolean method8037(int i, int i_42_) {
		if (null != anObject5544 && anObject5544 instanceof Class483) {
			Class483 class483 = (Class483) anObject5544;
			Interface70 interface70 = class483.method7926(-2090564329);
			return interface70.method459(i, -1025003033);
		}
		return false;
	}

	int method8038(int i) {
		if (anObject5544 != null && anObject5544 instanceof Class483) {
			Class483 class483 = (Class483) anObject5544;
			Interface70 interface70 = class483.method7926(-2051574193);
			return interface70.method439((byte) -19);
		}
		return 0;
	}

	boolean method8039(byte i) {
		synchronized (this) {
			if (anObject5544 != null && anObject5544 instanceof Class483) {
				Class483 class483 = (Class483) anObject5544;
				Interface70 interface70 = class483.method7926(-2113964668);
				if (interface70 != null) {
					boolean bool = interface70.method441((byte) -125);
					return bool;
				}
			}
			boolean bool = false;
			return bool;
		}
	}

	void method8040(byte i) {
		synchronized (this) {
			if (null != anObject5544 && anObject5544 instanceof Class483) {
				Class483 class483 = (Class483) anObject5544;
				Interface70 interface70 = class483.method7926(-2008689667);
				if (null != interface70)
					interface70.method440(true, (byte) -55);
			}
		}
	}

	public Class491 method8041(int i) {
		return aClass491_5524;
	}

	public float method8042() {
		return aFloat5538;
	}

	public Class491 method8043() {
		return aClass491_5524;
	}

	public Class491 method8044() {
		return aClass491_5524;
	}

	public Class491 method8045() {
		return aClass491_5524;
	}

	void method8046() {
		if (method8041(-1639694818) != Class491.aClass491_5479 && (method8041(-1803047611).anInt5476 * 1013450527 < Class491.aClass491_5477.anInt5476 * 1013450527)) {
			method8120(Class491.aClass491_5477, 240107825);
			aBool5523 = true;
			method8026((byte) 100);
			method8014(60880126);
		}
	}

	void method8047(Class491 class491) {
		aClass491_5524 = class491;
	}

	public void method8048() {
		synchronized (this) {
			if (method8041(-1801600448) == Class491.aClass491_5479 || (method8041(-1686484540).anInt5476 * 1013450527 < Class491.aClass491_5474.anInt5476 * 1013450527)) {
				/* empty */
			} else
				method8120(Class491.aClass491_5479, -130256978);
		}
	}

	boolean method8049() {
		return Class491.aClass491_5479 == aClass491_5524;
	}

	boolean method8050() {
		return Class491.aClass491_5479 == aClass491_5524;
	}

	void method8051() {
		synchronized (this) {
			aByteArray5512 = null;
			anInt5499 = 0;
			aFloat5532 = 0.0F;
			aFloat5501 = 0.0F;
			aBool5527 = false;
			anInt5504 = 0;
			aFloat5500 = 1.0F;
			anInterface57_5517 = null;
			anInt5507 = 0;
			anInt5509 = 0;
			if (aClass477Array5511 != null) {
				for (int i = 0; i < aClass477Array5511.length; i++) {
					if (aClass477Array5511[i] != null)
						aClass477Array5511[i].method7775(-2010544451);
				}
			}
			aClass477Array5511 = null;
			aBool5545 = false;
			anInt5529 = 0;
			anInt5514 = 0;
			anInt5515 = 0;
			anInt5516 = 0;
			anInt5506 = 0;
			anInt5518 = 0;
			anIntArray5519 = null;
			anIntArray5513 = null;
			anIntArray5521 = null;
			anInt5498 = 0;
			aBool5523 = false;
			anInterface43_5525.method285();
			aBool5536 = false;
			anInterface56_5522 = null;
			anObject5544 = null;
			anInt5530 = 0;
			anInt5531 = 0;
			anInt5534 = 0;
			aBool5533 = false;
			anInt5546 = 0;
			anInt5535 = 0;
			aBool5528 = false;
			anInt5503 = 0;
			method8019(-1.0F, -567275930);
			aBool5539 = false;
			aFloat5540 = 0.0F;
			aLong5541 = 0L;
			aLong5542 = 0L;
			aFloat5543 = 0.0F;
			anInt5537 = 0;
			anInt5547 = 0;
		}
	}

	boolean method8052() {
		return aClass491_5524 == Class491.aClass491_5481;
	}

	boolean method8053() {
		return aClass491_5524 == Class491.aClass491_5481;
	}

	boolean method8054() {
		synchronized (this) {
			if (anObject5544 != null && anObject5544 instanceof Class483) {
				Class483 class483 = (Class483) anObject5544;
				Interface70 interface70 = class483.method7926(-1903490621);
				if (interface70 != null) {
					boolean bool = interface70.method441((byte) -27);
					return bool;
				}
			}
			boolean bool = false;
			return bool;
		}
	}

	public void method8055() {
		if (method8041(-2004543855).anInt5476 * 1013450527 < 1013450527 * Class491.aClass491_5474.anInt5476)
			throw new RuntimeException("");
		anObject5544 = null;
		method8120(Class491.aClass491_5482, -314095692);
	}

	public void method8056() {
		if (method8041(-1801269843).anInt5476 * 1013450527 < 1013450527 * Class491.aClass491_5474.anInt5476)
			throw new RuntimeException("");
		anObject5544 = null;
		method8120(Class491.aClass491_5482, -837454870);
	}

	public void method8057() {
		if (method8041(-1997056900).anInt5476 * 1013450527 < 1013450527 * Class491.aClass491_5474.anInt5476)
			throw new RuntimeException("");
		anObject5544 = null;
		method8120(Class491.aClass491_5482, 150681554);
	}

	void method8058(float f, int i) {
		if (i <= 0) {
			aFloat5532 = f;
			aFloat5540 = aFloat5532;
			aLong5542 = 0L;
			aLong5541 = 0L;
		} else {
			aFloat5543 = aFloat5532;
			aFloat5540 = f;
			aLong5542 = Class234.method4347(-1408626088) * 7541413693900102809L;
			aLong5541 = ((-2369264723060590679L * aLong5542 + (long) i) * -2993626228150981415L);
		}
	}

	boolean method8059(byte[] is, Interface57 interface57, int i, float f, boolean bool, boolean bool_43_, int i_44_, float f_45_, Object object) {
		synchronized (this) {
			if (null != interface57) {
				aByteArray5512 = null;
				anInterface57_5517 = interface57;
			} else
				aByteArray5512 = is;
			anObject5544 = object;
			anInt5499 = i * -446863251;
			aFloat5532 = f;
			aBool5527 = bool_43_;
			anInt5504 = 3325247 * i_44_;
			aFloat5500 = f_45_;
			byte[] is_46_ = null;
			if (aByteArray5512 != null)
				is_46_ = aByteArray5512;
			else if (anInterface57_5517 != null) {
				anInt5507 = 0;
				is_46_ = anInterface57_5517.method364(anInt5507 * 1196609847, 1732125154);
			}
			if (is_46_ != null) {
				RSByteBuffer class527_sub38 = new RSByteBuffer(is_46_);
				if (class527_sub38.readUnsignedByte() != 74 || class527_sub38.readUnsignedByte() != 65 || class527_sub38.readUnsignedByte() != 71 || class527_sub38.readUnsignedByte() != 65)
					throw new RuntimeException("");
				anInt5514 = class527_sub38.readInt() * -95192197;
				anInt5515 = class527_sub38.readInt() * 528278021;
				anInt5506 = class527_sub38.readInt() * -1102315897;
				anInt5516 = class527_sub38.readInt() * -662240445;
				anInt5518 = class527_sub38.readInt() * 864835383;
				if (null == anObject5520) {
					anObject5520 = aClass358_5526.method6273(-35511957 * anInt5516, anInt5506 * 278685495, anInterface43_5525.method307(), anInterface43_5525.method302(), -1864169603 * anInt5510, aFloat5500, (byte) 5);
					if (anObject5520 == null) {
						method8120(Class491.aClass491_5481, 1775143375);
						boolean bool_47_ = false;
						return bool_47_;
					}
				}
				anIntArray5519 = new int[940510855 * anInt5518];
				anIntArray5513 = new int[940510855 * anInt5518];
				anIntArray5521 = new int[940510855 * anInt5518];
				int i_48_ = (class527_sub38.anInt10689 * -441238943 + anInt5518 * -1065847752);
				for (int i_49_ = 0; i_49_ < 940510855 * anInt5518; i_49_++) {
					anIntArray5519[i_49_] = i_48_;
					anIntArray5513[i_49_] = class527_sub38.readInt();
					anIntArray5521[i_49_] = class527_sub38.readInt();
					i_48_ += anIntArray5513[i_49_];
				}
				anInt5498 = -260545605 * class527_sub38.anInt10689;
				aClass477Array5511 = new Class477[anInt5508 * -506738031];
				aFloatArray5502 = new float[2];
				for (int i_50_ = 0; i_50_ < aFloatArray5502.length; i_50_++)
					aFloatArray5502[i_50_] = 1.0F;
				if (anObject5544 instanceof Class483) {
					Interface70 interface70 = ((Class483) anObject5544).method7926(-1897253010);
					aBool5545 = interface70.method437((byte) 127);
					aBool5505 = !aBool5545;
				}
				anInterface43_5525.method290(aBool5505, (aBool5527 ? anInt5504 * -961432897 : 0), 1119431603 * anInt5514, 728275661 * anInt5515);
				if (anInterface57_5517 != null) {
					int i_51_ = (class527_sub38.buffer.length - -696810861 * anInt5498);
					byte[] is_52_ = Class706.method14340(i_51_, true, -740746889);
					System.arraycopy(class527_sub38.buffer, anInt5498 * -696810861, is_52_, 0, i_51_);
					class527_sub38.buffer = is_52_;
					class527_sub38.anInt10689 = i_51_ * 1474750881;
					anInterface43_5525.method66(class527_sub38);
					anInt5507 += 1242543239;
				} else
					aBool5536 = true;
				boolean bool_53_ = true;
				return bool_53_;
			}
			boolean bool_54_ = is_46_ != null;
			return bool_54_;
		}
	}

	void method8060() {
		if (method8041(-1719086260) != Class491.aClass491_5479 && (method8041(-1767629420).anInt5476 * 1013450527 < Class491.aClass491_5477.anInt5476 * 1013450527)) {
			method8120(Class491.aClass491_5477, 1768655033);
			aBool5523 = true;
			method8026((byte) 100);
			method8014(284903598);
		}
	}

	void method8061() {
		synchronized (this) {
			method8025((byte) 0);
		}
	}

	public float method8062() {
		return aFloat5538;
	}

	boolean method8063() {
		if (aFloatArray5502 == null)
			return false;
		float f = 0.0F;
		float f_55_ = 0.0F;
		for (int i = 0; i < aFloatArray5502.length; i++) {
			float f_56_ = aFloatArray5502[i];
			if (f_56_ * aFloat5532 > f)
				f = f_56_;
			if (f_56_ > f_55_)
				f_55_ = f_56_;
		}
		if (f < 1.0E-5F) {
			if (f_55_ >= 1.0E-5F && aFloat5540 >= 1.0E-5F)
				return true;
			return false;
		}
		return true;
	}

	public Class491 method8064() {
		return aClass491_5524;
	}

	void method8065() {
		if (method8041(-2004869390).anInt5476 * 1013450527 >= 1013450527 * Class491.aClass491_5477.anInt5476) {
			if (method8041(-1932117418) == Class491.aClass491_5482)
				method8088(-1906843661);
			else {
				method8117((byte) 73);
				if (aFloat5532 != aFloat5540) {
					long l = Class234.method4347(-1408626088);
					if (l > aLong5541 * -3936120985842281623L)
						aFloat5532 = aFloat5540;
					else {
						float f = aFloat5540 - aFloat5543;
						long l_57_ = (aLong5541 * -3936120985842281623L - aLong5542 * -2369264723060590679L);
						float f_58_ = f / (float) l_57_;
						aFloat5532 = (f_58_ * (float) (l - (aLong5542 * -2369264723060590679L)) + aFloat5543);
						aFloat5532 = Math.max(0.0F, Math.min(1.0F, aFloat5532));
					}
				}
				method8014(1078535360);
				if (method8041(-1996499289).anInt5476 * 1013450527 < 1013450527 * Class491.aClass491_5479.anInt5476)
					method8026((byte) 100);
			}
		}
	}

	void method8066(Interface56 interface56) {
		anInterface56_5522 = interface56;
		if (anInterface56_5522 != null)
			anInterface56_5522.method361(anObject5544, aFloatArray5502, null, 1024883198);
	}

	boolean method8067() {
		if (aFloatArray5502 == null)
			return false;
		float f = 0.0F;
		float f_59_ = 0.0F;
		for (int i = 0; i < aFloatArray5502.length; i++) {
			float f_60_ = aFloatArray5502[i];
			if (f_60_ * aFloat5532 > f)
				f = f_60_;
			if (f_60_ > f_59_)
				f_59_ = f_60_;
		}
		if (f < 1.0E-5F) {
			if (f_59_ >= 1.0E-5F && aFloat5540 >= 1.0E-5F)
				return true;
			return false;
		}
		return true;
	}

	Object method8068() {
		return anObject5544;
	}

	boolean method8069() {
		if (aFloatArray5502 == null)
			return false;
		float f = 0.0F;
		float f_61_ = 0.0F;
		for (int i = 0; i < aFloatArray5502.length; i++) {
			float f_62_ = aFloatArray5502[i];
			if (f_62_ * aFloat5532 > f)
				f = f_62_;
			if (f_62_ > f_61_)
				f_61_ = f_62_;
		}
		if (f < 1.0E-5F) {
			if (f_61_ >= 1.0E-5F && aFloat5540 >= 1.0E-5F)
				return true;
			return false;
		}
		return true;
	}

	public float method8070() {
		return aFloat5538;
	}

	public float method8071() {
		return aFloat5538;
	}

	public float method8072() {
		return aFloat5538;
	}

	void method8073() {
		synchronized (this) {
			method8025((byte) 0);
		}
	}

	public float method8074() {
		return aFloat5538;
	}

	boolean method8075(int i) {
		if (aFloatArray5502 == null)
			return false;
		float f = 0.0F;
		float f_63_ = 0.0F;
		for (int i_64_ = 0; i_64_ < aFloatArray5502.length; i_64_++) {
			float f_65_ = aFloatArray5502[i_64_];
			if (f_65_ * aFloat5532 > f)
				f = f_65_;
			if (f_65_ > f_63_)
				f_63_ = f_65_;
		}
		if (f < 1.0E-5F) {
			if (f_63_ >= 1.0E-5F && aFloat5540 >= 1.0E-5F)
				return true;
			return false;
		}
		return true;
	}

	public float method8076() {
		return aFloat5538;
	}

	void method8077(float f) {
		synchronized (this) {
			aFloat5538 = f;
		}
	}

	public void method8078(int i) {
		synchronized (this) {
			if (method8041(-1936112651) == Class491.aClass491_5479 || (method8041(-1692987316).anInt5476 * 1013450527 < Class491.aClass491_5474.anInt5476 * 1013450527)) {
				/* empty */
			} else
				method8120(Class491.aClass491_5479, 914546292);
		}
	}

	public Class494(Class485 class485, int i, int i_66_, Interface43 interface43, Class358 class358) {
		anInt5535 = 0;
		anInt5503 = 0;
		aFloat5540 = 0.0F;
		aLong5541 = 0L;
		aLong5542 = 0L;
		aFloat5543 = 0.0F;
		anInt5537 = 0;
		anInt5547 = 0;
		aClass358_5526 = class358;
		method8120(Class491.aClass491_5475, -96757759);
		anInt5510 = i * 2090002901;
		anInt5508 = 297875057 * i_66_;
		anInterface43_5525 = interface43;
		anInt5529 = 0;
		aBool5536 = false;
		anInterface43_5525.method295(new Class490(this));
		method8108(2067491945);
	}

	public boolean method8079() {
		return aBool5539;
	}

	void method8080() {
		if (method8041(-2145723611).anInt5476 * 1013450527 >= 1013450527 * Class491.aClass491_5477.anInt5476) {
			if (method8041(-1797042697) == Class491.aClass491_5482)
				method8088(-1053680933);
			else {
				method8117((byte) 2);
				if (aFloat5532 != aFloat5540) {
					long l = Class234.method4347(-1408626088);
					if (l > aLong5541 * -3936120985842281623L)
						aFloat5532 = aFloat5540;
					else {
						float f = aFloat5540 - aFloat5543;
						long l_67_ = (aLong5541 * -3936120985842281623L - aLong5542 * -2369264723060590679L);
						float f_68_ = f / (float) l_67_;
						aFloat5532 = (f_68_ * (float) (l - (aLong5542 * -2369264723060590679L)) + aFloat5543);
						aFloat5532 = Math.max(0.0F, Math.min(1.0F, aFloat5532));
					}
				}
				method8014(645497189);
				if (method8041(-1943018591).anInt5476 * 1013450527 < 1013450527 * Class491.aClass491_5479.anInt5476)
					method8026((byte) 100);
			}
		}
	}

	void method8081() {
		if (method8041(-1886153055).anInt5476 * 1013450527 >= 1013450527 * Class491.aClass491_5477.anInt5476) {
			if (method8041(-1803214739) == Class491.aClass491_5482)
				method8088(-1350825817);
			else {
				method8117((byte) 35);
				if (aFloat5532 != aFloat5540) {
					long l = Class234.method4347(-1408626088);
					if (l > aLong5541 * -3936120985842281623L)
						aFloat5532 = aFloat5540;
					else {
						float f = aFloat5540 - aFloat5543;
						long l_69_ = (aLong5541 * -3936120985842281623L - aLong5542 * -2369264723060590679L);
						float f_70_ = f / (float) l_69_;
						aFloat5532 = (f_70_ * (float) (l - (aLong5542 * -2369264723060590679L)) + aFloat5543);
						aFloat5532 = Math.max(0.0F, Math.min(1.0F, aFloat5532));
					}
				}
				method8014(-23276687);
				if (method8041(-1680879269).anInt5476 * 1013450527 < 1013450527 * Class491.aClass491_5479.anInt5476)
					method8026((byte) 100);
			}
		}
	}

	void method8082(float f) {
		synchronized (this) {
			aFloat5538 = f;
		}
	}

	void method8083(boolean bool, int i) {
		aBool5536 = bool;
	}

	void method8084() {
		synchronized (this) {
			int i = method8038(-1364363161);
			if (aBool5545 && i > -2096335745 * anInt5537 && anInterface43_5525.method316()) {
				/* empty */
			} else {
				Class370 class370 = anInterface43_5525.method281();
				if (aBool5536 && class370 != Class370.aClass370_3900) {
					if (aByteArray5512 != null) {
						if (-2143350869 * anInt5546 >= 940510855 * anInt5518) {
							anInterface43_5525.method66(null);
							anInt5546 = 0;
						} else {
							if (-1533072425 * anInt5509 < anInt5498 * -696810861)
								anInt5509 = anInt5498 * 1259448229;
							anInt5509 = (1831204839 * (anIntArray5519[anInt5546 * -2143350869] + 1439347891 * anInt5503));
							int i_71_ = anIntArray5513[anInt5546 * -2143350869];
							int i_72_ = i_71_;
							int i_73_ = (anInt5503 * 1439347891 + i_72_ > i_71_ ? (anIntArray5519[anInt5546 * -2143350869] + i_71_) : i_72_ + anInt5509 * -1533072425);
							Class494 class494_74_ = this;
							class494_74_.anInt5503 = (class494_74_.anInt5503 + ((i_72_ + anInt5509 * -1533072425 > aByteArray5512.length) ? (aByteArray5512.length - anInt5509 * -1533072425) : i_72_) * 1144724091);
							RSByteBuffer class527_sub38 = new RSByteBuffer(i_73_ - (-1533072425 * anInt5509), true);
							if (aByteArray5512 == null)
								throw new RuntimeException("");
							if (null == class527_sub38.buffer)
								throw new RuntimeException("");
							class527_sub38.writeBytes(aByteArray5512, -1533072425 * anInt5509, i_73_ - (anInt5509 * -1533072425), (byte) 14);
							anInterface43_5525.method66(class527_sub38);
							method8083(false, 976297105);
							if (anInt5503 * 1439347891 >= i_71_) {
								anInt5546 += 480998147;
								anInt5503 = 0;
							}
						}
					} else if (anInterface57_5517 != null) {
						if (1196609847 * anInt5507 >= 940510855 * anInt5518) {
							anInt5507 = 0;
							anInterface43_5525.method66(null);
						} else {
							byte[] is = (anInterface57_5517.method364(anIntArray5521[anInt5507 * 1196609847], 1161748555));
							if (null != is) {
								RSByteBuffer class527_sub38 = new RSByteBuffer(is);
								class527_sub38.anInt10689 = 1474750881 * is.length;
								anInterface43_5525.method66(class527_sub38);
								method8083(false, 976297105);
								anInt5507 += 1242543239;
							}
						}
					}
				}
			}
		}
	}

	void method8085() {
		synchronized (this) {
			if (anInterface43_5525.method281() == Class370.aClass370_3901) {
				if (null != anObject5520) {
					int i = aClass358_5526.method6276(anObject5520, -37582852);
					if (i >= -1864169603 * anInt5510) {
						aClass358_5526.method6293(anObject5520, -105941576);
						anObject5520 = null;
						method8120(Class491.aClass491_5475, 1272498635);
					}
				} else
					method8120(Class491.aClass491_5475, -474735885);
			}
		}
		method8108(2067491945);
	}

	void method8086() {
		if (method8041(-1710764132) != Class491.aClass491_5479 && (method8041(-1781959784).anInt5476 * 1013450527 < Class491.aClass491_5477.anInt5476 * 1013450527)) {
			method8120(Class491.aClass491_5477, 1644031877);
			aBool5523 = true;
			method8026((byte) 100);
			method8014(-761454582);
		}
	}

	void method8087() {
		synchronized (this) {
			method8025((byte) 0);
		}
	}

	void method8088(int i) {
		synchronized (this) {
			if (anInterface43_5525.method281() == Class370.aClass370_3901) {
				if (null != anObject5520) {
					int i_75_ = aClass358_5526.method6276(anObject5520, 477140594);
					if (i_75_ >= -1864169603 * anInt5510) {
						aClass358_5526.method6293(anObject5520, -905863867);
						anObject5520 = null;
						method8120(Class491.aClass491_5475, 1356057329);
					}
				} else
					method8120(Class491.aClass491_5475, 689980256);
			}
		}
		method8108(2067491945);
	}

	void method8089() {
		aBool5548 = true;
	}

	void method8090() {
		aBool5548 = true;
	}

	void method8091() {
		aBool5548 = false;
	}

	void method8092() {
		aBool5548 = false;
	}

	public void method8093() {
		if ((method8041(-2029471398).anInt5476 * 1013450527 >= Class491.aClass491_5477.anInt5476 * 1013450527) && (method8041(-1959622699).anInt5476 * 1013450527 < Class491.aClass491_5479.anInt5476 * 1013450527) && method8075(684434935)) {
			synchronized (this) {
				anInterface43_5525.method130();
				method8030(-56860461);
			}
			Thread.yield();
		}
	}

	void method8094() {
		if (aClass477Array5511 != null) {
			boolean bool = true;
			Class370 class370 = anInterface43_5525.method281();
			if (anInterface43_5525.method316()) {
				if (aBool5545 && method8037(-2096335745 * anInt5537, 2011338021)) {
					if (aClass477Array5511[-1625082935 * anInt5535] == null) {
						RSByteBuffer class527_sub38 = method8036(anInt5537 * -2096335745, -1410025065);
						if (null != class527_sub38) {
							aClass477Array5511[anInt5535 * -1625082935] = new Class477(this, class527_sub38, false);
							int i = anInterface43_5525.method72();
							int i_76_ = (anInterface43_5525.method179(-441238943 * (aClass477Array5511[anInt5535 * -1625082935].aClass527_Sub38_5387.anInt10689) / i));
							anInt5531 += -1297232747 * i_76_;
							if (!aBool5505 && aBool5527 && -2030307209 * anInt5547 > 0) {
								if (1153212093 * anInt5531 < anInt5514 * 1119431603)
									aClass477Array5511[-1625082935 * anInt5535] = null;
								else if ((1153212093 * anInt5531 >= 1119431603 * anInt5514) && (anInt5531 * 1153212093 - i_76_ < anInt5514 * 1119431603))
									aClass477Array5511[-1625082935 * anInt5535].anInt5384 = ((anInterface43_5525.method319(i * (anInt5531 * 1153212093 - anInt5514 * 1119431603))) * 613641665);
							}
							anInt5537 += -590394497;
							if (!aBool5505 && aBool5527 && (1153212093 * anInt5531 >= anInt5515 * 728275661) && ((anInt5547 * -2030307209 < anInt5504 * -961432897) || -961432897 * anInt5504 < 0)) {
								int i_77_ = (anInt5531 * 1153212093 - 728275661 * anInt5515);
								int i_78_ = i_76_ - i_77_;
								aClass477Array5511[-1625082935 * anInt5535].anInt5386 = (anInterface43_5525.method319(i_78_ * i) * -633303233);
								anInt5537 = 0;
								anInt5531 = 0;
								anInt5547 += -1206951609;
							}
							if (aClass477Array5511[anInt5535 * -1625082935] != null) {
								anInt5535 += -1027647879;
								anInt5535 = (-1625082935 * anInt5535 % aClass477Array5511.length * -1027647879);
							}
						}
					}
				} else if (!method8039((byte) 124) || !aBool5545) {
					int i = anInterface43_5525.method51();
					int i_79_ = anInterface43_5525.method179(anInt5510 * -1864169603);
					if (!aBool5533 && (aClass477Array5511[anInt5535 * -1625082935] == null)) {
						if (class370 != Class370.aClass370_3896 && i > 0) {
							RSByteBuffer class527_sub38 = method8029(i_79_, -1958574122);
							aClass477Array5511[-1625082935 * anInt5535] = (class527_sub38 != null ? new Class477(this, class527_sub38, false) : null);
							int i_80_ = ((aClass477Array5511[-1625082935 * anInt5535] != null) ? -441238943 * (aClass477Array5511[-1625082935 * anInt5535].aClass527_Sub38_5387.anInt10689) : 0);
							int i_81_ = anInterface43_5525.method72();
							int i_82_ = anInterface43_5525.method179(i_80_ / i_81_);
							anInt5534 += i_82_ * -243571503;
							if (anInt5534 * -1958513615 > anInt5531 * 1153212093) {
								anInt5531 += i_82_ * -1297232747;
								i -= i_82_;
								if (false == aBool5505 && aBool5527 && anInt5547 * -2030307209 > 0) {
									if (1153212093 * anInt5531 < 1119431603 * anInt5514)
										aClass477Array5511[(anInt5535 * -1625082935)] = null;
									else if ((1153212093 * anInt5531 >= 1119431603 * anInt5514) && (anInt5531 * 1153212093 - i_82_ < 1119431603 * anInt5514))
										aClass477Array5511[anInt5535 * -1625082935].anInt5384 = (anInterface43_5525.method319((1153212093 * anInt5531 - 1119431603 * anInt5514) * i_81_)) * 613641665;
								}
								if (aClass477Array5511[anInt5535 * -1625082935] != null) {
									if (aBool5545 && !method8037(-2096335745 * anInt5537, 2014615789))
										method8035((aClass477Array5511[anInt5535 * -1625082935].aClass527_Sub38_5387), (byte) 0);
									if (!aBool5505 && aBool5527 && (anInt5531 * 1153212093 >= 728275661 * anInt5515) && ((anInt5547 * -2030307209 <= anInt5504 * -961432897) || anInt5504 * -961432897 < 0)) {
										int i_83_ = (anInt5531 * 1153212093 - anInt5515 * 728275661);
										int i_84_ = i_82_ - i_83_;
										aClass477Array5511[anInt5535 * -1625082935].anInt5386 = (anInterface43_5525.method319(i_81_ * i_84_) * -633303233);
										anInt5537 = 0;
										anInt5547 += -1206951609;
										anInt5531 = 0;
									} else
										anInt5537 += -590394497;
									anInt5535 += -1027647879;
									anInt5535 = (-1027647879 * (anInt5535 * -1625082935 % aClass477Array5511.length));
								}
							} else
								aClass477Array5511[anInt5535 * -1625082935] = null;
						} else if (Class370.aClass370_3896 == class370 && aBool5527 && !aBool5505 && ((-2030307209 * anInt5547 < anInt5504 * -961432897) || anInt5504 * -961432897 < 0))
							anInterface43_5525.method291(true);
					}
				}
			}
			int i = 0;
			for (int i_85_ = 0; i_85_ < aClass477Array5511.length; i_85_++) {
				if (aClass477Array5511[i_85_] != null) {
					i++;
					bool = false;
				}
			}
			if (!aBool5528 && method8018((byte) 88) >= 0.0F && (i >= -506738031 * anInt5508 || Class370.aClass370_3896 == class370 || Class370.aClass370_3900 == class370)) {
				aBool5528 = true;
				method8120(Class491.aClass491_5483, -322704523);
			}
			if (anInterface43_5525.method316() && bool && (method8039((byte) 11) || aBool5533 || class370 == Class370.aClass370_3896) && (!aBool5527 || (false == aBool5505 && -2030307209 * anInt5547 >= -961432897 * anInt5504 && anInt5504 * -961432897 >= 0))) {
				method8120(Class491.aClass491_5481, 856603620);
				aBool5523 = false;
				if (aBool5545)
					method8040((byte) -76);
			}
		}
	}

	void method8095(boolean bool) {
		aBool5536 = bool;
	}

	void method8096(byte[] is, int i, int i_86_) {
		int i_87_ = i;
		int i_88_ = 0;
		int i_89_ = anInterface43_5525.method307().anInt4005 * 370905523;
		while (i_87_ < is.length && i_87_ < i_86_) {
			float f = aFloatArray5502[i_88_] * (aFloat5501 * aFloat5532);
			if (i_89_ == 16) {
				int i_90_ = (is[i_87_] & 0xff) + (is[i_87_ + 1] << 8);
				i_90_ *= f * f;
				is[i_87_++] = (byte) i_90_;
				is[i_87_++] = (byte) (i_90_ >> 8);
			} else if (8 == i_89_) {
				byte i_91_ = is[i_87_];
				i_91_ *= f;
				is[i_87_++] = i_91_;
			} else
				throw new RuntimeException("");
			i_88_ = ++i_88_ % aFloatArray5502.length;
		}
	}

	void method8097(byte[] is, int i, int i_92_) {
		int i_93_ = i;
		int i_94_ = 0;
		int i_95_ = anInterface43_5525.method307().anInt4005 * 370905523;
		while (i_93_ < is.length && i_93_ < i_92_) {
			float f = aFloatArray5502[i_94_] * (aFloat5501 * aFloat5532);
			if (i_95_ == 16) {
				int i_96_ = (is[i_93_] & 0xff) + (is[i_93_ + 1] << 8);
				i_96_ *= f * f;
				is[i_93_++] = (byte) i_96_;
				is[i_93_++] = (byte) (i_96_ >> 8);
			} else if (8 == i_95_) {
				byte i_97_ = is[i_93_];
				i_97_ *= f;
				is[i_93_++] = i_97_;
			} else
				throw new RuntimeException("");
			i_94_ = ++i_94_ % aFloatArray5502.length;
		}
	}

	boolean method8098(byte[] is, Interface57 interface57, int i, float f, boolean bool, boolean bool_98_, int i_99_, float f_100_, Object object, byte i_101_) {
		synchronized (this) {
			if (null != interface57) {
				aByteArray5512 = null;
				anInterface57_5517 = interface57;
			} else
				aByteArray5512 = is;
			anObject5544 = object;
			anInt5499 = i * -446863251;
			aFloat5532 = f;
			aBool5527 = bool_98_;
			anInt5504 = 3325247 * i_99_;
			aFloat5500 = f_100_;
			byte[] is_102_ = null;
			if (aByteArray5512 != null)
				is_102_ = aByteArray5512;
			else if (anInterface57_5517 != null) {
				anInt5507 = 0;
				is_102_ = anInterface57_5517.method364(anInt5507 * 1196609847, 1643484570);
			}
			if (is_102_ != null) {
				RSByteBuffer class527_sub38 = new RSByteBuffer(is_102_);
				if (class527_sub38.readUnsignedByte() != 74 || class527_sub38.readUnsignedByte() != 65 || class527_sub38.readUnsignedByte() != 71 || class527_sub38.readUnsignedByte() != 65)
					throw new RuntimeException("");
				anInt5514 = class527_sub38.readInt() * -95192197;
				anInt5515 = class527_sub38.readInt() * 528278021;
				anInt5506 = class527_sub38.readInt() * -1102315897;
				anInt5516 = class527_sub38.readInt() * -662240445;
				anInt5518 = class527_sub38.readInt() * 864835383;
				if (null == anObject5520) {
					anObject5520 = aClass358_5526.method6273(-35511957 * anInt5516, anInt5506 * 278685495, anInterface43_5525.method307(), anInterface43_5525.method302(), -1864169603 * anInt5510, aFloat5500, (byte) 5);
					if (anObject5520 == null) {
						method8120(Class491.aClass491_5481, 1442853519);
						boolean bool_103_ = false;
						return bool_103_;
					}
				}
				anIntArray5519 = new int[940510855 * anInt5518];
				anIntArray5513 = new int[940510855 * anInt5518];
				anIntArray5521 = new int[940510855 * anInt5518];
				int i_104_ = (class527_sub38.anInt10689 * -441238943 + anInt5518 * -1065847752);
				for (int i_105_ = 0; i_105_ < 940510855 * anInt5518; i_105_++) {
					anIntArray5519[i_105_] = i_104_;
					anIntArray5513[i_105_] = class527_sub38.readInt();
					anIntArray5521[i_105_] = class527_sub38.readInt();
					i_104_ += anIntArray5513[i_105_];
				}
				anInt5498 = -260545605 * class527_sub38.anInt10689;
				aClass477Array5511 = new Class477[anInt5508 * -506738031];
				aFloatArray5502 = new float[2];
				for (int i_106_ = 0; i_106_ < aFloatArray5502.length; i_106_++)
					aFloatArray5502[i_106_] = 1.0F;
				if (anObject5544 instanceof Class483) {
					Interface70 interface70 = ((Class483) anObject5544).method7926(-1920846025);
					aBool5545 = interface70.method437((byte) 34);
					aBool5505 = !aBool5545;
				}
				anInterface43_5525.method290(aBool5505, (aBool5527 ? anInt5504 * -961432897 : 0), 1119431603 * anInt5514, 728275661 * anInt5515);
				if (anInterface57_5517 != null) {
					int i_107_ = (class527_sub38.buffer.length - -696810861 * anInt5498);
					byte[] is_108_ = Class706.method14340(i_107_, true, -740746889);
					System.arraycopy(class527_sub38.buffer, anInt5498 * -696810861, is_108_, 0, i_107_);
					class527_sub38.buffer = is_108_;
					class527_sub38.anInt10689 = i_107_ * 1474750881;
					anInterface43_5525.method66(class527_sub38);
					anInt5507 += 1242543239;
				} else
					aBool5536 = true;
				boolean bool_109_ = true;
				return bool_109_;
			}
			boolean bool_110_ = is_102_ != null;
			return bool_110_;
		}
	}

	void method8099(byte[] is, int i, int i_111_) {
		int i_112_ = i;
		int i_113_ = 0;
		int i_114_ = anInterface43_5525.method307().anInt4005 * 370905523;
		while (i_112_ < is.length && i_112_ < i_111_) {
			float f = aFloatArray5502[i_113_] * (aFloat5501 * aFloat5532);
			if (i_114_ == 16) {
				int i_115_ = (is[i_112_] & 0xff) + (is[i_112_ + 1] << 8);
				i_115_ *= f * f;
				is[i_112_++] = (byte) i_115_;
				is[i_112_++] = (byte) (i_115_ >> 8);
			} else if (8 == i_114_) {
				byte i_116_ = is[i_112_];
				i_116_ *= f;
				is[i_112_++] = i_116_;
			} else
				throw new RuntimeException("");
			i_113_ = ++i_113_ % aFloatArray5502.length;
		}
	}

	void method8100(RSByteBuffer class527_sub38) {
		if (null != anObject5544 && anObject5544 instanceof Class483) {
			Class483 class483 = (Class483) anObject5544;
			Interface70 interface70 = class483.method7926(-1933318701);
			byte[] is = new byte[-441238943 * class527_sub38.anInt10689];
			System.arraycopy(class527_sub38.buffer, 0, is, 0, class527_sub38.anInt10689 * -441238943);
			RSByteBuffer class527_sub38_117_ = new RSByteBuffer(is);
			class527_sub38_117_.anInt10689 = class527_sub38.anInt10689 * 1;
			interface70.method450(class527_sub38_117_, 1163493675);
		}
	}

	RSByteBuffer method8101(int i) {
		if (null != anObject5544 && anObject5544 instanceof Class483) {
			Class483 class483 = (Class483) anObject5544;
			Interface70 interface70 = class483.method7926(-1824812097);
			RSByteBuffer class527_sub38 = interface70.method436(i, (short) -9426);
			RSByteBuffer class527_sub38_118_ = new RSByteBuffer(-441238943 * class527_sub38.anInt10689, true);
			class527_sub38_118_.writeBuffer(class527_sub38, (byte) 4);
			return class527_sub38_118_;
		}
		return null;
	}

	RSByteBuffer method8102(int i) {
		if (null != anObject5544 && anObject5544 instanceof Class483) {
			Class483 class483 = (Class483) anObject5544;
			Interface70 interface70 = class483.method7926(-1900055277);
			RSByteBuffer class527_sub38 = interface70.method436(i, (short) 9862);
			RSByteBuffer class527_sub38_119_ = new RSByteBuffer(-441238943 * class527_sub38.anInt10689, true);
			class527_sub38_119_.writeBuffer(class527_sub38, (byte) 4);
			return class527_sub38_119_;
		}
		return null;
	}

	public void method8103() {
		synchronized (this) {
			if (method8041(-1600632539) == Class491.aClass491_5479 || (method8041(-1712043938).anInt5476 * 1013450527 < Class491.aClass491_5474.anInt5476 * 1013450527)) {
				/* empty */
			} else
				method8120(Class491.aClass491_5479, -317545303);
		}
	}

	boolean method8104(int i) {
		if (null != anObject5544 && anObject5544 instanceof Class483) {
			Class483 class483 = (Class483) anObject5544;
			Interface70 interface70 = class483.method7926(-2094137637);
			return interface70.method459(i, -1025003033);
		}
		return false;
	}

	int method8105() {
		if (anObject5544 != null && anObject5544 instanceof Class483) {
			Class483 class483 = (Class483) anObject5544;
			Interface70 interface70 = class483.method7926(-1943362808);
			return interface70.method439((byte) -95);
		}
		return 0;
	}

	void method8106(Class491 class491) {
		aClass491_5524 = class491;
	}

	int method8107() {
		if (anObject5544 != null && anObject5544 instanceof Class483) {
			Class483 class483 = (Class483) anObject5544;
			Interface70 interface70 = class483.method7926(-1806717818);
			return interface70.method439((byte) -73);
		}
		return 0;
	}

	void method8108(int i) {
		synchronized (this) {
			aByteArray5512 = null;
			anInt5499 = 0;
			aFloat5532 = 0.0F;
			aFloat5501 = 0.0F;
			aBool5527 = false;
			anInt5504 = 0;
			aFloat5500 = 1.0F;
			anInterface57_5517 = null;
			anInt5507 = 0;
			anInt5509 = 0;
			if (aClass477Array5511 != null) {
				for (int i_120_ = 0; i_120_ < aClass477Array5511.length; i_120_++) {
					if (aClass477Array5511[i_120_] != null)
						aClass477Array5511[i_120_].method7775(-2015595591);
				}
			}
			aClass477Array5511 = null;
			aBool5545 = false;
			anInt5529 = 0;
			anInt5514 = 0;
			anInt5515 = 0;
			anInt5516 = 0;
			anInt5506 = 0;
			anInt5518 = 0;
			anIntArray5519 = null;
			anIntArray5513 = null;
			anIntArray5521 = null;
			anInt5498 = 0;
			aBool5523 = false;
			anInterface43_5525.method285();
			aBool5536 = false;
			anInterface56_5522 = null;
			anObject5544 = null;
			anInt5530 = 0;
			anInt5531 = 0;
			anInt5534 = 0;
			aBool5533 = false;
			anInt5546 = 0;
			anInt5535 = 0;
			aBool5528 = false;
			anInt5503 = 0;
			method8019(-1.0F, 622445028);
			aBool5539 = false;
			aFloat5540 = 0.0F;
			aLong5541 = 0L;
			aLong5542 = 0L;
			aFloat5543 = 0.0F;
			anInt5537 = 0;
			anInt5547 = 0;
		}
	}

	boolean method8109() {
		synchronized (this) {
			if (anObject5544 != null && anObject5544 instanceof Class483) {
				Class483 class483 = (Class483) anObject5544;
				Interface70 interface70 = class483.method7926(-1957244920);
				if (interface70 != null) {
					boolean bool = interface70.method441((byte) -100);
					return bool;
				}
			}
			boolean bool = false;
			return bool;
		}
	}

	boolean method8110() {
		synchronized (this) {
			if (anObject5544 != null && anObject5544 instanceof Class483) {
				Class483 class483 = (Class483) anObject5544;
				Interface70 interface70 = class483.method7926(-2098303664);
				if (interface70 != null) {
					boolean bool = interface70.method441((byte) -112);
					return bool;
				}
			}
			boolean bool = false;
			return bool;
		}
	}

	void method8111() {
		synchronized (this) {
			if (null != anObject5544 && anObject5544 instanceof Class483) {
				Class483 class483 = (Class483) anObject5544;
				Interface70 interface70 = class483.method7926(-2035700828);
				if (null != interface70)
					interface70.method440(true, (byte) -40);
			}
		}
	}

	void method8112() {
		synchronized (this) {
			if (null != anObject5544 && anObject5544 instanceof Class483) {
				Class483 class483 = (Class483) anObject5544;
				Interface70 interface70 = class483.method7926(-1941257323);
				if (null != interface70)
					interface70.method440(true, (byte) -87);
			}
		}
	}

	void method8113(byte[] is, int i, int i_121_, int i_122_) {
		int i_123_ = i;
		int i_124_ = 0;
		int i_125_ = anInterface43_5525.method307().anInt4005 * 370905523;
		while (i_123_ < is.length && i_123_ < i_121_) {
			float f = aFloatArray5502[i_124_] * (aFloat5501 * aFloat5532);
			if (i_125_ == 16) {
				int i_126_ = (is[i_123_] & 0xff) + (is[i_123_ + 1] << 8);
				i_126_ *= f * f;
				is[i_123_++] = (byte) i_126_;
				is[i_123_++] = (byte) (i_126_ >> 8);
			} else if (8 == i_125_) {
				byte i_127_ = is[i_123_];
				i_127_ *= f;
				is[i_123_++] = i_127_;
			} else
				throw new RuntimeException("");
			i_124_ = ++i_124_ % aFloatArray5502.length;
		}
	}

	Object method8114() {
		return anObject5544;
	}

	Object method8115() {
		return anObject5544;
	}

	Object method8116() {
		return anObject5544;
	}

	void method8117(byte i) {
		synchronized (this) {
			int i_128_ = method8038(-1764017141);
			if (aBool5545 && i_128_ > -2096335745 * anInt5537 && anInterface43_5525.method316()) {
				/* empty */
			} else {
				Class370 class370 = anInterface43_5525.method281();
				if (aBool5536 && class370 != Class370.aClass370_3900) {
					if (aByteArray5512 != null) {
						if (-2143350869 * anInt5546 >= 940510855 * anInt5518) {
							anInterface43_5525.method66(null);
							anInt5546 = 0;
						} else {
							if (-1533072425 * anInt5509 < anInt5498 * -696810861)
								anInt5509 = anInt5498 * 1259448229;
							anInt5509 = (1831204839 * (anIntArray5519[anInt5546 * -2143350869] + 1439347891 * anInt5503));
							int i_129_ = anIntArray5513[anInt5546 * -2143350869];
							int i_130_ = i_129_;
							int i_131_ = (anInt5503 * 1439347891 + i_130_ > i_129_ ? (anIntArray5519[anInt5546 * -2143350869] + i_129_) : i_130_ + anInt5509 * -1533072425);
							Class494 class494_132_ = this;
							class494_132_.anInt5503 = (class494_132_.anInt5503 + ((i_130_ + anInt5509 * -1533072425 > aByteArray5512.length) ? (aByteArray5512.length - anInt5509 * -1533072425) : i_130_) * 1144724091);
							RSByteBuffer class527_sub38 = new RSByteBuffer(i_131_ - (-1533072425 * anInt5509), true);
							if (aByteArray5512 == null)
								throw new RuntimeException("");
							if (null == class527_sub38.buffer)
								throw new RuntimeException("");
							class527_sub38.writeBytes(aByteArray5512, -1533072425 * anInt5509, i_131_ - anInt5509 * -1533072425, (byte) 91);
							anInterface43_5525.method66(class527_sub38);
							method8083(false, 976297105);
							if (anInt5503 * 1439347891 >= i_129_) {
								anInt5546 += 480998147;
								anInt5503 = 0;
							}
						}
					} else if (anInterface57_5517 != null) {
						if (1196609847 * anInt5507 >= 940510855 * anInt5518) {
							anInt5507 = 0;
							anInterface43_5525.method66(null);
						} else {
							byte[] is = (anInterface57_5517.method364(anIntArray5521[anInt5507 * 1196609847], 2044258024));
							if (null != is) {
								RSByteBuffer class527_sub38 = new RSByteBuffer(is);
								class527_sub38.anInt10689 = 1474750881 * is.length;
								anInterface43_5525.method66(class527_sub38);
								method8083(false, 976297105);
								anInt5507 += 1242543239;
							}
						}
					}
				}
			}
		}
	}

	void method8118() {
		synchronized (this) {
			aByteArray5512 = null;
			anInt5499 = 0;
			aFloat5532 = 0.0F;
			aFloat5501 = 0.0F;
			aBool5527 = false;
			anInt5504 = 0;
			aFloat5500 = 1.0F;
			anInterface57_5517 = null;
			anInt5507 = 0;
			anInt5509 = 0;
			if (aClass477Array5511 != null) {
				for (int i = 0; i < aClass477Array5511.length; i++) {
					if (aClass477Array5511[i] != null)
						aClass477Array5511[i].method7775(-2090201021);
				}
			}
			aClass477Array5511 = null;
			aBool5545 = false;
			anInt5529 = 0;
			anInt5514 = 0;
			anInt5515 = 0;
			anInt5516 = 0;
			anInt5506 = 0;
			anInt5518 = 0;
			anIntArray5519 = null;
			anIntArray5513 = null;
			anIntArray5521 = null;
			anInt5498 = 0;
			aBool5523 = false;
			anInterface43_5525.method285();
			aBool5536 = false;
			anInterface56_5522 = null;
			anObject5544 = null;
			anInt5530 = 0;
			anInt5531 = 0;
			anInt5534 = 0;
			aBool5533 = false;
			anInt5546 = 0;
			anInt5535 = 0;
			aBool5528 = false;
			anInt5503 = 0;
			method8019(-1.0F, 1072576864);
			aBool5539 = false;
			aFloat5540 = 0.0F;
			aLong5541 = 0L;
			aLong5542 = 0L;
			aFloat5543 = 0.0F;
			anInt5537 = 0;
			anInt5547 = 0;
		}
	}

	void method8119() {
		synchronized (this) {
			aByteArray5512 = null;
			anInt5499 = 0;
			aFloat5532 = 0.0F;
			aFloat5501 = 0.0F;
			aBool5527 = false;
			anInt5504 = 0;
			aFloat5500 = 1.0F;
			anInterface57_5517 = null;
			anInt5507 = 0;
			anInt5509 = 0;
			if (aClass477Array5511 != null) {
				for (int i = 0; i < aClass477Array5511.length; i++) {
					if (aClass477Array5511[i] != null)
						aClass477Array5511[i].method7775(-2051950962);
				}
			}
			aClass477Array5511 = null;
			aBool5545 = false;
			anInt5529 = 0;
			anInt5514 = 0;
			anInt5515 = 0;
			anInt5516 = 0;
			anInt5506 = 0;
			anInt5518 = 0;
			anIntArray5519 = null;
			anIntArray5513 = null;
			anIntArray5521 = null;
			anInt5498 = 0;
			aBool5523 = false;
			anInterface43_5525.method285();
			aBool5536 = false;
			anInterface56_5522 = null;
			anObject5544 = null;
			anInt5530 = 0;
			anInt5531 = 0;
			anInt5534 = 0;
			aBool5533 = false;
			anInt5546 = 0;
			anInt5535 = 0;
			aBool5528 = false;
			anInt5503 = 0;
			method8019(-1.0F, -249625114);
			aBool5539 = false;
			aFloat5540 = 0.0F;
			aLong5541 = 0L;
			aLong5542 = 0L;
			aFloat5543 = 0.0F;
			anInt5537 = 0;
			anInt5547 = 0;
		}
	}

	void method8120(Class491 class491, int i) {
		aClass491_5524 = class491;
	}

	void method8121() {
		synchronized (this) {
			aByteArray5512 = null;
			anInt5499 = 0;
			aFloat5532 = 0.0F;
			aFloat5501 = 0.0F;
			aBool5527 = false;
			anInt5504 = 0;
			aFloat5500 = 1.0F;
			anInterface57_5517 = null;
			anInt5507 = 0;
			anInt5509 = 0;
			if (aClass477Array5511 != null) {
				for (int i = 0; i < aClass477Array5511.length; i++) {
					if (aClass477Array5511[i] != null)
						aClass477Array5511[i].method7775(-2107601679);
				}
			}
			aClass477Array5511 = null;
			aBool5545 = false;
			anInt5529 = 0;
			anInt5514 = 0;
			anInt5515 = 0;
			anInt5516 = 0;
			anInt5506 = 0;
			anInt5518 = 0;
			anIntArray5519 = null;
			anIntArray5513 = null;
			anIntArray5521 = null;
			anInt5498 = 0;
			aBool5523 = false;
			anInterface43_5525.method285();
			aBool5536 = false;
			anInterface56_5522 = null;
			anObject5544 = null;
			anInt5530 = 0;
			anInt5531 = 0;
			anInt5534 = 0;
			aBool5533 = false;
			anInt5546 = 0;
			anInt5535 = 0;
			aBool5528 = false;
			anInt5503 = 0;
			method8019(-1.0F, 1954356079);
			aBool5539 = false;
			aFloat5540 = 0.0F;
			aLong5541 = 0L;
			aLong5542 = 0L;
			aFloat5543 = 0.0F;
			anInt5537 = 0;
			anInt5547 = 0;
		}
	}

	public void method8122() {
		if (method8041(-1925751241).anInt5476 * 1013450527 >= Class491.aClass491_5474.anInt5476 * 1013450527)
			throw new RuntimeException("");
		method8120(Class491.aClass491_5474, 2017075746);
	}

	public static void method8123(float f, Class442 class442, Class442 class442_133_, Class442 class442_134_, Class442 class442_135_, Class442 class442_136_, float f_137_, float f_138_, float f_139_, float f_140_, int i) {
		if (!class442_133_.method7177(class442)) {
			Class442 class442_141_ = Class442.method7155(class442_133_, class442);
			float f_142_ = class442_141_.method7160();
			if (f_137_ > 0.0F) {
				class442_135_ = Class442.method7139(class442_135_);
				class442_135_.method7164(f_138_ * (f_142_ / f_137_));
			}
			if (class442_135_.aFloat4918 == Float.POSITIVE_INFINITY || Float.isNaN(class442.aFloat4918) || f_142_ > f_139_) {
				class442.method7146(class442_133_);
				class442_134_.method7211();
			} else {
				Class442 class442_143_ = Class442.method7139(class442_134_);
				class442_143_.method7147();
				Class442 class442_144_ = Class442.method7191(class442_143_, class442_135_);
				Class442 class442_145_ = Class442.method7163(class442_143_, class442_144_);
				class442_145_.method7164(0.5F);
				Class442 class442_146_ = Class442.method7139(class442_134_);
				Class442 class442_147_ = Class442.method7139(class442_141_);
				class442_147_.method7147();
				if (class442_145_.aFloat4918 > class442_147_.aFloat4918) {
					if (class442_141_.aFloat4918 < 0.0F) {
						class442_146_.aFloat4918 += class442_135_.aFloat4918 * f;
						if (class442_146_.aFloat4918 > 0.0F)
							class442_146_.aFloat4918 = 0.0F;
					} else {
						class442_146_.aFloat4918 -= f * class442_135_.aFloat4918;
						if (class442_146_.aFloat4918 < 0.0F)
							class442_146_.aFloat4918 = 0.0F;
					}
				} else if (class442_143_.aFloat4918 < class442_136_.aFloat4918) {
					if (class442_141_.aFloat4918 < 0.0F) {
						class442_146_.aFloat4918 -= f * class442_135_.aFloat4918;
						if (class442_146_.aFloat4918 < -class442_136_.aFloat4918)
							class442_146_.aFloat4918 = -class442_136_.aFloat4918;
					} else {
						class442_146_.aFloat4918 += class442_135_.aFloat4918 * f;
						if (class442_146_.aFloat4918 > class442_136_.aFloat4918)
							class442_146_.aFloat4918 = class442_136_.aFloat4918;
					}
				}
				if (class442_145_.aFloat4915 > class442_147_.aFloat4915) {
					if (class442_141_.aFloat4915 < 0.0F) {
						class442_146_.aFloat4915 += class442_135_.aFloat4915 * f;
						if (class442_146_.aFloat4915 > 0.0F)
							class442_146_.aFloat4915 = 0.0F;
					} else {
						class442_146_.aFloat4915 -= f * class442_135_.aFloat4915;
						if (class442_146_.aFloat4915 < 0.0F)
							class442_146_.aFloat4915 = 0.0F;
					}
				} else if (class442_143_.aFloat4915 < class442_136_.aFloat4915) {
					if (class442_141_.aFloat4915 < 0.0F) {
						class442_146_.aFloat4915 -= f * class442_135_.aFloat4915;
						if (class442_146_.aFloat4915 < -class442_136_.aFloat4915)
							class442_146_.aFloat4915 = -class442_136_.aFloat4915;
					} else {
						class442_146_.aFloat4915 += class442_135_.aFloat4915 * f;
						if (class442_146_.aFloat4915 > class442_136_.aFloat4915)
							class442_146_.aFloat4915 = class442_136_.aFloat4915;
					}
				}
				if (class442_145_.aFloat4919 > class442_147_.aFloat4919) {
					if (class442_141_.aFloat4919 < 0.0F) {
						class442_146_.aFloat4919 += f * class442_135_.aFloat4919;
						if (class442_146_.aFloat4919 > 0.0F)
							class442_146_.aFloat4919 = 0.0F;
					} else {
						class442_146_.aFloat4919 -= f * class442_135_.aFloat4919;
						if (class442_146_.aFloat4919 < 0.0F)
							class442_146_.aFloat4919 = 0.0F;
					}
				} else if (class442_143_.aFloat4919 < class442_136_.aFloat4919) {
					if (class442_141_.aFloat4919 < 0.0F) {
						class442_146_.aFloat4919 -= class442_135_.aFloat4919 * f;
						if (class442_146_.aFloat4919 < -class442_136_.aFloat4919)
							class442_146_.aFloat4919 = -class442_136_.aFloat4919;
					} else {
						class442_146_.aFloat4919 += class442_135_.aFloat4919 * f;
						if (class442_146_.aFloat4919 > class442_136_.aFloat4919)
							class442_146_.aFloat4919 = class442_136_.aFloat4919;
					}
				}
				class442_134_.method7172(class442_146_, 0.8F);
				if (f_142_ < f_140_ && class442_134_.method7160() < f_140_) {
					class442.method7146(class442_133_);
					class442_134_.method7211();
				} else
					class442.method7219(Class442.method7168(class442_134_, f));
				class442_143_.method7141();
				class442_146_.method7141();
				class442_147_.method7141();
			}
		}
	}
}
