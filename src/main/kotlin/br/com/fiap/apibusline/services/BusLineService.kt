package br.com.fiap.apibusline.services

import br.com.fiap.apibusline.schemas.Bus
import br.com.fiap.apibusline.utils.BasicCrud
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.stereotype.Service
import java.util.*

@Service
class BusLineService(val busLineDAO: BusDAO) : BasicCrud<String, Bus> {

    override fun getAll(pageable: Pageable): Page<Bus> = busLineDAO.findAll(pageable)

    override fun getById(id: String): Optional<Bus> = busLineDAO.findById(id)

    override fun insert(obj: Bus): Bus = busLineDAO.insert(obj)

    override fun update(obj: Bus): Bus = busLineDAO.save(obj)

    override fun deleteById(id: String): Optional<Bus> {
        return busLineDAO.findById(id).apply {
            this.ifPresent {
                busLineDAO.deleteById(id)
            }
        }
    }

}
