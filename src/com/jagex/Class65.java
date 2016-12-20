/* Class65 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

public class Class65 {
	static final String aString745 = "services";
	static final int anInt746 = 2;
	static final String aString747 = "passwordchoice.ws";
	static final int anInt748 = 1000;
	static BigInteger aBigInteger749 = (new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049"));
	static BigInteger aBigInteger750 = (new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683"));
	static final String aString751 = "m=accountappeal/login.ws";
	static final int anInt752 = 3;
	static final int anInt753 = 4;
	public static final int anInt754 = 5;
	static final int anInt755 = 6;
	static final int anInt756 = 2;
	static final int anInt757 = 7;

	static boolean method1454(String string) {
		if (string == null)
			return false;
		try {
			new URL(string);
		} catch (MalformedURLException malformedurlexception) {
			return false;
		}
		return true;
	}

	public static long method1455() {
		long l;
		try {
			URL url = new URL(new StringBuilder().append(Class23.method828("services", false, -1708114234)).append("m=accountappeal/login.ws").toString());
			URLConnection urlconnection = url.openConnection();
			urlconnection.setRequestProperty("connection", "close");
			urlconnection.setDoInput(true);
			urlconnection.setDoOutput(true);
			urlconnection.setConnectTimeout(5000);
			OutputStreamWriter outputstreamwriter = new OutputStreamWriter(urlconnection.getOutputStream());
			outputstreamwriter.write("data1=req");
			outputstreamwriter.flush();
			InputStream inputstream = urlconnection.getInputStream();
			RSByteBuffer class527_sub38 = new RSByteBuffer(new byte[1000]);
			for (;;) {
				int i = inputstream.read(class527_sub38.buffer, -441238943 * class527_sub38.anInt10689, 1000 - (-441238943 * class527_sub38.anInt10689));
				if (-1 == i)
					break;
				class527_sub38.anInt10689 += i * 1474750881;
				if (class527_sub38.anInt10689 * -441238943 >= 1000)
					return 0L;
			}
			class527_sub38.anInt10689 = 0;
			long l_0_ = class527_sub38.method16612((byte) 1);
			l = l_0_;
		} catch (Exception exception) {
			return 0L;
		}
		return l;
	}

	public static final int method1456(long l, String string) {
		Random random = new Random();
		RSByteBuffer class527_sub38 = new RSByteBuffer(128);
		RSByteBuffer class527_sub38_1_ = new RSByteBuffer(128);
		int[] is = new int[4];
		is[0] = random.nextInt();
		is[1] = random.nextInt();
		is[2] = (int) (l >> 32);
		is[3] = (int) l;
		class527_sub38.writeByte(10, 682421987);
		for (int i = 0; i < 4; i++)
			class527_sub38.writeInt(random.nextInt(), -1683423325);
		class527_sub38.writeInt(is[0], 1422452134);
		class527_sub38.writeInt(is[1], 1549903886);
		class527_sub38.writeLong(l);
		class527_sub38.writeLong(0L);
		for (int i = 0; i < 4; i++)
			class527_sub38.writeInt(random.nextInt(), -63513222);
		class527_sub38.method16650(aBigInteger749, aBigInteger750, (byte) -26);
		class527_sub38_1_.writeByte(10, -240308520);
		for (int i = 0; i < 3; i++)
			class527_sub38_1_.writeInt(random.nextInt(), 739064928);
		class527_sub38_1_.writeLong(random.nextLong());
		class527_sub38_1_.method16429(random.nextLong());
		Class187.method3655(class527_sub38_1_, 2057006875);
		class527_sub38_1_.writeLong(random.nextLong());
		class527_sub38_1_.method16650(aBigInteger749, aBigInteger750, (byte) -36);
		int i = Class208_Sub18.method15632(string, (byte) -55);
		if (i % 8 != 0)
			i += 8 - i % 8;
		RSByteBuffer class527_sub38_2_ = new RSByteBuffer(i);
		class527_sub38_2_.writeString(string, 1456567139);
		class527_sub38_2_.anInt10689 = i * 1474750881;
		class527_sub38_2_.method16465(is, (byte) 80);
		RSByteBuffer class527_sub38_3_ = new RSByteBuffer(-441238943 * class527_sub38_2_.anInt10689 + (-441238943 * class527_sub38.anInt10689 + 5 + (class527_sub38_1_.anInt10689 * -441238943)));
		class527_sub38_3_.writeByte(2, -1279955781);
		class527_sub38_3_.writeByte(-441238943 * class527_sub38.anInt10689, 922325679);
		class527_sub38_3_.writeBytes(class527_sub38.buffer, 0, class527_sub38.anInt10689 * -441238943, (byte) 67);
		class527_sub38_3_.writeByte((class527_sub38_1_.anInt10689 * -441238943), 1249036068);
		class527_sub38_3_.writeBytes(class527_sub38_1_.buffer, 0, (-441238943 * class527_sub38_1_.anInt10689), (byte) 26);
		class527_sub38_3_.writeShort((class527_sub38_2_.anInt10689 * -441238943), 1404835786);
		class527_sub38_3_.writeBytes(class527_sub38_2_.buffer, 0, (-441238943 * class527_sub38_2_.anInt10689), (byte) 6);
		String string_4_ = Class294.method5298(class527_sub38_3_.buffer, 1413532160);
		int i_5_;
		try {
			URL url = new URL(new StringBuilder().append(Class23.method828("services", false, -1708114234)).append("m=accountappeal/login.ws").toString());
			URLConnection urlconnection = url.openConnection();
			urlconnection.setDoInput(true);
			urlconnection.setDoOutput(true);
			urlconnection.setConnectTimeout(5000);
			OutputStreamWriter outputstreamwriter = new OutputStreamWriter(urlconnection.getOutputStream());
			outputstreamwriter.write(new StringBuilder().append("data2=").append(Class166.method2669(string_4_, (byte) -90)).append("&dest=").append(Class166.method2669("passwordchoice.ws", (byte) -123)).toString());
			outputstreamwriter.flush();
			InputStream inputstream = urlconnection.getInputStream();
			class527_sub38_3_ = new RSByteBuffer(new byte[1000]);
			for (;;) {
				int i_6_ = inputstream.read(class527_sub38_3_.buffer, (-441238943 * class527_sub38_3_.anInt10689), 1000 - (class527_sub38_3_.anInt10689 * -441238943));
				if (i_6_ == -1)
					break;
				class527_sub38_3_.anInt10689 += 1474750881 * i_6_;
				if (class527_sub38_3_.anInt10689 * -441238943 >= 1000)
					return 5;
			}
			outputstreamwriter.close();
			inputstream.close();
			String string_7_ = new String(class527_sub38_3_.buffer);
			if (string_7_.startsWith("OFFLINE"))
				return 4;
			if (string_7_.startsWith("WRONG"))
				return 7;
			if (string_7_.startsWith("RELOAD"))
				return 3;
			if (string_7_.startsWith("Not permitted for social network accounts."))
				return 6;
			class527_sub38_3_.method16470(is, 1086737603);
			for (/**/; (class527_sub38_3_.anInt10689 * -441238943 > 0 && (class527_sub38_3_.buffer[-441238943 * class527_sub38_3_.anInt10689 - 1]) == 0); class527_sub38_3_.anInt10689 -= 1474750881) {
				/* empty */
			}
			string_7_ = new String(class527_sub38_3_.buffer, 0, class527_sub38_3_.anInt10689 * -441238943);
			if (Class418.method6662(string_7_, -485863474)) {
				Class183.method3558(string_7_, true, client.aBool11193, -433585488);
				return 2;
			}
			i_5_ = 5;
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			return 5;
		}
		return i_5_;
	}

	Class65() throws Throwable {
		throw new Error();
	}

	public static final int method1457(long l, String string) {
		Random random = new Random();
		RSByteBuffer class527_sub38 = new RSByteBuffer(128);
		RSByteBuffer class527_sub38_8_ = new RSByteBuffer(128);
		int[] is = new int[4];
		is[0] = random.nextInt();
		is[1] = random.nextInt();
		is[2] = (int) (l >> 32);
		is[3] = (int) l;
		class527_sub38.writeByte(10, -680989654);
		for (int i = 0; i < 4; i++)
			class527_sub38.writeInt(random.nextInt(), -2083258197);
		class527_sub38.writeInt(is[0], -393764585);
		class527_sub38.writeInt(is[1], -978066446);
		class527_sub38.writeLong(l);
		class527_sub38.writeLong(0L);
		for (int i = 0; i < 4; i++)
			class527_sub38.writeInt(random.nextInt(), 1133378534);
		class527_sub38.method16650(aBigInteger749, aBigInteger750, (byte) 64);
		class527_sub38_8_.writeByte(10, 1837180445);
		for (int i = 0; i < 3; i++)
			class527_sub38_8_.writeInt(random.nextInt(), -650504604);
		class527_sub38_8_.writeLong(random.nextLong());
		class527_sub38_8_.method16429(random.nextLong());
		Class187.method3655(class527_sub38_8_, -616852382);
		class527_sub38_8_.writeLong(random.nextLong());
		class527_sub38_8_.method16650(aBigInteger749, aBigInteger750, (byte) -85);
		int i = Class208_Sub18.method15632(string, (byte) -22);
		if (i % 8 != 0)
			i += 8 - i % 8;
		RSByteBuffer class527_sub38_9_ = new RSByteBuffer(i);
		class527_sub38_9_.writeString(string, -1116471734);
		class527_sub38_9_.anInt10689 = i * 1474750881;
		class527_sub38_9_.method16465(is, (byte) -8);
		RSByteBuffer class527_sub38_10_ = new RSByteBuffer(-441238943 * class527_sub38_9_.anInt10689 + (-441238943 * class527_sub38.anInt10689 + 5 + (class527_sub38_8_.anInt10689 * -441238943)));
		class527_sub38_10_.writeByte(2, 1059433406);
		class527_sub38_10_.writeByte(-441238943 * class527_sub38.anInt10689, -890552603);
		class527_sub38_10_.writeBytes(class527_sub38.buffer, 0, class527_sub38.anInt10689 * -441238943, (byte) 45);
		class527_sub38_10_.writeByte((class527_sub38_8_.anInt10689 * -441238943), -1458138651);
		class527_sub38_10_.writeBytes(class527_sub38_8_.buffer, 0, (-441238943 * class527_sub38_8_.anInt10689), (byte) 31);
		class527_sub38_10_.writeShort((class527_sub38_9_.anInt10689 * -441238943), 1404835786);
		class527_sub38_10_.writeBytes(class527_sub38_9_.buffer, 0, (-441238943 * class527_sub38_9_.anInt10689), (byte) 118);
		String string_11_ = Class294.method5298(class527_sub38_10_.buffer, 1825386626);
		int i_12_;
		try {
			URL url = new URL(new StringBuilder().append(Class23.method828("services", false, -1708114234)).append("m=accountappeal/login.ws").toString());
			URLConnection urlconnection = url.openConnection();
			urlconnection.setDoInput(true);
			urlconnection.setDoOutput(true);
			urlconnection.setConnectTimeout(5000);
			OutputStreamWriter outputstreamwriter = new OutputStreamWriter(urlconnection.getOutputStream());
			outputstreamwriter.write(new StringBuilder().append("data2=").append(Class166.method2669(string_11_, (byte) -48)).append("&dest=").append(Class166.method2669("passwordchoice.ws", (byte) -13)).toString());
			outputstreamwriter.flush();
			InputStream inputstream = urlconnection.getInputStream();
			class527_sub38_10_ = new RSByteBuffer(new byte[1000]);
			for (;;) {
				int i_13_ = inputstream.read(class527_sub38_10_.buffer, (-441238943 * class527_sub38_10_.anInt10689), 1000 - (class527_sub38_10_.anInt10689 * -441238943));
				if (i_13_ == -1)
					break;
				class527_sub38_10_.anInt10689 += 1474750881 * i_13_;
				if (class527_sub38_10_.anInt10689 * -441238943 >= 1000)
					return 5;
			}
			outputstreamwriter.close();
			inputstream.close();
			String string_14_ = new String(class527_sub38_10_.buffer);
			if (string_14_.startsWith("OFFLINE"))
				return 4;
			if (string_14_.startsWith("WRONG"))
				return 7;
			if (string_14_.startsWith("RELOAD"))
				return 3;
			if (string_14_.startsWith("Not permitted for social network accounts."))
				return 6;
			class527_sub38_10_.method16470(is, 1086737603);
			for (/**/; (class527_sub38_10_.anInt10689 * -441238943 > 0 && (class527_sub38_10_.buffer[-441238943 * class527_sub38_10_.anInt10689 - 1]) == 0); class527_sub38_10_.anInt10689 -= 1474750881) {
				/* empty */
			}
			string_14_ = new String(class527_sub38_10_.buffer, 0, class527_sub38_10_.anInt10689 * -441238943);
			if (Class418.method6662(string_14_, 250796786)) {
				Class183.method3558(string_14_, true, client.aBool11193, -200540510);
				return 2;
			}
			i_12_ = 5;
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			return 5;
		}
		return i_12_;
	}

	static boolean method1458(String string) {
		if (string == null)
			return false;
		try {
			new URL(string);
		} catch (MalformedURLException malformedurlexception) {
			return false;
		}
		return true;
	}

	public static final int method1459(long l, String string) {
		Random random = new Random();
		RSByteBuffer class527_sub38 = new RSByteBuffer(128);
		RSByteBuffer class527_sub38_15_ = new RSByteBuffer(128);
		int[] is = new int[4];
		is[0] = random.nextInt();
		is[1] = random.nextInt();
		is[2] = (int) (l >> 32);
		is[3] = (int) l;
		class527_sub38.writeByte(10, -516235443);
		for (int i = 0; i < 4; i++)
			class527_sub38.writeInt(random.nextInt(), -1108791149);
		class527_sub38.writeInt(is[0], -115083698);
		class527_sub38.writeInt(is[1], 1856598463);
		class527_sub38.writeLong(l);
		class527_sub38.writeLong(0L);
		for (int i = 0; i < 4; i++)
			class527_sub38.writeInt(random.nextInt(), -1161564596);
		class527_sub38.method16650(aBigInteger749, aBigInteger750, (byte) -51);
		class527_sub38_15_.writeByte(10, 842050862);
		for (int i = 0; i < 3; i++)
			class527_sub38_15_.writeInt(random.nextInt(), 1875512009);
		class527_sub38_15_.writeLong(random.nextLong());
		class527_sub38_15_.method16429(random.nextLong());
		Class187.method3655(class527_sub38_15_, 1209996586);
		class527_sub38_15_.writeLong(random.nextLong());
		class527_sub38_15_.method16650(aBigInteger749, aBigInteger750, (byte) -38);
		int i = Class208_Sub18.method15632(string, (byte) -82);
		if (i % 8 != 0)
			i += 8 - i % 8;
		RSByteBuffer class527_sub38_16_ = new RSByteBuffer(i);
		class527_sub38_16_.writeString(string, -1000377106);
		class527_sub38_16_.anInt10689 = i * 1474750881;
		class527_sub38_16_.method16465(is, (byte) -24);
		RSByteBuffer class527_sub38_17_ = new RSByteBuffer(-441238943 * class527_sub38_16_.anInt10689 + (-441238943 * class527_sub38.anInt10689 + 5 + (class527_sub38_15_.anInt10689 * -441238943)));
		class527_sub38_17_.writeByte(2, -360368776);
		class527_sub38_17_.writeByte(-441238943 * class527_sub38.anInt10689, 1746667782);
		class527_sub38_17_.writeBytes(class527_sub38.buffer, 0, class527_sub38.anInt10689 * -441238943, (byte) 99);
		class527_sub38_17_.writeByte((class527_sub38_15_.anInt10689 * -441238943), 990304739);
		class527_sub38_17_.writeBytes(class527_sub38_15_.buffer, 0, (-441238943 * class527_sub38_15_.anInt10689), (byte) 44);
		class527_sub38_17_.writeShort((class527_sub38_16_.anInt10689 * -441238943), 1404835786);
		class527_sub38_17_.writeBytes(class527_sub38_16_.buffer, 0, (-441238943 * class527_sub38_16_.anInt10689), (byte) 124);
		String string_18_ = Class294.method5298(class527_sub38_17_.buffer, 1589952500);
		int i_19_;
		try {
			URL url = new URL(new StringBuilder().append(Class23.method828("services", false, -1708114234)).append("m=accountappeal/login.ws").toString());
			URLConnection urlconnection = url.openConnection();
			urlconnection.setDoInput(true);
			urlconnection.setDoOutput(true);
			urlconnection.setConnectTimeout(5000);
			OutputStreamWriter outputstreamwriter = new OutputStreamWriter(urlconnection.getOutputStream());
			outputstreamwriter.write(new StringBuilder().append("data2=").append(Class166.method2669(string_18_, (byte) -124)).append("&dest=").append(Class166.method2669("passwordchoice.ws", (byte) -13)).toString());
			outputstreamwriter.flush();
			InputStream inputstream = urlconnection.getInputStream();
			class527_sub38_17_ = new RSByteBuffer(new byte[1000]);
			for (;;) {
				int i_20_ = inputstream.read(class527_sub38_17_.buffer, (-441238943 * class527_sub38_17_.anInt10689), 1000 - (class527_sub38_17_.anInt10689 * -441238943));
				if (i_20_ == -1)
					break;
				class527_sub38_17_.anInt10689 += 1474750881 * i_20_;
				if (class527_sub38_17_.anInt10689 * -441238943 >= 1000)
					return 5;
			}
			outputstreamwriter.close();
			inputstream.close();
			String string_21_ = new String(class527_sub38_17_.buffer);
			if (string_21_.startsWith("OFFLINE"))
				return 4;
			if (string_21_.startsWith("WRONG"))
				return 7;
			if (string_21_.startsWith("RELOAD"))
				return 3;
			if (string_21_.startsWith("Not permitted for social network accounts."))
				return 6;
			class527_sub38_17_.method16470(is, 1086737603);
			for (/**/; (class527_sub38_17_.anInt10689 * -441238943 > 0 && (class527_sub38_17_.buffer[-441238943 * class527_sub38_17_.anInt10689 - 1]) == 0); class527_sub38_17_.anInt10689 -= 1474750881) {
				/* empty */
			}
			string_21_ = new String(class527_sub38_17_.buffer, 0, class527_sub38_17_.anInt10689 * -441238943);
			if (Class418.method6662(string_21_, -1352580745)) {
				Class183.method3558(string_21_, true, client.aBool11193, 539474353);
				return 2;
			}
			i_19_ = 5;
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			return 5;
		}
		return i_19_;
	}

	static final void method1460(Class665 class665, byte i) {
		class665.anInt8526 -= 204761682;
		int i_22_ = class665.anIntArray8525[class665.anInt8526 * 1769813785];
		int i_23_ = class665.anIntArray8525[class665.anInt8526 * 1769813785 + 1];
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = Class73.method1511(i_22_, i_23_, true, -1922808508);
	}
}
