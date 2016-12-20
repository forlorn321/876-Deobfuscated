/* Class555 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Class555 {
	public Class561[][][] aClass561ArrayArrayArray7420;
	public int anInt7421;
	int anInt7422;
	int anInt7423 = 5024;
	int anInt7424 = 16;
	float[] aFloatArray7425;
	public Class561[][][] aClass561ArrayArrayArray7426;
	int anInt7427;
	byte[][] aByteArrayArray7428;
	int anInt7429;
	public Class566 aClass566_7430;
	int anInt7431;
	public int anInt7432;
	Class640_Sub1_Sub2[] aClass640_Sub1_Sub2Array7433;
	public Class161[] aClass161Array7434;
	public Class161[] aClass161Array7435;
	int anInt7436 = 10087;
	public Class561[][][] aClass561ArrayArrayArray7437;
	Class67 aClass67_7438;
	int[][] anIntArrayArray7439;
	short[][] aShortArrayArray7440;
	byte[][] aByteArrayArray7441;
	byte[][] aByteArrayArray7442;
	public int anInt7443;
	Class527_Sub16[] aClass527_Sub16Array7444;
	int anInt7445 = 0;
	Class640_Sub1[] aClass640_Sub1Array7446;
	byte[][] aByteArrayArray7447;
	boolean[] aBoolArray7448;
	Class640_Sub1[] aClass640_Sub1Array7449;
	Class640_Sub1[] aClass640_Sub1Array7450;
	Class180 aClass180_7451;
	int anInt7452;
	int anInt7453;
	Class640_Sub1[] aClass640_Sub1Array7454;
	boolean aBool7455;
	public static boolean aBool7456 = true;
	public Class161[] aClass161Array7457;
	int anInt7458;
	int anInt7459;
	int anInt7460;
	int anInt7461;
	int anInt7462 = 5007;
	int anInt7463;
	int anInt7464;
	int anInt7465;
	public int anInt7466;
	boolean[][] aBoolArrayArray7467;
	int anInt7468;
	int anInt7469;
	boolean aBool7470;
	int anInt7471;
	int anInt7472 = 65174;
	static final int anInt7473 = 4;
	int anInt7474;
	long[][][] aLongArrayArrayArray7475;
	Class556[] aClass556Array7476;
	int anInt7477;
	HashMap aHashMap7478;
	HashMap aHashMap7479;
	public Class546 aClass546_7480;
	boolean[][] aBoolArrayArray7481;
	int[] anIntArray7482;
	Class640_Sub1[] aClass640_Sub1Array7483;
	boolean[][] aBoolArrayArray7484;

	void method9217(Class640_Sub1_Sub2 class640_sub1_sub2, boolean bool) {
		int i = Math.min(anInt7443 * -547681223 - 1, Math.max(0, class640_sub1_sub2.aShort11775));
		int i_0_ = Math.min(anInt7443 * -547681223 - 1, Math.max(0, class640_sub1_sub2.aShort11770));
		int i_1_ = Math.min(anInt7432 * -1437024153 - 1, Math.max(0, class640_sub1_sub2.aShort11771));
		int i_2_ = Math.min(-1437024153 * anInt7432 - 1, Math.max(0, class640_sub1_sub2.aShort11772));
		for (int i_3_ = i; i_3_ <= i_0_; i_3_++) {
			for (int i_4_ = i_1_; i_4_ <= i_2_; i_4_++) {
				Class561 class561 = (aClass561ArrayArrayArray7426[class640_sub1_sub2.aByte10864][i_3_][i_4_]);
				if (null != class561) {
					Class562 class562 = class561.aClass562_7558;
					Class562 class562_5_ = null;
					for (/**/; class562 != null; class562 = class562.aClass562_7565) {
						if (class562.aClass640_Sub1_Sub2_7564 == class640_sub1_sub2) {
							if (class562_5_ != null)
								class562_5_.aClass562_7565 = class562.aClass562_7565;
							else
								class561.aClass562_7558 = class562.aClass562_7565;
							class562.method9453(1570789538);
							break;
						}
						class562_5_ = class562;
					}
				}
			}
		}
		if (!bool)
			method9249(class640_sub1_sub2, -99639426);
	}

	public void method9218(int i, int i_6_) {
		/* empty */
	}

	public Class640_Sub1_Sub2 method9219(int i, int i_7_, int i_8_, Interface63 interface63, int i_9_) {
		Class561 class561 = aClass561ArrayArrayArray7426[i][i_7_][i_8_];
		if (null == class561)
			return null;
		for (Class562 class562 = class561.aClass562_7558; class562 != null; class562 = class562.aClass562_7565) {
			Class640_Sub1_Sub2 class640_sub1_sub2 = class562.aClass640_Sub1_Sub2_7564;
			if ((interface63 == null || interface63.method410(class640_sub1_sub2, 179054224)) && class640_sub1_sub2.aShort11775 == i_7_ && class640_sub1_sub2.aShort11771 == i_8_) {
				method9274(class640_sub1_sub2, false, -1854340863);
				return class640_sub1_sub2;
			}
		}
		return null;
	}

	public void method9220(boolean bool, byte i) {
		if (bool) {
			aClass561ArrayArrayArray7426 = aClass561ArrayArrayArray7437;
			aClass161Array7434 = aClass161Array7435;
		} else {
			aClass561ArrayArrayArray7426 = aClass561ArrayArrayArray7420;
			aClass161Array7434 = aClass161Array7457;
		}
		anInt7466 = aClass561ArrayArrayArray7426.length * -896252133;
	}

	public void method9221(int i) {
		for (int i_10_ = 0; i_10_ < anInt7443 * -547681223; i_10_++) {
			for (int i_11_ = 0; i_11_ < anInt7432 * -1437024153; i_11_++) {
				if (null == aClass561ArrayArrayArray7426[0][i_10_][i_11_])
					aClass561ArrayArrayArray7426[0][i_10_][i_11_] = new Class561(0);
			}
		}
	}

	public void method9222(int i, int i_12_, byte i_13_) {
		Class561 class561 = aClass561ArrayArrayArray7426[0][i][i_12_];
		for (int i_14_ = 0; i_14_ < 3; i_14_++) {
			Class561 class561_15_ = (aClass561ArrayArrayArray7426[i_14_][i][i_12_] = aClass561ArrayArrayArray7426[1 + i_14_][i][i_12_]);
			if (null != class561_15_) {
				for (Class562 class562 = class561_15_.aClass562_7558; null != class562; class562 = class562.aClass562_7565) {
					Class640_Sub1_Sub2 class640_sub1_sub2 = class562.aClass640_Sub1_Sub2_7564;
					if (class640_sub1_sub2.aShort11775 == i && class640_sub1_sub2.aShort11771 == i_12_)
						class640_sub1_sub2.aByte10864--;
				}
				if (class561_15_.aClass640_Sub1_Sub4_7556 != null)
					class561_15_.aClass640_Sub1_Sub4_7556.aByte10864--;
				if (null != class561_15_.aClass640_Sub1_Sub3_7553)
					class561_15_.aClass640_Sub1_Sub3_7553.aByte10864--;
				if (null != class561_15_.aClass640_Sub1_Sub3_7562)
					class561_15_.aClass640_Sub1_Sub3_7562.aByte10864--;
				if (class561_15_.aClass640_Sub1_Sub1_7552 != null)
					class561_15_.aClass640_Sub1_Sub1_7552.aByte10864--;
				if (null != class561_15_.aClass640_Sub1_Sub1_7550)
					class561_15_.aClass640_Sub1_Sub1_7550.aByte10864--;
			}
		}
		if (null == aClass561ArrayArrayArray7426[0][i][i_12_]) {
			aClass561ArrayArrayArray7426[0][i][i_12_] = new Class561(0);
			aClass561ArrayArrayArray7426[0][i][i_12_].aByte7555 = (byte) 1;
		}
		aClass561ArrayArrayArray7426[0][i][i_12_].aClass561_7554 = class561;
		aClass561ArrayArrayArray7426[3][i][i_12_] = null;
	}

	Class561 method9223(int i, int i_16_, int i_17_, byte i_18_) {
		if (null == aClass561ArrayArrayArray7426[i][i_16_][i_17_]) {
			boolean bool = (null != aClass561ArrayArrayArray7426[0][i_16_][i_17_] && null != (aClass561ArrayArrayArray7426[0][i_16_][i_17_].aClass561_7554));
			if (bool && i >= anInt7466 * -1609909485 - 1)
				return null;
			method9225(i, i_16_, i_17_, -1815524557);
		}
		return aClass561ArrayArrayArray7426[i][i_16_][i_17_];
	}

	public void method9224(int i, int i_19_, int i_20_, int i_21_) {
		List list = (List) aHashMap7478.get(Integer.valueOf(i));
		if (list != null) {
			Iterator iterator = list.iterator();
			while (iterator.hasNext()) {
				Class556 class556 = (Class556) iterator.next();
				class556.aClass527_Sub16_7495.method16139(i_19_, i_20_, -1499951179);
			}
		}
	}

	public void method9225(int i, int i_22_, int i_23_, int i_24_) {
		boolean bool = (aClass561ArrayArrayArray7426[0][i_22_][i_23_] != null && null != (aClass561ArrayArrayArray7426[0][i_22_][i_23_].aClass561_7554));
		for (int i_25_ = i; i_25_ >= 0; i_25_--) {
			if (null == aClass561ArrayArrayArray7426[i_25_][i_22_][i_23_]) {
				Class561 class561 = (aClass561ArrayArrayArray7426[i_25_][i_22_][i_23_] = new Class561(i_25_));
				if (bool)
					class561.aByte7555++;
			}
		}
	}

	public void method9226(int i, Class161 class161, byte i_26_) {
		aClass161Array7434[i] = class161;
	}

	public int method9227(int i, int i_27_, short i_28_) {
		return (null != aShortArrayArray7440 ? aShortArrayArray7440[i][i_27_] & 0xffff : 0);
	}

	public Class640_Sub1_Sub3 method9228(int i, int i_29_, int i_30_) {
		Class561 class561 = aClass561ArrayArrayArray7426[i][i_29_][i_30_];
		if (null != class561) {
			method9249(class561.aClass640_Sub1_Sub3_7553, -99639426);
			if (null != class561.aClass640_Sub1_Sub3_7553) {
				Class640_Sub1_Sub3 class640_sub1_sub3 = class561.aClass640_Sub1_Sub3_7553;
				class561.aClass640_Sub1_Sub3_7553 = null;
				return class640_sub1_sub3;
			}
		}
		return null;
	}

	public int method9229(int i, int i_31_, int i_32_) {
		return (aByteArrayArray7441 != null ? aByteArrayArray7441[i][i_31_] & 0xff : 0);
	}

	public void method9230(int i, int i_33_, int i_34_, Class640_Sub1_Sub3 class640_sub1_sub3, Class640_Sub1_Sub3 class640_sub1_sub3_35_, int i_36_) {
		Class561 class561 = method9223(i, i_33_, i_34_, (byte) 1);
		if (null != class561) {
			class561.aClass640_Sub1_Sub3_7553 = class640_sub1_sub3;
			class561.aClass640_Sub1_Sub3_7562 = class640_sub1_sub3_35_;
			int i_37_ = aClass161Array7435 == aClass161Array7434 ? 1 : 0;
			if (class640_sub1_sub3.method17069(1849715723)) {
				if (class640_sub1_sub3.method17072(1935969843)) {
					class640_sub1_sub3.aClass640_Sub1_10865 = aClass640_Sub1Array7450[i_37_];
					aClass640_Sub1Array7450[i_37_] = class640_sub1_sub3;
				} else {
					class640_sub1_sub3.aClass640_Sub1_10865 = aClass640_Sub1Array7449[i_37_];
					aClass640_Sub1Array7449[i_37_] = class640_sub1_sub3;
				}
			} else {
				class640_sub1_sub3.aClass640_Sub1_10865 = aClass640_Sub1Array7446[i_37_];
				aClass640_Sub1Array7446[i_37_] = class640_sub1_sub3;
			}
			if (class640_sub1_sub3_35_ != null) {
				if (class640_sub1_sub3_35_.method17069(-666611920)) {
					if (class640_sub1_sub3_35_.method17072(1846932153)) {
						class640_sub1_sub3_35_.aClass640_Sub1_10865 = aClass640_Sub1Array7450[i_37_];
						aClass640_Sub1Array7450[i_37_] = class640_sub1_sub3_35_;
					} else {
						class640_sub1_sub3_35_.aClass640_Sub1_10865 = aClass640_Sub1Array7449[i_37_];
						aClass640_Sub1Array7449[i_37_] = class640_sub1_sub3_35_;
					}
				} else {
					class640_sub1_sub3_35_.aClass640_Sub1_10865 = aClass640_Sub1Array7446[i_37_];
					aClass640_Sub1Array7446[i_37_] = class640_sub1_sub3_35_;
				}
			}
		}
	}

	public Class640_Sub1_Sub1 method9231(int i, int i_38_, int i_39_) {
		Class561 class561 = aClass561ArrayArrayArray7426[i][i_38_][i_39_];
		if (class561 == null)
			return null;
		return class561.aClass640_Sub1_Sub1_7552;
	}

	public int method9232(int i, int i_40_, int i_41_) {
		return (null != aByteArrayArray7428 ? aByteArrayArray7428[i][i_40_] & 0xff : 0);
	}

	public void method9233(int i, int i_42_, int i_43_, int i_44_, int i_45_, int i_46_, int i_47_, int i_48_, byte i_49_) {
		if (anIntArrayArray7439 != null)
			anIntArrayArray7439[i][i_42_] = ~0xffffff | i_43_;
		if (null != aShortArrayArray7440)
			aShortArrayArray7440[i][i_42_] = (short) i_44_;
		if (aByteArrayArray7441 != null)
			aByteArrayArray7441[i][i_42_] = (byte) i_45_;
		if (aByteArrayArray7442 != null)
			aByteArrayArray7442[i][i_42_] = (byte) i_46_;
		if (null != aByteArrayArray7447)
			aByteArrayArray7447[i][i_42_] = (byte) i_47_;
		if (null != aByteArrayArray7428)
			aByteArrayArray7428[i][i_42_] = (byte) i_48_;
	}

	public void method9234(int i, int i_50_, int i_51_, Class640_Sub1_Sub4 class640_sub1_sub4, int i_52_) {
		Class561 class561 = method9223(i, i_50_, i_51_, (byte) 1);
		if (class561 != null) {
			class561.aClass640_Sub1_Sub4_7556 = class640_sub1_sub4;
			int i_53_ = aClass161Array7435 == aClass161Array7434 ? 1 : 0;
			if (class640_sub1_sub4.method17069(1644450606)) {
				if (class640_sub1_sub4.method17072(1649582701)) {
					class640_sub1_sub4.aClass640_Sub1_10865 = aClass640_Sub1Array7450[i_53_];
					aClass640_Sub1Array7450[i_53_] = class640_sub1_sub4;
				} else {
					class640_sub1_sub4.aClass640_Sub1_10865 = aClass640_Sub1Array7449[i_53_];
					aClass640_Sub1Array7449[i_53_] = class640_sub1_sub4;
				}
			} else {
				class640_sub1_sub4.aClass640_Sub1_10865 = aClass640_Sub1Array7446[i_53_];
				aClass640_Sub1Array7446[i_53_] = class640_sub1_sub4;
			}
		}
	}

	public void method9235(int i, int i_54_, int i_55_, Class640_Sub1_Sub1 class640_sub1_sub1, Class640_Sub1_Sub1 class640_sub1_sub1_56_) {
		Class561 class561 = method9223(i, i_54_, i_55_, (byte) 1);
		if (null != class561) {
			class561.aClass640_Sub1_Sub1_7552 = class640_sub1_sub1;
			class561.aClass640_Sub1_Sub1_7550 = class640_sub1_sub1_56_;
			int i_57_ = aClass161Array7435 == aClass161Array7434 ? 1 : 0;
			if (class640_sub1_sub1.method17069(1121270596)) {
				if (class640_sub1_sub1.method17072(1885718190)) {
					class640_sub1_sub1.aClass640_Sub1_10865 = aClass640_Sub1Array7450[i_57_];
					aClass640_Sub1Array7450[i_57_] = class640_sub1_sub1;
				} else {
					class640_sub1_sub1.aClass640_Sub1_10865 = aClass640_Sub1Array7449[i_57_];
					aClass640_Sub1Array7449[i_57_] = class640_sub1_sub1;
				}
			} else {
				class640_sub1_sub1.aClass640_Sub1_10865 = aClass640_Sub1Array7446[i_57_];
				aClass640_Sub1Array7446[i_57_] = class640_sub1_sub1;
			}
			if (class640_sub1_sub1_56_ != null) {
				if (class640_sub1_sub1_56_.method17069(-955032955)) {
					if (class640_sub1_sub1_56_.method17072(967562541)) {
						class640_sub1_sub1_56_.aClass640_Sub1_10865 = aClass640_Sub1Array7450[i_57_];
						aClass640_Sub1Array7450[i_57_] = class640_sub1_sub1_56_;
					} else {
						class640_sub1_sub1_56_.aClass640_Sub1_10865 = aClass640_Sub1Array7449[i_57_];
						aClass640_Sub1Array7449[i_57_] = class640_sub1_sub1_56_;
					}
				} else {
					class640_sub1_sub1_56_.aClass640_Sub1_10865 = aClass640_Sub1Array7446[i_57_];
					aClass640_Sub1Array7446[i_57_] = class640_sub1_sub1_56_;
				}
			}
		}
	}

	void method9236(Class640_Sub1 class640_sub1, int i, int i_58_, int i_59_, int i_60_, int i_61_) {
		boolean bool = true;
		int i_62_ = i_58_;
		int i_63_ = i_60_ + i_58_;
		int i_64_ = i_59_ - 1;
		int i_65_ = i_59_ + i_61_;
		for (int i_66_ = i; i_66_ <= i + 1; i_66_++) {
			if (anInt7466 * -1609909485 != i_66_) {
				for (int i_67_ = i_62_; i_67_ <= i_63_; i_67_++) {
					if (i_67_ >= 0 && i_67_ < -547681223 * anInt7443) {
						for (int i_68_ = i_64_; i_68_ <= i_65_; i_68_++) {
							if (i_68_ >= 0 && i_68_ < anInt7432 * -1437024153 && (!bool || i_67_ >= i_63_ || i_68_ >= i_65_ || i_68_ < i_59_ && i_58_ != i_67_)) {
								Class561 class561 = (aClass561ArrayArrayArray7426[i_66_][i_67_][i_68_]);
								if (class561 != null) {
									int i_69_ = (((aClass161Array7434[i_66_].method2595(i_67_, i_68_, (byte) 27)) + (aClass161Array7434[i_66_].method2595(i_67_ + 1, i_68_, (byte) 84)) + (aClass161Array7434[i_66_].method2595(i_67_, 1 + i_68_, (byte) 113)) + (aClass161Array7434[i_66_].method2595(1 + i_67_, 1 + i_68_, (byte) 114))) / 4
											- ((aClass161Array7434[i].method2595(i_58_, i_59_, (byte) 124)) + (aClass161Array7434[i].method2595(1 + i_58_, i_59_, (byte) 8)) + (aClass161Array7434[i].method2595(i_58_, i_59_ + 1, (byte) 114)) + (aClass161Array7434[i].method2595(1 + i_58_, 1 + i_59_, (byte) 118))) / 4);
									Class640_Sub1_Sub3 class640_sub1_sub3 = class561.aClass640_Sub1_Sub3_7553;
									Class640_Sub1_Sub3 class640_sub1_sub3_70_ = class561.aClass640_Sub1_Sub3_7562;
									if (null != class640_sub1_sub3 && class640_sub1_sub3.method17037(358746716))
										class640_sub1.method17038(aClass180_7451, class640_sub1_sub3, ((-1478371119 * anInt7422 * (i_67_ - i_58_)) + (1 - i_60_) * (anInt7471 * -1485744437)), i_69_, ((anInt7471 * -1485744437 * (1 - i_61_)) + (anInt7422 * -1478371119 * (i_68_ - i_59_))), bool, 2056627232);
									if (null != class640_sub1_sub3_70_ && class640_sub1_sub3_70_.method17037(-912816269))
										class640_sub1.method17038(aClass180_7451, class640_sub1_sub3_70_, ((i_67_ - i_58_) * (anInt7422 * -1478371119) + (1 - i_60_) * (anInt7471 * -1485744437)), i_69_, ((i_68_ - i_59_) * (-1478371119 * anInt7422) + (1 - i_61_) * (-1485744437 * anInt7471)), bool, 2056627232);
									for (Class562 class562 = class561.aClass562_7558; null != class562; class562 = class562.aClass562_7565) {
										Class640_Sub1_Sub2 class640_sub1_sub2 = (class562.aClass640_Sub1_Sub2_7564);
										if (class640_sub1_sub2 != null && class640_sub1_sub2.method17037(894397741) && ((class640_sub1_sub2.aShort11775 == i_67_) || i_67_ == i_62_) && (i_68_ == (class640_sub1_sub2.aShort11771) || i_68_ == i_64_)) {
											int i_71_ = 1 + ((class640_sub1_sub2.aShort11770) - (class640_sub1_sub2.aShort11775));
											int i_72_ = 1 + ((class640_sub1_sub2.aShort11772) - (class640_sub1_sub2.aShort11771));
											class640_sub1.method17038(aClass180_7451, class640_sub1_sub2, (((i_71_ - i_60_) * (-1485744437 * anInt7471)) + (((class640_sub1_sub2.aShort11775) - i_58_) * (-1478371119 * anInt7422))), i_69_, ((((class640_sub1_sub2.aShort11771) - i_59_) * (anInt7422 * -1478371119)) + (anInt7471 * -1485744437 * (i_72_ - i_61_))), bool, 2056627232);
										}
									}
								}
							}
						}
					}
				}
				i_62_--;
				bool = false;
			}
		}
	}

	public void method9237(int i, int i_73_, int i_74_, Class640_Sub1_Sub1 class640_sub1_sub1, Class640_Sub1_Sub1 class640_sub1_sub1_75_, short i_76_) {
		Class561 class561 = method9223(i, i_73_, i_74_, (byte) 1);
		if (null != class561) {
			class561.aClass640_Sub1_Sub1_7552 = class640_sub1_sub1;
			class561.aClass640_Sub1_Sub1_7550 = class640_sub1_sub1_75_;
			int i_77_ = aClass161Array7435 == aClass161Array7434 ? 1 : 0;
			if (class640_sub1_sub1.method17069(1628655764)) {
				if (class640_sub1_sub1.method17072(721177101)) {
					class640_sub1_sub1.aClass640_Sub1_10865 = aClass640_Sub1Array7450[i_77_];
					aClass640_Sub1Array7450[i_77_] = class640_sub1_sub1;
				} else {
					class640_sub1_sub1.aClass640_Sub1_10865 = aClass640_Sub1Array7449[i_77_];
					aClass640_Sub1Array7449[i_77_] = class640_sub1_sub1;
				}
			} else {
				class640_sub1_sub1.aClass640_Sub1_10865 = aClass640_Sub1Array7446[i_77_];
				aClass640_Sub1Array7446[i_77_] = class640_sub1_sub1;
			}
			if (class640_sub1_sub1_75_ != null) {
				if (class640_sub1_sub1_75_.method17069(2000529914)) {
					if (class640_sub1_sub1_75_.method17072(946229828)) {
						class640_sub1_sub1_75_.aClass640_Sub1_10865 = aClass640_Sub1Array7450[i_77_];
						aClass640_Sub1Array7450[i_77_] = class640_sub1_sub1_75_;
					} else {
						class640_sub1_sub1_75_.aClass640_Sub1_10865 = aClass640_Sub1Array7449[i_77_];
						aClass640_Sub1Array7449[i_77_] = class640_sub1_sub1_75_;
					}
				} else {
					class640_sub1_sub1_75_.aClass640_Sub1_10865 = aClass640_Sub1Array7446[i_77_];
					aClass640_Sub1Array7446[i_77_] = class640_sub1_sub1_75_;
				}
			}
		}
	}

	public void method9238(int i, int i_78_, int i_79_, Class640_Sub1_Sub3 class640_sub1_sub3, Class640_Sub1_Sub3 class640_sub1_sub3_80_) {
		Class561 class561 = method9223(i, i_78_, i_79_, (byte) 1);
		if (null != class561) {
			class561.aClass640_Sub1_Sub3_7553 = class640_sub1_sub3;
			class561.aClass640_Sub1_Sub3_7562 = class640_sub1_sub3_80_;
			int i_81_ = aClass161Array7435 == aClass161Array7434 ? 1 : 0;
			if (class640_sub1_sub3.method17069(2089746687)) {
				if (class640_sub1_sub3.method17072(121159995)) {
					class640_sub1_sub3.aClass640_Sub1_10865 = aClass640_Sub1Array7450[i_81_];
					aClass640_Sub1Array7450[i_81_] = class640_sub1_sub3;
				} else {
					class640_sub1_sub3.aClass640_Sub1_10865 = aClass640_Sub1Array7449[i_81_];
					aClass640_Sub1Array7449[i_81_] = class640_sub1_sub3;
				}
			} else {
				class640_sub1_sub3.aClass640_Sub1_10865 = aClass640_Sub1Array7446[i_81_];
				aClass640_Sub1Array7446[i_81_] = class640_sub1_sub3;
			}
			if (class640_sub1_sub3_80_ != null) {
				if (class640_sub1_sub3_80_.method17069(1228575449)) {
					if (class640_sub1_sub3_80_.method17072(251674534)) {
						class640_sub1_sub3_80_.aClass640_Sub1_10865 = aClass640_Sub1Array7450[i_81_];
						aClass640_Sub1Array7450[i_81_] = class640_sub1_sub3_80_;
					} else {
						class640_sub1_sub3_80_.aClass640_Sub1_10865 = aClass640_Sub1Array7449[i_81_];
						aClass640_Sub1Array7449[i_81_] = class640_sub1_sub3_80_;
					}
				} else {
					class640_sub1_sub3_80_.aClass640_Sub1_10865 = aClass640_Sub1Array7446[i_81_];
					aClass640_Sub1Array7446[i_81_] = class640_sub1_sub3_80_;
				}
			}
		}
	}

	void method9239(Class640_Sub1 class640_sub1) {
		if (null != class640_sub1) {
			class640_sub1.method10620();
			for (int i = 0; i < 2; i++) {
				Class640_Sub1 class640_sub1_82_ = null;
				for (Class640_Sub1 class640_sub1_83_ = aClass640_Sub1Array7449[i]; null != class640_sub1_83_; class640_sub1_83_ = class640_sub1_83_.aClass640_Sub1_10865) {
					if (class640_sub1 == class640_sub1_83_) {
						if (class640_sub1_82_ != null)
							class640_sub1_82_.aClass640_Sub1_10865 = class640_sub1_83_.aClass640_Sub1_10865;
						else
							aClass640_Sub1Array7449[i] = class640_sub1_83_.aClass640_Sub1_10865;
						return;
					}
					class640_sub1_82_ = class640_sub1_83_;
				}
				class640_sub1_82_ = null;
				for (Class640_Sub1 class640_sub1_84_ = aClass640_Sub1Array7450[i]; null != class640_sub1_84_; class640_sub1_84_ = class640_sub1_84_.aClass640_Sub1_10865) {
					if (class640_sub1 == class640_sub1_84_) {
						if (class640_sub1_82_ != null)
							class640_sub1_82_.aClass640_Sub1_10865 = class640_sub1_84_.aClass640_Sub1_10865;
						else
							aClass640_Sub1Array7450[i] = class640_sub1_84_.aClass640_Sub1_10865;
						return;
					}
					class640_sub1_82_ = class640_sub1_84_;
				}
				class640_sub1_82_ = null;
				for (Class640_Sub1 class640_sub1_85_ = aClass640_Sub1Array7446[i]; class640_sub1_85_ != null; class640_sub1_85_ = class640_sub1_85_.aClass640_Sub1_10865) {
					if (class640_sub1 == class640_sub1_85_) {
						if (null != class640_sub1_82_)
							class640_sub1_82_.aClass640_Sub1_10865 = class640_sub1_85_.aClass640_Sub1_10865;
						else
							aClass640_Sub1Array7446[i] = class640_sub1_85_.aClass640_Sub1_10865;
						return;
					}
					class640_sub1_82_ = class640_sub1_85_;
				}
			}
		}
	}

	public Class640_Sub1_Sub3 method9240(int i, int i_86_, int i_87_) {
		Class561 class561 = aClass561ArrayArrayArray7426[i][i_86_][i_87_];
		if (null != class561) {
			method9249(class561.aClass640_Sub1_Sub3_7553, -99639426);
			if (null != class561.aClass640_Sub1_Sub3_7553) {
				Class640_Sub1_Sub3 class640_sub1_sub3 = class561.aClass640_Sub1_Sub3_7553;
				class561.aClass640_Sub1_Sub3_7553 = null;
				return class640_sub1_sub3;
			}
		}
		return null;
	}

	public Class640_Sub1_Sub3 method9241(int i, int i_88_, int i_89_, int i_90_) {
		Class561 class561 = aClass561ArrayArrayArray7426[i][i_88_][i_89_];
		if (null != class561) {
			method9249(class561.aClass640_Sub1_Sub3_7553, -99639426);
			if (null != class561.aClass640_Sub1_Sub3_7553) {
				Class640_Sub1_Sub3 class640_sub1_sub3 = class561.aClass640_Sub1_Sub3_7553;
				class561.aClass640_Sub1_Sub3_7553 = null;
				return class640_sub1_sub3;
			}
		}
		return null;
	}

	public void method9242(int i) {
		/* empty */
	}

	public Class640_Sub1_Sub1 method9243(int i, int i_91_, int i_92_, byte i_93_) {
		Class561 class561 = aClass561ArrayArrayArray7426[i][i_91_][i_92_];
		if (null != class561) {
			method9249(class561.aClass640_Sub1_Sub1_7552, -99639426);
			if (null != class561.aClass640_Sub1_Sub1_7552) {
				Class640_Sub1_Sub1 class640_sub1_sub1 = class561.aClass640_Sub1_Sub1_7552;
				class561.aClass640_Sub1_Sub1_7552 = null;
				return class640_sub1_sub1;
			}
		}
		return null;
	}

	public Class640_Sub1_Sub1 method9244(int i, int i_94_, int i_95_, byte i_96_) {
		Class561 class561 = aClass561ArrayArrayArray7426[i][i_94_][i_95_];
		if (class561 != null) {
			method9249(class561.aClass640_Sub1_Sub1_7550, -99639426);
			if (null != class561.aClass640_Sub1_Sub1_7550) {
				Class640_Sub1_Sub1 class640_sub1_sub1 = class561.aClass640_Sub1_Sub1_7550;
				class561.aClass640_Sub1_Sub1_7550 = null;
				return class640_sub1_sub1;
			}
		}
		return null;
	}

	public int method9245(int i, int i_97_) {
		return (null != aByteArrayArray7428 ? aByteArrayArray7428[i][i_97_] & 0xff : 0);
	}

	public Class640_Sub1_Sub5 method9246(int i, int i_98_, int i_99_, byte i_100_) {
		Class561 class561 = aClass561ArrayArrayArray7426[i][i_98_][i_99_];
		if (null == class561)
			return null;
		Class640_Sub1_Sub5 class640_sub1_sub5 = class561.aClass640_Sub1_Sub5_7557;
		class561.aClass640_Sub1_Sub5_7557 = null;
		method9249(class640_sub1_sub5, -99639426);
		return class640_sub1_sub5;
	}

	public int method9247(int i, int i_101_, int i_102_) {
		return (aByteArrayArray7442 != null ? aByteArrayArray7442[i][i_101_] & 0xff : 0);
	}

	void method9248(Class640_Sub1[] class640_sub1s, int i, int i_103_) {
		if (i < i_103_) {
			int i_104_ = (i + i_103_) / 2;
			int i_105_ = i;
			Class640_Sub1 class640_sub1 = class640_sub1s[i_104_];
			class640_sub1s[i_104_] = class640_sub1s[i_103_];
			class640_sub1s[i_103_] = class640_sub1;
			int i_106_ = class640_sub1.anInt10866 * 1971671255;
			for (int i_107_ = i; i_107_ < i_103_; i_107_++) {
				if (class640_sub1s[i_107_].anInt10866 * 1971671255 < i_106_ + (i_107_ & 0x1)) {
					Class640_Sub1 class640_sub1_108_ = class640_sub1s[i_107_];
					class640_sub1s[i_107_] = class640_sub1s[i_105_];
					class640_sub1s[i_105_++] = class640_sub1_108_;
				}
			}
			class640_sub1s[i_103_] = class640_sub1s[i_105_];
			class640_sub1s[i_105_] = class640_sub1;
			method9264(class640_sub1s, i, i_105_ - 1);
			method9264(class640_sub1s, 1 + i_105_, i_103_);
		}
	}

	void method9249(Class640_Sub1 class640_sub1, int i) {
		if (null != class640_sub1) {
			class640_sub1.method10620();
			for (int i_109_ = 0; i_109_ < 2; i_109_++) {
				Class640_Sub1 class640_sub1_110_ = null;
				for (Class640_Sub1 class640_sub1_111_ = aClass640_Sub1Array7449[i_109_]; null != class640_sub1_111_; class640_sub1_111_ = class640_sub1_111_.aClass640_Sub1_10865) {
					if (class640_sub1 == class640_sub1_111_) {
						if (class640_sub1_110_ != null)
							class640_sub1_110_.aClass640_Sub1_10865 = class640_sub1_111_.aClass640_Sub1_10865;
						else
							aClass640_Sub1Array7449[i_109_] = class640_sub1_111_.aClass640_Sub1_10865;
						return;
					}
					class640_sub1_110_ = class640_sub1_111_;
				}
				class640_sub1_110_ = null;
				for (Class640_Sub1 class640_sub1_112_ = aClass640_Sub1Array7450[i_109_]; null != class640_sub1_112_; class640_sub1_112_ = class640_sub1_112_.aClass640_Sub1_10865) {
					if (class640_sub1 == class640_sub1_112_) {
						if (class640_sub1_110_ != null)
							class640_sub1_110_.aClass640_Sub1_10865 = class640_sub1_112_.aClass640_Sub1_10865;
						else
							aClass640_Sub1Array7450[i_109_] = class640_sub1_112_.aClass640_Sub1_10865;
						return;
					}
					class640_sub1_110_ = class640_sub1_112_;
				}
				class640_sub1_110_ = null;
				for (Class640_Sub1 class640_sub1_113_ = aClass640_Sub1Array7446[i_109_]; class640_sub1_113_ != null; class640_sub1_113_ = class640_sub1_113_.aClass640_Sub1_10865) {
					if (class640_sub1 == class640_sub1_113_) {
						if (null != class640_sub1_110_)
							class640_sub1_110_.aClass640_Sub1_10865 = class640_sub1_113_.aClass640_Sub1_10865;
						else
							aClass640_Sub1Array7446[i_109_] = class640_sub1_113_.aClass640_Sub1_10865;
						return;
					}
					class640_sub1_110_ = class640_sub1_113_;
				}
			}
		}
	}

	public Class640_Sub1_Sub5 method9250(int i, int i_114_, int i_115_) {
		Class561 class561 = aClass561ArrayArrayArray7426[i][i_114_][i_115_];
		if (class561 == null)
			return null;
		return class561.aClass640_Sub1_Sub5_7557;
	}

	public Class640_Sub1_Sub3 method9251(int i, int i_116_, int i_117_, byte i_118_) {
		Class561 class561 = aClass561ArrayArrayArray7426[i][i_116_][i_117_];
		if (class561 == null)
			return null;
		return class561.aClass640_Sub1_Sub3_7562;
	}

	public Class640_Sub1_Sub1 method9252(int i, int i_119_, int i_120_, int i_121_) {
		Class561 class561 = aClass561ArrayArrayArray7426[i][i_119_][i_120_];
		if (class561 == null)
			return null;
		return class561.aClass640_Sub1_Sub1_7552;
	}

	public void method9253(int i, int i_122_, int i_123_, Class640_Sub1_Sub4 class640_sub1_sub4) {
		Class561 class561 = method9223(i, i_122_, i_123_, (byte) 1);
		if (class561 != null) {
			class561.aClass640_Sub1_Sub4_7556 = class640_sub1_sub4;
			int i_124_ = aClass161Array7435 == aClass161Array7434 ? 1 : 0;
			if (class640_sub1_sub4.method17069(-1093677576)) {
				if (class640_sub1_sub4.method17072(51081416)) {
					class640_sub1_sub4.aClass640_Sub1_10865 = aClass640_Sub1Array7450[i_124_];
					aClass640_Sub1Array7450[i_124_] = class640_sub1_sub4;
				} else {
					class640_sub1_sub4.aClass640_Sub1_10865 = aClass640_Sub1Array7449[i_124_];
					aClass640_Sub1Array7449[i_124_] = class640_sub1_sub4;
				}
			} else {
				class640_sub1_sub4.aClass640_Sub1_10865 = aClass640_Sub1Array7446[i_124_];
				aClass640_Sub1Array7446[i_124_] = class640_sub1_sub4;
			}
		}
	}

	public Class640_Sub1_Sub2 method9254(int i, int i_125_, int i_126_, Interface63 interface63, int i_127_) {
		Class561 class561 = aClass561ArrayArrayArray7426[i][i_125_][i_126_];
		if (class561 == null)
			return null;
		for (Class562 class562 = class561.aClass562_7558; class562 != null; class562 = class562.aClass562_7565) {
			Class640_Sub1_Sub2 class640_sub1_sub2 = class562.aClass640_Sub1_Sub2_7564;
			if ((null == interface63 || interface63.method410(class640_sub1_sub2, -1309597661)) && i_125_ == class640_sub1_sub2.aShort11775 && i_126_ == class640_sub1_sub2.aShort11771)
				return class640_sub1_sub2;
		}
		return null;
	}

	public HashMap method9255() {
		aHashMap7479.clear();
		Iterator iterator = aHashMap7478.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry entry = (Map.Entry) iterator.next();
			aHashMap7479.put(entry.getKey(), (((Class556) ((List) entry.getValue()).get(0)).aClass527_Sub16_7495));
		}
		return aHashMap7479;
	}

	public Class640_Sub1_Sub4 method9256(int i, int i_128_, int i_129_, int i_130_) {
		Class561 class561 = aClass561ArrayArrayArray7426[i][i_128_][i_129_];
		if (class561 == null || null == class561.aClass640_Sub1_Sub4_7556)
			return null;
		return class561.aClass640_Sub1_Sub4_7556;
	}

	public void method9257() {
		for (int i = 0; i < -1609909485 * anInt7466; i++) {
			for (int i_131_ = 0; i_131_ < anInt7443 * -547681223; i_131_++) {
				for (int i_132_ = 0; i_132_ < anInt7432 * -1437024153; i_132_++) {
					Class561 class561 = aClass561ArrayArrayArray7426[i][i_131_][i_132_];
					if (class561 != null) {
						Class640_Sub1_Sub3 class640_sub1_sub3 = class561.aClass640_Sub1_Sub3_7553;
						Class640_Sub1_Sub3 class640_sub1_sub3_133_ = class561.aClass640_Sub1_Sub3_7562;
						if (class640_sub1_sub3 != null && class640_sub1_sub3.method17037(-51872641)) {
							method9236(class640_sub1_sub3, i, i_131_, i_132_, 1, 1);
							if (null != class640_sub1_sub3_133_ && class640_sub1_sub3_133_.method17037(-1308962721)) {
								method9236(class640_sub1_sub3_133_, i, i_131_, i_132_, 1, 1);
								class640_sub1_sub3_133_.method17038(aClass180_7451, class640_sub1_sub3, 0, 0, 0, false, 2056627232);
								class640_sub1_sub3_133_.method17039(864184823);
							}
							class640_sub1_sub3.method17039(-1291397582);
						}
						for (Class562 class562 = class561.aClass562_7558; class562 != null; class562 = class562.aClass562_7565) {
							Class640_Sub1_Sub2 class640_sub1_sub2 = class562.aClass640_Sub1_Sub2_7564;
							if (null != class640_sub1_sub2 && class640_sub1_sub2.method17037(179298627)) {
								method9236(class640_sub1_sub2, i, i_131_, i_132_, (class640_sub1_sub2.aShort11770 - class640_sub1_sub2.aShort11775 + 1), (class640_sub1_sub2.aShort11772 - class640_sub1_sub2.aShort11771 + 1));
								class640_sub1_sub2.method17039(-762467704);
							}
						}
						Class640_Sub1_Sub4 class640_sub1_sub4 = class561.aClass640_Sub1_Sub4_7556;
						if (null != class640_sub1_sub4 && class640_sub1_sub4.method17037(-401863318)) {
							method9258(class640_sub1_sub4, i, i_131_, i_132_, -487223881);
							class640_sub1_sub4.method17039(464574305);
						}
					}
				}
			}
		}
	}

	void method9258(Class640_Sub1 class640_sub1, int i, int i_134_, int i_135_, int i_136_) {
		if (i_134_ < -547681223 * anInt7443) {
			Class561 class561 = aClass561ArrayArrayArray7426[i][1 + i_134_][i_135_];
			if (class561 != null && class561.aClass640_Sub1_Sub4_7556 != null && class561.aClass640_Sub1_Sub4_7556.method17037(673297694)) {
				int i_137_ = ((aClass161Array7434[i].method2595(i_134_ + 1, i_135_, (byte) 69) + aClass161Array7434[i].method2595(i_134_ + 1 + 1, i_135_, (byte) 122) + aClass161Array7434[i].method2595(i_134_ + 1, i_135_ + 1, (byte) 8) + aClass161Array7434[i].method2595(1 + i_134_ + 1, i_135_ + 1, (byte) 29)) / 4
						- (aClass161Array7434[i].method2595(i_134_, i_135_, (byte) 55) + aClass161Array7434[i].method2595(1 + i_134_, i_135_, (byte) 69) + aClass161Array7434[i].method2595(i_134_, i_135_ + 1, (byte) 89) + aClass161Array7434[i].method2595(1 + i_134_, i_135_ + 1, (byte) 73)) / 4);
				class640_sub1.method17038(aClass180_7451, class561.aClass640_Sub1_Sub4_7556, -1478371119 * anInt7422, i_137_, 0, true, 2056627232);
			}
		}
		if (i_135_ < anInt7443 * -547681223) {
			Class561 class561 = aClass561ArrayArrayArray7426[i][i_134_][1 + i_135_];
			if (null != class561 && null != class561.aClass640_Sub1_Sub4_7556 && class561.aClass640_Sub1_Sub4_7556.method17037(563061010)) {
				int i_138_ = ((aClass161Array7434[i].method2595(i_134_, i_135_, (byte) 22) + aClass161Array7434[i].method2595(1 + i_134_, i_135_ + 1, (byte) 91) + aClass161Array7434[i].method2595(i_134_, 1 + (i_135_ + 1), (byte) 94) + aClass161Array7434[i].method2595(i_134_ + 1, 1 + i_135_ + 1, (byte) 33)) / 4
						- (aClass161Array7434[i].method2595(i_134_, i_135_, (byte) 45) + aClass161Array7434[i].method2595(i_134_ + 1, i_135_, (byte) 29) + aClass161Array7434[i].method2595(i_134_, i_135_ + 1, (byte) 82) + aClass161Array7434[i].method2595(i_134_ + 1, i_135_ + 1, (byte) 23)) / 4);
				class640_sub1.method17038(aClass180_7451, class561.aClass640_Sub1_Sub4_7556, 0, i_138_, anInt7422 * -1478371119, true, 2056627232);
			}
		}
		if (i_134_ < -547681223 * anInt7443 && i_135_ < -1437024153 * anInt7432) {
			Class561 class561 = aClass561ArrayArrayArray7426[i][1 + i_134_][1 + i_135_];
			if (null != class561 && null != class561.aClass640_Sub1_Sub4_7556 && class561.aClass640_Sub1_Sub4_7556.method17037(167710986)) {
				int i_139_ = ((aClass161Array7434[i].method2595(1 + i_134_, i_135_ + 1, (byte) 110) + aClass161Array7434[i].method2595(i_134_ + 1 + 1, i_135_ + 1, (byte) 112) + aClass161Array7434[i].method2595(1 + i_134_, 1 + i_135_ + 1, (byte) 28) + aClass161Array7434[i].method2595(1 + (1 + i_134_), 1 + (1 + i_135_), (byte) 15)) / 4
						- (aClass161Array7434[i].method2595(i_134_, i_135_, (byte) 126) + aClass161Array7434[i].method2595(i_134_ + 1, i_135_, (byte) 106) + aClass161Array7434[i].method2595(i_134_, i_135_ + 1, (byte) 82) + aClass161Array7434[i].method2595(1 + i_134_, i_135_ + 1, (byte) 85)) / 4);
				class640_sub1.method17038(aClass180_7451, class561.aClass640_Sub1_Sub4_7556, -1478371119 * anInt7422, i_139_, -1478371119 * anInt7422, true, 2056627232);
			}
		}
		if (i_134_ < -547681223 * anInt7443 && i_135_ > 0) {
			Class561 class561 = aClass561ArrayArrayArray7426[i][i_134_ + 1][i_135_ - 1];
			if (class561 != null && null != class561.aClass640_Sub1_Sub4_7556 && class561.aClass640_Sub1_Sub4_7556.method17037(48142017)) {
				int i_140_ = ((aClass161Array7434[i].method2595(1 + i_134_, i_135_ - 1, (byte) 102) + aClass161Array7434[i].method2595(1 + (i_134_ + 1), i_135_ - 1, (byte) 127) + aClass161Array7434[i].method2595(1 + i_134_, i_135_ + 1 - 1, (byte) 119) + aClass161Array7434[i].method2595(1 + (i_134_ + 1), 1 + i_135_ - 1, (byte) 61)) / 4
						- (aClass161Array7434[i].method2595(i_134_, i_135_, (byte) 122) + aClass161Array7434[i].method2595(i_134_ + 1, i_135_, (byte) 4) + aClass161Array7434[i].method2595(i_134_, 1 + i_135_, (byte) 57) + aClass161Array7434[i].method2595(1 + i_134_, i_135_ + 1, (byte) 46)) / 4);
				class640_sub1.method17038(aClass180_7451, class561.aClass640_Sub1_Sub4_7556, anInt7422 * -1478371119, i_140_, -(-1478371119 * anInt7422), true, 2056627232);
			}
		}
	}

	public void method9259(int i, int i_141_, int i_142_, int i_143_) {
		Class561 class561 = aClass561ArrayArrayArray7426[i][i_141_][i_142_];
		if (class561 != null) {
			Class640_Sub1_Sub1 class640_sub1_sub1 = class561.aClass640_Sub1_Sub1_7552;
			Class640_Sub1_Sub1 class640_sub1_sub1_144_ = class561.aClass640_Sub1_Sub1_7550;
			if (null != class640_sub1_sub1) {
				class640_sub1_sub1.aShort11740 = (short) (class640_sub1_sub1.aShort11740 * i_143_ / (16 << 1742303003 * anInt7421 - 7));
				class640_sub1_sub1.aShort11741 = (short) (class640_sub1_sub1.aShort11741 * i_143_ / (16 << 1742303003 * anInt7421 - 7));
			}
			if (null != class640_sub1_sub1_144_) {
				class640_sub1_sub1_144_.aShort11740 = (short) (i_143_ * class640_sub1_sub1_144_.aShort11740 / (16 << 1742303003 * anInt7421 - 7));
				class640_sub1_sub1_144_.aShort11741 = (short) (i_143_ * class640_sub1_sub1_144_.aShort11741 / (16 << anInt7421 * 1742303003 - 7));
			}
		}
	}

	public void method9260(int i, int i_145_, int i_146_, int i_147_, byte[][][] is, int[] is_148_, int[] is_149_, int[] is_150_, int[] is_151_, int[] is_152_, int i_153_, byte i_154_, int i_155_, int i_156_, boolean bool, boolean bool_157_, int i_158_, boolean bool_159_) {
		aClass566_7430.aBool7580 = true;
		aBool7470 = bool_157_;
		anInt7431 = (i_145_ >> anInt7421 * 1742303003) * 1606282941;
		anInt7458 = (i_147_ >> 1742303003 * anInt7421) * 334971605;
		anInt7459 = i_145_ * 802894239;
		anInt7460 = 1334538331 * i_147_;
		anInt7461 = 1299883149 * i_146_;
		anInt7477 = anInt7431 * -788153071 - anInt7463 * -106331231;
		if (1068144453 * anInt7477 < 0) {
			anInt7464 = -(anInt7477 * 476015207);
			anInt7477 = 0;
		} else
			anInt7464 = 0;
		anInt7468 = anInt7458 * 1356163865 - anInt7463 * -405377311;
		if (anInt7468 * -1268111611 < 0) {
			anInt7465 = -(1878018835 * anInt7468);
			anInt7468 = 0;
		} else
			anInt7465 = 0;
		anInt7427 = 744821403 * anInt7431 + -1778738997 * anInt7463;
		if (1084115087 * anInt7427 > anInt7443 * -547681223)
			anInt7427 = -75304265 * anInt7443;
		anInt7469 = anInt7463 * 1821888897 + anInt7458 * 1919631545;
		if (1364363749 * anInt7469 > anInt7432 * -1437024153)
			anInt7469 = anInt7432 * 548342875;
		boolean[][] bools = aBoolArrayArray7467;
		boolean[][] bools_160_ = aBoolArrayArray7481;
		if (aBool7470) {
			for (int i_161_ = 0; i_161_ < 1329492325 * anInt7463 + anInt7463 * 1329492325 + 2; i_161_++) {
				int i_162_ = 0;
				int i_163_ = 0;
				for (int i_164_ = 0; (i_164_ < 1329492325 * anInt7463 + 1329492325 * anInt7463 + 2); i_164_++) {
					if (i_164_ > 1)
						anIntArray7482[i_164_ - 2] = i_162_;
					i_162_ = i_163_;
					int i_165_ = (anInt7431 * 1968897173 - 1329492325 * anInt7463 + i_161_);
					int i_166_ = i_164_ + (64349821 * anInt7458 - anInt7463 * 1329492325);
					if (i_165_ >= 0 && i_166_ >= 0 && i_165_ < -547681223 * anInt7443 && i_166_ < -1437024153 * anInt7432) {
						int i_167_ = i_165_ << anInt7421 * 1742303003;
						int i_168_ = i_166_ << 1742303003 * anInt7421;
						int i_169_ = (aClass161Array7457[aClass161Array7457.length - 1].method2595(i_165_, i_166_, (byte) 31) - (1000 << 1742303003 * anInt7421 - 7));
						int i_170_ = ((aClass161Array7435 != null ? (aClass161Array7435[0].method2595(i_165_, i_166_, (byte) 38) + -1478371119 * anInt7422) : (aClass161Array7457[0].method2595(i_165_, i_166_, (byte) 101) + anInt7422 * -1478371119)) + (1000 << anInt7421 * 1742303003 - 7));
						i_163_ = aClass180_7451.method3382(i_167_, i_169_, i_168_, i_167_, i_170_, i_168_);
						aBoolArrayArray7481[i_161_][i_164_] = 0 == i_163_;
					} else {
						i_163_ = -1;
						aBoolArrayArray7481[i_161_][i_164_] = false;
					}
					if (i_161_ > 0 && i_164_ > 0) {
						int i_171_ = (anIntArray7482[i_164_ - 1] & anIntArray7482[i_164_] & i_162_ & i_163_);
						aBoolArrayArray7467[i_161_ - 1][i_164_ - 1] = 0 == i_171_;
					}
				}
				anIntArray7482[1329492325 * anInt7463 + 1329492325 * anInt7463] = i_162_;
				anIntArray7482[(anInt7463 * 1329492325 + anInt7463 * 1329492325 + 1)] = i_163_;
			}
			if (!bool_159_)
				aClass566_7430.aBool7580 = false;
			else {
				aClass566_7430.anIntArray7598 = is_148_;
				aClass566_7430.anIntArray7605 = is_149_;
				aClass566_7430.anIntArray7600 = is_150_;
				aClass566_7430.anIntArray7608 = is_151_;
				aClass566_7430.anIntArray7602 = is_152_;
				aClass566_7430.method9507(aClass180_7451, i_153_);
			}
		} else {
			if (null == aBoolArrayArray7484)
				aBoolArrayArray7484 = (new boolean[2 + (1329492325 * anInt7463 + 1329492325 * anInt7463)][1329492325 * anInt7463 + 1329492325 * anInt7463 + 2]);
			for (int i_172_ = 0; i_172_ < aBoolArrayArray7484.length; i_172_++) {
				for (int i_173_ = 0; i_173_ < aBoolArrayArray7484[0].length; i_173_++)
					aBoolArrayArray7484[i_172_][i_173_] = true;
			}
			aBoolArrayArray7481 = aBoolArrayArray7484;
			aBoolArrayArray7467 = aBoolArrayArray7484;
			anInt7477 = 0;
			anInt7468 = 0;
			anInt7427 = -75304265 * anInt7443;
			anInt7469 = anInt7432 * 548342875;
			aClass566_7430.aBool7580 = false;
		}
		Class190.method3674(this, aClass180_7451, -582112133);
		if (!aClass546_7480.aBool7262) {
			Iterator iterator = aClass546_7480.aList7264.iterator();
			while (iterator.hasNext()) {
				Class558 class558 = (Class558) iterator.next();
				iterator.remove();
				Class389.method6463(class558, 999892086);
			}
		}
		if (aBool7455) {
			for (int i_174_ = 0; i_174_ < 187596765 * anInt7474; i_174_++)
				aClass556Array7476[i_174_].method9414(i, bool, 768125117);
		}
		if (aClass561ArrayArrayArray7437 != null) {
			method9220(true, (byte) -19);
			aClass180_7451.method3207(-1, new Class178(1583160, 40, 127, 63, 0, 0, 0));
			method9261(true, is, i_153_, i_154_, i_158_);
			aClass180_7451.method3194();
			method9220(false, (byte) -120);
		}
		method9261(false, is, i_153_, i_154_, i_158_);
		if (!aBool7470) {
			aBoolArrayArray7467 = bools;
			aBoolArrayArray7481 = bools_160_;
		}
	}

	void method9261(boolean bool, byte[][][] is, int i, byte i_175_, int i_176_) {
		int i_177_ = bool ? 1 : 0;
		anInt7452 = 0;
		anInt7453 = 0;
		anInt7429 += -92122773;
		if ((i_176_ & 0x2) == 0) {
			for (Class640_Sub1 class640_sub1 = aClass640_Sub1Array7449[i_177_]; class640_sub1 != null; class640_sub1 = class640_sub1.aClass640_Sub1_10865) {
				method9262(class640_sub1, (byte) -56);
				if (1971671255 * class640_sub1.anInt10866 != -1 && !method9389(class640_sub1, bool, is, i, i_175_))
					aClass640_Sub1Array7483[(anInt7452 += -1341323837) * 831263467 - 1] = class640_sub1;
			}
		}
		if ((i_176_ & 0x1) == 0) {
			for (Class640_Sub1 class640_sub1 = aClass640_Sub1Array7450[i_177_]; class640_sub1 != null; class640_sub1 = class640_sub1.aClass640_Sub1_10865) {
				method9262(class640_sub1, (byte) -82);
				if (-1 != 1971671255 * class640_sub1.anInt10866 && !method9389(class640_sub1, bool, is, i, i_175_))
					aClass640_Sub1Array7454[(anInt7453 += 425340347) * -1900638349 - 1] = class640_sub1;
			}
			for (Class640_Sub1 class640_sub1 = aClass640_Sub1Array7446[i_177_]; class640_sub1 != null; class640_sub1 = class640_sub1.aClass640_Sub1_10865) {
				method9262(class640_sub1, (byte) -121);
				if (-1 != 1971671255 * class640_sub1.anInt10866 && !method9389(class640_sub1, bool, is, i, i_175_)) {
					if (class640_sub1.method17072(1844649105))
						aClass640_Sub1Array7454[(anInt7453 += 425340347) * -1900638349 - 1] = class640_sub1;
					else
						aClass640_Sub1Array7483[(anInt7452 += -1341323837) * 831263467 - 1] = class640_sub1;
				}
			}
			if (!bool) {
				for (int i_178_ = 0; i_178_ < 1273038535 * anInt7445; i_178_++) {
					method9262(aClass640_Sub1_Sub2Array7433[i_178_], (byte) -112);
					if (1971671255 * (aClass640_Sub1_Sub2Array7433[i_178_].anInt10866) != -1 && !method9389(aClass640_Sub1_Sub2Array7433[i_178_], bool, is, i, i_175_)) {
						if (aClass640_Sub1_Sub2Array7433[i_178_].method17072(1112512018))
							aClass640_Sub1Array7454[(anInt7453 += 425340347) * -1900638349 - 1] = aClass640_Sub1_Sub2Array7433[i_178_];
						else
							aClass640_Sub1Array7483[(anInt7452 += -1341323837) * 831263467 - 1] = aClass640_Sub1_Sub2Array7433[i_178_];
					}
				}
			}
		}
		if (anInt7452 * 831263467 > 0) {
			method9264(aClass640_Sub1Array7483, 0, 831263467 * anInt7452 - 1);
			for (int i_179_ = 0; i_179_ < 831263467 * anInt7452; i_179_++)
				method9266(aClass640_Sub1Array7483[i_179_], aClass527_Sub16Array7444);
		}
		if (aBool7455)
			aClass180_7451.method3158(0, null);
		if (0 == (i_176_ & 0x2)) {
			for (int i_180_ = 0; i_180_ < anInt7466 * -1609909485; i_180_++) {
				if (i_180_ >= i && is != null) {
					int i_181_ = aBoolArrayArray7467.length;
					if (1068144453 * anInt7477 + aBoolArrayArray7467.length > -547681223 * anInt7443)
						i_181_ -= (1068144453 * anInt7477 + aBoolArrayArray7467.length - -547681223 * anInt7443);
					int i_182_ = aBoolArrayArray7467[0].length;
					if (anInt7468 * -1268111611 + aBoolArrayArray7467[0].length > -1437024153 * anInt7432)
						i_182_ -= (anInt7468 * -1268111611 + aBoolArrayArray7467[0].length - -1437024153 * anInt7432);
					boolean[][] bools = aBoolArrayArray7481;
					if (aBool7470) {
						for (int i_183_ = -362087053 * anInt7464; i_183_ < i_181_; i_183_++) {
							int i_184_ = (1068144453 * anInt7477 + i_183_ - anInt7464 * -362087053);
							for (int i_185_ = anInt7465 * -473616249; i_185_ < i_182_; i_185_++) {
								bools[i_183_][i_185_] = false;
								if (aBoolArrayArray7467[i_183_][i_185_]) {
									int i_186_ = (i_185_ + anInt7468 * -1268111611 - -473616249 * anInt7465);
									for (int i_187_ = i_180_; i_187_ >= 0; i_187_--) {
										if ((null != (aClass561ArrayArrayArray7426[i_187_][i_184_][i_186_])) && (i_180_ == (aClass561ArrayArrayArray7426[i_187_][i_184_][i_186_].aByte7555))) {
											if ((i_187_ >= i && (is[i_187_][i_184_][i_186_] == i_175_)) || (aClass566_7430.method9549(i_180_, i_184_, i_186_)))
												bools[i_183_][i_185_] = false;
											else
												bools[i_183_][i_185_] = true;
											break;
										}
									}
								}
							}
						}
					}
					aClass161Array7434[i_180_].method2591(1968897173 * anInt7431, anInt7458 * 64349821, anInt7463 * 1329492325, aBoolArrayArray7481, false, i_176_);
				} else {
					int i_188_ = aBoolArrayArray7467.length;
					if (1068144453 * anInt7477 + aBoolArrayArray7467.length > -547681223 * anInt7443)
						i_188_ -= (1068144453 * anInt7477 + aBoolArrayArray7467.length - -547681223 * anInt7443);
					int i_189_ = aBoolArrayArray7467[0].length;
					if (aBoolArrayArray7467[0].length + -1268111611 * anInt7468 > anInt7432 * -1437024153)
						i_189_ -= (aBoolArrayArray7467[0].length + anInt7468 * -1268111611 - anInt7432 * -1437024153);
					boolean[][] bools = aBoolArrayArray7481;
					if (aBool7470) {
						for (int i_190_ = anInt7464 * -362087053; i_190_ < i_188_; i_190_++) {
							int i_191_ = (1068144453 * anInt7477 + i_190_ - -362087053 * anInt7464);
							for (int i_192_ = anInt7465 * -473616249; i_192_ < i_189_; i_192_++) {
								if (aBoolArrayArray7467[i_190_][i_192_] && !(aClass566_7430.method9549(i_180_, i_191_, (-1268111611 * anInt7468 + i_192_ - anInt7465 * -473616249))))
									bools[i_190_][i_192_] = true;
								else
									bools[i_190_][i_192_] = false;
							}
						}
					}
					aClass161Array7434[i_180_].method2591(1968897173 * anInt7431, 64349821 * anInt7458, anInt7463 * 1329492325, aBoolArrayArray7481, true, i_176_);
				}
			}
		}
		if (-1900638349 * anInt7453 > 0) {
			method9351(aClass640_Sub1Array7454, 0, -1900638349 * anInt7453 - 1);
			for (int i_193_ = 0; i_193_ < -1900638349 * anInt7453; i_193_++)
				method9266(aClass640_Sub1Array7454[i_193_], aClass527_Sub16Array7444);
		}
	}

	void method9262(Class640_Sub1 class640_sub1, byte i) {
		Class442 class442 = class640_sub1.method10637().aClass442_4927;
		aClass180_7451.method3333((float) (int) class442.aFloat4918, (float) ((int) class442.aFloat4915 + (class640_sub1.method17047(1004008254) >> 1)), (float) (int) class442.aFloat4919, aFloatArray7425);
		class640_sub1.anInt10866 = 1465164519 * (int) aFloatArray7425[2];
	}

	public int method9263(int i, int i_194_, int i_195_) {
		return (anIntArrayArray7439 != null ? anIntArrayArray7439[i][i_194_] & 0xffffff : 0);
	}

	void method9264(Class640_Sub1[] class640_sub1s, int i, int i_196_) {
		if (i < i_196_) {
			int i_197_ = (i + i_196_) / 2;
			int i_198_ = i;
			Class640_Sub1 class640_sub1 = class640_sub1s[i_197_];
			class640_sub1s[i_197_] = class640_sub1s[i_196_];
			class640_sub1s[i_196_] = class640_sub1;
			int i_199_ = class640_sub1.anInt10866 * 1971671255;
			for (int i_200_ = i; i_200_ < i_196_; i_200_++) {
				if (class640_sub1s[i_200_].anInt10866 * 1971671255 < i_199_ + (i_200_ & 0x1)) {
					Class640_Sub1 class640_sub1_201_ = class640_sub1s[i_200_];
					class640_sub1s[i_200_] = class640_sub1s[i_198_];
					class640_sub1s[i_198_++] = class640_sub1_201_;
				}
			}
			class640_sub1s[i_196_] = class640_sub1s[i_198_];
			class640_sub1s[i_198_] = class640_sub1;
			method9264(class640_sub1s, i, i_198_ - 1);
			method9264(class640_sub1s, 1 + i_198_, i_196_);
		}
	}

	public Class640_Sub1_Sub5 method9265(int i, int i_202_, int i_203_) {
		Class561 class561 = aClass561ArrayArrayArray7426[i][i_202_][i_203_];
		if (null == class561)
			return null;
		Class640_Sub1_Sub5 class640_sub1_sub5 = class561.aClass640_Sub1_Sub5_7557;
		class561.aClass640_Sub1_Sub5_7557 = null;
		method9249(class640_sub1_sub5, -99639426);
		return class640_sub1_sub5;
	}

	void method9266(Class640_Sub1 class640_sub1, Class527_Sub16[] class527_sub16s) {
		if (aBool7455) {
			int i = class640_sub1.method17043(class527_sub16s, -845114004);
			aClass180_7451.method3158(i, class527_sub16s);
		}
		if (aClass161Array7434 == aClass161Array7435) {
			boolean bool = false;
			boolean bool_204_ = false;
			Class442 class442 = class640_sub1.method10637().aClass442_4927;
			int i;
			int i_205_;
			if (class640_sub1 instanceof Class640_Sub1_Sub2) {
				i = ((Class640_Sub1_Sub2) class640_sub1).aShort11775;
				i_205_ = ((Class640_Sub1_Sub2) class640_sub1).aShort11771;
			} else {
				i = (int) class442.aFloat4918 >> anInt7421 * 1742303003;
				i_205_ = (int) class442.aFloat4919 >> anInt7421 * 1742303003;
			}
			i = Math.min(-547681223 * anInt7443 - 1, Math.max(0, i));
			i_205_ = Math.min(-1437024153 * anInt7432 - 1, Math.max(0, i_205_));
			Class178 class178 = new Class178();
			class178.anInt2055 = method9263(i, i_205_, -986096521) * -2125644365;
			class178.anInt2050 = method9227(i, i_205_, (short) 21062) * 1806816041;
			class178.anInt2051 = method9229(i, i_205_, 2087802034) * 433693819;
			class178.anInt2053 = method9247(i, i_205_, -1623923154) * -1803459975;
			class178.anInt2054 = method9273(i, i_205_, (byte) 1) * 420597091;
			class178.anInt2049 = method9232(i, i_205_, 598870759) * -834736135;
			aClass180_7451.method3144(aClass161Array7457[0].method2593((int) class442.aFloat4918, (int) class442.aFloat4919, -1151432033), class178);
		}
		Class558 class558 = class640_sub1.method17040(aClass180_7451, (byte) -61);
		if (class558 != null) {
			if (class558.aBool7530) {
				class558.aClass640_Sub1_7532 = class640_sub1;
				aClass546_7480.method9053(class558, 110332882);
			} else
				Class389.method6463(class558, -1620707990);
		}
	}

	public boolean method9267(Class527_Sub8_Sub8 class527_sub8_sub8, int i, int i_206_, int i_207_, boolean[] bools, int i_208_) {
		boolean bool = false;
		if (aClass161Array7434 != aClass161Array7435) {
			int i_209_ = aClass161Array7457[i].method2593(i_206_, i_207_, -1151432033);
			int i_210_ = 0;
			for (/**/; i_210_ <= i; i_210_++) {
				Class161 class161 = aClass161Array7457[i_210_];
				if (class161 != null) {
					int i_211_ = i_209_ - class161.method2593(i_206_, i_207_, -1151432033);
					if (null != bools) {
						bools[i_210_] = class161.method2598(class527_sub8_sub8, i_206_, i_211_, i_207_, 0, false);
						if (!bools[i_210_])
							continue;
					}
					class161.method2633(class527_sub8_sub8, i_206_, i_211_, i_207_, 0, false);
					bool = true;
				}
			}
		}
		return bool;
	}

	public void method9268(Class527_Sub8_Sub8 class527_sub8_sub8, int i, int i_212_, int i_213_, boolean[] bools, byte i_214_) {
		if (aClass161Array7435 != aClass161Array7434) {
			int i_215_ = aClass161Array7457[i].method2593(i_212_, i_213_, -1151432033);
			for (int i_216_ = 0; i_216_ <= i; i_216_++) {
				if (bools == null || bools[i_216_]) {
					Class161 class161 = aClass161Array7457[i_216_];
					if (class161 != null)
						class161.method2631(class527_sub8_sub8, i_212_, i_215_ - class161.method2593(i_212_, i_213_, -1151432033), i_213_, 0, false);
				}
			}
		}
	}

	public boolean method9269(Class640_Sub1_Sub2 class640_sub1_sub2, boolean bool, int i) {
		boolean bool_217_ = aClass161Array7435 == aClass161Array7434;
		int i_218_ = 0;
		short i_219_ = 0;
		byte i_220_ = 0;
		class640_sub1_sub2.method18335((byte) 52);
		short i_221_ = 0;
		int i_222_ = Math.min(anInt7443 * -547681223 - 1, Math.max(0, class640_sub1_sub2.aShort11775));
		int i_223_ = Math.min(anInt7443 * -547681223 - 1, Math.max(0, class640_sub1_sub2.aShort11770));
		int i_224_ = Math.min(anInt7432 * -1437024153 - 1, Math.max(0, class640_sub1_sub2.aShort11771));
		int i_225_ = Math.min(-1437024153 * anInt7432 - 1, Math.max(0, class640_sub1_sub2.aShort11772));
		for (int i_226_ = i_222_; i_226_ <= i_223_; i_226_++) {
			for (int i_227_ = i_224_; i_227_ <= i_225_; i_227_++) {
				Class561 class561 = method9321(class640_sub1_sub2.aByte10864, i_226_, i_227_, (short) -29132);
				if (null != class561) {
					Class562 class562 = Class39.method1157(class640_sub1_sub2, -2041182740);
					Class562 class562_228_ = class561.aClass562_7558;
					if (null == class562_228_)
						class561.aClass562_7558 = class562;
					else {
						for (/**/; null != class562_228_.aClass562_7565; class562_228_ = class562_228_.aClass562_7565) {
							/* empty */
						}
						class562_228_.aClass562_7565 = class562;
					}
					if (bool_217_ && 0 != (anIntArrayArray7439[i_226_][i_227_] & ~0xffffff)) {
						i_218_ = anIntArrayArray7439[i_226_][i_227_];
						i_219_ = aShortArrayArray7440[i_226_][i_227_];
						i_220_ = aByteArrayArray7441[i_226_][i_227_];
					}
					if (!bool && null != class561.aClass640_Sub1_Sub4_7556 && (class561.aClass640_Sub1_Sub4_7556.aShort11871 > i_221_))
						i_221_ = class561.aClass640_Sub1_Sub4_7556.aShort11871;
				}
			}
		}
		if (bool_217_ && 0 != (i_218_ & ~0xffffff)) {
			for (int i_229_ = i_222_; i_229_ <= i_223_; i_229_++) {
				for (int i_230_ = i_224_; i_230_ <= i_225_; i_230_++) {
					if ((anIntArrayArray7439[i_229_][i_230_] & ~0xffffff) == 0) {
						anIntArrayArray7439[i_229_][i_230_] = i_218_;
						aShortArrayArray7440[i_229_][i_230_] = i_219_;
						aByteArrayArray7441[i_229_][i_230_] = i_220_;
					}
				}
			}
		}
		if (bool) {
			aClass640_Sub1_Sub2Array7433[(anInt7445 += 1409014519) * 1273038535 - 1] = class640_sub1_sub2;
			class640_sub1_sub2.aClass555_10867 = this;
		} else {
			int i_231_ = aClass161Array7434 == aClass161Array7435 ? 1 : 0;
			if (class640_sub1_sub2.method17069(-805031553)) {
				if (class640_sub1_sub2.method17072(2096503239)) {
					class640_sub1_sub2.aClass640_Sub1_10865 = aClass640_Sub1Array7450[i_231_];
					aClass640_Sub1Array7450[i_231_] = class640_sub1_sub2;
				} else {
					class640_sub1_sub2.aClass640_Sub1_10865 = aClass640_Sub1Array7449[i_231_];
					aClass640_Sub1Array7449[i_231_] = class640_sub1_sub2;
				}
			} else {
				class640_sub1_sub2.aClass640_Sub1_10865 = aClass640_Sub1Array7446[i_231_];
				aClass640_Sub1Array7446[i_231_] = class640_sub1_sub2;
			}
		}
		if (bool) {
			Class442 class442 = Class442.method7139(class640_sub1_sub2.method10637().aClass442_4927);
			class442.aFloat4915 -= (float) i_221_;
			class640_sub1_sub2.method10618(class442);
			class442.method7141();
		}
		return true;
	}

	public void method9270(byte i) {
		method9294(1, anInt7466 * -1609909485, -1323887921);
	}

	public void method9271(Class556 class556, int i) {
		if (187596765 * anInt7474 < 65174) {
			Class527_Sub16 class527_sub16 = class556.aClass527_Sub16_7495;
			aClass556Array7476[187596765 * anInt7474] = class556;
			aBoolArray7448[anInt7474 * 187596765] = false;
			anInt7474 += 2072825973;
			int i_232_ = 753393863 * class556.anInt7510;
			if (class556.aBool7496)
				i_232_ = 0;
			int i_233_ = 753393863 * class556.anInt7510;
			if (class556.aBool7508)
				i_233_ = anInt7466 * -1609909485 - 1;
			for (int i_234_ = i_232_; i_234_ <= i_233_; i_234_++) {
				int i_235_ = 0;
				int i_236_ = ((class527_sub16.method16131((byte) 47) - class527_sub16.method16132(-1320834904) + anInt7471 * -1485744437) >> 1742303003 * anInt7421);
				if (i_236_ < 0) {
					i_235_ -= i_236_;
					i_236_ = 0;
				}
				int i_237_ = ((class527_sub16.method16131((byte) -22) + class527_sub16.method16132(-1377628239) - -1485744437 * anInt7471) >> anInt7421 * 1742303003);
				if (i_237_ >= -1437024153 * anInt7432)
					i_237_ = anInt7432 * -1437024153 - 1;
				for (int i_238_ = i_236_; i_238_ <= i_237_; i_238_++) {
					int i_239_ = class556.aShortArray7511[i_235_++];
					int i_240_ = (((class527_sub16.method16129((byte) -40) - class527_sub16.method16132(238570711) + anInt7471 * -1485744437) >> 1742303003 * anInt7421) + (i_239_ >>> 8));
					int i_241_ = i_240_ + (i_239_ & 0xff) - 1;
					if (i_240_ < 0)
						i_240_ = 0;
					if (i_241_ >= anInt7443 * -547681223)
						i_241_ = anInt7443 * -547681223 - 1;
					for (int i_242_ = i_240_; i_242_ <= i_241_; i_242_++) {
						long l = aLongArrayArrayArray7475[i_234_][i_242_][i_238_];
						if ((l & 0xffffL) == 0L)
							aLongArrayArrayArray7475[i_234_][i_242_][i_238_] = l | (long) (187596765 * anInt7474);
						else if ((l & 0xffff0000L) == 0L)
							aLongArrayArrayArray7475[i_234_][i_242_][i_238_] = l | (long) (187596765 * anInt7474) << 16;
						else if (0L == (l & 0xffff00000000L))
							aLongArrayArrayArray7475[i_234_][i_242_][i_238_] = l | (long) (187596765 * anInt7474) << 32;
						else if (0L == (l & ~0xffffffffffffL))
							aLongArrayArrayArray7475[i_234_][i_242_][i_238_] = l | (long) (187596765 * anInt7474) << 48;
					}
				}
			}
			if (class556.anInt7518 * -235567559 != -1) {
				List list = ((List) aHashMap7478.get(Integer.valueOf(class556.anInt7518 * -235567559)));
				if (null == list) {
					list = new ArrayList();
					aHashMap7478.put(Integer.valueOf(class556.anInt7518 * -235567559), list);
				}
				list.add(class556);
				Class527_Sub16 class527_sub16_243_ = ((Class527_Sub16) aHashMap7479.get(Integer.valueOf(class556.anInt7518 * -235567559)));
				if (null != class527_sub16_243_) {
					class556.aClass527_Sub16_7495.method16146(class527_sub16_243_.method16133((byte) 0), -1769951788);
					class556.aClass527_Sub16_7495.method16139(class527_sub16_243_.method16137(1710179165), class527_sub16_243_.method16145(2095980739), -1669492908);
				}
			}
		}
	}

	public int method9272(int i, int i_244_) {
		return (aByteArrayArray7447 != null ? aByteArrayArray7447[i][i_244_] & 0xff : 0);
	}

	public int method9273(int i, int i_245_, byte i_246_) {
		return (aByteArrayArray7447 != null ? aByteArrayArray7447[i][i_245_] & 0xff : 0);
	}

	void method9274(Class640_Sub1_Sub2 class640_sub1_sub2, boolean bool, int i) {
		int i_247_ = Math.min(anInt7443 * -547681223 - 1, Math.max(0, class640_sub1_sub2.aShort11775));
		int i_248_ = Math.min(anInt7443 * -547681223 - 1, Math.max(0, class640_sub1_sub2.aShort11770));
		int i_249_ = Math.min(anInt7432 * -1437024153 - 1, Math.max(0, class640_sub1_sub2.aShort11771));
		int i_250_ = Math.min(-1437024153 * anInt7432 - 1, Math.max(0, class640_sub1_sub2.aShort11772));
		for (int i_251_ = i_247_; i_251_ <= i_248_; i_251_++) {
			for (int i_252_ = i_249_; i_252_ <= i_250_; i_252_++) {
				Class561 class561 = (aClass561ArrayArrayArray7426[class640_sub1_sub2.aByte10864][i_251_][i_252_]);
				if (null != class561) {
					Class562 class562 = class561.aClass562_7558;
					Class562 class562_253_ = null;
					for (/**/; class562 != null; class562 = class562.aClass562_7565) {
						if (class562.aClass640_Sub1_Sub2_7564 == class640_sub1_sub2) {
							if (class562_253_ != null)
								class562_253_.aClass562_7565 = class562.aClass562_7565;
							else
								class561.aClass562_7558 = class562.aClass562_7565;
							class562.method9453(-868563791);
							break;
						}
						class562_253_ = class562;
					}
				}
			}
		}
		if (!bool)
			method9249(class640_sub1_sub2, -99639426);
	}

	public void method9275(HashMap hashmap, int i) {
		aHashMap7479 = hashmap;
	}

	public int method9276(int i, int i_254_) {
		return (null != aByteArrayArray7428 ? aByteArrayArray7428[i][i_254_] & 0xff : 0);
	}

	public void method9277(int i) {
		/* empty */
	}

	public void method9278(Class174 class174) {
		/* empty */
	}

	public void method9279() {
		for (int i = 0; i < anInt7443 * -547681223; i++) {
			for (int i_255_ = 0; i_255_ < anInt7432 * -1437024153; i_255_++) {
				if (null == aClass561ArrayArrayArray7426[0][i][i_255_])
					aClass561ArrayArrayArray7426[0][i][i_255_] = new Class561(0);
			}
		}
	}

	public void method9280(boolean bool) {
		if (bool) {
			aClass561ArrayArrayArray7426 = aClass561ArrayArrayArray7437;
			aClass161Array7434 = aClass161Array7435;
		} else {
			aClass561ArrayArrayArray7426 = aClass561ArrayArrayArray7420;
			aClass161Array7434 = aClass161Array7457;
		}
		anInt7466 = aClass561ArrayArrayArray7426.length * -896252133;
	}

	void method9281(Class640_Sub1_Sub2 class640_sub1_sub2, boolean bool) {
		int i = Math.min(anInt7443 * -547681223 - 1, Math.max(0, class640_sub1_sub2.aShort11775));
		int i_256_ = Math.min(anInt7443 * -547681223 - 1, Math.max(0, class640_sub1_sub2.aShort11770));
		int i_257_ = Math.min(anInt7432 * -1437024153 - 1, Math.max(0, class640_sub1_sub2.aShort11771));
		int i_258_ = Math.min(-1437024153 * anInt7432 - 1, Math.max(0, class640_sub1_sub2.aShort11772));
		for (int i_259_ = i; i_259_ <= i_256_; i_259_++) {
			for (int i_260_ = i_257_; i_260_ <= i_258_; i_260_++) {
				Class561 class561 = (aClass561ArrayArrayArray7426[class640_sub1_sub2.aByte10864][i_259_][i_260_]);
				if (null != class561) {
					Class562 class562 = class561.aClass562_7558;
					Class562 class562_261_ = null;
					for (/**/; class562 != null; class562 = class562.aClass562_7565) {
						if (class562.aClass640_Sub1_Sub2_7564 == class640_sub1_sub2) {
							if (class562_261_ != null)
								class562_261_.aClass562_7565 = class562.aClass562_7565;
							else
								class561.aClass562_7558 = class562.aClass562_7565;
							class562.method9453(1494923863);
							break;
						}
						class562_261_ = class562;
					}
				}
			}
		}
		if (!bool)
			method9249(class640_sub1_sub2, -99639426);
	}

	public void method9282(int i, int i_262_) {
		Class561 class561 = aClass561ArrayArrayArray7426[0][i][i_262_];
		for (int i_263_ = 0; i_263_ < 3; i_263_++) {
			Class561 class561_264_ = (aClass561ArrayArrayArray7426[i_263_][i][i_262_] = aClass561ArrayArrayArray7426[1 + i_263_][i][i_262_]);
			if (null != class561_264_) {
				for (Class562 class562 = class561_264_.aClass562_7558; null != class562; class562 = class562.aClass562_7565) {
					Class640_Sub1_Sub2 class640_sub1_sub2 = class562.aClass640_Sub1_Sub2_7564;
					if (class640_sub1_sub2.aShort11775 == i && class640_sub1_sub2.aShort11771 == i_262_)
						class640_sub1_sub2.aByte10864--;
				}
				if (class561_264_.aClass640_Sub1_Sub4_7556 != null)
					class561_264_.aClass640_Sub1_Sub4_7556.aByte10864--;
				if (null != class561_264_.aClass640_Sub1_Sub3_7553)
					class561_264_.aClass640_Sub1_Sub3_7553.aByte10864--;
				if (null != class561_264_.aClass640_Sub1_Sub3_7562)
					class561_264_.aClass640_Sub1_Sub3_7562.aByte10864--;
				if (class561_264_.aClass640_Sub1_Sub1_7552 != null)
					class561_264_.aClass640_Sub1_Sub1_7552.aByte10864--;
				if (null != class561_264_.aClass640_Sub1_Sub1_7550)
					class561_264_.aClass640_Sub1_Sub1_7550.aByte10864--;
			}
		}
		if (null == aClass561ArrayArrayArray7426[0][i][i_262_]) {
			aClass561ArrayArrayArray7426[0][i][i_262_] = new Class561(0);
			aClass561ArrayArrayArray7426[0][i][i_262_].aByte7555 = (byte) 1;
		}
		aClass561ArrayArrayArray7426[0][i][i_262_].aClass561_7554 = class561;
		aClass561ArrayArrayArray7426[3][i][i_262_] = null;
	}

	public void method9283(int i, int i_265_) {
		Class561 class561 = aClass561ArrayArrayArray7426[0][i][i_265_];
		for (int i_266_ = 0; i_266_ < 3; i_266_++) {
			Class561 class561_267_ = (aClass561ArrayArrayArray7426[i_266_][i][i_265_] = aClass561ArrayArrayArray7426[1 + i_266_][i][i_265_]);
			if (null != class561_267_) {
				for (Class562 class562 = class561_267_.aClass562_7558; null != class562; class562 = class562.aClass562_7565) {
					Class640_Sub1_Sub2 class640_sub1_sub2 = class562.aClass640_Sub1_Sub2_7564;
					if (class640_sub1_sub2.aShort11775 == i && class640_sub1_sub2.aShort11771 == i_265_)
						class640_sub1_sub2.aByte10864--;
				}
				if (class561_267_.aClass640_Sub1_Sub4_7556 != null)
					class561_267_.aClass640_Sub1_Sub4_7556.aByte10864--;
				if (null != class561_267_.aClass640_Sub1_Sub3_7553)
					class561_267_.aClass640_Sub1_Sub3_7553.aByte10864--;
				if (null != class561_267_.aClass640_Sub1_Sub3_7562)
					class561_267_.aClass640_Sub1_Sub3_7562.aByte10864--;
				if (class561_267_.aClass640_Sub1_Sub1_7552 != null)
					class561_267_.aClass640_Sub1_Sub1_7552.aByte10864--;
				if (null != class561_267_.aClass640_Sub1_Sub1_7550)
					class561_267_.aClass640_Sub1_Sub1_7550.aByte10864--;
			}
		}
		if (null == aClass561ArrayArrayArray7426[0][i][i_265_]) {
			aClass561ArrayArrayArray7426[0][i][i_265_] = new Class561(0);
			aClass561ArrayArrayArray7426[0][i][i_265_].aByte7555 = (byte) 1;
		}
		aClass561ArrayArrayArray7426[0][i][i_265_].aClass561_7554 = class561;
		aClass561ArrayArrayArray7426[3][i][i_265_] = null;
	}

	public void method9284(int i, int i_268_) {
		Class561 class561 = aClass561ArrayArrayArray7426[0][i][i_268_];
		for (int i_269_ = 0; i_269_ < 3; i_269_++) {
			Class561 class561_270_ = (aClass561ArrayArrayArray7426[i_269_][i][i_268_] = aClass561ArrayArrayArray7426[1 + i_269_][i][i_268_]);
			if (null != class561_270_) {
				for (Class562 class562 = class561_270_.aClass562_7558; null != class562; class562 = class562.aClass562_7565) {
					Class640_Sub1_Sub2 class640_sub1_sub2 = class562.aClass640_Sub1_Sub2_7564;
					if (class640_sub1_sub2.aShort11775 == i && class640_sub1_sub2.aShort11771 == i_268_)
						class640_sub1_sub2.aByte10864--;
				}
				if (class561_270_.aClass640_Sub1_Sub4_7556 != null)
					class561_270_.aClass640_Sub1_Sub4_7556.aByte10864--;
				if (null != class561_270_.aClass640_Sub1_Sub3_7553)
					class561_270_.aClass640_Sub1_Sub3_7553.aByte10864--;
				if (null != class561_270_.aClass640_Sub1_Sub3_7562)
					class561_270_.aClass640_Sub1_Sub3_7562.aByte10864--;
				if (class561_270_.aClass640_Sub1_Sub1_7552 != null)
					class561_270_.aClass640_Sub1_Sub1_7552.aByte10864--;
				if (null != class561_270_.aClass640_Sub1_Sub1_7550)
					class561_270_.aClass640_Sub1_Sub1_7550.aByte10864--;
			}
		}
		if (null == aClass561ArrayArrayArray7426[0][i][i_268_]) {
			aClass561ArrayArrayArray7426[0][i][i_268_] = new Class561(0);
			aClass561ArrayArrayArray7426[0][i][i_268_].aByte7555 = (byte) 1;
		}
		aClass561ArrayArrayArray7426[0][i][i_268_].aClass561_7554 = class561;
		aClass561ArrayArrayArray7426[3][i][i_268_] = null;
	}

	public Class640_Sub1_Sub3 method9285(int i, int i_271_, int i_272_) {
		Class561 class561 = aClass561ArrayArrayArray7426[i][i_271_][i_272_];
		if (null != class561) {
			method9249(class561.aClass640_Sub1_Sub3_7562, -99639426);
			if (null != class561.aClass640_Sub1_Sub3_7562) {
				Class640_Sub1_Sub3 class640_sub1_sub3 = class561.aClass640_Sub1_Sub3_7562;
				class561.aClass640_Sub1_Sub3_7562 = null;
				return class640_sub1_sub3;
			}
		}
		return null;
	}

	public Class640_Sub1_Sub4 method9286(int i, int i_273_, int i_274_) {
		Class561 class561 = aClass561ArrayArrayArray7426[i][i_273_][i_274_];
		if (class561 == null || null == class561.aClass640_Sub1_Sub4_7556)
			return null;
		return class561.aClass640_Sub1_Sub4_7556;
	}

	Class561 method9287(int i, int i_275_, int i_276_) {
		return method9223(i, Math.min(anInt7443 * -547681223 - 1, Math.max(0, i_275_)), Math.min(-1437024153 * anInt7432 - 1, Math.max(0, i_276_)), (byte) 1);
	}

	Class561 method9288(int i, int i_277_, int i_278_) {
		return method9223(i, Math.min(anInt7443 * -547681223 - 1, Math.max(0, i_277_)), Math.min(-1437024153 * anInt7432 - 1, Math.max(0, i_278_)), (byte) 1);
	}

	public void method9289(int i, int i_279_, int i_280_, int i_281_, int i_282_) {
		Class561 class561 = aClass561ArrayArrayArray7426[i][i_279_][i_280_];
		if (class561 != null) {
			Class640_Sub1_Sub1 class640_sub1_sub1 = class561.aClass640_Sub1_Sub1_7552;
			Class640_Sub1_Sub1 class640_sub1_sub1_283_ = class561.aClass640_Sub1_Sub1_7550;
			if (null != class640_sub1_sub1) {
				class640_sub1_sub1.aShort11740 = (short) (class640_sub1_sub1.aShort11740 * i_281_ / (16 << 1742303003 * anInt7421 - 7));
				class640_sub1_sub1.aShort11741 = (short) (class640_sub1_sub1.aShort11741 * i_281_ / (16 << 1742303003 * anInt7421 - 7));
			}
			if (null != class640_sub1_sub1_283_) {
				class640_sub1_sub1_283_.aShort11740 = (short) (i_281_ * class640_sub1_sub1_283_.aShort11740 / (16 << 1742303003 * anInt7421 - 7));
				class640_sub1_sub1_283_.aShort11741 = (short) (i_281_ * class640_sub1_sub1_283_.aShort11741 / (16 << anInt7421 * 1742303003 - 7));
			}
		}
	}

	public void method9290(int i, int i_284_, int i_285_) {
		boolean bool = (aClass561ArrayArrayArray7426[0][i_284_][i_285_] != null && null != (aClass561ArrayArrayArray7426[0][i_284_][i_285_].aClass561_7554));
		for (int i_286_ = i; i_286_ >= 0; i_286_--) {
			if (null == aClass561ArrayArrayArray7426[i_286_][i_284_][i_285_]) {
				Class561 class561 = (aClass561ArrayArrayArray7426[i_286_][i_284_][i_285_] = new Class561(i_286_));
				if (bool)
					class561.aByte7555++;
			}
		}
	}

	public void method9291(int i, int i_287_, int i_288_) {
		boolean bool = (aClass561ArrayArrayArray7426[0][i_287_][i_288_] != null && null != (aClass561ArrayArrayArray7426[0][i_287_][i_288_].aClass561_7554));
		for (int i_289_ = i; i_289_ >= 0; i_289_--) {
			if (null == aClass561ArrayArrayArray7426[i_289_][i_287_][i_288_]) {
				Class561 class561 = (aClass561ArrayArrayArray7426[i_289_][i_287_][i_288_] = new Class561(i_289_));
				if (bool)
					class561.aByte7555++;
			}
		}
	}

	public void method9292(int i, Class161 class161) {
		aClass161Array7434[i] = class161;
	}

	public void method9293(int i, Class161 class161) {
		aClass161Array7434[i] = class161;
	}

	void method9294(int i, int i_290_, int i_291_) {
		Class527_Sub8_Sub8 class527_sub8_sub8 = null;
		for (int i_292_ = i; i_292_ < i_290_; i_292_++) {
			Class161 class161 = aClass161Array7457[i_292_];
			if (null != class161) {
				for (int i_293_ = 0; i_293_ < anInt7432 * -1437024153; i_293_++) {
					for (int i_294_ = 0; i_294_ < anInt7443 * -547681223; i_294_++) {
						class527_sub8_sub8 = class161.method2597(i_294_, i_293_, class527_sub8_sub8);
						if (null != class527_sub8_sub8) {
							int i_295_ = i_294_ << 1742303003 * anInt7421;
							int i_296_ = i_293_ << anInt7421 * 1742303003;
							for (int i_297_ = i_292_ - 1; i_297_ >= 0; i_297_--) {
								Class161 class161_298_ = aClass161Array7457[i_297_];
								if (null != class161_298_) {
									int i_299_ = (class161.method2595(i_294_, i_293_, (byte) 38) - (class161_298_.method2595(i_294_, i_293_, (byte) 30)));
									int i_300_ = (class161.method2595(i_294_ + 1, i_293_, (byte) 4) - (class161_298_.method2595(i_294_ + 1, i_293_, (byte) 77)));
									int i_301_ = (class161.method2595(i_294_ + 1, 1 + i_293_, (byte) 23) - (class161_298_.method2595(i_294_ + 1, 1 + i_293_, (byte) 32)));
									int i_302_ = (class161.method2595(i_294_, 1 + i_293_, (byte) 39) - (class161_298_.method2595(i_294_, 1 + i_293_, (byte) 46)));
									class161_298_.method2633(class527_sub8_sub8, i_295_, (i_302_ + (i_301_ + (i_300_ + i_299_))) / 4, i_296_, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}

	public int method9295(int i, int i_303_) {
		return (anIntArrayArray7439 != null ? anIntArrayArray7439[i][i_303_] & 0xffffff : 0);
	}

	public int method9296(int i, int i_304_) {
		return (anIntArrayArray7439 != null ? anIntArrayArray7439[i][i_304_] & 0xffffff : 0);
	}

	public Class640_Sub1_Sub4 method9297(int i, int i_305_, int i_306_) {
		Class561 class561 = aClass561ArrayArrayArray7426[i][i_305_][i_306_];
		if (class561 == null || null == class561.aClass640_Sub1_Sub4_7556)
			return null;
		return class561.aClass640_Sub1_Sub4_7556;
	}

	public int method9298(int i, int i_307_) {
		return (aByteArrayArray7441 != null ? aByteArrayArray7441[i][i_307_] & 0xff : 0);
	}

	public int method9299(int i, int i_308_) {
		return (aByteArrayArray7442 != null ? aByteArrayArray7442[i][i_308_] & 0xff : 0);
	}

	public int method9300(int i, int i_309_) {
		return (aByteArrayArray7447 != null ? aByteArrayArray7447[i][i_309_] & 0xff : 0);
	}

	public int method9301(int i, int i_310_) {
		return (aByteArrayArray7447 != null ? aByteArrayArray7447[i][i_310_] & 0xff : 0);
	}

	public int method9302(int i, int i_311_) {
		return (aByteArrayArray7447 != null ? aByteArrayArray7447[i][i_311_] & 0xff : 0);
	}

	public int method9303(int i, int i_312_) {
		return (aByteArrayArray7447 != null ? aByteArrayArray7447[i][i_312_] & 0xff : 0);
	}

	public int method9304(int i, int i_313_) {
		return (aByteArrayArray7447 != null ? aByteArrayArray7447[i][i_313_] & 0xff : 0);
	}

	public HashMap method9305() {
		aHashMap7479.clear();
		Iterator iterator = aHashMap7478.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry entry = (Map.Entry) iterator.next();
			aHashMap7479.put(entry.getKey(), (((Class556) ((List) entry.getValue()).get(0)).aClass527_Sub16_7495));
		}
		return aHashMap7479;
	}

	Class561 method9306(int i, int i_314_, int i_315_) {
		if (null == aClass561ArrayArrayArray7426[i][i_314_][i_315_]) {
			boolean bool = (null != aClass561ArrayArrayArray7426[0][i_314_][i_315_] && null != (aClass561ArrayArrayArray7426[0][i_314_][i_315_].aClass561_7554));
			if (bool && i >= anInt7466 * -1609909485 - 1)
				return null;
			method9225(i, i_314_, i_315_, -2019989889);
		}
		return aClass561ArrayArrayArray7426[i][i_314_][i_315_];
	}

	public void method9307(int i, Class161 class161) {
		aClass161Array7434[i] = class161;
	}

	public void method9308(int i, int i_316_, int i_317_, int i_318_, Class640_Sub1_Sub5 class640_sub1_sub5) {
		Class561 class561 = method9223(i, i_316_, i_317_, (byte) 1);
		if (null != class561) {
			class640_sub1_sub5.method10618(new Class442((float) (anInt7471 * -1485744437 + (i_316_ << 1742303003 * anInt7421)), (float) i_318_, (float) (-1485744437 * anInt7471 + (i_317_ << 1742303003 * anInt7421))));
			class561.aClass640_Sub1_Sub5_7557 = class640_sub1_sub5;
			int i_319_ = aClass161Array7435 == aClass161Array7434 ? 1 : 0;
			if (class640_sub1_sub5.method17069(-878846010)) {
				if (class640_sub1_sub5.method17072(1313256238)) {
					class640_sub1_sub5.aClass640_Sub1_10865 = aClass640_Sub1Array7450[i_319_];
					aClass640_Sub1Array7450[i_319_] = class640_sub1_sub5;
				} else {
					class640_sub1_sub5.aClass640_Sub1_10865 = aClass640_Sub1Array7449[i_319_];
					aClass640_Sub1Array7449[i_319_] = class640_sub1_sub5;
				}
			} else {
				class640_sub1_sub5.aClass640_Sub1_10865 = aClass640_Sub1Array7446[i_319_];
				aClass640_Sub1Array7446[i_319_] = class640_sub1_sub5;
			}
		}
	}

	public void method9309(int i, int i_320_, int i_321_, int i_322_, int i_323_, int i_324_, int i_325_, int i_326_) {
		if (anIntArrayArray7439 != null)
			anIntArrayArray7439[i][i_320_] = ~0xffffff | i_321_;
		if (null != aShortArrayArray7440)
			aShortArrayArray7440[i][i_320_] = (short) i_322_;
		if (aByteArrayArray7441 != null)
			aByteArrayArray7441[i][i_320_] = (byte) i_323_;
		if (aByteArrayArray7442 != null)
			aByteArrayArray7442[i][i_320_] = (byte) i_324_;
		if (null != aByteArrayArray7447)
			aByteArrayArray7447[i][i_320_] = (byte) i_325_;
		if (null != aByteArrayArray7428)
			aByteArrayArray7428[i][i_320_] = (byte) i_326_;
	}

	public void method9310(Class174 class174, int i) {
		/* empty */
	}

	public void method9311(int i, int i_327_, int i_328_, int i_329_, int i_330_, int i_331_, int i_332_, int i_333_) {
		if (anIntArrayArray7439 != null)
			anIntArrayArray7439[i][i_327_] = ~0xffffff | i_328_;
		if (null != aShortArrayArray7440)
			aShortArrayArray7440[i][i_327_] = (short) i_329_;
		if (aByteArrayArray7441 != null)
			aByteArrayArray7441[i][i_327_] = (byte) i_330_;
		if (aByteArrayArray7442 != null)
			aByteArrayArray7442[i][i_327_] = (byte) i_331_;
		if (null != aByteArrayArray7447)
			aByteArrayArray7447[i][i_327_] = (byte) i_332_;
		if (null != aByteArrayArray7428)
			aByteArrayArray7428[i][i_327_] = (byte) i_333_;
	}

	public void method9312(int i, int i_334_, int i_335_, int i_336_, int i_337_, int i_338_, int i_339_, int i_340_) {
		if (anIntArrayArray7439 != null)
			anIntArrayArray7439[i][i_334_] = ~0xffffff | i_335_;
		if (null != aShortArrayArray7440)
			aShortArrayArray7440[i][i_334_] = (short) i_336_;
		if (aByteArrayArray7441 != null)
			aByteArrayArray7441[i][i_334_] = (byte) i_337_;
		if (aByteArrayArray7442 != null)
			aByteArrayArray7442[i][i_334_] = (byte) i_338_;
		if (null != aByteArrayArray7447)
			aByteArrayArray7447[i][i_334_] = (byte) i_339_;
		if (null != aByteArrayArray7428)
			aByteArrayArray7428[i][i_334_] = (byte) i_340_;
	}

	public void method9313(int i, int i_341_, int i_342_, Class640_Sub1_Sub4 class640_sub1_sub4) {
		Class561 class561 = method9223(i, i_341_, i_342_, (byte) 1);
		if (class561 != null) {
			class561.aClass640_Sub1_Sub4_7556 = class640_sub1_sub4;
			int i_343_ = aClass161Array7435 == aClass161Array7434 ? 1 : 0;
			if (class640_sub1_sub4.method17069(-62024222)) {
				if (class640_sub1_sub4.method17072(1581685104)) {
					class640_sub1_sub4.aClass640_Sub1_10865 = aClass640_Sub1Array7450[i_343_];
					aClass640_Sub1Array7450[i_343_] = class640_sub1_sub4;
				} else {
					class640_sub1_sub4.aClass640_Sub1_10865 = aClass640_Sub1Array7449[i_343_];
					aClass640_Sub1Array7449[i_343_] = class640_sub1_sub4;
				}
			} else {
				class640_sub1_sub4.aClass640_Sub1_10865 = aClass640_Sub1Array7446[i_343_];
				aClass640_Sub1Array7446[i_343_] = class640_sub1_sub4;
			}
		}
	}

	public void method9314(int i, int i_344_, int i_345_, Class640_Sub1_Sub4 class640_sub1_sub4) {
		Class561 class561 = method9223(i, i_344_, i_345_, (byte) 1);
		if (class561 != null) {
			class561.aClass640_Sub1_Sub4_7556 = class640_sub1_sub4;
			int i_346_ = aClass161Array7435 == aClass161Array7434 ? 1 : 0;
			if (class640_sub1_sub4.method17069(-886143904)) {
				if (class640_sub1_sub4.method17072(783922736)) {
					class640_sub1_sub4.aClass640_Sub1_10865 = aClass640_Sub1Array7450[i_346_];
					aClass640_Sub1Array7450[i_346_] = class640_sub1_sub4;
				} else {
					class640_sub1_sub4.aClass640_Sub1_10865 = aClass640_Sub1Array7449[i_346_];
					aClass640_Sub1Array7449[i_346_] = class640_sub1_sub4;
				}
			} else {
				class640_sub1_sub4.aClass640_Sub1_10865 = aClass640_Sub1Array7446[i_346_];
				aClass640_Sub1Array7446[i_346_] = class640_sub1_sub4;
			}
		}
	}

	public Class562 method9315(int i, int i_347_, int i_348_) {
		Class561 class561 = aClass561ArrayArrayArray7426[i][i_347_][i_348_];
		if (class561 == null)
			return null;
		return class561.aClass562_7558;
	}

	public HashMap method9316(byte i) {
		aHashMap7479.clear();
		Iterator iterator = aHashMap7478.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry entry = (Map.Entry) iterator.next();
			aHashMap7479.put(entry.getKey(), (((Class556) ((List) entry.getValue()).get(0)).aClass527_Sub16_7495));
		}
		return aHashMap7479;
	}

	public void method9317(int i, int i_349_, int i_350_, Class640_Sub1_Sub3 class640_sub1_sub3, Class640_Sub1_Sub3 class640_sub1_sub3_351_) {
		Class561 class561 = method9223(i, i_349_, i_350_, (byte) 1);
		if (null != class561) {
			class561.aClass640_Sub1_Sub3_7553 = class640_sub1_sub3;
			class561.aClass640_Sub1_Sub3_7562 = class640_sub1_sub3_351_;
			int i_352_ = aClass161Array7435 == aClass161Array7434 ? 1 : 0;
			if (class640_sub1_sub3.method17069(-27122360)) {
				if (class640_sub1_sub3.method17072(990521358)) {
					class640_sub1_sub3.aClass640_Sub1_10865 = aClass640_Sub1Array7450[i_352_];
					aClass640_Sub1Array7450[i_352_] = class640_sub1_sub3;
				} else {
					class640_sub1_sub3.aClass640_Sub1_10865 = aClass640_Sub1Array7449[i_352_];
					aClass640_Sub1Array7449[i_352_] = class640_sub1_sub3;
				}
			} else {
				class640_sub1_sub3.aClass640_Sub1_10865 = aClass640_Sub1Array7446[i_352_];
				aClass640_Sub1Array7446[i_352_] = class640_sub1_sub3;
			}
			if (class640_sub1_sub3_351_ != null) {
				if (class640_sub1_sub3_351_.method17069(1325587593)) {
					if (class640_sub1_sub3_351_.method17072(122896829)) {
						class640_sub1_sub3_351_.aClass640_Sub1_10865 = aClass640_Sub1Array7450[i_352_];
						aClass640_Sub1Array7450[i_352_] = class640_sub1_sub3_351_;
					} else {
						class640_sub1_sub3_351_.aClass640_Sub1_10865 = aClass640_Sub1Array7449[i_352_];
						aClass640_Sub1Array7449[i_352_] = class640_sub1_sub3_351_;
					}
				} else {
					class640_sub1_sub3_351_.aClass640_Sub1_10865 = aClass640_Sub1Array7446[i_352_];
					aClass640_Sub1Array7446[i_352_] = class640_sub1_sub3_351_;
				}
			}
		}
	}

	public void method9318(int i, int i_353_, int i_354_, Class640_Sub1_Sub3 class640_sub1_sub3, Class640_Sub1_Sub3 class640_sub1_sub3_355_) {
		Class561 class561 = method9223(i, i_353_, i_354_, (byte) 1);
		if (null != class561) {
			class561.aClass640_Sub1_Sub3_7553 = class640_sub1_sub3;
			class561.aClass640_Sub1_Sub3_7562 = class640_sub1_sub3_355_;
			int i_356_ = aClass161Array7435 == aClass161Array7434 ? 1 : 0;
			if (class640_sub1_sub3.method17069(1473120536)) {
				if (class640_sub1_sub3.method17072(866246421)) {
					class640_sub1_sub3.aClass640_Sub1_10865 = aClass640_Sub1Array7450[i_356_];
					aClass640_Sub1Array7450[i_356_] = class640_sub1_sub3;
				} else {
					class640_sub1_sub3.aClass640_Sub1_10865 = aClass640_Sub1Array7449[i_356_];
					aClass640_Sub1Array7449[i_356_] = class640_sub1_sub3;
				}
			} else {
				class640_sub1_sub3.aClass640_Sub1_10865 = aClass640_Sub1Array7446[i_356_];
				aClass640_Sub1Array7446[i_356_] = class640_sub1_sub3;
			}
			if (class640_sub1_sub3_355_ != null) {
				if (class640_sub1_sub3_355_.method17069(1689121403)) {
					if (class640_sub1_sub3_355_.method17072(1801181897)) {
						class640_sub1_sub3_355_.aClass640_Sub1_10865 = aClass640_Sub1Array7450[i_356_];
						aClass640_Sub1Array7450[i_356_] = class640_sub1_sub3_355_;
					} else {
						class640_sub1_sub3_355_.aClass640_Sub1_10865 = aClass640_Sub1Array7449[i_356_];
						aClass640_Sub1Array7449[i_356_] = class640_sub1_sub3_355_;
					}
				} else {
					class640_sub1_sub3_355_.aClass640_Sub1_10865 = aClass640_Sub1Array7446[i_356_];
					aClass640_Sub1Array7446[i_356_] = class640_sub1_sub3_355_;
				}
			}
		}
	}

	void method9319(Class640_Sub1 class640_sub1, Class527_Sub16[] class527_sub16s) {
		if (aBool7455) {
			int i = class640_sub1.method17043(class527_sub16s, 1148714409);
			aClass180_7451.method3158(i, class527_sub16s);
		}
		if (aClass161Array7434 == aClass161Array7435) {
			boolean bool = false;
			boolean bool_357_ = false;
			Class442 class442 = class640_sub1.method10637().aClass442_4927;
			int i;
			int i_358_;
			if (class640_sub1 instanceof Class640_Sub1_Sub2) {
				i = ((Class640_Sub1_Sub2) class640_sub1).aShort11775;
				i_358_ = ((Class640_Sub1_Sub2) class640_sub1).aShort11771;
			} else {
				i = (int) class442.aFloat4918 >> anInt7421 * 1742303003;
				i_358_ = (int) class442.aFloat4919 >> anInt7421 * 1742303003;
			}
			i = Math.min(-547681223 * anInt7443 - 1, Math.max(0, i));
			i_358_ = Math.min(-1437024153 * anInt7432 - 1, Math.max(0, i_358_));
			Class178 class178 = new Class178();
			class178.anInt2055 = method9263(i, i_358_, -1586166821) * -2125644365;
			class178.anInt2050 = method9227(i, i_358_, (short) 1931) * 1806816041;
			class178.anInt2051 = method9229(i, i_358_, 748182699) * 433693819;
			class178.anInt2053 = method9247(i, i_358_, -2143002622) * -1803459975;
			class178.anInt2054 = method9273(i, i_358_, (byte) 1) * 420597091;
			class178.anInt2049 = method9232(i, i_358_, 598870759) * -834736135;
			aClass180_7451.method3144(aClass161Array7457[0].method2593((int) class442.aFloat4918, (int) class442.aFloat4919, -1151432033), class178);
		}
		Class558 class558 = class640_sub1.method17040(aClass180_7451, (byte) -28);
		if (class558 != null) {
			if (class558.aBool7530) {
				class558.aClass640_Sub1_7532 = class640_sub1;
				aClass546_7480.method9053(class558, -2041256035);
			} else
				Class389.method6463(class558, 2016120358);
		}
	}

	public void method9320(int i, int i_359_, int i_360_, Class640_Sub1_Sub1 class640_sub1_sub1, Class640_Sub1_Sub1 class640_sub1_sub1_361_) {
		Class561 class561 = method9223(i, i_359_, i_360_, (byte) 1);
		if (null != class561) {
			class561.aClass640_Sub1_Sub1_7552 = class640_sub1_sub1;
			class561.aClass640_Sub1_Sub1_7550 = class640_sub1_sub1_361_;
			int i_362_ = aClass161Array7435 == aClass161Array7434 ? 1 : 0;
			if (class640_sub1_sub1.method17069(-65046896)) {
				if (class640_sub1_sub1.method17072(1158390927)) {
					class640_sub1_sub1.aClass640_Sub1_10865 = aClass640_Sub1Array7450[i_362_];
					aClass640_Sub1Array7450[i_362_] = class640_sub1_sub1;
				} else {
					class640_sub1_sub1.aClass640_Sub1_10865 = aClass640_Sub1Array7449[i_362_];
					aClass640_Sub1Array7449[i_362_] = class640_sub1_sub1;
				}
			} else {
				class640_sub1_sub1.aClass640_Sub1_10865 = aClass640_Sub1Array7446[i_362_];
				aClass640_Sub1Array7446[i_362_] = class640_sub1_sub1;
			}
			if (class640_sub1_sub1_361_ != null) {
				if (class640_sub1_sub1_361_.method17069(1077610050)) {
					if (class640_sub1_sub1_361_.method17072(305562563)) {
						class640_sub1_sub1_361_.aClass640_Sub1_10865 = aClass640_Sub1Array7450[i_362_];
						aClass640_Sub1Array7450[i_362_] = class640_sub1_sub1_361_;
					} else {
						class640_sub1_sub1_361_.aClass640_Sub1_10865 = aClass640_Sub1Array7449[i_362_];
						aClass640_Sub1Array7449[i_362_] = class640_sub1_sub1_361_;
					}
				} else {
					class640_sub1_sub1_361_.aClass640_Sub1_10865 = aClass640_Sub1Array7446[i_362_];
					aClass640_Sub1Array7446[i_362_] = class640_sub1_sub1_361_;
				}
			}
		}
	}

	Class561 method9321(int i, int i_363_, int i_364_, short i_365_) {
		return method9223(i, Math.min(anInt7443 * -547681223 - 1, Math.max(0, i_363_)), Math.min(-1437024153 * anInt7432 - 1, Math.max(0, i_364_)), (byte) 1);
	}

	public boolean method9322(Class640_Sub1_Sub2 class640_sub1_sub2, boolean bool) {
		boolean bool_366_ = aClass161Array7435 == aClass161Array7434;
		int i = 0;
		short i_367_ = 0;
		byte i_368_ = 0;
		class640_sub1_sub2.method18335((byte) 24);
		short i_369_ = 0;
		int i_370_ = Math.min(anInt7443 * -547681223 - 1, Math.max(0, class640_sub1_sub2.aShort11775));
		int i_371_ = Math.min(anInt7443 * -547681223 - 1, Math.max(0, class640_sub1_sub2.aShort11770));
		int i_372_ = Math.min(anInt7432 * -1437024153 - 1, Math.max(0, class640_sub1_sub2.aShort11771));
		int i_373_ = Math.min(-1437024153 * anInt7432 - 1, Math.max(0, class640_sub1_sub2.aShort11772));
		for (int i_374_ = i_370_; i_374_ <= i_371_; i_374_++) {
			for (int i_375_ = i_372_; i_375_ <= i_373_; i_375_++) {
				Class561 class561 = method9321(class640_sub1_sub2.aByte10864, i_374_, i_375_, (short) -12093);
				if (null != class561) {
					Class562 class562 = Class39.method1157(class640_sub1_sub2, 243288809);
					Class562 class562_376_ = class561.aClass562_7558;
					if (null == class562_376_)
						class561.aClass562_7558 = class562;
					else {
						for (/**/; null != class562_376_.aClass562_7565; class562_376_ = class562_376_.aClass562_7565) {
							/* empty */
						}
						class562_376_.aClass562_7565 = class562;
					}
					if (bool_366_ && 0 != (anIntArrayArray7439[i_374_][i_375_] & ~0xffffff)) {
						i = anIntArrayArray7439[i_374_][i_375_];
						i_367_ = aShortArrayArray7440[i_374_][i_375_];
						i_368_ = aByteArrayArray7441[i_374_][i_375_];
					}
					if (!bool && null != class561.aClass640_Sub1_Sub4_7556 && (class561.aClass640_Sub1_Sub4_7556.aShort11871 > i_369_))
						i_369_ = class561.aClass640_Sub1_Sub4_7556.aShort11871;
				}
			}
		}
		if (bool_366_ && 0 != (i & ~0xffffff)) {
			for (int i_377_ = i_370_; i_377_ <= i_371_; i_377_++) {
				for (int i_378_ = i_372_; i_378_ <= i_373_; i_378_++) {
					if ((anIntArrayArray7439[i_377_][i_378_] & ~0xffffff) == 0) {
						anIntArrayArray7439[i_377_][i_378_] = i;
						aShortArrayArray7440[i_377_][i_378_] = i_367_;
						aByteArrayArray7441[i_377_][i_378_] = i_368_;
					}
				}
			}
		}
		if (bool) {
			aClass640_Sub1_Sub2Array7433[(anInt7445 += 1409014519) * 1273038535 - 1] = class640_sub1_sub2;
			class640_sub1_sub2.aClass555_10867 = this;
		} else {
			int i_379_ = aClass161Array7434 == aClass161Array7435 ? 1 : 0;
			if (class640_sub1_sub2.method17069(1064659511)) {
				if (class640_sub1_sub2.method17072(309904649)) {
					class640_sub1_sub2.aClass640_Sub1_10865 = aClass640_Sub1Array7450[i_379_];
					aClass640_Sub1Array7450[i_379_] = class640_sub1_sub2;
				} else {
					class640_sub1_sub2.aClass640_Sub1_10865 = aClass640_Sub1Array7449[i_379_];
					aClass640_Sub1Array7449[i_379_] = class640_sub1_sub2;
				}
			} else {
				class640_sub1_sub2.aClass640_Sub1_10865 = aClass640_Sub1Array7446[i_379_];
				aClass640_Sub1Array7446[i_379_] = class640_sub1_sub2;
			}
		}
		if (bool) {
			Class442 class442 = Class442.method7139(class640_sub1_sub2.method10637().aClass442_4927);
			class442.aFloat4915 -= (float) i_369_;
			class640_sub1_sub2.method10618(class442);
			class442.method7141();
		}
		return true;
	}

	public Class640_Sub1_Sub4 method9323(int i, int i_380_, int i_381_) {
		Class561 class561 = aClass561ArrayArrayArray7426[i][i_380_][i_381_];
		if (class561 == null || null == class561.aClass640_Sub1_Sub4_7556)
			return null;
		return class561.aClass640_Sub1_Sub4_7556;
	}

	public void method9324(int i, int i_382_, int i_383_, int i_384_) {
		Class561 class561 = aClass561ArrayArrayArray7426[i][i_382_][i_383_];
		if (class561 != null) {
			Class640_Sub1_Sub1 class640_sub1_sub1 = class561.aClass640_Sub1_Sub1_7552;
			Class640_Sub1_Sub1 class640_sub1_sub1_385_ = class561.aClass640_Sub1_Sub1_7550;
			if (null != class640_sub1_sub1) {
				class640_sub1_sub1.aShort11740 = (short) (class640_sub1_sub1.aShort11740 * i_384_ / (16 << 1742303003 * anInt7421 - 7));
				class640_sub1_sub1.aShort11741 = (short) (class640_sub1_sub1.aShort11741 * i_384_ / (16 << 1742303003 * anInt7421 - 7));
			}
			if (null != class640_sub1_sub1_385_) {
				class640_sub1_sub1_385_.aShort11740 = (short) (i_384_ * class640_sub1_sub1_385_.aShort11740 / (16 << 1742303003 * anInt7421 - 7));
				class640_sub1_sub1_385_.aShort11741 = (short) (i_384_ * class640_sub1_sub1_385_.aShort11741 / (16 << anInt7421 * 1742303003 - 7));
			}
		}
	}

	void method9325(boolean bool, byte[][][] is, int i, byte i_386_, int i_387_) {
		int i_388_ = bool ? 1 : 0;
		anInt7452 = 0;
		anInt7453 = 0;
		anInt7429 += -92122773;
		if ((i_387_ & 0x2) == 0) {
			for (Class640_Sub1 class640_sub1 = aClass640_Sub1Array7449[i_388_]; class640_sub1 != null; class640_sub1 = class640_sub1.aClass640_Sub1_10865) {
				method9262(class640_sub1, (byte) -58);
				if (1971671255 * class640_sub1.anInt10866 != -1 && !method9389(class640_sub1, bool, is, i, i_386_))
					aClass640_Sub1Array7483[(anInt7452 += -1341323837) * 831263467 - 1] = class640_sub1;
			}
		}
		if ((i_387_ & 0x1) == 0) {
			for (Class640_Sub1 class640_sub1 = aClass640_Sub1Array7450[i_388_]; class640_sub1 != null; class640_sub1 = class640_sub1.aClass640_Sub1_10865) {
				method9262(class640_sub1, (byte) -109);
				if (-1 != 1971671255 * class640_sub1.anInt10866 && !method9389(class640_sub1, bool, is, i, i_386_))
					aClass640_Sub1Array7454[(anInt7453 += 425340347) * -1900638349 - 1] = class640_sub1;
			}
			for (Class640_Sub1 class640_sub1 = aClass640_Sub1Array7446[i_388_]; class640_sub1 != null; class640_sub1 = class640_sub1.aClass640_Sub1_10865) {
				method9262(class640_sub1, (byte) -49);
				if (-1 != 1971671255 * class640_sub1.anInt10866 && !method9389(class640_sub1, bool, is, i, i_386_)) {
					if (class640_sub1.method17072(592352796))
						aClass640_Sub1Array7454[(anInt7453 += 425340347) * -1900638349 - 1] = class640_sub1;
					else
						aClass640_Sub1Array7483[(anInt7452 += -1341323837) * 831263467 - 1] = class640_sub1;
				}
			}
			if (!bool) {
				for (int i_389_ = 0; i_389_ < 1273038535 * anInt7445; i_389_++) {
					method9262(aClass640_Sub1_Sub2Array7433[i_389_], (byte) -46);
					if (1971671255 * (aClass640_Sub1_Sub2Array7433[i_389_].anInt10866) != -1 && !method9389(aClass640_Sub1_Sub2Array7433[i_389_], bool, is, i, i_386_)) {
						if (aClass640_Sub1_Sub2Array7433[i_389_].method17072(488895147))
							aClass640_Sub1Array7454[(anInt7453 += 425340347) * -1900638349 - 1] = aClass640_Sub1_Sub2Array7433[i_389_];
						else
							aClass640_Sub1Array7483[(anInt7452 += -1341323837) * 831263467 - 1] = aClass640_Sub1_Sub2Array7433[i_389_];
					}
				}
			}
		}
		if (anInt7452 * 831263467 > 0) {
			method9264(aClass640_Sub1Array7483, 0, 831263467 * anInt7452 - 1);
			for (int i_390_ = 0; i_390_ < 831263467 * anInt7452; i_390_++)
				method9266(aClass640_Sub1Array7483[i_390_], aClass527_Sub16Array7444);
		}
		if (aBool7455)
			aClass180_7451.method3158(0, null);
		if (0 == (i_387_ & 0x2)) {
			for (int i_391_ = 0; i_391_ < anInt7466 * -1609909485; i_391_++) {
				if (i_391_ >= i && is != null) {
					int i_392_ = aBoolArrayArray7467.length;
					if (1068144453 * anInt7477 + aBoolArrayArray7467.length > -547681223 * anInt7443)
						i_392_ -= (1068144453 * anInt7477 + aBoolArrayArray7467.length - -547681223 * anInt7443);
					int i_393_ = aBoolArrayArray7467[0].length;
					if (anInt7468 * -1268111611 + aBoolArrayArray7467[0].length > -1437024153 * anInt7432)
						i_393_ -= (anInt7468 * -1268111611 + aBoolArrayArray7467[0].length - -1437024153 * anInt7432);
					boolean[][] bools = aBoolArrayArray7481;
					if (aBool7470) {
						for (int i_394_ = -362087053 * anInt7464; i_394_ < i_392_; i_394_++) {
							int i_395_ = (1068144453 * anInt7477 + i_394_ - anInt7464 * -362087053);
							for (int i_396_ = anInt7465 * -473616249; i_396_ < i_393_; i_396_++) {
								bools[i_394_][i_396_] = false;
								if (aBoolArrayArray7467[i_394_][i_396_]) {
									int i_397_ = (i_396_ + anInt7468 * -1268111611 - -473616249 * anInt7465);
									for (int i_398_ = i_391_; i_398_ >= 0; i_398_--) {
										if ((null != (aClass561ArrayArrayArray7426[i_398_][i_395_][i_397_])) && (i_391_ == (aClass561ArrayArrayArray7426[i_398_][i_395_][i_397_].aByte7555))) {
											if ((i_398_ >= i && (is[i_398_][i_395_][i_397_] == i_386_)) || (aClass566_7430.method9549(i_391_, i_395_, i_397_)))
												bools[i_394_][i_396_] = false;
											else
												bools[i_394_][i_396_] = true;
											break;
										}
									}
								}
							}
						}
					}
					aClass161Array7434[i_391_].method2591(1968897173 * anInt7431, anInt7458 * 64349821, anInt7463 * 1329492325, aBoolArrayArray7481, false, i_387_);
				} else {
					int i_399_ = aBoolArrayArray7467.length;
					if (1068144453 * anInt7477 + aBoolArrayArray7467.length > -547681223 * anInt7443)
						i_399_ -= (1068144453 * anInt7477 + aBoolArrayArray7467.length - -547681223 * anInt7443);
					int i_400_ = aBoolArrayArray7467[0].length;
					if (aBoolArrayArray7467[0].length + -1268111611 * anInt7468 > anInt7432 * -1437024153)
						i_400_ -= (aBoolArrayArray7467[0].length + anInt7468 * -1268111611 - anInt7432 * -1437024153);
					boolean[][] bools = aBoolArrayArray7481;
					if (aBool7470) {
						for (int i_401_ = anInt7464 * -362087053; i_401_ < i_399_; i_401_++) {
							int i_402_ = (1068144453 * anInt7477 + i_401_ - -362087053 * anInt7464);
							for (int i_403_ = anInt7465 * -473616249; i_403_ < i_400_; i_403_++) {
								if (aBoolArrayArray7467[i_401_][i_403_] && !(aClass566_7430.method9549(i_391_, i_402_, (-1268111611 * anInt7468 + i_403_ - anInt7465 * -473616249))))
									bools[i_401_][i_403_] = true;
								else
									bools[i_401_][i_403_] = false;
							}
						}
					}
					aClass161Array7434[i_391_].method2591(1968897173 * anInt7431, 64349821 * anInt7458, anInt7463 * 1329492325, aBoolArrayArray7481, true, i_387_);
				}
			}
		}
		if (-1900638349 * anInt7453 > 0) {
			method9351(aClass640_Sub1Array7454, 0, -1900638349 * anInt7453 - 1);
			for (int i_404_ = 0; i_404_ < -1900638349 * anInt7453; i_404_++)
				method9266(aClass640_Sub1Array7454[i_404_], aClass527_Sub16Array7444);
		}
	}

	public Class640_Sub1_Sub4 method9326(int i, int i_405_, int i_406_, int i_407_) {
		Class561 class561 = aClass561ArrayArrayArray7426[i][i_405_][i_406_];
		if (null == class561)
			return null;
		method9249(class561.aClass640_Sub1_Sub4_7556, -99639426);
		if (null != class561.aClass640_Sub1_Sub4_7556) {
			Class640_Sub1_Sub4 class640_sub1_sub4 = class561.aClass640_Sub1_Sub4_7556;
			class561.aClass640_Sub1_Sub4_7556 = null;
			return class640_sub1_sub4;
		}
		return null;
	}

	public void method9327() {
		for (int i = 0; i < 1273038535 * anInt7445; i++) {
			Class640_Sub1_Sub2 class640_sub1_sub2 = aClass640_Sub1_Sub2Array7433[i];
			method9274(class640_sub1_sub2, true, -1818093276);
			aClass640_Sub1_Sub2Array7433[i] = null;
		}
		anInt7445 = 0;
	}

	public void method9328(int i, int i_408_, int i_409_, int i_410_, int i_411_, int i_412_, int i_413_, int i_414_) {
		if (anIntArrayArray7439 != null)
			anIntArrayArray7439[i][i_408_] = ~0xffffff | i_409_;
		if (null != aShortArrayArray7440)
			aShortArrayArray7440[i][i_408_] = (short) i_410_;
		if (aByteArrayArray7441 != null)
			aByteArrayArray7441[i][i_408_] = (byte) i_411_;
		if (aByteArrayArray7442 != null)
			aByteArrayArray7442[i][i_408_] = (byte) i_412_;
		if (null != aByteArrayArray7447)
			aByteArrayArray7447[i][i_408_] = (byte) i_413_;
		if (null != aByteArrayArray7428)
			aByteArrayArray7428[i][i_408_] = (byte) i_414_;
	}

	public int method9329(int i, int i_415_) {
		return (null != aByteArrayArray7428 ? aByteArrayArray7428[i][i_415_] & 0xff : 0);
	}

	public void method9330() {
		for (int i = 0; i < 1273038535 * anInt7445; i++) {
			Class640_Sub1_Sub2 class640_sub1_sub2 = aClass640_Sub1_Sub2Array7433[i];
			method9274(class640_sub1_sub2, true, -2136318423);
			aClass640_Sub1_Sub2Array7433[i] = null;
		}
		anInt7445 = 0;
	}

	public Class640_Sub1_Sub3 method9331(int i, int i_416_, int i_417_) {
		Class561 class561 = aClass561ArrayArrayArray7426[i][i_416_][i_417_];
		if (null != class561) {
			method9249(class561.aClass640_Sub1_Sub3_7553, -99639426);
			if (null != class561.aClass640_Sub1_Sub3_7553) {
				Class640_Sub1_Sub3 class640_sub1_sub3 = class561.aClass640_Sub1_Sub3_7553;
				class561.aClass640_Sub1_Sub3_7553 = null;
				return class640_sub1_sub3;
			}
		}
		return null;
	}

	public void method9332(int i) {
		for (int i_418_ = 0; i_418_ < 187596765 * anInt7474; i_418_++) {
			if (!aBoolArray7448[i_418_]) {
				Class556 class556 = aClass556Array7476[i_418_];
				Class527_Sub16 class527_sub16 = class556.aClass527_Sub16_7495;
				int i_419_ = 753393863 * class556.anInt7510;
				int i_420_ = (class527_sub16.method16132(-2091398562) - -1485744437 * anInt7471);
				int i_421_ = 1 + (2 * i_420_ >> anInt7421 * 1742303003);
				int i_422_ = 0;
				int[] is = new int[i_421_ * i_421_];
				int i_423_ = (class527_sub16.method16129((byte) 26) - i_420_ >> 1742303003 * anInt7421);
				int i_424_ = (class527_sub16.method16131((byte) -58) - i_420_ >> anInt7421 * 1742303003);
				int i_425_ = (class527_sub16.method16131((byte) 99) + i_420_ >> anInt7421 * 1742303003);
				if (i_424_ < 0) {
					i_422_ -= i_424_;
					i_424_ = 0;
				}
				if (i_425_ >= anInt7432 * -1437024153)
					i_425_ = anInt7432 * -1437024153 - 1;
				for (int i_426_ = i_424_; i_426_ <= i_425_; i_426_++) {
					int i_427_ = class556.aShortArray7511[i_422_];
					int i_428_ = i_427_ >>> 8;
					int i_429_ = i_421_ * i_422_ + i_428_;
					int i_430_ = i_423_ + (i_427_ >>> 8);
					int i_431_ = i_430_ + (i_427_ & 0xff) - 1;
					if (i_430_ < 0) {
						i_429_ -= i_430_;
						i_430_ = 0;
					}
					if (i_431_ >= anInt7443 * -547681223)
						i_431_ = anInt7443 * -547681223 - 1;
					for (int i_432_ = i_430_; i_432_ <= i_431_; i_432_++) {
						int i_433_ = 1;
						Class640_Sub1_Sub2 class640_sub1_sub2 = method9254(i_419_, i_432_, i_426_, null, -1912247965);
						if (class640_sub1_sub2 != null && 0 != class640_sub1_sub2.aByte11776) {
							if (1 == class640_sub1_sub2.aByte11776) {
								boolean bool = i_432_ - 1 >= i_430_;
								boolean bool_434_ = i_432_ + 1 <= i_431_;
								if (!bool && i_426_ + 1 <= i_425_) {
									int i_435_ = class556.aShortArray7511[1 + i_422_];
									int i_436_ = (i_435_ >>> 8) + i_423_;
									int i_437_ = (i_435_ & 0xff) + i_436_;
									bool = i_432_ > i_436_ && i_432_ < i_437_;
								}
								if (!bool_434_ && i_426_ - 1 >= i_424_) {
									int i_438_ = class556.aShortArray7511[i_422_ - 1];
									int i_439_ = (i_438_ >>> 8) + i_423_;
									int i_440_ = (i_438_ & 0xff) + i_439_;
									bool_434_ = i_432_ > i_439_ && i_432_ < i_440_;
								}
								if (bool && !bool_434_)
									i_433_ = 4;
								else if (bool_434_ && !bool)
									i_433_ = 2;
							} else {
								boolean bool = i_432_ - 1 >= i_430_;
								boolean bool_441_ = i_432_ + 1 <= i_431_;
								if (!bool && i_426_ - 1 >= i_424_) {
									int i_442_ = class556.aShortArray7511[i_422_ - 1];
									int i_443_ = (i_442_ >>> 8) + i_423_;
									int i_444_ = i_443_ + (i_442_ & 0xff);
									bool = i_432_ > i_443_ && i_432_ < i_444_;
								}
								if (!bool_441_ && 1 + i_426_ <= i_425_) {
									int i_445_ = class556.aShortArray7511[1 + i_422_];
									int i_446_ = (i_445_ >>> 8) + i_423_;
									int i_447_ = (i_445_ & 0xff) + i_446_;
									bool_441_ = i_432_ > i_446_ && i_432_ < i_447_;
								}
								if (bool && !bool_441_)
									i_433_ = 3;
								else if (bool_441_ && !bool)
									i_433_ = 5;
							}
						}
						is[i_429_++] = i_433_;
					}
					i_422_++;
				}
				aBoolArray7448[i_418_] = true;
				if (aBool7456)
					aClass161Array7434[i_419_].method2601(class527_sub16, is);
			}
		}
	}

	public Class640_Sub1_Sub3 method9333(int i, int i_448_, int i_449_) {
		Class561 class561 = aClass561ArrayArrayArray7426[i][i_448_][i_449_];
		if (null != class561) {
			method9249(class561.aClass640_Sub1_Sub3_7562, -99639426);
			if (null != class561.aClass640_Sub1_Sub3_7562) {
				Class640_Sub1_Sub3 class640_sub1_sub3 = class561.aClass640_Sub1_Sub3_7562;
				class561.aClass640_Sub1_Sub3_7562 = null;
				return class640_sub1_sub3;
			}
		}
		return null;
	}

	public Class640_Sub1_Sub3 method9334(int i, int i_450_, int i_451_) {
		Class561 class561 = aClass561ArrayArrayArray7426[i][i_450_][i_451_];
		if (null != class561) {
			method9249(class561.aClass640_Sub1_Sub3_7562, -99639426);
			if (null != class561.aClass640_Sub1_Sub3_7562) {
				Class640_Sub1_Sub3 class640_sub1_sub3 = class561.aClass640_Sub1_Sub3_7562;
				class561.aClass640_Sub1_Sub3_7562 = null;
				return class640_sub1_sub3;
			}
		}
		return null;
	}

	public Class640_Sub1_Sub3 method9335(int i, int i_452_, int i_453_, byte i_454_) {
		Class561 class561 = aClass561ArrayArrayArray7426[i][i_452_][i_453_];
		if (null != class561) {
			method9249(class561.aClass640_Sub1_Sub3_7562, -99639426);
			if (null != class561.aClass640_Sub1_Sub3_7562) {
				Class640_Sub1_Sub3 class640_sub1_sub3 = class561.aClass640_Sub1_Sub3_7562;
				class561.aClass640_Sub1_Sub3_7562 = null;
				return class640_sub1_sub3;
			}
		}
		return null;
	}

	public Class640_Sub1_Sub3 method9336(int i, int i_455_, int i_456_) {
		Class561 class561 = aClass561ArrayArrayArray7426[i][i_455_][i_456_];
		if (null != class561) {
			method9249(class561.aClass640_Sub1_Sub3_7562, -99639426);
			if (null != class561.aClass640_Sub1_Sub3_7562) {
				Class640_Sub1_Sub3 class640_sub1_sub3 = class561.aClass640_Sub1_Sub3_7562;
				class561.aClass640_Sub1_Sub3_7562 = null;
				return class640_sub1_sub3;
			}
		}
		return null;
	}

	public Class640_Sub1_Sub1 method9337(int i, int i_457_, int i_458_) {
		Class561 class561 = aClass561ArrayArrayArray7426[i][i_457_][i_458_];
		if (null != class561) {
			method9249(class561.aClass640_Sub1_Sub1_7552, -99639426);
			if (null != class561.aClass640_Sub1_Sub1_7552) {
				Class640_Sub1_Sub1 class640_sub1_sub1 = class561.aClass640_Sub1_Sub1_7552;
				class561.aClass640_Sub1_Sub1_7552 = null;
				return class640_sub1_sub1;
			}
		}
		return null;
	}

	public Class640_Sub1_Sub1 method9338(int i, int i_459_, int i_460_) {
		Class561 class561 = aClass561ArrayArrayArray7426[i][i_459_][i_460_];
		if (class561 != null) {
			method9249(class561.aClass640_Sub1_Sub1_7550, -99639426);
			if (null != class561.aClass640_Sub1_Sub1_7550) {
				Class640_Sub1_Sub1 class640_sub1_sub1 = class561.aClass640_Sub1_Sub1_7550;
				class561.aClass640_Sub1_Sub1_7550 = null;
				return class640_sub1_sub1;
			}
		}
		return null;
	}

	public Class640_Sub1_Sub1 method9339(int i, int i_461_, int i_462_) {
		Class561 class561 = aClass561ArrayArrayArray7426[i][i_461_][i_462_];
		if (class561 != null) {
			method9249(class561.aClass640_Sub1_Sub1_7550, -99639426);
			if (null != class561.aClass640_Sub1_Sub1_7550) {
				Class640_Sub1_Sub1 class640_sub1_sub1 = class561.aClass640_Sub1_Sub1_7550;
				class561.aClass640_Sub1_Sub1_7550 = null;
				return class640_sub1_sub1;
			}
		}
		return null;
	}

	public Class640_Sub1_Sub4 method9340(int i, int i_463_, int i_464_) {
		Class561 class561 = aClass561ArrayArrayArray7426[i][i_463_][i_464_];
		if (null == class561)
			return null;
		method9249(class561.aClass640_Sub1_Sub4_7556, -99639426);
		if (null != class561.aClass640_Sub1_Sub4_7556) {
			Class640_Sub1_Sub4 class640_sub1_sub4 = class561.aClass640_Sub1_Sub4_7556;
			class561.aClass640_Sub1_Sub4_7556 = null;
			return class640_sub1_sub4;
		}
		return null;
	}

	public Class640_Sub1_Sub5 method9341(int i, int i_465_, int i_466_) {
		Class561 class561 = aClass561ArrayArrayArray7426[i][i_465_][i_466_];
		if (null == class561)
			return null;
		Class640_Sub1_Sub5 class640_sub1_sub5 = class561.aClass640_Sub1_Sub5_7557;
		class561.aClass640_Sub1_Sub5_7557 = null;
		method9249(class640_sub1_sub5, -99639426);
		return class640_sub1_sub5;
	}

	public Class640_Sub1_Sub5 method9342(int i, int i_467_, int i_468_) {
		Class561 class561 = aClass561ArrayArrayArray7426[i][i_467_][i_468_];
		if (null == class561)
			return null;
		Class640_Sub1_Sub5 class640_sub1_sub5 = class561.aClass640_Sub1_Sub5_7557;
		class561.aClass640_Sub1_Sub5_7557 = null;
		method9249(class640_sub1_sub5, -99639426);
		return class640_sub1_sub5;
	}

	public Class640_Sub1_Sub5 method9343(int i, int i_469_, int i_470_) {
		Class561 class561 = aClass561ArrayArrayArray7426[i][i_469_][i_470_];
		if (null == class561)
			return null;
		Class640_Sub1_Sub5 class640_sub1_sub5 = class561.aClass640_Sub1_Sub5_7557;
		class561.aClass640_Sub1_Sub5_7557 = null;
		method9249(class640_sub1_sub5, -99639426);
		return class640_sub1_sub5;
	}

	public boolean method9344(Class640_Sub1_Sub2 class640_sub1_sub2, boolean bool) {
		boolean bool_471_ = aClass161Array7435 == aClass161Array7434;
		int i = 0;
		short i_472_ = 0;
		byte i_473_ = 0;
		class640_sub1_sub2.method18335((byte) 28);
		short i_474_ = 0;
		int i_475_ = Math.min(anInt7443 * -547681223 - 1, Math.max(0, class640_sub1_sub2.aShort11775));
		int i_476_ = Math.min(anInt7443 * -547681223 - 1, Math.max(0, class640_sub1_sub2.aShort11770));
		int i_477_ = Math.min(anInt7432 * -1437024153 - 1, Math.max(0, class640_sub1_sub2.aShort11771));
		int i_478_ = Math.min(-1437024153 * anInt7432 - 1, Math.max(0, class640_sub1_sub2.aShort11772));
		for (int i_479_ = i_475_; i_479_ <= i_476_; i_479_++) {
			for (int i_480_ = i_477_; i_480_ <= i_478_; i_480_++) {
				Class561 class561 = method9321(class640_sub1_sub2.aByte10864, i_479_, i_480_, (short) -21326);
				if (null != class561) {
					Class562 class562 = Class39.method1157(class640_sub1_sub2, 124269994);
					Class562 class562_481_ = class561.aClass562_7558;
					if (null == class562_481_)
						class561.aClass562_7558 = class562;
					else {
						for (/**/; null != class562_481_.aClass562_7565; class562_481_ = class562_481_.aClass562_7565) {
							/* empty */
						}
						class562_481_.aClass562_7565 = class562;
					}
					if (bool_471_ && 0 != (anIntArrayArray7439[i_479_][i_480_] & ~0xffffff)) {
						i = anIntArrayArray7439[i_479_][i_480_];
						i_472_ = aShortArrayArray7440[i_479_][i_480_];
						i_473_ = aByteArrayArray7441[i_479_][i_480_];
					}
					if (!bool && null != class561.aClass640_Sub1_Sub4_7556 && (class561.aClass640_Sub1_Sub4_7556.aShort11871 > i_474_))
						i_474_ = class561.aClass640_Sub1_Sub4_7556.aShort11871;
				}
			}
		}
		if (bool_471_ && 0 != (i & ~0xffffff)) {
			for (int i_482_ = i_475_; i_482_ <= i_476_; i_482_++) {
				for (int i_483_ = i_477_; i_483_ <= i_478_; i_483_++) {
					if ((anIntArrayArray7439[i_482_][i_483_] & ~0xffffff) == 0) {
						anIntArrayArray7439[i_482_][i_483_] = i;
						aShortArrayArray7440[i_482_][i_483_] = i_472_;
						aByteArrayArray7441[i_482_][i_483_] = i_473_;
					}
				}
			}
		}
		if (bool) {
			aClass640_Sub1_Sub2Array7433[(anInt7445 += 1409014519) * 1273038535 - 1] = class640_sub1_sub2;
			class640_sub1_sub2.aClass555_10867 = this;
		} else {
			int i_484_ = aClass161Array7434 == aClass161Array7435 ? 1 : 0;
			if (class640_sub1_sub2.method17069(2015601189)) {
				if (class640_sub1_sub2.method17072(2119030256)) {
					class640_sub1_sub2.aClass640_Sub1_10865 = aClass640_Sub1Array7450[i_484_];
					aClass640_Sub1Array7450[i_484_] = class640_sub1_sub2;
				} else {
					class640_sub1_sub2.aClass640_Sub1_10865 = aClass640_Sub1Array7449[i_484_];
					aClass640_Sub1Array7449[i_484_] = class640_sub1_sub2;
				}
			} else {
				class640_sub1_sub2.aClass640_Sub1_10865 = aClass640_Sub1Array7446[i_484_];
				aClass640_Sub1Array7446[i_484_] = class640_sub1_sub2;
			}
		}
		if (bool) {
			Class442 class442 = Class442.method7139(class640_sub1_sub2.method10637().aClass442_4927);
			class442.aFloat4915 -= (float) i_474_;
			class640_sub1_sub2.method10618(class442);
			class442.method7141();
		}
		return true;
	}

	void method9345(Class640_Sub1_Sub2 class640_sub1_sub2, boolean bool) {
		int i = Math.min(anInt7443 * -547681223 - 1, Math.max(0, class640_sub1_sub2.aShort11775));
		int i_485_ = Math.min(anInt7443 * -547681223 - 1, Math.max(0, class640_sub1_sub2.aShort11770));
		int i_486_ = Math.min(anInt7432 * -1437024153 - 1, Math.max(0, class640_sub1_sub2.aShort11771));
		int i_487_ = Math.min(-1437024153 * anInt7432 - 1, Math.max(0, class640_sub1_sub2.aShort11772));
		for (int i_488_ = i; i_488_ <= i_485_; i_488_++) {
			for (int i_489_ = i_486_; i_489_ <= i_487_; i_489_++) {
				Class561 class561 = (aClass561ArrayArrayArray7426[class640_sub1_sub2.aByte10864][i_488_][i_489_]);
				if (null != class561) {
					Class562 class562 = class561.aClass562_7558;
					Class562 class562_490_ = null;
					for (/**/; class562 != null; class562 = class562.aClass562_7565) {
						if (class562.aClass640_Sub1_Sub2_7564 == class640_sub1_sub2) {
							if (class562_490_ != null)
								class562_490_.aClass562_7565 = class562.aClass562_7565;
							else
								class561.aClass562_7558 = class562.aClass562_7565;
							class562.method9453(813127029);
							break;
						}
						class562_490_ = class562;
					}
				}
			}
		}
		if (!bool)
			method9249(class640_sub1_sub2, -99639426);
	}

	public Class640_Sub1_Sub5 method9346(int i, int i_491_, int i_492_, int i_493_) {
		Class561 class561 = aClass561ArrayArrayArray7426[i][i_491_][i_492_];
		if (class561 == null)
			return null;
		return class561.aClass640_Sub1_Sub5_7557;
	}

	Class561 method9347(int i, int i_494_, int i_495_) {
		if (null == aClass561ArrayArrayArray7426[i][i_494_][i_495_]) {
			boolean bool = (null != aClass561ArrayArrayArray7426[0][i_494_][i_495_] && null != (aClass561ArrayArrayArray7426[0][i_494_][i_495_].aClass561_7554));
			if (bool && i >= anInt7466 * -1609909485 - 1)
				return null;
			method9225(i, i_494_, i_495_, -2083694618);
		}
		return aClass561ArrayArrayArray7426[i][i_494_][i_495_];
	}

	public int method9348(int i, int i_496_) {
		return (anIntArrayArray7439 != null ? anIntArrayArray7439[i][i_496_] & 0xffffff : 0);
	}

	void method9349(Class640_Sub1_Sub2 class640_sub1_sub2, boolean bool) {
		int i = Math.min(anInt7443 * -547681223 - 1, Math.max(0, class640_sub1_sub2.aShort11775));
		int i_497_ = Math.min(anInt7443 * -547681223 - 1, Math.max(0, class640_sub1_sub2.aShort11770));
		int i_498_ = Math.min(anInt7432 * -1437024153 - 1, Math.max(0, class640_sub1_sub2.aShort11771));
		int i_499_ = Math.min(-1437024153 * anInt7432 - 1, Math.max(0, class640_sub1_sub2.aShort11772));
		for (int i_500_ = i; i_500_ <= i_497_; i_500_++) {
			for (int i_501_ = i_498_; i_501_ <= i_499_; i_501_++) {
				Class561 class561 = (aClass561ArrayArrayArray7426[class640_sub1_sub2.aByte10864][i_500_][i_501_]);
				if (null != class561) {
					Class562 class562 = class561.aClass562_7558;
					Class562 class562_502_ = null;
					for (/**/; class562 != null; class562 = class562.aClass562_7565) {
						if (class562.aClass640_Sub1_Sub2_7564 == class640_sub1_sub2) {
							if (class562_502_ != null)
								class562_502_.aClass562_7565 = class562.aClass562_7565;
							else
								class561.aClass562_7558 = class562.aClass562_7565;
							class562.method9453(999160652);
							break;
						}
						class562_502_ = class562;
					}
				}
			}
		}
		if (!bool)
			method9249(class640_sub1_sub2, -99639426);
	}

	void method9350(Class640_Sub1_Sub2 class640_sub1_sub2, boolean bool) {
		int i = Math.min(anInt7443 * -547681223 - 1, Math.max(0, class640_sub1_sub2.aShort11775));
		int i_503_ = Math.min(anInt7443 * -547681223 - 1, Math.max(0, class640_sub1_sub2.aShort11770));
		int i_504_ = Math.min(anInt7432 * -1437024153 - 1, Math.max(0, class640_sub1_sub2.aShort11771));
		int i_505_ = Math.min(-1437024153 * anInt7432 - 1, Math.max(0, class640_sub1_sub2.aShort11772));
		for (int i_506_ = i; i_506_ <= i_503_; i_506_++) {
			for (int i_507_ = i_504_; i_507_ <= i_505_; i_507_++) {
				Class561 class561 = (aClass561ArrayArrayArray7426[class640_sub1_sub2.aByte10864][i_506_][i_507_]);
				if (null != class561) {
					Class562 class562 = class561.aClass562_7558;
					Class562 class562_508_ = null;
					for (/**/; class562 != null; class562 = class562.aClass562_7565) {
						if (class562.aClass640_Sub1_Sub2_7564 == class640_sub1_sub2) {
							if (class562_508_ != null)
								class562_508_.aClass562_7565 = class562.aClass562_7565;
							else
								class561.aClass562_7558 = class562.aClass562_7565;
							class562.method9453(-482467251);
							break;
						}
						class562_508_ = class562;
					}
				}
			}
		}
		if (!bool)
			method9249(class640_sub1_sub2, -99639426);
	}

	void method9351(Class640_Sub1[] class640_sub1s, int i, int i_509_) {
		if (i < i_509_) {
			int i_510_ = (i_509_ + i) / 2;
			int i_511_ = i;
			Class640_Sub1 class640_sub1 = class640_sub1s[i_510_];
			class640_sub1s[i_510_] = class640_sub1s[i_509_];
			class640_sub1s[i_509_] = class640_sub1;
			int i_512_ = class640_sub1.anInt10866 * 1971671255;
			for (int i_513_ = i; i_513_ < i_509_; i_513_++) {
				if (class640_sub1s[i_513_].anInt10866 * 1971671255 > (i_513_ & 0x1) + i_512_) {
					Class640_Sub1 class640_sub1_514_ = class640_sub1s[i_513_];
					class640_sub1s[i_513_] = class640_sub1s[i_511_];
					class640_sub1s[i_511_++] = class640_sub1_514_;
				}
			}
			class640_sub1s[i_509_] = class640_sub1s[i_511_];
			class640_sub1s[i_511_] = class640_sub1;
			method9351(class640_sub1s, i, i_511_ - 1);
			method9351(class640_sub1s, i_511_ + 1, i_509_);
		}
	}

	public void method9352(Class556 class556) {
		if (187596765 * anInt7474 < 65174) {
			Class527_Sub16 class527_sub16 = class556.aClass527_Sub16_7495;
			aClass556Array7476[187596765 * anInt7474] = class556;
			aBoolArray7448[anInt7474 * 187596765] = false;
			anInt7474 += 2072825973;
			int i = 753393863 * class556.anInt7510;
			if (class556.aBool7496)
				i = 0;
			int i_515_ = 753393863 * class556.anInt7510;
			if (class556.aBool7508)
				i_515_ = anInt7466 * -1609909485 - 1;
			for (int i_516_ = i; i_516_ <= i_515_; i_516_++) {
				int i_517_ = 0;
				int i_518_ = ((class527_sub16.method16131((byte) 62) - class527_sub16.method16132(385240536) + anInt7471 * -1485744437) >> 1742303003 * anInt7421);
				if (i_518_ < 0) {
					i_517_ -= i_518_;
					i_518_ = 0;
				}
				int i_519_ = ((class527_sub16.method16131((byte) -78) + class527_sub16.method16132(138324550) - -1485744437 * anInt7471) >> anInt7421 * 1742303003);
				if (i_519_ >= -1437024153 * anInt7432)
					i_519_ = anInt7432 * -1437024153 - 1;
				for (int i_520_ = i_518_; i_520_ <= i_519_; i_520_++) {
					int i_521_ = class556.aShortArray7511[i_517_++];
					int i_522_ = (((class527_sub16.method16129((byte) 56) - class527_sub16.method16132(-1383713293) + anInt7471 * -1485744437) >> 1742303003 * anInt7421) + (i_521_ >>> 8));
					int i_523_ = i_522_ + (i_521_ & 0xff) - 1;
					if (i_522_ < 0)
						i_522_ = 0;
					if (i_523_ >= anInt7443 * -547681223)
						i_523_ = anInt7443 * -547681223 - 1;
					for (int i_524_ = i_522_; i_524_ <= i_523_; i_524_++) {
						long l = aLongArrayArrayArray7475[i_516_][i_524_][i_520_];
						if ((l & 0xffffL) == 0L)
							aLongArrayArrayArray7475[i_516_][i_524_][i_520_] = l | (long) (187596765 * anInt7474);
						else if ((l & 0xffff0000L) == 0L)
							aLongArrayArrayArray7475[i_516_][i_524_][i_520_] = l | (long) (187596765 * anInt7474) << 16;
						else if (0L == (l & 0xffff00000000L))
							aLongArrayArrayArray7475[i_516_][i_524_][i_520_] = l | (long) (187596765 * anInt7474) << 32;
						else if (0L == (l & ~0xffffffffffffL))
							aLongArrayArrayArray7475[i_516_][i_524_][i_520_] = l | (long) (187596765 * anInt7474) << 48;
					}
				}
			}
			if (class556.anInt7518 * -235567559 != -1) {
				List list = ((List) aHashMap7478.get(Integer.valueOf(class556.anInt7518 * -235567559)));
				if (null == list) {
					list = new ArrayList();
					aHashMap7478.put(Integer.valueOf(class556.anInt7518 * -235567559), list);
				}
				list.add(class556);
				Class527_Sub16 class527_sub16_525_ = ((Class527_Sub16) aHashMap7479.get(Integer.valueOf(class556.anInt7518 * -235567559)));
				if (null != class527_sub16_525_) {
					class556.aClass527_Sub16_7495.method16146(class527_sub16_525_.method16133((byte) 0), 1743952166);
					class556.aClass527_Sub16_7495.method16139(class527_sub16_525_.method16137(1494555372), class527_sub16_525_.method16145(2076407362), -120559161);
				}
			}
		}
	}

	public void method9353(int i, int i_526_, int i_527_, int i_528_) {
		Class561 class561 = aClass561ArrayArrayArray7426[i][i_526_][i_527_];
		if (class561 != null) {
			Class640_Sub1_Sub1 class640_sub1_sub1 = class561.aClass640_Sub1_Sub1_7552;
			Class640_Sub1_Sub1 class640_sub1_sub1_529_ = class561.aClass640_Sub1_Sub1_7550;
			if (null != class640_sub1_sub1) {
				class640_sub1_sub1.aShort11740 = (short) (class640_sub1_sub1.aShort11740 * i_528_ / (16 << 1742303003 * anInt7421 - 7));
				class640_sub1_sub1.aShort11741 = (short) (class640_sub1_sub1.aShort11741 * i_528_ / (16 << 1742303003 * anInt7421 - 7));
			}
			if (null != class640_sub1_sub1_529_) {
				class640_sub1_sub1_529_.aShort11740 = (short) (i_528_ * class640_sub1_sub1_529_.aShort11740 / (16 << 1742303003 * anInt7421 - 7));
				class640_sub1_sub1_529_.aShort11741 = (short) (i_528_ * class640_sub1_sub1_529_.aShort11741 / (16 << anInt7421 * 1742303003 - 7));
			}
		}
	}

	void method9354(Class640_Sub1 class640_sub1) {
		if (null != class640_sub1) {
			class640_sub1.method10620();
			for (int i = 0; i < 2; i++) {
				Class640_Sub1 class640_sub1_530_ = null;
				for (Class640_Sub1 class640_sub1_531_ = aClass640_Sub1Array7449[i]; null != class640_sub1_531_; class640_sub1_531_ = class640_sub1_531_.aClass640_Sub1_10865) {
					if (class640_sub1 == class640_sub1_531_) {
						if (class640_sub1_530_ != null)
							class640_sub1_530_.aClass640_Sub1_10865 = class640_sub1_531_.aClass640_Sub1_10865;
						else
							aClass640_Sub1Array7449[i] = class640_sub1_531_.aClass640_Sub1_10865;
						return;
					}
					class640_sub1_530_ = class640_sub1_531_;
				}
				class640_sub1_530_ = null;
				for (Class640_Sub1 class640_sub1_532_ = aClass640_Sub1Array7450[i]; null != class640_sub1_532_; class640_sub1_532_ = class640_sub1_532_.aClass640_Sub1_10865) {
					if (class640_sub1 == class640_sub1_532_) {
						if (class640_sub1_530_ != null)
							class640_sub1_530_.aClass640_Sub1_10865 = class640_sub1_532_.aClass640_Sub1_10865;
						else
							aClass640_Sub1Array7450[i] = class640_sub1_532_.aClass640_Sub1_10865;
						return;
					}
					class640_sub1_530_ = class640_sub1_532_;
				}
				class640_sub1_530_ = null;
				for (Class640_Sub1 class640_sub1_533_ = aClass640_Sub1Array7446[i]; class640_sub1_533_ != null; class640_sub1_533_ = class640_sub1_533_.aClass640_Sub1_10865) {
					if (class640_sub1 == class640_sub1_533_) {
						if (null != class640_sub1_530_)
							class640_sub1_530_.aClass640_Sub1_10865 = class640_sub1_533_.aClass640_Sub1_10865;
						else
							aClass640_Sub1Array7446[i] = class640_sub1_533_.aClass640_Sub1_10865;
						return;
					}
					class640_sub1_530_ = class640_sub1_533_;
				}
			}
		}
	}

	void method9355(Class640_Sub1 class640_sub1) {
		if (null != class640_sub1) {
			class640_sub1.method10620();
			for (int i = 0; i < 2; i++) {
				Class640_Sub1 class640_sub1_534_ = null;
				for (Class640_Sub1 class640_sub1_535_ = aClass640_Sub1Array7449[i]; null != class640_sub1_535_; class640_sub1_535_ = class640_sub1_535_.aClass640_Sub1_10865) {
					if (class640_sub1 == class640_sub1_535_) {
						if (class640_sub1_534_ != null)
							class640_sub1_534_.aClass640_Sub1_10865 = class640_sub1_535_.aClass640_Sub1_10865;
						else
							aClass640_Sub1Array7449[i] = class640_sub1_535_.aClass640_Sub1_10865;
						return;
					}
					class640_sub1_534_ = class640_sub1_535_;
				}
				class640_sub1_534_ = null;
				for (Class640_Sub1 class640_sub1_536_ = aClass640_Sub1Array7450[i]; null != class640_sub1_536_; class640_sub1_536_ = class640_sub1_536_.aClass640_Sub1_10865) {
					if (class640_sub1 == class640_sub1_536_) {
						if (class640_sub1_534_ != null)
							class640_sub1_534_.aClass640_Sub1_10865 = class640_sub1_536_.aClass640_Sub1_10865;
						else
							aClass640_Sub1Array7450[i] = class640_sub1_536_.aClass640_Sub1_10865;
						return;
					}
					class640_sub1_534_ = class640_sub1_536_;
				}
				class640_sub1_534_ = null;
				for (Class640_Sub1 class640_sub1_537_ = aClass640_Sub1Array7446[i]; class640_sub1_537_ != null; class640_sub1_537_ = class640_sub1_537_.aClass640_Sub1_10865) {
					if (class640_sub1 == class640_sub1_537_) {
						if (null != class640_sub1_534_)
							class640_sub1_534_.aClass640_Sub1_10865 = class640_sub1_537_.aClass640_Sub1_10865;
						else
							aClass640_Sub1Array7446[i] = class640_sub1_537_.aClass640_Sub1_10865;
						return;
					}
					class640_sub1_534_ = class640_sub1_537_;
				}
			}
		}
	}

	public Class640_Sub1_Sub3 method9356(int i, int i_538_, int i_539_) {
		Class561 class561 = aClass561ArrayArrayArray7426[i][i_538_][i_539_];
		if (null != class561) {
			method9249(class561.aClass640_Sub1_Sub3_7562, -99639426);
			if (null != class561.aClass640_Sub1_Sub3_7562) {
				Class640_Sub1_Sub3 class640_sub1_sub3 = class561.aClass640_Sub1_Sub3_7562;
				class561.aClass640_Sub1_Sub3_7562 = null;
				return class640_sub1_sub3;
			}
		}
		return null;
	}

	public Class640_Sub1_Sub3 method9357(int i, int i_540_, int i_541_) {
		Class561 class561 = aClass561ArrayArrayArray7426[i][i_540_][i_541_];
		if (class561 == null)
			return null;
		return class561.aClass640_Sub1_Sub3_7553;
	}

	public Class640_Sub1_Sub3 method9358(int i, int i_542_, int i_543_) {
		Class561 class561 = aClass561ArrayArrayArray7426[i][i_542_][i_543_];
		if (class561 == null)
			return null;
		return class561.aClass640_Sub1_Sub3_7553;
	}

	public Class640_Sub1_Sub3 method9359(int i, int i_544_, int i_545_) {
		Class561 class561 = aClass561ArrayArrayArray7426[i][i_544_][i_545_];
		if (class561 == null)
			return null;
		return class561.aClass640_Sub1_Sub3_7562;
	}

	public Class640_Sub1_Sub2 method9360(int i, int i_546_, int i_547_, Interface63 interface63) {
		Class561 class561 = aClass561ArrayArrayArray7426[i][i_546_][i_547_];
		if (null == class561)
			return null;
		for (Class562 class562 = class561.aClass562_7558; class562 != null; class562 = class562.aClass562_7565) {
			Class640_Sub1_Sub2 class640_sub1_sub2 = class562.aClass640_Sub1_Sub2_7564;
			if ((interface63 == null || interface63.method410(class640_sub1_sub2, 814785198)) && class640_sub1_sub2.aShort11775 == i_546_ && class640_sub1_sub2.aShort11771 == i_547_) {
				method9274(class640_sub1_sub2, false, -1937245842);
				return class640_sub1_sub2;
			}
		}
		return null;
	}

	public Class640_Sub1_Sub3 method9361(int i, int i_548_, int i_549_) {
		Class561 class561 = aClass561ArrayArrayArray7426[i][i_548_][i_549_];
		if (class561 == null)
			return null;
		return class561.aClass640_Sub1_Sub3_7562;
	}

	public Class640_Sub1_Sub3 method9362(int i, int i_550_, int i_551_) {
		Class561 class561 = aClass561ArrayArrayArray7426[i][i_550_][i_551_];
		if (class561 == null)
			return null;
		return class561.aClass640_Sub1_Sub3_7562;
	}

	public Class640_Sub1_Sub1 method9363(int i, int i_552_, int i_553_) {
		Class561 class561 = aClass561ArrayArrayArray7426[i][i_552_][i_553_];
		if (class561 == null)
			return null;
		return class561.aClass640_Sub1_Sub1_7552;
	}

	public Class640_Sub1_Sub1 method9364(int i, int i_554_, int i_555_) {
		Class561 class561 = aClass561ArrayArrayArray7426[i][i_554_][i_555_];
		if (class561 == null)
			return null;
		return class561.aClass640_Sub1_Sub1_7552;
	}

	public Class640_Sub1_Sub5 method9365(int i, int i_556_, int i_557_) {
		Class561 class561 = aClass561ArrayArrayArray7426[i][i_556_][i_557_];
		if (null == class561)
			return null;
		Class640_Sub1_Sub5 class640_sub1_sub5 = class561.aClass640_Sub1_Sub5_7557;
		class561.aClass640_Sub1_Sub5_7557 = null;
		method9249(class640_sub1_sub5, -99639426);
		return class640_sub1_sub5;
	}

	public Class640_Sub1_Sub3 method9366(int i, int i_558_, int i_559_) {
		Class561 class561 = aClass561ArrayArrayArray7426[i][i_558_][i_559_];
		if (class561 == null)
			return null;
		return class561.aClass640_Sub1_Sub3_7553;
	}

	public Class640_Sub1_Sub5 method9367(int i, int i_560_, int i_561_) {
		Class561 class561 = aClass561ArrayArrayArray7426[i][i_560_][i_561_];
		if (class561 == null)
			return null;
		return class561.aClass640_Sub1_Sub5_7557;
	}

	public Class640_Sub1_Sub3 method9368(int i, int i_562_, int i_563_) {
		Class561 class561 = aClass561ArrayArrayArray7426[i][i_562_][i_563_];
		if (class561 == null)
			return null;
		return class561.aClass640_Sub1_Sub3_7562;
	}

	public Class562 method9369(int i, int i_564_, int i_565_) {
		Class561 class561 = aClass561ArrayArrayArray7426[i][i_564_][i_565_];
		if (class561 == null)
			return null;
		return class561.aClass562_7558;
	}

	public Class562 method9370(int i, int i_566_, int i_567_) {
		Class561 class561 = aClass561ArrayArrayArray7426[i][i_566_][i_567_];
		if (class561 == null)
			return null;
		return class561.aClass562_7558;
	}

	public void method9371(Class174 class174) {
		/* empty */
	}

	public Class640_Sub1_Sub4 method9372(int i, int i_568_, int i_569_) {
		Class561 class561 = aClass561ArrayArrayArray7426[i][i_568_][i_569_];
		if (class561 == null || null == class561.aClass640_Sub1_Sub4_7556)
			return null;
		return class561.aClass640_Sub1_Sub4_7556;
	}

	void method9373(Class640_Sub1 class640_sub1) {
		Class442 class442 = class640_sub1.method10637().aClass442_4927;
		aClass180_7451.method3333((float) (int) class442.aFloat4918, (float) ((int) class442.aFloat4915 + (class640_sub1.method17047(1004008254) >> 1)), (float) (int) class442.aFloat4919, aFloatArray7425);
		class640_sub1.anInt10866 = 1465164519 * (int) aFloatArray7425[2];
	}

	public void method9374(int i) {
		for (int i_570_ = 0; i_570_ < 1273038535 * anInt7445; i_570_++) {
			Class640_Sub1_Sub2 class640_sub1_sub2 = aClass640_Sub1_Sub2Array7433[i_570_];
			method9274(class640_sub1_sub2, true, -2037742271);
			aClass640_Sub1_Sub2Array7433[i_570_] = null;
		}
		anInt7445 = 0;
	}

	void method9375(Class640_Sub1 class640_sub1, int i, int i_571_, int i_572_) {
		if (i_571_ < -547681223 * anInt7443) {
			Class561 class561 = aClass561ArrayArrayArray7426[i][1 + i_571_][i_572_];
			if (class561 != null && class561.aClass640_Sub1_Sub4_7556 != null && class561.aClass640_Sub1_Sub4_7556.method17037(363663481)) {
				int i_573_ = ((aClass161Array7434[i].method2595(i_571_ + 1, i_572_, (byte) 104) + aClass161Array7434[i].method2595(i_571_ + 1 + 1, i_572_, (byte) 98) + aClass161Array7434[i].method2595(i_571_ + 1, i_572_ + 1, (byte) 79) + aClass161Array7434[i].method2595(1 + i_571_ + 1, i_572_ + 1, (byte) 26)) / 4
						- (aClass161Array7434[i].method2595(i_571_, i_572_, (byte) 70) + aClass161Array7434[i].method2595(1 + i_571_, i_572_, (byte) 87) + aClass161Array7434[i].method2595(i_571_, i_572_ + 1, (byte) 42) + aClass161Array7434[i].method2595(1 + i_571_, i_572_ + 1, (byte) 89)) / 4);
				class640_sub1.method17038(aClass180_7451, class561.aClass640_Sub1_Sub4_7556, -1478371119 * anInt7422, i_573_, 0, true, 2056627232);
			}
		}
		if (i_572_ < anInt7443 * -547681223) {
			Class561 class561 = aClass561ArrayArrayArray7426[i][i_571_][1 + i_572_];
			if (null != class561 && null != class561.aClass640_Sub1_Sub4_7556 && class561.aClass640_Sub1_Sub4_7556.method17037(-1206940430)) {
				int i_574_ = ((aClass161Array7434[i].method2595(i_571_, i_572_, (byte) 48) + aClass161Array7434[i].method2595(1 + i_571_, i_572_ + 1, (byte) 120) + aClass161Array7434[i].method2595(i_571_, 1 + (i_572_ + 1), (byte) 79) + aClass161Array7434[i].method2595(i_571_ + 1, 1 + i_572_ + 1, (byte) 14)) / 4
						- (aClass161Array7434[i].method2595(i_571_, i_572_, (byte) 24) + aClass161Array7434[i].method2595(i_571_ + 1, i_572_, (byte) 53) + aClass161Array7434[i].method2595(i_571_, i_572_ + 1, (byte) 80) + aClass161Array7434[i].method2595(i_571_ + 1, i_572_ + 1, (byte) 104)) / 4);
				class640_sub1.method17038(aClass180_7451, class561.aClass640_Sub1_Sub4_7556, 0, i_574_, anInt7422 * -1478371119, true, 2056627232);
			}
		}
		if (i_571_ < -547681223 * anInt7443 && i_572_ < -1437024153 * anInt7432) {
			Class561 class561 = aClass561ArrayArrayArray7426[i][1 + i_571_][1 + i_572_];
			if (null != class561 && null != class561.aClass640_Sub1_Sub4_7556 && class561.aClass640_Sub1_Sub4_7556.method17037(-454399004)) {
				int i_575_ = ((aClass161Array7434[i].method2595(1 + i_571_, i_572_ + 1, (byte) 28) + aClass161Array7434[i].method2595(i_571_ + 1 + 1, i_572_ + 1, (byte) 5) + aClass161Array7434[i].method2595(1 + i_571_, 1 + i_572_ + 1, (byte) 6) + aClass161Array7434[i].method2595(1 + (1 + i_571_), 1 + (1 + i_572_), (byte) 60)) / 4
						- (aClass161Array7434[i].method2595(i_571_, i_572_, (byte) 116) + aClass161Array7434[i].method2595(i_571_ + 1, i_572_, (byte) 22) + aClass161Array7434[i].method2595(i_571_, i_572_ + 1, (byte) 124) + aClass161Array7434[i].method2595(1 + i_571_, i_572_ + 1, (byte) 121)) / 4);
				class640_sub1.method17038(aClass180_7451, class561.aClass640_Sub1_Sub4_7556, -1478371119 * anInt7422, i_575_, -1478371119 * anInt7422, true, 2056627232);
			}
		}
		if (i_571_ < -547681223 * anInt7443 && i_572_ > 0) {
			Class561 class561 = aClass561ArrayArrayArray7426[i][i_571_ + 1][i_572_ - 1];
			if (class561 != null && null != class561.aClass640_Sub1_Sub4_7556 && class561.aClass640_Sub1_Sub4_7556.method17037(-1485300877)) {
				int i_576_ = ((aClass161Array7434[i].method2595(1 + i_571_, i_572_ - 1, (byte) 86) + aClass161Array7434[i].method2595(1 + (i_571_ + 1), i_572_ - 1, (byte) 68) + aClass161Array7434[i].method2595(1 + i_571_, i_572_ + 1 - 1, (byte) 69) + aClass161Array7434[i].method2595(1 + (i_571_ + 1), 1 + i_572_ - 1, (byte) 34)) / 4
						- (aClass161Array7434[i].method2595(i_571_, i_572_, (byte) 64) + aClass161Array7434[i].method2595(i_571_ + 1, i_572_, (byte) 56) + aClass161Array7434[i].method2595(i_571_, 1 + i_572_, (byte) 63) + aClass161Array7434[i].method2595(1 + i_571_, i_572_ + 1, (byte) 5)) / 4);
				class640_sub1.method17038(aClass180_7451, class561.aClass640_Sub1_Sub4_7556, anInt7422 * -1478371119, i_576_, -(-1478371119 * anInt7422), true, 2056627232);
			}
		}
	}

	void method9376(Class640_Sub1 class640_sub1, int i, int i_577_, int i_578_, int i_579_, int i_580_) {
		boolean bool = true;
		int i_581_ = i_577_;
		int i_582_ = i_579_ + i_577_;
		int i_583_ = i_578_ - 1;
		int i_584_ = i_578_ + i_580_;
		for (int i_585_ = i; i_585_ <= i + 1; i_585_++) {
			if (anInt7466 * -1609909485 != i_585_) {
				for (int i_586_ = i_581_; i_586_ <= i_582_; i_586_++) {
					if (i_586_ >= 0 && i_586_ < -547681223 * anInt7443) {
						for (int i_587_ = i_583_; i_587_ <= i_584_; i_587_++) {
							if (i_587_ >= 0 && i_587_ < anInt7432 * -1437024153 && (!bool || i_586_ >= i_582_ || i_587_ >= i_584_ || i_587_ < i_578_ && i_577_ != i_586_)) {
								Class561 class561 = (aClass561ArrayArrayArray7426[i_585_][i_586_][i_587_]);
								if (class561 != null) {
									int i_588_ = (((aClass161Array7434[i_585_].method2595(i_586_, i_587_, (byte) 16)) + (aClass161Array7434[i_585_].method2595(i_586_ + 1, i_587_, (byte) 35)) + (aClass161Array7434[i_585_].method2595(i_586_, 1 + i_587_, (byte) 89)) + (aClass161Array7434[i_585_].method2595(1 + i_586_, 1 + i_587_, (byte) 116))) / 4
											- ((aClass161Array7434[i].method2595(i_577_, i_578_, (byte) 121)) + (aClass161Array7434[i].method2595(1 + i_577_, i_578_, (byte) 11)) + (aClass161Array7434[i].method2595(i_577_, i_578_ + 1, (byte) 24)) + (aClass161Array7434[i].method2595(1 + i_577_, 1 + i_578_, (byte) 85))) / 4);
									Class640_Sub1_Sub3 class640_sub1_sub3 = class561.aClass640_Sub1_Sub3_7553;
									Class640_Sub1_Sub3 class640_sub1_sub3_589_ = class561.aClass640_Sub1_Sub3_7562;
									if (null != class640_sub1_sub3 && class640_sub1_sub3.method17037(525661061))
										class640_sub1.method17038(aClass180_7451, class640_sub1_sub3, ((-1478371119 * anInt7422 * (i_586_ - i_577_)) + ((1 - i_579_) * (anInt7471 * -1485744437))), i_588_, ((anInt7471 * -1485744437 * (1 - i_580_)) + (anInt7422 * -1478371119 * (i_587_ - i_578_))), bool, 2056627232);
									if (null != class640_sub1_sub3_589_ && class640_sub1_sub3_589_.method17037(-1351543559))
										class640_sub1.method17038(aClass180_7451, class640_sub1_sub3_589_, (((i_586_ - i_577_) * (anInt7422 * -1478371119)) + ((1 - i_579_) * (anInt7471 * -1485744437))), i_588_, ((i_587_ - i_578_) * (-1478371119 * anInt7422) + (1 - i_580_) * (-1485744437 * anInt7471)), bool, 2056627232);
									for (Class562 class562 = class561.aClass562_7558; null != class562; class562 = class562.aClass562_7565) {
										Class640_Sub1_Sub2 class640_sub1_sub2 = (class562.aClass640_Sub1_Sub2_7564);
										if (class640_sub1_sub2 != null && class640_sub1_sub2.method17037(-121572151) && ((class640_sub1_sub2.aShort11775 == i_586_) || i_586_ == i_581_) && (i_587_ == (class640_sub1_sub2.aShort11771) || i_587_ == i_583_)) {
											int i_590_ = 1 + ((class640_sub1_sub2.aShort11770) - (class640_sub1_sub2.aShort11775));
											int i_591_ = 1 + ((class640_sub1_sub2.aShort11772) - (class640_sub1_sub2.aShort11771));
											class640_sub1.method17038(aClass180_7451, class640_sub1_sub2, (((i_590_ - i_579_) * (-1485744437 * anInt7471)) + (((class640_sub1_sub2.aShort11775) - i_577_) * (-1478371119 * anInt7422))), i_588_, ((((class640_sub1_sub2.aShort11771) - i_578_) * (anInt7422 * -1478371119)) + (anInt7471 * -1485744437 * (i_591_ - i_580_))), bool, 2056627232);
										}
									}
								}
							}
						}
					}
				}
				i_581_--;
				bool = false;
			}
		}
	}

	public Class640_Sub1_Sub3 method9377(int i, int i_592_, int i_593_, int i_594_) {
		Class561 class561 = aClass561ArrayArrayArray7426[i][i_592_][i_593_];
		if (class561 == null)
			return null;
		return class561.aClass640_Sub1_Sub3_7553;
	}

	void method9378(boolean bool, byte[][][] is, int i, byte i_595_, int i_596_) {
		int i_597_ = bool ? 1 : 0;
		anInt7452 = 0;
		anInt7453 = 0;
		anInt7429 += -92122773;
		if ((i_596_ & 0x2) == 0) {
			for (Class640_Sub1 class640_sub1 = aClass640_Sub1Array7449[i_597_]; class640_sub1 != null; class640_sub1 = class640_sub1.aClass640_Sub1_10865) {
				method9262(class640_sub1, (byte) -16);
				if (1971671255 * class640_sub1.anInt10866 != -1 && !method9389(class640_sub1, bool, is, i, i_595_))
					aClass640_Sub1Array7483[(anInt7452 += -1341323837) * 831263467 - 1] = class640_sub1;
			}
		}
		if ((i_596_ & 0x1) == 0) {
			for (Class640_Sub1 class640_sub1 = aClass640_Sub1Array7450[i_597_]; class640_sub1 != null; class640_sub1 = class640_sub1.aClass640_Sub1_10865) {
				method9262(class640_sub1, (byte) -8);
				if (-1 != 1971671255 * class640_sub1.anInt10866 && !method9389(class640_sub1, bool, is, i, i_595_))
					aClass640_Sub1Array7454[(anInt7453 += 425340347) * -1900638349 - 1] = class640_sub1;
			}
			for (Class640_Sub1 class640_sub1 = aClass640_Sub1Array7446[i_597_]; class640_sub1 != null; class640_sub1 = class640_sub1.aClass640_Sub1_10865) {
				method9262(class640_sub1, (byte) -97);
				if (-1 != 1971671255 * class640_sub1.anInt10866 && !method9389(class640_sub1, bool, is, i, i_595_)) {
					if (class640_sub1.method17072(234823195))
						aClass640_Sub1Array7454[(anInt7453 += 425340347) * -1900638349 - 1] = class640_sub1;
					else
						aClass640_Sub1Array7483[(anInt7452 += -1341323837) * 831263467 - 1] = class640_sub1;
				}
			}
			if (!bool) {
				for (int i_598_ = 0; i_598_ < 1273038535 * anInt7445; i_598_++) {
					method9262(aClass640_Sub1_Sub2Array7433[i_598_], (byte) -16);
					if (1971671255 * (aClass640_Sub1_Sub2Array7433[i_598_].anInt10866) != -1 && !method9389(aClass640_Sub1_Sub2Array7433[i_598_], bool, is, i, i_595_)) {
						if (aClass640_Sub1_Sub2Array7433[i_598_].method17072(1213148788))
							aClass640_Sub1Array7454[(anInt7453 += 425340347) * -1900638349 - 1] = aClass640_Sub1_Sub2Array7433[i_598_];
						else
							aClass640_Sub1Array7483[(anInt7452 += -1341323837) * 831263467 - 1] = aClass640_Sub1_Sub2Array7433[i_598_];
					}
				}
			}
		}
		if (anInt7452 * 831263467 > 0) {
			method9264(aClass640_Sub1Array7483, 0, 831263467 * anInt7452 - 1);
			for (int i_599_ = 0; i_599_ < 831263467 * anInt7452; i_599_++)
				method9266(aClass640_Sub1Array7483[i_599_], aClass527_Sub16Array7444);
		}
		if (aBool7455)
			aClass180_7451.method3158(0, null);
		if (0 == (i_596_ & 0x2)) {
			for (int i_600_ = 0; i_600_ < anInt7466 * -1609909485; i_600_++) {
				if (i_600_ >= i && is != null) {
					int i_601_ = aBoolArrayArray7467.length;
					if (1068144453 * anInt7477 + aBoolArrayArray7467.length > -547681223 * anInt7443)
						i_601_ -= (1068144453 * anInt7477 + aBoolArrayArray7467.length - -547681223 * anInt7443);
					int i_602_ = aBoolArrayArray7467[0].length;
					if (anInt7468 * -1268111611 + aBoolArrayArray7467[0].length > -1437024153 * anInt7432)
						i_602_ -= (anInt7468 * -1268111611 + aBoolArrayArray7467[0].length - -1437024153 * anInt7432);
					boolean[][] bools = aBoolArrayArray7481;
					if (aBool7470) {
						for (int i_603_ = -362087053 * anInt7464; i_603_ < i_601_; i_603_++) {
							int i_604_ = (1068144453 * anInt7477 + i_603_ - anInt7464 * -362087053);
							for (int i_605_ = anInt7465 * -473616249; i_605_ < i_602_; i_605_++) {
								bools[i_603_][i_605_] = false;
								if (aBoolArrayArray7467[i_603_][i_605_]) {
									int i_606_ = (i_605_ + anInt7468 * -1268111611 - -473616249 * anInt7465);
									for (int i_607_ = i_600_; i_607_ >= 0; i_607_--) {
										if ((null != (aClass561ArrayArrayArray7426[i_607_][i_604_][i_606_])) && (i_600_ == (aClass561ArrayArrayArray7426[i_607_][i_604_][i_606_].aByte7555))) {
											if ((i_607_ >= i && (is[i_607_][i_604_][i_606_] == i_595_)) || (aClass566_7430.method9549(i_600_, i_604_, i_606_)))
												bools[i_603_][i_605_] = false;
											else
												bools[i_603_][i_605_] = true;
											break;
										}
									}
								}
							}
						}
					}
					aClass161Array7434[i_600_].method2591(1968897173 * anInt7431, anInt7458 * 64349821, anInt7463 * 1329492325, aBoolArrayArray7481, false, i_596_);
				} else {
					int i_608_ = aBoolArrayArray7467.length;
					if (1068144453 * anInt7477 + aBoolArrayArray7467.length > -547681223 * anInt7443)
						i_608_ -= (1068144453 * anInt7477 + aBoolArrayArray7467.length - -547681223 * anInt7443);
					int i_609_ = aBoolArrayArray7467[0].length;
					if (aBoolArrayArray7467[0].length + -1268111611 * anInt7468 > anInt7432 * -1437024153)
						i_609_ -= (aBoolArrayArray7467[0].length + anInt7468 * -1268111611 - anInt7432 * -1437024153);
					boolean[][] bools = aBoolArrayArray7481;
					if (aBool7470) {
						for (int i_610_ = anInt7464 * -362087053; i_610_ < i_608_; i_610_++) {
							int i_611_ = (1068144453 * anInt7477 + i_610_ - -362087053 * anInt7464);
							for (int i_612_ = anInt7465 * -473616249; i_612_ < i_609_; i_612_++) {
								if (aBoolArrayArray7467[i_610_][i_612_] && !(aClass566_7430.method9549(i_600_, i_611_, (-1268111611 * anInt7468 + i_612_ - anInt7465 * -473616249))))
									bools[i_610_][i_612_] = true;
								else
									bools[i_610_][i_612_] = false;
							}
						}
					}
					aClass161Array7434[i_600_].method2591(1968897173 * anInt7431, 64349821 * anInt7458, anInt7463 * 1329492325, aBoolArrayArray7481, true, i_596_);
				}
			}
		}
		if (-1900638349 * anInt7453 > 0) {
			method9351(aClass640_Sub1Array7454, 0, -1900638349 * anInt7453 - 1);
			for (int i_613_ = 0; i_613_ < -1900638349 * anInt7453; i_613_++)
				method9266(aClass640_Sub1Array7454[i_613_], aClass527_Sub16Array7444);
		}
	}

	void method9379(boolean bool, byte[][][] is, int i, byte i_614_, int i_615_) {
		int i_616_ = bool ? 1 : 0;
		anInt7452 = 0;
		anInt7453 = 0;
		anInt7429 += -92122773;
		if ((i_615_ & 0x2) == 0) {
			for (Class640_Sub1 class640_sub1 = aClass640_Sub1Array7449[i_616_]; class640_sub1 != null; class640_sub1 = class640_sub1.aClass640_Sub1_10865) {
				method9262(class640_sub1, (byte) -98);
				if (1971671255 * class640_sub1.anInt10866 != -1 && !method9389(class640_sub1, bool, is, i, i_614_))
					aClass640_Sub1Array7483[(anInt7452 += -1341323837) * 831263467 - 1] = class640_sub1;
			}
		}
		if ((i_615_ & 0x1) == 0) {
			for (Class640_Sub1 class640_sub1 = aClass640_Sub1Array7450[i_616_]; class640_sub1 != null; class640_sub1 = class640_sub1.aClass640_Sub1_10865) {
				method9262(class640_sub1, (byte) -98);
				if (-1 != 1971671255 * class640_sub1.anInt10866 && !method9389(class640_sub1, bool, is, i, i_614_))
					aClass640_Sub1Array7454[(anInt7453 += 425340347) * -1900638349 - 1] = class640_sub1;
			}
			for (Class640_Sub1 class640_sub1 = aClass640_Sub1Array7446[i_616_]; class640_sub1 != null; class640_sub1 = class640_sub1.aClass640_Sub1_10865) {
				method9262(class640_sub1, (byte) -30);
				if (-1 != 1971671255 * class640_sub1.anInt10866 && !method9389(class640_sub1, bool, is, i, i_614_)) {
					if (class640_sub1.method17072(196834007))
						aClass640_Sub1Array7454[(anInt7453 += 425340347) * -1900638349 - 1] = class640_sub1;
					else
						aClass640_Sub1Array7483[(anInt7452 += -1341323837) * 831263467 - 1] = class640_sub1;
				}
			}
			if (!bool) {
				for (int i_617_ = 0; i_617_ < 1273038535 * anInt7445; i_617_++) {
					method9262(aClass640_Sub1_Sub2Array7433[i_617_], (byte) -52);
					if (1971671255 * (aClass640_Sub1_Sub2Array7433[i_617_].anInt10866) != -1 && !method9389(aClass640_Sub1_Sub2Array7433[i_617_], bool, is, i, i_614_)) {
						if (aClass640_Sub1_Sub2Array7433[i_617_].method17072(392585968))
							aClass640_Sub1Array7454[(anInt7453 += 425340347) * -1900638349 - 1] = aClass640_Sub1_Sub2Array7433[i_617_];
						else
							aClass640_Sub1Array7483[(anInt7452 += -1341323837) * 831263467 - 1] = aClass640_Sub1_Sub2Array7433[i_617_];
					}
				}
			}
		}
		if (anInt7452 * 831263467 > 0) {
			method9264(aClass640_Sub1Array7483, 0, 831263467 * anInt7452 - 1);
			for (int i_618_ = 0; i_618_ < 831263467 * anInt7452; i_618_++)
				method9266(aClass640_Sub1Array7483[i_618_], aClass527_Sub16Array7444);
		}
		if (aBool7455)
			aClass180_7451.method3158(0, null);
		if (0 == (i_615_ & 0x2)) {
			for (int i_619_ = 0; i_619_ < anInt7466 * -1609909485; i_619_++) {
				if (i_619_ >= i && is != null) {
					int i_620_ = aBoolArrayArray7467.length;
					if (1068144453 * anInt7477 + aBoolArrayArray7467.length > -547681223 * anInt7443)
						i_620_ -= (1068144453 * anInt7477 + aBoolArrayArray7467.length - -547681223 * anInt7443);
					int i_621_ = aBoolArrayArray7467[0].length;
					if (anInt7468 * -1268111611 + aBoolArrayArray7467[0].length > -1437024153 * anInt7432)
						i_621_ -= (anInt7468 * -1268111611 + aBoolArrayArray7467[0].length - -1437024153 * anInt7432);
					boolean[][] bools = aBoolArrayArray7481;
					if (aBool7470) {
						for (int i_622_ = -362087053 * anInt7464; i_622_ < i_620_; i_622_++) {
							int i_623_ = (1068144453 * anInt7477 + i_622_ - anInt7464 * -362087053);
							for (int i_624_ = anInt7465 * -473616249; i_624_ < i_621_; i_624_++) {
								bools[i_622_][i_624_] = false;
								if (aBoolArrayArray7467[i_622_][i_624_]) {
									int i_625_ = (i_624_ + anInt7468 * -1268111611 - -473616249 * anInt7465);
									for (int i_626_ = i_619_; i_626_ >= 0; i_626_--) {
										if ((null != (aClass561ArrayArrayArray7426[i_626_][i_623_][i_625_])) && (i_619_ == (aClass561ArrayArrayArray7426[i_626_][i_623_][i_625_].aByte7555))) {
											if ((i_626_ >= i && (is[i_626_][i_623_][i_625_] == i_614_)) || (aClass566_7430.method9549(i_619_, i_623_, i_625_)))
												bools[i_622_][i_624_] = false;
											else
												bools[i_622_][i_624_] = true;
											break;
										}
									}
								}
							}
						}
					}
					aClass161Array7434[i_619_].method2591(1968897173 * anInt7431, anInt7458 * 64349821, anInt7463 * 1329492325, aBoolArrayArray7481, false, i_615_);
				} else {
					int i_627_ = aBoolArrayArray7467.length;
					if (1068144453 * anInt7477 + aBoolArrayArray7467.length > -547681223 * anInt7443)
						i_627_ -= (1068144453 * anInt7477 + aBoolArrayArray7467.length - -547681223 * anInt7443);
					int i_628_ = aBoolArrayArray7467[0].length;
					if (aBoolArrayArray7467[0].length + -1268111611 * anInt7468 > anInt7432 * -1437024153)
						i_628_ -= (aBoolArrayArray7467[0].length + anInt7468 * -1268111611 - anInt7432 * -1437024153);
					boolean[][] bools = aBoolArrayArray7481;
					if (aBool7470) {
						for (int i_629_ = anInt7464 * -362087053; i_629_ < i_627_; i_629_++) {
							int i_630_ = (1068144453 * anInt7477 + i_629_ - -362087053 * anInt7464);
							for (int i_631_ = anInt7465 * -473616249; i_631_ < i_628_; i_631_++) {
								if (aBoolArrayArray7467[i_629_][i_631_] && !(aClass566_7430.method9549(i_619_, i_630_, (-1268111611 * anInt7468 + i_631_ - anInt7465 * -473616249))))
									bools[i_629_][i_631_] = true;
								else
									bools[i_629_][i_631_] = false;
							}
						}
					}
					aClass161Array7434[i_619_].method2591(1968897173 * anInt7431, 64349821 * anInt7458, anInt7463 * 1329492325, aBoolArrayArray7481, true, i_615_);
				}
			}
		}
		if (-1900638349 * anInt7453 > 0) {
			method9351(aClass640_Sub1Array7454, 0, -1900638349 * anInt7453 - 1);
			for (int i_632_ = 0; i_632_ < -1900638349 * anInt7453; i_632_++)
				method9266(aClass640_Sub1Array7454[i_632_], aClass527_Sub16Array7444);
		}
	}

	public void method9380(Class527_Sub8_Sub8 class527_sub8_sub8, int i, int i_633_, int i_634_, boolean[] bools) {
		if (aClass161Array7435 != aClass161Array7434) {
			int i_635_ = aClass161Array7457[i].method2593(i_633_, i_634_, -1151432033);
			for (int i_636_ = 0; i_636_ <= i; i_636_++) {
				if (bools == null || bools[i_636_]) {
					Class161 class161 = aClass161Array7457[i_636_];
					if (class161 != null)
						class161.method2631(class527_sub8_sub8, i_633_, i_635_ - class161.method2593(i_633_, i_634_, -1151432033), i_634_, 0, false);
				}
			}
		}
	}

	public Class562 method9381(int i, int i_637_, int i_638_, int i_639_) {
		Class561 class561 = aClass561ArrayArrayArray7426[i][i_637_][i_638_];
		if (class561 == null)
			return null;
		return class561.aClass562_7558;
	}

	void method9382(Class640_Sub1 class640_sub1) {
		Class442 class442 = class640_sub1.method10637().aClass442_4927;
		aClass180_7451.method3333((float) (int) class442.aFloat4918, (float) ((int) class442.aFloat4915 + (class640_sub1.method17047(1004008254) >> 1)), (float) (int) class442.aFloat4919, aFloatArray7425);
		class640_sub1.anInt10866 = 1465164519 * (int) aFloatArray7425[2];
	}

	void method9383(Class640_Sub1 class640_sub1) {
		Class442 class442 = class640_sub1.method10637().aClass442_4927;
		aClass180_7451.method3333((float) (int) class442.aFloat4918, (float) ((int) class442.aFloat4915 + (class640_sub1.method17047(1004008254) >> 1)), (float) (int) class442.aFloat4919, aFloatArray7425);
		class640_sub1.anInt10866 = 1465164519 * (int) aFloatArray7425[2];
	}

	void method9384(Class640_Sub1[] class640_sub1s, int i, int i_640_) {
		if (i < i_640_) {
			int i_641_ = (i_640_ + i) / 2;
			int i_642_ = i;
			Class640_Sub1 class640_sub1 = class640_sub1s[i_641_];
			class640_sub1s[i_641_] = class640_sub1s[i_640_];
			class640_sub1s[i_640_] = class640_sub1;
			int i_643_ = class640_sub1.anInt10866 * 1971671255;
			for (int i_644_ = i; i_644_ < i_640_; i_644_++) {
				if (class640_sub1s[i_644_].anInt10866 * 1971671255 > (i_644_ & 0x1) + i_643_) {
					Class640_Sub1 class640_sub1_645_ = class640_sub1s[i_644_];
					class640_sub1s[i_644_] = class640_sub1s[i_642_];
					class640_sub1s[i_642_++] = class640_sub1_645_;
				}
			}
			class640_sub1s[i_640_] = class640_sub1s[i_642_];
			class640_sub1s[i_642_] = class640_sub1;
			method9351(class640_sub1s, i, i_642_ - 1);
			method9351(class640_sub1s, i_642_ + 1, i_640_);
		}
	}

	void method9385(Class640_Sub1 class640_sub1, Class527_Sub16[] class527_sub16s) {
		if (aBool7455) {
			int i = class640_sub1.method17043(class527_sub16s, 2109691341);
			aClass180_7451.method3158(i, class527_sub16s);
		}
		if (aClass161Array7434 == aClass161Array7435) {
			boolean bool = false;
			boolean bool_646_ = false;
			Class442 class442 = class640_sub1.method10637().aClass442_4927;
			int i;
			int i_647_;
			if (class640_sub1 instanceof Class640_Sub1_Sub2) {
				i = ((Class640_Sub1_Sub2) class640_sub1).aShort11775;
				i_647_ = ((Class640_Sub1_Sub2) class640_sub1).aShort11771;
			} else {
				i = (int) class442.aFloat4918 >> anInt7421 * 1742303003;
				i_647_ = (int) class442.aFloat4919 >> anInt7421 * 1742303003;
			}
			i = Math.min(-547681223 * anInt7443 - 1, Math.max(0, i));
			i_647_ = Math.min(-1437024153 * anInt7432 - 1, Math.max(0, i_647_));
			Class178 class178 = new Class178();
			class178.anInt2055 = method9263(i, i_647_, -1487341183) * -2125644365;
			class178.anInt2050 = method9227(i, i_647_, (short) 29604) * 1806816041;
			class178.anInt2051 = method9229(i, i_647_, 2029048193) * 433693819;
			class178.anInt2053 = method9247(i, i_647_, -1051352504) * -1803459975;
			class178.anInt2054 = method9273(i, i_647_, (byte) 1) * 420597091;
			class178.anInt2049 = method9232(i, i_647_, 598870759) * -834736135;
			aClass180_7451.method3144(aClass161Array7457[0].method2593((int) class442.aFloat4918, (int) class442.aFloat4919, -1151432033), class178);
		}
		Class558 class558 = class640_sub1.method17040(aClass180_7451, (byte) -4);
		if (class558 != null) {
			if (class558.aBool7530) {
				class558.aClass640_Sub1_7532 = class640_sub1;
				aClass546_7480.method9053(class558, -456126961);
			} else
				Class389.method6463(class558, -786844949);
		}
	}

	void method9386(Class640_Sub1[] class640_sub1s, int i, int i_648_) {
		if (i < i_648_) {
			int i_649_ = (i + i_648_) / 2;
			int i_650_ = i;
			Class640_Sub1 class640_sub1 = class640_sub1s[i_649_];
			class640_sub1s[i_649_] = class640_sub1s[i_648_];
			class640_sub1s[i_648_] = class640_sub1;
			int i_651_ = class640_sub1.anInt10866 * 1971671255;
			for (int i_652_ = i; i_652_ < i_648_; i_652_++) {
				if (class640_sub1s[i_652_].anInt10866 * 1971671255 < i_651_ + (i_652_ & 0x1)) {
					Class640_Sub1 class640_sub1_653_ = class640_sub1s[i_652_];
					class640_sub1s[i_652_] = class640_sub1s[i_650_];
					class640_sub1s[i_650_++] = class640_sub1_653_;
				}
			}
			class640_sub1s[i_648_] = class640_sub1s[i_650_];
			class640_sub1s[i_650_] = class640_sub1;
			method9264(class640_sub1s, i, i_650_ - 1);
			method9264(class640_sub1s, 1 + i_650_, i_648_);
		}
	}

	boolean method9387(Class640_Sub1 class640_sub1, boolean bool, byte[][][] is, int i, byte i_654_) {
		if (!aBool7470)
			return false;
		if (class640_sub1 instanceof Class640_Sub1_Sub2) {
			int i_655_ = ((Class640_Sub1_Sub2) class640_sub1).aShort11770;
			int i_656_ = ((Class640_Sub1_Sub2) class640_sub1).aShort11772;
			int i_657_ = ((Class640_Sub1_Sub2) class640_sub1).aShort11775;
			int i_658_ = ((Class640_Sub1_Sub2) class640_sub1).aShort11771;
			for (int i_659_ = i_657_; i_659_ <= i_655_; i_659_++) {
				for (int i_660_ = i_658_; i_660_ <= i_656_; i_660_++) {
					if (class640_sub1.aByte10862 < anInt7466 * -1609909485 && i_659_ >= 1068144453 * anInt7477 && i_659_ < 1084115087 * anInt7427 && i_660_ >= anInt7468 * -1268111611 && i_660_ < 1364363749 * anInt7469) {
						if ((null != is && class640_sub1.aByte10864 >= i && i_654_ == (is[class640_sub1.aByte10864][i_659_][i_660_])) || !class640_sub1.method17077((byte) -40) || class640_sub1.method17044(aClass180_7451, -1527455135)) {
							if (!bool && i_659_ >= anInt7431 * 1968897173 - 16 && i_659_ <= anInt7431 * 1968897173 + 16 && i_660_ >= 64349821 * anInt7458 - 16 && i_660_ <= 64349821 * anInt7458 + 16)
								class640_sub1.method17081(aClass180_7451, 1614169449);
							return true;
						}
						return false;
					}
				}
			}
			return true;
		}
		Class442 class442 = class640_sub1.method10637().aClass442_4927;
		int i_661_ = (int) class442.aFloat4918 >> 1742303003 * anInt7421;
		int i_662_ = (int) class442.aFloat4919 >> anInt7421 * 1742303003;
		if (class640_sub1.aByte10862 < anInt7466 * -1609909485 && i_661_ >= anInt7477 * 1068144453 && i_661_ < anInt7427 * 1084115087 && i_662_ >= anInt7468 * -1268111611 && i_662_ < 1364363749 * anInt7469) {
			if ((is != null && class640_sub1.aByte10864 >= i && i_654_ == is[class640_sub1.aByte10864][i_661_][i_662_]) || !class640_sub1.method17077((byte) -101) || class640_sub1.method17044(aClass180_7451, -1732388656)) {
				if (!bool && i_661_ >= 1968897173 * anInt7431 - 16 && i_661_ <= 16 + 1968897173 * anInt7431 && i_662_ >= anInt7458 * 64349821 - 16 && i_662_ <= anInt7458 * 64349821 + 16)
					class640_sub1.method17081(aClass180_7451, 1567074892);
				return true;
			}
			return false;
		}
		return true;
	}

	void method9388(Class640_Sub1 class640_sub1) {
		Class442 class442 = class640_sub1.method10637().aClass442_4927;
		aClass180_7451.method3333((float) (int) class442.aFloat4918, (float) ((int) class442.aFloat4915 + (class640_sub1.method17047(1004008254) >> 1)), (float) (int) class442.aFloat4919, aFloatArray7425);
		class640_sub1.anInt10866 = 1465164519 * (int) aFloatArray7425[2];
	}

	boolean method9389(Class640_Sub1 class640_sub1, boolean bool, byte[][][] is, int i, byte i_663_) {
		if (!aBool7470)
			return false;
		if (class640_sub1 instanceof Class640_Sub1_Sub2) {
			int i_664_ = ((Class640_Sub1_Sub2) class640_sub1).aShort11770;
			int i_665_ = ((Class640_Sub1_Sub2) class640_sub1).aShort11772;
			int i_666_ = ((Class640_Sub1_Sub2) class640_sub1).aShort11775;
			int i_667_ = ((Class640_Sub1_Sub2) class640_sub1).aShort11771;
			for (int i_668_ = i_666_; i_668_ <= i_664_; i_668_++) {
				for (int i_669_ = i_667_; i_669_ <= i_665_; i_669_++) {
					if (class640_sub1.aByte10862 < anInt7466 * -1609909485 && i_668_ >= 1068144453 * anInt7477 && i_668_ < 1084115087 * anInt7427 && i_669_ >= anInt7468 * -1268111611 && i_669_ < 1364363749 * anInt7469) {
						if ((null != is && class640_sub1.aByte10864 >= i && i_663_ == (is[class640_sub1.aByte10864][i_668_][i_669_])) || !class640_sub1.method17077((byte) -104) || class640_sub1.method17044(aClass180_7451, -1152625506)) {
							if (!bool && i_668_ >= anInt7431 * 1968897173 - 16 && i_668_ <= anInt7431 * 1968897173 + 16 && i_669_ >= 64349821 * anInt7458 - 16 && i_669_ <= 64349821 * anInt7458 + 16)
								class640_sub1.method17081(aClass180_7451, 1767121073);
							return true;
						}
						return false;
					}
				}
			}
			return true;
		}
		Class442 class442 = class640_sub1.method10637().aClass442_4927;
		int i_670_ = (int) class442.aFloat4918 >> 1742303003 * anInt7421;
		int i_671_ = (int) class442.aFloat4919 >> anInt7421 * 1742303003;
		if (class640_sub1.aByte10862 < anInt7466 * -1609909485 && i_670_ >= anInt7477 * 1068144453 && i_670_ < anInt7427 * 1084115087 && i_671_ >= anInt7468 * -1268111611 && i_671_ < 1364363749 * anInt7469) {
			if ((is != null && class640_sub1.aByte10864 >= i && i_663_ == is[class640_sub1.aByte10864][i_670_][i_671_]) || !class640_sub1.method17077((byte) -124) || class640_sub1.method17044(aClass180_7451, 723570722)) {
				if (!bool && i_670_ >= 1968897173 * anInt7431 - 16 && i_670_ <= 16 + 1968897173 * anInt7431 && i_671_ >= anInt7458 * 64349821 - 16 && i_671_ <= anInt7458 * 64349821 + 16)
					class640_sub1.method17081(aClass180_7451, 1898627650);
				return true;
			}
			return false;
		}
		return true;
	}

	public boolean method9390(Class527_Sub8_Sub8 class527_sub8_sub8, int i, int i_672_, int i_673_, boolean[] bools) {
		boolean bool = false;
		if (aClass161Array7434 != aClass161Array7435) {
			int i_674_ = aClass161Array7457[i].method2593(i_672_, i_673_, -1151432033);
			int i_675_ = 0;
			for (/**/; i_675_ <= i; i_675_++) {
				Class161 class161 = aClass161Array7457[i_675_];
				if (class161 != null) {
					int i_676_ = i_674_ - class161.method2593(i_672_, i_673_, -1151432033);
					if (null != bools) {
						bools[i_675_] = class161.method2598(class527_sub8_sub8, i_672_, i_676_, i_673_, 0, false);
						if (!bools[i_675_])
							continue;
					}
					class161.method2633(class527_sub8_sub8, i_672_, i_676_, i_673_, 0, false);
					bool = true;
				}
			}
		}
		return bool;
	}

	public boolean method9391(Class527_Sub8_Sub8 class527_sub8_sub8, int i, int i_677_, int i_678_, boolean[] bools) {
		boolean bool = false;
		if (aClass161Array7434 != aClass161Array7435) {
			int i_679_ = aClass161Array7457[i].method2593(i_677_, i_678_, -1151432033);
			int i_680_ = 0;
			for (/**/; i_680_ <= i; i_680_++) {
				Class161 class161 = aClass161Array7457[i_680_];
				if (class161 != null) {
					int i_681_ = i_679_ - class161.method2593(i_677_, i_678_, -1151432033);
					if (null != bools) {
						bools[i_680_] = class161.method2598(class527_sub8_sub8, i_677_, i_681_, i_678_, 0, false);
						if (!bools[i_680_])
							continue;
					}
					class161.method2633(class527_sub8_sub8, i_677_, i_681_, i_678_, 0, false);
					bool = true;
				}
			}
		}
		return bool;
	}

	void method9392(int i, int i_682_) {
		Class527_Sub8_Sub8 class527_sub8_sub8 = null;
		for (int i_683_ = i; i_683_ < i_682_; i_683_++) {
			Class161 class161 = aClass161Array7457[i_683_];
			if (null != class161) {
				for (int i_684_ = 0; i_684_ < anInt7432 * -1437024153; i_684_++) {
					for (int i_685_ = 0; i_685_ < anInt7443 * -547681223; i_685_++) {
						class527_sub8_sub8 = class161.method2597(i_685_, i_684_, class527_sub8_sub8);
						if (null != class527_sub8_sub8) {
							int i_686_ = i_685_ << 1742303003 * anInt7421;
							int i_687_ = i_684_ << anInt7421 * 1742303003;
							for (int i_688_ = i_683_ - 1; i_688_ >= 0; i_688_--) {
								Class161 class161_689_ = aClass161Array7457[i_688_];
								if (null != class161_689_) {
									int i_690_ = (class161.method2595(i_685_, i_684_, (byte) 26) - (class161_689_.method2595(i_685_, i_684_, (byte) 80)));
									int i_691_ = (class161.method2595(i_685_ + 1, i_684_, (byte) 119) - (class161_689_.method2595(i_685_ + 1, i_684_, (byte) 26)));
									int i_692_ = (class161.method2595(i_685_ + 1, 1 + i_684_, (byte) 110) - (class161_689_.method2595(i_685_ + 1, 1 + i_684_, (byte) 28)));
									int i_693_ = (class161.method2595(i_685_, 1 + i_684_, (byte) 54) - (class161_689_.method2595(i_685_, 1 + i_684_, (byte) 69)));
									class161_689_.method2633(class527_sub8_sub8, i_686_, (i_693_ + (i_692_ + (i_691_ + i_690_))) / 4, i_687_, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}

	public Class555(Class180 class180, int i, int i_694_, int i_695_, int i_696_, int i_697_, boolean bool, boolean bool_698_) {
		anInt7436 = 10087;
		anInt7423 = 5024;
		anInt7462 = 5007;
		aFloatArray7425 = new float[3];
		aClass527_Sub16Array7444 = new Class527_Sub16[8];
		anInt7472 = 65174;
		aHashMap7478 = new HashMap();
		aHashMap7479 = new HashMap();
		aClass180_7451 = class180;
		aBool7455 = aClass180_7451.method3188() > 0;
		anInt7421 = i * -705342701;
		anInt7422 = -1295155151 * (1 << 1742303003 * anInt7421);
		anInt7471 = 1412751075 * (anInt7422 * -1478371119 >> 1);
		anInt7466 = -896252133 * i_694_;
		anInt7443 = 2039816713 * i_695_;
		anInt7432 = i_696_ * 1170103127;
		anInt7463 = i_697_ * -968664979;
		aClass67_7438 = new Class67();
		aClass566_7430 = new Class566(this);
		aClass561ArrayArrayArray7420 = (new Class561[i_694_][-547681223 * anInt7443][-1437024153 * anInt7432]);
		aClass161Array7457 = new Class161[i_694_];
		if (bool) {
			anIntArrayArray7439 = new int[-547681223 * anInt7443][anInt7432 * -1437024153];
			aByteArrayArray7441 = new byte[-547681223 * anInt7443][-1437024153 * anInt7432];
			aShortArrayArray7440 = new short[-547681223 * anInt7443][anInt7432 * -1437024153];
			aByteArrayArray7442 = new byte[-547681223 * anInt7443][anInt7432 * -1437024153];
			aByteArrayArray7447 = new byte[anInt7443 * -547681223][-1437024153 * anInt7432];
			aByteArrayArray7428 = new byte[-547681223 * anInt7443][anInt7432 * -1437024153];
			aClass561ArrayArrayArray7437 = (new Class561[1][-547681223 * anInt7443][-1437024153 * anInt7432]);
			aClass161Array7435 = new Class161[1];
		}
		if (bool_698_) {
			aLongArrayArrayArray7475 = new long[i_694_][i_695_][i_696_];
			aClass556Array7476 = new Class556[65174];
			aBoolArray7448 = new boolean[65174];
			anInt7474 = 0;
		}
		method9220(false, (byte) -124);
		aClass640_Sub1Array7449 = new Class640_Sub1[2];
		aClass640_Sub1Array7450 = new Class640_Sub1[2];
		aClass640_Sub1Array7446 = new Class640_Sub1[2];
		aClass640_Sub1Array7483 = new Class640_Sub1[10087];
		anInt7452 = 0;
		aClass640_Sub1Array7454 = new Class640_Sub1[5024];
		anInt7453 = 0;
		aClass640_Sub1_Sub2Array7433 = new Class640_Sub1_Sub2[5007];
		anInt7445 = 0;
		aBoolArrayArray7467 = (new boolean[1 + (anInt7463 * 1329492325 + anInt7463 * 1329492325)][1 + (1329492325 * anInt7463 + 1329492325 * anInt7463)]);
		aBoolArrayArray7481 = (new boolean[anInt7463 * 1329492325 + anInt7463 * 1329492325 + 2][1329492325 * anInt7463 + anInt7463 * 1329492325 + 2]);
		anIntArray7482 = new int[1329492325 * anInt7463 + 1329492325 * anInt7463 + 2];
		aClass546_7480 = new Class546(false);
	}

	void method9393(int i, int i_699_) {
		Class527_Sub8_Sub8 class527_sub8_sub8 = null;
		for (int i_700_ = i; i_700_ < i_699_; i_700_++) {
			Class161 class161 = aClass161Array7457[i_700_];
			if (null != class161) {
				for (int i_701_ = 0; i_701_ < anInt7432 * -1437024153; i_701_++) {
					for (int i_702_ = 0; i_702_ < anInt7443 * -547681223; i_702_++) {
						class527_sub8_sub8 = class161.method2597(i_702_, i_701_, class527_sub8_sub8);
						if (null != class527_sub8_sub8) {
							int i_703_ = i_702_ << 1742303003 * anInt7421;
							int i_704_ = i_701_ << anInt7421 * 1742303003;
							for (int i_705_ = i_700_ - 1; i_705_ >= 0; i_705_--) {
								Class161 class161_706_ = aClass161Array7457[i_705_];
								if (null != class161_706_) {
									int i_707_ = (class161.method2595(i_702_, i_701_, (byte) 53) - (class161_706_.method2595(i_702_, i_701_, (byte) 116)));
									int i_708_ = (class161.method2595(i_702_ + 1, i_701_, (byte) 60) - (class161_706_.method2595(i_702_ + 1, i_701_, (byte) 108)));
									int i_709_ = (class161.method2595(i_702_ + 1, 1 + i_701_, (byte) 6) - (class161_706_.method2595(i_702_ + 1, 1 + i_701_, (byte) 60)));
									int i_710_ = (class161.method2595(i_702_, 1 + i_701_, (byte) 54) - (class161_706_.method2595(i_702_, 1 + i_701_, (byte) 95)));
									class161_706_.method2633(class527_sub8_sub8, i_703_, (i_710_ + (i_709_ + (i_708_ + i_707_))) / 4, i_704_, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}

	public void method9394() {
		method9294(1, anInt7466 * -1609909485, 655449739);
	}

	public void method9395() {
		method9294(1, anInt7466 * -1609909485, -1715930115);
	}

	public void method9396(Class556 class556) {
		if (187596765 * anInt7474 < 65174) {
			Class527_Sub16 class527_sub16 = class556.aClass527_Sub16_7495;
			aClass556Array7476[187596765 * anInt7474] = class556;
			aBoolArray7448[anInt7474 * 187596765] = false;
			anInt7474 += 2072825973;
			int i = 753393863 * class556.anInt7510;
			if (class556.aBool7496)
				i = 0;
			int i_711_ = 753393863 * class556.anInt7510;
			if (class556.aBool7508)
				i_711_ = anInt7466 * -1609909485 - 1;
			for (int i_712_ = i; i_712_ <= i_711_; i_712_++) {
				int i_713_ = 0;
				int i_714_ = ((class527_sub16.method16131((byte) 16) - class527_sub16.method16132(-733183207) + anInt7471 * -1485744437) >> 1742303003 * anInt7421);
				if (i_714_ < 0) {
					i_713_ -= i_714_;
					i_714_ = 0;
				}
				int i_715_ = ((class527_sub16.method16131((byte) -63) + class527_sub16.method16132(838985237) - -1485744437 * anInt7471) >> anInt7421 * 1742303003);
				if (i_715_ >= -1437024153 * anInt7432)
					i_715_ = anInt7432 * -1437024153 - 1;
				for (int i_716_ = i_714_; i_716_ <= i_715_; i_716_++) {
					int i_717_ = class556.aShortArray7511[i_713_++];
					int i_718_ = (((class527_sub16.method16129((byte) -47) - class527_sub16.method16132(323948947) + anInt7471 * -1485744437) >> 1742303003 * anInt7421) + (i_717_ >>> 8));
					int i_719_ = i_718_ + (i_717_ & 0xff) - 1;
					if (i_718_ < 0)
						i_718_ = 0;
					if (i_719_ >= anInt7443 * -547681223)
						i_719_ = anInt7443 * -547681223 - 1;
					for (int i_720_ = i_718_; i_720_ <= i_719_; i_720_++) {
						long l = aLongArrayArrayArray7475[i_712_][i_720_][i_716_];
						if ((l & 0xffffL) == 0L)
							aLongArrayArrayArray7475[i_712_][i_720_][i_716_] = l | (long) (187596765 * anInt7474);
						else if ((l & 0xffff0000L) == 0L)
							aLongArrayArrayArray7475[i_712_][i_720_][i_716_] = l | (long) (187596765 * anInt7474) << 16;
						else if (0L == (l & 0xffff00000000L))
							aLongArrayArrayArray7475[i_712_][i_720_][i_716_] = l | (long) (187596765 * anInt7474) << 32;
						else if (0L == (l & ~0xffffffffffffL))
							aLongArrayArrayArray7475[i_712_][i_720_][i_716_] = l | (long) (187596765 * anInt7474) << 48;
					}
				}
			}
			if (class556.anInt7518 * -235567559 != -1) {
				List list = ((List) aHashMap7478.get(Integer.valueOf(class556.anInt7518 * -235567559)));
				if (null == list) {
					list = new ArrayList();
					aHashMap7478.put(Integer.valueOf(class556.anInt7518 * -235567559), list);
				}
				list.add(class556);
				Class527_Sub16 class527_sub16_721_ = ((Class527_Sub16) aHashMap7479.get(Integer.valueOf(class556.anInt7518 * -235567559)));
				if (null != class527_sub16_721_) {
					class556.aClass527_Sub16_7495.method16146(class527_sub16_721_.method16133((byte) 0), -1612592319);
					class556.aClass527_Sub16_7495.method16139(class527_sub16_721_.method16137(2063045127), class527_sub16_721_.method16145(2016707560), 459687792);
				}
			}
		}
	}

	public void method9397(Class556 class556) {
		if (187596765 * anInt7474 < 65174) {
			Class527_Sub16 class527_sub16 = class556.aClass527_Sub16_7495;
			aClass556Array7476[187596765 * anInt7474] = class556;
			aBoolArray7448[anInt7474 * 187596765] = false;
			anInt7474 += 2072825973;
			int i = 753393863 * class556.anInt7510;
			if (class556.aBool7496)
				i = 0;
			int i_722_ = 753393863 * class556.anInt7510;
			if (class556.aBool7508)
				i_722_ = anInt7466 * -1609909485 - 1;
			for (int i_723_ = i; i_723_ <= i_722_; i_723_++) {
				int i_724_ = 0;
				int i_725_ = ((class527_sub16.method16131((byte) -29) - class527_sub16.method16132(-635692487) + anInt7471 * -1485744437) >> 1742303003 * anInt7421);
				if (i_725_ < 0) {
					i_724_ -= i_725_;
					i_725_ = 0;
				}
				int i_726_ = ((class527_sub16.method16131((byte) 85) + class527_sub16.method16132(-1896439863) - -1485744437 * anInt7471) >> anInt7421 * 1742303003);
				if (i_726_ >= -1437024153 * anInt7432)
					i_726_ = anInt7432 * -1437024153 - 1;
				for (int i_727_ = i_725_; i_727_ <= i_726_; i_727_++) {
					int i_728_ = class556.aShortArray7511[i_724_++];
					int i_729_ = (((class527_sub16.method16129((byte) 27) - class527_sub16.method16132(-2076419414) + anInt7471 * -1485744437) >> 1742303003 * anInt7421) + (i_728_ >>> 8));
					int i_730_ = i_729_ + (i_728_ & 0xff) - 1;
					if (i_729_ < 0)
						i_729_ = 0;
					if (i_730_ >= anInt7443 * -547681223)
						i_730_ = anInt7443 * -547681223 - 1;
					for (int i_731_ = i_729_; i_731_ <= i_730_; i_731_++) {
						long l = aLongArrayArrayArray7475[i_723_][i_731_][i_727_];
						if ((l & 0xffffL) == 0L)
							aLongArrayArrayArray7475[i_723_][i_731_][i_727_] = l | (long) (187596765 * anInt7474);
						else if ((l & 0xffff0000L) == 0L)
							aLongArrayArrayArray7475[i_723_][i_731_][i_727_] = l | (long) (187596765 * anInt7474) << 16;
						else if (0L == (l & 0xffff00000000L))
							aLongArrayArrayArray7475[i_723_][i_731_][i_727_] = l | (long) (187596765 * anInt7474) << 32;
						else if (0L == (l & ~0xffffffffffffL))
							aLongArrayArrayArray7475[i_723_][i_731_][i_727_] = l | (long) (187596765 * anInt7474) << 48;
					}
				}
			}
			if (class556.anInt7518 * -235567559 != -1) {
				List list = ((List) aHashMap7478.get(Integer.valueOf(class556.anInt7518 * -235567559)));
				if (null == list) {
					list = new ArrayList();
					aHashMap7478.put(Integer.valueOf(class556.anInt7518 * -235567559), list);
				}
				list.add(class556);
				Class527_Sub16 class527_sub16_732_ = ((Class527_Sub16) aHashMap7479.get(Integer.valueOf(class556.anInt7518 * -235567559)));
				if (null != class527_sub16_732_) {
					class556.aClass527_Sub16_7495.method16146(class527_sub16_732_.method16133((byte) 0), 1923200509);
					class556.aClass527_Sub16_7495.method16139(class527_sub16_732_.method16137(61725588), class527_sub16_732_.method16145(2044551210), 615114485);
				}
			}
		}
	}

	public Class640_Sub1_Sub2 method9398(int i, int i_733_, int i_734_, Interface63 interface63) {
		Class561 class561 = aClass561ArrayArrayArray7426[i][i_733_][i_734_];
		if (null == class561)
			return null;
		for (Class562 class562 = class561.aClass562_7558; class562 != null; class562 = class562.aClass562_7565) {
			Class640_Sub1_Sub2 class640_sub1_sub2 = class562.aClass640_Sub1_Sub2_7564;
			if ((interface63 == null || interface63.method410(class640_sub1_sub2, -912746549)) && class640_sub1_sub2.aShort11775 == i_733_ && class640_sub1_sub2.aShort11771 == i_734_) {
				method9274(class640_sub1_sub2, false, -1785466439);
				return class640_sub1_sub2;
			}
		}
		return null;
	}

	public void method9399() {
		for (int i = 0; i < 187596765 * anInt7474; i++) {
			if (!aBoolArray7448[i]) {
				Class556 class556 = aClass556Array7476[i];
				Class527_Sub16 class527_sub16 = class556.aClass527_Sub16_7495;
				int i_735_ = 753393863 * class556.anInt7510;
				int i_736_ = (class527_sub16.method16132(252144221) - -1485744437 * anInt7471);
				int i_737_ = 1 + (2 * i_736_ >> anInt7421 * 1742303003);
				int i_738_ = 0;
				int[] is = new int[i_737_ * i_737_];
				int i_739_ = (class527_sub16.method16129((byte) 106) - i_736_ >> 1742303003 * anInt7421);
				int i_740_ = (class527_sub16.method16131((byte) 36) - i_736_ >> anInt7421 * 1742303003);
				int i_741_ = (class527_sub16.method16131((byte) -17) + i_736_ >> anInt7421 * 1742303003);
				if (i_740_ < 0) {
					i_738_ -= i_740_;
					i_740_ = 0;
				}
				if (i_741_ >= anInt7432 * -1437024153)
					i_741_ = anInt7432 * -1437024153 - 1;
				for (int i_742_ = i_740_; i_742_ <= i_741_; i_742_++) {
					int i_743_ = class556.aShortArray7511[i_738_];
					int i_744_ = i_743_ >>> 8;
					int i_745_ = i_737_ * i_738_ + i_744_;
					int i_746_ = i_739_ + (i_743_ >>> 8);
					int i_747_ = i_746_ + (i_743_ & 0xff) - 1;
					if (i_746_ < 0) {
						i_745_ -= i_746_;
						i_746_ = 0;
					}
					if (i_747_ >= anInt7443 * -547681223)
						i_747_ = anInt7443 * -547681223 - 1;
					for (int i_748_ = i_746_; i_748_ <= i_747_; i_748_++) {
						int i_749_ = 1;
						Class640_Sub1_Sub2 class640_sub1_sub2 = method9254(i_735_, i_748_, i_742_, null, 1685448478);
						if (class640_sub1_sub2 != null && 0 != class640_sub1_sub2.aByte11776) {
							if (1 == class640_sub1_sub2.aByte11776) {
								boolean bool = i_748_ - 1 >= i_746_;
								boolean bool_750_ = i_748_ + 1 <= i_747_;
								if (!bool && i_742_ + 1 <= i_741_) {
									int i_751_ = class556.aShortArray7511[1 + i_738_];
									int i_752_ = (i_751_ >>> 8) + i_739_;
									int i_753_ = (i_751_ & 0xff) + i_752_;
									bool = i_748_ > i_752_ && i_748_ < i_753_;
								}
								if (!bool_750_ && i_742_ - 1 >= i_740_) {
									int i_754_ = class556.aShortArray7511[i_738_ - 1];
									int i_755_ = (i_754_ >>> 8) + i_739_;
									int i_756_ = (i_754_ & 0xff) + i_755_;
									bool_750_ = i_748_ > i_755_ && i_748_ < i_756_;
								}
								if (bool && !bool_750_)
									i_749_ = 4;
								else if (bool_750_ && !bool)
									i_749_ = 2;
							} else {
								boolean bool = i_748_ - 1 >= i_746_;
								boolean bool_757_ = i_748_ + 1 <= i_747_;
								if (!bool && i_742_ - 1 >= i_740_) {
									int i_758_ = class556.aShortArray7511[i_738_ - 1];
									int i_759_ = (i_758_ >>> 8) + i_739_;
									int i_760_ = i_759_ + (i_758_ & 0xff);
									bool = i_748_ > i_759_ && i_748_ < i_760_;
								}
								if (!bool_757_ && 1 + i_742_ <= i_741_) {
									int i_761_ = class556.aShortArray7511[1 + i_738_];
									int i_762_ = (i_761_ >>> 8) + i_739_;
									int i_763_ = (i_761_ & 0xff) + i_762_;
									bool_757_ = i_748_ > i_762_ && i_748_ < i_763_;
								}
								if (bool && !bool_757_)
									i_749_ = 3;
								else if (bool_757_ && !bool)
									i_749_ = 5;
							}
						}
						is[i_745_++] = i_749_;
					}
					i_738_++;
				}
				aBoolArray7448[i] = true;
				if (aBool7456)
					aClass161Array7434[i_735_].method2601(class527_sub16, is);
			}
		}
	}

	public void method9400(int i, int i_764_, int i_765_) {
		List list = (List) aHashMap7478.get(Integer.valueOf(i));
		if (list != null) {
			Iterator iterator = list.iterator();
			while (iterator.hasNext()) {
				Class556 class556 = (Class556) iterator.next();
				class556.aClass527_Sub16_7495.method16139(i_764_, i_765_, -117326107);
			}
		}
	}

	public void method9401(int i, int i_766_, int i_767_) {
		List list = (List) aHashMap7478.get(Integer.valueOf(i));
		if (list != null) {
			Iterator iterator = list.iterator();
			while (iterator.hasNext()) {
				Class556 class556 = (Class556) iterator.next();
				class556.aClass527_Sub16_7495.method16139(i_766_, i_767_, -1610331424);
			}
		}
	}

	public void method9402(int i, int i_768_, int i_769_, int i_770_, Class640_Sub1_Sub5 class640_sub1_sub5, byte i_771_) {
		Class561 class561 = method9223(i, i_768_, i_769_, (byte) 1);
		if (null != class561) {
			class640_sub1_sub5.method10618(new Class442((float) (anInt7471 * -1485744437 + (i_768_ << 1742303003 * anInt7421)), (float) i_770_, (float) (-1485744437 * anInt7471 + (i_769_ << 1742303003 * anInt7421))));
			class561.aClass640_Sub1_Sub5_7557 = class640_sub1_sub5;
			int i_772_ = aClass161Array7435 == aClass161Array7434 ? 1 : 0;
			if (class640_sub1_sub5.method17069(-1166540368)) {
				if (class640_sub1_sub5.method17072(1937539534)) {
					class640_sub1_sub5.aClass640_Sub1_10865 = aClass640_Sub1Array7450[i_772_];
					aClass640_Sub1Array7450[i_772_] = class640_sub1_sub5;
				} else {
					class640_sub1_sub5.aClass640_Sub1_10865 = aClass640_Sub1Array7449[i_772_];
					aClass640_Sub1Array7449[i_772_] = class640_sub1_sub5;
				}
			} else {
				class640_sub1_sub5.aClass640_Sub1_10865 = aClass640_Sub1Array7446[i_772_];
				aClass640_Sub1Array7446[i_772_] = class640_sub1_sub5;
			}
		}
	}

	Class561 method9403(int i, int i_773_, int i_774_) {
		return method9223(i, Math.min(anInt7443 * -547681223 - 1, Math.max(0, i_773_)), Math.min(-1437024153 * anInt7432 - 1, Math.max(0, i_774_)), (byte) 1);
	}

	public void method9404(HashMap hashmap) {
		aHashMap7479 = hashmap;
	}

	public void method9405(HashMap hashmap) {
		aHashMap7479 = hashmap;
	}

	static final void method9406(Class665 class665, int i) {
		int i_775_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		if (-405609043 * client.anInt11083 != 0 && i_775_ < 182205737 * client.anInt11299) {
			Class72 class72 = client.aClass72Array11301[i_775_];
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = class72.aString785;
			if (class72.aString786 != null)
				class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = class72.aString786;
			else
				class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = "";
		} else {
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = "";
			class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = "";
		}
	}

	static final void method9407(Class243 class243, Class240 class240, Class665 class665, int i) {
		class243.anInt2576 = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]) * 13028955;
		Class430.method6876(class243, (byte) 42);
		if (-927924265 * class243.anInt2675 == -1 && !class240.aBool2394)
			Class640_Sub1.method17093(-254728301 * class243.anInt2504, 448806139);
	}

	static void method9408(RSByteBuffer class527_sub38, byte i) {
		for (int i_776_ = 0; i_776_ < -1134558959 * Class318.anInt3535; i_776_++) {
			int i_777_ = class527_sub38.readUnsignedSmart((byte) -51);
			int i_778_ = class527_sub38.readUnsignedShort();
			if (i_778_ == 65535)
				i_778_ = -1;
			if (Class605.aClass604_Sub1Array7968[i_777_] != null)
				Class605.aClass604_Sub1Array7968[i_777_].anInt7967 = -2006613705 * i_778_;
		}
	}

	public static final void method9409(Class243 class243, int i, int i_779_, byte i_780_) {
		if (null == client.aClass243_11150 && !Class35.aBool338 && (null != class243 && Class208_Sub12.method15619(class243, -1945547267))) {
			client.aClass243_11150 = class243;
			client.aClass243_11205 = Class331_Sub3.method15765(class243, 2055017166);
			client.anInt11164 = -1979178009 * i;
			client.anInt11207 = 842620813 * i_779_;
			Class263.anInt2868 = 0;
			client.aBool11217 = false;
		}
	}
}
