/* Class521_Sub2_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;

public class Class521_Sub2_Sub1_Sub1 extends Class521_Sub2_Sub1 {
	int anInt12059;
	short aShort12060;
	short aShort12061;
	short aShort12062;
	int anInt12063;
	short aShort12064;
	short aShort12065;
	short aShort12066;
	short aShort12067;
	Class615 aClass615_12068;

	void method10986() {
		aClass615_12068.aClass627_8035.aClass521_Sub2_Sub1_Sub1Array8170[aShort12060] = null;
		Class626.aClass521_Sub2_Sub1_Sub1Array8159[(Class626.anInt8156 * 1210271753)] = this;
		Class626.anInt8156 = (Class626.anInt8156 * 1210271753 + 1 & 0x3ff) * 578733625;
		method6354((byte) 72);
		method9336(418595084);
	}

	void method10987(Class615 class615, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, boolean bool, boolean bool_12_) {
		aClass615_12068 = class615;
		anInt11595 = i << 12;
		anInt11592 = i_0_ << 12;
		anInt11597 = i_1_ << 12;
		anInt11594 = i_7_;
		aShort12061 = aShort12064 = (short) i_6_;
		anInt11598 = i_8_;
		aShort11600 = (short) i_9_;
		aShort12062 = (short) i_10_;
		anInt11593 = i_11_;
		aBool11601 = bool_12_;
		aShort12065 = (short) i_2_;
		aShort12066 = (short) i_3_;
		aShort12067 = (short) i_4_;
		anInt12063 = i_5_;
		method10992();
	}

	void method10988(long l, int i) {
		aShort12064 -= i;
		if (aShort12064 <= 0)
			method10986();
		else {
			int i_13_ = anInt11595 >> 12;
			int i_14_ = anInt11592 >> 12;
			int i_15_ = anInt11597 >> 12;
			Class627 class627 = aClass615_12068.aClass627_8035;
			Class381 class381 = aClass615_12068.aClass381_8042;
			if (class381.anInt3963 * 1822753603 != 0) {
				if (aShort12061 - aShort12064 <= class381.anInt4000 * -641757895) {
					int i_16_ = ((anInt11594 >> 8 & 0xff00) + (anInt12059 >> 16 & 0xff) + class381.anInt4002 * -445812521 * i);
					int i_17_ = ((anInt11594 & 0xff00) + (anInt12059 >> 8 & 0xff) + class381.anInt4003 * -1367093911 * i);
					int i_18_ = ((anInt11594 << 8 & 0xff00) + (anInt12059 & 0xff) + class381.anInt4004 * 27445515 * i);
					if (i_16_ < 0)
						i_16_ = 0;
					else if (i_16_ > 65535)
						i_16_ = 65535;
					if (i_17_ < 0)
						i_17_ = 0;
					else if (i_17_ > 65535)
						i_17_ = 65535;
					if (i_18_ < 0)
						i_18_ = 0;
					else if (i_18_ > 65535)
						i_18_ = 65535;
					anInt11594 &= ~0xffffff;
					anInt11594 |= (((i_16_ & 0xff00) << 8) + (i_17_ & 0xff00) + ((i_18_ & 0xff00) >> 8));
					anInt12059 &= ~0xffffff;
					anInt12059 |= (((i_16_ & 0xff) << 16) + ((i_17_ & 0xff) << 8) + (i_18_ & 0xff));
				}
				if (aShort12061 - aShort12064 <= class381.anInt4001 * 1872154035) {
					int i_19_ = ((anInt11594 >> 16 & 0xff00) + (anInt12059 >> 24 & 0xff) + class381.anInt3954 * -1366619149 * i);
					if (i_19_ < 0)
						i_19_ = 0;
					else if (i_19_ > 65535)
						i_19_ = 65535;
					anInt11594 &= 0xffffff;
					anInt11594 |= (i_19_ & 0xff00) << 16;
					anInt12059 &= 0xffffff;
					anInt12059 |= (i_19_ & 0xff) << 24;
				}
			}
			if (class381.anInt3945 * 1138579875 != -1 && (aShort12061 - aShort12064 <= class381.anInt3992 * -1771268887))
				anInt12063 += class381.anInt3948 * -435932353 * i;
			if (class381.anInt3960 * 896066133 != -1 && (aShort12061 - aShort12064 <= class381.anInt3956 * 2031240905))
				anInt11598 += class381.anInt4009 * -373509509 * i;
			if (aShort12062 != 0)
				aShort11600 = (short) (aShort11600 + aShort12062 * i & 0x3fff);
			double d = (double) aShort12065;
			double d_20_ = (double) aShort12066;
			double d_21_ = (double) aShort12067;
			boolean bool = false;
			if (class381.anInt3943 * 1260269875 == 1) {
				int i_22_ = i_13_ - (aClass615_12068.aClass616_8041.anInt8061 * -1837432399);
				int i_23_ = i_14_ - (aClass615_12068.aClass616_8041.anInt8062 * -725078749);
				int i_24_ = i_15_ - (aClass615_12068.aClass616_8041.anInt8052 * -1458391911);
				int i_25_ = ((int) Math.sqrt((double) (i_22_ * i_22_ + i_23_ * i_23_ + i_24_ * i_24_)) >> 2);
				long l_26_ = (long) (class381.anInt3983 * 570010113 * i_25_ * i);
				anInt12063 -= (long) anInt12063 * l_26_ >> 18;
			} else if (class381.anInt3943 * 1260269875 == 2) {
				int i_27_ = i_13_ - (aClass615_12068.aClass616_8041.anInt8061 * -1837432399);
				int i_28_ = i_14_ - (aClass615_12068.aClass616_8041.anInt8062 * -725078749);
				int i_29_ = i_15_ - (aClass615_12068.aClass616_8041.anInt8052 * -1458391911);
				int i_30_ = i_27_ * i_27_ + i_28_ * i_28_ + i_29_ * i_29_;
				long l_31_ = (long) (class381.anInt3983 * 570010113 * i_30_ * i);
				anInt12063 -= (long) anInt12063 * l_31_ >> 28;
			}
			if (class381.anIntArray3986 != null) {
				Iterator iterator = class627.aList8176.iterator();
				while (iterator.hasNext()) {
					Class536_Sub37 class536_sub37 = (Class536_Sub37) iterator.next();
					Class393 class393 = class536_sub37.aClass393_10636;
					if (class393.anInt4087 * -1267717877 != 1) {
						boolean bool_32_ = false;
						for (int i_33_ = 0; i_33_ < class381.anIntArray3986.length; i_33_++) {
							if (class381.anIntArray3986[i_33_] == class393.anInt4093 * -653323899) {
								bool_32_ = true;
								break;
							}
						}
						if (bool_32_) {
							double d_34_ = (double) (i_13_ - (class536_sub37.anInt10640 * -92533437));
							double d_35_ = (double) (i_14_ - (class536_sub37.anInt10638 * -1216495629));
							double d_36_ = (double) (i_15_ - (class536_sub37.anInt10635 * -110018465));
							double d_37_ = (d_34_ * d_34_ + d_35_ * d_35_ + d_36_ * d_36_);
							if (!(d_37_ > (double) (class393.aLong4094 * -6034776430763066571L))) {
								double d_38_ = Math.sqrt(d_37_);
								if (d_38_ == 0.0)
									d_38_ = 1.0;
								double d_39_ = (((d_34_ * (double) class536_sub37.aFloat10637) + d_35_ * (double) (class393.anInt4086 * -1979287149) + d_36_ * (double) (class536_sub37.aFloat10639)) * 65535.0 / ((double) (class393.anInt4090 * 1931706495) * d_38_));
								if (!(d_39_ < (double) (class393.anInt4095 * -732907403))) {
									double d_40_ = 0.0;
									if (class393.anInt4080 * 1800789899 == 1)
										d_40_ = (d_38_ / 16.0 * (double) (class393.anInt4089 * -223075411));
									else if (class393.anInt4080 * 1800789899 == 2)
										d_40_ = (d_38_ / 16.0 * (d_38_ / 16.0) * (double) (class393.anInt4089 * -223075411));
									if (class393.anInt4091 * 1933310827 == 0) {
										if (class393.anInt4092 * 1933185157 == 0) {
											d += ((double) (class536_sub37.aFloat10637) - d_40_) * (double) i;
											d_20_ += ((double) ((class393.anInt4086) * -1979287149) - d_40_) * (double) i;
											d_21_ += ((double) (class536_sub37.aFloat10639) - d_40_) * (double) i;
											bool = true;
										} else {
											anInt11595 += ((double) (class536_sub37.aFloat10637) - d_40_) * (double) i;
											anInt11592 += ((double) ((class393.anInt4086) * -1979287149) - d_40_) * (double) i;
											anInt11597 += ((double) (class536_sub37.aFloat10639) - d_40_) * (double) i;
										}
									} else {
										double d_41_ = (d_34_ / d_38_ * (double) (class393.anInt4090 * 1931706495));
										double d_42_ = (d_35_ / d_38_ * (double) (class393.anInt4090 * 1931706495));
										double d_43_ = (d_36_ / d_38_ * (double) (class393.anInt4090 * 1931706495));
										if (class393.anInt4092 * 1933185157 == 0) {
											d += d_41_ * (double) i;
											d_20_ += d_42_ * (double) i;
											d_21_ += d_43_ * (double) i;
											bool = true;
										} else {
											anInt11595 += d_41_ * (double) i;
											anInt11592 += d_42_ * (double) i;
											anInt11597 += d_43_ * (double) i;
										}
									}
								}
							}
						}
					}
				}
			}
			if (class381.anIntArray4005 != null) {
				for (int i_44_ = 0; i_44_ < class381.anIntArray4005.length; i_44_++) {
					Class536_Sub37 class536_sub37 = ((Class536_Sub37) (Class626.aClass4_8165.method556((long) class381.anIntArray4005[i_44_])));
					while (class536_sub37 != null) {
						Class393 class393 = class536_sub37.aClass393_10636;
						double d_45_ = (double) (i_13_ - (class536_sub37.anInt10640 * -92533437));
						double d_46_ = (double) (i_14_ - (class536_sub37.anInt10638 * -1216495629));
						double d_47_ = (double) (i_15_ - (class536_sub37.anInt10635 * -110018465));
						double d_48_ = d_45_ * d_45_ + d_46_ * d_46_ + d_47_ * d_47_;
						if (d_48_ > (double) (class393.aLong4094 * -6034776430763066571L))
							class536_sub37 = (Class536_Sub37) Class626.aClass4_8165.method557(-864752846);
						else {
							double d_49_ = Math.sqrt(d_48_);
							if (d_49_ == 0.0)
								d_49_ = 1.0;
							if (class393.anInt4084 * 1990225913 > 0 && class393.anInt4084 * 1990225913 < 2047) {
								double d_50_ = (((d_45_ * (double) class536_sub37.aFloat10637) + d_46_ * (double) (class393.anInt4086 * -1979287149) + d_47_ * (double) (class536_sub37.aFloat10639)) * 16384.0 / ((double) (class393.anInt4090 * 1931706495) * d_49_));
								if (d_50_ < (double) (class393.anInt4095 * -732907403)) {
									class536_sub37 = ((Class536_Sub37) Class626.aClass4_8165.method557(-2072215600));
									continue;
								}
							}
							double d_51_ = 0.0;
							if (class393.anInt4080 * 1800789899 == 1)
								d_51_ = (d_49_ / 16.0 * (double) (class393.anInt4089 * -223075411));
							else if (class393.anInt4080 * 1800789899 == 2)
								d_51_ = (d_49_ / 16.0 * (d_49_ / 16.0) * (double) (class393.anInt4089 * -223075411));
							if (class393.anInt4091 * 1933310827 == 0) {
								if (class393.anInt4092 * 1933185157 == 0) {
									d += ((double) class536_sub37.aFloat10637 - d_51_) * (double) i;
									d_20_ += ((double) (class393.anInt4086 * -1979287149) - d_51_) * (double) i;
									d_21_ += ((double) class536_sub37.aFloat10639 - d_51_) * (double) i;
									bool = true;
								} else {
									anInt11595 += ((double) class536_sub37.aFloat10637 - d_51_) * (double) i;
									anInt11592 += ((double) (class393.anInt4086 * -1979287149) - d_51_) * (double) i;
									anInt11597 += ((double) class536_sub37.aFloat10639 - d_51_) * (double) i;
								}
							} else {
								double d_52_ = (d_45_ / d_49_ * (double) (class393.anInt4090 * 1931706495));
								double d_53_ = (d_46_ / d_49_ * (double) (class393.anInt4090 * 1931706495));
								double d_54_ = (d_47_ / d_49_ * (double) (class393.anInt4090 * 1931706495));
								if (class393.anInt4092 * 1933185157 == 0) {
									d += d_52_ * (double) i;
									d_20_ += d_53_ * (double) i;
									d_21_ += d_54_ * (double) i;
									bool = true;
								} else {
									anInt11595 += d_52_ * (double) i;
									anInt11592 += d_53_ * (double) i;
									anInt11597 += d_54_ * (double) i;
								}
							}
							class536_sub37 = (Class536_Sub37) Class626.aClass4_8165.method557(-2104340910);
						}
					}
				}
			}
			if (class381.anIntArray3964 != null) {
				if (class381.anIntArray3950 == null) {
					class381.anIntArray3950 = new int[class381.anIntArray3964.length];
					for (int i_55_ = 0; i_55_ < class381.anIntArray3964.length; i_55_++) {
						Class532.anInterface46_7121.method333((class381.anIntArray3964[i_55_]), 1989047909);
						class381.anIntArray3950[i_55_] = Class595.method7133((class381.anIntArray3964[i_55_]), 696545470);
					}
				}
				for (int i_56_ = 0; i_56_ < class381.anIntArray3950.length; i_56_++) {
					Class393 class393 = (Class626.aClass393Array8163[class381.anIntArray3950[i_56_]]);
					if (class393.anInt4092 * 1933185157 == 0) {
						d += (double) (class393.anInt4085 * 255434317 * i);
						d_20_ += (double) (class393.anInt4086 * -1979287149 * i);
						d_21_ += (double) (class393.anInt4073 * 23474543 * i);
						bool = true;
					} else {
						anInt11595 += class393.anInt4085 * 255434317 * i;
						anInt11592 += class393.anInt4086 * -1979287149 * i;
						anInt11597 += class393.anInt4073 * 23474543 * i;
					}
				}
			}
			if (bool) {
				while (d > 32767.0 || d_20_ > 32767.0 || d_21_ > 32767.0 || d < -32767.0 || d_20_ < -32767.0 || d_21_ < -32767.0) {
					d /= 2.0;
					d_20_ /= 2.0;
					d_21_ /= 2.0;
					anInt12063 <<= 1;
				}
				aShort12065 = (short) (int) d;
				aShort12066 = (short) (int) d_20_;
				aShort12067 = (short) (int) d_21_;
			}
			anInt11595 += ((long) aShort12065 * (long) (anInt12063 << 2) >> 23) * (long) i;
			anInt11592 += ((long) aShort12066 * (long) (anInt12063 << 2) >> 23) * (long) i;
			anInt11597 += ((long) aShort12067 * (long) (anInt12063 << 2) >> 23) * (long) i;
		}
	}

	void method10989(Class553 class553, GraphicalRenderer class167, long l) {
		int i = anInt11595 >> 12 + class553.anInt7444 * 1893698405;
		int i_57_ = anInt11597 >> 12 + class553.anInt7444 * 1893698405;
		int i_58_ = anInt11592 >> 12;
		if (i_58_ > 262144 || i_58_ < -262144 || i < 0 || i >= class553.anInt7428 * 937313339 || i_57_ < 0 || i_57_ >= class553.anInt7464 * 1965060689)
			method10986();
		else {
			Class627 class627 = aClass615_12068.aClass627_8035;
			Class381 class381 = aClass615_12068.aClass381_8042;
			Class160[] class160s = class553.aClass160Array7431;
			int i_59_ = class627.anInt8177;
			Class556 class556 = (class553.aClass556ArrayArrayArray7430[class627.anInt8177][i][i_57_]);
			if (class556 != null)
				i_59_ = class556.aByte7508;
			int i_60_ = class160s[i_59_].method1927(i, i_57_, -1624268719);
			int i_61_;
			if (i_59_ < class553.anInt7427 * 1091122111 - 1)
				i_61_ = class160s[i_59_ + 1].method1927(i, i_57_, -1948064068);
			else
				i_61_ = i_60_ - (8 << class553.anInt7444 * 1893698405);
			if (class381.aBool3987) {
				if (class381.anInt3967 * -687424059 == -1 && i_58_ > i_60_) {
					method10986();
					return;
				}
				if (class381.anInt3967 * -687424059 >= 0 && i_58_ > class160s[class381.anInt3967 * -687424059].method1927(i, i_57_, -856686131)) {
					method10986();
					return;
				}
				if (class381.anInt3968 * -1954041259 == -1 && i_58_ < i_61_) {
					method10986();
					return;
				}
				if (class381.anInt3968 * -1954041259 >= 0 && i_58_ < class160s[class381.anInt3968 * -1954041259 + 1].method1927(i, i_57_, 1531638767)) {
					method10986();
					return;
				}
			}
			int i_62_;
			for (i_62_ = class553.anInt7427 * 1091122111 - 1; i_62_ > 0 && i_58_ > class160s[i_62_].method1927(i, i_57_, -1019228622); i_62_--) {
				/* empty */
			}
			if (class381.aBool3990 && i_62_ == 0 && i_58_ > class160s[0].method1927(i, i_57_, -255272422))
				method10986();
			else if (i_62_ == class553.anInt7427 * 1091122111 - 1 && (class160s[i_62_].method1927(i, i_57_, 1203255412) - i_58_) > 8 << class553.anInt7444 * 1893698405)
				method10986();
			else {
				class556 = class553.aClass556ArrayArrayArray7430[i_62_][i][i_57_];
				if (class556 == null) {
					if (i_62_ == 0 || (class553.aClass556ArrayArrayArray7430[0][i][i_57_] == null))
						class556 = class553.aClass556ArrayArrayArray7430[0][i][i_57_] = new Class556(0);
					boolean bool = ((class553.aClass556ArrayArrayArray7430[0][i][i_57_].aClass556_7498) != null);
					if (i_62_ == 3 && bool)
						i_62_--;
					for (int i_63_ = 1; i_63_ <= i_62_; i_63_++) {
						if ((class553.aClass556ArrayArrayArray7430[i_63_][i][i_57_]) == null) {
							class556 = class553.aClass556ArrayArrayArray7430[i_63_][i][i_57_] = new Class556(i_63_);
							if (bool)
								class556.aByte7508++;
						}
					}
					if (class556 == null)
						class556 = (class553.aClass556ArrayArrayArray7430[i_62_][i][i_57_]);
				}
				if (class381.aBool3984) {
					int i_64_ = anInt11595 >> 12;
					int i_65_ = anInt11597 >> 12;
					if (class556.aClass649_Sub1_Sub3_7499 != null) {
						Class559 class559 = class556.aClass649_Sub1_Sub3_7499.method9946(class167, 71332801);
						if (class559 != null && class559.method6820(i_64_, i_58_, i_65_)) {
							method10986();
							return;
						}
					}
					if (class556.aClass649_Sub1_Sub3_7500 != null) {
						Class559 class559 = class556.aClass649_Sub1_Sub3_7500.method9946(class167, 71332801);
						if (class559 != null && class559.method6820(i_64_, i_58_, i_65_)) {
							method10986();
							return;
						}
					}
					if (class556.aClass649_Sub1_Sub2_7503 != null) {
						Class559 class559 = class556.aClass649_Sub1_Sub2_7503.method9946(class167, 71332801);
						if (class559 != null && class559.method6820(i_64_, i_58_, i_65_)) {
							method10986();
							return;
						}
					}
					for (Class552 class552 = class556.aClass552_7497; class552 != null; class552 = class552.aClass552_7414) {
						Class559 class559 = class552.aClass649_Sub1_Sub5_7415.method9946(class167, 71332801);
						if (class559 != null && class559.method6820(i_64_, i_58_, i_65_)) {
							method10986();
							return;
						}
					}
				}
				class627.aClass166_8180.aClass703_1841.method8255(this, 2000191264);
			}
		}
	}

	void method10990() {
		aClass615_12068.aClass627_8035.aClass521_Sub2_Sub1_Sub1Array8170[aShort12060] = null;
		Class626.aClass521_Sub2_Sub1_Sub1Array8159[(Class626.anInt8156 * 1210271753)] = this;
		Class626.anInt8156 = (Class626.anInt8156 * 1210271753 + 1 & 0x3ff) * 578733625;
		method6354((byte) -37);
		method9336(-545548110);
	}

	void method10991() {
		int i = aClass615_12068.aClass627_8035.anInt8171;
		if (aClass615_12068.aClass627_8035.aClass521_Sub2_Sub1_Sub1Array8170[i] != null)
			aClass615_12068.aClass627_8035.aClass521_Sub2_Sub1_Sub1Array8170[i].method10986();
		aClass615_12068.aClass627_8035.aClass521_Sub2_Sub1_Sub1Array8170[i] = this;
		aShort12060 = (short) aClass615_12068.aClass627_8035.anInt8171;
		aClass615_12068.aClass627_8035.anInt8171 = i + 1 & 0x1fff;
		aClass615_12068.aClass695_8050.method8217(this, -1013163869);
	}

	Class521_Sub2_Sub1_Sub1(Class615 class615, int i, int i_66_, int i_67_, int i_68_, int i_69_, int i_70_, int i_71_, int i_72_, int i_73_, int i_74_, int i_75_, int i_76_, int i_77_, boolean bool, boolean bool_78_) {
		aClass615_12068 = class615;
		anInt11595 = i << 12;
		anInt11592 = i_66_ << 12;
		anInt11597 = i_67_ << 12;
		anInt11594 = i_73_;
		aShort12061 = aShort12064 = (short) i_72_;
		anInt11598 = i_74_;
		aShort11600 = (short) i_75_;
		aShort12062 = (short) i_76_;
		anInt11593 = i_77_;
		aBool11601 = bool_78_;
		aShort12065 = (short) i_68_;
		aShort12066 = (short) i_69_;
		aShort12067 = (short) i_70_;
		anInt12063 = i_71_;
		method10992();
	}

	void method10992() {
		int i = aClass615_12068.aClass627_8035.anInt8171;
		if (aClass615_12068.aClass627_8035.aClass521_Sub2_Sub1_Sub1Array8170[i] != null)
			aClass615_12068.aClass627_8035.aClass521_Sub2_Sub1_Sub1Array8170[i].method10986();
		aClass615_12068.aClass627_8035.aClass521_Sub2_Sub1_Sub1Array8170[i] = this;
		aShort12060 = (short) aClass615_12068.aClass627_8035.anInt8171;
		aClass615_12068.aClass627_8035.anInt8171 = i + 1 & 0x1fff;
		aClass615_12068.aClass695_8050.method8217(this, 1947787081);
	}

	void method10993() {
		aClass615_12068.aClass627_8035.aClass521_Sub2_Sub1_Sub1Array8170[aShort12060] = null;
		Class626.aClass521_Sub2_Sub1_Sub1Array8159[(Class626.anInt8156 * 1210271753)] = this;
		Class626.anInt8156 = (Class626.anInt8156 * 1210271753 + 1 & 0x3ff) * 578733625;
		method6354((byte) -45);
		method9336(10418796);
	}

	void method10994() {
		aClass615_12068.aClass627_8035.aClass521_Sub2_Sub1_Sub1Array8170[aShort12060] = null;
		Class626.aClass521_Sub2_Sub1_Sub1Array8159[(Class626.anInt8156 * 1210271753)] = this;
		Class626.anInt8156 = (Class626.anInt8156 * 1210271753 + 1 & 0x3ff) * 578733625;
		method6354((byte) -82);
		method9336(-774328690);
	}

	void method10995() {
		aClass615_12068.aClass627_8035.aClass521_Sub2_Sub1_Sub1Array8170[aShort12060] = null;
		Class626.aClass521_Sub2_Sub1_Sub1Array8159[(Class626.anInt8156 * 1210271753)] = this;
		Class626.anInt8156 = (Class626.anInt8156 * 1210271753 + 1 & 0x3ff) * 578733625;
		method6354((byte) -27);
		method9336(95437031);
	}
}
