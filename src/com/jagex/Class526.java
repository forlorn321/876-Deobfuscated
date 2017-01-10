/* Class526 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;
import java.util.LinkedList;

public class Class526 {
	int anInt7098;
	int anInt7099;
	static int anInt7100 = 0;
	int[] anIntArray7101;
	int[] anIntArray7102;
	public MeshRasterizer aClass177_7103;
	LinkedList aLinkedList7104;
	boolean aBool7105;

	MeshRasterizer method6413(GraphicalRenderer class167, int i) {
		RSMesh class180 = RSMesh.decodeMesh(Class602.aClass461_7857, anInt7099 * -1415147279, 0);
		if (null == class180)
			return null;
		if (class180.anInt1949 < 13)
			class180.upscale(2);
		return class167.createMeshRasterizer(class180, 2048, anInt7100 * 92183755, 64, 768);
	}

	public void method6414(Class553 class553, byte i) {
		if (null != class553 && anInt7098 * 463774109 > 0) {
			method6416(class553, (byte) 8);
			Iterator iterator = aLinkedList7104.iterator();
			while (iterator.hasNext()) {
				Class649_Sub1_Sub5_Sub5 class649_sub1_sub5_sub5 = (Class649_Sub1_Sub5_Sub5) iterator.next();
				class553.method6711(class649_sub1_sub5_sub5, false, 657720158);
			}
			aBool7105 = true;
		}
	}

	public void method6415(Class553 class553, byte i) {
		if (class553 != null && aLinkedList7104 != null) {
			Iterator iterator = aLinkedList7104.iterator();
			while (iterator.hasNext()) {
				Class649_Sub1_Sub5_Sub5 class649_sub1_sub5_sub5 = (Class649_Sub1_Sub5_Sub5) iterator.next();
				class553.method6719(class649_sub1_sub5_sub5.aByte10839, class649_sub1_sub5_sub5.aShort11867, class649_sub1_sub5_sub5.aShort11865, new Class534(class649_sub1_sub5_sub5), 1786205371);
			}
		}
	}

	void method6416(Class553 class553, byte i) {
		aLinkedList7104 = new LinkedList();
		Class455 class455 = client.aClass515_11066.method6251(1668536334);
		Class598 class598 = client.aClass515_11066.method6255(-1328432919);
		Class598 class598_0_ = new Class598(-989431627 * Class320.anInt3539, anIntArray7101[0], anIntArray7102[0]);
		for (int i_1_ = 1; i_1_ < 463774109 * anInt7098; i_1_++) {
			Class598 class598_2_ = new Class598(Class320.anInt3539 * -989431627, anIntArray7101[i_1_], anIntArray7102[i_1_]);
			while ((1858049507 * class598_0_.anInt7839 != class598_2_.anInt7839 * 1858049507) || (class598_0_.anInt7840 * 1479112045 != class598_2_.anInt7840 * 1479112045)) {
				if (class598_0_.anInt7839 * 1858049507 < class598_2_.anInt7839 * 1858049507)
					class598_0_.anInt7839 += -1634969653;
				else if (class598_0_.anInt7839 * 1858049507 > 1858049507 * class598_2_.anInt7839)
					class598_0_.anInt7839 -= -1634969653;
				if (class598_0_.anInt7840 * 1479112045 < 1479112045 * class598_2_.anInt7840)
					class598_0_.anInt7840 += 734518373;
				else if (1479112045 * class598_0_.anInt7840 > class598_2_.anInt7840 * 1479112045)
					class598_0_.anInt7840 -= 734518373;
				int i_3_ = -989431627 * Class320.anInt3539;
				int i_4_ = (1858049507 * class598_0_.anInt7839 - class598.anInt7839 * 1858049507);
				int i_5_ = (1479112045 * class598_0_.anInt7840 - class598.anInt7840 * 1479112045);
				if (i_4_ >= 0 && i_4_ < 937313339 * class553.anInt7428 && i_5_ >= 0 && i_5_ < class553.anInt7464 * 1965060689) {
					int i_6_ = (i_4_ << 9) + 256;
					int i_7_ = (i_5_ << 9) + 256;
					if (class455.method5466(i_4_, i_5_, (byte) -14))
						i_3_++;
					aLinkedList7104.add(new Class649_Sub1_Sub5_Sub5(class553, this, Class320.anInt3539 * -989431627, i_3_, i_6_, Class54.method944(i_6_, i_7_, (-989431627 * (Class320.anInt3539)), 1333442962), i_7_));
				}
			}
			class598_0_ = class598_2_;
		}
	}

	public void method6417(byte i) {
		aBool7105 = false;
		aClass177_7103 = null;
	}

	public boolean method6418(byte i) {
		return aBool7105;
	}

	public boolean method6419(GraphicalRenderer class167, int i) {
		aClass177_7103 = method6413(class167, 293058415);
		return aClass177_7103 != null;
	}

	public boolean method6420() {
		return aBool7105;
	}

	public Class526(GraphicalRenderer class167, RSByteBuffer class536_sub33, int i) {
		anInt7099 = i * -1661575151;
		anInt7098 = class536_sub33.method9717(1138181829) * -436081483;
		anIntArray7101 = new int[anInt7098 * 463774109];
		anIntArray7102 = new int[463774109 * anInt7098];
		int i_8_ = class536_sub33.readUnsignedShort();
		int i_9_ = class536_sub33.readUnsignedShort();
		for (int i_10_ = 0; i_10_ < anInt7098 * 463774109; i_10_++) {
			anIntArray7101[i_10_] = i_8_ + class536_sub33.readByte();
			anIntArray7102[i_10_] = i_9_ + class536_sub33.readByte();
		}
		aClass177_7103 = method6413(class167, 1477212954);
	}

	public void method6421() {
		aBool7105 = false;
		aClass177_7103 = null;
	}

	static final void method6422(Class668 class668, boolean bool, int i) {
		int i_11_ = class668.anIntArray8537[class668.anInt8564 * -1640738851];
		class668.anInt8542 -= 1472892954;
		int i_12_ = class668.anIntArray8541[1867269829 * class668.anInt8542];
		int i_13_ = class668.anIntArray8541[1 + 1867269829 * class668.anInt8542];
		if (i_12_ < 0 || i_12_ >= class668.anIntArray8539[i_11_])
			throw new RuntimeException();
		class668.anIntArrayArray8536[i_11_][i_12_] = i_13_;
		if (bool)
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = i_13_;
	}

	static final void method6423(Class668 class668, int i) {
		class668.anInt8542 -= -1287325605;
		int i_14_ = class668.anIntArray8541[class668.anInt8542 * 1867269829];
		int i_15_ = (class668.anIntArray8541[1 + 1867269829 * class668.anInt8542] << 1);
		int i_16_ = class668.anIntArray8541[2 + class668.anInt8542 * 1867269829];
		int i_17_ = class668.anIntArray8541[class668.anInt8542 * 1867269829 + 3];
		int i_18_ = class668.anIntArray8541[4 + 1867269829 * class668.anInt8542];
		int i_19_ = class668.anIntArray8541[5 + 1867269829 * class668.anInt8542];
		int i_20_ = class668.anIntArray8541[6 + class668.anInt8542 * 1867269829];
		if (i_14_ >= 0 && i_14_ < 2 && null != client.anIntArrayArrayArray11117[i_14_] && i_15_ >= 0 && i_15_ < client.anIntArrayArrayArray11117[i_14_].length) {
			client.anIntArrayArrayArray11117[i_14_][i_15_] = new int[] { (i_16_ >> 14 & 0x3fff) << 9, i_17_ << 2, (i_16_ & 0x3fff) << 9, i_20_ };
			client.anIntArrayArrayArray11117[i_14_][1 + i_15_] = new int[] { (i_18_ >> 14 & 0x3fff) << 9, i_19_ << 2, (i_18_ & 0x3fff) << 9 };
		}
	}

	static final void method6424(Class668 class668, int i) {
		ClientSetting.aClass536_Sub40_8843.method9857((ClientSetting.aClass536_Sub40_8843.aClass710_Sub33_10762), (class668.anIntArray8541[((class668.anInt8542 -= -1411037171) * 1867269829)]), (byte) 1);
		Class27.method763(2145957622);
		client.aBool11026 = true;
	}
}
