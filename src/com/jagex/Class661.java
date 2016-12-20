/* Class661 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class661 implements Interface19 {
	Class346 aClass346_8514;

	public long method112(Class160 class160) {
		Long var_long = aClass346_8514.method6099((-1907167873 * (client.aClass678_11259.anInt8610) << 16 | class160.anInt1746 * 727971013), 365699351);
		if (var_long == null)
			return ((Long) class160.method2577((byte) 1)).longValue();
		return var_long.longValue();
	}

	public int method101(Class160 class160, int i) {
		Integer integer = aClass346_8514.method6101((-1907167873 * (client.aClass678_11259.anInt8610) << 16 | 727971013 * class160.anInt1746), (byte) 30);
		if (integer == null)
			return ((Integer) class160.method2577((byte) 1)).intValue();
		return integer.intValue();
	}

	public long method113(Class160 class160, byte i) {
		Long var_long = aClass346_8514.method6099((-1907167873 * (client.aClass678_11259.anInt8610) << 16 | class160.anInt1746 * 727971013), 724856938);
		if (var_long == null)
			return ((Long) class160.method2577((byte) 1)).longValue();
		return var_long.longValue();
	}

	public Object method106(Class160 class160, int i) {
		if (class160.aClass462_1748 != Class462.aClass462_5131)
			throw new IllegalArgumentException("");
		return aClass346_8514.method6104((-1907167873 * (client.aClass678_11259.anInt8610) << 16 | 727971013 * class160.anInt1746), 201422498);
	}

	public int method100(Class333 class333, short i) {
		return class333.method5839(method101(class333.aClass160_3626, 1096407173), (byte) 3);
	}

	public int method103(Class160 class160) {
		Integer integer = aClass346_8514.method6101((-1907167873 * (client.aClass678_11259.anInt8610) << 16 | 727971013 * class160.anInt1746), (byte) 22);
		if (integer == null)
			return ((Integer) class160.method2577((byte) 1)).intValue();
		return integer.intValue();
	}

	public void method110(Class160 class160, long l) {
		throw new UnsupportedOperationException();
	}

	public int method102(Class333 class333) {
		return class333.method5839(method101(class333.aClass160_3626, 1096407173), (byte) 3);
	}

	public void method109(Class333 class333, int i, int i_0_) {
		throw new UnsupportedOperationException();
	}

	Class661(Class346 class346) {
		aClass346_8514 = class346;
	}

	public void method122(Class160 class160, int i) {
		throw new UnsupportedOperationException();
	}

	public void method105(Class160 class160, int i, byte i_1_) {
		throw new UnsupportedOperationException();
	}

	public void method114(Class160 class160, long l) {
		throw new UnsupportedOperationException();
	}

	public long method108(Class160 class160) {
		Long var_long = aClass346_8514.method6099((-1907167873 * (client.aClass678_11259.anInt8610) << 16 | class160.anInt1746 * 727971013), -67736667);
		if (var_long == null)
			return ((Long) class160.method2577((byte) 1)).longValue();
		return var_long.longValue();
	}

	public int method104(Class160 class160) {
		Integer integer = aClass346_8514.method6101((-1907167873 * (client.aClass678_11259.anInt8610) << 16 | 727971013 * class160.anInt1746), (byte) 48);
		if (integer == null)
			return ((Integer) class160.method2577((byte) 1)).intValue();
		return integer.intValue();
	}

	public Object method115(Class160 class160) {
		if (class160.aClass462_1748 != Class462.aClass462_5131)
			throw new IllegalArgumentException("");
		return aClass346_8514.method6104((-1907167873 * (client.aClass678_11259.anInt8610) << 16 | 727971013 * class160.anInt1746), 336506916);
	}

	public Object method116(Class160 class160) {
		if (class160.aClass462_1748 != Class462.aClass462_5131)
			throw new IllegalArgumentException("");
		return aClass346_8514.method6104((-1907167873 * (client.aClass678_11259.anInt8610) << 16 | 727971013 * class160.anInt1746), -274547627);
	}

	public Object method117(Class160 class160) {
		if (class160.aClass462_1748 != Class462.aClass462_5131)
			throw new IllegalArgumentException("");
		return aClass346_8514.method6104((-1907167873 * (client.aClass678_11259.anInt8610) << 16 | 727971013 * class160.anInt1746), 989128055);
	}

	public void method118(Class160 class160, Object object) {
		throw new UnsupportedOperationException();
	}

	public void method119(Class333 class333, int i) {
		throw new UnsupportedOperationException();
	}

	public void method120(Class333 class333, int i) {
		throw new UnsupportedOperationException();
	}

	public void method107(Class160 class160, int i) {
		throw new UnsupportedOperationException();
	}

	public void method121(Class160 class160, int i) {
		throw new UnsupportedOperationException();
	}

	public void method111(Class160 class160, Object object, int i) {
		throw new UnsupportedOperationException();
	}

	static final void method11022(Class665 class665, int i) {
		int i_2_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		if (Class707.aBool8841) {
			Class704[] class704s = Class64.method1453(-1286166842);
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = class704s[i_2_].anInt8829 * -798340951;
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = -1159802239 * class704s[i_2_].anInt8827;
		} else {
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 0;
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 0;
		}
	}
}
