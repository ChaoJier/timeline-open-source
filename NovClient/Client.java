package NovClient;

import NovClient.API.Value.Value;
import NovClient.Manager.CommandManager;
import NovClient.Manager.FileManager;
import NovClient.Manager.FriendManager;
import NovClient.Manager.ModuleManager;
import NovClient.Module.Module;
import NovClient.Module.Modules.Render.HUD;
import NovClient.Module.Modules.Render.TabUI;
import NovClient.UI.Login.AltManager;
import NovClient.UI.Note;
import NovClient.UI.fontRenderer.FontManager;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.main.Main;
import net.minecraft.util.ResourceLocation;

import java.awt.HeadlessException;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.NoSuchAlgorithmException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

import org.lwjgl.opengl.Display;


public class Client {
	public static float Yaw;
	public static float Pitch;
	public String name = "Timeline";
	public String version = "2.0";
	public String build = "Dev";
	public final String Lbuild = build;
	public static boolean publicMode = false;
	public static Client instance = new Client();
	public List<Note> notes;
	public static String User = Minecraft.getMinecraft().session.getUsername();
	private ModuleManager modulemanager;

	private CommandManager commandmanager;
	private AltManager altmanager;
	private FriendManager friendmanager;
	private TabUI tabui;
	public FontManager FontLoaders = new FontManager();
	public boolean LoadedWorld = false;

	public void initiate() {

		this.commandmanager = new CommandManager();
		this.commandmanager.init();
		this.friendmanager = new FriendManager();
		this.friendmanager.init();
		this.modulemanager = new ModuleManager();
		this.modulemanager.init();
		this.tabui = new TabUI();
		notes = new ArrayList<>();
		this.tabui.init();
		this.altmanager = new AltManager();
		AltManager.init();
		AltManager.setupAlts();
		FileManager.init();
		Display.setTitle(this.name + " " + this.version + "");
		
	}
	public static String getModuleName(Module mod)
	{
		String ModuleName = mod.getName();
		String CustomName = mod.getCustomName();
		if(CustomName!=null)return CustomName;
		if(!HUD.????.getValue())return ModuleName;
		switch(ModuleName)
		{
		case "KillAura" :
		    return "????????";
			case "TestFly":
				return "????";
		case "Velocity" :
		    return "??????";
		case "AntiBot" :
		    return "????????";
		case "AutoHead" :
		    return "????????";
		case "Criticals" :
		    return "????????";
		case "Animations" :
		    return "????????";
		case "HUD" :
		    return "??????";
		case "ChatBypass" :
		    return "????????????";
		case "IRC" :
		    return "????????";
		case "AutoL" :
		    return "????????";
		case "TabGui" :
		    return "????";
		case "ReachDisplay" :
		    return "????????????";
		case "ReachRender" :
		    return "????????";
		case "ItemPhysic" :
		    return "??????????";
		case "ItemESP" :
		    return "??????????";
		case "ShowDMG" :
		    return "????????";
		case "TargetHUD" :
		    return "????????????";
		case "Timer" :
		    return "????????";
		case "KeyStrokes" :
		    return "????????";
		case "AutoPot" :
		    return "????????";
		case "Wings" :
		    return "????";
		case "AutoReconnect" :
		    return "????????";
		case "TargetESP" :
		    return "????????????";
		case "AutoClicker" :
		    return "??????";
		case "Strafe" :
		    return "????????";
		case "Eagle" :
		    return "????";
		case "NameTags" :
		    return "????????";
		case "HitBox" :
		    return "??????";
		case "KeepSprint" :
		    return "????????";
		case "Reach" :
		    return "??????";
		case "NameProtect" :
		    return "????????";
		case "ClickGui" :
		    return "????????";
		case "Tracers" :
		    return "????????";
		case "NoHurtCam" :
		    return "????????????";
		case "ViewClip" :
		    return "??????????";
		case "ESP" :
		    return "????????";
		case "ItemTeleport" :
		    return "??????????";
		case "FullBright" :
		    return "????????";
		case "Chams" :
		    return "????????";
		case "Xray" :
		    return "????????";
		case "ChestESP" :
		    return "????????";
		case "MiniMap" :
		    return "????";
		case "AntiFreeze" :
		    return "??????";
		case "Disabler" :
		    return "??????????";
		case "Sprint" :
		    return "????????";
		case "Speed" :
		    return "????????";
		case "LongJump" :
		    return "????";
		case "Fly" :
		    return "????";
		case "WorldTime" :
		    return "??????????????";
		case "NoSlow" :
		    return "??????????????";
		case "InvMove" :
		    return "????????";
		case "FreeCam" :
		    return "????????";
		case "AntiFall" :
		    return "????????";
		case "Scaffold" :
		    return "????????";
		case "TargetStrafe" :
		    return "????????";
		case "Jesus" :
		    return "????????";
		case "Step" :
	    return "??????????";
		case "Blink" :
		    return "????";
		case "AntiObsidian" :
		    return "????????????";
		case "NoFall" :
		    return "????????????";
		case "AutoTool" :
		    return "????????????";
		case "MCF" :
		    return "????????????";
		case "FastPlace" :
		    return "????????";
		case "FastDig" :
		    return "????????";
		case "ChestSteal" :
		    return "??????????????";
		case "NoCommand" :
		    return "??????????";
		case "Teams" :
		    return "????????";
		case "AutoArmor" :
		    return "??????????";
		case "NoRotate" :
		    return "????????????";
		case "PingSpoof" :
		    return "??????";
		case "InvCleaner" :
		    return "????????";
		case "Crosshair" :
		    return "??????????";
		case "AntiAim" :
		    return "??????";
		}
		return ModuleName;
	}
	
	public static String getModuleTypeName(String mod)
	{
		if(!HUD.????.getValue())return mod;
		switch(mod)
		{
		case "Combat":
			return "??????";
		case "Render":
			return "??????";
		case "Move":
			return "??????";
		case "Misc":
			return "??????";
		case "Legit":
			return "??????";
		
		}
		
		return mod;
	}
	public static void RenderRotate(float yaw) {
		Minecraft.getMinecraft().thePlayer.renderYawOffset = yaw;
		Minecraft.getMinecraft().thePlayer.rotationYawHead = yaw;
	}
	public static String sendGet(final String url) {
	    String result = "";
        try {
    	    final String urlNameString = url;
    	    final URL realurl = new URL(urlNameString);
	        HttpURLConnection httpUrlConn = (HttpURLConnection) realurl.openConnection();
	        httpUrlConn.setDoInput(true);  
            httpUrlConn.setRequestMethod("GET");  
            httpUrlConn.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");
            InputStream input = httpUrlConn.getInputStream();
            InputStreamReader read = new InputStreamReader(input);
            BufferedReader br = new BufferedReader(read);
            String data = br.readLine();
            while(data!=null) {
                result = String.valueOf(result) + data + "\n";
                data=br.readLine();
            }
       br.close();  
       read.close();  
       input.close();  
       httpUrlConn.disconnect();  
       } catch (MalformedURLException e) {
            e.printStackTrace();
       } catch (IOException e) {
            e.printStackTrace();
       }
	    return result;
    }

	public ModuleManager getModuleManager() {
		return this.modulemanager;
	}
	public FriendManager getFriendManager() {
		return this.friendmanager;
	}
	
	public CommandManager getCommandManager() {
		return this.commandmanager;
	}

	public AltManager getAltManager() {
		return this.altmanager;
	}

	public void shutDown() {
		
		if(!LoadedWorld)return;

		String values = "";
		for (Module m : ModuleManager.getModules()) {
			for (Value v : m.getValues()) {
				values = String.valueOf(values) + String.format("%s:%s:%s%s", m.getName(), v.getName(), v.getValue(), System.lineSeparator());
			}
		}
		FileManager.save("Values.txt", values, false);

		new File(FileManager.dir+"/CustomName.txt").delete();
		String name = "";
		for (Module m : ModuleManager.getModules()) {
			if(m.getCustomName()!=null)
				name = String.valueOf(name) + String.format("%s:%s%s", m.getName(), m.getCustomName(), System.lineSeparator());
		}
		FileManager.save("CustomName.txt", name, false);
		
		String enabled = "";
		for (Module m : ModuleManager.getModules()) {
			if (m.isEnabled())
			enabled = String.valueOf(enabled) + String.format("%s%s", m.getName(), System.lineSeparator());
		}
		FileManager.save("Enabled.txt", enabled, false);
		String Hiddens = ""; 
		for (Module m : ModuleManager.getModules()) {
			if(m.wasRemoved())Hiddens = String.valueOf(Hiddens) + m.getName() + System.lineSeparator();
			
		}
		FileManager.save("Hidden.txt", Hiddens, false);
	}
}
