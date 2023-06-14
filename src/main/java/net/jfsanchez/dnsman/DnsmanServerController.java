package net.jfsanchez.dnsman;

import io.micronaut.http.annotation.*;

@Controller("/dnsmanServer")
public class DnsmanServerController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}