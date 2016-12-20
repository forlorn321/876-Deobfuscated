/* Class563_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.IOException;
import java.net.Socket;

public class Class563_Sub1 extends Class563 {
	Class550 aClass550_10573;
	Class548 aClass548_10574;
	Socket aSocket10575;

	public boolean method9466(int i, byte i_0_) throws IOException {
		return aClass548_10574.method9076(i, -1332803503);
	}

	public void method9471(int i) {
		aClass548_10574.method9081((byte) 91);
		aClass550_10573.method9099((byte) -74);
	}

	public void method9468(byte[] is, int i, int i_1_) throws IOException {
		aClass550_10573.method9106(is, i, i_1_, -505087213);
	}

	public int method9472(byte[] is, int i, int i_2_, int i_3_) throws IOException {
		return aClass548_10574.method9078(is, i, i_2_, (byte) -63);
	}

	public void method9469(byte[] is, int i, int i_4_, byte i_5_) throws IOException {
		aClass550_10573.method9106(is, i, i_4_, -806757303);
	}

	public void method9479() {
		aClass550_10573.method9102(-993232789);
		try {
			aSocket10575.close();
		} catch (IOException ioexception) {
			/* empty */
		}
		aClass548_10574.method9091((byte) -19);
	}

	public int method9473(int i) throws IOException {
		return aClass548_10574.method9077(1866460747);
	}

	public void method9470(byte i) {
		aClass550_10573.method9102(-993232789);
		try {
			aSocket10575.close();
		} catch (IOException ioexception) {
			/* empty */
		}
		aClass548_10574.method9091((byte) -25);
	}

	void method16307() {
		method9470((byte) 82);
	}

	public void method9480() {
		aClass550_10573.method9102(-993232789);
		try {
			aSocket10575.close();
		} catch (IOException ioexception) {
			/* empty */
		}
		aClass548_10574.method9091((byte) 12);
	}

	void method16308() {
		method9470((byte) 86);
	}

	void method16309() {
		method9470((byte) 10);
	}

	void method16310() {
		method9470((byte) 126);
	}

	void method16311() {
		method9470((byte) 47);
	}

	public int method9467() throws IOException {
		return aClass548_10574.method9077(2130975013);
	}

	public int method9474(byte[] is, int i, int i_6_) throws IOException {
		return aClass548_10574.method9078(is, i, i_6_, (byte) -63);
	}

	public boolean method9465(int i) throws IOException {
		return aClass548_10574.method9076(i, 1297017044);
	}

	public void finalize() {
		method9470((byte) 66);
	}

	public void method9476() {
		aClass548_10574.method9081((byte) 79);
		aClass550_10573.method9099((byte) -60);
	}

	Class563_Sub1(Socket socket, int i) throws IOException {
		aSocket10575 = socket;
		aSocket10575.setSoTimeout(30000);
		aSocket10575.setTcpNoDelay(true);
		aSocket10575.setReceiveBufferSize(65536);
		aSocket10575.setSendBufferSize(65536);
		aClass548_10574 = new Class548(aSocket10575.getInputStream(), i);
		aClass550_10573 = new Class550(aSocket10575.getOutputStream(), i);
	}

	public void method9475() {
		aClass548_10574.method9081((byte) 110);
		aClass550_10573.method9099((byte) -46);
	}

	static final void method16312(Class665 class665, int i) {
		Class527_Sub36 class527_sub36 = Class490.method7974((Class527_Sub36) (class665.anObjectArray8541[((class665.anInt8528 -= 433009517) * 318492261)]), 993803878);
		class665.anInt8526 -= 409523364;
		class527_sub36.anInt10673 += (-496638743 * class665.anIntArray8525[1769813785 * class665.anInt8526]);
		class527_sub36.anInt10676 += (class665.anIntArray8525[1 + 1769813785 * class665.anInt8526] * -1610257185);
		class527_sub36.anInt10671 += -1428347077 * (class665.anIntArray8525[2 + 1769813785 * class665.anInt8526]);
		class527_sub36.anInt10675 += (class665.anIntArray8525[3 + 1769813785 * class665.anInt8526] * 723478171);
		class665.anObjectArray8541[(class665.anInt8528 += 433009517) * 318492261 - 1] = class527_sub36;
	}

	static void method16313(byte i) {
		Class527_Sub8_Sub9 class527_sub8_sub9 = Class532.method8930(14, 0L);
		class527_sub8_sub9.method18186(1643968483);
	}
}
