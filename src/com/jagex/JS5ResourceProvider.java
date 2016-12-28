/* Class461 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public final class JS5ResourceProvider {
	static Class85 aClass85_5204 = new Class85();
	Object[] anObjectArray5205;
	Object[][] anObjectArrayArray5206;
	static int anInt5207;
	boolean aBool5208;
	Class467 aClass467_5209 = null;
	static final int anInt5210 = 0;
	static final int anInt5211 = 2;
	int anInt5212;
	Class459 aClass459_5213;
	static boolean aBool5214 = false;
	public static final int anInt5215 = 1;
	public static int anInt5216;
	public static int anInt5217;

	synchronized boolean method5551(int i, int i_0_, int[] is, int i_1_) {
		if (!method5605(i, (byte) -1))
			return false;
		if (null == anObjectArray5205[i])
			return false;
		int i_2_ = aClass467_5209.anIntArray5340[i];
		int[] is_3_ = aClass467_5209.anIntArrayArray5341[i];
		if (null == anObjectArrayArray5206[i])
			anObjectArrayArray5206[i] = new Object[aClass467_5209.anIntArray5344[i]];
		Object[] objects = anObjectArrayArray5206[i];
		boolean bool = true;
		for (int i_4_ = 0; i_4_ < i_2_; i_4_++) {
			int i_5_;
			if (is_3_ == null)
				i_5_ = i_4_;
			else
				i_5_ = is_3_[i_4_];
			if (null == objects[i_5_]) {
				bool = false;
				break;
			}
		}
		if (bool)
			return true;
		byte[] is_6_;
		if (is != null && (0 != is[0] || is[1] != 0 || is[2] != 0 || is[3] != 0)) {
			is_6_ = Class51.method931(anObjectArray5205[i], true, -1947306627);
			RSByteBuffer class536_sub33 = new RSByteBuffer(is_6_);
			int i_7_ = class536_sub33.readUnsignedByte();
			int i_8_ = class536_sub33.readInt();
			int i_9_ = (i_7_ == Class463.aClass463_5222.method78() ? 5 : 9) + i_8_;
			class536_sub33.method9781(is, 5, i_9_, (byte) -24);
		} else
			is_6_ = Class51.method931(anObjectArray5205[i], false, -83088320);
		byte[] is_10_;
		try {
			is_10_ = Class469.method5700(is_6_, (byte) -48);
		} catch (RuntimeException runtimeexception) {
			throw Class646.method7810(runtimeexception, new StringBuilder().append(null != is).append(" ").append(i).append(" ").append(is_6_.length).append(" ").append(Class536_Sub25.method9592(is_6_, is_6_.length, (byte) 0)).append(" ").append(Class536_Sub25.method9592(is_6_, is_6_.length - 2, (byte) 0)).append(" ").append(aClass467_5209.anIntArray5334[i]).append(" ").append(217760821 * aClass467_5209.anInt5342).toString());
		}
		if (aBool5208)
			anObjectArray5205[i] = null;
		if (i_2_ > 1) {
			if (628056261 * anInt5212 != 2) {
				int i_11_ = is_10_.length;
				int i_12_ = is_10_[--i_11_] & 0xff;
				i_11_ -= i_12_ * i_2_ * 4;
				RSByteBuffer class536_sub33 = new RSByteBuffer(is_10_);
				int[] is_13_ = new int[i_2_];
				class536_sub33.off = 516175515 * i_11_;
				for (int i_14_ = 0; i_14_ < i_12_; i_14_++) {
					int i_15_ = 0;
					for (int i_16_ = 0; i_16_ < i_2_; i_16_++) {
						i_15_ += class536_sub33.readInt();
						is_13_[i_16_] += i_15_;
					}
				}
				byte[][] is_17_ = new byte[i_2_][];
				for (int i_18_ = 0; i_18_ < i_2_; i_18_++) {
					is_17_[i_18_] = new byte[is_13_[i_18_]];
					is_13_[i_18_] = 0;
				}
				class536_sub33.off = 516175515 * i_11_;
				int i_19_ = 0;
				for (int i_20_ = 0; i_20_ < i_12_; i_20_++) {
					int i_21_ = 0;
					for (int i_22_ = 0; i_22_ < i_2_; i_22_++) {
						i_21_ += class536_sub33.readInt();
						System.arraycopy(is_10_, i_19_, is_17_[i_22_], is_13_[i_22_], i_21_);
						is_13_[i_22_] += i_21_;
						i_19_ += i_21_;
					}
				}
				for (int i_23_ = 0; i_23_ < i_2_; i_23_++) {
					int i_24_;
					if (is_3_ == null)
						i_24_ = i_23_;
					else
						i_24_ = is_3_[i_23_];
					if (628056261 * anInt5212 == 0)
						objects[i_24_] = Class676.method8038(is_17_[i_23_], false, (byte) 70);
					else
						objects[i_24_] = is_17_[i_23_];
				}
			} else {
				int i_25_ = is_10_.length;
				int i_26_ = is_10_[--i_25_] & 0xff;
				i_25_ -= i_26_ * i_2_ * 4;
				RSByteBuffer class536_sub33 = new RSByteBuffer(is_10_);
				int i_27_ = 0;
				int i_28_ = 0;
				class536_sub33.off = 516175515 * i_25_;
				for (int i_29_ = 0; i_29_ < i_26_; i_29_++) {
					int i_30_ = 0;
					for (int i_31_ = 0; i_31_ < i_2_; i_31_++) {
						i_30_ += class536_sub33.readInt();
						int i_32_;
						if (null == is_3_)
							i_32_ = i_31_;
						else
							i_32_ = is_3_[i_31_];
						if (i_32_ == i_0_) {
							i_27_ += i_30_;
							i_28_ = i_32_;
						}
					}
				}
				if (0 == i_27_)
					return true;
				byte[] is_33_ = new byte[i_27_];
				i_27_ = 0;
				class536_sub33.off = 516175515 * i_25_;
				int i_34_ = 0;
				for (int i_35_ = 0; i_35_ < i_26_; i_35_++) {
					int i_36_ = 0;
					for (int i_37_ = 0; i_37_ < i_2_; i_37_++) {
						i_36_ += class536_sub33.readInt();
						int i_38_;
						if (null == is_3_)
							i_38_ = i_37_;
						else
							i_38_ = is_3_[i_37_];
						if (i_38_ == i_0_) {
							System.arraycopy(is_10_, i_34_, is_33_, i_27_, i_36_);
							i_27_ += i_36_;
						}
						i_34_ += i_36_;
					}
				}
				objects[i_28_] = is_33_;
			}
		} else {
			int i_39_;
			if (null == is_3_)
				i_39_ = 0;
			else
				i_39_ = is_3_[0];
			if (anInt5212 * 628056261 == 0)
				objects[i_39_] = Class676.method8038(is_10_, false, (byte) 12);
			else
				objects[i_39_] = is_10_;
		}
		return true;
	}

	public JS5ResourceProvider(Class459 class459, boolean bool, int i) {
		if (i < 0 || i > 2)
			throw new IllegalArgumentException("");
		aClass459_5213 = class459;
		aBool5208 = bool;
		anInt5212 = i * -1173545459;
	}

	public int method5552(int i) {
		if (!method5575((byte) -3))
			throw new IllegalStateException("");
		return 217760821 * aClass467_5209.anInt5342;
	}

	public synchronized boolean method5553(int i, int i_40_, int i_41_) {
		if (!method5575((byte) -71))
			return false;
		if (i < 0 || i_40_ < 0 || i >= aClass467_5209.anIntArray5344.length || i_40_ >= aClass467_5209.anIntArray5344[i]) {
			if (aBool5214)
				throw new IllegalArgumentException(new StringBuilder().append(i).append(" ").append(i_40_).toString());
			return false;
		}
		return true;
	}

	synchronized void method5554(int i, byte i_42_) {
		if (aBool5208)
			anObjectArray5205[i] = aClass459_5213.method5514(i, 9234981);
		else
			anObjectArray5205[i] = Class676.method8038(aClass459_5213.method5514(i, 1121115930), false, (byte) 20);
	}

	public void method5555(int i, byte i_43_) {
		aClass459_5213.method5508(i, -1919319738);
	}

	public byte[] method5556(int i, int i_44_, byte i_45_) {
		return method5557(i, i_44_, null, -275802768);
	}

	public synchronized byte[] method5557(int i, int i_46_, int[] is, int i_47_) {
		if (!method5553(i, i_46_, 1256085905))
			return null;
		byte[] is_48_ = null;
		if (anObjectArrayArray5206[i] == null || null == anObjectArrayArray5206[i][i_46_]) {
			boolean bool = method5551(i, i_46_, is, 454728933);
			if (!bool) {
				method5554(i, (byte) 68);
				bool = method5551(i, i_46_, is, 454728933);
				if (!bool)
					return null;
			}
		}
		if (anObjectArrayArray5206[i] == null)
			throw new RuntimeException("");
		if (null != anObjectArrayArray5206[i][i_46_]) {
			is_48_ = Class51.method931(anObjectArrayArray5206[i][i_46_], false, -1551650150);
			if (null == is_48_)
				throw new RuntimeException("");
		}
		if (null != is_48_) {
			if (1 == anInt5212 * 628056261) {
				anObjectArrayArray5206[i][i_46_] = null;
				if (1 == aClass467_5209.anIntArray5344[i])
					anObjectArrayArray5206[i] = null;
			} else if (628056261 * anInt5212 == 2)
				anObjectArrayArray5206[i] = null;
		}
		return is_48_;
	}

	public synchronized boolean method5558(int i, int i_49_, int i_50_) {
		if (!method5553(i, i_49_, -1917515335))
			return false;
		if (null != anObjectArrayArray5206[i] && null != anObjectArrayArray5206[i][i_49_])
			return true;
		if (anObjectArray5205[i] != null)
			return true;
		method5554(i, (byte) 19);
		if (anObjectArray5205[i] != null)
			return true;
		return false;
	}

	public int method5559(int i) {
		if (!method5575((byte) -11))
			return -1;
		int i_51_ = aClass467_5209.aClass260_5325.method3610(i, 1426556621);
		if (!method5605(i_51_, (byte) 73))
			return -1;
		return i_51_;
	}

	public synchronized boolean method5560(int i, int i_52_) {
		if (!method5605(i, (byte) -89))
			return false;
		if (null != anObjectArray5205[i])
			return true;
		method5554(i, (byte) 76);
		if (anObjectArray5205[i] != null)
			return true;
		return false;
	}

	public synchronized boolean method5561(int i) {
		if (!method5575((byte) -97))
			return false;
		boolean bool = true;
		for (int i_53_ = 0; i_53_ < aClass467_5209.anIntArray5330.length; i_53_++) {
			int i_54_ = aClass467_5209.anIntArray5330[i_53_];
			if (anObjectArray5205[i_54_] == null) {
				method5554(i_54_, (byte) 64);
				if (anObjectArray5205[i_54_] == null)
					bool = false;
			}
		}
		return bool;
	}

	public synchronized int method5562(int i, int i_55_) {
		if (!method5605(i, (byte) -24))
			return 0;
		if (anObjectArray5205[i] != null)
			return 100;
		return aClass459_5213.method5511(i, (byte) 118);
	}

	public synchronized int method5563(int i) {
		if (!method5575((byte) -58))
			return 0;
		int i_56_ = 0;
		int i_57_ = 0;
		for (int i_58_ = 0; i_58_ < anObjectArray5205.length; i_58_++) {
			if (aClass467_5209.anIntArray5340[i_58_] > 0) {
				i_56_ += 100;
				i_57_ += method5562(i_58_, -2059642827);
			}
		}
		if (i_56_ == 0)
			return 100;
		int i_59_ = i_57_ * 100 / i_56_;
		return i_59_;
	}

	public void method5564(int i) {
		aClass459_5213.method5508(i, -2062590369);
	}

	public boolean method5565(int i, int i_60_) {
		if (!method5575((byte) -44))
			return false;
		if (1 == aClass467_5209.anIntArray5344.length)
			return method5553(0, i, -1584969042);
		if (!method5605(i, (byte) 21))
			return false;
		if (aClass467_5209.anIntArray5344[i] == 1)
			return method5553(i, 0, -2071786910);
		throw new RuntimeException();
	}

	public int method5566(int i, int i_61_) {
		if (!method5605(i, (byte) 81))
			return 0;
		return aClass467_5209.anIntArray5344[i];
	}

	public int method5567(String string, int i) {
		if (!method5575((byte) -119))
			return 0;
		string = string.toLowerCase();
		int i_62_ = (aClass467_5209.aClass260_5325.method3610(Class616.method7336(string, 1792300414), 1426556621));
		return method5562(i_62_, -2045951562);
	}

	public synchronized void method5568(int i, short i_63_) {
		if (method5605(i, (byte) 39)) {
			if (anObjectArrayArray5206 != null)
				anObjectArrayArray5206[i] = null;
		}
	}

	public void method5569(boolean bool, boolean bool_64_, byte i) {
		if (method5575((byte) -42)) {
			if (bool) {
				aClass467_5209.anIntArray5328 = null;
				aClass467_5209.aClass260_5325 = null;
			}
			if (bool_64_) {
				aClass467_5209.anIntArrayArray5327 = null;
				aClass467_5209.aClass260Array5335 = null;
			}
		}
	}

	public int method5570(int i) {
		if (!method5575((byte) -13))
			return -1;
		return aClass467_5209.anIntArray5344.length;
	}

	public int method5571(String string, int i) {
		if (!method5575((byte) 1))
			return -1;
		string = string.toLowerCase();
		int i_65_ = (aClass467_5209.aClass260_5325.method3610(Class616.method7336(string, 1792300414), 1426556621));
		if (!method5605(i_65_, (byte) -83))
			return -1;
		return i_65_;
	}

	public int method5572(int i, int i_66_) {
		if (!method5575((byte) -11))
			return -1;
		int i_67_ = aClass467_5209.aClass260_5325.method3610(i, 1426556621);
		if (!method5605(i_67_, (byte) 44))
			return -1;
		return i_67_;
	}

	public boolean method5573(String string, int i) {
		if (!method5575((byte) -128))
			return false;
		string = string.toLowerCase();
		int i_68_ = (aClass467_5209.aClass260_5325.method3610(Class616.method7336(string, 1792300414), 1426556621));
		if (i_68_ < 0)
			return false;
		return true;
	}

	public boolean method5574(String string, String string_69_, int i) {
		if (!method5575((byte) -113))
			return false;
		string = string.toLowerCase();
		string_69_ = string_69_.toLowerCase();
		int i_70_ = (aClass467_5209.aClass260_5325.method3610(Class616.method7336(string, 1792300414), 1426556621));
		if (i_70_ < 0)
			return false;
		int i_71_ = (aClass467_5209.aClass260Array5335[i_70_].method3610(Class616.method7336(string_69_, 1792300414), 1426556621));
		if (i_71_ < 0)
			return false;
		return true;
	}

	synchronized boolean method5575(byte i) {
		if (null == aClass467_5209) {
			aClass467_5209 = aClass459_5213.method5505((byte) -85);
			if (aClass467_5209 == null)
				return false;
			anObjectArray5205 = new Object[aClass467_5209.anInt5333 * 608172963];
			anObjectArrayArray5206 = new Object[608172963 * aClass467_5209.anInt5333][];
		}
		return true;
	}

	boolean method5576(String string, String string_72_, byte i) {
		if (!method5575((byte) -75))
			return false;
		string = string.toLowerCase();
		string_72_ = string_72_.toLowerCase();
		int i_73_ = (aClass467_5209.aClass260_5325.method3610(Class616.method7336(string, 1792300414), 1426556621));
		if (!method5605(i_73_, (byte) -45))
			return false;
		int i_74_ = (aClass467_5209.aClass260Array5335[i_73_].method3610(Class616.method7336(string_72_, 1792300414), 1426556621));
		return method5558(i_73_, i_74_, -906309455);
	}

	public boolean method5577(String string, int i) {
		if (!method5575((byte) -50))
			return false;
		string = string.toLowerCase();
		int i_75_ = (aClass467_5209.aClass260_5325.method3610(Class616.method7336(string, 1792300414), 1426556621));
		return method5560(i_75_, 1940448411);
	}

	static {
		anInt5207 = 0;
	}

	synchronized boolean method5578() {
		if (null == aClass467_5209) {
			aClass467_5209 = aClass459_5213.method5505((byte) -110);
			if (aClass467_5209 == null)
				return false;
			anObjectArray5205 = new Object[aClass467_5209.anInt5333 * 608172963];
			anObjectArrayArray5206 = new Object[608172963 * aClass467_5209.anInt5333][];
		}
		return true;
	}

	public int method5579() {
		if (!method5575((byte) -18))
			throw new IllegalStateException("");
		return 217760821 * aClass467_5209.anInt5342;
	}

	public synchronized boolean method5580(int i, int i_76_) {
		if (!method5575((byte) -89))
			return false;
		if (aClass467_5209.anIntArray5344.length == 1)
			return method5558(0, i, -1477142998);
		if (!method5605(i, (byte) -4))
			return false;
		if (1 == aClass467_5209.anIntArray5344[i])
			return method5558(i, 0, -119763655);
		throw new RuntimeException();
	}

	synchronized void method5581(int i) {
		if (aBool5208)
			anObjectArray5205[i] = aClass459_5213.method5514(i, 1379872923);
		else
			anObjectArray5205[i] = Class676.method8038(aClass459_5213.method5514(i, 1536149991), false, (byte) 14);
	}

	public void method5582(int i) {
		aClass459_5213.method5508(i, -1588973777);
	}

	public void method5583(int i) {
		aClass459_5213.method5508(i, -582601931);
	}

	public void method5584(int i) {
		aClass459_5213.method5508(i, -2112549728);
	}

	public int method5585(int i) {
		if (!method5605(i, (byte) 6))
			return 0;
		return aClass467_5209.anIntArray5344[i];
	}

	public void method5586(int i) {
		aClass459_5213.method5508(i, -857070862);
	}

	public int method5587() {
		if (!method5575((byte) -86))
			return -1;
		return aClass467_5209.anIntArray5344.length;
	}

	public synchronized boolean method5588(int i) {
		if (!method5575((byte) -123))
			return false;
		if (aClass467_5209.anIntArray5344.length == 1)
			return method5558(0, i, -848402773);
		if (!method5605(i, (byte) 46))
			return false;
		if (1 == aClass467_5209.anIntArray5344[i])
			return method5558(i, 0, -1588316381);
		throw new RuntimeException();
	}

	public synchronized boolean method5589(int i, int i_77_) {
		if (!method5553(i, i_77_, 1262497234))
			return false;
		if (null != anObjectArrayArray5206[i] && null != anObjectArrayArray5206[i][i_77_])
			return true;
		if (anObjectArray5205[i] != null)
			return true;
		method5554(i, (byte) 116);
		if (anObjectArray5205[i] != null)
			return true;
		return false;
	}

	public synchronized boolean method5590(int i, int i_78_) {
		if (!method5553(i, i_78_, -17195711))
			return false;
		if (null != anObjectArrayArray5206[i] && null != anObjectArrayArray5206[i][i_78_])
			return true;
		if (anObjectArray5205[i] != null)
			return true;
		method5554(i, (byte) 97);
		if (anObjectArray5205[i] != null)
			return true;
		return false;
	}

	public synchronized boolean method5591(int i) {
		if (!method5575((byte) -123))
			return false;
		if (aClass467_5209.anIntArray5344.length == 1)
			return method5558(0, i, -619691630);
		if (!method5605(i, (byte) 105))
			return false;
		if (1 == aClass467_5209.anIntArray5344[i])
			return method5558(i, 0, 1093739731);
		throw new RuntimeException();
	}

	public synchronized void method5592(int i) {
		if (method5605(i, (byte) -62)) {
			if (anObjectArrayArray5206 != null)
				anObjectArrayArray5206[i] = null;
		}
	}

	public synchronized boolean method5593(int i) {
		if (!method5605(i, (byte) 15))
			return false;
		if (null != anObjectArray5205[i])
			return true;
		method5554(i, (byte) 82);
		if (anObjectArray5205[i] != null)
			return true;
		return false;
	}

	public synchronized boolean method5594() {
		if (!method5575((byte) -63))
			return false;
		boolean bool = true;
		for (int i = 0; i < aClass467_5209.anIntArray5330.length; i++) {
			int i_79_ = aClass467_5209.anIntArray5330[i];
			if (anObjectArray5205[i_79_] == null) {
				method5554(i_79_, (byte) 53);
				if (anObjectArray5205[i_79_] == null)
					bool = false;
			}
		}
		return bool;
	}

	public synchronized byte[] method5595(int i, int i_80_) {
		if (!method5575((byte) -34))
			return null;
		if (1 == aClass467_5209.anIntArray5344.length)
			return method5556(0, i, (byte) 1);
		if (!method5605(i, (byte) -40))
			return null;
		if (aClass467_5209.anIntArray5344[i] == 1)
			return method5556(i, 0, (byte) 1);
		throw new RuntimeException();
	}

	public synchronized int method5596() {
		if (!method5575((byte) -94))
			return 0;
		int i = 0;
		int i_81_ = 0;
		for (int i_82_ = 0; i_82_ < anObjectArray5205.length; i_82_++) {
			if (aClass467_5209.anIntArray5340[i_82_] > 0) {
				i += 100;
				i_81_ += method5562(i_82_, -2081223319);
			}
		}
		if (i == 0)
			return 100;
		int i_83_ = i_81_ * 100 / i;
		return i_83_;
	}

	public synchronized int method5597() {
		if (!method5575((byte) -103))
			return 0;
		int i = 0;
		int i_84_ = 0;
		for (int i_85_ = 0; i_85_ < anObjectArray5205.length; i_85_++) {
			if (aClass467_5209.anIntArray5340[i_85_] > 0) {
				i += 100;
				i_84_ += method5562(i_85_, -2142928869);
			}
		}
		if (i == 0)
			return 100;
		int i_86_ = i_84_ * 100 / i;
		return i_86_;
	}

	public int method5598() {
		if (!method5575((byte) -65))
			throw new IllegalStateException("");
		return 217760821 * aClass467_5209.anInt5342;
	}

	public synchronized int method5599(int i) {
		if (!method5605(i, (byte) 14))
			return 0;
		if (anObjectArray5205[i] != null)
			return 100;
		return aClass459_5213.method5511(i, (byte) 119);
	}

	public synchronized void method5600(int i) {
		if (method5605(i, (byte) 19)) {
			if (anObjectArrayArray5206 != null)
				anObjectArrayArray5206[i] = null;
		}
	}

	public void method5601(int i) {
		aClass459_5213.method5508(i, 163871860);
	}

	public boolean method5602(String string, int i) {
		int i_87_ = method5571("", -1212710749);
		if (-1 != i_87_)
			return method5576("", string, (byte) 16);
		return method5576(string, "", (byte) 16);
	}

	public synchronized int[] method5603(int i, byte i_88_) {
		if (!method5605(i, (byte) -105))
			return null;
		int[] is = aClass467_5209.anIntArrayArray5341[i];
		if (null == is) {
			is = new int[aClass467_5209.anIntArray5340[i]];
			for (int i_89_ = 0; i_89_ < is.length; i_89_++)
				is[i_89_] = i_89_;
		}
		return is;
	}

	public int method5604(int i) {
		if (!method5575((byte) -40))
			return -1;
		int i_90_ = aClass467_5209.aClass260_5325.method3610(i, 1426556621);
		if (!method5605(i_90_, (byte) -16))
			return -1;
		return i_90_;
	}

	synchronized boolean method5605(int i, byte i_91_) {
		if (!method5575((byte) -6))
			return false;
		if (i < 0 || i >= aClass467_5209.anIntArray5344.length || aClass467_5209.anIntArray5344[i] == 0) {
			if (aBool5214)
				throw new IllegalArgumentException(Integer.toString(i));
			return false;
		}
		return true;
	}

	synchronized boolean method5606() {
		if (null == aClass467_5209) {
			aClass467_5209 = aClass459_5213.method5505((byte) -4);
			if (aClass467_5209 == null)
				return false;
			anObjectArray5205 = new Object[aClass467_5209.anInt5333 * 608172963];
			anObjectArrayArray5206 = new Object[608172963 * aClass467_5209.anInt5333][];
		}
		return true;
	}

	public synchronized boolean method5607(int i, int i_92_) {
		if (!method5553(i, i_92_, -1588458397))
			return false;
		if (null != anObjectArrayArray5206[i] && null != anObjectArrayArray5206[i][i_92_])
			return true;
		if (anObjectArray5205[i] != null)
			return true;
		method5554(i, (byte) 108);
		if (anObjectArray5205[i] != null)
			return true;
		return false;
	}

	public int method5608(int i) {
		if (!method5575((byte) -34))
			return -1;
		int i_93_ = aClass467_5209.aClass260_5325.method3610(i, 1426556621);
		if (!method5605(i_93_, (byte) 92))
			return -1;
		return i_93_;
	}

	public synchronized byte[] method5609(String string, String string_94_, int i) {
		if (!method5575((byte) -21))
			return null;
		string = string.toLowerCase();
		string_94_ = string_94_.toLowerCase();
		int i_95_ = (aClass467_5209.aClass260_5325.method3610(Class616.method7336(string, 1792300414), 1426556621));
		if (!method5605(i_95_, (byte) 79))
			return null;
		int i_96_ = (aClass467_5209.aClass260Array5335[i_95_].method3610(Class616.method7336(string_94_, 1792300414), 1426556621));
		return method5556(i_95_, i_96_, (byte) 1);
	}

	static final int method5610(Class167 class167, Class647 class647, short i) {
		if (-1 != class647.anInt8366 * -1198548799)
			return -1198548799 * class647.anInt8366;
		if (-1 != class647.anInt8365 * 22125273) {
			Class164 class164 = class167.aClass174_1852.method2446(22125273 * class647.anInt8365, -971775134);
			if (!class164.aBool1820)
				return class164.aShort1831;
		}
		return class647.anInt8364 * 1648019033;
	}

	public static byte[] method5611(RSByteBuffer class536_sub33, int i, int i_97_) throws IOException {
		ByteArrayInputStream bytearrayinputstream = new ByteArrayInputStream(class536_sub33.buffer);
		bytearrayinputstream.skip((long) (class536_sub33.off * -810172525));
		return Class472.method5736(bytearrayinputstream, i, (byte) 56);
	}

	static final void method5612(Class668 class668, int i) {
		Class172.method2434(1783530653);
	}

	static final void method5613(Class668 class668, int i) {
		class668.anInt8542 -= 1472892954;
		int i_98_ = class668.anIntArray8541[class668.anInt8542 * 1867269829];
		int i_99_ = class668.anIntArray8541[1867269829 * class668.anInt8542 + 1];
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = i_98_ < i_99_ ? i_98_ : i_99_;
	}

	static final void method5614(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = -427454153 * Class61.anInt659;
	}
}
