/* Class649_Sub1_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class649_Sub1_Sub5 extends Class649_Sub1 {
	int anInt11863 = 0;
	public short aShort11864;
	public short aShort11865;
	public boolean aBool11866;
	public short aShort11867;
	Class536_Sub19[] aClass536_Sub19Array11868 = new Class536_Sub19[4];
	byte aByte11869;
	public short aShort11870;

	int method9959(Class536_Sub19[] class536_sub19s, byte i) {
		if (aBool8468) {
			anInt11863 = 0;
			int i_0_ = Math.max(0, aShort11867);
			int i_1_ = Math.min((aClass553_10838.aLongArrayArrayArray7472[aByte10839]).length - 1, aShort11864);
			int i_2_ = Math.max(0, aShort11865);
			int i_3_ = Math.min((aClass553_10838.aLongArrayArrayArray7472[aByte10839][i_0_]).length - 1, aShort11870);
			while_6_: for (/**/; i_0_ <= i_1_; i_0_++) {
				for (/**/; i_2_ <= i_3_; i_2_++) {
					long l = (aClass553_10838.aLongArrayArrayArray7472[aByte10839][i_0_][i_2_]);
					long l_4_ = 0L;
					while_5_: while (l_4_ <= 48L) {
						int i_5_ = (int) (l >>> (int) l_4_ & 0xffffL);
						if (i_5_ <= 0)
							break;
						Class562 class562 = aClass553_10838.aClass562Array7473[i_5_ - 1];
						for (int i_6_ = 0; i_6_ < -1379253193 * anInt11863; i_6_++) {
							if (aClass536_Sub19Array11868[i_6_] == class562.aClass536_Sub19_7546) {
								l_4_ += 16L;
								continue while_5_;
							}
						}
						aClass536_Sub19Array11868[(anInt11863 += -1976258169) * -1379253193 - 1] = class562.aClass536_Sub19_7546;
						if (-1379253193 * anInt11863 == 4)
							break while_6_;
						l_4_ += 16L;
					}
				}
			}
			for (int i_7_ = anInt11863 * -1379253193; i_7_ < 4; i_7_++)
				aClass536_Sub19Array11868[i_7_] = null;
			if (aByte11869 != 0) {
				int i_8_ = aShort11867 - aClass553_10838.anInt7454 * -1629030593;
				int i_9_ = aShort11865 - aClass553_10838.anInt7455 * -1430999951;
				short i_10_;
				int i_11_;
				int i_12_;
				short i_13_;
				if (aByte11869 == 1) {
					if (i_9_ > i_8_) {
						i_10_ = aShort11867;
						i_11_ = aShort11865 - 1;
						i_12_ = 1 + aShort11867;
						i_13_ = aShort11865;
					} else {
						i_10_ = aShort11867;
						i_11_ = 1 + aShort11865;
						i_12_ = aShort11867 - 1;
						i_13_ = aShort11865;
					}
				} else if (i_9_ > -i_8_) {
					i_10_ = aShort11867;
					i_11_ = aShort11865 - 1;
					i_12_ = aShort11867 - 1;
					i_13_ = aShort11865;
				} else {
					i_10_ = aShort11867;
					i_11_ = 1 + aShort11865;
					i_12_ = 1 + aShort11867;
					i_13_ = aShort11865;
				}
				int i_14_ = 0;
				while_8_: for (/**/; i_14_ < anInt11863 * -1379253193; i_14_++) {
					long l = (aClass553_10838.aLongArrayArrayArray7472[aByte10839][i_10_][i_11_]);
					while (l != 0L) {
						Class562 class562 = (aClass553_10838.aClass562Array7473[(int) ((l & 0xffffL) - 1L)]);
						l >>>= 16;
						if (class562.aClass536_Sub19_7546 == aClass536_Sub19Array11868[i_14_])
							continue while_8_;
					}
					l = (aClass553_10838.aLongArrayArrayArray7472[aByte10839][i_12_][i_13_]);
					while (0L != l) {
						Class562 class562 = (aClass553_10838.aClass562Array7473[(int) ((l & 0xffffL) - 1L)]);
						l >>>= 16;
						if (class562.aClass536_Sub19_7546 == aClass536_Sub19Array11868[i_14_])
							continue while_8_;
					}
					for (int i_15_ = i_14_; i_15_ < anInt11863 * -1379253193 - 1; i_15_++)
						aClass536_Sub19Array11868[i_15_] = aClass536_Sub19Array11868[1 + i_15_];
					anInt11863 -= -1976258169;
				}
			}
			aBool8468 = false;
		}
		for (int i_16_ = 0; i_16_ < anInt11863 * -1379253193; i_16_++)
			class536_sub19s[i_16_] = aClass536_Sub19Array11868[i_16_];
		return anInt11863 * -1379253193;
	}

	void method10836(short i) {
		/* empty */
	}

	Class649_Sub1_Sub5(Class553 class553, int i, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_, boolean bool, byte i_25_) {
		super(class553);
		aByte10839 = (byte) i;
		aByte10840 = (byte) i_17_;
		method7841(new Class436((float) i_18_, (float) i_19_, (float) i_20_));
		aShort11867 = (short) i_21_;
		aShort11864 = (short) i_22_;
		aShort11865 = (short) i_23_;
		aShort11870 = (short) i_24_;
		aBool11866 = bool;
		aByte11869 = i_25_;
		for (int i_26_ = 0; i_26_ < 4; i_26_++)
			aClass536_Sub19Array11868[i_26_] = null;
	}

	int method9981(Class536_Sub19[] class536_sub19s) {
		if (aBool8468) {
			anInt11863 = 0;
			int i = Math.max(0, aShort11867);
			int i_27_ = Math.min((aClass553_10838.aLongArrayArrayArray7472[aByte10839]).length - 1, aShort11864);
			int i_28_ = Math.max(0, aShort11865);
			int i_29_ = Math.min((aClass553_10838.aLongArrayArrayArray7472[aByte10839][i]).length - 1, aShort11870);
			while_10_: for (/**/; i <= i_27_; i++) {
				for (/**/; i_28_ <= i_29_; i_28_++) {
					long l = (aClass553_10838.aLongArrayArrayArray7472[aByte10839][i][i_28_]);
					long l_30_ = 0L;
					while_9_: while (l_30_ <= 48L) {
						int i_31_ = (int) (l >>> (int) l_30_ & 0xffffL);
						if (i_31_ <= 0)
							break;
						Class562 class562 = aClass553_10838.aClass562Array7473[i_31_ - 1];
						for (int i_32_ = 0; i_32_ < -1379253193 * anInt11863; i_32_++) {
							if (aClass536_Sub19Array11868[i_32_] == class562.aClass536_Sub19_7546) {
								l_30_ += 16L;
								continue while_9_;
							}
						}
						aClass536_Sub19Array11868[(anInt11863 += -1976258169) * -1379253193 - 1] = class562.aClass536_Sub19_7546;
						if (-1379253193 * anInt11863 == 4)
							break while_10_;
						l_30_ += 16L;
					}
				}
			}
			for (int i_33_ = anInt11863 * -1379253193; i_33_ < 4; i_33_++)
				aClass536_Sub19Array11868[i_33_] = null;
			if (aByte11869 != 0) {
				int i_34_ = aShort11867 - aClass553_10838.anInt7454 * -1629030593;
				int i_35_ = aShort11865 - aClass553_10838.anInt7455 * -1430999951;
				short i_36_;
				int i_37_;
				int i_38_;
				short i_39_;
				if (aByte11869 == 1) {
					if (i_35_ > i_34_) {
						i_36_ = aShort11867;
						i_37_ = aShort11865 - 1;
						i_38_ = 1 + aShort11867;
						i_39_ = aShort11865;
					} else {
						i_36_ = aShort11867;
						i_37_ = 1 + aShort11865;
						i_38_ = aShort11867 - 1;
						i_39_ = aShort11865;
					}
				} else if (i_35_ > -i_34_) {
					i_36_ = aShort11867;
					i_37_ = aShort11865 - 1;
					i_38_ = aShort11867 - 1;
					i_39_ = aShort11865;
				} else {
					i_36_ = aShort11867;
					i_37_ = 1 + aShort11865;
					i_38_ = 1 + aShort11867;
					i_39_ = aShort11865;
				}
				int i_40_ = 0;
				while_12_: for (/**/; i_40_ < anInt11863 * -1379253193; i_40_++) {
					long l = (aClass553_10838.aLongArrayArrayArray7472[aByte10839][i_36_][i_37_]);
					while (l != 0L) {
						Class562 class562 = (aClass553_10838.aClass562Array7473[(int) ((l & 0xffffL) - 1L)]);
						l >>>= 16;
						if (class562.aClass536_Sub19_7546 == aClass536_Sub19Array11868[i_40_])
							continue while_12_;
					}
					l = (aClass553_10838.aLongArrayArrayArray7472[aByte10839][i_38_][i_39_]);
					while (0L != l) {
						Class562 class562 = (aClass553_10838.aClass562Array7473[(int) ((l & 0xffffL) - 1L)]);
						l >>>= 16;
						if (class562.aClass536_Sub19_7546 == aClass536_Sub19Array11868[i_40_])
							continue while_12_;
					}
					for (int i_41_ = i_40_; i_41_ < anInt11863 * -1379253193 - 1; i_41_++)
						aClass536_Sub19Array11868[i_41_] = aClass536_Sub19Array11868[1 + i_41_];
					anInt11863 -= -1976258169;
				}
			}
			aBool8468 = false;
		}
		for (int i = 0; i < anInt11863 * -1379253193; i++)
			class536_sub19s[i] = aClass536_Sub19Array11868[i];
		return anInt11863 * -1379253193;
	}

	boolean method9949(int i) {
		for (int i_42_ = aShort11867; i_42_ <= aShort11864; i_42_++) {
			for (int i_43_ = aShort11865; i_43_ <= aShort11870; i_43_++) {
				int i_44_ = (i_42_ - aClass553_10838.anInt7454 * -1629030593 + 813474573 * aClass553_10838.anInt7447);
				if (i_44_ >= 0 && i_44_ < aClass553_10838.aBoolArrayArray7471.length) {
					int i_45_ = (aClass553_10838.anInt7447 * 813474573 + (i_43_ - -1430999951 * aClass553_10838.anInt7455));
					if (i_45_ >= 0 && i_45_ < aClass553_10838.aBoolArrayArray7471.length && aClass553_10838.aBoolArrayArray7471[i_44_][i_45_])
						return true;
				}
			}
		}
		return false;
	}

	void method10837() {
		/* empty */
	}

	void method10838() {
		/* empty */
	}

	int method9979(Class536_Sub19[] class536_sub19s) {
		if (aBool8468) {
			anInt11863 = 0;
			int i = Math.max(0, aShort11867);
			int i_46_ = Math.min((aClass553_10838.aLongArrayArrayArray7472[aByte10839]).length - 1, aShort11864);
			int i_47_ = Math.max(0, aShort11865);
			int i_48_ = Math.min((aClass553_10838.aLongArrayArrayArray7472[aByte10839][i]).length - 1, aShort11870);
			while_14_: for (/**/; i <= i_46_; i++) {
				for (/**/; i_47_ <= i_48_; i_47_++) {
					long l = (aClass553_10838.aLongArrayArrayArray7472[aByte10839][i][i_47_]);
					long l_49_ = 0L;
					while_13_: while (l_49_ <= 48L) {
						int i_50_ = (int) (l >>> (int) l_49_ & 0xffffL);
						if (i_50_ <= 0)
							break;
						Class562 class562 = aClass553_10838.aClass562Array7473[i_50_ - 1];
						for (int i_51_ = 0; i_51_ < -1379253193 * anInt11863; i_51_++) {
							if (aClass536_Sub19Array11868[i_51_] == class562.aClass536_Sub19_7546) {
								l_49_ += 16L;
								continue while_13_;
							}
						}
						aClass536_Sub19Array11868[(anInt11863 += -1976258169) * -1379253193 - 1] = class562.aClass536_Sub19_7546;
						if (-1379253193 * anInt11863 == 4)
							break while_14_;
						l_49_ += 16L;
					}
				}
			}
			for (int i_52_ = anInt11863 * -1379253193; i_52_ < 4; i_52_++)
				aClass536_Sub19Array11868[i_52_] = null;
			if (aByte11869 != 0) {
				int i_53_ = aShort11867 - aClass553_10838.anInt7454 * -1629030593;
				int i_54_ = aShort11865 - aClass553_10838.anInt7455 * -1430999951;
				short i_55_;
				int i_56_;
				int i_57_;
				short i_58_;
				if (aByte11869 == 1) {
					if (i_54_ > i_53_) {
						i_55_ = aShort11867;
						i_56_ = aShort11865 - 1;
						i_57_ = 1 + aShort11867;
						i_58_ = aShort11865;
					} else {
						i_55_ = aShort11867;
						i_56_ = 1 + aShort11865;
						i_57_ = aShort11867 - 1;
						i_58_ = aShort11865;
					}
				} else if (i_54_ > -i_53_) {
					i_55_ = aShort11867;
					i_56_ = aShort11865 - 1;
					i_57_ = aShort11867 - 1;
					i_58_ = aShort11865;
				} else {
					i_55_ = aShort11867;
					i_56_ = 1 + aShort11865;
					i_57_ = 1 + aShort11867;
					i_58_ = aShort11865;
				}
				int i_59_ = 0;
				while_16_: for (/**/; i_59_ < anInt11863 * -1379253193; i_59_++) {
					long l = (aClass553_10838.aLongArrayArrayArray7472[aByte10839][i_55_][i_56_]);
					while (l != 0L) {
						Class562 class562 = (aClass553_10838.aClass562Array7473[(int) ((l & 0xffffL) - 1L)]);
						l >>>= 16;
						if (class562.aClass536_Sub19_7546 == aClass536_Sub19Array11868[i_59_])
							continue while_16_;
					}
					l = (aClass553_10838.aLongArrayArrayArray7472[aByte10839][i_57_][i_58_]);
					while (0L != l) {
						Class562 class562 = (aClass553_10838.aClass562Array7473[(int) ((l & 0xffffL) - 1L)]);
						l >>>= 16;
						if (class562.aClass536_Sub19_7546 == aClass536_Sub19Array11868[i_59_])
							continue while_16_;
					}
					for (int i_60_ = i_59_; i_60_ < anInt11863 * -1379253193 - 1; i_60_++)
						aClass536_Sub19Array11868[i_60_] = aClass536_Sub19Array11868[1 + i_60_];
					anInt11863 -= -1976258169;
				}
			}
			aBool8468 = false;
		}
		for (int i = 0; i < anInt11863 * -1379253193; i++)
			class536_sub19s[i] = aClass536_Sub19Array11868[i];
		return anInt11863 * -1379253193;
	}

	boolean method9948(GraphicalRenderer class167, int i) {
		return aClass553_10838.aClass544_7426.method6592(aByte10840, aShort11867, aShort11864, aShort11865, aShort11870, method9946(class167, 71332801));
	}

	int method9980(Class536_Sub19[] class536_sub19s) {
		if (aBool8468) {
			anInt11863 = 0;
			int i = Math.max(0, aShort11867);
			int i_61_ = Math.min((aClass553_10838.aLongArrayArrayArray7472[aByte10839]).length - 1, aShort11864);
			int i_62_ = Math.max(0, aShort11865);
			int i_63_ = Math.min((aClass553_10838.aLongArrayArrayArray7472[aByte10839][i]).length - 1, aShort11870);
			while_18_: for (/**/; i <= i_61_; i++) {
				for (/**/; i_62_ <= i_63_; i_62_++) {
					long l = (aClass553_10838.aLongArrayArrayArray7472[aByte10839][i][i_62_]);
					long l_64_ = 0L;
					while_17_: while (l_64_ <= 48L) {
						int i_65_ = (int) (l >>> (int) l_64_ & 0xffffL);
						if (i_65_ <= 0)
							break;
						Class562 class562 = aClass553_10838.aClass562Array7473[i_65_ - 1];
						for (int i_66_ = 0; i_66_ < -1379253193 * anInt11863; i_66_++) {
							if (aClass536_Sub19Array11868[i_66_] == class562.aClass536_Sub19_7546) {
								l_64_ += 16L;
								continue while_17_;
							}
						}
						aClass536_Sub19Array11868[(anInt11863 += -1976258169) * -1379253193 - 1] = class562.aClass536_Sub19_7546;
						if (-1379253193 * anInt11863 == 4)
							break while_18_;
						l_64_ += 16L;
					}
				}
			}
			for (int i_67_ = anInt11863 * -1379253193; i_67_ < 4; i_67_++)
				aClass536_Sub19Array11868[i_67_] = null;
			if (aByte11869 != 0) {
				int i_68_ = aShort11867 - aClass553_10838.anInt7454 * -1629030593;
				int i_69_ = aShort11865 - aClass553_10838.anInt7455 * -1430999951;
				short i_70_;
				int i_71_;
				int i_72_;
				short i_73_;
				if (aByte11869 == 1) {
					if (i_69_ > i_68_) {
						i_70_ = aShort11867;
						i_71_ = aShort11865 - 1;
						i_72_ = 1 + aShort11867;
						i_73_ = aShort11865;
					} else {
						i_70_ = aShort11867;
						i_71_ = 1 + aShort11865;
						i_72_ = aShort11867 - 1;
						i_73_ = aShort11865;
					}
				} else if (i_69_ > -i_68_) {
					i_70_ = aShort11867;
					i_71_ = aShort11865 - 1;
					i_72_ = aShort11867 - 1;
					i_73_ = aShort11865;
				} else {
					i_70_ = aShort11867;
					i_71_ = 1 + aShort11865;
					i_72_ = 1 + aShort11867;
					i_73_ = aShort11865;
				}
				int i_74_ = 0;
				while_20_: for (/**/; i_74_ < anInt11863 * -1379253193; i_74_++) {
					long l = (aClass553_10838.aLongArrayArrayArray7472[aByte10839][i_70_][i_71_]);
					while (l != 0L) {
						Class562 class562 = (aClass553_10838.aClass562Array7473[(int) ((l & 0xffffL) - 1L)]);
						l >>>= 16;
						if (class562.aClass536_Sub19_7546 == aClass536_Sub19Array11868[i_74_])
							continue while_20_;
					}
					l = (aClass553_10838.aLongArrayArrayArray7472[aByte10839][i_72_][i_73_]);
					while (0L != l) {
						Class562 class562 = (aClass553_10838.aClass562Array7473[(int) ((l & 0xffffL) - 1L)]);
						l >>>= 16;
						if (class562.aClass536_Sub19_7546 == aClass536_Sub19Array11868[i_74_])
							continue while_20_;
					}
					for (int i_75_ = i_74_; i_75_ < anInt11863 * -1379253193 - 1; i_75_++)
						aClass536_Sub19Array11868[i_75_] = aClass536_Sub19Array11868[1 + i_75_];
					anInt11863 -= -1976258169;
				}
			}
			aBool8468 = false;
		}
		for (int i = 0; i < anInt11863 * -1379253193; i++)
			class536_sub19s[i] = aClass536_Sub19Array11868[i];
		return anInt11863 * -1379253193;
	}

	boolean method9982(GraphicalRenderer class167) {
		return aClass553_10838.aClass544_7426.method6592(aByte10840, aShort11867, aShort11864, aShort11865, aShort11870, method9946(class167, 71332801));
	}

	boolean method9983() {
		for (int i = aShort11867; i <= aShort11864; i++) {
			for (int i_76_ = aShort11865; i_76_ <= aShort11870; i_76_++) {
				int i_77_ = (i - aClass553_10838.anInt7454 * -1629030593 + 813474573 * aClass553_10838.anInt7447);
				if (i_77_ >= 0 && i_77_ < aClass553_10838.aBoolArrayArray7471.length) {
					int i_78_ = (aClass553_10838.anInt7447 * 813474573 + (i_76_ - -1430999951 * aClass553_10838.anInt7455));
					if (i_78_ >= 0 && i_78_ < aClass553_10838.aBoolArrayArray7471.length && aClass553_10838.aBoolArrayArray7471[i_77_][i_78_])
						return true;
				}
			}
		}
		return false;
	}
}
