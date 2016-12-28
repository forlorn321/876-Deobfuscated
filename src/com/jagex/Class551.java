/* Class551 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.HashMap;
import java.util.Iterator;

class Class551 implements Runnable {
	Class360_Sub1 this$0;

	public void method6685() {
		try {
			while (!this$0.aBool10163) {
				HashMap hashmap = this$0.method9265(-343423583);
				Iterator iterator = hashmap.keySet().iterator();
				while (iterator.hasNext()) {
					Class489 class489 = (Class489) iterator.next();
					if (!class489.aBool5464) {
						Class492[] class492s = (Class492[]) hashmap.get(class489);
						for (int i = 0; i < class492s.length; i++)
							class492s[i].method5923(-1534344575);
					}
				}
				Class212.method3067(10L);
			}
		} catch (Exception exception) {
			Class81.method1165(null, exception, (byte) -16);
			exception.printStackTrace();
		}
	}

	public void run() {
		try {
			while (!this$0.aBool10163) {
				HashMap hashmap = this$0.method9265(-343423583);
				Iterator iterator = hashmap.keySet().iterator();
				while (iterator.hasNext()) {
					Class489 class489 = (Class489) iterator.next();
					if (!class489.aBool5464) {
						Class492[] class492s = (Class492[]) hashmap.get(class489);
						for (int i = 0; i < class492s.length; i++)
							class492s[i].method5923(-1520538367);
					}
				}
				Class212.method3067(10L);
			}
		} catch (Exception exception) {
			Class81.method1165(null, exception, (byte) 39);
			exception.printStackTrace();
		}
	}

	Class551(Class360_Sub1 class360_sub1) {
		this$0 = class360_sub1;
	}

	static final boolean method6686(Class34_Sub17 class34_sub17, int i, int i_0_, int i_1_) {
		ObjTypeDecoder class612 = (ObjTypeDecoder) class34_sub17.method70(i, (byte) -125);
		if (11 == i_0_)
			i_0_ = 10;
		if (i_0_ >= 5 && i_0_ <= 8)
			i_0_ = 4;
		return class612.method7286(i_0_, -269303500);
	}
}
