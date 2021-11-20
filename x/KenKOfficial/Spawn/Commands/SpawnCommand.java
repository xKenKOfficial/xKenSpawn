package x.KenKOfficial.Spawn.Commands;

import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;
import org.bukkit.command.*;
import org.bukkit.entity.*;
import x.KenKOfficial.Spawn.Main.*;
import x.KenKOfficial.Spawn.Utils.*;
import org.bukkit.scheduler.*;
import org.bukkit.plugin.*;
import org.bukkit.*;

public class SpawnCommand implements CommandExecutor
{
    private static final /* synthetic */ String prefix;
    private static final /* synthetic */ String[] llIl;
    private static final /* synthetic */ String offlinePlayer;
    private static final /* synthetic */ int[] IIll;
    
    private static void IlllIl() {
        (llIl = new String[SpawnCommand.IIll[25]])[SpawnCommand.IIll[0]] = llIlIl("wECHlHmuqWTyiDdbthgrDg==", "oMPgP");
        SpawnCommand.llIl[SpawnCommand.IIll[1]] = IIllIl("DaI2AlLcdjU=", "lBirF");
        SpawnCommand.llIl[SpawnCommand.IIll[2]] = llIlIl("OEtPMOuDLBg=", "ZtLMF");
        SpawnCommand.llIl[SpawnCommand.IIll[3]] = llIlIl("R/JDNyn83BQ=", "ZxERv");
        SpawnCommand.llIl[SpawnCommand.IIll[4]] = lIllIl("OCgIGShFIQgZ", "kXinF");
        SpawnCommand.llIl[SpawnCommand.IIll[5]] = llIlIl("llNPm0j8i4PmBSufs1BiAQ==", "esDGw");
        SpawnCommand.llIl[SpawnCommand.IIll[6]] = lIllIl("JQQPEQpYAwEUCBI=", "vtnfd");
        SpawnCommand.llIl[SpawnCommand.IIll[7]] = llIlIl("rxb1iaJ3nmgw/9Vy2WZW5Vg5YNBg9gr5", "ckNzt");
        SpawnCommand.llIl[SpawnCommand.IIll[8]] = llIlIl("X5uzY3KHzUo=", "sclVh");
        SpawnCommand.llIl[SpawnCommand.IIll[9]] = llIlIl("fndXeBZdJkE=", "ysgMP");
        SpawnCommand.llIl[SpawnCommand.IIll[10]] = llIlIl("qjXgon5NMO5EZX2VnunYFcrceBVQJibYUDczHFnFsuM=", "NYYQg");
        SpawnCommand.llIl[SpawnCommand.IIll[11]] = lIllIl("HyAAEDAdExIZNBgiPh0wAykRBicbEwANOAYi", "oLaiU");
        SpawnCommand.llIl[SpawnCommand.IIll[12]] = IIllIl("exYqouQaVvI=", "OmfCm");
        SpawnCommand.llIl[SpawnCommand.IIll[13]] = llIlIl("DsCMXdTj5Q4Ij5qWiPfWhA8/6X+yUakIiDoMLTSzePA=", "wUgbS");
        SpawnCommand.llIl[SpawnCommand.IIll[14]] = llIlIl("icPo/7KEtb/ZxvbOOhv/xA==", "qsFZd");
        SpawnCommand.llIl[SpawnCommand.IIll[15]] = IIllIl("q3/lvEFnUgA=", "xqgQo");
        SpawnCommand.llIl[SpawnCommand.IIll[16]] = IIllIl("wmDSqO0XjMg=", "FWVvc");
        SpawnCommand.llIl[SpawnCommand.IIll[17]] = lIllIl("GRcqACE1CSQoLg4KIhkQDx8uFDoeAhQUIAcKKhkr", "jgKwO");
        SpawnCommand.llIl[SpawnCommand.IIll[18]] = lIllIl("SA==", "hEmRg");
        SpawnCommand.llIl[SpawnCommand.IIll[19]] = lIllIl("ISYEEw8NMx0BAiciADsUITcCAQ==", "RVeda");
        SpawnCommand.llIl[SpawnCommand.IIll[20]] = llIlIl("ZVS1bmXheaw=", "xGxvj");
        SpawnCommand.llIl[SpawnCommand.IIll[21]] = lIllIl("OQkGcD0CAQk+MhRMAjkzTQEDKjgMTBkqLxoND3AhTQcDPiUCAAVx", "mllPV");
        SpawnCommand.llIl[SpawnCommand.IIll[22]] = IIllIl("7aPL5Tn83Gw=", "KUjUt");
        SpawnCommand.llIl[SpawnCommand.IIll[23]] = lIllIl("LRsZEhQxGS8RAiobKA==", "CtFbq");
        SpawnCommand.llIl[SpawnCommand.IIll[24]] = IIllIl("Mcedc9+/iIc1EJtpcf8tPw==", "MwKto");
    }
    
    private static String llIlIl(final String IIlIllIllIlllll, final String llIIllIllIlllll) {
        try {
            final SecretKeySpec lllIllIllIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIllIllIlllll.getBytes(StandardCharsets.UTF_8)), SpawnCommand.IIll[8]), "DES");
            final Cipher IllIllIllIlllll = Cipher.getInstance("DES");
            IllIllIllIlllll.init(SpawnCommand.IIll[2], lllIllIllIlllll);
            return new String(IllIllIllIlllll.doFinal(Base64.getDecoder().decode(IIlIllIllIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIllIllIlllll) {
            lIlIllIllIlllll.printStackTrace();
            return null;
        }
    }
    
    public boolean onCommand(final CommandSender lIllIllllIlllll, final Command lIIIlllllIlllll, final String IIIIlllllIlllll, final String[] llllIllllIlllll) {
        if (IIIIll((lIllIllllIlllll instanceof Player) ? 1 : 0)) {
            final String llIllllllIlllll = Main.getPlugin().getConfig().getString(SpawnCommand.llIl[SpawnCommand.IIll[0]]);
            final Player IlIllllllIlllll = (Player)lIllIllllIlllll;
            final double lIIllllllIlllll = Main.getPlugin().getConfig().getDouble(SpawnCommand.llIl[SpawnCommand.IIll[1]]);
            final double IIIllllllIlllll = Main.getPlugin().getConfig().getDouble(SpawnCommand.llIl[SpawnCommand.IIll[2]]);
            final double lllIlllllIlllll = Main.getPlugin().getConfig().getDouble(SpawnCommand.llIl[SpawnCommand.IIll[3]]);
            final float IllIlllllIlllll = (float)Main.getPlugin().getConfig().getInt(SpawnCommand.llIl[SpawnCommand.IIll[4]]);
            final float lIlIlllllIlllll = (float)Main.getPlugin().getConfig().getInt(SpawnCommand.llIl[SpawnCommand.IIll[5]]);
            final String IIlIlllllIlllll = Main.getPlugin().getConfig().getString(SpawnCommand.llIl[SpawnCommand.IIll[6]]);
            if (lIIIll(llllIllllIlllll.length, SpawnCommand.IIll[1])) {
                if (IIIIll(IlIllllllIlllll.hasPermission(SpawnCommand.llIl[SpawnCommand.IIll[7]]) ? 1 : 0)) {
                    IlIllllllIlllll.teleport(new Location(Bukkit.getWorld(IIlIlllllIlllll), lIIllllllIlllll, IIIllllllIlllll, lllIlllllIlllll, IllIlllllIlllll, lIlIlllllIlllll));
                    "".length();
                    lIllIllllIlllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(SpawnCommand.prefix).append(SpawnCommand.llIl[SpawnCommand.IIll[8]]).append(llIllllllIlllll))));
                    return SpawnCommand.IIll[0] != 0;
                }
                new BukkitRunnable() {
                    private static final /* synthetic */ int[] IIl;
                    /* synthetic */ double z = IlIllllllIlllll.getLocation().getZ();
                    /* synthetic */ double x = IlIllllllIlllll.getLocation().getX();
                    /* synthetic */ World world = IlIllllllIlllll.getWorld();
                    /* synthetic */ int i = Main.getPlugin().getConfig().getInt(SpawnCommand$1.ll[SpawnCommand$1.IIl[0]]);
                    final /* synthetic */ Location last = new Location(this.world, this.x, this.y, this.z);
                    /* synthetic */ double y = IlIllllllIlllll.getLocation().getY();
                    private static final /* synthetic */ String[] ll;
                    
                    public void run() {
                        if (IIlIl(this.i, SpawnCommand$1.IIl[1])) {
                            this.cancel();
                            final double llllIIlIlllllll = Main.getPlugin().getConfig().getDouble(SpawnCommand$1.ll[SpawnCommand$1.IIl[1]]);
                            final double IlllIIlIlllllll = Main.getPlugin().getConfig().getDouble(SpawnCommand$1.ll[SpawnCommand$1.IIl[2]]);
                            final double lIllIIlIlllllll = Main.getPlugin().getConfig().getDouble(SpawnCommand$1.ll[SpawnCommand$1.IIl[3]]);
                            final float IIllIIlIlllllll = (float)Main.getPlugin().getConfig().getInt(SpawnCommand$1.ll[SpawnCommand$1.IIl[4]]);
                            final float llIlIIlIlllllll = (float)Main.getPlugin().getConfig().getInt(SpawnCommand$1.ll[SpawnCommand$1.IIl[5]]);
                            final String IlIlIIlIlllllll = Main.getPlugin().getConfig().getString(SpawnCommand$1.ll[SpawnCommand$1.IIl[6]]);
                            IlIllllllIlllll.teleport(new Location(Bukkit.getWorld(IlIlIIlIlllllll), llllIIlIlllllll, IlllIIlIlllllll, lIllIIlIlllllll, IIllIIlIlllllll, llIlIIlIlllllll));
                            "".length();
                            IlIllllllIlllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(SpawnCommand.prefix).append(SpawnCommand$1.ll[SpawnCommand$1.IIl[7]]).append(llIllllllIlllll))));
                            "".length();
                            if ((122 + 173 - 287 + 176 ^ 66 + 109 - 25 + 38) <= "   ".length()) {
                                return;
                            }
                        }
                        else {
                            final double lllIIIlIlllllll = IlIllllllIlllll.getLocation().getX();
                            final double IllIIIlIlllllll = IlIllllllIlllll.getLocation().getY();
                            final double lIlIIIlIlllllll = IlIllllllIlllll.getLocation().getZ();
                            final World IIlIIIlIlllllll = IlIllllllIlllll.getWorld();
                            final Location llIIIIlIlllllll = new Location(IIlIIIlIlllllll, lllIIIlIlllllll, IllIIIlIlllllll, lIlIIIlIlllllll);
                            if (lIlIl(llIIIIlIlllllll.equals((Object)this.last) ? 1 : 0)) {
                                this.i -= SpawnCommand$1.IIl[1];
                                final String lIIlIIlIlllllll = Main.getPlugin().getConfig().getString(SpawnCommand$1.ll[SpawnCommand$1.IIl[8]]).replace(SpawnCommand$1.ll[SpawnCommand$1.IIl[9]], String.valueOf(this.i));
                                lIllIllllIlllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(SpawnCommand.prefix).append(SpawnCommand$1.ll[SpawnCommand$1.IIl[10]]).append(lIIlIIlIlllllll))));
                                "".length();
                                if ((0x42 ^ 0x46) <= ((0x65 ^ 0x28) & ~(0x6F ^ 0x22))) {
                                    return;
                                }
                            }
                            else {
                                this.cancel();
                                final String IIIlIIlIlllllll = Main.getPlugin().getConfig().getString(SpawnCommand$1.ll[SpawnCommand$1.IIl[11]]);
                                lIllIllllIlllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(SpawnCommand.prefix).append(SpawnCommand$1.ll[SpawnCommand$1.IIl[12]]).append(IIIlIIlIlllllll))));
                            }
                        }
                    }
                    
                    private static boolean IllIl(final int IlIIIIIIlllllll, final int lIIIIIIIlllllll) {
                        return IlIIIIIIlllllll < lIIIIIIIlllllll;
                    }
                    
                    private static void llIIl() {
                        (IIl = new int[14])[0] = ((0x27 ^ 0x3E) & ~(0x9D ^ 0x84));
                        SpawnCommand$1.IIl[1] = " ".length();
                        SpawnCommand$1.IIl[2] = "  ".length();
                        SpawnCommand$1.IIl[3] = "   ".length();
                        SpawnCommand$1.IIl[4] = (0xB0 ^ 0xB4);
                        SpawnCommand$1.IIl[5] = (0x8 ^ 0xD);
                        SpawnCommand$1.IIl[6] = (0x9B ^ 0x9D);
                        SpawnCommand$1.IIl[7] = (0xB3 ^ 0xB4);
                        SpawnCommand$1.IIl[8] = (0xCC ^ 0xC4);
                        SpawnCommand$1.IIl[9] = (0x4D ^ 0x2A ^ (0x3A ^ 0x54));
                        SpawnCommand$1.IIl[10] = (0x46 ^ 0x59 ^ (0x3F ^ 0x2A));
                        SpawnCommand$1.IIl[11] = (0x58 ^ 0x5F ^ (0x5B ^ 0x57));
                        SpawnCommand$1.IIl[12] = (0x15 ^ 0x38 ^ (0x4C ^ 0x6D));
                        SpawnCommand$1.IIl[13] = (0xAD ^ 0x9E ^ (0x71 ^ 0x4F));
                    }
                    
                    private static String llll(final String IIlIIlIIlllllll, final String llIIIlIIlllllll) {
                        try {
                            final SecretKeySpec lIIlIlIIlllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIIlIIlllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                            final Cipher IIIlIlIIlllllll = Cipher.getInstance("Blowfish");
                            IIIlIlIIlllllll.init(SpawnCommand$1.IIl[2], lIIlIlIIlllllll);
                            return new String(IIIlIlIIlllllll.doFinal(Base64.getDecoder().decode(IIlIIlIIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                        }
                        catch (Exception lllIIlIIlllllll) {
                            lllIIlIIlllllll.printStackTrace();
                            return null;
                        }
                    }
                    
                    private static String lIIIl(final String llIIllIIlllllll, final String IlIIllIIlllllll) {
                        try {
                            final SecretKeySpec IllIllIIlllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IlIIllIIlllllll.getBytes(StandardCharsets.UTF_8)), SpawnCommand$1.IIl[8]), "DES");
                            final Cipher lIlIllIIlllllll = Cipher.getInstance("DES");
                            lIlIllIIlllllll.init(SpawnCommand$1.IIl[2], IllIllIIlllllll);
                            return new String(lIlIllIIlllllll.doFinal(Base64.getDecoder().decode(llIIllIIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                        }
                        catch (Exception IIlIllIIlllllll) {
                            IIlIllIIlllllll.printStackTrace();
                            return null;
                        }
                    }
                    
                    private static String IIIIl(String lIIIlIIIlllllll, final String IIIIlIIIlllllll) {
                        lIIIlIIIlllllll = (byte)new String(Base64.getDecoder().decode(((String)lIIIlIIIlllllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                        final StringBuilder IIlIlIIIlllllll = new StringBuilder();
                        final char[] llIIlIIIlllllll = IIIIlIIIlllllll.toCharArray();
                        int IlIIlIIIlllllll = SpawnCommand$1.IIl[0];
                        final char IIllIIIIlllllll = (Object)((String)lIIIlIIIlllllll).toCharArray();
                        final short llIlIIIIlllllll = (short)IIllIIIIlllllll.length;
                        char IlIlIIIIlllllll = (char)SpawnCommand$1.IIl[0];
                        while (IllIl(IlIlIIIIlllllll, llIlIIIIlllllll)) {
                            final char lllIlIIIlllllll = IIllIIIIlllllll[IlIlIIIIlllllll];
                            IIlIlIIIlllllll.append((char)(lllIlIIIlllllll ^ llIIlIIIlllllll[IlIIlIIIlllllll % llIIlIIIlllllll.length]));
                            "".length();
                            ++IlIIlIIIlllllll;
                            ++IlIlIIIIlllllll;
                            "".length();
                            if (null != null) {
                                return null;
                            }
                        }
                        return String.valueOf(IIlIlIIIlllllll);
                    }
                    
                    private static boolean lIlIl(final int llllllllIllllll) {
                        return llllllllIllllll != 0;
                    }
                    
                    private static void IlIIl() {
                        (ll = new String[SpawnCommand$1.IIl[13]])[SpawnCommand$1.IIl[0]] = llll("rXp1Fm2ILXHi1iwOjRMrF4+jSIqrsNqw", "lkPzB");
                        SpawnCommand$1.ll[SpawnCommand$1.IIl[1]] = llll("prZXXvNZR80=", "aMXiu");
                        SpawnCommand$1.ll[SpawnCommand$1.IIl[2]] = IIIIl("MSYtPBhMLw==", "bVLKv");
                        SpawnCommand$1.ll[SpawnCommand$1.IIl[3]] = llll("apETSq47z6c=", "EuSLd");
                        SpawnCommand$1.ll[SpawnCommand$1.IIl[4]] = lIIIl("m8nFL1JNSvbiCuSkcn8MRg==", "RGnOF");
                        SpawnCommand$1.ll[SpawnCommand$1.IIl[5]] = lIIIl("Eqa0PviPrZfFJn5TeJ5ltQ==", "ODkIV");
                        SpawnCommand$1.ll[SpawnCommand$1.IIl[6]] = llll("aI7BVaVna064wCKW7IWzxQ==", "dOKXm");
                        SpawnCommand$1.ll[SpawnCommand$1.IIl[7]] = llll("OOX1QF0ndkU=", "LSSud");
                        SpawnCommand$1.ll[SpawnCommand$1.IIl[8]] = llll("6qEXIBf+A0ZneR1sbZFTP/UH4rLLptp4aH56DyXokwI=", "IMSQN");
                        SpawnCommand$1.ll[SpawnCommand$1.IIl[9]] = llll("KOZciY9eNWf88oiB1v73cQ==", "EKNRW");
                        SpawnCommand$1.ll[SpawnCommand$1.IIl[10]] = lIIIl("4gsSE8GIlx0=", "ilVZy");
                        SpawnCommand$1.ll[SpawnCommand$1.IIl[11]] = llll("rXltiRFMFR8POp8N/Dtwmxt8O5qc7seL", "LRMjt");
                        SpawnCommand$1.ll[SpawnCommand$1.IIl[12]] = llll("Y+pFLGO9tfw=", "zIyMo");
                    }
                    
                    private static boolean IIlIl(final int IllIIIIIlllllll, final int lIlIIIIIlllllll) {
                        return IllIIIIIlllllll == lIlIIIIIlllllll;
                    }
                    
                    static {
                        llIIl();
                        IlIIl();
                    }
                }.runTaskTimer((Plugin)Main.getPlugin(), 0L, 20L);
                "".length();
                return SpawnCommand.IIll[0] != 0;
            }
            else {
                final Player IIlllllllIlllll = Bukkit.getPlayer(llllIllllIlllll[SpawnCommand.IIll[0]]);
                if (IlIIll(IIlllllllIlllll)) {
                    lIllIllllIlllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(SpawnCommand.prefix).append(SpawnCommand.llIl[SpawnCommand.IIll[9]]).append(SpawnCommand.offlinePlayer))));
                    return SpawnCommand.IIll[0] != 0;
                }
                if (llIIll(llllIllllIlllll.length, SpawnCommand.IIll[1])) {
                    if (IIIIll(IlIllllllIlllll.hasPermission(SpawnCommand.llIl[SpawnCommand.IIll[10]]) ? 1 : 0)) {
                        final String IIIIIIIIIllllll = Main.getPlugin().getConfig().getString(SpawnCommand.llIl[SpawnCommand.IIll[11]]).replace(SpawnCommand.llIl[SpawnCommand.IIll[12]], IlIllllllIlllll.getName());
                        final String lllllllllIlllll = Main.getPlugin().getConfig().getString(SpawnCommand.llIl[SpawnCommand.IIll[13]]).replace(SpawnCommand.llIl[SpawnCommand.IIll[14]], IIlllllllIlllll.getName());
                        IIlllllllIlllll.teleport(new Location(Bukkit.getWorld(IIlIlllllIlllll), lIIllllllIlllll, IIIllllllIlllll, lllIlllllIlllll, IllIlllllIlllll, lIlIlllllIlllll));
                        "".length();
                        IIlllllllIlllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(SpawnCommand.prefix).append(SpawnCommand.llIl[SpawnCommand.IIll[15]]).append(IIIIIIIIIllllll))));
                        lIllIllllIlllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(SpawnCommand.prefix).append(SpawnCommand.llIl[SpawnCommand.IIll[16]]).append(lllllllllIlllll))));
                        "".length();
                        if ("  ".length() < ((0x5F ^ 0x67 ^ (0x98 ^ 0xB3)) & (0xEC ^ 0xA8 ^ (0x48 ^ 0x1F) ^ -" ".length()))) {
                            return ((26 + 42 - 63 + 131 ^ 73 + 137 - 90 + 21) & (0x33 ^ 0x39 ^ (0x8D ^ 0x82) ^ -" ".length())) != 0x0;
                        }
                    }
                    else {
                        final String IllllllllIlllll = Main.getPlugin().getConfig().getString(SpawnCommand.llIl[SpawnCommand.IIll[17]]);
                        lIllIllllIlllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(SpawnCommand.prefix).append(SpawnCommand.llIl[SpawnCommand.IIll[18]]).append(IllllllllIlllll))));
                        "".length();
                        if ((0xAA ^ 0xAE) == ((0x68 ^ 0x60) & ~(0xBE ^ 0xB6))) {
                            return ((0x94 ^ 0xC5) & ~(0x7 ^ 0x56)) != 0x0;
                        }
                    }
                }
                else {
                    final String lIlllllllIlllll = Main.getPlugin().getConfig().getString(SpawnCommand.llIl[SpawnCommand.IIll[19]]);
                    lIllIllllIlllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(SpawnCommand.prefix).append(SpawnCommand.llIl[SpawnCommand.IIll[20]]).append(lIlllllllIlllll))));
                }
                "".length();
                if ((0x85 ^ 0x81) < -" ".length()) {
                    return ((0xCD ^ 0xC3) & ~(0x36 ^ 0x38)) != 0x0;
                }
            }
        }
        else {
            lIllIllllIlllll.sendMessage(String.valueOf(new StringBuilder().append(ChatColor.DARK_RED).append(SpawnCommand.llIl[SpawnCommand.IIll[21]])));
        }
        return SpawnCommand.IIll[0] != 0;
    }
    
    private static String lIllIl(String lIIIlIlllIlllll, final String IIIIlIlllIlllll) {
        lIIIlIlllIlllll = (double)new String(Base64.getDecoder().decode(((String)lIIIlIlllIlllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder IIlIlIlllIlllll = new StringBuilder();
        final char[] llIIlIlllIlllll = IIIIlIlllIlllll.toCharArray();
        int IlIIlIlllIlllll = SpawnCommand.IIll[0];
        final long IIllIIlllIlllll = (Object)((String)lIIIlIlllIlllll).toCharArray();
        final int llIlIIlllIlllll = IIllIIlllIlllll.length;
        byte IlIlIIlllIlllll = (byte)SpawnCommand.IIll[0];
        while (lIIIll(IlIlIIlllIlllll, llIlIIlllIlllll)) {
            final char lllIlIlllIlllll = IIllIIlllIlllll[IlIlIIlllIlllll];
            IIlIlIlllIlllll.append((char)(lllIlIlllIlllll ^ llIIlIlllIlllll[IlIIlIlllIlllll % llIIlIlllIlllll.length]));
            "".length();
            ++IlIIlIlllIlllll;
            ++IlIlIIlllIlllll;
            "".length();
            if ((0x14 ^ 0x10) <= "   ".length()) {
                return null;
            }
        }
        return String.valueOf(IIlIlIlllIlllll);
    }
    
    private static String IIllIl(final String lIIIIIlllIlllll, final String IlllllIllIlllll) {
        try {
            final SecretKeySpec IIlIIIlllIlllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IlllllIllIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llIIIIlllIlllll = Cipher.getInstance("Blowfish");
            llIIIIlllIlllll.init(SpawnCommand.IIll[2], IIlIIIlllIlllll);
            return new String(llIIIIlllIlllll.doFinal(Base64.getDecoder().decode(lIIIIIlllIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IlIIIIlllIlllll) {
            IlIIIIlllIlllll.printStackTrace();
            return null;
        }
    }
    
    static {
        llllIl();
        IlllIl();
        prefix = Main.getPlugin().getConfig().getString(SpawnCommand.llIl[SpawnCommand.IIll[22]]);
        brak_permisji = Main.getPlugin().getConfig().getString(SpawnCommand.llIl[SpawnCommand.IIll[23]]);
        offlinePlayer = Main.getPlugin().getConfig().getString(SpawnCommand.llIl[SpawnCommand.IIll[24]]);
    }
    
    private static void llllIl() {
        (IIll = new int[26])[0] = ((0xA ^ 0x10) & ~(0x7D ^ 0x67));
        SpawnCommand.IIll[1] = " ".length();
        SpawnCommand.IIll[2] = "  ".length();
        SpawnCommand.IIll[3] = "   ".length();
        SpawnCommand.IIll[4] = (0x7F ^ 0x7B);
        SpawnCommand.IIll[5] = (0x51 ^ 0x37 ^ (0x15 ^ 0x76));
        SpawnCommand.IIll[6] = (0x8E ^ 0x88);
        SpawnCommand.IIll[7] = (0xA8 ^ 0xAF);
        SpawnCommand.IIll[8] = (0xDC ^ 0x9D ^ (0x1C ^ 0x55));
        SpawnCommand.IIll[9] = (0x2D ^ 0x24);
        SpawnCommand.IIll[10] = (0x35 ^ 0x66 ^ (0xD1 ^ 0x88));
        SpawnCommand.IIll[11] = (0xB2 ^ 0x97 ^ (0x94 ^ 0xBA));
        SpawnCommand.IIll[12] = (19 + 66 - 0 + 91 ^ 100 + 179 - 155 + 64);
        SpawnCommand.IIll[13] = (126 + 98 - 42 + 2 ^ 149 + 71 - 73 + 34);
        SpawnCommand.IIll[14] = (0x6D ^ 0x63);
        SpawnCommand.IIll[15] = (0x17 ^ 0x18);
        SpawnCommand.IIll[16] = (0x99 ^ 0x89);
        SpawnCommand.IIll[17] = (0x5F ^ 0x4D ^ "   ".length());
        SpawnCommand.IIll[18] = (0x11 ^ 0x3);
        SpawnCommand.IIll[19] = (0x6B ^ 0x78);
        SpawnCommand.IIll[20] = (0xBB ^ 0xAF);
        SpawnCommand.IIll[21] = (0x98 ^ 0xA5 ^ (0x9F ^ 0xB7));
        SpawnCommand.IIll[22] = (32 + 119 - 34 + 34 ^ 121 + 25 - 112 + 95);
        SpawnCommand.IIll[23] = (0x23 ^ 0x34);
        SpawnCommand.IIll[24] = (0x89 ^ 0x93 ^ "  ".length());
        SpawnCommand.IIll[25] = (0x42 ^ 0x5B);
    }
    
    private static boolean llIIll(final int IIllIlIllIlllll, final int llIlIlIllIlllll) {
        return IIllIlIllIlllll == llIlIlIllIlllll;
    }
    
    private static boolean IlIIll(final Object lIlIIlIllIlllll) {
        return lIlIIlIllIlllll == null;
    }
    
    private static boolean IIIIll(final int llIIIlIllIlllll) {
        return llIIIlIllIlllll != 0;
    }
    
    private static boolean lIIIll(final int IIIlIlIllIlllll, final int lllIIlIllIlllll) {
        return IIIlIlIllIlllll < lllIIlIllIlllll;
    }
}
