package foxxtail1.fmixinfix;

import java.util.Map;
import net.minecraft.launchwrapper.Launch;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;

@IFMLLoadingPlugin.MCVersion("1.12.2")
public class CoreMod implements IFMLLoadingPlugin {

	public CoreMod() {
		Launch.classLoader.addTransformerExclusion("org.spongepowered.launch.JavaVersionCheckUtils");
		Launch.classLoader.addTransformerExclusion("org.spongepowered.common.mixin.handler.TerminateVM");
		Launch.classLoader.addTransformerExclusion("scala.");
	}
	
	@Override
	public String[] getASMTransformerClass() {
		return null;
	}

	@Override
	public String getModContainerClass() {
		return null;
	}

	@Override
	public String getSetupClass() {
		return null;
	}

	@Override
	public void injectData(Map<String, Object> data) {
		
	}

	@Override
	public String getAccessTransformerClass() {
		return null;
	}

}
