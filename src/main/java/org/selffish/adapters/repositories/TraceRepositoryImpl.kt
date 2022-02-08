package org.selffish.adapters.repositories

import org.selffish.adapters.database.TraceDataBase
import org.selffish.domain.contracts.TraceRepository
import org.selffish.domain.entities.Trace
import org.springframework.stereotype.Component

@Component
class TraceRepositoryImpl(private val dataBase: TraceDataBase): TraceRepository{
    override fun insert(trace: Trace): Trace = dataBase.insert(trace)
}