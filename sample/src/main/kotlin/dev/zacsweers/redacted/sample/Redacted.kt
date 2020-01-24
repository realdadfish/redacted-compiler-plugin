package dev.zacsweers.redacted.sample

import kotlin.annotation.AnnotationRetention.BINARY
import kotlin.annotation.AnnotationTarget.CLASS
import kotlin.annotation.AnnotationTarget.PROPERTY

@Retention(BINARY)
@Target(PROPERTY, CLASS)
annotation class Redacted