package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:properties/${env}/${os}.properties"
})
public interface AppConfig extends Config {

    @Key("app")
    @DefaultValue("bs://sample.app")
    String getApp();

    @Key("activity")
    @DefaultValue("org.wikipedia.main.MainActivity")
    String getActivity();

    @Key("version")
    @DefaultValue("app-alpha-universal-release.apk")
    String getVersion();

    @Key("url")
    @DefaultValue("https://github.com/wikimedia/apps-android-wikipedia/releases/download/latest/")
    String getUrl();

    @Key("path")
    @DefaultValue("src/test/resources/apps/")
    String getPath();

    @Key("projectName")
    @DefaultValue("First Java Project")
    String getProjectName();

    @Key("buildName")
    @DefaultValue("browserstack-build-1")
    String getBuildName();

    @Key("testName")
    @DefaultValue("My First Test")
    String getTestName();
}