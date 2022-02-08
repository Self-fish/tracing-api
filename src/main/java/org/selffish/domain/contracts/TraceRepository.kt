package org.selffish.domain.contracts

import org.selffish.domain.entities.Trace

interface TraceRepository {
    fun insert(trace: Trace): Trace
}