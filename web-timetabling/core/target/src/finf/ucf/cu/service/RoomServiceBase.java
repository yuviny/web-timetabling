// license-header java merge-point
//
// Attention: Generated code! Do not modify by hand!
// Generated by: SpringServiceBase.vsl in andromda-spring-cartridge.
//
package finf.ucf.cu.service;

/**
 * <p>
 * Spring Service base class for <code>finf.ucf.cu.service.RoomService</code>,
 * provides access to all services and entities referenced by this service.
 * </p>
 *
 * @see finf.ucf.cu.service.RoomService
 */
public abstract class RoomServiceBase
    implements finf.ucf.cu.service.RoomService
{

    private finf.ucf.cu.domain.RoomDao roomDao;

    /**
     * Sets the reference to <code>room</code>'s DAO.
     */
    public void setRoomDao(finf.ucf.cu.domain.RoomDao roomDao)
    {
        this.roomDao = roomDao;
    }

    /**
     * Gets the reference to <code>room</code>'s DAO.
     */
    protected finf.ucf.cu.domain.RoomDao getRoomDao()
    {
        return this.roomDao;
    }

    /**
     * @see finf.ucf.cu.service.RoomService#findRoomById(java.lang.Long)
     */
    public finf.ucf.cu.domain.crud.RoomValueObject findRoomById(final java.lang.Long id)
    {
        if (id == null)
        {
            throw new IllegalArgumentException(
                "finf.ucf.cu.service.RoomService.findRoomById(java.lang.Long id) - 'id' can not be null");
        }
        try
        {
            return this.handleFindRoomById(id);
        }
        catch (Throwable th)
        {
            throw new finf.ucf.cu.service.RoomServiceException(
                "Error performing 'finf.ucf.cu.service.RoomService.findRoomById(java.lang.Long id)' --> " + th,
                th);
        }
    }

     /**
      * Performs the core logic for {@link #findRoomById(java.lang.Long)}
      */
    protected abstract finf.ucf.cu.domain.crud.RoomValueObject handleFindRoomById(java.lang.Long id)
        throws java.lang.Exception;

    /**
     * Gets the current <code>principal</code> if one has been set,
     * otherwise returns <code>null</code>.
     *
     * @return the current principal
     */
    protected java.security.Principal getPrincipal()
    {
        return finf.ucf.cu.PrincipalStore.get();
    }

    /**
     * Gets the message source available to this service.
     */
    protected org.springframework.context.MessageSource getMessages()
    {
        return (org.springframework.context.MessageSource)
            finf.ucf.cu.BeanLocator.instance().getBean("messageSource");
    }

    /**
     * Gets the message having the given <code>key</code> in the underlying message bundle.
     *
     * @param key the key of the message in the messages.properties message bundle.
     */
    protected String getMessage(final String key)
    {
        return this.getMessages().getMessage(key, null, null);
    }

    /**
     * Gets the message having the given <code>key</code> and <code>arguments</code> in the
     * underlying message bundle.
     *
     * @param key the key of the message in the messages.properties message bundle.
     * @param arguments any arguments to substitute when resolving the message.
     */
    protected String getMessage(final String key, final Object[] arguments)
    {
        return this.getMessages().getMessage(key, arguments, null);
    }

    /**
     * Gets the message having the given <code>key</code> using the given <code>arguments</code>
     * for the given <code>locale</code>.
     *
     * @param key the key of the message in the messages.properties message bundle.
     * @param arguments any arguments to substitute when resolving the message.
     * @param locale the locale of the messages to retrieve.
     */
    protected String getMessage(
        final java.lang.String key, final java.lang.Object[] arguments,
        final java.util.Locale locale)
    {
        return this.getMessages().getMessage(key, arguments, locale);
    }

}