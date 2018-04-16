package com.salesforce.placeorder.builder;

import com.salesforce.placeorder.vo.OpportunityVO;
import javax.annotation.Generated;

@Generated("PojoBuilder")
public class OpportunityVOBuilder
    implements Cloneable {
  protected OpportunityVOBuilder self;
  protected String value$id$java$lang$String;
  protected boolean isSet$id$java$lang$String;
  protected String value$recordType$java$lang$String;
  protected boolean isSet$recordType$java$lang$String;
  protected String value$owner$java$lang$String;
  protected boolean isSet$owner$java$lang$String;
  protected String value$ownerid$java$lang$String;
  protected boolean isSet$ownerid$java$lang$String;
  protected String value$name$java$lang$String;
  protected boolean isSet$name$java$lang$String;
  protected String value$currencyISOCode$java$lang$String;
  protected boolean isSet$currencyISOCode$java$lang$String;
  protected String value$type$java$lang$String;
  protected boolean isSet$type$java$lang$String;
  protected String value$amount$java$lang$String;
  protected boolean isSet$amount$java$lang$String;
  protected String value$amountConverted$java$lang$String;
  protected boolean isSet$amountConverted$java$lang$String;
  protected String value$closeDate$java$lang$String;
  protected boolean isSet$closeDate$java$lang$String;
  protected String value$stage$java$lang$String;
  protected boolean isSet$stage$java$lang$String;
  protected String value$forcastCategory$java$lang$String;
  protected boolean isSet$forcastCategory$java$lang$String;
  protected String value$opportunityCurrency$java$lang$String;
  protected boolean isSet$opportunityCurrency$java$lang$String;
  protected String value$accountName$java$lang$String;
  protected boolean isSet$accountName$java$lang$String;
  protected String value$opptyTeamStatus$java$lang$String;
  protected boolean isSet$opptyTeamStatus$java$lang$String;
  protected String value$opptyTeamErrorMessage$java$lang$String;
  protected boolean isSet$opptyTeamErrorMessage$java$lang$String;
  protected boolean value$markForOppurtunityTeamCreate$boolean;
  protected boolean isSet$markForOppurtunityTeamCreate$boolean;

  /**
   * Creates a new {@link OpportunityVOBuilder}.
   */
  public OpportunityVOBuilder() {
    self = (OpportunityVOBuilder)this;
  }

  /**
   * Sets the default value for the {@link OpportunityVO#id} property.
   *
   * @param value the default value
   * @return this builder
   */
  public OpportunityVOBuilder withId(String value) {
    this.value$id$java$lang$String = value;
    this.isSet$id$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link OpportunityVO#recordType} property.
   *
   * @param value the default value
   * @return this builder
   */
  public OpportunityVOBuilder withRecordType(String value) {
    this.value$recordType$java$lang$String = value;
    this.isSet$recordType$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link OpportunityVO#owner} property.
   *
   * @param value the default value
   * @return this builder
   */
  public OpportunityVOBuilder withOwner(String value) {
    this.value$owner$java$lang$String = value;
    this.isSet$owner$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link OpportunityVO#ownerid} property.
   *
   * @param value the default value
   * @return this builder
   */
  public OpportunityVOBuilder withOwnerid(String value) {
    this.value$ownerid$java$lang$String = value;
    this.isSet$ownerid$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link OpportunityVO#name} property.
   *
   * @param value the default value
   * @return this builder
   */
  public OpportunityVOBuilder withName(String value) {
    this.value$name$java$lang$String = value;
    this.isSet$name$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link OpportunityVO#currencyISOCode} property.
   *
   * @param value the default value
   * @return this builder
   */
  public OpportunityVOBuilder withCurrencyISOCode(String value) {
    this.value$currencyISOCode$java$lang$String = value;
    this.isSet$currencyISOCode$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link OpportunityVO#type} property.
   *
   * @param value the default value
   * @return this builder
   */
  public OpportunityVOBuilder withType(String value) {
    this.value$type$java$lang$String = value;
    this.isSet$type$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link OpportunityVO#amount} property.
   *
   * @param value the default value
   * @return this builder
   */
  public OpportunityVOBuilder withAmount(String value) {
    this.value$amount$java$lang$String = value;
    this.isSet$amount$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link OpportunityVO#amountConverted} property.
   *
   * @param value the default value
   * @return this builder
   */
  public OpportunityVOBuilder withAmountConverted(String value) {
    this.value$amountConverted$java$lang$String = value;
    this.isSet$amountConverted$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link OpportunityVO#closeDate} property.
   *
   * @param value the default value
   * @return this builder
   */
  public OpportunityVOBuilder withCloseDate(String value) {
    this.value$closeDate$java$lang$String = value;
    this.isSet$closeDate$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link OpportunityVO#stage} property.
   *
   * @param value the default value
   * @return this builder
   */
  public OpportunityVOBuilder withStage(String value) {
    this.value$stage$java$lang$String = value;
    this.isSet$stage$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link OpportunityVO#forcastCategory} property.
   *
   * @param value the default value
   * @return this builder
   */
  public OpportunityVOBuilder withForcastCategory(String value) {
    this.value$forcastCategory$java$lang$String = value;
    this.isSet$forcastCategory$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link OpportunityVO#opportunityCurrency} property.
   *
   * @param value the default value
   * @return this builder
   */
  public OpportunityVOBuilder withOpportunityCurrency(String value) {
    this.value$opportunityCurrency$java$lang$String = value;
    this.isSet$opportunityCurrency$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link OpportunityVO#accountName} property.
   *
   * @param value the default value
   * @return this builder
   */
  public OpportunityVOBuilder withAccountName(String value) {
    this.value$accountName$java$lang$String = value;
    this.isSet$accountName$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link OpportunityVO#opptyTeamStatus} property.
   *
   * @param value the default value
   * @return this builder
   */
  public OpportunityVOBuilder withOpptyTeamStatus(String value) {
    this.value$opptyTeamStatus$java$lang$String = value;
    this.isSet$opptyTeamStatus$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link OpportunityVO#opptyTeamErrorMessage} property.
   *
   * @param value the default value
   * @return this builder
   */
  public OpportunityVOBuilder withOpptyTeamErrorMessage(String value) {
    this.value$opptyTeamErrorMessage$java$lang$String = value;
    this.isSet$opptyTeamErrorMessage$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link OpportunityVO#markForOppurtunityTeamCreate} property.
   *
   * @param value the default value
   * @return this builder
   */
  public OpportunityVOBuilder withMarkForOppurtunityTeamCreate(boolean value) {
    this.value$markForOppurtunityTeamCreate$boolean = value;
    this.isSet$markForOppurtunityTeamCreate$boolean = true;
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
      OpportunityVOBuilder result = (OpportunityVOBuilder)super.clone();
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
  public OpportunityVOBuilder but() {
    return (OpportunityVOBuilder)clone();
  }

  /**
   * Creates a new {@link OpportunityVO} based on this builder's settings.
   *
   * @return the created OpportunityVO
   */
  public OpportunityVO build() {
    try {
      OpportunityVO result = new OpportunityVO();
      if (isSet$id$java$lang$String) {
        result.id = value$id$java$lang$String;
      }
      if (isSet$recordType$java$lang$String) {
        result.recordType = value$recordType$java$lang$String;
      }
      if (isSet$owner$java$lang$String) {
        result.owner = value$owner$java$lang$String;
      }
      if (isSet$ownerid$java$lang$String) {
        result.ownerid = value$ownerid$java$lang$String;
      }
      if (isSet$name$java$lang$String) {
        result.name = value$name$java$lang$String;
      }
      if (isSet$currencyISOCode$java$lang$String) {
        result.currencyISOCode = value$currencyISOCode$java$lang$String;
      }
      if (isSet$type$java$lang$String) {
        result.type = value$type$java$lang$String;
      }
      if (isSet$amount$java$lang$String) {
        result.amount = value$amount$java$lang$String;
      }
      if (isSet$amountConverted$java$lang$String) {
        result.amountConverted = value$amountConverted$java$lang$String;
      }
      if (isSet$closeDate$java$lang$String) {
        result.closeDate = value$closeDate$java$lang$String;
      }
      if (isSet$stage$java$lang$String) {
        result.stage = value$stage$java$lang$String;
      }
      if (isSet$forcastCategory$java$lang$String) {
        result.forcastCategory = value$forcastCategory$java$lang$String;
      }
      if (isSet$opportunityCurrency$java$lang$String) {
        result.opportunityCurrency = value$opportunityCurrency$java$lang$String;
      }
      if (isSet$accountName$java$lang$String) {
        result.accountName = value$accountName$java$lang$String;
      }
      if (isSet$opptyTeamStatus$java$lang$String) {
        result.opptyTeamStatus = value$opptyTeamStatus$java$lang$String;
      }
      if (isSet$opptyTeamErrorMessage$java$lang$String) {
        result.opptyTeamErrorMessage = value$opptyTeamErrorMessage$java$lang$String;
      }
      if (isSet$markForOppurtunityTeamCreate$boolean) {
        result.markForOppurtunityTeamCreate = value$markForOppurtunityTeamCreate$boolean;
      }
      return result;
    } catch (RuntimeException ex) {
      throw ex;
    } catch (Exception ex) {
      throw new java.lang.reflect.UndeclaredThrowableException(ex);
    }
  }
}
