package com.iroyo.comicville.network.serializers

import kotlinx.serialization.Decoder
import kotlinx.serialization.Encoder
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialDescriptor
import kotlinx.serialization.internal.StringDescriptor
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*

/**
 * DOONAMIS
 * Created by iroyo on 2019-09-10.
 */
object DateSerializer : KSerializer<Date?> {

    private val dateFormat: DateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US)

    override val descriptor: SerialDescriptor = StringDescriptor

    override fun deserialize(decoder: Decoder): Date? {
        return dateFormat.parse(decoder.decodeString())
    }

    override fun serialize(encoder: Encoder, obj: Date?) {
        encoder.encodeString(dateFormat.format(obj))
    }
}