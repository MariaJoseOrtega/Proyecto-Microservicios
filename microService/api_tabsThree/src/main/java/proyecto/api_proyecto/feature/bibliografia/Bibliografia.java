package proyecto.api_proyecto.feature.bibliografia;

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
@Table("bibliografia")
public class Bibliografia {
    
    @Id
    @Column("id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long bibliografiaId;
    @Column("num_estrategia")
    private String numEstrategia;
    @Column("estrategias_estrategia")
    private String estrategias;
    @Column("num_bibliografia")
    private String numBibliografia;
    @Column("bibliografias_bibliografia")
    private String bibliografias;

}
