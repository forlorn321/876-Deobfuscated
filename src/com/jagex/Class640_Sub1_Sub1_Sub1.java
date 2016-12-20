/* Class640_Sub1_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class640_Sub1_Sub1_Sub1 extends Class640_Sub1_Sub1 implements Interface62 {
	boolean aBool11968;
	Class176 aClass176_11969;
	Class527_Sub8_Sub8 aClass527_Sub8_Sub8_11970;
	Class549 aClass549_11971;
	int anInt11972;
	Class24_Sub6 aClass24_Sub6_11973;
	byte aByte11974;
	boolean aBool11975;
	byte aByte11976;
	boolean aBool11977;
	public static Class147 aClass147_11978;

	boolean method17051() {
		if (null != aClass176_11969)
			return !aClass176_11969.method2913();
		return true;
	}

	boolean method17069(int i) {
		if (null != aClass176_11969)
			return !aClass176_11969.method2913();
		return true;
	}

	boolean method17072(int i) {
		if (null != aClass176_11969)
			return aClass176_11969.method2949();
		return false;
	}

	public int method17047(int i) {
		return null != aClass176_11969 ? aClass176_11969.method2896() : 0;
	}

	Class176 method18638(Class180 class180, int i, int i_0_) {
		if (aClass176_11969 != null && class180.method3175(aClass176_11969.method2874(), i) == 0)
			return aClass176_11969;
		Class20 class20 = method18639(class180, i, false, -1814314359);
		if (null != class20)
			return (Class176) class20.anObject205;
		return null;
	}

	Class20 method18639(Class180 class180, int i, boolean bool, int i_1_) {
		Class602 class602 = (Class602) aClass24_Sub6_11973.method81(-1870323439 * anInt11972, -1239871373);
		Class161 class161;
		Class161 class161_2_;
		if (aBool11977) {
			class161 = aClass555_10867.aClass161Array7435[aByte10862];
			class161_2_ = aClass555_10867.aClass161Array7457[0];
		} else {
			class161 = aClass555_10867.aClass161Array7457[aByte10862];
			if (aByte10862 < 3)
				class161_2_ = aClass555_10867.aClass161Array7457[1 + aByte10862];
			else
				class161_2_ = null;
		}
		Class442 class442 = method10637().aClass442_4927;
		return class602.method9960(class180, i, aByte11974, aByte11976, class161, class161_2_, (int) class442.aFloat4918, (int) class442.aFloat4915, (int) class442.aFloat4919, bool, null, 1605202751);
	}

	Class558 method17040(Class180 class180, byte i) {
		if (null == aClass176_11969)
			return null;
		Class432 class432 = class180.method3172();
		class432.method6899(method10612());
		class432.method6896((float) aShort11740, 0.0F, (float) aShort11741);
		Class558 class558 = Class171_Sub1.method14736(aBool11968, -769712956);
		Class439 class439 = (((Class602) aClass24_Sub6_11973.method81(-1870323439 * anInt11972, -66301789)).aClass439_7950);
		if (null != class439) {
			aClass176_11969.method2889(class432, null, 0);
			class180.method3536(class432, aClass169Array10863[0], class439);
		} else
			aClass176_11969.method2889(class432, aClass169Array10863[0], 0);
		return class558;
	}

	public int method51() {
		return anInt11972 * -1870323439;
	}

	boolean method17053() {
		if (null != aClass176_11969)
			return aClass176_11969.method2949();
		return false;
	}

	boolean method17033(Class180 class180, int i, int i_3_, byte i_4_) {
		Class439 class439 = (((Class602) aClass24_Sub6_11973.method81(anInt11972 * -1870323439, -233906123)).aClass439_7950);
		if (null != class439)
			return class180.method3155(i, i_3_, method10612(), class439, -867329631);
		Class176 class176 = method18638(class180, 131072, -447952710);
		if (null != class176) {
			Class432 class432 = method10612();
			return class176.method3051(i, i_3_, class432, false, 0);
		}
		return false;
	}

	public int method64(int i) {
		return anInt11972 * -1870323439;
	}

	public int method77(int i) {
		return aByte11974;
	}

	public int method396(int i) {
		return aByte11976;
	}

	public void method353() {
		if (aClass176_11969 != null)
			aClass176_11969.method2895();
	}

	public void method397(Class180 class180) {
		Object object = null;
		Class527_Sub8_Sub8 class527_sub8_sub8;
		if (aClass527_Sub8_Sub8_11970 == null && aBool11975) {
			Class20 class20 = method18639(class180, 262144, true, -1814314359);
			class527_sub8_sub8 = (Class527_Sub8_Sub8) (class20 != null ? class20.anObject204 : null);
		} else {
			class527_sub8_sub8 = aClass527_Sub8_Sub8_11970;
			aClass527_Sub8_Sub8_11970 = null;
		}
		Class442 class442 = method10637().aClass442_4927;
		if (class527_sub8_sub8 != null)
			aClass555_10867.method9267(class527_sub8_sub8, aByte10862, (int) class442.aFloat4918, (int) class442.aFloat4919, null, 1705761064);
	}

	void method17081(Class180 class180, int i) {
		/* empty */
	}

	public void method400(Class180 class180, int i) {
		Object object = null;
		Class527_Sub8_Sub8 class527_sub8_sub8;
		if (aClass527_Sub8_Sub8_11970 == null && aBool11975) {
			Class20 class20 = method18639(class180, 262144, true, -1814314359);
			class527_sub8_sub8 = (Class527_Sub8_Sub8) (class20 != null ? class20.anObject204 : null);
		} else {
			class527_sub8_sub8 = aClass527_Sub8_Sub8_11970;
			aClass527_Sub8_Sub8_11970 = null;
		}
		Class442 class442 = method10637().aClass442_4927;
		if (class527_sub8_sub8 != null)
			aClass555_10867.method9267(class527_sub8_sub8, aByte10862, (int) class442.aFloat4918, (int) class442.aFloat4919, null, 1576370361);
	}

	void method17056(Class180 class180) {
		/* empty */
	}

	public boolean method398(int i) {
		return aBool11975;
	}

	public int method88() {
		return anInt11972 * -1870323439;
	}

	public void method395(byte i) {
		if (aClass176_11969 != null)
			aClass176_11969.method2895();
	}

	Class20 method18640(Class180 class180, int i, boolean bool) {
		Class602 class602 = (Class602) aClass24_Sub6_11973.method81(-1870323439 * anInt11972, 1456781069);
		Class161 class161;
		Class161 class161_5_;
		if (aBool11977) {
			class161 = aClass555_10867.aClass161Array7435[aByte10862];
			class161_5_ = aClass555_10867.aClass161Array7457[0];
		} else {
			class161 = aClass555_10867.aClass161Array7457[aByte10862];
			if (aByte10862 < 3)
				class161_5_ = aClass555_10867.aClass161Array7457[1 + aByte10862];
			else
				class161_5_ = null;
		}
		Class442 class442 = method10637().aClass442_4927;
		return class602.method9960(class180, i, aByte11974, aByte11976, class161, class161_5_, (int) class442.aFloat4918, (int) class442.aFloat4915, (int) class442.aFloat4919, bool, null, 1605202751);
	}

	public int method403() {
		return aByte11976;
	}

	public Class549 method17042(Class180 class180, int i) {
		Class442 class442 = method10637().aClass442_4927;
		if (aClass549_11971 == null)
			aClass549_11971 = Class174.method2797((int) class442.aFloat4918, (int) class442.aFloat4915, (int) class442.aFloat4919, method18638(class180, 0, -447952710), 2147483647);
		return aClass549_11971;
	}

	public void method347() {
		if (aClass176_11969 != null)
			aClass176_11969.method2895();
	}

	void method17071(Class180 class180) {
		/* empty */
	}

	public int method194() {
		return aByte11974;
	}

	public boolean method405() {
		return aBool11975;
	}

	public boolean method399(int i) {
		return true;
	}

	public int method406() {
		return aByte11976;
	}

	public void method394(Class180 class180) {
		Object object = null;
		Class527_Sub8_Sub8 class527_sub8_sub8;
		if (aClass527_Sub8_Sub8_11970 == null && aBool11975) {
			Class20 class20 = method18639(class180, 262144, true, -1814314359);
			class527_sub8_sub8 = (Class527_Sub8_Sub8) (class20 != null ? class20.anObject204 : null);
		} else {
			class527_sub8_sub8 = aClass527_Sub8_Sub8_11970;
			aClass527_Sub8_Sub8_11970 = null;
		}
		Class442 class442 = method10637().aClass442_4927;
		if (class527_sub8_sub8 != null)
			aClass555_10867.method9267(class527_sub8_sub8, aByte10862, (int) class442.aFloat4918, (int) class442.aFloat4919, null, 1568086774);
	}

	public void method407(Class180 class180) {
		Object object = null;
		Class527_Sub8_Sub8 class527_sub8_sub8;
		if (aClass527_Sub8_Sub8_11970 == null && aBool11975) {
			Class20 class20 = method18639(class180, 262144, true, -1814314359);
			class527_sub8_sub8 = (Class527_Sub8_Sub8) (class20 != null ? class20.anObject204 : null);
		} else {
			class527_sub8_sub8 = aClass527_Sub8_Sub8_11970;
			aClass527_Sub8_Sub8_11970 = null;
		}
		Class442 class442 = method10637().aClass442_4927;
		if (class527_sub8_sub8 != null)
			aClass555_10867.method9267(class527_sub8_sub8, aByte10862, (int) class442.aFloat4918, (int) class442.aFloat4919, null, 1888962046);
	}

	public boolean method404() {
		return aBool11975;
	}

	public void method409(Class180 class180) {
		Object object = null;
		Class527_Sub8_Sub8 class527_sub8_sub8;
		if (aClass527_Sub8_Sub8_11970 == null && aBool11975) {
			Class20 class20 = method18639(class180, 262144, true, -1814314359);
			class527_sub8_sub8 = (Class527_Sub8_Sub8) (class20 != null ? class20.anObject204 : null);
		} else {
			class527_sub8_sub8 = aClass527_Sub8_Sub8_11970;
			aClass527_Sub8_Sub8_11970 = null;
		}
		Class442 class442 = method10637().aClass442_4927;
		if (null != class527_sub8_sub8)
			aClass555_10867.method9268(class527_sub8_sub8, aByte10862, (int) class442.aFloat4918, (int) class442.aFloat4919, null, (byte) 83);
	}

	public Class549 method17058(Class180 class180) {
		Class442 class442 = method10637().aClass442_4927;
		if (aClass549_11971 == null)
			aClass549_11971 = Class174.method2797((int) class442.aFloat4918, (int) class442.aFloat4915, (int) class442.aFloat4919, method18638(class180, 0, -447952710), 2147483647);
		return aClass549_11971;
	}

	boolean method17052() {
		if (null != aClass176_11969)
			return !aClass176_11969.method2913();
		return true;
	}

	public void method401(Class180 class180, int i) {
		Object object = null;
		Class527_Sub8_Sub8 class527_sub8_sub8;
		if (aClass527_Sub8_Sub8_11970 == null && aBool11975) {
			Class20 class20 = method18639(class180, 262144, true, -1814314359);
			class527_sub8_sub8 = (Class527_Sub8_Sub8) (class20 != null ? class20.anObject204 : null);
		} else {
			class527_sub8_sub8 = aClass527_Sub8_Sub8_11970;
			aClass527_Sub8_Sub8_11970 = null;
		}
		Class442 class442 = method10637().aClass442_4927;
		if (null != class527_sub8_sub8)
			aClass555_10867.method9268(class527_sub8_sub8, aByte10862, (int) class442.aFloat4918, (int) class442.aFloat4919, null, (byte) 121);
	}

	boolean method17048() {
		if (null != aClass176_11969)
			return aClass176_11969.method2949();
		return false;
	}

	public void method402(Class180 class180) {
		Object object = null;
		Class527_Sub8_Sub8 class527_sub8_sub8;
		if (aClass527_Sub8_Sub8_11970 == null && aBool11975) {
			Class20 class20 = method18639(class180, 262144, true, -1814314359);
			class527_sub8_sub8 = (Class527_Sub8_Sub8) (class20 != null ? class20.anObject204 : null);
		} else {
			class527_sub8_sub8 = aClass527_Sub8_Sub8_11970;
			aClass527_Sub8_Sub8_11970 = null;
		}
		Class442 class442 = method10637().aClass442_4927;
		if (null != class527_sub8_sub8)
			aClass555_10867.method9268(class527_sub8_sub8, aByte10862, (int) class442.aFloat4918, (int) class442.aFloat4919, null, (byte) 58);
	}

	public Class549 method17085(Class180 class180) {
		Class442 class442 = method10637().aClass442_4927;
		if (aClass549_11971 == null)
			aClass549_11971 = Class174.method2797((int) class442.aFloat4918, (int) class442.aFloat4915, (int) class442.aFloat4919, method18638(class180, 0, -447952710), 2147483647);
		return aClass549_11971;
	}

	public Class549 method17057(Class180 class180) {
		Class442 class442 = method10637().aClass442_4927;
		if (aClass549_11971 == null)
			aClass549_11971 = Class174.method2797((int) class442.aFloat4918, (int) class442.aFloat4915, (int) class442.aFloat4919, method18638(class180, 0, -447952710), 2147483647);
		return aClass549_11971;
	}

	public Class549 method17064(Class180 class180) {
		Class442 class442 = method10637().aClass442_4927;
		if (aClass549_11971 == null)
			aClass549_11971 = Class174.method2797((int) class442.aFloat4918, (int) class442.aFloat4915, (int) class442.aFloat4919, method18638(class180, 0, -447952710), 2147483647);
		return aClass549_11971;
	}

	Class558 method17070(Class180 class180) {
		if (null == aClass176_11969)
			return null;
		Class432 class432 = class180.method3172();
		class432.method6899(method10612());
		class432.method6896((float) aShort11740, 0.0F, (float) aShort11741);
		Class558 class558 = Class171_Sub1.method14736(aBool11968, -435754315);
		Class439 class439 = (((Class602) aClass24_Sub6_11973.method81(-1870323439 * anInt11972, -1970760106)).aClass439_7950);
		if (null != class439) {
			aClass176_11969.method2889(class432, null, 0);
			class180.method3536(class432, aClass169Array10863[0], class439);
		} else
			aClass176_11969.method2889(class432, aClass169Array10863[0], 0);
		return class558;
	}

	Class558 method17063(Class180 class180) {
		if (null == aClass176_11969)
			return null;
		Class432 class432 = class180.method3172();
		class432.method6899(method10612());
		class432.method6896((float) aShort11740, 0.0F, (float) aShort11741);
		Class558 class558 = Class171_Sub1.method14736(aBool11968, 1703000321);
		Class439 class439 = (((Class602) aClass24_Sub6_11973.method81(-1870323439 * anInt11972, -768043927)).aClass439_7950);
		if (null != class439) {
			aClass176_11969.method2889(class432, null, 0);
			class180.method3536(class432, aClass169Array10863[0], class439);
		} else
			aClass176_11969.method2889(class432, aClass169Array10863[0], 0);
		return class558;
	}

	public int method408() {
		return aByte11974;
	}

	public boolean method316() {
		return true;
	}

	boolean method17066(Class180 class180, int i, int i_6_) {
		Class439 class439 = (((Class602) aClass24_Sub6_11973.method81(anInt11972 * -1870323439, -1875366685)).aClass439_7950);
		if (null != class439)
			return class180.method3155(i, i_6_, method10612(), class439, -867329631);
		Class176 class176 = method18638(class180, 131072, -447952710);
		if (null != class176) {
			Class432 class432 = method10612();
			return class176.method3051(i, i_6_, class432, false, 0);
		}
		return false;
	}

	public Class640_Sub1_Sub1_Sub1(Class555 class555, Class180 class180, Class24_Sub6 class24_sub6, Class602 class602, int i, int i_7_, int i_8_, int i_9_, int i_10_, boolean bool, int i_11_, int i_12_, int i_13_, int i_14_) {
		super(class555, i_8_, i_9_, i_10_, i, i_7_, i_11_, i_12_);
		aClass24_Sub6_11973 = class24_sub6;
		anInt11972 = -1080432077 * class602.anInt7873;
		aBool11977 = bool;
		aByte11976 = (byte) i_14_;
		aByte11974 = (byte) i_13_;
		aBool11968 = 0 != -1508648055 * class602.anInt7898 && !bool;
		aBool11975 = (class180.method3381() && class602.aBool7940 && !aBool11977 && Class204.aClass527_Sub31_2213.aClass700_Sub1_10603.method16843(-964315881) != 0);
		int i_15_ = 2048;
		if (class602.aBool7948)
			i_15_ |= 0x80000;
		Class20 class20 = method18639(class180, i_15_, aBool11975, -1814314359);
		if (null != class20) {
			aClass176_11969 = (Class176) class20.anObject205;
			aClass527_Sub8_Sub8_11970 = (Class527_Sub8_Sub8) class20.anObject204;
			if (class602.aBool7948) {
				aClass176_11969 = aClass176_11969.method2862((byte) 0, i_15_, false);
				if (class602.aBool7948) {
					Class512 class512 = client.aClass509_11072.method8287(-1201338636);
					aClass176_11969.method2986(-10813755 * class512.anInt7004, -2041402825 * class512.anInt7005, -1759590251 * class512.anInt7007, -1205510909 * class512.anInt7006);
				}
			}
		}
		method17050(1, (short) 29064);
	}

	Class176 method18641(Class180 class180, int i) {
		if (aClass176_11969 != null && class180.method3175(aClass176_11969.method2874(), i) == 0)
			return aClass176_11969;
		Class20 class20 = method18639(class180, i, false, -1814314359);
		if (null != class20)
			return (Class176) class20.anObject205;
		return null;
	}

	public int method17076() {
		return null != aClass176_11969 ? aClass176_11969.method2896() : 0;
	}
}
