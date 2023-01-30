package proyecto.api_proyecto.feature.actividades;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


public interface ActividadesRepository extends JpaRepository<Actividades, Long> {
    
}