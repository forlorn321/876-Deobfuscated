/* Class536_Sub18_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class536_Sub18_Sub16 extends Class536_Sub18 {
	public int anInt11795;
	public Object[] anObjectArray11796;
	public Class499[] aClass499Array11797;
	public int[] anIntArray11798;
	public int anInt11799;
	public Class570 aClass570_11800;
	public String aString11801;
	public int anInt11802;
	public int anInt11803;
	public int anInt11804;
	public int anInt11805;
	public Class4[] aClass4Array11806;
	Interface20 anInterface20_11807;

	Class499 method10786(RSByteBuffer class536_sub33, Class499[] class499s, int i) {
		int i_0_ = class536_sub33.readUnsignedShort((short) 21696);
		if (i_0_ < 0 || i_0_ >= class499s.length)
			throw new RuntimeException("");
		Class499 class499 = class499s[i_0_];
		return class499;
	}

	void method10787(RSByteBuffer class536_sub33, int i, Class499 class499, byte i_1_) {
		int i_2_ = aClass499Array11797.length;
		if (Class499.aClass499_5566 == class499 || Class499.aClass499_6519 == class499) {
			Class458 class458 = ((Class458) Class682.method8091(Class458.method5497((byte) 14), class536_sub33.readUnsignedByte(-1606860894), 1858049507));
			int i_3_ = class536_sub33.readUnsignedShort((short) -18540);
			if (anObjectArray11796 == null)
				anObjectArray11796 = new Object[i_2_];
			anObjectArray11796[i] = anInterface20_11807.method124(class458, i_3_, 323730415);
			if (null == anIntArray11798)
				anIntArray11798 = new int[i_2_];
			anIntArray11798[i] = class536_sub33.readUnsignedByte(-1682856040);
		} else if (class499 == Class499.aClass499_5570) {
			Class478 class478 = ((Class478) Class682.method8091(Class478.method5757((byte) -31), class536_sub33.readUnsignedByte(895602021), 1858049507));
			switch (class478.anInt5383 * -1645921193) {
			case 0:
				if (anIntArray11798 == null)
					anIntArray11798 = new int[i_2_];
				class499 = Class499.aClass499_6448;
				anIntArray11798[i] = class536_sub33.readInt(-173221853);
				break;
			case 2:
				if (null == anObjectArray11796)
					anObjectArray11796 = new Object[i_2_];
				anObjectArray11796[i] = class536_sub33.readString((byte) 93).intern();
				break;
			case 3:
				if (null == anObjectArray11796)
					anObjectArray11796 = new Object[i_2_];
				class499 = Class499.aClass499_5600;
				anObjectArray11796[i] = Long.valueOf(class536_sub33.method9711(702869087));
				break;
			default:
				throw new RuntimeException();
			}
		} else if (class499 == Class499.aClass499_5568 || Class499.aClass499_5569 == class499) {
			int i_4_ = class536_sub33.readUnsignedShort((short) -2840);
			if (null == anObjectArray11796)
				anObjectArray11796 = new Object[i_2_];
			anObjectArray11796[i] = anInterface20_11807.method123(i_4_, -1018286558);
			if (null == anIntArray11798)
				anIntArray11798 = new int[i_2_];
			anIntArray11798[i] = class536_sub33.readUnsignedByte(-1562495251);
		} else {
			if (null == anIntArray11798)
				anIntArray11798 = new int[i_2_];
			if (class499 != null && class499.aBool6358)
				anIntArray11798[i] = class536_sub33.readInt(-1444450787);
			else
				anIntArray11798[i] = class536_sub33.readUnsignedByte(1881954336);
		}
		aClass499Array11797[i] = class499;
	}

	public Class536_Sub18_Sub16(RSByteBuffer class536_sub33, Interface20 interface20) {
		anInterface20_11807 = interface20;
		int i = method10788(class536_sub33, 1596818605);
		int i_5_ = 0;
		Class499[] class499s = Class480.method5827(-1746575393);
		while (-810172525 * class536_sub33.off < i) {
			Class499 class499 = method10786(class536_sub33, class499s, 705573640);
			method10787(class536_sub33, i_5_, class499, (byte) 1);
			i_5_++;
		}
	}

	int method10788(RSByteBuffer class536_sub33, int i) {
		class536_sub33.off = 516175515 * (class536_sub33.buffer.length - 2);
		int i_6_ = class536_sub33.readUnsignedShort((short) 10643);
		int i_7_ = class536_sub33.buffer.length - 2 - i_6_ - 16;
		class536_sub33.off = 516175515 * i_7_;
		int i_8_ = class536_sub33.readInt(-740277310);
		anInt11795 = class536_sub33.readUnsignedShort((short) -9144) * 756272105;
		anInt11799 = class536_sub33.readUnsignedShort((short) 19829) * -2144602595;
		anInt11802 = class536_sub33.readUnsignedShort((short) 76) * -698386297;
		anInt11803 = class536_sub33.readUnsignedShort((short) 18565) * -1864917601;
		anInt11804 = class536_sub33.readUnsignedShort((short) 1215) * -1768934361;
		anInt11805 = class536_sub33.readUnsignedShort((short) -685) * -563611559;
		int i_9_ = class536_sub33.readUnsignedByte(-843649701);
		if (i_9_ > 0) {
			aClass4Array11806 = new Class4[i_9_];
			for (int i_10_ = 0; i_10_ < i_9_; i_10_++) {
				int i_11_ = class536_sub33.readUnsignedShort((short) 24585);
				Class4 class4 = new Class4(Class528.method6434(i_11_, -1769342731));
				aClass4Array11806[i_10_] = class4;
				while (i_11_-- > 0) {
					int i_12_ = class536_sub33.readInt(-510481363);
					int i_13_ = class536_sub33.readInt(110256294);
					class4.method560(new Class536_Sub26(i_13_), (long) i_12_);
				}
			}
		}
		class536_sub33.off = 0;
		aString11801 = class536_sub33.method9713(16509697);
		aClass499Array11797 = new Class499[i_8_];
		return i_7_;
	}
}
