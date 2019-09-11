package br.com.fiap.apibusline.services

import br.com.fiap.apibusline.schemas.User
import br.com.fiap.apibusline.utils.BasicCrud
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service
import java.util.*

@Service
class UserService(val userLineDAO: UserDAO) : BasicCrud<String, User> {

    override fun getAll(pageable: Pageable): Page<User> = userLineDAO.findAll(pageable)

    override fun getById(id: String): Optional<User> = userLineDAO.findById(id)

    override fun insert(obj: User): User = userLineDAO.insert(obj)

    override fun update(obj: User): User = userLineDAO.save(obj)

    override fun deleteById(id: String): Optional<User> {
        return userLineDAO.findById(id).apply {
            this.ifPresent {
                userLineDAO.deleteById(id)
            }
        }
    }

}
