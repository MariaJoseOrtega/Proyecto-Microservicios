package proyecto.api_proyecto.feature.observaciones;

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
@Table("observaciones")
public class Observaciones {
    
    @Id
    @Column("id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long observacionesId;
    @Column("estado")
    private String estado;
    @Column("observaciones")
    private String observacioness;

}
