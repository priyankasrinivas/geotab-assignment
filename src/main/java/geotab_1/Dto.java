/**
 * 
 */
package geotab_1;

/**
 * @author priyankasrinivas
 *
 */
public class Dto {

	  private String name ;
	  private String surname;
	  
	  public Dto(String name, String surname) {
	        this.name = name;
	        this.surname = surname;
	    }
	  @Override
	  public String toString() {
	        return new StringBuilder().append("Dto{").append("name: ")
	                .append(name).append(", surname: ")
	                .append(surname).append("}").toString();
	    }
	  
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the surName
	 */
	public String getSurname() {
		return surname;
	}
	/**
	 * @param surName the surName to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}
	    


}
