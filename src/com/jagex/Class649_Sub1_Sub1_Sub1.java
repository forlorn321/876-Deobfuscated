/* Class649_Sub1_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class649_Sub1_Sub1_Sub1 extends Class649_Sub1_Sub1 {
	int anInt12119;
	public Class433 aClass433_12120;
	public int anInt12121;
	public int anInt12122;
	public int anInt12123;
	public int anInt12124;
	public int anInt12125;
	static Class433 aClass433_12126 = new Class433();
	public Class433 aClass433_12127;
	public Class433 aClass433_12128;
	public int anInt12129;
	int anInt12130;
	boolean aBool12131;
	int anInt12132;
	int anInt12133;
	public int anInt12134 = 1540733187;
	int anInt12135;

	void method11041() {
		anInt12132 = (32 + (int) (Math.random() * 4.0)) * -252971745;
		anInt12133 = (3 + (int) (Math.random() * 2.0)) * 828261257;
		anInt12135 = (16 + (int) (Math.random() * 3.0)) * 747599179;
		if (ClientSetting.aClass536_Sub40_8843.textureSetting.method9885(722074472) == 1)
			anInt12119 = (int) (Math.random() * 10.0) * -746677787;
		else
			anInt12119 = (int) (Math.random() * 20.0) * -746677787;
	}

	void method11042(byte i) {
		anInt12132 = (32 + (int) (Math.random() * 4.0)) * -252971745;
		anInt12133 = (3 + (int) (Math.random() * 2.0)) * 828261257;
		anInt12135 = (16 + (int) (Math.random() * 3.0)) * 747599179;
		if (ClientSetting.aClass536_Sub40_8843.textureSetting.method9885(1237165171) == 1)
			anInt12119 = (int) (Math.random() * 10.0) * -746677787;
		else
			anInt12119 = (int) (Math.random() * 20.0) * -746677787;
	}

	boolean method9974(int i) {
		return false;
	}

	int method9951() {
		ItemTypeDecoder class1 = ((ItemTypeDecoder) Class111.aClass34_Sub13_1391.method70(anInt12122 * -1572171437, (byte) -55));
		int i = 2072089921 * class1.anInt81;
		if (anInt12134 * -1536784811 != -1) {
			ItemTypeDecoder class1_0_ = (ItemTypeDecoder) Class111.aClass34_Sub13_1391.method70(-1536784811 * anInt12134, (byte) -1);
			if (class1_0_.anInt81 * 2072089921 > i)
				i = 2072089921 * class1_0_.anInt81;
		}
		if (-1 != anInt12124 * 1015387979) {
			ItemTypeDecoder class1_1_ = (ItemTypeDecoder) Class111.aClass34_Sub13_1391.method70(anInt12124 * 1015387979, (byte) 40);
			if (class1_1_.anInt81 * 2072089921 > i)
				i = 2072089921 * class1_1_.anInt81;
		}
		return i;
	}

	public Class559 method9946(Class167 class167, int i) {
		return null;
	}

	public int method9960(int i) {
		return -10;
	}

	Class563 method9944(Class167 class167, byte i) {
		Class436 class436 = Class436.method5240(method7837().aClass436_4823);
		Class552 class552 = aClass553_10838.method6725(aByte10839, (int) class436.aFloat4850 >> 9, (int) class436.aFloat4853 >> 9, 351482476);
		Class649_Sub1_Sub2 class649_sub1_sub2 = aClass553_10838.method6726(aByte10839, (int) class436.aFloat4850 >> 9, (int) class436.aFloat4853 >> 9, 1672121015);
		int i_2_ = 0;
		for (/**/; null != class552; class552 = class552.aClass552_7414) {
			if (class552.aClass649_Sub1_Sub5_7415.aBool11866 && (class552.aClass649_Sub1_Sub5_7415.method9960(-1522562346) < i_2_))
				i_2_ = class552.aClass649_Sub1_Sub5_7415.method9960(-2056407521);
		}
		if (class649_sub1_sub2 != null && class649_sub1_sub2.aShort11755 > -i_2_)
			i_2_ = -class649_sub1_sub2.aShort11755;
		if (1237146881 * anInt12129 != i_2_) {
			class436.aFloat4852 += (float) (i_2_ - anInt12129 * 1237146881);
			method7841(class436);
			anInt12129 = 621519617 * i_2_;
		}
		Class433 class433 = class167.method2091();
		class433.method5193();
		if (0 == anInt12129 * 1237146881) {
			boolean bool = false;
			boolean bool_3_ = false;
			boolean bool_4_ = false;
			Class160 class160 = aClass553_10838.aClass160Array7431[aByte10840];
			int i_5_ = -1025362447 * anInt12130 << 1;
			int i_6_ = i_5_;
			int i_7_ = -i_5_ / 2;
			int i_8_ = -i_6_ / 2;
			int i_9_ = class160.method1925(i_7_ + (int) class436.aFloat4850, (int) class436.aFloat4853 + i_8_, (byte) 48);
			int i_10_ = i_5_ / 2;
			int i_11_ = -i_6_ / 2;
			int i_12_ = class160.method1925(i_10_ + (int) class436.aFloat4850, (int) class436.aFloat4853 + i_11_, (byte) 29);
			int i_13_ = -i_5_ / 2;
			int i_14_ = i_6_ / 2;
			int i_15_ = class160.method1925(i_13_ + (int) class436.aFloat4850, i_14_ + (int) class436.aFloat4853, (byte) 98);
			int i_16_ = i_5_ / 2;
			int i_17_ = i_6_ / 2;
			int i_18_ = class160.method1925((int) class436.aFloat4850 + i_16_, (int) class436.aFloat4853 + i_17_, (byte) -41);
			int i_19_ = i_9_ < i_12_ ? i_9_ : i_12_;
			int i_20_ = i_15_ < i_18_ ? i_15_ : i_18_;
			int i_21_ = i_12_ < i_18_ ? i_12_ : i_18_;
			int i_22_ = i_9_ < i_15_ ? i_9_ : i_15_;
			if (0 != i_6_) {
				int i_23_ = ((int) (Math.atan2((double) (i_19_ - i_20_), (double) i_6_) * 2607.5945876176133) & 0x3fff);
				if (0 != i_23_)
					class433.method5214(1.0F, 0.0F, 0.0F, Class447.method5400(i_23_));
			}
			if (i_5_ != 0) {
				int i_24_ = ((int) (Math.atan2((double) (i_22_ - i_21_), (double) i_5_) * 2607.5945876176133) & 0x3fff);
				if (i_24_ != 0)
					class433.method5214(0.0F, 0.0F, 1.0F, Class447.method5400(-i_24_));
			}
			int i_25_ = i_18_ + i_9_;
			if (i_15_ + i_12_ < i_25_)
				i_25_ = i_12_ + i_15_;
			i_25_ = (i_25_ >> 1) - (int) class436.aFloat4852;
			if (0 != i_25_)
				class433.method5200(0.0F, (float) i_25_, 0.0F);
		}
		class436.method5239();
		Class436 class436_26_ = method7837().aClass436_4823;
		class433.method5200(class436_26_.aFloat4850, class436_26_.aFloat4852 - 10.0F, class436_26_.aFloat4853);
		Class563 class563 = Class225.method3212(true, 448409126);
		aBool12131 = false;
		anInt12130 = 0;
		if (-1 != anInt12124 * 1015387979) {
			Class177 class177 = (((ItemTypeDecoder) Class111.aClass34_Sub13_1391.method70(1015387979 * anInt12124, (byte) -5)).method503(class167, 526336, -1531432707 * anInt12125, null, null, 2108770015 * anInt12132, anInt12133 * -1084153159, -1730253725 * anInt12135, anInt12119 * -121046035, (byte) -50));
			if (null != class177) {
				if (aClass433_12128 == null)
					aClass433_12126.method5193();
				else
					aClass433_12126.method5190(aClass433_12128);
				aClass433_12126.method5204(class433);
				class177.method2490(aClass433_12126, aClass178Array10842[2], 0);
				aBool12131 |= class177.method2511();
				anInt12130 = class177.method2579() * 904534801;
			}
		}
		if (-1536784811 * anInt12134 != -1) {
			Class177 class177 = (((ItemTypeDecoder) Class111.aClass34_Sub13_1391.method70(-1536784811 * anInt12134, (byte) -30)).method503(class167, 526336, -425751775 * anInt12123, null, null, anInt12132 * 2108770015, anInt12133 * -1084153159, anInt12135 * -1730253725, -121046035 * anInt12119, (byte) 42));
			if (null != class177) {
				if (aClass433_12127 == null)
					aClass433_12126.method5193();
				else
					aClass433_12126.method5190(aClass433_12127);
				aClass433_12126.method5204(class433);
				class177.method2490(aClass433_12126, aClass178Array10842[1], 0);
				aBool12131 |= class177.method2511();
				if (class177.method2579() > -1025362447 * anInt12130)
					anInt12130 = class177.method2579() * 904534801;
			}
		}
		Class177 class177 = (((ItemTypeDecoder) Class111.aClass34_Sub13_1391.method70(-1572171437 * anInt12122, (byte) -22)).method503(class167, 526336, anInt12121 * 31691493, null, null, 2108770015 * anInt12132, -1084153159 * anInt12133, -1730253725 * anInt12135, anInt12119 * -121046035, (byte) 41));
		if (class177 != null) {
			if (null == aClass433_12120)
				aClass433_12126.method5193();
			else
				aClass433_12126.method5190(aClass433_12120);
			aClass433_12126.method5204(class433);
			class177.method2490(aClass433_12126, aClass178Array10842[0], 0);
			aBool12131 |= class177.method2511();
			if (class177.method2579() > -1025362447 * anInt12130)
				anInt12130 = class177.method2579() * 904534801;
		}
		return class563;
	}

	public int method9958() {
		return -10;
	}

	int method9954(int i) {
		ItemTypeDecoder class1 = ((ItemTypeDecoder) Class111.aClass34_Sub13_1391.method70(anInt12122 * -1572171437, (byte) -7));
		int i_27_ = 2072089921 * class1.anInt81;
		if (anInt12134 * -1536784811 != -1) {
			ItemTypeDecoder class1_28_ = (ItemTypeDecoder) Class111.aClass34_Sub13_1391.method70(-1536784811 * anInt12134, (byte) -80);
			if (class1_28_.anInt81 * 2072089921 > i_27_)
				i_27_ = 2072089921 * class1_28_.anInt81;
		}
		if (-1 != anInt12124 * 1015387979) {
			ItemTypeDecoder class1_29_ = (ItemTypeDecoder) Class111.aClass34_Sub13_1391.method70(anInt12124 * 1015387979, (byte) 23);
			if (class1_29_.anInt81 * 2072089921 > i_27_)
				i_27_ = 2072089921 * class1_29_.anInt81;
		}
		return i_27_;
	}

	boolean method9939(Class167 class167, int i, int i_30_, byte i_31_) {
		Class433 class433 = class167.method2091();
		class433.method5191(method7837());
		class433.method5200(0.0F, -10.0F, 0.0F);
		Class177 class177 = (((ItemTypeDecoder) Class111.aClass34_Sub13_1391.method70(-1572171437 * anInt12122, (byte) -13)).method503(class167, 131072, 31691493 * anInt12121, null, null, 0, 0, 0, 0, (byte) -4));
		if (class177 != null) {
			if (null == aClass433_12120)
				aClass433_12126.method5193();
			else
				aClass433_12126.method5190(aClass433_12120);
			aClass433_12126.method5204(class433);
			if (class177.method2549(i, i_30_, aClass433_12126, true, 0))
				return true;
		}
		if (-1 != anInt12134 * -1536784811) {
			class177 = (((ItemTypeDecoder) Class111.aClass34_Sub13_1391.method70(-1536784811 * anInt12134, (byte) -42)).method503(class167, 131072, anInt12123 * -425751775, null, null, 0, 0, 0, 0, (byte) 28));
			if (class177 != null) {
				if (null == aClass433_12127)
					aClass433_12126.method5193();
				else
					aClass433_12126.method5190(aClass433_12127);
				aClass433_12126.method5204(class433);
				if (class177.method2549(i, i_30_, aClass433_12126, true, 0))
					return true;
			}
		}
		if (-1 != 1015387979 * anInt12124) {
			class177 = (((ItemTypeDecoder) Class111.aClass34_Sub13_1391.method70(1015387979 * anInt12124, (byte) 10)).method503(class167, 131072, -1531432707 * anInt12125, null, null, 0, 0, 0, 0, (byte) 35));
			if (class177 != null) {
				if (null == aClass433_12128)
					aClass433_12126.method5193();
				else
					aClass433_12126.method5190(aClass433_12128);
				aClass433_12126.method5204(class433);
				if (class177.method2549(i, i_30_, aClass433_12126, true, 0))
					return true;
			}
		}
		return false;
	}

	public int method9953(int i) {
		return 1237146881 * anInt12129 - method9960(-1114858850);
	}

	public Class559 method9962(Class167 class167) {
		return null;
	}

	boolean method9956() {
		return aBool12131;
	}

	public int method9941() {
		return -10;
	}

	void method9967(Class167 class167) {
		/* empty */
	}

	void method9975(Class167 class167) {
		/* empty */
	}

	public Class559 method9955(Class167 class167) {
		return null;
	}

	public Class559 method9961(Class167 class167) {
		return null;
	}

	boolean method9942(int i) {
		return aBool12131;
	}

	public Class559 method9963(Class167 class167) {
		return null;
	}

	public int method9964() {
		return 1237146881 * anInt12129 - method9960(-1388432440);
	}

	Class563 method9985(Class167 class167) {
		Class436 class436 = Class436.method5240(method7837().aClass436_4823);
		Class552 class552 = aClass553_10838.method6725(aByte10839, (int) class436.aFloat4850 >> 9, (int) class436.aFloat4853 >> 9, -85678084);
		Class649_Sub1_Sub2 class649_sub1_sub2 = aClass553_10838.method6726(aByte10839, (int) class436.aFloat4850 >> 9, (int) class436.aFloat4853 >> 9, 1672121015);
		int i = 0;
		for (/**/; null != class552; class552 = class552.aClass552_7414) {
			if (class552.aClass649_Sub1_Sub5_7415.aBool11866 && (class552.aClass649_Sub1_Sub5_7415.method9960(-2079370134) < i))
				i = class552.aClass649_Sub1_Sub5_7415.method9960(-741821654);
		}
		if (class649_sub1_sub2 != null && class649_sub1_sub2.aShort11755 > -i)
			i = -class649_sub1_sub2.aShort11755;
		if (1237146881 * anInt12129 != i) {
			class436.aFloat4852 += (float) (i - anInt12129 * 1237146881);
			method7841(class436);
			anInt12129 = 621519617 * i;
		}
		Class433 class433 = class167.method2091();
		class433.method5193();
		if (0 == anInt12129 * 1237146881) {
			boolean bool = false;
			boolean bool_32_ = false;
			boolean bool_33_ = false;
			Class160 class160 = aClass553_10838.aClass160Array7431[aByte10840];
			int i_34_ = -1025362447 * anInt12130 << 1;
			int i_35_ = i_34_;
			int i_36_ = -i_34_ / 2;
			int i_37_ = -i_35_ / 2;
			int i_38_ = class160.method1925(i_36_ + (int) class436.aFloat4850, (int) class436.aFloat4853 + i_37_, (byte) -38);
			int i_39_ = i_34_ / 2;
			int i_40_ = -i_35_ / 2;
			int i_41_ = class160.method1925(i_39_ + (int) class436.aFloat4850, (int) class436.aFloat4853 + i_40_, (byte) -22);
			int i_42_ = -i_34_ / 2;
			int i_43_ = i_35_ / 2;
			int i_44_ = class160.method1925(i_42_ + (int) class436.aFloat4850, i_43_ + (int) class436.aFloat4853, (byte) 2);
			int i_45_ = i_34_ / 2;
			int i_46_ = i_35_ / 2;
			int i_47_ = class160.method1925((int) class436.aFloat4850 + i_45_, (int) class436.aFloat4853 + i_46_, (byte) -33);
			int i_48_ = i_38_ < i_41_ ? i_38_ : i_41_;
			int i_49_ = i_44_ < i_47_ ? i_44_ : i_47_;
			int i_50_ = i_41_ < i_47_ ? i_41_ : i_47_;
			int i_51_ = i_38_ < i_44_ ? i_38_ : i_44_;
			if (0 != i_35_) {
				int i_52_ = ((int) (Math.atan2((double) (i_48_ - i_49_), (double) i_35_) * 2607.5945876176133) & 0x3fff);
				if (0 != i_52_)
					class433.method5214(1.0F, 0.0F, 0.0F, Class447.method5400(i_52_));
			}
			if (i_34_ != 0) {
				int i_53_ = ((int) (Math.atan2((double) (i_51_ - i_50_), (double) i_34_) * 2607.5945876176133) & 0x3fff);
				if (i_53_ != 0)
					class433.method5214(0.0F, 0.0F, 1.0F, Class447.method5400(-i_53_));
			}
			int i_54_ = i_47_ + i_38_;
			if (i_44_ + i_41_ < i_54_)
				i_54_ = i_41_ + i_44_;
			i_54_ = (i_54_ >> 1) - (int) class436.aFloat4852;
			if (0 != i_54_)
				class433.method5200(0.0F, (float) i_54_, 0.0F);
		}
		class436.method5239();
		Class436 class436_55_ = method7837().aClass436_4823;
		class433.method5200(class436_55_.aFloat4850, class436_55_.aFloat4852 - 10.0F, class436_55_.aFloat4853);
		Class563 class563 = Class225.method3212(true, -624055384);
		aBool12131 = false;
		anInt12130 = 0;
		if (-1 != anInt12124 * 1015387979) {
			Class177 class177 = (((ItemTypeDecoder) Class111.aClass34_Sub13_1391.method70(1015387979 * anInt12124, (byte) 13)).method503(class167, 526336, -1531432707 * anInt12125, null, null, 2108770015 * anInt12132, anInt12133 * -1084153159, -1730253725 * anInt12135, anInt12119 * -121046035, (byte) 86));
			if (null != class177) {
				if (aClass433_12128 == null)
					aClass433_12126.method5193();
				else
					aClass433_12126.method5190(aClass433_12128);
				aClass433_12126.method5204(class433);
				class177.method2490(aClass433_12126, aClass178Array10842[2], 0);
				aBool12131 |= class177.method2511();
				anInt12130 = class177.method2579() * 904534801;
			}
		}
		if (-1536784811 * anInt12134 != -1) {
			Class177 class177 = (((ItemTypeDecoder) Class111.aClass34_Sub13_1391.method70(-1536784811 * anInt12134, (byte) -81)).method503(class167, 526336, -425751775 * anInt12123, null, null, anInt12132 * 2108770015, anInt12133 * -1084153159, anInt12135 * -1730253725, -121046035 * anInt12119, (byte) 13));
			if (null != class177) {
				if (aClass433_12127 == null)
					aClass433_12126.method5193();
				else
					aClass433_12126.method5190(aClass433_12127);
				aClass433_12126.method5204(class433);
				class177.method2490(aClass433_12126, aClass178Array10842[1], 0);
				aBool12131 |= class177.method2511();
				if (class177.method2579() > -1025362447 * anInt12130)
					anInt12130 = class177.method2579() * 904534801;
			}
		}
		Class177 class177 = (((ItemTypeDecoder) Class111.aClass34_Sub13_1391.method70(-1572171437 * anInt12122, (byte) 3)).method503(class167, 526336, anInt12121 * 31691493, null, null, 2108770015 * anInt12132, -1084153159 * anInt12133, -1730253725 * anInt12135, anInt12119 * -121046035, (byte) -20));
		if (class177 != null) {
			if (null == aClass433_12120)
				aClass433_12126.method5193();
			else
				aClass433_12126.method5190(aClass433_12120);
			aClass433_12126.method5204(class433);
			class177.method2490(aClass433_12126, aClass178Array10842[0], 0);
			aBool12131 |= class177.method2511();
			if (class177.method2579() > -1025362447 * anInt12130)
				anInt12130 = class177.method2579() * 904534801;
		}
		return class563;
	}

	Class563 method9965(Class167 class167) {
		Class436 class436 = Class436.method5240(method7837().aClass436_4823);
		Class552 class552 = aClass553_10838.method6725(aByte10839, (int) class436.aFloat4850 >> 9, (int) class436.aFloat4853 >> 9, 236585743);
		Class649_Sub1_Sub2 class649_sub1_sub2 = aClass553_10838.method6726(aByte10839, (int) class436.aFloat4850 >> 9, (int) class436.aFloat4853 >> 9, 1672121015);
		int i = 0;
		for (/**/; null != class552; class552 = class552.aClass552_7414) {
			if (class552.aClass649_Sub1_Sub5_7415.aBool11866 && (class552.aClass649_Sub1_Sub5_7415.method9960(-1993586524) < i))
				i = class552.aClass649_Sub1_Sub5_7415.method9960(-1457367080);
		}
		if (class649_sub1_sub2 != null && class649_sub1_sub2.aShort11755 > -i)
			i = -class649_sub1_sub2.aShort11755;
		if (1237146881 * anInt12129 != i) {
			class436.aFloat4852 += (float) (i - anInt12129 * 1237146881);
			method7841(class436);
			anInt12129 = 621519617 * i;
		}
		Class433 class433 = class167.method2091();
		class433.method5193();
		if (0 == anInt12129 * 1237146881) {
			boolean bool = false;
			boolean bool_56_ = false;
			boolean bool_57_ = false;
			Class160 class160 = aClass553_10838.aClass160Array7431[aByte10840];
			int i_58_ = -1025362447 * anInt12130 << 1;
			int i_59_ = i_58_;
			int i_60_ = -i_58_ / 2;
			int i_61_ = -i_59_ / 2;
			int i_62_ = class160.method1925(i_60_ + (int) class436.aFloat4850, (int) class436.aFloat4853 + i_61_, (byte) -88);
			int i_63_ = i_58_ / 2;
			int i_64_ = -i_59_ / 2;
			int i_65_ = class160.method1925(i_63_ + (int) class436.aFloat4850, (int) class436.aFloat4853 + i_64_, (byte) -64);
			int i_66_ = -i_58_ / 2;
			int i_67_ = i_59_ / 2;
			int i_68_ = class160.method1925(i_66_ + (int) class436.aFloat4850, i_67_ + (int) class436.aFloat4853, (byte) -20);
			int i_69_ = i_58_ / 2;
			int i_70_ = i_59_ / 2;
			int i_71_ = class160.method1925((int) class436.aFloat4850 + i_69_, (int) class436.aFloat4853 + i_70_, (byte) -11);
			int i_72_ = i_62_ < i_65_ ? i_62_ : i_65_;
			int i_73_ = i_68_ < i_71_ ? i_68_ : i_71_;
			int i_74_ = i_65_ < i_71_ ? i_65_ : i_71_;
			int i_75_ = i_62_ < i_68_ ? i_62_ : i_68_;
			if (0 != i_59_) {
				int i_76_ = ((int) (Math.atan2((double) (i_72_ - i_73_), (double) i_59_) * 2607.5945876176133) & 0x3fff);
				if (0 != i_76_)
					class433.method5214(1.0F, 0.0F, 0.0F, Class447.method5400(i_76_));
			}
			if (i_58_ != 0) {
				int i_77_ = ((int) (Math.atan2((double) (i_75_ - i_74_), (double) i_58_) * 2607.5945876176133) & 0x3fff);
				if (i_77_ != 0)
					class433.method5214(0.0F, 0.0F, 1.0F, Class447.method5400(-i_77_));
			}
			int i_78_ = i_71_ + i_62_;
			if (i_68_ + i_65_ < i_78_)
				i_78_ = i_65_ + i_68_;
			i_78_ = (i_78_ >> 1) - (int) class436.aFloat4852;
			if (0 != i_78_)
				class433.method5200(0.0F, (float) i_78_, 0.0F);
		}
		class436.method5239();
		Class436 class436_79_ = method7837().aClass436_4823;
		class433.method5200(class436_79_.aFloat4850, class436_79_.aFloat4852 - 10.0F, class436_79_.aFloat4853);
		Class563 class563 = Class225.method3212(true, -328260677);
		aBool12131 = false;
		anInt12130 = 0;
		if (-1 != anInt12124 * 1015387979) {
			Class177 class177 = (((ItemTypeDecoder) Class111.aClass34_Sub13_1391.method70(1015387979 * anInt12124, (byte) -15)).method503(class167, 526336, -1531432707 * anInt12125, null, null, 2108770015 * anInt12132, anInt12133 * -1084153159, -1730253725 * anInt12135, anInt12119 * -121046035, (byte) -37));
			if (null != class177) {
				if (aClass433_12128 == null)
					aClass433_12126.method5193();
				else
					aClass433_12126.method5190(aClass433_12128);
				aClass433_12126.method5204(class433);
				class177.method2490(aClass433_12126, aClass178Array10842[2], 0);
				aBool12131 |= class177.method2511();
				anInt12130 = class177.method2579() * 904534801;
			}
		}
		if (-1536784811 * anInt12134 != -1) {
			Class177 class177 = (((ItemTypeDecoder) Class111.aClass34_Sub13_1391.method70(-1536784811 * anInt12134, (byte) 57)).method503(class167, 526336, -425751775 * anInt12123, null, null, anInt12132 * 2108770015, anInt12133 * -1084153159, anInt12135 * -1730253725, -121046035 * anInt12119, (byte) -90));
			if (null != class177) {
				if (aClass433_12127 == null)
					aClass433_12126.method5193();
				else
					aClass433_12126.method5190(aClass433_12127);
				aClass433_12126.method5204(class433);
				class177.method2490(aClass433_12126, aClass178Array10842[1], 0);
				aBool12131 |= class177.method2511();
				if (class177.method2579() > -1025362447 * anInt12130)
					anInt12130 = class177.method2579() * 904534801;
			}
		}
		Class177 class177 = (((ItemTypeDecoder) Class111.aClass34_Sub13_1391.method70(-1572171437 * anInt12122, (byte) 57)).method503(class167, 526336, anInt12121 * 31691493, null, null, 2108770015 * anInt12132, -1084153159 * anInt12133, -1730253725 * anInt12135, anInt12119 * -121046035, (byte) -27));
		if (class177 != null) {
			if (null == aClass433_12120)
				aClass433_12126.method5193();
			else
				aClass433_12126.method5190(aClass433_12120);
			aClass433_12126.method5204(class433);
			class177.method2490(aClass433_12126, aClass178Array10842[0], 0);
			aBool12131 |= class177.method2511();
			if (class177.method2579() > -1025362447 * anInt12130)
				anInt12130 = class177.method2579() * 904534801;
		}
		return class563;
	}

	void method11043() {
		anInt12132 = (32 + (int) (Math.random() * 4.0)) * -252971745;
		anInt12133 = (3 + (int) (Math.random() * 2.0)) * 828261257;
		anInt12135 = (16 + (int) (Math.random() * 3.0)) * 747599179;
		if (ClientSetting.aClass536_Sub40_8843.textureSetting.method9885(318232440) == 1)
			anInt12119 = (int) (Math.random() * 10.0) * -746677787;
		else
			anInt12119 = (int) (Math.random() * 20.0) * -746677787;
	}

	public int method9984() {
		return -10;
	}

	public Class649_Sub1_Sub1_Sub1(Class553 class553, int i, int i_80_, int i_81_, int i_82_, int i_83_) {
		super(class553, i, i_80_, i_81_, i_82_, i_83_);
		anInt12124 = 989939101;
		aClass433_12120 = null;
		aClass433_12127 = null;
		aClass433_12128 = null;
		anInt12129 = 0;
		anInt12130 = 0;
		aBool12131 = false;
		method9968(3, -822188966);
		method11042((byte) 10);
	}

	boolean method9969(Class167 class167, int i, int i_84_) {
		Class433 class433 = class167.method2091();
		class433.method5191(method7837());
		class433.method5200(0.0F, -10.0F, 0.0F);
		Class177 class177 = (((ItemTypeDecoder) Class111.aClass34_Sub13_1391.method70(-1572171437 * anInt12122, (byte) -9)).method503(class167, 131072, 31691493 * anInt12121, null, null, 0, 0, 0, 0, (byte) 27));
		if (class177 != null) {
			if (null == aClass433_12120)
				aClass433_12126.method5193();
			else
				aClass433_12126.method5190(aClass433_12120);
			aClass433_12126.method5204(class433);
			if (class177.method2549(i, i_84_, aClass433_12126, true, 0))
				return true;
		}
		if (-1 != anInt12134 * -1536784811) {
			class177 = (((ItemTypeDecoder) Class111.aClass34_Sub13_1391.method70(-1536784811 * anInt12134, (byte) 13)).method503(class167, 131072, anInt12123 * -425751775, null, null, 0, 0, 0, 0, (byte) 20));
			if (class177 != null) {
				if (null == aClass433_12127)
					aClass433_12126.method5193();
				else
					aClass433_12126.method5190(aClass433_12127);
				aClass433_12126.method5204(class433);
				if (class177.method2549(i, i_84_, aClass433_12126, true, 0))
					return true;
			}
		}
		if (-1 != 1015387979 * anInt12124) {
			class177 = (((ItemTypeDecoder) Class111.aClass34_Sub13_1391.method70(1015387979 * anInt12124, (byte) -25)).method503(class167, 131072, -1531432707 * anInt12125, null, null, 0, 0, 0, 0, (byte) 62));
			if (class177 != null) {
				if (null == aClass433_12128)
					aClass433_12126.method5193();
				else
					aClass433_12126.method5190(aClass433_12128);
				aClass433_12126.method5204(class433);
				if (class177.method2549(i, i_84_, aClass433_12126, true, 0))
					return true;
			}
		}
		return false;
	}

	boolean method9957(Class167 class167, int i, int i_85_) {
		Class433 class433 = class167.method2091();
		class433.method5191(method7837());
		class433.method5200(0.0F, -10.0F, 0.0F);
		Class177 class177 = (((ItemTypeDecoder) Class111.aClass34_Sub13_1391.method70(-1572171437 * anInt12122, (byte) 13)).method503(class167, 131072, 31691493 * anInt12121, null, null, 0, 0, 0, 0, (byte) -55));
		if (class177 != null) {
			if (null == aClass433_12120)
				aClass433_12126.method5193();
			else
				aClass433_12126.method5190(aClass433_12120);
			aClass433_12126.method5204(class433);
			if (class177.method2549(i, i_85_, aClass433_12126, true, 0))
				return true;
		}
		if (-1 != anInt12134 * -1536784811) {
			class177 = (((ItemTypeDecoder) Class111.aClass34_Sub13_1391.method70(-1536784811 * anInt12134, (byte) -78)).method503(class167, 131072, anInt12123 * -425751775, null, null, 0, 0, 0, 0, (byte) 41));
			if (class177 != null) {
				if (null == aClass433_12127)
					aClass433_12126.method5193();
				else
					aClass433_12126.method5190(aClass433_12127);
				aClass433_12126.method5204(class433);
				if (class177.method2549(i, i_85_, aClass433_12126, true, 0))
					return true;
			}
		}
		if (-1 != 1015387979 * anInt12124) {
			class177 = (((ItemTypeDecoder) Class111.aClass34_Sub13_1391.method70(1015387979 * anInt12124, (byte) 44)).method503(class167, 131072, -1531432707 * anInt12125, null, null, 0, 0, 0, 0, (byte) -27));
			if (class177 != null) {
				if (null == aClass433_12128)
					aClass433_12126.method5193();
				else
					aClass433_12126.method5190(aClass433_12128);
				aClass433_12126.method5204(class433);
				if (class177.method2549(i, i_85_, aClass433_12126, true, 0))
					return true;
			}
		}
		return false;
	}

	boolean method9971(Class167 class167, int i, int i_86_) {
		Class433 class433 = class167.method2091();
		class433.method5191(method7837());
		class433.method5200(0.0F, -10.0F, 0.0F);
		Class177 class177 = (((ItemTypeDecoder) Class111.aClass34_Sub13_1391.method70(-1572171437 * anInt12122, (byte) -26)).method503(class167, 131072, 31691493 * anInt12121, null, null, 0, 0, 0, 0, (byte) 10));
		if (class177 != null) {
			if (null == aClass433_12120)
				aClass433_12126.method5193();
			else
				aClass433_12126.method5190(aClass433_12120);
			aClass433_12126.method5204(class433);
			if (class177.method2549(i, i_86_, aClass433_12126, true, 0))
				return true;
		}
		if (-1 != anInt12134 * -1536784811) {
			class177 = (((ItemTypeDecoder) Class111.aClass34_Sub13_1391.method70(-1536784811 * anInt12134, (byte) -19)).method503(class167, 131072, anInt12123 * -425751775, null, null, 0, 0, 0, 0, (byte) -47));
			if (class177 != null) {
				if (null == aClass433_12127)
					aClass433_12126.method5193();
				else
					aClass433_12126.method5190(aClass433_12127);
				aClass433_12126.method5204(class433);
				if (class177.method2549(i, i_86_, aClass433_12126, true, 0))
					return true;
			}
		}
		if (-1 != 1015387979 * anInt12124) {
			class177 = (((ItemTypeDecoder) Class111.aClass34_Sub13_1391.method70(1015387979 * anInt12124, (byte) 76)).method503(class167, 131072, -1531432707 * anInt12125, null, null, 0, 0, 0, 0, (byte) -80));
			if (class177 != null) {
				if (null == aClass433_12128)
					aClass433_12126.method5193();
				else
					aClass433_12126.method5190(aClass433_12128);
				aClass433_12126.method5204(class433);
				if (class177.method2549(i, i_86_, aClass433_12126, true, 0))
					return true;
			}
		}
		return false;
	}

	Class563 method9966(Class167 class167) {
		Class436 class436 = Class436.method5240(method7837().aClass436_4823);
		Class552 class552 = aClass553_10838.method6725(aByte10839, (int) class436.aFloat4850 >> 9, (int) class436.aFloat4853 >> 9, -892187296);
		Class649_Sub1_Sub2 class649_sub1_sub2 = aClass553_10838.method6726(aByte10839, (int) class436.aFloat4850 >> 9, (int) class436.aFloat4853 >> 9, 1672121015);
		int i = 0;
		for (/**/; null != class552; class552 = class552.aClass552_7414) {
			if (class552.aClass649_Sub1_Sub5_7415.aBool11866 && (class552.aClass649_Sub1_Sub5_7415.method9960(-1850515143) < i))
				i = class552.aClass649_Sub1_Sub5_7415.method9960(-1966696562);
		}
		if (class649_sub1_sub2 != null && class649_sub1_sub2.aShort11755 > -i)
			i = -class649_sub1_sub2.aShort11755;
		if (1237146881 * anInt12129 != i) {
			class436.aFloat4852 += (float) (i - anInt12129 * 1237146881);
			method7841(class436);
			anInt12129 = 621519617 * i;
		}
		Class433 class433 = class167.method2091();
		class433.method5193();
		if (0 == anInt12129 * 1237146881) {
			boolean bool = false;
			boolean bool_87_ = false;
			boolean bool_88_ = false;
			Class160 class160 = aClass553_10838.aClass160Array7431[aByte10840];
			int i_89_ = -1025362447 * anInt12130 << 1;
			int i_90_ = i_89_;
			int i_91_ = -i_89_ / 2;
			int i_92_ = -i_90_ / 2;
			int i_93_ = class160.method1925(i_91_ + (int) class436.aFloat4850, (int) class436.aFloat4853 + i_92_, (byte) -68);
			int i_94_ = i_89_ / 2;
			int i_95_ = -i_90_ / 2;
			int i_96_ = class160.method1925(i_94_ + (int) class436.aFloat4850, (int) class436.aFloat4853 + i_95_, (byte) 13);
			int i_97_ = -i_89_ / 2;
			int i_98_ = i_90_ / 2;
			int i_99_ = class160.method1925(i_97_ + (int) class436.aFloat4850, i_98_ + (int) class436.aFloat4853, (byte) -36);
			int i_100_ = i_89_ / 2;
			int i_101_ = i_90_ / 2;
			int i_102_ = class160.method1925((int) class436.aFloat4850 + i_100_, (int) class436.aFloat4853 + i_101_, (byte) -8);
			int i_103_ = i_93_ < i_96_ ? i_93_ : i_96_;
			int i_104_ = i_99_ < i_102_ ? i_99_ : i_102_;
			int i_105_ = i_96_ < i_102_ ? i_96_ : i_102_;
			int i_106_ = i_93_ < i_99_ ? i_93_ : i_99_;
			if (0 != i_90_) {
				int i_107_ = ((int) (Math.atan2((double) (i_103_ - i_104_), (double) i_90_) * 2607.5945876176133) & 0x3fff);
				if (0 != i_107_)
					class433.method5214(1.0F, 0.0F, 0.0F, Class447.method5400(i_107_));
			}
			if (i_89_ != 0) {
				int i_108_ = ((int) (Math.atan2((double) (i_106_ - i_105_), (double) i_89_) * 2607.5945876176133) & 0x3fff);
				if (i_108_ != 0)
					class433.method5214(0.0F, 0.0F, 1.0F, Class447.method5400(-i_108_));
			}
			int i_109_ = i_102_ + i_93_;
			if (i_99_ + i_96_ < i_109_)
				i_109_ = i_96_ + i_99_;
			i_109_ = (i_109_ >> 1) - (int) class436.aFloat4852;
			if (0 != i_109_)
				class433.method5200(0.0F, (float) i_109_, 0.0F);
		}
		class436.method5239();
		Class436 class436_110_ = method7837().aClass436_4823;
		class433.method5200(class436_110_.aFloat4850, class436_110_.aFloat4852 - 10.0F, class436_110_.aFloat4853);
		Class563 class563 = Class225.method3212(true, 810038885);
		aBool12131 = false;
		anInt12130 = 0;
		if (-1 != anInt12124 * 1015387979) {
			Class177 class177 = (((ItemTypeDecoder) Class111.aClass34_Sub13_1391.method70(1015387979 * anInt12124, (byte) 37)).method503(class167, 526336, -1531432707 * anInt12125, null, null, 2108770015 * anInt12132, anInt12133 * -1084153159, -1730253725 * anInt12135, anInt12119 * -121046035, (byte) -18));
			if (null != class177) {
				if (aClass433_12128 == null)
					aClass433_12126.method5193();
				else
					aClass433_12126.method5190(aClass433_12128);
				aClass433_12126.method5204(class433);
				class177.method2490(aClass433_12126, aClass178Array10842[2], 0);
				aBool12131 |= class177.method2511();
				anInt12130 = class177.method2579() * 904534801;
			}
		}
		if (-1536784811 * anInt12134 != -1) {
			Class177 class177 = (((ItemTypeDecoder) Class111.aClass34_Sub13_1391.method70(-1536784811 * anInt12134, (byte) -12)).method503(class167, 526336, -425751775 * anInt12123, null, null, anInt12132 * 2108770015, anInt12133 * -1084153159, anInt12135 * -1730253725, -121046035 * anInt12119, (byte) -21));
			if (null != class177) {
				if (aClass433_12127 == null)
					aClass433_12126.method5193();
				else
					aClass433_12126.method5190(aClass433_12127);
				aClass433_12126.method5204(class433);
				class177.method2490(aClass433_12126, aClass178Array10842[1], 0);
				aBool12131 |= class177.method2511();
				if (class177.method2579() > -1025362447 * anInt12130)
					anInt12130 = class177.method2579() * 904534801;
			}
		}
		Class177 class177 = (((ItemTypeDecoder) Class111.aClass34_Sub13_1391.method70(-1572171437 * anInt12122, (byte) 43)).method503(class167, 526336, anInt12121 * 31691493, null, null, 2108770015 * anInt12132, -1084153159 * anInt12133, -1730253725 * anInt12135, anInt12119 * -121046035, (byte) 20));
		if (class177 != null) {
			if (null == aClass433_12120)
				aClass433_12126.method5193();
			else
				aClass433_12126.method5190(aClass433_12120);
			aClass433_12126.method5204(class433);
			class177.method2490(aClass433_12126, aClass178Array10842[0], 0);
			aBool12131 |= class177.method2511();
			if (class177.method2579() > -1025362447 * anInt12130)
				anInt12130 = class177.method2579() * 904534801;
		}
		return class563;
	}

	void method9945(Class167 class167, int i) {
		/* empty */
	}

	void method11044() {
		anInt12132 = (32 + (int) (Math.random() * 4.0)) * -252971745;
		anInt12133 = (3 + (int) (Math.random() * 2.0)) * 828261257;
		anInt12135 = (16 + (int) (Math.random() * 3.0)) * 747599179;
		if (ClientSetting.aClass536_Sub40_8843.textureSetting.method9885(-1880999217) == 1)
			anInt12119 = (int) (Math.random() * 10.0) * -746677787;
		else
			anInt12119 = (int) (Math.random() * 20.0) * -746677787;
	}

	int method9977() {
		ItemTypeDecoder class1 = ((ItemTypeDecoder) Class111.aClass34_Sub13_1391.method70(anInt12122 * -1572171437, (byte) -16));
		int i = 2072089921 * class1.anInt81;
		if (anInt12134 * -1536784811 != -1) {
			ItemTypeDecoder class1_111_ = (ItemTypeDecoder) Class111.aClass34_Sub13_1391.method70(-1536784811 * anInt12134, (byte) -10);
			if (class1_111_.anInt81 * 2072089921 > i)
				i = 2072089921 * class1_111_.anInt81;
		}
		if (-1 != anInt12124 * 1015387979) {
			ItemTypeDecoder class1_112_ = (ItemTypeDecoder) Class111.aClass34_Sub13_1391.method70(anInt12124 * 1015387979, (byte) 51);
			if (class1_112_.anInt81 * 2072089921 > i)
				i = 2072089921 * class1_112_.anInt81;
		}
		return i;
	}

	boolean method9987() {
		return false;
	}
}
