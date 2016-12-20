/* Class640_Sub1_Sub4_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class640_Sub1_Sub4_Sub1 extends Class640_Sub1_Sub4 implements Interface62 {
	Class176 aClass176_11992;
	Class549 aClass549_11993;
	Class527_Sub8_Sub8 aClass527_Sub8_Sub8_11994;
	Class24_Sub6 aClass24_Sub6_11995;
	int anInt11996;
	byte aByte11997;
	boolean aBool11998;
	boolean aBool11999;
	boolean aBool12000;
	boolean aBool12001;

	public int method17047(int i) {
		return null != aClass176_11992 ? aClass176_11992.method2896() : 0;
	}

	boolean method17069(int i) {
		if (aClass176_11992 != null)
			return !aClass176_11992.method2913();
		return true;
	}

	boolean method17072(int i) {
		if (aClass176_11992 != null)
			return aClass176_11992.method2949();
		return false;
	}

	void method17041(Class180 class180, Class640_Sub1 class640_sub1, int i, int i_0_, int i_1_, boolean bool) {
		if (class640_sub1 instanceof Class640_Sub1_Sub4_Sub1) {
			Class640_Sub1_Sub4_Sub1 class640_sub1_sub4_sub1_2_ = (Class640_Sub1_Sub4_Sub1) class640_sub1;
			if (aClass176_11992 != null && null != class640_sub1_sub4_sub1_2_.aClass176_11992)
				aClass176_11992.method2881((class640_sub1_sub4_sub1_2_.aClass176_11992), i, i_0_, i_1_, bool);
		}
	}

	Class176 method18652(Class180 class180, int i, int i_3_) {
		if (aClass176_11992 != null && class180.method3175(aClass176_11992.method2874(), i) == 0)
			return aClass176_11992;
		Class20 class20 = method18653(class180, i, false, (byte) 62);
		if (null != class20)
			return (Class176) class20.anObject205;
		return null;
	}

	Class20 method18653(Class180 class180, int i, boolean bool, byte i_4_) {
		Class602 class602 = (Class602) aClass24_Sub6_11995.method81(-1498968023 * anInt11996, -161540759);
		Class161 class161;
		Class161 class161_5_;
		if (aBool11998) {
			class161 = aClass555_10867.aClass161Array7435[aByte10862];
			class161_5_ = aClass555_10867.aClass161Array7457[0];
		} else {
			class161 = aClass555_10867.aClass161Array7457[aByte10862];
			if (aByte10862 < 3)
				class161_5_ = aClass555_10867.aClass161Array7457[aByte10862 + 1];
			else
				class161_5_ = null;
		}
		Class442 class442 = method10637().aClass442_4927;
		return class602.method9960(class180, i, (Class596.aClass596_7842.anInt7844 * -1736797763), aByte11997, class161, class161_5_, (int) class442.aFloat4918, (int) class442.aFloat4915, (int) class442.aFloat4919, bool, null, 1605202751);
	}

	public Class549 method17042(Class180 class180, int i) {
		Class442 class442 = method10637().aClass442_4927;
		if (null == aClass549_11993)
			aClass549_11993 = Class174.method2797((int) class442.aFloat4918, (int) class442.aFloat4915, (int) class442.aFloat4919, method18652(class180, 0, -548640635), 2147483647);
		return aClass549_11993;
	}

	Class558 method17040(Class180 class180, byte i) {
		if (aClass176_11992 == null)
			return null;
		Class432 class432 = method10612();
		Class558 class558 = Class171_Sub1.method14736(aBool11999, 1444642654);
		Class439 class439 = (((Class602) aClass24_Sub6_11995.method81(anInt11996 * -1498968023, -1384100419)).aClass439_7950);
		if (null != class439) {
			aClass176_11992.method2889(class432, null, 0);
			class180.method3536(class432, aClass169Array10863[0], class439);
		} else
			aClass176_11992.method2889(class432, aClass169Array10863[0], 0);
		return class558;
	}

	public boolean method316() {
		return true;
	}

	boolean method17033(Class180 class180, int i, int i_6_, byte i_7_) {
		Class439 class439 = (((Class602) aClass24_Sub6_11995.method81(anInt11996 * -1498968023, -2061449487)).aClass439_7950);
		if (class439 != null)
			return class180.method3155(i, i_6_, method10612(), class439, -867329631);
		Class176 class176 = method18652(class180, 131072, -146654818);
		if (class176 != null) {
			Class432 class432 = method10612();
			return class176.method3051(i, i_6_, class432, false, 0);
		}
		return false;
	}

	public Class640_Sub1_Sub4_Sub1(Class555 class555, Class180 class180, Class24_Sub6 class24_sub6, Class602 class602, int i, int i_8_, int i_9_, int i_10_, int i_11_, boolean bool, int i_12_, boolean bool_13_) {
		super(class555, i_9_, i_10_, i_11_, i, i_8_, class602.anInt7927 * 1564202283);
		aClass24_Sub6_11995 = class24_sub6;
		anInt11996 = 293260715 * class602.anInt7873;
		aBool11998 = bool;
		aByte11997 = (byte) i_12_;
		aBool11999 = -1508648055 * class602.anInt7898 != 0 && !bool;
		aBool12000 = bool_13_;
		aBool12001 = (class180.method3381() && class602.aBool7940 && !aBool11998 && Class204.aClass527_Sub31_2213.aClass700_Sub1_10603.method16843(-2072456663) != 0);
		int i_14_ = 2048;
		if (aBool12000)
			i_14_ |= 0x10000;
		if (class602.aBool7948)
			i_14_ |= 0x80000;
		Class20 class20 = method18653(class180, i_14_, aBool12001, (byte) 7);
		if (null != class20) {
			aClass176_11992 = (Class176) class20.anObject205;
			aClass527_Sub8_Sub8_11994 = (Class527_Sub8_Sub8) class20.anObject204;
			if (aBool12000 || class602.aBool7948) {
				aClass176_11992 = aClass176_11992.method2862((byte) 0, i_14_, false);
				if (class602.aBool7948) {
					Class512 class512 = client.aClass509_11072.method8287(-1201338636);
					aClass176_11992.method2986(-10813755 * class512.anInt7004, class512.anInt7005 * -2041402825, class512.anInt7007 * -1759590251, class512.anInt7006 * -1205510909);
				}
			}
		}
		method17050(1, (short) 29262);
	}

	void method17038(Class180 class180, Class640_Sub1 class640_sub1, int i, int i_15_, int i_16_, boolean bool, int i_17_) {
		if (class640_sub1 instanceof Class640_Sub1_Sub4_Sub1) {
			Class640_Sub1_Sub4_Sub1 class640_sub1_sub4_sub1_18_ = (Class640_Sub1_Sub4_Sub1) class640_sub1;
			if (aClass176_11992 != null && null != class640_sub1_sub4_sub1_18_.aClass176_11992)
				aClass176_11992.method2881((class640_sub1_sub4_sub1_18_.aClass176_11992), i, i_15_, i_16_, bool);
		}
	}

	public int method64(int i) {
		return -1498968023 * anInt11996;
	}

	boolean method17052() {
		if (aClass176_11992 != null)
			return !aClass176_11992.method2913();
		return true;
	}

	public int method77(int i) {
		return Class596.aClass596_7842.anInt7844 * -1736797763;
	}

	void method17081(Class180 class180, int i) {
		/* empty */
	}

	public int method408() {
		return Class596.aClass596_7842.anInt7844 * -1736797763;
	}

	public int method396(int i) {
		return aByte11997;
	}

	public boolean method398(int i) {
		return aBool12001;
	}

	public void method400(Class180 class180, int i) {
		Object object = null;
		Class527_Sub8_Sub8 class527_sub8_sub8;
		if (aClass527_Sub8_Sub8_11994 == null && aBool12001) {
			Class20 class20 = method18653(class180, 262144, true, (byte) 123);
			class527_sub8_sub8 = (Class527_Sub8_Sub8) (null != class20 ? class20.anObject204 : null);
		} else {
			class527_sub8_sub8 = aClass527_Sub8_Sub8_11994;
			aClass527_Sub8_Sub8_11994 = null;
		}
		Class442 class442 = method10637().aClass442_4927;
		if (class527_sub8_sub8 != null)
			aClass555_10867.method9267(class527_sub8_sub8, aByte10862, (int) class442.aFloat4918, (int) class442.aFloat4919, null, 1690348768);
	}

	public void method401(Class180 class180, int i) {
		Object object = null;
		Class527_Sub8_Sub8 class527_sub8_sub8;
		if (null == aClass527_Sub8_Sub8_11994 && aBool12001) {
			Class20 class20 = method18653(class180, 262144, true, (byte) 108);
			class527_sub8_sub8 = (Class527_Sub8_Sub8) (class20 != null ? class20.anObject204 : null);
		} else {
			class527_sub8_sub8 = aClass527_Sub8_Sub8_11994;
			aClass527_Sub8_Sub8_11994 = null;
		}
		Class442 class442 = method10637().aClass442_4927;
		if (null != class527_sub8_sub8)
			aClass555_10867.method9268(class527_sub8_sub8, aByte10862, (int) class442.aFloat4918, (int) class442.aFloat4919, null, (byte) 104);
	}

	public int method51() {
		return -1498968023 * anInt11996;
	}

	public int method88() {
		return -1498968023 * anInt11996;
	}

	boolean method17048() {
		if (aClass176_11992 != null)
			return aClass176_11992.method2949();
		return false;
	}

	public Class549 method17085(Class180 class180) {
		Class442 class442 = method10637().aClass442_4927;
		if (null == aClass549_11993)
			aClass549_11993 = Class174.method2797((int) class442.aFloat4918, (int) class442.aFloat4915, (int) class442.aFloat4919, method18652(class180, 0, -711055806), 2147483647);
		return aClass549_11993;
	}

	public int method403() {
		return aByte11997;
	}

	public int method406() {
		return aByte11997;
	}

	public void method347() {
		if (aClass176_11992 != null)
			aClass176_11992.method2895();
	}

	public void method353() {
		if (aClass176_11992 != null)
			aClass176_11992.method2895();
	}

	public boolean method404() {
		return aBool12001;
	}

	public boolean method399(int i) {
		return true;
	}

	public Class549 method17057(Class180 class180) {
		Class442 class442 = method10637().aClass442_4927;
		if (null == aClass549_11993)
			aClass549_11993 = Class174.method2797((int) class442.aFloat4918, (int) class442.aFloat4915, (int) class442.aFloat4919, method18652(class180, 0, -340118691), 2147483647);
		return aClass549_11993;
	}

	public void method397(Class180 class180) {
		Object object = null;
		Class527_Sub8_Sub8 class527_sub8_sub8;
		if (aClass527_Sub8_Sub8_11994 == null && aBool12001) {
			Class20 class20 = method18653(class180, 262144, true, (byte) 121);
			class527_sub8_sub8 = (Class527_Sub8_Sub8) (null != class20 ? class20.anObject204 : null);
		} else {
			class527_sub8_sub8 = aClass527_Sub8_Sub8_11994;
			aClass527_Sub8_Sub8_11994 = null;
		}
		Class442 class442 = method10637().aClass442_4927;
		if (class527_sub8_sub8 != null)
			aClass555_10867.method9267(class527_sub8_sub8, aByte10862, (int) class442.aFloat4918, (int) class442.aFloat4919, null, 1707546645);
	}

	void method17073(Class180 class180, Class640_Sub1 class640_sub1, int i, int i_19_, int i_20_, boolean bool) {
		if (class640_sub1 instanceof Class640_Sub1_Sub4_Sub1) {
			Class640_Sub1_Sub4_Sub1 class640_sub1_sub4_sub1_21_ = (Class640_Sub1_Sub4_Sub1) class640_sub1;
			if (aClass176_11992 != null && null != class640_sub1_sub4_sub1_21_.aClass176_11992)
				aClass176_11992.method2881((class640_sub1_sub4_sub1_21_.aClass176_11992), i, i_19_, i_20_, bool);
		}
	}

	public void method407(Class180 class180) {
		Object object = null;
		Class527_Sub8_Sub8 class527_sub8_sub8;
		if (aClass527_Sub8_Sub8_11994 == null && aBool12001) {
			Class20 class20 = method18653(class180, 262144, true, (byte) 63);
			class527_sub8_sub8 = (Class527_Sub8_Sub8) (null != class20 ? class20.anObject204 : null);
		} else {
			class527_sub8_sub8 = aClass527_Sub8_Sub8_11994;
			aClass527_Sub8_Sub8_11994 = null;
		}
		Class442 class442 = method10637().aClass442_4927;
		if (class527_sub8_sub8 != null)
			aClass555_10867.method9267(class527_sub8_sub8, aByte10862, (int) class442.aFloat4918, (int) class442.aFloat4919, null, 2049841626);
	}

	public void method394(Class180 class180) {
		Object object = null;
		Class527_Sub8_Sub8 class527_sub8_sub8;
		if (aClass527_Sub8_Sub8_11994 == null && aBool12001) {
			Class20 class20 = method18653(class180, 262144, true, (byte) 71);
			class527_sub8_sub8 = (Class527_Sub8_Sub8) (null != class20 ? class20.anObject204 : null);
		} else {
			class527_sub8_sub8 = aClass527_Sub8_Sub8_11994;
			aClass527_Sub8_Sub8_11994 = null;
		}
		Class442 class442 = method10637().aClass442_4927;
		if (class527_sub8_sub8 != null)
			aClass555_10867.method9267(class527_sub8_sub8, aByte10862, (int) class442.aFloat4918, (int) class442.aFloat4919, null, 1546119462);
	}

	public void method409(Class180 class180) {
		Object object = null;
		Class527_Sub8_Sub8 class527_sub8_sub8;
		if (null == aClass527_Sub8_Sub8_11994 && aBool12001) {
			Class20 class20 = method18653(class180, 262144, true, (byte) 11);
			class527_sub8_sub8 = (Class527_Sub8_Sub8) (class20 != null ? class20.anObject204 : null);
		} else {
			class527_sub8_sub8 = aClass527_Sub8_Sub8_11994;
			aClass527_Sub8_Sub8_11994 = null;
		}
		Class442 class442 = method10637().aClass442_4927;
		if (null != class527_sub8_sub8)
			aClass555_10867.method9268(class527_sub8_sub8, aByte10862, (int) class442.aFloat4918, (int) class442.aFloat4919, null, (byte) 63);
	}

	boolean method17051() {
		if (aClass176_11992 != null)
			return !aClass176_11992.method2913();
		return true;
	}

	public int method194() {
		return Class596.aClass596_7842.anInt7844 * -1736797763;
	}

	boolean method17053() {
		if (aClass176_11992 != null)
			return aClass176_11992.method2949();
		return false;
	}

	void method17039(int i) {
		aBool12000 = false;
		if (null != aClass176_11992)
			aClass176_11992.method2941(aClass176_11992.method2874() & ~0x10000);
	}

	public Class549 method17064(Class180 class180) {
		Class442 class442 = method10637().aClass442_4927;
		if (null == aClass549_11993)
			aClass549_11993 = Class174.method2797((int) class442.aFloat4918, (int) class442.aFloat4915, (int) class442.aFloat4919, method18652(class180, 0, -1606736316), 2147483647);
		return aClass549_11993;
	}

	void method17071(Class180 class180) {
		/* empty */
	}

	boolean method17037(int i) {
		return aBool12000;
	}

	public boolean method405() {
		return aBool12001;
	}

	boolean method17066(Class180 class180, int i, int i_22_) {
		Class439 class439 = (((Class602) aClass24_Sub6_11995.method81(anInt11996 * -1498968023, 2085996183)).aClass439_7950);
		if (class439 != null)
			return class180.method3155(i, i_22_, method10612(), class439, -867329631);
		Class176 class176 = method18652(class180, 131072, -264907171);
		if (class176 != null) {
			Class432 class432 = method10612();
			return class176.method3051(i, i_22_, class432, false, 0);
		}
		return false;
	}

	public Class549 method17058(Class180 class180) {
		Class442 class442 = method10637().aClass442_4927;
		if (null == aClass549_11993)
			aClass549_11993 = Class174.method2797((int) class442.aFloat4918, (int) class442.aFloat4915, (int) class442.aFloat4919, method18652(class180, 0, -1795861921), 2147483647);
		return aClass549_11993;
	}

	void method17056(Class180 class180) {
		/* empty */
	}

	public void method395(byte i) {
		if (aClass176_11992 != null)
			aClass176_11992.method2895();
	}

	public void method402(Class180 class180) {
		Object object = null;
		Class527_Sub8_Sub8 class527_sub8_sub8;
		if (null == aClass527_Sub8_Sub8_11994 && aBool12001) {
			Class20 class20 = method18653(class180, 262144, true, (byte) 119);
			class527_sub8_sub8 = (Class527_Sub8_Sub8) (class20 != null ? class20.anObject204 : null);
		} else {
			class527_sub8_sub8 = aClass527_Sub8_Sub8_11994;
			aClass527_Sub8_Sub8_11994 = null;
		}
		Class442 class442 = method10637().aClass442_4927;
		if (null != class527_sub8_sub8)
			aClass555_10867.method9268(class527_sub8_sub8, aByte10862, (int) class442.aFloat4918, (int) class442.aFloat4919, null, (byte) 100);
	}

	boolean method17067() {
		return aBool12000;
	}

	boolean method17045() {
		return aBool12000;
	}

	boolean method17068() {
		return aBool12000;
	}

	void method17078(Class180 class180, Class640_Sub1 class640_sub1, int i, int i_23_, int i_24_, boolean bool) {
		if (class640_sub1 instanceof Class640_Sub1_Sub4_Sub1) {
			Class640_Sub1_Sub4_Sub1 class640_sub1_sub4_sub1_25_ = (Class640_Sub1_Sub4_Sub1) class640_sub1;
			if (aClass176_11992 != null && null != class640_sub1_sub4_sub1_25_.aClass176_11992)
				aClass176_11992.method2881((class640_sub1_sub4_sub1_25_.aClass176_11992), i, i_23_, i_24_, bool);
		}
	}

	void method17062(Class180 class180, Class640_Sub1 class640_sub1, int i, int i_26_, int i_27_, boolean bool) {
		if (class640_sub1 instanceof Class640_Sub1_Sub4_Sub1) {
			Class640_Sub1_Sub4_Sub1 class640_sub1_sub4_sub1_28_ = (Class640_Sub1_Sub4_Sub1) class640_sub1;
			if (aClass176_11992 != null && null != class640_sub1_sub4_sub1_28_.aClass176_11992)
				aClass176_11992.method2881((class640_sub1_sub4_sub1_28_.aClass176_11992), i, i_26_, i_27_, bool);
		}
	}

	Class558 method17063(Class180 class180) {
		if (aClass176_11992 == null)
			return null;
		Class432 class432 = method10612();
		Class558 class558 = Class171_Sub1.method14736(aBool11999, 903924960);
		Class439 class439 = (((Class602) aClass24_Sub6_11995.method81(anInt11996 * -1498968023, -1590697924)).aClass439_7950);
		if (null != class439) {
			aClass176_11992.method2889(class432, null, 0);
			class180.method3536(class432, aClass169Array10863[0], class439);
		} else
			aClass176_11992.method2889(class432, aClass169Array10863[0], 0);
		return class558;
	}

	Class558 method17070(Class180 class180) {
		if (aClass176_11992 == null)
			return null;
		Class432 class432 = method10612();
		Class558 class558 = Class171_Sub1.method14736(aBool11999, -1814705929);
		Class439 class439 = (((Class602) aClass24_Sub6_11995.method81(anInt11996 * -1498968023, -1988790807)).aClass439_7950);
		if (null != class439) {
			aClass176_11992.method2889(class432, null, 0);
			class180.method3536(class432, aClass169Array10863[0], class439);
		} else
			aClass176_11992.method2889(class432, aClass169Array10863[0], 0);
		return class558;
	}

	void method17074() {
		aBool12000 = false;
		if (null != aClass176_11992)
			aClass176_11992.method2941(aClass176_11992.method2874() & ~0x10000);
	}

	void method17075() {
		aBool12000 = false;
		if (null != aClass176_11992)
			aClass176_11992.method2941(aClass176_11992.method2874() & ~0x10000);
	}

	public int method17076() {
		return null != aClass176_11992 ? aClass176_11992.method2896() : 0;
	}

	Class176 method18654(Class180 class180, int i) {
		if (aClass176_11992 != null && class180.method3175(aClass176_11992.method2874(), i) == 0)
			return aClass176_11992;
		Class20 class20 = method18653(class180, i, false, (byte) 87);
		if (null != class20)
			return (Class176) class20.anObject205;
		return null;
	}

	Class176 method18655(Class180 class180, int i) {
		if (aClass176_11992 != null && class180.method3175(aClass176_11992.method2874(), i) == 0)
			return aClass176_11992;
		Class20 class20 = method18653(class180, i, false, (byte) 10);
		if (null != class20)
			return (Class176) class20.anObject205;
		return null;
	}

	Class20 method18656(Class180 class180, int i, boolean bool) {
		Class602 class602 = (Class602) aClass24_Sub6_11995.method81(-1498968023 * anInt11996, 1079880473);
		Class161 class161;
		Class161 class161_29_;
		if (aBool11998) {
			class161 = aClass555_10867.aClass161Array7435[aByte10862];
			class161_29_ = aClass555_10867.aClass161Array7457[0];
		} else {
			class161 = aClass555_10867.aClass161Array7457[aByte10862];
			if (aByte10862 < 3)
				class161_29_ = aClass555_10867.aClass161Array7457[aByte10862 + 1];
			else
				class161_29_ = null;
		}
		Class442 class442 = method10637().aClass442_4927;
		return class602.method9960(class180, i, (Class596.aClass596_7842.anInt7844 * -1736797763), aByte11997, class161, class161_29_, (int) class442.aFloat4918, (int) class442.aFloat4915, (int) class442.aFloat4919, bool, null, 1605202751);
	}

	static final void method18657(Class665 class665, int i) {
		class665.anInt8526 -= 204761682;
		Class679 class679 = (Class679) Class26.method858(Class679.method13904(673878859), (class665.anIntArray8525[class665.anInt8526 * 1769813785]), 308541753);
		Class592 class592 = new Class592(class665.anIntArray8525[1 + 1769813785 * class665.anInt8526]);
		if (-1 == class592.anInt7797 * -342654447)
			throw new RuntimeException("");
		if (Class679.aClass679_8620 != class679 && class679 != Class679.aClass679_8622 && class679 != Class679.aClass679_8623)
			throw new RuntimeException("");
		if (null != client.aClass109_11067) {
			Class527_Sub15 class527_sub15 = Class70.method1489(OutgoingPacket.aClass414_4473, client.aClass109_11067.aClass2_1367, (byte) 31);
			class527_sub15.buffer.writeShort128(class592.anInt7799 * -2029646807, 1856172553);
			class527_sub15.buffer.writeShort(153371143 * class592.anInt7798, 1404835786);
			class527_sub15.buffer.writeByte128(class679.method87(), -362087053);
			client.aClass109_11067.method1969(class527_sub15, (byte) 1);
		}
	}
}
