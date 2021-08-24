package net.occp.base.service.impl;

import java.io.PrintWriter;
import java.io.StringWriter;
import net.occp.base.core.utils.enums.HttpCustomHeaders;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.stereotype.Service;

/**
 *
 * @author maurizio
 */
@Service
public class BaseService {

    public final Logger log = LoggerFactory.getLogger(this.getClass());

    public void printStackTrace(Exception e) {
	StringWriter writer = new StringWriter();
	e.printStackTrace(new PrintWriter(writer));
	String stackTrace = writer.toString();
	String pid = MDC.get(HttpCustomHeaders.PID.getValue());
	stackTrace = stackTrace.replace("\n", "\n[" + pid + "]    ");
	log.error(stackTrace);
    }
}
