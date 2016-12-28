/* Class672 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class672 {
	public static Class672 aClass672_8576;
	static Class672 aClass672_8577;
	static Class672 aClass672_8578 = new Class672();
	static int anInt8579;

	static {
		aClass672_8576 = new Class672();
		aClass672_8577 = new Class672();
	}

	Class672() {
		/* empty */
	}

	static final boolean method8023(int i, byte i_0_) {
		return i < 7;
	}

	static final void method8024(int i, int i_1_, int i_2_, int i_3_, int i_4_, boolean bool, boolean bool_5_, int i_6_) {
		if (!bool && (i_1_ < 512 || i_2_ < 512 || i_1_ > (client.aClass515_11066.method6321((byte) 16) - 2) * 512 || i_2_ > (client.aClass515_11066.method6243(177401017) - 2) * 512)) {
			float[] fs = client.aFloatArray11133;
			client.aFloatArray11133[1] = -1.0F;
			fs[0] = -1.0F;
		} else {
			int i_7_ = Class54.method944(i_1_, i_2_, i, 1956055866) - i_4_;
			client.aClass433_11110.method5190(Class677.aClass167_8609.method2100());
			client.aClass433_11110.method5200((float) i_3_, 0.0F, 0.0F);
			Class677.aClass167_8609.method2099(client.aClass433_11110);
			if (bool)
				Class677.aClass167_8609.method2017((float) i_1_, (float) i_7_, (float) i_2_, client.aFloatArray11133);
			else
				Class677.aClass167_8609.method2130((float) i_1_, (float) i_7_, (float) i_2_, client.aFloatArray11133);
			client.aClass433_11110.method5200((float) -i_3_, 0.0F, 0.0F);
			Class677.aClass167_8609.method2099(client.aClass433_11110);
			if (!bool_5_) {
				client.aFloatArray11133[0] -= (float) (-1829303381 * client.anInt11283);
				client.aFloatArray11133[1] -= (float) (-134988647 * client.anInt11284);
			}
		}
	}

	public static final void method8025(int i, boolean bool, byte i_8_) {
		if (null != Class646.aClass536_Sub15_8361 && (i >= 0 && i < (Class646.aClass536_Sub15_8361.anInt10482 * 1494047173))) {
			ClanMember class349 = Class646.aClass536_Sub15_8361.members[i];
			Class106 class106 = Class536_Sub41.method9871(2077853800);
			Class536_Sub23 class536_sub23 = Class213.method3075(OutgoingPacket.aClass414_4522, class106.aClass15_1258, 889229786);
			class536_sub23.aClass536_Sub33_Sub2_10528.writeByte(3 + Class555.method6802(class349.username, 1665491456));
			class536_sub23.aClass536_Sub33_Sub2_10528.writeShort(i, -1778059594);
			class536_sub23.aClass536_Sub33_Sub2_10528.writeByte(bool ? 1 : 0);
			class536_sub23.aClass536_Sub33_Sub2_10528.writeString(class349.username);
			class106.method1409(class536_sub23, 877143203);
		}
	}
}
