package io.github.nakahiro386.spring.boot.example.fw.domain.plugin;

import java.util.Date;

public class DefaultAuditingProvider implements AuditingProvider {

    @Override
    public String getCurrentAuditor() {
        return "SYSTEM";
    }

    @Override
    public Date getCurrentTimeStamp() {
        return new Date();
    }

}
