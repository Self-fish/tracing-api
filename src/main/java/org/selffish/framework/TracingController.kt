package org.selffish.framework

import org.selffish.domain.entities.Trace
import org.selffish.domain.usecases.AddTraceUseCase
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("tracing")
class TracingController(private val addTrace: AddTraceUseCase) {

    @RequestMapping(method = [RequestMethod.POST], consumes = [MediaType.APPLICATION_JSON_VALUE])
    fun create(@RequestBody trace: Trace): Trace {
        return addTrace.create(trace)
    }

}