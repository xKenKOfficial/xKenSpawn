package x.KenKOfficial.Spawn.Utils;

import java.nio.charset.*;
import java.util.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;

public class ChatUtil
{
    private static final /* synthetic */ int[] llll;
    private static final /* synthetic */ String[] Illl;
    
    private static boolean IIllll(final int IIIlIllIlIlllll, final int lllIIllIlIlllll) {
        return IIIlIllIlIlllll < lllIIllIlIlllll;
    }
    
    private static String lllIll(String IlIIlIIllIlllll, final String lIIIlIIllIlllll) {
        IlIIlIIllIlllll = new String(Base64.getDecoder().decode(IlIIlIIllIlllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder IIIIlIIllIlllll = new StringBuilder();
        final char[] llllIIIllIlllll = lIIIlIIllIlllll.toCharArray();
        int IlllIIIllIlllll = ChatUtil.llll[0];
        final int IIIlIIIllIlllll = (Object)IlIIlIIllIlllll.toCharArray();
        final short lllIIIIllIlllll = (short)IIIlIIIllIlllll.length;
        float IllIIIIllIlllll = ChatUtil.llll[0];
        while (IIllll((int)IllIIIIllIlllll, lllIIIIllIlllll)) {
            final char llIIlIIllIlllll = IIIlIIIllIlllll[IllIIIIllIlllll];
            IIIIlIIllIlllll.append((char)(llIIlIIllIlllll ^ llllIIIllIlllll[IlllIIIllIlllll % llllIIIllIlllll.length]));
            "".length();
            ++IlllIIIllIlllll;
            ++IllIIIIllIlllll;
            "".length();
            if ("   ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(IIIIlIIllIlllll);
    }
    
    private static void IlIlll() {
        (Illl = new String[ChatUtil.llll[8]])[ChatUtil.llll[0]] = lllIll("aA==", "NGVhd");
        ChatUtil.Illl[ChatUtil.llll[1]] = lllIll("w4E=", "fTSeV");
        ChatUtil.Illl[ChatUtil.llll[2]] = IIIlll("c/oWFl+cI/I=", "kmeEV");
        ChatUtil.Illl[ChatUtil.llll[3]] = lIIlll("QJLGNX2umx4=", "XCujX");
        ChatUtil.Illl[ChatUtil.llll[4]] = lIIlll("kTMduHokesA=", "wKnnP");
        ChatUtil.Illl[ChatUtil.llll[5]] = lIIlll("lHeZywCwVIs=", "rHhhZ");
        ChatUtil.Illl[ChatUtil.llll[6]] = lllIll("KwAT", "PNnyP");
        ChatUtil.Illl[ChatUtil.llll[7]] = lllIll("Zw==", "mrhCh");
    }
    
    private static String IIIlll(final String IIIIlllIlIlllll, final String lIllIllIlIlllll) {
        try {
            final SecretKeySpec llIIlllIlIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIllIllIlIlllll.getBytes(StandardCharsets.UTF_8)), ChatUtil.llll[8]), "DES");
            final Cipher IlIIlllIlIlllll = Cipher.getInstance("DES");
            IlIIlllIlIlllll.init(ChatUtil.llll[2], llIIlllIlIlllll);
            return new String(IlIIlllIlIlllll.doFinal(Base64.getDecoder().decode(IIIIlllIlIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIlllIlIlllll) {
            lIIIlllIlIlllll.printStackTrace();
            return null;
        }
    }
    
    private static void llIlll() {
        (llll = new int[9])[0] = ((0x41 ^ 0x4B ^ (0x45 ^ 0x65)) & (70 + 28 - 11 + 43 ^ 95 + 43 - 2 + 32 ^ -" ".length()));
        ChatUtil.llll[1] = " ".length();
        ChatUtil.llll[2] = "  ".length();
        ChatUtil.llll[3] = "   ".length();
        ChatUtil.llll[4] = (0xB2 ^ 0xB6);
        ChatUtil.llll[5] = (177 + 76 - 225 + 167 ^ 115 + 106 - 149 + 126);
        ChatUtil.llll[6] = (0xE9 ^ 0xB0 ^ (0xC0 ^ 0x9F));
        ChatUtil.llll[7] = (0x98 ^ 0x9F);
        ChatUtil.llll[8] = (14 + 54 + 27 + 94 ^ 41 + 73 + 31 + 36);
    }
    
    static {
        llIlll();
        IlIlll();
    }
    
    public static String fixColor(final String lIlllIIllIlllll) {
        return lIlllIIllIlllll.replaceAll(ChatUtil.Illl[ChatUtil.llll[0]], ChatUtil.Illl[ChatUtil.llll[1]]).replace(ChatUtil.Illl[ChatUtil.llll[2]], ChatUtil.Illl[ChatUtil.llll[3]]).replace(ChatUtil.Illl[ChatUtil.llll[4]], ChatUtil.Illl[ChatUtil.llll[5]]).replace(ChatUtil.Illl[ChatUtil.llll[6]], ChatUtil.Illl[ChatUtil.llll[7]]);
    }
    
    private static String lIIlll(final String llIllllIlIlllll, final String IIlllllIlIlllll) {
        try {
            final SecretKeySpec IIIIIIIllIlllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IIlllllIlIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllIlIlllll = Cipher.getInstance("Blowfish");
            lllllllIlIlllll.init(ChatUtil.llll[2], IIIIIIIllIlllll);
            return new String(lllllllIlIlllll.doFinal(Base64.getDecoder().decode(llIllllIlIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IllllllIlIlllll) {
            IllllllIlIlllll.printStackTrace();
            return null;
        }
    }
}
