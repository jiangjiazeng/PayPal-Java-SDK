package com.paypal.api.payments;

import com.paypal.base.rest.PayPalModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class ShippingCost extends PayPalModel {

	/**
	 * The shipping cost, as an amount. Valid range is from 0 to 999999.99.
	 */
	private Currency amount;

	/**
	 * The tax percentage on the shipping amount.
	 */
	private Tax tax;

	/**
	 * Default Constructor
	 */
	public ShippingCost() {
	}
}
