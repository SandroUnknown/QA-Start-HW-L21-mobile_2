package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:properties/browserstack/${env}.properties"
})
public interface DeviceConfig extends Config {

    @Key("device")
    @DefaultValue("Samsung Galaxy S22 Ultra")
    String getDevice();

    @Key("osVersion")
    @DefaultValue("12.0")
    String getVersion();
}