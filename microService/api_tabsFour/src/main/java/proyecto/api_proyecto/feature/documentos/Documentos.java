package proyecto.api_proyecto.feature.documentos;

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
@Table("documentos")
public class Documentos {
    
    @Id
    @Column("id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long documentosId;
    @Column("documentos_adjuntos")
    private String documentosA;

}
