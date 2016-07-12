package com.paypal.api.payments;

import com.paypal.base.rest.PayPalModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class TemplateSettingsMetadata extends PayPalModel {

	/**
	 * Indicates whether this field should be hidden. default is false
	 */
	private Boolean hidden;

	/**
	 * Default Constructor
	 */
	public TemplateSettingsMetadata() {
	}

}
