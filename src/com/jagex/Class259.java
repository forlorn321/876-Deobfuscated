/* Class259 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class259 implements Interface14 {
	public int[] anIntArray2828;
	public int anInt2829;
	int[][] anIntArrayArray2830;
	public int anInt2831;
	int[][] anIntArrayArray2832;
	public int anInt2833 = 0;
	public int anInt2834 = 0;
	public boolean aBool2835 = false;
	int[] anIntArray2836;
	int[] anIntArray2837;
	public int[] anIntArray2838;
	public String aString2839;
	public String[] aStringArray2840;
	public String aString2841;
	int[] anIntArray2842;
	Interface13 anInterface13_2843;
	public int[][] anIntArrayArray2844;
	public int[] anIntArray2845;
	int[] anIntArray2846;
	int[] anIntArray2847;
	public String[] aStringArray2848;
	Class14 aClass14_2849;
	public int anInt2850 = 931739821;

	Class259(int i, Interface13 interface13) {
		anInterface13_2843 = interface13;
	}

	public void method82(RSByteBuffer class527_sub38, int i) {
		for (;;) {
			int i_0_ = class527_sub38.readUnsignedByte();
			if (0 == i_0_)
				break;
			method4745(class527_sub38, i_0_, 1245051990);
		}
	}

	void method4745(RSByteBuffer class527_sub38, int i, int i_1_) {
		if (1 == i)
			aString2841 = class527_sub38.readVersionedString(90180177);
		else if (2 == i)
			aString2839 = class527_sub38.readVersionedString(90180177);
		else if (i == 3) {
			int i_2_ = class527_sub38.readUnsignedByte();
			anIntArrayArray2830 = new int[i_2_][3];
			for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
				anIntArrayArray2830[i_3_][0] = class527_sub38.readUnsignedShort();
				anIntArrayArray2830[i_3_][1] = class527_sub38.readInt();
				anIntArrayArray2830[i_3_][2] = class527_sub38.readInt();
			}
		} else if (i == 4) {
			int i_4_ = class527_sub38.readUnsignedByte();
			anIntArrayArray2832 = new int[i_4_][3];
			for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
				anIntArrayArray2832[i_5_][0] = class527_sub38.readUnsignedShort();
				anIntArrayArray2832[i_5_][1] = class527_sub38.readInt();
				anIntArrayArray2832[i_5_][2] = class527_sub38.readInt();
			}
		} else if (5 == i)
			class527_sub38.readUnsignedShort();
		else if (i == 6)
			anInt2833 = class527_sub38.readUnsignedByte() * -782635675;
		else if (i == 7)
			anInt2834 = class527_sub38.readUnsignedByte() * 1915114833;
		else if (8 == i)
			aBool2835 = true;
		else if (i == 9)
			anInt2831 = class527_sub38.readUnsignedByte() * -370073221;
		else if (10 == i) {
			int i_6_ = class527_sub38.readUnsignedByte();
			anIntArray2837 = new int[i_6_];
			for (int i_7_ = 0; i_7_ < i_6_; i_7_++)
				anIntArray2837[i_7_] = class527_sub38.readInt();
		} else if (12 == i)
			class527_sub38.readInt();
		else if (13 == i) {
			int i_8_ = class527_sub38.readUnsignedByte();
			anIntArray2838 = new int[i_8_];
			for (int i_9_ = 0; i_9_ < i_8_; i_9_++)
				anIntArray2838[i_9_] = class527_sub38.readUnsignedShort();
		} else if (14 == i) {
			int i_10_ = class527_sub38.readUnsignedByte();
			anIntArrayArray2844 = new int[i_10_][2];
			for (int i_11_ = 0; i_11_ < i_10_; i_11_++) {
				anIntArrayArray2844[i_11_][0] = class527_sub38.readUnsignedByte();
				anIntArrayArray2844[i_11_][1] = class527_sub38.readUnsignedByte();
			}
		} else if (15 == i)
			anInt2829 = class527_sub38.readUnsignedShort() * 249122429;
		else if (17 == i)
			anInt2850 = class527_sub38.method16466(-2078442261) * -931739821;
		else if (18 == i) {
			int i_12_ = class527_sub38.readUnsignedByte();
			anIntArray2828 = new int[i_12_];
			anIntArray2842 = new int[i_12_];
			anIntArray2836 = new int[i_12_];
			aStringArray2840 = new String[i_12_];
			for (int i_13_ = 0; i_13_ < i_12_; i_13_++) {
				anIntArray2828[i_13_] = class527_sub38.readInt();
				anIntArray2842[i_13_] = class527_sub38.readInt();
				anIntArray2836[i_13_] = class527_sub38.readInt();
				aStringArray2840[i_13_] = class527_sub38.readString(865358748);
			}
		} else if (i == 19) {
			int i_14_ = class527_sub38.readUnsignedByte();
			anIntArray2845 = new int[i_14_];
			anIntArray2846 = new int[i_14_];
			anIntArray2847 = new int[i_14_];
			aStringArray2848 = new String[i_14_];
			for (int i_15_ = 0; i_15_ < i_14_; i_15_++) {
				anIntArray2845[i_15_] = class527_sub38.readInt();
				anIntArray2846[i_15_] = class527_sub38.readInt();
				anIntArray2847[i_15_] = class527_sub38.readInt();
				aStringArray2848[i_15_] = class527_sub38.readString(816752031);
			}
		} else if (i == 249) {
			int i_16_ = class527_sub38.readUnsignedByte();
			if (null == aClass14_2849) {
				int i_17_ = Class186.method3652(i_16_, 162633360);
				aClass14_2849 = new Class14(i_17_);
			}
			for (int i_18_ = 0; i_18_ < i_16_; i_18_++) {
				boolean bool = class527_sub38.readUnsignedByte() == 1;
				int i_19_ = class527_sub38.read24BitUnsignedInteger(769905968);
				Class527 class527;
				if (bool)
					class527 = new Class527_Sub26(class527_sub38.readString(979767416));
				else
					class527 = new Node_Sub6(class527_sub38.readInt());
				aClass14_2849.method714(class527, (long) i_19_);
			}
		}
	}

	public void method86(int i) {
		if (aString2839 == null)
			aString2839 = aString2841;
	}

	public void method85() {
		if (aString2839 == null)
			aString2839 = aString2841;
	}

	public boolean method4746(Interface18 interface18, int i) {
		if (null == anIntArray2845 || i < 0 || i >= anIntArray2845.length)
			return false;
		Class333 class333 = ((Interface20) interface18).method123(anIntArray2845[i], 860602243);
		int i_20_ = interface18.method100(class333, (short) -1576);
		if (i_20_ < anIntArray2846[i] || i_20_ > anIntArray2847[i])
			return false;
		return true;
	}

	public boolean method4747(Interface18 interface18, int i) {
		if (anIntArrayArray2844 == null || i < 0 || i >= anIntArrayArray2844.length)
			return false;
		if (((Interface73) interface18).method483(anIntArrayArray2844[i][0], -1299218603) < anIntArrayArray2844[i][1])
			return false;
		return true;
	}

	public boolean method4748(Interface18 interface18, int i) {
		if (null == anIntArray2845 || i < 0 || i >= anIntArray2845.length)
			return false;
		Class333 class333 = ((Interface20) interface18).method123(anIntArray2845[i], 1617020672);
		int i_21_ = interface18.method100(class333, (short) -20048);
		if (i_21_ < anIntArray2846[i] || i_21_ > anIntArray2847[i])
			return false;
		return true;
	}

	public boolean method4749(Interface18 interface18, byte i) {
		if (Class448.method7277(interface18, anInterface13_2843, -746831377) < 1215109845 * anInt2829)
			return false;
		if (anIntArrayArray2844 != null) {
			for (int i_22_ = 0; i_22_ < anIntArrayArray2844.length; i_22_++) {
				if (((Interface73) interface18).method483(anIntArrayArray2844[i_22_][0], -6858439) < anIntArrayArray2844[i_22_][1])
					return false;
			}
		}
		if (null != anIntArray2838) {
			for (int i_23_ = 0; i_23_ < anIntArray2838.length; i_23_++) {
				if (!((Class259) anInterface13_2843.method81(anIntArray2838[i_23_], -330127709)).method4777(interface18, (byte) -113))
					return false;
			}
		}
		if (null != anIntArray2828) {
			for (int i_24_ = 0; i_24_ < anIntArray2828.length; i_24_++) {
				Class160 class160 = ((Interface20) interface18).method125((Class465.aClass465_5313), (anIntArray2828[i_24_]), -522586364);
				int i_25_ = interface18.method101(class160, 1096407173);
				if (i_25_ < anIntArray2842[i_24_] || i_25_ > anIntArray2836[i_24_])
					return false;
			}
		}
		if (anIntArray2845 != null) {
			for (int i_26_ = 0; i_26_ < anIntArray2845.length; i_26_++) {
				Class333 class333 = ((Interface20) interface18).method123(anIntArray2845[i_26_], -844898227);
				int i_27_ = interface18.method100(class333, (short) -28666);
				if (i_27_ < anIntArray2846[i_26_] || i_27_ > anIntArray2847[i_26_])
					return false;
			}
		}
		return true;
	}

	public boolean method4750(Interface18 interface18, byte i) {
		if (Class448.method7277(interface18, anInterface13_2843, -1026288926) < anInt2829 * 1215109845)
			return false;
		return true;
	}

	public boolean method4751(Interface18 interface18, int i) {
		if (null == anIntArray2828 || i < 0 || i >= anIntArray2828.length)
			return false;
		Class160 class160 = ((Interface20) interface18).method125(Class465.aClass465_5313, anIntArray2828[i], -916027360);
		int i_28_ = interface18.method101(class160, 1096407173);
		if (i_28_ < anIntArray2842[i] || i_28_ > anIntArray2836[i])
			return false;
		return true;
	}

	public boolean method4752(Interface18 interface18, int i, int i_29_) {
		if (null == anIntArray2838 || i < 0 || i >= anIntArray2838.length)
			return false;
		if (!((Class259) anInterface13_2843.method81(anIntArray2838[i], 1068648321)).method4777(interface18, (byte) -127))
			return false;
		return true;
	}

	public boolean method4753(Interface18 interface18, int i, short i_30_) {
		if (null == anIntArray2828 || i < 0 || i >= anIntArray2828.length)
			return false;
		Class160 class160 = ((Interface20) interface18).method125(Class465.aClass465_5313, anIntArray2828[i], -1289365625);
		int i_31_ = interface18.method101(class160, 1096407173);
		if (i_31_ < anIntArray2842[i] || i_31_ > anIntArray2836[i])
			return false;
		return true;
	}

	public boolean method4754(Interface18 interface18, int i, int i_32_) {
		if (null == anIntArray2845 || i < 0 || i >= anIntArray2845.length)
			return false;
		Class333 class333 = ((Interface20) interface18).method123(anIntArray2845[i], -943190946);
		int i_33_ = interface18.method100(class333, (short) -16769);
		if (i_33_ < anIntArray2846[i] || i_33_ > anIntArray2847[i])
			return false;
		return true;
	}

	public boolean method4755(Interface18 interface18, int i, int i_34_) {
		if (anIntArrayArray2844 == null || i < 0 || i >= anIntArrayArray2844.length)
			return false;
		if (((Interface73) interface18).method483(anIntArrayArray2844[i][0], -1852149287) < anIntArrayArray2844[i][1])
			return false;
		return true;
	}

	public void method73(RSByteBuffer class527_sub38) {
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			if (0 == i)
				break;
			method4745(class527_sub38, i, 267892778);
		}
	}

	public String method4756(int i, String string, byte i_35_) {
		if (null == aClass14_2849)
			return string;
		Class527_Sub26 class527_sub26 = (Class527_Sub26) aClass14_2849.method709((long) i);
		if (class527_sub26 == null)
			return string;
		return (String) class527_sub26.anObject10522;
	}

	public void method84() {
		if (aString2839 == null)
			aString2839 = aString2841;
	}

	public boolean method4757(Interface18 interface18, int i) {
		if (null == anIntArray2828 || i < 0 || i >= anIntArray2828.length)
			return false;
		Class160 class160 = ((Interface20) interface18).method125(Class465.aClass465_5313, anIntArray2828[i], -959455789);
		int i_36_ = interface18.method101(class160, 1096407173);
		if (i_36_ < anIntArray2842[i] || i_36_ > anIntArray2836[i])
			return false;
		return true;
	}

	public int method4758(int i, int i_37_) {
		if (aClass14_2849 == null)
			return i_37_;
		Node_Sub6 class527_sub7 = (Node_Sub6) aClass14_2849.method709((long) i);
		if (null == class527_sub7)
			return i_37_;
		return -78845949 * class527_sub7.anInt10398;
	}

	public int method4759(int i, int i_38_) {
		if (aClass14_2849 == null)
			return i_38_;
		Node_Sub6 class527_sub7 = (Node_Sub6) aClass14_2849.method709((long) i);
		if (null == class527_sub7)
			return i_38_;
		return -78845949 * class527_sub7.anInt10398;
	}

	public String method4760(int i, String string) {
		if (null == aClass14_2849)
			return string;
		Class527_Sub26 class527_sub26 = (Class527_Sub26) aClass14_2849.method709((long) i);
		if (class527_sub26 == null)
			return string;
		return (String) class527_sub26.anObject10522;
	}

	public int method4761(int i, int i_39_, int i_40_) {
		if (aClass14_2849 == null)
			return i_39_;
		Node_Sub6 class527_sub7 = (Node_Sub6) aClass14_2849.method709((long) i);
		if (null == class527_sub7)
			return i_39_;
		return -78845949 * class527_sub7.anInt10398;
	}

	public boolean method4762(Interface18 interface18) {
		if (Class448.method7277(interface18, anInterface13_2843, -541746659) < 1215109845 * anInt2829)
			return false;
		if (anIntArrayArray2844 != null) {
			for (int i = 0; i < anIntArrayArray2844.length; i++) {
				if (((Interface73) interface18).method483(anIntArrayArray2844[i][0], 239489857) < anIntArrayArray2844[i][1])
					return false;
			}
		}
		if (null != anIntArray2838) {
			for (int i = 0; i < anIntArray2838.length; i++) {
				if (!((Class259) anInterface13_2843.method81(anIntArray2838[i], -419075763)).method4777(interface18, (byte) -56))
					return false;
			}
		}
		if (null != anIntArray2828) {
			for (int i = 0; i < anIntArray2828.length; i++) {
				Class160 class160 = ((Interface20) interface18).method125((Class465.aClass465_5313), anIntArray2828[i], -1613589610);
				int i_41_ = interface18.method101(class160, 1096407173);
				if (i_41_ < anIntArray2842[i] || i_41_ > anIntArray2836[i])
					return false;
			}
		}
		if (anIntArray2845 != null) {
			for (int i = 0; i < anIntArray2845.length; i++) {
				Class333 class333 = ((Interface20) interface18).method123(anIntArray2845[i], -228910924);
				int i_42_ = interface18.method100(class333, (short) -19920);
				if (i_42_ < anIntArray2846[i] || i_42_ > anIntArray2847[i])
					return false;
			}
		}
		return true;
	}

	public boolean method4763(Interface18 interface18) {
		if (Class448.method7277(interface18, anInterface13_2843, -799460440) < 1215109845 * anInt2829)
			return false;
		if (anIntArrayArray2844 != null) {
			for (int i = 0; i < anIntArrayArray2844.length; i++) {
				if (((Interface73) interface18).method483(anIntArrayArray2844[i][0], -1534834953) < anIntArrayArray2844[i][1])
					return false;
			}
		}
		if (null != anIntArray2838) {
			for (int i = 0; i < anIntArray2838.length; i++) {
				if (!((Class259) anInterface13_2843.method81(anIntArray2838[i], 155220507)).method4777(interface18, (byte) -4))
					return false;
			}
		}
		if (null != anIntArray2828) {
			for (int i = 0; i < anIntArray2828.length; i++) {
				Class160 class160 = ((Interface20) interface18).method125((Class465.aClass465_5313), anIntArray2828[i], -795794157);
				int i_43_ = interface18.method101(class160, 1096407173);
				if (i_43_ < anIntArray2842[i] || i_43_ > anIntArray2836[i])
					return false;
			}
		}
		if (anIntArray2845 != null) {
			for (int i = 0; i < anIntArray2845.length; i++) {
				Class333 class333 = ((Interface20) interface18).method123(anIntArray2845[i], -1553256633);
				int i_44_ = interface18.method100(class333, (short) -1690);
				if (i_44_ < anIntArray2846[i] || i_44_ > anIntArray2847[i])
					return false;
			}
		}
		return true;
	}

	public boolean method4764(Interface18 interface18) {
		if (Class448.method7277(interface18, anInterface13_2843, -1721861254) < anInt2829 * 1215109845)
			return false;
		return true;
	}

	void method4765(RSByteBuffer class527_sub38, int i) {
		if (1 == i)
			aString2841 = class527_sub38.readVersionedString(90180177);
		else if (2 == i)
			aString2839 = class527_sub38.readVersionedString(90180177);
		else if (i == 3) {
			int i_45_ = class527_sub38.readUnsignedByte();
			anIntArrayArray2830 = new int[i_45_][3];
			for (int i_46_ = 0; i_46_ < i_45_; i_46_++) {
				anIntArrayArray2830[i_46_][0] = class527_sub38.readUnsignedShort();
				anIntArrayArray2830[i_46_][1] = class527_sub38.readInt();
				anIntArrayArray2830[i_46_][2] = class527_sub38.readInt();
			}
		} else if (i == 4) {
			int i_47_ = class527_sub38.readUnsignedByte();
			anIntArrayArray2832 = new int[i_47_][3];
			for (int i_48_ = 0; i_48_ < i_47_; i_48_++) {
				anIntArrayArray2832[i_48_][0] = class527_sub38.readUnsignedShort();
				anIntArrayArray2832[i_48_][1] = class527_sub38.readInt();
				anIntArrayArray2832[i_48_][2] = class527_sub38.readInt();
			}
		} else if (5 == i)
			class527_sub38.readUnsignedShort();
		else if (i == 6)
			anInt2833 = class527_sub38.readUnsignedByte() * -782635675;
		else if (i == 7)
			anInt2834 = class527_sub38.readUnsignedByte() * 1915114833;
		else if (8 == i)
			aBool2835 = true;
		else if (i == 9)
			anInt2831 = class527_sub38.readUnsignedByte() * -370073221;
		else if (10 == i) {
			int i_49_ = class527_sub38.readUnsignedByte();
			anIntArray2837 = new int[i_49_];
			for (int i_50_ = 0; i_50_ < i_49_; i_50_++)
				anIntArray2837[i_50_] = class527_sub38.readInt();
		} else if (12 == i)
			class527_sub38.readInt();
		else if (13 == i) {
			int i_51_ = class527_sub38.readUnsignedByte();
			anIntArray2838 = new int[i_51_];
			for (int i_52_ = 0; i_52_ < i_51_; i_52_++)
				anIntArray2838[i_52_] = class527_sub38.readUnsignedShort();
		} else if (14 == i) {
			int i_53_ = class527_sub38.readUnsignedByte();
			anIntArrayArray2844 = new int[i_53_][2];
			for (int i_54_ = 0; i_54_ < i_53_; i_54_++) {
				anIntArrayArray2844[i_54_][0] = class527_sub38.readUnsignedByte();
				anIntArrayArray2844[i_54_][1] = class527_sub38.readUnsignedByte();
			}
		} else if (15 == i)
			anInt2829 = class527_sub38.readUnsignedShort() * 249122429;
		else if (17 == i)
			anInt2850 = class527_sub38.method16466(-1737650198) * -931739821;
		else if (18 == i) {
			int i_55_ = class527_sub38.readUnsignedByte();
			anIntArray2828 = new int[i_55_];
			anIntArray2842 = new int[i_55_];
			anIntArray2836 = new int[i_55_];
			aStringArray2840 = new String[i_55_];
			for (int i_56_ = 0; i_56_ < i_55_; i_56_++) {
				anIntArray2828[i_56_] = class527_sub38.readInt();
				anIntArray2842[i_56_] = class527_sub38.readInt();
				anIntArray2836[i_56_] = class527_sub38.readInt();
				aStringArray2840[i_56_] = class527_sub38.readString(1751862226);
			}
		} else if (i == 19) {
			int i_57_ = class527_sub38.readUnsignedByte();
			anIntArray2845 = new int[i_57_];
			anIntArray2846 = new int[i_57_];
			anIntArray2847 = new int[i_57_];
			aStringArray2848 = new String[i_57_];
			for (int i_58_ = 0; i_58_ < i_57_; i_58_++) {
				anIntArray2845[i_58_] = class527_sub38.readInt();
				anIntArray2846[i_58_] = class527_sub38.readInt();
				anIntArray2847[i_58_] = class527_sub38.readInt();
				aStringArray2848[i_58_] = class527_sub38.readString(1288707376);
			}
		} else if (i == 249) {
			int i_59_ = class527_sub38.readUnsignedByte();
			if (null == aClass14_2849) {
				int i_60_ = Class186.method3652(i_59_, 1150213);
				aClass14_2849 = new Class14(i_60_);
			}
			for (int i_61_ = 0; i_61_ < i_59_; i_61_++) {
				boolean bool = class527_sub38.readUnsignedByte() == 1;
				int i_62_ = class527_sub38.read24BitUnsignedInteger(666023748);
				Class527 class527;
				if (bool)
					class527 = new Class527_Sub26(class527_sub38.readString(996154311));
				else
					class527 = new Node_Sub6(class527_sub38.readInt());
				aClass14_2849.method714(class527, (long) i_62_);
			}
		}
	}

	public boolean method4766(Interface18 interface18, int i) {
		if (null == anIntArray2828 || i < 0 || i >= anIntArray2828.length)
			return false;
		Class160 class160 = ((Interface20) interface18).method125(Class465.aClass465_5313, anIntArray2828[i], -1162102164);
		int i_63_ = interface18.method101(class160, 1096407173);
		if (i_63_ < anIntArray2842[i] || i_63_ > anIntArray2836[i])
			return false;
		return true;
	}

	public boolean method4767(Interface18 interface18, int i) {
		if (anIntArrayArray2844 == null || i < 0 || i >= anIntArrayArray2844.length)
			return false;
		if (((Interface73) interface18).method483(anIntArrayArray2844[i][0], 140798909) < anIntArrayArray2844[i][1])
			return false;
		return true;
	}

	public void method83(RSByteBuffer class527_sub38) {
		for (;;) {
			int i = class527_sub38.readUnsignedByte();
			if (0 == i)
				break;
			method4745(class527_sub38, i, 1841196467);
		}
	}

	public boolean method4768(Interface18 interface18, int i) {
		if (null == anIntArray2838 || i < 0 || i >= anIntArray2838.length)
			return false;
		if (!((Class259) anInterface13_2843.method81(anIntArray2838[i], -2082351119)).method4777(interface18, (byte) -26))
			return false;
		return true;
	}

	public boolean method4769(Interface18 interface18, int i) {
		if (null == anIntArray2838 || i < 0 || i >= anIntArray2838.length)
			return false;
		if (!((Class259) anInterface13_2843.method81(anIntArray2838[i], -204158563)).method4777(interface18, (byte) -33))
			return false;
		return true;
	}

	public boolean method4770(Interface18 interface18, int i) {
		if (null == anIntArray2838 || i < 0 || i >= anIntArray2838.length)
			return false;
		if (!((Class259) anInterface13_2843.method81(anIntArray2838[i], -166363481)).method4777(interface18, (byte) -33))
			return false;
		return true;
	}

	public boolean method4771(Interface18 interface18, int i) {
		if (null == anIntArray2828 || i < 0 || i >= anIntArray2828.length)
			return false;
		Class160 class160 = ((Interface20) interface18).method125(Class465.aClass465_5313, anIntArray2828[i], -1134566020);
		int i_64_ = interface18.method101(class160, 1096407173);
		if (i_64_ < anIntArray2842[i] || i_64_ > anIntArray2836[i])
			return false;
		return true;
	}

	public boolean method4772(Interface18 interface18, int i) {
		if (anIntArrayArray2844 == null || i < 0 || i >= anIntArrayArray2844.length)
			return false;
		if (((Interface73) interface18).method483(anIntArrayArray2844[i][0], 1879176120) < anIntArrayArray2844[i][1])
			return false;
		return true;
	}

	public boolean method4773(Interface18 interface18, int i) {
		if (anIntArrayArray2844 == null || i < 0 || i >= anIntArrayArray2844.length)
			return false;
		if (((Interface73) interface18).method483(anIntArrayArray2844[i][0], -1293704780) < anIntArrayArray2844[i][1])
			return false;
		return true;
	}

	public boolean method4774(Interface18 interface18, int i) {
		if (null != anIntArrayArray2830) {
			for (int i_65_ = 0; i_65_ < anIntArrayArray2830.length; i_65_++) {
				Class160 class160 = (((Interface20) interface18).method125(Class465.aClass465_5313, anIntArrayArray2830[i_65_][0], -1918739306));
				if (interface18.method101(class160, 1096407173) >= anIntArrayArray2830[i_65_][1])
					return true;
			}
		}
		if (anIntArrayArray2832 != null) {
			for (int i_66_ = 0; i_66_ < anIntArrayArray2832.length; i_66_++) {
				Class333 class333 = ((Interface20) interface18).method123(anIntArrayArray2832[i_66_][0], 377527674);
				if (interface18.method100(class333, (short) -27301) >= anIntArrayArray2832[i_66_][1])
					return true;
			}
		}
		return false;
	}

	public boolean method4775(Interface18 interface18) {
		if (null != anIntArrayArray2830) {
			for (int i = 0; i < anIntArrayArray2830.length; i++) {
				Class160 class160 = (((Interface20) interface18).method125(Class465.aClass465_5313, anIntArrayArray2830[i][0], -1707622823));
				if (interface18.method101(class160, 1096407173) >= anIntArrayArray2830[i][1])
					return true;
			}
		}
		if (anIntArrayArray2832 != null) {
			for (int i = 0; i < anIntArrayArray2832.length; i++) {
				Class333 class333 = ((Interface20) interface18).method123(anIntArrayArray2832[i][0], 561782280);
				if (interface18.method100(class333, (short) -16466) >= anIntArrayArray2832[i][1])
					return true;
			}
		}
		return false;
	}

	public boolean method4776(Interface18 interface18, int i) {
		if (null == anIntArray2845 || i < 0 || i >= anIntArray2845.length)
			return false;
		Class333 class333 = ((Interface20) interface18).method123(anIntArray2845[i], -1535420379);
		int i_67_ = interface18.method100(class333, (short) -30062);
		if (i_67_ < anIntArray2846[i] || i_67_ > anIntArray2847[i])
			return false;
		return true;
	}

	public boolean method4777(Interface18 interface18, byte i) {
		if (anIntArrayArray2830 != null) {
			for (int i_68_ = 0; i_68_ < anIntArrayArray2830.length; i_68_++) {
				Class160 class160 = (((Interface20) interface18).method125(Class465.aClass465_5313, anIntArrayArray2830[i_68_][0], -1761810843));
				if (interface18.method101(class160, 1096407173) >= anIntArrayArray2830[i_68_][2])
					return true;
			}
		}
		if (null != anIntArrayArray2832) {
			for (int i_69_ = 0; i_69_ < anIntArrayArray2832.length; i_69_++) {
				Class333 class333 = (((Interface20) interface18).method123(anIntArrayArray2832[i_69_][0], -1295356775));
				if (interface18.method100(class333, (short) -6184) >= anIntArrayArray2832[i_69_][2])
					return true;
			}
		}
		return false;
	}

	public boolean method4778(Interface18 interface18, int i) {
		if (null == anIntArray2845 || i < 0 || i >= anIntArray2845.length)
			return false;
		Class333 class333 = ((Interface20) interface18).method123(anIntArray2845[i], -224807802);
		int i_70_ = interface18.method100(class333, (short) -27308);
		if (i_70_ < anIntArray2846[i] || i_70_ > anIntArray2847[i])
			return false;
		return true;
	}

	static int method4779(Interface18 interface18, Interface13 interface13) {
		int i = 0;
		for (int i_71_ = 0; i_71_ < interface13.method77(1695387873); i_71_++) {
			Class259 class259 = (Class259) interface13.method81(i_71_, -2047156636);
			if (class259.method4777(interface18, (byte) -7))
				i += -1997826637 * class259.anInt2831;
		}
		return i;
	}

	public static Class501[] method4780(byte i) {
		return (new Class501[] { Class501.aClass501_6167, Class501.aClass501_5600, Class501.aClass501_6773, Class501.aClass501_6734, Class501.aClass501_5771, Class501.aClass501_5672, Class501.aClass501_6495, Class501.aClass501_6530, Class501.aClass501_6737, Class501.aClass501_6388, Class501.aClass501_6610, Class501.aClass501_6222, Class501.aClass501_5663, Class501.aClass501_5820, Class501.aClass501_5683, Class501.aClass501_5825, Class501.aClass501_5748, Class501.aClass501_6260,
				Class501.aClass501_6414, Class501.aClass501_5898, Class501.aClass501_6280, Class501.aClass501_6496, Class501.aClass501_6552, Class501.aClass501_6333, Class501.aClass501_6018, Class501.aClass501_6436, Class501.aClass501_6546, Class501.aClass501_6411, Class501.aClass501_5867, Class501.aClass501_5605, Class501.aClass501_6621, Class501.aClass501_6748, Class501.aClass501_6531, Class501.aClass501_6816, Class501.aClass501_6125, Class501.aClass501_5603, Class501.aClass501_6008,
				Class501.aClass501_6385, Class501.aClass501_6493, Class501.aClass501_6165, Class501.aClass501_6538, Class501.aClass501_6087, Class501.aClass501_6386, Class501.aClass501_5859, Class501.aClass501_6574, Class501.aClass501_6570, Class501.aClass501_6025, Class501.aClass501_5962, Class501.aClass501_6509, Class501.aClass501_6226, Class501.aClass501_6681, Class501.aClass501_6589, Class501.aClass501_5744, Class501.aClass501_6858, Class501.aClass501_6400, Class501.aClass501_6717,
				Class501.aClass501_6445, Class501.aClass501_5788, Class501.aClass501_5876, Class501.aClass501_5669, Class501.aClass501_6554, Class501.aClass501_6605, Class501.aClass501_6630, Class501.aClass501_6332, Class501.aClass501_6298, Class501.aClass501_6030, Class501.aClass501_5772, Class501.aClass501_6762, Class501.aClass501_5599, Class501.aClass501_6725, Class501.aClass501_5921, Class501.aClass501_6159, Class501.aClass501_6083, Class501.aClass501_5967, Class501.aClass501_6253,
				Class501.aClass501_5624, Class501.aClass501_6793, Class501.aClass501_6134, Class501.aClass501_6723, Class501.aClass501_6862, Class501.aClass501_5813, Class501.aClass501_6154, Class501.aClass501_5608, Class501.aClass501_6476, Class501.aClass501_6357, Class501.aClass501_6178, Class501.aClass501_6183, Class501.aClass501_6168, Class501.aClass501_6325, Class501.aClass501_6354, Class501.aClass501_5852, Class501.aClass501_6370, Class501.aClass501_6658, Class501.aClass501_6702,
				Class501.aClass501_5856, Class501.aClass501_6651, Class501.aClass501_6225, Class501.aClass501_5734, Class501.aClass501_6296, Class501.aClass501_6429, Class501.aClass501_6815, Class501.aClass501_5765, Class501.aClass501_5617, Class501.aClass501_6005, Class501.aClass501_6295, Class501.aClass501_6415, Class501.aClass501_5929, Class501.aClass501_5883, Class501.aClass501_6572, Class501.aClass501_6800, Class501.aClass501_6805, Class501.aClass501_5910, Class501.aClass501_6380,
				Class501.aClass501_5942, Class501.aClass501_6731, Class501.aClass501_6128, Class501.aClass501_5754, Class501.aClass501_6196, Class501.aClass501_5611, Class501.aClass501_6032, Class501.aClass501_6073, Class501.aClass501_6157, Class501.aClass501_6353, Class501.aClass501_5710, Class501.aClass501_6283, Class501.aClass501_6379, Class501.aClass501_6820, Class501.aClass501_6604, Class501.aClass501_6057, Class501.aClass501_6229, Class501.aClass501_6327, Class501.aClass501_6043,
				Class501.aClass501_5824, Class501.aClass501_5964, Class501.aClass501_6099, Class501.aClass501_6337, Class501.aClass501_5746, Class501.aClass501_6103, Class501.aClass501_6011, Class501.aClass501_6140, Class501.aClass501_6564, Class501.aClass501_5731, Class501.aClass501_6646, Class501.aClass501_6126, Class501.aClass501_6740, Class501.aClass501_6648, Class501.aClass501_5928, Class501.aClass501_6287, Class501.aClass501_6534, Class501.aClass501_5701, Class501.aClass501_5950,
				Class501.aClass501_5952, Class501.aClass501_5752, Class501.aClass501_6158, Class501.aClass501_5990, Class501.aClass501_6284, Class501.aClass501_6277, Class501.aClass501_6484, Class501.aClass501_6757, Class501.aClass501_6179, Class501.aClass501_6209, Class501.aClass501_6270, Class501.aClass501_6343, Class501.aClass501_5660, Class501.aClass501_6254, Class501.aClass501_6579, Class501.aClass501_6832, Class501.aClass501_5958, Class501.aClass501_6686, Class501.aClass501_6835,
				Class501.aClass501_6510, Class501.aClass501_5793, Class501.aClass501_6371, Class501.aClass501_6324, Class501.aClass501_6520, Class501.aClass501_6786, Class501.aClass501_6577, Class501.aClass501_5797, Class501.aClass501_5647, Class501.aClass501_5670, Class501.aClass501_6130, Class501.aClass501_5782, Class501.aClass501_6483, Class501.aClass501_6315, Class501.aClass501_6585, Class501.aClass501_6738, Class501.aClass501_6056, Class501.aClass501_5637, Class501.aClass501_6145,
				Class501.aClass501_6606, Class501.aClass501_6440, Class501.aClass501_5753, Class501.aClass501_6000, Class501.aClass501_6745, Class501.aClass501_5745, Class501.aClass501_6202, Class501.aClass501_6714, Class501.aClass501_6214, Class501.aClass501_6079, Class501.aClass501_5794, Class501.aClass501_6486, Class501.aClass501_6035, Class501.aClass501_6245, Class501.aClass501_5763, Class501.aClass501_5686, Class501.aClass501_6654, Class501.aClass501_6465, Class501.aClass501_6684,
				Class501.aClass501_6391, Class501.aClass501_5877, Class501.aClass501_6683, Class501.aClass501_6599, Class501.aClass501_6505, Class501.aClass501_6034, Class501.aClass501_6430, Class501.aClass501_6293, Class501.aClass501_5630, Class501.aClass501_5777, Class501.aClass501_5678, Class501.aClass501_6441, Class501.aClass501_6078, Class501.aClass501_6644, Class501.aClass501_6232, Class501.aClass501_6236, Class501.aClass501_5827, Class501.aClass501_5699, Class501.aClass501_5629,
				Class501.aClass501_6581, Class501.aClass501_5832, Class501.aClass501_6022, Class501.aClass501_6290, Class501.aClass501_6571, Class501.aClass501_6447, Class501.aClass501_6457, Class501.aClass501_5673, Class501.aClass501_6819, Class501.aClass501_6166, Class501.aClass501_5818, Class501.aClass501_6248, Class501.aClass501_6450, Class501.aClass501_5739, Class501.aClass501_5948, Class501.aClass501_6310, Class501.aClass501_5879, Class501.aClass501_6323, Class501.aClass501_6694,
				Class501.aClass501_6394, Class501.aClass501_6014, Class501.aClass501_5976, Class501.aClass501_5622, Class501.aClass501_6265, Class501.aClass501_6843, Class501.aClass501_6600, Class501.aClass501_5598, Class501.aClass501_5985, Class501.aClass501_6705, Class501.aClass501_6825, Class501.aClass501_6652, Class501.aClass501_5707, Class501.aClass501_5648, Class501.aClass501_6667, Class501.aClass501_6502, Class501.aClass501_5667, Class501.aClass501_6847, Class501.aClass501_5668,
				Class501.aClass501_5821, Class501.aClass501_5654, Class501.aClass501_6360, Class501.aClass501_5890, Class501.aClass501_5619, Class501.aClass501_6004, Class501.aClass501_5695, Class501.aClass501_6560, Class501.aClass501_6662, Class501.aClass501_6097, Class501.aClass501_6205, Class501.aClass501_6492, Class501.aClass501_6292, Class501.aClass501_6452, Class501.aClass501_6417, Class501.aClass501_5634, Class501.aClass501_5826, Class501.aClass501_6449, Class501.aClass501_6555,
				Class501.aClass501_6132, Class501.aClass501_5783, Class501.aClass501_5980, Class501.aClass501_5781, Class501.aClass501_6623, Class501.aClass501_5650, Class501.aClass501_6068, Class501.aClass501_6387, Class501.aClass501_5767, Class501.aClass501_5784, Class501.aClass501_6114, Class501.aClass501_5926, Class501.aClass501_6186, Class501.aClass501_6860, Class501.aClass501_6779, Class501.aClass501_6680, Class501.aClass501_6169, Class501.aClass501_6691, Class501.aClass501_6261,
				Class501.aClass501_6442, Class501.aClass501_5618, Class501.aClass501_5610, Class501.aClass501_6118, Class501.aClass501_6823, Class501.aClass501_6857, Class501.aClass501_6467, Class501.aClass501_6726, Class501.aClass501_6660, Class501.aClass501_6849, Class501.aClass501_6766, Class501.aClass501_5991, Class501.aClass501_5720, Class501.aClass501_5613, Class501.aClass501_6108, Class501.aClass501_6104, Class501.aClass501_5682, Class501.aClass501_5655, Class501.aClass501_5863,
				Class501.aClass501_6210, Class501.aClass501_6037, Class501.aClass501_5860, Class501.aClass501_5725, Class501.aClass501_5887, Class501.aClass501_5800, Class501.aClass501_5704, Class501.aClass501_5801, Class501.aClass501_5844, Class501.aClass501_6072, Class501.aClass501_6718, Class501.aClass501_6511, Class501.aClass501_6463, Class501.aClass501_6091, Class501.aClass501_6548, Class501.aClass501_6109, Class501.aClass501_6302, Class501.aClass501_6635, Class501.aClass501_6409,
				Class501.aClass501_5643, Class501.aClass501_5874, Class501.aClass501_5636, Class501.aClass501_6376, Class501.aClass501_6688, Class501.aClass501_6230, Class501.aClass501_6092, Class501.aClass501_6753, Class501.aClass501_6854, Class501.aClass501_6454, Class501.aClass501_6055, Class501.aClass501_6372, Class501.aClass501_6704, Class501.aClass501_6672, Class501.aClass501_6334, Class501.aClass501_6840, Class501.aClass501_6437, Class501.aClass501_6318, Class501.aClass501_5639,
				Class501.aClass501_5993, Class501.aClass501_6772, Class501.aClass501_6668, Class501.aClass501_6046, Class501.aClass501_5798, Class501.aClass501_6403, Class501.aClass501_5705, Class501.aClass501_6110, Class501.aClass501_6316, Class501.aClass501_6064, Class501.aClass501_6243, Class501.aClass501_6710, Class501.aClass501_5840, Class501.aClass501_6142, Class501.aClass501_5792, Class501.aClass501_5846, Class501.aClass501_6770, Class501.aClass501_5680, Class501.aClass501_6219,
				Class501.aClass501_6528, Class501.aClass501_5684, Class501.aClass501_6107, Class501.aClass501_6713, Class501.aClass501_6544, Class501.aClass501_6521, Class501.aClass501_5945, Class501.aClass501_6271, Class501.aClass501_5924, Class501.aClass501_6048, Class501.aClass501_5687, Class501.aClass501_6522, Class501.aClass501_6252, Class501.aClass501_5894, Class501.aClass501_6021, Class501.aClass501_6221, Class501.aClass501_6054, Class501.aClass501_6262, Class501.aClass501_6428,
				Class501.aClass501_5857, Class501.aClass501_5681, Class501.aClass501_6563, Class501.aClass501_5923, Class501.aClass501_5966, Class501.aClass501_6474, Class501.aClass501_6176, Class501.aClass501_6609, Class501.aClass501_6448, Class501.aClass501_6756, Class501.aClass501_6182, Class501.aClass501_5922, Class501.aClass501_6438, Class501.aClass501_6359, Class501.aClass501_6146, Class501.aClass501_5715, Class501.aClass501_6480, Class501.aClass501_6647, Class501.aClass501_6306,
				Class501.aClass501_6189, Class501.aClass501_5802, Class501.aClass501_6625, Class501.aClass501_6351, Class501.aClass501_5861, Class501.aClass501_5773, Class501.aClass501_6075, Class501.aClass501_6799, Class501.aClass501_6673, Class501.aClass501_5961, Class501.aClass501_6212, Class501.aClass501_5992, Class501.aClass501_6798, Class501.aClass501_5659, Class501.aClass501_6485, Class501.aClass501_6802, Class501.aClass501_6188, Class501.aClass501_5623, Class501.aClass501_6122,
				Class501.aClass501_5864, Class501.aClass501_6696, Class501.aClass501_5700, Class501.aClass501_6475, Class501.aClass501_6626, Class501.aClass501_6844, Class501.aClass501_6592, Class501.aClass501_6249, Class501.aClass501_6368, Class501.aClass501_5972, Class501.aClass501_6468, Class501.aClass501_5906, Class501.aClass501_5621, Class501.aClass501_5947, Class501.aClass501_5679, Class501.aClass501_5978, Class501.aClass501_6006, Class501.aClass501_6007, Class501.aClass501_6192,
				Class501.aClass501_5913, Class501.aClass501_5872, Class501.aClass501_6208, Class501.aClass501_6545, Class501.aClass501_6568, Class501.aClass501_5633, Class501.aClass501_5615, Class501.aClass501_6655, Class501.aClass501_6830, Class501.aClass501_5806, Class501.aClass501_6144, Class501.aClass501_6239, Class501.aClass501_5882, Class501.aClass501_6794, Class501.aClass501_6527, Class501.aClass501_5602, Class501.aClass501_6285, Class501.aClass501_6187, Class501.aClass501_6256,
				Class501.aClass501_6080, Class501.aClass501_6197, Class501.aClass501_6645, Class501.aClass501_5959, Class501.aClass501_6561, Class501.aClass501_6250, Class501.aClass501_5904, Class501.aClass501_6612, Class501.aClass501_5756, Class501.aClass501_5674, Class501.aClass501_6199, Class501.aClass501_6472, Class501.aClass501_5758, Class501.aClass501_6112, Class501.aClass501_6569, Class501.aClass501_6782, Class501.aClass501_6578, Class501.aClass501_5747, Class501.aClass501_6700,
				Class501.aClass501_5920, Class501.aClass501_6709, Class501.aClass501_6751, Class501.aClass501_6595, Class501.aClass501_6259, Class501.aClass501_5957, Class501.aClass501_5810, Class501.aClass501_5878, Class501.aClass501_6402, Class501.aClass501_6774, Class501.aClass501_6789, Class501.aClass501_5982, Class501.aClass501_5851, Class501.aClass501_5614, Class501.aClass501_6824, Class501.aClass501_5965, Class501.aClass501_6809, Class501.aClass501_5696, Class501.aClass501_6374,
				Class501.aClass501_6831, Class501.aClass501_6559, Class501.aClass501_5649, Class501.aClass501_6120, Class501.aClass501_5627, Class501.aClass501_6628, Class501.aClass501_6085, Class501.aClass501_6760, Class501.aClass501_6017, Class501.aClass501_6562, Class501.aClass501_6136, Class501.aClass501_6177, Class501.aClass501_6066, Class501.aClass501_6162, Class501.aClass501_6833, Class501.aClass501_6355, Class501.aClass501_6320, Class501.aClass501_6041, Class501.aClass501_6682,
				Class501.aClass501_5728, Class501.aClass501_5764, Class501.aClass501_6117, Class501.aClass501_5632, Class501.aClass501_6367, Class501.aClass501_5741, Class501.aClass501_5981, Class501.aClass501_5940, Class501.aClass501_6451, Class501.aClass501_5658, Class501.aClass501_6213, Class501.aClass501_6743, Class501.aClass501_5944, Class501.aClass501_6742, Class501.aClass501_6790, Class501.aClass501_5953, Class501.aClass501_6716, Class501.aClass501_6826, Class501.aClass501_6515,
				Class501.aClass501_6123, Class501.aClass501_6164, Class501.aClass501_6419, Class501.aClass501_6821, Class501.aClass501_6729, Class501.aClass501_6435, Class501.aClass501_6326, Class501.aClass501_5963, Class501.aClass501_5664, Class501.aClass501_5656, Class501.aClass501_6506, Class501.aClass501_6685, Class501.aClass501_6390, Class501.aClass501_6503, Class501.aClass501_6059, Class501.aClass501_6204, Class501.aClass501_5770, Class501.aClass501_6255, Class501.aClass501_6361,
				Class501.aClass501_5937, Class501.aClass501_5862, Class501.aClass501_5620, Class501.aClass501_6307, Class501.aClass501_6666, Class501.aClass501_5828, Class501.aClass501_6588, Class501.aClass501_6870, Class501.aClass501_6408, Class501.aClass501_5729, Class501.aClass501_6106, Class501.aClass501_6267, Class501.aClass501_6172, Class501.aClass501_6038, Class501.aClass501_6328, Class501.aClass501_6082, Class501.aClass501_6586, Class501.aClass501_5717, Class501.aClass501_5868,
				Class501.aClass501_5934, Class501.aClass501_5869, Class501.aClass501_6433, Class501.aClass501_6695, Class501.aClass501_6227, Class501.aClass501_6184, Class501.aClass501_6478, Class501.aClass501_6069, Class501.aClass501_6801, Class501.aClass501_6864, Class501.aClass501_5931, Class501.aClass501_5755, Class501.aClass501_6712, Class501.aClass501_6469, Class501.aClass501_6804, Class501.aClass501_6286, Class501.aClass501_6575, Class501.aClass501_5896, Class501.aClass501_5884,
				Class501.aClass501_6627, Class501.aClass501_6335, Class501.aClass501_5795, Class501.aClass501_5977, Class501.aClass501_6698, Class501.aClass501_6512, Class501.aClass501_6015, Class501.aClass501_6077, Class501.aClass501_5716, Class501.aClass501_6657, Class501.aClass501_6776, Class501.aClass501_6663, Class501.aClass501_6027, Class501.aClass501_6155, Class501.aClass501_6439, Class501.aClass501_5843, Class501.aClass501_6703, Class501.aClass501_6009, Class501.aClass501_6020,
				Class501.aClass501_6181, Class501.aClass501_5836, Class501.aClass501_6607, Class501.aClass501_6525, Class501.aClass501_5902, Class501.aClass501_5938, Class501.aClass501_5822, Class501.aClass501_6834, Class501.aClass501_6263, Class501.aClass501_6407, Class501.aClass501_6697, Class501.aClass501_6643, Class501.aClass501_5808, Class501.aClass501_6424, Class501.aClass501_6269, Class501.aClass501_5714, Class501.aClass501_5635, Class501.aClass501_5888, Class501.aClass501_5984,
				Class501.aClass501_6193, Class501.aClass501_5644, Class501.aClass501_6622, Class501.aClass501_6719, Class501.aClass501_6763, Class501.aClass501_6814, Class501.aClass501_6319, Class501.aClass501_6173, Class501.aClass501_6233, Class501.aClass501_6322, Class501.aClass501_5796, Class501.aClass501_5891, Class501.aClass501_6730, Class501.aClass501_6701, Class501.aClass501_6375, Class501.aClass501_6596, Class501.aClass501_6399, Class501.aClass501_5774, Class501.aClass501_5677,
				Class501.aClass501_5998, Class501.aClass501_5925, Class501.aClass501_6735, Class501.aClass501_5757, Class501.aClass501_5691, Class501.aClass501_6081, Class501.aClass501_5809, Class501.aClass501_6524, Class501.aClass501_6616, Class501.aClass501_5694, Class501.aClass501_6237, Class501.aClass501_6547, Class501.aClass501_5759, Class501.aClass501_5776, Class501.aClass501_6378, Class501.aClass501_6850, Class501.aClass501_6501, Class501.aClass501_6693, Class501.aClass501_6689,
				Class501.aClass501_6791, Class501.aClass501_6299, Class501.aClass501_6514, Class501.aClass501_6047, Class501.aClass501_5823, Class501.aClass501_6674, Class501.aClass501_6640, Class501.aClass501_6613, Class501.aClass501_6405, Class501.aClass501_6070, Class501.aClass501_6096, Class501.aClass501_6517, Class501.aClass501_5616, Class501.aClass501_6580, Class501.aClass501_6019, Class501.aClass501_6533, Class501.aClass501_5915, Class501.aClass501_5930, Class501.aClass501_6795,
				Class501.aClass501_6427, Class501.aClass501_6345, Class501.aClass501_6001, Class501.aClass501_6724, Class501.aClass501_6278, Class501.aClass501_6141, Class501.aClass501_6619, Class501.aClass501_6124, Class501.aClass501_5612, Class501.aClass501_5912, Class501.aClass501_5841, Class501.aClass501_6175, Class501.aClass501_6060, Class501.aClass501_6699, Class501.aClass501_6036, Class501.aClass501_6556, Class501.aClass501_6602, Class501.aClass501_5726, Class501.aClass501_6358,
				Class501.aClass501_6796, Class501.aClass501_5651, Class501.aClass501_6747, Class501.aClass501_6488, Class501.aClass501_6846, Class501.aClass501_5646, Class501.aClass501_6170, Class501.aClass501_6708, Class501.aClass501_6464, Class501.aClass501_5939, Class501.aClass501_6807, Class501.aClass501_5960, Class501.aClass501_6479, Class501.aClass501_6185, Class501.aClass501_6094, Class501.aClass501_5718, Class501.aClass501_5973, Class501.aClass501_6432, Class501.aClass501_6639,
				Class501.aClass501_6190, Class501.aClass501_6537, Class501.aClass501_6206, Class501.aClass501_6133, Class501.aClass501_5638, Class501.aClass501_6410, Class501.aClass501_5626, Class501.aClass501_6191, Class501.aClass501_6365, Class501.aClass501_6305, Class501.aClass501_6396, Class501.aClass501_5975, Class501.aClass501_5606, Class501.aClass501_6051, Class501.aClass501_5850, Class501.aClass501_6788, Class501.aClass501_6053, Class501.aClass501_6058, Class501.aClass501_6540,
				Class501.aClass501_6458, Class501.aClass501_6389, Class501.aClass501_5927, Class501.aClass501_6462, Class501.aClass501_5971, Class501.aClass501_6565, Class501.aClass501_5842, Class501.aClass501_5835, Class501.aClass501_6583, Class501.aClass501_6138, Class501.aClass501_6837, Class501.aClass501_6095, Class501.aClass501_5858, Class501.aClass501_6761, Class501.aClass501_5999, Class501.aClass501_6341, Class501.aClass501_5970, Class501.aClass501_6115, Class501.aClass501_6836,
				Class501.aClass501_6377, Class501.aClass501_6481, Class501.aClass501_5693, Class501.aClass501_5814, Class501.aClass501_6471, Class501.aClass501_5917, Class501.aClass501_6759, Class501.aClass501_6497, Class501.aClass501_6116, Class501.aClass501_6421, Class501.aClass501_6413, Class501.aClass501_5954, Class501.aClass501_6856, Class501.aClass501_6659, Class501.aClass501_6739, Class501.aClass501_6272, Class501.aClass501_6312, Class501.aClass501_5702, Class501.aClass501_6336,
				Class501.aClass501_6420, Class501.aClass501_5994, Class501.aClass501_6841, Class501.aClass501_5789, Class501.aClass501_5690, Class501.aClass501_5880, Class501.aClass501_6321, Class501.aClass501_5631, Class501.aClass501_6813, Class501.aClass501_5854, Class501.aClass501_6366, Class501.aClass501_5895, Class501.aClass501_5762, Class501.aClass501_5742, Class501.aClass501_6425, Class501.aClass501_6661, Class501.aClass501_6597, Class501.aClass501_5665, Class501.aClass501_6778,
				Class501.aClass501_6071, Class501.aClass501_6690, Class501.aClass501_6397, Class501.aClass501_6235, Class501.aClass501_6777, Class501.aClass501_5969, Class501.aClass501_6426, Class501.aClass501_6456, Class501.aClass501_6049, Class501.aClass501_6532, Class501.aClass501_5986, Class501.aClass501_6203, Class501.aClass501_5995, Class501.aClass501_5706, Class501.aClass501_6398, Class501.aClass501_5932, Class501.aClass501_6787, Class501.aClass501_6201, Class501.aClass501_6052,
				Class501.aClass501_6851, Class501.aClass501_6461, Class501.aClass501_6516, Class501.aClass501_6614, Class501.aClass501_6381, Class501.aClass501_6720, Class501.aClass501_5727, Class501.aClass501_6749, Class501.aClass501_6567, Class501.aClass501_6160, Class501.aClass501_5935, Class501.aClass501_5886, Class501.aClass501_5936, Class501.aClass501_5918, Class501.aClass501_5871, Class501.aClass501_5711, Class501.aClass501_5900, Class501.aClass501_6617, Class501.aClass501_6356,
				Class501.aClass501_6828, Class501.aClass501_5908, Class501.aClass501_6392, Class501.aClass501_5785, Class501.aClass501_6855, Class501.aClass501_6412, Class501.aClass501_6275, Class501.aClass501_6218, Class501.aClass501_6638, Class501.aClass501_6869, Class501.aClass501_5666, Class501.aClass501_6266, Class501.aClass501_6500, Class501.aClass501_5735, Class501.aClass501_5692, Class501.aClass501_5951, Class501.aClass501_6526, Class501.aClass501_6508, Class501.aClass501_6148,
				Class501.aClass501_5653, Class501.aClass501_6152, Class501.aClass501_6541, Class501.aClass501_6539, Class501.aClass501_5803, Class501.aClass501_6313, Class501.aClass501_6076, Class501.aClass501_5787, Class501.aClass501_6153, Class501.aClass501_6781, Class501.aClass501_5779, Class501.aClass501_6300, Class501.aClass501_6013, Class501.aClass501_6127, Class501.aClass501_6291, Class501.aClass501_5733, Class501.aClass501_6331, Class501.aClass501_6679, Class501.aClass501_5688,
				Class501.aClass501_6220, Class501.aClass501_5724, Class501.aClass501_6363, Class501.aClass501_6727, Class501.aClass501_6771, Class501.aClass501_6637, Class501.aClass501_5676, Class501.aClass501_6404, Class501.aClass501_5830, Class501.aClass501_6393, Class501.aClass501_6842, Class501.aClass501_6383, Class501.aClass501_6251, Class501.aClass501_5885, Class501.aClass501_5941, Class501.aClass501_6294, Class501.aClass501_6273, Class501.aClass501_6460, Class501.aClass501_6498,
				Class501.aClass501_5849, Class501.aClass501_6139, Class501.aClass501_5780, Class501.aClass501_6744, Class501.aClass501_6308, Class501.aClass501_5875, Class501.aClass501_6584, Class501.aClass501_6240, Class501.aClass501_6721, Class501.aClass501_6711, Class501.aClass501_5640, Class501.aClass501_6752, Class501.aClass501_6129, Class501.aClass501_6615, Class501.aClass501_5989, Class501.aClass501_6641, Class501.aClass501_5889, Class501.aClass501_6656, Class501.aClass501_5661,
				Class501.aClass501_5778, Class501.aClass501_6861, Class501.aClass501_6632, Class501.aClass501_6822, Class501.aClass501_6171, Class501.aClass501_6746, Class501.aClass501_6231, Class501.aClass501_5897, Class501.aClass501_5988, Class501.aClass501_6671, Class501.aClass501_6045, Class501.aClass501_6631, Class501.aClass501_6042, Class501.aClass501_5719, Class501.aClass501_6050, Class501.aClass501_5642, Class501.aClass501_5750, Class501.aClass501_6242, Class501.aClass501_5799,
				Class501.aClass501_6470, Class501.aClass501_6194, Class501.aClass501_6282, Class501.aClass501_5712, Class501.aClass501_5671, Class501.aClass501_6453, Class501.aClass501_6423, Class501.aClass501_6033, Class501.aClass501_6086, Class501.aClass501_6653, Class501.aClass501_6706, Class501.aClass501_6466, Class501.aClass501_5736, Class501.aClass501_6143, Class501.aClass501_5905, Class501.aClass501_5838, Class501.aClass501_6551, Class501.aClass501_5815, Class501.aClass501_6062,
				Class501.aClass501_6443, Class501.aClass501_6342, Class501.aClass501_5866, Class501.aClass501_6247, Class501.aClass501_6274, Class501.aClass501_6297, Class501.aClass501_6750, Class501.aClass501_6093, Class501.aClass501_6329, Class501.aClass501_5893, Class501.aClass501_5919, Class501.aClass501_6063, Class501.aClass501_5751, Class501.aClass501_6587, Class501.aClass501_5834, Class501.aClass501_6707, Class501.aClass501_6279, Class501.aClass501_6418, Class501.aClass501_6499,
				Class501.aClass501_6491, Class501.aClass501_5901, Class501.aClass501_6088, Class501.aClass501_6866, Class501.aClass501_6775, Class501.aClass501_6373, Class501.aClass501_6234, Class501.aClass501_5819, Class501.aClass501_6455, Class501.aClass501_6518, Class501.aClass501_6257, Class501.aClass501_6812, Class501.aClass501_6678, Class501.aClass501_6352, Class501.aClass501_6431, Class501.aClass501_5946, Class501.aClass501_5662, Class501.aClass501_6675, Class501.aClass501_6490,
				Class501.aClass501_6473, Class501.aClass501_6309, Class501.aClass501_5768, Class501.aClass501_5909, Class501.aClass501_5675, Class501.aClass501_6504, Class501.aClass501_5907, Class501.aClass501_6636, Class501.aClass501_6276, Class501.aClass501_5881, Class501.aClass501_6676, Class501.aClass501_5628, Class501.aClass501_5652, Class501.aClass501_6121, Class501.aClass501_5723, Class501.aClass501_6755, Class501.aClass501_6780, Class501.aClass501_6161, Class501.aClass501_5845,
				Class501.aClass501_6558, Class501.aClass501_6489, Class501.aClass501_6416, Class501.aClass501_5625, Class501.aClass501_6865, Class501.aClass501_6665, Class501.aClass501_5914, Class501.aClass501_6340, Class501.aClass501_5892, Class501.aClass501_6728, Class501.aClass501_6347, Class501.aClass501_6783, Class501.aClass501_6029, Class501.aClass501_6733, Class501.aClass501_6217, Class501.aClass501_5807, Class501.aClass501_6281, Class501.aClass501_6401, Class501.aClass501_5730,
				Class501.aClass501_6003, Class501.aClass501_6362, Class501.aClass501_6346, Class501.aClass501_6634, Class501.aClass501_5955, Class501.aClass501_6845, Class501.aClass501_6434, Class501.aClass501_6715, Class501.aClass501_5853, Class501.aClass501_6664, Class501.aClass501_6016, Class501.aClass501_6061, Class501.aClass501_6137, Class501.aClass501_6241, Class501.aClass501_6591, Class501.aClass501_5804, Class501.aClass501_5721, Class501.aClass501_5607, Class501.aClass501_6174,
				Class501.aClass501_6618, Class501.aClass501_6806, Class501.aClass501_6553, Class501.aClass501_5713, Class501.aClass501_6543, Class501.aClass501_5855, Class501.aClass501_6529, Class501.aClass501_5987, Class501.aClass501_6301, Class501.aClass501_6692, Class501.aClass501_6817, Class501.aClass501_6330, Class501.aClass501_6113, Class501.aClass501_5790, Class501.aClass501_6135, Class501.aClass501_6624, Class501.aClass501_6523, Class501.aClass501_6803, Class501.aClass501_6289,
				Class501.aClass501_5786, Class501.aClass501_6211, Class501.aClass501_6839, Class501.aClass501_6023, Class501.aClass501_5685, Class501.aClass501_6089, Class501.aClass501_6369, Class501.aClass501_6859, Class501.aClass501_5722, Class501.aClass501_5816, Class501.aClass501_5689, Class501.aClass501_5740, Class501.aClass501_6288, Class501.aClass501_6764, Class501.aClass501_6105, Class501.aClass501_6156, Class501.aClass501_5865, Class501.aClass501_6868, Class501.aClass501_6598,
				Class501.aClass501_6677, Class501.aClass501_6150, Class501.aClass501_6642, Class501.aClass501_6582, Class501.aClass501_5848, Class501.aClass501_5911, Class501.aClass501_6200, Class501.aClass501_5769, Class501.aClass501_6040, Class501.aClass501_5839, Class501.aClass501_5805, Class501.aClass501_6593, Class501.aClass501_6010, Class501.aClass501_6576, Class501.aClass501_6339, Class501.aClass501_5697, Class501.aClass501_6811, Class501.aClass501_5698, Class501.aClass501_5709,
				Class501.aClass501_6224, Class501.aClass501_6002, Class501.aClass501_6228, Class501.aClass501_6536, Class501.aClass501_5817, Class501.aClass501_6039, Class501.aClass501_5760, Class501.aClass501_5974, Class501.aClass501_5979, Class501.aClass501_6147, Class501.aClass501_6649, Class501.aClass501_6303, Class501.aClass501_6669, Class501.aClass501_6090, Class501.aClass501_6810, Class501.aClass501_6446, Class501.aClass501_6151, Class501.aClass501_5738, Class501.aClass501_5847,
				Class501.aClass501_6338, Class501.aClass501_6722, Class501.aClass501_6149, Class501.aClass501_6784, Class501.aClass501_5743, Class501.aClass501_6364, Class501.aClass501_6768, Class501.aClass501_6163, Class501.aClass501_6311, Class501.aClass501_6557, Class501.aClass501_6633, Class501.aClass501_6848, Class501.aClass501_6549, Class501.aClass501_6792, Class501.aClass501_5996, Class501.aClass501_6853, Class501.aClass501_6012, Class501.aClass501_6304, Class501.aClass501_5604,
				Class501.aClass501_6670, Class501.aClass501_5703, Class501.aClass501_6195, Class501.aClass501_6246, Class501.aClass501_5983, Class501.aClass501_6102, Class501.aClass501_6119, Class501.aClass501_5601, Class501.aClass501_6216, Class501.aClass501_5933, Class501.aClass501_6650, Class501.aClass501_6736, Class501.aClass501_5737, Class501.aClass501_6223, Class501.aClass501_5943, Class501.aClass501_6074, Class501.aClass501_6044, Class501.aClass501_6863, Class501.aClass501_6785,
				Class501.aClass501_6477, Class501.aClass501_6594, Class501.aClass501_6180, Class501.aClass501_5873, Class501.aClass501_6818, Class501.aClass501_6406, Class501.aClass501_6098, Class501.aClass501_5837, Class501.aClass501_6852, Class501.aClass501_6769, Class501.aClass501_6395, Class501.aClass501_5657, Class501.aClass501_6317, Class501.aClass501_6314, Class501.aClass501_5708, Class501.aClass501_5812, Class501.aClass501_6754, Class501.aClass501_6603, Class501.aClass501_5811,
				Class501.aClass501_5899, Class501.aClass501_5761, Class501.aClass501_5997, Class501.aClass501_6573, Class501.aClass501_5949, Class501.aClass501_6065, Class501.aClass501_5645, Class501.aClass501_6829, Class501.aClass501_6238, Class501.aClass501_6100, Class501.aClass501_6111, Class501.aClass501_6031, Class501.aClass501_6608, Class501.aClass501_6349, Class501.aClass501_5791, Class501.aClass501_6268, Class501.aClass501_6765, Class501.aClass501_6827, Class501.aClass501_6611,
				Class501.aClass501_6198, Class501.aClass501_6131, Class501.aClass501_6494, Class501.aClass501_6382, Class501.aClass501_6422, Class501.aClass501_6384, Class501.aClass501_6348, Class501.aClass501_6566, Class501.aClass501_6026, Class501.aClass501_5916, Class501.aClass501_6535, Class501.aClass501_6344, Class501.aClass501_5775, Class501.aClass501_6741, Class501.aClass501_6207, Class501.aClass501_6767, Class501.aClass501_5609, Class501.aClass501_6444, Class501.aClass501_5749,
				Class501.aClass501_6601, Class501.aClass501_6482, Class501.aClass501_6028, Class501.aClass501_5641, Class501.aClass501_6550, Class501.aClass501_6629, Class501.aClass501_6258, Class501.aClass501_6067, Class501.aClass501_6620, Class501.aClass501_6101, Class501.aClass501_6838, Class501.aClass501_5956, Class501.aClass501_5829, Class501.aClass501_5732, Class501.aClass501_6513, Class501.aClass501_6487, Class501.aClass501_6542, Class501.aClass501_6215, Class501.aClass501_6507,
				Class501.aClass501_6459, Class501.aClass501_5870, Class501.aClass501_5831, Class501.aClass501_6244, Class501.aClass501_5903, Class501.aClass501_6808, Class501.aClass501_6867, Class501.aClass501_6024, Class501.aClass501_6350, Class501.aClass501_5968, Class501.aClass501_5833, Class501.aClass501_6687, Class501.aClass501_6758, Class501.aClass501_6797, Class501.aClass501_5766, Class501.aClass501_6732, Class501.aClass501_6084, Class501.aClass501_6264 });
	}

	public static final int method4781(byte i) {
		return (int) (1000000000L / (7688926709995876547L * Class515.aLong7015));
	}

	static final void method4782(Class665 class665, short i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class510.aByte6978;
	}

	static final void method4783(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = 0;
	}

	static final void method4784(Class665 class665, int i) {
		Class394.method6501(-1468354309);
		Class467.method7667(-791920877);
		client.aClass509_11072.method8361(-428559959);
		Class631.method10465(1393498695);
		client.aBool11020 = false;
	}

	static void method4785(Class527_Sub8_Sub7 class527_sub8_sub7, int i) {
		if (null != class527_sub8_sub7) {
			Class35.aClass694_348.method14147(class527_sub8_sub7, -540681849);
			Class35.anInt346 += 376954471;
			Object object = null;
			Class527_Sub8_Sub4 class527_sub8_sub4;
			if (!class527_sub8_sub7.aBool11651 && !"".equals(class527_sub8_sub7.aString11650)) {
				long l = -721900060440722165L * class527_sub8_sub7.aLong11649;
				for (class527_sub8_sub4 = ((Class527_Sub8_Sub4) Class35.aClass14_349.method709(l)); (class527_sub8_sub4 != null && !class527_sub8_sub4.aString11623.equals(class527_sub8_sub7.aString11650)); class527_sub8_sub4 = ((Class527_Sub8_Sub4) Class35.aClass14_349.method715(537239704))) {
					/* empty */
				}
				if (class527_sub8_sub4 == null) {
					class527_sub8_sub4 = ((Class527_Sub8_Sub4) Class35.aClass205_353.method3787(l));
					if (null != class527_sub8_sub4 && !class527_sub8_sub4.aString11623.equals(class527_sub8_sub7.aString11650))
						class527_sub8_sub4 = null;
					if (class527_sub8_sub4 == null)
						class527_sub8_sub4 = new Class527_Sub8_Sub4(class527_sub8_sub7.aString11650);
					Class35.aClass14_349.method714(class527_sub8_sub4, l);
					Class35.anInt347 += -993956405;
				}
			} else {
				class527_sub8_sub4 = new Class527_Sub8_Sub4(class527_sub8_sub7.aString11650);
				Class35.anInt347 += -993956405;
			}
			if (class527_sub8_sub4.method18173(class527_sub8_sub7, 1349449412))
				Class45.method1218(class527_sub8_sub4, 1254981347);
		}
	}

	public static int method4786(int i, int i_72_, int i_73_, boolean bool, byte i_74_) {
		if (i != 0 && (i < 50 || i > 100))
			i = 0;
		if (i_72_ != 0 && (i_72_ < 50 || i_72_ > 100))
			i_72_ = 0;
		boolean bool_75_ = Class498.aString5584.startsWith("mac");
		int[] is = (Class585.aTwitchTV7698.GetRecommendedSettings(-1803844265 * Class289.anInt3223, -471480167 * Class611.anInt8009, i, 2000, i_73_, Class585.aFloat7697, bool_75_));
		if (is[0] != 0)
			return is[0];
		int i_76_ = is[1];
		int i_77_ = is[2];
		int i_78_ = is[3];
		int i_79_ = i_78_;
		Class585.aLong7699 = 0L;
		Class512.aLong7008 = (long) (1000.0F / (float) i_73_) * 1015595126069699405L;
		Class700_Sub20.anInt10872 = 170033737 * i_76_;
		Class174_Sub1.anInt9112 = i_77_ * 1543903139;
		if (0 != i_72_)
			i_78_ = i_72_ * i_78_ / 100;
		Class493.method7997(new StringBuilder().append("Stream - Input: ").append(-1803844265 * Class289.anInt3223).append("x").append(-471480167 * Class611.anInt8009).append(" (").append(i_79_).append("kbps)").append(" => ").append("Output: ").append(i_76_).append("x").append(i_77_).append(" [").append(i == 0 ? "auto" : new StringBuilder().append(i).append("%").toString()).append("] (").append(i_78_).append("kbps [")
				.append(i_72_ == 0 ? "auto" : new StringBuilder().append(i_72_).append("%").toString()).append("])").toString(), (byte) 8);
		return Class585.aTwitchTV7698.StartStreaming(i_76_, i_77_, i_73_, i_78_, 0 != i_72_, Class585.aFloat7697, (-1855177309 * Class585.anInt7680), bool);
	}

	public static int method4787(int i, int i_80_) {
		Class271 class271 = (Class271) Class264.aMap2869.get(Integer.valueOf(i));
		if (class271 == null)
			return 0;
		return class271.method5068(-1626721052);
	}
}
