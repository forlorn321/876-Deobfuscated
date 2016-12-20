/* Class588 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class588 {
	Class588() throws Throwable {
		throw new Error();
	}

	public static void method9809(float f, Class442 class442, Class438 class438, Class442 class442_0_, Class442 class442_1_, Class442 class442_2_, Class442 class442_3_, float f_4_, float f_5_, float f_6_, float f_7_) {
		if (!class442_0_.method7177(class442)) {
			Class442 class442_8_ = Class442.method7166(0.0F, 0.0F, 0.0F);
			Class442 class442_9_ = Class442.method7139(Class442.method7155(class442_0_, class442));
			class442_9_.method7157(class438);
			Class442 class442_10_ = Class442.method7155(class442_9_, class442_8_);
			float f_11_ = class442_10_.method7160();
			if (f_4_ > 0.0F) {
				class442_2_ = Class442.method7139(class442_2_);
				class442_2_.method7164(f_11_ / f_4_ * f_5_);
			}
			if (Float.POSITIVE_INFINITY == class442_2_.aFloat4918 || Float.isNaN(class442.aFloat4918) || f_11_ > f_6_ || f_11_ < f_7_) {
				class442.method7146(class442_0_);
				class442_1_.method7211();
			} else {
				class438.method7033();
				Class442 class442_12_ = Class442.method7166(1.0F, 0.0F, 0.0F);
				Class442 class442_13_ = Class442.method7166(0.0F, 1.0F, 0.0F);
				Class442 class442_14_ = Class442.method7166(0.0F, 0.0F, 1.0F);
				class442_12_.method7157(class438);
				class442_13_.method7157(class438);
				class442_14_.method7157(class438);
				Class442 class442_15_ = Class442.method7166(Class442.method7145(class442_12_, class442_1_), Class442.method7145(class442_13_, class442_1_), Class442.method7145(class442_14_, class442_1_));
				Class442 class442_16_ = Class442.method7139(class442_15_);
				class442_16_.method7147();
				Class442 class442_17_ = Class442.method7191(Class442.method7163(class442_16_, class442_16_), Class442.method7168(class442_2_, 2.0F));
				Class442 class442_18_ = Class442.method7139(class442_10_);
				class442_18_.method7147();
				Class442 class442_19_ = Class442.method7139(class442_15_);
				if (class442_17_.aFloat4918 > class442_18_.aFloat4918) {
					if (class442_10_.aFloat4918 < 0.0F) {
						class442_19_.aFloat4918 += f * class442_2_.aFloat4918;
						if (class442_19_.aFloat4918 > 0.0F)
							class442_19_.aFloat4918 = 0.0F;
					} else {
						class442_19_.aFloat4918 -= f * class442_2_.aFloat4918;
						if (class442_19_.aFloat4918 < 0.0F)
							class442_19_.aFloat4918 = 0.0F;
					}
				} else if (class442_16_.aFloat4918 < class442_3_.aFloat4918) {
					if (class442_10_.aFloat4918 < 0.0F) {
						class442_19_.aFloat4918 -= f * class442_2_.aFloat4918;
						if (class442_19_.aFloat4918 < -class442_3_.aFloat4918)
							class442_19_.aFloat4918 = -class442_3_.aFloat4918;
					} else {
						class442_19_.aFloat4918 += f * class442_2_.aFloat4918;
						if (class442_19_.aFloat4918 > class442_3_.aFloat4918)
							class442_19_.aFloat4918 = class442_3_.aFloat4918;
					}
				}
				if (class442_17_.aFloat4915 > class442_18_.aFloat4915) {
					if (class442_10_.aFloat4915 < 0.0F) {
						class442_19_.aFloat4915 += class442_2_.aFloat4915 * f;
						if (class442_19_.aFloat4915 > 0.0F)
							class442_19_.aFloat4915 = 0.0F;
					} else {
						class442_19_.aFloat4915 -= f * class442_2_.aFloat4915;
						if (class442_19_.aFloat4915 < 0.0F)
							class442_19_.aFloat4915 = 0.0F;
					}
				} else if (class442_16_.aFloat4915 < class442_3_.aFloat4915) {
					if (class442_10_.aFloat4915 < 0.0F) {
						class442_19_.aFloat4915 -= class442_2_.aFloat4915 * f;
						if (class442_19_.aFloat4915 < -class442_3_.aFloat4915)
							class442_19_.aFloat4915 = -class442_3_.aFloat4915;
					} else {
						class442_19_.aFloat4915 += class442_2_.aFloat4915 * f;
						if (class442_19_.aFloat4915 > class442_3_.aFloat4915)
							class442_19_.aFloat4915 = class442_3_.aFloat4915;
					}
				}
				if (class442_17_.aFloat4919 > class442_18_.aFloat4919) {
					if (class442_10_.aFloat4919 < 0.0F) {
						class442_19_.aFloat4919 += f * class442_2_.aFloat4919;
						if (class442_19_.aFloat4919 > 0.0F)
							class442_19_.aFloat4919 = 0.0F;
					} else {
						class442_19_.aFloat4919 -= class442_2_.aFloat4919 * f;
						if (class442_19_.aFloat4919 < 0.0F)
							class442_19_.aFloat4919 = 0.0F;
					}
				} else if (class442_16_.aFloat4919 < class442_3_.aFloat4919) {
					if (class442_10_.aFloat4919 < 0.0F) {
						class442_19_.aFloat4919 -= class442_2_.aFloat4919 * f;
						if (class442_19_.aFloat4919 < -class442_3_.aFloat4919)
							class442_19_.aFloat4919 = -class442_3_.aFloat4919;
					} else {
						class442_19_.aFloat4919 += class442_2_.aFloat4919 * f;
						if (class442_19_.aFloat4919 > class442_3_.aFloat4919)
							class442_19_.aFloat4919 = class442_3_.aFloat4919;
					}
				}
				Class442 class442_20_ = Class442.method7168(class442_12_, class442_19_.aFloat4918);
				class442_20_.method7152(class442_13_, class442_19_.aFloat4915);
				class442_20_.method7152(class442_14_, class442_19_.aFloat4919);
				class442_1_.method7172(class442_20_, 0.8F);
				class442.method7219(Class442.method7168(class442_1_, f));
				class442_16_.method7141();
				class442_19_.method7141();
				class442_18_.method7141();
			}
		}
	}

	public static void method9810(float f, Class442 class442, Class438 class438, Class442 class442_21_, Class442 class442_22_, Class442 class442_23_, Class442 class442_24_, float f_25_, float f_26_, float f_27_, float f_28_) {
		if (!class442_21_.method7177(class442)) {
			Class442 class442_29_ = Class442.method7166(0.0F, 0.0F, 0.0F);
			Class442 class442_30_ = Class442.method7139(Class442.method7155(class442_21_, class442));
			class442_30_.method7157(class438);
			Class442 class442_31_ = Class442.method7155(class442_30_, class442_29_);
			float f_32_ = class442_31_.method7160();
			if (f_25_ > 0.0F) {
				class442_23_ = Class442.method7139(class442_23_);
				class442_23_.method7164(f_32_ / f_25_ * f_26_);
			}
			if (Float.POSITIVE_INFINITY == class442_23_.aFloat4918 || Float.isNaN(class442.aFloat4918) || f_32_ > f_27_ || f_32_ < f_28_) {
				class442.method7146(class442_21_);
				class442_22_.method7211();
			} else {
				class438.method7033();
				Class442 class442_33_ = Class442.method7166(1.0F, 0.0F, 0.0F);
				Class442 class442_34_ = Class442.method7166(0.0F, 1.0F, 0.0F);
				Class442 class442_35_ = Class442.method7166(0.0F, 0.0F, 1.0F);
				class442_33_.method7157(class438);
				class442_34_.method7157(class438);
				class442_35_.method7157(class438);
				Class442 class442_36_ = Class442.method7166(Class442.method7145(class442_33_, class442_22_), Class442.method7145(class442_34_, class442_22_), Class442.method7145(class442_35_, class442_22_));
				Class442 class442_37_ = Class442.method7139(class442_36_);
				class442_37_.method7147();
				Class442 class442_38_ = Class442.method7191(Class442.method7163(class442_37_, class442_37_), Class442.method7168(class442_23_, 2.0F));
				Class442 class442_39_ = Class442.method7139(class442_31_);
				class442_39_.method7147();
				Class442 class442_40_ = Class442.method7139(class442_36_);
				if (class442_38_.aFloat4918 > class442_39_.aFloat4918) {
					if (class442_31_.aFloat4918 < 0.0F) {
						class442_40_.aFloat4918 += f * class442_23_.aFloat4918;
						if (class442_40_.aFloat4918 > 0.0F)
							class442_40_.aFloat4918 = 0.0F;
					} else {
						class442_40_.aFloat4918 -= f * class442_23_.aFloat4918;
						if (class442_40_.aFloat4918 < 0.0F)
							class442_40_.aFloat4918 = 0.0F;
					}
				} else if (class442_37_.aFloat4918 < class442_24_.aFloat4918) {
					if (class442_31_.aFloat4918 < 0.0F) {
						class442_40_.aFloat4918 -= f * class442_23_.aFloat4918;
						if (class442_40_.aFloat4918 < -class442_24_.aFloat4918)
							class442_40_.aFloat4918 = -class442_24_.aFloat4918;
					} else {
						class442_40_.aFloat4918 += f * class442_23_.aFloat4918;
						if (class442_40_.aFloat4918 > class442_24_.aFloat4918)
							class442_40_.aFloat4918 = class442_24_.aFloat4918;
					}
				}
				if (class442_38_.aFloat4915 > class442_39_.aFloat4915) {
					if (class442_31_.aFloat4915 < 0.0F) {
						class442_40_.aFloat4915 += class442_23_.aFloat4915 * f;
						if (class442_40_.aFloat4915 > 0.0F)
							class442_40_.aFloat4915 = 0.0F;
					} else {
						class442_40_.aFloat4915 -= f * class442_23_.aFloat4915;
						if (class442_40_.aFloat4915 < 0.0F)
							class442_40_.aFloat4915 = 0.0F;
					}
				} else if (class442_37_.aFloat4915 < class442_24_.aFloat4915) {
					if (class442_31_.aFloat4915 < 0.0F) {
						class442_40_.aFloat4915 -= class442_23_.aFloat4915 * f;
						if (class442_40_.aFloat4915 < -class442_24_.aFloat4915)
							class442_40_.aFloat4915 = -class442_24_.aFloat4915;
					} else {
						class442_40_.aFloat4915 += class442_23_.aFloat4915 * f;
						if (class442_40_.aFloat4915 > class442_24_.aFloat4915)
							class442_40_.aFloat4915 = class442_24_.aFloat4915;
					}
				}
				if (class442_38_.aFloat4919 > class442_39_.aFloat4919) {
					if (class442_31_.aFloat4919 < 0.0F) {
						class442_40_.aFloat4919 += f * class442_23_.aFloat4919;
						if (class442_40_.aFloat4919 > 0.0F)
							class442_40_.aFloat4919 = 0.0F;
					} else {
						class442_40_.aFloat4919 -= class442_23_.aFloat4919 * f;
						if (class442_40_.aFloat4919 < 0.0F)
							class442_40_.aFloat4919 = 0.0F;
					}
				} else if (class442_37_.aFloat4919 < class442_24_.aFloat4919) {
					if (class442_31_.aFloat4919 < 0.0F) {
						class442_40_.aFloat4919 -= class442_23_.aFloat4919 * f;
						if (class442_40_.aFloat4919 < -class442_24_.aFloat4919)
							class442_40_.aFloat4919 = -class442_24_.aFloat4919;
					} else {
						class442_40_.aFloat4919 += class442_23_.aFloat4919 * f;
						if (class442_40_.aFloat4919 > class442_24_.aFloat4919)
							class442_40_.aFloat4919 = class442_24_.aFloat4919;
					}
				}
				Class442 class442_41_ = Class442.method7168(class442_33_, class442_40_.aFloat4918);
				class442_41_.method7152(class442_34_, class442_40_.aFloat4915);
				class442_41_.method7152(class442_35_, class442_40_.aFloat4919);
				class442_22_.method7172(class442_41_, 0.8F);
				class442.method7219(Class442.method7168(class442_22_, f));
				class442_37_.method7141();
				class442_40_.method7141();
				class442_39_.method7141();
			}
		}
	}

	static final void method9811(Class665 class665, int i) {
		int i_42_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_42_, -470657682);
		Class240 class240 = Class183.aClass240Array2100[i_42_ >> 16];
		Class671.method13782(class243, class240, class665, 251896980);
	}

	static final void method9812(Class243 class243, Class240 class240, Class665 class665, byte i) {
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		if (Class606.method10056(string, class665, 181111640) != null)
			string = string.substring(0, string.length() - 1);
		class243.anObjectArray2648 = Class103.method1800(string, class665, (byte) -21);
		class243.aBool2606 = true;
	}

	static final void method9813(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = class243.aBool2518 ? 1 : 0;
	}

	static final void method9814(byte i) {
		Class592 class592 = client.aClass509_11072.method8283((short) 16691);
		Class442 class442 = Class208_Sub10.aClass296_Sub1_9923.method5377(-1326742799);
		Class320.anInt3543 = ((int) class442.aFloat4918 - (class592.anInt7798 * 153371143 << 9)) * 1149154509;
		Class142.anInt1657 = -(int) class442.aFloat4915 * -1960018167;
		Class201.anInt2211 = ((int) class442.aFloat4919 - (class592.anInt7799 * -2029646807 << 9)) * 421295465;
		Class700_Sub34.anInt10928 = ((int) ((double) Class208_Sub10.aClass296_Sub1_9923.method5381(-1302229786) * 2607.5945876176133) & 0x3fff) * -290107601;
		Class12.anInt176 = ((int) ((double) Class208_Sub10.aClass296_Sub1_9923.method5382(-1562307280) * 2607.5945876176133) & 0x3fff) * 355973435;
		Class689.anInt8692 = 0;
	}

	static final void method9815(Class665 class665, int i) {
		String string = (String) (class665.anObjectArray8541[(class665.anInt8528 -= 433009517) * 318492261]);
		if (string.startsWith(Class202.method3775(0, 1938244340)) || string.startsWith(Class202.method3775(1, 2033250403)))
			string = string.substring(7);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class6.method585(string, -198499417) ? 1 : 0;
	}

	static boolean method9816(int i) {
		boolean bool = true;
		if (Class99.aClass185_1170 == null) {
			if (Class338.aClass459_3656.method7480(-2123740719 * Class99.anInt1173, -1488850615))
				Class99.aClass185_1170 = Class165.method2665(Class338.aClass459_3656, Class99.anInt1173 * -2123740719);
			else
				bool = false;
		}
		if (Class307.aClass185_3447 == null) {
			if (Class338.aClass459_3656.method7480(Class99.anInt1167 * 1520339693, 945464937))
				Class307.aClass185_3447 = Class165.method2665(Class338.aClass459_3656, 1520339693 * Class99.anInt1167);
			else
				bool = false;
		}
		if (Class195.aClass185_2161 == null) {
			if (Class338.aClass459_3656.method7480(-940537993 * Class510.anInt6974, 1246842359))
				Class195.aClass185_2161 = Class165.method2665(Class338.aClass459_3656, Class510.anInt6974 * -940537993);
			else
				bool = false;
		}
		if (Class99.aClass22_1175 == null) {
			if (Class272.aClass459_3136.method7480((-1430443719 * (Class527_Sub4_Sub3.anInt11697)), 1283993246))
				Class99.aClass22_1175 = (Class211.aClass420_2256.method6690(client.anInterface50_11053, Class527_Sub4_Sub3.anInt11697 * -1430443719, -530973439));
			else
				bool = false;
		}
		if (null == Class651.aClass185_Sub2Array8384) {
			if (Class338.aClass459_3656.method7480((-1430443719 * (Class527_Sub4_Sub3.anInt11697)), 1960951813))
				Class651.aClass185_Sub2Array8384 = ((Class185_Sub2[]) Class165.method2656(Class338.aClass459_3656, (-1430443719 * Class527_Sub4_Sub3.anInt11697)));
			else
				bool = false;
		}
		return bool;
	}

	static final void method9817(Class665 class665, byte i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		Class240 class240 = class674.aClass240_8586;
		Class676_Sub1.method17024(class243, class240, class665, 1612911637);
	}
}
