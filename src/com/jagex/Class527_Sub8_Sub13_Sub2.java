/* Class527_Sub8_Sub13_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class Class527_Sub8_Sub13_Sub2 extends Class527_Sub8_Sub13 {
	Future aFuture12107;
	int anInt12108;

	int method18321() {
		if (null == aFuture12107)
			return 0;
		return aFuture12107.isDone() ? 100 : 0;
	}

	int method18324() {
		if (null == aFuture12107)
			return 0;
		return aFuture12107.isDone() ? 100 : 0;
	}

	byte[] method18319(int i) {
		do {
			if (aFuture12107.isDone()) {
				byte[] is;
				try {
					is = ((Class451) aFuture12107.get()).method7289(-539680523);
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

	void method18783(Future future, byte i) {
		aFuture12107 = future;
	}

	Class527_Sub8_Sub13_Sub2(int i) {
		anInt12108 = i * 1861563489;
	}

	byte[] method18322() {
		do {
			if (aFuture12107.isDone()) {
				byte[] is;
				try {
					is = ((Class451) aFuture12107.get()).method7289(114125580);
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

	int method18323(byte i) {
		if (null == aFuture12107)
			return 0;
		return aFuture12107.isDone() ? 100 : 0;
	}

	byte[] method18325() {
		do {
			if (aFuture12107.isDone()) {
				byte[] is;
				try {
					is = ((Class451) aFuture12107.get()).method7289(-1752236941);
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

	int method18320() {
		if (null == aFuture12107)
			return 0;
		return aFuture12107.isDone() ? 100 : 0;
	}

	int method18326() {
		if (null == aFuture12107)
			return 0;
		return aFuture12107.isDone() ? 100 : 0;
	}

	int method18327() {
		if (null == aFuture12107)
			return 0;
		return aFuture12107.isDone() ? 100 : 0;
	}

	void method18784(Future future) {
		aFuture12107 = future;
	}
}
