/**
 * 
 */
package alissouali.jinaduadeola.bmo.model;

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
public class TypeParis {
	@Id
	@Hidden
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(length=50)
    @Required
    private String libelle;
	
	@Column(length=50)
    @Required 
    private String description;
	
    @OneToMany(mappedBy = "typeparis")
    Collection<Paris> paris;
}
