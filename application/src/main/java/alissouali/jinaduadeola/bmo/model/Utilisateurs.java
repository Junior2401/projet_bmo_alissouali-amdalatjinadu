/**
 * 
 */
package alissouali.jinaduadeola.bmo.model;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

/**
 * @author Superadmin
 *
 */

@Entity
@Getter @Setter

abstract public class Utilisateurs {

	@Id
	@Hidden
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(length=50)
    @Required
	private String nom;
	
	@Column(length=50)
    @Required
    private String prenom;
	
	
    private String email;
    
    @OneToOne
    private Address adresse;
    
	@Column(length=50)
    @Hidden
    private Boolean loginStatus = false;

}
