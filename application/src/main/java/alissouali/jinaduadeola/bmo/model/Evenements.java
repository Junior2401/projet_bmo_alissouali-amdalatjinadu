/**
 * 
 */
package alissouali.jinaduadeola.bmo.model;

import java.math.*;
import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

/**
 * @author Superadmin
 *
 */
@Entity
@Getter @Setter
public class Evenements {
	
    @Id
    @Hidden
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(length=50)
    @Required 
    private String intitule;
	
	@Column(length=5) 
    private BigDecimal cotes;
	
	@Column(length=50)
    private String options;
	
	@ManyToOne(fetch=FetchType.LAZY, optional=true)
    TypeSports typesports;
	
	@ManyToOne(fetch=FetchType.LAZY, optional=true)
    BookMakers bookmakers;
    
    @OneToMany(mappedBy = "evenements")
    Collection<Paris> paris;

}
