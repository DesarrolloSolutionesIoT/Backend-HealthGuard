package pe.edu.upc.healthguard.measurement_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.healthguard.measurement_service.model.entities.Measurement;

public interface MeasurementRepository extends JpaRepository<Measurement, Long> {
    // Aquí puedes añadir métodos personalizados si es necesario
}
