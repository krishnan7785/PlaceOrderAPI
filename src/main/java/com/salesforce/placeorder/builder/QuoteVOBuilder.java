package com.salesforce.placeorder.builder;

import com.salesforce.placeorder.vo.QuoteVO;
import javax.annotation.Generated;

@Generated("PojoBuilder")
public class QuoteVOBuilder
    implements Cloneable {
  protected QuoteVOBuilder self;
  protected String value$id$java$lang$String;
  protected boolean isSet$id$java$lang$String;
  protected String value$recordType$java$lang$String;
  protected boolean isSet$recordType$java$lang$String;
  protected String value$serviceStartDate$java$lang$String;
  protected boolean isSet$serviceStartDate$java$lang$String;
  protected String value$quoteTerm$java$lang$String;
  protected boolean isSet$quoteTerm$java$lang$String;
  protected String value$quoteName$java$lang$String;
  protected boolean isSet$quoteName$java$lang$String;
  protected String value$accountId$java$lang$String;
  protected boolean isSet$accountId$java$lang$String;
  protected String value$opportunityId$java$lang$String;
  protected boolean isSet$opportunityId$java$lang$String;
  protected String value$pricelistId$java$lang$String;
  protected boolean isSet$pricelistId$java$lang$String;
  protected String value$accountName$java$lang$String;
  protected boolean isSet$accountName$java$lang$String;
  protected String value$opportunityName$java$lang$String;
  protected boolean isSet$opportunityName$java$lang$String;
  protected String value$priceList$java$lang$String;
  protected boolean isSet$priceList$java$lang$String;
  protected String value$autoRenew$java$lang$String;
  protected boolean isSet$autoRenew$java$lang$String;

  /**
   * Creates a new {@link QuoteVOBuilder}.
   */
  public QuoteVOBuilder() {
    self = (QuoteVOBuilder)this;
  }

  /**
   * Sets the default value for the {@link QuoteVO#id} property.
   *
   * @param value the default value
   * @return this builder
   */
  public QuoteVOBuilder withId(String value) {
    this.value$id$java$lang$String = value;
    this.isSet$id$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link QuoteVO#recordType} property.
   *
   * @param value the default value
   * @return this builder
   */
  public QuoteVOBuilder withRecordType(String value) {
    this.value$recordType$java$lang$String = value;
    this.isSet$recordType$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link QuoteVO#serviceStartDate} property.
   *
   * @param value the default value
   * @return this builder
   */
  public QuoteVOBuilder withServiceStartDate(String value) {
    this.value$serviceStartDate$java$lang$String = value;
    this.isSet$serviceStartDate$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link QuoteVO#quoteTerm} property.
   *
   * @param value the default value
   * @return this builder
   */
  public QuoteVOBuilder withQuoteTerm(String value) {
    this.value$quoteTerm$java$lang$String = value;
    this.isSet$quoteTerm$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link QuoteVO#quoteName} property.
   *
   * @param value the default value
   * @return this builder
   */
  public QuoteVOBuilder withQuoteName(String value) {
    this.value$quoteName$java$lang$String = value;
    this.isSet$quoteName$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link QuoteVO#accountId} property.
   *
   * @param value the default value
   * @return this builder
   */
  public QuoteVOBuilder withAccountId(String value) {
    this.value$accountId$java$lang$String = value;
    this.isSet$accountId$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link QuoteVO#opportunityId} property.
   *
   * @param value the default value
   * @return this builder
   */
  public QuoteVOBuilder withOpportunityId(String value) {
    this.value$opportunityId$java$lang$String = value;
    this.isSet$opportunityId$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link QuoteVO#pricelistId} property.
   *
   * @param value the default value
   * @return this builder
   */
  public QuoteVOBuilder withPricelistId(String value) {
    this.value$pricelistId$java$lang$String = value;
    this.isSet$pricelistId$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link QuoteVO#accountName} property.
   *
   * @param value the default value
   * @return this builder
   */
  public QuoteVOBuilder withAccountName(String value) {
    this.value$accountName$java$lang$String = value;
    this.isSet$accountName$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link QuoteVO#opportunityName} property.
   *
   * @param value the default value
   * @return this builder
   */
  public QuoteVOBuilder withOpportunityName(String value) {
    this.value$opportunityName$java$lang$String = value;
    this.isSet$opportunityName$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link QuoteVO#priceList} property.
   *
   * @param value the default value
   * @return this builder
   */
  public QuoteVOBuilder withPriceList(String value) {
    this.value$priceList$java$lang$String = value;
    this.isSet$priceList$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link QuoteVO#autoRenew} property.
   *
   * @param value the default value
   * @return this builder
   */
  public QuoteVOBuilder withAutoRenew(String value) {
    this.value$autoRenew$java$lang$String = value;
    this.isSet$autoRenew$java$lang$String = true;
    return self;
  }

  /**
   * Returns a clone of this builder.
   *
   * @return the clone
   */
  @Override
  public Object clone() {
    try {
      QuoteVOBuilder result = (QuoteVOBuilder)super.clone();
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
  public QuoteVOBuilder but() {
    return (QuoteVOBuilder)clone();
  }

  /**
   * Creates a new {@link QuoteVO} based on this builder's settings.
   *
   * @return the created QuoteVO
   */
  public QuoteVO build() {
    try {
      QuoteVO result = new QuoteVO();
      if (isSet$id$java$lang$String) {
        result.id = value$id$java$lang$String;
      }
      if (isSet$recordType$java$lang$String) {
        result.recordType = value$recordType$java$lang$String;
      }
      if (isSet$serviceStartDate$java$lang$String) {
        result.serviceStartDate = value$serviceStartDate$java$lang$String;
      }
      if (isSet$quoteTerm$java$lang$String) {
        result.quoteTerm = value$quoteTerm$java$lang$String;
      }
      if (isSet$quoteName$java$lang$String) {
        result.quoteName = value$quoteName$java$lang$String;
      }
      if (isSet$accountId$java$lang$String) {
        result.accountId = value$accountId$java$lang$String;
      }
      if (isSet$opportunityId$java$lang$String) {
        result.opportunityId = value$opportunityId$java$lang$String;
      }
      if (isSet$pricelistId$java$lang$String) {
        result.pricelistId = value$pricelistId$java$lang$String;
      }
      if (isSet$accountName$java$lang$String) {
        result.accountName = value$accountName$java$lang$String;
      }
      if (isSet$opportunityName$java$lang$String) {
        result.opportunityName = value$opportunityName$java$lang$String;
      }
      if (isSet$priceList$java$lang$String) {
        result.priceList = value$priceList$java$lang$String;
      }
      if (isSet$autoRenew$java$lang$String) {
        result.autoRenew = value$autoRenew$java$lang$String;
      }
      return result;
    } catch (RuntimeException ex) {
      throw ex;
    } catch (Exception ex) {
      throw new java.lang.reflect.UndeclaredThrowableException(ex);
    }
  }
}
