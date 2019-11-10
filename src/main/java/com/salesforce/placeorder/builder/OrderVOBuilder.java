package com.salesforce.placeorder.builder;

import com.salesforce.placeorder.vo.OrderVO;
import javax.annotation.Generated;
import net.karneim.pojobuilder.GwtIncompatible;

@Generated("PojoBuilder")
public class OrderVOBuilder
    implements Cloneable {
  protected OrderVOBuilder self;
  protected String value$id$java$lang$String;
  protected boolean isSet$id$java$lang$String;
  protected String value$owner$java$lang$String;
  protected boolean isSet$owner$java$lang$String;
  protected String value$recordType$java$lang$String;
  protected boolean isSet$recordType$java$lang$String;
  protected String value$currencyISOCode$java$lang$String;
  protected boolean isSet$currencyISOCode$java$lang$String;
  protected String value$accountName$java$lang$String;
  protected boolean isSet$accountName$java$lang$String;
  protected String value$contractNumber$java$lang$String;
  protected boolean isSet$contractNumber$java$lang$String;
  protected String value$orderStartDate$java$lang$String;
  protected boolean isSet$orderStartDate$java$lang$String;
  protected String value$orderEndDate$java$lang$String;
  protected boolean isSet$orderEndDate$java$lang$String;
  protected String value$orderTerm$java$lang$String;
  protected boolean isSet$orderTerm$java$lang$String;
  protected String value$orderStatus$java$lang$String;
  protected boolean isSet$orderStatus$java$lang$String;
  protected String value$customerPoRequired$java$lang$String;
  protected boolean isSet$customerPoRequired$java$lang$String;
  protected String value$opportunityName$java$lang$String;
  protected boolean isSet$opportunityName$java$lang$String;
  protected String value$poNumber$java$lang$String;
  protected boolean isSet$poNumber$java$lang$String;
  protected String value$poAmount$java$lang$String;
  protected boolean isSet$poAmount$java$lang$String;
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
  protected String value$orderType$java$lang$String;
  protected boolean isSet$orderType$java$lang$String;
  protected String value$orderSubtype$java$lang$String;
  protected boolean isSet$orderSubtype$java$lang$String;
  protected String value$commissionStatus$java$lang$String;
  protected boolean isSet$commissionStatus$java$lang$String;
  protected String value$commissionProcessingMessage$java$lang$String;
  protected boolean isSet$commissionProcessingMessage$java$lang$String;
  protected String value$orderTeamStatus$java$lang$String;
  protected boolean isSet$orderTeamStatus$java$lang$String;
  protected String value$orderTeamMessage$java$lang$String;
  protected boolean isSet$orderTeamMessage$java$lang$String;
  protected boolean value$markForOrderTeamCreate$boolean;
  protected boolean isSet$markForOrderTeamCreate$boolean;
  protected boolean value$doNotCommission$boolean;
  protected boolean isSet$doNotCommission$boolean;
  protected boolean value$evaluateRamp$boolean;
  protected boolean isSet$evaluateRamp$boolean;
  protected String value$incrementalAcvPercent$java$lang$String;
  protected boolean isSet$incrementalAcvPercent$java$lang$String;
  protected String value$aePercent$java$lang$String;
  protected boolean isSet$aePercent$java$lang$String;
  protected String value$rmPercent$java$lang$String;
  protected boolean isSet$rmPercent$java$lang$String;
  protected String value$cashMovement$java$lang$String;
  protected boolean isSet$cashMovement$java$lang$String;
  protected String value$cmCode$java$lang$String;
  protected boolean isSet$cmCode$java$lang$String;
  protected String value$cmReason$java$lang$String;
  protected boolean isSet$cmReason$java$lang$String;
  protected String value$orderCommissionType$java$lang$String;
  protected boolean isSet$orderCommissionType$java$lang$String;
  protected String value$orderCommissionSubType$java$lang$String;
  protected boolean isSet$orderCommissionSubType$java$lang$String;
  protected String value$replacementOrderNumber$java$lang$String;
  protected boolean isSet$replacementOrderNumber$java$lang$String;
  protected String value$rampStatus$java$lang$String;
  protected boolean isSet$rampStatus$java$lang$String;
  protected boolean value$priceRamp$boolean;
  protected boolean isSet$priceRamp$boolean;
  protected String value$ramp$java$lang$String;
  protected boolean isSet$ramp$java$lang$String;
  protected String value$priceRampEndDate$java$lang$String;
  protected boolean isSet$priceRampEndDate$java$lang$String;
  protected String value$initialPriceRampOrder$java$lang$String;
  protected boolean isSet$initialPriceRampOrder$java$lang$String;
  protected boolean value$rampProcessHold$boolean;
  protected boolean isSet$rampProcessHold$boolean;
  protected String value$priorPriceRampOrder$java$lang$String;
  protected boolean isSet$priorPriceRampOrder$java$lang$String;
  protected String value$nextPriceRampOrder$java$lang$String;
  protected boolean isSet$nextPriceRampOrder$java$lang$String;
  protected String value$rampDealPrior$java$lang$String;
  protected boolean isSet$rampDealPrior$java$lang$String;
  protected String value$rampDealNext$java$lang$String;
  protected boolean isSet$rampDealNext$java$lang$String;
  protected String value$rampProcessingMessage$java$lang$String;
  protected boolean isSet$rampProcessingMessage$java$lang$String;
  protected String value$orderNumber$java$lang$String;
  protected boolean isSet$orderNumber$java$lang$String;
  protected String value$reductionOrderCommissionType$java$lang$String;
  protected boolean isSet$reductionOrderCommissionType$java$lang$String;
  protected String value$reductionOrderCommissionSubtype$java$lang$String;
  protected boolean isSet$reductionOrderCommissionSubtype$java$lang$String;

  /**
   * Creates a new {@link OrderVOBuilder}.
   */
  public OrderVOBuilder() {
    self = this;
  }

  /**
   * Sets the default value for the {@link OrderVO#id} property.
   *
   * @param value the default value
   * @return this builder
   */
  public OrderVOBuilder withId(String value) {
    this.value$id$java$lang$String = value;
    this.isSet$id$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link OrderVO#owner} property.
   *
   * @param value the default value
   * @return this builder
   */
  public OrderVOBuilder withOwner(String value) {
    this.value$owner$java$lang$String = value;
    this.isSet$owner$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link OrderVO#recordType} property.
   *
   * @param value the default value
   * @return this builder
   */
  public OrderVOBuilder withRecordType(String value) {
    this.value$recordType$java$lang$String = value;
    this.isSet$recordType$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link OrderVO#currencyISOCode} property.
   *
   * @param value the default value
   * @return this builder
   */
  public OrderVOBuilder withCurrencyISOCode(String value) {
    this.value$currencyISOCode$java$lang$String = value;
    this.isSet$currencyISOCode$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link OrderVO#accountName} property.
   *
   * @param value the default value
   * @return this builder
   */
  public OrderVOBuilder withAccountName(String value) {
    this.value$accountName$java$lang$String = value;
    this.isSet$accountName$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link OrderVO#contractNumber} property.
   *
   * @param value the default value
   * @return this builder
   */
  public OrderVOBuilder withContractNumber(String value) {
    this.value$contractNumber$java$lang$String = value;
    this.isSet$contractNumber$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link OrderVO#orderStartDate} property.
   *
   * @param value the default value
   * @return this builder
   */
  public OrderVOBuilder withOrderStartDate(String value) {
    this.value$orderStartDate$java$lang$String = value;
    this.isSet$orderStartDate$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link OrderVO#orderEndDate} property.
   *
   * @param value the default value
   * @return this builder
   */
  public OrderVOBuilder withOrderEndDate(String value) {
    this.value$orderEndDate$java$lang$String = value;
    this.isSet$orderEndDate$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link OrderVO#orderTerm} property.
   *
   * @param value the default value
   * @return this builder
   */
  public OrderVOBuilder withOrderTerm(String value) {
    this.value$orderTerm$java$lang$String = value;
    this.isSet$orderTerm$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link OrderVO#orderStatus} property.
   *
   * @param value the default value
   * @return this builder
   */
  public OrderVOBuilder withOrderStatus(String value) {
    this.value$orderStatus$java$lang$String = value;
    this.isSet$orderStatus$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link OrderVO#customerPoRequired} property.
   *
   * @param value the default value
   * @return this builder
   */
  public OrderVOBuilder withCustomerPoRequired(String value) {
    this.value$customerPoRequired$java$lang$String = value;
    this.isSet$customerPoRequired$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link OrderVO#opportunityName} property.
   *
   * @param value the default value
   * @return this builder
   */
  public OrderVOBuilder withOpportunityName(String value) {
    this.value$opportunityName$java$lang$String = value;
    this.isSet$opportunityName$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link OrderVO#poNumber} property.
   *
   * @param value the default value
   * @return this builder
   */
  public OrderVOBuilder withPoNumber(String value) {
    this.value$poNumber$java$lang$String = value;
    this.isSet$poNumber$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link OrderVO#poAmount} property.
   *
   * @param value the default value
   * @return this builder
   */
  public OrderVOBuilder withPoAmount(String value) {
    this.value$poAmount$java$lang$String = value;
    this.isSet$poAmount$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link OrderVO#shippingStreet} property.
   *
   * @param value the default value
   * @return this builder
   */
  public OrderVOBuilder withShippingStreet(String value) {
    this.value$shippingStreet$java$lang$String = value;
    this.isSet$shippingStreet$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link OrderVO#shippingCity} property.
   *
   * @param value the default value
   * @return this builder
   */
  public OrderVOBuilder withShippingCity(String value) {
    this.value$shippingCity$java$lang$String = value;
    this.isSet$shippingCity$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link OrderVO#shippingState} property.
   *
   * @param value the default value
   * @return this builder
   */
  public OrderVOBuilder withShippingState(String value) {
    this.value$shippingState$java$lang$String = value;
    this.isSet$shippingState$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link OrderVO#shippingZip} property.
   *
   * @param value the default value
   * @return this builder
   */
  public OrderVOBuilder withShippingZip(String value) {
    this.value$shippingZip$java$lang$String = value;
    this.isSet$shippingZip$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link OrderVO#shippingCountry} property.
   *
   * @param value the default value
   * @return this builder
   */
  public OrderVOBuilder withShippingCountry(String value) {
    this.value$shippingCountry$java$lang$String = value;
    this.isSet$shippingCountry$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link OrderVO#orderType} property.
   *
   * @param value the default value
   * @return this builder
   */
  public OrderVOBuilder withOrderType(String value) {
    this.value$orderType$java$lang$String = value;
    this.isSet$orderType$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link OrderVO#orderSubtype} property.
   *
   * @param value the default value
   * @return this builder
   */
  public OrderVOBuilder withOrderSubtype(String value) {
    this.value$orderSubtype$java$lang$String = value;
    this.isSet$orderSubtype$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link OrderVO#commissionStatus} property.
   *
   * @param value the default value
   * @return this builder
   */
  public OrderVOBuilder withCommissionStatus(String value) {
    this.value$commissionStatus$java$lang$String = value;
    this.isSet$commissionStatus$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link OrderVO#commissionProcessingMessage} property.
   *
   * @param value the default value
   * @return this builder
   */
  public OrderVOBuilder withCommissionProcessingMessage(String value) {
    this.value$commissionProcessingMessage$java$lang$String = value;
    this.isSet$commissionProcessingMessage$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link OrderVO#orderTeamStatus} property.
   *
   * @param value the default value
   * @return this builder
   */
  public OrderVOBuilder withOrderTeamStatus(String value) {
    this.value$orderTeamStatus$java$lang$String = value;
    this.isSet$orderTeamStatus$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link OrderVO#orderTeamMessage} property.
   *
   * @param value the default value
   * @return this builder
   */
  public OrderVOBuilder withOrderTeamMessage(String value) {
    this.value$orderTeamMessage$java$lang$String = value;
    this.isSet$orderTeamMessage$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link OrderVO#markForOrderTeamCreate} property.
   *
   * @param value the default value
   * @return this builder
   */
  public OrderVOBuilder withMarkForOrderTeamCreate(boolean value) {
    this.value$markForOrderTeamCreate$boolean = value;
    this.isSet$markForOrderTeamCreate$boolean = true;
    return self;
  }

  /**
   * Sets the default value for the {@link OrderVO#doNotCommission} property.
   *
   * @param value the default value
   * @return this builder
   */
  public OrderVOBuilder withDoNotCommission(boolean value) {
    this.value$doNotCommission$boolean = value;
    this.isSet$doNotCommission$boolean = true;
    return self;
  }

  /**
   * Sets the default value for the {@link OrderVO#evaluateRamp} property.
   *
   * @param value the default value
   * @return this builder
   */
  public OrderVOBuilder withEvaluateRamp(boolean value) {
    this.value$evaluateRamp$boolean = value;
    this.isSet$evaluateRamp$boolean = true;
    return self;
  }

  /**
   * Sets the default value for the {@link OrderVO#incrementalAcvPercent} property.
   *
   * @param value the default value
   * @return this builder
   */
  public OrderVOBuilder withIncrementalAcvPercent(String value) {
    this.value$incrementalAcvPercent$java$lang$String = value;
    this.isSet$incrementalAcvPercent$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link OrderVO#aePercent} property.
   *
   * @param value the default value
   * @return this builder
   */
  public OrderVOBuilder withAePercent(String value) {
    this.value$aePercent$java$lang$String = value;
    this.isSet$aePercent$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link OrderVO#rmPercent} property.
   *
   * @param value the default value
   * @return this builder
   */
  public OrderVOBuilder withRmPercent(String value) {
    this.value$rmPercent$java$lang$String = value;
    this.isSet$rmPercent$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link OrderVO#cashMovement} property.
   *
   * @param value the default value
   * @return this builder
   */
  public OrderVOBuilder withCashMovement(String value) {
    this.value$cashMovement$java$lang$String = value;
    this.isSet$cashMovement$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link OrderVO#cmCode} property.
   *
   * @param value the default value
   * @return this builder
   */
  public OrderVOBuilder withCmCode(String value) {
    this.value$cmCode$java$lang$String = value;
    this.isSet$cmCode$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link OrderVO#cmReason} property.
   *
   * @param value the default value
   * @return this builder
   */
  public OrderVOBuilder withCmReason(String value) {
    this.value$cmReason$java$lang$String = value;
    this.isSet$cmReason$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link OrderVO#orderCommissionType} property.
   *
   * @param value the default value
   * @return this builder
   */
  public OrderVOBuilder withOrderCommissionType(String value) {
    this.value$orderCommissionType$java$lang$String = value;
    this.isSet$orderCommissionType$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link OrderVO#orderCommissionSubType} property.
   *
   * @param value the default value
   * @return this builder
   */
  public OrderVOBuilder withOrderCommissionSubType(String value) {
    this.value$orderCommissionSubType$java$lang$String = value;
    this.isSet$orderCommissionSubType$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link OrderVO#replacementOrderNumber} property.
   *
   * @param value the default value
   * @return this builder
   */
  public OrderVOBuilder withReplacementOrderNumber(String value) {
    this.value$replacementOrderNumber$java$lang$String = value;
    this.isSet$replacementOrderNumber$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link OrderVO#rampStatus} property.
   *
   * @param value the default value
   * @return this builder
   */
  public OrderVOBuilder withRampStatus(String value) {
    this.value$rampStatus$java$lang$String = value;
    this.isSet$rampStatus$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link OrderVO#priceRamp} property.
   *
   * @param value the default value
   * @return this builder
   */
  public OrderVOBuilder withPriceRamp(boolean value) {
    this.value$priceRamp$boolean = value;
    this.isSet$priceRamp$boolean = true;
    return self;
  }

  /**
   * Sets the default value for the {@link OrderVO#ramp} property.
   *
   * @param value the default value
   * @return this builder
   */
  public OrderVOBuilder withRamp(String value) {
    this.value$ramp$java$lang$String = value;
    this.isSet$ramp$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link OrderVO#priceRampEndDate} property.
   *
   * @param value the default value
   * @return this builder
   */
  public OrderVOBuilder withPriceRampEndDate(String value) {
    this.value$priceRampEndDate$java$lang$String = value;
    this.isSet$priceRampEndDate$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link OrderVO#initialPriceRampOrder} property.
   *
   * @param value the default value
   * @return this builder
   */
  public OrderVOBuilder withInitialPriceRampOrder(String value) {
    this.value$initialPriceRampOrder$java$lang$String = value;
    this.isSet$initialPriceRampOrder$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link OrderVO#rampProcessHold} property.
   *
   * @param value the default value
   * @return this builder
   */
  public OrderVOBuilder withRampProcessHold(boolean value) {
    this.value$rampProcessHold$boolean = value;
    this.isSet$rampProcessHold$boolean = true;
    return self;
  }

  /**
   * Sets the default value for the {@link OrderVO#priorPriceRampOrder} property.
   *
   * @param value the default value
   * @return this builder
   */
  public OrderVOBuilder withPriorPriceRampOrder(String value) {
    this.value$priorPriceRampOrder$java$lang$String = value;
    this.isSet$priorPriceRampOrder$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link OrderVO#nextPriceRampOrder} property.
   *
   * @param value the default value
   * @return this builder
   */
  public OrderVOBuilder withNextPriceRampOrder(String value) {
    this.value$nextPriceRampOrder$java$lang$String = value;
    this.isSet$nextPriceRampOrder$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link OrderVO#rampDealPrior} property.
   *
   * @param value the default value
   * @return this builder
   */
  public OrderVOBuilder withRampDealPrior(String value) {
    this.value$rampDealPrior$java$lang$String = value;
    this.isSet$rampDealPrior$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link OrderVO#rampDealNext} property.
   *
   * @param value the default value
   * @return this builder
   */
  public OrderVOBuilder withRampDealNext(String value) {
    this.value$rampDealNext$java$lang$String = value;
    this.isSet$rampDealNext$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link OrderVO#rampProcessingMessage} property.
   *
   * @param value the default value
   * @return this builder
   */
  public OrderVOBuilder withRampProcessingMessage(String value) {
    this.value$rampProcessingMessage$java$lang$String = value;
    this.isSet$rampProcessingMessage$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link OrderVO#orderNumber} property.
   *
   * @param value the default value
   * @return this builder
   */
  public OrderVOBuilder withOrderNumber(String value) {
    this.value$orderNumber$java$lang$String = value;
    this.isSet$orderNumber$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link OrderVO#reductionOrderCommissionType} property.
   *
   * @param value the default value
   * @return this builder
   */
  public OrderVOBuilder withReductionOrderCommissionType(String value) {
    this.value$reductionOrderCommissionType$java$lang$String = value;
    this.isSet$reductionOrderCommissionType$java$lang$String = true;
    return self;
  }

  /**
   * Sets the default value for the {@link OrderVO#reductionOrderCommissionSubtype} property.
   *
   * @param value the default value
   * @return this builder
   */
  public OrderVOBuilder withReductionOrderCommissionSubtype(String value) {
    this.value$reductionOrderCommissionSubtype$java$lang$String = value;
    this.isSet$reductionOrderCommissionSubtype$java$lang$String = true;
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
      OrderVOBuilder result = (OrderVOBuilder)super.clone();
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
  public OrderVOBuilder but() {
    return (OrderVOBuilder)clone();
  }

  /**
   * Creates a new {@link OrderVO} based on this builder's settings.
   *
   * @return the created OrderVO
   */
  public OrderVO build() {
    try {
      OrderVO result = new OrderVO();
      if (isSet$id$java$lang$String) {
        result.id = value$id$java$lang$String;
      }
      if (isSet$owner$java$lang$String) {
        result.owner = value$owner$java$lang$String;
      }
      if (isSet$recordType$java$lang$String) {
        result.recordType = value$recordType$java$lang$String;
      }
      if (isSet$currencyISOCode$java$lang$String) {
        result.currencyISOCode = value$currencyISOCode$java$lang$String;
      }
      if (isSet$accountName$java$lang$String) {
        result.accountName = value$accountName$java$lang$String;
      }
      if (isSet$contractNumber$java$lang$String) {
        result.contractNumber = value$contractNumber$java$lang$String;
      }
      if (isSet$orderStartDate$java$lang$String) {
        result.orderStartDate = value$orderStartDate$java$lang$String;
      }
      if (isSet$orderEndDate$java$lang$String) {
        result.orderEndDate = value$orderEndDate$java$lang$String;
      }
      if (isSet$orderTerm$java$lang$String) {
        result.orderTerm = value$orderTerm$java$lang$String;
      }
      if (isSet$orderStatus$java$lang$String) {
        result.orderStatus = value$orderStatus$java$lang$String;
      }
      if (isSet$customerPoRequired$java$lang$String) {
        result.customerPoRequired = value$customerPoRequired$java$lang$String;
      }
      if (isSet$opportunityName$java$lang$String) {
        result.opportunityName = value$opportunityName$java$lang$String;
      }
      if (isSet$poNumber$java$lang$String) {
        result.poNumber = value$poNumber$java$lang$String;
      }
      if (isSet$poAmount$java$lang$String) {
        result.poAmount = value$poAmount$java$lang$String;
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
      if (isSet$orderType$java$lang$String) {
        result.orderType = value$orderType$java$lang$String;
      }
      if (isSet$orderSubtype$java$lang$String) {
        result.orderSubtype = value$orderSubtype$java$lang$String;
      }
      if (isSet$commissionStatus$java$lang$String) {
        result.commissionStatus = value$commissionStatus$java$lang$String;
      }
      if (isSet$commissionProcessingMessage$java$lang$String) {
        result.commissionProcessingMessage = value$commissionProcessingMessage$java$lang$String;
      }
      if (isSet$orderTeamStatus$java$lang$String) {
        result.orderTeamStatus = value$orderTeamStatus$java$lang$String;
      }
      if (isSet$orderTeamMessage$java$lang$String) {
        result.orderTeamMessage = value$orderTeamMessage$java$lang$String;
      }
      if (isSet$markForOrderTeamCreate$boolean) {
        result.markForOrderTeamCreate = value$markForOrderTeamCreate$boolean;
      }
      if (isSet$doNotCommission$boolean) {
        result.doNotCommission = value$doNotCommission$boolean;
      }
      if (isSet$evaluateRamp$boolean) {
        result.evaluateRamp = value$evaluateRamp$boolean;
      }
      if (isSet$incrementalAcvPercent$java$lang$String) {
        result.incrementalAcvPercent = value$incrementalAcvPercent$java$lang$String;
      }
      if (isSet$aePercent$java$lang$String) {
        result.aePercent = value$aePercent$java$lang$String;
      }
      if (isSet$rmPercent$java$lang$String) {
        result.rmPercent = value$rmPercent$java$lang$String;
      }
      if (isSet$cashMovement$java$lang$String) {
        result.cashMovement = value$cashMovement$java$lang$String;
      }
      if (isSet$cmCode$java$lang$String) {
        result.cmCode = value$cmCode$java$lang$String;
      }
      if (isSet$cmReason$java$lang$String) {
        result.cmReason = value$cmReason$java$lang$String;
      }
      if (isSet$orderCommissionType$java$lang$String) {
        result.orderCommissionType = value$orderCommissionType$java$lang$String;
      }
      if (isSet$orderCommissionSubType$java$lang$String) {
        result.orderCommissionSubType = value$orderCommissionSubType$java$lang$String;
      }
      if (isSet$replacementOrderNumber$java$lang$String) {
        result.replacementOrderNumber = value$replacementOrderNumber$java$lang$String;
      }
      if (isSet$rampStatus$java$lang$String) {
        result.rampStatus = value$rampStatus$java$lang$String;
      }
      if (isSet$priceRamp$boolean) {
        result.priceRamp = value$priceRamp$boolean;
      }
      if (isSet$ramp$java$lang$String) {
        result.ramp = value$ramp$java$lang$String;
      }
      if (isSet$priceRampEndDate$java$lang$String) {
        result.priceRampEndDate = value$priceRampEndDate$java$lang$String;
      }
      if (isSet$initialPriceRampOrder$java$lang$String) {
        result.initialPriceRampOrder = value$initialPriceRampOrder$java$lang$String;
      }
      if (isSet$rampProcessHold$boolean) {
        result.rampProcessHold = value$rampProcessHold$boolean;
      }
      if (isSet$priorPriceRampOrder$java$lang$String) {
        result.priorPriceRampOrder = value$priorPriceRampOrder$java$lang$String;
      }
      if (isSet$nextPriceRampOrder$java$lang$String) {
        result.nextPriceRampOrder = value$nextPriceRampOrder$java$lang$String;
      }
      if (isSet$rampDealPrior$java$lang$String) {
        result.rampDealPrior = value$rampDealPrior$java$lang$String;
      }
      if (isSet$rampDealNext$java$lang$String) {
        result.rampDealNext = value$rampDealNext$java$lang$String;
      }
      if (isSet$rampProcessingMessage$java$lang$String) {
        result.rampProcessingMessage = value$rampProcessingMessage$java$lang$String;
      }
      if (isSet$orderNumber$java$lang$String) {
        result.orderNumber = value$orderNumber$java$lang$String;
      }
      if (isSet$reductionOrderCommissionType$java$lang$String) {
        result.reductionOrderCommissionType = value$reductionOrderCommissionType$java$lang$String;
      }
      if (isSet$reductionOrderCommissionSubtype$java$lang$String) {
        result.reductionOrderCommissionSubtype = value$reductionOrderCommissionSubtype$java$lang$String;
      }
      return result;
    } catch (RuntimeException ex) {
      throw ex;
    } catch (Exception ex) {
      throw new RuntimeException(ex);
    }
  }
}
