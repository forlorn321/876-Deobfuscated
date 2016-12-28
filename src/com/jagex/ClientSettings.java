/* Class536_Sub40 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class ClientSettings extends Class536 {
	
	public Class710_Sub25 aClass710_Sub25_10735;
	static final int anInt10736 = 23;
	Class710_Sub42 aClass710_Sub42_10737;
	public static final int anInt10738 = 500;
	public BrightnessSetting brightnessSetting;
	Class711 aClass711_10740;
	public IdleAnimationSetting idleAnimationSetting;
	public SoundVolumeSetting bgSoundVolumeSetting;
	public AntiAliasingSetting antiAliasingSetting;
	Class710_Sub36 aClass710_Sub36_10744;
	public DrawDistanceSetting drawDistanceSetting;
	public AntiAliasingSetting defaultAntiAliasingSetting;
	static final int anInt10747 = 36;
	public CustomCursorSetting customCursorSetting;
	GameMode gameMode;
	public SoundVolumeSetting musicVolumeSetting;
	public FogSetting fogSetting;
	public GroundBlendingSetting groundBlendingSetting;
	public GroundDecorationSetting groundDecorationSetting;
	public WaterDetailSetting waterDetailSetting;
	public LightingDetailSetting lightingDetailSetting;
	public ShadowSetting shadowSetting;
	public ShadowQualitySetting shadowQualitySetting;
	public CPUUsageSetting cpuUsageSetting;
	public Class710_Sub4 aClass710_Sub4_10759;
	public RemoveRoofSetting defaultRemoveRoofSetting;
	public RemoveRoofSetting removeRoofSetting;
	public Class710_Sub33 aClass710_Sub33_10762;
	public FlickeringSetting flickeringSetting;
	public static final int anInt10764 = 245;
	public TextureSetting textureSetting;
	public ToolkitSetting defaultToolkit;
	public ToolkitSetting toolkit;
	Class710_Sub1 aClass710_Sub1_10768;
	public Class710_Sub12 aClass710_Sub12_10769;
	public BuildAreaSetting buildAreaSetting;
	public Class710_Sub12 aClass710_Sub12_10771;
	Class710_Sub24 aClass710_Sub24_10772;
	Class710_Sub6 aClass710_Sub6_10773;
	public AnimationDetailSetting animationDetailSetting;
	Class710_Sub32 aClass710_Sub32_10775;
	Class710_Sub22 aClass710_Sub22_10776;
	Class710_Sub38 aClass710_Sub38_10777;
	Class710_Sub19 aClass710_Sub19_10778;
	public Class710_Sub20 aClass710_Sub20_10779;
	public Class710_Sub43 aClass710_Sub43_10780;
	public SpotShadowSetting spotShadowSetting;
	public LoadingScreenTypeSetting loadingScreenTypeSetting;
	public Class710_Sub39 aClass710_Sub39_10783;
	public Class710_Sub41 aClass710_Sub41_10784;
	public SoundVolumeSetting soundVolumeSetting;
	public Class710_Sub30 aClass710_Sub30_10786;
	public BloomSetting bloomSetting;
	public SoundVolumeSetting speechVolumeSetting;
	Class710_Sub18 aClass710_Sub18_10789;
	public SoundVolumeSetting loginMusicVolumeSetting;
	public StereoVolumeSetting stereoVolumeSetting;
	static final int anInt10792 = 52;

	void method9851() {
		animationDetailSetting.method10124(65536);
		defaultAntiAliasingSetting.method10154(-1958948196);
		aClass710_Sub36_10744.method10223((byte) 8);
		antiAliasingSetting.method10154(-274719837);
		bloomSetting.method10203(2066072655);
		brightnessSetting.method10045(-1176720877);
		buildAreaSetting.method9994(1082546690);
		drawDistanceSetting.method10247(-37898218);
		flickeringSetting.method10086((short) 9696);
		fogSetting.method10079(2058445502);
		groundBlendingSetting.method10176(879260300);
		groundDecorationSetting.method9933(-984277746);
		idleAnimationSetting.method10107(898209787);
		lightingDetailSetting.method10061(586752807);
		shadowSetting.method10001(2106213052);
		shadowQualitySetting.method10024(-1722803094);
		aClass710_Sub20_10779.method10105(-827400802);
		aClass710_Sub4_10759.method9908((byte) -31);
		defaultRemoveRoofSetting.method9915(-1036693303);
		removeRoofSetting.method9915(1479946779);
		aClass710_Sub33_10762.method10195(-982278163);
		aClass710_Sub25_10735.method10140(-488814257);
		spotShadowSetting.method10012((byte) 6);
		textureSetting.method9884(-1597591273);
		defaultToolkit.method10067(-119122951);
		toolkit.method10067(-879494631);
		waterDetailSetting.method9892(-640844782);
		aClass710_Sub12_10769.method10037(386145325);
		aClass710_Sub12_10771.method10037(901620979);
		aClass710_Sub1_10768.method9879(1390067952);
		aClass710_Sub24_10772.method10134((short) -19982);
		aClass710_Sub6_10773.method9922(855404906);
		aClass710_Sub18_10789.method10093((byte) 42);
		aClass710_Sub32_10775.method10191(-1253323999);
		aClass710_Sub22_10776.method10116(-1642629312);
		aClass710_Sub38_10777.method10230(-1127756811);
		aClass710_Sub19_10778.method10100(92567916);
		customCursorSetting.method10164(1399596520);
		aClass710_Sub43_10780.method10274((byte) 1);
		cpuUsageSetting.method10150((byte) -101);
		loadingScreenTypeSetting.method10185(-83350428);
		aClass710_Sub39_10783.method10237(687489063);
		aClass710_Sub41_10784.method10252(2030015991);
		aClass710_Sub42_10737.method10266(104552495);
		aClass710_Sub30_10786.method10179(2017756344);
		soundVolumeSetting.method10212(1675435656);
		bgSoundVolumeSetting.method10212(1675435656);
		speechVolumeSetting.method10212(1675435656);
		musicVolumeSetting.method10212(1675435656);
		loginMusicVolumeSetting.method10212(1675435656);
		stereoVolumeSetting.method10225(-16711936);
	}

	public RSByteBuffer method9852(int i) {
		RSByteBuffer class536_sub33 = new RSByteBuffer(52);
		class536_sub33.writeByte(36);
		class536_sub33.writeByte(animationDetailSetting.method10126(1041246061));
		class536_sub33.writeByte(defaultAntiAliasingSetting.method10156());
		class536_sub33.writeByte(aClass710_Sub36_10744.method10218(-347483380));
		class536_sub33.writeByte(bloomSetting.method10204(1867269829));
		class536_sub33.writeByte(brightnessSetting.method10046(-1506046098));
		class536_sub33.writeByte(buildAreaSetting.method9996((byte) 127));
		class536_sub33.writeByte(drawDistanceSetting.method10246(-2026593254));
		class536_sub33.writeByte(flickeringSetting.method10087(1988781864));
		class536_sub33.writeByte(fogSetting.method10081(1436659191));
		class536_sub33.writeByte(groundBlendingSetting.method10171(-498458505));
		class536_sub33.writeByte(groundDecorationSetting.method9932(-2015548878));
		class536_sub33.writeByte(idleAnimationSetting.method10109((byte) 1));
		class536_sub33.writeByte(lightingDetailSetting.method10066((byte) 0));
		class536_sub33.writeByte(shadowSetting.method10004(-1348090342));
		class536_sub33.writeByte(shadowQualitySetting.method10023(1421191815));
		class536_sub33.writeByte(0);
		class536_sub33.writeByte(aClass710_Sub20_10779.method10103((byte) -52));
		class536_sub33.writeByte(aClass710_Sub4_10759.method9907(-2120892568));
		class536_sub33.writeByte(defaultRemoveRoofSetting.method9916());
		class536_sub33.writeByte(aClass710_Sub33_10762.method10197(-688296624));
		class536_sub33.writeByte(aClass710_Sub25_10735.method10142(1991789900));
		class536_sub33.writeByte(spotShadowSetting.method10014(-1904559876));
		class536_sub33.writeByte(textureSetting.method9885(-527751135));
		class536_sub33.writeByte(defaultToolkit.method10071());
		class536_sub33.writeByte(0);
		class536_sub33.writeByte(waterDetailSetting.method9894(-1017210055));
		class536_sub33.writeByte(aClass710_Sub12_10769.method10038());
		class536_sub33.writeByte(aClass710_Sub24_10772.method10133(511304217));
		class536_sub33.writeByte(aClass710_Sub6_10773.method9923(1346298053));
		class536_sub33.writeByte(aClass710_Sub18_10789.method10094(2113808533));
		class536_sub33.writeByte(aClass710_Sub1_10768.method9877(413798014));
		class536_sub33.writeByte(aClass710_Sub32_10775.method10190(-1084491481));
		class536_sub33.writeByte(aClass710_Sub22_10776.method10117((byte) -41));
		class536_sub33.writeByte(aClass710_Sub38_10777.method10231(814532693));
		class536_sub33.writeByte(aClass710_Sub19_10778.method10099(-1562555947));
		class536_sub33.writeByte(customCursorSetting.method10165((short) 836));
		class536_sub33.writeByte(aClass710_Sub43_10780.method10276(1480325368));
		class536_sub33.writeByte(cpuUsageSetting.method10149(-664631943));
		class536_sub33.writeByte(loadingScreenTypeSetting.method10186(-2116683959));
		class536_sub33.writeByte(aClass710_Sub39_10783.method10236(-2020563113));
		class536_sub33.writeByte(aClass710_Sub41_10784.method10248(65533));
		class536_sub33.writeByte(aClass710_Sub42_10737.method10265(-794457797));
		class536_sub33.writeByte(aClass710_Sub30_10786.method10180(-1647630198));
		class536_sub33.writeByte(soundVolumeSetting.method10213(1362656001));
		class536_sub33.writeByte(bgSoundVolumeSetting.method10213(-1498587746));
		class536_sub33.writeByte(speechVolumeSetting.method10213(-2059787835));
		class536_sub33.writeByte(musicVolumeSetting.method10213(978340300));
		class536_sub33.writeByte(loginMusicVolumeSetting.method10213(-1475311683));
		class536_sub33.writeByte(stereoVolumeSetting.method10226(-1092491273));
		return class536_sub33;
	}

	void method9853(RSByteBuffer class536_sub33, byte i) {
		if (class536_sub33 == null || class536_sub33.buffer == null)
			method9854(true, true, (byte) -65);
		else {
			int i_0_ = class536_sub33.readUnsignedByte();
			if (i_0_ < 23) {
				try {
					method9868(class536_sub33, i_0_, -224868216);
				} catch (Exception exception) {
					method9854(true, true, (byte) -120);
				}
				method9854(false, true, (byte) 35);
			} else if (i_0_ > 36)
				method9854(true, true, (byte) 40);
			else {
				if (i_0_ >= 29)
					animationDetailSetting = new AnimationDetailSetting(class536_sub33.readUnsignedByte(), this);
				defaultAntiAliasingSetting = new AntiAliasingSetting(class536_sub33.readUnsignedByte(), this);
				if (i_0_ >= 31)
					aClass710_Sub36_10744 = new Class710_Sub36(class536_sub33.readUnsignedByte(), this);
				antiAliasingSetting = new AntiAliasingSetting(defaultAntiAliasingSetting.method10156(), this);
				bloomSetting = new BloomSetting(class536_sub33.readUnsignedByte(), this);
				brightnessSetting = new BrightnessSetting(class536_sub33.readUnsignedByte(), this);
				buildAreaSetting = new BuildAreaSetting(class536_sub33.readUnsignedByte(), this);
				if (i_0_ >= 27)
					drawDistanceSetting = new DrawDistanceSetting(class536_sub33.readUnsignedByte(), this);
				flickeringSetting = new FlickeringSetting(class536_sub33.readUnsignedByte(), this);
				fogSetting = new FogSetting(class536_sub33.readUnsignedByte(), this);
				groundBlendingSetting = new GroundBlendingSetting(class536_sub33.readUnsignedByte(), this);
				groundDecorationSetting = new GroundDecorationSetting(class536_sub33.readUnsignedByte(), this);
				idleAnimationSetting = new IdleAnimationSetting(class536_sub33.readUnsignedByte(), this);
				lightingDetailSetting = new LightingDetailSetting(class536_sub33.readUnsignedByte(), this);
				shadowSetting = new ShadowSetting(class536_sub33.readUnsignedByte(), this);
				if (i_0_ >= 33)
					shadowQualitySetting = new ShadowQualitySetting(class536_sub33.readUnsignedByte(), this);
				if (i_0_ >= 34)
					class536_sub33.readUnsignedByte();
				if (i_0_ >= 24)
					aClass710_Sub20_10779 = new Class710_Sub20(class536_sub33.readUnsignedByte(), this);
				aClass710_Sub4_10759 = new Class710_Sub4(class536_sub33.readUnsignedByte(), this);
				defaultRemoveRoofSetting = new RemoveRoofSetting(class536_sub33.readUnsignedByte(), this);
				removeRoofSetting = new RemoveRoofSetting(defaultRemoveRoofSetting.method9916(), this);
				aClass710_Sub33_10762 = new Class710_Sub33(class536_sub33.readUnsignedByte(), this);
				if (i_0_ >= 25)
					aClass710_Sub25_10735 = new Class710_Sub25(class536_sub33.readUnsignedByte(), this);
				spotShadowSetting = new SpotShadowSetting(class536_sub33.readUnsignedByte(), this);
				if (i_0_ <= 25)
					class536_sub33.off += 516175515;
				textureSetting = new TextureSetting(class536_sub33.readUnsignedByte(), this);
				defaultToolkit = new ToolkitSetting(class536_sub33.readUnsignedByte(), this);
				toolkit = new ToolkitSetting(defaultToolkit.method10071(), this);
				class536_sub33.readUnsignedByte();
				waterDetailSetting = new WaterDetailSetting(class536_sub33.readUnsignedByte(), this);
				aClass710_Sub12_10769 = new Class710_Sub12(class536_sub33.readUnsignedByte(), this);
				if (i_0_ >= 35) {
					aClass710_Sub24_10772 = new Class710_Sub24(class536_sub33.readUnsignedByte(), this);
					aClass710_Sub6_10773 = new Class710_Sub6(class536_sub33.readUnsignedByte(), this);
					aClass710_Sub18_10789 = new Class710_Sub18(class536_sub33.readUnsignedByte(), this);
					aClass710_Sub1_10768 = new Class710_Sub1(class536_sub33.readUnsignedByte(), this);
					aClass710_Sub32_10775 = new Class710_Sub32(class536_sub33.readUnsignedByte(), this);
					aClass710_Sub22_10776 = new Class710_Sub22(class536_sub33.readByte(), this);
				}
				if (i_0_ >= 36) {
					aClass710_Sub38_10777 = new Class710_Sub38(class536_sub33.readUnsignedByte(), this);
					aClass710_Sub19_10778 = new Class710_Sub19(class536_sub33.readUnsignedByte(), this);
				}
				aClass710_Sub12_10771 = new Class710_Sub12(aClass710_Sub12_10769.method10038(), this);
				customCursorSetting = new CustomCursorSetting(class536_sub33.readUnsignedByte(), this);
				aClass710_Sub43_10780 = new Class710_Sub43(class536_sub33.readUnsignedByte(), this);
				cpuUsageSetting = new CPUUsageSetting(class536_sub33.readUnsignedByte(), this);
				loadingScreenTypeSetting = new LoadingScreenTypeSetting(class536_sub33.readUnsignedByte(), this);
				aClass710_Sub39_10783 = new Class710_Sub39(class536_sub33.readUnsignedByte(), this);
				if (i_0_ >= 26)
					aClass710_Sub41_10784 = new Class710_Sub41(class536_sub33.readUnsignedByte(), this);
				if (i_0_ >= 28)
					aClass710_Sub42_10737 = new Class710_Sub42(class536_sub33.readUnsignedByte(), this);
				if (i_0_ >= 30)
					aClass710_Sub30_10786 = new Class710_Sub30(class536_sub33.readUnsignedByte(), this);
				soundVolumeSetting = new SoundVolumeSetting(class536_sub33.readUnsignedByte(), this);
				bgSoundVolumeSetting = new SoundVolumeSetting(class536_sub33.readUnsignedByte(), this);
				speechVolumeSetting = new SoundVolumeSetting(class536_sub33.readUnsignedByte(), this);
				musicVolumeSetting = new SoundVolumeSetting(class536_sub33.readUnsignedByte(), this);
				loginMusicVolumeSetting = new SoundVolumeSetting(class536_sub33.readUnsignedByte(), this);
				stereoVolumeSetting = new StereoVolumeSetting(class536_sub33.readUnsignedByte(), this);
				method9854(false, i_0_ < 32, (byte) 37);
			}
		}
		method9867((byte) 124);
	}

	void method9854(boolean bool, boolean bool_1_, byte i) {
		if (bool || animationDetailSetting == null)
			animationDetailSetting = new AnimationDetailSetting(this);
		if (bool || null == defaultAntiAliasingSetting)
			defaultAntiAliasingSetting = new AntiAliasingSetting(this);
		if (bool || aClass710_Sub36_10744 == null)
			aClass710_Sub36_10744 = new Class710_Sub36(this);
		if (bool || null == antiAliasingSetting)
			antiAliasingSetting = new AntiAliasingSetting(defaultAntiAliasingSetting.method10156(), this);
		if (bool || null == bloomSetting)
			bloomSetting = new BloomSetting(this);
		if (bool || null == brightnessSetting)
			brightnessSetting = new BrightnessSetting(this);
		if (bool || buildAreaSetting == null)
			buildAreaSetting = new BuildAreaSetting(this);
		if (bool || null == drawDistanceSetting)
			drawDistanceSetting = new DrawDistanceSetting(this);
		if (bool || null == flickeringSetting)
			flickeringSetting = new FlickeringSetting(this);
		if (bool || fogSetting == null)
			fogSetting = new FogSetting(this);
		if (bool || null == groundBlendingSetting)
			groundBlendingSetting = new GroundBlendingSetting(this);
		if (bool || groundDecorationSetting == null)
			groundDecorationSetting = new GroundDecorationSetting(this);
		if (bool || idleAnimationSetting == null)
			idleAnimationSetting = new IdleAnimationSetting(this);
		if (bool || lightingDetailSetting == null)
			lightingDetailSetting = new LightingDetailSetting(this);
		if (bool || null == shadowSetting)
			shadowSetting = new ShadowSetting(this);
		if (bool || shadowQualitySetting == null)
			shadowQualitySetting = new ShadowQualitySetting(this);
		if (bool || aClass710_Sub20_10779 == null)
			aClass710_Sub20_10779 = new Class710_Sub20(this);
		if (bool || null == aClass710_Sub4_10759)
			aClass710_Sub4_10759 = new Class710_Sub4(this);
		if (bool || defaultRemoveRoofSetting == null)
			defaultRemoveRoofSetting = new RemoveRoofSetting(this);
		if (bool || removeRoofSetting == null)
			removeRoofSetting = new RemoveRoofSetting(defaultRemoveRoofSetting.method9916(), this);
		if (bool || null == aClass710_Sub33_10762)
			aClass710_Sub33_10762 = new Class710_Sub33(this);
		if (bool || null == aClass710_Sub25_10735)
			aClass710_Sub25_10735 = new Class710_Sub25(this);
		if (bool || spotShadowSetting == null)
			spotShadowSetting = new SpotShadowSetting(this);
		if (bool || textureSetting == null)
			textureSetting = new TextureSetting(this);
		if (bool || defaultToolkit == null)
			defaultToolkit = new ToolkitSetting(this);
		if (bool || null == toolkit)
			toolkit = new ToolkitSetting(defaultToolkit.method10071(), this);
		if (bool || null == waterDetailSetting)
			waterDetailSetting = new WaterDetailSetting(this);
		if (bool || aClass710_Sub12_10769 == null)
			aClass710_Sub12_10769 = new Class710_Sub12(this);
		if (bool || null == aClass710_Sub12_10771)
			aClass710_Sub12_10771 = new Class710_Sub12(aClass710_Sub12_10769.method10038(), this);
		if (bool || aClass710_Sub1_10768 == null)
			aClass710_Sub1_10768 = new Class710_Sub1(this);
		if (bool || null == aClass710_Sub24_10772)
			aClass710_Sub24_10772 = new Class710_Sub24(this);
		if (bool || null == aClass710_Sub6_10773)
			aClass710_Sub6_10773 = new Class710_Sub6(this);
		if (bool || aClass710_Sub18_10789 == null)
			aClass710_Sub18_10789 = new Class710_Sub18(this);
		if (bool || null == aClass710_Sub32_10775)
			aClass710_Sub32_10775 = new Class710_Sub32(this);
		if (bool || null == aClass710_Sub22_10776)
			aClass710_Sub22_10776 = new Class710_Sub22(this);
		if (bool || null == aClass710_Sub38_10777)
			aClass710_Sub38_10777 = new Class710_Sub38(this);
		if (bool || aClass710_Sub19_10778 == null)
			aClass710_Sub19_10778 = new Class710_Sub19(this);
		if (bool || customCursorSetting == null)
			customCursorSetting = new CustomCursorSetting(this);
		if (bool || aClass710_Sub43_10780 == null)
			aClass710_Sub43_10780 = new Class710_Sub43(this);
		if (bool || null == cpuUsageSetting)
			cpuUsageSetting = new CPUUsageSetting(this);
		if (bool || loadingScreenTypeSetting == null)
			loadingScreenTypeSetting = new LoadingScreenTypeSetting(this);
		if (bool || aClass710_Sub39_10783 == null)
			aClass710_Sub39_10783 = new Class710_Sub39(this);
		if (bool || aClass710_Sub41_10784 == null)
			aClass710_Sub41_10784 = new Class710_Sub41(this);
		if (bool || aClass710_Sub42_10737 == null)
			aClass710_Sub42_10737 = new Class710_Sub42(this);
		if (bool || aClass710_Sub30_10786 == null)
			aClass710_Sub30_10786 = new Class710_Sub30(this);
		if (bool || bool_1_ || soundVolumeSetting == null)
			soundVolumeSetting = new SoundVolumeSetting(this);
		if (bool || bool_1_ || null == bgSoundVolumeSetting)
			bgSoundVolumeSetting = new SoundVolumeSetting(this);
		if (bool || bool_1_ || speechVolumeSetting == null)
			speechVolumeSetting = new SoundVolumeSetting(this);
		if (bool || bool_1_ || musicVolumeSetting == null)
			musicVolumeSetting = new SoundVolumeSetting(this);
		if (bool || bool_1_ || loginMusicVolumeSetting == null)
			loginMusicVolumeSetting = new SoundVolumeSetting(this);
		if (bool || bool_1_ || stereoVolumeSetting == null)
			stereoVolumeSetting = new StereoVolumeSetting(this);
	}

	void method9855() {
		animationDetailSetting.method10124(65536);
		defaultAntiAliasingSetting.method10154(-1462339097);
		aClass710_Sub36_10744.method10223((byte) -114);
		antiAliasingSetting.method10154(-1641729105);
		bloomSetting.method10203(2146701114);
		brightnessSetting.method10045(-1176720877);
		buildAreaSetting.method9994(1082546690);
		drawDistanceSetting.method10247(-825255976);
		flickeringSetting.method10086((short) 4123);
		fogSetting.method10079(1808700339);
		groundBlendingSetting.method10176(-119718409);
		groundDecorationSetting.method9933(-2006674026);
		idleAnimationSetting.method10107(2145036854);
		lightingDetailSetting.method10061(586752807);
		shadowSetting.method10001(2005362649);
		shadowQualitySetting.method10024(1087922372);
		aClass710_Sub20_10779.method10105(-1296869224);
		aClass710_Sub4_10759.method9908((byte) 15);
		defaultRemoveRoofSetting.method9915(1987749438);
		removeRoofSetting.method9915(-1432827691);
		aClass710_Sub33_10762.method10195(1003099838);
		aClass710_Sub25_10735.method10140(151820523);
		spotShadowSetting.method10012((byte) 115);
		textureSetting.method9884(-1502701656);
		defaultToolkit.method10067(-891119252);
		toolkit.method10067(-1677472035);
		waterDetailSetting.method9892(341900954);
		aClass710_Sub12_10769.method10037(1013493891);
		aClass710_Sub12_10771.method10037(85334637);
		aClass710_Sub1_10768.method9879(1390067952);
		aClass710_Sub24_10772.method10134((short) -1491);
		aClass710_Sub6_10773.method9922(855404906);
		aClass710_Sub18_10789.method10093((byte) 43);
		aClass710_Sub32_10775.method10191(-1253323999);
		aClass710_Sub22_10776.method10116(-1693429759);
		aClass710_Sub38_10777.method10230(919166668);
		aClass710_Sub19_10778.method10100(1532361106);
		customCursorSetting.method10164(784845089);
		aClass710_Sub43_10780.method10274((byte) 1);
		cpuUsageSetting.method10150((byte) -41);
		loadingScreenTypeSetting.method10185(-755404303);
		aClass710_Sub39_10783.method10237(-155987072);
		aClass710_Sub41_10784.method10252(-1014867095);
		aClass710_Sub42_10737.method10266(-1803376306);
		aClass710_Sub30_10786.method10179(2055524057);
		soundVolumeSetting.method10212(1675435656);
		bgSoundVolumeSetting.method10212(1675435656);
		speechVolumeSetting.method10212(1675435656);
		musicVolumeSetting.method10212(1675435656);
		loginMusicVolumeSetting.method10212(1675435656);
		stereoVolumeSetting.method10225(-16711936);
	}

	public Class711 method9856(int i) {
		return aClass711_10740;
	}

	public void method9857(ClientSetting class710, int i, byte i_2_) {
		class710.method8349(i, 434788932);
		method9867((byte) 113);
	}

	public void method9858(ToolkitSetting class710_sub15, boolean bool, byte i) {
		class710_sub15.method10072(bool, (byte) -39);
		method9867((byte) 85);
	}

	void method9859() {
		animationDetailSetting.method10124(65536);
		defaultAntiAliasingSetting.method10154(-245454412);
		aClass710_Sub36_10744.method10223((byte) -22);
		antiAliasingSetting.method10154(-575100607);
		bloomSetting.method10203(2067435611);
		brightnessSetting.method10045(-1176720877);
		buildAreaSetting.method9994(1082546690);
		drawDistanceSetting.method10247(-190797148);
		flickeringSetting.method10086((short) -24025);
		fogSetting.method10079(-1630459056);
		groundBlendingSetting.method10176(-1816731293);
		groundDecorationSetting.method9933(-803495952);
		idleAnimationSetting.method10107(-1256181355);
		lightingDetailSetting.method10061(586752807);
		shadowSetting.method10001(1391704560);
		shadowQualitySetting.method10024(837742090);
		aClass710_Sub20_10779.method10105(-1846961904);
		aClass710_Sub4_10759.method9908((byte) -114);
		defaultRemoveRoofSetting.method9915(410620271);
		removeRoofSetting.method9915(1524254265);
		aClass710_Sub33_10762.method10195(-576223509);
		aClass710_Sub25_10735.method10140(-107128106);
		spotShadowSetting.method10012((byte) 59);
		textureSetting.method9884(-1988791406);
		defaultToolkit.method10067(-927850547);
		toolkit.method10067(1405696681);
		waterDetailSetting.method9892(-971712567);
		aClass710_Sub12_10769.method10037(1540913823);
		aClass710_Sub12_10771.method10037(683222258);
		aClass710_Sub1_10768.method9879(1390067952);
		aClass710_Sub24_10772.method10134((short) -11475);
		aClass710_Sub6_10773.method9922(855404906);
		aClass710_Sub18_10789.method10093((byte) 96);
		aClass710_Sub32_10775.method10191(-1253323999);
		aClass710_Sub22_10776.method10116(-1646077012);
		aClass710_Sub38_10777.method10230(2144686770);
		aClass710_Sub19_10778.method10100(-1909503868);
		customCursorSetting.method10164(347698882);
		aClass710_Sub43_10780.method10274((byte) 1);
		cpuUsageSetting.method10150((byte) -75);
		loadingScreenTypeSetting.method10185(-52981784);
		aClass710_Sub39_10783.method10237(-1404165787);
		aClass710_Sub41_10784.method10252(198292002);
		aClass710_Sub42_10737.method10266(-216901818);
		aClass710_Sub30_10786.method10179(2018283507);
		soundVolumeSetting.method10212(1675435656);
		bgSoundVolumeSetting.method10212(1675435656);
		speechVolumeSetting.method10212(1675435656);
		musicVolumeSetting.method10212(1675435656);
		loginMusicVolumeSetting.method10212(1675435656);
		stereoVolumeSetting.method10225(-16711936);
	}

	public ClientSettings(RSByteBuffer buffer, GameMode class670, int i) {
		gameMode = class670;
		aClass711_10740 = new Class711(GameShell.maxMemory * -839563813, 678116975 * GameShell.cpuCount, Class451.osArchRaw.indexOf("arm") != -1, Class241.osName.startsWith("win"), false);
		toolkit = new ToolkitSetting(i, this);
		method9853(buffer, (byte) -5);
	}

	void method9860(RSByteBuffer buffer) {
		if (buffer == null || buffer.buffer == null)
			method9854(true, true, (byte) 67);
		else {
			int i = buffer.readUnsignedByte();
			if (i < 23) {
				try {
					method9868(buffer, i, -224868216);
				} catch (Exception exception) {
					method9854(true, true, (byte) 22);
				}
				method9854(false, true, (byte) 16);
			} else if (i > 36)
				method9854(true, true, (byte) -47);
			else {
				if (i >= 29)
					animationDetailSetting = new AnimationDetailSetting(buffer.readUnsignedByte(), this);
				defaultAntiAliasingSetting = new AntiAliasingSetting(buffer.readUnsignedByte(), this);
				if (i >= 31)
					aClass710_Sub36_10744 = new Class710_Sub36(buffer.readUnsignedByte(), this);
				antiAliasingSetting = new AntiAliasingSetting(defaultAntiAliasingSetting.method10156(), this);
				bloomSetting = new BloomSetting(buffer.readUnsignedByte(), this);
				brightnessSetting = new BrightnessSetting(buffer.readUnsignedByte(), this);
				buildAreaSetting = new BuildAreaSetting(buffer.readUnsignedByte(), this);
				if (i >= 27)
					drawDistanceSetting = new DrawDistanceSetting(buffer.readUnsignedByte(), this);
				flickeringSetting = new FlickeringSetting(buffer.readUnsignedByte(), this);
				fogSetting = new FogSetting(buffer.readUnsignedByte(), this);
				groundBlendingSetting = new GroundBlendingSetting(buffer.readUnsignedByte(), this);
				groundDecorationSetting = new GroundDecorationSetting(buffer.readUnsignedByte(), this);
				idleAnimationSetting = new IdleAnimationSetting(buffer.readUnsignedByte(), this);
				lightingDetailSetting = new LightingDetailSetting(buffer.readUnsignedByte(), this);
				shadowSetting = new ShadowSetting(buffer.readUnsignedByte(), this);
				if (i >= 33)
					shadowQualitySetting = new ShadowQualitySetting(buffer.readUnsignedByte(), this);
				if (i >= 34)
					buffer.readUnsignedByte();
				if (i >= 24)
					aClass710_Sub20_10779 = new Class710_Sub20(buffer.readUnsignedByte(), this);
				aClass710_Sub4_10759 = new Class710_Sub4(buffer.readUnsignedByte(), this);
				defaultRemoveRoofSetting = new RemoveRoofSetting(buffer.readUnsignedByte(), this);
				removeRoofSetting = new RemoveRoofSetting(defaultRemoveRoofSetting.method9916(), this);
				aClass710_Sub33_10762 = new Class710_Sub33(buffer.readUnsignedByte(), this);
				if (i >= 25)
					aClass710_Sub25_10735 = new Class710_Sub25(buffer.readUnsignedByte(), this);
				spotShadowSetting = new SpotShadowSetting(buffer.readUnsignedByte(), this);
				if (i <= 25)
					buffer.off += 516175515;
				textureSetting = new TextureSetting(buffer.readUnsignedByte(), this);
				defaultToolkit = new ToolkitSetting(buffer.readUnsignedByte(), this);
				toolkit = new ToolkitSetting(defaultToolkit.method10071(), this);
				buffer.readUnsignedByte();
				waterDetailSetting = new WaterDetailSetting(buffer.readUnsignedByte(), this);
				aClass710_Sub12_10769 = new Class710_Sub12(buffer.readUnsignedByte(), this);
				if (i >= 35) {
					aClass710_Sub24_10772 = new Class710_Sub24(buffer.readUnsignedByte(), this);
					aClass710_Sub6_10773 = new Class710_Sub6(buffer.readUnsignedByte(), this);
					aClass710_Sub18_10789 = new Class710_Sub18(buffer.readUnsignedByte(), this);
					aClass710_Sub1_10768 = new Class710_Sub1(buffer.readUnsignedByte(), this);
					aClass710_Sub32_10775 = new Class710_Sub32(buffer.readUnsignedByte(), this);
					aClass710_Sub22_10776 = new Class710_Sub22(buffer.readByte(), this);
				}
				if (i >= 36) {
					aClass710_Sub38_10777 = new Class710_Sub38(buffer.readUnsignedByte(), this);
					aClass710_Sub19_10778 = new Class710_Sub19(buffer.readUnsignedByte(), this);
				}
				aClass710_Sub12_10771 = new Class710_Sub12(aClass710_Sub12_10769.method10038(), this);
				customCursorSetting = new CustomCursorSetting(buffer.readUnsignedByte(), this);
				aClass710_Sub43_10780 = new Class710_Sub43(buffer.readUnsignedByte(), this);
				cpuUsageSetting = new CPUUsageSetting(buffer.readUnsignedByte(), this);
				loadingScreenTypeSetting = new LoadingScreenTypeSetting(buffer.readUnsignedByte(), this);
				aClass710_Sub39_10783 = new Class710_Sub39(buffer.readUnsignedByte(), this);
				if (i >= 26)
					aClass710_Sub41_10784 = new Class710_Sub41(buffer.readUnsignedByte(), this);
				if (i >= 28)
					aClass710_Sub42_10737 = new Class710_Sub42(buffer.readUnsignedByte(), this);
				if (i >= 30)
					aClass710_Sub30_10786 = new Class710_Sub30(buffer.readUnsignedByte(), this);
				soundVolumeSetting = new SoundVolumeSetting(buffer.readUnsignedByte(), this);
				bgSoundVolumeSetting = new SoundVolumeSetting(buffer.readUnsignedByte(), this);
				speechVolumeSetting = new SoundVolumeSetting(buffer.readUnsignedByte(), this);
				musicVolumeSetting = new SoundVolumeSetting(buffer.readUnsignedByte(), this);
				loginMusicVolumeSetting = new SoundVolumeSetting(buffer.readUnsignedByte(), this);
				stereoVolumeSetting = new StereoVolumeSetting(buffer.readUnsignedByte(), this);
				method9854(false, i < 32, (byte) -38);
			}
		}
		method9867((byte) 124);
	}

	void method9862(boolean bool, boolean bool_3_) {
		if (bool || animationDetailSetting == null)
			animationDetailSetting = new AnimationDetailSetting(this);
		if (bool || null == defaultAntiAliasingSetting)
			defaultAntiAliasingSetting = new AntiAliasingSetting(this);
		if (bool || aClass710_Sub36_10744 == null)
			aClass710_Sub36_10744 = new Class710_Sub36(this);
		if (bool || null == antiAliasingSetting)
			antiAliasingSetting = new AntiAliasingSetting(defaultAntiAliasingSetting.method10156(), this);
		if (bool || null == bloomSetting)
			bloomSetting = new BloomSetting(this);
		if (bool || null == brightnessSetting)
			brightnessSetting = new BrightnessSetting(this);
		if (bool || buildAreaSetting == null)
			buildAreaSetting = new BuildAreaSetting(this);
		if (bool || null == drawDistanceSetting)
			drawDistanceSetting = new DrawDistanceSetting(this);
		if (bool || null == flickeringSetting)
			flickeringSetting = new FlickeringSetting(this);
		if (bool || fogSetting == null)
			fogSetting = new FogSetting(this);
		if (bool || null == groundBlendingSetting)
			groundBlendingSetting = new GroundBlendingSetting(this);
		if (bool || groundDecorationSetting == null)
			groundDecorationSetting = new GroundDecorationSetting(this);
		if (bool || idleAnimationSetting == null)
			idleAnimationSetting = new IdleAnimationSetting(this);
		if (bool || lightingDetailSetting == null)
			lightingDetailSetting = new LightingDetailSetting(this);
		if (bool || null == shadowSetting)
			shadowSetting = new ShadowSetting(this);
		if (bool || shadowQualitySetting == null)
			shadowQualitySetting = new ShadowQualitySetting(this);
		if (bool || aClass710_Sub20_10779 == null)
			aClass710_Sub20_10779 = new Class710_Sub20(this);
		if (bool || null == aClass710_Sub4_10759)
			aClass710_Sub4_10759 = new Class710_Sub4(this);
		if (bool || defaultRemoveRoofSetting == null)
			defaultRemoveRoofSetting = new RemoveRoofSetting(this);
		if (bool || removeRoofSetting == null)
			removeRoofSetting = new RemoveRoofSetting(defaultRemoveRoofSetting.method9916(), this);
		if (bool || null == aClass710_Sub33_10762)
			aClass710_Sub33_10762 = new Class710_Sub33(this);
		if (bool || null == aClass710_Sub25_10735)
			aClass710_Sub25_10735 = new Class710_Sub25(this);
		if (bool || spotShadowSetting == null)
			spotShadowSetting = new SpotShadowSetting(this);
		if (bool || textureSetting == null)
			textureSetting = new TextureSetting(this);
		if (bool || defaultToolkit == null)
			defaultToolkit = new ToolkitSetting(this);
		if (bool || null == toolkit)
			toolkit = new ToolkitSetting(defaultToolkit.method10071(), this);
		if (bool || null == waterDetailSetting)
			waterDetailSetting = new WaterDetailSetting(this);
		if (bool || aClass710_Sub12_10769 == null)
			aClass710_Sub12_10769 = new Class710_Sub12(this);
		if (bool || null == aClass710_Sub12_10771)
			aClass710_Sub12_10771 = new Class710_Sub12(aClass710_Sub12_10769.method10038(), this);
		if (bool || aClass710_Sub1_10768 == null)
			aClass710_Sub1_10768 = new Class710_Sub1(this);
		if (bool || null == aClass710_Sub24_10772)
			aClass710_Sub24_10772 = new Class710_Sub24(this);
		if (bool || null == aClass710_Sub6_10773)
			aClass710_Sub6_10773 = new Class710_Sub6(this);
		if (bool || aClass710_Sub18_10789 == null)
			aClass710_Sub18_10789 = new Class710_Sub18(this);
		if (bool || null == aClass710_Sub32_10775)
			aClass710_Sub32_10775 = new Class710_Sub32(this);
		if (bool || null == aClass710_Sub22_10776)
			aClass710_Sub22_10776 = new Class710_Sub22(this);
		if (bool || null == aClass710_Sub38_10777)
			aClass710_Sub38_10777 = new Class710_Sub38(this);
		if (bool || aClass710_Sub19_10778 == null)
			aClass710_Sub19_10778 = new Class710_Sub19(this);
		if (bool || customCursorSetting == null)
			customCursorSetting = new CustomCursorSetting(this);
		if (bool || aClass710_Sub43_10780 == null)
			aClass710_Sub43_10780 = new Class710_Sub43(this);
		if (bool || null == cpuUsageSetting)
			cpuUsageSetting = new CPUUsageSetting(this);
		if (bool || loadingScreenTypeSetting == null)
			loadingScreenTypeSetting = new LoadingScreenTypeSetting(this);
		if (bool || aClass710_Sub39_10783 == null)
			aClass710_Sub39_10783 = new Class710_Sub39(this);
		if (bool || aClass710_Sub41_10784 == null)
			aClass710_Sub41_10784 = new Class710_Sub41(this);
		if (bool || aClass710_Sub42_10737 == null)
			aClass710_Sub42_10737 = new Class710_Sub42(this);
		if (bool || aClass710_Sub30_10786 == null)
			aClass710_Sub30_10786 = new Class710_Sub30(this);
		if (bool || bool_3_ || soundVolumeSetting == null)
			soundVolumeSetting = new SoundVolumeSetting(this);
		if (bool || bool_3_ || null == bgSoundVolumeSetting)
			bgSoundVolumeSetting = new SoundVolumeSetting(this);
		if (bool || bool_3_ || speechVolumeSetting == null)
			speechVolumeSetting = new SoundVolumeSetting(this);
		if (bool || bool_3_ || musicVolumeSetting == null)
			musicVolumeSetting = new SoundVolumeSetting(this);
		if (bool || bool_3_ || loginMusicVolumeSetting == null)
			loginMusicVolumeSetting = new SoundVolumeSetting(this);
		if (bool || bool_3_ || stereoVolumeSetting == null)
			stereoVolumeSetting = new StereoVolumeSetting(this);
	}

	void method9863(RSByteBuffer class536_sub33, int i) {
		brightnessSetting = new BrightnessSetting(class536_sub33.readUnsignedByte(), this);
		class536_sub33.off += 516175515;
		defaultRemoveRoofSetting = new RemoveRoofSetting(class536_sub33.readUnsignedByte() + 1, this);
		groundDecorationSetting = new GroundDecorationSetting(class536_sub33.readUnsignedByte(), this);
		class536_sub33.off += 516175515;
		idleAnimationSetting = new IdleAnimationSetting(class536_sub33.readUnsignedByte(), this);
		flickeringSetting = new FlickeringSetting(class536_sub33.readUnsignedByte(), this);
		class536_sub33.readUnsignedByte();
		spotShadowSetting = new SpotShadowSetting(class536_sub33.readUnsignedByte(), this);
		int i_4_ = class536_sub33.readUnsignedByte();
		int i_5_ = 0;
		if (i >= 17)
			i_5_ = class536_sub33.readUnsignedByte();
		shadowSetting = new ShadowSetting(i_4_ > i_5_ ? i_4_ : i_5_, this);
		boolean bool = true;
		boolean bool_6_ = true;
		if (i >= 2) {
			bool = class536_sub33.readUnsignedByte() == 1;
			if (i >= 17)
				bool_6_ = class536_sub33.readUnsignedByte() == 1;
		} else {
			bool = class536_sub33.readUnsignedByte() == 1;
			class536_sub33.readUnsignedByte();
		}
		lightingDetailSetting = new LightingDetailSetting(bool | bool_6_ ? 1 : 0, this);
		waterDetailSetting = new WaterDetailSetting(class536_sub33.readUnsignedByte(), this);
		fogSetting = new FogSetting(class536_sub33.readUnsignedByte(), this);
		defaultAntiAliasingSetting = new AntiAliasingSetting(class536_sub33.readUnsignedByte(), this);
		stereoVolumeSetting = new StereoVolumeSetting(class536_sub33.readUnsignedByte(), this);
		soundVolumeSetting = new SoundVolumeSetting(class536_sub33.readUnsignedByte(), this);
		if (i >= 20)
			speechVolumeSetting = new SoundVolumeSetting(class536_sub33.readUnsignedByte(), this);
		else
			speechVolumeSetting = new SoundVolumeSetting(soundVolumeSetting.method10213(1793432487), this);
		musicVolumeSetting = new SoundVolumeSetting(class536_sub33.readUnsignedByte(), this);
		bgSoundVolumeSetting = new SoundVolumeSetting(class536_sub33.readUnsignedByte(), this);
		if (i >= 21)
			loginMusicVolumeSetting = new SoundVolumeSetting(class536_sub33.readUnsignedByte(), this);
		else
			loginMusicVolumeSetting = new SoundVolumeSetting(musicVolumeSetting.method10213(-2052807084), this);
		if (i >= 1) {
			class536_sub33.readUnsignedShort();
			class536_sub33.readUnsignedShort();
		}
		if (i >= 3 && i < 6)
			class536_sub33.readUnsignedByte();
		if (i >= 4)
			aClass710_Sub4_10759 = new Class710_Sub4(class536_sub33.readUnsignedByte(), this);
		class536_sub33.readInt();
		if (i >= 6)
			aClass710_Sub12_10769 = new Class710_Sub12(class536_sub33.readUnsignedByte(), this);
		if (i >= 7)
			aClass710_Sub39_10783 = new Class710_Sub39(class536_sub33.readUnsignedByte(), this);
		if (i >= 8)
			class536_sub33.readUnsignedByte();
		if (i >= 9)
			buildAreaSetting = new BuildAreaSetting(class536_sub33.readUnsignedByte(), this);
		if (i >= 10)
			bloomSetting = new BloomSetting(class536_sub33.readUnsignedByte(), this);
		if (i >= 11)
			customCursorSetting = new CustomCursorSetting(class536_sub33.readUnsignedByte(), this);
		if (i >= 12)
			idleAnimationSetting = new IdleAnimationSetting(class536_sub33.readUnsignedByte(), this);
		if (i >= 13)
			groundBlendingSetting = new GroundBlendingSetting(class536_sub33.readUnsignedByte(), this);
		if (i >= 14)
			defaultToolkit = new ToolkitSetting(class536_sub33.readUnsignedByte(), this);
		if (i >= 15)
			cpuUsageSetting = new CPUUsageSetting(class536_sub33.readUnsignedByte(), this);
		if (i >= 16)
			textureSetting = new TextureSetting(class536_sub33.readUnsignedByte(), this);
		if (i >= 18)
			aClass710_Sub43_10780 = new Class710_Sub43(class536_sub33.readUnsignedByte(), this);
		if (i >= 19)
			aClass710_Sub33_10762 = new Class710_Sub33(class536_sub33.readUnsignedByte(), this);
		if (i >= 22)
			loadingScreenTypeSetting = new LoadingScreenTypeSetting(class536_sub33.readUnsignedByte(), this);
	}

	void method9864(RSByteBuffer class536_sub33, int i) {
		brightnessSetting = new BrightnessSetting(class536_sub33.readUnsignedByte(), this);
		class536_sub33.off += 516175515;
		defaultRemoveRoofSetting = new RemoveRoofSetting(class536_sub33.readUnsignedByte() + 1, this);
		groundDecorationSetting = new GroundDecorationSetting(class536_sub33.readUnsignedByte(), this);
		class536_sub33.off += 516175515;
		idleAnimationSetting = new IdleAnimationSetting(class536_sub33.readUnsignedByte(), this);
		flickeringSetting = new FlickeringSetting(class536_sub33.readUnsignedByte(), this);
		class536_sub33.readUnsignedByte();
		spotShadowSetting = new SpotShadowSetting(class536_sub33.readUnsignedByte(), this);
		int i_7_ = class536_sub33.readUnsignedByte();
		int i_8_ = 0;
		if (i >= 17)
			i_8_ = class536_sub33.readUnsignedByte();
		shadowSetting = new ShadowSetting(i_7_ > i_8_ ? i_7_ : i_8_, this);
		boolean bool = true;
		boolean bool_9_ = true;
		if (i >= 2) {
			bool = class536_sub33.readUnsignedByte() == 1;
			if (i >= 17)
				bool_9_ = class536_sub33.readUnsignedByte() == 1;
		} else {
			bool = class536_sub33.readUnsignedByte() == 1;
			class536_sub33.readUnsignedByte();
		}
		lightingDetailSetting = new LightingDetailSetting(bool | bool_9_ ? 1 : 0, this);
		waterDetailSetting = new WaterDetailSetting(class536_sub33.readUnsignedByte(), this);
		fogSetting = new FogSetting(class536_sub33.readUnsignedByte(), this);
		defaultAntiAliasingSetting = new AntiAliasingSetting(class536_sub33.readUnsignedByte(), this);
		stereoVolumeSetting = new StereoVolumeSetting(class536_sub33.readUnsignedByte(), this);
		soundVolumeSetting = new SoundVolumeSetting(class536_sub33.readUnsignedByte(), this);
		if (i >= 20)
			speechVolumeSetting = new SoundVolumeSetting(class536_sub33.readUnsignedByte(), this);
		else
			speechVolumeSetting = new SoundVolumeSetting(soundVolumeSetting.method10213(-1094452940), this);
		musicVolumeSetting = new SoundVolumeSetting(class536_sub33.readUnsignedByte(), this);
		bgSoundVolumeSetting = new SoundVolumeSetting(class536_sub33.readUnsignedByte(), this);
		if (i >= 21)
			loginMusicVolumeSetting = new SoundVolumeSetting(class536_sub33.readUnsignedByte(), this);
		else
			loginMusicVolumeSetting = new SoundVolumeSetting(musicVolumeSetting.method10213(-691218673), this);
		if (i >= 1) {
			class536_sub33.readUnsignedShort();
			class536_sub33.readUnsignedShort();
		}
		if (i >= 3 && i < 6)
			class536_sub33.readUnsignedByte();
		if (i >= 4)
			aClass710_Sub4_10759 = new Class710_Sub4(class536_sub33.readUnsignedByte(), this);
		class536_sub33.readInt();
		if (i >= 6)
			aClass710_Sub12_10769 = new Class710_Sub12(class536_sub33.readUnsignedByte(), this);
		if (i >= 7)
			aClass710_Sub39_10783 = new Class710_Sub39(class536_sub33.readUnsignedByte(), this);
		if (i >= 8)
			class536_sub33.readUnsignedByte();
		if (i >= 9)
			buildAreaSetting = new BuildAreaSetting(class536_sub33.readUnsignedByte(), this);
		if (i >= 10)
			bloomSetting = new BloomSetting(class536_sub33.readUnsignedByte(), this);
		if (i >= 11)
			customCursorSetting = new CustomCursorSetting(class536_sub33.readUnsignedByte(), this);
		if (i >= 12)
			idleAnimationSetting = new IdleAnimationSetting(class536_sub33.readUnsignedByte(), this);
		if (i >= 13)
			groundBlendingSetting = new GroundBlendingSetting(class536_sub33.readUnsignedByte(), this);
		if (i >= 14)
			defaultToolkit = new ToolkitSetting(class536_sub33.readUnsignedByte(), this);
		if (i >= 15)
			cpuUsageSetting = new CPUUsageSetting(class536_sub33.readUnsignedByte(), this);
		if (i >= 16)
			textureSetting = new TextureSetting(class536_sub33.readUnsignedByte(), this);
		if (i >= 18)
			aClass710_Sub43_10780 = new Class710_Sub43(class536_sub33.readUnsignedByte(), this);
		if (i >= 19)
			aClass710_Sub33_10762 = new Class710_Sub33(class536_sub33.readUnsignedByte(), this);
		if (i >= 22)
			loadingScreenTypeSetting = new LoadingScreenTypeSetting(class536_sub33.readUnsignedByte(), this);
	}

	public GameMode method9865(byte i) {
		return gameMode;
	}

	void method9866() {
		animationDetailSetting.method10124(65536);
		defaultAntiAliasingSetting.method10154(-510770956);
		aClass710_Sub36_10744.method10223((byte) 93);
		antiAliasingSetting.method10154(-1911794815);
		bloomSetting.method10203(1964491609);
		brightnessSetting.method10045(-1176720877);
		buildAreaSetting.method9994(1082546690);
		drawDistanceSetting.method10247(-431578518);
		flickeringSetting.method10086((short) 9627);
		fogSetting.method10079(-1030151420);
		groundBlendingSetting.method10176(-1508193672);
		groundDecorationSetting.method9933(-1515207404);
		idleAnimationSetting.method10107(-931663595);
		lightingDetailSetting.method10061(586752807);
		shadowSetting.method10001(1432725026);
		shadowQualitySetting.method10024(711488823);
		aClass710_Sub20_10779.method10105(-1364997833);
		aClass710_Sub4_10759.method9908((byte) -27);
		defaultRemoveRoofSetting.method9915(541832659);
		removeRoofSetting.method9915(190727983);
		aClass710_Sub33_10762.method10195(110413950);
		aClass710_Sub25_10735.method10140(-842395518);
		spotShadowSetting.method10012((byte) 48);
		textureSetting.method9884(-2068644348);
		defaultToolkit.method10067(-255277774);
		toolkit.method10067(993170649);
		waterDetailSetting.method9892(-603322099);
		aClass710_Sub12_10769.method10037(139759164);
		aClass710_Sub12_10771.method10037(473390638);
		aClass710_Sub1_10768.method9879(1390067952);
		aClass710_Sub24_10772.method10134((short) -9830);
		aClass710_Sub6_10773.method9922(855404906);
		aClass710_Sub18_10789.method10093((byte) 27);
		aClass710_Sub32_10775.method10191(-1253323999);
		aClass710_Sub22_10776.method10116(-1675139028);
		aClass710_Sub38_10777.method10230(-1623994976);
		aClass710_Sub19_10778.method10100(1974497798);
		customCursorSetting.method10164(442038894);
		aClass710_Sub43_10780.method10274((byte) 1);
		cpuUsageSetting.method10150((byte) -11);
		loadingScreenTypeSetting.method10185(233844727);
		aClass710_Sub39_10783.method10237(-1537092321);
		aClass710_Sub41_10784.method10252(1848294381);
		aClass710_Sub42_10737.method10266(-1816747972);
		aClass710_Sub30_10786.method10179(2108925429);
		soundVolumeSetting.method10212(1675435656);
		bgSoundVolumeSetting.method10212(1675435656);
		speechVolumeSetting.method10212(1675435656);
		musicVolumeSetting.method10212(1675435656);
		loginMusicVolumeSetting.method10212(1675435656);
		stereoVolumeSetting.method10225(-16711936);
	}

	void method9867(byte i) {
		animationDetailSetting.method10124(65536);
		defaultAntiAliasingSetting.method10154(-117491489);
		aClass710_Sub36_10744.method10223((byte) -9);
		antiAliasingSetting.method10154(-694391482);
		bloomSetting.method10203(1894707674);
		brightnessSetting.method10045(-1176720877);
		buildAreaSetting.method9994(1082546690);
		drawDistanceSetting.method10247(-1315754943);
		flickeringSetting.method10086((short) -17726);
		fogSetting.method10079(-324230003);
		groundBlendingSetting.method10176(120304669);
		groundDecorationSetting.method9933(-165242249);
		idleAnimationSetting.method10107(1708773518);
		lightingDetailSetting.method10061(586752807);
		shadowSetting.method10001(1445175298);
		shadowQualitySetting.method10024(-1208912213);
		aClass710_Sub20_10779.method10105(-1628826130);
		aClass710_Sub4_10759.method9908((byte) -11);
		defaultRemoveRoofSetting.method9915(-1620195748);
		removeRoofSetting.method9915(-1434377935);
		aClass710_Sub33_10762.method10195(466089516);
		aClass710_Sub25_10735.method10140(4655589);
		spotShadowSetting.method10012((byte) 51);
		textureSetting.method9884(-1714824490);
		defaultToolkit.method10067(-343408763);
		toolkit.method10067(-726149812);
		waterDetailSetting.method9892(-850119944);
		aClass710_Sub12_10769.method10037(769646137);
		aClass710_Sub12_10771.method10037(1212840225);
		aClass710_Sub1_10768.method9879(1390067952);
		aClass710_Sub24_10772.method10134((short) -7845);
		aClass710_Sub6_10773.method9922(855404906);
		aClass710_Sub18_10789.method10093((byte) 67);
		aClass710_Sub32_10775.method10191(-1253323999);
		aClass710_Sub22_10776.method10116(-1838115318);
		aClass710_Sub38_10777.method10230(-1989587293);
		aClass710_Sub19_10778.method10100(-1693637241);
		customCursorSetting.method10164(1307251845);
		aClass710_Sub43_10780.method10274((byte) 1);
		cpuUsageSetting.method10150((byte) -2);
		loadingScreenTypeSetting.method10185(119212030);
		aClass710_Sub39_10783.method10237(1278840829);
		aClass710_Sub41_10784.method10252(256747252);
		aClass710_Sub42_10737.method10266(-251451200);
		aClass710_Sub30_10786.method10179(2125350531);
		soundVolumeSetting.method10212(1675435656);
		bgSoundVolumeSetting.method10212(1675435656);
		speechVolumeSetting.method10212(1675435656);
		musicVolumeSetting.method10212(1675435656);
		loginMusicVolumeSetting.method10212(1675435656);
		stereoVolumeSetting.method10225(-16711936);
	}

	void method9868(RSByteBuffer class536_sub33, int i, int i_10_) {
		brightnessSetting = new BrightnessSetting(class536_sub33.readUnsignedByte(), this);
		class536_sub33.off += 516175515;
		defaultRemoveRoofSetting = new RemoveRoofSetting(class536_sub33.readUnsignedByte() + 1, this);
		groundDecorationSetting = new GroundDecorationSetting(class536_sub33.readUnsignedByte(), this);
		class536_sub33.off += 516175515;
		idleAnimationSetting = new IdleAnimationSetting(class536_sub33.readUnsignedByte(), this);
		flickeringSetting = new FlickeringSetting(class536_sub33.readUnsignedByte(), this);
		class536_sub33.readUnsignedByte();
		spotShadowSetting = new SpotShadowSetting(class536_sub33.readUnsignedByte(), this);
		int i_11_ = class536_sub33.readUnsignedByte();
		int i_12_ = 0;
		if (i >= 17)
			i_12_ = class536_sub33.readUnsignedByte();
		shadowSetting = new ShadowSetting(i_11_ > i_12_ ? i_11_ : i_12_, this);
		boolean bool = true;
		boolean bool_13_ = true;
		if (i >= 2) {
			bool = class536_sub33.readUnsignedByte() == 1;
			if (i >= 17)
				bool_13_ = class536_sub33.readUnsignedByte() == 1;
		} else {
			bool = class536_sub33.readUnsignedByte() == 1;
			class536_sub33.readUnsignedByte();
		}
		lightingDetailSetting = new LightingDetailSetting(bool | bool_13_ ? 1 : 0, this);
		waterDetailSetting = new WaterDetailSetting(class536_sub33.readUnsignedByte(), this);
		fogSetting = new FogSetting(class536_sub33.readUnsignedByte(), this);
		defaultAntiAliasingSetting = new AntiAliasingSetting(class536_sub33.readUnsignedByte(), this);
		stereoVolumeSetting = new StereoVolumeSetting(class536_sub33.readUnsignedByte(), this);
		soundVolumeSetting = new SoundVolumeSetting(class536_sub33.readUnsignedByte(), this);
		if (i >= 20)
			speechVolumeSetting = new SoundVolumeSetting(class536_sub33.readUnsignedByte(), this);
		else
			speechVolumeSetting = new SoundVolumeSetting(soundVolumeSetting.method10213(-1132386347), this);
		musicVolumeSetting = new SoundVolumeSetting(class536_sub33.readUnsignedByte(), this);
		bgSoundVolumeSetting = new SoundVolumeSetting(class536_sub33.readUnsignedByte(), this);
		if (i >= 21)
			loginMusicVolumeSetting = new SoundVolumeSetting(class536_sub33.readUnsignedByte(), this);
		else
			loginMusicVolumeSetting = new SoundVolumeSetting(musicVolumeSetting.method10213(-1216005098), this);
		if (i >= 1) {
			class536_sub33.readUnsignedShort();
			class536_sub33.readUnsignedShort();
		}
		if (i >= 3 && i < 6)
			class536_sub33.readUnsignedByte();
		if (i >= 4)
			aClass710_Sub4_10759 = new Class710_Sub4(class536_sub33.readUnsignedByte(), this);
		class536_sub33.readInt();
		if (i >= 6)
			aClass710_Sub12_10769 = new Class710_Sub12(class536_sub33.readUnsignedByte(), this);
		if (i >= 7)
			aClass710_Sub39_10783 = new Class710_Sub39(class536_sub33.readUnsignedByte(), this);
		if (i >= 8)
			class536_sub33.readUnsignedByte();
		if (i >= 9)
			buildAreaSetting = new BuildAreaSetting(class536_sub33.readUnsignedByte(), this);
		if (i >= 10)
			bloomSetting = new BloomSetting(class536_sub33.readUnsignedByte(), this);
		if (i >= 11)
			customCursorSetting = new CustomCursorSetting(class536_sub33.readUnsignedByte(), this);
		if (i >= 12)
			idleAnimationSetting = new IdleAnimationSetting(class536_sub33.readUnsignedByte(), this);
		if (i >= 13)
			groundBlendingSetting = new GroundBlendingSetting(class536_sub33.readUnsignedByte(), this);
		if (i >= 14)
			defaultToolkit = new ToolkitSetting(class536_sub33.readUnsignedByte(), this);
		if (i >= 15)
			cpuUsageSetting = new CPUUsageSetting(class536_sub33.readUnsignedByte(), this);
		if (i >= 16)
			textureSetting = new TextureSetting(class536_sub33.readUnsignedByte(), this);
		if (i >= 18)
			aClass710_Sub43_10780 = new Class710_Sub43(class536_sub33.readUnsignedByte(), this);
		if (i >= 19)
			aClass710_Sub33_10762 = new Class710_Sub33(class536_sub33.readUnsignedByte(), this);
		if (i >= 22)
			loadingScreenTypeSetting = new LoadingScreenTypeSetting(class536_sub33.readUnsignedByte(), this);
	}

	public ClientSettings(GameMode class670, int i) {
		gameMode = class670;
		aClass711_10740 = new Class711(GameShell.maxMemory * -839563813, GameShell.cpuCount * 678116975, (Class451.osArchRaw.toLowerCase().indexOf("arm") != -1), Class241.osName.startsWith("win"), false);
		toolkit = new ToolkitSetting(i, this);
		method9854(true, true, (byte) 46);
	}

	void method9869(RSByteBuffer class536_sub33, int i) {
		brightnessSetting = new BrightnessSetting(class536_sub33.readUnsignedByte(), this);
		class536_sub33.off += 516175515;
		defaultRemoveRoofSetting = new RemoveRoofSetting(class536_sub33.readUnsignedByte() + 1, this);
		groundDecorationSetting = new GroundDecorationSetting(class536_sub33.readUnsignedByte(), this);
		class536_sub33.off += 516175515;
		idleAnimationSetting = new IdleAnimationSetting(class536_sub33.readUnsignedByte(), this);
		flickeringSetting = new FlickeringSetting(class536_sub33.readUnsignedByte(), this);
		class536_sub33.readUnsignedByte();
		spotShadowSetting = new SpotShadowSetting(class536_sub33.readUnsignedByte(), this);
		int i_14_ = class536_sub33.readUnsignedByte();
		int i_15_ = 0;
		if (i >= 17)
			i_15_ = class536_sub33.readUnsignedByte();
		shadowSetting = new ShadowSetting(i_14_ > i_15_ ? i_14_ : i_15_, this);
		boolean bool = true;
		boolean bool_16_ = true;
		if (i >= 2) {
			bool = class536_sub33.readUnsignedByte() == 1;
			if (i >= 17)
				bool_16_ = class536_sub33.readUnsignedByte() == 1;
		} else {
			bool = class536_sub33.readUnsignedByte() == 1;
			class536_sub33.readUnsignedByte();
		}
		lightingDetailSetting = new LightingDetailSetting(bool | bool_16_ ? 1 : 0, this);
		waterDetailSetting = new WaterDetailSetting(class536_sub33.readUnsignedByte(), this);
		fogSetting = new FogSetting(class536_sub33.readUnsignedByte(), this);
		defaultAntiAliasingSetting = new AntiAliasingSetting(class536_sub33.readUnsignedByte(), this);
		stereoVolumeSetting = new StereoVolumeSetting(class536_sub33.readUnsignedByte(), this);
		soundVolumeSetting = new SoundVolumeSetting(class536_sub33.readUnsignedByte(), this);
		if (i >= 20)
			speechVolumeSetting = new SoundVolumeSetting(class536_sub33.readUnsignedByte(), this);
		else
			speechVolumeSetting = new SoundVolumeSetting(soundVolumeSetting.method10213(-617377153), this);
		musicVolumeSetting = new SoundVolumeSetting(class536_sub33.readUnsignedByte(), this);
		bgSoundVolumeSetting = new SoundVolumeSetting(class536_sub33.readUnsignedByte(), this);
		if (i >= 21)
			loginMusicVolumeSetting = new SoundVolumeSetting(class536_sub33.readUnsignedByte(), this);
		else
			loginMusicVolumeSetting = new SoundVolumeSetting(musicVolumeSetting.method10213(-1205513059), this);
		if (i >= 1) {
			class536_sub33.readUnsignedShort();
			class536_sub33.readUnsignedShort();
		}
		if (i >= 3 && i < 6)
			class536_sub33.readUnsignedByte();
		if (i >= 4)
			aClass710_Sub4_10759 = new Class710_Sub4(class536_sub33.readUnsignedByte(), this);
		class536_sub33.readInt();
		if (i >= 6)
			aClass710_Sub12_10769 = new Class710_Sub12(class536_sub33.readUnsignedByte(), this);
		if (i >= 7)
			aClass710_Sub39_10783 = new Class710_Sub39(class536_sub33.readUnsignedByte(), this);
		if (i >= 8)
			class536_sub33.readUnsignedByte();
		if (i >= 9)
			buildAreaSetting = new BuildAreaSetting(class536_sub33.readUnsignedByte(), this);
		if (i >= 10)
			bloomSetting = new BloomSetting(class536_sub33.readUnsignedByte(), this);
		if (i >= 11)
			customCursorSetting = new CustomCursorSetting(class536_sub33.readUnsignedByte(), this);
		if (i >= 12)
			idleAnimationSetting = new IdleAnimationSetting(class536_sub33.readUnsignedByte(), this);
		if (i >= 13)
			groundBlendingSetting = new GroundBlendingSetting(class536_sub33.readUnsignedByte(), this);
		if (i >= 14)
			defaultToolkit = new ToolkitSetting(class536_sub33.readUnsignedByte(), this);
		if (i >= 15)
			cpuUsageSetting = new CPUUsageSetting(class536_sub33.readUnsignedByte(), this);
		if (i >= 16)
			textureSetting = new TextureSetting(class536_sub33.readUnsignedByte(), this);
		if (i >= 18)
			aClass710_Sub43_10780 = new Class710_Sub43(class536_sub33.readUnsignedByte(), this);
		if (i >= 19)
			aClass710_Sub33_10762 = new Class710_Sub33(class536_sub33.readUnsignedByte(), this);
		if (i >= 22)
			loadingScreenTypeSetting = new LoadingScreenTypeSetting(class536_sub33.readUnsignedByte(), this);
	}

	static final void method9870(Class668 class668, byte i) {
		class668.anInt8542 -= 1472892954;
		int i_17_ = class668.anIntArray8541[class668.anInt8542 * 1867269829];
		int i_18_ = class668.anIntArray8541[1 + 1867269829 * class668.anInt8542];
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = Class561.method6852(i_17_, i_18_, (byte) 7) ? 1 : 0;
	}
}
