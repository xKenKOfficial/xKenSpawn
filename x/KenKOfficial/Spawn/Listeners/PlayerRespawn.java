package x.KenKOfficial.Spawn.Listeners;

import org.bukkit.event.player.*;
import x.KenKOfficial.Spawn.Main.*;
import org.bukkit.*;
import org.bukkit.entity.*;
import org.bukkit.event.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class PlayerRespawn implements Listener
{
    private static final /* synthetic */ int[] lIIl;
    private static final /* synthetic */ String[] Ill;
    
    @EventHandler
    public void onRespawn(final PlayerRespawnEvent IIllIIIlIllllll) {
        final Player llIlIIIlIllllll = IIllIIIlIllllll.getPlayer();
        final double IlIlIIIlIllllll = Main.getPlugin().getConfig().getDouble(PlayerRespawn.Ill[PlayerRespawn.lIIl[0]]);
        final double lIIlIIIlIllllll = Main.getPlugin().getConfig().getDouble(PlayerRespawn.Ill[PlayerRespawn.lIIl[1]]);
        final double IIIlIIIlIllllll = Main.getPlugin().getConfig().getDouble(PlayerRespawn.Ill[PlayerRespawn.lIIl[2]]);
        final float lllIIIIlIllllll = (float)Main.getPlugin().getConfig().getInt(PlayerRespawn.Ill[PlayerRespawn.lIIl[3]]);
        final float IllIIIIlIllllll = (float)Main.getPlugin().getConfig().getInt(PlayerRespawn.Ill[PlayerRespawn.lIIl[4]]);
        final String lIlIIIIlIllllll = Main.getPlugin().getConfig().getString(PlayerRespawn.Ill[PlayerRespawn.lIIl[5]]);
        if (lllIIl(Bukkit.getWorld(lIlIIIIlIllllll))) {
            llIlIIIlIllllll.teleport(new Location(Bukkit.getWorld(lIlIIIIlIllllll), IlIlIIIlIllllll, lIIlIIIlIllllll, IIIlIIIlIllllll, lllIIIIlIllllll, IllIIIIlIllllll));
            "".length();
            "".length();
            if (((19 + 73 - 64 + 129 ^ 40 + 32 - 62 + 140) & (0xDD ^ 0xBB ^ (0xE8 ^ 0x85) ^ -" ".length()) & (((0x3F ^ 0x6A ^ (0x98 ^ 0xC4)) & (0xD2 ^ 0xB3 ^ (0xC6 ^ 0xAE) ^ -" ".length())) ^ -" ".length())) != 0x0) {
                return;
            }
        }
        else {
            llIlIIIlIllllll.teleport(Bukkit.getWorld(llIlIIIlIllllll.getWorld().getName()).getSpawnLocation());
            "".length();
        }
    }
    
    private static void lIlIIl() {
        (Ill = new String[PlayerRespawn.lIIl[6]])[PlayerRespawn.lIIl[0]] = IlIll("/gtDyrJVL9c=", "mBowg");
        PlayerRespawn.Ill[PlayerRespawn.lIIl[1]] = IlIll("3Y2Bv0FQCl4=", "EUaqd");
        PlayerRespawn.Ill[PlayerRespawn.lIIl[2]] = llIIIl("5/zAufUunxs=", "xNVTF");
        PlayerRespawn.Ill[PlayerRespawn.lIIl[3]] = IIlIIl("EjoQAwZvMxAD", "AJqth");
        PlayerRespawn.Ill[PlayerRespawn.lIIl[4]] = IIlIIl("IiU3MwlfJT8wBBk=", "qUVDg");
        PlayerRespawn.Ill[PlayerRespawn.lIIl[5]] = IIlIIl("AggsOCJ/DyI9IDU=", "QxMOL");
    }
    
    private static boolean lllIIl(final Object lIlIIIlIIllllll) {
        return lIlIIIlIIllllll != null;
    }
    
    private static void IllIIl() {
        (lIIl = new int[8])[0] = (" ".length() & (" ".length() ^ -" ".length()));
        PlayerRespawn.lIIl[1] = " ".length();
        PlayerRespawn.lIIl[2] = "  ".length();
        PlayerRespawn.lIIl[3] = "   ".length();
        PlayerRespawn.lIIl[4] = (0x34 ^ 0xF ^ (0x84 ^ 0xBB));
        PlayerRespawn.lIIl[5] = (131 + 89 - 78 + 1 ^ 110 + 19 - 102 + 111);
        PlayerRespawn.lIIl[6] = (0xF2 ^ 0xC4 ^ (0xF ^ 0x3F));
        PlayerRespawn.lIIl[7] = (0x43 ^ 0x4B);
    }
    
    private static String IlIll(final String lIlIlllIIllllll, final String IIlIlllIIllllll) {
        try {
            final SecretKeySpec IIIllllIIllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IIlIlllIIllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllIlllIIllllll = Cipher.getInstance("Blowfish");
            lllIlllIIllllll.init(PlayerRespawn.lIIl[2], IIIllllIIllllll);
            return new String(lllIlllIIllllll.doFinal(Base64.getDecoder().decode(lIlIlllIIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IllIlllIIllllll) {
            IllIlllIIllllll.printStackTrace();
            return null;
        }
    }
    
    private static String IIlIIl(String llIIlIlIIllllll, final String lllIlIlIIllllll) {
        llIIlIlIIllllll = (Exception)new String(Base64.getDecoder().decode(((String)llIIlIlIIllllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder IllIlIlIIllllll = new StringBuilder();
        final char[] lIlIlIlIIllllll = lllIlIlIIllllll.toCharArray();
        int IIlIlIlIIllllll = PlayerRespawn.lIIl[0];
        final float IlllIIlIIllllll = (Object)((String)llIIlIlIIllllll).toCharArray();
        final Exception lIllIIlIIllllll = (Exception)IlllIIlIIllllll.length;
        double IIllIIlIIllllll = PlayerRespawn.lIIl[0];
        while (IIIlIl((int)IIllIIlIIllllll, (int)lIllIIlIIllllll)) {
            final char lIIllIlIIllllll = IlllIIlIIllllll[IIllIIlIIllllll];
            IllIlIlIIllllll.append((char)(lIIllIlIIllllll ^ lIlIlIlIIllllll[IIlIlIlIIllllll % lIlIlIlIIllllll.length]));
            "".length();
            ++IIlIlIlIIllllll;
            ++IIllIIlIIllllll;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(IllIlIlIIllllll);
    }
    
    private static String llIIIl(final String IIIlIllIIllllll, final String lllIIllIIllllll) {
        try {
            final SecretKeySpec llIlIllIIllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIIllIIllllll.getBytes(StandardCharsets.UTF_8)), PlayerRespawn.lIIl[7]), "DES");
            final Cipher IlIlIllIIllllll = Cipher.getInstance("DES");
            IlIlIllIIllllll.init(PlayerRespawn.lIIl[2], llIlIllIIllllll);
            return new String(IlIlIllIIllllll.doFinal(Base64.getDecoder().decode(IIIlIllIIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIlIllIIllllll) {
            lIIlIllIIllllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean IIIlIl(final int IIIlIIlIIllllll, final int lllIIIlIIllllll) {
        return IIIlIIlIIllllll < lllIIIlIIllllll;
    }
    
    static {
        IllIIl();
        lIlIIl();
    }
}
