/* Class567_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;
import java.net.Socket;

public class Class567_Sub1 extends Class567 {
	Socket aSocket10812;
	Class561 aClass561_10813;
	Class566 aClass566_10814;

	void method9873() {
		method6913(-842345557);
	}

	public void method6910() {
		aClass566_10814.method6880(1093424338);
		try {
			aSocket10812.close();
		} catch (IOException ioexception) {
			/* empty */
		}
		aClass561_10813.method6842((short) 255);
	}

	public boolean bitsRemaining(int i, int i_0_) throws IOException {
		return aClass561_10813.method6833(i, -1018890561);
	}

	public void method6913(int i) {
		aClass566_10814.method6880(1128022232);
		try {
			aSocket10812.close();
		} catch (IOException ioexception) {
			/* empty */
		}
		aClass561_10813.method6842((short) 255);
	}

	public void method6912(byte[] is, int i, int i_1_, byte i_2_) throws IOException {
		aClass566_10814.method6889(is, i, i_1_, -256887285);
	}

	public void method6905() {
		aClass561_10813.method6834(-999999);
		aClass566_10814.method6883(499106372);
	}

	public void method6902(int i) {
		aClass561_10813.method6834(-999999);
		aClass566_10814.method6883(1266394062);
	}

	public void finalize() {
		method6913(-842345557);
	}

	public int method6898(int i) throws IOException {
		return aClass561_10813.method6831(-265873754);
	}

	void method9874() {
		method6913(-842345557);
	}

	public boolean method6903(int i) throws IOException {
		return aClass561_10813.method6833(i, -1018890561);
	}

	public boolean method6904(int i) throws IOException {
		return aClass561_10813.method6833(i, -1018890561);
	}

	public int method6901() throws IOException {
		return aClass561_10813.method6831(-1367912423);
	}

	public int method6906() throws IOException {
		return aClass561_10813.method6831(-401611573);
	}

	public int method6907(byte[] is, int i, int i_3_) throws IOException {
		return aClass561_10813.method6832(is, i, i_3_, -310471644);
	}

	public int method6908(byte[] is, int i, int i_4_) throws IOException {
		return aClass561_10813.method6832(is, i, i_4_, -1959499365);
	}

	public void method6909(byte[] is, int i, int i_5_) throws IOException {
		aClass566_10814.method6889(is, i, i_5_, -1080348444);
	}

	public int method6899(byte[] is, int i, int i_6_, int i_7_) throws IOException {
		return aClass561_10813.method6832(is, i, i_6_, 1059600987);
	}

	public void method6911() {
		aClass566_10814.method6880(1038678466);
		try {
			aSocket10812.close();
		} catch (IOException ioexception) {
			/* empty */
		}
		aClass561_10813.method6842((short) 255);
	}

	public void method6900() {
		aClass561_10813.method6834(-999999);
		aClass566_10814.method6883(-1176817405);
	}

	Class567_Sub1(Socket socket, int i) throws IOException {
		aSocket10812 = socket;
		aSocket10812.setSoTimeout(30000);
		aSocket10812.setTcpNoDelay(true);
		aSocket10812.setReceiveBufferSize(65536);
		aSocket10812.setSendBufferSize(65536);
		aClass561_10813 = new Class561(aSocket10812.getInputStream(), i);
		aClass566_10814 = new Class566(aSocket10812.getOutputStream(), i);
	}

	static final void method9875(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 0;
	}

	public static int method9876(int i, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_) {
		if ((i_12_ & 0x1) == 1) {
			int i_14_ = i_10_;
			i_10_ = i_11_;
			i_11_ = i_14_;
		}
		i_9_ &= 0x3;
		if (i_9_ == 0)
			return i_8_;
		if (1 == i_9_)
			return 7 - i - (i_10_ - 1);
		if (i_9_ == 2)
			return 7 - i_8_ - (i_11_ - 1);
		return i;
	}
}
