package com.salesforce.placeorder.builder;

import com.salesforce.placeorder.vo.AccountVO;
import javax.annotation.Generated;
import net.karneim.pojobuilder.GwtIncompatible;

@Generated("PojoBuilder")
public class AccountVOBuilder
    implements Cloneable {
  protected AccountVOBuilder self;
  protected String value$id$java$lang$String;
  protected boolean isSet$id$java$lang$String;
  protected String value$owner$java$lang$String;
  protected boolean isSet$owner$java$lang$String;
  protected String value$ownerid$java$lang$String;
  protected boolean isSet$ownerid$java$lang$String;
  protected String value$namedOwnerId$java$lang$String;
  protected boolean isSet$namedOwnerId$java$lang$String;
  protected String value$recordType$java$lang$String;
  protected boolean isSet$recordType$java$lang$String;
  protected String value$currencyISOCode$java$lang$String;
  protected boolean isSet$currencyISOCode$java$lang$String;
  protected String value$name$java$lang$String;
  protected boolean isSet$name$java$lang$String;
  protected String value$numEmployees$java$lang$String;
  protected boolean isSet$numEmployees$java$lang$String;
  protected String value$billingAddress$java$lang$String;
  protected boolean isSet$billingAddress$java$lang$String;
  protected String value$shippingAddress$java$lang$String;
  protected boolean isSet$shippingAddress$java$lang$String;
  protected String value$billingStreet$java$lang$String;
  protected boolean isSet$billingStreet$java$lang$String;
  protected String value$billingCity$java$lang$String;
  protected boolean isSet$billingCity$java$lang$String;
  protected String value$billingState$java$lang$String;
  protected boolean isSet$billingState$java$lang$String;
  protected String value$billingZip$java$lang$String;
  protected boolean isSet$billingZip$java$lang$String;
  protected String value$billingCountry$java$lang$String;
  protected boolean isSet$billingCountry$java$lang$String;
  protected String value$shippingStreet$java$lang$String;
  protected boolean isSet$shippingStreet$java$lang$String;
  protected String value$shippingCity$java$lang$String;
  protected boolean isSet$shippingCity$java$lang$String;
  protected String value$shippingState$java$lang$String;
  protected boolean isSet$shippingState$java$lang$String;
  protected String value$shippingZip$java$lang$String;
  protected boolean isSet$shippingZip$java$lang$String;
  protected String value$shippingCountry$java$lang$String;
  protected boolean isSet$shippingCountry$java$lang$String;
  protected String value$ultimateParentDuns$java$lang$String;
  protected boolean isSet$ultimateParentDuns$java$lang$String;

  /**
   * Creates a new {@link AccountVOBuilder}.
   */
  public AccountVOBuilder() {
    self = (AccountVOBuilder)this;
  }

  /**
   * Sets the default value for the {@link AccountVO#id} property.
   *
   * @param value the default value
   * @return this builder
   */
  public AccountVOBuilder withId(String value) {
    this.value$id$java$lang$String = value;
    this.isSet$id$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link AccountVO#owner} property.
   *
   * @param value the default value
   * @return this builder
   */
  public AccountVOBuilder withOwner(String value) {
    this.value$owner$java$lang$String = value;
    this.isSet$owner$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link AccountVO#ownerid} property.
   *
   * @param value the default value
   * @return this builder
   */
  public AccountVOBuilder withOwnerid(String value) {
    this.value$ownerid$java$lang$String = value;
    this.isSet$ownerid$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link AccountVO#namedOwnerId} property.
   *
   * @param value the default value
   * @return this builder
   */
  public AccountVOBuilder withNamedOwnerId(String value) {
    this.value$namedOwnerId$java$lang$String = value;
    this.isSet$namedOwnerId$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link AccountVO#recordType} property.
   *
   * @param value the default value
   * @return this builder
   */
  public AccountVOBuilder withRecordType(String value) {
    this.value$recordType$java$lang$String = value;
    this.isSet$recordType$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link AccountVO#currencyISOCode} property.
   *
   * @param value the default value
   * @return this builder
   */
  public AccountVOBuilder withCurrencyISOCode(String value) {
    this.value$currencyISOCode$java$lang$String = value;
    this.isSet$currencyISOCode$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link AccountVO#name} property.
   *
   * @param value the default value
   * @return this builder
   */
  public AccountVOBuilder withName(String value) {
    this.value$name$java$lang$String = value;
    this.isSet$name$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link AccountVO#numEmployees} property.
   *
   * @param value the default value
   * @return this builder
   */
  public AccountVOBuilder withNumEmployees(String value) {
    this.value$numEmployees$java$lang$String = value;
    this.isSet$numEmployees$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link AccountVO#billingAddress} property.
   *
   * @param value the default value
   * @return this builder
   */
  public AccountVOBuilder withBillingAddress(String value) {
    this.value$billingAddress$java$lang$String = value;
    this.isSet$billingAddress$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link AccountVO#shippingAddress} property.
   *
   * @param value the default value
   * @return this builder
   */
  public AccountVOBuilder withShippingAddress(String value) {
    this.value$shippingAddress$java$lang$String = value;
    this.isSet$shippingAddress$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link AccountVO#billingStreet} property.
   *
   * @param value the default value
   * @return this builder
   */
  public AccountVOBuilder withBillingStreet(String value) {
    this.value$billingStreet$java$lang$String = value;
    this.isSet$billingStreet$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link AccountVO#billingCity} property.
   *
   * @param value the default value
   * @return this builder
   */
  public AccountVOBuilder withBillingCity(String value) {
    this.value$billingCity$java$lang$String = value;
    this.isSet$billingCity$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link AccountVO#billingState} property.
   *
   * @param value the default value
   * @return this builder
   */
  public AccountVOBuilder withBillingState(String value) {
    this.value$billingState$java$lang$String = value;
    this.isSet$billingState$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link AccountVO#billingZip} property.
   *
   * @param value the default value
   * @return this builder
   */
  public AccountVOBuilder withBillingZip(String value) {
    this.value$billingZip$java$lang$String = value;
    this.isSet$billingZip$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link AccountVO#billingCountry} property.
   *
   * @param value the default value
   * @return this builder
   */
  public AccountVOBuilder withBillingCountry(String value) {
    this.value$billingCountry$java$lang$String = value;
    this.isSet$billingCountry$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link AccountVO#shippingStreet} property.
   *
   * @param value the default value
   * @return this builder
   */
  public AccountVOBuilder withShippingStreet(String value) {
    this.value$shippingStreet$java$lang$String = value;
    this.isSet$shippingStreet$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link AccountVO#shippingCity} property.
   *
   * @param value the default value
   * @return this builder
   */
  public AccountVOBuilder withShippingCity(String value) {
    this.value$shippingCity$java$lang$String = value;
    this.isSet$shippingCity$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link AccountVO#shippingState} property.
   *
   * @param value the default value
   * @return this builder
   */
  public AccountVOBuilder withShippingState(String value) {
    this.value$shippingState$java$lang$String = value;
    this.isSet$shippingState$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link AccountVO#shippingZip} property.
   *
   * @param value the default value
   * @return this builder
   */
  public AccountVOBuilder withShippingZip(String value) {
    this.value$shippingZip$java$lang$String = value;
    this.isSet$shippingZip$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link AccountVO#shippingCountry} property.
   *
   * @param value the default value
   * @return this builder
   */
  public AccountVOBuilder withShippingCountry(String value) {
    this.value$shippingCountry$java$lang$String = value;
    this.isSet$shippingCountry$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link AccountVO#ultimateParentDuns} property.
   *
   * @param value the default value
   * @return this builder
   */
  public AccountVOBuilder withUltimateParentDuns(String value) {
    this.value$ultimateParentDuns$java$lang$String = value;
    this.isSet$ultimateParentDuns$java$lang$String = true;
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
      AccountVOBuilder result = (AccountVOBuilder)super.clone();
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
  public AccountVOBuilder but() {
    return (AccountVOBuilder)clone();
  }

  /**
   * Creates a new {@link AccountVO} based on this builder's settings.
   *
   * @return the created AccountVO
   */
  public AccountVO build() {
    try {
      AccountVO result = new AccountVO();
      if (isSet$id$java$lang$String) {
        result.id = value$id$java$lang$String;
      }
      if (isSet$owner$java$lang$String) {
        result.owner = value$owner$java$lang$String;
      }
      if (isSet$ownerid$java$lang$String) {
        result.ownerid = value$ownerid$java$lang$String;
      }
      if (isSet$namedOwnerId$java$lang$String) {
        result.namedOwnerId = value$namedOwnerId$java$lang$String;
      }
      if (isSet$recordType$java$lang$String) {
        result.recordType = value$recordType$java$lang$String;
      }
      if (isSet$currencyISOCode$java$lang$String) {
        result.currencyISOCode = value$currencyISOCode$java$lang$String;
      }
      if (isSet$name$java$lang$String) {
        result.name = value$name$java$lang$String;
      }
      if (isSet$numEmployees$java$lang$String) {
        result.numEmployees = value$numEmployees$java$lang$String;
      }
      if (isSet$billingAddress$java$lang$String) {
        result.billingAddress = value$billingAddress$java$lang$String;
      }
      if (isSet$shippingAddress$java$lang$String) {
        result.shippingAddress = value$shippingAddress$java$lang$String;
      }
      if (isSet$billingStreet$java$lang$String) {
        result.billingStreet = value$billingStreet$java$lang$String;
      }
      if (isSet$billingCity$java$lang$String) {
        result.billingCity = value$billingCity$java$lang$String;
      }
      if (isSet$billingState$java$lang$String) {
        result.billingState = value$billingState$java$lang$String;
      }
      if (isSet$billingZip$java$lang$String) {
        result.billingZip = value$billingZip$java$lang$String;
      }
      if (isSet$billingCountry$java$lang$String) {
        result.billingCountry = value$billingCountry$java$lang$String;
      }
      if (isSet$shippingStreet$java$lang$String) {
        result.shippingStreet = value$shippingStreet$java$lang$String;
      }
      if (isSet$shippingCity$java$lang$String) {
        result.shippingCity = value$shippingCity$java$lang$String;
      }
      if (isSet$shippingState$java$lang$String) {
        result.shippingState = value$shippingState$java$lang$String;
      }
      if (isSet$shippingZip$java$lang$String) {
        result.shippingZip = value$shippingZip$java$lang$String;
      }
      if (isSet$shippingCountry$java$lang$String) {
        result.shippingCountry = value$shippingCountry$java$lang$String;
      }
      if (isSet$ultimateParentDuns$java$lang$String) {
        result.ultimateParentDuns = value$ultimateParentDuns$java$lang$String;
      }
      return result;
    } catch (RuntimeException ex) {
      throw ex;
    } catch (Exception ex) {
      throw new RuntimeException(ex);
    }
  }
}
