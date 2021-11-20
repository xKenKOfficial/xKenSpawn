package x.KenKOfficial.Spawn.Commands;

import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import org.bukkit.command.*;
import x.KenKOfficial.Spawn.Utils.*;
import org.bukkit.entity.*;
import x.KenKOfficial.Spawn.Main.*;
import org.bukkit.*;
import java.util.*;

public class SpawnAllCommand implements CommandExecutor
{
    private static final /* synthetic */ String[] lIl;
    private static final /* synthetic */ int[] lll;
    private static final /* synthetic */ String prefix;
    private static final /* synthetic */ String brak_permisji;
    
    private static void IIlll() {
        (lll = new int[19])[0] = ((149 + 9 - 78 + 132 ^ 66 + 76 - 106 + 110) & (0x7 ^ 0x24 ^ (0x41 ^ 0x24) ^ -" ".length()));
        SpawnAllCommand.lll[1] = " ".length();
        SpawnAllCommand.lll[2] = "  ".length();
        SpawnAllCommand.lll[3] = "   ".length();
        SpawnAllCommand.lll[4] = (0x29 ^ 0x76 ^ (0xFB ^ 0xA0));
        SpawnAllCommand.lll[5] = (116 + 83 - 126 + 104 ^ 142 + 28 - 104 + 114);
        SpawnAllCommand.lll[6] = (0xAE ^ 0xC0 ^ (0x67 ^ 0xF));
        SpawnAllCommand.lll[7] = (0x36 ^ 0x31);
        SpawnAllCommand.lll[8] = (0x6B ^ 0x63);
        SpawnAllCommand.lll[9] = (0x20 ^ 0x48 ^ (0x66 ^ 0x7));
        SpawnAllCommand.lll[10] = (146 + 141 - 282 + 167 ^ 93 + 57 - 42 + 58);
        SpawnAllCommand.lll[11] = (59 + 138 - 153 + 109 ^ 25 + 136 - 38 + 23);
        SpawnAllCommand.lll[12] = (0x91 ^ 0x9D);
        SpawnAllCommand.lll[13] = (0x3 ^ 0x59 ^ (0x2E ^ 0x79));
        SpawnAllCommand.lll[14] = (0x8B ^ 0x85);
        SpawnAllCommand.lll[15] = (0x92 ^ 0x9D);
        SpawnAllCommand.lll[16] = (0x82 ^ 0x92);
        SpawnAllCommand.lll[17] = (0x46 ^ 0x57);
        SpawnAllCommand.lll[18] = (119 + 71 - 79 + 21 ^ 148 + 102 - 232 + 132);
    }
    
    private static boolean Illll(final int llIllIIlIllllll) {
        return llIllIIlIllllll != 0;
    }
    
    private static boolean lllll(final int IllllIIlIllllll, final int lIlllIIlIllllll) {
        return IllllIIlIllllll < lIlllIIlIllllll;
    }
    
    private static void llIll() {
        (lIl = new String[SpawnAllCommand.lll[18]])[SpawnAllCommand.lll[0]] = lllIl("DRwqHCYFFjgcexQTIhs7WwQ/EyIbFiMe", "uwOrU");
        SpawnAllCommand.lIl[SpawnAllCommand.lll[1]] = IIIll("rvShhoZsR9w=", "UzHrD");
        SpawnAllCommand.lIl[SpawnAllCommand.lll[2]] = lIIll("E05yUruf4U8EgejrQBxlpg==", "bmdSO");
        SpawnAllCommand.lIl[SpawnAllCommand.lll[3]] = lllIl("KQMLPAZUCw==", "zsjKh");
        SpawnAllCommand.lIl[SpawnAllCommand.lll[4]] = IIIll("7zSFQ3RHkrA=", "IjJCF");
        SpawnAllCommand.lIl[SpawnAllCommand.lll[5]] = lIIll("xDicaapD0SU=", "sFTMm");
        SpawnAllCommand.lIl[SpawnAllCommand.lll[6]] = IIIll("Dy1bDTo6ByXtW8qaNzrlaw==", "MPAQK");
        SpawnAllCommand.lIl[SpawnAllCommand.lll[7]] = lllIl("FwAwAgpqADgBByw=", "DpQud");
        SpawnAllCommand.lIl[SpawnAllCommand.lll[8]] = lllIl("FxQGOShqEwg8KiA=", "DdgNF");
        SpawnAllCommand.lIl[SpawnAllCommand.lll[9]] = lIIll("ji6lM94Orz6c1fHOih96XvT5Wduu4GDqxNmIdq94Wjc=", "Gmccn");
        SpawnAllCommand.lIl[SpawnAllCommand.lll[10]] = lIIll("CJII6sSzlvk=", "NJDYP");
        SpawnAllCommand.lIl[SpawnAllCommand.lll[11]] = IIIll("n2yFLyDO3wBmePBjz6XSdMbV+Zk8YHHM", "jcKPE");
        SpawnAllCommand.lIl[SpawnAllCommand.lll[12]] = lIIll("/i1N8FByfeo=", "evGHG");
        SpawnAllCommand.lIl[SpawnAllCommand.lll[13]] = IIIll("juEULV98Xh0=", "ESXmO");
        SpawnAllCommand.lIl[SpawnAllCommand.lll[14]] = lIIll("7b7PfaSp+14=", "CpWNK");
        SpawnAllCommand.lIl[SpawnAllCommand.lll[15]] = IIIll("qIEBF2+GxYbZCbWIz03idUocGcfbuI6AaFIf+QYcMr5Vqfj0eQdwOA==", "zOouX");
        SpawnAllCommand.lIl[SpawnAllCommand.lll[16]] = lIIll("dvEqUaXCVCQ=", "hFQqV");
        SpawnAllCommand.lIl[SpawnAllCommand.lll[17]] = IIIll("Plx2H9IHI6aVfoPonDbdSQ==", "dYHxT");
    }
    
    private static String lIIll(final String llIIllIlIllllll, final String IlIIllIlIllllll) {
        try {
            final SecretKeySpec IllIllIlIllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IlIIllIlIllllll.getBytes(StandardCharsets.UTF_8)), SpawnAllCommand.lll[8]), "DES");
            final Cipher lIlIllIlIllllll = Cipher.getInstance("DES");
            lIlIllIlIllllll.init(SpawnAllCommand.lll[2], IllIllIlIllllll);
            return new String(lIlIllIlIllllll.doFinal(Base64.getDecoder().decode(llIIllIlIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIlIllIlIllllll) {
            IIlIllIlIllllll.printStackTrace();
            return null;
        }
    }
    
    private static String lllIl(String llIIIIllIllllll, final String IlIIIIllIllllll) {
        llIIIIllIllllll = (short)new String(Base64.getDecoder().decode(((String)llIIIIllIllllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder IllIIIllIllllll = new StringBuilder();
        final char[] lIlIIIllIllllll = IlIIIIllIllllll.toCharArray();
        int IIlIIIllIllllll = SpawnAllCommand.lll[0];
        final float IlllllIlIllllll = (Object)((String)llIIIIllIllllll).toCharArray();
        final short lIllllIlIllllll = (short)IlllllIlIllllll.length;
        float IIllllIlIllllll = SpawnAllCommand.lll[0];
        while (lllll((int)IIllllIlIllllll, lIllllIlIllllll)) {
            final char lIIlIIllIllllll = IlllllIlIllllll[IIllllIlIllllll];
            IllIIIllIllllll.append((char)(lIIlIIllIllllll ^ lIlIIIllIllllll[IIlIIIllIllllll % lIlIIIllIllllll.length]));
            "".length();
            ++IIlIIIllIllllll;
            ++IIllllIlIllllll;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(IllIIIllIllllll);
    }
    
    public boolean onCommand(final CommandSender lllllIllIllllll, final Command IlIIIlllIllllll, final String lIIIIlllIllllll, final String[] IllllIllIllllll) {
        if (lIlll(lllllIllIllllll.hasPermission(SpawnAllCommand.lIl[SpawnAllCommand.lll[0]]) ? 1 : 0)) {
            lllllIllIllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(SpawnAllCommand.prefix).append(SpawnAllCommand.lIl[SpawnAllCommand.lll[1]]).append(SpawnAllCommand.brak_permisji))));
            return SpawnAllCommand.lll[0] != 0;
        }
        if (Illll((lllllIllIllllll instanceof Player) ? 1 : 0)) {
            final String lIlIIlllIllllll = Main.getPlugin().getConfig().getString(SpawnAllCommand.lIl[SpawnAllCommand.lll[2]]);
            if (lllll(IllllIllIllllll.length, SpawnAllCommand.lll[1])) {
                final double lIllIlllIllllll = Main.getPlugin().getConfig().getDouble(SpawnAllCommand.lIl[SpawnAllCommand.lll[3]]);
                final double IIllIlllIllllll = Main.getPlugin().getConfig().getDouble(SpawnAllCommand.lIl[SpawnAllCommand.lll[4]]);
                final double llIlIlllIllllll = Main.getPlugin().getConfig().getDouble(SpawnAllCommand.lIl[SpawnAllCommand.lll[5]]);
                final float IlIlIlllIllllll = (float)Main.getPlugin().getConfig().getInt(SpawnAllCommand.lIl[SpawnAllCommand.lll[6]]);
                final float lIIlIlllIllllll = (float)Main.getPlugin().getConfig().getInt(SpawnAllCommand.lIl[SpawnAllCommand.lll[7]]);
                final String IIIlIlllIllllll = Main.getPlugin().getConfig().getString(SpawnAllCommand.lIl[SpawnAllCommand.lll[8]]);
                final String lllIIlllIllllll = Main.getPlugin().getConfig().getString(SpawnAllCommand.lIl[SpawnAllCommand.lll[9]]).replace(SpawnAllCommand.lIl[SpawnAllCommand.lll[10]], lllllIllIllllll.getName());
                final String IllIIlllIllllll = Main.getPlugin().getConfig().getString(SpawnAllCommand.lIl[SpawnAllCommand.lll[11]]);
                final boolean IIlIlIllIllllll = (boolean)Bukkit.getOnlinePlayers().iterator();
                while (Illll(((Iterator)IIlIlIllIllllll).hasNext() ? 1 : 0)) {
                    final Player IlllIlllIllllll = ((Iterator<Player>)IIlIlIllIllllll).next();
                    IlllIlllIllllll.teleport(new Location(Bukkit.getWorld(IIIlIlllIllllll), lIllIlllIllllll, IIllIlllIllllll, llIlIlllIllllll, IlIlIlllIllllll, lIIlIlllIllllll));
                    "".length();
                    IlllIlllIllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(SpawnAllCommand.prefix).append(SpawnAllCommand.lIl[SpawnAllCommand.lll[12]]).append(lllIIlllIllllll))));
                    lllllIllIllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(SpawnAllCommand.prefix).append(SpawnAllCommand.lIl[SpawnAllCommand.lll[13]]).append(IllIIlllIllllll))));
                    "".length();
                    if ((9 + 114 + 2 + 30 ^ 94 + 110 - 185 + 140) < 0) {
                        return ((0x15 ^ 0x78 ^ (0xC6 ^ 0x9D)) & (0x26 ^ 0x14 ^ (0x7E ^ 0x7A) ^ -" ".length())) != 0x0;
                    }
                }
                "".length();
                if (((0x64 ^ 0x23) & ~(0xCA ^ 0x8D)) != 0x0) {
                    return ((0x2B ^ 0x16) & ~(0x82 ^ 0xBF)) != 0x0;
                }
            }
            else {
                lllllIllIllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(SpawnAllCommand.prefix).append(SpawnAllCommand.lIl[SpawnAllCommand.lll[14]]).append(lIlIIlllIllllll))));
            }
            "".length();
            if (-"   ".length() >= 0) {
                return ((0xDC ^ 0x95) & ~(0x3A ^ 0x73)) != 0x0;
            }
        }
        else {
            lllllIllIllllll.sendMessage(String.valueOf(new StringBuilder().append(ChatColor.DARK_RED).append(SpawnAllCommand.lIl[SpawnAllCommand.lll[15]])));
        }
        return SpawnAllCommand.lll[0] != 0;
    }
    
    private static String IIIll(final String IIlIIlIlIllllll, final String lIlIIlIlIllllll) {
        try {
            final SecretKeySpec lIIlIlIlIllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIIlIlIllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher IIIlIlIlIllllll = Cipher.getInstance("Blowfish");
            IIIlIlIlIllllll.init(SpawnAllCommand.lll[2], lIIlIlIlIllllll);
            return new String(IIIlIlIlIllllll.doFinal(Base64.getDecoder().decode(IIlIIlIlIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIIlIlIllllll) {
            lllIIlIlIllllll.printStackTrace();
            return null;
        }
    }
    
    static {
        IIlll();
        llIll();
        prefix = Main.getPlugin().getConfig().getString(SpawnAllCommand.lIl[SpawnAllCommand.lll[16]]);
        brak_permisji = Main.getPlugin().getConfig().getString(SpawnAllCommand.lIl[SpawnAllCommand.lll[17]]);
    }
    
    private static boolean lIlll(final int lIIllIIlIllllll) {
        return lIIllIIlIllllll == 0;
    }
}
