/* Class662 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class662 {
	static char[] aCharArray8509;
	static char[] aCharArray8510 = new char[64];
	static char[] aCharArray8511;
	static int[] anIntArray8512;
	static int anInt8513;
	public static NativeSprite aClass143_8514;

	Class662() throws Throwable {
		throw new Error();
	}

	static {
		for (int i = 0; i < 26; i++)
			aCharArray8510[i] = (char) (i + 65);
		for (int i = 26; i < 52; i++)
			aCharArray8510[i] = (char) (97 + i - 26);
		for (int i = 52; i < 62; i++)
			aCharArray8510[i] = (char) (48 + i - 52);
		aCharArray8510[62] = '+';
		aCharArray8510[63] = '/';
		aCharArray8509 = new char[64];
		for (int i = 0; i < 26; i++)
			aCharArray8509[i] = (char) (i + 65);
		for (int i = 26; i < 52; i++)
			aCharArray8509[i] = (char) (i + 97 - 26);
		for (int i = 52; i < 62; i++)
			aCharArray8509[i] = (char) (i + 48 - 52);
		aCharArray8509[62] = '*';
		aCharArray8509[63] = '-';
		aCharArray8511 = new char[64];
		for (int i = 0; i < 26; i++)
			aCharArray8511[i] = (char) (i + 65);
		for (int i = 26; i < 52; i++)
			aCharArray8511[i] = (char) (i + 97 - 26);
		for (int i = 52; i < 62; i++)
			aCharArray8511[i] = (char) (48 + i - 52);
		aCharArray8511[62] = '-';
		aCharArray8511[63] = '_';
		anIntArray8512 = new int[128];
		for (int i = 0; i < anIntArray8512.length; i++)
			anIntArray8512[i] = -1;
		for (int i = 65; i <= 90; i++)
			anIntArray8512[i] = i - 65;
		for (int i = 97; i <= 122; i++)
			anIntArray8512[i] = 26 + (i - 97);
		for (int i = 48; i <= 57; i++)
			anIntArray8512[i] = 52 + (i - 48);
		int[] is = anIntArray8512;
		anIntArray8512[43] = 62;
		is[42] = 62;
		int[] is_0_ = anIntArray8512;
		anIntArray8512[47] = 63;
		is_0_[45] = 63;
	}

	static final void method7984(Class668 class668, int i) {
		Class683 class683 = (class668.aBool8548 ? class668.aClass683_8562 : class668.aClass683_8549);
		IComponentDefinitions class251 = class683.aClass251_8650;
		Class234 class234 = class683.aClass234_8649;
		Class171.method2429(class251, class234, class668, (byte) 55);
	}

	static final void method7985(IComponentDefinitions class251, Class234 class234, Class668 class668, int i) {
		class251.alpha = (class668.anIntArray8541[(class668.anInt8542 -= -1411037171) * 1867269829]) == 1;
		Class668.method8011(class251, 263642117);
	}

	static final void method7986(Class668 class668, int i) {
		if (client.aString11265 != null)
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = client.aString11265;
		else
			class668.anObjectArray8543[(class668.anInt8544 += 1946079257) * 366709801 - 1] = "";
	}
}
