package proyecto.api_proyecto.feature.actividades;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import lombok.Data;

@Data
@Table("actividades")
@Entity
public class Actividades {
    
    @Id
    @Column("id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long actividadesId;

    @Column("frecuencia")
    private String frecuencia;

    @Column("sectores")
    private String sectores;

    @Column("vinculacion")
    private String vinculacion;

    @Column("ejes")
    private String ejes;
    
}
