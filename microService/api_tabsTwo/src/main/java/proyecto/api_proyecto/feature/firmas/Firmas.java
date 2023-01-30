package proyecto.api_proyecto.feature.firmas;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import lombok.Data;

@Data
@Table("firmas")
@Entity
public class Firmas {
    
    @Id
    @Column("id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long firmasId;
    @Column("numero")
    private String numero;
    @Column("cargo")
    private String cargo;
    @Column("nombre")
    private String nombre;
    @Column("cedula")
    private String cedula;

}
