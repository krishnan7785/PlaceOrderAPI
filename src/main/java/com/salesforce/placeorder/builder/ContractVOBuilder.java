package com.salesforce.placeorder.builder;

import com.salesforce.placeorder.vo.ContractVO;
import javax.annotation.Generated;
import net.karneim.pojobuilder.GwtIncompatible;

@Generated("PojoBuilder")
public class ContractVOBuilder
    implements Cloneable {
  protected ContractVOBuilder self;
  protected String value$id$java$lang$String;
  protected boolean isSet$id$java$lang$String;
  protected String value$owner$java$lang$String;
  protected boolean isSet$owner$java$lang$String;
  protected String value$recordType$java$lang$String;
  protected boolean isSet$recordType$java$lang$String;
  protected String value$accountName$java$lang$String;
  protected boolean isSet$accountName$java$lang$String;
  protected String value$contractNumber$java$lang$String;
  protected boolean isSet$contractNumber$java$lang$String;
  protected String value$contractType$java$lang$String;
  protected boolean isSet$contractType$java$lang$String;
  protected String value$contractStartDate$java$lang$String;
  protected boolean isSet$contractStartDate$java$lang$String;
  protected String value$contractTerm$java$lang$String;
  protected boolean isSet$contractTerm$java$lang$String;
  protected String value$contractStatus$java$lang$String;
  protected boolean isSet$contractStatus$java$lang$String;
  protected String value$currencyISOCode$java$lang$String;
  protected boolean isSet$currencyISOCode$java$lang$String;
  protected String value$priceBook$java$lang$String;
  protected boolean isSet$priceBook$java$lang$String;
  protected String value$initialContractEnddate$java$lang$String;
  protected boolean isSet$initialContractEnddate$java$lang$String;
  protected String value$autoRenewal$java$lang$String;
  protected boolean isSet$autoRenewal$java$lang$String;
  protected int value$renewalTerm$int;
  protected boolean isSet$renewalTerm$int;
  protected int value$renewalDays$int;
  protected boolean isSet$renewalDays$int;
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
  protected String value$billingCompanyName$java$lang$String;
  protected boolean isSet$billingCompanyName$java$lang$String;
  protected String value$billingContactName$java$lang$String;
  protected boolean isSet$billingContactName$java$lang$String;
  protected String value$billingFirstName$java$lang$String;
  protected boolean isSet$billingFirstName$java$lang$String;
  protected String value$billingLastName$java$lang$String;
  protected boolean isSet$billingLastName$java$lang$String;
  protected String value$billingLanguage$java$lang$String;
  protected boolean isSet$billingLanguage$java$lang$String;
  protected String value$billingEmail$java$lang$String;
  protected boolean isSet$billingEmail$java$lang$String;
  protected String value$paymentTerms$java$lang$String;
  protected boolean isSet$paymentTerms$java$lang$String;
  protected String value$orderPrebillDays$java$lang$String;
  protected boolean isSet$orderPrebillDays$java$lang$String;
  protected String value$billingFrequency$java$lang$String;
  protected boolean isSet$billingFrequency$java$lang$String;
  protected String value$billingLanguageCode$java$lang$String;
  protected boolean isSet$billingLanguageCode$java$lang$String;
  protected String value$paymentType$java$lang$String;
  protected boolean isSet$paymentType$java$lang$String;
  protected String value$VATExemptionReason$java$lang$String;
  protected boolean isSet$VATExemptionReason$java$lang$String;

  /**
   * Creates a new {@link ContractVOBuilder}.
   */
  public ContractVOBuilder() {
    self = this;
  }

  /**
   * Sets the default value for the {@link ContractVO#id} property.
   *
   * @param value the default value
   * @return this builder
   */
  public ContractVOBuilder withId(String value) {
    this.value$id$java$lang$String = value;
    this.isSet$id$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link ContractVO#owner} property.
   *
   * @param value the default value
   * @return this builder
   */
  public ContractVOBuilder withOwner(String value) {
    this.value$owner$java$lang$String = value;
    this.isSet$owner$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link ContractVO#recordType} property.
   *
   * @param value the default value
   * @return this builder
   */
  public ContractVOBuilder withRecordType(String value) {
    this.value$recordType$java$lang$String = value;
    this.isSet$recordType$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link ContractVO#accountName} property.
   *
   * @param value the default value
   * @return this builder
   */
  public ContractVOBuilder withAccountName(String value) {
    this.value$accountName$java$lang$String = value;
    this.isSet$accountName$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link ContractVO#contractNumber} property.
   *
   * @param value the default value
   * @return this builder
   */
  public ContractVOBuilder withContractNumber(String value) {
    this.value$contractNumber$java$lang$String = value;
    this.isSet$contractNumber$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link ContractVO#contractType} property.
   *
   * @param value the default value
   * @return this builder
   */
  public ContractVOBuilder withContractType(String value) {
    this.value$contractType$java$lang$String = value;
    this.isSet$contractType$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link ContractVO#contractStartDate} property.
   *
   * @param value the default value
   * @return this builder
   */
  public ContractVOBuilder withContractStartDate(String value) {
    this.value$contractStartDate$java$lang$String = value;
    this.isSet$contractStartDate$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link ContractVO#contractTerm} property.
   *
   * @param value the default value
   * @return this builder
   */
  public ContractVOBuilder withContractTerm(String value) {
    this.value$contractTerm$java$lang$String = value;
    this.isSet$contractTerm$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link ContractVO#contractStatus} property.
   *
   * @param value the default value
   * @return this builder
   */
  public ContractVOBuilder withContractStatus(String value) {
    this.value$contractStatus$java$lang$String = value;
    this.isSet$contractStatus$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link ContractVO#currencyISOCode} property.
   *
   * @param value the default value
   * @return this builder
   */
  public ContractVOBuilder withCurrencyISOCode(String value) {
    this.value$currencyISOCode$java$lang$String = value;
    this.isSet$currencyISOCode$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link ContractVO#priceBook} property.
   *
   * @param value the default value
   * @return this builder
   */
  public ContractVOBuilder withPriceBook(String value) {
    this.value$priceBook$java$lang$String = value;
    this.isSet$priceBook$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link ContractVO#initialContractEnddate} property.
   *
   * @param value the default value
   * @return this builder
   */
  public ContractVOBuilder withInitialContractEnddate(String value) {
    this.value$initialContractEnddate$java$lang$String = value;
    this.isSet$initialContractEnddate$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link ContractVO#autoRenewal} property.
   *
   * @param value the default value
   * @return this builder
   */
  public ContractVOBuilder withAutoRenewal(String value) {
    this.value$autoRenewal$java$lang$String = value;
    this.isSet$autoRenewal$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link ContractVO#renewalTerm} property.
   *
   * @param value the default value
   * @return this builder
   */
  public ContractVOBuilder withRenewalTerm(int value) {
    this.value$renewalTerm$int = value;
    this.isSet$renewalTerm$int = true;
    return self;
  }

  /**
   * Sets the default value for the {@link ContractVO#renewalDays} property.
   *
   * @param value the default value
   * @return this builder
   */
  public ContractVOBuilder withRenewalDays(int value) {
    this.value$renewalDays$int = value;
    this.isSet$renewalDays$int = true;
    return self;
  }

  /**
   * Sets the default value for the {@link ContractVO#billingStreet} property.
   *
   * @param value the default value
   * @return this builder
   */
  public ContractVOBuilder withBillingStreet(String value) {
    this.value$billingStreet$java$lang$String = value;
    this.isSet$billingStreet$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link ContractVO#billingCity} property.
   *
   * @param value the default value
   * @return this builder
   */
  public ContractVOBuilder withBillingCity(String value) {
    this.value$billingCity$java$lang$String = value;
    this.isSet$billingCity$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link ContractVO#billingState} property.
   *
   * @param value the default value
   * @return this builder
   */
  public ContractVOBuilder withBillingState(String value) {
    this.value$billingState$java$lang$String = value;
    this.isSet$billingState$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link ContractVO#billingZip} property.
   *
   * @param value the default value
   * @return this builder
   */
  public ContractVOBuilder withBillingZip(String value) {
    this.value$billingZip$java$lang$String = value;
    this.isSet$billingZip$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link ContractVO#billingCountry} property.
   *
   * @param value the default value
   * @return this builder
   */
  public ContractVOBuilder withBillingCountry(String value) {
    this.value$billingCountry$java$lang$String = value;
    this.isSet$billingCountry$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link ContractVO#shippingStreet} property.
   *
   * @param value the default value
   * @return this builder
   */
  public ContractVOBuilder withShippingStreet(String value) {
    this.value$shippingStreet$java$lang$String = value;
    this.isSet$shippingStreet$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link ContractVO#shippingCity} property.
   *
   * @param value the default value
   * @return this builder
   */
  public ContractVOBuilder withShippingCity(String value) {
    this.value$shippingCity$java$lang$String = value;
    this.isSet$shippingCity$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link ContractVO#shippingState} property.
   *
   * @param value the default value
   * @return this builder
   */
  public ContractVOBuilder withShippingState(String value) {
    this.value$shippingState$java$lang$String = value;
    this.isSet$shippingState$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link ContractVO#shippingZip} property.
   *
   * @param value the default value
   * @return this builder
   */
  public ContractVOBuilder withShippingZip(String value) {
    this.value$shippingZip$java$lang$String = value;
    this.isSet$shippingZip$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link ContractVO#shippingCountry} property.
   *
   * @param value the default value
   * @return this builder
   */
  public ContractVOBuilder withShippingCountry(String value) {
    this.value$shippingCountry$java$lang$String = value;
    this.isSet$shippingCountry$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link ContractVO#billingCompanyName} property.
   *
   * @param value the default value
   * @return this builder
   */
  public ContractVOBuilder withBillingCompanyName(String value) {
    this.value$billingCompanyName$java$lang$String = value;
    this.isSet$billingCompanyName$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link ContractVO#billingContactName} property.
   *
   * @param value the default value
   * @return this builder
   */
  public ContractVOBuilder withBillingContactName(String value) {
    this.value$billingContactName$java$lang$String = value;
    this.isSet$billingContactName$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link ContractVO#billingFirstName} property.
   *
   * @param value the default value
   * @return this builder
   */
  public ContractVOBuilder withBillingFirstName(String value) {
    this.value$billingFirstName$java$lang$String = value;
    this.isSet$billingFirstName$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link ContractVO#billingLastName} property.
   *
   * @param value the default value
   * @return this builder
   */
  public ContractVOBuilder withBillingLastName(String value) {
    this.value$billingLastName$java$lang$String = value;
    this.isSet$billingLastName$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link ContractVO#billingLanguage} property.
   *
   * @param value the default value
   * @return this builder
   */
  public ContractVOBuilder withBillingLanguage(String value) {
    this.value$billingLanguage$java$lang$String = value;
    this.isSet$billingLanguage$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link ContractVO#billingEmail} property.
   *
   * @param value the default value
   * @return this builder
   */
  public ContractVOBuilder withBillingEmail(String value) {
    this.value$billingEmail$java$lang$String = value;
    this.isSet$billingEmail$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link ContractVO#paymentTerms} property.
   *
   * @param value the default value
   * @return this builder
   */
  public ContractVOBuilder withPaymentTerms(String value) {
    this.value$paymentTerms$java$lang$String = value;
    this.isSet$paymentTerms$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link ContractVO#orderPrebillDays} property.
   *
   * @param value the default value
   * @return this builder
   */
  public ContractVOBuilder withOrderPrebillDays(String value) {
    this.value$orderPrebillDays$java$lang$String = value;
    this.isSet$orderPrebillDays$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link ContractVO#billingFrequency} property.
   *
   * @param value the default value
   * @return this builder
   */
  public ContractVOBuilder withBillingFrequency(String value) {
    this.value$billingFrequency$java$lang$String = value;
    this.isSet$billingFrequency$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link ContractVO#billingLanguageCode} property.
   *
   * @param value the default value
   * @return this builder
   */
  public ContractVOBuilder withBillingLanguageCode(String value) {
    this.value$billingLanguageCode$java$lang$String = value;
    this.isSet$billingLanguageCode$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link ContractVO#paymentType} property.
   *
   * @param value the default value
   * @return this builder
   */
  public ContractVOBuilder withPaymentType(String value) {
    this.value$paymentType$java$lang$String = value;
    this.isSet$paymentType$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link ContractVO#VATExemptionReason} property.
   *
   * @param value the default value
   * @return this builder
   */
  public ContractVOBuilder withVATExemptionReason(String value) {
    this.value$VATExemptionReason$java$lang$String = value;
    this.isSet$VATExemptionReason$java$lang$String = true;
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
      ContractVOBuilder result = (ContractVOBuilder)super.clone();
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
  public ContractVOBuilder but() {
    return (ContractVOBuilder)clone();
  }

  /**
   * Creates a new {@link ContractVO} based on this builder's settings.
   *
   * @return the created ContractVO
   */
  public ContractVO build() {
    try {
      ContractVO result = new ContractVO();
      if (isSet$id$java$lang$String) {
        result.id = value$id$java$lang$String;
      }
      if (isSet$owner$java$lang$String) {
        result.owner = value$owner$java$lang$String;
      }
      if (isSet$recordType$java$lang$String) {
        result.recordType = value$recordType$java$lang$String;
      }
      if (isSet$accountName$java$lang$String) {
        result.accountName = value$accountName$java$lang$String;
      }
      if (isSet$contractNumber$java$lang$String) {
        result.contractNumber = value$contractNumber$java$lang$String;
      }
      if (isSet$contractType$java$lang$String) {
        result.contractType = value$contractType$java$lang$String;
      }
      if (isSet$contractStartDate$java$lang$String) {
        result.contractStartDate = value$contractStartDate$java$lang$String;
      }
      if (isSet$contractTerm$java$lang$String) {
        result.contractTerm = value$contractTerm$java$lang$String;
      }
      if (isSet$contractStatus$java$lang$String) {
        result.contractStatus = value$contractStatus$java$lang$String;
      }
      if (isSet$currencyISOCode$java$lang$String) {
        result.currencyISOCode = value$currencyISOCode$java$lang$String;
      }
      if (isSet$priceBook$java$lang$String) {
        result.priceBook = value$priceBook$java$lang$String;
      }
      if (isSet$initialContractEnddate$java$lang$String) {
        result.initialContractEnddate = value$initialContractEnddate$java$lang$String;
      }
      if (isSet$autoRenewal$java$lang$String) {
        result.autoRenewal = value$autoRenewal$java$lang$String;
      }
      if (isSet$renewalTerm$int) {
        result.renewalTerm = value$renewalTerm$int;
      }
      if (isSet$renewalDays$int) {
        result.renewalDays = value$renewalDays$int;
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
      if (isSet$billingCompanyName$java$lang$String) {
        result.billingCompanyName = value$billingCompanyName$java$lang$String;
      }
      if (isSet$billingContactName$java$lang$String) {
        result.billingContactName = value$billingContactName$java$lang$String;
      }
      if (isSet$billingFirstName$java$lang$String) {
        result.billingFirstName = value$billingFirstName$java$lang$String;
      }
      if (isSet$billingLastName$java$lang$String) {
        result.billingLastName = value$billingLastName$java$lang$String;
      }
      if (isSet$billingLanguage$java$lang$String) {
        result.billingLanguage = value$billingLanguage$java$lang$String;
      }
      if (isSet$billingEmail$java$lang$String) {
        result.billingEmail = value$billingEmail$java$lang$String;
      }
      if (isSet$paymentTerms$java$lang$String) {
        result.paymentTerms = value$paymentTerms$java$lang$String;
      }
      if (isSet$orderPrebillDays$java$lang$String) {
        result.orderPrebillDays = value$orderPrebillDays$java$lang$String;
      }
      if (isSet$billingFrequency$java$lang$String) {
        result.billingFrequency = value$billingFrequency$java$lang$String;
      }
      if (isSet$billingLanguageCode$java$lang$String) {
        result.billingLanguageCode = value$billingLanguageCode$java$lang$String;
      }
      if (isSet$paymentType$java$lang$String) {
        result.paymentType = value$paymentType$java$lang$String;
      }
      if (isSet$VATExemptionReason$java$lang$String) {
        result.VATExemptionReason = value$VATExemptionReason$java$lang$String;
      }
      return result;
    } catch (RuntimeException ex) {
      throw ex;
    } catch (Exception ex) {
      throw new RuntimeException(ex);
    }
  }
}
