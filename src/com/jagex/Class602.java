/* Class602 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;
import java.util.LinkedList;

public class Class602 implements Iterable {
	PlayerSkill[] aClass630Array7854;
	Class635[] aClass635Array7855;
	public static Class34_Sub1 aClass34_Sub1_7856;
	public static JS5ResourceProvider aClass461_7857;

	public Iterator method7170() {
		return new Class632(aClass630Array7854);
	}

	public Iterator method7171() {
		return new Class632(aClass630Array7854);
	}

	void method7172(RSByteBuffer class536_sub33, int i) {
		for (;;) {
			int i_0_ = class536_sub33.readUnsignedByte();
			if (i_0_ == 0)
				break;
			if (i_0_ == 1) {
				int i_1_ = class536_sub33.readUnsignedByte();
				int i_2_ = 0;
				LinkedList linkedlist = new LinkedList();
				for (int i_3_ = 0; i_3_ < i_1_; i_3_++) {
					int i_4_ = class536_sub33.readUnsignedByte();
					int i_5_ = class536_sub33.readUnsignedShort();
					int i_6_ = class536_sub33.readUnsignedByte();
					int i_7_ = 0;
					Class635 class635 = Class635.aClass635_8267;
					byte i_8_ = 1;
					boolean bool = 0 != (i_6_ & 0x1);
					if (0 != (i_6_ & 0x2))
						i_7_ = class536_sub33.readUnsignedByte();
					if (0 != (i_6_ & 0x4))
						class635 = (aClass635Array7855[class536_sub33.readUnsignedByte()]);
					if ((i_6_ & 0x8) != 0)
						i_8_ = class536_sub33.readByte();
					boolean bool_9_ = class536_sub33.readUnsignedByte() == 1;
					linkedlist.add(new PlayerSkill(i_4_, i_5_, bool, bool_9_, i_7_, class635, i_8_));
					if (i_4_ > i_2_)
						i_2_ = i_4_;
				}
				aClass630Array7854 = new PlayerSkill[i_2_ + 1];
				Iterator iterator = linkedlist.iterator();
				while (iterator.hasNext()) {
					PlayerSkill class630 = (PlayerSkill) iterator.next();
					aClass630Array7854[class630.method7504(1316515273)] = class630;
				}
			} else if (2 == i_0_) {
				aClass635Array7855 = new Class635[class536_sub33.readUnsignedByte()];
				for (int i_10_ = class536_sub33.readUnsignedByte(); 255 != i_10_; i_10_ = class536_sub33.readUnsignedByte()) {
					int[] is = new int[class536_sub33.readUnsignedShort()];
					for (int i_11_ = 0; i_11_ < is.length; i_11_++)
						is[i_11_] = class536_sub33.readInt();
					aClass635Array7855[i_10_] = new Class635(is);
				}
			}
		}
	}

	public int method7173(int i) {
		return aClass630Array7854.length;
	}

	public PlayerSkill method7174(int i, byte i_12_) {
		return aClass630Array7854[i];
	}

	public Iterator iterator() {
		return new Class632(aClass630Array7854);
	}

	void method7175() {
		aClass630Array7854 = null;
	}

	void method7176(int i) {
		aClass630Array7854 = null;
	}

	void method7177() {
		aClass630Array7854 = null;
	}

	void method7178(byte[] is, byte i) {
		method7176(1850748161);
		if (null == is)
			aClass630Array7854 = new PlayerSkill[0];
		else
			method7172(new RSByteBuffer(is), -1215441965);
	}

	void method7179(byte[] is) {
		method7176(2028010544);
		if (null == is)
			aClass630Array7854 = new PlayerSkill[0];
		else
			method7172(new RSByteBuffer(is), -1215441965);
	}

	public Iterator method7180() {
		return new Class632(aClass630Array7854);
	}

	public Class602(JS5ResourceProvider class461) {
		method7178(class461.method5595((Class633.aClass633_8251.anInt8258 * -848473139), -1103783395), (byte) -16);
	}

	public int method7181() {
		return aClass630Array7854.length;
	}

	static final void method7182(Class668 class668, byte i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = ClientSetting.aClass536_Sub40_8843.groundDecorationSetting.method9931(436188784) ? 1 : 0;
	}

	static final void method7183(Class668 class668, int i) {
		int i_13_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		int i_14_ = i_13_ >> 14 & 0x3fff;
		int i_15_ = i_13_ & 0x3fff;
		Class598 class598 = client.aClass515_11066.method6255(-1339774333);
		i_14_ -= 1858049507 * class598.anInt7839;
		if (i_14_ < 0)
			i_14_ = 0;
		else if (i_14_ >= client.aClass515_11066.method6321((byte) 13))
			i_14_ = client.aClass515_11066.method6321((byte) 28);
		i_15_ -= 1479112045 * class598.anInt7840;
		if (i_15_ < 0)
			i_15_ = 0;
		else if (i_15_ >= client.aClass515_11066.method6243(177401017))
			i_15_ = client.aClass515_11066.method6243(177401017);
		client.anInt11082 = (256 + (i_14_ << 9)) * 1357893391;
		client.anInt11236 = (256 + (i_15_ << 9)) * -1216055859;
		Class246.anInt2474 = -1635204310;
		Class667.anInt8535 = 1594603721;
		Class658.anInt8498 = -662013517;
		client.aBool11242 = true;
	}
}
