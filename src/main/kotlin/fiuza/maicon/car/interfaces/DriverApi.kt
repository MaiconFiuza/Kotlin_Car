package fiuza.maicon.car.interfaces

import fiuza.maicon.car.domain.Driver
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.RestController

@Service
@RestController
class DriverApi {
    fun listDriver() : List<Driver> = emptyList()
}