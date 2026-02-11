package scrooge.framework.config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:config.properties"})
public interface AppConfig extends Config{

    @Key("remote.url")
    String remoteUrl();

    @Key("app.path")
    String appPath();

}
