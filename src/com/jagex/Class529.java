/* Class529 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

public class Class529 {
	protected static Class459 aClass459_7115;
	protected static int anInt7116;
	protected static Class24_Sub6 aClass24_Sub6_7117;
	protected static byte[][][] aByteArrayArrayArray7118;
	protected static Class24_Sub8 aClass24_Sub8_7119;
	protected static Interface18 anInterface18_7120;
	protected static Interface20 anInterface20_7121;
	public static Class630 aClass630_7122;
	public static Class527_Sub8_Sub12 aClass527_Sub8_Sub12_7123;
	static Class459 aClass459_7124;
	protected static int anInt7125;
	static Class14 aClass14_7126;
	static int[] anIntArray7127;
	protected static int anInt7128;
	protected static Class205 aClass205_7129;
	protected static int anInt7130;
	protected static int anInt7131;
	static byte[] aByteArray7132;
	public static float aFloat7133;
	public static float aFloat7134;
	protected static Class532 aClass532_7135;
	protected static int anInt7136;
	public static int anInt7137;
	public static int anInt7138;
	static Object[] anObjectArray7139;
	static int anInt7140;
	static int[] anIntArray7141;
	static Interface13 anInterface13_7142 = null;
	static byte[] aByteArray7143;
	static short[] aShortArray7144;
	static short[] aShortArray7145;
	static ArrayList anArrayList7146;
	protected static Class694 aClass694_7147;
	static byte[] aByteArray7148;
	static short[] aShortArray7149;
	static int[] anIntArray7150;
	static int[][] anIntArrayArray7151;
	static int anInt7152;
	static int anInt7153;
	static int anInt7154;
	static int anInt7155;
	static int anInt7156;
	static Interface13 anInterface13_7157 = null;
	static int anInt7158;
	static byte[] aByteArray7159;
	static HashMap[][][] aHashMapArrayArrayArray7160;
	protected static Class205 aClass205_7161;
	static int anInt7162;
	protected static Class205 aClass205_7163;
	protected static Class24_Sub12 aClass24_Sub12_7164;
	protected static boolean aBool7165;
	static int anInt7166;
	protected static int anInt7167;
	static boolean[][] aBoolArrayArray7168;
	static int anInt7169;
	static RSByteBuffer aClass527_Sub38_7170;
	static RSByteBuffer aClass527_Sub38_7171;
	protected static boolean aBool7172;
	static int[] anIntArray7173;
	static int[] anIntArray7174;
	protected static int anInt7175;
	static final int anInt7176 = 64;
	protected static int anInt7177;
	protected static int anInt7178;
	protected static int anInt7179;
	protected static int anInt7180;
	protected static int anInt7181;
	protected static int anInt7182;
	static int anInt7183;
	static int anInt7184;
	static boolean[] aBoolArray7185;

	static int method8745(Interface13 interface13, Class181 class181, int i, int i_0_, int i_1_) {
		Class660 class660 = (Class660) interface13.method81(i, -1232887351);
		if (class660 == null)
			return 0;
		int i_2_ = class660.anInt8501 * 482678519;
		if (i_2_ >= 0 && class181.method3544(i_2_, (byte) -93).aBool1806)
			i_2_ = -1;
		int i_3_;
		if (class660.anInt8505 * -742413183 >= 0) {
			int i_4_ = class660.anInt8505 * -742413183;
			int i_5_ = (i_4_ & 0x7f) + i_1_;
			if (i_5_ < 0)
				i_5_ = 0;
			else if (i_5_ > 127)
				i_5_ = 127;
			int i_6_ = (i_4_ + i_0_ & 0xfc00) + (i_4_ & 0x380) + i_5_;
			i_3_ = (~0xffffff | (Class656.anIntArray8393[Class453.method7333(Class508.method8272(i_6_, 96, (byte) -6), (byte) 10) & 0xffff]));
		} else if (i_2_ >= 0)
			i_3_ = (~0xffffff | (Class656.anIntArray8393[Class453.method7333(Class508.method8272((class181.method3544(i_2_, (byte) -123).aShort1810), 96, (byte) -16), (byte) 10) & 0xffff]));
		else if (class660.anInt8498 * 335838185 == -1)
			i_3_ = 0;
		else {
			int i_7_ = class660.anInt8498 * 335838185;
			int i_8_ = (i_7_ & 0x7f) + i_1_;
			if (i_8_ < 0)
				i_8_ = 0;
			else if (i_8_ > 127)
				i_8_ = 127;
			int i_9_ = (i_7_ + i_0_ & 0xfc00) + (i_7_ & 0x380) + i_8_;
			i_3_ = (~0xffffff | (Class656.anIntArray8393[Class453.method7333(Class508.method8272(i_9_, 96, (byte) -106), (byte) 10) & 0xffff]));
		}
		return i_3_;
	}

	public static void method8746(Class459 class459, Class459 class459_10_, Class24_Sub14 class24_sub14, Class24_Sub5 class24_sub5, Class24_Sub6 class24_sub6, Class24_Sub12 class24_sub12, Class24_Sub8 class24_sub8, Interface20 interface20, Interface18 interface18) {
		aClass459_7124 = class459;
		aClass459_7115 = class459_10_;
		anInterface13_7142 = class24_sub14;
		anInterface13_7157 = class24_sub5;
		aClass24_Sub6_7117 = class24_sub6;
		aClass24_Sub12_7164 = class24_sub12;
		aClass24_Sub8_7119 = class24_sub8;
		anInterface20_7121 = interface20;
		anInterface18_7120 = interface18;
		aClass14_7126.method721(-1101039756);
		int[] is = aClass459_7124.method7486(Class651.aClass651_8380.method87(), 2147483647);
		if (is != null) {
			for (int i = 0; i < is.length; i++) {
				Class527_Sub8_Sub12 class527_sub8_sub12 = Class612.method10124(aClass459_7124, is[i], (short) 14435);
				aClass14_7126.method714(class527_sub8_sub12, (long) (class527_sub8_sub12.anInt11765 * 911503199));
			}
		}
		Class25.method851(true, false, (byte) 3);
	}

	static void method8747() {
		aShortArray7149 = new short[anInt7131 * anInt7167];
		aShortArray7145 = new short[anInt7131 * anInt7167];
		aByteArray7159 = new byte[anInt7131 * anInt7167];
		anObjectArray7139 = new Object[anInt7131 * anInt7167];
		aByteArray7148 = new byte[anInt7131 * anInt7167];
		aHashMapArrayArrayArray7160 = new HashMap[3][anInt7131 >> 6][anInt7167 >> 6];
		anIntArray7141 = new int[anInterface13_7142.method77(-947488356) + 1];
		aBoolArrayArray7168 = new boolean[anInt7131 / 8][anInt7167 / 8];
	}

	static void method8748() {
		aShortArray7149 = null;
		aByteArray7143 = null;
		aShortArray7144 = null;
		aShortArray7145 = null;
		aByteArray7159 = null;
		anObjectArray7139 = null;
		aByteArray7148 = null;
		aHashMapArrayArrayArray7160 = null;
		anIntArray7141 = null;
		aBoolArrayArray7168 = null;
	}

	static void method8749(int i) {
		Class527_Sub8_Sub12 class527_sub8_sub12 = (Class527_Sub8_Sub12) aClass14_7126.method709((long) i);
		if (class527_sub8_sub12 != null && class527_sub8_sub12 != aClass527_Sub8_Sub12_7123) {
			aClass527_Sub8_Sub12_7123 = class527_sub8_sub12;
			aBool7165 = (aClass527_Sub8_Sub12_7123.anInt11765 * 911503199 == aClass630_7122.anInt8230 * 346103239);
		}
	}

	static int method8750(Interface13 interface13, Class181 class181, int i, int i_11_, int i_12_) {
		Class660 class660 = (Class660) interface13.method81(i, -2115457239);
		if (class660 == null)
			return 0;
		int i_13_ = class660.anInt8501 * 482678519;
		if (i_13_ >= 0 && class181.method3544(i_13_, (byte) -45).aBool1806)
			i_13_ = -1;
		int i_14_;
		if (class660.anInt8505 * -742413183 >= 0) {
			int i_15_ = class660.anInt8505 * -742413183;
			int i_16_ = (i_15_ & 0x7f) + i_12_;
			if (i_16_ < 0)
				i_16_ = 0;
			else if (i_16_ > 127)
				i_16_ = 127;
			int i_17_ = (i_15_ + i_11_ & 0xfc00) + (i_15_ & 0x380) + i_16_;
			i_14_ = (~0xffffff | (Class656.anIntArray8393[Class453.method7333(Class508.method8272(i_17_, 96, (byte) -98), (byte) 10) & 0xffff]));
		} else if (i_13_ >= 0)
			i_14_ = (~0xffffff | (Class656.anIntArray8393[Class453.method7333(Class508.method8272((class181.method3544(i_13_, (byte) -31).aShort1810), 96, (byte) -35), (byte) 10) & 0xffff]));
		else if (class660.anInt8498 * 335838185 == -1)
			i_14_ = 0;
		else {
			int i_18_ = class660.anInt8498 * 335838185;
			int i_19_ = (i_18_ & 0x7f) + i_12_;
			if (i_19_ < 0)
				i_19_ = 0;
			else if (i_19_ > 127)
				i_19_ = 127;
			int i_20_ = (i_18_ + i_11_ & 0xfc00) + (i_18_ & 0x380) + i_19_;
			i_14_ = (~0xffffff | (Class656.anIntArray8393[Class453.method7333(Class508.method8272(i_20_, 96, (byte) -40), (byte) 10) & 0xffff]));
		}
		return i_14_;
	}

	static void method8751() {
		for (int i = 0; i < anInt7131; i++) {
			for (int i_21_ = 0; i_21_ < anInt7167; i_21_++) {
				Object object = anObjectArray7139[i + i_21_ * anInt7131];
				if (object != null) {
					if (object instanceof Class527_Sub39) {
						Class527_Sub39 class527_sub39 = (Class527_Sub39) object;
						if (class527_sub39 != null) {
							for (int i_22_ = 0; i_22_ < class527_sub39.anIntArray10695.length; i_22_++) {
								Class602 class602 = ((Class602) (aClass24_Sub6_7117.method81(class527_sub39.anIntArray10695[i_22_], -1853870372)));
								int i_23_ = class602.anInt7928 * -177138561;
								if (class602.anIntArray7929 != null) {
									class602 = (class602.method9962(anInterface20_7121, anInterface18_7120, 1137928779));
									if (class602 != null)
										i_23_ = class602.anInt7928 * -177138561;
								}
								if (i_23_ != -1) {
									Class527_Sub30 class527_sub30 = new Class527_Sub30(i_23_);
									class527_sub30.anInt10568 = i * -2077866433;
									class527_sub30.anInt10565 = i_21_ * 698398931;
									aClass694_7147.method14147(class527_sub30, -576944754);
								}
							}
						}
					} else {
						Integer integer = (Integer) object;
						Class602 class602 = ((Class602) aClass24_Sub6_7117.method81(integer.intValue(), -926060184));
						int i_24_ = class602.anInt7928 * -177138561;
						if (class602.anIntArray7929 != null) {
							class602 = class602.method9962(anInterface20_7121, anInterface18_7120, 1137928779);
							if (class602 != null)
								i_24_ = class602.anInt7928 * -177138561;
						}
						if (i_24_ != -1) {
							Class527_Sub30 class527_sub30 = new Class527_Sub30(i_24_);
							class527_sub30.anInt10568 = i * -2077866433;
							class527_sub30.anInt10565 = i_21_ * 698398931;
							aClass694_7147.method14147(class527_sub30, -2030056392);
						}
					}
				}
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int i_25_ = 0; i_25_ < aHashMapArrayArrayArray7160[0].length; i_25_++) {
				for (int i_26_ = 0; i_26_ < aHashMapArrayArrayArray7160[0][0].length; i_26_++) {
					HashMap hashmap = aHashMapArrayArrayArray7160[i][i_25_][i_26_];
					if (hashmap != null) {
						Iterator iterator = hashmap.values().iterator();
						while (iterator.hasNext()) {
							Class528 class528 = (Class528) iterator.next();
							if (class528.anIntArray7114 != null) {
								for (int i_27_ = 0; i_27_ < class528.anIntArray7114.length; i_27_++) {
									Class602 class602 = ((Class602) (aClass24_Sub6_7117.method81(class528.anIntArray7114[i_27_], -417729942)));
									int i_28_ = class602.anInt7928 * -177138561;
									if (class602.anIntArray7929 != null) {
										class602 = (class602.method9962(anInterface20_7121, anInterface18_7120, 1137928779));
										if (class602 != null)
											i_28_ = (class602.anInt7928 * -177138561);
									}
									if (i_28_ != -1) {
										Class527_Sub30 class527_sub30 = new Class527_Sub30(i_28_);
										class527_sub30.anInt10568 = ((i_25_ + (anInt7137 >> 6)) * 64 + class528.aByte7110 - anInt7137) * -2077866433;
										class527_sub30.anInt10565 = ((i_26_ + (anInt7138 >> 6)) * 64 + class528.aByte7109 - anInt7138) * 698398931;
										aClass694_7147.method14147(class527_sub30, -1708390696);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public static Class527_Sub8_Sub12 method8752(int i) {
		return (Class527_Sub8_Sub12) aClass14_7126.method709((long) i);
	}

	static boolean method8753(Class180 class180, int i, int i_29_, boolean bool) {
		long l = Class234.method4347(-1408626088);
		if (anInt7178 == 0) {
			if (aClass527_Sub8_Sub12_7123.anInt11765 * 911503199 == aClass630_7122.anInt8228 * 1674945435) {
				int i_30_ = aClass459_7115.method7540((aClass527_Sub8_Sub12_7123.aString11755), -1193884611);
				if (aClass527_Sub38_7171 == null)
					aClass527_Sub38_7171 = (new RSByteBuffer(aClass459_7115.method7470(i_30_, 0, (byte) -110)));
				aClass527_Sub38_7170 = aClass527_Sub38_7171;
				aClass527_Sub38_7170.anInt10689 = 0;
			} else {
				int i_31_ = aClass459_7115.method7540((aClass527_Sub8_Sub12_7123.aString11755), -1193884611);
				aClass527_Sub38_7170 = (new RSByteBuffer(aClass459_7115.method7470(i_31_, 0, (byte) -38)));
			}
			int i_32_ = aClass527_Sub38_7170.readUnsignedByte();
			anIntArray7173 = new int[i_32_];
			for (int i_33_ = 0; i_33_ < i_32_; i_33_++)
				anIntArray7173[i_33_] = aClass527_Sub38_7170.readUnsignedSmart((byte) -34);
			int i_34_ = aClass527_Sub38_7170.readUnsignedByte();
			anIntArray7174 = new int[i_34_];
			for (int i_35_ = 0; i_35_ < i_34_; i_35_++)
				anIntArray7174[i_35_] = aClass527_Sub38_7170.readUnsignedSmart((byte) -1);
		}
		while (aClass527_Sub38_7170 != null && (aClass527_Sub38_7170.anInt10689 * -441238943 < aClass527_Sub38_7170.buffer.length) && (!bool || (Class234.method4347(-1408626088) < l + (long) anInt7169))) {
			if (aClass527_Sub38_7170.readUnsignedByte() == 0) {
				int i_36_ = aClass527_Sub38_7170.readUnsignedByte();
				int i_37_ = aClass527_Sub38_7170.readUnsignedByte();
				for (int i_38_ = 0; i_38_ < 8; i_38_++) {
					int i_39_ = aClass527_Sub38_7170.readUnsignedByte();
					int i_40_ = i_36_ * 8 + i_38_ - anInt7137 / 8;
					for (int i_41_ = 0; i_41_ < 8; i_41_++) {
						int i_42_ = i_37_ * 8 + i_41_ - anInt7138 / 8;
						aBoolArrayArray7168[i_40_][i_42_] = (i_39_ & 1 << i_41_) != 0;
					}
				}
				for (int i_43_ = 0; i_43_ < 64; i_43_++) {
					for (int i_44_ = 0; i_44_ < 64; i_44_++) {
						int i_45_ = i_36_ * 64 + i_43_ - anInt7137;
						int i_46_ = i_37_ * 64 + i_44_ - anInt7138;
						method8845(class180, aClass527_Sub38_7170, i_36_, i_37_, i_45_, i_46_, anIntArray7173, anIntArray7174);
					}
				}
			} else {
				int i_47_ = aClass527_Sub38_7170.readUnsignedByte();
				int i_48_ = aClass527_Sub38_7170.readUnsignedByte();
				int i_49_ = aClass527_Sub38_7170.readUnsignedByte();
				int i_50_ = aClass527_Sub38_7170.readUnsignedByte();
				aBoolArrayArray7168[i_47_ * 8 + i_49_ - anInt7137 / 8][i_48_ * 8 + i_50_ - anInt7138 / 8] = aClass527_Sub38_7170.readUnsignedByte() != 0;
				for (int i_51_ = 0; i_51_ < 8; i_51_++) {
					for (int i_52_ = 0; i_52_ < 8; i_52_++) {
						int i_53_ = i_47_ * 64 + i_49_ * 8 + i_51_ - anInt7137;
						int i_54_ = i_48_ * 64 + i_50_ * 8 + i_52_ - anInt7138;
						method8845(class180, aClass527_Sub38_7170, i_47_, i_48_, i_53_, i_54_, anIntArray7173, anIntArray7174);
					}
				}
			}
		}
		if (aClass527_Sub38_7170 != null) {
			anInt7178 = aClass527_Sub38_7170.anInt10689 * -441238943;
			if (aClass527_Sub38_7170.anInt10689 * -441238943 < aClass527_Sub38_7170.buffer.length)
				return false;
		}
		aClass527_Sub38_7170 = null;
		anIntArray7174 = null;
		anIntArray7173 = null;
		if (aShortArray7149 != null) {
			aByteArray7143 = new byte[anInt7131 * anInt7167];
			aShortArray7144 = new short[anInt7131 * anInt7167];
			for (int i_55_ = 0; i_55_ < 3; i_55_++) {
				short[] is = new short[anInt7131 * anInt7167];
				for (int i_56_ = 0; i_56_ < aHashMapArrayArrayArray7160[i_55_].length; i_56_++) {
					for (int i_57_ = 0; i_57_ < aHashMapArrayArrayArray7160[i_55_][0].length; i_57_++) {
						HashMap hashmap = aHashMapArrayArrayArray7160[i_55_][i_56_][i_57_];
						if (hashmap != null) {
							Iterator iterator = hashmap.values().iterator();
							while (iterator.hasNext()) {
								Class528 class528 = (Class528) iterator.next();
								is[(i_56_ * 64 + class528.aByte7110 + ((i_57_ * 64 + class528.aByte7109) * anInt7131))] = (short) class528.anInt7111;
							}
						}
					}
				}
				method8760(is, aByteArray7143, aShortArray7144, i, i_29_);
				for (int i_58_ = 0; i_58_ < aHashMapArrayArrayArray7160[i_55_].length; i_58_++) {
					for (int i_59_ = 0; i_59_ < aHashMapArrayArrayArray7160[i_55_][0].length; i_59_++) {
						HashMap hashmap = aHashMapArrayArrayArray7160[i_55_][i_58_][i_59_];
						if (hashmap != null) {
							Iterator iterator = hashmap.values().iterator();
							while (iterator.hasNext()) {
								Class528 class528 = (Class528) iterator.next();
								int i_60_ = (i_58_ * 64 + class528.aByte7110 + ((i_59_ * 64 + class528.aByte7109) * anInt7131));
								class528.anInt7111 = ((aByteArray7143[i_60_] & 0xff) << 16 | aShortArray7144[i_60_] & 0xffff);
								if (class528.anInt7111 != 0)
									class528.anInt7111 |= ~0xffffff;
							}
						}
					}
				}
			}
			method8760(aShortArray7149, aByteArray7143, aShortArray7144, i, i_29_);
			aShortArray7149 = null;
		}
		if (!bool || Class234.method4347(-1408626088) < l + (long) anInt7169) {
			method8751();
			return true;
		}
		return false;
	}

	static void method8754(Class180 class180, boolean bool, boolean bool_61_, int i, int i_62_, int i_63_, int i_64_, boolean bool_65_, boolean bool_66_) {
		int i_67_ = anInt7177 - anInt7125;
		int i_68_ = anInt7136 - anInt7175;
		if (anInt7177 < anInt7131)
			i_67_++;
		if (anInt7136 < anInt7167)
			i_68_++;
		int i_69_ = anInt7125 / 64;
		int i_70_ = anInt7175 / 64;
		int i_71_ = (anInt7125 + i_67_) / 64;
		int i_72_ = (anInt7175 + i_68_) / 64;
		int i_73_;
		int i_74_;
		if (bool_66_) {
			i_73_ = (anInt7181 - anInt7179) / ((anInt7177 - anInt7125) / 64);
			i_74_ = i_73_;
		} else {
			i_73_ = method8812();
			i_74_ = (int) Math.ceil((double) (64.0F * aFloat7133 / 2.0F));
		}
		anArrayList7146.clear();
		int i_75_ = 0;
		int i_76_ = i_73_ * i_73_;
		for (int i_77_ = i_69_; i_77_ <= i_71_; i_77_++) {
			for (int i_78_ = i_70_; i_78_ <= i_72_; i_78_++) {
				int i_79_ = (i_77_ << 16) + i_78_;
				int i_80_ = method8776((long) i_79_);
				if (i_80_ != i_73_) {
					if (i_77_ < 0 || i_77_ * 64 >= anInt7131 || i_78_ < 0 || i_78_ * 64 >= anInt7167)
						method8780(class180, i_77_, i_78_, i_73_, i_79_);
					else if (i_80_ == -1) {
						method8766(i_77_, i_78_, i_73_, i_79_, bool, bool_61_, bool_65_, class180);
						i_75_ += i_76_;
					} else
						anArrayList7146.add(Integer.valueOf(i_79_));
				}
			}
		}
		if (!anArrayList7146.isEmpty() && i_75_ < anInt7166) {
			for (Iterator iterator = anArrayList7146.iterator(); i_75_ < anInt7166 && iterator.hasNext(); i_75_ += i_76_) {
				int i_81_ = ((Integer) iterator.next()).intValue();
				int i_82_ = i_81_ >> 16 & 0xffff;
				int i_83_ = i_81_ & 0xffff;
				method8766(i_82_, i_83_, i_73_, i_81_, bool, bool_61_, bool_65_, class180);
			}
		}
		for (int i_84_ = i_69_; i_84_ <= i_71_; i_84_++) {
			int i_85_ = i_84_ * 64;
			int i_86_ = i_85_ - anInt7125;
			int i_87_ = i_74_;
			int i_88_ = (i_63_ + i * i_86_ >> 16) + anInt7179;
			int i_89_ = (i_63_ + i * (i_86_ + 64) >> 16) + anInt7179;
			if (i_88_ + i_87_ != i_89_)
				i_87_ = i_89_ - i_88_;
			for (int i_90_ = i_70_; i_90_ <= i_72_; i_90_++) {
				int i_91_ = i_90_ * 64;
				int i_92_ = i_91_ - anInt7175;
				int i_93_ = (i_84_ << 16) + i_90_;
				int i_94_ = i_74_;
				int i_95_ = anInt7182 - (i_64_ + i_62_ * i_92_ >> 16);
				int i_96_ = anInt7182 - (i_64_ + i_62_ * (i_92_ + 64) >> 16);
				if (i_95_ - i_94_ != i_96_)
					i_94_ = i_95_ - i_96_;
				i_95_ -= i_94_;
				Class147 class147 = (Class147) aClass205_7163.method3787((long) i_93_);
				if (class147 == null)
					throw new RuntimeException();
				if (class147.method2407() == i_87_ && class147.method2424() == i_94_)
					class147.method2415(i_88_, i_95_);
				else
					class147.method2418(i_88_, i_95_, i_87_, i_94_);
			}
		}
	}

	static int method8755(Class181 class181, int i, int i_97_, int i_98_) {
		return method8811(anInterface13_7142, class181, i, i_97_, i_98_);
	}

	static void method8756(int[] is, int i, int i_99_, int i_100_, int i_101_, int i_102_, int i_103_, int i_104_) {
		for (int i_105_ = i; i_105_ <= i_99_; i_105_++) {
			for (int i_106_ = i_100_; i_106_ <= i_101_; i_106_++)
				is[(i_103_ - i_106_ - 1) * i_102_ + i_105_] = i_104_;
		}
	}

	public static Class527_Sub8_Sub12 method8757(int i) {
		return (Class527_Sub8_Sub12) aClass14_7126.method709((long) i);
	}

	static void method8758(Class180 class180, int[] is, int i, int i_107_, int i_108_, int i_109_, int i_110_, int i_111_) {
		Object object = anObjectArray7139[i_111_];
		if (object != null) {
			if (object instanceof Class527_Sub39) {
				Class527_Sub39 class527_sub39 = (Class527_Sub39) object;
				if (class527_sub39 != null)
					method8769(class180, is, i, i_107_, i_108_, class527_sub39.anIntArray10695, class527_sub39.aByteArray10694);
			} else {
				Integer integer = (Integer) object;
				anIntArray7127[0] = integer.intValue();
				aByteArray7132[0] = aByteArray7148[i_109_ + i_110_ * anInt7131];
				method8769(class180, is, i, i_107_, i_108_, anIntArray7127, aByteArray7132);
			}
		}
	}

	static void method8759(int[] is, int i, int i_112_, int i_113_, int i_114_, int i_115_, int i_116_) {
		for (int i_117_ = 0; i_117_ < aClass630_7122.anInt8231 * 1188642867; i_117_++) {
			int i_118_ = i_117_;
			if (i_116_ == anInt7153 || i_116_ == anInt7155)
				i_118_ = aClass630_7122.anInt8231 * 1188642867 - i_117_ - 1;
			for (int i_119_ = 0; i_119_ < aClass630_7122.anInt8231 * 1188642867; i_119_++) {
				int i_120_ = i_119_;
				if (i_116_ == anInt7155 || i_116_ == anInt7140)
					i_120_ = aClass630_7122.anInt8231 * 1188642867 - i_119_ - 1;
				int i_121_ = anIntArrayArray7151[i_118_][i_120_];
				if (i_121_ != 0) {
					if (i_121_ == 1) {
						int i_122_ = is[((i_113_ - i_112_ - i_119_ - 1) * i_113_ + i + i_117_)];
						if (i_122_ != anInt7154) {
							anInt7154 = i_122_;
							anInt7184 = (~0xffffff | ((((aClass630_7122.anInt8223 * -1253775049 & 0xff00ff) * i_114_ + (i_122_ & 0xff00ff) * i_115_) & ~0xff00ff) + ((((aClass630_7122.anInt8223 * -1253775049) & 0xff00) * i_114_ + (i_122_ & 0xff00) * i_115_) & 0xff0000)) >> 8);
						}
						is[((i_113_ - i_112_ - i_119_ - 1) * i_113_ + i + i_117_)] = anInt7184;
					} else if (i_121_ == 2)
						is[((i_113_ - i_112_ - i_119_ - 1) * i_113_ + i + i_117_)] = aClass630_7122.anInt8232 * -993232789;
				}
			}
		}
	}

	static void method8760(short[] is, byte[] is_123_, short[] is_124_, int i, int i_125_) {
		int[] is_126_ = new int[anInt7167];
		int[] is_127_ = new int[anInt7167];
		int[] is_128_ = new int[anInt7167];
		int[] is_129_ = new int[anInt7167];
		int[] is_130_ = new int[anInt7167];
		for (int i_131_ = -5; i_131_ < anInt7131; i_131_++) {
			int i_132_ = i_131_ + 5;
			int i_133_ = i_131_ - 5;
			for (int i_134_ = 0; i_134_ < anInt7167; i_134_++) {
				if (i_132_ < anInt7131) {
					short i_135_ = is[i_132_ + i_134_ * anInt7131];
					if (i_135_ > 0) {
						Class7 class7 = (Class7) anInterface13_7157.method81(i_135_ - 1, 450907164);
						is_126_[i_134_] += class7.anInt65 * 126708699;
						is_127_[i_134_] += class7.anInt70 * -1261235975;
						is_128_[i_134_] += class7.anInt69 * -2060189111;
						is_129_[i_134_] += class7.anInt72 * -1916962147;
						is_130_[i_134_]++;
					}
				}
				if (i_133_ >= 0) {
					short i_136_ = is[i_133_ + i_134_ * anInt7131];
					if (i_136_ > 0) {
						Class7 class7 = ((Class7) anInterface13_7157.method81(i_136_ - 1, -1226353078));
						is_126_[i_134_] -= class7.anInt65 * 126708699;
						is_127_[i_134_] -= class7.anInt70 * -1261235975;
						is_128_[i_134_] -= class7.anInt69 * -2060189111;
						is_129_[i_134_] -= class7.anInt72 * -1916962147;
						is_130_[i_134_]--;
					}
				}
			}
			if (i_131_ >= 0) {
				int i_137_ = 0;
				int i_138_ = 0;
				int i_139_ = 0;
				int i_140_ = 0;
				int i_141_ = 0;
				for (int i_142_ = -5; i_142_ < anInt7167; i_142_++) {
					int i_143_ = i_142_ + 5;
					if (i_143_ < anInt7167) {
						i_137_ += is_126_[i_143_];
						i_138_ += is_127_[i_143_];
						i_139_ += is_128_[i_143_];
						i_140_ += is_129_[i_143_];
						i_141_ += is_130_[i_143_];
					}
					int i_144_ = i_142_ - 5;
					if (i_144_ >= 0) {
						i_137_ -= is_126_[i_144_];
						i_138_ -= is_127_[i_144_];
						i_139_ -= is_128_[i_144_];
						i_140_ -= is_129_[i_144_];
						i_141_ -= is_130_[i_144_];
					}
					if (i_142_ >= 0 && i_141_ > 0) {
						if (is[i_131_ + i_142_ * anInt7131] == 0) {
							int i_145_ = i_131_ + i_142_ * anInt7131;
							is_123_[i_145_] = (byte) 0;
							is_124_[i_145_] = (short) 0;
						} else {
							int i_146_ = (i_140_ == 0 ? 0 : Class625.method10351((i_137_ * 256 / i_140_), i_138_ / i_141_, i_139_ / i_141_, -1416225184));
							int i_147_ = (i_146_ & 0x7f) + i_125_;
							if (i_147_ < 0)
								i_147_ = 0;
							else if (i_147_ > 127)
								i_147_ = 127;
							int i_148_ = ((i_146_ + i & 0xfc00) + (i_146_ & 0x380) + i_147_);
							int i_149_ = i_131_ + i_142_ * anInt7131;
							int i_150_ = (Class656.anIntArray8393[(Class453.method7333(Class115.method2028(i_148_, 96, -1269094070), (byte) 10)) & 0xffff]);
							is_123_[i_149_] = (byte) (i_150_ >> 16 & 0xff);
							is_124_[i_149_] = (short) (i_150_ & 0xffff);
						}
					}
				}
			}
		}
	}

	static void method8761() {
		int[] is = new int[3];
		for (int i = 0; i < aClass532_7135.anInt7208 * -1479175311; i++) {
			boolean bool = (aClass527_Sub8_Sub12_7123.method18314(aClass532_7135.anIntArray7206[i] >> 28 & 0x3, aClass532_7135.anIntArray7206[i] >> 14 & 0x3fff, aClass532_7135.anIntArray7206[i] & 0x3fff, is, (short) 242));
			if (bool) {
				Class527_Sub30 class527_sub30 = new Class527_Sub30(aClass532_7135.anIntArray7207[i]);
				class527_sub30.anInt10568 = (is[1] - anInt7137) * -2077866433;
				class527_sub30.anInt10565 = (is[2] - anInt7138) * 698398931;
				aClass694_7147.method14147(class527_sub30, -1841531318);
			}
		}
	}

	static Class694 method8762(Class180 class180, int i, int i_151_, int i_152_, int i_153_) {
		for (Class527_Sub30 class527_sub30 = (Class527_Sub30) aClass694_7147.method14081((short) -14599); class527_sub30 != null; class527_sub30 = (Class527_Sub30) aClass694_7147.method14086(-65534))
			method8830(class180, class527_sub30, i, i_151_, i_152_, i_153_);
		return aClass694_7147;
	}

	static void method8763(Class180 class180, boolean bool, boolean bool_154_, boolean bool_155_, boolean bool_156_) {
		int i = anInt7177 - anInt7125;
		int i_157_ = anInt7136 - anInt7175;
		int i_158_ = (anInt7181 - anInt7179 << 16) / i;
		int i_159_ = (anInt7182 - anInt7180 << 16) / i_157_;
		method8764(class180, bool, bool_154_, i_158_, i_159_, 0, 0, bool_155_, bool_156_);
	}

	static void method8764(Class180 class180, boolean bool, boolean bool_160_, int i, int i_161_, int i_162_, int i_163_, boolean bool_164_, boolean bool_165_) {
		int i_166_ = anInt7177 - anInt7125;
		int i_167_ = anInt7136 - anInt7175;
		if (anInt7177 < anInt7131)
			i_166_++;
		if (anInt7136 < anInt7167)
			i_167_++;
		int i_168_ = anInt7125 / 64;
		int i_169_ = anInt7175 / 64;
		int i_170_ = (anInt7125 + i_166_) / 64;
		int i_171_ = (anInt7175 + i_167_) / 64;
		int i_172_;
		int i_173_;
		if (bool_165_) {
			i_172_ = (anInt7181 - anInt7179) / ((anInt7177 - anInt7125) / 64);
			i_173_ = i_172_;
		} else {
			i_172_ = method8812();
			i_173_ = (int) Math.ceil((double) (64.0F * aFloat7133 / 2.0F));
		}
		anArrayList7146.clear();
		int i_174_ = 0;
		int i_175_ = i_172_ * i_172_;
		for (int i_176_ = i_168_; i_176_ <= i_170_; i_176_++) {
			for (int i_177_ = i_169_; i_177_ <= i_171_; i_177_++) {
				int i_178_ = (i_176_ << 16) + i_177_;
				int i_179_ = method8776((long) i_178_);
				if (i_179_ != i_172_) {
					if (i_176_ < 0 || i_176_ * 64 >= anInt7131 || i_177_ < 0 || i_177_ * 64 >= anInt7167)
						method8780(class180, i_176_, i_177_, i_172_, i_178_);
					else if (i_179_ == -1) {
						method8766(i_176_, i_177_, i_172_, i_178_, bool, bool_160_, bool_164_, class180);
						i_174_ += i_175_;
					} else
						anArrayList7146.add(Integer.valueOf(i_178_));
				}
			}
		}
		if (!anArrayList7146.isEmpty() && i_174_ < anInt7166) {
			for (Iterator iterator = anArrayList7146.iterator(); i_174_ < anInt7166 && iterator.hasNext(); i_174_ += i_175_) {
				int i_180_ = ((Integer) iterator.next()).intValue();
				int i_181_ = i_180_ >> 16 & 0xffff;
				int i_182_ = i_180_ & 0xffff;
				method8766(i_181_, i_182_, i_172_, i_180_, bool, bool_160_, bool_164_, class180);
			}
		}
		for (int i_183_ = i_168_; i_183_ <= i_170_; i_183_++) {
			int i_184_ = i_183_ * 64;
			int i_185_ = i_184_ - anInt7125;
			int i_186_ = i_173_;
			int i_187_ = (i_162_ + i * i_185_ >> 16) + anInt7179;
			int i_188_ = (i_162_ + i * (i_185_ + 64) >> 16) + anInt7179;
			if (i_187_ + i_186_ != i_188_)
				i_186_ = i_188_ - i_187_;
			for (int i_189_ = i_169_; i_189_ <= i_171_; i_189_++) {
				int i_190_ = i_189_ * 64;
				int i_191_ = i_190_ - anInt7175;
				int i_192_ = (i_183_ << 16) + i_189_;
				int i_193_ = i_173_;
				int i_194_ = anInt7182 - (i_163_ + i_161_ * i_191_ >> 16);
				int i_195_ = anInt7182 - (i_163_ + i_161_ * (i_191_ + 64) >> 16);
				if (i_194_ - i_193_ != i_195_)
					i_193_ = i_194_ - i_195_;
				i_194_ -= i_193_;
				Class147 class147 = (Class147) aClass205_7163.method3787((long) i_192_);
				if (class147 == null)
					throw new RuntimeException();
				if (class147.method2407() == i_186_ && class147.method2424() == i_193_)
					class147.method2415(i_187_, i_194_);
				else
					class147.method2418(i_187_, i_194_, i_186_, i_193_);
			}
		}
	}

	public static Class527_Sub8_Sub12 method8765(int i, int i_196_) {
		for (Class527_Sub8_Sub12 class527_sub8_sub12 = (Class527_Sub8_Sub12) aClass14_7126.method713((byte) 35); class527_sub8_sub12 != null; class527_sub8_sub12 = ((Class527_Sub8_Sub12) aClass14_7126.method717(-1242159700))) {
			if (class527_sub8_sub12.aBool11758 && class527_sub8_sub12.method18301(i, i_196_, -113459656))
				return class527_sub8_sub12;
		}
		return null;
	}

	static void method8766(int i, int i_197_, int i_198_, int i_199_, boolean bool, boolean bool_200_, boolean bool_201_, Class180 class180) {
		int i_202_ = i * 64;
		int i_203_ = i_197_ * 64;
		if (anIntArray7150 == null || anIntArray7150.length != i_198_ * i_198_)
			anIntArray7150 = new int[i_198_ * i_198_];
		boolean bool_204_ = aBool7165 && !bool_201_;
		for (int i_205_ = 0; i_205_ < 64; i_205_++) {
			int i_206_ = i_202_ + i_205_;
			int i_207_ = i_205_ * i_198_ / 64;
			int i_208_ = (i_205_ + 1) * i_198_ / 64 - 1;
			if (i_208_ < i_207_)
				i_208_ = i_207_;
			for (int i_209_ = 0; i_209_ < 64; i_209_++) {
				int i_210_ = i_203_ + i_209_;
				boolean bool_211_ = bool;
				if (bool_204_ && !method8774(i_206_, i_210_))
					bool_211_ = false;
				int i_212_ = i_206_ + i_210_ * anInt7131;
				boolean bool_213_ = false;
				boolean bool_214_ = false;
				Object object = null;
				int i_215_ = ((aByteArray7143[i_212_] & 0xff) << 16 | aShortArray7144[i_212_] & 0xffff);
				if (i_215_ != 0)
					i_215_ |= ~0xffffff;
				short i_216_ = aShortArray7145[i_212_];
				object = anObjectArray7139[i_212_];
				int i_217_ = i_209_ * i_198_ / 64;
				int i_218_ = (i_209_ + 1) * i_198_ / 64 - 1;
				if (i_218_ < i_217_)
					i_218_ = i_217_;
				if (object != null) {
					if (object instanceof Class527_Sub39) {
						Class527_Sub39 class527_sub39 = (Class527_Sub39) object;
						if (class527_sub39 != null)
							method8767(anIntArray7150, i_207_, i_208_, i_217_, i_218_, i_198_, bool_211_, i_215_, i_216_, aByteArray7159[i_212_], class527_sub39.anIntArray10695, class527_sub39.aByteArray10694, true);
					} else {
						Integer integer = (Integer) object;
						anIntArray7127[0] = integer.intValue();
						aByteArray7132[0] = aByteArray7148[i_212_];
						method8767(anIntArray7150, i_207_, i_208_, i_217_, i_218_, i_198_, bool_211_, i_215_, i_216_, aByteArray7159[i_212_], anIntArray7127, aByteArray7132, true);
					}
				} else
					method8767(anIntArray7150, i_207_, i_208_, i_217_, i_218_, i_198_, bool_211_, i_215_, i_216_, aByteArray7159[i_212_], null, null, true);
			}
		}
		if (bool_200_) {
			for (int i_219_ = 0; i_219_ < 64; i_219_++) {
				int i_220_ = i_202_ + i_219_;
				boolean bool_221_ = i_219_ == 0 && i_220_ != 0;
				for (int i_222_ = 0; i_222_ < 64; i_222_++) {
					int i_223_ = i_203_ + i_222_;
					if (!bool_204_ || method8774(i_220_, i_223_)) {
						boolean bool_224_ = i_222_ == 0 && i_223_ != 0;
						int i_225_ = i_220_ + i_223_ * anInt7131;
						if (bool_221_ && bool_224_)
							method8758(class180, anIntArray7150, i_198_, -1, -1, i_220_ - 1, i_223_ - 1, i_225_ - 1 - anInt7131);
						if (bool_221_)
							method8758(class180, anIntArray7150, i_198_, -1, i_222_, i_220_ - 1, i_223_, i_225_ - 1);
						if (bool_224_)
							method8758(class180, anIntArray7150, i_198_, i_219_, -1, i_220_, i_223_ - 1, i_225_ - anInt7131);
						method8758(class180, anIntArray7150, i_198_, i_219_, i_222_, i_220_, i_223_, i_225_);
					}
				}
			}
		}
		int i_226_ = i * 64 / 64;
		int i_227_ = i_197_ * 64 / 64;
		for (int i_228_ = 0; i_228_ < 3; i_228_++) {
			for (int i_229_ = 0; i_229_ < 64; i_229_++) {
				int i_230_ = i_202_ + i_229_;
				int i_231_ = i_230_ & 0x3f;
				int i_232_ = i_229_ * i_198_ / 64;
				int i_233_ = (i_229_ + 1) * i_198_ / 64 - 1;
				if (i_233_ < i_232_)
					i_233_ = i_232_;
				for (int i_234_ = 0; i_234_ < 64; i_234_++) {
					int i_235_ = i_203_ + i_234_;
					boolean bool_236_ = bool;
					if (bool_204_ && !method8774(i_230_, i_235_))
						bool_236_ = false;
					int i_237_ = i_235_ & 0x3f;
					int i_238_ = i_234_ * i_198_ / 64;
					int i_239_ = (i_234_ + 1) * i_198_ / 64 - 1;
					if (i_239_ < i_238_)
						i_239_ = i_238_;
					HashMap hashmap = aHashMapArrayArrayArray7160[i_228_][i_226_][i_227_];
					if (hashmap != null) {
						Class528 class528 = ((Class528) hashmap.get(Integer.valueOf((i_231_ << 8) + i_237_)));
						if (class528 != null)
							method8767(anIntArray7150, i_232_, i_233_, i_238_, i_239_, i_198_, bool_236_, class528.anInt7111, class528.aShort7113, class528.aByte7112, class528.anIntArray7114, class528.aByteArray7108, false);
					}
				}
			}
			for (int i_240_ = 0; i_240_ < 64; i_240_++) {
				int i_241_ = i_202_ + i_240_;
				int i_242_ = i_241_ & 0x3f;
				for (int i_243_ = 0; i_243_ < 64; i_243_++) {
					int i_244_ = i_203_ + i_243_;
					if (!bool_204_ || method8774(i_241_, i_244_)) {
						int i_245_ = i_244_ & 0x3f;
						HashMap hashmap = (aHashMapArrayArrayArray7160[i_228_][i_226_][i_227_]);
						if (hashmap != null) {
							Class528 class528 = ((Class528) hashmap.get(Integer.valueOf((i_242_ << 8) + i_245_)));
							if (class528 != null)
								method8769(class180, anIntArray7150, i_198_, i_240_, i_243_, class528.anIntArray7114, class528.aByteArray7108);
						}
					}
				}
			}
		}
		if (bool_204_) {
			int i_246_ = 8;
			for (int i_247_ = 0; i_247_ < i_246_; i_247_++) {
				int i_248_ = i_202_ + i_247_ * 8;
				int i_249_ = i_247_ * i_198_ / i_246_;
				int i_250_ = (i_247_ + 1) * i_198_ / i_246_ - 1;
				for (int i_251_ = 0; i_251_ < i_246_; i_251_++) {
					int i_252_ = i_203_ + i_251_ * 8;
					if (!method8774(i_248_, i_252_)) {
						int i_253_ = i_251_ * i_198_ / i_246_;
						int i_254_ = (i_251_ + 1) * i_198_ / i_246_ - 1;
						if (i_198_ < 64)
							method8843(anIntArray7150, i_249_, i_250_, i_253_, i_254_, i_198_);
						else {
							aBoolArray7185[anInt7152] = method8774(i_248_, i_252_ + 8);
							aBoolArray7185[anInt7153] = method8774(i_248_ + 8, i_252_ + 8);
							aBoolArray7185[anInt7162] = method8774(i_248_ + 8, i_252_);
							aBoolArray7185[anInt7155] = method8774(i_248_ + 8, i_252_ - 8);
							aBoolArray7185[anInt7156] = method8774(i_248_, i_252_ - 8);
							aBoolArray7185[anInt7140] = method8774(i_248_ - 8, i_252_ - 8);
							aBoolArray7185[anInt7158] = method8774(i_248_ - 8, i_252_);
							aBoolArray7185[anInt7183] = method8774(i_248_ - 8, i_252_ + 8);
							method8778(anIntArray7150, i_249_, i_250_, i_253_, i_254_, i_198_);
						}
					}
				}
			}
		}
		aClass205_7163.method3790(class180.method3162(anIntArray7150, 0, i_198_, i_198_, i_198_, true), (long) i_199_);
	}

	static void method8767(int[] is, int i, int i_255_, int i_256_, int i_257_, int i_258_, boolean bool, int i_259_, int i_260_, int i_261_, int[] is_262_, byte[] is_263_, boolean bool_264_) {
		if (bool_264_ || i_259_ != 0 || i_260_ > 0) {
			if (i_260_ == 0)
				method8777(is, i, i_255_, i_256_, i_257_, i_258_, i_258_, i_259_ | ~0xffffff);
			else {
				int i_265_ = i_261_ & 0x3f;
				if (i_265_ == 0 || anInt7130 == 0) {
					int i_266_ = anIntArray7141[i_260_];
					if (bool_264_ || i_266_ != 0)
						method8777(is, i, i_255_, i_256_, i_257_, i_258_, i_258_, i_266_ | ~0xffffff);
				} else {
					int i_267_ = bool_264_ ? 0 : 1;
					int i_268_ = Class509.method8417(i_261_ >> 6 & 0x3, i_265_, -1218304892);
					i_265_ = Class554.method9215(i_265_, 1475843966);
					method8782(is, i, i_255_, i_256_, i_257_, i_258_, i_258_, i_259_, anIntArray7141[i_260_], aByteArrayArrayArray7118[i_265_ - 1][i_268_], anInt7130, i_267_);
				}
			}
		}
		if (bool && is_262_ != null) {
			int i_269_ = i_255_ - i + 1;
			int i_270_ = i_257_ - i_256_ + 1;
			for (int i_271_ = 0; i_271_ < is_262_.length; i_271_++) {
				int i_272_ = is_263_[i_271_] & 0x3f;
				if (i_272_ == Class596.aClass596_7835.anInt7844 * -1736797763 || (i_272_ == Class596.aClass596_7822.anInt7844 * -1736797763) || (i_272_ == Class596.aClass596_7838.anInt7844 * -1736797763) || (i_272_ == Class596.aClass596_7824.anInt7844 * -1736797763)) {
					Class602 class602 = ((Class602) aClass24_Sub6_7117.method81(is_262_[i_271_], 2034200664));
					if (class602.anInt7909 * 624402131 == -1) {
						int i_273_ = -3355444;
						if (class602.anInt7898 * -1508648055 == 1)
							i_273_ = -3407872;
						int i_274_ = is_263_[i_271_] >> 6 & 0x3;
						if (i_272_ == (Class596.aClass596_7835.anInt7844 * -1736797763)) {
							if (i_274_ == 0)
								method8871(is, i, i_257_, i_270_, i_258_, i_273_);
							else if (i_274_ == 1)
								method8783(is, i, i_257_, i_269_, i_258_, i_273_);
							else if (i_274_ == 2)
								method8871(is, i_255_, i_257_, i_270_, i_258_, i_273_);
							else
								method8783(is, i, i_256_, i_269_, i_258_, i_273_);
						} else if (i_272_ == (Class596.aClass596_7822.anInt7844 * -1736797763)) {
							if (i_274_ == 0) {
								method8871(is, i, i_257_, i_270_, i_258_, -1);
								method8783(is, i, i_257_, i_269_, i_258_, i_273_);
							} else if (i_274_ == 1) {
								method8871(is, i_255_, i_257_, i_270_, i_258_, -1);
								method8783(is, i, i_257_, i_269_, i_258_, i_273_);
							} else if (i_274_ == 2) {
								method8871(is, i_255_, i_257_, i_270_, i_258_, -1);
								method8783(is, i, i_256_, i_269_, i_258_, i_273_);
							} else {
								method8871(is, i, i_257_, i_270_, i_258_, -1);
								method8783(is, i, i_256_, i_269_, i_258_, i_273_);
							}
						} else if (i_272_ == (Class596.aClass596_7838.anInt7844 * -1736797763)) {
							if (i_274_ == 0)
								method8783(is, i, i_257_, 1, i_258_, i_273_);
							else if (i_274_ == 1)
								method8783(is, i_255_, i_257_, 1, i_258_, i_273_);
							else if (i_274_ == 2)
								method8783(is, i_255_, i_256_, 1, i_258_, i_273_);
							else
								method8783(is, i, i_256_, 1, i_258_, i_273_);
						} else if (i_272_ == (Class596.aClass596_7824.anInt7844 * -1736797763)) {
							if (i_274_ == 0 || i_274_ == 2) {
								for (int i_275_ = 0; i_275_ < i_270_; i_275_++)
									method8783(is, i + i_275_, i_256_ + i_275_, 1, i_258_, i_273_);
							} else {
								for (int i_276_ = 0; i_276_ < i_270_; i_276_++)
									method8783(is, i + i_276_, i_257_ - i_276_, 1, i_258_, i_273_);
							}
						}
					}
				}
			}
		}
	}

	static void method8768(int[] is, int i, int i_277_, int i_278_, int i_279_, int i_280_, int i_281_, int i_282_, boolean bool, boolean bool_283_, boolean bool_284_, boolean bool_285_) {
		for (int i_286_ = i; i_286_ <= i_277_; i_286_++) {
			boolean bool_287_ = bool_283_ ? (aBoolArray7185[anInt7162] && i_277_ - i_286_ < (aClass630_7122.anInt8235 * 1577317633)) : false;
			boolean bool_288_ = (bool_285_ ? (aBoolArray7185[anInt7158] && i_286_ - i < aClass630_7122.anInt8235 * 1577317633) : false);
			for (int i_289_ = i_278_; i_289_ <= i_279_; i_289_++) {
				if (bool_287_ || bool_288_)
					is[(i_280_ - i_289_ - 1) * i_280_ + i_286_] = aClass630_7122.anInt8232 * -993232789;
				else {
					boolean bool_290_ = (bool ? (aBoolArray7185[anInt7152] && (i_279_ - i_289_ < aClass630_7122.anInt8235 * 1577317633)) : false);
					boolean bool_291_ = (bool_284_ ? (aBoolArray7185[anInt7156] && (i_289_ - i_278_ < aClass630_7122.anInt8235 * 1577317633)) : false);
					if (bool_290_ || bool_291_)
						is[(i_280_ - i_289_ - 1) * i_280_ + i_286_] = aClass630_7122.anInt8232 * -993232789;
					else {
						int i_292_ = is[(i_280_ - i_289_ - 1) * i_280_ + i_286_];
						if (i_292_ != anInt7154) {
							anInt7154 = i_292_;
							anInt7184 = (~0xffffff | ((((aClass630_7122.anInt8223 * -1253775049 & 0xff00ff) * i_281_ + (i_292_ & 0xff00ff) * i_282_) & ~0xff00ff) + ((((aClass630_7122.anInt8223 * -1253775049) & 0xff00) * i_281_ + (i_292_ & 0xff00) * i_282_) & 0xff0000)) >> 8);
						}
						is[(i_280_ - i_289_ - 1) * i_280_ + i_286_] = anInt7184;
					}
				}
			}
		}
	}

	static void method8769(Class180 class180, int[] is, int i, int i_293_, int i_294_, int[] is_295_, byte[] is_296_) {
		if (is_295_ != null) {
			for (int i_297_ = 0; i_297_ < is_295_.length; i_297_++) {
				Class602 class602 = (Class602) aClass24_Sub6_7117.method81(is_295_[i_297_], 1948964862);
				int i_298_ = class602.anInt7909 * 624402131;
				if (i_298_ != -1) {
					Class54 class54 = ((Class54) aClass24_Sub8_7119.method81(i_298_, 167388282));
					Class147 class147 = class54.method1293(class180, (class602.aBool7910 ? is_296_[i_297_] >> 6 & 0x3 : 0), (class602.aBool7912 ? class602.aBool7931 : false), (byte) -8);
					int[] is_299_ = class54.method1295(class180, (class602.aBool7910 ? is_296_[i_297_] >> 6 & 0x3 : 0), (class602.aBool7912 ? class602.aBool7931 : false), (byte) -68);
					if (class147 != null) {
						int i_300_ = class147.method42();
						int i_301_ = class147.method2410();
						int i_302_ = i * i_300_ / 64 >> 2;
						int i_303_ = i * i_301_ / 64 >> 2;
						if (class54.aBool704) {
							int i_304_ = class602.anInt7874 * -49406469;
							int i_305_ = class602.anInt7891 * 1481957615;
							if ((is_296_[i_297_] >> 6 & 0x1) == 1) {
								int i_306_ = i_304_;
								i_304_ = i_305_;
								i_305_ = i_306_;
							}
							i_302_ = i_304_ * i / 64;
							i_303_ = i_305_ * i / 64;
						}
						if (i_302_ != 0 && i_303_ != 0) {
							int i_307_ = i_293_ * i / 64;
							int i_308_ = (64 - i_294_) * i / 64 - i_303_ + 1;
							for (int i_309_ = 0; i_309_ < i_302_; i_309_++) {
								int i_310_ = i_309_ + i_307_;
								if (i_310_ >= 0) {
									if (i_310_ >= i)
										break;
									for (int i_311_ = 0; i_311_ < i_303_; i_311_++) {
										int i_312_ = i_311_ + i_308_;
										if (i_312_ >= 0) {
											if (i_312_ >= i)
												break;
											int i_313_ = (is_299_[(i_309_ * i_300_ / i_302_ + i_300_ * (i_311_ * i_301_ / i_303_))]);
											int i_314_ = i_313_ >> 24 & 0xff;
											if (i_314_ != 0)
												is[i_310_ + i * i_312_] = i_313_;
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	static Class694 method8770(Class180 class180) {
		int i = anInt7177 - anInt7125;
		int i_315_ = anInt7136 - anInt7175;
		int i_316_ = (anInt7181 - anInt7179 << 16) / i;
		int i_317_ = (anInt7182 - anInt7180 << 16) / i_315_;
		return method8762(class180, i_316_, i_317_, 0, 0);
	}

	static int method8771(Class181 class181, int i, int i_318_, int i_319_) {
		return method8811(anInterface13_7142, class181, i, i_318_, i_319_);
	}

	static int method8772(Interface13 interface13, Class181 class181, int i, int i_320_, int i_321_) {
		Class660 class660 = (Class660) interface13.method81(i, 1852510046);
		if (class660 == null)
			return 0;
		int i_322_ = class660.anInt8501 * 482678519;
		if (i_322_ >= 0 && class181.method3544(i_322_, (byte) -66).aBool1806)
			i_322_ = -1;
		int i_323_;
		if (class660.anInt8505 * -742413183 >= 0) {
			int i_324_ = class660.anInt8505 * -742413183;
			int i_325_ = (i_324_ & 0x7f) + i_321_;
			if (i_325_ < 0)
				i_325_ = 0;
			else if (i_325_ > 127)
				i_325_ = 127;
			int i_326_ = (i_324_ + i_320_ & 0xfc00) + (i_324_ & 0x380) + i_325_;
			i_323_ = (~0xffffff | (Class656.anIntArray8393[Class453.method7333(Class508.method8272(i_326_, 96, (byte) -102), (byte) 10) & 0xffff]));
		} else if (i_322_ >= 0)
			i_323_ = (~0xffffff | (Class656.anIntArray8393[Class453.method7333(Class508.method8272((class181.method3544(i_322_, (byte) -115).aShort1810), 96, (byte) -12), (byte) 10) & 0xffff]));
		else if (class660.anInt8498 * 335838185 == -1)
			i_323_ = 0;
		else {
			int i_327_ = class660.anInt8498 * 335838185;
			int i_328_ = (i_327_ & 0x7f) + i_321_;
			if (i_328_ < 0)
				i_328_ = 0;
			else if (i_328_ > 127)
				i_328_ = 127;
			int i_329_ = (i_327_ + i_320_ & 0xfc00) + (i_327_ & 0x380) + i_328_;
			i_323_ = (~0xffffff | (Class656.anIntArray8393[Class453.method7333(Class508.method8272(i_329_, 96, (byte) -85), (byte) 10) & 0xffff]));
		}
		return i_323_;
	}

	static void method8773(Class180 class180, Class527_Sub30 class527_sub30, Class249 class249) {
		if (class249.anIntArray2760 != null) {
			int[] is = new int[class249.anIntArray2760.length];
			for (int i = 0; i < is.length / 2; i++) {
				int i_330_ = (class249.anIntArray2760[i * 2] + class527_sub30.anInt10568 * 208579007);
				int i_331_ = (class249.anIntArray2760[i * 2 + 1] + class527_sub30.anInt10565 * -1499963557);
				is[i * 2] = anInt7179 + ((anInt7181 - anInt7179) * (i_330_ - anInt7125) / (anInt7177 - anInt7125));
				is[i * 2 + 1] = anInt7182 - ((anInt7182 - anInt7180) * (i_331_ - anInt7175) / (anInt7136 - anInt7175));
			}
			Class168.method2679(class180, is, class249.anInt2765 * 1588851213);
			if (class249.anInt2770 * 713635825 > 0) {
				for (int i = 0; i < is.length / 2 - 1; i++) {
					int i_332_ = is[i * 2];
					int i_333_ = is[i * 2 + 1];
					int i_334_ = is[(i + 1) * 2];
					int i_335_ = is[(i + 1) * 2 + 1];
					if (i_334_ < i_332_) {
						int i_336_ = i_332_;
						int i_337_ = i_333_;
						i_332_ = i_334_;
						i_333_ = i_335_;
						i_334_ = i_336_;
						i_335_ = i_337_;
					} else if (i_334_ == i_332_ && i_335_ < i_333_) {
						int i_338_ = i_333_;
						i_333_ = i_335_;
						i_335_ = i_338_;
					}
					class180.method3151(i_332_, i_333_, i_334_, i_335_, (class249.anIntArray2773[class249.aByteArray2774[i] & 0xff]), 1, class249.anInt2770 * 713635825, class249.anInt2767 * 127279521, class249.anInt2768 * 218731315);
				}
				int i = is[is.length - 2];
				int i_339_ = is[is.length - 1];
				int i_340_ = is[0];
				int i_341_ = is[1];
				if (i_340_ < i) {
					int i_342_ = i;
					int i_343_ = i_339_;
					i = i_340_;
					i_339_ = i_341_;
					i_340_ = i_342_;
					i_341_ = i_343_;
				} else if (i_340_ == i && i_341_ < i_339_) {
					int i_344_ = i_339_;
					i_339_ = i_341_;
					i_341_ = i_344_;
				}
				class180.method3151(i, i_339_, i_340_, i_341_, (class249.anIntArray2773[((class249.aByteArray2774[class249.aByteArray2774.length - 1]) & 0xff)]), 1, class249.anInt2770 * 713635825, class249.anInt2767 * 127279521, class249.anInt2768 * 218731315);
			} else {
				for (int i = 0; i < is.length / 2 - 1; i++)
					class180.method3142(is[i * 2], is[i * 2 + 1], is[(i + 1) * 2], is[(i + 1) * 2 + 1], (class249.anIntArray2773[class249.aByteArray2774[i] & 0xff]), (byte) 1);
				class180.method3142(is[is.length - 2], is[is.length - 1], is[0], is[1], (class249.anIntArray2773[((class249.aByteArray2774[class249.aByteArray2774.length - 1]) & 0xff)]), (byte) 1);
			}
		}
	}

	static boolean method8774(int i, int i_345_) {
		int i_346_ = i >> 3;
		int i_347_ = i_345_ >> 3;
		if (i_346_ < 0 || i_347_ < 0 || i_346_ >= aBoolArrayArray7168.length || i_347_ >= aBoolArrayArray7168[i_346_].length)
			return false;
		return aBoolArrayArray7168[i_346_][i_347_];
	}

	static void method8775(int i, int i_348_, int i_349_, int i_350_, int i_351_, int i_352_, int i_353_, int i_354_) {
		anInt7125 = i - anInt7137;
		anInt7136 = i_348_ - anInt7138;
		anInt7177 = i_349_ - anInt7137;
		anInt7175 = i_350_ - anInt7138;
		anInt7179 = i_351_;
		anInt7180 = i_352_;
		anInt7181 = i_353_;
		anInt7182 = i_354_;
	}

	static int method8776(long l) {
		Class147 class147 = (Class147) aClass205_7163.method3787(l);
		if (class147 != null)
			return class147.method2407();
		return -1;
	}

	static void method8777(int[] is, int i, int i_355_, int i_356_, int i_357_, int i_358_, int i_359_, int i_360_) {
		for (int i_361_ = i; i_361_ <= i_355_; i_361_++) {
			for (int i_362_ = i_356_; i_362_ <= i_357_; i_362_++)
				is[(i_359_ - i_362_ - 1) * i_358_ + i_361_] = i_360_;
		}
	}

	static void method8778(int[] is, int i, int i_363_, int i_364_, int i_365_, int i_366_) {
		int i_367_ = aClass630_7122.anInt8223 * -1253775049 >> 24 & 0xff;
		int i_368_ = 255 - i_367_;
		if ((!aBoolArray7185[anInt7152] || !aBoolArray7185[anInt7162] && !aBoolArray7185[anInt7158]) && (!aBoolArray7185[anInt7156] || !aBoolArray7185[anInt7162] && !aBoolArray7185[anInt7158])) {
			method8768(is, i, i_363_, i_364_, i_365_, i_366_, i_367_, i_368_, true, true, true, true);
			if (aBoolArray7185[anInt7153]) {
				is[(i_366_ - i_365_ - 1) * i_366_ + i_363_] = aClass630_7122.anInt8232 * -993232789;
				is[(i_366_ - i_365_) * i_366_ + i_363_] = aClass630_7122.anInt8232 * -993232789;
				is[(i_366_ - i_365_ - 1) * i_366_ + i_363_ - 1] = aClass630_7122.anInt8232 * -993232789;
			}
			if (aBoolArray7185[anInt7155]) {
				is[(i_366_ - i_364_ - 1) * i_366_ + i_363_] = aClass630_7122.anInt8232 * -993232789;
				is[(i_366_ - i_364_ - 2) * i_366_ + i_363_] = aClass630_7122.anInt8232 * -993232789;
				is[(i_366_ - i_364_ - 1) * i_366_ + i_363_ - 1] = aClass630_7122.anInt8232 * -993232789;
			}
			if (aBoolArray7185[anInt7140]) {
				is[(i_366_ - i_364_ - 1) * i_366_ + i] = aClass630_7122.anInt8232 * -993232789;
				is[(i_366_ - i_364_ - 2) * i_366_ + i] = aClass630_7122.anInt8232 * -993232789;
				is[(i_366_ - i_364_ - 1) * i_366_ + i + 1] = aClass630_7122.anInt8232 * -993232789;
			}
			if (aBoolArray7185[anInt7183]) {
				is[(i_366_ - i_365_ - 1) * i_366_ + i] = aClass630_7122.anInt8232 * -993232789;
				is[(i_366_ - i_365_) * i_366_ + i] = aClass630_7122.anInt8232 * -993232789;
				is[(i_366_ - i_365_ - 1) * i_366_ + i + 1] = aClass630_7122.anInt8232 * -993232789;
			}
		} else {
			if (aBoolArray7185[anInt7152] && aBoolArray7185[anInt7162])
				method8781(is, i_363_ - aClass630_7122.anInt8231 * 1188642867 + 1, i_365_ - aClass630_7122.anInt8231 * 1188642867 + 1, i_366_, i_367_, i_368_, anInt7153);
			else {
				method8768(is, i_363_ - aClass630_7122.anInt8231 * 1188642867 + 1, i_363_, i_365_ - aClass630_7122.anInt8231 * 1188642867 + 1, i_365_, i_366_, i_367_, i_368_, true, true, false, false);
				if (aBoolArray7185[anInt7153]) {
					is[(i_366_ - i_365_ - 1) * i_366_ + i_363_] = aClass630_7122.anInt8232 * -993232789;
					is[(i_366_ - i_365_) * i_366_ + i_363_] = aClass630_7122.anInt8232 * -993232789;
					is[(i_366_ - i_365_ - 1) * i_366_ + i_363_ - 1] = aClass630_7122.anInt8232 * -993232789;
				}
			}
			if (aBoolArray7185[anInt7156] && aBoolArray7185[anInt7162])
				method8781(is, i_363_ - aClass630_7122.anInt8231 * 1188642867 + 1, i_364_, i_366_, i_367_, i_368_, anInt7155);
			else {
				method8768(is, i_363_ - aClass630_7122.anInt8231 * 1188642867 + 1, i_363_, i_364_, i_364_ + aClass630_7122.anInt8231 * 1188642867 - 1, i_366_, i_367_, i_368_, false, true, true, false);
				if (aBoolArray7185[anInt7155]) {
					is[(i_366_ - i_364_ - 1) * i_366_ + i_363_] = aClass630_7122.anInt8232 * -993232789;
					is[(i_366_ - i_364_ - 2) * i_366_ + i_363_] = aClass630_7122.anInt8232 * -993232789;
					is[(i_366_ - i_364_ - 1) * i_366_ + i_363_ - 1] = aClass630_7122.anInt8232 * -993232789;
				}
			}
			if (aBoolArray7185[anInt7156] && aBoolArray7185[anInt7158])
				method8781(is, i, i_364_, i_366_, i_367_, i_368_, anInt7140);
			else {
				method8768(is, i, i + aClass630_7122.anInt8231 * 1188642867 - 1, i_364_, i_364_ + aClass630_7122.anInt8231 * 1188642867 - 1, i_366_, i_367_, i_368_, false, false, true, true);
				if (aBoolArray7185[anInt7140]) {
					is[(i_366_ - i_364_ - 1) * i_366_ + i] = aClass630_7122.anInt8232 * -993232789;
					is[(i_366_ - i_364_ - 2) * i_366_ + i] = aClass630_7122.anInt8232 * -993232789;
					is[(i_366_ - i_364_ - 1) * i_366_ + i + 1] = aClass630_7122.anInt8232 * -993232789;
				}
			}
			if (aBoolArray7185[anInt7152] && aBoolArray7185[anInt7158])
				method8781(is, i, i_365_ - aClass630_7122.anInt8231 * 1188642867 + 1, i_366_, i_367_, i_368_, anInt7183);
			else {
				method8768(is, i, i + aClass630_7122.anInt8231 * 1188642867 - 1, i_365_ - aClass630_7122.anInt8231 * 1188642867 + 1, i_365_, i_366_, i_367_, i_368_, true, false, false, true);
				if (aBoolArray7185[anInt7183]) {
					is[(i_366_ - i_365_ - 1) * i_366_ + i] = aClass630_7122.anInt8232 * -993232789;
					is[(i_366_ - i_365_) * i_366_ + i] = aClass630_7122.anInt8232 * -993232789;
					is[(i_366_ - i_365_ - 1) * i_366_ + i + 1] = aClass630_7122.anInt8232 * -993232789;
				}
			}
			if (i + aClass630_7122.anInt8231 * 1188642867 < i_363_ - aClass630_7122.anInt8231 * 1188642867)
				method8768(is, i + aClass630_7122.anInt8231 * 1188642867, i_363_ - aClass630_7122.anInt8231 * 1188642867, i_364_, i_365_, i_366_, i_367_, i_368_, true, false, true, false);
			if (i_364_ + aClass630_7122.anInt8231 * 1188642867 + 1 < i_365_ - aClass630_7122.anInt8231 * 1188642867 - 1) {
				method8768(is, i, i + aClass630_7122.anInt8231 * 1188642867 - 1, i_364_ + aClass630_7122.anInt8231 * 1188642867, i_365_ - aClass630_7122.anInt8231 * 1188642867, i_366_, i_367_, i_368_, false, false, false, true);
				method8768(is, i_363_ - aClass630_7122.anInt8231 * 1188642867 + 1, i_363_, i_364_ + aClass630_7122.anInt8231 * 1188642867, i_365_ - aClass630_7122.anInt8231 * 1188642867, i_366_, i_367_, i_368_, false, true, false, false);
			}
		}
	}

	static void method8779(Class180 class180, boolean bool, boolean bool_369_, boolean bool_370_, boolean bool_371_) {
		int i = anInt7177 - anInt7125;
		int i_372_ = anInt7136 - anInt7175;
		int i_373_ = (anInt7181 - anInt7179 << 16) / i;
		int i_374_ = (anInt7182 - anInt7180 << 16) / i_372_;
		method8764(class180, bool, bool_369_, i_373_, i_374_, 0, 0, bool_370_, bool_371_);
	}

	static void method8780(Class180 class180, int i, int i_375_, int i_376_, int i_377_) {
		Class147 class147 = (Class147) aClass205_7163.method3787(-1L);
		if (class147 == null || class147.method2407() != i_376_) {
			int i_378_;
			if (aClass527_Sub8_Sub12_7123.anInt11759 * 1504321391 != -1)
				i_378_ = (~0xffffff | aClass527_Sub8_Sub12_7123.anInt11759 * 1504321391);
			else
				i_378_ = -16777216;
			if (anIntArray7150 == null || anIntArray7150.length != i_376_ * i_376_)
				anIntArray7150 = new int[i_376_ * i_376_];
			Arrays.fill(anIntArray7150, i_378_);
			class147 = class180.method3162(anIntArray7150, 0, i_376_, i_376_, i_376_, true);
			aClass205_7163.method3790(class147, -1L);
		}
		aClass205_7163.method3790(class147, (long) i_377_);
	}

	static void method8781(int[] is, int i, int i_379_, int i_380_, int i_381_, int i_382_, int i_383_) {
		for (int i_384_ = 0; i_384_ < aClass630_7122.anInt8231 * 1188642867; i_384_++) {
			int i_385_ = i_384_;
			if (i_383_ == anInt7153 || i_383_ == anInt7155)
				i_385_ = aClass630_7122.anInt8231 * 1188642867 - i_384_ - 1;
			for (int i_386_ = 0; i_386_ < aClass630_7122.anInt8231 * 1188642867; i_386_++) {
				int i_387_ = i_386_;
				if (i_383_ == anInt7155 || i_383_ == anInt7140)
					i_387_ = aClass630_7122.anInt8231 * 1188642867 - i_386_ - 1;
				int i_388_ = anIntArrayArray7151[i_385_][i_387_];
				if (i_388_ != 0) {
					if (i_388_ == 1) {
						int i_389_ = is[((i_380_ - i_379_ - i_386_ - 1) * i_380_ + i + i_384_)];
						if (i_389_ != anInt7154) {
							anInt7154 = i_389_;
							anInt7184 = (~0xffffff | ((((aClass630_7122.anInt8223 * -1253775049 & 0xff00ff) * i_381_ + (i_389_ & 0xff00ff) * i_382_) & ~0xff00ff) + ((((aClass630_7122.anInt8223 * -1253775049) & 0xff00) * i_381_ + (i_389_ & 0xff00) * i_382_) & 0xff0000)) >> 8);
						}
						is[((i_380_ - i_379_ - i_386_ - 1) * i_380_ + i + i_384_)] = anInt7184;
					} else if (i_388_ == 2)
						is[((i_380_ - i_379_ - i_386_ - 1) * i_380_ + i + i_384_)] = aClass630_7122.anInt8232 * -993232789;
				}
			}
		}
	}

	static void method8782(int[] is, int i, int i_390_, int i_391_, int i_392_, int i_393_, int i_394_, int i_395_, int i_396_, byte[] is_397_, int i_398_, int i_399_) {
		int i_400_ = 0;
		int i_401_ = 0;
		int i_402_ = i_390_ - i + 1;
		int i_403_ = i_392_ - i_391_ + 1;
		int i_404_ = (i_398_ << 16) / i_402_;
		int i_405_ = (is_397_.length / i_398_ << 16) / i_403_;
		int i_406_ = i + (i_394_ - i_392_ - 1) * i_393_;
		int i_407_ = i_395_ >> 24;
		int i_408_ = i_396_ >> 24;
		if (i_399_ == 0 || i_399_ == 1 && i_407_ == 255 && i_408_ == 255) {
			int i_409_ = i_400_;
			for (int i_410_ = -i_403_; i_410_ < 0; i_410_++) {
				int i_411_ = (i_401_ >> 16) * i_398_;
				for (int i_412_ = -i_402_; i_412_ < 0; i_412_++) {
					if (is_397_[(i_400_ >> 16) + i_411_] != 0)
						is[i_406_++] = i_396_;
					else
						is[i_406_++] = i_395_;
					i_400_ += i_404_;
				}
				i_401_ += i_405_;
				i_400_ = i_409_;
				i_406_ += i_393_ - i_402_;
			}
		} else if (i_399_ == 1) {
			int i_413_ = i_400_;
			for (int i_414_ = -i_403_; i_414_ < 0; i_414_++) {
				int i_415_ = (i_401_ >> 16) * i_398_;
				for (int i_416_ = -i_402_; i_416_ < 0; i_416_++) {
					int i_417_ = i_395_;
					if (is_397_[(i_400_ >> 16) + i_415_] != 0)
						i_417_ = i_396_;
					int i_418_ = i_417_ >>> 24;
					int i_419_ = 255 - i_418_;
					int i_420_ = is[i_406_];
					is[i_406_++] = ~0xffffff | ((((i_417_ & 0xff00ff) * i_418_ + (i_420_ & 0xff00ff) * i_419_) & ~0xff00ff) + (((i_417_ & 0xff00) * i_418_ + (i_420_ & 0xff00) * i_419_) & 0xff0000)) >> 8;
					i_400_ += i_404_;
				}
				i_401_ += i_405_;
				i_400_ = i_413_;
				i_406_ += i_393_ - i_402_;
			}
		} else
			throw new IllegalArgumentException();
	}

	static void method8783(int[] is, int i, int i_421_, int i_422_, int i_423_, int i_424_) {
		int i_425_ = i + (i_423_ - i_421_ - 1) * i_423_;
		for (int i_426_ = 0; i_426_ < i_422_; i_426_++)
			is[i_425_ + i_426_] = i_424_;
	}

	static Class694 method8784(Class180 class180, int i, int i_427_, int i_428_, int i_429_) {
		for (Class527_Sub30 class527_sub30 = (Class527_Sub30) aClass694_7147.method14081((short) 10706); class527_sub30 != null; class527_sub30 = (Class527_Sub30) aClass694_7147.method14086(-65534))
			method8830(class180, class527_sub30, i, i_427_, i_428_, i_429_);
		return aClass694_7147;
	}

	static {
		aClass14_7126 = new Class14(16);
		anInt7116 = (int) (Math.random() * 11.0) - 5;
		anInt7128 = (int) (Math.random() * 17.0) - 8;
		anIntArray7127 = new int[1];
		aByteArray7132 = new byte[1];
		aClass694_7147 = new Class694();
		aBool7165 = true;
		anIntArrayArray7151 = new int[][] { { 2, 2, 0, 0, 0, 0 }, { 2, 2, 2, 0, 0, 0 }, { 1, 2, 2, 2, 0, 0 }, { 1, 1, 1, 2, 2, 0 }, { 1, 1, 1, 2, 2, 2 }, { 1, 1, 1, 1, 2, 2 } };
		anInt7152 = Class681.aClass681_8638.method87();
		anInt7153 = Class681.aClass681_8633.method87();
		anInt7162 = Class681.aClass681_8635.method87();
		anInt7155 = Class681.aClass681_8636.method87();
		anInt7156 = Class681.aClass681_8641.method87();
		anInt7140 = Class681.aClass681_8634.method87();
		anInt7158 = Class681.aClass681_8639.method87();
		anInt7183 = Class681.aClass681_8640.method87();
		aClass205_7161 = new Class205(4096, 256);
		aClass205_7129 = new Class205(4096, 1024);
		aClass205_7163 = aClass205_7161;
		anArrayList7146 = new ArrayList();
		anInt7166 = 262144;
		anInt7178 = 0;
		anInt7169 = 5;
		aClass527_Sub38_7170 = null;
		aClass527_Sub38_7171 = null;
		aBool7172 = true;
		new Date();
		anInt7154 = 0;
		anInt7184 = 0;
		aBoolArray7185 = new boolean[8];
	}

	static void method8785(Class180 class180, RSByteBuffer class527_sub38, int i, int i_430_, int i_431_, int i_432_, int[] is, int[] is_433_) {
		int i_434_ = class527_sub38.readUnsignedByte();
		if ((i_434_ & 0x1) == 0) {
			boolean bool = (i_434_ & 0x2) == 0;
			int i_435_ = i_434_ >> 2 & 0x3f;
			if (i_435_ != 62) {
				if (i_435_ == 63)
					i_435_ = class527_sub38.readUnsignedSmart((byte) -41);
				else if (bool)
					i_435_ = is[i_435_];
				else
					i_435_ = is_433_[i_435_];
				if (bool) {
					aShortArray7149[i_431_ + i_432_ * anInt7131] = (short) i_435_;
					aShortArray7145[i_431_ + i_432_ * anInt7131] = (short) 0;
				} else {
					aShortArray7145[i_431_ + i_432_ * anInt7131] = (short) i_435_;
					aByteArray7159[i_431_ + i_432_ * anInt7131] = (byte) 0;
					aShortArray7149[i_431_ + i_432_ * anInt7131] = (short) class527_sub38.readUnsignedSmart((byte) -19);
				}
			}
		} else {
			int i_436_ = (i_434_ >> 1 & 0x3) + 1;
			boolean bool = (i_434_ & 0x8) != 0;
			boolean bool_437_ = (i_434_ & 0x10) != 0;
			for (int i_438_ = 0; i_438_ < i_436_; i_438_++) {
				int i_439_ = class527_sub38.readUnsignedSmart((byte) -14);
				int i_440_ = 0;
				int i_441_ = 0;
				if (bool) {
					i_440_ = class527_sub38.readUnsignedSmart((byte) -3);
					i_441_ = class527_sub38.readUnsignedByte();
				}
				int i_442_ = 0;
				if (bool_437_)
					i_442_ = class527_sub38.readUnsignedByte();
				if (i_438_ == 0) {
					aShortArray7149[i_431_ + i_432_ * anInt7131] = (short) i_439_;
					aShortArray7145[i_431_ + i_432_ * anInt7131] = (short) i_440_;
					aByteArray7159[i_431_ + i_432_ * anInt7131] = (byte) i_441_;
					if (i_442_ == 1) {
						anObjectArray7139[i_431_ + i_432_ * anInt7131] = new Integer(class527_sub38.method16466(-2038409841));
						aByteArray7148[i_431_ + i_432_ * anInt7131] = class527_sub38.readByte();
					} else if (i_442_ > 1) {
						int[] is_443_ = new int[i_442_];
						byte[] is_444_ = new byte[i_442_];
						for (int i_445_ = 0; i_445_ < i_442_; i_445_++) {
							is_443_[i_445_] = class527_sub38.method16466(-1750382961);
							is_444_[i_445_] = class527_sub38.readByte();
						}
						anObjectArray7139[i_431_ + i_432_ * anInt7131] = new Class527_Sub39(is_443_, is_444_);
					}
				} else {
					int[] is_446_ = null;
					byte[] is_447_ = null;
					if (i_442_ > 0) {
						is_446_ = new int[i_442_];
						is_447_ = new byte[i_442_];
						for (int i_448_ = 0; i_448_ < i_442_; i_448_++) {
							is_446_[i_448_] = class527_sub38.method16466(-1951143175);
							is_447_[i_448_] = class527_sub38.readByte();
						}
					}
					if ((aHashMapArrayArrayArray7160[i_438_ - 1][i - (anInt7137 >> 6)][i_430_ - (anInt7138 >> 6)]) == null)
						aHashMapArrayArrayArray7160[i_438_ - 1][i - (anInt7137 >> 6)][i_430_ - (anInt7138 >> 6)] = new HashMap();
					int i_449_ = ((i_431_ & 0x3f) << 8) + (i_432_ & 0x3f);
					Class528 class528 = new Class528(i_431_ & 0x3f, i_432_ & 0x3f, i_439_, i_440_, i_441_, is_446_, is_447_);
					aHashMapArrayArrayArray7160[i_438_ - 1][i - (anInt7137 >> 6)][i_430_ - (anInt7138 >> 6)].put(Integer.valueOf(i_449_), class528);
				}
			}
		}
	}

	public static void method8786(Class459 class459, Class459 class459_450_, Class24_Sub14 class24_sub14, Class24_Sub5 class24_sub5, Class24_Sub6 class24_sub6, Class24_Sub12 class24_sub12, Class24_Sub8 class24_sub8, Interface20 interface20, Interface18 interface18) {
		aClass459_7124 = class459;
		aClass459_7115 = class459_450_;
		anInterface13_7142 = class24_sub14;
		anInterface13_7157 = class24_sub5;
		aClass24_Sub6_7117 = class24_sub6;
		aClass24_Sub12_7164 = class24_sub12;
		aClass24_Sub8_7119 = class24_sub8;
		anInterface20_7121 = interface20;
		anInterface18_7120 = interface18;
		aClass14_7126.method721(-17340321);
		int[] is = aClass459_7124.method7486(Class651.aClass651_8380.method87(), 2147483647);
		if (is != null) {
			for (int i = 0; i < is.length; i++) {
				Class527_Sub8_Sub12 class527_sub8_sub12 = Class612.method10124(aClass459_7124, is[i], (short) 31506);
				aClass14_7126.method714(class527_sub8_sub12, (long) (class527_sub8_sub12.anInt11765 * 911503199));
			}
		}
		Class25.method851(true, false, (byte) 3);
	}

	static void method8787() {
		aShortArray7149 = null;
		aByteArray7143 = null;
		aShortArray7144 = null;
		aShortArray7145 = null;
		aByteArray7159 = null;
		anObjectArray7139 = null;
		aByteArray7148 = null;
		aHashMapArrayArrayArray7160 = null;
		anIntArray7141 = null;
		aBoolArrayArray7168 = null;
	}

	static void method8788(int i) {
		Class527_Sub8_Sub12 class527_sub8_sub12 = (Class527_Sub8_Sub12) aClass14_7126.method709((long) i);
		if (class527_sub8_sub12 != null && class527_sub8_sub12 != aClass527_Sub8_Sub12_7123) {
			aClass527_Sub8_Sub12_7123 = class527_sub8_sub12;
			aBool7165 = (aClass527_Sub8_Sub12_7123.anInt11765 * 911503199 == aClass630_7122.anInt8230 * 346103239);
		}
	}

	static void method8789(int i) {
		Class527_Sub8_Sub12 class527_sub8_sub12 = (Class527_Sub8_Sub12) aClass14_7126.method709((long) i);
		if (class527_sub8_sub12 != null && class527_sub8_sub12 != aClass527_Sub8_Sub12_7123) {
			aClass527_Sub8_Sub12_7123 = class527_sub8_sub12;
			aBool7165 = (aClass527_Sub8_Sub12_7123.anInt11765 * 911503199 == aClass630_7122.anInt8230 * 346103239);
		}
	}

	static void method8790(int i) {
		Class527_Sub8_Sub12 class527_sub8_sub12 = (Class527_Sub8_Sub12) aClass14_7126.method709((long) i);
		if (class527_sub8_sub12 != null && class527_sub8_sub12 != aClass527_Sub8_Sub12_7123) {
			aClass527_Sub8_Sub12_7123 = class527_sub8_sub12;
			aBool7165 = (aClass527_Sub8_Sub12_7123.anInt11765 * 911503199 == aClass630_7122.anInt8230 * 346103239);
		}
	}

	static void method8791(int i) {
		Class527_Sub8_Sub12 class527_sub8_sub12 = (Class527_Sub8_Sub12) aClass14_7126.method709((long) i);
		if (class527_sub8_sub12 != null && class527_sub8_sub12 != aClass527_Sub8_Sub12_7123) {
			aClass527_Sub8_Sub12_7123 = class527_sub8_sub12;
			aBool7165 = (aClass527_Sub8_Sub12_7123.anInt11765 * 911503199 == aClass630_7122.anInt8230 * 346103239);
		}
	}

	static void method8792(int[] is, int i, int i_451_, int i_452_, int i_453_, int i_454_, boolean bool, int i_455_, int i_456_, int i_457_, int[] is_458_, byte[] is_459_, boolean bool_460_) {
		if (bool_460_ || i_455_ != 0 || i_456_ > 0) {
			if (i_456_ == 0)
				method8777(is, i, i_451_, i_452_, i_453_, i_454_, i_454_, i_455_ | ~0xffffff);
			else {
				int i_461_ = i_457_ & 0x3f;
				if (i_461_ == 0 || anInt7130 == 0) {
					int i_462_ = anIntArray7141[i_456_];
					if (bool_460_ || i_462_ != 0)
						method8777(is, i, i_451_, i_452_, i_453_, i_454_, i_454_, i_462_ | ~0xffffff);
				} else {
					int i_463_ = bool_460_ ? 0 : 1;
					int i_464_ = Class509.method8417(i_457_ >> 6 & 0x3, i_461_, -1218304892);
					i_461_ = Class554.method9215(i_461_, -321867694);
					method8782(is, i, i_451_, i_452_, i_453_, i_454_, i_454_, i_455_, anIntArray7141[i_456_], aByteArrayArrayArray7118[i_461_ - 1][i_464_], anInt7130, i_463_);
				}
			}
		}
		if (bool && is_458_ != null) {
			int i_465_ = i_451_ - i + 1;
			int i_466_ = i_453_ - i_452_ + 1;
			for (int i_467_ = 0; i_467_ < is_458_.length; i_467_++) {
				int i_468_ = is_459_[i_467_] & 0x3f;
				if (i_468_ == Class596.aClass596_7835.anInt7844 * -1736797763 || (i_468_ == Class596.aClass596_7822.anInt7844 * -1736797763) || (i_468_ == Class596.aClass596_7838.anInt7844 * -1736797763) || (i_468_ == Class596.aClass596_7824.anInt7844 * -1736797763)) {
					Class602 class602 = ((Class602) aClass24_Sub6_7117.method81(is_458_[i_467_], 1937606035));
					if (class602.anInt7909 * 624402131 == -1) {
						int i_469_ = -3355444;
						if (class602.anInt7898 * -1508648055 == 1)
							i_469_ = -3407872;
						int i_470_ = is_459_[i_467_] >> 6 & 0x3;
						if (i_468_ == (Class596.aClass596_7835.anInt7844 * -1736797763)) {
							if (i_470_ == 0)
								method8871(is, i, i_453_, i_466_, i_454_, i_469_);
							else if (i_470_ == 1)
								method8783(is, i, i_453_, i_465_, i_454_, i_469_);
							else if (i_470_ == 2)
								method8871(is, i_451_, i_453_, i_466_, i_454_, i_469_);
							else
								method8783(is, i, i_452_, i_465_, i_454_, i_469_);
						} else if (i_468_ == (Class596.aClass596_7822.anInt7844 * -1736797763)) {
							if (i_470_ == 0) {
								method8871(is, i, i_453_, i_466_, i_454_, -1);
								method8783(is, i, i_453_, i_465_, i_454_, i_469_);
							} else if (i_470_ == 1) {
								method8871(is, i_451_, i_453_, i_466_, i_454_, -1);
								method8783(is, i, i_453_, i_465_, i_454_, i_469_);
							} else if (i_470_ == 2) {
								method8871(is, i_451_, i_453_, i_466_, i_454_, -1);
								method8783(is, i, i_452_, i_465_, i_454_, i_469_);
							} else {
								method8871(is, i, i_453_, i_466_, i_454_, -1);
								method8783(is, i, i_452_, i_465_, i_454_, i_469_);
							}
						} else if (i_468_ == (Class596.aClass596_7838.anInt7844 * -1736797763)) {
							if (i_470_ == 0)
								method8783(is, i, i_453_, 1, i_454_, i_469_);
							else if (i_470_ == 1)
								method8783(is, i_451_, i_453_, 1, i_454_, i_469_);
							else if (i_470_ == 2)
								method8783(is, i_451_, i_452_, 1, i_454_, i_469_);
							else
								method8783(is, i, i_452_, 1, i_454_, i_469_);
						} else if (i_468_ == (Class596.aClass596_7824.anInt7844 * -1736797763)) {
							if (i_470_ == 0 || i_470_ == 2) {
								for (int i_471_ = 0; i_471_ < i_466_; i_471_++)
									method8783(is, i + i_471_, i_452_ + i_471_, 1, i_454_, i_469_);
							} else {
								for (int i_472_ = 0; i_472_ < i_466_; i_472_++)
									method8783(is, i + i_472_, i_453_ - i_472_, 1, i_454_, i_469_);
							}
						}
					}
				}
			}
		}
	}

	static Class694 method8793(Class180 class180, int i, int i_473_, int i_474_, int i_475_) {
		for (Class527_Sub30 class527_sub30 = (Class527_Sub30) aClass694_7147.method14081((short) -6809); class527_sub30 != null; class527_sub30 = (Class527_Sub30) aClass694_7147.method14086(-65534))
			method8830(class180, class527_sub30, i, i_473_, i_474_, i_475_);
		return aClass694_7147;
	}

	static Class694 method8794(Class180 class180, int i, int i_476_, int i_477_, int i_478_) {
		for (Class527_Sub30 class527_sub30 = (Class527_Sub30) aClass694_7147.method14081((short) -3632); class527_sub30 != null; class527_sub30 = (Class527_Sub30) aClass694_7147.method14086(-65534))
			method8830(class180, class527_sub30, i, i_476_, i_477_, i_478_);
		return aClass694_7147;
	}

	static void method8795(int[] is, int i, int i_479_, int i_480_, int i_481_, int i_482_) {
		int i_483_ = i + (i_481_ - i_479_ - 1) * i_481_;
		for (int i_484_ = 0; i_484_ < i_480_; i_484_++)
			is[i_483_ + i_484_ * i_481_] = i_482_;
	}

	public static Class527_Sub8_Sub12 method8796(int i, int i_485_) {
		for (Class527_Sub8_Sub12 class527_sub8_sub12 = (Class527_Sub8_Sub12) aClass14_7126.method713((byte) -94); class527_sub8_sub12 != null; class527_sub8_sub12 = ((Class527_Sub8_Sub12) aClass14_7126.method717(-1245345939))) {
			if (class527_sub8_sub12.aBool11758 && class527_sub8_sub12.method18301(i, i_485_, -2089633582))
				return class527_sub8_sub12;
		}
		return null;
	}

	public static Class527_Sub8_Sub12 method8797(int i) {
		return (Class527_Sub8_Sub12) aClass14_7126.method709((long) i);
	}

	public static Class527_Sub8_Sub12 method8798(int i) {
		return (Class527_Sub8_Sub12) aClass14_7126.method709((long) i);
	}

	static boolean method8799(Class527_Sub8_Sub12 class527_sub8_sub12) {
		if (class527_sub8_sub12 != null && class527_sub8_sub12 != aClass527_Sub8_Sub12_7123) {
			aClass527_Sub8_Sub12_7123 = class527_sub8_sub12;
			aBool7165 = (aClass527_Sub8_Sub12_7123.anInt11765 * 911503199 == aClass630_7122.anInt8230 * 346103239);
			return true;
		}
		return false;
	}

	public static Class693 method8800(int i, int i_486_) {
		Class693 class693 = new Class693();
		for (Class527_Sub8_Sub12 class527_sub8_sub12 = (Class527_Sub8_Sub12) aClass14_7126.method713((byte) -109); class527_sub8_sub12 != null; class527_sub8_sub12 = (Class527_Sub8_Sub12) aClass14_7126.method717(2009305847)) {
			if (class527_sub8_sub12.aBool11758 && class527_sub8_sub12.method18301(i, i_486_, -1102082209))
				class693.method14055(class527_sub8_sub12, 1280750088);
		}
		return class693;
	}

	public static Class693 method8801(int i, int i_487_) {
		Class693 class693 = new Class693();
		for (Class527_Sub8_Sub12 class527_sub8_sub12 = (Class527_Sub8_Sub12) aClass14_7126.method713((byte) -51); class527_sub8_sub12 != null; class527_sub8_sub12 = (Class527_Sub8_Sub12) aClass14_7126.method717(2013471641)) {
			if (class527_sub8_sub12.aBool11758 && class527_sub8_sub12.method18301(i, i_487_, -1572929250))
				class693.method14055(class527_sub8_sub12, 340624836);
		}
		return class693;
	}

	public static Class693 method8802(int i, int i_488_) {
		Class693 class693 = new Class693();
		for (Class527_Sub8_Sub12 class527_sub8_sub12 = (Class527_Sub8_Sub12) aClass14_7126.method713((byte) -28); class527_sub8_sub12 != null; class527_sub8_sub12 = ((Class527_Sub8_Sub12) aClass14_7126.method717(-1121325277))) {
			if (class527_sub8_sub12.aBool11758 && class527_sub8_sub12.method18301(i, i_488_, 295008949))
				class693.method14055(class527_sub8_sub12, 777464086);
		}
		return class693;
	}

	static void method8803(Class181 class181, int i, int i_489_) {
		for (int i_490_ = 0; i_490_ < anInterface13_7142.method77(1719798337); i_490_++)
			anIntArray7141[i_490_ + 1] = method8755(class181, i_490_, i, i_489_);
	}

	static void method8804(Class181 class181, int i, int i_491_) {
		for (int i_492_ = 0; i_492_ < anInterface13_7142.method77(-486588041); i_492_++)
			anIntArray7141[i_492_ + 1] = method8755(class181, i_492_, i, i_491_);
	}

	static void method8805(Class181 class181, int i, int i_493_) {
		for (int i_494_ = 0; i_494_ < anInterface13_7142.method77(1176006217); i_494_++)
			anIntArray7141[i_494_ + 1] = method8755(class181, i_494_, i, i_493_);
	}

	static int method8806(Class181 class181, int i, int i_495_, int i_496_) {
		return method8811(anInterface13_7142, class181, i, i_495_, i_496_);
	}

	static int method8807(Class181 class181, int i, int i_497_, int i_498_) {
		return method8811(anInterface13_7142, class181, i, i_497_, i_498_);
	}

	static boolean method8808(Class180 class180, int i, int i_499_, boolean bool) {
		long l = Class234.method4347(-1408626088);
		if (anInt7178 == 0) {
			if (aClass527_Sub8_Sub12_7123.anInt11765 * 911503199 == aClass630_7122.anInt8228 * 1674945435) {
				int i_500_ = aClass459_7115.method7540((aClass527_Sub8_Sub12_7123.aString11755), -1193884611);
				if (aClass527_Sub38_7171 == null)
					aClass527_Sub38_7171 = (new RSByteBuffer(aClass459_7115.method7470(i_500_, 0, (byte) -33)));
				aClass527_Sub38_7170 = aClass527_Sub38_7171;
				aClass527_Sub38_7170.anInt10689 = 0;
			} else {
				int i_501_ = aClass459_7115.method7540((aClass527_Sub8_Sub12_7123.aString11755), -1193884611);
				aClass527_Sub38_7170 = (new RSByteBuffer(aClass459_7115.method7470(i_501_, 0, (byte) -33)));
			}
			int i_502_ = aClass527_Sub38_7170.readUnsignedByte();
			anIntArray7173 = new int[i_502_];
			for (int i_503_ = 0; i_503_ < i_502_; i_503_++)
				anIntArray7173[i_503_] = aClass527_Sub38_7170.readUnsignedSmart((byte) -24);
			int i_504_ = aClass527_Sub38_7170.readUnsignedByte();
			anIntArray7174 = new int[i_504_];
			for (int i_505_ = 0; i_505_ < i_504_; i_505_++)
				anIntArray7174[i_505_] = aClass527_Sub38_7170.readUnsignedSmart((byte) -77);
		}
		while (aClass527_Sub38_7170 != null && (aClass527_Sub38_7170.anInt10689 * -441238943 < aClass527_Sub38_7170.buffer.length) && (!bool || (Class234.method4347(-1408626088) < l + (long) anInt7169))) {
			if (aClass527_Sub38_7170.readUnsignedByte() == 0) {
				int i_506_ = aClass527_Sub38_7170.readUnsignedByte();
				int i_507_ = aClass527_Sub38_7170.readUnsignedByte();
				for (int i_508_ = 0; i_508_ < 8; i_508_++) {
					int i_509_ = aClass527_Sub38_7170.readUnsignedByte();
					int i_510_ = i_506_ * 8 + i_508_ - anInt7137 / 8;
					for (int i_511_ = 0; i_511_ < 8; i_511_++) {
						int i_512_ = i_507_ * 8 + i_511_ - anInt7138 / 8;
						aBoolArrayArray7168[i_510_][i_512_] = (i_509_ & 1 << i_511_) != 0;
					}
				}
				for (int i_513_ = 0; i_513_ < 64; i_513_++) {
					for (int i_514_ = 0; i_514_ < 64; i_514_++) {
						int i_515_ = i_506_ * 64 + i_513_ - anInt7137;
						int i_516_ = i_507_ * 64 + i_514_ - anInt7138;
						method8845(class180, aClass527_Sub38_7170, i_506_, i_507_, i_515_, i_516_, anIntArray7173, anIntArray7174);
					}
				}
			} else {
				int i_517_ = aClass527_Sub38_7170.readUnsignedByte();
				int i_518_ = aClass527_Sub38_7170.readUnsignedByte();
				int i_519_ = aClass527_Sub38_7170.readUnsignedByte();
				int i_520_ = aClass527_Sub38_7170.readUnsignedByte();
				aBoolArrayArray7168[i_517_ * 8 + i_519_ - anInt7137 / 8][i_518_ * 8 + i_520_ - anInt7138 / 8] = aClass527_Sub38_7170.readUnsignedByte() != 0;
				for (int i_521_ = 0; i_521_ < 8; i_521_++) {
					for (int i_522_ = 0; i_522_ < 8; i_522_++) {
						int i_523_ = i_517_ * 64 + i_519_ * 8 + i_521_ - anInt7137;
						int i_524_ = i_518_ * 64 + i_520_ * 8 + i_522_ - anInt7138;
						method8845(class180, aClass527_Sub38_7170, i_517_, i_518_, i_523_, i_524_, anIntArray7173, anIntArray7174);
					}
				}
			}
		}
		if (aClass527_Sub38_7170 != null) {
			anInt7178 = aClass527_Sub38_7170.anInt10689 * -441238943;
			if (aClass527_Sub38_7170.anInt10689 * -441238943 < aClass527_Sub38_7170.buffer.length)
				return false;
		}
		aClass527_Sub38_7170 = null;
		anIntArray7174 = null;
		anIntArray7173 = null;
		if (aShortArray7149 != null) {
			aByteArray7143 = new byte[anInt7131 * anInt7167];
			aShortArray7144 = new short[anInt7131 * anInt7167];
			for (int i_525_ = 0; i_525_ < 3; i_525_++) {
				short[] is = new short[anInt7131 * anInt7167];
				for (int i_526_ = 0; i_526_ < aHashMapArrayArrayArray7160[i_525_].length; i_526_++) {
					for (int i_527_ = 0; (i_527_ < aHashMapArrayArrayArray7160[i_525_][0].length); i_527_++) {
						HashMap hashmap = (aHashMapArrayArrayArray7160[i_525_][i_526_][i_527_]);
						if (hashmap != null) {
							Iterator iterator = hashmap.values().iterator();
							while (iterator.hasNext()) {
								Class528 class528 = (Class528) iterator.next();
								is[(i_526_ * 64 + class528.aByte7110 + ((i_527_ * 64 + class528.aByte7109) * anInt7131))] = (short) class528.anInt7111;
							}
						}
					}
				}
				method8760(is, aByteArray7143, aShortArray7144, i, i_499_);
				for (int i_528_ = 0; i_528_ < aHashMapArrayArrayArray7160[i_525_].length; i_528_++) {
					for (int i_529_ = 0; (i_529_ < aHashMapArrayArrayArray7160[i_525_][0].length); i_529_++) {
						HashMap hashmap = (aHashMapArrayArrayArray7160[i_525_][i_528_][i_529_]);
						if (hashmap != null) {
							Iterator iterator = hashmap.values().iterator();
							while (iterator.hasNext()) {
								Class528 class528 = (Class528) iterator.next();
								int i_530_ = (i_528_ * 64 + class528.aByte7110 + ((i_529_ * 64 + class528.aByte7109) * anInt7131));
								class528.anInt7111 = ((aByteArray7143[i_530_] & 0xff) << 16 | aShortArray7144[i_530_] & 0xffff);
								if (class528.anInt7111 != 0)
									class528.anInt7111 |= ~0xffffff;
							}
						}
					}
				}
			}
			method8760(aShortArray7149, aByteArray7143, aShortArray7144, i, i_499_);
			aShortArray7149 = null;
		}
		if (!bool || Class234.method4347(-1408626088) < l + (long) anInt7169) {
			method8751();
			return true;
		}
		return false;
	}

	static void method8809() {
		for (int i = 0; i < anInt7131; i++) {
			for (int i_531_ = 0; i_531_ < anInt7167; i_531_++) {
				Object object = anObjectArray7139[i + i_531_ * anInt7131];
				if (object != null) {
					if (object instanceof Class527_Sub39) {
						Class527_Sub39 class527_sub39 = (Class527_Sub39) object;
						if (class527_sub39 != null) {
							for (int i_532_ = 0; (i_532_ < class527_sub39.anIntArray10695.length); i_532_++) {
								Class602 class602 = (Class602) (aClass24_Sub6_7117.method81((class527_sub39.anIntArray10695[i_532_]), -1680545838));
								int i_533_ = class602.anInt7928 * -177138561;
								if (class602.anIntArray7929 != null) {
									class602 = (class602.method9962(anInterface20_7121, anInterface18_7120, 1137928779));
									if (class602 != null)
										i_533_ = class602.anInt7928 * -177138561;
								}
								if (i_533_ != -1) {
									Class527_Sub30 class527_sub30 = new Class527_Sub30(i_533_);
									class527_sub30.anInt10568 = i * -2077866433;
									class527_sub30.anInt10565 = i_531_ * 698398931;
									aClass694_7147.method14147(class527_sub30, -447206572);
								}
							}
						}
					} else {
						Integer integer = (Integer) object;
						Class602 class602 = ((Class602) aClass24_Sub6_7117.method81(integer.intValue(), -90662206));
						int i_534_ = class602.anInt7928 * -177138561;
						if (class602.anIntArray7929 != null) {
							class602 = class602.method9962(anInterface20_7121, anInterface18_7120, 1137928779);
							if (class602 != null)
								i_534_ = class602.anInt7928 * -177138561;
						}
						if (i_534_ != -1) {
							Class527_Sub30 class527_sub30 = new Class527_Sub30(i_534_);
							class527_sub30.anInt10568 = i * -2077866433;
							class527_sub30.anInt10565 = i_531_ * 698398931;
							aClass694_7147.method14147(class527_sub30, -970390157);
						}
					}
				}
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int i_535_ = 0; i_535_ < aHashMapArrayArrayArray7160[0].length; i_535_++) {
				for (int i_536_ = 0; i_536_ < aHashMapArrayArrayArray7160[0][0].length; i_536_++) {
					HashMap hashmap = aHashMapArrayArrayArray7160[i][i_535_][i_536_];
					if (hashmap != null) {
						Iterator iterator = hashmap.values().iterator();
						while (iterator.hasNext()) {
							Class528 class528 = (Class528) iterator.next();
							if (class528.anIntArray7114 != null) {
								for (int i_537_ = 0; i_537_ < class528.anIntArray7114.length; i_537_++) {
									Class602 class602 = ((Class602) (aClass24_Sub6_7117.method81(class528.anIntArray7114[i_537_], -1708534584)));
									int i_538_ = class602.anInt7928 * -177138561;
									if (class602.anIntArray7929 != null) {
										class602 = (class602.method9962(anInterface20_7121, anInterface18_7120, 1137928779));
										if (class602 != null)
											i_538_ = (class602.anInt7928 * -177138561);
									}
									if (i_538_ != -1) {
										Class527_Sub30 class527_sub30 = new Class527_Sub30(i_538_);
										class527_sub30.anInt10568 = ((i_535_ + (anInt7137 >> 6)) * 64 + class528.aByte7110 - anInt7137) * -2077866433;
										class527_sub30.anInt10565 = ((i_536_ + (anInt7138 >> 6)) * 64 + class528.aByte7109 - anInt7138) * 698398931;
										aClass694_7147.method14147(class527_sub30, -975825913);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public static Class693 method8810(int i, int i_539_) {
		Class693 class693 = new Class693();
		for (Class527_Sub8_Sub12 class527_sub8_sub12 = (Class527_Sub8_Sub12) aClass14_7126.method713((byte) -54); class527_sub8_sub12 != null; class527_sub8_sub12 = (Class527_Sub8_Sub12) aClass14_7126.method717(1902613930)) {
			if (class527_sub8_sub12.aBool11758 && class527_sub8_sub12.method18301(i, i_539_, -460232174))
				class693.method14055(class527_sub8_sub12, 1432477101);
		}
		return class693;
	}

	static int method8811(Interface13 interface13, Class181 class181, int i, int i_540_, int i_541_) {
		Class660 class660 = (Class660) interface13.method81(i, 467100551);
		if (class660 == null)
			return 0;
		int i_542_ = class660.anInt8501 * 482678519;
		if (i_542_ >= 0 && class181.method3544(i_542_, (byte) -106).aBool1806)
			i_542_ = -1;
		int i_543_;
		if (class660.anInt8505 * -742413183 >= 0) {
			int i_544_ = class660.anInt8505 * -742413183;
			int i_545_ = (i_544_ & 0x7f) + i_541_;
			if (i_545_ < 0)
				i_545_ = 0;
			else if (i_545_ > 127)
				i_545_ = 127;
			int i_546_ = (i_544_ + i_540_ & 0xfc00) + (i_544_ & 0x380) + i_545_;
			i_543_ = (~0xffffff | (Class656.anIntArray8393[Class453.method7333(Class508.method8272(i_546_, 96, (byte) -128), (byte) 10) & 0xffff]));
		} else if (i_542_ >= 0)
			i_543_ = (~0xffffff | (Class656.anIntArray8393[Class453.method7333(Class508.method8272((class181.method3544(i_542_, (byte) -120).aShort1810), 96, (byte) -32), (byte) 10) & 0xffff]));
		else if (class660.anInt8498 * 335838185 == -1)
			i_543_ = 0;
		else {
			int i_547_ = class660.anInt8498 * 335838185;
			int i_548_ = (i_547_ & 0x7f) + i_541_;
			if (i_548_ < 0)
				i_548_ = 0;
			else if (i_548_ > 127)
				i_548_ = 127;
			int i_549_ = (i_547_ + i_540_ & 0xfc00) + (i_547_ & 0x380) + i_548_;
			i_543_ = (~0xffffff | (Class656.anIntArray8393[Class453.method7333(Class508.method8272(i_549_, 96, (byte) -113), (byte) 10) & 0xffff]));
		}
		return i_543_;
	}

	static int method8812() {
		return (int) (64.0F * aFloat7134 / 2.0F);
	}

	static boolean method8813(Class180 class180, int i, int i_550_, boolean bool) {
		long l = Class234.method4347(-1408626088);
		if (anInt7178 == 0) {
			if (aClass527_Sub8_Sub12_7123.anInt11765 * 911503199 == aClass630_7122.anInt8228 * 1674945435) {
				int i_551_ = aClass459_7115.method7540((aClass527_Sub8_Sub12_7123.aString11755), -1193884611);
				if (aClass527_Sub38_7171 == null)
					aClass527_Sub38_7171 = (new RSByteBuffer(aClass459_7115.method7470(i_551_, 0, (byte) -83)));
				aClass527_Sub38_7170 = aClass527_Sub38_7171;
				aClass527_Sub38_7170.anInt10689 = 0;
			} else {
				int i_552_ = aClass459_7115.method7540((aClass527_Sub8_Sub12_7123.aString11755), -1193884611);
				aClass527_Sub38_7170 = new RSByteBuffer(aClass459_7115.method7470(i_552_, 0, (byte) -4));
			}
			int i_553_ = aClass527_Sub38_7170.readUnsignedByte();
			anIntArray7173 = new int[i_553_];
			for (int i_554_ = 0; i_554_ < i_553_; i_554_++)
				anIntArray7173[i_554_] = aClass527_Sub38_7170.readUnsignedSmart((byte) -6);
			int i_555_ = aClass527_Sub38_7170.readUnsignedByte();
			anIntArray7174 = new int[i_555_];
			for (int i_556_ = 0; i_556_ < i_555_; i_556_++)
				anIntArray7174[i_556_] = aClass527_Sub38_7170.readUnsignedSmart((byte) -94);
		}
		while (aClass527_Sub38_7170 != null && (aClass527_Sub38_7170.anInt10689 * -441238943 < aClass527_Sub38_7170.buffer.length) && (!bool || (Class234.method4347(-1408626088) < l + (long) anInt7169))) {
			if (aClass527_Sub38_7170.readUnsignedByte() == 0) {
				int i_557_ = aClass527_Sub38_7170.readUnsignedByte();
				int i_558_ = aClass527_Sub38_7170.readUnsignedByte();
				for (int i_559_ = 0; i_559_ < 8; i_559_++) {
					int i_560_ = aClass527_Sub38_7170.readUnsignedByte();
					int i_561_ = i_557_ * 8 + i_559_ - anInt7137 / 8;
					for (int i_562_ = 0; i_562_ < 8; i_562_++) {
						int i_563_ = i_558_ * 8 + i_562_ - anInt7138 / 8;
						aBoolArrayArray7168[i_561_][i_563_] = (i_560_ & 1 << i_562_) != 0;
					}
				}
				for (int i_564_ = 0; i_564_ < 64; i_564_++) {
					for (int i_565_ = 0; i_565_ < 64; i_565_++) {
						int i_566_ = i_557_ * 64 + i_564_ - anInt7137;
						int i_567_ = i_558_ * 64 + i_565_ - anInt7138;
						method8845(class180, aClass527_Sub38_7170, i_557_, i_558_, i_566_, i_567_, anIntArray7173, anIntArray7174);
					}
				}
			} else {
				int i_568_ = aClass527_Sub38_7170.readUnsignedByte();
				int i_569_ = aClass527_Sub38_7170.readUnsignedByte();
				int i_570_ = aClass527_Sub38_7170.readUnsignedByte();
				int i_571_ = aClass527_Sub38_7170.readUnsignedByte();
				aBoolArrayArray7168[i_568_ * 8 + i_570_ - anInt7137 / 8][i_569_ * 8 + i_571_ - anInt7138 / 8] = aClass527_Sub38_7170.readUnsignedByte() != 0;
				for (int i_572_ = 0; i_572_ < 8; i_572_++) {
					for (int i_573_ = 0; i_573_ < 8; i_573_++) {
						int i_574_ = i_568_ * 64 + i_570_ * 8 + i_572_ - anInt7137;
						int i_575_ = i_569_ * 64 + i_571_ * 8 + i_573_ - anInt7138;
						method8845(class180, aClass527_Sub38_7170, i_568_, i_569_, i_574_, i_575_, anIntArray7173, anIntArray7174);
					}
				}
			}
		}
		if (aClass527_Sub38_7170 != null) {
			anInt7178 = aClass527_Sub38_7170.anInt10689 * -441238943;
			if (aClass527_Sub38_7170.anInt10689 * -441238943 < aClass527_Sub38_7170.buffer.length)
				return false;
		}
		aClass527_Sub38_7170 = null;
		anIntArray7174 = null;
		anIntArray7173 = null;
		if (aShortArray7149 != null) {
			aByteArray7143 = new byte[anInt7131 * anInt7167];
			aShortArray7144 = new short[anInt7131 * anInt7167];
			for (int i_576_ = 0; i_576_ < 3; i_576_++) {
				short[] is = new short[anInt7131 * anInt7167];
				for (int i_577_ = 0; i_577_ < aHashMapArrayArrayArray7160[i_576_].length; i_577_++) {
					for (int i_578_ = 0; (i_578_ < aHashMapArrayArrayArray7160[i_576_][0].length); i_578_++) {
						HashMap hashmap = (aHashMapArrayArrayArray7160[i_576_][i_577_][i_578_]);
						if (hashmap != null) {
							Iterator iterator = hashmap.values().iterator();
							while (iterator.hasNext()) {
								Class528 class528 = (Class528) iterator.next();
								is[(i_577_ * 64 + class528.aByte7110 + ((i_578_ * 64 + class528.aByte7109) * anInt7131))] = (short) class528.anInt7111;
							}
						}
					}
				}
				method8760(is, aByteArray7143, aShortArray7144, i, i_550_);
				for (int i_579_ = 0; i_579_ < aHashMapArrayArrayArray7160[i_576_].length; i_579_++) {
					for (int i_580_ = 0; (i_580_ < aHashMapArrayArrayArray7160[i_576_][0].length); i_580_++) {
						HashMap hashmap = (aHashMapArrayArrayArray7160[i_576_][i_579_][i_580_]);
						if (hashmap != null) {
							Iterator iterator = hashmap.values().iterator();
							while (iterator.hasNext()) {
								Class528 class528 = (Class528) iterator.next();
								int i_581_ = (i_579_ * 64 + class528.aByte7110 + ((i_580_ * 64 + class528.aByte7109) * anInt7131));
								class528.anInt7111 = ((aByteArray7143[i_581_] & 0xff) << 16 | aShortArray7144[i_581_] & 0xffff);
								if (class528.anInt7111 != 0)
									class528.anInt7111 |= ~0xffffff;
							}
						}
					}
				}
			}
			method8760(aShortArray7149, aByteArray7143, aShortArray7144, i, i_550_);
			aShortArray7149 = null;
		}
		if (!bool || Class234.method4347(-1408626088) < l + (long) anInt7169) {
			method8751();
			return true;
		}
		return false;
	}

	static void method8814(int i, int i_582_, int i_583_, int i_584_, int i_585_, int i_586_, int i_587_, int i_588_) {
		anInt7125 = i - anInt7137;
		anInt7136 = i_582_ - anInt7138;
		anInt7177 = i_583_ - anInt7137;
		anInt7175 = i_584_ - anInt7138;
		anInt7179 = i_585_;
		anInt7180 = i_586_;
		anInt7181 = i_587_;
		anInt7182 = i_588_;
	}

	public static Class527_Sub8_Sub12 method8815(int i, int i_589_) {
		for (Class527_Sub8_Sub12 class527_sub8_sub12 = (Class527_Sub8_Sub12) aClass14_7126.method713((byte) -51); class527_sub8_sub12 != null; class527_sub8_sub12 = (Class527_Sub8_Sub12) aClass14_7126.method717(1452892918)) {
			if (class527_sub8_sub12.aBool11758 && class527_sub8_sub12.method18301(i, i_589_, 1660900898))
				return class527_sub8_sub12;
		}
		return null;
	}

	static void method8816() {
		for (int i = 0; i < anInt7131; i++) {
			for (int i_590_ = 0; i_590_ < anInt7167; i_590_++) {
				Object object = anObjectArray7139[i + i_590_ * anInt7131];
				if (object != null) {
					if (object instanceof Class527_Sub39) {
						Class527_Sub39 class527_sub39 = (Class527_Sub39) object;
						if (class527_sub39 != null) {
							for (int i_591_ = 0; (i_591_ < class527_sub39.anIntArray10695.length); i_591_++) {
								Class602 class602 = (Class602) (aClass24_Sub6_7117.method81((class527_sub39.anIntArray10695[i_591_]), 2082634913));
								int i_592_ = class602.anInt7928 * -177138561;
								if (class602.anIntArray7929 != null) {
									class602 = (class602.method9962(anInterface20_7121, anInterface18_7120, 1137928779));
									if (class602 != null)
										i_592_ = class602.anInt7928 * -177138561;
								}
								if (i_592_ != -1) {
									Class527_Sub30 class527_sub30 = new Class527_Sub30(i_592_);
									class527_sub30.anInt10568 = i * -2077866433;
									class527_sub30.anInt10565 = i_590_ * 698398931;
									aClass694_7147.method14147(class527_sub30, -1834226071);
								}
							}
						}
					} else {
						Integer integer = (Integer) object;
						Class602 class602 = ((Class602) aClass24_Sub6_7117.method81(integer.intValue(), -1505080571));
						int i_593_ = class602.anInt7928 * -177138561;
						if (class602.anIntArray7929 != null) {
							class602 = class602.method9962(anInterface20_7121, anInterface18_7120, 1137928779);
							if (class602 != null)
								i_593_ = class602.anInt7928 * -177138561;
						}
						if (i_593_ != -1) {
							Class527_Sub30 class527_sub30 = new Class527_Sub30(i_593_);
							class527_sub30.anInt10568 = i * -2077866433;
							class527_sub30.anInt10565 = i_590_ * 698398931;
							aClass694_7147.method14147(class527_sub30, -1790750566);
						}
					}
				}
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int i_594_ = 0; i_594_ < aHashMapArrayArrayArray7160[0].length; i_594_++) {
				for (int i_595_ = 0; i_595_ < aHashMapArrayArrayArray7160[0][0].length; i_595_++) {
					HashMap hashmap = aHashMapArrayArrayArray7160[i][i_594_][i_595_];
					if (hashmap != null) {
						Iterator iterator = hashmap.values().iterator();
						while (iterator.hasNext()) {
							Class528 class528 = (Class528) iterator.next();
							if (class528.anIntArray7114 != null) {
								for (int i_596_ = 0; i_596_ < class528.anIntArray7114.length; i_596_++) {
									Class602 class602 = ((Class602) (aClass24_Sub6_7117.method81(class528.anIntArray7114[i_596_], -1194972523)));
									int i_597_ = class602.anInt7928 * -177138561;
									if (class602.anIntArray7929 != null) {
										class602 = (class602.method9962(anInterface20_7121, anInterface18_7120, 1137928779));
										if (class602 != null)
											i_597_ = (class602.anInt7928 * -177138561);
									}
									if (i_597_ != -1) {
										Class527_Sub30 class527_sub30 = new Class527_Sub30(i_597_);
										class527_sub30.anInt10568 = ((i_594_ + (anInt7137 >> 6)) * 64 + class528.aByte7110 - anInt7137) * -2077866433;
										class527_sub30.anInt10565 = ((i_595_ + (anInt7138 >> 6)) * 64 + class528.aByte7109 - anInt7138) * 698398931;
										aClass694_7147.method14147(class527_sub30, -2029517711);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	static void method8817(Class180 class180, int[] is, int i, int i_598_, int i_599_, int i_600_, int i_601_, int i_602_) {
		Object object = anObjectArray7139[i_602_];
		if (object != null) {
			if (object instanceof Class527_Sub39) {
				Class527_Sub39 class527_sub39 = (Class527_Sub39) object;
				if (class527_sub39 != null)
					method8769(class180, is, i, i_598_, i_599_, class527_sub39.anIntArray10695, class527_sub39.aByteArray10694);
			} else {
				Integer integer = (Integer) object;
				anIntArray7127[0] = integer.intValue();
				aByteArray7132[0] = aByteArray7148[i_600_ + i_601_ * anInt7131];
				method8769(class180, is, i, i_598_, i_599_, anIntArray7127, aByteArray7132);
			}
		}
	}

	public static Class527_Sub8_Sub12 method8818(int i, int i_603_) {
		for (Class527_Sub8_Sub12 class527_sub8_sub12 = (Class527_Sub8_Sub12) aClass14_7126.method713((byte) -39); class527_sub8_sub12 != null; class527_sub8_sub12 = ((Class527_Sub8_Sub12) aClass14_7126.method717(-1772035612))) {
			if (class527_sub8_sub12.aBool11758 && class527_sub8_sub12.method18301(i, i_603_, 776246197))
				return class527_sub8_sub12;
		}
		return null;
	}

	static void method8819() {
		for (int i = 0; i < anInt7131; i++) {
			for (int i_604_ = 0; i_604_ < anInt7167; i_604_++) {
				Object object = anObjectArray7139[i + i_604_ * anInt7131];
				if (object != null) {
					if (object instanceof Class527_Sub39) {
						Class527_Sub39 class527_sub39 = (Class527_Sub39) object;
						if (class527_sub39 != null) {
							for (int i_605_ = 0; (i_605_ < class527_sub39.anIntArray10695.length); i_605_++) {
								Class602 class602 = (Class602) (aClass24_Sub6_7117.method81((class527_sub39.anIntArray10695[i_605_]), 619812222));
								int i_606_ = class602.anInt7928 * -177138561;
								if (class602.anIntArray7929 != null) {
									class602 = (class602.method9962(anInterface20_7121, anInterface18_7120, 1137928779));
									if (class602 != null)
										i_606_ = class602.anInt7928 * -177138561;
								}
								if (i_606_ != -1) {
									Class527_Sub30 class527_sub30 = new Class527_Sub30(i_606_);
									class527_sub30.anInt10568 = i * -2077866433;
									class527_sub30.anInt10565 = i_604_ * 698398931;
									aClass694_7147.method14147(class527_sub30, -1264380473);
								}
							}
						}
					} else {
						Integer integer = (Integer) object;
						Class602 class602 = ((Class602) aClass24_Sub6_7117.method81(integer.intValue(), -1246195054));
						int i_607_ = class602.anInt7928 * -177138561;
						if (class602.anIntArray7929 != null) {
							class602 = class602.method9962(anInterface20_7121, anInterface18_7120, 1137928779);
							if (class602 != null)
								i_607_ = class602.anInt7928 * -177138561;
						}
						if (i_607_ != -1) {
							Class527_Sub30 class527_sub30 = new Class527_Sub30(i_607_);
							class527_sub30.anInt10568 = i * -2077866433;
							class527_sub30.anInt10565 = i_604_ * 698398931;
							aClass694_7147.method14147(class527_sub30, -2053083912);
						}
					}
				}
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int i_608_ = 0; i_608_ < aHashMapArrayArrayArray7160[0].length; i_608_++) {
				for (int i_609_ = 0; i_609_ < aHashMapArrayArrayArray7160[0][0].length; i_609_++) {
					HashMap hashmap = aHashMapArrayArrayArray7160[i][i_608_][i_609_];
					if (hashmap != null) {
						Iterator iterator = hashmap.values().iterator();
						while (iterator.hasNext()) {
							Class528 class528 = (Class528) iterator.next();
							if (class528.anIntArray7114 != null) {
								for (int i_610_ = 0; i_610_ < class528.anIntArray7114.length; i_610_++) {
									Class602 class602 = ((Class602) (aClass24_Sub6_7117.method81(class528.anIntArray7114[i_610_], -1007788234)));
									int i_611_ = class602.anInt7928 * -177138561;
									if (class602.anIntArray7929 != null) {
										class602 = (class602.method9962(anInterface20_7121, anInterface18_7120, 1137928779));
										if (class602 != null)
											i_611_ = (class602.anInt7928 * -177138561);
									}
									if (i_611_ != -1) {
										Class527_Sub30 class527_sub30 = new Class527_Sub30(i_611_);
										class527_sub30.anInt10568 = ((i_608_ + (anInt7137 >> 6)) * 64 + class528.aByte7110 - anInt7137) * -2077866433;
										class527_sub30.anInt10565 = ((i_609_ + (anInt7138 >> 6)) * 64 + class528.aByte7109 - anInt7138) * 698398931;
										aClass694_7147.method14147(class527_sub30, -738385461);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	static void method8820(short[] is, byte[] is_612_, short[] is_613_, int i, int i_614_) {
		int[] is_615_ = new int[anInt7167];
		int[] is_616_ = new int[anInt7167];
		int[] is_617_ = new int[anInt7167];
		int[] is_618_ = new int[anInt7167];
		int[] is_619_ = new int[anInt7167];
		for (int i_620_ = -5; i_620_ < anInt7131; i_620_++) {
			int i_621_ = i_620_ + 5;
			int i_622_ = i_620_ - 5;
			for (int i_623_ = 0; i_623_ < anInt7167; i_623_++) {
				if (i_621_ < anInt7131) {
					short i_624_ = is[i_621_ + i_623_ * anInt7131];
					if (i_624_ > 0) {
						Class7 class7 = (Class7) anInterface13_7157.method81(i_624_ - 1, 1621827164);
						is_615_[i_623_] += class7.anInt65 * 126708699;
						is_616_[i_623_] += class7.anInt70 * -1261235975;
						is_617_[i_623_] += class7.anInt69 * -2060189111;
						is_618_[i_623_] += class7.anInt72 * -1916962147;
						is_619_[i_623_]++;
					}
				}
				if (i_622_ >= 0) {
					short i_625_ = is[i_622_ + i_623_ * anInt7131];
					if (i_625_ > 0) {
						Class7 class7 = ((Class7) anInterface13_7157.method81(i_625_ - 1, -1580796475));
						is_615_[i_623_] -= class7.anInt65 * 126708699;
						is_616_[i_623_] -= class7.anInt70 * -1261235975;
						is_617_[i_623_] -= class7.anInt69 * -2060189111;
						is_618_[i_623_] -= class7.anInt72 * -1916962147;
						is_619_[i_623_]--;
					}
				}
			}
			if (i_620_ >= 0) {
				int i_626_ = 0;
				int i_627_ = 0;
				int i_628_ = 0;
				int i_629_ = 0;
				int i_630_ = 0;
				for (int i_631_ = -5; i_631_ < anInt7167; i_631_++) {
					int i_632_ = i_631_ + 5;
					if (i_632_ < anInt7167) {
						i_626_ += is_615_[i_632_];
						i_627_ += is_616_[i_632_];
						i_628_ += is_617_[i_632_];
						i_629_ += is_618_[i_632_];
						i_630_ += is_619_[i_632_];
					}
					int i_633_ = i_631_ - 5;
					if (i_633_ >= 0) {
						i_626_ -= is_615_[i_633_];
						i_627_ -= is_616_[i_633_];
						i_628_ -= is_617_[i_633_];
						i_629_ -= is_618_[i_633_];
						i_630_ -= is_619_[i_633_];
					}
					if (i_631_ >= 0 && i_630_ > 0) {
						if (is[i_620_ + i_631_ * anInt7131] == 0) {
							int i_634_ = i_620_ + i_631_ * anInt7131;
							is_612_[i_634_] = (byte) 0;
							is_613_[i_634_] = (short) 0;
						} else {
							int i_635_ = (i_629_ == 0 ? 0 : Class625.method10351((i_626_ * 256 / i_629_), i_627_ / i_630_, i_628_ / i_630_, -566507566));
							int i_636_ = (i_635_ & 0x7f) + i_614_;
							if (i_636_ < 0)
								i_636_ = 0;
							else if (i_636_ > 127)
								i_636_ = 127;
							int i_637_ = ((i_635_ + i & 0xfc00) + (i_635_ & 0x380) + i_636_);
							int i_638_ = i_620_ + i_631_ * anInt7131;
							int i_639_ = (Class656.anIntArray8393[(Class453.method7333(Class115.method2028(i_637_, 96, -1716817708), (byte) 10)) & 0xffff]);
							is_612_[i_638_] = (byte) (i_639_ >> 16 & 0xff);
							is_613_[i_638_] = (short) (i_639_ & 0xffff);
						}
					}
				}
			}
		}
	}

	static void method8821(short[] is, byte[] is_640_, short[] is_641_, int i, int i_642_) {
		int[] is_643_ = new int[anInt7167];
		int[] is_644_ = new int[anInt7167];
		int[] is_645_ = new int[anInt7167];
		int[] is_646_ = new int[anInt7167];
		int[] is_647_ = new int[anInt7167];
		for (int i_648_ = -5; i_648_ < anInt7131; i_648_++) {
			int i_649_ = i_648_ + 5;
			int i_650_ = i_648_ - 5;
			for (int i_651_ = 0; i_651_ < anInt7167; i_651_++) {
				if (i_649_ < anInt7131) {
					short i_652_ = is[i_649_ + i_651_ * anInt7131];
					if (i_652_ > 0) {
						Class7 class7 = (Class7) anInterface13_7157.method81(i_652_ - 1, 527951610);
						is_643_[i_651_] += class7.anInt65 * 126708699;
						is_644_[i_651_] += class7.anInt70 * -1261235975;
						is_645_[i_651_] += class7.anInt69 * -2060189111;
						is_646_[i_651_] += class7.anInt72 * -1916962147;
						is_647_[i_651_]++;
					}
				}
				if (i_650_ >= 0) {
					short i_653_ = is[i_650_ + i_651_ * anInt7131];
					if (i_653_ > 0) {
						Class7 class7 = ((Class7) anInterface13_7157.method81(i_653_ - 1, -1322553259));
						is_643_[i_651_] -= class7.anInt65 * 126708699;
						is_644_[i_651_] -= class7.anInt70 * -1261235975;
						is_645_[i_651_] -= class7.anInt69 * -2060189111;
						is_646_[i_651_] -= class7.anInt72 * -1916962147;
						is_647_[i_651_]--;
					}
				}
			}
			if (i_648_ >= 0) {
				int i_654_ = 0;
				int i_655_ = 0;
				int i_656_ = 0;
				int i_657_ = 0;
				int i_658_ = 0;
				for (int i_659_ = -5; i_659_ < anInt7167; i_659_++) {
					int i_660_ = i_659_ + 5;
					if (i_660_ < anInt7167) {
						i_654_ += is_643_[i_660_];
						i_655_ += is_644_[i_660_];
						i_656_ += is_645_[i_660_];
						i_657_ += is_646_[i_660_];
						i_658_ += is_647_[i_660_];
					}
					int i_661_ = i_659_ - 5;
					if (i_661_ >= 0) {
						i_654_ -= is_643_[i_661_];
						i_655_ -= is_644_[i_661_];
						i_656_ -= is_645_[i_661_];
						i_657_ -= is_646_[i_661_];
						i_658_ -= is_647_[i_661_];
					}
					if (i_659_ >= 0 && i_658_ > 0) {
						if (is[i_648_ + i_659_ * anInt7131] == 0) {
							int i_662_ = i_648_ + i_659_ * anInt7131;
							is_640_[i_662_] = (byte) 0;
							is_641_[i_662_] = (short) 0;
						} else {
							int i_663_ = (i_657_ == 0 ? 0 : Class625.method10351((i_654_ * 256 / i_657_), i_655_ / i_658_, i_656_ / i_658_, -1589206764));
							int i_664_ = (i_663_ & 0x7f) + i_642_;
							if (i_664_ < 0)
								i_664_ = 0;
							else if (i_664_ > 127)
								i_664_ = 127;
							int i_665_ = ((i_663_ + i & 0xfc00) + (i_663_ & 0x380) + i_664_);
							int i_666_ = i_648_ + i_659_ * anInt7131;
							int i_667_ = (Class656.anIntArray8393[(Class453.method7333(Class115.method2028(i_665_, 96, -1028009957), (byte) 10)) & 0xffff]);
							is_640_[i_666_] = (byte) (i_667_ >> 16 & 0xff);
							is_641_[i_666_] = (short) (i_667_ & 0xffff);
						}
					}
				}
			}
		}
	}

	static void method8822() {
		int[] is = new int[3];
		for (int i = 0; i < aClass532_7135.anInt7208 * -1479175311; i++) {
			boolean bool = (aClass527_Sub8_Sub12_7123.method18314(aClass532_7135.anIntArray7206[i] >> 28 & 0x3, aClass532_7135.anIntArray7206[i] >> 14 & 0x3fff, aClass532_7135.anIntArray7206[i] & 0x3fff, is, (short) -101));
			if (bool) {
				Class527_Sub30 class527_sub30 = new Class527_Sub30(aClass532_7135.anIntArray7207[i]);
				class527_sub30.anInt10568 = (is[1] - anInt7137) * -2077866433;
				class527_sub30.anInt10565 = (is[2] - anInt7138) * 698398931;
				aClass694_7147.method14147(class527_sub30, -1501086701);
			}
		}
	}

	static void method8823() {
		int[] is = new int[3];
		for (int i = 0; i < aClass532_7135.anInt7208 * -1479175311; i++) {
			boolean bool = (aClass527_Sub8_Sub12_7123.method18314(aClass532_7135.anIntArray7206[i] >> 28 & 0x3, aClass532_7135.anIntArray7206[i] >> 14 & 0x3fff, aClass532_7135.anIntArray7206[i] & 0x3fff, is, (short) -16973));
			if (bool) {
				Class527_Sub30 class527_sub30 = new Class527_Sub30(aClass532_7135.anIntArray7207[i]);
				class527_sub30.anInt10568 = (is[1] - anInt7137) * -2077866433;
				class527_sub30.anInt10565 = (is[2] - anInt7138) * 698398931;
				aClass694_7147.method14147(class527_sub30, -965650188);
			}
		}
	}

	static void method8824() {
		int[] is = new int[3];
		for (int i = 0; i < aClass532_7135.anInt7208 * -1479175311; i++) {
			boolean bool = (aClass527_Sub8_Sub12_7123.method18314(aClass532_7135.anIntArray7206[i] >> 28 & 0x3, aClass532_7135.anIntArray7206[i] >> 14 & 0x3fff, aClass532_7135.anIntArray7206[i] & 0x3fff, is, (short) -30042));
			if (bool) {
				Class527_Sub30 class527_sub30 = new Class527_Sub30(aClass532_7135.anIntArray7207[i]);
				class527_sub30.anInt10568 = (is[1] - anInt7137) * -2077866433;
				class527_sub30.anInt10565 = (is[2] - anInt7138) * 698398931;
				aClass694_7147.method14147(class527_sub30, -690438329);
			}
		}
	}

	static void method8825(int[] is, int i, int i_668_, int i_669_, int i_670_, int i_671_, int i_672_, int i_673_) {
		for (int i_674_ = i; i_674_ <= i_668_; i_674_++) {
			for (int i_675_ = i_669_; i_675_ <= i_670_; i_675_++)
				is[(i_672_ - i_675_ - 1) * i_671_ + i_674_] = i_673_;
		}
	}

	static void method8826() {
		for (int i = 0; i < anInt7131; i++) {
			for (int i_676_ = 0; i_676_ < anInt7167; i_676_++) {
				Object object = anObjectArray7139[i + i_676_ * anInt7131];
				if (object != null) {
					if (object instanceof Class527_Sub39) {
						Class527_Sub39 class527_sub39 = (Class527_Sub39) object;
						if (class527_sub39 != null) {
							for (int i_677_ = 0; (i_677_ < class527_sub39.anIntArray10695.length); i_677_++) {
								Class602 class602 = (Class602) (aClass24_Sub6_7117.method81((class527_sub39.anIntArray10695[i_677_]), -1373918759));
								int i_678_ = class602.anInt7928 * -177138561;
								if (class602.anIntArray7929 != null) {
									class602 = (class602.method9962(anInterface20_7121, anInterface18_7120, 1137928779));
									if (class602 != null)
										i_678_ = class602.anInt7928 * -177138561;
								}
								if (i_678_ != -1) {
									Class527_Sub30 class527_sub30 = new Class527_Sub30(i_678_);
									class527_sub30.anInt10568 = i * -2077866433;
									class527_sub30.anInt10565 = i_676_ * 698398931;
									aClass694_7147.method14147(class527_sub30, -1372234049);
								}
							}
						}
					} else {
						Integer integer = (Integer) object;
						Class602 class602 = ((Class602) aClass24_Sub6_7117.method81(integer.intValue(), -1298265201));
						int i_679_ = class602.anInt7928 * -177138561;
						if (class602.anIntArray7929 != null) {
							class602 = class602.method9962(anInterface20_7121, anInterface18_7120, 1137928779);
							if (class602 != null)
								i_679_ = class602.anInt7928 * -177138561;
						}
						if (i_679_ != -1) {
							Class527_Sub30 class527_sub30 = new Class527_Sub30(i_679_);
							class527_sub30.anInt10568 = i * -2077866433;
							class527_sub30.anInt10565 = i_676_ * 698398931;
							aClass694_7147.method14147(class527_sub30, -2044284699);
						}
					}
				}
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int i_680_ = 0; i_680_ < aHashMapArrayArrayArray7160[0].length; i_680_++) {
				for (int i_681_ = 0; i_681_ < aHashMapArrayArrayArray7160[0][0].length; i_681_++) {
					HashMap hashmap = aHashMapArrayArrayArray7160[i][i_680_][i_681_];
					if (hashmap != null) {
						Iterator iterator = hashmap.values().iterator();
						while (iterator.hasNext()) {
							Class528 class528 = (Class528) iterator.next();
							if (class528.anIntArray7114 != null) {
								for (int i_682_ = 0; i_682_ < class528.anIntArray7114.length; i_682_++) {
									Class602 class602 = ((Class602) (aClass24_Sub6_7117.method81(class528.anIntArray7114[i_682_], 1848924696)));
									int i_683_ = class602.anInt7928 * -177138561;
									if (class602.anIntArray7929 != null) {
										class602 = (class602.method9962(anInterface20_7121, anInterface18_7120, 1137928779));
										if (class602 != null)
											i_683_ = (class602.anInt7928 * -177138561);
									}
									if (i_683_ != -1) {
										Class527_Sub30 class527_sub30 = new Class527_Sub30(i_683_);
										class527_sub30.anInt10568 = ((i_680_ + (anInt7137 >> 6)) * 64 + class528.aByte7110 - anInt7137) * -2077866433;
										class527_sub30.anInt10565 = ((i_681_ + (anInt7138 >> 6)) * 64 + class528.aByte7109 - anInt7138) * 698398931;
										aClass694_7147.method14147(class527_sub30, -756530867);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	static void method8827(Class180 class180, boolean bool, boolean bool_684_, boolean bool_685_, boolean bool_686_) {
		int i = anInt7177 - anInt7125;
		int i_687_ = anInt7136 - anInt7175;
		int i_688_ = (anInt7181 - anInt7179 << 16) / i;
		int i_689_ = (anInt7182 - anInt7180 << 16) / i_687_;
		method8764(class180, bool, bool_684_, i_688_, i_689_, 0, 0, bool_685_, bool_686_);
	}

	static void method8828(Class180 class180, int i, int i_690_, int i_691_, int i_692_) {
		Class147 class147 = (Class147) aClass205_7163.method3787(-1L);
		if (class147 == null || class147.method2407() != i_691_) {
			int i_693_;
			if (aClass527_Sub8_Sub12_7123.anInt11759 * 1504321391 != -1)
				i_693_ = (~0xffffff | aClass527_Sub8_Sub12_7123.anInt11759 * 1504321391);
			else
				i_693_ = -16777216;
			if (anIntArray7150 == null || anIntArray7150.length != i_691_ * i_691_)
				anIntArray7150 = new int[i_691_ * i_691_];
			Arrays.fill(anIntArray7150, i_693_);
			class147 = class180.method3162(anIntArray7150, 0, i_691_, i_691_, i_691_, true);
			aClass205_7163.method3790(class147, -1L);
		}
		aClass205_7163.method3790(class147, (long) i_692_);
	}

	static void method8829(Class180 class180, boolean bool, boolean bool_694_, boolean bool_695_, boolean bool_696_) {
		int i = anInt7177 - anInt7125;
		int i_697_ = anInt7136 - anInt7175;
		int i_698_ = (anInt7181 - anInt7179 << 16) / i;
		int i_699_ = (anInt7182 - anInt7180 << 16) / i_697_;
		method8764(class180, bool, bool_694_, i_698_, i_699_, 0, 0, bool_695_, bool_696_);
	}

	static void method8830(Class180 class180, Class527_Sub30 class527_sub30, int i, int i_700_, int i_701_, int i_702_) {
		class527_sub30.anInt10569 = (anInt7179 + (i_701_ + i * (class527_sub30.anInt10568 * 208579007 - anInt7125) >> 16)) * 1000232333;
		class527_sub30.anInt10570 = (anInt7182 - (i_702_ + i_700_ * (class527_sub30.anInt10565 * -1499963557 - anInt7175) >> 16)) * -231329071;
	}

	static boolean method8831(Class527_Sub8_Sub12 class527_sub8_sub12) {
		if (class527_sub8_sub12 != null && class527_sub8_sub12 != aClass527_Sub8_Sub12_7123) {
			aClass527_Sub8_Sub12_7123 = class527_sub8_sub12;
			aBool7165 = (aClass527_Sub8_Sub12_7123.anInt11765 * 911503199 == aClass630_7122.anInt8230 * 346103239);
			return true;
		}
		return false;
	}

	static void method8832(Class180 class180, int i, int i_703_, int i_704_, int i_705_) {
		Class147 class147 = (Class147) aClass205_7163.method3787(-1L);
		if (class147 == null || class147.method2407() != i_704_) {
			int i_706_;
			if (aClass527_Sub8_Sub12_7123.anInt11759 * 1504321391 != -1)
				i_706_ = (~0xffffff | aClass527_Sub8_Sub12_7123.anInt11759 * 1504321391);
			else
				i_706_ = -16777216;
			if (anIntArray7150 == null || anIntArray7150.length != i_704_ * i_704_)
				anIntArray7150 = new int[i_704_ * i_704_];
			Arrays.fill(anIntArray7150, i_706_);
			class147 = class180.method3162(anIntArray7150, 0, i_704_, i_704_, i_704_, true);
			aClass205_7163.method3790(class147, -1L);
		}
		aClass205_7163.method3790(class147, (long) i_705_);
	}

	static Class694 method8833(Class180 class180) {
		int i = anInt7177 - anInt7125;
		int i_707_ = anInt7136 - anInt7175;
		int i_708_ = (anInt7181 - anInt7179 << 16) / i;
		int i_709_ = (anInt7182 - anInt7180 << 16) / i_707_;
		return method8762(class180, i_708_, i_709_, 0, 0);
	}

	static void method8834(int[] is, int i, int i_710_, int i_711_, int i_712_, int i_713_, boolean bool, int i_714_, int i_715_, int i_716_, int[] is_717_, byte[] is_718_, boolean bool_719_) {
		if (bool_719_ || i_714_ != 0 || i_715_ > 0) {
			if (i_715_ == 0)
				method8777(is, i, i_710_, i_711_, i_712_, i_713_, i_713_, i_714_ | ~0xffffff);
			else {
				int i_720_ = i_716_ & 0x3f;
				if (i_720_ == 0 || anInt7130 == 0) {
					int i_721_ = anIntArray7141[i_715_];
					if (bool_719_ || i_721_ != 0)
						method8777(is, i, i_710_, i_711_, i_712_, i_713_, i_713_, i_721_ | ~0xffffff);
				} else {
					int i_722_ = bool_719_ ? 0 : 1;
					int i_723_ = Class509.method8417(i_716_ >> 6 & 0x3, i_720_, -1218304892);
					i_720_ = Class554.method9215(i_720_, 784138088);
					method8782(is, i, i_710_, i_711_, i_712_, i_713_, i_713_, i_714_, anIntArray7141[i_715_], aByteArrayArrayArray7118[i_720_ - 1][i_723_], anInt7130, i_722_);
				}
			}
		}
		if (bool && is_717_ != null) {
			int i_724_ = i_710_ - i + 1;
			int i_725_ = i_712_ - i_711_ + 1;
			for (int i_726_ = 0; i_726_ < is_717_.length; i_726_++) {
				int i_727_ = is_718_[i_726_] & 0x3f;
				if (i_727_ == Class596.aClass596_7835.anInt7844 * -1736797763 || (i_727_ == Class596.aClass596_7822.anInt7844 * -1736797763) || (i_727_ == Class596.aClass596_7838.anInt7844 * -1736797763) || (i_727_ == Class596.aClass596_7824.anInt7844 * -1736797763)) {
					Class602 class602 = ((Class602) aClass24_Sub6_7117.method81(is_717_[i_726_], 172442192));
					if (class602.anInt7909 * 624402131 == -1) {
						int i_728_ = -3355444;
						if (class602.anInt7898 * -1508648055 == 1)
							i_728_ = -3407872;
						int i_729_ = is_718_[i_726_] >> 6 & 0x3;
						if (i_727_ == (Class596.aClass596_7835.anInt7844 * -1736797763)) {
							if (i_729_ == 0)
								method8871(is, i, i_712_, i_725_, i_713_, i_728_);
							else if (i_729_ == 1)
								method8783(is, i, i_712_, i_724_, i_713_, i_728_);
							else if (i_729_ == 2)
								method8871(is, i_710_, i_712_, i_725_, i_713_, i_728_);
							else
								method8783(is, i, i_711_, i_724_, i_713_, i_728_);
						} else if (i_727_ == (Class596.aClass596_7822.anInt7844 * -1736797763)) {
							if (i_729_ == 0) {
								method8871(is, i, i_712_, i_725_, i_713_, -1);
								method8783(is, i, i_712_, i_724_, i_713_, i_728_);
							} else if (i_729_ == 1) {
								method8871(is, i_710_, i_712_, i_725_, i_713_, -1);
								method8783(is, i, i_712_, i_724_, i_713_, i_728_);
							} else if (i_729_ == 2) {
								method8871(is, i_710_, i_712_, i_725_, i_713_, -1);
								method8783(is, i, i_711_, i_724_, i_713_, i_728_);
							} else {
								method8871(is, i, i_712_, i_725_, i_713_, -1);
								method8783(is, i, i_711_, i_724_, i_713_, i_728_);
							}
						} else if (i_727_ == (Class596.aClass596_7838.anInt7844 * -1736797763)) {
							if (i_729_ == 0)
								method8783(is, i, i_712_, 1, i_713_, i_728_);
							else if (i_729_ == 1)
								method8783(is, i_710_, i_712_, 1, i_713_, i_728_);
							else if (i_729_ == 2)
								method8783(is, i_710_, i_711_, 1, i_713_, i_728_);
							else
								method8783(is, i, i_711_, 1, i_713_, i_728_);
						} else if (i_727_ == (Class596.aClass596_7824.anInt7844 * -1736797763)) {
							if (i_729_ == 0 || i_729_ == 2) {
								for (int i_730_ = 0; i_730_ < i_725_; i_730_++)
									method8783(is, i + i_730_, i_711_ + i_730_, 1, i_713_, i_728_);
							} else {
								for (int i_731_ = 0; i_731_ < i_725_; i_731_++)
									method8783(is, i + i_731_, i_712_ - i_731_, 1, i_713_, i_728_);
							}
						}
					}
				}
			}
		}
	}

	public static Class527_Sub8_Sub12 method8835(int i, int i_732_) {
		for (Class527_Sub8_Sub12 class527_sub8_sub12 = (Class527_Sub8_Sub12) aClass14_7126.method713((byte) 6); class527_sub8_sub12 != null; class527_sub8_sub12 = (Class527_Sub8_Sub12) aClass14_7126.method717(-950912402)) {
			if (class527_sub8_sub12.aBool11758 && class527_sub8_sub12.method18301(i, i_732_, 72404673))
				return class527_sub8_sub12;
		}
		return null;
	}

	static void method8836(Class180 class180, int[] is, int i, int i_733_, int i_734_, int i_735_, int i_736_, int i_737_) {
		Object object = anObjectArray7139[i_737_];
		if (object != null) {
			if (object instanceof Class527_Sub39) {
				Class527_Sub39 class527_sub39 = (Class527_Sub39) object;
				if (class527_sub39 != null)
					method8769(class180, is, i, i_733_, i_734_, class527_sub39.anIntArray10695, class527_sub39.aByteArray10694);
			} else {
				Integer integer = (Integer) object;
				anIntArray7127[0] = integer.intValue();
				aByteArray7132[0] = aByteArray7148[i_735_ + i_736_ * anInt7131];
				method8769(class180, is, i, i_733_, i_734_, anIntArray7127, aByteArray7132);
			}
		}
	}

	static void method8837(int[] is, int i, int i_738_, int i_739_, int i_740_, int i_741_, int i_742_, int i_743_, boolean bool, boolean bool_744_, boolean bool_745_, boolean bool_746_) {
		for (int i_747_ = i; i_747_ <= i_738_; i_747_++) {
			boolean bool_748_ = bool_744_ ? (aBoolArray7185[anInt7162] && i_738_ - i_747_ < (aClass630_7122.anInt8235 * 1577317633)) : false;
			boolean bool_749_ = (bool_746_ ? (aBoolArray7185[anInt7158] && i_747_ - i < aClass630_7122.anInt8235 * 1577317633) : false);
			for (int i_750_ = i_739_; i_750_ <= i_740_; i_750_++) {
				if (bool_748_ || bool_749_)
					is[(i_741_ - i_750_ - 1) * i_741_ + i_747_] = aClass630_7122.anInt8232 * -993232789;
				else {
					boolean bool_751_ = (bool ? (aBoolArray7185[anInt7152] && (i_740_ - i_750_ < aClass630_7122.anInt8235 * 1577317633)) : false);
					boolean bool_752_ = (bool_745_ ? (aBoolArray7185[anInt7156] && (i_750_ - i_739_ < aClass630_7122.anInt8235 * 1577317633)) : false);
					if (bool_751_ || bool_752_)
						is[(i_741_ - i_750_ - 1) * i_741_ + i_747_] = aClass630_7122.anInt8232 * -993232789;
					else {
						int i_753_ = is[(i_741_ - i_750_ - 1) * i_741_ + i_747_];
						if (i_753_ != anInt7154) {
							anInt7154 = i_753_;
							anInt7184 = (~0xffffff | ((((aClass630_7122.anInt8223 * -1253775049 & 0xff00ff) * i_742_ + (i_753_ & 0xff00ff) * i_743_) & ~0xff00ff) + ((((aClass630_7122.anInt8223 * -1253775049) & 0xff00) * i_742_ + (i_753_ & 0xff00) * i_743_) & 0xff0000)) >> 8);
						}
						is[(i_741_ - i_750_ - 1) * i_741_ + i_747_] = anInt7184;
					}
				}
			}
		}
	}

	static void method8838(Class180 class180, int[] is, int i, int i_754_, int i_755_, int i_756_, int i_757_, int i_758_) {
		Object object = anObjectArray7139[i_758_];
		if (object != null) {
			if (object instanceof Class527_Sub39) {
				Class527_Sub39 class527_sub39 = (Class527_Sub39) object;
				if (class527_sub39 != null)
					method8769(class180, is, i, i_754_, i_755_, class527_sub39.anIntArray10695, class527_sub39.aByteArray10694);
			} else {
				Integer integer = (Integer) object;
				anIntArray7127[0] = integer.intValue();
				aByteArray7132[0] = aByteArray7148[i_756_ + i_757_ * anInt7131];
				method8769(class180, is, i, i_754_, i_755_, anIntArray7127, aByteArray7132);
			}
		}
	}

	static void method8839(Class180 class180, int[] is, int i, int i_759_, int i_760_, int[] is_761_, byte[] is_762_) {
		if (is_761_ != null) {
			for (int i_763_ = 0; i_763_ < is_761_.length; i_763_++) {
				Class602 class602 = (Class602) aClass24_Sub6_7117.method81(is_761_[i_763_], 1410029790);
				int i_764_ = class602.anInt7909 * 624402131;
				if (i_764_ != -1) {
					Class54 class54 = ((Class54) aClass24_Sub8_7119.method81(i_764_, -1776957798));
					Class147 class147 = class54.method1293(class180, (class602.aBool7910 ? is_762_[i_763_] >> 6 & 0x3 : 0), (class602.aBool7912 ? class602.aBool7931 : false), (byte) -34);
					int[] is_765_ = class54.method1295(class180, (class602.aBool7910 ? is_762_[i_763_] >> 6 & 0x3 : 0), (class602.aBool7912 ? class602.aBool7931 : false), (byte) -124);
					if (class147 != null) {
						int i_766_ = class147.method42();
						int i_767_ = class147.method2410();
						int i_768_ = i * i_766_ / 64 >> 2;
						int i_769_ = i * i_767_ / 64 >> 2;
						if (class54.aBool704) {
							int i_770_ = class602.anInt7874 * -49406469;
							int i_771_ = class602.anInt7891 * 1481957615;
							if ((is_762_[i_763_] >> 6 & 0x1) == 1) {
								int i_772_ = i_770_;
								i_770_ = i_771_;
								i_771_ = i_772_;
							}
							i_768_ = i_770_ * i / 64;
							i_769_ = i_771_ * i / 64;
						}
						if (i_768_ != 0 && i_769_ != 0) {
							int i_773_ = i_759_ * i / 64;
							int i_774_ = (64 - i_760_) * i / 64 - i_769_ + 1;
							for (int i_775_ = 0; i_775_ < i_768_; i_775_++) {
								int i_776_ = i_775_ + i_773_;
								if (i_776_ >= 0) {
									if (i_776_ >= i)
										break;
									for (int i_777_ = 0; i_777_ < i_769_; i_777_++) {
										int i_778_ = i_777_ + i_774_;
										if (i_778_ >= 0) {
											if (i_778_ >= i)
												break;
											int i_779_ = (is_765_[(i_775_ * i_766_ / i_768_ + i_766_ * (i_777_ * i_767_ / i_769_))]);
											int i_780_ = i_779_ >> 24 & 0xff;
											if (i_780_ != 0)
												is[i_776_ + i * i_778_] = i_779_;
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	static void method8840() {
		for (int i = 0; i < anInt7131; i++) {
			for (int i_781_ = 0; i_781_ < anInt7167; i_781_++) {
				Object object = anObjectArray7139[i + i_781_ * anInt7131];
				if (object != null) {
					if (object instanceof Class527_Sub39) {
						Class527_Sub39 class527_sub39 = (Class527_Sub39) object;
						if (class527_sub39 != null) {
							for (int i_782_ = 0; (i_782_ < class527_sub39.anIntArray10695.length); i_782_++) {
								Class602 class602 = (Class602) (aClass24_Sub6_7117.method81((class527_sub39.anIntArray10695[i_782_]), 708949851));
								int i_783_ = class602.anInt7928 * -177138561;
								if (class602.anIntArray7929 != null) {
									class602 = (class602.method9962(anInterface20_7121, anInterface18_7120, 1137928779));
									if (class602 != null)
										i_783_ = class602.anInt7928 * -177138561;
								}
								if (i_783_ != -1) {
									Class527_Sub30 class527_sub30 = new Class527_Sub30(i_783_);
									class527_sub30.anInt10568 = i * -2077866433;
									class527_sub30.anInt10565 = i_781_ * 698398931;
									aClass694_7147.method14147(class527_sub30, -1817354581);
								}
							}
						}
					} else {
						Integer integer = (Integer) object;
						Class602 class602 = ((Class602) aClass24_Sub6_7117.method81(integer.intValue(), 1872450925));
						int i_784_ = class602.anInt7928 * -177138561;
						if (class602.anIntArray7929 != null) {
							class602 = class602.method9962(anInterface20_7121, anInterface18_7120, 1137928779);
							if (class602 != null)
								i_784_ = class602.anInt7928 * -177138561;
						}
						if (i_784_ != -1) {
							Class527_Sub30 class527_sub30 = new Class527_Sub30(i_784_);
							class527_sub30.anInt10568 = i * -2077866433;
							class527_sub30.anInt10565 = i_781_ * 698398931;
							aClass694_7147.method14147(class527_sub30, -1928969662);
						}
					}
				}
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int i_785_ = 0; i_785_ < aHashMapArrayArrayArray7160[0].length; i_785_++) {
				for (int i_786_ = 0; i_786_ < aHashMapArrayArrayArray7160[0][0].length; i_786_++) {
					HashMap hashmap = aHashMapArrayArrayArray7160[i][i_785_][i_786_];
					if (hashmap != null) {
						Iterator iterator = hashmap.values().iterator();
						while (iterator.hasNext()) {
							Class528 class528 = (Class528) iterator.next();
							if (class528.anIntArray7114 != null) {
								for (int i_787_ = 0; i_787_ < class528.anIntArray7114.length; i_787_++) {
									Class602 class602 = ((Class602) (aClass24_Sub6_7117.method81(class528.anIntArray7114[i_787_], 704977912)));
									int i_788_ = class602.anInt7928 * -177138561;
									if (class602.anIntArray7929 != null) {
										class602 = (class602.method9962(anInterface20_7121, anInterface18_7120, 1137928779));
										if (class602 != null)
											i_788_ = (class602.anInt7928 * -177138561);
									}
									if (i_788_ != -1) {
										Class527_Sub30 class527_sub30 = new Class527_Sub30(i_788_);
										class527_sub30.anInt10568 = ((i_785_ + (anInt7137 >> 6)) * 64 + class528.aByte7110 - anInt7137) * -2077866433;
										class527_sub30.anInt10565 = ((i_786_ + (anInt7138 >> 6)) * 64 + class528.aByte7109 - anInt7138) * 698398931;
										aClass694_7147.method14147(class527_sub30, -1400764586);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	static Class694 method8841(Class180 class180) {
		int i = anInt7177 - anInt7125;
		int i_789_ = anInt7136 - anInt7175;
		int i_790_ = (anInt7181 - anInt7179 << 16) / i;
		int i_791_ = (anInt7182 - anInt7180 << 16) / i_789_;
		return method8762(class180, i_790_, i_791_, 0, 0);
	}

	static Class694 method8842(Class180 class180) {
		int i = anInt7177 - anInt7125;
		int i_792_ = anInt7136 - anInt7175;
		int i_793_ = (anInt7181 - anInt7179 << 16) / i;
		int i_794_ = (anInt7182 - anInt7180 << 16) / i_792_;
		return method8762(class180, i_793_, i_794_, 0, 0);
	}

	static void method8843(int[] is, int i, int i_795_, int i_796_, int i_797_, int i_798_) {
		int i_799_ = aClass630_7122.anInt8223 * -1253775049 >> 24 & 0xff;
		int i_800_ = 255 - i_799_;
		for (int i_801_ = i; i_801_ <= i_795_; i_801_++) {
			for (int i_802_ = i_796_; i_802_ <= i_797_; i_802_++) {
				int i_803_ = is[(i_798_ - i_802_ - 1) * i_798_ + i_801_];
				if (i_803_ != anInt7154) {
					anInt7154 = i_803_;
					anInt7184 = (~0xffffff | ((((aClass630_7122.anInt8223 * -1253775049 & 0xff00ff) * i_799_ + (i_803_ & 0xff00ff) * i_800_) & ~0xff00ff) + (((aClass630_7122.anInt8223 * -1253775049 & 0xff00) * i_799_ + (i_803_ & 0xff00) * i_800_) & 0xff0000)) >> 8);
				}
				is[(i_798_ - i_802_ - 1) * i_798_ + i_801_] = anInt7184;
			}
		}
	}

	static int method8844() {
		return (int) (64.0F * aFloat7134 / 2.0F);
	}

	static void method8845(Class180 class180, RSByteBuffer class527_sub38, int i, int i_804_, int i_805_, int i_806_, int[] is, int[] is_807_) {
		int i_808_ = class527_sub38.readUnsignedByte();
		if ((i_808_ & 0x1) == 0) {
			boolean bool = (i_808_ & 0x2) == 0;
			int i_809_ = i_808_ >> 2 & 0x3f;
			if (i_809_ != 62) {
				if (i_809_ == 63)
					i_809_ = class527_sub38.readUnsignedSmart((byte) -75);
				else if (bool)
					i_809_ = is[i_809_];
				else
					i_809_ = is_807_[i_809_];
				if (bool) {
					aShortArray7149[i_805_ + i_806_ * anInt7131] = (short) i_809_;
					aShortArray7145[i_805_ + i_806_ * anInt7131] = (short) 0;
				} else {
					aShortArray7145[i_805_ + i_806_ * anInt7131] = (short) i_809_;
					aByteArray7159[i_805_ + i_806_ * anInt7131] = (byte) 0;
					aShortArray7149[i_805_ + i_806_ * anInt7131] = (short) class527_sub38.readUnsignedSmart((byte) -50);
				}
			}
		} else {
			int i_810_ = (i_808_ >> 1 & 0x3) + 1;
			boolean bool = (i_808_ & 0x8) != 0;
			boolean bool_811_ = (i_808_ & 0x10) != 0;
			for (int i_812_ = 0; i_812_ < i_810_; i_812_++) {
				int i_813_ = class527_sub38.readUnsignedSmart((byte) -112);
				int i_814_ = 0;
				int i_815_ = 0;
				if (bool) {
					i_814_ = class527_sub38.readUnsignedSmart((byte) -120);
					i_815_ = class527_sub38.readUnsignedByte();
				}
				int i_816_ = 0;
				if (bool_811_)
					i_816_ = class527_sub38.readUnsignedByte();
				if (i_812_ == 0) {
					aShortArray7149[i_805_ + i_806_ * anInt7131] = (short) i_813_;
					aShortArray7145[i_805_ + i_806_ * anInt7131] = (short) i_814_;
					aByteArray7159[i_805_ + i_806_ * anInt7131] = (byte) i_815_;
					if (i_816_ == 1) {
						anObjectArray7139[i_805_ + i_806_ * anInt7131] = new Integer(class527_sub38.method16466(-2063364137));
						aByteArray7148[i_805_ + i_806_ * anInt7131] = class527_sub38.readByte();
					} else if (i_816_ > 1) {
						int[] is_817_ = new int[i_816_];
						byte[] is_818_ = new byte[i_816_];
						for (int i_819_ = 0; i_819_ < i_816_; i_819_++) {
							is_817_[i_819_] = class527_sub38.method16466(-1926661025);
							is_818_[i_819_] = class527_sub38.readByte();
						}
						anObjectArray7139[i_805_ + i_806_ * anInt7131] = new Class527_Sub39(is_817_, is_818_);
					}
				} else {
					int[] is_820_ = null;
					byte[] is_821_ = null;
					if (i_816_ > 0) {
						is_820_ = new int[i_816_];
						is_821_ = new byte[i_816_];
						for (int i_822_ = 0; i_822_ < i_816_; i_822_++) {
							is_820_[i_822_] = class527_sub38.method16466(-1818273490);
							is_821_[i_822_] = class527_sub38.readByte();
						}
					}
					if ((aHashMapArrayArrayArray7160[i_812_ - 1][i - (anInt7137 >> 6)][i_804_ - (anInt7138 >> 6)]) == null)
						aHashMapArrayArrayArray7160[i_812_ - 1][i - (anInt7137 >> 6)][i_804_ - (anInt7138 >> 6)] = new HashMap();
					int i_823_ = ((i_805_ & 0x3f) << 8) + (i_806_ & 0x3f);
					Class528 class528 = new Class528(i_805_ & 0x3f, i_806_ & 0x3f, i_813_, i_814_, i_815_, is_820_, is_821_);
					aHashMapArrayArrayArray7160[i_812_ - 1][i - (anInt7137 >> 6)][i_804_ - (anInt7138 >> 6)].put(Integer.valueOf(i_823_), class528);
				}
			}
		}
	}

	static void method8846(int i, int i_824_, int i_825_, int i_826_, int i_827_, int i_828_, int i_829_, int i_830_) {
		anInt7125 = i - anInt7137;
		anInt7136 = i_824_ - anInt7138;
		anInt7177 = i_825_ - anInt7137;
		anInt7175 = i_826_ - anInt7138;
		anInt7179 = i_827_;
		anInt7180 = i_828_;
		anInt7181 = i_829_;
		anInt7182 = i_830_;
	}

	static Class694 method8847(Class180 class180, int i, int i_831_, int i_832_, int i_833_) {
		for (Class527_Sub30 class527_sub30 = (Class527_Sub30) aClass694_7147.method14081((short) 23479); class527_sub30 != null; class527_sub30 = (Class527_Sub30) aClass694_7147.method14086(-65534))
			method8830(class180, class527_sub30, i, i_831_, i_832_, i_833_);
		return aClass694_7147;
	}

	static void method8848(Class180 class180, Class527_Sub30 class527_sub30, int i, int i_834_, int i_835_, int i_836_) {
		class527_sub30.anInt10569 = (anInt7179 + (i_835_ + i * (class527_sub30.anInt10568 * 208579007 - anInt7125) >> 16)) * 1000232333;
		class527_sub30.anInt10570 = (anInt7182 - (i_836_ + i_834_ * (class527_sub30.anInt10565 * -1499963557 - anInt7175) >> 16)) * -231329071;
	}

	static void method8849(Class180 class180, Class527_Sub30 class527_sub30, int i, int i_837_, int i_838_, int i_839_) {
		class527_sub30.anInt10569 = (anInt7179 + (i_838_ + i * (class527_sub30.anInt10568 * 208579007 - anInt7125) >> 16)) * 1000232333;
		class527_sub30.anInt10570 = (anInt7182 - (i_839_ + i_837_ * (class527_sub30.anInt10565 * -1499963557 - anInt7175) >> 16)) * -231329071;
	}

	static void method8850(Class180 class180, Class527_Sub30 class527_sub30, int i, int i_840_, int i_841_, int i_842_) {
		class527_sub30.anInt10569 = (anInt7179 + (i_841_ + i * (class527_sub30.anInt10568 * 208579007 - anInt7125) >> 16)) * 1000232333;
		class527_sub30.anInt10570 = (anInt7182 - (i_842_ + i_840_ * (class527_sub30.anInt10565 * -1499963557 - anInt7175) >> 16)) * -231329071;
	}

	static void method8851(Class180 class180, Class527_Sub30 class527_sub30, Class249 class249) {
		if (class249.anIntArray2760 != null) {
			int[] is = new int[class249.anIntArray2760.length];
			for (int i = 0; i < is.length / 2; i++) {
				int i_843_ = (class249.anIntArray2760[i * 2] + class527_sub30.anInt10568 * 208579007);
				int i_844_ = (class249.anIntArray2760[i * 2 + 1] + class527_sub30.anInt10565 * -1499963557);
				is[i * 2] = anInt7179 + ((anInt7181 - anInt7179) * (i_843_ - anInt7125) / (anInt7177 - anInt7125));
				is[i * 2 + 1] = anInt7182 - ((anInt7182 - anInt7180) * (i_844_ - anInt7175) / (anInt7136 - anInt7175));
			}
			Class168.method2679(class180, is, class249.anInt2765 * 1588851213);
			if (class249.anInt2770 * 713635825 > 0) {
				for (int i = 0; i < is.length / 2 - 1; i++) {
					int i_845_ = is[i * 2];
					int i_846_ = is[i * 2 + 1];
					int i_847_ = is[(i + 1) * 2];
					int i_848_ = is[(i + 1) * 2 + 1];
					if (i_847_ < i_845_) {
						int i_849_ = i_845_;
						int i_850_ = i_846_;
						i_845_ = i_847_;
						i_846_ = i_848_;
						i_847_ = i_849_;
						i_848_ = i_850_;
					} else if (i_847_ == i_845_ && i_848_ < i_846_) {
						int i_851_ = i_846_;
						i_846_ = i_848_;
						i_848_ = i_851_;
					}
					class180.method3151(i_845_, i_846_, i_847_, i_848_, (class249.anIntArray2773[class249.aByteArray2774[i] & 0xff]), 1, class249.anInt2770 * 713635825, class249.anInt2767 * 127279521, class249.anInt2768 * 218731315);
				}
				int i = is[is.length - 2];
				int i_852_ = is[is.length - 1];
				int i_853_ = is[0];
				int i_854_ = is[1];
				if (i_853_ < i) {
					int i_855_ = i;
					int i_856_ = i_852_;
					i = i_853_;
					i_852_ = i_854_;
					i_853_ = i_855_;
					i_854_ = i_856_;
				} else if (i_853_ == i && i_854_ < i_852_) {
					int i_857_ = i_852_;
					i_852_ = i_854_;
					i_854_ = i_857_;
				}
				class180.method3151(i, i_852_, i_853_, i_854_, (class249.anIntArray2773[((class249.aByteArray2774[class249.aByteArray2774.length - 1]) & 0xff)]), 1, class249.anInt2770 * 713635825, class249.anInt2767 * 127279521, class249.anInt2768 * 218731315);
			} else {
				for (int i = 0; i < is.length / 2 - 1; i++)
					class180.method3142(is[i * 2], is[i * 2 + 1], is[(i + 1) * 2], is[(i + 1) * 2 + 1], (class249.anIntArray2773[class249.aByteArray2774[i] & 0xff]), (byte) 1);
				class180.method3142(is[is.length - 2], is[is.length - 1], is[0], is[1], (class249.anIntArray2773[((class249.aByteArray2774[class249.aByteArray2774.length - 1]) & 0xff)]), (byte) 1);
			}
		}
	}

	static void method8852(Class180 class180, Class527_Sub30 class527_sub30, Class249 class249) {
		if (class249.anIntArray2760 != null) {
			int[] is = new int[class249.anIntArray2760.length];
			for (int i = 0; i < is.length / 2; i++) {
				int i_858_ = (class249.anIntArray2760[i * 2] + class527_sub30.anInt10568 * 208579007);
				int i_859_ = (class249.anIntArray2760[i * 2 + 1] + class527_sub30.anInt10565 * -1499963557);
				is[i * 2] = anInt7179 + ((anInt7181 - anInt7179) * (i_858_ - anInt7125) / (anInt7177 - anInt7125));
				is[i * 2 + 1] = anInt7182 - ((anInt7182 - anInt7180) * (i_859_ - anInt7175) / (anInt7136 - anInt7175));
			}
			Class168.method2679(class180, is, class249.anInt2765 * 1588851213);
			if (class249.anInt2770 * 713635825 > 0) {
				for (int i = 0; i < is.length / 2 - 1; i++) {
					int i_860_ = is[i * 2];
					int i_861_ = is[i * 2 + 1];
					int i_862_ = is[(i + 1) * 2];
					int i_863_ = is[(i + 1) * 2 + 1];
					if (i_862_ < i_860_) {
						int i_864_ = i_860_;
						int i_865_ = i_861_;
						i_860_ = i_862_;
						i_861_ = i_863_;
						i_862_ = i_864_;
						i_863_ = i_865_;
					} else if (i_862_ == i_860_ && i_863_ < i_861_) {
						int i_866_ = i_861_;
						i_861_ = i_863_;
						i_863_ = i_866_;
					}
					class180.method3151(i_860_, i_861_, i_862_, i_863_, (class249.anIntArray2773[class249.aByteArray2774[i] & 0xff]), 1, class249.anInt2770 * 713635825, class249.anInt2767 * 127279521, class249.anInt2768 * 218731315);
				}
				int i = is[is.length - 2];
				int i_867_ = is[is.length - 1];
				int i_868_ = is[0];
				int i_869_ = is[1];
				if (i_868_ < i) {
					int i_870_ = i;
					int i_871_ = i_867_;
					i = i_868_;
					i_867_ = i_869_;
					i_868_ = i_870_;
					i_869_ = i_871_;
				} else if (i_868_ == i && i_869_ < i_867_) {
					int i_872_ = i_867_;
					i_867_ = i_869_;
					i_869_ = i_872_;
				}
				class180.method3151(i, i_867_, i_868_, i_869_, (class249.anIntArray2773[((class249.aByteArray2774[class249.aByteArray2774.length - 1]) & 0xff)]), 1, class249.anInt2770 * 713635825, class249.anInt2767 * 127279521, class249.anInt2768 * 218731315);
			} else {
				for (int i = 0; i < is.length / 2 - 1; i++)
					class180.method3142(is[i * 2], is[i * 2 + 1], is[(i + 1) * 2], is[(i + 1) * 2 + 1], (class249.anIntArray2773[class249.aByteArray2774[i] & 0xff]), (byte) 1);
				class180.method3142(is[is.length - 2], is[is.length - 1], is[0], is[1], (class249.anIntArray2773[((class249.aByteArray2774[class249.aByteArray2774.length - 1]) & 0xff)]), (byte) 1);
			}
		}
	}

	static void method8853(Class180 class180, Class527_Sub30 class527_sub30, Class249 class249) {
		if (class249.anIntArray2760 != null) {
			int[] is = new int[class249.anIntArray2760.length];
			for (int i = 0; i < is.length / 2; i++) {
				int i_873_ = (class249.anIntArray2760[i * 2] + class527_sub30.anInt10568 * 208579007);
				int i_874_ = (class249.anIntArray2760[i * 2 + 1] + class527_sub30.anInt10565 * -1499963557);
				is[i * 2] = anInt7179 + ((anInt7181 - anInt7179) * (i_873_ - anInt7125) / (anInt7177 - anInt7125));
				is[i * 2 + 1] = anInt7182 - ((anInt7182 - anInt7180) * (i_874_ - anInt7175) / (anInt7136 - anInt7175));
			}
			Class168.method2679(class180, is, class249.anInt2765 * 1588851213);
			if (class249.anInt2770 * 713635825 > 0) {
				for (int i = 0; i < is.length / 2 - 1; i++) {
					int i_875_ = is[i * 2];
					int i_876_ = is[i * 2 + 1];
					int i_877_ = is[(i + 1) * 2];
					int i_878_ = is[(i + 1) * 2 + 1];
					if (i_877_ < i_875_) {
						int i_879_ = i_875_;
						int i_880_ = i_876_;
						i_875_ = i_877_;
						i_876_ = i_878_;
						i_877_ = i_879_;
						i_878_ = i_880_;
					} else if (i_877_ == i_875_ && i_878_ < i_876_) {
						int i_881_ = i_876_;
						i_876_ = i_878_;
						i_878_ = i_881_;
					}
					class180.method3151(i_875_, i_876_, i_877_, i_878_, (class249.anIntArray2773[class249.aByteArray2774[i] & 0xff]), 1, class249.anInt2770 * 713635825, class249.anInt2767 * 127279521, class249.anInt2768 * 218731315);
				}
				int i = is[is.length - 2];
				int i_882_ = is[is.length - 1];
				int i_883_ = is[0];
				int i_884_ = is[1];
				if (i_883_ < i) {
					int i_885_ = i;
					int i_886_ = i_882_;
					i = i_883_;
					i_882_ = i_884_;
					i_883_ = i_885_;
					i_884_ = i_886_;
				} else if (i_883_ == i && i_884_ < i_882_) {
					int i_887_ = i_882_;
					i_882_ = i_884_;
					i_884_ = i_887_;
				}
				class180.method3151(i, i_882_, i_883_, i_884_, (class249.anIntArray2773[((class249.aByteArray2774[class249.aByteArray2774.length - 1]) & 0xff)]), 1, class249.anInt2770 * 713635825, class249.anInt2767 * 127279521, class249.anInt2768 * 218731315);
			} else {
				for (int i = 0; i < is.length / 2 - 1; i++)
					class180.method3142(is[i * 2], is[i * 2 + 1], is[(i + 1) * 2], is[(i + 1) * 2 + 1], (class249.anIntArray2773[class249.aByteArray2774[i] & 0xff]), (byte) 1);
				class180.method3142(is[is.length - 2], is[is.length - 1], is[0], is[1], (class249.anIntArray2773[((class249.aByteArray2774[class249.aByteArray2774.length - 1]) & 0xff)]), (byte) 1);
			}
		}
	}

	static int method8854() {
		return (int) (64.0F * aFloat7134 / 2.0F);
	}

	Class529() throws Throwable {
		throw new Error();
	}

	static int method8855() {
		return (int) (64.0F * aFloat7134 / 2.0F);
	}

	static int method8856(long l) {
		Class147 class147 = (Class147) aClass205_7163.method3787(l);
		if (class147 != null)
			return class147.method2407();
		return -1;
	}

	static void method8857(int[] is, int i, int i_888_, int i_889_, int i_890_, int i_891_, int i_892_, int i_893_) {
		for (int i_894_ = i; i_894_ <= i_888_; i_894_++) {
			for (int i_895_ = i_889_; i_895_ <= i_890_; i_895_++)
				is[(i_892_ - i_895_ - 1) * i_891_ + i_894_] = i_893_;
		}
	}

	static void method8858(int[] is, int i, int i_896_, int i_897_, int i_898_, int i_899_, int i_900_, int i_901_) {
		for (int i_902_ = i; i_902_ <= i_896_; i_902_++) {
			for (int i_903_ = i_897_; i_903_ <= i_898_; i_903_++)
				is[(i_900_ - i_903_ - 1) * i_899_ + i_902_] = i_901_;
		}
	}

	static void method8859(int[] is, int i, int i_904_, int i_905_, int i_906_, int i_907_, int i_908_, int i_909_) {
		for (int i_910_ = i; i_910_ <= i_904_; i_910_++) {
			for (int i_911_ = i_905_; i_911_ <= i_906_; i_911_++)
				is[(i_908_ - i_911_ - 1) * i_907_ + i_910_] = i_909_;
		}
	}

	static Class694 method8860(Class180 class180) {
		int i = anInt7177 - anInt7125;
		int i_912_ = anInt7136 - anInt7175;
		int i_913_ = (anInt7181 - anInt7179 << 16) / i;
		int i_914_ = (anInt7182 - anInt7180 << 16) / i_912_;
		return method8762(class180, i_913_, i_914_, 0, 0);
	}

	static void method8861(int[] is, int i, int i_915_, int i_916_, int i_917_, int i_918_) {
		int i_919_ = aClass630_7122.anInt8223 * -1253775049 >> 24 & 0xff;
		int i_920_ = 255 - i_919_;
		if ((!aBoolArray7185[anInt7152] || !aBoolArray7185[anInt7162] && !aBoolArray7185[anInt7158]) && (!aBoolArray7185[anInt7156] || !aBoolArray7185[anInt7162] && !aBoolArray7185[anInt7158])) {
			method8768(is, i, i_915_, i_916_, i_917_, i_918_, i_919_, i_920_, true, true, true, true);
			if (aBoolArray7185[anInt7153]) {
				is[(i_918_ - i_917_ - 1) * i_918_ + i_915_] = aClass630_7122.anInt8232 * -993232789;
				is[(i_918_ - i_917_) * i_918_ + i_915_] = aClass630_7122.anInt8232 * -993232789;
				is[(i_918_ - i_917_ - 1) * i_918_ + i_915_ - 1] = aClass630_7122.anInt8232 * -993232789;
			}
			if (aBoolArray7185[anInt7155]) {
				is[(i_918_ - i_916_ - 1) * i_918_ + i_915_] = aClass630_7122.anInt8232 * -993232789;
				is[(i_918_ - i_916_ - 2) * i_918_ + i_915_] = aClass630_7122.anInt8232 * -993232789;
				is[(i_918_ - i_916_ - 1) * i_918_ + i_915_ - 1] = aClass630_7122.anInt8232 * -993232789;
			}
			if (aBoolArray7185[anInt7140]) {
				is[(i_918_ - i_916_ - 1) * i_918_ + i] = aClass630_7122.anInt8232 * -993232789;
				is[(i_918_ - i_916_ - 2) * i_918_ + i] = aClass630_7122.anInt8232 * -993232789;
				is[(i_918_ - i_916_ - 1) * i_918_ + i + 1] = aClass630_7122.anInt8232 * -993232789;
			}
			if (aBoolArray7185[anInt7183]) {
				is[(i_918_ - i_917_ - 1) * i_918_ + i] = aClass630_7122.anInt8232 * -993232789;
				is[(i_918_ - i_917_) * i_918_ + i] = aClass630_7122.anInt8232 * -993232789;
				is[(i_918_ - i_917_ - 1) * i_918_ + i + 1] = aClass630_7122.anInt8232 * -993232789;
			}
		} else {
			if (aBoolArray7185[anInt7152] && aBoolArray7185[anInt7162])
				method8781(is, i_915_ - aClass630_7122.anInt8231 * 1188642867 + 1, i_917_ - aClass630_7122.anInt8231 * 1188642867 + 1, i_918_, i_919_, i_920_, anInt7153);
			else {
				method8768(is, i_915_ - aClass630_7122.anInt8231 * 1188642867 + 1, i_915_, i_917_ - aClass630_7122.anInt8231 * 1188642867 + 1, i_917_, i_918_, i_919_, i_920_, true, true, false, false);
				if (aBoolArray7185[anInt7153]) {
					is[(i_918_ - i_917_ - 1) * i_918_ + i_915_] = aClass630_7122.anInt8232 * -993232789;
					is[(i_918_ - i_917_) * i_918_ + i_915_] = aClass630_7122.anInt8232 * -993232789;
					is[(i_918_ - i_917_ - 1) * i_918_ + i_915_ - 1] = aClass630_7122.anInt8232 * -993232789;
				}
			}
			if (aBoolArray7185[anInt7156] && aBoolArray7185[anInt7162])
				method8781(is, i_915_ - aClass630_7122.anInt8231 * 1188642867 + 1, i_916_, i_918_, i_919_, i_920_, anInt7155);
			else {
				method8768(is, i_915_ - aClass630_7122.anInt8231 * 1188642867 + 1, i_915_, i_916_, i_916_ + aClass630_7122.anInt8231 * 1188642867 - 1, i_918_, i_919_, i_920_, false, true, true, false);
				if (aBoolArray7185[anInt7155]) {
					is[(i_918_ - i_916_ - 1) * i_918_ + i_915_] = aClass630_7122.anInt8232 * -993232789;
					is[(i_918_ - i_916_ - 2) * i_918_ + i_915_] = aClass630_7122.anInt8232 * -993232789;
					is[(i_918_ - i_916_ - 1) * i_918_ + i_915_ - 1] = aClass630_7122.anInt8232 * -993232789;
				}
			}
			if (aBoolArray7185[anInt7156] && aBoolArray7185[anInt7158])
				method8781(is, i, i_916_, i_918_, i_919_, i_920_, anInt7140);
			else {
				method8768(is, i, i + aClass630_7122.anInt8231 * 1188642867 - 1, i_916_, i_916_ + aClass630_7122.anInt8231 * 1188642867 - 1, i_918_, i_919_, i_920_, false, false, true, true);
				if (aBoolArray7185[anInt7140]) {
					is[(i_918_ - i_916_ - 1) * i_918_ + i] = aClass630_7122.anInt8232 * -993232789;
					is[(i_918_ - i_916_ - 2) * i_918_ + i] = aClass630_7122.anInt8232 * -993232789;
					is[(i_918_ - i_916_ - 1) * i_918_ + i + 1] = aClass630_7122.anInt8232 * -993232789;
				}
			}
			if (aBoolArray7185[anInt7152] && aBoolArray7185[anInt7158])
				method8781(is, i, i_917_ - aClass630_7122.anInt8231 * 1188642867 + 1, i_918_, i_919_, i_920_, anInt7183);
			else {
				method8768(is, i, i + aClass630_7122.anInt8231 * 1188642867 - 1, i_917_ - aClass630_7122.anInt8231 * 1188642867 + 1, i_917_, i_918_, i_919_, i_920_, true, false, false, true);
				if (aBoolArray7185[anInt7183]) {
					is[(i_918_ - i_917_ - 1) * i_918_ + i] = aClass630_7122.anInt8232 * -993232789;
					is[(i_918_ - i_917_) * i_918_ + i] = aClass630_7122.anInt8232 * -993232789;
					is[(i_918_ - i_917_ - 1) * i_918_ + i + 1] = aClass630_7122.anInt8232 * -993232789;
				}
			}
			if (i + aClass630_7122.anInt8231 * 1188642867 < i_915_ - aClass630_7122.anInt8231 * 1188642867)
				method8768(is, i + aClass630_7122.anInt8231 * 1188642867, i_915_ - aClass630_7122.anInt8231 * 1188642867, i_916_, i_917_, i_918_, i_919_, i_920_, true, false, true, false);
			if (i_916_ + aClass630_7122.anInt8231 * 1188642867 + 1 < i_917_ - aClass630_7122.anInt8231 * 1188642867 - 1) {
				method8768(is, i, i + aClass630_7122.anInt8231 * 1188642867 - 1, i_916_ + aClass630_7122.anInt8231 * 1188642867, i_917_ - aClass630_7122.anInt8231 * 1188642867, i_918_, i_919_, i_920_, false, false, false, true);
				method8768(is, i_915_ - aClass630_7122.anInt8231 * 1188642867 + 1, i_915_, i_916_ + aClass630_7122.anInt8231 * 1188642867, i_917_ - aClass630_7122.anInt8231 * 1188642867, i_918_, i_919_, i_920_, false, true, false, false);
			}
		}
	}

	public static void method8862(Class459 class459, Class459 class459_921_, Class24_Sub14 class24_sub14, Class24_Sub5 class24_sub5, Class24_Sub6 class24_sub6, Class24_Sub12 class24_sub12, Class24_Sub8 class24_sub8, Interface20 interface20, Interface18 interface18) {
		aClass459_7124 = class459;
		aClass459_7115 = class459_921_;
		anInterface13_7142 = class24_sub14;
		anInterface13_7157 = class24_sub5;
		aClass24_Sub6_7117 = class24_sub6;
		aClass24_Sub12_7164 = class24_sub12;
		aClass24_Sub8_7119 = class24_sub8;
		anInterface20_7121 = interface20;
		anInterface18_7120 = interface18;
		aClass14_7126.method721(-640900329);
		int[] is = aClass459_7124.method7486(Class651.aClass651_8380.method87(), 2147483647);
		if (is != null) {
			for (int i = 0; i < is.length; i++) {
				Class527_Sub8_Sub12 class527_sub8_sub12 = Class612.method10124(aClass459_7124, is[i], (short) 12858);
				aClass14_7126.method714(class527_sub8_sub12, (long) (class527_sub8_sub12.anInt11765 * 911503199));
			}
		}
		Class25.method851(true, false, (byte) 3);
	}

	static void method8863(int[] is, int i, int i_922_, int i_923_, int i_924_, int i_925_) {
		int i_926_ = aClass630_7122.anInt8223 * -1253775049 >> 24 & 0xff;
		int i_927_ = 255 - i_926_;
		if ((!aBoolArray7185[anInt7152] || !aBoolArray7185[anInt7162] && !aBoolArray7185[anInt7158]) && (!aBoolArray7185[anInt7156] || !aBoolArray7185[anInt7162] && !aBoolArray7185[anInt7158])) {
			method8768(is, i, i_922_, i_923_, i_924_, i_925_, i_926_, i_927_, true, true, true, true);
			if (aBoolArray7185[anInt7153]) {
				is[(i_925_ - i_924_ - 1) * i_925_ + i_922_] = aClass630_7122.anInt8232 * -993232789;
				is[(i_925_ - i_924_) * i_925_ + i_922_] = aClass630_7122.anInt8232 * -993232789;
				is[(i_925_ - i_924_ - 1) * i_925_ + i_922_ - 1] = aClass630_7122.anInt8232 * -993232789;
			}
			if (aBoolArray7185[anInt7155]) {
				is[(i_925_ - i_923_ - 1) * i_925_ + i_922_] = aClass630_7122.anInt8232 * -993232789;
				is[(i_925_ - i_923_ - 2) * i_925_ + i_922_] = aClass630_7122.anInt8232 * -993232789;
				is[(i_925_ - i_923_ - 1) * i_925_ + i_922_ - 1] = aClass630_7122.anInt8232 * -993232789;
			}
			if (aBoolArray7185[anInt7140]) {
				is[(i_925_ - i_923_ - 1) * i_925_ + i] = aClass630_7122.anInt8232 * -993232789;
				is[(i_925_ - i_923_ - 2) * i_925_ + i] = aClass630_7122.anInt8232 * -993232789;
				is[(i_925_ - i_923_ - 1) * i_925_ + i + 1] = aClass630_7122.anInt8232 * -993232789;
			}
			if (aBoolArray7185[anInt7183]) {
				is[(i_925_ - i_924_ - 1) * i_925_ + i] = aClass630_7122.anInt8232 * -993232789;
				is[(i_925_ - i_924_) * i_925_ + i] = aClass630_7122.anInt8232 * -993232789;
				is[(i_925_ - i_924_ - 1) * i_925_ + i + 1] = aClass630_7122.anInt8232 * -993232789;
			}
		} else {
			if (aBoolArray7185[anInt7152] && aBoolArray7185[anInt7162])
				method8781(is, i_922_ - aClass630_7122.anInt8231 * 1188642867 + 1, i_924_ - aClass630_7122.anInt8231 * 1188642867 + 1, i_925_, i_926_, i_927_, anInt7153);
			else {
				method8768(is, i_922_ - aClass630_7122.anInt8231 * 1188642867 + 1, i_922_, i_924_ - aClass630_7122.anInt8231 * 1188642867 + 1, i_924_, i_925_, i_926_, i_927_, true, true, false, false);
				if (aBoolArray7185[anInt7153]) {
					is[(i_925_ - i_924_ - 1) * i_925_ + i_922_] = aClass630_7122.anInt8232 * -993232789;
					is[(i_925_ - i_924_) * i_925_ + i_922_] = aClass630_7122.anInt8232 * -993232789;
					is[(i_925_ - i_924_ - 1) * i_925_ + i_922_ - 1] = aClass630_7122.anInt8232 * -993232789;
				}
			}
			if (aBoolArray7185[anInt7156] && aBoolArray7185[anInt7162])
				method8781(is, i_922_ - aClass630_7122.anInt8231 * 1188642867 + 1, i_923_, i_925_, i_926_, i_927_, anInt7155);
			else {
				method8768(is, i_922_ - aClass630_7122.anInt8231 * 1188642867 + 1, i_922_, i_923_, i_923_ + aClass630_7122.anInt8231 * 1188642867 - 1, i_925_, i_926_, i_927_, false, true, true, false);
				if (aBoolArray7185[anInt7155]) {
					is[(i_925_ - i_923_ - 1) * i_925_ + i_922_] = aClass630_7122.anInt8232 * -993232789;
					is[(i_925_ - i_923_ - 2) * i_925_ + i_922_] = aClass630_7122.anInt8232 * -993232789;
					is[(i_925_ - i_923_ - 1) * i_925_ + i_922_ - 1] = aClass630_7122.anInt8232 * -993232789;
				}
			}
			if (aBoolArray7185[anInt7156] && aBoolArray7185[anInt7158])
				method8781(is, i, i_923_, i_925_, i_926_, i_927_, anInt7140);
			else {
				method8768(is, i, i + aClass630_7122.anInt8231 * 1188642867 - 1, i_923_, i_923_ + aClass630_7122.anInt8231 * 1188642867 - 1, i_925_, i_926_, i_927_, false, false, true, true);
				if (aBoolArray7185[anInt7140]) {
					is[(i_925_ - i_923_ - 1) * i_925_ + i] = aClass630_7122.anInt8232 * -993232789;
					is[(i_925_ - i_923_ - 2) * i_925_ + i] = aClass630_7122.anInt8232 * -993232789;
					is[(i_925_ - i_923_ - 1) * i_925_ + i + 1] = aClass630_7122.anInt8232 * -993232789;
				}
			}
			if (aBoolArray7185[anInt7152] && aBoolArray7185[anInt7158])
				method8781(is, i, i_924_ - aClass630_7122.anInt8231 * 1188642867 + 1, i_925_, i_926_, i_927_, anInt7183);
			else {
				method8768(is, i, i + aClass630_7122.anInt8231 * 1188642867 - 1, i_924_ - aClass630_7122.anInt8231 * 1188642867 + 1, i_924_, i_925_, i_926_, i_927_, true, false, false, true);
				if (aBoolArray7185[anInt7183]) {
					is[(i_925_ - i_924_ - 1) * i_925_ + i] = aClass630_7122.anInt8232 * -993232789;
					is[(i_925_ - i_924_) * i_925_ + i] = aClass630_7122.anInt8232 * -993232789;
					is[(i_925_ - i_924_ - 1) * i_925_ + i + 1] = aClass630_7122.anInt8232 * -993232789;
				}
			}
			if (i + aClass630_7122.anInt8231 * 1188642867 < i_922_ - aClass630_7122.anInt8231 * 1188642867)
				method8768(is, i + aClass630_7122.anInt8231 * 1188642867, i_922_ - aClass630_7122.anInt8231 * 1188642867, i_923_, i_924_, i_925_, i_926_, i_927_, true, false, true, false);
			if (i_923_ + aClass630_7122.anInt8231 * 1188642867 + 1 < i_924_ - aClass630_7122.anInt8231 * 1188642867 - 1) {
				method8768(is, i, i + aClass630_7122.anInt8231 * 1188642867 - 1, i_923_ + aClass630_7122.anInt8231 * 1188642867, i_924_ - aClass630_7122.anInt8231 * 1188642867, i_925_, i_926_, i_927_, false, false, false, true);
				method8768(is, i_922_ - aClass630_7122.anInt8231 * 1188642867 + 1, i_922_, i_923_ + aClass630_7122.anInt8231 * 1188642867, i_924_ - aClass630_7122.anInt8231 * 1188642867, i_925_, i_926_, i_927_, false, true, false, false);
			}
		}
	}

	static void method8864(int[] is, int i, int i_928_, int i_929_, int i_930_, int i_931_) {
		int i_932_ = aClass630_7122.anInt8223 * -1253775049 >> 24 & 0xff;
		int i_933_ = 255 - i_932_;
		for (int i_934_ = i; i_934_ <= i_928_; i_934_++) {
			for (int i_935_ = i_929_; i_935_ <= i_930_; i_935_++) {
				int i_936_ = is[(i_931_ - i_935_ - 1) * i_931_ + i_934_];
				if (i_936_ != anInt7154) {
					anInt7154 = i_936_;
					anInt7184 = (~0xffffff | ((((aClass630_7122.anInt8223 * -1253775049 & 0xff00ff) * i_932_ + (i_936_ & 0xff00ff) * i_933_) & ~0xff00ff) + (((aClass630_7122.anInt8223 * -1253775049 & 0xff00) * i_932_ + (i_936_ & 0xff00) * i_933_) & 0xff0000)) >> 8);
				}
				is[(i_931_ - i_935_ - 1) * i_931_ + i_934_] = anInt7184;
			}
		}
	}

	static void method8865(int[] is, int i, int i_937_, int i_938_, int i_939_, int i_940_) {
		int i_941_ = aClass630_7122.anInt8223 * -1253775049 >> 24 & 0xff;
		int i_942_ = 255 - i_941_;
		for (int i_943_ = i; i_943_ <= i_937_; i_943_++) {
			for (int i_944_ = i_938_; i_944_ <= i_939_; i_944_++) {
				int i_945_ = is[(i_940_ - i_944_ - 1) * i_940_ + i_943_];
				if (i_945_ != anInt7154) {
					anInt7154 = i_945_;
					anInt7184 = (~0xffffff | ((((aClass630_7122.anInt8223 * -1253775049 & 0xff00ff) * i_941_ + (i_945_ & 0xff00ff) * i_942_) & ~0xff00ff) + (((aClass630_7122.anInt8223 * -1253775049 & 0xff00) * i_941_ + (i_945_ & 0xff00) * i_942_) & 0xff0000)) >> 8);
				}
				is[(i_940_ - i_944_ - 1) * i_940_ + i_943_] = anInt7184;
			}
		}
	}

	static void method8866(Class181 class181, int i, int i_946_) {
		for (int i_947_ = 0; i_947_ < anInterface13_7142.method77(-205003355); i_947_++)
			anIntArray7141[i_947_ + 1] = method8755(class181, i_947_, i, i_946_);
	}

	static void method8867(int[] is, int i, int i_948_, int i_949_, int i_950_, int i_951_, int i_952_, int i_953_, boolean bool, boolean bool_954_, boolean bool_955_, boolean bool_956_) {
		for (int i_957_ = i; i_957_ <= i_948_; i_957_++) {
			boolean bool_958_ = bool_954_ ? (aBoolArray7185[anInt7162] && i_948_ - i_957_ < (aClass630_7122.anInt8235 * 1577317633)) : false;
			boolean bool_959_ = (bool_956_ ? (aBoolArray7185[anInt7158] && i_957_ - i < aClass630_7122.anInt8235 * 1577317633) : false);
			for (int i_960_ = i_949_; i_960_ <= i_950_; i_960_++) {
				if (bool_958_ || bool_959_)
					is[(i_951_ - i_960_ - 1) * i_951_ + i_957_] = aClass630_7122.anInt8232 * -993232789;
				else {
					boolean bool_961_ = (bool ? (aBoolArray7185[anInt7152] && (i_950_ - i_960_ < aClass630_7122.anInt8235 * 1577317633)) : false);
					boolean bool_962_ = (bool_955_ ? (aBoolArray7185[anInt7156] && (i_960_ - i_949_ < aClass630_7122.anInt8235 * 1577317633)) : false);
					if (bool_961_ || bool_962_)
						is[(i_951_ - i_960_ - 1) * i_951_ + i_957_] = aClass630_7122.anInt8232 * -993232789;
					else {
						int i_963_ = is[(i_951_ - i_960_ - 1) * i_951_ + i_957_];
						if (i_963_ != anInt7154) {
							anInt7154 = i_963_;
							anInt7184 = (~0xffffff | ((((aClass630_7122.anInt8223 * -1253775049 & 0xff00ff) * i_952_ + (i_963_ & 0xff00ff) * i_953_) & ~0xff00ff) + ((((aClass630_7122.anInt8223 * -1253775049) & 0xff00) * i_952_ + (i_963_ & 0xff00) * i_953_) & 0xff0000)) >> 8);
						}
						is[(i_951_ - i_960_ - 1) * i_951_ + i_957_] = anInt7184;
					}
				}
			}
		}
	}

	static void method8868(int[] is, int i, int i_964_, int i_965_, int i_966_, int i_967_, int i_968_, int i_969_, boolean bool, boolean bool_970_, boolean bool_971_, boolean bool_972_) {
		for (int i_973_ = i; i_973_ <= i_964_; i_973_++) {
			boolean bool_974_ = bool_970_ ? (aBoolArray7185[anInt7162] && i_964_ - i_973_ < (aClass630_7122.anInt8235 * 1577317633)) : false;
			boolean bool_975_ = (bool_972_ ? (aBoolArray7185[anInt7158] && i_973_ - i < aClass630_7122.anInt8235 * 1577317633) : false);
			for (int i_976_ = i_965_; i_976_ <= i_966_; i_976_++) {
				if (bool_974_ || bool_975_)
					is[(i_967_ - i_976_ - 1) * i_967_ + i_973_] = aClass630_7122.anInt8232 * -993232789;
				else {
					boolean bool_977_ = (bool ? (aBoolArray7185[anInt7152] && (i_966_ - i_976_ < aClass630_7122.anInt8235 * 1577317633)) : false);
					boolean bool_978_ = (bool_971_ ? (aBoolArray7185[anInt7156] && (i_976_ - i_965_ < aClass630_7122.anInt8235 * 1577317633)) : false);
					if (bool_977_ || bool_978_)
						is[(i_967_ - i_976_ - 1) * i_967_ + i_973_] = aClass630_7122.anInt8232 * -993232789;
					else {
						int i_979_ = is[(i_967_ - i_976_ - 1) * i_967_ + i_973_];
						if (i_979_ != anInt7154) {
							anInt7154 = i_979_;
							anInt7184 = (~0xffffff | ((((aClass630_7122.anInt8223 * -1253775049 & 0xff00ff) * i_968_ + (i_979_ & 0xff00ff) * i_969_) & ~0xff00ff) + ((((aClass630_7122.anInt8223 * -1253775049) & 0xff00) * i_968_ + (i_979_ & 0xff00) * i_969_) & 0xff0000)) >> 8);
						}
						is[(i_967_ - i_976_ - 1) * i_967_ + i_973_] = anInt7184;
					}
				}
			}
		}
	}

	static void method8869(int[] is, int i, int i_980_, int i_981_, int i_982_, int i_983_, int i_984_, int i_985_, boolean bool, boolean bool_986_, boolean bool_987_, boolean bool_988_) {
		for (int i_989_ = i; i_989_ <= i_980_; i_989_++) {
			boolean bool_990_ = bool_986_ ? (aBoolArray7185[anInt7162] && i_980_ - i_989_ < (aClass630_7122.anInt8235 * 1577317633)) : false;
			boolean bool_991_ = (bool_988_ ? (aBoolArray7185[anInt7158] && i_989_ - i < aClass630_7122.anInt8235 * 1577317633) : false);
			for (int i_992_ = i_981_; i_992_ <= i_982_; i_992_++) {
				if (bool_990_ || bool_991_)
					is[(i_983_ - i_992_ - 1) * i_983_ + i_989_] = aClass630_7122.anInt8232 * -993232789;
				else {
					boolean bool_993_ = (bool ? (aBoolArray7185[anInt7152] && (i_982_ - i_992_ < aClass630_7122.anInt8235 * 1577317633)) : false);
					boolean bool_994_ = (bool_987_ ? (aBoolArray7185[anInt7156] && (i_992_ - i_981_ < aClass630_7122.anInt8235 * 1577317633)) : false);
					if (bool_993_ || bool_994_)
						is[(i_983_ - i_992_ - 1) * i_983_ + i_989_] = aClass630_7122.anInt8232 * -993232789;
					else {
						int i_995_ = is[(i_983_ - i_992_ - 1) * i_983_ + i_989_];
						if (i_995_ != anInt7154) {
							anInt7154 = i_995_;
							anInt7184 = (~0xffffff | ((((aClass630_7122.anInt8223 * -1253775049 & 0xff00ff) * i_984_ + (i_995_ & 0xff00ff) * i_985_) & ~0xff00ff) + ((((aClass630_7122.anInt8223 * -1253775049) & 0xff00) * i_984_ + (i_995_ & 0xff00) * i_985_) & 0xff0000)) >> 8);
						}
						is[(i_983_ - i_992_ - 1) * i_983_ + i_989_] = anInt7184;
					}
				}
			}
		}
	}

	static void method8870(int[] is, int i, int i_996_, int i_997_, int i_998_, int i_999_, int i_1000_) {
		for (int i_1001_ = 0; i_1001_ < aClass630_7122.anInt8231 * 1188642867; i_1001_++) {
			int i_1002_ = i_1001_;
			if (i_1000_ == anInt7153 || i_1000_ == anInt7155)
				i_1002_ = aClass630_7122.anInt8231 * 1188642867 - i_1001_ - 1;
			for (int i_1003_ = 0; i_1003_ < aClass630_7122.anInt8231 * 1188642867; i_1003_++) {
				int i_1004_ = i_1003_;
				if (i_1000_ == anInt7155 || i_1000_ == anInt7140)
					i_1004_ = aClass630_7122.anInt8231 * 1188642867 - i_1003_ - 1;
				int i_1005_ = anIntArrayArray7151[i_1002_][i_1004_];
				if (i_1005_ != 0) {
					if (i_1005_ == 1) {
						int i_1006_ = is[((i_997_ - i_996_ - i_1003_ - 1) * i_997_ + i + i_1001_)];
						if (i_1006_ != anInt7154) {
							anInt7154 = i_1006_;
							anInt7184 = (~0xffffff | ((((aClass630_7122.anInt8223 * -1253775049 & 0xff00ff) * i_998_ + (i_1006_ & 0xff00ff) * i_999_) & ~0xff00ff) + ((((aClass630_7122.anInt8223 * -1253775049) & 0xff00) * i_998_ + (i_1006_ & 0xff00) * i_999_) & 0xff0000)) >> 8);
						}
						is[((i_997_ - i_996_ - i_1003_ - 1) * i_997_ + i + i_1001_)] = anInt7184;
					} else if (i_1005_ == 2)
						is[((i_997_ - i_996_ - i_1003_ - 1) * i_997_ + i + i_1001_)] = aClass630_7122.anInt8232 * -993232789;
				}
			}
		}
	}

	static void method8871(int[] is, int i, int i_1007_, int i_1008_, int i_1009_, int i_1010_) {
		int i_1011_ = i + (i_1009_ - i_1007_ - 1) * i_1009_;
		for (int i_1012_ = 0; i_1012_ < i_1008_; i_1012_++)
			is[i_1011_ + i_1012_ * i_1009_] = i_1010_;
	}

	static void method8872(int[] is, int i, int i_1013_, int i_1014_, int i_1015_, int i_1016_, int i_1017_) {
		for (int i_1018_ = 0; i_1018_ < aClass630_7122.anInt8231 * 1188642867; i_1018_++) {
			int i_1019_ = i_1018_;
			if (i_1017_ == anInt7153 || i_1017_ == anInt7155)
				i_1019_ = aClass630_7122.anInt8231 * 1188642867 - i_1018_ - 1;
			for (int i_1020_ = 0; i_1020_ < aClass630_7122.anInt8231 * 1188642867; i_1020_++) {
				int i_1021_ = i_1020_;
				if (i_1017_ == anInt7155 || i_1017_ == anInt7140)
					i_1021_ = aClass630_7122.anInt8231 * 1188642867 - i_1020_ - 1;
				int i_1022_ = anIntArrayArray7151[i_1019_][i_1021_];
				if (i_1022_ != 0) {
					if (i_1022_ == 1) {
						int i_1023_ = is[((i_1014_ - i_1013_ - i_1020_ - 1) * i_1014_ + i + i_1018_)];
						if (i_1023_ != anInt7154) {
							anInt7154 = i_1023_;
							anInt7184 = (~0xffffff | ((((aClass630_7122.anInt8223 * -1253775049 & 0xff00ff) * i_1015_ + (i_1023_ & 0xff00ff) * i_1016_) & ~0xff00ff) + ((((aClass630_7122.anInt8223 * -1253775049) & 0xff00) * i_1015_ + (i_1023_ & 0xff00) * i_1016_) & 0xff0000)) >> 8);
						}
						is[((i_1014_ - i_1013_ - i_1020_ - 1) * i_1014_ + i + i_1018_)] = anInt7184;
					} else if (i_1022_ == 2)
						is[((i_1014_ - i_1013_ - i_1020_ - 1) * i_1014_ + i + i_1018_)] = aClass630_7122.anInt8232 * -993232789;
				}
			}
		}
	}

	static void method8873(int[] is, int i, int i_1024_, int i_1025_, int i_1026_, int i_1027_) {
		int i_1028_ = i + (i_1026_ - i_1024_ - 1) * i_1026_;
		for (int i_1029_ = 0; i_1029_ < i_1025_; i_1029_++)
			is[i_1028_ + i_1029_] = i_1027_;
	}

	static void method8874(int[] is, int i, int i_1030_, int i_1031_, int i_1032_, int i_1033_) {
		int i_1034_ = i + (i_1032_ - i_1030_ - 1) * i_1032_;
		for (int i_1035_ = 0; i_1035_ < i_1031_; i_1035_++)
			is[i_1034_ + i_1035_] = i_1033_;
	}

	static void method8875(int[] is, int i, int i_1036_, int i_1037_, int i_1038_, int i_1039_) {
		int i_1040_ = i + (i_1038_ - i_1036_ - 1) * i_1038_;
		for (int i_1041_ = 0; i_1041_ < i_1037_; i_1041_++)
			is[i_1040_ + i_1041_] = i_1039_;
	}

	static void method8876(int[] is, int i, int i_1042_, int i_1043_, int i_1044_, int i_1045_) {
		int i_1046_ = i + (i_1044_ - i_1042_ - 1) * i_1044_;
		for (int i_1047_ = 0; i_1047_ < i_1043_; i_1047_++)
			is[i_1046_ + i_1047_ * i_1044_] = i_1045_;
	}

	static void method8877(int i, int i_1048_, int i_1049_, int i_1050_, boolean bool, boolean bool_1051_, boolean bool_1052_, Class180 class180) {
		int i_1053_ = i * 64;
		int i_1054_ = i_1048_ * 64;
		if (anIntArray7150 == null || anIntArray7150.length != i_1049_ * i_1049_)
			anIntArray7150 = new int[i_1049_ * i_1049_];
		boolean bool_1055_ = aBool7165 && !bool_1052_;
		for (int i_1056_ = 0; i_1056_ < 64; i_1056_++) {
			int i_1057_ = i_1053_ + i_1056_;
			int i_1058_ = i_1056_ * i_1049_ / 64;
			int i_1059_ = (i_1056_ + 1) * i_1049_ / 64 - 1;
			if (i_1059_ < i_1058_)
				i_1059_ = i_1058_;
			for (int i_1060_ = 0; i_1060_ < 64; i_1060_++) {
				int i_1061_ = i_1054_ + i_1060_;
				boolean bool_1062_ = bool;
				if (bool_1055_ && !method8774(i_1057_, i_1061_))
					bool_1062_ = false;
				int i_1063_ = i_1057_ + i_1061_ * anInt7131;
				boolean bool_1064_ = false;
				boolean bool_1065_ = false;
				Object object = null;
				int i_1066_ = ((aByteArray7143[i_1063_] & 0xff) << 16 | aShortArray7144[i_1063_] & 0xffff);
				if (i_1066_ != 0)
					i_1066_ |= ~0xffffff;
				short i_1067_ = aShortArray7145[i_1063_];
				object = anObjectArray7139[i_1063_];
				int i_1068_ = i_1060_ * i_1049_ / 64;
				int i_1069_ = (i_1060_ + 1) * i_1049_ / 64 - 1;
				if (i_1069_ < i_1068_)
					i_1069_ = i_1068_;
				if (object != null) {
					if (object instanceof Class527_Sub39) {
						Class527_Sub39 class527_sub39 = (Class527_Sub39) object;
						if (class527_sub39 != null)
							method8767(anIntArray7150, i_1058_, i_1059_, i_1068_, i_1069_, i_1049_, bool_1062_, i_1066_, i_1067_, aByteArray7159[i_1063_], class527_sub39.anIntArray10695, class527_sub39.aByteArray10694, true);
					} else {
						Integer integer = (Integer) object;
						anIntArray7127[0] = integer.intValue();
						aByteArray7132[0] = aByteArray7148[i_1063_];
						method8767(anIntArray7150, i_1058_, i_1059_, i_1068_, i_1069_, i_1049_, bool_1062_, i_1066_, i_1067_, aByteArray7159[i_1063_], anIntArray7127, aByteArray7132, true);
					}
				} else
					method8767(anIntArray7150, i_1058_, i_1059_, i_1068_, i_1069_, i_1049_, bool_1062_, i_1066_, i_1067_, aByteArray7159[i_1063_], null, null, true);
			}
		}
		if (bool_1051_) {
			for (int i_1070_ = 0; i_1070_ < 64; i_1070_++) {
				int i_1071_ = i_1053_ + i_1070_;
				boolean bool_1072_ = i_1070_ == 0 && i_1071_ != 0;
				for (int i_1073_ = 0; i_1073_ < 64; i_1073_++) {
					int i_1074_ = i_1054_ + i_1073_;
					if (!bool_1055_ || method8774(i_1071_, i_1074_)) {
						boolean bool_1075_ = i_1073_ == 0 && i_1074_ != 0;
						int i_1076_ = i_1071_ + i_1074_ * anInt7131;
						if (bool_1072_ && bool_1075_)
							method8758(class180, anIntArray7150, i_1049_, -1, -1, i_1071_ - 1, i_1074_ - 1, i_1076_ - 1 - anInt7131);
						if (bool_1072_)
							method8758(class180, anIntArray7150, i_1049_, -1, i_1073_, i_1071_ - 1, i_1074_, i_1076_ - 1);
						if (bool_1075_)
							method8758(class180, anIntArray7150, i_1049_, i_1070_, -1, i_1071_, i_1074_ - 1, i_1076_ - anInt7131);
						method8758(class180, anIntArray7150, i_1049_, i_1070_, i_1073_, i_1071_, i_1074_, i_1076_);
					}
				}
			}
		}
		int i_1077_ = i * 64 / 64;
		int i_1078_ = i_1048_ * 64 / 64;
		for (int i_1079_ = 0; i_1079_ < 3; i_1079_++) {
			for (int i_1080_ = 0; i_1080_ < 64; i_1080_++) {
				int i_1081_ = i_1053_ + i_1080_;
				int i_1082_ = i_1081_ & 0x3f;
				int i_1083_ = i_1080_ * i_1049_ / 64;
				int i_1084_ = (i_1080_ + 1) * i_1049_ / 64 - 1;
				if (i_1084_ < i_1083_)
					i_1084_ = i_1083_;
				for (int i_1085_ = 0; i_1085_ < 64; i_1085_++) {
					int i_1086_ = i_1054_ + i_1085_;
					boolean bool_1087_ = bool;
					if (bool_1055_ && !method8774(i_1081_, i_1086_))
						bool_1087_ = false;
					int i_1088_ = i_1086_ & 0x3f;
					int i_1089_ = i_1085_ * i_1049_ / 64;
					int i_1090_ = (i_1085_ + 1) * i_1049_ / 64 - 1;
					if (i_1090_ < i_1089_)
						i_1090_ = i_1089_;
					HashMap hashmap = (aHashMapArrayArrayArray7160[i_1079_][i_1077_][i_1078_]);
					if (hashmap != null) {
						Class528 class528 = ((Class528) hashmap.get(Integer.valueOf((i_1082_ << 8) + i_1088_)));
						if (class528 != null)
							method8767(anIntArray7150, i_1083_, i_1084_, i_1089_, i_1090_, i_1049_, bool_1087_, class528.anInt7111, class528.aShort7113, class528.aByte7112, class528.anIntArray7114, class528.aByteArray7108, false);
					}
				}
			}
			for (int i_1091_ = 0; i_1091_ < 64; i_1091_++) {
				int i_1092_ = i_1053_ + i_1091_;
				int i_1093_ = i_1092_ & 0x3f;
				for (int i_1094_ = 0; i_1094_ < 64; i_1094_++) {
					int i_1095_ = i_1054_ + i_1094_;
					if (!bool_1055_ || method8774(i_1092_, i_1095_)) {
						int i_1096_ = i_1095_ & 0x3f;
						HashMap hashmap = (aHashMapArrayArrayArray7160[i_1079_][i_1077_][i_1078_]);
						if (hashmap != null) {
							Class528 class528 = ((Class528) hashmap.get(Integer.valueOf((i_1093_ << 8) + i_1096_)));
							if (class528 != null)
								method8769(class180, anIntArray7150, i_1049_, i_1091_, i_1094_, class528.anIntArray7114, class528.aByteArray7108);
						}
					}
				}
			}
		}
		if (bool_1055_) {
			int i_1097_ = 8;
			for (int i_1098_ = 0; i_1098_ < i_1097_; i_1098_++) {
				int i_1099_ = i_1053_ + i_1098_ * 8;
				int i_1100_ = i_1098_ * i_1049_ / i_1097_;
				int i_1101_ = (i_1098_ + 1) * i_1049_ / i_1097_ - 1;
				for (int i_1102_ = 0; i_1102_ < i_1097_; i_1102_++) {
					int i_1103_ = i_1054_ + i_1102_ * 8;
					if (!method8774(i_1099_, i_1103_)) {
						int i_1104_ = i_1102_ * i_1049_ / i_1097_;
						int i_1105_ = (i_1102_ + 1) * i_1049_ / i_1097_ - 1;
						if (i_1049_ < 64)
							method8843(anIntArray7150, i_1100_, i_1101_, i_1104_, i_1105_, i_1049_);
						else {
							aBoolArray7185[anInt7152] = method8774(i_1099_, i_1103_ + 8);
							aBoolArray7185[anInt7153] = method8774(i_1099_ + 8, i_1103_ + 8);
							aBoolArray7185[anInt7162] = method8774(i_1099_ + 8, i_1103_);
							aBoolArray7185[anInt7155] = method8774(i_1099_ + 8, i_1103_ - 8);
							aBoolArray7185[anInt7156] = method8774(i_1099_, i_1103_ - 8);
							aBoolArray7185[anInt7140] = method8774(i_1099_ - 8, i_1103_ - 8);
							aBoolArray7185[anInt7158] = method8774(i_1099_ - 8, i_1103_);
							aBoolArray7185[anInt7183] = method8774(i_1099_ - 8, i_1103_ + 8);
							method8778(anIntArray7150, i_1100_, i_1101_, i_1104_, i_1105_, i_1049_);
						}
					}
				}
			}
		}
		aClass205_7163.method3790(class180.method3162(anIntArray7150, 0, i_1049_, i_1049_, i_1049_, true), (long) i_1050_);
	}
}
