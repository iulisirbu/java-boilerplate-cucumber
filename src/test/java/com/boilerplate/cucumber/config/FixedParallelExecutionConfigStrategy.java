package com.boilerplate.cucumber.config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.platform.engine.ConfigurationParameters;
import org.junit.platform.engine.support.hierarchical.ParallelExecutionConfiguration;
import org.junit.platform.engine.support.hierarchical.ParallelExecutionConfigurationStrategy;

public class FixedParallelExecutionConfigStrategy implements ParallelExecutionConfiguration, ParallelExecutionConfigurationStrategy {
    private static final Logger LOG = LogManager.getLogger();

    private static final int FIXED_PARALLELISM = Integer.parseInt(System.getProperty("threads", "5"));

    static {
        LOG.info("Concurrent scenarios will run on {} threads", FIXED_PARALLELISM);
    }

    @Override
    public ParallelExecutionConfiguration createConfiguration(final ConfigurationParameters configurationParameters) {
        return this;
    }

    @Override
    public int getParallelism() {
        return FIXED_PARALLELISM;
    }

    @Override
    public int getMinimumRunnable() {
        return FIXED_PARALLELISM;
    }

    @Override
    public int getMaxPoolSize() {
        return FIXED_PARALLELISM;
    }

    @Override
    public int getCorePoolSize() {
        return FIXED_PARALLELISM;
    }

    @Override
    public int getKeepAliveSeconds() {
        return 30;
    }
}
