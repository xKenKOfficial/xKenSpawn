package x.KenKOfficial.Spawn.Main;

import org.bukkit.plugin.java.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;
import org.bukkit.command.*;
import x.KenKOfficial.Spawn.Commands.*;
import org.bukkit.*;
import org.bukkit.event.*;
import org.bukkit.plugin.*;
import x.KenKOfficial.Spawn.Listeners.*;

public class Main extends JavaPlugin
{
    private static final /* synthetic */ String[] I;
    private static final /* synthetic */ int[] Il;
    private static /* synthetic */ Main plugin;
    
    private static String l(final String lIIllllIlllllll, final String IllIlllIlllllll) {
        try {
            final SecretKeySpec IIlllllIlllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IllIlllIlllllll.getBytes(StandardCharsets.UTF_8)), Main.Il[8]), "DES");
            final Cipher llIllllIlllllll = Cipher.getInstance("DES");
            llIllllIlllllll.init(Main.Il[2], IIlllllIlllllll);
            return new String(llIllllIlllllll.doFinal(Base64.getDecoder().decode(lIIllllIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IlIllllIlllllll) {
            IlIllllIlllllll.printStackTrace();
            return null;
        }
    }
    
    public void onDisable() {
        this.saveDefaultConfig();
        System.out.println(Main.I[Main.Il[6]]);
        System.out.println(Main.I[Main.Il[7]]);
        System.out.println(Main.I[Main.Il[8]]);
        System.out.println(Main.I[Main.Il[9]]);
        System.out.println(Main.I[Main.Il[10]]);
        System.out.println(Main.I[Main.Il[11]]);
    }
    
    public static Main getPlugin() {
        return Main.plugin;
    }
    
    private static boolean lIIl(final int IIlIIllIlllllll, final int llIIIllIlllllll) {
        return IIlIIllIlllllll < llIIIllIlllllll;
    }
    
    private static String ll(final String IlIlIllIlllllll, final String llIlIllIlllllll) {
        try {
            final SecretKeySpec llllIllIlllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIlIllIlllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher IlllIllIlllllll = Cipher.getInstance("Blowfish");
            IlllIllIlllllll.init(Main.Il[2], llllIllIlllllll);
            return new String(IlllIllIlllllll.doFinal(Base64.getDecoder().decode(IlIlIllIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIllIllIlllllll) {
            lIllIllIlllllll.printStackTrace();
            return null;
        }
    }
    
    static {
        IIIl();
        lll();
    }
    
    public void onEnable() {
        (Main.plugin = this).saveDefaultConfig();
        this.registerCommands();
        this.registerListeners();
        System.out.println(Main.I[Main.Il[0]]);
        System.out.println(Main.I[Main.Il[1]]);
        System.out.println(Main.I[Main.Il[2]]);
        System.out.println(Main.I[Main.Il[3]]);
        System.out.println(Main.I[Main.Il[4]]);
        System.out.println(Main.I[Main.Il[5]]);
    }
    
    private static void lll() {
        (I = new String[Main.Il[17]])[Main.Il[0]] = l("yvAYRPRS5OrK8BhE9FLk6srwGET0UuTqyvAYRPRS5OrK8BhE9FLk6srwGET0UuTqyvAYRPRS5Orp+tZPVBz7zA==", "OtbUL");
        Main.I[Main.Il[1]] = ll("JwKZO29CuFUxTgCg6QN5bA==", "sbcoE");
        Main.I[Main.Il[2]] = ll("XQLDLdvI33WuH1QOhLUVwnTqd1rr2p7a", "RraDk");
        Main.I[Main.Il[3]] = ll("sIKueS1Fs79vp43byWZzjQ==", "BCKlV");
        Main.I[Main.Il[4]] = ll("TP2jICnhBMm66bpDksT+kLRGykPLxUEYr33bE0E26de54wY4m2Be765wZM5XihCQMbLWD4efqvy9W/I5hMrRdw==", "seYcS");
        Main.I[Main.Il[5]] = ll("vheVFYcvAfu+F5UVhy8B+74XlRWHLwH7vheVFYcvAfu+F5UVhy8B+74XlRWHLwH7vheVFYcvAfsqFU90p5XGUQ==", "QVQNY");
        Main.I[Main.Il[6]] = lIl("cWR2emVxZHZ6ZXFkdnplcWR2emVxZHZ6ZXFkdnplcWR2emVxZHZ6ZXFkdnplcWR2emVxZHZ6ZXFkdno=", "RGUYF");
        Main.I[Main.Il[7]] = ll("rWD++uhf/drNQgOWq85Mjw==", "jXmJc");
        Main.I[Main.Il[8]] = lIl("LhInHAIYTXVeRklaFwocGA==", "ywUoh");
        Main.I[Main.Il[9]] = l("JmQbjXYLiGAqB7RNhH9qnw==", "QjZhW");
        Main.I[Main.Il[10]] = lIl("PB8rACAABTRFCQ8VMg8pSwVxKy0ZGSIfLQUFNEUcGQ0mRQ0eGD4XPwAFMg1sRkwLJA45Ix8sAyUpcA==", "klQeL");
        Main.I[Main.Il[11]] = ll("9R5H8rx+6331HkfyvH7rffUeR/K8fut99R5H8rx+6331HkfyvH7rffUeR/K8fut99R5H8rx+633ojK11LyouZg==", "pNXou");
        Main.I[Main.Il[12]] = l("gKANoOEui4Krg6WAEGmBs/juKDhfKCrEAJ+1RgapsyM=", "GSzDm");
        Main.I[Main.Il[13]] = ll("t/YbBTu7wyNBTtfj4CNLCg==", "nzjaL");
        Main.I[Main.Il[14]] = lIl("KyAsPiI5PCE=", "XPMIL");
        Main.I[Main.Il[15]] = lIl("ByonFQY=", "tZFbh");
        Main.I[Main.Il[16]] = ll("YSoXsNFvcu7569gVbf8G94PLBEmXNS0wecJDgIWsONE=", "OmPet");
    }
    
    public void registerCommands() {
        this.getLogger().info(String.valueOf(new StringBuilder().append(Main.I[Main.Il[12]]).append(this.getName())));
        this.getCommand(Main.I[Main.Il[13]]).setExecutor((CommandExecutor)new SetSpawnCommand());
        this.getCommand(Main.I[Main.Il[14]]).setExecutor((CommandExecutor)new SpawnAllCommand());
        this.getCommand(Main.I[Main.Il[15]]).setExecutor((CommandExecutor)new SpawnCommand());
    }
    
    private static String lIl(String lIIlIIIllllllll, final String lIllIIIllllllll) {
        lIIlIIIllllllll = (boolean)new String(Base64.getDecoder().decode(((String)lIIlIIIllllllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder IIllIIIllllllll = new StringBuilder();
        final char[] llIlIIIllllllll = lIllIIIllllllll.toCharArray();
        int IlIlIIIllllllll = Main.Il[0];
        final int IIlIIIIllllllll = (Object)((String)lIIlIIIllllllll).toCharArray();
        final String llIIIIIllllllll = (String)IIlIIIIllllllll.length;
        long IlIIIIIllllllll = Main.Il[0];
        while (lIIl((int)IlIIIIIllllllll, (int)llIIIIIllllllll)) {
            final char llllIIIllllllll = IIlIIIIllllllll[IlIIIIIllllllll];
            IIllIIIllllllll.append((char)(llllIIIllllllll ^ llIlIIIllllllll[IlIlIIIllllllll % llIlIIIllllllll.length]));
            "".length();
            ++IlIlIIIllllllll;
            ++IlIIIIIllllllll;
            "".length();
            if (-" ".length() > 0) {
                return null;
            }
        }
        return String.valueOf(IIllIIIllllllll);
    }
    
    public void registerListeners() {
        this.getLogger().info(String.valueOf(new StringBuilder().append(Main.I[Main.Il[16]]).append(this.getName())));
        Bukkit.getPluginManager().registerEvents((Listener)new PlayerJoin(), (Plugin)this);
        Bukkit.getPluginManager().registerEvents((Listener)new PlayerQuit(), (Plugin)this);
        Bukkit.getPluginManager().registerEvents((Listener)new PlayerRespawn(), (Plugin)this);
    }
    
    private static void IIIl() {
        (Il = new int[18])[0] = ((0x4E ^ 0x2F) & ~(0xFC ^ 0x9D));
        Main.Il[1] = " ".length();
        Main.Il[2] = "  ".length();
        Main.Il[3] = "   ".length();
        Main.Il[4] = (0x7C ^ 0x78);
        Main.Il[5] = (0xA9 ^ 0xBD ^ (0x17 ^ 0x6));
        Main.Il[6] = (0x84 ^ 0x82);
        Main.Il[7] = (109 + 14 - 92 + 109 ^ 53 + 68 - 90 + 108);
        Main.Il[8] = (0x4D ^ 0x79 ^ (0xB9 ^ 0x85));
        Main.Il[9] = (169 + 80 - 82 + 8 ^ 65 + 54 + 22 + 25);
        Main.Il[10] = (0x4E ^ 0x44);
        Main.Il[11] = (0x25 ^ 0x2E);
        Main.Il[12] = (0x1C ^ 0x47 ^ (0x23 ^ 0x74));
        Main.Il[13] = (0x6E ^ 0x42 ^ (0x61 ^ 0x40));
        Main.Il[14] = (0x62 ^ 0x65 ^ (0x81 ^ 0x88));
        Main.Il[15] = (0xCE ^ 0xC1);
        Main.Il[16] = (0x13 ^ 0x3B ^ (0x5E ^ 0x66));
        Main.Il[17] = (0x56 ^ 0x47);
    }
}
