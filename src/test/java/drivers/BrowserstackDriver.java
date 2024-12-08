package drivers;

import com.codeborne.selenide.WebDriverProvider;
import config.AppConfig;
import config.CredentialsConfig;
import config.DeviceConfig;
import config.TestConfig;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import javax.annotation.Nonnull;
import java.net.MalformedURLException;
import java.net.URL;

public class BrowserstackDriver implements WebDriverProvider {

    public static CredentialsConfig credentialsConfig = ConfigFactory.create(CredentialsConfig.class, System.getProperties());
    public static DeviceConfig environmentConfig = ConfigFactory.create(DeviceConfig.class, System.getProperties());
    public static AppConfig appConfig = ConfigFactory.create(AppConfig.class, System.getProperties());

    public static TestConfig testConfig = ConfigFactory.create(TestConfig.class, System.getProperties());

    @Nonnull
    @Override
    public WebDriver createDriver(@Nonnull Capabilities capabilities) {

        MutableCapabilities caps = new MutableCapabilities();

        caps.setCapability("browserstack.user", credentialsConfig.getUser());
        caps.setCapability("browserstack.key", credentialsConfig.getKey());

        caps.setCapability("device", environmentConfig.getDevice());
        caps.setCapability("os_version", environmentConfig.getVersion());

        caps.setCapability("app", appConfig.getApp());

        caps.setCapability("project", appConfig.getProjectName());
        caps.setCapability("build", appConfig.getBuildName());
        caps.setCapability("name", appConfig.getTestName());

        try {
            return new RemoteWebDriver(
                    new URL(credentialsConfig.getRemoteUrl()), caps);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

        /*caps.setCapability("browserstack.user", testConfig.getUser());
        caps.setCapability("browserstack.key", testConfig.getKey());

        caps.setCapability("device", testConfig.getDevice());
        caps.setCapability("os_version", testConfig.getVersion());

        caps.setCapability("app", testConfig.getApp());

        caps.setCapability("project", testConfig.getProjectName());
        caps.setCapability("build", testConfig.getBuildName());
        caps.setCapability("name", testConfig.getTestName());

        try {
            return new RemoteWebDriver(
                    new URL(testConfig.getRemoteUrl()), caps);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }*/




    }
}