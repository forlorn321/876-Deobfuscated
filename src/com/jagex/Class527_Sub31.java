/* Class527_Sub31 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class527_Sub31 extends Class527 {
	static final int anInt10582 = 23;
	Class700_Sub36 aClass700_Sub36_10583;
	public static final int anInt10584 = 245;
	public Class700_Sub11 aClass700_Sub11_10585;
	Class678 aClass678_10586;
	public static final int anInt10587 = 500;
	public Class700_Sub35 aClass700_Sub35_10588;
	public Class700_Sub37 aClass700_Sub37_10589;
	static final int anInt10590 = 36;
	public Class700_Sub24 aClass700_Sub24_10591;
	public Class700_Sub42 aClass700_Sub42_10592;
	public Class700_Sub14 aClass700_Sub14_10593;
	public Class700_Sub17 aClass700_Sub17_10594;
	public Class700_Sub43 aClass700_Sub43_10595;
	public Class700_Sub2 aClass700_Sub2_10596;
	public Class700_Sub12 aClass700_Sub12_10597;
	public Class700_Sub15 aClass700_Sub15_10598;
	public Class700_Sub34 aClass700_Sub34_10599;
	public Class700_Sub4 aClass700_Sub4_10600;
	public Class700_Sub8 aClass700_Sub8_10601;
	public Class700_Sub26 aClass700_Sub26_10602;
	public Class700_Sub1 aClass700_Sub1_10603;
	public Class700_Sub40 aClass700_Sub40_10604;
	public Class700_Sub3 aClass700_Sub3_10605;
	public Class700_Sub20 aClass700_Sub20_10606;
	public Class700_Sub13 aClass700_Sub13_10607;
	public Class700_Sub13 aClass700_Sub13_10608;
	public Class700_Sub33 aClass700_Sub33_10609;
	public Class700_Sub9 aClass700_Sub9_10610;
	public Class700_Sub10 aClass700_Sub10_10611;
	public Class700_Sub29 aClass700_Sub29_10612;
	public Class700_Sub7 aClass700_Sub7_10613;
	Class708 aClass708_10614;
	public Class700_Sub18 aClass700_Sub18_10615;
	Class700_Sub6 aClass700_Sub6_10616;
	public Class700_Sub2 aClass700_Sub2_10617;
	Class700_Sub16 aClass700_Sub16_10618;
	Class700_Sub30 aClass700_Sub30_10619;
	public Class700_Sub32 aClass700_Sub32_10620;
	Class700_Sub5 aClass700_Sub5_10621;
	Class700_Sub27 aClass700_Sub27_10622;
	Class700_Sub25 aClass700_Sub25_10623;
	Class700_Sub28 aClass700_Sub28_10624;
	Class700_Sub19 aClass700_Sub19_10625;
	public Class700_Sub41 aClass700_Sub41_10626;
	public Class700_Sub39 aClass700_Sub39_10627;
	public Class700_Sub31 aClass700_Sub31_10628;
	public Class700_Sub7 aClass700_Sub7_10629;
	public Class700_Sub38 aClass700_Sub38_10630;
	public Class700_Sub22 aClass700_Sub22_10631;
	Class700_Sub23 aClass700_Sub23_10632;
	public Class700_Sub24 aClass700_Sub24_10633;
	public Class700_Sub24 aClass700_Sub24_10634;
	public Class700_Sub24 aClass700_Sub24_10635;
	public Class700_Sub24 aClass700_Sub24_10636;
	public Class700_Sub37 aClass700_Sub37_10637;
	public Class700_Sub21 aClass700_Sub21_10638;
	static final int anInt10639 = 52;

	public Class708 method16325() {
		return aClass708_10614;
	}

	public Class527_Sub31(RSByteBuffer class527_sub38, Class678 class678, int i) {
		aClass678_10586 = class678;
		aClass708_10614 = new Class708(Class515.anInt7045 * 814176903, Class515.anInt7046 * -776525997, Class193.aString2155.indexOf("arm") != -1, Class234.aString2373.startsWith("win"), false);
		aClass700_Sub7_10629 = new Class700_Sub7(i, this);
		method16326(class527_sub38, -2007385452);
	}

	void method16326(RSByteBuffer class527_sub38, int i) {
		if (class527_sub38 == null || class527_sub38.buffer == null)
			method16335(true, true, -1965071553);
		else {
			int i_0_ = class527_sub38.readUnsignedByte();
			if (i_0_ < 23) {
				try {
					method16328(class527_sub38, i_0_, (byte) 1);
				} catch (Exception exception) {
					method16335(true, true, -1692688503);
				}
				method16335(false, true, -1908263059);
			} else if (i_0_ > 36)
				method16335(true, true, -1544509427);
			else {
				if (i_0_ >= 29)
					aClass700_Sub35_10588 = new Class700_Sub35(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub37_10589 = new Class700_Sub37(class527_sub38.readUnsignedByte(), this);
				if (i_0_ >= 31)
					aClass700_Sub36_10583 = new Class700_Sub36(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub37_10637 = new Class700_Sub37(aClass700_Sub37_10589.method17279((byte) 102), this);
				aClass700_Sub42_10592 = new Class700_Sub42(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub14_10593 = new Class700_Sub14(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub17_10594 = new Class700_Sub17(class527_sub38.readUnsignedByte(), this);
				if (i_0_ >= 27)
					aClass700_Sub33_10609 = new Class700_Sub33(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub12_10597 = new Class700_Sub12(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub15_10598 = new Class700_Sub15(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub40_10604 = new Class700_Sub40(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub4_10600 = new Class700_Sub4(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub26_10602 = new Class700_Sub26(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub8_10601 = new Class700_Sub8(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub1_10603 = new Class700_Sub1(class527_sub38.readUnsignedByte(), this);
				if (i_0_ >= 33)
					aClass700_Sub11_10585 = new Class700_Sub11(class527_sub38.readUnsignedByte(), this);
				if (i_0_ >= 34)
					class527_sub38.readUnsignedByte();
				if (i_0_ >= 24)
					aClass700_Sub3_10605 = new Class700_Sub3(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub20_10606 = new Class700_Sub20(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub13_10607 = new Class700_Sub13(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub13_10608 = new Class700_Sub13(aClass700_Sub13_10607.method16964((byte) -109), this);
				aClass700_Sub32_10620 = new Class700_Sub32(class527_sub38.readUnsignedByte(), this);
				if (i_0_ >= 25)
					aClass700_Sub34_10599 = new Class700_Sub34(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub10_10611 = new Class700_Sub10(class527_sub38.readUnsignedByte(), this);
				if (i_0_ <= 25)
					class527_sub38.anInt10689 += 1474750881;
				aClass700_Sub9_10610 = new Class700_Sub9(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub7_10613 = new Class700_Sub7(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub7_10629 = new Class700_Sub7(aClass700_Sub7_10613.method16894(-404651305), this);
				class527_sub38.readUnsignedByte();
				aClass700_Sub18_10615 = new Class700_Sub18(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub2_10596 = new Class700_Sub2(class527_sub38.readUnsignedByte(), this);
				if (i_0_ >= 35) {
					aClass700_Sub30_10619 = new Class700_Sub30(class527_sub38.readUnsignedByte(), this);
					aClass700_Sub6_10616 = new Class700_Sub6(class527_sub38.readUnsignedByte(), this);
					aClass700_Sub5_10621 = new Class700_Sub5(class527_sub38.readUnsignedByte(), this);
					aClass700_Sub16_10618 = new Class700_Sub16(class527_sub38.readUnsignedByte(), this);
					aClass700_Sub27_10622 = new Class700_Sub27(class527_sub38.readUnsignedByte(), this);
					aClass700_Sub25_10623 = new Class700_Sub25(class527_sub38.readByte(), this);
				}
				if (i_0_ >= 36) {
					aClass700_Sub28_10624 = new Class700_Sub28(class527_sub38.readUnsignedByte(), this);
					aClass700_Sub19_10625 = new Class700_Sub19(class527_sub38.readUnsignedByte(), this);
				}
				aClass700_Sub2_10617 = new Class700_Sub2(aClass700_Sub2_10596.method16853((byte) 5), this);
				aClass700_Sub41_10626 = new Class700_Sub41(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub39_10627 = new Class700_Sub39(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub31_10628 = new Class700_Sub31(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub29_10612 = new Class700_Sub29(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub38_10630 = new Class700_Sub38(class527_sub38.readUnsignedByte(), this);
				if (i_0_ >= 26)
					aClass700_Sub22_10631 = new Class700_Sub22(class527_sub38.readUnsignedByte(), this);
				if (i_0_ >= 28)
					aClass700_Sub23_10632 = new Class700_Sub23(class527_sub38.readUnsignedByte(), this);
				if (i_0_ >= 30)
					aClass700_Sub43_10595 = new Class700_Sub43(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub24_10633 = new Class700_Sub24(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub24_10634 = new Class700_Sub24(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub24_10635 = new Class700_Sub24(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub24_10636 = new Class700_Sub24(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub24_10591 = new Class700_Sub24(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub21_10638 = new Class700_Sub21(class527_sub38.readUnsignedByte(), this);
				method16335(false, i_0_ < 32, -1370670551);
			}
		}
		method16332(-124591531);
	}

	void method16327() {
		aClass700_Sub35_10588.method17260(-1052628595);
		aClass700_Sub37_10589.method17278(-1954204980);
		aClass700_Sub36_10583.method17271((byte) 72);
		aClass700_Sub37_10637.method17278(-2036228477);
		aClass700_Sub42_10592.method17318(439078026);
		aClass700_Sub14_10593.method16968((byte) -113);
		aClass700_Sub17_10594.method17007(-383322012);
		aClass700_Sub33_10609.method17245((byte) 45);
		aClass700_Sub12_10597.method16958(-1847224667);
		aClass700_Sub15_10598.method16985(408933829);
		aClass700_Sub40_10604.method17295(1213585784);
		aClass700_Sub4_10600.method16872(822590572);
		aClass700_Sub26_10602.method17185(-2063334108);
		aClass700_Sub8_10601.method16914(-1357244730);
		aClass700_Sub1_10603.method16846((byte) 70);
		aClass700_Sub11_10585.method16945(-857217789);
		aClass700_Sub3_10605.method16856(929012229);
		aClass700_Sub20_10606.method17109((byte) 0);
		aClass700_Sub13_10607.method16965((byte) 103);
		aClass700_Sub13_10608.method16965((byte) 29);
		aClass700_Sub32_10620.method17240(84589214);
		aClass700_Sub34_10599.method17251(672380825);
		aClass700_Sub10_10611.method16936(1705130370);
		aClass700_Sub9_10610.method16923((byte) 37);
		aClass700_Sub7_10613.method16896(-1275882393);
		aClass700_Sub7_10629.method16896(-1275882393);
		aClass700_Sub18_10615.method17016((byte) 13);
		aClass700_Sub2_10596.method16852(-1378656211);
		aClass700_Sub2_10617.method16852(-1731851775);
		aClass700_Sub16_10618.method17001(887401420);
		aClass700_Sub30_10619.method17219((byte) 31);
		aClass700_Sub6_10616.method16888(-320796209);
		aClass700_Sub5_10621.method16884((byte) -77);
		aClass700_Sub27_10622.method17194(-606505539);
		aClass700_Sub25_10623.method17142(-2007465434);
		aClass700_Sub28_10624.method17199((byte) 2);
		aClass700_Sub19_10625.method17026(-1983678516);
		aClass700_Sub41_10626.method17308(1556060254);
		aClass700_Sub39_10627.method17289(1949303345);
		aClass700_Sub31_10628.method17222((byte) -61);
		aClass700_Sub29_10612.method17207(-989194242);
		aClass700_Sub38_10630.method17283((byte) 62);
		aClass700_Sub22_10631.method17119((byte) 0);
		aClass700_Sub23_10632.method17135(784881143);
		aClass700_Sub43_10595.method17329(-285868292);
		aClass700_Sub24_10633.method17137(-2110152538);
		aClass700_Sub24_10634.method17137(1669035555);
		aClass700_Sub24_10635.method17137(-445327200);
		aClass700_Sub24_10636.method17137(-1417559329);
		aClass700_Sub24_10591.method17137(-1964869296);
		aClass700_Sub21_10638.method17113(-1913387329);
	}

	void method16328(RSByteBuffer class527_sub38, int i, byte i_1_) {
		aClass700_Sub14_10593 = new Class700_Sub14(class527_sub38.readUnsignedByte(), this);
		class527_sub38.anInt10689 += 1474750881;
		aClass700_Sub13_10607 = new Class700_Sub13(class527_sub38.readUnsignedByte() + 1, this);
		aClass700_Sub4_10600 = new Class700_Sub4(class527_sub38.readUnsignedByte(), this);
		class527_sub38.anInt10689 += 1474750881;
		aClass700_Sub26_10602 = new Class700_Sub26(class527_sub38.readUnsignedByte(), this);
		aClass700_Sub12_10597 = new Class700_Sub12(class527_sub38.readUnsignedByte(), this);
		class527_sub38.readUnsignedByte();
		aClass700_Sub10_10611 = new Class700_Sub10(class527_sub38.readUnsignedByte(), this);
		int i_2_ = class527_sub38.readUnsignedByte();
		int i_3_ = 0;
		if (i >= 17)
			i_3_ = class527_sub38.readUnsignedByte();
		aClass700_Sub1_10603 = new Class700_Sub1(i_2_ > i_3_ ? i_2_ : i_3_, this);
		boolean bool = true;
		boolean bool_4_ = true;
		if (i >= 2) {
			bool = class527_sub38.readUnsignedByte() == 1;
			if (i >= 17)
				bool_4_ = class527_sub38.readUnsignedByte() == 1;
		} else {
			bool = class527_sub38.readUnsignedByte() == 1;
			class527_sub38.readUnsignedByte();
		}
		aClass700_Sub8_10601 = new Class700_Sub8(bool | bool_4_ ? 1 : 0, this);
		aClass700_Sub18_10615 = new Class700_Sub18(class527_sub38.readUnsignedByte(), this);
		aClass700_Sub15_10598 = new Class700_Sub15(class527_sub38.readUnsignedByte(), this);
		aClass700_Sub37_10589 = new Class700_Sub37(class527_sub38.readUnsignedByte(), this);
		aClass700_Sub21_10638 = new Class700_Sub21(class527_sub38.readUnsignedByte(), this);
		aClass700_Sub24_10633 = new Class700_Sub24(class527_sub38.readUnsignedByte(), this);
		if (i >= 20)
			aClass700_Sub24_10635 = new Class700_Sub24(class527_sub38.readUnsignedByte(), this);
		else
			aClass700_Sub24_10635 = new Class700_Sub24(aClass700_Sub24_10633.method17139((byte) -67), this);
		aClass700_Sub24_10636 = new Class700_Sub24(class527_sub38.readUnsignedByte(), this);
		aClass700_Sub24_10634 = new Class700_Sub24(class527_sub38.readUnsignedByte(), this);
		if (i >= 21)
			aClass700_Sub24_10591 = new Class700_Sub24(class527_sub38.readUnsignedByte(), this);
		else
			aClass700_Sub24_10591 = new Class700_Sub24(aClass700_Sub24_10636.method17139((byte) 50), this);
		if (i >= 1) {
			class527_sub38.readUnsignedShort();
			class527_sub38.readUnsignedShort();
		}
		if (i >= 3 && i < 6)
			class527_sub38.readUnsignedByte();
		if (i >= 4)
			aClass700_Sub20_10606 = new Class700_Sub20(class527_sub38.readUnsignedByte(), this);
		class527_sub38.readInt();
		if (i >= 6)
			aClass700_Sub2_10596 = new Class700_Sub2(class527_sub38.readUnsignedByte(), this);
		if (i >= 7)
			aClass700_Sub38_10630 = new Class700_Sub38(class527_sub38.readUnsignedByte(), this);
		if (i >= 8)
			class527_sub38.readUnsignedByte();
		if (i >= 9)
			aClass700_Sub17_10594 = new Class700_Sub17(class527_sub38.readUnsignedByte(), this);
		if (i >= 10)
			aClass700_Sub42_10592 = new Class700_Sub42(class527_sub38.readUnsignedByte(), this);
		if (i >= 11)
			aClass700_Sub41_10626 = new Class700_Sub41(class527_sub38.readUnsignedByte(), this);
		if (i >= 12)
			aClass700_Sub26_10602 = new Class700_Sub26(class527_sub38.readUnsignedByte(), this);
		if (i >= 13)
			aClass700_Sub40_10604 = new Class700_Sub40(class527_sub38.readUnsignedByte(), this);
		if (i >= 14)
			aClass700_Sub7_10613 = new Class700_Sub7(class527_sub38.readUnsignedByte(), this);
		if (i >= 15)
			aClass700_Sub31_10628 = new Class700_Sub31(class527_sub38.readUnsignedByte(), this);
		if (i >= 16)
			aClass700_Sub9_10610 = new Class700_Sub9(class527_sub38.readUnsignedByte(), this);
		if (i >= 18)
			aClass700_Sub39_10627 = new Class700_Sub39(class527_sub38.readUnsignedByte(), this);
		if (i >= 19)
			aClass700_Sub32_10620 = new Class700_Sub32(class527_sub38.readUnsignedByte(), this);
		if (i >= 22)
			aClass700_Sub29_10612 = new Class700_Sub29(class527_sub38.readUnsignedByte(), this);
	}

	public RSByteBuffer method16329(int i) {
		RSByteBuffer class527_sub38 = new RSByteBuffer(52);
		class527_sub38.writeByte(36, -1581274119);
		class527_sub38.writeByte(aClass700_Sub35_10588.method17265((byte) -69), 1698608030);
		class527_sub38.writeByte(aClass700_Sub37_10589.method17279((byte) 100), 997286738);
		class527_sub38.writeByte(aClass700_Sub36_10583.method17269(-722807768), -1372528415);
		class527_sub38.writeByte(aClass700_Sub42_10592.method17324((byte) 31), -1137817328);
		class527_sub38.writeByte(aClass700_Sub14_10593.method16970((byte) -35), 2073226157);
		class527_sub38.writeByte(aClass700_Sub17_10594.method17010((byte) -2), -1925103610);
		class527_sub38.writeByte(aClass700_Sub33_10609.method17247(1831204839), 615909628);
		class527_sub38.writeByte(aClass700_Sub12_10597.method16954(864898249), 788055240);
		class527_sub38.writeByte(aClass700_Sub15_10598.method16992(907560021), -1018744429);
		class527_sub38.writeByte(aClass700_Sub40_10604.method17294(1433714603), -3365629);
		class527_sub38.writeByte(aClass700_Sub4_10600.method16875(325030072), 1492152792);
		class527_sub38.writeByte(aClass700_Sub26_10602.method17186((byte) 1), 648403910);
		class527_sub38.writeByte(aClass700_Sub8_10601.method16916(-1539148188), -1821546854);
		class527_sub38.writeByte(aClass700_Sub1_10603.method16843(1225063993), -635051304);
		class527_sub38.writeByte(aClass700_Sub11_10585.method16948(1430490031), -1879525656);
		class527_sub38.writeByte(0, -1118844671);
		class527_sub38.writeByte(aClass700_Sub3_10605.method16859(466054930), 361061084);
		class527_sub38.writeByte(aClass700_Sub20_10606.method17104(11272501), -875930270);
		class527_sub38.writeByte(aClass700_Sub13_10607.method16964((byte) -110), -1886158994);
		class527_sub38.writeByte(aClass700_Sub32_10620.method17239(925488840), 974634943);
		class527_sub38.writeByte(aClass700_Sub34_10599.method17253(-2018843157), -1902258365);
		class527_sub38.writeByte(aClass700_Sub10_10611.method16939((short) 1260), -174873135);
		class527_sub38.writeByte(aClass700_Sub9_10610.method16924(-1459046842), 1947805820);
		class527_sub38.writeByte(aClass700_Sub7_10613.method16894(-1354398983), -1714510441);
		class527_sub38.writeByte(0, -1009981559);
		class527_sub38.writeByte(aClass700_Sub18_10615.method17019(-1053690222), -1846422364);
		class527_sub38.writeByte(aClass700_Sub2_10596.method16853((byte) -61), -1209487625);
		class527_sub38.writeByte(aClass700_Sub30_10619.method17214(409514996), -633664401);
		class527_sub38.writeByte(aClass700_Sub6_10616.method16890(-1298953532), 1437033531);
		class527_sub38.writeByte(aClass700_Sub5_10621.method16883(-662046594), -464051289);
		class527_sub38.writeByte(aClass700_Sub16_10618.method17000((byte) -84), 1519245710);
		class527_sub38.writeByte(aClass700_Sub27_10622.method17195(-1750589640), 1180986494);
		class527_sub38.writeByte(aClass700_Sub25_10623.method17143((byte) 11), -1151353679);
		class527_sub38.writeByte(aClass700_Sub28_10624.method17200((short) -18828), 750569467);
		class527_sub38.writeByte(aClass700_Sub19_10625.method17027((byte) 72), -1295867194);
		class527_sub38.writeByte(aClass700_Sub41_10626.method17310(-1782337035), 1733008971);
		class527_sub38.writeByte(aClass700_Sub39_10627.method17290(-332646457), -214695657);
		class527_sub38.writeByte(aClass700_Sub31_10628.method17223(1059041630), 287902733);
		class527_sub38.writeByte(aClass700_Sub29_10612.method17209(617476540), -1284250896);
		class527_sub38.writeByte(aClass700_Sub38_10630.method17286(120006352), 1098421418);
		class527_sub38.writeByte(aClass700_Sub22_10631.method17121((byte) -41), 181611623);
		class527_sub38.writeByte(aClass700_Sub23_10632.method17129((short) -10449), 1142860189);
		class527_sub38.writeByte(aClass700_Sub43_10595.method17330(-556024353), 1223768624);
		class527_sub38.writeByte(aClass700_Sub24_10633.method17139((byte) 75), 751130309);
		class527_sub38.writeByte(aClass700_Sub24_10634.method17139((byte) 65), 1331801707);
		class527_sub38.writeByte(aClass700_Sub24_10635.method17139((byte) -19), 601711544);
		class527_sub38.writeByte(aClass700_Sub24_10636.method17139((byte) -19), -261080456);
		class527_sub38.writeByte(aClass700_Sub24_10591.method17139((byte) 6), -657573359);
		class527_sub38.writeByte(aClass700_Sub21_10638.method17114(555482308), 1103443391);
		return class527_sub38;
	}

	public void method16330(Class700_Sub7 class700_sub7, boolean bool) {
		class700_sub7.method16901(bool, -691000174);
		method16332(-124591531);
	}

	public void method16331(Class700_Sub7 class700_sub7, boolean bool, byte i) {
		class700_sub7.method16901(bool, -691000174);
		method16332(-124591531);
	}

	void method16332(int i) {
		aClass700_Sub35_10588.method17260(-1643982217);
		aClass700_Sub37_10589.method17278(-2121734176);
		aClass700_Sub36_10583.method17271((byte) 57);
		aClass700_Sub37_10637.method17278(-1971653225);
		aClass700_Sub42_10592.method17318(439078026);
		aClass700_Sub14_10593.method16968((byte) -26);
		aClass700_Sub17_10594.method17007(248647544);
		aClass700_Sub33_10609.method17245((byte) 51);
		aClass700_Sub12_10597.method16958(46877429);
		aClass700_Sub15_10598.method16985(408933829);
		aClass700_Sub40_10604.method17295(-1407564825);
		aClass700_Sub4_10600.method16872(1839440617);
		aClass700_Sub26_10602.method17185(-2132777590);
		aClass700_Sub8_10601.method16914(-586924716);
		aClass700_Sub1_10603.method16846((byte) 18);
		aClass700_Sub11_10585.method16945(-186941126);
		aClass700_Sub3_10605.method16856(929012229);
		aClass700_Sub20_10606.method17109((byte) 0);
		aClass700_Sub13_10607.method16965((byte) 123);
		aClass700_Sub13_10608.method16965((byte) 75);
		aClass700_Sub32_10620.method17240(-441416968);
		aClass700_Sub34_10599.method17251(1301417868);
		aClass700_Sub10_10611.method16936(2100418926);
		aClass700_Sub9_10610.method16923((byte) 62);
		aClass700_Sub7_10613.method16896(-1275882393);
		aClass700_Sub7_10629.method16896(-1275882393);
		aClass700_Sub18_10615.method17016((byte) 13);
		aClass700_Sub2_10596.method16852(691287251);
		aClass700_Sub2_10617.method16852(-1508629076);
		aClass700_Sub16_10618.method17001(1453481942);
		aClass700_Sub30_10619.method17219((byte) 34);
		aClass700_Sub6_10616.method16888(-320796209);
		aClass700_Sub5_10621.method16884((byte) -61);
		aClass700_Sub27_10622.method17194(1074766671);
		aClass700_Sub25_10623.method17142(-1234074745);
		aClass700_Sub28_10624.method17199((byte) 2);
		aClass700_Sub19_10625.method17026(-1277863169);
		aClass700_Sub41_10626.method17308(-1019848307);
		aClass700_Sub39_10627.method17289(1912359288);
		aClass700_Sub31_10628.method17222((byte) -36);
		aClass700_Sub29_10612.method17207(-541590590);
		aClass700_Sub38_10630.method17283((byte) 92);
		aClass700_Sub22_10631.method17119((byte) -40);
		aClass700_Sub23_10632.method17135(784881143);
		aClass700_Sub43_10595.method17329(-982342872);
		aClass700_Sub24_10633.method17137(1063360140);
		aClass700_Sub24_10634.method17137(-820049326);
		aClass700_Sub24_10635.method17137(952557573);
		aClass700_Sub24_10636.method17137(1878597965);
		aClass700_Sub24_10591.method17137(1341063329);
		aClass700_Sub21_10638.method17113(-1575493818);
	}

	public Class678 method16333(int i) {
		return aClass678_10586;
	}

	public Class708 method16334(int i) {
		return aClass708_10614;
	}

	void method16335(boolean bool, boolean bool_5_, int i) {
		if (bool || aClass700_Sub35_10588 == null)
			aClass700_Sub35_10588 = new Class700_Sub35(this);
		if (bool || null == aClass700_Sub37_10589)
			aClass700_Sub37_10589 = new Class700_Sub37(this);
		if (bool || null == aClass700_Sub36_10583)
			aClass700_Sub36_10583 = new Class700_Sub36(this);
		if (bool || aClass700_Sub37_10637 == null)
			aClass700_Sub37_10637 = new Class700_Sub37(aClass700_Sub37_10589.method17279((byte) 40), this);
		if (bool || aClass700_Sub42_10592 == null)
			aClass700_Sub42_10592 = new Class700_Sub42(this);
		if (bool || null == aClass700_Sub14_10593)
			aClass700_Sub14_10593 = new Class700_Sub14(this);
		if (bool || null == aClass700_Sub17_10594)
			aClass700_Sub17_10594 = new Class700_Sub17(this);
		if (bool || null == aClass700_Sub33_10609)
			aClass700_Sub33_10609 = new Class700_Sub33(this);
		if (bool || null == aClass700_Sub12_10597)
			aClass700_Sub12_10597 = new Class700_Sub12(this);
		if (bool || null == aClass700_Sub15_10598)
			aClass700_Sub15_10598 = new Class700_Sub15(this);
		if (bool || aClass700_Sub40_10604 == null)
			aClass700_Sub40_10604 = new Class700_Sub40(this);
		if (bool || null == aClass700_Sub4_10600)
			aClass700_Sub4_10600 = new Class700_Sub4(this);
		if (bool || null == aClass700_Sub26_10602)
			aClass700_Sub26_10602 = new Class700_Sub26(this);
		if (bool || null == aClass700_Sub8_10601)
			aClass700_Sub8_10601 = new Class700_Sub8(this);
		if (bool || null == aClass700_Sub1_10603)
			aClass700_Sub1_10603 = new Class700_Sub1(this);
		if (bool || aClass700_Sub11_10585 == null)
			aClass700_Sub11_10585 = new Class700_Sub11(this);
		if (bool || null == aClass700_Sub3_10605)
			aClass700_Sub3_10605 = new Class700_Sub3(this);
		if (bool || aClass700_Sub20_10606 == null)
			aClass700_Sub20_10606 = new Class700_Sub20(this);
		if (bool || aClass700_Sub13_10607 == null)
			aClass700_Sub13_10607 = new Class700_Sub13(this);
		if (bool || null == aClass700_Sub13_10608)
			aClass700_Sub13_10608 = new Class700_Sub13(aClass700_Sub13_10607.method16964((byte) -27), this);
		if (bool || null == aClass700_Sub32_10620)
			aClass700_Sub32_10620 = new Class700_Sub32(this);
		if (bool || aClass700_Sub34_10599 == null)
			aClass700_Sub34_10599 = new Class700_Sub34(this);
		if (bool || aClass700_Sub10_10611 == null)
			aClass700_Sub10_10611 = new Class700_Sub10(this);
		if (bool || aClass700_Sub9_10610 == null)
			aClass700_Sub9_10610 = new Class700_Sub9(this);
		if (bool || null == aClass700_Sub7_10613)
			aClass700_Sub7_10613 = new Class700_Sub7(this);
		if (bool || aClass700_Sub7_10629 == null)
			aClass700_Sub7_10629 = new Class700_Sub7(aClass700_Sub7_10613.method16894(-1098249755), this);
		if (bool || aClass700_Sub18_10615 == null)
			aClass700_Sub18_10615 = new Class700_Sub18(this);
		if (bool || null == aClass700_Sub2_10596)
			aClass700_Sub2_10596 = new Class700_Sub2(this);
		if (bool || null == aClass700_Sub2_10617)
			aClass700_Sub2_10617 = new Class700_Sub2(aClass700_Sub2_10596.method16853((byte) -35), this);
		if (bool || aClass700_Sub16_10618 == null)
			aClass700_Sub16_10618 = new Class700_Sub16(this);
		if (bool || null == aClass700_Sub30_10619)
			aClass700_Sub30_10619 = new Class700_Sub30(this);
		if (bool || null == aClass700_Sub6_10616)
			aClass700_Sub6_10616 = new Class700_Sub6(this);
		if (bool || null == aClass700_Sub5_10621)
			aClass700_Sub5_10621 = new Class700_Sub5(this);
		if (bool || null == aClass700_Sub27_10622)
			aClass700_Sub27_10622 = new Class700_Sub27(this);
		if (bool || aClass700_Sub25_10623 == null)
			aClass700_Sub25_10623 = new Class700_Sub25(this);
		if (bool || aClass700_Sub28_10624 == null)
			aClass700_Sub28_10624 = new Class700_Sub28(this);
		if (bool || aClass700_Sub19_10625 == null)
			aClass700_Sub19_10625 = new Class700_Sub19(this);
		if (bool || null == aClass700_Sub41_10626)
			aClass700_Sub41_10626 = new Class700_Sub41(this);
		if (bool || aClass700_Sub39_10627 == null)
			aClass700_Sub39_10627 = new Class700_Sub39(this);
		if (bool || aClass700_Sub31_10628 == null)
			aClass700_Sub31_10628 = new Class700_Sub31(this);
		if (bool || null == aClass700_Sub29_10612)
			aClass700_Sub29_10612 = new Class700_Sub29(this);
		if (bool || aClass700_Sub38_10630 == null)
			aClass700_Sub38_10630 = new Class700_Sub38(this);
		if (bool || null == aClass700_Sub22_10631)
			aClass700_Sub22_10631 = new Class700_Sub22(this);
		if (bool || null == aClass700_Sub23_10632)
			aClass700_Sub23_10632 = new Class700_Sub23(this);
		if (bool || aClass700_Sub43_10595 == null)
			aClass700_Sub43_10595 = new Class700_Sub43(this);
		if (bool || bool_5_ || null == aClass700_Sub24_10633)
			aClass700_Sub24_10633 = new Class700_Sub24(this);
		if (bool || bool_5_ || aClass700_Sub24_10634 == null)
			aClass700_Sub24_10634 = new Class700_Sub24(this);
		if (bool || bool_5_ || null == aClass700_Sub24_10635)
			aClass700_Sub24_10635 = new Class700_Sub24(this);
		if (bool || bool_5_ || aClass700_Sub24_10636 == null)
			aClass700_Sub24_10636 = new Class700_Sub24(this);
		if (bool || bool_5_ || null == aClass700_Sub24_10591)
			aClass700_Sub24_10591 = new Class700_Sub24(this);
		if (bool || bool_5_ || aClass700_Sub21_10638 == null)
			aClass700_Sub21_10638 = new Class700_Sub21(this);
	}

	void method16336(RSByteBuffer class527_sub38) {
		if (class527_sub38 == null || class527_sub38.buffer == null)
			method16335(true, true, -1044688149);
		else {
			int i = class527_sub38.readUnsignedByte();
			if (i < 23) {
				try {
					method16328(class527_sub38, i, (byte) 1);
				} catch (Exception exception) {
					method16335(true, true, -1430480844);
				}
				method16335(false, true, -1809734008);
			} else if (i > 36)
				method16335(true, true, -890960633);
			else {
				if (i >= 29)
					aClass700_Sub35_10588 = new Class700_Sub35(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub37_10589 = new Class700_Sub37(class527_sub38.readUnsignedByte(), this);
				if (i >= 31)
					aClass700_Sub36_10583 = new Class700_Sub36(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub37_10637 = new Class700_Sub37(aClass700_Sub37_10589.method17279((byte) 54), this);
				aClass700_Sub42_10592 = new Class700_Sub42(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub14_10593 = new Class700_Sub14(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub17_10594 = new Class700_Sub17(class527_sub38.readUnsignedByte(), this);
				if (i >= 27)
					aClass700_Sub33_10609 = new Class700_Sub33(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub12_10597 = new Class700_Sub12(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub15_10598 = new Class700_Sub15(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub40_10604 = new Class700_Sub40(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub4_10600 = new Class700_Sub4(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub26_10602 = new Class700_Sub26(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub8_10601 = new Class700_Sub8(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub1_10603 = new Class700_Sub1(class527_sub38.readUnsignedByte(), this);
				if (i >= 33)
					aClass700_Sub11_10585 = new Class700_Sub11(class527_sub38.readUnsignedByte(), this);
				if (i >= 34)
					class527_sub38.readUnsignedByte();
				if (i >= 24)
					aClass700_Sub3_10605 = new Class700_Sub3(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub20_10606 = new Class700_Sub20(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub13_10607 = new Class700_Sub13(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub13_10608 = new Class700_Sub13(aClass700_Sub13_10607.method16964((byte) -54), this);
				aClass700_Sub32_10620 = new Class700_Sub32(class527_sub38.readUnsignedByte(), this);
				if (i >= 25)
					aClass700_Sub34_10599 = new Class700_Sub34(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub10_10611 = new Class700_Sub10(class527_sub38.readUnsignedByte(), this);
				if (i <= 25)
					class527_sub38.anInt10689 += 1474750881;
				aClass700_Sub9_10610 = new Class700_Sub9(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub7_10613 = new Class700_Sub7(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub7_10629 = new Class700_Sub7(aClass700_Sub7_10613.method16894(-1979651360), this);
				class527_sub38.readUnsignedByte();
				aClass700_Sub18_10615 = new Class700_Sub18(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub2_10596 = new Class700_Sub2(class527_sub38.readUnsignedByte(), this);
				if (i >= 35) {
					aClass700_Sub30_10619 = new Class700_Sub30(class527_sub38.readUnsignedByte(), this);
					aClass700_Sub6_10616 = new Class700_Sub6(class527_sub38.readUnsignedByte(), this);
					aClass700_Sub5_10621 = new Class700_Sub5(class527_sub38.readUnsignedByte(), this);
					aClass700_Sub16_10618 = new Class700_Sub16(class527_sub38.readUnsignedByte(), this);
					aClass700_Sub27_10622 = new Class700_Sub27(class527_sub38.readUnsignedByte(), this);
					aClass700_Sub25_10623 = new Class700_Sub25(class527_sub38.readByte(), this);
				}
				if (i >= 36) {
					aClass700_Sub28_10624 = new Class700_Sub28(class527_sub38.readUnsignedByte(), this);
					aClass700_Sub19_10625 = new Class700_Sub19(class527_sub38.readUnsignedByte(), this);
				}
				aClass700_Sub2_10617 = new Class700_Sub2(aClass700_Sub2_10596.method16853((byte) -21), this);
				aClass700_Sub41_10626 = new Class700_Sub41(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub39_10627 = new Class700_Sub39(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub31_10628 = new Class700_Sub31(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub29_10612 = new Class700_Sub29(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub38_10630 = new Class700_Sub38(class527_sub38.readUnsignedByte(), this);
				if (i >= 26)
					aClass700_Sub22_10631 = new Class700_Sub22(class527_sub38.readUnsignedByte(), this);
				if (i >= 28)
					aClass700_Sub23_10632 = new Class700_Sub23(class527_sub38.readUnsignedByte(), this);
				if (i >= 30)
					aClass700_Sub43_10595 = new Class700_Sub43(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub24_10633 = new Class700_Sub24(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub24_10634 = new Class700_Sub24(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub24_10635 = new Class700_Sub24(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub24_10636 = new Class700_Sub24(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub24_10591 = new Class700_Sub24(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub21_10638 = new Class700_Sub21(class527_sub38.readUnsignedByte(), this);
				method16335(false, i < 32, -1419023070);
			}
		}
		method16332(-124591531);
	}

	void method16337(RSByteBuffer class527_sub38) {
		if (class527_sub38 == null || class527_sub38.buffer == null)
			method16335(true, true, -889723561);
		else {
			int i = class527_sub38.readUnsignedByte();
			if (i < 23) {
				try {
					method16328(class527_sub38, i, (byte) 1);
				} catch (Exception exception) {
					method16335(true, true, -1003263093);
				}
				method16335(false, true, -820882503);
			} else if (i > 36)
				method16335(true, true, -1492934802);
			else {
				if (i >= 29)
					aClass700_Sub35_10588 = new Class700_Sub35(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub37_10589 = new Class700_Sub37(class527_sub38.readUnsignedByte(), this);
				if (i >= 31)
					aClass700_Sub36_10583 = new Class700_Sub36(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub37_10637 = new Class700_Sub37(aClass700_Sub37_10589.method17279((byte) 18), this);
				aClass700_Sub42_10592 = new Class700_Sub42(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub14_10593 = new Class700_Sub14(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub17_10594 = new Class700_Sub17(class527_sub38.readUnsignedByte(), this);
				if (i >= 27)
					aClass700_Sub33_10609 = new Class700_Sub33(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub12_10597 = new Class700_Sub12(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub15_10598 = new Class700_Sub15(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub40_10604 = new Class700_Sub40(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub4_10600 = new Class700_Sub4(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub26_10602 = new Class700_Sub26(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub8_10601 = new Class700_Sub8(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub1_10603 = new Class700_Sub1(class527_sub38.readUnsignedByte(), this);
				if (i >= 33)
					aClass700_Sub11_10585 = new Class700_Sub11(class527_sub38.readUnsignedByte(), this);
				if (i >= 34)
					class527_sub38.readUnsignedByte();
				if (i >= 24)
					aClass700_Sub3_10605 = new Class700_Sub3(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub20_10606 = new Class700_Sub20(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub13_10607 = new Class700_Sub13(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub13_10608 = new Class700_Sub13(aClass700_Sub13_10607.method16964((byte) -84), this);
				aClass700_Sub32_10620 = new Class700_Sub32(class527_sub38.readUnsignedByte(), this);
				if (i >= 25)
					aClass700_Sub34_10599 = new Class700_Sub34(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub10_10611 = new Class700_Sub10(class527_sub38.readUnsignedByte(), this);
				if (i <= 25)
					class527_sub38.anInt10689 += 1474750881;
				aClass700_Sub9_10610 = new Class700_Sub9(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub7_10613 = new Class700_Sub7(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub7_10629 = new Class700_Sub7(aClass700_Sub7_10613.method16894(-357741440), this);
				class527_sub38.readUnsignedByte();
				aClass700_Sub18_10615 = new Class700_Sub18(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub2_10596 = new Class700_Sub2(class527_sub38.readUnsignedByte(), this);
				if (i >= 35) {
					aClass700_Sub30_10619 = new Class700_Sub30(class527_sub38.readUnsignedByte(), this);
					aClass700_Sub6_10616 = new Class700_Sub6(class527_sub38.readUnsignedByte(), this);
					aClass700_Sub5_10621 = new Class700_Sub5(class527_sub38.readUnsignedByte(), this);
					aClass700_Sub16_10618 = new Class700_Sub16(class527_sub38.readUnsignedByte(), this);
					aClass700_Sub27_10622 = new Class700_Sub27(class527_sub38.readUnsignedByte(), this);
					aClass700_Sub25_10623 = new Class700_Sub25(class527_sub38.readByte(), this);
				}
				if (i >= 36) {
					aClass700_Sub28_10624 = new Class700_Sub28(class527_sub38.readUnsignedByte(), this);
					aClass700_Sub19_10625 = new Class700_Sub19(class527_sub38.readUnsignedByte(), this);
				}
				aClass700_Sub2_10617 = new Class700_Sub2(aClass700_Sub2_10596.method16853((byte) -14), this);
				aClass700_Sub41_10626 = new Class700_Sub41(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub39_10627 = new Class700_Sub39(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub31_10628 = new Class700_Sub31(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub29_10612 = new Class700_Sub29(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub38_10630 = new Class700_Sub38(class527_sub38.readUnsignedByte(), this);
				if (i >= 26)
					aClass700_Sub22_10631 = new Class700_Sub22(class527_sub38.readUnsignedByte(), this);
				if (i >= 28)
					aClass700_Sub23_10632 = new Class700_Sub23(class527_sub38.readUnsignedByte(), this);
				if (i >= 30)
					aClass700_Sub43_10595 = new Class700_Sub43(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub24_10633 = new Class700_Sub24(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub24_10634 = new Class700_Sub24(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub24_10635 = new Class700_Sub24(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub24_10636 = new Class700_Sub24(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub24_10591 = new Class700_Sub24(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub21_10638 = new Class700_Sub21(class527_sub38.readUnsignedByte(), this);
				method16335(false, i < 32, -1854989221);
			}
		}
		method16332(-124591531);
	}

	void method16338(RSByteBuffer class527_sub38) {
		if (class527_sub38 == null || class527_sub38.buffer == null)
			method16335(true, true, -856216780);
		else {
			int i = class527_sub38.readUnsignedByte();
			if (i < 23) {
				try {
					method16328(class527_sub38, i, (byte) 1);
				} catch (Exception exception) {
					method16335(true, true, -1470365993);
				}
				method16335(false, true, -1183676564);
			} else if (i > 36)
				method16335(true, true, -1897146820);
			else {
				if (i >= 29)
					aClass700_Sub35_10588 = new Class700_Sub35(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub37_10589 = new Class700_Sub37(class527_sub38.readUnsignedByte(), this);
				if (i >= 31)
					aClass700_Sub36_10583 = new Class700_Sub36(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub37_10637 = new Class700_Sub37(aClass700_Sub37_10589.method17279((byte) 90), this);
				aClass700_Sub42_10592 = new Class700_Sub42(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub14_10593 = new Class700_Sub14(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub17_10594 = new Class700_Sub17(class527_sub38.readUnsignedByte(), this);
				if (i >= 27)
					aClass700_Sub33_10609 = new Class700_Sub33(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub12_10597 = new Class700_Sub12(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub15_10598 = new Class700_Sub15(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub40_10604 = new Class700_Sub40(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub4_10600 = new Class700_Sub4(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub26_10602 = new Class700_Sub26(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub8_10601 = new Class700_Sub8(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub1_10603 = new Class700_Sub1(class527_sub38.readUnsignedByte(), this);
				if (i >= 33)
					aClass700_Sub11_10585 = new Class700_Sub11(class527_sub38.readUnsignedByte(), this);
				if (i >= 34)
					class527_sub38.readUnsignedByte();
				if (i >= 24)
					aClass700_Sub3_10605 = new Class700_Sub3(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub20_10606 = new Class700_Sub20(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub13_10607 = new Class700_Sub13(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub13_10608 = new Class700_Sub13(aClass700_Sub13_10607.method16964((byte) -83), this);
				aClass700_Sub32_10620 = new Class700_Sub32(class527_sub38.readUnsignedByte(), this);
				if (i >= 25)
					aClass700_Sub34_10599 = new Class700_Sub34(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub10_10611 = new Class700_Sub10(class527_sub38.readUnsignedByte(), this);
				if (i <= 25)
					class527_sub38.anInt10689 += 1474750881;
				aClass700_Sub9_10610 = new Class700_Sub9(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub7_10613 = new Class700_Sub7(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub7_10629 = new Class700_Sub7(aClass700_Sub7_10613.method16894(-2060058935), this);
				class527_sub38.readUnsignedByte();
				aClass700_Sub18_10615 = new Class700_Sub18(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub2_10596 = new Class700_Sub2(class527_sub38.readUnsignedByte(), this);
				if (i >= 35) {
					aClass700_Sub30_10619 = new Class700_Sub30(class527_sub38.readUnsignedByte(), this);
					aClass700_Sub6_10616 = new Class700_Sub6(class527_sub38.readUnsignedByte(), this);
					aClass700_Sub5_10621 = new Class700_Sub5(class527_sub38.readUnsignedByte(), this);
					aClass700_Sub16_10618 = new Class700_Sub16(class527_sub38.readUnsignedByte(), this);
					aClass700_Sub27_10622 = new Class700_Sub27(class527_sub38.readUnsignedByte(), this);
					aClass700_Sub25_10623 = new Class700_Sub25(class527_sub38.readByte(), this);
				}
				if (i >= 36) {
					aClass700_Sub28_10624 = new Class700_Sub28(class527_sub38.readUnsignedByte(), this);
					aClass700_Sub19_10625 = new Class700_Sub19(class527_sub38.readUnsignedByte(), this);
				}
				aClass700_Sub2_10617 = new Class700_Sub2(aClass700_Sub2_10596.method16853((byte) 43), this);
				aClass700_Sub41_10626 = new Class700_Sub41(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub39_10627 = new Class700_Sub39(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub31_10628 = new Class700_Sub31(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub29_10612 = new Class700_Sub29(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub38_10630 = new Class700_Sub38(class527_sub38.readUnsignedByte(), this);
				if (i >= 26)
					aClass700_Sub22_10631 = new Class700_Sub22(class527_sub38.readUnsignedByte(), this);
				if (i >= 28)
					aClass700_Sub23_10632 = new Class700_Sub23(class527_sub38.readUnsignedByte(), this);
				if (i >= 30)
					aClass700_Sub43_10595 = new Class700_Sub43(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub24_10633 = new Class700_Sub24(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub24_10634 = new Class700_Sub24(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub24_10635 = new Class700_Sub24(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub24_10636 = new Class700_Sub24(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub24_10591 = new Class700_Sub24(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub21_10638 = new Class700_Sub21(class527_sub38.readUnsignedByte(), this);
				method16335(false, i < 32, -1684527260);
			}
		}
		method16332(-124591531);
	}

	void method16339(boolean bool, boolean bool_6_) {
		if (bool || aClass700_Sub35_10588 == null)
			aClass700_Sub35_10588 = new Class700_Sub35(this);
		if (bool || null == aClass700_Sub37_10589)
			aClass700_Sub37_10589 = new Class700_Sub37(this);
		if (bool || null == aClass700_Sub36_10583)
			aClass700_Sub36_10583 = new Class700_Sub36(this);
		if (bool || aClass700_Sub37_10637 == null)
			aClass700_Sub37_10637 = new Class700_Sub37(aClass700_Sub37_10589.method17279((byte) 17), this);
		if (bool || aClass700_Sub42_10592 == null)
			aClass700_Sub42_10592 = new Class700_Sub42(this);
		if (bool || null == aClass700_Sub14_10593)
			aClass700_Sub14_10593 = new Class700_Sub14(this);
		if (bool || null == aClass700_Sub17_10594)
			aClass700_Sub17_10594 = new Class700_Sub17(this);
		if (bool || null == aClass700_Sub33_10609)
			aClass700_Sub33_10609 = new Class700_Sub33(this);
		if (bool || null == aClass700_Sub12_10597)
			aClass700_Sub12_10597 = new Class700_Sub12(this);
		if (bool || null == aClass700_Sub15_10598)
			aClass700_Sub15_10598 = new Class700_Sub15(this);
		if (bool || aClass700_Sub40_10604 == null)
			aClass700_Sub40_10604 = new Class700_Sub40(this);
		if (bool || null == aClass700_Sub4_10600)
			aClass700_Sub4_10600 = new Class700_Sub4(this);
		if (bool || null == aClass700_Sub26_10602)
			aClass700_Sub26_10602 = new Class700_Sub26(this);
		if (bool || null == aClass700_Sub8_10601)
			aClass700_Sub8_10601 = new Class700_Sub8(this);
		if (bool || null == aClass700_Sub1_10603)
			aClass700_Sub1_10603 = new Class700_Sub1(this);
		if (bool || aClass700_Sub11_10585 == null)
			aClass700_Sub11_10585 = new Class700_Sub11(this);
		if (bool || null == aClass700_Sub3_10605)
			aClass700_Sub3_10605 = new Class700_Sub3(this);
		if (bool || aClass700_Sub20_10606 == null)
			aClass700_Sub20_10606 = new Class700_Sub20(this);
		if (bool || aClass700_Sub13_10607 == null)
			aClass700_Sub13_10607 = new Class700_Sub13(this);
		if (bool || null == aClass700_Sub13_10608)
			aClass700_Sub13_10608 = new Class700_Sub13(aClass700_Sub13_10607.method16964((byte) -79), this);
		if (bool || null == aClass700_Sub32_10620)
			aClass700_Sub32_10620 = new Class700_Sub32(this);
		if (bool || aClass700_Sub34_10599 == null)
			aClass700_Sub34_10599 = new Class700_Sub34(this);
		if (bool || aClass700_Sub10_10611 == null)
			aClass700_Sub10_10611 = new Class700_Sub10(this);
		if (bool || aClass700_Sub9_10610 == null)
			aClass700_Sub9_10610 = new Class700_Sub9(this);
		if (bool || null == aClass700_Sub7_10613)
			aClass700_Sub7_10613 = new Class700_Sub7(this);
		if (bool || aClass700_Sub7_10629 == null)
			aClass700_Sub7_10629 = new Class700_Sub7(aClass700_Sub7_10613.method16894(-1658984214), this);
		if (bool || aClass700_Sub18_10615 == null)
			aClass700_Sub18_10615 = new Class700_Sub18(this);
		if (bool || null == aClass700_Sub2_10596)
			aClass700_Sub2_10596 = new Class700_Sub2(this);
		if (bool || null == aClass700_Sub2_10617)
			aClass700_Sub2_10617 = new Class700_Sub2(aClass700_Sub2_10596.method16853((byte) 22), this);
		if (bool || aClass700_Sub16_10618 == null)
			aClass700_Sub16_10618 = new Class700_Sub16(this);
		if (bool || null == aClass700_Sub30_10619)
			aClass700_Sub30_10619 = new Class700_Sub30(this);
		if (bool || null == aClass700_Sub6_10616)
			aClass700_Sub6_10616 = new Class700_Sub6(this);
		if (bool || null == aClass700_Sub5_10621)
			aClass700_Sub5_10621 = new Class700_Sub5(this);
		if (bool || null == aClass700_Sub27_10622)
			aClass700_Sub27_10622 = new Class700_Sub27(this);
		if (bool || aClass700_Sub25_10623 == null)
			aClass700_Sub25_10623 = new Class700_Sub25(this);
		if (bool || aClass700_Sub28_10624 == null)
			aClass700_Sub28_10624 = new Class700_Sub28(this);
		if (bool || aClass700_Sub19_10625 == null)
			aClass700_Sub19_10625 = new Class700_Sub19(this);
		if (bool || null == aClass700_Sub41_10626)
			aClass700_Sub41_10626 = new Class700_Sub41(this);
		if (bool || aClass700_Sub39_10627 == null)
			aClass700_Sub39_10627 = new Class700_Sub39(this);
		if (bool || aClass700_Sub31_10628 == null)
			aClass700_Sub31_10628 = new Class700_Sub31(this);
		if (bool || null == aClass700_Sub29_10612)
			aClass700_Sub29_10612 = new Class700_Sub29(this);
		if (bool || aClass700_Sub38_10630 == null)
			aClass700_Sub38_10630 = new Class700_Sub38(this);
		if (bool || null == aClass700_Sub22_10631)
			aClass700_Sub22_10631 = new Class700_Sub22(this);
		if (bool || null == aClass700_Sub23_10632)
			aClass700_Sub23_10632 = new Class700_Sub23(this);
		if (bool || aClass700_Sub43_10595 == null)
			aClass700_Sub43_10595 = new Class700_Sub43(this);
		if (bool || bool_6_ || null == aClass700_Sub24_10633)
			aClass700_Sub24_10633 = new Class700_Sub24(this);
		if (bool || bool_6_ || aClass700_Sub24_10634 == null)
			aClass700_Sub24_10634 = new Class700_Sub24(this);
		if (bool || bool_6_ || null == aClass700_Sub24_10635)
			aClass700_Sub24_10635 = new Class700_Sub24(this);
		if (bool || bool_6_ || aClass700_Sub24_10636 == null)
			aClass700_Sub24_10636 = new Class700_Sub24(this);
		if (bool || bool_6_ || null == aClass700_Sub24_10591)
			aClass700_Sub24_10591 = new Class700_Sub24(this);
		if (bool || bool_6_ || aClass700_Sub21_10638 == null)
			aClass700_Sub21_10638 = new Class700_Sub21(this);
	}

	void method16340(RSByteBuffer class527_sub38, int i) {
		aClass700_Sub14_10593 = new Class700_Sub14(class527_sub38.readUnsignedByte(), this);
		class527_sub38.anInt10689 += 1474750881;
		aClass700_Sub13_10607 = new Class700_Sub13(class527_sub38.readUnsignedByte() + 1, this);
		aClass700_Sub4_10600 = new Class700_Sub4(class527_sub38.readUnsignedByte(), this);
		class527_sub38.anInt10689 += 1474750881;
		aClass700_Sub26_10602 = new Class700_Sub26(class527_sub38.readUnsignedByte(), this);
		aClass700_Sub12_10597 = new Class700_Sub12(class527_sub38.readUnsignedByte(), this);
		class527_sub38.readUnsignedByte();
		aClass700_Sub10_10611 = new Class700_Sub10(class527_sub38.readUnsignedByte(), this);
		int i_7_ = class527_sub38.readUnsignedByte();
		int i_8_ = 0;
		if (i >= 17)
			i_8_ = class527_sub38.readUnsignedByte();
		aClass700_Sub1_10603 = new Class700_Sub1(i_7_ > i_8_ ? i_7_ : i_8_, this);
		boolean bool = true;
		boolean bool_9_ = true;
		if (i >= 2) {
			bool = class527_sub38.readUnsignedByte() == 1;
			if (i >= 17)
				bool_9_ = class527_sub38.readUnsignedByte() == 1;
		} else {
			bool = class527_sub38.readUnsignedByte() == 1;
			class527_sub38.readUnsignedByte();
		}
		aClass700_Sub8_10601 = new Class700_Sub8(bool | bool_9_ ? 1 : 0, this);
		aClass700_Sub18_10615 = new Class700_Sub18(class527_sub38.readUnsignedByte(), this);
		aClass700_Sub15_10598 = new Class700_Sub15(class527_sub38.readUnsignedByte(), this);
		aClass700_Sub37_10589 = new Class700_Sub37(class527_sub38.readUnsignedByte(), this);
		aClass700_Sub21_10638 = new Class700_Sub21(class527_sub38.readUnsignedByte(), this);
		aClass700_Sub24_10633 = new Class700_Sub24(class527_sub38.readUnsignedByte(), this);
		if (i >= 20)
			aClass700_Sub24_10635 = new Class700_Sub24(class527_sub38.readUnsignedByte(), this);
		else
			aClass700_Sub24_10635 = new Class700_Sub24(aClass700_Sub24_10633.method17139((byte) 49), this);
		aClass700_Sub24_10636 = new Class700_Sub24(class527_sub38.readUnsignedByte(), this);
		aClass700_Sub24_10634 = new Class700_Sub24(class527_sub38.readUnsignedByte(), this);
		if (i >= 21)
			aClass700_Sub24_10591 = new Class700_Sub24(class527_sub38.readUnsignedByte(), this);
		else
			aClass700_Sub24_10591 = new Class700_Sub24(aClass700_Sub24_10636.method17139((byte) -55), this);
		if (i >= 1) {
			class527_sub38.readUnsignedShort();
			class527_sub38.readUnsignedShort();
		}
		if (i >= 3 && i < 6)
			class527_sub38.readUnsignedByte();
		if (i >= 4)
			aClass700_Sub20_10606 = new Class700_Sub20(class527_sub38.readUnsignedByte(), this);
		class527_sub38.readInt();
		if (i >= 6)
			aClass700_Sub2_10596 = new Class700_Sub2(class527_sub38.readUnsignedByte(), this);
		if (i >= 7)
			aClass700_Sub38_10630 = new Class700_Sub38(class527_sub38.readUnsignedByte(), this);
		if (i >= 8)
			class527_sub38.readUnsignedByte();
		if (i >= 9)
			aClass700_Sub17_10594 = new Class700_Sub17(class527_sub38.readUnsignedByte(), this);
		if (i >= 10)
			aClass700_Sub42_10592 = new Class700_Sub42(class527_sub38.readUnsignedByte(), this);
		if (i >= 11)
			aClass700_Sub41_10626 = new Class700_Sub41(class527_sub38.readUnsignedByte(), this);
		if (i >= 12)
			aClass700_Sub26_10602 = new Class700_Sub26(class527_sub38.readUnsignedByte(), this);
		if (i >= 13)
			aClass700_Sub40_10604 = new Class700_Sub40(class527_sub38.readUnsignedByte(), this);
		if (i >= 14)
			aClass700_Sub7_10613 = new Class700_Sub7(class527_sub38.readUnsignedByte(), this);
		if (i >= 15)
			aClass700_Sub31_10628 = new Class700_Sub31(class527_sub38.readUnsignedByte(), this);
		if (i >= 16)
			aClass700_Sub9_10610 = new Class700_Sub9(class527_sub38.readUnsignedByte(), this);
		if (i >= 18)
			aClass700_Sub39_10627 = new Class700_Sub39(class527_sub38.readUnsignedByte(), this);
		if (i >= 19)
			aClass700_Sub32_10620 = new Class700_Sub32(class527_sub38.readUnsignedByte(), this);
		if (i >= 22)
			aClass700_Sub29_10612 = new Class700_Sub29(class527_sub38.readUnsignedByte(), this);
	}

	void method16341(RSByteBuffer class527_sub38, int i) {
		aClass700_Sub14_10593 = new Class700_Sub14(class527_sub38.readUnsignedByte(), this);
		class527_sub38.anInt10689 += 1474750881;
		aClass700_Sub13_10607 = new Class700_Sub13(class527_sub38.readUnsignedByte() + 1, this);
		aClass700_Sub4_10600 = new Class700_Sub4(class527_sub38.readUnsignedByte(), this);
		class527_sub38.anInt10689 += 1474750881;
		aClass700_Sub26_10602 = new Class700_Sub26(class527_sub38.readUnsignedByte(), this);
		aClass700_Sub12_10597 = new Class700_Sub12(class527_sub38.readUnsignedByte(), this);
		class527_sub38.readUnsignedByte();
		aClass700_Sub10_10611 = new Class700_Sub10(class527_sub38.readUnsignedByte(), this);
		int i_10_ = class527_sub38.readUnsignedByte();
		int i_11_ = 0;
		if (i >= 17)
			i_11_ = class527_sub38.readUnsignedByte();
		aClass700_Sub1_10603 = new Class700_Sub1(i_10_ > i_11_ ? i_10_ : i_11_, this);
		boolean bool = true;
		boolean bool_12_ = true;
		if (i >= 2) {
			bool = class527_sub38.readUnsignedByte() == 1;
			if (i >= 17)
				bool_12_ = class527_sub38.readUnsignedByte() == 1;
		} else {
			bool = class527_sub38.readUnsignedByte() == 1;
			class527_sub38.readUnsignedByte();
		}
		aClass700_Sub8_10601 = new Class700_Sub8(bool | bool_12_ ? 1 : 0, this);
		aClass700_Sub18_10615 = new Class700_Sub18(class527_sub38.readUnsignedByte(), this);
		aClass700_Sub15_10598 = new Class700_Sub15(class527_sub38.readUnsignedByte(), this);
		aClass700_Sub37_10589 = new Class700_Sub37(class527_sub38.readUnsignedByte(), this);
		aClass700_Sub21_10638 = new Class700_Sub21(class527_sub38.readUnsignedByte(), this);
		aClass700_Sub24_10633 = new Class700_Sub24(class527_sub38.readUnsignedByte(), this);
		if (i >= 20)
			aClass700_Sub24_10635 = new Class700_Sub24(class527_sub38.readUnsignedByte(), this);
		else
			aClass700_Sub24_10635 = new Class700_Sub24(aClass700_Sub24_10633.method17139((byte) 19), this);
		aClass700_Sub24_10636 = new Class700_Sub24(class527_sub38.readUnsignedByte(), this);
		aClass700_Sub24_10634 = new Class700_Sub24(class527_sub38.readUnsignedByte(), this);
		if (i >= 21)
			aClass700_Sub24_10591 = new Class700_Sub24(class527_sub38.readUnsignedByte(), this);
		else
			aClass700_Sub24_10591 = new Class700_Sub24(aClass700_Sub24_10636.method17139((byte) 34), this);
		if (i >= 1) {
			class527_sub38.readUnsignedShort();
			class527_sub38.readUnsignedShort();
		}
		if (i >= 3 && i < 6)
			class527_sub38.readUnsignedByte();
		if (i >= 4)
			aClass700_Sub20_10606 = new Class700_Sub20(class527_sub38.readUnsignedByte(), this);
		class527_sub38.readInt();
		if (i >= 6)
			aClass700_Sub2_10596 = new Class700_Sub2(class527_sub38.readUnsignedByte(), this);
		if (i >= 7)
			aClass700_Sub38_10630 = new Class700_Sub38(class527_sub38.readUnsignedByte(), this);
		if (i >= 8)
			class527_sub38.readUnsignedByte();
		if (i >= 9)
			aClass700_Sub17_10594 = new Class700_Sub17(class527_sub38.readUnsignedByte(), this);
		if (i >= 10)
			aClass700_Sub42_10592 = new Class700_Sub42(class527_sub38.readUnsignedByte(), this);
		if (i >= 11)
			aClass700_Sub41_10626 = new Class700_Sub41(class527_sub38.readUnsignedByte(), this);
		if (i >= 12)
			aClass700_Sub26_10602 = new Class700_Sub26(class527_sub38.readUnsignedByte(), this);
		if (i >= 13)
			aClass700_Sub40_10604 = new Class700_Sub40(class527_sub38.readUnsignedByte(), this);
		if (i >= 14)
			aClass700_Sub7_10613 = new Class700_Sub7(class527_sub38.readUnsignedByte(), this);
		if (i >= 15)
			aClass700_Sub31_10628 = new Class700_Sub31(class527_sub38.readUnsignedByte(), this);
		if (i >= 16)
			aClass700_Sub9_10610 = new Class700_Sub9(class527_sub38.readUnsignedByte(), this);
		if (i >= 18)
			aClass700_Sub39_10627 = new Class700_Sub39(class527_sub38.readUnsignedByte(), this);
		if (i >= 19)
			aClass700_Sub32_10620 = new Class700_Sub32(class527_sub38.readUnsignedByte(), this);
		if (i >= 22)
			aClass700_Sub29_10612 = new Class700_Sub29(class527_sub38.readUnsignedByte(), this);
	}

	void method16342(RSByteBuffer class527_sub38) {
		if (class527_sub38 == null || class527_sub38.buffer == null)
			method16335(true, true, -2117411030);
		else {
			int i = class527_sub38.readUnsignedByte();
			if (i < 23) {
				try {
					method16328(class527_sub38, i, (byte) 1);
				} catch (Exception exception) {
					method16335(true, true, -1254178283);
				}
				method16335(false, true, -1417771897);
			} else if (i > 36)
				method16335(true, true, -1852195383);
			else {
				if (i >= 29)
					aClass700_Sub35_10588 = new Class700_Sub35(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub37_10589 = new Class700_Sub37(class527_sub38.readUnsignedByte(), this);
				if (i >= 31)
					aClass700_Sub36_10583 = new Class700_Sub36(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub37_10637 = new Class700_Sub37(aClass700_Sub37_10589.method17279((byte) 96), this);
				aClass700_Sub42_10592 = new Class700_Sub42(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub14_10593 = new Class700_Sub14(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub17_10594 = new Class700_Sub17(class527_sub38.readUnsignedByte(), this);
				if (i >= 27)
					aClass700_Sub33_10609 = new Class700_Sub33(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub12_10597 = new Class700_Sub12(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub15_10598 = new Class700_Sub15(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub40_10604 = new Class700_Sub40(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub4_10600 = new Class700_Sub4(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub26_10602 = new Class700_Sub26(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub8_10601 = new Class700_Sub8(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub1_10603 = new Class700_Sub1(class527_sub38.readUnsignedByte(), this);
				if (i >= 33)
					aClass700_Sub11_10585 = new Class700_Sub11(class527_sub38.readUnsignedByte(), this);
				if (i >= 34)
					class527_sub38.readUnsignedByte();
				if (i >= 24)
					aClass700_Sub3_10605 = new Class700_Sub3(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub20_10606 = new Class700_Sub20(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub13_10607 = new Class700_Sub13(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub13_10608 = new Class700_Sub13(aClass700_Sub13_10607.method16964((byte) -12), this);
				aClass700_Sub32_10620 = new Class700_Sub32(class527_sub38.readUnsignedByte(), this);
				if (i >= 25)
					aClass700_Sub34_10599 = new Class700_Sub34(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub10_10611 = new Class700_Sub10(class527_sub38.readUnsignedByte(), this);
				if (i <= 25)
					class527_sub38.anInt10689 += 1474750881;
				aClass700_Sub9_10610 = new Class700_Sub9(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub7_10613 = new Class700_Sub7(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub7_10629 = new Class700_Sub7(aClass700_Sub7_10613.method16894(16980185), this);
				class527_sub38.readUnsignedByte();
				aClass700_Sub18_10615 = new Class700_Sub18(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub2_10596 = new Class700_Sub2(class527_sub38.readUnsignedByte(), this);
				if (i >= 35) {
					aClass700_Sub30_10619 = new Class700_Sub30(class527_sub38.readUnsignedByte(), this);
					aClass700_Sub6_10616 = new Class700_Sub6(class527_sub38.readUnsignedByte(), this);
					aClass700_Sub5_10621 = new Class700_Sub5(class527_sub38.readUnsignedByte(), this);
					aClass700_Sub16_10618 = new Class700_Sub16(class527_sub38.readUnsignedByte(), this);
					aClass700_Sub27_10622 = new Class700_Sub27(class527_sub38.readUnsignedByte(), this);
					aClass700_Sub25_10623 = new Class700_Sub25(class527_sub38.readByte(), this);
				}
				if (i >= 36) {
					aClass700_Sub28_10624 = new Class700_Sub28(class527_sub38.readUnsignedByte(), this);
					aClass700_Sub19_10625 = new Class700_Sub19(class527_sub38.readUnsignedByte(), this);
				}
				aClass700_Sub2_10617 = new Class700_Sub2(aClass700_Sub2_10596.method16853((byte) 37), this);
				aClass700_Sub41_10626 = new Class700_Sub41(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub39_10627 = new Class700_Sub39(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub31_10628 = new Class700_Sub31(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub29_10612 = new Class700_Sub29(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub38_10630 = new Class700_Sub38(class527_sub38.readUnsignedByte(), this);
				if (i >= 26)
					aClass700_Sub22_10631 = new Class700_Sub22(class527_sub38.readUnsignedByte(), this);
				if (i >= 28)
					aClass700_Sub23_10632 = new Class700_Sub23(class527_sub38.readUnsignedByte(), this);
				if (i >= 30)
					aClass700_Sub43_10595 = new Class700_Sub43(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub24_10633 = new Class700_Sub24(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub24_10634 = new Class700_Sub24(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub24_10635 = new Class700_Sub24(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub24_10636 = new Class700_Sub24(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub24_10591 = new Class700_Sub24(class527_sub38.readUnsignedByte(), this);
				aClass700_Sub21_10638 = new Class700_Sub21(class527_sub38.readUnsignedByte(), this);
				method16335(false, i < 32, -1754101818);
			}
		}
		method16332(-124591531);
	}

	public RSByteBuffer method16343() {
		RSByteBuffer class527_sub38 = new RSByteBuffer(52);
		class527_sub38.writeByte(36, -1554259779);
		class527_sub38.writeByte(aClass700_Sub35_10588.method17265((byte) -48), -922037879);
		class527_sub38.writeByte(aClass700_Sub37_10589.method17279((byte) 88), -177251245);
		class527_sub38.writeByte(aClass700_Sub36_10583.method17269(-722807768), 1491057099);
		class527_sub38.writeByte(aClass700_Sub42_10592.method17324((byte) 26), 48415835);
		class527_sub38.writeByte(aClass700_Sub14_10593.method16970((byte) -107), 442561272);
		class527_sub38.writeByte(aClass700_Sub17_10594.method17010((byte) -15), 2075614627);
		class527_sub38.writeByte(aClass700_Sub33_10609.method17247(1831204839), 677496012);
		class527_sub38.writeByte(aClass700_Sub12_10597.method16954(942070110), -1288631920);
		class527_sub38.writeByte(aClass700_Sub15_10598.method16992(456279040), -1442479579);
		class527_sub38.writeByte(aClass700_Sub40_10604.method17294(1887643020), -1195943320);
		class527_sub38.writeByte(aClass700_Sub4_10600.method16875(129413556), -1344537141);
		class527_sub38.writeByte(aClass700_Sub26_10602.method17186((byte) 1), 856792234);
		class527_sub38.writeByte(aClass700_Sub8_10601.method16916(-748987909), 903773252);
		class527_sub38.writeByte(aClass700_Sub1_10603.method16843(-1839078684), 9971032);
		class527_sub38.writeByte(aClass700_Sub11_10585.method16948(1208004836), 1656222371);
		class527_sub38.writeByte(0, -867551927);
		class527_sub38.writeByte(aClass700_Sub3_10605.method16859(-1571491071), 111174232);
		class527_sub38.writeByte(aClass700_Sub20_10606.method17104(1796411246), 1432142201);
		class527_sub38.writeByte(aClass700_Sub13_10607.method16964((byte) -11), -423616001);
		class527_sub38.writeByte(aClass700_Sub32_10620.method17239(-1221546669), -909414310);
		class527_sub38.writeByte(aClass700_Sub34_10599.method17253(-2018843157), -896736463);
		class527_sub38.writeByte(aClass700_Sub10_10611.method16939((short) 1260), 1371151394);
		class527_sub38.writeByte(aClass700_Sub9_10610.method16924(1506467019), -1814084265);
		class527_sub38.writeByte(aClass700_Sub7_10613.method16894(-1775951804), 369764892);
		class527_sub38.writeByte(0, -979581580);
		class527_sub38.writeByte(aClass700_Sub18_10615.method17019(-1227869503), 1298925305);
		class527_sub38.writeByte(aClass700_Sub2_10596.method16853((byte) -6), 1824447225);
		class527_sub38.writeByte(aClass700_Sub30_10619.method17214(-782564689), 627709982);
		class527_sub38.writeByte(aClass700_Sub6_10616.method16890(-1949880909), -516091500);
		class527_sub38.writeByte(aClass700_Sub5_10621.method16883(-2068758971), -177245707);
		class527_sub38.writeByte(aClass700_Sub16_10618.method17000((byte) -4), -1796411393);
		class527_sub38.writeByte(aClass700_Sub27_10622.method17195(-1984874345), -1516133570);
		class527_sub38.writeByte(aClass700_Sub25_10623.method17143((byte) 11), 1120369617);
		class527_sub38.writeByte(aClass700_Sub28_10624.method17200((short) -27951), 2005525852);
		class527_sub38.writeByte(aClass700_Sub19_10625.method17027((byte) 19), 909191761);
		class527_sub38.writeByte(aClass700_Sub41_10626.method17310(-919964074), -1610677846);
		class527_sub38.writeByte(aClass700_Sub39_10627.method17290(-332646457), -857862593);
		class527_sub38.writeByte(aClass700_Sub31_10628.method17223(383480685), -444187707);
		class527_sub38.writeByte(aClass700_Sub29_10612.method17209(-649725456), 1404637867);
		class527_sub38.writeByte(aClass700_Sub38_10630.method17286(1231352629), -1854500638);
		class527_sub38.writeByte(aClass700_Sub22_10631.method17121((byte) -7), 1288835776);
		class527_sub38.writeByte(aClass700_Sub23_10632.method17129((short) 14109), -1718707177);
		class527_sub38.writeByte(aClass700_Sub43_10595.method17330(-855718216), 918789783);
		class527_sub38.writeByte(aClass700_Sub24_10633.method17139((byte) 1), 1885499315);
		class527_sub38.writeByte(aClass700_Sub24_10634.method17139((byte) -30), 306068743);
		class527_sub38.writeByte(aClass700_Sub24_10635.method17139((byte) -82), 705409927);
		class527_sub38.writeByte(aClass700_Sub24_10636.method17139((byte) -3), -311166350);
		class527_sub38.writeByte(aClass700_Sub24_10591.method17139((byte) 22), -1394911172);
		class527_sub38.writeByte(aClass700_Sub21_10638.method17114(278361266), 1274811542);
		return class527_sub38;
	}

	public Class678 method16344() {
		return aClass678_10586;
	}

	public void method16345(Class700 class700, int i) {
		class700.method14282(i, -186504472);
		method16332(-124591531);
	}

	void method16346(RSByteBuffer class527_sub38, int i) {
		aClass700_Sub14_10593 = new Class700_Sub14(class527_sub38.readUnsignedByte(), this);
		class527_sub38.anInt10689 += 1474750881;
		aClass700_Sub13_10607 = new Class700_Sub13(class527_sub38.readUnsignedByte() + 1, this);
		aClass700_Sub4_10600 = new Class700_Sub4(class527_sub38.readUnsignedByte(), this);
		class527_sub38.anInt10689 += 1474750881;
		aClass700_Sub26_10602 = new Class700_Sub26(class527_sub38.readUnsignedByte(), this);
		aClass700_Sub12_10597 = new Class700_Sub12(class527_sub38.readUnsignedByte(), this);
		class527_sub38.readUnsignedByte();
		aClass700_Sub10_10611 = new Class700_Sub10(class527_sub38.readUnsignedByte(), this);
		int i_13_ = class527_sub38.readUnsignedByte();
		int i_14_ = 0;
		if (i >= 17)
			i_14_ = class527_sub38.readUnsignedByte();
		aClass700_Sub1_10603 = new Class700_Sub1(i_13_ > i_14_ ? i_13_ : i_14_, this);
		boolean bool = true;
		boolean bool_15_ = true;
		if (i >= 2) {
			bool = class527_sub38.readUnsignedByte() == 1;
			if (i >= 17)
				bool_15_ = class527_sub38.readUnsignedByte() == 1;
		} else {
			bool = class527_sub38.readUnsignedByte() == 1;
			class527_sub38.readUnsignedByte();
		}
		aClass700_Sub8_10601 = new Class700_Sub8(bool | bool_15_ ? 1 : 0, this);
		aClass700_Sub18_10615 = new Class700_Sub18(class527_sub38.readUnsignedByte(), this);
		aClass700_Sub15_10598 = new Class700_Sub15(class527_sub38.readUnsignedByte(), this);
		aClass700_Sub37_10589 = new Class700_Sub37(class527_sub38.readUnsignedByte(), this);
		aClass700_Sub21_10638 = new Class700_Sub21(class527_sub38.readUnsignedByte(), this);
		aClass700_Sub24_10633 = new Class700_Sub24(class527_sub38.readUnsignedByte(), this);
		if (i >= 20)
			aClass700_Sub24_10635 = new Class700_Sub24(class527_sub38.readUnsignedByte(), this);
		else
			aClass700_Sub24_10635 = new Class700_Sub24(aClass700_Sub24_10633.method17139((byte) 47), this);
		aClass700_Sub24_10636 = new Class700_Sub24(class527_sub38.readUnsignedByte(), this);
		aClass700_Sub24_10634 = new Class700_Sub24(class527_sub38.readUnsignedByte(), this);
		if (i >= 21)
			aClass700_Sub24_10591 = new Class700_Sub24(class527_sub38.readUnsignedByte(), this);
		else
			aClass700_Sub24_10591 = new Class700_Sub24(aClass700_Sub24_10636.method17139((byte) -39), this);
		if (i >= 1) {
			class527_sub38.readUnsignedShort();
			class527_sub38.readUnsignedShort();
		}
		if (i >= 3 && i < 6)
			class527_sub38.readUnsignedByte();
		if (i >= 4)
			aClass700_Sub20_10606 = new Class700_Sub20(class527_sub38.readUnsignedByte(), this);
		class527_sub38.readInt();
		if (i >= 6)
			aClass700_Sub2_10596 = new Class700_Sub2(class527_sub38.readUnsignedByte(), this);
		if (i >= 7)
			aClass700_Sub38_10630 = new Class700_Sub38(class527_sub38.readUnsignedByte(), this);
		if (i >= 8)
			class527_sub38.readUnsignedByte();
		if (i >= 9)
			aClass700_Sub17_10594 = new Class700_Sub17(class527_sub38.readUnsignedByte(), this);
		if (i >= 10)
			aClass700_Sub42_10592 = new Class700_Sub42(class527_sub38.readUnsignedByte(), this);
		if (i >= 11)
			aClass700_Sub41_10626 = new Class700_Sub41(class527_sub38.readUnsignedByte(), this);
		if (i >= 12)
			aClass700_Sub26_10602 = new Class700_Sub26(class527_sub38.readUnsignedByte(), this);
		if (i >= 13)
			aClass700_Sub40_10604 = new Class700_Sub40(class527_sub38.readUnsignedByte(), this);
		if (i >= 14)
			aClass700_Sub7_10613 = new Class700_Sub7(class527_sub38.readUnsignedByte(), this);
		if (i >= 15)
			aClass700_Sub31_10628 = new Class700_Sub31(class527_sub38.readUnsignedByte(), this);
		if (i >= 16)
			aClass700_Sub9_10610 = new Class700_Sub9(class527_sub38.readUnsignedByte(), this);
		if (i >= 18)
			aClass700_Sub39_10627 = new Class700_Sub39(class527_sub38.readUnsignedByte(), this);
		if (i >= 19)
			aClass700_Sub32_10620 = new Class700_Sub32(class527_sub38.readUnsignedByte(), this);
		if (i >= 22)
			aClass700_Sub29_10612 = new Class700_Sub29(class527_sub38.readUnsignedByte(), this);
	}

	public void method16347(Class700_Sub7 class700_sub7, boolean bool) {
		class700_sub7.method16901(bool, -691000174);
		method16332(-124591531);
	}

	public void method16348(Class700 class700, int i) {
		class700.method14282(i, -1780462021);
		method16332(-124591531);
	}

	void method16349() {
		aClass700_Sub35_10588.method17260(-1838402038);
		aClass700_Sub37_10589.method17278(-2069376260);
		aClass700_Sub36_10583.method17271((byte) 104);
		aClass700_Sub37_10637.method17278(-2023227266);
		aClass700_Sub42_10592.method17318(439078026);
		aClass700_Sub14_10593.method16968((byte) -13);
		aClass700_Sub17_10594.method17007(175781096);
		aClass700_Sub33_10609.method17245((byte) 52);
		aClass700_Sub12_10597.method16958(-1722798090);
		aClass700_Sub15_10598.method16985(408933829);
		aClass700_Sub40_10604.method17295(578528617);
		aClass700_Sub4_10600.method16872(1167364505);
		aClass700_Sub26_10602.method17185(-2131309416);
		aClass700_Sub8_10601.method16914(-1107452659);
		aClass700_Sub1_10603.method16846((byte) 27);
		aClass700_Sub11_10585.method16945(-983982003);
		aClass700_Sub3_10605.method16856(929012229);
		aClass700_Sub20_10606.method17109((byte) 0);
		aClass700_Sub13_10607.method16965((byte) 47);
		aClass700_Sub13_10608.method16965((byte) 28);
		aClass700_Sub32_10620.method17240(-1694420923);
		aClass700_Sub34_10599.method17251(1386908917);
		aClass700_Sub10_10611.method16936(1152192548);
		aClass700_Sub9_10610.method16923((byte) -52);
		aClass700_Sub7_10613.method16896(-1275882393);
		aClass700_Sub7_10629.method16896(-1275882393);
		aClass700_Sub18_10615.method17016((byte) 13);
		aClass700_Sub2_10596.method16852(-1075975674);
		aClass700_Sub2_10617.method16852(39189937);
		aClass700_Sub16_10618.method17001(1297982899);
		aClass700_Sub30_10619.method17219((byte) 27);
		aClass700_Sub6_10616.method16888(-320796209);
		aClass700_Sub5_10621.method16884((byte) -7);
		aClass700_Sub27_10622.method17194(1149255955);
		aClass700_Sub25_10623.method17142(-1623114128);
		aClass700_Sub28_10624.method17199((byte) 2);
		aClass700_Sub19_10625.method17026(-465299858);
		aClass700_Sub41_10626.method17308(-1411401185);
		aClass700_Sub39_10627.method17289(1949535056);
		aClass700_Sub31_10628.method17222((byte) -116);
		aClass700_Sub29_10612.method17207(2107290051);
		aClass700_Sub38_10630.method17283((byte) 48);
		aClass700_Sub22_10631.method17119((byte) -24);
		aClass700_Sub23_10632.method17135(784881143);
		aClass700_Sub43_10595.method17329(-803308788);
		aClass700_Sub24_10633.method17137(-1313339003);
		aClass700_Sub24_10634.method17137(-1413506317);
		aClass700_Sub24_10635.method17137(-771910159);
		aClass700_Sub24_10636.method17137(1688664891);
		aClass700_Sub24_10591.method17137(-1578032387);
		aClass700_Sub21_10638.method17113(-1030772219);
	}

	public void method16350(Class700 class700, int i, int i_16_) {
		class700.method14282(i, -985463095);
		method16332(-124591531);
	}

	public Class527_Sub31(Class678 class678, int i) {
		aClass678_10586 = class678;
		aClass708_10614 = new Class708(Class515.anInt7045 * 814176903, -776525997 * Class515.anInt7046, (Class193.aString2155.toLowerCase().indexOf("arm") != -1), Class234.aString2373.startsWith("win"), false);
		aClass700_Sub7_10629 = new Class700_Sub7(i, this);
		method16335(true, true, -1070803755);
	}

	public static void method16351(int i, int i_17_) {
		Class527_Sub8_Sub9 class527_sub8_sub9 = Class532.method8930(10, (long) i);
		class527_sub8_sub9.method18186(-1607529691);
	}

	static final void method16352(Class665 class665, byte i) {
		class665.aLongArray8529[((class665.anInt8530 += 32636613) * -2076258291 - 1)] = ((Long) (class665.aClass527_Sub8_Sub10_8548.anObjectArray11725[class665.anInt8527 * 891367231])).longValue();
	}
}
