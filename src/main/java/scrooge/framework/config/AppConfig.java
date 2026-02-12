package scrooge.framework.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "system:properties",
        "classpath:local.properties",
        "classpath:config.properties"
})
public interface AppConfig extends Config{

    @Key("remote.url")
    @DefaultValue("http://127.0.0.1:4723")
    String remoteUrl();

    @Key("app.path")
    @DefaultValue("C:\\Windows\\System32\\notepad.exe")
    String appPath();

}
