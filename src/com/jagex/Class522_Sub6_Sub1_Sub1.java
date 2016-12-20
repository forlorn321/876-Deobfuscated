/* Class522_Sub6_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;

public class Class522_Sub6_Sub1_Sub1 extends Class522_Sub6_Sub1 {
	short aShort12097;
	int anInt12098;
	short aShort12099;
	short aShort12100;
	short aShort12101;
	int anInt12102;
	short aShort12103;
	Class625 aClass625_12104;
	short aShort12105;
	short aShort12106;

	void method18768(Class625 class625, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, boolean bool, boolean bool_12_) {
		aClass625_12104 = class625;
		anInt11411 = i << 12;
		anInt11407 = i_0_ << 12;
		anInt11403 = i_1_ << 12;
		anInt11409 = i_7_;
		aShort12099 = aShort12100 = (short) i_6_;
		anInt11408 = i_8_;
		aShort11406 = (short) i_9_;
		aShort12106 = (short) i_10_;
		anInt11410 = i_11_;
		aBool11412 = bool_12_;
		aShort12101 = (short) i_2_;
		aShort12105 = (short) i_3_;
		aShort12097 = (short) i_4_;
		anInt12102 = i_5_;
		method18769();
	}

	Class522_Sub6_Sub1_Sub1(Class625 class625, int i, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_, boolean bool, boolean bool_25_) {
		aClass625_12104 = class625;
		anInt11411 = i << 12;
		anInt11407 = i_13_ << 12;
		anInt11403 = i_14_ << 12;
		anInt11409 = i_20_;
		aShort12099 = aShort12100 = (short) i_19_;
		anInt11408 = i_21_;
		aShort11406 = (short) i_22_;
		aShort12106 = (short) i_23_;
		anInt11410 = i_24_;
		aBool11412 = bool_25_;
		aShort12101 = (short) i_15_;
		aShort12105 = (short) i_16_;
		aShort12097 = (short) i_17_;
		anInt12102 = i_18_;
		method18769();
	}

	void method18769() {
		int i = aClass625_12104.aClass613_8162.anInt8020;
		if (aClass625_12104.aClass613_8162.aClass522_Sub6_Sub1_Sub1Array8019[i] != null)
			aClass625_12104.aClass613_8162.aClass522_Sub6_Sub1_Sub1Array8019[i].method18772();
		aClass625_12104.aClass613_8162.aClass522_Sub6_Sub1_Sub1Array8019[i] = this;
		aShort12103 = (short) aClass625_12104.aClass613_8162.anInt8020;
		aClass625_12104.aClass613_8162.anInt8020 = i + 1 & 0x1fff;
		aClass625_12104.aClass705_8164.method14322(this, -2146801722);
	}

	void method18770(Class625 class625, int i, int i_26_, int i_27_, int i_28_, int i_29_, int i_30_, int i_31_, int i_32_, int i_33_, int i_34_, int i_35_, int i_36_, int i_37_, boolean bool, boolean bool_38_) {
		aClass625_12104 = class625;
		anInt11411 = i << 12;
		anInt11407 = i_26_ << 12;
		anInt11403 = i_27_ << 12;
		anInt11409 = i_33_;
		aShort12099 = aShort12100 = (short) i_32_;
		anInt11408 = i_34_;
		aShort11406 = (short) i_35_;
		aShort12106 = (short) i_36_;
		anInt11410 = i_37_;
		aBool11412 = bool_38_;
		aShort12101 = (short) i_28_;
		aShort12105 = (short) i_29_;
		aShort12097 = (short) i_30_;
		anInt12102 = i_31_;
		method18769();
	}

	void method18771(long l, int i) {
		aShort12100 -= i;
		if (aShort12100 <= 0)
			method18772();
		else {
			int i_39_ = anInt11411 >> 12;
			int i_40_ = anInt11407 >> 12;
			int i_41_ = anInt11403 >> 12;
			Class613 class613 = aClass625_12104.aClass613_8162;
			Class394 class394 = aClass625_12104.aClass394_8161;
			if (class394.anInt4046 * -1101457493 != 0) {
				if (aShort12099 - aShort12100 <= class394.anInt4092 * -1922742603) {
					int i_42_ = ((anInt11409 >> 8 & 0xff00) + (anInt12098 >> 16 & 0xff) + class394.anInt4094 * -1945858331 * i);
					int i_43_ = ((anInt11409 & 0xff00) + (anInt12098 >> 8 & 0xff) + class394.anInt4095 * -970995397 * i);
					int i_44_ = ((anInt11409 << 8 & 0xff00) + (anInt12098 & 0xff) + class394.anInt4033 * -275224631 * i);
					if (i_42_ < 0)
						i_42_ = 0;
					else if (i_42_ > 65535)
						i_42_ = 65535;
					if (i_43_ < 0)
						i_43_ = 0;
					else if (i_43_ > 65535)
						i_43_ = 65535;
					if (i_44_ < 0)
						i_44_ = 0;
					else if (i_44_ > 65535)
						i_44_ = 65535;
					anInt11409 &= ~0xffffff;
					anInt11409 |= (((i_42_ & 0xff00) << 8) + (i_43_ & 0xff00) + ((i_44_ & 0xff00) >> 8));
					anInt12098 &= ~0xffffff;
					anInt12098 |= (((i_42_ & 0xff) << 16) + ((i_43_ & 0xff) << 8) + (i_44_ & 0xff));
				}
				if (aShort12099 - aShort12100 <= class394.anInt4044 * -1220364939) {
					int i_45_ = ((anInt11409 >> 16 & 0xff00) + (anInt12098 >> 24 & 0xff) + class394.anInt4097 * -225302941 * i);
					if (i_45_ < 0)
						i_45_ = 0;
					else if (i_45_ > 65535)
						i_45_ = 65535;
					anInt11409 &= 0xffffff;
					anInt11409 |= (i_45_ & 0xff00) << 16;
					anInt12098 &= 0xffffff;
					anInt12098 |= (i_45_ & 0xff) << 24;
				}
			}
			if (class394.anInt4037 * 1890005425 != -1 && (aShort12099 - aShort12100 <= class394.anInt4053 * -1851826327))
				anInt12102 += class394.anInt4099 * 1456449847 * i;
			if (class394.anInt4041 * -604729857 != -1 && (aShort12099 - aShort12100 <= class394.anInt4047 * -1387176747))
				anInt11408 += class394.anInt4043 * -1337468103 * i;
			if (aShort12106 != 0)
				aShort11406 = (short) (aShort11406 + aShort12106 * i & 0x3fff);
			double d = (double) aShort12101;
			double d_46_ = (double) aShort12105;
			double d_47_ = (double) aShort12097;
			boolean bool = false;
			if (class394.anInt4035 * -408655039 == 1) {
				int i_48_ = i_39_ - (aClass625_12104.aClass629_8168.anInt8209 * -2123172549);
				int i_49_ = i_40_ - (aClass625_12104.aClass629_8168.anInt8213 * 1537223537);
				int i_50_ = i_41_ - (aClass625_12104.aClass629_8168.anInt8216 * 1388892867);
				int i_51_ = ((int) Math.sqrt((double) (i_48_ * i_48_ + i_49_ * i_49_ + i_50_ * i_50_)) >> 2);
				long l_52_ = (long) (class394.anInt4067 * -384613525 * i_51_ * i);
				anInt12102 -= (long) anInt12102 * l_52_ >> 18;
			} else if (class394.anInt4035 * -408655039 == 2) {
				int i_53_ = i_39_ - (aClass625_12104.aClass629_8168.anInt8209 * -2123172549);
				int i_54_ = i_40_ - (aClass625_12104.aClass629_8168.anInt8213 * 1537223537);
				int i_55_ = i_41_ - (aClass625_12104.aClass629_8168.anInt8216 * 1388892867);
				int i_56_ = i_53_ * i_53_ + i_54_ * i_54_ + i_55_ * i_55_;
				long l_57_ = (long) (class394.anInt4067 * -384613525 * i_56_ * i);
				anInt12102 -= (long) anInt12102 * l_57_ >> 28;
			}
			if (class394.anIntArray4054 != null) {
				Iterator iterator = class613.aList8031.iterator();
				while (iterator.hasNext()) {
					Class527_Sub42 class527_sub42 = (Class527_Sub42) iterator.next();
					Class388 class388 = class527_sub42.aClass388_10756;
					if (class388.anInt3977 * -2028046375 != 1) {
						boolean bool_58_ = false;
						for (int i_59_ = 0; i_59_ < class394.anIntArray4054.length; i_59_++) {
							if (class394.anIntArray4054[i_59_] == class388.anInt3975 * -651983491) {
								bool_58_ = true;
								break;
							}
						}
						if (bool_58_) {
							double d_60_ = (double) (i_39_ - (class527_sub42.anInt10762 * 1010406053));
							double d_61_ = (double) (i_40_ - (class527_sub42.anInt10759 * 580171837));
							double d_62_ = (double) (i_41_ - (class527_sub42.anInt10760 * -1461282323));
							double d_63_ = (d_60_ * d_60_ + d_61_ * d_61_ + d_62_ * d_62_);
							if (!(d_63_ > (double) (class388.aLong3988 * -4305845978282173361L))) {
								double d_64_ = Math.sqrt(d_63_);
								if (d_64_ == 0.0)
									d_64_ = 1.0;
								double d_65_ = (((d_60_ * (double) class527_sub42.aFloat10761) + d_61_ * (double) (class388.anInt3979 * -250364785) + d_62_ * (double) (class527_sub42.aFloat10757)) * 65535.0 / ((double) (class388.anInt3986 * 11450881) * d_64_));
								if (!(d_65_ < (double) (class388.anInt3966 * -371972735))) {
									double d_66_ = 0.0;
									if (class388.anInt3978 * -2025935055 == 1)
										d_66_ = (d_64_ / 16.0 * (double) (class388.anInt3982 * 1546532627));
									else if (class388.anInt3978 * -2025935055 == 2)
										d_66_ = (d_64_ / 16.0 * (d_64_ / 16.0) * (double) (class388.anInt3982 * 1546532627));
									if (class388.anInt3984 * 783781019 == 0) {
										if (class388.anInt3983 * -1335341193 == 0) {
											d += ((double) (class527_sub42.aFloat10761) - d_66_) * (double) i;
											d_46_ += ((double) ((class388.anInt3979) * -250364785) - d_66_) * (double) i;
											d_47_ += ((double) (class527_sub42.aFloat10757) - d_66_) * (double) i;
											bool = true;
										} else {
											anInt11411 += ((double) (class527_sub42.aFloat10761) - d_66_) * (double) i;
											anInt11407 += ((double) ((class388.anInt3979) * -250364785) - d_66_) * (double) i;
											anInt11403 += ((double) (class527_sub42.aFloat10757) - d_66_) * (double) i;
										}
									} else {
										double d_67_ = (d_60_ / d_64_ * (double) (class388.anInt3986 * 11450881));
										double d_68_ = (d_61_ / d_64_ * (double) (class388.anInt3986 * 11450881));
										double d_69_ = (d_62_ / d_64_ * (double) (class388.anInt3986 * 11450881));
										if (class388.anInt3983 * -1335341193 == 0) {
											d += d_67_ * (double) i;
											d_46_ += d_68_ * (double) i;
											d_47_ += d_69_ * (double) i;
											bool = true;
										} else {
											anInt11411 += d_67_ * (double) i;
											anInt11407 += d_68_ * (double) i;
											anInt11403 += d_69_ * (double) i;
										}
									}
								}
							}
						}
					}
				}
			}
			if (class394.anIntArray4055 != null) {
				for (int i_70_ = 0; i_70_ < class394.anIntArray4055.length; i_70_++) {
					Class527_Sub42 class527_sub42 = ((Class527_Sub42) (Class628.aClass14_8188.method709((long) class394.anIntArray4055[i_70_])));
					while (class527_sub42 != null) {
						Class388 class388 = class527_sub42.aClass388_10756;
						double d_71_ = (double) (i_39_ - (class527_sub42.anInt10762 * 1010406053));
						double d_72_ = (double) (i_40_ - (class527_sub42.anInt10759 * 580171837));
						double d_73_ = (double) (i_41_ - (class527_sub42.anInt10760 * -1461282323));
						double d_74_ = d_71_ * d_71_ + d_72_ * d_72_ + d_73_ * d_73_;
						if (d_74_ > (double) (class388.aLong3988 * -4305845978282173361L))
							class527_sub42 = (Class527_Sub42) Class628.aClass14_8188.method715(-1248194826);
						else {
							double d_75_ = Math.sqrt(d_74_);
							if (d_75_ == 0.0)
								d_75_ = 1.0;
							if (class388.anInt3976 * 1175597449 > 0 && class388.anInt3976 * 1175597449 < 2047) {
								double d_76_ = (((d_71_ * (double) class527_sub42.aFloat10761) + d_72_ * (double) (class388.anInt3979 * -250364785) + d_73_ * (double) (class527_sub42.aFloat10757)) * 16384.0 / ((double) (class388.anInt3986 * 11450881) * d_75_));
								if (d_76_ < (double) (class388.anInt3966 * -371972735)) {
									class527_sub42 = ((Class527_Sub42) Class628.aClass14_8188.method715(1409674999));
									continue;
								}
							}
							double d_77_ = 0.0;
							if (class388.anInt3978 * -2025935055 == 1)
								d_77_ = (d_75_ / 16.0 * (double) (class388.anInt3982 * 1546532627));
							else if (class388.anInt3978 * -2025935055 == 2)
								d_77_ = (d_75_ / 16.0 * (d_75_ / 16.0) * (double) (class388.anInt3982 * 1546532627));
							if (class388.anInt3984 * 783781019 == 0) {
								if (class388.anInt3983 * -1335341193 == 0) {
									d += ((double) class527_sub42.aFloat10761 - d_77_) * (double) i;
									d_46_ += ((double) (class388.anInt3979 * -250364785) - d_77_) * (double) i;
									d_47_ += ((double) class527_sub42.aFloat10757 - d_77_) * (double) i;
									bool = true;
								} else {
									anInt11411 += ((double) class527_sub42.aFloat10761 - d_77_) * (double) i;
									anInt11407 += ((double) (class388.anInt3979 * -250364785) - d_77_) * (double) i;
									anInt11403 += ((double) class527_sub42.aFloat10757 - d_77_) * (double) i;
								}
							} else {
								double d_78_ = (d_71_ / d_75_ * (double) (class388.anInt3986 * 11450881));
								double d_79_ = (d_72_ / d_75_ * (double) (class388.anInt3986 * 11450881));
								double d_80_ = (d_73_ / d_75_ * (double) (class388.anInt3986 * 11450881));
								if (class388.anInt3983 * -1335341193 == 0) {
									d += d_78_ * (double) i;
									d_46_ += d_79_ * (double) i;
									d_47_ += d_80_ * (double) i;
									bool = true;
								} else {
									anInt11411 += d_78_ * (double) i;
									anInt11407 += d_79_ * (double) i;
									anInt11403 += d_80_ * (double) i;
								}
							}
							class527_sub42 = (Class527_Sub42) Class628.aClass14_8188.method715(213427529);
						}
					}
				}
			}
			if (class394.anIntArray4056 != null) {
				if (class394.anIntArray4066 == null) {
					class394.anIntArray4066 = new int[class394.anIntArray4056.length];
					for (int i_81_ = 0; i_81_ < class394.anIntArray4056.length; i_81_++) {
						Class628.anInterface49_8197.method339((class394.anIntArray4056[i_81_]), (byte) 1);
						class394.anIntArray4066[i_81_] = Class527_Sub28.method16286((class394.anIntArray4056[i_81_]), -622599188);
					}
				}
				for (int i_82_ = 0; i_82_ < class394.anIntArray4066.length; i_82_++) {
					Class388 class388 = (Class628.aClass388Array8203[class394.anIntArray4066[i_82_]]);
					if (class388.anInt3983 * -1335341193 == 0) {
						d += (double) (class388.anInt3987 * -1594671677 * i);
						d_46_ += (double) (class388.anInt3979 * -250364785 * i);
						d_47_ += (double) (class388.anInt3980 * 1076715587 * i);
						bool = true;
					} else {
						anInt11411 += class388.anInt3987 * -1594671677 * i;
						anInt11407 += class388.anInt3979 * -250364785 * i;
						anInt11403 += class388.anInt3980 * 1076715587 * i;
					}
				}
			}
			if (bool) {
				while (d > 32767.0 || d_46_ > 32767.0 || d_47_ > 32767.0 || d < -32767.0 || d_46_ < -32767.0 || d_47_ < -32767.0) {
					d /= 2.0;
					d_46_ /= 2.0;
					d_47_ /= 2.0;
					anInt12102 <<= 1;
				}
				aShort12101 = (short) (int) d;
				aShort12105 = (short) (int) d_46_;
				aShort12097 = (short) (int) d_47_;
			}
			anInt11411 += ((long) aShort12101 * (long) (anInt12102 << 2) >> 23) * (long) i;
			anInt11407 += ((long) aShort12105 * (long) (anInt12102 << 2) >> 23) * (long) i;
			anInt11403 += ((long) aShort12097 * (long) (anInt12102 << 2) >> 23) * (long) i;
		}
	}

	void method18772() {
		aClass625_12104.aClass613_8162.aClass522_Sub6_Sub1_Sub1Array8019[aShort12103] = null;
		Class628.aClass522_Sub6_Sub1_Sub1Array8189[(Class628.anInt8194 * 400590039)] = this;
		Class628.anInt8194 = (Class628.anInt8194 * 400590039 + 1 & 0x3ff) * 890416871;
		method8682(-556938186);
		method15990((byte) -101);
	}

	void method18773(Class625 class625, int i, int i_83_, int i_84_, int i_85_, int i_86_, int i_87_, int i_88_, int i_89_, int i_90_, int i_91_, int i_92_, int i_93_, int i_94_, boolean bool, boolean bool_95_) {
		aClass625_12104 = class625;
		anInt11411 = i << 12;
		anInt11407 = i_83_ << 12;
		anInt11403 = i_84_ << 12;
		anInt11409 = i_90_;
		aShort12099 = aShort12100 = (short) i_89_;
		anInt11408 = i_91_;
		aShort11406 = (short) i_92_;
		aShort12106 = (short) i_93_;
		anInt11410 = i_94_;
		aBool11412 = bool_95_;
		aShort12101 = (short) i_85_;
		aShort12105 = (short) i_86_;
		aShort12097 = (short) i_87_;
		anInt12102 = i_88_;
		method18769();
	}

	void method18774() {
		aClass625_12104.aClass613_8162.aClass522_Sub6_Sub1_Sub1Array8019[aShort12103] = null;
		Class628.aClass522_Sub6_Sub1_Sub1Array8189[(Class628.anInt8194 * 400590039)] = this;
		Class628.anInt8194 = (Class628.anInt8194 * 400590039 + 1 & 0x3ff) * 890416871;
		method8682(1739537506);
		method15990((byte) -62);
	}

	void method18775() {
		aClass625_12104.aClass613_8162.aClass522_Sub6_Sub1_Sub1Array8019[aShort12103] = null;
		Class628.aClass522_Sub6_Sub1_Sub1Array8189[(Class628.anInt8194 * 400590039)] = this;
		Class628.anInt8194 = (Class628.anInt8194 * 400590039 + 1 & 0x3ff) * 890416871;
		method8682(718553220);
		method15990((byte) -20);
	}

	void method18776() {
		int i = aClass625_12104.aClass613_8162.anInt8020;
		if (aClass625_12104.aClass613_8162.aClass522_Sub6_Sub1_Sub1Array8019[i] != null)
			aClass625_12104.aClass613_8162.aClass522_Sub6_Sub1_Sub1Array8019[i].method18772();
		aClass625_12104.aClass613_8162.aClass522_Sub6_Sub1_Sub1Array8019[i] = this;
		aShort12103 = (short) aClass625_12104.aClass613_8162.anInt8020;
		aClass625_12104.aClass613_8162.anInt8020 = i + 1 & 0x1fff;
		aClass625_12104.aClass705_8164.method14322(this, -2129510354);
	}

	void method18777(Class555 class555, Class180 class180, long l) {
		int i = anInt11411 >> 12 + class555.anInt7421 * 1742303003;
		int i_96_ = anInt11403 >> 12 + class555.anInt7421 * 1742303003;
		int i_97_ = anInt11407 >> 12;
		if (i_97_ > 262144 || i_97_ < -262144 || i < 0 || i >= class555.anInt7443 * -547681223 || i_96_ < 0 || i_96_ >= class555.anInt7432 * -1437024153)
			method18772();
		else {
			Class613 class613 = aClass625_12104.aClass613_8162;
			Class394 class394 = aClass625_12104.aClass394_8161;
			Class161[] class161s = class555.aClass161Array7434;
			int i_98_ = class613.anInt8029;
			Class561 class561 = (class555.aClass561ArrayArrayArray7426[class613.anInt8029][i][i_96_]);
			if (class561 != null)
				i_98_ = class561.aByte7555;
			int i_99_ = class161s[i_98_].method2595(i, i_96_, (byte) 44);
			int i_100_;
			if (i_98_ < class555.anInt7466 * -1609909485 - 1)
				i_100_ = class161s[i_98_ + 1].method2595(i, i_96_, (byte) 114);
			else
				i_100_ = i_99_ - (8 << class555.anInt7421 * 1742303003);
			if (class394.aBool4079) {
				if (class394.anInt4059 * -562765449 == -1 && i_97_ > i_99_) {
					method18772();
					return;
				}
				if (class394.anInt4059 * -562765449 >= 0 && i_97_ > class161s[class394.anInt4059 * -562765449].method2595(i, i_96_, (byte) 64)) {
					method18772();
					return;
				}
				if (class394.anInt4060 * 545056785 == -1 && i_97_ < i_100_) {
					method18772();
					return;
				}
				if (class394.anInt4060 * 545056785 >= 0 && i_97_ < class161s[class394.anInt4060 * 545056785 + 1].method2595(i, i_96_, (byte) 75)) {
					method18772();
					return;
				}
			}
			int i_101_;
			for (i_101_ = class555.anInt7466 * -1609909485 - 1; (i_101_ > 0 && i_97_ > class161s[i_101_].method2595(i, i_96_, (byte) 123)); i_101_--) {
				/* empty */
			}
			if (class394.aBool4077 && i_101_ == 0 && i_97_ > class161s[0].method2595(i, i_96_, (byte) 105))
				method18772();
			else if (i_101_ == class555.anInt7466 * -1609909485 - 1 && (class161s[i_101_].method2595(i, i_96_, (byte) 94) - i_97_) > 8 << class555.anInt7421 * 1742303003)
				method18772();
			else {
				class561 = class555.aClass561ArrayArrayArray7426[i_101_][i][i_96_];
				if (class561 == null) {
					if (i_101_ == 0 || (class555.aClass561ArrayArrayArray7426[0][i][i_96_] == null))
						class561 = class555.aClass561ArrayArrayArray7426[0][i][i_96_] = new Class561(0);
					boolean bool = ((class555.aClass561ArrayArrayArray7426[0][i][i_96_].aClass561_7554) != null);
					if (i_101_ == 3 && bool)
						i_101_--;
					for (int i_102_ = 1; i_102_ <= i_101_; i_102_++) {
						if ((class555.aClass561ArrayArrayArray7426[i_102_][i][i_96_]) == null) {
							class561 = class555.aClass561ArrayArrayArray7426[i_102_][i][i_96_] = new Class561(i_102_);
							if (bool)
								class561.aByte7555++;
						}
					}
					if (class561 == null)
						class561 = (class555.aClass561ArrayArrayArray7426[i_101_][i][i_96_]);
				}
				if (class394.aBool4076) {
					int i_103_ = anInt11411 >> 12;
					int i_104_ = anInt11403 >> 12;
					if (class561.aClass640_Sub1_Sub3_7553 != null) {
						Class549 class549 = class561.aClass640_Sub1_Sub3_7553.method17042(class180, 1906978645);
						if (class549 != null && class549.method9096(i_103_, i_97_, i_104_)) {
							method18772();
							return;
						}
					}
					if (class561.aClass640_Sub1_Sub3_7562 != null) {
						Class549 class549 = class561.aClass640_Sub1_Sub3_7562.method17042(class180, 1754312220);
						if (class549 != null && class549.method9096(i_103_, i_97_, i_104_)) {
							method18772();
							return;
						}
					}
					if (class561.aClass640_Sub1_Sub4_7556 != null) {
						Class549 class549 = class561.aClass640_Sub1_Sub4_7556.method17042(class180, 1961764568);
						if (class549 != null && class549.method9096(i_103_, i_97_, i_104_)) {
							method18772();
							return;
						}
					}
					for (Class562 class562 = class561.aClass562_7558; class562 != null; class562 = class562.aClass562_7565) {
						Class549 class549 = class562.aClass640_Sub1_Sub2_7564.method17042(class180, 1725367461);
						if (class549 != null && class549.method9096(i_103_, i_97_, i_104_)) {
							method18772();
							return;
						}
					}
				}
				class613.aClass182_8021.aClass710_2094.method14402(this, 1711187176);
			}
		}
	}

	void method18778(Class625 class625, int i, int i_105_, int i_106_, int i_107_, int i_108_, int i_109_, int i_110_, int i_111_, int i_112_, int i_113_, int i_114_, int i_115_, int i_116_, boolean bool, boolean bool_117_) {
		aClass625_12104 = class625;
		anInt11411 = i << 12;
		anInt11407 = i_105_ << 12;
		anInt11403 = i_106_ << 12;
		anInt11409 = i_112_;
		aShort12099 = aShort12100 = (short) i_111_;
		anInt11408 = i_113_;
		aShort11406 = (short) i_114_;
		aShort12106 = (short) i_115_;
		anInt11410 = i_116_;
		aBool11412 = bool_117_;
		aShort12101 = (short) i_107_;
		aShort12105 = (short) i_108_;
		aShort12097 = (short) i_109_;
		anInt12102 = i_110_;
		method18769();
	}

	void method18779(Class555 class555, Class180 class180, long l) {
		int i = anInt11411 >> 12 + class555.anInt7421 * 1742303003;
		int i_118_ = anInt11403 >> 12 + class555.anInt7421 * 1742303003;
		int i_119_ = anInt11407 >> 12;
		if (i_119_ > 262144 || i_119_ < -262144 || i < 0 || i >= class555.anInt7443 * -547681223 || i_118_ < 0 || i_118_ >= class555.anInt7432 * -1437024153)
			method18772();
		else {
			Class613 class613 = aClass625_12104.aClass613_8162;
			Class394 class394 = aClass625_12104.aClass394_8161;
			Class161[] class161s = class555.aClass161Array7434;
			int i_120_ = class613.anInt8029;
			Class561 class561 = (class555.aClass561ArrayArrayArray7426[class613.anInt8029][i][i_118_]);
			if (class561 != null)
				i_120_ = class561.aByte7555;
			int i_121_ = class161s[i_120_].method2595(i, i_118_, (byte) 93);
			int i_122_;
			if (i_120_ < class555.anInt7466 * -1609909485 - 1)
				i_122_ = class161s[i_120_ + 1].method2595(i, i_118_, (byte) 4);
			else
				i_122_ = i_121_ - (8 << class555.anInt7421 * 1742303003);
			if (class394.aBool4079) {
				if (class394.anInt4059 * -562765449 == -1 && i_119_ > i_121_) {
					method18772();
					return;
				}
				if (class394.anInt4059 * -562765449 >= 0 && i_119_ > class161s[class394.anInt4059 * -562765449].method2595(i, i_118_, (byte) 37)) {
					method18772();
					return;
				}
				if (class394.anInt4060 * 545056785 == -1 && i_119_ < i_122_) {
					method18772();
					return;
				}
				if (class394.anInt4060 * 545056785 >= 0 && i_119_ < class161s[class394.anInt4060 * 545056785 + 1].method2595(i, i_118_, (byte) 47)) {
					method18772();
					return;
				}
			}
			int i_123_;
			for (i_123_ = class555.anInt7466 * -1609909485 - 1; (i_123_ > 0 && i_119_ > class161s[i_123_].method2595(i, i_118_, (byte) 69)); i_123_--) {
				/* empty */
			}
			if (class394.aBool4077 && i_123_ == 0 && i_119_ > class161s[0].method2595(i, i_118_, (byte) 29))
				method18772();
			else if (i_123_ == class555.anInt7466 * -1609909485 - 1 && (class161s[i_123_].method2595(i, i_118_, (byte) 77) - i_119_) > 8 << class555.anInt7421 * 1742303003)
				method18772();
			else {
				class561 = class555.aClass561ArrayArrayArray7426[i_123_][i][i_118_];
				if (class561 == null) {
					if (i_123_ == 0 || (class555.aClass561ArrayArrayArray7426[0][i][i_118_] == null))
						class561 = class555.aClass561ArrayArrayArray7426[0][i][i_118_] = new Class561(0);
					boolean bool = ((class555.aClass561ArrayArrayArray7426[0][i][i_118_].aClass561_7554) != null);
					if (i_123_ == 3 && bool)
						i_123_--;
					for (int i_124_ = 1; i_124_ <= i_123_; i_124_++) {
						if ((class555.aClass561ArrayArrayArray7426[i_124_][i][i_118_]) == null) {
							class561 = class555.aClass561ArrayArrayArray7426[i_124_][i][i_118_] = new Class561(i_124_);
							if (bool)
								class561.aByte7555++;
						}
					}
					if (class561 == null)
						class561 = (class555.aClass561ArrayArrayArray7426[i_123_][i][i_118_]);
				}
				if (class394.aBool4076) {
					int i_125_ = anInt11411 >> 12;
					int i_126_ = anInt11403 >> 12;
					if (class561.aClass640_Sub1_Sub3_7553 != null) {
						Class549 class549 = class561.aClass640_Sub1_Sub3_7553.method17042(class180, 1164852072);
						if (class549 != null && class549.method9096(i_125_, i_119_, i_126_)) {
							method18772();
							return;
						}
					}
					if (class561.aClass640_Sub1_Sub3_7562 != null) {
						Class549 class549 = class561.aClass640_Sub1_Sub3_7562.method17042(class180, 1855640810);
						if (class549 != null && class549.method9096(i_125_, i_119_, i_126_)) {
							method18772();
							return;
						}
					}
					if (class561.aClass640_Sub1_Sub4_7556 != null) {
						Class549 class549 = class561.aClass640_Sub1_Sub4_7556.method17042(class180, 1707714633);
						if (class549 != null && class549.method9096(i_125_, i_119_, i_126_)) {
							method18772();
							return;
						}
					}
					for (Class562 class562 = class561.aClass562_7558; class562 != null; class562 = class562.aClass562_7565) {
						Class549 class549 = class562.aClass640_Sub1_Sub2_7564.method17042(class180, 1300394602);
						if (class549 != null && class549.method9096(i_125_, i_119_, i_126_)) {
							method18772();
							return;
						}
					}
				}
				class613.aClass182_8021.aClass710_2094.method14402(this, 1755677731);
			}
		}
	}

	void method18780() {
		aClass625_12104.aClass613_8162.aClass522_Sub6_Sub1_Sub1Array8019[aShort12103] = null;
		Class628.aClass522_Sub6_Sub1_Sub1Array8189[(Class628.anInt8194 * 400590039)] = this;
		Class628.anInt8194 = (Class628.anInt8194 * 400590039 + 1 & 0x3ff) * 890416871;
		method8682(-1129274929);
		method15990((byte) -128);
	}

	void method18781(Class555 class555, Class180 class180, long l) {
		int i = anInt11411 >> 12 + class555.anInt7421 * 1742303003;
		int i_127_ = anInt11403 >> 12 + class555.anInt7421 * 1742303003;
		int i_128_ = anInt11407 >> 12;
		if (i_128_ > 262144 || i_128_ < -262144 || i < 0 || i >= class555.anInt7443 * -547681223 || i_127_ < 0 || i_127_ >= class555.anInt7432 * -1437024153)
			method18772();
		else {
			Class613 class613 = aClass625_12104.aClass613_8162;
			Class394 class394 = aClass625_12104.aClass394_8161;
			Class161[] class161s = class555.aClass161Array7434;
			int i_129_ = class613.anInt8029;
			Class561 class561 = (class555.aClass561ArrayArrayArray7426[class613.anInt8029][i][i_127_]);
			if (class561 != null)
				i_129_ = class561.aByte7555;
			int i_130_ = class161s[i_129_].method2595(i, i_127_, (byte) 124);
			int i_131_;
			if (i_129_ < class555.anInt7466 * -1609909485 - 1)
				i_131_ = class161s[i_129_ + 1].method2595(i, i_127_, (byte) 70);
			else
				i_131_ = i_130_ - (8 << class555.anInt7421 * 1742303003);
			if (class394.aBool4079) {
				if (class394.anInt4059 * -562765449 == -1 && i_128_ > i_130_) {
					method18772();
					return;
				}
				if (class394.anInt4059 * -562765449 >= 0 && i_128_ > class161s[class394.anInt4059 * -562765449].method2595(i, i_127_, (byte) 31)) {
					method18772();
					return;
				}
				if (class394.anInt4060 * 545056785 == -1 && i_128_ < i_131_) {
					method18772();
					return;
				}
				if (class394.anInt4060 * 545056785 >= 0 && i_128_ < class161s[class394.anInt4060 * 545056785 + 1].method2595(i, i_127_, (byte) 41)) {
					method18772();
					return;
				}
			}
			int i_132_;
			for (i_132_ = class555.anInt7466 * -1609909485 - 1; (i_132_ > 0 && i_128_ > class161s[i_132_].method2595(i, i_127_, (byte) 108)); i_132_--) {
				/* empty */
			}
			if (class394.aBool4077 && i_132_ == 0 && i_128_ > class161s[0].method2595(i, i_127_, (byte) 110))
				method18772();
			else if (i_132_ == class555.anInt7466 * -1609909485 - 1 && (class161s[i_132_].method2595(i, i_127_, (byte) 46) - i_128_) > 8 << class555.anInt7421 * 1742303003)
				method18772();
			else {
				class561 = class555.aClass561ArrayArrayArray7426[i_132_][i][i_127_];
				if (class561 == null) {
					if (i_132_ == 0 || (class555.aClass561ArrayArrayArray7426[0][i][i_127_] == null))
						class561 = class555.aClass561ArrayArrayArray7426[0][i][i_127_] = new Class561(0);
					boolean bool = ((class555.aClass561ArrayArrayArray7426[0][i][i_127_].aClass561_7554) != null);
					if (i_132_ == 3 && bool)
						i_132_--;
					for (int i_133_ = 1; i_133_ <= i_132_; i_133_++) {
						if ((class555.aClass561ArrayArrayArray7426[i_133_][i][i_127_]) == null) {
							class561 = class555.aClass561ArrayArrayArray7426[i_133_][i][i_127_] = new Class561(i_133_);
							if (bool)
								class561.aByte7555++;
						}
					}
					if (class561 == null)
						class561 = (class555.aClass561ArrayArrayArray7426[i_132_][i][i_127_]);
				}
				if (class394.aBool4076) {
					int i_134_ = anInt11411 >> 12;
					int i_135_ = anInt11403 >> 12;
					if (class561.aClass640_Sub1_Sub3_7553 != null) {
						Class549 class549 = class561.aClass640_Sub1_Sub3_7553.method17042(class180, 1666270617);
						if (class549 != null && class549.method9096(i_134_, i_128_, i_135_)) {
							method18772();
							return;
						}
					}
					if (class561.aClass640_Sub1_Sub3_7562 != null) {
						Class549 class549 = class561.aClass640_Sub1_Sub3_7562.method17042(class180, 1398705318);
						if (class549 != null && class549.method9096(i_134_, i_128_, i_135_)) {
							method18772();
							return;
						}
					}
					if (class561.aClass640_Sub1_Sub4_7556 != null) {
						Class549 class549 = class561.aClass640_Sub1_Sub4_7556.method17042(class180, 1333112700);
						if (class549 != null && class549.method9096(i_134_, i_128_, i_135_)) {
							method18772();
							return;
						}
					}
					for (Class562 class562 = class561.aClass562_7558; class562 != null; class562 = class562.aClass562_7565) {
						Class549 class549 = class562.aClass640_Sub1_Sub2_7564.method17042(class180, 1563771599);
						if (class549 != null && class549.method9096(i_134_, i_128_, i_135_)) {
							method18772();
							return;
						}
					}
				}
				class613.aClass182_8021.aClass710_2094.method14402(this, 2147315519);
			}
		}
	}

	void method18782(Class555 class555, Class180 class180, long l) {
		int i = anInt11411 >> 12 + class555.anInt7421 * 1742303003;
		int i_136_ = anInt11403 >> 12 + class555.anInt7421 * 1742303003;
		int i_137_ = anInt11407 >> 12;
		if (i_137_ > 262144 || i_137_ < -262144 || i < 0 || i >= class555.anInt7443 * -547681223 || i_136_ < 0 || i_136_ >= class555.anInt7432 * -1437024153)
			method18772();
		else {
			Class613 class613 = aClass625_12104.aClass613_8162;
			Class394 class394 = aClass625_12104.aClass394_8161;
			Class161[] class161s = class555.aClass161Array7434;
			int i_138_ = class613.anInt8029;
			Class561 class561 = (class555.aClass561ArrayArrayArray7426[class613.anInt8029][i][i_136_]);
			if (class561 != null)
				i_138_ = class561.aByte7555;
			int i_139_ = class161s[i_138_].method2595(i, i_136_, (byte) 27);
			int i_140_;
			if (i_138_ < class555.anInt7466 * -1609909485 - 1)
				i_140_ = class161s[i_138_ + 1].method2595(i, i_136_, (byte) 100);
			else
				i_140_ = i_139_ - (8 << class555.anInt7421 * 1742303003);
			if (class394.aBool4079) {
				if (class394.anInt4059 * -562765449 == -1 && i_137_ > i_139_) {
					method18772();
					return;
				}
				if (class394.anInt4059 * -562765449 >= 0 && i_137_ > class161s[class394.anInt4059 * -562765449].method2595(i, i_136_, (byte) 117)) {
					method18772();
					return;
				}
				if (class394.anInt4060 * 545056785 == -1 && i_137_ < i_140_) {
					method18772();
					return;
				}
				if (class394.anInt4060 * 545056785 >= 0 && i_137_ < class161s[class394.anInt4060 * 545056785 + 1].method2595(i, i_136_, (byte) 48)) {
					method18772();
					return;
				}
			}
			int i_141_;
			for (i_141_ = class555.anInt7466 * -1609909485 - 1; (i_141_ > 0 && i_137_ > class161s[i_141_].method2595(i, i_136_, (byte) 83)); i_141_--) {
				/* empty */
			}
			if (class394.aBool4077 && i_141_ == 0 && i_137_ > class161s[0].method2595(i, i_136_, (byte) 77))
				method18772();
			else if (i_141_ == class555.anInt7466 * -1609909485 - 1 && (class161s[i_141_].method2595(i, i_136_, (byte) 113) - i_137_) > 8 << class555.anInt7421 * 1742303003)
				method18772();
			else {
				class561 = class555.aClass561ArrayArrayArray7426[i_141_][i][i_136_];
				if (class561 == null) {
					if (i_141_ == 0 || (class555.aClass561ArrayArrayArray7426[0][i][i_136_] == null))
						class561 = class555.aClass561ArrayArrayArray7426[0][i][i_136_] = new Class561(0);
					boolean bool = ((class555.aClass561ArrayArrayArray7426[0][i][i_136_].aClass561_7554) != null);
					if (i_141_ == 3 && bool)
						i_141_--;
					for (int i_142_ = 1; i_142_ <= i_141_; i_142_++) {
						if ((class555.aClass561ArrayArrayArray7426[i_142_][i][i_136_]) == null) {
							class561 = class555.aClass561ArrayArrayArray7426[i_142_][i][i_136_] = new Class561(i_142_);
							if (bool)
								class561.aByte7555++;
						}
					}
					if (class561 == null)
						class561 = (class555.aClass561ArrayArrayArray7426[i_141_][i][i_136_]);
				}
				if (class394.aBool4076) {
					int i_143_ = anInt11411 >> 12;
					int i_144_ = anInt11403 >> 12;
					if (class561.aClass640_Sub1_Sub3_7553 != null) {
						Class549 class549 = class561.aClass640_Sub1_Sub3_7553.method17042(class180, 2110286029);
						if (class549 != null && class549.method9096(i_143_, i_137_, i_144_)) {
							method18772();
							return;
						}
					}
					if (class561.aClass640_Sub1_Sub3_7562 != null) {
						Class549 class549 = class561.aClass640_Sub1_Sub3_7562.method17042(class180, 1531922641);
						if (class549 != null && class549.method9096(i_143_, i_137_, i_144_)) {
							method18772();
							return;
						}
					}
					if (class561.aClass640_Sub1_Sub4_7556 != null) {
						Class549 class549 = class561.aClass640_Sub1_Sub4_7556.method17042(class180, 1487187492);
						if (class549 != null && class549.method9096(i_143_, i_137_, i_144_)) {
							method18772();
							return;
						}
					}
					for (Class562 class562 = class561.aClass562_7558; class562 != null; class562 = class562.aClass562_7565) {
						Class549 class549 = class562.aClass640_Sub1_Sub2_7564.method17042(class180, 1508805285);
						if (class549 != null && class549.method9096(i_143_, i_137_, i_144_)) {
							method18772();
							return;
						}
					}
				}
				class613.aClass182_8021.aClass710_2094.method14402(this, 2020878641);
			}
		}
	}
}
