/* Class640_Sub1_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class640_Sub1_Sub3_Sub1 extends Class640_Sub1_Sub3 implements Interface62 {
	boolean aBool11979;
	int anInt11980;
	static int[] anIntArray11981 = { 1, 2, 4, 8 };
	static int[] anIntArray11982 = { 16, 32, 64, 128 };
	Class527_Sub8_Sub8 aClass527_Sub8_Sub8_11983;
	Class176 aClass176_11984;
	Class24_Sub6 aClass24_Sub6_11985;
	byte aByte11986;
	byte aByte11987;
	boolean aBool11988;
	boolean aBool11989;
	Class549 aClass549_11990;
	boolean aBool11991;

	public boolean method316() {
		return true;
	}

	boolean method17069(int i) {
		if (null != aClass176_11984)
			return !aClass176_11984.method2913();
		return true;
	}

	public void method395(byte i) {
		if (null != aClass176_11984)
			aClass176_11984.method2895();
	}

	public int method17047(int i) {
		return aClass176_11984 != null ? aClass176_11984.method2896() : 0;
	}

	Class176 method18642(Class180 class180, int i, byte i_0_) {
		if (null != aClass176_11984 && class180.method3175(aClass176_11984.method2874(), i) == 0)
			return aClass176_11984;
		Class20 class20 = method18643(class180, i, false, -2060040161);
		if (null != class20)
			return (Class176) class20.anObject205;
		return null;
	}

	Class20 method18643(Class180 class180, int i, boolean bool, int i_1_) {
		Class602 class602 = (Class602) aClass24_Sub6_11985.method81(anInt11980 * -1859753351, 326698599);
		Class161 class161;
		Class161 class161_2_;
		if (aBool11979) {
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
		return class602.method9960(class180, i, aByte11987, aByte11986, class161, class161_2_, (int) class442.aFloat4918, (int) class442.aFloat4915, (int) class442.aFloat4919, bool, null, 1605202751);
	}

	public Class549 method17042(Class180 class180, int i) {
		Class442 class442 = method10637().aClass442_4927;
		if (null == aClass549_11990)
			aClass549_11990 = Class174.method2797((int) class442.aFloat4918, (int) class442.aFloat4915, (int) class442.aFloat4919, method18642(class180, 0, (byte) 76), 2147483647);
		return aClass549_11990;
	}

	public int method17076() {
		return aClass176_11984 != null ? aClass176_11984.method2896() : 0;
	}

	void method17081(Class180 class180, int i) {
		/* empty */
	}

	Class176 method18644(Class180 class180, int i) {
		if (null != aClass176_11984 && class180.method3175(aClass176_11984.method2874(), i) == 0)
			return aClass176_11984;
		Class20 class20 = method18643(class180, i, false, -2055924709);
		if (null != class20)
			return (Class176) class20.anObject205;
		return null;
	}

	boolean method17037(int i) {
		return aBool11988;
	}

	void method17038(Class180 class180, Class640_Sub1 class640_sub1, int i, int i_3_, int i_4_, boolean bool, int i_5_) {
		if (class640_sub1 instanceof Class640_Sub1_Sub3_Sub1) {
			Class640_Sub1_Sub3_Sub1 class640_sub1_sub3_sub1_6_ = (Class640_Sub1_Sub3_Sub1) class640_sub1;
			if (aClass176_11984 != null && null != class640_sub1_sub3_sub1_6_.aClass176_11984)
				aClass176_11984.method2881((class640_sub1_sub3_sub1_6_.aClass176_11984), i, i_3_, i_4_, bool);
		} else if (class640_sub1 instanceof Class640_Sub1_Sub2_Sub3) {
			Class640_Sub1_Sub2_Sub3 class640_sub1_sub2_sub3 = (Class640_Sub1_Sub2_Sub3) class640_sub1;
			if (null != aClass176_11984 && null != class640_sub1_sub2_sub3.aClass176_12022)
				aClass176_11984.method2881((class640_sub1_sub2_sub3.aClass176_12022), i, i_3_, i_4_, bool);
		}
	}

	void method17039(int i) {
		aBool11988 = false;
		if (null != aClass176_11984)
			aClass176_11984.method2941(aClass176_11984.method2874() & ~0x10000);
	}

	public int method64(int i) {
		return -1859753351 * anInt11980;
	}

	boolean method17067() {
		return aBool11988;
	}

	Class558 method17070(Class180 class180) {
		if (null == aClass176_11984)
			return null;
		Class432 class432 = method10612();
		Class558 class558 = Class171_Sub1.method14736(aBool11989, -532891);
		Class439 class439 = (((Class602) aClass24_Sub6_11985.method81(-1859753351 * anInt11980, -1362064291)).aClass439_7950);
		if (null != class439) {
			aClass176_11984.method2889(class432, null, 0);
			class180.method3536(class432, aClass169Array10863[0], class439);
		} else
			aClass176_11984.method2889(class432, aClass169Array10863[0], 0);
		return class558;
	}

	public boolean method398(int i) {
		return aBool11991;
	}

	Class558 method17040(Class180 class180, byte i) {
		if (null == aClass176_11984)
			return null;
		Class432 class432 = method10612();
		Class558 class558 = Class171_Sub1.method14736(aBool11989, -1773805740);
		Class439 class439 = (((Class602) aClass24_Sub6_11985.method81(-1859753351 * anInt11980, 1217073702)).aClass439_7950);
		if (null != class439) {
			aClass176_11984.method2889(class432, null, 0);
			class180.method3536(class432, aClass169Array10863[0], class439);
		} else
			aClass176_11984.method2889(class432, aClass169Array10863[0], 0);
		return class558;
	}

	boolean method17072(int i) {
		if (aClass176_11984 != null)
			return aClass176_11984.method2949();
		return false;
	}

	public void method400(Class180 class180, int i) {
		Object object = null;
		Class527_Sub8_Sub8 class527_sub8_sub8;
		if (null == aClass527_Sub8_Sub8_11983 && aBool11991) {
			Class20 class20 = method18643(class180, 262144, true, -2068422400);
			class527_sub8_sub8 = (Class527_Sub8_Sub8) (class20 != null ? class20.anObject204 : null);
		} else {
			class527_sub8_sub8 = aClass527_Sub8_Sub8_11983;
			aClass527_Sub8_Sub8_11983 = null;
		}
		Class442 class442 = method10637().aClass442_4927;
		if (class527_sub8_sub8 != null)
			aClass555_10867.method9267(class527_sub8_sub8, aByte10862, (int) class442.aFloat4918, (int) class442.aFloat4919, null, 1476869071);
	}

	public void method401(Class180 class180, int i) {
		Object object = null;
		Class527_Sub8_Sub8 class527_sub8_sub8;
		if (null == aClass527_Sub8_Sub8_11983 && aBool11991) {
			Class20 class20 = method18643(class180, 262144, true, -2095559548);
			class527_sub8_sub8 = (Class527_Sub8_Sub8) (null != class20 ? class20.anObject204 : null);
		} else {
			class527_sub8_sub8 = aClass527_Sub8_Sub8_11983;
			aClass527_Sub8_Sub8_11983 = null;
		}
		Class442 class442 = method10637().aClass442_4927;
		if (null != class527_sub8_sub8)
			aClass555_10867.method9268(class527_sub8_sub8, aByte10862, (int) class442.aFloat4918, (int) class442.aFloat4919, null, (byte) 83);
	}

	public void method409(Class180 class180) {
		Object object = null;
		Class527_Sub8_Sub8 class527_sub8_sub8;
		if (null == aClass527_Sub8_Sub8_11983 && aBool11991) {
			Class20 class20 = method18643(class180, 262144, true, -2113430950);
			class527_sub8_sub8 = (Class527_Sub8_Sub8) (null != class20 ? class20.anObject204 : null);
		} else {
			class527_sub8_sub8 = aClass527_Sub8_Sub8_11983;
			aClass527_Sub8_Sub8_11983 = null;
		}
		Class442 class442 = method10637().aClass442_4927;
		if (null != class527_sub8_sub8)
			aClass555_10867.method9268(class527_sub8_sub8, aByte10862, (int) class442.aFloat4918, (int) class442.aFloat4919, null, (byte) 89);
	}

	boolean method17033(Class180 class180, int i, int i_7_, byte i_8_) {
		Class439 class439 = (((Class602) aClass24_Sub6_11985.method81(anInt11980 * -1859753351, -1539392981)).aClass439_7950);
		if (null != class439)
			return class180.method3155(i, i_7_, method10612(), class439, -867329631);
		Class176 class176 = method18642(class180, 131072, (byte) 30);
		if (class176 != null) {
			Class432 class432 = method10612();
			return class176.method3051(i, i_7_, class432, false, 0);
		}
		return false;
	}

	public int method194() {
		return aByte11987;
	}

	public int method408() {
		return aByte11987;
	}

	public Class549 method17058(Class180 class180) {
		Class442 class442 = method10637().aClass442_4927;
		if (null == aClass549_11990)
			aClass549_11990 = Class174.method2797((int) class442.aFloat4918, (int) class442.aFloat4915, (int) class442.aFloat4919, method18642(class180, 0, (byte) 98), 2147483647);
		return aClass549_11990;
	}

	public int method406() {
		return aByte11986;
	}

	public int method403() {
		return aByte11986;
	}

	public void method353() {
		if (null != aClass176_11984)
			aClass176_11984.method2895();
	}

	public boolean method404() {
		return aBool11991;
	}

	public boolean method405() {
		return aBool11991;
	}

	void method17041(Class180 class180, Class640_Sub1 class640_sub1, int i, int i_9_, int i_10_, boolean bool) {
		if (class640_sub1 instanceof Class640_Sub1_Sub3_Sub1) {
			Class640_Sub1_Sub3_Sub1 class640_sub1_sub3_sub1_11_ = (Class640_Sub1_Sub3_Sub1) class640_sub1;
			if (aClass176_11984 != null && null != class640_sub1_sub3_sub1_11_.aClass176_11984)
				aClass176_11984.method2881((class640_sub1_sub3_sub1_11_.aClass176_11984), i, i_9_, i_10_, bool);
		} else if (class640_sub1 instanceof Class640_Sub1_Sub2_Sub3) {
			Class640_Sub1_Sub2_Sub3 class640_sub1_sub2_sub3 = (Class640_Sub1_Sub2_Sub3) class640_sub1;
			if (null != aClass176_11984 && null != class640_sub1_sub2_sub3.aClass176_12022)
				aClass176_11984.method2881((class640_sub1_sub2_sub3.aClass176_12022), i, i_9_, i_10_, bool);
		}
	}

	public void method397(Class180 class180) {
		Object object = null;
		Class527_Sub8_Sub8 class527_sub8_sub8;
		if (null == aClass527_Sub8_Sub8_11983 && aBool11991) {
			Class20 class20 = method18643(class180, 262144, true, -2029972541);
			class527_sub8_sub8 = (Class527_Sub8_Sub8) (class20 != null ? class20.anObject204 : null);
		} else {
			class527_sub8_sub8 = aClass527_Sub8_Sub8_11983;
			aClass527_Sub8_Sub8_11983 = null;
		}
		Class442 class442 = method10637().aClass442_4927;
		if (class527_sub8_sub8 != null)
			aClass555_10867.method9267(class527_sub8_sub8, aByte10862, (int) class442.aFloat4918, (int) class442.aFloat4919, null, 1827399893);
	}

	public void method394(Class180 class180) {
		Object object = null;
		Class527_Sub8_Sub8 class527_sub8_sub8;
		if (null == aClass527_Sub8_Sub8_11983 && aBool11991) {
			Class20 class20 = method18643(class180, 262144, true, -2130937658);
			class527_sub8_sub8 = (Class527_Sub8_Sub8) (class20 != null ? class20.anObject204 : null);
		} else {
			class527_sub8_sub8 = aClass527_Sub8_Sub8_11983;
			aClass527_Sub8_Sub8_11983 = null;
		}
		Class442 class442 = method10637().aClass442_4927;
		if (class527_sub8_sub8 != null)
			aClass555_10867.method9267(class527_sub8_sub8, aByte10862, (int) class442.aFloat4918, (int) class442.aFloat4919, null, 2120259549);
	}

	Class20 method18645(Class180 class180, int i, boolean bool) {
		Class602 class602 = (Class602) aClass24_Sub6_11985.method81(anInt11980 * -1859753351, -743564547);
		Class161 class161;
		Class161 class161_12_;
		if (aBool11979) {
			class161 = aClass555_10867.aClass161Array7435[aByte10862];
			class161_12_ = aClass555_10867.aClass161Array7457[0];
		} else {
			class161 = aClass555_10867.aClass161Array7457[aByte10862];
			if (aByte10862 < 3)
				class161_12_ = aClass555_10867.aClass161Array7457[1 + aByte10862];
			else
				class161_12_ = null;
		}
		Class442 class442 = method10637().aClass442_4927;
		return class602.method9960(class180, i, aByte11987, aByte11986, class161, class161_12_, (int) class442.aFloat4918, (int) class442.aFloat4915, (int) class442.aFloat4919, bool, null, 1605202751);
	}

	boolean method17051() {
		if (null != aClass176_11984)
			return !aClass176_11984.method2913();
		return true;
	}

	public int method77(int i) {
		return aByte11987;
	}

	public void method347() {
		if (null != aClass176_11984)
			aClass176_11984.method2895();
	}

	boolean method17052() {
		if (null != aClass176_11984)
			return !aClass176_11984.method2913();
		return true;
	}

	boolean method17053() {
		if (aClass176_11984 != null)
			return aClass176_11984.method2949();
		return false;
	}

	boolean method17048() {
		if (aClass176_11984 != null)
			return aClass176_11984.method2949();
		return false;
	}

	public Class549 method17064(Class180 class180) {
		Class442 class442 = method10637().aClass442_4927;
		if (null == aClass549_11990)
			aClass549_11990 = Class174.method2797((int) class442.aFloat4918, (int) class442.aFloat4915, (int) class442.aFloat4919, method18642(class180, 0, (byte) 92), 2147483647);
		return aClass549_11990;
	}

	public Class549 method17085(Class180 class180) {
		Class442 class442 = method10637().aClass442_4927;
		if (null == aClass549_11990)
			aClass549_11990 = Class174.method2797((int) class442.aFloat4918, (int) class442.aFloat4915, (int) class442.aFloat4919, method18642(class180, 0, (byte) 106), 2147483647);
		return aClass549_11990;
	}

	public Class549 method17057(Class180 class180) {
		Class442 class442 = method10637().aClass442_4927;
		if (null == aClass549_11990)
			aClass549_11990 = Class174.method2797((int) class442.aFloat4918, (int) class442.aFloat4915, (int) class442.aFloat4919, method18642(class180, 0, (byte) 100), 2147483647);
		return aClass549_11990;
	}

	public void method402(Class180 class180) {
		Object object = null;
		Class527_Sub8_Sub8 class527_sub8_sub8;
		if (null == aClass527_Sub8_Sub8_11983 && aBool11991) {
			Class20 class20 = method18643(class180, 262144, true, -2135328859);
			class527_sub8_sub8 = (Class527_Sub8_Sub8) (null != class20 ? class20.anObject204 : null);
		} else {
			class527_sub8_sub8 = aClass527_Sub8_Sub8_11983;
			aClass527_Sub8_Sub8_11983 = null;
		}
		Class442 class442 = method10637().aClass442_4927;
		if (null != class527_sub8_sub8)
			aClass555_10867.method9268(class527_sub8_sub8, aByte10862, (int) class442.aFloat4918, (int) class442.aFloat4919, null, (byte) 98);
	}

	public boolean method399(int i) {
		return true;
	}

	Class558 method17063(Class180 class180) {
		if (null == aClass176_11984)
			return null;
		Class432 class432 = method10612();
		Class558 class558 = Class171_Sub1.method14736(aBool11989, 43447052);
		Class439 class439 = (((Class602) aClass24_Sub6_11985.method81(-1859753351 * anInt11980, -1625634110)).aClass439_7950);
		if (null != class439) {
			aClass176_11984.method2889(class432, null, 0);
			class180.method3536(class432, aClass169Array10863[0], class439);
		} else
			aClass176_11984.method2889(class432, aClass169Array10863[0], 0);
		return class558;
	}

	void method17056(Class180 class180) {
		/* empty */
	}

	void method17071(Class180 class180) {
		/* empty */
	}

	boolean method17066(Class180 class180, int i, int i_13_) {
		Class439 class439 = (((Class602) aClass24_Sub6_11985.method81(anInt11980 * -1859753351, 1705890846)).aClass439_7950);
		if (null != class439)
			return class180.method3155(i, i_13_, method10612(), class439, -867329631);
		Class176 class176 = method18642(class180, 131072, (byte) 62);
		if (class176 != null) {
			Class432 class432 = method10612();
			return class176.method3051(i, i_13_, class432, false, 0);
		}
		return false;
	}

	public void method407(Class180 class180) {
		Object object = null;
		Class527_Sub8_Sub8 class527_sub8_sub8;
		if (null == aClass527_Sub8_Sub8_11983 && aBool11991) {
			Class20 class20 = method18643(class180, 262144, true, -2128886565);
			class527_sub8_sub8 = (Class527_Sub8_Sub8) (class20 != null ? class20.anObject204 : null);
		} else {
			class527_sub8_sub8 = aClass527_Sub8_Sub8_11983;
			aClass527_Sub8_Sub8_11983 = null;
		}
		Class442 class442 = method10637().aClass442_4927;
		if (class527_sub8_sub8 != null)
			aClass555_10867.method9267(class527_sub8_sub8, aByte10862, (int) class442.aFloat4918, (int) class442.aFloat4919, null, 1792238625);
	}

	boolean method17045() {
		return aBool11988;
	}

	public Class640_Sub1_Sub3_Sub1(Class555 class555, Class180 class180, Class24_Sub6 class24_sub6, Class602 class602, int i, int i_14_, int i_15_, int i_16_, int i_17_, boolean bool, int i_18_, int i_19_, boolean bool_20_) {
		super(class555, i_15_, i_16_, i_17_, i, i_14_, Class187.method3661(i_18_, i_19_, 772988220));
		aClass24_Sub6_11985 = class24_sub6;
		anInt11980 = class602.anInt7873 * 860138171;
		aBool11979 = bool;
		aByte11987 = (byte) i_18_;
		aByte11986 = (byte) i_19_;
		aBool11989 = 0 != -1508648055 * class602.anInt7898 && !bool;
		aBool11988 = bool_20_;
		aBool11991 = (class180.method3381() && class602.aBool7940 && !aBool11979 && Class204.aClass527_Sub31_2213.aClass700_Sub1_10603.method16843(1034973458) != 0);
		int i_21_ = 2048;
		if (aBool11988)
			i_21_ |= 0x10000;
		if (class602.aBool7948)
			i_21_ |= 0x80000;
		Class20 class20 = method18643(class180, i_21_, aBool11991, -2105754600);
		if (class20 != null) {
			aClass176_11984 = (Class176) class20.anObject205;
			aClass527_Sub8_Sub8_11983 = (Class527_Sub8_Sub8) class20.anObject204;
			if (aBool11988 || class602.aBool7948) {
				aClass176_11984 = aClass176_11984.method2862((byte) 0, i_21_, false);
				if (class602.aBool7948) {
					Class512 class512 = client.aClass509_11072.method8287(-1201338636);
					aClass176_11984.method2986(class512.anInt7004 * -10813755, -2041402825 * class512.anInt7005, class512.anInt7007 * -1759590251, class512.anInt7006 * -1205510909);
				}
			}
		}
		method17050(1, (short) 27877);
	}

	public int method396(int i) {
		return aByte11986;
	}

	void method17062(Class180 class180, Class640_Sub1 class640_sub1, int i, int i_22_, int i_23_, boolean bool) {
		if (class640_sub1 instanceof Class640_Sub1_Sub3_Sub1) {
			Class640_Sub1_Sub3_Sub1 class640_sub1_sub3_sub1_24_ = (Class640_Sub1_Sub3_Sub1) class640_sub1;
			if (aClass176_11984 != null && null != class640_sub1_sub3_sub1_24_.aClass176_11984)
				aClass176_11984.method2881((class640_sub1_sub3_sub1_24_.aClass176_11984), i, i_22_, i_23_, bool);
		} else if (class640_sub1 instanceof Class640_Sub1_Sub2_Sub3) {
			Class640_Sub1_Sub2_Sub3 class640_sub1_sub2_sub3 = (Class640_Sub1_Sub2_Sub3) class640_sub1;
			if (null != aClass176_11984 && null != class640_sub1_sub2_sub3.aClass176_12022)
				aClass176_11984.method2881((class640_sub1_sub2_sub3.aClass176_12022), i, i_22_, i_23_, bool);
		}
	}

	boolean method17068() {
		return aBool11988;
	}

	void method17073(Class180 class180, Class640_Sub1 class640_sub1, int i, int i_25_, int i_26_, boolean bool) {
		if (class640_sub1 instanceof Class640_Sub1_Sub3_Sub1) {
			Class640_Sub1_Sub3_Sub1 class640_sub1_sub3_sub1_27_ = (Class640_Sub1_Sub3_Sub1) class640_sub1;
			if (aClass176_11984 != null && null != class640_sub1_sub3_sub1_27_.aClass176_11984)
				aClass176_11984.method2881((class640_sub1_sub3_sub1_27_.aClass176_11984), i, i_25_, i_26_, bool);
		} else if (class640_sub1 instanceof Class640_Sub1_Sub2_Sub3) {
			Class640_Sub1_Sub2_Sub3 class640_sub1_sub2_sub3 = (Class640_Sub1_Sub2_Sub3) class640_sub1;
			if (null != aClass176_11984 && null != class640_sub1_sub2_sub3.aClass176_12022)
				aClass176_11984.method2881((class640_sub1_sub2_sub3.aClass176_12022), i, i_25_, i_26_, bool);
		}
	}

	void method17074() {
		aBool11988 = false;
		if (null != aClass176_11984)
			aClass176_11984.method2941(aClass176_11984.method2874() & ~0x10000);
	}

	void method17075() {
		aBool11988 = false;
		if (null != aClass176_11984)
			aClass176_11984.method2941(aClass176_11984.method2874() & ~0x10000);
	}

	public int method88() {
		return -1859753351 * anInt11980;
	}

	static int method18646(int i, int i_28_) {
		if (i == -1736797763 * Class596.aClass596_7826.anInt7844 || -1736797763 * Class596.aClass596_7838.anInt7844 == i)
			return anIntArray11982[i_28_ & 0x3];
		return anIntArray11981[i_28_ & 0x3];
	}

	Class176 method18647(Class180 class180, int i) {
		if (null != aClass176_11984 && class180.method3175(aClass176_11984.method2874(), i) == 0)
			return aClass176_11984;
		Class20 class20 = method18643(class180, i, false, -2044298451);
		if (null != class20)
			return (Class176) class20.anObject205;
		return null;
	}

	Class176 method18648(Class180 class180, int i) {
		if (null != aClass176_11984 && class180.method3175(aClass176_11984.method2874(), i) == 0)
			return aClass176_11984;
		Class20 class20 = method18643(class180, i, false, -2103705201);
		if (null != class20)
			return (Class176) class20.anObject205;
		return null;
	}

	public int method51() {
		return -1859753351 * anInt11980;
	}

	Class20 method18649(Class180 class180, int i, boolean bool) {
		Class602 class602 = (Class602) aClass24_Sub6_11985.method81(anInt11980 * -1859753351, 122660565);
		Class161 class161;
		Class161 class161_29_;
		if (aBool11979) {
			class161 = aClass555_10867.aClass161Array7435[aByte10862];
			class161_29_ = aClass555_10867.aClass161Array7457[0];
		} else {
			class161 = aClass555_10867.aClass161Array7457[aByte10862];
			if (aByte10862 < 3)
				class161_29_ = aClass555_10867.aClass161Array7457[1 + aByte10862];
			else
				class161_29_ = null;
		}
		Class442 class442 = method10637().aClass442_4927;
		return class602.method9960(class180, i, aByte11987, aByte11986, class161, class161_29_, (int) class442.aFloat4918, (int) class442.aFloat4915, (int) class442.aFloat4919, bool, null, 1605202751);
	}

	Class20 method18650(Class180 class180, int i, boolean bool) {
		Class602 class602 = (Class602) aClass24_Sub6_11985.method81(anInt11980 * -1859753351, 1512704224);
		Class161 class161;
		Class161 class161_30_;
		if (aBool11979) {
			class161 = aClass555_10867.aClass161Array7435[aByte10862];
			class161_30_ = aClass555_10867.aClass161Array7457[0];
		} else {
			class161 = aClass555_10867.aClass161Array7457[aByte10862];
			if (aByte10862 < 3)
				class161_30_ = aClass555_10867.aClass161Array7457[1 + aByte10862];
			else
				class161_30_ = null;
		}
		Class442 class442 = method10637().aClass442_4927;
		return class602.method9960(class180, i, aByte11987, aByte11986, class161, class161_30_, (int) class442.aFloat4918, (int) class442.aFloat4915, (int) class442.aFloat4919, bool, null, 1605202751);
	}

	Class20 method18651(Class180 class180, int i, boolean bool) {
		Class602 class602 = (Class602) aClass24_Sub6_11985.method81(anInt11980 * -1859753351, -377233408);
		Class161 class161;
		Class161 class161_31_;
		if (aBool11979) {
			class161 = aClass555_10867.aClass161Array7435[aByte10862];
			class161_31_ = aClass555_10867.aClass161Array7457[0];
		} else {
			class161 = aClass555_10867.aClass161Array7457[aByte10862];
			if (aByte10862 < 3)
				class161_31_ = aClass555_10867.aClass161Array7457[1 + aByte10862];
			else
				class161_31_ = null;
		}
		Class442 class442 = method10637().aClass442_4927;
		return class602.method9960(class180, i, aByte11987, aByte11986, class161, class161_31_, (int) class442.aFloat4918, (int) class442.aFloat4915, (int) class442.aFloat4919, bool, null, 1605202751);
	}

	void method17078(Class180 class180, Class640_Sub1 class640_sub1, int i, int i_32_, int i_33_, boolean bool) {
		if (class640_sub1 instanceof Class640_Sub1_Sub3_Sub1) {
			Class640_Sub1_Sub3_Sub1 class640_sub1_sub3_sub1_34_ = (Class640_Sub1_Sub3_Sub1) class640_sub1;
			if (aClass176_11984 != null && null != class640_sub1_sub3_sub1_34_.aClass176_11984)
				aClass176_11984.method2881((class640_sub1_sub3_sub1_34_.aClass176_11984), i, i_32_, i_33_, bool);
		} else if (class640_sub1 instanceof Class640_Sub1_Sub2_Sub3) {
			Class640_Sub1_Sub2_Sub3 class640_sub1_sub2_sub3 = (Class640_Sub1_Sub2_Sub3) class640_sub1;
			if (null != aClass176_11984 && null != class640_sub1_sub2_sub3.aClass176_12022)
				aClass176_11984.method2881((class640_sub1_sub2_sub3.aClass176_12022), i, i_32_, i_33_, bool);
		}
	}
}
