/* Class521_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class521_Sub1 extends Class521 {
	Class695 aClass695_10292 = new Class695();
	public Class546 aClass546_10293;

	public void method9327(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		Class521_Sub3 class521_sub3 = null;
		int i_4_ = 0;
		for (Class521_Sub3 class521_sub3_5_ = (Class521_Sub3) aClass695_10292.method8210(955702437); null != class521_sub3_5_; class521_sub3_5_ = (Class521_Sub3) aClass695_10292.method8219(-821443093)) {
			i_4_++;
			if (i == class521_sub3_5_.anInt10296 * -1602943443) {
				class521_sub3_5_.method9343(i, i_0_, i_1_, i_2_, (byte) 18);
				return;
			}
			if (-1602943443 * class521_sub3_5_.anInt10296 <= i)
				class521_sub3 = class521_sub3_5_;
		}
		if (null == class521_sub3) {
			if (i_4_ < Class644.aClass628_8352.anInt8198 * -505854741)
				aClass695_10292.method8212(new Class521_Sub3(i, i_0_, i_1_, i_2_), -1217255275);
		} else {
			Class214.method3083(new Class521_Sub3(i, i_0_, i_1_, i_2_), class521_sub3, 1565530564);
			if (i_4_ >= -505854741 * Class644.aClass628_8352.anInt8198)
				aClass695_10292.method8210(-634882605).method6354((byte) 44);
		}
	}

	public Class521_Sub3 method9328(int i, int i_6_) {
		Class521_Sub3 class521_sub3 = (Class521_Sub3) aClass695_10292.method8210(-1465455513);
		if (null == class521_sub3 || -1602943443 * class521_sub3.anInt10296 > i)
			return null;
		for (Class521_Sub3 class521_sub3_7_ = (Class521_Sub3) aClass695_10292.method8219(2139363366); (class521_sub3_7_ != null && class521_sub3_7_.anInt10296 * -1602943443 <= i); class521_sub3_7_ = (Class521_Sub3) aClass695_10292.method8219(235728063)) {
			class521_sub3.method6354((byte) -8);
			class521_sub3 = class521_sub3_7_;
		}
		if ((class521_sub3.anInt10299 * 1153557387 + -1602943443 * class521_sub3.anInt10296 + aClass546_10293.anInt7284 * 1748392441) > i)
			return class521_sub3;
		class521_sub3.method6354((byte) 1);
		return null;
	}

	public boolean method9329(int i) {
		return aClass695_10292.method8221(1360139595);
	}

	public void method9330(int i, int i_8_, int i_9_, int i_10_) {
		Class521_Sub3 class521_sub3 = null;
		int i_11_ = 0;
		for (Class521_Sub3 class521_sub3_12_ = (Class521_Sub3) aClass695_10292.method8210(-1222399764); null != class521_sub3_12_; class521_sub3_12_ = (Class521_Sub3) aClass695_10292.method8219(1920459718)) {
			i_11_++;
			if (i == class521_sub3_12_.anInt10296 * -1602943443) {
				class521_sub3_12_.method9343(i, i_8_, i_9_, i_10_, (byte) 18);
				return;
			}
			if (-1602943443 * class521_sub3_12_.anInt10296 <= i)
				class521_sub3 = class521_sub3_12_;
		}
		if (null == class521_sub3) {
			if (i_11_ < Class644.aClass628_8352.anInt8198 * -505854741)
				aClass695_10292.method8212(new Class521_Sub3(i, i_8_, i_9_, i_10_), -1217255275);
		} else {
			Class214.method3083(new Class521_Sub3(i, i_8_, i_9_, i_10_), class521_sub3, 354633841);
			if (i_11_ >= -505854741 * Class644.aClass628_8352.anInt8198)
				aClass695_10292.method8210(-378847006).method6354((byte) -11);
		}
	}

	public void method9331(int i, int i_13_, int i_14_, int i_15_) {
		Class521_Sub3 class521_sub3 = null;
		int i_16_ = 0;
		for (Class521_Sub3 class521_sub3_17_ = (Class521_Sub3) aClass695_10292.method8210(-1563200634); null != class521_sub3_17_; class521_sub3_17_ = (Class521_Sub3) aClass695_10292.method8219(1299020132)) {
			i_16_++;
			if (i == class521_sub3_17_.anInt10296 * -1602943443) {
				class521_sub3_17_.method9343(i, i_13_, i_14_, i_15_, (byte) 18);
				return;
			}
			if (-1602943443 * class521_sub3_17_.anInt10296 <= i)
				class521_sub3 = class521_sub3_17_;
		}
		if (null == class521_sub3) {
			if (i_16_ < Class644.aClass628_8352.anInt8198 * -505854741)
				aClass695_10292.method8212(new Class521_Sub3(i, i_13_, i_14_, i_15_), -1217255275);
		} else {
			Class214.method3083(new Class521_Sub3(i, i_13_, i_14_, i_15_), class521_sub3, 1532688014);
			if (i_16_ >= -505854741 * Class644.aClass628_8352.anInt8198)
				aClass695_10292.method8210(-1418990629).method6354((byte) -27);
		}
	}

	public Class521_Sub1(Class546 class546) {
		aClass546_10293 = class546;
	}

	public boolean method9332() {
		return aClass695_10292.method8221(1360139595);
	}

	static final void method9333(Class668 class668, int i) {
		class668.anInt8542 -= -1411037171;
	}
}
