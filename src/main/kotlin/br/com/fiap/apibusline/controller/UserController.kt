package br.com.fiap.apibusline.controller

import br.com.fiap.apibusline.schemas.User
import br.com.fiap.apibusline.services.UserService
import org.springframework.data.domain.Page
import org.springframework.web.bind.annotation.*
import org.springframework.data.domain.Pageable
import java.util.*

@RestController
@RequestMapping("api/user")//controller root path
class UserController(private val userService: UserService) {

    @GetMapping
    fun getAll(pageable: Pageable): Page<User> = userService.getAll(pageable)

    @GetMapping("{id}")
    fun getById(@PathVariable id: String): Optional<User> = userService.getById(id)

    @PostMapping
    fun insert(@RequestBody bus: User): User = userService.insert(bus)

    @PutMapping
    fun update(@RequestBody bus: User): User = userService.update(bus)

    @DeleteMapping("{id}")
    fun deleteById(@PathVariable id: String): Optional<User> = userService.deleteById(id)

}
