/* Class205_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class205_Sub17 extends Class205 {
	int anInt9943;
	int anInt9944;
	int anInt9945;
	int anInt9946;
	int anInt9947;
	int anInt9948;
	public static Class34 aClass34_9949;

	public void method2940(int i) {
		Class193.aClass202Array2190[10542405 * anInt9943].method2922(0, -1418251701);
		Class193.aClass202Array2190[11984291 * anInt9944].method2922(1, 1267197941);
		client.anInt11192 = 0;
		client.anInt11182 = 2137507331 * anInt9945;
		client.anInt11122 = 0;
		client.anInt11054 = 1793185683 * anInt9947;
		client.anInt11318 = anInt9948 * 311641737;
		client.anInt11119 = 408425903;
		client.anInt11248 = anInt9946 * -904215725;
		Class246.anInt2474 = 1773175324;
		Class32.method792((byte) 0);
		client.aBool11159 = true;
	}

	Class205_Sub17(RSByteBuffer class536_sub33) {
		super(class536_sub33);
		anInt9943 = class536_sub33.readUnsignedShort() * -737333875;
		anInt9944 = class536_sub33.readUnsignedShort() * 1360870923;
		anInt9945 = class536_sub33.readUnsignedShort() * 325772475;
		anInt9946 = class536_sub33.readUnsignedShort() * 386357129;
		anInt9947 = class536_sub33.readUnsignedShort() * 1135314929;
		anInt9948 = class536_sub33.readUnsignedShort() * 1124567841;
	}

	public void method2942() {
		Class193.aClass202Array2190[10542405 * anInt9943].method2922(0, -74898889);
		Class193.aClass202Array2190[11984291 * anInt9944].method2922(1, -1423408159);
		client.anInt11192 = 0;
		client.anInt11182 = 2137507331 * anInt9945;
		client.anInt11122 = 0;
		client.anInt11054 = 1793185683 * anInt9947;
		client.anInt11318 = anInt9948 * 311641737;
		client.anInt11119 = 408425903;
		client.anInt11248 = anInt9946 * -904215725;
		Class246.anInt2474 = 1773175324;
		Class32.method792((byte) 0);
		client.aBool11159 = true;
	}

	public void method2943() {
		Class193.aClass202Array2190[10542405 * anInt9943].method2922(0, 907825683);
		Class193.aClass202Array2190[11984291 * anInt9944].method2922(1, 616975998);
		client.anInt11192 = 0;
		client.anInt11182 = 2137507331 * anInt9945;
		client.anInt11122 = 0;
		client.anInt11054 = 1793185683 * anInt9947;
		client.anInt11318 = anInt9948 * 311641737;
		client.anInt11119 = 408425903;
		client.anInt11248 = anInt9946 * -904215725;
		Class246.anInt2474 = 1773175324;
		Class32.method792((byte) 0);
		client.aBool11159 = true;
	}

	static final void method9088(int i) {
		RSBitBuffer class536_sub33_sub2 = client.aClass106_11322.byteBuffer;
		class536_sub33_sub2.initBitAccess();
		int localNPCSize = class536_sub33_sub2.readBits(8);
		if (localNPCSize < -664631943 * client.anInt11053) {
			for (int i_1_ = localNPCSize; i_1_ < -664631943 * client.anInt11053; i_1_++)
				client.anIntArray11059[(client.anInt11247 += -1573831137) * 537050591 - 1] = client.anIntArray11211[i_1_];
		}
		if (localNPCSize > -664631943 * client.anInt11053)
			throw new RuntimeException();
		client.anInt11053 = 0;
		for (int i_2_ = 0; i_2_ < localNPCSize; i_2_++) {
			int i_3_ = client.anIntArray11211[i_2_];
			NPC class649_sub1_sub5_sub1_sub1 = ((NPC) (((ObjectParam) client.aClass4_11050.method556((long) i_3_)).value));
			int needsRemove = class536_sub33_sub2.readBits(1);
			if (needsRemove == 0) {
				client.anIntArray11211[(client.anInt11053 += -1094331191) * -664631943 - 1] = i_3_;
				class649_sub1_sub5_sub1_sub1.anInt11934 = client.anInt11124 * 1266166429;
			} else {
				int i_5_ = class536_sub33_sub2.readBits(2);
				if (0 == i_5_) {
					client.anIntArray11211[(client.anInt11053 += -1094331191) * -664631943 - 1] = i_3_;
					class649_sub1_sub5_sub1_sub1.anInt11934 = client.anInt11124 * 1266166429;
					client.anIntArray11105[(client.anInt11055 += -1499013475) * 816748469 - 1] = i_3_;
				} else if (i_5_ == 1) {
					client.anIntArray11211[(client.anInt11053 += -1094331191) * -664631943 - 1] = i_3_;
					class649_sub1_sub5_sub1_sub1.anInt11934 = 1266166429 * client.anInt11124;
					Class679 class679 = ((Class679) Class682.method8091(Class392.method4866((byte) 51), class536_sub33_sub2.readBits(3), 1858049507));
					class649_sub1_sub5_sub1_sub1.method11066(class679, (Class680.aClass680_8639.aByte8644), -1192701979);
					int i_6_ = class536_sub33_sub2.readBits(1);
					if (1 == i_6_)
						client.anIntArray11105[((client.anInt11055 += -1499013475) * 816748469 - 1)] = i_3_;
				} else if (i_5_ == 2) {
					client.anIntArray11211[(client.anInt11053 += -1094331191) * -664631943 - 1] = i_3_;
					class649_sub1_sub5_sub1_sub1.anInt11934 = 1266166429 * client.anInt11124;
					if (class536_sub33_sub2.readBits(1) == 1) {
						Class679 class679 = ((Class679) (Class682.method8091(Class392.method4866((byte) -12), class536_sub33_sub2.readBits(3), 1858049507)));
						class649_sub1_sub5_sub1_sub1.method11066(class679, Class680.aClass680_8640.aByte8644, -1745853142);
						Class679 class679_7_ = ((Class679) (Class682.method8091(Class392.method4866((byte) 18), class536_sub33_sub2.readBits(3), 1858049507)));
						class649_sub1_sub5_sub1_sub1.method11066(class679_7_, Class680.aClass680_8640.aByte8644, -1366126180);
					} else {
						Class679 class679 = ((Class679) (Class682.method8091(Class392.method4866((byte) 19), class536_sub33_sub2.readBits(3), 1858049507)));
						class649_sub1_sub5_sub1_sub1.method11066(class679, Class680.aClass680_8638.aByte8644, -833110250);
					}
					int i_8_ = class536_sub33_sub2.readBits(1);
					if (i_8_ == 1)
						client.anIntArray11105[((client.anInt11055 += -1499013475) * 816748469 - 1)] = i_3_;
				} else if (i_5_ == 3)
					client.anIntArray11059[(client.anInt11247 += -1573831137) * 537050591 - 1] = i_3_;
			}
		}
	}

	static final void method9089(int i, int i_9_, byte i_10_) {
		Class101.anInt1205 = i * -1245738949;
		Class101.anInt1194 = i_9_ * 1934813789;
		Class101.aBool1206 = false;
		Class171.method2430((byte) 5);
	}
}
