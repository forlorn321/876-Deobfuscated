/* Class563 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;
import java.net.Socket;

public abstract class Class563 {
	public abstract boolean method9465(int i) throws IOException;

	public abstract boolean method9466(int i, byte i_0_) throws IOException;

	public abstract int method9467() throws IOException;

	public abstract void method9468(byte[] is, int i, int i_1_) throws IOException;

	public abstract void method9469(byte[] is, int i, int i_2_, byte i_3_) throws IOException;

	public abstract void method9470(byte i);

	public abstract void method9471(int i);

	Class563() {
		/* empty */
	}

	public abstract int method9472(byte[] is, int i, int i_4_, int i_5_) throws IOException;

	public abstract int method9473(int i) throws IOException;

	public abstract int method9474(byte[] is, int i, int i_6_) throws IOException;

	public abstract void method9475();

	public abstract void method9476();

	public static Class563 method9477(Socket socket, int i) throws IOException {
		return new Class563_Sub1(socket, i);
	}

	public static Class563 method9478(Socket socket, int i) throws IOException {
		return new Class563_Sub1(socket, i);
	}

	public abstract void method9479();

	public abstract void method9480();

	static final void method9481(Class665 class665, byte i) {
		int i_7_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		if (Class183.aClass240Array2100[i_7_] == null)
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = 0;
		else
			class665.anIntArray8525[(class665.anInt8526 += 102380841) * 1769813785 - 1] = Class183.aClass240Array2100[i_7_].aClass243Array2392.length;
	}

	static void method9482(int i, int i_8_, Class243 class243, Class142 class142, int i_9_, int i_10_, short i_11_) {
		int i_12_ = 351100807 * Class105.anInt1300;
		int[] is = Class105.anIntArray1301;
		for (int i_13_ = 0; i_13_ < i_12_; i_13_++) {
			Class640_Sub1_Sub2_Sub1_Sub2 class640_sub1_sub2_sub1_sub2 = client.aClass640_Sub1_Sub2_Sub1_Sub2Array11161[is[i_13_]];
			if (null != class640_sub1_sub2_sub1_sub2 && class640_sub1_sub2_sub1_sub2.method18883((byte) 3) && !class640_sub1_sub2_sub1_sub2.aClass614_12196.method10173((byte) 94) && (class640_sub1_sub2_sub1_sub2 != Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937) && (class640_sub1_sub2_sub1_sub2.aByte10864 == (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.aByte10864))) {
				Class442 class442 = (class640_sub1_sub2_sub1_sub2.method10637().aClass442_4927);
				int i_14_ = (int) class442.aFloat4918 / 128 - i / 128;
				int i_15_ = (int) class442.aFloat4919 / 128 - i_8_ / 128;
				boolean bool = false;
				for (int i_16_ = 0; i_16_ < client.anInt11261 * -67152419; i_16_++) {
					Class69 class69 = client.aClass69Array11297[i_16_];
					if (class640_sub1_sub2_sub1_sub2.aString12179.equals(class69.aString776) && 0 != -62014255 * class69.anInt774) {
						bool = true;
						break;
					}
				}
				boolean bool_17_ = false;
				for (int i_18_ = 0; i_18_ < Class695_Sub3.anInt10976 * -2075991457; i_18_++) {
					if (class640_sub1_sub2_sub1_sub2.aString12179.equals(Class679.aClass104Array8629[i_18_].aString1290)) {
						bool_17_ = true;
						break;
					}
				}
				boolean bool_19_ = false;
				if ((Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.anInt12201 * 1874064063) != 0 && (1874064063 * class640_sub1_sub2_sub1_sub2.anInt12201 != 0) && (class640_sub1_sub2_sub1_sub2.anInt12201 * 1874064063 == (Class381.aClass640_Sub1_Sub2_Sub1_Sub2_3937.anInt12201) * 1874064063))
					bool_19_ = true;
				if (class640_sub1_sub2_sub1_sub2.aClass633_12183 != null && -1 != (class640_sub1_sub2_sub1_sub2.aClass633_12183.anInt8271) * 1032231511 && ((Class295) (Class381.aClass24_Sub9_3936.method81(1032231511 * (class640_sub1_sub2_sub1_sub2.aClass633_12183.anInt8271), -1474592543))).aBool3347)
					Class527_Sub8.method16062(class243, class142, i_9_, i_10_, i_14_, i_15_, Class49.aClass147Array507[1], 251097033);
				else if (Class210.aClass210_2248 == class640_sub1_sub2_sub1_sub2.aClass210_12185)
					Class527_Sub8.method16062(class243, class142, i_9_, i_10_, i_14_, i_15_, Class49.aClass147Array507[8], 1064169361);
				else if (Class210.aClass210_2249 == class640_sub1_sub2_sub1_sub2.aClass210_12185)
					Class527_Sub8.method16062(class243, class142, i_9_, i_10_, i_14_, i_15_, Class49.aClass147Array507[6], 2031403748);
				else if (bool_19_)
					Class527_Sub8.method16062(class243, class142, i_9_, i_10_, i_14_, i_15_, Class49.aClass147Array507[4], -1472491202);
				else if (class640_sub1_sub2_sub1_sub2.aBool12180)
					Class527_Sub8.method16062(class243, class142, i_9_, i_10_, i_14_, i_15_, Class49.aClass147Array507[7], 738385956);
				else if (bool)
					Class527_Sub8.method16062(class243, class142, i_9_, i_10_, i_14_, i_15_, Class49.aClass147Array507[3], 1099337098);
				else if (bool_17_)
					Class527_Sub8.method16062(class243, class142, i_9_, i_10_, i_14_, i_15_, Class49.aClass147Array507[5], -555481835);
				else
					Class527_Sub8.method16062(class243, class142, i_9_, i_10_, i_14_, i_15_, Class49.aClass147Array507[2], -1504430995);
			}
		}
	}

	static final void method9483(Class665 class665, int i) {
		int i_20_ = (class665.anIntArray8525[(class665.anInt8526 -= 102380841) * 1769813785]);
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = -1133624367 * (class665.aClass527_Sub21_8537.aClass345Array10485[i_20_].anInt3698);
	}
}
