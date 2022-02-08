package org.selffish.adapters.database

import org.selffish.domain.entities.Trace
import org.springframework.data.mongodb.repository.MongoRepository

interface TraceDataBase: MongoRepository<Trace, String>