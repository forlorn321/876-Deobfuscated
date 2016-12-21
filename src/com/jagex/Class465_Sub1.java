/* Class465_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class465_Sub1 extends Class465 {
	int anInt10339 = -1500087995;
	static int[] anIntArray10340;
	static final int anInt10341 = 0;
	static final int anInt10342 = 1;
	static final int anInt10343 = 2;
	static boolean aBool10344 = false;
	static int[] anIntArray10345;
	Class636 aClass636_10346;
	static int[] anIntArray10347;
	static final int anInt10348 = 3;
	static boolean aBool10349 = false;
	static int[] anIntArray10350;
	Class34_Sub17 aClass34_Sub17_10351;
	public static Class96 aClass96_10352;

	public final void method9376(Class167 class167, RSByteBuffer class536_sub33, int i, int i_0_, int i_1_) {
		if (!aBool5298) {
			class536_sub33.off += -165563176;
			boolean bool = false;
			Class625 class625 = null;
			boolean bool_2_ = false;
			while (-810172525 * class536_sub33.off < class536_sub33.buffer.length) {
				int i_3_ = class536_sub33.readUnsignedByte(572374951);
				if (0 == i_3_) {
					if (null == class625)
						class625 = new Class625(class536_sub33, aClass636_10346);
					else
						class625.method7430(class536_sub33, aClass636_10346, (byte) -78);
				} else if (1 == i_3_) {
					int i_4_ = class536_sub33.readUnsignedByte(-793385816);
					if (i_4_ > 0) {
						for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
							Class562 class562 = new Class562(class167, (1893698405 * aClass553_5269.anInt7444), class536_sub33, 2);
							if (31 == class562.anInt7572 * -1719604617) {
								Class84 class84 = ((Class84) (Class642.aClass34_Sub20_8334.method70(class536_sub33.readUnsignedShort((short) -7099), (byte) 86)));
								class562.method6853(1832144569 * class84.anInt867, -1068933627 * class84.anInt864, class84.anInt866 * -1538266173, 1778741949 * class84.anInt865, (byte) -44);
							}
							if (class167.method2108() > 0) {
								Class536_Sub19 class536_sub19 = class562.aClass536_Sub19_7546;
								int i_6_ = (class536_sub19.method9548(-943699402) + (i << 9));
								int i_7_ = (class536_sub19.method9551((byte) 0) + (i_0_ << 9));
								int i_8_ = i_6_ >> 9;
								int i_9_ = i_7_ >> 9;
								if (i_8_ >= 0 && i_9_ >= 0 && i_8_ < 312855363 * anInt5242 && i_9_ < -183622811 * anInt5284) {
									class536_sub19.method9538(i_6_, ((anIntArrayArrayArray5245[class562.anInt7570 * -2071213659][i_8_][i_9_]) - class536_sub19.method9549(753377886)), i_7_, (byte) -65);
									aClass553_5269.method6723(class562, 720738311);
								}
							}
						}
					}
				} else if (2 == i_3_) {
					if (null == class625)
						class625 = new Class625();
					class625.method7434(class536_sub33, (byte) 8);
				} else if (3 == i_3_) {
					if (null == class625)
						class625 = new Class625();
					class625.method7435(class536_sub33, -908350489);
				} else if (i_3_ == 128) {
					if (null == class625)
						class625 = new Class625();
					class625.method7443(class536_sub33, aClass636_10346, 45658013);
				} else if (129 == i_3_) {
					if (aByteArrayArrayArray5246 == null)
						aByteArrayArrayArray5246 = new byte[4][][];
					for (int i_10_ = 0; i_10_ < 4; i_10_++) {
						byte i_11_ = class536_sub33.readByte(1590728763);
						if (i_11_ == 0 && null != aByteArrayArrayArray5246[i_10_]) {
							int i_12_ = i;
							int i_13_ = 64 + i;
							int i_14_ = i_0_;
							int i_15_ = 64 + i_0_;
							if (i_12_ < 0)
								i_12_ = 0;
							else if (i_12_ >= 312855363 * anInt5242)
								i_12_ = 312855363 * anInt5242;
							if (i_13_ < 0)
								i_13_ = 0;
							else if (i_13_ >= anInt5242 * 312855363)
								i_13_ = 312855363 * anInt5242;
							if (i_14_ < 0)
								i_14_ = 0;
							else if (i_14_ >= anInt5284 * -183622811)
								i_14_ = -183622811 * anInt5284;
							if (i_15_ < 0)
								i_15_ = 0;
							else if (i_15_ >= anInt5284 * -183622811)
								i_15_ = anInt5284 * -183622811;
							for (/**/; i_12_ < i_13_; i_12_++) {
								for (/**/; i_14_ < i_15_; i_14_++)
									aByteArrayArrayArray5246[i_10_][i_12_][i_14_] = (byte) 0;
							}
						} else if (1 == i_11_) {
							if (null == aByteArrayArrayArray5246[i_10_])
								aByteArrayArrayArray5246[i_10_] = (new byte[1 + 312855363 * anInt5242][-183622811 * anInt5284 + 1]);
							for (int i_16_ = 0; i_16_ < 64; i_16_ += 4) {
								for (int i_17_ = 0; i_17_ < 64; i_17_ += 4) {
									byte i_18_ = class536_sub33.readByte(-566567851);
									for (int i_19_ = i_16_ + i; i_19_ < 4 + (i + i_16_); i_19_++) {
										for (int i_20_ = i_0_ + i_17_; i_20_ < 4 + (i_17_ + i_0_); i_20_++) {
											if (i_19_ >= 0 && (i_19_ < anInt5242 * 312855363) && i_20_ >= 0 && (i_20_ < anInt5284 * -183622811))
												aByteArrayArrayArray5246[i_10_][i_19_][i_20_] = i_18_;
										}
									}
								}
							}
						} else if (i_11_ == 2) {
							if (null == aByteArrayArrayArray5246[i_10_])
								aByteArrayArrayArray5246[i_10_] = (new byte[1 + 312855363 * anInt5242][1 + anInt5284 * -183622811]);
							if (i_10_ > 0) {
								int i_21_ = i;
								int i_22_ = 64 + i;
								int i_23_ = i_0_;
								int i_24_ = 64 + i_0_;
								if (i_21_ < 0)
									i_21_ = 0;
								else if (i_21_ >= 312855363 * anInt5242)
									i_21_ = 312855363 * anInt5242;
								if (i_22_ < 0)
									i_22_ = 0;
								else if (i_22_ >= 312855363 * anInt5242)
									i_22_ = anInt5242 * 312855363;
								if (i_23_ < 0)
									i_23_ = 0;
								else if (i_23_ >= anInt5284 * -183622811)
									i_23_ = anInt5284 * -183622811;
								if (i_24_ < 0)
									i_24_ = 0;
								else if (i_24_ >= anInt5284 * -183622811)
									i_24_ = anInt5284 * -183622811;
								for (/**/; i_21_ < i_22_; i_21_++) {
									for (/**/; i_23_ < i_24_; i_23_++)
										aByteArrayArrayArray5246[i_10_][i_21_][i_23_] = (aByteArrayArrayArray5246[i_10_ - 1][i_21_][i_23_]);
								}
							}
						}
					}
					bool = true;
				} else if (130 == i_3_)
					bool_2_ = true;
				else
					throw new IllegalStateException("");
			}
			for (int i_25_ = 0; i_25_ < 8; i_25_++) {
				for (int i_26_ = 0; i_26_ < 8; i_26_++) {
					int i_27_ = (i >> 3) + i_25_;
					int i_28_ = (i_0_ >> 3) + i_26_;
					if (i_27_ >= 0 && i_27_ < anInt5242 * 312855363 >> 3 && i_28_ >= 0 && i_28_ < anInt5284 * -183622811 >> 3) {
						if (class625 != null)
							aClass636_10346.method7575(i_27_, i_28_, class625, 70783308);
						Class499.method6020(i_27_, i_28_, bool_2_, 561524425);
					}
				}
			}
			if (!bool && aByteArrayArrayArray5246 != null) {
				for (int i_29_ = 0; i_29_ < 4; i_29_++) {
					if (aByteArrayArrayArray5246[i_29_] != null) {
						for (int i_30_ = 0; i_30_ < 16; i_30_++) {
							for (int i_31_ = 0; i_31_ < 16; i_31_++) {
								int i_32_ = (i >> 2) + i_30_;
								int i_33_ = i_31_ + (i_0_ >> 2);
								if (i_32_ >= 0 && i_32_ < 26 && i_33_ >= 0 && i_33_ < 26)
									aByteArrayArrayArray5246[i_29_][i_32_][i_33_] = (byte) 0;
							}
						}
					}
				}
			}
		}
	}

	public final void method9377(Class167 class167, RSByteBuffer class536_sub33, int i, int i_34_, int i_35_, int i_36_, int i_37_, int i_38_, int i_39_, byte i_40_) {
		if (!aBool5298) {
			class536_sub33.off += -165563176;
			boolean bool = false;
			Class625 class625 = null;
			boolean bool_41_ = false;
			int i_42_ = 8 * (i_37_ & 0x7);
			int i_43_ = (i_38_ & 0x7) * 8;
			while (-810172525 * class536_sub33.off < class536_sub33.buffer.length) {
				int i_44_ = class536_sub33.readUnsignedByte(1275740409);
				if (i_44_ == 0) {
					if (null == class625)
						class625 = new Class625(class536_sub33, aClass636_10346);
					else
						class625.method7430(class536_sub33, aClass636_10346, (byte) -56);
				} else if (1 == i_44_) {
					int i_45_ = class536_sub33.readUnsignedByte(1525694725);
					if (i_45_ > 0) {
						for (int i_46_ = 0; i_46_ < i_45_; i_46_++) {
							Class562 class562 = new Class562(class167, (aClass553_5269.anInt7444 * 1893698405), class536_sub33, 2);
							if (class562.anInt7572 * -1719604617 == 31) {
								Class84 class84 = ((Class84) (Class642.aClass34_Sub20_8334.method70(class536_sub33.readUnsignedShort((short) 4555), (byte) 106)));
								class562.method6853(1832144569 * class84.anInt867, -1068933627 * class84.anInt864, class84.anInt866 * -1538266173, class84.anInt865 * 1778741949, (byte) -1);
							}
							if (class167.method2108() > 0) {
								Class536_Sub19 class536_sub19 = class562.aClass536_Sub19_7546;
								int i_47_ = (class536_sub19.method9548(-1893460122) >> 9);
								int i_48_ = class536_sub19.method9551((byte) 0) >> 9;
								if (i_36_ == class562.anInt7570 * -2071213659 && i_47_ >= i_42_ && i_47_ < 8 + i_42_ && i_48_ >= i_43_ && i_48_ < i_43_ + 8) {
									int i_49_ = ((i_34_ << 9) + (Class580.method7012((class536_sub19.method9548(-1139333586) & 0xfff), (class536_sub19.method9551((byte) 0) & 0xfff), i_39_, -1244705301)));
									int i_50_ = ((i_35_ << 9) + (Class298.method4009((class536_sub19.method9548(-1204591720) & 0xfff), (class536_sub19.method9551((byte) 0) & 0xfff), i_39_, 1636147817)));
									i_47_ = i_49_ >> 9;
									i_48_ = i_50_ >> 9;
									if (i_47_ >= 0 && i_48_ >= 0 && i_47_ < anInt5242 * 312855363 && i_48_ < -183622811 * anInt5284) {
										class562.anInt7570 = i * 917894701;
										class536_sub19.method9538(i_49_, ((anIntArrayArrayArray5245[(-2071213659 * class562.anInt7570)][i_47_][i_48_]) - class536_sub19.method9549(268286338)), i_50_, (byte) -3);
										aClass553_5269.method6723(class562, 1199455021);
									}
								}
							}
						}
					}
				} else if (2 == i_44_) {
					if (class625 == null)
						class625 = new Class625();
					class625.method7434(class536_sub33, (byte) 8);
				} else if (i_44_ == 3) {
					if (null == class625)
						class625 = new Class625();
					class625.method7435(class536_sub33, -1091367447);
				} else if (i_44_ == 128) {
					if (class625 == null)
						class625 = new Class625();
					class625.method7443(class536_sub33, aClass636_10346, 45658013);
				} else if (129 == i_44_) {
					if (null == aByteArrayArrayArray5246)
						aByteArrayArrayArray5246 = new byte[4][][];
					for (int i_51_ = 0; i_51_ < 4; i_51_++) {
						byte i_52_ = class536_sub33.readByte(-1143771330);
						if (i_52_ == 0 && aByteArrayArrayArray5246[i] != null) {
							if (i_51_ <= i_36_) {
								int i_53_ = i_34_;
								int i_54_ = i_34_ + 7;
								int i_55_ = i_35_;
								int i_56_ = 7 + i_35_;
								if (i_53_ < 0)
									i_53_ = 0;
								else if (i_53_ >= 312855363 * anInt5242)
									i_53_ = anInt5242 * 312855363;
								if (i_54_ < 0)
									i_54_ = 0;
								else if (i_54_ >= 312855363 * anInt5242)
									i_54_ = anInt5242 * 312855363;
								if (i_55_ < 0)
									i_55_ = 0;
								else if (i_55_ >= -183622811 * anInt5284)
									i_55_ = -183622811 * anInt5284;
								if (i_56_ < 0)
									i_56_ = 0;
								else if (i_56_ >= -183622811 * anInt5284)
									i_56_ = -183622811 * anInt5284;
								for (/**/; i_53_ < i_54_; i_53_++) {
									for (/**/; i_55_ < i_56_; i_55_++)
										aByteArrayArrayArray5246[i][i_53_][i_55_] = (byte) 0;
								}
							}
						} else if (i_52_ == 1) {
							if (null == aByteArrayArrayArray5246[i])
								aByteArrayArrayArray5246[i] = (new byte[1 + 312855363 * anInt5242][-183622811 * anInt5284 + 1]);
							for (int i_57_ = 0; i_57_ < 64; i_57_ += 4) {
								for (int i_58_ = 0; i_58_ < 64; i_58_ += 4) {
									byte i_59_ = class536_sub33.readByte(1847395131);
									if (i_51_ <= i_36_) {
										for (int i_60_ = i_57_; i_60_ < 4 + i_57_; i_60_++) {
											for (int i_61_ = i_58_; i_61_ < 4 + i_58_; i_61_++) {
												if (i_60_ >= i_42_ && i_60_ < i_42_ + 8 && i_61_ >= i_43_ && i_61_ < 8 + i_43_) {
													int i_62_ = (i_34_ + (Class89.method1226(i_60_ & 0x7, i_61_ & 0x7, i_39_, -1310766219)));
													int i_63_ = (i_35_ + (Class45.method897(i_60_ & 0x7, i_61_ & 0x7, i_39_, -2128104654)));
													if (i_62_ >= 0 && (i_62_ < (anInt5242 * 312855363)) && i_63_ >= 0 && (i_63_ < (anInt5284 * -183622811))) {
														aByteArrayArrayArray5246[i][i_62_][i_63_] = i_59_;
														bool = true;
													}
												}
											}
										}
									}
								}
							}
						} else if (i_52_ == 2)
							continue;
					}
				} else if (130 == i_44_)
					bool_41_ = true;
				else
					throw new IllegalStateException("");
			}
			if (null != class625)
				aClass636_10346.method7575(i_34_ >> 3, i_35_ >> 3, class625, 70783308);
			Class499.method6020(i_34_ >> 3, i_35_ >> 3, bool_41_, 114475004);
			if (!bool && null != aByteArrayArrayArray5246 && null != aByteArrayArrayArray5246[i]) {
				int i_64_ = 7 + i_34_;
				int i_65_ = 7 + i_35_;
				for (int i_66_ = i_34_; i_66_ < i_64_; i_66_++) {
					for (int i_67_ = i_35_; i_67_ < i_65_; i_67_++)
						aByteArrayArrayArray5246[i][i_66_][i_67_] = (byte) 0;
				}
			}
		}
	}

	public final void method9378(Class167 class167, byte[] is, int i, int i_68_, int i_69_, int i_70_, int i_71_, int i_72_, int i_73_, byte i_74_) {
		RSByteBuffer class536_sub33 = new RSByteBuffer(is);
		int i_75_ = -1;
		for (;;) {
			int i_76_ = class536_sub33.readSmart(-2110490428);
			if (i_76_ == 0)
				break;
			i_75_ += i_76_;
			int i_77_ = 0;
			for (;;) {
				int i_78_ = class536_sub33.readUnsignedSmart(1901383775);
				if (0 == i_78_)
					break;
				i_77_ += i_78_ - 1;
				int i_79_ = i_77_ & 0x3f;
				int i_80_ = i_77_ >> 6 & 0x3f;
				int i_81_ = i_77_ >> 12;
				int i_82_ = class536_sub33.readUnsignedByte(1937878540);
				int i_83_ = i_82_ >> 2;
				int i_84_ = i_82_ & 0x3;
				if (i_70_ == i_81_ && i_80_ >= i_71_ && i_80_ < i_71_ + 8 && i_79_ >= i_72_ && i_79_ < i_72_ + 8) {
					Class612 class612 = ((Class612) aClass34_Sub17_10351.method70(i_75_, (byte) 15));
					int i_85_;
					int i_86_;
					if (0 == (i_84_ & 0x1)) {
						i_85_ = class612.anInt8002 * -1981381335;
						i_86_ = -90266503 * class612.anInt7980;
					} else {
						i_85_ = -90266503 * class612.anInt7980;
						i_86_ = class612.anInt8002 * -1981381335;
					}
					int i_87_ = i_68_ + Class171.method2424(i_80_ & 0x7, i_79_ & 0x7, i_73_, (-1981381335 * class612.anInt8002), (class612.anInt7980 * -90266503), i_84_, -2052338781);
					int i_88_ = (i_69_ + Class567_Sub1.method9876(i_80_ & 0x7, i_79_ & 0x7, i_73_, (-1981381335 * class612.anInt8002), (class612.anInt7980 * -90266503), i_84_, 177323065));
					int i_89_ = i_87_ + i_85_;
					int i_90_ = i_88_ + i_86_;
					if (i_87_ < 312855363 * anInt5242 && i_88_ < -183622811 * anInt5284 && i_89_ > 0 && i_90_ > 0 && ((Class606.aClass606_7880.anInt7878 * -723459231 == i_83_) || (Class606.aClass606_7894.anInt7878 * -723459231 == i_83_) || (i_87_ > 0 && i_88_ > 0 && i_87_ < anInt5242 * 312855363 - 1 && i_88_ < anInt5284 * -183622811 - 1)))
						method9379(class167, i, i, i_87_, i_88_, i_75_, i_84_ + i_73_ & 0x3, i_83_, -1, 0, -1678104792);
				}
			}
		}
	}

	final void method9379(Class167 class167, int i, int i_91_, int i_92_, int i_93_, int i_94_, int i_95_, int i_96_, int i_97_, int i_98_, int i_99_) {
		if (i_91_ < anInt10339 * 1660037511)
			anInt10339 = -1099740105 * i_91_;
		Class612 class612 = (Class612) aClass34_Sub17_10351.method70(i_94_, (byte) 11);
		if (Class710.aClass536_Sub40_8843.aClass710_Sub2_10765.method9885(1532864971) != 0 || !class612.aBool7999) {
			int i_100_;
			int i_101_;
			if (i_95_ == 1 || 3 == i_95_) {
				i_100_ = -90266503 * class612.anInt7980;
				i_101_ = class612.anInt8002 * -1981381335;
			} else {
				i_100_ = -1981381335 * class612.anInt8002;
				i_101_ = class612.anInt7980 * -90266503;
			}
			int i_102_;
			int i_103_;
			if (i_100_ + i_92_ <= 312855363 * anInt5242) {
				i_102_ = i_92_ + (i_100_ >> 1);
				i_103_ = i_92_ + (1 + i_100_ >> 1);
			} else {
				i_102_ = i_92_;
				i_103_ = 1 + i_92_;
			}
			int i_104_;
			int i_105_;
			if (i_101_ + i_93_ <= -183622811 * anInt5284) {
				i_104_ = i_93_ + (i_101_ >> 1);
				i_105_ = (1 + i_101_ >> 1) + i_93_;
			} else {
				i_104_ = i_93_;
				i_105_ = i_93_ + 1;
			}
			Class160 class160 = aClass553_5269.aClass160Array7431[i];
			int i_106_;
			if (i_96_ == Class606.aClass606_7880.anInt7878 * -723459231 || -723459231 * Class606.aClass606_7894.anInt7878 == i_96_)
				i_106_ = (class160.method1954(i_102_, i_104_, (short) 32664) + class160.method1954(i_103_, i_104_, (short) 14372) + class160.method1954(i_102_, i_105_, (short) 31243) + class160.method1954(i_103_, i_105_, (short) 17307)) >> 2;
			else
				i_106_ = ((class160.method1927(i_102_, i_104_, 1146087412) + class160.method1927(i_103_, i_104_, 1293661377) + class160.method1927(i_102_, i_105_, 1930885073) + class160.method1927(i_103_, i_105_, -1076564128)) >> 2);
			int i_107_ = (i_100_ << 8) + (i_92_ << 9);
			int i_108_ = (i_93_ << 9) + (i_101_ << 8);
			boolean bool = aBool5247 && !aBool5298 && class612.aBool7956;
			if (class612.method7282((short) 255))
				Class76.method1155(i_91_, i_92_, i_93_, i_95_, class612, null, null, 352877239);
			boolean bool_109_ = (-1 == i_97_ && (!class612.method7300((byte) -23) || class612.aBool7993 && (Class710.aClass536_Sub40_8843.aClass710_Sub23_10774.method10126(1041246061) == 0)) && class612.anIntArray7988 == null && !class612.aBool8003 && !class612.aBool8007);
			if (!aBool10344 || ((!Class374.method4779(i_96_, -1699980071) || 1 == 1174186059 * class612.anInt7995) && (!Class199.method2907(i_96_, (byte) -95) || 0 != class612.anInt7995 * 1174186059))) {
				if (Class606.aClass606_7895.anInt7878 * -723459231 == i_96_) {
					if (Class710.aClass536_Sub40_8843.aClass710_Sub7_10753.method9932(-2015548878) != 0 || 1248110961 * class612.anInt7953 != 0 || -1137177093 * class612.anInt7952 == 1 || class612.aBool7945) {
						Class649_Sub1_Sub2 class649_sub1_sub2;
						if (bool_109_) {
							Class649_Sub1_Sub2_Sub2 class649_sub1_sub2_sub2 = (new Class649_Sub1_Sub2_Sub2(aClass553_5269, class167, aClass34_Sub17_10351, class612, i_91_, i, i_107_, i_106_, i_108_, aBool5298, i_95_, bool));
							if (class649_sub1_sub2_sub2.method369(-787916349))
								class649_sub1_sub2_sub2.method371(class167, 1867269829);
							class649_sub1_sub2 = class649_sub1_sub2_sub2;
						} else
							class649_sub1_sub2 = (new Class649_Sub1_Sub2_Sub1(aClass553_5269, class167, aClass34_Sub17_10351, class612, i_91_, i, i_107_, i_106_, i_108_, aBool5298, i_95_, i_97_, i_98_));
						aClass553_5269.method6707(i_91_, i_92_, i_93_, class649_sub1_sub2, (byte) 0);
					}
				} else if ((-723459231 * Class606.aClass606_7880.anInt7878 == i_96_) || (Class606.aClass606_7894.anInt7878 * -723459231 == i_96_)) {
					Class649_Sub1_Sub5_Sub2 class649_sub1_sub5_sub2 = null;
					Class649_Sub1_Sub5 class649_sub1_sub5;
					int i_110_;
					if (bool_109_) {
						Class649_Sub1_Sub5_Sub2 class649_sub1_sub5_sub2_111_ = (new Class649_Sub1_Sub5_Sub2(aClass553_5269, class167, aClass34_Sub17_10351, class612, i_91_, i, i_107_, i_106_, i_108_, aBool5298, i_92_, i_92_ + i_100_ - 1, i_93_, i_93_ + i_101_ - 1, i_96_, i_95_, bool, (Class601.aClass601_7852 != class612.aClass601_8009)));
						i_110_ = class649_sub1_sub5_sub2_111_.method10932(949289212);
						class649_sub1_sub5 = class649_sub1_sub5_sub2_111_;
						class649_sub1_sub5_sub2 = class649_sub1_sub5_sub2_111_;
					} else {
						class649_sub1_sub5 = (new Class649_Sub1_Sub5_Sub3(aClass553_5269, class167, aClass34_Sub17_10351, class612, i_91_, i, i_107_, i_106_, i_108_, aBool5298, i_92_, i_100_ + i_92_ - 1, i_93_, i_101_ + i_93_ - 1, i_96_, i_95_, i_97_, i_98_, (Class601.aClass601_7852 != class612.aClass601_8009)));
						i_110_ = 15;
					}
					if (aClass553_5269.method6711(class649_sub1_sub5, false, -2083227366)) {
						if (null != class649_sub1_sub5_sub2 && class649_sub1_sub5_sub2.method369(551238202))
							class649_sub1_sub5_sub2.method371(class167, 1867269829);
						if (class612.aBool7974 && aBool5247) {
							if (i_110_ > 30)
								i_110_ = 30;
							for (int i_112_ = 0; i_112_ <= i_100_; i_112_++) {
								for (int i_113_ = 0; i_113_ <= i_101_; i_113_++)
									class160.method1956(i_112_ + i_92_, i_93_ + i_113_, i_110_);
							}
						}
					}
				} else if (Class199.method2907(i_96_, (byte) -75) || Class590.method7099(i_96_, 1248933353)) {
					Class649_Sub1_Sub5 class649_sub1_sub5;
					if (bool_109_) {
						Class649_Sub1_Sub5_Sub2 class649_sub1_sub5_sub2 = (new Class649_Sub1_Sub5_Sub2(aClass553_5269, class167, aClass34_Sub17_10351, class612, i_91_, i, i_107_, i_106_, i_108_, aBool5298, i_92_, i_92_ + i_100_ - 1, i_93_, i_101_ + i_93_ - 1, i_96_, i_95_, bool, true));
						if (class649_sub1_sub5_sub2.method369(-807189531))
							class649_sub1_sub5_sub2.method371(class167, 1867269829);
						class649_sub1_sub5 = class649_sub1_sub5_sub2;
					} else
						class649_sub1_sub5 = (new Class649_Sub1_Sub5_Sub3(aClass553_5269, class167, aClass34_Sub17_10351, class612, i_91_, i, i_107_, i_106_, i_108_, aBool5298, i_92_, i_100_ + i_92_ - 1, i_93_, i_101_ + i_93_ - 1, i_96_, i_95_, i_97_, i_98_, true));
					aClass553_5269.method6711(class649_sub1_sub5, false, -1972650759);
					if (aBool5247 && !aBool5298 && Class199.method2907(i_96_, (byte) 8) && (i_96_ != Class606.aClass606_7884.anInt7878 * -723459231) && i_91_ > 0 && class612.anInt7995 * 1174186059 != 0)
						aByteArrayArrayArray5252[i_91_][i_92_][i_93_] |= 0x4;
				} else if (method9385(class167, i_96_, i_95_, bool_109_, class612, i_97_, i_98_, i_91_, i, i_107_, i_106_, i_108_, i_92_, i_93_, bool, class160, i_100_, i_101_, 620912741) || method9381(class167, i_96_, i_95_, bool_109_, class612, i_97_, i_98_, i_91_, i, i_107_, i_106_, i_108_, i_92_, i_93_, 1999409665)) {
					/* empty */
				}
			}
		}
	}

	Interface59 method9380(int i, int i_114_, int i_115_, int i_116_, int i_117_) {
		Interface59 interface59 = null;
		if (0 == i_114_)
			interface59 = (Interface59) aClass553_5269.method6716(i, i_115_, i_116_, -342954341);
		if (1 == i_114_)
			interface59 = (Interface59) aClass553_5269.method6714(i, i_115_, i_116_, (byte) 50);
		if (2 == i_114_)
			interface59 = ((Interface59) aClass553_5269.method6736(i, i_115_, i_116_, client.anInterface64_11113, (byte) -56));
		if (i_114_ == 3)
			interface59 = (Interface59) aClass553_5269.method6726(i, i_115_, i_116_, 1672121015);
		return interface59;
	}

	boolean method9381(Class167 class167, int i, int i_118_, boolean bool, Class612 class612, int i_119_, int i_120_, int i_121_, int i_122_, int i_123_, int i_124_, int i_125_, int i_126_, int i_127_, int i_128_) {
		if (-723459231 * Class606.aClass606_7888.anInt7878 == i) {
			Class649_Sub1_Sub4 class649_sub1_sub4;
			if (bool) {
				Class649_Sub1_Sub4_Sub2 class649_sub1_sub4_sub2 = new Class649_Sub1_Sub4_Sub2(aClass553_5269, class167, aClass34_Sub17_10351, class612, i_121_, i_122_, i_123_, i_124_, i_125_, aBool5298, 0, 0, i, i_118_);
				if (class649_sub1_sub4_sub2.method369(1440986734))
					class649_sub1_sub4_sub2.method371(class167, 1867269829);
				class649_sub1_sub4 = class649_sub1_sub4_sub2;
			} else
				class649_sub1_sub4 = new Class649_Sub1_Sub4_Sub1(aClass553_5269, class167, aClass34_Sub17_10351, class612, i_121_, i_122_, i_123_, i_124_, i_125_, aBool5298, 0, 0, i, i_118_, i_119_, i_120_);
			aClass553_5269.method6710(i_121_, i_126_, i_127_, class649_sub1_sub4, null, 837784204);
			return true;
		}
		if (-723459231 * Class606.aClass606_7879.anInt7878 == i) {
			int i_129_ = 65;
			Interface59 interface59 = (Interface59) aClass553_5269.method6716(i_121_, i_126_, i_127_, -342954341);
			if (interface59 != null)
				i_129_ = (((Class612) aClass34_Sub17_10351.method70(interface59.method373((byte) 9), (byte) -18)).anInt7963 * -624248411) + 1;
			Class649_Sub1_Sub4 class649_sub1_sub4;
			if (bool) {
				Class649_Sub1_Sub4_Sub2 class649_sub1_sub4_sub2 = (new Class649_Sub1_Sub4_Sub2(aClass553_5269, class167, aClass34_Sub17_10351, class612, i_121_, i_122_, i_123_, i_124_, i_125_, aBool5298, i_129_ * anIntArray10345[i_118_], anIntArray10350[i_118_] * i_129_, i, i_118_));
				if (class649_sub1_sub4_sub2.method369(325826362))
					class649_sub1_sub4_sub2.method371(class167, 1867269829);
				class649_sub1_sub4 = class649_sub1_sub4_sub2;
			} else
				class649_sub1_sub4 = (new Class649_Sub1_Sub4_Sub1(aClass553_5269, class167, aClass34_Sub17_10351, class612, i_121_, i_122_, i_123_, i_124_, i_125_, aBool5298, i_129_ * anIntArray10345[i_118_], anIntArray10350[i_118_] * i_129_, i, i_118_, i_119_, i_120_));
			aClass553_5269.method6710(i_121_, i_126_, i_127_, class649_sub1_sub4, null, 215327598);
			return true;
		}
		if (i == -723459231 * Class606.aClass606_7889.anInt7878) {
			int i_130_ = 33;
			Interface59 interface59 = (Interface59) aClass553_5269.method6716(i_121_, i_126_, i_127_, -342954341);
			if (null != interface59)
				i_130_ = (((Class612) (aClass34_Sub17_10351.method70(interface59.method373((byte) -7), (byte) -23))).anInt7963 * -624248411 / 2) + 1;
			Class649_Sub1_Sub4 class649_sub1_sub4;
			if (bool) {
				Class649_Sub1_Sub4_Sub2 class649_sub1_sub4_sub2 = (new Class649_Sub1_Sub4_Sub2(aClass553_5269, class167, aClass34_Sub17_10351, class612, i_121_, i_122_, i_123_, i_124_, i_125_, aBool5298, anIntArray10345[i_118_] * i_130_, anIntArray10350[i_118_] * i_130_, i, 4 + i_118_));
				if (class649_sub1_sub4_sub2.method369(1091749792))
					class649_sub1_sub4_sub2.method371(class167, 1867269829);
				class649_sub1_sub4 = class649_sub1_sub4_sub2;
			} else
				class649_sub1_sub4 = (new Class649_Sub1_Sub4_Sub1(aClass553_5269, class167, aClass34_Sub17_10351, class612, i_121_, i_122_, i_123_, i_124_, i_125_, aBool5298, anIntArray10347[i_118_] * i_130_, i_130_ * anIntArray10340[i_118_], i, 4 + i_118_, i_119_, i_120_));
			aClass553_5269.method6710(i_121_, i_126_, i_127_, class649_sub1_sub4, null, -445366513);
			return true;
		}
		if (-723459231 * Class606.aClass606_7881.anInt7878 == i) {
			int i_131_ = i_118_ + 2 & 0x3;
			Class649_Sub1_Sub4 class649_sub1_sub4;
			if (bool) {
				Class649_Sub1_Sub4_Sub2 class649_sub1_sub4_sub2 = new Class649_Sub1_Sub4_Sub2(aClass553_5269, class167, aClass34_Sub17_10351, class612, i_121_, i_122_, i_123_, i_124_, i_125_, aBool5298, 0, 0, i, 4 + i_131_);
				if (class649_sub1_sub4_sub2.method369(2101593671))
					class649_sub1_sub4_sub2.method371(class167, 1867269829);
				class649_sub1_sub4 = class649_sub1_sub4_sub2;
			} else
				class649_sub1_sub4 = new Class649_Sub1_Sub4_Sub1(aClass553_5269, class167, aClass34_Sub17_10351, class612, i_121_, i_122_, i_123_, i_124_, i_125_, aBool5298, 0, 0, i, 4 + i_131_, i_119_, i_120_);
			aClass553_5269.method6710(i_121_, i_126_, i_127_, class649_sub1_sub4, null, 918798309);
			return true;
		}
		if (-723459231 * Class606.aClass606_7882.anInt7878 == i) {
			int i_132_ = i_118_ + 2 & 0x3;
			int i_133_ = 33;
			Interface59 interface59 = (Interface59) aClass553_5269.method6716(i_121_, i_126_, i_127_, -342954341);
			if (interface59 != null)
				i_133_ = (((Class612) (aClass34_Sub17_10351.method70(interface59.method373((byte) 26), (byte) -10))).anInt7963 * -624248411 / 2) + 1;
			Class649_Sub1_Sub4 class649_sub1_sub4;
			Class649_Sub1_Sub4 class649_sub1_sub4_134_;
			if (bool) {
				Class649_Sub1_Sub4_Sub2 class649_sub1_sub4_sub2 = (new Class649_Sub1_Sub4_Sub2(aClass553_5269, class167, aClass34_Sub17_10351, class612, i_121_, i_122_, i_123_, i_124_, i_125_, aBool5298, anIntArray10347[i_118_] * i_133_, anIntArray10340[i_118_] * i_133_, i, 4 + i_118_));
				Class649_Sub1_Sub4_Sub2 class649_sub1_sub4_sub2_135_ = new Class649_Sub1_Sub4_Sub2(aClass553_5269, class167, aClass34_Sub17_10351, class612, i_121_, i_122_, i_123_, i_124_, i_125_, aBool5298, 0, 0, i, 4 + i_132_);
				if (class649_sub1_sub4_sub2.method369(-555271798))
					class649_sub1_sub4_sub2.method371(class167, 1867269829);
				if (class649_sub1_sub4_sub2_135_.method369(1070241249))
					class649_sub1_sub4_sub2_135_.method371(class167, 1867269829);
				class649_sub1_sub4 = class649_sub1_sub4_sub2;
				class649_sub1_sub4_134_ = class649_sub1_sub4_sub2_135_;
			} else {
				Class649_Sub1_Sub4_Sub1 class649_sub1_sub4_sub1 = (new Class649_Sub1_Sub4_Sub1(aClass553_5269, class167, aClass34_Sub17_10351, class612, i_121_, i_122_, i_123_, i_124_, i_125_, aBool5298, anIntArray10347[i_118_] * i_133_, i_133_ * anIntArray10340[i_118_], i, 4 + i_118_, i_119_, i_120_));
				Class649_Sub1_Sub4_Sub1 class649_sub1_sub4_sub1_136_ = new Class649_Sub1_Sub4_Sub1(aClass553_5269, class167, aClass34_Sub17_10351, class612, i_121_, i_122_, i_123_, i_124_, i_125_, aBool5298, 0, 0, i, 4 + i_132_, i_119_, i_120_);
				class649_sub1_sub4 = class649_sub1_sub4_sub1;
				class649_sub1_sub4_134_ = class649_sub1_sub4_sub1_136_;
			}
			aClass553_5269.method6710(i_121_, i_126_, i_127_, class649_sub1_sub4, class649_sub1_sub4_134_, -621858913);
			return true;
		}
		return false;
	}

	void method9382(Class167 class167, int i, int i_137_, int i_138_, int i_139_, byte i_140_) {
		Interface59 interface59 = method9380(i, i_137_, i_138_, i_139_, -1689402463);
		if (null != interface59) {
			Class612 class612 = ((Class612) aClass34_Sub17_10351.method70(interface59.method373((byte) 24), (byte) 4));
			int i_141_ = interface59.method71(-220453165);
			int i_142_ = interface59.method367((byte) 62);
			if (class612.method7282((short) 255))
				Class499.method6025(i, i_138_, i_139_, class612, 557232053);
			if (interface59.method369(-647230952))
				interface59.method372(class167, -251236600);
			if (i_137_ == 0) {
				aClass553_5269.method6713(i, i_138_, i_139_, 1483808337);
				aClass553_5269.method6759(i, i_138_, i_139_, (byte) -24);
				if (1174186059 * class612.anInt7995 == 1) {
					if (0 == i_142_)
						aClass553_5269.aClass544_7426.method6602(1, i, i_138_, i_139_);
					else if (1 == i_142_)
						aClass553_5269.aClass544_7426.method6602(2, i, i_138_, 1 + i_139_);
					else if (i_142_ == 2)
						aClass553_5269.aClass544_7426.method6602(1, i, 1 + i_138_, i_139_);
					else if (3 == i_142_)
						aClass553_5269.aClass544_7426.method6602(2, i, i_138_, i_139_);
				}
			} else if (i_137_ == 1) {
				aClass553_5269.method6715(i, i_138_, i_139_, -1115960678);
				aClass553_5269.method6756(i, i_138_, i_139_, (byte) 2);
			} else if (2 == i_137_) {
				aClass553_5269.method6719(i, i_138_, i_139_, client.anInterface64_11113, 1487159517);
				if (i_141_ == -723459231 * Class606.aClass606_7873.anInt7878) {
					if (0 == (i_142_ & 0x1))
						aClass553_5269.aClass544_7426.method6602(8, i, i_138_, i_139_);
					else
						aClass553_5269.aClass544_7426.method6602(16, i, i_138_, i_139_);
				}
			} else if (i_137_ == 3)
				aClass553_5269.method6717(i, i_138_, i_139_, 466157698);
		}
	}

	public final void method9383(Class167 class167, boolean bool, int i) {
		aClass553_5269.method6727();
		if (!bool) {
			if (-1581600933 * anInt5241 > 1) {
				for (int i_143_ = 0; i_143_ < 312855363 * anInt5242; i_143_++) {
					for (int i_144_ = 0; i_144_ < -183622811 * anInt5284; i_144_++) {
						if (2 == ((aClass455_5232.aByteArrayArrayArray5154[1][i_143_][i_144_]) & 0x2))
							aClass553_5269.method6737(i_143_, i_144_, 1607642749);
					}
				}
			}
			for (int i_145_ = 0; i_145_ < anInt5241 * -1581600933; i_145_++) {
				for (int i_146_ = 0; i_146_ <= anInt5284 * -183622811; i_146_++) {
					for (int i_147_ = 0; i_147_ <= anInt5242 * 312855363; i_147_++) {
						if ((aByteArrayArrayArray5252[i_145_][i_147_][i_146_] & 0x4) != 0) {
							int i_148_ = i_147_;
							int i_149_ = i_147_;
							int i_150_ = i_146_;
							int i_151_;
							for (i_151_ = i_146_; (i_150_ > 0 && ((aByteArrayArrayArray5252[i_145_][i_147_][i_150_ - 1]) & 0x4) != 0 && i_151_ - i_150_ < 10); i_150_--) {
								/* empty */
							}
							for (/**/; (i_151_ < anInt5284 * -183622811 && ((aByteArrayArrayArray5252[i_145_][i_147_][1 + i_151_]) & 0x4) != 0 && i_151_ - i_150_ < 10); i_151_++) {
								/* empty */
							}
							while_21_: for (/**/; i_148_ > 0 && i_149_ - i_148_ < 10; i_148_--) {
								for (int i_152_ = i_150_; i_152_ <= i_151_; i_152_++) {
									if (0 == ((aByteArrayArrayArray5252[i_145_][i_148_ - 1][i_152_]) & 0x4))
										break while_21_;
								}
							}
							while_22_: for (/**/; (i_149_ < anInt5242 * 312855363 && i_149_ - i_148_ < 10); i_149_++) {
								for (int i_153_ = i_150_; i_153_ <= i_151_; i_153_++) {
									if (((aByteArrayArrayArray5252[i_145_][1 + i_149_][i_153_]) & 0x4) == 0)
										break while_22_;
								}
							}
							if ((i_149_ - i_148_ + 1) * (i_151_ - i_150_ + 1) >= 4) {
								int i_154_ = (anIntArrayArrayArray5245[i_145_][i_148_][i_150_]);
								aClass553_5269.aClass544_7426.method6585(4, i_145_, i_148_ << 9, (i_149_ << 9) + 512, i_150_ << 9, (i_151_ << 9) + 512, i_154_, i_154_);
								for (int i_155_ = i_148_; i_155_ <= i_149_; i_155_++) {
									for (int i_156_ = i_150_; i_156_ <= i_151_; i_156_++)
										aByteArrayArrayArray5252[i_145_][i_155_][i_156_] &= ~0x4;
								}
							}
						}
					}
				}
			}
			aClass553_5269.aClass544_7426.method6604();
		}
		aByteArrayArrayArray5252 = null;
	}

	public Class465_Sub1(Class553 class553, Class34_Sub17 class34_sub17, int i, int i_157_, int i_158_, boolean bool, Class455 class455, Class636 class636) {
		super(class553, i, i_157_, i_158_, bool, Class654.aClass34_Sub4_8494, Class279.aClass34_Sub3_3163, class455);
		aClass34_Sub17_10351 = class34_sub17;
		aClass636_10346 = class636;
	}

	public final void method9384(Class167 class167, byte[] is, int i, int i_159_, int i_160_) {
		RSByteBuffer class536_sub33 = new RSByteBuffer(is);
		int i_161_ = -1;
		for (;;) {
			int i_162_ = class536_sub33.readSmart(-1565976432);
			if (0 == i_162_)
				break;
			i_161_ += i_162_;
			int i_163_ = 0;
			for (;;) {
				int i_164_ = class536_sub33.readUnsignedSmart(1855240029);
				if (0 == i_164_)
					break;
				i_163_ += i_164_ - 1;
				int i_165_ = i_163_ & 0x3f;
				int i_166_ = i_163_ >> 6 & 0x3f;
				int i_167_ = i_163_ >> 12;
				int i_168_ = class536_sub33.readUnsignedByte(-11542989);
				int i_169_ = i_168_ >> 2;
				int i_170_ = i_168_ & 0x3;
				int i_171_ = i + i_166_;
				int i_172_ = i_159_ + i_165_;
				Class612 class612 = ((Class612) aClass34_Sub17_10351.method70(i_161_, (byte) 102));
				int i_173_;
				int i_174_;
				if ((i_170_ & 0x1) == 0) {
					i_173_ = -1981381335 * class612.anInt8002;
					i_174_ = class612.anInt7980 * -90266503;
				} else {
					i_173_ = class612.anInt7980 * -90266503;
					i_174_ = class612.anInt8002 * -1981381335;
				}
				int i_175_ = i_171_ + i_173_;
				int i_176_ = i_174_ + i_172_;
				if (i_171_ < anInt5242 * 312855363 && i_172_ < -183622811 * anInt5284 && i_175_ > 0 && i_176_ > 0 && ((Class606.aClass606_7880.anInt7878 * -723459231 == i_169_) || (Class606.aClass606_7894.anInt7878 * -723459231 == i_169_) || (i_171_ > 0 && i_172_ > 0 && i_171_ < anInt5242 * 312855363 - 1 && i_172_ < -183622811 * anInt5284 - 1)))
					method9379(class167, i_167_, i_167_, i_171_, i_172_, i_161_, i_170_, i_169_, -1, 0, -1551021022);
			}
		}
	}

	static {
		anIntArray10345 = new int[] { 1, 0, -1, 0 };
		anIntArray10350 = new int[] { 0, -1, 0, 1 };
		anIntArray10347 = new int[] { 1, -1, -1, 1 };
		anIntArray10340 = new int[] { -1, -1, 1, 1 };
	}

	boolean method9385(Class167 class167, int i, int i_177_, boolean bool, Class612 class612, int i_178_, int i_179_, int i_180_, int i_181_, int i_182_, int i_183_, int i_184_, int i_185_, int i_186_, boolean bool_187_, Class160 class160, int i_188_, int i_189_, int i_190_) {
		if (i == -723459231 * Class606.aClass606_7892.anInt7878) {
			int i_191_ = 1174186059 * class612.anInt7995;
			if (aBool10349 && -1 == 1174186059 * class612.anInt7995)
				i_191_ = 1;
			Class649_Sub1_Sub3 class649_sub1_sub3;
			if (bool) {
				Class649_Sub1_Sub3_Sub2 class649_sub1_sub3_sub2 = new Class649_Sub1_Sub3_Sub2(aClass553_5269, class167, aClass34_Sub17_10351, class612, i_180_, i_181_, i_182_, i_183_, i_184_, aBool5298, i, i_177_, bool_187_);
				if (class649_sub1_sub3_sub2.method369(1137570530))
					class649_sub1_sub3_sub2.method371(class167, 1867269829);
				class649_sub1_sub3 = class649_sub1_sub3_sub2;
			} else
				class649_sub1_sub3 = new Class649_Sub1_Sub3_Sub1(aClass553_5269, class167, aClass34_Sub17_10351, class612, i_180_, i_181_, i_182_, i_183_, i_184_, aBool5298, i, i_177_, i_178_, i_179_);
			aClass553_5269.method6760(i_180_, i_185_, i_186_, class649_sub1_sub3, null, 257676374);
			if (i_177_ == 0) {
				if (aBool5247 && class612.aBool7974) {
					class160.method1956(i_185_, i_186_, 50);
					class160.method1956(i_185_, 1 + i_186_, 50);
				}
				if (i_191_ == 1 && !aBool5298)
					aClass553_5269.aClass544_7426.method6583(1, i_180_, i_185_, i_186_, -1538387421 * class612.anInt7931, class612.anInt7950 * -249043103);
			} else if (1 == i_177_) {
				if (aBool5247 && class612.aBool7974) {
					class160.method1956(i_185_, i_186_ + 1, 50);
					class160.method1956(1 + i_185_, 1 + i_186_, 50);
				}
				if (i_191_ == 1 && !aBool5298)
					aClass553_5269.aClass544_7426.method6583(2, i_180_, i_185_, 1 + i_186_, -1538387421 * class612.anInt7931, -(-249043103 * class612.anInt7950));
			} else if (i_177_ == 2) {
				if (aBool5247 && class612.aBool7974) {
					class160.method1956(1 + i_185_, i_186_, 50);
					class160.method1956(1 + i_185_, 1 + i_186_, 50);
				}
				if (1 == i_191_ && !aBool5298)
					aClass553_5269.aClass544_7426.method6583(1, i_180_, 1 + i_185_, i_186_, class612.anInt7931 * -1538387421, -(class612.anInt7950 * -249043103));
			} else if (i_177_ == 3) {
				if (aBool5247 && class612.aBool7974) {
					class160.method1956(i_185_, i_186_, 50);
					class160.method1956(1 + i_185_, i_186_, 50);
				}
				if (i_191_ == 1 && !aBool5298)
					aClass553_5269.aClass544_7426.method6583(2, i_180_, i_185_, i_186_, class612.anInt7931 * -1538387421, -249043103 * class612.anInt7950);
			}
			if (-624248411 * class612.anInt7963 != 64)
				aClass553_5269.method6712(i_180_, i_185_, i_186_, class612.anInt7963 * -624248411, (byte) 121);
			return true;
		}
		if (i == Class606.aClass606_7874.anInt7878 * -723459231) {
			Class649_Sub1_Sub3 class649_sub1_sub3;
			if (bool) {
				Class649_Sub1_Sub3_Sub2 class649_sub1_sub3_sub2 = new Class649_Sub1_Sub3_Sub2(aClass553_5269, class167, aClass34_Sub17_10351, class612, i_180_, i_181_, i_182_, i_183_, i_184_, aBool5298, i, i_177_, bool_187_);
				if (class649_sub1_sub3_sub2.method369(549855266))
					class649_sub1_sub3_sub2.method371(class167, 1867269829);
				class649_sub1_sub3 = class649_sub1_sub3_sub2;
			} else
				class649_sub1_sub3 = new Class649_Sub1_Sub3_Sub1(aClass553_5269, class167, aClass34_Sub17_10351, class612, i_180_, i_181_, i_182_, i_183_, i_184_, aBool5298, i, i_177_, i_178_, i_179_);
			aClass553_5269.method6760(i_180_, i_185_, i_186_, class649_sub1_sub3, null, 257676374);
			if (class612.aBool7974 && aBool5247) {
				if (0 == i_177_)
					class160.method1956(i_185_, i_186_ + 1, 50);
				else if (i_177_ == 1)
					class160.method1956(1 + i_185_, i_186_ + 1, 50);
				else if (i_177_ == 2)
					class160.method1956(i_185_ + 1, i_186_, 50);
				else if (i_177_ == 3)
					class160.method1956(i_185_, i_186_, 50);
			}
			return true;
		}
		if (-723459231 * Class606.aClass606_7875.anInt7878 == i) {
			int i_192_ = i_177_ + 1 & 0x3;
			Class649_Sub1_Sub3 class649_sub1_sub3;
			Class649_Sub1_Sub3 class649_sub1_sub3_193_;
			if (bool) {
				Class649_Sub1_Sub3_Sub2 class649_sub1_sub3_sub2 = new Class649_Sub1_Sub3_Sub2(aClass553_5269, class167, aClass34_Sub17_10351, class612, i_180_, i_181_, i_182_, i_183_, i_184_, aBool5298, i, 4 + i_177_, bool_187_);
				Class649_Sub1_Sub3_Sub2 class649_sub1_sub3_sub2_194_ = new Class649_Sub1_Sub3_Sub2(aClass553_5269, class167, aClass34_Sub17_10351, class612, i_180_, i_181_, i_182_, i_183_, i_184_, aBool5298, i, i_192_, bool_187_);
				if (class649_sub1_sub3_sub2.method369(1267265018))
					class649_sub1_sub3_sub2.method371(class167, 1867269829);
				if (class649_sub1_sub3_sub2_194_.method369(-620792735))
					class649_sub1_sub3_sub2_194_.method371(class167, 1867269829);
				class649_sub1_sub3 = class649_sub1_sub3_sub2;
				class649_sub1_sub3_193_ = class649_sub1_sub3_sub2_194_;
			} else {
				class649_sub1_sub3 = new Class649_Sub1_Sub3_Sub1(aClass553_5269, class167, aClass34_Sub17_10351, class612, i_180_, i_181_, i_182_, i_183_, i_184_, aBool5298, i, 4 + i_177_, i_178_, i_179_);
				class649_sub1_sub3_193_ = new Class649_Sub1_Sub3_Sub1(aClass553_5269, class167, aClass34_Sub17_10351, class612, i_180_, i_181_, i_182_, i_183_, i_184_, aBool5298, i, i_192_, i_178_, i_179_);
			}
			aClass553_5269.method6760(i_180_, i_185_, i_186_, class649_sub1_sub3, class649_sub1_sub3_193_, 257676374);
			if ((class612.anInt7995 * 1174186059 == 1 || aBool10349 && 1174186059 * class612.anInt7995 == -1) && !aBool5298) {
				if (i_177_ == 0) {
					aClass553_5269.aClass544_7426.method6583(1, i_180_, i_185_, i_186_, -1538387421 * class612.anInt7931, class612.anInt7950 * -249043103);
					aClass553_5269.aClass544_7426.method6583(2, i_180_, i_185_, i_186_ + 1, class612.anInt7931 * -1538387421, class612.anInt7950 * -249043103);
				} else if (1 == i_177_) {
					aClass553_5269.aClass544_7426.method6583(1, i_180_, 1 + i_185_, i_186_, class612.anInt7931 * -1538387421, -249043103 * class612.anInt7950);
					aClass553_5269.aClass544_7426.method6583(2, i_180_, i_185_, i_186_ + 1, class612.anInt7931 * -1538387421, -249043103 * class612.anInt7950);
				} else if (2 == i_177_) {
					aClass553_5269.aClass544_7426.method6583(1, i_180_, i_185_ + 1, i_186_, -1538387421 * class612.anInt7931, -249043103 * class612.anInt7950);
					aClass553_5269.aClass544_7426.method6583(2, i_180_, i_185_, i_186_, class612.anInt7931 * -1538387421, -249043103 * class612.anInt7950);
				} else if (i_177_ == 3) {
					aClass553_5269.aClass544_7426.method6583(1, i_180_, i_185_, i_186_, class612.anInt7931 * -1538387421, class612.anInt7950 * -249043103);
					aClass553_5269.aClass544_7426.method6583(2, i_180_, i_185_, i_186_, class612.anInt7931 * -1538387421, -249043103 * class612.anInt7950);
				}
			}
			if (class612.anInt7963 * -624248411 != 64)
				aClass553_5269.method6712(i_180_, i_185_, i_186_, -624248411 * class612.anInt7963, (byte) 15);
			return true;
		}
		if (i == Class606.aClass606_7876.anInt7878 * -723459231) {
			Class649_Sub1_Sub3 class649_sub1_sub3;
			if (bool) {
				Class649_Sub1_Sub3_Sub2 class649_sub1_sub3_sub2 = new Class649_Sub1_Sub3_Sub2(aClass553_5269, class167, aClass34_Sub17_10351, class612, i_180_, i_181_, i_182_, i_183_, i_184_, aBool5298, i, i_177_, bool_187_);
				if (class649_sub1_sub3_sub2.method369(-189721065))
					class649_sub1_sub3_sub2.method371(class167, 1867269829);
				class649_sub1_sub3 = class649_sub1_sub3_sub2;
			} else
				class649_sub1_sub3 = new Class649_Sub1_Sub3_Sub1(aClass553_5269, class167, aClass34_Sub17_10351, class612, i_180_, i_181_, i_182_, i_183_, i_184_, aBool5298, i, i_177_, i_178_, i_179_);
			aClass553_5269.method6760(i_180_, i_185_, i_186_, class649_sub1_sub3, null, 257676374);
			if (class612.aBool7974 && aBool5247) {
				if (i_177_ == 0)
					class160.method1956(i_185_, i_186_ + 1, 50);
				else if (i_177_ == 1)
					class160.method1956(i_185_ + 1, i_186_ + 1, 50);
				else if (2 == i_177_)
					class160.method1956(i_185_ + 1, i_186_, 50);
				else if (i_177_ == 3)
					class160.method1956(i_185_, i_186_, 50);
			}
			return true;
		}
		if (i == -723459231 * Class606.aClass606_7873.anInt7878) {
			Class649_Sub1_Sub5 class649_sub1_sub5;
			if (bool) {
				Class649_Sub1_Sub5_Sub2 class649_sub1_sub5_sub2 = new Class649_Sub1_Sub5_Sub2(aClass553_5269, class167, aClass34_Sub17_10351, class612, i_180_, i_181_, i_182_, i_183_, i_184_, aBool5298, i_185_, i_185_, i_186_, i_186_, i, i_177_, bool_187_, true);
				if (class649_sub1_sub5_sub2.method369(-768910177))
					class649_sub1_sub5_sub2.method371(class167, 1867269829);
				class649_sub1_sub5 = class649_sub1_sub5_sub2;
			} else
				class649_sub1_sub5 = new Class649_Sub1_Sub5_Sub3(aClass553_5269, class167, aClass34_Sub17_10351, class612, i_180_, i_181_, i_182_, i_183_, i_184_, aBool5298, i_185_, i_185_ + i_188_ - 1, i_186_, i_186_ + i_189_ - 1, i, i_177_, i_178_, i_179_, true);
			aClass553_5269.method6711(class649_sub1_sub5, false, -766777484);
			if (1 == 1174186059 * class612.anInt7995 && !aBool5298) {
				int i_195_;
				if (0 == (i_177_ & 0x1))
					i_195_ = 8;
				else
					i_195_ = 16;
				aClass553_5269.aClass544_7426.method6583(i_195_, i_180_, i_185_, i_186_, (class612.anInt7931 * -1538387421), 0);
			}
			if (64 != -624248411 * class612.anInt7963)
				aClass553_5269.method6712(i_180_, i_185_, i_186_, class612.anInt7963 * -624248411, (byte) 20);
			return true;
		}
		return false;
	}

	public static void method9386(int i, int i_196_, byte i_197_) {
		Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.aClass414_4482, client.aClass106_11322.aClass15_1258, 1683364185);
		class536_sub23.aClass536_Sub33_Sub2_10528.writeShort(i_196_, -1778059594);
		class536_sub23.aClass536_Sub33_Sub2_10528.writeIntV2(i, (byte) -40);
		client.aClass106_11322.method1409(class536_sub23, 401806054);
	}

	static void method9387(int i) {
		Class648.aClass708_8457 = null;
		Class542_Sub1.anInt10700 = 0;
		Class542_Sub1.anInt7216 = 0;
		Class72.aClass251_801 = null;
		Class542_Sub1.method6533();
		Class542_Sub1.aClass708_7218.method8304(454036827);
		Class542_Sub1.aClass543_7192 = null;
		Class542_Sub1.aClass199_7166.method2884((byte) -58);
		Class542_Sub1.aClass199_7225.method2884((byte) -89);
		Class532.aClass143_7123 = null;
		Class542_Sub1.anInt10706 = 1619839959;
		Class542_Sub1.anInt10707 = 636642145;
		if (Class542_Sub1.aClass34_Sub8_7212 != null) {
			Class542_Sub1.aClass34_Sub8_7212.method809((byte) 35);
			Class542_Sub1.aClass34_Sub8_7212.method10330(128, 64, 470997635);
		}
		if (null != Class542_Sub1.aClass34_Sub1_7223)
			Class542_Sub1.aClass34_Sub1_7223.method10300(64, 64, (byte) -107);
		if (null != Class542_Sub1.aClass34_Sub17_7165)
			Class542_Sub1.aClass34_Sub17_7165.method805(256, -1849153434);
		Class56.aClass34_Sub14_608.method805(64, -959284190);
	}
}
