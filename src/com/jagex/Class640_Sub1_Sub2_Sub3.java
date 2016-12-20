/* Class640_Sub1_Sub2_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class640_Sub1_Sub2_Sub3 extends Class640_Sub1_Sub2 implements Interface62 {
	int anInt12021;
	Class176 aClass176_12022;
	byte aByte12023;
	Class549 aClass549_12024;
	boolean aBool12025;
	byte aByte12026;
	Class527_Sub8_Sub8 aClass527_Sub8_Sub8_12027;
	boolean aBool12028;
	boolean aBool12029;
	Class24_Sub6 aClass24_Sub6_12030;
	boolean aBool12031;
	boolean aBool12032;

	Class20 method18681(Class180 class180, int i, boolean bool, byte i_0_) {
		Class602 class602 = (Class602) aClass24_Sub6_12030.method81(anInt12021 * -775619473, 1315682038);
		Class161 class161;
		Class161 class161_1_;
		if (aBool12028) {
			class161 = aClass555_10867.aClass161Array7435[aByte10862];
			class161_1_ = aClass555_10867.aClass161Array7457[0];
		} else {
			class161 = aClass555_10867.aClass161Array7457[aByte10862];
			if (aByte10862 < 3)
				class161_1_ = aClass555_10867.aClass161Array7457[1 + aByte10862];
			else
				class161_1_ = null;
		}
		Class442 class442 = method10637().aClass442_4927;
		return (class602.method9960(class180, i, (aByte12026 != Class596.aClass596_7841.anInt7844 * -1736797763 ? (int) aByte12026 : Class596.aClass596_7823.anInt7844 * -1736797763), (aByte12026 == -1736797763 * Class596.aClass596_7841.anInt7844 ? (int) (aByte12023 + 4) : aByte12023), class161, class161_1_, (int) class442.aFloat4918, (int) class442.aFloat4915, (int) class442.aFloat4919, bool, null, 1605202751));
	}

	boolean method17069(int i) {
		if (null != aClass176_12022)
			return !aClass176_12022.method2913();
		return true;
	}

	public Class549 method17058(Class180 class180) {
		Class442 class442 = method10637().aClass442_4927;
		if (aClass549_12024 == null)
			aClass549_12024 = Class174.method2797((int) class442.aFloat4918, (int) class442.aFloat4915, (int) class442.aFloat4919, method18682(class180, 0, 68092919), 2147483647);
		return aClass549_12024;
	}

	public int method17047(int i) {
		return null != aClass176_12022 ? aClass176_12022.method2896() : 0;
	}

	Class176 method18682(Class180 class180, int i, int i_2_) {
		if (aClass176_12022 != null && class180.method3175(aClass176_12022.method2874(), i) == 0)
			return aClass176_12022;
		Class20 class20 = method18681(class180, i, false, (byte) 13);
		if (class20 != null)
			return (Class176) class20.anObject205;
		return null;
	}

	Class558 method17040(Class180 class180, byte i) {
		if (aClass176_12022 == null)
			return null;
		Class432 class432 = method10612();
		Class558 class558 = Class171_Sub1.method14736(aBool12029, -1617999226);
		Class439 class439 = (((Class602) aClass24_Sub6_12030.method81(-775619473 * anInt12021, 1699377058)).aClass439_7950);
		if (class439 != null) {
			aClass176_12022.method2889(class432, null, 0);
			class180.method3536(class432, aClass169Array10863[0], class439);
		} else
			aClass176_12022.method2889(class432, aClass169Array10863[0], 0);
		return class558;
	}

	public Class549 method17042(Class180 class180, int i) {
		Class442 class442 = method10637().aClass442_4927;
		if (aClass549_12024 == null)
			aClass549_12024 = Class174.method2797((int) class442.aFloat4918, (int) class442.aFloat4915, (int) class442.aFloat4919, method18682(class180, 0, -1817124062), 2147483647);
		return aClass549_12024;
	}

	boolean method17052() {
		if (null != aClass176_12022)
			return !aClass176_12022.method2913();
		return true;
	}

	void method17081(Class180 class180, int i) {
		/* empty */
	}

	public int method408() {
		return aByte12026;
	}

	boolean method17037(int i) {
		return aBool12025;
	}

	void method17038(Class180 class180, Class640_Sub1 class640_sub1, int i, int i_3_, int i_4_, boolean bool, int i_5_) {
		if (class640_sub1 instanceof Class640_Sub1_Sub3_Sub1) {
			Class640_Sub1_Sub3_Sub1 class640_sub1_sub3_sub1 = (Class640_Sub1_Sub3_Sub1) class640_sub1;
			if (aClass176_12022 != null && null != class640_sub1_sub3_sub1.aClass176_11984)
				aClass176_12022.method2881((class640_sub1_sub3_sub1.aClass176_11984), i, i_3_, i_4_, bool);
		} else if (class640_sub1 instanceof Class640_Sub1_Sub2_Sub3) {
			Class640_Sub1_Sub2_Sub3 class640_sub1_sub2_sub3_6_ = (Class640_Sub1_Sub2_Sub3) class640_sub1;
			if (aClass176_12022 != null && null != class640_sub1_sub2_sub3_6_.aClass176_12022)
				aClass176_12022.method2881((class640_sub1_sub2_sub3_6_.aClass176_12022), i, i_3_, i_4_, bool);
		}
	}

	void method17039(int i) {
		aBool12025 = false;
		if (null != aClass176_12022)
			aClass176_12022.method2941(aClass176_12022.method2874() & ~0x10000);
	}

	public int method194() {
		return aByte12026;
	}

	public Class549 method17057(Class180 class180) {
		Class442 class442 = method10637().aClass442_4927;
		if (aClass549_12024 == null)
			aClass549_12024 = Class174.method2797((int) class442.aFloat4918, (int) class442.aFloat4915, (int) class442.aFloat4919, method18682(class180, 0, -1795269878), 2147483647);
		return aClass549_12024;
	}

	public int method396(int i) {
		return aByte12023;
	}

	public void method395(byte i) {
		if (null != aClass176_12022)
			aClass176_12022.method2895();
	}

	public boolean method399(int i) {
		return aBool12032;
	}

	public boolean method398(int i) {
		return aBool12031;
	}

	public void method409(Class180 class180) {
		Object object = null;
		Class527_Sub8_Sub8 class527_sub8_sub8;
		if (aClass527_Sub8_Sub8_12027 == null && aBool12031) {
			Class20 class20 = method18681(class180, 262144, true, (byte) 103);
			class527_sub8_sub8 = (Class527_Sub8_Sub8) (class20 != null ? class20.anObject204 : null);
		} else {
			class527_sub8_sub8 = aClass527_Sub8_Sub8_12027;
			aClass527_Sub8_Sub8_12027 = null;
		}
		Class442 class442 = method10637().aClass442_4927;
		if (class527_sub8_sub8 != null)
			aClass555_10867.method9268(class527_sub8_sub8, aByte10862, (int) class442.aFloat4918, (int) class442.aFloat4919, null, (byte) 103);
	}

	void method17075() {
		aBool12025 = false;
		if (null != aClass176_12022)
			aClass176_12022.method2941(aClass176_12022.method2874() & ~0x10000);
	}

	public int method18683(byte i) {
		return null != aClass176_12022 ? aClass176_12022.method2865() / 4 : 15;
	}

	public void method401(Class180 class180, int i) {
		Object object = null;
		Class527_Sub8_Sub8 class527_sub8_sub8;
		if (aClass527_Sub8_Sub8_12027 == null && aBool12031) {
			Class20 class20 = method18681(class180, 262144, true, (byte) 51);
			class527_sub8_sub8 = (Class527_Sub8_Sub8) (class20 != null ? class20.anObject204 : null);
		} else {
			class527_sub8_sub8 = aClass527_Sub8_Sub8_12027;
			aClass527_Sub8_Sub8_12027 = null;
		}
		Class442 class442 = method10637().aClass442_4927;
		if (class527_sub8_sub8 != null)
			aClass555_10867.method9268(class527_sub8_sub8, aByte10862, (int) class442.aFloat4918, (int) class442.aFloat4919, null, (byte) 126);
	}

	public int method88() {
		return -775619473 * anInt12021;
	}

	boolean method17066(Class180 class180, int i, int i_7_) {
		Class439 class439 = (((Class602) aClass24_Sub6_12030.method81(anInt12021 * -775619473, -380683874)).aClass439_7950);
		if (class439 != null)
			return class180.method3155(i, i_7_, method10612(), class439, -867329631);
		Class176 class176 = method18682(class180, 131072, 591334123);
		if (null != class176) {
			Class432 class432 = method10612();
			return class176.method3051(i, i_7_, class432, false, 0);
		}
		return false;
	}

	public int method18684() {
		return null != aClass176_12022 ? aClass176_12022.method2865() / 4 : 15;
	}

	public int method403() {
		return aByte12023;
	}

	public int method406() {
		return aByte12023;
	}

	public void method347() {
		if (null != aClass176_12022)
			aClass176_12022.method2895();
	}

	public void method353() {
		if (null != aClass176_12022)
			aClass176_12022.method2895();
	}

	public boolean method404() {
		return aBool12031;
	}

	boolean method17033(Class180 class180, int i, int i_8_, byte i_9_) {
		Class439 class439 = (((Class602) aClass24_Sub6_12030.method81(anInt12021 * -775619473, -403543747)).aClass439_7950);
		if (class439 != null)
			return class180.method3155(i, i_8_, method10612(), class439, -867329631);
		Class176 class176 = method18682(class180, 131072, -714176347);
		if (null != class176) {
			Class432 class432 = method10612();
			return class176.method3051(i, i_8_, class432, false, 0);
		}
		return false;
	}

	public boolean method316() {
		return aBool12032;
	}

	public void method397(Class180 class180) {
		Object object = null;
		Class527_Sub8_Sub8 class527_sub8_sub8;
		if (aClass527_Sub8_Sub8_12027 == null && aBool12031) {
			Class20 class20 = method18681(class180, 262144, true, (byte) 26);
			class527_sub8_sub8 = (Class527_Sub8_Sub8) (class20 != null ? class20.anObject204 : null);
		} else {
			class527_sub8_sub8 = aClass527_Sub8_Sub8_12027;
			aClass527_Sub8_Sub8_12027 = null;
		}
		Class442 class442 = method10637().aClass442_4927;
		if (class527_sub8_sub8 != null)
			aClass555_10867.method9267(class527_sub8_sub8, aByte10862, (int) class442.aFloat4918, (int) class442.aFloat4919, null, 1946681708);
	}

	public void method394(Class180 class180) {
		Object object = null;
		Class527_Sub8_Sub8 class527_sub8_sub8;
		if (aClass527_Sub8_Sub8_12027 == null && aBool12031) {
			Class20 class20 = method18681(class180, 262144, true, (byte) 105);
			class527_sub8_sub8 = (Class527_Sub8_Sub8) (class20 != null ? class20.anObject204 : null);
		} else {
			class527_sub8_sub8 = aClass527_Sub8_Sub8_12027;
			aClass527_Sub8_Sub8_12027 = null;
		}
		Class442 class442 = method10637().aClass442_4927;
		if (class527_sub8_sub8 != null)
			aClass555_10867.method9267(class527_sub8_sub8, aByte10862, (int) class442.aFloat4918, (int) class442.aFloat4919, null, 2076752795);
	}

	public void method400(Class180 class180, int i) {
		Object object = null;
		Class527_Sub8_Sub8 class527_sub8_sub8;
		if (aClass527_Sub8_Sub8_12027 == null && aBool12031) {
			Class20 class20 = method18681(class180, 262144, true, (byte) 73);
			class527_sub8_sub8 = (Class527_Sub8_Sub8) (class20 != null ? class20.anObject204 : null);
		} else {
			class527_sub8_sub8 = aClass527_Sub8_Sub8_12027;
			aClass527_Sub8_Sub8_12027 = null;
		}
		Class442 class442 = method10637().aClass442_4927;
		if (class527_sub8_sub8 != null)
			aClass555_10867.method9267(class527_sub8_sub8, aByte10862, (int) class442.aFloat4918, (int) class442.aFloat4919, null, 1869546042);
	}

	public void method402(Class180 class180) {
		Object object = null;
		Class527_Sub8_Sub8 class527_sub8_sub8;
		if (aClass527_Sub8_Sub8_12027 == null && aBool12031) {
			Class20 class20 = method18681(class180, 262144, true, (byte) 48);
			class527_sub8_sub8 = (Class527_Sub8_Sub8) (class20 != null ? class20.anObject204 : null);
		} else {
			class527_sub8_sub8 = aClass527_Sub8_Sub8_12027;
			aClass527_Sub8_Sub8_12027 = null;
		}
		Class442 class442 = method10637().aClass442_4927;
		if (class527_sub8_sub8 != null)
			aClass555_10867.method9268(class527_sub8_sub8, aByte10862, (int) class442.aFloat4918, (int) class442.aFloat4919, null, (byte) 30);
	}

	public int method64(int i) {
		return -775619473 * anInt12021;
	}

	boolean method17051() {
		if (null != aClass176_12022)
			return !aClass176_12022.method2913();
		return true;
	}

	public int method51() {
		return -775619473 * anInt12021;
	}

	boolean method17053() {
		if (aClass176_12022 != null)
			return aClass176_12022.method2949();
		return false;
	}

	boolean method17048() {
		if (aClass176_12022 != null)
			return aClass176_12022.method2949();
		return false;
	}

	static byte method18685(int i, int i_10_) {
		if (i != -1736797763 * Class596.aClass596_7824.anInt7844)
			return (byte) 0;
		if ((i_10_ & 0x1) == 0)
			return (byte) 1;
		return (byte) 2;
	}

	public Class549 method17085(Class180 class180) {
		Class442 class442 = method10637().aClass442_4927;
		if (aClass549_12024 == null)
			aClass549_12024 = Class174.method2797((int) class442.aFloat4918, (int) class442.aFloat4915, (int) class442.aFloat4919, method18682(class180, 0, -1088928831), 2147483647);
		return aClass549_12024;
	}

	public Class549 method17064(Class180 class180) {
		Class442 class442 = method10637().aClass442_4927;
		if (aClass549_12024 == null)
			aClass549_12024 = Class174.method2797((int) class442.aFloat4918, (int) class442.aFloat4915, (int) class442.aFloat4919, method18682(class180, 0, 1166517857), 2147483647);
		return aClass549_12024;
	}

	public int method77(int i) {
		return aByte12026;
	}

	Class558 method17070(Class180 class180) {
		if (aClass176_12022 == null)
			return null;
		Class432 class432 = method10612();
		Class558 class558 = Class171_Sub1.method14736(aBool12029, 1598858784);
		Class439 class439 = (((Class602) aClass24_Sub6_12030.method81(-775619473 * anInt12021, -505617089)).aClass439_7950);
		if (class439 != null) {
			aClass176_12022.method2889(class432, null, 0);
			class180.method3536(class432, aClass169Array10863[0], class439);
		} else
			aClass176_12022.method2889(class432, aClass169Array10863[0], 0);
		return class558;
	}

	Class558 method17063(Class180 class180) {
		if (aClass176_12022 == null)
			return null;
		Class432 class432 = method10612();
		Class558 class558 = Class171_Sub1.method14736(aBool12029, -24336218);
		Class439 class439 = (((Class602) aClass24_Sub6_12030.method81(-775619473 * anInt12021, 2080605721)).aClass439_7950);
		if (class439 != null) {
			aClass176_12022.method2889(class432, null, 0);
			class180.method3536(class432, aClass169Array10863[0], class439);
		} else
			aClass176_12022.method2889(class432, aClass169Array10863[0], 0);
		return class558;
	}

	void method17056(Class180 class180) {
		/* empty */
	}

	void method17071(Class180 class180) {
		/* empty */
	}

	public int method17076() {
		return null != aClass176_12022 ? aClass176_12022.method2896() : 0;
	}

	boolean method17067() {
		return aBool12025;
	}

	boolean method17045() {
		return aBool12025;
	}

	public Class640_Sub1_Sub2_Sub3(Class555 class555, Class180 class180, Class24_Sub6 class24_sub6, Class602 class602, int i, int i_11_, int i_12_, int i_13_, int i_14_, boolean bool, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_, boolean bool_21_, boolean bool_22_) {
		super(class555, i, i_11_, i_12_, i_13_, i_14_, i_15_, i_16_, i_17_, i_18_, 1 == 1302526849 * class602.anInt7872, Class689.method13999(i_19_, i_20_, 865184619));
		aClass24_Sub6_12030 = class24_sub6;
		anInt12021 = 1878687053 * class602.anInt7873;
		aByte10862 = (byte) i_11_;
		aBool12028 = bool;
		aByte12026 = (byte) i_19_;
		aByte12023 = (byte) i_20_;
		aBool12029 = 0 != class602.anInt7898 * -1508648055 && !bool;
		aBool12025 = bool_21_;
		aBool12031 = (class180.method3381() && class602.aBool7940 && !aBool12028 && Class204.aClass527_Sub31_2213.aClass700_Sub1_10603.method16843(1763310182) != 0);
		aBool12032 = bool_22_;
		int i_23_ = 2048;
		if (aBool12025)
			i_23_ |= 0x10000;
		if (class602.aBool7948)
			i_23_ |= 0x80000;
		Class20 class20 = method18681(class180, i_23_, aBool12031, (byte) 48);
		if (class20 != null) {
			aClass176_12022 = (Class176) class20.anObject205;
			aClass527_Sub8_Sub8_12027 = (Class527_Sub8_Sub8) class20.anObject204;
			if (aBool12025 || class602.aBool7948) {
				aClass176_12022 = aClass176_12022.method2862((byte) 0, i_23_, false);
				if (class602.aBool7948) {
					Class512 class512 = client.aClass509_11072.method8287(-1201338636);
					aClass176_12022.method2986(-10813755 * class512.anInt7004, -2041402825 * class512.anInt7005, -1759590251 * class512.anInt7007, -1205510909 * class512.anInt7006);
				}
			}
		}
		method17050(1, (short) 21690);
	}

	void method17078(Class180 class180, Class640_Sub1 class640_sub1, int i, int i_24_, int i_25_, boolean bool) {
		if (class640_sub1 instanceof Class640_Sub1_Sub3_Sub1) {
			Class640_Sub1_Sub3_Sub1 class640_sub1_sub3_sub1 = (Class640_Sub1_Sub3_Sub1) class640_sub1;
			if (aClass176_12022 != null && null != class640_sub1_sub3_sub1.aClass176_11984)
				aClass176_12022.method2881((class640_sub1_sub3_sub1.aClass176_11984), i, i_24_, i_25_, bool);
		} else if (class640_sub1 instanceof Class640_Sub1_Sub2_Sub3) {
			Class640_Sub1_Sub2_Sub3 class640_sub1_sub2_sub3_26_ = (Class640_Sub1_Sub2_Sub3) class640_sub1;
			if (aClass176_12022 != null && null != class640_sub1_sub2_sub3_26_.aClass176_12022)
				aClass176_12022.method2881((class640_sub1_sub2_sub3_26_.aClass176_12022), i, i_24_, i_25_, bool);
		}
	}

	void method17062(Class180 class180, Class640_Sub1 class640_sub1, int i, int i_27_, int i_28_, boolean bool) {
		if (class640_sub1 instanceof Class640_Sub1_Sub3_Sub1) {
			Class640_Sub1_Sub3_Sub1 class640_sub1_sub3_sub1 = (Class640_Sub1_Sub3_Sub1) class640_sub1;
			if (aClass176_12022 != null && null != class640_sub1_sub3_sub1.aClass176_11984)
				aClass176_12022.method2881((class640_sub1_sub3_sub1.aClass176_11984), i, i_27_, i_28_, bool);
		} else if (class640_sub1 instanceof Class640_Sub1_Sub2_Sub3) {
			Class640_Sub1_Sub2_Sub3 class640_sub1_sub2_sub3_29_ = (Class640_Sub1_Sub2_Sub3) class640_sub1;
			if (aClass176_12022 != null && null != class640_sub1_sub2_sub3_29_.aClass176_12022)
				aClass176_12022.method2881((class640_sub1_sub2_sub3_29_.aClass176_12022), i, i_27_, i_28_, bool);
		}
	}

	void method17041(Class180 class180, Class640_Sub1 class640_sub1, int i, int i_30_, int i_31_, boolean bool) {
		if (class640_sub1 instanceof Class640_Sub1_Sub3_Sub1) {
			Class640_Sub1_Sub3_Sub1 class640_sub1_sub3_sub1 = (Class640_Sub1_Sub3_Sub1) class640_sub1;
			if (aClass176_12022 != null && null != class640_sub1_sub3_sub1.aClass176_11984)
				aClass176_12022.method2881((class640_sub1_sub3_sub1.aClass176_11984), i, i_30_, i_31_, bool);
		} else if (class640_sub1 instanceof Class640_Sub1_Sub2_Sub3) {
			Class640_Sub1_Sub2_Sub3 class640_sub1_sub2_sub3_32_ = (Class640_Sub1_Sub2_Sub3) class640_sub1;
			if (aClass176_12022 != null && null != class640_sub1_sub2_sub3_32_.aClass176_12022)
				aClass176_12022.method2881((class640_sub1_sub2_sub3_32_.aClass176_12022), i, i_30_, i_31_, bool);
		}
	}

	void method17073(Class180 class180, Class640_Sub1 class640_sub1, int i, int i_33_, int i_34_, boolean bool) {
		if (class640_sub1 instanceof Class640_Sub1_Sub3_Sub1) {
			Class640_Sub1_Sub3_Sub1 class640_sub1_sub3_sub1 = (Class640_Sub1_Sub3_Sub1) class640_sub1;
			if (aClass176_12022 != null && null != class640_sub1_sub3_sub1.aClass176_11984)
				aClass176_12022.method2881((class640_sub1_sub3_sub1.aClass176_11984), i, i_33_, i_34_, bool);
		} else if (class640_sub1 instanceof Class640_Sub1_Sub2_Sub3) {
			Class640_Sub1_Sub2_Sub3 class640_sub1_sub2_sub3_35_ = (Class640_Sub1_Sub2_Sub3) class640_sub1;
			if (aClass176_12022 != null && null != class640_sub1_sub2_sub3_35_.aClass176_12022)
				aClass176_12022.method2881((class640_sub1_sub2_sub3_35_.aClass176_12022), i, i_33_, i_34_, bool);
		}
	}

	void method17074() {
		aBool12025 = false;
		if (null != aClass176_12022)
			aClass176_12022.method2941(aClass176_12022.method2874() & ~0x10000);
	}

	static byte method18686(int i, int i_36_) {
		if (i != -1736797763 * Class596.aClass596_7824.anInt7844)
			return (byte) 0;
		if ((i_36_ & 0x1) == 0)
			return (byte) 1;
		return (byte) 2;
	}

	public boolean method405() {
		return aBool12031;
	}

	static byte method18687(int i, int i_37_) {
		if (i != -1736797763 * Class596.aClass596_7824.anInt7844)
			return (byte) 0;
		if ((i_37_ & 0x1) == 0)
			return (byte) 1;
		return (byte) 2;
	}

	static byte method18688(int i, int i_38_) {
		if (i != -1736797763 * Class596.aClass596_7824.anInt7844)
			return (byte) 0;
		if ((i_38_ & 0x1) == 0)
			return (byte) 1;
		return (byte) 2;
	}

	public void method407(Class180 class180) {
		Object object = null;
		Class527_Sub8_Sub8 class527_sub8_sub8;
		if (aClass527_Sub8_Sub8_12027 == null && aBool12031) {
			Class20 class20 = method18681(class180, 262144, true, (byte) 69);
			class527_sub8_sub8 = (Class527_Sub8_Sub8) (class20 != null ? class20.anObject204 : null);
		} else {
			class527_sub8_sub8 = aClass527_Sub8_Sub8_12027;
			aClass527_Sub8_Sub8_12027 = null;
		}
		Class442 class442 = method10637().aClass442_4927;
		if (class527_sub8_sub8 != null)
			aClass555_10867.method9267(class527_sub8_sub8, aByte10862, (int) class442.aFloat4918, (int) class442.aFloat4919, null, 1813993539);
	}

	Class176 method18689(Class180 class180, int i) {
		if (aClass176_12022 != null && class180.method3175(aClass176_12022.method2874(), i) == 0)
			return aClass176_12022;
		Class20 class20 = method18681(class180, i, false, (byte) 77);
		if (class20 != null)
			return (Class176) class20.anObject205;
		return null;
	}

	Class176 method18690(Class180 class180, int i) {
		if (aClass176_12022 != null && class180.method3175(aClass176_12022.method2874(), i) == 0)
			return aClass176_12022;
		Class20 class20 = method18681(class180, i, false, (byte) 112);
		if (class20 != null)
			return (Class176) class20.anObject205;
		return null;
	}

	boolean method17072(int i) {
		if (aClass176_12022 != null)
			return aClass176_12022.method2949();
		return false;
	}

	boolean method17068() {
		return aBool12025;
	}

	Class176 method18691(Class180 class180, int i) {
		if (aClass176_12022 != null && class180.method3175(aClass176_12022.method2874(), i) == 0)
			return aClass176_12022;
		Class20 class20 = method18681(class180, i, false, (byte) 13);
		if (class20 != null)
			return (Class176) class20.anObject205;
		return null;
	}

	public int method18692() {
		return null != aClass176_12022 ? aClass176_12022.method2865() / 4 : 15;
	}

	static final void method18693(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = 0;
	}
}
