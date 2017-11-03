package com.jj.commutejourney.model

import android.os.Parcelable
import com.google.auto.value.AutoValue


@AutoValue
abstract class BusStop : Parcelable {
    abstract fun name(): String
    abstract fun atcocode(): String
    abstract fun latitude(): Double
    abstract fun longitude(): Double

    companion object {
        fun create(name: String, atcocode: String, latitude: Double, longitude: Double) = builder()
                    .name(name)
                    .atcocode(atcocode)
                    .latitude(latitude)
                    .longitude(longitude)
                    .build()

        fun builder(): Builder = `$AutoValue_BusStop`.Builder()
    }

    @AutoValue.Builder
    interface Builder {
        fun name(x: String): Builder
        fun atcocode(x: String): Builder
        fun latitude(x: Double): Builder
        fun longitude(x: Double): Builder
        fun build(): BusStop
    }
}
