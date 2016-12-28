/* Class581 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.Iterator;

public class Class581 implements Interface66 {
	int anInt7696;
	int anInt7697;
	static int anInt7698;

	Class581(int i, int i_0_) {
		anInt7696 = i * -201695347;
		anInt7697 = 280782435 * i_0_;
	}

	public boolean method422(Class536_Sub31 class536_sub31, Interface63[] interface63s, int i, Class549 class549, int i_1_) {
		for (int i_2_ = 0; i_2_ < i && i_2_ < interface63s.length; i_2_++) {
			Interface63 interface63 = interface63s[i_2_];
			if (null != interface63 && interface63.method413(2041088027) == anInt7696 * 359267141 && (interface63.method419(-1062654062) == 1134906187 * anInt7697))
				return true;
		}
		return false;
	}

	public boolean method424(Class536_Sub31 class536_sub31, Interface63[] interface63s, int i, Class549 class549) {
		for (int i_3_ = 0; i_3_ < i && i_3_ < interface63s.length; i_3_++) {
			Interface63 interface63 = interface63s[i_3_];
			if (null != interface63 && interface63.method413(1713764919) == anInt7696 * 359267141 && interface63.method419(-810946637) == 1134906187 * anInt7697)
				return true;
		}
		return false;
	}

	public boolean method423(Class536_Sub31 class536_sub31, Interface63[] interface63s, int i, Class549 class549) {
		for (int i_4_ = 0; i_4_ < i && i_4_ < interface63s.length; i_4_++) {
			Interface63 interface63 = interface63s[i_4_];
			if (null != interface63 && interface63.method413(2049567893) == anInt7696 * 359267141 && interface63.method419(-701301564) == 1134906187 * anInt7697)
				return true;
		}
		return false;
	}

	static final void method7019(Class668 class668, int i) {
		int i_5_ = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]);
		IComponentDefinitions class251 = Class264.method3678(i_5_, -689214737);
		Class234 class234 = Class463.aClass234Array5227[i_5_ >> 16];
		Class500.method6026(class251, class234, class668, 270983320);
	}

	static final void method7020(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 1915701445 * Class314.anInt3504;
	}

	static final void method7021(Class668 class668, int i) {
		class668.anInt8542 -= 61855783;
		Class426.method5130((class668.anIntArray8541[1 + class668.anInt8542 * 1867269829]), 843097661);
	}

	static final void method7022(int i) {
		Iterator iterator = client.aClass4_11175.iterator();
		while (iterator.hasNext()) {
			Class536_Sub18_Sub4 class536_sub18_sub4 = (Class536_Sub18_Sub4) iterator.next();
			Class649_Sub1_Sub5_Sub4 class649_sub1_sub5_sub4 = class536_sub18_sub4.aClass649_Sub1_Sub5_Sub4_11619;
			if (client.aClass515_11066.method6249(-678261090) != null && class649_sub1_sub5_sub4.method11039(-2019035536))
				client.aClass515_11066.method6249(-1543350227).method6711(class649_sub1_sub5_sub4, true, 894975877);
		}
	}
}
