/* Class353 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.nio.ByteBuffer;
import java.util.Vector;

public class Class353 {
	Class180_Sub2 aClass180_Sub2_3781;
	Class171_Sub2 aClass171_Sub2_3782;
	Class171_Sub2 aClass171_Sub2_3783;
	Interface40 anInterface40_3784;
	Interface40 anInterface40_3785;
	Interface40 anInterface40_3786;
	Interface21 anInterface21_3787;
	Interface21 anInterface21_3788;
	Class355 aClass355_3789;
	int anInt3790;
	int anInt3791;
	Interface23 anInterface23_3792;
	int anInt3793 = 0;
	int anInt3794;
	int anInt3795;
	Interface23 anInterface23_3796;
	Class184 aClass184_3797;
	boolean aBool3798;
	Vector aVector3799 = new Vector();
	Interface37 anInterface37_3800;
	Interface21 anInterface21_3801;
	int anInt3802 = 0;
	Interface21 anInterface21_3803;

	boolean method6215() {
		int i = aVector3799.size();
		for (int i_0_ = 0; i_0_ < i; i_0_++) {
			if (!((Class340) aVector3799.elementAt(i_0_)).method6048())
				return false;
		}
		return true;
	}

	void method6216() {
		if (anInterface37_3800 == null) {
			anInterface37_3800 = aClass180_Sub2_3781.method15035(false);
			anInterface37_3800.method219(12, 4);
			ByteBuffer bytebuffer = aClass180_Sub2_3781.aByteBuffer9438;
			bytebuffer.clear();
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(2.0F);
			anInterface37_3800.method213(0, bytebuffer.position(), aClass180_Sub2_3781.aLong9439);
			aClass355_3789 = (aClass180_Sub2_3781.method14999(new Class372[] { new Class372(Class347.aClass347_3735) }));
		}
	}

	void method6217(int i, int i_1_) {
		if (aBool3798) {
			if (aClass171_Sub2_3782 != null) {
				aClass180_Sub2_3781.method3107(aClass171_Sub2_3782, -677418425);
				aClass180_Sub2_3781.method3106(aClass171_Sub2_3783, (byte) -99);
				aClass171_Sub2_3782.method15330(0, 0, anInt3794, anInt3795, 0, 0, true, anInterface23_3796 != null);
			}
			method6243(i, i_1_);
			aBool3798 = false;
		}
	}

	void method6218() {
		method6216();
		switch (anInt3802) {
		default:
			throw new RuntimeException();
		case 1:
			aClass184_3797 = Class184.aClass184_2108;
			break;
		case 2:
			aClass184_3797 = Class184.aClass184_2109;
			break;
		case 0:
			aClass184_3797 = Class184.aClass184_2104;
		}
		aClass171_Sub2_3783 = aClass180_Sub2_3781.method3109();
		if (aClass180_Sub2_3781.anInt9573 > 1 && aClass180_Sub2_3781.aBool9494 && aClass180_Sub2_3781.aBool9567) {
			aClass171_Sub2_3782 = aClass180_Sub2_3781.method3109();
			anInterface21_3801 = aClass180_Sub2_3781.method3419(anInt3794, anInt3795, Class157.aClass157_1723, aClass184_3797, (aClass180_Sub2_3781.anInt9573));
			anInterface23_3792 = aClass180_Sub2_3781.method3156(anInt3794, anInt3795, (aClass180_Sub2_3781.anInt9573));
		}
		anInterface40_3784 = aClass180_Sub2_3781.method15027(Class157.aClass157_1723, aClass184_3797, anInt3794, anInt3795);
		anInterface21_3787 = anInterface40_3784.method269(0);
		anInterface40_3785 = aClass180_Sub2_3781.method15027(Class157.aClass157_1723, aClass184_3797, anInt3794, anInt3795);
		anInterface21_3788 = anInterface40_3785.method269(0);
		anInterface40_3786 = aClass180_Sub2_3781.method15027(Class157.aClass157_1723, aClass184_3797, anInt3794, anInt3795);
		anInterface21_3803 = anInterface40_3786.method269(0);
		anInterface23_3796 = aClass180_Sub2_3781.method3111(anInterface40_3786.method1(), anInterface40_3786.method87());
		int i = aVector3799.size();
		for (int i_2_ = 0; i_2_ < i; i_2_++) {
			Class340 class340 = (Class340) aVector3799.elementAt(i_2_);
			class340.method6040(anInt3794, anInt3795);
		}
	}

	boolean method6219(Class340 class340) {
		Vector vector = new Vector();
		boolean bool = false;
		for (int i = 0; i < aVector3799.size(); i++) {
			if (!bool && class340.method6046() < method6228(i).method6046()) {
				bool = true;
				if (!method6240(vector, vector.size(), class340))
					return false;
			}
			vector.addElement(method6228(i));
		}
		if (!bool && !method6240(vector, vector.size(), class340))
			return false;
		aVector3799 = vector;
		return true;
	}

	void method6220() {
		aClass180_Sub2_3781.method14988(0, anInterface37_3800);
		aClass180_Sub2_3781.method15149(aClass355_3789);
		aClass180_Sub2_3781.method15008(Class364.aClass364_3861, 0, 1);
	}

	boolean method6221(Vector vector, int i, Class340 class340) {
		if (class340.method6036() || class340.method6055()) {
			vector.insertElementAt(class340, i);
			class340.method6040(anInt3794, anInt3795);
			int i_3_ = class340.method6045();
			if (i_3_ > anInt3802)
				anInt3802 = i_3_;
			class340.aBool3674 = true;
			return true;
		}
		return false;
	}

	void method6222(Class340 class340) {
		class340.method6039();
		class340.aBool3674 = false;
		aVector3799.removeElement(class340);
	}

	boolean method6223() {
		int i = aVector3799.size();
		for (int i_4_ = 0; i_4_ < i; i_4_++) {
			if (!((Class340) aVector3799.elementAt(i_4_)).method6048())
				return false;
		}
		return true;
	}

	boolean method6224(int i, int i_5_, int i_6_, int i_7_) {
		if (aVector3799.isEmpty() || method6223())
			return true;
		if (anInt3794 != i_6_ || anInt3795 != i_7_ || aClass180_Sub2_3781.anInt9573 != anInt3791) {
			anInt3791 = aClass180_Sub2_3781.anInt9573;
			anInt3794 = i_6_;
			anInt3795 = i_7_;
			method6241();
			method6218();
		}
		aClass171_Sub2_3783.method15321(0, anInterface21_3803);
		if (anInterface23_3796 != null)
			aClass171_Sub2_3783.method15324(anInterface23_3796);
		if (aClass171_Sub2_3782 != null) {
			aClass171_Sub2_3782.method15321(0, anInterface21_3801);
			aClass171_Sub2_3782.method15324(anInterface23_3792);
			aClass180_Sub2_3781.method3106(aClass171_Sub2_3782, (byte) -17);
		} else
			aClass180_Sub2_3781.method3106(aClass171_Sub2_3783, (byte) 2);
		if (!aClass171_Sub2_3783.method15322()) {
			aClass180_Sub2_3781.method3107((aClass171_Sub2_3782 != null ? aClass171_Sub2_3782 : aClass171_Sub2_3783), -677418425);
			return false;
		}
		anInt3790 = i;
		anInt3793 = i_5_;
		aClass180_Sub2_3781.method3136(3, -16777216);
		aClass180_Sub2_3781.method14991(15);
		aClass180_Sub2_3781.method14989(0);
		aBool3798 = true;
		return true;
	}

	Class340 method6225(int i) {
		return (Class340) aVector3799.elementAt(i);
	}

	void method6226(int i, int i_8_) {
		aClass180_Sub2_3781.method3124(true);
		aClass180_Sub2_3781.method15011();
		aClass180_Sub2_3781.method15238(0);
		aClass180_Sub2_3781.method14973(1);
		aClass180_Sub2_3781.method3131();
		aClass171_Sub2_3783.method15324(null);
		aClass180_Sub2_3781.method14927(0, 0);
		int i_9_ = aVector3799.size();
		Vector vector = aVector3799;
		for (int i_10_ = 0; i_10_ < i_9_; i_10_++) {
			if (((Class340) aVector3799.elementAt(i_10_)).method6048()) {
				vector = new Vector();
				for (int i_11_ = 0; i_11_ < i_9_; i_11_++) {
					if (!((Class340) aVector3799.elementAt(i_11_)).method6048())
						vector.addElement(aVector3799.elementAt(i_11_));
				}
				i_9_ = vector.size();
				break;
			}
		}
		anInterface40_3786.method260();
		for (int i_12_ = 0; i_12_ < i_9_; i_12_++) {
			Class340 class340 = (Class340) vector.elementAt(i_12_);
			int i_13_ = class340.method6043();
			boolean bool = i_12_ == i_9_ - 1;
			boolean bool_14_ = false;
			for (int i_15_ = 0; i_15_ < i_13_; i_15_++) {
				if (i_15_ == i_13_ - 1) {
					if (bool) {
						aClass180_Sub2_3781.method3107(aClass171_Sub2_3783, -677418425);
						aClass180_Sub2_3781.method3132(anInt3790, anInt3793, anInt3790 + i, anInt3793 + i_8_);
					} else {
						bool_14_ = true;
						aClass171_Sub2_3783.method15321(0, anInterface21_3803);
					}
				} else
					aClass171_Sub2_3783.method15321(0, anInterface21_3788);
				Interface40 interface40 = anInterface40_3784;
				if (i_15_ == 0)
					interface40 = anInterface40_3786;
				class340.method6070(i_15_, aClass171_Sub2_3783, interface40, anInterface23_3796, anInterface40_3786, bool && i_15_ == i_13_ - 1);
				method6220();
				class340.method6041(i_15_);
				if (bool_14_)
					anInterface40_3786.method260();
				Interface40 interface40_16_ = anInterface40_3784;
				anInterface40_3784 = anInterface40_3785;
				anInterface40_3785 = interface40_16_;
				Interface21 interface21 = anInterface21_3787;
				anInterface21_3787 = anInterface21_3788;
				anInterface21_3788 = interface21;
			}
		}
		aClass180_Sub2_3781.method15238(1);
		aClass180_Sub2_3781.method14973(0);
		aClass180_Sub2_3781.method3124(false);
		aClass180_Sub2_3781.method3131();
		Object object = null;
	}

	void method6227() {
		if (anInterface37_3800 == null) {
			anInterface37_3800 = aClass180_Sub2_3781.method15035(false);
			anInterface37_3800.method219(12, 4);
			ByteBuffer bytebuffer = aClass180_Sub2_3781.aByteBuffer9438;
			bytebuffer.clear();
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(2.0F);
			anInterface37_3800.method213(0, bytebuffer.position(), aClass180_Sub2_3781.aLong9439);
			aClass355_3789 = (aClass180_Sub2_3781.method14999(new Class372[] { new Class372(Class347.aClass347_3735) }));
		}
	}

	Class340 method6228(int i) {
		return (Class340) aVector3799.elementAt(i);
	}

	boolean method6229(Class340 class340) {
		Vector vector = new Vector();
		boolean bool = false;
		for (int i = 0; i < aVector3799.size(); i++) {
			if (!bool && class340.method6046() < method6228(i).method6046()) {
				bool = true;
				if (!method6240(vector, vector.size(), class340))
					return false;
			}
			vector.addElement(method6228(i));
		}
		if (!bool && !method6240(vector, vector.size(), class340))
			return false;
		aVector3799 = vector;
		return true;
	}

	void method6230() {
		aClass180_Sub2_3781.method14988(0, anInterface37_3800);
		aClass180_Sub2_3781.method15149(aClass355_3789);
		aClass180_Sub2_3781.method15008(Class364.aClass364_3861, 0, 1);
	}

	void method6231() {
		aClass180_Sub2_3781.method14988(0, anInterface37_3800);
		aClass180_Sub2_3781.method15149(aClass355_3789);
		aClass180_Sub2_3781.method15008(Class364.aClass364_3861, 0, 1);
	}

	void method6232() {
		aClass180_Sub2_3781.method14988(0, anInterface37_3800);
		aClass180_Sub2_3781.method15149(aClass355_3789);
		aClass180_Sub2_3781.method15008(Class364.aClass364_3861, 0, 1);
	}

	void method6233() {
		aClass180_Sub2_3781.method14988(0, anInterface37_3800);
		aClass180_Sub2_3781.method15149(aClass355_3789);
		aClass180_Sub2_3781.method15008(Class364.aClass364_3861, 0, 1);
	}

	void method6234() {
		aClass180_Sub2_3781.method14988(0, anInterface37_3800);
		aClass180_Sub2_3781.method15149(aClass355_3789);
		aClass180_Sub2_3781.method15008(Class364.aClass364_3861, 0, 1);
	}

	void method6235() {
		aClass180_Sub2_3781.method14988(0, anInterface37_3800);
		aClass180_Sub2_3781.method15149(aClass355_3789);
		aClass180_Sub2_3781.method15008(Class364.aClass364_3861, 0, 1);
	}

	void method6236() {
		method6216();
		switch (anInt3802) {
		default:
			throw new RuntimeException();
		case 1:
			aClass184_3797 = Class184.aClass184_2108;
			break;
		case 2:
			aClass184_3797 = Class184.aClass184_2109;
			break;
		case 0:
			aClass184_3797 = Class184.aClass184_2104;
		}
		aClass171_Sub2_3783 = aClass180_Sub2_3781.method3109();
		if (aClass180_Sub2_3781.anInt9573 > 1 && aClass180_Sub2_3781.aBool9494 && aClass180_Sub2_3781.aBool9567) {
			aClass171_Sub2_3782 = aClass180_Sub2_3781.method3109();
			anInterface21_3801 = aClass180_Sub2_3781.method3419(anInt3794, anInt3795, Class157.aClass157_1723, aClass184_3797, (aClass180_Sub2_3781.anInt9573));
			anInterface23_3792 = aClass180_Sub2_3781.method3156(anInt3794, anInt3795, (aClass180_Sub2_3781.anInt9573));
		}
		anInterface40_3784 = aClass180_Sub2_3781.method15027(Class157.aClass157_1723, aClass184_3797, anInt3794, anInt3795);
		anInterface21_3787 = anInterface40_3784.method269(0);
		anInterface40_3785 = aClass180_Sub2_3781.method15027(Class157.aClass157_1723, aClass184_3797, anInt3794, anInt3795);
		anInterface21_3788 = anInterface40_3785.method269(0);
		anInterface40_3786 = aClass180_Sub2_3781.method15027(Class157.aClass157_1723, aClass184_3797, anInt3794, anInt3795);
		anInterface21_3803 = anInterface40_3786.method269(0);
		anInterface23_3796 = aClass180_Sub2_3781.method3111(anInterface40_3786.method1(), anInterface40_3786.method87());
		int i = aVector3799.size();
		for (int i_17_ = 0; i_17_ < i; i_17_++) {
			Class340 class340 = (Class340) aVector3799.elementAt(i_17_);
			class340.method6040(anInt3794, anInt3795);
		}
	}

	void method6237(int i, int i_18_) {
		aClass180_Sub2_3781.method3124(true);
		aClass180_Sub2_3781.method15011();
		aClass180_Sub2_3781.method15238(0);
		aClass180_Sub2_3781.method14973(1);
		aClass180_Sub2_3781.method3131();
		aClass171_Sub2_3783.method15324(null);
		aClass180_Sub2_3781.method14927(0, 0);
		int i_19_ = aVector3799.size();
		Vector vector = aVector3799;
		for (int i_20_ = 0; i_20_ < i_19_; i_20_++) {
			if (((Class340) aVector3799.elementAt(i_20_)).method6048()) {
				vector = new Vector();
				for (int i_21_ = 0; i_21_ < i_19_; i_21_++) {
					if (!((Class340) aVector3799.elementAt(i_21_)).method6048())
						vector.addElement(aVector3799.elementAt(i_21_));
				}
				i_19_ = vector.size();
				break;
			}
		}
		anInterface40_3786.method260();
		for (int i_22_ = 0; i_22_ < i_19_; i_22_++) {
			Class340 class340 = (Class340) vector.elementAt(i_22_);
			int i_23_ = class340.method6043();
			boolean bool = i_22_ == i_19_ - 1;
			boolean bool_24_ = false;
			for (int i_25_ = 0; i_25_ < i_23_; i_25_++) {
				if (i_25_ == i_23_ - 1) {
					if (bool) {
						aClass180_Sub2_3781.method3107(aClass171_Sub2_3783, -677418425);
						aClass180_Sub2_3781.method3132(anInt3790, anInt3793, anInt3790 + i, anInt3793 + i_18_);
					} else {
						bool_24_ = true;
						aClass171_Sub2_3783.method15321(0, anInterface21_3803);
					}
				} else
					aClass171_Sub2_3783.method15321(0, anInterface21_3788);
				Interface40 interface40 = anInterface40_3784;
				if (i_25_ == 0)
					interface40 = anInterface40_3786;
				class340.method6070(i_25_, aClass171_Sub2_3783, interface40, anInterface23_3796, anInterface40_3786, bool && i_25_ == i_23_ - 1);
				method6220();
				class340.method6041(i_25_);
				if (bool_24_)
					anInterface40_3786.method260();
				Interface40 interface40_26_ = anInterface40_3784;
				anInterface40_3784 = anInterface40_3785;
				anInterface40_3785 = interface40_26_;
				Interface21 interface21 = anInterface21_3787;
				anInterface21_3787 = anInterface21_3788;
				anInterface21_3788 = interface21;
			}
		}
		aClass180_Sub2_3781.method15238(1);
		aClass180_Sub2_3781.method14973(0);
		aClass180_Sub2_3781.method3124(false);
		aClass180_Sub2_3781.method3131();
		Object object = null;
	}

	void method6238() {
		method6216();
		switch (anInt3802) {
		default:
			throw new RuntimeException();
		case 1:
			aClass184_3797 = Class184.aClass184_2108;
			break;
		case 2:
			aClass184_3797 = Class184.aClass184_2109;
			break;
		case 0:
			aClass184_3797 = Class184.aClass184_2104;
		}
		aClass171_Sub2_3783 = aClass180_Sub2_3781.method3109();
		if (aClass180_Sub2_3781.anInt9573 > 1 && aClass180_Sub2_3781.aBool9494 && aClass180_Sub2_3781.aBool9567) {
			aClass171_Sub2_3782 = aClass180_Sub2_3781.method3109();
			anInterface21_3801 = aClass180_Sub2_3781.method3419(anInt3794, anInt3795, Class157.aClass157_1723, aClass184_3797, (aClass180_Sub2_3781.anInt9573));
			anInterface23_3792 = aClass180_Sub2_3781.method3156(anInt3794, anInt3795, (aClass180_Sub2_3781.anInt9573));
		}
		anInterface40_3784 = aClass180_Sub2_3781.method15027(Class157.aClass157_1723, aClass184_3797, anInt3794, anInt3795);
		anInterface21_3787 = anInterface40_3784.method269(0);
		anInterface40_3785 = aClass180_Sub2_3781.method15027(Class157.aClass157_1723, aClass184_3797, anInt3794, anInt3795);
		anInterface21_3788 = anInterface40_3785.method269(0);
		anInterface40_3786 = aClass180_Sub2_3781.method15027(Class157.aClass157_1723, aClass184_3797, anInt3794, anInt3795);
		anInterface21_3803 = anInterface40_3786.method269(0);
		anInterface23_3796 = aClass180_Sub2_3781.method3111(anInterface40_3786.method1(), anInterface40_3786.method87());
		int i = aVector3799.size();
		for (int i_27_ = 0; i_27_ < i; i_27_++) {
			Class340 class340 = (Class340) aVector3799.elementAt(i_27_);
			class340.method6040(anInt3794, anInt3795);
		}
	}

	boolean method6239(Vector vector, int i, Class340 class340) {
		if (class340.method6036() || class340.method6055()) {
			vector.insertElementAt(class340, i);
			class340.method6040(anInt3794, anInt3795);
			int i_28_ = class340.method6045();
			if (i_28_ > anInt3802)
				anInt3802 = i_28_;
			class340.aBool3674 = true;
			return true;
		}
		return false;
	}

	boolean method6240(Vector vector, int i, Class340 class340) {
		if (class340.method6036() || class340.method6055()) {
			vector.insertElementAt(class340, i);
			class340.method6040(anInt3794, anInt3795);
			int i_29_ = class340.method6045();
			if (i_29_ > anInt3802)
				anInt3802 = i_29_;
			class340.aBool3674 = true;
			return true;
		}
		return false;
	}

	void method6241() {
		if (aClass171_Sub2_3782 != null) {
			aClass171_Sub2_3782.method129();
			aClass171_Sub2_3782 = null;
		}
		if (anInterface21_3801 != null) {
			anInterface21_3801.method129();
			anInterface21_3801 = null;
		}
		if (anInterface23_3792 != null) {
			anInterface23_3792.method129();
			anInterface23_3792 = null;
		}
		if (aClass171_Sub2_3783 != null)
			aClass171_Sub2_3783.method129();
		if (anInterface21_3787 != null)
			anInterface21_3787.method129();
		if (anInterface21_3788 != null)
			anInterface21_3788.method129();
		if (anInterface21_3803 != null)
			anInterface21_3803.method129();
		if (anInterface40_3784 != null)
			anInterface40_3784.method129();
		if (anInterface40_3785 != null)
			anInterface40_3785.method129();
		if (anInterface40_3786 != null)
			anInterface40_3786.method129();
		if (anInterface23_3796 != null)
			anInterface23_3796.method129();
		int i = aVector3799.size();
		for (int i_30_ = 0; i_30_ < i; i_30_++) {
			Class340 class340 = (Class340) aVector3799.elementAt(i_30_);
			class340.method6039();
		}
	}

	Class353(Class180_Sub2 class180_sub2, int i, int i_31_) {
		anInt3791 = 0;
		aClass180_Sub2_3781 = class180_sub2;
		aClass184_3797 = Class184.aClass184_2104;
		anInt3794 = i;
		anInt3795 = i_31_;
	}

	void method6242(Class340 class340) {
		class340.method6039();
		class340.aBool3674 = false;
		aVector3799.removeElement(class340);
	}

	void method6243(int i, int i_32_) {
		aClass180_Sub2_3781.method3124(true);
		aClass180_Sub2_3781.method15011();
		aClass180_Sub2_3781.method15238(0);
		aClass180_Sub2_3781.method14973(1);
		aClass180_Sub2_3781.method3131();
		aClass171_Sub2_3783.method15324(null);
		aClass180_Sub2_3781.method14927(0, 0);
		int i_33_ = aVector3799.size();
		Vector vector = aVector3799;
		for (int i_34_ = 0; i_34_ < i_33_; i_34_++) {
			if (((Class340) aVector3799.elementAt(i_34_)).method6048()) {
				vector = new Vector();
				for (int i_35_ = 0; i_35_ < i_33_; i_35_++) {
					if (!((Class340) aVector3799.elementAt(i_35_)).method6048())
						vector.addElement(aVector3799.elementAt(i_35_));
				}
				i_33_ = vector.size();
				break;
			}
		}
		anInterface40_3786.method260();
		for (int i_36_ = 0; i_36_ < i_33_; i_36_++) {
			Class340 class340 = (Class340) vector.elementAt(i_36_);
			int i_37_ = class340.method6043();
			boolean bool = i_36_ == i_33_ - 1;
			boolean bool_38_ = false;
			for (int i_39_ = 0; i_39_ < i_37_; i_39_++) {
				if (i_39_ == i_37_ - 1) {
					if (bool) {
						aClass180_Sub2_3781.method3107(aClass171_Sub2_3783, -677418425);
						aClass180_Sub2_3781.method3132(anInt3790, anInt3793, anInt3790 + i, anInt3793 + i_32_);
					} else {
						bool_38_ = true;
						aClass171_Sub2_3783.method15321(0, anInterface21_3803);
					}
				} else
					aClass171_Sub2_3783.method15321(0, anInterface21_3788);
				Interface40 interface40 = anInterface40_3784;
				if (i_39_ == 0)
					interface40 = anInterface40_3786;
				class340.method6070(i_39_, aClass171_Sub2_3783, interface40, anInterface23_3796, anInterface40_3786, bool && i_39_ == i_37_ - 1);
				method6220();
				class340.method6041(i_39_);
				if (bool_38_)
					anInterface40_3786.method260();
				Interface40 interface40_40_ = anInterface40_3784;
				anInterface40_3784 = anInterface40_3785;
				anInterface40_3785 = interface40_40_;
				Interface21 interface21 = anInterface21_3787;
				anInterface21_3787 = anInterface21_3788;
				anInterface21_3788 = interface21;
			}
		}
		aClass180_Sub2_3781.method15238(1);
		aClass180_Sub2_3781.method14973(0);
		aClass180_Sub2_3781.method3124(false);
		aClass180_Sub2_3781.method3131();
		Object object = null;
	}

	void method6244(Class340 class340) {
		class340.method6039();
		class340.aBool3674 = false;
		aVector3799.removeElement(class340);
	}

	boolean method6245(int i, int i_41_, int i_42_, int i_43_) {
		if (aVector3799.isEmpty() || method6223())
			return true;
		if (anInt3794 != i_42_ || anInt3795 != i_43_ || aClass180_Sub2_3781.anInt9573 != anInt3791) {
			anInt3791 = aClass180_Sub2_3781.anInt9573;
			anInt3794 = i_42_;
			anInt3795 = i_43_;
			method6241();
			method6218();
		}
		aClass171_Sub2_3783.method15321(0, anInterface21_3803);
		if (anInterface23_3796 != null)
			aClass171_Sub2_3783.method15324(anInterface23_3796);
		if (aClass171_Sub2_3782 != null) {
			aClass171_Sub2_3782.method15321(0, anInterface21_3801);
			aClass171_Sub2_3782.method15324(anInterface23_3792);
			aClass180_Sub2_3781.method3106(aClass171_Sub2_3782, (byte) -90);
		} else
			aClass180_Sub2_3781.method3106(aClass171_Sub2_3783, (byte) -44);
		if (!aClass171_Sub2_3783.method15322()) {
			aClass180_Sub2_3781.method3107((aClass171_Sub2_3782 != null ? aClass171_Sub2_3782 : aClass171_Sub2_3783), -677418425);
			return false;
		}
		anInt3790 = i;
		anInt3793 = i_41_;
		aClass180_Sub2_3781.method3136(3, -16777216);
		aClass180_Sub2_3781.method14991(15);
		aClass180_Sub2_3781.method14989(0);
		aBool3798 = true;
		return true;
	}

	boolean method6246(int i, int i_44_, int i_45_, int i_46_) {
		if (aVector3799.isEmpty() || method6223())
			return true;
		if (anInt3794 != i_45_ || anInt3795 != i_46_ || aClass180_Sub2_3781.anInt9573 != anInt3791) {
			anInt3791 = aClass180_Sub2_3781.anInt9573;
			anInt3794 = i_45_;
			anInt3795 = i_46_;
			method6241();
			method6218();
		}
		aClass171_Sub2_3783.method15321(0, anInterface21_3803);
		if (anInterface23_3796 != null)
			aClass171_Sub2_3783.method15324(anInterface23_3796);
		if (aClass171_Sub2_3782 != null) {
			aClass171_Sub2_3782.method15321(0, anInterface21_3801);
			aClass171_Sub2_3782.method15324(anInterface23_3792);
			aClass180_Sub2_3781.method3106(aClass171_Sub2_3782, (byte) -36);
		} else
			aClass180_Sub2_3781.method3106(aClass171_Sub2_3783, (byte) 2);
		if (!aClass171_Sub2_3783.method15322()) {
			aClass180_Sub2_3781.method3107((aClass171_Sub2_3782 != null ? aClass171_Sub2_3782 : aClass171_Sub2_3783), -677418425);
			return false;
		}
		anInt3790 = i;
		anInt3793 = i_44_;
		aClass180_Sub2_3781.method3136(3, -16777216);
		aClass180_Sub2_3781.method14991(15);
		aClass180_Sub2_3781.method14989(0);
		aBool3798 = true;
		return true;
	}

	boolean method6247(int i, int i_47_, int i_48_, int i_49_) {
		if (aVector3799.isEmpty() || method6223())
			return true;
		if (anInt3794 != i_48_ || anInt3795 != i_49_ || aClass180_Sub2_3781.anInt9573 != anInt3791) {
			anInt3791 = aClass180_Sub2_3781.anInt9573;
			anInt3794 = i_48_;
			anInt3795 = i_49_;
			method6241();
			method6218();
		}
		aClass171_Sub2_3783.method15321(0, anInterface21_3803);
		if (anInterface23_3796 != null)
			aClass171_Sub2_3783.method15324(anInterface23_3796);
		if (aClass171_Sub2_3782 != null) {
			aClass171_Sub2_3782.method15321(0, anInterface21_3801);
			aClass171_Sub2_3782.method15324(anInterface23_3792);
			aClass180_Sub2_3781.method3106(aClass171_Sub2_3782, (byte) -19);
		} else
			aClass180_Sub2_3781.method3106(aClass171_Sub2_3783, (byte) -55);
		if (!aClass171_Sub2_3783.method15322()) {
			aClass180_Sub2_3781.method3107((aClass171_Sub2_3782 != null ? aClass171_Sub2_3782 : aClass171_Sub2_3783), -677418425);
			return false;
		}
		anInt3790 = i;
		anInt3793 = i_47_;
		aClass180_Sub2_3781.method3136(3, -16777216);
		aClass180_Sub2_3781.method14991(15);
		aClass180_Sub2_3781.method14989(0);
		aBool3798 = true;
		return true;
	}

	void method6248(int i, int i_50_) {
		if (aBool3798) {
			if (aClass171_Sub2_3782 != null) {
				aClass180_Sub2_3781.method3107(aClass171_Sub2_3782, -677418425);
				aClass180_Sub2_3781.method3106(aClass171_Sub2_3783, (byte) -122);
				aClass171_Sub2_3782.method15330(0, 0, anInt3794, anInt3795, 0, 0, true, anInterface23_3796 != null);
			}
			method6243(i, i_50_);
			aBool3798 = false;
		}
	}

	void method6249() {
		method6216();
		switch (anInt3802) {
		default:
			throw new RuntimeException();
		case 1:
			aClass184_3797 = Class184.aClass184_2108;
			break;
		case 2:
			aClass184_3797 = Class184.aClass184_2109;
			break;
		case 0:
			aClass184_3797 = Class184.aClass184_2104;
		}
		aClass171_Sub2_3783 = aClass180_Sub2_3781.method3109();
		if (aClass180_Sub2_3781.anInt9573 > 1 && aClass180_Sub2_3781.aBool9494 && aClass180_Sub2_3781.aBool9567) {
			aClass171_Sub2_3782 = aClass180_Sub2_3781.method3109();
			anInterface21_3801 = aClass180_Sub2_3781.method3419(anInt3794, anInt3795, Class157.aClass157_1723, aClass184_3797, (aClass180_Sub2_3781.anInt9573));
			anInterface23_3792 = aClass180_Sub2_3781.method3156(anInt3794, anInt3795, (aClass180_Sub2_3781.anInt9573));
		}
		anInterface40_3784 = aClass180_Sub2_3781.method15027(Class157.aClass157_1723, aClass184_3797, anInt3794, anInt3795);
		anInterface21_3787 = anInterface40_3784.method269(0);
		anInterface40_3785 = aClass180_Sub2_3781.method15027(Class157.aClass157_1723, aClass184_3797, anInt3794, anInt3795);
		anInterface21_3788 = anInterface40_3785.method269(0);
		anInterface40_3786 = aClass180_Sub2_3781.method15027(Class157.aClass157_1723, aClass184_3797, anInt3794, anInt3795);
		anInterface21_3803 = anInterface40_3786.method269(0);
		anInterface23_3796 = aClass180_Sub2_3781.method3111(anInterface40_3786.method1(), anInterface40_3786.method87());
		int i = aVector3799.size();
		for (int i_51_ = 0; i_51_ < i; i_51_++) {
			Class340 class340 = (Class340) aVector3799.elementAt(i_51_);
			class340.method6040(anInt3794, anInt3795);
		}
	}

	void method6250() {
		if (anInterface37_3800 == null) {
			anInterface37_3800 = aClass180_Sub2_3781.method15035(false);
			anInterface37_3800.method219(12, 4);
			ByteBuffer bytebuffer = aClass180_Sub2_3781.aByteBuffer9438;
			bytebuffer.clear();
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(2.0F);
			anInterface37_3800.method213(0, bytebuffer.position(), aClass180_Sub2_3781.aLong9439);
			aClass355_3789 = (aClass180_Sub2_3781.method14999(new Class372[] { new Class372(Class347.aClass347_3735) }));
		}
	}

	void method6251(int i, int i_52_) {
		aClass180_Sub2_3781.method3124(true);
		aClass180_Sub2_3781.method15011();
		aClass180_Sub2_3781.method15238(0);
		aClass180_Sub2_3781.method14973(1);
		aClass180_Sub2_3781.method3131();
		aClass171_Sub2_3783.method15324(null);
		aClass180_Sub2_3781.method14927(0, 0);
		int i_53_ = aVector3799.size();
		Vector vector = aVector3799;
		for (int i_54_ = 0; i_54_ < i_53_; i_54_++) {
			if (((Class340) aVector3799.elementAt(i_54_)).method6048()) {
				vector = new Vector();
				for (int i_55_ = 0; i_55_ < i_53_; i_55_++) {
					if (!((Class340) aVector3799.elementAt(i_55_)).method6048())
						vector.addElement(aVector3799.elementAt(i_55_));
				}
				i_53_ = vector.size();
				break;
			}
		}
		anInterface40_3786.method260();
		for (int i_56_ = 0; i_56_ < i_53_; i_56_++) {
			Class340 class340 = (Class340) vector.elementAt(i_56_);
			int i_57_ = class340.method6043();
			boolean bool = i_56_ == i_53_ - 1;
			boolean bool_58_ = false;
			for (int i_59_ = 0; i_59_ < i_57_; i_59_++) {
				if (i_59_ == i_57_ - 1) {
					if (bool) {
						aClass180_Sub2_3781.method3107(aClass171_Sub2_3783, -677418425);
						aClass180_Sub2_3781.method3132(anInt3790, anInt3793, anInt3790 + i, anInt3793 + i_52_);
					} else {
						bool_58_ = true;
						aClass171_Sub2_3783.method15321(0, anInterface21_3803);
					}
				} else
					aClass171_Sub2_3783.method15321(0, anInterface21_3788);
				Interface40 interface40 = anInterface40_3784;
				if (i_59_ == 0)
					interface40 = anInterface40_3786;
				class340.method6070(i_59_, aClass171_Sub2_3783, interface40, anInterface23_3796, anInterface40_3786, bool && i_59_ == i_57_ - 1);
				method6220();
				class340.method6041(i_59_);
				if (bool_58_)
					anInterface40_3786.method260();
				Interface40 interface40_60_ = anInterface40_3784;
				anInterface40_3784 = anInterface40_3785;
				anInterface40_3785 = interface40_60_;
				Interface21 interface21 = anInterface21_3787;
				anInterface21_3787 = anInterface21_3788;
				anInterface21_3788 = interface21;
			}
		}
		aClass180_Sub2_3781.method15238(1);
		aClass180_Sub2_3781.method14973(0);
		aClass180_Sub2_3781.method3124(false);
		aClass180_Sub2_3781.method3131();
		Object object = null;
	}

	void method6252() {
		if (aClass171_Sub2_3782 != null) {
			aClass171_Sub2_3782.method129();
			aClass171_Sub2_3782 = null;
		}
		if (anInterface21_3801 != null) {
			anInterface21_3801.method129();
			anInterface21_3801 = null;
		}
		if (anInterface23_3792 != null) {
			anInterface23_3792.method129();
			anInterface23_3792 = null;
		}
		if (aClass171_Sub2_3783 != null)
			aClass171_Sub2_3783.method129();
		if (anInterface21_3787 != null)
			anInterface21_3787.method129();
		if (anInterface21_3788 != null)
			anInterface21_3788.method129();
		if (anInterface21_3803 != null)
			anInterface21_3803.method129();
		if (anInterface40_3784 != null)
			anInterface40_3784.method129();
		if (anInterface40_3785 != null)
			anInterface40_3785.method129();
		if (anInterface40_3786 != null)
			anInterface40_3786.method129();
		if (anInterface23_3796 != null)
			anInterface23_3796.method129();
		int i = aVector3799.size();
		for (int i_61_ = 0; i_61_ < i; i_61_++) {
			Class340 class340 = (Class340) aVector3799.elementAt(i_61_);
			class340.method6039();
		}
	}

	void method6253() {
		if (aClass171_Sub2_3782 != null) {
			aClass171_Sub2_3782.method129();
			aClass171_Sub2_3782 = null;
		}
		if (anInterface21_3801 != null) {
			anInterface21_3801.method129();
			anInterface21_3801 = null;
		}
		if (anInterface23_3792 != null) {
			anInterface23_3792.method129();
			anInterface23_3792 = null;
		}
		if (aClass171_Sub2_3783 != null)
			aClass171_Sub2_3783.method129();
		if (anInterface21_3787 != null)
			anInterface21_3787.method129();
		if (anInterface21_3788 != null)
			anInterface21_3788.method129();
		if (anInterface21_3803 != null)
			anInterface21_3803.method129();
		if (anInterface40_3784 != null)
			anInterface40_3784.method129();
		if (anInterface40_3785 != null)
			anInterface40_3785.method129();
		if (anInterface40_3786 != null)
			anInterface40_3786.method129();
		if (anInterface23_3796 != null)
			anInterface23_3796.method129();
		int i = aVector3799.size();
		for (int i_62_ = 0; i_62_ < i; i_62_++) {
			Class340 class340 = (Class340) aVector3799.elementAt(i_62_);
			class340.method6039();
		}
	}
}
