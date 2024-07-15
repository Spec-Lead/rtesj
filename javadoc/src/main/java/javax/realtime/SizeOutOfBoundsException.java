/*-----------------------------------------------------------------------*\
 * Copyright 2012--2024, aicas GmbH; all rights reserved.
 * This header, including copyright notice, may not be altered or removed.
 *-----------------------------------------------------------------------*/
package javax.realtime;

/**
 * To throw when the constructor of an {@link ImmortalPhysicalMemory},
 * {@link LTPhysicalMemory}, or {@link VTPhysicalMemory}  is given an
 * invalid size or when a  memory access generated by a raw memory
 * accessor instance (See {@link javax.realtime.device.RawMemory}.) would
 * cause access to an invalid address.
 *
 * @since RTSJ 1.0.1 became unchecked
 *
 * @since RTSJ 2.0 extends StaticRuntimeException
 */
public class SizeOutOfBoundsException
  extends StaticRuntimeException
  implements StaticThrowable<SizeOutOfBoundsException>
{
  private static final long serialVersionUID = -6114945601778023070L;

  private static final SizeOutOfBoundsException _singleton_ =
    new SizeOutOfBoundsException();

  /**
   * Obtains the singleton of this static throwable.
   * It should be initialized before throwing.
   *
   * @return the single instance of this throwable.
   *
   * @since RTSJ 2.0
   */
  public static SizeOutOfBoundsException get()
  {
    return _singleton_;
  }

  /**
   * A constructor for {@code SizeOutOfBoundsException}, but application code
   * should use {@link #get()} instead.
   *
   * @deprecated since RTSJ 2.0; application code should use {@link #get()}
   * instead.
   */
  @Deprecated
  public SizeOutOfBoundsException() {}

  /**
   * A descriptive constructor for {@code SizeOutOfBoundsException}.
   *
   * @param description The description of the exception.
   *
   * @deprecated since RTSJ 2.0; application code should use {@link #get()}
   *             instead.
   */
  @Deprecated
  public SizeOutOfBoundsException(String description) {}

  @Override
  public SizeOutOfBoundsException getSingleton() { return _singleton_; }
}
