package com.salesforce.placeorder.builder;

import com.salesforce.placeorder.vo.UserVO;
import javax.annotation.Generated;
import net.karneim.pojobuilder.GwtIncompatible;

@Generated("PojoBuilder")
public class UserVOBuilder
    implements Cloneable {
  protected UserVOBuilder self;
  protected String value$id$java$lang$String;
  protected boolean isSet$id$java$lang$String;
  protected String value$recordType$java$lang$String;
  protected boolean isSet$recordType$java$lang$String;
  protected String value$owner$java$lang$String;
  protected boolean isSet$owner$java$lang$String;
  protected String value$username$java$lang$String;
  protected boolean isSet$username$java$lang$String;
  protected String value$password$java$lang$String;
  protected boolean isSet$password$java$lang$String;
  protected String value$email$java$lang$String;
  protected boolean isSet$email$java$lang$String;
  protected String value$firstName$java$lang$String;
  protected boolean isSet$firstName$java$lang$String;
  protected String value$lastName$java$lang$String;
  protected boolean isSet$lastName$java$lang$String;

  /**
   * Creates a new {@link UserVOBuilder}.
   */
  public UserVOBuilder() {
    self = (UserVOBuilder)this;
  }

  /**
   * Sets the default value for the {@link UserVO#id} property.
   *
   * @param value the default value
   * @return this builder
   */
  public UserVOBuilder withId(String value) {
    this.value$id$java$lang$String = value;
    this.isSet$id$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link UserVO#recordType} property.
   *
   * @param value the default value
   * @return this builder
   */
  public UserVOBuilder withRecordType(String value) {
    this.value$recordType$java$lang$String = value;
    this.isSet$recordType$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link UserVO#owner} property.
   *
   * @param value the default value
   * @return this builder
   */
  public UserVOBuilder withOwner(String value) {
    this.value$owner$java$lang$String = value;
    this.isSet$owner$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link UserVO#username} property.
   *
   * @param value the default value
   * @return this builder
   */
  public UserVOBuilder withUsername(String value) {
    this.value$username$java$lang$String = value;
    this.isSet$username$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link UserVO#password} property.
   *
   * @param value the default value
   * @return this builder
   */
  public UserVOBuilder withPassword(String value) {
    this.value$password$java$lang$String = value;
    this.isSet$password$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link UserVO#email} property.
   *
   * @param value the default value
   * @return this builder
   */
  public UserVOBuilder withEmail(String value) {
    this.value$email$java$lang$String = value;
    this.isSet$email$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link UserVO#firstName} property.
   *
   * @param value the default value
   * @return this builder
   */
  public UserVOBuilder withFirstName(String value) {
    this.value$firstName$java$lang$String = value;
    this.isSet$firstName$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link UserVO#lastName} property.
   *
   * @param value the default value
   * @return this builder
   */
  public UserVOBuilder withLastName(String value) {
    this.value$lastName$java$lang$String = value;
    this.isSet$lastName$java$lang$String = true;
    return self;
  }

  /**
   * Returns a clone of this builder.
   *
   * @return the clone
   */
  @Override
  @GwtIncompatible
  public Object clone() {
    try {
      UserVOBuilder result = (UserVOBuilder)super.clone();
      result.self = result;
      return result;
    } catch (CloneNotSupportedException e) {
      throw new InternalError(e.getMessage());
    }
  }

  /**
   * Returns a clone of this builder.
   *
   * @return the clone
   */
  @GwtIncompatible
  public UserVOBuilder but() {
    return (UserVOBuilder)clone();
  }

  /**
   * Creates a new {@link UserVO} based on this builder's settings.
   *
   * @return the created UserVO
   */
  public UserVO build() {
    try {
      UserVO result = new UserVO();
      if (isSet$id$java$lang$String) {
        result.id = value$id$java$lang$String;
      }
      if (isSet$recordType$java$lang$String) {
        result.recordType = value$recordType$java$lang$String;
      }
      if (isSet$owner$java$lang$String) {
        result.owner = value$owner$java$lang$String;
      }
      if (isSet$username$java$lang$String) {
        result.username = value$username$java$lang$String;
      }
      if (isSet$password$java$lang$String) {
        result.password = value$password$java$lang$String;
      }
      if (isSet$email$java$lang$String) {
        result.email = value$email$java$lang$String;
      }
      if (isSet$firstName$java$lang$String) {
        result.firstName = value$firstName$java$lang$String;
      }
      if (isSet$lastName$java$lang$String) {
        result.lastName = value$lastName$java$lang$String;
      }
      return result;
    } catch (RuntimeException ex) {
      throw ex;
    } catch (Exception ex) {
      throw new RuntimeException(ex);
    }
  }
}
