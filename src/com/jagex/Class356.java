/* Class356 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.nio.ByteBuffer;
import java.util.Vector;

public class Class356 {
	Vector aVector3776;
	Class183_Sub2 aClass183_Sub2_3777;
	Class183_Sub2 aClass183_Sub2_3778;
	Interface44 anInterface44_3779;
	Interface44 anInterface44_3780;
	Interface21 anInterface21_3781;
	Interface22 anInterface22_3782;
	Interface22 anInterface22_3783;
	Interface22 anInterface22_3784;
	Interface22 anInterface22_3785;
	Interface21 anInterface21_3786;
	int anInt3787 = 0;
	Class167_Sub3 aClass167_Sub3_3788;
	int anInt3789;
	boolean aBool3790;
	int anInt3791;
	Class171 aClass171_3792;
	int anInt3793;
	int anInt3794;
	Interface38 anInterface38_3795;
	Class343 aClass343_3796;
	int anInt3797;
	Interface44 anInterface44_3798;

	void method4659() {
		aClass167_Sub3_3788.method8808(0, anInterface38_3795);
		aClass167_Sub3_3788.method8807(aClass343_3796);
		aClass167_Sub3_3788.method8815(Class377.aClass377_3917, 0, 1);
	}

	void method4660() {
		method4669();
		switch (anInt3797) {
		case 1:
			aClass171_3792 = Class171.aClass171_1902;
			break;
		default:
			throw new RuntimeException();
		case 0:
			aClass171_3792 = Class171.aClass171_1905;
			break;
		case 2:
			aClass171_3792 = Class171.aClass171_1903;
		}
		aClass183_Sub2_3778 = aClass167_Sub3_3788.method2304();
		if (aClass167_Sub3_3788.anInt9568 > 1 && aClass167_Sub3_3788.aBool9658 && aClass167_Sub3_3788.aBool9694) {
			aClass183_Sub2_3777 = aClass167_Sub3_3788.method2304();
			anInterface22_3785 = aClass167_Sub3_3788.method2032(anInt3793, anInt3789, Class155.aClass155_1722, aClass171_3792, (aClass167_Sub3_3788.anInt9568));
			anInterface21_3781 = aClass167_Sub3_3788.method2229(anInt3793, anInt3789, (aClass167_Sub3_3788.anInt9568));
		}
		anInterface44_3779 = aClass167_Sub3_3788.method8779(Class155.aClass155_1722, aClass171_3792, anInt3793, anInt3789);
		anInterface22_3782 = anInterface44_3779.method331(0);
		anInterface44_3798 = aClass167_Sub3_3788.method8779(Class155.aClass155_1722, aClass171_3792, anInt3793, anInt3789);
		anInterface22_3783 = anInterface44_3798.method331(0);
		anInterface44_3780 = aClass167_Sub3_3788.method8779(Class155.aClass155_1722, aClass171_3792, anInt3793, anInt3789);
		anInterface22_3784 = anInterface44_3780.method331(0);
		anInterface21_3786 = aClass167_Sub3_3788.method2386(anInterface44_3780.method1(), anInterface44_3780.method78());
		int i = aVector3776.size();
		for (int i_0_ = 0; i_0_ < i; i_0_++) {
			Class338 class338 = (Class338) aVector3776.elementAt(i_0_);
			class338.method4391(anInt3793, anInt3789);
		}
	}

	boolean method4661(Vector vector, int i, Class338 class338) {
		if (class338.method4387() || class338.method4388()) {
			vector.insertElementAt(class338, i);
			class338.method4391(anInt3793, anInt3789);
			int i_1_ = class338.method4395();
			if (i_1_ > anInt3797)
				anInt3797 = i_1_;
			class338.aBool3648 = true;
			return true;
		}
		return false;
	}

	boolean method4662(Class338 class338) {
		Vector vector = new Vector();
		boolean bool = false;
		for (int i = 0; i < aVector3776.size(); i++) {
			if (!bool && class338.method4418() < method4663(i).method4418()) {
				bool = true;
				if (!method4661(vector, vector.size(), class338))
					return false;
			}
			vector.addElement(method4663(i));
		}
		if (!bool && !method4661(vector, vector.size(), class338))
			return false;
		aVector3776 = vector;
		return true;
	}

	Class338 method4663(int i) {
		return (Class338) aVector3776.elementAt(i);
	}

	boolean method4664() {
		int i = aVector3776.size();
		for (int i_2_ = 0; i_2_ < i; i_2_++) {
			if (!((Class338) aVector3776.elementAt(i_2_)).method4398())
				return false;
		}
		return true;
	}

	boolean method4665(int i, int i_3_, int i_4_, int i_5_) {
		if (aVector3776.isEmpty() || method4664())
			return true;
		if (anInt3793 != i_4_ || anInt3789 != i_5_ || aClass167_Sub3_3788.anInt9568 != anInt3791) {
			anInt3791 = aClass167_Sub3_3788.anInt9568;
			anInt3793 = i_4_;
			anInt3789 = i_5_;
			method4679();
			method4660();
		}
		aClass183_Sub2_3778.method9035(0, anInterface22_3784);
		if (anInterface21_3786 != null)
			aClass183_Sub2_3778.method9037(anInterface21_3786);
		if (aClass183_Sub2_3777 != null) {
			aClass183_Sub2_3777.method9035(0, anInterface22_3785);
			aClass183_Sub2_3777.method9037(anInterface21_3781);
			aClass167_Sub3_3788.method2028(aClass183_Sub2_3777, -409819235);
		} else
			aClass167_Sub3_3788.method2028(aClass183_Sub2_3778, -409819235);
		if (!aClass183_Sub2_3778.method9036()) {
			aClass167_Sub3_3788.method2029((aClass183_Sub2_3777 != null ? aClass183_Sub2_3777 : aClass183_Sub2_3778), (byte) 1);
			return false;
		}
		anInt3794 = i;
		anInt3787 = i_3_;
		aClass167_Sub3_3788.method2000(3, -16777216);
		aClass167_Sub3_3788.method8734(15);
		aClass167_Sub3_3788.method8823(0);
		aBool3790 = true;
		return true;
	}

	void method4666(int i, int i_6_) {
		if (aBool3790) {
			if (aClass183_Sub2_3777 != null) {
				aClass167_Sub3_3788.method2029(aClass183_Sub2_3777, (byte) 1);
				aClass167_Sub3_3788.method2028(aClass183_Sub2_3778, -409819235);
				aClass183_Sub2_3777.method9040(0, 0, anInt3793, anInt3789, 0, 0, true, anInterface21_3786 != null);
			}
			method4667(i, i_6_);
			aBool3790 = false;
		}
	}

	void method4667(int i, int i_7_) {
		aClass167_Sub3_3788.method2245(true);
		aClass167_Sub3_3788.method8929();
		aClass167_Sub3_3788.method8763(0);
		aClass167_Sub3_3788.method8782(1);
		aClass167_Sub3_3788.method2051();
		aClass183_Sub2_3778.method9037(null);
		aClass167_Sub3_3788.method8770(0, 0);
		int i_8_ = aVector3776.size();
		Vector vector = aVector3776;
		for (int i_9_ = 0; i_9_ < i_8_; i_9_++) {
			if (((Class338) aVector3776.elementAt(i_9_)).method4398()) {
				vector = new Vector();
				for (int i_10_ = 0; i_10_ < i_8_; i_10_++) {
					if (!((Class338) aVector3776.elementAt(i_10_)).method4398())
						vector.addElement(aVector3776.elementAt(i_10_));
				}
				i_8_ = vector.size();
				break;
			}
		}
		anInterface44_3780.method230();
		for (int i_11_ = 0; i_11_ < i_8_; i_11_++) {
			Class338 class338 = (Class338) vector.elementAt(i_11_);
			int i_12_ = class338.method4430();
			boolean bool = i_11_ == i_8_ - 1;
			boolean bool_13_ = false;
			for (int i_14_ = 0; i_14_ < i_12_; i_14_++) {
				if (i_14_ == i_12_ - 1) {
					if (bool) {
						aClass167_Sub3_3788.method2029(aClass183_Sub2_3778, (byte) 1);
						aClass167_Sub3_3788.method2369(anInt3794, anInt3787, anInt3794 + i, anInt3787 + i_7_);
					} else {
						bool_13_ = true;
						aClass183_Sub2_3778.method9035(0, anInterface22_3784);
					}
				} else
					aClass183_Sub2_3778.method9035(0, anInterface22_3783);
				Interface44 interface44 = anInterface44_3779;
				if (i_14_ == 0)
					interface44 = anInterface44_3780;
				class338.method4392(i_14_, aClass183_Sub2_3778, interface44, anInterface21_3786, anInterface44_3780, bool && i_14_ == i_12_ - 1);
				method4659();
				class338.method4407(i_14_);
				if (bool_13_)
					anInterface44_3780.method230();
				Interface44 interface44_15_ = anInterface44_3779;
				anInterface44_3779 = anInterface44_3798;
				anInterface44_3798 = interface44_15_;
				Interface22 interface22 = anInterface22_3782;
				anInterface22_3782 = anInterface22_3783;
				anInterface22_3783 = interface22;
			}
		}
		aClass167_Sub3_3788.method8763(1);
		aClass167_Sub3_3788.method8782(0);
		aClass167_Sub3_3788.method2245(false);
		aClass167_Sub3_3788.method2051();
		Object object = null;
	}

	void method4668() {
		if (anInterface38_3795 == null) {
			anInterface38_3795 = aClass167_Sub3_3788.method8805(false);
			anInterface38_3795.method271(12, 4);
			ByteBuffer bytebuffer = aClass167_Sub3_3788.aByteBuffer9549;
			bytebuffer.clear();
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(2.0F);
			anInterface38_3795.method264(0, bytebuffer.position(), aClass167_Sub3_3788.aLong9586);
			aClass343_3796 = (aClass167_Sub3_3788.method8806(new Class362[] { new Class362(Class355.aClass355_3760) }));
		}
	}

	void method4669() {
		if (anInterface38_3795 == null) {
			anInterface38_3795 = aClass167_Sub3_3788.method8805(false);
			anInterface38_3795.method271(12, 4);
			ByteBuffer bytebuffer = aClass167_Sub3_3788.aByteBuffer9549;
			bytebuffer.clear();
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(2.0F);
			anInterface38_3795.method264(0, bytebuffer.position(), aClass167_Sub3_3788.aLong9586);
			aClass343_3796 = (aClass167_Sub3_3788.method8806(new Class362[] { new Class362(Class355.aClass355_3760) }));
		}
	}

	void method4670() {
		aClass167_Sub3_3788.method8808(0, anInterface38_3795);
		aClass167_Sub3_3788.method8807(aClass343_3796);
		aClass167_Sub3_3788.method8815(Class377.aClass377_3917, 0, 1);
	}

	void method4671(int i, int i_16_) {
		if (aBool3790) {
			if (aClass183_Sub2_3777 != null) {
				aClass167_Sub3_3788.method2029(aClass183_Sub2_3777, (byte) 1);
				aClass167_Sub3_3788.method2028(aClass183_Sub2_3778, -409819235);
				aClass183_Sub2_3777.method9040(0, 0, anInt3793, anInt3789, 0, 0, true, anInterface21_3786 != null);
			}
			method4667(i, i_16_);
			aBool3790 = false;
		}
	}

	void method4672() {
		method4669();
		switch (anInt3797) {
		case 1:
			aClass171_3792 = Class171.aClass171_1902;
			break;
		default:
			throw new RuntimeException();
		case 0:
			aClass171_3792 = Class171.aClass171_1905;
			break;
		case 2:
			aClass171_3792 = Class171.aClass171_1903;
		}
		aClass183_Sub2_3778 = aClass167_Sub3_3788.method2304();
		if (aClass167_Sub3_3788.anInt9568 > 1 && aClass167_Sub3_3788.aBool9658 && aClass167_Sub3_3788.aBool9694) {
			aClass183_Sub2_3777 = aClass167_Sub3_3788.method2304();
			anInterface22_3785 = aClass167_Sub3_3788.method2032(anInt3793, anInt3789, Class155.aClass155_1722, aClass171_3792, (aClass167_Sub3_3788.anInt9568));
			anInterface21_3781 = aClass167_Sub3_3788.method2229(anInt3793, anInt3789, (aClass167_Sub3_3788.anInt9568));
		}
		anInterface44_3779 = aClass167_Sub3_3788.method8779(Class155.aClass155_1722, aClass171_3792, anInt3793, anInt3789);
		anInterface22_3782 = anInterface44_3779.method331(0);
		anInterface44_3798 = aClass167_Sub3_3788.method8779(Class155.aClass155_1722, aClass171_3792, anInt3793, anInt3789);
		anInterface22_3783 = anInterface44_3798.method331(0);
		anInterface44_3780 = aClass167_Sub3_3788.method8779(Class155.aClass155_1722, aClass171_3792, anInt3793, anInt3789);
		anInterface22_3784 = anInterface44_3780.method331(0);
		anInterface21_3786 = aClass167_Sub3_3788.method2386(anInterface44_3780.method1(), anInterface44_3780.method78());
		int i = aVector3776.size();
		for (int i_17_ = 0; i_17_ < i; i_17_++) {
			Class338 class338 = (Class338) aVector3776.elementAt(i_17_);
			class338.method4391(anInt3793, anInt3789);
		}
	}

	void method4673() {
		method4669();
		switch (anInt3797) {
		case 1:
			aClass171_3792 = Class171.aClass171_1902;
			break;
		default:
			throw new RuntimeException();
		case 0:
			aClass171_3792 = Class171.aClass171_1905;
			break;
		case 2:
			aClass171_3792 = Class171.aClass171_1903;
		}
		aClass183_Sub2_3778 = aClass167_Sub3_3788.method2304();
		if (aClass167_Sub3_3788.anInt9568 > 1 && aClass167_Sub3_3788.aBool9658 && aClass167_Sub3_3788.aBool9694) {
			aClass183_Sub2_3777 = aClass167_Sub3_3788.method2304();
			anInterface22_3785 = aClass167_Sub3_3788.method2032(anInt3793, anInt3789, Class155.aClass155_1722, aClass171_3792, (aClass167_Sub3_3788.anInt9568));
			anInterface21_3781 = aClass167_Sub3_3788.method2229(anInt3793, anInt3789, (aClass167_Sub3_3788.anInt9568));
		}
		anInterface44_3779 = aClass167_Sub3_3788.method8779(Class155.aClass155_1722, aClass171_3792, anInt3793, anInt3789);
		anInterface22_3782 = anInterface44_3779.method331(0);
		anInterface44_3798 = aClass167_Sub3_3788.method8779(Class155.aClass155_1722, aClass171_3792, anInt3793, anInt3789);
		anInterface22_3783 = anInterface44_3798.method331(0);
		anInterface44_3780 = aClass167_Sub3_3788.method8779(Class155.aClass155_1722, aClass171_3792, anInt3793, anInt3789);
		anInterface22_3784 = anInterface44_3780.method331(0);
		anInterface21_3786 = aClass167_Sub3_3788.method2386(anInterface44_3780.method1(), anInterface44_3780.method78());
		int i = aVector3776.size();
		for (int i_18_ = 0; i_18_ < i; i_18_++) {
			Class338 class338 = (Class338) aVector3776.elementAt(i_18_);
			class338.method4391(anInt3793, anInt3789);
		}
	}

	void method4674() {
		method4669();
		switch (anInt3797) {
		case 1:
			aClass171_3792 = Class171.aClass171_1902;
			break;
		default:
			throw new RuntimeException();
		case 0:
			aClass171_3792 = Class171.aClass171_1905;
			break;
		case 2:
			aClass171_3792 = Class171.aClass171_1903;
		}
		aClass183_Sub2_3778 = aClass167_Sub3_3788.method2304();
		if (aClass167_Sub3_3788.anInt9568 > 1 && aClass167_Sub3_3788.aBool9658 && aClass167_Sub3_3788.aBool9694) {
			aClass183_Sub2_3777 = aClass167_Sub3_3788.method2304();
			anInterface22_3785 = aClass167_Sub3_3788.method2032(anInt3793, anInt3789, Class155.aClass155_1722, aClass171_3792, (aClass167_Sub3_3788.anInt9568));
			anInterface21_3781 = aClass167_Sub3_3788.method2229(anInt3793, anInt3789, (aClass167_Sub3_3788.anInt9568));
		}
		anInterface44_3779 = aClass167_Sub3_3788.method8779(Class155.aClass155_1722, aClass171_3792, anInt3793, anInt3789);
		anInterface22_3782 = anInterface44_3779.method331(0);
		anInterface44_3798 = aClass167_Sub3_3788.method8779(Class155.aClass155_1722, aClass171_3792, anInt3793, anInt3789);
		anInterface22_3783 = anInterface44_3798.method331(0);
		anInterface44_3780 = aClass167_Sub3_3788.method8779(Class155.aClass155_1722, aClass171_3792, anInt3793, anInt3789);
		anInterface22_3784 = anInterface44_3780.method331(0);
		anInterface21_3786 = aClass167_Sub3_3788.method2386(anInterface44_3780.method1(), anInterface44_3780.method78());
		int i = aVector3776.size();
		for (int i_19_ = 0; i_19_ < i; i_19_++) {
			Class338 class338 = (Class338) aVector3776.elementAt(i_19_);
			class338.method4391(anInt3793, anInt3789);
		}
	}

	void method4675() {
		method4669();
		switch (anInt3797) {
		case 1:
			aClass171_3792 = Class171.aClass171_1902;
			break;
		default:
			throw new RuntimeException();
		case 0:
			aClass171_3792 = Class171.aClass171_1905;
			break;
		case 2:
			aClass171_3792 = Class171.aClass171_1903;
		}
		aClass183_Sub2_3778 = aClass167_Sub3_3788.method2304();
		if (aClass167_Sub3_3788.anInt9568 > 1 && aClass167_Sub3_3788.aBool9658 && aClass167_Sub3_3788.aBool9694) {
			aClass183_Sub2_3777 = aClass167_Sub3_3788.method2304();
			anInterface22_3785 = aClass167_Sub3_3788.method2032(anInt3793, anInt3789, Class155.aClass155_1722, aClass171_3792, (aClass167_Sub3_3788.anInt9568));
			anInterface21_3781 = aClass167_Sub3_3788.method2229(anInt3793, anInt3789, (aClass167_Sub3_3788.anInt9568));
		}
		anInterface44_3779 = aClass167_Sub3_3788.method8779(Class155.aClass155_1722, aClass171_3792, anInt3793, anInt3789);
		anInterface22_3782 = anInterface44_3779.method331(0);
		anInterface44_3798 = aClass167_Sub3_3788.method8779(Class155.aClass155_1722, aClass171_3792, anInt3793, anInt3789);
		anInterface22_3783 = anInterface44_3798.method331(0);
		anInterface44_3780 = aClass167_Sub3_3788.method8779(Class155.aClass155_1722, aClass171_3792, anInt3793, anInt3789);
		anInterface22_3784 = anInterface44_3780.method331(0);
		anInterface21_3786 = aClass167_Sub3_3788.method2386(anInterface44_3780.method1(), anInterface44_3780.method78());
		int i = aVector3776.size();
		for (int i_20_ = 0; i_20_ < i; i_20_++) {
			Class338 class338 = (Class338) aVector3776.elementAt(i_20_);
			class338.method4391(anInt3793, anInt3789);
		}
	}

	void method4676() {
		method4669();
		switch (anInt3797) {
		case 1:
			aClass171_3792 = Class171.aClass171_1902;
			break;
		default:
			throw new RuntimeException();
		case 0:
			aClass171_3792 = Class171.aClass171_1905;
			break;
		case 2:
			aClass171_3792 = Class171.aClass171_1903;
		}
		aClass183_Sub2_3778 = aClass167_Sub3_3788.method2304();
		if (aClass167_Sub3_3788.anInt9568 > 1 && aClass167_Sub3_3788.aBool9658 && aClass167_Sub3_3788.aBool9694) {
			aClass183_Sub2_3777 = aClass167_Sub3_3788.method2304();
			anInterface22_3785 = aClass167_Sub3_3788.method2032(anInt3793, anInt3789, Class155.aClass155_1722, aClass171_3792, (aClass167_Sub3_3788.anInt9568));
			anInterface21_3781 = aClass167_Sub3_3788.method2229(anInt3793, anInt3789, (aClass167_Sub3_3788.anInt9568));
		}
		anInterface44_3779 = aClass167_Sub3_3788.method8779(Class155.aClass155_1722, aClass171_3792, anInt3793, anInt3789);
		anInterface22_3782 = anInterface44_3779.method331(0);
		anInterface44_3798 = aClass167_Sub3_3788.method8779(Class155.aClass155_1722, aClass171_3792, anInt3793, anInt3789);
		anInterface22_3783 = anInterface44_3798.method331(0);
		anInterface44_3780 = aClass167_Sub3_3788.method8779(Class155.aClass155_1722, aClass171_3792, anInt3793, anInt3789);
		anInterface22_3784 = anInterface44_3780.method331(0);
		anInterface21_3786 = aClass167_Sub3_3788.method2386(anInterface44_3780.method1(), anInterface44_3780.method78());
		int i = aVector3776.size();
		for (int i_21_ = 0; i_21_ < i; i_21_++) {
			Class338 class338 = (Class338) aVector3776.elementAt(i_21_);
			class338.method4391(anInt3793, anInt3789);
		}
	}

	void method4677() {
		aClass167_Sub3_3788.method8808(0, anInterface38_3795);
		aClass167_Sub3_3788.method8807(aClass343_3796);
		aClass167_Sub3_3788.method8815(Class377.aClass377_3917, 0, 1);
	}

	void method4678(Class338 class338) {
		class338.method4390();
		class338.aBool3648 = false;
		aVector3776.removeElement(class338);
	}

	void method4679() {
		if (aClass183_Sub2_3777 != null) {
			aClass183_Sub2_3777.method131();
			aClass183_Sub2_3777 = null;
		}
		if (anInterface22_3785 != null) {
			anInterface22_3785.method131();
			anInterface22_3785 = null;
		}
		if (anInterface21_3781 != null) {
			anInterface21_3781.method131();
			anInterface21_3781 = null;
		}
		if (aClass183_Sub2_3778 != null)
			aClass183_Sub2_3778.method131();
		if (anInterface22_3782 != null)
			anInterface22_3782.method131();
		if (anInterface22_3783 != null)
			anInterface22_3783.method131();
		if (anInterface22_3784 != null)
			anInterface22_3784.method131();
		if (anInterface44_3779 != null)
			anInterface44_3779.method131();
		if (anInterface44_3798 != null)
			anInterface44_3798.method131();
		if (anInterface44_3780 != null)
			anInterface44_3780.method131();
		if (anInterface21_3786 != null)
			anInterface21_3786.method131();
		int i = aVector3776.size();
		for (int i_22_ = 0; i_22_ < i; i_22_++) {
			Class338 class338 = (Class338) aVector3776.elementAt(i_22_);
			class338.method4390();
		}
	}

	void method4680(int i, int i_23_) {
		if (aBool3790) {
			if (aClass183_Sub2_3777 != null) {
				aClass167_Sub3_3788.method2029(aClass183_Sub2_3777, (byte) 1);
				aClass167_Sub3_3788.method2028(aClass183_Sub2_3778, -409819235);
				aClass183_Sub2_3777.method9040(0, 0, anInt3793, anInt3789, 0, 0, true, anInterface21_3786 != null);
			}
			method4667(i, i_23_);
			aBool3790 = false;
		}
	}

	Class356(Class167_Sub3 class167_sub3, int i, int i_24_) {
		aVector3776 = new Vector();
		anInt3797 = 0;
		anInt3791 = 0;
		aClass167_Sub3_3788 = class167_sub3;
		aClass171_3792 = Class171.aClass171_1905;
		anInt3793 = i;
		anInt3789 = i_24_;
	}

	void method4681(int i, int i_25_) {
		aClass167_Sub3_3788.method2245(true);
		aClass167_Sub3_3788.method8929();
		aClass167_Sub3_3788.method8763(0);
		aClass167_Sub3_3788.method8782(1);
		aClass167_Sub3_3788.method2051();
		aClass183_Sub2_3778.method9037(null);
		aClass167_Sub3_3788.method8770(0, 0);
		int i_26_ = aVector3776.size();
		Vector vector = aVector3776;
		for (int i_27_ = 0; i_27_ < i_26_; i_27_++) {
			if (((Class338) aVector3776.elementAt(i_27_)).method4398()) {
				vector = new Vector();
				for (int i_28_ = 0; i_28_ < i_26_; i_28_++) {
					if (!((Class338) aVector3776.elementAt(i_28_)).method4398())
						vector.addElement(aVector3776.elementAt(i_28_));
				}
				i_26_ = vector.size();
				break;
			}
		}
		anInterface44_3780.method230();
		for (int i_29_ = 0; i_29_ < i_26_; i_29_++) {
			Class338 class338 = (Class338) vector.elementAt(i_29_);
			int i_30_ = class338.method4430();
			boolean bool = i_29_ == i_26_ - 1;
			boolean bool_31_ = false;
			for (int i_32_ = 0; i_32_ < i_30_; i_32_++) {
				if (i_32_ == i_30_ - 1) {
					if (bool) {
						aClass167_Sub3_3788.method2029(aClass183_Sub2_3778, (byte) 1);
						aClass167_Sub3_3788.method2369(anInt3794, anInt3787, anInt3794 + i, anInt3787 + i_25_);
					} else {
						bool_31_ = true;
						aClass183_Sub2_3778.method9035(0, anInterface22_3784);
					}
				} else
					aClass183_Sub2_3778.method9035(0, anInterface22_3783);
				Interface44 interface44 = anInterface44_3779;
				if (i_32_ == 0)
					interface44 = anInterface44_3780;
				class338.method4392(i_32_, aClass183_Sub2_3778, interface44, anInterface21_3786, anInterface44_3780, bool && i_32_ == i_30_ - 1);
				method4659();
				class338.method4407(i_32_);
				if (bool_31_)
					anInterface44_3780.method230();
				Interface44 interface44_33_ = anInterface44_3779;
				anInterface44_3779 = anInterface44_3798;
				anInterface44_3798 = interface44_33_;
				Interface22 interface22 = anInterface22_3782;
				anInterface22_3782 = anInterface22_3783;
				anInterface22_3783 = interface22;
			}
		}
		aClass167_Sub3_3788.method8763(1);
		aClass167_Sub3_3788.method8782(0);
		aClass167_Sub3_3788.method2245(false);
		aClass167_Sub3_3788.method2051();
		Object object = null;
	}

	boolean method4682() {
		int i = aVector3776.size();
		for (int i_34_ = 0; i_34_ < i; i_34_++) {
			if (!((Class338) aVector3776.elementAt(i_34_)).method4398())
				return false;
		}
		return true;
	}

	void method4683() {
		if (aClass183_Sub2_3777 != null) {
			aClass183_Sub2_3777.method131();
			aClass183_Sub2_3777 = null;
		}
		if (anInterface22_3785 != null) {
			anInterface22_3785.method131();
			anInterface22_3785 = null;
		}
		if (anInterface21_3781 != null) {
			anInterface21_3781.method131();
			anInterface21_3781 = null;
		}
		if (aClass183_Sub2_3778 != null)
			aClass183_Sub2_3778.method131();
		if (anInterface22_3782 != null)
			anInterface22_3782.method131();
		if (anInterface22_3783 != null)
			anInterface22_3783.method131();
		if (anInterface22_3784 != null)
			anInterface22_3784.method131();
		if (anInterface44_3779 != null)
			anInterface44_3779.method131();
		if (anInterface44_3798 != null)
			anInterface44_3798.method131();
		if (anInterface44_3780 != null)
			anInterface44_3780.method131();
		if (anInterface21_3786 != null)
			anInterface21_3786.method131();
		int i = aVector3776.size();
		for (int i_35_ = 0; i_35_ < i; i_35_++) {
			Class338 class338 = (Class338) aVector3776.elementAt(i_35_);
			class338.method4390();
		}
	}
}
