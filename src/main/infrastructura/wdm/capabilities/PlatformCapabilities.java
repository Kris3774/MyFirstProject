package infrastructura.wdm.capabilities;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

public class PlatformCapabilities {
    public static Capabilities cromeCapabilitiesCloud(){
        DesiredCapabilities capability = DesiredCapabilities.firefox();
        capability.setBrowserName("chrome" );
        capability.setPlatform(Platform.LINUX);
        capability.setVersion("3.6");
        return capability;
    }
    public static Capabilities fireFoxCapabilitiesCloud(){
        DesiredCapabilities capability = DesiredCapabilities.firefox();
        capability.setBrowserName("firefox" );
        capability.setPlatform(Platform.LINUX);
        capability.setVersion("3.6");
        return capability;
    }
}
