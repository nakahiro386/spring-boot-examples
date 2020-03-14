package io.github.nakahiro386.spring.boot.example.fw.domain.plugin;

import java.util.Date;

public interface AuditingProvider {

    String getCurrentAuditor();

    Date getCurrentTimeStamp();
}
