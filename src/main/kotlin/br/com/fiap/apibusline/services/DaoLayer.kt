package br.com.fiap.apibusline.services

import br.com.fiap.apibusline.schemas.Bus
import br.com.fiap.apibusline.schemas.User
import org.springframework.data.mongodb.repository.MongoRepository

interface UserDAO : MongoRepository<User, String>
interface BusDAO : MongoRepository<Bus, String>
