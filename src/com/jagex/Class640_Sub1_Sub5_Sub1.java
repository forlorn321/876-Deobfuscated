/* Class640_Sub1_Sub5_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class640_Sub1_Sub5_Sub1 extends Class640_Sub1_Sub5 {
	public int anInt12120;
	public int anInt12121;
	public int anInt12122;
	public int anInt12123 = -379057303;
	static Class432 aClass432_12124 = new Class432();
	public Class432 aClass432_12125;
	public int anInt12126;
	public Class432 aClass432_12127;
	public Class432 aClass432_12128;
	public int anInt12129;
	public int anInt12130;
	int anInt12131;
	boolean aBool12132;
	int anInt12133;
	int anInt12134;
	int anInt12135;
	int anInt12136;

	public int method17059() {
		return -329365693 * anInt12130 - method17047(1004008254);
	}

	void method18805(int i) {
		anInt12133 = (32 + (int) (Math.random() * 4.0)) * -492781927;
		anInt12135 = (3 + (int) (Math.random() * 2.0)) * 1060193765;
		anInt12134 = (16 + (int) (Math.random() * 3.0)) * -255987219;
		if (Class204.aClass527_Sub31_2213.aClass700_Sub9_10610.method16924(-1176288418) == 1)
			anInt12136 = (int) (Math.random() * 10.0) * 1602928125;
		else
			anInt12136 = (int) (Math.random() * 20.0) * 1602928125;
	}

	boolean method17069(int i) {
		return false;
	}

	boolean method17072(int i) {
		return aBool12132;
	}

	public Class549 method17064(Class180 class180) {
		return null;
	}

	public Class640_Sub1_Sub5_Sub1(Class555 class555, int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		super(class555, i, i_0_, i_1_, i_2_, i_3_);
		anInt12120 = -688005211;
		aClass432_12127 = null;
		aClass432_12128 = null;
		aClass432_12125 = null;
		anInt12130 = 0;
		anInt12131 = 0;
		aBool12132 = false;
		method17050(3, (short) 28220);
		method18805(1576208961);
	}

	Class558 method17040(Class180 class180, byte i) {
		Class442 class442 = Class442.method7139(method10637().aClass442_4927);
		Class562 class562 = aClass555_10867.method9381(aByte10864, (int) class442.aFloat4918 >> 9, (int) class442.aFloat4919 >> 9, -1381471546);
		Class640_Sub1_Sub4 class640_sub1_sub4 = aClass555_10867.method9256(aByte10864, (int) class442.aFloat4918 >> 9, (int) class442.aFloat4919 >> 9, 1686103084);
		int i_4_ = 0;
		for (/**/; null != class562; class562 = class562.aClass562_7565) {
			if (class562.aClass640_Sub1_Sub2_7564.aBool11773 && (class562.aClass640_Sub1_Sub2_7564.method17047(1004008254) < i_4_))
				i_4_ = class562.aClass640_Sub1_Sub2_7564.method17047(1004008254);
		}
		if (null != class640_sub1_sub4 && class640_sub1_sub4.aShort11871 > -i_4_)
			i_4_ = -class640_sub1_sub4.aShort11871;
		if (i_4_ != anInt12130 * -329365693) {
			class442.aFloat4915 += (float) (i_4_ - anInt12130 * -329365693);
			method10618(class442);
			anInt12130 = -386269845 * i_4_;
		}
		Class432 class432 = class180.method3172();
		class432.method6886();
		if (0 == -329365693 * anInt12130) {
			boolean bool = false;
			boolean bool_5_ = false;
			boolean bool_6_ = false;
			Class161 class161 = aClass555_10867.aClass161Array7434[aByte10862];
			int i_7_ = anInt12131 * 2035310751 << 1;
			int i_8_ = i_7_;
			int i_9_ = -i_7_ / 2;
			int i_10_ = -i_8_ / 2;
			int i_11_ = class161.method2593((int) class442.aFloat4918 + i_9_, i_10_ + (int) class442.aFloat4919, -1151432033);
			int i_12_ = i_7_ / 2;
			int i_13_ = -i_8_ / 2;
			int i_14_ = class161.method2593((int) class442.aFloat4918 + i_12_, i_13_ + (int) class442.aFloat4919, -1151432033);
			int i_15_ = -i_7_ / 2;
			int i_16_ = i_8_ / 2;
			int i_17_ = class161.method2593(i_15_ + (int) class442.aFloat4918, (int) class442.aFloat4919 + i_16_, -1151432033);
			int i_18_ = i_7_ / 2;
			int i_19_ = i_8_ / 2;
			int i_20_ = class161.method2593((int) class442.aFloat4918 + i_18_, i_19_ + (int) class442.aFloat4919, -1151432033);
			int i_21_ = i_11_ < i_14_ ? i_11_ : i_14_;
			int i_22_ = i_17_ < i_20_ ? i_17_ : i_20_;
			int i_23_ = i_14_ < i_20_ ? i_14_ : i_20_;
			int i_24_ = i_11_ < i_17_ ? i_11_ : i_17_;
			if (i_8_ != 0) {
				int i_25_ = ((int) (Math.atan2((double) (i_21_ - i_22_), (double) i_8_) * 2607.5945876176133) & 0x3fff);
				if (0 != i_25_)
					class432.method6936(1.0F, 0.0F, 0.0F, Class428.method6863(i_25_));
			}
			if (i_7_ != 0) {
				int i_26_ = ((int) (Math.atan2((double) (i_24_ - i_23_), (double) i_7_) * 2607.5945876176133) & 0x3fff);
				if (0 != i_26_)
					class432.method6936(0.0F, 0.0F, 1.0F, Class428.method6863(-i_26_));
			}
			int i_27_ = i_20_ + i_11_;
			if (i_14_ + i_17_ < i_27_)
				i_27_ = i_17_ + i_14_;
			i_27_ = (i_27_ >> 1) - (int) class442.aFloat4915;
			if (i_27_ != 0)
				class432.method6896(0.0F, (float) i_27_, 0.0F);
		}
		class442.method7141();
		Class442 class442_28_ = method10637().aClass442_4927;
		class432.method6896(class442_28_.aFloat4918, class442_28_.aFloat4915 - 10.0F, class442_28_.aFloat4919);
		Class558 class558 = Class171_Sub1.method14736(true, -79348127);
		aBool12132 = false;
		anInt12131 = 0;
		if (-1 != anInt12120 * 959320019) {
			Class176 class176 = (((Class9) Class174_Sub2.aClass24_Sub17_9120.method81(anInt12120 * 959320019, 848827804)).method611(class180, 526336, anInt12126 * -1546219151, null, null, 2048964009 * anInt12133, anInt12135 * 948203501, anInt12134 * -982903835, 1086392149 * anInt12136, -1470605921));
			if (null != class176) {
				if (null == aClass432_12125)
					aClass432_12124.method6886();
				else
					aClass432_12124.method6899(aClass432_12125);
				aClass432_12124.method6882(class432);
				class176.method2889(aClass432_12124, aClass169Array10863[2], 0);
				aBool12132 |= class176.method2949();
				anInt12131 = class176.method2893() * 2087238495;
			}
		}
		if (-1 != -838153433 * anInt12123) {
			Class176 class176 = (((Class9) Class174_Sub2.aClass24_Sub17_9120.method81(anInt12123 * -838153433, -1509984634)).method611(class180, 526336, anInt12129 * -796199747, null, null, anInt12133 * 2048964009, anInt12135 * 948203501, -982903835 * anInt12134, 1086392149 * anInt12136, -770838043));
			if (null != class176) {
				if (null == aClass432_12128)
					aClass432_12124.method6886();
				else
					aClass432_12124.method6899(aClass432_12128);
				aClass432_12124.method6882(class432);
				class176.method2889(aClass432_12124, aClass169Array10863[1], 0);
				aBool12132 |= class176.method2949();
				if (class176.method2893() > anInt12131 * 2035310751)
					anInt12131 = class176.method2893() * 2087238495;
			}
		}
		Class176 class176 = (((Class9) Class174_Sub2.aClass24_Sub17_9120.method81(anInt12121 * 569712533, 306874658)).method611(class180, 526336, anInt12122 * 250125625, null, null, 2048964009 * anInt12133, 948203501 * anInt12135, anInt12134 * -982903835, 1086392149 * anInt12136, -1614948835));
		if (class176 != null) {
			if (null == aClass432_12127)
				aClass432_12124.method6886();
			else
				aClass432_12124.method6899(aClass432_12127);
			aClass432_12124.method6882(class432);
			class176.method2889(aClass432_12124, aClass169Array10863[0], 0);
			aBool12132 |= class176.method2949();
			if (class176.method2893() > 2035310751 * anInt12131)
				anInt12131 = class176.method2893() * 2087238495;
		}
		return class558;
	}

	void method17081(Class180 class180, int i) {
		/* empty */
	}

	int method17046(int i) {
		Class9 class9 = (Class9) Class174_Sub2.aClass24_Sub17_9120.method81(anInt12121 * 569712533, 1766115009);
		int i_29_ = class9.anInt145 * -635407399;
		if (-838153433 * anInt12123 != -1) {
			Class9 class9_30_ = (Class9) Class174_Sub2.aClass24_Sub17_9120.method81(-838153433 * anInt12123, -1408135158);
			if (-635407399 * class9_30_.anInt145 > i_29_)
				i_29_ = -635407399 * class9_30_.anInt145;
		}
		if (-1 != anInt12120 * 959320019) {
			Class9 class9_31_ = (Class9) Class174_Sub2.aClass24_Sub17_9120.method81(959320019 * anInt12120, -2011562426);
			if (class9_31_.anInt145 * -635407399 > i_29_)
				i_29_ = -635407399 * class9_31_.anInt145;
		}
		return i_29_;
	}

	boolean method17033(Class180 class180, int i, int i_32_, byte i_33_) {
		Class432 class432 = class180.method3172();
		class432.method6880(method10637());
		class432.method6896(0.0F, -10.0F, 0.0F);
		Class176 class176 = (((Class9) Class174_Sub2.aClass24_Sub17_9120.method81(569712533 * anInt12121, 1284511130)).method611(class180, 131072, 250125625 * anInt12122, null, null, 0, 0, 0, 0, -1047313422));
		if (class176 != null) {
			if (aClass432_12127 == null)
				aClass432_12124.method6886();
			else
				aClass432_12124.method6899(aClass432_12127);
			aClass432_12124.method6882(class432);
			if (class176.method3051(i, i_32_, aClass432_12124, true, 0))
				return true;
		}
		if (anInt12123 * -838153433 != -1) {
			class176 = (((Class9) Class174_Sub2.aClass24_Sub17_9120.method81(anInt12123 * -838153433, -1605410549)).method611(class180, 131072, -796199747 * anInt12129, null, null, 0, 0, 0, 0, -1520243258));
			if (class176 != null) {
				if (null == aClass432_12128)
					aClass432_12124.method6886();
				else
					aClass432_12124.method6899(aClass432_12128);
				aClass432_12124.method6882(class432);
				if (class176.method3051(i, i_32_, aClass432_12124, true, 0))
					return true;
			}
		}
		if (-1 != 959320019 * anInt12120) {
			class176 = (((Class9) Class174_Sub2.aClass24_Sub17_9120.method81(anInt12120 * 959320019, 1098175423)).method611(class180, 131072, -1546219151 * anInt12126, null, null, 0, 0, 0, 0, -1937604440));
			if (class176 != null) {
				if (null == aClass432_12125)
					aClass432_12124.method6886();
				else
					aClass432_12124.method6899(aClass432_12125);
				aClass432_12124.method6882(class432);
				if (class176.method3051(i, i_32_, aClass432_12124, true, 0))
					return true;
			}
		}
		return false;
	}

	boolean method17051() {
		return false;
	}

	void method18806() {
		anInt12133 = (32 + (int) (Math.random() * 4.0)) * -492781927;
		anInt12135 = (3 + (int) (Math.random() * 2.0)) * 1060193765;
		anInt12134 = (16 + (int) (Math.random() * 3.0)) * -255987219;
		if (Class204.aClass527_Sub31_2213.aClass700_Sub9_10610.method16924(27009284) == 1)
			anInt12136 = (int) (Math.random() * 10.0) * 1602928125;
		else
			anInt12136 = (int) (Math.random() * 20.0) * 1602928125;
	}

	int method17087() {
		Class9 class9 = (Class9) Class174_Sub2.aClass24_Sub17_9120.method81(anInt12121 * 569712533, 1054616688);
		int i = class9.anInt145 * -635407399;
		if (-838153433 * anInt12123 != -1) {
			Class9 class9_34_ = (Class9) Class174_Sub2.aClass24_Sub17_9120.method81(-838153433 * anInt12123, 158657027);
			if (-635407399 * class9_34_.anInt145 > i)
				i = -635407399 * class9_34_.anInt145;
		}
		if (-1 != anInt12120 * 959320019) {
			Class9 class9_35_ = (Class9) Class174_Sub2.aClass24_Sub17_9120.method81(959320019 * anInt12120, -1220998531);
			if (class9_35_.anInt145 * -635407399 > i)
				i = -635407399 * class9_35_.anInt145;
		}
		return i;
	}

	boolean method17052() {
		return false;
	}

	boolean method17053() {
		return aBool12132;
	}

	void method18807() {
		anInt12133 = (32 + (int) (Math.random() * 4.0)) * -492781927;
		anInt12135 = (3 + (int) (Math.random() * 2.0)) * 1060193765;
		anInt12134 = (16 + (int) (Math.random() * 3.0)) * -255987219;
		if (Class204.aClass527_Sub31_2213.aClass700_Sub9_10610.method16924(-564443475) == 1)
			anInt12136 = (int) (Math.random() * 10.0) * 1602928125;
		else
			anInt12136 = (int) (Math.random() * 20.0) * 1602928125;
	}

	public static Class432 method18808() {
		Class432 class432 = new Class432();
		class432.method6890(0.0F, 1.0F, 0.0F, (float) (Math.random() * 3.141592653589793 * 2.0));
		float f = (float) (0.5 + 0.5 * Math.random()) * 256.0F;
		class432.method6896(f - 128.0F, 0.0F, 0.0F);
		class432.method6936(0.0F, 1.0F, 0.0F, (float) (Math.random() * 3.141592653589793 * 2.0));
		return class432;
	}

	public Class549 method17057(Class180 class180) {
		return null;
	}

	public Class549 method17058(Class180 class180) {
		return null;
	}

	public Class549 method17085(Class180 class180) {
		return null;
	}

	public int method17035() {
		return -329365693 * anInt12130 - method17047(1004008254);
	}

	public int method17061() {
		return -329365693 * anInt12130 - method17047(1004008254);
	}

	Class558 method17070(Class180 class180) {
		Class442 class442 = Class442.method7139(method10637().aClass442_4927);
		Class562 class562 = aClass555_10867.method9381(aByte10864, (int) class442.aFloat4918 >> 9, (int) class442.aFloat4919 >> 9, -1381471546);
		Class640_Sub1_Sub4 class640_sub1_sub4 = aClass555_10867.method9256(aByte10864, (int) class442.aFloat4918 >> 9, (int) class442.aFloat4919 >> 9, 1739398020);
		int i = 0;
		for (/**/; null != class562; class562 = class562.aClass562_7565) {
			if (class562.aClass640_Sub1_Sub2_7564.aBool11773 && (class562.aClass640_Sub1_Sub2_7564.method17047(1004008254) < i))
				i = class562.aClass640_Sub1_Sub2_7564.method17047(1004008254);
		}
		if (null != class640_sub1_sub4 && class640_sub1_sub4.aShort11871 > -i)
			i = -class640_sub1_sub4.aShort11871;
		if (i != anInt12130 * -329365693) {
			class442.aFloat4915 += (float) (i - anInt12130 * -329365693);
			method10618(class442);
			anInt12130 = -386269845 * i;
		}
		Class432 class432 = class180.method3172();
		class432.method6886();
		if (0 == -329365693 * anInt12130) {
			boolean bool = false;
			boolean bool_36_ = false;
			boolean bool_37_ = false;
			Class161 class161 = aClass555_10867.aClass161Array7434[aByte10862];
			int i_38_ = anInt12131 * 2035310751 << 1;
			int i_39_ = i_38_;
			int i_40_ = -i_38_ / 2;
			int i_41_ = -i_39_ / 2;
			int i_42_ = class161.method2593((int) class442.aFloat4918 + i_40_, i_41_ + (int) class442.aFloat4919, -1151432033);
			int i_43_ = i_38_ / 2;
			int i_44_ = -i_39_ / 2;
			int i_45_ = class161.method2593((int) class442.aFloat4918 + i_43_, i_44_ + (int) class442.aFloat4919, -1151432033);
			int i_46_ = -i_38_ / 2;
			int i_47_ = i_39_ / 2;
			int i_48_ = class161.method2593(i_46_ + (int) class442.aFloat4918, (int) class442.aFloat4919 + i_47_, -1151432033);
			int i_49_ = i_38_ / 2;
			int i_50_ = i_39_ / 2;
			int i_51_ = class161.method2593((int) class442.aFloat4918 + i_49_, i_50_ + (int) class442.aFloat4919, -1151432033);
			int i_52_ = i_42_ < i_45_ ? i_42_ : i_45_;
			int i_53_ = i_48_ < i_51_ ? i_48_ : i_51_;
			int i_54_ = i_45_ < i_51_ ? i_45_ : i_51_;
			int i_55_ = i_42_ < i_48_ ? i_42_ : i_48_;
			if (i_39_ != 0) {
				int i_56_ = ((int) (Math.atan2((double) (i_52_ - i_53_), (double) i_39_) * 2607.5945876176133) & 0x3fff);
				if (0 != i_56_)
					class432.method6936(1.0F, 0.0F, 0.0F, Class428.method6863(i_56_));
			}
			if (i_38_ != 0) {
				int i_57_ = ((int) (Math.atan2((double) (i_55_ - i_54_), (double) i_38_) * 2607.5945876176133) & 0x3fff);
				if (0 != i_57_)
					class432.method6936(0.0F, 0.0F, 1.0F, Class428.method6863(-i_57_));
			}
			int i_58_ = i_51_ + i_42_;
			if (i_45_ + i_48_ < i_58_)
				i_58_ = i_48_ + i_45_;
			i_58_ = (i_58_ >> 1) - (int) class442.aFloat4915;
			if (i_58_ != 0)
				class432.method6896(0.0F, (float) i_58_, 0.0F);
		}
		class442.method7141();
		Class442 class442_59_ = method10637().aClass442_4927;
		class432.method6896(class442_59_.aFloat4918, class442_59_.aFloat4915 - 10.0F, class442_59_.aFloat4919);
		Class558 class558 = Class171_Sub1.method14736(true, 1153077133);
		aBool12132 = false;
		anInt12131 = 0;
		if (-1 != anInt12120 * 959320019) {
			Class176 class176 = (((Class9) Class174_Sub2.aClass24_Sub17_9120.method81(anInt12120 * 959320019, 1814539802)).method611(class180, 526336, anInt12126 * -1546219151, null, null, 2048964009 * anInt12133, anInt12135 * 948203501, anInt12134 * -982903835, 1086392149 * anInt12136, -90827027));
			if (null != class176) {
				if (null == aClass432_12125)
					aClass432_12124.method6886();
				else
					aClass432_12124.method6899(aClass432_12125);
				aClass432_12124.method6882(class432);
				class176.method2889(aClass432_12124, aClass169Array10863[2], 0);
				aBool12132 |= class176.method2949();
				anInt12131 = class176.method2893() * 2087238495;
			}
		}
		if (-1 != -838153433 * anInt12123) {
			Class176 class176 = (((Class9) Class174_Sub2.aClass24_Sub17_9120.method81(anInt12123 * -838153433, 1975447032)).method611(class180, 526336, anInt12129 * -796199747, null, null, anInt12133 * 2048964009, anInt12135 * 948203501, -982903835 * anInt12134, 1086392149 * anInt12136, -1174296283));
			if (null != class176) {
				if (null == aClass432_12128)
					aClass432_12124.method6886();
				else
					aClass432_12124.method6899(aClass432_12128);
				aClass432_12124.method6882(class432);
				class176.method2889(aClass432_12124, aClass169Array10863[1], 0);
				aBool12132 |= class176.method2949();
				if (class176.method2893() > anInt12131 * 2035310751)
					anInt12131 = class176.method2893() * 2087238495;
			}
		}
		Class176 class176 = (((Class9) Class174_Sub2.aClass24_Sub17_9120.method81(anInt12121 * 569712533, 886150441)).method611(class180, 526336, anInt12122 * 250125625, null, null, 2048964009 * anInt12133, 948203501 * anInt12135, anInt12134 * -982903835, 1086392149 * anInt12136, -179901838));
		if (class176 != null) {
			if (null == aClass432_12127)
				aClass432_12124.method6886();
			else
				aClass432_12124.method6899(aClass432_12127);
			aClass432_12124.method6882(class432);
			class176.method2889(aClass432_12124, aClass169Array10863[0], 0);
			aBool12132 |= class176.method2949();
			if (class176.method2893() > 2035310751 * anInt12131)
				anInt12131 = class176.method2893() * 2087238495;
		}
		return class558;
	}

	Class558 method17063(Class180 class180) {
		Class442 class442 = Class442.method7139(method10637().aClass442_4927);
		Class562 class562 = aClass555_10867.method9381(aByte10864, (int) class442.aFloat4918 >> 9, (int) class442.aFloat4919 >> 9, -1381471546);
		Class640_Sub1_Sub4 class640_sub1_sub4 = aClass555_10867.method9256(aByte10864, (int) class442.aFloat4918 >> 9, (int) class442.aFloat4919 >> 9, 1657392204);
		int i = 0;
		for (/**/; null != class562; class562 = class562.aClass562_7565) {
			if (class562.aClass640_Sub1_Sub2_7564.aBool11773 && (class562.aClass640_Sub1_Sub2_7564.method17047(1004008254) < i))
				i = class562.aClass640_Sub1_Sub2_7564.method17047(1004008254);
		}
		if (null != class640_sub1_sub4 && class640_sub1_sub4.aShort11871 > -i)
			i = -class640_sub1_sub4.aShort11871;
		if (i != anInt12130 * -329365693) {
			class442.aFloat4915 += (float) (i - anInt12130 * -329365693);
			method10618(class442);
			anInt12130 = -386269845 * i;
		}
		Class432 class432 = class180.method3172();
		class432.method6886();
		if (0 == -329365693 * anInt12130) {
			boolean bool = false;
			boolean bool_60_ = false;
			boolean bool_61_ = false;
			Class161 class161 = aClass555_10867.aClass161Array7434[aByte10862];
			int i_62_ = anInt12131 * 2035310751 << 1;
			int i_63_ = i_62_;
			int i_64_ = -i_62_ / 2;
			int i_65_ = -i_63_ / 2;
			int i_66_ = class161.method2593((int) class442.aFloat4918 + i_64_, i_65_ + (int) class442.aFloat4919, -1151432033);
			int i_67_ = i_62_ / 2;
			int i_68_ = -i_63_ / 2;
			int i_69_ = class161.method2593((int) class442.aFloat4918 + i_67_, i_68_ + (int) class442.aFloat4919, -1151432033);
			int i_70_ = -i_62_ / 2;
			int i_71_ = i_63_ / 2;
			int i_72_ = class161.method2593(i_70_ + (int) class442.aFloat4918, (int) class442.aFloat4919 + i_71_, -1151432033);
			int i_73_ = i_62_ / 2;
			int i_74_ = i_63_ / 2;
			int i_75_ = class161.method2593((int) class442.aFloat4918 + i_73_, i_74_ + (int) class442.aFloat4919, -1151432033);
			int i_76_ = i_66_ < i_69_ ? i_66_ : i_69_;
			int i_77_ = i_72_ < i_75_ ? i_72_ : i_75_;
			int i_78_ = i_69_ < i_75_ ? i_69_ : i_75_;
			int i_79_ = i_66_ < i_72_ ? i_66_ : i_72_;
			if (i_63_ != 0) {
				int i_80_ = ((int) (Math.atan2((double) (i_76_ - i_77_), (double) i_63_) * 2607.5945876176133) & 0x3fff);
				if (0 != i_80_)
					class432.method6936(1.0F, 0.0F, 0.0F, Class428.method6863(i_80_));
			}
			if (i_62_ != 0) {
				int i_81_ = ((int) (Math.atan2((double) (i_79_ - i_78_), (double) i_62_) * 2607.5945876176133) & 0x3fff);
				if (0 != i_81_)
					class432.method6936(0.0F, 0.0F, 1.0F, Class428.method6863(-i_81_));
			}
			int i_82_ = i_75_ + i_66_;
			if (i_69_ + i_72_ < i_82_)
				i_82_ = i_72_ + i_69_;
			i_82_ = (i_82_ >> 1) - (int) class442.aFloat4915;
			if (i_82_ != 0)
				class432.method6896(0.0F, (float) i_82_, 0.0F);
		}
		class442.method7141();
		Class442 class442_83_ = method10637().aClass442_4927;
		class432.method6896(class442_83_.aFloat4918, class442_83_.aFloat4915 - 10.0F, class442_83_.aFloat4919);
		Class558 class558 = Class171_Sub1.method14736(true, 1474111217);
		aBool12132 = false;
		anInt12131 = 0;
		if (-1 != anInt12120 * 959320019) {
			Class176 class176 = (((Class9) Class174_Sub2.aClass24_Sub17_9120.method81(anInt12120 * 959320019, 1011767094)).method611(class180, 526336, anInt12126 * -1546219151, null, null, 2048964009 * anInt12133, anInt12135 * 948203501, anInt12134 * -982903835, 1086392149 * anInt12136, -51061345));
			if (null != class176) {
				if (null == aClass432_12125)
					aClass432_12124.method6886();
				else
					aClass432_12124.method6899(aClass432_12125);
				aClass432_12124.method6882(class432);
				class176.method2889(aClass432_12124, aClass169Array10863[2], 0);
				aBool12132 |= class176.method2949();
				anInt12131 = class176.method2893() * 2087238495;
			}
		}
		if (-1 != -838153433 * anInt12123) {
			Class176 class176 = (((Class9) Class174_Sub2.aClass24_Sub17_9120.method81(anInt12123 * -838153433, 1756758102)).method611(class180, 526336, anInt12129 * -796199747, null, null, anInt12133 * 2048964009, anInt12135 * 948203501, -982903835 * anInt12134, 1086392149 * anInt12136, -2053887076));
			if (null != class176) {
				if (null == aClass432_12128)
					aClass432_12124.method6886();
				else
					aClass432_12124.method6899(aClass432_12128);
				aClass432_12124.method6882(class432);
				class176.method2889(aClass432_12124, aClass169Array10863[1], 0);
				aBool12132 |= class176.method2949();
				if (class176.method2893() > anInt12131 * 2035310751)
					anInt12131 = class176.method2893() * 2087238495;
			}
		}
		Class176 class176 = (((Class9) Class174_Sub2.aClass24_Sub17_9120.method81(anInt12121 * 569712533, -1080396012)).method611(class180, 526336, anInt12122 * 250125625, null, null, 2048964009 * anInt12133, 948203501 * anInt12135, anInt12134 * -982903835, 1086392149 * anInt12136, -903985528));
		if (class176 != null) {
			if (null == aClass432_12127)
				aClass432_12124.method6886();
			else
				aClass432_12124.method6899(aClass432_12127);
			aClass432_12124.method6882(class432);
			class176.method2889(aClass432_12124, aClass169Array10863[0], 0);
			aBool12132 |= class176.method2949();
			if (class176.method2893() > 2035310751 * anInt12131)
				anInt12131 = class176.method2893() * 2087238495;
		}
		return class558;
	}

	void method17056(Class180 class180) {
		/* empty */
	}

	public Class549 method17042(Class180 class180, int i) {
		return null;
	}

	boolean method17066(Class180 class180, int i, int i_84_) {
		Class432 class432 = class180.method3172();
		class432.method6880(method10637());
		class432.method6896(0.0F, -10.0F, 0.0F);
		Class176 class176 = (((Class9) Class174_Sub2.aClass24_Sub17_9120.method81(569712533 * anInt12121, -1740281108)).method611(class180, 131072, 250125625 * anInt12122, null, null, 0, 0, 0, 0, -105179329));
		if (class176 != null) {
			if (aClass432_12127 == null)
				aClass432_12124.method6886();
			else
				aClass432_12124.method6899(aClass432_12127);
			aClass432_12124.method6882(class432);
			if (class176.method3051(i, i_84_, aClass432_12124, true, 0))
				return true;
		}
		if (anInt12123 * -838153433 != -1) {
			class176 = (((Class9) Class174_Sub2.aClass24_Sub17_9120.method81(anInt12123 * -838153433, 476972634)).method611(class180, 131072, -796199747 * anInt12129, null, null, 0, 0, 0, 0, -344240184));
			if (class176 != null) {
				if (null == aClass432_12128)
					aClass432_12124.method6886();
				else
					aClass432_12124.method6899(aClass432_12128);
				aClass432_12124.method6882(class432);
				if (class176.method3051(i, i_84_, aClass432_12124, true, 0))
					return true;
			}
		}
		if (-1 != 959320019 * anInt12120) {
			class176 = (((Class9) Class174_Sub2.aClass24_Sub17_9120.method81(anInt12120 * 959320019, 1675100562)).method611(class180, 131072, -1546219151 * anInt12126, null, null, 0, 0, 0, 0, -901457199));
			if (class176 != null) {
				if (null == aClass432_12125)
					aClass432_12124.method6886();
				else
					aClass432_12124.method6899(aClass432_12125);
				aClass432_12124.method6882(class432);
				if (class176.method3051(i, i_84_, aClass432_12124, true, 0))
					return true;
			}
		}
		return false;
	}

	public int method17049(byte i) {
		return -329365693 * anInt12130 - method17047(1004008254);
	}

	void method17071(Class180 class180) {
		/* empty */
	}

	void method18809() {
		anInt12133 = (32 + (int) (Math.random() * 4.0)) * -492781927;
		anInt12135 = (3 + (int) (Math.random() * 2.0)) * 1060193765;
		anInt12134 = (16 + (int) (Math.random() * 3.0)) * -255987219;
		if (Class204.aClass527_Sub31_2213.aClass700_Sub9_10610.method16924(-2110027560) == 1)
			anInt12136 = (int) (Math.random() * 10.0) * 1602928125;
		else
			anInt12136 = (int) (Math.random() * 20.0) * 1602928125;
	}

	void method18810() {
		anInt12133 = (32 + (int) (Math.random() * 4.0)) * -492781927;
		anInt12135 = (3 + (int) (Math.random() * 2.0)) * 1060193765;
		anInt12134 = (16 + (int) (Math.random() * 3.0)) * -255987219;
		if (Class204.aClass527_Sub31_2213.aClass700_Sub9_10610.method16924(983211294) == 1)
			anInt12136 = (int) (Math.random() * 10.0) * 1602928125;
		else
			anInt12136 = (int) (Math.random() * 20.0) * 1602928125;
	}

	boolean method17048() {
		return aBool12132;
	}

	public int method17047(int i) {
		return -10;
	}

	int method17036() {
		Class9 class9 = (Class9) Class174_Sub2.aClass24_Sub17_9120.method81(anInt12121 * 569712533, 11911874);
		int i = class9.anInt145 * -635407399;
		if (-838153433 * anInt12123 != -1) {
			Class9 class9_85_ = (Class9) Class174_Sub2.aClass24_Sub17_9120.method81(-838153433 * anInt12123, 683538226);
			if (-635407399 * class9_85_.anInt145 > i)
				i = -635407399 * class9_85_.anInt145;
		}
		if (-1 != anInt12120 * 959320019) {
			Class9 class9_86_ = (Class9) Class174_Sub2.aClass24_Sub17_9120.method81(959320019 * anInt12120, -1407756046);
			if (class9_86_.anInt145 * -635407399 > i)
				i = -635407399 * class9_86_.anInt145;
		}
		return i;
	}

	public int method17076() {
		return -10;
	}

	int method17079() {
		Class9 class9 = (Class9) Class174_Sub2.aClass24_Sub17_9120.method81(anInt12121 * 569712533, 1198859926);
		int i = class9.anInt145 * -635407399;
		if (-838153433 * anInt12123 != -1) {
			Class9 class9_87_ = (Class9) Class174_Sub2.aClass24_Sub17_9120.method81(-838153433 * anInt12123, 2046006110);
			if (-635407399 * class9_87_.anInt145 > i)
				i = -635407399 * class9_87_.anInt145;
		}
		if (-1 != anInt12120 * 959320019) {
			Class9 class9_88_ = (Class9) Class174_Sub2.aClass24_Sub17_9120.method81(959320019 * anInt12120, -1868279373);
			if (class9_88_.anInt145 * -635407399 > i)
				i = -635407399 * class9_88_.anInt145;
		}
		return i;
	}
}
