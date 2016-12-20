/* Class531 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class531 {
	boolean aBool7186;
	byte aByte7187;
	Class24_Sub6 aClass24_Sub6_7188;
	int anInt7189;
	Class613 aClass613_7190;
	boolean aBool7191;
	boolean aBool7192 = false;
	int anInt7193;
	Class695 aClass695_7194;
	Class695 aClass695_7195;
	Class640_Sub1 aClass640_Sub1_7196;
	int anInt7197 = -1016911849;
	int anInt7198 = 0;
	int anInt7199;
	boolean aBool7200;
	Class527_Sub8_Sub8 aClass527_Sub8_Sub8_7201;
	int anInt7202;
	boolean[] aBoolArray7203;
	Class176 aClass176_7204;
	Class599 aClass599_7205;

	final Class176 method8883(Class180 class180, int i, boolean bool, boolean bool_0_) {
		Class602 class602 = (Class602) aClass24_Sub6_7188.method81(-1558032059 * anInt7189, 617699695);
		if (class602.anIntArray7929 != null)
			class602 = class602.method9962(Class671.aClass97_8584, (4 == -1481292237 * client.anInt11080 ? (Interface18) (Class209.anInterface18_2245) : Class671.aClass97_8584), 1137928779);
		if (null == class602) {
			method8903(class180, (byte) 3);
			anInt7197 = -1016911849;
			return null;
		}
		if (!aBool7186 && anInt7197 * -938774439 != class602.anInt7873 * -320331677) {
			method8895(true, -1, 0, 0, -827168916);
			aBool7191 = false;
			aClass176_7204 = null;
		}
		method8892(aClass640_Sub1_7196, 1268080341);
		if (bool_0_)
			bool_0_ = bool_0_ & (aBool7200 & !aBool7191 & Class204.aClass527_Sub31_2213.aClass700_Sub1_10603.method16843(-1089277393) != 0);
		if (bool && !bool_0_) {
			anInt7197 = -2100519141 * class602.anInt7873;
			return null;
		}
		Class442 class442 = aClass640_Sub1_7196.method10637().aClass442_4927;
		Class555 class555 = client.aClass509_11072.method8314(-1790390556);
		if (bool_0_) {
			class555.method9268(aClass527_Sub8_Sub8_7201, aByte7187, (int) class442.aFloat4918, (int) class442.aFloat4919, aBoolArray7203, (byte) 50);
			aBool7191 = false;
		}
		Class161 class161 = class555.aClass161Array7434[aByte7187];
		Class161 class161_1_;
		if (aBool7192)
			class161_1_ = class555.aClass161Array7457[0];
		else
			class161_1_ = (aByte7187 < 3 ? class555.aClass161Array7434[aByte7187 + 1] : null);
		Class176 class176 = null;
		if (aClass695_7194.method14162(-253372062)) {
			if (bool_0_)
				i |= 0x40000;
			class176 = (class602.method9955(class180, i, (-2145189103 * anInt7193 != 11 ? anInt7193 * -2145189103 : 10), (11 == anInt7193 * -2145189103 ? anInt7202 * 525445103 + 4 : 525445103 * anInt7202), class161, class161_1_, (int) class442.aFloat4918, class161.method2593((int) class442.aFloat4918, (int) class442.aFloat4919, -1151432033), (int) class442.aFloat4919, aClass695_7194, aClass599_7205, (byte) 40));
			if (class176 != null) {
				if (bool_0_) {
					if (aBoolArray7203 == null)
						aBoolArray7203 = new boolean[4];
					aClass527_Sub8_Sub8_7201 = class176.method2891(aClass527_Sub8_Sub8_7201);
					class555.method9267(aClass527_Sub8_Sub8_7201, aByte7187, (int) class442.aFloat4918, (int) class442.aFloat4919, aBoolArray7203, 1959880334);
					aBool7191 = true;
				}
				anInt7198 = class176.method2896() * -2112660905;
				class176.method2893();
			} else {
				aBoolArray7203 = null;
				aClass527_Sub8_Sub8_7201 = null;
				anInt7198 = 0;
			}
			aClass176_7204 = null;
		} else if (null == aClass176_7204 || (aClass176_7204.method2874() & i) != i || (-938774439 * anInt7197 != class602.anInt7873 * -320331677)) {
			if (aClass176_7204 != null)
				i |= aClass176_7204.method2874();
			Class20 class20 = (class602.method9960(class180, i, (11 != anInt7193 * -2145189103 ? anInt7193 * -2145189103 : 10), (anInt7193 * -2145189103 == 11 ? 525445103 * anInt7202 + 4 : anInt7202 * 525445103), class161, class161_1_, (int) class442.aFloat4918, class161.method2593((int) class442.aFloat4918, (int) class442.aFloat4919, -1151432033), (int) class442.aFloat4919, bool_0_, aClass599_7205, 1605202751));
			if (null != class20) {
				aClass176_7204 = class176 = (Class176) class20.anObject205;
				if (bool_0_) {
					aClass527_Sub8_Sub8_7201 = (Class527_Sub8_Sub8) class20.anObject204;
					aBoolArray7203 = null;
					class555.method9267(aClass527_Sub8_Sub8_7201, aByte7187, (int) class442.aFloat4918, (int) class442.aFloat4919, null, 1923228734);
					aBool7191 = true;
				}
				anInt7198 = class176.method2896() * -2112660905;
				class176.method2893();
			} else {
				aBoolArray7203 = null;
				aClass527_Sub8_Sub8_7201 = null;
				aClass176_7204 = null;
				anInt7198 = 0;
			}
		} else
			class176 = aClass176_7204;
		anInt7197 = class602.anInt7873 * -2100519141;
		return class176;
	}

	public void method8884(int i, int i_2_, int i_3_) {
		aClass695_7195 = null;
		if (i_2_ > 0) {
			aClass695_7195 = new Class695_Sub3(aClass640_Sub1_7196, false);
			aClass695_7195.method14238(i, i_2_, 1, false, 2130944171);
		} else {
			aBool7186 = true;
			method8895(false, i, 1, 0, -827168916);
		}
	}

	int method8885(int i) {
		return 502542695 * anInt7198;
	}

	boolean method8886(int i) {
		return aBool7200;
	}

	int method8887(int i) {
		return -method8885(-91568081);
	}

	Class602 method8888(int i) {
		return (Class602) aClass24_Sub6_7188.method81(-1558032059 * anInt7189, -2139981081);
	}

	final Class176 method8889(Class180 class180, int i, boolean bool, boolean bool_4_, byte i_5_) {
		Class602 class602 = (Class602) aClass24_Sub6_7188.method81(-1558032059 * anInt7189, -168107137);
		if (class602.anIntArray7929 != null)
			class602 = class602.method9962(Class671.aClass97_8584, (4 == -1481292237 * client.anInt11080 ? (Interface18) (Class209.anInterface18_2245) : Class671.aClass97_8584), 1137928779);
		if (null == class602) {
			method8903(class180, (byte) 3);
			anInt7197 = -1016911849;
			return null;
		}
		if (!aBool7186 && anInt7197 * -938774439 != class602.anInt7873 * -320331677) {
			method8895(true, -1, 0, 0, -827168916);
			aBool7191 = false;
			aClass176_7204 = null;
		}
		method8892(aClass640_Sub1_7196, 1268080341);
		if (bool_4_)
			bool_4_ = bool_4_ & (aBool7200 & !aBool7191 & Class204.aClass527_Sub31_2213.aClass700_Sub1_10603.method16843(207953875) != 0);
		if (bool && !bool_4_) {
			anInt7197 = -2100519141 * class602.anInt7873;
			return null;
		}
		Class442 class442 = aClass640_Sub1_7196.method10637().aClass442_4927;
		Class555 class555 = client.aClass509_11072.method8314(1210499806);
		if (bool_4_) {
			class555.method9268(aClass527_Sub8_Sub8_7201, aByte7187, (int) class442.aFloat4918, (int) class442.aFloat4919, aBoolArray7203, (byte) 89);
			aBool7191 = false;
		}
		Class161 class161 = class555.aClass161Array7434[aByte7187];
		Class161 class161_6_;
		if (aBool7192)
			class161_6_ = class555.aClass161Array7457[0];
		else
			class161_6_ = (aByte7187 < 3 ? class555.aClass161Array7434[aByte7187 + 1] : null);
		Class176 class176 = null;
		if (aClass695_7194.method14162(-1376843558)) {
			if (bool_4_)
				i |= 0x40000;
			class176 = (class602.method9955(class180, i, (-2145189103 * anInt7193 != 11 ? anInt7193 * -2145189103 : 10), (11 == anInt7193 * -2145189103 ? anInt7202 * 525445103 + 4 : 525445103 * anInt7202), class161, class161_6_, (int) class442.aFloat4918, class161.method2593((int) class442.aFloat4918, (int) class442.aFloat4919, -1151432033), (int) class442.aFloat4919, aClass695_7194, aClass599_7205, (byte) 4));
			if (class176 != null) {
				if (bool_4_) {
					if (aBoolArray7203 == null)
						aBoolArray7203 = new boolean[4];
					aClass527_Sub8_Sub8_7201 = class176.method2891(aClass527_Sub8_Sub8_7201);
					class555.method9267(aClass527_Sub8_Sub8_7201, aByte7187, (int) class442.aFloat4918, (int) class442.aFloat4919, aBoolArray7203, 1778646801);
					aBool7191 = true;
				}
				anInt7198 = class176.method2896() * -2112660905;
				class176.method2893();
			} else {
				aBoolArray7203 = null;
				aClass527_Sub8_Sub8_7201 = null;
				anInt7198 = 0;
			}
			aClass176_7204 = null;
		} else if (null == aClass176_7204 || (aClass176_7204.method2874() & i) != i || (-938774439 * anInt7197 != class602.anInt7873 * -320331677)) {
			if (aClass176_7204 != null)
				i |= aClass176_7204.method2874();
			Class20 class20 = (class602.method9960(class180, i, (11 != anInt7193 * -2145189103 ? anInt7193 * -2145189103 : 10), (anInt7193 * -2145189103 == 11 ? 525445103 * anInt7202 + 4 : anInt7202 * 525445103), class161, class161_6_, (int) class442.aFloat4918, class161.method2593((int) class442.aFloat4918, (int) class442.aFloat4919, -1151432033), (int) class442.aFloat4919, bool_4_, aClass599_7205, 1605202751));
			if (null != class20) {
				aClass176_7204 = class176 = (Class176) class20.anObject205;
				if (bool_4_) {
					aClass527_Sub8_Sub8_7201 = (Class527_Sub8_Sub8) class20.anObject204;
					aBoolArray7203 = null;
					class555.method9267(aClass527_Sub8_Sub8_7201, aByte7187, (int) class442.aFloat4918, (int) class442.aFloat4919, null, 1495167520);
					aBool7191 = true;
				}
				anInt7198 = class176.method2896() * -2112660905;
				class176.method2893();
			} else {
				aBoolArray7203 = null;
				aClass527_Sub8_Sub8_7201 = null;
				aClass176_7204 = null;
				anInt7198 = 0;
			}
		} else
			class176 = aClass176_7204;
		anInt7197 = class602.anInt7873 * -2100519141;
		return class176;
	}

	final Class176 method8890(Class180 class180, int i, boolean bool, boolean bool_7_) {
		Class602 class602 = (Class602) aClass24_Sub6_7188.method81(-1558032059 * anInt7189, -222185122);
		if (class602.anIntArray7929 != null)
			class602 = class602.method9962(Class671.aClass97_8584, (4 == -1481292237 * client.anInt11080 ? (Interface18) (Class209.anInterface18_2245) : Class671.aClass97_8584), 1137928779);
		if (null == class602) {
			method8903(class180, (byte) 3);
			anInt7197 = -1016911849;
			return null;
		}
		if (!aBool7186 && anInt7197 * -938774439 != class602.anInt7873 * -320331677) {
			method8895(true, -1, 0, 0, -827168916);
			aBool7191 = false;
			aClass176_7204 = null;
		}
		method8892(aClass640_Sub1_7196, 1268080341);
		if (bool_7_)
			bool_7_ = bool_7_ & (aBool7200 & !aBool7191 & Class204.aClass527_Sub31_2213.aClass700_Sub1_10603.method16843(-1173014412) != 0);
		if (bool && !bool_7_) {
			anInt7197 = -2100519141 * class602.anInt7873;
			return null;
		}
		Class442 class442 = aClass640_Sub1_7196.method10637().aClass442_4927;
		Class555 class555 = client.aClass509_11072.method8314(-1490373558);
		if (bool_7_) {
			class555.method9268(aClass527_Sub8_Sub8_7201, aByte7187, (int) class442.aFloat4918, (int) class442.aFloat4919, aBoolArray7203, (byte) 59);
			aBool7191 = false;
		}
		Class161 class161 = class555.aClass161Array7434[aByte7187];
		Class161 class161_8_;
		if (aBool7192)
			class161_8_ = class555.aClass161Array7457[0];
		else
			class161_8_ = (aByte7187 < 3 ? class555.aClass161Array7434[aByte7187 + 1] : null);
		Class176 class176 = null;
		if (aClass695_7194.method14162(-1703646162)) {
			if (bool_7_)
				i |= 0x40000;
			class176 = (class602.method9955(class180, i, (-2145189103 * anInt7193 != 11 ? anInt7193 * -2145189103 : 10), (11 == anInt7193 * -2145189103 ? anInt7202 * 525445103 + 4 : 525445103 * anInt7202), class161, class161_8_, (int) class442.aFloat4918, class161.method2593((int) class442.aFloat4918, (int) class442.aFloat4919, -1151432033), (int) class442.aFloat4919, aClass695_7194, aClass599_7205, (byte) 35));
			if (class176 != null) {
				if (bool_7_) {
					if (aBoolArray7203 == null)
						aBoolArray7203 = new boolean[4];
					aClass527_Sub8_Sub8_7201 = class176.method2891(aClass527_Sub8_Sub8_7201);
					class555.method9267(aClass527_Sub8_Sub8_7201, aByte7187, (int) class442.aFloat4918, (int) class442.aFloat4919, aBoolArray7203, 1730632326);
					aBool7191 = true;
				}
				anInt7198 = class176.method2896() * -2112660905;
				class176.method2893();
			} else {
				aBoolArray7203 = null;
				aClass527_Sub8_Sub8_7201 = null;
				anInt7198 = 0;
			}
			aClass176_7204 = null;
		} else if (null == aClass176_7204 || (aClass176_7204.method2874() & i) != i || (-938774439 * anInt7197 != class602.anInt7873 * -320331677)) {
			if (aClass176_7204 != null)
				i |= aClass176_7204.method2874();
			Class20 class20 = (class602.method9960(class180, i, (11 != anInt7193 * -2145189103 ? anInt7193 * -2145189103 : 10), (anInt7193 * -2145189103 == 11 ? 525445103 * anInt7202 + 4 : anInt7202 * 525445103), class161, class161_8_, (int) class442.aFloat4918, class161.method2593((int) class442.aFloat4918, (int) class442.aFloat4919, -1151432033), (int) class442.aFloat4919, bool_7_, aClass599_7205, 1605202751));
			if (null != class20) {
				aClass176_7204 = class176 = (Class176) class20.anObject205;
				if (bool_7_) {
					aClass527_Sub8_Sub8_7201 = (Class527_Sub8_Sub8) class20.anObject204;
					aBoolArray7203 = null;
					class555.method9267(aClass527_Sub8_Sub8_7201, aByte7187, (int) class442.aFloat4918, (int) class442.aFloat4919, null, 1956490921);
					aBool7191 = true;
				}
				anInt7198 = class176.method2896() * -2112660905;
				class176.method2893();
			} else {
				aBoolArray7203 = null;
				aClass527_Sub8_Sub8_7201 = null;
				aClass176_7204 = null;
				anInt7198 = 0;
			}
		} else
			class176 = aClass176_7204;
		anInt7197 = class602.anInt7873 * -2100519141;
		return class176;
	}

	void method8891(Class180 class180, Class176 class176, Class432 class432, int i, int i_9_, int i_10_, int i_11_, boolean bool, int i_12_) {
		Class167[] class167s = class176.method2915();
		Class159[] class159s = class176.method2916();
		if ((null == aClass613_7190 || aClass613_7190.aBool8026) && (null != class167s || class159s != null)) {
			Class602 class602 = ((Class602) aClass24_Sub6_7188.method81(anInt7189 * -1558032059, 692156040));
			if (null != class602.anIntArray7929)
				class602 = (class602.method9962(Class671.aClass97_8584, (client.anInt11080 * -1481292237 == 4 ? (Interface18) Class209.anInterface18_2245 : Class671.aClass97_8584), 1137928779));
			if (class602 != null)
				aClass613_7190 = Class613.method10130(client.anInt11019, true);
		}
		if (null != aClass613_7190) {
			class176.method2870(class432);
			if (bool)
				aClass613_7190.method10133(class180, (long) client.anInt11019, class167s, class159s, false);
			else
				aClass613_7190.method10132((long) client.anInt11019);
			aClass613_7190.method10137(aByte7187, i, i_9_, i_10_, i_11_);
		}
	}

	void method8892(Class640_Sub1 class640_sub1, int i) {
		if (aClass695_7195 != null && aClass695_7195.method14162(-2001629330)) {
			aClass695_7195.method14187((client.anInt11019 - -184668607 * anInt7199), 942579915);
			if (aClass695_7195.method14177(992649116))
				aClass695_7195.method14165(-1, (byte) 44);
			if (!aClass695_7195.method14172(-1704344002)) {
				aClass695_7194 = aClass695_7195;
				aBool7186 = true;
				anInt7199 = client.anInt11019 * -407313983;
				return;
			}
		}
		if (aClass695_7194.method14162(-2076559903)) {
			if (aClass695_7194.method14187((client.anInt11019 - -184668607 * anInt7199), 929239758)) {
				if (Class204.aClass527_Sub31_2213.aClass700_Sub1_10603.method16843(938910466) == 2)
					aBool7191 = false;
				if (aClass695_7194.method14177(560404636)) {
					aClass695_7194.method14165(-1, (byte) 22);
					aBool7186 = false;
					method8895(false, -1, 0, 0, -827168916);
				}
			}
		} else
			method8895(false, -1, 0, 0, -827168916);
		anInt7199 = -407313983 * client.anInt11019;
	}

	void method8893(Class640_Sub1 class640_sub1) {
		if (aClass695_7195 != null && aClass695_7195.method14162(-695480011)) {
			aClass695_7195.method14187((client.anInt11019 - -184668607 * anInt7199), 990779468);
			if (aClass695_7195.method14177(818908957))
				aClass695_7195.method14165(-1, (byte) 28);
			if (!aClass695_7195.method14172(-1282497368)) {
				aClass695_7194 = aClass695_7195;
				aBool7186 = true;
				anInt7199 = client.anInt11019 * -407313983;
				return;
			}
		}
		if (aClass695_7194.method14162(-999979513)) {
			if (aClass695_7194.method14187((client.anInt11019 - -184668607 * anInt7199), -184484726)) {
				if (Class204.aClass527_Sub31_2213.aClass700_Sub1_10603.method16843(1249808943) == 2)
					aBool7191 = false;
				if (aClass695_7194.method14177(1243703531)) {
					aClass695_7194.method14165(-1, (byte) 32);
					aBool7186 = false;
					method8895(false, -1, 0, 0, -827168916);
				}
			}
		} else
			method8895(false, -1, 0, 0, -827168916);
		anInt7199 = -407313983 * client.anInt11019;
	}

	Class602 method8894() {
		return (Class602) aClass24_Sub6_7188.method81(-1558032059 * anInt7189, -1014542966);
	}

	void method8895(boolean bool, int i, int i_13_, int i_14_, int i_15_) {
		int i_16_ = i;
		boolean bool_17_ = false;
		if (-1 == i_16_) {
			Class602 class602 = ((Class602) aClass24_Sub6_7188.method81(anInt7189 * -1558032059, 1902733560));
			Class602 class602_18_ = class602;
			if (class602.anIntArray7929 != null)
				class602 = (class602.method9962(Class671.aClass97_8584, (4 == client.anInt11080 * -1481292237 ? (Interface18) Class209.anInterface18_2245 : Class671.aClass97_8584), 1137928779));
			if (null == class602)
				return;
			if (class602 == class602_18_)
				class602_18_ = null;
			if (class602.method9974(-1438278412)) {
				if (!class602.aBool7902 || Class204.aClass527_Sub31_2213.aClass700_Sub35_10588.method17265((byte) -46) == 1) {
					if (bool && aClass695_7194.method14162(-220413781) && class602.method9966(aClass695_7194.method14164(68884012), (byte) -46))
						return;
					if (-938774439 * anInt7197 != class602.anInt7873 * -320331677)
						bool_17_ = class602.aBool7919;
					i_16_ = class602.method9964((byte) 8);
					if (class602.method10001((byte) 101))
						i_13_ = 0;
					else
						i_13_ = 1;
				}
			} else if (class602_18_ != null && class602_18_.method9974(129598583) && (!class602_18_.aBool7902 || Class204.aClass527_Sub31_2213.aClass700_Sub35_10588.method17265((byte) -29) == 1)) {
				if (bool && aClass695_7194.method14162(-964476904) && class602_18_.method9966(aClass695_7194.method14164(-1326281856), (byte) -123))
					return;
				if (-938774439 * anInt7197 != class602.anInt7873 * -320331677)
					bool_17_ = class602_18_.aBool7919;
				i_16_ = class602_18_.method9964((byte) 8);
				if (class602_18_.method10001((byte) 42))
					i_13_ = 0;
				else
					i_13_ = 1;
			}
		}
		if (i_16_ == -1)
			aClass695_7194.method14192(-1, false, (short) 227);
		else {
			aClass695_7194.method14238(i_16_, i_14_, i_13_, bool_17_, 2092461383);
			anInt7199 = client.anInt11019 * -407313983;
			aBool7191 = false;
			aClass176_7204 = null;
		}
	}

	public void method8896(int i, int i_19_) {
		aClass695_7195 = null;
		if (i_19_ > 0) {
			aClass695_7195 = new Class695_Sub3(aClass640_Sub1_7196, false);
			aClass695_7195.method14238(i, i_19_, 1, false, 2108447229);
		} else {
			aBool7186 = true;
			method8895(false, i, 1, 0, -827168916);
		}
	}

	int method8897() {
		return 502542695 * anInt7198;
	}

	void method8898(Class599 class599) {
		aClass599_7205 = class599;
		aClass176_7204 = null;
	}

	void method8899(Class640_Sub1 class640_sub1) {
		if (aClass695_7195 != null && aClass695_7195.method14162(-587607655)) {
			aClass695_7195.method14187((client.anInt11019 - -184668607 * anInt7199), -1409131947);
			if (aClass695_7195.method14177(717276762))
				aClass695_7195.method14165(-1, (byte) 81);
			if (!aClass695_7195.method14172(-1767377747)) {
				aClass695_7194 = aClass695_7195;
				aBool7186 = true;
				anInt7199 = client.anInt11019 * -407313983;
				return;
			}
		}
		if (aClass695_7194.method14162(-829268115)) {
			if (aClass695_7194.method14187((client.anInt11019 - -184668607 * anInt7199), -1659976125)) {
				if (Class204.aClass527_Sub31_2213.aClass700_Sub1_10603.method16843(84132271) == 2)
					aBool7191 = false;
				if (aClass695_7194.method14177(337244892)) {
					aClass695_7194.method14165(-1, (byte) 110);
					aBool7186 = false;
					method8895(false, -1, 0, 0, -827168916);
				}
			}
		} else
			method8895(false, -1, 0, 0, -827168916);
		anInt7199 = -407313983 * client.anInt11019;
	}

	Class531(Class180 class180, Class24_Sub6 class24_sub6, Class602 class602, int i, int i_20_, int i_21_, Class640_Sub1 class640_sub1, boolean bool, int i_22_, int i_23_) {
		aBool7186 = false;
		aBool7191 = false;
		aClass24_Sub6_7188 = class24_sub6;
		anInt7189 = -93978233 * class602.anInt7873;
		anInt7193 = -1992405519 * i;
		anInt7202 = 1958373135 * i_20_;
		aClass640_Sub1_7196 = class640_sub1;
		aBool7186 = -1 != i_22_;
		aByte7187 = (byte) i_21_;
		aBool7192 = bool;
		aBool7200 = class180.method3381() && class602.aBool7940 && !aBool7192;
		aClass695_7194 = new Class695_Sub3(class640_sub1, false);
		method8895(false, i_22_, 1, aBool7186 ? i_23_ : 0, -827168916);
	}

	Class602 method8900() {
		return (Class602) aClass24_Sub6_7188.method81(-1558032059 * anInt7189, -981423097);
	}

	void method8901(Class599 class599, byte i) {
		aClass599_7205 = class599;
		aClass176_7204 = null;
	}

	void method8902(Class180 class180, int i) {
		method8889(class180, 262144, true, true, (byte) 1);
	}

	void method8903(Class180 class180, byte i) {
		if (aClass527_Sub8_Sub8_7201 != null) {
			Class442 class442 = aClass640_Sub1_7196.method10637().aClass442_4927;
			client.aClass509_11072.method8314(912297501).method9268(aClass527_Sub8_Sub8_7201, aByte7187, (int) class442.aFloat4918, (int) class442.aFloat4919, aBoolArray7203, (byte) 105);
			aBoolArray7203 = null;
			aClass527_Sub8_Sub8_7201 = null;
		}
	}

	final Class176 method8904(Class180 class180, int i, boolean bool, boolean bool_24_) {
		Class602 class602 = (Class602) aClass24_Sub6_7188.method81(-1558032059 * anInt7189, -1819430828);
		if (class602.anIntArray7929 != null)
			class602 = class602.method9962(Class671.aClass97_8584, (4 == -1481292237 * client.anInt11080 ? (Interface18) (Class209.anInterface18_2245) : Class671.aClass97_8584), 1137928779);
		if (null == class602) {
			method8903(class180, (byte) 3);
			anInt7197 = -1016911849;
			return null;
		}
		if (!aBool7186 && anInt7197 * -938774439 != class602.anInt7873 * -320331677) {
			method8895(true, -1, 0, 0, -827168916);
			aBool7191 = false;
			aClass176_7204 = null;
		}
		method8892(aClass640_Sub1_7196, 1268080341);
		if (bool_24_)
			bool_24_ = bool_24_ & (aBool7200 & !aBool7191 & Class204.aClass527_Sub31_2213.aClass700_Sub1_10603.method16843(987524106) != 0);
		if (bool && !bool_24_) {
			anInt7197 = -2100519141 * class602.anInt7873;
			return null;
		}
		Class442 class442 = aClass640_Sub1_7196.method10637().aClass442_4927;
		Class555 class555 = client.aClass509_11072.method8314(-596135203);
		if (bool_24_) {
			class555.method9268(aClass527_Sub8_Sub8_7201, aByte7187, (int) class442.aFloat4918, (int) class442.aFloat4919, aBoolArray7203, (byte) 7);
			aBool7191 = false;
		}
		Class161 class161 = class555.aClass161Array7434[aByte7187];
		Class161 class161_25_;
		if (aBool7192)
			class161_25_ = class555.aClass161Array7457[0];
		else
			class161_25_ = (aByte7187 < 3 ? class555.aClass161Array7434[aByte7187 + 1] : null);
		Class176 class176 = null;
		if (aClass695_7194.method14162(-1459006810)) {
			if (bool_24_)
				i |= 0x40000;
			class176 = (class602.method9955(class180, i, (-2145189103 * anInt7193 != 11 ? anInt7193 * -2145189103 : 10), (11 == anInt7193 * -2145189103 ? anInt7202 * 525445103 + 4 : 525445103 * anInt7202), class161, class161_25_, (int) class442.aFloat4918, class161.method2593((int) class442.aFloat4918, (int) class442.aFloat4919, -1151432033), (int) class442.aFloat4919, aClass695_7194, aClass599_7205, (byte) 63));
			if (class176 != null) {
				if (bool_24_) {
					if (aBoolArray7203 == null)
						aBoolArray7203 = new boolean[4];
					aClass527_Sub8_Sub8_7201 = class176.method2891(aClass527_Sub8_Sub8_7201);
					class555.method9267(aClass527_Sub8_Sub8_7201, aByte7187, (int) class442.aFloat4918, (int) class442.aFloat4919, aBoolArray7203, 2014772999);
					aBool7191 = true;
				}
				anInt7198 = class176.method2896() * -2112660905;
				class176.method2893();
			} else {
				aBoolArray7203 = null;
				aClass527_Sub8_Sub8_7201 = null;
				anInt7198 = 0;
			}
			aClass176_7204 = null;
		} else if (null == aClass176_7204 || (aClass176_7204.method2874() & i) != i || (-938774439 * anInt7197 != class602.anInt7873 * -320331677)) {
			if (aClass176_7204 != null)
				i |= aClass176_7204.method2874();
			Class20 class20 = (class602.method9960(class180, i, (11 != anInt7193 * -2145189103 ? anInt7193 * -2145189103 : 10), (anInt7193 * -2145189103 == 11 ? 525445103 * anInt7202 + 4 : anInt7202 * 525445103), class161, class161_25_, (int) class442.aFloat4918, class161.method2593((int) class442.aFloat4918, (int) class442.aFloat4919, -1151432033), (int) class442.aFloat4919, bool_24_, aClass599_7205, 1605202751));
			if (null != class20) {
				aClass176_7204 = class176 = (Class176) class20.anObject205;
				if (bool_24_) {
					aClass527_Sub8_Sub8_7201 = (Class527_Sub8_Sub8) class20.anObject204;
					aBoolArray7203 = null;
					class555.method9267(aClass527_Sub8_Sub8_7201, aByte7187, (int) class442.aFloat4918, (int) class442.aFloat4919, null, 2137760402);
					aBool7191 = true;
				}
				anInt7198 = class176.method2896() * -2112660905;
				class176.method2893();
			} else {
				aBoolArray7203 = null;
				aClass527_Sub8_Sub8_7201 = null;
				aClass176_7204 = null;
				anInt7198 = 0;
			}
		} else
			class176 = aClass176_7204;
		anInt7197 = class602.anInt7873 * -2100519141;
		return class176;
	}

	boolean method8905() {
		return aBool7200;
	}

	boolean method8906() {
		return aBool7200;
	}

	void method8907(Class180 class180) {
		method8889(class180, 262144, true, true, (byte) 1);
	}

	Class602 method8908() {
		return (Class602) aClass24_Sub6_7188.method81(-1558032059 * anInt7189, -752004154);
	}

	void method8909(Class640_Sub1 class640_sub1) {
		if (aClass695_7195 != null && aClass695_7195.method14162(-456101783)) {
			aClass695_7195.method14187((client.anInt11019 - -184668607 * anInt7199), 31200491);
			if (aClass695_7195.method14177(194504212))
				aClass695_7195.method14165(-1, (byte) 85);
			if (!aClass695_7195.method14172(1190366595)) {
				aClass695_7194 = aClass695_7195;
				aBool7186 = true;
				anInt7199 = client.anInt11019 * -407313983;
				return;
			}
		}
		if (aClass695_7194.method14162(-1330332151)) {
			if (aClass695_7194.method14187((client.anInt11019 - -184668607 * anInt7199), 726759986)) {
				if (Class204.aClass527_Sub31_2213.aClass700_Sub1_10603.method16843(939272965) == 2)
					aBool7191 = false;
				if (aClass695_7194.method14177(2069748451)) {
					aClass695_7194.method14165(-1, (byte) 125);
					aBool7186 = false;
					method8895(false, -1, 0, 0, -827168916);
				}
			}
		} else
			method8895(false, -1, 0, 0, -827168916);
		anInt7199 = -407313983 * client.anInt11019;
	}

	final Class176 method8910(Class180 class180, int i, boolean bool, boolean bool_26_) {
		Class602 class602 = (Class602) aClass24_Sub6_7188.method81(-1558032059 * anInt7189, -1282982408);
		if (class602.anIntArray7929 != null)
			class602 = class602.method9962(Class671.aClass97_8584, (4 == -1481292237 * client.anInt11080 ? (Interface18) (Class209.anInterface18_2245) : Class671.aClass97_8584), 1137928779);
		if (null == class602) {
			method8903(class180, (byte) 3);
			anInt7197 = -1016911849;
			return null;
		}
		if (!aBool7186 && anInt7197 * -938774439 != class602.anInt7873 * -320331677) {
			method8895(true, -1, 0, 0, -827168916);
			aBool7191 = false;
			aClass176_7204 = null;
		}
		method8892(aClass640_Sub1_7196, 1268080341);
		if (bool_26_)
			bool_26_ = bool_26_ & (aBool7200 & !aBool7191 & Class204.aClass527_Sub31_2213.aClass700_Sub1_10603.method16843(-1076224043) != 0);
		if (bool && !bool_26_) {
			anInt7197 = -2100519141 * class602.anInt7873;
			return null;
		}
		Class442 class442 = aClass640_Sub1_7196.method10637().aClass442_4927;
		Class555 class555 = client.aClass509_11072.method8314(1198490678);
		if (bool_26_) {
			class555.method9268(aClass527_Sub8_Sub8_7201, aByte7187, (int) class442.aFloat4918, (int) class442.aFloat4919, aBoolArray7203, (byte) 76);
			aBool7191 = false;
		}
		Class161 class161 = class555.aClass161Array7434[aByte7187];
		Class161 class161_27_;
		if (aBool7192)
			class161_27_ = class555.aClass161Array7457[0];
		else
			class161_27_ = (aByte7187 < 3 ? class555.aClass161Array7434[aByte7187 + 1] : null);
		Class176 class176 = null;
		if (aClass695_7194.method14162(-243126466)) {
			if (bool_26_)
				i |= 0x40000;
			class176 = (class602.method9955(class180, i, (-2145189103 * anInt7193 != 11 ? anInt7193 * -2145189103 : 10), (11 == anInt7193 * -2145189103 ? anInt7202 * 525445103 + 4 : 525445103 * anInt7202), class161, class161_27_, (int) class442.aFloat4918, class161.method2593((int) class442.aFloat4918, (int) class442.aFloat4919, -1151432033), (int) class442.aFloat4919, aClass695_7194, aClass599_7205, (byte) -64));
			if (class176 != null) {
				if (bool_26_) {
					if (aBoolArray7203 == null)
						aBoolArray7203 = new boolean[4];
					aClass527_Sub8_Sub8_7201 = class176.method2891(aClass527_Sub8_Sub8_7201);
					class555.method9267(aClass527_Sub8_Sub8_7201, aByte7187, (int) class442.aFloat4918, (int) class442.aFloat4919, aBoolArray7203, 1549928523);
					aBool7191 = true;
				}
				anInt7198 = class176.method2896() * -2112660905;
				class176.method2893();
			} else {
				aBoolArray7203 = null;
				aClass527_Sub8_Sub8_7201 = null;
				anInt7198 = 0;
			}
			aClass176_7204 = null;
		} else if (null == aClass176_7204 || (aClass176_7204.method2874() & i) != i || (-938774439 * anInt7197 != class602.anInt7873 * -320331677)) {
			if (aClass176_7204 != null)
				i |= aClass176_7204.method2874();
			Class20 class20 = (class602.method9960(class180, i, (11 != anInt7193 * -2145189103 ? anInt7193 * -2145189103 : 10), (anInt7193 * -2145189103 == 11 ? 525445103 * anInt7202 + 4 : anInt7202 * 525445103), class161, class161_27_, (int) class442.aFloat4918, class161.method2593((int) class442.aFloat4918, (int) class442.aFloat4919, -1151432033), (int) class442.aFloat4919, bool_26_, aClass599_7205, 1605202751));
			if (null != class20) {
				aClass176_7204 = class176 = (Class176) class20.anObject205;
				if (bool_26_) {
					aClass527_Sub8_Sub8_7201 = (Class527_Sub8_Sub8) class20.anObject204;
					aBoolArray7203 = null;
					class555.method9267(aClass527_Sub8_Sub8_7201, aByte7187, (int) class442.aFloat4918, (int) class442.aFloat4919, null, 1880599776);
					aBool7191 = true;
				}
				anInt7198 = class176.method2896() * -2112660905;
				class176.method2893();
			} else {
				aBoolArray7203 = null;
				aClass527_Sub8_Sub8_7201 = null;
				aClass176_7204 = null;
				anInt7198 = 0;
			}
		} else
			class176 = aClass176_7204;
		anInt7197 = class602.anInt7873 * -2100519141;
		return class176;
	}

	void method8911(Class640_Sub1 class640_sub1) {
		if (aClass695_7195 != null && aClass695_7195.method14162(225951603)) {
			aClass695_7195.method14187((client.anInt11019 - -184668607 * anInt7199), -619806371);
			if (aClass695_7195.method14177(831934063))
				aClass695_7195.method14165(-1, (byte) 123);
			if (!aClass695_7195.method14172(-1033213278)) {
				aClass695_7194 = aClass695_7195;
				aBool7186 = true;
				anInt7199 = client.anInt11019 * -407313983;
				return;
			}
		}
		if (aClass695_7194.method14162(-868398414)) {
			if (aClass695_7194.method14187((client.anInt11019 - -184668607 * anInt7199), -86443155)) {
				if (Class204.aClass527_Sub31_2213.aClass700_Sub1_10603.method16843(-1589535167) == 2)
					aBool7191 = false;
				if (aClass695_7194.method14177(1991245711)) {
					aClass695_7194.method14165(-1, (byte) 67);
					aBool7186 = false;
					method8895(false, -1, 0, 0, -827168916);
				}
			}
		} else
			method8895(false, -1, 0, 0, -827168916);
		anInt7199 = -407313983 * client.anInt11019;
	}

	void method8912(Class180 class180) {
		method8889(class180, 262144, true, true, (byte) 1);
	}

	void method8913(boolean bool, int i, int i_28_, int i_29_) {
		int i_30_ = i;
		boolean bool_31_ = false;
		if (-1 == i_30_) {
			Class602 class602 = ((Class602) aClass24_Sub6_7188.method81(anInt7189 * -1558032059, 74191552));
			Class602 class602_32_ = class602;
			if (class602.anIntArray7929 != null)
				class602 = (class602.method9962(Class671.aClass97_8584, (4 == client.anInt11080 * -1481292237 ? (Interface18) Class209.anInterface18_2245 : Class671.aClass97_8584), 1137928779));
			if (null == class602)
				return;
			if (class602 == class602_32_)
				class602_32_ = null;
			if (class602.method9974(-899663356)) {
				if (!class602.aBool7902 || Class204.aClass527_Sub31_2213.aClass700_Sub35_10588.method17265((byte) -20) == 1) {
					if (bool && aClass695_7194.method14162(-746058612) && class602.method9966(aClass695_7194.method14164(-806934331), (byte) 2))
						return;
					if (-938774439 * anInt7197 != class602.anInt7873 * -320331677)
						bool_31_ = class602.aBool7919;
					i_30_ = class602.method9964((byte) 8);
					if (class602.method10001((byte) 19))
						i_28_ = 0;
					else
						i_28_ = 1;
				}
			} else if (class602_32_ != null && class602_32_.method9974(-995185699) && (!class602_32_.aBool7902 || Class204.aClass527_Sub31_2213.aClass700_Sub35_10588.method17265((byte) -44) == 1)) {
				if (bool && aClass695_7194.method14162(-882221710) && class602_32_.method9966(aClass695_7194.method14164(43838571), (byte) -57))
					return;
				if (-938774439 * anInt7197 != class602.anInt7873 * -320331677)
					bool_31_ = class602_32_.aBool7919;
				i_30_ = class602_32_.method9964((byte) 8);
				if (class602_32_.method10001((byte) 117))
					i_28_ = 0;
				else
					i_28_ = 1;
			}
		}
		if (i_30_ == -1)
			aClass695_7194.method14192(-1, false, (short) 227);
		else {
			aClass695_7194.method14238(i_30_, i_29_, i_28_, bool_31_, 2081703652);
			anInt7199 = client.anInt11019 * -407313983;
			aBool7191 = false;
			aClass176_7204 = null;
		}
	}

	static void method8914(byte i) {
		Class24_Sub9.aClass174_10977 = null;
		Class85.aClass174_819 = null;
		Class29.aClass174_262 = null;
		Class631.aClass147Array8257 = null;
		Class650.aClass147Array8373 = null;
		Class238.aClass147Array2388 = null;
		Class294.aClass147Array3272 = null;
		Class49.aClass147Array507 = null;
		Class191.aClass147Array2138 = null;
		Class178.aClass147_2056 = null;
		Class452.aClass147_4962 = null;
		Class499.aClass147Array5592 = null;
	}

	static void method8915(Class665 class665, int i) {
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class277.method5152(string, -1154232192);
	}

	static final void method8916(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = class243.anInt2525 * 1620847621;
	}

	static final void method8917(Class665 class665, byte i) {
		class665.anInt8528 -= 866019034;
		String string = ((String) class665.anObjectArray8541[class665.anInt8528 * 318492261]);
		String string_33_ = ((String) class665.anObjectArray8541[class665.anInt8528 * 318492261 + 1]);
		class665.anInt8526 -= 204761682;
		int i_34_ = class665.anIntArray8525[1769813785 * class665.anInt8526];
		int i_35_ = class665.anIntArray8525[1 + 1769813785 * class665.anInt8526];
		if (string_33_ == null)
			string_33_ = "";
		if (string_33_.length() > 80)
			string_33_ = string_33_.substring(0, 80);
		Class109 class109 = Class203.method3782((byte) -1);
		Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4387, class109.aClass2_1367, (byte) -74);
		class527_sub15.buffer.writeByte((Class208_Sub18.method15632(string, (byte) -67) + 2 + Class208_Sub18.method15632(string_33_, (byte) -18)), 28749269);
		class527_sub15.buffer.writeString(string, -1155926991);
		class527_sub15.buffer.writeByte(i_34_ - 1, 1546834640);
		class527_sub15.buffer.writeByte(i_35_, 275067667);
		class527_sub15.buffer.writeString(string_33_, -425208492);
		class109.method1969(class527_sub15, (byte) 1);
	}

	static final void method8918(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = 0;
	}

	static void method8919(int i, int i_36_) {
		synchronized (Class55.aClass205_709) {
			Class55.aClass205_709.method3792(i, (byte) 55);
		}
	}

	static final void method8920(Class501 class501, Class665 class665, int i) throws Exception_Sub6, Exception_Sub7 {
		switch (165927437 * class501.anInt6590) {
		case 85:
			Class542.method9028(class665, 1618439937);
			break;
		case 1106:
			Class657.method11008(class665, 387165614);
			break;
		case 1262:
			Class231.method4323(class665, -1729708321);
			break;
		case 37:
			Class473.method7752(class665, (byte) 83);
			break;
		case 1116:
			Class707.method14365(class665, 1718629511);
			break;
		case 1175:
			Class110.method2013(class665, -925172810);
			break;
		case 796:
			Class300.method5563(class665, -1067477665);
			break;
		case 153:
			Class187.method3657(class665, 989856800);
			break;
		case 901:
			Class580.method9663(class665, (byte) 48);
			break;
		case 1137:
			Class389_Sub3.method15924(class665, 1838891481);
			break;
		case 228:
			Class275.method5142(class665, (byte) 5);
			break;
		case 1128:
			Class597.method9913(class665, -330094714);
			break;
		case 539:
			Class700_Sub36.method17275(class665, 2053940469);
			break;
		case 460:
			Class518.method8633(class665, (short) 14487);
			break;
		case 130:
			Class469.method7699(class665, 1556227985);
			break;
		case 948:
			Class223.method4177(class665, 1044799533);
			break;
		case 217:
			Class577.method9644(class665, -263977002);
			break;
		case 1197:
			Class583.method9676(class665, -1424633937);
			break;
		case 887:
			Class586.method9779(class665, -1744942567);
			break;
		case 117:
			Class206.method3840(class665, -2130575347);
			break;
		case 124:
			Class307.method5615(class665, 103405239);
			break;
		case 278:
			Class393.method6489(class665, -761557681);
			break;
		case 589:
			Class684.method13927(class665, (byte) 13);
			break;
		case 787:
			Class660.method11019(class665, (byte) 0);
			break;
		case 62:
			Class306.method5608(class665, -1246349372);
			break;
		case 794:
			Class521.method8680(class665, 1958091720);
			break;
		case 1030:
			Class183.method3561(class665, (byte) -58);
			break;
		case 1075:
			Class625.method10349(class665, (byte) 4);
			break;
		case 713:
			Class229.method4318(class665, 1316740739);
			break;
		case 852:
			Class384.method6419(class665, (short) 800);
			break;
		case 245:
			Class273.method5123(class665, 1415731703);
			break;
		case 161:
			Class626.method10385(class665, (byte) -60);
			break;
		case 96:
			Class265.method5036(class665, (byte) 118);
			break;
		case 152:
			Class395.method6506(class665, (byte) -10);
			break;
		case 104:
			Class665.method11056(class665, 16711680);
			break;
		case 287:
			Class39.method1158(class665, -1826488655);
			break;
		case 440:
			Class211.method3880(class665, 1769813785);
			break;
		case 978:
			Class52.method1287(class665, (short) -23966);
			break;
		case 600:
			Class460.method7575(class665, -466660464);
			break;
		case 23:
			Class183.method3562(class665, (byte) 31);
			break;
		case 960:
			Class669.method13761(class665, (byte) 0);
			break;
		case 469:
			Class641.method10701(class665, -1654862948);
			break;
		case 202:
			Class65.method1460(class665, (byte) 53);
			break;
		case 1148:
			Class295.method5340(class665, -1237339530);
			break;
		case 354:
			Class697.method14268(class665, -408934069);
			break;
		case 188:
			Class449.method7281(class665, 1630738669);
			break;
		case 101:
			Class646_Sub1.method16934(class665, 179207284);
			break;
		case 333:
			Class476.method7772(class665, 1523885700);
			break;
		case 1011:
			Class303.method5583(class665, 2059778504);
			break;
		case 946:
			Class394.method6499(class665, 1674082465);
			break;
		case 1098:
			Class563_Sub1.method16312(class665, -1367000986);
			break;
		case 914:
			Class572.method9607(class665, (byte) -85);
			break;
		case 562:
			Class471.method7728(class665, -1666989188);
			break;
		case 387:
			Class569.method9575(class665, (byte) 68);
			break;
		case 572:
			Class290.method5251(class665, (byte) 42);
			break;
		case 888:
			Class588.method9815(class665, -1029703917);
			break;
		case 499:
			Class389.method6462(class665, -2000260033);
			break;
		case 1260:
			Class652.method10892(class665, (byte) 55);
			break;
		case 618:
			Class576.method9634(class665, -204200041);
			break;
		default:
			throw new RuntimeException();
		case 1044:
			Class464.method7630(class665, (short) -18605);
			break;
		case 173:
			Class335.method5880(class665, -2019979840);
			break;
		case 1034:
			Class443.method7241(class665, 2096124805);
			break;
		case 51:
			Class39.method1159(class665, 2044276200);
			break;
		case 1167:
			Class208_Sub15.method15625(class665, 1268643156);
			break;
		case 187:
			Class76.method1537(class665, (byte) 21);
			break;
		case 397:
			Class676.method13878(class665, -2097642140);
			break;
		case 486:
			Class589.method9849(class665, (byte) 0);
			break;
		case 1045:
			Class472.method7736(class665, 1840104993);
			break;
		case 1270:
			Class700_Sub31.method17225(class665, (byte) -111);
			break;
		case 615:
			Class322.method5721(class665, -1221205461);
			break;
		case 1103:
			Class578.method9649(class665, 274769316);
			break;
		case 242:
			Class578.method9648(class665, 242324355);
			break;
		case 22:
			Class161.method2639(class665, -1394799333);
			break;
		case 1254:
			Class332.method5836(class665, 1548767021);
			break;
		case 1168:
			Class477.method7781(class665, 1530021503);
			break;
		case 158:
			Class672.method13826(class665, 1648754344);
			break;
		case 374:
			Class604.method10041(class665, -237927050);
			break;
		case 885:
			Class587.method9802(class665, 151691184);
			break;
		case 705:
			Class92.method1651(class665, (byte) 43);
			break;
		case 97:
			Class171_Sub2.method15334(class665, 1518444644);
			break;
		case 1205:
			Class469.method7695(class665, -724003681);
			break;
		case 1093:
			Class321.method5700(class665, -1546059128);
			break;
		case 129:
			Class63.method1441(class665, (byte) -126);
			break;
		case 702:
			Class548.method9092(class665, -1215634852);
			break;
		case 76:
			Class654.method10914(class665, true, -187845324);
			break;
		case 20:
			Class101.method1789(class665, (short) -19996);
			break;
		case 1188:
			Class429.method6867(class665, (byte) -68);
			break;
		case 352:
			Class530.method8878(class665, (byte) 6);
			break;
		case 462:
			Class47.method1240(class665, 1715240970);
			break;
		case 1018:
			Class56.method1328(class665, -1011669644);
			break;
		case 1036:
			Class387.method6440(class665, (byte) -27);
			break;
		case 840:
			Class187.method3662(class665, -2024827913);
			break;
		case 1146:
			Class399.method6524(class665, -1426991971);
			break;
		case 1057:
			Class160.method2583(class665, (byte) -1);
			break;
		case 299:
			Class179.method3073(class665, (byte) 94);
			break;
		case 1134:
			Class461.method7595(class665, -1784748261);
			break;
		case 58:
			Class382.method6402(class665, 801415164);
			break;
		case 838:
			Class288.method5218(class665, 717926784);
			break;
		case 523:
			Class163.method2651(class665, (byte) -9);
			break;
		case 1015:
			Class588.method9811(class665, -16777216);
			break;
		case 298:
			Class156.method2557(class665, -1441559202);
			break;
		case 1208:
			Class70.method1487(class665, -845216278);
			break;
		case 989:
			Class456.method7426(class665, (byte) -33);
			break;
		case 3:
			Class303.method5585(class665, (byte) -43);
			break;
		case 846:
			Class685.method13949(class665, (byte) 0);
			break;
		case 475:
			Class471.method7730(class665, 1795560332);
			break;
		case 1211:
			Class172.method2738(class665, 2122687351);
			break;
		case 904:
			Class222.method4153(class665, (byte) -109);
			break;
		case 472:
			Class413.method6625(class665, 162317215);
			break;
		case 1142:
			Class358.method6303(class665, 1695479376);
			break;
		case 1114:
			Class677.method13890(class665, -495618007);
			break;
		case 1174:
			Class497.method8160(class665, (byte) 50);
			break;
		case 867:
			Class108.method1937(class665, 2049482785);
			break;
		case 735:
			Class76.method1538(class665, -560932697);
			break;
		case 726:
			Class191.method3688(class665, (byte) -17);
			break;
		case 1258:
			Class398.method6520(class665, 2103989088);
			break;
		case 306:
			Class518.method8634(class665, (byte) 2);
			break;
		case 659:
			Class277.method5153(class665, (byte) -1);
			break;
		case 1230:
			Class328.method5805(class665, 1745023227);
			break;
		case 54:
			Class388.method6458(class665, (byte) -59);
			break;
		case 822:
			Class491.method7982(class665, (byte) 0);
			break;
		case 1053:
			Class594.method9884(class665, (byte) -6);
			break;
		case 39:
			Class315.method5671(class665, (byte) 45);
			break;
		case 330:
			Class394.method6502(class665, -2037899083);
			break;
		case 936:
			Class628.method10411(class665, -680071490);
			break;
		case 106:
			Class596.method9906(class665, -329554489);
			break;
		case 996:
			Class308.method5620(class665, 2123654447);
			break;
		case 311:
			Class646_Sub1.method16932(class665, -1314588270);
			break;
		case 569:
			Class308.method5621(class665, (byte) 0);
			break;
		case 343:
			Class709.method14395(class665, (byte) -36);
			break;
		case 1038:
			Class648.method10833(class665, -961966609);
			break;
		case 404:
			Class512.method8490(class665, 890691924);
			break;
		case 541:
			Class195.method3708(class665, (short) -17341);
			break;
		case 246:
			Class522.method8684(class665, 155404419);
			break;
		case 477:
			Class265.method5038(class665, (byte) 0);
			break;
		case 693:
			Class601.method9953(class665, (byte) -52);
			break;
		case 647:
			Class482.method7841(class665, -321268128);
			break;
		case 591:
			Class620.method10224(class665, (byte) -93);
			break;
		case 1153:
			Class702.method14299(class665, (byte) 64);
			break;
		case 850:
			Class208.method3857(class665, -253662638);
			break;
		case 181:
			Class497.method8159(class665, (byte) -45);
			break;
		case 1047:
			Class64.method1451(class665, -845439466);
			break;
		case 820:
			Class527_Sub30.method16291(class665, -708428354);
			break;
		case 128:
			Class420.method6710(class665, 867358471);
			break;
		case 510:
			Class5.method566(class665, 405842647);
			break;
		case 155:
			Class546.method9058(class665, -1618580559);
			break;
		case 1241:
			Class628.method10412(class665, -865759556);
			break;
		case 637:
			Class624.method10332(class665, -61365330);
			break;
		case 452:
			Class88.method1630(class665, 1209841257);
			break;
		case 292:
			Class237.method4368(class665, -1259997579);
			break;
		case 122:
			Class203.method3778(class665, 1620978668);
			break;
		case 1214:
			Class683.method13912(class665, 1014121049);
			break;
		case 540:
			Class461.method7600(class665, 2011717621);
			break;
		case 642:
			Class214.method3899(class665, true, 120490847);
			break;
		case 133:
			Class269.method5054(class665, -2007205204);
			break;
		case 113:
			Class563.method9481(class665, (byte) 0);
			break;
		case 806:
			Class43.method1183(class665, 1412920485);
			break;
		case 1251:
			Class645.method10745(class665, 2030738681);
			break;
		case 695:
			Class448.method7276(class665, -2025935055);
			break;
		case 386:
			Class328.method5806(class665, -1829365293);
			break;
		case 322:
			Class320.method5692(class665, (byte) 0);
			break;
		case 762:
			Class598.method9917(class665, (byte) 40);
			break;
		case 896:
			Class95.method1731(class665, -555158490);
			break;
		case 981:
			Class32.method940(class665, -817478185);
			break;
		case 1234:
			Class70.method1486(class665, (byte) -121);
			break;
		case 431:
			Class238.method4375(class665, -1766011945);
			break;
		case 1117:
			Class492.method7992(class665, -2093596000);
			break;
		case 570:
			Class50.method1273(class665, -1379970769);
			break;
		case 1017:
			Class655.method10968(class665, -931539994);
			break;
		case 415:
			OutputStream_Sub1.method17427(class665, (byte) -66);
			break;
		case 262:
			Class551.method9132(class665, (byte) 8);
			break;
		case 463:
			Class444.method7244(class665, (byte) -50);
			break;
		case 664:
			Class109.method1981(class665, -1577013515);
			break;
		case 892:
			Class700_Sub11.method16952(class665, 1173908660);
			break;
		case 773:
			Class652.method10894(class665, -1978395671);
			break;
		case 776:
			Class622.method10232(class665, -1518414234);
			break;
		case 420:
			Class626.method10384(class665, (byte) 78);
			break;
		case 697:
			Class558.method9442(class665, (byte) 1);
			break;
		case 1180:
			Class258.method4742(class665, 1735419965);
			break;
		case 416:
			Class260.method4793(class665, (byte) 114);
			break;
		case 392:
			Class208.method3856(class665, -2029170507);
			break;
		case 1072:
			Class637.method10569(class665, 1089423154);
			break;
		case 1162:
			Class472.method7737(class665, -799593138);
			break;
		case 112:
			Class492.method7993(class665, 626504836);
			break;
		case 605:
			Class592.method9873(class665, 681928370);
			break;
		case 215:
			Class324.method5725(class665, (byte) 102);
			break;
		case 464:
			Class284.method5203(class665, -1763945644);
			break;
		case 157:
			Class647.method10820(class665, (byte) -15);
			break;
		case 295:
			Class467.method7666(class665, -2009399639);
			break;
		case 91:
			Class636.method10563(class665, -998252336);
			break;
		case 451:
			Class574.method9627(class665, 838188747);
			break;
		case 581:
			Class189.method3669(class665, (byte) 1);
			break;
		case 576:
			Class477.method7784(class665, 2136713612);
			break;
		case 177:
			Class631.method10467(class665, -521722391);
			break;
		case 385:
			Class63.method1442(class665, (byte) 39);
			break;
		case 739:
			Class595.method9889(class665, -1803177598);
			break;
		case 610:
			Class433.method6963(class665, -1473128965);
			break;
		case 75:
			Class510.method8445(class665, -1623597074);
			break;
		case 1184:
			Class220.method4070(class665, (byte) -98);
			break;
		case 750:
			Class625.method10350(class665, 256769829);
			break;
		case 1077:
			Class398.method6519(class665, (byte) -1);
			break;
		case 175:
			Class192.method3690(class665, 648157451);
			break;
		case 1195:
			Class263.method4964(class665, -2040233159);
			break;
		case 993:
			Class507.method8254(class665, -1976854795);
			break;
		case 853:
			Class101.method1788(class665, (byte) 25);
			break;
		case 1054:
			Class314.method5668(class665, (byte) -84);
			break;
		case 198:
			Class628.method10410(class665, (byte) -10);
			break;
		case 268:
			Class637.method10568(class665, 471541028);
			break;
		case 1089:
			Class624.method10331(class665, 258594195);
			break;
		case 383:
			Class478.method7787(class665, (byte) -14);
			break;
		case 1081:
			Class525.method8724(class665, 475651289);
			break;
		case 1182:
			Class648.method10834(class665, 1640288637);
			break;
		case 211:
			Class18.method745(class665, 286470021);
			break;
		case 375:
			Class219.method4064(class665, -1544146335);
			break;
		case 1160:
			Class700_Sub23.method17136(class665, (byte) 21);
			break;
		case 700:
			Class180.method3539(class665, (byte) -50);
			break;
		case 425:
			Class696_Sub5.method17402(class665, 925442806);
			break;
		case 1252:
			Class619.method10216(class665, (byte) 1);
			break;
		case 389:
			Class527_Sub18.method16200(class665, (byte) 1);
			break;
		case 716:
			Class605.method10050(class665, -1648071647);
			break;
		case 1094:
			OutgoingPacket.method6632(class665, -1645597787);
			break;
		case 879:
			Class350_Sub1_Sub1.method17992(class665, (byte) 1);
			break;
		case 710:
			Class493.method7998(class665, (byte) 1);
			break;
		case 630:
			Class228.method4314(class665, 1408188468);
			break;
		case 284:
			Class259.method4784(class665, 1263368642);
			break;
		case 741:
			Class307.method5614(class665, -553689114);
			break;
		case 151:
			Class370.method6360(class665, 717980895);
			break;
		case 398:
			Class292.method5271(class665, 1935973201);
			break;
		case 721:
			Class208_Sub16.method15629(class665, (byte) 89);
			break;
		case 321:
			Class174.method2794(class665, (byte) 121);
			break;
		case 979:
			Node_Sub6.method16055(class665, 1449017065);
			break;
		case 240:
			Class327.method5802(class665, -1677263260);
			break;
		case 683:
			Class160_Sub1.method14478(class665, -765107039);
			break;
		case 631:
			Class208_Sub14.method15622(class665, 119555762);
			break;
		case 384:
			Class358_Sub2.method15933(class665, (byte) -103);
			break;
		case 277:
			Class103.method1803(class665, 2130958811);
			break;
		case 1246:
			Class221.method4149(class665, 569624575);
			break;
		case 1013:
			Class537.method8988(class665, -1289928448);
			break;
		case 963:
			Class243.method4609(class665, -1387256726);
			break;
		case 701:
			Class42.method1181(class665, (byte) 97);
			break;
		case 937:
			Class142.method2377(class665, -1976094955);
			break;
		case 291:
			Class156.method2558(class665, 900164097);
			break;
		case 580:
			Class317.method5678(class665, -1714905727);
			break;
		case 411:
			Class30_Sub1.method17361(class665, -679332830);
			break;
		case 661:
			Class522_Sub4.method15956(class665, 65280);
			break;
		case 1179:
			Class536_Sub1.method16025(class665, -799971583);
			break;
		case 482:
			Class527.method8741(class665, -1725558767);
			break;
		case 8:
			Class515.method8603(class665, 1441767930);
			break;
		case 169:
			Class335.method5876(class665, 278071674);
			break;
		case 419:
			Class191.method3689(class665, (byte) -31);
			break;
		case 4:
			Class179.method3071(class665, (byte) 0);
			break;
		case 1267:
			Class624.method10337(class665, -1589770270);
			break;
		case 446:
			Class66.method1469(class665, 1524576258);
			break;
		case 1219:
			Class324.method5727(class665, -566602075);
			break;
		case 617:
			Class493.method8002(class665, -706684276);
			break;
		case 304:
			Class58.method1366(class665, -368065155);
			break;
		case 218:
			Class117.method2033(class665, (byte) 80);
			break;
		case 83:
			Class86.method1617(class665, (byte) -97);
			break;
		case 1056:
			Class212.method3889(class665, 502563746);
			break;
		case 329:
			Class66.method1471(class665, -468952834);
			break;
		case 1111:
			Class463.method7624(class665, (byte) -99);
			break;
		case 944:
			Class516.method8608(class665, (byte) -24);
			break;
		case 1245:
			Class532.method8925(class665, 843140921);
			break;
		case 643:
			Class208_Sub2.method15589(class665, 570791115);
			break;
		case 1108:
			Class648.method10839(class665, (short) 4038);
			break;
		case 203:
			Class497.method8161(class665, -1033054224);
			break;
		case 285:
			Class648.method10831(class665, (byte) 45);
			break;
		case 1049:
			Class634.method10545(class665, 1474750881);
			break;
		case 685:
			Class75.method1529(class665, (byte) 8);
			break;
		case 775:
			Class557.method9427(class665, 601963637);
			break;
		case 361:
			Class153.method2528(class665, (byte) 77);
			break;
		case 1217:
			Class398.method6518(class665, (byte) 89);
			break;
		case 1121:
			Class527.method8742(class665, (short) 26958);
			break;
		case 410:
			Class461.method7597(class665, 1342743896);
			break;
		case 906:
			Class384.method6420(class665, 1564128213);
			break;
		case 692:
			Class460.method7576(class665, 1673974410);
			break;
		case 1151:
			Class160.method2585(class665, (byte) 29);
			break;
		case 118:
			Class249.method4662(class665, -1454317525);
			break;
		case 882:
			Class698.method14274(class665, -2141487024);
			break;
		case 1008:
			Class583.method9674(class665, (byte) -33);
			break;
		case 461:
			Class174_Sub4.method15607(class665, (byte) 76);
			break;
		case 545:
			Class529_Sub1.method16774(class665, -945345990);
			break;
		case 25:
			Class541.method9020(class665, -371759003);
			break;
		case 346:
			Class508.method8273(class665, (byte) 46);
			break;
		case 578:
			Class192.method3691(class665, -876363045);
			break;
		case 811:
			Class272.method5082(class665, -906968024);
			break;
		case 862:
			Class213.method3891(class665, -1142197077);
			break;
		case 448:
			Class293.method5291(class665, 692670853);
			break;
		case 529:
			Class574.method9624(class665, -1706855614);
			break;
		case 779:
			Class614.method10183(class665, 1781451784);
			break;
		case 99:
			Class35.method1130(class665, 939129867);
			break;
		case 1070:
			Class435.method6989(class665, 936204107);
			break;
		case 521:
			Class37.method1148(class665, -2088926157);
			break;
		case 146:
			Class447.method7258(class665, -2054814306);
			break;
		case 524:
			Class18.method746(class665, -2030315044);
			break;
		case 479:
			Class292.method5274(true, class665, (byte) 1);
			break;
		case 722:
			Class616.method10193(class665, 2096839347);
			break;
		case 526:
			Class307.method5619(class665, (byte) 45);
			break;
		case 507:
			Class463.method7625(class665, 930610179);
			break;
		case 548:
			Class631.method10464(class665, 703913046);
			break;
		case 813:
			Class259.method4783(class665, -1533791840);
			break;
		case 356:
			Class216.method3968(class665, 905891084);
			break;
		case 253:
			Class49.method1266(class665, 1082288601);
			break;
		case 679:
			Class100.method1774(class665, 1067854761);
			break;
		case 427:
			Class208_Sub10.method15615(class665, (byte) 38);
			break;
		case 727:
			Class483.method7951(class665, 166184977);
			break;
		case 391:
			Class180.method3540(class665, (byte) 1);
			break;
		case 42:
			Class392.method6482(class665, (byte) 1);
			break;
		case 316:
			Class509.method8421(class665, 1079827543);
			break;
		case 715:
			Exception_Sub5.method17969(class665, 782958270);
			break;
		case 789:
			Class329.method5815(class665, (short) 18479);
			break;
		case 670:
			Class174.method2795(class665, 1941301233);
			break;
		case 829:
			Class627.method10390(class665, -365397427);
			break;
		case 912:
			OutgoingPacket.method6635(class665, -821568894);
			break;
		case 142:
			Class37.method1145(class665, (short) 22310);
			break;
		case 269:
			Class314_Sub2_Sub1.method17982(class665, -2094849608);
			break;
		case 279:
			Class461.method7593(class665, 1821613641);
			break;
		case 1004:
			Class298.method5514(class665, (byte) 40);
			break;
		case 973:
			Class562.method9460(class665, (short) -24528);
			break;
		case 999:
			Class668.method13754(class665, -484441067);
			break;
		case 777:
			Class97.method1745(class665, 65280);
			break;
		case 869:
			Class33.method951(class665, -253065733);
			break;
		case 970:
			Class638.method10573(class665, -2052113706);
			break;
		case 915:
			Class51.method1284(class665, -1789898705);
			break;
		case 828:
			Class106.method1891(class665, (byte) -92);
			break;
		case 568:
			Class394.method6498(class665, (byte) 7);
			break;
		case 791:
			Class553.method9192(class665, (byte) -85);
			break;
		case 64:
			Class608.method10086(class665, 1097436640);
			break;
		case 1224:
			Class55.method1320(class665, (byte) -15);
			break;
		case 668:
			Class596.method9910(class665, (short) 16383);
			break;
		case 488:
			Class301.method5572(class665, (byte) 0);
			break;
		case 317:
			Class239.method4382(class665, (byte) 49);
			break;
		case 1091:
			Class511.method8484(class665, -722556165);
			break;
		case 107:
			Class524.method8715(class665, -300236640);
			break;
		case 1166:
			Class350_Sub1_Sub1.method17993(class665, (byte) -84);
			break;
		case 903:
			Class485.method7955(class665, 1541860215);
			break;
		case 975:
			Class556.method9422(class665, 1983894695);
			break;
		case 634:
			Class328.method5807(class665, 1429911443);
			break;
		case 758:
			Class653.method10903(class665, (byte) 27);
			break;
		case 620:
			Class274.method5127(class665, (byte) -43);
			break;
		case 1076:
			Class504.method8222(class665, (byte) 25);
			break;
		case 1257:
			Class550.method9112(class665, 1474750881);
			break;
		case 629:
			Class526.method8729(class665, 1869891135);
			break;
		case 235:
			Class410.method6576(class665, -1020751535);
			break;
		case 508:
			Class103.method1801(class665, -661172846);
			break;
		case 725:
			Class530.method8881(class665, -1236015185);
			break;
		case 360:
			Class390.method6469(class665, (byte) 0);
			break;
		case 1115:
			Class253.method4694(class665, (byte) 3);
			break;
		case 770:
			Class29.method872(class665, 444765518);
			break;
		case 512:
			Class429.method6868(class665, 858278630);
			break;
		case 765:
			Class105.method1831(class665, 1579265565);
			break;
		case 73:
			Class296_Sub1.method15696(class665, -645882032);
			break;
		case 747:
			Class627.method10391(class665, -601362548);
			break;
		case 799:
			Class411.method6598(class665, (byte) -8);
			break;
		case 224:
			Class243.method4605(class665, -2079901775);
			break;
		case 553:
			Class11.method685(class665, -349209686);
			break;
		case 44:
			Class527_Sub10.method16076(class665, 65280);
			break;
		case 368:
			Class527_Sub8_Sub9.method18287(class665, (byte) 42);
			break;
		case 27:
			Class297.method5508(class665, 1792944090);
			break;
		case 881:
			Class635.method10553(class665, (byte) 47);
			break;
		case 1210:
			Class225.method4188(class665, -190280150);
			break;
		case 900:
			Class211.method3876(class665, 1182048547);
			break;
		case 176:
			Class462.method7613(class665, -1055077160);
			break;
		case 489:
			Class586.method9780(class665, -177290828);
			break;
		case 301:
			Class519.method8658(class665, -1180628166);
			break;
		case 890:
			Class454.method7341(class665, (byte) -19);
			break;
		case 974:
			Class106.method1890(class665, 1155039918);
			break;
		case 67:
			Class311.method5649(class665, -947477218);
			break;
		case 666:
			Class470.method7714(class665, (short) -14846);
			break;
		case 159:
			Class634.method10546(class665, 71374879);
			break;
		case 625:
			Class387.method6439(class665, 348122896);
			break;
		case 263:
			Class409.method6572(class665, 2122496303);
			break;
		case 357:
			Class592.method9872(class665, (byte) 0);
			break;
		case 870:
			Class592.method9877(class665, (byte) 23);
			break;
		case 986:
			Class279.method5173(class665, (short) -16240);
			break;
		case 663:
			Class248.method4633(class665, (byte) 0);
			break;
		case 636:
			Class408.method6568(class665, -304502268);
			break;
		case 1176:
			Class506.method8245(class665, (byte) 0);
			break;
		case 355:
			Class413.method6629(class665, (byte) 0);
			break;
		case 509:
			Class628.method10408(class665, 1522730712);
			break;
		case 563:
			Class618.method10203(class665, -1465573448);
			break;
		case 534:
			Class383.method6411(class665, (byte) 1);
			break;
		case 1265:
			Class77.method1544(class665, (byte) -119);
			break;
		case 186:
			Class313_Sub1.method15661(class665, 409492234);
			break;
		case 766:
			Class174_Sub1.method14594(class665, 115768929);
			break;
		case 196:
			Class574.method9622(class665, (byte) -12);
			break;
		case 793:
			Class260.method4792(class665, (byte) 3);
			break;
		case 1016:
			Class154.method2533(class665, -415631126);
			break;
		case 592:
			Class214.method3899(class665, false, 120490847);
			break;
		case 654:
			Class154.method2535(class665, (byte) 1);
			break;
		case 254:
			Class318_Sub1.method15712(class665, 615560544);
			break;
		case 536:
			Class656.method10992(class665, 417159739);
			break;
		case 248:
			Class55.method1316(class665, 1936174921);
			break;
		case 728:
			Class329.method5813(class665, (short) -21377);
			break;
		case 402:
			Class35.method1131(class665, (byte) -11);
			break;
		case 599:
			Class195.method3709(class665, -2028808935);
			break;
		case 606:
			Class700_Sub14.method16973(class665, 1077171254);
			break;
		case 1062:
			Class643.method10738(class665, (byte) 74);
			break;
		case 833:
			Class578.method9647(class665, -1176934951);
			break;
		case 1022:
			Class115.method2029(class665, (byte) 29);
			break;
		case 136:
			Class387.method6438(class665, (byte) 9);
			break;
		case 182:
			Class477.method7782(class665, (byte) 76);
			break;
		case 497:
			Class541.method9019(class665, -1557588233);
			break;
		case 1220:
			Class466.method7660(class665, -494331051);
			break;
		case 5:
			Class420.method6712(class665, 1819037628);
			break;
		case 1158:
			Class463.method7623(class665, -750301914);
			break;
		case 955:
			Class237.method4372(class665, (byte) -63);
			break;
		case 1086:
			Class569.method9576(class665, -944468675);
			break;
		case 622:
			Class647.method10816(class665, (byte) 90);
			break;
		case 19:
			Class202.method3773(class665, 963641443);
			break;
		case 1088:
			Class146.method2398(class665, 2080063259);
			break;
		case 1119:
			Class198.method3746(class665, (short) -12600);
			break;
		case 945:
			Class570.method9599(true, class665, -158034257);
			break;
		case 377:
			Class429.method6869(class665, -1888970481);
			break;
		case 522:
			Class705.method14338(class665, (byte) 112);
			break;
		case 66:
			Class524.method8713(class665, 142469397);
			break;
		case 144:
			Class142.method2378(class665, 1769813785);
			break;
		case 1145:
			Class146.method2399(class665, 1749333582);
			break;
		case 408:
			Class700_Sub29.method17210(class665, 1918810047);
			break;
		case 340:
			Class268.method5051(class665, -2046529448);
			break;
		case 390:
			Class100.method1776(class665, (byte) 1);
			break;
		case 168:
			Class562.method9461(class665, -90245067);
			break;
		case 1207:
			Class689.method13998(class665, 1184216260);
			break;
		case 743:
			Class264.method4982(class665, -1995481016);
			break;
		case 1006:
			Class468.method7690(class665, -961914747);
			break;
		case 737:
			Class44.method1194(class665, 1915713754);
			break;
		case 1065:
			Class537.method8987(class665, 1026738219);
			break;
		case 1028:
			Class642.method10725(class665, 475859057);
			break;
		case 71:
			Class571.method9602(class665, -2101934602);
			break;
		case 491:
			Class306.method5604(class665, (byte) 10);
			break;
		case 667:
			RSByteBuffer.method16664(class665, -369177864);
			break;
		case 651:
			Class319.method5690(class665, 357905560);
			break;
		case 706:
			Class205.method3832(class665, (byte) -9);
			break;
		case 547:
			Class305.method5596(class665, -1173855569);
			break;
		case 481:
			Class345.method6090(class665, 865376614);
			break;
		case 381:
			Class502.method8204(class665, 102342651);
			break;
		case 1069:
			Class55.method1317(class665, 793262981);
			break;
		case 490:
			Class224.method4181(class665, -1476399691);
			break;
		case 207:
			Class556.method9420(class665, -2103530062);
			break;
		case 421:
			Class181.method3550(class665, -538825112);
			break;
		case 349:
			Class522.method8683(class665, -1554215092);
			break;
		case 165:
			Class619.method10215(class665, -1696748066);
			break;
		case 537:
			Class218.method3980(class665, -342819371);
			break;
		case 558:
			Class306.method5603(class665, (byte) -6);
			break;
		case 1104:
			Class611.method10118(class665, -1594480430);
			break;
		case 13:
			Class235.method4354(class665, (byte) 73);
			break;
		case 1259:
			Class208_Sub2.method15591(class665, -1554865084);
			break;
		case 1226:
			Class656.method10994(class665, 1095055083);
			break;
		case 1099:
			Class386.method6434(class665, -853784380);
			break;
		case 909:
			Class579_Sub1.method16378(class665, 2077580958);
			break;
		case 994:
			Class594.method9885(class665, (byte) 0);
			break;
		case 147:
			Class499.method8185(class665, (byte) 92);
			break;
		case 746:
			Class161.method2641(class665, -1864631239);
			break;
		case 755:
			Class208_Sub22.method15639(class665, -1903994934);
			break;
		case 11:
			Class700_Sub43.method17331(class665, 16711680);
			break;
		case 707:
			Class208_Sub6.method15611(class665, -264759130);
			break;
		case 297:
			Class525.method8727(class665, (byte) -62);
			break;
		case 805:
			Class289.method5223(class665, -1560163177);
			break;
		case 732:
			Class202.method3774(class665, -2143590846);
			break;
		case 601:
			Class221.method4150(class665, 1961439619);
			break;
		case 769:
			Class602.method10006(class665, 32768);
			break;
		case 744:
			Class622.method10231(class665, 910638359);
			break;
		case 1190:
			Class413.method6626(class665, 1321081686);
			break;
		case 17:
			Class98.method1751(class665, -55724860);
			break;
		case 1129:
			Class595.method9888(class665, -385849838);
			break;
		case 575:
			Class464.method7628(class665, 1897503536);
			break;
		case 276:
			Class203.method3779(class665, -16311768);
			break;
		case 1073:
			Class481.method7838(class665, -2054176543);
			break;
		case 326:
			Class110.method2012(class665, 2053022604);
			break;
		case 399:
			Class609.method10088(class665, (byte) -96);
			break;
		case 561:
			Class597.method9912(class665, 572545961);
			break;
		case 956:
			Class242.method4509(class665, (byte) 81);
			break;
		case 87:
			Class649.method10851(class665, -1222610644);
			break;
		case 567:
			Class56.method1329(class665, 102380841);
			break;
		case 108:
			Class600.method9927(class665, (byte) 5);
			break;
		case 556:
			Class227.method4307(class665, 1562769293);
			break;
		case 208:
			Class315.method5672(class665, (byte) 61);
			break;
		case 837:
			Class545.method9046(class665, (byte) -89);
			break;
		case 294:
			Class406.method6553(class665, 465385686);
			break;
		case 662:
			Class201.method3769(class665, (byte) 73);
			break;
		case 363:
			Class516.method8609(class665, -397716085);
			break;
		case 227:
			Class493.method8000(class665, (byte) 20);
			break;
		case 438:
			Class261.method4928(class665, 1502516339);
			break;
		case 641:
			Class178.method3068(class665, 959062841);
			break;
		case 309:
			Class179.method3070(class665, 1126860593);
			break;
		case 191:
			Class497.method8158(class665, (byte) 3);
			break;
		case 1138:
			Class24_Sub10.method17393(class665, (byte) -20);
			break;
		case 969:
			Class527_Sub24_Sub7.method18183(class665, (byte) 51);
			break;
		case 1144:
			Class527_Sub13.method16098(class665, 2066101990);
			break;
		case 919:
			Class226.method4302(class665, 872360445);
			break;
		case 18:
			Class573.method9616(class665, true, true, (byte) 49);
			break;
		case 864:
			Class18.method747(class665, -1131809975);
			break;
		case 34:
			Class621.method10229(class665, -430225361);
			break;
		case 21:
			Class95.method1728(class665, -1314331615);
			break;
		case 74:
			Class454.method7339(class665, 435594476);
			break;
		case 723:
			Class286.method5211(class665, (byte) 94);
			break;
		case 649:
			Class559.method9447(class665, (byte) 1);
			break;
		case 957:
			Class204.method3784(class665, (byte) -41);
			break;
		case 454:
			Class194.method3700(class665, (byte) 107);
			break;
		case 1126:
			Class262.method4943(class665, (byte) -34);
			break;
		case 927:
			Class454.method7340(class665, (byte) 1);
			break;
		case 439:
			Class327_Sub1.method15710(class665, 140611991);
			break;
		case 825:
			Class383.method6412(class665, 1537646792);
			break;
		case 982:
			Class55.method1319(class665, (byte) 2);
			break;
		case 714:
			Class640_Sub1_Sub2_Sub3.method18693(class665, -537105692);
			break;
		case 795:
			Class95.method1732(class665, 2014358275);
			break;
		case 194:
			Class201.method3770(class665, 2147261683);
			break;
		case 520:
			Class634.method10547(class665, -872487421);
			break;
		case 105:
			Class284.method5201(class665, -2049252234);
			break;
		case 209:
			Class481.method7835(class665, (byte) 93);
			break;
		case 135:
			Class596.method9907(class665, -2074573480);
			break;
		case 162:
			Class530.method8879(class665, 1204275972);
			break;
		case 111:
			Class245.method4624(class665, 538526553);
			break;
		case 598:
			Class180_Sub1.method14882(class665, 1050268689);
			break;
		case 1177:
			Class673.method13840(class665, (byte) 39);
			break;
		case 24:
			Class322.method5722(class665, (byte) 33);
			break;
		case 711:
			Class516.method8607(class665, (byte) 28);
			break;
		case 197:
			Class305.method5597(class665, (byte) 0);
			break;
		case 241:
			Class648.method10835(class665, 1879426111);
			break;
		case 403:
			Class606.method10057(class665, -1641541213);
			break;
		case 1228:
			Class187.method3658(class665, (short) -22385);
			break;
		case 222:
			Class629.method10420(class665, 2108633180);
			break;
		case 172:
			Class651.method10865(class665, -1153806085);
			break;
		case 434:
			Class579.method9653(class665, (byte) 78);
			break;
		case 60:
			Class52.method1286(class665, 1108350306);
			break;
		case 754:
			Class172.method2740(class665, 973033228);
			break;
		case 984:
			Class701.method14295(class665, -896006383);
			break;
		case 480:
			Class461.method7596(class665, -1118590427);
			break;
		case 1169:
			Class435.method6986(class665, -231013092);
			break;
		case 694:
			Class290.method5254(class665, 2032803952);
			break;
		case 115:
			Class516.method8611(class665, -1625223390);
			break;
		case 1135:
			Class547.method9073(class665, (byte) -71);
			break;
		case 943:
			Class536.method8984(class665, (byte) -100);
			break;
		case 930:
			Class604.method10040(class665, (byte) 100);
			break;
		case 1101:
			Class56.method1330(class665, 398460915);
			break;
		case 1216:
			Class385.method6428(class665, -348316916);
			break;
		case 33:
			Class218.method3979(class665, -1540473833);
			break;
		case 1189:
			Class679.method13899(class665, -798714322);
			break;
		case 257:
			Class246.method4630(class665, (byte) 78);
			break;
		case 566:
			Class463.method7627(class665, 1947853822);
			break;
		case 432:
			RSByteBuffer.method16665(class665, 470070008);
			break;
		case 32:
			Class545.method9047(class665, (byte) -52);
			break;
		case 433:
			Class586.method9782(class665, -2107322586);
			break;
		case 924:
			Class106.method1888(class665, 209354456);
			break;
		case 406:
			Class527_Sub31.method16352(class665, (byte) -77);
			break;
		case 417:
			Class579.method9655(class665, (byte) 0);
			break;
		case 1100:
			Class72.method1499(class665, -1831520769);
			break;
		case 430:
			Class525.method8723(class665, (byte) 8);
			break;
		case 47:
			Class297.method5509(class665, 1667225211);
			break;
		case 178:
			Class565.method9495(class665, 1363743255);
			break;
		case 261:
			Class10.method684(class665, 2141595154);
			break;
		case 583:
			Class405.method6549(class665, 1565355969);
			break;
		case 831:
			Class386.method6433(class665, -510647369);
			break;
		case 614:
			Class580.method9662(class665, (short) 5307);
			break;
		case 696:
			Class245.method4625(class665, -2107232384);
			break;
		case 206:
			Class628.method10413(class665, -927924265);
			break;
		case 781:
			Class265.method5035(class665, (byte) -10);
			break;
		case 823:
			Class612.method10123(class665, (byte) 0);
			break;
		case 866:
			Class418.method6665(class665, 506688484);
			break;
		case 236:
			Class553_Sub1.method16793(class665, (byte) 36);
			break;
		case 868:
			Class14.method734(class665, (byte) 82);
			break;
		case 344:
			Class12.method699(class665, -340858671);
			break;
		case 518:
			Class297.method5510(class665, -2039069920);
			break;
		case 29:
			Class708.method14377(class665, (byte) -105);
			break;
		case 328:
			Class707.method14364(class665, -576462388);
			break;
		case 485:
			Class398.method6517(class665, (byte) -11);
			break;
		case 1019:
			Class249.method4661(class665, -1878054110);
			break;
		case 1003:
			Class552.method9148(class665, 1350135285);
			break;
		case 364:
			Class104.method1806(class665, -1179067647);
			break;
		case 193:
			method8915(class665, 401984273);
			break;
		case 250:
			Class224.method4182(class665, -1778090799);
			break;
		case 533:
			Class602.method10009(class665, -1161656684);
			break;
		case 373:
			Class629.method10419(class665, (byte) -83);
			break;
		case 588:
			Class700_Sub22.method17123(class665, 2114871160);
			break;
		case 841:
			Class174.method2793(class665, (byte) -84);
			break;
		case 239:
			Class586.method9781(class665, -1326418095);
			break;
		case 865:
			Class45.method1213(class665, 2053269309);
			break;
		case 453:
			Class596.method9908(class665, 582077995);
			break;
		case 991:
			Class68.method1478(class665, 251007246);
			break;
		case 938:
			Class611.method10119(class665, 1672439548);
			break;
		case 804:
			Class146.method2400(class665, -1085086737);
			break;
		case 195:
			Class302.method5576(class665, (byte) 74);
			break;
		case 759:
			Class70.method1485(class665, (byte) 0);
			break;
		case 753:
			Class240.method4392(class665, (byte) 9);
			break;
		case 214:
			Class370.method6363(class665, -123135873);
			break;
		case 801:
			Class229.method4316(class665, 478312214);
			break;
		case 372:
			Class181.method3549(class665, 1936772959);
			break;
		case 86:
			Class302.method5577(class665, 657612566);
			break;
		case 1005:
			Class636.method10565(class665, 155923157);
			break;
		case 274:
			Class700_Sub40.method17306(class665, 597401360);
			break;
		case 1066:
			Class550.method9114(class665, -1128151900);
			break;
		case 179:
			Class358_Sub1.method15797(class665, 228218115);
			break;
		case 394:
			Class683.method13914(class665, -1883001886);
			break;
		case 367:
			Class653.method10902(class665, (byte) 68);
			break;
		case 337:
			Class488.method7967(class665, 1367957903);
			break;
		case 644:
			Class81.method1575(class665, -2079898468);
			break;
		case 492:
			Class506.method8244(class665, 1145584180);
			break;
		case 1209:
			Class335.method5877(class665, -53303947);
			break;
		case 414:
			Class522_Sub5.method15988(class665, 1203360920);
			break;
		case 1027:
			Class447.method7259(class665, 1659296208);
			break;
		case 286:
			Class277.method5154(class665, -1718922083);
			break;
		case 213:
			Class278.method5166(class665, -1414913963);
			break;
		case 627:
			Class635.method10554(class665, (byte) 117);
			break;
		case 733:
			Class183.method3559(class665, 1994896443);
			break;
		case 532:
			Class527_Sub4_Sub1.method18182(class665, -1458083461);
			break;
		case 429:
			Class539.method9002(class665, (byte) 16);
			break;
		case 41:
			Class303.method5584(class665, (byte) -19);
			break;
		case 551:
			Class213.method3892(class665, -1361777992);
			break;
		case 803:
			Class541.method9022(class665, (short) 400);
			break;
		case 845:
			Class382.method6404(class665, 1234175257);
			break;
		case 1152:
			Class654.method10914(class665, false, -108235550);
			break;
		case 495:
			Class690.method14001(class665, 978139577);
			break;
		case 1125:
			Class391.method6478(class665, (byte) -9);
			break;
		case 587:
			Class181.method3551(class665, (byte) 31);
			break;
		case 1001:
			Class370.method6359(class665, (byte) -76);
			break;
		case 38:
			Class189.method3670(class665, -1892200537);
			break;
		case 848:
			Class47.method1239(class665, 1224171249);
			break;
		case 1061:
			Class314.method5669(class665, (byte) 55);
			break;
		case 704:
			Class676.method13877(class665, 60748885);
			break;
		case 1232:
			Class253.method4697(class665, (byte) 49);
			break;
		case 1154:
			Class571.method9603(class665, 1850427318);
			break;
		case 40:
			Class100.method1773(class665, (byte) 40);
			break;
		case 296:
			Class700_Sub2.method16855(class665, -945267051);
			break;
		case 288:
			Class331.method5829(class665, (byte) 1);
			break;
		case 898:
			Class24_Sub21.method17423(class665, -939255719);
			break;
		case 1102:
			Class144.method2389(class665, (byte) -4);
			break;
		case 109:
			Class386.method6435(class665, 192633382);
			break;
		case 183:
			Class700_Sub9.method16931(class665, (byte) 94);
			break;
		case 597:
			Class268.method5052(class665, 2050913204);
			break;
		case 761:
			Class435.method6987(class665, -441238943);
			break;
		case 920:
			Class160_Sub2.method14515(class665, 701956515);
			break;
		case 273:
			Class172.method2739(class665, (byte) 29);
			break;
		case 1026:
			Class663.method11043(class665, -1498066079);
			break;
		case 132:
			Class492.method7989(class665, -1776696962);
			break;
		case 708:
			Class236.method4365(class665, 530697198);
			break;
		case 947:
			Class279.method5171(class665, 61851648);
			break;
		case 809:
			Class641.method10705(class665, (byte) 12);
			break;
		case 1110:
			Class647.method10814(class665, (byte) 127);
			break;
		case 1261:
			Class563.method9483(class665, 495002605);
			break;
		case 300:
			Class491.method7981(class665, -2032871442);
			break;
		case 542:
			Class409.method6573(class665, (byte) -102);
			break;
		case 102:
			Class595.method9887(class665, -1691674387);
			break;
		case 827:
			Class48.method1244(class665, 1654205589);
			break;
		case 894:
			Class619.method10219(class665, 1464395997);
			break;
		case 1140:
			Class656.method10993(class665, 517956138);
			break;
		case 964:
			Class632.method10470(class665, (byte) 24);
			break;
		case 156:
			Class524.method8714(class665, (byte) -1);
			break;
		case 968:
			Class380.method6396(class665, 2057719987);
			break;
		case 826:
			Class624.method10330(class665, -173551053);
			break;
		case 319:
			Class481.method7834(class665, 268573765);
			break;
		case 315:
			Class476.method7771(class665, -972461632);
			break;
		case 358:
			Class46.method1233(class665, -1180608865);
			break;
		case 1238:
			Class112.method2019(class665, 1274443633);
			break;
		case 345:
			Class520.method8661(class665, (byte) 0);
			break;
		case 1247:
			Class381.method6398(class665, (byte) -108);
			break;
		case 1051:
			Class527_Sub24.method16250(class665, (byte) 0);
			break;
		case 660:
			Class211.method3878(class665, 1434301005);
			break;
		case 1149:
			Class69.method1482(class665, 831677101);
			break;
		case 1032:
			Class310.method5636(class665, -1655608809);
			break;
		case 332:
			Class490.method7977(class665, 1237237387);
			break;
		case 493:
			Class260.method4791(class665, 302080560);
			break;
		case 786:
			Class32.method941(class665, -1268910951);
			break;
		case 465:
			Class79.method1563(class665, (byte) -61);
			break;
		case 678:
			Class207.method3842(class665, (byte) 30);
			break;
		case 6:
			Class598.method9918(class665, -436191366);
			break;
		case 1042:
			Class626.method10389(class665, 613918182);
			break;
		case 925:
			Class603.method10024(class665, 263903557);
			break;
		case 401:
			Class693.method14073(class665, -1728929397);
			break;
		case 546:
			Class576.method9636(class665, -609133708);
			break;
		case 873:
			Class27.method863(class665, -2127582421);
			break;
		case 1085:
			Class579.method9652(class665, -1556257132);
			break;
		case 1143:
			Class570.method9599(false, class665, -1288492132);
			break;
		case 199:
			Class193.method3698(class665, (byte) 0);
			break;
		case 921:
			Class553.method9196(class665, (byte) 4);
			break;
		case 646:
			Class527_Sub40.method16675(class665, 102647161);
			break;
		case 916:
			Class95_Sub1.method14496(class665, (byte) 42);
			break;
		case 255:
			Class17.method742(class665, 195456631);
			break;
		case 594:
			Class171.method2735(class665, 595349051);
			break;
		case 800:
			Class220.method4069(class665, 1203208449);
			break;
		case 134:
			Class465_Sub1.method15935(class665, 2146702320);
			break;
		case 932:
			Class219.method4065(class665, (byte) -88);
			break;
		case 665:
			Class352.method6210(class665, 615964875);
			break;
		case 730:
			Class553_Sub1.method16790(class665, -244300183);
			break;
		case 1229:
			Class535.method8980(class665, -1812016829);
			break;
		case 1082:
			Class553_Sub1.method16791(class665, 1390852318);
			break;
		case 1039:
			Class254.method4701(class665, 1043868594);
			break;
		case 771:
			Class309.method5630(class665, -2033831121);
			break;
		case 565:
			Class228.method4313(class665, (byte) -112);
			break;
		case 502:
			Class640_Sub1_Sub4_Sub1.method18657(class665, -1763785627);
			break;
		case 1010:
			Class285.method5209(class665, 495969632);
			break;
		case 977:
			Class547_Sub1.method16306(class665, 1764200183);
			break;
		case 731:
			Class318.method5686(class665, -163433889);
			break;
		case 673:
			Class208_Sub10.method15614(class665, -349020879);
			break;
		case 94:
			Class418.method6664(class665, 1836897720);
			break;
		case 251:
			Class488.method7968(class665, (byte) 100);
			break;
		case 405:
			Class573.method9616(class665, true, false, (byte) 109);
			break;
		case 1122:
			Class510.method8442(class665, 74592401);
			break;
		case 669:
			Class261.method4929(class665, 1951045776);
			break;
		case 90:
			Class675.method13857(class665, (byte) 74);
			break;
		case 574:
			Class235.method4358(class665, (byte) -94);
			break;
		case 1164:
			Class300.method5567(class665, 102380841);
			break;
		case 616:
			Class203.method3780(class665, (byte) -15);
			break;
		case 95:
			Class587.method9808(class665, -684900887);
			break;
		case 139:
			Class456_Sub1.method15986(class665, 1785320755);
			break;
		case 1123:
			Class697.method14266(class665, (byte) 0);
			break;
		case 684:
			Class548.method9093(class665, 266635223);
			break;
		case 802:
			Class5.method567(class665, (short) 484);
			break;
		case 844:
			Class69.method1481(class665, -528695431);
			break;
		case 290:
			Class553.method9190(class665, 718171213);
			break;
		case 1074:
			Class658.method11010(class665, (short) -23144);
			break;
		case 35:
			Class550.method9110(class665, 493127644);
			break;
		case 487:
			Class193.method3697(class665, -1968966942);
			break;
		case 100:
			Class619.method10218(class665, 961242141);
			break;
		case 918:
			Class465.method7651(class665, 533835570);
			break;
		case 929:
			Class571.method9600(class665, -1064165043);
			break;
		case 966:
			Class273.method5120(class665, (short) 13243);
			break;
		case 703:
			Class658.method11009(class665, -1925019162);
			break;
		case 689:
			Class282.method5198(class665, -16777216);
			break;
		case 1215:
			Class601.method9952(class665, -63010619);
			break;
		case 624:
			Class558.method9441(class665, (byte) -124);
			break;
		case 98:
			Class89.method1631(class665, (byte) 126);
			break;
		case 506:
			Class314.method5666(class665, (byte) -118);
			break;
		case 237:
			Class582.method9670(class665, 1895474994);
			break;
		case 50:
			Class700_Sub4.method16881(class665, 225544113);
			break;
		case 933:
			Class37.method1146(class665, -125055312);
			break;
		case 699:
			Class660.method11018(class665, (byte) 2);
			break;
		case 895:
			Class57.method1364(class665, (byte) 11);
			break;
		case 205:
			Class587.method9804(class665, (byte) -13);
			break;
		case 767:
			Class99.method1763(class665, (byte) -92);
			break;
		case 1159:
			Class153.method2526(class665, 23335557);
			break;
		case 718:
			Class608.method10085(class665, (short) 16624);
			break;
		case 1204:
			Class69.method1479(class665, (byte) -121);
			break;
		case 164:
			SubIncomingPacket.method6716(class665, -1975843642);
			break;
		case 939:
			Class498.method8167(class665, -2121289853);
			break;
		case 413:
			Class629.method10421(class665, -132864635);
			break;
		case 12:
			Class269.method5057(class665, 1788503286);
			break;
		case 751:
			Class216.method3967(class665, -1147714647);
			break;
		case 1253:
			Class282.method5196(class665, -2138745108);
			break;
		case 225:
			Class217.method3971(class665, -2135593317);
			break;
		case 436:
			Class197.method3728(class665, 787835693);
			break;
		case 370:
			Class457_Sub1.method15921(class665, 608022392);
			break;
		case 395:
			Class517.method8630(class665, 1294948380);
			break;
		case 1171:
			Class314.method5667(class665, 1801221514);
			break;
		case 1240:
			Class41.method1171(class665, -285784619);
			break;
		case 1023:
			Class519.method8656(class665, -1731628840);
			break;
		case 1221:
			Class499.method8186(class665, (byte) 35);
			break;
		case 201:
			Class527_Sub24_Sub8.method18184(class665, -1297876321);
			break;
		case 393:
			Class263.method4961(class665, 440478358);
			break;
		case 798:
			Class307.method5613(class665, (byte) 55);
			break;
		case 1147:
			Class627.method10392(class665, (byte) -93);
			break;
		case 1194:
			Class569.method9577(class665, -1801791308);
			break;
		case 114:
			Class187.method3660(class665, (byte) -93);
			break;
		case 371:
			Class189.method3671(class665, -128719263);
			break;
		case 552:
			Class492.method7996(class665, (byte) 8);
			break;
		case 1090:
			Class144.method2384(class665, (byte) 1);
			break;
		case 717:
			Class72.method1498(class665, (byte) 8);
			break;
		case 577:
			Class28.method865(class665, (byte) -82);
			break;
		case 519:
			Class634.method10550(class665, 1065351339);
			break;
		case 55:
			Class260.method4795(class665, 101840614);
			break;
		case 1029:
			Class263.method4960(class665, -1699780717);
			break;
		case 876:
			Class108.method1936(class665, (short) -26632);
			break;
		case 69:
			Class517.method8629(class665, -394148005);
			break;
		case 226:
			Class35.method1128(class665, -34763166);
			break;
		case 1187:
			Class455.method7347(class665, -1734896127);
			break;
		case 602:
			Class527_Sub38_Sub2.method18477(class665, (byte) 0);
			break;
		case 1107:
			Class647.method10818(class665, (byte) 11);
			break;
		case 503:
			Class592.method9874(class665, (byte) -79);
			break;
		case 1021:
			Class675.method13859(class665, 1769813785);
			break;
		case 988:
			Class700.method14292(class665, 1474750881);
			break;
		case 471:
			Class203.method3781(class665, 1572456838);
			break;
		case 952:
			Class652.method10893(class665, (byte) -52);
			break;
		case 396:
			Class180.method3541(class665, 1088033229);
			break;
		case 154:
			Class112.method2021(class665, (byte) 0);
			break;
		case 443:
			Class25.method850(class665, (byte) 1);
			break;
		case 1127:
			Class388.method6455(class665, 1548988444);
			break;
		case 889:
			Class504.method8218(class665, -1123654030);
			break;
		case 265:
			Class321.method5699(class665, (byte) 11);
			break;
		case 418:
			Class498.method8164(class665, 1826176733);
			break;
		case 748:
			IncomingPacket.method6719(class665, -1306277442);
			break;
		case 442:
			Class56.method1331(class665, -1127694404);
			break;
		case 1092:
			Class317.method5679(class665, (short) 21274);
			break;
		case 116:
			Class215.method3965(class665, -1464604923);
			break;
		case 816:
			Class656.method10996(class665, (short) 11858);
			break;
		case 1132:
			Class189.method3667(class665, 1593107599);
			break;
		case 677:
			Class490.method7972(class665, (byte) 70);
			break;
		case 103:
			Class116.method2031(class665, -1758773501);
			break;
		case 9:
			Class199.method3754(class665, -1910320534);
			break;
		case 854:
			Class208_Sub16.method15626(class665, (byte) -91);
			break;
		case 1186:
			Class239.method4380(class665, -819683935);
			break;
		case 856:
			Class295.method5337(class665, 296362330);
			break;
		case 382:
			Class277.method5156(class665, (byte) -53);
			break;
		case 1236:
			Class502.method8202(class665, 191492053);
			break;
		case 348:
			Class592.method9871(class665, 1052800109);
			break;
		case 498:
			Class625.method10348(class665, (short) 256);
			break;
		case 10:
			Class290.method5255(class665, (byte) -8);
			break;
		case 1157:
			Class635.method10552(class665, -360746864);
			break;
		case 579:
			Class619.method10214(class665, (byte) 0);
			break;
		case 1206:
			Class671.method13780(class665, -1040892480);
			break;
		case 525:
			Class286.method5210(class665, -2144398638);
			break;
		case 987:
			Class638.method10572(class665, 2053316422);
			break;
		case 590:
			Class527_Sub40.method16676(class665, (byte) 22);
			break;
		case 283:
			Class68_Sub1.method16795(class665, -1871754389);
			break;
		case 949:
			Class58.method1367(class665, (byte) 32);
			break;
		case 16:
			Class218.method3977(class665, -702687901);
			break;
		case 233:
			Class656.method10995(class665, (byte) 1);
			break;
		case 935:
			Class189.method3668(class665, -1532493464);
			break;
		case 501:
			Class482.method7846(class665, -1197398692);
			break;
		case 632:
			Class260.method4798(class665, -444432804);
			break;
		case 760:
			Class300.method5564(class665, -533476177);
			break;
		case 334:
			Class384.method6418(class665, (short) -17114);
			break;
		case 141:
			Class263.method4959(class665, 2123638631);
			break;
		case 958:
			Class69.method1483(class665, 547915366);
			break;
		case 449:
			Class282.method5199(class665, 1621525958);
			break;
		case 426:
			Class462.method7615(class665, -1593793541);
			break;
		case 1020:
			Class703.method14310(class665, -1152120326);
			break;
		case 1124:
			Class413.method6628(class665, -1271537800);
			break;
		case 724:
			Class511.method8485(class665, -1849564277);
			break;
		case 971:
			Class382.method6405(class665, -401998898);
			break;
		case 1052:
			Class146.method2396(class665, 571041943);
			break;
		case 400:
			Class37.method1147(class665, 1200391451);
			break;
		case 1264:
			Class143.method2381(class665, (short) -16322);
			break;
		case 49:
			Class285.method5208(class665, -78981144);
			break;
		case 1201:
			Class153.method2527(class665, (byte) -21);
			break;
		case 612:
			Class639.method10611(class665, (byte) -54);
			break;
		case 990:
			Class615.method10189(class665, -233074917);
			break;
		case 65:
			Class321.method5698(class665, 309469188);
			break;
		case 656:
			Class411.method6596(class665, (short) 28853);
			break;
		case 327:
			Class288.method5217(class665, 37511753);
			break;
		case 953:
			Class554.method9211(class665, -1586241701);
			break;
		case 954:
			Class160.method2582(class665, 2002804057);
			break;
		case 244:
			Class626.method10386(class665, (byte) -21);
			break;
		case 817:
			Class498.method8166(class665, 1397377021);
			break;
		case 535:
			Class659.method11012(class665, -685108534);
			break;
		case 582:
			Class174_Sub1.method14591(class665, 2079091243);
			break;
		case 478:
			Class618.method10204(class665, (byte) 20);
			break;
		case 951:
			Class624.method10329(class665, -1639736288);
			break;
		case 1250:
			Class398.method6516(class665, (byte) 21);
			break;
		case 1097:
			Class470.method7712(class665, 1900887570);
			break;
		case 688:
			Class142.method2376(class665, (byte) -1);
			break;
		case 1139:
			Class308.method5622(class665, (byte) 1);
			break;
		case 621:
			Class517.method8631(class665, -1206170675);
			break;
		case 230:
			Class187.method3656(class665, 1078630476);
			break;
		case 31:
			Class703.method14309(class665, (byte) -28);
			break;
		case 818:
			Class454.method7338(class665, -1794065781);
			break;
		case 350:
			Class482.method7840(class665, (byte) 2);
			break;
		case 849:
			Class231.method4324(class665, 2122254181);
			break;
		case 530:
			Class59.method1373(class665, 111209845);
			break;
		case 1058:
			Class560.method9449(class665, 1704497945);
			break;
		case 1133:
			Class275.method5139(class665, (byte) 1);
			break;
		case 63:
			Class306.method5610(class665, -1762454902);
			break;
		case 192:
			Class580.method9660(class665, -1434203066);
			break;
		case 444:
			Class104.method1805(class665, 1387756878);
			break;
		case 910:
			Class504.method8223(class665, -80241363);
			break;
		case 559:
			Class588.method9813(class665, 46139728);
			break;
		case 784:
			Class500.method8188(class665, (short) 21283);
			break;
		case 1012:
			Class430.method6871(class665, (byte) 8);
			break;
		case 557:
			Class453.method7334(class665, (byte) 48);
			break;
		case 366:
			Class100.method1772(class665, -625055715);
			break;
		case 884:
			Class470.method7716(class665, -1604933611);
			break;
		case 467:
			Class55.method1318(class665, -1658354742);
			break;
		case 780:
			Class400.method6530(class665, 194625677);
			break;
		case 127:
			Class239.method4378(class665, (short) 30742);
			break;
		case 1136:
			Class518.method8632(class665, 1627681756);
			break;
		case 223:
			Class180.method3538(class665, (byte) -57);
			break;
		case 428:
			Class470.method7715(class665, 1329492325);
			break;
		case 293:
			Class539.method8998(class665, (byte) -60);
			break;
		case 836:
			Class64.method1452(class665, (byte) 65);
			break;
		case 648:
			Class279.method5172(class665, -183253806);
			break;
		case 672:
			Class582.method9671(class665, 1038405191);
			break;
		case 305:
			Class208_Sub12.method15620(class665, 246059667);
			break;
		case 1196:
			Class482.method7844(class665, -1931704432);
			break;
		case 628:
			Class452.method7331(class665, (byte) 54);
			break;
		case 691:
			Class160.method2584(class665, 1131723801);
			break;
		case 143:
			Class170.method2726(class665, (short) 2017);
			break;
		case 150:
			Class184.method3563(class665, 892539264);
			break;
		case 110:
			Class191.method3685(class665, (short) 15156);
			break;
		case 84:
			Class481.method7836(class665, 2058557050);
			break;
		case 923:
			Class159.method2570(class665, -86402549);
			break;
		case 1048:
			Class304.method5587(class665, -473973996);
			break;
		case 1223:
			Class305.method5595(class665, (byte) 46);
			break;
		case 686:
			Class504.method8217(class665, -2132263509);
			break;
		case 899:
			Class671.method13779(class665, -1383189232);
			break;
		case 851:
			Class208_Sub21.method15636(class665, 1046073023);
			break;
		case 422:
			Class466.method7661(class665, (byte) 31);
			break;
		case 676:
			Class144_Sub1.method14511(class665, 2002620508);
			break;
		case 167:
			Class154.method2534(class665, 1111411712);
			break;
		case 821:
			Class465.method7649(class665, (byte) -109);
			break;
		case 595:
			Class530.method8880(class665, (byte) 92);
			break;
		case 1178:
			Class697.method14265(class665, -345201108);
			break;
		case 555:
			Class642.method10726(class665, 1017081275);
			break;
		case 1007:
			Class495.method8124(class665, -2072419378);
			break;
		case 171:
			Class345.method6091(class665, (byte) -72);
			break;
		case 336:
			Class411.method6597(class665, (byte) -40);
			break;
		case 234:
			Class318.method5684(class665, -1827671506);
			break;
		case 1131:
			Class700_Sub29.method17211(class665, (short) 6425);
			break;
		case 229:
			Class606.method10058(class665, -290528711);
			break;
		case 341:
			Class268.method5048(class665, (byte) -99);
			break;
		case 604:
			Class462.method7618(class665, -2048554060);
			break;
		case 908:
			Class97.method1744(class665, (byte) -38);
			break;
		case 216:
			Class390.method6471(class665, 65280);
			break;
		case 1198:
			Class532.method8927(class665, 1383509458);
			break;
		case 992:
			Class648.method10836(class665, -1292184705);
			break;
		case 1046:
			Class573.method9617(class665, -1322749691);
			break;
		case 320:
			Class285.method5207(class665, -360957248);
			break;
		case 1256:
			Class331_Sub2.method15713(class665, (byte) 73);
			break;
		case 675:
			Class384.method6424(class665, 1091256102);
			break;
		case 980:
			Class526.method8730(class665, (byte) -6);
			break;
		case 365:
			Class32.method939(class665, (byte) 4);
			break;
		case 863:
			Class346.method6161(class665, -610574277);
			break;
		case 905:
			Class231.method4325(class665, 1459064198);
			break;
		case 911:
			Class214.method3901(class665, -1176825643);
			break;
		case 742:
			Class481.method7837(class665, 1429091408);
			break;
		case 378:
			Class465.method7648(class665, -1568768513);
			break;
		case 231:
			Class640_Sub1_Sub2_Sub2.method18671(class665, (byte) 3);
			break;
		case 897:
			Class329.method5812(class665, (byte) 60);
			break;
		case 655:
			Class163.method2650(class665, (byte) 8);
			break;
		case 842:
			Class290.method5250(class665, -49817901);
			break;
		case 412:
			Class677.method13891(class665, (byte) 97);
			break;
		case 1025:
			Class504.method8219(class665, (byte) 1);
			break;
		case 184:
			Class62_Sub2.method17429(class665, (byte) -20);
			break;
		case 983:
			Class294.method5299(class665, (byte) 91);
			break;
		case 860:
			Class636.method10564(class665, -1294258837);
			break;
		case 861:
			Class504.method8216(class665, -1577926497);
			break;
		case 43:
			Class193.method3696(class665, (byte) 0);
			break;
		case 749:
			Class259.method4782(class665, (short) 12667);
			break;
		case 680:
			Class312.method5651(class665, -2141501652);
			break;
		case 14:
			Class208_Sub6.method15612(class665, -1761106234);
			break;
		case 886:
			Class298.method5516(class665, 864308515);
			break;
		case 210:
			Class208_Sub6.method15610(class665, (byte) -71);
			break;
		case 1024:
			Class515.method8604(class665, (byte) 21);
			break;
		case 324:
			Class389.method6461(class665, -188680938);
			break;
		case 450:
			Class306.method5609(class665, (byte) 1);
			break;
		case 1130:
			Class527_Sub27.method16270(class665, (byte) -62);
			break;
		case 626:
			Class352.method6213(class665, -103230865);
			break;
		case 170:
			Class40.method1168(class665, (byte) -6);
			break;
		case 500:
			Class274.method5128(class665, 676873784);
			break;
		case 571:
			Class573.method9616(class665, false, false, (byte) 27);
			break;
		case 28:
			Class466.method7659(class665, (byte) -8);
			break;
		case 362:
			Class670.method13763(class665, (byte) 6);
			break;
		case 1269:
			Class555.method9406(class665, 102380841);
			break;
		case 468:
			Class34.method966(class665, -1243323145);
			break;
		case 797:
			Class527_Sub15.method16127(class665, -1306722281);
			break;
		case 347:
			method8917(class665, (byte) 0);
			break;
		case 855:
			Class520.method8662(class665, 768815903);
			break;
		case 941:
			Class505.method8224(class665, 40651169);
			break;
		case 81:
			method8916(class665, -656580229);
			break;
		case 1170:
			Class557.method9430(class665, (byte) 1);
			break;
		case 674:
			Class29.method870(class665, -2061110519);
			break;
		case 249:
			Class396.method6508(class665, (byte) 12);
			break;
		case 125:
			Class190.method3675(class665, (byte) 11);
			break;
		case 126:
			Class652.method10896(class665, -729348414);
			break;
		case 423:
			Class450.method7287(class665, 854000911);
			break;
		case 219:
			Class537.method8986(class665, (byte) 22);
			break;
		case 281:
			Class700_Sub29.method17212(class665, (byte) 25);
			break;
		case 538:
			Class646.method10754(class665, (short) -19200);
			break;
		case 1109:
			Class260.method4794(class665, 1598228779);
			break;
		case 1087:
			Class97.method1750(class665, (byte) -77);
			break;
		case 593:
			Class467.method7665(class665, (byte) 0);
			break;
		case 15:
			Class532.method8932(class665, 16777472);
			break;
		case 995:
			Class215.method3963(class665, 1647767648);
			break;
		case 351:
			Class390.method6472(class665, (short) -13377);
			break;
		case 1141:
			Class512.method8486(class665, -2141488929);
			break;
		case 243:
			Class242.method4510(class665, -1939096374);
			break;
		case 1181:
			Class397.method6512(class665, 83165574);
			break;
		case 880:
			Class104.method1804(class665, -1479312771);
			break;
		case 639:
			Class550.method9113(class665, 1357717116);
			break;
		case 56:
			method8921(class665, 1668868868);
			break;
		case 931:
			Class440.method7113(class665, 1582231068);
			break;
		case 1095:
			Class557.method9428(class665, (byte) 5);
			break;
		case 1150:
			Class210.method3873(class665, -636581679);
			break;
		case 1064:
			Class463.method7626(class665, 155920941);
			break;
		case 92:
			Class609.method10089(class665, 1810667781);
			break;
		case 1235:
			Class5.method568(class665, 699131645);
			break;
		case 1059:
			Class239.method4379(class665, 1264062692);
			break;
		case 163:
			Class547.method9075(class665, 1145998374);
			break;
		case 53:
			Class635.method10555(class665, 2036802923);
			break;
		case 922:
			Class541.method9024(class665, 1075821645);
			break;
		case 719:
			Class15.method741(class665, (byte) 19);
			break;
		case 1199:
			Class292.method5272(class665, 2084035512);
			break;
		case 121:
			Class545.method9045(class665, 687252682);
			break;
		case 613:
			Class390.method6468(class665, 1433377986);
			break;
		case 318:
			Class602.method10010(class665, 382939659);
			break;
		case 1084:
			Class527_Sub29.method16287(class665, 1687744912);
			break;
		case 190:
			Class146.method2402(class665, (byte) 126);
			break;
		case 907:
			Class407.method6559(class665, (byte) 111);
			break;
		case 409:
			Class146.method2397(class665, (short) 1243);
			break;
		case 550:
			Class584.method9678(class665, (byte) -68);
			break;
		case 407:
			Class335.method5873(class665, (byte) 2);
			break;
		case 1268:
			Class453.method7335(class665, (byte) 9);
			break;
		case 623:
			Class215.method3964(class665, -987929801);
			break;
		case 45:
			Class218.method3978(class665, 980365543);
			break;
		case 1243:
			Class570.method9597(class665, (byte) -85);
			break;
		case 1165:
			Class646.method10756(class665, (byte) -110);
			break;
		case 1112:
			Class593.method9883(class665, (short) -4515);
			break;
		case 511:
			Class285.method5205(class665, -1868598540);
			break;
		case 52:
			Class527_Sub32.method16353(class665, -154812569);
			break;
		case 653:
			Class554.method9212(class665, -1755839668);
			break;
		case 871:
			Class198.method3743(class665, -915638676);
			break;
		case 310:
			Class580.method9661(class665, -1444418940);
			break;
		case 1055:
			Class450.method7284(class665, 1135874809);
			break;
		case 1040:
			Class260.method4797(class665, -1826677909);
			break;
		case 456:
			Class19.method769(class665, (byte) 1);
			break;
		case 965:
			Class265.method5034(class665, -1437123091);
			break;
		case 734:
			Class321.method5701(class665, 842330009);
			break;
		case 280:
			Class599.method9919(class665, 376037123);
			break;
		case 189:
			Class170_Sub1.method14737(class665, 217517011);
			break;
		case 1183:
			Class262.method4946(class665, (byte) 1);
			break;
		case 839:
			Class100.method1775(class665, (byte) -119);
			break;
		case 1173:
			Class474.method7755(class665, (byte) -59);
			break;
		case 264:
			Class253.method4693(class665, 1023293258);
			break;
		case 1079:
			Class264.method4985(class665, 1838681125);
			break;
		case 1225:
			Class632.method10472(class665, 728456087);
			break;
		case 1002:
			Class656.method10997(class665, 34441765);
			break;
		case 339:
			OutgoingPacket.method6636(class665, -1402662757);
			break;
		case 585:
			Class48.method1246(class665, 1229316750);
			break;
		case 149:
			Class636.method10566(class665, (byte) -98);
			break;
		case 1242:
			Class451.method7294(class665, 1822140872);
			break;
		case 619:
			Class275.method5138(class665, (byte) 98);
			break;
		case 682:
			Class205.method3830(class665, 1769813785);
			break;
		case 1156:
			Class248.method4634(class665, -186502851);
			break;
		case 783:
			Class497.method8163(class665, -1881202956);
			break;
		case 874:
			Class380.method6397(class665, -438806997);
			break;
		case 527:
			Class386.method6432(class665, (byte) 49);
			break;
		case 564:
			Class72.method1497(class665, (byte) 14);
			break;
		case 633:
			Class104.method1807(class665, 1474959659);
			break;
		case 652:
			Class210.method3872(class665, 795435262);
			break;
		case 1063:
			Class647.method10817(class665, (byte) 60);
			break;
		case 729:
			Class279.method5174(class665, -1199109425);
			break;
		case 1222:
			Class425.method6731(class665, -1139468781);
			break;
		case 1263:
			Class626.method10387(class665, 146348096);
			break;
		case 698:
			Class625.method10347(class665, 2035624781);
			break;
		case 48:
			Class661.method11022(class665, 1480683184);
			break;
		case 515:
			Class358_Sub1.method15796(class665, (byte) -120);
			break;
		case 657:
			Class557.method9426(class665, -1636492276);
			break;
		case 1050:
			Class29.method871(class665, -750500969);
			break;
		case 917:
			Class527_Sub30.method16290(class665, -2120488705);
			break;
		case 926:
			Class462.method7614(class665, 2061378846);
			break;
		case 913:
			Class696_Sub5.method17404(class665, -1213582213);
			break;
		case 1161:
			Class507.method8256(class665, (byte) 118);
			break;
		case 123:
			Class263.method4958(class665, (byte) 0);
			break;
		case 824:
			Class35.method1129(class665, -893697857);
			break;
		case 808:
			Class558.method9440(class665, 2016910704);
			break;
		case 516:
			Class331_Sub3.method15768(class665, -869807842);
			break;
		case 70:
			Class562.method9463(class665, -2059433763);
			break;
		case 1113:
			Class52.method1289(class665, (byte) 68);
			break;
		case 79:
			Class465_Sub2.method15954(class665, (short) 15037);
			break;
		case 940:
			Class532.method8926(class665, 1103141607);
			break;
		case 788:
			Class499.method8187(class665, (byte) 47);
			break;
		case 1096:
			Class485.method7956(class665, (byte) 83);
			break;
		case 877:
			Class461.method7594(class665, -199631324);
			break;
		case 738:
			Class642.method10727(class665, (byte) 5);
			break;
		case 1060:
			Class324.method5726(class665, -237689513);
			break;
		case 690:
			Class654.method10913(class665, 1706529895);
			break;
		case 59:
			Class600.method9926(class665, 816593021);
			break;
		case 476:
			Class527_Sub30.method16292(class665, (short) 1010);
			break;
		case 658:
			Class308.method5623(class665, (short) 2588);
			break;
		case 934:
			Class572.method9609(class665, (byte) 43);
			break;
		case 57:
			Class312.method5650(class665, 933488628);
			break;
		case 46:
			Class308.method5624(class665, 1922164689);
			break;
		case 335:
			Class244.method4616(class665, (short) 256);
			break;
		case 638:
			Class212.method3888(class665, -1072598911);
			break;
		case 774:
			Class237.method4370(class665, (byte) 0);
			break;
		case 0:
			Class281.method5185(class665, (byte) -96);
			break;
		case 1155:
			Class106.method1889(class665, (byte) 16);
			break;
		case 89:
			Class294.method5297(class665, (byte) 61);
			break;
		case 331:
			Class588.method9817(class665, (byte) 122);
			break;
		case 878:
			Class440.method7111(class665, -1243141504);
			break;
		case 517:
			Class309.method5631(class665, -1922770609);
			break;
		case 1031:
			Class478.method7786(class665, (byte) 40);
			break;
		case 145:
			Class610.method10112(class665, 2057723815);
			break;
		case 466:
			Class469.method7696(class665, -1580932417);
			break;
		case 720:
			Class273.method5124(class665, -389408814);
			break;
		case 778:
			Class407.method6557(class665, -1291909436);
			break;
		case 1249:
			Class289.method5222(class665, 1596682659);
			break;
		case 1218:
			Class709.method14397(class665, (byte) -33);
			break;
		case 763:
			Class275.method5141(class665, -1160602448);
			break;
		case 185:
			Class298.method5513(class665, 65280);
			break;
		case 785:
			Class179.method3074(class665, 1127788904);
			break;
		case 282:
			Class562.method9459(class665, (byte) -56);
			break;
		case 131:
			Class221.method4148(class665, 102380841);
			break;
		case 942:
			Class106.method1887(class665, 475880557);
			break;
		case 140:
			Class603.method10022(class665, 1826005530);
			break;
		case 959:
			Class506.method8246(class665, (byte) 1);
			break;
		case 1033:
			Class304.method5586(class665, 1232485919);
			break;
		case 1083:
			Class303.method5582(class665, 204761682);
			break;
		case 832:
			Class497.method8162(class665, (byte) -26);
			break;
		case 435:
			Class700_Sub34.method17258(class665, (byte) 1);
			break;
		case 1068:
			Class206.method3838(class665, (byte) 0);
			break;
		case 961:
			Class443.method7240(class665, (byte) -36);
			break;
		case 270:
			Class610.method10111(class665, -2001091862);
			break;
		case 303:
			Class630.method10429(class665, 1133892764);
			break;
		case 247:
			Class647.method10815(class665, (byte) 11);
			break;
		case 437:
			Class317.method5682(class665, 1870404365);
			break;
		case 2:
			Class390.method6470(class665, -253675153);
			break;
		case 376:
			Class470.method7713(class665, 1343357315);
			break;
		case 514:
			Class628.method10409(class665, -769408387);
			break;
		case 441:
			method8918(class665, -1281769888);
			break;
		case 843:
			Class345.method6092(class665, (byte) 29);
			break;
		case 138:
			Class574.method9625(class665, (byte) -96);
			break;
		case 160:
			Class7.method595(class665, (byte) 0);
			break;
		case 543:
			Class664.method11050(class665, 291323544);
			break;
		case 928:
			Class289.method5224(class665, 231957779);
			break;
		case 30:
			Class177.method3057(class665, 1625514044);
			break;
		case 531:
			Class388.method6454(class665, 1094346906);
			break;
		case 998:
			Class68.method1477(class665, 1930246855);
			break;
		case 445:
			Class492.method7991(class665, (byte) 96);
			break;
		case 554:
			Class287.method5215(class665, 1252985305);
			break;
		case 603:
			Class571.method9601(class665, 608399424);
			break;
		case 380:
			Class696_Sub5.method17403(class665, (byte) -68);
			break;
		case 528:
			Class433.method6965(class665, -2044599636);
			break;
		case 204:
			Class586.method9778(class665, 1769813785);
			break;
		case 272:
			Class258_Sub1.method15715(class665, 505315195);
			break;
		case 1227:
			Class578.method9651(class665, (byte) -102);
			break;
		case 496:
			Class285.method5206(class665, (byte) 7);
			break;
		case 314:
			Class12.method698(class665, (short) 8359);
			break;
		case 872:
			Class314_Sub2_Sub1.method17981(class665, (byte) 31);
			break;
		case 1248:
			Class671.method13781(class665, 2080663684);
			break;
		case 1041:
			Class225.method4189(class665, 1954266166);
			break;
		case 359:
			Class409.method6571(class665, (byte) 22);
			break;
		case 712:
			Class52.method1285(class665, 2059157319);
			break;
		case 238:
			Class373.method6378(class665, -1282468796);
			break;
		case 78:
			Class627.method10393(class665, 1118453930);
			break;
		case 388:
			Class207.method3843(class665, -1595331379);
			break;
		case 1035:
			Class266.method5046(class665, (byte) 5);
			break;
		case 120:
			Class659.method11013(class665, 189491769);
			break;
		case 26:
			Class708.method14378(class665, (byte) -38);
			break;
		case 858:
			Class469.method7697(class665, -1756441774);
			break;
		case 1009:
			Class550.method9111(class665, -1130113060);
			break;
		case 985:
			Class161.method2640(class665, 434302231);
			break;
		case 82:
			Class279.method5170(class665, (byte) 127);
			break;
		case 289:
			Class603.method10023(class665, -1799338966);
			break;
		case 681:
			Class171_Sub1.method14735(class665, -1950853194);
			break;
		case 88:
			Class298.method5515(class665, (byte) 76);
			break;
		case 745:
			Class101.method1790(class665, 1673069904);
			break;
		case 902:
			Class639.method10610(class665, 2092951152);
			break;
		case 650:
			Class335.method5875(class665, (byte) -108);
			break;
		case 1118:
			Class567.method9564(class665, -2003477529);
			break;
		case 1172:
			Class329.method5814(class665, 736548883);
			break;
		case 256:
			Class698.method14272(class665, (byte) -28);
			break;
		case 338:
			Class689.method13997(class665, 1810625447);
			break;
		case 1:
			Class653.method10901(class665, 2018249109);
			break;
		case 736:
			Class527_Sub1.method16018(class665, -1859550260);
			break;
		case 1266:
			Class501.method8192(class665, 36038289);
			break;
		case 369:
			Class593.method9880(class665, 2005976730);
			break;
		case 474:
			IncomingPacket.method6720(class665, 70893904);
			break;
		case 764:
			Class553.method9191(class665, (byte) -25);
			break;
		case 768:
			OutgoingPacket.method6633(class665, -1560393328);
			break;
		case 671:
			Class425.method6730(class665, -1481080962);
			break;
		case 258:
			Class700_Sub19.method17032(class665, (byte) 5);
			break;
		case 220:
			Class599.method9920(class665, (byte) -123);
			break;
		case 834:
			Class413.method6627(class665, 2008639873);
			break;
		case 819:
			Class526.method8731(class665, -1098467303);
			break;
		case 137:
			Class224.method4187(class665, -1678427959);
			break;
		case 61:
			Class174_Sub3.method14629(class665, -1938169371);
			break;
		case 792:
			Class522_Sub3.method15952(class665, 2139533315);
			break;
		case 1202:
			Class509.method8419(class665, (byte) -6);
			break;
		case 812:
			client.method17855(class665, -1177401432);
			break;
		case 455:
			Class398.method6521(class665, -1303199724);
			break;
		case 379:
			Class273.method5122(class665, 1141630113);
			break;
		case 302:
			Class630.method10430(class665, (byte) -1);
			break;
		case 645:
			Class630.method10428(class665, 1564993107);
			break;
		case 166:
			Class524.method8716(class665, -1182311143);
			break;
		case 458:
			Class498.method8165(class665, 961645153);
			break;
		case 1067:
			Class587.method9805(class665, 2093455844);
			break;
		case 1185:
			Class669.method13760(class665, 596995115);
			break;
		case 772:
			Class89.method1632(class665, 1644624064);
			break;
		case 740:
			Class159.method2569(class665, 1938133839);
			break;
		case 200:
			Class183.method3560(class665, 658815736);
			break;
		case 80:
			Class195.method3707(class665, (byte) 3);
			break;
		case 1037:
			Class170_Sub1.method14738(class665, 1419224205);
			break;
		case 174:
			Class205.method3829(class665, 895699831);
			break;
		case 1120:
			Class160_Sub2.method14516(class665, (byte) -45);
			break;
		case 810:
			Class601.method9951(class665, -443765930);
			break;
		case 308:
			Class507.method8255(class665, (byte) 67);
			break;
		case 1193:
			Class591.method9855(class665, 949523843);
			break;
		case 807:
			Class213.method3894(class665, (byte) 0);
			break;
		case 756:
			Class99.method1764(class665, (byte) 90);
			break;
		case 313:
			Class193.method3695(class665, (byte) 0);
			break;
		case 260:
			Class358.method6302(class665, 1769813785);
			break;
		case 1244:
			Class455.method7344(class665, -1764547429);
			break;
		case 504:
			Class700_Sub36.method17276(class665, 2052571954);
			break;
		case 424:
			Class196.method3727(class665, 2068333302);
			break;
		case 36:
			Class620.method10225(class665, (short) 1787);
			break;
		case 997:
			Class153.method2525(class665, 1125197598);
			break;
		case 457:
			Class457.method7446(class665, (byte) -26);
			break;
		case 232:
			Class632.method10471(class665, (byte) 3);
			break;
		case 342:
			Class519.method8655(class665, 747996434);
			break;
		case 148:
			Class31.method885(class665, 1097618702);
			break;
		case 835:
			Class493.method7999(class665, -15286309);
			break;
		case 312:
			Class391.method6479(class665, 416363976);
			break;
		case 859:
			Class231.method4329(class665, 1471857471);
			break;
		case 967:
			Class24_Sub4.method17365(class665, 980420261);
			break;
		case 1071:
			Class295.method5338(class665, -1079592260);
			break;
		case 513:
			Class700_Sub5.method16886(class665, (byte) -27);
			break;
		case 1233:
			Class325.method5751(class665, 1676331191);
			break;
		case 875:
			Class292.method5274(false, class665, (byte) 1);
			break;
		case 1078:
			Class182.method3553(class665, -307938568);
			break;
		case 611:
			Class527_Sub8_Sub5.method18175(class665, 2071235571);
			break;
		case 573:
			Class213.method3895(class665, 2125027364);
			break;
		case 790:
			Class302.method5578(class665, -1650742177);
			break;
		case 1043:
			Class680.method13905(class665, -1052081195);
			break;
		case 962:
			Class61.method1395(class665, (byte) 51);
			break;
		case 950:
			Class677.method13889(class665, (byte) -110);
			break;
		case 814:
			Class311.method5647(class665, 503547467);
			break;
		case 119:
			Class487.method7965(class665, (byte) 20);
			break;
		case 1200:
			Class505.method8225(class665, -2082862060);
			break;
		case 353:
			Class523.method8700(class665, (byte) 89);
			break;
		case 640:
			Class296.method5504(class665, (byte) 84);
			break;
		case 68:
			Class598.method9916(class665, 917748434);
			break;
		case 77:
			Class706.method14354(class665, 1333087538);
			break;
		case 1231:
			Class449.method7283(class665, 657132081);
			break;
		case 494:
			Class305.method5593(class665, -1824394809);
			break;
		case 1163:
			Class700_Sub35.method17267(class665, (byte) 21);
			break;
		case 307:
			Class208_Sub11.method15617(class665, -2014292183);
			break;
		case 830:
			Class579.method9656(class665, (byte) 8);
			break;
		case 608:
			Class223.method4178(class665, 1195393356);
			break;
		case 891:
			Class554.method9216(class665, 60572861);
			break;
		case 976:
			Class459.method7569(class665, 437508011);
			break;
		case 180:
			Class649.method10852(class665, (byte) 60);
			break;
		case 596:
			Class393.method6488(class665, -232197220);
			break;
		case 586:
			Class514.method8492(class665, 2115229682);
			break;
		case 1192:
			Class346.method6159(class665, 548921776);
			break;
		case 271:
			Class196.method3726(class665, (byte) 30);
			break;
		case 1105:
			Class192.method3693(class665, (byte) -38);
			break;
		case 972:
			Class192.method3692(class665, (byte) 13);
			break;
		case 275:
			Class7.method596(class665, (byte) -7);
			break;
		case 560:
			Class46.method1234(class665, -188190117);
			break;
		case 259:
			Class473.method7751(class665, (byte) 5);
			break;
		case 483:
			Class482.method7839(class665, -1966891189);
			break;
		case 709:
			Class514.method8493(class665, (byte) 108);
			break;
		case 484:
			Class411.method6601(class665, -1259050022);
			break;
		case 544:
			Class448.method7275(class665, -1310749686);
			break;
		case 584:
			Class243.method4606(class665, -793435267);
			break;
		case 1000:
			Class262.method4944(class665, 1832814328);
			break;
		case 687:
			Class630.method10427(class665, (byte) 119);
			break;
		case 815:
			Class210.method3874(class665, 1797794778);
			break;
		case 267:
			Class655.method10966(class665, (byte) -56);
			break;
		case 1239:
			Class430.method6875(class665, 1051426007);
			break;
		case 470:
			Class585.method9772(class665, 1827460820);
			break;
		case 323:
			Class527.method8744(class665, -1361971148);
			break;
		case 609:
			Class90.method1643(class665, -90342050);
			break;
		case 1255:
			Class110.method2011(class665, 2105204643);
			break;
		case 1212:
			Class15.method740(class665, 834014455);
			break;
		case 757:
			Class649.method10853(class665, (short) 256);
			break;
		case 782:
			Class310.method5635(class665, (byte) 5);
			break;
		case 221:
			Class268.method5049(class665, (byte) 54);
			break;
		case 7:
			Class382.method6403(class665, (byte) 0);
			break;
		case 607:
			Class660.method11020(class665, -1614650196);
			break;
		case 549:
			Class640_Sub1_Sub1_Sub2.method18680(class665, (byte) 73);
			break;
		case 1191:
			Class601_Sub1.method16682(class665, 1646003636);
			break;
		case 266:
			Class700_Sub1.method16850(class665, -1394977851);
			break;
		case 252:
			Class195.method3710(class665, 1573956238);
			break;
		case 212:
			Class95.method1730(class665, 827020040);
			break;
		case 1213:
			Class483.method7952(class665, (byte) -58);
			break;
		case 505:
			Class385.method6430(class665, 944130636);
			break;
		case 447:
			Class604.method10042(class665, (byte) 0);
			break;
		case 1203:
			Class471.method7731(class665, 110710105);
			break;
		case 857:
			Class633.method10516(class665, 69337256);
			break;
		case 93:
			Class269.method5055(class665, 458656325);
			break;
		case 325:
			Class309.method5628(class665, (byte) -87);
			break;
		case 893:
			Class619.method10217(class665, -1243230713);
			break;
		case 847:
			Class249.method4660(class665, (byte) 32);
			break;
		case 635:
			Class217.method3969(class665, 1676828018);
			break;
		case 752:
			Class587.method9803(class665, -1019000088);
			break;
		case 473:
			Class646_Sub1.method16933(class665, -1742899524);
			break;
		case 883:
			Class552.method9147(class665, -2067314879);
		}
	}

	static final void method8921(Class665 class665, int i) {
		int i_37_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class587 class587 = ((Class587) Class258.aClass24_Sub2_2827.method81(i_37_, -546010440));
		if (class587.anIntArray7730 != null && class587.anIntArray7730.length > 0) {
			int i_38_ = 0;
			int i_39_ = class587.anIntArray7718[0];
			for (int i_40_ = 1; i_40_ < class587.anIntArray7730.length; i_40_++) {
				if (class587.anIntArray7718[i_40_] > i_39_) {
					i_38_ = i_40_;
					i_39_ = class587.anIntArray7718[i_40_];
				}
			}
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = class587.anIntArray7730[i_38_];
		} else
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = class587.anInt7752 * 1266908769;
	}
}
