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
public class Address {
    @Id
    @Hidden
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	
	@Column(length=50)  // The column length is used at the UI level and the DB level
    @Required  // A validation error will be shown if the name property is left empty
    private String rue;
	
	
	@Column(length=50)  // The column length is used at the UI level and the DB level
    @Required  // A validation error will be shown if the name property is left empty
    private String ville;
	
	
	@Column(length=50)  // The column length is used at the UI level and the DB level
    @Required  // A validation error will be shown if the name property is left empty
    private String codePostal;
}
