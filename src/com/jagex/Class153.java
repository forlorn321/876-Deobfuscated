/* Class153 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class153 implements Interface14 {
	public Class452 aClass452_1714 = Class452.aClass452_4952;
	public int anInt1715;
	public Class453 aClass453_1716;
	public Class458 aClass458_1717;
	public boolean aBool1718 = true;
	static int anInt1719;

	public Object method1855(byte i) {
		return aClass458_1717.method5493(this, 1956706202);
	}

	Class153(Class458 class458, int i) {
		aClass458_1717 = class458;
		anInt1715 = i * -1641977763;
	}

	boolean method1856() {
		if (null == aClass458_1717 || aClass453_1716 == null)
			return false;
		return true;
	}

	boolean method1857(byte i) {
		if (null == aClass458_1717 || aClass453_1716 == null)
			return false;
		return true;
	}

	public void method74(RSByteBuffer class536_sub33, int i) {
		for (;;) {
			int i_0_ = class536_sub33.readUnsignedByte();
			if (i_0_ == 0)
				break;
			Class144 class144 = ((Class144) Class682.method8091(Class518.method6330(-1935711188), i_0_, 1858049507));
			if (class144 != null) {
				switch (195626555 * class144.anInt1677) {
				case 3:
					aClass452_1714 = ((Class452) Class682.method8091(Class74.method1137(764544543), class536_sub33.readUnsignedByte(), 1858049507));
					break;
				case 4: {
					int i_1_ = class536_sub33.readUnsignedByte();
					aClass453_1716 = ((Class453) Class682.method8091(Class453.method5438((byte) 79), i_1_, 1858049507));
					if (aClass453_1716 == null)
						throw new IllegalStateException("");
					break;
				}
				case 5:
					Class682.method8091(Class34_Sub20.method10363(-1722009605), class536_sub33.readUnsignedByte(), 1858049507);
					break;
				default:
					throw new IllegalStateException("");
				case 6:
					break;
				case 1:
					aBool1718 = false;
					break;
				case 2:
					class536_sub33.readVersionedString();
				}
			} else
				method1858(class536_sub33, i_0_, -1091278725);
		}
	}

	public void method76(RSByteBuffer class536_sub33) {
		for (;;) {
			int i = class536_sub33.readUnsignedByte();
			if (i == 0)
				break;
			Class144 class144 = ((Class144) Class682.method8091(Class518.method6330(-1347896725), i, 1858049507));
			if (class144 != null) {
				switch (195626555 * class144.anInt1677) {
				case 3:
					aClass452_1714 = ((Class452) Class682.method8091(Class74.method1137(908933648), class536_sub33.readUnsignedByte(), 1858049507));
					break;
				case 4: {
					int i_2_ = class536_sub33.readUnsignedByte();
					aClass453_1716 = ((Class453) Class682.method8091(Class453.method5438((byte) 28), i_2_, 1858049507));
					if (aClass453_1716 == null)
						throw new IllegalStateException("");
					break;
				}
				case 5:
					Class682.method8091(Class34_Sub20.method10363(-370159668), class536_sub33.readUnsignedByte(), 1858049507);
					break;
				default:
					throw new IllegalStateException("");
				case 6:
					break;
				case 1:
					aBool1718 = false;
					break;
				case 2:
					class536_sub33.readVersionedString();
				}
			} else
				method1858(class536_sub33, i, -1091278725);
		}
	}

	abstract void method1858(RSByteBuffer class536_sub33, int i, int i_3_);

	abstract void method1859(RSByteBuffer class536_sub33, int i);

	abstract void method1860(RSByteBuffer class536_sub33, int i);

	boolean method1861() {
		if (null == aClass458_1717 || aClass453_1716 == null)
			return false;
		return true;
	}

	boolean method1862() {
		if (null == aClass458_1717 || aClass453_1716 == null)
			return false;
		return true;
	}

	abstract void method1863(RSByteBuffer class536_sub33, int i);

	public Object method1864() {
		return aClass458_1717.method5493(this, 1951411192);
	}

	static void method1865(int i) {
		Class575.aTwitchWebcamDeviceArray7674 = Class536_Sub42.aTwitchTV10811.GetWebcamDevices();
	}

	public static void method1866(int i, byte i_4_) {
		Class649_Sub1_Sub2_Sub1.anInt11973 = -738987877 * i;
		InterfaceDefinitions.aClass199_2694.method2884((byte) -68);
	}

	static final void method1867(InterfaceDefinitions class251, Class668 class668, byte i) {
		class668.anInt8542 -= 1472892954;
		int i_5_ = class668.anIntArray8541[class668.anInt8542 * 1867269829] - 1;
		int i_6_ = class668.anIntArray8541[1867269829 * class668.anInt8542 + 1];
		if (i_5_ < 0 || i_5_ > 9)
			throw new RuntimeException();
		Class99.method1325(class251, i_5_, i_6_, class668, 1193607769);
	}

	static final void method1868(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		InterfaceDefinitions class251 = class683.aClass251_8650;
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = class251.parentLayer * -1940204141;
	}

	public static final void method1869(String string, byte i) {
		if (Class360_Sub1.aClass94Array10168 != null) {
			Class106 class106 = Class536_Sub41.method9871(2077853800);
			Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.aClass414_4426, class106.aClass15_1258, 1760076756);
			class536_sub23.aClass536_Sub33_Sub2_10528.writeByte(Class555.method6802(string, 1774742804));
			class536_sub23.aClass536_Sub33_Sub2_10528.writeString(string);
			class106.method1409(class536_sub23, 1890482058);
		}
	}
}
