package x.KenKOfficial.Spawn.Commands;

import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;
import x.KenKOfficial.Spawn.Main.*;
import org.bukkit.command.*;
import x.KenKOfficial.Spawn.Utils.*;
import org.bukkit.entity.*;
import org.bukkit.*;

public class SetSpawnCommand implements CommandExecutor
{
    private static final /* synthetic */ String prefix;
    private static final /* synthetic */ int[] IIIIl;
    private static final /* synthetic */ String brak_permisji;
    private static final /* synthetic */ String[] lIll;
    
    private static String lIlIll(final String IlllIIIIlIlllll, final String llllIIIIlIlllll) {
        try {
            final SecretKeySpec llIIlIIIlIlllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllIIIIlIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher IlIIlIIIlIlllll = Cipher.getInstance("Blowfish");
            IlIIlIIIlIlllll.init(SetSpawnCommand.IIIIl[2], llIIlIIIlIlllll);
            return new String(IlIIlIIIlIlllll.doFinal(Base64.getDecoder().decode(IlllIIIIlIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIlIIIlIlllll) {
            lIIIlIIIlIlllll.printStackTrace();
            return null;
        }
    }
    
    private static String IllIll(final String lIlllIIIlIlllll, final String IIlllIIIlIlllll) {
        try {
            final SecretKeySpec IIIIIlIIlIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IIlllIIIlIlllll.getBytes(StandardCharsets.UTF_8)), SetSpawnCommand.IIIIl[8]), "DES");
            final Cipher lllllIIIlIlllll = Cipher.getInstance("DES");
            lllllIIIlIlllll.init(SetSpawnCommand.IIIIl[2], IIIIIlIIlIlllll);
            return new String(lllllIIIlIlllll.doFinal(Base64.getDecoder().decode(lIlllIIIlIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IllllIIIlIlllll) {
            IllllIIIlIlllll.printStackTrace();
            return null;
        }
    }
    
    private static void Illlll() {
        (IIIIl = new int[16])[0] = ((29 + 137 - 55 + 63 ^ 54 + 117 - 110 + 123) & (0xED ^ 0xBC ^ (0x47 ^ 0x0) ^ -" ".length()));
        SetSpawnCommand.IIIIl[1] = " ".length();
        SetSpawnCommand.IIIIl[2] = "  ".length();
        SetSpawnCommand.IIIIl[3] = "   ".length();
        SetSpawnCommand.IIIIl[4] = (110 + 103 - 212 + 153 ^ 60 + 58 - 38 + 78);
        SetSpawnCommand.IIIIl[5] = (5 + 120 - 45 + 103 ^ 25 + 175 - 105 + 83);
        SetSpawnCommand.IIIIl[6] = (0xB0 ^ 0xB6);
        SetSpawnCommand.IIIIl[7] = (0xB6 ^ 0xB1);
        SetSpawnCommand.IIIIl[8] = (0x2E ^ 0x5E ^ (0x1E ^ 0x66));
        SetSpawnCommand.IIIIl[9] = (0x59 ^ 0x14 ^ (0xD8 ^ 0x9C));
        SetSpawnCommand.IIIIl[10] = (0x7A ^ 0x70);
        SetSpawnCommand.IIIIl[11] = (((0x35 ^ 0x16) & ~(0xBA ^ 0x99)) ^ (0x7C ^ 0x77));
        SetSpawnCommand.IIIIl[12] = (0x37 ^ 0x58 ^ (0xF2 ^ 0x91));
        SetSpawnCommand.IIIIl[13] = (43 + 166 - 66 + 62 ^ 37 + 152 - 165 + 168);
        SetSpawnCommand.IIIIl[14] = (0x56 ^ 0x1 ^ (0x1 ^ 0x58));
        SetSpawnCommand.IIIIl[15] = (0xE6 ^ 0xC6 ^ (0x56 ^ 0x79));
    }
    
    static {
        Illlll();
        lIllll();
        prefix = Main.getPlugin().getConfig().getString(SetSpawnCommand.lIll[SetSpawnCommand.IIIIl[13]]);
        brak_permisji = Main.getPlugin().getConfig().getString(SetSpawnCommand.lIll[SetSpawnCommand.IIIIl[14]]);
    }
    
    private static void lIllll() {
        (lIll = new String[SetSpawnCommand.IIIIl[15]])[SetSpawnCommand.IIIIl[0]] = IIlIll("CD4pLxYANDsvSxExISgLXiYpNRYANDsv", "pULAe");
        SetSpawnCommand.lIll[SetSpawnCommand.IIIIl[1]] = lIlIll("YlfyYU00Ws0=", "pIuMh");
        SetSpawnCommand.lIll[SetSpawnCommand.IIIIl[2]] = IllIll("7Kh87mrEb0mLDSg7DOXUYg==", "dKdrZ");
        SetSpawnCommand.lIll[SetSpawnCommand.IIIIl[3]] = IIlIll("EwY1IAMXGiYmMR4dPzwa", "rtRUn");
        SetSpawnCommand.lIll[SetSpawnCommand.IIIIl[4]] = lIlIll("OVeSQMZsAgc=", "rBTOA");
        SetSpawnCommand.lIll[SetSpawnCommand.IIIIl[5]] = IllIll("HaOCqPTPSwA=", "JzvWH");
        SetSpawnCommand.lIll[SetSpawnCommand.IIIIl[6]] = lIlIll("s34EMOo4Sw4=", "JHyDH");
        SetSpawnCommand.lIll[SetSpawnCommand.IIIIl[7]] = lIlIll("0epfh7N0h4q1NJ5rcRrrwA==", "LsHcc");
        SetSpawnCommand.lIll[SetSpawnCommand.IIIIl[8]] = IllIll("ka7Yy5CpjIpePK6qvLGuvw==", "cquan");
        SetSpawnCommand.lIll[SetSpawnCommand.IIIIl[9]] = lIlIll("mpcZ7ERO4XhwgbqK8Fe9AA==", "ExiBK");
        SetSpawnCommand.lIll[SetSpawnCommand.IIIIl[10]] = IIlIll("Ug==", "rewNC");
        SetSpawnCommand.lIll[SetSpawnCommand.IIIIl[11]] = IllIll("IWgmY/dOe8c=", "Olusc");
        SetSpawnCommand.lIll[SetSpawnCommand.IIIIl[12]] = lIlIll("qXQR7rQLplgL8Kj2YAalb12xs/NZjGc7Y2rn2o/HT3VFck4hx5efx63Ah3G50i5u", "RFnBw");
        SetSpawnCommand.lIll[SetSpawnCommand.IIIIl[13]] = IIlIll("PhUJNjM2", "NglPZ");
        SetSpawnCommand.lIll[SetSpawnCommand.IIIIl[14]] = IIlIll("FgAMMgEKAjoxFxEAPQ==", "xoSBd");
    }
    
    private static String IIlIll(String IlIIllIIlIlllll, final String lIIIllIIlIlllll) {
        IlIIllIIlIlllll = new String(Base64.getDecoder().decode(IlIIllIIlIlllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder IIIIllIIlIlllll = new StringBuilder();
        final char[] llllIlIIlIlllll = lIIIllIIlIlllll.toCharArray();
        int IlllIlIIlIlllll = SetSpawnCommand.IIIIl[0];
        final short IIIlIlIIlIlllll = (Object)IlIIllIIlIlllll.toCharArray();
        final float lllIIlIIlIlllll = IIIlIlIIlIlllll.length;
        boolean IllIIlIIlIlllll = SetSpawnCommand.IIIIl[0] != 0;
        while (lIIIIIl(IllIIlIIlIlllll ? 1 : 0, (int)lllIIlIIlIlllll)) {
            final char llIIllIIlIlllll = IIIlIlIIlIlllll[IllIIlIIlIlllll];
            IIIIllIIlIlllll.append((char)(llIIllIIlIlllll ^ llllIlIIlIlllll[IlllIlIIlIlllll % llllIlIIlIlllll.length]));
            "".length();
            ++IlllIlIIlIlllll;
            ++IllIIlIIlIlllll;
            "".length();
            if ((0xCD ^ 0x94 ^ (0x12 ^ 0x4F)) < "   ".length()) {
                return null;
            }
        }
        return String.valueOf(IIIIllIIlIlllll);
    }
    
    private static boolean lIIIIIl(final int IIIlIIIIlIlllll, final int lllIIIIIlIlllll) {
        return IIIlIIIIlIlllll < lllIIIIIlIlllll;
    }
    
    private static boolean llllll(final int llIIIIIIlIlllll) {
        return llIIIIIIlIlllll == 0;
    }
    
    private static boolean IIIIIIl(final int lIlIIIIIlIlllll) {
        return lIlIIIIIlIlllll != 0;
    }
    
    public boolean onCommand(final CommandSender lllIIIlIlIlllll, final Command llIlIIlIlIlllll, final String IlIlIIlIlIlllll, final String[] lIIlIIlIlIlllll) {
        if (llllll(lllIIIlIlIlllll.hasPermission(SetSpawnCommand.lIll[SetSpawnCommand.IIIIl[0]]) ? 1 : 0)) {
            lllIIIlIlIlllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(SetSpawnCommand.prefix).append(SetSpawnCommand.lIll[SetSpawnCommand.IIIIl[1]]).append(SetSpawnCommand.brak_permisji))));
            return SetSpawnCommand.IIIIl[0] != 0;
        }
        if (IIIIIIl((lllIIIlIlIlllll instanceof Player) ? 1 : 0)) {
            final String lllIlIlIlIlllll = Main.getPlugin().getConfig().getString(SetSpawnCommand.lIll[SetSpawnCommand.IIIIl[2]]);
            final String IllIlIlIlIlllll = Main.getPlugin().getConfig().getString(SetSpawnCommand.lIll[SetSpawnCommand.IIIIl[3]]);
            final Player lIlIlIlIlIlllll = (Player)lllIIIlIlIlllll;
            final double IIlIlIlIlIlllll = lIlIlIlIlIlllll.getLocation().getX();
            final double llIIlIlIlIlllll = lIlIlIlIlIlllll.getLocation().getY();
            final double IlIIlIlIlIlllll = lIlIlIlIlIlllll.getLocation().getZ();
            final float lIIIlIlIlIlllll = lIlIlIlIlIlllll.getLocation().getYaw();
            final float IIIIlIlIlIlllll = lIlIlIlIlIlllll.getLocation().getPitch();
            final String llllIIlIlIlllll = lIlIlIlIlIlllll.getWorld().getName();
            final World IlllIIlIlIlllll = lIlIlIlIlIlllll.getWorld();
            if (lIIIIIl(lIIlIIlIlIlllll.length, SetSpawnCommand.IIIIl[1])) {
                Main.getPlugin().getConfig().set(SetSpawnCommand.lIll[SetSpawnCommand.IIIIl[4]], (Object)IIlIlIlIlIlllll);
                Main.getPlugin().getConfig().set(SetSpawnCommand.lIll[SetSpawnCommand.IIIIl[5]], (Object)llIIlIlIlIlllll);
                Main.getPlugin().getConfig().set(SetSpawnCommand.lIll[SetSpawnCommand.IIIIl[6]], (Object)IlIIlIlIlIlllll);
                Main.getPlugin().getConfig().set(SetSpawnCommand.lIll[SetSpawnCommand.IIIIl[7]], (Object)lIIIlIlIlIlllll);
                Main.getPlugin().getConfig().set(SetSpawnCommand.lIll[SetSpawnCommand.IIIIl[8]], (Object)IIIIlIlIlIlllll);
                Main.getPlugin().getConfig().set(SetSpawnCommand.lIll[SetSpawnCommand.IIIIl[9]], (Object)llllIIlIlIlllll);
                Main.getPlugin().saveConfig();
                IlllIIlIlIlllll.setSpawnLocation(lIlIlIlIlIlllll.getLocation().getBlockX(), lIlIlIlIlIlllll.getLocation().getBlockY(), lIlIlIlIlIlllll.getLocation().getBlockZ());
                "".length();
                lllIIIlIlIlllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(SetSpawnCommand.prefix).append(SetSpawnCommand.lIll[SetSpawnCommand.IIIIl[10]]).append(lllIlIlIlIlllll))));
                return SetSpawnCommand.IIIIl[1] != 0;
            }
            lllIIIlIlIlllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(SetSpawnCommand.prefix).append(SetSpawnCommand.lIll[SetSpawnCommand.IIIIl[11]]).append(IllIlIlIlIlllll))));
            "".length();
            if (null != null) {
                return ((96 + 92 + 14 + 23 ^ 84 + 62 - 86 + 126) & (0x72 ^ 0x5 ^ (0xB2 ^ 0x9E) ^ -" ".length())) != 0x0;
            }
        }
        else {
            lllIIIlIlIlllll.sendMessage(String.valueOf(new StringBuilder().append(ChatColor.DARK_RED).append(SetSpawnCommand.lIll[SetSpawnCommand.IIIIl[12]])));
        }
        return SetSpawnCommand.IIIIl[0] != 0;
    }
}
