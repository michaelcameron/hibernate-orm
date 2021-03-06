//$Id$
package org.hibernate.ejb.test.pack.defaultpar_1_0;
import javax.persistence.ExcludeDefaultListeners;

/**
 * @author Emmanuel Bernard
 */
@ExcludeDefaultListeners
public class Mouse1 {
	private Integer id;
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}