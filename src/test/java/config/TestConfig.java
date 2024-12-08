package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:properties/browserstack.properties"
})
public interface TestConfig extends Config {

    @Key("remoteUrl")
    @DefaultValue("https://hub-cloud.browserstack.com/wd/hub")
    String getRemoteUrl();

    @Key("user")
    String getUser();

    @Key("key")
    String getKey();



    @Key("${env}.device")
    @DefaultValue("Samsung Galaxy S22 Ultra")
    String getDevice();

    @Key("android.osVersion")
    @DefaultValue("12.0")
    String getVersion();



    @Key("android.app")
    @DefaultValue("bs://sample.app")
    String getApp();

    @Key("android.projectName")
    @DefaultValue("First Java Project")
    String getProjectName();

    @Key("android.buildName")
    @DefaultValue("browserstack-build-1")
    String getBuildName();

    @Key("android.testName")
    @DefaultValue("My First Test")
    String getTestName();


    //${env}
}