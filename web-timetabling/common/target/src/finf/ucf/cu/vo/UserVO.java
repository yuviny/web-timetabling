// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: ValueObject.vsl in andromda-java-cartridge.
//
package finf.ucf.cu.vo;

/**
 * 
 */
public class UserVO
    implements java.io.Serializable
{
    /**
     * The serial version UID of this class. Needed for serialization.
     */
    private static final long serialVersionUID = 1001098440399290858L;

    public UserVO()
    {
    }

    public UserVO(java.lang.Long id, java.lang.String username, java.lang.String firstName, java.lang.String lastName)
    {
        this.id = id;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Copies constructor from other UserVO
     *
     * @param otherBean, cannot be <code>null</code>
     * @throws java.lang.NullPointerException if the argument is <code>null</code>
     */
    public UserVO(UserVO otherBean)
    {
        this(otherBean.getId(), otherBean.getUsername(), otherBean.getFirstName(), otherBean.getLastName());
    }

    /**
     * Copies all properties from the argument value object into this value object.
     */
    public void copy(UserVO otherBean)
    {
        if (otherBean != null)
        {
            this.setId(otherBean.getId());
            this.setUsername(otherBean.getUsername());
            this.setFirstName(otherBean.getFirstName());
            this.setLastName(otherBean.getLastName());
        }
    }

    private java.lang.Long id;

    /**
     * 
     */
    public java.lang.Long getId()
    {
        return this.id;
    }

    public void setId(java.lang.Long id)
    {
        this.id = id;
    }

    private java.lang.String username;

    /**
     * 
     */
    public java.lang.String getUsername()
    {
        return this.username;
    }

    public void setUsername(java.lang.String username)
    {
        this.username = username;
    }

    private java.lang.String firstName;

    /**
     * 
     */
    public java.lang.String getFirstName()
    {
        return this.firstName;
    }

    public void setFirstName(java.lang.String firstName)
    {
        this.firstName = firstName;
    }

    private java.lang.String lastName;

    /**
     * 
     */
    public java.lang.String getLastName()
    {
        return this.lastName;
    }

    public void setLastName(java.lang.String lastName)
    {
        this.lastName = lastName;
    }

    // finf.ucf.cu.vo.UserVO value-object java merge-point
}