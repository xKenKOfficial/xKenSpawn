package x.KenKOfficial.Spawn.Listeners;

import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;
import x.KenKOfficial.Spawn.Main.*;
import org.bukkit.event.player.*;
import x.KenKOfficial.Spawn.Utils.*;
import org.bukkit.entity.*;
import org.bukkit.event.*;

public class PlayerQuit implements Listener
{
    private static final /* synthetic */ String quit_message;
    private static final /* synthetic */ int[] IlIl;
    private static final /* synthetic */ String[] IIIl;
    
    private static void IlIIIl() {
        (IIIl = new String[PlayerQuit.IlIl[2]])[PlayerQuit.IlIl[0]] = IIIIIl("Ih8dLRgcHSw=", "YOQlA");
        PlayerQuit.IIIl[PlayerQuit.IlIl[1]] = lIIIIl("v/QKUNKNQT0fuMgVryXnQA==", "SgVvV");
    }
    
    private static String lIIIIl(final String llIllIIIIllllll, final String IlIllIIIIllllll) {
        try {
            final SecretKeySpec IllllIIIIllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IlIllIIIIllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lIlllIIIIllllll = Cipher.getInstance("Blowfish");
            lIlllIIIIllllll.init(PlayerQuit.IlIl[2], IllllIIIIllllll);
            return new String(lIlllIIIIllllll.doFinal(Base64.getDecoder().decode(llIllIIIIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIlllIIIIllllll) {
            IIlllIIIIllllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean IlIlIl(final int llIIlIIIIllllll, final int IlIIlIIIIllllll) {
        return llIIlIIIIllllll < IlIIlIIIIllllll;
    }
    
    private static String IIIIIl(String llIlIlIIIllllll, final String IlIlIlIIIllllll) {
        llIlIlIIIllllll = (Exception)new String(Base64.getDecoder().decode(((String)llIlIlIIIllllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder IlllIlIIIllllll = new StringBuilder();
        final char[] lIllIlIIIllllll = IlIlIlIIIllllll.toCharArray();
        int IIllIlIIIllllll = PlayerQuit.IlIl[0];
        final Exception IllIIlIIIllllll = (Object)((String)llIlIlIIIllllll).toCharArray();
        final Exception lIlIIlIIIllllll = (Exception)IllIIlIIIllllll.length;
        long IIlIIlIIIllllll = PlayerQuit.IlIl[0];
        while (IlIlIl((int)IIlIIlIIIllllll, (int)lIlIIlIIIllllll)) {
            final char lIIIllIIIllllll = IllIIlIIIllllll[IIlIIlIIIllllll];
            IlllIlIIIllllll.append((char)(lIIIllIIIllllll ^ lIllIlIIIllllll[IIllIlIIIllllll % lIllIlIIIllllll.length]));
            "".length();
            ++IIllIlIIIllllll;
            ++IIlIIlIIIllllll;
            "".length();
            if ("  ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(IlllIlIIIllllll);
    }
    
    private static void lIIlIl() {
        (IlIl = new int[3])[0] = ((0xE6 ^ 0xC6 ^ (0x5E ^ 0x48)) & (95 + 76 - 151 + 117 ^ 13 + 34 + 50 + 94 ^ -" ".length()));
        PlayerQuit.IlIl[1] = " ".length();
        PlayerQuit.IlIl[2] = "  ".length();
    }
    
    static {
        lIIlIl();
        IlIIIl();
        quit_message = Main.getPlugin().getConfig().getString(PlayerQuit.IIIl[PlayerQuit.IlIl[1]]);
    }
    
    @EventHandler
    public void onQuit(final PlayerQuitEvent IlllllIIIllllll) {
        final Player lIllllIIIllllll = IlllllIIIllllll.getPlayer();
        IlllllIIIllllll.setQuitMessage(ChatUtil.fixColor(PlayerQuit.quit_message.replace(PlayerQuit.IIIl[PlayerQuit.IlIl[0]], lIllllIIIllllll.getName())));
    }
}
