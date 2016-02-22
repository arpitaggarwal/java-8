package com.test.so.solutions;

import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupList {
	public static void main(String[] args) {
		List<MoveTrack> mveTracking = new ArrayList<>();
		mveTracking.add(new MoveTrack(new Date(), 10.0d));
		mveTracking.add(new MoveTrack(new Date(), 11.0d));
		Map<String, Double> movMap = new HashMap<>();
		movMap = mveTracking.stream().collect(Collectors.groupingBy(m -> {
			final Calendar cal = Calendar.getInstance();
			cal.setTime(m.getTime());
			final int month = cal.get(Calendar.MONTH);
			return new DateFormatSymbols().getMonths()[month];
		}, Collectors.summingDouble(MoveTrack::getMovementAmount)));
		System.out.println(movMap);
	}
}

final class MoveTrack {

	private final Date time;
	private final Double movementAmount;

	public MoveTrack(final Date time, final Double movementAmount) {
		this.time = new Date(time.getTime());
		this.movementAmount = movementAmount;
	}

	public Date getTime() {
		return time;
	}

	public Double getMovementAmount() {
		return movementAmount;
	}
}
