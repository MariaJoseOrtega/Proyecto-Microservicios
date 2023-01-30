package proyecto.api_proyecto.feature.plan_de_trabajo;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name = "plan_de_trabajo")
@Entity
public class PlanDeTrabajo {
    
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long planTrabajoId;

    @Column(name = "descripcion_general")
    private String descripcionGe;

    @Column(name =  "objetivo_proyecto")
    private String objetivoPro;

    @Column(name =  "analisis_situacional")
    private String analisisSi;

    @Column(name =  "justificacion")
    private String justificacion;

    @Column(name = "num_objetivos")
    private String numObjetivos;

    @Column(name =  "nombre_objetivos")
    private String nombreOb;

    @Column(name =  "objetivo_objetivos")
    private String objetivoOb;

    @Column(name =  "indicador_objetivos")
    private String indicadorOb;

    @Column(name =  "metodos_objetivos")
    private String metodosOb;

    @Column(name =  "num_criterios")
    private String numCriterios;

    @Column(name =  "nombre_criterios")
    private String nombreCriterios;

    @Column(name =  "criterio_criterios")
    private String criterioCriterios;

    @Column(name =  "objetivos_especificos")
    private String objetivosEs;

    @Column(name =  "indicadores_verificables")
    private String indicadoresVe;

    @Column(name =  "medios_verificacion")
    private String mediosVe;

    @Column(name =  "conclusiones")
    private String conclusiones;

    @Column(name =  "recomendaciones")
    private String recomendaciones;

}
