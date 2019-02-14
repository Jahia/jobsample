package org.jahia.modules.mymodule.jobs;

import org.quartz.JobDataMap;
import org.slf4j.Logger;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.List;


public class MyJob extends QuartzJobBean {
    private transient static Logger logger = org.slf4j.LoggerFactory.getLogger(MyJob.class);

    /**
     * Execute the actual job. The job data map will already have been
     * applied as bean property values by execute. The contract is
     * exactly the same as for the standard Quartz execute method.
     *
     * @see #execute
     */
    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        logger.debug("Executing job here...");

        // get the jobDataAsMap
        JobDataMap mergedJobDataMap = context.getMergedJobDataMap();
        String var1 = (String) mergedJobDataMap.get("var1");
        logger.debug("var1=" + var1);
        String var2 = (String) mergedJobDataMap.get("var2");
        logger.debug("var2=" + var2);
        String var3 = (String) mergedJobDataMap.get("var3");
        logger.debug("var3=" + var3);
        List<String> otherVarAsList = (List<String>) mergedJobDataMap.get("otherVarAsList");
        logger.debug("otherVarAsList=" + otherVarAsList.toString());
    }
}
