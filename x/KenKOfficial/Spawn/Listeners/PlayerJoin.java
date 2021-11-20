package x.KenKOfficial.Spawn.Listeners;

import java.nio.charset.*;
import java.util.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import org.bukkit.event.player.*;
import x.KenKOfficial.Spawn.Main.*;
import org.bukkit.*;
import x.KenKOfficial.Spawn.Utils.*;
import org.bukkit.entity.*;
import org.bukkit.event.*;

public class PlayerJoin implements Listener
{
    private static final /* synthetic */ int[] l;
    private static final /* synthetic */ String joinMessage;
    private static final /* synthetic */ String[] I;
    
    private static String I(String IlIlllIllllllll, final String IlllllIllllllll) {
        IlIlllIllllllll = (double)new String(Base64.getDecoder().decode(((String)IlIlllIllllllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lIllllIllllllll = new StringBuilder();
        final char[] IIllllIllllllll = IlllllIllllllll.toCharArray();
        int llIlllIllllllll = PlayerJoin.l[0];
        final double lIlIllIllllllll = (Object)((String)IlIlllIllllllll).toCharArray();
        final byte IIlIllIllllllll = (byte)lIlIllIllllllll.length;
        String llIIllIllllllll = (String)PlayerJoin.l[0];
        while (Illl((int)llIIllIllllllll, IIlIllIllllllll)) {
            final char IIIIIIlllllllll = lIlIllIllllllll[llIIllIllllllll];
            lIllllIllllllll.append((char)(IIIIIIlllllllll ^ IIllllIllllllll[llIlllIllllllll % IIllllIllllllll.length]));
            "".length();
            ++llIlllIllllllll;
            ++llIIllIllllllll;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lIllllIllllllll);
    }
    
    private static String IIl(final String llllIIlllllllll, final String IIllIIlllllllll) {
        try {
            final SecretKeySpec IlIIlIlllllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IIllIIlllllllll.getBytes(StandardCharsets.UTF_8)), PlayerJoin.l[8]), "DES");
            final Cipher lIIIlIlllllllll = Cipher.getInstance("DES");
            lIIIlIlllllllll.init(PlayerJoin.l[2], IlIIlIlllllllll);
            return new String(lIIIlIlllllllll.doFinal(Base64.getDecoder().decode(llllIIlllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIIIlIlllllllll) {
            IIIIlIlllllllll.printStackTrace();
            return null;
        }
    }
    
    private static String Il(final String IlIllIlllllllll, final String lIIllIlllllllll) {
        try {
            final SecretKeySpec lllllIlllllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIllIlllllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher IllllIlllllllll = Cipher.getInstance("Blowfish");
            IllllIlllllllll.init(PlayerJoin.l[2], lllllIlllllllll);
            return new String(IllllIlllllllll.doFinal(Base64.getDecoder().decode(IlIllIlllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlllIlllllllll) {
            lIlllIlllllllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIl(final int IIIlIlIllllllll) {
        return IIIlIlIllllllll == 0;
    }
    
    private static void IlIl() {
        (l = new int[22])[0] = ((0x75 ^ 0x15 ^ (0xA3 ^ 0xC7)) & (83 + 144 - 89 + 25 ^ 9 + 52 + 90 + 16 ^ -" ".length()));
        PlayerJoin.l[1] = " ".length();
        PlayerJoin.l[2] = "  ".length();
        PlayerJoin.l[3] = "   ".length();
        PlayerJoin.l[4] = (0x72 ^ 0x54 ^ (0x35 ^ 0x17));
        PlayerJoin.l[5] = (0x23 ^ 0x26);
        PlayerJoin.l[6] = (0xAE ^ 0x9A ^ (0x71 ^ 0x43));
        PlayerJoin.l[7] = (0xB3 ^ 0xC5 ^ (0xC6 ^ 0xB7));
        PlayerJoin.l[8] = (0x97 ^ 0xC2 ^ (0x63 ^ 0x3E));
        PlayerJoin.l[9] = (0x4B ^ 0x42);
        PlayerJoin.l[10] = (113 + 131 - 239 + 130 ^ 40 + 103 - 76 + 74);
        PlayerJoin.l[11] = (109 + 83 - 117 + 79 ^ 127 + 54 - 125 + 89);
        PlayerJoin.l[12] = (0x7D ^ 0x71);
        PlayerJoin.l[13] = (0x23 ^ 0x2E);
        PlayerJoin.l[14] = (0xC ^ 0x2);
        PlayerJoin.l[15] = (0x82 ^ 0x8D);
        PlayerJoin.l[16] = (0xB3 ^ 0xA3);
        PlayerJoin.l[17] = (0xD ^ 0x71 ^ (0xF1 ^ 0x9C));
        PlayerJoin.l[18] = (25 + 104 - 126 + 133 ^ 76 + 2 - 12 + 88);
        PlayerJoin.l[19] = (1 + 70 - 62 + 157 ^ 96 + 23 + 27 + 35);
        PlayerJoin.l[20] = (0x2E ^ 0x3A);
        PlayerJoin.l[21] = (75 + 122 - 74 + 52 ^ 91 + 184 - 231 + 142);
    }
    
    @EventHandler
    public void onJoin(final PlayerJoinEvent llIIlllllllllll) {
        final Player IlIIlllllllllll = llIIlllllllllll.getPlayer();
        final double lIIIlllllllllll = Main.getPlugin().getConfig().getDouble(PlayerJoin.I[PlayerJoin.l[0]]);
        final double IIIIlllllllllll = Main.getPlugin().getConfig().getDouble(PlayerJoin.I[PlayerJoin.l[1]]);
        final double llllIllllllllll = Main.getPlugin().getConfig().getDouble(PlayerJoin.I[PlayerJoin.l[2]]);
        final float IlllIllllllllll = (float)Main.getPlugin().getConfig().getInt(PlayerJoin.I[PlayerJoin.l[3]]);
        final float lIllIllllllllll = (float)Main.getPlugin().getConfig().getInt(PlayerJoin.I[PlayerJoin.l[4]]);
        final String IIllIllllllllll = Main.getPlugin().getConfig().getString(PlayerJoin.I[PlayerJoin.l[5]]);
        if (llIl(IlIIlllllllllll.hasPlayedBefore() ? 1 : 0)) {
            if (IIll(Bukkit.getWorld(IIllIllllllllll))) {
                IlIIlllllllllll.teleport(new Location(Bukkit.getWorld(IIllIllllllllll), lIIIlllllllllll, IIIIlllllllllll, llllIllllllllll, IlllIllllllllll, lIllIllllllllll));
                "".length();
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                IlIIlllllllllll.teleport(Bukkit.getWorld(IlIIlllllllllll.getWorld().getName()).getSpawnLocation());
                "".length();
            }
        }
        if (llIl(Main.getPlugin().getConfig().getBoolean(PlayerJoin.I[PlayerJoin.l[6]]) ? 1 : 0) && lIll(IlIIlllllllllll.hasPermission(PlayerJoin.I[PlayerJoin.l[7]]) ? 1 : 0)) {
            IlIIlllllllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.I[PlayerJoin.l[8]]));
            IlIIlllllllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.I[PlayerJoin.l[9]]));
            IlIIlllllllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.I[PlayerJoin.l[10]]));
            IlIIlllllllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.I[PlayerJoin.l[11]]));
            IlIIlllllllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.I[PlayerJoin.l[12]]));
            IlIIlllllllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.I[PlayerJoin.l[13]]));
            IlIIlllllllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.I[PlayerJoin.l[14]]));
            IlIIlllllllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.I[PlayerJoin.l[15]]));
            IlIIlllllllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.I[PlayerJoin.l[16]]));
            IlIIlllllllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.I[PlayerJoin.l[17]]));
            IlIIlllllllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.I[PlayerJoin.l[18]]));
        }
        llIIlllllllllll.setJoinMessage(ChatUtil.fixColor(PlayerJoin.joinMessage.replace(PlayerJoin.I[PlayerJoin.l[19]], IlIIlllllllllll.getName())));
    }
    
    private static boolean Illl(final int llllIlIllllllll, final int IlllIlIllllllll) {
        return llllIlIllllllll < IlllIlIllllllll;
    }
    
    private static boolean IIll(final Object IIllIlIllllllll) {
        return IIllIlIllllllll != null;
    }
    
    static {
        IlIl();
        Ill();
        joinMessage = Main.getPlugin().getConfig().getString(PlayerJoin.I[PlayerJoin.l[20]]);
    }
    
    private static void Ill() {
        (I = new String[PlayerJoin.l[21]])[PlayerJoin.l[0]] = I("Kjw2PDRXNA==", "yLWKZ");
        PlayerJoin.I[PlayerJoin.l[1]] = I("CggnEQh3AQ==", "YxFff");
        PlayerJoin.I[PlayerJoin.l[2]] = I("HAYiOR1hDA==", "OvCNs");
        PlayerJoin.I[PlayerJoin.l[3]] = Il("U1YWnvxFFMUEkACVsdcR2g==", "xWqGC");
        PlayerJoin.I[PlayerJoin.l[4]] = Il("ag1Efh3NmXUto3Z0ELPb5A==", "BMaYg");
        PlayerJoin.I[PlayerJoin.l[5]] = IIl("k9UNyvwfLGOmjgS92XYFgA==", "LeONN");
        PlayerJoin.I[PlayerJoin.l[6]] = IIl("/dkqUHATDrc=", "bcOWa");
        PlayerJoin.I[PlayerJoin.l[7]] = Il("YCzXnD5RR0ZrG/h7/vc9timz/FLOqx9f", "NUZAF");
        PlayerJoin.I[PlayerJoin.l[8]] = I("VFBuA2pPVXVSak9VdVIMVFtuAy85DSY8JxMfJklvVAQVUmpPVXVSak9VdQ==", "rhHoW");
        PlayerJoin.I[PlayerJoin.l[9]] = Il("gtLcL78x8to=", "KBTYY");
        PlayerJoin.I[PlayerJoin.l[10]] = IIl("6BNz9I75bdwEuODZT8tD+2lexmK49efa", "aHUWM");
        PlayerJoin.I[PlayerJoin.l[11]] = I("", "KzIvS");
        PlayerJoin.I[PlayerJoin.l[12]] = IIl("DqIenJAecv6KrLcJz+z4nuYubfRVNAEGRPZb1l1qQPk=", "HAVtv");
        PlayerJoin.I[PlayerJoin.l[13]] = IIl("sDtAwKl2sKw=", "PIYVm");
        PlayerJoin.I[PlayerJoin.l[14]] = Il("j7ojaPkJgEmANyH+UFJfWZ3veZPtgp8B6Ihb0Kcc4PIU+PEjdp7aouh6NOq5mNjd", "EluXo");
        PlayerJoin.I[PlayerJoin.l[15]] = I("", "vbeKZ");
        PlayerJoin.I[PlayerJoin.l[16]] = Il("UvFfj5tOpUbjOrzaKFW3pu8OnOSTyVp3cBJ991AoGSnhwZuFfegeHzk/qnFSJXz0", "JPVjJ");
        PlayerJoin.I[PlayerJoin.l[17]] = I("", "WOdPl");
        PlayerJoin.I[PlayerJoin.l[18]] = Il("19bhOcs1CdcJlJdAFgrl3BhFeDx0GpvGCgKNKR9zJkyH6qqCxllhjUMgmP+qTFxa", "fRhyh");
        PlayerJoin.I[PlayerJoin.l[19]] = Il("TPOrHvsNQz9A5e0HjO1FrA==", "DzXIF");
        PlayerJoin.I[PlayerJoin.l[20]] = Il("ncX+ZHkAi9K3UsJzF3laFg==", "XPJtr");
    }
    
    private static boolean lIll(final int IlIlIlIllllllll) {
        return IlIlIlIllllllll != 0;
    }
}
