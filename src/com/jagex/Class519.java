/* Class519 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Class519 {
	Class311[] aClass311Array7052;
	Class325 aClass325_7053;
	short[] aShortArray7054;
	Class311 aClass311_7055;
	short[] aShortArray7056;
	short[] aShortArray7057;
	short[] aShortArray7058;
	short[] aShortArray7059;
	Class510 aClass510_7060 = new Class510();
	short[] aShortArray7061;
	Class524 aClass524_7062;
	Class524 aClass524_7063;
	short[] aShortArray7064;
	Class534 aClass534_7065;
	int anInt7066;
	int anInt7067;
	int anInt7068;

	boolean method8636(byte[] is) {
		if (is.length < 5)
			return false;
		int i = is[0] & 0xff;
		int i_0_ = i % 9;
		int i_1_ = i / 9;
		int i_2_ = i_1_ % 5;
		int i_3_ = i_1_ / 5;
		int i_4_ = 0;
		for (int i_5_ = 0; i_5_ < 4; i_5_++)
			i_4_ += (is[1 + i_5_] & 0xff) << 8 * i_5_;
		if (!method8638(i_0_, i_2_, i_3_, -1193230426))
			return false;
		return method8637(i_4_, -836270917);
	}

	boolean method8637(int i, int i_6_) {
		if (i < 0)
			return false;
		if (anInt7066 * 781014917 != i) {
			anInt7066 = i * -342554291;
			anInt7067 = Math.max(781014917 * anInt7066, 1) * 858258635;
			aClass510_7060.method8424(Math.max(anInt7067 * 1054705891, 4096), 285038196);
		}
		return true;
	}

	boolean method8638(int i, int i_7_, int i_8_, int i_9_) {
		if (i > 8 || i_7_ > 4 || i_8_ > 4)
			return false;
		aClass534_7065.method8954(i_7_, i, -1594756615);
		int i_10_ = 1 << i_8_;
		aClass524_7063.method8712(i_10_, (byte) 48);
		aClass524_7062.method8712(i_10_, (byte) 46);
		anInt7068 = 1270068833 * (i_10_ - 1);
		return true;
	}

	void method8639(int i) throws IOException {
		aClass510_7060.method8427(false, -1159027737);
		Class225.method4192(aShortArray7054, 189894274);
		Class225.method4192(aShortArray7059, -1182994853);
		Class225.method4192(aShortArray7056, 462172461);
		Class225.method4192(aShortArray7064, -1000260093);
		Class225.method4192(aShortArray7057, -1428747683);
		Class225.method4192(aShortArray7058, 1529741145);
		Class225.method4192(aShortArray7061, -1289406982);
		aClass534_7065.method8947(2145278740);
		for (int i_11_ = 0; i_11_ < 4; i_11_++)
			aClass311Array7052[i_11_].method5638((byte) 6);
		aClass524_7063.method8704(702517507);
		aClass524_7062.method8704(-1090212873);
		aClass311_7055.method5638((byte) 88);
		aClass325_7053.method5733(-1802120174);
	}

	boolean method8640(InputStream inputstream, OutputStream outputstream, long l) throws IOException {
		aClass325_7053.method5731(inputstream, 1599525381);
		aClass510_7060.method8434(outputstream, -1746884350);
		method8639(1619206112);
		int i = Class478.method7785(-2132421191);
		int i_12_ = 0;
		int i_13_ = 0;
		int i_14_ = 0;
		int i_15_ = 0;
		long l_16_ = 0L;
		byte i_17_ = 0;
		while (l < 0L || l_16_ < l) {
			int i_18_ = (int) l_16_ & anInt7068 * -902599263;
			if (aClass325_7053.method5735(aShortArray7054, i_18_ + (i << 4), 567775937) == 0) {
				Class540 class540 = aClass534_7065.method8948((int) l_16_, i_17_, 147861207);
				if (!Class456.method7425(i, 1033947718))
					i_17_ = (class540.method9007(aClass325_7053, aClass510_7060.method8441(i_12_, -406597490), 2073088808));
				else
					i_17_ = class540.method9009(aClass325_7053, (byte) -28);
				aClass510_7060.method8430(i_17_, 598172992);
				i = Class408.method6567(i, 1361579693);
				l_16_++;
			} else {
				int i_19_;
				if (aClass325_7053.method5735(aShortArray7056, i, 1485746818) == 1) {
					i_19_ = 0;
					if (aClass325_7053.method5735(aShortArray7064, i, 280231282) == 0) {
						if (aClass325_7053.method5735(aShortArray7059, i_18_ + (i << 4), 14460777) == 0) {
							i = Class453.method7336(i, 857315326);
							i_19_ = 1;
						}
					} else {
						int i_20_;
						if (aClass325_7053.method5735(aShortArray7057, i, 627980119) == 0)
							i_20_ = i_13_;
						else {
							if (aClass325_7053.method5735(aShortArray7058, i, 1704770388) == 0)
								i_20_ = i_14_;
							else {
								i_20_ = i_15_;
								i_15_ = i_14_;
							}
							i_14_ = i_13_;
						}
						i_13_ = i_12_;
						i_12_ = i_20_;
					}
					if (i_19_ == 0) {
						i_19_ = aClass524_7062.method8703(aClass325_7053, i_18_, (byte) 10) + 2;
						i = Class565.method9500(i, -2104770997);
					}
				} else {
					i_15_ = i_14_;
					i_14_ = i_13_;
					i_13_ = i_12_;
					i_19_ = 2 + aClass524_7063.method8703(aClass325_7053, i_18_, (byte) 4);
					i = Class205.method3828(i, (byte) -43);
					int i_21_ = aClass311Array7052[Class170_Sub1.method14739(i_19_, -381271225)].method5639(aClass325_7053, (byte) 34);
					if (i_21_ >= 4) {
						int i_22_ = (i_21_ >> 1) - 1;
						i_12_ = (0x2 | i_21_ & 0x1) << i_22_;
						if (i_21_ < 14)
							i_12_ += Class647.method10819(aShortArray7061, i_12_ - i_21_ - 1, aClass325_7053, i_22_, -88004625);
						else {
							i_12_ += aClass325_7053.method5734(i_22_ - 4, -1030363653) << 4;
							i_12_ += aClass311_7055.method5637(aClass325_7053, (byte) 34);
							if (i_12_ < 0) {
								if (-1 != i_12_)
									return false;
								break;
							}
						}
					} else
						i_12_ = i_21_;
				}
				if ((long) i_12_ >= l_16_ || i_12_ >= anInt7067 * 1054705891)
					return false;
				aClass510_7060.method8429(i_12_, i_19_, -78845949);
				l_16_ += (long) i_19_;
				i_17_ = aClass510_7060.method8441(0, -406597490);
			}
		}
		aClass510_7060.method8425(2059925098);
		aClass510_7060.method8426((byte) 1);
		aClass325_7053.method5740(1769813785);
		return true;
	}

	boolean method8641(byte[] is, byte i) {
		if (is.length < 5)
			return false;
		int i_23_ = is[0] & 0xff;
		int i_24_ = i_23_ % 9;
		int i_25_ = i_23_ / 9;
		int i_26_ = i_25_ % 5;
		int i_27_ = i_25_ / 5;
		int i_28_ = 0;
		for (int i_29_ = 0; i_29_ < 4; i_29_++)
			i_28_ += (is[1 + i_29_] & 0xff) << 8 * i_29_;
		if (!method8638(i_24_, i_26_, i_27_, -1670847498))
			return false;
		return method8637(i_28_, -836270917);
	}

	void method8642() throws IOException {
		aClass510_7060.method8427(false, -1772510576);
		Class225.method4192(aShortArray7054, 950284009);
		Class225.method4192(aShortArray7059, 1517380504);
		Class225.method4192(aShortArray7056, 1706814097);
		Class225.method4192(aShortArray7064, -56289648);
		Class225.method4192(aShortArray7057, -970463829);
		Class225.method4192(aShortArray7058, 1327898602);
		Class225.method4192(aShortArray7061, 1621885571);
		aClass534_7065.method8947(2139877216);
		for (int i = 0; i < 4; i++)
			aClass311Array7052[i].method5638((byte) 44);
		aClass524_7063.method8704(82711727);
		aClass524_7062.method8704(1085070237);
		aClass311_7055.method5638((byte) 8);
		aClass325_7053.method5733(-1802120174);
	}

	boolean method8643(int i) {
		if (i < 0)
			return false;
		if (anInt7066 * 781014917 != i) {
			anInt7066 = i * -342554291;
			anInt7067 = Math.max(781014917 * anInt7066, 1) * 858258635;
			aClass510_7060.method8424(Math.max(anInt7067 * 1054705891, 4096), -1960955465);
		}
		return true;
	}

	boolean method8644(int i, int i_30_, int i_31_) {
		if (i > 8 || i_30_ > 4 || i_31_ > 4)
			return false;
		aClass534_7065.method8954(i_30_, i, -1594756615);
		int i_32_ = 1 << i_31_;
		aClass524_7063.method8712(i_32_, (byte) 60);
		aClass524_7062.method8712(i_32_, (byte) 59);
		anInt7068 = 1270068833 * (i_32_ - 1);
		return true;
	}

	boolean method8645(int i) {
		if (i < 0)
			return false;
		if (anInt7066 * 781014917 != i) {
			anInt7066 = i * -342554291;
			anInt7067 = Math.max(781014917 * anInt7066, 1) * 858258635;
			aClass510_7060.method8424(Math.max(anInt7067 * 1054705891, 4096), -1485245018);
		}
		return true;
	}

	Class519() {
		aClass325_7053 = new Class325();
		aShortArray7054 = new short[192];
		aShortArray7056 = new short[12];
		aShortArray7064 = new short[12];
		aShortArray7057 = new short[12];
		aShortArray7058 = new short[12];
		aShortArray7059 = new short[192];
		aClass311Array7052 = new Class311[4];
		aShortArray7061 = new short[114];
		aClass311_7055 = new Class311(4);
		aClass524_7063 = new Class524(this);
		aClass524_7062 = new Class524(this);
		aClass534_7065 = new Class534(this);
		anInt7066 = 342554291;
		anInt7067 = -858258635;
		for (int i = 0; i < 4; i++)
			aClass311Array7052[i] = new Class311(6);
	}

	void method8646() throws IOException {
		aClass510_7060.method8427(false, -2009934768);
		Class225.method4192(aShortArray7054, -153177454);
		Class225.method4192(aShortArray7059, -2105650024);
		Class225.method4192(aShortArray7056, -1092090663);
		Class225.method4192(aShortArray7064, -767620789);
		Class225.method4192(aShortArray7057, 93686424);
		Class225.method4192(aShortArray7058, -1865317264);
		Class225.method4192(aShortArray7061, -2010722602);
		aClass534_7065.method8947(2140265986);
		for (int i = 0; i < 4; i++)
			aClass311Array7052[i].method5638((byte) 120);
		aClass524_7063.method8704(919719594);
		aClass524_7062.method8704(-1739193853);
		aClass311_7055.method5638((byte) 68);
		aClass325_7053.method5733(-1802120174);
	}

	void method8647() throws IOException {
		aClass510_7060.method8427(false, -2117077327);
		Class225.method4192(aShortArray7054, 1311894403);
		Class225.method4192(aShortArray7059, 1261176699);
		Class225.method4192(aShortArray7056, 452947438);
		Class225.method4192(aShortArray7064, -782778718);
		Class225.method4192(aShortArray7057, -216541482);
		Class225.method4192(aShortArray7058, -687882000);
		Class225.method4192(aShortArray7061, 1288203246);
		aClass534_7065.method8947(2143070881);
		for (int i = 0; i < 4; i++)
			aClass311Array7052[i].method5638((byte) 99);
		aClass524_7063.method8704(1394986874);
		aClass524_7062.method8704(-1159010928);
		aClass311_7055.method5638((byte) 49);
		aClass325_7053.method5733(-1802120174);
	}

	boolean method8648(byte[] is) {
		if (is.length < 5)
			return false;
		int i = is[0] & 0xff;
		int i_33_ = i % 9;
		int i_34_ = i / 9;
		int i_35_ = i_34_ % 5;
		int i_36_ = i_34_ / 5;
		int i_37_ = 0;
		for (int i_38_ = 0; i_38_ < 4; i_38_++)
			i_37_ += (is[1 + i_38_] & 0xff) << 8 * i_38_;
		if (!method8638(i_33_, i_35_, i_36_, -1610535023))
			return false;
		return method8637(i_37_, -836270917);
	}

	void method8649() throws IOException {
		aClass510_7060.method8427(false, -1273851659);
		Class225.method4192(aShortArray7054, -1008951079);
		Class225.method4192(aShortArray7059, -1183061691);
		Class225.method4192(aShortArray7056, 205266686);
		Class225.method4192(aShortArray7064, 427452953);
		Class225.method4192(aShortArray7057, 2010105708);
		Class225.method4192(aShortArray7058, -154333534);
		Class225.method4192(aShortArray7061, -1148840964);
		aClass534_7065.method8947(2139940192);
		for (int i = 0; i < 4; i++)
			aClass311Array7052[i].method5638((byte) 28);
		aClass524_7063.method8704(762036018);
		aClass524_7062.method8704(-211239936);
		aClass311_7055.method5638((byte) 27);
		aClass325_7053.method5733(-1802120174);
	}

	boolean method8650(InputStream inputstream, OutputStream outputstream, long l) throws IOException {
		aClass325_7053.method5731(inputstream, 1599525381);
		aClass510_7060.method8434(outputstream, -1605736282);
		method8639(1565389828);
		int i = Class478.method7785(-1260285878);
		int i_39_ = 0;
		int i_40_ = 0;
		int i_41_ = 0;
		int i_42_ = 0;
		long l_43_ = 0L;
		byte i_44_ = 0;
		while (l < 0L || l_43_ < l) {
			int i_45_ = (int) l_43_ & anInt7068 * -902599263;
			if (aClass325_7053.method5735(aShortArray7054, i_45_ + (i << 4), 1799739427) == 0) {
				Class540 class540 = aClass534_7065.method8948((int) l_43_, i_44_, 1553142534);
				if (!Class456.method7425(i, -1082734508))
					i_44_ = (class540.method9007(aClass325_7053, aClass510_7060.method8441(i_39_, -406597490), 2073088808));
				else
					i_44_ = class540.method9009(aClass325_7053, (byte) -25);
				aClass510_7060.method8430(i_44_, 598172992);
				i = Class408.method6567(i, 1944500929);
				l_43_++;
			} else {
				int i_46_;
				if (aClass325_7053.method5735(aShortArray7056, i, 1929868716) == 1) {
					i_46_ = 0;
					if (aClass325_7053.method5735(aShortArray7064, i, 549761490) == 0) {
						if (aClass325_7053.method5735(aShortArray7059, i_45_ + (i << 4), -737948) == 0) {
							i = Class453.method7336(i, 857315326);
							i_46_ = 1;
						}
					} else {
						int i_47_;
						if (aClass325_7053.method5735(aShortArray7057, i, 355077830) == 0)
							i_47_ = i_40_;
						else {
							if (aClass325_7053.method5735(aShortArray7058, i, 637218314) == 0)
								i_47_ = i_41_;
							else {
								i_47_ = i_42_;
								i_42_ = i_41_;
							}
							i_41_ = i_40_;
						}
						i_40_ = i_39_;
						i_39_ = i_47_;
					}
					if (i_46_ == 0) {
						i_46_ = aClass524_7062.method8703(aClass325_7053, i_45_, (byte) -31) + 2;
						i = Class565.method9500(i, -2110631146);
					}
				} else {
					i_42_ = i_41_;
					i_41_ = i_40_;
					i_40_ = i_39_;
					i_46_ = 2 + aClass524_7063.method8703(aClass325_7053, i_45_, (byte) 81);
					i = Class205.method3828(i, (byte) -3);
					int i_48_ = aClass311Array7052[Class170_Sub1.method14739(i_46_, -1714722540)].method5639(aClass325_7053, (byte) 99);
					if (i_48_ >= 4) {
						int i_49_ = (i_48_ >> 1) - 1;
						i_39_ = (0x2 | i_48_ & 0x1) << i_49_;
						if (i_48_ < 14)
							i_39_ += Class647.method10819(aShortArray7061, i_39_ - i_48_ - 1, aClass325_7053, i_49_, -88004625);
						else {
							i_39_ += aClass325_7053.method5734(i_49_ - 4, -2131533747) << 4;
							i_39_ += aClass311_7055.method5637(aClass325_7053, (byte) 76);
							if (i_39_ < 0) {
								if (-1 != i_39_)
									return false;
								break;
							}
						}
					} else
						i_39_ = i_48_;
				}
				if ((long) i_39_ >= l_43_ || i_39_ >= anInt7067 * 1054705891)
					return false;
				aClass510_7060.method8429(i_39_, i_46_, -78845949);
				l_43_ += (long) i_46_;
				i_44_ = aClass510_7060.method8441(0, -406597490);
			}
		}
		aClass510_7060.method8425(1043146989);
		aClass510_7060.method8426((byte) 1);
		aClass325_7053.method5740(1769813785);
		return true;
	}

	boolean method8651(InputStream inputstream, OutputStream outputstream, long l) throws IOException {
		aClass325_7053.method5731(inputstream, 1599525381);
		aClass510_7060.method8434(outputstream, -1804945402);
		method8639(2097354313);
		int i = Class478.method7785(-800437477);
		int i_50_ = 0;
		int i_51_ = 0;
		int i_52_ = 0;
		int i_53_ = 0;
		long l_54_ = 0L;
		byte i_55_ = 0;
		while (l < 0L || l_54_ < l) {
			int i_56_ = (int) l_54_ & anInt7068 * -902599263;
			if (aClass325_7053.method5735(aShortArray7054, i_56_ + (i << 4), 1864531541) == 0) {
				Class540 class540 = aClass534_7065.method8948((int) l_54_, i_55_, 138594968);
				if (!Class456.method7425(i, 1112677709))
					i_55_ = (class540.method9007(aClass325_7053, aClass510_7060.method8441(i_50_, -406597490), 2073088808));
				else
					i_55_ = class540.method9009(aClass325_7053, (byte) -85);
				aClass510_7060.method8430(i_55_, 598172992);
				i = Class408.method6567(i, -943799355);
				l_54_++;
			} else {
				int i_57_;
				if (aClass325_7053.method5735(aShortArray7056, i, 1883726160) == 1) {
					i_57_ = 0;
					if (aClass325_7053.method5735(aShortArray7064, i, 1240067396) == 0) {
						if (aClass325_7053.method5735(aShortArray7059, i_56_ + (i << 4), 56811392) == 0) {
							i = Class453.method7336(i, 857315326);
							i_57_ = 1;
						}
					} else {
						int i_58_;
						if (aClass325_7053.method5735(aShortArray7057, i, 158558811) == 0)
							i_58_ = i_51_;
						else {
							if (aClass325_7053.method5735(aShortArray7058, i, 1161415967) == 0)
								i_58_ = i_52_;
							else {
								i_58_ = i_53_;
								i_53_ = i_52_;
							}
							i_52_ = i_51_;
						}
						i_51_ = i_50_;
						i_50_ = i_58_;
					}
					if (i_57_ == 0) {
						i_57_ = aClass524_7062.method8703(aClass325_7053, i_56_, (byte) 24) + 2;
						i = Class565.method9500(i, -2135436041);
					}
				} else {
					i_53_ = i_52_;
					i_52_ = i_51_;
					i_51_ = i_50_;
					i_57_ = 2 + aClass524_7063.method8703(aClass325_7053, i_56_, (byte) 10);
					i = Class205.method3828(i, (byte) -70);
					int i_59_ = aClass311Array7052[Class170_Sub1.method14739(i_57_, -200534014)].method5639(aClass325_7053, (byte) 51);
					if (i_59_ >= 4) {
						int i_60_ = (i_59_ >> 1) - 1;
						i_50_ = (0x2 | i_59_ & 0x1) << i_60_;
						if (i_59_ < 14)
							i_50_ += Class647.method10819(aShortArray7061, i_50_ - i_59_ - 1, aClass325_7053, i_60_, -88004625);
						else {
							i_50_ += aClass325_7053.method5734(i_60_ - 4, -1136006390) << 4;
							i_50_ += aClass311_7055.method5637(aClass325_7053, (byte) 84);
							if (i_50_ < 0) {
								if (-1 != i_50_)
									return false;
								break;
							}
						}
					} else
						i_50_ = i_59_;
				}
				if ((long) i_50_ >= l_54_ || i_50_ >= anInt7067 * 1054705891)
					return false;
				aClass510_7060.method8429(i_50_, i_57_, -78845949);
				l_54_ += (long) i_57_;
				i_55_ = aClass510_7060.method8441(0, -406597490);
			}
		}
		aClass510_7060.method8425(2074280914);
		aClass510_7060.method8426((byte) 1);
		aClass325_7053.method5740(1769813785);
		return true;
	}

	boolean method8652(InputStream inputstream, OutputStream outputstream, long l) throws IOException {
		aClass325_7053.method5731(inputstream, 1599525381);
		aClass510_7060.method8434(outputstream, -1537675443);
		method8639(1964450023);
		int i = Class478.method7785(-1311987276);
		int i_61_ = 0;
		int i_62_ = 0;
		int i_63_ = 0;
		int i_64_ = 0;
		long l_65_ = 0L;
		byte i_66_ = 0;
		while (l < 0L || l_65_ < l) {
			int i_67_ = (int) l_65_ & anInt7068 * -902599263;
			if (aClass325_7053.method5735(aShortArray7054, i_67_ + (i << 4), 1191527985) == 0) {
				Class540 class540 = aClass534_7065.method8948((int) l_65_, i_66_, 1055478748);
				if (!Class456.method7425(i, 641421819))
					i_66_ = (class540.method9007(aClass325_7053, aClass510_7060.method8441(i_61_, -406597490), 2073088808));
				else
					i_66_ = class540.method9009(aClass325_7053, (byte) -67);
				aClass510_7060.method8430(i_66_, 598172992);
				i = Class408.method6567(i, 1888406154);
				l_65_++;
			} else {
				int i_68_;
				if (aClass325_7053.method5735(aShortArray7056, i, 377291454) == 1) {
					i_68_ = 0;
					if (aClass325_7053.method5735(aShortArray7064, i, 1172948948) == 0) {
						if (aClass325_7053.method5735(aShortArray7059, i_67_ + (i << 4), 1726954400) == 0) {
							i = Class453.method7336(i, 857315326);
							i_68_ = 1;
						}
					} else {
						int i_69_;
						if (aClass325_7053.method5735(aShortArray7057, i, 1306438543) == 0)
							i_69_ = i_62_;
						else {
							if (aClass325_7053.method5735(aShortArray7058, i, 2124419895) == 0)
								i_69_ = i_63_;
							else {
								i_69_ = i_64_;
								i_64_ = i_63_;
							}
							i_63_ = i_62_;
						}
						i_62_ = i_61_;
						i_61_ = i_69_;
					}
					if (i_68_ == 0) {
						i_68_ = aClass524_7062.method8703(aClass325_7053, i_67_, (byte) 94) + 2;
						i = Class565.method9500(i, -2113336400);
					}
				} else {
					i_64_ = i_63_;
					i_63_ = i_62_;
					i_62_ = i_61_;
					i_68_ = 2 + aClass524_7063.method8703(aClass325_7053, i_67_, (byte) -73);
					i = Class205.method3828(i, (byte) 65);
					int i_70_ = aClass311Array7052[Class170_Sub1.method14739(i_68_, -1650584991)].method5639(aClass325_7053, (byte) -52);
					if (i_70_ >= 4) {
						int i_71_ = (i_70_ >> 1) - 1;
						i_61_ = (0x2 | i_70_ & 0x1) << i_71_;
						if (i_70_ < 14)
							i_61_ += Class647.method10819(aShortArray7061, i_61_ - i_70_ - 1, aClass325_7053, i_71_, -88004625);
						else {
							i_61_ += aClass325_7053.method5734(i_71_ - 4, -585796668) << 4;
							i_61_ += aClass311_7055.method5637(aClass325_7053, (byte) 94);
							if (i_61_ < 0) {
								if (-1 != i_61_)
									return false;
								break;
							}
						}
					} else
						i_61_ = i_70_;
				}
				if ((long) i_61_ >= l_65_ || i_61_ >= anInt7067 * 1054705891)
					return false;
				aClass510_7060.method8429(i_61_, i_68_, -78845949);
				l_65_ += (long) i_68_;
				i_66_ = aClass510_7060.method8441(0, -406597490);
			}
		}
		aClass510_7060.method8425(-462463817);
		aClass510_7060.method8426((byte) 1);
		aClass325_7053.method5740(1769813785);
		return true;
	}

	boolean method8653(int i) {
		if (i < 0)
			return false;
		if (anInt7066 * 781014917 != i) {
			anInt7066 = i * -342554291;
			anInt7067 = Math.max(781014917 * anInt7066, 1) * 858258635;
			aClass510_7060.method8424(Math.max(anInt7067 * 1054705891, 4096), 1240034464);
		}
		return true;
	}

	boolean method8654(int i, int i_72_, int i_73_) {
		if (i > 8 || i_72_ > 4 || i_73_ > 4)
			return false;
		aClass534_7065.method8954(i_72_, i, -1594756615);
		int i_74_ = 1 << i_73_;
		aClass524_7063.method8712(i_74_, (byte) 70);
		aClass524_7062.method8712(i_74_, (byte) 40);
		anInt7068 = 1270068833 * (i_74_ - 1);
		return true;
	}

	static final void method8655(Class665 class665, int i) {
		int i_75_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		Class243 class243 = Class648.method10837(i_75_, 995923510);
		Class240 class240 = Class183.aClass240Array2100[i_75_ >> 16];
		Class160.method2581(class243, class240, class665, -925223894);
	}

	static final void method8656(Class665 class665, int i) {
		Class674 class674 = (class665.aBool8549 ? class665.aClass674_8534 : class665.aClass674_8533);
		Class243 class243 = class674.aClass243_8587;
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = -1768842777 * class243.anInt2545;
	}

	public static final Class243 method8657(Class240 class240, Class243 class243, int i) {
		if (class243.anInt2536 * -1774688479 != -1)
			return class240.method4386(-1774688479 * class243.anInt2536, -2023305225);
		if (!class240.aBool2394) {
			int i_76_ = -254728301 * class243.anInt2504 >>> 16;
			Class10 class10 = new Class10(client.aClass14_11276);
			for (Class527_Sub41 class527_sub41 = (Class527_Sub41) class10.method673(-1386041862); class527_sub41 != null; class527_sub41 = (Class527_Sub41) class10.next()) {
				if (i_76_ == 1307137747 * class527_sub41.anInt10752)
					return Class648.method10837((int) (-8168620736534281759L * (class527_sub41.aLong7106)), 143771882);
			}
		}
		return null;
	}

	static void method8658(Class665 class665, int i) {
		class665.anIntArray8525[class665.anInt8526 * 1769813785 - 1] = ((Class259) Class590.aClass62_Sub1_7793.method81((class665.anIntArray8525[(class665.anInt8526 * 1769813785) - 1]), 542676799)).method4777(Class671.aClass97_8584, (byte) -10) ? 1 : 0;
	}

	static void method8659(int i, int i_77_) {
		/* empty */
	}

	public static final boolean method8660(String string, String string_78_, String string_79_, String string_80_, short i) {
		if (null == string || null == string_79_)
			return false;
		if (string.startsWith("#") || string_79_.startsWith("#"))
			return string.equals(string_79_);
		return string_78_.equals(string_80_);
	}
}
