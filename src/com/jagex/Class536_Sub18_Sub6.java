/* Class536_Sub18_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class536_Sub18_Sub6 extends Class536_Sub18 {
	Class700 aClass700_11683;
	String aString11684;
	int anInt11685;

	boolean method10691(Class536_Sub18_Sub9 class536_sub18_sub9, int i) {
		boolean bool = true;
		class536_sub18_sub9.method9521(-360576387);
		Class536_Sub18_Sub9 class536_sub18_sub9_0_ = (Class536_Sub18_Sub9) aClass700_11683.method8248(1433470694);
		while (class536_sub18_sub9_0_ != null) {
			if (Class649_Sub1_Sub5_Sub2.method10936(-517484763 * class536_sub18_sub9.anInt11718, -517484763 * class536_sub18_sub9_0_.anInt11718, -1681281182)) {
				Class438.method5300(class536_sub18_sub9, class536_sub18_sub9_0_, -1141085828);
				anInt11685 += 196395293;
				return !bool;
			}
			class536_sub18_sub9_0_ = ((Class536_Sub18_Sub9) aClass700_11683.method8241(-1831969467));
			bool = false;
		}
		aClass700_11683.method8239(class536_sub18_sub9, (byte) -4);
		anInt11685 += 196395293;
		return bool;
	}

	boolean method10692(Class536_Sub18_Sub9 class536_sub18_sub9, byte i) {
		int i_1_ = method10694((byte) 114);
		class536_sub18_sub9.method9521(-1869075396);
		anInt11685 -= 196395293;
		if (-606992075 * anInt11685 == 0) {
			method6484(-529542311);
			method9521(-789580585);
			Class70.anInt761 -= 389540193;
			Class70.aClass199_757.method2881(this, (class536_sub18_sub9.aLong11719 * 4372728678228642485L));
			return false;
		}
		return i_1_ != method10694((byte) 6);
	}

	int method10693() {
		if (aClass700_11683.aClass536_Sub18_8794.aClass536_Sub18_10506 != aClass700_11683.aClass536_Sub18_8794)
			return (((Class536_Sub18_Sub9) (aClass700_11683.aClass536_Sub18_8794.aClass536_Sub18_10506)).anInt11718 * -517484763);
		return -1;
	}

	int method10694(byte i) {
		if (aClass700_11683.aClass536_Sub18_8794.aClass536_Sub18_10506 != aClass700_11683.aClass536_Sub18_8794)
			return (((Class536_Sub18_Sub9) (aClass700_11683.aClass536_Sub18_8794.aClass536_Sub18_10506)).anInt11718 * -517484763);
		return -1;
	}

	Class536_Sub18_Sub6(String string) {
		aString11684 = string;
		aClass700_11683 = new Class700();
	}
}
