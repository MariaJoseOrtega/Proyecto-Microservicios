package proyecto.api_proyecto.feature.certificados;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import lombok.Data;

@Entity
@Data
@Table("certificados")
public class Certificados {
    @Id
    @Column("id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long certificadosId;
    @Column("solicitudes")
    private String solicitudes;
    @Column("portafolio")
    private String portafolio;
}
