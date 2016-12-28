/* Class649_Sub1_Sub5_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class649_Sub1_Sub5_Sub1 extends Class649_Sub1_Sub5 implements Interface31 {
	int anInt11887;
	public Interface19 anInterface19_11888;
	public int anInt11889 = -675537735;
	static final int anInt11890 = 5;
	int anInt11891;
	int anInt11892;
	int anInt11893;
	public boolean aBool11894;
	public boolean aBool11895;
	public int anInt11896;
	public int anInt11897;
	static final int anInt11898 = 20;
	int anInt11899 = 1594517637;
	int anInt11900;
	public Class500[] aClass500Array11901;
	public Class62 aClass62_11902;
	Class533 aClass533_11903;
	byte aByte11904;
	public int anInt11905;
	public int[] anIntArray11906;
	public int[] anIntArray11907;
	int anInt11908 = 1702789120;
	public int[] anIntArray11909;
	public Class695 aClass695_11910;
	public int anInt11911;
	public int[] anIntArray11912;
	public int[] anIntArray11913;
	public Class688_Sub3 aClass688_Sub3_11914;
	public int anInt11915;
	public int anInt11916;
	boolean aBool11917;
	public int[] anIntArray11918;
	public int anInt11919;
	public int anInt11920;
	public int anInt11921;
	public int anInt11922;
	public int anInt11923;
	public int anInt11924;
	public Class688 aClass688_11925;
	public int anInt11926;
	public int anInt11927;
	public byte aByte11928;
	public Interface3 anInterface3_11929;
	public byte aByte11930;
	boolean aBool11931;
	public int[] anIntArray11932;
	int anInt11933;
	public int anInt11934;
	public int anInt11935;
	public byte aByte11936;
	public int anInt11937;
	public int anInt11938;
	public int anInt11939;
	public Class62 aClass62_11940;
	public int[] anIntArray11941;
	public Class62 aClass62_11942;
	public int anInt11943;
	public int[] screenX;
	public int[] screenY;
	public byte[] aByteArray11946;
	public Class688_Sub2_Sub1[] aClass688_Sub2_Sub1Array11947;
	public int anInt11948;
	public int anInt11949;
	Class627 aClass627_11950;
	int anInt11951;
	public int anInt11952;
	public Class177[] aClass177Array11953;
	int anInt11954;
	Class234 aClass234_11955;
	int anInt11956;
	public int stepsCount;
	public byte aByte11958;

	public abstract int method10864();

	Class649_Sub1_Sub5_Sub1(Class553 class553, Class98_Sub1 class98_sub1) {
		this(class553, 10, class98_sub1);
	}

	public void method10838() {
		int i = 240 + (-185511859 * anInt11899 - 1 << 8);
		Class436 class436 = method7837().aClass436_4823;
		aShort11867 = (short) ((int) class436.aFloat4850 - i >> 9);
		aShort11865 = (short) ((int) class436.aFloat4853 - i >> 9);
		aShort11864 = (short) ((int) class436.aFloat4850 + i >> 9);
		aShort11870 = (short) (i + (int) class436.aFloat4853 >> 9);
	}

	public int method9960(int i) {
		if (-32768 == -1265312341 * anInt11908)
			return 0;
		return anInt11908 * -1265312341;
	}

	public abstract boolean method10865(int i);

	public int method10866(int i) {
		Class589 class589 = method10877(-1603374296);
		int i_0_ = 897724319 * aClass62_11940.anInt700;
		boolean bool;
		if (0 != class589.anInt7784 * -272071129)
			bool = aClass62_11940.method1045(anInt11939 * -1999712379, class589.anInt7784 * -272071129, class589.anInt7779 * 770721009, -2018335186);
		else
			bool = aClass62_11940.method1045(anInt11939 * -1999712379, 758944217 * anInt11938, anInt11938 * 758944217, -2026834349);
		int i_1_ = aClass62_11940.anInt700 * 897724319 - i_0_;
		if (0 != i_1_)
			anInt11937 += -1158948207;
		else {
			anInt11937 = 0;
			aClass62_11940.method1050(-1999712379 * anInt11939, 1414976666);
		}
		if (bool) {
			if (0 != -584546219 * class589.anInt7777) {
				if (i_1_ > 0)
					aClass62_11902.method1045(class589.anInt7776 * 480250987, class589.anInt7777 * -584546219, class589.anInt7774 * -1545622483, -1953759157);
				else
					aClass62_11902.method1045(-(class589.anInt7776 * 480250987), -584546219 * class589.anInt7777, -1545622483 * class589.anInt7774, -1550092428);
			}
			if (-1345933713 * class589.anInt7770 != 0)
				aClass62_11942.method1045(class589.anInt7781 * -880668853, -1345933713 * class589.anInt7770, class589.anInt7780 * 147886395, -1766185049);
		} else {
			if (class589.anInt7777 * -584546219 != 0)
				aClass62_11902.method1045(0, -584546219 * class589.anInt7777, -1545622483 * class589.anInt7774, -1703825568);
			else
				aClass62_11902.method1050(0, -647838741);
			if (0 != class589.anInt7770 * -1345933713)
				aClass62_11942.method1045(0, class589.anInt7770 * -1345933713, 147886395 * class589.anInt7780, -1989431546);
			else
				aClass62_11942.method1050(0, -102141863);
		}
		return i_1_;
	}

	public void method10867(int direction) {
		Class589 class589 = method10877(1070297526);
		if (-272071129 * class589.anInt7784 != 0 || 758944217 * anInt11938 != 0) {
			aClass62_11940.method1049((byte) 2);
			int i_3_ = direction - 897724319 * aClass62_11940.anInt700 & 0x3fff;
			if (i_3_ > 8192)
				anInt11939 = 383832397 * (aClass62_11940.anInt700 * 897724319 - (16384 - i_3_));
			else
				anInt11939 = 383832397 * (i_3_ + aClass62_11940.anInt700 * 897724319);
		}
	}

	public boolean method10868(int i, int i_4_, int i_5_) {
		if (null == anIntArray11918) {
			if (i_4_ == -1)
				return true;
			anIntArray11918 = new int[Class71.aClass631_796.anIntArray8241.length];
			for (int i_6_ = 0; i_6_ < Class71.aClass631_796.anIntArray8241.length; i_6_++)
				anIntArray11918[i_6_] = -1;
		}
		Class589 class589 = method10877(-915727020);
		int i_7_ = 256;
		if (null != class589.anIntArray7772 && class589.anIntArray7772[i] > 0)
			i_7_ = class589.anIntArray7772[i];
		if (-1 == i_4_) {
			if (anIntArray11918[i] == -1)
				return true;
			int i_8_ = aClass62_11940.method1047((byte) 16);
			int i_9_ = anIntArray11918[i];
			int i_10_ = i_8_ - i_9_;
			if (i_10_ >= -i_7_ && i_10_ <= i_7_) {
				anIntArray11918[i] = -1;
				for (int i_11_ = 0; i_11_ < Class71.aClass631_796.anIntArray8241.length; i_11_++) {
					if (-1 != anIntArray11918[i_11_])
						return true;
				}
				anIntArray11918 = null;
				return true;
			}
			if (i_10_ > 0 && i_10_ <= 8192 || i_10_ <= -8192)
				anIntArray11918[i] = i_9_ + i_7_ & 0x3fff;
			else
				anIntArray11918[i] = i_9_ - i_7_ & 0x3fff;
			return false;
		}
		if (anIntArray11918[i] == -1)
			anIntArray11918[i] = aClass62_11940.method1047((byte) 16);
		int i_12_ = anIntArray11918[i];
		int i_13_ = i_4_ - i_12_;
		if (i_13_ >= -i_7_ && i_13_ <= i_7_) {
			anIntArray11918[i] = i_4_;
			return true;
		}
		if (i_13_ > 0 && i_13_ <= 8192 || i_13_ <= -8192)
			anIntArray11918[i] = i_7_ + i_12_ & 0x3fff;
		else
			anIntArray11918[i] = i_12_ - i_7_ & 0x3fff;
		return false;
	}

	public void method10869(String string, int i, int i_14_, int i_15_, short i_16_) {
		if (null == aClass533_11903)
			aClass533_11903 = new Class533();
		aClass533_11903.aString7126 = string;
		aClass533_11903.anInt7125 = -1394437055 * i;
		aClass533_11903.anInt7127 = i_14_ * -2010906123;
		aClass533_11903.anInt7129 = (aClass533_11903.anInt7128 = 859865345 * i_15_) * -957297013;
	}

	public final void method10870(int i) {
		stepsCount = 0;
		anInt11948 = 0;
	}

	public final void method10871(int i, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_) {
		boolean bool = true;
		boolean bool_23_ = true;
		for (int i_24_ = 0; i_24_ < -1964901131 * Class644.aClass628_8352.anInt8185; i_24_++) {
			if (anIntArray11907[i_24_] > i_20_)
				bool = false;
			else
				bool_23_ = false;
		}
		int i_25_ = -1;
		int i_26_ = -1;
		int i_27_ = 0;
		if (i >= 0) {
			Class587 class587 = ((Class587) Class524.aClass34_Sub10_7097.method70(i, (byte) 95));
			i_26_ = class587.anInt7730 * -572011161;
			i_27_ = class587.anInt7715 * 2071058317;
		}
		if (bool_23_) {
			if (-1 == i_26_)
				return;
			i_25_ = 0;
			int i_28_ = 0;
			if (0 == i_26_)
				i_28_ = anIntArray11907[0];
			else if (i_26_ == 1)
				i_28_ = anIntArray11906[0];
			for (int i_29_ = 1; i_29_ < Class644.aClass628_8352.anInt8185 * -1964901131; i_29_++) {
				if (i_26_ == 0) {
					if (anIntArray11907[i_29_] < i_28_) {
						i_25_ = i_29_;
						i_28_ = anIntArray11907[i_29_];
					}
				} else if (i_26_ == 1 && anIntArray11906[i_29_] < i_28_) {
					i_25_ = i_29_;
					i_28_ = anIntArray11906[i_29_];
				}
			}
			if (i_26_ == 1 && i_28_ >= i_17_)
				return;
		} else {
			if (bool)
				aByte11904 = (byte) 0;
			for (int i_30_ = 0; i_30_ < -1964901131 * Class644.aClass628_8352.anInt8185; i_30_++) {
				int i_31_ = aByte11904;
				aByte11904 = (byte) ((aByte11904 + 1) % (Class644.aClass628_8352.anInt8185 * -1964901131));
				if (anIntArray11907[i_31_] <= i_20_) {
					i_25_ = i_31_;
					break;
				}
			}
		}
		if (i_25_ >= 0) {
			anIntArray11941[i_25_] = i;
			anIntArray11906[i_25_] = i_17_;
			anIntArray11932[i_25_] = i_18_;
			anIntArray11909[i_25_] = i_19_;
			anIntArray11907[i_25_] = i_21_ + (i_20_ + i_27_);
		}
	}

	public int method9984() {
		if (-32768 == -1265312341 * anInt11908)
			return 0;
		return anInt11908 * -1265312341;
	}

	public final void method10872(int i, short i_32_) {
		Class546 class546 = (Class546) Class257.aClass34_Sub5_2765.method70(i, (byte) 28);
		for (Class521_Sub1 class521_sub1 = (Class521_Sub1) aClass695_11910.method8210(-1001678932); null != class521_sub1; class521_sub1 = (Class521_Sub1) aClass695_11910.method8219(420722822)) {
			if (class521_sub1.aClass546_10293 == class546) {
				class521_sub1.method6354((byte) -46);
				break;
			}
		}
	}

	public int method9953(int i) {
		Class589 class589 = method10877(47434380);
		int i_33_;
		if (-1158847077 * class589.anInt7783 != -1)
			i_33_ = class589.anInt7783 * -1158847077;
		else if (-32768 == anInt11893 * 95899953)
			i_33_ = 200;
		else
			i_33_ = -(95899953 * anInt11893);
		Class431 class431 = method7837();
		int i_34_ = (int) class431.aClass436_4823.aFloat4850 >> 9;
		int i_35_ = (int) class431.aClass436_4823.aFloat4853 >> 9;
		if (aClass553_10838 != null && i_34_ >= 1 && i_35_ >= 1 && i_34_ <= client.aClass515_11066.method6321((byte) -13) - 1 && i_35_ <= client.aClass515_11066.method6243(177401017) - 1) {
			Class556 class556 = (aClass553_10838.aClass556ArrayArrayArray7430[aByte10839][i_34_][i_35_]);
			if (null != class556 && null != class556.aClass649_Sub1_Sub2_7503)
				return i_33_ + class556.aClass649_Sub1_Sub2_7503.aShort11755;
		}
		return i_33_;
	}

	public void method10873(int i, int i_36_) {
		anInt11899 = 1594517637 * i;
	}

	public int method10874() {
		return -185511859 * anInt11899;
	}

	public void method10836(short i) {
		int i_37_ = 240 + (-185511859 * anInt11899 - 1 << 8);
		Class436 class436 = method7837().aClass436_4823;
		aShort11867 = (short) ((int) class436.aFloat4850 - i_37_ >> 9);
		aShort11865 = (short) ((int) class436.aFloat4853 - i_37_ >> 9);
		aShort11864 = (short) ((int) class436.aFloat4850 + i_37_ >> 9);
		aShort11870 = (short) (i_37_ + (int) class436.aFloat4853 >> 9);
	}

	void method10875(Class167 class167, Class589 class589, int i, int i_38_, int i_39_, int i_40_, int i_41_) {
		for (int i_42_ = 0; i_42_ < aClass500Array11901.length; i_42_++) {
			byte i_43_ = 0;
			if (0 == i_42_)
				i_43_ = (byte) 2;
			else if (1 == i_42_)
				i_43_ = (byte) 5;
			else if (2 == i_42_)
				i_43_ = (byte) 1;
			else if (i_42_ == 3)
				i_43_ = (byte) 7;
			else if (4 == i_42_)
				i_43_ = (byte) 8;
			Class500 class500 = aClass500Array11901[i_42_];
			if (-1 != class500.anInt6839 * -1262960011 && !class500.aClass688_6843.method8128(-144709969)) {
				Class677 class677 = ((Class677) Class633.aClass34_Sub15_8260.method70((-1262960011 * (class500.anInt6839)), (byte) 94));
				int i_44_ = i;
				if (0 != class500.anInt6840 * 645624661)
					i_44_ |= 0x5;
				if (class500.anInt6842 * -1327719167 != 0)
					i_44_ |= 0x2;
				if (class500.anInt6838 * -1656610337 >= 0)
					i_44_ |= 0x7;
				if (class500.anInt6838 * -1656610337 >= 0 && null != class589.anIntArrayArray7749 && null != (class589.anIntArrayArray7749[class500.anInt6838 * -1656610337])) {
					Class177 class177 = (aClass177Array11953[i_42_ + 1] = class677.method8045(class167, i_44_, class500.aClass688_6843, i_43_, 42697280));
					if (null != class177) {
						int i_45_ = 0;
						int i_46_ = 0;
						int i_47_ = 0;
						if (class589.anIntArrayArray7749 != null && null != (class589.anIntArrayArray7749[-1656610337 * class500.anInt6838])) {
							i_45_ += (class589.anIntArrayArray7749[class500.anInt6838 * -1656610337][0]);
							i_46_ += (class589.anIntArrayArray7749[class500.anInt6838 * -1656610337][1]);
							i_47_ += (class589.anIntArrayArray7749[class500.anInt6838 * -1656610337][2]);
						}
						if (null != class589.anIntArrayArray7775 && null != (class589.anIntArrayArray7775[class500.anInt6838 * -1656610337])) {
							i_45_ += (class589.anIntArrayArray7775[-1656610337 * class500.anInt6838][0]);
							i_46_ += (class589.anIntArrayArray7775[class500.anInt6838 * -1656610337][1]);
							i_47_ += (class589.anIntArrayArray7775[-1656610337 * class500.anInt6838][2]);
						}
						if (0 != i_47_ || 0 != i_45_) {
							int i_48_ = i_40_;
							if (anIntArray11918 != null && -1 != (anIntArray11918[-1656610337 * class500.anInt6838]))
								i_48_ = (anIntArray11918[-1656610337 * class500.anInt6838]);
							int i_49_ = ((i_48_ + class500.anInt6840 * -610621440 - i_40_) & 0x3fff);
							if (i_49_ != 0)
								class177.method2541(i_49_);
							int i_50_ = Class447.anIntArray4906[i_49_];
							int i_51_ = Class447.anIntArray4921[i_49_];
							int i_52_ = i_47_ * i_50_ + i_45_ * i_51_ >> 14;
							i_47_ = i_51_ * i_47_ - i_50_ * i_45_ >> 14;
							i_45_ = i_52_;
						}
						class177.method2472(i_45_, i_46_, i_47_);
						if (0 != class500.anInt6842 * -1327719167)
							class177.method2472(0, -(-1327719167 * class500.anInt6842) << 2, 0);
						class177.aBool1939 = false;
					}
				} else {
					Class177 class177 = (aClass177Array11953[i_42_ + 1] = class677.method8046(class167, i_44_, (-610621440 * class500.anInt6840), anInt11892 * 1681595873, anInt11900 * 1915921525, anInt11891 * -2111850483, class500.aClass688_6843, i_43_, -1133280616));
					if (null != class177) {
						if (class500.anInt6842 * -1327719167 != 0)
							class177.method2472(0, -(class500.anInt6842 * -1327719167) << 2, 0);
						class177.aBool1939 = false;
					}
				}
			} else
				aClass177Array11953[1 + i_42_] = null;
		}
	}

	void method10876(int i, int i_53_, int i_54_, int i_55_, int i_56_, int i_57_) {
		Class436 class436 = method7837().aClass436_4823;
		int i_58_ = aShort11864 + aShort11867 >> 1;
		int i_59_ = aShort11865 + aShort11870 >> 1;
		int i_60_ = Class447.anIntArray4906[i];
		int i_61_ = Class447.anIntArray4921[i];
		int i_62_ = -i_53_ / 2;
		int i_63_ = -i_54_ / 2;
		int i_64_ = i_61_ * i_62_ + i_63_ * i_60_ >> 14;
		int i_65_ = i_63_ * i_61_ - i_60_ * i_62_ >> 14;
		int i_66_ = Class158.method1891((int) class436.aFloat4850 + i_64_, i_65_ + (int) class436.aFloat4853, i_58_, i_59_, aByte10839, -1658535424);
		int i_67_ = i_53_ / 2;
		int i_68_ = -i_54_ / 2;
		int i_69_ = i_60_ * i_68_ + i_67_ * i_61_ >> 14;
		int i_70_ = i_61_ * i_68_ - i_60_ * i_67_ >> 14;
		int i_71_ = Class158.method1891(i_69_ + (int) class436.aFloat4850, (int) class436.aFloat4853 + i_70_, i_58_, i_59_, aByte10839, -1658535424);
		int i_72_ = -i_53_ / 2;
		int i_73_ = i_54_ / 2;
		int i_74_ = i_60_ * i_73_ + i_61_ * i_72_ >> 14;
		int i_75_ = i_61_ * i_73_ - i_60_ * i_72_ >> 14;
		int i_76_ = Class158.method1891((int) class436.aFloat4850 + i_74_, (int) class436.aFloat4853 + i_75_, i_58_, i_59_, aByte10839, -1658535424);
		int i_77_ = i_53_ / 2;
		int i_78_ = i_54_ / 2;
		int i_79_ = i_78_ * i_60_ + i_61_ * i_77_ >> 14;
		int i_80_ = i_78_ * i_61_ - i_60_ * i_77_ >> 14;
		int i_81_ = Class158.method1891(i_79_ + (int) class436.aFloat4850, i_80_ + (int) class436.aFloat4853, i_58_, i_59_, aByte10839, -1658535424);
		int i_82_ = i_66_ < i_71_ ? i_66_ : i_71_;
		int i_83_ = i_76_ < i_81_ ? i_76_ : i_81_;
		int i_84_ = i_71_ < i_81_ ? i_71_ : i_81_;
		int i_85_ = i_66_ < i_76_ ? i_66_ : i_76_;
		anInt11892 = ((int) (Math.atan2((double) (i_82_ - i_83_), (double) i_54_) * 2607.5945876176133) & 0x3fff) * -22419935;
		anInt11900 = ((int) (Math.atan2((double) (i_85_ - i_84_), (double) i_53_) * 2607.5945876176133) & 0x3fff) * 897256413;
		if (anInt11892 * 1681595873 != 0 && i_55_ != 0) {
			int i_86_ = 16384 - i_55_;
			if (1681595873 * anInt11892 > 8192) {
				if (1681595873 * anInt11892 < i_86_)
					anInt11892 = -22419935 * i_86_;
			} else if (1681595873 * anInt11892 > i_55_)
				anInt11892 = -22419935 * i_55_;
		}
		if (anInt11900 * 1915921525 != 0 && 0 != i_56_) {
			int i_87_ = 16384 - i_56_;
			if (1915921525 * anInt11900 > 8192) {
				if (anInt11900 * 1915921525 < i_87_)
					anInt11900 = i_87_ * 897256413;
			} else if (1915921525 * anInt11900 > i_56_)
				anInt11900 = 897256413 * i_56_;
		}
		anInt11891 = (i_66_ + i_81_) * -519088443;
		if (i_76_ + i_71_ < anInt11891 * -2111850483)
			anInt11891 = -519088443 * (i_76_ + i_71_);
		anInt11891 = -519088443 * ((-2111850483 * anInt11891 >> 1) - (int) class436.aFloat4852);
	}

	public Class589 method10877(int i) {
		int i_88_ = method10897(1991099139);
		if (-1 == i_88_)
			return Class34_Sub16.aClass589_10972;
		return ((Class589) Class497.aClass34_Sub16_5554.method70(i_88_, (byte) 21));
	}

	public abstract int method10878();

	public abstract int method10879(byte i);

	public abstract Class533 method10880(int i);

	public Class598 method10881(byte i) {
		Class436 class436 = method7837().aClass436_4823;
		Class598 class598 = client.aClass515_11066.method6255(-1492303829);
		int i_89_ = (((int) class436.aFloat4850 >> 9) + 1858049507 * class598.anInt7839);
		int i_90_ = (((int) class436.aFloat4853 >> 9) + 1479112045 * class598.anInt7840);
		return new Class598(aByte10839, i_89_, i_90_);
	}

	boolean method10882(int i, short i_91_) {
		if (-1605904535 * anInt11956 == i)
			return true;
		aClass234_11955 = Class671.method8019(i, null, null, true, (byte) 124);
		if (aClass234_11955 == null)
			return false;
		anInt11956 = i * -1314772775;
		Class609.method7262(aClass234_11955.icomponentDefinitions, (byte) 1);
		return true;
	}

	public void method10883(int i, int i_92_, int i_93_, int i_94_, int i_95_, int i_96_, int i_97_, int i_98_, int i_99_) {
		if (method10889((byte) -107))
			client.method10381(aClass234_11955, aClass234_11955.method3339(858907803), -1, i, i_92_, i_93_, i_94_, i_95_, i_96_, i_97_, i_98_);
	}

	public void method10884(int i, int i_100_, int i_101_, int i_102_, int i_103_, int i_104_, int i_105_, byte i_106_) {
		if (!method10889((byte) -26)) {
			if (i != -1)
				client.aBoolArray11240[i] = true;
			else {
				for (int i_107_ = 0; i_107_ < 106; i_107_++)
					client.aBoolArray11240[i_107_] = true;
			}
		} else
			Class620.method7404(aClass234_11955.method3339(858907803), -1, i_100_, i_101_, i_102_, i_103_, i_104_, i_105_, i, false, 1196072306);
	}

	public Class536_Sub30 method10885(int i) {
		Class436 class436 = method7837().aClass436_4823;
		Class598 class598 = client.aClass515_11066.method6255(-1943750197);
		int i_108_ = (int) class436.aFloat4850 + 2133575168 * class598.anInt7839;
		int i_109_ = (int) class436.aFloat4852;
		int i_110_ = (int) class436.aFloat4853 + class598.anInt7840 * 1391122944;
		return new Class536_Sub30(aByte10839, i_108_, i_109_, i_110_);
	}

	public abstract int method10886(int i);

	public void finalize() {
		if (aClass627_11950 != null)
			aClass627_11950.method7469();
	}

	void method10887() {
		if (aClass627_11950 != null)
			aClass627_11950.method7469();
	}

	void method10888() {
		if (aClass627_11950 != null)
			aClass627_11950.method7469();
	}

	boolean method9987() {
		return false;
	}

	boolean method9956() {
		return aBool11917;
	}

	public int method9941() {
		if (-32768 == -1265312341 * anInt11908)
			return 0;
		return anInt11908 * -1265312341;
	}

	public int method9958() {
		if (-32768 == -1265312341 * anInt11908)
			return 0;
		return anInt11908 * -1265312341;
	}

	public int method9964() {
		Class589 class589 = method10877(-1582955219);
		int i;
		if (-1158847077 * class589.anInt7783 != -1)
			i = class589.anInt7783 * -1158847077;
		else if (-32768 == anInt11893 * 95899953)
			i = 200;
		else
			i = -(95899953 * anInt11893);
		Class431 class431 = method7837();
		int i_111_ = (int) class431.aClass436_4823.aFloat4850 >> 9;
		int i_112_ = (int) class431.aClass436_4823.aFloat4853 >> 9;
		if (aClass553_10838 != null && i_111_ >= 1 && i_112_ >= 1 && i_111_ <= client.aClass515_11066.method6321((byte) 58) - 1 && i_112_ <= client.aClass515_11066.method6243(177401017) - 1) {
			Class556 class556 = (aClass553_10838.aClass556ArrayArrayArray7430[aByte10839][i_111_][i_112_]);
			if (null != class556 && null != class556.aClass649_Sub1_Sub2_7503)
				return i + class556.aClass649_Sub1_Sub2_7503.aShort11755;
		}
		return i;
	}

	boolean method10889(byte i) {
		if (anInt11887 * 388434805 == -1)
			return false;
		return method10882(388434805 * anInt11887, (short) 255);
	}

	public void method10890(int i) {
		Class589 class589 = method10877(987165612);
		if (-272071129 * class589.anInt7784 != 0 || 758944217 * anInt11938 != 0) {
			aClass62_11940.method1049((byte) 2);
			int i_113_ = i - 897724319 * aClass62_11940.anInt700 & 0x3fff;
			if (i_113_ > 8192)
				anInt11939 = 383832397 * (aClass62_11940.anInt700 * 897724319 - (16384 - i_113_));
			else
				anInt11939 = 383832397 * (i_113_ + aClass62_11940.anInt700 * 897724319);
		}
	}

	public void method10891(int i) {
		Class589 class589 = method10877(199862419);
		if (-272071129 * class589.anInt7784 != 0 || 758944217 * anInt11938 != 0) {
			aClass62_11940.method1049((byte) 2);
			int i_114_ = i - 897724319 * aClass62_11940.anInt700 & 0x3fff;
			if (i_114_ > 8192)
				anInt11939 = 383832397 * (aClass62_11940.anInt700 * 897724319 - (16384 - i_114_));
			else
				anInt11939 = 383832397 * (i_114_ + aClass62_11940.anInt700 * 897724319);
		}
	}

	public int method10892() {
		Class589 class589 = method10877(-351118035);
		int i = 897724319 * aClass62_11940.anInt700;
		boolean bool;
		if (0 != class589.anInt7784 * -272071129)
			bool = aClass62_11940.method1045(anInt11939 * -1999712379, class589.anInt7784 * -272071129, class589.anInt7779 * 770721009, -1776129493);
		else
			bool = aClass62_11940.method1045(anInt11939 * -1999712379, 758944217 * anInt11938, anInt11938 * 758944217, -1744884119);
		int i_115_ = aClass62_11940.anInt700 * 897724319 - i;
		if (0 != i_115_)
			anInt11937 += -1158948207;
		else {
			anInt11937 = 0;
			aClass62_11940.method1050(-1999712379 * anInt11939, 1122045832);
		}
		if (bool) {
			if (0 != -584546219 * class589.anInt7777) {
				if (i_115_ > 0)
					aClass62_11902.method1045(class589.anInt7776 * 480250987, class589.anInt7777 * -584546219, class589.anInt7774 * -1545622483, -2042615120);
				else
					aClass62_11902.method1045(-(class589.anInt7776 * 480250987), -584546219 * class589.anInt7777, -1545622483 * class589.anInt7774, -2048396588);
			}
			if (-1345933713 * class589.anInt7770 != 0)
				aClass62_11942.method1045(class589.anInt7781 * -880668853, -1345933713 * class589.anInt7770, class589.anInt7780 * 147886395, -1962364843);
		} else {
			if (class589.anInt7777 * -584546219 != 0)
				aClass62_11902.method1045(0, -584546219 * class589.anInt7777, -1545622483 * class589.anInt7774, -1735258391);
			else
				aClass62_11902.method1050(0, 1912721475);
			if (0 != class589.anInt7770 * -1345933713)
				aClass62_11942.method1045(0, class589.anInt7770 * -1345933713, 147886395 * class589.anInt7780, -1626762716);
			else
				aClass62_11942.method1050(0, 970377172);
		}
		return i_115_;
	}

	public void method10893(int i, boolean bool, byte i_116_) {
		Class589 class589 = method10877(-1940437370);
		if (bool || 0 != -272071129 * class589.anInt7784 || anInt11938 * 758944217 != 0) {
			anInt11939 = 383832397 * (i & 0x3fff);
			aClass62_11940.method1050(anInt11939 * -1999712379, -228801070);
		}
	}

	public final void method10894() {
		stepsCount = 0;
		anInt11948 = 0;
	}

	public void method10895(int[] is, int[] is_117_, int i) {
		if (null == anIntArray11912 && is != null)
			anIntArray11912 = new int[Class71.aClass631_796.anIntArray8241.length];
		else if (is == null) {
			anIntArray11912 = null;
			return;
		}
		for (int i_118_ = 0; i_118_ < anIntArray11912.length; i_118_++)
			anIntArray11912[i_118_] = -1;
		for (int i_119_ = 0; i_119_ < is.length; i_119_++) {
			int i_120_ = is_117_[i_119_];
			int i_121_ = 0;
			while (i_121_ < anIntArray11912.length) {
				if (0 != (i_120_ & 0x1))
					anIntArray11912[i_121_] = is[i_119_];
				i_121_++;
				i_120_ >>= 1;
			}
		}
	}

	public final void method10896() {
		stepsCount = 0;
		anInt11948 = 0;
	}

	abstract int method10897(int i);

	void method10898(Class167 class167, Class177[] class177s, Class433 class433, boolean bool, int i) {
		if (!bool) {
			int i_122_ = 0;
			int i_123_ = 0;
			int i_124_ = 0;
			int i_125_ = 0;
			int i_126_ = -1;
			int i_127_ = -1;
			Class172[][] class172s = new Class172[class177s.length][];
			Class156[][] class156s = new Class156[class177s.length][];
			for (int i_128_ = 0; i_128_ < class177s.length; i_128_++) {
				if (null != class177s[i_128_]) {
					class177s[i_128_].method2513(class433);
					class172s[i_128_] = class177s[i_128_].method2514();
					class156s[i_128_] = class177s[i_128_].method2515();
					if (class172s[i_128_] != null) {
						i_126_ = i_128_;
						i_123_++;
						i_122_ += class172s[i_128_].length;
					}
					if (class156s[i_128_] != null) {
						i_127_ = i_128_;
						i_125_++;
						i_124_ += class156s[i_128_].length;
					}
				}
			}
			if ((null == aClass627_11950 || aClass627_11950.aBool8168) && (i_123_ > 0 || i_125_ > 0))
				aClass627_11950 = Class627.method7484(client.cycles, true);
			if (aClass627_11950 != null) {
				Object object = null;
				Class172[] class172s_129_;
				if (i_123_ == 1)
					class172s_129_ = class172s[i_126_];
				else {
					class172s_129_ = new Class172[i_122_];
					int i_130_ = 0;
					for (int i_131_ = 0; i_131_ < class177s.length; i_131_++) {
						if (class172s[i_131_] != null) {
							System.arraycopy(class172s[i_131_], 0, class172s_129_, i_130_, class172s[i_131_].length);
							i_130_ += class172s[i_131_].length;
						}
					}
				}
				Object object_132_ = null;
				Class156[] class156s_133_;
				if (i_125_ == 1)
					class156s_133_ = class156s[i_127_];
				else {
					class156s_133_ = new Class156[i_124_];
					int i_134_ = 0;
					for (int i_135_ = 0; i_135_ < class177s.length; i_135_++) {
						if (null != class156s[i_135_]) {
							System.arraycopy(class156s[i_135_], 0, class156s_133_, i_134_, class156s[i_135_].length);
							i_134_ += class156s[i_135_].length;
						}
					}
				}
				aClass627_11950.method7474(class167, (long) client.cycles, class172s_129_, class156s_133_, false);
				aBool11931 = true;
			}
		} else if (null != aClass627_11950)
			aClass627_11950.method7485((long) client.cycles);
		if (aClass627_11950 != null)
			aClass627_11950.method7473(aByte10839, aShort11867, aShort11864, aShort11865, aShort11870);
	}

	public abstract int method10899();

	public final void method10900(int i) {
		Class546 class546 = (Class546) Class257.aClass34_Sub5_2765.method70(i, (byte) 39);
		for (Class521_Sub1 class521_sub1 = (Class521_Sub1) aClass695_11910.method8210(-457751449); null != class521_sub1; class521_sub1 = (Class521_Sub1) aClass695_11910.method8219(928735830)) {
			if (class521_sub1.aClass546_10293 == class546) {
				class521_sub1.method6354((byte) 91);
				break;
			}
		}
	}

	public final void method10901() {
		stepsCount = 0;
		anInt11948 = 0;
	}

	public int method10902() {
		return -185511859 * anInt11899;
	}

	public int method10903() {
		return -185511859 * anInt11899;
	}

	public int method10904() {
		return -185511859 * anInt11899;
	}

	public void method10837() {
		int i = 240 + (-185511859 * anInt11899 - 1 << 8);
		Class436 class436 = method7837().aClass436_4823;
		aShort11867 = (short) ((int) class436.aFloat4850 - i >> 9);
		aShort11865 = (short) ((int) class436.aFloat4853 - i >> 9);
		aShort11864 = (short) ((int) class436.aFloat4850 + i >> 9);
		aShort11870 = (short) (i + (int) class436.aFloat4853 >> 9);
	}

	public void method10905(byte i) {
		if (null != aClass533_11903 && null != aClass533_11903.aString7126) {
			aClass533_11903.anInt7129 -= 1925503371;
			if (aClass533_11903.anInt7129 * 1133970979 == 0)
				aClass533_11903.aString7126 = null;
		}
	}

	public final void method10906(int i, int i_136_, int i_137_, int i_138_, int i_139_, int i_140_, int i_141_) {
		Class546 class546 = (Class546) Class257.aClass34_Sub5_2765.method70(i, (byte) -77);
		Class521_Sub1 class521_sub1 = null;
		Class521_Sub1 class521_sub1_142_ = null;
		int i_143_ = 836792535 * class546.anInt7278;
		int i_144_ = 0;
		for (Class521_Sub1 class521_sub1_145_ = (Class521_Sub1) aClass695_11910.method8210(-894818507); class521_sub1_145_ != null; class521_sub1_145_ = (Class521_Sub1) aClass695_11910.method8219(-784645254)) {
			i_144_++;
			if (class546 == class521_sub1_145_.aClass546_10293) {
				class521_sub1_145_.method9327(i_136_ + i_138_, i_139_, i_140_, i_137_, 1995105191);
				return;
			}
			if (class521_sub1_145_.aClass546_10293.anInt7287 * 1884497545 <= class546.anInt7287 * 1884497545)
				class521_sub1 = class521_sub1_145_;
			if (class521_sub1_145_.aClass546_10293.anInt7278 * 836792535 > i_143_) {
				class521_sub1_142_ = class521_sub1_145_;
				i_143_ = class521_sub1_145_.aClass546_10293.anInt7278 * 836792535;
			}
		}
		if (class521_sub1_142_ != null || i_144_ < Class644.aClass628_8352.anInt8196 * -136205543) {
			Class521_Sub1 class521_sub1_146_ = new Class521_Sub1(class546);
			if (null == class521_sub1)
				aClass695_11910.method8212(class521_sub1_146_, -1217255275);
			else
				Class214.method3083(class521_sub1_146_, class521_sub1, 1047628076);
			class521_sub1_146_.method9327(i_136_ + i_138_, i_139_, i_140_, i_137_, 1974122619);
			if (i_144_ >= Class644.aClass628_8352.anInt8196 * -136205543)
				class521_sub1_142_.method6354((byte) -118);
		}
	}

	boolean method9974(int i) {
		return false;
	}

	abstract int method10907();

	public abstract int method10908();

	public abstract int method10909();

	public abstract int method10910();

	Class649_Sub1_Sub5_Sub1(Class553 class553, int i, Class98_Sub1 class98_sub1) {
		super(class553, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, (byte) 0);
		anInt11893 = -870875136;
		aBool11894 = true;
		anInt11896 = 0;
		anInt11897 = -604354379;
		anInt11905 = 0;
		anInt11954 = 0;
		aByte11904 = (byte) 0;
		anIntArray11941 = new int[-1964901131 * Class644.aClass628_8352.anInt8185];
		anIntArray11906 = new int[Class644.aClass628_8352.anInt8185 * -1964901131];
		anIntArray11907 = new int[-1964901131 * Class644.aClass628_8352.anInt8185];
		anIntArray11932 = new int[-1964901131 * Class644.aClass628_8352.anInt8185];
		anIntArray11909 = new int[Class644.aClass628_8352.anInt8185 * -1964901131];
		aClass695_11910 = new Class695();
		anInt11911 = 16791139;
		anIntArray11913 = null;
		aClass688_Sub3_11914 = new Class688_Sub3(this, false);
		aClass688_11925 = new Class688_Sub2(this, false);
		anInt11926 = -2109855411;
		anInt11927 = 2120654239;
		aByte11958 = (byte) 0;
		anInt11951 = 1881798629;
		anInt11933 = 0;
		anInt11934 = 0;
		anInt11937 = 0;
		anInt11938 = 1591634176;
		aClass62_11940 = new Class62();
		aClass62_11902 = new Class62();
		aClass62_11942 = new Class62();
		stepsCount = 0;
		anInt11915 = 0;
		anInt11948 = 0;
		anInt11949 = 0;
		aBool11931 = false;
		aBool11917 = false;
		anInt11956 = 1314772775;
		anInt11887 = -78064861;
		anInterface19_11888 = new Class527(this);
		screenX = new int[i];
		screenY = new int[i];
		aByteArray11946 = new byte[i];
		aClass177Array11953 = new Class177[6];
		aClass500Array11901 = new Class500[5];
		for (int i_147_ = 0; i_147_ < 5; i_147_++)
			aClass500Array11901[i_147_] = new Class500(this);
		aClass688_Sub2_Sub1Array11947 = (new Class688_Sub2_Sub1[Class71.aClass631_796.anIntArray8241.length]);
		anInterface3_11929 = new Class21(class98_sub1);
	}

	public abstract boolean method10911();

	public abstract boolean method10912();

	public abstract Class533 method10913();

	public abstract Class533 method10914();

	public void method10915() {
		if (null != aClass533_11903 && null != aClass533_11903.aString7126) {
			aClass533_11903.anInt7129 -= 1925503371;
			if (aClass533_11903.anInt7129 * 1133970979 == 0)
				aClass533_11903.aString7126 = null;
		}
	}

	boolean method9942(int i) {
		return aBool11917;
	}

	public void method10916(int i, int i_148_, boolean bool, int i_149_) {
		if (method10889((byte) -34))
			Class564.method6874(aClass234_11955.icomponentDefinitions, -1, i, i_148_, bool, -2096514705);
	}

	public final void method10917(int i, int i_150_, int i_151_, int i_152_, boolean bool, int i_153_, int i_154_) {
		Class500 class500 = aClass500Array11901[i_153_];
		int i_155_ = class500.anInt6839 * -1262960011;
		if (i != -1 && i_155_ != -1) {
			if (i_155_ == i) {
				Class677 class677 = ((Class677) Class633.aClass34_Sub15_8260.method70(i, (byte) -35));
				if (class677.aBool8604 && -1078340929 * class677.anInt8607 != -1) {
					Class191 class191 = ((Class191) (Class45.aClass34_Sub11_529.method70(-1078340929 * class677.anInt8607, (byte) 21)));
					int i_156_ = -15611351 * class191.anInt2169;
					if (0 == i_156_)
						return;
					if (i_156_ == 2) {
						class500.aClass688_6843.method8136(-1795941808);
						return;
					}
				}
			} else {
				Class677 class677 = ((Class677) Class633.aClass34_Sub15_8260.method70(i, (byte) 13));
				Class677 class677_157_ = ((Class677) Class633.aClass34_Sub15_8260.method70(i_155_, (byte) -59));
				if (-1 != -1078340929 * class677.anInt8607 && -1 != -1078340929 * class677_157_.anInt8607) {
					Class191 class191 = ((Class191) (Class45.aClass34_Sub11_529.method70(-1078340929 * class677.anInt8607, (byte) 23)));
					Class191 class191_158_ = ((Class191) Class45.aClass34_Sub11_529.method70(((class677_157_.anInt8607) * -1078340929), (byte) -86));
					if (class191.anInt2163 * -430743627 < class191_158_.anInt2163 * -430743627)
						return;
				}
			}
		}
		int i_159_ = 0;
		if (i != -1 && !(((Class677) Class633.aClass34_Sub15_8260.method70(i, (byte) 20)).aBool8604))
			i_159_ = 2;
		if (-1 != i && bool)
			i_159_ = 1;
		class500.anInt6839 = 1673100765 * i;
		class500.anInt6838 = i_152_ * 1016781343;
		class500.anInt6842 = -1033084159 * (i_150_ >> 16);
		class500.anInt6840 = -692260355 * i_151_;
		class500.aClass688_6843.method8126((i != -1 ? (((Class677) Class633.aClass34_Sub15_8260.method70(i, (byte) -20)).anInt8607) * -1078340929 : -1), i_150_ & 0xffff, i_159_, false, 1129506077);
	}

	void method10918(Class177 class177, byte i) {
		int i_160_ = aClass62_11902.anInt700 * 897724319;
		int i_161_ = aClass62_11942.anInt700 * 897724319;
		if (i_160_ != 0 || i_161_ != 0) {
			int i_162_ = class177.method2562() / 2;
			class177.method2472(0, -i_162_, 0);
			class177.method2529(i_160_ & 0x3fff);
			class177.method2457(i_161_ & 0x3fff);
			class177.method2472(0, i_162_, 0);
		}
	}

	static final void method10919(Class668 class668, int i) {
		int i_163_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Character.toUpperCase((char) i_163_);
	}

	static final void method10920(Class668 class668, int i) {
		if (client.aBool10984)
			Class412.aClass412_4393.method5009((byte) 40);
	}
}
