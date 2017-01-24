/* Class536_Sub18_Sub15_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class Class536_Sub18_Sub15_Sub3 extends MainFile {
	Future aFuture12158;
	int anInt12159;

	int getCompletionPercent() {
		if (aFuture12158 == null)
			return 0;
		return aFuture12158.isDone() ? 100 : 0;
	}

	byte[] method10773() {
		do {
			if (aFuture12158.isDone()) {
				byte[] is;
				try {
					is = ((Class473) aFuture12158.get()).method5738(-1799593945);
				} catch (InterruptedException interruptedexception) {
					interruptedexception.printStackTrace();
					break;
				} catch (ExecutionException executionexception) {
					executionexception.printStackTrace();
					break;
				}
				return is;
			}
		} while (false);
		return null;
	}

	byte[] getData(int i) {
		do {
			if (aFuture12158.isDone()) {
				byte[] is;
				try {
					is = ((Class473) aFuture12158.get()).method5738(-263941760);
				} catch (InterruptedException interruptedexception) {
					interruptedexception.printStackTrace();
					break;
				} catch (ExecutionException executionexception) {
					executionexception.printStackTrace();
					break;
				}
				return is;
			}
		} while (false);
		return null;
	}

	void method11063(Future future, int i) {
		aFuture12158 = future;
	}

	Class536_Sub18_Sub15_Sub3(int i) {
		anInt12159 = -774433147 * i;
	}

	int method10774() {
		if (aFuture12158 == null)
			return 0;
		return aFuture12158.isDone() ? 100 : 0;
	}

	int method10772() {
		if (aFuture12158 == null)
			return 0;
		return aFuture12158.isDone() ? 100 : 0;
	}

	int method10775() {
		if (aFuture12158 == null)
			return 0;
		return aFuture12158.isDone() ? 100 : 0;
	}
}
