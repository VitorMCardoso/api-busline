package br.com.fiap.apibusline.controller

import br.com.fiap.apibusline.schemas.Bus
import br.com.fiap.apibusline.services.BusLineService
import org.springframework.data.domain.Page
import org.springframework.web.bind.annotation.*
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import java.util.*

@RestController
@RequestMapping("api/busline")//controller root path
class BusLineController(private val busLineService: BusLineService) {

    @GetMapping
    fun getAll(pageable: Pageable): MutableList<Bus> = busLineService.getAll(pageable).content

    @GetMapping("{id}")
    fun getById(@PathVariable id: String): Optional<Bus> = busLineService.getById(id)

    @PostMapping
    fun insert(@RequestBody bus: Bus): Bus = busLineService.insert(bus)

    @PutMapping
    fun update(@RequestBody bus: Bus): Bus = busLineService.update(bus)

    @DeleteMapping("{id}")
    fun deleteById(@PathVariable id: String): Optional<Bus> = busLineService.deleteById(id)

}
