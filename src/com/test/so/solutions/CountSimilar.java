package com.test.so.solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

final class SearchList {
	private final String area;
	private final String location;

	public SearchList(String area, String location) {
		this.area = area;
		this.location = location;
	}

	public String getArea() {
		return area;
	}

	@Override
	public String toString() {
		return "SearchList [area=" + area + ", location=" + location + "]";
	}

	public String getLocation() {
		return location;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((area == null) ? 0 : area.hashCode());
		result = prime * result
				+ ((location == null) ? 0 : location.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SearchList other = (SearchList) obj;
		if (area == null) {
			if (other.area != null)
				return false;
		} else if (!area.equals(other.area))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		return true;
	}

}

public class CountSimilar {
	public static void main(String[] args) {

		List<SearchList> searchListList = new ArrayList<>();
		searchListList.add(new SearchList("A", "India"));
		searchListList.add(new SearchList("B", "India"));
		searchListList.add(new SearchList("A", "India"));
		searchListList.add(new SearchList("A", "USA"));
		searchListList.add(new SearchList("A", "USA"));

		int countSimilar = (int) searchListList.stream().distinct().count();

		System.out.println(countSimilar);

		int countSimilarByArea = searchListList
				.stream()
				.collect(
						Collectors.toCollection(() -> new TreeSet<SearchList>((
								p1, p2) -> p1.getArea().compareTo(p2.getArea()))))
				.size();
		System.out.println(countSimilarByArea);

		int countSimilarByLocation = searchListList
				.stream()
				.collect(
						Collectors.toCollection(() -> new TreeSet<SearchList>((
								p1, p2) -> p1.getLocation().compareTo(
								p2.getLocation())))).size();

		System.out.println(countSimilarByLocation);
	}
}
