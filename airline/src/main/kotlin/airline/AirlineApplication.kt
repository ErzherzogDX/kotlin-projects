package airline

import airline.api.AirlineConfig
import airline.api.AudioAlerts
import airline.api.InformationDisplay
import airline.service.AirlineManagementService
import airline.service.BookingService
import airline.service.EmailService
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.StateFlow

class AirlineApplication(config: AirlineConfig, emailService: EmailService) {
    val bookingService: BookingService = TODO()

    val managementService: AirlineManagementService = TODO()

    fun airportInformationDisplay(coroutineScope: CoroutineScope): StateFlow<InformationDisplay> {
        TODO()
    }

    val airportAudioAlerts: Flow<AudioAlerts> = TODO()

    suspend fun run() {}
}
