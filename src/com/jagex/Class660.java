/* Class660 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class660 implements Interface19 {
	ClanSettings aClass350_8505;

	public void method106(Class324 class324, int i) {
		throw new UnsupportedOperationException();
	}

	public int method99(Class153 class153, int i) {
		Integer integer = aClass350_8505.method4599((273023065 * (client.aClass670_11043.anInt8567) << 16 | class153.anInt1715 * -1786401803), 1189197950);
		if (integer == null)
			return ((Integer) class153.method1855((byte) -93)).intValue();
		return integer.intValue();
	}

	public void method121(Class324 class324, int i) {
		throw new UnsupportedOperationException();
	}

	public int method97(Class153 class153) {
		Integer integer = aClass350_8505.method4599((273023065 * (client.aClass670_11043.anInt8567) << 16 | class153.anInt1715 * -1786401803), 1379500454);
		if (integer == null)
			return ((Integer) class153.method1855((byte) -102)).intValue();
		return integer.intValue();
	}

	public int method96(Class324 class324, int i) {
		return class324.method4263(method99(class324.aClass153_3555, 1616025799), (byte) 12);
	}

	public Object method116(Class153 class153) {
		if (class153.aClass453_1716 != Class453.aClass453_5084)
			throw new IllegalArgumentException("");
		return aClass350_8505.method4601(((client.aClass670_11043.anInt8567 * 273023065) << 16 | class153.anInt1715 * -1786401803), -1943471146);
	}

	public void method119(Class153 class153, long l) {
		throw new UnsupportedOperationException();
	}

	public void method105(Class153 class153, Object object, int i) {
		throw new UnsupportedOperationException();
	}

	public void method107(Class324 class324, int i, byte i_0_) {
		throw new UnsupportedOperationException();
	}

	public long method108(Class153 class153) {
		Long var_long = aClass350_8505.method4600(((client.aClass670_11043.anInt8567 * 273023065) << 16 | -1786401803 * class153.anInt1715), 1591965685);
		if (null == var_long)
			return ((Long) class153.method1855((byte) -15)).longValue();
		return var_long.longValue();
	}

	public int method98(Class153 class153) {
		Integer integer = aClass350_8505.method4599((273023065 * (client.aClass670_11043.anInt8567) << 16 | class153.anInt1715 * -1786401803), 987402843);
		if (integer == null)
			return ((Integer) class153.method1855((byte) -124)).intValue();
		return integer.intValue();
	}

	public int method95(Class324 class324) {
		return class324.method4263(method99(class324.aClass153_3555, 1987326172), (byte) 12);
	}

	public void method109(Class153 class153, int i) {
		throw new UnsupportedOperationException();
	}

	public void method113(Class153 class153, int i) {
		throw new UnsupportedOperationException();
	}

	public void method111(Class153 class153, int i) {
		throw new UnsupportedOperationException();
	}

	public void method112(Class153 class153, int i) {
		throw new UnsupportedOperationException();
	}

	public void method115(Class153 class153, int i) {
		throw new UnsupportedOperationException();
	}

	public long method102(Class153 class153, int i) {
		Long var_long = aClass350_8505.method4600(((client.aClass670_11043.anInt8567 * 273023065) << 16 | -1786401803 * class153.anInt1715), 336477041);
		if (null == var_long)
			return ((Long) class153.method1855((byte) -89)).longValue();
		return var_long.longValue();
	}

	public long method114(Class153 class153) {
		Long var_long = aClass350_8505.method4600(((client.aClass670_11043.anInt8567 * 273023065) << 16 | -1786401803 * class153.anInt1715), 1325361635);
		if (null == var_long)
			return ((Long) class153.method1855((byte) -19)).longValue();
		return var_long.longValue();
	}

	public void method110(Class153 class153, long l) {
		throw new UnsupportedOperationException();
	}

	public void method120(Class153 class153, Object object) {
		throw new UnsupportedOperationException();
	}

	public Object method117(Class153 class153) {
		if (class153.aClass453_1716 != Class453.aClass453_5084)
			throw new IllegalArgumentException("");
		return aClass350_8505.method4601(((client.aClass670_11043.anInt8567 * 273023065) << 16 | class153.anInt1715 * -1786401803), -1943471146);
	}

	public Object method104(Class153 class153, byte i) {
		if (class153.aClass453_1716 != Class453.aClass453_5084)
			throw new IllegalArgumentException("");
		return aClass350_8505.method4601(((client.aClass670_11043.anInt8567 * 273023065) << 16 | class153.anInt1715 * -1786401803), -1943471146);
	}

	public void method103(Class153 class153, Object object) {
		throw new UnsupportedOperationException();
	}

	public Object method118(Class153 class153) {
		if (class153.aClass453_1716 != Class453.aClass453_5084)
			throw new IllegalArgumentException("");
		return aClass350_8505.method4601(((client.aClass670_11043.anInt8567 * 273023065) << 16 | class153.anInt1715 * -1786401803), -1943471146);
	}

	Class660(ClanSettings class350) {
		aClass350_8505 = class350;
	}

	public void method101(Class153 class153, int i, int i_1_) {
		throw new UnsupportedOperationException();
	}

	public void method100(Class153 class153, Object object) {
		throw new UnsupportedOperationException();
	}

	static void method7971(Class668 class668, int i) {
		QuestTypeDecoder class277 = ((QuestTypeDecoder) Class38.aClass53_Sub2_481.method70((class668.anIntArray8541[((class668.anInt8542 -= -1411037171) * 1867269829)]), (byte) -11));
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = (null == class277.anIntArrayArray3037 ? 0 : class277.anIntArrayArray3037.length);
	}

	static String unpackHuffmanString(RSByteBuffer buffer, int i) {
		String string;
		try {
			int i_3_ = buffer.readUnsignedSmart();
			if (i_3_ > i)
				i_3_ = i;
			byte[] is = new byte[i_3_];
			buffer.off += (Class266.huffman.method3769((buffer.buffer), (-810172525 * (buffer.off)), is, 0, i_3_, 377832910) * 516175515);
			String string_4_ = Class202.method2925(is, 0, i_3_, -1694498816);
			string = string_4_;
		} catch (Exception exception) {
			return "Cabbage";
		}
		return string;
	}
}
