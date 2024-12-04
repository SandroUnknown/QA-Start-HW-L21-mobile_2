package drivers;

import com.codeborne.selenide.WebDriverProvider;
import config.AppConfig;
import config.CredentialsConfig;
import config.EnvironmentConfig;
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
    public static EnvironmentConfig environmentConfig = ConfigFactory.create(EnvironmentConfig.class, System.getProperties());
    public static AppConfig appConfig = ConfigFactory.create(AppConfig.class, System.getProperties());

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
    }
}