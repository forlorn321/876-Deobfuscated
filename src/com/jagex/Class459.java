/* Class459 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;

public final class Class459 {
	Class457 aClass457_5071;
	Object[][] anObjectArrayArray5072;
	static boolean aBool5073;
	static Class77 aClass77_5074 = new Class77();
	boolean aBool5075;
	static final int anInt5076 = 0;
	public static final int anInt5077 = 1;
	static final int anInt5078 = 2;
	int anInt5079;
	Class469 aClass469_5080 = null;
	Object[] anObjectArray5081;
	static int anInt5082;

	public byte[] method7470(int i, int i_0_, byte i_1_) {
		return method7553(i, i_0_, null, -145937944);
	}

	synchronized boolean method7471(int i) {
		if (null == aClass469_5080) {
			aClass469_5080 = aClass457_5071.method7440((byte) 82);
			if (null == aClass469_5080)
				return false;
			anObjectArray5081 = new Object[aClass469_5080.anInt5340 * 309096757];
			anObjectArrayArray5072 = new Object[309096757 * aClass469_5080.anInt5340][];
		}
		return true;
	}

	public int method7472(int i) {
		if (!method7471(88695064))
			throw new IllegalStateException("");
		return 620090825 * aClass469_5080.anInt5341;
	}

	synchronized boolean method7473(int i, int i_2_) {
		if (!method7471(-908228758))
			return false;
		if (i < 0 || i >= aClass469_5080.anIntArray5351.length || aClass469_5080.anIntArray5351[i] == 0) {
			if (aBool5073)
				throw new IllegalArgumentException(Integer.toString(i));
			return false;
		}
		return true;
	}

	public synchronized boolean method7474(int i, int i_3_, int i_4_) {
		if (!method7471(1857517740))
			return false;
		if (i < 0 || i_3_ < 0 || i >= aClass469_5080.anIntArray5351.length || i_3_ >= aClass469_5080.anIntArray5351[i]) {
			if (aBool5073)
				throw new IllegalArgumentException(new StringBuilder().append(i).append(" ").append(i_3_).toString());
			return false;
		}
		return true;
	}

	synchronized void method7475(int i, int i_5_) {
		if (aBool5075)
			anObjectArray5081[i] = aClass457_5071.method7431(i, (byte) 41);
		else
			anObjectArray5081[i] = Class166.method2668(aClass457_5071.method7431(i, (byte) 44), false, (short) -26009);
	}

	public void method7476(int i) {
		aClass457_5071.method7430(i, 2088513267);
	}

	public synchronized int method7477() {
		if (!method7471(-1494311097))
			return 0;
		int i = 0;
		int i_6_ = 0;
		for (int i_7_ = 0; i_7_ < anObjectArray5081.length; i_7_++) {
			if (aClass469_5080.anIntArray5335[i_7_] > 0) {
				i += 100;
				i_6_ += method7483(i_7_, -1969684444);
			}
		}
		if (0 == i)
			return 100;
		int i_8_ = i_6_ * 100 / i;
		return i_8_;
	}

	public synchronized void method7478(int i) {
		if (method7473(i, -1105701807)) {
			if (anObjectArrayArray5072 != null)
				anObjectArrayArray5072[i] = null;
		}
	}

	public synchronized boolean method7479(int i, int i_9_, int i_10_) {
		if (!method7474(i, i_9_, -381414582))
			return false;
		if (null != anObjectArrayArray5072[i] && null != anObjectArrayArray5072[i][i_9_])
			return true;
		if (null != anObjectArray5081[i])
			return true;
		method7475(i, -1155203928);
		if (anObjectArray5081[i] != null)
			return true;
		return false;
	}

	public synchronized boolean method7480(int i, int i_11_) {
		if (!method7471(-1645641885))
			return false;
		if (aClass469_5080.anIntArray5351.length == 1)
			return method7479(0, i, 102380841);
		if (!method7473(i, -1105701807))
			return false;
		if (1 == aClass469_5080.anIntArray5351[i])
			return method7479(i, 0, 102380841);
		throw new RuntimeException();
	}

	public boolean method7481(String string) {
		int i = method7540("", -1193884611);
		if (i != -1)
			return method7498("", string, 1725747414);
		return method7498(string, "", -1302862513);
	}

	public synchronized boolean method7482(int i) {
		if (!method7471(-1026674579))
			return false;
		boolean bool = true;
		for (int i_12_ = 0; i_12_ < aClass469_5080.anIntArray5337.length; i_12_++) {
			int i_13_ = aClass469_5080.anIntArray5337[i_12_];
			if (anObjectArray5081[i_13_] == null) {
				method7475(i_13_, -927545489);
				if (anObjectArray5081[i_13_] == null)
					bool = false;
			}
		}
		return bool;
	}

	public synchronized int method7483(int i, int i_14_) {
		if (!method7473(i, -1105701807))
			return 0;
		if (anObjectArray5081[i] != null)
			return 100;
		return aClass457_5071.method7433(i, (byte) -98);
	}

	public synchronized int method7484(int i) {
		if (!method7471(2073811127))
			return 0;
		int i_15_ = 0;
		int i_16_ = 0;
		for (int i_17_ = 0; i_17_ < anObjectArray5081.length; i_17_++) {
			if (aClass469_5080.anIntArray5335[i_17_] > 0) {
				i_15_ += 100;
				i_16_ += method7483(i_17_, -191086391);
			}
		}
		if (0 == i_15_)
			return 100;
		int i_18_ = i_16_ * 100 / i_15_;
		return i_18_;
	}

	public boolean method7485(String string, int i) {
		if (!method7471(-1598282069))
			return false;
		string = string.toLowerCase();
		int i_19_ = (aClass469_5080.aClass281_5332.method5181(Class474.method7754(string, (byte) -21), (byte) 31));
		return method7552(i_19_, (byte) 50);
	}

	public synchronized int[] method7486(int i, int i_20_) {
		if (!method7473(i, -1105701807))
			return null;
		int[] is = aClass469_5080.anIntArrayArray5348[i];
		if (is == null) {
			is = new int[aClass469_5080.anIntArray5335[i]];
			for (int i_21_ = 0; i_21_ < is.length; i_21_++)
				is[i_21_] = i_21_;
		}
		return is;
	}

	public void method7487(int i, int i_22_) {
		aClass457_5071.method7430(i, 2000300517);
	}

	public boolean method7488(String string) {
		if (!method7471(-613021235))
			return false;
		string = string.toLowerCase();
		int i = (aClass469_5080.aClass281_5332.method5181(Class474.method7754(string, (byte) 50), (byte) -37));
		if (i < 0)
			return false;
		return true;
	}

	synchronized boolean method7489() {
		if (null == aClass469_5080) {
			aClass469_5080 = aClass457_5071.method7440((byte) 12);
			if (null == aClass469_5080)
				return false;
			anObjectArray5081 = new Object[aClass469_5080.anInt5340 * 309096757];
			anObjectArrayArray5072 = new Object[309096757 * aClass469_5080.anInt5340][];
		}
		return true;
	}

	public synchronized void method7490(int i, short i_23_) {
		if (method7473(i, -1105701807)) {
			if (anObjectArrayArray5072 != null)
				anObjectArrayArray5072[i] = null;
		}
	}

	public void method7491(boolean bool, boolean bool_24_, int i) {
		if (method7471(-1149578630)) {
			if (bool) {
				aClass469_5080.anIntArray5338 = null;
				aClass469_5080.aClass281_5332 = null;
			}
			if (bool_24_) {
				aClass469_5080.anIntArrayArray5346 = null;
				aClass469_5080.aClass281Array5350 = null;
			}
		}
	}

	synchronized boolean method7492(int i, int i_25_, int[] is, int i_26_) {
		if (!method7473(i, -1105701807))
			return false;
		if (null == anObjectArray5081[i])
			return false;
		int i_27_ = aClass469_5080.anIntArray5335[i];
		int[] is_28_ = aClass469_5080.anIntArrayArray5348[i];
		if (anObjectArrayArray5072[i] == null)
			anObjectArrayArray5072[i] = new Object[aClass469_5080.anIntArray5351[i]];
		Object[] objects = anObjectArrayArray5072[i];
		boolean bool = true;
		for (int i_29_ = 0; i_29_ < i_27_; i_29_++) {
			int i_30_;
			if (null == is_28_)
				i_30_ = i_29_;
			else
				i_30_ = is_28_[i_29_];
			if (objects[i_30_] == null) {
				bool = false;
				break;
			}
		}
		if (bool)
			return true;
		byte[] is_31_;
		if (is != null && (is[0] != 0 || is[1] != 0 || 0 != is[2] || 0 != is[3])) {
			is_31_ = Class537.method8985(anObjectArray5081[i], true, -129509095);
			RSByteBuffer class527_sub38 = new RSByteBuffer(is_31_);
			int i_32_ = class527_sub38.readUnsignedByte();
			int i_33_ = class527_sub38.readInt();
			int i_34_ = ((i_32_ == Class472.aClass472_5368.method87() ? 5 : 9) + i_33_);
			class527_sub38.method16488(is, 5, i_34_, -419584962);
		} else
			is_31_ = Class537.method8985(anObjectArray5081[i], false, -570907457);
		byte[] is_35_;
		try {
			is_35_ = Class305.method5591(is_31_, -209595777);
		} catch (RuntimeException runtimeexception) {
			throw Class664.method11052(runtimeexception, new StringBuilder().append(null != is).append(" ").append(i).append(" ").append(is_31_.length).append(" ").append(Class704.method14311(is_31_, is_31_.length, -373504254)).append(" ").append(Class704.method14311(is_31_, is_31_.length - 2, -373504254)).append(" ").append(aClass469_5080.anIntArray5347[i]).append(" ").append(aClass469_5080.anInt5341 * 620090825).toString());
		}
		if (aBool5075)
			anObjectArray5081[i] = null;
		if (i_27_ > 1) {
			if (-1049989765 * anInt5079 != 2) {
				int i_36_ = is_35_.length;
				int i_37_ = is_35_[--i_36_] & 0xff;
				i_36_ -= i_37_ * i_27_ * 4;
				RSByteBuffer class527_sub38 = new RSByteBuffer(is_35_);
				int[] is_38_ = new int[i_27_];
				class527_sub38.anInt10689 = i_36_ * 1474750881;
				for (int i_39_ = 0; i_39_ < i_37_; i_39_++) {
					int i_40_ = 0;
					for (int i_41_ = 0; i_41_ < i_27_; i_41_++) {
						i_40_ += class527_sub38.readInt();
						is_38_[i_41_] += i_40_;
					}
				}
				byte[][] is_42_ = new byte[i_27_][];
				for (int i_43_ = 0; i_43_ < i_27_; i_43_++) {
					is_42_[i_43_] = new byte[is_38_[i_43_]];
					is_38_[i_43_] = 0;
				}
				class527_sub38.anInt10689 = 1474750881 * i_36_;
				int i_44_ = 0;
				for (int i_45_ = 0; i_45_ < i_37_; i_45_++) {
					int i_46_ = 0;
					for (int i_47_ = 0; i_47_ < i_27_; i_47_++) {
						i_46_ += class527_sub38.readInt();
						System.arraycopy(is_35_, i_44_, is_42_[i_47_], is_38_[i_47_], i_46_);
						is_38_[i_47_] += i_46_;
						i_44_ += i_46_;
					}
				}
				for (int i_48_ = 0; i_48_ < i_27_; i_48_++) {
					int i_49_;
					if (null == is_28_)
						i_49_ = i_48_;
					else
						i_49_ = is_28_[i_48_];
					if (0 == -1049989765 * anInt5079)
						objects[i_49_] = Class166.method2668(is_42_[i_48_], false, (short) 4878);
					else
						objects[i_49_] = is_42_[i_48_];
				}
			} else {
				int i_50_ = is_35_.length;
				int i_51_ = is_35_[--i_50_] & 0xff;
				i_50_ -= i_51_ * i_27_ * 4;
				RSByteBuffer class527_sub38 = new RSByteBuffer(is_35_);
				int i_52_ = 0;
				int i_53_ = 0;
				class527_sub38.anInt10689 = i_50_ * 1474750881;
				for (int i_54_ = 0; i_54_ < i_51_; i_54_++) {
					int i_55_ = 0;
					for (int i_56_ = 0; i_56_ < i_27_; i_56_++) {
						i_55_ += class527_sub38.readInt();
						int i_57_;
						if (null == is_28_)
							i_57_ = i_56_;
						else
							i_57_ = is_28_[i_56_];
						if (i_25_ == i_57_) {
							i_52_ += i_55_;
							i_53_ = i_57_;
						}
					}
				}
				if (0 == i_52_)
					return true;
				byte[] is_58_ = new byte[i_52_];
				i_52_ = 0;
				class527_sub38.anInt10689 = i_50_ * 1474750881;
				int i_59_ = 0;
				for (int i_60_ = 0; i_60_ < i_51_; i_60_++) {
					int i_61_ = 0;
					for (int i_62_ = 0; i_62_ < i_27_; i_62_++) {
						i_61_ += class527_sub38.readInt();
						int i_63_;
						if (null == is_28_)
							i_63_ = i_62_;
						else
							i_63_ = is_28_[i_62_];
						if (i_63_ == i_25_) {
							System.arraycopy(is_35_, i_59_, is_58_, i_52_, i_61_);
							i_52_ += i_61_;
						}
						i_59_ += i_61_;
					}
				}
				objects[i_53_] = is_58_;
			}
		} else {
			int i_64_;
			if (null == is_28_)
				i_64_ = 0;
			else
				i_64_ = is_28_[0];
			if (-1049989765 * anInt5079 == 0)
				objects[i_64_] = Class166.method2668(is_35_, false, (short) 10507);
			else
				objects[i_64_] = is_35_;
		}
		return true;
	}

	public boolean method7493(String string) {
		if (!method7471(2005875707))
			return false;
		string = string.toLowerCase();
		int i = (aClass469_5080.aClass281_5332.method5181(Class474.method7754(string, (byte) -25), (byte) 44));
		return method7552(i, (byte) 55);
	}

	public int method7494(int i, int i_65_) {
		if (!method7471(-530766528))
			return -1;
		int i_66_ = aClass469_5080.aClass281_5332.method5181(i, (byte) -15);
		if (!method7473(i_66_, -1105701807))
			return -1;
		return i_66_;
	}

	public boolean method7495(String string, int i) {
		if (!method7471(1542949851))
			return false;
		string = string.toLowerCase();
		int i_67_ = (aClass469_5080.aClass281_5332.method5181(Class474.method7754(string, (byte) -85), (byte) 51));
		if (i_67_ < 0)
			return false;
		return true;
	}

	public boolean method7496(String string, String string_68_, int i) {
		if (!method7471(225912235))
			return false;
		string = string.toLowerCase();
		string_68_ = string_68_.toLowerCase();
		int i_69_ = (aClass469_5080.aClass281_5332.method5181(Class474.method7754(string, (byte) -99), (byte) -7));
		if (i_69_ < 0)
			return false;
		int i_70_ = (aClass469_5080.aClass281Array5350[i_69_].method5181(Class474.method7754(string_68_, (byte) 12), (byte) 10));
		if (i_70_ < 0)
			return false;
		return true;
	}

	public synchronized byte[] method7497(String string, String string_71_, byte i) {
		if (!method7471(-179471393))
			return null;
		string = string.toLowerCase();
		string_71_ = string_71_.toLowerCase();
		int i_72_ = (aClass469_5080.aClass281_5332.method5181(Class474.method7754(string, (byte) -23), (byte) -62));
		if (!method7473(i_72_, -1105701807))
			return null;
		int i_73_ = (aClass469_5080.aClass281Array5350[i_72_].method5181(Class474.method7754(string_71_, (byte) -79), (byte) 0));
		return method7470(i_72_, i_73_, (byte) -23);
	}

	boolean method7498(String string, String string_74_, int i) {
		if (!method7471(-83722344))
			return false;
		string = string.toLowerCase();
		string_74_ = string_74_.toLowerCase();
		int i_75_ = (aClass469_5080.aClass281_5332.method5181(Class474.method7754(string, (byte) -41), (byte) -33));
		if (!method7473(i_75_, -1105701807))
			return false;
		int i_76_ = (aClass469_5080.aClass281Array5350[i_75_].method5181(Class474.method7754(string_74_, (byte) -48), (byte) -5));
		return method7479(i_75_, i_76_, 102380841);
	}

	public boolean method7499(String string, int i) {
		int i_77_ = method7540("", -1193884611);
		if (i_77_ != -1)
			return method7498("", string, 1153365518);
		return method7498(string, "", 1513359337);
	}

	public synchronized boolean method7500() {
		if (!method7471(-1703079054))
			return false;
		boolean bool = true;
		for (int i = 0; i < aClass469_5080.anIntArray5337.length; i++) {
			int i_78_ = aClass469_5080.anIntArray5337[i];
			if (anObjectArray5081[i_78_] == null) {
				method7475(i_78_, 1610560432);
				if (anObjectArray5081[i_78_] == null)
					bool = false;
			}
		}
		return bool;
	}

	public int method7501(String string, int i) {
		if (!method7471(338508686))
			return 0;
		string = string.toLowerCase();
		int i_79_ = (aClass469_5080.aClass281_5332.method5181(Class474.method7754(string, (byte) 24), (byte) 76));
		return method7483(i_79_, -340843619);
	}

	public boolean method7502(int i, int i_80_) {
		if (!method7471(1864011214))
			return false;
		if (1 == aClass469_5080.anIntArray5351.length)
			return method7474(0, i, -2006629252);
		if (!method7473(i, -1105701807))
			return false;
		if (1 == aClass469_5080.anIntArray5351[i])
			return method7474(i, 0, 697237320);
		throw new RuntimeException();
	}

	synchronized boolean method7503() {
		if (null == aClass469_5080) {
			aClass469_5080 = aClass457_5071.method7440((byte) 30);
			if (null == aClass469_5080)
				return false;
			anObjectArray5081 = new Object[aClass469_5080.anInt5340 * 309096757];
			anObjectArrayArray5072 = new Object[309096757 * aClass469_5080.anInt5340][];
		}
		return true;
	}

	public int method7504(int i, int i_81_) {
		if (!method7473(i, -1105701807))
			return 0;
		return aClass469_5080.anIntArray5351[i];
	}

	synchronized boolean method7505() {
		if (null == aClass469_5080) {
			aClass469_5080 = aClass457_5071.method7440((byte) 10);
			if (null == aClass469_5080)
				return false;
			anObjectArray5081 = new Object[aClass469_5080.anInt5340 * 309096757];
			anObjectArrayArray5072 = new Object[309096757 * aClass469_5080.anInt5340][];
		}
		return true;
	}

	public int method7506() {
		if (!method7471(1515730343))
			throw new IllegalStateException("");
		return 620090825 * aClass469_5080.anInt5341;
	}

	synchronized boolean method7507(int i) {
		if (!method7471(-199441403))
			return false;
		if (i < 0 || i >= aClass469_5080.anIntArray5351.length || aClass469_5080.anIntArray5351[i] == 0) {
			if (aBool5073)
				throw new IllegalArgumentException(Integer.toString(i));
			return false;
		}
		return true;
	}

	public synchronized boolean method7508(int i, int i_82_) {
		if (!method7471(1952518579))
			return false;
		if (i < 0 || i_82_ < 0 || i >= aClass469_5080.anIntArray5351.length || i_82_ >= aClass469_5080.anIntArray5351[i]) {
			if (aBool5073)
				throw new IllegalArgumentException(new StringBuilder().append(i).append(" ").append(i_82_).toString());
			return false;
		}
		return true;
	}

	public int method7509(String string) {
		if (!method7471(1904696468))
			return -1;
		string = string.toLowerCase();
		int i = (aClass469_5080.aClass281_5332.method5181(Class474.method7754(string, (byte) 12), (byte) 19));
		if (!method7473(i, -1105701807))
			return -1;
		return i;
	}

	public synchronized boolean method7510(int i, int i_83_) {
		if (!method7471(-612876801))
			return false;
		if (i < 0 || i_83_ < 0 || i >= aClass469_5080.anIntArray5351.length || i_83_ >= aClass469_5080.anIntArray5351[i]) {
			if (aBool5073)
				throw new IllegalArgumentException(new StringBuilder().append(i).append(" ").append(i_83_).toString());
			return false;
		}
		return true;
	}

	public int method7511(int i) {
		if (!method7473(i, -1105701807))
			return 0;
		return aClass469_5080.anIntArray5351[i];
	}

	public synchronized byte[] method7512(int i, int i_84_) {
		if (!method7471(1154887651))
			return null;
		if (aClass469_5080.anIntArray5351.length == 1)
			return method7470(0, i, (byte) -56);
		if (!method7473(i, -1105701807))
			return null;
		if (aClass469_5080.anIntArray5351[i] == 1)
			return method7470(i, 0, (byte) -50);
		throw new RuntimeException();
	}

	synchronized void method7513(int i) {
		if (aBool5075)
			anObjectArray5081[i] = aClass457_5071.method7431(i, (byte) 123);
		else
			anObjectArray5081[i] = Class166.method2668(aClass457_5071.method7431(i, (byte) 8), false, (short) 10622);
	}

	static {
		aBool5073 = false;
		anInt5082 = 0;
	}

	public synchronized boolean method7514(int i) {
		if (!method7471(1955684612))
			return false;
		if (aClass469_5080.anIntArray5351.length == 1)
			return method7479(0, i, 102380841);
		if (!method7473(i, -1105701807))
			return false;
		if (1 == aClass469_5080.anIntArray5351[i])
			return method7479(i, 0, 102380841);
		throw new RuntimeException();
	}

	public boolean method7515(String string) {
		if (!method7471(-993017975))
			return false;
		string = string.toLowerCase();
		int i = (aClass469_5080.aClass281_5332.method5181(Class474.method7754(string, (byte) 84), (byte) 28));
		if (i < 0)
			return false;
		return true;
	}

	public byte[] method7516(int i, int i_85_) {
		return method7553(i, i_85_, null, 1932110959);
	}

	public synchronized boolean method7517(int i, int i_86_) {
		if (!method7474(i, i_86_, -2040158089))
			return false;
		if (null != anObjectArrayArray5072[i] && null != anObjectArrayArray5072[i][i_86_])
			return true;
		if (null != anObjectArray5081[i])
			return true;
		method7475(i, 896463791);
		if (anObjectArray5081[i] != null)
			return true;
		return false;
	}

	public int method7518(int i) {
		if (!method7471(-2047340954))
			return -1;
		int i_87_ = aClass469_5080.aClass281_5332.method5181(i, (byte) 80);
		if (!method7473(i_87_, -1105701807))
			return -1;
		return i_87_;
	}

	public int method7519(int i) {
		if (!method7473(i, -1105701807))
			return 0;
		return aClass469_5080.anIntArray5351[i];
	}

	public synchronized boolean method7520(int i) {
		if (!method7473(i, -1105701807))
			return false;
		if (null != anObjectArray5081[i])
			return true;
		method7475(i, 856582574);
		if (null != anObjectArray5081[i])
			return true;
		return false;
	}

	public synchronized boolean method7521(int i, int i_88_) {
		if (!method7471(-338038852))
			return false;
		if (i < 0 || i_88_ < 0 || i >= aClass469_5080.anIntArray5351.length || i_88_ >= aClass469_5080.anIntArray5351[i]) {
			if (aBool5073)
				throw new IllegalArgumentException(new StringBuilder().append(i).append(" ").append(i_88_).toString());
			return false;
		}
		return true;
	}

	public synchronized boolean method7522() {
		if (!method7471(1958842326))
			return false;
		boolean bool = true;
		for (int i = 0; i < aClass469_5080.anIntArray5337.length; i++) {
			int i_89_ = aClass469_5080.anIntArray5337[i];
			if (anObjectArray5081[i_89_] == null) {
				method7475(i_89_, -1056336398);
				if (anObjectArray5081[i_89_] == null)
					bool = false;
			}
		}
		return bool;
	}

	public synchronized boolean method7523() {
		if (!method7471(989366809))
			return false;
		boolean bool = true;
		for (int i = 0; i < aClass469_5080.anIntArray5337.length; i++) {
			int i_90_ = aClass469_5080.anIntArray5337[i];
			if (anObjectArray5081[i_90_] == null) {
				method7475(i_90_, 809351946);
				if (anObjectArray5081[i_90_] == null)
					bool = false;
			}
		}
		return bool;
	}

	public int method7524(int i) {
		if (!method7473(i, -1105701807))
			return 0;
		return aClass469_5080.anIntArray5351[i];
	}

	public void method7525(int i) {
		aClass457_5071.method7430(i, 2132032611);
	}

	public synchronized int method7526(int i) {
		if (!method7473(i, -1105701807))
			return 0;
		if (anObjectArray5081[i] != null)
			return 100;
		return aClass457_5071.method7433(i, (byte) 4);
	}

	public synchronized int method7527(int i) {
		if (!method7473(i, -1105701807))
			return 0;
		if (anObjectArray5081[i] != null)
			return 100;
		return aClass457_5071.method7433(i, (byte) 22);
	}

	public void method7528(int i) {
		aClass457_5071.method7430(i, 2011695860);
	}

	public synchronized int method7529() {
		if (!method7471(-2115473976))
			return 0;
		int i = 0;
		int i_91_ = 0;
		for (int i_92_ = 0; i_92_ < anObjectArray5081.length; i_92_++) {
			if (aClass469_5080.anIntArray5335[i_92_] > 0) {
				i += 100;
				i_91_ += method7483(i_92_, -959817569);
			}
		}
		if (0 == i)
			return 100;
		int i_93_ = i_91_ * 100 / i;
		return i_93_;
	}

	public synchronized int method7530() {
		if (!method7471(-1763313443))
			return 0;
		int i = 0;
		int i_94_ = 0;
		for (int i_95_ = 0; i_95_ < anObjectArray5081.length; i_95_++) {
			if (aClass469_5080.anIntArray5335[i_95_] > 0) {
				i += 100;
				i_94_ += method7483(i_95_, -1234007552);
			}
		}
		if (0 == i)
			return 100;
		int i_96_ = i_94_ * 100 / i;
		return i_96_;
	}

	public synchronized int method7531() {
		if (!method7471(574786394))
			return 0;
		int i = 0;
		int i_97_ = 0;
		for (int i_98_ = 0; i_98_ < anObjectArray5081.length; i_98_++) {
			if (aClass469_5080.anIntArray5335[i_98_] > 0) {
				i += 100;
				i_97_ += method7483(i_98_, -2103684056);
			}
		}
		if (0 == i)
			return 100;
		int i_99_ = i_97_ * 100 / i;
		return i_99_;
	}

	public int method7532(int i) {
		if (!method7473(i, -1105701807))
			return 0;
		return aClass469_5080.anIntArray5351[i];
	}

	public synchronized byte[] method7533(int i) {
		if (!method7471(-1515623415))
			return null;
		if (aClass469_5080.anIntArray5351.length == 1)
			return method7470(0, i, (byte) -38);
		if (!method7473(i, -1105701807))
			return null;
		if (aClass469_5080.anIntArray5351[i] == 1)
			return method7470(i, 0, (byte) -21);
		throw new RuntimeException();
	}

	public synchronized byte[] method7534(int i) {
		if (!method7471(1072777871))
			return null;
		if (aClass469_5080.anIntArray5351.length == 1)
			return method7470(0, i, (byte) -61);
		if (!method7473(i, -1105701807))
			return null;
		if (aClass469_5080.anIntArray5351[i] == 1)
			return method7470(i, 0, (byte) -18);
		throw new RuntimeException();
	}

	public synchronized byte[] method7535(int i) {
		if (!method7471(-298394654))
			return null;
		if (aClass469_5080.anIntArray5351.length == 1)
			return method7470(0, i, (byte) -124);
		if (!method7473(i, -1105701807))
			return null;
		if (aClass469_5080.anIntArray5351[i] == 1)
			return method7470(i, 0, (byte) -110);
		throw new RuntimeException();
	}

	public synchronized int[] method7536(int i) {
		if (!method7473(i, -1105701807))
			return null;
		int[] is = aClass469_5080.anIntArrayArray5348[i];
		if (is == null) {
			is = new int[aClass469_5080.anIntArray5335[i]];
			for (int i_100_ = 0; i_100_ < is.length; i_100_++)
				is[i_100_] = i_100_;
		}
		return is;
	}

	public synchronized int[] method7537(int i) {
		if (!method7473(i, -1105701807))
			return null;
		int[] is = aClass469_5080.anIntArrayArray5348[i];
		if (is == null) {
			is = new int[aClass469_5080.anIntArray5335[i]];
			for (int i_101_ = 0; i_101_ < is.length; i_101_++)
				is[i_101_] = i_101_;
		}
		return is;
	}

	public synchronized int[] method7538(int i) {
		if (!method7473(i, -1105701807))
			return null;
		int[] is = aClass469_5080.anIntArrayArray5348[i];
		if (is == null) {
			is = new int[aClass469_5080.anIntArray5335[i]];
			for (int i_102_ = 0; i_102_ < is.length; i_102_++)
				is[i_102_] = i_102_;
		}
		return is;
	}

	public synchronized int[] method7539(int i) {
		if (!method7473(i, -1105701807))
			return null;
		int[] is = aClass469_5080.anIntArrayArray5348[i];
		if (is == null) {
			is = new int[aClass469_5080.anIntArray5335[i]];
			for (int i_103_ = 0; i_103_ < is.length; i_103_++)
				is[i_103_] = i_103_;
		}
		return is;
	}

	public int method7540(String string, int i) {
		if (!method7471(-1939988757))
			return -1;
		string = string.toLowerCase();
		int i_104_ = (aClass469_5080.aClass281_5332.method5181(Class474.method7754(string, (byte) 12), (byte) -34));
		if (!method7473(i_104_, -1105701807))
			return -1;
		return i_104_;
	}

	public Class459(Class457 class457, boolean bool, int i) {
		if (i < 0 || i > 2)
			throw new IllegalArgumentException("");
		aClass457_5071 = class457;
		aBool5075 = bool;
		anInt5079 = -1196791373 * i;
	}

	public int method7541(int i) {
		if (!method7471(2114767510))
			return -1;
		int i_105_ = aClass469_5080.aClass281_5332.method5181(i, (byte) -28);
		if (!method7473(i_105_, -1105701807))
			return -1;
		return i_105_;
	}

	public synchronized boolean method7542(int i, int i_106_) {
		if (!method7474(i, i_106_, -1985054051))
			return false;
		if (null != anObjectArrayArray5072[i] && null != anObjectArrayArray5072[i][i_106_])
			return true;
		if (null != anObjectArray5081[i])
			return true;
		method7475(i, 1886007195);
		if (anObjectArray5081[i] != null)
			return true;
		return false;
	}

	public int method7543(int i) {
		if (!method7473(i, -1105701807))
			return 0;
		return aClass469_5080.anIntArray5351[i];
	}

	public synchronized void method7544(int i) {
		if (method7473(i, -1105701807)) {
			if (anObjectArrayArray5072 != null)
				anObjectArrayArray5072[i] = null;
		}
	}

	public int method7545() {
		if (!method7471(-1992431379))
			return -1;
		return aClass469_5080.anIntArray5351.length;
	}

	public void method7546(int i) {
		aClass457_5071.method7430(i, 2021975288);
	}

	public synchronized int method7547() {
		if (!method7471(1264363110))
			return 0;
		int i = 0;
		int i_107_ = 0;
		for (int i_108_ = 0; i_108_ < anObjectArray5081.length; i_108_++) {
			if (aClass469_5080.anIntArray5335[i_108_] > 0) {
				i += 100;
				i_107_ += method7483(i_108_, -1060419933);
			}
		}
		if (0 == i)
			return 100;
		int i_109_ = i_107_ * 100 / i;
		return i_109_;
	}

	public void method7548(boolean bool, boolean bool_110_) {
		if (method7471(1027696645)) {
			if (bool) {
				aClass469_5080.anIntArray5338 = null;
				aClass469_5080.aClass281_5332 = null;
			}
			if (bool_110_) {
				aClass469_5080.anIntArrayArray5346 = null;
				aClass469_5080.aClass281Array5350 = null;
			}
		}
	}

	public void method7549(boolean bool, boolean bool_111_) {
		if (method7471(-1797790205)) {
			if (bool) {
				aClass469_5080.anIntArray5338 = null;
				aClass469_5080.aClass281_5332 = null;
			}
			if (bool_111_) {
				aClass469_5080.anIntArrayArray5346 = null;
				aClass469_5080.aClass281Array5350 = null;
			}
		}
	}

	synchronized boolean method7550(int i, int i_112_, int[] is) {
		if (!method7473(i, -1105701807))
			return false;
		if (null == anObjectArray5081[i])
			return false;
		int i_113_ = aClass469_5080.anIntArray5335[i];
		int[] is_114_ = aClass469_5080.anIntArrayArray5348[i];
		if (anObjectArrayArray5072[i] == null)
			anObjectArrayArray5072[i] = new Object[aClass469_5080.anIntArray5351[i]];
		Object[] objects = anObjectArrayArray5072[i];
		boolean bool = true;
		for (int i_115_ = 0; i_115_ < i_113_; i_115_++) {
			int i_116_;
			if (null == is_114_)
				i_116_ = i_115_;
			else
				i_116_ = is_114_[i_115_];
			if (objects[i_116_] == null) {
				bool = false;
				break;
			}
		}
		if (bool)
			return true;
		byte[] is_117_;
		if (is != null && (is[0] != 0 || is[1] != 0 || 0 != is[2] || 0 != is[3])) {
			is_117_ = Class537.method8985(anObjectArray5081[i], true, 428204385);
			RSByteBuffer class527_sub38 = new RSByteBuffer(is_117_);
			int i_118_ = class527_sub38.readUnsignedByte();
			int i_119_ = class527_sub38.readInt();
			int i_120_ = ((i_118_ == Class472.aClass472_5368.method87() ? 5 : 9) + i_119_);
			class527_sub38.method16488(is, 5, i_120_, -907390670);
		} else
			is_117_ = Class537.method8985(anObjectArray5081[i], false, 1440041091);
		byte[] is_121_;
		try {
			is_121_ = Class305.method5591(is_117_, -108576820);
		} catch (RuntimeException runtimeexception) {
			throw Class664.method11052(runtimeexception, new StringBuilder().append(null != is).append(" ").append(i).append(" ").append(is_117_.length).append(" ").append(Class704.method14311(is_117_, is_117_.length, -373504254)).append(" ").append(Class704.method14311(is_117_, is_117_.length - 2, -373504254)).append(" ").append(aClass469_5080.anIntArray5347[i]).append(" ").append(aClass469_5080.anInt5341 * 620090825).toString());
		}
		if (aBool5075)
			anObjectArray5081[i] = null;
		if (i_113_ > 1) {
			if (-1049989765 * anInt5079 != 2) {
				int i_122_ = is_121_.length;
				int i_123_ = is_121_[--i_122_] & 0xff;
				i_122_ -= i_123_ * i_113_ * 4;
				RSByteBuffer class527_sub38 = new RSByteBuffer(is_121_);
				int[] is_124_ = new int[i_113_];
				class527_sub38.anInt10689 = i_122_ * 1474750881;
				for (int i_125_ = 0; i_125_ < i_123_; i_125_++) {
					int i_126_ = 0;
					for (int i_127_ = 0; i_127_ < i_113_; i_127_++) {
						i_126_ += class527_sub38.readInt();
						is_124_[i_127_] += i_126_;
					}
				}
				byte[][] is_128_ = new byte[i_113_][];
				for (int i_129_ = 0; i_129_ < i_113_; i_129_++) {
					is_128_[i_129_] = new byte[is_124_[i_129_]];
					is_124_[i_129_] = 0;
				}
				class527_sub38.anInt10689 = 1474750881 * i_122_;
				int i_130_ = 0;
				for (int i_131_ = 0; i_131_ < i_123_; i_131_++) {
					int i_132_ = 0;
					for (int i_133_ = 0; i_133_ < i_113_; i_133_++) {
						i_132_ += class527_sub38.readInt();
						System.arraycopy(is_121_, i_130_, is_128_[i_133_], is_124_[i_133_], i_132_);
						is_124_[i_133_] += i_132_;
						i_130_ += i_132_;
					}
				}
				for (int i_134_ = 0; i_134_ < i_113_; i_134_++) {
					int i_135_;
					if (null == is_114_)
						i_135_ = i_134_;
					else
						i_135_ = is_114_[i_134_];
					if (0 == -1049989765 * anInt5079)
						objects[i_135_] = Class166.method2668(is_128_[i_134_], false, (short) 12602);
					else
						objects[i_135_] = is_128_[i_134_];
				}
			} else {
				int i_136_ = is_121_.length;
				int i_137_ = is_121_[--i_136_] & 0xff;
				i_136_ -= i_137_ * i_113_ * 4;
				RSByteBuffer class527_sub38 = new RSByteBuffer(is_121_);
				int i_138_ = 0;
				int i_139_ = 0;
				class527_sub38.anInt10689 = i_136_ * 1474750881;
				for (int i_140_ = 0; i_140_ < i_137_; i_140_++) {
					int i_141_ = 0;
					for (int i_142_ = 0; i_142_ < i_113_; i_142_++) {
						i_141_ += class527_sub38.readInt();
						int i_143_;
						if (null == is_114_)
							i_143_ = i_142_;
						else
							i_143_ = is_114_[i_142_];
						if (i_112_ == i_143_) {
							i_138_ += i_141_;
							i_139_ = i_143_;
						}
					}
				}
				if (0 == i_138_)
					return true;
				byte[] is_144_ = new byte[i_138_];
				i_138_ = 0;
				class527_sub38.anInt10689 = i_136_ * 1474750881;
				int i_145_ = 0;
				for (int i_146_ = 0; i_146_ < i_137_; i_146_++) {
					int i_147_ = 0;
					for (int i_148_ = 0; i_148_ < i_113_; i_148_++) {
						i_147_ += class527_sub38.readInt();
						int i_149_;
						if (null == is_114_)
							i_149_ = i_148_;
						else
							i_149_ = is_114_[i_148_];
						if (i_149_ == i_112_) {
							System.arraycopy(is_121_, i_145_, is_144_, i_138_, i_147_);
							i_138_ += i_147_;
						}
						i_145_ += i_147_;
					}
				}
				objects[i_139_] = is_144_;
			}
		} else {
			int i_150_;
			if (null == is_114_)
				i_150_ = 0;
			else
				i_150_ = is_114_[0];
			if (-1049989765 * anInt5079 == 0)
				objects[i_150_] = Class166.method2668(is_121_, false, (short) -6065);
			else
				objects[i_150_] = is_121_;
		}
		return true;
	}

	synchronized boolean method7551(int i, int i_151_, int[] is) {
		if (!method7473(i, -1105701807))
			return false;
		if (null == anObjectArray5081[i])
			return false;
		int i_152_ = aClass469_5080.anIntArray5335[i];
		int[] is_153_ = aClass469_5080.anIntArrayArray5348[i];
		if (anObjectArrayArray5072[i] == null)
			anObjectArrayArray5072[i] = new Object[aClass469_5080.anIntArray5351[i]];
		Object[] objects = anObjectArrayArray5072[i];
		boolean bool = true;
		for (int i_154_ = 0; i_154_ < i_152_; i_154_++) {
			int i_155_;
			if (null == is_153_)
				i_155_ = i_154_;
			else
				i_155_ = is_153_[i_154_];
			if (objects[i_155_] == null) {
				bool = false;
				break;
			}
		}
		if (bool)
			return true;
		byte[] is_156_;
		if (is != null && (is[0] != 0 || is[1] != 0 || 0 != is[2] || 0 != is[3])) {
			is_156_ = Class537.method8985(anObjectArray5081[i], true, 817616913);
			RSByteBuffer class527_sub38 = new RSByteBuffer(is_156_);
			int i_157_ = class527_sub38.readUnsignedByte();
			int i_158_ = class527_sub38.readInt();
			int i_159_ = ((i_157_ == Class472.aClass472_5368.method87() ? 5 : 9) + i_158_);
			class527_sub38.method16488(is, 5, i_159_, -199093870);
		} else
			is_156_ = Class537.method8985(anObjectArray5081[i], false, -368334164);
		byte[] is_160_;
		try {
			is_160_ = Class305.method5591(is_156_, 1334518158);
		} catch (RuntimeException runtimeexception) {
			throw Class664.method11052(runtimeexception, new StringBuilder().append(null != is).append(" ").append(i).append(" ").append(is_156_.length).append(" ").append(Class704.method14311(is_156_, is_156_.length, -373504254)).append(" ").append(Class704.method14311(is_156_, is_156_.length - 2, -373504254)).append(" ").append(aClass469_5080.anIntArray5347[i]).append(" ").append(aClass469_5080.anInt5341 * 620090825).toString());
		}
		if (aBool5075)
			anObjectArray5081[i] = null;
		if (i_152_ > 1) {
			if (-1049989765 * anInt5079 != 2) {
				int i_161_ = is_160_.length;
				int i_162_ = is_160_[--i_161_] & 0xff;
				i_161_ -= i_162_ * i_152_ * 4;
				RSByteBuffer class527_sub38 = new RSByteBuffer(is_160_);
				int[] is_163_ = new int[i_152_];
				class527_sub38.anInt10689 = i_161_ * 1474750881;
				for (int i_164_ = 0; i_164_ < i_162_; i_164_++) {
					int i_165_ = 0;
					for (int i_166_ = 0; i_166_ < i_152_; i_166_++) {
						i_165_ += class527_sub38.readInt();
						is_163_[i_166_] += i_165_;
					}
				}
				byte[][] is_167_ = new byte[i_152_][];
				for (int i_168_ = 0; i_168_ < i_152_; i_168_++) {
					is_167_[i_168_] = new byte[is_163_[i_168_]];
					is_163_[i_168_] = 0;
				}
				class527_sub38.anInt10689 = 1474750881 * i_161_;
				int i_169_ = 0;
				for (int i_170_ = 0; i_170_ < i_162_; i_170_++) {
					int i_171_ = 0;
					for (int i_172_ = 0; i_172_ < i_152_; i_172_++) {
						i_171_ += class527_sub38.readInt();
						System.arraycopy(is_160_, i_169_, is_167_[i_172_], is_163_[i_172_], i_171_);
						is_163_[i_172_] += i_171_;
						i_169_ += i_171_;
					}
				}
				for (int i_173_ = 0; i_173_ < i_152_; i_173_++) {
					int i_174_;
					if (null == is_153_)
						i_174_ = i_173_;
					else
						i_174_ = is_153_[i_173_];
					if (0 == -1049989765 * anInt5079)
						objects[i_174_] = Class166.method2668(is_167_[i_173_], false, (short) -4225);
					else
						objects[i_174_] = is_167_[i_173_];
				}
			} else {
				int i_175_ = is_160_.length;
				int i_176_ = is_160_[--i_175_] & 0xff;
				i_175_ -= i_176_ * i_152_ * 4;
				RSByteBuffer class527_sub38 = new RSByteBuffer(is_160_);
				int i_177_ = 0;
				int i_178_ = 0;
				class527_sub38.anInt10689 = i_175_ * 1474750881;
				for (int i_179_ = 0; i_179_ < i_176_; i_179_++) {
					int i_180_ = 0;
					for (int i_181_ = 0; i_181_ < i_152_; i_181_++) {
						i_180_ += class527_sub38.readInt();
						int i_182_;
						if (null == is_153_)
							i_182_ = i_181_;
						else
							i_182_ = is_153_[i_181_];
						if (i_151_ == i_182_) {
							i_177_ += i_180_;
							i_178_ = i_182_;
						}
					}
				}
				if (0 == i_177_)
					return true;
				byte[] is_183_ = new byte[i_177_];
				i_177_ = 0;
				class527_sub38.anInt10689 = i_175_ * 1474750881;
				int i_184_ = 0;
				for (int i_185_ = 0; i_185_ < i_176_; i_185_++) {
					int i_186_ = 0;
					for (int i_187_ = 0; i_187_ < i_152_; i_187_++) {
						i_186_ += class527_sub38.readInt();
						int i_188_;
						if (null == is_153_)
							i_188_ = i_187_;
						else
							i_188_ = is_153_[i_187_];
						if (i_188_ == i_151_) {
							System.arraycopy(is_160_, i_184_, is_183_, i_177_, i_186_);
							i_177_ += i_186_;
						}
						i_184_ += i_186_;
					}
				}
				objects[i_178_] = is_183_;
			}
		} else {
			int i_189_;
			if (null == is_153_)
				i_189_ = 0;
			else
				i_189_ = is_153_[0];
			if (-1049989765 * anInt5079 == 0)
				objects[i_189_] = Class166.method2668(is_160_, false, (short) 1187);
			else
				objects[i_189_] = is_160_;
		}
		return true;
	}

	public synchronized boolean method7552(int i, byte i_190_) {
		if (!method7473(i, -1105701807))
			return false;
		if (null != anObjectArray5081[i])
			return true;
		method7475(i, 1081121502);
		if (null != anObjectArray5081[i])
			return true;
		return false;
	}

	public synchronized byte[] method7553(int i, int i_191_, int[] is, int i_192_) {
		if (!method7474(i, i_191_, 38217621))
			return null;
		byte[] is_193_ = null;
		if (null == anObjectArrayArray5072[i] || anObjectArrayArray5072[i][i_191_] == null) {
			boolean bool = method7492(i, i_191_, is, -2132893165);
			if (!bool) {
				method7475(i, -823351334);
				bool = method7492(i, i_191_, is, -725753254);
				if (!bool)
					return null;
			}
		}
		if (null == anObjectArrayArray5072[i])
			throw new RuntimeException("");
		if (null != anObjectArrayArray5072[i][i_191_]) {
			is_193_ = Class537.method8985(anObjectArrayArray5072[i][i_191_], false, 929210875);
			if (null == is_193_)
				throw new RuntimeException("");
		}
		if (null != is_193_) {
			if (1 == -1049989765 * anInt5079) {
				anObjectArrayArray5072[i][i_191_] = null;
				if (aClass469_5080.anIntArray5351[i] == 1)
					anObjectArrayArray5072[i] = null;
			} else if (-1049989765 * anInt5079 == 2)
				anObjectArrayArray5072[i] = null;
		}
		return is_193_;
	}

	public boolean method7554(int i) {
		if (!method7471(-1484182505))
			return false;
		if (1 == aClass469_5080.anIntArray5351.length)
			return method7474(0, i, -327900411);
		if (!method7473(i, -1105701807))
			return false;
		if (1 == aClass469_5080.anIntArray5351[i])
			return method7474(i, 0, -795080849);
		throw new RuntimeException();
	}

	public synchronized int method7555(int i) {
		if (!method7473(i, -1105701807))
			return 0;
		if (anObjectArray5081[i] != null)
			return 100;
		return aClass457_5071.method7433(i, (byte) -31);
	}

	boolean method7556(String string, String string_194_) {
		if (!method7471(1371843598))
			return false;
		string = string.toLowerCase();
		string_194_ = string_194_.toLowerCase();
		int i = (aClass469_5080.aClass281_5332.method5181(Class474.method7754(string, (byte) -17), (byte) -63));
		if (!method7473(i, -1105701807))
			return false;
		int i_195_ = (aClass469_5080.aClass281Array5350[i].method5181(Class474.method7754(string_194_, (byte) -79), (byte) 45));
		return method7479(i, i_195_, 102380841);
	}

	public boolean method7557(String string) {
		if (!method7471(-1681544969))
			return false;
		string = string.toLowerCase();
		int i = (aClass469_5080.aClass281_5332.method5181(Class474.method7754(string, (byte) 46), (byte) -40));
		if (i < 0)
			return false;
		return true;
	}

	public boolean method7558(String string) {
		if (!method7471(704252198))
			return false;
		string = string.toLowerCase();
		int i = (aClass469_5080.aClass281_5332.method5181(Class474.method7754(string, (byte) -108), (byte) 25));
		if (i < 0)
			return false;
		return true;
	}

	public boolean method7559(String string, String string_196_) {
		if (!method7471(-1856471795))
			return false;
		string = string.toLowerCase();
		string_196_ = string_196_.toLowerCase();
		int i = (aClass469_5080.aClass281_5332.method5181(Class474.method7754(string, (byte) -50), (byte) -10));
		if (i < 0)
			return false;
		int i_197_ = (aClass469_5080.aClass281Array5350[i].method5181(Class474.method7754(string_196_, (byte) 40), (byte) -39));
		if (i_197_ < 0)
			return false;
		return true;
	}

	public synchronized byte[] method7560(String string, String string_198_) {
		if (!method7471(1759883296))
			return null;
		string = string.toLowerCase();
		string_198_ = string_198_.toLowerCase();
		int i = (aClass469_5080.aClass281_5332.method5181(Class474.method7754(string, (byte) 77), (byte) -69));
		if (!method7473(i, -1105701807))
			return null;
		int i_199_ = (aClass469_5080.aClass281Array5350[i].method5181(Class474.method7754(string_198_, (byte) 6), (byte) 51));
		return method7470(i, i_199_, (byte) -19);
	}

	public int method7561(byte i) {
		if (!method7471(-928424397))
			return -1;
		return aClass469_5080.anIntArray5351.length;
	}

	public synchronized boolean method7562(int i) {
		if (!method7473(i, -1105701807))
			return false;
		if (null != anObjectArray5081[i])
			return true;
		method7475(i, -452757338);
		if (null != anObjectArray5081[i])
			return true;
		return false;
	}

	public void method7563(int i) {
		aClass457_5071.method7430(i, 2108786193);
	}

	boolean method7564(String string, String string_200_) {
		if (!method7471(-1829292078))
			return false;
		string = string.toLowerCase();
		string_200_ = string_200_.toLowerCase();
		int i = (aClass469_5080.aClass281_5332.method5181(Class474.method7754(string, (byte) -31), (byte) -39));
		if (!method7473(i, -1105701807))
			return false;
		int i_201_ = (aClass469_5080.aClass281Array5350[i].method5181(Class474.method7754(string_200_, (byte) 84), (byte) 27));
		return method7479(i, i_201_, 102380841);
	}

	public boolean method7565(String string) {
		if (!method7471(2011007291))
			return false;
		string = string.toLowerCase();
		int i = (aClass469_5080.aClass281_5332.method5181(Class474.method7754(string, (byte) 98), (byte) 29));
		return method7552(i, (byte) 107);
	}

	public int method7566(String string) {
		if (!method7471(-1874267974))
			return 0;
		string = string.toLowerCase();
		int i = (aClass469_5080.aClass281_5332.method5181(Class474.method7754(string, (byte) -30), (byte) 58));
		return method7483(i, -1077211023);
	}

	public int method7567(String string) {
		if (!method7471(1907920180))
			return 0;
		string = string.toLowerCase();
		int i = (aClass469_5080.aClass281_5332.method5181(Class474.method7754(string, (byte) 43), (byte) 8));
		return method7483(i, -680523462);
	}

	static final byte[] method7568(byte[] is) {
		RSByteBuffer class527_sub38 = new RSByteBuffer(is);
		Class471 class471 = new Class471(class527_sub38);
		Class472 class472 = class471.method7719(1140133171);
		int i = class471.method7720(1527187692);
		if (i < 0 || 0 != anInt5082 * 2035298957 && i > anInt5082 * 2035298957)
			throw new RuntimeException();
		if (Class472.aClass472_5368 == class472) {
			byte[] is_202_ = new byte[i];
			class527_sub38.method16460(is_202_, 0, i, -1804831533);
			return is_202_;
		}
		int i_203_ = class471.method7721(535006470);
		if (i_203_ < 0 || 0 != anInt5082 * 2035298957 && i_203_ > anInt5082 * 2035298957)
			throw new RuntimeException();
		byte[] is_204_;
		if (class472 == Class472.aClass472_5364) {
			is_204_ = new byte[i_203_];
			Class688.method13969(is_204_, i_203_, is, i, 9);
		} else if (Class472.aClass472_5365 == class472) {
			is_204_ = new byte[i_203_];
			synchronized (aClass77_5074) {
				aClass77_5074.method1542(class527_sub38, is_204_, 578639249);
			}
		} else if (class472 == Class472.aClass472_5366) {
			try {
				is_204_ = Class84.method1581(class527_sub38, i_203_, 1507886629);
			} catch (IOException ioexception) {
				throw new RuntimeException(ioexception);
			}
		} else
			throw new RuntimeException();
		return is_204_;
	}

	static final void method7569(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = class665.aClass346_8532.aByte3723;
	}

	public static void method7570(int i, int i_205_, int i_206_) {
		Class527_Sub8_Sub9 class527_sub8_sub9 = Class532.method8930(20, (long) i_205_ << 32 | (long) i);
		class527_sub8_sub9.method18186(1730695973);
	}
}
