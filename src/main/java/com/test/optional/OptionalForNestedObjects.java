package com.test.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalForNestedObjects {

	public static void main(String[] args) {

		StringBuilder stringBuilder = new StringBuilder();

		Country country = new Country();
		City city = new City();
		List<String> address = new ArrayList<String>();
		address.add("Address");
		city.setAddress(address);
		country.setCity(city);
		
		Optional<List<String>> option = Optional.of(country)
				.map(Country::getCity).map(City::getAddress);

		option.ifPresent(e -> stringBuilder.append(option.get().get(0)));

		System.out.println(stringBuilder.toString());

	}
}
