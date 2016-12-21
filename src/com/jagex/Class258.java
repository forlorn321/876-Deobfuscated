/* Class258 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Class258 implements Interface43 {
	int anInt2766;
	boolean[] aBoolArray2767;
	int anInt2768;
	boolean aBool2769;
	int anInt2770;
	Interface45 anInterface45_2771;
	int anInt2772;
	Class369 aClass369_2773;
	Class380 aClass380_2774;
	Class364 aClass364_2775;
	boolean aBool2776;
	Class235 aClass235_2777;
	int anInt2778;
	float aFloat2779;
	int anInt2780;
	int anInt2781;
	Class235 aClass235_2782;
	Class239[] aClass239Array2783;
	Class240[] aClass240Array2784;
	Class253[] aClass253Array2785;
	Class235 aClass235_2786;
	Class235 aClass235_2787;
	List aList2788;
	int anInt2789;
	int anInt2790;
	int anInt2791;
	Class235[] aClass235Array2792;
	Class235 aClass235_2793;
	List aList2794;
	int anInt2795;
	Class235 aClass235_2796;
	int anInt2797;
	boolean[] aBoolArray2798;
	int[] anIntArray2799;
	int[] anIntArray2800;
	boolean aBool2801;
	int anInt2802;
	int anInt2803;
	int[] anIntArray2804;
	int anInt2805;
	List aList2806;
	boolean aBool2807;
	Class235[] aClass235Array2808;
	AtomicReference anAtomicReference2809;
	int anInt2810;
	boolean[] aBoolArray2811;
	int anInt2812;
	int anInt2813;
	boolean aBool2814;
	int anInt2815;
	int anInt2816;
	int anInt2817;
	int anInt2818;
	int anInt2819;
	List aList2820;
	Class238[] aClass238Array2821;
	List aList2822 = new ArrayList();
	int anInt2823;
	int anInt2824;
	Class235[] aClass235Array2825;
	boolean aBool2826;
	int anInt2827;
	static List aList2828 = new ArrayList();
	int anInt2829;
	byte[] aByteArray2830;
	int anInt2831;
	static Class199 aClass199_2832 = new Class199(524288, 1024);
	RSByteBuffer aClass536_Sub33_2833;
	boolean[] aBoolArray2834;
	boolean[] aBoolArray2835;

	public void method310(RSByteBuffer class536_sub33) {
		if (method289() == Class369.aClass369_3873 || method289() == Class369.aClass369_3874) {
			if (class536_sub33 != null)
				class536_sub33.method9685(120764410);
		} else if (class536_sub33 == null) {
			boolean bool = aBool2826 && (anInt2818 > 0 && anInt2819 < anInt2818 || anInt2818 < 0);
			if (aList2806.isEmpty()) {
				if (!bool) {
					method3564();
					method3546(Class369.aClass369_3874);
				}
			} else if (!bool) {
				method3564();
				method3546(Class369.aClass369_3873);
			}
			if (bool)
				method3554(true);
		} else
			method3570(class536_sub33);
	}

	public void method300(boolean bool) {
		if (!bool)
			method296();
		else if (method289() == Class369.aClass369_3874) {
			method3554(true);
			method3546(Class369.aClass369_3875);
		}
	}

	public void method296() {
		if (method289() != Class369.aClass369_3871) {
			method3554(false);
			method3546(Class369.aClass369_3870);
		} else {
			method3554(false);
			method3546(Class369.aClass369_3869);
		}
	}

	public Class369 method289() {
		return aClass369_2773;
	}

	void method3546(Class369 class369) {
		aClass369_2773 = class369;
	}

	public void method290(Interface45 interface45) {
		anInterface45_2771 = interface45;
	}

	public void method63(RSByteBuffer class536_sub33) {
		if (method289() == Class369.aClass369_3873 || method289() == Class369.aClass369_3874) {
			if (class536_sub33 != null)
				class536_sub33.method9685(120764410);
		} else if (class536_sub33 == null) {
			boolean bool = aBool2826 && (anInt2818 > 0 && anInt2819 < anInt2818 || anInt2818 < 0);
			if (aList2806.isEmpty()) {
				if (!bool) {
					method3564();
					method3546(Class369.aClass369_3874);
				}
			} else if (!bool) {
				method3564();
				method3546(Class369.aClass369_3873);
			}
			if (bool)
				method3554(true);
		} else
			method3570(class536_sub33);
	}

	public void method295() {
		if (method289() == Class369.aClass369_3869 || method289() == Class369.aClass369_3870 || method289() == Class369.aClass369_3875) {
			method3546(Class369.aClass369_3871);
			method3555();
		}
	}

	public void method307(int i, Class380 class380, Class364 class364, int i_0_) {
		anInt2797 = i_0_;
		if (method3548(i, class380, class364)) {
			aClass380_2774 = class380;
			aClass364_2775 = class364;
		} else
			throw new RuntimeException("");
	}

	public void method326(boolean bool, int i, int i_1_, int i_2_) {
		aBool2826 = bool;
		anInt2818 = i;
		anInt2831 = i_1_;
		anInt2778 = i_2_;
	}

	public int method298(int i) {
		return i * (method291().anInt3933 * 2067142005 / 8);
	}

	int method3547(float f) {
		int i = (int) (f * 32767.0F);
		if (i > 32767)
			return 32767;
		if (i < -32768)
			return -32768;
		return i;
	}

	public void method293(int i, Class380 class380, Class364 class364, int i_3_) {
		anInt2797 = i_3_;
		if (method3548(i, class380, class364)) {
			aClass380_2774 = class380;
			aClass364_2775 = class364;
		} else
			throw new RuntimeException("");
	}

	boolean method3548(int i, Class380 class380, Class364 class364) {
		if (class380 == Class380.aClass380_3930)
			return true;
		if (class380 == Class380.aClass380_3928)
			return true;
		if (class380 == Class380.aClass380_3931)
			return true;
		if (class380 == Class380.aClass380_3929)
			return true;
		return false;
	}

	int method3549() {
		if (aBool2776)
			return anInt2816;
		throw new RuntimeException("");
	}

	public int method262() {
		if (aBool2776)
			return method3549() < anInt2797 ? anInt2797 : method3549();
		throw new RuntimeException("");
	}

	public synchronized boolean method315() {
		return aBool2769;
	}

	synchronized void method3550(boolean bool) {
		aBool2769 = bool;
	}

	Class235[] method3551(int i, int i_4_) {
		Class235[] class235s = new Class235[i];
		for (int i_5_ = 0; i_5_ < class235s.length; i_5_++)
			class235s[i_5_] = method3552(i_4_);
		return class235s;
	}

	Class235 method3552(int i) {
		synchronized (aClass199_2832) {
			Object object = null;
			Class235 class235 = (Class235) aClass199_2832.method2888(-365121745);
			Class235 class235_6_ = null;
			int i_7_ = i;
			for (/**/; class235 != null; class235 = (Class235) aClass199_2832.method2889((byte) 13)) {
				if (class235.aFloatArray2382.length > i && !class235.aBool2383 && (class235_6_ == null || class235.aFloatArray2382.length < i_7_)) {
					class235_6_ = class235;
					i_7_ = class235_6_.aFloatArray2382.length;
				}
				if (class235.aFloatArray2382.length == i && !class235.aBool2383)
					break;
			}
			if (class235 == null)
				class235 = class235_6_;
			if (class235 == null) {
				class235 = new Class235(this);
				int i_8_ = 0;
				boolean bool = false;
				while (!bool && i_8_ < 1000) {
					if (aClass199_2832.method2886((long) i_8_) != null)
						i_8_++;
					else
						bool = true;
				}
				class235.anInt2385 = i_8_;
				float[] fs = new float[i];
				class235.aFloatArray2382 = fs;
				class235.aBool2383 = true;
				class235.anInt2384 = i;
				if (aClass199_2832.method2885(-1869066143) >= i * 4) {
					/* empty */
				}
				aClass199_2832.method2882(class235, (long) class235.anInt2385, fs.length * 4, (byte) 123);
			} else {
				for (int i_9_ = 0; i_9_ < class235.aFloatArray2382.length; i_9_++)
					class235.aFloatArray2382[i_9_] = 0.0F;
				class235.anInt2384 = i;
			}
			class235.aBool2383 = true;
			Class235 class235_10_ = class235;
			return class235_10_;
		}
	}

	void method3553(Class235[] class235s) {
		if (class235s != null) {
			for (int i = 0; i < class235s.length; i++)
				method3575(class235s[i]);
		}
	}

	synchronized void method3554(boolean bool) {
		if (!bool) {
			anInt2780 = 0;
			anInt2781 = 0;
			aBoolArray2767 = null;
			anIntArray2804 = null;
			method3553(aClass235Array2825);
			aClass235Array2825 = null;
			method3553(aClass235Array2808);
			aClass235Array2808 = null;
			anInt2789 = 0;
			anInt2790 = 0;
			aBoolArray2811 = null;
			method3553(aClass235Array2792);
			aClass235Array2792 = null;
			method3575(aClass235_2793);
			method3575(aClass235_2787);
			method3575(aClass235_2782);
			method3575(aClass235_2777);
			method3575(aClass235_2786);
			method3575(aClass235_2796);
			aClass235_2793 = null;
			aClass235_2787 = null;
			aClass235_2782 = null;
			aClass235_2777 = null;
			aClass235_2786 = null;
			aClass235_2796 = null;
			anIntArray2799 = null;
			anIntArray2800 = null;
		}
		anInt2766 = 0;
		Iterator iterator = aList2794.iterator();
		while (iterator.hasNext()) {
			RSByteBuffer class536_sub33 = (RSByteBuffer) iterator.next();
			class536_sub33.method9685(120764410);
		}
		aList2794.clear();
		aBool2801 = false;
		if (aClass536_Sub33_2833 != null) {
			synchronized (aClass536_Sub33_2833) {
				aClass536_Sub33_2833.method9685(120764410);
				aClass536_Sub33_2833 = null;
			}
		}
		anInt2829 = 0;
		anInt2805 = 0;
		if (!bool) {
			synchronized (aList2806) {
				Iterator iterator_11_ = aList2806.iterator();
				while (iterator_11_.hasNext()) {
					RSByteBuffer class536_sub33 = (RSByteBuffer) iterator_11_.next();
					class536_sub33.method9685(120764410);
				}
				aList2806.clear();
			}
			anInt2827 = 0;
		}
		synchronized (aList2822) {
			Iterator iterator_12_ = aList2822.iterator();
			while (iterator_12_.hasNext()) {
				RSByteBuffer class536_sub33 = (RSByteBuffer) iterator_12_.next();
				class536_sub33.method9685(120764410);
			}
			aList2822.clear();
		}
		aBool2807 = false;
		anInt2810 = 0;
		anInt2813 = -1;
		anInt2817 = -1;
		if (!bool) {
			method3550(false);
			aBool2776 = false;
			anInt2831 = -1;
			anInt2778 = -1;
			anInt2818 = 0;
			anInt2819 = 0;
			anInt2772 = -1;
			anInt2812 = -1;
			anInt2815 = -1;
			anInt2823 = -1;
			aBool2814 = false;
			aBool2826 = false;
		} else {
			anInt2819++;
			aBool2814 = true;
		}
	}

	void method3555() {
		if (method289() != Class369.aClass369_3873) {
			method3569();
			if (method289() == Class369.aClass369_3871)
				method3546(Class369.aClass369_3875);
		}
	}

	void method3556(RSByteBuffer class536_sub33) {
		aList2794.add(class536_sub33);
	}

	boolean method3557() {
		return aBool2801;
	}

	boolean method3558(RSByteBuffer class536_sub33) {
		if (class536_sub33.readUnsignedByte() != 79 || class536_sub33.readUnsignedByte() != 103 || class536_sub33.readUnsignedByte() != 103 || class536_sub33.readUnsignedByte() != 83)
			return false;
		return true;
	}

	boolean method3559(byte[] is, int i, int i_13_) {
		if (is[i] != i_13_)
			return false;
		if (is[i + 1] != 118 || is[i + 2] != 111 || is[i + 3] != 114 || is[i + 4] != 98 || is[i + 5] != 105 || is[i + 6] != 115)
			return false;
		return true;
	}

	float method3560(int i) {
		int i_14_ = i & 0x1fffff;
		int i_15_ = i & ~0x7fffffff;
		int i_16_ = (i & 0x7fe00000) >> 21;
		if (i_15_ != 0)
			i_14_ = -i_14_;
		return (float) ((double) i_14_ * Math.pow(2.0, (double) (i_16_ - 788)));
	}

	int method3561() {
		return anInt2791;
	}

	int method3562() {
		return anInt2802;
	}

	public int method316(int i) {
		return i / (method291().anInt3933 * 2067142005 / 8);
	}

	int method3563(int i) {
		int i_17_ = 0;
		int i_18_ = 0;
		int i_19_;
		for (/**/; i >= 8 - anInt2802; i -= i_19_) {
			i_19_ = 8 - anInt2802;
			int i_20_ = (1 << i_19_) - 1;
			i_17_ += (aByteArray2830[anInt2791] >> anInt2802 & i_20_) << i_18_;
			anInt2802 = 0;
			anInt2791++;
			i_18_ += i_19_;
		}
		if (i > 0) {
			i_19_ = (1 << i) - 1;
			i_17_ += (aByteArray2830[anInt2791] >> anInt2802 & i_19_) << i_18_;
			anInt2802 += i;
		}
		return i_17_;
	}

	void method3564() {
		aByteArray2830 = null;
	}

	void method3565() {
		int i = method3563(8) + 1;
		Iterator iterator = aList2828.iterator();
		while (iterator.hasNext()) {
			Class255 class255 = (Class255) iterator.next();
			if (class255.anInt2761 == 0 && class255.anInt2759 == 0) {
				if (class255.aClass253Array2758.length == i && class255.anInt2756 == anInt2816 && class255.anInt2757 == anInt2795 && class255.anInt2760 == anInt2803) {
					aClass253Array2785 = class255.aClass253Array2758;
					for (int i_21_ = 0; i_21_ < aClass253Array2785.length; i_21_++)
						aClass253Array2785[i_21_].method3525(this);
					return;
				}
			}
		}
		aClass253Array2785 = new Class253[i];
		for (int i_22_ = 0; i_22_ < i; i_22_++) {
			if (aClass253Array2785[i_22_] == null)
				aClass253Array2785[i_22_] = new Class253();
			aClass253Array2785[i_22_].method3526(this);
		}
		Class255 class255 = new Class255(anInt2816, anInt2795, anInt2768, anInt2770, anInt2803, aClass253Array2785);
		aList2828.add(class255);
	}

	void method3566(byte[] is, int i) {
		anInt2766 = 0;
		if (!method315()) {
			if (is == null)
				throw new RuntimeException("");
			int i_23_ = 0;
			if (method3559(is, i, 1))
				i_23_ = 1;
			else if (method3559(is, i, 3))
				i_23_ = 3;
			else if (method3559(is, i, 5))
				i_23_ = 5;
			else
				throw new RuntimeException(new StringBuilder().append("").append(i_23_).toString());
			if (i_23_ == 1) {
				method3581(is, i + 7);
				int i_24_ = method3563(32);
				anInt2816 = method3563(8);
				anInt2795 = method3563(32);
				anInt2768 = method3563(32);
				anInt2803 = method3563(32);
				anInt2770 = method3563(32);
				anInt2780 = 1 << method3563(4);
				anInt2781 = 1 << method3563(4);
				int i_25_ = 1 << method3563(1);
				if (i_24_ != 0 || i_25_ == 0)
					throw new RuntimeException("");
				aBool2776 = true;
				anInt2813++;
			} else if (i_23_ != 3 && i_23_ == 5) {
				if (!method3559(is, i, 5))
					throw new RuntimeException("");
				method3581(is, i + 7);
				if (aClass235Array2792 != null) {
					method3553(aClass235Array2792);
					aClass235Array2792 = null;
				}
				aClass235Array2792 = method3551(anInt2816, anInt2781);
				for (int i_26_ = 0; i_26_ < 2; i_26_++) {
					int i_27_ = i_26_ != 0 ? anInt2781 : anInt2780;
					int i_28_ = i_27_ >> 1;
					int i_29_ = i_27_ >> 2;
					int i_30_ = i_27_ >> 3;
					Class235 class235 = method3552(i_28_);
					for (int i_31_ = 0; i_31_ < i_29_; i_31_++) {
						class235.aFloatArray2382[2 * i_31_] = (float) Math.cos((double) (4 * i_31_) * 3.141592653589793 / (double) i_27_);
						class235.aFloatArray2382[2 * i_31_ + 1] = -(float) Math.sin((double) (4 * i_31_) * 3.141592653589793 / (double) i_27_);
					}
					Class235 class235_32_ = method3552(i_28_);
					for (int i_33_ = 0; i_33_ < i_29_; i_33_++) {
						class235_32_.aFloatArray2382[2 * i_33_] = (float) Math.cos((double) (2 * i_33_ + 1) * 3.141592653589793 / (double) (2 * i_27_));
						class235_32_.aFloatArray2382[2 * i_33_ + 1] = (float) Math.sin((double) (2 * i_33_ + 1) * 3.141592653589793 / (double) (2 * i_27_));
					}
					Class235 class235_34_ = method3552(i_29_);
					for (int i_35_ = 0; i_35_ < i_30_; i_35_++) {
						class235_34_.aFloatArray2382[2 * i_35_] = (float) Math.cos((double) (4 * i_35_ + 2) * 3.141592653589793 / (double) i_27_);
						class235_34_.aFloatArray2382[2 * i_35_ + 1] = -(float) Math.sin((double) (4 * i_35_ + 2) * 3.141592653589793 / (double) i_27_);
					}
					int[] is_36_ = new int[i_30_];
					int i_37_ = Class98_Sub1.method8392(i_30_ - 1, (byte) 22);
					for (int i_38_ = 0; i_38_ < i_30_; i_38_++)
						is_36_[i_38_] = Class519.method6336(i_38_, i_37_, -1578181434);
					if (i_26_ != 0) {
						aClass235_2777 = class235;
						aClass235_2786 = class235_32_;
						aClass235_2796 = class235_34_;
						anIntArray2800 = is_36_;
					} else {
						aClass235_2793 = class235;
						aClass235_2787 = class235_32_;
						aClass235_2782 = class235_34_;
						anIntArray2799 = is_36_;
					}
				}
				method3565();
				int i_39_ = method3563(6) + 1;
				for (int i_40_ = 0; i_40_ < i_39_; i_40_++)
					method3563(16);
				i_39_ = method3563(6) + 1;
				if (aClass239Array2783 == null || aClass239Array2783.length != i_39_)
					aClass239Array2783 = new Class239[i_39_];
				for (int i_41_ = 0; i_41_ < i_39_; i_41_++) {
					if (aClass239Array2783[i_41_] == null)
						aClass239Array2783[i_41_] = new Class239();
					aClass239Array2783[i_41_].method3362(this, anInt2816);
				}
				int i_42_ = method3563(6) + 1;
				if (aClass240Array2784 == null || aClass240Array2784.length != i_42_)
					aClass240Array2784 = new Class240[i_42_];
				for (int i_43_ = 0; i_43_ < i_42_; i_43_++) {
					if (aClass240Array2784[i_43_] == null)
						aClass240Array2784[i_43_] = new Class240();
					aClass240Array2784[i_43_].method3380(this);
				}
				int i_44_ = method3563(6) + 1;
				if (aClass238Array2821 == null || aClass238Array2821.length != i_44_)
					aClass238Array2821 = new Class238[i_44_];
				for (int i_45_ = 0; i_45_ < i_44_; i_45_++) {
					if (aClass238Array2821[i_45_] == null)
						aClass238Array2821[i_45_] = new Class238();
					aClass238Array2821[i_45_].method3359(this);
				}
				int i_46_ = method3563(6) + 1;
				aBoolArray2767 = new boolean[i_46_];
				anIntArray2804 = new int[i_46_];
				for (int i_47_ = 0; i_47_ < i_46_; i_47_++) {
					aBoolArray2767[i_47_] = method3590() != 0;
					method3563(16);
					method3563(16);
					anIntArray2804[i_47_] = method3563(8);
				}
				method3550(true);
			}
		}
	}

	int method3567(int i) {
		int i_48_ = 0;
		for (/**/; i > 0; i >>= 1)
			i_48_++;
		return i_48_;
	}

	RSByteBuffer method3568(int i) {
		return new RSByteBuffer(i, true);
	}

	void method3569() {
		if (method289() != Class369.aClass369_3869 && method289() != Class369.aClass369_3872 && (!aBool2769 || !((float) (anInt2827 / method3574()) > aFloat2779))) {
			if (!method3557()) {
				RSByteBuffer class536_sub33 = ((RSByteBuffer) (aList2822 != null && !aList2822.isEmpty() ? aList2822.get(0) : null));
				if (class536_sub33 == null) {
					if (!aBool2807) {
						method3546(Class369.aClass369_3872);
						anInterface45_2771.method332((byte) -24);
						aBool2807 = true;
					}
					return;
				}
				aBool2807 = false;
				aBool2801 = true;
				aList2822.remove(0);
				method3556(class536_sub33);
			}
			method3594();
		}
	}

	synchronized void method3570(RSByteBuffer class536_sub33) {
		aList2822.add(class536_sub33);
		method3546(Class369.aClass369_3875);
	}

	public void method321(int i, Class380 class380, Class364 class364, int i_49_) {
		anInt2797 = i_49_;
		if (method3548(i, class380, class364)) {
			aClass380_2774 = class380;
			aClass364_2775 = class364;
		} else
			throw new RuntimeException("");
	}

	int method3571(float f) {
		int i = (int) (f * 127.0F);
		if (i > 127)
			return 127;
		if (i < -128)
			return -128;
		return i;
	}

	int method3572(float f) {
		int i = (int) (f * 127.0F + 128.0F);
		if (i > 255)
			return 255;
		if (i < 0)
			return 0;
		return i;
	}

	RSByteBuffer method3573(int i) {
		RSByteBuffer class536_sub33 = method3568(method298(i));
		int i_50_ = i;
		synchronized (aList2806) {
			while (!aList2806.isEmpty()) {
				RSByteBuffer class536_sub33_51_ = (RSByteBuffer) aList2806.remove(0);
				anInt2827 -= (method173(class536_sub33_51_.off * -810172525) / method262());
				int i_52_ = method298(i_50_);
				int i_53_ = (class536_sub33_51_.off * -810172525 < i_52_ ? class536_sub33_51_.off * -810172525 : i_52_);
				class536_sub33.method9696(class536_sub33_51_.buffer, 0, i_53_, (byte) 49);
				i_50_ -= method173(i_53_);
				int i_54_ = class536_sub33_51_.off * -810172525 - i_53_;
				if (i_54_ != 0) {
					System.arraycopy(class536_sub33_51_.buffer, i_53_, class536_sub33_51_.buffer, 0, i_54_);
					class536_sub33_51_.off = i_54_ * 516175515;
					anInt2827 += method173(i_54_) / method262();
					aList2806.add(0, class536_sub33_51_);
				} else
					class536_sub33_51_.method9685(120764410);
				if (i_50_ <= 0)
					break;
			}
			if (aList2806.isEmpty() && method289() == Class369.aClass369_3873)
				method3546(Class369.aClass369_3874);
		}
		return class536_sub33;
	}

	public void method327(boolean bool, int i, int i_55_, int i_56_) {
		aBool2826 = bool;
		anInt2818 = i;
		anInt2831 = i_55_;
		anInt2778 = i_56_;
	}

	int method3574() {
		if (method315())
			return anInt2795;
		throw new RuntimeException("");
	}

	public void method323(boolean bool, int i, int i_57_, int i_58_) {
		aBool2826 = bool;
		anInt2818 = i;
		anInt2831 = i_57_;
		anInt2778 = i_58_;
	}

	public void method301(boolean bool) {
		if (!bool)
			method296();
		else if (method289() == Class369.aClass369_3874) {
			method3554(true);
			method3546(Class369.aClass369_3875);
		}
	}

	public void method277() {
		if (method289() != Class369.aClass369_3871) {
			method3554(false);
			method3546(Class369.aClass369_3870);
		} else {
			method3554(false);
			method3546(Class369.aClass369_3869);
		}
	}

	public Class369 method303() {
		return aClass369_2773;
	}

	public Class369 method311() {
		return aClass369_2773;
	}

	void method3575(Class235 class235) {
		if (class235 != null) {
			synchronized (aClass199_2832) {
				class235.aBool2383 = false;
			}
		}
	}

	public void method305(Interface45 interface45) {
		anInterface45_2771 = interface45;
	}

	public void method306(Interface45 interface45) {
		anInterface45_2771 = interface45;
	}

	public int method173(int i) {
		return i / (method291().anInt3933 * 2067142005 / 8);
	}

	public void method309(RSByteBuffer class536_sub33) {
		if (method289() == Class369.aClass369_3873 || method289() == Class369.aClass369_3874) {
			if (class536_sub33 != null)
				class536_sub33.method9685(120764410);
		} else if (class536_sub33 == null) {
			boolean bool = aBool2826 && (anInt2818 > 0 && anInt2819 < anInt2818 || anInt2818 < 0);
			if (aList2806.isEmpty()) {
				if (!bool) {
					method3564();
					method3546(Class369.aClass369_3874);
				}
			} else if (!bool) {
				method3564();
				method3546(Class369.aClass369_3873);
			}
			if (bool)
				method3554(true);
		} else
			method3570(class536_sub33);
	}

	public int method302() {
		if (aBool2776)
			return method3549() < anInt2797 ? anInt2797 : method3549();
		throw new RuntimeException("");
	}

	public void method308() {
		if (method289() == Class369.aClass369_3869 || method289() == Class369.aClass369_3870 || method289() == Class369.aClass369_3875) {
			method3546(Class369.aClass369_3871);
			method3555();
		}
	}

	public RSByteBuffer method312(int i) {
		RSByteBuffer class536_sub33 = method3573(i);
		return class536_sub33;
	}

	public int method292() {
		return method3580();
	}

	public int method297() {
		return method3580();
	}

	int method3576(float f) {
		int i = (int) (f * 32767.0F + 32768.0F);
		if (i > 65535)
			return 65535;
		if (i < 0)
			return 0;
		return i;
	}

	public int method320(int i) {
		return i / (method291().anInt3933 * 2067142005 / 8);
	}

	int method3577() {
		if (aBool2776)
			return anInt2816;
		throw new RuntimeException("");
	}

	public int method314() {
		return method3580();
	}

	int method3578() {
		int i = aByteArray2830[anInt2791] >> anInt2802 & 0x1;
		anInt2802++;
		anInt2791 += anInt2802 >> 3;
		anInt2802 &= 0x7;
		return i;
	}

	int method3579() {
		if (aBool2776)
			return anInt2816;
		throw new RuntimeException("");
	}

	public Class364 method319() {
		return aClass364_2775;
	}

	public int method324() {
		if (aBool2776)
			return method3549() < anInt2797 ? anInt2797 : method3549();
		throw new RuntimeException("");
	}

	public synchronized boolean method325() {
		return aBool2769;
	}

	int method3580() {
		return anInt2827;
	}

	void method3581(byte[] is, int i) {
		aByteArray2830 = is;
		anInt2791 = i;
		anInt2802 = 0;
	}

	public void method304(Interface45 interface45) {
		anInterface45_2771 = interface45;
	}

	void method3582() {
		if (method289() != Class369.aClass369_3873) {
			method3569();
			if (method289() == Class369.aClass369_3871)
				method3546(Class369.aClass369_3875);
		}
	}

	void method3583() {
		if (method289() != Class369.aClass369_3873) {
			method3569();
			if (method289() == Class369.aClass369_3871)
				method3546(Class369.aClass369_3875);
		}
	}

	public Class380 method291() {
		return aClass380_2774;
	}

	public void method328(RSByteBuffer class536_sub33) {
		if (method289() == Class369.aClass369_3873 || method289() == Class369.aClass369_3874) {
			if (class536_sub33 != null)
				class536_sub33.method9685(120764410);
		} else if (class536_sub33 == null) {
			boolean bool = aBool2826 && (anInt2818 > 0 && anInt2819 < anInt2818 || anInt2818 < 0);
			if (aList2806.isEmpty()) {
				if (!bool) {
					method3564();
					method3546(Class369.aClass369_3874);
				}
			} else if (!bool) {
				method3564();
				method3546(Class369.aClass369_3873);
			}
			if (bool)
				method3554(true);
		} else
			method3570(class536_sub33);
	}

	boolean method3584(byte[] is, int i, int i_59_, AtomicReference atomicreference) {
		if (is == null)
			throw new RuntimeException("");
		if (i + i_59_ > is.length)
			return false;
		method3581(is, i);
		int i_60_ = method3590();
		if (i_60_ != 0) {
			method3566(is, i);
			return false;
		}
		if (!method315())
			throw new RuntimeException();
		int i_61_ = method3563(method3567(anIntArray2804.length - 1));
		boolean bool = aBoolArray2767[i_61_];
		int i_62_ = bool ? anInt2781 : anInt2780;
		boolean bool_63_ = false;
		boolean bool_64_ = false;
		if (bool) {
			bool_63_ = method3590() != 0;
			bool_64_ = method3590() != 0;
		}
		int i_65_ = i_62_ >> 1;
		int i_66_;
		int i_67_;
		int i_68_;
		if (bool && !bool_63_) {
			i_66_ = (i_62_ >> 2) - (anInt2780 >> 2);
			i_67_ = (i_62_ >> 2) + (anInt2780 >> 2);
			i_68_ = anInt2780 >> 1;
		} else {
			i_66_ = 0;
			i_67_ = i_65_;
			i_68_ = i_62_ >> 1;
		}
		int i_69_;
		int i_70_;
		int i_71_;
		if (bool && !bool_64_) {
			i_69_ = i_62_ - (i_62_ >> 2) - (anInt2780 >> 2);
			i_70_ = i_62_ - (i_62_ >> 2) + (anInt2780 >> 2);
			i_71_ = anInt2780 >> 1;
		} else {
			i_69_ = i_65_;
			i_70_ = i_62_;
			i_71_ = i_62_ >> 1;
		}
		Class238 class238 = aClass238Array2821[anIntArray2804[i_61_]];
		if (aBoolArray2798 == null || aBoolArray2798.length != anInt2816) {
			aBoolArray2798 = new boolean[anInt2816];
			aBoolArray2834 = new boolean[anInt2816];
		}
		for (int i_72_ = 0; i_72_ < anInt2816; i_72_++) {
			int i_73_ = (class238.anIntArray2428 != null ? class238.anIntArray2428[i_72_] : 0);
			int i_74_ = i_73_;
			int i_75_ = class238.anIntArray2429[i_74_];
			aBoolArray2798[i_72_] = !aClass239Array2783[i_75_].method3369(i_72_);
			aBoolArray2834[i_72_] = aBoolArray2798[i_72_];
		}
		for (int i_76_ = 0; i_76_ < class238.anInt2424; i_76_++) {
			if (!aBoolArray2798[class238.anIntArray2430[i_76_]] || !aBoolArray2798[class238.anIntArray2423[i_76_]]) {
				aBoolArray2798[class238.anIntArray2430[i_76_]] = false;
				aBoolArray2798[class238.anIntArray2423[i_76_]] = false;
			}
		}
		if (aBoolArray2835 == null || aBoolArray2835.length != anInt2816)
			aBoolArray2835 = new boolean[anInt2816];
		for (int i_77_ = 0; i_77_ < class238.anInt2425; i_77_++) {
			int i_78_ = 0;
			for (int i_79_ = 0; i_79_ < anInt2816; i_79_++) {
				int i_80_ = (class238.anIntArray2428 != null ? class238.anIntArray2428[i_79_] : i_77_);
				if (i_80_ == i_77_)
					aBoolArray2835[i_78_++] = aBoolArray2798[i_79_];
			}
			Class240 class240 = aClass240Array2784[class238.anIntArray2427[i_77_]];
			Object object = null;
			Class235[] class235s;
			if (class240.anInt2450 == 2) {
				Class235[] class235s_81_ = method3551(1, anInt2816 * i_62_);
				for (int i_82_ = 0; i_82_ < i_62_; i_82_++) {
					for (int i_83_ = 0; i_83_ < anInt2816; i_83_++) {
						try {
							class235s_81_[0].aFloatArray2382[(i_82_ * anInt2816 + i_83_)] = (aClass235Array2792[i_83_].aFloatArray2382[i_82_]);
						} catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception) {
							arrayindexoutofboundsexception.printStackTrace();
						}
					}
				}
				class235s_81_ = class240.method3382(class235s_81_, i_62_ >> 1, aBoolArray2835);
				class235s = aClass235Array2792;
				for (int i_84_ = 0; i_84_ < i_62_; i_84_++) {
					for (int i_85_ = 0; i_85_ < anInt2816; i_85_++) {
						try {
							class235s[i_85_].aFloatArray2382[i_84_] = (class235s_81_[0].aFloatArray2382[anInt2816 * i_84_ + i_85_]);
						} catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception) {
							arrayindexoutofboundsexception.printStackTrace();
						}
					}
				}
				method3553(class235s_81_);
				Object object_86_ = null;
			} else
				class235s = class240.method3382(aClass235Array2792, i_62_ >> 1, aBoolArray2835);
			if (class238.anIntArray2428 != null) {
				i_78_ = 0;
				for (int i_87_ = 0; i_87_ < anInt2816; i_87_++) {
					int i_88_ = class238.anIntArray2428[i_87_];
					if (i_88_ == i_77_)
						aClass235Array2792[i_87_] = class235s[i_78_++];
				}
			} else {
				if (aClass235Array2792 != class235s)
					method3553(aClass235Array2792);
				aClass235Array2792 = class235s;
			}
		}
		for (int i_89_ = class238.anInt2424 - 1; i_89_ >= 0; i_89_--) {
			Class235 class235 = aClass235Array2792[class238.anIntArray2430[i_89_]];
			Class235 class235_90_ = aClass235Array2792[class238.anIntArray2423[i_89_]];
			for (int i_91_ = 0; i_91_ < class235.anInt2384; i_91_++) {
				float f = class235.aFloatArray2382[i_91_];
				float f_92_ = class235_90_.aFloatArray2382[i_91_];
				float f_93_ = f;
				float f_94_ = f_92_;
				if (f > 0.0F) {
					if (f_92_ > 0.0F) {
						f_93_ = f;
						f_94_ = f - f_92_;
					} else {
						f_94_ = f;
						f_93_ = f + f_92_;
					}
				} else if (f_92_ > 0.0F) {
					f_93_ = f;
					f_94_ = f + f_92_;
				} else {
					f_94_ = f;
					f_93_ = f - f_92_;
				}
				class235.aFloatArray2382[i_91_] = f_93_;
				class235_90_.aFloatArray2382[i_91_] = f_94_;
			}
		}
		for (int i_95_ = 0; i_95_ < aBoolArray2798.length; i_95_++)
			aBoolArray2798[i_95_] = aBoolArray2834[i_95_];
		for (int i_96_ = 0; i_96_ < anInt2816; i_96_++) {
			if (!aBoolArray2798[i_96_]) {
				int i_97_ = (class238.anIntArray2428 != null ? class238.anIntArray2428[i_96_] : 0);
				int i_98_ = i_97_;
				int i_99_ = class238.anIntArray2429[i_98_];
				aClass239Array2783[i_99_].method3378(i_96_);
				aClass239Array2783[i_99_].method3370(aClass235Array2792[i_96_], i_62_ >> 1, i_96_);
			}
		}
		for (int i_100_ = 0; i_100_ < anInt2816; i_100_++) {
			if (aBoolArray2798[i_100_]) {
				for (int i_101_ = i_62_ >> 1; i_101_ < i_62_; i_101_++)
					aClass235Array2792[i_100_].aFloatArray2382[i_101_] = 0.0F;
			} else {
				int i_102_ = i_62_ >> 1;
				int i_103_ = i_62_ >> 2;
				int i_104_ = i_62_ >> 3;
				Class235 class235 = aClass235Array2792[i_100_];
				for (int i_105_ = 0; i_105_ < i_102_; i_105_++)
					class235.aFloatArray2382[i_105_] *= 0.5F;
				for (int i_106_ = i_102_; i_106_ < i_62_; i_106_++)
					class235.aFloatArray2382[i_106_] = -class235.aFloatArray2382[i_62_ - i_106_ - 1];
				Class235 class235_107_ = bool ? aClass235_2777 : aClass235_2793;
				Class235 class235_108_ = bool ? aClass235_2786 : aClass235_2787;
				Class235 class235_109_ = bool ? aClass235_2796 : aClass235_2782;
				int[] is_110_ = bool ? anIntArray2800 : anIntArray2799;
				for (int i_111_ = 0; i_111_ < i_103_; i_111_++) {
					float f = (class235.aFloatArray2382[4 * i_111_] - class235.aFloatArray2382[i_62_ - 4 * i_111_ - 1]);
					float f_112_ = (class235.aFloatArray2382[4 * i_111_ + 2] - class235.aFloatArray2382[i_62_ - 4 * i_111_ - 3]);
					float f_113_ = class235_107_.aFloatArray2382[2 * i_111_];
					float f_114_ = class235_107_.aFloatArray2382[2 * i_111_ + 1];
					class235.aFloatArray2382[i_62_ - 4 * i_111_ - 1] = f * f_113_ - f_112_ * f_114_;
					class235.aFloatArray2382[i_62_ - 4 * i_111_ - 3] = f * f_114_ + f_112_ * f_113_;
				}
				for (int i_115_ = 0; i_115_ < i_104_; i_115_++) {
					float f = class235.aFloatArray2382[i_102_ + 3 + 4 * i_115_];
					float f_116_ = class235.aFloatArray2382[i_102_ + 1 + 4 * i_115_];
					float f_117_ = class235.aFloatArray2382[4 * i_115_ + 3];
					float f_118_ = class235.aFloatArray2382[4 * i_115_ + 1];
					class235.aFloatArray2382[i_102_ + 3 + 4 * i_115_] = f + f_117_;
					class235.aFloatArray2382[i_102_ + 1 + 4 * i_115_] = f_116_ + f_118_;
					float f_119_ = (class235_107_.aFloatArray2382[i_102_ - 4 - 4 * i_115_]);
					float f_120_ = (class235_107_.aFloatArray2382[i_102_ - 3 - 4 * i_115_]);
					class235.aFloatArray2382[4 * i_115_ + 3] = (f - f_117_) * f_119_ - (f_116_ - f_118_) * f_120_;
					class235.aFloatArray2382[4 * i_115_ + 1] = (f_116_ - f_118_) * f_119_ + (f - f_117_) * f_120_;
				}
				int i_121_ = Class98_Sub1.method8392(i_62_ - 1, (byte) 18);
				for (int i_122_ = 0; i_122_ < i_121_ - 3; i_122_++) {
					int i_123_ = i_62_ >> i_122_ + 2;
					int i_124_ = 8 << i_122_;
					for (int i_125_ = 0; i_125_ < 2 << i_122_; i_125_++) {
						int i_126_ = i_62_ - i_123_ * 2 * i_125_;
						int i_127_ = i_62_ - i_123_ * (2 * i_125_ + 1);
						for (int i_128_ = 0; i_128_ < i_62_ >> i_122_ + 4; i_128_++) {
							int i_129_ = 4 * i_128_;
							float f = (class235.aFloatArray2382[i_126_ - 1 - i_129_]);
							float f_130_ = (class235.aFloatArray2382[i_126_ - 3 - i_129_]);
							float f_131_ = (class235.aFloatArray2382[i_127_ - 1 - i_129_]);
							float f_132_ = (class235.aFloatArray2382[i_127_ - 3 - i_129_]);
							class235.aFloatArray2382[i_126_ - 1 - i_129_] = f + f_131_;
							class235.aFloatArray2382[i_126_ - 3 - i_129_] = f_130_ + f_132_;
							float f_133_ = (class235_107_.aFloatArray2382[i_128_ * i_124_]);
							float f_134_ = (class235_107_.aFloatArray2382[i_128_ * i_124_ + 1]);
							class235.aFloatArray2382[i_127_ - 1 - i_129_] = ((f - f_131_) * f_133_ - (f_130_ - f_132_) * f_134_);
							class235.aFloatArray2382[i_127_ - 3 - i_129_] = ((f_130_ - f_132_) * f_133_ + (f - f_131_) * f_134_);
						}
					}
				}
				for (int i_135_ = 1; i_135_ < i_104_ - 1; i_135_++) {
					int i_136_ = is_110_[i_135_];
					if (i_135_ < i_136_) {
						int i_137_ = 8 * i_135_;
						int i_138_ = 8 * i_136_;
						float f = class235.aFloatArray2382[i_137_ + 1];
						class235.aFloatArray2382[i_137_ + 1] = class235.aFloatArray2382[i_138_ + 1];
						class235.aFloatArray2382[i_138_ + 1] = f;
						f = class235.aFloatArray2382[i_137_ + 3];
						class235.aFloatArray2382[i_137_ + 3] = class235.aFloatArray2382[i_138_ + 3];
						class235.aFloatArray2382[i_138_ + 3] = f;
						f = class235.aFloatArray2382[i_137_ + 5];
						class235.aFloatArray2382[i_137_ + 5] = class235.aFloatArray2382[i_138_ + 5];
						class235.aFloatArray2382[i_138_ + 5] = f;
						f = class235.aFloatArray2382[i_137_ + 7];
						class235.aFloatArray2382[i_137_ + 7] = class235.aFloatArray2382[i_138_ + 7];
						class235.aFloatArray2382[i_138_ + 7] = f;
					}
				}
				for (int i_139_ = 0; i_139_ < i_102_; i_139_++)
					class235.aFloatArray2382[i_139_] = class235.aFloatArray2382[2 * i_139_ + 1];
				for (int i_140_ = 0; i_140_ < i_104_; i_140_++) {
					class235.aFloatArray2382[i_62_ - 1 - 2 * i_140_] = class235.aFloatArray2382[4 * i_140_];
					class235.aFloatArray2382[i_62_ - 2 - 2 * i_140_] = class235.aFloatArray2382[4 * i_140_ + 1];
					class235.aFloatArray2382[i_62_ - i_103_ - 1 - 2 * i_140_] = class235.aFloatArray2382[4 * i_140_ + 2];
					class235.aFloatArray2382[i_62_ - i_103_ - 2 - 2 * i_140_] = class235.aFloatArray2382[4 * i_140_ + 3];
				}
				for (int i_141_ = 0; i_141_ < i_104_; i_141_++) {
					float f = class235_109_.aFloatArray2382[2 * i_141_];
					float f_142_ = class235_109_.aFloatArray2382[2 * i_141_ + 1];
					float f_143_ = class235.aFloatArray2382[i_102_ + 2 * i_141_];
					float f_144_ = class235.aFloatArray2382[i_102_ + 2 * i_141_ + 1];
					float f_145_ = class235.aFloatArray2382[i_62_ - 2 - 2 * i_141_];
					float f_146_ = class235.aFloatArray2382[i_62_ - 1 - 2 * i_141_];
					float f_147_ = f_142_ * (f_143_ - f_145_) + f * (f_144_ + f_146_);
					class235.aFloatArray2382[i_102_ + 2 * i_141_] = (f_143_ + f_145_ + f_147_) * 0.5F;
					class235.aFloatArray2382[i_62_ - 2 - 2 * i_141_] = (f_143_ + f_145_ - f_147_) * 0.5F;
					f_147_ = f_142_ * (f_144_ + f_146_) - f * (f_143_ - f_145_);
					class235.aFloatArray2382[i_102_ + 2 * i_141_ + 1] = (f_144_ - f_146_ + f_147_) * 0.5F;
					class235.aFloatArray2382[i_62_ - 1 - 2 * i_141_] = (-f_144_ + f_146_ + f_147_) * 0.5F;
				}
				for (int i_148_ = 0; i_148_ < i_103_; i_148_++) {
					class235.aFloatArray2382[i_148_] = ((class235.aFloatArray2382[2 * i_148_ + i_102_] * class235_108_.aFloatArray2382[2 * i_148_]) + (class235.aFloatArray2382[2 * i_148_ + 1 + i_102_] * (class235_108_.aFloatArray2382[2 * i_148_ + 1])));
					class235.aFloatArray2382[i_102_ - 1 - i_148_] = ((class235.aFloatArray2382[2 * i_148_ + i_102_] * class235_108_.aFloatArray2382[2 * i_148_ + 1]) - (class235.aFloatArray2382[2 * i_148_ + 1 + i_102_] * class235_108_.aFloatArray2382[2 * i_148_]));
				}
				for (int i_149_ = 0; i_149_ < i_103_; i_149_++)
					class235.aFloatArray2382[i_62_ - i_103_ + i_149_] = -class235.aFloatArray2382[i_149_];
				for (int i_150_ = 0; i_150_ < i_103_; i_150_++)
					class235.aFloatArray2382[i_150_] = class235.aFloatArray2382[i_103_ + i_150_];
				for (int i_151_ = 0; i_151_ < i_103_; i_151_++)
					class235.aFloatArray2382[i_103_ + i_151_] = -class235.aFloatArray2382[i_103_ - i_151_ - 1];
				for (int i_152_ = 0; i_152_ < i_103_; i_152_++)
					class235.aFloatArray2382[i_102_ + i_152_] = class235.aFloatArray2382[i_62_ - i_152_ - 1];
				for (int i_153_ = i_66_; i_153_ < i_67_; i_153_++) {
					float f = (float) Math.sin(((double) (i_153_ - i_66_) + 0.5) / (double) i_68_ * 0.5 * 3.141592653589793);
					aClass235Array2792[i_100_].aFloatArray2382[i_153_] *= (float) Math.sin(1.5707963267948966 * (double) f * (double) f);
				}
				for (int i_154_ = i_69_; i_154_ < i_70_; i_154_++) {
					float f = (float) Math.sin((((double) (i_154_ - i_69_) + 0.5) / (double) i_71_ * 0.5 * 3.141592653589793) + 1.5707963267948966);
					aClass235Array2792[i_100_].aFloatArray2382[i_154_] *= (float) Math.sin(1.5707963267948966 * (double) f * (double) f);
				}
			}
		}
		Class235[] class235s = null;
		if (anInt2789 > 0) {
			int i_155_ = anInt2789 + i_62_ >> 2;
			class235s = method3551(anInt2816, i_155_);
			for (int i_156_ = 0; i_156_ < anInt2816; i_156_++) {
				if (!aBoolArray2811[i_156_]) {
					for (int i_157_ = 0; i_157_ < anInt2790; i_157_++) {
						int i_158_ = (anInt2789 >> 1) + i_157_;
						class235s[i_156_].aFloatArray2382[i_157_] += (aClass235Array2808[i_156_].aFloatArray2382[i_158_]);
					}
				}
				if (!aBoolArray2798[i_156_]) {
					for (int i_159_ = i_66_; i_159_ < i_62_ >> 1; i_159_++) {
						int i_160_ = (class235s[i_156_].anInt2384 - (i_62_ >> 1) + i_159_);
						class235s[i_156_].aFloatArray2382[i_160_] += (aClass235Array2792[i_156_].aFloatArray2382[i_159_]);
					}
				}
			}
		}
		Class235[] class235s_161_ = aClass235Array2808;
		aClass235Array2808 = aClass235Array2792;
		aClass235Array2792 = class235s_161_;
		anInt2789 = i_62_;
		anInt2790 = i_70_ - (i_62_ >> 1);
		aBoolArray2811 = aBoolArray2798;
		atomicreference.set(class235s);
		return true;
	}

	public int method9() {
		return method3580();
	}

	public void method322(int i, Class380 class380, Class364 class364, int i_162_) {
		anInt2797 = i_162_;
		if (method3548(i, class380, class364)) {
			aClass380_2774 = class380;
			aClass364_2775 = class364;
		} else
			throw new RuntimeException("");
	}

	int method3585() {
		int i = aByteArray2830[anInt2791] >> anInt2802 & 0x1;
		anInt2802++;
		anInt2791 += anInt2802 >> 3;
		anInt2802 &= 0x7;
		return i;
	}

	void method3586() {
		int i = method3563(8) + 1;
		Iterator iterator = aList2828.iterator();
		while (iterator.hasNext()) {
			Class255 class255 = (Class255) iterator.next();
			if (class255.anInt2761 == 0 && class255.anInt2759 == 0) {
				if (class255.aClass253Array2758.length == i && class255.anInt2756 == anInt2816 && class255.anInt2757 == anInt2795 && class255.anInt2760 == anInt2803) {
					aClass253Array2785 = class255.aClass253Array2758;
					for (int i_163_ = 0; i_163_ < aClass253Array2785.length; i_163_++)
						aClass253Array2785[i_163_].method3525(this);
					return;
				}
			}
		}
		aClass253Array2785 = new Class253[i];
		for (int i_164_ = 0; i_164_ < i; i_164_++) {
			if (aClass253Array2785[i_164_] == null)
				aClass253Array2785[i_164_] = new Class253();
			aClass253Array2785[i_164_].method3526(this);
		}
		Class255 class255 = new Class255(anInt2816, anInt2795, anInt2768, anInt2770, anInt2803, aClass253Array2785);
		aList2828.add(class255);
	}

	int method3587() {
		int i = aByteArray2830[anInt2791] >> anInt2802 & 0x1;
		anInt2802++;
		anInt2791 += anInt2802 >> 3;
		anInt2802 &= 0x7;
		return i;
	}

	public Class364 method318() {
		return aClass364_2775;
	}

	void method3588() {
		int i = method3563(8) + 1;
		Iterator iterator = aList2828.iterator();
		while (iterator.hasNext()) {
			Class255 class255 = (Class255) iterator.next();
			if (class255.anInt2761 == 0 && class255.anInt2759 == 0) {
				if (class255.aClass253Array2758.length == i && class255.anInt2756 == anInt2816 && class255.anInt2757 == anInt2795 && class255.anInt2760 == anInt2803) {
					aClass253Array2785 = class255.aClass253Array2758;
					for (int i_165_ = 0; i_165_ < aClass253Array2785.length; i_165_++)
						aClass253Array2785[i_165_].method3525(this);
					return;
				}
			}
		}
		aClass253Array2785 = new Class253[i];
		for (int i_166_ = 0; i_166_ < i; i_166_++) {
			if (aClass253Array2785[i_166_] == null)
				aClass253Array2785[i_166_] = new Class253();
			aClass253Array2785[i_166_].method3526(this);
		}
		Class255 class255 = new Class255(anInt2816, anInt2795, anInt2768, anInt2770, anInt2803, aClass253Array2785);
		aList2828.add(class255);
	}

	public Class258(float f) {
		aClass369_2773 = Class369.aClass369_3870;
		aList2794 = new ArrayList();
		aClass536_Sub33_2833 = null;
		anInt2829 = 0;
		anInt2805 = 0;
		aList2806 = new ArrayList();
		aList2820 = new ArrayList();
		aList2788 = new ArrayList();
		anAtomicReference2809 = new AtomicReference(null);
		anInt2824 = 0;
		aBool2826 = false;
		anInt2827 = 0;
		aBoolArray2798 = null;
		aBoolArray2834 = null;
		aBoolArray2835 = null;
		aFloat2779 = f;
		aClass380_2774 = Class380.aClass380_3930;
		aClass364_2775 = Class364.aClass364_3837;
		method3554(false);
	}

	void method3589() {
		if (method289() != Class369.aClass369_3869 && method289() != Class369.aClass369_3872 && (!aBool2769 || !((float) (anInt2827 / method3574()) > aFloat2779))) {
			if (!method3557()) {
				RSByteBuffer class536_sub33 = ((RSByteBuffer) (aList2822 != null && !aList2822.isEmpty() ? aList2822.get(0) : null));
				if (class536_sub33 == null) {
					if (!aBool2807) {
						method3546(Class369.aClass369_3872);
						anInterface45_2771.method332((byte) -26);
						aBool2807 = true;
					}
					return;
				}
				aBool2807 = false;
				aBool2801 = true;
				aList2822.remove(0);
				method3556(class536_sub33);
			}
			method3594();
		}
	}

	public RSByteBuffer method313(int i) {
		RSByteBuffer class536_sub33 = method3573(i);
		return class536_sub33;
	}

	int method3590() {
		int i = aByteArray2830[anInt2791] >> anInt2802 & 0x1;
		anInt2802++;
		anInt2791 += anInt2802 >> 3;
		anInt2802 &= 0x7;
		return i;
	}

	void method3591() {
		if (method289() != Class369.aClass369_3869 && method289() != Class369.aClass369_3872 && (!aBool2769 || !((float) (anInt2827 / method3574()) > aFloat2779))) {
			if (!method3557()) {
				RSByteBuffer class536_sub33 = ((RSByteBuffer) (aList2822 != null && !aList2822.isEmpty() ? aList2822.get(0) : null));
				if (class536_sub33 == null) {
					if (!aBool2807) {
						method3546(Class369.aClass369_3872);
						anInterface45_2771.method332((byte) -122);
						aBool2807 = true;
					}
					return;
				}
				aBool2807 = false;
				aBool2801 = true;
				aList2822.remove(0);
				method3556(class536_sub33);
			}
			method3594();
		}
	}

	void method3592() {
		if (method289() != Class369.aClass369_3869 && method289() != Class369.aClass369_3872 && (!aBool2769 || !((float) (anInt2827 / method3574()) > aFloat2779))) {
			if (!method3557()) {
				RSByteBuffer class536_sub33 = ((RSByteBuffer) (aList2822 != null && !aList2822.isEmpty() ? aList2822.get(0) : null));
				if (class536_sub33 == null) {
					if (!aBool2807) {
						method3546(Class369.aClass369_3872);
						anInterface45_2771.method332((byte) -104);
						aBool2807 = true;
					}
					return;
				}
				aBool2807 = false;
				aBool2801 = true;
				aList2822.remove(0);
				method3556(class536_sub33);
			}
			method3594();
		}
	}

	synchronized void method3593() {
		int i = (aClass536_Sub33_2833 != null ? aClass536_Sub33_2833.off * -810172525 : 0);
		int i_167_ = 0;
		Iterator iterator = aList2794.iterator();
		while (iterator.hasNext()) {
			RSByteBuffer class536_sub33 = (RSByteBuffer) iterator.next();
			i_167_ += class536_sub33.off * -810172525;
		}
		if (aClass536_Sub33_2833 != null) {
			if ((aClass536_Sub33_2833.buffer.length - aClass536_Sub33_2833.off * -810172525) < i_167_) {
				RSByteBuffer class536_sub33 = method3568(i_167_ + anInt2829);
				class536_sub33.method9696(aClass536_Sub33_2833.buffer, (aClass536_Sub33_2833.off * -810172525) - anInt2805, anInt2829, (byte) 113);
				aClass536_Sub33_2833.method9685(120764410);
				aClass536_Sub33_2833 = class536_sub33;
				i = anInt2805;
			}
		} else {
			aClass536_Sub33_2833 = method3568(i_167_);
			anInt2829 = 0;
			i = 0;
		}
		iterator = aList2794.iterator();
		while (iterator.hasNext()) {
			RSByteBuffer class536_sub33 = (RSByteBuffer) iterator.next();
			aClass536_Sub33_2833.method9696(class536_sub33.buffer, 0, (class536_sub33.off * -810172525), (byte) 48);
			anInt2829 += class536_sub33.off * -810172525;
			class536_sub33.method9685(120764410);
		}
		aClass536_Sub33_2833.off = (i - anInt2805) * 516175515;
		anInt2805 = 0;
		aList2794.clear();
		while (aBool2801) {
			if (aClass536_Sub33_2833.off * -810172525 >= aClass536_Sub33_2833.buffer.length) {
				aBool2801 = false;
				break;
			}
			if (aBool2769 && (float) (anInt2827 / method3574()) > aFloat2779)
				break;
			if (aClass536_Sub33_2833 == null || anInt2829 < 27) {
				if (aClass536_Sub33_2833 != null) {
					anInt2805 = anInt2829;
					aClass536_Sub33_2833.off += anInt2829 * 516175515;
				}
				aBool2801 = false;
				break;
			}
			int i_168_ = aClass536_Sub33_2833.off * -810172525;
			int i_169_ = 0;
			int i_170_ = 0;
			if (!method3558(aClass536_Sub33_2833))
				break;
			anInt2817++;
			if (anInt2823 < 0)
				anInt2815++;
			aList2820.clear();
			aList2788.clear();
			aClass536_Sub33_2833.readUnsignedByte();
			int i_171_ = aClass536_Sub33_2833.readUnsignedByte();
			int i_172_ = (aClass536_Sub33_2833.readUnsignedByte() & 0xff | (aClass536_Sub33_2833.readUnsignedByte() & 0xff) << 8 | (aClass536_Sub33_2833.readUnsignedByte() & 0xff) << 16 | aClass536_Sub33_2833.readUnsignedByte() << 24);
			i_169_ = i_172_ - i_169_;
			aClass536_Sub33_2833.off += -331126352;
			int i_173_ = aClass536_Sub33_2833.readUnsignedByte();
			int i_174_ = aClass536_Sub33_2833.off * -810172525;
			int i_175_ = i_174_ + i_173_;
			if (i_175_ > i_168_ + anInt2829) {
				aClass536_Sub33_2833.off = (i_168_ + anInt2829) * 516175515;
				anInt2805 = aClass536_Sub33_2833.off * -810172525 - i_168_;
				aBool2801 = false;
			}
			int i_176_ = i_175_;
			int i_177_ = 0;
			if (aBool2801) {
				for (int i_178_ = 0; i_178_ < i_173_; i_178_++) {
					int i_179_ = (aClass536_Sub33_2833.buffer[i_174_++] & 0xff);
					i_175_ += i_179_;
					i_177_ += i_179_;
					if (i_175_ > i_168_ + anInt2829) {
						aClass536_Sub33_2833.off = (i_168_ + anInt2829) * 516175515;
						anInt2805 = (aClass536_Sub33_2833.off * -810172525 - i_168_);
						aBool2801 = false;
						break;
					}
					if (i_179_ < 255) {
						aList2820.add(Integer.valueOf(i_176_));
						aList2788.add(Integer.valueOf(i_177_));
						i_176_ = i_175_;
						i_177_ = 0;
					}
				}
			}
			if (aBool2801) {
				int i_180_ = i_175_;
				int i_181_ = -1;
				Iterator iterator_182_ = aList2820.iterator();
				Iterator iterator_183_ = aList2788.iterator();
				boolean bool = false;
				anInt2824 = 0;
				while (iterator_182_.hasNext()) {
					Integer integer = (Integer) iterator_182_.next();
					Integer integer_184_ = (Integer) iterator_183_.next();
					i_181_++;
					if (method315() && aBool2814 == true && anInt2817 < anInt2815 && i_181_ < anInt2823) {
						Class258 class258_185_ = this;
						class258_185_.anInt2810 = class258_185_.anInt2810 + (bool ? 0 : i_169_);
						bool = true;
					} else {
						anAtomicReference2809.set(null);
						boolean bool_186_ = method3584(aClass536_Sub33_2833.buffer, integer.intValue(), integer_184_.intValue(), anAtomicReference2809);
						Class235[] class235s = (Class235[]) anAtomicReference2809.get();
						if (bool_186_ && (aBool2814 != true || anInt2817 >= anInt2815 || i_181_ >= anInt2823)) {
							if (class235s != null) {
								int i_187_ = class235s[0].anInt2384;
								anInt2766 += i_187_;
								if (anInt2766 > i_172_ && i_171_ == 4) {
									anInt2824 = anInt2766 - i_172_ - anInt2824;
									i_187_ -= anInt2824;
									if (anInt2824 > class235s[0].anInt2384)
										anInt2824 = class235s[0].anInt2384;
									if (i_187_ < 0)
										i_187_ = 0;
								}
								int i_188_ = 0;
								int i_189_ = method298(i_187_) * class235s.length;
								if (aBool2814 == true && anInt2810 < anInt2831) {
									int i_190_ = i_189_;
									i_189_ -= method298(anInt2831 - anInt2810);
									if (i_189_ <= 0) {
										anInt2810 += method173(i_190_);
										method3553(class235s);
										Object object = null;
										continue;
									}
									i_188_ += anInt2831 - anInt2810;
								}
								if (anInt2810 + i_187_ > anInt2778 && (anInt2819 < anInt2818 || anInt2818 < 0) && aBool2826) {
									i_189_ -= method298(anInt2810 + i_187_ - anInt2778 - 1);
									if (i_189_ <= 0) {
										method3553(class235s);
										Object object = null;
										continue;
									}
								}
								int i_191_ = method262();
								if (method3549() < method262()) {
									int i_192_ = method262() - method3549();
									i_189_ += i_189_ / method3549() * i_192_;
								}
								RSByteBuffer class536_sub33 = method3568(i_189_);
								for (int i_193_ = i_188_; i_193_ < i_187_; i_193_++) {
									boolean bool_194_ = aBool2814;
									if (anInt2818 != 0) {
										if (anInt2810 == anInt2831) {
											if (anInt2772 < 0) {
												anInt2772 = anInt2813;
												anInt2823 = i_181_;
											}
											aBool2814 = false;
										}
										if (anInt2810 == anInt2778 && anInt2812 < 0)
											anInt2812 = anInt2813;
										if (anInt2810 > anInt2778 && (anInt2819 < anInt2818 || anInt2818 < 0) && aBool2826)
											bool_194_ = true;
									}
									if (bool_194_ && (anInt2810 < anInt2831 || anInt2810 > anInt2778)) {
										anInt2810++;
										if (++i_170_ > i_169_)
											throw new RuntimeException();
									} else {
										for (int i_195_ = 0; i_195_ < i_191_; i_195_++) {
											float f;
											if (i_195_ < class235s.length)
												f = (class235s[i_195_].aFloatArray2382[i_193_]);
											else
												f = (class235s[i_195_ % method3549()].aFloatArray2382[i_193_]);
											if (aClass380_2774 == Class380.aClass380_3930) {
												int i_196_ = method3547(f);
												if (aClass364_2775 == Class364.aClass364_3837)
													class536_sub33.writeShortLE(i_196_, -98695993);
												else
													class536_sub33.writeShort(i_196_, -1778059594);
											} else if (aClass380_2774 == (Class380.aClass380_3931)) {
												int i_197_ = method3576(f);
												if (aClass364_2775 == Class364.aClass364_3837)
													class536_sub33.writeShortLE(i_197_, -399095012);
												else
													class536_sub33.writeShort(i_197_, -1778059594);
											} else if (aClass380_2774 == (Class380.aClass380_3928)) {
												int i_198_ = method3571(f);
												class536_sub33.writeByte(i_198_, 465637339);
											} else if (aClass380_2774 == (Class380.aClass380_3929)) {
												int i_199_ = method3572(f);
												class536_sub33.writeByte(i_199_, 465637339);
											}
										}
										anInt2810++;
										i_170_++;
									}
								}
								synchronized (aList2806) {
									anInt2827 += (method173(class536_sub33.off * -810172525) / method262());
									aList2806.add(class536_sub33);
								}
							}
						} else if (method315()) {
							anInt2789 = 0;
							if (aClass235Array2808 == null || (aClass235Array2808 != null && (aClass235Array2808.length != anInt2816 || (aClass235Array2808[0].anInt2384 != anInt2781)))) {
								if (aClass235Array2808 != null)
									method3553(aClass235Array2808);
								aClass235Array2808 = method3551(anInt2816, anInt2781);
							}
						}
						method3553(class235s);
						Object object = null;
					}
				}
				aClass536_Sub33_2833.off = i_180_ * 516175515;
				anInt2829 -= i_180_ - i_168_;
			}
		}
	}

	synchronized void method3594() {
		int i = (aClass536_Sub33_2833 != null ? aClass536_Sub33_2833.off * -810172525 : 0);
		int i_200_ = 0;
		Iterator iterator = aList2794.iterator();
		while (iterator.hasNext()) {
			RSByteBuffer class536_sub33 = (RSByteBuffer) iterator.next();
			i_200_ += class536_sub33.off * -810172525;
		}
		if (aClass536_Sub33_2833 != null) {
			if ((aClass536_Sub33_2833.buffer.length - aClass536_Sub33_2833.off * -810172525) < i_200_) {
				RSByteBuffer class536_sub33 = method3568(i_200_ + anInt2829);
				class536_sub33.method9696(aClass536_Sub33_2833.buffer, (aClass536_Sub33_2833.off * -810172525) - anInt2805, anInt2829, (byte) 38);
				aClass536_Sub33_2833.method9685(120764410);
				aClass536_Sub33_2833 = class536_sub33;
				i = anInt2805;
			}
		} else {
			aClass536_Sub33_2833 = method3568(i_200_);
			anInt2829 = 0;
			i = 0;
		}
		iterator = aList2794.iterator();
		while (iterator.hasNext()) {
			RSByteBuffer class536_sub33 = (RSByteBuffer) iterator.next();
			aClass536_Sub33_2833.method9696(class536_sub33.buffer, 0, (class536_sub33.off * -810172525), (byte) 99);
			anInt2829 += class536_sub33.off * -810172525;
			class536_sub33.method9685(120764410);
		}
		aClass536_Sub33_2833.off = (i - anInt2805) * 516175515;
		anInt2805 = 0;
		aList2794.clear();
		while (aBool2801) {
			if (aClass536_Sub33_2833.off * -810172525 >= aClass536_Sub33_2833.buffer.length) {
				aBool2801 = false;
				break;
			}
			if (aBool2769 && (float) (anInt2827 / method3574()) > aFloat2779)
				break;
			if (aClass536_Sub33_2833 == null || anInt2829 < 27) {
				if (aClass536_Sub33_2833 != null) {
					anInt2805 = anInt2829;
					aClass536_Sub33_2833.off += anInt2829 * 516175515;
				}
				aBool2801 = false;
				break;
			}
			int i_201_ = aClass536_Sub33_2833.off * -810172525;
			int i_202_ = 0;
			int i_203_ = 0;
			if (!method3558(aClass536_Sub33_2833))
				break;
			anInt2817++;
			if (anInt2823 < 0)
				anInt2815++;
			aList2820.clear();
			aList2788.clear();
			aClass536_Sub33_2833.readUnsignedByte();
			int i_204_ = aClass536_Sub33_2833.readUnsignedByte();
			int i_205_ = (aClass536_Sub33_2833.readUnsignedByte() & 0xff | (aClass536_Sub33_2833.readUnsignedByte() & 0xff) << 8 | (aClass536_Sub33_2833.readUnsignedByte() & 0xff) << 16 | aClass536_Sub33_2833.readUnsignedByte() << 24);
			i_202_ = i_205_ - i_202_;
			aClass536_Sub33_2833.off += -331126352;
			int i_206_ = aClass536_Sub33_2833.readUnsignedByte();
			int i_207_ = aClass536_Sub33_2833.off * -810172525;
			int i_208_ = i_207_ + i_206_;
			if (i_208_ > i_201_ + anInt2829) {
				aClass536_Sub33_2833.off = (i_201_ + anInt2829) * 516175515;
				anInt2805 = aClass536_Sub33_2833.off * -810172525 - i_201_;
				aBool2801 = false;
			}
			int i_209_ = i_208_;
			int i_210_ = 0;
			if (aBool2801) {
				for (int i_211_ = 0; i_211_ < i_206_; i_211_++) {
					int i_212_ = (aClass536_Sub33_2833.buffer[i_207_++] & 0xff);
					i_208_ += i_212_;
					i_210_ += i_212_;
					if (i_208_ > i_201_ + anInt2829) {
						aClass536_Sub33_2833.off = (i_201_ + anInt2829) * 516175515;
						anInt2805 = (aClass536_Sub33_2833.off * -810172525 - i_201_);
						aBool2801 = false;
						break;
					}
					if (i_212_ < 255) {
						aList2820.add(Integer.valueOf(i_209_));
						aList2788.add(Integer.valueOf(i_210_));
						i_209_ = i_208_;
						i_210_ = 0;
					}
				}
			}
			if (aBool2801) {
				int i_213_ = i_208_;
				int i_214_ = -1;
				Iterator iterator_215_ = aList2820.iterator();
				Iterator iterator_216_ = aList2788.iterator();
				boolean bool = false;
				anInt2824 = 0;
				while (iterator_215_.hasNext()) {
					Integer integer = (Integer) iterator_215_.next();
					Integer integer_217_ = (Integer) iterator_216_.next();
					i_214_++;
					if (method315() && aBool2814 == true && anInt2817 < anInt2815 && i_214_ < anInt2823) {
						Class258 class258_218_ = this;
						class258_218_.anInt2810 = class258_218_.anInt2810 + (bool ? 0 : i_202_);
						bool = true;
					} else {
						anAtomicReference2809.set(null);
						boolean bool_219_ = method3584(aClass536_Sub33_2833.buffer, integer.intValue(), integer_217_.intValue(), anAtomicReference2809);
						Class235[] class235s = (Class235[]) anAtomicReference2809.get();
						if (bool_219_ && (aBool2814 != true || anInt2817 >= anInt2815 || i_214_ >= anInt2823)) {
							if (class235s != null) {
								int i_220_ = class235s[0].anInt2384;
								anInt2766 += i_220_;
								if (anInt2766 > i_205_ && i_204_ == 4) {
									anInt2824 = anInt2766 - i_205_ - anInt2824;
									i_220_ -= anInt2824;
									if (anInt2824 > class235s[0].anInt2384)
										anInt2824 = class235s[0].anInt2384;
									if (i_220_ < 0)
										i_220_ = 0;
								}
								int i_221_ = 0;
								int i_222_ = method298(i_220_) * class235s.length;
								if (aBool2814 == true && anInt2810 < anInt2831) {
									int i_223_ = i_222_;
									i_222_ -= method298(anInt2831 - anInt2810);
									if (i_222_ <= 0) {
										anInt2810 += method173(i_223_);
										method3553(class235s);
										Object object = null;
										continue;
									}
									i_221_ += anInt2831 - anInt2810;
								}
								if (anInt2810 + i_220_ > anInt2778 && (anInt2819 < anInt2818 || anInt2818 < 0) && aBool2826) {
									i_222_ -= method298(anInt2810 + i_220_ - anInt2778 - 1);
									if (i_222_ <= 0) {
										method3553(class235s);
										Object object = null;
										continue;
									}
								}
								int i_224_ = method262();
								if (method3549() < method262()) {
									int i_225_ = method262() - method3549();
									i_222_ += i_222_ / method3549() * i_225_;
								}
								RSByteBuffer class536_sub33 = method3568(i_222_);
								for (int i_226_ = i_221_; i_226_ < i_220_; i_226_++) {
									boolean bool_227_ = aBool2814;
									if (anInt2818 != 0) {
										if (anInt2810 == anInt2831) {
											if (anInt2772 < 0) {
												anInt2772 = anInt2813;
												anInt2823 = i_214_;
											}
											aBool2814 = false;
										}
										if (anInt2810 == anInt2778 && anInt2812 < 0)
											anInt2812 = anInt2813;
										if (anInt2810 > anInt2778 && (anInt2819 < anInt2818 || anInt2818 < 0) && aBool2826)
											bool_227_ = true;
									}
									if (bool_227_ && (anInt2810 < anInt2831 || anInt2810 > anInt2778)) {
										anInt2810++;
										if (++i_203_ > i_202_)
											throw new RuntimeException();
									} else {
										for (int i_228_ = 0; i_228_ < i_224_; i_228_++) {
											float f;
											if (i_228_ < class235s.length)
												f = (class235s[i_228_].aFloatArray2382[i_226_]);
											else
												f = (class235s[i_228_ % method3549()].aFloatArray2382[i_226_]);
											if (aClass380_2774 == Class380.aClass380_3930) {
												int i_229_ = method3547(f);
												if (aClass364_2775 == Class364.aClass364_3837)
													class536_sub33.writeShortLE(i_229_, 517052386);
												else
													class536_sub33.writeShort(i_229_, -1778059594);
											} else if (aClass380_2774 == (Class380.aClass380_3931)) {
												int i_230_ = method3576(f);
												if (aClass364_2775 == Class364.aClass364_3837)
													class536_sub33.writeShortLE(i_230_, -544534118);
												else
													class536_sub33.writeShort(i_230_, -1778059594);
											} else if (aClass380_2774 == (Class380.aClass380_3928)) {
												int i_231_ = method3571(f);
												class536_sub33.writeByte(i_231_, 465637339);
											} else if (aClass380_2774 == (Class380.aClass380_3929)) {
												int i_232_ = method3572(f);
												class536_sub33.writeByte(i_232_, 465637339);
											}
										}
										anInt2810++;
										i_203_++;
									}
								}
								synchronized (aList2806) {
									anInt2827 += (method173(class536_sub33.off * -810172525) / method262());
									aList2806.add(class536_sub33);
								}
							}
						} else if (method315()) {
							anInt2789 = 0;
							if (aClass235Array2808 == null || (aClass235Array2808 != null && (aClass235Array2808.length != anInt2816 || (aClass235Array2808[0].anInt2384 != anInt2781)))) {
								if (aClass235Array2808 != null)
									method3553(aClass235Array2808);
								aClass235Array2808 = method3551(anInt2816, anInt2781);
							}
						}
						method3553(class235s);
						Object object = null;
					}
				}
				aClass536_Sub33_2833.off = i_213_ * 516175515;
				anInt2829 -= i_213_ - i_201_;
			}
		}
	}

	int method3595() {
		return anInt2827;
	}

	void method3596() {
		if (method289() != Class369.aClass369_3873) {
			method3569();
			if (method289() == Class369.aClass369_3871)
				method3546(Class369.aClass369_3875);
		}
	}

	public void method317(boolean bool, int i, int i_233_, int i_234_) {
		aBool2826 = bool;
		anInt2818 = i;
		anInt2831 = i_233_;
		anInt2778 = i_234_;
	}

	public Class364 method294() {
		return aClass364_2775;
	}

	public Class380 method299() {
		return aClass380_2774;
	}

	public int method329(int i) {
		return i * (method291().anInt3933 * 2067142005 / 8);
	}
}
