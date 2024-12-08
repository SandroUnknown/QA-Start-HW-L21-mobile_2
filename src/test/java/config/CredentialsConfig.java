package config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:properties/browserstack/project.properties"})
public interface CredentialsConfig extends Config {

    @Key("remoteUrl")
    @DefaultValue("https://hub-cloud.browserstack.com/wd/hub")
    String getRemoteUrl();

    @Key("user")
    String getUser();

    @Key("key")
    String getKey();
}