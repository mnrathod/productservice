package demo.product.domain;

import lombok.Data;

@Data
public class Address {
		private String addLine1;
		private String addLine2;
		private int cityId;
		private int stateId;
		private int countyId;
		private int pincode;
}
