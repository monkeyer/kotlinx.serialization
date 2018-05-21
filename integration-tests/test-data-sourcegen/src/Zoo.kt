/*
 * Copyright 2018 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * Copyright 2018 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Auto-generated file, do not modify!
import kotlin.Boolean
import kotlin.Byte
import kotlin.Char
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Short
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.Set
import kotlinx.serialization.KInput
import kotlinx.serialization.KOutput
import kotlinx.serialization.KSerializer
import kotlinx.serialization.MissingFieldException
import kotlinx.serialization.SerialDescriptor
import kotlinx.serialization.internal.ArrayListSerializer
import kotlinx.serialization.internal.BooleanSerializer
import kotlinx.serialization.internal.ByteSerializer
import kotlinx.serialization.internal.CharSerializer
import kotlinx.serialization.internal.DoubleSerializer
import kotlinx.serialization.internal.FloatSerializer
import kotlinx.serialization.internal.IntSerializer
import kotlinx.serialization.internal.LinkedHashMapSerializer
import kotlinx.serialization.internal.LinkedHashSetSerializer
import kotlinx.serialization.internal.LongSerializer
import kotlinx.serialization.internal.ModernEnumSerializer
import kotlinx.serialization.internal.NullableSerializer
import kotlinx.serialization.internal.SerialClassDescImplTagged
import kotlinx.serialization.internal.ShortSerializer
import kotlinx.serialization.internal.StringSerializer

enum class Attitude {
    POSITIVE,

    NEUTRAL,

    NEGATIVE
}

data class Simple(val a: String) {
    @Suppress("NAME_SHADOWING")
    object serializer : KSerializer<Simple> {
        override val serialClassDesc: SerialDescriptor =
                object : SerialClassDescImplTagged("Simple") {
            init {
                addElement("a")
            }
        }

        override fun serialize(output: KOutput, obj: Simple) {
            val output = output.writeBegin(serialClassDesc)
            output.writeStringElementValue(serialClassDesc, 0, obj.a)
            output.writeEnd(serialClassDesc)
        }

        override fun deserialize(input: KInput): Simple {
            val input = input.readBegin(serialClassDesc)
            var local0: String? = null
            var bitMask: Int = 0
            mainLoop@while (true) {
                val idx = input.readElement(serialClassDesc)
                when (idx) {
                    -1 -> {
                        break@mainLoop
                    }
                    0 -> {
                        local0 = input.readStringElementValue(serialClassDesc, 0)
                        bitMask = bitMask or 1
                    }
                }
            }
            input.readEnd(serialClassDesc)
            if (bitMask and 1 == 0) {
                throw MissingFieldException("a")
            }
            return Simple(local0!!)
        }
    }
    companion object {
        fun serializer() = serializer
    }
}

data class SmallZoo(
        val str: String,
        val i: Int,
        val nullable: Double?,
        val list: List<Int>,
        val map: Map<Int, Boolean>,
        val inner: SmallZoo,
        val innerList: List<Simple>
) {
    @Suppress("NAME_SHADOWING")
    object serializer : KSerializer<SmallZoo> {
        override val serialClassDesc: SerialDescriptor =
                object : SerialClassDescImplTagged("SmallZoo") {
            init {
                addElement("str")
                addElement("i")
                addElement("nullable")
                addElement("list")
                addElement("map")
                addElement("inner")
                addElement("innerList")
            }
        }

        override fun serialize(output: KOutput, obj: SmallZoo) {
            val output = output.writeBegin(serialClassDesc)
            output.writeStringElementValue(serialClassDesc, 0, obj.str)
            output.writeIntElementValue(serialClassDesc, 1, obj.i)
            output.writeNullableSerializableElementValue(serialClassDesc, 2, NullableSerializer(DoubleSerializer), obj.nullable)
            output.writeSerializableElementValue(serialClassDesc, 3, ArrayListSerializer(IntSerializer), obj.list)
            output.writeSerializableElementValue(serialClassDesc, 4, LinkedHashMapSerializer(IntSerializer, BooleanSerializer), obj.map)
            output.writeSerializableElementValue(serialClassDesc, 5, serializer, obj.inner)
            output.writeSerializableElementValue(serialClassDesc, 6, ArrayListSerializer(Simple.serializer), obj.innerList)
            output.writeEnd(serialClassDesc)
        }

        override fun deserialize(input: KInput): SmallZoo {
            val input = input.readBegin(serialClassDesc)
            var local0: String? = null
            var local1: Int? = null
            var local2: Double? = null
            var local3: List<Int>? = null
            var local4: Map<Int, Boolean>? = null
            var local5: SmallZoo? = null
            var local6: List<Simple>? = null
            var bitMask: Int = 0
            mainLoop@while (true) {
                val idx = input.readElement(serialClassDesc)
                when (idx) {
                    -1 -> {
                        break@mainLoop
                    }
                    0 -> {
                        local0 = input.readStringElementValue(serialClassDesc, 0)
                        bitMask = bitMask or 1
                    }
                    1 -> {
                        local1 = input.readIntElementValue(serialClassDesc, 1)
                        bitMask = bitMask or 2
                    }
                    2 -> {
                        local2 = input.readNullableSerializableElementValue(serialClassDesc, 2, NullableSerializer(DoubleSerializer))
                        bitMask = bitMask or 4
                    }
                    3 -> {
                        local3 = input.readSerializableElementValue(serialClassDesc, 3, ArrayListSerializer(IntSerializer))
                        bitMask = bitMask or 8
                    }
                    4 -> {
                        local4 = input.readSerializableElementValue(serialClassDesc, 4, LinkedHashMapSerializer(IntSerializer, BooleanSerializer))
                        bitMask = bitMask or 16
                    }
                    5 -> {
                        local5 = input.readSerializableElementValue(serialClassDesc, 5, serializer)
                        bitMask = bitMask or 32
                    }
                    6 -> {
                        local6 = input.readSerializableElementValue(serialClassDesc, 6, ArrayListSerializer(Simple.serializer))
                        bitMask = bitMask or 64
                    }
                }
            }
            input.readEnd(serialClassDesc)
            if (bitMask and 1 == 0) {
                throw MissingFieldException("str")
            }
            if (bitMask and 2 == 0) {
                throw MissingFieldException("i")
            }
            if (bitMask and 4 == 0) {
                throw MissingFieldException("nullable")
            }
            if (bitMask and 8 == 0) {
                throw MissingFieldException("list")
            }
            if (bitMask and 16 == 0) {
                throw MissingFieldException("map")
            }
            if (bitMask and 32 == 0) {
                throw MissingFieldException("inner")
            }
            if (bitMask and 64 == 0) {
                throw MissingFieldException("innerList")
            }
            return SmallZoo(local0!!, local1!!, local2, local3!!, local4!!, local5!!, local6!!)
        }
    }
    companion object {
        fun serializer() = serializer
    }
}

data class Zoo(
        val unit: Unit,
        val boolean: Boolean,
        val byte: Byte,
        val short: Short,
        val int: Int,
        val long: Long,
        val float: Float,
        val double: Double,
        val char: Char,
        val string: String,
        val simple: Simple,
        val enum: Attitude,
        val booleanN: Boolean?,
        val byteN: Byte?,
        val shortN: Short?,
        val intN: Int?,
        val longN: Long?,
        val floatN: Float?,
        val doubleN: Double?,
        val charN: Char?,
        val stringN: String?,
        val simpleN: Simple?,
        val enumN: Attitude?,
        val listInt: List<Int>,
        val listIntN: List<Int?>,
        val setNInt: Set<Int>,
        val mutableSetNIntN: Set<Int?>,
        val listListSimple: List<List<Simple>>,
        val listListSimpleN: List<List<Simple?>>,
        val map: Map<String, Int>,
        val mapN: Map<Int, String?>
) {
    @Suppress("NAME_SHADOWING")
    object serializer : KSerializer<Zoo> {
        override val serialClassDesc: SerialDescriptor = object : SerialClassDescImplTagged("Zoo") {
            init {
                addElement("unit")
                addElement("boolean")
                addElement("byte")
                addElement("short")
                addElement("int")
                addElement("long")
                addElement("float")
                addElement("double")
                addElement("char")
                addElement("string")
                addElement("simple")
                addElement("enum")
                addElement("booleanN")
                addElement("byteN")
                addElement("shortN")
                addElement("intN")
                addElement("longN")
                addElement("floatN")
                addElement("doubleN")
                addElement("charN")
                addElement("stringN")
                addElement("simpleN")
                addElement("enumN")
                addElement("listInt")
                addElement("listIntN")
                addElement("setNInt")
                addElement("mutableSetNIntN")
                addElement("listListSimple")
                addElement("listListSimpleN")
                addElement("map")
                addElement("mapN")
            }
        }

        override fun serialize(output: KOutput, obj: Zoo) {
            val output = output.writeBegin(serialClassDesc)
            output.writeUnitElementValue(serialClassDesc, 0)
            output.writeBooleanElementValue(serialClassDesc, 1, obj.boolean)
            output.writeByteElementValue(serialClassDesc, 2, obj.byte)
            output.writeShortElementValue(serialClassDesc, 3, obj.short)
            output.writeIntElementValue(serialClassDesc, 4, obj.int)
            output.writeLongElementValue(serialClassDesc, 5, obj.long)
            output.writeSerializableElementValue(serialClassDesc, 6, FloatSerializer, obj.float)
            output.writeSerializableElementValue(serialClassDesc, 7, DoubleSerializer, obj.double)
            output.writeCharElementValue(serialClassDesc, 8, obj.char)
            output.writeStringElementValue(serialClassDesc, 9, obj.string)
            output.writeSerializableElementValue(serialClassDesc, 10, Simple.serializer, obj.simple)
            output.writeSerializableElementValue(serialClassDesc, 11, ModernEnumSerializer<Attitude>(), obj.enum)
            output.writeNullableSerializableElementValue(serialClassDesc, 12, NullableSerializer(BooleanSerializer), obj.booleanN)
            output.writeNullableSerializableElementValue(serialClassDesc, 13, NullableSerializer(ByteSerializer), obj.byteN)
            output.writeNullableSerializableElementValue(serialClassDesc, 14, NullableSerializer(ShortSerializer), obj.shortN)
            output.writeNullableSerializableElementValue(serialClassDesc, 15, NullableSerializer(IntSerializer), obj.intN)
            output.writeNullableSerializableElementValue(serialClassDesc, 16, NullableSerializer(LongSerializer), obj.longN)
            output.writeNullableSerializableElementValue(serialClassDesc, 17, NullableSerializer(FloatSerializer), obj.floatN)
            output.writeNullableSerializableElementValue(serialClassDesc, 18, NullableSerializer(DoubleSerializer), obj.doubleN)
            output.writeNullableSerializableElementValue(serialClassDesc, 19, NullableSerializer(CharSerializer), obj.charN)
            output.writeNullableSerializableElementValue(serialClassDesc, 20, NullableSerializer(StringSerializer), obj.stringN)
            output.writeNullableSerializableElementValue(serialClassDesc, 21, NullableSerializer(Simple.serializer), obj.simpleN)
            output.writeNullableSerializableElementValue(serialClassDesc, 22, NullableSerializer(ModernEnumSerializer<Attitude>()), obj.enumN)
            output.writeSerializableElementValue(serialClassDesc, 23, ArrayListSerializer(IntSerializer), obj.listInt)
            output.writeSerializableElementValue(serialClassDesc, 24, ArrayListSerializer(NullableSerializer(IntSerializer)), obj.listIntN)
            output.writeSerializableElementValue(serialClassDesc, 25, LinkedHashSetSerializer(IntSerializer), obj.setNInt)
            output.writeSerializableElementValue(serialClassDesc, 26, LinkedHashSetSerializer(NullableSerializer(IntSerializer)), obj.mutableSetNIntN)
            output.writeSerializableElementValue(serialClassDesc, 27, ArrayListSerializer(ArrayListSerializer(Simple.serializer)), obj.listListSimple)
            output.writeSerializableElementValue(serialClassDesc, 28, ArrayListSerializer(ArrayListSerializer(NullableSerializer(Simple.serializer))), obj.listListSimpleN)
            output.writeSerializableElementValue(serialClassDesc, 29, LinkedHashMapSerializer(StringSerializer, IntSerializer), obj.map)
            output.writeSerializableElementValue(serialClassDesc, 30, LinkedHashMapSerializer(IntSerializer, NullableSerializer(StringSerializer)), obj.mapN)
            output.writeEnd(serialClassDesc)
        }

        override fun deserialize(input: KInput): Zoo {
            val input = input.readBegin(serialClassDesc)
            var local0: Unit? = null
            var local1: Boolean? = null
            var local2: Byte? = null
            var local3: Short? = null
            var local4: Int? = null
            var local5: Long? = null
            var local6: Float? = null
            var local7: Double? = null
            var local8: Char? = null
            var local9: String? = null
            var local10: Simple? = null
            var local11: Attitude? = null
            var local12: Boolean? = null
            var local13: Byte? = null
            var local14: Short? = null
            var local15: Int? = null
            var local16: Long? = null
            var local17: Float? = null
            var local18: Double? = null
            var local19: Char? = null
            var local20: String? = null
            var local21: Simple? = null
            var local22: Attitude? = null
            var local23: List<Int>? = null
            var local24: List<Int?>? = null
            var local25: Set<Int>? = null
            var local26: Set<Int?>? = null
            var local27: List<List<Simple>>? = null
            var local28: List<List<Simple?>>? = null
            var local29: Map<String, Int>? = null
            var local30: Map<Int, String?>? = null
            var bitMask: Int = 0
            mainLoop@while (true) {
                val idx = input.readElement(serialClassDesc)
                when (idx) {
                    -1 -> {
                        break@mainLoop
                    }
                    0 -> {
                        local0 = input.readUnitElementValue(serialClassDesc, 0)
                        bitMask = bitMask or 1
                    }
                    1 -> {
                        local1 = input.readBooleanElementValue(serialClassDesc, 1)
                        bitMask = bitMask or 2
                    }
                    2 -> {
                        local2 = input.readByteElementValue(serialClassDesc, 2)
                        bitMask = bitMask or 4
                    }
                    3 -> {
                        local3 = input.readShortElementValue(serialClassDesc, 3)
                        bitMask = bitMask or 8
                    }
                    4 -> {
                        local4 = input.readIntElementValue(serialClassDesc, 4)
                        bitMask = bitMask or 16
                    }
                    5 -> {
                        local5 = input.readLongElementValue(serialClassDesc, 5)
                        bitMask = bitMask or 32
                    }
                    6 -> {
                        local6 = input.readSerializableElementValue(serialClassDesc, 6, FloatSerializer)
                        bitMask = bitMask or 64
                    }
                    7 -> {
                        local7 = input.readSerializableElementValue(serialClassDesc, 7, DoubleSerializer)
                        bitMask = bitMask or 128
                    }
                    8 -> {
                        local8 = input.readCharElementValue(serialClassDesc, 8)
                        bitMask = bitMask or 256
                    }
                    9 -> {
                        local9 = input.readStringElementValue(serialClassDesc, 9)
                        bitMask = bitMask or 512
                    }
                    10 -> {
                        local10 = input.readSerializableElementValue(serialClassDesc, 10, Simple.serializer)
                        bitMask = bitMask or 1024
                    }
                    11 -> {
                        local11 = input.readSerializableElementValue(serialClassDesc, 11, ModernEnumSerializer<Attitude>())
                        bitMask = bitMask or 2048
                    }
                    12 -> {
                        local12 = input.readNullableSerializableElementValue(serialClassDesc, 12, NullableSerializer(BooleanSerializer))
                        bitMask = bitMask or 4096
                    }
                    13 -> {
                        local13 = input.readNullableSerializableElementValue(serialClassDesc, 13, NullableSerializer(ByteSerializer))
                        bitMask = bitMask or 8192
                    }
                    14 -> {
                        local14 = input.readNullableSerializableElementValue(serialClassDesc, 14, NullableSerializer(ShortSerializer))
                        bitMask = bitMask or 16384
                    }
                    15 -> {
                        local15 = input.readNullableSerializableElementValue(serialClassDesc, 15, NullableSerializer(IntSerializer))
                        bitMask = bitMask or 32768
                    }
                    16 -> {
                        local16 = input.readNullableSerializableElementValue(serialClassDesc, 16, NullableSerializer(LongSerializer))
                        bitMask = bitMask or 65536
                    }
                    17 -> {
                        local17 = input.readNullableSerializableElementValue(serialClassDesc, 17, NullableSerializer(FloatSerializer))
                        bitMask = bitMask or 131072
                    }
                    18 -> {
                        local18 = input.readNullableSerializableElementValue(serialClassDesc, 18, NullableSerializer(DoubleSerializer))
                        bitMask = bitMask or 262144
                    }
                    19 -> {
                        local19 = input.readNullableSerializableElementValue(serialClassDesc, 19, NullableSerializer(CharSerializer))
                        bitMask = bitMask or 524288
                    }
                    20 -> {
                        local20 = input.readNullableSerializableElementValue(serialClassDesc, 20, NullableSerializer(StringSerializer))
                        bitMask = bitMask or 1048576
                    }
                    21 -> {
                        local21 = input.readNullableSerializableElementValue(serialClassDesc, 21, NullableSerializer(Simple.serializer))
                        bitMask = bitMask or 2097152
                    }
                    22 -> {
                        local22 = input.readNullableSerializableElementValue(serialClassDesc, 22, NullableSerializer(ModernEnumSerializer<Attitude>()))
                        bitMask = bitMask or 4194304
                    }
                    23 -> {
                        local23 = input.readSerializableElementValue(serialClassDesc, 23, ArrayListSerializer(IntSerializer))
                        bitMask = bitMask or 8388608
                    }
                    24 -> {
                        local24 = input.readSerializableElementValue(serialClassDesc, 24, ArrayListSerializer(NullableSerializer(IntSerializer)))
                        bitMask = bitMask or 16777216
                    }
                    25 -> {
                        local25 = input.readSerializableElementValue(serialClassDesc, 25, LinkedHashSetSerializer(IntSerializer))
                        bitMask = bitMask or 33554432
                    }
                    26 -> {
                        local26 = input.readSerializableElementValue(serialClassDesc, 26, LinkedHashSetSerializer(NullableSerializer(IntSerializer)))
                        bitMask = bitMask or 67108864
                    }
                    27 -> {
                        local27 = input.readSerializableElementValue(serialClassDesc, 27, ArrayListSerializer(ArrayListSerializer(Simple.serializer)))
                        bitMask = bitMask or 134217728
                    }
                    28 -> {
                        local28 = input.readSerializableElementValue(serialClassDesc, 28, ArrayListSerializer(ArrayListSerializer(NullableSerializer(Simple.serializer))))
                        bitMask = bitMask or 268435456
                    }
                    29 -> {
                        local29 = input.readSerializableElementValue(serialClassDesc, 29, LinkedHashMapSerializer(StringSerializer, IntSerializer))
                        bitMask = bitMask or 536870912
                    }
                    30 -> {
                        local30 = input.readSerializableElementValue(serialClassDesc, 30, LinkedHashMapSerializer(IntSerializer, NullableSerializer(StringSerializer)))
                        bitMask = bitMask or 1073741824
                    }
                }
            }
            input.readEnd(serialClassDesc)
            if (bitMask and 1 == 0) {
                throw MissingFieldException("unit")
            }
            if (bitMask and 2 == 0) {
                throw MissingFieldException("boolean")
            }
            if (bitMask and 4 == 0) {
                throw MissingFieldException("byte")
            }
            if (bitMask and 8 == 0) {
                throw MissingFieldException("short")
            }
            if (bitMask and 16 == 0) {
                throw MissingFieldException("int")
            }
            if (bitMask and 32 == 0) {
                throw MissingFieldException("long")
            }
            if (bitMask and 64 == 0) {
                throw MissingFieldException("float")
            }
            if (bitMask and 128 == 0) {
                throw MissingFieldException("double")
            }
            if (bitMask and 256 == 0) {
                throw MissingFieldException("char")
            }
            if (bitMask and 512 == 0) {
                throw MissingFieldException("string")
            }
            if (bitMask and 1024 == 0) {
                throw MissingFieldException("simple")
            }
            if (bitMask and 2048 == 0) {
                throw MissingFieldException("enum")
            }
            if (bitMask and 4096 == 0) {
                throw MissingFieldException("booleanN")
            }
            if (bitMask and 8192 == 0) {
                throw MissingFieldException("byteN")
            }
            if (bitMask and 16384 == 0) {
                throw MissingFieldException("shortN")
            }
            if (bitMask and 32768 == 0) {
                throw MissingFieldException("intN")
            }
            if (bitMask and 65536 == 0) {
                throw MissingFieldException("longN")
            }
            if (bitMask and 131072 == 0) {
                throw MissingFieldException("floatN")
            }
            if (bitMask and 262144 == 0) {
                throw MissingFieldException("doubleN")
            }
            if (bitMask and 524288 == 0) {
                throw MissingFieldException("charN")
            }
            if (bitMask and 1048576 == 0) {
                throw MissingFieldException("stringN")
            }
            if (bitMask and 2097152 == 0) {
                throw MissingFieldException("simpleN")
            }
            if (bitMask and 4194304 == 0) {
                throw MissingFieldException("enumN")
            }
            if (bitMask and 8388608 == 0) {
                throw MissingFieldException("listInt")
            }
            if (bitMask and 16777216 == 0) {
                throw MissingFieldException("listIntN")
            }
            if (bitMask and 33554432 == 0) {
                throw MissingFieldException("setNInt")
            }
            if (bitMask and 67108864 == 0) {
                throw MissingFieldException("mutableSetNIntN")
            }
            if (bitMask and 134217728 == 0) {
                throw MissingFieldException("listListSimple")
            }
            if (bitMask and 268435456 == 0) {
                throw MissingFieldException("listListSimpleN")
            }
            if (bitMask and 536870912 == 0) {
                throw MissingFieldException("map")
            }
            if (bitMask and 1073741824 == 0) {
                throw MissingFieldException("mapN")
            }
            return Zoo(local0!!, local1!!, local2!!, local3!!, local4!!, local5!!, local6!!, local7!!, local8!!, local9!!, local10!!, local11!!, local12, local13, local14, local15, local16, local17, local18, local19, local20, local21, local22, local23!!, local24!!, local25!!, local26!!, local27!!, local28!!, local29!!, local30!!)
        }
    }
    companion object {
        fun serializer() = serializer
    }
}
