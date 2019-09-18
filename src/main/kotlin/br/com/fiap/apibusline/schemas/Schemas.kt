package br.com.fiap.apibusline.schemas

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class User(
        @Id val id: String? = null,
        val name: String,
        val login: String,
        val email: String
)

@Document
data class Bus(
        @Id val id: String? = null,
        val busLine: Number,
        val line: MutableList<String>
)
