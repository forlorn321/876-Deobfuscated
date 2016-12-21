/* Class638 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

public class Class638 implements Interface13 {
	int anInt8302;
	Class645 aClass645_8303;
	public int anInt8304;
	public int anInt8305;

	public void method77() {
		/* empty */
	}

	public void method74(RSByteBuffer class536_sub33, int i) {
		for (;;) {
			int i_0_ = class536_sub33.readUnsignedByte();
			if (i_0_ == 0)
				break;
			method7644(class536_sub33, i_0_, 1185921697);
		}
	}

	void method7644(RSByteBuffer class536_sub33, int i, int i_1_) {
		if (i == 1)
			anInt8302 = class536_sub33.method9720((byte) 1) * 937256053;
		else if (i == 2) {
			anInt8304 = class536_sub33.readUnsignedByte() * 148675805;
			anInt8305 = class536_sub33.readUnsignedByte() * 847276645;
		}
	}

	public synchronized Class179 method7645(byte i) {
		Class179 class179 = ((Class179) aClass645_8303.aClass199_8353.method2886((long) (-311800867 * anInt8302)));
		if (null != class179)
			return class179;
		class179 = Class181.method2718(aClass645_8303.aClass461_8354, anInt8302 * -311800867, 0);
		if (null != class179)
			aClass645_8303.aClass199_8353.method2881(class179, (long) (anInt8302 * -311800867));
		return class179;
	}

	public void method75(byte i) {
		/* empty */
	}

	public void method76(RSByteBuffer class536_sub33) {
		for (;;) {
			int i = class536_sub33.readUnsignedByte();
			if (i == 0)
				break;
			method7644(class536_sub33, i, 1085720358);
		}
	}

	Class638(int i, Class645 class645) {
		aClass645_8303 = class645;
	}

	void method7646(RSByteBuffer class536_sub33, int i) {
		if (i == 1)
			anInt8302 = class536_sub33.method9720((byte) 1) * 937256053;
		else if (i == 2) {
			anInt8304 = class536_sub33.readUnsignedByte() * 148675805;
			anInt8305 = class536_sub33.readUnsignedByte() * 847276645;
		}
	}

	void method7647(RSByteBuffer class536_sub33, int i) {
		if (i == 1)
			anInt8302 = class536_sub33.method9720((byte) 1) * 937256053;
		else if (i == 2) {
			anInt8304 = class536_sub33.readUnsignedByte() * 148675805;
			anInt8305 = class536_sub33.readUnsignedByte() * 847276645;
		}
	}

	void method7648(RSByteBuffer class536_sub33, int i) {
		if (i == 1)
			anInt8302 = class536_sub33.method9720((byte) 1) * 937256053;
		else if (i == 2) {
			anInt8304 = class536_sub33.readUnsignedByte() * 148675805;
			anInt8305 = class536_sub33.readUnsignedByte() * 847276645;
		}
	}

	static final void method7649(Class668 class668, int i) {
		Class536_Sub30 class536_sub30 = ((Class536_Sub30) (class668.anObjectArray8543[(class668.anInt8544 -= 1946079257) * 366709801]));
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = 700896725 * class536_sub30.anInt10565;
	}

	static final void method7650(Class668 class668, int i) {
		class668.anInt8544 -= -402808782;
		String string = ((String) class668.anObjectArray8543[class668.anInt8544 * 366709801]);
		String string_2_ = ((String) class668.anObjectArray8543[366709801 * class668.anInt8544 + 1]);
		if ((class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]) == 1)
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = string;
		else
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = string_2_;
	}

	public static final int method7651(long l, String string, byte i) {
		Random random = new Random();
		RSByteBuffer class536_sub33 = new RSByteBuffer(128);
		RSByteBuffer class536_sub33_3_ = new RSByteBuffer(128);
		int[] is = new int[4];
		is[0] = random.nextInt();
		is[1] = random.nextInt();
		is[2] = (int) (l >> 32);
		is[3] = (int) l;
		class536_sub33.writeByte(10, 465637339);
		for (int i_4_ = 0; i_4_ < 4; i_4_++)
			class536_sub33.writeInt(random.nextInt(), -149241618);
		class536_sub33.writeInt(is[0], -149241618);
		class536_sub33.writeInt(is[1], -149241618);
		class536_sub33.writeLong(l);
		class536_sub33.writeLong(0L);
		for (int i_5_ = 0; i_5_ < 4; i_5_++)
			class536_sub33.writeInt(random.nextInt(), -149241618);
		class536_sub33.method9726(Class26.aBigInteger238, Class26.aBigInteger235, 7364791);
		class536_sub33_3_.writeByte(10, 465637339);
		for (int i_6_ = 0; i_6_ < 3; i_6_++)
			class536_sub33_3_.writeInt(random.nextInt(), -149241618);
		class536_sub33_3_.writeLong(random.nextLong());
		class536_sub33_3_.write44BitLong(random.nextLong());
		Class502.method6042(class536_sub33_3_, (byte) 42);
		class536_sub33_3_.writeLong(random.nextLong());
		class536_sub33_3_.method9726(Class26.aBigInteger238, Class26.aBigInteger235, 1655868351);
		int i_7_ = Class555.method6802(string, 1844540959);
		if (i_7_ % 8 != 0)
			i_7_ += 8 - i_7_ % 8;
		RSByteBuffer class536_sub33_8_ = new RSByteBuffer(i_7_);
		class536_sub33_8_.writeString(string, 2114903830);
		class536_sub33_8_.off = 516175515 * i_7_;
		class536_sub33_8_.method9723(is, -1874028943);
		RSByteBuffer class536_sub33_9_ = new RSByteBuffer(class536_sub33_8_.off * -810172525 + (-810172525 * class536_sub33_3_.off + (-810172525 * class536_sub33.off + 5)));
		class536_sub33_9_.writeByte(2, 465637339);
		class536_sub33_9_.writeByte(class536_sub33.off * -810172525, 465637339);
		class536_sub33_9_.method9696(class536_sub33.buffer, 0, class536_sub33.off * -810172525, (byte) 38);
		class536_sub33_9_.writeByte(-810172525 * class536_sub33_3_.off, 465637339);
		class536_sub33_9_.method9696(class536_sub33_3_.buffer, 0, -810172525 * class536_sub33_3_.off, (byte) 103);
		class536_sub33_9_.writeShort(-810172525 * class536_sub33_8_.off, -1778059594);
		class536_sub33_9_.method9696(class536_sub33_8_.buffer, 0, class536_sub33_8_.off * -810172525, (byte) 46);
		String string_10_ = Class557.method6808(class536_sub33_9_.buffer, -1754520728);
		int i_11_;
		try {
			URL url = new URL(new StringBuilder().append(Class640.method7673("services", false, -923644264)).append("m=accountappeal/login.ws").toString());
			URLConnection urlconnection = url.openConnection();
			urlconnection.setDoInput(true);
			urlconnection.setDoOutput(true);
			urlconnection.setConnectTimeout(5000);
			OutputStreamWriter outputstreamwriter = new OutputStreamWriter(urlconnection.getOutputStream());
			outputstreamwriter.write(new StringBuilder().append("data2=").append(Class629.method7500(string_10_, -994720658)).append("&dest=").append(Class629.method7500("passwordchoice.ws", -994720658)).toString());
			outputstreamwriter.flush();
			InputStream inputstream = urlconnection.getInputStream();
			class536_sub33_9_ = new RSByteBuffer(new byte[1000]);
			for (;;) {
				int i_12_ = inputstream.read(class536_sub33_9_.buffer, (class536_sub33_9_.off * -810172525), 1000 - -810172525 * (class536_sub33_9_.off));
				if (-1 == i_12_)
					break;
				class536_sub33_9_.off += 516175515 * i_12_;
				if (class536_sub33_9_.off * -810172525 >= 1000)
					return 5;
			}
			outputstreamwriter.close();
			inputstream.close();
			String string_13_ = new String(class536_sub33_9_.buffer);
			if (string_13_.startsWith("OFFLINE"))
				return 4;
			if (string_13_.startsWith("WRONG"))
				return 7;
			if (string_13_.startsWith("RELOAD"))
				return 3;
			if (string_13_.startsWith("Not permitted for social network accounts."))
				return 6;
			class536_sub33_9_.method9724(is, 130924266);
			for (/**/; (-810172525 * class536_sub33_9_.off > 0 && 0 == (class536_sub33_9_.buffer[-810172525 * class536_sub33_9_.off - 1])); class536_sub33_9_.off -= 516175515) {
				/* empty */
			}
			string_13_ = new String(class536_sub33_9_.buffer, 0, -810172525 * class536_sub33_9_.off);
			if (Class536.method6491(string_13_, -1203200631)) {
				Class380.method4809(string_13_, true, client.aBool11228, 460165355);
				return 2;
			}
			i_11_ = 5;
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			return 5;
		}
		return i_11_;
	}
}
