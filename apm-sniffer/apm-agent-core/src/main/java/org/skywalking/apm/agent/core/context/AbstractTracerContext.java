package org.skywalking.apm.agent.core.context;

import org.skywalking.apm.agent.core.context.trace.AbstractSpan;

/**
 * The <code>AbstractTracerContext</code> represents the tracer context manager.
 *
 * @author wusheng
 */
public interface AbstractTracerContext {
    void inject(ContextCarrier carrier);

    void extract(ContextCarrier carrier);

    String getGlobalTraceId();

    AbstractSpan createSpan(String operationName, boolean isLeaf);

    AbstractSpan createSpan(String operationName, long startTime, boolean isLeaf);

    AbstractSpan activeSpan();

    void stopSpan(AbstractSpan span);

    void stopSpan(AbstractSpan span, Long endTime);

    void dispose();
}
