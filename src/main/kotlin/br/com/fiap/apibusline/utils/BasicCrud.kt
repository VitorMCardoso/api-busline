package br.com.fiap.apibusline.utils

import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import java.util.*

interface BasicCrud<K, T> {
    fun getAll(pageable: Pageable): Page<T>
    fun getById(id: K): Optional<T>
    fun insert(obj: T): T
    fun update(obj: T): T
    fun deleteById(id: K): Optional<T>
}
