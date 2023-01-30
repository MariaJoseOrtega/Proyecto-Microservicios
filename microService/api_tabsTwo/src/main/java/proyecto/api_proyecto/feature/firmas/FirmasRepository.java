package proyecto.api_proyecto.feature.firmas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface FirmasRepository extends JpaRepository<Firmas, Long> {
    
}