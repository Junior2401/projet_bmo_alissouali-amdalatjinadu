package alissouali.jinaduadeola.bmo.model;

import java.math.*;
import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter
public class Parieurs extends Utilisateurs {
    
    @Id
    @Hidden
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(length=7)
    @Required
    private BigDecimal portefeuille;
    
    @OneToMany(mappedBy = "parieurs")
    Collection<Paris> paris;
}
