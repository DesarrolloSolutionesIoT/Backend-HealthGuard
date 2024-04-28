package pe.edu.upc.healthguard.patient_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.healthguard.patient_service.model.entites.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    // Aquí puedes añadir métodos personalizados si es necesario
}

