/* Class399 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

public class Class399 implements Interface47 {
	public int anInt4125;
	public Class400 aClass400_4126;
	public Class384 aClass384_4127;
	public int anInt4128;
	public int anInt4129;
	public int anInt4130;
	public int anInt4131;
	public int anInt4132;
	public int anInt4133;
	public int anInt4134;
	public int anInt4135;
	public int anInt4136;
	public String aString4137;

	public static Class399 method6522(RSByteBuffer class527_sub38) {
		String string = class527_sub38.readString(1889247083);
		Class400 class400 = (Class183.method3556(551822376)[class527_sub38.readUnsignedByte()]);
		Class384 class384 = (Class644.method10743(-1015693904)[class527_sub38.readUnsignedByte()]);
		int i = class527_sub38.readShort();
		int i_0_ = class527_sub38.readShort();
		int i_1_ = class527_sub38.readUnsignedByte();
		int i_2_ = class527_sub38.readUnsignedByte();
		int i_3_ = class527_sub38.readUnsignedByte();
		int i_4_ = class527_sub38.readUnsignedShort();
		int i_5_ = class527_sub38.readUnsignedShort();
		int i_6_ = class527_sub38.method16466(-1763206696);
		int i_7_ = class527_sub38.readInt();
		int i_8_ = class527_sub38.readInt();
		return new Class399(string, class400, class384, i, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_, i_6_, i_7_, i_8_);
	}

	Class399(String string, Class400 class400, Class384 class384, int i, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_) {
		aString4137 = string;
		aClass400_4126 = class400;
		aClass384_4127 = class384;
		anInt4135 = i * -1114758523;
		anInt4129 = -1454582219 * i_9_;
		anInt4125 = 149218263 * i_10_;
		anInt4131 = i_11_ * 1116612671;
		anInt4132 = i_12_ * -1436715443;
		anInt4130 = 729176653 * i_13_;
		anInt4134 = i_14_ * 724721811;
		anInt4133 = -864370215 * i_15_;
		anInt4136 = i_16_ * -1037566881;
		anInt4128 = i_17_ * -546390301;
	}

	public Class396 method333() {
		return Class396.aClass396_4114;
	}

	public Class396 method334(int i) {
		return Class396.aClass396_4114;
	}

	public static final int method6523(long l, String string, byte i) {
		Random random = new Random();
		RSByteBuffer class527_sub38 = new RSByteBuffer(128);
		RSByteBuffer class527_sub38_18_ = new RSByteBuffer(128);
		int[] is = new int[4];
		is[0] = random.nextInt();
		is[1] = random.nextInt();
		is[2] = (int) (l >> 32);
		is[3] = (int) l;
		class527_sub38.writeByte(10, 624540742);
		for (int i_19_ = 0; i_19_ < 4; i_19_++)
			class527_sub38.writeInt(random.nextInt(), 16527305);
		class527_sub38.writeInt(is[0], 1876438683);
		class527_sub38.writeInt(is[1], -1755149679);
		class527_sub38.writeLong(l);
		class527_sub38.writeLong(0L);
		for (int i_20_ = 0; i_20_ < 4; i_20_++)
			class527_sub38.writeInt(random.nextInt(), -182776461);
		class527_sub38.method16650(Class65.aBigInteger749, Class65.aBigInteger750, (byte) 45);
		class527_sub38_18_.writeByte(10, -102700498);
		for (int i_21_ = 0; i_21_ < 3; i_21_++)
			class527_sub38_18_.writeInt(random.nextInt(), 485171576);
		class527_sub38_18_.writeLong(random.nextLong());
		class527_sub38_18_.method16429(random.nextLong());
		Class187.method3655(class527_sub38_18_, -1144939326);
		class527_sub38_18_.writeLong(random.nextLong());
		class527_sub38_18_.method16650(Class65.aBigInteger749, Class65.aBigInteger750, (byte) 23);
		int i_22_ = Class208_Sub18.method15632(string, (byte) -70);
		if (i_22_ % 8 != 0)
			i_22_ += 8 - i_22_ % 8;
		RSByteBuffer class527_sub38_23_ = new RSByteBuffer(i_22_);
		class527_sub38_23_.writeString(string, 1692701134);
		class527_sub38_23_.anInt10689 = i_22_ * 1474750881;
		class527_sub38_23_.method16465(is, (byte) 103);
		RSByteBuffer class527_sub38_24_ = new RSByteBuffer(-441238943 * class527_sub38_23_.anInt10689 + (-441238943 * class527_sub38.anInt10689 + 5 + (class527_sub38_18_.anInt10689 * -441238943)));
		class527_sub38_24_.writeByte(2, -1925788956);
		class527_sub38_24_.writeByte(-441238943 * class527_sub38.anInt10689, -1205597724);
		class527_sub38_24_.writeBytes(class527_sub38.buffer, 0, class527_sub38.anInt10689 * -441238943, (byte) 82);
		class527_sub38_24_.writeByte((class527_sub38_18_.anInt10689 * -441238943), 597066802);
		class527_sub38_24_.writeBytes(class527_sub38_18_.buffer, 0, (-441238943 * class527_sub38_18_.anInt10689), (byte) 95);
		class527_sub38_24_.writeShort((class527_sub38_23_.anInt10689 * -441238943), 1404835786);
		class527_sub38_24_.writeBytes(class527_sub38_23_.buffer, 0, (-441238943 * class527_sub38_23_.anInt10689), (byte) 84);
		String string_25_ = Class294.method5298(class527_sub38_24_.buffer, 1869440088);
		int i_26_;
		try {
			URL url = new URL(new StringBuilder().append(Class23.method828("services", false, -1708114234)).append("m=accountappeal/login.ws").toString());
			URLConnection urlconnection = url.openConnection();
			urlconnection.setDoInput(true);
			urlconnection.setDoOutput(true);
			urlconnection.setConnectTimeout(5000);
			OutputStreamWriter outputstreamwriter = new OutputStreamWriter(urlconnection.getOutputStream());
			outputstreamwriter.write(new StringBuilder().append("data2=").append(Class166.method2669(string_25_, (byte) -50)).append("&dest=").append(Class166.method2669("passwordchoice.ws", (byte) -62)).toString());
			outputstreamwriter.flush();
			InputStream inputstream = urlconnection.getInputStream();
			class527_sub38_24_ = new RSByteBuffer(new byte[1000]);
			for (;;) {
				int i_27_ = inputstream.read(class527_sub38_24_.buffer, (-441238943 * class527_sub38_24_.anInt10689), 1000 - (class527_sub38_24_.anInt10689 * -441238943));
				if (i_27_ == -1)
					break;
				class527_sub38_24_.anInt10689 += 1474750881 * i_27_;
				if (class527_sub38_24_.anInt10689 * -441238943 >= 1000)
					return 5;
			}
			outputstreamwriter.close();
			inputstream.close();
			String string_28_ = new String(class527_sub38_24_.buffer);
			if (string_28_.startsWith("OFFLINE"))
				return 4;
			if (string_28_.startsWith("WRONG"))
				return 7;
			if (string_28_.startsWith("RELOAD"))
				return 3;
			if (string_28_.startsWith("Not permitted for social network accounts."))
				return 6;
			class527_sub38_24_.method16470(is, 1086737603);
			for (/**/; (class527_sub38_24_.anInt10689 * -441238943 > 0 && (class527_sub38_24_.buffer[-441238943 * class527_sub38_24_.anInt10689 - 1]) == 0); class527_sub38_24_.anInt10689 -= 1474750881) {
				/* empty */
			}
			string_28_ = new String(class527_sub38_24_.buffer, 0, class527_sub38_24_.anInt10689 * -441238943);
			if (Class418.method6662(string_28_, -1448339594)) {
				Class183.method3558(string_28_, true, client.aBool11193, 134037065);
				return 2;
			}
			i_26_ = 5;
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			return 5;
		}
		return i_26_;
	}

	static final void method6524(Class665 class665, int i) {
		class665.anIntArray8525[((class665.anInt8526 += 102380841) * 1769813785 - 1)] = 545473849 * Class32.anInt317;
	}
}
