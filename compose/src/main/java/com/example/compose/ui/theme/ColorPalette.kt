package com.example.compose.ui.theme

import androidx.compose.material.Colors
import androidx.compose.ui.graphics.Color

/**
 * For color we need to append alpha channel color. for example our color is #009feb
 * it will be like this if it's in compose style 0xff<ourColorCode>
 * 0xff009feb. appending ff before our color code means alpha channel is 100%
 * see other alpha channel here
 *  100% — FF <br></br>
95% — F2
90% — E6
85% — D9
80% — CC
75% — BF
70% — B3
65% — A6
60% — 99
55% — 8C
50% — 80
45% — 73
40% — 66
35% — 59
30% — 4D
25% — 40
20% — 33
15% — 26
10% — 1A
5% — 0D
0% — 00
Ref : https://stackoverflow.com/questions/15852122/hex-transparency-in-colors
 */


/** ===============================  BLUE  ====================================================== */
private val BlueLight60 = Color(0xFF0081CC)
private val BlueLight50 = Color(0xFF009FEB)
private val BlueLight40 = Color(0xFF00BEFF)
private val BlueLight30 = Color(0xFF7DDCFF)
private val BlueLight20 = Color(0xFFCBF2FE)
private val BlueLight10 = Color(0xFFEBFAFF)

private val BlueDark60 = Color(0xFFB8E7FD)
private val BlueDark50 = Color(0xFF82D7FD)
private val BlueDark40 = Color(0xFF3EA2E7)
private val BlueDark30 = Color(0xFF226599)
private val BlueDark20 = Color(0xFF254C6D)
private val BlueDark10 = Color(0xFF162539)

val Colors.Blue60 get() = if (isLight) BlueLight60 else BlueDark60
val Colors.Blue50 get() = if (isLight) BlueLight50 else BlueDark50
val Colors.Blue40 get() = if (isLight) BlueLight40 else BlueDark40
val Colors.Blue30 get() = if (isLight) BlueLight30 else BlueDark30
val Colors.Blue20 get() = if (isLight) BlueLight20 else BlueDark20
val Colors.Blue10 get() = if (isLight) BlueLight10 else BlueDark10

/** ===============================  GRAY  ====================================================== */
private val GrayLight70 = Color(0xFF0C2846)
private val GrayLight60 = Color(0xFF1E3F6B)
private val GrayLight50 = Color(0xFF6B8FBC)
private val GrayLight40 = Color(0xFF8FB0D4)
private val GrayLight30 = Color(0xFFBED2E8)
private val GrayLight20 = Color(0xFFE3ECF5)
private val GrayLight10 = Color(0xFFF6F7FA)

private val GrayDark70 = Color(0xFFF3F3F3)
private val GrayDark60 = Color(0xFFD0D0D0)
private val GrayDark50 = Color(0xFFB3B3B3)
private val GrayDark40 = Color(0xFF888888)
private val GrayDark30 = Color(0xFF444444)
private val GrayDark20 = Color(0xFF333333)
private val GrayDark10 = Color(0xFF222222)

val Colors.Gray70 get() = if (isLight) GrayLight70 else GrayDark70
val Colors.Gray60 get() = if (isLight) GrayLight60 else GrayDark60
val Colors.Gray50 get() = if (isLight) GrayLight50 else GrayDark50
val Colors.Gray40 get() = if (isLight) GrayLight40 else GrayDark40
val Colors.Gray30 get() = if (isLight) GrayLight30 else GrayDark30
val Colors.Gray20 get() = if (isLight) GrayLight20 else GrayDark20
val Colors.Gray10 get() = if (isLight) GrayLight10 else GrayDark10

/** ===============================  GREEN  ===================================================== */
private val GreenLight60 = Color(0xFF008878)
private val GreenLight50 = Color(0xFF00AE97)
private val GreenLight40 = Color(0xFF00CBAE)
private val GreenLight30 = Color(0xFF75E2C9)
private val GreenLight20 = Color(0xFFBCEFE2)
private val GreenLight10 = Color(0xFFE5F9F6)

private val GreenDark60 = Color(0xFF81CDBE)
private val GreenDark50 = Color(0xFF4EB8A4)
private val GreenDark40 = Color(0xFF00997F)
private val GreenDark30 = Color(0xFF008C73)
private val GreenDark20 = Color(0xFF094F41)
private val GreenDark10 = Color(0xFF11312A)

val Colors.Green60 get() = if (isLight) GreenLight60 else GreenDark60
val Colors.Green50 get() = if (isLight) GreenLight50 else GreenDark50
val Colors.Green40 get() = if (isLight) GreenLight40 else GreenDark40
val Colors.Green30 get() = if (isLight) GreenLight30 else GreenDark30
val Colors.Green20 get() = if (isLight) GreenLight20 else GreenDark20
val Colors.Green10 get() = if (isLight) GreenLight10 else GreenDark10

/** ===============================  RED  ======================================================= */
private val RedLight60 = Color(0xFFC42151)
private val RedLight50 = Color(0xFFE3385C)
private val RedLight40 = Color(0xFFF9587A)
private val RedLight30 = Color(0xFFFBA3B1)
private val RedLight20 = Color(0xFFFCDDE2)
private val RedLight10 = Color(0xFFFEF2F7)

private val RedDark60 = Color(0xFFFFE4EA)
private val RedDark50 = Color(0xFFFFBACB)
private val RedDark40 = Color(0xFFFF8CA9)
private val RedDark30 = Color(0xFFFF7296)
private val RedDark20 = Color(0xFF65243F)
private val RedDark10 = Color(0xFF361E28)

val Colors.Red60 get() = if (isLight) RedLight60 else RedDark60
val Colors.Red50 get() = if (isLight) RedLight50 else RedDark50
val Colors.Red40 get() = if (isLight) RedLight40 else RedDark40
val Colors.Red30 get() = if (isLight) RedLight30 else RedDark30
val Colors.Red20 get() = if (isLight) RedLight20 else RedDark20
val Colors.Red10 get() = if (isLight) RedLight10 else RedDark10

/** ===============================  ORANGE  ==================================================== */
private val OrangeLight60 = Color(0xFFCC4004)
private val OrangeLight50 = Color(0xFFE7580C)
private val OrangeLight40 = Color(0xFFFC7D20)
private val OrangeLight30 = Color(0xFFFFB580)
private val OrangeLight20 = Color(0xFFFADFC9)
private val OrangeLight10 = Color(0xFFFCEFE4)

private val OrangeDark60 = Color(0xFFFCEFE4)
private val OrangeDark50 = Color(0xFFFADFC9)
private val OrangeDark40 = Color(0xFFFFB580)
private val OrangeDark30 = Color(0xFFFC7D20)
private val OrangeDark20 = Color(0xFFE7580C)
private val OrangeDark10 = Color(0xFFCC4004)

val Colors.Orange60 get() = if (isLight) OrangeLight60 else OrangeDark60
val Colors.Orange50 get() = if (isLight) OrangeLight50 else OrangeDark50
val Colors.Orange40 get() = if (isLight) OrangeLight40 else OrangeDark40
val Colors.Orange30 get() = if (isLight) OrangeLight30 else OrangeDark30
val Colors.Orange20 get() = if (isLight) OrangeLight20 else OrangeDark20
val Colors.Orange10 get() = if (isLight) OrangeLight10 else OrangeDark10

/** ===============================  YELLOW  ==================================================== */
private val YellowLight60 = Color(0xFFA69F03)
private val YellowLight50 = Color(0xFFC3C001)
private val YellowLight40 = Color(0xFFDED807)
private val YellowLight30 = Color(0xFFECEB73)
private val YellowLight20 = Color(0xFFF5F3AE)
private val YellowLight10 = Color(0xFFF8F7E0)

private val YellowDark60 = Color(0xFFF8F9E4)
private val YellowDark50 = Color(0xFFEEF0BC)
private val YellowDark40 = Color(0xFFE3E791)
private val YellowDark30 = Color(0xFF959A2B)
private val YellowDark20 = Color(0xFF6C6E18)
private val YellowDark10 = Color(0xFF4D4D21)

val Colors.Yellow60 get() = if (isLight) YellowLight60 else YellowDark60
val Colors.Yellow50 get() = if (isLight) YellowLight50 else YellowDark50
val Colors.Yellow40 get() = if (isLight) YellowLight40 else YellowDark40
val Colors.Yellow30 get() = if (isLight) YellowLight30 else YellowDark30
val Colors.Yellow20 get() = if (isLight) YellowLight20 else YellowDark20
val Colors.Yellow10 get() = if (isLight) YellowLight10 else YellowDark10

/** ===============================  PURPLE  ==================================================== */
private val PurpleLight60 = Color(0xFF443BA8)
private val PurpleLight50 = Color(0xFF544DC9)
private val PurpleLight40 = Color(0xFF766DDD)
private val PurpleLight30 = Color(0xFFB2AEEB)
private val PurpleLight20 = Color(0xFFE0DCF9)
private val PurpleLight10 = Color(0xFFF0EFFC)

private val PurpleDark60 = Color(0xFFECEBFB)
private val PurpleDark50 = Color(0xFFCECCF4)
private val PurpleDark40 = Color(0xFFAEABEC)
private val PurpleDark30 = Color(0xFF6A63C0)
private val PurpleDark20 = Color(0xFF463B96)
private val PurpleDark10 = Color(0xFF2D215E)

val Colors.Purple60 get() = if (isLight) PurpleLight60 else PurpleDark60
val Colors.Purple50 get() = if (isLight) PurpleLight50 else PurpleDark50
val Colors.Purple40 get() = if (isLight) PurpleLight40 else PurpleDark40
val Colors.Purple30 get() = if (isLight) PurpleLight30 else PurpleDark30
val Colors.Purple20 get() = if (isLight) PurpleLight20 else PurpleDark20
val Colors.Purple10 get() = if (isLight) PurpleLight10 else PurpleDark10

/** ===============================  DARK BLUE  ================================================= */
private val DarkBlue60 = Color(0xFF00357B)
private val DarkBlue50 = Color(0xFF00449C)
private val DarkBlue40 = Color(0xFF0056B3)
private val DarkBlue30 = Color(0xFF3176C2)
private val DarkBlue20 = Color(0xFF5F95D0)

/** ===============================  AQUA  ====================================================== */
private val Aqua50 = Color(0xFF0090A3)
private val Aqua40 = Color(0xFF00A4AF)
private val Aqua30 = Color(0xFF00C2C9)
private val Aqua20 = Color(0xFF7ADEE3)
private val Aqua10 = Color(0xFFCEF2F6)

/** ===============================  COMMON  ==================================================== */
val Colors.Shadow get() = if (isLight) GrayDark60 else GrayDark10


