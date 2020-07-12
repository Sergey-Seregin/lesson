package config;

import org.aeonbits.owner.Config;

public interface ServerConfig extends Config {

    @Key("url")
    String url();

}
