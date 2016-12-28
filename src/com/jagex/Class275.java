/* Class275 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;

final class Class275 implements Interface29 {
	public static Class459_Sub1[] aClass459_Sub1Array3024;

	public long method168(String string, int i) {
		return Class30.method780(string, (byte) -24);
	}

	public long method170(String string) {
		return Class30.method780(string, (byte) -11);
	}

	public long method169(String string) {
		return Class30.method780(string, (byte) 1);
	}

	public long method167(String string) {
		return Class30.method780(string, (byte) -108);
	}

	static ItemEffects readItemEffects(ItemDecoder decoder, RSByteBuffer buffer, int version) {
		//i is always 2?
		ItemEffects effects = new ItemEffects(decoder);
		int i_1_ = buffer.readUnsignedByte();
		boolean bool = (i_1_ & 0x1) != 0;
		boolean bool_2_ = 0 != (i_1_ & 0x2);
		boolean recolour = (i_1_ & 0x4) != 0;
		boolean retexture = (i_1_ & 0x8) != 0;
		if (bool) {
			if (version <= 1) {
				effects.anIntArray149[0] = buffer.readUnsignedShort();
				effects.anIntArray152[0] = buffer.readUnsignedShort();
			} else {
				effects.anIntArray149[0] = buffer.readBigSmart();
				effects.anIntArray152[0] = buffer.readBigSmart();
			}
			if (-1 != decoder.maleEquip2 * 661594531 || -490119801 * decoder.femaleEquip2 != -1) {
				if (version <= 1) {
					effects.anIntArray149[1] = buffer.readUnsignedShort();
					effects.anIntArray152[1] = buffer.readUnsignedShort();
				} else {
					effects.anIntArray149[1] = buffer.readBigSmart();
					effects.anIntArray152[1] = buffer.readBigSmart();
				}
			}
			if (-1 != 1280785913 * decoder.maleEquipModelId3 || decoder.femaleEquipModelId3 * 835049345 != -1) {
				if (version <= 1) {
					effects.anIntArray149[2] = buffer.readUnsignedShort();
					effects.anIntArray152[2] = buffer.readUnsignedShort();
				} else {
					effects.anIntArray149[2] = buffer.readBigSmart();
					effects.anIntArray152[2] = buffer.readBigSmart();
				}
			}
		}
		if (bool_2_) {
			if (version <= 1) {
				effects.anIntArray153[0] = buffer.readUnsignedShort();
				effects.anIntArray154[0] = buffer.readUnsignedShort();
			} else {
				effects.anIntArray153[0] = buffer.readBigSmart();
				effects.anIntArray154[0] = buffer.readBigSmart();
			}
			if (-1 != decoder.anInt58 * -869646663 || decoder.anInt82 * 1550687287 != -1) {
				if (version <= 1) {
					effects.anIntArray153[1] = buffer.readUnsignedShort();
					effects.anIntArray154[1] = buffer.readUnsignedShort();
				} else {
					effects.anIntArray153[1] = buffer.readBigSmart();
					effects.anIntArray154[1] = buffer.readBigSmart();
				}
			}
		}
		if (recolour) {
			int colourHash = buffer.readUnsignedShort();
			int[] colours = new int[4];
			colours[0] = colourHash & 0xf;
			colours[1] = colourHash >> 4 & 0xf;
			colours[2] = colourHash >> 8 & 0xf;
			colours[3] = colourHash >> 12 & 0xf;
			for (int index = 0; index < 4; index++) {
				if (15 != colours[index])
					effects.modifiedColours[colours[index]] = (short) buffer.readUnsignedShort();
			}
		}
		if (retexture) {
			int textureHash = buffer.readUnsignedByte();
			int[] textures = new int[2];
			textures[0] = textureHash & 0xf;
			textures[1] = textureHash >> 4 & 0xf;
			for (int index = 0; index < 2; index++) {
				if (textures[index] != 15)
					effects.modifiedTextures[textures[index]] = (short) buffer.readUnsignedShort();
			}
		}
		return effects;
	}

	public static final void method3737(boolean bool, int i) {
		Class106[] class106s = client.aClass106Array11062;
		for (int i_9_ = 0; i_9_ < class106s.length; i_9_++) {
			Class106 class106 = class106s[i_9_];
			try {
				class106.method1408(1023015778);
			} catch (IOException ioexception) {
				/* empty */
			}
			class106.method1418(1639557232);
		}
		Class116.method1485(-1608060471);
		Class396.method4889(-1715467174);
		Class558.method6817(false, 902832405);
		client.aClass515_11066.method6259(-1732027393);
		client.aClass515_11066.method6258((byte) 0);
		client.aClass515_11066.method6262(1063724184);
		Class465_Sub1.method9387(-931943004);
		Class316.method4218(-1892364643);
		Class100.method1339(true, (short) 27545);
		Class595.method7134((byte) 1);
		Class141.method1712((short) 311);
		client.anInt11156 = -213831113;
		if (bool)
			Class673.method8026(4, -1798113843);
		else {
			Class673.method8026(16, -1798113843);
			try {
				Class25.method729(Class622.anApplet8126, "loggedout", -1773644883);
			} catch (Throwable throwable) {
				/* empty */
			}
		}
	}

	static final void method3738(Class668 class668, byte i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class63.aClass226_717.method3223(-569501258);
	}

	static final void method3739(Class668 class668, byte i) {
		if (Class331_Sub2.aClass549_10049.method6638(81, (byte) 0))
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 1;
		else
			class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
	}
}
