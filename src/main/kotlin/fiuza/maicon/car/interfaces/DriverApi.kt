package fiuza.maicon.car.interfaces

import fiuza.maicon.car.domain.Driver
import fiuza.maicon.car.domain.DriverRepository
import org.springframework.http.MediaType
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Service
@RestController
@RequestMapping("/drivers", produces = [MediaType.APPLICATION_JSON_VALUE])
class DriverApi(
    val driverRepository: DriverRepository
) {
    @GetMapping
    fun listDriver() : List<Driver> = driverRepository.findAll();

    @GetMapping("{id}")
    fun listDriverById(@PathVariable id: Long) : Driver = driverRepository.findById(id).orElseThrow()

}