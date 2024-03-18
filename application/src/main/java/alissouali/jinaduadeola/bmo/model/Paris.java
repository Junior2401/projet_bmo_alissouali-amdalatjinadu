/**
 * 
 */
package alissouali.jinaduadeola.bmo.model;

import java.math.*;
import java.time.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.calculators.*;

import lombok.*;

/**
 * @author Superadmin
 *
 */

@Entity
@Getter @Setter
public class Paris {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Hidden
    private Long id;

    // Date du pari
    @DefaultValueCalculator(CurrentLocalDateCalculator.class) // Date actuelle par défaut
    private LocalDate date;

    // Montant du pari
    @Column(length=8)
    @Required
    private BigDecimal montant;

    // Résultat du pari
    @Column(length=50)
    @Required 
    private String resultat;

    // Statut du pari
    @Column(length=50)
    @Required  
    private String statutParis="En cours";

    // Parieur associé à ce pari
    @ManyToOne(fetch=FetchType.LAZY, optional=false)
    private Parieurs parieurs;

    // Événement associé à ce pari
    @ManyToOne(fetch=FetchType.LAZY, optional=false)
    private Evenements evenements;

    // Type de pari associé à ce pari
    @ManyToOne(fetch=FetchType.LAZY, optional=false)
    private TypeParis typeparis;
	
}
