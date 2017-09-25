// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: HibernateEntity.vsl in andromda-hibernate-cartridge.
//
package finf.ucf.cu.domain;

/**
 * <p>
 * Un local es todo sitio donde se pueda realizar una clase. Puede
 * ser una aula, una cancha de deportes, etc.
 * </p>
 * <p>
 * Note que para modificar uno de los registros mostrados en la
 * tabla se debe marcar el boton de circular (primera columna de la
 * tabla). Luego de esto se le activa el boton de actualizar, ud
 * debe hacer los cambios pertinentes y pinchar actulizar.
 * </p>
 * <p>
 * Para eliminar registros se selecciona todos lo que quiera en la
 * segunda columna de la tabla, se le activa el boton eliminar y
 * solo entonces puede efectuar lo que pretende.
 * </p>
 * <p>
 * Los campos dentro del formulario con asteriscos rojos son
 * obligatorios.
 * </p>
 */
public abstract class Room
    implements java.io.Serializable
{
    /**
     * The serial version UID of this class. Needed for serialization.
     */
    private static final long serialVersionUID = 1763628485901468630L;

    private java.lang.String name;

    /**
     * <p>
     * Este campo indica el nombre de Local
     * </p>
     */
    public java.lang.String getName()
    {
        return this.name;
    }

    public void setName(java.lang.String name)
    {
        this.name = name;
    }

    private java.lang.Integer size;

    /**
     * <p>
     * Este campo indica la capacidad del local
     * </p>
     */
    public java.lang.Integer getSize()
    {
        return this.size;
    }

    public void setSize(java.lang.Integer size)
    {
        this.size = size;
    }

    private java.lang.String abbreviation;

    /**
     * <p>
     * Este campo indica la abreviatura del local
     * </p>
     */
    public java.lang.String getAbbreviation()
    {
        return this.abbreviation;
    }

    public void setAbbreviation(java.lang.String abbreviation)
    {
        this.abbreviation = abbreviation;
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

    private java.util.Collection resources = new java.util.HashSet();

    /**
     * 
     */
    public java.util.Collection getResources()
    {
        return this.resources;
    }

    public void setResources(java.util.Collection resources)
    {
        this.resources = resources;
    }

    private finf.ucf.cu.domain.Building buildingId;

    /**
     * 
     */
    public finf.ucf.cu.domain.Building getBuildingId()
    {
        return this.buildingId;
    }

    public void setBuildingId(finf.ucf.cu.domain.Building buildingId)
    {
        this.buildingId = buildingId;
    }

    /**
     * Returns <code>true</code> if the argument is an Room instance and all identifiers for this entity
     * equal the identifiers of the argument entity. Returns <code>false</code> otherwise.
     */
    public boolean equals(Object object)
    {
        if (this == object)
        {
            return true;
        }
        if (!(object instanceof Room))
        {
            return false;
        }
        final Room that = (Room)object;
        if (this.id == null || that.getId() == null || !this.id.equals(that.getId()))
        {
            return false;
        }
        return true;
    }

    /**
     * Returns a hash code based on this entity's identifiers.
     */
    public int hashCode()
    {
        int hashCode = 0;
        hashCode = 29 * hashCode + (id == null ? 0 : id.hashCode());

        return hashCode;
    }

    /**
     * Constructs new instances of {@link finf.ucf.cu.domain.Room}.
     */
    public static final class Factory
    {
        /**
         * Constructs a new instance of {@link finf.ucf.cu.domain.Room}.
         */
        public static finf.ucf.cu.domain.Room newInstance()
        {
            return new finf.ucf.cu.domain.RoomImpl();
        }

        /**
         * Constructs a new instance of {@link finf.ucf.cu.domain.Room}, taking all required and/or
         * read-only properties as arguments.
         */
        public static finf.ucf.cu.domain.Room newInstance(java.lang.String name, java.lang.Integer size, java.lang.String abbreviation, finf.ucf.cu.domain.Building buildingId)
        {
            final finf.ucf.cu.domain.Room entity = new finf.ucf.cu.domain.RoomImpl();
            entity.setName(name);
            entity.setSize(size);
            entity.setAbbreviation(abbreviation);
            entity.setBuildingId(buildingId);
            return entity;
        }

        /**
         * Constructs a new instance of {@link finf.ucf.cu.domain.Room}, taking all possible properties
         * (except the identifier(s))as arguments.
         */
        public static finf.ucf.cu.domain.Room newInstance(java.lang.String name, java.lang.Integer size, java.lang.String abbreviation, java.util.Collection resources, finf.ucf.cu.domain.Building buildingId)
        {
            final finf.ucf.cu.domain.Room entity = new finf.ucf.cu.domain.RoomImpl();
            entity.setName(name);
            entity.setSize(size);
            entity.setAbbreviation(abbreviation);
            entity.setResources(resources);
            entity.setBuildingId(buildingId);
            return entity;
        }
    }
    
// HibernateEntity.vsl merge-point
}