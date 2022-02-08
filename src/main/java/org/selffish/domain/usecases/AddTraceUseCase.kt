package org.selffish.domain.usecases

import org.selffish.domain.contracts.TraceRepository
import org.selffish.domain.entities.Trace
import org.springframework.stereotype.Service

@Service
class AddTraceUseCase(private val repository: TraceRepository) {

    fun create(trace: Trace): Trace {
        return repository.insert(trace)
    }
}