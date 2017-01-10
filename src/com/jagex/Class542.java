/* Class542 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

public class Class542 {
	protected static Interface18 anInterface18_7163;
	static Interface12 anInterface12_7164;
	protected static Class34_Sub17 aClass34_Sub17_7165;
	protected static Class199 aClass199_7166;
	static Interface12 anInterface12_7167 = null;
	static JS5ResourceProvider aClass461_7168;
	protected static Interface20 anInterface20_7169;
	static int[][] anIntArrayArray7170;
	static final int anInt7171 = 64;
	static int anInt7172;
	static byte[] aByteArray7173;
	static Class4 aClass4_7174;
	protected static int anInt7175;
	protected static int anInt7176;
	protected static byte[][][] aByteArrayArrayArray7177;
	protected static int anInt7178;
	static int anInt7179;
	static byte[] aByteArray7180;
	public static float aFloat7181;
	static RSByteBuffer aClass536_Sub33_7182;
	protected static JS5ResourceProvider aClass461_7183;
	protected static int anInt7184;
	public static int anInt7185;
	public static int anInt7186;
	protected static int anInt7187;
	protected static int anInt7188;
	static int[] anIntArray7189;
	protected static int anInt7190;
	static byte[] aByteArray7191;
	protected static Class543 aClass543_7192;
	static short[] aShortArray7193;
	static byte[] aByteArray7194;
	static Object[] anObjectArray7195;
	static int anInt7196;
	protected static boolean aBool7197;
	static boolean[][] aBoolArrayArray7198;
	protected static int anInt7199;
	static int anInt7200;
	static int anInt7201;
	public static Class536_Sub18_Sub14 aClass536_Sub18_Sub14_7202;
	static int anInt7203;
	static int anInt7204;
	static int anInt7205;
	protected static int anInt7206;
	static int anInt7207;
	static HashMap[][][] aHashMapArrayArrayArray7208;
	static int[] anIntArray7209;
	static int[] anIntArray7210;
	protected static Class199 aClass199_7211;
	protected static Class34_Sub8 aClass34_Sub8_7212;
	static ArrayList anArrayList7213;
	static short[] aShortArray7214;
	static int[] anIntArray7215;
	protected static int anInt7216;
	static int anInt7217;
	protected static Class708 aClass708_7218;
	static RSByteBuffer aClass536_Sub33_7219;
	protected static boolean aBool7220;
	static int[] anIntArray7221;
	static int anInt7222;
	protected static Class34_Sub1 aClass34_Sub1_7223;
	protected static int anInt7224;
	protected static Class199 aClass199_7225;
	protected static int anInt7226;
	protected static int anInt7227;
	public static Class622 aClass622_7228;
	static short[] aShortArray7229;
	protected static int anInt7230;
	static int anInt7231;
	public static float aFloat7232;
	static boolean[] aBoolArray7233;

	static void method6532() {
		int[] is = new int[3];
		for (int i = 0; i < aClass543_7192.anInt7234 * -1605869619; i++) {
			boolean bool = (aClass536_Sub18_Sub14_7202.method10767(aClass543_7192.anIntArray7235[i] >> 28 & 0x3, aClass543_7192.anIntArray7235[i] >> 14 & 0x3fff, aClass543_7192.anIntArray7235[i] & 0x3fff, is, (byte) 5));
			if (bool) {
				Class536_Sub41 class536_sub41 = new Class536_Sub41(aClass543_7192.anIntArray7236[i]);
				class536_sub41.anInt10794 = (is[1] - anInt7185) * 749779519;
				class536_sub41.anInt10796 = (is[2] - anInt7186) * -1881922211;
				aClass708_7218.method8335(class536_sub41, -1046579540);
			}
		}
	}

	static void method6533() {
		aShortArray7229 = null;
		aByteArray7173 = null;
		aShortArray7214 = null;
		aShortArray7193 = null;
		aByteArray7194 = null;
		anObjectArray7195 = null;
		aByteArray7191 = null;
		aHashMapArrayArrayArray7208 = null;
		anIntArray7189 = null;
		aBoolArrayArray7198 = null;
	}

	static boolean method6534(Class536_Sub18_Sub14 class536_sub18_sub14) {
		if (class536_sub18_sub14 != null && class536_sub18_sub14 != aClass536_Sub18_Sub14_7202) {
			aClass536_Sub18_Sub14_7202 = class536_sub18_sub14;
			aBool7197 = (aClass536_Sub18_Sub14_7202.anInt11765 * -673647059 == aClass622_7228.anInt8118 * 1041246061);
			return true;
		}
		return false;
	}

	public static Class536_Sub18_Sub14 method6535(int i, int i_0_) {
		for (Class536_Sub18_Sub14 class536_sub18_sub14 = (Class536_Sub18_Sub14) aClass4_7174.method562(-681821859); class536_sub18_sub14 != null; class536_sub18_sub14 = (Class536_Sub18_Sub14) aClass4_7174.method567(552998086)) {
			if (class536_sub18_sub14.aBool11773 && class536_sub18_sub14.method10764(i, i_0_, -1310002007))
				return class536_sub18_sub14;
		}
		return null;
	}

	static int method6536(long l) {
		NativeSprite class143 = (NativeSprite) aClass199_7211.method2886(l);
		if (class143 != null)
			return class143.method1720();
		return -1;
	}

	static void method6537(Class174 class174, int i, int i_1_) {
		for (int i_2_ = 0; i_2_ < anInterface12_7167.method71(2062424142); i_2_++)
			anIntArray7189[i_2_ + 1] = method6538(class174, i_2_, i, i_1_);
	}

	static int method6538(Class174 class174, int i, int i_3_, int i_4_) {
		return method6539(anInterface12_7167, class174, i, i_3_, i_4_);
	}

	static int method6539(Interface12 interface12, Class174 class174, int i, int i_5_, int i_6_) {
		Class647 class647 = (Class647) interface12.method70(i, (byte) -19);
		if (class647 == null)
			return 0;
		int i_7_ = class647.anInt8365 * 22125273;
		if (i_7_ >= 0 && class174.method2446(i_7_, -967168777).aBool1820)
			i_7_ = -1;
		int i_8_;
		if (class647.anInt8366 * -1198548799 >= 0) {
			int i_9_ = class647.anInt8366 * -1198548799;
			int i_10_ = (i_9_ & 0x7f) + i_6_;
			if (i_10_ < 0)
				i_10_ = 0;
			else if (i_10_ > 127)
				i_10_ = 127;
			int i_11_ = (i_9_ + i_5_ & 0xfc00) + (i_9_ & 0x380) + i_10_;
			i_8_ = (~0xffffff | (ColourUtils.anIntArray8308[Class254.method3537(Class249.method3454(i_11_, 96, -832367056), 1409175155) & 0xffff]));
		} else if (i_7_ >= 0)
			i_8_ = (~0xffffff | (ColourUtils.anIntArray8308[Class254.method3537(Class249.method3454((class174.method2446(i_7_, -1844114562).aShort1831), 96, -832367056), 1409175155) & 0xffff]));
		else if (class647.anInt8364 * 1648019033 == -1)
			i_8_ = 0;
		else {
			int i_12_ = class647.anInt8364 * 1648019033;
			int i_13_ = (i_12_ & 0x7f) + i_6_;
			if (i_13_ < 0)
				i_13_ = 0;
			else if (i_13_ > 127)
				i_13_ = 127;
			int i_14_ = (i_12_ + i_5_ & 0xfc00) + (i_12_ & 0x380) + i_13_;
			i_8_ = (~0xffffff | (ColourUtils.anIntArray8308[Class254.method3537(Class249.method3454(i_14_, 96, -832367056), 1409175155) & 0xffff]));
		}
		return i_8_;
	}

	static boolean method6540(GraphicalRenderer class167, int i, int i_15_, boolean bool) {
		long l = Class249.method3450(1887945672);
		if (anInt7216 == 0) {
			if (aClass536_Sub18_Sub14_7202.anInt11765 * -673647059 == aClass622_7228.anInt8123 * 1201697905) {
				int i_16_ = aClass461_7183.method5571((aClass536_Sub18_Sub14_7202.aString11763), -1088932749);
				if (aClass536_Sub33_7219 == null)
					aClass536_Sub33_7219 = (new RSByteBuffer(aClass461_7183.method5556(i_16_, 0, (byte) 1)));
				aClass536_Sub33_7182 = aClass536_Sub33_7219;
				aClass536_Sub33_7182.off = 0;
			} else {
				int i_17_ = aClass461_7183.method5571((aClass536_Sub18_Sub14_7202.aString11763), -1880568904);
				aClass536_Sub33_7182 = new RSByteBuffer(aClass461_7183.method5556(i_17_, 0, (byte) 1));
			}
			int i_18_ = aClass536_Sub33_7182.readUnsignedByte();
			anIntArray7221 = new int[i_18_];
			for (int i_19_ = 0; i_19_ < i_18_; i_19_++)
				anIntArray7221[i_19_] = aClass536_Sub33_7182.readUnsignedSmart();
			int i_20_ = aClass536_Sub33_7182.readUnsignedByte();
			anIntArray7209 = new int[i_20_];
			for (int i_21_ = 0; i_21_ < i_20_; i_21_++)
				anIntArray7209[i_21_] = aClass536_Sub33_7182.readUnsignedSmart();
		}
		while (aClass536_Sub33_7182 != null && (aClass536_Sub33_7182.off * -810172525 < aClass536_Sub33_7182.buffer.length) && (!bool || (Class249.method3450(1822579398) < l + (long) anInt7217))) {
			if (aClass536_Sub33_7182.readUnsignedByte() == 0) {
				int i_22_ = aClass536_Sub33_7182.readUnsignedByte();
				int i_23_ = aClass536_Sub33_7182.readUnsignedByte();
				for (int i_24_ = 0; i_24_ < 8; i_24_++) {
					int i_25_ = aClass536_Sub33_7182.readUnsignedByte();
					int i_26_ = i_22_ * 8 + i_24_ - anInt7185 / 8;
					for (int i_27_ = 0; i_27_ < 8; i_27_++) {
						int i_28_ = i_23_ * 8 + i_27_ - anInt7186 / 8;
						aBoolArrayArray7198[i_26_][i_28_] = (i_25_ & 1 << i_27_) != 0;
					}
				}
				for (int i_29_ = 0; i_29_ < 64; i_29_++) {
					for (int i_30_ = 0; i_30_ < 64; i_30_++) {
						int i_31_ = i_22_ * 64 + i_29_ - anInt7185;
						int i_32_ = i_23_ * 64 + i_30_ - anInt7186;
						method6541(class167, aClass536_Sub33_7182, i_22_, i_23_, i_31_, i_32_, anIntArray7221, anIntArray7209);
					}
				}
			} else {
				int i_33_ = aClass536_Sub33_7182.readUnsignedByte();
				int i_34_ = aClass536_Sub33_7182.readUnsignedByte();
				int i_35_ = aClass536_Sub33_7182.readUnsignedByte();
				int i_36_ = aClass536_Sub33_7182.readUnsignedByte();
				aBoolArrayArray7198[i_33_ * 8 + i_35_ - anInt7185 / 8][i_34_ * 8 + i_36_ - anInt7186 / 8] = aClass536_Sub33_7182.readUnsignedByte() != 0;
				for (int i_37_ = 0; i_37_ < 8; i_37_++) {
					for (int i_38_ = 0; i_38_ < 8; i_38_++) {
						int i_39_ = i_33_ * 64 + i_35_ * 8 + i_37_ - anInt7185;
						int i_40_ = i_34_ * 64 + i_36_ * 8 + i_38_ - anInt7186;
						method6541(class167, aClass536_Sub33_7182, i_33_, i_34_, i_39_, i_40_, anIntArray7221, anIntArray7209);
					}
				}
			}
		}
		if (aClass536_Sub33_7182 != null) {
			anInt7216 = aClass536_Sub33_7182.off * -810172525;
			if (aClass536_Sub33_7182.off * -810172525 < aClass536_Sub33_7182.buffer.length)
				return false;
		}
		aClass536_Sub33_7182 = null;
		anIntArray7209 = null;
		anIntArray7221 = null;
		if (aShortArray7229 != null) {
			aByteArray7173 = new byte[anInt7187 * anInt7188];
			aShortArray7214 = new short[anInt7187 * anInt7188];
			for (int i_41_ = 0; i_41_ < 3; i_41_++) {
				short[] is = new short[anInt7187 * anInt7188];
				for (int i_42_ = 0; i_42_ < aHashMapArrayArrayArray7208[i_41_].length; i_42_++) {
					for (int i_43_ = 0; i_43_ < aHashMapArrayArrayArray7208[i_41_][0].length; i_43_++) {
						HashMap hashmap = aHashMapArrayArrayArray7208[i_41_][i_42_][i_43_];
						if (hashmap != null) {
							Iterator iterator = hashmap.values().iterator();
							while (iterator.hasNext()) {
								Class531 class531 = (Class531) iterator.next();
								is[(i_42_ * 64 + class531.aByte7114 + ((i_43_ * 64 + class531.aByte7115) * anInt7187))] = (short) class531.anInt7116;
							}
						}
					}
				}
				method6577(is, aByteArray7173, aShortArray7214, i, i_15_);
				for (int i_44_ = 0; i_44_ < aHashMapArrayArrayArray7208[i_41_].length; i_44_++) {
					for (int i_45_ = 0; i_45_ < aHashMapArrayArrayArray7208[i_41_][0].length; i_45_++) {
						HashMap hashmap = aHashMapArrayArrayArray7208[i_41_][i_44_][i_45_];
						if (hashmap != null) {
							Iterator iterator = hashmap.values().iterator();
							while (iterator.hasNext()) {
								Class531 class531 = (Class531) iterator.next();
								int i_46_ = (i_44_ * 64 + class531.aByte7114 + ((i_45_ * 64 + class531.aByte7115) * anInt7187));
								class531.anInt7116 = ((aByteArray7173[i_46_] & 0xff) << 16 | aShortArray7214[i_46_] & 0xffff);
								if (class531.anInt7116 != 0)
									class531.anInt7116 |= ~0xffffff;
							}
						}
					}
				}
			}
			method6577(aShortArray7229, aByteArray7173, aShortArray7214, i, i_15_);
			aShortArray7229 = null;
		}
		if (!bool || Class249.method3450(2020772688) < l + (long) anInt7217) {
			method6542();
			return true;
		}
		return false;
	}

	static void method6541(GraphicalRenderer class167, RSByteBuffer class536_sub33, int i, int i_47_, int i_48_, int i_49_, int[] is, int[] is_50_) {
		int i_51_ = class536_sub33.readUnsignedByte();
		if ((i_51_ & 0x1) == 0) {
			boolean bool = (i_51_ & 0x2) == 0;
			int i_52_ = i_51_ >> 2 & 0x3f;
			if (i_52_ != 62) {
				if (i_52_ == 63)
					i_52_ = class536_sub33.readUnsignedSmart();
				else if (bool)
					i_52_ = is[i_52_];
				else
					i_52_ = is_50_[i_52_];
				if (bool) {
					aShortArray7229[i_48_ + i_49_ * anInt7187] = (short) i_52_;
					aShortArray7193[i_48_ + i_49_ * anInt7187] = (short) 0;
				} else {
					aShortArray7193[i_48_ + i_49_ * anInt7187] = (short) i_52_;
					aByteArray7194[i_48_ + i_49_ * anInt7187] = (byte) 0;
					aShortArray7229[i_48_ + i_49_ * anInt7187] = (short) class536_sub33.readUnsignedSmart();
				}
			}
		} else {
			int i_53_ = (i_51_ >> 1 & 0x3) + 1;
			boolean bool = (i_51_ & 0x8) != 0;
			boolean bool_54_ = (i_51_ & 0x10) != 0;
			for (int i_55_ = 0; i_55_ < i_53_; i_55_++) {
				int i_56_ = class536_sub33.readUnsignedSmart();
				int i_57_ = 0;
				int i_58_ = 0;
				if (bool) {
					i_57_ = class536_sub33.readUnsignedSmart();
					i_58_ = class536_sub33.readUnsignedByte();
				}
				int i_59_ = 0;
				if (bool_54_)
					i_59_ = class536_sub33.readUnsignedByte();
				if (i_55_ == 0) {
					aShortArray7229[i_48_ + i_49_ * anInt7187] = (short) i_56_;
					aShortArray7193[i_48_ + i_49_ * anInt7187] = (short) i_57_;
					aByteArray7194[i_48_ + i_49_ * anInt7187] = (byte) i_58_;
					if (i_59_ == 1) {
						anObjectArray7195[i_48_ + i_49_ * anInt7187] = new Integer(class536_sub33.readBigSmart());
						aByteArray7191[i_48_ + i_49_ * anInt7187] = class536_sub33.readByte();
					} else if (i_59_ > 1) {
						int[] is_60_ = new int[i_59_];
						byte[] is_61_ = new byte[i_59_];
						for (int i_62_ = 0; i_62_ < i_59_; i_62_++) {
							is_60_[i_62_] = class536_sub33.readBigSmart();
							is_61_[i_62_] = class536_sub33.readByte();
						}
						anObjectArray7195[i_48_ + i_49_ * anInt7187] = new Class536_Sub29(is_60_, is_61_);
					}
				} else {
					int[] is_63_ = null;
					byte[] is_64_ = null;
					if (i_59_ > 0) {
						is_63_ = new int[i_59_];
						is_64_ = new byte[i_59_];
						for (int i_65_ = 0; i_65_ < i_59_; i_65_++) {
							is_63_[i_65_] = class536_sub33.readBigSmart();
							is_64_[i_65_] = class536_sub33.readByte();
						}
					}
					if ((aHashMapArrayArrayArray7208[i_55_ - 1][i - (anInt7185 >> 6)][i_47_ - (anInt7186 >> 6)]) == null)
						aHashMapArrayArrayArray7208[i_55_ - 1][i - (anInt7185 >> 6)][i_47_ - (anInt7186 >> 6)] = new HashMap();
					int i_66_ = ((i_48_ & 0x3f) << 8) + (i_49_ & 0x3f);
					Class531 class531 = new Class531(i_48_ & 0x3f, i_49_ & 0x3f, i_56_, i_57_, i_58_, is_63_, is_64_);
					aHashMapArrayArrayArray7208[i_55_ - 1][i - (anInt7185 >> 6)][i_47_ - (anInt7186 >> 6)].put(Integer.valueOf(i_66_), class531);
				}
			}
		}
	}

	static void method6542() {
		for (int i = 0; i < anInt7187; i++) {
			for (int i_67_ = 0; i_67_ < anInt7188; i_67_++) {
				Object object = anObjectArray7195[i + i_67_ * anInt7187];
				if (object != null) {
					if (object instanceof Class536_Sub29) {
						Class536_Sub29 class536_sub29 = (Class536_Sub29) object;
						if (class536_sub29 != null) {
							for (int i_68_ = 0; i_68_ < class536_sub29.anIntArray10562.length; i_68_++) {
								ObjTypeDecoder class612 = ((ObjTypeDecoder) (aClass34_Sub17_7165.method70(class536_sub29.anIntArray10562[i_68_], (byte) -31)));
								int i_69_ = class612.anInt7994 * -876565287;
								if (class612.anIntArray7988 != null) {
									class612 = (class612.method7293(anInterface20_7169, anInterface18_7163, (byte) 53));
									if (class612 != null)
										i_69_ = class612.anInt7994 * -876565287;
								}
								if (i_69_ != -1) {
									Class536_Sub41 class536_sub41 = new Class536_Sub41(i_69_);
									class536_sub41.anInt10794 = i * 749779519;
									class536_sub41.anInt10796 = i_67_ * -1881922211;
									aClass708_7218.method8335(class536_sub41, 442944696);
								}
							}
						}
					} else {
						Integer integer = (Integer) object;
						ObjTypeDecoder class612 = ((ObjTypeDecoder) aClass34_Sub17_7165.method70(integer.intValue(), (byte) -75));
						int i_70_ = class612.anInt7994 * -876565287;
						if (class612.anIntArray7988 != null) {
							class612 = class612.method7293(anInterface20_7169, anInterface18_7163, (byte) 49);
							if (class612 != null)
								i_70_ = class612.anInt7994 * -876565287;
						}
						if (i_70_ != -1) {
							Class536_Sub41 class536_sub41 = new Class536_Sub41(i_70_);
							class536_sub41.anInt10794 = i * 749779519;
							class536_sub41.anInt10796 = i_67_ * -1881922211;
							aClass708_7218.method8335(class536_sub41, -2028069109);
						}
					}
				}
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int i_71_ = 0; i_71_ < aHashMapArrayArrayArray7208[0].length; i_71_++) {
				for (int i_72_ = 0; i_72_ < aHashMapArrayArrayArray7208[0][0].length; i_72_++) {
					HashMap hashmap = aHashMapArrayArrayArray7208[i][i_71_][i_72_];
					if (hashmap != null) {
						Iterator iterator = hashmap.values().iterator();
						while (iterator.hasNext()) {
							Class531 class531 = (Class531) iterator.next();
							if (class531.anIntArray7119 != null) {
								for (int i_73_ = 0; i_73_ < class531.anIntArray7119.length; i_73_++) {
									ObjTypeDecoder class612 = ((ObjTypeDecoder) (aClass34_Sub17_7165.method70(class531.anIntArray7119[i_73_], (byte) -56)));
									int i_74_ = class612.anInt7994 * -876565287;
									if (class612.anIntArray7988 != null) {
										class612 = (class612.method7293(anInterface20_7169, anInterface18_7163, (byte) 116));
										if (class612 != null)
											i_74_ = (class612.anInt7994 * -876565287);
									}
									if (i_74_ != -1) {
										Class536_Sub41 class536_sub41 = new Class536_Sub41(i_74_);
										class536_sub41.anInt10794 = ((i_71_ + (anInt7185 >> 6)) * 64 + class531.aByte7114 - anInt7185) * 749779519;
										class536_sub41.anInt10796 = ((i_72_ + (anInt7186 >> 6)) * 64 + class531.aByte7115 - anInt7186) * -1881922211;
										aClass708_7218.method8335(class536_sub41, -162985293);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	static void method6543() {
		int[] is = new int[3];
		for (int i = 0; i < aClass543_7192.anInt7234 * -1605869619; i++) {
			boolean bool = (aClass536_Sub18_Sub14_7202.method10767(aClass543_7192.anIntArray7235[i] >> 28 & 0x3, aClass543_7192.anIntArray7235[i] >> 14 & 0x3fff, aClass543_7192.anIntArray7235[i] & 0x3fff, is, (byte) 5));
			if (bool) {
				Class536_Sub41 class536_sub41 = new Class536_Sub41(aClass543_7192.anIntArray7236[i]);
				class536_sub41.anInt10794 = (is[1] - anInt7185) * 749779519;
				class536_sub41.anInt10796 = (is[2] - anInt7186) * -1881922211;
				aClass708_7218.method8335(class536_sub41, -1437678609);
			}
		}
	}

	static void method6544(GraphicalRenderer class167, Class536_Sub41 class536_sub41, Class248 class248) {
		if (class248.anIntArray2497 != null) {
			int[] is = new int[class248.anIntArray2497.length];
			for (int i = 0; i < is.length / 2; i++) {
				int i_75_ = (class248.anIntArray2497[i * 2] + class536_sub41.anInt10794 * 753546687);
				int i_76_ = (class248.anIntArray2497[i * 2 + 1] + class536_sub41.anInt10796 * 1902597877);
				is[i * 2] = anInt7227 + ((anInt7190 - anInt7227) * (i_75_ - anInt7184) / (anInt7206 - anInt7184));
				is[i * 2 + 1] = anInt7230 - ((anInt7230 - anInt7199) * (i_76_ - anInt7226) / (anInt7224 - anInt7226));
			}
			Class165.method1984(class167, is, class248.anInt2509 * -913229803);
			if (class248.anInt2512 * -36359057 > 0) {
				for (int i = 0; i < is.length / 2 - 1; i++) {
					int i_77_ = is[i * 2];
					int i_78_ = is[i * 2 + 1];
					int i_79_ = is[(i + 1) * 2];
					int i_80_ = is[(i + 1) * 2 + 1];
					if (i_79_ < i_77_) {
						int i_81_ = i_77_;
						int i_82_ = i_78_;
						i_77_ = i_79_;
						i_78_ = i_80_;
						i_79_ = i_81_;
						i_80_ = i_82_;
					} else if (i_79_ == i_77_ && i_80_ < i_78_) {
						int i_83_ = i_78_;
						i_78_ = i_80_;
						i_80_ = i_83_;
					}
					class167.method2069(i_77_, i_78_, i_79_, i_80_, (class248.anIntArray2519[class248.aByteArray2521[i] & 0xff]), 1, class248.anInt2512 * -36359057, class248.anInt2513 * -1062329099, class248.anInt2514 * 365345513);
				}
				int i = is[is.length - 2];
				int i_84_ = is[is.length - 1];
				int i_85_ = is[0];
				int i_86_ = is[1];
				if (i_85_ < i) {
					int i_87_ = i;
					int i_88_ = i_84_;
					i = i_85_;
					i_84_ = i_86_;
					i_85_ = i_87_;
					i_86_ = i_88_;
				} else if (i_85_ == i && i_86_ < i_84_) {
					int i_89_ = i_84_;
					i_84_ = i_86_;
					i_86_ = i_89_;
				}
				class167.method2069(i, i_84_, i_85_, i_86_, (class248.anIntArray2519[((class248.aByteArray2521[class248.aByteArray2521.length - 1]) & 0xff)]), 1, class248.anInt2512 * -36359057, class248.anInt2513 * -1062329099, class248.anInt2514 * 365345513);
			} else {
				for (int i = 0; i < is.length / 2 - 1; i++)
					class167.method2060(is[i * 2], is[i * 2 + 1], is[(i + 1) * 2], is[(i + 1) * 2 + 1], (class248.anIntArray2519[class248.aByteArray2521[i] & 0xff]), -1892778525);
				class167.method2060(is[is.length - 2], is[is.length - 1], is[0], is[1], (class248.anIntArray2519[((class248.aByteArray2521[class248.aByteArray2521.length - 1]) & 0xff)]), -1182787523);
			}
		}
	}

	static void method6545(int[] is, int i, int i_90_, int i_91_, int i_92_, int i_93_, int i_94_, int i_95_, int i_96_, byte[] is_97_, int i_98_, int i_99_) {
		int i_100_ = 0;
		int i_101_ = 0;
		int i_102_ = i_90_ - i + 1;
		int i_103_ = i_92_ - i_91_ + 1;
		int i_104_ = (i_98_ << 16) / i_102_;
		int i_105_ = (is_97_.length / i_98_ << 16) / i_103_;
		int i_106_ = i + (i_94_ - i_92_ - 1) * i_93_;
		int i_107_ = i_95_ >> 24;
		int i_108_ = i_96_ >> 24;
		if (i_99_ == 0 || i_99_ == 1 && i_107_ == 255 && i_108_ == 255) {
			int i_109_ = i_100_;
			for (int i_110_ = -i_103_; i_110_ < 0; i_110_++) {
				int i_111_ = (i_101_ >> 16) * i_98_;
				for (int i_112_ = -i_102_; i_112_ < 0; i_112_++) {
					if (is_97_[(i_100_ >> 16) + i_111_] != 0)
						is[i_106_++] = i_96_;
					else
						is[i_106_++] = i_95_;
					i_100_ += i_104_;
				}
				i_101_ += i_105_;
				i_100_ = i_109_;
				i_106_ += i_93_ - i_102_;
			}
		} else if (i_99_ == 1) {
			int i_113_ = i_100_;
			for (int i_114_ = -i_103_; i_114_ < 0; i_114_++) {
				int i_115_ = (i_101_ >> 16) * i_98_;
				for (int i_116_ = -i_102_; i_116_ < 0; i_116_++) {
					int i_117_ = i_95_;
					if (is_97_[(i_100_ >> 16) + i_115_] != 0)
						i_117_ = i_96_;
					int i_118_ = i_117_ >>> 24;
					int i_119_ = 255 - i_118_;
					int i_120_ = is[i_106_];
					is[i_106_++] = ~0xffffff | ((((i_117_ & 0xff00ff) * i_118_ + (i_120_ & 0xff00ff) * i_119_) & ~0xff00ff) + (((i_117_ & 0xff00) * i_118_ + (i_120_ & 0xff00) * i_119_) & 0xff0000)) >> 8;
					i_100_ += i_104_;
				}
				i_101_ += i_105_;
				i_100_ = i_113_;
				i_106_ += i_93_ - i_102_;
			}
		} else
			throw new IllegalArgumentException();
	}

	static void method6546(GraphicalRenderer class167, int i, int i_121_, int i_122_, int i_123_) {
		NativeSprite class143 = (NativeSprite) aClass199_7211.method2886(-1L);
		if (class143 == null || class143.method1720() != i_122_) {
			int i_124_;
			if (aClass536_Sub18_Sub14_7202.anInt11762 * -696786317 != -1)
				i_124_ = ~0xffffff | (aClass536_Sub18_Sub14_7202.anInt11762 * -696786317);
			else
				i_124_ = -16777216;
			if (anIntArray7215 == null || anIntArray7215.length != i_122_ * i_122_)
				anIntArray7215 = new int[i_122_ * i_122_];
			Arrays.fill(anIntArray7215, i_124_);
			class143 = class167.method2080(anIntArray7215, 0, i_122_, i_122_, i_122_, true);
			aClass199_7211.method2881(class143, -1L);
		}
		aClass199_7211.method2881(class143, (long) i_123_);
	}

	static void method6547(int i, int i_125_, int i_126_, int i_127_, boolean bool, boolean bool_128_, boolean bool_129_, GraphicalRenderer class167) {
		int i_130_ = i * 64;
		int i_131_ = i_125_ * 64;
		if (anIntArray7215 == null || anIntArray7215.length != i_126_ * i_126_)
			anIntArray7215 = new int[i_126_ * i_126_];
		boolean bool_132_ = aBool7197 && !bool_129_;
		for (int i_133_ = 0; i_133_ < 64; i_133_++) {
			int i_134_ = i_130_ + i_133_;
			int i_135_ = i_133_ * i_126_ / 64;
			int i_136_ = (i_133_ + 1) * i_126_ / 64 - 1;
			if (i_136_ < i_135_)
				i_136_ = i_135_;
			for (int i_137_ = 0; i_137_ < 64; i_137_++) {
				int i_138_ = i_131_ + i_137_;
				boolean bool_139_ = bool;
				if (bool_132_ && !method6552(i_134_, i_138_))
					bool_139_ = false;
				int i_140_ = i_134_ + i_138_ * anInt7187;
				boolean bool_141_ = false;
				boolean bool_142_ = false;
				Object object = null;
				int i_143_ = ((aByteArray7173[i_140_] & 0xff) << 16 | aShortArray7214[i_140_] & 0xffff);
				if (i_143_ != 0)
					i_143_ |= ~0xffffff;
				short i_144_ = aShortArray7193[i_140_];
				object = anObjectArray7195[i_140_];
				int i_145_ = i_137_ * i_126_ / 64;
				int i_146_ = (i_137_ + 1) * i_126_ / 64 - 1;
				if (i_146_ < i_145_)
					i_146_ = i_145_;
				if (object != null) {
					if (object instanceof Class536_Sub29) {
						Class536_Sub29 class536_sub29 = (Class536_Sub29) object;
						if (class536_sub29 != null)
							method6576(anIntArray7215, i_135_, i_136_, i_145_, i_146_, i_126_, bool_139_, i_143_, i_144_, aByteArray7194[i_140_], class536_sub29.anIntArray10562, class536_sub29.aByteArray10563, true);
					} else {
						Integer integer = (Integer) object;
						anIntArray7210[0] = integer.intValue();
						aByteArray7180[0] = aByteArray7191[i_140_];
						method6576(anIntArray7215, i_135_, i_136_, i_145_, i_146_, i_126_, bool_139_, i_143_, i_144_, aByteArray7194[i_140_], anIntArray7210, aByteArray7180, true);
					}
				} else
					method6576(anIntArray7215, i_135_, i_136_, i_145_, i_146_, i_126_, bool_139_, i_143_, i_144_, aByteArray7194[i_140_], null, null, true);
			}
		}
		if (bool_128_) {
			for (int i_147_ = 0; i_147_ < 64; i_147_++) {
				int i_148_ = i_130_ + i_147_;
				boolean bool_149_ = i_147_ == 0 && i_148_ != 0;
				for (int i_150_ = 0; i_150_ < 64; i_150_++) {
					int i_151_ = i_131_ + i_150_;
					if (!bool_132_ || method6552(i_148_, i_151_)) {
						boolean bool_152_ = i_150_ == 0 && i_151_ != 0;
						int i_153_ = i_148_ + i_151_ * anInt7187;
						if (bool_149_ && bool_152_)
							method6549(class167, anIntArray7215, i_126_, -1, -1, i_148_ - 1, i_151_ - 1, i_153_ - 1 - anInt7187);
						if (bool_149_)
							method6549(class167, anIntArray7215, i_126_, -1, i_150_, i_148_ - 1, i_151_, i_153_ - 1);
						if (bool_152_)
							method6549(class167, anIntArray7215, i_126_, i_147_, -1, i_148_, i_151_ - 1, i_153_ - anInt7187);
						method6549(class167, anIntArray7215, i_126_, i_147_, i_150_, i_148_, i_151_, i_153_);
					}
				}
			}
		}
		int i_154_ = i * 64 / 64;
		int i_155_ = i_125_ * 64 / 64;
		for (int i_156_ = 0; i_156_ < 3; i_156_++) {
			for (int i_157_ = 0; i_157_ < 64; i_157_++) {
				int i_158_ = i_130_ + i_157_;
				int i_159_ = i_158_ & 0x3f;
				int i_160_ = i_157_ * i_126_ / 64;
				int i_161_ = (i_157_ + 1) * i_126_ / 64 - 1;
				if (i_161_ < i_160_)
					i_161_ = i_160_;
				for (int i_162_ = 0; i_162_ < 64; i_162_++) {
					int i_163_ = i_131_ + i_162_;
					boolean bool_164_ = bool;
					if (bool_132_ && !method6552(i_158_, i_163_))
						bool_164_ = false;
					int i_165_ = i_163_ & 0x3f;
					int i_166_ = i_162_ * i_126_ / 64;
					int i_167_ = (i_162_ + 1) * i_126_ / 64 - 1;
					if (i_167_ < i_166_)
						i_167_ = i_166_;
					HashMap hashmap = aHashMapArrayArrayArray7208[i_156_][i_154_][i_155_];
					if (hashmap != null) {
						Class531 class531 = ((Class531) hashmap.get(Integer.valueOf((i_159_ << 8) + i_165_)));
						if (class531 != null)
							method6576(anIntArray7215, i_160_, i_161_, i_166_, i_167_, i_126_, bool_164_, class531.anInt7116, class531.aShort7117, class531.aByte7118, class531.anIntArray7119, class531.aByteArray7120, false);
					}
				}
			}
			for (int i_168_ = 0; i_168_ < 64; i_168_++) {
				int i_169_ = i_130_ + i_168_;
				int i_170_ = i_169_ & 0x3f;
				for (int i_171_ = 0; i_171_ < 64; i_171_++) {
					int i_172_ = i_131_ + i_171_;
					if (!bool_132_ || method6552(i_169_, i_172_)) {
						int i_173_ = i_172_ & 0x3f;
						HashMap hashmap = (aHashMapArrayArrayArray7208[i_156_][i_154_][i_155_]);
						if (hashmap != null) {
							Class531 class531 = ((Class531) hashmap.get(Integer.valueOf((i_170_ << 8) + i_173_)));
							if (class531 != null)
								method6550(class167, anIntArray7215, i_126_, i_168_, i_171_, class531.anIntArray7119, class531.aByteArray7120);
						}
					}
				}
			}
		}
		if (bool_132_) {
			int i_174_ = 8;
			for (int i_175_ = 0; i_175_ < i_174_; i_175_++) {
				int i_176_ = i_130_ + i_175_ * 8;
				int i_177_ = i_175_ * i_126_ / i_174_;
				int i_178_ = (i_175_ + 1) * i_126_ / i_174_ - 1;
				for (int i_179_ = 0; i_179_ < i_174_; i_179_++) {
					int i_180_ = i_131_ + i_179_ * 8;
					if (!method6552(i_176_, i_180_)) {
						int i_181_ = i_179_ * i_126_ / i_174_;
						int i_182_ = (i_179_ + 1) * i_126_ / i_174_ - 1;
						if (i_126_ < 64)
							method6557(anIntArray7215, i_177_, i_178_, i_181_, i_182_, i_126_);
						else {
							aBoolArray7233[anInt7200] = method6552(i_176_, i_180_ + 8);
							aBoolArray7233[anInt7201] = method6552(i_176_ + 8, i_180_ + 8);
							aBoolArray7233[anInt7172] = method6552(i_176_ + 8, i_180_);
							aBoolArray7233[anInt7203] = method6552(i_176_ + 8, i_180_ - 8);
							aBoolArray7233[anInt7204] = method6552(i_176_, i_180_ - 8);
							aBoolArray7233[anInt7205] = method6552(i_176_ - 8, i_180_ - 8);
							aBoolArray7233[anInt7196] = method6552(i_176_ - 8, i_180_);
							aBoolArray7233[anInt7207] = method6552(i_176_ - 8, i_180_ + 8);
							method6554(anIntArray7215, i_177_, i_178_, i_181_, i_182_, i_126_);
						}
					}
				}
			}
		}
		aClass199_7211.method2881(class167.method2080(anIntArray7215, 0, i_126_, i_126_, i_126_, true), (long) i_127_);
	}

	static void method6548(GraphicalRenderer class167, boolean bool, boolean bool_183_, boolean bool_184_, boolean bool_185_) {
		int i = anInt7206 - anInt7184;
		int i_186_ = anInt7224 - anInt7226;
		int i_187_ = (anInt7190 - anInt7227 << 16) / i;
		int i_188_ = (anInt7230 - anInt7199 << 16) / i_186_;
		method6566(class167, bool, bool_183_, i_187_, i_188_, 0, 0, bool_184_, bool_185_);
	}

	static void method6549(GraphicalRenderer class167, int[] is, int i, int i_189_, int i_190_, int i_191_, int i_192_, int i_193_) {
		Object object = anObjectArray7195[i_193_];
		if (object != null) {
			if (object instanceof Class536_Sub29) {
				Class536_Sub29 class536_sub29 = (Class536_Sub29) object;
				if (class536_sub29 != null)
					method6550(class167, is, i, i_189_, i_190_, class536_sub29.anIntArray10562, class536_sub29.aByteArray10563);
			} else {
				Integer integer = (Integer) object;
				anIntArray7210[0] = integer.intValue();
				aByteArray7180[0] = aByteArray7191[i_191_ + i_192_ * anInt7187];
				method6550(class167, is, i, i_189_, i_190_, anIntArray7210, aByteArray7180);
			}
		}
	}

	static void method6550(GraphicalRenderer class167, int[] is, int i, int i_194_, int i_195_, int[] is_196_, byte[] is_197_) {
		if (is_196_ != null) {
			for (int i_198_ = 0; i_198_ < is_196_.length; i_198_++) {
				ObjTypeDecoder class612 = (ObjTypeDecoder) aClass34_Sub17_7165.method70(is_196_[i_198_], (byte) -29);
				int i_199_ = class612.anInt7941 * -1070948127;
				if (i_199_ != -1) {
					Class56 class56 = ((Class56) aClass34_Sub1_7223.method70(i_199_, (byte) -92));
					NativeSprite class143 = class56.method958(class167, (class612.aBool7970 ? is_197_[i_198_] >> 6 & 0x3 : 0), (class612.aBool7972 ? class612.aBool7973 : false), (short) -1090);
					int[] is_200_ = class56.method959(class167, (class612.aBool7970 ? is_197_[i_198_] >> 6 & 0x3 : 0), (class612.aBool7972 ? class612.aBool7973 : false), 1949331366);
					if (class143 != null) {
						int i_201_ = class143.method12();
						int i_202_ = class143.method1785();
						int i_203_ = i * i_201_ / 64 >> 2;
						int i_204_ = i * i_202_ / 64 >> 2;
						if (class56.aBool607) {
							int i_205_ = class612.anInt8002 * -1981381335;
							int i_206_ = class612.anInt7980 * -90266503;
							if ((is_197_[i_198_] >> 6 & 0x1) == 1) {
								int i_207_ = i_205_;
								i_205_ = i_206_;
								i_206_ = i_207_;
							}
							i_203_ = i_205_ * i / 64;
							i_204_ = i_206_ * i / 64;
						}
						if (i_203_ != 0 && i_204_ != 0) {
							int i_208_ = i_194_ * i / 64;
							int i_209_ = (64 - i_195_) * i / 64 - i_204_ + 1;
							for (int i_210_ = 0; i_210_ < i_203_; i_210_++) {
								int i_211_ = i_210_ + i_208_;
								if (i_211_ >= 0) {
									if (i_211_ >= i)
										break;
									for (int i_212_ = 0; i_212_ < i_204_; i_212_++) {
										int i_213_ = i_212_ + i_209_;
										if (i_213_ >= 0) {
											if (i_213_ >= i)
												break;
											int i_214_ = (is_200_[(i_210_ * i_201_ / i_203_ + i_201_ * (i_212_ * i_202_ / i_204_))]);
											int i_215_ = i_214_ >> 24 & 0xff;
											if (i_215_ != 0)
												is[i_211_ + i * i_213_] = i_214_;
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

	static void method6551(GraphicalRenderer class167, Class536_Sub41 class536_sub41, int i, int i_216_, int i_217_, int i_218_) {
		class536_sub41.anInt10797 = (anInt7227 + (i_217_ + i * (class536_sub41.anInt10794 * 753546687 - anInt7184) >> 16)) * -535104715;
		class536_sub41.anInt10798 = (anInt7230 - (i_218_ + i_216_ * (class536_sub41.anInt10796 * 1902597877 - anInt7226) >> 16)) * 535607753;
	}

	static boolean method6552(int i, int i_219_) {
		int i_220_ = i >> 3;
		int i_221_ = i_219_ >> 3;
		if (i_220_ < 0 || i_221_ < 0 || i_220_ >= aBoolArrayArray7198.length || i_221_ >= aBoolArrayArray7198[i_220_].length)
			return false;
		return aBoolArrayArray7198[i_220_][i_221_];
	}

	static void method6553() {
		aShortArray7229 = new short[anInt7187 * anInt7188];
		aShortArray7193 = new short[anInt7187 * anInt7188];
		aByteArray7194 = new byte[anInt7187 * anInt7188];
		anObjectArray7195 = new Object[anInt7187 * anInt7188];
		aByteArray7191 = new byte[anInt7187 * anInt7188];
		aHashMapArrayArrayArray7208 = new HashMap[3][anInt7187 >> 6][anInt7188 >> 6];
		anIntArray7189 = new int[anInterface12_7167.method71(1587249254) + 1];
		aBoolArrayArray7198 = new boolean[anInt7187 / 8][anInt7188 / 8];
	}

	static void method6554(int[] is, int i, int i_222_, int i_223_, int i_224_, int i_225_) {
		int i_226_ = aClass622_7228.anInt8119 * -1228656737 >> 24 & 0xff;
		int i_227_ = 255 - i_226_;
		if ((!aBoolArray7233[anInt7200] || !aBoolArray7233[anInt7172] && !aBoolArray7233[anInt7196]) && (!aBoolArray7233[anInt7204] || !aBoolArray7233[anInt7172] && !aBoolArray7233[anInt7196])) {
			method6558(is, i, i_222_, i_223_, i_224_, i_225_, i_226_, i_227_, true, true, true, true);
			if (aBoolArray7233[anInt7201]) {
				is[(i_225_ - i_224_ - 1) * i_225_ + i_222_] = aClass622_7228.anInt8120 * 782501683;
				is[(i_225_ - i_224_) * i_225_ + i_222_] = aClass622_7228.anInt8120 * 782501683;
				is[(i_225_ - i_224_ - 1) * i_225_ + i_222_ - 1] = aClass622_7228.anInt8120 * 782501683;
			}
			if (aBoolArray7233[anInt7203]) {
				is[(i_225_ - i_223_ - 1) * i_225_ + i_222_] = aClass622_7228.anInt8120 * 782501683;
				is[(i_225_ - i_223_ - 2) * i_225_ + i_222_] = aClass622_7228.anInt8120 * 782501683;
				is[(i_225_ - i_223_ - 1) * i_225_ + i_222_ - 1] = aClass622_7228.anInt8120 * 782501683;
			}
			if (aBoolArray7233[anInt7205]) {
				is[(i_225_ - i_223_ - 1) * i_225_ + i] = aClass622_7228.anInt8120 * 782501683;
				is[(i_225_ - i_223_ - 2) * i_225_ + i] = aClass622_7228.anInt8120 * 782501683;
				is[(i_225_ - i_223_ - 1) * i_225_ + i + 1] = aClass622_7228.anInt8120 * 782501683;
			}
			if (aBoolArray7233[anInt7207]) {
				is[(i_225_ - i_224_ - 1) * i_225_ + i] = aClass622_7228.anInt8120 * 782501683;
				is[(i_225_ - i_224_) * i_225_ + i] = aClass622_7228.anInt8120 * 782501683;
				is[(i_225_ - i_224_ - 1) * i_225_ + i + 1] = aClass622_7228.anInt8120 * 782501683;
			}
		} else {
			if (aBoolArray7233[anInt7200] && aBoolArray7233[anInt7172])
				method6559(is, i_222_ - aClass622_7228.anInt8122 * 1388986437 + 1, i_224_ - aClass622_7228.anInt8122 * 1388986437 + 1, i_225_, i_226_, i_227_, anInt7201);
			else {
				method6558(is, i_222_ - aClass622_7228.anInt8122 * 1388986437 + 1, i_222_, i_224_ - aClass622_7228.anInt8122 * 1388986437 + 1, i_224_, i_225_, i_226_, i_227_, true, true, false, false);
				if (aBoolArray7233[anInt7201]) {
					is[(i_225_ - i_224_ - 1) * i_225_ + i_222_] = aClass622_7228.anInt8120 * 782501683;
					is[(i_225_ - i_224_) * i_225_ + i_222_] = aClass622_7228.anInt8120 * 782501683;
					is[(i_225_ - i_224_ - 1) * i_225_ + i_222_ - 1] = aClass622_7228.anInt8120 * 782501683;
				}
			}
			if (aBoolArray7233[anInt7204] && aBoolArray7233[anInt7172])
				method6559(is, i_222_ - aClass622_7228.anInt8122 * 1388986437 + 1, i_223_, i_225_, i_226_, i_227_, anInt7203);
			else {
				method6558(is, i_222_ - aClass622_7228.anInt8122 * 1388986437 + 1, i_222_, i_223_, i_223_ + aClass622_7228.anInt8122 * 1388986437 - 1, i_225_, i_226_, i_227_, false, true, true, false);
				if (aBoolArray7233[anInt7203]) {
					is[(i_225_ - i_223_ - 1) * i_225_ + i_222_] = aClass622_7228.anInt8120 * 782501683;
					is[(i_225_ - i_223_ - 2) * i_225_ + i_222_] = aClass622_7228.anInt8120 * 782501683;
					is[(i_225_ - i_223_ - 1) * i_225_ + i_222_ - 1] = aClass622_7228.anInt8120 * 782501683;
				}
			}
			if (aBoolArray7233[anInt7204] && aBoolArray7233[anInt7196])
				method6559(is, i, i_223_, i_225_, i_226_, i_227_, anInt7205);
			else {
				method6558(is, i, i + aClass622_7228.anInt8122 * 1388986437 - 1, i_223_, i_223_ + aClass622_7228.anInt8122 * 1388986437 - 1, i_225_, i_226_, i_227_, false, false, true, true);
				if (aBoolArray7233[anInt7205]) {
					is[(i_225_ - i_223_ - 1) * i_225_ + i] = aClass622_7228.anInt8120 * 782501683;
					is[(i_225_ - i_223_ - 2) * i_225_ + i] = aClass622_7228.anInt8120 * 782501683;
					is[(i_225_ - i_223_ - 1) * i_225_ + i + 1] = aClass622_7228.anInt8120 * 782501683;
				}
			}
			if (aBoolArray7233[anInt7200] && aBoolArray7233[anInt7196])
				method6559(is, i, i_224_ - aClass622_7228.anInt8122 * 1388986437 + 1, i_225_, i_226_, i_227_, anInt7207);
			else {
				method6558(is, i, i + aClass622_7228.anInt8122 * 1388986437 - 1, i_224_ - aClass622_7228.anInt8122 * 1388986437 + 1, i_224_, i_225_, i_226_, i_227_, true, false, false, true);
				if (aBoolArray7233[anInt7207]) {
					is[(i_225_ - i_224_ - 1) * i_225_ + i] = aClass622_7228.anInt8120 * 782501683;
					is[(i_225_ - i_224_) * i_225_ + i] = aClass622_7228.anInt8120 * 782501683;
					is[(i_225_ - i_224_ - 1) * i_225_ + i + 1] = aClass622_7228.anInt8120 * 782501683;
				}
			}
			if (i + aClass622_7228.anInt8122 * 1388986437 < i_222_ - aClass622_7228.anInt8122 * 1388986437)
				method6558(is, i + aClass622_7228.anInt8122 * 1388986437, i_222_ - aClass622_7228.anInt8122 * 1388986437, i_223_, i_224_, i_225_, i_226_, i_227_, true, false, true, false);
			if (i_223_ + aClass622_7228.anInt8122 * 1388986437 + 1 < i_224_ - aClass622_7228.anInt8122 * 1388986437 - 1) {
				method6558(is, i, i + aClass622_7228.anInt8122 * 1388986437 - 1, i_223_ + aClass622_7228.anInt8122 * 1388986437, i_224_ - aClass622_7228.anInt8122 * 1388986437, i_225_, i_226_, i_227_, false, false, false, true);
				method6558(is, i_222_ - aClass622_7228.anInt8122 * 1388986437 + 1, i_222_, i_223_ + aClass622_7228.anInt8122 * 1388986437, i_224_ - aClass622_7228.anInt8122 * 1388986437, i_225_, i_226_, i_227_, false, true, false, false);
			}
		}
	}

	static void method6555(int[] is, int i, int i_228_, int i_229_, int i_230_, int i_231_, int i_232_, int i_233_) {
		for (int i_234_ = i; i_234_ <= i_228_; i_234_++) {
			for (int i_235_ = i_229_; i_235_ <= i_230_; i_235_++)
				is[(i_232_ - i_235_ - 1) * i_231_ + i_234_] = i_233_;
		}
	}

	public static void method6556(JS5ResourceProvider class461, JS5ResourceProvider class461_236_, Class34_Sub4 class34_sub4, Class34_Sub3 class34_sub3, Class34_Sub17 class34_sub17, Class34_Sub8 class34_sub8, Class34_Sub1 class34_sub1, Interface20 interface20, Interface18 interface18) {
		aClass461_7168 = class461;
		aClass461_7183 = class461_236_;
		anInterface12_7167 = class34_sub4;
		anInterface12_7164 = class34_sub3;
		aClass34_Sub17_7165 = class34_sub17;
		aClass34_Sub8_7212 = class34_sub8;
		aClass34_Sub1_7223 = class34_sub1;
		anInterface20_7169 = interface20;
		anInterface18_7163 = interface18;
		aClass4_7174.method561(-2117553523);
		int[] is = aClass461_7168.method5603(Class650.aClass650_8472.method78(), (byte) 34);
		if (is != null) {
			for (int i = 0; i < is.length; i++) {
				Class536_Sub18_Sub14 class536_sub18_sub14 = Class205_Sub14.method9075(aClass461_7168, is[i], 464873775);
				aClass4_7174.method560(class536_sub18_sub14, (long) (class536_sub18_sub14.anInt11765 * -673647059));
			}
		}
		Class38.method845(true, false, 84200204);
	}

	static void method6557(int[] is, int i, int i_237_, int i_238_, int i_239_, int i_240_) {
		int i_241_ = aClass622_7228.anInt8119 * -1228656737 >> 24 & 0xff;
		int i_242_ = 255 - i_241_;
		for (int i_243_ = i; i_243_ <= i_237_; i_243_++) {
			for (int i_244_ = i_238_; i_244_ <= i_239_; i_244_++) {
				int i_245_ = is[(i_240_ - i_244_ - 1) * i_240_ + i_243_];
				if (i_245_ != anInt7231) {
					anInt7231 = i_245_;
					anInt7222 = (~0xffffff | ((((aClass622_7228.anInt8119 * -1228656737 & 0xff00ff) * i_241_ + (i_245_ & 0xff00ff) * i_242_) & ~0xff00ff) + (((aClass622_7228.anInt8119 * -1228656737 & 0xff00) * i_241_ + (i_245_ & 0xff00) * i_242_) & 0xff0000)) >> 8);
				}
				is[(i_240_ - i_244_ - 1) * i_240_ + i_243_] = anInt7222;
			}
		}
	}

	static void method6558(int[] is, int i, int i_246_, int i_247_, int i_248_, int i_249_, int i_250_, int i_251_, boolean bool, boolean bool_252_, boolean bool_253_, boolean bool_254_) {
		for (int i_255_ = i; i_255_ <= i_246_; i_255_++) {
			boolean bool_256_ = bool_252_ ? (aBoolArray7233[anInt7172] && i_246_ - i_255_ < (aClass622_7228.anInt8125 * -486219055)) : false;
			boolean bool_257_ = (bool_254_ ? (aBoolArray7233[anInt7196] && i_255_ - i < aClass622_7228.anInt8125 * -486219055) : false);
			for (int i_258_ = i_247_; i_258_ <= i_248_; i_258_++) {
				if (bool_256_ || bool_257_)
					is[(i_249_ - i_258_ - 1) * i_249_ + i_255_] = aClass622_7228.anInt8120 * 782501683;
				else {
					boolean bool_259_ = (bool ? (aBoolArray7233[anInt7200] && (i_248_ - i_258_ < aClass622_7228.anInt8125 * -486219055)) : false);
					boolean bool_260_ = (bool_253_ ? (aBoolArray7233[anInt7204] && (i_258_ - i_247_ < aClass622_7228.anInt8125 * -486219055)) : false);
					if (bool_259_ || bool_260_)
						is[(i_249_ - i_258_ - 1) * i_249_ + i_255_] = aClass622_7228.anInt8120 * 782501683;
					else {
						int i_261_ = is[(i_249_ - i_258_ - 1) * i_249_ + i_255_];
						if (i_261_ != anInt7231) {
							anInt7231 = i_261_;
							anInt7222 = (~0xffffff | ((((aClass622_7228.anInt8119 * -1228656737 & 0xff00ff) * i_250_ + (i_261_ & 0xff00ff) * i_251_) & ~0xff00ff) + ((((aClass622_7228.anInt8119 * -1228656737) & 0xff00) * i_250_ + (i_261_ & 0xff00) * i_251_) & 0xff0000)) >> 8);
						}
						is[(i_249_ - i_258_ - 1) * i_249_ + i_255_] = anInt7222;
					}
				}
			}
		}
	}

	static void method6559(int[] is, int i, int i_262_, int i_263_, int i_264_, int i_265_, int i_266_) {
		for (int i_267_ = 0; i_267_ < aClass622_7228.anInt8122 * 1388986437; i_267_++) {
			int i_268_ = i_267_;
			if (i_266_ == anInt7201 || i_266_ == anInt7203)
				i_268_ = aClass622_7228.anInt8122 * 1388986437 - i_267_ - 1;
			for (int i_269_ = 0; i_269_ < aClass622_7228.anInt8122 * 1388986437; i_269_++) {
				int i_270_ = i_269_;
				if (i_266_ == anInt7203 || i_266_ == anInt7205)
					i_270_ = aClass622_7228.anInt8122 * 1388986437 - i_269_ - 1;
				int i_271_ = anIntArrayArray7170[i_268_][i_270_];
				if (i_271_ != 0) {
					if (i_271_ == 1) {
						int i_272_ = is[((i_263_ - i_262_ - i_269_ - 1) * i_263_ + i + i_267_)];
						if (i_272_ != anInt7231) {
							anInt7231 = i_272_;
							anInt7222 = (~0xffffff | ((((aClass622_7228.anInt8119 * -1228656737 & 0xff00ff) * i_264_ + (i_272_ & 0xff00ff) * i_265_) & ~0xff00ff) + ((((aClass622_7228.anInt8119 * -1228656737) & 0xff00) * i_264_ + (i_272_ & 0xff00) * i_265_) & 0xff0000)) >> 8);
						}
						is[((i_263_ - i_262_ - i_269_ - 1) * i_263_ + i + i_267_)] = anInt7222;
					} else if (i_271_ == 2)
						is[((i_263_ - i_262_ - i_269_ - 1) * i_263_ + i + i_267_)] = aClass622_7228.anInt8120 * 782501683;
				}
			}
		}
	}

	static void method6560(int[] is, int i, int i_273_, int i_274_, int i_275_, int i_276_) {
		int i_277_ = i + (i_275_ - i_273_ - 1) * i_275_;
		for (int i_278_ = 0; i_278_ < i_274_; i_278_++)
			is[i_277_ + i_278_] = i_276_;
	}

	static {
		anInterface12_7164 = null;
		aClass4_7174 = new Class4(16);
		anInt7175 = (int) (Math.random() * 11.0) - 5;
		anInt7176 = (int) (Math.random() * 17.0) - 8;
		anIntArray7210 = new int[1];
		aByteArray7180 = new byte[1];
		aClass708_7218 = new Class708();
		aBool7197 = true;
		anIntArrayArray7170 = new int[][] { { 2, 2, 0, 0, 0, 0 }, { 2, 2, 2, 0, 0, 0 }, { 1, 2, 2, 2, 0, 0 }, { 1, 1, 1, 2, 2, 0 }, { 1, 1, 1, 2, 2, 2 }, { 1, 1, 1, 1, 2, 2 } };
		anInt7200 = Class679.aClass679_8633.method78();
		anInt7201 = Class679.aClass679_8627.method78();
		anInt7172 = Class679.aClass679_8628.method78();
		anInt7203 = Class679.aClass679_8629.method78();
		anInt7204 = Class679.aClass679_8630.method78();
		anInt7205 = Class679.aClass679_8626.method78();
		anInt7196 = Class679.aClass679_8632.method78();
		anInt7207 = Class679.aClass679_8631.method78();
		aClass199_7166 = new Class199(4096, 256);
		aClass199_7225 = new Class199(4096, 1024);
		aClass199_7211 = aClass199_7166;
		anArrayList7213 = new ArrayList();
		anInt7179 = 262144;
		anInt7216 = 0;
		anInt7217 = 5;
		aClass536_Sub33_7182 = null;
		aClass536_Sub33_7219 = null;
		aBool7220 = true;
		new Date();
		anInt7231 = 0;
		anInt7222 = 0;
		aBoolArray7233 = new boolean[8];
	}

	static void method6561() {
		aShortArray7229 = new short[anInt7187 * anInt7188];
		aShortArray7193 = new short[anInt7187 * anInt7188];
		aByteArray7194 = new byte[anInt7187 * anInt7188];
		anObjectArray7195 = new Object[anInt7187 * anInt7188];
		aByteArray7191 = new byte[anInt7187 * anInt7188];
		aHashMapArrayArrayArray7208 = new HashMap[3][anInt7187 >> 6][anInt7188 >> 6];
		anIntArray7189 = new int[anInterface12_7167.method71(2062545796) + 1];
		aBoolArrayArray7198 = new boolean[anInt7187 / 8][anInt7188 / 8];
	}

	static void method6562() {
		aShortArray7229 = new short[anInt7187 * anInt7188];
		aShortArray7193 = new short[anInt7187 * anInt7188];
		aByteArray7194 = new byte[anInt7187 * anInt7188];
		anObjectArray7195 = new Object[anInt7187 * anInt7188];
		aByteArray7191 = new byte[anInt7187 * anInt7188];
		aHashMapArrayArrayArray7208 = new HashMap[3][anInt7187 >> 6][anInt7188 >> 6];
		anIntArray7189 = new int[anInterface12_7167.method71(1892457634) + 1];
		aBoolArrayArray7198 = new boolean[anInt7187 / 8][anInt7188 / 8];
	}

	public static Class536_Sub18_Sub14 method6563(int i) {
		return (Class536_Sub18_Sub14) aClass4_7174.method556((long) i);
	}

	static void method6564(int i) {
		Class536_Sub18_Sub14 class536_sub18_sub14 = (Class536_Sub18_Sub14) aClass4_7174.method556((long) i);
		if (class536_sub18_sub14 != null && class536_sub18_sub14 != aClass536_Sub18_Sub14_7202) {
			aClass536_Sub18_Sub14_7202 = class536_sub18_sub14;
			aBool7197 = (aClass536_Sub18_Sub14_7202.anInt11765 * -673647059 == aClass622_7228.anInt8118 * 1041246061);
		}
	}

	Class542() throws Throwable {
		throw new Error();
	}

	static void method6565() {
		for (int i = 0; i < anInt7187; i++) {
			for (int i_279_ = 0; i_279_ < anInt7188; i_279_++) {
				Object object = anObjectArray7195[i + i_279_ * anInt7187];
				if (object != null) {
					if (object instanceof Class536_Sub29) {
						Class536_Sub29 class536_sub29 = (Class536_Sub29) object;
						if (class536_sub29 != null) {
							for (int i_280_ = 0; (i_280_ < class536_sub29.anIntArray10562.length); i_280_++) {
								ObjTypeDecoder class612 = (ObjTypeDecoder) (aClass34_Sub17_7165.method70((class536_sub29.anIntArray10562[i_280_]), (byte) 30));
								int i_281_ = class612.anInt7994 * -876565287;
								if (class612.anIntArray7988 != null) {
									class612 = (class612.method7293(anInterface20_7169, anInterface18_7163, (byte) 89));
									if (class612 != null)
										i_281_ = class612.anInt7994 * -876565287;
								}
								if (i_281_ != -1) {
									Class536_Sub41 class536_sub41 = new Class536_Sub41(i_281_);
									class536_sub41.anInt10794 = i * 749779519;
									class536_sub41.anInt10796 = i_279_ * -1881922211;
									aClass708_7218.method8335(class536_sub41, 563535652);
								}
							}
						}
					} else {
						Integer integer = (Integer) object;
						ObjTypeDecoder class612 = ((ObjTypeDecoder) aClass34_Sub17_7165.method70(integer.intValue(), (byte) -50));
						int i_282_ = class612.anInt7994 * -876565287;
						if (class612.anIntArray7988 != null) {
							class612 = class612.method7293(anInterface20_7169, anInterface18_7163, (byte) 26);
							if (class612 != null)
								i_282_ = class612.anInt7994 * -876565287;
						}
						if (i_282_ != -1) {
							Class536_Sub41 class536_sub41 = new Class536_Sub41(i_282_);
							class536_sub41.anInt10794 = i * 749779519;
							class536_sub41.anInt10796 = i_279_ * -1881922211;
							aClass708_7218.method8335(class536_sub41, -1157052460);
						}
					}
				}
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int i_283_ = 0; i_283_ < aHashMapArrayArrayArray7208[0].length; i_283_++) {
				for (int i_284_ = 0; i_284_ < aHashMapArrayArrayArray7208[0][0].length; i_284_++) {
					HashMap hashmap = aHashMapArrayArrayArray7208[i][i_283_][i_284_];
					if (hashmap != null) {
						Iterator iterator = hashmap.values().iterator();
						while (iterator.hasNext()) {
							Class531 class531 = (Class531) iterator.next();
							if (class531.anIntArray7119 != null) {
								for (int i_285_ = 0; i_285_ < class531.anIntArray7119.length; i_285_++) {
									ObjTypeDecoder class612 = ((ObjTypeDecoder) (aClass34_Sub17_7165.method70(class531.anIntArray7119[i_285_], (byte) -60)));
									int i_286_ = class612.anInt7994 * -876565287;
									if (class612.anIntArray7988 != null) {
										class612 = (class612.method7293(anInterface20_7169, anInterface18_7163, (byte) 95));
										if (class612 != null)
											i_286_ = (class612.anInt7994 * -876565287);
									}
									if (i_286_ != -1) {
										Class536_Sub41 class536_sub41 = new Class536_Sub41(i_286_);
										class536_sub41.anInt10794 = ((i_283_ + (anInt7185 >> 6)) * 64 + class531.aByte7114 - anInt7185) * 749779519;
										class536_sub41.anInt10796 = ((i_284_ + (anInt7186 >> 6)) * 64 + class531.aByte7115 - anInt7186) * -1881922211;
										aClass708_7218.method8335(class536_sub41, -1630732929);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	static void method6566(GraphicalRenderer class167, boolean bool, boolean bool_287_, int i, int i_288_, int i_289_, int i_290_, boolean bool_291_, boolean bool_292_) {
		int i_293_ = anInt7206 - anInt7184;
		int i_294_ = anInt7224 - anInt7226;
		if (anInt7206 < anInt7187)
			i_293_++;
		if (anInt7224 < anInt7188)
			i_294_++;
		int i_295_ = anInt7184 / 64;
		int i_296_ = anInt7226 / 64;
		int i_297_ = (anInt7184 + i_293_) / 64;
		int i_298_ = (anInt7226 + i_294_) / 64;
		int i_299_;
		int i_300_;
		if (bool_292_) {
			i_299_ = (anInt7190 - anInt7227) / ((anInt7206 - anInt7184) / 64);
			i_300_ = i_299_;
		} else {
			i_299_ = method6575();
			i_300_ = (int) Math.ceil((double) (64.0F * aFloat7181 / 2.0F));
		}
		anArrayList7213.clear();
		int i_301_ = 0;
		int i_302_ = i_299_ * i_299_;
		for (int i_303_ = i_295_; i_303_ <= i_297_; i_303_++) {
			for (int i_304_ = i_296_; i_304_ <= i_298_; i_304_++) {
				int i_305_ = (i_303_ << 16) + i_304_;
				int i_306_ = method6536((long) i_305_);
				if (i_306_ != i_299_) {
					if (i_303_ < 0 || i_303_ * 64 >= anInt7187 || i_304_ < 0 || i_304_ * 64 >= anInt7188)
						method6546(class167, i_303_, i_304_, i_299_, i_305_);
					else if (i_306_ == -1) {
						method6547(i_303_, i_304_, i_299_, i_305_, bool, bool_287_, bool_291_, class167);
						i_301_ += i_302_;
					} else
						anArrayList7213.add(Integer.valueOf(i_305_));
				}
			}
		}
		if (!anArrayList7213.isEmpty() && i_301_ < anInt7179) {
			for (Iterator iterator = anArrayList7213.iterator(); i_301_ < anInt7179 && iterator.hasNext(); i_301_ += i_302_) {
				int i_307_ = ((Integer) iterator.next()).intValue();
				int i_308_ = i_307_ >> 16 & 0xffff;
				int i_309_ = i_307_ & 0xffff;
				method6547(i_308_, i_309_, i_299_, i_307_, bool, bool_287_, bool_291_, class167);
			}
		}
		for (int i_310_ = i_295_; i_310_ <= i_297_; i_310_++) {
			int i_311_ = i_310_ * 64;
			int i_312_ = i_311_ - anInt7184;
			int i_313_ = i_300_;
			int i_314_ = (i_289_ + i * i_312_ >> 16) + anInt7227;
			int i_315_ = (i_289_ + i * (i_312_ + 64) >> 16) + anInt7227;
			if (i_314_ + i_313_ != i_315_)
				i_313_ = i_315_ - i_314_;
			for (int i_316_ = i_296_; i_316_ <= i_298_; i_316_++) {
				int i_317_ = i_316_ * 64;
				int i_318_ = i_317_ - anInt7226;
				int i_319_ = (i_310_ << 16) + i_316_;
				int i_320_ = i_300_;
				int i_321_ = anInt7230 - (i_290_ + i_288_ * i_318_ >> 16);
				int i_322_ = anInt7230 - (i_290_ + i_288_ * (i_318_ + 64) >> 16);
				if (i_321_ - i_320_ != i_322_)
					i_320_ = i_321_ - i_322_;
				i_321_ -= i_320_;
				NativeSprite class143 = (NativeSprite) aClass199_7211.method2886((long) i_319_);
				if (class143 == null)
					throw new RuntimeException();
				if (class143.method1720() == i_313_ && class143.method1752() == i_320_)
					class143.method1728(i_314_, i_321_);
				else
					class143.method1724(i_314_, i_321_, i_313_, i_320_);
			}
		}
	}

	static Class708 method6567(GraphicalRenderer class167, int i, int i_323_, int i_324_, int i_325_) {
		for (Class536_Sub41 class536_sub41 = (Class536_Sub41) aClass708_7218.method8308(1867269829); class536_sub41 != null; class536_sub41 = (Class536_Sub41) aClass708_7218.method8311(1463415322))
			method6551(class167, class536_sub41, i, i_323_, i_324_, i_325_);
		return aClass708_7218;
	}

	static void method6568(int i, int i_326_, int i_327_, int i_328_, int i_329_, int i_330_, int i_331_, int i_332_) {
		anInt7184 = i - anInt7185;
		anInt7224 = i_326_ - anInt7186;
		anInt7206 = i_327_ - anInt7185;
		anInt7226 = i_328_ - anInt7186;
		anInt7227 = i_329_;
		anInt7199 = i_330_;
		anInt7190 = i_331_;
		anInt7230 = i_332_;
	}

	static Class708 method6569(GraphicalRenderer class167) {
		int i = anInt7206 - anInt7184;
		int i_333_ = anInt7224 - anInt7226;
		int i_334_ = (anInt7190 - anInt7227 << 16) / i;
		int i_335_ = (anInt7230 - anInt7199 << 16) / i_333_;
		return method6567(class167, i_334_, i_335_, 0, 0);
	}

	static void method6570(int i) {
		Class536_Sub18_Sub14 class536_sub18_sub14 = (Class536_Sub18_Sub14) aClass4_7174.method556((long) i);
		if (class536_sub18_sub14 != null && class536_sub18_sub14 != aClass536_Sub18_Sub14_7202) {
			aClass536_Sub18_Sub14_7202 = class536_sub18_sub14;
			aBool7197 = (aClass536_Sub18_Sub14_7202.anInt11765 * -673647059 == aClass622_7228.anInt8118 * 1041246061);
		}
	}

	static void method6571() {
		aShortArray7229 = null;
		aByteArray7173 = null;
		aShortArray7214 = null;
		aShortArray7193 = null;
		aByteArray7194 = null;
		anObjectArray7195 = null;
		aByteArray7191 = null;
		aHashMapArrayArrayArray7208 = null;
		anIntArray7189 = null;
		aBoolArrayArray7198 = null;
	}

	static boolean method6572(int i, int i_336_) {
		int i_337_ = i >> 3;
		int i_338_ = i_336_ >> 3;
		if (i_337_ < 0 || i_338_ < 0 || i_337_ >= aBoolArrayArray7198.length || i_338_ >= aBoolArrayArray7198[i_337_].length)
			return false;
		return aBoolArrayArray7198[i_337_][i_338_];
	}

	static int method6573() {
		return (int) (64.0F * aFloat7232 / 2.0F);
	}

	public static Class700 method6574(int i, int i_339_) {
		Class700 class700 = new Class700();
		for (Class536_Sub18_Sub14 class536_sub18_sub14 = (Class536_Sub18_Sub14) aClass4_7174.method562(-2118036571); class536_sub18_sub14 != null; class536_sub18_sub14 = (Class536_Sub18_Sub14) aClass4_7174.method567(381755046)) {
			if (class536_sub18_sub14.aBool11773 && class536_sub18_sub14.method10764(i, i_339_, -1738552687))
				class700.method8239(class536_sub18_sub14, (byte) -23);
		}
		return class700;
	}

	static int method6575() {
		return (int) (64.0F * aFloat7232 / 2.0F);
	}

	static void method6576(int[] is, int i, int i_340_, int i_341_, int i_342_, int i_343_, boolean bool, int i_344_, int i_345_, int i_346_, int[] is_347_, byte[] is_348_, boolean bool_349_) {
		if (bool_349_ || i_344_ != 0 || i_345_ > 0) {
			if (i_345_ == 0)
				method6555(is, i, i_340_, i_341_, i_342_, i_343_, i_343_, i_344_ | ~0xffffff);
			else {
				int i_350_ = i_346_ & 0x3f;
				if (i_350_ == 0 || anInt7178 == 0) {
					int i_351_ = anIntArray7189[i_345_];
					if (bool_349_ || i_351_ != 0)
						method6555(is, i, i_340_, i_341_, i_342_, i_343_, i_343_, i_351_ | ~0xffffff);
				} else {
					int i_352_ = bool_349_ ? 0 : 1;
					int i_353_ = Class432.method5185(i_346_ >> 6 & 0x3, i_350_, -1914173312);
					i_350_ = GameShell.method6136(i_350_, (byte) 88);
					method6545(is, i, i_340_, i_341_, i_342_, i_343_, i_343_, i_344_, anIntArray7189[i_345_], aByteArrayArrayArray7177[i_350_ - 1][i_353_], anInt7178, i_352_);
				}
			}
		}
		if (bool && is_347_ != null) {
			int i_354_ = i_340_ - i + 1;
			int i_355_ = i_342_ - i_341_ + 1;
			for (int i_356_ = 0; i_356_ < is_347_.length; i_356_++) {
				int i_357_ = is_348_[i_356_] & 0x3f;
				if (i_357_ == ObjShapes.aClass606_7892.anInt7878 * -723459231 || i_357_ == ObjShapes.aClass606_7875.anInt7878 * -723459231 || i_357_ == ObjShapes.aClass606_7876.anInt7878 * -723459231 || (i_357_ == ObjShapes.aClass606_7873.anInt7878 * -723459231)) {
					ObjTypeDecoder class612 = ((ObjTypeDecoder) aClass34_Sub17_7165.method70(is_347_[i_356_], (byte) 50));
					if (class612.anInt7941 * -1070948127 == -1) {
						int i_358_ = -3355444;
						if (class612.anInt7953 * 1248110961 == 1)
							i_358_ = -3407872;
						int i_359_ = is_348_[i_356_] >> 6 & 0x3;
						if (i_357_ == (ObjShapes.aClass606_7892.anInt7878 * -723459231)) {
							if (i_359_ == 0)
								method6579(is, i, i_342_, i_355_, i_343_, i_358_);
							else if (i_359_ == 1)
								method6560(is, i, i_342_, i_354_, i_343_, i_358_);
							else if (i_359_ == 2)
								method6579(is, i_340_, i_342_, i_355_, i_343_, i_358_);
							else
								method6560(is, i, i_341_, i_354_, i_343_, i_358_);
						} else if (i_357_ == (ObjShapes.aClass606_7875.anInt7878 * -723459231)) {
							if (i_359_ == 0) {
								method6579(is, i, i_342_, i_355_, i_343_, -1);
								method6560(is, i, i_342_, i_354_, i_343_, i_358_);
							} else if (i_359_ == 1) {
								method6579(is, i_340_, i_342_, i_355_, i_343_, -1);
								method6560(is, i, i_342_, i_354_, i_343_, i_358_);
							} else if (i_359_ == 2) {
								method6579(is, i_340_, i_342_, i_355_, i_343_, -1);
								method6560(is, i, i_341_, i_354_, i_343_, i_358_);
							} else {
								method6579(is, i, i_342_, i_355_, i_343_, -1);
								method6560(is, i, i_341_, i_354_, i_343_, i_358_);
							}
						} else if (i_357_ == (ObjShapes.aClass606_7876.anInt7878 * -723459231)) {
							if (i_359_ == 0)
								method6560(is, i, i_342_, 1, i_343_, i_358_);
							else if (i_359_ == 1)
								method6560(is, i_340_, i_342_, 1, i_343_, i_358_);
							else if (i_359_ == 2)
								method6560(is, i_340_, i_341_, 1, i_343_, i_358_);
							else
								method6560(is, i, i_341_, 1, i_343_, i_358_);
						} else if (i_357_ == (ObjShapes.aClass606_7873.anInt7878 * -723459231)) {
							if (i_359_ == 0 || i_359_ == 2) {
								for (int i_360_ = 0; i_360_ < i_355_; i_360_++)
									method6560(is, i + i_360_, i_341_ + i_360_, 1, i_343_, i_358_);
							} else {
								for (int i_361_ = 0; i_361_ < i_355_; i_361_++)
									method6560(is, i + i_361_, i_342_ - i_361_, 1, i_343_, i_358_);
							}
						}
					}
				}
			}
		}
	}

	static void method6577(short[] is, byte[] is_362_, short[] is_363_, int i, int i_364_) {
		int[] is_365_ = new int[anInt7188];
		int[] is_366_ = new int[anInt7188];
		int[] is_367_ = new int[anInt7188];
		int[] is_368_ = new int[anInt7188];
		int[] is_369_ = new int[anInt7188];
		for (int i_370_ = -5; i_370_ < anInt7187; i_370_++) {
			int i_371_ = i_370_ + 5;
			int i_372_ = i_370_ - 5;
			for (int i_373_ = 0; i_373_ < anInt7188; i_373_++) {
				if (i_371_ < anInt7187) {
					short i_374_ = is[i_371_ + i_373_ * anInt7187];
					if (i_374_ > 0) {
						Class20 class20 = (Class20) anInterface12_7164.method70(i_374_ - 1, (byte) 33);
						is_365_[i_373_] += class20.anInt211 * 1490608091;
						is_366_[i_373_] += class20.anInt212 * -1278569833;
						is_367_[i_373_] += class20.anInt213 * -2044137673;
						is_368_[i_373_] += class20.anInt206 * -1374187401;
						is_369_[i_373_]++;
					}
				}
				if (i_372_ >= 0) {
					short i_375_ = is[i_372_ + i_373_ * anInt7187];
					if (i_375_ > 0) {
						Class20 class20 = ((Class20) anInterface12_7164.method70(i_375_ - 1, (byte) -11));
						is_365_[i_373_] -= class20.anInt211 * 1490608091;
						is_366_[i_373_] -= class20.anInt212 * -1278569833;
						is_367_[i_373_] -= class20.anInt213 * -2044137673;
						is_368_[i_373_] -= class20.anInt206 * -1374187401;
						is_369_[i_373_]--;
					}
				}
			}
			if (i_370_ >= 0) {
				int i_376_ = 0;
				int i_377_ = 0;
				int i_378_ = 0;
				int i_379_ = 0;
				int i_380_ = 0;
				for (int i_381_ = -5; i_381_ < anInt7188; i_381_++) {
					int i_382_ = i_381_ + 5;
					if (i_382_ < anInt7188) {
						i_376_ += is_365_[i_382_];
						i_377_ += is_366_[i_382_];
						i_378_ += is_367_[i_382_];
						i_379_ += is_368_[i_382_];
						i_380_ += is_369_[i_382_];
					}
					int i_383_ = i_381_ - 5;
					if (i_383_ >= 0) {
						i_376_ -= is_365_[i_383_];
						i_377_ -= is_366_[i_383_];
						i_378_ -= is_367_[i_383_];
						i_379_ -= is_368_[i_383_];
						i_380_ -= is_369_[i_383_];
					}
					if (i_381_ >= 0 && i_380_ > 0) {
						if (is[i_370_ + i_381_ * anInt7187] == 0) {
							int i_384_ = i_370_ + i_381_ * anInt7187;
							is_362_[i_384_] = (byte) 0;
							is_363_[i_384_] = (short) 0;
						} else {
							int i_385_ = (i_379_ == 0 ? 0 : Class169.method2417(i_376_ * 256 / i_379_, i_377_ / i_380_, i_378_ / i_380_, -1502845297));
							int i_386_ = (i_385_ & 0x7f) + i_364_;
							if (i_386_ < 0)
								i_386_ = 0;
							else if (i_386_ > 127)
								i_386_ = 127;
							int i_387_ = ((i_385_ + i & 0xfc00) + (i_385_ & 0x380) + i_386_);
							int i_388_ = i_370_ + i_381_ * anInt7187;
							int i_389_ = (ColourUtils.anIntArray8308[(Class254.method3537(Class392.method4863(i_387_, 96, 1566755916), 1409175155)) & 0xffff]);
							is_362_[i_388_] = (byte) (i_389_ >> 16 & 0xff);
							is_363_[i_388_] = (short) (i_389_ & 0xffff);
						}
					}
				}
			}
		}
	}

	static int method6578() {
		return (int) (64.0F * aFloat7232 / 2.0F);
	}

	static void method6579(int[] is, int i, int i_390_, int i_391_, int i_392_, int i_393_) {
		int i_394_ = i + (i_392_ - i_390_ - 1) * i_392_;
		for (int i_395_ = 0; i_395_ < i_391_; i_395_++)
			is[i_394_ + i_395_ * i_392_] = i_393_;
	}
}
