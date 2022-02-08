package org.selffish.domain.entities

data class Trace(val type: TraceType, val id: Int, val start: Long, val finish: Long)

enum class TraceType {
    COVER_MOTOR,
    FILL_BOMB,
    LIGHTS
}