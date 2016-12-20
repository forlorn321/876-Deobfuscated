/* Class640_Sub1_Sub2_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class640_Sub1_Sub2_Sub1_Sub2 extends Class640_Sub1_Sub2_Sub1 {
	public int anInt12178;
	public String aString12179;
	public boolean aBool12180;
	String aString12181;
	String aString12182;
	public Class633 aClass633_12183;
	public int[] anIntArray12184;
	public Class210 aClass210_12185;
	public int anInt12186;
	public int anInt12187;
	public int anInt12188;
	public int anInt12189;
	public byte aByte12190 = 0;
	public boolean aBool12191;
	public int anInt12192;
	public int anInt12193;
	public int anInt12194;
	public int anInt12195;
	public Class614 aClass614_12196;
	public int anInt12197;
	public int anInt12198;
	int anInt12199;
	public int[] anIntArray12200;
	public int anInt12201;
	public String aString12202;

	boolean method18871(Class180 class180, int i) {
		int i_0_ = i;
		Class587 class587 = method18542(-1323001026);
		Class695 class695 = ((aClass695_11914.method14162(-798239066) && !aClass695_11914.method14172(-668938602)) ? aClass695_11914 : null);
		Class695_Sub2 class695_sub2 = ((aClass695_Sub2_11913.method14162(-572998414) && !aBool12191 && (!aClass695_Sub2_11913.aBool10970 || class695 == null)) ? aClass695_Sub2_11913 : null);
		int i_1_ = 261385821 * class587.anInt7740;
		int i_2_ = 1568751847 * class587.anInt7738;
		if (0 != i_1_ || 0 != i_2_ || -353138087 * class587.anInt7753 != 0 || -1624976099 * class587.anInt7756 != 0)
			i |= 0x7;
		int i_3_ = aClass61_11936.method1384((byte) 1);
		boolean bool = (0 != aByte11898 && client.anInt11019 >= anInt11925 * 974555073 && client.anInt11019 < -834255173 * anInt11926);
		if (bool)
			i |= 0x80000;
		Class176 class176 = (aClass176Array11952[0] = aClass633_12183.method10505(class180, i, Class258.aClass24_Sub2_2827, Class587.aClass24_Sub19_7760, Class381.aClass24_Sub9_3936, Class174_Sub2.aClass24_Sub17_9120, Class671.aClass97_8584, Class671.aClass97_8584, class695, class695_sub2, aClass695_Sub3_Sub1Array11934, anIntArray11935, i_3_, true, Class443.aClass616_4922, -2134450488));
		int i_4_ = Class244.method4614((byte) 11);
		if (Class515.anInt7045 * 814176903 < 96 && i_4_ > 50)
			Class172.method2741(1228826954);
		if (Class73.aClass677_790 != Class677.aClass677_8596 && i_4_ < 50) {
			int i_5_;
			for (i_5_ = 50 - i_4_; i_5_ > -459290003 * client.anInt11018; client.anInt11018 += 2097401701)
				Class398.aByteArrayArray4123[-459290003 * client.anInt11018] = new byte[102400];
			while (i_5_ < client.anInt11018 * -459290003) {
				client.anInt11018 -= 2097401701;
				Class398.aByteArrayArray4123[-459290003 * client.anInt11018] = null;
			}
		} else if (Class73.aClass677_790 != Class677.aClass677_8596) {
			Class398.aByteArrayArray4123 = new byte[50][];
			client.anInt11018 = 0;
		}
		if (null == class176)
			return false;
		anInt11891 = class176.method2896() * 682664935;
		anInt11892 = class176.method2866() * -146167591;
		class176.method2893();
		method18539(class176, (byte) 117);
		if (0 != i_1_ || 0 != i_2_) {
			method18591(i_3_, i_1_, i_2_, 799994947 * class587.anInt7742, class587.anInt7757 * 1386019379, (byte) 78);
			if (299555935 * anInt11927 != 0)
				class176.method2868(anInt11927 * 299555935);
			if (0 != -1105701807 * anInt11943)
				class176.method2869(-1105701807 * anInt11943);
			if (0 != -1914574331 * anInt11888)
				class176.method3015(0, anInt11888 * -1914574331, 0);
		} else
			method18591(i_3_, method18564(-1183391795) << 9, method18564(-1942532583) << 9, 0, 0, (byte) 66);
		if (bool)
			class176.method2986(aByte11887, aByte11907, aByte11929, aByte11898 & 0xff);
		if (!aBool12191)
			method18540(class180, class587, i_0_, i_1_, i_2_, i_3_, -1342969142);
		return true;
	}

	public Class640_Sub1_Sub2_Sub1_Sub2(Class555 class555, int i) {
		super(class555, i, Class248.aClass95_Sub1_Sub1_2731);
		anIntArray12184 = new int[8];
		anIntArray12200 = new int[8];
		anInt12192 = 0;
		anInt12186 = 0;
		anInt12188 = -2086413703;
		anInt12189 = 0;
		anInt12178 = 791414201;
		aBool12191 = false;
		anInt12201 = 0;
		anInt12193 = -2146174309;
		anInt12194 = 332154803;
		anInt12195 = 1639078099;
		anInt12187 = 1607044029;
		anInt12197 = 0;
		anInt12198 = -888625859;
		aClass210_12185 = Class210.aClass210_2251;
		aClass614_12196 = Class614.aClass614_8034;
		aBool12180 = false;
		method18875((byte) 77);
	}

	public void method18872(RSByteBuffer class527_sub38, byte i, int i_6_) {
		aByte12190 = i;
		int i_7_ = -1;
		anInt12201 = 0;
		int[] is = new int[Class443.aClass616_4922.anIntArray8086.length];
		Class23[] class23s = new Class23[Class443.aClass616_4922.anIntArray8086.length];
		Class9[] class9s = new Class9[Class443.aClass616_4922.anIntArray8086.length];
		for (int i_8_ = 0; i_8_ < Class443.aClass616_4922.anIntArray8086.length; i_8_++) {
			if (Class443.aClass616_4922.anIntArray8086[i_8_] != 1) {
				int i_9_ = class527_sub38.readUnsignedByte();
				if (i_9_ == 0)
					is[i_8_] = 0;
				else {
					int i_10_ = class527_sub38.readUnsignedByte();
					int i_11_ = i_10_ + (i_9_ << 8);
					if (0 == i_8_ && i_11_ == 65535) {
						i_7_ = class527_sub38.method16466(-1742673790);
						anInt12201 = (class527_sub38.readUnsignedByte() * 382762303);
						break;
					}
					if (i_11_ >= 16384) {
						i_11_ -= 16384;
						is[i_8_] = i_11_ | 0x40000000;
						class9s[i_8_] = (Class9) Class174_Sub2.aClass24_Sub17_9120.method81(i_11_, -1734491235);
						int i_12_ = class9s[i_8_].anInt140 * -876948871;
						if (i_12_ != 0)
							anInt12201 = 382762303 * i_12_;
					} else
						is[i_8_] = i_11_ - 256 | ~0x7fffffff;
				}
			}
		}
		if (i_7_ == -1) {
			int i_13_ = class527_sub38.readUnsignedShort();
			int i_14_ = 0;
			for (int i_15_ = 0; i_15_ < Class443.aClass616_4922.anIntArray8086.length; i_15_++) {
				if (Class443.aClass616_4922.anIntArray8086[i_15_] == 0) {
					if ((i_13_ & 1 << i_14_) != 0)
						class23s[i_15_] = Class560.method9450(class9s[i_15_], class527_sub38, (byte) -50);
					i_14_++;
				}
			}
		}
		int[] is_16_ = new int[10];
		for (int i_17_ = 0; i_17_ < 10; i_17_++) {
			int i_18_ = class527_sub38.readUnsignedByte();
			if (Class487.aShortArrayArrayArray5470.length < 1 || i_18_ < 0 || (i_18_ >= Class487.aShortArrayArrayArray5470[i_17_][0].length))
				i_18_ = 0;
			is_16_[i_17_] = i_18_;
		}
		int[] is_19_ = new int[10];
		for (int i_20_ = 0; i_20_ < 10; i_20_++) {
			int i_21_ = class527_sub38.readUnsignedByte();
			if (Class78.aShortArrayArrayArray802.length < 1 || i_21_ < 0 || i_21_ >= Class78.aShortArrayArrayArray802[i_20_][0].length)
				i_21_ = 0;
			is_19_[i_20_] = i_21_;
		}
		anInt12199 = class527_sub38.readUnsignedShort() * -1815900771;
		if (aClass633_12183 == null)
			aClass633_12183 = new Class633();
		int i_22_ = 1032231511 * aClass633_12183.anInt8271;
		int[] is_23_ = aClass633_12183.anIntArray8285;
		aClass633_12183.method10476(method18543(763625006), is, class23s, is_16_, is_19_, aByte12190 == 1, i_7_, 2143928738);
		if (i_22_ != i_7_) {
			Class442 class442 = Class442.method7139(method10637().aClass442_4927);
			class442.aFloat4918 = (float) ((anIntArray11902[0] << 9) + (method18564(-1245180123) << 8));
			class442.aFloat4919 = (float) ((anIntArray11944[0] << 9) + (method18564(-1648700598) << 8));
			method10618(class442);
			class442.method7141();
		}
		if (-899375681 * client.anInt11070 == -541403241 * anInt11955 && is_23_ != null) {
			for (int i_24_ = 0; i_24_ < is_16_.length; i_24_++) {
				if (is_23_[i_24_] != is_16_[i_24_]) {
					Class174_Sub2.aClass24_Sub17_9120.method17409(-2059489746);
					break;
				}
			}
		}
		if (aClass613_11949 != null)
			aClass613_11949.method10127();
		if (aClass695_Sub2_11913.method14162(-564037919) && aClass695_Sub2_11913.aBool10970) {
			Class587 class587 = method18542(-1406642945);
			if (!class587.method9787(aClass695_Sub2_11913.method14164(-718927179), -241190558)) {
				aClass695_Sub2_11913.method14165(-1, (byte) 127);
				aClass695_Sub2_11913.aBool10970 = false;
			}
		}
	}

	public final void method18873(RSByteBuffer class527_sub38, int i) {
		class527_sub38.anInt10689 = 0;
		int i_25_ = class527_sub38.readUnsignedByte();
		byte i_26_ = (byte) (i_25_ & 0x1);
		boolean bool = (i_25_ & 0x4) != 0;
		int i_27_ = super.method18564(-1539127226);
		method18585(1 + (i_25_ >> 3 & 0x7), 754311304);
		boolean bool_28_ = 0 != (i_25_ & 0x40);
		boolean bool_29_ = 0 != (i_25_ & 0x80);
		Class442 class442 = Class442.method7139(method10637().aClass442_4927);
		class442.aFloat4918 += (float) (method18564(-1181390151) - i_27_ << 8);
		class442.aFloat4919 += (float) (method18564(-1510454170) - i_27_ << 8);
		method10618(class442);
		class442.method7141();
		if (bool_28_)
			aString12182 = class527_sub38.readVersionedString(90180177);
		else
			aString12182 = null;
		if (bool_29_)
			aString12181 = class527_sub38.readVersionedString(90180177);
		else
			aString12181 = null;
		aClass614_12196 = ((Class614) Class26.method858(Class614.method10174(22987887), class527_sub38.readByte(), 920406164));
		if (Class677.aClass677_8596 == Class73.aClass677_790 && 962135673 * client.anInt11075 >= 2)
			aClass614_12196 = Class614.aClass614_8034;
		method18872(class527_sub38, i_26_, 102380841);
		aString12202 = class527_sub38.readString(985501756);
		aString12179 = aString12202;
		if (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937 == this)
			RuntimeException_Sub1.aString12047 = aString12202;
		anInt12192 = class527_sub38.readUnsignedByte() * -1715955799;
		if (bool) {
			anInt12189 = class527_sub38.readUnsignedShort() * 379579133;
			if (anInt12189 * 1755644501 == 65535)
				anInt12189 = -379579133;
			anInt12186 = anInt12192 * -955720969;
			anInt12188 = -2086413703;
		} else {
			anInt12189 = 0;
			anInt12186 = class527_sub38.readUnsignedByte() * -1635238385;
			anInt12188 = class527_sub38.readUnsignedByte() * 2086413703;
			if (anInt12188 * 975736887 == 255)
				anInt12188 = -2086413703;
		}
		int i_30_ = anInt12197 * 17034299;
		anInt12197 = class527_sub38.readUnsignedByte() * -1889792781;
		if (17034299 * anInt12197 != 0) {
			int i_31_ = -1970690963 * anInt12193;
			int i_32_ = anInt12194 * -834256763;
			int i_33_ = -1614266203 * anInt12195;
			int i_34_ = -1251313557 * anInt12187;
			int i_35_ = anInt12198 * -685065493;
			anInt12193 = class527_sub38.readUnsignedShort() * 2146174309;
			anInt12194 = class527_sub38.readUnsignedShort() * -332154803;
			anInt12195 = class527_sub38.readUnsignedShort() * -1639078099;
			anInt12187 = class527_sub38.readUnsignedShort() * -1607044029;
			anInt12198 = class527_sub38.readUnsignedByte() * 1242897859;
			if (anInt12197 * 17034299 != i_30_ || anInt12193 * -1970690963 != i_31_ || i_32_ != -834256763 * anInt12194 || i_33_ != -1614266203 * anInt12195 || -1251313557 * anInt12187 != i_34_ || i_35_ != anInt12198 * -685065493)
				Class160_Sub1.method14479(this, (byte) 68);
		} else
			Class608.method10087(this, 2012693194);
	}

	public void method18874(RSByteBuffer class527_sub38, int i) {
		class527_sub38.anInt10689 = 0;
		int i_36_ = class527_sub38.readUnsignedByte();
		for (int i_37_ = 0; i_37_ < anIntArray12184.length; i_37_++) {
			if (0 != (i_36_ & 1 << i_37_)) {
				int i_38_ = class527_sub38.readUnsignedByte();
				int i_39_ = class527_sub38.readUnsignedShort();
				anIntArray12184[i_37_] = i_38_;
				anIntArray12200[i_37_] = i_39_;
			} else {
				anIntArray12184[i_37_] = -1;
				anIntArray12200[i_37_] = -1;
			}
		}
	}

	void method18875(byte i) {
		for (int i_40_ = 0; i_40_ < anIntArray12184.length; i_40_++)
			anIntArray12184[i_40_] = -1;
		for (int i_41_ = 0; i_41_ < anIntArray12200.length; i_41_++)
			anIntArray12200[i_41_] = -1;
	}

	public Class549 method17042(Class180 class180, int i) {
		return null;
	}

	Class558 method17040(Class180 class180, byte i) {
		if (null == aClass633_12183 || !method18876(class180, 2048, -541403241))
			return null;
		Class432 class432 = class180.method3172();
		Class432 class432_42_ = method10612();
		Class445 class445 = method10637();
		int i_43_ = aClass61_11936.method1384((byte) 1);
		Class561 class561 = (aClass555_10867.aClass561ArrayArrayArray7426[aByte10864][(int) class445.aClass442_4927.aFloat4918 >> 9][(int) class445.aClass442_4927.aFloat4919 >> 9]);
		if (class561 != null && null != class561.aClass640_Sub1_Sub4_7556) {
			int i_44_ = (anInt11903 * 1017774861 - class561.aClass640_Sub1_Sub4_7556.aShort11871);
			anInt11903 = (int) ((float) (anInt11903 * 1017774861) - (float) i_44_ / 10.0F) * -1593015355;
		} else
			anInt11903 = ((int) ((float) (anInt11903 * 1017774861) - (float) (anInt11903 * 1017774861) / 10.0F) * -1593015355);
		class432.method6899(class432_42_);
		class432.method6896(0.0F, (float) (-20 - 1017774861 * anInt11903), 0.0F);
		Class558 class558 = null;
		aBool11951 = false;
		if (Class204.aClass527_Sub31_2213.aClass700_Sub10_10611.method16939((short) 1260) == 1) {
			Class587 class587 = method18542(-1965725936);
			if (class587.aBool7717 && (1032231511 * aClass633_12183.anInt8271 == -1 || (((Class295) Class381.aClass24_Sub9_3936.method81(((aClass633_12183.anInt8271) * 1032231511), -272025176)).aBool3274))) {
				Class695 class695 = ((aClass695_11914.method14162(-463685880) && aClass695_11914.method14172(-1587131602)) ? aClass695_11914 : null);
				Class695_Sub2 class695_sub2 = ((aClass695_Sub2_11913.method14162(-402401650) && (!aClass695_Sub2_11913.aBool10970 || class695 == null)) ? aClass695_Sub2_11913 : null);
				short i_45_ = Class536.aClass615_7224.aShort8051;
				byte i_46_ = Class536.aClass615_7224.aByte8037;
				if (-1 != aClass633_12183.anInt8271 * 1032231511) {
					i_45_ = ((Class295) (Class381.aClass24_Sub9_3936.method81(1032231511 * aClass633_12183.anInt8271, 1057538322))).aShort3322;
					i_46_ = ((Class295) (Class381.aClass24_Sub9_3936.method81(aClass633_12183.anInt8271 * 1032231511, -2053998951))).aByte3323;
				}
				Object object = null;
				Class176 class176;
				if (i_45_ > -1 && Class204.aClass527_Sub31_2213.aClass700_Sub9_10610.method16924(1765129943) == 1)
					class176 = Class576.method9635(class180, i_43_, 299555935 * anInt11927, anInt11943 * -1105701807, anInt11888 * -1914574331, aClass176Array11952[0], i_45_, i_46_, (class695_sub2 != null ? (Class695) class695_sub2 : class695), (byte) 19);
				else
					class176 = Class35.method1127(class180, i_43_, anInt11927 * 299555935, anInt11943 * -1105701807, anInt11888 * -1914574331, 1, aClass176Array11952[0], 0, 0, 160, 240, (class695_sub2 != null ? (Class695) class695_sub2 : class695), -533604685);
				if (class176 != null) {
					if (null == aClass169Array10863 || (aClass169Array10863.length < 1 + aClass176Array11952.length))
						method17050(1 + aClass176Array11952.length, (short) 23281);
					class558 = Class171_Sub1.method14736(true, -2142713036);
					aBool11951 = true;
					class180.method3182(false);
					class176.method2889(class432, (aClass169Array10863[aClass176Array11952.length]), 0);
					class180.method3182(true);
				}
			}
		}
		if (this == Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937) {
			for (int i_47_ = client.aClass100Array11025.length - 1; i_47_ >= 0; i_47_--) {
				Class100 class100 = client.aClass100Array11025[i_47_];
				if (null != class100 && class100.anInt1183 * -78388695 != -1) {
					if (class100.anInt1176 * -905648307 == 1) {
						Class527_Sub26 class527_sub26 = ((Class527_Sub26) (client.aClass14_10989.method709((long) (1956653959 * class100.anInt1184))));
						if (null != class527_sub26) {
							Class640_Sub1_Sub2_Sub1_Sub1 class640_sub1_sub2_sub1_sub1 = ((Class640_Sub1_Sub2_Sub1_Sub1) class527_sub26.anObject10522);
							Class442 class442 = (Class442.method7155((class640_sub1_sub2_sub1_sub1.method10637().aClass442_4927), Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.method10637().aClass442_4927));
							int i_48_ = (int) class442.aFloat4918;
							int i_49_ = (int) class442.aFloat4919;
							method18887(class180, class432, aClass176Array11952[0], (long) i_48_, (long) i_49_, class100.anInt1183 * -78388695, 92160000L);
						}
					}
					if (-905648307 * class100.anInt1176 == 2) {
						Class442 class442 = (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.method10637().aClass442_4927);
						long l = (long) (class100.anInt1180 * 1807651153 - (int) class442.aFloat4918);
						long l_50_ = (long) (-1019199 * class100.anInt1178 - (int) class442.aFloat4919);
						long l_51_ = (long) (-1210062429 * class100.anInt1182 << 9);
						l_51_ *= l_51_;
						method18887(class180, class432, aClass176Array11952[0], l, l_50_, -78388695 * class100.anInt1183, l_51_);
					}
					if (10 == class100.anInt1176 * -905648307 && class100.anInt1184 * 1956653959 >= 0 && (1956653959 * class100.anInt1184 < (client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161).length)) {
						Class640_Sub1_Sub2_Sub1_Sub2 class640_sub1_sub2_sub1_sub2_52_ = (client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[class100.anInt1184 * 1956653959]);
						if (class640_sub1_sub2_sub1_sub2_52_ != null) {
							Class442 class442 = (Class442.method7155(class640_sub1_sub2_sub1_sub2_52_.method10637().aClass442_4927, Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.method10637().aClass442_4927));
							int i_53_ = (int) class442.aFloat4918;
							int i_54_ = (int) class442.aFloat4919;
							method18887(class180, class432, aClass176Array11952[0], (long) i_53_, (long) i_54_, -78388695 * class100.anInt1183, 92160000L);
						}
					}
				}
			}
		}
		class432.method6899(class432_42_);
		class432.method6896(0.0F, (float) (-5 - 1017774861 * anInt11903), 0.0F);
		if (null == aClass169Array10863 || aClass169Array10863.length < aClass176Array11952.length)
			method17050(aClass176Array11952.length, (short) 16420);
		if (null == class558)
			class558 = Class171_Sub1.method14736(true, 788878971);
		method18532(class180, aClass176Array11952, class432, false, (byte) -22);
		for (int i_55_ = 0; i_55_ < aClass176Array11952.length; i_55_++) {
			if (null != aClass176Array11952[i_55_])
				aClass176Array11952[i_55_].method2889(class432, aClass169Array10863[i_55_], (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937 == this ? 1 : 0));
			else
				aClass169Array10863[i_55_].aBool1874 = false;
		}
		if (aClass613_11949 != null) {
			Class182 class182 = aClass613_11949.method10139();
			class180.method3179(class182);
		}
		for (int i_56_ = 0; i_56_ < aClass176Array11952.length; i_56_++) {
			if (aClass176Array11952[i_56_] != null)
				aBool11951 |= aClass176Array11952[i_56_].method2949();
			aClass176Array11952[i_56_] = null;
		}
		anInt11890 = client.anInt11129 * -1710401247;
		return class558;
	}

	void method17081(Class180 class180, int i) {
		if (aClass633_12183 != null && (aBool11950 || method18876(class180, 0, -541403241))) {
			Class432 class432 = class180.method3172();
			class432.method6880(method10637());
			class432.method6896(0.0F, -5.0F, 0.0F);
			method18532(class180, aClass176Array11952, class432, aBool11950, (byte) 31);
			for (int i_57_ = 0; i_57_ < aClass176Array11952.length; i_57_++)
				aClass176Array11952[i_57_] = null;
		}
	}

	public int method18586() {
		if (null != aClass633_12183 && -1 != 1032231511 * aClass633_12183.anInt8271)
			return ((((Class295) Class381.aClass24_Sub9_3936.method81((1032231511 * (aClass633_12183.anInt8271)), 1024965545)).anInt3342) * 897343531);
		return super.method18564(-1599683099);
	}

	boolean method18876(Class180 class180, int i, int i_58_) {
		int i_59_ = i;
		Class587 class587 = method18542(-2116036283);
		Class695 class695 = ((aClass695_11914.method14162(-1409831919) && !aClass695_11914.method14172(-1390222215)) ? aClass695_11914 : null);
		Class695_Sub2 class695_sub2 = ((aClass695_Sub2_11913.method14162(-1361838127) && !aBool12191 && (!aClass695_Sub2_11913.aBool10970 || class695 == null)) ? aClass695_Sub2_11913 : null);
		int i_60_ = 261385821 * class587.anInt7740;
		int i_61_ = 1568751847 * class587.anInt7738;
		if (0 != i_60_ || 0 != i_61_ || -353138087 * class587.anInt7753 != 0 || -1624976099 * class587.anInt7756 != 0)
			i |= 0x7;
		int i_62_ = aClass61_11936.method1384((byte) 1);
		boolean bool = (0 != aByte11898 && client.anInt11019 >= anInt11925 * 974555073 && client.anInt11019 < -834255173 * anInt11926);
		if (bool)
			i |= 0x80000;
		Class176 class176 = (aClass176Array11952[0] = aClass633_12183.method10505(class180, i, Class258.aClass24_Sub2_2827, Class587.aClass24_Sub19_7760, Class381.aClass24_Sub9_3936, Class174_Sub2.aClass24_Sub17_9120, Class671.aClass97_8584, Class671.aClass97_8584, class695, class695_sub2, aClass695_Sub3_Sub1Array11934, anIntArray11935, i_62_, true, Class443.aClass616_4922, -2136333644));
		int i_63_ = Class244.method4614((byte) 19);
		if (Class515.anInt7045 * 814176903 < 96 && i_63_ > 50)
			Class172.method2741(542497530);
		if (Class73.aClass677_790 != Class677.aClass677_8596 && i_63_ < 50) {
			int i_64_;
			for (i_64_ = 50 - i_63_; i_64_ > -459290003 * client.anInt11018; client.anInt11018 += 2097401701)
				Class398.aByteArrayArray4123[-459290003 * client.anInt11018] = new byte[102400];
			while (i_64_ < client.anInt11018 * -459290003) {
				client.anInt11018 -= 2097401701;
				Class398.aByteArrayArray4123[-459290003 * client.anInt11018] = null;
			}
		} else if (Class73.aClass677_790 != Class677.aClass677_8596) {
			Class398.aByteArrayArray4123 = new byte[50][];
			client.anInt11018 = 0;
		}
		if (null == class176)
			return false;
		anInt11891 = class176.method2896() * 682664935;
		anInt11892 = class176.method2866() * -146167591;
		class176.method2893();
		method18539(class176, (byte) 72);
		if (0 != i_60_ || 0 != i_61_) {
			method18591(i_62_, i_60_, i_61_, 799994947 * class587.anInt7742, class587.anInt7757 * 1386019379, (byte) 31);
			if (299555935 * anInt11927 != 0)
				class176.method2868(anInt11927 * 299555935);
			if (0 != -1105701807 * anInt11943)
				class176.method2869(-1105701807 * anInt11943);
			if (0 != -1914574331 * anInt11888)
				class176.method3015(0, anInt11888 * -1914574331, 0);
		} else
			method18591(i_62_, method18564(-1468239092) << 9, method18564(-1199788802) << 9, 0, 0, (byte) 65);
		if (bool)
			class176.method2986(aByte11887, aByte11907, aByte11929, aByte11898 & 0xff);
		if (!aBool12191)
			method18540(class180, class587, i_59_, i_60_, i_61_, i_62_, -1171814600);
		return true;
	}

	public Class549 method17057(Class180 class180) {
		return null;
	}

	public String method18877(boolean bool, byte i) {
		if (bool)
			return aString12202;
		return aString12179;
	}

	public final void method18878(int i, int i_65_, byte i_66_, byte i_67_) {
		if (aClass695_11914.method14162(-1252731880) && (aClass695_11914.method14163(-1999556760).anInt2185 * -707228641 == 1)) {
			anIntArray11931 = null;
			aClass695_11914.method14165(-1, (byte) 94);
		}
		for (int i_68_ = 0; i_68_ < aClass505Array11915.length; i_68_++) {
			if (-1 != 1429262853 * aClass505Array11915[i_68_].anInt6909) {
				Class685 class685 = ((Class685) Class57.aClass24_Sub4_720.method81(((aClass505Array11915[i_68_].anInt6909) * 1429262853), -689832974));
				if (class685.aBool8665 && -1567837355 * class685.anInt8671 != -1 && (((Class198) (Class321.aClass24_Sub10_3551.method81(-1567837355 * class685.anInt8671, -1249874948))).anInt2185 * -707228641 == 1)) {
					aClass505Array11915[i_68_].aClass695_6911.method14165(-1, (byte) 78);
					aClass505Array11915[i_68_].anInt6909 = 82367795;
				}
			}
		}
		anInt12178 = 791414201;
		if (i < 0 || i >= client.aClass509_11072.method8284((byte) 73) || i_65_ < 0 || i_65_ >= client.aClass509_11072.method8285(317550331))
			method18886(i, i_65_, -100513351);
		else if (anIntArray11902[0] < 0 || (anIntArray11902[0] >= client.aClass509_11072.method8284((byte) 99)) || anIntArray11944[0] < 0 || (anIntArray11944[0] >= client.aClass509_11072.method8285(-1892415385)))
			method18886(i, i_65_, -1327157038);
		else
			method18884(i, i_65_, i_66_, -2055048863);
	}

	boolean method17033(Class180 class180, int i, int i_69_, byte i_70_) {
		if (aClass633_12183 == null || !method18876(class180, 131072, -541403241))
			return false;
		Class432 class432 = method10612();
		boolean bool = false;
		for (int i_71_ = 0; i_71_ < aClass176Array11952.length; i_71_++) {
			if (aClass176Array11952[i_71_] != null && aClass176Array11952[i_71_].aBool1953 && aClass176Array11952[i_71_].method3051(i, i_69_, class432, true, 0)) {
				bool = true;
				break;
			}
		}
		for (int i_72_ = 0; i_72_ < aClass176Array11952.length; i_72_++)
			aClass176Array11952[i_72_] = null;
		return bool;
	}

	public String method18879(boolean bool, byte i) {
		String string = "";
		if (null != aString12182)
			string = aString12182;
		if (bool)
			string = new StringBuilder().append(string).append(aString12202).toString();
		else
			string = new StringBuilder().append(string).append(aString12179).toString();
		if (aString12181 != null)
			string = new StringBuilder().append(string).append(aString12181).toString();
		return string;
	}

	public int method18599() {
		return -1;
	}

	public int method18564(int i) {
		if (null != aClass633_12183 && -1 != 1032231511 * aClass633_12183.anInt8271)
			return (((Class295) Class381.aClass24_Sub9_3936.method81((1032231511 * (aClass633_12183.anInt8271)), 57077441)).anInt3342 * 897343531);
		return super.method18564(-1923334056);
	}

	int method18543(int i) {
		return anInt12199 * -678797131;
	}

	public int method18544(int i) {
		return -1;
	}

	public void method18880(String string, int i, int i_73_) {
		method18598(string, i, i_73_, (Class259.method4781((byte) 43) * (Class536.aClass615_7224.anInt8063 * 273004795)), -441238943);
	}

	final boolean method17037(int i) {
		return false;
	}

	public Class527_Sub36 method189(byte i) {
		Class592 class592 = client.aClass509_11072.method8283((short) 7614);
		return (Class545.method9049(aByte10864, ((int) method10637().aClass442_4927.aFloat4918 + class592.anInt7798 * 1216613888), -(int) method10637().aClass442_4927.aFloat4915, ((int) method10637().aClass442_4927.aFloat4919 + 202920448 * class592.anInt7799), -2133215876));
	}

	final void method18881(int i, int i_74_, byte i_75_) {
		if (anInt11942 * -1057678739 < anIntArray11902.length - 1)
			anInt11942 += 1705181029;
		for (int i_76_ = anInt11942 * -1057678739; i_76_ > 0; i_76_--) {
			anIntArray11902[i_76_] = anIntArray11902[i_76_ - 1];
			anIntArray11944[i_76_] = anIntArray11944[i_76_ - 1];
			aByteArray11945[i_76_] = aByteArray11945[i_76_ - 1];
		}
		anIntArray11902[0] = i;
		anIntArray11944[0] = i_74_;
		aByteArray11945[0] = i_75_;
	}

	public boolean method18554(int i) {
		return Class536.aClass615_7224.aBool8060;
	}

	public Class523 method18547(int i) {
		if (null != aClass523_11921) {
			if (aClass523_11921.aString7090 == null)
				return null;
			if (0 == client.anInt11265 * -604903211 || 3 == -604903211 * client.anInt11265 || (1 == client.anInt11265 * -604903211 && Class628.method10416(aString12179, -1672902771)))
				return aClass523_11921;
		}
		return null;
	}

	public void method18882(String string, int i, int i_77_, int i_78_) {
		method18598(string, i, i_77_, (Class259.method4781((byte) -13) * (Class536.aClass615_7224.anInt8063 * 273004795)), -441238943);
	}

	public Class289 method202(short i) {
		return Class289.aClass289_3221;
	}

	public Class527_Sub36 method188() {
		Class592 class592 = client.aClass509_11072.method8283((short) 17534);
		return (Class545.method9049(aByte10864, ((int) method10637().aClass442_4927.aFloat4918 + class592.anInt7798 * 1216613888), -(int) method10637().aClass442_4927.aFloat4915, ((int) method10637().aClass442_4927.aFloat4919 + 202920448 * class592.anInt7799), -2117431109));
	}

	public Class438 method199() {
		Class438 class438 = Class438.method7020();
		class438.method7030(Class428.method6863(aClass61_11936.anInt725 * 1085423875), 0.0F, 0.0F);
		return class438;
	}

	public Class438 method195(int i) {
		Class438 class438 = Class438.method7020();
		class438.method7030(Class428.method6863(aClass61_11936.anInt725 * 1085423875), 0.0F, 0.0F);
		return class438;
	}

	public Class442 method193() {
		return Class442.method7137();
	}

	public Class523 method18629() {
		if (null != aClass523_11921) {
			if (aClass523_11921.aString7090 == null)
				return null;
			if (0 == client.anInt11265 * -604903211 || 3 == -604903211 * client.anInt11265 || (1 == client.anInt11265 * -604903211 && Class628.method10416(aString12179, -1819284389)))
				return aClass523_11921;
		}
		return null;
	}

	public final boolean method18883(byte i) {
		if (null == aClass633_12183)
			return false;
		return true;
	}

	public Class289 method192() {
		return Class289.aClass289_3221;
	}

	public int method88() {
		return anInt11955 * -541403241;
	}

	final void method18884(int i, int i_79_, byte i_80_, int i_81_) {
		if (anInt11942 * -1057678739 < anIntArray11902.length - 1)
			anInt11942 += 1705181029;
		for (int i_82_ = anInt11942 * -1057678739; i_82_ > 0; i_82_--) {
			anIntArray11902[i_82_] = anIntArray11902[i_82_ - 1];
			anIntArray11944[i_82_] = anIntArray11944[i_82_ - 1];
			aByteArray11945[i_82_] = aByteArray11945[i_82_ - 1];
		}
		anIntArray11902[0] = i;
		anIntArray11944[0] = i_79_;
		aByteArray11945[0] = i_80_;
	}

	public int method51() {
		return anInt11955 * -541403241;
	}

	public int method194() {
		return anInt11955 * -541403241;
	}

	final void method17041(Class180 class180, Class640_Sub1 class640_sub1, int i, int i_83_, int i_84_, boolean bool) {
		throw new IllegalStateException();
	}

	public Class527_Sub36 method197() {
		Class592 class592 = client.aClass509_11072.method8283((short) 29108);
		return (Class545.method9049(aByte10864, ((int) method10637().aClass442_4927.aFloat4918 + class592.anInt7798 * 1216613888), -(int) method10637().aClass442_4927.aFloat4915, ((int) method10637().aClass442_4927.aFloat4919 + 202920448 * class592.anInt7799), -2113016147));
	}

	public Class527_Sub36 method198() {
		Class592 class592 = client.aClass509_11072.method8283((short) 13634);
		return (Class545.method9049(aByte10864, ((int) method10637().aClass442_4927.aFloat4918 + class592.anInt7798 * 1216613888), -(int) method10637().aClass442_4927.aFloat4915, ((int) method10637().aClass442_4927.aFloat4919 + 202920448 * class592.anInt7799), -2072649867));
	}

	public int method18589() {
		if (null != aClass633_12183 && -1 != 1032231511 * aClass633_12183.anInt8271)
			return ((((Class295) Class381.aClass24_Sub9_3936.method81((1032231511 * (aClass633_12183.anInt8271)), -1747901152)).anInt3342) * 897343531);
		return super.method18564(-1996928876);
	}

	public Class438 method196() {
		Class438 class438 = Class438.method7020();
		class438.method7030(Class428.method6863(aClass61_11936.anInt725 * 1085423875), 0.0F, 0.0F);
		return class438;
	}

	public Class442 method201() {
		return Class442.method7137();
	}

	final void method17038(Class180 class180, Class640_Sub1 class640_sub1, int i, int i_85_, int i_86_, boolean bool, int i_87_) {
		throw new IllegalStateException();
	}

	public Class549 method17064(Class180 class180) {
		return null;
	}

	public Class549 method17085(Class180 class180) {
		return null;
	}

	int method18595() {
		return anInt12199 * -678797131;
	}

	public Class549 method17058(Class180 class180) {
		return null;
	}

	Class558 method17070(Class180 class180) {
		if (null == aClass633_12183 || !method18876(class180, 2048, -541403241))
			return null;
		Class432 class432 = class180.method3172();
		Class432 class432_88_ = method10612();
		Class445 class445 = method10637();
		int i = aClass61_11936.method1384((byte) 1);
		Class561 class561 = (aClass555_10867.aClass561ArrayArrayArray7426[aByte10864][(int) class445.aClass442_4927.aFloat4918 >> 9][(int) class445.aClass442_4927.aFloat4919 >> 9]);
		if (class561 != null && null != class561.aClass640_Sub1_Sub4_7556) {
			int i_89_ = (anInt11903 * 1017774861 - class561.aClass640_Sub1_Sub4_7556.aShort11871);
			anInt11903 = (int) ((float) (anInt11903 * 1017774861) - (float) i_89_ / 10.0F) * -1593015355;
		} else
			anInt11903 = ((int) ((float) (anInt11903 * 1017774861) - (float) (anInt11903 * 1017774861) / 10.0F) * -1593015355);
		class432.method6899(class432_88_);
		class432.method6896(0.0F, (float) (-20 - 1017774861 * anInt11903), 0.0F);
		Class558 class558 = null;
		aBool11951 = false;
		if (Class204.aClass527_Sub31_2213.aClass700_Sub10_10611.method16939((short) 1260) == 1) {
			Class587 class587 = method18542(-1392142861);
			if (class587.aBool7717 && (1032231511 * aClass633_12183.anInt8271 == -1 || (((Class295) Class381.aClass24_Sub9_3936.method81(((aClass633_12183.anInt8271) * 1032231511), -488225986)).aBool3274))) {
				Class695 class695 = ((aClass695_11914.method14162(-1212137475) && aClass695_11914.method14172(992750959)) ? aClass695_11914 : null);
				Class695_Sub2 class695_sub2 = ((aClass695_Sub2_11913.method14162(255430936) && (!aClass695_Sub2_11913.aBool10970 || class695 == null)) ? aClass695_Sub2_11913 : null);
				short i_90_ = Class536.aClass615_7224.aShort8051;
				byte i_91_ = Class536.aClass615_7224.aByte8037;
				if (-1 != aClass633_12183.anInt8271 * 1032231511) {
					i_90_ = ((Class295) (Class381.aClass24_Sub9_3936.method81(1032231511 * aClass633_12183.anInt8271, -1468498567))).aShort3322;
					i_91_ = ((Class295) (Class381.aClass24_Sub9_3936.method81(aClass633_12183.anInt8271 * 1032231511, -1736627751))).aByte3323;
				}
				Object object = null;
				Class176 class176;
				if (i_90_ > -1 && Class204.aClass527_Sub31_2213.aClass700_Sub9_10610.method16924(-1025231826) == 1)
					class176 = Class576.method9635(class180, i, 299555935 * anInt11927, anInt11943 * -1105701807, anInt11888 * -1914574331, aClass176Array11952[0], i_90_, i_91_, (class695_sub2 != null ? (Class695) class695_sub2 : class695), (byte) 35);
				else
					class176 = Class35.method1127(class180, i, anInt11927 * 299555935, anInt11943 * -1105701807, anInt11888 * -1914574331, 1, aClass176Array11952[0], 0, 0, 160, 240, (class695_sub2 != null ? (Class695) class695_sub2 : class695), -1186008323);
				if (class176 != null) {
					if (null == aClass169Array10863 || (aClass169Array10863.length < 1 + aClass176Array11952.length))
						method17050(1 + aClass176Array11952.length, (short) 16559);
					class558 = Class171_Sub1.method14736(true, 1580112835);
					aBool11951 = true;
					class180.method3182(false);
					class176.method2889(class432, (aClass169Array10863[aClass176Array11952.length]), 0);
					class180.method3182(true);
				}
			}
		}
		if (this == Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937) {
			for (int i_92_ = client.aClass100Array11025.length - 1; i_92_ >= 0; i_92_--) {
				Class100 class100 = client.aClass100Array11025[i_92_];
				if (null != class100 && class100.anInt1183 * -78388695 != -1) {
					if (class100.anInt1176 * -905648307 == 1) {
						Class527_Sub26 class527_sub26 = ((Class527_Sub26) (client.aClass14_10989.method709((long) (1956653959 * class100.anInt1184))));
						if (null != class527_sub26) {
							Class640_Sub1_Sub2_Sub1_Sub1 class640_sub1_sub2_sub1_sub1 = ((Class640_Sub1_Sub2_Sub1_Sub1) class527_sub26.anObject10522);
							Class442 class442 = (Class442.method7155((class640_sub1_sub2_sub1_sub1.method10637().aClass442_4927), Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.method10637().aClass442_4927));
							int i_93_ = (int) class442.aFloat4918;
							int i_94_ = (int) class442.aFloat4919;
							method18887(class180, class432, aClass176Array11952[0], (long) i_93_, (long) i_94_, class100.anInt1183 * -78388695, 92160000L);
						}
					}
					if (-905648307 * class100.anInt1176 == 2) {
						Class442 class442 = (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.method10637().aClass442_4927);
						long l = (long) (class100.anInt1180 * 1807651153 - (int) class442.aFloat4918);
						long l_95_ = (long) (-1019199 * class100.anInt1178 - (int) class442.aFloat4919);
						long l_96_ = (long) (-1210062429 * class100.anInt1182 << 9);
						l_96_ *= l_96_;
						method18887(class180, class432, aClass176Array11952[0], l, l_95_, -78388695 * class100.anInt1183, l_96_);
					}
					if (10 == class100.anInt1176 * -905648307 && class100.anInt1184 * 1956653959 >= 0 && (1956653959 * class100.anInt1184 < (client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161).length)) {
						Class640_Sub1_Sub2_Sub1_Sub2 class640_sub1_sub2_sub1_sub2_97_ = (client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[class100.anInt1184 * 1956653959]);
						if (class640_sub1_sub2_sub1_sub2_97_ != null) {
							Class442 class442 = (Class442.method7155(class640_sub1_sub2_sub1_sub2_97_.method10637().aClass442_4927, Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.method10637().aClass442_4927));
							int i_98_ = (int) class442.aFloat4918;
							int i_99_ = (int) class442.aFloat4919;
							method18887(class180, class432, aClass176Array11952[0], (long) i_98_, (long) i_99_, -78388695 * class100.anInt1183, 92160000L);
						}
					}
				}
			}
		}
		class432.method6899(class432_88_);
		class432.method6896(0.0F, (float) (-5 - 1017774861 * anInt11903), 0.0F);
		if (null == aClass169Array10863 || aClass169Array10863.length < aClass176Array11952.length)
			method17050(aClass176Array11952.length, (short) 20441);
		if (null == class558)
			class558 = Class171_Sub1.method14736(true, 534438342);
		method18532(class180, aClass176Array11952, class432, false, (byte) -54);
		for (int i_100_ = 0; i_100_ < aClass176Array11952.length; i_100_++) {
			if (null != aClass176Array11952[i_100_])
				aClass176Array11952[i_100_].method2889(class432, aClass169Array10863[i_100_], (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937 == this ? 1 : 0));
			else
				aClass169Array10863[i_100_].aBool1874 = false;
		}
		if (aClass613_11949 != null) {
			Class182 class182 = aClass613_11949.method10139();
			class180.method3179(class182);
		}
		for (int i_101_ = 0; i_101_ < aClass176Array11952.length; i_101_++) {
			if (aClass176Array11952[i_101_] != null)
				aBool11951 |= aClass176Array11952[i_101_].method2949();
			aClass176Array11952[i_101_] = null;
		}
		anInt11890 = client.anInt11129 * -1710401247;
		return class558;
	}

	public Class523 method18533() {
		if (null != aClass523_11921) {
			if (aClass523_11921.aString7090 == null)
				return null;
			if (0 == client.anInt11265 * -604903211 || 3 == -604903211 * client.anInt11265 || (1 == client.anInt11265 * -604903211 && Class628.method10416(aString12179, -1816719816)))
				return aClass523_11921;
		}
		return null;
	}

	void method17056(Class180 class180) {
		if (aClass633_12183 != null && (aBool11950 || method18876(class180, 0, -541403241))) {
			Class432 class432 = class180.method3172();
			class432.method6880(method10637());
			class432.method6896(0.0F, -5.0F, 0.0F);
			method18532(class180, aClass176Array11952, class432, aBool11950, (byte) -34);
			for (int i = 0; i < aClass176Array11952.length; i++)
				aClass176Array11952[i] = null;
		}
	}

	public Class289 method191() {
		return Class289.aClass289_3221;
	}

	public String method18885(boolean bool) {
		if (bool)
			return aString12202;
		return aString12179;
	}

	final boolean method17067() {
		return false;
	}

	final boolean method17045() {
		return false;
	}

	final boolean method17068() {
		return false;
	}

	final void method17078(Class180 class180, Class640_Sub1 class640_sub1, int i, int i_102_, int i_103_, boolean bool) {
		throw new IllegalStateException();
	}

	public void method18886(int i, int i_104_, int i_105_) {
		anInt11942 = 0;
		anInt11947 = 0;
		anInt11946 = 0;
		anIntArray11902[0] = i;
		anIntArray11944[0] = i_104_;
		int i_106_ = method18564(-2104532225);
		Class442 class442 = Class442.method7139(method10637().aClass442_4927);
		class442.aFloat4918 = (float) (anIntArray11902[0] * 512 + 256 * i_106_);
		class442.aFloat4919 = (float) (anIntArray11944[0] * 512 + 256 * i_106_);
		method10618(class442);
		class442.method7141();
		if (this == Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937)
			client.aClass509_11072.method8397(725580722).method10252((short) -31454);
		if (aClass613_11949 != null)
			aClass613_11949.method10127();
	}

	void method18887(Class180 class180, Class432 class432, Class176 class176, long l, long l_107_, int i, long l_108_) {
		long l_109_ = l * l + l_107_ * l_107_;
		if (l_109_ >= 262144L && l_109_ <= l_108_) {
			int i_110_ = ((int) ((Math.atan2((double) l, (double) l_107_) * 2607.5945876176133) - (double) aClass61_11936.method1384((byte) 1)) & 0x3fff);
			Class176 class176_111_ = Class50.method1274(class180, i_110_, 299555935 * anInt11927, -1105701807 * anInt11943, -1914574331 * anInt11888, i, 1021661919);
			if (class176_111_ != null) {
				class180.method3182(false);
				class176_111_.method2889(class432, null, 0);
				class180.method3182(true);
			}
		}
	}

	final void method17073(Class180 class180, Class640_Sub1 class640_sub1, int i, int i_112_, int i_113_, boolean bool) {
		throw new IllegalStateException();
	}

	final void method17074() {
		throw new IllegalStateException();
	}

	final void method17075() {
		throw new IllegalStateException();
	}

	void method18888(Class180 class180, Class432 class432, Class176 class176, long l, long l_114_, int i, long l_115_) {
		long l_116_ = l * l + l_114_ * l_114_;
		if (l_116_ >= 262144L && l_116_ <= l_115_) {
			int i_117_ = ((int) ((Math.atan2((double) l, (double) l_114_) * 2607.5945876176133) - (double) aClass61_11936.method1384((byte) 1)) & 0x3fff);
			Class176 class176_118_ = Class50.method1274(class180, i_117_, 299555935 * anInt11927, -1105701807 * anInt11943, -1914574331 * anInt11888, i, 1818786256);
			if (class176_118_ != null) {
				class180.method3182(false);
				class176_118_.method2889(class432, null, 0);
				class180.method3182(true);
			}
		}
	}

	public int method18587() {
		if (null != aClass633_12183 && -1 != 1032231511 * aClass633_12183.anInt8271)
			return ((((Class295) Class381.aClass24_Sub9_3936.method81((1032231511 * (aClass633_12183.anInt8271)), -1364969013)).anInt3342) * 897343531);
		return super.method18564(-1865795943);
	}

	public void method18889(int i, int i_119_) {
		anInt11942 = 0;
		anInt11947 = 0;
		anInt11946 = 0;
		anIntArray11902[0] = i;
		anIntArray11944[0] = i_119_;
		int i_120_ = method18564(-1883901269);
		Class442 class442 = Class442.method7139(method10637().aClass442_4927);
		class442.aFloat4918 = (float) (anIntArray11902[0] * 512 + 256 * i_120_);
		class442.aFloat4919 = (float) (anIntArray11944[0] * 512 + 256 * i_120_);
		method10618(class442);
		class442.method7141();
		if (this == Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937)
			client.aClass509_11072.method8397(1396716207).method10252((short) -4774);
		if (aClass613_11949 != null)
			aClass613_11949.method10127();
	}

	public int method18588() {
		if (null != aClass633_12183 && -1 != 1032231511 * aClass633_12183.anInt8271)
			return ((((Class295) Class381.aClass24_Sub9_3936.method81((1032231511 * (aClass633_12183.anInt8271)), 1510090255)).anInt3342) * 897343531);
		return super.method18564(-2000664926);
	}

	Class558 method17063(Class180 class180) {
		if (null == aClass633_12183 || !method18876(class180, 2048, -541403241))
			return null;
		Class432 class432 = class180.method3172();
		Class432 class432_121_ = method10612();
		Class445 class445 = method10637();
		int i = aClass61_11936.method1384((byte) 1);
		Class561 class561 = (aClass555_10867.aClass561ArrayArrayArray7426[aByte10864][(int) class445.aClass442_4927.aFloat4918 >> 9][(int) class445.aClass442_4927.aFloat4919 >> 9]);
		if (class561 != null && null != class561.aClass640_Sub1_Sub4_7556) {
			int i_122_ = (anInt11903 * 1017774861 - class561.aClass640_Sub1_Sub4_7556.aShort11871);
			anInt11903 = (int) ((float) (anInt11903 * 1017774861) - (float) i_122_ / 10.0F) * -1593015355;
		} else
			anInt11903 = ((int) ((float) (anInt11903 * 1017774861) - (float) (anInt11903 * 1017774861) / 10.0F) * -1593015355);
		class432.method6899(class432_121_);
		class432.method6896(0.0F, (float) (-20 - 1017774861 * anInt11903), 0.0F);
		Class558 class558 = null;
		aBool11951 = false;
		if (Class204.aClass527_Sub31_2213.aClass700_Sub10_10611.method16939((short) 1260) == 1) {
			Class587 class587 = method18542(-2131136382);
			if (class587.aBool7717 && (1032231511 * aClass633_12183.anInt8271 == -1 || (((Class295) Class381.aClass24_Sub9_3936.method81(((aClass633_12183.anInt8271) * 1032231511), -287129734)).aBool3274))) {
				Class695 class695 = ((aClass695_11914.method14162(-669401010) && aClass695_11914.method14172(-2007631639)) ? aClass695_11914 : null);
				Class695_Sub2 class695_sub2 = ((aClass695_Sub2_11913.method14162(-1732184103) && (!aClass695_Sub2_11913.aBool10970 || class695 == null)) ? aClass695_Sub2_11913 : null);
				short i_123_ = Class536.aClass615_7224.aShort8051;
				byte i_124_ = Class536.aClass615_7224.aByte8037;
				if (-1 != aClass633_12183.anInt8271 * 1032231511) {
					i_123_ = ((Class295) (Class381.aClass24_Sub9_3936.method81(1032231511 * aClass633_12183.anInt8271, 1594130790))).aShort3322;
					i_124_ = ((Class295) (Class381.aClass24_Sub9_3936.method81(aClass633_12183.anInt8271 * 1032231511, 1639854926))).aByte3323;
				}
				Object object = null;
				Class176 class176;
				if (i_123_ > -1 && Class204.aClass527_Sub31_2213.aClass700_Sub9_10610.method16924(1978614931) == 1)
					class176 = Class576.method9635(class180, i, 299555935 * anInt11927, anInt11943 * -1105701807, anInt11888 * -1914574331, aClass176Array11952[0], i_123_, i_124_, (class695_sub2 != null ? (Class695) class695_sub2 : class695), (byte) 58);
				else
					class176 = Class35.method1127(class180, i, anInt11927 * 299555935, anInt11943 * -1105701807, anInt11888 * -1914574331, 1, aClass176Array11952[0], 0, 0, 160, 240, (class695_sub2 != null ? (Class695) class695_sub2 : class695), -1947931121);
				if (class176 != null) {
					if (null == aClass169Array10863 || (aClass169Array10863.length < 1 + aClass176Array11952.length))
						method17050(1 + aClass176Array11952.length, (short) 29578);
					class558 = Class171_Sub1.method14736(true, 319703893);
					aBool11951 = true;
					class180.method3182(false);
					class176.method2889(class432, (aClass169Array10863[aClass176Array11952.length]), 0);
					class180.method3182(true);
				}
			}
		}
		if (this == Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937) {
			for (int i_125_ = client.aClass100Array11025.length - 1; i_125_ >= 0; i_125_--) {
				Class100 class100 = client.aClass100Array11025[i_125_];
				if (null != class100 && class100.anInt1183 * -78388695 != -1) {
					if (class100.anInt1176 * -905648307 == 1) {
						Class527_Sub26 class527_sub26 = ((Class527_Sub26) (client.aClass14_10989.method709((long) (1956653959 * class100.anInt1184))));
						if (null != class527_sub26) {
							Class640_Sub1_Sub2_Sub1_Sub1 class640_sub1_sub2_sub1_sub1 = ((Class640_Sub1_Sub2_Sub1_Sub1) class527_sub26.anObject10522);
							Class442 class442 = (Class442.method7155((class640_sub1_sub2_sub1_sub1.method10637().aClass442_4927), Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.method10637().aClass442_4927));
							int i_126_ = (int) class442.aFloat4918;
							int i_127_ = (int) class442.aFloat4919;
							method18887(class180, class432, aClass176Array11952[0], (long) i_126_, (long) i_127_, class100.anInt1183 * -78388695, 92160000L);
						}
					}
					if (-905648307 * class100.anInt1176 == 2) {
						Class442 class442 = (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.method10637().aClass442_4927);
						long l = (long) (class100.anInt1180 * 1807651153 - (int) class442.aFloat4918);
						long l_128_ = (long) (-1019199 * class100.anInt1178 - (int) class442.aFloat4919);
						long l_129_ = (long) (-1210062429 * class100.anInt1182 << 9);
						l_129_ *= l_129_;
						method18887(class180, class432, aClass176Array11952[0], l, l_128_, -78388695 * class100.anInt1183, l_129_);
					}
					if (10 == class100.anInt1176 * -905648307 && class100.anInt1184 * 1956653959 >= 0 && (1956653959 * class100.anInt1184 < (client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161).length)) {
						Class640_Sub1_Sub2_Sub1_Sub2 class640_sub1_sub2_sub1_sub2_130_ = (client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[class100.anInt1184 * 1956653959]);
						if (class640_sub1_sub2_sub1_sub2_130_ != null) {
							Class442 class442 = (Class442.method7155(class640_sub1_sub2_sub1_sub2_130_.method10637().aClass442_4927, Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.method10637().aClass442_4927));
							int i_131_ = (int) class442.aFloat4918;
							int i_132_ = (int) class442.aFloat4919;
							method18887(class180, class432, aClass176Array11952[0], (long) i_131_, (long) i_132_, -78388695 * class100.anInt1183, 92160000L);
						}
					}
				}
			}
		}
		class432.method6899(class432_121_);
		class432.method6896(0.0F, (float) (-5 - 1017774861 * anInt11903), 0.0F);
		if (null == aClass169Array10863 || aClass169Array10863.length < aClass176Array11952.length)
			method17050(aClass176Array11952.length, (short) 16516);
		if (null == class558)
			class558 = Class171_Sub1.method14736(true, 442225961);
		method18532(class180, aClass176Array11952, class432, false, (byte) 67);
		for (int i_133_ = 0; i_133_ < aClass176Array11952.length; i_133_++) {
			if (null != aClass176Array11952[i_133_])
				aClass176Array11952[i_133_].method2889(class432, aClass169Array10863[i_133_], (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937 == this ? 1 : 0));
			else
				aClass169Array10863[i_133_].aBool1874 = false;
		}
		if (aClass613_11949 != null) {
			Class182 class182 = aClass613_11949.method10139();
			class180.method3179(class182);
		}
		for (int i_134_ = 0; i_134_ < aClass176Array11952.length; i_134_++) {
			if (aClass176Array11952[i_134_] != null)
				aBool11951 |= aClass176Array11952[i_134_].method2949();
			aClass176Array11952[i_134_] = null;
		}
		anInt11890 = client.anInt11129 * -1710401247;
		return class558;
	}

	boolean method17066(Class180 class180, int i, int i_135_) {
		if (aClass633_12183 == null || !method18876(class180, 131072, -541403241))
			return false;
		Class432 class432 = method10612();
		boolean bool = false;
		for (int i_136_ = 0; i_136_ < aClass176Array11952.length; i_136_++) {
			if (aClass176Array11952[i_136_] != null && aClass176Array11952[i_136_].aBool1953 && aClass176Array11952[i_136_].method3051(i, i_135_, class432, true, 0)) {
				bool = true;
				break;
			}
		}
		for (int i_137_ = 0; i_137_ < aClass176Array11952.length; i_137_++)
			aClass176Array11952[i_137_] = null;
		return bool;
	}

	int method18596() {
		return anInt12199 * -678797131;
	}

	public Class640_Sub1_Sub2_Sub1_Sub2(Class555 class555) {
		super(class555, Class248.aClass95_Sub1_Sub1_2731);
		anIntArray12184 = new int[8];
		anIntArray12200 = new int[8];
		anInt12192 = 0;
		anInt12186 = 0;
		anInt12188 = -2086413703;
		anInt12189 = 0;
		anInt12178 = 791414201;
		aBool12191 = false;
		anInt12201 = 0;
		anInt12193 = -2146174309;
		anInt12194 = 332154803;
		anInt12195 = 1639078099;
		anInt12187 = 1607044029;
		anInt12197 = 0;
		anInt12198 = -888625859;
		aClass210_12185 = Class210.aClass210_2251;
		aClass614_12196 = Class614.aClass614_8034;
		aBool12180 = false;
		method18875((byte) 83);
	}

	int method18618() {
		return anInt12199 * -678797131;
	}

	final void method17039(int i) {
		throw new IllegalStateException();
	}

	final void method18890(int i, int i_138_, byte i_139_) {
		if (anInt11942 * -1057678739 < anIntArray11902.length - 1)
			anInt11942 += 1705181029;
		for (int i_140_ = anInt11942 * -1057678739; i_140_ > 0; i_140_--) {
			anIntArray11902[i_140_] = anIntArray11902[i_140_ - 1];
			anIntArray11944[i_140_] = anIntArray11944[i_140_ - 1];
			aByteArray11945[i_140_] = aByteArray11945[i_140_ - 1];
		}
		anIntArray11902[0] = i;
		anIntArray11944[0] = i_138_;
		aByteArray11945[0] = i_139_;
	}

	public boolean method18604() {
		return Class536.aClass615_7224.aBool8060;
	}

	public boolean method18605() {
		return Class536.aClass615_7224.aBool8060;
	}

	public boolean method18606() {
		return Class536.aClass615_7224.aBool8060;
	}

	public int method18553(int i) {
		return -(anInt11955 * -541403241) - 1;
	}

	public int method18623() {
		return -(anInt11955 * -541403241) - 1;
	}

	void method18891() {
		for (int i = 0; i < anIntArray12184.length; i++)
			anIntArray12184[i] = -1;
		for (int i = 0; i < anIntArray12200.length; i++)
			anIntArray12200[i] = -1;
	}

	public int method18625() {
		return -(anInt11955 * -541403241) - 1;
	}

	public void method18892(RSByteBuffer class527_sub38, byte i) {
		aByte12190 = i;
		int i_141_ = -1;
		anInt12201 = 0;
		int[] is = new int[Class443.aClass616_4922.anIntArray8086.length];
		Class23[] class23s = new Class23[Class443.aClass616_4922.anIntArray8086.length];
		Class9[] class9s = new Class9[Class443.aClass616_4922.anIntArray8086.length];
		for (int i_142_ = 0; i_142_ < Class443.aClass616_4922.anIntArray8086.length; i_142_++) {
			if (Class443.aClass616_4922.anIntArray8086[i_142_] != 1) {
				int i_143_ = class527_sub38.readUnsignedByte();
				if (i_143_ == 0)
					is[i_142_] = 0;
				else {
					int i_144_ = class527_sub38.readUnsignedByte();
					int i_145_ = i_144_ + (i_143_ << 8);
					if (0 == i_142_ && i_145_ == 65535) {
						i_141_ = class527_sub38.method16466(-1783625640);
						anInt12201 = (class527_sub38.readUnsignedByte() * 382762303);
						break;
					}
					if (i_145_ >= 16384) {
						i_145_ -= 16384;
						is[i_142_] = i_145_ | 0x40000000;
						class9s[i_142_] = (Class9) Class174_Sub2.aClass24_Sub17_9120.method81(i_145_, -897169444);
						int i_146_ = class9s[i_142_].anInt140 * -876948871;
						if (i_146_ != 0)
							anInt12201 = 382762303 * i_146_;
					} else
						is[i_142_] = i_145_ - 256 | ~0x7fffffff;
				}
			}
		}
		if (i_141_ == -1) {
			int i_147_ = class527_sub38.readUnsignedShort();
			int i_148_ = 0;
			for (int i_149_ = 0; i_149_ < Class443.aClass616_4922.anIntArray8086.length; i_149_++) {
				if (Class443.aClass616_4922.anIntArray8086[i_149_] == 0) {
					if ((i_147_ & 1 << i_148_) != 0)
						class23s[i_149_] = Class560.method9450(class9s[i_149_], class527_sub38, (byte) -49);
					i_148_++;
				}
			}
		}
		int[] is_150_ = new int[10];
		for (int i_151_ = 0; i_151_ < 10; i_151_++) {
			int i_152_ = class527_sub38.readUnsignedByte();
			if (Class487.aShortArrayArrayArray5470.length < 1 || i_152_ < 0 || (i_152_ >= Class487.aShortArrayArrayArray5470[i_151_][0].length))
				i_152_ = 0;
			is_150_[i_151_] = i_152_;
		}
		int[] is_153_ = new int[10];
		for (int i_154_ = 0; i_154_ < 10; i_154_++) {
			int i_155_ = class527_sub38.readUnsignedByte();
			if (Class78.aShortArrayArrayArray802.length < 1 || i_155_ < 0 || (i_155_ >= Class78.aShortArrayArrayArray802[i_154_][0].length))
				i_155_ = 0;
			is_153_[i_154_] = i_155_;
		}
		anInt12199 = class527_sub38.readUnsignedShort() * -1815900771;
		if (aClass633_12183 == null)
			aClass633_12183 = new Class633();
		int i_156_ = 1032231511 * aClass633_12183.anInt8271;
		int[] is_157_ = aClass633_12183.anIntArray8285;
		aClass633_12183.method10476(method18543(1064488345), is, class23s, is_150_, is_153_, aByte12190 == 1, i_141_, 2133522124);
		if (i_156_ != i_141_) {
			Class442 class442 = Class442.method7139(method10637().aClass442_4927);
			class442.aFloat4918 = (float) ((anIntArray11902[0] << 9) + (method18564(-1632941535) << 8));
			class442.aFloat4919 = (float) ((anIntArray11944[0] << 9) + (method18564(-1245047623) << 8));
			method10618(class442);
			class442.method7141();
		}
		if (-899375681 * client.anInt11070 == -541403241 * anInt11955 && is_157_ != null) {
			for (int i_158_ = 0; i_158_ < is_150_.length; i_158_++) {
				if (is_157_[i_158_] != is_150_[i_158_]) {
					Class174_Sub2.aClass24_Sub17_9120.method17409(-1526724143);
					break;
				}
			}
		}
		if (aClass613_11949 != null)
			aClass613_11949.method10127();
		if (aClass695_Sub2_11913.method14162(-1553678507) && aClass695_Sub2_11913.aBool10970) {
			Class587 class587 = method18542(-2142179799);
			if (!class587.method9787(aClass695_Sub2_11913.method14164(-329746296), -755387881)) {
				aClass695_Sub2_11913.method14165(-1, (byte) 11);
				aClass695_Sub2_11913.aBool10970 = false;
			}
		}
	}

	public final void method18893(RSByteBuffer class527_sub38) {
		class527_sub38.anInt10689 = 0;
		int i = class527_sub38.readUnsignedByte();
		byte i_159_ = (byte) (i & 0x1);
		boolean bool = (i & 0x4) != 0;
		int i_160_ = super.method18564(-1450360377);
		method18585(1 + (i >> 3 & 0x7), 1157236113);
		boolean bool_161_ = 0 != (i & 0x40);
		boolean bool_162_ = 0 != (i & 0x80);
		Class442 class442 = Class442.method7139(method10637().aClass442_4927);
		class442.aFloat4918 += (float) (method18564(-1538885111) - i_160_ << 8);
		class442.aFloat4919 += (float) (method18564(-1256645089) - i_160_ << 8);
		method10618(class442);
		class442.method7141();
		if (bool_161_)
			aString12182 = class527_sub38.readVersionedString(90180177);
		else
			aString12182 = null;
		if (bool_162_)
			aString12181 = class527_sub38.readVersionedString(90180177);
		else
			aString12181 = null;
		aClass614_12196 = ((Class614) Class26.method858(Class614.method10174(2108404774), class527_sub38.readByte(), -40474565));
		if (Class677.aClass677_8596 == Class73.aClass677_790 && 962135673 * client.anInt11075 >= 2)
			aClass614_12196 = Class614.aClass614_8034;
		method18872(class527_sub38, i_159_, 102380841);
		aString12202 = class527_sub38.readString(1133342023);
		aString12179 = aString12202;
		if (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937 == this)
			RuntimeException_Sub1.aString12047 = aString12202;
		anInt12192 = class527_sub38.readUnsignedByte() * -1715955799;
		if (bool) {
			anInt12189 = class527_sub38.readUnsignedShort() * 379579133;
			if (anInt12189 * 1755644501 == 65535)
				anInt12189 = -379579133;
			anInt12186 = anInt12192 * -955720969;
			anInt12188 = -2086413703;
		} else {
			anInt12189 = 0;
			anInt12186 = class527_sub38.readUnsignedByte() * -1635238385;
			anInt12188 = class527_sub38.readUnsignedByte() * 2086413703;
			if (anInt12188 * 975736887 == 255)
				anInt12188 = -2086413703;
		}
		int i_163_ = anInt12197 * 17034299;
		anInt12197 = class527_sub38.readUnsignedByte() * -1889792781;
		if (17034299 * anInt12197 != 0) {
			int i_164_ = -1970690963 * anInt12193;
			int i_165_ = anInt12194 * -834256763;
			int i_166_ = -1614266203 * anInt12195;
			int i_167_ = -1251313557 * anInt12187;
			int i_168_ = anInt12198 * -685065493;
			anInt12193 = class527_sub38.readUnsignedShort() * 2146174309;
			anInt12194 = class527_sub38.readUnsignedShort() * -332154803;
			anInt12195 = class527_sub38.readUnsignedShort() * -1639078099;
			anInt12187 = class527_sub38.readUnsignedShort() * -1607044029;
			anInt12198 = class527_sub38.readUnsignedByte() * 1242897859;
			if (anInt12197 * 17034299 != i_163_ || anInt12193 * -1970690963 != i_164_ || i_165_ != -834256763 * anInt12194 || i_166_ != -1614266203 * anInt12195 || -1251313557 * anInt12187 != i_167_ || i_168_ != anInt12198 * -685065493)
				Class160_Sub1.method14479(this, (byte) -10);
		} else
			Class608.method10087(this, -1181113434);
	}

	public final void method18894(RSByteBuffer class527_sub38) {
		class527_sub38.anInt10689 = 0;
		int i = class527_sub38.readUnsignedByte();
		byte i_169_ = (byte) (i & 0x1);
		boolean bool = (i & 0x4) != 0;
		int i_170_ = super.method18564(-1699176557);
		method18585(1 + (i >> 3 & 0x7), 1673654504);
		boolean bool_171_ = 0 != (i & 0x40);
		boolean bool_172_ = 0 != (i & 0x80);
		Class442 class442 = Class442.method7139(method10637().aClass442_4927);
		class442.aFloat4918 += (float) (method18564(-1427416082) - i_170_ << 8);
		class442.aFloat4919 += (float) (method18564(-1539206066) - i_170_ << 8);
		method10618(class442);
		class442.method7141();
		if (bool_171_)
			aString12182 = class527_sub38.readVersionedString(90180177);
		else
			aString12182 = null;
		if (bool_172_)
			aString12181 = class527_sub38.readVersionedString(90180177);
		else
			aString12181 = null;
		aClass614_12196 = ((Class614) Class26.method858(Class614.method10174(1691948313), class527_sub38.readByte(), -150403242));
		if (Class677.aClass677_8596 == Class73.aClass677_790 && 962135673 * client.anInt11075 >= 2)
			aClass614_12196 = Class614.aClass614_8034;
		method18872(class527_sub38, i_169_, 102380841);
		aString12202 = class527_sub38.readString(933991179);
		aString12179 = aString12202;
		if (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937 == this)
			RuntimeException_Sub1.aString12047 = aString12202;
		anInt12192 = class527_sub38.readUnsignedByte() * -1715955799;
		if (bool) {
			anInt12189 = class527_sub38.readUnsignedShort() * 379579133;
			if (anInt12189 * 1755644501 == 65535)
				anInt12189 = -379579133;
			anInt12186 = anInt12192 * -955720969;
			anInt12188 = -2086413703;
		} else {
			anInt12189 = 0;
			anInt12186 = class527_sub38.readUnsignedByte() * -1635238385;
			anInt12188 = class527_sub38.readUnsignedByte() * 2086413703;
			if (anInt12188 * 975736887 == 255)
				anInt12188 = -2086413703;
		}
		int i_173_ = anInt12197 * 17034299;
		anInt12197 = class527_sub38.readUnsignedByte() * -1889792781;
		if (17034299 * anInt12197 != 0) {
			int i_174_ = -1970690963 * anInt12193;
			int i_175_ = anInt12194 * -834256763;
			int i_176_ = -1614266203 * anInt12195;
			int i_177_ = -1251313557 * anInt12187;
			int i_178_ = anInt12198 * -685065493;
			anInt12193 = class527_sub38.readUnsignedShort() * 2146174309;
			anInt12194 = class527_sub38.readUnsignedShort() * -332154803;
			anInt12195 = class527_sub38.readUnsignedShort() * -1639078099;
			anInt12187 = class527_sub38.readUnsignedShort() * -1607044029;
			anInt12198 = class527_sub38.readUnsignedByte() * 1242897859;
			if (anInt12197 * 17034299 != i_173_ || anInt12193 * -1970690963 != i_174_ || i_175_ != -834256763 * anInt12194 || i_176_ != -1614266203 * anInt12195 || -1251313557 * anInt12187 != i_177_ || i_178_ != anInt12198 * -685065493)
				Class160_Sub1.method14479(this, (byte) -12);
		} else
			Class608.method10087(this, 504864074);
	}

	public final void method18895(RSByteBuffer class527_sub38) {
		class527_sub38.anInt10689 = 0;
		int i = class527_sub38.readUnsignedByte();
		byte i_179_ = (byte) (i & 0x1);
		boolean bool = (i & 0x4) != 0;
		int i_180_ = super.method18564(-1433869404);
		method18585(1 + (i >> 3 & 0x7), 1979833150);
		boolean bool_181_ = 0 != (i & 0x40);
		boolean bool_182_ = 0 != (i & 0x80);
		Class442 class442 = Class442.method7139(method10637().aClass442_4927);
		class442.aFloat4918 += (float) (method18564(-1879971183) - i_180_ << 8);
		class442.aFloat4919 += (float) (method18564(-1794608111) - i_180_ << 8);
		method10618(class442);
		class442.method7141();
		if (bool_181_)
			aString12182 = class527_sub38.readVersionedString(90180177);
		else
			aString12182 = null;
		if (bool_182_)
			aString12181 = class527_sub38.readVersionedString(90180177);
		else
			aString12181 = null;
		aClass614_12196 = ((Class614) Class26.method858(Class614.method10174(1314353767), class527_sub38.readByte(), -35288357));
		if (Class677.aClass677_8596 == Class73.aClass677_790 && 962135673 * client.anInt11075 >= 2)
			aClass614_12196 = Class614.aClass614_8034;
		method18872(class527_sub38, i_179_, 102380841);
		aString12202 = class527_sub38.readString(1706128529);
		aString12179 = aString12202;
		if (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937 == this)
			RuntimeException_Sub1.aString12047 = aString12202;
		anInt12192 = class527_sub38.readUnsignedByte() * -1715955799;
		if (bool) {
			anInt12189 = class527_sub38.readUnsignedShort() * 379579133;
			if (anInt12189 * 1755644501 == 65535)
				anInt12189 = -379579133;
			anInt12186 = anInt12192 * -955720969;
			anInt12188 = -2086413703;
		} else {
			anInt12189 = 0;
			anInt12186 = class527_sub38.readUnsignedByte() * -1635238385;
			anInt12188 = class527_sub38.readUnsignedByte() * 2086413703;
			if (anInt12188 * 975736887 == 255)
				anInt12188 = -2086413703;
		}
		int i_183_ = anInt12197 * 17034299;
		anInt12197 = class527_sub38.readUnsignedByte() * -1889792781;
		if (17034299 * anInt12197 != 0) {
			int i_184_ = -1970690963 * anInt12193;
			int i_185_ = anInt12194 * -834256763;
			int i_186_ = -1614266203 * anInt12195;
			int i_187_ = -1251313557 * anInt12187;
			int i_188_ = anInt12198 * -685065493;
			anInt12193 = class527_sub38.readUnsignedShort() * 2146174309;
			anInt12194 = class527_sub38.readUnsignedShort() * -332154803;
			anInt12195 = class527_sub38.readUnsignedShort() * -1639078099;
			anInt12187 = class527_sub38.readUnsignedShort() * -1607044029;
			anInt12198 = class527_sub38.readUnsignedByte() * 1242897859;
			if (anInt12197 * 17034299 != i_183_ || anInt12193 * -1970690963 != i_184_ || i_185_ != -834256763 * anInt12194 || i_186_ != -1614266203 * anInt12195 || -1251313557 * anInt12187 != i_187_ || i_188_ != anInt12198 * -685065493)
				Class160_Sub1.method14479(this, (byte) -48);
		} else
			Class608.method10087(this, -1978820220);
	}

	public void method18896(RSByteBuffer class527_sub38) {
		class527_sub38.anInt10689 = 0;
		int i = class527_sub38.readUnsignedByte();
		for (int i_189_ = 0; i_189_ < anIntArray12184.length; i_189_++) {
			if (0 != (i & 1 << i_189_)) {
				int i_190_ = class527_sub38.readUnsignedByte();
				int i_191_ = class527_sub38.readUnsignedShort();
				anIntArray12184[i_189_] = i_190_;
				anIntArray12200[i_189_] = i_191_;
			} else {
				anIntArray12184[i_189_] = -1;
				anIntArray12200[i_189_] = -1;
			}
		}
	}

	public void method18897(RSByteBuffer class527_sub38) {
		class527_sub38.anInt10689 = 0;
		int i = class527_sub38.readUnsignedByte();
		for (int i_192_ = 0; i_192_ < anIntArray12184.length; i_192_++) {
			if (0 != (i & 1 << i_192_)) {
				int i_193_ = class527_sub38.readUnsignedByte();
				int i_194_ = class527_sub38.readUnsignedShort();
				anIntArray12184[i_192_] = i_193_;
				anIntArray12200[i_192_] = i_194_;
			} else {
				anIntArray12184[i_192_] = -1;
				anIntArray12200[i_192_] = -1;
			}
		}
	}

	public void method18898(RSByteBuffer class527_sub38) {
		class527_sub38.anInt10689 = 0;
		int i = class527_sub38.readUnsignedByte();
		for (int i_195_ = 0; i_195_ < anIntArray12184.length; i_195_++) {
			if (0 != (i & 1 << i_195_)) {
				int i_196_ = class527_sub38.readUnsignedByte();
				int i_197_ = class527_sub38.readUnsignedShort();
				anIntArray12184[i_195_] = i_196_;
				anIntArray12200[i_195_] = i_197_;
			} else {
				anIntArray12184[i_195_] = -1;
				anIntArray12200[i_195_] = -1;
			}
		}
	}

	void method18899() {
		for (int i = 0; i < anIntArray12184.length; i++)
			anIntArray12184[i] = -1;
		for (int i = 0; i < anIntArray12200.length; i++)
			anIntArray12200[i] = -1;
	}

	void method18900() {
		for (int i = 0; i < anIntArray12184.length; i++)
			anIntArray12184[i] = -1;
		for (int i = 0; i < anIntArray12200.length; i++)
			anIntArray12200[i] = -1;
	}

	public int method200(byte i) {
		return anInt11955 * -541403241;
	}

	final void method17062(Class180 class180, Class640_Sub1 class640_sub1, int i, int i_198_, int i_199_, boolean bool) {
		throw new IllegalStateException();
	}

	public boolean method18607() {
		return Class536.aClass615_7224.aBool8060;
	}

	boolean method18901(Class180 class180, int i) {
		int i_200_ = i;
		Class587 class587 = method18542(-1951727951);
		Class695 class695 = ((aClass695_11914.method14162(-1587285666) && !aClass695_11914.method14172(-2090761041)) ? aClass695_11914 : null);
		Class695_Sub2 class695_sub2 = ((aClass695_Sub2_11913.method14162(-1113836114) && !aBool12191 && (!aClass695_Sub2_11913.aBool10970 || class695 == null)) ? aClass695_Sub2_11913 : null);
		int i_201_ = 261385821 * class587.anInt7740;
		int i_202_ = 1568751847 * class587.anInt7738;
		if (0 != i_201_ || 0 != i_202_ || -353138087 * class587.anInt7753 != 0 || -1624976099 * class587.anInt7756 != 0)
			i |= 0x7;
		int i_203_ = aClass61_11936.method1384((byte) 1);
		boolean bool = (0 != aByte11898 && client.anInt11019 >= anInt11925 * 974555073 && client.anInt11019 < -834255173 * anInt11926);
		if (bool)
			i |= 0x80000;
		Class176 class176 = (aClass176Array11952[0] = aClass633_12183.method10505(class180, i, Class258.aClass24_Sub2_2827, Class587.aClass24_Sub19_7760, Class381.aClass24_Sub9_3936, Class174_Sub2.aClass24_Sub17_9120, Class671.aClass97_8584, Class671.aClass97_8584, class695, class695_sub2, aClass695_Sub3_Sub1Array11934, anIntArray11935, i_203_, true, Class443.aClass616_4922, -2072709214));
		int i_204_ = Class244.method4614((byte) 2);
		if (Class515.anInt7045 * 814176903 < 96 && i_204_ > 50)
			Class172.method2741(1396009777);
		if (Class73.aClass677_790 != Class677.aClass677_8596 && i_204_ < 50) {
			int i_205_;
			for (i_205_ = 50 - i_204_; i_205_ > -459290003 * client.anInt11018; client.anInt11018 += 2097401701)
				Class398.aByteArrayArray4123[-459290003 * client.anInt11018] = new byte[102400];
			while (i_205_ < client.anInt11018 * -459290003) {
				client.anInt11018 -= 2097401701;
				Class398.aByteArrayArray4123[-459290003 * client.anInt11018] = null;
			}
		} else if (Class73.aClass677_790 != Class677.aClass677_8596) {
			Class398.aByteArrayArray4123 = new byte[50][];
			client.anInt11018 = 0;
		}
		if (null == class176)
			return false;
		anInt11891 = class176.method2896() * 682664935;
		anInt11892 = class176.method2866() * -146167591;
		class176.method2893();
		method18539(class176, (byte) 78);
		if (0 != i_201_ || 0 != i_202_) {
			method18591(i_203_, i_201_, i_202_, 799994947 * class587.anInt7742, class587.anInt7757 * 1386019379, (byte) 79);
			if (299555935 * anInt11927 != 0)
				class176.method2868(anInt11927 * 299555935);
			if (0 != -1105701807 * anInt11943)
				class176.method2869(-1105701807 * anInt11943);
			if (0 != -1914574331 * anInt11888)
				class176.method3015(0, anInt11888 * -1914574331, 0);
		} else
			method18591(i_203_, method18564(-1773243802) << 9, method18564(-1509948271) << 9, 0, 0, (byte) 59);
		if (bool)
			class176.method2986(aByte11887, aByte11907, aByte11929, aByte11898 & 0xff);
		if (!aBool12191)
			method18540(class180, class587, i_200_, i_201_, i_202_, i_203_, -945612347);
		return true;
	}

	boolean method18902(Class180 class180, int i) {
		int i_206_ = i;
		Class587 class587 = method18542(-1845788480);
		Class695 class695 = ((aClass695_11914.method14162(-1057890982) && !aClass695_11914.method14172(-1435323671)) ? aClass695_11914 : null);
		Class695_Sub2 class695_sub2 = ((aClass695_Sub2_11913.method14162(-1838932517) && !aBool12191 && (!aClass695_Sub2_11913.aBool10970 || class695 == null)) ? aClass695_Sub2_11913 : null);
		int i_207_ = 261385821 * class587.anInt7740;
		int i_208_ = 1568751847 * class587.anInt7738;
		if (0 != i_207_ || 0 != i_208_ || -353138087 * class587.anInt7753 != 0 || -1624976099 * class587.anInt7756 != 0)
			i |= 0x7;
		int i_209_ = aClass61_11936.method1384((byte) 1);
		boolean bool = (0 != aByte11898 && client.anInt11019 >= anInt11925 * 974555073 && client.anInt11019 < -834255173 * anInt11926);
		if (bool)
			i |= 0x80000;
		Class176 class176 = (aClass176Array11952[0] = aClass633_12183.method10505(class180, i, Class258.aClass24_Sub2_2827, Class587.aClass24_Sub19_7760, Class381.aClass24_Sub9_3936, Class174_Sub2.aClass24_Sub17_9120, Class671.aClass97_8584, Class671.aClass97_8584, class695, class695_sub2, aClass695_Sub3_Sub1Array11934, anIntArray11935, i_209_, true, Class443.aClass616_4922, -2054833601));
		int i_210_ = Class244.method4614((byte) 31);
		if (Class515.anInt7045 * 814176903 < 96 && i_210_ > 50)
			Class172.method2741(459348276);
		if (Class73.aClass677_790 != Class677.aClass677_8596 && i_210_ < 50) {
			int i_211_;
			for (i_211_ = 50 - i_210_; i_211_ > -459290003 * client.anInt11018; client.anInt11018 += 2097401701)
				Class398.aByteArrayArray4123[-459290003 * client.anInt11018] = new byte[102400];
			while (i_211_ < client.anInt11018 * -459290003) {
				client.anInt11018 -= 2097401701;
				Class398.aByteArrayArray4123[-459290003 * client.anInt11018] = null;
			}
		} else if (Class73.aClass677_790 != Class677.aClass677_8596) {
			Class398.aByteArrayArray4123 = new byte[50][];
			client.anInt11018 = 0;
		}
		if (null == class176)
			return false;
		anInt11891 = class176.method2896() * 682664935;
		anInt11892 = class176.method2866() * -146167591;
		class176.method2893();
		method18539(class176, (byte) 16);
		if (0 != i_207_ || 0 != i_208_) {
			method18591(i_209_, i_207_, i_208_, 799994947 * class587.anInt7742, class587.anInt7757 * 1386019379, (byte) 22);
			if (299555935 * anInt11927 != 0)
				class176.method2868(anInt11927 * 299555935);
			if (0 != -1105701807 * anInt11943)
				class176.method2869(-1105701807 * anInt11943);
			if (0 != -1914574331 * anInt11888)
				class176.method3015(0, anInt11888 * -1914574331, 0);
		} else
			method18591(i_209_, method18564(-2074229164) << 9, method18564(-1935790173) << 9, 0, 0, (byte) 61);
		if (bool)
			class176.method2986(aByte11887, aByte11907, aByte11929, aByte11898 & 0xff);
		if (!aBool12191)
			method18540(class180, class587, i_206_, i_207_, i_208_, i_209_, -1992376083);
		return true;
	}

	public String method18903(boolean bool) {
		String string = "";
		if (null != aString12182)
			string = aString12182;
		if (bool)
			string = new StringBuilder().append(string).append(aString12202).toString();
		else
			string = new StringBuilder().append(string).append(aString12179).toString();
		if (aString12181 != null)
			string = new StringBuilder().append(string).append(aString12181).toString();
		return string;
	}

	public Class442 method190(short i) {
		return Class442.method7137();
	}

	public void method18904(int i, int i_212_) {
		anInt11942 = 0;
		anInt11947 = 0;
		anInt11946 = 0;
		anIntArray11902[0] = i;
		anIntArray11944[0] = i_212_;
		int i_213_ = method18564(-1495189563);
		Class442 class442 = Class442.method7139(method10637().aClass442_4927);
		class442.aFloat4918 = (float) (anIntArray11902[0] * 512 + 256 * i_213_);
		class442.aFloat4919 = (float) (anIntArray11944[0] * 512 + 256 * i_213_);
		method10618(class442);
		class442.method7141();
		if (this == Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937)
			client.aClass509_11072.method8397(2133321941).method10252((short) -27932);
		if (aClass613_11949 != null)
			aClass613_11949.method10127();
	}

	void method17071(Class180 class180) {
		if (aClass633_12183 != null && (aBool11950 || method18876(class180, 0, -541403241))) {
			Class432 class432 = class180.method3172();
			class432.method6880(method10637());
			class432.method6896(0.0F, -5.0F, 0.0F);
			method18532(class180, aClass176Array11952, class432, aBool11950, (byte) -44);
			for (int i = 0; i < aClass176Array11952.length; i++)
				aClass176Array11952[i] = null;
		}
	}

	final void method18905(int i, int i_214_, byte i_215_) {
		if (anInt11942 * -1057678739 < anIntArray11902.length - 1)
			anInt11942 += 1705181029;
		for (int i_216_ = anInt11942 * -1057678739; i_216_ > 0; i_216_--) {
			anIntArray11902[i_216_] = anIntArray11902[i_216_ - 1];
			anIntArray11944[i_216_] = anIntArray11944[i_216_ - 1];
			aByteArray11945[i_216_] = aByteArray11945[i_216_ - 1];
		}
		anIntArray11902[0] = i;
		anIntArray11944[0] = i_214_;
		aByteArray11945[0] = i_215_;
	}

	public int method18626() {
		return -(anInt11955 * -541403241) - 1;
	}

	int method18552() {
		return anInt12199 * -678797131;
	}

	public final boolean method18906() {
		if (null == aClass633_12183)
			return false;
		return true;
	}

	public int method18600() {
		return -1;
	}

	public Class523 method18630() {
		if (null != aClass523_11921) {
			if (aClass523_11921.aString7090 == null)
				return null;
			if (0 == client.anInt11265 * -604903211 || 3 == -604903211 * client.anInt11265 || (1 == client.anInt11265 * -604903211 && Class628.method10416(aString12179, -2041801240)))
				return aClass523_11921;
		}
		return null;
	}

	public int method46() {
		return anInt11955 * -541403241;
	}

	public int method18603() {
		if (null != aClass633_12183 && -1 != 1032231511 * aClass633_12183.anInt8271)
			return ((((Class295) Class381.aClass24_Sub9_3936.method81((1032231511 * (aClass633_12183.anInt8271)), 1139636739)).anInt3342) * 897343531);
		return super.method18564(-1439502413);
	}

	public void method18907(String string, int i, int i_217_) {
		method18598(string, i, i_217_, (Class259.method4781((byte) -26) * (Class536.aClass615_7224.anInt8063 * 273004795)), -441238943);
	}
}
